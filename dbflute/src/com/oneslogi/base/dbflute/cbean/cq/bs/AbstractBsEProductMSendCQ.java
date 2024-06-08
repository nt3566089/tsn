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
 * The abstract condition-query of E_PRODUCT_M_SEND.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsEProductMSendCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsEProductMSendCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "E_PRODUCT_M_SEND";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_M_SEND_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param productMSendId The value of productMSendId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductMSendId_Equal(Long productMSendId) {
        doSetProductMSendId_Equal(productMSendId);
    }

    protected void doSetProductMSendId_Equal(Long productMSendId) {
        regProductMSendId(CK_EQ, productMSendId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_M_SEND_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param productMSendId The value of productMSendId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductMSendId_NotEqual(Long productMSendId) {
        doSetProductMSendId_NotEqual(productMSendId);
    }

    protected void doSetProductMSendId_NotEqual(Long productMSendId) {
        regProductMSendId(CK_NES, productMSendId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_M_SEND_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param productMSendId The value of productMSendId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductMSendId_GreaterThan(Long productMSendId) {
        regProductMSendId(CK_GT, productMSendId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_M_SEND_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param productMSendId The value of productMSendId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductMSendId_LessThan(Long productMSendId) {
        regProductMSendId(CK_LT, productMSendId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_M_SEND_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param productMSendId The value of productMSendId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductMSendId_GreaterEqual(Long productMSendId) {
        regProductMSendId(CK_GE, productMSendId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_M_SEND_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param productMSendId The value of productMSendId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductMSendId_LessEqual(Long productMSendId) {
        regProductMSendId(CK_LE, productMSendId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_M_SEND_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of productMSendId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of productMSendId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setProductMSendId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueProductMSendId(), "PRODUCT_M_SEND_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRODUCT_M_SEND_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param productMSendIdList The collection of productMSendId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductMSendId_InScope(Collection<Long> productMSendIdList) {
        doSetProductMSendId_InScope(productMSendIdList);
    }

    protected void doSetProductMSendId_InScope(Collection<Long> productMSendIdList) {
        regINS(CK_INS, cTL(productMSendIdList), xgetCValueProductMSendId(), "PRODUCT_M_SEND_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRODUCT_M_SEND_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param productMSendIdList The collection of productMSendId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductMSendId_NotInScope(Collection<Long> productMSendIdList) {
        doSetProductMSendId_NotInScope(productMSendIdList);
    }

    protected void doSetProductMSendId_NotInScope(Collection<Long> productMSendIdList) {
        regINS(CK_NINS, cTL(productMSendIdList), xgetCValueProductMSendId(), "PRODUCT_M_SEND_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PRODUCT_M_SEND_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setProductMSendId_IsNull() { regProductMSendId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PRODUCT_M_SEND_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setProductMSendId_IsNotNull() { regProductMSendId(CK_ISNN, DOBJ); }

    protected void regProductMSendId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProductMSendId(), "PRODUCT_M_SEND_ID"); }
    protected abstract ConditionValue xgetCValueProductMSendId();

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
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BRFNFL: {varchar(255)}
     * @param brfnfl The value of brfnfl as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBrfnfl_Equal(String brfnfl) {
        doSetBrfnfl_Equal(fRES(brfnfl));
    }

    protected void doSetBrfnfl_Equal(String brfnfl) {
        regBrfnfl(CK_EQ, brfnfl);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BRFNFL: {varchar(255)}
     * @param brfnfl The value of brfnfl as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBrfnfl_NotEqual(String brfnfl) {
        doSetBrfnfl_NotEqual(fRES(brfnfl));
    }

    protected void doSetBrfnfl_NotEqual(String brfnfl) {
        regBrfnfl(CK_NES, brfnfl);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BRFNFL: {varchar(255)}
     * @param brfnfl The value of brfnfl as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBrfnfl_GreaterThan(String brfnfl) {
        regBrfnfl(CK_GT, fRES(brfnfl));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BRFNFL: {varchar(255)}
     * @param brfnfl The value of brfnfl as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBrfnfl_LessThan(String brfnfl) {
        regBrfnfl(CK_LT, fRES(brfnfl));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BRFNFL: {varchar(255)}
     * @param brfnfl The value of brfnfl as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBrfnfl_GreaterEqual(String brfnfl) {
        regBrfnfl(CK_GE, fRES(brfnfl));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BRFNFL: {varchar(255)}
     * @param brfnfl The value of brfnfl as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBrfnfl_LessEqual(String brfnfl) {
        regBrfnfl(CK_LE, fRES(brfnfl));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BRFNFL: {varchar(255)}
     * @param brfnflList The collection of brfnfl as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBrfnfl_InScope(Collection<String> brfnflList) {
        doSetBrfnfl_InScope(brfnflList);
    }

    protected void doSetBrfnfl_InScope(Collection<String> brfnflList) {
        regINS(CK_INS, cTL(brfnflList), xgetCValueBrfnfl(), "BRFNFL");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BRFNFL: {varchar(255)}
     * @param brfnflList The collection of brfnfl as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBrfnfl_NotInScope(Collection<String> brfnflList) {
        doSetBrfnfl_NotInScope(brfnflList);
    }

    protected void doSetBrfnfl_NotInScope(Collection<String> brfnflList) {
        regINS(CK_NINS, cTL(brfnflList), xgetCValueBrfnfl(), "BRFNFL");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BRFNFL: {varchar(255)} <br>
     * <pre>e.g. setBrfnfl_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param brfnfl The value of brfnfl as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBrfnfl_LikeSearch(String brfnfl, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(brfnfl), xgetCValueBrfnfl(), "BRFNFL", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BRFNFL: {varchar(255)}
     * @param brfnfl The value of brfnfl as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBrfnfl_NotLikeSearch(String brfnfl, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(brfnfl), xgetCValueBrfnfl(), "BRFNFL", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BRFNFL: {varchar(255)}
     * @param brfnfl The value of brfnfl as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBrfnfl_PrefixSearch(String brfnfl) {
        setBrfnfl_LikeSearch(brfnfl, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BRFNFL: {varchar(255)}
     */
    public void setBrfnfl_IsNull() { regBrfnfl(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * BRFNFL: {varchar(255)}
     */
    public void setBrfnfl_IsNullOrEmpty() { regBrfnfl(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BRFNFL: {varchar(255)}
     */
    public void setBrfnfl_IsNotNull() { regBrfnfl(CK_ISNN, DOBJ); }

    protected void regBrfnfl(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBrfnfl(), "BRFNFL"); }
    protected abstract ConditionValue xgetCValueBrfnfl();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BRFNHF: {varchar(255)}
     * @param brfnhf The value of brfnhf as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBrfnhf_Equal(String brfnhf) {
        doSetBrfnhf_Equal(fRES(brfnhf));
    }

    protected void doSetBrfnhf_Equal(String brfnhf) {
        regBrfnhf(CK_EQ, brfnhf);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BRFNHF: {varchar(255)}
     * @param brfnhf The value of brfnhf as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBrfnhf_NotEqual(String brfnhf) {
        doSetBrfnhf_NotEqual(fRES(brfnhf));
    }

    protected void doSetBrfnhf_NotEqual(String brfnhf) {
        regBrfnhf(CK_NES, brfnhf);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BRFNHF: {varchar(255)}
     * @param brfnhf The value of brfnhf as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBrfnhf_GreaterThan(String brfnhf) {
        regBrfnhf(CK_GT, fRES(brfnhf));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BRFNHF: {varchar(255)}
     * @param brfnhf The value of brfnhf as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBrfnhf_LessThan(String brfnhf) {
        regBrfnhf(CK_LT, fRES(brfnhf));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BRFNHF: {varchar(255)}
     * @param brfnhf The value of brfnhf as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBrfnhf_GreaterEqual(String brfnhf) {
        regBrfnhf(CK_GE, fRES(brfnhf));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BRFNHF: {varchar(255)}
     * @param brfnhf The value of brfnhf as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBrfnhf_LessEqual(String brfnhf) {
        regBrfnhf(CK_LE, fRES(brfnhf));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BRFNHF: {varchar(255)}
     * @param brfnhfList The collection of brfnhf as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBrfnhf_InScope(Collection<String> brfnhfList) {
        doSetBrfnhf_InScope(brfnhfList);
    }

    protected void doSetBrfnhf_InScope(Collection<String> brfnhfList) {
        regINS(CK_INS, cTL(brfnhfList), xgetCValueBrfnhf(), "BRFNHF");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BRFNHF: {varchar(255)}
     * @param brfnhfList The collection of brfnhf as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBrfnhf_NotInScope(Collection<String> brfnhfList) {
        doSetBrfnhf_NotInScope(brfnhfList);
    }

    protected void doSetBrfnhf_NotInScope(Collection<String> brfnhfList) {
        regINS(CK_NINS, cTL(brfnhfList), xgetCValueBrfnhf(), "BRFNHF");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BRFNHF: {varchar(255)} <br>
     * <pre>e.g. setBrfnhf_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param brfnhf The value of brfnhf as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBrfnhf_LikeSearch(String brfnhf, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(brfnhf), xgetCValueBrfnhf(), "BRFNHF", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BRFNHF: {varchar(255)}
     * @param brfnhf The value of brfnhf as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBrfnhf_NotLikeSearch(String brfnhf, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(brfnhf), xgetCValueBrfnhf(), "BRFNHF", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BRFNHF: {varchar(255)}
     * @param brfnhf The value of brfnhf as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBrfnhf_PrefixSearch(String brfnhf) {
        setBrfnhf_LikeSearch(brfnhf, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BRFNHF: {varchar(255)}
     */
    public void setBrfnhf_IsNull() { regBrfnhf(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * BRFNHF: {varchar(255)}
     */
    public void setBrfnhf_IsNullOrEmpty() { regBrfnhf(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BRFNHF: {varchar(255)}
     */
    public void setBrfnhf_IsNotNull() { regBrfnhf(CK_ISNN, DOBJ); }

    protected void regBrfnhf(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBrfnhf(), "BRFNHF"); }
    protected abstract ConditionValue xgetCValueBrfnhf();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BRANFL: {varchar(255)}
     * @param branfl The value of branfl as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBranfl_Equal(String branfl) {
        doSetBranfl_Equal(fRES(branfl));
    }

    protected void doSetBranfl_Equal(String branfl) {
        regBranfl(CK_EQ, branfl);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BRANFL: {varchar(255)}
     * @param branfl The value of branfl as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBranfl_NotEqual(String branfl) {
        doSetBranfl_NotEqual(fRES(branfl));
    }

    protected void doSetBranfl_NotEqual(String branfl) {
        regBranfl(CK_NES, branfl);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BRANFL: {varchar(255)}
     * @param branfl The value of branfl as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBranfl_GreaterThan(String branfl) {
        regBranfl(CK_GT, fRES(branfl));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BRANFL: {varchar(255)}
     * @param branfl The value of branfl as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBranfl_LessThan(String branfl) {
        regBranfl(CK_LT, fRES(branfl));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BRANFL: {varchar(255)}
     * @param branfl The value of branfl as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBranfl_GreaterEqual(String branfl) {
        regBranfl(CK_GE, fRES(branfl));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BRANFL: {varchar(255)}
     * @param branfl The value of branfl as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBranfl_LessEqual(String branfl) {
        regBranfl(CK_LE, fRES(branfl));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BRANFL: {varchar(255)}
     * @param branflList The collection of branfl as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBranfl_InScope(Collection<String> branflList) {
        doSetBranfl_InScope(branflList);
    }

    protected void doSetBranfl_InScope(Collection<String> branflList) {
        regINS(CK_INS, cTL(branflList), xgetCValueBranfl(), "BRANFL");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BRANFL: {varchar(255)}
     * @param branflList The collection of branfl as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBranfl_NotInScope(Collection<String> branflList) {
        doSetBranfl_NotInScope(branflList);
    }

    protected void doSetBranfl_NotInScope(Collection<String> branflList) {
        regINS(CK_NINS, cTL(branflList), xgetCValueBranfl(), "BRANFL");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BRANFL: {varchar(255)} <br>
     * <pre>e.g. setBranfl_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param branfl The value of branfl as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBranfl_LikeSearch(String branfl, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(branfl), xgetCValueBranfl(), "BRANFL", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BRANFL: {varchar(255)}
     * @param branfl The value of branfl as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBranfl_NotLikeSearch(String branfl, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(branfl), xgetCValueBranfl(), "BRANFL", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BRANFL: {varchar(255)}
     * @param branfl The value of branfl as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBranfl_PrefixSearch(String branfl) {
        setBranfl_LikeSearch(branfl, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BRANFL: {varchar(255)}
     */
    public void setBranfl_IsNull() { regBranfl(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * BRANFL: {varchar(255)}
     */
    public void setBranfl_IsNullOrEmpty() { regBranfl(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BRANFL: {varchar(255)}
     */
    public void setBranfl_IsNotNull() { regBranfl(CK_ISNN, DOBJ); }

    protected void regBranfl(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBranfl(), "BRANFL"); }
    protected abstract ConditionValue xgetCValueBranfl();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BRANHF: {varchar(255)}
     * @param branhf The value of branhf as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBranhf_Equal(String branhf) {
        doSetBranhf_Equal(fRES(branhf));
    }

    protected void doSetBranhf_Equal(String branhf) {
        regBranhf(CK_EQ, branhf);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BRANHF: {varchar(255)}
     * @param branhf The value of branhf as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBranhf_NotEqual(String branhf) {
        doSetBranhf_NotEqual(fRES(branhf));
    }

    protected void doSetBranhf_NotEqual(String branhf) {
        regBranhf(CK_NES, branhf);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BRANHF: {varchar(255)}
     * @param branhf The value of branhf as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBranhf_GreaterThan(String branhf) {
        regBranhf(CK_GT, fRES(branhf));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BRANHF: {varchar(255)}
     * @param branhf The value of branhf as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBranhf_LessThan(String branhf) {
        regBranhf(CK_LT, fRES(branhf));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BRANHF: {varchar(255)}
     * @param branhf The value of branhf as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBranhf_GreaterEqual(String branhf) {
        regBranhf(CK_GE, fRES(branhf));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BRANHF: {varchar(255)}
     * @param branhf The value of branhf as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBranhf_LessEqual(String branhf) {
        regBranhf(CK_LE, fRES(branhf));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BRANHF: {varchar(255)}
     * @param branhfList The collection of branhf as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBranhf_InScope(Collection<String> branhfList) {
        doSetBranhf_InScope(branhfList);
    }

    protected void doSetBranhf_InScope(Collection<String> branhfList) {
        regINS(CK_INS, cTL(branhfList), xgetCValueBranhf(), "BRANHF");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BRANHF: {varchar(255)}
     * @param branhfList The collection of branhf as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBranhf_NotInScope(Collection<String> branhfList) {
        doSetBranhf_NotInScope(branhfList);
    }

    protected void doSetBranhf_NotInScope(Collection<String> branhfList) {
        regINS(CK_NINS, cTL(branhfList), xgetCValueBranhf(), "BRANHF");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BRANHF: {varchar(255)} <br>
     * <pre>e.g. setBranhf_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param branhf The value of branhf as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBranhf_LikeSearch(String branhf, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(branhf), xgetCValueBranhf(), "BRANHF", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BRANHF: {varchar(255)}
     * @param branhf The value of branhf as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBranhf_NotLikeSearch(String branhf, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(branhf), xgetCValueBranhf(), "BRANHF", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BRANHF: {varchar(255)}
     * @param branhf The value of branhf as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBranhf_PrefixSearch(String branhf) {
        setBranhf_LikeSearch(branhf, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BRANHF: {varchar(255)}
     */
    public void setBranhf_IsNull() { regBranhf(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * BRANHF: {varchar(255)}
     */
    public void setBranhf_IsNullOrEmpty() { regBranhf(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BRANHF: {varchar(255)}
     */
    public void setBranhf_IsNotNull() { regBranhf(CK_ISNN, DOBJ); }

    protected void regBranhf(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBranhf(), "BRANHF"); }
    protected abstract ConditionValue xgetCValueBranhf();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IOID_CLS: {varchar(30)}
     * @param ioidCls The value of ioidCls as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIoidCls_Equal(String ioidCls) {
        doSetIoidCls_Equal(fRES(ioidCls));
    }

    protected void doSetIoidCls_Equal(String ioidCls) {
        regIoidCls(CK_EQ, ioidCls);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IOID_CLS: {varchar(30)}
     * @param ioidCls The value of ioidCls as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIoidCls_NotEqual(String ioidCls) {
        doSetIoidCls_NotEqual(fRES(ioidCls));
    }

    protected void doSetIoidCls_NotEqual(String ioidCls) {
        regIoidCls(CK_NES, ioidCls);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IOID_CLS: {varchar(30)}
     * @param ioidCls The value of ioidCls as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIoidCls_GreaterThan(String ioidCls) {
        regIoidCls(CK_GT, fRES(ioidCls));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IOID_CLS: {varchar(30)}
     * @param ioidCls The value of ioidCls as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIoidCls_LessThan(String ioidCls) {
        regIoidCls(CK_LT, fRES(ioidCls));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IOID_CLS: {varchar(30)}
     * @param ioidCls The value of ioidCls as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIoidCls_GreaterEqual(String ioidCls) {
        regIoidCls(CK_GE, fRES(ioidCls));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IOID_CLS: {varchar(30)}
     * @param ioidCls The value of ioidCls as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIoidCls_LessEqual(String ioidCls) {
        regIoidCls(CK_LE, fRES(ioidCls));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * IOID_CLS: {varchar(30)}
     * @param ioidClsList The collection of ioidCls as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIoidCls_InScope(Collection<String> ioidClsList) {
        doSetIoidCls_InScope(ioidClsList);
    }

    protected void doSetIoidCls_InScope(Collection<String> ioidClsList) {
        regINS(CK_INS, cTL(ioidClsList), xgetCValueIoidCls(), "IOID_CLS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * IOID_CLS: {varchar(30)}
     * @param ioidClsList The collection of ioidCls as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIoidCls_NotInScope(Collection<String> ioidClsList) {
        doSetIoidCls_NotInScope(ioidClsList);
    }

    protected void doSetIoidCls_NotInScope(Collection<String> ioidClsList) {
        regINS(CK_NINS, cTL(ioidClsList), xgetCValueIoidCls(), "IOID_CLS");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * IOID_CLS: {varchar(30)} <br>
     * <pre>e.g. setIoidCls_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param ioidCls The value of ioidCls as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setIoidCls_LikeSearch(String ioidCls, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(ioidCls), xgetCValueIoidCls(), "IOID_CLS", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * IOID_CLS: {varchar(30)}
     * @param ioidCls The value of ioidCls as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setIoidCls_NotLikeSearch(String ioidCls, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(ioidCls), xgetCValueIoidCls(), "IOID_CLS", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * IOID_CLS: {varchar(30)}
     * @param ioidCls The value of ioidCls as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIoidCls_PrefixSearch(String ioidCls) {
        setIoidCls_LikeSearch(ioidCls, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * IOID_CLS: {varchar(30)}
     */
    public void setIoidCls_IsNull() { regIoidCls(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * IOID_CLS: {varchar(30)}
     */
    public void setIoidCls_IsNullOrEmpty() { regIoidCls(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * IOID_CLS: {varchar(30)}
     */
    public void setIoidCls_IsNotNull() { regIoidCls(CK_ISNN, DOBJ); }

    protected void regIoidCls(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueIoidCls(), "IOID_CLS"); }
    protected abstract ConditionValue xgetCValueIoidCls();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * OTRNK: {bigint(19)}
     * @param otrnk The value of otrnk as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setOtrnk_Equal(Long otrnk) {
        doSetOtrnk_Equal(otrnk);
    }

    protected void doSetOtrnk_Equal(Long otrnk) {
        regOtrnk(CK_EQ, otrnk);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * OTRNK: {bigint(19)}
     * @param otrnk The value of otrnk as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOtrnk_NotEqual(Long otrnk) {
        doSetOtrnk_NotEqual(otrnk);
    }

    protected void doSetOtrnk_NotEqual(Long otrnk) {
        regOtrnk(CK_NES, otrnk);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * OTRNK: {bigint(19)}
     * @param otrnk The value of otrnk as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setOtrnk_GreaterThan(Long otrnk) {
        regOtrnk(CK_GT, otrnk);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * OTRNK: {bigint(19)}
     * @param otrnk The value of otrnk as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setOtrnk_LessThan(Long otrnk) {
        regOtrnk(CK_LT, otrnk);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * OTRNK: {bigint(19)}
     * @param otrnk The value of otrnk as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOtrnk_GreaterEqual(Long otrnk) {
        regOtrnk(CK_GE, otrnk);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * OTRNK: {bigint(19)}
     * @param otrnk The value of otrnk as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOtrnk_LessEqual(Long otrnk) {
        regOtrnk(CK_LE, otrnk);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * OTRNK: {bigint(19)}
     * @param minNumber The min number of otrnk. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of otrnk. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setOtrnk_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueOtrnk(), "OTRNK", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * OTRNK: {bigint(19)}
     * @param otrnkList The collection of otrnk as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtrnk_InScope(Collection<Long> otrnkList) {
        doSetOtrnk_InScope(otrnkList);
    }

    protected void doSetOtrnk_InScope(Collection<Long> otrnkList) {
        regINS(CK_INS, cTL(otrnkList), xgetCValueOtrnk(), "OTRNK");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * OTRNK: {bigint(19)}
     * @param otrnkList The collection of otrnk as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtrnk_NotInScope(Collection<Long> otrnkList) {
        doSetOtrnk_NotInScope(otrnkList);
    }

    protected void doSetOtrnk_NotInScope(Collection<Long> otrnkList) {
        regINS(CK_NINS, cTL(otrnkList), xgetCValueOtrnk(), "OTRNK");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * OTRNK: {bigint(19)}
     */
    public void setOtrnk_IsNull() { regOtrnk(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * OTRNK: {bigint(19)}
     */
    public void setOtrnk_IsNotNull() { regOtrnk(CK_ISNN, DOBJ); }

    protected void regOtrnk(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOtrnk(), "OTRNK"); }
    protected abstract ConditionValue xgetCValueOtrnk();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * BRCTG: {bigint(19)}
     * @param brctg The value of brctg as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setBrctg_Equal(Long brctg) {
        doSetBrctg_Equal(brctg);
    }

    protected void doSetBrctg_Equal(Long brctg) {
        regBrctg(CK_EQ, brctg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BRCTG: {bigint(19)}
     * @param brctg The value of brctg as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBrctg_NotEqual(Long brctg) {
        doSetBrctg_NotEqual(brctg);
    }

    protected void doSetBrctg_NotEqual(Long brctg) {
        regBrctg(CK_NES, brctg);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BRCTG: {bigint(19)}
     * @param brctg The value of brctg as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBrctg_GreaterThan(Long brctg) {
        regBrctg(CK_GT, brctg);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BRCTG: {bigint(19)}
     * @param brctg The value of brctg as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBrctg_LessThan(Long brctg) {
        regBrctg(CK_LT, brctg);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BRCTG: {bigint(19)}
     * @param brctg The value of brctg as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBrctg_GreaterEqual(Long brctg) {
        regBrctg(CK_GE, brctg);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BRCTG: {bigint(19)}
     * @param brctg The value of brctg as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBrctg_LessEqual(Long brctg) {
        regBrctg(CK_LE, brctg);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * BRCTG: {bigint(19)}
     * @param minNumber The min number of brctg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of brctg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setBrctg_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueBrctg(), "BRCTG", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BRCTG: {bigint(19)}
     * @param brctgList The collection of brctg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBrctg_InScope(Collection<Long> brctgList) {
        doSetBrctg_InScope(brctgList);
    }

    protected void doSetBrctg_InScope(Collection<Long> brctgList) {
        regINS(CK_INS, cTL(brctgList), xgetCValueBrctg(), "BRCTG");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BRCTG: {bigint(19)}
     * @param brctgList The collection of brctg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBrctg_NotInScope(Collection<Long> brctgList) {
        doSetBrctg_NotInScope(brctgList);
    }

    protected void doSetBrctg_NotInScope(Collection<Long> brctgList) {
        regINS(CK_NINS, cTL(brctgList), xgetCValueBrctg(), "BRCTG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BRCTG: {bigint(19)}
     */
    public void setBrctg_IsNull() { regBrctg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BRCTG: {bigint(19)}
     */
    public void setBrctg_IsNotNull() { regBrctg(CK_ISNN, DOBJ); }

    protected void regBrctg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBrctg(), "BRCTG"); }
    protected abstract ConditionValue xgetCValueBrctg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * NUMCT: {bigint(19)}
     * @param numct The value of numct as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setNumct_Equal(Long numct) {
        doSetNumct_Equal(numct);
    }

    protected void doSetNumct_Equal(Long numct) {
        regNumct(CK_EQ, numct);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NUMCT: {bigint(19)}
     * @param numct The value of numct as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNumct_NotEqual(Long numct) {
        doSetNumct_NotEqual(numct);
    }

    protected void doSetNumct_NotEqual(Long numct) {
        regNumct(CK_NES, numct);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NUMCT: {bigint(19)}
     * @param numct The value of numct as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNumct_GreaterThan(Long numct) {
        regNumct(CK_GT, numct);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NUMCT: {bigint(19)}
     * @param numct The value of numct as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNumct_LessThan(Long numct) {
        regNumct(CK_LT, numct);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * NUMCT: {bigint(19)}
     * @param numct The value of numct as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNumct_GreaterEqual(Long numct) {
        regNumct(CK_GE, numct);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * NUMCT: {bigint(19)}
     * @param numct The value of numct as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNumct_LessEqual(Long numct) {
        regNumct(CK_LE, numct);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * NUMCT: {bigint(19)}
     * @param minNumber The min number of numct. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of numct. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setNumct_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueNumct(), "NUMCT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * NUMCT: {bigint(19)}
     * @param numctList The collection of numct as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNumct_InScope(Collection<Long> numctList) {
        doSetNumct_InScope(numctList);
    }

    protected void doSetNumct_InScope(Collection<Long> numctList) {
        regINS(CK_INS, cTL(numctList), xgetCValueNumct(), "NUMCT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * NUMCT: {bigint(19)}
     * @param numctList The collection of numct as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNumct_NotInScope(Collection<Long> numctList) {
        doSetNumct_NotInScope(numctList);
    }

    protected void doSetNumct_NotInScope(Collection<Long> numctList) {
        regINS(CK_NINS, cTL(numctList), xgetCValueNumct(), "NUMCT");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * NUMCT: {bigint(19)}
     */
    public void setNumct_IsNull() { regNumct(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * NUMCT: {bigint(19)}
     */
    public void setNumct_IsNotNull() { regNumct(CK_ISNN, DOBJ); }

    protected void regNumct(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNumct(), "NUMCT"); }
    protected abstract ConditionValue xgetCValueNumct();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CTNUM: {bigint(19)}
     * @param ctnum The value of ctnum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCtnum_Equal(Long ctnum) {
        doSetCtnum_Equal(ctnum);
    }

    protected void doSetCtnum_Equal(Long ctnum) {
        regCtnum(CK_EQ, ctnum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CTNUM: {bigint(19)}
     * @param ctnum The value of ctnum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCtnum_NotEqual(Long ctnum) {
        doSetCtnum_NotEqual(ctnum);
    }

    protected void doSetCtnum_NotEqual(Long ctnum) {
        regCtnum(CK_NES, ctnum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CTNUM: {bigint(19)}
     * @param ctnum The value of ctnum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCtnum_GreaterThan(Long ctnum) {
        regCtnum(CK_GT, ctnum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CTNUM: {bigint(19)}
     * @param ctnum The value of ctnum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCtnum_LessThan(Long ctnum) {
        regCtnum(CK_LT, ctnum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CTNUM: {bigint(19)}
     * @param ctnum The value of ctnum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCtnum_GreaterEqual(Long ctnum) {
        regCtnum(CK_GE, ctnum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CTNUM: {bigint(19)}
     * @param ctnum The value of ctnum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCtnum_LessEqual(Long ctnum) {
        regCtnum(CK_LE, ctnum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CTNUM: {bigint(19)}
     * @param minNumber The min number of ctnum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of ctnum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCtnum_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCtnum(), "CTNUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CTNUM: {bigint(19)}
     * @param ctnumList The collection of ctnum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCtnum_InScope(Collection<Long> ctnumList) {
        doSetCtnum_InScope(ctnumList);
    }

    protected void doSetCtnum_InScope(Collection<Long> ctnumList) {
        regINS(CK_INS, cTL(ctnumList), xgetCValueCtnum(), "CTNUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CTNUM: {bigint(19)}
     * @param ctnumList The collection of ctnum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCtnum_NotInScope(Collection<Long> ctnumList) {
        doSetCtnum_NotInScope(ctnumList);
    }

    protected void doSetCtnum_NotInScope(Collection<Long> ctnumList) {
        regINS(CK_NINS, cTL(ctnumList), xgetCValueCtnum(), "CTNUM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CTNUM: {bigint(19)}
     */
    public void setCtnum_IsNull() { regCtnum(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CTNUM: {bigint(19)}
     */
    public void setCtnum_IsNotNull() { regCtnum(CK_ISNN, DOBJ); }

    protected void regCtnum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCtnum(), "CTNUM"); }
    protected abstract ConditionValue xgetCValueCtnum();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CBCT: {bigint(19)}
     * @param cbct The value of cbct as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCbct_Equal(Long cbct) {
        doSetCbct_Equal(cbct);
    }

    protected void doSetCbct_Equal(Long cbct) {
        regCbct(CK_EQ, cbct);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CBCT: {bigint(19)}
     * @param cbct The value of cbct as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCbct_NotEqual(Long cbct) {
        doSetCbct_NotEqual(cbct);
    }

    protected void doSetCbct_NotEqual(Long cbct) {
        regCbct(CK_NES, cbct);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CBCT: {bigint(19)}
     * @param cbct The value of cbct as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCbct_GreaterThan(Long cbct) {
        regCbct(CK_GT, cbct);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CBCT: {bigint(19)}
     * @param cbct The value of cbct as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCbct_LessThan(Long cbct) {
        regCbct(CK_LT, cbct);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CBCT: {bigint(19)}
     * @param cbct The value of cbct as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCbct_GreaterEqual(Long cbct) {
        regCbct(CK_GE, cbct);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CBCT: {bigint(19)}
     * @param cbct The value of cbct as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCbct_LessEqual(Long cbct) {
        regCbct(CK_LE, cbct);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CBCT: {bigint(19)}
     * @param minNumber The min number of cbct. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of cbct. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCbct_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCbct(), "CBCT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CBCT: {bigint(19)}
     * @param cbctList The collection of cbct as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCbct_InScope(Collection<Long> cbctList) {
        doSetCbct_InScope(cbctList);
    }

    protected void doSetCbct_InScope(Collection<Long> cbctList) {
        regINS(CK_INS, cTL(cbctList), xgetCValueCbct(), "CBCT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CBCT: {bigint(19)}
     * @param cbctList The collection of cbct as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCbct_NotInScope(Collection<Long> cbctList) {
        doSetCbct_NotInScope(cbctList);
    }

    protected void doSetCbct_NotInScope(Collection<Long> cbctList) {
        regINS(CK_NINS, cTL(cbctList), xgetCValueCbct(), "CBCT");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CBCT: {bigint(19)}
     */
    public void setCbct_IsNull() { regCbct(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CBCT: {bigint(19)}
     */
    public void setCbct_IsNotNull() { regCbct(CK_ISNN, DOBJ); }

    protected void regCbct(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCbct(), "CBCT"); }
    protected abstract ConditionValue xgetCValueCbct();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PATCBQA: {bigint(19)}
     * @param patcbqa The value of patcbqa as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPatcbqa_Equal(Long patcbqa) {
        doSetPatcbqa_Equal(patcbqa);
    }

    protected void doSetPatcbqa_Equal(Long patcbqa) {
        regPatcbqa(CK_EQ, patcbqa);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PATCBQA: {bigint(19)}
     * @param patcbqa The value of patcbqa as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPatcbqa_NotEqual(Long patcbqa) {
        doSetPatcbqa_NotEqual(patcbqa);
    }

    protected void doSetPatcbqa_NotEqual(Long patcbqa) {
        regPatcbqa(CK_NES, patcbqa);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PATCBQA: {bigint(19)}
     * @param patcbqa The value of patcbqa as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPatcbqa_GreaterThan(Long patcbqa) {
        regPatcbqa(CK_GT, patcbqa);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PATCBQA: {bigint(19)}
     * @param patcbqa The value of patcbqa as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPatcbqa_LessThan(Long patcbqa) {
        regPatcbqa(CK_LT, patcbqa);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PATCBQA: {bigint(19)}
     * @param patcbqa The value of patcbqa as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPatcbqa_GreaterEqual(Long patcbqa) {
        regPatcbqa(CK_GE, patcbqa);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PATCBQA: {bigint(19)}
     * @param patcbqa The value of patcbqa as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPatcbqa_LessEqual(Long patcbqa) {
        regPatcbqa(CK_LE, patcbqa);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PATCBQA: {bigint(19)}
     * @param minNumber The min number of patcbqa. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of patcbqa. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPatcbqa_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePatcbqa(), "PATCBQA", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PATCBQA: {bigint(19)}
     * @param patcbqaList The collection of patcbqa as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPatcbqa_InScope(Collection<Long> patcbqaList) {
        doSetPatcbqa_InScope(patcbqaList);
    }

    protected void doSetPatcbqa_InScope(Collection<Long> patcbqaList) {
        regINS(CK_INS, cTL(patcbqaList), xgetCValuePatcbqa(), "PATCBQA");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PATCBQA: {bigint(19)}
     * @param patcbqaList The collection of patcbqa as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPatcbqa_NotInScope(Collection<Long> patcbqaList) {
        doSetPatcbqa_NotInScope(patcbqaList);
    }

    protected void doSetPatcbqa_NotInScope(Collection<Long> patcbqaList) {
        regINS(CK_NINS, cTL(patcbqaList), xgetCValuePatcbqa(), "PATCBQA");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PATCBQA: {bigint(19)}
     */
    public void setPatcbqa_IsNull() { regPatcbqa(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PATCBQA: {bigint(19)}
     */
    public void setPatcbqa_IsNotNull() { regPatcbqa(CK_ISNN, DOBJ); }

    protected void regPatcbqa(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePatcbqa(), "PATCBQA"); }
    protected abstract ConditionValue xgetCValuePatcbqa();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CTBCDID: {varchar(30)}
     * @param ctbcdid The value of ctbcdid as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCtbcdid_Equal(String ctbcdid) {
        doSetCtbcdid_Equal(fRES(ctbcdid));
    }

    protected void doSetCtbcdid_Equal(String ctbcdid) {
        regCtbcdid(CK_EQ, ctbcdid);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CTBCDID: {varchar(30)}
     * @param ctbcdid The value of ctbcdid as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCtbcdid_NotEqual(String ctbcdid) {
        doSetCtbcdid_NotEqual(fRES(ctbcdid));
    }

    protected void doSetCtbcdid_NotEqual(String ctbcdid) {
        regCtbcdid(CK_NES, ctbcdid);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CTBCDID: {varchar(30)}
     * @param ctbcdid The value of ctbcdid as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCtbcdid_GreaterThan(String ctbcdid) {
        regCtbcdid(CK_GT, fRES(ctbcdid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CTBCDID: {varchar(30)}
     * @param ctbcdid The value of ctbcdid as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCtbcdid_LessThan(String ctbcdid) {
        regCtbcdid(CK_LT, fRES(ctbcdid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CTBCDID: {varchar(30)}
     * @param ctbcdid The value of ctbcdid as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCtbcdid_GreaterEqual(String ctbcdid) {
        regCtbcdid(CK_GE, fRES(ctbcdid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CTBCDID: {varchar(30)}
     * @param ctbcdid The value of ctbcdid as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCtbcdid_LessEqual(String ctbcdid) {
        regCtbcdid(CK_LE, fRES(ctbcdid));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CTBCDID: {varchar(30)}
     * @param ctbcdidList The collection of ctbcdid as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCtbcdid_InScope(Collection<String> ctbcdidList) {
        doSetCtbcdid_InScope(ctbcdidList);
    }

    protected void doSetCtbcdid_InScope(Collection<String> ctbcdidList) {
        regINS(CK_INS, cTL(ctbcdidList), xgetCValueCtbcdid(), "CTBCDID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CTBCDID: {varchar(30)}
     * @param ctbcdidList The collection of ctbcdid as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCtbcdid_NotInScope(Collection<String> ctbcdidList) {
        doSetCtbcdid_NotInScope(ctbcdidList);
    }

    protected void doSetCtbcdid_NotInScope(Collection<String> ctbcdidList) {
        regINS(CK_NINS, cTL(ctbcdidList), xgetCValueCtbcdid(), "CTBCDID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CTBCDID: {varchar(30)} <br>
     * <pre>e.g. setCtbcdid_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param ctbcdid The value of ctbcdid as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCtbcdid_LikeSearch(String ctbcdid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(ctbcdid), xgetCValueCtbcdid(), "CTBCDID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CTBCDID: {varchar(30)}
     * @param ctbcdid The value of ctbcdid as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCtbcdid_NotLikeSearch(String ctbcdid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(ctbcdid), xgetCValueCtbcdid(), "CTBCDID", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CTBCDID: {varchar(30)}
     * @param ctbcdid The value of ctbcdid as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCtbcdid_PrefixSearch(String ctbcdid) {
        setCtbcdid_LikeSearch(ctbcdid, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CTBCDID: {varchar(30)}
     */
    public void setCtbcdid_IsNull() { regCtbcdid(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CTBCDID: {varchar(30)}
     */
    public void setCtbcdid_IsNullOrEmpty() { regCtbcdid(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CTBCDID: {varchar(30)}
     */
    public void setCtbcdid_IsNotNull() { regCtbcdid(CK_ISNN, DOBJ); }

    protected void regCtbcdid(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCtbcdid(), "CTBCDID"); }
    protected abstract ConditionValue xgetCValueCtbcdid();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CTBCD: {varchar(30)}
     * @param ctbcd The value of ctbcd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCtbcd_Equal(String ctbcd) {
        doSetCtbcd_Equal(fRES(ctbcd));
    }

    protected void doSetCtbcd_Equal(String ctbcd) {
        regCtbcd(CK_EQ, ctbcd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CTBCD: {varchar(30)}
     * @param ctbcd The value of ctbcd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCtbcd_NotEqual(String ctbcd) {
        doSetCtbcd_NotEqual(fRES(ctbcd));
    }

    protected void doSetCtbcd_NotEqual(String ctbcd) {
        regCtbcd(CK_NES, ctbcd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CTBCD: {varchar(30)}
     * @param ctbcd The value of ctbcd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCtbcd_GreaterThan(String ctbcd) {
        regCtbcd(CK_GT, fRES(ctbcd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CTBCD: {varchar(30)}
     * @param ctbcd The value of ctbcd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCtbcd_LessThan(String ctbcd) {
        regCtbcd(CK_LT, fRES(ctbcd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CTBCD: {varchar(30)}
     * @param ctbcd The value of ctbcd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCtbcd_GreaterEqual(String ctbcd) {
        regCtbcd(CK_GE, fRES(ctbcd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CTBCD: {varchar(30)}
     * @param ctbcd The value of ctbcd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCtbcd_LessEqual(String ctbcd) {
        regCtbcd(CK_LE, fRES(ctbcd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CTBCD: {varchar(30)}
     * @param ctbcdList The collection of ctbcd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCtbcd_InScope(Collection<String> ctbcdList) {
        doSetCtbcd_InScope(ctbcdList);
    }

    protected void doSetCtbcd_InScope(Collection<String> ctbcdList) {
        regINS(CK_INS, cTL(ctbcdList), xgetCValueCtbcd(), "CTBCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CTBCD: {varchar(30)}
     * @param ctbcdList The collection of ctbcd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCtbcd_NotInScope(Collection<String> ctbcdList) {
        doSetCtbcd_NotInScope(ctbcdList);
    }

    protected void doSetCtbcd_NotInScope(Collection<String> ctbcdList) {
        regINS(CK_NINS, cTL(ctbcdList), xgetCValueCtbcd(), "CTBCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CTBCD: {varchar(30)} <br>
     * <pre>e.g. setCtbcd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param ctbcd The value of ctbcd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCtbcd_LikeSearch(String ctbcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(ctbcd), xgetCValueCtbcd(), "CTBCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CTBCD: {varchar(30)}
     * @param ctbcd The value of ctbcd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCtbcd_NotLikeSearch(String ctbcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(ctbcd), xgetCValueCtbcd(), "CTBCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CTBCD: {varchar(30)}
     * @param ctbcd The value of ctbcd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCtbcd_PrefixSearch(String ctbcd) {
        setCtbcd_LikeSearch(ctbcd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CTBCD: {varchar(30)}
     */
    public void setCtbcd_IsNull() { regCtbcd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CTBCD: {varchar(30)}
     */
    public void setCtbcd_IsNullOrEmpty() { regCtbcd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CTBCD: {varchar(30)}
     */
    public void setCtbcd_IsNotNull() { regCtbcd(CK_ISNN, DOBJ); }

    protected void regCtbcd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCtbcd(), "CTBCD"); }
    protected abstract ConditionValue xgetCValueCtbcd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CBBCDID: {varchar(30)}
     * @param cbbcdid The value of cbbcdid as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCbbcdid_Equal(String cbbcdid) {
        doSetCbbcdid_Equal(fRES(cbbcdid));
    }

    protected void doSetCbbcdid_Equal(String cbbcdid) {
        regCbbcdid(CK_EQ, cbbcdid);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CBBCDID: {varchar(30)}
     * @param cbbcdid The value of cbbcdid as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCbbcdid_NotEqual(String cbbcdid) {
        doSetCbbcdid_NotEqual(fRES(cbbcdid));
    }

    protected void doSetCbbcdid_NotEqual(String cbbcdid) {
        regCbbcdid(CK_NES, cbbcdid);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CBBCDID: {varchar(30)}
     * @param cbbcdid The value of cbbcdid as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCbbcdid_GreaterThan(String cbbcdid) {
        regCbbcdid(CK_GT, fRES(cbbcdid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CBBCDID: {varchar(30)}
     * @param cbbcdid The value of cbbcdid as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCbbcdid_LessThan(String cbbcdid) {
        regCbbcdid(CK_LT, fRES(cbbcdid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CBBCDID: {varchar(30)}
     * @param cbbcdid The value of cbbcdid as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCbbcdid_GreaterEqual(String cbbcdid) {
        regCbbcdid(CK_GE, fRES(cbbcdid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CBBCDID: {varchar(30)}
     * @param cbbcdid The value of cbbcdid as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCbbcdid_LessEqual(String cbbcdid) {
        regCbbcdid(CK_LE, fRES(cbbcdid));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CBBCDID: {varchar(30)}
     * @param cbbcdidList The collection of cbbcdid as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCbbcdid_InScope(Collection<String> cbbcdidList) {
        doSetCbbcdid_InScope(cbbcdidList);
    }

    protected void doSetCbbcdid_InScope(Collection<String> cbbcdidList) {
        regINS(CK_INS, cTL(cbbcdidList), xgetCValueCbbcdid(), "CBBCDID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CBBCDID: {varchar(30)}
     * @param cbbcdidList The collection of cbbcdid as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCbbcdid_NotInScope(Collection<String> cbbcdidList) {
        doSetCbbcdid_NotInScope(cbbcdidList);
    }

    protected void doSetCbbcdid_NotInScope(Collection<String> cbbcdidList) {
        regINS(CK_NINS, cTL(cbbcdidList), xgetCValueCbbcdid(), "CBBCDID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CBBCDID: {varchar(30)} <br>
     * <pre>e.g. setCbbcdid_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param cbbcdid The value of cbbcdid as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCbbcdid_LikeSearch(String cbbcdid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(cbbcdid), xgetCValueCbbcdid(), "CBBCDID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CBBCDID: {varchar(30)}
     * @param cbbcdid The value of cbbcdid as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCbbcdid_NotLikeSearch(String cbbcdid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(cbbcdid), xgetCValueCbbcdid(), "CBBCDID", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CBBCDID: {varchar(30)}
     * @param cbbcdid The value of cbbcdid as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCbbcdid_PrefixSearch(String cbbcdid) {
        setCbbcdid_LikeSearch(cbbcdid, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CBBCDID: {varchar(30)}
     */
    public void setCbbcdid_IsNull() { regCbbcdid(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CBBCDID: {varchar(30)}
     */
    public void setCbbcdid_IsNullOrEmpty() { regCbbcdid(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CBBCDID: {varchar(30)}
     */
    public void setCbbcdid_IsNotNull() { regCbbcdid(CK_ISNN, DOBJ); }

    protected void regCbbcdid(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCbbcdid(), "CBBCDID"); }
    protected abstract ConditionValue xgetCValueCbbcdid();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CBBCD: {varchar(30)}
     * @param cbbcd The value of cbbcd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCbbcd_Equal(String cbbcd) {
        doSetCbbcd_Equal(fRES(cbbcd));
    }

    protected void doSetCbbcd_Equal(String cbbcd) {
        regCbbcd(CK_EQ, cbbcd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CBBCD: {varchar(30)}
     * @param cbbcd The value of cbbcd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCbbcd_NotEqual(String cbbcd) {
        doSetCbbcd_NotEqual(fRES(cbbcd));
    }

    protected void doSetCbbcd_NotEqual(String cbbcd) {
        regCbbcd(CK_NES, cbbcd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CBBCD: {varchar(30)}
     * @param cbbcd The value of cbbcd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCbbcd_GreaterThan(String cbbcd) {
        regCbbcd(CK_GT, fRES(cbbcd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CBBCD: {varchar(30)}
     * @param cbbcd The value of cbbcd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCbbcd_LessThan(String cbbcd) {
        regCbbcd(CK_LT, fRES(cbbcd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CBBCD: {varchar(30)}
     * @param cbbcd The value of cbbcd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCbbcd_GreaterEqual(String cbbcd) {
        regCbbcd(CK_GE, fRES(cbbcd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CBBCD: {varchar(30)}
     * @param cbbcd The value of cbbcd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCbbcd_LessEqual(String cbbcd) {
        regCbbcd(CK_LE, fRES(cbbcd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CBBCD: {varchar(30)}
     * @param cbbcdList The collection of cbbcd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCbbcd_InScope(Collection<String> cbbcdList) {
        doSetCbbcd_InScope(cbbcdList);
    }

    protected void doSetCbbcd_InScope(Collection<String> cbbcdList) {
        regINS(CK_INS, cTL(cbbcdList), xgetCValueCbbcd(), "CBBCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CBBCD: {varchar(30)}
     * @param cbbcdList The collection of cbbcd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCbbcd_NotInScope(Collection<String> cbbcdList) {
        doSetCbbcd_NotInScope(cbbcdList);
    }

    protected void doSetCbbcd_NotInScope(Collection<String> cbbcdList) {
        regINS(CK_NINS, cTL(cbbcdList), xgetCValueCbbcd(), "CBBCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CBBCD: {varchar(30)} <br>
     * <pre>e.g. setCbbcd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param cbbcd The value of cbbcd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCbbcd_LikeSearch(String cbbcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(cbbcd), xgetCValueCbbcd(), "CBBCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CBBCD: {varchar(30)}
     * @param cbbcd The value of cbbcd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCbbcd_NotLikeSearch(String cbbcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(cbbcd), xgetCValueCbbcd(), "CBBCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CBBCD: {varchar(30)}
     * @param cbbcd The value of cbbcd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCbbcd_PrefixSearch(String cbbcd) {
        setCbbcd_LikeSearch(cbbcd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CBBCD: {varchar(30)}
     */
    public void setCbbcd_IsNull() { regCbbcd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CBBCD: {varchar(30)}
     */
    public void setCbbcd_IsNullOrEmpty() { regCbbcd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CBBCD: {varchar(30)}
     */
    public void setCbbcd_IsNotNull() { regCbbcd(CK_ISNN, DOBJ); }

    protected void regCbbcd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCbbcd(), "CBBCD"); }
    protected abstract ConditionValue xgetCValueCbbcd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FWBRID: {varchar(30)}
     * @param fwbrid The value of fwbrid as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFwbrid_Equal(String fwbrid) {
        doSetFwbrid_Equal(fRES(fwbrid));
    }

    protected void doSetFwbrid_Equal(String fwbrid) {
        regFwbrid(CK_EQ, fwbrid);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FWBRID: {varchar(30)}
     * @param fwbrid The value of fwbrid as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFwbrid_NotEqual(String fwbrid) {
        doSetFwbrid_NotEqual(fRES(fwbrid));
    }

    protected void doSetFwbrid_NotEqual(String fwbrid) {
        regFwbrid(CK_NES, fwbrid);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FWBRID: {varchar(30)}
     * @param fwbrid The value of fwbrid as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFwbrid_GreaterThan(String fwbrid) {
        regFwbrid(CK_GT, fRES(fwbrid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FWBRID: {varchar(30)}
     * @param fwbrid The value of fwbrid as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFwbrid_LessThan(String fwbrid) {
        regFwbrid(CK_LT, fRES(fwbrid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FWBRID: {varchar(30)}
     * @param fwbrid The value of fwbrid as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFwbrid_GreaterEqual(String fwbrid) {
        regFwbrid(CK_GE, fRES(fwbrid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FWBRID: {varchar(30)}
     * @param fwbrid The value of fwbrid as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFwbrid_LessEqual(String fwbrid) {
        regFwbrid(CK_LE, fRES(fwbrid));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FWBRID: {varchar(30)}
     * @param fwbridList The collection of fwbrid as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFwbrid_InScope(Collection<String> fwbridList) {
        doSetFwbrid_InScope(fwbridList);
    }

    protected void doSetFwbrid_InScope(Collection<String> fwbridList) {
        regINS(CK_INS, cTL(fwbridList), xgetCValueFwbrid(), "FWBRID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FWBRID: {varchar(30)}
     * @param fwbridList The collection of fwbrid as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFwbrid_NotInScope(Collection<String> fwbridList) {
        doSetFwbrid_NotInScope(fwbridList);
    }

    protected void doSetFwbrid_NotInScope(Collection<String> fwbridList) {
        regINS(CK_NINS, cTL(fwbridList), xgetCValueFwbrid(), "FWBRID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FWBRID: {varchar(30)} <br>
     * <pre>e.g. setFwbrid_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param fwbrid The value of fwbrid as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFwbrid_LikeSearch(String fwbrid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(fwbrid), xgetCValueFwbrid(), "FWBRID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FWBRID: {varchar(30)}
     * @param fwbrid The value of fwbrid as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFwbrid_NotLikeSearch(String fwbrid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(fwbrid), xgetCValueFwbrid(), "FWBRID", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FWBRID: {varchar(30)}
     * @param fwbrid The value of fwbrid as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFwbrid_PrefixSearch(String fwbrid) {
        setFwbrid_LikeSearch(fwbrid, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FWBRID: {varchar(30)}
     */
    public void setFwbrid_IsNull() { regFwbrid(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * FWBRID: {varchar(30)}
     */
    public void setFwbrid_IsNullOrEmpty() { regFwbrid(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FWBRID: {varchar(30)}
     */
    public void setFwbrid_IsNotNull() { regFwbrid(CK_ISNN, DOBJ); }

    protected void regFwbrid(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFwbrid(), "FWBRID"); }
    protected abstract ConditionValue xgetCValueFwbrid();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CTFM: {varchar(30)}
     * @param ctfm The value of ctfm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCtfm_Equal(String ctfm) {
        doSetCtfm_Equal(fRES(ctfm));
    }

    protected void doSetCtfm_Equal(String ctfm) {
        regCtfm(CK_EQ, ctfm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CTFM: {varchar(30)}
     * @param ctfm The value of ctfm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCtfm_NotEqual(String ctfm) {
        doSetCtfm_NotEqual(fRES(ctfm));
    }

    protected void doSetCtfm_NotEqual(String ctfm) {
        regCtfm(CK_NES, ctfm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CTFM: {varchar(30)}
     * @param ctfm The value of ctfm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCtfm_GreaterThan(String ctfm) {
        regCtfm(CK_GT, fRES(ctfm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CTFM: {varchar(30)}
     * @param ctfm The value of ctfm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCtfm_LessThan(String ctfm) {
        regCtfm(CK_LT, fRES(ctfm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CTFM: {varchar(30)}
     * @param ctfm The value of ctfm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCtfm_GreaterEqual(String ctfm) {
        regCtfm(CK_GE, fRES(ctfm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CTFM: {varchar(30)}
     * @param ctfm The value of ctfm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCtfm_LessEqual(String ctfm) {
        regCtfm(CK_LE, fRES(ctfm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CTFM: {varchar(30)}
     * @param ctfmList The collection of ctfm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCtfm_InScope(Collection<String> ctfmList) {
        doSetCtfm_InScope(ctfmList);
    }

    protected void doSetCtfm_InScope(Collection<String> ctfmList) {
        regINS(CK_INS, cTL(ctfmList), xgetCValueCtfm(), "CTFM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CTFM: {varchar(30)}
     * @param ctfmList The collection of ctfm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCtfm_NotInScope(Collection<String> ctfmList) {
        doSetCtfm_NotInScope(ctfmList);
    }

    protected void doSetCtfm_NotInScope(Collection<String> ctfmList) {
        regINS(CK_NINS, cTL(ctfmList), xgetCValueCtfm(), "CTFM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CTFM: {varchar(30)} <br>
     * <pre>e.g. setCtfm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param ctfm The value of ctfm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCtfm_LikeSearch(String ctfm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(ctfm), xgetCValueCtfm(), "CTFM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CTFM: {varchar(30)}
     * @param ctfm The value of ctfm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCtfm_NotLikeSearch(String ctfm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(ctfm), xgetCValueCtfm(), "CTFM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CTFM: {varchar(30)}
     * @param ctfm The value of ctfm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCtfm_PrefixSearch(String ctfm) {
        setCtfm_LikeSearch(ctfm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CTFM: {varchar(30)}
     */
    public void setCtfm_IsNull() { regCtfm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CTFM: {varchar(30)}
     */
    public void setCtfm_IsNullOrEmpty() { regCtfm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CTFM: {varchar(30)}
     */
    public void setCtfm_IsNotNull() { regCtfm(CK_ISNN, DOBJ); }

    protected void regCtfm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCtfm(), "CTFM"); }
    protected abstract ConditionValue xgetCValueCtfm();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CTSZL: {bigint(19)}
     * @param ctszl The value of ctszl as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCtszl_Equal(Long ctszl) {
        doSetCtszl_Equal(ctszl);
    }

    protected void doSetCtszl_Equal(Long ctszl) {
        regCtszl(CK_EQ, ctszl);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CTSZL: {bigint(19)}
     * @param ctszl The value of ctszl as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCtszl_NotEqual(Long ctszl) {
        doSetCtszl_NotEqual(ctszl);
    }

    protected void doSetCtszl_NotEqual(Long ctszl) {
        regCtszl(CK_NES, ctszl);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CTSZL: {bigint(19)}
     * @param ctszl The value of ctszl as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCtszl_GreaterThan(Long ctszl) {
        regCtszl(CK_GT, ctszl);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CTSZL: {bigint(19)}
     * @param ctszl The value of ctszl as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCtszl_LessThan(Long ctszl) {
        regCtszl(CK_LT, ctszl);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CTSZL: {bigint(19)}
     * @param ctszl The value of ctszl as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCtszl_GreaterEqual(Long ctszl) {
        regCtszl(CK_GE, ctszl);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CTSZL: {bigint(19)}
     * @param ctszl The value of ctszl as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCtszl_LessEqual(Long ctszl) {
        regCtszl(CK_LE, ctszl);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CTSZL: {bigint(19)}
     * @param minNumber The min number of ctszl. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of ctszl. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCtszl_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCtszl(), "CTSZL", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CTSZL: {bigint(19)}
     * @param ctszlList The collection of ctszl as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCtszl_InScope(Collection<Long> ctszlList) {
        doSetCtszl_InScope(ctszlList);
    }

    protected void doSetCtszl_InScope(Collection<Long> ctszlList) {
        regINS(CK_INS, cTL(ctszlList), xgetCValueCtszl(), "CTSZL");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CTSZL: {bigint(19)}
     * @param ctszlList The collection of ctszl as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCtszl_NotInScope(Collection<Long> ctszlList) {
        doSetCtszl_NotInScope(ctszlList);
    }

    protected void doSetCtszl_NotInScope(Collection<Long> ctszlList) {
        regINS(CK_NINS, cTL(ctszlList), xgetCValueCtszl(), "CTSZL");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CTSZL: {bigint(19)}
     */
    public void setCtszl_IsNull() { regCtszl(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CTSZL: {bigint(19)}
     */
    public void setCtszl_IsNotNull() { regCtszl(CK_ISNN, DOBJ); }

    protected void regCtszl(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCtszl(), "CTSZL"); }
    protected abstract ConditionValue xgetCValueCtszl();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CTSZW: {bigint(19)}
     * @param ctszw The value of ctszw as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCtszw_Equal(Long ctszw) {
        doSetCtszw_Equal(ctszw);
    }

    protected void doSetCtszw_Equal(Long ctszw) {
        regCtszw(CK_EQ, ctszw);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CTSZW: {bigint(19)}
     * @param ctszw The value of ctszw as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCtszw_NotEqual(Long ctszw) {
        doSetCtszw_NotEqual(ctszw);
    }

    protected void doSetCtszw_NotEqual(Long ctszw) {
        regCtszw(CK_NES, ctszw);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CTSZW: {bigint(19)}
     * @param ctszw The value of ctszw as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCtszw_GreaterThan(Long ctszw) {
        regCtszw(CK_GT, ctszw);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CTSZW: {bigint(19)}
     * @param ctszw The value of ctszw as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCtszw_LessThan(Long ctszw) {
        regCtszw(CK_LT, ctszw);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CTSZW: {bigint(19)}
     * @param ctszw The value of ctszw as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCtszw_GreaterEqual(Long ctszw) {
        regCtszw(CK_GE, ctszw);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CTSZW: {bigint(19)}
     * @param ctszw The value of ctszw as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCtszw_LessEqual(Long ctszw) {
        regCtszw(CK_LE, ctszw);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CTSZW: {bigint(19)}
     * @param minNumber The min number of ctszw. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of ctszw. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCtszw_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCtszw(), "CTSZW", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CTSZW: {bigint(19)}
     * @param ctszwList The collection of ctszw as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCtszw_InScope(Collection<Long> ctszwList) {
        doSetCtszw_InScope(ctszwList);
    }

    protected void doSetCtszw_InScope(Collection<Long> ctszwList) {
        regINS(CK_INS, cTL(ctszwList), xgetCValueCtszw(), "CTSZW");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CTSZW: {bigint(19)}
     * @param ctszwList The collection of ctszw as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCtszw_NotInScope(Collection<Long> ctszwList) {
        doSetCtszw_NotInScope(ctszwList);
    }

    protected void doSetCtszw_NotInScope(Collection<Long> ctszwList) {
        regINS(CK_NINS, cTL(ctszwList), xgetCValueCtszw(), "CTSZW");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CTSZW: {bigint(19)}
     */
    public void setCtszw_IsNull() { regCtszw(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CTSZW: {bigint(19)}
     */
    public void setCtszw_IsNotNull() { regCtszw(CK_ISNN, DOBJ); }

    protected void regCtszw(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCtszw(), "CTSZW"); }
    protected abstract ConditionValue xgetCValueCtszw();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CTSZH: {bigint(19)}
     * @param ctszh The value of ctszh as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCtszh_Equal(Long ctszh) {
        doSetCtszh_Equal(ctszh);
    }

    protected void doSetCtszh_Equal(Long ctszh) {
        regCtszh(CK_EQ, ctszh);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CTSZH: {bigint(19)}
     * @param ctszh The value of ctszh as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCtszh_NotEqual(Long ctszh) {
        doSetCtszh_NotEqual(ctszh);
    }

    protected void doSetCtszh_NotEqual(Long ctszh) {
        regCtszh(CK_NES, ctszh);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CTSZH: {bigint(19)}
     * @param ctszh The value of ctszh as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCtszh_GreaterThan(Long ctszh) {
        regCtszh(CK_GT, ctszh);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CTSZH: {bigint(19)}
     * @param ctszh The value of ctszh as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCtszh_LessThan(Long ctszh) {
        regCtszh(CK_LT, ctszh);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CTSZH: {bigint(19)}
     * @param ctszh The value of ctszh as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCtszh_GreaterEqual(Long ctszh) {
        regCtszh(CK_GE, ctszh);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CTSZH: {bigint(19)}
     * @param ctszh The value of ctszh as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCtszh_LessEqual(Long ctszh) {
        regCtszh(CK_LE, ctszh);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CTSZH: {bigint(19)}
     * @param minNumber The min number of ctszh. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of ctszh. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCtszh_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCtszh(), "CTSZH", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CTSZH: {bigint(19)}
     * @param ctszhList The collection of ctszh as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCtszh_InScope(Collection<Long> ctszhList) {
        doSetCtszh_InScope(ctszhList);
    }

    protected void doSetCtszh_InScope(Collection<Long> ctszhList) {
        regINS(CK_INS, cTL(ctszhList), xgetCValueCtszh(), "CTSZH");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CTSZH: {bigint(19)}
     * @param ctszhList The collection of ctszh as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCtszh_NotInScope(Collection<Long> ctszhList) {
        doSetCtszh_NotInScope(ctszhList);
    }

    protected void doSetCtszh_NotInScope(Collection<Long> ctszhList) {
        regINS(CK_NINS, cTL(ctszhList), xgetCValueCtszh(), "CTSZH");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CTSZH: {bigint(19)}
     */
    public void setCtszh_IsNull() { regCtszh(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CTSZH: {bigint(19)}
     */
    public void setCtszh_IsNotNull() { regCtszh(CK_ISNN, DOBJ); }

    protected void regCtszh(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCtszh(), "CTSZH"); }
    protected abstract ConditionValue xgetCValueCtszh();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CTCC: {bigint(19)}
     * @param ctcc The value of ctcc as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCtcc_Equal(Long ctcc) {
        doSetCtcc_Equal(ctcc);
    }

    protected void doSetCtcc_Equal(Long ctcc) {
        regCtcc(CK_EQ, ctcc);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CTCC: {bigint(19)}
     * @param ctcc The value of ctcc as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCtcc_NotEqual(Long ctcc) {
        doSetCtcc_NotEqual(ctcc);
    }

    protected void doSetCtcc_NotEqual(Long ctcc) {
        regCtcc(CK_NES, ctcc);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CTCC: {bigint(19)}
     * @param ctcc The value of ctcc as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCtcc_GreaterThan(Long ctcc) {
        regCtcc(CK_GT, ctcc);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CTCC: {bigint(19)}
     * @param ctcc The value of ctcc as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCtcc_LessThan(Long ctcc) {
        regCtcc(CK_LT, ctcc);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CTCC: {bigint(19)}
     * @param ctcc The value of ctcc as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCtcc_GreaterEqual(Long ctcc) {
        regCtcc(CK_GE, ctcc);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CTCC: {bigint(19)}
     * @param ctcc The value of ctcc as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCtcc_LessEqual(Long ctcc) {
        regCtcc(CK_LE, ctcc);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CTCC: {bigint(19)}
     * @param minNumber The min number of ctcc. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of ctcc. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCtcc_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCtcc(), "CTCC", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CTCC: {bigint(19)}
     * @param ctccList The collection of ctcc as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCtcc_InScope(Collection<Long> ctccList) {
        doSetCtcc_InScope(ctccList);
    }

    protected void doSetCtcc_InScope(Collection<Long> ctccList) {
        regINS(CK_INS, cTL(ctccList), xgetCValueCtcc(), "CTCC");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CTCC: {bigint(19)}
     * @param ctccList The collection of ctcc as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCtcc_NotInScope(Collection<Long> ctccList) {
        doSetCtcc_NotInScope(ctccList);
    }

    protected void doSetCtcc_NotInScope(Collection<Long> ctccList) {
        regINS(CK_NINS, cTL(ctccList), xgetCValueCtcc(), "CTCC");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CTCC: {bigint(19)}
     */
    public void setCtcc_IsNull() { regCtcc(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CTCC: {bigint(19)}
     */
    public void setCtcc_IsNotNull() { regCtcc(CK_ISNN, DOBJ); }

    protected void regCtcc(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCtcc(), "CTCC"); }
    protected abstract ConditionValue xgetCValueCtcc();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CTWEIGHT: {decimal(16, 6)}
     * @param ctweight The value of ctweight as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCtweight_Equal(java.math.BigDecimal ctweight) {
        doSetCtweight_Equal(ctweight);
    }

    protected void doSetCtweight_Equal(java.math.BigDecimal ctweight) {
        regCtweight(CK_EQ, ctweight);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CTWEIGHT: {decimal(16, 6)}
     * @param ctweight The value of ctweight as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCtweight_NotEqual(java.math.BigDecimal ctweight) {
        doSetCtweight_NotEqual(ctweight);
    }

    protected void doSetCtweight_NotEqual(java.math.BigDecimal ctweight) {
        regCtweight(CK_NES, ctweight);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CTWEIGHT: {decimal(16, 6)}
     * @param ctweight The value of ctweight as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCtweight_GreaterThan(java.math.BigDecimal ctweight) {
        regCtweight(CK_GT, ctweight);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CTWEIGHT: {decimal(16, 6)}
     * @param ctweight The value of ctweight as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCtweight_LessThan(java.math.BigDecimal ctweight) {
        regCtweight(CK_LT, ctweight);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CTWEIGHT: {decimal(16, 6)}
     * @param ctweight The value of ctweight as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCtweight_GreaterEqual(java.math.BigDecimal ctweight) {
        regCtweight(CK_GE, ctweight);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CTWEIGHT: {decimal(16, 6)}
     * @param ctweight The value of ctweight as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCtweight_LessEqual(java.math.BigDecimal ctweight) {
        regCtweight(CK_LE, ctweight);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CTWEIGHT: {decimal(16, 6)}
     * @param minNumber The min number of ctweight. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of ctweight. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCtweight_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCtweight(), "CTWEIGHT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CTWEIGHT: {decimal(16, 6)}
     * @param ctweightList The collection of ctweight as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCtweight_InScope(Collection<java.math.BigDecimal> ctweightList) {
        doSetCtweight_InScope(ctweightList);
    }

    protected void doSetCtweight_InScope(Collection<java.math.BigDecimal> ctweightList) {
        regINS(CK_INS, cTL(ctweightList), xgetCValueCtweight(), "CTWEIGHT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CTWEIGHT: {decimal(16, 6)}
     * @param ctweightList The collection of ctweight as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCtweight_NotInScope(Collection<java.math.BigDecimal> ctweightList) {
        doSetCtweight_NotInScope(ctweightList);
    }

    protected void doSetCtweight_NotInScope(Collection<java.math.BigDecimal> ctweightList) {
        regINS(CK_NINS, cTL(ctweightList), xgetCValueCtweight(), "CTWEIGHT");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CTWEIGHT: {decimal(16, 6)}
     */
    public void setCtweight_IsNull() { regCtweight(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CTWEIGHT: {decimal(16, 6)}
     */
    public void setCtweight_IsNotNull() { regCtweight(CK_ISNN, DOBJ); }

    protected void regCtweight(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCtweight(), "CTWEIGHT"); }
    protected abstract ConditionValue xgetCValueCtweight();

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
     * WORK_FLG: {char(1), default=[(0)]}
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
     * WORK_FLG: {char(1), default=[(0)]}
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
     * WORK_FLG: {char(1), default=[(0)]}
     * @param workFlg The value of workFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkFlg_GreaterThan(String workFlg) {
        regWorkFlg(CK_GT, fRES(workFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WORK_FLG: {char(1), default=[(0)]}
     * @param workFlg The value of workFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkFlg_LessThan(String workFlg) {
        regWorkFlg(CK_LT, fRES(workFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WORK_FLG: {char(1), default=[(0)]}
     * @param workFlg The value of workFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkFlg_GreaterEqual(String workFlg) {
        regWorkFlg(CK_GE, fRES(workFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WORK_FLG: {char(1), default=[(0)]}
     * @param workFlg The value of workFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkFlg_LessEqual(String workFlg) {
        regWorkFlg(CK_LE, fRES(workFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WORK_FLG: {char(1), default=[(0)]}
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
     * WORK_FLG: {char(1), default=[(0)]}
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
     * WORK_FLG: {char(1), default=[(0)]} <br>
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
     * WORK_FLG: {char(1), default=[(0)]}
     * @param workFlg The value of workFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setWorkFlg_NotLikeSearch(String workFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(workFlg), xgetCValueWorkFlg(), "WORK_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WORK_FLG: {char(1), default=[(0)]}
     * @param workFlg The value of workFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkFlg_PrefixSearch(String workFlg) {
        setWorkFlg_LikeSearch(workFlg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * WORK_FLG: {char(1), default=[(0)]}
     */
    public void setWorkFlg_IsNull() { regWorkFlg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * WORK_FLG: {char(1), default=[(0)]}
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
    public HpSLCFunction<EProductMSendCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, EProductMSendCB.class);
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
    public HpSLCFunction<EProductMSendCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, EProductMSendCB.class);
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
    public HpSLCFunction<EProductMSendCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, EProductMSendCB.class);
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
    public HpSLCFunction<EProductMSendCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, EProductMSendCB.class);
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
    public HpSLCFunction<EProductMSendCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, EProductMSendCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;EProductMSendCB&gt;() {
     *     public void query(EProductMSendCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<EProductMSendCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, EProductMSendCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        EProductMSendCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(EProductMSendCQ sq);

    protected EProductMSendCB xcreateScalarConditionCB() {
        EProductMSendCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected EProductMSendCB xcreateScalarConditionPartitionByCB() {
        EProductMSendCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<EProductMSendCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        EProductMSendCB cb = new EProductMSendCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "PRODUCT_M_SEND_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(EProductMSendCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<EProductMSendCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(EProductMSendCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        EProductMSendCB cb = new EProductMSendCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "PRODUCT_M_SEND_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(EProductMSendCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<EProductMSendCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        EProductMSendCB cb = new EProductMSendCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(EProductMSendCQ sq);

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
    protected EProductMSendCB newMyCB() {
        return new EProductMSendCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return EProductMSendCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
