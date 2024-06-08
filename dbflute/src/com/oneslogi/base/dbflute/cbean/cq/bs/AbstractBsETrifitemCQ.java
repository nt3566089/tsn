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
 * The abstract condition-query of E_TRIFITEM.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsETrifitemCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsETrifitemCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "E_TRIFITEM";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * IMPORTKEY: {PK, NotNull, decimal(16, 6)}
     * @param importkey The value of importkey as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setImportkey_Equal(java.math.BigDecimal importkey) {
        doSetImportkey_Equal(importkey);
    }

    protected void doSetImportkey_Equal(java.math.BigDecimal importkey) {
        regImportkey(CK_EQ, importkey);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * IMPORTKEY: {PK, NotNull, decimal(16, 6)}
     * @param importkey The value of importkey as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setImportkey_NotEqual(java.math.BigDecimal importkey) {
        doSetImportkey_NotEqual(importkey);
    }

    protected void doSetImportkey_NotEqual(java.math.BigDecimal importkey) {
        regImportkey(CK_NES, importkey);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * IMPORTKEY: {PK, NotNull, decimal(16, 6)}
     * @param importkey The value of importkey as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setImportkey_GreaterThan(java.math.BigDecimal importkey) {
        regImportkey(CK_GT, importkey);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * IMPORTKEY: {PK, NotNull, decimal(16, 6)}
     * @param importkey The value of importkey as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setImportkey_LessThan(java.math.BigDecimal importkey) {
        regImportkey(CK_LT, importkey);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * IMPORTKEY: {PK, NotNull, decimal(16, 6)}
     * @param importkey The value of importkey as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setImportkey_GreaterEqual(java.math.BigDecimal importkey) {
        regImportkey(CK_GE, importkey);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * IMPORTKEY: {PK, NotNull, decimal(16, 6)}
     * @param importkey The value of importkey as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setImportkey_LessEqual(java.math.BigDecimal importkey) {
        regImportkey(CK_LE, importkey);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * IMPORTKEY: {PK, NotNull, decimal(16, 6)}
     * @param minNumber The min number of importkey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of importkey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setImportkey_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueImportkey(), "IMPORTKEY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * IMPORTKEY: {PK, NotNull, decimal(16, 6)}
     * @param importkeyList The collection of importkey as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImportkey_InScope(Collection<java.math.BigDecimal> importkeyList) {
        doSetImportkey_InScope(importkeyList);
    }

    protected void doSetImportkey_InScope(Collection<java.math.BigDecimal> importkeyList) {
        regINS(CK_INS, cTL(importkeyList), xgetCValueImportkey(), "IMPORTKEY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * IMPORTKEY: {PK, NotNull, decimal(16, 6)}
     * @param importkeyList The collection of importkey as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImportkey_NotInScope(Collection<java.math.BigDecimal> importkeyList) {
        doSetImportkey_NotInScope(importkeyList);
    }

    protected void doSetImportkey_NotInScope(Collection<java.math.BigDecimal> importkeyList) {
        regINS(CK_NINS, cTL(importkeyList), xgetCValueImportkey(), "IMPORTKEY");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * IMPORTKEY: {PK, NotNull, decimal(16, 6)}
     */
    public void setImportkey_IsNull() { regImportkey(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * IMPORTKEY: {PK, NotNull, decimal(16, 6)}
     */
    public void setImportkey_IsNotNull() { regImportkey(CK_ISNN, DOBJ); }

    protected void regImportkey(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueImportkey(), "IMPORTKEY"); }
    protected abstract ConditionValue xgetCValueImportkey();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * STS: {NotNull, bigint(19)}
     * @param sts The value of sts as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSts_Equal(Long sts) {
        doSetSts_Equal(sts);
    }

    protected void doSetSts_Equal(Long sts) {
        regSts(CK_EQ, sts);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STS: {NotNull, bigint(19)}
     * @param sts The value of sts as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSts_NotEqual(Long sts) {
        doSetSts_NotEqual(sts);
    }

    protected void doSetSts_NotEqual(Long sts) {
        regSts(CK_NES, sts);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STS: {NotNull, bigint(19)}
     * @param sts The value of sts as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSts_GreaterThan(Long sts) {
        regSts(CK_GT, sts);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STS: {NotNull, bigint(19)}
     * @param sts The value of sts as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSts_LessThan(Long sts) {
        regSts(CK_LT, sts);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * STS: {NotNull, bigint(19)}
     * @param sts The value of sts as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSts_GreaterEqual(Long sts) {
        regSts(CK_GE, sts);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * STS: {NotNull, bigint(19)}
     * @param sts The value of sts as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSts_LessEqual(Long sts) {
        regSts(CK_LE, sts);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * STS: {NotNull, bigint(19)}
     * @param minNumber The min number of sts. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of sts. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSts_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSts(), "STS", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * STS: {NotNull, bigint(19)}
     * @param stsList The collection of sts as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSts_InScope(Collection<Long> stsList) {
        doSetSts_InScope(stsList);
    }

    protected void doSetSts_InScope(Collection<Long> stsList) {
        regINS(CK_INS, cTL(stsList), xgetCValueSts(), "STS");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * STS: {NotNull, bigint(19)}
     * @param stsList The collection of sts as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSts_NotInScope(Collection<Long> stsList) {
        doSetSts_NotInScope(stsList);
    }

    protected void doSetSts_NotInScope(Collection<Long> stsList) {
        regINS(CK_NINS, cTL(stsList), xgetCValueSts(), "STS");
    }

    protected void regSts(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSts(), "STS"); }
    protected abstract ConditionValue xgetCValueSts();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * IMPCHECKKEY: {decimal(16, 6)}
     * @param impcheckkey The value of impcheckkey as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setImpcheckkey_Equal(java.math.BigDecimal impcheckkey) {
        doSetImpcheckkey_Equal(impcheckkey);
    }

    protected void doSetImpcheckkey_Equal(java.math.BigDecimal impcheckkey) {
        regImpcheckkey(CK_EQ, impcheckkey);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * IMPCHECKKEY: {decimal(16, 6)}
     * @param impcheckkey The value of impcheckkey as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setImpcheckkey_NotEqual(java.math.BigDecimal impcheckkey) {
        doSetImpcheckkey_NotEqual(impcheckkey);
    }

    protected void doSetImpcheckkey_NotEqual(java.math.BigDecimal impcheckkey) {
        regImpcheckkey(CK_NES, impcheckkey);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * IMPCHECKKEY: {decimal(16, 6)}
     * @param impcheckkey The value of impcheckkey as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setImpcheckkey_GreaterThan(java.math.BigDecimal impcheckkey) {
        regImpcheckkey(CK_GT, impcheckkey);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * IMPCHECKKEY: {decimal(16, 6)}
     * @param impcheckkey The value of impcheckkey as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setImpcheckkey_LessThan(java.math.BigDecimal impcheckkey) {
        regImpcheckkey(CK_LT, impcheckkey);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * IMPCHECKKEY: {decimal(16, 6)}
     * @param impcheckkey The value of impcheckkey as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setImpcheckkey_GreaterEqual(java.math.BigDecimal impcheckkey) {
        regImpcheckkey(CK_GE, impcheckkey);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * IMPCHECKKEY: {decimal(16, 6)}
     * @param impcheckkey The value of impcheckkey as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setImpcheckkey_LessEqual(java.math.BigDecimal impcheckkey) {
        regImpcheckkey(CK_LE, impcheckkey);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * IMPCHECKKEY: {decimal(16, 6)}
     * @param minNumber The min number of impcheckkey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of impcheckkey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setImpcheckkey_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueImpcheckkey(), "IMPCHECKKEY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * IMPCHECKKEY: {decimal(16, 6)}
     * @param impcheckkeyList The collection of impcheckkey as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImpcheckkey_InScope(Collection<java.math.BigDecimal> impcheckkeyList) {
        doSetImpcheckkey_InScope(impcheckkeyList);
    }

    protected void doSetImpcheckkey_InScope(Collection<java.math.BigDecimal> impcheckkeyList) {
        regINS(CK_INS, cTL(impcheckkeyList), xgetCValueImpcheckkey(), "IMPCHECKKEY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * IMPCHECKKEY: {decimal(16, 6)}
     * @param impcheckkeyList The collection of impcheckkey as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImpcheckkey_NotInScope(Collection<java.math.BigDecimal> impcheckkeyList) {
        doSetImpcheckkey_NotInScope(impcheckkeyList);
    }

    protected void doSetImpcheckkey_NotInScope(Collection<java.math.BigDecimal> impcheckkeyList) {
        regINS(CK_NINS, cTL(impcheckkeyList), xgetCValueImpcheckkey(), "IMPCHECKKEY");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * IMPCHECKKEY: {decimal(16, 6)}
     */
    public void setImpcheckkey_IsNull() { regImpcheckkey(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * IMPCHECKKEY: {decimal(16, 6)}
     */
    public void setImpcheckkey_IsNotNull() { regImpcheckkey(CK_ISNN, DOBJ); }

    protected void regImpcheckkey(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueImpcheckkey(), "IMPCHECKKEY"); }
    protected abstract ConditionValue xgetCValueImpcheckkey();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMADMIN: {varchar(30)}
     * @param itemadmin The value of itemadmin as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemadmin_Equal(String itemadmin) {
        doSetItemadmin_Equal(fRES(itemadmin));
    }

    protected void doSetItemadmin_Equal(String itemadmin) {
        regItemadmin(CK_EQ, itemadmin);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMADMIN: {varchar(30)}
     * @param itemadmin The value of itemadmin as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemadmin_NotEqual(String itemadmin) {
        doSetItemadmin_NotEqual(fRES(itemadmin));
    }

    protected void doSetItemadmin_NotEqual(String itemadmin) {
        regItemadmin(CK_NES, itemadmin);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMADMIN: {varchar(30)}
     * @param itemadmin The value of itemadmin as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemadmin_GreaterThan(String itemadmin) {
        regItemadmin(CK_GT, fRES(itemadmin));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMADMIN: {varchar(30)}
     * @param itemadmin The value of itemadmin as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemadmin_LessThan(String itemadmin) {
        regItemadmin(CK_LT, fRES(itemadmin));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMADMIN: {varchar(30)}
     * @param itemadmin The value of itemadmin as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemadmin_GreaterEqual(String itemadmin) {
        regItemadmin(CK_GE, fRES(itemadmin));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMADMIN: {varchar(30)}
     * @param itemadmin The value of itemadmin as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemadmin_LessEqual(String itemadmin) {
        regItemadmin(CK_LE, fRES(itemadmin));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ITEMADMIN: {varchar(30)}
     * @param itemadminList The collection of itemadmin as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemadmin_InScope(Collection<String> itemadminList) {
        doSetItemadmin_InScope(itemadminList);
    }

    protected void doSetItemadmin_InScope(Collection<String> itemadminList) {
        regINS(CK_INS, cTL(itemadminList), xgetCValueItemadmin(), "ITEMADMIN");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ITEMADMIN: {varchar(30)}
     * @param itemadminList The collection of itemadmin as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemadmin_NotInScope(Collection<String> itemadminList) {
        doSetItemadmin_NotInScope(itemadminList);
    }

    protected void doSetItemadmin_NotInScope(Collection<String> itemadminList) {
        regINS(CK_NINS, cTL(itemadminList), xgetCValueItemadmin(), "ITEMADMIN");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEMADMIN: {varchar(30)} <br>
     * <pre>e.g. setItemadmin_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param itemadmin The value of itemadmin as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setItemadmin_LikeSearch(String itemadmin, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(itemadmin), xgetCValueItemadmin(), "ITEMADMIN", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEMADMIN: {varchar(30)}
     * @param itemadmin The value of itemadmin as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setItemadmin_NotLikeSearch(String itemadmin, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(itemadmin), xgetCValueItemadmin(), "ITEMADMIN", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEMADMIN: {varchar(30)}
     * @param itemadmin The value of itemadmin as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemadmin_PrefixSearch(String itemadmin) {
        setItemadmin_LikeSearch(itemadmin, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ITEMADMIN: {varchar(30)}
     */
    public void setItemadmin_IsNull() { regItemadmin(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ITEMADMIN: {varchar(30)}
     */
    public void setItemadmin_IsNullOrEmpty() { regItemadmin(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ITEMADMIN: {varchar(30)}
     */
    public void setItemadmin_IsNotNull() { regItemadmin(CK_ISNN, DOBJ); }

    protected void regItemadmin(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueItemadmin(), "ITEMADMIN"); }
    protected abstract ConditionValue xgetCValueItemadmin();

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
     * ITEMGROUP: {varchar(60)}
     * @param itemgroup The value of itemgroup as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemgroup_Equal(String itemgroup) {
        doSetItemgroup_Equal(fRES(itemgroup));
    }

    protected void doSetItemgroup_Equal(String itemgroup) {
        regItemgroup(CK_EQ, itemgroup);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMGROUP: {varchar(60)}
     * @param itemgroup The value of itemgroup as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemgroup_NotEqual(String itemgroup) {
        doSetItemgroup_NotEqual(fRES(itemgroup));
    }

    protected void doSetItemgroup_NotEqual(String itemgroup) {
        regItemgroup(CK_NES, itemgroup);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMGROUP: {varchar(60)}
     * @param itemgroup The value of itemgroup as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemgroup_GreaterThan(String itemgroup) {
        regItemgroup(CK_GT, fRES(itemgroup));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMGROUP: {varchar(60)}
     * @param itemgroup The value of itemgroup as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemgroup_LessThan(String itemgroup) {
        regItemgroup(CK_LT, fRES(itemgroup));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMGROUP: {varchar(60)}
     * @param itemgroup The value of itemgroup as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemgroup_GreaterEqual(String itemgroup) {
        regItemgroup(CK_GE, fRES(itemgroup));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMGROUP: {varchar(60)}
     * @param itemgroup The value of itemgroup as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemgroup_LessEqual(String itemgroup) {
        regItemgroup(CK_LE, fRES(itemgroup));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ITEMGROUP: {varchar(60)}
     * @param itemgroupList The collection of itemgroup as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemgroup_InScope(Collection<String> itemgroupList) {
        doSetItemgroup_InScope(itemgroupList);
    }

    protected void doSetItemgroup_InScope(Collection<String> itemgroupList) {
        regINS(CK_INS, cTL(itemgroupList), xgetCValueItemgroup(), "ITEMGROUP");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ITEMGROUP: {varchar(60)}
     * @param itemgroupList The collection of itemgroup as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemgroup_NotInScope(Collection<String> itemgroupList) {
        doSetItemgroup_NotInScope(itemgroupList);
    }

    protected void doSetItemgroup_NotInScope(Collection<String> itemgroupList) {
        regINS(CK_NINS, cTL(itemgroupList), xgetCValueItemgroup(), "ITEMGROUP");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEMGROUP: {varchar(60)} <br>
     * <pre>e.g. setItemgroup_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param itemgroup The value of itemgroup as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setItemgroup_LikeSearch(String itemgroup, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(itemgroup), xgetCValueItemgroup(), "ITEMGROUP", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEMGROUP: {varchar(60)}
     * @param itemgroup The value of itemgroup as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setItemgroup_NotLikeSearch(String itemgroup, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(itemgroup), xgetCValueItemgroup(), "ITEMGROUP", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEMGROUP: {varchar(60)}
     * @param itemgroup The value of itemgroup as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemgroup_PrefixSearch(String itemgroup) {
        setItemgroup_LikeSearch(itemgroup, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ITEMGROUP: {varchar(60)}
     */
    public void setItemgroup_IsNull() { regItemgroup(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ITEMGROUP: {varchar(60)}
     */
    public void setItemgroup_IsNullOrEmpty() { regItemgroup(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ITEMGROUP: {varchar(60)}
     */
    public void setItemgroup_IsNotNull() { regItemgroup(CK_ISNN, DOBJ); }

    protected void regItemgroup(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueItemgroup(), "ITEMGROUP"); }
    protected abstract ConditionValue xgetCValueItemgroup();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ACTFLG: {char(1), default=[(1)]}
     * @param actflg The value of actflg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setActflg_Equal(String actflg) {
        doSetActflg_Equal(fRES(actflg));
    }

    protected void doSetActflg_Equal(String actflg) {
        regActflg(CK_EQ, actflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ACTFLG: {char(1), default=[(1)]}
     * @param actflg The value of actflg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setActflg_NotEqual(String actflg) {
        doSetActflg_NotEqual(fRES(actflg));
    }

    protected void doSetActflg_NotEqual(String actflg) {
        regActflg(CK_NES, actflg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ACTFLG: {char(1), default=[(1)]}
     * @param actflg The value of actflg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setActflg_GreaterThan(String actflg) {
        regActflg(CK_GT, fRES(actflg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ACTFLG: {char(1), default=[(1)]}
     * @param actflg The value of actflg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setActflg_LessThan(String actflg) {
        regActflg(CK_LT, fRES(actflg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ACTFLG: {char(1), default=[(1)]}
     * @param actflg The value of actflg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setActflg_GreaterEqual(String actflg) {
        regActflg(CK_GE, fRES(actflg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ACTFLG: {char(1), default=[(1)]}
     * @param actflg The value of actflg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setActflg_LessEqual(String actflg) {
        regActflg(CK_LE, fRES(actflg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ACTFLG: {char(1), default=[(1)]}
     * @param actflgList The collection of actflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setActflg_InScope(Collection<String> actflgList) {
        doSetActflg_InScope(actflgList);
    }

    protected void doSetActflg_InScope(Collection<String> actflgList) {
        regINS(CK_INS, cTL(actflgList), xgetCValueActflg(), "ACTFLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ACTFLG: {char(1), default=[(1)]}
     * @param actflgList The collection of actflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setActflg_NotInScope(Collection<String> actflgList) {
        doSetActflg_NotInScope(actflgList);
    }

    protected void doSetActflg_NotInScope(Collection<String> actflgList) {
        regINS(CK_NINS, cTL(actflgList), xgetCValueActflg(), "ACTFLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ACTFLG: {char(1), default=[(1)]} <br>
     * <pre>e.g. setActflg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param actflg The value of actflg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setActflg_LikeSearch(String actflg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(actflg), xgetCValueActflg(), "ACTFLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ACTFLG: {char(1), default=[(1)]}
     * @param actflg The value of actflg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setActflg_NotLikeSearch(String actflg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(actflg), xgetCValueActflg(), "ACTFLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ACTFLG: {char(1), default=[(1)]}
     * @param actflg The value of actflg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setActflg_PrefixSearch(String actflg) {
        setActflg_LikeSearch(actflg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ACTFLG: {char(1), default=[(1)]}
     */
    public void setActflg_IsNull() { regActflg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ACTFLG: {char(1), default=[(1)]}
     */
    public void setActflg_IsNotNull() { regActflg(CK_ISNN, DOBJ); }

    protected void regActflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueActflg(), "ACTFLG"); }
    protected abstract ConditionValue xgetCValueActflg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVTYPE: {varchar(30)}
     * @param invtype The value of invtype as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvtype_Equal(String invtype) {
        doSetInvtype_Equal(fRES(invtype));
    }

    protected void doSetInvtype_Equal(String invtype) {
        regInvtype(CK_EQ, invtype);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVTYPE: {varchar(30)}
     * @param invtype The value of invtype as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvtype_NotEqual(String invtype) {
        doSetInvtype_NotEqual(fRES(invtype));
    }

    protected void doSetInvtype_NotEqual(String invtype) {
        regInvtype(CK_NES, invtype);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVTYPE: {varchar(30)}
     * @param invtype The value of invtype as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvtype_GreaterThan(String invtype) {
        regInvtype(CK_GT, fRES(invtype));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVTYPE: {varchar(30)}
     * @param invtype The value of invtype as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvtype_LessThan(String invtype) {
        regInvtype(CK_LT, fRES(invtype));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVTYPE: {varchar(30)}
     * @param invtype The value of invtype as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvtype_GreaterEqual(String invtype) {
        regInvtype(CK_GE, fRES(invtype));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVTYPE: {varchar(30)}
     * @param invtype The value of invtype as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvtype_LessEqual(String invtype) {
        regInvtype(CK_LE, fRES(invtype));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INVTYPE: {varchar(30)}
     * @param invtypeList The collection of invtype as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvtype_InScope(Collection<String> invtypeList) {
        doSetInvtype_InScope(invtypeList);
    }

    protected void doSetInvtype_InScope(Collection<String> invtypeList) {
        regINS(CK_INS, cTL(invtypeList), xgetCValueInvtype(), "INVTYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INVTYPE: {varchar(30)}
     * @param invtypeList The collection of invtype as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvtype_NotInScope(Collection<String> invtypeList) {
        doSetInvtype_NotInScope(invtypeList);
    }

    protected void doSetInvtype_NotInScope(Collection<String> invtypeList) {
        regINS(CK_NINS, cTL(invtypeList), xgetCValueInvtype(), "INVTYPE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INVTYPE: {varchar(30)} <br>
     * <pre>e.g. setInvtype_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param invtype The value of invtype as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setInvtype_LikeSearch(String invtype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(invtype), xgetCValueInvtype(), "INVTYPE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INVTYPE: {varchar(30)}
     * @param invtype The value of invtype as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setInvtype_NotLikeSearch(String invtype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(invtype), xgetCValueInvtype(), "INVTYPE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INVTYPE: {varchar(30)}
     * @param invtype The value of invtype as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvtype_PrefixSearch(String invtype) {
        setInvtype_LikeSearch(invtype, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * INVTYPE: {varchar(30)}
     */
    public void setInvtype_IsNull() { regInvtype(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * INVTYPE: {varchar(30)}
     */
    public void setInvtype_IsNullOrEmpty() { regInvtype(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * INVTYPE: {varchar(30)}
     */
    public void setInvtype_IsNotNull() { regInvtype(CK_ISNN, DOBJ); }

    protected void regInvtype(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInvtype(), "INVTYPE"); }
    protected abstract ConditionValue xgetCValueInvtype();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SETITEMFLG: {char(1), default=[(0)]}
     * @param setitemflg The value of setitemflg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSetitemflg_Equal(String setitemflg) {
        doSetSetitemflg_Equal(fRES(setitemflg));
    }

    protected void doSetSetitemflg_Equal(String setitemflg) {
        regSetitemflg(CK_EQ, setitemflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SETITEMFLG: {char(1), default=[(0)]}
     * @param setitemflg The value of setitemflg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSetitemflg_NotEqual(String setitemflg) {
        doSetSetitemflg_NotEqual(fRES(setitemflg));
    }

    protected void doSetSetitemflg_NotEqual(String setitemflg) {
        regSetitemflg(CK_NES, setitemflg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SETITEMFLG: {char(1), default=[(0)]}
     * @param setitemflg The value of setitemflg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSetitemflg_GreaterThan(String setitemflg) {
        regSetitemflg(CK_GT, fRES(setitemflg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SETITEMFLG: {char(1), default=[(0)]}
     * @param setitemflg The value of setitemflg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSetitemflg_LessThan(String setitemflg) {
        regSetitemflg(CK_LT, fRES(setitemflg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SETITEMFLG: {char(1), default=[(0)]}
     * @param setitemflg The value of setitemflg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSetitemflg_GreaterEqual(String setitemflg) {
        regSetitemflg(CK_GE, fRES(setitemflg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SETITEMFLG: {char(1), default=[(0)]}
     * @param setitemflg The value of setitemflg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSetitemflg_LessEqual(String setitemflg) {
        regSetitemflg(CK_LE, fRES(setitemflg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SETITEMFLG: {char(1), default=[(0)]}
     * @param setitemflgList The collection of setitemflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSetitemflg_InScope(Collection<String> setitemflgList) {
        doSetSetitemflg_InScope(setitemflgList);
    }

    protected void doSetSetitemflg_InScope(Collection<String> setitemflgList) {
        regINS(CK_INS, cTL(setitemflgList), xgetCValueSetitemflg(), "SETITEMFLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SETITEMFLG: {char(1), default=[(0)]}
     * @param setitemflgList The collection of setitemflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSetitemflg_NotInScope(Collection<String> setitemflgList) {
        doSetSetitemflg_NotInScope(setitemflgList);
    }

    protected void doSetSetitemflg_NotInScope(Collection<String> setitemflgList) {
        regINS(CK_NINS, cTL(setitemflgList), xgetCValueSetitemflg(), "SETITEMFLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SETITEMFLG: {char(1), default=[(0)]} <br>
     * <pre>e.g. setSetitemflg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param setitemflg The value of setitemflg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSetitemflg_LikeSearch(String setitemflg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(setitemflg), xgetCValueSetitemflg(), "SETITEMFLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SETITEMFLG: {char(1), default=[(0)]}
     * @param setitemflg The value of setitemflg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSetitemflg_NotLikeSearch(String setitemflg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(setitemflg), xgetCValueSetitemflg(), "SETITEMFLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SETITEMFLG: {char(1), default=[(0)]}
     * @param setitemflg The value of setitemflg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSetitemflg_PrefixSearch(String setitemflg) {
        setSetitemflg_LikeSearch(setitemflg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SETITEMFLG: {char(1), default=[(0)]}
     */
    public void setSetitemflg_IsNull() { regSetitemflg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SETITEMFLG: {char(1), default=[(0)]}
     */
    public void setSetitemflg_IsNotNull() { regSetitemflg(CK_ISNN, DOBJ); }

    protected void regSetitemflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSetitemflg(), "SETITEMFLG"); }
    protected abstract ConditionValue xgetCValueSetitemflg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NAME: {varchar(255)}
     * @param name The value of name as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setName_Equal(String name) {
        doSetName_Equal(fRES(name));
    }

    protected void doSetName_Equal(String name) {
        regName(CK_EQ, name);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NAME: {varchar(255)}
     * @param name The value of name as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setName_NotEqual(String name) {
        doSetName_NotEqual(fRES(name));
    }

    protected void doSetName_NotEqual(String name) {
        regName(CK_NES, name);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NAME: {varchar(255)}
     * @param name The value of name as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setName_GreaterThan(String name) {
        regName(CK_GT, fRES(name));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NAME: {varchar(255)}
     * @param name The value of name as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setName_LessThan(String name) {
        regName(CK_LT, fRES(name));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NAME: {varchar(255)}
     * @param name The value of name as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setName_GreaterEqual(String name) {
        regName(CK_GE, fRES(name));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NAME: {varchar(255)}
     * @param name The value of name as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setName_LessEqual(String name) {
        regName(CK_LE, fRES(name));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NAME: {varchar(255)}
     * @param nameList The collection of name as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setName_InScope(Collection<String> nameList) {
        doSetName_InScope(nameList);
    }

    protected void doSetName_InScope(Collection<String> nameList) {
        regINS(CK_INS, cTL(nameList), xgetCValueName(), "NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NAME: {varchar(255)}
     * @param nameList The collection of name as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setName_NotInScope(Collection<String> nameList) {
        doSetName_NotInScope(nameList);
    }

    protected void doSetName_NotInScope(Collection<String> nameList) {
        regINS(CK_NINS, cTL(nameList), xgetCValueName(), "NAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NAME: {varchar(255)} <br>
     * <pre>e.g. setName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param name The value of name as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setName_LikeSearch(String name, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(name), xgetCValueName(), "NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NAME: {varchar(255)}
     * @param name The value of name as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setName_NotLikeSearch(String name, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(name), xgetCValueName(), "NAME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NAME: {varchar(255)}
     * @param name The value of name as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setName_PrefixSearch(String name) {
        setName_LikeSearch(name, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * NAME: {varchar(255)}
     */
    public void setName_IsNull() { regName(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * NAME: {varchar(255)}
     */
    public void setName_IsNullOrEmpty() { regName(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * NAME: {varchar(255)}
     */
    public void setName_IsNotNull() { regName(CK_ISNN, DOBJ); }

    protected void regName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueName(), "NAME"); }
    protected abstract ConditionValue xgetCValueName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SNAME: {varchar(100)}
     * @param sname The value of sname as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSname_Equal(String sname) {
        doSetSname_Equal(fRES(sname));
    }

    protected void doSetSname_Equal(String sname) {
        regSname(CK_EQ, sname);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SNAME: {varchar(100)}
     * @param sname The value of sname as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSname_NotEqual(String sname) {
        doSetSname_NotEqual(fRES(sname));
    }

    protected void doSetSname_NotEqual(String sname) {
        regSname(CK_NES, sname);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SNAME: {varchar(100)}
     * @param sname The value of sname as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSname_GreaterThan(String sname) {
        regSname(CK_GT, fRES(sname));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SNAME: {varchar(100)}
     * @param sname The value of sname as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSname_LessThan(String sname) {
        regSname(CK_LT, fRES(sname));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SNAME: {varchar(100)}
     * @param sname The value of sname as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSname_GreaterEqual(String sname) {
        regSname(CK_GE, fRES(sname));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SNAME: {varchar(100)}
     * @param sname The value of sname as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSname_LessEqual(String sname) {
        regSname(CK_LE, fRES(sname));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SNAME: {varchar(100)}
     * @param snameList The collection of sname as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSname_InScope(Collection<String> snameList) {
        doSetSname_InScope(snameList);
    }

    protected void doSetSname_InScope(Collection<String> snameList) {
        regINS(CK_INS, cTL(snameList), xgetCValueSname(), "SNAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SNAME: {varchar(100)}
     * @param snameList The collection of sname as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSname_NotInScope(Collection<String> snameList) {
        doSetSname_NotInScope(snameList);
    }

    protected void doSetSname_NotInScope(Collection<String> snameList) {
        regINS(CK_NINS, cTL(snameList), xgetCValueSname(), "SNAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SNAME: {varchar(100)} <br>
     * <pre>e.g. setSname_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sname The value of sname as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSname_LikeSearch(String sname, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sname), xgetCValueSname(), "SNAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SNAME: {varchar(100)}
     * @param sname The value of sname as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSname_NotLikeSearch(String sname, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sname), xgetCValueSname(), "SNAME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SNAME: {varchar(100)}
     * @param sname The value of sname as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSname_PrefixSearch(String sname) {
        setSname_LikeSearch(sname, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SNAME: {varchar(100)}
     */
    public void setSname_IsNull() { regSname(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SNAME: {varchar(100)}
     */
    public void setSname_IsNullOrEmpty() { regSname(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SNAME: {varchar(100)}
     */
    public void setSname_IsNotNull() { regSname(CK_ISNN, DOBJ); }

    protected void regSname(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSname(), "SNAME"); }
    protected abstract ConditionValue xgetCValueSname();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ANAME: {varchar(100)}
     * @param aname The value of aname as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAname_Equal(String aname) {
        doSetAname_Equal(fRES(aname));
    }

    protected void doSetAname_Equal(String aname) {
        regAname(CK_EQ, aname);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ANAME: {varchar(100)}
     * @param aname The value of aname as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAname_NotEqual(String aname) {
        doSetAname_NotEqual(fRES(aname));
    }

    protected void doSetAname_NotEqual(String aname) {
        regAname(CK_NES, aname);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ANAME: {varchar(100)}
     * @param aname The value of aname as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAname_GreaterThan(String aname) {
        regAname(CK_GT, fRES(aname));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ANAME: {varchar(100)}
     * @param aname The value of aname as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAname_LessThan(String aname) {
        regAname(CK_LT, fRES(aname));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ANAME: {varchar(100)}
     * @param aname The value of aname as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAname_GreaterEqual(String aname) {
        regAname(CK_GE, fRES(aname));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ANAME: {varchar(100)}
     * @param aname The value of aname as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAname_LessEqual(String aname) {
        regAname(CK_LE, fRES(aname));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ANAME: {varchar(100)}
     * @param anameList The collection of aname as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAname_InScope(Collection<String> anameList) {
        doSetAname_InScope(anameList);
    }

    protected void doSetAname_InScope(Collection<String> anameList) {
        regINS(CK_INS, cTL(anameList), xgetCValueAname(), "ANAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ANAME: {varchar(100)}
     * @param anameList The collection of aname as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAname_NotInScope(Collection<String> anameList) {
        doSetAname_NotInScope(anameList);
    }

    protected void doSetAname_NotInScope(Collection<String> anameList) {
        regINS(CK_NINS, cTL(anameList), xgetCValueAname(), "ANAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ANAME: {varchar(100)} <br>
     * <pre>e.g. setAname_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param aname The value of aname as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAname_LikeSearch(String aname, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(aname), xgetCValueAname(), "ANAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ANAME: {varchar(100)}
     * @param aname The value of aname as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setAname_NotLikeSearch(String aname, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(aname), xgetCValueAname(), "ANAME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ANAME: {varchar(100)}
     * @param aname The value of aname as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAname_PrefixSearch(String aname) {
        setAname_LikeSearch(aname, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ANAME: {varchar(100)}
     */
    public void setAname_IsNull() { regAname(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ANAME: {varchar(100)}
     */
    public void setAname_IsNullOrEmpty() { regAname(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ANAME: {varchar(100)}
     */
    public void setAname_IsNotNull() { regAname(CK_ISNN, DOBJ); }

    protected void regAname(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAname(), "ANAME"); }
    protected abstract ConditionValue xgetCValueAname();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWNERITEMCD: {varchar(30)}
     * @param owneritemcd The value of owneritemcd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwneritemcd_Equal(String owneritemcd) {
        doSetOwneritemcd_Equal(fRES(owneritemcd));
    }

    protected void doSetOwneritemcd_Equal(String owneritemcd) {
        regOwneritemcd(CK_EQ, owneritemcd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWNERITEMCD: {varchar(30)}
     * @param owneritemcd The value of owneritemcd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwneritemcd_NotEqual(String owneritemcd) {
        doSetOwneritemcd_NotEqual(fRES(owneritemcd));
    }

    protected void doSetOwneritemcd_NotEqual(String owneritemcd) {
        regOwneritemcd(CK_NES, owneritemcd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWNERITEMCD: {varchar(30)}
     * @param owneritemcd The value of owneritemcd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwneritemcd_GreaterThan(String owneritemcd) {
        regOwneritemcd(CK_GT, fRES(owneritemcd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWNERITEMCD: {varchar(30)}
     * @param owneritemcd The value of owneritemcd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwneritemcd_LessThan(String owneritemcd) {
        regOwneritemcd(CK_LT, fRES(owneritemcd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWNERITEMCD: {varchar(30)}
     * @param owneritemcd The value of owneritemcd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwneritemcd_GreaterEqual(String owneritemcd) {
        regOwneritemcd(CK_GE, fRES(owneritemcd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWNERITEMCD: {varchar(30)}
     * @param owneritemcd The value of owneritemcd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwneritemcd_LessEqual(String owneritemcd) {
        regOwneritemcd(CK_LE, fRES(owneritemcd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OWNERITEMCD: {varchar(30)}
     * @param owneritemcdList The collection of owneritemcd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwneritemcd_InScope(Collection<String> owneritemcdList) {
        doSetOwneritemcd_InScope(owneritemcdList);
    }

    protected void doSetOwneritemcd_InScope(Collection<String> owneritemcdList) {
        regINS(CK_INS, cTL(owneritemcdList), xgetCValueOwneritemcd(), "OWNERITEMCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OWNERITEMCD: {varchar(30)}
     * @param owneritemcdList The collection of owneritemcd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwneritemcd_NotInScope(Collection<String> owneritemcdList) {
        doSetOwneritemcd_NotInScope(owneritemcdList);
    }

    protected void doSetOwneritemcd_NotInScope(Collection<String> owneritemcdList) {
        regINS(CK_NINS, cTL(owneritemcdList), xgetCValueOwneritemcd(), "OWNERITEMCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OWNERITEMCD: {varchar(30)} <br>
     * <pre>e.g. setOwneritemcd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param owneritemcd The value of owneritemcd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOwneritemcd_LikeSearch(String owneritemcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(owneritemcd), xgetCValueOwneritemcd(), "OWNERITEMCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OWNERITEMCD: {varchar(30)}
     * @param owneritemcd The value of owneritemcd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOwneritemcd_NotLikeSearch(String owneritemcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(owneritemcd), xgetCValueOwneritemcd(), "OWNERITEMCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OWNERITEMCD: {varchar(30)}
     * @param owneritemcd The value of owneritemcd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwneritemcd_PrefixSearch(String owneritemcd) {
        setOwneritemcd_LikeSearch(owneritemcd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * OWNERITEMCD: {varchar(30)}
     */
    public void setOwneritemcd_IsNull() { regOwneritemcd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * OWNERITEMCD: {varchar(30)}
     */
    public void setOwneritemcd_IsNullOrEmpty() { regOwneritemcd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * OWNERITEMCD: {varchar(30)}
     */
    public void setOwneritemcd_IsNotNull() { regOwneritemcd(CK_ISNN, DOBJ); }

    protected void regOwneritemcd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOwneritemcd(), "OWNERITEMCD"); }
    protected abstract ConditionValue xgetCValueOwneritemcd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLIERITEMCD: {varchar(30)}
     * @param supplieritemcd The value of supplieritemcd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplieritemcd_Equal(String supplieritemcd) {
        doSetSupplieritemcd_Equal(fRES(supplieritemcd));
    }

    protected void doSetSupplieritemcd_Equal(String supplieritemcd) {
        regSupplieritemcd(CK_EQ, supplieritemcd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLIERITEMCD: {varchar(30)}
     * @param supplieritemcd The value of supplieritemcd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplieritemcd_NotEqual(String supplieritemcd) {
        doSetSupplieritemcd_NotEqual(fRES(supplieritemcd));
    }

    protected void doSetSupplieritemcd_NotEqual(String supplieritemcd) {
        regSupplieritemcd(CK_NES, supplieritemcd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLIERITEMCD: {varchar(30)}
     * @param supplieritemcd The value of supplieritemcd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplieritemcd_GreaterThan(String supplieritemcd) {
        regSupplieritemcd(CK_GT, fRES(supplieritemcd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLIERITEMCD: {varchar(30)}
     * @param supplieritemcd The value of supplieritemcd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplieritemcd_LessThan(String supplieritemcd) {
        regSupplieritemcd(CK_LT, fRES(supplieritemcd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLIERITEMCD: {varchar(30)}
     * @param supplieritemcd The value of supplieritemcd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplieritemcd_GreaterEqual(String supplieritemcd) {
        regSupplieritemcd(CK_GE, fRES(supplieritemcd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLIERITEMCD: {varchar(30)}
     * @param supplieritemcd The value of supplieritemcd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplieritemcd_LessEqual(String supplieritemcd) {
        regSupplieritemcd(CK_LE, fRES(supplieritemcd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SUPPLIERITEMCD: {varchar(30)}
     * @param supplieritemcdList The collection of supplieritemcd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplieritemcd_InScope(Collection<String> supplieritemcdList) {
        doSetSupplieritemcd_InScope(supplieritemcdList);
    }

    protected void doSetSupplieritemcd_InScope(Collection<String> supplieritemcdList) {
        regINS(CK_INS, cTL(supplieritemcdList), xgetCValueSupplieritemcd(), "SUPPLIERITEMCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SUPPLIERITEMCD: {varchar(30)}
     * @param supplieritemcdList The collection of supplieritemcd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplieritemcd_NotInScope(Collection<String> supplieritemcdList) {
        doSetSupplieritemcd_NotInScope(supplieritemcdList);
    }

    protected void doSetSupplieritemcd_NotInScope(Collection<String> supplieritemcdList) {
        regINS(CK_NINS, cTL(supplieritemcdList), xgetCValueSupplieritemcd(), "SUPPLIERITEMCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SUPPLIERITEMCD: {varchar(30)} <br>
     * <pre>e.g. setSupplieritemcd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param supplieritemcd The value of supplieritemcd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSupplieritemcd_LikeSearch(String supplieritemcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(supplieritemcd), xgetCValueSupplieritemcd(), "SUPPLIERITEMCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SUPPLIERITEMCD: {varchar(30)}
     * @param supplieritemcd The value of supplieritemcd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSupplieritemcd_NotLikeSearch(String supplieritemcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(supplieritemcd), xgetCValueSupplieritemcd(), "SUPPLIERITEMCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SUPPLIERITEMCD: {varchar(30)}
     * @param supplieritemcd The value of supplieritemcd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplieritemcd_PrefixSearch(String supplieritemcd) {
        setSupplieritemcd_LikeSearch(supplieritemcd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SUPPLIERITEMCD: {varchar(30)}
     */
    public void setSupplieritemcd_IsNull() { regSupplieritemcd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SUPPLIERITEMCD: {varchar(30)}
     */
    public void setSupplieritemcd_IsNullOrEmpty() { regSupplieritemcd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SUPPLIERITEMCD: {varchar(30)}
     */
    public void setSupplieritemcd_IsNotNull() { regSupplieritemcd(CK_ISNN, DOBJ); }

    protected void regSupplieritemcd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSupplieritemcd(), "SUPPLIERITEMCD"); }
    protected abstract ConditionValue xgetCValueSupplieritemcd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * POSITEMCD: {varchar(30)}
     * @param positemcd The value of positemcd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPositemcd_Equal(String positemcd) {
        doSetPositemcd_Equal(fRES(positemcd));
    }

    protected void doSetPositemcd_Equal(String positemcd) {
        regPositemcd(CK_EQ, positemcd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * POSITEMCD: {varchar(30)}
     * @param positemcd The value of positemcd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPositemcd_NotEqual(String positemcd) {
        doSetPositemcd_NotEqual(fRES(positemcd));
    }

    protected void doSetPositemcd_NotEqual(String positemcd) {
        regPositemcd(CK_NES, positemcd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * POSITEMCD: {varchar(30)}
     * @param positemcd The value of positemcd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPositemcd_GreaterThan(String positemcd) {
        regPositemcd(CK_GT, fRES(positemcd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * POSITEMCD: {varchar(30)}
     * @param positemcd The value of positemcd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPositemcd_LessThan(String positemcd) {
        regPositemcd(CK_LT, fRES(positemcd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * POSITEMCD: {varchar(30)}
     * @param positemcd The value of positemcd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPositemcd_GreaterEqual(String positemcd) {
        regPositemcd(CK_GE, fRES(positemcd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * POSITEMCD: {varchar(30)}
     * @param positemcd The value of positemcd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPositemcd_LessEqual(String positemcd) {
        regPositemcd(CK_LE, fRES(positemcd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * POSITEMCD: {varchar(30)}
     * @param positemcdList The collection of positemcd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPositemcd_InScope(Collection<String> positemcdList) {
        doSetPositemcd_InScope(positemcdList);
    }

    protected void doSetPositemcd_InScope(Collection<String> positemcdList) {
        regINS(CK_INS, cTL(positemcdList), xgetCValuePositemcd(), "POSITEMCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * POSITEMCD: {varchar(30)}
     * @param positemcdList The collection of positemcd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPositemcd_NotInScope(Collection<String> positemcdList) {
        doSetPositemcd_NotInScope(positemcdList);
    }

    protected void doSetPositemcd_NotInScope(Collection<String> positemcdList) {
        regINS(CK_NINS, cTL(positemcdList), xgetCValuePositemcd(), "POSITEMCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * POSITEMCD: {varchar(30)} <br>
     * <pre>e.g. setPositemcd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param positemcd The value of positemcd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPositemcd_LikeSearch(String positemcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(positemcd), xgetCValuePositemcd(), "POSITEMCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * POSITEMCD: {varchar(30)}
     * @param positemcd The value of positemcd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPositemcd_NotLikeSearch(String positemcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(positemcd), xgetCValuePositemcd(), "POSITEMCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * POSITEMCD: {varchar(30)}
     * @param positemcd The value of positemcd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPositemcd_PrefixSearch(String positemcd) {
        setPositemcd_LikeSearch(positemcd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * POSITEMCD: {varchar(30)}
     */
    public void setPositemcd_IsNull() { regPositemcd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * POSITEMCD: {varchar(30)}
     */
    public void setPositemcd_IsNullOrEmpty() { regPositemcd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * POSITEMCD: {varchar(30)}
     */
    public void setPositemcd_IsNotNull() { regPositemcd(CK_ISNN, DOBJ); }

    protected void regPositemcd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePositemcd(), "POSITEMCD"); }
    protected abstract ConditionValue xgetCValuePositemcd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITFCD: {varchar(30)}
     * @param itfcd The value of itfcd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItfcd_Equal(String itfcd) {
        doSetItfcd_Equal(fRES(itfcd));
    }

    protected void doSetItfcd_Equal(String itfcd) {
        regItfcd(CK_EQ, itfcd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITFCD: {varchar(30)}
     * @param itfcd The value of itfcd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItfcd_NotEqual(String itfcd) {
        doSetItfcd_NotEqual(fRES(itfcd));
    }

    protected void doSetItfcd_NotEqual(String itfcd) {
        regItfcd(CK_NES, itfcd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITFCD: {varchar(30)}
     * @param itfcd The value of itfcd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItfcd_GreaterThan(String itfcd) {
        regItfcd(CK_GT, fRES(itfcd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITFCD: {varchar(30)}
     * @param itfcd The value of itfcd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItfcd_LessThan(String itfcd) {
        regItfcd(CK_LT, fRES(itfcd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITFCD: {varchar(30)}
     * @param itfcd The value of itfcd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItfcd_GreaterEqual(String itfcd) {
        regItfcd(CK_GE, fRES(itfcd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITFCD: {varchar(30)}
     * @param itfcd The value of itfcd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItfcd_LessEqual(String itfcd) {
        regItfcd(CK_LE, fRES(itfcd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ITFCD: {varchar(30)}
     * @param itfcdList The collection of itfcd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItfcd_InScope(Collection<String> itfcdList) {
        doSetItfcd_InScope(itfcdList);
    }

    protected void doSetItfcd_InScope(Collection<String> itfcdList) {
        regINS(CK_INS, cTL(itfcdList), xgetCValueItfcd(), "ITFCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ITFCD: {varchar(30)}
     * @param itfcdList The collection of itfcd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItfcd_NotInScope(Collection<String> itfcdList) {
        doSetItfcd_NotInScope(itfcdList);
    }

    protected void doSetItfcd_NotInScope(Collection<String> itfcdList) {
        regINS(CK_NINS, cTL(itfcdList), xgetCValueItfcd(), "ITFCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITFCD: {varchar(30)} <br>
     * <pre>e.g. setItfcd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param itfcd The value of itfcd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setItfcd_LikeSearch(String itfcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(itfcd), xgetCValueItfcd(), "ITFCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITFCD: {varchar(30)}
     * @param itfcd The value of itfcd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setItfcd_NotLikeSearch(String itfcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(itfcd), xgetCValueItfcd(), "ITFCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITFCD: {varchar(30)}
     * @param itfcd The value of itfcd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItfcd_PrefixSearch(String itfcd) {
        setItfcd_LikeSearch(itfcd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ITFCD: {varchar(30)}
     */
    public void setItfcd_IsNull() { regItfcd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ITFCD: {varchar(30)}
     */
    public void setItfcd_IsNullOrEmpty() { regItfcd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ITFCD: {varchar(30)}
     */
    public void setItfcd_IsNotNull() { regItfcd(CK_ISNN, DOBJ); }

    protected void regItfcd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueItfcd(), "ITFCD"); }
    protected abstract ConditionValue xgetCValueItfcd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MANUITEMCD: {varchar(30)}
     * @param manuitemcd The value of manuitemcd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManuitemcd_Equal(String manuitemcd) {
        doSetManuitemcd_Equal(fRES(manuitemcd));
    }

    protected void doSetManuitemcd_Equal(String manuitemcd) {
        regManuitemcd(CK_EQ, manuitemcd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MANUITEMCD: {varchar(30)}
     * @param manuitemcd The value of manuitemcd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManuitemcd_NotEqual(String manuitemcd) {
        doSetManuitemcd_NotEqual(fRES(manuitemcd));
    }

    protected void doSetManuitemcd_NotEqual(String manuitemcd) {
        regManuitemcd(CK_NES, manuitemcd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MANUITEMCD: {varchar(30)}
     * @param manuitemcd The value of manuitemcd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManuitemcd_GreaterThan(String manuitemcd) {
        regManuitemcd(CK_GT, fRES(manuitemcd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MANUITEMCD: {varchar(30)}
     * @param manuitemcd The value of manuitemcd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManuitemcd_LessThan(String manuitemcd) {
        regManuitemcd(CK_LT, fRES(manuitemcd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MANUITEMCD: {varchar(30)}
     * @param manuitemcd The value of manuitemcd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManuitemcd_GreaterEqual(String manuitemcd) {
        regManuitemcd(CK_GE, fRES(manuitemcd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MANUITEMCD: {varchar(30)}
     * @param manuitemcd The value of manuitemcd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManuitemcd_LessEqual(String manuitemcd) {
        regManuitemcd(CK_LE, fRES(manuitemcd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MANUITEMCD: {varchar(30)}
     * @param manuitemcdList The collection of manuitemcd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManuitemcd_InScope(Collection<String> manuitemcdList) {
        doSetManuitemcd_InScope(manuitemcdList);
    }

    protected void doSetManuitemcd_InScope(Collection<String> manuitemcdList) {
        regINS(CK_INS, cTL(manuitemcdList), xgetCValueManuitemcd(), "MANUITEMCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MANUITEMCD: {varchar(30)}
     * @param manuitemcdList The collection of manuitemcd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManuitemcd_NotInScope(Collection<String> manuitemcdList) {
        doSetManuitemcd_NotInScope(manuitemcdList);
    }

    protected void doSetManuitemcd_NotInScope(Collection<String> manuitemcdList) {
        regINS(CK_NINS, cTL(manuitemcdList), xgetCValueManuitemcd(), "MANUITEMCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MANUITEMCD: {varchar(30)} <br>
     * <pre>e.g. setManuitemcd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param manuitemcd The value of manuitemcd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setManuitemcd_LikeSearch(String manuitemcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(manuitemcd), xgetCValueManuitemcd(), "MANUITEMCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MANUITEMCD: {varchar(30)}
     * @param manuitemcd The value of manuitemcd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setManuitemcd_NotLikeSearch(String manuitemcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(manuitemcd), xgetCValueManuitemcd(), "MANUITEMCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MANUITEMCD: {varchar(30)}
     * @param manuitemcd The value of manuitemcd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManuitemcd_PrefixSearch(String manuitemcd) {
        setManuitemcd_LikeSearch(manuitemcd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MANUITEMCD: {varchar(30)}
     */
    public void setManuitemcd_IsNull() { regManuitemcd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * MANUITEMCD: {varchar(30)}
     */
    public void setManuitemcd_IsNullOrEmpty() { regManuitemcd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MANUITEMCD: {varchar(30)}
     */
    public void setManuitemcd_IsNotNull() { regManuitemcd(CK_ISNN, DOBJ); }

    protected void regManuitemcd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueManuitemcd(), "MANUITEMCD"); }
    protected abstract ConditionValue xgetCValueManuitemcd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRICE_BUY: {varchar(30)}
     * @param priceBuy The value of priceBuy as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPriceBuy_Equal(String priceBuy) {
        doSetPriceBuy_Equal(fRES(priceBuy));
    }

    protected void doSetPriceBuy_Equal(String priceBuy) {
        regPriceBuy(CK_EQ, priceBuy);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRICE_BUY: {varchar(30)}
     * @param priceBuy The value of priceBuy as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPriceBuy_NotEqual(String priceBuy) {
        doSetPriceBuy_NotEqual(fRES(priceBuy));
    }

    protected void doSetPriceBuy_NotEqual(String priceBuy) {
        regPriceBuy(CK_NES, priceBuy);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRICE_BUY: {varchar(30)}
     * @param priceBuy The value of priceBuy as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPriceBuy_GreaterThan(String priceBuy) {
        regPriceBuy(CK_GT, fRES(priceBuy));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRICE_BUY: {varchar(30)}
     * @param priceBuy The value of priceBuy as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPriceBuy_LessThan(String priceBuy) {
        regPriceBuy(CK_LT, fRES(priceBuy));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRICE_BUY: {varchar(30)}
     * @param priceBuy The value of priceBuy as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPriceBuy_GreaterEqual(String priceBuy) {
        regPriceBuy(CK_GE, fRES(priceBuy));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRICE_BUY: {varchar(30)}
     * @param priceBuy The value of priceBuy as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPriceBuy_LessEqual(String priceBuy) {
        regPriceBuy(CK_LE, fRES(priceBuy));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRICE_BUY: {varchar(30)}
     * @param priceBuyList The collection of priceBuy as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPriceBuy_InScope(Collection<String> priceBuyList) {
        doSetPriceBuy_InScope(priceBuyList);
    }

    protected void doSetPriceBuy_InScope(Collection<String> priceBuyList) {
        regINS(CK_INS, cTL(priceBuyList), xgetCValuePriceBuy(), "PRICE_BUY");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRICE_BUY: {varchar(30)}
     * @param priceBuyList The collection of priceBuy as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPriceBuy_NotInScope(Collection<String> priceBuyList) {
        doSetPriceBuy_NotInScope(priceBuyList);
    }

    protected void doSetPriceBuy_NotInScope(Collection<String> priceBuyList) {
        regINS(CK_NINS, cTL(priceBuyList), xgetCValuePriceBuy(), "PRICE_BUY");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRICE_BUY: {varchar(30)} <br>
     * <pre>e.g. setPriceBuy_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param priceBuy The value of priceBuy as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPriceBuy_LikeSearch(String priceBuy, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(priceBuy), xgetCValuePriceBuy(), "PRICE_BUY", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRICE_BUY: {varchar(30)}
     * @param priceBuy The value of priceBuy as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPriceBuy_NotLikeSearch(String priceBuy, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(priceBuy), xgetCValuePriceBuy(), "PRICE_BUY", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRICE_BUY: {varchar(30)}
     * @param priceBuy The value of priceBuy as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPriceBuy_PrefixSearch(String priceBuy) {
        setPriceBuy_LikeSearch(priceBuy, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PRICE_BUY: {varchar(30)}
     */
    public void setPriceBuy_IsNull() { regPriceBuy(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PRICE_BUY: {varchar(30)}
     */
    public void setPriceBuy_IsNullOrEmpty() { regPriceBuy(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PRICE_BUY: {varchar(30)}
     */
    public void setPriceBuy_IsNotNull() { regPriceBuy(CK_ISNN, DOBJ); }

    protected void regPriceBuy(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePriceBuy(), "PRICE_BUY"); }
    protected abstract ConditionValue xgetCValuePriceBuy();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRICE_WHOLESALE: {varchar(30), default=[(0)]}
     * @param priceWholesale The value of priceWholesale as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPriceWholesale_Equal(String priceWholesale) {
        doSetPriceWholesale_Equal(fRES(priceWholesale));
    }

    protected void doSetPriceWholesale_Equal(String priceWholesale) {
        regPriceWholesale(CK_EQ, priceWholesale);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRICE_WHOLESALE: {varchar(30), default=[(0)]}
     * @param priceWholesale The value of priceWholesale as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPriceWholesale_NotEqual(String priceWholesale) {
        doSetPriceWholesale_NotEqual(fRES(priceWholesale));
    }

    protected void doSetPriceWholesale_NotEqual(String priceWholesale) {
        regPriceWholesale(CK_NES, priceWholesale);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRICE_WHOLESALE: {varchar(30), default=[(0)]}
     * @param priceWholesale The value of priceWholesale as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPriceWholesale_GreaterThan(String priceWholesale) {
        regPriceWholesale(CK_GT, fRES(priceWholesale));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRICE_WHOLESALE: {varchar(30), default=[(0)]}
     * @param priceWholesale The value of priceWholesale as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPriceWholesale_LessThan(String priceWholesale) {
        regPriceWholesale(CK_LT, fRES(priceWholesale));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRICE_WHOLESALE: {varchar(30), default=[(0)]}
     * @param priceWholesale The value of priceWholesale as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPriceWholesale_GreaterEqual(String priceWholesale) {
        regPriceWholesale(CK_GE, fRES(priceWholesale));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRICE_WHOLESALE: {varchar(30), default=[(0)]}
     * @param priceWholesale The value of priceWholesale as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPriceWholesale_LessEqual(String priceWholesale) {
        regPriceWholesale(CK_LE, fRES(priceWholesale));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRICE_WHOLESALE: {varchar(30), default=[(0)]}
     * @param priceWholesaleList The collection of priceWholesale as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPriceWholesale_InScope(Collection<String> priceWholesaleList) {
        doSetPriceWholesale_InScope(priceWholesaleList);
    }

    protected void doSetPriceWholesale_InScope(Collection<String> priceWholesaleList) {
        regINS(CK_INS, cTL(priceWholesaleList), xgetCValuePriceWholesale(), "PRICE_WHOLESALE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRICE_WHOLESALE: {varchar(30), default=[(0)]}
     * @param priceWholesaleList The collection of priceWholesale as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPriceWholesale_NotInScope(Collection<String> priceWholesaleList) {
        doSetPriceWholesale_NotInScope(priceWholesaleList);
    }

    protected void doSetPriceWholesale_NotInScope(Collection<String> priceWholesaleList) {
        regINS(CK_NINS, cTL(priceWholesaleList), xgetCValuePriceWholesale(), "PRICE_WHOLESALE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRICE_WHOLESALE: {varchar(30), default=[(0)]} <br>
     * <pre>e.g. setPriceWholesale_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param priceWholesale The value of priceWholesale as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPriceWholesale_LikeSearch(String priceWholesale, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(priceWholesale), xgetCValuePriceWholesale(), "PRICE_WHOLESALE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRICE_WHOLESALE: {varchar(30), default=[(0)]}
     * @param priceWholesale The value of priceWholesale as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPriceWholesale_NotLikeSearch(String priceWholesale, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(priceWholesale), xgetCValuePriceWholesale(), "PRICE_WHOLESALE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRICE_WHOLESALE: {varchar(30), default=[(0)]}
     * @param priceWholesale The value of priceWholesale as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPriceWholesale_PrefixSearch(String priceWholesale) {
        setPriceWholesale_LikeSearch(priceWholesale, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PRICE_WHOLESALE: {varchar(30), default=[(0)]}
     */
    public void setPriceWholesale_IsNull() { regPriceWholesale(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PRICE_WHOLESALE: {varchar(30), default=[(0)]}
     */
    public void setPriceWholesale_IsNullOrEmpty() { regPriceWholesale(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PRICE_WHOLESALE: {varchar(30), default=[(0)]}
     */
    public void setPriceWholesale_IsNotNull() { regPriceWholesale(CK_ISNN, DOBJ); }

    protected void regPriceWholesale(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePriceWholesale(), "PRICE_WHOLESALE"); }
    protected abstract ConditionValue xgetCValuePriceWholesale();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRICE_SALE: {varchar(30), default=[(0)]}
     * @param priceSale The value of priceSale as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPriceSale_Equal(String priceSale) {
        doSetPriceSale_Equal(fRES(priceSale));
    }

    protected void doSetPriceSale_Equal(String priceSale) {
        regPriceSale(CK_EQ, priceSale);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRICE_SALE: {varchar(30), default=[(0)]}
     * @param priceSale The value of priceSale as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPriceSale_NotEqual(String priceSale) {
        doSetPriceSale_NotEqual(fRES(priceSale));
    }

    protected void doSetPriceSale_NotEqual(String priceSale) {
        regPriceSale(CK_NES, priceSale);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRICE_SALE: {varchar(30), default=[(0)]}
     * @param priceSale The value of priceSale as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPriceSale_GreaterThan(String priceSale) {
        regPriceSale(CK_GT, fRES(priceSale));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRICE_SALE: {varchar(30), default=[(0)]}
     * @param priceSale The value of priceSale as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPriceSale_LessThan(String priceSale) {
        regPriceSale(CK_LT, fRES(priceSale));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRICE_SALE: {varchar(30), default=[(0)]}
     * @param priceSale The value of priceSale as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPriceSale_GreaterEqual(String priceSale) {
        regPriceSale(CK_GE, fRES(priceSale));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRICE_SALE: {varchar(30), default=[(0)]}
     * @param priceSale The value of priceSale as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPriceSale_LessEqual(String priceSale) {
        regPriceSale(CK_LE, fRES(priceSale));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRICE_SALE: {varchar(30), default=[(0)]}
     * @param priceSaleList The collection of priceSale as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPriceSale_InScope(Collection<String> priceSaleList) {
        doSetPriceSale_InScope(priceSaleList);
    }

    protected void doSetPriceSale_InScope(Collection<String> priceSaleList) {
        regINS(CK_INS, cTL(priceSaleList), xgetCValuePriceSale(), "PRICE_SALE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRICE_SALE: {varchar(30), default=[(0)]}
     * @param priceSaleList The collection of priceSale as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPriceSale_NotInScope(Collection<String> priceSaleList) {
        doSetPriceSale_NotInScope(priceSaleList);
    }

    protected void doSetPriceSale_NotInScope(Collection<String> priceSaleList) {
        regINS(CK_NINS, cTL(priceSaleList), xgetCValuePriceSale(), "PRICE_SALE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRICE_SALE: {varchar(30), default=[(0)]} <br>
     * <pre>e.g. setPriceSale_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param priceSale The value of priceSale as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPriceSale_LikeSearch(String priceSale, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(priceSale), xgetCValuePriceSale(), "PRICE_SALE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRICE_SALE: {varchar(30), default=[(0)]}
     * @param priceSale The value of priceSale as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPriceSale_NotLikeSearch(String priceSale, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(priceSale), xgetCValuePriceSale(), "PRICE_SALE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRICE_SALE: {varchar(30), default=[(0)]}
     * @param priceSale The value of priceSale as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPriceSale_PrefixSearch(String priceSale) {
        setPriceSale_LikeSearch(priceSale, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PRICE_SALE: {varchar(30), default=[(0)]}
     */
    public void setPriceSale_IsNull() { regPriceSale(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PRICE_SALE: {varchar(30), default=[(0)]}
     */
    public void setPriceSale_IsNullOrEmpty() { regPriceSale(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PRICE_SALE: {varchar(30), default=[(0)]}
     */
    public void setPriceSale_IsNotNull() { regPriceSale(CK_ISNN, DOBJ); }

    protected void regPriceSale(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePriceSale(), "PRICE_SALE"); }
    protected abstract ConditionValue xgetCValuePriceSale();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ABCTYPE: {varchar(30)}
     * @param abctype The value of abctype as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAbctype_Equal(String abctype) {
        doSetAbctype_Equal(fRES(abctype));
    }

    protected void doSetAbctype_Equal(String abctype) {
        regAbctype(CK_EQ, abctype);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ABCTYPE: {varchar(30)}
     * @param abctype The value of abctype as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAbctype_NotEqual(String abctype) {
        doSetAbctype_NotEqual(fRES(abctype));
    }

    protected void doSetAbctype_NotEqual(String abctype) {
        regAbctype(CK_NES, abctype);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ABCTYPE: {varchar(30)}
     * @param abctype The value of abctype as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAbctype_GreaterThan(String abctype) {
        regAbctype(CK_GT, fRES(abctype));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ABCTYPE: {varchar(30)}
     * @param abctype The value of abctype as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAbctype_LessThan(String abctype) {
        regAbctype(CK_LT, fRES(abctype));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ABCTYPE: {varchar(30)}
     * @param abctype The value of abctype as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAbctype_GreaterEqual(String abctype) {
        regAbctype(CK_GE, fRES(abctype));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ABCTYPE: {varchar(30)}
     * @param abctype The value of abctype as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAbctype_LessEqual(String abctype) {
        regAbctype(CK_LE, fRES(abctype));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ABCTYPE: {varchar(30)}
     * @param abctypeList The collection of abctype as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAbctype_InScope(Collection<String> abctypeList) {
        doSetAbctype_InScope(abctypeList);
    }

    protected void doSetAbctype_InScope(Collection<String> abctypeList) {
        regINS(CK_INS, cTL(abctypeList), xgetCValueAbctype(), "ABCTYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ABCTYPE: {varchar(30)}
     * @param abctypeList The collection of abctype as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAbctype_NotInScope(Collection<String> abctypeList) {
        doSetAbctype_NotInScope(abctypeList);
    }

    protected void doSetAbctype_NotInScope(Collection<String> abctypeList) {
        regINS(CK_NINS, cTL(abctypeList), xgetCValueAbctype(), "ABCTYPE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ABCTYPE: {varchar(30)} <br>
     * <pre>e.g. setAbctype_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param abctype The value of abctype as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAbctype_LikeSearch(String abctype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(abctype), xgetCValueAbctype(), "ABCTYPE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ABCTYPE: {varchar(30)}
     * @param abctype The value of abctype as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setAbctype_NotLikeSearch(String abctype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(abctype), xgetCValueAbctype(), "ABCTYPE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ABCTYPE: {varchar(30)}
     * @param abctype The value of abctype as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAbctype_PrefixSearch(String abctype) {
        setAbctype_LikeSearch(abctype, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ABCTYPE: {varchar(30)}
     */
    public void setAbctype_IsNull() { regAbctype(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ABCTYPE: {varchar(30)}
     */
    public void setAbctype_IsNullOrEmpty() { regAbctype(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ABCTYPE: {varchar(30)}
     */
    public void setAbctype_IsNotNull() { regAbctype(CK_ISNN, DOBJ); }

    protected void regAbctype(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAbctype(), "ABCTYPE"); }
    protected abstract ConditionValue xgetCValueAbctype();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * QTY1TYPE: {char(1), default=[(0)]}
     * @param qty1type The value of qty1type as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQty1type_Equal(String qty1type) {
        doSetQty1type_Equal(fRES(qty1type));
    }

    protected void doSetQty1type_Equal(String qty1type) {
        regQty1type(CK_EQ, qty1type);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * QTY1TYPE: {char(1), default=[(0)]}
     * @param qty1type The value of qty1type as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQty1type_NotEqual(String qty1type) {
        doSetQty1type_NotEqual(fRES(qty1type));
    }

    protected void doSetQty1type_NotEqual(String qty1type) {
        regQty1type(CK_NES, qty1type);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * QTY1TYPE: {char(1), default=[(0)]}
     * @param qty1type The value of qty1type as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQty1type_GreaterThan(String qty1type) {
        regQty1type(CK_GT, fRES(qty1type));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * QTY1TYPE: {char(1), default=[(0)]}
     * @param qty1type The value of qty1type as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQty1type_LessThan(String qty1type) {
        regQty1type(CK_LT, fRES(qty1type));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * QTY1TYPE: {char(1), default=[(0)]}
     * @param qty1type The value of qty1type as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQty1type_GreaterEqual(String qty1type) {
        regQty1type(CK_GE, fRES(qty1type));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * QTY1TYPE: {char(1), default=[(0)]}
     * @param qty1type The value of qty1type as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQty1type_LessEqual(String qty1type) {
        regQty1type(CK_LE, fRES(qty1type));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * QTY1TYPE: {char(1), default=[(0)]}
     * @param qty1typeList The collection of qty1type as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQty1type_InScope(Collection<String> qty1typeList) {
        doSetQty1type_InScope(qty1typeList);
    }

    protected void doSetQty1type_InScope(Collection<String> qty1typeList) {
        regINS(CK_INS, cTL(qty1typeList), xgetCValueQty1type(), "QTY1TYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * QTY1TYPE: {char(1), default=[(0)]}
     * @param qty1typeList The collection of qty1type as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQty1type_NotInScope(Collection<String> qty1typeList) {
        doSetQty1type_NotInScope(qty1typeList);
    }

    protected void doSetQty1type_NotInScope(Collection<String> qty1typeList) {
        regINS(CK_NINS, cTL(qty1typeList), xgetCValueQty1type(), "QTY1TYPE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * QTY1TYPE: {char(1), default=[(0)]} <br>
     * <pre>e.g. setQty1type_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param qty1type The value of qty1type as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setQty1type_LikeSearch(String qty1type, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(qty1type), xgetCValueQty1type(), "QTY1TYPE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * QTY1TYPE: {char(1), default=[(0)]}
     * @param qty1type The value of qty1type as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setQty1type_NotLikeSearch(String qty1type, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(qty1type), xgetCValueQty1type(), "QTY1TYPE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * QTY1TYPE: {char(1), default=[(0)]}
     * @param qty1type The value of qty1type as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQty1type_PrefixSearch(String qty1type) {
        setQty1type_LikeSearch(qty1type, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * QTY1TYPE: {char(1), default=[(0)]}
     */
    public void setQty1type_IsNull() { regQty1type(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * QTY1TYPE: {char(1), default=[(0)]}
     */
    public void setQty1type_IsNotNull() { regQty1type(CK_ISNN, DOBJ); }

    protected void regQty1type(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueQty1type(), "QTY1TYPE"); }
    protected abstract ConditionValue xgetCValueQty1type();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UNIT1: {varchar(30), default=[(0)]}
     * @param unit1 The value of unit1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnit1_Equal(String unit1) {
        doSetUnit1_Equal(fRES(unit1));
    }

    protected void doSetUnit1_Equal(String unit1) {
        regUnit1(CK_EQ, unit1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UNIT1: {varchar(30), default=[(0)]}
     * @param unit1 The value of unit1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnit1_NotEqual(String unit1) {
        doSetUnit1_NotEqual(fRES(unit1));
    }

    protected void doSetUnit1_NotEqual(String unit1) {
        regUnit1(CK_NES, unit1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UNIT1: {varchar(30), default=[(0)]}
     * @param unit1 The value of unit1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnit1_GreaterThan(String unit1) {
        regUnit1(CK_GT, fRES(unit1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UNIT1: {varchar(30), default=[(0)]}
     * @param unit1 The value of unit1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnit1_LessThan(String unit1) {
        regUnit1(CK_LT, fRES(unit1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UNIT1: {varchar(30), default=[(0)]}
     * @param unit1 The value of unit1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnit1_GreaterEqual(String unit1) {
        regUnit1(CK_GE, fRES(unit1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UNIT1: {varchar(30), default=[(0)]}
     * @param unit1 The value of unit1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnit1_LessEqual(String unit1) {
        regUnit1(CK_LE, fRES(unit1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * UNIT1: {varchar(30), default=[(0)]}
     * @param unit1List The collection of unit1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnit1_InScope(Collection<String> unit1List) {
        doSetUnit1_InScope(unit1List);
    }

    protected void doSetUnit1_InScope(Collection<String> unit1List) {
        regINS(CK_INS, cTL(unit1List), xgetCValueUnit1(), "UNIT1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * UNIT1: {varchar(30), default=[(0)]}
     * @param unit1List The collection of unit1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnit1_NotInScope(Collection<String> unit1List) {
        doSetUnit1_NotInScope(unit1List);
    }

    protected void doSetUnit1_NotInScope(Collection<String> unit1List) {
        regINS(CK_NINS, cTL(unit1List), xgetCValueUnit1(), "UNIT1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UNIT1: {varchar(30), default=[(0)]} <br>
     * <pre>e.g. setUnit1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param unit1 The value of unit1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setUnit1_LikeSearch(String unit1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(unit1), xgetCValueUnit1(), "UNIT1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UNIT1: {varchar(30), default=[(0)]}
     * @param unit1 The value of unit1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setUnit1_NotLikeSearch(String unit1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(unit1), xgetCValueUnit1(), "UNIT1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UNIT1: {varchar(30), default=[(0)]}
     * @param unit1 The value of unit1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnit1_PrefixSearch(String unit1) {
        setUnit1_LikeSearch(unit1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * UNIT1: {varchar(30), default=[(0)]}
     */
    public void setUnit1_IsNull() { regUnit1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * UNIT1: {varchar(30), default=[(0)]}
     */
    public void setUnit1_IsNullOrEmpty() { regUnit1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * UNIT1: {varchar(30), default=[(0)]}
     */
    public void setUnit1_IsNotNull() { regUnit1(CK_ISNN, DOBJ); }

    protected void regUnit1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUnit1(), "UNIT1"); }
    protected abstract ConditionValue xgetCValueUnit1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UNIT1STYLE: {varchar(60)}
     * @param unit1style The value of unit1style as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnit1style_Equal(String unit1style) {
        doSetUnit1style_Equal(fRES(unit1style));
    }

    protected void doSetUnit1style_Equal(String unit1style) {
        regUnit1style(CK_EQ, unit1style);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UNIT1STYLE: {varchar(60)}
     * @param unit1style The value of unit1style as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnit1style_NotEqual(String unit1style) {
        doSetUnit1style_NotEqual(fRES(unit1style));
    }

    protected void doSetUnit1style_NotEqual(String unit1style) {
        regUnit1style(CK_NES, unit1style);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UNIT1STYLE: {varchar(60)}
     * @param unit1style The value of unit1style as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnit1style_GreaterThan(String unit1style) {
        regUnit1style(CK_GT, fRES(unit1style));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UNIT1STYLE: {varchar(60)}
     * @param unit1style The value of unit1style as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnit1style_LessThan(String unit1style) {
        regUnit1style(CK_LT, fRES(unit1style));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UNIT1STYLE: {varchar(60)}
     * @param unit1style The value of unit1style as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnit1style_GreaterEqual(String unit1style) {
        regUnit1style(CK_GE, fRES(unit1style));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UNIT1STYLE: {varchar(60)}
     * @param unit1style The value of unit1style as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnit1style_LessEqual(String unit1style) {
        regUnit1style(CK_LE, fRES(unit1style));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * UNIT1STYLE: {varchar(60)}
     * @param unit1styleList The collection of unit1style as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnit1style_InScope(Collection<String> unit1styleList) {
        doSetUnit1style_InScope(unit1styleList);
    }

    protected void doSetUnit1style_InScope(Collection<String> unit1styleList) {
        regINS(CK_INS, cTL(unit1styleList), xgetCValueUnit1style(), "UNIT1STYLE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * UNIT1STYLE: {varchar(60)}
     * @param unit1styleList The collection of unit1style as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnit1style_NotInScope(Collection<String> unit1styleList) {
        doSetUnit1style_NotInScope(unit1styleList);
    }

    protected void doSetUnit1style_NotInScope(Collection<String> unit1styleList) {
        regINS(CK_NINS, cTL(unit1styleList), xgetCValueUnit1style(), "UNIT1STYLE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UNIT1STYLE: {varchar(60)} <br>
     * <pre>e.g. setUnit1style_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param unit1style The value of unit1style as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setUnit1style_LikeSearch(String unit1style, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(unit1style), xgetCValueUnit1style(), "UNIT1STYLE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UNIT1STYLE: {varchar(60)}
     * @param unit1style The value of unit1style as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setUnit1style_NotLikeSearch(String unit1style, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(unit1style), xgetCValueUnit1style(), "UNIT1STYLE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UNIT1STYLE: {varchar(60)}
     * @param unit1style The value of unit1style as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnit1style_PrefixSearch(String unit1style) {
        setUnit1style_LikeSearch(unit1style, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * UNIT1STYLE: {varchar(60)}
     */
    public void setUnit1style_IsNull() { regUnit1style(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * UNIT1STYLE: {varchar(60)}
     */
    public void setUnit1style_IsNullOrEmpty() { regUnit1style(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * UNIT1STYLE: {varchar(60)}
     */
    public void setUnit1style_IsNotNull() { regUnit1style(CK_ISNN, DOBJ); }

    protected void regUnit1style(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUnit1style(), "UNIT1STYLE"); }
    protected abstract ConditionValue xgetCValueUnit1style();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LENGTH1: {varchar(30), default=[(0)]}
     * @param length1 The value of length1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLength1_Equal(String length1) {
        doSetLength1_Equal(fRES(length1));
    }

    protected void doSetLength1_Equal(String length1) {
        regLength1(CK_EQ, length1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LENGTH1: {varchar(30), default=[(0)]}
     * @param length1 The value of length1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLength1_NotEqual(String length1) {
        doSetLength1_NotEqual(fRES(length1));
    }

    protected void doSetLength1_NotEqual(String length1) {
        regLength1(CK_NES, length1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LENGTH1: {varchar(30), default=[(0)]}
     * @param length1 The value of length1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLength1_GreaterThan(String length1) {
        regLength1(CK_GT, fRES(length1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LENGTH1: {varchar(30), default=[(0)]}
     * @param length1 The value of length1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLength1_LessThan(String length1) {
        regLength1(CK_LT, fRES(length1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LENGTH1: {varchar(30), default=[(0)]}
     * @param length1 The value of length1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLength1_GreaterEqual(String length1) {
        regLength1(CK_GE, fRES(length1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LENGTH1: {varchar(30), default=[(0)]}
     * @param length1 The value of length1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLength1_LessEqual(String length1) {
        regLength1(CK_LE, fRES(length1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LENGTH1: {varchar(30), default=[(0)]}
     * @param length1List The collection of length1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLength1_InScope(Collection<String> length1List) {
        doSetLength1_InScope(length1List);
    }

    protected void doSetLength1_InScope(Collection<String> length1List) {
        regINS(CK_INS, cTL(length1List), xgetCValueLength1(), "LENGTH1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LENGTH1: {varchar(30), default=[(0)]}
     * @param length1List The collection of length1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLength1_NotInScope(Collection<String> length1List) {
        doSetLength1_NotInScope(length1List);
    }

    protected void doSetLength1_NotInScope(Collection<String> length1List) {
        regINS(CK_NINS, cTL(length1List), xgetCValueLength1(), "LENGTH1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LENGTH1: {varchar(30), default=[(0)]} <br>
     * <pre>e.g. setLength1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param length1 The value of length1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLength1_LikeSearch(String length1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(length1), xgetCValueLength1(), "LENGTH1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LENGTH1: {varchar(30), default=[(0)]}
     * @param length1 The value of length1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLength1_NotLikeSearch(String length1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(length1), xgetCValueLength1(), "LENGTH1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LENGTH1: {varchar(30), default=[(0)]}
     * @param length1 The value of length1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLength1_PrefixSearch(String length1) {
        setLength1_LikeSearch(length1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LENGTH1: {varchar(30), default=[(0)]}
     */
    public void setLength1_IsNull() { regLength1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LENGTH1: {varchar(30), default=[(0)]}
     */
    public void setLength1_IsNullOrEmpty() { regLength1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LENGTH1: {varchar(30), default=[(0)]}
     */
    public void setLength1_IsNotNull() { regLength1(CK_ISNN, DOBJ); }

    protected void regLength1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLength1(), "LENGTH1"); }
    protected abstract ConditionValue xgetCValueLength1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WIDTH1: {varchar(30), default=[(0)]}
     * @param width1 The value of width1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWidth1_Equal(String width1) {
        doSetWidth1_Equal(fRES(width1));
    }

    protected void doSetWidth1_Equal(String width1) {
        regWidth1(CK_EQ, width1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WIDTH1: {varchar(30), default=[(0)]}
     * @param width1 The value of width1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWidth1_NotEqual(String width1) {
        doSetWidth1_NotEqual(fRES(width1));
    }

    protected void doSetWidth1_NotEqual(String width1) {
        regWidth1(CK_NES, width1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WIDTH1: {varchar(30), default=[(0)]}
     * @param width1 The value of width1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWidth1_GreaterThan(String width1) {
        regWidth1(CK_GT, fRES(width1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WIDTH1: {varchar(30), default=[(0)]}
     * @param width1 The value of width1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWidth1_LessThan(String width1) {
        regWidth1(CK_LT, fRES(width1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WIDTH1: {varchar(30), default=[(0)]}
     * @param width1 The value of width1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWidth1_GreaterEqual(String width1) {
        regWidth1(CK_GE, fRES(width1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WIDTH1: {varchar(30), default=[(0)]}
     * @param width1 The value of width1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWidth1_LessEqual(String width1) {
        regWidth1(CK_LE, fRES(width1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WIDTH1: {varchar(30), default=[(0)]}
     * @param width1List The collection of width1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWidth1_InScope(Collection<String> width1List) {
        doSetWidth1_InScope(width1List);
    }

    protected void doSetWidth1_InScope(Collection<String> width1List) {
        regINS(CK_INS, cTL(width1List), xgetCValueWidth1(), "WIDTH1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WIDTH1: {varchar(30), default=[(0)]}
     * @param width1List The collection of width1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWidth1_NotInScope(Collection<String> width1List) {
        doSetWidth1_NotInScope(width1List);
    }

    protected void doSetWidth1_NotInScope(Collection<String> width1List) {
        regINS(CK_NINS, cTL(width1List), xgetCValueWidth1(), "WIDTH1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WIDTH1: {varchar(30), default=[(0)]} <br>
     * <pre>e.g. setWidth1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param width1 The value of width1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setWidth1_LikeSearch(String width1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(width1), xgetCValueWidth1(), "WIDTH1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WIDTH1: {varchar(30), default=[(0)]}
     * @param width1 The value of width1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setWidth1_NotLikeSearch(String width1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(width1), xgetCValueWidth1(), "WIDTH1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WIDTH1: {varchar(30), default=[(0)]}
     * @param width1 The value of width1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWidth1_PrefixSearch(String width1) {
        setWidth1_LikeSearch(width1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * WIDTH1: {varchar(30), default=[(0)]}
     */
    public void setWidth1_IsNull() { regWidth1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * WIDTH1: {varchar(30), default=[(0)]}
     */
    public void setWidth1_IsNullOrEmpty() { regWidth1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * WIDTH1: {varchar(30), default=[(0)]}
     */
    public void setWidth1_IsNotNull() { regWidth1(CK_ISNN, DOBJ); }

    protected void regWidth1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWidth1(), "WIDTH1"); }
    protected abstract ConditionValue xgetCValueWidth1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HEIGHT1: {varchar(30), default=[(0)]}
     * @param height1 The value of height1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHeight1_Equal(String height1) {
        doSetHeight1_Equal(fRES(height1));
    }

    protected void doSetHeight1_Equal(String height1) {
        regHeight1(CK_EQ, height1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HEIGHT1: {varchar(30), default=[(0)]}
     * @param height1 The value of height1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHeight1_NotEqual(String height1) {
        doSetHeight1_NotEqual(fRES(height1));
    }

    protected void doSetHeight1_NotEqual(String height1) {
        regHeight1(CK_NES, height1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HEIGHT1: {varchar(30), default=[(0)]}
     * @param height1 The value of height1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHeight1_GreaterThan(String height1) {
        regHeight1(CK_GT, fRES(height1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HEIGHT1: {varchar(30), default=[(0)]}
     * @param height1 The value of height1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHeight1_LessThan(String height1) {
        regHeight1(CK_LT, fRES(height1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HEIGHT1: {varchar(30), default=[(0)]}
     * @param height1 The value of height1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHeight1_GreaterEqual(String height1) {
        regHeight1(CK_GE, fRES(height1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HEIGHT1: {varchar(30), default=[(0)]}
     * @param height1 The value of height1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHeight1_LessEqual(String height1) {
        regHeight1(CK_LE, fRES(height1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * HEIGHT1: {varchar(30), default=[(0)]}
     * @param height1List The collection of height1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHeight1_InScope(Collection<String> height1List) {
        doSetHeight1_InScope(height1List);
    }

    protected void doSetHeight1_InScope(Collection<String> height1List) {
        regINS(CK_INS, cTL(height1List), xgetCValueHeight1(), "HEIGHT1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * HEIGHT1: {varchar(30), default=[(0)]}
     * @param height1List The collection of height1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHeight1_NotInScope(Collection<String> height1List) {
        doSetHeight1_NotInScope(height1List);
    }

    protected void doSetHeight1_NotInScope(Collection<String> height1List) {
        regINS(CK_NINS, cTL(height1List), xgetCValueHeight1(), "HEIGHT1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HEIGHT1: {varchar(30), default=[(0)]} <br>
     * <pre>e.g. setHeight1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param height1 The value of height1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setHeight1_LikeSearch(String height1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(height1), xgetCValueHeight1(), "HEIGHT1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HEIGHT1: {varchar(30), default=[(0)]}
     * @param height1 The value of height1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setHeight1_NotLikeSearch(String height1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(height1), xgetCValueHeight1(), "HEIGHT1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HEIGHT1: {varchar(30), default=[(0)]}
     * @param height1 The value of height1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHeight1_PrefixSearch(String height1) {
        setHeight1_LikeSearch(height1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * HEIGHT1: {varchar(30), default=[(0)]}
     */
    public void setHeight1_IsNull() { regHeight1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * HEIGHT1: {varchar(30), default=[(0)]}
     */
    public void setHeight1_IsNullOrEmpty() { regHeight1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * HEIGHT1: {varchar(30), default=[(0)]}
     */
    public void setHeight1_IsNotNull() { regHeight1(CK_ISNN, DOBJ); }

    protected void regHeight1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueHeight1(), "HEIGHT1"); }
    protected abstract ConditionValue xgetCValueHeight1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GROSSWEIGHT1: {varchar(30), default=[(0)]}
     * @param grossweight1 The value of grossweight1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGrossweight1_Equal(String grossweight1) {
        doSetGrossweight1_Equal(fRES(grossweight1));
    }

    protected void doSetGrossweight1_Equal(String grossweight1) {
        regGrossweight1(CK_EQ, grossweight1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GROSSWEIGHT1: {varchar(30), default=[(0)]}
     * @param grossweight1 The value of grossweight1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGrossweight1_NotEqual(String grossweight1) {
        doSetGrossweight1_NotEqual(fRES(grossweight1));
    }

    protected void doSetGrossweight1_NotEqual(String grossweight1) {
        regGrossweight1(CK_NES, grossweight1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GROSSWEIGHT1: {varchar(30), default=[(0)]}
     * @param grossweight1 The value of grossweight1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGrossweight1_GreaterThan(String grossweight1) {
        regGrossweight1(CK_GT, fRES(grossweight1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GROSSWEIGHT1: {varchar(30), default=[(0)]}
     * @param grossweight1 The value of grossweight1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGrossweight1_LessThan(String grossweight1) {
        regGrossweight1(CK_LT, fRES(grossweight1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GROSSWEIGHT1: {varchar(30), default=[(0)]}
     * @param grossweight1 The value of grossweight1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGrossweight1_GreaterEqual(String grossweight1) {
        regGrossweight1(CK_GE, fRES(grossweight1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GROSSWEIGHT1: {varchar(30), default=[(0)]}
     * @param grossweight1 The value of grossweight1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGrossweight1_LessEqual(String grossweight1) {
        regGrossweight1(CK_LE, fRES(grossweight1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * GROSSWEIGHT1: {varchar(30), default=[(0)]}
     * @param grossweight1List The collection of grossweight1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGrossweight1_InScope(Collection<String> grossweight1List) {
        doSetGrossweight1_InScope(grossweight1List);
    }

    protected void doSetGrossweight1_InScope(Collection<String> grossweight1List) {
        regINS(CK_INS, cTL(grossweight1List), xgetCValueGrossweight1(), "GROSSWEIGHT1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * GROSSWEIGHT1: {varchar(30), default=[(0)]}
     * @param grossweight1List The collection of grossweight1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGrossweight1_NotInScope(Collection<String> grossweight1List) {
        doSetGrossweight1_NotInScope(grossweight1List);
    }

    protected void doSetGrossweight1_NotInScope(Collection<String> grossweight1List) {
        regINS(CK_NINS, cTL(grossweight1List), xgetCValueGrossweight1(), "GROSSWEIGHT1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * GROSSWEIGHT1: {varchar(30), default=[(0)]} <br>
     * <pre>e.g. setGrossweight1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param grossweight1 The value of grossweight1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setGrossweight1_LikeSearch(String grossweight1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(grossweight1), xgetCValueGrossweight1(), "GROSSWEIGHT1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * GROSSWEIGHT1: {varchar(30), default=[(0)]}
     * @param grossweight1 The value of grossweight1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setGrossweight1_NotLikeSearch(String grossweight1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(grossweight1), xgetCValueGrossweight1(), "GROSSWEIGHT1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * GROSSWEIGHT1: {varchar(30), default=[(0)]}
     * @param grossweight1 The value of grossweight1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGrossweight1_PrefixSearch(String grossweight1) {
        setGrossweight1_LikeSearch(grossweight1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * GROSSWEIGHT1: {varchar(30), default=[(0)]}
     */
    public void setGrossweight1_IsNull() { regGrossweight1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * GROSSWEIGHT1: {varchar(30), default=[(0)]}
     */
    public void setGrossweight1_IsNullOrEmpty() { regGrossweight1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * GROSSWEIGHT1: {varchar(30), default=[(0)]}
     */
    public void setGrossweight1_IsNotNull() { regGrossweight1(CK_ISNN, DOBJ); }

    protected void regGrossweight1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueGrossweight1(), "GROSSWEIGHT1"); }
    protected abstract ConditionValue xgetCValueGrossweight1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NETWEIGHT1: {varchar(30), default=[(0)]}
     * @param netweight1 The value of netweight1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNetweight1_Equal(String netweight1) {
        doSetNetweight1_Equal(fRES(netweight1));
    }

    protected void doSetNetweight1_Equal(String netweight1) {
        regNetweight1(CK_EQ, netweight1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NETWEIGHT1: {varchar(30), default=[(0)]}
     * @param netweight1 The value of netweight1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNetweight1_NotEqual(String netweight1) {
        doSetNetweight1_NotEqual(fRES(netweight1));
    }

    protected void doSetNetweight1_NotEqual(String netweight1) {
        regNetweight1(CK_NES, netweight1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NETWEIGHT1: {varchar(30), default=[(0)]}
     * @param netweight1 The value of netweight1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNetweight1_GreaterThan(String netweight1) {
        regNetweight1(CK_GT, fRES(netweight1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NETWEIGHT1: {varchar(30), default=[(0)]}
     * @param netweight1 The value of netweight1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNetweight1_LessThan(String netweight1) {
        regNetweight1(CK_LT, fRES(netweight1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NETWEIGHT1: {varchar(30), default=[(0)]}
     * @param netweight1 The value of netweight1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNetweight1_GreaterEqual(String netweight1) {
        regNetweight1(CK_GE, fRES(netweight1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NETWEIGHT1: {varchar(30), default=[(0)]}
     * @param netweight1 The value of netweight1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNetweight1_LessEqual(String netweight1) {
        regNetweight1(CK_LE, fRES(netweight1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NETWEIGHT1: {varchar(30), default=[(0)]}
     * @param netweight1List The collection of netweight1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNetweight1_InScope(Collection<String> netweight1List) {
        doSetNetweight1_InScope(netweight1List);
    }

    protected void doSetNetweight1_InScope(Collection<String> netweight1List) {
        regINS(CK_INS, cTL(netweight1List), xgetCValueNetweight1(), "NETWEIGHT1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NETWEIGHT1: {varchar(30), default=[(0)]}
     * @param netweight1List The collection of netweight1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNetweight1_NotInScope(Collection<String> netweight1List) {
        doSetNetweight1_NotInScope(netweight1List);
    }

    protected void doSetNetweight1_NotInScope(Collection<String> netweight1List) {
        regINS(CK_NINS, cTL(netweight1List), xgetCValueNetweight1(), "NETWEIGHT1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NETWEIGHT1: {varchar(30), default=[(0)]} <br>
     * <pre>e.g. setNetweight1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param netweight1 The value of netweight1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setNetweight1_LikeSearch(String netweight1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(netweight1), xgetCValueNetweight1(), "NETWEIGHT1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NETWEIGHT1: {varchar(30), default=[(0)]}
     * @param netweight1 The value of netweight1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setNetweight1_NotLikeSearch(String netweight1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(netweight1), xgetCValueNetweight1(), "NETWEIGHT1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NETWEIGHT1: {varchar(30), default=[(0)]}
     * @param netweight1 The value of netweight1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNetweight1_PrefixSearch(String netweight1) {
        setNetweight1_LikeSearch(netweight1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * NETWEIGHT1: {varchar(30), default=[(0)]}
     */
    public void setNetweight1_IsNull() { regNetweight1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * NETWEIGHT1: {varchar(30), default=[(0)]}
     */
    public void setNetweight1_IsNullOrEmpty() { regNetweight1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * NETWEIGHT1: {varchar(30), default=[(0)]}
     */
    public void setNetweight1_IsNotNull() { regNetweight1(CK_ISNN, DOBJ); }

    protected void regNetweight1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNetweight1(), "NETWEIGHT1"); }
    protected abstract ConditionValue xgetCValueNetweight1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUBE1: {varchar(30), default=[(0)]}
     * @param cube1 The value of cube1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCube1_Equal(String cube1) {
        doSetCube1_Equal(fRES(cube1));
    }

    protected void doSetCube1_Equal(String cube1) {
        regCube1(CK_EQ, cube1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUBE1: {varchar(30), default=[(0)]}
     * @param cube1 The value of cube1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCube1_NotEqual(String cube1) {
        doSetCube1_NotEqual(fRES(cube1));
    }

    protected void doSetCube1_NotEqual(String cube1) {
        regCube1(CK_NES, cube1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUBE1: {varchar(30), default=[(0)]}
     * @param cube1 The value of cube1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCube1_GreaterThan(String cube1) {
        regCube1(CK_GT, fRES(cube1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUBE1: {varchar(30), default=[(0)]}
     * @param cube1 The value of cube1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCube1_LessThan(String cube1) {
        regCube1(CK_LT, fRES(cube1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUBE1: {varchar(30), default=[(0)]}
     * @param cube1 The value of cube1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCube1_GreaterEqual(String cube1) {
        regCube1(CK_GE, fRES(cube1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUBE1: {varchar(30), default=[(0)]}
     * @param cube1 The value of cube1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCube1_LessEqual(String cube1) {
        regCube1(CK_LE, fRES(cube1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CUBE1: {varchar(30), default=[(0)]}
     * @param cube1List The collection of cube1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCube1_InScope(Collection<String> cube1List) {
        doSetCube1_InScope(cube1List);
    }

    protected void doSetCube1_InScope(Collection<String> cube1List) {
        regINS(CK_INS, cTL(cube1List), xgetCValueCube1(), "CUBE1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CUBE1: {varchar(30), default=[(0)]}
     * @param cube1List The collection of cube1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCube1_NotInScope(Collection<String> cube1List) {
        doSetCube1_NotInScope(cube1List);
    }

    protected void doSetCube1_NotInScope(Collection<String> cube1List) {
        regINS(CK_NINS, cTL(cube1List), xgetCValueCube1(), "CUBE1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CUBE1: {varchar(30), default=[(0)]} <br>
     * <pre>e.g. setCube1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param cube1 The value of cube1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCube1_LikeSearch(String cube1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(cube1), xgetCValueCube1(), "CUBE1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CUBE1: {varchar(30), default=[(0)]}
     * @param cube1 The value of cube1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCube1_NotLikeSearch(String cube1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(cube1), xgetCValueCube1(), "CUBE1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CUBE1: {varchar(30), default=[(0)]}
     * @param cube1 The value of cube1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCube1_PrefixSearch(String cube1) {
        setCube1_LikeSearch(cube1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CUBE1: {varchar(30), default=[(0)]}
     */
    public void setCube1_IsNull() { regCube1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CUBE1: {varchar(30), default=[(0)]}
     */
    public void setCube1_IsNullOrEmpty() { regCube1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CUBE1: {varchar(30), default=[(0)]}
     */
    public void setCube1_IsNotNull() { regCube1(CK_ISNN, DOBJ); }

    protected void regCube1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCube1(), "CUBE1"); }
    protected abstract ConditionValue xgetCValueCube1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LITER1: {varchar(30), default=[(0)]}
     * @param liter1 The value of liter1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLiter1_Equal(String liter1) {
        doSetLiter1_Equal(fRES(liter1));
    }

    protected void doSetLiter1_Equal(String liter1) {
        regLiter1(CK_EQ, liter1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LITER1: {varchar(30), default=[(0)]}
     * @param liter1 The value of liter1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLiter1_NotEqual(String liter1) {
        doSetLiter1_NotEqual(fRES(liter1));
    }

    protected void doSetLiter1_NotEqual(String liter1) {
        regLiter1(CK_NES, liter1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LITER1: {varchar(30), default=[(0)]}
     * @param liter1 The value of liter1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLiter1_GreaterThan(String liter1) {
        regLiter1(CK_GT, fRES(liter1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LITER1: {varchar(30), default=[(0)]}
     * @param liter1 The value of liter1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLiter1_LessThan(String liter1) {
        regLiter1(CK_LT, fRES(liter1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LITER1: {varchar(30), default=[(0)]}
     * @param liter1 The value of liter1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLiter1_GreaterEqual(String liter1) {
        regLiter1(CK_GE, fRES(liter1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LITER1: {varchar(30), default=[(0)]}
     * @param liter1 The value of liter1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLiter1_LessEqual(String liter1) {
        regLiter1(CK_LE, fRES(liter1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LITER1: {varchar(30), default=[(0)]}
     * @param liter1List The collection of liter1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLiter1_InScope(Collection<String> liter1List) {
        doSetLiter1_InScope(liter1List);
    }

    protected void doSetLiter1_InScope(Collection<String> liter1List) {
        regINS(CK_INS, cTL(liter1List), xgetCValueLiter1(), "LITER1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LITER1: {varchar(30), default=[(0)]}
     * @param liter1List The collection of liter1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLiter1_NotInScope(Collection<String> liter1List) {
        doSetLiter1_NotInScope(liter1List);
    }

    protected void doSetLiter1_NotInScope(Collection<String> liter1List) {
        regINS(CK_NINS, cTL(liter1List), xgetCValueLiter1(), "LITER1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LITER1: {varchar(30), default=[(0)]} <br>
     * <pre>e.g. setLiter1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param liter1 The value of liter1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLiter1_LikeSearch(String liter1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(liter1), xgetCValueLiter1(), "LITER1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LITER1: {varchar(30), default=[(0)]}
     * @param liter1 The value of liter1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLiter1_NotLikeSearch(String liter1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(liter1), xgetCValueLiter1(), "LITER1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LITER1: {varchar(30), default=[(0)]}
     * @param liter1 The value of liter1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLiter1_PrefixSearch(String liter1) {
        setLiter1_LikeSearch(liter1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LITER1: {varchar(30), default=[(0)]}
     */
    public void setLiter1_IsNull() { regLiter1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LITER1: {varchar(30), default=[(0)]}
     */
    public void setLiter1_IsNullOrEmpty() { regLiter1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LITER1: {varchar(30), default=[(0)]}
     */
    public void setLiter1_IsNotNull() { regLiter1(CK_ISNN, DOBJ); }

    protected void regLiter1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLiter1(), "LITER1"); }
    protected abstract ConditionValue xgetCValueLiter1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UNIT2: {varchar(30), default=[(0)]}
     * @param unit2 The value of unit2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnit2_Equal(String unit2) {
        doSetUnit2_Equal(fRES(unit2));
    }

    protected void doSetUnit2_Equal(String unit2) {
        regUnit2(CK_EQ, unit2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UNIT2: {varchar(30), default=[(0)]}
     * @param unit2 The value of unit2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnit2_NotEqual(String unit2) {
        doSetUnit2_NotEqual(fRES(unit2));
    }

    protected void doSetUnit2_NotEqual(String unit2) {
        regUnit2(CK_NES, unit2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UNIT2: {varchar(30), default=[(0)]}
     * @param unit2 The value of unit2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnit2_GreaterThan(String unit2) {
        regUnit2(CK_GT, fRES(unit2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UNIT2: {varchar(30), default=[(0)]}
     * @param unit2 The value of unit2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnit2_LessThan(String unit2) {
        regUnit2(CK_LT, fRES(unit2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UNIT2: {varchar(30), default=[(0)]}
     * @param unit2 The value of unit2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnit2_GreaterEqual(String unit2) {
        regUnit2(CK_GE, fRES(unit2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UNIT2: {varchar(30), default=[(0)]}
     * @param unit2 The value of unit2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnit2_LessEqual(String unit2) {
        regUnit2(CK_LE, fRES(unit2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * UNIT2: {varchar(30), default=[(0)]}
     * @param unit2List The collection of unit2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnit2_InScope(Collection<String> unit2List) {
        doSetUnit2_InScope(unit2List);
    }

    protected void doSetUnit2_InScope(Collection<String> unit2List) {
        regINS(CK_INS, cTL(unit2List), xgetCValueUnit2(), "UNIT2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * UNIT2: {varchar(30), default=[(0)]}
     * @param unit2List The collection of unit2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnit2_NotInScope(Collection<String> unit2List) {
        doSetUnit2_NotInScope(unit2List);
    }

    protected void doSetUnit2_NotInScope(Collection<String> unit2List) {
        regINS(CK_NINS, cTL(unit2List), xgetCValueUnit2(), "UNIT2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UNIT2: {varchar(30), default=[(0)]} <br>
     * <pre>e.g. setUnit2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param unit2 The value of unit2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setUnit2_LikeSearch(String unit2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(unit2), xgetCValueUnit2(), "UNIT2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UNIT2: {varchar(30), default=[(0)]}
     * @param unit2 The value of unit2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setUnit2_NotLikeSearch(String unit2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(unit2), xgetCValueUnit2(), "UNIT2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UNIT2: {varchar(30), default=[(0)]}
     * @param unit2 The value of unit2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnit2_PrefixSearch(String unit2) {
        setUnit2_LikeSearch(unit2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * UNIT2: {varchar(30), default=[(0)]}
     */
    public void setUnit2_IsNull() { regUnit2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * UNIT2: {varchar(30), default=[(0)]}
     */
    public void setUnit2_IsNullOrEmpty() { regUnit2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * UNIT2: {varchar(30), default=[(0)]}
     */
    public void setUnit2_IsNotNull() { regUnit2(CK_ISNN, DOBJ); }

    protected void regUnit2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUnit2(), "UNIT2"); }
    protected abstract ConditionValue xgetCValueUnit2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UNIT2STYLE: {varchar(60)}
     * @param unit2style The value of unit2style as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnit2style_Equal(String unit2style) {
        doSetUnit2style_Equal(fRES(unit2style));
    }

    protected void doSetUnit2style_Equal(String unit2style) {
        regUnit2style(CK_EQ, unit2style);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UNIT2STYLE: {varchar(60)}
     * @param unit2style The value of unit2style as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnit2style_NotEqual(String unit2style) {
        doSetUnit2style_NotEqual(fRES(unit2style));
    }

    protected void doSetUnit2style_NotEqual(String unit2style) {
        regUnit2style(CK_NES, unit2style);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UNIT2STYLE: {varchar(60)}
     * @param unit2style The value of unit2style as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnit2style_GreaterThan(String unit2style) {
        regUnit2style(CK_GT, fRES(unit2style));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UNIT2STYLE: {varchar(60)}
     * @param unit2style The value of unit2style as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnit2style_LessThan(String unit2style) {
        regUnit2style(CK_LT, fRES(unit2style));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UNIT2STYLE: {varchar(60)}
     * @param unit2style The value of unit2style as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnit2style_GreaterEqual(String unit2style) {
        regUnit2style(CK_GE, fRES(unit2style));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UNIT2STYLE: {varchar(60)}
     * @param unit2style The value of unit2style as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnit2style_LessEqual(String unit2style) {
        regUnit2style(CK_LE, fRES(unit2style));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * UNIT2STYLE: {varchar(60)}
     * @param unit2styleList The collection of unit2style as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnit2style_InScope(Collection<String> unit2styleList) {
        doSetUnit2style_InScope(unit2styleList);
    }

    protected void doSetUnit2style_InScope(Collection<String> unit2styleList) {
        regINS(CK_INS, cTL(unit2styleList), xgetCValueUnit2style(), "UNIT2STYLE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * UNIT2STYLE: {varchar(60)}
     * @param unit2styleList The collection of unit2style as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnit2style_NotInScope(Collection<String> unit2styleList) {
        doSetUnit2style_NotInScope(unit2styleList);
    }

    protected void doSetUnit2style_NotInScope(Collection<String> unit2styleList) {
        regINS(CK_NINS, cTL(unit2styleList), xgetCValueUnit2style(), "UNIT2STYLE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UNIT2STYLE: {varchar(60)} <br>
     * <pre>e.g. setUnit2style_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param unit2style The value of unit2style as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setUnit2style_LikeSearch(String unit2style, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(unit2style), xgetCValueUnit2style(), "UNIT2STYLE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UNIT2STYLE: {varchar(60)}
     * @param unit2style The value of unit2style as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setUnit2style_NotLikeSearch(String unit2style, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(unit2style), xgetCValueUnit2style(), "UNIT2STYLE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UNIT2STYLE: {varchar(60)}
     * @param unit2style The value of unit2style as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnit2style_PrefixSearch(String unit2style) {
        setUnit2style_LikeSearch(unit2style, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * UNIT2STYLE: {varchar(60)}
     */
    public void setUnit2style_IsNull() { regUnit2style(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * UNIT2STYLE: {varchar(60)}
     */
    public void setUnit2style_IsNullOrEmpty() { regUnit2style(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * UNIT2STYLE: {varchar(60)}
     */
    public void setUnit2style_IsNotNull() { regUnit2style(CK_ISNN, DOBJ); }

    protected void regUnit2style(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUnit2style(), "UNIT2STYLE"); }
    protected abstract ConditionValue xgetCValueUnit2style();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LENGTH2: {varchar(30), default=[(0)]}
     * @param length2 The value of length2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLength2_Equal(String length2) {
        doSetLength2_Equal(fRES(length2));
    }

    protected void doSetLength2_Equal(String length2) {
        regLength2(CK_EQ, length2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LENGTH2: {varchar(30), default=[(0)]}
     * @param length2 The value of length2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLength2_NotEqual(String length2) {
        doSetLength2_NotEqual(fRES(length2));
    }

    protected void doSetLength2_NotEqual(String length2) {
        regLength2(CK_NES, length2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LENGTH2: {varchar(30), default=[(0)]}
     * @param length2 The value of length2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLength2_GreaterThan(String length2) {
        regLength2(CK_GT, fRES(length2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LENGTH2: {varchar(30), default=[(0)]}
     * @param length2 The value of length2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLength2_LessThan(String length2) {
        regLength2(CK_LT, fRES(length2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LENGTH2: {varchar(30), default=[(0)]}
     * @param length2 The value of length2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLength2_GreaterEqual(String length2) {
        regLength2(CK_GE, fRES(length2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LENGTH2: {varchar(30), default=[(0)]}
     * @param length2 The value of length2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLength2_LessEqual(String length2) {
        regLength2(CK_LE, fRES(length2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LENGTH2: {varchar(30), default=[(0)]}
     * @param length2List The collection of length2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLength2_InScope(Collection<String> length2List) {
        doSetLength2_InScope(length2List);
    }

    protected void doSetLength2_InScope(Collection<String> length2List) {
        regINS(CK_INS, cTL(length2List), xgetCValueLength2(), "LENGTH2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LENGTH2: {varchar(30), default=[(0)]}
     * @param length2List The collection of length2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLength2_NotInScope(Collection<String> length2List) {
        doSetLength2_NotInScope(length2List);
    }

    protected void doSetLength2_NotInScope(Collection<String> length2List) {
        regINS(CK_NINS, cTL(length2List), xgetCValueLength2(), "LENGTH2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LENGTH2: {varchar(30), default=[(0)]} <br>
     * <pre>e.g. setLength2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param length2 The value of length2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLength2_LikeSearch(String length2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(length2), xgetCValueLength2(), "LENGTH2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LENGTH2: {varchar(30), default=[(0)]}
     * @param length2 The value of length2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLength2_NotLikeSearch(String length2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(length2), xgetCValueLength2(), "LENGTH2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LENGTH2: {varchar(30), default=[(0)]}
     * @param length2 The value of length2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLength2_PrefixSearch(String length2) {
        setLength2_LikeSearch(length2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LENGTH2: {varchar(30), default=[(0)]}
     */
    public void setLength2_IsNull() { regLength2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LENGTH2: {varchar(30), default=[(0)]}
     */
    public void setLength2_IsNullOrEmpty() { regLength2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LENGTH2: {varchar(30), default=[(0)]}
     */
    public void setLength2_IsNotNull() { regLength2(CK_ISNN, DOBJ); }

    protected void regLength2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLength2(), "LENGTH2"); }
    protected abstract ConditionValue xgetCValueLength2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WIDTH2: {varchar(30), default=[(0)]}
     * @param width2 The value of width2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWidth2_Equal(String width2) {
        doSetWidth2_Equal(fRES(width2));
    }

    protected void doSetWidth2_Equal(String width2) {
        regWidth2(CK_EQ, width2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WIDTH2: {varchar(30), default=[(0)]}
     * @param width2 The value of width2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWidth2_NotEqual(String width2) {
        doSetWidth2_NotEqual(fRES(width2));
    }

    protected void doSetWidth2_NotEqual(String width2) {
        regWidth2(CK_NES, width2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WIDTH2: {varchar(30), default=[(0)]}
     * @param width2 The value of width2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWidth2_GreaterThan(String width2) {
        regWidth2(CK_GT, fRES(width2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WIDTH2: {varchar(30), default=[(0)]}
     * @param width2 The value of width2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWidth2_LessThan(String width2) {
        regWidth2(CK_LT, fRES(width2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WIDTH2: {varchar(30), default=[(0)]}
     * @param width2 The value of width2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWidth2_GreaterEqual(String width2) {
        regWidth2(CK_GE, fRES(width2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WIDTH2: {varchar(30), default=[(0)]}
     * @param width2 The value of width2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWidth2_LessEqual(String width2) {
        regWidth2(CK_LE, fRES(width2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WIDTH2: {varchar(30), default=[(0)]}
     * @param width2List The collection of width2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWidth2_InScope(Collection<String> width2List) {
        doSetWidth2_InScope(width2List);
    }

    protected void doSetWidth2_InScope(Collection<String> width2List) {
        regINS(CK_INS, cTL(width2List), xgetCValueWidth2(), "WIDTH2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WIDTH2: {varchar(30), default=[(0)]}
     * @param width2List The collection of width2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWidth2_NotInScope(Collection<String> width2List) {
        doSetWidth2_NotInScope(width2List);
    }

    protected void doSetWidth2_NotInScope(Collection<String> width2List) {
        regINS(CK_NINS, cTL(width2List), xgetCValueWidth2(), "WIDTH2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WIDTH2: {varchar(30), default=[(0)]} <br>
     * <pre>e.g. setWidth2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param width2 The value of width2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setWidth2_LikeSearch(String width2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(width2), xgetCValueWidth2(), "WIDTH2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WIDTH2: {varchar(30), default=[(0)]}
     * @param width2 The value of width2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setWidth2_NotLikeSearch(String width2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(width2), xgetCValueWidth2(), "WIDTH2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WIDTH2: {varchar(30), default=[(0)]}
     * @param width2 The value of width2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWidth2_PrefixSearch(String width2) {
        setWidth2_LikeSearch(width2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * WIDTH2: {varchar(30), default=[(0)]}
     */
    public void setWidth2_IsNull() { regWidth2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * WIDTH2: {varchar(30), default=[(0)]}
     */
    public void setWidth2_IsNullOrEmpty() { regWidth2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * WIDTH2: {varchar(30), default=[(0)]}
     */
    public void setWidth2_IsNotNull() { regWidth2(CK_ISNN, DOBJ); }

    protected void regWidth2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWidth2(), "WIDTH2"); }
    protected abstract ConditionValue xgetCValueWidth2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HEIGHT2: {varchar(30), default=[(0)]}
     * @param height2 The value of height2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHeight2_Equal(String height2) {
        doSetHeight2_Equal(fRES(height2));
    }

    protected void doSetHeight2_Equal(String height2) {
        regHeight2(CK_EQ, height2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HEIGHT2: {varchar(30), default=[(0)]}
     * @param height2 The value of height2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHeight2_NotEqual(String height2) {
        doSetHeight2_NotEqual(fRES(height2));
    }

    protected void doSetHeight2_NotEqual(String height2) {
        regHeight2(CK_NES, height2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HEIGHT2: {varchar(30), default=[(0)]}
     * @param height2 The value of height2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHeight2_GreaterThan(String height2) {
        regHeight2(CK_GT, fRES(height2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HEIGHT2: {varchar(30), default=[(0)]}
     * @param height2 The value of height2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHeight2_LessThan(String height2) {
        regHeight2(CK_LT, fRES(height2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HEIGHT2: {varchar(30), default=[(0)]}
     * @param height2 The value of height2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHeight2_GreaterEqual(String height2) {
        regHeight2(CK_GE, fRES(height2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HEIGHT2: {varchar(30), default=[(0)]}
     * @param height2 The value of height2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHeight2_LessEqual(String height2) {
        regHeight2(CK_LE, fRES(height2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * HEIGHT2: {varchar(30), default=[(0)]}
     * @param height2List The collection of height2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHeight2_InScope(Collection<String> height2List) {
        doSetHeight2_InScope(height2List);
    }

    protected void doSetHeight2_InScope(Collection<String> height2List) {
        regINS(CK_INS, cTL(height2List), xgetCValueHeight2(), "HEIGHT2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * HEIGHT2: {varchar(30), default=[(0)]}
     * @param height2List The collection of height2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHeight2_NotInScope(Collection<String> height2List) {
        doSetHeight2_NotInScope(height2List);
    }

    protected void doSetHeight2_NotInScope(Collection<String> height2List) {
        regINS(CK_NINS, cTL(height2List), xgetCValueHeight2(), "HEIGHT2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HEIGHT2: {varchar(30), default=[(0)]} <br>
     * <pre>e.g. setHeight2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param height2 The value of height2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setHeight2_LikeSearch(String height2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(height2), xgetCValueHeight2(), "HEIGHT2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HEIGHT2: {varchar(30), default=[(0)]}
     * @param height2 The value of height2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setHeight2_NotLikeSearch(String height2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(height2), xgetCValueHeight2(), "HEIGHT2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HEIGHT2: {varchar(30), default=[(0)]}
     * @param height2 The value of height2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHeight2_PrefixSearch(String height2) {
        setHeight2_LikeSearch(height2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * HEIGHT2: {varchar(30), default=[(0)]}
     */
    public void setHeight2_IsNull() { regHeight2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * HEIGHT2: {varchar(30), default=[(0)]}
     */
    public void setHeight2_IsNullOrEmpty() { regHeight2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * HEIGHT2: {varchar(30), default=[(0)]}
     */
    public void setHeight2_IsNotNull() { regHeight2(CK_ISNN, DOBJ); }

    protected void regHeight2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueHeight2(), "HEIGHT2"); }
    protected abstract ConditionValue xgetCValueHeight2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GROSSWEIGHT2: {varchar(30), default=[(0)]}
     * @param grossweight2 The value of grossweight2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGrossweight2_Equal(String grossweight2) {
        doSetGrossweight2_Equal(fRES(grossweight2));
    }

    protected void doSetGrossweight2_Equal(String grossweight2) {
        regGrossweight2(CK_EQ, grossweight2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GROSSWEIGHT2: {varchar(30), default=[(0)]}
     * @param grossweight2 The value of grossweight2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGrossweight2_NotEqual(String grossweight2) {
        doSetGrossweight2_NotEqual(fRES(grossweight2));
    }

    protected void doSetGrossweight2_NotEqual(String grossweight2) {
        regGrossweight2(CK_NES, grossweight2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GROSSWEIGHT2: {varchar(30), default=[(0)]}
     * @param grossweight2 The value of grossweight2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGrossweight2_GreaterThan(String grossweight2) {
        regGrossweight2(CK_GT, fRES(grossweight2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GROSSWEIGHT2: {varchar(30), default=[(0)]}
     * @param grossweight2 The value of grossweight2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGrossweight2_LessThan(String grossweight2) {
        regGrossweight2(CK_LT, fRES(grossweight2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GROSSWEIGHT2: {varchar(30), default=[(0)]}
     * @param grossweight2 The value of grossweight2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGrossweight2_GreaterEqual(String grossweight2) {
        regGrossweight2(CK_GE, fRES(grossweight2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GROSSWEIGHT2: {varchar(30), default=[(0)]}
     * @param grossweight2 The value of grossweight2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGrossweight2_LessEqual(String grossweight2) {
        regGrossweight2(CK_LE, fRES(grossweight2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * GROSSWEIGHT2: {varchar(30), default=[(0)]}
     * @param grossweight2List The collection of grossweight2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGrossweight2_InScope(Collection<String> grossweight2List) {
        doSetGrossweight2_InScope(grossweight2List);
    }

    protected void doSetGrossweight2_InScope(Collection<String> grossweight2List) {
        regINS(CK_INS, cTL(grossweight2List), xgetCValueGrossweight2(), "GROSSWEIGHT2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * GROSSWEIGHT2: {varchar(30), default=[(0)]}
     * @param grossweight2List The collection of grossweight2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGrossweight2_NotInScope(Collection<String> grossweight2List) {
        doSetGrossweight2_NotInScope(grossweight2List);
    }

    protected void doSetGrossweight2_NotInScope(Collection<String> grossweight2List) {
        regINS(CK_NINS, cTL(grossweight2List), xgetCValueGrossweight2(), "GROSSWEIGHT2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * GROSSWEIGHT2: {varchar(30), default=[(0)]} <br>
     * <pre>e.g. setGrossweight2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param grossweight2 The value of grossweight2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setGrossweight2_LikeSearch(String grossweight2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(grossweight2), xgetCValueGrossweight2(), "GROSSWEIGHT2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * GROSSWEIGHT2: {varchar(30), default=[(0)]}
     * @param grossweight2 The value of grossweight2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setGrossweight2_NotLikeSearch(String grossweight2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(grossweight2), xgetCValueGrossweight2(), "GROSSWEIGHT2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * GROSSWEIGHT2: {varchar(30), default=[(0)]}
     * @param grossweight2 The value of grossweight2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGrossweight2_PrefixSearch(String grossweight2) {
        setGrossweight2_LikeSearch(grossweight2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * GROSSWEIGHT2: {varchar(30), default=[(0)]}
     */
    public void setGrossweight2_IsNull() { regGrossweight2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * GROSSWEIGHT2: {varchar(30), default=[(0)]}
     */
    public void setGrossweight2_IsNullOrEmpty() { regGrossweight2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * GROSSWEIGHT2: {varchar(30), default=[(0)]}
     */
    public void setGrossweight2_IsNotNull() { regGrossweight2(CK_ISNN, DOBJ); }

    protected void regGrossweight2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueGrossweight2(), "GROSSWEIGHT2"); }
    protected abstract ConditionValue xgetCValueGrossweight2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NETWEIGHT2: {varchar(30), default=[(0)]}
     * @param netweight2 The value of netweight2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNetweight2_Equal(String netweight2) {
        doSetNetweight2_Equal(fRES(netweight2));
    }

    protected void doSetNetweight2_Equal(String netweight2) {
        regNetweight2(CK_EQ, netweight2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NETWEIGHT2: {varchar(30), default=[(0)]}
     * @param netweight2 The value of netweight2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNetweight2_NotEqual(String netweight2) {
        doSetNetweight2_NotEqual(fRES(netweight2));
    }

    protected void doSetNetweight2_NotEqual(String netweight2) {
        regNetweight2(CK_NES, netweight2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NETWEIGHT2: {varchar(30), default=[(0)]}
     * @param netweight2 The value of netweight2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNetweight2_GreaterThan(String netweight2) {
        regNetweight2(CK_GT, fRES(netweight2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NETWEIGHT2: {varchar(30), default=[(0)]}
     * @param netweight2 The value of netweight2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNetweight2_LessThan(String netweight2) {
        regNetweight2(CK_LT, fRES(netweight2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NETWEIGHT2: {varchar(30), default=[(0)]}
     * @param netweight2 The value of netweight2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNetweight2_GreaterEqual(String netweight2) {
        regNetweight2(CK_GE, fRES(netweight2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NETWEIGHT2: {varchar(30), default=[(0)]}
     * @param netweight2 The value of netweight2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNetweight2_LessEqual(String netweight2) {
        regNetweight2(CK_LE, fRES(netweight2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NETWEIGHT2: {varchar(30), default=[(0)]}
     * @param netweight2List The collection of netweight2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNetweight2_InScope(Collection<String> netweight2List) {
        doSetNetweight2_InScope(netweight2List);
    }

    protected void doSetNetweight2_InScope(Collection<String> netweight2List) {
        regINS(CK_INS, cTL(netweight2List), xgetCValueNetweight2(), "NETWEIGHT2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NETWEIGHT2: {varchar(30), default=[(0)]}
     * @param netweight2List The collection of netweight2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNetweight2_NotInScope(Collection<String> netweight2List) {
        doSetNetweight2_NotInScope(netweight2List);
    }

    protected void doSetNetweight2_NotInScope(Collection<String> netweight2List) {
        regINS(CK_NINS, cTL(netweight2List), xgetCValueNetweight2(), "NETWEIGHT2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NETWEIGHT2: {varchar(30), default=[(0)]} <br>
     * <pre>e.g. setNetweight2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param netweight2 The value of netweight2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setNetweight2_LikeSearch(String netweight2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(netweight2), xgetCValueNetweight2(), "NETWEIGHT2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NETWEIGHT2: {varchar(30), default=[(0)]}
     * @param netweight2 The value of netweight2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setNetweight2_NotLikeSearch(String netweight2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(netweight2), xgetCValueNetweight2(), "NETWEIGHT2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NETWEIGHT2: {varchar(30), default=[(0)]}
     * @param netweight2 The value of netweight2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNetweight2_PrefixSearch(String netweight2) {
        setNetweight2_LikeSearch(netweight2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * NETWEIGHT2: {varchar(30), default=[(0)]}
     */
    public void setNetweight2_IsNull() { regNetweight2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * NETWEIGHT2: {varchar(30), default=[(0)]}
     */
    public void setNetweight2_IsNullOrEmpty() { regNetweight2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * NETWEIGHT2: {varchar(30), default=[(0)]}
     */
    public void setNetweight2_IsNotNull() { regNetweight2(CK_ISNN, DOBJ); }

    protected void regNetweight2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNetweight2(), "NETWEIGHT2"); }
    protected abstract ConditionValue xgetCValueNetweight2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUBE2: {varchar(30), default=[(0)]}
     * @param cube2 The value of cube2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCube2_Equal(String cube2) {
        doSetCube2_Equal(fRES(cube2));
    }

    protected void doSetCube2_Equal(String cube2) {
        regCube2(CK_EQ, cube2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUBE2: {varchar(30), default=[(0)]}
     * @param cube2 The value of cube2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCube2_NotEqual(String cube2) {
        doSetCube2_NotEqual(fRES(cube2));
    }

    protected void doSetCube2_NotEqual(String cube2) {
        regCube2(CK_NES, cube2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUBE2: {varchar(30), default=[(0)]}
     * @param cube2 The value of cube2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCube2_GreaterThan(String cube2) {
        regCube2(CK_GT, fRES(cube2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUBE2: {varchar(30), default=[(0)]}
     * @param cube2 The value of cube2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCube2_LessThan(String cube2) {
        regCube2(CK_LT, fRES(cube2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUBE2: {varchar(30), default=[(0)]}
     * @param cube2 The value of cube2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCube2_GreaterEqual(String cube2) {
        regCube2(CK_GE, fRES(cube2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUBE2: {varchar(30), default=[(0)]}
     * @param cube2 The value of cube2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCube2_LessEqual(String cube2) {
        regCube2(CK_LE, fRES(cube2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CUBE2: {varchar(30), default=[(0)]}
     * @param cube2List The collection of cube2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCube2_InScope(Collection<String> cube2List) {
        doSetCube2_InScope(cube2List);
    }

    protected void doSetCube2_InScope(Collection<String> cube2List) {
        regINS(CK_INS, cTL(cube2List), xgetCValueCube2(), "CUBE2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CUBE2: {varchar(30), default=[(0)]}
     * @param cube2List The collection of cube2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCube2_NotInScope(Collection<String> cube2List) {
        doSetCube2_NotInScope(cube2List);
    }

    protected void doSetCube2_NotInScope(Collection<String> cube2List) {
        regINS(CK_NINS, cTL(cube2List), xgetCValueCube2(), "CUBE2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CUBE2: {varchar(30), default=[(0)]} <br>
     * <pre>e.g. setCube2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param cube2 The value of cube2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCube2_LikeSearch(String cube2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(cube2), xgetCValueCube2(), "CUBE2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CUBE2: {varchar(30), default=[(0)]}
     * @param cube2 The value of cube2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCube2_NotLikeSearch(String cube2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(cube2), xgetCValueCube2(), "CUBE2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CUBE2: {varchar(30), default=[(0)]}
     * @param cube2 The value of cube2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCube2_PrefixSearch(String cube2) {
        setCube2_LikeSearch(cube2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CUBE2: {varchar(30), default=[(0)]}
     */
    public void setCube2_IsNull() { regCube2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CUBE2: {varchar(30), default=[(0)]}
     */
    public void setCube2_IsNullOrEmpty() { regCube2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CUBE2: {varchar(30), default=[(0)]}
     */
    public void setCube2_IsNotNull() { regCube2(CK_ISNN, DOBJ); }

    protected void regCube2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCube2(), "CUBE2"); }
    protected abstract ConditionValue xgetCValueCube2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LITER2: {varchar(30), default=[(0)]}
     * @param liter2 The value of liter2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLiter2_Equal(String liter2) {
        doSetLiter2_Equal(fRES(liter2));
    }

    protected void doSetLiter2_Equal(String liter2) {
        regLiter2(CK_EQ, liter2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LITER2: {varchar(30), default=[(0)]}
     * @param liter2 The value of liter2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLiter2_NotEqual(String liter2) {
        doSetLiter2_NotEqual(fRES(liter2));
    }

    protected void doSetLiter2_NotEqual(String liter2) {
        regLiter2(CK_NES, liter2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LITER2: {varchar(30), default=[(0)]}
     * @param liter2 The value of liter2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLiter2_GreaterThan(String liter2) {
        regLiter2(CK_GT, fRES(liter2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LITER2: {varchar(30), default=[(0)]}
     * @param liter2 The value of liter2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLiter2_LessThan(String liter2) {
        regLiter2(CK_LT, fRES(liter2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LITER2: {varchar(30), default=[(0)]}
     * @param liter2 The value of liter2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLiter2_GreaterEqual(String liter2) {
        regLiter2(CK_GE, fRES(liter2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LITER2: {varchar(30), default=[(0)]}
     * @param liter2 The value of liter2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLiter2_LessEqual(String liter2) {
        regLiter2(CK_LE, fRES(liter2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LITER2: {varchar(30), default=[(0)]}
     * @param liter2List The collection of liter2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLiter2_InScope(Collection<String> liter2List) {
        doSetLiter2_InScope(liter2List);
    }

    protected void doSetLiter2_InScope(Collection<String> liter2List) {
        regINS(CK_INS, cTL(liter2List), xgetCValueLiter2(), "LITER2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LITER2: {varchar(30), default=[(0)]}
     * @param liter2List The collection of liter2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLiter2_NotInScope(Collection<String> liter2List) {
        doSetLiter2_NotInScope(liter2List);
    }

    protected void doSetLiter2_NotInScope(Collection<String> liter2List) {
        regINS(CK_NINS, cTL(liter2List), xgetCValueLiter2(), "LITER2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LITER2: {varchar(30), default=[(0)]} <br>
     * <pre>e.g. setLiter2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param liter2 The value of liter2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLiter2_LikeSearch(String liter2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(liter2), xgetCValueLiter2(), "LITER2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LITER2: {varchar(30), default=[(0)]}
     * @param liter2 The value of liter2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLiter2_NotLikeSearch(String liter2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(liter2), xgetCValueLiter2(), "LITER2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LITER2: {varchar(30), default=[(0)]}
     * @param liter2 The value of liter2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLiter2_PrefixSearch(String liter2) {
        setLiter2_LikeSearch(liter2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LITER2: {varchar(30), default=[(0)]}
     */
    public void setLiter2_IsNull() { regLiter2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LITER2: {varchar(30), default=[(0)]}
     */
    public void setLiter2_IsNullOrEmpty() { regLiter2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LITER2: {varchar(30), default=[(0)]}
     */
    public void setLiter2_IsNotNull() { regLiter2(CK_ISNN, DOBJ); }

    protected void regLiter2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLiter2(), "LITER2"); }
    protected abstract ConditionValue xgetCValueLiter2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UNIT3: {varchar(30), default=[(0)]}
     * @param unit3 The value of unit3 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnit3_Equal(String unit3) {
        doSetUnit3_Equal(fRES(unit3));
    }

    protected void doSetUnit3_Equal(String unit3) {
        regUnit3(CK_EQ, unit3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UNIT3: {varchar(30), default=[(0)]}
     * @param unit3 The value of unit3 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnit3_NotEqual(String unit3) {
        doSetUnit3_NotEqual(fRES(unit3));
    }

    protected void doSetUnit3_NotEqual(String unit3) {
        regUnit3(CK_NES, unit3);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UNIT3: {varchar(30), default=[(0)]}
     * @param unit3 The value of unit3 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnit3_GreaterThan(String unit3) {
        regUnit3(CK_GT, fRES(unit3));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UNIT3: {varchar(30), default=[(0)]}
     * @param unit3 The value of unit3 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnit3_LessThan(String unit3) {
        regUnit3(CK_LT, fRES(unit3));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UNIT3: {varchar(30), default=[(0)]}
     * @param unit3 The value of unit3 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnit3_GreaterEqual(String unit3) {
        regUnit3(CK_GE, fRES(unit3));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UNIT3: {varchar(30), default=[(0)]}
     * @param unit3 The value of unit3 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnit3_LessEqual(String unit3) {
        regUnit3(CK_LE, fRES(unit3));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * UNIT3: {varchar(30), default=[(0)]}
     * @param unit3List The collection of unit3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnit3_InScope(Collection<String> unit3List) {
        doSetUnit3_InScope(unit3List);
    }

    protected void doSetUnit3_InScope(Collection<String> unit3List) {
        regINS(CK_INS, cTL(unit3List), xgetCValueUnit3(), "UNIT3");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * UNIT3: {varchar(30), default=[(0)]}
     * @param unit3List The collection of unit3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnit3_NotInScope(Collection<String> unit3List) {
        doSetUnit3_NotInScope(unit3List);
    }

    protected void doSetUnit3_NotInScope(Collection<String> unit3List) {
        regINS(CK_NINS, cTL(unit3List), xgetCValueUnit3(), "UNIT3");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UNIT3: {varchar(30), default=[(0)]} <br>
     * <pre>e.g. setUnit3_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param unit3 The value of unit3 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setUnit3_LikeSearch(String unit3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(unit3), xgetCValueUnit3(), "UNIT3", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UNIT3: {varchar(30), default=[(0)]}
     * @param unit3 The value of unit3 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setUnit3_NotLikeSearch(String unit3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(unit3), xgetCValueUnit3(), "UNIT3", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UNIT3: {varchar(30), default=[(0)]}
     * @param unit3 The value of unit3 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnit3_PrefixSearch(String unit3) {
        setUnit3_LikeSearch(unit3, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * UNIT3: {varchar(30), default=[(0)]}
     */
    public void setUnit3_IsNull() { regUnit3(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * UNIT3: {varchar(30), default=[(0)]}
     */
    public void setUnit3_IsNullOrEmpty() { regUnit3(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * UNIT3: {varchar(30), default=[(0)]}
     */
    public void setUnit3_IsNotNull() { regUnit3(CK_ISNN, DOBJ); }

    protected void regUnit3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUnit3(), "UNIT3"); }
    protected abstract ConditionValue xgetCValueUnit3();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UNIT3STYLE: {varchar(60)}
     * @param unit3style The value of unit3style as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnit3style_Equal(String unit3style) {
        doSetUnit3style_Equal(fRES(unit3style));
    }

    protected void doSetUnit3style_Equal(String unit3style) {
        regUnit3style(CK_EQ, unit3style);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UNIT3STYLE: {varchar(60)}
     * @param unit3style The value of unit3style as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnit3style_NotEqual(String unit3style) {
        doSetUnit3style_NotEqual(fRES(unit3style));
    }

    protected void doSetUnit3style_NotEqual(String unit3style) {
        regUnit3style(CK_NES, unit3style);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UNIT3STYLE: {varchar(60)}
     * @param unit3style The value of unit3style as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnit3style_GreaterThan(String unit3style) {
        regUnit3style(CK_GT, fRES(unit3style));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UNIT3STYLE: {varchar(60)}
     * @param unit3style The value of unit3style as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnit3style_LessThan(String unit3style) {
        regUnit3style(CK_LT, fRES(unit3style));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UNIT3STYLE: {varchar(60)}
     * @param unit3style The value of unit3style as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnit3style_GreaterEqual(String unit3style) {
        regUnit3style(CK_GE, fRES(unit3style));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UNIT3STYLE: {varchar(60)}
     * @param unit3style The value of unit3style as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnit3style_LessEqual(String unit3style) {
        regUnit3style(CK_LE, fRES(unit3style));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * UNIT3STYLE: {varchar(60)}
     * @param unit3styleList The collection of unit3style as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnit3style_InScope(Collection<String> unit3styleList) {
        doSetUnit3style_InScope(unit3styleList);
    }

    protected void doSetUnit3style_InScope(Collection<String> unit3styleList) {
        regINS(CK_INS, cTL(unit3styleList), xgetCValueUnit3style(), "UNIT3STYLE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * UNIT3STYLE: {varchar(60)}
     * @param unit3styleList The collection of unit3style as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnit3style_NotInScope(Collection<String> unit3styleList) {
        doSetUnit3style_NotInScope(unit3styleList);
    }

    protected void doSetUnit3style_NotInScope(Collection<String> unit3styleList) {
        regINS(CK_NINS, cTL(unit3styleList), xgetCValueUnit3style(), "UNIT3STYLE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UNIT3STYLE: {varchar(60)} <br>
     * <pre>e.g. setUnit3style_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param unit3style The value of unit3style as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setUnit3style_LikeSearch(String unit3style, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(unit3style), xgetCValueUnit3style(), "UNIT3STYLE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UNIT3STYLE: {varchar(60)}
     * @param unit3style The value of unit3style as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setUnit3style_NotLikeSearch(String unit3style, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(unit3style), xgetCValueUnit3style(), "UNIT3STYLE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UNIT3STYLE: {varchar(60)}
     * @param unit3style The value of unit3style as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnit3style_PrefixSearch(String unit3style) {
        setUnit3style_LikeSearch(unit3style, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * UNIT3STYLE: {varchar(60)}
     */
    public void setUnit3style_IsNull() { regUnit3style(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * UNIT3STYLE: {varchar(60)}
     */
    public void setUnit3style_IsNullOrEmpty() { regUnit3style(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * UNIT3STYLE: {varchar(60)}
     */
    public void setUnit3style_IsNotNull() { regUnit3style(CK_ISNN, DOBJ); }

    protected void regUnit3style(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUnit3style(), "UNIT3STYLE"); }
    protected abstract ConditionValue xgetCValueUnit3style();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LENGTH3: {varchar(30), default=[(0)]}
     * @param length3 The value of length3 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLength3_Equal(String length3) {
        doSetLength3_Equal(fRES(length3));
    }

    protected void doSetLength3_Equal(String length3) {
        regLength3(CK_EQ, length3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LENGTH3: {varchar(30), default=[(0)]}
     * @param length3 The value of length3 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLength3_NotEqual(String length3) {
        doSetLength3_NotEqual(fRES(length3));
    }

    protected void doSetLength3_NotEqual(String length3) {
        regLength3(CK_NES, length3);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LENGTH3: {varchar(30), default=[(0)]}
     * @param length3 The value of length3 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLength3_GreaterThan(String length3) {
        regLength3(CK_GT, fRES(length3));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LENGTH3: {varchar(30), default=[(0)]}
     * @param length3 The value of length3 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLength3_LessThan(String length3) {
        regLength3(CK_LT, fRES(length3));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LENGTH3: {varchar(30), default=[(0)]}
     * @param length3 The value of length3 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLength3_GreaterEqual(String length3) {
        regLength3(CK_GE, fRES(length3));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LENGTH3: {varchar(30), default=[(0)]}
     * @param length3 The value of length3 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLength3_LessEqual(String length3) {
        regLength3(CK_LE, fRES(length3));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LENGTH3: {varchar(30), default=[(0)]}
     * @param length3List The collection of length3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLength3_InScope(Collection<String> length3List) {
        doSetLength3_InScope(length3List);
    }

    protected void doSetLength3_InScope(Collection<String> length3List) {
        regINS(CK_INS, cTL(length3List), xgetCValueLength3(), "LENGTH3");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LENGTH3: {varchar(30), default=[(0)]}
     * @param length3List The collection of length3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLength3_NotInScope(Collection<String> length3List) {
        doSetLength3_NotInScope(length3List);
    }

    protected void doSetLength3_NotInScope(Collection<String> length3List) {
        regINS(CK_NINS, cTL(length3List), xgetCValueLength3(), "LENGTH3");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LENGTH3: {varchar(30), default=[(0)]} <br>
     * <pre>e.g. setLength3_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param length3 The value of length3 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLength3_LikeSearch(String length3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(length3), xgetCValueLength3(), "LENGTH3", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LENGTH3: {varchar(30), default=[(0)]}
     * @param length3 The value of length3 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLength3_NotLikeSearch(String length3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(length3), xgetCValueLength3(), "LENGTH3", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LENGTH3: {varchar(30), default=[(0)]}
     * @param length3 The value of length3 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLength3_PrefixSearch(String length3) {
        setLength3_LikeSearch(length3, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LENGTH3: {varchar(30), default=[(0)]}
     */
    public void setLength3_IsNull() { regLength3(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LENGTH3: {varchar(30), default=[(0)]}
     */
    public void setLength3_IsNullOrEmpty() { regLength3(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LENGTH3: {varchar(30), default=[(0)]}
     */
    public void setLength3_IsNotNull() { regLength3(CK_ISNN, DOBJ); }

    protected void regLength3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLength3(), "LENGTH3"); }
    protected abstract ConditionValue xgetCValueLength3();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WIDTH3: {varchar(30), default=[(0)]}
     * @param width3 The value of width3 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWidth3_Equal(String width3) {
        doSetWidth3_Equal(fRES(width3));
    }

    protected void doSetWidth3_Equal(String width3) {
        regWidth3(CK_EQ, width3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WIDTH3: {varchar(30), default=[(0)]}
     * @param width3 The value of width3 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWidth3_NotEqual(String width3) {
        doSetWidth3_NotEqual(fRES(width3));
    }

    protected void doSetWidth3_NotEqual(String width3) {
        regWidth3(CK_NES, width3);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WIDTH3: {varchar(30), default=[(0)]}
     * @param width3 The value of width3 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWidth3_GreaterThan(String width3) {
        regWidth3(CK_GT, fRES(width3));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WIDTH3: {varchar(30), default=[(0)]}
     * @param width3 The value of width3 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWidth3_LessThan(String width3) {
        regWidth3(CK_LT, fRES(width3));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WIDTH3: {varchar(30), default=[(0)]}
     * @param width3 The value of width3 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWidth3_GreaterEqual(String width3) {
        regWidth3(CK_GE, fRES(width3));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WIDTH3: {varchar(30), default=[(0)]}
     * @param width3 The value of width3 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWidth3_LessEqual(String width3) {
        regWidth3(CK_LE, fRES(width3));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WIDTH3: {varchar(30), default=[(0)]}
     * @param width3List The collection of width3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWidth3_InScope(Collection<String> width3List) {
        doSetWidth3_InScope(width3List);
    }

    protected void doSetWidth3_InScope(Collection<String> width3List) {
        regINS(CK_INS, cTL(width3List), xgetCValueWidth3(), "WIDTH3");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WIDTH3: {varchar(30), default=[(0)]}
     * @param width3List The collection of width3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWidth3_NotInScope(Collection<String> width3List) {
        doSetWidth3_NotInScope(width3List);
    }

    protected void doSetWidth3_NotInScope(Collection<String> width3List) {
        regINS(CK_NINS, cTL(width3List), xgetCValueWidth3(), "WIDTH3");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WIDTH3: {varchar(30), default=[(0)]} <br>
     * <pre>e.g. setWidth3_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param width3 The value of width3 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setWidth3_LikeSearch(String width3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(width3), xgetCValueWidth3(), "WIDTH3", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WIDTH3: {varchar(30), default=[(0)]}
     * @param width3 The value of width3 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setWidth3_NotLikeSearch(String width3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(width3), xgetCValueWidth3(), "WIDTH3", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WIDTH3: {varchar(30), default=[(0)]}
     * @param width3 The value of width3 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWidth3_PrefixSearch(String width3) {
        setWidth3_LikeSearch(width3, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * WIDTH3: {varchar(30), default=[(0)]}
     */
    public void setWidth3_IsNull() { regWidth3(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * WIDTH3: {varchar(30), default=[(0)]}
     */
    public void setWidth3_IsNullOrEmpty() { regWidth3(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * WIDTH3: {varchar(30), default=[(0)]}
     */
    public void setWidth3_IsNotNull() { regWidth3(CK_ISNN, DOBJ); }

    protected void regWidth3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWidth3(), "WIDTH3"); }
    protected abstract ConditionValue xgetCValueWidth3();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HEIGHT3: {varchar(30), default=[(0)]}
     * @param height3 The value of height3 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHeight3_Equal(String height3) {
        doSetHeight3_Equal(fRES(height3));
    }

    protected void doSetHeight3_Equal(String height3) {
        regHeight3(CK_EQ, height3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HEIGHT3: {varchar(30), default=[(0)]}
     * @param height3 The value of height3 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHeight3_NotEqual(String height3) {
        doSetHeight3_NotEqual(fRES(height3));
    }

    protected void doSetHeight3_NotEqual(String height3) {
        regHeight3(CK_NES, height3);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HEIGHT3: {varchar(30), default=[(0)]}
     * @param height3 The value of height3 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHeight3_GreaterThan(String height3) {
        regHeight3(CK_GT, fRES(height3));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HEIGHT3: {varchar(30), default=[(0)]}
     * @param height3 The value of height3 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHeight3_LessThan(String height3) {
        regHeight3(CK_LT, fRES(height3));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HEIGHT3: {varchar(30), default=[(0)]}
     * @param height3 The value of height3 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHeight3_GreaterEqual(String height3) {
        regHeight3(CK_GE, fRES(height3));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HEIGHT3: {varchar(30), default=[(0)]}
     * @param height3 The value of height3 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHeight3_LessEqual(String height3) {
        regHeight3(CK_LE, fRES(height3));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * HEIGHT3: {varchar(30), default=[(0)]}
     * @param height3List The collection of height3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHeight3_InScope(Collection<String> height3List) {
        doSetHeight3_InScope(height3List);
    }

    protected void doSetHeight3_InScope(Collection<String> height3List) {
        regINS(CK_INS, cTL(height3List), xgetCValueHeight3(), "HEIGHT3");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * HEIGHT3: {varchar(30), default=[(0)]}
     * @param height3List The collection of height3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHeight3_NotInScope(Collection<String> height3List) {
        doSetHeight3_NotInScope(height3List);
    }

    protected void doSetHeight3_NotInScope(Collection<String> height3List) {
        regINS(CK_NINS, cTL(height3List), xgetCValueHeight3(), "HEIGHT3");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HEIGHT3: {varchar(30), default=[(0)]} <br>
     * <pre>e.g. setHeight3_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param height3 The value of height3 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setHeight3_LikeSearch(String height3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(height3), xgetCValueHeight3(), "HEIGHT3", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HEIGHT3: {varchar(30), default=[(0)]}
     * @param height3 The value of height3 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setHeight3_NotLikeSearch(String height3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(height3), xgetCValueHeight3(), "HEIGHT3", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HEIGHT3: {varchar(30), default=[(0)]}
     * @param height3 The value of height3 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHeight3_PrefixSearch(String height3) {
        setHeight3_LikeSearch(height3, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * HEIGHT3: {varchar(30), default=[(0)]}
     */
    public void setHeight3_IsNull() { regHeight3(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * HEIGHT3: {varchar(30), default=[(0)]}
     */
    public void setHeight3_IsNullOrEmpty() { regHeight3(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * HEIGHT3: {varchar(30), default=[(0)]}
     */
    public void setHeight3_IsNotNull() { regHeight3(CK_ISNN, DOBJ); }

    protected void regHeight3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueHeight3(), "HEIGHT3"); }
    protected abstract ConditionValue xgetCValueHeight3();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GROSSWEIGHT3: {varchar(30), default=[(0)]}
     * @param grossweight3 The value of grossweight3 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGrossweight3_Equal(String grossweight3) {
        doSetGrossweight3_Equal(fRES(grossweight3));
    }

    protected void doSetGrossweight3_Equal(String grossweight3) {
        regGrossweight3(CK_EQ, grossweight3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GROSSWEIGHT3: {varchar(30), default=[(0)]}
     * @param grossweight3 The value of grossweight3 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGrossweight3_NotEqual(String grossweight3) {
        doSetGrossweight3_NotEqual(fRES(grossweight3));
    }

    protected void doSetGrossweight3_NotEqual(String grossweight3) {
        regGrossweight3(CK_NES, grossweight3);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GROSSWEIGHT3: {varchar(30), default=[(0)]}
     * @param grossweight3 The value of grossweight3 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGrossweight3_GreaterThan(String grossweight3) {
        regGrossweight3(CK_GT, fRES(grossweight3));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GROSSWEIGHT3: {varchar(30), default=[(0)]}
     * @param grossweight3 The value of grossweight3 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGrossweight3_LessThan(String grossweight3) {
        regGrossweight3(CK_LT, fRES(grossweight3));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GROSSWEIGHT3: {varchar(30), default=[(0)]}
     * @param grossweight3 The value of grossweight3 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGrossweight3_GreaterEqual(String grossweight3) {
        regGrossweight3(CK_GE, fRES(grossweight3));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GROSSWEIGHT3: {varchar(30), default=[(0)]}
     * @param grossweight3 The value of grossweight3 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGrossweight3_LessEqual(String grossweight3) {
        regGrossweight3(CK_LE, fRES(grossweight3));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * GROSSWEIGHT3: {varchar(30), default=[(0)]}
     * @param grossweight3List The collection of grossweight3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGrossweight3_InScope(Collection<String> grossweight3List) {
        doSetGrossweight3_InScope(grossweight3List);
    }

    protected void doSetGrossweight3_InScope(Collection<String> grossweight3List) {
        regINS(CK_INS, cTL(grossweight3List), xgetCValueGrossweight3(), "GROSSWEIGHT3");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * GROSSWEIGHT3: {varchar(30), default=[(0)]}
     * @param grossweight3List The collection of grossweight3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGrossweight3_NotInScope(Collection<String> grossweight3List) {
        doSetGrossweight3_NotInScope(grossweight3List);
    }

    protected void doSetGrossweight3_NotInScope(Collection<String> grossweight3List) {
        regINS(CK_NINS, cTL(grossweight3List), xgetCValueGrossweight3(), "GROSSWEIGHT3");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * GROSSWEIGHT3: {varchar(30), default=[(0)]} <br>
     * <pre>e.g. setGrossweight3_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param grossweight3 The value of grossweight3 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setGrossweight3_LikeSearch(String grossweight3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(grossweight3), xgetCValueGrossweight3(), "GROSSWEIGHT3", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * GROSSWEIGHT3: {varchar(30), default=[(0)]}
     * @param grossweight3 The value of grossweight3 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setGrossweight3_NotLikeSearch(String grossweight3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(grossweight3), xgetCValueGrossweight3(), "GROSSWEIGHT3", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * GROSSWEIGHT3: {varchar(30), default=[(0)]}
     * @param grossweight3 The value of grossweight3 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGrossweight3_PrefixSearch(String grossweight3) {
        setGrossweight3_LikeSearch(grossweight3, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * GROSSWEIGHT3: {varchar(30), default=[(0)]}
     */
    public void setGrossweight3_IsNull() { regGrossweight3(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * GROSSWEIGHT3: {varchar(30), default=[(0)]}
     */
    public void setGrossweight3_IsNullOrEmpty() { regGrossweight3(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * GROSSWEIGHT3: {varchar(30), default=[(0)]}
     */
    public void setGrossweight3_IsNotNull() { regGrossweight3(CK_ISNN, DOBJ); }

    protected void regGrossweight3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueGrossweight3(), "GROSSWEIGHT3"); }
    protected abstract ConditionValue xgetCValueGrossweight3();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NETWEIGHT3: {varchar(30), default=[(0)]}
     * @param netweight3 The value of netweight3 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNetweight3_Equal(String netweight3) {
        doSetNetweight3_Equal(fRES(netweight3));
    }

    protected void doSetNetweight3_Equal(String netweight3) {
        regNetweight3(CK_EQ, netweight3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NETWEIGHT3: {varchar(30), default=[(0)]}
     * @param netweight3 The value of netweight3 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNetweight3_NotEqual(String netweight3) {
        doSetNetweight3_NotEqual(fRES(netweight3));
    }

    protected void doSetNetweight3_NotEqual(String netweight3) {
        regNetweight3(CK_NES, netweight3);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NETWEIGHT3: {varchar(30), default=[(0)]}
     * @param netweight3 The value of netweight3 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNetweight3_GreaterThan(String netweight3) {
        regNetweight3(CK_GT, fRES(netweight3));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NETWEIGHT3: {varchar(30), default=[(0)]}
     * @param netweight3 The value of netweight3 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNetweight3_LessThan(String netweight3) {
        regNetweight3(CK_LT, fRES(netweight3));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NETWEIGHT3: {varchar(30), default=[(0)]}
     * @param netweight3 The value of netweight3 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNetweight3_GreaterEqual(String netweight3) {
        regNetweight3(CK_GE, fRES(netweight3));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NETWEIGHT3: {varchar(30), default=[(0)]}
     * @param netweight3 The value of netweight3 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNetweight3_LessEqual(String netweight3) {
        regNetweight3(CK_LE, fRES(netweight3));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NETWEIGHT3: {varchar(30), default=[(0)]}
     * @param netweight3List The collection of netweight3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNetweight3_InScope(Collection<String> netweight3List) {
        doSetNetweight3_InScope(netweight3List);
    }

    protected void doSetNetweight3_InScope(Collection<String> netweight3List) {
        regINS(CK_INS, cTL(netweight3List), xgetCValueNetweight3(), "NETWEIGHT3");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NETWEIGHT3: {varchar(30), default=[(0)]}
     * @param netweight3List The collection of netweight3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNetweight3_NotInScope(Collection<String> netweight3List) {
        doSetNetweight3_NotInScope(netweight3List);
    }

    protected void doSetNetweight3_NotInScope(Collection<String> netweight3List) {
        regINS(CK_NINS, cTL(netweight3List), xgetCValueNetweight3(), "NETWEIGHT3");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NETWEIGHT3: {varchar(30), default=[(0)]} <br>
     * <pre>e.g. setNetweight3_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param netweight3 The value of netweight3 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setNetweight3_LikeSearch(String netweight3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(netweight3), xgetCValueNetweight3(), "NETWEIGHT3", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NETWEIGHT3: {varchar(30), default=[(0)]}
     * @param netweight3 The value of netweight3 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setNetweight3_NotLikeSearch(String netweight3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(netweight3), xgetCValueNetweight3(), "NETWEIGHT3", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NETWEIGHT3: {varchar(30), default=[(0)]}
     * @param netweight3 The value of netweight3 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNetweight3_PrefixSearch(String netweight3) {
        setNetweight3_LikeSearch(netweight3, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * NETWEIGHT3: {varchar(30), default=[(0)]}
     */
    public void setNetweight3_IsNull() { regNetweight3(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * NETWEIGHT3: {varchar(30), default=[(0)]}
     */
    public void setNetweight3_IsNullOrEmpty() { regNetweight3(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * NETWEIGHT3: {varchar(30), default=[(0)]}
     */
    public void setNetweight3_IsNotNull() { regNetweight3(CK_ISNN, DOBJ); }

    protected void regNetweight3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNetweight3(), "NETWEIGHT3"); }
    protected abstract ConditionValue xgetCValueNetweight3();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUBE3: {varchar(30), default=[(0)]}
     * @param cube3 The value of cube3 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCube3_Equal(String cube3) {
        doSetCube3_Equal(fRES(cube3));
    }

    protected void doSetCube3_Equal(String cube3) {
        regCube3(CK_EQ, cube3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUBE3: {varchar(30), default=[(0)]}
     * @param cube3 The value of cube3 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCube3_NotEqual(String cube3) {
        doSetCube3_NotEqual(fRES(cube3));
    }

    protected void doSetCube3_NotEqual(String cube3) {
        regCube3(CK_NES, cube3);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUBE3: {varchar(30), default=[(0)]}
     * @param cube3 The value of cube3 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCube3_GreaterThan(String cube3) {
        regCube3(CK_GT, fRES(cube3));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUBE3: {varchar(30), default=[(0)]}
     * @param cube3 The value of cube3 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCube3_LessThan(String cube3) {
        regCube3(CK_LT, fRES(cube3));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUBE3: {varchar(30), default=[(0)]}
     * @param cube3 The value of cube3 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCube3_GreaterEqual(String cube3) {
        regCube3(CK_GE, fRES(cube3));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUBE3: {varchar(30), default=[(0)]}
     * @param cube3 The value of cube3 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCube3_LessEqual(String cube3) {
        regCube3(CK_LE, fRES(cube3));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CUBE3: {varchar(30), default=[(0)]}
     * @param cube3List The collection of cube3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCube3_InScope(Collection<String> cube3List) {
        doSetCube3_InScope(cube3List);
    }

    protected void doSetCube3_InScope(Collection<String> cube3List) {
        regINS(CK_INS, cTL(cube3List), xgetCValueCube3(), "CUBE3");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CUBE3: {varchar(30), default=[(0)]}
     * @param cube3List The collection of cube3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCube3_NotInScope(Collection<String> cube3List) {
        doSetCube3_NotInScope(cube3List);
    }

    protected void doSetCube3_NotInScope(Collection<String> cube3List) {
        regINS(CK_NINS, cTL(cube3List), xgetCValueCube3(), "CUBE3");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CUBE3: {varchar(30), default=[(0)]} <br>
     * <pre>e.g. setCube3_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param cube3 The value of cube3 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCube3_LikeSearch(String cube3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(cube3), xgetCValueCube3(), "CUBE3", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CUBE3: {varchar(30), default=[(0)]}
     * @param cube3 The value of cube3 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCube3_NotLikeSearch(String cube3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(cube3), xgetCValueCube3(), "CUBE3", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CUBE3: {varchar(30), default=[(0)]}
     * @param cube3 The value of cube3 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCube3_PrefixSearch(String cube3) {
        setCube3_LikeSearch(cube3, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CUBE3: {varchar(30), default=[(0)]}
     */
    public void setCube3_IsNull() { regCube3(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CUBE3: {varchar(30), default=[(0)]}
     */
    public void setCube3_IsNullOrEmpty() { regCube3(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CUBE3: {varchar(30), default=[(0)]}
     */
    public void setCube3_IsNotNull() { regCube3(CK_ISNN, DOBJ); }

    protected void regCube3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCube3(), "CUBE3"); }
    protected abstract ConditionValue xgetCValueCube3();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LITER3: {varchar(30), default=[(0)]}
     * @param liter3 The value of liter3 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLiter3_Equal(String liter3) {
        doSetLiter3_Equal(fRES(liter3));
    }

    protected void doSetLiter3_Equal(String liter3) {
        regLiter3(CK_EQ, liter3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LITER3: {varchar(30), default=[(0)]}
     * @param liter3 The value of liter3 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLiter3_NotEqual(String liter3) {
        doSetLiter3_NotEqual(fRES(liter3));
    }

    protected void doSetLiter3_NotEqual(String liter3) {
        regLiter3(CK_NES, liter3);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LITER3: {varchar(30), default=[(0)]}
     * @param liter3 The value of liter3 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLiter3_GreaterThan(String liter3) {
        regLiter3(CK_GT, fRES(liter3));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LITER3: {varchar(30), default=[(0)]}
     * @param liter3 The value of liter3 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLiter3_LessThan(String liter3) {
        regLiter3(CK_LT, fRES(liter3));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LITER3: {varchar(30), default=[(0)]}
     * @param liter3 The value of liter3 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLiter3_GreaterEqual(String liter3) {
        regLiter3(CK_GE, fRES(liter3));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LITER3: {varchar(30), default=[(0)]}
     * @param liter3 The value of liter3 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLiter3_LessEqual(String liter3) {
        regLiter3(CK_LE, fRES(liter3));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LITER3: {varchar(30), default=[(0)]}
     * @param liter3List The collection of liter3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLiter3_InScope(Collection<String> liter3List) {
        doSetLiter3_InScope(liter3List);
    }

    protected void doSetLiter3_InScope(Collection<String> liter3List) {
        regINS(CK_INS, cTL(liter3List), xgetCValueLiter3(), "LITER3");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LITER3: {varchar(30), default=[(0)]}
     * @param liter3List The collection of liter3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLiter3_NotInScope(Collection<String> liter3List) {
        doSetLiter3_NotInScope(liter3List);
    }

    protected void doSetLiter3_NotInScope(Collection<String> liter3List) {
        regINS(CK_NINS, cTL(liter3List), xgetCValueLiter3(), "LITER3");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LITER3: {varchar(30), default=[(0)]} <br>
     * <pre>e.g. setLiter3_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param liter3 The value of liter3 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLiter3_LikeSearch(String liter3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(liter3), xgetCValueLiter3(), "LITER3", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LITER3: {varchar(30), default=[(0)]}
     * @param liter3 The value of liter3 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLiter3_NotLikeSearch(String liter3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(liter3), xgetCValueLiter3(), "LITER3", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LITER3: {varchar(30), default=[(0)]}
     * @param liter3 The value of liter3 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLiter3_PrefixSearch(String liter3) {
        setLiter3_LikeSearch(liter3, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LITER3: {varchar(30), default=[(0)]}
     */
    public void setLiter3_IsNull() { regLiter3(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LITER3: {varchar(30), default=[(0)]}
     */
    public void setLiter3_IsNullOrEmpty() { regLiter3(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LITER3: {varchar(30), default=[(0)]}
     */
    public void setLiter3_IsNotNull() { regLiter3(CK_ISNN, DOBJ); }

    protected void regLiter3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLiter3(), "LITER3"); }
    protected abstract ConditionValue xgetCValueLiter3();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * P_QTY: {varchar(30), default=[(0)]}
     * @param pQty The value of pQty as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPQty_Equal(String pQty) {
        doSetPQty_Equal(fRES(pQty));
    }

    protected void doSetPQty_Equal(String pQty) {
        regPQty(CK_EQ, pQty);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * P_QTY: {varchar(30), default=[(0)]}
     * @param pQty The value of pQty as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPQty_NotEqual(String pQty) {
        doSetPQty_NotEqual(fRES(pQty));
    }

    protected void doSetPQty_NotEqual(String pQty) {
        regPQty(CK_NES, pQty);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * P_QTY: {varchar(30), default=[(0)]}
     * @param pQty The value of pQty as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPQty_GreaterThan(String pQty) {
        regPQty(CK_GT, fRES(pQty));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * P_QTY: {varchar(30), default=[(0)]}
     * @param pQty The value of pQty as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPQty_LessThan(String pQty) {
        regPQty(CK_LT, fRES(pQty));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * P_QTY: {varchar(30), default=[(0)]}
     * @param pQty The value of pQty as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPQty_GreaterEqual(String pQty) {
        regPQty(CK_GE, fRES(pQty));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * P_QTY: {varchar(30), default=[(0)]}
     * @param pQty The value of pQty as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPQty_LessEqual(String pQty) {
        regPQty(CK_LE, fRES(pQty));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * P_QTY: {varchar(30), default=[(0)]}
     * @param pQtyList The collection of pQty as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPQty_InScope(Collection<String> pQtyList) {
        doSetPQty_InScope(pQtyList);
    }

    protected void doSetPQty_InScope(Collection<String> pQtyList) {
        regINS(CK_INS, cTL(pQtyList), xgetCValuePQty(), "P_QTY");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * P_QTY: {varchar(30), default=[(0)]}
     * @param pQtyList The collection of pQty as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPQty_NotInScope(Collection<String> pQtyList) {
        doSetPQty_NotInScope(pQtyList);
    }

    protected void doSetPQty_NotInScope(Collection<String> pQtyList) {
        regINS(CK_NINS, cTL(pQtyList), xgetCValuePQty(), "P_QTY");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * P_QTY: {varchar(30), default=[(0)]} <br>
     * <pre>e.g. setPQty_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param pQty The value of pQty as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPQty_LikeSearch(String pQty, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(pQty), xgetCValuePQty(), "P_QTY", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * P_QTY: {varchar(30), default=[(0)]}
     * @param pQty The value of pQty as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPQty_NotLikeSearch(String pQty, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(pQty), xgetCValuePQty(), "P_QTY", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * P_QTY: {varchar(30), default=[(0)]}
     * @param pQty The value of pQty as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPQty_PrefixSearch(String pQty) {
        setPQty_LikeSearch(pQty, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * P_QTY: {varchar(30), default=[(0)]}
     */
    public void setPQty_IsNull() { regPQty(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * P_QTY: {varchar(30), default=[(0)]}
     */
    public void setPQty_IsNullOrEmpty() { regPQty(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * P_QTY: {varchar(30), default=[(0)]}
     */
    public void setPQty_IsNotNull() { regPQty(CK_ISNN, DOBJ); }

    protected void regPQty(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePQty(), "P_QTY"); }
    protected abstract ConditionValue xgetCValuePQty();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * P_HEIGHT: {varchar(30), default=[(0)]}
     * @param pHeight The value of pHeight as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPHeight_Equal(String pHeight) {
        doSetPHeight_Equal(fRES(pHeight));
    }

    protected void doSetPHeight_Equal(String pHeight) {
        regPHeight(CK_EQ, pHeight);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * P_HEIGHT: {varchar(30), default=[(0)]}
     * @param pHeight The value of pHeight as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPHeight_NotEqual(String pHeight) {
        doSetPHeight_NotEqual(fRES(pHeight));
    }

    protected void doSetPHeight_NotEqual(String pHeight) {
        regPHeight(CK_NES, pHeight);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * P_HEIGHT: {varchar(30), default=[(0)]}
     * @param pHeight The value of pHeight as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPHeight_GreaterThan(String pHeight) {
        regPHeight(CK_GT, fRES(pHeight));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * P_HEIGHT: {varchar(30), default=[(0)]}
     * @param pHeight The value of pHeight as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPHeight_LessThan(String pHeight) {
        regPHeight(CK_LT, fRES(pHeight));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * P_HEIGHT: {varchar(30), default=[(0)]}
     * @param pHeight The value of pHeight as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPHeight_GreaterEqual(String pHeight) {
        regPHeight(CK_GE, fRES(pHeight));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * P_HEIGHT: {varchar(30), default=[(0)]}
     * @param pHeight The value of pHeight as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPHeight_LessEqual(String pHeight) {
        regPHeight(CK_LE, fRES(pHeight));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * P_HEIGHT: {varchar(30), default=[(0)]}
     * @param pHeightList The collection of pHeight as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPHeight_InScope(Collection<String> pHeightList) {
        doSetPHeight_InScope(pHeightList);
    }

    protected void doSetPHeight_InScope(Collection<String> pHeightList) {
        regINS(CK_INS, cTL(pHeightList), xgetCValuePHeight(), "P_HEIGHT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * P_HEIGHT: {varchar(30), default=[(0)]}
     * @param pHeightList The collection of pHeight as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPHeight_NotInScope(Collection<String> pHeightList) {
        doSetPHeight_NotInScope(pHeightList);
    }

    protected void doSetPHeight_NotInScope(Collection<String> pHeightList) {
        regINS(CK_NINS, cTL(pHeightList), xgetCValuePHeight(), "P_HEIGHT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * P_HEIGHT: {varchar(30), default=[(0)]} <br>
     * <pre>e.g. setPHeight_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param pHeight The value of pHeight as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPHeight_LikeSearch(String pHeight, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(pHeight), xgetCValuePHeight(), "P_HEIGHT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * P_HEIGHT: {varchar(30), default=[(0)]}
     * @param pHeight The value of pHeight as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPHeight_NotLikeSearch(String pHeight, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(pHeight), xgetCValuePHeight(), "P_HEIGHT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * P_HEIGHT: {varchar(30), default=[(0)]}
     * @param pHeight The value of pHeight as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPHeight_PrefixSearch(String pHeight) {
        setPHeight_LikeSearch(pHeight, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * P_HEIGHT: {varchar(30), default=[(0)]}
     */
    public void setPHeight_IsNull() { regPHeight(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * P_HEIGHT: {varchar(30), default=[(0)]}
     */
    public void setPHeight_IsNullOrEmpty() { regPHeight(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * P_HEIGHT: {varchar(30), default=[(0)]}
     */
    public void setPHeight_IsNotNull() { regPHeight(CK_ISNN, DOBJ); }

    protected void regPHeight(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePHeight(), "P_HEIGHT"); }
    protected abstract ConditionValue xgetCValuePHeight();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * P_ODD: {varchar(30), default=[(0)]}
     * @param pOdd The value of pOdd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPOdd_Equal(String pOdd) {
        doSetPOdd_Equal(fRES(pOdd));
    }

    protected void doSetPOdd_Equal(String pOdd) {
        regPOdd(CK_EQ, pOdd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * P_ODD: {varchar(30), default=[(0)]}
     * @param pOdd The value of pOdd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPOdd_NotEqual(String pOdd) {
        doSetPOdd_NotEqual(fRES(pOdd));
    }

    protected void doSetPOdd_NotEqual(String pOdd) {
        regPOdd(CK_NES, pOdd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * P_ODD: {varchar(30), default=[(0)]}
     * @param pOdd The value of pOdd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPOdd_GreaterThan(String pOdd) {
        regPOdd(CK_GT, fRES(pOdd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * P_ODD: {varchar(30), default=[(0)]}
     * @param pOdd The value of pOdd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPOdd_LessThan(String pOdd) {
        regPOdd(CK_LT, fRES(pOdd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * P_ODD: {varchar(30), default=[(0)]}
     * @param pOdd The value of pOdd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPOdd_GreaterEqual(String pOdd) {
        regPOdd(CK_GE, fRES(pOdd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * P_ODD: {varchar(30), default=[(0)]}
     * @param pOdd The value of pOdd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPOdd_LessEqual(String pOdd) {
        regPOdd(CK_LE, fRES(pOdd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * P_ODD: {varchar(30), default=[(0)]}
     * @param pOddList The collection of pOdd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPOdd_InScope(Collection<String> pOddList) {
        doSetPOdd_InScope(pOddList);
    }

    protected void doSetPOdd_InScope(Collection<String> pOddList) {
        regINS(CK_INS, cTL(pOddList), xgetCValuePOdd(), "P_ODD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * P_ODD: {varchar(30), default=[(0)]}
     * @param pOddList The collection of pOdd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPOdd_NotInScope(Collection<String> pOddList) {
        doSetPOdd_NotInScope(pOddList);
    }

    protected void doSetPOdd_NotInScope(Collection<String> pOddList) {
        regINS(CK_NINS, cTL(pOddList), xgetCValuePOdd(), "P_ODD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * P_ODD: {varchar(30), default=[(0)]} <br>
     * <pre>e.g. setPOdd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param pOdd The value of pOdd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPOdd_LikeSearch(String pOdd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(pOdd), xgetCValuePOdd(), "P_ODD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * P_ODD: {varchar(30), default=[(0)]}
     * @param pOdd The value of pOdd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPOdd_NotLikeSearch(String pOdd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(pOdd), xgetCValuePOdd(), "P_ODD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * P_ODD: {varchar(30), default=[(0)]}
     * @param pOdd The value of pOdd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPOdd_PrefixSearch(String pOdd) {
        setPOdd_LikeSearch(pOdd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * P_ODD: {varchar(30), default=[(0)]}
     */
    public void setPOdd_IsNull() { regPOdd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * P_ODD: {varchar(30), default=[(0)]}
     */
    public void setPOdd_IsNullOrEmpty() { regPOdd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * P_ODD: {varchar(30), default=[(0)]}
     */
    public void setPOdd_IsNotNull() { regPOdd(CK_ISNN, DOBJ); }

    protected void regPOdd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePOdd(), "P_ODD"); }
    protected abstract ConditionValue xgetCValuePOdd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NOTES: {varchar(4000)}
     * @param notes The value of notes as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNotes_Equal(String notes) {
        doSetNotes_Equal(fRES(notes));
    }

    protected void doSetNotes_Equal(String notes) {
        regNotes(CK_EQ, notes);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NOTES: {varchar(4000)}
     * @param notes The value of notes as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNotes_NotEqual(String notes) {
        doSetNotes_NotEqual(fRES(notes));
    }

    protected void doSetNotes_NotEqual(String notes) {
        regNotes(CK_NES, notes);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NOTES: {varchar(4000)}
     * @param notes The value of notes as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNotes_GreaterThan(String notes) {
        regNotes(CK_GT, fRES(notes));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NOTES: {varchar(4000)}
     * @param notes The value of notes as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNotes_LessThan(String notes) {
        regNotes(CK_LT, fRES(notes));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NOTES: {varchar(4000)}
     * @param notes The value of notes as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNotes_GreaterEqual(String notes) {
        regNotes(CK_GE, fRES(notes));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NOTES: {varchar(4000)}
     * @param notes The value of notes as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNotes_LessEqual(String notes) {
        regNotes(CK_LE, fRES(notes));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NOTES: {varchar(4000)}
     * @param notesList The collection of notes as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNotes_InScope(Collection<String> notesList) {
        doSetNotes_InScope(notesList);
    }

    protected void doSetNotes_InScope(Collection<String> notesList) {
        regINS(CK_INS, cTL(notesList), xgetCValueNotes(), "NOTES");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NOTES: {varchar(4000)}
     * @param notesList The collection of notes as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNotes_NotInScope(Collection<String> notesList) {
        doSetNotes_NotInScope(notesList);
    }

    protected void doSetNotes_NotInScope(Collection<String> notesList) {
        regINS(CK_NINS, cTL(notesList), xgetCValueNotes(), "NOTES");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NOTES: {varchar(4000)} <br>
     * <pre>e.g. setNotes_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param notes The value of notes as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setNotes_LikeSearch(String notes, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(notes), xgetCValueNotes(), "NOTES", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NOTES: {varchar(4000)}
     * @param notes The value of notes as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setNotes_NotLikeSearch(String notes, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(notes), xgetCValueNotes(), "NOTES", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NOTES: {varchar(4000)}
     * @param notes The value of notes as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNotes_PrefixSearch(String notes) {
        setNotes_LikeSearch(notes, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * NOTES: {varchar(4000)}
     */
    public void setNotes_IsNull() { regNotes(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * NOTES: {varchar(4000)}
     */
    public void setNotes_IsNullOrEmpty() { regNotes(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * NOTES: {varchar(4000)}
     */
    public void setNotes_IsNotNull() { regNotes(CK_ISNN, DOBJ); }

    protected void regNotes(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNotes(), "NOTES"); }
    protected abstract ConditionValue xgetCValueNotes();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * F_USER1: {varchar(30)}
     * @param fUser1 The value of fUser1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFUser1_Equal(String fUser1) {
        doSetFUser1_Equal(fRES(fUser1));
    }

    protected void doSetFUser1_Equal(String fUser1) {
        regFUser1(CK_EQ, fUser1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * F_USER1: {varchar(30)}
     * @param fUser1 The value of fUser1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFUser1_NotEqual(String fUser1) {
        doSetFUser1_NotEqual(fRES(fUser1));
    }

    protected void doSetFUser1_NotEqual(String fUser1) {
        regFUser1(CK_NES, fUser1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * F_USER1: {varchar(30)}
     * @param fUser1 The value of fUser1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFUser1_GreaterThan(String fUser1) {
        regFUser1(CK_GT, fRES(fUser1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * F_USER1: {varchar(30)}
     * @param fUser1 The value of fUser1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFUser1_LessThan(String fUser1) {
        regFUser1(CK_LT, fRES(fUser1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * F_USER1: {varchar(30)}
     * @param fUser1 The value of fUser1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFUser1_GreaterEqual(String fUser1) {
        regFUser1(CK_GE, fRES(fUser1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * F_USER1: {varchar(30)}
     * @param fUser1 The value of fUser1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFUser1_LessEqual(String fUser1) {
        regFUser1(CK_LE, fRES(fUser1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * F_USER1: {varchar(30)}
     * @param fUser1List The collection of fUser1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFUser1_InScope(Collection<String> fUser1List) {
        doSetFUser1_InScope(fUser1List);
    }

    protected void doSetFUser1_InScope(Collection<String> fUser1List) {
        regINS(CK_INS, cTL(fUser1List), xgetCValueFUser1(), "F_USER1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * F_USER1: {varchar(30)}
     * @param fUser1List The collection of fUser1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFUser1_NotInScope(Collection<String> fUser1List) {
        doSetFUser1_NotInScope(fUser1List);
    }

    protected void doSetFUser1_NotInScope(Collection<String> fUser1List) {
        regINS(CK_NINS, cTL(fUser1List), xgetCValueFUser1(), "F_USER1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * F_USER1: {varchar(30)} <br>
     * <pre>e.g. setFUser1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param fUser1 The value of fUser1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFUser1_LikeSearch(String fUser1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(fUser1), xgetCValueFUser1(), "F_USER1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * F_USER1: {varchar(30)}
     * @param fUser1 The value of fUser1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFUser1_NotLikeSearch(String fUser1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(fUser1), xgetCValueFUser1(), "F_USER1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * F_USER1: {varchar(30)}
     * @param fUser1 The value of fUser1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFUser1_PrefixSearch(String fUser1) {
        setFUser1_LikeSearch(fUser1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * F_USER1: {varchar(30)}
     */
    public void setFUser1_IsNull() { regFUser1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * F_USER1: {varchar(30)}
     */
    public void setFUser1_IsNullOrEmpty() { regFUser1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * F_USER1: {varchar(30)}
     */
    public void setFUser1_IsNotNull() { regFUser1(CK_ISNN, DOBJ); }

    protected void regFUser1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFUser1(), "F_USER1"); }
    protected abstract ConditionValue xgetCValueFUser1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * F_USER2: {varchar(30)}
     * @param fUser2 The value of fUser2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFUser2_Equal(String fUser2) {
        doSetFUser2_Equal(fRES(fUser2));
    }

    protected void doSetFUser2_Equal(String fUser2) {
        regFUser2(CK_EQ, fUser2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * F_USER2: {varchar(30)}
     * @param fUser2 The value of fUser2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFUser2_NotEqual(String fUser2) {
        doSetFUser2_NotEqual(fRES(fUser2));
    }

    protected void doSetFUser2_NotEqual(String fUser2) {
        regFUser2(CK_NES, fUser2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * F_USER2: {varchar(30)}
     * @param fUser2 The value of fUser2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFUser2_GreaterThan(String fUser2) {
        regFUser2(CK_GT, fRES(fUser2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * F_USER2: {varchar(30)}
     * @param fUser2 The value of fUser2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFUser2_LessThan(String fUser2) {
        regFUser2(CK_LT, fRES(fUser2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * F_USER2: {varchar(30)}
     * @param fUser2 The value of fUser2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFUser2_GreaterEqual(String fUser2) {
        regFUser2(CK_GE, fRES(fUser2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * F_USER2: {varchar(30)}
     * @param fUser2 The value of fUser2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFUser2_LessEqual(String fUser2) {
        regFUser2(CK_LE, fRES(fUser2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * F_USER2: {varchar(30)}
     * @param fUser2List The collection of fUser2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFUser2_InScope(Collection<String> fUser2List) {
        doSetFUser2_InScope(fUser2List);
    }

    protected void doSetFUser2_InScope(Collection<String> fUser2List) {
        regINS(CK_INS, cTL(fUser2List), xgetCValueFUser2(), "F_USER2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * F_USER2: {varchar(30)}
     * @param fUser2List The collection of fUser2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFUser2_NotInScope(Collection<String> fUser2List) {
        doSetFUser2_NotInScope(fUser2List);
    }

    protected void doSetFUser2_NotInScope(Collection<String> fUser2List) {
        regINS(CK_NINS, cTL(fUser2List), xgetCValueFUser2(), "F_USER2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * F_USER2: {varchar(30)} <br>
     * <pre>e.g. setFUser2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param fUser2 The value of fUser2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFUser2_LikeSearch(String fUser2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(fUser2), xgetCValueFUser2(), "F_USER2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * F_USER2: {varchar(30)}
     * @param fUser2 The value of fUser2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFUser2_NotLikeSearch(String fUser2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(fUser2), xgetCValueFUser2(), "F_USER2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * F_USER2: {varchar(30)}
     * @param fUser2 The value of fUser2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFUser2_PrefixSearch(String fUser2) {
        setFUser2_LikeSearch(fUser2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * F_USER2: {varchar(30)}
     */
    public void setFUser2_IsNull() { regFUser2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * F_USER2: {varchar(30)}
     */
    public void setFUser2_IsNullOrEmpty() { regFUser2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * F_USER2: {varchar(30)}
     */
    public void setFUser2_IsNotNull() { regFUser2(CK_ISNN, DOBJ); }

    protected void regFUser2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFUser2(), "F_USER2"); }
    protected abstract ConditionValue xgetCValueFUser2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * F_USER3: {varchar(30)}
     * @param fUser3 The value of fUser3 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFUser3_Equal(String fUser3) {
        doSetFUser3_Equal(fRES(fUser3));
    }

    protected void doSetFUser3_Equal(String fUser3) {
        regFUser3(CK_EQ, fUser3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * F_USER3: {varchar(30)}
     * @param fUser3 The value of fUser3 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFUser3_NotEqual(String fUser3) {
        doSetFUser3_NotEqual(fRES(fUser3));
    }

    protected void doSetFUser3_NotEqual(String fUser3) {
        regFUser3(CK_NES, fUser3);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * F_USER3: {varchar(30)}
     * @param fUser3 The value of fUser3 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFUser3_GreaterThan(String fUser3) {
        regFUser3(CK_GT, fRES(fUser3));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * F_USER3: {varchar(30)}
     * @param fUser3 The value of fUser3 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFUser3_LessThan(String fUser3) {
        regFUser3(CK_LT, fRES(fUser3));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * F_USER3: {varchar(30)}
     * @param fUser3 The value of fUser3 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFUser3_GreaterEqual(String fUser3) {
        regFUser3(CK_GE, fRES(fUser3));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * F_USER3: {varchar(30)}
     * @param fUser3 The value of fUser3 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFUser3_LessEqual(String fUser3) {
        regFUser3(CK_LE, fRES(fUser3));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * F_USER3: {varchar(30)}
     * @param fUser3List The collection of fUser3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFUser3_InScope(Collection<String> fUser3List) {
        doSetFUser3_InScope(fUser3List);
    }

    protected void doSetFUser3_InScope(Collection<String> fUser3List) {
        regINS(CK_INS, cTL(fUser3List), xgetCValueFUser3(), "F_USER3");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * F_USER3: {varchar(30)}
     * @param fUser3List The collection of fUser3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFUser3_NotInScope(Collection<String> fUser3List) {
        doSetFUser3_NotInScope(fUser3List);
    }

    protected void doSetFUser3_NotInScope(Collection<String> fUser3List) {
        regINS(CK_NINS, cTL(fUser3List), xgetCValueFUser3(), "F_USER3");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * F_USER3: {varchar(30)} <br>
     * <pre>e.g. setFUser3_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param fUser3 The value of fUser3 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFUser3_LikeSearch(String fUser3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(fUser3), xgetCValueFUser3(), "F_USER3", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * F_USER3: {varchar(30)}
     * @param fUser3 The value of fUser3 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFUser3_NotLikeSearch(String fUser3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(fUser3), xgetCValueFUser3(), "F_USER3", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * F_USER3: {varchar(30)}
     * @param fUser3 The value of fUser3 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFUser3_PrefixSearch(String fUser3) {
        setFUser3_LikeSearch(fUser3, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * F_USER3: {varchar(30)}
     */
    public void setFUser3_IsNull() { regFUser3(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * F_USER3: {varchar(30)}
     */
    public void setFUser3_IsNullOrEmpty() { regFUser3(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * F_USER3: {varchar(30)}
     */
    public void setFUser3_IsNotNull() { regFUser3(CK_ISNN, DOBJ); }

    protected void regFUser3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFUser3(), "F_USER3"); }
    protected abstract ConditionValue xgetCValueFUser3();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * F_USER4: {varchar(30)}
     * @param fUser4 The value of fUser4 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFUser4_Equal(String fUser4) {
        doSetFUser4_Equal(fRES(fUser4));
    }

    protected void doSetFUser4_Equal(String fUser4) {
        regFUser4(CK_EQ, fUser4);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * F_USER4: {varchar(30)}
     * @param fUser4 The value of fUser4 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFUser4_NotEqual(String fUser4) {
        doSetFUser4_NotEqual(fRES(fUser4));
    }

    protected void doSetFUser4_NotEqual(String fUser4) {
        regFUser4(CK_NES, fUser4);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * F_USER4: {varchar(30)}
     * @param fUser4 The value of fUser4 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFUser4_GreaterThan(String fUser4) {
        regFUser4(CK_GT, fRES(fUser4));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * F_USER4: {varchar(30)}
     * @param fUser4 The value of fUser4 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFUser4_LessThan(String fUser4) {
        regFUser4(CK_LT, fRES(fUser4));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * F_USER4: {varchar(30)}
     * @param fUser4 The value of fUser4 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFUser4_GreaterEqual(String fUser4) {
        regFUser4(CK_GE, fRES(fUser4));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * F_USER4: {varchar(30)}
     * @param fUser4 The value of fUser4 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFUser4_LessEqual(String fUser4) {
        regFUser4(CK_LE, fRES(fUser4));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * F_USER4: {varchar(30)}
     * @param fUser4List The collection of fUser4 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFUser4_InScope(Collection<String> fUser4List) {
        doSetFUser4_InScope(fUser4List);
    }

    protected void doSetFUser4_InScope(Collection<String> fUser4List) {
        regINS(CK_INS, cTL(fUser4List), xgetCValueFUser4(), "F_USER4");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * F_USER4: {varchar(30)}
     * @param fUser4List The collection of fUser4 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFUser4_NotInScope(Collection<String> fUser4List) {
        doSetFUser4_NotInScope(fUser4List);
    }

    protected void doSetFUser4_NotInScope(Collection<String> fUser4List) {
        regINS(CK_NINS, cTL(fUser4List), xgetCValueFUser4(), "F_USER4");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * F_USER4: {varchar(30)} <br>
     * <pre>e.g. setFUser4_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param fUser4 The value of fUser4 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFUser4_LikeSearch(String fUser4, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(fUser4), xgetCValueFUser4(), "F_USER4", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * F_USER4: {varchar(30)}
     * @param fUser4 The value of fUser4 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFUser4_NotLikeSearch(String fUser4, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(fUser4), xgetCValueFUser4(), "F_USER4", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * F_USER4: {varchar(30)}
     * @param fUser4 The value of fUser4 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFUser4_PrefixSearch(String fUser4) {
        setFUser4_LikeSearch(fUser4, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * F_USER4: {varchar(30)}
     */
    public void setFUser4_IsNull() { regFUser4(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * F_USER4: {varchar(30)}
     */
    public void setFUser4_IsNullOrEmpty() { regFUser4(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * F_USER4: {varchar(30)}
     */
    public void setFUser4_IsNotNull() { regFUser4(CK_ISNN, DOBJ); }

    protected void regFUser4(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFUser4(), "F_USER4"); }
    protected abstract ConditionValue xgetCValueFUser4();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * F_USER5: {varchar(30)}
     * @param fUser5 The value of fUser5 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFUser5_Equal(String fUser5) {
        doSetFUser5_Equal(fRES(fUser5));
    }

    protected void doSetFUser5_Equal(String fUser5) {
        regFUser5(CK_EQ, fUser5);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * F_USER5: {varchar(30)}
     * @param fUser5 The value of fUser5 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFUser5_NotEqual(String fUser5) {
        doSetFUser5_NotEqual(fRES(fUser5));
    }

    protected void doSetFUser5_NotEqual(String fUser5) {
        regFUser5(CK_NES, fUser5);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * F_USER5: {varchar(30)}
     * @param fUser5 The value of fUser5 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFUser5_GreaterThan(String fUser5) {
        regFUser5(CK_GT, fRES(fUser5));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * F_USER5: {varchar(30)}
     * @param fUser5 The value of fUser5 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFUser5_LessThan(String fUser5) {
        regFUser5(CK_LT, fRES(fUser5));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * F_USER5: {varchar(30)}
     * @param fUser5 The value of fUser5 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFUser5_GreaterEqual(String fUser5) {
        regFUser5(CK_GE, fRES(fUser5));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * F_USER5: {varchar(30)}
     * @param fUser5 The value of fUser5 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFUser5_LessEqual(String fUser5) {
        regFUser5(CK_LE, fRES(fUser5));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * F_USER5: {varchar(30)}
     * @param fUser5List The collection of fUser5 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFUser5_InScope(Collection<String> fUser5List) {
        doSetFUser5_InScope(fUser5List);
    }

    protected void doSetFUser5_InScope(Collection<String> fUser5List) {
        regINS(CK_INS, cTL(fUser5List), xgetCValueFUser5(), "F_USER5");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * F_USER5: {varchar(30)}
     * @param fUser5List The collection of fUser5 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFUser5_NotInScope(Collection<String> fUser5List) {
        doSetFUser5_NotInScope(fUser5List);
    }

    protected void doSetFUser5_NotInScope(Collection<String> fUser5List) {
        regINS(CK_NINS, cTL(fUser5List), xgetCValueFUser5(), "F_USER5");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * F_USER5: {varchar(30)} <br>
     * <pre>e.g. setFUser5_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param fUser5 The value of fUser5 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFUser5_LikeSearch(String fUser5, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(fUser5), xgetCValueFUser5(), "F_USER5", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * F_USER5: {varchar(30)}
     * @param fUser5 The value of fUser5 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFUser5_NotLikeSearch(String fUser5, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(fUser5), xgetCValueFUser5(), "F_USER5", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * F_USER5: {varchar(30)}
     * @param fUser5 The value of fUser5 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFUser5_PrefixSearch(String fUser5) {
        setFUser5_LikeSearch(fUser5, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * F_USER5: {varchar(30)}
     */
    public void setFUser5_IsNull() { regFUser5(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * F_USER5: {varchar(30)}
     */
    public void setFUser5_IsNullOrEmpty() { regFUser5(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * F_USER5: {varchar(30)}
     */
    public void setFUser5_IsNotNull() { regFUser5(CK_ISNN, DOBJ); }

    protected void regFUser5(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFUser5(), "F_USER5"); }
    protected abstract ConditionValue xgetCValueFUser5();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRICE_INSURANCE: {varchar(30), default=[(0)]}
     * @param priceInsurance The value of priceInsurance as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPriceInsurance_Equal(String priceInsurance) {
        doSetPriceInsurance_Equal(fRES(priceInsurance));
    }

    protected void doSetPriceInsurance_Equal(String priceInsurance) {
        regPriceInsurance(CK_EQ, priceInsurance);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRICE_INSURANCE: {varchar(30), default=[(0)]}
     * @param priceInsurance The value of priceInsurance as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPriceInsurance_NotEqual(String priceInsurance) {
        doSetPriceInsurance_NotEqual(fRES(priceInsurance));
    }

    protected void doSetPriceInsurance_NotEqual(String priceInsurance) {
        regPriceInsurance(CK_NES, priceInsurance);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRICE_INSURANCE: {varchar(30), default=[(0)]}
     * @param priceInsurance The value of priceInsurance as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPriceInsurance_GreaterThan(String priceInsurance) {
        regPriceInsurance(CK_GT, fRES(priceInsurance));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRICE_INSURANCE: {varchar(30), default=[(0)]}
     * @param priceInsurance The value of priceInsurance as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPriceInsurance_LessThan(String priceInsurance) {
        regPriceInsurance(CK_LT, fRES(priceInsurance));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRICE_INSURANCE: {varchar(30), default=[(0)]}
     * @param priceInsurance The value of priceInsurance as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPriceInsurance_GreaterEqual(String priceInsurance) {
        regPriceInsurance(CK_GE, fRES(priceInsurance));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRICE_INSURANCE: {varchar(30), default=[(0)]}
     * @param priceInsurance The value of priceInsurance as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPriceInsurance_LessEqual(String priceInsurance) {
        regPriceInsurance(CK_LE, fRES(priceInsurance));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRICE_INSURANCE: {varchar(30), default=[(0)]}
     * @param priceInsuranceList The collection of priceInsurance as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPriceInsurance_InScope(Collection<String> priceInsuranceList) {
        doSetPriceInsurance_InScope(priceInsuranceList);
    }

    protected void doSetPriceInsurance_InScope(Collection<String> priceInsuranceList) {
        regINS(CK_INS, cTL(priceInsuranceList), xgetCValuePriceInsurance(), "PRICE_INSURANCE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRICE_INSURANCE: {varchar(30), default=[(0)]}
     * @param priceInsuranceList The collection of priceInsurance as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPriceInsurance_NotInScope(Collection<String> priceInsuranceList) {
        doSetPriceInsurance_NotInScope(priceInsuranceList);
    }

    protected void doSetPriceInsurance_NotInScope(Collection<String> priceInsuranceList) {
        regINS(CK_NINS, cTL(priceInsuranceList), xgetCValuePriceInsurance(), "PRICE_INSURANCE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRICE_INSURANCE: {varchar(30), default=[(0)]} <br>
     * <pre>e.g. setPriceInsurance_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param priceInsurance The value of priceInsurance as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPriceInsurance_LikeSearch(String priceInsurance, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(priceInsurance), xgetCValuePriceInsurance(), "PRICE_INSURANCE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRICE_INSURANCE: {varchar(30), default=[(0)]}
     * @param priceInsurance The value of priceInsurance as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPriceInsurance_NotLikeSearch(String priceInsurance, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(priceInsurance), xgetCValuePriceInsurance(), "PRICE_INSURANCE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRICE_INSURANCE: {varchar(30), default=[(0)]}
     * @param priceInsurance The value of priceInsurance as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPriceInsurance_PrefixSearch(String priceInsurance) {
        setPriceInsurance_LikeSearch(priceInsurance, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PRICE_INSURANCE: {varchar(30), default=[(0)]}
     */
    public void setPriceInsurance_IsNull() { regPriceInsurance(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PRICE_INSURANCE: {varchar(30), default=[(0)]}
     */
    public void setPriceInsurance_IsNullOrEmpty() { regPriceInsurance(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PRICE_INSURANCE: {varchar(30), default=[(0)]}
     */
    public void setPriceInsurance_IsNotNull() { regPriceInsurance(CK_ISNN, DOBJ); }

    protected void regPriceInsurance(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePriceInsurance(), "PRICE_INSURANCE"); }
    protected abstract ConditionValue xgetCValuePriceInsurance();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMITDAY: {varchar(30), default=[(0)]}
     * @param limitday The value of limitday as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitday_Equal(String limitday) {
        doSetLimitday_Equal(fRES(limitday));
    }

    protected void doSetLimitday_Equal(String limitday) {
        regLimitday(CK_EQ, limitday);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMITDAY: {varchar(30), default=[(0)]}
     * @param limitday The value of limitday as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitday_NotEqual(String limitday) {
        doSetLimitday_NotEqual(fRES(limitday));
    }

    protected void doSetLimitday_NotEqual(String limitday) {
        regLimitday(CK_NES, limitday);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMITDAY: {varchar(30), default=[(0)]}
     * @param limitday The value of limitday as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitday_GreaterThan(String limitday) {
        regLimitday(CK_GT, fRES(limitday));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMITDAY: {varchar(30), default=[(0)]}
     * @param limitday The value of limitday as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitday_LessThan(String limitday) {
        regLimitday(CK_LT, fRES(limitday));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMITDAY: {varchar(30), default=[(0)]}
     * @param limitday The value of limitday as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitday_GreaterEqual(String limitday) {
        regLimitday(CK_GE, fRES(limitday));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMITDAY: {varchar(30), default=[(0)]}
     * @param limitday The value of limitday as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitday_LessEqual(String limitday) {
        regLimitday(CK_LE, fRES(limitday));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LIMITDAY: {varchar(30), default=[(0)]}
     * @param limitdayList The collection of limitday as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitday_InScope(Collection<String> limitdayList) {
        doSetLimitday_InScope(limitdayList);
    }

    protected void doSetLimitday_InScope(Collection<String> limitdayList) {
        regINS(CK_INS, cTL(limitdayList), xgetCValueLimitday(), "LIMITDAY");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LIMITDAY: {varchar(30), default=[(0)]}
     * @param limitdayList The collection of limitday as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitday_NotInScope(Collection<String> limitdayList) {
        doSetLimitday_NotInScope(limitdayList);
    }

    protected void doSetLimitday_NotInScope(Collection<String> limitdayList) {
        regINS(CK_NINS, cTL(limitdayList), xgetCValueLimitday(), "LIMITDAY");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LIMITDAY: {varchar(30), default=[(0)]} <br>
     * <pre>e.g. setLimitday_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param limitday The value of limitday as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLimitday_LikeSearch(String limitday, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(limitday), xgetCValueLimitday(), "LIMITDAY", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LIMITDAY: {varchar(30), default=[(0)]}
     * @param limitday The value of limitday as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLimitday_NotLikeSearch(String limitday, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(limitday), xgetCValueLimitday(), "LIMITDAY", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LIMITDAY: {varchar(30), default=[(0)]}
     * @param limitday The value of limitday as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitday_PrefixSearch(String limitday) {
        setLimitday_LikeSearch(limitday, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LIMITDAY: {varchar(30), default=[(0)]}
     */
    public void setLimitday_IsNull() { regLimitday(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LIMITDAY: {varchar(30), default=[(0)]}
     */
    public void setLimitday_IsNullOrEmpty() { regLimitday(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LIMITDAY: {varchar(30), default=[(0)]}
     */
    public void setLimitday_IsNotNull() { regLimitday(CK_ISNN, DOBJ); }

    protected void regLimitday(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLimitday(), "LIMITDAY"); }
    protected abstract ConditionValue xgetCValueLimitday();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLIERCD: {varchar(30)}
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
     * SUPPLIERCD: {varchar(30)}
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
     * SUPPLIERCD: {varchar(30)}
     * @param suppliercd The value of suppliercd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSuppliercd_GreaterThan(String suppliercd) {
        regSuppliercd(CK_GT, fRES(suppliercd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLIERCD: {varchar(30)}
     * @param suppliercd The value of suppliercd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSuppliercd_LessThan(String suppliercd) {
        regSuppliercd(CK_LT, fRES(suppliercd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLIERCD: {varchar(30)}
     * @param suppliercd The value of suppliercd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSuppliercd_GreaterEqual(String suppliercd) {
        regSuppliercd(CK_GE, fRES(suppliercd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLIERCD: {varchar(30)}
     * @param suppliercd The value of suppliercd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSuppliercd_LessEqual(String suppliercd) {
        regSuppliercd(CK_LE, fRES(suppliercd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SUPPLIERCD: {varchar(30)}
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
     * SUPPLIERCD: {varchar(30)}
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
     * SUPPLIERCD: {varchar(30)} <br>
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
     * SUPPLIERCD: {varchar(30)}
     * @param suppliercd The value of suppliercd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSuppliercd_NotLikeSearch(String suppliercd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(suppliercd), xgetCValueSuppliercd(), "SUPPLIERCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SUPPLIERCD: {varchar(30)}
     * @param suppliercd The value of suppliercd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSuppliercd_PrefixSearch(String suppliercd) {
        setSuppliercd_LikeSearch(suppliercd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SUPPLIERCD: {varchar(30)}
     */
    public void setSuppliercd_IsNull() { regSuppliercd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SUPPLIERCD: {varchar(30)}
     */
    public void setSuppliercd_IsNullOrEmpty() { regSuppliercd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SUPPLIERCD: {varchar(30)}
     */
    public void setSuppliercd_IsNotNull() { regSuppliercd(CK_ISNN, DOBJ); }

    protected void regSuppliercd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSuppliercd(), "SUPPLIERCD"); }
    protected abstract ConditionValue xgetCValueSuppliercd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERUSE1: {varchar(60)}
     * @param useruse1 The value of useruse1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseruse1_Equal(String useruse1) {
        doSetUseruse1_Equal(fRES(useruse1));
    }

    protected void doSetUseruse1_Equal(String useruse1) {
        regUseruse1(CK_EQ, useruse1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERUSE1: {varchar(60)}
     * @param useruse1 The value of useruse1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseruse1_NotEqual(String useruse1) {
        doSetUseruse1_NotEqual(fRES(useruse1));
    }

    protected void doSetUseruse1_NotEqual(String useruse1) {
        regUseruse1(CK_NES, useruse1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERUSE1: {varchar(60)}
     * @param useruse1 The value of useruse1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseruse1_GreaterThan(String useruse1) {
        regUseruse1(CK_GT, fRES(useruse1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERUSE1: {varchar(60)}
     * @param useruse1 The value of useruse1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseruse1_LessThan(String useruse1) {
        regUseruse1(CK_LT, fRES(useruse1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERUSE1: {varchar(60)}
     * @param useruse1 The value of useruse1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseruse1_GreaterEqual(String useruse1) {
        regUseruse1(CK_GE, fRES(useruse1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERUSE1: {varchar(60)}
     * @param useruse1 The value of useruse1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseruse1_LessEqual(String useruse1) {
        regUseruse1(CK_LE, fRES(useruse1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * USERUSE1: {varchar(60)}
     * @param useruse1List The collection of useruse1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseruse1_InScope(Collection<String> useruse1List) {
        doSetUseruse1_InScope(useruse1List);
    }

    protected void doSetUseruse1_InScope(Collection<String> useruse1List) {
        regINS(CK_INS, cTL(useruse1List), xgetCValueUseruse1(), "USERUSE1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * USERUSE1: {varchar(60)}
     * @param useruse1List The collection of useruse1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseruse1_NotInScope(Collection<String> useruse1List) {
        doSetUseruse1_NotInScope(useruse1List);
    }

    protected void doSetUseruse1_NotInScope(Collection<String> useruse1List) {
        regINS(CK_NINS, cTL(useruse1List), xgetCValueUseruse1(), "USERUSE1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USERUSE1: {varchar(60)} <br>
     * <pre>e.g. setUseruse1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param useruse1 The value of useruse1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setUseruse1_LikeSearch(String useruse1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(useruse1), xgetCValueUseruse1(), "USERUSE1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USERUSE1: {varchar(60)}
     * @param useruse1 The value of useruse1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setUseruse1_NotLikeSearch(String useruse1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(useruse1), xgetCValueUseruse1(), "USERUSE1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USERUSE1: {varchar(60)}
     * @param useruse1 The value of useruse1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseruse1_PrefixSearch(String useruse1) {
        setUseruse1_LikeSearch(useruse1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * USERUSE1: {varchar(60)}
     */
    public void setUseruse1_IsNull() { regUseruse1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * USERUSE1: {varchar(60)}
     */
    public void setUseruse1_IsNullOrEmpty() { regUseruse1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * USERUSE1: {varchar(60)}
     */
    public void setUseruse1_IsNotNull() { regUseruse1(CK_ISNN, DOBJ); }

    protected void regUseruse1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUseruse1(), "USERUSE1"); }
    protected abstract ConditionValue xgetCValueUseruse1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERUSE2: {varchar(60)}
     * @param useruse2 The value of useruse2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseruse2_Equal(String useruse2) {
        doSetUseruse2_Equal(fRES(useruse2));
    }

    protected void doSetUseruse2_Equal(String useruse2) {
        regUseruse2(CK_EQ, useruse2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERUSE2: {varchar(60)}
     * @param useruse2 The value of useruse2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseruse2_NotEqual(String useruse2) {
        doSetUseruse2_NotEqual(fRES(useruse2));
    }

    protected void doSetUseruse2_NotEqual(String useruse2) {
        regUseruse2(CK_NES, useruse2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERUSE2: {varchar(60)}
     * @param useruse2 The value of useruse2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseruse2_GreaterThan(String useruse2) {
        regUseruse2(CK_GT, fRES(useruse2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERUSE2: {varchar(60)}
     * @param useruse2 The value of useruse2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseruse2_LessThan(String useruse2) {
        regUseruse2(CK_LT, fRES(useruse2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERUSE2: {varchar(60)}
     * @param useruse2 The value of useruse2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseruse2_GreaterEqual(String useruse2) {
        regUseruse2(CK_GE, fRES(useruse2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERUSE2: {varchar(60)}
     * @param useruse2 The value of useruse2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseruse2_LessEqual(String useruse2) {
        regUseruse2(CK_LE, fRES(useruse2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * USERUSE2: {varchar(60)}
     * @param useruse2List The collection of useruse2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseruse2_InScope(Collection<String> useruse2List) {
        doSetUseruse2_InScope(useruse2List);
    }

    protected void doSetUseruse2_InScope(Collection<String> useruse2List) {
        regINS(CK_INS, cTL(useruse2List), xgetCValueUseruse2(), "USERUSE2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * USERUSE2: {varchar(60)}
     * @param useruse2List The collection of useruse2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseruse2_NotInScope(Collection<String> useruse2List) {
        doSetUseruse2_NotInScope(useruse2List);
    }

    protected void doSetUseruse2_NotInScope(Collection<String> useruse2List) {
        regINS(CK_NINS, cTL(useruse2List), xgetCValueUseruse2(), "USERUSE2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USERUSE2: {varchar(60)} <br>
     * <pre>e.g. setUseruse2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param useruse2 The value of useruse2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setUseruse2_LikeSearch(String useruse2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(useruse2), xgetCValueUseruse2(), "USERUSE2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USERUSE2: {varchar(60)}
     * @param useruse2 The value of useruse2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setUseruse2_NotLikeSearch(String useruse2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(useruse2), xgetCValueUseruse2(), "USERUSE2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USERUSE2: {varchar(60)}
     * @param useruse2 The value of useruse2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseruse2_PrefixSearch(String useruse2) {
        setUseruse2_LikeSearch(useruse2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * USERUSE2: {varchar(60)}
     */
    public void setUseruse2_IsNull() { regUseruse2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * USERUSE2: {varchar(60)}
     */
    public void setUseruse2_IsNullOrEmpty() { regUseruse2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * USERUSE2: {varchar(60)}
     */
    public void setUseruse2_IsNotNull() { regUseruse2(CK_ISNN, DOBJ); }

    protected void regUseruse2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUseruse2(), "USERUSE2"); }
    protected abstract ConditionValue xgetCValueUseruse2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERUSE3: {varchar(60)}
     * @param useruse3 The value of useruse3 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseruse3_Equal(String useruse3) {
        doSetUseruse3_Equal(fRES(useruse3));
    }

    protected void doSetUseruse3_Equal(String useruse3) {
        regUseruse3(CK_EQ, useruse3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERUSE3: {varchar(60)}
     * @param useruse3 The value of useruse3 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseruse3_NotEqual(String useruse3) {
        doSetUseruse3_NotEqual(fRES(useruse3));
    }

    protected void doSetUseruse3_NotEqual(String useruse3) {
        regUseruse3(CK_NES, useruse3);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERUSE3: {varchar(60)}
     * @param useruse3 The value of useruse3 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseruse3_GreaterThan(String useruse3) {
        regUseruse3(CK_GT, fRES(useruse3));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERUSE3: {varchar(60)}
     * @param useruse3 The value of useruse3 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseruse3_LessThan(String useruse3) {
        regUseruse3(CK_LT, fRES(useruse3));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERUSE3: {varchar(60)}
     * @param useruse3 The value of useruse3 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseruse3_GreaterEqual(String useruse3) {
        regUseruse3(CK_GE, fRES(useruse3));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERUSE3: {varchar(60)}
     * @param useruse3 The value of useruse3 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseruse3_LessEqual(String useruse3) {
        regUseruse3(CK_LE, fRES(useruse3));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * USERUSE3: {varchar(60)}
     * @param useruse3List The collection of useruse3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseruse3_InScope(Collection<String> useruse3List) {
        doSetUseruse3_InScope(useruse3List);
    }

    protected void doSetUseruse3_InScope(Collection<String> useruse3List) {
        regINS(CK_INS, cTL(useruse3List), xgetCValueUseruse3(), "USERUSE3");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * USERUSE3: {varchar(60)}
     * @param useruse3List The collection of useruse3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseruse3_NotInScope(Collection<String> useruse3List) {
        doSetUseruse3_NotInScope(useruse3List);
    }

    protected void doSetUseruse3_NotInScope(Collection<String> useruse3List) {
        regINS(CK_NINS, cTL(useruse3List), xgetCValueUseruse3(), "USERUSE3");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USERUSE3: {varchar(60)} <br>
     * <pre>e.g. setUseruse3_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param useruse3 The value of useruse3 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setUseruse3_LikeSearch(String useruse3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(useruse3), xgetCValueUseruse3(), "USERUSE3", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USERUSE3: {varchar(60)}
     * @param useruse3 The value of useruse3 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setUseruse3_NotLikeSearch(String useruse3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(useruse3), xgetCValueUseruse3(), "USERUSE3", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USERUSE3: {varchar(60)}
     * @param useruse3 The value of useruse3 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseruse3_PrefixSearch(String useruse3) {
        setUseruse3_LikeSearch(useruse3, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * USERUSE3: {varchar(60)}
     */
    public void setUseruse3_IsNull() { regUseruse3(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * USERUSE3: {varchar(60)}
     */
    public void setUseruse3_IsNullOrEmpty() { regUseruse3(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * USERUSE3: {varchar(60)}
     */
    public void setUseruse3_IsNotNull() { regUseruse3(CK_ISNN, DOBJ); }

    protected void regUseruse3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUseruse3(), "USERUSE3"); }
    protected abstract ConditionValue xgetCValueUseruse3();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERUSE4: {varchar(60)}
     * @param useruse4 The value of useruse4 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseruse4_Equal(String useruse4) {
        doSetUseruse4_Equal(fRES(useruse4));
    }

    protected void doSetUseruse4_Equal(String useruse4) {
        regUseruse4(CK_EQ, useruse4);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERUSE4: {varchar(60)}
     * @param useruse4 The value of useruse4 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseruse4_NotEqual(String useruse4) {
        doSetUseruse4_NotEqual(fRES(useruse4));
    }

    protected void doSetUseruse4_NotEqual(String useruse4) {
        regUseruse4(CK_NES, useruse4);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERUSE4: {varchar(60)}
     * @param useruse4 The value of useruse4 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseruse4_GreaterThan(String useruse4) {
        regUseruse4(CK_GT, fRES(useruse4));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERUSE4: {varchar(60)}
     * @param useruse4 The value of useruse4 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseruse4_LessThan(String useruse4) {
        regUseruse4(CK_LT, fRES(useruse4));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERUSE4: {varchar(60)}
     * @param useruse4 The value of useruse4 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseruse4_GreaterEqual(String useruse4) {
        regUseruse4(CK_GE, fRES(useruse4));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERUSE4: {varchar(60)}
     * @param useruse4 The value of useruse4 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseruse4_LessEqual(String useruse4) {
        regUseruse4(CK_LE, fRES(useruse4));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * USERUSE4: {varchar(60)}
     * @param useruse4List The collection of useruse4 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseruse4_InScope(Collection<String> useruse4List) {
        doSetUseruse4_InScope(useruse4List);
    }

    protected void doSetUseruse4_InScope(Collection<String> useruse4List) {
        regINS(CK_INS, cTL(useruse4List), xgetCValueUseruse4(), "USERUSE4");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * USERUSE4: {varchar(60)}
     * @param useruse4List The collection of useruse4 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseruse4_NotInScope(Collection<String> useruse4List) {
        doSetUseruse4_NotInScope(useruse4List);
    }

    protected void doSetUseruse4_NotInScope(Collection<String> useruse4List) {
        regINS(CK_NINS, cTL(useruse4List), xgetCValueUseruse4(), "USERUSE4");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USERUSE4: {varchar(60)} <br>
     * <pre>e.g. setUseruse4_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param useruse4 The value of useruse4 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setUseruse4_LikeSearch(String useruse4, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(useruse4), xgetCValueUseruse4(), "USERUSE4", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USERUSE4: {varchar(60)}
     * @param useruse4 The value of useruse4 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setUseruse4_NotLikeSearch(String useruse4, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(useruse4), xgetCValueUseruse4(), "USERUSE4", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USERUSE4: {varchar(60)}
     * @param useruse4 The value of useruse4 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseruse4_PrefixSearch(String useruse4) {
        setUseruse4_LikeSearch(useruse4, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * USERUSE4: {varchar(60)}
     */
    public void setUseruse4_IsNull() { regUseruse4(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * USERUSE4: {varchar(60)}
     */
    public void setUseruse4_IsNullOrEmpty() { regUseruse4(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * USERUSE4: {varchar(60)}
     */
    public void setUseruse4_IsNotNull() { regUseruse4(CK_ISNN, DOBJ); }

    protected void regUseruse4(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUseruse4(), "USERUSE4"); }
    protected abstract ConditionValue xgetCValueUseruse4();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERUSE5: {varchar(60)}
     * @param useruse5 The value of useruse5 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseruse5_Equal(String useruse5) {
        doSetUseruse5_Equal(fRES(useruse5));
    }

    protected void doSetUseruse5_Equal(String useruse5) {
        regUseruse5(CK_EQ, useruse5);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERUSE5: {varchar(60)}
     * @param useruse5 The value of useruse5 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseruse5_NotEqual(String useruse5) {
        doSetUseruse5_NotEqual(fRES(useruse5));
    }

    protected void doSetUseruse5_NotEqual(String useruse5) {
        regUseruse5(CK_NES, useruse5);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERUSE5: {varchar(60)}
     * @param useruse5 The value of useruse5 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseruse5_GreaterThan(String useruse5) {
        regUseruse5(CK_GT, fRES(useruse5));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERUSE5: {varchar(60)}
     * @param useruse5 The value of useruse5 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseruse5_LessThan(String useruse5) {
        regUseruse5(CK_LT, fRES(useruse5));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERUSE5: {varchar(60)}
     * @param useruse5 The value of useruse5 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseruse5_GreaterEqual(String useruse5) {
        regUseruse5(CK_GE, fRES(useruse5));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERUSE5: {varchar(60)}
     * @param useruse5 The value of useruse5 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseruse5_LessEqual(String useruse5) {
        regUseruse5(CK_LE, fRES(useruse5));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * USERUSE5: {varchar(60)}
     * @param useruse5List The collection of useruse5 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseruse5_InScope(Collection<String> useruse5List) {
        doSetUseruse5_InScope(useruse5List);
    }

    protected void doSetUseruse5_InScope(Collection<String> useruse5List) {
        regINS(CK_INS, cTL(useruse5List), xgetCValueUseruse5(), "USERUSE5");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * USERUSE5: {varchar(60)}
     * @param useruse5List The collection of useruse5 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseruse5_NotInScope(Collection<String> useruse5List) {
        doSetUseruse5_NotInScope(useruse5List);
    }

    protected void doSetUseruse5_NotInScope(Collection<String> useruse5List) {
        regINS(CK_NINS, cTL(useruse5List), xgetCValueUseruse5(), "USERUSE5");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USERUSE5: {varchar(60)} <br>
     * <pre>e.g. setUseruse5_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param useruse5 The value of useruse5 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setUseruse5_LikeSearch(String useruse5, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(useruse5), xgetCValueUseruse5(), "USERUSE5", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USERUSE5: {varchar(60)}
     * @param useruse5 The value of useruse5 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setUseruse5_NotLikeSearch(String useruse5, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(useruse5), xgetCValueUseruse5(), "USERUSE5", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USERUSE5: {varchar(60)}
     * @param useruse5 The value of useruse5 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseruse5_PrefixSearch(String useruse5) {
        setUseruse5_LikeSearch(useruse5, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * USERUSE5: {varchar(60)}
     */
    public void setUseruse5_IsNull() { regUseruse5(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * USERUSE5: {varchar(60)}
     */
    public void setUseruse5_IsNullOrEmpty() { regUseruse5(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * USERUSE5: {varchar(60)}
     */
    public void setUseruse5_IsNotNull() { regUseruse5(CK_ISNN, DOBJ); }

    protected void regUseruse5(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUseruse5(), "USERUSE5"); }
    protected abstract ConditionValue xgetCValueUseruse5();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRICELEVEL: {char(1), default=[(0)]}
     * @param pricelevel The value of pricelevel as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPricelevel_Equal(String pricelevel) {
        doSetPricelevel_Equal(fRES(pricelevel));
    }

    protected void doSetPricelevel_Equal(String pricelevel) {
        regPricelevel(CK_EQ, pricelevel);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRICELEVEL: {char(1), default=[(0)]}
     * @param pricelevel The value of pricelevel as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPricelevel_NotEqual(String pricelevel) {
        doSetPricelevel_NotEqual(fRES(pricelevel));
    }

    protected void doSetPricelevel_NotEqual(String pricelevel) {
        regPricelevel(CK_NES, pricelevel);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRICELEVEL: {char(1), default=[(0)]}
     * @param pricelevel The value of pricelevel as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPricelevel_GreaterThan(String pricelevel) {
        regPricelevel(CK_GT, fRES(pricelevel));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRICELEVEL: {char(1), default=[(0)]}
     * @param pricelevel The value of pricelevel as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPricelevel_LessThan(String pricelevel) {
        regPricelevel(CK_LT, fRES(pricelevel));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRICELEVEL: {char(1), default=[(0)]}
     * @param pricelevel The value of pricelevel as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPricelevel_GreaterEqual(String pricelevel) {
        regPricelevel(CK_GE, fRES(pricelevel));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRICELEVEL: {char(1), default=[(0)]}
     * @param pricelevel The value of pricelevel as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPricelevel_LessEqual(String pricelevel) {
        regPricelevel(CK_LE, fRES(pricelevel));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRICELEVEL: {char(1), default=[(0)]}
     * @param pricelevelList The collection of pricelevel as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPricelevel_InScope(Collection<String> pricelevelList) {
        doSetPricelevel_InScope(pricelevelList);
    }

    protected void doSetPricelevel_InScope(Collection<String> pricelevelList) {
        regINS(CK_INS, cTL(pricelevelList), xgetCValuePricelevel(), "PRICELEVEL");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRICELEVEL: {char(1), default=[(0)]}
     * @param pricelevelList The collection of pricelevel as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPricelevel_NotInScope(Collection<String> pricelevelList) {
        doSetPricelevel_NotInScope(pricelevelList);
    }

    protected void doSetPricelevel_NotInScope(Collection<String> pricelevelList) {
        regINS(CK_NINS, cTL(pricelevelList), xgetCValuePricelevel(), "PRICELEVEL");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRICELEVEL: {char(1), default=[(0)]} <br>
     * <pre>e.g. setPricelevel_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param pricelevel The value of pricelevel as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPricelevel_LikeSearch(String pricelevel, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(pricelevel), xgetCValuePricelevel(), "PRICELEVEL", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRICELEVEL: {char(1), default=[(0)]}
     * @param pricelevel The value of pricelevel as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPricelevel_NotLikeSearch(String pricelevel, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(pricelevel), xgetCValuePricelevel(), "PRICELEVEL", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRICELEVEL: {char(1), default=[(0)]}
     * @param pricelevel The value of pricelevel as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPricelevel_PrefixSearch(String pricelevel) {
        setPricelevel_LikeSearch(pricelevel, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PRICELEVEL: {char(1), default=[(0)]}
     */
    public void setPricelevel_IsNull() { regPricelevel(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PRICELEVEL: {char(1), default=[(0)]}
     */
    public void setPricelevel_IsNotNull() { regPricelevel(CK_ISNN, DOBJ); }

    protected void regPricelevel(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePricelevel(), "PRICELEVEL"); }
    protected abstract ConditionValue xgetCValuePricelevel();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMCATALOGURL: {varchar(255)}
     * @param itemcatalogurl The value of itemcatalogurl as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcatalogurl_Equal(String itemcatalogurl) {
        doSetItemcatalogurl_Equal(fRES(itemcatalogurl));
    }

    protected void doSetItemcatalogurl_Equal(String itemcatalogurl) {
        regItemcatalogurl(CK_EQ, itemcatalogurl);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMCATALOGURL: {varchar(255)}
     * @param itemcatalogurl The value of itemcatalogurl as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcatalogurl_NotEqual(String itemcatalogurl) {
        doSetItemcatalogurl_NotEqual(fRES(itemcatalogurl));
    }

    protected void doSetItemcatalogurl_NotEqual(String itemcatalogurl) {
        regItemcatalogurl(CK_NES, itemcatalogurl);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMCATALOGURL: {varchar(255)}
     * @param itemcatalogurl The value of itemcatalogurl as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcatalogurl_GreaterThan(String itemcatalogurl) {
        regItemcatalogurl(CK_GT, fRES(itemcatalogurl));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMCATALOGURL: {varchar(255)}
     * @param itemcatalogurl The value of itemcatalogurl as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcatalogurl_LessThan(String itemcatalogurl) {
        regItemcatalogurl(CK_LT, fRES(itemcatalogurl));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMCATALOGURL: {varchar(255)}
     * @param itemcatalogurl The value of itemcatalogurl as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcatalogurl_GreaterEqual(String itemcatalogurl) {
        regItemcatalogurl(CK_GE, fRES(itemcatalogurl));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMCATALOGURL: {varchar(255)}
     * @param itemcatalogurl The value of itemcatalogurl as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcatalogurl_LessEqual(String itemcatalogurl) {
        regItemcatalogurl(CK_LE, fRES(itemcatalogurl));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ITEMCATALOGURL: {varchar(255)}
     * @param itemcatalogurlList The collection of itemcatalogurl as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcatalogurl_InScope(Collection<String> itemcatalogurlList) {
        doSetItemcatalogurl_InScope(itemcatalogurlList);
    }

    protected void doSetItemcatalogurl_InScope(Collection<String> itemcatalogurlList) {
        regINS(CK_INS, cTL(itemcatalogurlList), xgetCValueItemcatalogurl(), "ITEMCATALOGURL");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ITEMCATALOGURL: {varchar(255)}
     * @param itemcatalogurlList The collection of itemcatalogurl as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcatalogurl_NotInScope(Collection<String> itemcatalogurlList) {
        doSetItemcatalogurl_NotInScope(itemcatalogurlList);
    }

    protected void doSetItemcatalogurl_NotInScope(Collection<String> itemcatalogurlList) {
        regINS(CK_NINS, cTL(itemcatalogurlList), xgetCValueItemcatalogurl(), "ITEMCATALOGURL");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEMCATALOGURL: {varchar(255)} <br>
     * <pre>e.g. setItemcatalogurl_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param itemcatalogurl The value of itemcatalogurl as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setItemcatalogurl_LikeSearch(String itemcatalogurl, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(itemcatalogurl), xgetCValueItemcatalogurl(), "ITEMCATALOGURL", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEMCATALOGURL: {varchar(255)}
     * @param itemcatalogurl The value of itemcatalogurl as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setItemcatalogurl_NotLikeSearch(String itemcatalogurl, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(itemcatalogurl), xgetCValueItemcatalogurl(), "ITEMCATALOGURL", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEMCATALOGURL: {varchar(255)}
     * @param itemcatalogurl The value of itemcatalogurl as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcatalogurl_PrefixSearch(String itemcatalogurl) {
        setItemcatalogurl_LikeSearch(itemcatalogurl, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ITEMCATALOGURL: {varchar(255)}
     */
    public void setItemcatalogurl_IsNull() { regItemcatalogurl(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ITEMCATALOGURL: {varchar(255)}
     */
    public void setItemcatalogurl_IsNullOrEmpty() { regItemcatalogurl(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ITEMCATALOGURL: {varchar(255)}
     */
    public void setItemcatalogurl_IsNotNull() { regItemcatalogurl(CK_ISNN, DOBJ); }

    protected void regItemcatalogurl(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueItemcatalogurl(), "ITEMCATALOGURL"); }
    protected abstract ConditionValue xgetCValueItemcatalogurl();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERNUM1: {varchar(30), default=[(0)]}
     * @param usernum1 The value of usernum1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUsernum1_Equal(String usernum1) {
        doSetUsernum1_Equal(fRES(usernum1));
    }

    protected void doSetUsernum1_Equal(String usernum1) {
        regUsernum1(CK_EQ, usernum1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERNUM1: {varchar(30), default=[(0)]}
     * @param usernum1 The value of usernum1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUsernum1_NotEqual(String usernum1) {
        doSetUsernum1_NotEqual(fRES(usernum1));
    }

    protected void doSetUsernum1_NotEqual(String usernum1) {
        regUsernum1(CK_NES, usernum1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERNUM1: {varchar(30), default=[(0)]}
     * @param usernum1 The value of usernum1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUsernum1_GreaterThan(String usernum1) {
        regUsernum1(CK_GT, fRES(usernum1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERNUM1: {varchar(30), default=[(0)]}
     * @param usernum1 The value of usernum1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUsernum1_LessThan(String usernum1) {
        regUsernum1(CK_LT, fRES(usernum1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERNUM1: {varchar(30), default=[(0)]}
     * @param usernum1 The value of usernum1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUsernum1_GreaterEqual(String usernum1) {
        regUsernum1(CK_GE, fRES(usernum1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERNUM1: {varchar(30), default=[(0)]}
     * @param usernum1 The value of usernum1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUsernum1_LessEqual(String usernum1) {
        regUsernum1(CK_LE, fRES(usernum1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * USERNUM1: {varchar(30), default=[(0)]}
     * @param usernum1List The collection of usernum1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUsernum1_InScope(Collection<String> usernum1List) {
        doSetUsernum1_InScope(usernum1List);
    }

    protected void doSetUsernum1_InScope(Collection<String> usernum1List) {
        regINS(CK_INS, cTL(usernum1List), xgetCValueUsernum1(), "USERNUM1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * USERNUM1: {varchar(30), default=[(0)]}
     * @param usernum1List The collection of usernum1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUsernum1_NotInScope(Collection<String> usernum1List) {
        doSetUsernum1_NotInScope(usernum1List);
    }

    protected void doSetUsernum1_NotInScope(Collection<String> usernum1List) {
        regINS(CK_NINS, cTL(usernum1List), xgetCValueUsernum1(), "USERNUM1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USERNUM1: {varchar(30), default=[(0)]} <br>
     * <pre>e.g. setUsernum1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param usernum1 The value of usernum1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setUsernum1_LikeSearch(String usernum1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(usernum1), xgetCValueUsernum1(), "USERNUM1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USERNUM1: {varchar(30), default=[(0)]}
     * @param usernum1 The value of usernum1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setUsernum1_NotLikeSearch(String usernum1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(usernum1), xgetCValueUsernum1(), "USERNUM1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USERNUM1: {varchar(30), default=[(0)]}
     * @param usernum1 The value of usernum1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUsernum1_PrefixSearch(String usernum1) {
        setUsernum1_LikeSearch(usernum1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * USERNUM1: {varchar(30), default=[(0)]}
     */
    public void setUsernum1_IsNull() { regUsernum1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * USERNUM1: {varchar(30), default=[(0)]}
     */
    public void setUsernum1_IsNullOrEmpty() { regUsernum1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * USERNUM1: {varchar(30), default=[(0)]}
     */
    public void setUsernum1_IsNotNull() { regUsernum1(CK_ISNN, DOBJ); }

    protected void regUsernum1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUsernum1(), "USERNUM1"); }
    protected abstract ConditionValue xgetCValueUsernum1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERNUM2: {varchar(30), default=[(0)]}
     * @param usernum2 The value of usernum2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUsernum2_Equal(String usernum2) {
        doSetUsernum2_Equal(fRES(usernum2));
    }

    protected void doSetUsernum2_Equal(String usernum2) {
        regUsernum2(CK_EQ, usernum2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERNUM2: {varchar(30), default=[(0)]}
     * @param usernum2 The value of usernum2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUsernum2_NotEqual(String usernum2) {
        doSetUsernum2_NotEqual(fRES(usernum2));
    }

    protected void doSetUsernum2_NotEqual(String usernum2) {
        regUsernum2(CK_NES, usernum2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERNUM2: {varchar(30), default=[(0)]}
     * @param usernum2 The value of usernum2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUsernum2_GreaterThan(String usernum2) {
        regUsernum2(CK_GT, fRES(usernum2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERNUM2: {varchar(30), default=[(0)]}
     * @param usernum2 The value of usernum2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUsernum2_LessThan(String usernum2) {
        regUsernum2(CK_LT, fRES(usernum2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERNUM2: {varchar(30), default=[(0)]}
     * @param usernum2 The value of usernum2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUsernum2_GreaterEqual(String usernum2) {
        regUsernum2(CK_GE, fRES(usernum2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERNUM2: {varchar(30), default=[(0)]}
     * @param usernum2 The value of usernum2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUsernum2_LessEqual(String usernum2) {
        regUsernum2(CK_LE, fRES(usernum2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * USERNUM2: {varchar(30), default=[(0)]}
     * @param usernum2List The collection of usernum2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUsernum2_InScope(Collection<String> usernum2List) {
        doSetUsernum2_InScope(usernum2List);
    }

    protected void doSetUsernum2_InScope(Collection<String> usernum2List) {
        regINS(CK_INS, cTL(usernum2List), xgetCValueUsernum2(), "USERNUM2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * USERNUM2: {varchar(30), default=[(0)]}
     * @param usernum2List The collection of usernum2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUsernum2_NotInScope(Collection<String> usernum2List) {
        doSetUsernum2_NotInScope(usernum2List);
    }

    protected void doSetUsernum2_NotInScope(Collection<String> usernum2List) {
        regINS(CK_NINS, cTL(usernum2List), xgetCValueUsernum2(), "USERNUM2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USERNUM2: {varchar(30), default=[(0)]} <br>
     * <pre>e.g. setUsernum2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param usernum2 The value of usernum2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setUsernum2_LikeSearch(String usernum2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(usernum2), xgetCValueUsernum2(), "USERNUM2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USERNUM2: {varchar(30), default=[(0)]}
     * @param usernum2 The value of usernum2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setUsernum2_NotLikeSearch(String usernum2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(usernum2), xgetCValueUsernum2(), "USERNUM2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USERNUM2: {varchar(30), default=[(0)]}
     * @param usernum2 The value of usernum2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUsernum2_PrefixSearch(String usernum2) {
        setUsernum2_LikeSearch(usernum2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * USERNUM2: {varchar(30), default=[(0)]}
     */
    public void setUsernum2_IsNull() { regUsernum2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * USERNUM2: {varchar(30), default=[(0)]}
     */
    public void setUsernum2_IsNullOrEmpty() { regUsernum2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * USERNUM2: {varchar(30), default=[(0)]}
     */
    public void setUsernum2_IsNotNull() { regUsernum2(CK_ISNN, DOBJ); }

    protected void regUsernum2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUsernum2(), "USERNUM2"); }
    protected abstract ConditionValue xgetCValueUsernum2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERNUM3: {varchar(30), default=[(0)]}
     * @param usernum3 The value of usernum3 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUsernum3_Equal(String usernum3) {
        doSetUsernum3_Equal(fRES(usernum3));
    }

    protected void doSetUsernum3_Equal(String usernum3) {
        regUsernum3(CK_EQ, usernum3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERNUM3: {varchar(30), default=[(0)]}
     * @param usernum3 The value of usernum3 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUsernum3_NotEqual(String usernum3) {
        doSetUsernum3_NotEqual(fRES(usernum3));
    }

    protected void doSetUsernum3_NotEqual(String usernum3) {
        regUsernum3(CK_NES, usernum3);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERNUM3: {varchar(30), default=[(0)]}
     * @param usernum3 The value of usernum3 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUsernum3_GreaterThan(String usernum3) {
        regUsernum3(CK_GT, fRES(usernum3));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERNUM3: {varchar(30), default=[(0)]}
     * @param usernum3 The value of usernum3 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUsernum3_LessThan(String usernum3) {
        regUsernum3(CK_LT, fRES(usernum3));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERNUM3: {varchar(30), default=[(0)]}
     * @param usernum3 The value of usernum3 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUsernum3_GreaterEqual(String usernum3) {
        regUsernum3(CK_GE, fRES(usernum3));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERNUM3: {varchar(30), default=[(0)]}
     * @param usernum3 The value of usernum3 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUsernum3_LessEqual(String usernum3) {
        regUsernum3(CK_LE, fRES(usernum3));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * USERNUM3: {varchar(30), default=[(0)]}
     * @param usernum3List The collection of usernum3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUsernum3_InScope(Collection<String> usernum3List) {
        doSetUsernum3_InScope(usernum3List);
    }

    protected void doSetUsernum3_InScope(Collection<String> usernum3List) {
        regINS(CK_INS, cTL(usernum3List), xgetCValueUsernum3(), "USERNUM3");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * USERNUM3: {varchar(30), default=[(0)]}
     * @param usernum3List The collection of usernum3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUsernum3_NotInScope(Collection<String> usernum3List) {
        doSetUsernum3_NotInScope(usernum3List);
    }

    protected void doSetUsernum3_NotInScope(Collection<String> usernum3List) {
        regINS(CK_NINS, cTL(usernum3List), xgetCValueUsernum3(), "USERNUM3");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USERNUM3: {varchar(30), default=[(0)]} <br>
     * <pre>e.g. setUsernum3_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param usernum3 The value of usernum3 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setUsernum3_LikeSearch(String usernum3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(usernum3), xgetCValueUsernum3(), "USERNUM3", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USERNUM3: {varchar(30), default=[(0)]}
     * @param usernum3 The value of usernum3 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setUsernum3_NotLikeSearch(String usernum3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(usernum3), xgetCValueUsernum3(), "USERNUM3", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USERNUM3: {varchar(30), default=[(0)]}
     * @param usernum3 The value of usernum3 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUsernum3_PrefixSearch(String usernum3) {
        setUsernum3_LikeSearch(usernum3, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * USERNUM3: {varchar(30), default=[(0)]}
     */
    public void setUsernum3_IsNull() { regUsernum3(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * USERNUM3: {varchar(30), default=[(0)]}
     */
    public void setUsernum3_IsNullOrEmpty() { regUsernum3(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * USERNUM3: {varchar(30), default=[(0)]}
     */
    public void setUsernum3_IsNotNull() { regUsernum3(CK_ISNN, DOBJ); }

    protected void regUsernum3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUsernum3(), "USERNUM3"); }
    protected abstract ConditionValue xgetCValueUsernum3();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERNUM4: {varchar(30), default=[(0)]}
     * @param usernum4 The value of usernum4 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUsernum4_Equal(String usernum4) {
        doSetUsernum4_Equal(fRES(usernum4));
    }

    protected void doSetUsernum4_Equal(String usernum4) {
        regUsernum4(CK_EQ, usernum4);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERNUM4: {varchar(30), default=[(0)]}
     * @param usernum4 The value of usernum4 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUsernum4_NotEqual(String usernum4) {
        doSetUsernum4_NotEqual(fRES(usernum4));
    }

    protected void doSetUsernum4_NotEqual(String usernum4) {
        regUsernum4(CK_NES, usernum4);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERNUM4: {varchar(30), default=[(0)]}
     * @param usernum4 The value of usernum4 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUsernum4_GreaterThan(String usernum4) {
        regUsernum4(CK_GT, fRES(usernum4));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERNUM4: {varchar(30), default=[(0)]}
     * @param usernum4 The value of usernum4 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUsernum4_LessThan(String usernum4) {
        regUsernum4(CK_LT, fRES(usernum4));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERNUM4: {varchar(30), default=[(0)]}
     * @param usernum4 The value of usernum4 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUsernum4_GreaterEqual(String usernum4) {
        regUsernum4(CK_GE, fRES(usernum4));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERNUM4: {varchar(30), default=[(0)]}
     * @param usernum4 The value of usernum4 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUsernum4_LessEqual(String usernum4) {
        regUsernum4(CK_LE, fRES(usernum4));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * USERNUM4: {varchar(30), default=[(0)]}
     * @param usernum4List The collection of usernum4 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUsernum4_InScope(Collection<String> usernum4List) {
        doSetUsernum4_InScope(usernum4List);
    }

    protected void doSetUsernum4_InScope(Collection<String> usernum4List) {
        regINS(CK_INS, cTL(usernum4List), xgetCValueUsernum4(), "USERNUM4");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * USERNUM4: {varchar(30), default=[(0)]}
     * @param usernum4List The collection of usernum4 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUsernum4_NotInScope(Collection<String> usernum4List) {
        doSetUsernum4_NotInScope(usernum4List);
    }

    protected void doSetUsernum4_NotInScope(Collection<String> usernum4List) {
        regINS(CK_NINS, cTL(usernum4List), xgetCValueUsernum4(), "USERNUM4");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USERNUM4: {varchar(30), default=[(0)]} <br>
     * <pre>e.g. setUsernum4_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param usernum4 The value of usernum4 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setUsernum4_LikeSearch(String usernum4, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(usernum4), xgetCValueUsernum4(), "USERNUM4", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USERNUM4: {varchar(30), default=[(0)]}
     * @param usernum4 The value of usernum4 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setUsernum4_NotLikeSearch(String usernum4, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(usernum4), xgetCValueUsernum4(), "USERNUM4", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USERNUM4: {varchar(30), default=[(0)]}
     * @param usernum4 The value of usernum4 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUsernum4_PrefixSearch(String usernum4) {
        setUsernum4_LikeSearch(usernum4, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * USERNUM4: {varchar(30), default=[(0)]}
     */
    public void setUsernum4_IsNull() { regUsernum4(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * USERNUM4: {varchar(30), default=[(0)]}
     */
    public void setUsernum4_IsNullOrEmpty() { regUsernum4(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * USERNUM4: {varchar(30), default=[(0)]}
     */
    public void setUsernum4_IsNotNull() { regUsernum4(CK_ISNN, DOBJ); }

    protected void regUsernum4(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUsernum4(), "USERNUM4"); }
    protected abstract ConditionValue xgetCValueUsernum4();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERNUM5: {varchar(30), default=[(0)]}
     * @param usernum5 The value of usernum5 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUsernum5_Equal(String usernum5) {
        doSetUsernum5_Equal(fRES(usernum5));
    }

    protected void doSetUsernum5_Equal(String usernum5) {
        regUsernum5(CK_EQ, usernum5);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERNUM5: {varchar(30), default=[(0)]}
     * @param usernum5 The value of usernum5 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUsernum5_NotEqual(String usernum5) {
        doSetUsernum5_NotEqual(fRES(usernum5));
    }

    protected void doSetUsernum5_NotEqual(String usernum5) {
        regUsernum5(CK_NES, usernum5);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERNUM5: {varchar(30), default=[(0)]}
     * @param usernum5 The value of usernum5 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUsernum5_GreaterThan(String usernum5) {
        regUsernum5(CK_GT, fRES(usernum5));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERNUM5: {varchar(30), default=[(0)]}
     * @param usernum5 The value of usernum5 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUsernum5_LessThan(String usernum5) {
        regUsernum5(CK_LT, fRES(usernum5));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERNUM5: {varchar(30), default=[(0)]}
     * @param usernum5 The value of usernum5 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUsernum5_GreaterEqual(String usernum5) {
        regUsernum5(CK_GE, fRES(usernum5));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERNUM5: {varchar(30), default=[(0)]}
     * @param usernum5 The value of usernum5 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUsernum5_LessEqual(String usernum5) {
        regUsernum5(CK_LE, fRES(usernum5));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * USERNUM5: {varchar(30), default=[(0)]}
     * @param usernum5List The collection of usernum5 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUsernum5_InScope(Collection<String> usernum5List) {
        doSetUsernum5_InScope(usernum5List);
    }

    protected void doSetUsernum5_InScope(Collection<String> usernum5List) {
        regINS(CK_INS, cTL(usernum5List), xgetCValueUsernum5(), "USERNUM5");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * USERNUM5: {varchar(30), default=[(0)]}
     * @param usernum5List The collection of usernum5 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUsernum5_NotInScope(Collection<String> usernum5List) {
        doSetUsernum5_NotInScope(usernum5List);
    }

    protected void doSetUsernum5_NotInScope(Collection<String> usernum5List) {
        regINS(CK_NINS, cTL(usernum5List), xgetCValueUsernum5(), "USERNUM5");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USERNUM5: {varchar(30), default=[(0)]} <br>
     * <pre>e.g. setUsernum5_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param usernum5 The value of usernum5 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setUsernum5_LikeSearch(String usernum5, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(usernum5), xgetCValueUsernum5(), "USERNUM5", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USERNUM5: {varchar(30), default=[(0)]}
     * @param usernum5 The value of usernum5 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setUsernum5_NotLikeSearch(String usernum5, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(usernum5), xgetCValueUsernum5(), "USERNUM5", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USERNUM5: {varchar(30), default=[(0)]}
     * @param usernum5 The value of usernum5 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUsernum5_PrefixSearch(String usernum5) {
        setUsernum5_LikeSearch(usernum5, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * USERNUM5: {varchar(30), default=[(0)]}
     */
    public void setUsernum5_IsNull() { regUsernum5(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * USERNUM5: {varchar(30), default=[(0)]}
     */
    public void setUsernum5_IsNullOrEmpty() { regUsernum5(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * USERNUM5: {varchar(30), default=[(0)]}
     */
    public void setUsernum5_IsNotNull() { regUsernum5(CK_ISNN, DOBJ); }

    protected void regUsernum5(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUsernum5(), "USERNUM5"); }
    protected abstract ConditionValue xgetCValueUsernum5();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERDATE1: {varchar(30)}
     * @param userdate1 The value of userdate1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserdate1_Equal(String userdate1) {
        doSetUserdate1_Equal(fRES(userdate1));
    }

    protected void doSetUserdate1_Equal(String userdate1) {
        regUserdate1(CK_EQ, userdate1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERDATE1: {varchar(30)}
     * @param userdate1 The value of userdate1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserdate1_NotEqual(String userdate1) {
        doSetUserdate1_NotEqual(fRES(userdate1));
    }

    protected void doSetUserdate1_NotEqual(String userdate1) {
        regUserdate1(CK_NES, userdate1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERDATE1: {varchar(30)}
     * @param userdate1 The value of userdate1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserdate1_GreaterThan(String userdate1) {
        regUserdate1(CK_GT, fRES(userdate1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERDATE1: {varchar(30)}
     * @param userdate1 The value of userdate1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserdate1_LessThan(String userdate1) {
        regUserdate1(CK_LT, fRES(userdate1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERDATE1: {varchar(30)}
     * @param userdate1 The value of userdate1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserdate1_GreaterEqual(String userdate1) {
        regUserdate1(CK_GE, fRES(userdate1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERDATE1: {varchar(30)}
     * @param userdate1 The value of userdate1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserdate1_LessEqual(String userdate1) {
        regUserdate1(CK_LE, fRES(userdate1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * USERDATE1: {varchar(30)}
     * @param userdate1List The collection of userdate1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserdate1_InScope(Collection<String> userdate1List) {
        doSetUserdate1_InScope(userdate1List);
    }

    protected void doSetUserdate1_InScope(Collection<String> userdate1List) {
        regINS(CK_INS, cTL(userdate1List), xgetCValueUserdate1(), "USERDATE1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * USERDATE1: {varchar(30)}
     * @param userdate1List The collection of userdate1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserdate1_NotInScope(Collection<String> userdate1List) {
        doSetUserdate1_NotInScope(userdate1List);
    }

    protected void doSetUserdate1_NotInScope(Collection<String> userdate1List) {
        regINS(CK_NINS, cTL(userdate1List), xgetCValueUserdate1(), "USERDATE1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USERDATE1: {varchar(30)} <br>
     * <pre>e.g. setUserdate1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param userdate1 The value of userdate1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setUserdate1_LikeSearch(String userdate1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(userdate1), xgetCValueUserdate1(), "USERDATE1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USERDATE1: {varchar(30)}
     * @param userdate1 The value of userdate1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setUserdate1_NotLikeSearch(String userdate1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(userdate1), xgetCValueUserdate1(), "USERDATE1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USERDATE1: {varchar(30)}
     * @param userdate1 The value of userdate1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserdate1_PrefixSearch(String userdate1) {
        setUserdate1_LikeSearch(userdate1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * USERDATE1: {varchar(30)}
     */
    public void setUserdate1_IsNull() { regUserdate1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * USERDATE1: {varchar(30)}
     */
    public void setUserdate1_IsNullOrEmpty() { regUserdate1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * USERDATE1: {varchar(30)}
     */
    public void setUserdate1_IsNotNull() { regUserdate1(CK_ISNN, DOBJ); }

    protected void regUserdate1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUserdate1(), "USERDATE1"); }
    protected abstract ConditionValue xgetCValueUserdate1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERDATE2: {varchar(30)}
     * @param userdate2 The value of userdate2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserdate2_Equal(String userdate2) {
        doSetUserdate2_Equal(fRES(userdate2));
    }

    protected void doSetUserdate2_Equal(String userdate2) {
        regUserdate2(CK_EQ, userdate2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERDATE2: {varchar(30)}
     * @param userdate2 The value of userdate2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserdate2_NotEqual(String userdate2) {
        doSetUserdate2_NotEqual(fRES(userdate2));
    }

    protected void doSetUserdate2_NotEqual(String userdate2) {
        regUserdate2(CK_NES, userdate2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERDATE2: {varchar(30)}
     * @param userdate2 The value of userdate2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserdate2_GreaterThan(String userdate2) {
        regUserdate2(CK_GT, fRES(userdate2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERDATE2: {varchar(30)}
     * @param userdate2 The value of userdate2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserdate2_LessThan(String userdate2) {
        regUserdate2(CK_LT, fRES(userdate2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERDATE2: {varchar(30)}
     * @param userdate2 The value of userdate2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserdate2_GreaterEqual(String userdate2) {
        regUserdate2(CK_GE, fRES(userdate2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERDATE2: {varchar(30)}
     * @param userdate2 The value of userdate2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserdate2_LessEqual(String userdate2) {
        regUserdate2(CK_LE, fRES(userdate2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * USERDATE2: {varchar(30)}
     * @param userdate2List The collection of userdate2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserdate2_InScope(Collection<String> userdate2List) {
        doSetUserdate2_InScope(userdate2List);
    }

    protected void doSetUserdate2_InScope(Collection<String> userdate2List) {
        regINS(CK_INS, cTL(userdate2List), xgetCValueUserdate2(), "USERDATE2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * USERDATE2: {varchar(30)}
     * @param userdate2List The collection of userdate2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserdate2_NotInScope(Collection<String> userdate2List) {
        doSetUserdate2_NotInScope(userdate2List);
    }

    protected void doSetUserdate2_NotInScope(Collection<String> userdate2List) {
        regINS(CK_NINS, cTL(userdate2List), xgetCValueUserdate2(), "USERDATE2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USERDATE2: {varchar(30)} <br>
     * <pre>e.g. setUserdate2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param userdate2 The value of userdate2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setUserdate2_LikeSearch(String userdate2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(userdate2), xgetCValueUserdate2(), "USERDATE2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USERDATE2: {varchar(30)}
     * @param userdate2 The value of userdate2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setUserdate2_NotLikeSearch(String userdate2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(userdate2), xgetCValueUserdate2(), "USERDATE2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USERDATE2: {varchar(30)}
     * @param userdate2 The value of userdate2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserdate2_PrefixSearch(String userdate2) {
        setUserdate2_LikeSearch(userdate2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * USERDATE2: {varchar(30)}
     */
    public void setUserdate2_IsNull() { regUserdate2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * USERDATE2: {varchar(30)}
     */
    public void setUserdate2_IsNullOrEmpty() { regUserdate2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * USERDATE2: {varchar(30)}
     */
    public void setUserdate2_IsNotNull() { regUserdate2(CK_ISNN, DOBJ); }

    protected void regUserdate2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUserdate2(), "USERDATE2"); }
    protected abstract ConditionValue xgetCValueUserdate2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERDATE3: {varchar(30)}
     * @param userdate3 The value of userdate3 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserdate3_Equal(String userdate3) {
        doSetUserdate3_Equal(fRES(userdate3));
    }

    protected void doSetUserdate3_Equal(String userdate3) {
        regUserdate3(CK_EQ, userdate3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERDATE3: {varchar(30)}
     * @param userdate3 The value of userdate3 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserdate3_NotEqual(String userdate3) {
        doSetUserdate3_NotEqual(fRES(userdate3));
    }

    protected void doSetUserdate3_NotEqual(String userdate3) {
        regUserdate3(CK_NES, userdate3);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERDATE3: {varchar(30)}
     * @param userdate3 The value of userdate3 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserdate3_GreaterThan(String userdate3) {
        regUserdate3(CK_GT, fRES(userdate3));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERDATE3: {varchar(30)}
     * @param userdate3 The value of userdate3 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserdate3_LessThan(String userdate3) {
        regUserdate3(CK_LT, fRES(userdate3));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERDATE3: {varchar(30)}
     * @param userdate3 The value of userdate3 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserdate3_GreaterEqual(String userdate3) {
        regUserdate3(CK_GE, fRES(userdate3));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERDATE3: {varchar(30)}
     * @param userdate3 The value of userdate3 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserdate3_LessEqual(String userdate3) {
        regUserdate3(CK_LE, fRES(userdate3));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * USERDATE3: {varchar(30)}
     * @param userdate3List The collection of userdate3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserdate3_InScope(Collection<String> userdate3List) {
        doSetUserdate3_InScope(userdate3List);
    }

    protected void doSetUserdate3_InScope(Collection<String> userdate3List) {
        regINS(CK_INS, cTL(userdate3List), xgetCValueUserdate3(), "USERDATE3");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * USERDATE3: {varchar(30)}
     * @param userdate3List The collection of userdate3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserdate3_NotInScope(Collection<String> userdate3List) {
        doSetUserdate3_NotInScope(userdate3List);
    }

    protected void doSetUserdate3_NotInScope(Collection<String> userdate3List) {
        regINS(CK_NINS, cTL(userdate3List), xgetCValueUserdate3(), "USERDATE3");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USERDATE3: {varchar(30)} <br>
     * <pre>e.g. setUserdate3_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param userdate3 The value of userdate3 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setUserdate3_LikeSearch(String userdate3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(userdate3), xgetCValueUserdate3(), "USERDATE3", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USERDATE3: {varchar(30)}
     * @param userdate3 The value of userdate3 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setUserdate3_NotLikeSearch(String userdate3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(userdate3), xgetCValueUserdate3(), "USERDATE3", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USERDATE3: {varchar(30)}
     * @param userdate3 The value of userdate3 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserdate3_PrefixSearch(String userdate3) {
        setUserdate3_LikeSearch(userdate3, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * USERDATE3: {varchar(30)}
     */
    public void setUserdate3_IsNull() { regUserdate3(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * USERDATE3: {varchar(30)}
     */
    public void setUserdate3_IsNullOrEmpty() { regUserdate3(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * USERDATE3: {varchar(30)}
     */
    public void setUserdate3_IsNotNull() { regUserdate3(CK_ISNN, DOBJ); }

    protected void regUserdate3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUserdate3(), "USERDATE3"); }
    protected abstract ConditionValue xgetCValueUserdate3();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERDATE4: {varchar(30)}
     * @param userdate4 The value of userdate4 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserdate4_Equal(String userdate4) {
        doSetUserdate4_Equal(fRES(userdate4));
    }

    protected void doSetUserdate4_Equal(String userdate4) {
        regUserdate4(CK_EQ, userdate4);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERDATE4: {varchar(30)}
     * @param userdate4 The value of userdate4 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserdate4_NotEqual(String userdate4) {
        doSetUserdate4_NotEqual(fRES(userdate4));
    }

    protected void doSetUserdate4_NotEqual(String userdate4) {
        regUserdate4(CK_NES, userdate4);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERDATE4: {varchar(30)}
     * @param userdate4 The value of userdate4 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserdate4_GreaterThan(String userdate4) {
        regUserdate4(CK_GT, fRES(userdate4));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERDATE4: {varchar(30)}
     * @param userdate4 The value of userdate4 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserdate4_LessThan(String userdate4) {
        regUserdate4(CK_LT, fRES(userdate4));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERDATE4: {varchar(30)}
     * @param userdate4 The value of userdate4 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserdate4_GreaterEqual(String userdate4) {
        regUserdate4(CK_GE, fRES(userdate4));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERDATE4: {varchar(30)}
     * @param userdate4 The value of userdate4 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserdate4_LessEqual(String userdate4) {
        regUserdate4(CK_LE, fRES(userdate4));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * USERDATE4: {varchar(30)}
     * @param userdate4List The collection of userdate4 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserdate4_InScope(Collection<String> userdate4List) {
        doSetUserdate4_InScope(userdate4List);
    }

    protected void doSetUserdate4_InScope(Collection<String> userdate4List) {
        regINS(CK_INS, cTL(userdate4List), xgetCValueUserdate4(), "USERDATE4");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * USERDATE4: {varchar(30)}
     * @param userdate4List The collection of userdate4 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserdate4_NotInScope(Collection<String> userdate4List) {
        doSetUserdate4_NotInScope(userdate4List);
    }

    protected void doSetUserdate4_NotInScope(Collection<String> userdate4List) {
        regINS(CK_NINS, cTL(userdate4List), xgetCValueUserdate4(), "USERDATE4");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USERDATE4: {varchar(30)} <br>
     * <pre>e.g. setUserdate4_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param userdate4 The value of userdate4 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setUserdate4_LikeSearch(String userdate4, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(userdate4), xgetCValueUserdate4(), "USERDATE4", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USERDATE4: {varchar(30)}
     * @param userdate4 The value of userdate4 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setUserdate4_NotLikeSearch(String userdate4, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(userdate4), xgetCValueUserdate4(), "USERDATE4", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USERDATE4: {varchar(30)}
     * @param userdate4 The value of userdate4 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserdate4_PrefixSearch(String userdate4) {
        setUserdate4_LikeSearch(userdate4, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * USERDATE4: {varchar(30)}
     */
    public void setUserdate4_IsNull() { regUserdate4(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * USERDATE4: {varchar(30)}
     */
    public void setUserdate4_IsNullOrEmpty() { regUserdate4(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * USERDATE4: {varchar(30)}
     */
    public void setUserdate4_IsNotNull() { regUserdate4(CK_ISNN, DOBJ); }

    protected void regUserdate4(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUserdate4(), "USERDATE4"); }
    protected abstract ConditionValue xgetCValueUserdate4();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERDATE5: {varchar(30)}
     * @param userdate5 The value of userdate5 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserdate5_Equal(String userdate5) {
        doSetUserdate5_Equal(fRES(userdate5));
    }

    protected void doSetUserdate5_Equal(String userdate5) {
        regUserdate5(CK_EQ, userdate5);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERDATE5: {varchar(30)}
     * @param userdate5 The value of userdate5 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserdate5_NotEqual(String userdate5) {
        doSetUserdate5_NotEqual(fRES(userdate5));
    }

    protected void doSetUserdate5_NotEqual(String userdate5) {
        regUserdate5(CK_NES, userdate5);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERDATE5: {varchar(30)}
     * @param userdate5 The value of userdate5 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserdate5_GreaterThan(String userdate5) {
        regUserdate5(CK_GT, fRES(userdate5));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERDATE5: {varchar(30)}
     * @param userdate5 The value of userdate5 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserdate5_LessThan(String userdate5) {
        regUserdate5(CK_LT, fRES(userdate5));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERDATE5: {varchar(30)}
     * @param userdate5 The value of userdate5 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserdate5_GreaterEqual(String userdate5) {
        regUserdate5(CK_GE, fRES(userdate5));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERDATE5: {varchar(30)}
     * @param userdate5 The value of userdate5 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserdate5_LessEqual(String userdate5) {
        regUserdate5(CK_LE, fRES(userdate5));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * USERDATE5: {varchar(30)}
     * @param userdate5List The collection of userdate5 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserdate5_InScope(Collection<String> userdate5List) {
        doSetUserdate5_InScope(userdate5List);
    }

    protected void doSetUserdate5_InScope(Collection<String> userdate5List) {
        regINS(CK_INS, cTL(userdate5List), xgetCValueUserdate5(), "USERDATE5");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * USERDATE5: {varchar(30)}
     * @param userdate5List The collection of userdate5 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserdate5_NotInScope(Collection<String> userdate5List) {
        doSetUserdate5_NotInScope(userdate5List);
    }

    protected void doSetUserdate5_NotInScope(Collection<String> userdate5List) {
        regINS(CK_NINS, cTL(userdate5List), xgetCValueUserdate5(), "USERDATE5");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USERDATE5: {varchar(30)} <br>
     * <pre>e.g. setUserdate5_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param userdate5 The value of userdate5 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setUserdate5_LikeSearch(String userdate5, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(userdate5), xgetCValueUserdate5(), "USERDATE5", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USERDATE5: {varchar(30)}
     * @param userdate5 The value of userdate5 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setUserdate5_NotLikeSearch(String userdate5, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(userdate5), xgetCValueUserdate5(), "USERDATE5", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USERDATE5: {varchar(30)}
     * @param userdate5 The value of userdate5 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserdate5_PrefixSearch(String userdate5) {
        setUserdate5_LikeSearch(userdate5, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * USERDATE5: {varchar(30)}
     */
    public void setUserdate5_IsNull() { regUserdate5(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * USERDATE5: {varchar(30)}
     */
    public void setUserdate5_IsNullOrEmpty() { regUserdate5(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * USERDATE5: {varchar(30)}
     */
    public void setUserdate5_IsNotNull() { regUserdate5(CK_ISNN, DOBJ); }

    protected void regUserdate5(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUserdate5(), "USERDATE5"); }
    protected abstract ConditionValue xgetCValueUserdate5();

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
    public HpSLCFunction<ETrifitemCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, ETrifitemCB.class);
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
    public HpSLCFunction<ETrifitemCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, ETrifitemCB.class);
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
    public HpSLCFunction<ETrifitemCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, ETrifitemCB.class);
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
    public HpSLCFunction<ETrifitemCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, ETrifitemCB.class);
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
    public HpSLCFunction<ETrifitemCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, ETrifitemCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;ETrifitemCB&gt;() {
     *     public void query(ETrifitemCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<ETrifitemCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, ETrifitemCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        ETrifitemCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(ETrifitemCQ sq);

    protected ETrifitemCB xcreateScalarConditionCB() {
        ETrifitemCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected ETrifitemCB xcreateScalarConditionPartitionByCB() {
        ETrifitemCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<ETrifitemCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        ETrifitemCB cb = new ETrifitemCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "IMPORTKEY";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(ETrifitemCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<ETrifitemCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(ETrifitemCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        ETrifitemCB cb = new ETrifitemCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "IMPORTKEY";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(ETrifitemCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<ETrifitemCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        ETrifitemCB cb = new ETrifitemCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(ETrifitemCQ sq);

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
    protected ETrifitemCB newMyCB() {
        return new ETrifitemCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return ETrifitemCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
