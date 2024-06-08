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
 * The abstract condition-query of E_PRODUCT_CODE_CONVERSION.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsEProductCodeConversionCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsEProductCodeConversionCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "E_PRODUCT_CODE_CONVERSION";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CODE_CONVERSION_ID: {PK, NotNull, bigint(19)}
     * @param productCodeConversionId The value of productCodeConversionId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductCodeConversionId_Equal(Long productCodeConversionId) {
        doSetProductCodeConversionId_Equal(productCodeConversionId);
    }

    protected void doSetProductCodeConversionId_Equal(Long productCodeConversionId) {
        regProductCodeConversionId(CK_EQ, productCodeConversionId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CODE_CONVERSION_ID: {PK, NotNull, bigint(19)}
     * @param productCodeConversionId The value of productCodeConversionId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductCodeConversionId_NotEqual(Long productCodeConversionId) {
        doSetProductCodeConversionId_NotEqual(productCodeConversionId);
    }

    protected void doSetProductCodeConversionId_NotEqual(Long productCodeConversionId) {
        regProductCodeConversionId(CK_NES, productCodeConversionId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CODE_CONVERSION_ID: {PK, NotNull, bigint(19)}
     * @param productCodeConversionId The value of productCodeConversionId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductCodeConversionId_GreaterThan(Long productCodeConversionId) {
        regProductCodeConversionId(CK_GT, productCodeConversionId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CODE_CONVERSION_ID: {PK, NotNull, bigint(19)}
     * @param productCodeConversionId The value of productCodeConversionId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductCodeConversionId_LessThan(Long productCodeConversionId) {
        regProductCodeConversionId(CK_LT, productCodeConversionId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CODE_CONVERSION_ID: {PK, NotNull, bigint(19)}
     * @param productCodeConversionId The value of productCodeConversionId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductCodeConversionId_GreaterEqual(Long productCodeConversionId) {
        regProductCodeConversionId(CK_GE, productCodeConversionId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CODE_CONVERSION_ID: {PK, NotNull, bigint(19)}
     * @param productCodeConversionId The value of productCodeConversionId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductCodeConversionId_LessEqual(Long productCodeConversionId) {
        regProductCodeConversionId(CK_LE, productCodeConversionId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CODE_CONVERSION_ID: {PK, NotNull, bigint(19)}
     * @param minNumber The min number of productCodeConversionId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of productCodeConversionId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setProductCodeConversionId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueProductCodeConversionId(), "PRODUCT_CODE_CONVERSION_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRODUCT_CODE_CONVERSION_ID: {PK, NotNull, bigint(19)}
     * @param productCodeConversionIdList The collection of productCodeConversionId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCodeConversionId_InScope(Collection<Long> productCodeConversionIdList) {
        doSetProductCodeConversionId_InScope(productCodeConversionIdList);
    }

    protected void doSetProductCodeConversionId_InScope(Collection<Long> productCodeConversionIdList) {
        regINS(CK_INS, cTL(productCodeConversionIdList), xgetCValueProductCodeConversionId(), "PRODUCT_CODE_CONVERSION_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRODUCT_CODE_CONVERSION_ID: {PK, NotNull, bigint(19)}
     * @param productCodeConversionIdList The collection of productCodeConversionId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCodeConversionId_NotInScope(Collection<Long> productCodeConversionIdList) {
        doSetProductCodeConversionId_NotInScope(productCodeConversionIdList);
    }

    protected void doSetProductCodeConversionId_NotInScope(Collection<Long> productCodeConversionIdList) {
        regINS(CK_NINS, cTL(productCodeConversionIdList), xgetCValueProductCodeConversionId(), "PRODUCT_CODE_CONVERSION_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PRODUCT_CODE_CONVERSION_ID: {PK, NotNull, bigint(19)}
     */
    public void setProductCodeConversionId_IsNull() { regProductCodeConversionId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PRODUCT_CODE_CONVERSION_ID: {PK, NotNull, bigint(19)}
     */
    public void setProductCodeConversionId_IsNotNull() { regProductCodeConversionId(CK_ISNN, DOBJ); }

    protected void regProductCodeConversionId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProductCodeConversionId(), "PRODUCT_CODE_CONVERSION_ID"); }
    protected abstract ConditionValue xgetCValueProductCodeConversionId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * JTTSFLG: {varchar(30)}
     * @param jttsflg The value of jttsflg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJttsflg_Equal(String jttsflg) {
        doSetJttsflg_Equal(fRES(jttsflg));
    }

    protected void doSetJttsflg_Equal(String jttsflg) {
        regJttsflg(CK_EQ, jttsflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * JTTSFLG: {varchar(30)}
     * @param jttsflg The value of jttsflg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJttsflg_NotEqual(String jttsflg) {
        doSetJttsflg_NotEqual(fRES(jttsflg));
    }

    protected void doSetJttsflg_NotEqual(String jttsflg) {
        regJttsflg(CK_NES, jttsflg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * JTTSFLG: {varchar(30)}
     * @param jttsflg The value of jttsflg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJttsflg_GreaterThan(String jttsflg) {
        regJttsflg(CK_GT, fRES(jttsflg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * JTTSFLG: {varchar(30)}
     * @param jttsflg The value of jttsflg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJttsflg_LessThan(String jttsflg) {
        regJttsflg(CK_LT, fRES(jttsflg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * JTTSFLG: {varchar(30)}
     * @param jttsflg The value of jttsflg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJttsflg_GreaterEqual(String jttsflg) {
        regJttsflg(CK_GE, fRES(jttsflg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * JTTSFLG: {varchar(30)}
     * @param jttsflg The value of jttsflg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJttsflg_LessEqual(String jttsflg) {
        regJttsflg(CK_LE, fRES(jttsflg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * JTTSFLG: {varchar(30)}
     * @param jttsflgList The collection of jttsflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJttsflg_InScope(Collection<String> jttsflgList) {
        doSetJttsflg_InScope(jttsflgList);
    }

    protected void doSetJttsflg_InScope(Collection<String> jttsflgList) {
        regINS(CK_INS, cTL(jttsflgList), xgetCValueJttsflg(), "JTTSFLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * JTTSFLG: {varchar(30)}
     * @param jttsflgList The collection of jttsflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJttsflg_NotInScope(Collection<String> jttsflgList) {
        doSetJttsflg_NotInScope(jttsflgList);
    }

    protected void doSetJttsflg_NotInScope(Collection<String> jttsflgList) {
        regINS(CK_NINS, cTL(jttsflgList), xgetCValueJttsflg(), "JTTSFLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * JTTSFLG: {varchar(30)} <br>
     * <pre>e.g. setJttsflg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param jttsflg The value of jttsflg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setJttsflg_LikeSearch(String jttsflg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(jttsflg), xgetCValueJttsflg(), "JTTSFLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * JTTSFLG: {varchar(30)}
     * @param jttsflg The value of jttsflg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setJttsflg_NotLikeSearch(String jttsflg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(jttsflg), xgetCValueJttsflg(), "JTTSFLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * JTTSFLG: {varchar(30)}
     * @param jttsflg The value of jttsflg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJttsflg_PrefixSearch(String jttsflg) {
        setJttsflg_LikeSearch(jttsflg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * JTTSFLG: {varchar(30)}
     */
    public void setJttsflg_IsNull() { regJttsflg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * JTTSFLG: {varchar(30)}
     */
    public void setJttsflg_IsNullOrEmpty() { regJttsflg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * JTTSFLG: {varchar(30)}
     */
    public void setJttsflg_IsNotNull() { regJttsflg(CK_ISNN, DOBJ); }

    protected void regJttsflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueJttsflg(), "JTTSFLG"); }
    protected abstract ConditionValue xgetCValueJttsflg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMPANYCD: {varchar(30)}
     * @param companycd The value of companycd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompanycd_Equal(String companycd) {
        doSetCompanycd_Equal(fRES(companycd));
    }

    protected void doSetCompanycd_Equal(String companycd) {
        regCompanycd(CK_EQ, companycd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMPANYCD: {varchar(30)}
     * @param companycd The value of companycd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompanycd_NotEqual(String companycd) {
        doSetCompanycd_NotEqual(fRES(companycd));
    }

    protected void doSetCompanycd_NotEqual(String companycd) {
        regCompanycd(CK_NES, companycd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMPANYCD: {varchar(30)}
     * @param companycd The value of companycd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompanycd_GreaterThan(String companycd) {
        regCompanycd(CK_GT, fRES(companycd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMPANYCD: {varchar(30)}
     * @param companycd The value of companycd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompanycd_LessThan(String companycd) {
        regCompanycd(CK_LT, fRES(companycd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMPANYCD: {varchar(30)}
     * @param companycd The value of companycd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompanycd_GreaterEqual(String companycd) {
        regCompanycd(CK_GE, fRES(companycd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMPANYCD: {varchar(30)}
     * @param companycd The value of companycd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompanycd_LessEqual(String companycd) {
        regCompanycd(CK_LE, fRES(companycd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * COMPANYCD: {varchar(30)}
     * @param companycdList The collection of companycd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompanycd_InScope(Collection<String> companycdList) {
        doSetCompanycd_InScope(companycdList);
    }

    protected void doSetCompanycd_InScope(Collection<String> companycdList) {
        regINS(CK_INS, cTL(companycdList), xgetCValueCompanycd(), "COMPANYCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * COMPANYCD: {varchar(30)}
     * @param companycdList The collection of companycd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompanycd_NotInScope(Collection<String> companycdList) {
        doSetCompanycd_NotInScope(companycdList);
    }

    protected void doSetCompanycd_NotInScope(Collection<String> companycdList) {
        regINS(CK_NINS, cTL(companycdList), xgetCValueCompanycd(), "COMPANYCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COMPANYCD: {varchar(30)} <br>
     * <pre>e.g. setCompanycd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param companycd The value of companycd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCompanycd_LikeSearch(String companycd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(companycd), xgetCValueCompanycd(), "COMPANYCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COMPANYCD: {varchar(30)}
     * @param companycd The value of companycd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCompanycd_NotLikeSearch(String companycd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(companycd), xgetCValueCompanycd(), "COMPANYCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COMPANYCD: {varchar(30)}
     * @param companycd The value of companycd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompanycd_PrefixSearch(String companycd) {
        setCompanycd_LikeSearch(companycd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * COMPANYCD: {varchar(30)}
     */
    public void setCompanycd_IsNull() { regCompanycd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * COMPANYCD: {varchar(30)}
     */
    public void setCompanycd_IsNullOrEmpty() { regCompanycd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * COMPANYCD: {varchar(30)}
     */
    public void setCompanycd_IsNotNull() { regCompanycd(CK_ISNN, DOBJ); }

    protected void regCompanycd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCompanycd(), "COMPANYCD"); }
    protected abstract ConditionValue xgetCValueCompanycd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMCD_FROM: {varchar(30)}
     * @param itemcdFrom The value of itemcdFrom as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcdFrom_Equal(String itemcdFrom) {
        doSetItemcdFrom_Equal(fRES(itemcdFrom));
    }

    protected void doSetItemcdFrom_Equal(String itemcdFrom) {
        regItemcdFrom(CK_EQ, itemcdFrom);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMCD_FROM: {varchar(30)}
     * @param itemcdFrom The value of itemcdFrom as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcdFrom_NotEqual(String itemcdFrom) {
        doSetItemcdFrom_NotEqual(fRES(itemcdFrom));
    }

    protected void doSetItemcdFrom_NotEqual(String itemcdFrom) {
        regItemcdFrom(CK_NES, itemcdFrom);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMCD_FROM: {varchar(30)}
     * @param itemcdFrom The value of itemcdFrom as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcdFrom_GreaterThan(String itemcdFrom) {
        regItemcdFrom(CK_GT, fRES(itemcdFrom));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMCD_FROM: {varchar(30)}
     * @param itemcdFrom The value of itemcdFrom as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcdFrom_LessThan(String itemcdFrom) {
        regItemcdFrom(CK_LT, fRES(itemcdFrom));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMCD_FROM: {varchar(30)}
     * @param itemcdFrom The value of itemcdFrom as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcdFrom_GreaterEqual(String itemcdFrom) {
        regItemcdFrom(CK_GE, fRES(itemcdFrom));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMCD_FROM: {varchar(30)}
     * @param itemcdFrom The value of itemcdFrom as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcdFrom_LessEqual(String itemcdFrom) {
        regItemcdFrom(CK_LE, fRES(itemcdFrom));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ITEMCD_FROM: {varchar(30)}
     * @param itemcdFromList The collection of itemcdFrom as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcdFrom_InScope(Collection<String> itemcdFromList) {
        doSetItemcdFrom_InScope(itemcdFromList);
    }

    protected void doSetItemcdFrom_InScope(Collection<String> itemcdFromList) {
        regINS(CK_INS, cTL(itemcdFromList), xgetCValueItemcdFrom(), "ITEMCD_FROM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ITEMCD_FROM: {varchar(30)}
     * @param itemcdFromList The collection of itemcdFrom as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcdFrom_NotInScope(Collection<String> itemcdFromList) {
        doSetItemcdFrom_NotInScope(itemcdFromList);
    }

    protected void doSetItemcdFrom_NotInScope(Collection<String> itemcdFromList) {
        regINS(CK_NINS, cTL(itemcdFromList), xgetCValueItemcdFrom(), "ITEMCD_FROM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEMCD_FROM: {varchar(30)} <br>
     * <pre>e.g. setItemcdFrom_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param itemcdFrom The value of itemcdFrom as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setItemcdFrom_LikeSearch(String itemcdFrom, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(itemcdFrom), xgetCValueItemcdFrom(), "ITEMCD_FROM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEMCD_FROM: {varchar(30)}
     * @param itemcdFrom The value of itemcdFrom as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setItemcdFrom_NotLikeSearch(String itemcdFrom, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(itemcdFrom), xgetCValueItemcdFrom(), "ITEMCD_FROM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEMCD_FROM: {varchar(30)}
     * @param itemcdFrom The value of itemcdFrom as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcdFrom_PrefixSearch(String itemcdFrom) {
        setItemcdFrom_LikeSearch(itemcdFrom, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ITEMCD_FROM: {varchar(30)}
     */
    public void setItemcdFrom_IsNull() { regItemcdFrom(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ITEMCD_FROM: {varchar(30)}
     */
    public void setItemcdFrom_IsNullOrEmpty() { regItemcdFrom(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ITEMCD_FROM: {varchar(30)}
     */
    public void setItemcdFrom_IsNotNull() { regItemcdFrom(CK_ISNN, DOBJ); }

    protected void regItemcdFrom(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueItemcdFrom(), "ITEMCD_FROM"); }
    protected abstract ConditionValue xgetCValueItemcdFrom();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMCD_TO: {varchar(30)}
     * @param itemcdTo The value of itemcdTo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcdTo_Equal(String itemcdTo) {
        doSetItemcdTo_Equal(fRES(itemcdTo));
    }

    protected void doSetItemcdTo_Equal(String itemcdTo) {
        regItemcdTo(CK_EQ, itemcdTo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMCD_TO: {varchar(30)}
     * @param itemcdTo The value of itemcdTo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcdTo_NotEqual(String itemcdTo) {
        doSetItemcdTo_NotEqual(fRES(itemcdTo));
    }

    protected void doSetItemcdTo_NotEqual(String itemcdTo) {
        regItemcdTo(CK_NES, itemcdTo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMCD_TO: {varchar(30)}
     * @param itemcdTo The value of itemcdTo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcdTo_GreaterThan(String itemcdTo) {
        regItemcdTo(CK_GT, fRES(itemcdTo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMCD_TO: {varchar(30)}
     * @param itemcdTo The value of itemcdTo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcdTo_LessThan(String itemcdTo) {
        regItemcdTo(CK_LT, fRES(itemcdTo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMCD_TO: {varchar(30)}
     * @param itemcdTo The value of itemcdTo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcdTo_GreaterEqual(String itemcdTo) {
        regItemcdTo(CK_GE, fRES(itemcdTo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMCD_TO: {varchar(30)}
     * @param itemcdTo The value of itemcdTo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcdTo_LessEqual(String itemcdTo) {
        regItemcdTo(CK_LE, fRES(itemcdTo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ITEMCD_TO: {varchar(30)}
     * @param itemcdToList The collection of itemcdTo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcdTo_InScope(Collection<String> itemcdToList) {
        doSetItemcdTo_InScope(itemcdToList);
    }

    protected void doSetItemcdTo_InScope(Collection<String> itemcdToList) {
        regINS(CK_INS, cTL(itemcdToList), xgetCValueItemcdTo(), "ITEMCD_TO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ITEMCD_TO: {varchar(30)}
     * @param itemcdToList The collection of itemcdTo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcdTo_NotInScope(Collection<String> itemcdToList) {
        doSetItemcdTo_NotInScope(itemcdToList);
    }

    protected void doSetItemcdTo_NotInScope(Collection<String> itemcdToList) {
        regINS(CK_NINS, cTL(itemcdToList), xgetCValueItemcdTo(), "ITEMCD_TO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEMCD_TO: {varchar(30)} <br>
     * <pre>e.g. setItemcdTo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param itemcdTo The value of itemcdTo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setItemcdTo_LikeSearch(String itemcdTo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(itemcdTo), xgetCValueItemcdTo(), "ITEMCD_TO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEMCD_TO: {varchar(30)}
     * @param itemcdTo The value of itemcdTo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setItemcdTo_NotLikeSearch(String itemcdTo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(itemcdTo), xgetCValueItemcdTo(), "ITEMCD_TO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEMCD_TO: {varchar(30)}
     * @param itemcdTo The value of itemcdTo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcdTo_PrefixSearch(String itemcdTo) {
        setItemcdTo_LikeSearch(itemcdTo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ITEMCD_TO: {varchar(30)}
     */
    public void setItemcdTo_IsNull() { regItemcdTo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ITEMCD_TO: {varchar(30)}
     */
    public void setItemcdTo_IsNullOrEmpty() { regItemcdTo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ITEMCD_TO: {varchar(30)}
     */
    public void setItemcdTo_IsNotNull() { regItemcdTo(CK_ISNN, DOBJ); }

    protected void regItemcdTo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueItemcdTo(), "ITEMCD_TO"); }
    protected abstract ConditionValue xgetCValueItemcdTo();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * QTY: {bigint(19)}
     * @param qty The value of qty as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setQty_Equal(Long qty) {
        doSetQty_Equal(qty);
    }

    protected void doSetQty_Equal(Long qty) {
        regQty(CK_EQ, qty);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * QTY: {bigint(19)}
     * @param qty The value of qty as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setQty_NotEqual(Long qty) {
        doSetQty_NotEqual(qty);
    }

    protected void doSetQty_NotEqual(Long qty) {
        regQty(CK_NES, qty);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * QTY: {bigint(19)}
     * @param qty The value of qty as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setQty_GreaterThan(Long qty) {
        regQty(CK_GT, qty);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * QTY: {bigint(19)}
     * @param qty The value of qty as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setQty_LessThan(Long qty) {
        regQty(CK_LT, qty);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * QTY: {bigint(19)}
     * @param qty The value of qty as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setQty_GreaterEqual(Long qty) {
        regQty(CK_GE, qty);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * QTY: {bigint(19)}
     * @param qty The value of qty as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setQty_LessEqual(Long qty) {
        regQty(CK_LE, qty);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * QTY: {bigint(19)}
     * @param minNumber The min number of qty. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of qty. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setQty_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueQty(), "QTY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * QTY: {bigint(19)}
     * @param qtyList The collection of qty as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQty_InScope(Collection<Long> qtyList) {
        doSetQty_InScope(qtyList);
    }

    protected void doSetQty_InScope(Collection<Long> qtyList) {
        regINS(CK_INS, cTL(qtyList), xgetCValueQty(), "QTY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * QTY: {bigint(19)}
     * @param qtyList The collection of qty as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQty_NotInScope(Collection<Long> qtyList) {
        doSetQty_NotInScope(qtyList);
    }

    protected void doSetQty_NotInScope(Collection<Long> qtyList) {
        regINS(CK_NINS, cTL(qtyList), xgetCValueQty(), "QTY");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * QTY: {bigint(19)}
     */
    public void setQty_IsNull() { regQty(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * QTY: {bigint(19)}
     */
    public void setQty_IsNotNull() { regQty(CK_ISNN, DOBJ); }

    protected void regQty(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueQty(), "QTY"); }
    protected abstract ConditionValue xgetCValueQty();

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
     * WORK_FLG: {NotNull, char(1), default=[0]}
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
     * WORK_FLG: {NotNull, char(1), default=[0]}
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
     * WORK_FLG: {NotNull, char(1), default=[0]}
     * @param workFlg The value of workFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkFlg_GreaterThan(String workFlg) {
        regWorkFlg(CK_GT, fRES(workFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WORK_FLG: {NotNull, char(1), default=[0]}
     * @param workFlg The value of workFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkFlg_LessThan(String workFlg) {
        regWorkFlg(CK_LT, fRES(workFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WORK_FLG: {NotNull, char(1), default=[0]}
     * @param workFlg The value of workFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkFlg_GreaterEqual(String workFlg) {
        regWorkFlg(CK_GE, fRES(workFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WORK_FLG: {NotNull, char(1), default=[0]}
     * @param workFlg The value of workFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkFlg_LessEqual(String workFlg) {
        regWorkFlg(CK_LE, fRES(workFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WORK_FLG: {NotNull, char(1), default=[0]}
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
     * WORK_FLG: {NotNull, char(1), default=[0]}
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
     * WORK_FLG: {NotNull, char(1), default=[0]} <br>
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
     * WORK_FLG: {NotNull, char(1), default=[0]}
     * @param workFlg The value of workFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setWorkFlg_NotLikeSearch(String workFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(workFlg), xgetCValueWorkFlg(), "WORK_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WORK_FLG: {NotNull, char(1), default=[0]}
     * @param workFlg The value of workFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkFlg_PrefixSearch(String workFlg) {
        setWorkFlg_LikeSearch(workFlg, xcLSOPPre());
    }

    protected void regWorkFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWorkFlg(), "WORK_FLG"); }
    protected abstract ConditionValue xgetCValueWorkFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CENTER_CD: {NotNull, varchar(30)}
     * @param centerCd The value of centerCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterCd_Equal(String centerCd) {
        doSetCenterCd_Equal(fRES(centerCd));
    }

    protected void doSetCenterCd_Equal(String centerCd) {
        regCenterCd(CK_EQ, centerCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CENTER_CD: {NotNull, varchar(30)}
     * @param centerCd The value of centerCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterCd_NotEqual(String centerCd) {
        doSetCenterCd_NotEqual(fRES(centerCd));
    }

    protected void doSetCenterCd_NotEqual(String centerCd) {
        regCenterCd(CK_NES, centerCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CENTER_CD: {NotNull, varchar(30)}
     * @param centerCd The value of centerCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterCd_GreaterThan(String centerCd) {
        regCenterCd(CK_GT, fRES(centerCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CENTER_CD: {NotNull, varchar(30)}
     * @param centerCd The value of centerCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterCd_LessThan(String centerCd) {
        regCenterCd(CK_LT, fRES(centerCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CENTER_CD: {NotNull, varchar(30)}
     * @param centerCd The value of centerCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterCd_GreaterEqual(String centerCd) {
        regCenterCd(CK_GE, fRES(centerCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CENTER_CD: {NotNull, varchar(30)}
     * @param centerCd The value of centerCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterCd_LessEqual(String centerCd) {
        regCenterCd(CK_LE, fRES(centerCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CENTER_CD: {NotNull, varchar(30)}
     * @param centerCdList The collection of centerCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterCd_InScope(Collection<String> centerCdList) {
        doSetCenterCd_InScope(centerCdList);
    }

    protected void doSetCenterCd_InScope(Collection<String> centerCdList) {
        regINS(CK_INS, cTL(centerCdList), xgetCValueCenterCd(), "CENTER_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CENTER_CD: {NotNull, varchar(30)}
     * @param centerCdList The collection of centerCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterCd_NotInScope(Collection<String> centerCdList) {
        doSetCenterCd_NotInScope(centerCdList);
    }

    protected void doSetCenterCd_NotInScope(Collection<String> centerCdList) {
        regINS(CK_NINS, cTL(centerCdList), xgetCValueCenterCd(), "CENTER_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CENTER_CD: {NotNull, varchar(30)} <br>
     * <pre>e.g. setCenterCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param centerCd The value of centerCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCenterCd_LikeSearch(String centerCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(centerCd), xgetCValueCenterCd(), "CENTER_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CENTER_CD: {NotNull, varchar(30)}
     * @param centerCd The value of centerCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCenterCd_NotLikeSearch(String centerCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(centerCd), xgetCValueCenterCd(), "CENTER_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CENTER_CD: {NotNull, varchar(30)}
     * @param centerCd The value of centerCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterCd_PrefixSearch(String centerCd) {
        setCenterCd_LikeSearch(centerCd, xcLSOPPre());
    }

    protected void regCenterCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCenterCd(), "CENTER_CD"); }
    protected abstract ConditionValue xgetCValueCenterCd();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SEND_ROW_ID: {NotNull, bigint(19)}
     * @param sendRowId The value of sendRowId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSendRowId_Equal(Long sendRowId) {
        doSetSendRowId_Equal(sendRowId);
    }

    protected void doSetSendRowId_Equal(Long sendRowId) {
        regSendRowId(CK_EQ, sendRowId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SEND_ROW_ID: {NotNull, bigint(19)}
     * @param sendRowId The value of sendRowId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSendRowId_NotEqual(Long sendRowId) {
        doSetSendRowId_NotEqual(sendRowId);
    }

    protected void doSetSendRowId_NotEqual(Long sendRowId) {
        regSendRowId(CK_NES, sendRowId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SEND_ROW_ID: {NotNull, bigint(19)}
     * @param sendRowId The value of sendRowId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSendRowId_GreaterThan(Long sendRowId) {
        regSendRowId(CK_GT, sendRowId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SEND_ROW_ID: {NotNull, bigint(19)}
     * @param sendRowId The value of sendRowId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSendRowId_LessThan(Long sendRowId) {
        regSendRowId(CK_LT, sendRowId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SEND_ROW_ID: {NotNull, bigint(19)}
     * @param sendRowId The value of sendRowId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSendRowId_GreaterEqual(Long sendRowId) {
        regSendRowId(CK_GE, sendRowId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SEND_ROW_ID: {NotNull, bigint(19)}
     * @param sendRowId The value of sendRowId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSendRowId_LessEqual(Long sendRowId) {
        regSendRowId(CK_LE, sendRowId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SEND_ROW_ID: {NotNull, bigint(19)}
     * @param minNumber The min number of sendRowId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of sendRowId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSendRowId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSendRowId(), "SEND_ROW_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SEND_ROW_ID: {NotNull, bigint(19)}
     * @param sendRowIdList The collection of sendRowId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSendRowId_InScope(Collection<Long> sendRowIdList) {
        doSetSendRowId_InScope(sendRowIdList);
    }

    protected void doSetSendRowId_InScope(Collection<Long> sendRowIdList) {
        regINS(CK_INS, cTL(sendRowIdList), xgetCValueSendRowId(), "SEND_ROW_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SEND_ROW_ID: {NotNull, bigint(19)}
     * @param sendRowIdList The collection of sendRowId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSendRowId_NotInScope(Collection<Long> sendRowIdList) {
        doSetSendRowId_NotInScope(sendRowIdList);
    }

    protected void doSetSendRowId_NotInScope(Collection<Long> sendRowIdList) {
        regINS(CK_NINS, cTL(sendRowIdList), xgetCValueSendRowId(), "SEND_ROW_ID");
    }

    protected void regSendRowId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSendRowId(), "SEND_ROW_ID"); }
    protected abstract ConditionValue xgetCValueSendRowId();

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
    public HpSLCFunction<EProductCodeConversionCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, EProductCodeConversionCB.class);
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
    public HpSLCFunction<EProductCodeConversionCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, EProductCodeConversionCB.class);
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
    public HpSLCFunction<EProductCodeConversionCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, EProductCodeConversionCB.class);
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
    public HpSLCFunction<EProductCodeConversionCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, EProductCodeConversionCB.class);
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
    public HpSLCFunction<EProductCodeConversionCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, EProductCodeConversionCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;EProductCodeConversionCB&gt;() {
     *     public void query(EProductCodeConversionCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<EProductCodeConversionCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, EProductCodeConversionCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        EProductCodeConversionCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(EProductCodeConversionCQ sq);

    protected EProductCodeConversionCB xcreateScalarConditionCB() {
        EProductCodeConversionCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected EProductCodeConversionCB xcreateScalarConditionPartitionByCB() {
        EProductCodeConversionCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<EProductCodeConversionCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        EProductCodeConversionCB cb = new EProductCodeConversionCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "PRODUCT_CODE_CONVERSION_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(EProductCodeConversionCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<EProductCodeConversionCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(EProductCodeConversionCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        EProductCodeConversionCB cb = new EProductCodeConversionCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "PRODUCT_CODE_CONVERSION_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(EProductCodeConversionCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<EProductCodeConversionCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        EProductCodeConversionCB cb = new EProductCodeConversionCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(EProductCodeConversionCQ sq);

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
    protected EProductCodeConversionCB newMyCB() {
        return new EProductCodeConversionCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return EProductCodeConversionCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
