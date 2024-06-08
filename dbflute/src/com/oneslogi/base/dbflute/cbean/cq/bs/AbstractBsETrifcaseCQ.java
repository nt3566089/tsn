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
 * The abstract condition-query of E_TRIFCASE.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsETrifcaseCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsETrifcaseCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "E_TRIFCASE";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * JTSYMBOLNO: {PK, NotNull, decimal(16, 6)}
     * @param jtsymbolno The value of jtsymbolno as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setJtsymbolno_Equal(java.math.BigDecimal jtsymbolno) {
        doSetJtsymbolno_Equal(jtsymbolno);
    }

    protected void doSetJtsymbolno_Equal(java.math.BigDecimal jtsymbolno) {
        regJtsymbolno(CK_EQ, jtsymbolno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * JTSYMBOLNO: {PK, NotNull, decimal(16, 6)}
     * @param jtsymbolno The value of jtsymbolno as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setJtsymbolno_NotEqual(java.math.BigDecimal jtsymbolno) {
        doSetJtsymbolno_NotEqual(jtsymbolno);
    }

    protected void doSetJtsymbolno_NotEqual(java.math.BigDecimal jtsymbolno) {
        regJtsymbolno(CK_NES, jtsymbolno);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * JTSYMBOLNO: {PK, NotNull, decimal(16, 6)}
     * @param jtsymbolno The value of jtsymbolno as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setJtsymbolno_GreaterThan(java.math.BigDecimal jtsymbolno) {
        regJtsymbolno(CK_GT, jtsymbolno);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * JTSYMBOLNO: {PK, NotNull, decimal(16, 6)}
     * @param jtsymbolno The value of jtsymbolno as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setJtsymbolno_LessThan(java.math.BigDecimal jtsymbolno) {
        regJtsymbolno(CK_LT, jtsymbolno);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * JTSYMBOLNO: {PK, NotNull, decimal(16, 6)}
     * @param jtsymbolno The value of jtsymbolno as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setJtsymbolno_GreaterEqual(java.math.BigDecimal jtsymbolno) {
        regJtsymbolno(CK_GE, jtsymbolno);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * JTSYMBOLNO: {PK, NotNull, decimal(16, 6)}
     * @param jtsymbolno The value of jtsymbolno as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setJtsymbolno_LessEqual(java.math.BigDecimal jtsymbolno) {
        regJtsymbolno(CK_LE, jtsymbolno);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * JTSYMBOLNO: {PK, NotNull, decimal(16, 6)}
     * @param minNumber The min number of jtsymbolno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of jtsymbolno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setJtsymbolno_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueJtsymbolno(), "JTSYMBOLNO", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * JTSYMBOLNO: {PK, NotNull, decimal(16, 6)}
     * @param jtsymbolnoList The collection of jtsymbolno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJtsymbolno_InScope(Collection<java.math.BigDecimal> jtsymbolnoList) {
        doSetJtsymbolno_InScope(jtsymbolnoList);
    }

    protected void doSetJtsymbolno_InScope(Collection<java.math.BigDecimal> jtsymbolnoList) {
        regINS(CK_INS, cTL(jtsymbolnoList), xgetCValueJtsymbolno(), "JTSYMBOLNO");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * JTSYMBOLNO: {PK, NotNull, decimal(16, 6)}
     * @param jtsymbolnoList The collection of jtsymbolno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJtsymbolno_NotInScope(Collection<java.math.BigDecimal> jtsymbolnoList) {
        doSetJtsymbolno_NotInScope(jtsymbolnoList);
    }

    protected void doSetJtsymbolno_NotInScope(Collection<java.math.BigDecimal> jtsymbolnoList) {
        regINS(CK_NINS, cTL(jtsymbolnoList), xgetCValueJtsymbolno(), "JTSYMBOLNO");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * JTSYMBOLNO: {PK, NotNull, decimal(16, 6)}
     */
    public void setJtsymbolno_IsNull() { regJtsymbolno(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * JTSYMBOLNO: {PK, NotNull, decimal(16, 6)}
     */
    public void setJtsymbolno_IsNotNull() { regJtsymbolno(CK_ISNN, DOBJ); }

    protected void regJtsymbolno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueJtsymbolno(), "JTSYMBOLNO"); }
    protected abstract ConditionValue xgetCValueJtsymbolno();

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
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PALLETID: {varchar(30)}
     * @param palletid The value of palletid as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletid_Equal(String palletid) {
        doSetPalletid_Equal(fRES(palletid));
    }

    protected void doSetPalletid_Equal(String palletid) {
        regPalletid(CK_EQ, palletid);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PALLETID: {varchar(30)}
     * @param palletid The value of palletid as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletid_NotEqual(String palletid) {
        doSetPalletid_NotEqual(fRES(palletid));
    }

    protected void doSetPalletid_NotEqual(String palletid) {
        regPalletid(CK_NES, palletid);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PALLETID: {varchar(30)}
     * @param palletid The value of palletid as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletid_GreaterThan(String palletid) {
        regPalletid(CK_GT, fRES(palletid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PALLETID: {varchar(30)}
     * @param palletid The value of palletid as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletid_LessThan(String palletid) {
        regPalletid(CK_LT, fRES(palletid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PALLETID: {varchar(30)}
     * @param palletid The value of palletid as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletid_GreaterEqual(String palletid) {
        regPalletid(CK_GE, fRES(palletid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PALLETID: {varchar(30)}
     * @param palletid The value of palletid as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletid_LessEqual(String palletid) {
        regPalletid(CK_LE, fRES(palletid));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PALLETID: {varchar(30)}
     * @param palletidList The collection of palletid as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletid_InScope(Collection<String> palletidList) {
        doSetPalletid_InScope(palletidList);
    }

    protected void doSetPalletid_InScope(Collection<String> palletidList) {
        regINS(CK_INS, cTL(palletidList), xgetCValuePalletid(), "PALLETID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PALLETID: {varchar(30)}
     * @param palletidList The collection of palletid as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletid_NotInScope(Collection<String> palletidList) {
        doSetPalletid_NotInScope(palletidList);
    }

    protected void doSetPalletid_NotInScope(Collection<String> palletidList) {
        regINS(CK_NINS, cTL(palletidList), xgetCValuePalletid(), "PALLETID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PALLETID: {varchar(30)} <br>
     * <pre>e.g. setPalletid_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param palletid The value of palletid as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPalletid_LikeSearch(String palletid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(palletid), xgetCValuePalletid(), "PALLETID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PALLETID: {varchar(30)}
     * @param palletid The value of palletid as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPalletid_NotLikeSearch(String palletid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(palletid), xgetCValuePalletid(), "PALLETID", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PALLETID: {varchar(30)}
     * @param palletid The value of palletid as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletid_PrefixSearch(String palletid) {
        setPalletid_LikeSearch(palletid, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PALLETID: {varchar(30)}
     */
    public void setPalletid_IsNull() { regPalletid(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PALLETID: {varchar(30)}
     */
    public void setPalletid_IsNullOrEmpty() { regPalletid(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PALLETID: {varchar(30)}
     */
    public void setPalletid_IsNotNull() { regPalletid(CK_ISNN, DOBJ); }

    protected void regPalletid(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePalletid(), "PALLETID"); }
    protected abstract ConditionValue xgetCValuePalletid();

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
     * SHIPTOCD: {varchar(30)}
     * @param shiptocd The value of shiptocd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShiptocd_Equal(String shiptocd) {
        doSetShiptocd_Equal(fRES(shiptocd));
    }

    protected void doSetShiptocd_Equal(String shiptocd) {
        regShiptocd(CK_EQ, shiptocd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPTOCD: {varchar(30)}
     * @param shiptocd The value of shiptocd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShiptocd_NotEqual(String shiptocd) {
        doSetShiptocd_NotEqual(fRES(shiptocd));
    }

    protected void doSetShiptocd_NotEqual(String shiptocd) {
        regShiptocd(CK_NES, shiptocd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPTOCD: {varchar(30)}
     * @param shiptocd The value of shiptocd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShiptocd_GreaterThan(String shiptocd) {
        regShiptocd(CK_GT, fRES(shiptocd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPTOCD: {varchar(30)}
     * @param shiptocd The value of shiptocd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShiptocd_LessThan(String shiptocd) {
        regShiptocd(CK_LT, fRES(shiptocd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPTOCD: {varchar(30)}
     * @param shiptocd The value of shiptocd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShiptocd_GreaterEqual(String shiptocd) {
        regShiptocd(CK_GE, fRES(shiptocd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPTOCD: {varchar(30)}
     * @param shiptocd The value of shiptocd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShiptocd_LessEqual(String shiptocd) {
        regShiptocd(CK_LE, fRES(shiptocd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPTOCD: {varchar(30)}
     * @param shiptocdList The collection of shiptocd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShiptocd_InScope(Collection<String> shiptocdList) {
        doSetShiptocd_InScope(shiptocdList);
    }

    protected void doSetShiptocd_InScope(Collection<String> shiptocdList) {
        regINS(CK_INS, cTL(shiptocdList), xgetCValueShiptocd(), "SHIPTOCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPTOCD: {varchar(30)}
     * @param shiptocdList The collection of shiptocd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShiptocd_NotInScope(Collection<String> shiptocdList) {
        doSetShiptocd_NotInScope(shiptocdList);
    }

    protected void doSetShiptocd_NotInScope(Collection<String> shiptocdList) {
        regINS(CK_NINS, cTL(shiptocdList), xgetCValueShiptocd(), "SHIPTOCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPTOCD: {varchar(30)} <br>
     * <pre>e.g. setShiptocd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param shiptocd The value of shiptocd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setShiptocd_LikeSearch(String shiptocd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(shiptocd), xgetCValueShiptocd(), "SHIPTOCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPTOCD: {varchar(30)}
     * @param shiptocd The value of shiptocd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setShiptocd_NotLikeSearch(String shiptocd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shiptocd), xgetCValueShiptocd(), "SHIPTOCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPTOCD: {varchar(30)}
     * @param shiptocd The value of shiptocd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShiptocd_PrefixSearch(String shiptocd) {
        setShiptocd_LikeSearch(shiptocd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIPTOCD: {varchar(30)}
     */
    public void setShiptocd_IsNull() { regShiptocd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SHIPTOCD: {varchar(30)}
     */
    public void setShiptocd_IsNullOrEmpty() { regShiptocd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIPTOCD: {varchar(30)}
     */
    public void setShiptocd_IsNotNull() { regShiptocd(CK_ISNN, DOBJ); }

    protected void regShiptocd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShiptocd(), "SHIPTOCD"); }
    protected abstract ConditionValue xgetCValueShiptocd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HEAD_ORDERNO: {varchar(30)}
     * @param headOrderno The value of headOrderno as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHeadOrderno_Equal(String headOrderno) {
        doSetHeadOrderno_Equal(fRES(headOrderno));
    }

    protected void doSetHeadOrderno_Equal(String headOrderno) {
        regHeadOrderno(CK_EQ, headOrderno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HEAD_ORDERNO: {varchar(30)}
     * @param headOrderno The value of headOrderno as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHeadOrderno_NotEqual(String headOrderno) {
        doSetHeadOrderno_NotEqual(fRES(headOrderno));
    }

    protected void doSetHeadOrderno_NotEqual(String headOrderno) {
        regHeadOrderno(CK_NES, headOrderno);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HEAD_ORDERNO: {varchar(30)}
     * @param headOrderno The value of headOrderno as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHeadOrderno_GreaterThan(String headOrderno) {
        regHeadOrderno(CK_GT, fRES(headOrderno));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HEAD_ORDERNO: {varchar(30)}
     * @param headOrderno The value of headOrderno as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHeadOrderno_LessThan(String headOrderno) {
        regHeadOrderno(CK_LT, fRES(headOrderno));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HEAD_ORDERNO: {varchar(30)}
     * @param headOrderno The value of headOrderno as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHeadOrderno_GreaterEqual(String headOrderno) {
        regHeadOrderno(CK_GE, fRES(headOrderno));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HEAD_ORDERNO: {varchar(30)}
     * @param headOrderno The value of headOrderno as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHeadOrderno_LessEqual(String headOrderno) {
        regHeadOrderno(CK_LE, fRES(headOrderno));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * HEAD_ORDERNO: {varchar(30)}
     * @param headOrdernoList The collection of headOrderno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHeadOrderno_InScope(Collection<String> headOrdernoList) {
        doSetHeadOrderno_InScope(headOrdernoList);
    }

    protected void doSetHeadOrderno_InScope(Collection<String> headOrdernoList) {
        regINS(CK_INS, cTL(headOrdernoList), xgetCValueHeadOrderno(), "HEAD_ORDERNO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * HEAD_ORDERNO: {varchar(30)}
     * @param headOrdernoList The collection of headOrderno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHeadOrderno_NotInScope(Collection<String> headOrdernoList) {
        doSetHeadOrderno_NotInScope(headOrdernoList);
    }

    protected void doSetHeadOrderno_NotInScope(Collection<String> headOrdernoList) {
        regINS(CK_NINS, cTL(headOrdernoList), xgetCValueHeadOrderno(), "HEAD_ORDERNO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HEAD_ORDERNO: {varchar(30)} <br>
     * <pre>e.g. setHeadOrderno_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param headOrderno The value of headOrderno as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setHeadOrderno_LikeSearch(String headOrderno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(headOrderno), xgetCValueHeadOrderno(), "HEAD_ORDERNO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HEAD_ORDERNO: {varchar(30)}
     * @param headOrderno The value of headOrderno as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setHeadOrderno_NotLikeSearch(String headOrderno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(headOrderno), xgetCValueHeadOrderno(), "HEAD_ORDERNO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HEAD_ORDERNO: {varchar(30)}
     * @param headOrderno The value of headOrderno as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHeadOrderno_PrefixSearch(String headOrderno) {
        setHeadOrderno_LikeSearch(headOrderno, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * HEAD_ORDERNO: {varchar(30)}
     */
    public void setHeadOrderno_IsNull() { regHeadOrderno(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * HEAD_ORDERNO: {varchar(30)}
     */
    public void setHeadOrderno_IsNullOrEmpty() { regHeadOrderno(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * HEAD_ORDERNO: {varchar(30)}
     */
    public void setHeadOrderno_IsNotNull() { regHeadOrderno(CK_ISNN, DOBJ); }

    protected void regHeadOrderno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueHeadOrderno(), "HEAD_ORDERNO"); }
    protected abstract ConditionValue xgetCValueHeadOrderno();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CASEQTY: {bigint(19)}
     * @param caseqty The value of caseqty as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCaseqty_Equal(Long caseqty) {
        doSetCaseqty_Equal(caseqty);
    }

    protected void doSetCaseqty_Equal(Long caseqty) {
        regCaseqty(CK_EQ, caseqty);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CASEQTY: {bigint(19)}
     * @param caseqty The value of caseqty as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCaseqty_NotEqual(Long caseqty) {
        doSetCaseqty_NotEqual(caseqty);
    }

    protected void doSetCaseqty_NotEqual(Long caseqty) {
        regCaseqty(CK_NES, caseqty);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CASEQTY: {bigint(19)}
     * @param caseqty The value of caseqty as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCaseqty_GreaterThan(Long caseqty) {
        regCaseqty(CK_GT, caseqty);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CASEQTY: {bigint(19)}
     * @param caseqty The value of caseqty as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCaseqty_LessThan(Long caseqty) {
        regCaseqty(CK_LT, caseqty);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CASEQTY: {bigint(19)}
     * @param caseqty The value of caseqty as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCaseqty_GreaterEqual(Long caseqty) {
        regCaseqty(CK_GE, caseqty);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CASEQTY: {bigint(19)}
     * @param caseqty The value of caseqty as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCaseqty_LessEqual(Long caseqty) {
        regCaseqty(CK_LE, caseqty);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CASEQTY: {bigint(19)}
     * @param minNumber The min number of caseqty. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of caseqty. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCaseqty_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCaseqty(), "CASEQTY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CASEQTY: {bigint(19)}
     * @param caseqtyList The collection of caseqty as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseqty_InScope(Collection<Long> caseqtyList) {
        doSetCaseqty_InScope(caseqtyList);
    }

    protected void doSetCaseqty_InScope(Collection<Long> caseqtyList) {
        regINS(CK_INS, cTL(caseqtyList), xgetCValueCaseqty(), "CASEQTY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CASEQTY: {bigint(19)}
     * @param caseqtyList The collection of caseqty as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseqty_NotInScope(Collection<Long> caseqtyList) {
        doSetCaseqty_NotInScope(caseqtyList);
    }

    protected void doSetCaseqty_NotInScope(Collection<Long> caseqtyList) {
        regINS(CK_NINS, cTL(caseqtyList), xgetCValueCaseqty(), "CASEQTY");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CASEQTY: {bigint(19)}
     */
    public void setCaseqty_IsNull() { regCaseqty(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CASEQTY: {bigint(19)}
     */
    public void setCaseqty_IsNotNull() { regCaseqty(CK_ISNN, DOBJ); }

    protected void regCaseqty(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCaseqty(), "CASEQTY"); }
    protected abstract ConditionValue xgetCValueCaseqty();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * FRACTQTY: {bigint(19)}
     * @param fractqty The value of fractqty as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setFractqty_Equal(Long fractqty) {
        doSetFractqty_Equal(fractqty);
    }

    protected void doSetFractqty_Equal(Long fractqty) {
        regFractqty(CK_EQ, fractqty);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FRACTQTY: {bigint(19)}
     * @param fractqty The value of fractqty as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFractqty_NotEqual(Long fractqty) {
        doSetFractqty_NotEqual(fractqty);
    }

    protected void doSetFractqty_NotEqual(Long fractqty) {
        regFractqty(CK_NES, fractqty);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FRACTQTY: {bigint(19)}
     * @param fractqty The value of fractqty as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setFractqty_GreaterThan(Long fractqty) {
        regFractqty(CK_GT, fractqty);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FRACTQTY: {bigint(19)}
     * @param fractqty The value of fractqty as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setFractqty_LessThan(Long fractqty) {
        regFractqty(CK_LT, fractqty);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * FRACTQTY: {bigint(19)}
     * @param fractqty The value of fractqty as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFractqty_GreaterEqual(Long fractqty) {
        regFractqty(CK_GE, fractqty);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * FRACTQTY: {bigint(19)}
     * @param fractqty The value of fractqty as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFractqty_LessEqual(Long fractqty) {
        regFractqty(CK_LE, fractqty);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * FRACTQTY: {bigint(19)}
     * @param minNumber The min number of fractqty. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of fractqty. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setFractqty_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueFractqty(), "FRACTQTY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * FRACTQTY: {bigint(19)}
     * @param fractqtyList The collection of fractqty as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFractqty_InScope(Collection<Long> fractqtyList) {
        doSetFractqty_InScope(fractqtyList);
    }

    protected void doSetFractqty_InScope(Collection<Long> fractqtyList) {
        regINS(CK_INS, cTL(fractqtyList), xgetCValueFractqty(), "FRACTQTY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * FRACTQTY: {bigint(19)}
     * @param fractqtyList The collection of fractqty as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFractqty_NotInScope(Collection<Long> fractqtyList) {
        doSetFractqty_NotInScope(fractqtyList);
    }

    protected void doSetFractqty_NotInScope(Collection<Long> fractqtyList) {
        regINS(CK_NINS, cTL(fractqtyList), xgetCValueFractqty(), "FRACTQTY");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FRACTQTY: {bigint(19)}
     */
    public void setFractqty_IsNull() { regFractqty(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FRACTQTY: {bigint(19)}
     */
    public void setFractqty_IsNotNull() { regFractqty(CK_ISNN, DOBJ); }

    protected void regFractqty(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFractqty(), "FRACTQTY"); }
    protected abstract ConditionValue xgetCValueFractqty();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOLADDFLG: {char(1)}
     * @param symboladdflg The value of symboladdflg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymboladdflg_Equal(String symboladdflg) {
        doSetSymboladdflg_Equal(fRES(symboladdflg));
    }

    protected void doSetSymboladdflg_Equal(String symboladdflg) {
        regSymboladdflg(CK_EQ, symboladdflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOLADDFLG: {char(1)}
     * @param symboladdflg The value of symboladdflg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymboladdflg_NotEqual(String symboladdflg) {
        doSetSymboladdflg_NotEqual(fRES(symboladdflg));
    }

    protected void doSetSymboladdflg_NotEqual(String symboladdflg) {
        regSymboladdflg(CK_NES, symboladdflg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOLADDFLG: {char(1)}
     * @param symboladdflg The value of symboladdflg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymboladdflg_GreaterThan(String symboladdflg) {
        regSymboladdflg(CK_GT, fRES(symboladdflg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOLADDFLG: {char(1)}
     * @param symboladdflg The value of symboladdflg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymboladdflg_LessThan(String symboladdflg) {
        regSymboladdflg(CK_LT, fRES(symboladdflg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOLADDFLG: {char(1)}
     * @param symboladdflg The value of symboladdflg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymboladdflg_GreaterEqual(String symboladdflg) {
        regSymboladdflg(CK_GE, fRES(symboladdflg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOLADDFLG: {char(1)}
     * @param symboladdflg The value of symboladdflg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymboladdflg_LessEqual(String symboladdflg) {
        regSymboladdflg(CK_LE, fRES(symboladdflg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SYMBOLADDFLG: {char(1)}
     * @param symboladdflgList The collection of symboladdflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymboladdflg_InScope(Collection<String> symboladdflgList) {
        doSetSymboladdflg_InScope(symboladdflgList);
    }

    protected void doSetSymboladdflg_InScope(Collection<String> symboladdflgList) {
        regINS(CK_INS, cTL(symboladdflgList), xgetCValueSymboladdflg(), "SYMBOLADDFLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SYMBOLADDFLG: {char(1)}
     * @param symboladdflgList The collection of symboladdflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymboladdflg_NotInScope(Collection<String> symboladdflgList) {
        doSetSymboladdflg_NotInScope(symboladdflgList);
    }

    protected void doSetSymboladdflg_NotInScope(Collection<String> symboladdflgList) {
        regINS(CK_NINS, cTL(symboladdflgList), xgetCValueSymboladdflg(), "SYMBOLADDFLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SYMBOLADDFLG: {char(1)} <br>
     * <pre>e.g. setSymboladdflg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param symboladdflg The value of symboladdflg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSymboladdflg_LikeSearch(String symboladdflg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(symboladdflg), xgetCValueSymboladdflg(), "SYMBOLADDFLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SYMBOLADDFLG: {char(1)}
     * @param symboladdflg The value of symboladdflg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSymboladdflg_NotLikeSearch(String symboladdflg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(symboladdflg), xgetCValueSymboladdflg(), "SYMBOLADDFLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SYMBOLADDFLG: {char(1)}
     * @param symboladdflg The value of symboladdflg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymboladdflg_PrefixSearch(String symboladdflg) {
        setSymboladdflg_LikeSearch(symboladdflg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SYMBOLADDFLG: {char(1)}
     */
    public void setSymboladdflg_IsNull() { regSymboladdflg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SYMBOLADDFLG: {char(1)}
     */
    public void setSymboladdflg_IsNotNull() { regSymboladdflg(CK_ISNN, DOBJ); }

    protected void regSymboladdflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSymboladdflg(), "SYMBOLADDFLG"); }
    protected abstract ConditionValue xgetCValueSymboladdflg();

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
    public HpSLCFunction<ETrifcaseCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, ETrifcaseCB.class);
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
    public HpSLCFunction<ETrifcaseCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, ETrifcaseCB.class);
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
    public HpSLCFunction<ETrifcaseCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, ETrifcaseCB.class);
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
    public HpSLCFunction<ETrifcaseCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, ETrifcaseCB.class);
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
    public HpSLCFunction<ETrifcaseCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, ETrifcaseCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;ETrifcaseCB&gt;() {
     *     public void query(ETrifcaseCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<ETrifcaseCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, ETrifcaseCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        ETrifcaseCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(ETrifcaseCQ sq);

    protected ETrifcaseCB xcreateScalarConditionCB() {
        ETrifcaseCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected ETrifcaseCB xcreateScalarConditionPartitionByCB() {
        ETrifcaseCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<ETrifcaseCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        ETrifcaseCB cb = new ETrifcaseCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "JTSYMBOLNO";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(ETrifcaseCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<ETrifcaseCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(ETrifcaseCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        ETrifcaseCB cb = new ETrifcaseCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "JTSYMBOLNO";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(ETrifcaseCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<ETrifcaseCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        ETrifcaseCB cb = new ETrifcaseCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(ETrifcaseCQ sq);

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
    protected ETrifcaseCB newMyCB() {
        return new ETrifcaseCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return ETrifcaseCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
