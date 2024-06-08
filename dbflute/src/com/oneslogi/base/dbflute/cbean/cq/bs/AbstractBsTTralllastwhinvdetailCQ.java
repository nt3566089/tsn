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
 * The abstract condition-query of T_TRALLLASTWHINVDETAIL.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTTralllastwhinvdetailCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTTralllastwhinvdetailCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "T_TRALLLASTWHINVDETAIL";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLLASTWHINVDETAILKEY: {PK, ID, NotNull, bigint identity(19)}
     * @param alllastwhinvdetailkey The value of alllastwhinvdetailkey as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setAlllastwhinvdetailkey_Equal(Long alllastwhinvdetailkey) {
        doSetAlllastwhinvdetailkey_Equal(alllastwhinvdetailkey);
    }

    protected void doSetAlllastwhinvdetailkey_Equal(Long alllastwhinvdetailkey) {
        regAlllastwhinvdetailkey(CK_EQ, alllastwhinvdetailkey);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLLASTWHINVDETAILKEY: {PK, ID, NotNull, bigint identity(19)}
     * @param alllastwhinvdetailkey The value of alllastwhinvdetailkey as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAlllastwhinvdetailkey_NotEqual(Long alllastwhinvdetailkey) {
        doSetAlllastwhinvdetailkey_NotEqual(alllastwhinvdetailkey);
    }

    protected void doSetAlllastwhinvdetailkey_NotEqual(Long alllastwhinvdetailkey) {
        regAlllastwhinvdetailkey(CK_NES, alllastwhinvdetailkey);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLLASTWHINVDETAILKEY: {PK, ID, NotNull, bigint identity(19)}
     * @param alllastwhinvdetailkey The value of alllastwhinvdetailkey as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAlllastwhinvdetailkey_GreaterThan(Long alllastwhinvdetailkey) {
        regAlllastwhinvdetailkey(CK_GT, alllastwhinvdetailkey);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLLASTWHINVDETAILKEY: {PK, ID, NotNull, bigint identity(19)}
     * @param alllastwhinvdetailkey The value of alllastwhinvdetailkey as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAlllastwhinvdetailkey_LessThan(Long alllastwhinvdetailkey) {
        regAlllastwhinvdetailkey(CK_LT, alllastwhinvdetailkey);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLLASTWHINVDETAILKEY: {PK, ID, NotNull, bigint identity(19)}
     * @param alllastwhinvdetailkey The value of alllastwhinvdetailkey as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAlllastwhinvdetailkey_GreaterEqual(Long alllastwhinvdetailkey) {
        regAlllastwhinvdetailkey(CK_GE, alllastwhinvdetailkey);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLLASTWHINVDETAILKEY: {PK, ID, NotNull, bigint identity(19)}
     * @param alllastwhinvdetailkey The value of alllastwhinvdetailkey as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAlllastwhinvdetailkey_LessEqual(Long alllastwhinvdetailkey) {
        regAlllastwhinvdetailkey(CK_LE, alllastwhinvdetailkey);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ALLLASTWHINVDETAILKEY: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of alllastwhinvdetailkey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of alllastwhinvdetailkey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setAlllastwhinvdetailkey_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueAlllastwhinvdetailkey(), "ALLLASTWHINVDETAILKEY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ALLLASTWHINVDETAILKEY: {PK, ID, NotNull, bigint identity(19)}
     * @param alllastwhinvdetailkeyList The collection of alllastwhinvdetailkey as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAlllastwhinvdetailkey_InScope(Collection<Long> alllastwhinvdetailkeyList) {
        doSetAlllastwhinvdetailkey_InScope(alllastwhinvdetailkeyList);
    }

    protected void doSetAlllastwhinvdetailkey_InScope(Collection<Long> alllastwhinvdetailkeyList) {
        regINS(CK_INS, cTL(alllastwhinvdetailkeyList), xgetCValueAlllastwhinvdetailkey(), "ALLLASTWHINVDETAILKEY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ALLLASTWHINVDETAILKEY: {PK, ID, NotNull, bigint identity(19)}
     * @param alllastwhinvdetailkeyList The collection of alllastwhinvdetailkey as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAlllastwhinvdetailkey_NotInScope(Collection<Long> alllastwhinvdetailkeyList) {
        doSetAlllastwhinvdetailkey_NotInScope(alllastwhinvdetailkeyList);
    }

    protected void doSetAlllastwhinvdetailkey_NotInScope(Collection<Long> alllastwhinvdetailkeyList) {
        regINS(CK_NINS, cTL(alllastwhinvdetailkeyList), xgetCValueAlllastwhinvdetailkey(), "ALLLASTWHINVDETAILKEY");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ALLLASTWHINVDETAILKEY: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setAlllastwhinvdetailkey_IsNull() { regAlllastwhinvdetailkey(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ALLLASTWHINVDETAILKEY: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setAlllastwhinvdetailkey_IsNotNull() { regAlllastwhinvdetailkey(CK_ISNN, DOBJ); }

    protected void regAlllastwhinvdetailkey(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAlllastwhinvdetailkey(), "ALLLASTWHINVDETAILKEY"); }
    protected abstract ConditionValue xgetCValueAlllastwhinvdetailkey();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {IX+, varchar(30)}
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
     * PRODUCT_CD: {IX+, varchar(30)}
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
     * PRODUCT_CD: {IX+, varchar(30)}
     * @param productCd The value of productCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_GreaterThan(String productCd) {
        regProductCd(CK_GT, fRES(productCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {IX+, varchar(30)}
     * @param productCd The value of productCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_LessThan(String productCd) {
        regProductCd(CK_LT, fRES(productCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {IX+, varchar(30)}
     * @param productCd The value of productCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_GreaterEqual(String productCd) {
        regProductCd(CK_GE, fRES(productCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {IX+, varchar(30)}
     * @param productCd The value of productCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_LessEqual(String productCd) {
        regProductCd(CK_LE, fRES(productCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCT_CD: {IX+, varchar(30)}
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
     * PRODUCT_CD: {IX+, varchar(30)}
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
     * PRODUCT_CD: {IX+, varchar(30)} <br>
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
     * PRODUCT_CD: {IX+, varchar(30)}
     * @param productCd The value of productCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setProductCd_NotLikeSearch(String productCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(productCd), xgetCValueProductCd(), "PRODUCT_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_CD: {IX+, varchar(30)}
     * @param productCd The value of productCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_PrefixSearch(String productCd) {
        setProductCd_LikeSearch(productCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PRODUCT_CD: {IX+, varchar(30)}
     */
    public void setProductCd_IsNull() { regProductCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PRODUCT_CD: {IX+, varchar(30)}
     */
    public void setProductCd_IsNullOrEmpty() { regProductCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PRODUCT_CD: {IX+, varchar(30)}
     */
    public void setProductCd_IsNotNull() { regProductCd(CK_ISNN, DOBJ); }

    protected void regProductCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProductCd(), "PRODUCT_CD"); }
    protected abstract ConditionValue xgetCValueProductCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCTDATE: {IX+, varchar(8)}
     * @param productdate The value of productdate as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductdate_Equal(String productdate) {
        doSetProductdate_Equal(fRES(productdate));
    }

    protected void doSetProductdate_Equal(String productdate) {
        regProductdate(CK_EQ, productdate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCTDATE: {IX+, varchar(8)}
     * @param productdate The value of productdate as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductdate_NotEqual(String productdate) {
        doSetProductdate_NotEqual(fRES(productdate));
    }

    protected void doSetProductdate_NotEqual(String productdate) {
        regProductdate(CK_NES, productdate);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCTDATE: {IX+, varchar(8)}
     * @param productdate The value of productdate as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductdate_GreaterThan(String productdate) {
        regProductdate(CK_GT, fRES(productdate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCTDATE: {IX+, varchar(8)}
     * @param productdate The value of productdate as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductdate_LessThan(String productdate) {
        regProductdate(CK_LT, fRES(productdate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCTDATE: {IX+, varchar(8)}
     * @param productdate The value of productdate as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductdate_GreaterEqual(String productdate) {
        regProductdate(CK_GE, fRES(productdate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCTDATE: {IX+, varchar(8)}
     * @param productdate The value of productdate as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductdate_LessEqual(String productdate) {
        regProductdate(CK_LE, fRES(productdate));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCTDATE: {IX+, varchar(8)}
     * @param productdateList The collection of productdate as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductdate_InScope(Collection<String> productdateList) {
        doSetProductdate_InScope(productdateList);
    }

    protected void doSetProductdate_InScope(Collection<String> productdateList) {
        regINS(CK_INS, cTL(productdateList), xgetCValueProductdate(), "PRODUCTDATE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCTDATE: {IX+, varchar(8)}
     * @param productdateList The collection of productdate as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductdate_NotInScope(Collection<String> productdateList) {
        doSetProductdate_NotInScope(productdateList);
    }

    protected void doSetProductdate_NotInScope(Collection<String> productdateList) {
        regINS(CK_NINS, cTL(productdateList), xgetCValueProductdate(), "PRODUCTDATE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCTDATE: {IX+, varchar(8)} <br>
     * <pre>e.g. setProductdate_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param productdate The value of productdate as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setProductdate_LikeSearch(String productdate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(productdate), xgetCValueProductdate(), "PRODUCTDATE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCTDATE: {IX+, varchar(8)}
     * @param productdate The value of productdate as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setProductdate_NotLikeSearch(String productdate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(productdate), xgetCValueProductdate(), "PRODUCTDATE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCTDATE: {IX+, varchar(8)}
     * @param productdate The value of productdate as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductdate_PrefixSearch(String productdate) {
        setProductdate_LikeSearch(productdate, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PRODUCTDATE: {IX+, varchar(8)}
     */
    public void setProductdate_IsNull() { regProductdate(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PRODUCTDATE: {IX+, varchar(8)}
     */
    public void setProductdate_IsNullOrEmpty() { regProductdate(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PRODUCTDATE: {IX+, varchar(8)}
     */
    public void setProductdate_IsNotNull() { regProductdate(CK_ISNN, DOBJ); }

    protected void regProductdate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProductdate(), "PRODUCTDATE"); }
    protected abstract ConditionValue xgetCValueProductdate();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESIGNCD: {IX+, varchar(30)}
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
     * DESIGNCD: {IX+, varchar(30)}
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
     * DESIGNCD: {IX+, varchar(30)}
     * @param designcd The value of designcd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesigncd_GreaterThan(String designcd) {
        regDesigncd(CK_GT, fRES(designcd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESIGNCD: {IX+, varchar(30)}
     * @param designcd The value of designcd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesigncd_LessThan(String designcd) {
        regDesigncd(CK_LT, fRES(designcd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESIGNCD: {IX+, varchar(30)}
     * @param designcd The value of designcd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesigncd_GreaterEqual(String designcd) {
        regDesigncd(CK_GE, fRES(designcd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESIGNCD: {IX+, varchar(30)}
     * @param designcd The value of designcd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesigncd_LessEqual(String designcd) {
        regDesigncd(CK_LE, fRES(designcd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DESIGNCD: {IX+, varchar(30)}
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
     * DESIGNCD: {IX+, varchar(30)}
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
     * DESIGNCD: {IX+, varchar(30)} <br>
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
     * DESIGNCD: {IX+, varchar(30)}
     * @param designcd The value of designcd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDesigncd_NotLikeSearch(String designcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(designcd), xgetCValueDesigncd(), "DESIGNCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESIGNCD: {IX+, varchar(30)}
     * @param designcd The value of designcd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesigncd_PrefixSearch(String designcd) {
        setDesigncd_LikeSearch(designcd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DESIGNCD: {IX+, varchar(30)}
     */
    public void setDesigncd_IsNull() { regDesigncd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DESIGNCD: {IX+, varchar(30)}
     */
    public void setDesigncd_IsNullOrEmpty() { regDesigncd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DESIGNCD: {IX+, varchar(30)}
     */
    public void setDesigncd_IsNotNull() { regDesigncd(CK_ISNN, DOBJ); }

    protected void regDesigncd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDesigncd(), "DESIGNCD"); }
    protected abstract ConditionValue xgetCValueDesigncd();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * INVNUM: {decimal(16, 6)}
     * @param invnum The value of invnum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setInvnum_Equal(java.math.BigDecimal invnum) {
        doSetInvnum_Equal(invnum);
    }

    protected void doSetInvnum_Equal(java.math.BigDecimal invnum) {
        regInvnum(CK_EQ, invnum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INVNUM: {decimal(16, 6)}
     * @param invnum The value of invnum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInvnum_NotEqual(java.math.BigDecimal invnum) {
        doSetInvnum_NotEqual(invnum);
    }

    protected void doSetInvnum_NotEqual(java.math.BigDecimal invnum) {
        regInvnum(CK_NES, invnum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INVNUM: {decimal(16, 6)}
     * @param invnum The value of invnum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInvnum_GreaterThan(java.math.BigDecimal invnum) {
        regInvnum(CK_GT, invnum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INVNUM: {decimal(16, 6)}
     * @param invnum The value of invnum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInvnum_LessThan(java.math.BigDecimal invnum) {
        regInvnum(CK_LT, invnum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INVNUM: {decimal(16, 6)}
     * @param invnum The value of invnum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInvnum_GreaterEqual(java.math.BigDecimal invnum) {
        regInvnum(CK_GE, invnum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INVNUM: {decimal(16, 6)}
     * @param invnum The value of invnum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInvnum_LessEqual(java.math.BigDecimal invnum) {
        regInvnum(CK_LE, invnum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * INVNUM: {decimal(16, 6)}
     * @param minNumber The min number of invnum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of invnum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setInvnum_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueInvnum(), "INVNUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INVNUM: {decimal(16, 6)}
     * @param invnumList The collection of invnum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvnum_InScope(Collection<java.math.BigDecimal> invnumList) {
        doSetInvnum_InScope(invnumList);
    }

    protected void doSetInvnum_InScope(Collection<java.math.BigDecimal> invnumList) {
        regINS(CK_INS, cTL(invnumList), xgetCValueInvnum(), "INVNUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INVNUM: {decimal(16, 6)}
     * @param invnumList The collection of invnum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvnum_NotInScope(Collection<java.math.BigDecimal> invnumList) {
        doSetInvnum_NotInScope(invnumList);
    }

    protected void doSetInvnum_NotInScope(Collection<java.math.BigDecimal> invnumList) {
        regINS(CK_NINS, cTL(invnumList), xgetCValueInvnum(), "INVNUM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * INVNUM: {decimal(16, 6)}
     */
    public void setInvnum_IsNull() { regInvnum(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * INVNUM: {decimal(16, 6)}
     */
    public void setInvnum_IsNotNull() { regInvnum(CK_ISNN, DOBJ); }

    protected void regInvnum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInvnum(), "INVNUM"); }
    protected abstract ConditionValue xgetCValueInvnum();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVKBNCD: {char(1)}
     * @param invkbncd The value of invkbncd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvkbncd_Equal(String invkbncd) {
        doSetInvkbncd_Equal(fRES(invkbncd));
    }

    protected void doSetInvkbncd_Equal(String invkbncd) {
        regInvkbncd(CK_EQ, invkbncd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVKBNCD: {char(1)}
     * @param invkbncd The value of invkbncd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvkbncd_NotEqual(String invkbncd) {
        doSetInvkbncd_NotEqual(fRES(invkbncd));
    }

    protected void doSetInvkbncd_NotEqual(String invkbncd) {
        regInvkbncd(CK_NES, invkbncd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVKBNCD: {char(1)}
     * @param invkbncd The value of invkbncd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvkbncd_GreaterThan(String invkbncd) {
        regInvkbncd(CK_GT, fRES(invkbncd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVKBNCD: {char(1)}
     * @param invkbncd The value of invkbncd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvkbncd_LessThan(String invkbncd) {
        regInvkbncd(CK_LT, fRES(invkbncd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVKBNCD: {char(1)}
     * @param invkbncd The value of invkbncd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvkbncd_GreaterEqual(String invkbncd) {
        regInvkbncd(CK_GE, fRES(invkbncd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVKBNCD: {char(1)}
     * @param invkbncd The value of invkbncd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvkbncd_LessEqual(String invkbncd) {
        regInvkbncd(CK_LE, fRES(invkbncd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INVKBNCD: {char(1)}
     * @param invkbncdList The collection of invkbncd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvkbncd_InScope(Collection<String> invkbncdList) {
        doSetInvkbncd_InScope(invkbncdList);
    }

    protected void doSetInvkbncd_InScope(Collection<String> invkbncdList) {
        regINS(CK_INS, cTL(invkbncdList), xgetCValueInvkbncd(), "INVKBNCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INVKBNCD: {char(1)}
     * @param invkbncdList The collection of invkbncd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvkbncd_NotInScope(Collection<String> invkbncdList) {
        doSetInvkbncd_NotInScope(invkbncdList);
    }

    protected void doSetInvkbncd_NotInScope(Collection<String> invkbncdList) {
        regINS(CK_NINS, cTL(invkbncdList), xgetCValueInvkbncd(), "INVKBNCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INVKBNCD: {char(1)} <br>
     * <pre>e.g. setInvkbncd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param invkbncd The value of invkbncd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setInvkbncd_LikeSearch(String invkbncd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(invkbncd), xgetCValueInvkbncd(), "INVKBNCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INVKBNCD: {char(1)}
     * @param invkbncd The value of invkbncd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setInvkbncd_NotLikeSearch(String invkbncd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(invkbncd), xgetCValueInvkbncd(), "INVKBNCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INVKBNCD: {char(1)}
     * @param invkbncd The value of invkbncd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvkbncd_PrefixSearch(String invkbncd) {
        setInvkbncd_LikeSearch(invkbncd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * INVKBNCD: {char(1)}
     */
    public void setInvkbncd_IsNull() { regInvkbncd(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * INVKBNCD: {char(1)}
     */
    public void setInvkbncd_IsNotNull() { regInvkbncd(CK_ISNN, DOBJ); }

    protected void regInvkbncd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInvkbncd(), "INVKBNCD"); }
    protected abstract ConditionValue xgetCValueInvkbncd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVKBN: {varchar(30)}
     * @param invkbn The value of invkbn as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvkbn_Equal(String invkbn) {
        doSetInvkbn_Equal(fRES(invkbn));
    }

    protected void doSetInvkbn_Equal(String invkbn) {
        regInvkbn(CK_EQ, invkbn);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVKBN: {varchar(30)}
     * @param invkbn The value of invkbn as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvkbn_NotEqual(String invkbn) {
        doSetInvkbn_NotEqual(fRES(invkbn));
    }

    protected void doSetInvkbn_NotEqual(String invkbn) {
        regInvkbn(CK_NES, invkbn);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVKBN: {varchar(30)}
     * @param invkbn The value of invkbn as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvkbn_GreaterThan(String invkbn) {
        regInvkbn(CK_GT, fRES(invkbn));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVKBN: {varchar(30)}
     * @param invkbn The value of invkbn as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvkbn_LessThan(String invkbn) {
        regInvkbn(CK_LT, fRES(invkbn));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVKBN: {varchar(30)}
     * @param invkbn The value of invkbn as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvkbn_GreaterEqual(String invkbn) {
        regInvkbn(CK_GE, fRES(invkbn));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVKBN: {varchar(30)}
     * @param invkbn The value of invkbn as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvkbn_LessEqual(String invkbn) {
        regInvkbn(CK_LE, fRES(invkbn));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INVKBN: {varchar(30)}
     * @param invkbnList The collection of invkbn as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvkbn_InScope(Collection<String> invkbnList) {
        doSetInvkbn_InScope(invkbnList);
    }

    protected void doSetInvkbn_InScope(Collection<String> invkbnList) {
        regINS(CK_INS, cTL(invkbnList), xgetCValueInvkbn(), "INVKBN");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INVKBN: {varchar(30)}
     * @param invkbnList The collection of invkbn as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvkbn_NotInScope(Collection<String> invkbnList) {
        doSetInvkbn_NotInScope(invkbnList);
    }

    protected void doSetInvkbn_NotInScope(Collection<String> invkbnList) {
        regINS(CK_NINS, cTL(invkbnList), xgetCValueInvkbn(), "INVKBN");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INVKBN: {varchar(30)} <br>
     * <pre>e.g. setInvkbn_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param invkbn The value of invkbn as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setInvkbn_LikeSearch(String invkbn, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(invkbn), xgetCValueInvkbn(), "INVKBN", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INVKBN: {varchar(30)}
     * @param invkbn The value of invkbn as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setInvkbn_NotLikeSearch(String invkbn, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(invkbn), xgetCValueInvkbn(), "INVKBN", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INVKBN: {varchar(30)}
     * @param invkbn The value of invkbn as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvkbn_PrefixSearch(String invkbn) {
        setInvkbn_LikeSearch(invkbn, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * INVKBN: {varchar(30)}
     */
    public void setInvkbn_IsNull() { regInvkbn(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * INVKBN: {varchar(30)}
     */
    public void setInvkbn_IsNullOrEmpty() { regInvkbn(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * INVKBN: {varchar(30)}
     */
    public void setInvkbn_IsNotNull() { regInvkbn(CK_ISNN, DOBJ); }

    protected void regInvkbn(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInvkbn(), "INVKBN"); }
    protected abstract ConditionValue xgetCValueInvkbn();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRANSPORTCD: {varchar(30)}
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
     * TRANSPORTCD: {varchar(30)}
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
     * TRANSPORTCD: {varchar(30)}
     * @param transportcd The value of transportcd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransportcd_GreaterThan(String transportcd) {
        regTransportcd(CK_GT, fRES(transportcd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRANSPORTCD: {varchar(30)}
     * @param transportcd The value of transportcd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransportcd_LessThan(String transportcd) {
        regTransportcd(CK_LT, fRES(transportcd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRANSPORTCD: {varchar(30)}
     * @param transportcd The value of transportcd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransportcd_GreaterEqual(String transportcd) {
        regTransportcd(CK_GE, fRES(transportcd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRANSPORTCD: {varchar(30)}
     * @param transportcd The value of transportcd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransportcd_LessEqual(String transportcd) {
        regTransportcd(CK_LE, fRES(transportcd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TRANSPORTCD: {varchar(30)}
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
     * TRANSPORTCD: {varchar(30)}
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
     * TRANSPORTCD: {varchar(30)} <br>
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
     * TRANSPORTCD: {varchar(30)}
     * @param transportcd The value of transportcd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTransportcd_NotLikeSearch(String transportcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(transportcd), xgetCValueTransportcd(), "TRANSPORTCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TRANSPORTCD: {varchar(30)}
     * @param transportcd The value of transportcd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransportcd_PrefixSearch(String transportcd) {
        setTransportcd_LikeSearch(transportcd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TRANSPORTCD: {varchar(30)}
     */
    public void setTransportcd_IsNull() { regTransportcd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TRANSPORTCD: {varchar(30)}
     */
    public void setTransportcd_IsNullOrEmpty() { regTransportcd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TRANSPORTCD: {varchar(30)}
     */
    public void setTransportcd_IsNotNull() { regTransportcd(CK_ISNN, DOBJ); }

    protected void regTransportcd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTransportcd(), "TRANSPORTCD"); }
    protected abstract ConditionValue xgetCValueTransportcd();

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
     * ASSORTEDUNIT: {varchar(30)}
     * @param assortedunit The value of assortedunit as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortedunit_Equal(String assortedunit) {
        doSetAssortedunit_Equal(fRES(assortedunit));
    }

    protected void doSetAssortedunit_Equal(String assortedunit) {
        regAssortedunit(CK_EQ, assortedunit);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ASSORTEDUNIT: {varchar(30)}
     * @param assortedunit The value of assortedunit as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortedunit_NotEqual(String assortedunit) {
        doSetAssortedunit_NotEqual(fRES(assortedunit));
    }

    protected void doSetAssortedunit_NotEqual(String assortedunit) {
        regAssortedunit(CK_NES, assortedunit);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ASSORTEDUNIT: {varchar(30)}
     * @param assortedunit The value of assortedunit as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortedunit_GreaterThan(String assortedunit) {
        regAssortedunit(CK_GT, fRES(assortedunit));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ASSORTEDUNIT: {varchar(30)}
     * @param assortedunit The value of assortedunit as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortedunit_LessThan(String assortedunit) {
        regAssortedunit(CK_LT, fRES(assortedunit));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ASSORTEDUNIT: {varchar(30)}
     * @param assortedunit The value of assortedunit as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortedunit_GreaterEqual(String assortedunit) {
        regAssortedunit(CK_GE, fRES(assortedunit));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ASSORTEDUNIT: {varchar(30)}
     * @param assortedunit The value of assortedunit as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortedunit_LessEqual(String assortedunit) {
        regAssortedunit(CK_LE, fRES(assortedunit));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ASSORTEDUNIT: {varchar(30)}
     * @param assortedunitList The collection of assortedunit as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortedunit_InScope(Collection<String> assortedunitList) {
        doSetAssortedunit_InScope(assortedunitList);
    }

    protected void doSetAssortedunit_InScope(Collection<String> assortedunitList) {
        regINS(CK_INS, cTL(assortedunitList), xgetCValueAssortedunit(), "ASSORTEDUNIT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ASSORTEDUNIT: {varchar(30)}
     * @param assortedunitList The collection of assortedunit as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortedunit_NotInScope(Collection<String> assortedunitList) {
        doSetAssortedunit_NotInScope(assortedunitList);
    }

    protected void doSetAssortedunit_NotInScope(Collection<String> assortedunitList) {
        regINS(CK_NINS, cTL(assortedunitList), xgetCValueAssortedunit(), "ASSORTEDUNIT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ASSORTEDUNIT: {varchar(30)} <br>
     * <pre>e.g. setAssortedunit_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param assortedunit The value of assortedunit as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAssortedunit_LikeSearch(String assortedunit, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(assortedunit), xgetCValueAssortedunit(), "ASSORTEDUNIT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ASSORTEDUNIT: {varchar(30)}
     * @param assortedunit The value of assortedunit as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setAssortedunit_NotLikeSearch(String assortedunit, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(assortedunit), xgetCValueAssortedunit(), "ASSORTEDUNIT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ASSORTEDUNIT: {varchar(30)}
     * @param assortedunit The value of assortedunit as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortedunit_PrefixSearch(String assortedunit) {
        setAssortedunit_LikeSearch(assortedunit, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ASSORTEDUNIT: {varchar(30)}
     */
    public void setAssortedunit_IsNull() { regAssortedunit(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ASSORTEDUNIT: {varchar(30)}
     */
    public void setAssortedunit_IsNullOrEmpty() { regAssortedunit(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ASSORTEDUNIT: {varchar(30)}
     */
    public void setAssortedunit_IsNotNull() { regAssortedunit(CK_ISNN, DOBJ); }

    protected void regAssortedunit(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAssortedunit(), "ASSORTEDUNIT"); }
    protected abstract ConditionValue xgetCValueAssortedunit();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCCD: {varchar(30)}
     * @param loccd The value of loccd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLoccd_Equal(String loccd) {
        doSetLoccd_Equal(fRES(loccd));
    }

    protected void doSetLoccd_Equal(String loccd) {
        regLoccd(CK_EQ, loccd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCCD: {varchar(30)}
     * @param loccd The value of loccd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLoccd_NotEqual(String loccd) {
        doSetLoccd_NotEqual(fRES(loccd));
    }

    protected void doSetLoccd_NotEqual(String loccd) {
        regLoccd(CK_NES, loccd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCCD: {varchar(30)}
     * @param loccd The value of loccd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLoccd_GreaterThan(String loccd) {
        regLoccd(CK_GT, fRES(loccd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCCD: {varchar(30)}
     * @param loccd The value of loccd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLoccd_LessThan(String loccd) {
        regLoccd(CK_LT, fRES(loccd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCCD: {varchar(30)}
     * @param loccd The value of loccd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLoccd_GreaterEqual(String loccd) {
        regLoccd(CK_GE, fRES(loccd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCCD: {varchar(30)}
     * @param loccd The value of loccd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLoccd_LessEqual(String loccd) {
        regLoccd(CK_LE, fRES(loccd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOCCD: {varchar(30)}
     * @param loccdList The collection of loccd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLoccd_InScope(Collection<String> loccdList) {
        doSetLoccd_InScope(loccdList);
    }

    protected void doSetLoccd_InScope(Collection<String> loccdList) {
        regINS(CK_INS, cTL(loccdList), xgetCValueLoccd(), "LOCCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOCCD: {varchar(30)}
     * @param loccdList The collection of loccd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLoccd_NotInScope(Collection<String> loccdList) {
        doSetLoccd_NotInScope(loccdList);
    }

    protected void doSetLoccd_NotInScope(Collection<String> loccdList) {
        regINS(CK_NINS, cTL(loccdList), xgetCValueLoccd(), "LOCCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOCCD: {varchar(30)} <br>
     * <pre>e.g. setLoccd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param loccd The value of loccd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLoccd_LikeSearch(String loccd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(loccd), xgetCValueLoccd(), "LOCCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOCCD: {varchar(30)}
     * @param loccd The value of loccd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLoccd_NotLikeSearch(String loccd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(loccd), xgetCValueLoccd(), "LOCCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOCCD: {varchar(30)}
     * @param loccd The value of loccd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLoccd_PrefixSearch(String loccd) {
        setLoccd_LikeSearch(loccd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOCCD: {varchar(30)}
     */
    public void setLoccd_IsNull() { regLoccd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LOCCD: {varchar(30)}
     */
    public void setLoccd_IsNullOrEmpty() { regLoccd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOCCD: {varchar(30)}
     */
    public void setLoccd_IsNotNull() { regLoccd(CK_ISNN, DOBJ); }

    protected void regLoccd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLoccd(), "LOCCD"); }
    protected abstract ConditionValue xgetCValueLoccd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCHDATE: {varchar(8)}
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
     * SCHDATE: {varchar(8)}
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
     * SCHDATE: {varchar(8)}
     * @param schdate The value of schdate as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSchdate_GreaterThan(String schdate) {
        regSchdate(CK_GT, fRES(schdate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCHDATE: {varchar(8)}
     * @param schdate The value of schdate as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSchdate_LessThan(String schdate) {
        regSchdate(CK_LT, fRES(schdate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCHDATE: {varchar(8)}
     * @param schdate The value of schdate as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSchdate_GreaterEqual(String schdate) {
        regSchdate(CK_GE, fRES(schdate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCHDATE: {varchar(8)}
     * @param schdate The value of schdate as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSchdate_LessEqual(String schdate) {
        regSchdate(CK_LE, fRES(schdate));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SCHDATE: {varchar(8)}
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
     * SCHDATE: {varchar(8)}
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
     * SCHDATE: {varchar(8)} <br>
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
     * SCHDATE: {varchar(8)}
     * @param schdate The value of schdate as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSchdate_NotLikeSearch(String schdate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(schdate), xgetCValueSchdate(), "SCHDATE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SCHDATE: {varchar(8)}
     * @param schdate The value of schdate as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSchdate_PrefixSearch(String schdate) {
        setSchdate_LikeSearch(schdate, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SCHDATE: {varchar(8)}
     */
    public void setSchdate_IsNull() { regSchdate(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SCHDATE: {varchar(8)}
     */
    public void setSchdate_IsNullOrEmpty() { regSchdate(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SCHDATE: {varchar(8)}
     */
    public void setSchdate_IsNotNull() { regSchdate(CK_ISNN, DOBJ); }

    protected void regSchdate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSchdate(), "SCHDATE"); }
    protected abstract ConditionValue xgetCValueSchdate();

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
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * OUTPUTTYPE: {decimal(16, 6)}
     * @param outputtype The value of outputtype as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setOutputtype_Equal(java.math.BigDecimal outputtype) {
        doSetOutputtype_Equal(outputtype);
    }

    protected void doSetOutputtype_Equal(java.math.BigDecimal outputtype) {
        regOutputtype(CK_EQ, outputtype);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * OUTPUTTYPE: {decimal(16, 6)}
     * @param outputtype The value of outputtype as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOutputtype_NotEqual(java.math.BigDecimal outputtype) {
        doSetOutputtype_NotEqual(outputtype);
    }

    protected void doSetOutputtype_NotEqual(java.math.BigDecimal outputtype) {
        regOutputtype(CK_NES, outputtype);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * OUTPUTTYPE: {decimal(16, 6)}
     * @param outputtype The value of outputtype as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setOutputtype_GreaterThan(java.math.BigDecimal outputtype) {
        regOutputtype(CK_GT, outputtype);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * OUTPUTTYPE: {decimal(16, 6)}
     * @param outputtype The value of outputtype as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setOutputtype_LessThan(java.math.BigDecimal outputtype) {
        regOutputtype(CK_LT, outputtype);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * OUTPUTTYPE: {decimal(16, 6)}
     * @param outputtype The value of outputtype as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOutputtype_GreaterEqual(java.math.BigDecimal outputtype) {
        regOutputtype(CK_GE, outputtype);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * OUTPUTTYPE: {decimal(16, 6)}
     * @param outputtype The value of outputtype as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOutputtype_LessEqual(java.math.BigDecimal outputtype) {
        regOutputtype(CK_LE, outputtype);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * OUTPUTTYPE: {decimal(16, 6)}
     * @param minNumber The min number of outputtype. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of outputtype. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setOutputtype_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueOutputtype(), "OUTPUTTYPE", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * OUTPUTTYPE: {decimal(16, 6)}
     * @param outputtypeList The collection of outputtype as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOutputtype_InScope(Collection<java.math.BigDecimal> outputtypeList) {
        doSetOutputtype_InScope(outputtypeList);
    }

    protected void doSetOutputtype_InScope(Collection<java.math.BigDecimal> outputtypeList) {
        regINS(CK_INS, cTL(outputtypeList), xgetCValueOutputtype(), "OUTPUTTYPE");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * OUTPUTTYPE: {decimal(16, 6)}
     * @param outputtypeList The collection of outputtype as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOutputtype_NotInScope(Collection<java.math.BigDecimal> outputtypeList) {
        doSetOutputtype_NotInScope(outputtypeList);
    }

    protected void doSetOutputtype_NotInScope(Collection<java.math.BigDecimal> outputtypeList) {
        regINS(CK_NINS, cTL(outputtypeList), xgetCValueOutputtype(), "OUTPUTTYPE");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * OUTPUTTYPE: {decimal(16, 6)}
     */
    public void setOutputtype_IsNull() { regOutputtype(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * OUTPUTTYPE: {decimal(16, 6)}
     */
    public void setOutputtype_IsNotNull() { regOutputtype(CK_ISNN, DOBJ); }

    protected void regOutputtype(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOutputtype(), "OUTPUTTYPE"); }
    protected abstract ConditionValue xgetCValueOutputtype();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * OUTPUTORG: {bigint(19)}
     * @param outputorg The value of outputorg as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setOutputorg_Equal(Long outputorg) {
        doSetOutputorg_Equal(outputorg);
    }

    protected void doSetOutputorg_Equal(Long outputorg) {
        regOutputorg(CK_EQ, outputorg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * OUTPUTORG: {bigint(19)}
     * @param outputorg The value of outputorg as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOutputorg_NotEqual(Long outputorg) {
        doSetOutputorg_NotEqual(outputorg);
    }

    protected void doSetOutputorg_NotEqual(Long outputorg) {
        regOutputorg(CK_NES, outputorg);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * OUTPUTORG: {bigint(19)}
     * @param outputorg The value of outputorg as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setOutputorg_GreaterThan(Long outputorg) {
        regOutputorg(CK_GT, outputorg);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * OUTPUTORG: {bigint(19)}
     * @param outputorg The value of outputorg as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setOutputorg_LessThan(Long outputorg) {
        regOutputorg(CK_LT, outputorg);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * OUTPUTORG: {bigint(19)}
     * @param outputorg The value of outputorg as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOutputorg_GreaterEqual(Long outputorg) {
        regOutputorg(CK_GE, outputorg);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * OUTPUTORG: {bigint(19)}
     * @param outputorg The value of outputorg as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOutputorg_LessEqual(Long outputorg) {
        regOutputorg(CK_LE, outputorg);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * OUTPUTORG: {bigint(19)}
     * @param minNumber The min number of outputorg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of outputorg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setOutputorg_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueOutputorg(), "OUTPUTORG", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * OUTPUTORG: {bigint(19)}
     * @param outputorgList The collection of outputorg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOutputorg_InScope(Collection<Long> outputorgList) {
        doSetOutputorg_InScope(outputorgList);
    }

    protected void doSetOutputorg_InScope(Collection<Long> outputorgList) {
        regINS(CK_INS, cTL(outputorgList), xgetCValueOutputorg(), "OUTPUTORG");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * OUTPUTORG: {bigint(19)}
     * @param outputorgList The collection of outputorg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOutputorg_NotInScope(Collection<Long> outputorgList) {
        doSetOutputorg_NotInScope(outputorgList);
    }

    protected void doSetOutputorg_NotInScope(Collection<Long> outputorgList) {
        regINS(CK_NINS, cTL(outputorgList), xgetCValueOutputorg(), "OUTPUTORG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * OUTPUTORG: {bigint(19)}
     */
    public void setOutputorg_IsNull() { regOutputorg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * OUTPUTORG: {bigint(19)}
     */
    public void setOutputorg_IsNotNull() { regOutputorg(CK_ISNN, DOBJ); }

    protected void regOutputorg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOutputorg(), "OUTPUTORG"); }
    protected abstract ConditionValue xgetCValueOutputorg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * USETYPE: {IX+, bigint(19)}
     * @param usetype The value of usetype as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setUsetype_Equal(Long usetype) {
        doSetUsetype_Equal(usetype);
    }

    protected void doSetUsetype_Equal(Long usetype) {
        regUsetype(CK_EQ, usetype);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * USETYPE: {IX+, bigint(19)}
     * @param usetype The value of usetype as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUsetype_NotEqual(Long usetype) {
        doSetUsetype_NotEqual(usetype);
    }

    protected void doSetUsetype_NotEqual(Long usetype) {
        regUsetype(CK_NES, usetype);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * USETYPE: {IX+, bigint(19)}
     * @param usetype The value of usetype as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUsetype_GreaterThan(Long usetype) {
        regUsetype(CK_GT, usetype);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * USETYPE: {IX+, bigint(19)}
     * @param usetype The value of usetype as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUsetype_LessThan(Long usetype) {
        regUsetype(CK_LT, usetype);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * USETYPE: {IX+, bigint(19)}
     * @param usetype The value of usetype as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUsetype_GreaterEqual(Long usetype) {
        regUsetype(CK_GE, usetype);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * USETYPE: {IX+, bigint(19)}
     * @param usetype The value of usetype as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUsetype_LessEqual(Long usetype) {
        regUsetype(CK_LE, usetype);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * USETYPE: {IX+, bigint(19)}
     * @param minNumber The min number of usetype. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of usetype. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setUsetype_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueUsetype(), "USETYPE", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * USETYPE: {IX+, bigint(19)}
     * @param usetypeList The collection of usetype as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUsetype_InScope(Collection<Long> usetypeList) {
        doSetUsetype_InScope(usetypeList);
    }

    protected void doSetUsetype_InScope(Collection<Long> usetypeList) {
        regINS(CK_INS, cTL(usetypeList), xgetCValueUsetype(), "USETYPE");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * USETYPE: {IX+, bigint(19)}
     * @param usetypeList The collection of usetype as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUsetype_NotInScope(Collection<Long> usetypeList) {
        doSetUsetype_NotInScope(usetypeList);
    }

    protected void doSetUsetype_NotInScope(Collection<Long> usetypeList) {
        regINS(CK_NINS, cTL(usetypeList), xgetCValueUsetype(), "USETYPE");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * USETYPE: {IX+, bigint(19)}
     */
    public void setUsetype_IsNull() { regUsetype(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * USETYPE: {IX+, bigint(19)}
     */
    public void setUsetype_IsNotNull() { regUsetype(CK_ISNN, DOBJ); }

    protected void regUsetype(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUsetype(), "USETYPE"); }
    protected abstract ConditionValue xgetCValueUsetype();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PROCFLG: {bigint(19)}
     * @param procflg The value of procflg as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setProcflg_Equal(Long procflg) {
        doSetProcflg_Equal(procflg);
    }

    protected void doSetProcflg_Equal(Long procflg) {
        regProcflg(CK_EQ, procflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PROCFLG: {bigint(19)}
     * @param procflg The value of procflg as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProcflg_NotEqual(Long procflg) {
        doSetProcflg_NotEqual(procflg);
    }

    protected void doSetProcflg_NotEqual(Long procflg) {
        regProcflg(CK_NES, procflg);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PROCFLG: {bigint(19)}
     * @param procflg The value of procflg as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setProcflg_GreaterThan(Long procflg) {
        regProcflg(CK_GT, procflg);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PROCFLG: {bigint(19)}
     * @param procflg The value of procflg as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setProcflg_LessThan(Long procflg) {
        regProcflg(CK_LT, procflg);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PROCFLG: {bigint(19)}
     * @param procflg The value of procflg as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProcflg_GreaterEqual(Long procflg) {
        regProcflg(CK_GE, procflg);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PROCFLG: {bigint(19)}
     * @param procflg The value of procflg as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProcflg_LessEqual(Long procflg) {
        regProcflg(CK_LE, procflg);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PROCFLG: {bigint(19)}
     * @param minNumber The min number of procflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of procflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setProcflg_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueProcflg(), "PROCFLG", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PROCFLG: {bigint(19)}
     * @param procflgList The collection of procflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcflg_InScope(Collection<Long> procflgList) {
        doSetProcflg_InScope(procflgList);
    }

    protected void doSetProcflg_InScope(Collection<Long> procflgList) {
        regINS(CK_INS, cTL(procflgList), xgetCValueProcflg(), "PROCFLG");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PROCFLG: {bigint(19)}
     * @param procflgList The collection of procflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcflg_NotInScope(Collection<Long> procflgList) {
        doSetProcflg_NotInScope(procflgList);
    }

    protected void doSetProcflg_NotInScope(Collection<Long> procflgList) {
        regINS(CK_NINS, cTL(procflgList), xgetCValueProcflg(), "PROCFLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PROCFLG: {bigint(19)}
     */
    public void setProcflg_IsNull() { regProcflg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PROCFLG: {bigint(19)}
     */
    public void setProcflg_IsNotNull() { regProcflg(CK_ISNN, DOBJ); }

    protected void regProcflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProcflg(), "PROCFLG"); }
    protected abstract ConditionValue xgetCValueProcflg();

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
    public HpSLCFunction<TTralllastwhinvdetailCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TTralllastwhinvdetailCB.class);
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
    public HpSLCFunction<TTralllastwhinvdetailCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TTralllastwhinvdetailCB.class);
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
    public HpSLCFunction<TTralllastwhinvdetailCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TTralllastwhinvdetailCB.class);
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
    public HpSLCFunction<TTralllastwhinvdetailCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TTralllastwhinvdetailCB.class);
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
    public HpSLCFunction<TTralllastwhinvdetailCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TTralllastwhinvdetailCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TTralllastwhinvdetailCB&gt;() {
     *     public void query(TTralllastwhinvdetailCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TTralllastwhinvdetailCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TTralllastwhinvdetailCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TTralllastwhinvdetailCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TTralllastwhinvdetailCQ sq);

    protected TTralllastwhinvdetailCB xcreateScalarConditionCB() {
        TTralllastwhinvdetailCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TTralllastwhinvdetailCB xcreateScalarConditionPartitionByCB() {
        TTralllastwhinvdetailCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TTralllastwhinvdetailCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTralllastwhinvdetailCB cb = new TTralllastwhinvdetailCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "ALLLASTWHINVDETAILKEY";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TTralllastwhinvdetailCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TTralllastwhinvdetailCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TTralllastwhinvdetailCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTralllastwhinvdetailCB cb = new TTralllastwhinvdetailCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "ALLLASTWHINVDETAILKEY";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TTralllastwhinvdetailCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TTralllastwhinvdetailCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTralllastwhinvdetailCB cb = new TTralllastwhinvdetailCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TTralllastwhinvdetailCQ sq);

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
    protected TTralllastwhinvdetailCB newMyCB() {
        return new TTralllastwhinvdetailCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TTralllastwhinvdetailCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
