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
 * The abstract condition-query of T_TRFLEXIBILITYPRODUCT.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTTrflexibilityproductCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTTrflexibilityproductCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "T_TRFLEXIBILITYPRODUCT";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRFLEXIBILITYPRODUCT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trflexibilityproductId The value of trflexibilityproductId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrflexibilityproductId_Equal(Long trflexibilityproductId) {
        doSetTrflexibilityproductId_Equal(trflexibilityproductId);
    }

    protected void doSetTrflexibilityproductId_Equal(Long trflexibilityproductId) {
        regTrflexibilityproductId(CK_EQ, trflexibilityproductId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRFLEXIBILITYPRODUCT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trflexibilityproductId The value of trflexibilityproductId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrflexibilityproductId_NotEqual(Long trflexibilityproductId) {
        doSetTrflexibilityproductId_NotEqual(trflexibilityproductId);
    }

    protected void doSetTrflexibilityproductId_NotEqual(Long trflexibilityproductId) {
        regTrflexibilityproductId(CK_NES, trflexibilityproductId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRFLEXIBILITYPRODUCT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trflexibilityproductId The value of trflexibilityproductId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrflexibilityproductId_GreaterThan(Long trflexibilityproductId) {
        regTrflexibilityproductId(CK_GT, trflexibilityproductId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRFLEXIBILITYPRODUCT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trflexibilityproductId The value of trflexibilityproductId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrflexibilityproductId_LessThan(Long trflexibilityproductId) {
        regTrflexibilityproductId(CK_LT, trflexibilityproductId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRFLEXIBILITYPRODUCT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trflexibilityproductId The value of trflexibilityproductId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrflexibilityproductId_GreaterEqual(Long trflexibilityproductId) {
        regTrflexibilityproductId(CK_GE, trflexibilityproductId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRFLEXIBILITYPRODUCT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trflexibilityproductId The value of trflexibilityproductId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrflexibilityproductId_LessEqual(Long trflexibilityproductId) {
        regTrflexibilityproductId(CK_LE, trflexibilityproductId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TRFLEXIBILITYPRODUCT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of trflexibilityproductId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of trflexibilityproductId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTrflexibilityproductId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTrflexibilityproductId(), "TRFLEXIBILITYPRODUCT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRFLEXIBILITYPRODUCT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trflexibilityproductIdList The collection of trflexibilityproductId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrflexibilityproductId_InScope(Collection<Long> trflexibilityproductIdList) {
        doSetTrflexibilityproductId_InScope(trflexibilityproductIdList);
    }

    protected void doSetTrflexibilityproductId_InScope(Collection<Long> trflexibilityproductIdList) {
        regINS(CK_INS, cTL(trflexibilityproductIdList), xgetCValueTrflexibilityproductId(), "TRFLEXIBILITYPRODUCT_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRFLEXIBILITYPRODUCT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trflexibilityproductIdList The collection of trflexibilityproductId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrflexibilityproductId_NotInScope(Collection<Long> trflexibilityproductIdList) {
        doSetTrflexibilityproductId_NotInScope(trflexibilityproductIdList);
    }

    protected void doSetTrflexibilityproductId_NotInScope(Collection<Long> trflexibilityproductIdList) {
        regINS(CK_NINS, cTL(trflexibilityproductIdList), xgetCValueTrflexibilityproductId(), "TRFLEXIBILITYPRODUCT_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TRFLEXIBILITYPRODUCT_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setTrflexibilityproductId_IsNull() { regTrflexibilityproductId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TRFLEXIBILITYPRODUCT_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setTrflexibilityproductId_IsNotNull() { regTrflexibilityproductId(CK_ISNN, DOBJ); }

    protected void regTrflexibilityproductId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTrflexibilityproductId(), "TRFLEXIBILITYPRODUCT_ID"); }
    protected abstract ConditionValue xgetCValueTrflexibilityproductId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLIERCD: {NotNull, varchar(30)}
     * @param suppliercd The value of suppliercd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSuppliercd_Equal(String suppliercd) {
        doSetSuppliercd_Equal(fRES(suppliercd));
    }

    protected void doSetSuppliercd_Equal(String suppliercd) {
        regSuppliercd(CK_EQ, suppliercd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLIERCD: {NotNull, varchar(30)}
     * @param suppliercd The value of suppliercd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSuppliercd_NotEqual(String suppliercd) {
        doSetSuppliercd_NotEqual(fRES(suppliercd));
    }

    protected void doSetSuppliercd_NotEqual(String suppliercd) {
        regSuppliercd(CK_NES, suppliercd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLIERCD: {NotNull, varchar(30)}
     * @param suppliercd The value of suppliercd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSuppliercd_GreaterThan(String suppliercd) {
        regSuppliercd(CK_GT, fRES(suppliercd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLIERCD: {NotNull, varchar(30)}
     * @param suppliercd The value of suppliercd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSuppliercd_LessThan(String suppliercd) {
        regSuppliercd(CK_LT, fRES(suppliercd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLIERCD: {NotNull, varchar(30)}
     * @param suppliercd The value of suppliercd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSuppliercd_GreaterEqual(String suppliercd) {
        regSuppliercd(CK_GE, fRES(suppliercd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLIERCD: {NotNull, varchar(30)}
     * @param suppliercd The value of suppliercd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSuppliercd_LessEqual(String suppliercd) {
        regSuppliercd(CK_LE, fRES(suppliercd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SUPPLIERCD: {NotNull, varchar(30)}
     * @param suppliercdList The collection of suppliercd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSuppliercd_InScope(Collection<String> suppliercdList) {
        doSetSuppliercd_InScope(suppliercdList);
    }

    protected void doSetSuppliercd_InScope(Collection<String> suppliercdList) {
        regINS(CK_INS, cTL(suppliercdList), xgetCValueSuppliercd(), "SUPPLIERCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SUPPLIERCD: {NotNull, varchar(30)}
     * @param suppliercdList The collection of suppliercd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSuppliercd_NotInScope(Collection<String> suppliercdList) {
        doSetSuppliercd_NotInScope(suppliercdList);
    }

    protected void doSetSuppliercd_NotInScope(Collection<String> suppliercdList) {
        regINS(CK_NINS, cTL(suppliercdList), xgetCValueSuppliercd(), "SUPPLIERCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SUPPLIERCD: {NotNull, varchar(30)} <br>
     * <pre>e.g. setSuppliercd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param suppliercd The value of suppliercd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSuppliercd_LikeSearch(String suppliercd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(suppliercd), xgetCValueSuppliercd(), "SUPPLIERCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SUPPLIERCD: {NotNull, varchar(30)}
     * @param suppliercd The value of suppliercd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSuppliercd_NotLikeSearch(String suppliercd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(suppliercd), xgetCValueSuppliercd(), "SUPPLIERCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SUPPLIERCD: {NotNull, varchar(30)}
     * @param suppliercd The value of suppliercd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSuppliercd_PrefixSearch(String suppliercd) {
        setSuppliercd_LikeSearch(suppliercd, xcLSOPPre());
    }

    protected void regSuppliercd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSuppliercd(), "SUPPLIERCD"); }
    protected abstract ConditionValue xgetCValueSuppliercd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPCD: {NotNull, varchar(30)}
     * @param shipcd The value of shipcd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipcd_Equal(String shipcd) {
        doSetShipcd_Equal(fRES(shipcd));
    }

    protected void doSetShipcd_Equal(String shipcd) {
        regShipcd(CK_EQ, shipcd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPCD: {NotNull, varchar(30)}
     * @param shipcd The value of shipcd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipcd_NotEqual(String shipcd) {
        doSetShipcd_NotEqual(fRES(shipcd));
    }

    protected void doSetShipcd_NotEqual(String shipcd) {
        regShipcd(CK_NES, shipcd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPCD: {NotNull, varchar(30)}
     * @param shipcd The value of shipcd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipcd_GreaterThan(String shipcd) {
        regShipcd(CK_GT, fRES(shipcd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPCD: {NotNull, varchar(30)}
     * @param shipcd The value of shipcd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipcd_LessThan(String shipcd) {
        regShipcd(CK_LT, fRES(shipcd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPCD: {NotNull, varchar(30)}
     * @param shipcd The value of shipcd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipcd_GreaterEqual(String shipcd) {
        regShipcd(CK_GE, fRES(shipcd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPCD: {NotNull, varchar(30)}
     * @param shipcd The value of shipcd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipcd_LessEqual(String shipcd) {
        regShipcd(CK_LE, fRES(shipcd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPCD: {NotNull, varchar(30)}
     * @param shipcdList The collection of shipcd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipcd_InScope(Collection<String> shipcdList) {
        doSetShipcd_InScope(shipcdList);
    }

    protected void doSetShipcd_InScope(Collection<String> shipcdList) {
        regINS(CK_INS, cTL(shipcdList), xgetCValueShipcd(), "SHIPCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPCD: {NotNull, varchar(30)}
     * @param shipcdList The collection of shipcd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipcd_NotInScope(Collection<String> shipcdList) {
        doSetShipcd_NotInScope(shipcdList);
    }

    protected void doSetShipcd_NotInScope(Collection<String> shipcdList) {
        regINS(CK_NINS, cTL(shipcdList), xgetCValueShipcd(), "SHIPCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPCD: {NotNull, varchar(30)} <br>
     * <pre>e.g. setShipcd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param shipcd The value of shipcd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setShipcd_LikeSearch(String shipcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(shipcd), xgetCValueShipcd(), "SHIPCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPCD: {NotNull, varchar(30)}
     * @param shipcd The value of shipcd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setShipcd_NotLikeSearch(String shipcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shipcd), xgetCValueShipcd(), "SHIPCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPCD: {NotNull, varchar(30)}
     * @param shipcd The value of shipcd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipcd_PrefixSearch(String shipcd) {
        setShipcd_LikeSearch(shipcd, xcLSOPPre());
    }

    protected void regShipcd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShipcd(), "SHIPCD"); }
    protected abstract ConditionValue xgetCValueShipcd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCHDATE: {NotNull, varchar(8)}
     * @param schdate The value of schdate as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSchdate_Equal(String schdate) {
        doSetSchdate_Equal(fRES(schdate));
    }

    protected void doSetSchdate_Equal(String schdate) {
        regSchdate(CK_EQ, schdate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCHDATE: {NotNull, varchar(8)}
     * @param schdate The value of schdate as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSchdate_NotEqual(String schdate) {
        doSetSchdate_NotEqual(fRES(schdate));
    }

    protected void doSetSchdate_NotEqual(String schdate) {
        regSchdate(CK_NES, schdate);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCHDATE: {NotNull, varchar(8)}
     * @param schdate The value of schdate as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSchdate_GreaterThan(String schdate) {
        regSchdate(CK_GT, fRES(schdate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCHDATE: {NotNull, varchar(8)}
     * @param schdate The value of schdate as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSchdate_LessThan(String schdate) {
        regSchdate(CK_LT, fRES(schdate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCHDATE: {NotNull, varchar(8)}
     * @param schdate The value of schdate as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSchdate_GreaterEqual(String schdate) {
        regSchdate(CK_GE, fRES(schdate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCHDATE: {NotNull, varchar(8)}
     * @param schdate The value of schdate as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSchdate_LessEqual(String schdate) {
        regSchdate(CK_LE, fRES(schdate));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SCHDATE: {NotNull, varchar(8)}
     * @param schdateList The collection of schdate as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSchdate_InScope(Collection<String> schdateList) {
        doSetSchdate_InScope(schdateList);
    }

    protected void doSetSchdate_InScope(Collection<String> schdateList) {
        regINS(CK_INS, cTL(schdateList), xgetCValueSchdate(), "SCHDATE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SCHDATE: {NotNull, varchar(8)}
     * @param schdateList The collection of schdate as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSchdate_NotInScope(Collection<String> schdateList) {
        doSetSchdate_NotInScope(schdateList);
    }

    protected void doSetSchdate_NotInScope(Collection<String> schdateList) {
        regINS(CK_NINS, cTL(schdateList), xgetCValueSchdate(), "SCHDATE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SCHDATE: {NotNull, varchar(8)} <br>
     * <pre>e.g. setSchdate_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param schdate The value of schdate as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSchdate_LikeSearch(String schdate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(schdate), xgetCValueSchdate(), "SCHDATE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SCHDATE: {NotNull, varchar(8)}
     * @param schdate The value of schdate as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSchdate_NotLikeSearch(String schdate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(schdate), xgetCValueSchdate(), "SCHDATE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SCHDATE: {NotNull, varchar(8)}
     * @param schdate The value of schdate as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSchdate_PrefixSearch(String schdate) {
        setSchdate_LikeSearch(schdate, xcLSOPPre());
    }

    protected void regSchdate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSchdate(), "SCHDATE"); }
    protected abstract ConditionValue xgetCValueSchdate();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * FLEXIBITYNO: {NotNull, decimal(16, 6)}
     * @param flexibityno The value of flexibityno as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setFlexibityno_Equal(java.math.BigDecimal flexibityno) {
        doSetFlexibityno_Equal(flexibityno);
    }

    protected void doSetFlexibityno_Equal(java.math.BigDecimal flexibityno) {
        regFlexibityno(CK_EQ, flexibityno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FLEXIBITYNO: {NotNull, decimal(16, 6)}
     * @param flexibityno The value of flexibityno as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFlexibityno_NotEqual(java.math.BigDecimal flexibityno) {
        doSetFlexibityno_NotEqual(flexibityno);
    }

    protected void doSetFlexibityno_NotEqual(java.math.BigDecimal flexibityno) {
        regFlexibityno(CK_NES, flexibityno);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FLEXIBITYNO: {NotNull, decimal(16, 6)}
     * @param flexibityno The value of flexibityno as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setFlexibityno_GreaterThan(java.math.BigDecimal flexibityno) {
        regFlexibityno(CK_GT, flexibityno);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FLEXIBITYNO: {NotNull, decimal(16, 6)}
     * @param flexibityno The value of flexibityno as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setFlexibityno_LessThan(java.math.BigDecimal flexibityno) {
        regFlexibityno(CK_LT, flexibityno);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * FLEXIBITYNO: {NotNull, decimal(16, 6)}
     * @param flexibityno The value of flexibityno as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFlexibityno_GreaterEqual(java.math.BigDecimal flexibityno) {
        regFlexibityno(CK_GE, flexibityno);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * FLEXIBITYNO: {NotNull, decimal(16, 6)}
     * @param flexibityno The value of flexibityno as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFlexibityno_LessEqual(java.math.BigDecimal flexibityno) {
        regFlexibityno(CK_LE, flexibityno);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * FLEXIBITYNO: {NotNull, decimal(16, 6)}
     * @param minNumber The min number of flexibityno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of flexibityno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setFlexibityno_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueFlexibityno(), "FLEXIBITYNO", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * FLEXIBITYNO: {NotNull, decimal(16, 6)}
     * @param flexibitynoList The collection of flexibityno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFlexibityno_InScope(Collection<java.math.BigDecimal> flexibitynoList) {
        doSetFlexibityno_InScope(flexibitynoList);
    }

    protected void doSetFlexibityno_InScope(Collection<java.math.BigDecimal> flexibitynoList) {
        regINS(CK_INS, cTL(flexibitynoList), xgetCValueFlexibityno(), "FLEXIBITYNO");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * FLEXIBITYNO: {NotNull, decimal(16, 6)}
     * @param flexibitynoList The collection of flexibityno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFlexibityno_NotInScope(Collection<java.math.BigDecimal> flexibitynoList) {
        doSetFlexibityno_NotInScope(flexibitynoList);
    }

    protected void doSetFlexibityno_NotInScope(Collection<java.math.BigDecimal> flexibitynoList) {
        regINS(CK_NINS, cTL(flexibitynoList), xgetCValueFlexibityno(), "FLEXIBITYNO");
    }

    protected void regFlexibityno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFlexibityno(), "FLEXIBITYNO"); }
    protected abstract ConditionValue xgetCValueFlexibityno();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRANSPORTCD: {NotNull, varchar(30)}
     * @param transportcd The value of transportcd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransportcd_Equal(String transportcd) {
        doSetTransportcd_Equal(fRES(transportcd));
    }

    protected void doSetTransportcd_Equal(String transportcd) {
        regTransportcd(CK_EQ, transportcd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRANSPORTCD: {NotNull, varchar(30)}
     * @param transportcd The value of transportcd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransportcd_NotEqual(String transportcd) {
        doSetTransportcd_NotEqual(fRES(transportcd));
    }

    protected void doSetTransportcd_NotEqual(String transportcd) {
        regTransportcd(CK_NES, transportcd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRANSPORTCD: {NotNull, varchar(30)}
     * @param transportcd The value of transportcd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransportcd_GreaterThan(String transportcd) {
        regTransportcd(CK_GT, fRES(transportcd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRANSPORTCD: {NotNull, varchar(30)}
     * @param transportcd The value of transportcd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransportcd_LessThan(String transportcd) {
        regTransportcd(CK_LT, fRES(transportcd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRANSPORTCD: {NotNull, varchar(30)}
     * @param transportcd The value of transportcd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransportcd_GreaterEqual(String transportcd) {
        regTransportcd(CK_GE, fRES(transportcd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRANSPORTCD: {NotNull, varchar(30)}
     * @param transportcd The value of transportcd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransportcd_LessEqual(String transportcd) {
        regTransportcd(CK_LE, fRES(transportcd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TRANSPORTCD: {NotNull, varchar(30)}
     * @param transportcdList The collection of transportcd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransportcd_InScope(Collection<String> transportcdList) {
        doSetTransportcd_InScope(transportcdList);
    }

    protected void doSetTransportcd_InScope(Collection<String> transportcdList) {
        regINS(CK_INS, cTL(transportcdList), xgetCValueTransportcd(), "TRANSPORTCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TRANSPORTCD: {NotNull, varchar(30)}
     * @param transportcdList The collection of transportcd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransportcd_NotInScope(Collection<String> transportcdList) {
        doSetTransportcd_NotInScope(transportcdList);
    }

    protected void doSetTransportcd_NotInScope(Collection<String> transportcdList) {
        regINS(CK_NINS, cTL(transportcdList), xgetCValueTransportcd(), "TRANSPORTCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TRANSPORTCD: {NotNull, varchar(30)} <br>
     * <pre>e.g. setTransportcd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param transportcd The value of transportcd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTransportcd_LikeSearch(String transportcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(transportcd), xgetCValueTransportcd(), "TRANSPORTCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TRANSPORTCD: {NotNull, varchar(30)}
     * @param transportcd The value of transportcd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTransportcd_NotLikeSearch(String transportcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(transportcd), xgetCValueTransportcd(), "TRANSPORTCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TRANSPORTCD: {NotNull, varchar(30)}
     * @param transportcd The value of transportcd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransportcd_PrefixSearch(String transportcd) {
        setTransportcd_LikeSearch(transportcd, xcLSOPPre());
    }

    protected void regTransportcd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTransportcd(), "TRANSPORTCD"); }
    protected abstract ConditionValue xgetCValueTransportcd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCVDATE: {IX, NotNull, varchar(8)}
     * @param rcvdate The value of rcvdate as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvdate_Equal(String rcvdate) {
        doSetRcvdate_Equal(fRES(rcvdate));
    }

    protected void doSetRcvdate_Equal(String rcvdate) {
        regRcvdate(CK_EQ, rcvdate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCVDATE: {IX, NotNull, varchar(8)}
     * @param rcvdate The value of rcvdate as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvdate_NotEqual(String rcvdate) {
        doSetRcvdate_NotEqual(fRES(rcvdate));
    }

    protected void doSetRcvdate_NotEqual(String rcvdate) {
        regRcvdate(CK_NES, rcvdate);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCVDATE: {IX, NotNull, varchar(8)}
     * @param rcvdate The value of rcvdate as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvdate_GreaterThan(String rcvdate) {
        regRcvdate(CK_GT, fRES(rcvdate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCVDATE: {IX, NotNull, varchar(8)}
     * @param rcvdate The value of rcvdate as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvdate_LessThan(String rcvdate) {
        regRcvdate(CK_LT, fRES(rcvdate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCVDATE: {IX, NotNull, varchar(8)}
     * @param rcvdate The value of rcvdate as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvdate_GreaterEqual(String rcvdate) {
        regRcvdate(CK_GE, fRES(rcvdate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCVDATE: {IX, NotNull, varchar(8)}
     * @param rcvdate The value of rcvdate as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvdate_LessEqual(String rcvdate) {
        regRcvdate(CK_LE, fRES(rcvdate));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RCVDATE: {IX, NotNull, varchar(8)}
     * @param rcvdateList The collection of rcvdate as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvdate_InScope(Collection<String> rcvdateList) {
        doSetRcvdate_InScope(rcvdateList);
    }

    protected void doSetRcvdate_InScope(Collection<String> rcvdateList) {
        regINS(CK_INS, cTL(rcvdateList), xgetCValueRcvdate(), "RCVDATE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RCVDATE: {IX, NotNull, varchar(8)}
     * @param rcvdateList The collection of rcvdate as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvdate_NotInScope(Collection<String> rcvdateList) {
        doSetRcvdate_NotInScope(rcvdateList);
    }

    protected void doSetRcvdate_NotInScope(Collection<String> rcvdateList) {
        regINS(CK_NINS, cTL(rcvdateList), xgetCValueRcvdate(), "RCVDATE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RCVDATE: {IX, NotNull, varchar(8)} <br>
     * <pre>e.g. setRcvdate_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param rcvdate The value of rcvdate as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setRcvdate_LikeSearch(String rcvdate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(rcvdate), xgetCValueRcvdate(), "RCVDATE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RCVDATE: {IX, NotNull, varchar(8)}
     * @param rcvdate The value of rcvdate as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setRcvdate_NotLikeSearch(String rcvdate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(rcvdate), xgetCValueRcvdate(), "RCVDATE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RCVDATE: {IX, NotNull, varchar(8)}
     * @param rcvdate The value of rcvdate as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvdate_PrefixSearch(String rcvdate) {
        setRcvdate_LikeSearch(rcvdate, xcLSOPPre());
    }

    protected void regRcvdate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRcvdate(), "RCVDATE"); }
    protected abstract ConditionValue xgetCValueRcvdate();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWNERCD: {NotNull, varchar(30)}
     * @param ownercd The value of ownercd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnercd_Equal(String ownercd) {
        doSetOwnercd_Equal(fRES(ownercd));
    }

    protected void doSetOwnercd_Equal(String ownercd) {
        regOwnercd(CK_EQ, ownercd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWNERCD: {NotNull, varchar(30)}
     * @param ownercd The value of ownercd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnercd_NotEqual(String ownercd) {
        doSetOwnercd_NotEqual(fRES(ownercd));
    }

    protected void doSetOwnercd_NotEqual(String ownercd) {
        regOwnercd(CK_NES, ownercd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWNERCD: {NotNull, varchar(30)}
     * @param ownercd The value of ownercd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnercd_GreaterThan(String ownercd) {
        regOwnercd(CK_GT, fRES(ownercd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWNERCD: {NotNull, varchar(30)}
     * @param ownercd The value of ownercd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnercd_LessThan(String ownercd) {
        regOwnercd(CK_LT, fRES(ownercd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWNERCD: {NotNull, varchar(30)}
     * @param ownercd The value of ownercd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnercd_GreaterEqual(String ownercd) {
        regOwnercd(CK_GE, fRES(ownercd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWNERCD: {NotNull, varchar(30)}
     * @param ownercd The value of ownercd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnercd_LessEqual(String ownercd) {
        regOwnercd(CK_LE, fRES(ownercd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OWNERCD: {NotNull, varchar(30)}
     * @param ownercdList The collection of ownercd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnercd_InScope(Collection<String> ownercdList) {
        doSetOwnercd_InScope(ownercdList);
    }

    protected void doSetOwnercd_InScope(Collection<String> ownercdList) {
        regINS(CK_INS, cTL(ownercdList), xgetCValueOwnercd(), "OWNERCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OWNERCD: {NotNull, varchar(30)}
     * @param ownercdList The collection of ownercd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnercd_NotInScope(Collection<String> ownercdList) {
        doSetOwnercd_NotInScope(ownercdList);
    }

    protected void doSetOwnercd_NotInScope(Collection<String> ownercdList) {
        regINS(CK_NINS, cTL(ownercdList), xgetCValueOwnercd(), "OWNERCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OWNERCD: {NotNull, varchar(30)} <br>
     * <pre>e.g. setOwnercd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param ownercd The value of ownercd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOwnercd_LikeSearch(String ownercd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(ownercd), xgetCValueOwnercd(), "OWNERCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OWNERCD: {NotNull, varchar(30)}
     * @param ownercd The value of ownercd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOwnercd_NotLikeSearch(String ownercd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(ownercd), xgetCValueOwnercd(), "OWNERCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OWNERCD: {NotNull, varchar(30)}
     * @param ownercd The value of ownercd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnercd_PrefixSearch(String ownercd) {
        setOwnercd_LikeSearch(ownercd, xcLSOPPre());
    }

    protected void regOwnercd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOwnercd(), "OWNERCD"); }
    protected abstract ConditionValue xgetCValueOwnercd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INSTRACTDATETIME: {NotNull, varchar(8)}
     * @param instractdatetime The value of instractdatetime as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInstractdatetime_Equal(String instractdatetime) {
        doSetInstractdatetime_Equal(fRES(instractdatetime));
    }

    protected void doSetInstractdatetime_Equal(String instractdatetime) {
        regInstractdatetime(CK_EQ, instractdatetime);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INSTRACTDATETIME: {NotNull, varchar(8)}
     * @param instractdatetime The value of instractdatetime as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInstractdatetime_NotEqual(String instractdatetime) {
        doSetInstractdatetime_NotEqual(fRES(instractdatetime));
    }

    protected void doSetInstractdatetime_NotEqual(String instractdatetime) {
        regInstractdatetime(CK_NES, instractdatetime);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INSTRACTDATETIME: {NotNull, varchar(8)}
     * @param instractdatetime The value of instractdatetime as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInstractdatetime_GreaterThan(String instractdatetime) {
        regInstractdatetime(CK_GT, fRES(instractdatetime));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INSTRACTDATETIME: {NotNull, varchar(8)}
     * @param instractdatetime The value of instractdatetime as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInstractdatetime_LessThan(String instractdatetime) {
        regInstractdatetime(CK_LT, fRES(instractdatetime));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INSTRACTDATETIME: {NotNull, varchar(8)}
     * @param instractdatetime The value of instractdatetime as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInstractdatetime_GreaterEqual(String instractdatetime) {
        regInstractdatetime(CK_GE, fRES(instractdatetime));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INSTRACTDATETIME: {NotNull, varchar(8)}
     * @param instractdatetime The value of instractdatetime as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInstractdatetime_LessEqual(String instractdatetime) {
        regInstractdatetime(CK_LE, fRES(instractdatetime));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INSTRACTDATETIME: {NotNull, varchar(8)}
     * @param instractdatetimeList The collection of instractdatetime as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInstractdatetime_InScope(Collection<String> instractdatetimeList) {
        doSetInstractdatetime_InScope(instractdatetimeList);
    }

    protected void doSetInstractdatetime_InScope(Collection<String> instractdatetimeList) {
        regINS(CK_INS, cTL(instractdatetimeList), xgetCValueInstractdatetime(), "INSTRACTDATETIME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INSTRACTDATETIME: {NotNull, varchar(8)}
     * @param instractdatetimeList The collection of instractdatetime as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInstractdatetime_NotInScope(Collection<String> instractdatetimeList) {
        doSetInstractdatetime_NotInScope(instractdatetimeList);
    }

    protected void doSetInstractdatetime_NotInScope(Collection<String> instractdatetimeList) {
        regINS(CK_NINS, cTL(instractdatetimeList), xgetCValueInstractdatetime(), "INSTRACTDATETIME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INSTRACTDATETIME: {NotNull, varchar(8)} <br>
     * <pre>e.g. setInstractdatetime_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param instractdatetime The value of instractdatetime as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setInstractdatetime_LikeSearch(String instractdatetime, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(instractdatetime), xgetCValueInstractdatetime(), "INSTRACTDATETIME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INSTRACTDATETIME: {NotNull, varchar(8)}
     * @param instractdatetime The value of instractdatetime as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setInstractdatetime_NotLikeSearch(String instractdatetime, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(instractdatetime), xgetCValueInstractdatetime(), "INSTRACTDATETIME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INSTRACTDATETIME: {NotNull, varchar(8)}
     * @param instractdatetime The value of instractdatetime as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInstractdatetime_PrefixSearch(String instractdatetime) {
        setInstractdatetime_LikeSearch(instractdatetime, xcLSOPPre());
    }

    protected void regInstractdatetime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInstractdatetime(), "INSTRACTDATETIME"); }
    protected abstract ConditionValue xgetCValueInstractdatetime();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVMAKEFLG: {NotNull, decimal(16, 6)}
     * @param rcvmakeflg The value of rcvmakeflg as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvmakeflg_Equal(java.math.BigDecimal rcvmakeflg) {
        doSetRcvmakeflg_Equal(rcvmakeflg);
    }

    protected void doSetRcvmakeflg_Equal(java.math.BigDecimal rcvmakeflg) {
        regRcvmakeflg(CK_EQ, rcvmakeflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVMAKEFLG: {NotNull, decimal(16, 6)}
     * @param rcvmakeflg The value of rcvmakeflg as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvmakeflg_NotEqual(java.math.BigDecimal rcvmakeflg) {
        doSetRcvmakeflg_NotEqual(rcvmakeflg);
    }

    protected void doSetRcvmakeflg_NotEqual(java.math.BigDecimal rcvmakeflg) {
        regRcvmakeflg(CK_NES, rcvmakeflg);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVMAKEFLG: {NotNull, decimal(16, 6)}
     * @param rcvmakeflg The value of rcvmakeflg as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvmakeflg_GreaterThan(java.math.BigDecimal rcvmakeflg) {
        regRcvmakeflg(CK_GT, rcvmakeflg);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVMAKEFLG: {NotNull, decimal(16, 6)}
     * @param rcvmakeflg The value of rcvmakeflg as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvmakeflg_LessThan(java.math.BigDecimal rcvmakeflg) {
        regRcvmakeflg(CK_LT, rcvmakeflg);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVMAKEFLG: {NotNull, decimal(16, 6)}
     * @param rcvmakeflg The value of rcvmakeflg as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvmakeflg_GreaterEqual(java.math.BigDecimal rcvmakeflg) {
        regRcvmakeflg(CK_GE, rcvmakeflg);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVMAKEFLG: {NotNull, decimal(16, 6)}
     * @param rcvmakeflg The value of rcvmakeflg as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvmakeflg_LessEqual(java.math.BigDecimal rcvmakeflg) {
        regRcvmakeflg(CK_LE, rcvmakeflg);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * RCVMAKEFLG: {NotNull, decimal(16, 6)}
     * @param minNumber The min number of rcvmakeflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of rcvmakeflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setRcvmakeflg_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueRcvmakeflg(), "RCVMAKEFLG", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RCVMAKEFLG: {NotNull, decimal(16, 6)}
     * @param rcvmakeflgList The collection of rcvmakeflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvmakeflg_InScope(Collection<java.math.BigDecimal> rcvmakeflgList) {
        doSetRcvmakeflg_InScope(rcvmakeflgList);
    }

    protected void doSetRcvmakeflg_InScope(Collection<java.math.BigDecimal> rcvmakeflgList) {
        regINS(CK_INS, cTL(rcvmakeflgList), xgetCValueRcvmakeflg(), "RCVMAKEFLG");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RCVMAKEFLG: {NotNull, decimal(16, 6)}
     * @param rcvmakeflgList The collection of rcvmakeflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvmakeflg_NotInScope(Collection<java.math.BigDecimal> rcvmakeflgList) {
        doSetRcvmakeflg_NotInScope(rcvmakeflgList);
    }

    protected void doSetRcvmakeflg_NotInScope(Collection<java.math.BigDecimal> rcvmakeflgList) {
        regINS(CK_NINS, cTL(rcvmakeflgList), xgetCValueRcvmakeflg(), "RCVMAKEFLG");
    }

    protected void regRcvmakeflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRcvmakeflg(), "RCVMAKEFLG"); }
    protected abstract ConditionValue xgetCValueRcvmakeflg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * REFLINENO: {NotNull, bigint(19)}
     * @param reflineno The value of reflineno as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setReflineno_Equal(Long reflineno) {
        doSetReflineno_Equal(reflineno);
    }

    protected void doSetReflineno_Equal(Long reflineno) {
        regReflineno(CK_EQ, reflineno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REFLINENO: {NotNull, bigint(19)}
     * @param reflineno The value of reflineno as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReflineno_NotEqual(Long reflineno) {
        doSetReflineno_NotEqual(reflineno);
    }

    protected void doSetReflineno_NotEqual(Long reflineno) {
        regReflineno(CK_NES, reflineno);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REFLINENO: {NotNull, bigint(19)}
     * @param reflineno The value of reflineno as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReflineno_GreaterThan(Long reflineno) {
        regReflineno(CK_GT, reflineno);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REFLINENO: {NotNull, bigint(19)}
     * @param reflineno The value of reflineno as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReflineno_LessThan(Long reflineno) {
        regReflineno(CK_LT, reflineno);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * REFLINENO: {NotNull, bigint(19)}
     * @param reflineno The value of reflineno as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReflineno_GreaterEqual(Long reflineno) {
        regReflineno(CK_GE, reflineno);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * REFLINENO: {NotNull, bigint(19)}
     * @param reflineno The value of reflineno as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReflineno_LessEqual(Long reflineno) {
        regReflineno(CK_LE, reflineno);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * REFLINENO: {NotNull, bigint(19)}
     * @param minNumber The min number of reflineno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of reflineno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setReflineno_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueReflineno(), "REFLINENO", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * REFLINENO: {NotNull, bigint(19)}
     * @param reflinenoList The collection of reflineno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReflineno_InScope(Collection<Long> reflinenoList) {
        doSetReflineno_InScope(reflinenoList);
    }

    protected void doSetReflineno_InScope(Collection<Long> reflinenoList) {
        regINS(CK_INS, cTL(reflinenoList), xgetCValueReflineno(), "REFLINENO");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * REFLINENO: {NotNull, bigint(19)}
     * @param reflinenoList The collection of reflineno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReflineno_NotInScope(Collection<Long> reflinenoList) {
        doSetReflineno_NotInScope(reflinenoList);
    }

    protected void doSetReflineno_NotInScope(Collection<Long> reflinenoList) {
        regINS(CK_NINS, cTL(reflinenoList), xgetCValueReflineno(), "REFLINENO");
    }

    protected void regReflineno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReflineno(), "REFLINENO"); }
    protected abstract ConditionValue xgetCValueReflineno();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {NotNull, varchar(30)}
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
     * PRODUCT_CD: {NotNull, varchar(30)}
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
     * PRODUCT_CD: {NotNull, varchar(30)}
     * @param productCd The value of productCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_GreaterThan(String productCd) {
        regProductCd(CK_GT, fRES(productCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {NotNull, varchar(30)}
     * @param productCd The value of productCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_LessThan(String productCd) {
        regProductCd(CK_LT, fRES(productCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {NotNull, varchar(30)}
     * @param productCd The value of productCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_GreaterEqual(String productCd) {
        regProductCd(CK_GE, fRES(productCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {NotNull, varchar(30)}
     * @param productCd The value of productCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_LessEqual(String productCd) {
        regProductCd(CK_LE, fRES(productCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCT_CD: {NotNull, varchar(30)}
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
     * PRODUCT_CD: {NotNull, varchar(30)}
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
     * PRODUCT_CD: {NotNull, varchar(30)} <br>
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
     * PRODUCT_CD: {NotNull, varchar(30)}
     * @param productCd The value of productCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setProductCd_NotLikeSearch(String productCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(productCd), xgetCValueProductCd(), "PRODUCT_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_CD: {NotNull, varchar(30)}
     * @param productCd The value of productCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_PrefixSearch(String productCd) {
        setProductCd_LikeSearch(productCd, xcLSOPPre());
    }

    protected void regProductCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProductCd(), "PRODUCT_CD"); }
    protected abstract ConditionValue xgetCValueProductCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MANUFACTUREDATE: {NotNull, varchar(8)}
     * @param manufacturedate The value of manufacturedate as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufacturedate_Equal(String manufacturedate) {
        doSetManufacturedate_Equal(fRES(manufacturedate));
    }

    protected void doSetManufacturedate_Equal(String manufacturedate) {
        regManufacturedate(CK_EQ, manufacturedate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MANUFACTUREDATE: {NotNull, varchar(8)}
     * @param manufacturedate The value of manufacturedate as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufacturedate_NotEqual(String manufacturedate) {
        doSetManufacturedate_NotEqual(fRES(manufacturedate));
    }

    protected void doSetManufacturedate_NotEqual(String manufacturedate) {
        regManufacturedate(CK_NES, manufacturedate);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MANUFACTUREDATE: {NotNull, varchar(8)}
     * @param manufacturedate The value of manufacturedate as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufacturedate_GreaterThan(String manufacturedate) {
        regManufacturedate(CK_GT, fRES(manufacturedate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MANUFACTUREDATE: {NotNull, varchar(8)}
     * @param manufacturedate The value of manufacturedate as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufacturedate_LessThan(String manufacturedate) {
        regManufacturedate(CK_LT, fRES(manufacturedate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MANUFACTUREDATE: {NotNull, varchar(8)}
     * @param manufacturedate The value of manufacturedate as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufacturedate_GreaterEqual(String manufacturedate) {
        regManufacturedate(CK_GE, fRES(manufacturedate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MANUFACTUREDATE: {NotNull, varchar(8)}
     * @param manufacturedate The value of manufacturedate as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufacturedate_LessEqual(String manufacturedate) {
        regManufacturedate(CK_LE, fRES(manufacturedate));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MANUFACTUREDATE: {NotNull, varchar(8)}
     * @param manufacturedateList The collection of manufacturedate as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufacturedate_InScope(Collection<String> manufacturedateList) {
        doSetManufacturedate_InScope(manufacturedateList);
    }

    protected void doSetManufacturedate_InScope(Collection<String> manufacturedateList) {
        regINS(CK_INS, cTL(manufacturedateList), xgetCValueManufacturedate(), "MANUFACTUREDATE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MANUFACTUREDATE: {NotNull, varchar(8)}
     * @param manufacturedateList The collection of manufacturedate as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufacturedate_NotInScope(Collection<String> manufacturedateList) {
        doSetManufacturedate_NotInScope(manufacturedateList);
    }

    protected void doSetManufacturedate_NotInScope(Collection<String> manufacturedateList) {
        regINS(CK_NINS, cTL(manufacturedateList), xgetCValueManufacturedate(), "MANUFACTUREDATE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MANUFACTUREDATE: {NotNull, varchar(8)} <br>
     * <pre>e.g. setManufacturedate_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param manufacturedate The value of manufacturedate as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setManufacturedate_LikeSearch(String manufacturedate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(manufacturedate), xgetCValueManufacturedate(), "MANUFACTUREDATE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MANUFACTUREDATE: {NotNull, varchar(8)}
     * @param manufacturedate The value of manufacturedate as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setManufacturedate_NotLikeSearch(String manufacturedate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(manufacturedate), xgetCValueManufacturedate(), "MANUFACTUREDATE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MANUFACTUREDATE: {NotNull, varchar(8)}
     * @param manufacturedate The value of manufacturedate as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufacturedate_PrefixSearch(String manufacturedate) {
        setManufacturedate_LikeSearch(manufacturedate, xcLSOPPre());
    }

    protected void regManufacturedate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueManufacturedate(), "MANUFACTUREDATE"); }
    protected abstract ConditionValue xgetCValueManufacturedate();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESIGNCD: {NotNull, varchar(30)}
     * @param designcd The value of designcd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesigncd_Equal(String designcd) {
        doSetDesigncd_Equal(fRES(designcd));
    }

    protected void doSetDesigncd_Equal(String designcd) {
        regDesigncd(CK_EQ, designcd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESIGNCD: {NotNull, varchar(30)}
     * @param designcd The value of designcd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesigncd_NotEqual(String designcd) {
        doSetDesigncd_NotEqual(fRES(designcd));
    }

    protected void doSetDesigncd_NotEqual(String designcd) {
        regDesigncd(CK_NES, designcd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESIGNCD: {NotNull, varchar(30)}
     * @param designcd The value of designcd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesigncd_GreaterThan(String designcd) {
        regDesigncd(CK_GT, fRES(designcd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESIGNCD: {NotNull, varchar(30)}
     * @param designcd The value of designcd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesigncd_LessThan(String designcd) {
        regDesigncd(CK_LT, fRES(designcd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESIGNCD: {NotNull, varchar(30)}
     * @param designcd The value of designcd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesigncd_GreaterEqual(String designcd) {
        regDesigncd(CK_GE, fRES(designcd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESIGNCD: {NotNull, varchar(30)}
     * @param designcd The value of designcd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesigncd_LessEqual(String designcd) {
        regDesigncd(CK_LE, fRES(designcd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DESIGNCD: {NotNull, varchar(30)}
     * @param designcdList The collection of designcd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesigncd_InScope(Collection<String> designcdList) {
        doSetDesigncd_InScope(designcdList);
    }

    protected void doSetDesigncd_InScope(Collection<String> designcdList) {
        regINS(CK_INS, cTL(designcdList), xgetCValueDesigncd(), "DESIGNCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DESIGNCD: {NotNull, varchar(30)}
     * @param designcdList The collection of designcd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesigncd_NotInScope(Collection<String> designcdList) {
        doSetDesigncd_NotInScope(designcdList);
    }

    protected void doSetDesigncd_NotInScope(Collection<String> designcdList) {
        regINS(CK_NINS, cTL(designcdList), xgetCValueDesigncd(), "DESIGNCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESIGNCD: {NotNull, varchar(30)} <br>
     * <pre>e.g. setDesigncd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param designcd The value of designcd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDesigncd_LikeSearch(String designcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(designcd), xgetCValueDesigncd(), "DESIGNCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESIGNCD: {NotNull, varchar(30)}
     * @param designcd The value of designcd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDesigncd_NotLikeSearch(String designcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(designcd), xgetCValueDesigncd(), "DESIGNCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESIGNCD: {NotNull, varchar(30)}
     * @param designcd The value of designcd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesigncd_PrefixSearch(String designcd) {
        setDesigncd_LikeSearch(designcd, xcLSOPPre());
    }

    protected void regDesigncd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDesigncd(), "DESIGNCD"); }
    protected abstract ConditionValue xgetCValueDesigncd();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * QTYCASE: {NotNull, decimal(16, 6)}
     * @param qtycase The value of qtycase as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setQtycase_Equal(java.math.BigDecimal qtycase) {
        doSetQtycase_Equal(qtycase);
    }

    protected void doSetQtycase_Equal(java.math.BigDecimal qtycase) {
        regQtycase(CK_EQ, qtycase);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * QTYCASE: {NotNull, decimal(16, 6)}
     * @param qtycase The value of qtycase as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setQtycase_NotEqual(java.math.BigDecimal qtycase) {
        doSetQtycase_NotEqual(qtycase);
    }

    protected void doSetQtycase_NotEqual(java.math.BigDecimal qtycase) {
        regQtycase(CK_NES, qtycase);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * QTYCASE: {NotNull, decimal(16, 6)}
     * @param qtycase The value of qtycase as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setQtycase_GreaterThan(java.math.BigDecimal qtycase) {
        regQtycase(CK_GT, qtycase);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * QTYCASE: {NotNull, decimal(16, 6)}
     * @param qtycase The value of qtycase as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setQtycase_LessThan(java.math.BigDecimal qtycase) {
        regQtycase(CK_LT, qtycase);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * QTYCASE: {NotNull, decimal(16, 6)}
     * @param qtycase The value of qtycase as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setQtycase_GreaterEqual(java.math.BigDecimal qtycase) {
        regQtycase(CK_GE, qtycase);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * QTYCASE: {NotNull, decimal(16, 6)}
     * @param qtycase The value of qtycase as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setQtycase_LessEqual(java.math.BigDecimal qtycase) {
        regQtycase(CK_LE, qtycase);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * QTYCASE: {NotNull, decimal(16, 6)}
     * @param minNumber The min number of qtycase. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of qtycase. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setQtycase_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueQtycase(), "QTYCASE", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * QTYCASE: {NotNull, decimal(16, 6)}
     * @param qtycaseList The collection of qtycase as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQtycase_InScope(Collection<java.math.BigDecimal> qtycaseList) {
        doSetQtycase_InScope(qtycaseList);
    }

    protected void doSetQtycase_InScope(Collection<java.math.BigDecimal> qtycaseList) {
        regINS(CK_INS, cTL(qtycaseList), xgetCValueQtycase(), "QTYCASE");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * QTYCASE: {NotNull, decimal(16, 6)}
     * @param qtycaseList The collection of qtycase as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQtycase_NotInScope(Collection<java.math.BigDecimal> qtycaseList) {
        doSetQtycase_NotInScope(qtycaseList);
    }

    protected void doSetQtycase_NotInScope(Collection<java.math.BigDecimal> qtycaseList) {
        regINS(CK_NINS, cTL(qtycaseList), xgetCValueQtycase(), "QTYCASE");
    }

    protected void regQtycase(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueQtycase(), "QTYCASE"); }
    protected abstract ConditionValue xgetCValueQtycase();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * QTYBOWL: {NotNull, decimal(16, 6)}
     * @param qtybowl The value of qtybowl as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setQtybowl_Equal(java.math.BigDecimal qtybowl) {
        doSetQtybowl_Equal(qtybowl);
    }

    protected void doSetQtybowl_Equal(java.math.BigDecimal qtybowl) {
        regQtybowl(CK_EQ, qtybowl);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * QTYBOWL: {NotNull, decimal(16, 6)}
     * @param qtybowl The value of qtybowl as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setQtybowl_NotEqual(java.math.BigDecimal qtybowl) {
        doSetQtybowl_NotEqual(qtybowl);
    }

    protected void doSetQtybowl_NotEqual(java.math.BigDecimal qtybowl) {
        regQtybowl(CK_NES, qtybowl);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * QTYBOWL: {NotNull, decimal(16, 6)}
     * @param qtybowl The value of qtybowl as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setQtybowl_GreaterThan(java.math.BigDecimal qtybowl) {
        regQtybowl(CK_GT, qtybowl);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * QTYBOWL: {NotNull, decimal(16, 6)}
     * @param qtybowl The value of qtybowl as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setQtybowl_LessThan(java.math.BigDecimal qtybowl) {
        regQtybowl(CK_LT, qtybowl);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * QTYBOWL: {NotNull, decimal(16, 6)}
     * @param qtybowl The value of qtybowl as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setQtybowl_GreaterEqual(java.math.BigDecimal qtybowl) {
        regQtybowl(CK_GE, qtybowl);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * QTYBOWL: {NotNull, decimal(16, 6)}
     * @param qtybowl The value of qtybowl as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setQtybowl_LessEqual(java.math.BigDecimal qtybowl) {
        regQtybowl(CK_LE, qtybowl);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * QTYBOWL: {NotNull, decimal(16, 6)}
     * @param minNumber The min number of qtybowl. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of qtybowl. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setQtybowl_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueQtybowl(), "QTYBOWL", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * QTYBOWL: {NotNull, decimal(16, 6)}
     * @param qtybowlList The collection of qtybowl as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQtybowl_InScope(Collection<java.math.BigDecimal> qtybowlList) {
        doSetQtybowl_InScope(qtybowlList);
    }

    protected void doSetQtybowl_InScope(Collection<java.math.BigDecimal> qtybowlList) {
        regINS(CK_INS, cTL(qtybowlList), xgetCValueQtybowl(), "QTYBOWL");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * QTYBOWL: {NotNull, decimal(16, 6)}
     * @param qtybowlList The collection of qtybowl as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQtybowl_NotInScope(Collection<java.math.BigDecimal> qtybowlList) {
        doSetQtybowl_NotInScope(qtybowlList);
    }

    protected void doSetQtybowl_NotInScope(Collection<java.math.BigDecimal> qtybowlList) {
        regINS(CK_NINS, cTL(qtybowlList), xgetCValueQtybowl(), "QTYBOWL");
    }

    protected void regQtybowl(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueQtybowl(), "QTYBOWL"); }
    protected abstract ConditionValue xgetCValueQtybowl();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CASEINFOFLG: {decimal(16, 6)}
     * @param caseinfoflg The value of caseinfoflg as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCaseinfoflg_Equal(java.math.BigDecimal caseinfoflg) {
        doSetCaseinfoflg_Equal(caseinfoflg);
    }

    protected void doSetCaseinfoflg_Equal(java.math.BigDecimal caseinfoflg) {
        regCaseinfoflg(CK_EQ, caseinfoflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CASEINFOFLG: {decimal(16, 6)}
     * @param caseinfoflg The value of caseinfoflg as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCaseinfoflg_NotEqual(java.math.BigDecimal caseinfoflg) {
        doSetCaseinfoflg_NotEqual(caseinfoflg);
    }

    protected void doSetCaseinfoflg_NotEqual(java.math.BigDecimal caseinfoflg) {
        regCaseinfoflg(CK_NES, caseinfoflg);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CASEINFOFLG: {decimal(16, 6)}
     * @param caseinfoflg The value of caseinfoflg as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCaseinfoflg_GreaterThan(java.math.BigDecimal caseinfoflg) {
        regCaseinfoflg(CK_GT, caseinfoflg);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CASEINFOFLG: {decimal(16, 6)}
     * @param caseinfoflg The value of caseinfoflg as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCaseinfoflg_LessThan(java.math.BigDecimal caseinfoflg) {
        regCaseinfoflg(CK_LT, caseinfoflg);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CASEINFOFLG: {decimal(16, 6)}
     * @param caseinfoflg The value of caseinfoflg as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCaseinfoflg_GreaterEqual(java.math.BigDecimal caseinfoflg) {
        regCaseinfoflg(CK_GE, caseinfoflg);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CASEINFOFLG: {decimal(16, 6)}
     * @param caseinfoflg The value of caseinfoflg as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCaseinfoflg_LessEqual(java.math.BigDecimal caseinfoflg) {
        regCaseinfoflg(CK_LE, caseinfoflg);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CASEINFOFLG: {decimal(16, 6)}
     * @param minNumber The min number of caseinfoflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of caseinfoflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCaseinfoflg_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCaseinfoflg(), "CASEINFOFLG", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CASEINFOFLG: {decimal(16, 6)}
     * @param caseinfoflgList The collection of caseinfoflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseinfoflg_InScope(Collection<java.math.BigDecimal> caseinfoflgList) {
        doSetCaseinfoflg_InScope(caseinfoflgList);
    }

    protected void doSetCaseinfoflg_InScope(Collection<java.math.BigDecimal> caseinfoflgList) {
        regINS(CK_INS, cTL(caseinfoflgList), xgetCValueCaseinfoflg(), "CASEINFOFLG");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CASEINFOFLG: {decimal(16, 6)}
     * @param caseinfoflgList The collection of caseinfoflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseinfoflg_NotInScope(Collection<java.math.BigDecimal> caseinfoflgList) {
        doSetCaseinfoflg_NotInScope(caseinfoflgList);
    }

    protected void doSetCaseinfoflg_NotInScope(Collection<java.math.BigDecimal> caseinfoflgList) {
        regINS(CK_NINS, cTL(caseinfoflgList), xgetCValueCaseinfoflg(), "CASEINFOFLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CASEINFOFLG: {decimal(16, 6)}
     */
    public void setCaseinfoflg_IsNull() { regCaseinfoflg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CASEINFOFLG: {decimal(16, 6)}
     */
    public void setCaseinfoflg_IsNotNull() { regCaseinfoflg(CK_ISNN, DOBJ); }

    protected void regCaseinfoflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCaseinfoflg(), "CASEINFOFLG"); }
    protected abstract ConditionValue xgetCValueCaseinfoflg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FACTORYCD: {varchar(30)}
     * @param factorycd The value of factorycd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFactorycd_Equal(String factorycd) {
        doSetFactorycd_Equal(fRES(factorycd));
    }

    protected void doSetFactorycd_Equal(String factorycd) {
        regFactorycd(CK_EQ, factorycd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FACTORYCD: {varchar(30)}
     * @param factorycd The value of factorycd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFactorycd_NotEqual(String factorycd) {
        doSetFactorycd_NotEqual(fRES(factorycd));
    }

    protected void doSetFactorycd_NotEqual(String factorycd) {
        regFactorycd(CK_NES, factorycd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FACTORYCD: {varchar(30)}
     * @param factorycd The value of factorycd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFactorycd_GreaterThan(String factorycd) {
        regFactorycd(CK_GT, fRES(factorycd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FACTORYCD: {varchar(30)}
     * @param factorycd The value of factorycd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFactorycd_LessThan(String factorycd) {
        regFactorycd(CK_LT, fRES(factorycd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FACTORYCD: {varchar(30)}
     * @param factorycd The value of factorycd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFactorycd_GreaterEqual(String factorycd) {
        regFactorycd(CK_GE, fRES(factorycd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FACTORYCD: {varchar(30)}
     * @param factorycd The value of factorycd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFactorycd_LessEqual(String factorycd) {
        regFactorycd(CK_LE, fRES(factorycd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FACTORYCD: {varchar(30)}
     * @param factorycdList The collection of factorycd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFactorycd_InScope(Collection<String> factorycdList) {
        doSetFactorycd_InScope(factorycdList);
    }

    protected void doSetFactorycd_InScope(Collection<String> factorycdList) {
        regINS(CK_INS, cTL(factorycdList), xgetCValueFactorycd(), "FACTORYCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FACTORYCD: {varchar(30)}
     * @param factorycdList The collection of factorycd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFactorycd_NotInScope(Collection<String> factorycdList) {
        doSetFactorycd_NotInScope(factorycdList);
    }

    protected void doSetFactorycd_NotInScope(Collection<String> factorycdList) {
        regINS(CK_NINS, cTL(factorycdList), xgetCValueFactorycd(), "FACTORYCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FACTORYCD: {varchar(30)} <br>
     * <pre>e.g. setFactorycd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param factorycd The value of factorycd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFactorycd_LikeSearch(String factorycd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(factorycd), xgetCValueFactorycd(), "FACTORYCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FACTORYCD: {varchar(30)}
     * @param factorycd The value of factorycd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFactorycd_NotLikeSearch(String factorycd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(factorycd), xgetCValueFactorycd(), "FACTORYCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FACTORYCD: {varchar(30)}
     * @param factorycd The value of factorycd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFactorycd_PrefixSearch(String factorycd) {
        setFactorycd_LikeSearch(factorycd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FACTORYCD: {varchar(30)}
     */
    public void setFactorycd_IsNull() { regFactorycd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * FACTORYCD: {varchar(30)}
     */
    public void setFactorycd_IsNullOrEmpty() { regFactorycd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FACTORYCD: {varchar(30)}
     */
    public void setFactorycd_IsNotNull() { regFactorycd(CK_ISNN, DOBJ); }

    protected void regFactorycd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFactorycd(), "FACTORYCD"); }
    protected abstract ConditionValue xgetCValueFactorycd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMCD_CASE: {varchar(30)}
     * @param itemcdCase The value of itemcdCase as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcdCase_Equal(String itemcdCase) {
        doSetItemcdCase_Equal(fRES(itemcdCase));
    }

    protected void doSetItemcdCase_Equal(String itemcdCase) {
        regItemcdCase(CK_EQ, itemcdCase);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMCD_CASE: {varchar(30)}
     * @param itemcdCase The value of itemcdCase as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcdCase_NotEqual(String itemcdCase) {
        doSetItemcdCase_NotEqual(fRES(itemcdCase));
    }

    protected void doSetItemcdCase_NotEqual(String itemcdCase) {
        regItemcdCase(CK_NES, itemcdCase);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMCD_CASE: {varchar(30)}
     * @param itemcdCase The value of itemcdCase as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcdCase_GreaterThan(String itemcdCase) {
        regItemcdCase(CK_GT, fRES(itemcdCase));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMCD_CASE: {varchar(30)}
     * @param itemcdCase The value of itemcdCase as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcdCase_LessThan(String itemcdCase) {
        regItemcdCase(CK_LT, fRES(itemcdCase));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMCD_CASE: {varchar(30)}
     * @param itemcdCase The value of itemcdCase as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcdCase_GreaterEqual(String itemcdCase) {
        regItemcdCase(CK_GE, fRES(itemcdCase));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMCD_CASE: {varchar(30)}
     * @param itemcdCase The value of itemcdCase as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcdCase_LessEqual(String itemcdCase) {
        regItemcdCase(CK_LE, fRES(itemcdCase));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ITEMCD_CASE: {varchar(30)}
     * @param itemcdCaseList The collection of itemcdCase as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcdCase_InScope(Collection<String> itemcdCaseList) {
        doSetItemcdCase_InScope(itemcdCaseList);
    }

    protected void doSetItemcdCase_InScope(Collection<String> itemcdCaseList) {
        regINS(CK_INS, cTL(itemcdCaseList), xgetCValueItemcdCase(), "ITEMCD_CASE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ITEMCD_CASE: {varchar(30)}
     * @param itemcdCaseList The collection of itemcdCase as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcdCase_NotInScope(Collection<String> itemcdCaseList) {
        doSetItemcdCase_NotInScope(itemcdCaseList);
    }

    protected void doSetItemcdCase_NotInScope(Collection<String> itemcdCaseList) {
        regINS(CK_NINS, cTL(itemcdCaseList), xgetCValueItemcdCase(), "ITEMCD_CASE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEMCD_CASE: {varchar(30)} <br>
     * <pre>e.g. setItemcdCase_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param itemcdCase The value of itemcdCase as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setItemcdCase_LikeSearch(String itemcdCase, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(itemcdCase), xgetCValueItemcdCase(), "ITEMCD_CASE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEMCD_CASE: {varchar(30)}
     * @param itemcdCase The value of itemcdCase as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setItemcdCase_NotLikeSearch(String itemcdCase, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(itemcdCase), xgetCValueItemcdCase(), "ITEMCD_CASE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEMCD_CASE: {varchar(30)}
     * @param itemcdCase The value of itemcdCase as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcdCase_PrefixSearch(String itemcdCase) {
        setItemcdCase_LikeSearch(itemcdCase, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ITEMCD_CASE: {varchar(30)}
     */
    public void setItemcdCase_IsNull() { regItemcdCase(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ITEMCD_CASE: {varchar(30)}
     */
    public void setItemcdCase_IsNullOrEmpty() { regItemcdCase(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ITEMCD_CASE: {varchar(30)}
     */
    public void setItemcdCase_IsNotNull() { regItemcdCase(CK_ISNN, DOBJ); }

    protected void regItemcdCase(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueItemcdCase(), "ITEMCD_CASE"); }
    protected abstract ConditionValue xgetCValueItemcdCase();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SKUCD: {varchar(30)}
     * @param skucd The value of skucd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSkucd_Equal(String skucd) {
        doSetSkucd_Equal(fRES(skucd));
    }

    protected void doSetSkucd_Equal(String skucd) {
        regSkucd(CK_EQ, skucd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SKUCD: {varchar(30)}
     * @param skucd The value of skucd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSkucd_NotEqual(String skucd) {
        doSetSkucd_NotEqual(fRES(skucd));
    }

    protected void doSetSkucd_NotEqual(String skucd) {
        regSkucd(CK_NES, skucd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SKUCD: {varchar(30)}
     * @param skucd The value of skucd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSkucd_GreaterThan(String skucd) {
        regSkucd(CK_GT, fRES(skucd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SKUCD: {varchar(30)}
     * @param skucd The value of skucd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSkucd_LessThan(String skucd) {
        regSkucd(CK_LT, fRES(skucd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SKUCD: {varchar(30)}
     * @param skucd The value of skucd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSkucd_GreaterEqual(String skucd) {
        regSkucd(CK_GE, fRES(skucd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SKUCD: {varchar(30)}
     * @param skucd The value of skucd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSkucd_LessEqual(String skucd) {
        regSkucd(CK_LE, fRES(skucd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SKUCD: {varchar(30)}
     * @param skucdList The collection of skucd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSkucd_InScope(Collection<String> skucdList) {
        doSetSkucd_InScope(skucdList);
    }

    protected void doSetSkucd_InScope(Collection<String> skucdList) {
        regINS(CK_INS, cTL(skucdList), xgetCValueSkucd(), "SKUCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SKUCD: {varchar(30)}
     * @param skucdList The collection of skucd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSkucd_NotInScope(Collection<String> skucdList) {
        doSetSkucd_NotInScope(skucdList);
    }

    protected void doSetSkucd_NotInScope(Collection<String> skucdList) {
        regINS(CK_NINS, cTL(skucdList), xgetCValueSkucd(), "SKUCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SKUCD: {varchar(30)} <br>
     * <pre>e.g. setSkucd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param skucd The value of skucd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSkucd_LikeSearch(String skucd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(skucd), xgetCValueSkucd(), "SKUCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SKUCD: {varchar(30)}
     * @param skucd The value of skucd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSkucd_NotLikeSearch(String skucd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(skucd), xgetCValueSkucd(), "SKUCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SKUCD: {varchar(30)}
     * @param skucd The value of skucd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSkucd_PrefixSearch(String skucd) {
        setSkucd_LikeSearch(skucd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SKUCD: {varchar(30)}
     */
    public void setSkucd_IsNull() { regSkucd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SKUCD: {varchar(30)}
     */
    public void setSkucd_IsNullOrEmpty() { regSkucd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SKUCD: {varchar(30)}
     */
    public void setSkucd_IsNotNull() { regSkucd(CK_ISNN, DOBJ); }

    protected void regSkucd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSkucd(), "SKUCD"); }
    protected abstract ConditionValue xgetCValueSkucd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATIONCD: {varchar(30)}
     * @param destinationcd The value of destinationcd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationcd_Equal(String destinationcd) {
        doSetDestinationcd_Equal(fRES(destinationcd));
    }

    protected void doSetDestinationcd_Equal(String destinationcd) {
        regDestinationcd(CK_EQ, destinationcd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATIONCD: {varchar(30)}
     * @param destinationcd The value of destinationcd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationcd_NotEqual(String destinationcd) {
        doSetDestinationcd_NotEqual(fRES(destinationcd));
    }

    protected void doSetDestinationcd_NotEqual(String destinationcd) {
        regDestinationcd(CK_NES, destinationcd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATIONCD: {varchar(30)}
     * @param destinationcd The value of destinationcd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationcd_GreaterThan(String destinationcd) {
        regDestinationcd(CK_GT, fRES(destinationcd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATIONCD: {varchar(30)}
     * @param destinationcd The value of destinationcd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationcd_LessThan(String destinationcd) {
        regDestinationcd(CK_LT, fRES(destinationcd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATIONCD: {varchar(30)}
     * @param destinationcd The value of destinationcd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationcd_GreaterEqual(String destinationcd) {
        regDestinationcd(CK_GE, fRES(destinationcd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATIONCD: {varchar(30)}
     * @param destinationcd The value of destinationcd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationcd_LessEqual(String destinationcd) {
        regDestinationcd(CK_LE, fRES(destinationcd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DESTINATIONCD: {varchar(30)}
     * @param destinationcdList The collection of destinationcd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationcd_InScope(Collection<String> destinationcdList) {
        doSetDestinationcd_InScope(destinationcdList);
    }

    protected void doSetDestinationcd_InScope(Collection<String> destinationcdList) {
        regINS(CK_INS, cTL(destinationcdList), xgetCValueDestinationcd(), "DESTINATIONCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DESTINATIONCD: {varchar(30)}
     * @param destinationcdList The collection of destinationcd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationcd_NotInScope(Collection<String> destinationcdList) {
        doSetDestinationcd_NotInScope(destinationcdList);
    }

    protected void doSetDestinationcd_NotInScope(Collection<String> destinationcdList) {
        regINS(CK_NINS, cTL(destinationcdList), xgetCValueDestinationcd(), "DESTINATIONCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESTINATIONCD: {varchar(30)} <br>
     * <pre>e.g. setDestinationcd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param destinationcd The value of destinationcd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDestinationcd_LikeSearch(String destinationcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(destinationcd), xgetCValueDestinationcd(), "DESTINATIONCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESTINATIONCD: {varchar(30)}
     * @param destinationcd The value of destinationcd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDestinationcd_NotLikeSearch(String destinationcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(destinationcd), xgetCValueDestinationcd(), "DESTINATIONCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESTINATIONCD: {varchar(30)}
     * @param destinationcd The value of destinationcd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationcd_PrefixSearch(String destinationcd) {
        setDestinationcd_LikeSearch(destinationcd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DESTINATIONCD: {varchar(30)}
     */
    public void setDestinationcd_IsNull() { regDestinationcd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DESTINATIONCD: {varchar(30)}
     */
    public void setDestinationcd_IsNullOrEmpty() { regDestinationcd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DESTINATIONCD: {varchar(30)}
     */
    public void setDestinationcd_IsNotNull() { regDestinationcd(CK_ISNN, DOBJ); }

    protected void regDestinationcd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDestinationcd(), "DESTINATIONCD"); }
    protected abstract ConditionValue xgetCValueDestinationcd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MANUFACTURECD: {varchar(30)}
     * @param manufacturecd The value of manufacturecd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufacturecd_Equal(String manufacturecd) {
        doSetManufacturecd_Equal(fRES(manufacturecd));
    }

    protected void doSetManufacturecd_Equal(String manufacturecd) {
        regManufacturecd(CK_EQ, manufacturecd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MANUFACTURECD: {varchar(30)}
     * @param manufacturecd The value of manufacturecd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufacturecd_NotEqual(String manufacturecd) {
        doSetManufacturecd_NotEqual(fRES(manufacturecd));
    }

    protected void doSetManufacturecd_NotEqual(String manufacturecd) {
        regManufacturecd(CK_NES, manufacturecd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MANUFACTURECD: {varchar(30)}
     * @param manufacturecd The value of manufacturecd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufacturecd_GreaterThan(String manufacturecd) {
        regManufacturecd(CK_GT, fRES(manufacturecd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MANUFACTURECD: {varchar(30)}
     * @param manufacturecd The value of manufacturecd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufacturecd_LessThan(String manufacturecd) {
        regManufacturecd(CK_LT, fRES(manufacturecd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MANUFACTURECD: {varchar(30)}
     * @param manufacturecd The value of manufacturecd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufacturecd_GreaterEqual(String manufacturecd) {
        regManufacturecd(CK_GE, fRES(manufacturecd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MANUFACTURECD: {varchar(30)}
     * @param manufacturecd The value of manufacturecd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufacturecd_LessEqual(String manufacturecd) {
        regManufacturecd(CK_LE, fRES(manufacturecd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MANUFACTURECD: {varchar(30)}
     * @param manufacturecdList The collection of manufacturecd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufacturecd_InScope(Collection<String> manufacturecdList) {
        doSetManufacturecd_InScope(manufacturecdList);
    }

    protected void doSetManufacturecd_InScope(Collection<String> manufacturecdList) {
        regINS(CK_INS, cTL(manufacturecdList), xgetCValueManufacturecd(), "MANUFACTURECD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MANUFACTURECD: {varchar(30)}
     * @param manufacturecdList The collection of manufacturecd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufacturecd_NotInScope(Collection<String> manufacturecdList) {
        doSetManufacturecd_NotInScope(manufacturecdList);
    }

    protected void doSetManufacturecd_NotInScope(Collection<String> manufacturecdList) {
        regINS(CK_NINS, cTL(manufacturecdList), xgetCValueManufacturecd(), "MANUFACTURECD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MANUFACTURECD: {varchar(30)} <br>
     * <pre>e.g. setManufacturecd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param manufacturecd The value of manufacturecd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setManufacturecd_LikeSearch(String manufacturecd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(manufacturecd), xgetCValueManufacturecd(), "MANUFACTURECD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MANUFACTURECD: {varchar(30)}
     * @param manufacturecd The value of manufacturecd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setManufacturecd_NotLikeSearch(String manufacturecd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(manufacturecd), xgetCValueManufacturecd(), "MANUFACTURECD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MANUFACTURECD: {varchar(30)}
     * @param manufacturecd The value of manufacturecd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufacturecd_PrefixSearch(String manufacturecd) {
        setManufacturecd_LikeSearch(manufacturecd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MANUFACTURECD: {varchar(30)}
     */
    public void setManufacturecd_IsNull() { regManufacturecd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * MANUFACTURECD: {varchar(30)}
     */
    public void setManufacturecd_IsNullOrEmpty() { regManufacturecd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MANUFACTURECD: {varchar(30)}
     */
    public void setManufacturecd_IsNotNull() { regManufacturecd(CK_ISNN, DOBJ); }

    protected void regManufacturecd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueManufacturecd(), "MANUFACTURECD"); }
    protected abstract ConditionValue xgetCValueManufacturecd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDERNO: {varchar(30)}
     * @param orderno The value of orderno as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderno_Equal(String orderno) {
        doSetOrderno_Equal(fRES(orderno));
    }

    protected void doSetOrderno_Equal(String orderno) {
        regOrderno(CK_EQ, orderno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDERNO: {varchar(30)}
     * @param orderno The value of orderno as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderno_NotEqual(String orderno) {
        doSetOrderno_NotEqual(fRES(orderno));
    }

    protected void doSetOrderno_NotEqual(String orderno) {
        regOrderno(CK_NES, orderno);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDERNO: {varchar(30)}
     * @param orderno The value of orderno as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderno_GreaterThan(String orderno) {
        regOrderno(CK_GT, fRES(orderno));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDERNO: {varchar(30)}
     * @param orderno The value of orderno as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderno_LessThan(String orderno) {
        regOrderno(CK_LT, fRES(orderno));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDERNO: {varchar(30)}
     * @param orderno The value of orderno as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderno_GreaterEqual(String orderno) {
        regOrderno(CK_GE, fRES(orderno));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDERNO: {varchar(30)}
     * @param orderno The value of orderno as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderno_LessEqual(String orderno) {
        regOrderno(CK_LE, fRES(orderno));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORDERNO: {varchar(30)}
     * @param ordernoList The collection of orderno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderno_InScope(Collection<String> ordernoList) {
        doSetOrderno_InScope(ordernoList);
    }

    protected void doSetOrderno_InScope(Collection<String> ordernoList) {
        regINS(CK_INS, cTL(ordernoList), xgetCValueOrderno(), "ORDERNO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORDERNO: {varchar(30)}
     * @param ordernoList The collection of orderno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderno_NotInScope(Collection<String> ordernoList) {
        doSetOrderno_NotInScope(ordernoList);
    }

    protected void doSetOrderno_NotInScope(Collection<String> ordernoList) {
        regINS(CK_NINS, cTL(ordernoList), xgetCValueOrderno(), "ORDERNO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDERNO: {varchar(30)} <br>
     * <pre>e.g. setOrderno_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param orderno The value of orderno as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOrderno_LikeSearch(String orderno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(orderno), xgetCValueOrderno(), "ORDERNO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDERNO: {varchar(30)}
     * @param orderno The value of orderno as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOrderno_NotLikeSearch(String orderno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(orderno), xgetCValueOrderno(), "ORDERNO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDERNO: {varchar(30)}
     * @param orderno The value of orderno as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderno_PrefixSearch(String orderno) {
        setOrderno_LikeSearch(orderno, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ORDERNO: {varchar(30)}
     */
    public void setOrderno_IsNull() { regOrderno(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ORDERNO: {varchar(30)}
     */
    public void setOrderno_IsNullOrEmpty() { regOrderno(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ORDERNO: {varchar(30)}
     */
    public void setOrderno_IsNotNull() { regOrderno(CK_ISNN, DOBJ); }

    protected void regOrderno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOrderno(), "ORDERNO"); }
    protected abstract ConditionValue xgetCValueOrderno();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MACHINENO: {varchar(30)}
     * @param machineno The value of machineno as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMachineno_Equal(String machineno) {
        doSetMachineno_Equal(fRES(machineno));
    }

    protected void doSetMachineno_Equal(String machineno) {
        regMachineno(CK_EQ, machineno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MACHINENO: {varchar(30)}
     * @param machineno The value of machineno as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMachineno_NotEqual(String machineno) {
        doSetMachineno_NotEqual(fRES(machineno));
    }

    protected void doSetMachineno_NotEqual(String machineno) {
        regMachineno(CK_NES, machineno);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MACHINENO: {varchar(30)}
     * @param machineno The value of machineno as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMachineno_GreaterThan(String machineno) {
        regMachineno(CK_GT, fRES(machineno));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MACHINENO: {varchar(30)}
     * @param machineno The value of machineno as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMachineno_LessThan(String machineno) {
        regMachineno(CK_LT, fRES(machineno));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MACHINENO: {varchar(30)}
     * @param machineno The value of machineno as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMachineno_GreaterEqual(String machineno) {
        regMachineno(CK_GE, fRES(machineno));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MACHINENO: {varchar(30)}
     * @param machineno The value of machineno as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMachineno_LessEqual(String machineno) {
        regMachineno(CK_LE, fRES(machineno));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MACHINENO: {varchar(30)}
     * @param machinenoList The collection of machineno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMachineno_InScope(Collection<String> machinenoList) {
        doSetMachineno_InScope(machinenoList);
    }

    protected void doSetMachineno_InScope(Collection<String> machinenoList) {
        regINS(CK_INS, cTL(machinenoList), xgetCValueMachineno(), "MACHINENO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MACHINENO: {varchar(30)}
     * @param machinenoList The collection of machineno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMachineno_NotInScope(Collection<String> machinenoList) {
        doSetMachineno_NotInScope(machinenoList);
    }

    protected void doSetMachineno_NotInScope(Collection<String> machinenoList) {
        regINS(CK_NINS, cTL(machinenoList), xgetCValueMachineno(), "MACHINENO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MACHINENO: {varchar(30)} <br>
     * <pre>e.g. setMachineno_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param machineno The value of machineno as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setMachineno_LikeSearch(String machineno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(machineno), xgetCValueMachineno(), "MACHINENO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MACHINENO: {varchar(30)}
     * @param machineno The value of machineno as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setMachineno_NotLikeSearch(String machineno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(machineno), xgetCValueMachineno(), "MACHINENO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MACHINENO: {varchar(30)}
     * @param machineno The value of machineno as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMachineno_PrefixSearch(String machineno) {
        setMachineno_LikeSearch(machineno, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MACHINENO: {varchar(30)}
     */
    public void setMachineno_IsNull() { regMachineno(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * MACHINENO: {varchar(30)}
     */
    public void setMachineno_IsNullOrEmpty() { regMachineno(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MACHINENO: {varchar(30)}
     */
    public void setMachineno_IsNotNull() { regMachineno(CK_ISNN, DOBJ); }

    protected void regMachineno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMachineno(), "MACHINENO"); }
    protected abstract ConditionValue xgetCValueMachineno();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CREATENO: {varchar(30)}
     * @param createno The value of createno as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreateno_Equal(String createno) {
        doSetCreateno_Equal(fRES(createno));
    }

    protected void doSetCreateno_Equal(String createno) {
        regCreateno(CK_EQ, createno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CREATENO: {varchar(30)}
     * @param createno The value of createno as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreateno_NotEqual(String createno) {
        doSetCreateno_NotEqual(fRES(createno));
    }

    protected void doSetCreateno_NotEqual(String createno) {
        regCreateno(CK_NES, createno);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CREATENO: {varchar(30)}
     * @param createno The value of createno as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreateno_GreaterThan(String createno) {
        regCreateno(CK_GT, fRES(createno));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CREATENO: {varchar(30)}
     * @param createno The value of createno as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreateno_LessThan(String createno) {
        regCreateno(CK_LT, fRES(createno));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CREATENO: {varchar(30)}
     * @param createno The value of createno as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreateno_GreaterEqual(String createno) {
        regCreateno(CK_GE, fRES(createno));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CREATENO: {varchar(30)}
     * @param createno The value of createno as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreateno_LessEqual(String createno) {
        regCreateno(CK_LE, fRES(createno));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CREATENO: {varchar(30)}
     * @param createnoList The collection of createno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreateno_InScope(Collection<String> createnoList) {
        doSetCreateno_InScope(createnoList);
    }

    protected void doSetCreateno_InScope(Collection<String> createnoList) {
        regINS(CK_INS, cTL(createnoList), xgetCValueCreateno(), "CREATENO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CREATENO: {varchar(30)}
     * @param createnoList The collection of createno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreateno_NotInScope(Collection<String> createnoList) {
        doSetCreateno_NotInScope(createnoList);
    }

    protected void doSetCreateno_NotInScope(Collection<String> createnoList) {
        regINS(CK_NINS, cTL(createnoList), xgetCValueCreateno(), "CREATENO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CREATENO: {varchar(30)} <br>
     * <pre>e.g. setCreateno_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param createno The value of createno as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCreateno_LikeSearch(String createno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(createno), xgetCValueCreateno(), "CREATENO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CREATENO: {varchar(30)}
     * @param createno The value of createno as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCreateno_NotLikeSearch(String createno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(createno), xgetCValueCreateno(), "CREATENO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CREATENO: {varchar(30)}
     * @param createno The value of createno as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreateno_PrefixSearch(String createno) {
        setCreateno_LikeSearch(createno, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CREATENO: {varchar(30)}
     */
    public void setCreateno_IsNull() { regCreateno(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CREATENO: {varchar(30)}
     */
    public void setCreateno_IsNullOrEmpty() { regCreateno(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CREATENO: {varchar(30)}
     */
    public void setCreateno_IsNotNull() { regCreateno(CK_ISNN, DOBJ); }

    protected void regCreateno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCreateno(), "CREATENO"); }
    protected abstract ConditionValue xgetCValueCreateno();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMITDATE: {varchar(8)}
     * @param limitdate The value of limitdate as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitdate_Equal(String limitdate) {
        doSetLimitdate_Equal(fRES(limitdate));
    }

    protected void doSetLimitdate_Equal(String limitdate) {
        regLimitdate(CK_EQ, limitdate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMITDATE: {varchar(8)}
     * @param limitdate The value of limitdate as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitdate_NotEqual(String limitdate) {
        doSetLimitdate_NotEqual(fRES(limitdate));
    }

    protected void doSetLimitdate_NotEqual(String limitdate) {
        regLimitdate(CK_NES, limitdate);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMITDATE: {varchar(8)}
     * @param limitdate The value of limitdate as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitdate_GreaterThan(String limitdate) {
        regLimitdate(CK_GT, fRES(limitdate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMITDATE: {varchar(8)}
     * @param limitdate The value of limitdate as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitdate_LessThan(String limitdate) {
        regLimitdate(CK_LT, fRES(limitdate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMITDATE: {varchar(8)}
     * @param limitdate The value of limitdate as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitdate_GreaterEqual(String limitdate) {
        regLimitdate(CK_GE, fRES(limitdate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMITDATE: {varchar(8)}
     * @param limitdate The value of limitdate as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitdate_LessEqual(String limitdate) {
        regLimitdate(CK_LE, fRES(limitdate));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LIMITDATE: {varchar(8)}
     * @param limitdateList The collection of limitdate as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitdate_InScope(Collection<String> limitdateList) {
        doSetLimitdate_InScope(limitdateList);
    }

    protected void doSetLimitdate_InScope(Collection<String> limitdateList) {
        regINS(CK_INS, cTL(limitdateList), xgetCValueLimitdate(), "LIMITDATE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LIMITDATE: {varchar(8)}
     * @param limitdateList The collection of limitdate as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitdate_NotInScope(Collection<String> limitdateList) {
        doSetLimitdate_NotInScope(limitdateList);
    }

    protected void doSetLimitdate_NotInScope(Collection<String> limitdateList) {
        regINS(CK_NINS, cTL(limitdateList), xgetCValueLimitdate(), "LIMITDATE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LIMITDATE: {varchar(8)} <br>
     * <pre>e.g. setLimitdate_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param limitdate The value of limitdate as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLimitdate_LikeSearch(String limitdate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(limitdate), xgetCValueLimitdate(), "LIMITDATE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LIMITDATE: {varchar(8)}
     * @param limitdate The value of limitdate as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLimitdate_NotLikeSearch(String limitdate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(limitdate), xgetCValueLimitdate(), "LIMITDATE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LIMITDATE: {varchar(8)}
     * @param limitdate The value of limitdate as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitdate_PrefixSearch(String limitdate) {
        setLimitdate_LikeSearch(limitdate, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LIMITDATE: {varchar(8)}
     */
    public void setLimitdate_IsNull() { regLimitdate(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LIMITDATE: {varchar(8)}
     */
    public void setLimitdate_IsNullOrEmpty() { regLimitdate(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LIMITDATE: {varchar(8)}
     */
    public void setLimitdate_IsNotNull() { regLimitdate(CK_ISNN, DOBJ); }

    protected void regLimitdate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLimitdate(), "LIMITDATE"); }
    protected abstract ConditionValue xgetCValueLimitdate();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATETIME: {varchar(8)}
     * @param datetime The value of datetime as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDatetime_Equal(String datetime) {
        doSetDatetime_Equal(fRES(datetime));
    }

    protected void doSetDatetime_Equal(String datetime) {
        regDatetime(CK_EQ, datetime);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATETIME: {varchar(8)}
     * @param datetime The value of datetime as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDatetime_NotEqual(String datetime) {
        doSetDatetime_NotEqual(fRES(datetime));
    }

    protected void doSetDatetime_NotEqual(String datetime) {
        regDatetime(CK_NES, datetime);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATETIME: {varchar(8)}
     * @param datetime The value of datetime as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDatetime_GreaterThan(String datetime) {
        regDatetime(CK_GT, fRES(datetime));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATETIME: {varchar(8)}
     * @param datetime The value of datetime as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDatetime_LessThan(String datetime) {
        regDatetime(CK_LT, fRES(datetime));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATETIME: {varchar(8)}
     * @param datetime The value of datetime as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDatetime_GreaterEqual(String datetime) {
        regDatetime(CK_GE, fRES(datetime));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATETIME: {varchar(8)}
     * @param datetime The value of datetime as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDatetime_LessEqual(String datetime) {
        regDatetime(CK_LE, fRES(datetime));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DATETIME: {varchar(8)}
     * @param datetimeList The collection of datetime as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDatetime_InScope(Collection<String> datetimeList) {
        doSetDatetime_InScope(datetimeList);
    }

    protected void doSetDatetime_InScope(Collection<String> datetimeList) {
        regINS(CK_INS, cTL(datetimeList), xgetCValueDatetime(), "DATETIME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DATETIME: {varchar(8)}
     * @param datetimeList The collection of datetime as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDatetime_NotInScope(Collection<String> datetimeList) {
        doSetDatetime_NotInScope(datetimeList);
    }

    protected void doSetDatetime_NotInScope(Collection<String> datetimeList) {
        regINS(CK_NINS, cTL(datetimeList), xgetCValueDatetime(), "DATETIME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATETIME: {varchar(8)} <br>
     * <pre>e.g. setDatetime_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param datetime The value of datetime as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDatetime_LikeSearch(String datetime, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(datetime), xgetCValueDatetime(), "DATETIME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATETIME: {varchar(8)}
     * @param datetime The value of datetime as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDatetime_NotLikeSearch(String datetime, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(datetime), xgetCValueDatetime(), "DATETIME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATETIME: {varchar(8)}
     * @param datetime The value of datetime as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDatetime_PrefixSearch(String datetime) {
        setDatetime_LikeSearch(datetime, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DATETIME: {varchar(8)}
     */
    public void setDatetime_IsNull() { regDatetime(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DATETIME: {varchar(8)}
     */
    public void setDatetime_IsNullOrEmpty() { regDatetime(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DATETIME: {varchar(8)}
     */
    public void setDatetime_IsNotNull() { regDatetime(CK_ISNN, DOBJ); }

    protected void regDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDatetime(), "DATETIME"); }
    protected abstract ConditionValue xgetCValueDatetime();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DISTRIBUTIONCD: {char(1)}
     * @param distributioncd The value of distributioncd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistributioncd_Equal(String distributioncd) {
        doSetDistributioncd_Equal(fRES(distributioncd));
    }

    protected void doSetDistributioncd_Equal(String distributioncd) {
        regDistributioncd(CK_EQ, distributioncd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DISTRIBUTIONCD: {char(1)}
     * @param distributioncd The value of distributioncd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistributioncd_NotEqual(String distributioncd) {
        doSetDistributioncd_NotEqual(fRES(distributioncd));
    }

    protected void doSetDistributioncd_NotEqual(String distributioncd) {
        regDistributioncd(CK_NES, distributioncd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DISTRIBUTIONCD: {char(1)}
     * @param distributioncd The value of distributioncd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistributioncd_GreaterThan(String distributioncd) {
        regDistributioncd(CK_GT, fRES(distributioncd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DISTRIBUTIONCD: {char(1)}
     * @param distributioncd The value of distributioncd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistributioncd_LessThan(String distributioncd) {
        regDistributioncd(CK_LT, fRES(distributioncd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DISTRIBUTIONCD: {char(1)}
     * @param distributioncd The value of distributioncd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistributioncd_GreaterEqual(String distributioncd) {
        regDistributioncd(CK_GE, fRES(distributioncd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DISTRIBUTIONCD: {char(1)}
     * @param distributioncd The value of distributioncd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistributioncd_LessEqual(String distributioncd) {
        regDistributioncd(CK_LE, fRES(distributioncd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DISTRIBUTIONCD: {char(1)}
     * @param distributioncdList The collection of distributioncd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistributioncd_InScope(Collection<String> distributioncdList) {
        doSetDistributioncd_InScope(distributioncdList);
    }

    protected void doSetDistributioncd_InScope(Collection<String> distributioncdList) {
        regINS(CK_INS, cTL(distributioncdList), xgetCValueDistributioncd(), "DISTRIBUTIONCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DISTRIBUTIONCD: {char(1)}
     * @param distributioncdList The collection of distributioncd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistributioncd_NotInScope(Collection<String> distributioncdList) {
        doSetDistributioncd_NotInScope(distributioncdList);
    }

    protected void doSetDistributioncd_NotInScope(Collection<String> distributioncdList) {
        regINS(CK_NINS, cTL(distributioncdList), xgetCValueDistributioncd(), "DISTRIBUTIONCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DISTRIBUTIONCD: {char(1)} <br>
     * <pre>e.g. setDistributioncd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param distributioncd The value of distributioncd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDistributioncd_LikeSearch(String distributioncd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(distributioncd), xgetCValueDistributioncd(), "DISTRIBUTIONCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DISTRIBUTIONCD: {char(1)}
     * @param distributioncd The value of distributioncd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDistributioncd_NotLikeSearch(String distributioncd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(distributioncd), xgetCValueDistributioncd(), "DISTRIBUTIONCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DISTRIBUTIONCD: {char(1)}
     * @param distributioncd The value of distributioncd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistributioncd_PrefixSearch(String distributioncd) {
        setDistributioncd_LikeSearch(distributioncd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DISTRIBUTIONCD: {char(1)}
     */
    public void setDistributioncd_IsNull() { regDistributioncd(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DISTRIBUTIONCD: {char(1)}
     */
    public void setDistributioncd_IsNotNull() { regDistributioncd(CK_ISNN, DOBJ); }

    protected void regDistributioncd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDistributioncd(), "DISTRIBUTIONCD"); }
    protected abstract ConditionValue xgetCValueDistributioncd();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * OPERATIONNUM: {bigint(19)}
     * @param operationnum The value of operationnum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setOperationnum_Equal(Long operationnum) {
        doSetOperationnum_Equal(operationnum);
    }

    protected void doSetOperationnum_Equal(Long operationnum) {
        regOperationnum(CK_EQ, operationnum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * OPERATIONNUM: {bigint(19)}
     * @param operationnum The value of operationnum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOperationnum_NotEqual(Long operationnum) {
        doSetOperationnum_NotEqual(operationnum);
    }

    protected void doSetOperationnum_NotEqual(Long operationnum) {
        regOperationnum(CK_NES, operationnum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * OPERATIONNUM: {bigint(19)}
     * @param operationnum The value of operationnum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setOperationnum_GreaterThan(Long operationnum) {
        regOperationnum(CK_GT, operationnum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * OPERATIONNUM: {bigint(19)}
     * @param operationnum The value of operationnum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setOperationnum_LessThan(Long operationnum) {
        regOperationnum(CK_LT, operationnum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * OPERATIONNUM: {bigint(19)}
     * @param operationnum The value of operationnum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOperationnum_GreaterEqual(Long operationnum) {
        regOperationnum(CK_GE, operationnum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * OPERATIONNUM: {bigint(19)}
     * @param operationnum The value of operationnum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOperationnum_LessEqual(Long operationnum) {
        regOperationnum(CK_LE, operationnum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * OPERATIONNUM: {bigint(19)}
     * @param minNumber The min number of operationnum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of operationnum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setOperationnum_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueOperationnum(), "OPERATIONNUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * OPERATIONNUM: {bigint(19)}
     * @param operationnumList The collection of operationnum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOperationnum_InScope(Collection<Long> operationnumList) {
        doSetOperationnum_InScope(operationnumList);
    }

    protected void doSetOperationnum_InScope(Collection<Long> operationnumList) {
        regINS(CK_INS, cTL(operationnumList), xgetCValueOperationnum(), "OPERATIONNUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * OPERATIONNUM: {bigint(19)}
     * @param operationnumList The collection of operationnum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOperationnum_NotInScope(Collection<Long> operationnumList) {
        doSetOperationnum_NotInScope(operationnumList);
    }

    protected void doSetOperationnum_NotInScope(Collection<Long> operationnumList) {
        regINS(CK_NINS, cTL(operationnumList), xgetCValueOperationnum(), "OPERATIONNUM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * OPERATIONNUM: {bigint(19)}
     */
    public void setOperationnum_IsNull() { regOperationnum(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * OPERATIONNUM: {bigint(19)}
     */
    public void setOperationnum_IsNotNull() { regOperationnum(CK_ISNN, DOBJ); }

    protected void regOperationnum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOperationnum(), "OPERATIONNUM"); }
    protected abstract ConditionValue xgetCValueOperationnum();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVKEY: {decimal(16, 6)}
     * @param rcvkey The value of rcvkey as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvkey_Equal(java.math.BigDecimal rcvkey) {
        doSetRcvkey_Equal(rcvkey);
    }

    protected void doSetRcvkey_Equal(java.math.BigDecimal rcvkey) {
        regRcvkey(CK_EQ, rcvkey);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVKEY: {decimal(16, 6)}
     * @param rcvkey The value of rcvkey as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvkey_NotEqual(java.math.BigDecimal rcvkey) {
        doSetRcvkey_NotEqual(rcvkey);
    }

    protected void doSetRcvkey_NotEqual(java.math.BigDecimal rcvkey) {
        regRcvkey(CK_NES, rcvkey);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVKEY: {decimal(16, 6)}
     * @param rcvkey The value of rcvkey as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvkey_GreaterThan(java.math.BigDecimal rcvkey) {
        regRcvkey(CK_GT, rcvkey);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVKEY: {decimal(16, 6)}
     * @param rcvkey The value of rcvkey as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvkey_LessThan(java.math.BigDecimal rcvkey) {
        regRcvkey(CK_LT, rcvkey);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVKEY: {decimal(16, 6)}
     * @param rcvkey The value of rcvkey as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvkey_GreaterEqual(java.math.BigDecimal rcvkey) {
        regRcvkey(CK_GE, rcvkey);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVKEY: {decimal(16, 6)}
     * @param rcvkey The value of rcvkey as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvkey_LessEqual(java.math.BigDecimal rcvkey) {
        regRcvkey(CK_LE, rcvkey);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * RCVKEY: {decimal(16, 6)}
     * @param minNumber The min number of rcvkey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of rcvkey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setRcvkey_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueRcvkey(), "RCVKEY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RCVKEY: {decimal(16, 6)}
     * @param rcvkeyList The collection of rcvkey as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvkey_InScope(Collection<java.math.BigDecimal> rcvkeyList) {
        doSetRcvkey_InScope(rcvkeyList);
    }

    protected void doSetRcvkey_InScope(Collection<java.math.BigDecimal> rcvkeyList) {
        regINS(CK_INS, cTL(rcvkeyList), xgetCValueRcvkey(), "RCVKEY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RCVKEY: {decimal(16, 6)}
     * @param rcvkeyList The collection of rcvkey as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvkey_NotInScope(Collection<java.math.BigDecimal> rcvkeyList) {
        doSetRcvkey_NotInScope(rcvkeyList);
    }

    protected void doSetRcvkey_NotInScope(Collection<java.math.BigDecimal> rcvkeyList) {
        regINS(CK_NINS, cTL(rcvkeyList), xgetCValueRcvkey(), "RCVKEY");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RCVKEY: {decimal(16, 6)}
     */
    public void setRcvkey_IsNull() { regRcvkey(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RCVKEY: {decimal(16, 6)}
     */
    public void setRcvkey_IsNotNull() { regRcvkey(CK_ISNN, DOBJ); }

    protected void regRcvkey(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRcvkey(), "RCVKEY"); }
    protected abstract ConditionValue xgetCValueRcvkey();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FIRMCARRYNO: {varchar(30)}
     * @param firmcarryno The value of firmcarryno as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirmcarryno_Equal(String firmcarryno) {
        doSetFirmcarryno_Equal(fRES(firmcarryno));
    }

    protected void doSetFirmcarryno_Equal(String firmcarryno) {
        regFirmcarryno(CK_EQ, firmcarryno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FIRMCARRYNO: {varchar(30)}
     * @param firmcarryno The value of firmcarryno as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirmcarryno_NotEqual(String firmcarryno) {
        doSetFirmcarryno_NotEqual(fRES(firmcarryno));
    }

    protected void doSetFirmcarryno_NotEqual(String firmcarryno) {
        regFirmcarryno(CK_NES, firmcarryno);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FIRMCARRYNO: {varchar(30)}
     * @param firmcarryno The value of firmcarryno as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirmcarryno_GreaterThan(String firmcarryno) {
        regFirmcarryno(CK_GT, fRES(firmcarryno));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FIRMCARRYNO: {varchar(30)}
     * @param firmcarryno The value of firmcarryno as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirmcarryno_LessThan(String firmcarryno) {
        regFirmcarryno(CK_LT, fRES(firmcarryno));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FIRMCARRYNO: {varchar(30)}
     * @param firmcarryno The value of firmcarryno as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirmcarryno_GreaterEqual(String firmcarryno) {
        regFirmcarryno(CK_GE, fRES(firmcarryno));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FIRMCARRYNO: {varchar(30)}
     * @param firmcarryno The value of firmcarryno as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirmcarryno_LessEqual(String firmcarryno) {
        regFirmcarryno(CK_LE, fRES(firmcarryno));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FIRMCARRYNO: {varchar(30)}
     * @param firmcarrynoList The collection of firmcarryno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirmcarryno_InScope(Collection<String> firmcarrynoList) {
        doSetFirmcarryno_InScope(firmcarrynoList);
    }

    protected void doSetFirmcarryno_InScope(Collection<String> firmcarrynoList) {
        regINS(CK_INS, cTL(firmcarrynoList), xgetCValueFirmcarryno(), "FIRMCARRYNO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FIRMCARRYNO: {varchar(30)}
     * @param firmcarrynoList The collection of firmcarryno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirmcarryno_NotInScope(Collection<String> firmcarrynoList) {
        doSetFirmcarryno_NotInScope(firmcarrynoList);
    }

    protected void doSetFirmcarryno_NotInScope(Collection<String> firmcarrynoList) {
        regINS(CK_NINS, cTL(firmcarrynoList), xgetCValueFirmcarryno(), "FIRMCARRYNO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FIRMCARRYNO: {varchar(30)} <br>
     * <pre>e.g. setFirmcarryno_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param firmcarryno The value of firmcarryno as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFirmcarryno_LikeSearch(String firmcarryno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(firmcarryno), xgetCValueFirmcarryno(), "FIRMCARRYNO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FIRMCARRYNO: {varchar(30)}
     * @param firmcarryno The value of firmcarryno as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFirmcarryno_NotLikeSearch(String firmcarryno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(firmcarryno), xgetCValueFirmcarryno(), "FIRMCARRYNO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FIRMCARRYNO: {varchar(30)}
     * @param firmcarryno The value of firmcarryno as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirmcarryno_PrefixSearch(String firmcarryno) {
        setFirmcarryno_LikeSearch(firmcarryno, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FIRMCARRYNO: {varchar(30)}
     */
    public void setFirmcarryno_IsNull() { regFirmcarryno(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * FIRMCARRYNO: {varchar(30)}
     */
    public void setFirmcarryno_IsNullOrEmpty() { regFirmcarryno(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FIRMCARRYNO: {varchar(30)}
     */
    public void setFirmcarryno_IsNotNull() { regFirmcarryno(CK_ISNN, DOBJ); }

    protected void regFirmcarryno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFirmcarryno(), "FIRMCARRYNO"); }
    protected abstract ConditionValue xgetCValueFirmcarryno();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BATJPRODUCTIONYM: {varchar(30)}
     * @param batjproductionym The value of batjproductionym as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatjproductionym_Equal(String batjproductionym) {
        doSetBatjproductionym_Equal(fRES(batjproductionym));
    }

    protected void doSetBatjproductionym_Equal(String batjproductionym) {
        regBatjproductionym(CK_EQ, batjproductionym);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BATJPRODUCTIONYM: {varchar(30)}
     * @param batjproductionym The value of batjproductionym as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatjproductionym_NotEqual(String batjproductionym) {
        doSetBatjproductionym_NotEqual(fRES(batjproductionym));
    }

    protected void doSetBatjproductionym_NotEqual(String batjproductionym) {
        regBatjproductionym(CK_NES, batjproductionym);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BATJPRODUCTIONYM: {varchar(30)}
     * @param batjproductionym The value of batjproductionym as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatjproductionym_GreaterThan(String batjproductionym) {
        regBatjproductionym(CK_GT, fRES(batjproductionym));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BATJPRODUCTIONYM: {varchar(30)}
     * @param batjproductionym The value of batjproductionym as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatjproductionym_LessThan(String batjproductionym) {
        regBatjproductionym(CK_LT, fRES(batjproductionym));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BATJPRODUCTIONYM: {varchar(30)}
     * @param batjproductionym The value of batjproductionym as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatjproductionym_GreaterEqual(String batjproductionym) {
        regBatjproductionym(CK_GE, fRES(batjproductionym));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BATJPRODUCTIONYM: {varchar(30)}
     * @param batjproductionym The value of batjproductionym as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatjproductionym_LessEqual(String batjproductionym) {
        regBatjproductionym(CK_LE, fRES(batjproductionym));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BATJPRODUCTIONYM: {varchar(30)}
     * @param batjproductionymList The collection of batjproductionym as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatjproductionym_InScope(Collection<String> batjproductionymList) {
        doSetBatjproductionym_InScope(batjproductionymList);
    }

    protected void doSetBatjproductionym_InScope(Collection<String> batjproductionymList) {
        regINS(CK_INS, cTL(batjproductionymList), xgetCValueBatjproductionym(), "BATJPRODUCTIONYM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BATJPRODUCTIONYM: {varchar(30)}
     * @param batjproductionymList The collection of batjproductionym as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatjproductionym_NotInScope(Collection<String> batjproductionymList) {
        doSetBatjproductionym_NotInScope(batjproductionymList);
    }

    protected void doSetBatjproductionym_NotInScope(Collection<String> batjproductionymList) {
        regINS(CK_NINS, cTL(batjproductionymList), xgetCValueBatjproductionym(), "BATJPRODUCTIONYM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BATJPRODUCTIONYM: {varchar(30)} <br>
     * <pre>e.g. setBatjproductionym_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param batjproductionym The value of batjproductionym as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBatjproductionym_LikeSearch(String batjproductionym, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(batjproductionym), xgetCValueBatjproductionym(), "BATJPRODUCTIONYM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BATJPRODUCTIONYM: {varchar(30)}
     * @param batjproductionym The value of batjproductionym as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBatjproductionym_NotLikeSearch(String batjproductionym, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(batjproductionym), xgetCValueBatjproductionym(), "BATJPRODUCTIONYM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BATJPRODUCTIONYM: {varchar(30)}
     * @param batjproductionym The value of batjproductionym as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatjproductionym_PrefixSearch(String batjproductionym) {
        setBatjproductionym_LikeSearch(batjproductionym, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BATJPRODUCTIONYM: {varchar(30)}
     */
    public void setBatjproductionym_IsNull() { regBatjproductionym(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * BATJPRODUCTIONYM: {varchar(30)}
     */
    public void setBatjproductionym_IsNullOrEmpty() { regBatjproductionym(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BATJPRODUCTIONYM: {varchar(30)}
     */
    public void setBatjproductionym_IsNotNull() { regBatjproductionym(CK_ISNN, DOBJ); }

    protected void regBatjproductionym(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBatjproductionym(), "BATJPRODUCTIONYM"); }
    protected abstract ConditionValue xgetCValueBatjproductionym();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMETODATE: {varchar(8)}
     * @param cometodate The value of cometodate as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCometodate_Equal(String cometodate) {
        doSetCometodate_Equal(fRES(cometodate));
    }

    protected void doSetCometodate_Equal(String cometodate) {
        regCometodate(CK_EQ, cometodate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMETODATE: {varchar(8)}
     * @param cometodate The value of cometodate as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCometodate_NotEqual(String cometodate) {
        doSetCometodate_NotEqual(fRES(cometodate));
    }

    protected void doSetCometodate_NotEqual(String cometodate) {
        regCometodate(CK_NES, cometodate);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMETODATE: {varchar(8)}
     * @param cometodate The value of cometodate as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCometodate_GreaterThan(String cometodate) {
        regCometodate(CK_GT, fRES(cometodate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMETODATE: {varchar(8)}
     * @param cometodate The value of cometodate as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCometodate_LessThan(String cometodate) {
        regCometodate(CK_LT, fRES(cometodate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMETODATE: {varchar(8)}
     * @param cometodate The value of cometodate as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCometodate_GreaterEqual(String cometodate) {
        regCometodate(CK_GE, fRES(cometodate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMETODATE: {varchar(8)}
     * @param cometodate The value of cometodate as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCometodate_LessEqual(String cometodate) {
        regCometodate(CK_LE, fRES(cometodate));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * COMETODATE: {varchar(8)}
     * @param cometodateList The collection of cometodate as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCometodate_InScope(Collection<String> cometodateList) {
        doSetCometodate_InScope(cometodateList);
    }

    protected void doSetCometodate_InScope(Collection<String> cometodateList) {
        regINS(CK_INS, cTL(cometodateList), xgetCValueCometodate(), "COMETODATE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * COMETODATE: {varchar(8)}
     * @param cometodateList The collection of cometodate as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCometodate_NotInScope(Collection<String> cometodateList) {
        doSetCometodate_NotInScope(cometodateList);
    }

    protected void doSetCometodate_NotInScope(Collection<String> cometodateList) {
        regINS(CK_NINS, cTL(cometodateList), xgetCValueCometodate(), "COMETODATE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COMETODATE: {varchar(8)} <br>
     * <pre>e.g. setCometodate_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param cometodate The value of cometodate as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCometodate_LikeSearch(String cometodate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(cometodate), xgetCValueCometodate(), "COMETODATE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COMETODATE: {varchar(8)}
     * @param cometodate The value of cometodate as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCometodate_NotLikeSearch(String cometodate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(cometodate), xgetCValueCometodate(), "COMETODATE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COMETODATE: {varchar(8)}
     * @param cometodate The value of cometodate as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCometodate_PrefixSearch(String cometodate) {
        setCometodate_LikeSearch(cometodate, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * COMETODATE: {varchar(8)}
     */
    public void setCometodate_IsNull() { regCometodate(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * COMETODATE: {varchar(8)}
     */
    public void setCometodate_IsNullOrEmpty() { regCometodate(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * COMETODATE: {varchar(8)}
     */
    public void setCometodate_IsNotNull() { regCometodate(CK_ISNN, DOBJ); }

    protected void regCometodate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCometodate(), "COMETODATE"); }
    protected abstract ConditionValue xgetCValueCometodate();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVEDATE: {varchar(8)}
     * @param receivedate The value of receivedate as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivedate_Equal(String receivedate) {
        doSetReceivedate_Equal(fRES(receivedate));
    }

    protected void doSetReceivedate_Equal(String receivedate) {
        regReceivedate(CK_EQ, receivedate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVEDATE: {varchar(8)}
     * @param receivedate The value of receivedate as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivedate_NotEqual(String receivedate) {
        doSetReceivedate_NotEqual(fRES(receivedate));
    }

    protected void doSetReceivedate_NotEqual(String receivedate) {
        regReceivedate(CK_NES, receivedate);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVEDATE: {varchar(8)}
     * @param receivedate The value of receivedate as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivedate_GreaterThan(String receivedate) {
        regReceivedate(CK_GT, fRES(receivedate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVEDATE: {varchar(8)}
     * @param receivedate The value of receivedate as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivedate_LessThan(String receivedate) {
        regReceivedate(CK_LT, fRES(receivedate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVEDATE: {varchar(8)}
     * @param receivedate The value of receivedate as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivedate_GreaterEqual(String receivedate) {
        regReceivedate(CK_GE, fRES(receivedate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVEDATE: {varchar(8)}
     * @param receivedate The value of receivedate as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivedate_LessEqual(String receivedate) {
        regReceivedate(CK_LE, fRES(receivedate));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RECEIVEDATE: {varchar(8)}
     * @param receivedateList The collection of receivedate as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivedate_InScope(Collection<String> receivedateList) {
        doSetReceivedate_InScope(receivedateList);
    }

    protected void doSetReceivedate_InScope(Collection<String> receivedateList) {
        regINS(CK_INS, cTL(receivedateList), xgetCValueReceivedate(), "RECEIVEDATE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RECEIVEDATE: {varchar(8)}
     * @param receivedateList The collection of receivedate as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivedate_NotInScope(Collection<String> receivedateList) {
        doSetReceivedate_NotInScope(receivedateList);
    }

    protected void doSetReceivedate_NotInScope(Collection<String> receivedateList) {
        regINS(CK_NINS, cTL(receivedateList), xgetCValueReceivedate(), "RECEIVEDATE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECEIVEDATE: {varchar(8)} <br>
     * <pre>e.g. setReceivedate_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param receivedate The value of receivedate as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setReceivedate_LikeSearch(String receivedate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(receivedate), xgetCValueReceivedate(), "RECEIVEDATE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECEIVEDATE: {varchar(8)}
     * @param receivedate The value of receivedate as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setReceivedate_NotLikeSearch(String receivedate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(receivedate), xgetCValueReceivedate(), "RECEIVEDATE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECEIVEDATE: {varchar(8)}
     * @param receivedate The value of receivedate as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivedate_PrefixSearch(String receivedate) {
        setReceivedate_LikeSearch(receivedate, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RECEIVEDATE: {varchar(8)}
     */
    public void setReceivedate_IsNull() { regReceivedate(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * RECEIVEDATE: {varchar(8)}
     */
    public void setReceivedate_IsNullOrEmpty() { regReceivedate(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RECEIVEDATE: {varchar(8)}
     */
    public void setReceivedate_IsNotNull() { regReceivedate(CK_ISNN, DOBJ); }

    protected void regReceivedate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReceivedate(), "RECEIVEDATE"); }
    protected abstract ConditionValue xgetCValueReceivedate();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARDBOARDNO: {varchar(30)}
     * @param cardboardno The value of cardboardno as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCardboardno_Equal(String cardboardno) {
        doSetCardboardno_Equal(fRES(cardboardno));
    }

    protected void doSetCardboardno_Equal(String cardboardno) {
        regCardboardno(CK_EQ, cardboardno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARDBOARDNO: {varchar(30)}
     * @param cardboardno The value of cardboardno as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCardboardno_NotEqual(String cardboardno) {
        doSetCardboardno_NotEqual(fRES(cardboardno));
    }

    protected void doSetCardboardno_NotEqual(String cardboardno) {
        regCardboardno(CK_NES, cardboardno);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARDBOARDNO: {varchar(30)}
     * @param cardboardno The value of cardboardno as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCardboardno_GreaterThan(String cardboardno) {
        regCardboardno(CK_GT, fRES(cardboardno));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARDBOARDNO: {varchar(30)}
     * @param cardboardno The value of cardboardno as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCardboardno_LessThan(String cardboardno) {
        regCardboardno(CK_LT, fRES(cardboardno));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARDBOARDNO: {varchar(30)}
     * @param cardboardno The value of cardboardno as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCardboardno_GreaterEqual(String cardboardno) {
        regCardboardno(CK_GE, fRES(cardboardno));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARDBOARDNO: {varchar(30)}
     * @param cardboardno The value of cardboardno as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCardboardno_LessEqual(String cardboardno) {
        regCardboardno(CK_LE, fRES(cardboardno));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CARDBOARDNO: {varchar(30)}
     * @param cardboardnoList The collection of cardboardno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCardboardno_InScope(Collection<String> cardboardnoList) {
        doSetCardboardno_InScope(cardboardnoList);
    }

    protected void doSetCardboardno_InScope(Collection<String> cardboardnoList) {
        regINS(CK_INS, cTL(cardboardnoList), xgetCValueCardboardno(), "CARDBOARDNO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CARDBOARDNO: {varchar(30)}
     * @param cardboardnoList The collection of cardboardno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCardboardno_NotInScope(Collection<String> cardboardnoList) {
        doSetCardboardno_NotInScope(cardboardnoList);
    }

    protected void doSetCardboardno_NotInScope(Collection<String> cardboardnoList) {
        regINS(CK_NINS, cTL(cardboardnoList), xgetCValueCardboardno(), "CARDBOARDNO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARDBOARDNO: {varchar(30)} <br>
     * <pre>e.g. setCardboardno_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param cardboardno The value of cardboardno as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCardboardno_LikeSearch(String cardboardno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(cardboardno), xgetCValueCardboardno(), "CARDBOARDNO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARDBOARDNO: {varchar(30)}
     * @param cardboardno The value of cardboardno as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCardboardno_NotLikeSearch(String cardboardno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(cardboardno), xgetCValueCardboardno(), "CARDBOARDNO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARDBOARDNO: {varchar(30)}
     * @param cardboardno The value of cardboardno as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCardboardno_PrefixSearch(String cardboardno) {
        setCardboardno_LikeSearch(cardboardno, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CARDBOARDNO: {varchar(30)}
     */
    public void setCardboardno_IsNull() { regCardboardno(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CARDBOARDNO: {varchar(30)}
     */
    public void setCardboardno_IsNullOrEmpty() { regCardboardno(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CARDBOARDNO: {varchar(30)}
     */
    public void setCardboardno_IsNotNull() { regCardboardno(CK_ISNN, DOBJ); }

    protected void regCardboardno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCardboardno(), "CARDBOARDNO"); }
    protected abstract ConditionValue xgetCValueCardboardno();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCVPALLETNO: {varchar(30)}
     * @param rcvpalletno The value of rcvpalletno as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvpalletno_Equal(String rcvpalletno) {
        doSetRcvpalletno_Equal(fRES(rcvpalletno));
    }

    protected void doSetRcvpalletno_Equal(String rcvpalletno) {
        regRcvpalletno(CK_EQ, rcvpalletno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCVPALLETNO: {varchar(30)}
     * @param rcvpalletno The value of rcvpalletno as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvpalletno_NotEqual(String rcvpalletno) {
        doSetRcvpalletno_NotEqual(fRES(rcvpalletno));
    }

    protected void doSetRcvpalletno_NotEqual(String rcvpalletno) {
        regRcvpalletno(CK_NES, rcvpalletno);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCVPALLETNO: {varchar(30)}
     * @param rcvpalletno The value of rcvpalletno as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvpalletno_GreaterThan(String rcvpalletno) {
        regRcvpalletno(CK_GT, fRES(rcvpalletno));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCVPALLETNO: {varchar(30)}
     * @param rcvpalletno The value of rcvpalletno as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvpalletno_LessThan(String rcvpalletno) {
        regRcvpalletno(CK_LT, fRES(rcvpalletno));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCVPALLETNO: {varchar(30)}
     * @param rcvpalletno The value of rcvpalletno as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvpalletno_GreaterEqual(String rcvpalletno) {
        regRcvpalletno(CK_GE, fRES(rcvpalletno));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCVPALLETNO: {varchar(30)}
     * @param rcvpalletno The value of rcvpalletno as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvpalletno_LessEqual(String rcvpalletno) {
        regRcvpalletno(CK_LE, fRES(rcvpalletno));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RCVPALLETNO: {varchar(30)}
     * @param rcvpalletnoList The collection of rcvpalletno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvpalletno_InScope(Collection<String> rcvpalletnoList) {
        doSetRcvpalletno_InScope(rcvpalletnoList);
    }

    protected void doSetRcvpalletno_InScope(Collection<String> rcvpalletnoList) {
        regINS(CK_INS, cTL(rcvpalletnoList), xgetCValueRcvpalletno(), "RCVPALLETNO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RCVPALLETNO: {varchar(30)}
     * @param rcvpalletnoList The collection of rcvpalletno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvpalletno_NotInScope(Collection<String> rcvpalletnoList) {
        doSetRcvpalletno_NotInScope(rcvpalletnoList);
    }

    protected void doSetRcvpalletno_NotInScope(Collection<String> rcvpalletnoList) {
        regINS(CK_NINS, cTL(rcvpalletnoList), xgetCValueRcvpalletno(), "RCVPALLETNO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RCVPALLETNO: {varchar(30)} <br>
     * <pre>e.g. setRcvpalletno_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param rcvpalletno The value of rcvpalletno as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setRcvpalletno_LikeSearch(String rcvpalletno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(rcvpalletno), xgetCValueRcvpalletno(), "RCVPALLETNO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RCVPALLETNO: {varchar(30)}
     * @param rcvpalletno The value of rcvpalletno as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setRcvpalletno_NotLikeSearch(String rcvpalletno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(rcvpalletno), xgetCValueRcvpalletno(), "RCVPALLETNO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RCVPALLETNO: {varchar(30)}
     * @param rcvpalletno The value of rcvpalletno as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvpalletno_PrefixSearch(String rcvpalletno) {
        setRcvpalletno_LikeSearch(rcvpalletno, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RCVPALLETNO: {varchar(30)}
     */
    public void setRcvpalletno_IsNull() { regRcvpalletno(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * RCVPALLETNO: {varchar(30)}
     */
    public void setRcvpalletno_IsNullOrEmpty() { regRcvpalletno(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RCVPALLETNO: {varchar(30)}
     */
    public void setRcvpalletno_IsNotNull() { regRcvpalletno(CK_ISNN, DOBJ); }

    protected void regRcvpalletno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRcvpalletno(), "RCVPALLETNO"); }
    protected abstract ConditionValue xgetCValueRcvpalletno();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TAXPALLETNO: {varchar(30)}
     * @param taxpalletno The value of taxpalletno as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTaxpalletno_Equal(String taxpalletno) {
        doSetTaxpalletno_Equal(fRES(taxpalletno));
    }

    protected void doSetTaxpalletno_Equal(String taxpalletno) {
        regTaxpalletno(CK_EQ, taxpalletno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TAXPALLETNO: {varchar(30)}
     * @param taxpalletno The value of taxpalletno as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTaxpalletno_NotEqual(String taxpalletno) {
        doSetTaxpalletno_NotEqual(fRES(taxpalletno));
    }

    protected void doSetTaxpalletno_NotEqual(String taxpalletno) {
        regTaxpalletno(CK_NES, taxpalletno);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TAXPALLETNO: {varchar(30)}
     * @param taxpalletno The value of taxpalletno as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTaxpalletno_GreaterThan(String taxpalletno) {
        regTaxpalletno(CK_GT, fRES(taxpalletno));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TAXPALLETNO: {varchar(30)}
     * @param taxpalletno The value of taxpalletno as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTaxpalletno_LessThan(String taxpalletno) {
        regTaxpalletno(CK_LT, fRES(taxpalletno));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TAXPALLETNO: {varchar(30)}
     * @param taxpalletno The value of taxpalletno as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTaxpalletno_GreaterEqual(String taxpalletno) {
        regTaxpalletno(CK_GE, fRES(taxpalletno));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TAXPALLETNO: {varchar(30)}
     * @param taxpalletno The value of taxpalletno as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTaxpalletno_LessEqual(String taxpalletno) {
        regTaxpalletno(CK_LE, fRES(taxpalletno));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TAXPALLETNO: {varchar(30)}
     * @param taxpalletnoList The collection of taxpalletno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTaxpalletno_InScope(Collection<String> taxpalletnoList) {
        doSetTaxpalletno_InScope(taxpalletnoList);
    }

    protected void doSetTaxpalletno_InScope(Collection<String> taxpalletnoList) {
        regINS(CK_INS, cTL(taxpalletnoList), xgetCValueTaxpalletno(), "TAXPALLETNO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TAXPALLETNO: {varchar(30)}
     * @param taxpalletnoList The collection of taxpalletno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTaxpalletno_NotInScope(Collection<String> taxpalletnoList) {
        doSetTaxpalletno_NotInScope(taxpalletnoList);
    }

    protected void doSetTaxpalletno_NotInScope(Collection<String> taxpalletnoList) {
        regINS(CK_NINS, cTL(taxpalletnoList), xgetCValueTaxpalletno(), "TAXPALLETNO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TAXPALLETNO: {varchar(30)} <br>
     * <pre>e.g. setTaxpalletno_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param taxpalletno The value of taxpalletno as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTaxpalletno_LikeSearch(String taxpalletno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(taxpalletno), xgetCValueTaxpalletno(), "TAXPALLETNO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TAXPALLETNO: {varchar(30)}
     * @param taxpalletno The value of taxpalletno as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTaxpalletno_NotLikeSearch(String taxpalletno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(taxpalletno), xgetCValueTaxpalletno(), "TAXPALLETNO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TAXPALLETNO: {varchar(30)}
     * @param taxpalletno The value of taxpalletno as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTaxpalletno_PrefixSearch(String taxpalletno) {
        setTaxpalletno_LikeSearch(taxpalletno, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TAXPALLETNO: {varchar(30)}
     */
    public void setTaxpalletno_IsNull() { regTaxpalletno(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TAXPALLETNO: {varchar(30)}
     */
    public void setTaxpalletno_IsNullOrEmpty() { regTaxpalletno(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TAXPALLETNO: {varchar(30)}
     */
    public void setTaxpalletno_IsNotNull() { regTaxpalletno(CK_ISNN, DOBJ); }

    protected void regTaxpalletno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTaxpalletno(), "TAXPALLETNO"); }
    protected abstract ConditionValue xgetCValueTaxpalletno();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMCD_IN: {varchar(30)}
     * @param itemcdIn The value of itemcdIn as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcdIn_Equal(String itemcdIn) {
        doSetItemcdIn_Equal(fRES(itemcdIn));
    }

    protected void doSetItemcdIn_Equal(String itemcdIn) {
        regItemcdIn(CK_EQ, itemcdIn);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMCD_IN: {varchar(30)}
     * @param itemcdIn The value of itemcdIn as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcdIn_NotEqual(String itemcdIn) {
        doSetItemcdIn_NotEqual(fRES(itemcdIn));
    }

    protected void doSetItemcdIn_NotEqual(String itemcdIn) {
        regItemcdIn(CK_NES, itemcdIn);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMCD_IN: {varchar(30)}
     * @param itemcdIn The value of itemcdIn as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcdIn_GreaterThan(String itemcdIn) {
        regItemcdIn(CK_GT, fRES(itemcdIn));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMCD_IN: {varchar(30)}
     * @param itemcdIn The value of itemcdIn as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcdIn_LessThan(String itemcdIn) {
        regItemcdIn(CK_LT, fRES(itemcdIn));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMCD_IN: {varchar(30)}
     * @param itemcdIn The value of itemcdIn as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcdIn_GreaterEqual(String itemcdIn) {
        regItemcdIn(CK_GE, fRES(itemcdIn));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMCD_IN: {varchar(30)}
     * @param itemcdIn The value of itemcdIn as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcdIn_LessEqual(String itemcdIn) {
        regItemcdIn(CK_LE, fRES(itemcdIn));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ITEMCD_IN: {varchar(30)}
     * @param itemcdInList The collection of itemcdIn as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcdIn_InScope(Collection<String> itemcdInList) {
        doSetItemcdIn_InScope(itemcdInList);
    }

    protected void doSetItemcdIn_InScope(Collection<String> itemcdInList) {
        regINS(CK_INS, cTL(itemcdInList), xgetCValueItemcdIn(), "ITEMCD_IN");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ITEMCD_IN: {varchar(30)}
     * @param itemcdInList The collection of itemcdIn as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcdIn_NotInScope(Collection<String> itemcdInList) {
        doSetItemcdIn_NotInScope(itemcdInList);
    }

    protected void doSetItemcdIn_NotInScope(Collection<String> itemcdInList) {
        regINS(CK_NINS, cTL(itemcdInList), xgetCValueItemcdIn(), "ITEMCD_IN");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEMCD_IN: {varchar(30)} <br>
     * <pre>e.g. setItemcdIn_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param itemcdIn The value of itemcdIn as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setItemcdIn_LikeSearch(String itemcdIn, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(itemcdIn), xgetCValueItemcdIn(), "ITEMCD_IN", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEMCD_IN: {varchar(30)}
     * @param itemcdIn The value of itemcdIn as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setItemcdIn_NotLikeSearch(String itemcdIn, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(itemcdIn), xgetCValueItemcdIn(), "ITEMCD_IN", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEMCD_IN: {varchar(30)}
     * @param itemcdIn The value of itemcdIn as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcdIn_PrefixSearch(String itemcdIn) {
        setItemcdIn_LikeSearch(itemcdIn, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ITEMCD_IN: {varchar(30)}
     */
    public void setItemcdIn_IsNull() { regItemcdIn(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ITEMCD_IN: {varchar(30)}
     */
    public void setItemcdIn_IsNullOrEmpty() { regItemcdIn(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ITEMCD_IN: {varchar(30)}
     */
    public void setItemcdIn_IsNotNull() { regItemcdIn(CK_ISNN, DOBJ); }

    protected void regItemcdIn(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueItemcdIn(), "ITEMCD_IN"); }
    protected abstract ConditionValue xgetCValueItemcdIn();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMCD_WH: {varchar(30)}
     * @param itemcdWh The value of itemcdWh as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcdWh_Equal(String itemcdWh) {
        doSetItemcdWh_Equal(fRES(itemcdWh));
    }

    protected void doSetItemcdWh_Equal(String itemcdWh) {
        regItemcdWh(CK_EQ, itemcdWh);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMCD_WH: {varchar(30)}
     * @param itemcdWh The value of itemcdWh as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcdWh_NotEqual(String itemcdWh) {
        doSetItemcdWh_NotEqual(fRES(itemcdWh));
    }

    protected void doSetItemcdWh_NotEqual(String itemcdWh) {
        regItemcdWh(CK_NES, itemcdWh);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMCD_WH: {varchar(30)}
     * @param itemcdWh The value of itemcdWh as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcdWh_GreaterThan(String itemcdWh) {
        regItemcdWh(CK_GT, fRES(itemcdWh));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMCD_WH: {varchar(30)}
     * @param itemcdWh The value of itemcdWh as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcdWh_LessThan(String itemcdWh) {
        regItemcdWh(CK_LT, fRES(itemcdWh));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMCD_WH: {varchar(30)}
     * @param itemcdWh The value of itemcdWh as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcdWh_GreaterEqual(String itemcdWh) {
        regItemcdWh(CK_GE, fRES(itemcdWh));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMCD_WH: {varchar(30)}
     * @param itemcdWh The value of itemcdWh as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcdWh_LessEqual(String itemcdWh) {
        regItemcdWh(CK_LE, fRES(itemcdWh));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ITEMCD_WH: {varchar(30)}
     * @param itemcdWhList The collection of itemcdWh as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcdWh_InScope(Collection<String> itemcdWhList) {
        doSetItemcdWh_InScope(itemcdWhList);
    }

    protected void doSetItemcdWh_InScope(Collection<String> itemcdWhList) {
        regINS(CK_INS, cTL(itemcdWhList), xgetCValueItemcdWh(), "ITEMCD_WH");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ITEMCD_WH: {varchar(30)}
     * @param itemcdWhList The collection of itemcdWh as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcdWh_NotInScope(Collection<String> itemcdWhList) {
        doSetItemcdWh_NotInScope(itemcdWhList);
    }

    protected void doSetItemcdWh_NotInScope(Collection<String> itemcdWhList) {
        regINS(CK_NINS, cTL(itemcdWhList), xgetCValueItemcdWh(), "ITEMCD_WH");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEMCD_WH: {varchar(30)} <br>
     * <pre>e.g. setItemcdWh_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param itemcdWh The value of itemcdWh as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setItemcdWh_LikeSearch(String itemcdWh, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(itemcdWh), xgetCValueItemcdWh(), "ITEMCD_WH", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEMCD_WH: {varchar(30)}
     * @param itemcdWh The value of itemcdWh as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setItemcdWh_NotLikeSearch(String itemcdWh, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(itemcdWh), xgetCValueItemcdWh(), "ITEMCD_WH", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEMCD_WH: {varchar(30)}
     * @param itemcdWh The value of itemcdWh as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcdWh_PrefixSearch(String itemcdWh) {
        setItemcdWh_LikeSearch(itemcdWh, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ITEMCD_WH: {varchar(30)}
     */
    public void setItemcdWh_IsNull() { regItemcdWh(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ITEMCD_WH: {varchar(30)}
     */
    public void setItemcdWh_IsNullOrEmpty() { regItemcdWh(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ITEMCD_WH: {varchar(30)}
     */
    public void setItemcdWh_IsNotNull() { regItemcdWh(CK_ISNN, DOBJ); }

    protected void regItemcdWh(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueItemcdWh(), "ITEMCD_WH"); }
    protected abstract ConditionValue xgetCValueItemcdWh();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESIGNCD_IN: {varchar(30)}
     * @param designcdIn The value of designcdIn as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesigncdIn_Equal(String designcdIn) {
        doSetDesigncdIn_Equal(fRES(designcdIn));
    }

    protected void doSetDesigncdIn_Equal(String designcdIn) {
        regDesigncdIn(CK_EQ, designcdIn);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESIGNCD_IN: {varchar(30)}
     * @param designcdIn The value of designcdIn as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesigncdIn_NotEqual(String designcdIn) {
        doSetDesigncdIn_NotEqual(fRES(designcdIn));
    }

    protected void doSetDesigncdIn_NotEqual(String designcdIn) {
        regDesigncdIn(CK_NES, designcdIn);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESIGNCD_IN: {varchar(30)}
     * @param designcdIn The value of designcdIn as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesigncdIn_GreaterThan(String designcdIn) {
        regDesigncdIn(CK_GT, fRES(designcdIn));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESIGNCD_IN: {varchar(30)}
     * @param designcdIn The value of designcdIn as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesigncdIn_LessThan(String designcdIn) {
        regDesigncdIn(CK_LT, fRES(designcdIn));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESIGNCD_IN: {varchar(30)}
     * @param designcdIn The value of designcdIn as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesigncdIn_GreaterEqual(String designcdIn) {
        regDesigncdIn(CK_GE, fRES(designcdIn));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESIGNCD_IN: {varchar(30)}
     * @param designcdIn The value of designcdIn as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesigncdIn_LessEqual(String designcdIn) {
        regDesigncdIn(CK_LE, fRES(designcdIn));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DESIGNCD_IN: {varchar(30)}
     * @param designcdInList The collection of designcdIn as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesigncdIn_InScope(Collection<String> designcdInList) {
        doSetDesigncdIn_InScope(designcdInList);
    }

    protected void doSetDesigncdIn_InScope(Collection<String> designcdInList) {
        regINS(CK_INS, cTL(designcdInList), xgetCValueDesigncdIn(), "DESIGNCD_IN");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DESIGNCD_IN: {varchar(30)}
     * @param designcdInList The collection of designcdIn as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesigncdIn_NotInScope(Collection<String> designcdInList) {
        doSetDesigncdIn_NotInScope(designcdInList);
    }

    protected void doSetDesigncdIn_NotInScope(Collection<String> designcdInList) {
        regINS(CK_NINS, cTL(designcdInList), xgetCValueDesigncdIn(), "DESIGNCD_IN");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESIGNCD_IN: {varchar(30)} <br>
     * <pre>e.g. setDesigncdIn_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param designcdIn The value of designcdIn as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDesigncdIn_LikeSearch(String designcdIn, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(designcdIn), xgetCValueDesigncdIn(), "DESIGNCD_IN", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESIGNCD_IN: {varchar(30)}
     * @param designcdIn The value of designcdIn as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDesigncdIn_NotLikeSearch(String designcdIn, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(designcdIn), xgetCValueDesigncdIn(), "DESIGNCD_IN", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESIGNCD_IN: {varchar(30)}
     * @param designcdIn The value of designcdIn as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesigncdIn_PrefixSearch(String designcdIn) {
        setDesigncdIn_LikeSearch(designcdIn, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DESIGNCD_IN: {varchar(30)}
     */
    public void setDesigncdIn_IsNull() { regDesigncdIn(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DESIGNCD_IN: {varchar(30)}
     */
    public void setDesigncdIn_IsNullOrEmpty() { regDesigncdIn(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DESIGNCD_IN: {varchar(30)}
     */
    public void setDesigncdIn_IsNotNull() { regDesigncdIn(CK_ISNN, DOBJ); }

    protected void regDesigncdIn(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDesigncdIn(), "DESIGNCD_IN"); }
    protected abstract ConditionValue xgetCValueDesigncdIn();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESIGNCD_WH: {varchar(30)}
     * @param designcdWh The value of designcdWh as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesigncdWh_Equal(String designcdWh) {
        doSetDesigncdWh_Equal(fRES(designcdWh));
    }

    protected void doSetDesigncdWh_Equal(String designcdWh) {
        regDesigncdWh(CK_EQ, designcdWh);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESIGNCD_WH: {varchar(30)}
     * @param designcdWh The value of designcdWh as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesigncdWh_NotEqual(String designcdWh) {
        doSetDesigncdWh_NotEqual(fRES(designcdWh));
    }

    protected void doSetDesigncdWh_NotEqual(String designcdWh) {
        regDesigncdWh(CK_NES, designcdWh);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESIGNCD_WH: {varchar(30)}
     * @param designcdWh The value of designcdWh as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesigncdWh_GreaterThan(String designcdWh) {
        regDesigncdWh(CK_GT, fRES(designcdWh));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESIGNCD_WH: {varchar(30)}
     * @param designcdWh The value of designcdWh as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesigncdWh_LessThan(String designcdWh) {
        regDesigncdWh(CK_LT, fRES(designcdWh));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESIGNCD_WH: {varchar(30)}
     * @param designcdWh The value of designcdWh as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesigncdWh_GreaterEqual(String designcdWh) {
        regDesigncdWh(CK_GE, fRES(designcdWh));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESIGNCD_WH: {varchar(30)}
     * @param designcdWh The value of designcdWh as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesigncdWh_LessEqual(String designcdWh) {
        regDesigncdWh(CK_LE, fRES(designcdWh));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DESIGNCD_WH: {varchar(30)}
     * @param designcdWhList The collection of designcdWh as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesigncdWh_InScope(Collection<String> designcdWhList) {
        doSetDesigncdWh_InScope(designcdWhList);
    }

    protected void doSetDesigncdWh_InScope(Collection<String> designcdWhList) {
        regINS(CK_INS, cTL(designcdWhList), xgetCValueDesigncdWh(), "DESIGNCD_WH");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DESIGNCD_WH: {varchar(30)}
     * @param designcdWhList The collection of designcdWh as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesigncdWh_NotInScope(Collection<String> designcdWhList) {
        doSetDesigncdWh_NotInScope(designcdWhList);
    }

    protected void doSetDesigncdWh_NotInScope(Collection<String> designcdWhList) {
        regINS(CK_NINS, cTL(designcdWhList), xgetCValueDesigncdWh(), "DESIGNCD_WH");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESIGNCD_WH: {varchar(30)} <br>
     * <pre>e.g. setDesigncdWh_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param designcdWh The value of designcdWh as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDesigncdWh_LikeSearch(String designcdWh, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(designcdWh), xgetCValueDesigncdWh(), "DESIGNCD_WH", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESIGNCD_WH: {varchar(30)}
     * @param designcdWh The value of designcdWh as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDesigncdWh_NotLikeSearch(String designcdWh, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(designcdWh), xgetCValueDesigncdWh(), "DESIGNCD_WH", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESIGNCD_WH: {varchar(30)}
     * @param designcdWh The value of designcdWh as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesigncdWh_PrefixSearch(String designcdWh) {
        setDesigncdWh_LikeSearch(designcdWh, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DESIGNCD_WH: {varchar(30)}
     */
    public void setDesigncdWh_IsNull() { regDesigncdWh(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DESIGNCD_WH: {varchar(30)}
     */
    public void setDesigncdWh_IsNullOrEmpty() { regDesigncdWh(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DESIGNCD_WH: {varchar(30)}
     */
    public void setDesigncdWh_IsNotNull() { regDesigncdWh(CK_ISNN, DOBJ); }

    protected void regDesigncdWh(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDesigncdWh(), "DESIGNCD_WH"); }
    protected abstract ConditionValue xgetCValueDesigncdWh();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VA_EXTDATA1: {varchar(30)}
     * @param vaExtdata1 The value of vaExtdata1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVaExtdata1_Equal(String vaExtdata1) {
        doSetVaExtdata1_Equal(fRES(vaExtdata1));
    }

    protected void doSetVaExtdata1_Equal(String vaExtdata1) {
        regVaExtdata1(CK_EQ, vaExtdata1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VA_EXTDATA1: {varchar(30)}
     * @param vaExtdata1 The value of vaExtdata1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVaExtdata1_NotEqual(String vaExtdata1) {
        doSetVaExtdata1_NotEqual(fRES(vaExtdata1));
    }

    protected void doSetVaExtdata1_NotEqual(String vaExtdata1) {
        regVaExtdata1(CK_NES, vaExtdata1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VA_EXTDATA1: {varchar(30)}
     * @param vaExtdata1 The value of vaExtdata1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVaExtdata1_GreaterThan(String vaExtdata1) {
        regVaExtdata1(CK_GT, fRES(vaExtdata1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VA_EXTDATA1: {varchar(30)}
     * @param vaExtdata1 The value of vaExtdata1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVaExtdata1_LessThan(String vaExtdata1) {
        regVaExtdata1(CK_LT, fRES(vaExtdata1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VA_EXTDATA1: {varchar(30)}
     * @param vaExtdata1 The value of vaExtdata1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVaExtdata1_GreaterEqual(String vaExtdata1) {
        regVaExtdata1(CK_GE, fRES(vaExtdata1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VA_EXTDATA1: {varchar(30)}
     * @param vaExtdata1 The value of vaExtdata1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVaExtdata1_LessEqual(String vaExtdata1) {
        regVaExtdata1(CK_LE, fRES(vaExtdata1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * VA_EXTDATA1: {varchar(30)}
     * @param vaExtdata1List The collection of vaExtdata1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVaExtdata1_InScope(Collection<String> vaExtdata1List) {
        doSetVaExtdata1_InScope(vaExtdata1List);
    }

    protected void doSetVaExtdata1_InScope(Collection<String> vaExtdata1List) {
        regINS(CK_INS, cTL(vaExtdata1List), xgetCValueVaExtdata1(), "VA_EXTDATA1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * VA_EXTDATA1: {varchar(30)}
     * @param vaExtdata1List The collection of vaExtdata1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVaExtdata1_NotInScope(Collection<String> vaExtdata1List) {
        doSetVaExtdata1_NotInScope(vaExtdata1List);
    }

    protected void doSetVaExtdata1_NotInScope(Collection<String> vaExtdata1List) {
        regINS(CK_NINS, cTL(vaExtdata1List), xgetCValueVaExtdata1(), "VA_EXTDATA1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * VA_EXTDATA1: {varchar(30)} <br>
     * <pre>e.g. setVaExtdata1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param vaExtdata1 The value of vaExtdata1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setVaExtdata1_LikeSearch(String vaExtdata1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(vaExtdata1), xgetCValueVaExtdata1(), "VA_EXTDATA1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * VA_EXTDATA1: {varchar(30)}
     * @param vaExtdata1 The value of vaExtdata1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setVaExtdata1_NotLikeSearch(String vaExtdata1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(vaExtdata1), xgetCValueVaExtdata1(), "VA_EXTDATA1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * VA_EXTDATA1: {varchar(30)}
     * @param vaExtdata1 The value of vaExtdata1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVaExtdata1_PrefixSearch(String vaExtdata1) {
        setVaExtdata1_LikeSearch(vaExtdata1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * VA_EXTDATA1: {varchar(30)}
     */
    public void setVaExtdata1_IsNull() { regVaExtdata1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * VA_EXTDATA1: {varchar(30)}
     */
    public void setVaExtdata1_IsNullOrEmpty() { regVaExtdata1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * VA_EXTDATA1: {varchar(30)}
     */
    public void setVaExtdata1_IsNotNull() { regVaExtdata1(CK_ISNN, DOBJ); }

    protected void regVaExtdata1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueVaExtdata1(), "VA_EXTDATA1"); }
    protected abstract ConditionValue xgetCValueVaExtdata1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VA_EXTDATA2: {varchar(30)}
     * @param vaExtdata2 The value of vaExtdata2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVaExtdata2_Equal(String vaExtdata2) {
        doSetVaExtdata2_Equal(fRES(vaExtdata2));
    }

    protected void doSetVaExtdata2_Equal(String vaExtdata2) {
        regVaExtdata2(CK_EQ, vaExtdata2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VA_EXTDATA2: {varchar(30)}
     * @param vaExtdata2 The value of vaExtdata2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVaExtdata2_NotEqual(String vaExtdata2) {
        doSetVaExtdata2_NotEqual(fRES(vaExtdata2));
    }

    protected void doSetVaExtdata2_NotEqual(String vaExtdata2) {
        regVaExtdata2(CK_NES, vaExtdata2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VA_EXTDATA2: {varchar(30)}
     * @param vaExtdata2 The value of vaExtdata2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVaExtdata2_GreaterThan(String vaExtdata2) {
        regVaExtdata2(CK_GT, fRES(vaExtdata2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VA_EXTDATA2: {varchar(30)}
     * @param vaExtdata2 The value of vaExtdata2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVaExtdata2_LessThan(String vaExtdata2) {
        regVaExtdata2(CK_LT, fRES(vaExtdata2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VA_EXTDATA2: {varchar(30)}
     * @param vaExtdata2 The value of vaExtdata2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVaExtdata2_GreaterEqual(String vaExtdata2) {
        regVaExtdata2(CK_GE, fRES(vaExtdata2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VA_EXTDATA2: {varchar(30)}
     * @param vaExtdata2 The value of vaExtdata2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVaExtdata2_LessEqual(String vaExtdata2) {
        regVaExtdata2(CK_LE, fRES(vaExtdata2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * VA_EXTDATA2: {varchar(30)}
     * @param vaExtdata2List The collection of vaExtdata2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVaExtdata2_InScope(Collection<String> vaExtdata2List) {
        doSetVaExtdata2_InScope(vaExtdata2List);
    }

    protected void doSetVaExtdata2_InScope(Collection<String> vaExtdata2List) {
        regINS(CK_INS, cTL(vaExtdata2List), xgetCValueVaExtdata2(), "VA_EXTDATA2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * VA_EXTDATA2: {varchar(30)}
     * @param vaExtdata2List The collection of vaExtdata2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVaExtdata2_NotInScope(Collection<String> vaExtdata2List) {
        doSetVaExtdata2_NotInScope(vaExtdata2List);
    }

    protected void doSetVaExtdata2_NotInScope(Collection<String> vaExtdata2List) {
        regINS(CK_NINS, cTL(vaExtdata2List), xgetCValueVaExtdata2(), "VA_EXTDATA2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * VA_EXTDATA2: {varchar(30)} <br>
     * <pre>e.g. setVaExtdata2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param vaExtdata2 The value of vaExtdata2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setVaExtdata2_LikeSearch(String vaExtdata2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(vaExtdata2), xgetCValueVaExtdata2(), "VA_EXTDATA2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * VA_EXTDATA2: {varchar(30)}
     * @param vaExtdata2 The value of vaExtdata2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setVaExtdata2_NotLikeSearch(String vaExtdata2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(vaExtdata2), xgetCValueVaExtdata2(), "VA_EXTDATA2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * VA_EXTDATA2: {varchar(30)}
     * @param vaExtdata2 The value of vaExtdata2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVaExtdata2_PrefixSearch(String vaExtdata2) {
        setVaExtdata2_LikeSearch(vaExtdata2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * VA_EXTDATA2: {varchar(30)}
     */
    public void setVaExtdata2_IsNull() { regVaExtdata2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * VA_EXTDATA2: {varchar(30)}
     */
    public void setVaExtdata2_IsNullOrEmpty() { regVaExtdata2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * VA_EXTDATA2: {varchar(30)}
     */
    public void setVaExtdata2_IsNotNull() { regVaExtdata2(CK_ISNN, DOBJ); }

    protected void regVaExtdata2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueVaExtdata2(), "VA_EXTDATA2"); }
    protected abstract ConditionValue xgetCValueVaExtdata2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VA_EXTDATA3: {varchar(30)}
     * @param vaExtdata3 The value of vaExtdata3 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVaExtdata3_Equal(String vaExtdata3) {
        doSetVaExtdata3_Equal(fRES(vaExtdata3));
    }

    protected void doSetVaExtdata3_Equal(String vaExtdata3) {
        regVaExtdata3(CK_EQ, vaExtdata3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VA_EXTDATA3: {varchar(30)}
     * @param vaExtdata3 The value of vaExtdata3 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVaExtdata3_NotEqual(String vaExtdata3) {
        doSetVaExtdata3_NotEqual(fRES(vaExtdata3));
    }

    protected void doSetVaExtdata3_NotEqual(String vaExtdata3) {
        regVaExtdata3(CK_NES, vaExtdata3);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VA_EXTDATA3: {varchar(30)}
     * @param vaExtdata3 The value of vaExtdata3 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVaExtdata3_GreaterThan(String vaExtdata3) {
        regVaExtdata3(CK_GT, fRES(vaExtdata3));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VA_EXTDATA3: {varchar(30)}
     * @param vaExtdata3 The value of vaExtdata3 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVaExtdata3_LessThan(String vaExtdata3) {
        regVaExtdata3(CK_LT, fRES(vaExtdata3));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VA_EXTDATA3: {varchar(30)}
     * @param vaExtdata3 The value of vaExtdata3 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVaExtdata3_GreaterEqual(String vaExtdata3) {
        regVaExtdata3(CK_GE, fRES(vaExtdata3));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VA_EXTDATA3: {varchar(30)}
     * @param vaExtdata3 The value of vaExtdata3 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVaExtdata3_LessEqual(String vaExtdata3) {
        regVaExtdata3(CK_LE, fRES(vaExtdata3));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * VA_EXTDATA3: {varchar(30)}
     * @param vaExtdata3List The collection of vaExtdata3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVaExtdata3_InScope(Collection<String> vaExtdata3List) {
        doSetVaExtdata3_InScope(vaExtdata3List);
    }

    protected void doSetVaExtdata3_InScope(Collection<String> vaExtdata3List) {
        regINS(CK_INS, cTL(vaExtdata3List), xgetCValueVaExtdata3(), "VA_EXTDATA3");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * VA_EXTDATA3: {varchar(30)}
     * @param vaExtdata3List The collection of vaExtdata3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVaExtdata3_NotInScope(Collection<String> vaExtdata3List) {
        doSetVaExtdata3_NotInScope(vaExtdata3List);
    }

    protected void doSetVaExtdata3_NotInScope(Collection<String> vaExtdata3List) {
        regINS(CK_NINS, cTL(vaExtdata3List), xgetCValueVaExtdata3(), "VA_EXTDATA3");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * VA_EXTDATA3: {varchar(30)} <br>
     * <pre>e.g. setVaExtdata3_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param vaExtdata3 The value of vaExtdata3 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setVaExtdata3_LikeSearch(String vaExtdata3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(vaExtdata3), xgetCValueVaExtdata3(), "VA_EXTDATA3", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * VA_EXTDATA3: {varchar(30)}
     * @param vaExtdata3 The value of vaExtdata3 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setVaExtdata3_NotLikeSearch(String vaExtdata3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(vaExtdata3), xgetCValueVaExtdata3(), "VA_EXTDATA3", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * VA_EXTDATA3: {varchar(30)}
     * @param vaExtdata3 The value of vaExtdata3 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVaExtdata3_PrefixSearch(String vaExtdata3) {
        setVaExtdata3_LikeSearch(vaExtdata3, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * VA_EXTDATA3: {varchar(30)}
     */
    public void setVaExtdata3_IsNull() { regVaExtdata3(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * VA_EXTDATA3: {varchar(30)}
     */
    public void setVaExtdata3_IsNullOrEmpty() { regVaExtdata3(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * VA_EXTDATA3: {varchar(30)}
     */
    public void setVaExtdata3_IsNotNull() { regVaExtdata3(CK_ISNN, DOBJ); }

    protected void regVaExtdata3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueVaExtdata3(), "VA_EXTDATA3"); }
    protected abstract ConditionValue xgetCValueVaExtdata3();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NV_EXTDATA1: {varchar(60)}
     * @param nvExtdata1 The value of nvExtdata1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNvExtdata1_Equal(String nvExtdata1) {
        doSetNvExtdata1_Equal(fRES(nvExtdata1));
    }

    protected void doSetNvExtdata1_Equal(String nvExtdata1) {
        regNvExtdata1(CK_EQ, nvExtdata1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NV_EXTDATA1: {varchar(60)}
     * @param nvExtdata1 The value of nvExtdata1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNvExtdata1_NotEqual(String nvExtdata1) {
        doSetNvExtdata1_NotEqual(fRES(nvExtdata1));
    }

    protected void doSetNvExtdata1_NotEqual(String nvExtdata1) {
        regNvExtdata1(CK_NES, nvExtdata1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NV_EXTDATA1: {varchar(60)}
     * @param nvExtdata1 The value of nvExtdata1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNvExtdata1_GreaterThan(String nvExtdata1) {
        regNvExtdata1(CK_GT, fRES(nvExtdata1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NV_EXTDATA1: {varchar(60)}
     * @param nvExtdata1 The value of nvExtdata1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNvExtdata1_LessThan(String nvExtdata1) {
        regNvExtdata1(CK_LT, fRES(nvExtdata1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NV_EXTDATA1: {varchar(60)}
     * @param nvExtdata1 The value of nvExtdata1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNvExtdata1_GreaterEqual(String nvExtdata1) {
        regNvExtdata1(CK_GE, fRES(nvExtdata1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NV_EXTDATA1: {varchar(60)}
     * @param nvExtdata1 The value of nvExtdata1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNvExtdata1_LessEqual(String nvExtdata1) {
        regNvExtdata1(CK_LE, fRES(nvExtdata1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NV_EXTDATA1: {varchar(60)}
     * @param nvExtdata1List The collection of nvExtdata1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNvExtdata1_InScope(Collection<String> nvExtdata1List) {
        doSetNvExtdata1_InScope(nvExtdata1List);
    }

    protected void doSetNvExtdata1_InScope(Collection<String> nvExtdata1List) {
        regINS(CK_INS, cTL(nvExtdata1List), xgetCValueNvExtdata1(), "NV_EXTDATA1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NV_EXTDATA1: {varchar(60)}
     * @param nvExtdata1List The collection of nvExtdata1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNvExtdata1_NotInScope(Collection<String> nvExtdata1List) {
        doSetNvExtdata1_NotInScope(nvExtdata1List);
    }

    protected void doSetNvExtdata1_NotInScope(Collection<String> nvExtdata1List) {
        regINS(CK_NINS, cTL(nvExtdata1List), xgetCValueNvExtdata1(), "NV_EXTDATA1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NV_EXTDATA1: {varchar(60)} <br>
     * <pre>e.g. setNvExtdata1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param nvExtdata1 The value of nvExtdata1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setNvExtdata1_LikeSearch(String nvExtdata1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(nvExtdata1), xgetCValueNvExtdata1(), "NV_EXTDATA1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NV_EXTDATA1: {varchar(60)}
     * @param nvExtdata1 The value of nvExtdata1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setNvExtdata1_NotLikeSearch(String nvExtdata1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(nvExtdata1), xgetCValueNvExtdata1(), "NV_EXTDATA1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NV_EXTDATA1: {varchar(60)}
     * @param nvExtdata1 The value of nvExtdata1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNvExtdata1_PrefixSearch(String nvExtdata1) {
        setNvExtdata1_LikeSearch(nvExtdata1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * NV_EXTDATA1: {varchar(60)}
     */
    public void setNvExtdata1_IsNull() { regNvExtdata1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * NV_EXTDATA1: {varchar(60)}
     */
    public void setNvExtdata1_IsNullOrEmpty() { regNvExtdata1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * NV_EXTDATA1: {varchar(60)}
     */
    public void setNvExtdata1_IsNotNull() { regNvExtdata1(CK_ISNN, DOBJ); }

    protected void regNvExtdata1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNvExtdata1(), "NV_EXTDATA1"); }
    protected abstract ConditionValue xgetCValueNvExtdata1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NV_EXTDATA2: {varchar(60)}
     * @param nvExtdata2 The value of nvExtdata2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNvExtdata2_Equal(String nvExtdata2) {
        doSetNvExtdata2_Equal(fRES(nvExtdata2));
    }

    protected void doSetNvExtdata2_Equal(String nvExtdata2) {
        regNvExtdata2(CK_EQ, nvExtdata2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NV_EXTDATA2: {varchar(60)}
     * @param nvExtdata2 The value of nvExtdata2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNvExtdata2_NotEqual(String nvExtdata2) {
        doSetNvExtdata2_NotEqual(fRES(nvExtdata2));
    }

    protected void doSetNvExtdata2_NotEqual(String nvExtdata2) {
        regNvExtdata2(CK_NES, nvExtdata2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NV_EXTDATA2: {varchar(60)}
     * @param nvExtdata2 The value of nvExtdata2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNvExtdata2_GreaterThan(String nvExtdata2) {
        regNvExtdata2(CK_GT, fRES(nvExtdata2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NV_EXTDATA2: {varchar(60)}
     * @param nvExtdata2 The value of nvExtdata2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNvExtdata2_LessThan(String nvExtdata2) {
        regNvExtdata2(CK_LT, fRES(nvExtdata2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NV_EXTDATA2: {varchar(60)}
     * @param nvExtdata2 The value of nvExtdata2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNvExtdata2_GreaterEqual(String nvExtdata2) {
        regNvExtdata2(CK_GE, fRES(nvExtdata2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NV_EXTDATA2: {varchar(60)}
     * @param nvExtdata2 The value of nvExtdata2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNvExtdata2_LessEqual(String nvExtdata2) {
        regNvExtdata2(CK_LE, fRES(nvExtdata2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NV_EXTDATA2: {varchar(60)}
     * @param nvExtdata2List The collection of nvExtdata2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNvExtdata2_InScope(Collection<String> nvExtdata2List) {
        doSetNvExtdata2_InScope(nvExtdata2List);
    }

    protected void doSetNvExtdata2_InScope(Collection<String> nvExtdata2List) {
        regINS(CK_INS, cTL(nvExtdata2List), xgetCValueNvExtdata2(), "NV_EXTDATA2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NV_EXTDATA2: {varchar(60)}
     * @param nvExtdata2List The collection of nvExtdata2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNvExtdata2_NotInScope(Collection<String> nvExtdata2List) {
        doSetNvExtdata2_NotInScope(nvExtdata2List);
    }

    protected void doSetNvExtdata2_NotInScope(Collection<String> nvExtdata2List) {
        regINS(CK_NINS, cTL(nvExtdata2List), xgetCValueNvExtdata2(), "NV_EXTDATA2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NV_EXTDATA2: {varchar(60)} <br>
     * <pre>e.g. setNvExtdata2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param nvExtdata2 The value of nvExtdata2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setNvExtdata2_LikeSearch(String nvExtdata2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(nvExtdata2), xgetCValueNvExtdata2(), "NV_EXTDATA2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NV_EXTDATA2: {varchar(60)}
     * @param nvExtdata2 The value of nvExtdata2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setNvExtdata2_NotLikeSearch(String nvExtdata2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(nvExtdata2), xgetCValueNvExtdata2(), "NV_EXTDATA2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NV_EXTDATA2: {varchar(60)}
     * @param nvExtdata2 The value of nvExtdata2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNvExtdata2_PrefixSearch(String nvExtdata2) {
        setNvExtdata2_LikeSearch(nvExtdata2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * NV_EXTDATA2: {varchar(60)}
     */
    public void setNvExtdata2_IsNull() { regNvExtdata2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * NV_EXTDATA2: {varchar(60)}
     */
    public void setNvExtdata2_IsNullOrEmpty() { regNvExtdata2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * NV_EXTDATA2: {varchar(60)}
     */
    public void setNvExtdata2_IsNotNull() { regNvExtdata2(CK_ISNN, DOBJ); }

    protected void regNvExtdata2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNvExtdata2(), "NV_EXTDATA2"); }
    protected abstract ConditionValue xgetCValueNvExtdata2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NV_EXTDATA3: {varchar(60)}
     * @param nvExtdata3 The value of nvExtdata3 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNvExtdata3_Equal(String nvExtdata3) {
        doSetNvExtdata3_Equal(fRES(nvExtdata3));
    }

    protected void doSetNvExtdata3_Equal(String nvExtdata3) {
        regNvExtdata3(CK_EQ, nvExtdata3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NV_EXTDATA3: {varchar(60)}
     * @param nvExtdata3 The value of nvExtdata3 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNvExtdata3_NotEqual(String nvExtdata3) {
        doSetNvExtdata3_NotEqual(fRES(nvExtdata3));
    }

    protected void doSetNvExtdata3_NotEqual(String nvExtdata3) {
        regNvExtdata3(CK_NES, nvExtdata3);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NV_EXTDATA3: {varchar(60)}
     * @param nvExtdata3 The value of nvExtdata3 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNvExtdata3_GreaterThan(String nvExtdata3) {
        regNvExtdata3(CK_GT, fRES(nvExtdata3));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NV_EXTDATA3: {varchar(60)}
     * @param nvExtdata3 The value of nvExtdata3 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNvExtdata3_LessThan(String nvExtdata3) {
        regNvExtdata3(CK_LT, fRES(nvExtdata3));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NV_EXTDATA3: {varchar(60)}
     * @param nvExtdata3 The value of nvExtdata3 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNvExtdata3_GreaterEqual(String nvExtdata3) {
        regNvExtdata3(CK_GE, fRES(nvExtdata3));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NV_EXTDATA3: {varchar(60)}
     * @param nvExtdata3 The value of nvExtdata3 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNvExtdata3_LessEqual(String nvExtdata3) {
        regNvExtdata3(CK_LE, fRES(nvExtdata3));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NV_EXTDATA3: {varchar(60)}
     * @param nvExtdata3List The collection of nvExtdata3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNvExtdata3_InScope(Collection<String> nvExtdata3List) {
        doSetNvExtdata3_InScope(nvExtdata3List);
    }

    protected void doSetNvExtdata3_InScope(Collection<String> nvExtdata3List) {
        regINS(CK_INS, cTL(nvExtdata3List), xgetCValueNvExtdata3(), "NV_EXTDATA3");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NV_EXTDATA3: {varchar(60)}
     * @param nvExtdata3List The collection of nvExtdata3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNvExtdata3_NotInScope(Collection<String> nvExtdata3List) {
        doSetNvExtdata3_NotInScope(nvExtdata3List);
    }

    protected void doSetNvExtdata3_NotInScope(Collection<String> nvExtdata3List) {
        regINS(CK_NINS, cTL(nvExtdata3List), xgetCValueNvExtdata3(), "NV_EXTDATA3");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NV_EXTDATA3: {varchar(60)} <br>
     * <pre>e.g. setNvExtdata3_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param nvExtdata3 The value of nvExtdata3 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setNvExtdata3_LikeSearch(String nvExtdata3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(nvExtdata3), xgetCValueNvExtdata3(), "NV_EXTDATA3", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NV_EXTDATA3: {varchar(60)}
     * @param nvExtdata3 The value of nvExtdata3 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setNvExtdata3_NotLikeSearch(String nvExtdata3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(nvExtdata3), xgetCValueNvExtdata3(), "NV_EXTDATA3", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NV_EXTDATA3: {varchar(60)}
     * @param nvExtdata3 The value of nvExtdata3 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNvExtdata3_PrefixSearch(String nvExtdata3) {
        setNvExtdata3_LikeSearch(nvExtdata3, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * NV_EXTDATA3: {varchar(60)}
     */
    public void setNvExtdata3_IsNull() { regNvExtdata3(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * NV_EXTDATA3: {varchar(60)}
     */
    public void setNvExtdata3_IsNullOrEmpty() { regNvExtdata3(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * NV_EXTDATA3: {varchar(60)}
     */
    public void setNvExtdata3_IsNotNull() { regNvExtdata3(CK_ISNN, DOBJ); }

    protected void regNvExtdata3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNvExtdata3(), "NV_EXTDATA3"); }
    protected abstract ConditionValue xgetCValueNvExtdata3();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * NM_EXTDATA1: {bigint(19)}
     * @param nmExtdata1 The value of nmExtdata1 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setNmExtdata1_Equal(Long nmExtdata1) {
        doSetNmExtdata1_Equal(nmExtdata1);
    }

    protected void doSetNmExtdata1_Equal(Long nmExtdata1) {
        regNmExtdata1(CK_EQ, nmExtdata1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NM_EXTDATA1: {bigint(19)}
     * @param nmExtdata1 The value of nmExtdata1 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNmExtdata1_NotEqual(Long nmExtdata1) {
        doSetNmExtdata1_NotEqual(nmExtdata1);
    }

    protected void doSetNmExtdata1_NotEqual(Long nmExtdata1) {
        regNmExtdata1(CK_NES, nmExtdata1);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NM_EXTDATA1: {bigint(19)}
     * @param nmExtdata1 The value of nmExtdata1 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNmExtdata1_GreaterThan(Long nmExtdata1) {
        regNmExtdata1(CK_GT, nmExtdata1);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NM_EXTDATA1: {bigint(19)}
     * @param nmExtdata1 The value of nmExtdata1 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNmExtdata1_LessThan(Long nmExtdata1) {
        regNmExtdata1(CK_LT, nmExtdata1);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * NM_EXTDATA1: {bigint(19)}
     * @param nmExtdata1 The value of nmExtdata1 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNmExtdata1_GreaterEqual(Long nmExtdata1) {
        regNmExtdata1(CK_GE, nmExtdata1);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * NM_EXTDATA1: {bigint(19)}
     * @param nmExtdata1 The value of nmExtdata1 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNmExtdata1_LessEqual(Long nmExtdata1) {
        regNmExtdata1(CK_LE, nmExtdata1);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * NM_EXTDATA1: {bigint(19)}
     * @param minNumber The min number of nmExtdata1. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of nmExtdata1. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setNmExtdata1_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueNmExtdata1(), "NM_EXTDATA1", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * NM_EXTDATA1: {bigint(19)}
     * @param nmExtdata1List The collection of nmExtdata1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNmExtdata1_InScope(Collection<Long> nmExtdata1List) {
        doSetNmExtdata1_InScope(nmExtdata1List);
    }

    protected void doSetNmExtdata1_InScope(Collection<Long> nmExtdata1List) {
        regINS(CK_INS, cTL(nmExtdata1List), xgetCValueNmExtdata1(), "NM_EXTDATA1");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * NM_EXTDATA1: {bigint(19)}
     * @param nmExtdata1List The collection of nmExtdata1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNmExtdata1_NotInScope(Collection<Long> nmExtdata1List) {
        doSetNmExtdata1_NotInScope(nmExtdata1List);
    }

    protected void doSetNmExtdata1_NotInScope(Collection<Long> nmExtdata1List) {
        regINS(CK_NINS, cTL(nmExtdata1List), xgetCValueNmExtdata1(), "NM_EXTDATA1");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * NM_EXTDATA1: {bigint(19)}
     */
    public void setNmExtdata1_IsNull() { regNmExtdata1(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * NM_EXTDATA1: {bigint(19)}
     */
    public void setNmExtdata1_IsNotNull() { regNmExtdata1(CK_ISNN, DOBJ); }

    protected void regNmExtdata1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNmExtdata1(), "NM_EXTDATA1"); }
    protected abstract ConditionValue xgetCValueNmExtdata1();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * NM_EXTDATA2: {bigint(19)}
     * @param nmExtdata2 The value of nmExtdata2 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setNmExtdata2_Equal(Long nmExtdata2) {
        doSetNmExtdata2_Equal(nmExtdata2);
    }

    protected void doSetNmExtdata2_Equal(Long nmExtdata2) {
        regNmExtdata2(CK_EQ, nmExtdata2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NM_EXTDATA2: {bigint(19)}
     * @param nmExtdata2 The value of nmExtdata2 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNmExtdata2_NotEqual(Long nmExtdata2) {
        doSetNmExtdata2_NotEqual(nmExtdata2);
    }

    protected void doSetNmExtdata2_NotEqual(Long nmExtdata2) {
        regNmExtdata2(CK_NES, nmExtdata2);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NM_EXTDATA2: {bigint(19)}
     * @param nmExtdata2 The value of nmExtdata2 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNmExtdata2_GreaterThan(Long nmExtdata2) {
        regNmExtdata2(CK_GT, nmExtdata2);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NM_EXTDATA2: {bigint(19)}
     * @param nmExtdata2 The value of nmExtdata2 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNmExtdata2_LessThan(Long nmExtdata2) {
        regNmExtdata2(CK_LT, nmExtdata2);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * NM_EXTDATA2: {bigint(19)}
     * @param nmExtdata2 The value of nmExtdata2 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNmExtdata2_GreaterEqual(Long nmExtdata2) {
        regNmExtdata2(CK_GE, nmExtdata2);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * NM_EXTDATA2: {bigint(19)}
     * @param nmExtdata2 The value of nmExtdata2 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNmExtdata2_LessEqual(Long nmExtdata2) {
        regNmExtdata2(CK_LE, nmExtdata2);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * NM_EXTDATA2: {bigint(19)}
     * @param minNumber The min number of nmExtdata2. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of nmExtdata2. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setNmExtdata2_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueNmExtdata2(), "NM_EXTDATA2", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * NM_EXTDATA2: {bigint(19)}
     * @param nmExtdata2List The collection of nmExtdata2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNmExtdata2_InScope(Collection<Long> nmExtdata2List) {
        doSetNmExtdata2_InScope(nmExtdata2List);
    }

    protected void doSetNmExtdata2_InScope(Collection<Long> nmExtdata2List) {
        regINS(CK_INS, cTL(nmExtdata2List), xgetCValueNmExtdata2(), "NM_EXTDATA2");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * NM_EXTDATA2: {bigint(19)}
     * @param nmExtdata2List The collection of nmExtdata2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNmExtdata2_NotInScope(Collection<Long> nmExtdata2List) {
        doSetNmExtdata2_NotInScope(nmExtdata2List);
    }

    protected void doSetNmExtdata2_NotInScope(Collection<Long> nmExtdata2List) {
        regINS(CK_NINS, cTL(nmExtdata2List), xgetCValueNmExtdata2(), "NM_EXTDATA2");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * NM_EXTDATA2: {bigint(19)}
     */
    public void setNmExtdata2_IsNull() { regNmExtdata2(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * NM_EXTDATA2: {bigint(19)}
     */
    public void setNmExtdata2_IsNotNull() { regNmExtdata2(CK_ISNN, DOBJ); }

    protected void regNmExtdata2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNmExtdata2(), "NM_EXTDATA2"); }
    protected abstract ConditionValue xgetCValueNmExtdata2();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * NM_EXTDATA3: {bigint(19)}
     * @param nmExtdata3 The value of nmExtdata3 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setNmExtdata3_Equal(Long nmExtdata3) {
        doSetNmExtdata3_Equal(nmExtdata3);
    }

    protected void doSetNmExtdata3_Equal(Long nmExtdata3) {
        regNmExtdata3(CK_EQ, nmExtdata3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NM_EXTDATA3: {bigint(19)}
     * @param nmExtdata3 The value of nmExtdata3 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNmExtdata3_NotEqual(Long nmExtdata3) {
        doSetNmExtdata3_NotEqual(nmExtdata3);
    }

    protected void doSetNmExtdata3_NotEqual(Long nmExtdata3) {
        regNmExtdata3(CK_NES, nmExtdata3);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NM_EXTDATA3: {bigint(19)}
     * @param nmExtdata3 The value of nmExtdata3 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNmExtdata3_GreaterThan(Long nmExtdata3) {
        regNmExtdata3(CK_GT, nmExtdata3);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NM_EXTDATA3: {bigint(19)}
     * @param nmExtdata3 The value of nmExtdata3 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNmExtdata3_LessThan(Long nmExtdata3) {
        regNmExtdata3(CK_LT, nmExtdata3);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * NM_EXTDATA3: {bigint(19)}
     * @param nmExtdata3 The value of nmExtdata3 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNmExtdata3_GreaterEqual(Long nmExtdata3) {
        regNmExtdata3(CK_GE, nmExtdata3);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * NM_EXTDATA3: {bigint(19)}
     * @param nmExtdata3 The value of nmExtdata3 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNmExtdata3_LessEqual(Long nmExtdata3) {
        regNmExtdata3(CK_LE, nmExtdata3);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * NM_EXTDATA3: {bigint(19)}
     * @param minNumber The min number of nmExtdata3. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of nmExtdata3. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setNmExtdata3_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueNmExtdata3(), "NM_EXTDATA3", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * NM_EXTDATA3: {bigint(19)}
     * @param nmExtdata3List The collection of nmExtdata3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNmExtdata3_InScope(Collection<Long> nmExtdata3List) {
        doSetNmExtdata3_InScope(nmExtdata3List);
    }

    protected void doSetNmExtdata3_InScope(Collection<Long> nmExtdata3List) {
        regINS(CK_INS, cTL(nmExtdata3List), xgetCValueNmExtdata3(), "NM_EXTDATA3");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * NM_EXTDATA3: {bigint(19)}
     * @param nmExtdata3List The collection of nmExtdata3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNmExtdata3_NotInScope(Collection<Long> nmExtdata3List) {
        doSetNmExtdata3_NotInScope(nmExtdata3List);
    }

    protected void doSetNmExtdata3_NotInScope(Collection<Long> nmExtdata3List) {
        regINS(CK_NINS, cTL(nmExtdata3List), xgetCValueNmExtdata3(), "NM_EXTDATA3");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * NM_EXTDATA3: {bigint(19)}
     */
    public void setNmExtdata3_IsNull() { regNmExtdata3(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * NM_EXTDATA3: {bigint(19)}
     */
    public void setNmExtdata3_IsNotNull() { regNmExtdata3(CK_ISNN, DOBJ); }

    protected void regNmExtdata3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNmExtdata3(), "NM_EXTDATA3"); }
    protected abstract ConditionValue xgetCValueNmExtdata3();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DT_EXTDATA1: {varchar(8)}
     * @param dtExtdata1 The value of dtExtdata1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtExtdata1_Equal(String dtExtdata1) {
        doSetDtExtdata1_Equal(fRES(dtExtdata1));
    }

    protected void doSetDtExtdata1_Equal(String dtExtdata1) {
        regDtExtdata1(CK_EQ, dtExtdata1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DT_EXTDATA1: {varchar(8)}
     * @param dtExtdata1 The value of dtExtdata1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtExtdata1_NotEqual(String dtExtdata1) {
        doSetDtExtdata1_NotEqual(fRES(dtExtdata1));
    }

    protected void doSetDtExtdata1_NotEqual(String dtExtdata1) {
        regDtExtdata1(CK_NES, dtExtdata1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DT_EXTDATA1: {varchar(8)}
     * @param dtExtdata1 The value of dtExtdata1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtExtdata1_GreaterThan(String dtExtdata1) {
        regDtExtdata1(CK_GT, fRES(dtExtdata1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DT_EXTDATA1: {varchar(8)}
     * @param dtExtdata1 The value of dtExtdata1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtExtdata1_LessThan(String dtExtdata1) {
        regDtExtdata1(CK_LT, fRES(dtExtdata1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DT_EXTDATA1: {varchar(8)}
     * @param dtExtdata1 The value of dtExtdata1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtExtdata1_GreaterEqual(String dtExtdata1) {
        regDtExtdata1(CK_GE, fRES(dtExtdata1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DT_EXTDATA1: {varchar(8)}
     * @param dtExtdata1 The value of dtExtdata1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtExtdata1_LessEqual(String dtExtdata1) {
        regDtExtdata1(CK_LE, fRES(dtExtdata1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DT_EXTDATA1: {varchar(8)}
     * @param dtExtdata1List The collection of dtExtdata1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtExtdata1_InScope(Collection<String> dtExtdata1List) {
        doSetDtExtdata1_InScope(dtExtdata1List);
    }

    protected void doSetDtExtdata1_InScope(Collection<String> dtExtdata1List) {
        regINS(CK_INS, cTL(dtExtdata1List), xgetCValueDtExtdata1(), "DT_EXTDATA1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DT_EXTDATA1: {varchar(8)}
     * @param dtExtdata1List The collection of dtExtdata1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtExtdata1_NotInScope(Collection<String> dtExtdata1List) {
        doSetDtExtdata1_NotInScope(dtExtdata1List);
    }

    protected void doSetDtExtdata1_NotInScope(Collection<String> dtExtdata1List) {
        regINS(CK_NINS, cTL(dtExtdata1List), xgetCValueDtExtdata1(), "DT_EXTDATA1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DT_EXTDATA1: {varchar(8)} <br>
     * <pre>e.g. setDtExtdata1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param dtExtdata1 The value of dtExtdata1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDtExtdata1_LikeSearch(String dtExtdata1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(dtExtdata1), xgetCValueDtExtdata1(), "DT_EXTDATA1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DT_EXTDATA1: {varchar(8)}
     * @param dtExtdata1 The value of dtExtdata1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDtExtdata1_NotLikeSearch(String dtExtdata1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(dtExtdata1), xgetCValueDtExtdata1(), "DT_EXTDATA1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DT_EXTDATA1: {varchar(8)}
     * @param dtExtdata1 The value of dtExtdata1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtExtdata1_PrefixSearch(String dtExtdata1) {
        setDtExtdata1_LikeSearch(dtExtdata1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DT_EXTDATA1: {varchar(8)}
     */
    public void setDtExtdata1_IsNull() { regDtExtdata1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DT_EXTDATA1: {varchar(8)}
     */
    public void setDtExtdata1_IsNullOrEmpty() { regDtExtdata1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DT_EXTDATA1: {varchar(8)}
     */
    public void setDtExtdata1_IsNotNull() { regDtExtdata1(CK_ISNN, DOBJ); }

    protected void regDtExtdata1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDtExtdata1(), "DT_EXTDATA1"); }
    protected abstract ConditionValue xgetCValueDtExtdata1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DT_EXTDATA2: {varchar(8)}
     * @param dtExtdata2 The value of dtExtdata2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtExtdata2_Equal(String dtExtdata2) {
        doSetDtExtdata2_Equal(fRES(dtExtdata2));
    }

    protected void doSetDtExtdata2_Equal(String dtExtdata2) {
        regDtExtdata2(CK_EQ, dtExtdata2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DT_EXTDATA2: {varchar(8)}
     * @param dtExtdata2 The value of dtExtdata2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtExtdata2_NotEqual(String dtExtdata2) {
        doSetDtExtdata2_NotEqual(fRES(dtExtdata2));
    }

    protected void doSetDtExtdata2_NotEqual(String dtExtdata2) {
        regDtExtdata2(CK_NES, dtExtdata2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DT_EXTDATA2: {varchar(8)}
     * @param dtExtdata2 The value of dtExtdata2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtExtdata2_GreaterThan(String dtExtdata2) {
        regDtExtdata2(CK_GT, fRES(dtExtdata2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DT_EXTDATA2: {varchar(8)}
     * @param dtExtdata2 The value of dtExtdata2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtExtdata2_LessThan(String dtExtdata2) {
        regDtExtdata2(CK_LT, fRES(dtExtdata2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DT_EXTDATA2: {varchar(8)}
     * @param dtExtdata2 The value of dtExtdata2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtExtdata2_GreaterEqual(String dtExtdata2) {
        regDtExtdata2(CK_GE, fRES(dtExtdata2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DT_EXTDATA2: {varchar(8)}
     * @param dtExtdata2 The value of dtExtdata2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtExtdata2_LessEqual(String dtExtdata2) {
        regDtExtdata2(CK_LE, fRES(dtExtdata2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DT_EXTDATA2: {varchar(8)}
     * @param dtExtdata2List The collection of dtExtdata2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtExtdata2_InScope(Collection<String> dtExtdata2List) {
        doSetDtExtdata2_InScope(dtExtdata2List);
    }

    protected void doSetDtExtdata2_InScope(Collection<String> dtExtdata2List) {
        regINS(CK_INS, cTL(dtExtdata2List), xgetCValueDtExtdata2(), "DT_EXTDATA2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DT_EXTDATA2: {varchar(8)}
     * @param dtExtdata2List The collection of dtExtdata2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtExtdata2_NotInScope(Collection<String> dtExtdata2List) {
        doSetDtExtdata2_NotInScope(dtExtdata2List);
    }

    protected void doSetDtExtdata2_NotInScope(Collection<String> dtExtdata2List) {
        regINS(CK_NINS, cTL(dtExtdata2List), xgetCValueDtExtdata2(), "DT_EXTDATA2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DT_EXTDATA2: {varchar(8)} <br>
     * <pre>e.g. setDtExtdata2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param dtExtdata2 The value of dtExtdata2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDtExtdata2_LikeSearch(String dtExtdata2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(dtExtdata2), xgetCValueDtExtdata2(), "DT_EXTDATA2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DT_EXTDATA2: {varchar(8)}
     * @param dtExtdata2 The value of dtExtdata2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDtExtdata2_NotLikeSearch(String dtExtdata2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(dtExtdata2), xgetCValueDtExtdata2(), "DT_EXTDATA2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DT_EXTDATA2: {varchar(8)}
     * @param dtExtdata2 The value of dtExtdata2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtExtdata2_PrefixSearch(String dtExtdata2) {
        setDtExtdata2_LikeSearch(dtExtdata2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DT_EXTDATA2: {varchar(8)}
     */
    public void setDtExtdata2_IsNull() { regDtExtdata2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DT_EXTDATA2: {varchar(8)}
     */
    public void setDtExtdata2_IsNullOrEmpty() { regDtExtdata2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DT_EXTDATA2: {varchar(8)}
     */
    public void setDtExtdata2_IsNotNull() { regDtExtdata2(CK_ISNN, DOBJ); }

    protected void regDtExtdata2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDtExtdata2(), "DT_EXTDATA2"); }
    protected abstract ConditionValue xgetCValueDtExtdata2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DT_EXTDATA3: {varchar(8)}
     * @param dtExtdata3 The value of dtExtdata3 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtExtdata3_Equal(String dtExtdata3) {
        doSetDtExtdata3_Equal(fRES(dtExtdata3));
    }

    protected void doSetDtExtdata3_Equal(String dtExtdata3) {
        regDtExtdata3(CK_EQ, dtExtdata3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DT_EXTDATA3: {varchar(8)}
     * @param dtExtdata3 The value of dtExtdata3 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtExtdata3_NotEqual(String dtExtdata3) {
        doSetDtExtdata3_NotEqual(fRES(dtExtdata3));
    }

    protected void doSetDtExtdata3_NotEqual(String dtExtdata3) {
        regDtExtdata3(CK_NES, dtExtdata3);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DT_EXTDATA3: {varchar(8)}
     * @param dtExtdata3 The value of dtExtdata3 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtExtdata3_GreaterThan(String dtExtdata3) {
        regDtExtdata3(CK_GT, fRES(dtExtdata3));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DT_EXTDATA3: {varchar(8)}
     * @param dtExtdata3 The value of dtExtdata3 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtExtdata3_LessThan(String dtExtdata3) {
        regDtExtdata3(CK_LT, fRES(dtExtdata3));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DT_EXTDATA3: {varchar(8)}
     * @param dtExtdata3 The value of dtExtdata3 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtExtdata3_GreaterEqual(String dtExtdata3) {
        regDtExtdata3(CK_GE, fRES(dtExtdata3));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DT_EXTDATA3: {varchar(8)}
     * @param dtExtdata3 The value of dtExtdata3 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtExtdata3_LessEqual(String dtExtdata3) {
        regDtExtdata3(CK_LE, fRES(dtExtdata3));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DT_EXTDATA3: {varchar(8)}
     * @param dtExtdata3List The collection of dtExtdata3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtExtdata3_InScope(Collection<String> dtExtdata3List) {
        doSetDtExtdata3_InScope(dtExtdata3List);
    }

    protected void doSetDtExtdata3_InScope(Collection<String> dtExtdata3List) {
        regINS(CK_INS, cTL(dtExtdata3List), xgetCValueDtExtdata3(), "DT_EXTDATA3");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DT_EXTDATA3: {varchar(8)}
     * @param dtExtdata3List The collection of dtExtdata3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtExtdata3_NotInScope(Collection<String> dtExtdata3List) {
        doSetDtExtdata3_NotInScope(dtExtdata3List);
    }

    protected void doSetDtExtdata3_NotInScope(Collection<String> dtExtdata3List) {
        regINS(CK_NINS, cTL(dtExtdata3List), xgetCValueDtExtdata3(), "DT_EXTDATA3");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DT_EXTDATA3: {varchar(8)} <br>
     * <pre>e.g. setDtExtdata3_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param dtExtdata3 The value of dtExtdata3 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDtExtdata3_LikeSearch(String dtExtdata3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(dtExtdata3), xgetCValueDtExtdata3(), "DT_EXTDATA3", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DT_EXTDATA3: {varchar(8)}
     * @param dtExtdata3 The value of dtExtdata3 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDtExtdata3_NotLikeSearch(String dtExtdata3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(dtExtdata3), xgetCValueDtExtdata3(), "DT_EXTDATA3", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DT_EXTDATA3: {varchar(8)}
     * @param dtExtdata3 The value of dtExtdata3 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtExtdata3_PrefixSearch(String dtExtdata3) {
        setDtExtdata3_LikeSearch(dtExtdata3, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DT_EXTDATA3: {varchar(8)}
     */
    public void setDtExtdata3_IsNull() { regDtExtdata3(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DT_EXTDATA3: {varchar(8)}
     */
    public void setDtExtdata3_IsNullOrEmpty() { regDtExtdata3(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DT_EXTDATA3: {varchar(8)}
     */
    public void setDtExtdata3_IsNotNull() { regDtExtdata3(CK_ISNN, DOBJ); }

    protected void regDtExtdata3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDtExtdata3(), "DT_EXTDATA3"); }
    protected abstract ConditionValue xgetCValueDtExtdata3();

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
    public HpSLCFunction<TTrflexibilityproductCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TTrflexibilityproductCB.class);
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
    public HpSLCFunction<TTrflexibilityproductCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TTrflexibilityproductCB.class);
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
    public HpSLCFunction<TTrflexibilityproductCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TTrflexibilityproductCB.class);
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
    public HpSLCFunction<TTrflexibilityproductCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TTrflexibilityproductCB.class);
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
    public HpSLCFunction<TTrflexibilityproductCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TTrflexibilityproductCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TTrflexibilityproductCB&gt;() {
     *     public void query(TTrflexibilityproductCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TTrflexibilityproductCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TTrflexibilityproductCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrflexibilityproductCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TTrflexibilityproductCQ sq);

    protected TTrflexibilityproductCB xcreateScalarConditionCB() {
        TTrflexibilityproductCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TTrflexibilityproductCB xcreateScalarConditionPartitionByCB() {
        TTrflexibilityproductCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TTrflexibilityproductCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrflexibilityproductCB cb = new TTrflexibilityproductCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "TRFLEXIBILITYPRODUCT_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TTrflexibilityproductCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TTrflexibilityproductCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TTrflexibilityproductCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrflexibilityproductCB cb = new TTrflexibilityproductCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "TRFLEXIBILITYPRODUCT_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TTrflexibilityproductCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TTrflexibilityproductCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTrflexibilityproductCB cb = new TTrflexibilityproductCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TTrflexibilityproductCQ sq);

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
    protected TTrflexibilityproductCB newMyCB() {
        return new TTrflexibilityproductCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TTrflexibilityproductCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
