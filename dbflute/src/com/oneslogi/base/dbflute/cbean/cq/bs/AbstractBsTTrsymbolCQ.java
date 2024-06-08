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
 * The abstract condition-query of T_TRSYMBOL.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTTrsymbolCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTTrsymbolCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "T_TRSYMBOL";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRSYMBOL_ID: {PK, ID, IX, NotNull, bigint identity(19)}
     * @param trsymbolId The value of trsymbolId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrsymbolId_Equal(Long trsymbolId) {
        doSetTrsymbolId_Equal(trsymbolId);
    }

    protected void doSetTrsymbolId_Equal(Long trsymbolId) {
        regTrsymbolId(CK_EQ, trsymbolId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRSYMBOL_ID: {PK, ID, IX, NotNull, bigint identity(19)}
     * @param trsymbolId The value of trsymbolId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrsymbolId_NotEqual(Long trsymbolId) {
        doSetTrsymbolId_NotEqual(trsymbolId);
    }

    protected void doSetTrsymbolId_NotEqual(Long trsymbolId) {
        regTrsymbolId(CK_NES, trsymbolId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRSYMBOL_ID: {PK, ID, IX, NotNull, bigint identity(19)}
     * @param trsymbolId The value of trsymbolId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrsymbolId_GreaterThan(Long trsymbolId) {
        regTrsymbolId(CK_GT, trsymbolId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRSYMBOL_ID: {PK, ID, IX, NotNull, bigint identity(19)}
     * @param trsymbolId The value of trsymbolId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrsymbolId_LessThan(Long trsymbolId) {
        regTrsymbolId(CK_LT, trsymbolId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRSYMBOL_ID: {PK, ID, IX, NotNull, bigint identity(19)}
     * @param trsymbolId The value of trsymbolId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrsymbolId_GreaterEqual(Long trsymbolId) {
        regTrsymbolId(CK_GE, trsymbolId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRSYMBOL_ID: {PK, ID, IX, NotNull, bigint identity(19)}
     * @param trsymbolId The value of trsymbolId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrsymbolId_LessEqual(Long trsymbolId) {
        regTrsymbolId(CK_LE, trsymbolId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TRSYMBOL_ID: {PK, ID, IX, NotNull, bigint identity(19)}
     * @param minNumber The min number of trsymbolId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of trsymbolId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTrsymbolId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTrsymbolId(), "TRSYMBOL_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRSYMBOL_ID: {PK, ID, IX, NotNull, bigint identity(19)}
     * @param trsymbolIdList The collection of trsymbolId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrsymbolId_InScope(Collection<Long> trsymbolIdList) {
        doSetTrsymbolId_InScope(trsymbolIdList);
    }

    protected void doSetTrsymbolId_InScope(Collection<Long> trsymbolIdList) {
        regINS(CK_INS, cTL(trsymbolIdList), xgetCValueTrsymbolId(), "TRSYMBOL_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRSYMBOL_ID: {PK, ID, IX, NotNull, bigint identity(19)}
     * @param trsymbolIdList The collection of trsymbolId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrsymbolId_NotInScope(Collection<Long> trsymbolIdList) {
        doSetTrsymbolId_NotInScope(trsymbolIdList);
    }

    protected void doSetTrsymbolId_NotInScope(Collection<Long> trsymbolIdList) {
        regINS(CK_NINS, cTL(trsymbolIdList), xgetCValueTrsymbolId(), "TRSYMBOL_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select TRSYMBOL_ID from T_CENTER_SYMBOL where ...)} <br>
     * T_CENTER_SYMBOL by TRSYMBOL_ID, named 'TCenterSymbolAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTCenterSymbolList</span>(symbolCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     symbolCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TCenterSymbolList for 'exists'. (NotNull)
     */
    public void existsTCenterSymbolList(SubQuery<TCenterSymbolCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TCenterSymbolCB cb = new TCenterSymbolCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepTrsymbolId_ExistsReferrer_TCenterSymbolList(cb.query());
        registerExistsReferrer(cb.query(), "TRSYMBOL_ID", "TRSYMBOL_ID", pp, "tCenterSymbolList");
    }
    public abstract String keepTrsymbolId_ExistsReferrer_TCenterSymbolList(TCenterSymbolCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select TRSYMBOL_ID from T_CENTER_SYMBOL where ...)} <br>
     * T_CENTER_SYMBOL by TRSYMBOL_ID, named 'TCenterSymbolAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTCenterSymbolList</span>(symbolCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     symbolCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TrsymbolId_NotExistsReferrer_TCenterSymbolList for 'not exists'. (NotNull)
     */
    public void notExistsTCenterSymbolList(SubQuery<TCenterSymbolCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TCenterSymbolCB cb = new TCenterSymbolCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepTrsymbolId_NotExistsReferrer_TCenterSymbolList(cb.query());
        registerNotExistsReferrer(cb.query(), "TRSYMBOL_ID", "TRSYMBOL_ID", pp, "tCenterSymbolList");
    }
    public abstract String keepTrsymbolId_NotExistsReferrer_TCenterSymbolList(TCenterSymbolCQ sq);

    public void xsderiveTCenterSymbolList(String fn, SubQuery<TCenterSymbolCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TCenterSymbolCB cb = new TCenterSymbolCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepTrsymbolId_SpecifyDerivedReferrer_TCenterSymbolList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "TRSYMBOL_ID", "TRSYMBOL_ID", pp, "tCenterSymbolList", al, op);
    }
    public abstract String keepTrsymbolId_SpecifyDerivedReferrer_TCenterSymbolList(TCenterSymbolCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_CENTER_SYMBOL where ...)} <br>
     * T_CENTER_SYMBOL by TRSYMBOL_ID, named 'TCenterSymbolAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTCenterSymbolList()</span>.<span style="color: #CC4747">max</span>(symbolCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     symbolCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     symbolCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TCenterSymbolCB> derivedTCenterSymbolList() {
        return xcreateQDRFunctionTCenterSymbolList();
    }
    protected HpQDRFunction<TCenterSymbolCB> xcreateQDRFunctionTCenterSymbolList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTCenterSymbolList(fn, sq, rd, vl, op));
    }
    public void xqderiveTCenterSymbolList(String fn, SubQuery<TCenterSymbolCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TCenterSymbolCB cb = new TCenterSymbolCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepTrsymbolId_QueryDerivedReferrer_TCenterSymbolList(cb.query()); String prpp = keepTrsymbolId_QueryDerivedReferrer_TCenterSymbolListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "TRSYMBOL_ID", "TRSYMBOL_ID", sqpp, "tCenterSymbolList", rd, vl, prpp, op);
    }
    public abstract String keepTrsymbolId_QueryDerivedReferrer_TCenterSymbolList(TCenterSymbolCQ sq);
    public abstract String keepTrsymbolId_QueryDerivedReferrer_TCenterSymbolListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TRSYMBOL_ID: {PK, ID, IX, NotNull, bigint identity(19)}
     */
    public void setTrsymbolId_IsNull() { regTrsymbolId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TRSYMBOL_ID: {PK, ID, IX, NotNull, bigint identity(19)}
     */
    public void setTrsymbolId_IsNotNull() { regTrsymbolId(CK_ISNN, DOBJ); }

    protected void regTrsymbolId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTrsymbolId(), "TRSYMBOL_ID"); }
    protected abstract ConditionValue xgetCValueTrsymbolId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CASECD: {NotNull, bigint(19)}
     * @param casecd The value of casecd as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCasecd_Equal(Long casecd) {
        doSetCasecd_Equal(casecd);
    }

    protected void doSetCasecd_Equal(Long casecd) {
        regCasecd(CK_EQ, casecd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CASECD: {NotNull, bigint(19)}
     * @param casecd The value of casecd as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCasecd_NotEqual(Long casecd) {
        doSetCasecd_NotEqual(casecd);
    }

    protected void doSetCasecd_NotEqual(Long casecd) {
        regCasecd(CK_NES, casecd);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CASECD: {NotNull, bigint(19)}
     * @param casecd The value of casecd as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCasecd_GreaterThan(Long casecd) {
        regCasecd(CK_GT, casecd);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CASECD: {NotNull, bigint(19)}
     * @param casecd The value of casecd as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCasecd_LessThan(Long casecd) {
        regCasecd(CK_LT, casecd);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CASECD: {NotNull, bigint(19)}
     * @param casecd The value of casecd as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCasecd_GreaterEqual(Long casecd) {
        regCasecd(CK_GE, casecd);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CASECD: {NotNull, bigint(19)}
     * @param casecd The value of casecd as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCasecd_LessEqual(Long casecd) {
        regCasecd(CK_LE, casecd);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CASECD: {NotNull, bigint(19)}
     * @param minNumber The min number of casecd. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of casecd. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCasecd_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCasecd(), "CASECD", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CASECD: {NotNull, bigint(19)}
     * @param casecdList The collection of casecd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasecd_InScope(Collection<Long> casecdList) {
        doSetCasecd_InScope(casecdList);
    }

    protected void doSetCasecd_InScope(Collection<Long> casecdList) {
        regINS(CK_INS, cTL(casecdList), xgetCValueCasecd(), "CASECD");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CASECD: {NotNull, bigint(19)}
     * @param casecdList The collection of casecd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasecd_NotInScope(Collection<Long> casecdList) {
        doSetCasecd_NotInScope(casecdList);
    }

    protected void doSetCasecd_NotInScope(Collection<Long> casecdList) {
        regINS(CK_NINS, cTL(casecdList), xgetCValueCasecd(), "CASECD");
    }

    protected void regCasecd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCasecd(), "CASECD"); }
    protected abstract ConditionValue xgetCValueCasecd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {IX, varchar(30)}
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
     * PRODUCT_CD: {IX, varchar(30)}
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
     * PRODUCT_CD: {IX, varchar(30)}
     * @param productCd The value of productCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_GreaterThan(String productCd) {
        regProductCd(CK_GT, fRES(productCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {IX, varchar(30)}
     * @param productCd The value of productCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_LessThan(String productCd) {
        regProductCd(CK_LT, fRES(productCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {IX, varchar(30)}
     * @param productCd The value of productCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_GreaterEqual(String productCd) {
        regProductCd(CK_GE, fRES(productCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {IX, varchar(30)}
     * @param productCd The value of productCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_LessEqual(String productCd) {
        regProductCd(CK_LE, fRES(productCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCT_CD: {IX, varchar(30)}
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
     * PRODUCT_CD: {IX, varchar(30)}
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
     * PRODUCT_CD: {IX, varchar(30)} <br>
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
     * PRODUCT_CD: {IX, varchar(30)}
     * @param productCd The value of productCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setProductCd_NotLikeSearch(String productCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(productCd), xgetCValueProductCd(), "PRODUCT_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_CD: {IX, varchar(30)}
     * @param productCd The value of productCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_PrefixSearch(String productCd) {
        setProductCd_LikeSearch(productCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PRODUCT_CD: {IX, varchar(30)}
     */
    public void setProductCd_IsNull() { regProductCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PRODUCT_CD: {IX, varchar(30)}
     */
    public void setProductCd_IsNullOrEmpty() { regProductCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PRODUCT_CD: {IX, varchar(30)}
     */
    public void setProductCd_IsNotNull() { regProductCd(CK_ISNN, DOBJ); }

    protected void regProductCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProductCd(), "PRODUCT_CD"); }
    protected abstract ConditionValue xgetCValueProductCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMCD: {varchar(30)}
     * @param itemcd The value of itemcd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcd_Equal(String itemcd) {
        doSetItemcd_Equal(fRES(itemcd));
    }

    protected void doSetItemcd_Equal(String itemcd) {
        regItemcd(CK_EQ, itemcd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMCD: {varchar(30)}
     * @param itemcd The value of itemcd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcd_NotEqual(String itemcd) {
        doSetItemcd_NotEqual(fRES(itemcd));
    }

    protected void doSetItemcd_NotEqual(String itemcd) {
        regItemcd(CK_NES, itemcd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMCD: {varchar(30)}
     * @param itemcd The value of itemcd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcd_GreaterThan(String itemcd) {
        regItemcd(CK_GT, fRES(itemcd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMCD: {varchar(30)}
     * @param itemcd The value of itemcd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcd_LessThan(String itemcd) {
        regItemcd(CK_LT, fRES(itemcd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMCD: {varchar(30)}
     * @param itemcd The value of itemcd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcd_GreaterEqual(String itemcd) {
        regItemcd(CK_GE, fRES(itemcd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMCD: {varchar(30)}
     * @param itemcd The value of itemcd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcd_LessEqual(String itemcd) {
        regItemcd(CK_LE, fRES(itemcd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ITEMCD: {varchar(30)}
     * @param itemcdList The collection of itemcd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcd_InScope(Collection<String> itemcdList) {
        doSetItemcd_InScope(itemcdList);
    }

    protected void doSetItemcd_InScope(Collection<String> itemcdList) {
        regINS(CK_INS, cTL(itemcdList), xgetCValueItemcd(), "ITEMCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ITEMCD: {varchar(30)}
     * @param itemcdList The collection of itemcd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcd_NotInScope(Collection<String> itemcdList) {
        doSetItemcd_NotInScope(itemcdList);
    }

    protected void doSetItemcd_NotInScope(Collection<String> itemcdList) {
        regINS(CK_NINS, cTL(itemcdList), xgetCValueItemcd(), "ITEMCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEMCD: {varchar(30)} <br>
     * <pre>e.g. setItemcd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param itemcd The value of itemcd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setItemcd_LikeSearch(String itemcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(itemcd), xgetCValueItemcd(), "ITEMCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEMCD: {varchar(30)}
     * @param itemcd The value of itemcd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setItemcd_NotLikeSearch(String itemcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(itemcd), xgetCValueItemcd(), "ITEMCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEMCD: {varchar(30)}
     * @param itemcd The value of itemcd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcd_PrefixSearch(String itemcd) {
        setItemcd_LikeSearch(itemcd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ITEMCD: {varchar(30)}
     */
    public void setItemcd_IsNull() { regItemcd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ITEMCD: {varchar(30)}
     */
    public void setItemcd_IsNullOrEmpty() { regItemcd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ITEMCD: {varchar(30)}
     */
    public void setItemcd_IsNotNull() { regItemcd(CK_ISNN, DOBJ); }

    protected void regItemcd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueItemcd(), "ITEMCD"); }
    protected abstract ConditionValue xgetCValueItemcd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD_CASE: {IX+, varchar(30)}
     * @param productCdCase The value of productCdCase as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCdCase_Equal(String productCdCase) {
        doSetProductCdCase_Equal(fRES(productCdCase));
    }

    protected void doSetProductCdCase_Equal(String productCdCase) {
        regProductCdCase(CK_EQ, productCdCase);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD_CASE: {IX+, varchar(30)}
     * @param productCdCase The value of productCdCase as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCdCase_NotEqual(String productCdCase) {
        doSetProductCdCase_NotEqual(fRES(productCdCase));
    }

    protected void doSetProductCdCase_NotEqual(String productCdCase) {
        regProductCdCase(CK_NES, productCdCase);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD_CASE: {IX+, varchar(30)}
     * @param productCdCase The value of productCdCase as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCdCase_GreaterThan(String productCdCase) {
        regProductCdCase(CK_GT, fRES(productCdCase));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD_CASE: {IX+, varchar(30)}
     * @param productCdCase The value of productCdCase as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCdCase_LessThan(String productCdCase) {
        regProductCdCase(CK_LT, fRES(productCdCase));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD_CASE: {IX+, varchar(30)}
     * @param productCdCase The value of productCdCase as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCdCase_GreaterEqual(String productCdCase) {
        regProductCdCase(CK_GE, fRES(productCdCase));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD_CASE: {IX+, varchar(30)}
     * @param productCdCase The value of productCdCase as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCdCase_LessEqual(String productCdCase) {
        regProductCdCase(CK_LE, fRES(productCdCase));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCT_CD_CASE: {IX+, varchar(30)}
     * @param productCdCaseList The collection of productCdCase as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCdCase_InScope(Collection<String> productCdCaseList) {
        doSetProductCdCase_InScope(productCdCaseList);
    }

    protected void doSetProductCdCase_InScope(Collection<String> productCdCaseList) {
        regINS(CK_INS, cTL(productCdCaseList), xgetCValueProductCdCase(), "PRODUCT_CD_CASE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCT_CD_CASE: {IX+, varchar(30)}
     * @param productCdCaseList The collection of productCdCase as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCdCase_NotInScope(Collection<String> productCdCaseList) {
        doSetProductCdCase_NotInScope(productCdCaseList);
    }

    protected void doSetProductCdCase_NotInScope(Collection<String> productCdCaseList) {
        regINS(CK_NINS, cTL(productCdCaseList), xgetCValueProductCdCase(), "PRODUCT_CD_CASE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_CD_CASE: {IX+, varchar(30)} <br>
     * <pre>e.g. setProductCdCase_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param productCdCase The value of productCdCase as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setProductCdCase_LikeSearch(String productCdCase, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(productCdCase), xgetCValueProductCdCase(), "PRODUCT_CD_CASE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_CD_CASE: {IX+, varchar(30)}
     * @param productCdCase The value of productCdCase as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setProductCdCase_NotLikeSearch(String productCdCase, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(productCdCase), xgetCValueProductCdCase(), "PRODUCT_CD_CASE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_CD_CASE: {IX+, varchar(30)}
     * @param productCdCase The value of productCdCase as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCdCase_PrefixSearch(String productCdCase) {
        setProductCdCase_LikeSearch(productCdCase, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PRODUCT_CD_CASE: {IX+, varchar(30)}
     */
    public void setProductCdCase_IsNull() { regProductCdCase(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PRODUCT_CD_CASE: {IX+, varchar(30)}
     */
    public void setProductCdCase_IsNullOrEmpty() { regProductCdCase(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PRODUCT_CD_CASE: {IX+, varchar(30)}
     */
    public void setProductCdCase_IsNotNull() { regProductCdCase(CK_ISNN, DOBJ); }

    protected void regProductCdCase(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProductCdCase(), "PRODUCT_CD_CASE"); }
    protected abstract ConditionValue xgetCValueProductCdCase();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD_IN: {varchar(30)}
     * @param productCdIn The value of productCdIn as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCdIn_Equal(String productCdIn) {
        doSetProductCdIn_Equal(fRES(productCdIn));
    }

    protected void doSetProductCdIn_Equal(String productCdIn) {
        regProductCdIn(CK_EQ, productCdIn);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD_IN: {varchar(30)}
     * @param productCdIn The value of productCdIn as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCdIn_NotEqual(String productCdIn) {
        doSetProductCdIn_NotEqual(fRES(productCdIn));
    }

    protected void doSetProductCdIn_NotEqual(String productCdIn) {
        regProductCdIn(CK_NES, productCdIn);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD_IN: {varchar(30)}
     * @param productCdIn The value of productCdIn as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCdIn_GreaterThan(String productCdIn) {
        regProductCdIn(CK_GT, fRES(productCdIn));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD_IN: {varchar(30)}
     * @param productCdIn The value of productCdIn as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCdIn_LessThan(String productCdIn) {
        regProductCdIn(CK_LT, fRES(productCdIn));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD_IN: {varchar(30)}
     * @param productCdIn The value of productCdIn as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCdIn_GreaterEqual(String productCdIn) {
        regProductCdIn(CK_GE, fRES(productCdIn));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD_IN: {varchar(30)}
     * @param productCdIn The value of productCdIn as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCdIn_LessEqual(String productCdIn) {
        regProductCdIn(CK_LE, fRES(productCdIn));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCT_CD_IN: {varchar(30)}
     * @param productCdInList The collection of productCdIn as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCdIn_InScope(Collection<String> productCdInList) {
        doSetProductCdIn_InScope(productCdInList);
    }

    protected void doSetProductCdIn_InScope(Collection<String> productCdInList) {
        regINS(CK_INS, cTL(productCdInList), xgetCValueProductCdIn(), "PRODUCT_CD_IN");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCT_CD_IN: {varchar(30)}
     * @param productCdInList The collection of productCdIn as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCdIn_NotInScope(Collection<String> productCdInList) {
        doSetProductCdIn_NotInScope(productCdInList);
    }

    protected void doSetProductCdIn_NotInScope(Collection<String> productCdInList) {
        regINS(CK_NINS, cTL(productCdInList), xgetCValueProductCdIn(), "PRODUCT_CD_IN");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_CD_IN: {varchar(30)} <br>
     * <pre>e.g. setProductCdIn_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param productCdIn The value of productCdIn as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setProductCdIn_LikeSearch(String productCdIn, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(productCdIn), xgetCValueProductCdIn(), "PRODUCT_CD_IN", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_CD_IN: {varchar(30)}
     * @param productCdIn The value of productCdIn as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setProductCdIn_NotLikeSearch(String productCdIn, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(productCdIn), xgetCValueProductCdIn(), "PRODUCT_CD_IN", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_CD_IN: {varchar(30)}
     * @param productCdIn The value of productCdIn as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCdIn_PrefixSearch(String productCdIn) {
        setProductCdIn_LikeSearch(productCdIn, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PRODUCT_CD_IN: {varchar(30)}
     */
    public void setProductCdIn_IsNull() { regProductCdIn(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PRODUCT_CD_IN: {varchar(30)}
     */
    public void setProductCdIn_IsNullOrEmpty() { regProductCdIn(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PRODUCT_CD_IN: {varchar(30)}
     */
    public void setProductCdIn_IsNotNull() { regProductCdIn(CK_ISNN, DOBJ); }

    protected void regProductCdIn(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProductCdIn(), "PRODUCT_CD_IN"); }
    protected abstract ConditionValue xgetCValueProductCdIn();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT3: {varchar(30)}
     * @param lot3 The value of lot3 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot3_Equal(String lot3) {
        doSetLot3_Equal(fRES(lot3));
    }

    protected void doSetLot3_Equal(String lot3) {
        regLot3(CK_EQ, lot3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT3: {varchar(30)}
     * @param lot3 The value of lot3 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot3_NotEqual(String lot3) {
        doSetLot3_NotEqual(fRES(lot3));
    }

    protected void doSetLot3_NotEqual(String lot3) {
        regLot3(CK_NES, lot3);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT3: {varchar(30)}
     * @param lot3 The value of lot3 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot3_GreaterThan(String lot3) {
        regLot3(CK_GT, fRES(lot3));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT3: {varchar(30)}
     * @param lot3 The value of lot3 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot3_LessThan(String lot3) {
        regLot3(CK_LT, fRES(lot3));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT3: {varchar(30)}
     * @param lot3 The value of lot3 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot3_GreaterEqual(String lot3) {
        regLot3(CK_GE, fRES(lot3));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT3: {varchar(30)}
     * @param lot3 The value of lot3 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot3_LessEqual(String lot3) {
        regLot3(CK_LE, fRES(lot3));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOT3: {varchar(30)}
     * @param lot3List The collection of lot3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot3_InScope(Collection<String> lot3List) {
        doSetLot3_InScope(lot3List);
    }

    protected void doSetLot3_InScope(Collection<String> lot3List) {
        regINS(CK_INS, cTL(lot3List), xgetCValueLot3(), "LOT3");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOT3: {varchar(30)}
     * @param lot3List The collection of lot3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot3_NotInScope(Collection<String> lot3List) {
        doSetLot3_NotInScope(lot3List);
    }

    protected void doSetLot3_NotInScope(Collection<String> lot3List) {
        regINS(CK_NINS, cTL(lot3List), xgetCValueLot3(), "LOT3");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT3: {varchar(30)} <br>
     * <pre>e.g. setLot3_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param lot3 The value of lot3 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLot3_LikeSearch(String lot3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(lot3), xgetCValueLot3(), "LOT3", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT3: {varchar(30)}
     * @param lot3 The value of lot3 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLot3_NotLikeSearch(String lot3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(lot3), xgetCValueLot3(), "LOT3", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT3: {varchar(30)}
     * @param lot3 The value of lot3 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot3_PrefixSearch(String lot3) {
        setLot3_LikeSearch(lot3, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOT3: {varchar(30)}
     */
    public void setLot3_IsNull() { regLot3(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LOT3: {varchar(30)}
     */
    public void setLot3_IsNullOrEmpty() { regLot3(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOT3: {varchar(30)}
     */
    public void setLot3_IsNotNull() { regLot3(CK_ISNN, DOBJ); }

    protected void regLot3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLot3(), "LOT3"); }
    protected abstract ConditionValue xgetCValueLot3();

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
     * DESIGNCD_CASE: {varchar(30)}
     * @param designcdCase The value of designcdCase as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesigncdCase_Equal(String designcdCase) {
        doSetDesigncdCase_Equal(fRES(designcdCase));
    }

    protected void doSetDesigncdCase_Equal(String designcdCase) {
        regDesigncdCase(CK_EQ, designcdCase);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESIGNCD_CASE: {varchar(30)}
     * @param designcdCase The value of designcdCase as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesigncdCase_NotEqual(String designcdCase) {
        doSetDesigncdCase_NotEqual(fRES(designcdCase));
    }

    protected void doSetDesigncdCase_NotEqual(String designcdCase) {
        regDesigncdCase(CK_NES, designcdCase);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESIGNCD_CASE: {varchar(30)}
     * @param designcdCase The value of designcdCase as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesigncdCase_GreaterThan(String designcdCase) {
        regDesigncdCase(CK_GT, fRES(designcdCase));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESIGNCD_CASE: {varchar(30)}
     * @param designcdCase The value of designcdCase as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesigncdCase_LessThan(String designcdCase) {
        regDesigncdCase(CK_LT, fRES(designcdCase));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESIGNCD_CASE: {varchar(30)}
     * @param designcdCase The value of designcdCase as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesigncdCase_GreaterEqual(String designcdCase) {
        regDesigncdCase(CK_GE, fRES(designcdCase));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESIGNCD_CASE: {varchar(30)}
     * @param designcdCase The value of designcdCase as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesigncdCase_LessEqual(String designcdCase) {
        regDesigncdCase(CK_LE, fRES(designcdCase));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DESIGNCD_CASE: {varchar(30)}
     * @param designcdCaseList The collection of designcdCase as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesigncdCase_InScope(Collection<String> designcdCaseList) {
        doSetDesigncdCase_InScope(designcdCaseList);
    }

    protected void doSetDesigncdCase_InScope(Collection<String> designcdCaseList) {
        regINS(CK_INS, cTL(designcdCaseList), xgetCValueDesigncdCase(), "DESIGNCD_CASE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DESIGNCD_CASE: {varchar(30)}
     * @param designcdCaseList The collection of designcdCase as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesigncdCase_NotInScope(Collection<String> designcdCaseList) {
        doSetDesigncdCase_NotInScope(designcdCaseList);
    }

    protected void doSetDesigncdCase_NotInScope(Collection<String> designcdCaseList) {
        regINS(CK_NINS, cTL(designcdCaseList), xgetCValueDesigncdCase(), "DESIGNCD_CASE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESIGNCD_CASE: {varchar(30)} <br>
     * <pre>e.g. setDesigncdCase_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param designcdCase The value of designcdCase as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDesigncdCase_LikeSearch(String designcdCase, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(designcdCase), xgetCValueDesigncdCase(), "DESIGNCD_CASE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESIGNCD_CASE: {varchar(30)}
     * @param designcdCase The value of designcdCase as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDesigncdCase_NotLikeSearch(String designcdCase, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(designcdCase), xgetCValueDesigncdCase(), "DESIGNCD_CASE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESIGNCD_CASE: {varchar(30)}
     * @param designcdCase The value of designcdCase as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesigncdCase_PrefixSearch(String designcdCase) {
        setDesigncdCase_LikeSearch(designcdCase, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DESIGNCD_CASE: {varchar(30)}
     */
    public void setDesigncdCase_IsNull() { regDesigncdCase(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DESIGNCD_CASE: {varchar(30)}
     */
    public void setDesigncdCase_IsNullOrEmpty() { regDesigncdCase(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DESIGNCD_CASE: {varchar(30)}
     */
    public void setDesigncdCase_IsNotNull() { regDesigncdCase(CK_ISNN, DOBJ); }

    protected void regDesigncdCase(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDesigncdCase(), "DESIGNCD_CASE"); }
    protected abstract ConditionValue xgetCValueDesigncdCase();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT4: {varchar(8)}
     * @param lot4 The value of lot4 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot4_Equal(String lot4) {
        doSetLot4_Equal(fRES(lot4));
    }

    protected void doSetLot4_Equal(String lot4) {
        regLot4(CK_EQ, lot4);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT4: {varchar(8)}
     * @param lot4 The value of lot4 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot4_NotEqual(String lot4) {
        doSetLot4_NotEqual(fRES(lot4));
    }

    protected void doSetLot4_NotEqual(String lot4) {
        regLot4(CK_NES, lot4);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT4: {varchar(8)}
     * @param lot4 The value of lot4 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot4_GreaterThan(String lot4) {
        regLot4(CK_GT, fRES(lot4));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT4: {varchar(8)}
     * @param lot4 The value of lot4 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot4_LessThan(String lot4) {
        regLot4(CK_LT, fRES(lot4));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT4: {varchar(8)}
     * @param lot4 The value of lot4 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot4_GreaterEqual(String lot4) {
        regLot4(CK_GE, fRES(lot4));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT4: {varchar(8)}
     * @param lot4 The value of lot4 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot4_LessEqual(String lot4) {
        regLot4(CK_LE, fRES(lot4));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOT4: {varchar(8)}
     * @param lot4List The collection of lot4 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot4_InScope(Collection<String> lot4List) {
        doSetLot4_InScope(lot4List);
    }

    protected void doSetLot4_InScope(Collection<String> lot4List) {
        regINS(CK_INS, cTL(lot4List), xgetCValueLot4(), "LOT4");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOT4: {varchar(8)}
     * @param lot4List The collection of lot4 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot4_NotInScope(Collection<String> lot4List) {
        doSetLot4_NotInScope(lot4List);
    }

    protected void doSetLot4_NotInScope(Collection<String> lot4List) {
        regINS(CK_NINS, cTL(lot4List), xgetCValueLot4(), "LOT4");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT4: {varchar(8)} <br>
     * <pre>e.g. setLot4_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param lot4 The value of lot4 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLot4_LikeSearch(String lot4, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(lot4), xgetCValueLot4(), "LOT4", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT4: {varchar(8)}
     * @param lot4 The value of lot4 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLot4_NotLikeSearch(String lot4, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(lot4), xgetCValueLot4(), "LOT4", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT4: {varchar(8)}
     * @param lot4 The value of lot4 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot4_PrefixSearch(String lot4) {
        setLot4_LikeSearch(lot4, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOT4: {varchar(8)}
     */
    public void setLot4_IsNull() { regLot4(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LOT4: {varchar(8)}
     */
    public void setLot4_IsNullOrEmpty() { regLot4(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOT4: {varchar(8)}
     */
    public void setLot4_IsNotNull() { regLot4(CK_ISNN, DOBJ); }

    protected void regLot4(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLot4(), "LOT4"); }
    protected abstract ConditionValue xgetCValueLot4();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT1: {varchar(30)}
     * @param lot1 The value of lot1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot1_Equal(String lot1) {
        doSetLot1_Equal(fRES(lot1));
    }

    protected void doSetLot1_Equal(String lot1) {
        regLot1(CK_EQ, lot1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT1: {varchar(30)}
     * @param lot1 The value of lot1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot1_NotEqual(String lot1) {
        doSetLot1_NotEqual(fRES(lot1));
    }

    protected void doSetLot1_NotEqual(String lot1) {
        regLot1(CK_NES, lot1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT1: {varchar(30)}
     * @param lot1 The value of lot1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot1_GreaterThan(String lot1) {
        regLot1(CK_GT, fRES(lot1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT1: {varchar(30)}
     * @param lot1 The value of lot1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot1_LessThan(String lot1) {
        regLot1(CK_LT, fRES(lot1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT1: {varchar(30)}
     * @param lot1 The value of lot1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot1_GreaterEqual(String lot1) {
        regLot1(CK_GE, fRES(lot1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT1: {varchar(30)}
     * @param lot1 The value of lot1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot1_LessEqual(String lot1) {
        regLot1(CK_LE, fRES(lot1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOT1: {varchar(30)}
     * @param lot1List The collection of lot1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot1_InScope(Collection<String> lot1List) {
        doSetLot1_InScope(lot1List);
    }

    protected void doSetLot1_InScope(Collection<String> lot1List) {
        regINS(CK_INS, cTL(lot1List), xgetCValueLot1(), "LOT1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOT1: {varchar(30)}
     * @param lot1List The collection of lot1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot1_NotInScope(Collection<String> lot1List) {
        doSetLot1_NotInScope(lot1List);
    }

    protected void doSetLot1_NotInScope(Collection<String> lot1List) {
        regINS(CK_NINS, cTL(lot1List), xgetCValueLot1(), "LOT1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT1: {varchar(30)} <br>
     * <pre>e.g. setLot1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param lot1 The value of lot1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLot1_LikeSearch(String lot1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(lot1), xgetCValueLot1(), "LOT1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT1: {varchar(30)}
     * @param lot1 The value of lot1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLot1_NotLikeSearch(String lot1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(lot1), xgetCValueLot1(), "LOT1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT1: {varchar(30)}
     * @param lot1 The value of lot1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot1_PrefixSearch(String lot1) {
        setLot1_LikeSearch(lot1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOT1: {varchar(30)}
     */
    public void setLot1_IsNull() { regLot1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LOT1: {varchar(30)}
     */
    public void setLot1_IsNullOrEmpty() { regLot1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOT1: {varchar(30)}
     */
    public void setLot1_IsNotNull() { regLot1(CK_ISNN, DOBJ); }

    protected void regLot1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLot1(), "LOT1"); }
    protected abstract ConditionValue xgetCValueLot1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT2: {varchar(30)}
     * @param lot2 The value of lot2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot2_Equal(String lot2) {
        doSetLot2_Equal(fRES(lot2));
    }

    protected void doSetLot2_Equal(String lot2) {
        regLot2(CK_EQ, lot2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT2: {varchar(30)}
     * @param lot2 The value of lot2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot2_NotEqual(String lot2) {
        doSetLot2_NotEqual(fRES(lot2));
    }

    protected void doSetLot2_NotEqual(String lot2) {
        regLot2(CK_NES, lot2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT2: {varchar(30)}
     * @param lot2 The value of lot2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot2_GreaterThan(String lot2) {
        regLot2(CK_GT, fRES(lot2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT2: {varchar(30)}
     * @param lot2 The value of lot2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot2_LessThan(String lot2) {
        regLot2(CK_LT, fRES(lot2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT2: {varchar(30)}
     * @param lot2 The value of lot2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot2_GreaterEqual(String lot2) {
        regLot2(CK_GE, fRES(lot2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT2: {varchar(30)}
     * @param lot2 The value of lot2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot2_LessEqual(String lot2) {
        regLot2(CK_LE, fRES(lot2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOT2: {varchar(30)}
     * @param lot2List The collection of lot2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot2_InScope(Collection<String> lot2List) {
        doSetLot2_InScope(lot2List);
    }

    protected void doSetLot2_InScope(Collection<String> lot2List) {
        regINS(CK_INS, cTL(lot2List), xgetCValueLot2(), "LOT2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOT2: {varchar(30)}
     * @param lot2List The collection of lot2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot2_NotInScope(Collection<String> lot2List) {
        doSetLot2_NotInScope(lot2List);
    }

    protected void doSetLot2_NotInScope(Collection<String> lot2List) {
        regINS(CK_NINS, cTL(lot2List), xgetCValueLot2(), "LOT2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT2: {varchar(30)} <br>
     * <pre>e.g. setLot2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param lot2 The value of lot2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLot2_LikeSearch(String lot2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(lot2), xgetCValueLot2(), "LOT2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT2: {varchar(30)}
     * @param lot2 The value of lot2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLot2_NotLikeSearch(String lot2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(lot2), xgetCValueLot2(), "LOT2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT2: {varchar(30)}
     * @param lot2 The value of lot2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot2_PrefixSearch(String lot2) {
        setLot2_LikeSearch(lot2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOT2: {varchar(30)}
     */
    public void setLot2_IsNull() { regLot2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LOT2: {varchar(30)}
     */
    public void setLot2_IsNullOrEmpty() { regLot2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOT2: {varchar(30)}
     */
    public void setLot2_IsNotNull() { regLot2(CK_ISNN, DOBJ); }

    protected void regLot2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLot2(), "LOT2"); }
    protected abstract ConditionValue xgetCValueLot2();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SYMBOLLINENO: {bigint(19)}
     * @param symbollineno The value of symbollineno as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSymbollineno_Equal(Long symbollineno) {
        doSetSymbollineno_Equal(symbollineno);
    }

    protected void doSetSymbollineno_Equal(Long symbollineno) {
        regSymbollineno(CK_EQ, symbollineno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SYMBOLLINENO: {bigint(19)}
     * @param symbollineno The value of symbollineno as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSymbollineno_NotEqual(Long symbollineno) {
        doSetSymbollineno_NotEqual(symbollineno);
    }

    protected void doSetSymbollineno_NotEqual(Long symbollineno) {
        regSymbollineno(CK_NES, symbollineno);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SYMBOLLINENO: {bigint(19)}
     * @param symbollineno The value of symbollineno as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSymbollineno_GreaterThan(Long symbollineno) {
        regSymbollineno(CK_GT, symbollineno);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SYMBOLLINENO: {bigint(19)}
     * @param symbollineno The value of symbollineno as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSymbollineno_LessThan(Long symbollineno) {
        regSymbollineno(CK_LT, symbollineno);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SYMBOLLINENO: {bigint(19)}
     * @param symbollineno The value of symbollineno as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSymbollineno_GreaterEqual(Long symbollineno) {
        regSymbollineno(CK_GE, symbollineno);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SYMBOLLINENO: {bigint(19)}
     * @param symbollineno The value of symbollineno as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSymbollineno_LessEqual(Long symbollineno) {
        regSymbollineno(CK_LE, symbollineno);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SYMBOLLINENO: {bigint(19)}
     * @param minNumber The min number of symbollineno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of symbollineno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSymbollineno_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSymbollineno(), "SYMBOLLINENO", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SYMBOLLINENO: {bigint(19)}
     * @param symbollinenoList The collection of symbollineno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbollineno_InScope(Collection<Long> symbollinenoList) {
        doSetSymbollineno_InScope(symbollinenoList);
    }

    protected void doSetSymbollineno_InScope(Collection<Long> symbollinenoList) {
        regINS(CK_INS, cTL(symbollinenoList), xgetCValueSymbollineno(), "SYMBOLLINENO");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SYMBOLLINENO: {bigint(19)}
     * @param symbollinenoList The collection of symbollineno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbollineno_NotInScope(Collection<Long> symbollinenoList) {
        doSetSymbollineno_NotInScope(symbollinenoList);
    }

    protected void doSetSymbollineno_NotInScope(Collection<Long> symbollinenoList) {
        regINS(CK_NINS, cTL(symbollinenoList), xgetCValueSymbollineno(), "SYMBOLLINENO");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SYMBOLLINENO: {bigint(19)}
     */
    public void setSymbollineno_IsNull() { regSymbollineno(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SYMBOLLINENO: {bigint(19)}
     */
    public void setSymbollineno_IsNotNull() { regSymbollineno(CK_ISNN, DOBJ); }

    protected void regSymbollineno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSymbollineno(), "SYMBOLLINENO"); }
    protected abstract ConditionValue xgetCValueSymbollineno();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWNERCD: {varchar(30)}
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
     * OWNERCD: {varchar(30)}
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
     * OWNERCD: {varchar(30)}
     * @param ownercd The value of ownercd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnercd_GreaterThan(String ownercd) {
        regOwnercd(CK_GT, fRES(ownercd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWNERCD: {varchar(30)}
     * @param ownercd The value of ownercd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnercd_LessThan(String ownercd) {
        regOwnercd(CK_LT, fRES(ownercd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWNERCD: {varchar(30)}
     * @param ownercd The value of ownercd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnercd_GreaterEqual(String ownercd) {
        regOwnercd(CK_GE, fRES(ownercd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWNERCD: {varchar(30)}
     * @param ownercd The value of ownercd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnercd_LessEqual(String ownercd) {
        regOwnercd(CK_LE, fRES(ownercd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OWNERCD: {varchar(30)}
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
     * OWNERCD: {varchar(30)}
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
     * OWNERCD: {varchar(30)} <br>
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
     * OWNERCD: {varchar(30)}
     * @param ownercd The value of ownercd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOwnercd_NotLikeSearch(String ownercd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(ownercd), xgetCValueOwnercd(), "OWNERCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OWNERCD: {varchar(30)}
     * @param ownercd The value of ownercd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnercd_PrefixSearch(String ownercd) {
        setOwnercd_LikeSearch(ownercd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * OWNERCD: {varchar(30)}
     */
    public void setOwnercd_IsNull() { regOwnercd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * OWNERCD: {varchar(30)}
     */
    public void setOwnercd_IsNullOrEmpty() { regOwnercd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * OWNERCD: {varchar(30)}
     */
    public void setOwnercd_IsNotNull() { regOwnercd(CK_ISNN, DOBJ); }

    protected void regOwnercd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOwnercd(), "OWNERCD"); }
    protected abstract ConditionValue xgetCValueOwnercd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STOCK_TYPE_CD: {varchar(30)}
     * @param stockTypeCd The value of stockTypeCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockTypeCd_Equal(String stockTypeCd) {
        doSetStockTypeCd_Equal(fRES(stockTypeCd));
    }

    protected void doSetStockTypeCd_Equal(String stockTypeCd) {
        regStockTypeCd(CK_EQ, stockTypeCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STOCK_TYPE_CD: {varchar(30)}
     * @param stockTypeCd The value of stockTypeCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockTypeCd_NotEqual(String stockTypeCd) {
        doSetStockTypeCd_NotEqual(fRES(stockTypeCd));
    }

    protected void doSetStockTypeCd_NotEqual(String stockTypeCd) {
        regStockTypeCd(CK_NES, stockTypeCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STOCK_TYPE_CD: {varchar(30)}
     * @param stockTypeCd The value of stockTypeCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockTypeCd_GreaterThan(String stockTypeCd) {
        regStockTypeCd(CK_GT, fRES(stockTypeCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STOCK_TYPE_CD: {varchar(30)}
     * @param stockTypeCd The value of stockTypeCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockTypeCd_LessThan(String stockTypeCd) {
        regStockTypeCd(CK_LT, fRES(stockTypeCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STOCK_TYPE_CD: {varchar(30)}
     * @param stockTypeCd The value of stockTypeCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockTypeCd_GreaterEqual(String stockTypeCd) {
        regStockTypeCd(CK_GE, fRES(stockTypeCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STOCK_TYPE_CD: {varchar(30)}
     * @param stockTypeCd The value of stockTypeCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockTypeCd_LessEqual(String stockTypeCd) {
        regStockTypeCd(CK_LE, fRES(stockTypeCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STOCK_TYPE_CD: {varchar(30)}
     * @param stockTypeCdList The collection of stockTypeCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockTypeCd_InScope(Collection<String> stockTypeCdList) {
        doSetStockTypeCd_InScope(stockTypeCdList);
    }

    protected void doSetStockTypeCd_InScope(Collection<String> stockTypeCdList) {
        regINS(CK_INS, cTL(stockTypeCdList), xgetCValueStockTypeCd(), "STOCK_TYPE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STOCK_TYPE_CD: {varchar(30)}
     * @param stockTypeCdList The collection of stockTypeCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockTypeCd_NotInScope(Collection<String> stockTypeCdList) {
        doSetStockTypeCd_NotInScope(stockTypeCdList);
    }

    protected void doSetStockTypeCd_NotInScope(Collection<String> stockTypeCdList) {
        regINS(CK_NINS, cTL(stockTypeCdList), xgetCValueStockTypeCd(), "STOCK_TYPE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STOCK_TYPE_CD: {varchar(30)} <br>
     * <pre>e.g. setStockTypeCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param stockTypeCd The value of stockTypeCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setStockTypeCd_LikeSearch(String stockTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(stockTypeCd), xgetCValueStockTypeCd(), "STOCK_TYPE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STOCK_TYPE_CD: {varchar(30)}
     * @param stockTypeCd The value of stockTypeCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setStockTypeCd_NotLikeSearch(String stockTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(stockTypeCd), xgetCValueStockTypeCd(), "STOCK_TYPE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STOCK_TYPE_CD: {varchar(30)}
     * @param stockTypeCd The value of stockTypeCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockTypeCd_PrefixSearch(String stockTypeCd) {
        setStockTypeCd_LikeSearch(stockTypeCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * STOCK_TYPE_CD: {varchar(30)}
     */
    public void setStockTypeCd_IsNull() { regStockTypeCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * STOCK_TYPE_CD: {varchar(30)}
     */
    public void setStockTypeCd_IsNullOrEmpty() { regStockTypeCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * STOCK_TYPE_CD: {varchar(30)}
     */
    public void setStockTypeCd_IsNotNull() { regStockTypeCd(CK_ISNN, DOBJ); }

    protected void regStockTypeCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStockTypeCd(), "STOCK_TYPE_CD"); }
    protected abstract ConditionValue xgetCValueStockTypeCd();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * FOREIGNCARGOFLG: {decimal(16, 6)}
     * @param foreigncargoflg The value of foreigncargoflg as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setForeigncargoflg_Equal(java.math.BigDecimal foreigncargoflg) {
        doSetForeigncargoflg_Equal(foreigncargoflg);
    }

    protected void doSetForeigncargoflg_Equal(java.math.BigDecimal foreigncargoflg) {
        regForeigncargoflg(CK_EQ, foreigncargoflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FOREIGNCARGOFLG: {decimal(16, 6)}
     * @param foreigncargoflg The value of foreigncargoflg as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setForeigncargoflg_NotEqual(java.math.BigDecimal foreigncargoflg) {
        doSetForeigncargoflg_NotEqual(foreigncargoflg);
    }

    protected void doSetForeigncargoflg_NotEqual(java.math.BigDecimal foreigncargoflg) {
        regForeigncargoflg(CK_NES, foreigncargoflg);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FOREIGNCARGOFLG: {decimal(16, 6)}
     * @param foreigncargoflg The value of foreigncargoflg as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setForeigncargoflg_GreaterThan(java.math.BigDecimal foreigncargoflg) {
        regForeigncargoflg(CK_GT, foreigncargoflg);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FOREIGNCARGOFLG: {decimal(16, 6)}
     * @param foreigncargoflg The value of foreigncargoflg as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setForeigncargoflg_LessThan(java.math.BigDecimal foreigncargoflg) {
        regForeigncargoflg(CK_LT, foreigncargoflg);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * FOREIGNCARGOFLG: {decimal(16, 6)}
     * @param foreigncargoflg The value of foreigncargoflg as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setForeigncargoflg_GreaterEqual(java.math.BigDecimal foreigncargoflg) {
        regForeigncargoflg(CK_GE, foreigncargoflg);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * FOREIGNCARGOFLG: {decimal(16, 6)}
     * @param foreigncargoflg The value of foreigncargoflg as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setForeigncargoflg_LessEqual(java.math.BigDecimal foreigncargoflg) {
        regForeigncargoflg(CK_LE, foreigncargoflg);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * FOREIGNCARGOFLG: {decimal(16, 6)}
     * @param minNumber The min number of foreigncargoflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of foreigncargoflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setForeigncargoflg_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueForeigncargoflg(), "FOREIGNCARGOFLG", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * FOREIGNCARGOFLG: {decimal(16, 6)}
     * @param foreigncargoflgList The collection of foreigncargoflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setForeigncargoflg_InScope(Collection<java.math.BigDecimal> foreigncargoflgList) {
        doSetForeigncargoflg_InScope(foreigncargoflgList);
    }

    protected void doSetForeigncargoflg_InScope(Collection<java.math.BigDecimal> foreigncargoflgList) {
        regINS(CK_INS, cTL(foreigncargoflgList), xgetCValueForeigncargoflg(), "FOREIGNCARGOFLG");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * FOREIGNCARGOFLG: {decimal(16, 6)}
     * @param foreigncargoflgList The collection of foreigncargoflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setForeigncargoflg_NotInScope(Collection<java.math.BigDecimal> foreigncargoflgList) {
        doSetForeigncargoflg_NotInScope(foreigncargoflgList);
    }

    protected void doSetForeigncargoflg_NotInScope(Collection<java.math.BigDecimal> foreigncargoflgList) {
        regINS(CK_NINS, cTL(foreigncargoflgList), xgetCValueForeigncargoflg(), "FOREIGNCARGOFLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FOREIGNCARGOFLG: {decimal(16, 6)}
     */
    public void setForeigncargoflg_IsNull() { regForeigncargoflg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FOREIGNCARGOFLG: {decimal(16, 6)}
     */
    public void setForeigncargoflg_IsNotNull() { regForeigncargoflg(CK_ISNN, DOBJ); }

    protected void regForeigncargoflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueForeigncargoflg(), "FOREIGNCARGOFLG"); }
    protected abstract ConditionValue xgetCValueForeigncargoflg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CUSTOMSRELEASEFLG: {decimal(16, 6)}
     * @param customsreleaseflg The value of customsreleaseflg as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCustomsreleaseflg_Equal(java.math.BigDecimal customsreleaseflg) {
        doSetCustomsreleaseflg_Equal(customsreleaseflg);
    }

    protected void doSetCustomsreleaseflg_Equal(java.math.BigDecimal customsreleaseflg) {
        regCustomsreleaseflg(CK_EQ, customsreleaseflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CUSTOMSRELEASEFLG: {decimal(16, 6)}
     * @param customsreleaseflg The value of customsreleaseflg as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCustomsreleaseflg_NotEqual(java.math.BigDecimal customsreleaseflg) {
        doSetCustomsreleaseflg_NotEqual(customsreleaseflg);
    }

    protected void doSetCustomsreleaseflg_NotEqual(java.math.BigDecimal customsreleaseflg) {
        regCustomsreleaseflg(CK_NES, customsreleaseflg);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CUSTOMSRELEASEFLG: {decimal(16, 6)}
     * @param customsreleaseflg The value of customsreleaseflg as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCustomsreleaseflg_GreaterThan(java.math.BigDecimal customsreleaseflg) {
        regCustomsreleaseflg(CK_GT, customsreleaseflg);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CUSTOMSRELEASEFLG: {decimal(16, 6)}
     * @param customsreleaseflg The value of customsreleaseflg as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCustomsreleaseflg_LessThan(java.math.BigDecimal customsreleaseflg) {
        regCustomsreleaseflg(CK_LT, customsreleaseflg);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CUSTOMSRELEASEFLG: {decimal(16, 6)}
     * @param customsreleaseflg The value of customsreleaseflg as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCustomsreleaseflg_GreaterEqual(java.math.BigDecimal customsreleaseflg) {
        regCustomsreleaseflg(CK_GE, customsreleaseflg);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CUSTOMSRELEASEFLG: {decimal(16, 6)}
     * @param customsreleaseflg The value of customsreleaseflg as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCustomsreleaseflg_LessEqual(java.math.BigDecimal customsreleaseflg) {
        regCustomsreleaseflg(CK_LE, customsreleaseflg);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CUSTOMSRELEASEFLG: {decimal(16, 6)}
     * @param minNumber The min number of customsreleaseflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of customsreleaseflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCustomsreleaseflg_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCustomsreleaseflg(), "CUSTOMSRELEASEFLG", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CUSTOMSRELEASEFLG: {decimal(16, 6)}
     * @param customsreleaseflgList The collection of customsreleaseflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomsreleaseflg_InScope(Collection<java.math.BigDecimal> customsreleaseflgList) {
        doSetCustomsreleaseflg_InScope(customsreleaseflgList);
    }

    protected void doSetCustomsreleaseflg_InScope(Collection<java.math.BigDecimal> customsreleaseflgList) {
        regINS(CK_INS, cTL(customsreleaseflgList), xgetCValueCustomsreleaseflg(), "CUSTOMSRELEASEFLG");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CUSTOMSRELEASEFLG: {decimal(16, 6)}
     * @param customsreleaseflgList The collection of customsreleaseflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomsreleaseflg_NotInScope(Collection<java.math.BigDecimal> customsreleaseflgList) {
        doSetCustomsreleaseflg_NotInScope(customsreleaseflgList);
    }

    protected void doSetCustomsreleaseflg_NotInScope(Collection<java.math.BigDecimal> customsreleaseflgList) {
        regINS(CK_NINS, cTL(customsreleaseflgList), xgetCValueCustomsreleaseflg(), "CUSTOMSRELEASEFLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CUSTOMSRELEASEFLG: {decimal(16, 6)}
     */
    public void setCustomsreleaseflg_IsNull() { regCustomsreleaseflg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CUSTOMSRELEASEFLG: {decimal(16, 6)}
     */
    public void setCustomsreleaseflg_IsNotNull() { regCustomsreleaseflg(CK_ISNN, DOBJ); }

    protected void regCustomsreleaseflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCustomsreleaseflg(), "CUSTOMSRELEASEFLG"); }
    protected abstract ConditionValue xgetCValueCustomsreleaseflg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * DAMAGEFLG: {decimal(16, 6)}
     * @param damageflg The value of damageflg as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setDamageflg_Equal(java.math.BigDecimal damageflg) {
        doSetDamageflg_Equal(damageflg);
    }

    protected void doSetDamageflg_Equal(java.math.BigDecimal damageflg) {
        regDamageflg(CK_EQ, damageflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DAMAGEFLG: {decimal(16, 6)}
     * @param damageflg The value of damageflg as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDamageflg_NotEqual(java.math.BigDecimal damageflg) {
        doSetDamageflg_NotEqual(damageflg);
    }

    protected void doSetDamageflg_NotEqual(java.math.BigDecimal damageflg) {
        regDamageflg(CK_NES, damageflg);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DAMAGEFLG: {decimal(16, 6)}
     * @param damageflg The value of damageflg as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDamageflg_GreaterThan(java.math.BigDecimal damageflg) {
        regDamageflg(CK_GT, damageflg);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DAMAGEFLG: {decimal(16, 6)}
     * @param damageflg The value of damageflg as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDamageflg_LessThan(java.math.BigDecimal damageflg) {
        regDamageflg(CK_LT, damageflg);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DAMAGEFLG: {decimal(16, 6)}
     * @param damageflg The value of damageflg as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDamageflg_GreaterEqual(java.math.BigDecimal damageflg) {
        regDamageflg(CK_GE, damageflg);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DAMAGEFLG: {decimal(16, 6)}
     * @param damageflg The value of damageflg as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDamageflg_LessEqual(java.math.BigDecimal damageflg) {
        regDamageflg(CK_LE, damageflg);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * DAMAGEFLG: {decimal(16, 6)}
     * @param minNumber The min number of damageflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of damageflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setDamageflg_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueDamageflg(), "DAMAGEFLG", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DAMAGEFLG: {decimal(16, 6)}
     * @param damageflgList The collection of damageflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDamageflg_InScope(Collection<java.math.BigDecimal> damageflgList) {
        doSetDamageflg_InScope(damageflgList);
    }

    protected void doSetDamageflg_InScope(Collection<java.math.BigDecimal> damageflgList) {
        regINS(CK_INS, cTL(damageflgList), xgetCValueDamageflg(), "DAMAGEFLG");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DAMAGEFLG: {decimal(16, 6)}
     * @param damageflgList The collection of damageflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDamageflg_NotInScope(Collection<java.math.BigDecimal> damageflgList) {
        doSetDamageflg_NotInScope(damageflgList);
    }

    protected void doSetDamageflg_NotInScope(Collection<java.math.BigDecimal> damageflgList) {
        regINS(CK_NINS, cTL(damageflgList), xgetCValueDamageflg(), "DAMAGEFLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DAMAGEFLG: {decimal(16, 6)}
     */
    public void setDamageflg_IsNull() { regDamageflg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DAMAGEFLG: {decimal(16, 6)}
     */
    public void setDamageflg_IsNotNull() { regDamageflg(CK_ISNN, DOBJ); }

    protected void regDamageflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDamageflg(), "DAMAGEFLG"); }
    protected abstract ConditionValue xgetCValueDamageflg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_H_ID: {IX, bigint(19)}
     * @param receivePlanHId The value of receivePlanHId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceivePlanHId_Equal(Long receivePlanHId) {
        doSetReceivePlanHId_Equal(receivePlanHId);
    }

    protected void doSetReceivePlanHId_Equal(Long receivePlanHId) {
        regReceivePlanHId(CK_EQ, receivePlanHId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_H_ID: {IX, bigint(19)}
     * @param receivePlanHId The value of receivePlanHId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceivePlanHId_NotEqual(Long receivePlanHId) {
        doSetReceivePlanHId_NotEqual(receivePlanHId);
    }

    protected void doSetReceivePlanHId_NotEqual(Long receivePlanHId) {
        regReceivePlanHId(CK_NES, receivePlanHId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_H_ID: {IX, bigint(19)}
     * @param receivePlanHId The value of receivePlanHId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceivePlanHId_GreaterThan(Long receivePlanHId) {
        regReceivePlanHId(CK_GT, receivePlanHId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_H_ID: {IX, bigint(19)}
     * @param receivePlanHId The value of receivePlanHId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceivePlanHId_LessThan(Long receivePlanHId) {
        regReceivePlanHId(CK_LT, receivePlanHId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_H_ID: {IX, bigint(19)}
     * @param receivePlanHId The value of receivePlanHId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceivePlanHId_GreaterEqual(Long receivePlanHId) {
        regReceivePlanHId(CK_GE, receivePlanHId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_H_ID: {IX, bigint(19)}
     * @param receivePlanHId The value of receivePlanHId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceivePlanHId_LessEqual(Long receivePlanHId) {
        regReceivePlanHId(CK_LE, receivePlanHId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_H_ID: {IX, bigint(19)}
     * @param minNumber The min number of receivePlanHId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of receivePlanHId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setReceivePlanHId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueReceivePlanHId(), "RECEIVE_PLAN_H_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RECEIVE_PLAN_H_ID: {IX, bigint(19)}
     * @param receivePlanHIdList The collection of receivePlanHId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivePlanHId_InScope(Collection<Long> receivePlanHIdList) {
        doSetReceivePlanHId_InScope(receivePlanHIdList);
    }

    protected void doSetReceivePlanHId_InScope(Collection<Long> receivePlanHIdList) {
        regINS(CK_INS, cTL(receivePlanHIdList), xgetCValueReceivePlanHId(), "RECEIVE_PLAN_H_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RECEIVE_PLAN_H_ID: {IX, bigint(19)}
     * @param receivePlanHIdList The collection of receivePlanHId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivePlanHId_NotInScope(Collection<Long> receivePlanHIdList) {
        doSetReceivePlanHId_NotInScope(receivePlanHIdList);
    }

    protected void doSetReceivePlanHId_NotInScope(Collection<Long> receivePlanHIdList) {
        regINS(CK_NINS, cTL(receivePlanHIdList), xgetCValueReceivePlanHId(), "RECEIVE_PLAN_H_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_H_ID: {IX, bigint(19)}
     */
    public void setReceivePlanHId_IsNull() { regReceivePlanHId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_H_ID: {IX, bigint(19)}
     */
    public void setReceivePlanHId_IsNotNull() { regReceivePlanHId(CK_ISNN, DOBJ); }

    protected void regReceivePlanHId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReceivePlanHId(), "RECEIVE_PLAN_H_ID"); }
    protected abstract ConditionValue xgetCValueReceivePlanHId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_B_ID: {decimal(16, 6)}
     * @param receivePlanBId The value of receivePlanBId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceivePlanBId_Equal(java.math.BigDecimal receivePlanBId) {
        doSetReceivePlanBId_Equal(receivePlanBId);
    }

    protected void doSetReceivePlanBId_Equal(java.math.BigDecimal receivePlanBId) {
        regReceivePlanBId(CK_EQ, receivePlanBId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_B_ID: {decimal(16, 6)}
     * @param receivePlanBId The value of receivePlanBId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceivePlanBId_NotEqual(java.math.BigDecimal receivePlanBId) {
        doSetReceivePlanBId_NotEqual(receivePlanBId);
    }

    protected void doSetReceivePlanBId_NotEqual(java.math.BigDecimal receivePlanBId) {
        regReceivePlanBId(CK_NES, receivePlanBId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_B_ID: {decimal(16, 6)}
     * @param receivePlanBId The value of receivePlanBId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceivePlanBId_GreaterThan(java.math.BigDecimal receivePlanBId) {
        regReceivePlanBId(CK_GT, receivePlanBId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_B_ID: {decimal(16, 6)}
     * @param receivePlanBId The value of receivePlanBId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceivePlanBId_LessThan(java.math.BigDecimal receivePlanBId) {
        regReceivePlanBId(CK_LT, receivePlanBId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_B_ID: {decimal(16, 6)}
     * @param receivePlanBId The value of receivePlanBId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceivePlanBId_GreaterEqual(java.math.BigDecimal receivePlanBId) {
        regReceivePlanBId(CK_GE, receivePlanBId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_B_ID: {decimal(16, 6)}
     * @param receivePlanBId The value of receivePlanBId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceivePlanBId_LessEqual(java.math.BigDecimal receivePlanBId) {
        regReceivePlanBId(CK_LE, receivePlanBId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_B_ID: {decimal(16, 6)}
     * @param minNumber The min number of receivePlanBId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of receivePlanBId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setReceivePlanBId_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueReceivePlanBId(), "RECEIVE_PLAN_B_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RECEIVE_PLAN_B_ID: {decimal(16, 6)}
     * @param receivePlanBIdList The collection of receivePlanBId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivePlanBId_InScope(Collection<java.math.BigDecimal> receivePlanBIdList) {
        doSetReceivePlanBId_InScope(receivePlanBIdList);
    }

    protected void doSetReceivePlanBId_InScope(Collection<java.math.BigDecimal> receivePlanBIdList) {
        regINS(CK_INS, cTL(receivePlanBIdList), xgetCValueReceivePlanBId(), "RECEIVE_PLAN_B_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RECEIVE_PLAN_B_ID: {decimal(16, 6)}
     * @param receivePlanBIdList The collection of receivePlanBId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivePlanBId_NotInScope(Collection<java.math.BigDecimal> receivePlanBIdList) {
        doSetReceivePlanBId_NotInScope(receivePlanBIdList);
    }

    protected void doSetReceivePlanBId_NotInScope(Collection<java.math.BigDecimal> receivePlanBIdList) {
        regINS(CK_NINS, cTL(receivePlanBIdList), xgetCValueReceivePlanBId(), "RECEIVE_PLAN_B_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_B_ID: {decimal(16, 6)}
     */
    public void setReceivePlanBId_IsNull() { regReceivePlanBId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_B_ID: {decimal(16, 6)}
     */
    public void setReceivePlanBId_IsNotNull() { regReceivePlanBId(CK_ISNN, DOBJ); }

    protected void regReceivePlanBId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReceivePlanBId(), "RECEIVE_PLAN_B_ID"); }
    protected abstract ConditionValue xgetCValueReceivePlanBId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVLINENO: {bigint(19)}
     * @param rcvlineno The value of rcvlineno as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvlineno_Equal(Long rcvlineno) {
        doSetRcvlineno_Equal(rcvlineno);
    }

    protected void doSetRcvlineno_Equal(Long rcvlineno) {
        regRcvlineno(CK_EQ, rcvlineno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVLINENO: {bigint(19)}
     * @param rcvlineno The value of rcvlineno as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvlineno_NotEqual(Long rcvlineno) {
        doSetRcvlineno_NotEqual(rcvlineno);
    }

    protected void doSetRcvlineno_NotEqual(Long rcvlineno) {
        regRcvlineno(CK_NES, rcvlineno);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVLINENO: {bigint(19)}
     * @param rcvlineno The value of rcvlineno as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvlineno_GreaterThan(Long rcvlineno) {
        regRcvlineno(CK_GT, rcvlineno);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVLINENO: {bigint(19)}
     * @param rcvlineno The value of rcvlineno as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvlineno_LessThan(Long rcvlineno) {
        regRcvlineno(CK_LT, rcvlineno);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVLINENO: {bigint(19)}
     * @param rcvlineno The value of rcvlineno as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvlineno_GreaterEqual(Long rcvlineno) {
        regRcvlineno(CK_GE, rcvlineno);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVLINENO: {bigint(19)}
     * @param rcvlineno The value of rcvlineno as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvlineno_LessEqual(Long rcvlineno) {
        regRcvlineno(CK_LE, rcvlineno);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * RCVLINENO: {bigint(19)}
     * @param minNumber The min number of rcvlineno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of rcvlineno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setRcvlineno_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueRcvlineno(), "RCVLINENO", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RCVLINENO: {bigint(19)}
     * @param rcvlinenoList The collection of rcvlineno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvlineno_InScope(Collection<Long> rcvlinenoList) {
        doSetRcvlineno_InScope(rcvlinenoList);
    }

    protected void doSetRcvlineno_InScope(Collection<Long> rcvlinenoList) {
        regINS(CK_INS, cTL(rcvlinenoList), xgetCValueRcvlineno(), "RCVLINENO");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RCVLINENO: {bigint(19)}
     * @param rcvlinenoList The collection of rcvlineno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvlineno_NotInScope(Collection<Long> rcvlinenoList) {
        doSetRcvlineno_NotInScope(rcvlinenoList);
    }

    protected void doSetRcvlineno_NotInScope(Collection<Long> rcvlinenoList) {
        regINS(CK_NINS, cTL(rcvlinenoList), xgetCValueRcvlineno(), "RCVLINENO");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RCVLINENO: {bigint(19)}
     */
    public void setRcvlineno_IsNull() { regRcvlineno(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RCVLINENO: {bigint(19)}
     */
    public void setRcvlineno_IsNotNull() { regRcvlineno(CK_ISNN, DOBJ); }

    protected void regRcvlineno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRcvlineno(), "RCVLINENO"); }
    protected abstract ConditionValue xgetCValueRcvlineno();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SENDRCVKEY: {IX, decimal(16, 6)}
     * @param sendrcvkey The value of sendrcvkey as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSendrcvkey_Equal(java.math.BigDecimal sendrcvkey) {
        doSetSendrcvkey_Equal(sendrcvkey);
    }

    protected void doSetSendrcvkey_Equal(java.math.BigDecimal sendrcvkey) {
        regSendrcvkey(CK_EQ, sendrcvkey);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SENDRCVKEY: {IX, decimal(16, 6)}
     * @param sendrcvkey The value of sendrcvkey as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSendrcvkey_NotEqual(java.math.BigDecimal sendrcvkey) {
        doSetSendrcvkey_NotEqual(sendrcvkey);
    }

    protected void doSetSendrcvkey_NotEqual(java.math.BigDecimal sendrcvkey) {
        regSendrcvkey(CK_NES, sendrcvkey);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SENDRCVKEY: {IX, decimal(16, 6)}
     * @param sendrcvkey The value of sendrcvkey as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSendrcvkey_GreaterThan(java.math.BigDecimal sendrcvkey) {
        regSendrcvkey(CK_GT, sendrcvkey);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SENDRCVKEY: {IX, decimal(16, 6)}
     * @param sendrcvkey The value of sendrcvkey as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSendrcvkey_LessThan(java.math.BigDecimal sendrcvkey) {
        regSendrcvkey(CK_LT, sendrcvkey);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SENDRCVKEY: {IX, decimal(16, 6)}
     * @param sendrcvkey The value of sendrcvkey as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSendrcvkey_GreaterEqual(java.math.BigDecimal sendrcvkey) {
        regSendrcvkey(CK_GE, sendrcvkey);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SENDRCVKEY: {IX, decimal(16, 6)}
     * @param sendrcvkey The value of sendrcvkey as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSendrcvkey_LessEqual(java.math.BigDecimal sendrcvkey) {
        regSendrcvkey(CK_LE, sendrcvkey);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SENDRCVKEY: {IX, decimal(16, 6)}
     * @param minNumber The min number of sendrcvkey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of sendrcvkey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSendrcvkey_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSendrcvkey(), "SENDRCVKEY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SENDRCVKEY: {IX, decimal(16, 6)}
     * @param sendrcvkeyList The collection of sendrcvkey as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSendrcvkey_InScope(Collection<java.math.BigDecimal> sendrcvkeyList) {
        doSetSendrcvkey_InScope(sendrcvkeyList);
    }

    protected void doSetSendrcvkey_InScope(Collection<java.math.BigDecimal> sendrcvkeyList) {
        regINS(CK_INS, cTL(sendrcvkeyList), xgetCValueSendrcvkey(), "SENDRCVKEY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SENDRCVKEY: {IX, decimal(16, 6)}
     * @param sendrcvkeyList The collection of sendrcvkey as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSendrcvkey_NotInScope(Collection<java.math.BigDecimal> sendrcvkeyList) {
        doSetSendrcvkey_NotInScope(sendrcvkeyList);
    }

    protected void doSetSendrcvkey_NotInScope(Collection<java.math.BigDecimal> sendrcvkeyList) {
        regINS(CK_NINS, cTL(sendrcvkeyList), xgetCValueSendrcvkey(), "SENDRCVKEY");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SENDRCVKEY: {IX, decimal(16, 6)}
     */
    public void setSendrcvkey_IsNull() { regSendrcvkey(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SENDRCVKEY: {IX, decimal(16, 6)}
     */
    public void setSendrcvkey_IsNotNull() { regSendrcvkey(CK_ISNN, DOBJ); }

    protected void regSendrcvkey(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSendrcvkey(), "SENDRCVKEY"); }
    protected abstract ConditionValue xgetCValueSendrcvkey();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAKERCASENO: {varchar(60)}
     * @param makercaseno The value of makercaseno as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMakercaseno_Equal(String makercaseno) {
        doSetMakercaseno_Equal(fRES(makercaseno));
    }

    protected void doSetMakercaseno_Equal(String makercaseno) {
        regMakercaseno(CK_EQ, makercaseno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAKERCASENO: {varchar(60)}
     * @param makercaseno The value of makercaseno as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMakercaseno_NotEqual(String makercaseno) {
        doSetMakercaseno_NotEqual(fRES(makercaseno));
    }

    protected void doSetMakercaseno_NotEqual(String makercaseno) {
        regMakercaseno(CK_NES, makercaseno);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAKERCASENO: {varchar(60)}
     * @param makercaseno The value of makercaseno as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMakercaseno_GreaterThan(String makercaseno) {
        regMakercaseno(CK_GT, fRES(makercaseno));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAKERCASENO: {varchar(60)}
     * @param makercaseno The value of makercaseno as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMakercaseno_LessThan(String makercaseno) {
        regMakercaseno(CK_LT, fRES(makercaseno));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAKERCASENO: {varchar(60)}
     * @param makercaseno The value of makercaseno as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMakercaseno_GreaterEqual(String makercaseno) {
        regMakercaseno(CK_GE, fRES(makercaseno));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAKERCASENO: {varchar(60)}
     * @param makercaseno The value of makercaseno as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMakercaseno_LessEqual(String makercaseno) {
        regMakercaseno(CK_LE, fRES(makercaseno));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MAKERCASENO: {varchar(60)}
     * @param makercasenoList The collection of makercaseno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMakercaseno_InScope(Collection<String> makercasenoList) {
        doSetMakercaseno_InScope(makercasenoList);
    }

    protected void doSetMakercaseno_InScope(Collection<String> makercasenoList) {
        regINS(CK_INS, cTL(makercasenoList), xgetCValueMakercaseno(), "MAKERCASENO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MAKERCASENO: {varchar(60)}
     * @param makercasenoList The collection of makercaseno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMakercaseno_NotInScope(Collection<String> makercasenoList) {
        doSetMakercaseno_NotInScope(makercasenoList);
    }

    protected void doSetMakercaseno_NotInScope(Collection<String> makercasenoList) {
        regINS(CK_NINS, cTL(makercasenoList), xgetCValueMakercaseno(), "MAKERCASENO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MAKERCASENO: {varchar(60)} <br>
     * <pre>e.g. setMakercaseno_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param makercaseno The value of makercaseno as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setMakercaseno_LikeSearch(String makercaseno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(makercaseno), xgetCValueMakercaseno(), "MAKERCASENO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MAKERCASENO: {varchar(60)}
     * @param makercaseno The value of makercaseno as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setMakercaseno_NotLikeSearch(String makercaseno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(makercaseno), xgetCValueMakercaseno(), "MAKERCASENO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MAKERCASENO: {varchar(60)}
     * @param makercaseno The value of makercaseno as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMakercaseno_PrefixSearch(String makercaseno) {
        setMakercaseno_LikeSearch(makercaseno, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MAKERCASENO: {varchar(60)}
     */
    public void setMakercaseno_IsNull() { regMakercaseno(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * MAKERCASENO: {varchar(60)}
     */
    public void setMakercaseno_IsNullOrEmpty() { regMakercaseno(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MAKERCASENO: {varchar(60)}
     */
    public void setMakercaseno_IsNotNull() { regMakercaseno(CK_ISNN, DOBJ); }

    protected void regMakercaseno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMakercaseno(), "MAKERCASENO"); }
    protected abstract ConditionValue xgetCValueMakercaseno();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOLSTS: {NotNull, varchar(30)}
     * @param symbolsts The value of symbolsts as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolsts_Equal(String symbolsts) {
        doSetSymbolsts_Equal(fRES(symbolsts));
    }

    protected void doSetSymbolsts_Equal(String symbolsts) {
        regSymbolsts(CK_EQ, symbolsts);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOLSTS: {NotNull, varchar(30)}
     * @param symbolsts The value of symbolsts as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolsts_NotEqual(String symbolsts) {
        doSetSymbolsts_NotEqual(fRES(symbolsts));
    }

    protected void doSetSymbolsts_NotEqual(String symbolsts) {
        regSymbolsts(CK_NES, symbolsts);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOLSTS: {NotNull, varchar(30)}
     * @param symbolsts The value of symbolsts as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolsts_GreaterThan(String symbolsts) {
        regSymbolsts(CK_GT, fRES(symbolsts));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOLSTS: {NotNull, varchar(30)}
     * @param symbolsts The value of symbolsts as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolsts_LessThan(String symbolsts) {
        regSymbolsts(CK_LT, fRES(symbolsts));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOLSTS: {NotNull, varchar(30)}
     * @param symbolsts The value of symbolsts as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolsts_GreaterEqual(String symbolsts) {
        regSymbolsts(CK_GE, fRES(symbolsts));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOLSTS: {NotNull, varchar(30)}
     * @param symbolsts The value of symbolsts as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolsts_LessEqual(String symbolsts) {
        regSymbolsts(CK_LE, fRES(symbolsts));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SYMBOLSTS: {NotNull, varchar(30)}
     * @param symbolstsList The collection of symbolsts as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolsts_InScope(Collection<String> symbolstsList) {
        doSetSymbolsts_InScope(symbolstsList);
    }

    protected void doSetSymbolsts_InScope(Collection<String> symbolstsList) {
        regINS(CK_INS, cTL(symbolstsList), xgetCValueSymbolsts(), "SYMBOLSTS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SYMBOLSTS: {NotNull, varchar(30)}
     * @param symbolstsList The collection of symbolsts as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolsts_NotInScope(Collection<String> symbolstsList) {
        doSetSymbolsts_NotInScope(symbolstsList);
    }

    protected void doSetSymbolsts_NotInScope(Collection<String> symbolstsList) {
        regINS(CK_NINS, cTL(symbolstsList), xgetCValueSymbolsts(), "SYMBOLSTS");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SYMBOLSTS: {NotNull, varchar(30)} <br>
     * <pre>e.g. setSymbolsts_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param symbolsts The value of symbolsts as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSymbolsts_LikeSearch(String symbolsts, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(symbolsts), xgetCValueSymbolsts(), "SYMBOLSTS", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SYMBOLSTS: {NotNull, varchar(30)}
     * @param symbolsts The value of symbolsts as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSymbolsts_NotLikeSearch(String symbolsts, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(symbolsts), xgetCValueSymbolsts(), "SYMBOLSTS", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SYMBOLSTS: {NotNull, varchar(30)}
     * @param symbolsts The value of symbolsts as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolsts_PrefixSearch(String symbolsts) {
        setSymbolsts_LikeSearch(symbolsts, xcLSOPPre());
    }

    protected void regSymbolsts(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSymbolsts(), "SYMBOLSTS"); }
    protected abstract ConditionValue xgetCValueSymbolsts();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOLADDFLG: {NotNull, varchar(30)}
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
     * SYMBOLADDFLG: {NotNull, varchar(30)}
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
     * SYMBOLADDFLG: {NotNull, varchar(30)}
     * @param symboladdflg The value of symboladdflg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymboladdflg_GreaterThan(String symboladdflg) {
        regSymboladdflg(CK_GT, fRES(symboladdflg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOLADDFLG: {NotNull, varchar(30)}
     * @param symboladdflg The value of symboladdflg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymboladdflg_LessThan(String symboladdflg) {
        regSymboladdflg(CK_LT, fRES(symboladdflg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOLADDFLG: {NotNull, varchar(30)}
     * @param symboladdflg The value of symboladdflg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymboladdflg_GreaterEqual(String symboladdflg) {
        regSymboladdflg(CK_GE, fRES(symboladdflg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOLADDFLG: {NotNull, varchar(30)}
     * @param symboladdflg The value of symboladdflg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymboladdflg_LessEqual(String symboladdflg) {
        regSymboladdflg(CK_LE, fRES(symboladdflg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SYMBOLADDFLG: {NotNull, varchar(30)}
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
     * SYMBOLADDFLG: {NotNull, varchar(30)}
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
     * SYMBOLADDFLG: {NotNull, varchar(30)} <br>
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
     * SYMBOLADDFLG: {NotNull, varchar(30)}
     * @param symboladdflg The value of symboladdflg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSymboladdflg_NotLikeSearch(String symboladdflg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(symboladdflg), xgetCValueSymboladdflg(), "SYMBOLADDFLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SYMBOLADDFLG: {NotNull, varchar(30)}
     * @param symboladdflg The value of symboladdflg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymboladdflg_PrefixSearch(String symboladdflg) {
        setSymboladdflg_LikeSearch(symboladdflg, xcLSOPPre());
    }

    protected void regSymboladdflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSymboladdflg(), "SYMBOLADDFLG"); }
    protected abstract ConditionValue xgetCValueSymboladdflg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRINTEDFLG: {NotNull, char(1)}
     * @param printedflg The value of printedflg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintedflg_Equal(String printedflg) {
        doSetPrintedflg_Equal(fRES(printedflg));
    }

    protected void doSetPrintedflg_Equal(String printedflg) {
        regPrintedflg(CK_EQ, printedflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRINTEDFLG: {NotNull, char(1)}
     * @param printedflg The value of printedflg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintedflg_NotEqual(String printedflg) {
        doSetPrintedflg_NotEqual(fRES(printedflg));
    }

    protected void doSetPrintedflg_NotEqual(String printedflg) {
        regPrintedflg(CK_NES, printedflg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRINTEDFLG: {NotNull, char(1)}
     * @param printedflg The value of printedflg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintedflg_GreaterThan(String printedflg) {
        regPrintedflg(CK_GT, fRES(printedflg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRINTEDFLG: {NotNull, char(1)}
     * @param printedflg The value of printedflg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintedflg_LessThan(String printedflg) {
        regPrintedflg(CK_LT, fRES(printedflg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRINTEDFLG: {NotNull, char(1)}
     * @param printedflg The value of printedflg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintedflg_GreaterEqual(String printedflg) {
        regPrintedflg(CK_GE, fRES(printedflg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRINTEDFLG: {NotNull, char(1)}
     * @param printedflg The value of printedflg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintedflg_LessEqual(String printedflg) {
        regPrintedflg(CK_LE, fRES(printedflg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRINTEDFLG: {NotNull, char(1)}
     * @param printedflgList The collection of printedflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintedflg_InScope(Collection<String> printedflgList) {
        doSetPrintedflg_InScope(printedflgList);
    }

    protected void doSetPrintedflg_InScope(Collection<String> printedflgList) {
        regINS(CK_INS, cTL(printedflgList), xgetCValuePrintedflg(), "PRINTEDFLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRINTEDFLG: {NotNull, char(1)}
     * @param printedflgList The collection of printedflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintedflg_NotInScope(Collection<String> printedflgList) {
        doSetPrintedflg_NotInScope(printedflgList);
    }

    protected void doSetPrintedflg_NotInScope(Collection<String> printedflgList) {
        regINS(CK_NINS, cTL(printedflgList), xgetCValuePrintedflg(), "PRINTEDFLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRINTEDFLG: {NotNull, char(1)} <br>
     * <pre>e.g. setPrintedflg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param printedflg The value of printedflg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPrintedflg_LikeSearch(String printedflg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(printedflg), xgetCValuePrintedflg(), "PRINTEDFLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRINTEDFLG: {NotNull, char(1)}
     * @param printedflg The value of printedflg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPrintedflg_NotLikeSearch(String printedflg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(printedflg), xgetCValuePrintedflg(), "PRINTEDFLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRINTEDFLG: {NotNull, char(1)}
     * @param printedflg The value of printedflg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintedflg_PrefixSearch(String printedflg) {
        setPrintedflg_LikeSearch(printedflg, xcLSOPPre());
    }

    protected void regPrintedflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePrintedflg(), "PRINTEDFLG"); }
    protected abstract ConditionValue xgetCValuePrintedflg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOLSNDDATE: {varchar(8)}
     * @param symbolsnddate The value of symbolsnddate as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolsnddate_Equal(String symbolsnddate) {
        doSetSymbolsnddate_Equal(fRES(symbolsnddate));
    }

    protected void doSetSymbolsnddate_Equal(String symbolsnddate) {
        regSymbolsnddate(CK_EQ, symbolsnddate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOLSNDDATE: {varchar(8)}
     * @param symbolsnddate The value of symbolsnddate as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolsnddate_NotEqual(String symbolsnddate) {
        doSetSymbolsnddate_NotEqual(fRES(symbolsnddate));
    }

    protected void doSetSymbolsnddate_NotEqual(String symbolsnddate) {
        regSymbolsnddate(CK_NES, symbolsnddate);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOLSNDDATE: {varchar(8)}
     * @param symbolsnddate The value of symbolsnddate as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolsnddate_GreaterThan(String symbolsnddate) {
        regSymbolsnddate(CK_GT, fRES(symbolsnddate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOLSNDDATE: {varchar(8)}
     * @param symbolsnddate The value of symbolsnddate as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolsnddate_LessThan(String symbolsnddate) {
        regSymbolsnddate(CK_LT, fRES(symbolsnddate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOLSNDDATE: {varchar(8)}
     * @param symbolsnddate The value of symbolsnddate as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolsnddate_GreaterEqual(String symbolsnddate) {
        regSymbolsnddate(CK_GE, fRES(symbolsnddate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOLSNDDATE: {varchar(8)}
     * @param symbolsnddate The value of symbolsnddate as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolsnddate_LessEqual(String symbolsnddate) {
        regSymbolsnddate(CK_LE, fRES(symbolsnddate));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SYMBOLSNDDATE: {varchar(8)}
     * @param symbolsnddateList The collection of symbolsnddate as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolsnddate_InScope(Collection<String> symbolsnddateList) {
        doSetSymbolsnddate_InScope(symbolsnddateList);
    }

    protected void doSetSymbolsnddate_InScope(Collection<String> symbolsnddateList) {
        regINS(CK_INS, cTL(symbolsnddateList), xgetCValueSymbolsnddate(), "SYMBOLSNDDATE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SYMBOLSNDDATE: {varchar(8)}
     * @param symbolsnddateList The collection of symbolsnddate as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolsnddate_NotInScope(Collection<String> symbolsnddateList) {
        doSetSymbolsnddate_NotInScope(symbolsnddateList);
    }

    protected void doSetSymbolsnddate_NotInScope(Collection<String> symbolsnddateList) {
        regINS(CK_NINS, cTL(symbolsnddateList), xgetCValueSymbolsnddate(), "SYMBOLSNDDATE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SYMBOLSNDDATE: {varchar(8)} <br>
     * <pre>e.g. setSymbolsnddate_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param symbolsnddate The value of symbolsnddate as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSymbolsnddate_LikeSearch(String symbolsnddate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(symbolsnddate), xgetCValueSymbolsnddate(), "SYMBOLSNDDATE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SYMBOLSNDDATE: {varchar(8)}
     * @param symbolsnddate The value of symbolsnddate as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSymbolsnddate_NotLikeSearch(String symbolsnddate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(symbolsnddate), xgetCValueSymbolsnddate(), "SYMBOLSNDDATE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SYMBOLSNDDATE: {varchar(8)}
     * @param symbolsnddate The value of symbolsnddate as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolsnddate_PrefixSearch(String symbolsnddate) {
        setSymbolsnddate_LikeSearch(symbolsnddate, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SYMBOLSNDDATE: {varchar(8)}
     */
    public void setSymbolsnddate_IsNull() { regSymbolsnddate(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SYMBOLSNDDATE: {varchar(8)}
     */
    public void setSymbolsnddate_IsNullOrEmpty() { regSymbolsnddate(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SYMBOLSNDDATE: {varchar(8)}
     */
    public void setSymbolsnddate_IsNotNull() { regSymbolsnddate(CK_ISNN, DOBJ); }

    protected void regSymbolsnddate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSymbolsnddate(), "SYMBOLSNDDATE"); }
    protected abstract ConditionValue xgetCValueSymbolsnddate();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOLPASTDATE: {varchar(8)}
     * @param symbolpastdate The value of symbolpastdate as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolpastdate_Equal(String symbolpastdate) {
        doSetSymbolpastdate_Equal(fRES(symbolpastdate));
    }

    protected void doSetSymbolpastdate_Equal(String symbolpastdate) {
        regSymbolpastdate(CK_EQ, symbolpastdate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOLPASTDATE: {varchar(8)}
     * @param symbolpastdate The value of symbolpastdate as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolpastdate_NotEqual(String symbolpastdate) {
        doSetSymbolpastdate_NotEqual(fRES(symbolpastdate));
    }

    protected void doSetSymbolpastdate_NotEqual(String symbolpastdate) {
        regSymbolpastdate(CK_NES, symbolpastdate);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOLPASTDATE: {varchar(8)}
     * @param symbolpastdate The value of symbolpastdate as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolpastdate_GreaterThan(String symbolpastdate) {
        regSymbolpastdate(CK_GT, fRES(symbolpastdate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOLPASTDATE: {varchar(8)}
     * @param symbolpastdate The value of symbolpastdate as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolpastdate_LessThan(String symbolpastdate) {
        regSymbolpastdate(CK_LT, fRES(symbolpastdate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOLPASTDATE: {varchar(8)}
     * @param symbolpastdate The value of symbolpastdate as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolpastdate_GreaterEqual(String symbolpastdate) {
        regSymbolpastdate(CK_GE, fRES(symbolpastdate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOLPASTDATE: {varchar(8)}
     * @param symbolpastdate The value of symbolpastdate as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolpastdate_LessEqual(String symbolpastdate) {
        regSymbolpastdate(CK_LE, fRES(symbolpastdate));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SYMBOLPASTDATE: {varchar(8)}
     * @param symbolpastdateList The collection of symbolpastdate as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolpastdate_InScope(Collection<String> symbolpastdateList) {
        doSetSymbolpastdate_InScope(symbolpastdateList);
    }

    protected void doSetSymbolpastdate_InScope(Collection<String> symbolpastdateList) {
        regINS(CK_INS, cTL(symbolpastdateList), xgetCValueSymbolpastdate(), "SYMBOLPASTDATE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SYMBOLPASTDATE: {varchar(8)}
     * @param symbolpastdateList The collection of symbolpastdate as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolpastdate_NotInScope(Collection<String> symbolpastdateList) {
        doSetSymbolpastdate_NotInScope(symbolpastdateList);
    }

    protected void doSetSymbolpastdate_NotInScope(Collection<String> symbolpastdateList) {
        regINS(CK_NINS, cTL(symbolpastdateList), xgetCValueSymbolpastdate(), "SYMBOLPASTDATE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SYMBOLPASTDATE: {varchar(8)} <br>
     * <pre>e.g. setSymbolpastdate_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param symbolpastdate The value of symbolpastdate as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSymbolpastdate_LikeSearch(String symbolpastdate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(symbolpastdate), xgetCValueSymbolpastdate(), "SYMBOLPASTDATE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SYMBOLPASTDATE: {varchar(8)}
     * @param symbolpastdate The value of symbolpastdate as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSymbolpastdate_NotLikeSearch(String symbolpastdate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(symbolpastdate), xgetCValueSymbolpastdate(), "SYMBOLPASTDATE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SYMBOLPASTDATE: {varchar(8)}
     * @param symbolpastdate The value of symbolpastdate as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolpastdate_PrefixSearch(String symbolpastdate) {
        setSymbolpastdate_LikeSearch(symbolpastdate, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SYMBOLPASTDATE: {varchar(8)}
     */
    public void setSymbolpastdate_IsNull() { regSymbolpastdate(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SYMBOLPASTDATE: {varchar(8)}
     */
    public void setSymbolpastdate_IsNullOrEmpty() { regSymbolpastdate(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SYMBOLPASTDATE: {varchar(8)}
     */
    public void setSymbolpastdate_IsNotNull() { regSymbolpastdate(CK_ISNN, DOBJ); }

    protected void regSymbolpastdate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSymbolpastdate(), "SYMBOLPASTDATE"); }
    protected abstract ConditionValue xgetCValueSymbolpastdate();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOLPALLETONDATE: {varchar(8)}
     * @param symbolpalletondate The value of symbolpalletondate as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolpalletondate_Equal(String symbolpalletondate) {
        doSetSymbolpalletondate_Equal(fRES(symbolpalletondate));
    }

    protected void doSetSymbolpalletondate_Equal(String symbolpalletondate) {
        regSymbolpalletondate(CK_EQ, symbolpalletondate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOLPALLETONDATE: {varchar(8)}
     * @param symbolpalletondate The value of symbolpalletondate as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolpalletondate_NotEqual(String symbolpalletondate) {
        doSetSymbolpalletondate_NotEqual(fRES(symbolpalletondate));
    }

    protected void doSetSymbolpalletondate_NotEqual(String symbolpalletondate) {
        regSymbolpalletondate(CK_NES, symbolpalletondate);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOLPALLETONDATE: {varchar(8)}
     * @param symbolpalletondate The value of symbolpalletondate as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolpalletondate_GreaterThan(String symbolpalletondate) {
        regSymbolpalletondate(CK_GT, fRES(symbolpalletondate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOLPALLETONDATE: {varchar(8)}
     * @param symbolpalletondate The value of symbolpalletondate as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolpalletondate_LessThan(String symbolpalletondate) {
        regSymbolpalletondate(CK_LT, fRES(symbolpalletondate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOLPALLETONDATE: {varchar(8)}
     * @param symbolpalletondate The value of symbolpalletondate as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolpalletondate_GreaterEqual(String symbolpalletondate) {
        regSymbolpalletondate(CK_GE, fRES(symbolpalletondate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOLPALLETONDATE: {varchar(8)}
     * @param symbolpalletondate The value of symbolpalletondate as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolpalletondate_LessEqual(String symbolpalletondate) {
        regSymbolpalletondate(CK_LE, fRES(symbolpalletondate));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SYMBOLPALLETONDATE: {varchar(8)}
     * @param symbolpalletondateList The collection of symbolpalletondate as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolpalletondate_InScope(Collection<String> symbolpalletondateList) {
        doSetSymbolpalletondate_InScope(symbolpalletondateList);
    }

    protected void doSetSymbolpalletondate_InScope(Collection<String> symbolpalletondateList) {
        regINS(CK_INS, cTL(symbolpalletondateList), xgetCValueSymbolpalletondate(), "SYMBOLPALLETONDATE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SYMBOLPALLETONDATE: {varchar(8)}
     * @param symbolpalletondateList The collection of symbolpalletondate as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolpalletondate_NotInScope(Collection<String> symbolpalletondateList) {
        doSetSymbolpalletondate_NotInScope(symbolpalletondateList);
    }

    protected void doSetSymbolpalletondate_NotInScope(Collection<String> symbolpalletondateList) {
        regINS(CK_NINS, cTL(symbolpalletondateList), xgetCValueSymbolpalletondate(), "SYMBOLPALLETONDATE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SYMBOLPALLETONDATE: {varchar(8)} <br>
     * <pre>e.g. setSymbolpalletondate_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param symbolpalletondate The value of symbolpalletondate as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSymbolpalletondate_LikeSearch(String symbolpalletondate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(symbolpalletondate), xgetCValueSymbolpalletondate(), "SYMBOLPALLETONDATE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SYMBOLPALLETONDATE: {varchar(8)}
     * @param symbolpalletondate The value of symbolpalletondate as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSymbolpalletondate_NotLikeSearch(String symbolpalletondate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(symbolpalletondate), xgetCValueSymbolpalletondate(), "SYMBOLPALLETONDATE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SYMBOLPALLETONDATE: {varchar(8)}
     * @param symbolpalletondate The value of symbolpalletondate as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolpalletondate_PrefixSearch(String symbolpalletondate) {
        setSymbolpalletondate_LikeSearch(symbolpalletondate, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SYMBOLPALLETONDATE: {varchar(8)}
     */
    public void setSymbolpalletondate_IsNull() { regSymbolpalletondate(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SYMBOLPALLETONDATE: {varchar(8)}
     */
    public void setSymbolpalletondate_IsNullOrEmpty() { regSymbolpalletondate(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SYMBOLPALLETONDATE: {varchar(8)}
     */
    public void setSymbolpalletondate_IsNotNull() { regSymbolpalletondate(CK_ISNN, DOBJ); }

    protected void regSymbolpalletondate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSymbolpalletondate(), "SYMBOLPALLETONDATE"); }
    protected abstract ConditionValue xgetCValueSymbolpalletondate();

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
     * PALLET_ID: {IX, bigint(19)}
     * @param palletId The value of palletId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPalletId_Equal(Long palletId) {
        doSetPalletId_Equal(palletId);
    }

    protected void doSetPalletId_Equal(Long palletId) {
        regPalletId(CK_EQ, palletId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PALLET_ID: {IX, bigint(19)}
     * @param palletId The value of palletId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPalletId_NotEqual(Long palletId) {
        doSetPalletId_NotEqual(palletId);
    }

    protected void doSetPalletId_NotEqual(Long palletId) {
        regPalletId(CK_NES, palletId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PALLET_ID: {IX, bigint(19)}
     * @param palletId The value of palletId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPalletId_GreaterThan(Long palletId) {
        regPalletId(CK_GT, palletId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PALLET_ID: {IX, bigint(19)}
     * @param palletId The value of palletId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPalletId_LessThan(Long palletId) {
        regPalletId(CK_LT, palletId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PALLET_ID: {IX, bigint(19)}
     * @param palletId The value of palletId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPalletId_GreaterEqual(Long palletId) {
        regPalletId(CK_GE, palletId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PALLET_ID: {IX, bigint(19)}
     * @param palletId The value of palletId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPalletId_LessEqual(Long palletId) {
        regPalletId(CK_LE, palletId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PALLET_ID: {IX, bigint(19)}
     * @param minNumber The min number of palletId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of palletId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPalletId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePalletId(), "PALLET_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PALLET_ID: {IX, bigint(19)}
     * @param palletIdList The collection of palletId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletId_InScope(Collection<Long> palletIdList) {
        doSetPalletId_InScope(palletIdList);
    }

    protected void doSetPalletId_InScope(Collection<Long> palletIdList) {
        regINS(CK_INS, cTL(palletIdList), xgetCValuePalletId(), "PALLET_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PALLET_ID: {IX, bigint(19)}
     * @param palletIdList The collection of palletId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletId_NotInScope(Collection<Long> palletIdList) {
        doSetPalletId_NotInScope(palletIdList);
    }

    protected void doSetPalletId_NotInScope(Collection<Long> palletIdList) {
        regINS(CK_NINS, cTL(palletIdList), xgetCValuePalletId(), "PALLET_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PALLET_ID: {IX, bigint(19)}
     */
    public void setPalletId_IsNull() { regPalletId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PALLET_ID: {IX, bigint(19)}
     */
    public void setPalletId_IsNotNull() { regPalletId(CK_ISNN, DOBJ); }

    protected void regPalletId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePalletId(), "PALLET_ID"); }
    protected abstract ConditionValue xgetCValuePalletId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * BASE_PALLET_ID: {decimal(16, 6)}
     * @param basePalletId The value of basePalletId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setBasePalletId_Equal(java.math.BigDecimal basePalletId) {
        doSetBasePalletId_Equal(basePalletId);
    }

    protected void doSetBasePalletId_Equal(java.math.BigDecimal basePalletId) {
        regBasePalletId(CK_EQ, basePalletId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BASE_PALLET_ID: {decimal(16, 6)}
     * @param basePalletId The value of basePalletId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBasePalletId_NotEqual(java.math.BigDecimal basePalletId) {
        doSetBasePalletId_NotEqual(basePalletId);
    }

    protected void doSetBasePalletId_NotEqual(java.math.BigDecimal basePalletId) {
        regBasePalletId(CK_NES, basePalletId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BASE_PALLET_ID: {decimal(16, 6)}
     * @param basePalletId The value of basePalletId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBasePalletId_GreaterThan(java.math.BigDecimal basePalletId) {
        regBasePalletId(CK_GT, basePalletId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BASE_PALLET_ID: {decimal(16, 6)}
     * @param basePalletId The value of basePalletId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBasePalletId_LessThan(java.math.BigDecimal basePalletId) {
        regBasePalletId(CK_LT, basePalletId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BASE_PALLET_ID: {decimal(16, 6)}
     * @param basePalletId The value of basePalletId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBasePalletId_GreaterEqual(java.math.BigDecimal basePalletId) {
        regBasePalletId(CK_GE, basePalletId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BASE_PALLET_ID: {decimal(16, 6)}
     * @param basePalletId The value of basePalletId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBasePalletId_LessEqual(java.math.BigDecimal basePalletId) {
        regBasePalletId(CK_LE, basePalletId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * BASE_PALLET_ID: {decimal(16, 6)}
     * @param minNumber The min number of basePalletId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of basePalletId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setBasePalletId_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueBasePalletId(), "BASE_PALLET_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BASE_PALLET_ID: {decimal(16, 6)}
     * @param basePalletIdList The collection of basePalletId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBasePalletId_InScope(Collection<java.math.BigDecimal> basePalletIdList) {
        doSetBasePalletId_InScope(basePalletIdList);
    }

    protected void doSetBasePalletId_InScope(Collection<java.math.BigDecimal> basePalletIdList) {
        regINS(CK_INS, cTL(basePalletIdList), xgetCValueBasePalletId(), "BASE_PALLET_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BASE_PALLET_ID: {decimal(16, 6)}
     * @param basePalletIdList The collection of basePalletId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBasePalletId_NotInScope(Collection<java.math.BigDecimal> basePalletIdList) {
        doSetBasePalletId_NotInScope(basePalletIdList);
    }

    protected void doSetBasePalletId_NotInScope(Collection<java.math.BigDecimal> basePalletIdList) {
        regINS(CK_NINS, cTL(basePalletIdList), xgetCValueBasePalletId(), "BASE_PALLET_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BASE_PALLET_ID: {decimal(16, 6)}
     */
    public void setBasePalletId_IsNull() { regBasePalletId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BASE_PALLET_ID: {decimal(16, 6)}
     */
    public void setBasePalletId_IsNotNull() { regBasePalletId(CK_ISNN, DOBJ); }

    protected void regBasePalletId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBasePalletId(), "BASE_PALLET_ID"); }
    protected abstract ConditionValue xgetCValueBasePalletId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PARENTPALLETUPDDATE: {datetime2(26, 6)}
     * @param parentpalletupddate The value of parentpalletupddate as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setParentpalletupddate_Equal(java.sql.Timestamp parentpalletupddate) {
        regParentpalletupddate(CK_EQ,  parentpalletupddate);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PARENTPALLETUPDDATE: {datetime2(26, 6)}
     * @param parentpalletupddate The value of parentpalletupddate as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setParentpalletupddate_GreaterThan(java.sql.Timestamp parentpalletupddate) {
        regParentpalletupddate(CK_GT,  parentpalletupddate);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PARENTPALLETUPDDATE: {datetime2(26, 6)}
     * @param parentpalletupddate The value of parentpalletupddate as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setParentpalletupddate_LessThan(java.sql.Timestamp parentpalletupddate) {
        regParentpalletupddate(CK_LT,  parentpalletupddate);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PARENTPALLETUPDDATE: {datetime2(26, 6)}
     * @param parentpalletupddate The value of parentpalletupddate as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setParentpalletupddate_GreaterEqual(java.sql.Timestamp parentpalletupddate) {
        regParentpalletupddate(CK_GE,  parentpalletupddate);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PARENTPALLETUPDDATE: {datetime2(26, 6)}
     * @param parentpalletupddate The value of parentpalletupddate as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setParentpalletupddate_LessEqual(java.sql.Timestamp parentpalletupddate) {
        regParentpalletupddate(CK_LE, parentpalletupddate);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PARENTPALLETUPDDATE: {datetime2(26, 6)}
     * <pre>e.g. setParentpalletupddate_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of parentpalletupddate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of parentpalletupddate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setParentpalletupddate_FromTo(Date fromDatetime, Date toDatetime, FromToOption fromToOption) {
        regFTQ((fromDatetime != null ? new java.sql.Timestamp(fromDatetime.getTime()) : null), (toDatetime != null ? new java.sql.Timestamp(toDatetime.getTime()) : null), xgetCValueParentpalletupddate(), "PARENTPALLETUPDDATE", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PARENTPALLETUPDDATE: {datetime2(26, 6)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #CC4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of parentpalletupddate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDate The to-date(yyyy/MM/dd) of parentpalletupddate. (basically NotNull: if op.allowOneSide(), null allowed)
     */
    public void setParentpalletupddate_DateFromTo(Date fromDate, Date toDate) {
        setParentpalletupddate_FromTo(fromDate, toDate, xcDFTOP());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PARENTPALLETUPDDATE: {datetime2(26, 6)}
     */
    public void setParentpalletupddate_IsNull() { regParentpalletupddate(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PARENTPALLETUPDDATE: {datetime2(26, 6)}
     */
    public void setParentpalletupddate_IsNotNull() { regParentpalletupddate(CK_ISNN, DOBJ); }

    protected void regParentpalletupddate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueParentpalletupddate(), "PARENTPALLETUPDDATE"); }
    protected abstract ConditionValue xgetCValueParentpalletupddate();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRINTINGDATE: {varchar(8)}
     * @param printingdate The value of printingdate as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintingdate_Equal(String printingdate) {
        doSetPrintingdate_Equal(fRES(printingdate));
    }

    protected void doSetPrintingdate_Equal(String printingdate) {
        regPrintingdate(CK_EQ, printingdate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRINTINGDATE: {varchar(8)}
     * @param printingdate The value of printingdate as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintingdate_NotEqual(String printingdate) {
        doSetPrintingdate_NotEqual(fRES(printingdate));
    }

    protected void doSetPrintingdate_NotEqual(String printingdate) {
        regPrintingdate(CK_NES, printingdate);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRINTINGDATE: {varchar(8)}
     * @param printingdate The value of printingdate as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintingdate_GreaterThan(String printingdate) {
        regPrintingdate(CK_GT, fRES(printingdate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRINTINGDATE: {varchar(8)}
     * @param printingdate The value of printingdate as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintingdate_LessThan(String printingdate) {
        regPrintingdate(CK_LT, fRES(printingdate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRINTINGDATE: {varchar(8)}
     * @param printingdate The value of printingdate as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintingdate_GreaterEqual(String printingdate) {
        regPrintingdate(CK_GE, fRES(printingdate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRINTINGDATE: {varchar(8)}
     * @param printingdate The value of printingdate as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintingdate_LessEqual(String printingdate) {
        regPrintingdate(CK_LE, fRES(printingdate));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRINTINGDATE: {varchar(8)}
     * @param printingdateList The collection of printingdate as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintingdate_InScope(Collection<String> printingdateList) {
        doSetPrintingdate_InScope(printingdateList);
    }

    protected void doSetPrintingdate_InScope(Collection<String> printingdateList) {
        regINS(CK_INS, cTL(printingdateList), xgetCValuePrintingdate(), "PRINTINGDATE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRINTINGDATE: {varchar(8)}
     * @param printingdateList The collection of printingdate as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintingdate_NotInScope(Collection<String> printingdateList) {
        doSetPrintingdate_NotInScope(printingdateList);
    }

    protected void doSetPrintingdate_NotInScope(Collection<String> printingdateList) {
        regINS(CK_NINS, cTL(printingdateList), xgetCValuePrintingdate(), "PRINTINGDATE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRINTINGDATE: {varchar(8)} <br>
     * <pre>e.g. setPrintingdate_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param printingdate The value of printingdate as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPrintingdate_LikeSearch(String printingdate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(printingdate), xgetCValuePrintingdate(), "PRINTINGDATE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRINTINGDATE: {varchar(8)}
     * @param printingdate The value of printingdate as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPrintingdate_NotLikeSearch(String printingdate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(printingdate), xgetCValuePrintingdate(), "PRINTINGDATE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRINTINGDATE: {varchar(8)}
     * @param printingdate The value of printingdate as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintingdate_PrefixSearch(String printingdate) {
        setPrintingdate_LikeSearch(printingdate, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PRINTINGDATE: {varchar(8)}
     */
    public void setPrintingdate_IsNull() { regPrintingdate(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PRINTINGDATE: {varchar(8)}
     */
    public void setPrintingdate_IsNullOrEmpty() { regPrintingdate(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PRINTINGDATE: {varchar(8)}
     */
    public void setPrintingdate_IsNotNull() { regPrintingdate(CK_ISNN, DOBJ); }

    protected void regPrintingdate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePrintingdate(), "PRINTINGDATE"); }
    protected abstract ConditionValue xgetCValuePrintingdate();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCATION_ID: {bigint(19)}
     * @param locationId The value of locationId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocationId_Equal(Long locationId) {
        doSetLocationId_Equal(locationId);
    }

    protected void doSetLocationId_Equal(Long locationId) {
        regLocationId(CK_EQ, locationId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCATION_ID: {bigint(19)}
     * @param locationId The value of locationId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocationId_NotEqual(Long locationId) {
        doSetLocationId_NotEqual(locationId);
    }

    protected void doSetLocationId_NotEqual(Long locationId) {
        regLocationId(CK_NES, locationId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCATION_ID: {bigint(19)}
     * @param locationId The value of locationId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocationId_GreaterThan(Long locationId) {
        regLocationId(CK_GT, locationId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCATION_ID: {bigint(19)}
     * @param locationId The value of locationId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocationId_LessThan(Long locationId) {
        regLocationId(CK_LT, locationId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCATION_ID: {bigint(19)}
     * @param locationId The value of locationId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocationId_GreaterEqual(Long locationId) {
        regLocationId(CK_GE, locationId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCATION_ID: {bigint(19)}
     * @param locationId The value of locationId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocationId_LessEqual(Long locationId) {
        regLocationId(CK_LE, locationId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * LOCATION_ID: {bigint(19)}
     * @param minNumber The min number of locationId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of locationId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setLocationId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueLocationId(), "LOCATION_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LOCATION_ID: {bigint(19)}
     * @param locationIdList The collection of locationId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationId_InScope(Collection<Long> locationIdList) {
        doSetLocationId_InScope(locationIdList);
    }

    protected void doSetLocationId_InScope(Collection<Long> locationIdList) {
        regINS(CK_INS, cTL(locationIdList), xgetCValueLocationId(), "LOCATION_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LOCATION_ID: {bigint(19)}
     * @param locationIdList The collection of locationId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationId_NotInScope(Collection<Long> locationIdList) {
        doSetLocationId_NotInScope(locationIdList);
    }

    protected void doSetLocationId_NotInScope(Collection<Long> locationIdList) {
        regINS(CK_NINS, cTL(locationIdList), xgetCValueLocationId(), "LOCATION_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOCATION_ID: {bigint(19)}
     */
    public void setLocationId_IsNull() { regLocationId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOCATION_ID: {bigint(19)}
     */
    public void setLocationId_IsNotNull() { regLocationId(CK_ISNN, DOBJ); }

    protected void regLocationId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLocationId(), "LOCATION_ID"); }
    protected abstract ConditionValue xgetCValueLocationId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * RESTQTY: {decimal(16, 6)}
     * @param restqty The value of restqty as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setRestqty_Equal(java.math.BigDecimal restqty) {
        doSetRestqty_Equal(restqty);
    }

    protected void doSetRestqty_Equal(java.math.BigDecimal restqty) {
        regRestqty(CK_EQ, restqty);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RESTQTY: {decimal(16, 6)}
     * @param restqty The value of restqty as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRestqty_NotEqual(java.math.BigDecimal restqty) {
        doSetRestqty_NotEqual(restqty);
    }

    protected void doSetRestqty_NotEqual(java.math.BigDecimal restqty) {
        regRestqty(CK_NES, restqty);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RESTQTY: {decimal(16, 6)}
     * @param restqty The value of restqty as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRestqty_GreaterThan(java.math.BigDecimal restqty) {
        regRestqty(CK_GT, restqty);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RESTQTY: {decimal(16, 6)}
     * @param restqty The value of restqty as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRestqty_LessThan(java.math.BigDecimal restqty) {
        regRestqty(CK_LT, restqty);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RESTQTY: {decimal(16, 6)}
     * @param restqty The value of restqty as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRestqty_GreaterEqual(java.math.BigDecimal restqty) {
        regRestqty(CK_GE, restqty);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RESTQTY: {decimal(16, 6)}
     * @param restqty The value of restqty as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRestqty_LessEqual(java.math.BigDecimal restqty) {
        regRestqty(CK_LE, restqty);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * RESTQTY: {decimal(16, 6)}
     * @param minNumber The min number of restqty. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of restqty. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setRestqty_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueRestqty(), "RESTQTY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RESTQTY: {decimal(16, 6)}
     * @param restqtyList The collection of restqty as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRestqty_InScope(Collection<java.math.BigDecimal> restqtyList) {
        doSetRestqty_InScope(restqtyList);
    }

    protected void doSetRestqty_InScope(Collection<java.math.BigDecimal> restqtyList) {
        regINS(CK_INS, cTL(restqtyList), xgetCValueRestqty(), "RESTQTY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RESTQTY: {decimal(16, 6)}
     * @param restqtyList The collection of restqty as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRestqty_NotInScope(Collection<java.math.BigDecimal> restqtyList) {
        doSetRestqty_NotInScope(restqtyList);
    }

    protected void doSetRestqty_NotInScope(Collection<java.math.BigDecimal> restqtyList) {
        regINS(CK_NINS, cTL(restqtyList), xgetCValueRestqty(), "RESTQTY");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RESTQTY: {decimal(16, 6)}
     */
    public void setRestqty_IsNull() { regRestqty(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RESTQTY: {decimal(16, 6)}
     */
    public void setRestqty_IsNotNull() { regRestqty(CK_ISNN, DOBJ); }

    protected void regRestqty(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRestqty(), "RESTQTY"); }
    protected abstract ConditionValue xgetCValueRestqty();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVEDQTY: {decimal(16, 6)}
     * @param receivedqty The value of receivedqty as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceivedqty_Equal(java.math.BigDecimal receivedqty) {
        doSetReceivedqty_Equal(receivedqty);
    }

    protected void doSetReceivedqty_Equal(java.math.BigDecimal receivedqty) {
        regReceivedqty(CK_EQ, receivedqty);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVEDQTY: {decimal(16, 6)}
     * @param receivedqty The value of receivedqty as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceivedqty_NotEqual(java.math.BigDecimal receivedqty) {
        doSetReceivedqty_NotEqual(receivedqty);
    }

    protected void doSetReceivedqty_NotEqual(java.math.BigDecimal receivedqty) {
        regReceivedqty(CK_NES, receivedqty);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVEDQTY: {decimal(16, 6)}
     * @param receivedqty The value of receivedqty as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceivedqty_GreaterThan(java.math.BigDecimal receivedqty) {
        regReceivedqty(CK_GT, receivedqty);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVEDQTY: {decimal(16, 6)}
     * @param receivedqty The value of receivedqty as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceivedqty_LessThan(java.math.BigDecimal receivedqty) {
        regReceivedqty(CK_LT, receivedqty);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVEDQTY: {decimal(16, 6)}
     * @param receivedqty The value of receivedqty as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceivedqty_GreaterEqual(java.math.BigDecimal receivedqty) {
        regReceivedqty(CK_GE, receivedqty);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVEDQTY: {decimal(16, 6)}
     * @param receivedqty The value of receivedqty as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceivedqty_LessEqual(java.math.BigDecimal receivedqty) {
        regReceivedqty(CK_LE, receivedqty);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVEDQTY: {decimal(16, 6)}
     * @param minNumber The min number of receivedqty. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of receivedqty. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setReceivedqty_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueReceivedqty(), "RECEIVEDQTY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RECEIVEDQTY: {decimal(16, 6)}
     * @param receivedqtyList The collection of receivedqty as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivedqty_InScope(Collection<java.math.BigDecimal> receivedqtyList) {
        doSetReceivedqty_InScope(receivedqtyList);
    }

    protected void doSetReceivedqty_InScope(Collection<java.math.BigDecimal> receivedqtyList) {
        regINS(CK_INS, cTL(receivedqtyList), xgetCValueReceivedqty(), "RECEIVEDQTY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RECEIVEDQTY: {decimal(16, 6)}
     * @param receivedqtyList The collection of receivedqty as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivedqty_NotInScope(Collection<java.math.BigDecimal> receivedqtyList) {
        doSetReceivedqty_NotInScope(receivedqtyList);
    }

    protected void doSetReceivedqty_NotInScope(Collection<java.math.BigDecimal> receivedqtyList) {
        regINS(CK_NINS, cTL(receivedqtyList), xgetCValueReceivedqty(), "RECEIVEDQTY");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RECEIVEDQTY: {decimal(16, 6)}
     */
    public void setReceivedqty_IsNull() { regReceivedqty(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RECEIVEDQTY: {decimal(16, 6)}
     */
    public void setReceivedqty_IsNotNull() { regReceivedqty(CK_ISNN, DOBJ); }

    protected void regReceivedqty(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReceivedqty(), "RECEIVEDQTY"); }
    protected abstract ConditionValue xgetCValueReceivedqty();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DISTRIBUTIONCD: {varchar(30)}
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
     * DISTRIBUTIONCD: {varchar(30)}
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
     * DISTRIBUTIONCD: {varchar(30)}
     * @param distributioncd The value of distributioncd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistributioncd_GreaterThan(String distributioncd) {
        regDistributioncd(CK_GT, fRES(distributioncd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DISTRIBUTIONCD: {varchar(30)}
     * @param distributioncd The value of distributioncd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistributioncd_LessThan(String distributioncd) {
        regDistributioncd(CK_LT, fRES(distributioncd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DISTRIBUTIONCD: {varchar(30)}
     * @param distributioncd The value of distributioncd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistributioncd_GreaterEqual(String distributioncd) {
        regDistributioncd(CK_GE, fRES(distributioncd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DISTRIBUTIONCD: {varchar(30)}
     * @param distributioncd The value of distributioncd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistributioncd_LessEqual(String distributioncd) {
        regDistributioncd(CK_LE, fRES(distributioncd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DISTRIBUTIONCD: {varchar(30)}
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
     * DISTRIBUTIONCD: {varchar(30)}
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
     * DISTRIBUTIONCD: {varchar(30)} <br>
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
     * DISTRIBUTIONCD: {varchar(30)}
     * @param distributioncd The value of distributioncd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDistributioncd_NotLikeSearch(String distributioncd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(distributioncd), xgetCValueDistributioncd(), "DISTRIBUTIONCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DISTRIBUTIONCD: {varchar(30)}
     * @param distributioncd The value of distributioncd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistributioncd_PrefixSearch(String distributioncd) {
        setDistributioncd_LikeSearch(distributioncd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DISTRIBUTIONCD: {varchar(30)}
     */
    public void setDistributioncd_IsNull() { regDistributioncd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DISTRIBUTIONCD: {varchar(30)}
     */
    public void setDistributioncd_IsNullOrEmpty() { regDistributioncd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DISTRIBUTIONCD: {varchar(30)}
     */
    public void setDistributioncd_IsNotNull() { regDistributioncd(CK_ISNN, DOBJ); }

    protected void regDistributioncd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDistributioncd(), "DISTRIBUTIONCD"); }
    protected abstract ConditionValue xgetCValueDistributioncd();

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
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * RCV_PALLET_ID: {bigint(19)}
     * @param rcvPalletId The value of rcvPalletId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvPalletId_Equal(Long rcvPalletId) {
        doSetRcvPalletId_Equal(rcvPalletId);
    }

    protected void doSetRcvPalletId_Equal(Long rcvPalletId) {
        regRcvPalletId(CK_EQ, rcvPalletId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RCV_PALLET_ID: {bigint(19)}
     * @param rcvPalletId The value of rcvPalletId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvPalletId_NotEqual(Long rcvPalletId) {
        doSetRcvPalletId_NotEqual(rcvPalletId);
    }

    protected void doSetRcvPalletId_NotEqual(Long rcvPalletId) {
        regRcvPalletId(CK_NES, rcvPalletId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RCV_PALLET_ID: {bigint(19)}
     * @param rcvPalletId The value of rcvPalletId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvPalletId_GreaterThan(Long rcvPalletId) {
        regRcvPalletId(CK_GT, rcvPalletId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RCV_PALLET_ID: {bigint(19)}
     * @param rcvPalletId The value of rcvPalletId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvPalletId_LessThan(Long rcvPalletId) {
        regRcvPalletId(CK_LT, rcvPalletId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RCV_PALLET_ID: {bigint(19)}
     * @param rcvPalletId The value of rcvPalletId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvPalletId_GreaterEqual(Long rcvPalletId) {
        regRcvPalletId(CK_GE, rcvPalletId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RCV_PALLET_ID: {bigint(19)}
     * @param rcvPalletId The value of rcvPalletId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvPalletId_LessEqual(Long rcvPalletId) {
        regRcvPalletId(CK_LE, rcvPalletId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * RCV_PALLET_ID: {bigint(19)}
     * @param minNumber The min number of rcvPalletId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of rcvPalletId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setRcvPalletId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueRcvPalletId(), "RCV_PALLET_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RCV_PALLET_ID: {bigint(19)}
     * @param rcvPalletIdList The collection of rcvPalletId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvPalletId_InScope(Collection<Long> rcvPalletIdList) {
        doSetRcvPalletId_InScope(rcvPalletIdList);
    }

    protected void doSetRcvPalletId_InScope(Collection<Long> rcvPalletIdList) {
        regINS(CK_INS, cTL(rcvPalletIdList), xgetCValueRcvPalletId(), "RCV_PALLET_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RCV_PALLET_ID: {bigint(19)}
     * @param rcvPalletIdList The collection of rcvPalletId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvPalletId_NotInScope(Collection<Long> rcvPalletIdList) {
        doSetRcvPalletId_NotInScope(rcvPalletIdList);
    }

    protected void doSetRcvPalletId_NotInScope(Collection<Long> rcvPalletIdList) {
        regINS(CK_NINS, cTL(rcvPalletIdList), xgetCValueRcvPalletId(), "RCV_PALLET_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RCV_PALLET_ID: {bigint(19)}
     */
    public void setRcvPalletId_IsNull() { regRcvPalletId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RCV_PALLET_ID: {bigint(19)}
     */
    public void setRcvPalletId_IsNotNull() { regRcvPalletId(CK_ISNN, DOBJ); }

    protected void regRcvPalletId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRcvPalletId(), "RCV_PALLET_ID"); }
    protected abstract ConditionValue xgetCValueRcvPalletId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOLFACTORYCD: {IX+, varchar(30)}
     * @param symbolfactorycd The value of symbolfactorycd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolfactorycd_Equal(String symbolfactorycd) {
        doSetSymbolfactorycd_Equal(fRES(symbolfactorycd));
    }

    protected void doSetSymbolfactorycd_Equal(String symbolfactorycd) {
        regSymbolfactorycd(CK_EQ, symbolfactorycd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOLFACTORYCD: {IX+, varchar(30)}
     * @param symbolfactorycd The value of symbolfactorycd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolfactorycd_NotEqual(String symbolfactorycd) {
        doSetSymbolfactorycd_NotEqual(fRES(symbolfactorycd));
    }

    protected void doSetSymbolfactorycd_NotEqual(String symbolfactorycd) {
        regSymbolfactorycd(CK_NES, symbolfactorycd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOLFACTORYCD: {IX+, varchar(30)}
     * @param symbolfactorycd The value of symbolfactorycd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolfactorycd_GreaterThan(String symbolfactorycd) {
        regSymbolfactorycd(CK_GT, fRES(symbolfactorycd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOLFACTORYCD: {IX+, varchar(30)}
     * @param symbolfactorycd The value of symbolfactorycd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolfactorycd_LessThan(String symbolfactorycd) {
        regSymbolfactorycd(CK_LT, fRES(symbolfactorycd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOLFACTORYCD: {IX+, varchar(30)}
     * @param symbolfactorycd The value of symbolfactorycd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolfactorycd_GreaterEqual(String symbolfactorycd) {
        regSymbolfactorycd(CK_GE, fRES(symbolfactorycd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOLFACTORYCD: {IX+, varchar(30)}
     * @param symbolfactorycd The value of symbolfactorycd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolfactorycd_LessEqual(String symbolfactorycd) {
        regSymbolfactorycd(CK_LE, fRES(symbolfactorycd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SYMBOLFACTORYCD: {IX+, varchar(30)}
     * @param symbolfactorycdList The collection of symbolfactorycd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolfactorycd_InScope(Collection<String> symbolfactorycdList) {
        doSetSymbolfactorycd_InScope(symbolfactorycdList);
    }

    protected void doSetSymbolfactorycd_InScope(Collection<String> symbolfactorycdList) {
        regINS(CK_INS, cTL(symbolfactorycdList), xgetCValueSymbolfactorycd(), "SYMBOLFACTORYCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SYMBOLFACTORYCD: {IX+, varchar(30)}
     * @param symbolfactorycdList The collection of symbolfactorycd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolfactorycd_NotInScope(Collection<String> symbolfactorycdList) {
        doSetSymbolfactorycd_NotInScope(symbolfactorycdList);
    }

    protected void doSetSymbolfactorycd_NotInScope(Collection<String> symbolfactorycdList) {
        regINS(CK_NINS, cTL(symbolfactorycdList), xgetCValueSymbolfactorycd(), "SYMBOLFACTORYCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SYMBOLFACTORYCD: {IX+, varchar(30)} <br>
     * <pre>e.g. setSymbolfactorycd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param symbolfactorycd The value of symbolfactorycd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSymbolfactorycd_LikeSearch(String symbolfactorycd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(symbolfactorycd), xgetCValueSymbolfactorycd(), "SYMBOLFACTORYCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SYMBOLFACTORYCD: {IX+, varchar(30)}
     * @param symbolfactorycd The value of symbolfactorycd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSymbolfactorycd_NotLikeSearch(String symbolfactorycd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(symbolfactorycd), xgetCValueSymbolfactorycd(), "SYMBOLFACTORYCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SYMBOLFACTORYCD: {IX+, varchar(30)}
     * @param symbolfactorycd The value of symbolfactorycd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolfactorycd_PrefixSearch(String symbolfactorycd) {
        setSymbolfactorycd_LikeSearch(symbolfactorycd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SYMBOLFACTORYCD: {IX+, varchar(30)}
     */
    public void setSymbolfactorycd_IsNull() { regSymbolfactorycd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SYMBOLFACTORYCD: {IX+, varchar(30)}
     */
    public void setSymbolfactorycd_IsNullOrEmpty() { regSymbolfactorycd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SYMBOLFACTORYCD: {IX+, varchar(30)}
     */
    public void setSymbolfactorycd_IsNotNull() { regSymbolfactorycd(CK_ISNN, DOBJ); }

    protected void regSymbolfactorycd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSymbolfactorycd(), "SYMBOLFACTORYCD"); }
    protected abstract ConditionValue xgetCValueSymbolfactorycd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOLITEMCD: {varchar(30)}
     * @param symbolitemcd The value of symbolitemcd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolitemcd_Equal(String symbolitemcd) {
        doSetSymbolitemcd_Equal(fRES(symbolitemcd));
    }

    protected void doSetSymbolitemcd_Equal(String symbolitemcd) {
        regSymbolitemcd(CK_EQ, symbolitemcd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOLITEMCD: {varchar(30)}
     * @param symbolitemcd The value of symbolitemcd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolitemcd_NotEqual(String symbolitemcd) {
        doSetSymbolitemcd_NotEqual(fRES(symbolitemcd));
    }

    protected void doSetSymbolitemcd_NotEqual(String symbolitemcd) {
        regSymbolitemcd(CK_NES, symbolitemcd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOLITEMCD: {varchar(30)}
     * @param symbolitemcd The value of symbolitemcd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolitemcd_GreaterThan(String symbolitemcd) {
        regSymbolitemcd(CK_GT, fRES(symbolitemcd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOLITEMCD: {varchar(30)}
     * @param symbolitemcd The value of symbolitemcd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolitemcd_LessThan(String symbolitemcd) {
        regSymbolitemcd(CK_LT, fRES(symbolitemcd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOLITEMCD: {varchar(30)}
     * @param symbolitemcd The value of symbolitemcd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolitemcd_GreaterEqual(String symbolitemcd) {
        regSymbolitemcd(CK_GE, fRES(symbolitemcd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOLITEMCD: {varchar(30)}
     * @param symbolitemcd The value of symbolitemcd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolitemcd_LessEqual(String symbolitemcd) {
        regSymbolitemcd(CK_LE, fRES(symbolitemcd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SYMBOLITEMCD: {varchar(30)}
     * @param symbolitemcdList The collection of symbolitemcd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolitemcd_InScope(Collection<String> symbolitemcdList) {
        doSetSymbolitemcd_InScope(symbolitemcdList);
    }

    protected void doSetSymbolitemcd_InScope(Collection<String> symbolitemcdList) {
        regINS(CK_INS, cTL(symbolitemcdList), xgetCValueSymbolitemcd(), "SYMBOLITEMCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SYMBOLITEMCD: {varchar(30)}
     * @param symbolitemcdList The collection of symbolitemcd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolitemcd_NotInScope(Collection<String> symbolitemcdList) {
        doSetSymbolitemcd_NotInScope(symbolitemcdList);
    }

    protected void doSetSymbolitemcd_NotInScope(Collection<String> symbolitemcdList) {
        regINS(CK_NINS, cTL(symbolitemcdList), xgetCValueSymbolitemcd(), "SYMBOLITEMCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SYMBOLITEMCD: {varchar(30)} <br>
     * <pre>e.g. setSymbolitemcd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param symbolitemcd The value of symbolitemcd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSymbolitemcd_LikeSearch(String symbolitemcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(symbolitemcd), xgetCValueSymbolitemcd(), "SYMBOLITEMCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SYMBOLITEMCD: {varchar(30)}
     * @param symbolitemcd The value of symbolitemcd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSymbolitemcd_NotLikeSearch(String symbolitemcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(symbolitemcd), xgetCValueSymbolitemcd(), "SYMBOLITEMCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SYMBOLITEMCD: {varchar(30)}
     * @param symbolitemcd The value of symbolitemcd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolitemcd_PrefixSearch(String symbolitemcd) {
        setSymbolitemcd_LikeSearch(symbolitemcd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SYMBOLITEMCD: {varchar(30)}
     */
    public void setSymbolitemcd_IsNull() { regSymbolitemcd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SYMBOLITEMCD: {varchar(30)}
     */
    public void setSymbolitemcd_IsNullOrEmpty() { regSymbolitemcd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SYMBOLITEMCD: {varchar(30)}
     */
    public void setSymbolitemcd_IsNotNull() { regSymbolitemcd(CK_ISNN, DOBJ); }

    protected void regSymbolitemcd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSymbolitemcd(), "SYMBOLITEMCD"); }
    protected abstract ConditionValue xgetCValueSymbolitemcd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOLSKU: {varchar(30)}
     * @param symbolsku The value of symbolsku as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolsku_Equal(String symbolsku) {
        doSetSymbolsku_Equal(fRES(symbolsku));
    }

    protected void doSetSymbolsku_Equal(String symbolsku) {
        regSymbolsku(CK_EQ, symbolsku);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOLSKU: {varchar(30)}
     * @param symbolsku The value of symbolsku as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolsku_NotEqual(String symbolsku) {
        doSetSymbolsku_NotEqual(fRES(symbolsku));
    }

    protected void doSetSymbolsku_NotEqual(String symbolsku) {
        regSymbolsku(CK_NES, symbolsku);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOLSKU: {varchar(30)}
     * @param symbolsku The value of symbolsku as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolsku_GreaterThan(String symbolsku) {
        regSymbolsku(CK_GT, fRES(symbolsku));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOLSKU: {varchar(30)}
     * @param symbolsku The value of symbolsku as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolsku_LessThan(String symbolsku) {
        regSymbolsku(CK_LT, fRES(symbolsku));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOLSKU: {varchar(30)}
     * @param symbolsku The value of symbolsku as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolsku_GreaterEqual(String symbolsku) {
        regSymbolsku(CK_GE, fRES(symbolsku));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOLSKU: {varchar(30)}
     * @param symbolsku The value of symbolsku as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolsku_LessEqual(String symbolsku) {
        regSymbolsku(CK_LE, fRES(symbolsku));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SYMBOLSKU: {varchar(30)}
     * @param symbolskuList The collection of symbolsku as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolsku_InScope(Collection<String> symbolskuList) {
        doSetSymbolsku_InScope(symbolskuList);
    }

    protected void doSetSymbolsku_InScope(Collection<String> symbolskuList) {
        regINS(CK_INS, cTL(symbolskuList), xgetCValueSymbolsku(), "SYMBOLSKU");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SYMBOLSKU: {varchar(30)}
     * @param symbolskuList The collection of symbolsku as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolsku_NotInScope(Collection<String> symbolskuList) {
        doSetSymbolsku_NotInScope(symbolskuList);
    }

    protected void doSetSymbolsku_NotInScope(Collection<String> symbolskuList) {
        regINS(CK_NINS, cTL(symbolskuList), xgetCValueSymbolsku(), "SYMBOLSKU");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SYMBOLSKU: {varchar(30)} <br>
     * <pre>e.g. setSymbolsku_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param symbolsku The value of symbolsku as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSymbolsku_LikeSearch(String symbolsku, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(symbolsku), xgetCValueSymbolsku(), "SYMBOLSKU", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SYMBOLSKU: {varchar(30)}
     * @param symbolsku The value of symbolsku as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSymbolsku_NotLikeSearch(String symbolsku, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(symbolsku), xgetCValueSymbolsku(), "SYMBOLSKU", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SYMBOLSKU: {varchar(30)}
     * @param symbolsku The value of symbolsku as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolsku_PrefixSearch(String symbolsku) {
        setSymbolsku_LikeSearch(symbolsku, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SYMBOLSKU: {varchar(30)}
     */
    public void setSymbolsku_IsNull() { regSymbolsku(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SYMBOLSKU: {varchar(30)}
     */
    public void setSymbolsku_IsNullOrEmpty() { regSymbolsku(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SYMBOLSKU: {varchar(30)}
     */
    public void setSymbolsku_IsNotNull() { regSymbolsku(CK_ISNN, DOBJ); }

    protected void regSymbolsku(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSymbolsku(), "SYMBOLSKU"); }
    protected abstract ConditionValue xgetCValueSymbolsku();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOLRECEIVECD: {varchar(30)}
     * @param symbolreceivecd The value of symbolreceivecd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolreceivecd_Equal(String symbolreceivecd) {
        doSetSymbolreceivecd_Equal(fRES(symbolreceivecd));
    }

    protected void doSetSymbolreceivecd_Equal(String symbolreceivecd) {
        regSymbolreceivecd(CK_EQ, symbolreceivecd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOLRECEIVECD: {varchar(30)}
     * @param symbolreceivecd The value of symbolreceivecd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolreceivecd_NotEqual(String symbolreceivecd) {
        doSetSymbolreceivecd_NotEqual(fRES(symbolreceivecd));
    }

    protected void doSetSymbolreceivecd_NotEqual(String symbolreceivecd) {
        regSymbolreceivecd(CK_NES, symbolreceivecd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOLRECEIVECD: {varchar(30)}
     * @param symbolreceivecd The value of symbolreceivecd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolreceivecd_GreaterThan(String symbolreceivecd) {
        regSymbolreceivecd(CK_GT, fRES(symbolreceivecd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOLRECEIVECD: {varchar(30)}
     * @param symbolreceivecd The value of symbolreceivecd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolreceivecd_LessThan(String symbolreceivecd) {
        regSymbolreceivecd(CK_LT, fRES(symbolreceivecd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOLRECEIVECD: {varchar(30)}
     * @param symbolreceivecd The value of symbolreceivecd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolreceivecd_GreaterEqual(String symbolreceivecd) {
        regSymbolreceivecd(CK_GE, fRES(symbolreceivecd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOLRECEIVECD: {varchar(30)}
     * @param symbolreceivecd The value of symbolreceivecd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolreceivecd_LessEqual(String symbolreceivecd) {
        regSymbolreceivecd(CK_LE, fRES(symbolreceivecd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SYMBOLRECEIVECD: {varchar(30)}
     * @param symbolreceivecdList The collection of symbolreceivecd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolreceivecd_InScope(Collection<String> symbolreceivecdList) {
        doSetSymbolreceivecd_InScope(symbolreceivecdList);
    }

    protected void doSetSymbolreceivecd_InScope(Collection<String> symbolreceivecdList) {
        regINS(CK_INS, cTL(symbolreceivecdList), xgetCValueSymbolreceivecd(), "SYMBOLRECEIVECD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SYMBOLRECEIVECD: {varchar(30)}
     * @param symbolreceivecdList The collection of symbolreceivecd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolreceivecd_NotInScope(Collection<String> symbolreceivecdList) {
        doSetSymbolreceivecd_NotInScope(symbolreceivecdList);
    }

    protected void doSetSymbolreceivecd_NotInScope(Collection<String> symbolreceivecdList) {
        regINS(CK_NINS, cTL(symbolreceivecdList), xgetCValueSymbolreceivecd(), "SYMBOLRECEIVECD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SYMBOLRECEIVECD: {varchar(30)} <br>
     * <pre>e.g. setSymbolreceivecd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param symbolreceivecd The value of symbolreceivecd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSymbolreceivecd_LikeSearch(String symbolreceivecd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(symbolreceivecd), xgetCValueSymbolreceivecd(), "SYMBOLRECEIVECD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SYMBOLRECEIVECD: {varchar(30)}
     * @param symbolreceivecd The value of symbolreceivecd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSymbolreceivecd_NotLikeSearch(String symbolreceivecd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(symbolreceivecd), xgetCValueSymbolreceivecd(), "SYMBOLRECEIVECD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SYMBOLRECEIVECD: {varchar(30)}
     * @param symbolreceivecd The value of symbolreceivecd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolreceivecd_PrefixSearch(String symbolreceivecd) {
        setSymbolreceivecd_LikeSearch(symbolreceivecd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SYMBOLRECEIVECD: {varchar(30)}
     */
    public void setSymbolreceivecd_IsNull() { regSymbolreceivecd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SYMBOLRECEIVECD: {varchar(30)}
     */
    public void setSymbolreceivecd_IsNullOrEmpty() { regSymbolreceivecd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SYMBOLRECEIVECD: {varchar(30)}
     */
    public void setSymbolreceivecd_IsNotNull() { regSymbolreceivecd(CK_ISNN, DOBJ); }

    protected void regSymbolreceivecd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSymbolreceivecd(), "SYMBOLRECEIVECD"); }
    protected abstract ConditionValue xgetCValueSymbolreceivecd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOLPRODUCTMARK: {varchar(30)}
     * @param symbolproductmark The value of symbolproductmark as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolproductmark_Equal(String symbolproductmark) {
        doSetSymbolproductmark_Equal(fRES(symbolproductmark));
    }

    protected void doSetSymbolproductmark_Equal(String symbolproductmark) {
        regSymbolproductmark(CK_EQ, symbolproductmark);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOLPRODUCTMARK: {varchar(30)}
     * @param symbolproductmark The value of symbolproductmark as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolproductmark_NotEqual(String symbolproductmark) {
        doSetSymbolproductmark_NotEqual(fRES(symbolproductmark));
    }

    protected void doSetSymbolproductmark_NotEqual(String symbolproductmark) {
        regSymbolproductmark(CK_NES, symbolproductmark);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOLPRODUCTMARK: {varchar(30)}
     * @param symbolproductmark The value of symbolproductmark as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolproductmark_GreaterThan(String symbolproductmark) {
        regSymbolproductmark(CK_GT, fRES(symbolproductmark));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOLPRODUCTMARK: {varchar(30)}
     * @param symbolproductmark The value of symbolproductmark as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolproductmark_LessThan(String symbolproductmark) {
        regSymbolproductmark(CK_LT, fRES(symbolproductmark));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOLPRODUCTMARK: {varchar(30)}
     * @param symbolproductmark The value of symbolproductmark as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolproductmark_GreaterEqual(String symbolproductmark) {
        regSymbolproductmark(CK_GE, fRES(symbolproductmark));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOLPRODUCTMARK: {varchar(30)}
     * @param symbolproductmark The value of symbolproductmark as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolproductmark_LessEqual(String symbolproductmark) {
        regSymbolproductmark(CK_LE, fRES(symbolproductmark));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SYMBOLPRODUCTMARK: {varchar(30)}
     * @param symbolproductmarkList The collection of symbolproductmark as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolproductmark_InScope(Collection<String> symbolproductmarkList) {
        doSetSymbolproductmark_InScope(symbolproductmarkList);
    }

    protected void doSetSymbolproductmark_InScope(Collection<String> symbolproductmarkList) {
        regINS(CK_INS, cTL(symbolproductmarkList), xgetCValueSymbolproductmark(), "SYMBOLPRODUCTMARK");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SYMBOLPRODUCTMARK: {varchar(30)}
     * @param symbolproductmarkList The collection of symbolproductmark as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolproductmark_NotInScope(Collection<String> symbolproductmarkList) {
        doSetSymbolproductmark_NotInScope(symbolproductmarkList);
    }

    protected void doSetSymbolproductmark_NotInScope(Collection<String> symbolproductmarkList) {
        regINS(CK_NINS, cTL(symbolproductmarkList), xgetCValueSymbolproductmark(), "SYMBOLPRODUCTMARK");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SYMBOLPRODUCTMARK: {varchar(30)} <br>
     * <pre>e.g. setSymbolproductmark_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param symbolproductmark The value of symbolproductmark as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSymbolproductmark_LikeSearch(String symbolproductmark, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(symbolproductmark), xgetCValueSymbolproductmark(), "SYMBOLPRODUCTMARK", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SYMBOLPRODUCTMARK: {varchar(30)}
     * @param symbolproductmark The value of symbolproductmark as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSymbolproductmark_NotLikeSearch(String symbolproductmark, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(symbolproductmark), xgetCValueSymbolproductmark(), "SYMBOLPRODUCTMARK", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SYMBOLPRODUCTMARK: {varchar(30)}
     * @param symbolproductmark The value of symbolproductmark as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolproductmark_PrefixSearch(String symbolproductmark) {
        setSymbolproductmark_LikeSearch(symbolproductmark, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SYMBOLPRODUCTMARK: {varchar(30)}
     */
    public void setSymbolproductmark_IsNull() { regSymbolproductmark(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SYMBOLPRODUCTMARK: {varchar(30)}
     */
    public void setSymbolproductmark_IsNullOrEmpty() { regSymbolproductmark(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SYMBOLPRODUCTMARK: {varchar(30)}
     */
    public void setSymbolproductmark_IsNotNull() { regSymbolproductmark(CK_ISNN, DOBJ); }

    protected void regSymbolproductmark(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSymbolproductmark(), "SYMBOLPRODUCTMARK"); }
    protected abstract ConditionValue xgetCValueSymbolproductmark();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOLORDERNO: {varchar(30)}
     * @param symbolorderno The value of symbolorderno as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolorderno_Equal(String symbolorderno) {
        doSetSymbolorderno_Equal(fRES(symbolorderno));
    }

    protected void doSetSymbolorderno_Equal(String symbolorderno) {
        regSymbolorderno(CK_EQ, symbolorderno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOLORDERNO: {varchar(30)}
     * @param symbolorderno The value of symbolorderno as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolorderno_NotEqual(String symbolorderno) {
        doSetSymbolorderno_NotEqual(fRES(symbolorderno));
    }

    protected void doSetSymbolorderno_NotEqual(String symbolorderno) {
        regSymbolorderno(CK_NES, symbolorderno);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOLORDERNO: {varchar(30)}
     * @param symbolorderno The value of symbolorderno as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolorderno_GreaterThan(String symbolorderno) {
        regSymbolorderno(CK_GT, fRES(symbolorderno));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOLORDERNO: {varchar(30)}
     * @param symbolorderno The value of symbolorderno as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolorderno_LessThan(String symbolorderno) {
        regSymbolorderno(CK_LT, fRES(symbolorderno));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOLORDERNO: {varchar(30)}
     * @param symbolorderno The value of symbolorderno as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolorderno_GreaterEqual(String symbolorderno) {
        regSymbolorderno(CK_GE, fRES(symbolorderno));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOLORDERNO: {varchar(30)}
     * @param symbolorderno The value of symbolorderno as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolorderno_LessEqual(String symbolorderno) {
        regSymbolorderno(CK_LE, fRES(symbolorderno));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SYMBOLORDERNO: {varchar(30)}
     * @param symbolordernoList The collection of symbolorderno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolorderno_InScope(Collection<String> symbolordernoList) {
        doSetSymbolorderno_InScope(symbolordernoList);
    }

    protected void doSetSymbolorderno_InScope(Collection<String> symbolordernoList) {
        regINS(CK_INS, cTL(symbolordernoList), xgetCValueSymbolorderno(), "SYMBOLORDERNO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SYMBOLORDERNO: {varchar(30)}
     * @param symbolordernoList The collection of symbolorderno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolorderno_NotInScope(Collection<String> symbolordernoList) {
        doSetSymbolorderno_NotInScope(symbolordernoList);
    }

    protected void doSetSymbolorderno_NotInScope(Collection<String> symbolordernoList) {
        regINS(CK_NINS, cTL(symbolordernoList), xgetCValueSymbolorderno(), "SYMBOLORDERNO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SYMBOLORDERNO: {varchar(30)} <br>
     * <pre>e.g. setSymbolorderno_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param symbolorderno The value of symbolorderno as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSymbolorderno_LikeSearch(String symbolorderno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(symbolorderno), xgetCValueSymbolorderno(), "SYMBOLORDERNO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SYMBOLORDERNO: {varchar(30)}
     * @param symbolorderno The value of symbolorderno as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSymbolorderno_NotLikeSearch(String symbolorderno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(symbolorderno), xgetCValueSymbolorderno(), "SYMBOLORDERNO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SYMBOLORDERNO: {varchar(30)}
     * @param symbolorderno The value of symbolorderno as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolorderno_PrefixSearch(String symbolorderno) {
        setSymbolorderno_LikeSearch(symbolorderno, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SYMBOLORDERNO: {varchar(30)}
     */
    public void setSymbolorderno_IsNull() { regSymbolorderno(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SYMBOLORDERNO: {varchar(30)}
     */
    public void setSymbolorderno_IsNullOrEmpty() { regSymbolorderno(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SYMBOLORDERNO: {varchar(30)}
     */
    public void setSymbolorderno_IsNotNull() { regSymbolorderno(CK_ISNN, DOBJ); }

    protected void regSymbolorderno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSymbolorderno(), "SYMBOLORDERNO"); }
    protected abstract ConditionValue xgetCValueSymbolorderno();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOLPRINTERNO: {varchar(30)}
     * @param symbolprinterno The value of symbolprinterno as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolprinterno_Equal(String symbolprinterno) {
        doSetSymbolprinterno_Equal(fRES(symbolprinterno));
    }

    protected void doSetSymbolprinterno_Equal(String symbolprinterno) {
        regSymbolprinterno(CK_EQ, symbolprinterno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOLPRINTERNO: {varchar(30)}
     * @param symbolprinterno The value of symbolprinterno as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolprinterno_NotEqual(String symbolprinterno) {
        doSetSymbolprinterno_NotEqual(fRES(symbolprinterno));
    }

    protected void doSetSymbolprinterno_NotEqual(String symbolprinterno) {
        regSymbolprinterno(CK_NES, symbolprinterno);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOLPRINTERNO: {varchar(30)}
     * @param symbolprinterno The value of symbolprinterno as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolprinterno_GreaterThan(String symbolprinterno) {
        regSymbolprinterno(CK_GT, fRES(symbolprinterno));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOLPRINTERNO: {varchar(30)}
     * @param symbolprinterno The value of symbolprinterno as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolprinterno_LessThan(String symbolprinterno) {
        regSymbolprinterno(CK_LT, fRES(symbolprinterno));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOLPRINTERNO: {varchar(30)}
     * @param symbolprinterno The value of symbolprinterno as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolprinterno_GreaterEqual(String symbolprinterno) {
        regSymbolprinterno(CK_GE, fRES(symbolprinterno));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOLPRINTERNO: {varchar(30)}
     * @param symbolprinterno The value of symbolprinterno as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolprinterno_LessEqual(String symbolprinterno) {
        regSymbolprinterno(CK_LE, fRES(symbolprinterno));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SYMBOLPRINTERNO: {varchar(30)}
     * @param symbolprinternoList The collection of symbolprinterno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolprinterno_InScope(Collection<String> symbolprinternoList) {
        doSetSymbolprinterno_InScope(symbolprinternoList);
    }

    protected void doSetSymbolprinterno_InScope(Collection<String> symbolprinternoList) {
        regINS(CK_INS, cTL(symbolprinternoList), xgetCValueSymbolprinterno(), "SYMBOLPRINTERNO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SYMBOLPRINTERNO: {varchar(30)}
     * @param symbolprinternoList The collection of symbolprinterno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolprinterno_NotInScope(Collection<String> symbolprinternoList) {
        doSetSymbolprinterno_NotInScope(symbolprinternoList);
    }

    protected void doSetSymbolprinterno_NotInScope(Collection<String> symbolprinternoList) {
        regINS(CK_NINS, cTL(symbolprinternoList), xgetCValueSymbolprinterno(), "SYMBOLPRINTERNO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SYMBOLPRINTERNO: {varchar(30)} <br>
     * <pre>e.g. setSymbolprinterno_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param symbolprinterno The value of symbolprinterno as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSymbolprinterno_LikeSearch(String symbolprinterno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(symbolprinterno), xgetCValueSymbolprinterno(), "SYMBOLPRINTERNO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SYMBOLPRINTERNO: {varchar(30)}
     * @param symbolprinterno The value of symbolprinterno as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSymbolprinterno_NotLikeSearch(String symbolprinterno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(symbolprinterno), xgetCValueSymbolprinterno(), "SYMBOLPRINTERNO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SYMBOLPRINTERNO: {varchar(30)}
     * @param symbolprinterno The value of symbolprinterno as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolprinterno_PrefixSearch(String symbolprinterno) {
        setSymbolprinterno_LikeSearch(symbolprinterno, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SYMBOLPRINTERNO: {varchar(30)}
     */
    public void setSymbolprinterno_IsNull() { regSymbolprinterno(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SYMBOLPRINTERNO: {varchar(30)}
     */
    public void setSymbolprinterno_IsNullOrEmpty() { regSymbolprinterno(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SYMBOLPRINTERNO: {varchar(30)}
     */
    public void setSymbolprinterno_IsNotNull() { regSymbolprinterno(CK_ISNN, DOBJ); }

    protected void regSymbolprinterno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSymbolprinterno(), "SYMBOLPRINTERNO"); }
    protected abstract ConditionValue xgetCValueSymbolprinterno();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOLMAKENO: {varchar(30)}
     * @param symbolmakeno The value of symbolmakeno as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolmakeno_Equal(String symbolmakeno) {
        doSetSymbolmakeno_Equal(fRES(symbolmakeno));
    }

    protected void doSetSymbolmakeno_Equal(String symbolmakeno) {
        regSymbolmakeno(CK_EQ, symbolmakeno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOLMAKENO: {varchar(30)}
     * @param symbolmakeno The value of symbolmakeno as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolmakeno_NotEqual(String symbolmakeno) {
        doSetSymbolmakeno_NotEqual(fRES(symbolmakeno));
    }

    protected void doSetSymbolmakeno_NotEqual(String symbolmakeno) {
        regSymbolmakeno(CK_NES, symbolmakeno);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOLMAKENO: {varchar(30)}
     * @param symbolmakeno The value of symbolmakeno as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolmakeno_GreaterThan(String symbolmakeno) {
        regSymbolmakeno(CK_GT, fRES(symbolmakeno));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOLMAKENO: {varchar(30)}
     * @param symbolmakeno The value of symbolmakeno as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolmakeno_LessThan(String symbolmakeno) {
        regSymbolmakeno(CK_LT, fRES(symbolmakeno));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOLMAKENO: {varchar(30)}
     * @param symbolmakeno The value of symbolmakeno as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolmakeno_GreaterEqual(String symbolmakeno) {
        regSymbolmakeno(CK_GE, fRES(symbolmakeno));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOLMAKENO: {varchar(30)}
     * @param symbolmakeno The value of symbolmakeno as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolmakeno_LessEqual(String symbolmakeno) {
        regSymbolmakeno(CK_LE, fRES(symbolmakeno));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SYMBOLMAKENO: {varchar(30)}
     * @param symbolmakenoList The collection of symbolmakeno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolmakeno_InScope(Collection<String> symbolmakenoList) {
        doSetSymbolmakeno_InScope(symbolmakenoList);
    }

    protected void doSetSymbolmakeno_InScope(Collection<String> symbolmakenoList) {
        regINS(CK_INS, cTL(symbolmakenoList), xgetCValueSymbolmakeno(), "SYMBOLMAKENO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SYMBOLMAKENO: {varchar(30)}
     * @param symbolmakenoList The collection of symbolmakeno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolmakeno_NotInScope(Collection<String> symbolmakenoList) {
        doSetSymbolmakeno_NotInScope(symbolmakenoList);
    }

    protected void doSetSymbolmakeno_NotInScope(Collection<String> symbolmakenoList) {
        regINS(CK_NINS, cTL(symbolmakenoList), xgetCValueSymbolmakeno(), "SYMBOLMAKENO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SYMBOLMAKENO: {varchar(30)} <br>
     * <pre>e.g. setSymbolmakeno_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param symbolmakeno The value of symbolmakeno as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSymbolmakeno_LikeSearch(String symbolmakeno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(symbolmakeno), xgetCValueSymbolmakeno(), "SYMBOLMAKENO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SYMBOLMAKENO: {varchar(30)}
     * @param symbolmakeno The value of symbolmakeno as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSymbolmakeno_NotLikeSearch(String symbolmakeno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(symbolmakeno), xgetCValueSymbolmakeno(), "SYMBOLMAKENO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SYMBOLMAKENO: {varchar(30)}
     * @param symbolmakeno The value of symbolmakeno as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolmakeno_PrefixSearch(String symbolmakeno) {
        setSymbolmakeno_LikeSearch(symbolmakeno, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SYMBOLMAKENO: {varchar(30)}
     */
    public void setSymbolmakeno_IsNull() { regSymbolmakeno(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SYMBOLMAKENO: {varchar(30)}
     */
    public void setSymbolmakeno_IsNullOrEmpty() { regSymbolmakeno(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SYMBOLMAKENO: {varchar(30)}
     */
    public void setSymbolmakeno_IsNotNull() { regSymbolmakeno(CK_ISNN, DOBJ); }

    protected void regSymbolmakeno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSymbolmakeno(), "SYMBOLMAKENO"); }
    protected abstract ConditionValue xgetCValueSymbolmakeno();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOLLOT4: {varchar(30)}
     * @param symbollot4 The value of symbollot4 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbollot4_Equal(String symbollot4) {
        doSetSymbollot4_Equal(fRES(symbollot4));
    }

    protected void doSetSymbollot4_Equal(String symbollot4) {
        regSymbollot4(CK_EQ, symbollot4);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOLLOT4: {varchar(30)}
     * @param symbollot4 The value of symbollot4 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbollot4_NotEqual(String symbollot4) {
        doSetSymbollot4_NotEqual(fRES(symbollot4));
    }

    protected void doSetSymbollot4_NotEqual(String symbollot4) {
        regSymbollot4(CK_NES, symbollot4);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOLLOT4: {varchar(30)}
     * @param symbollot4 The value of symbollot4 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbollot4_GreaterThan(String symbollot4) {
        regSymbollot4(CK_GT, fRES(symbollot4));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOLLOT4: {varchar(30)}
     * @param symbollot4 The value of symbollot4 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbollot4_LessThan(String symbollot4) {
        regSymbollot4(CK_LT, fRES(symbollot4));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOLLOT4: {varchar(30)}
     * @param symbollot4 The value of symbollot4 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbollot4_GreaterEqual(String symbollot4) {
        regSymbollot4(CK_GE, fRES(symbollot4));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOLLOT4: {varchar(30)}
     * @param symbollot4 The value of symbollot4 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbollot4_LessEqual(String symbollot4) {
        regSymbollot4(CK_LE, fRES(symbollot4));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SYMBOLLOT4: {varchar(30)}
     * @param symbollot4List The collection of symbollot4 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbollot4_InScope(Collection<String> symbollot4List) {
        doSetSymbollot4_InScope(symbollot4List);
    }

    protected void doSetSymbollot4_InScope(Collection<String> symbollot4List) {
        regINS(CK_INS, cTL(symbollot4List), xgetCValueSymbollot4(), "SYMBOLLOT4");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SYMBOLLOT4: {varchar(30)}
     * @param symbollot4List The collection of symbollot4 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbollot4_NotInScope(Collection<String> symbollot4List) {
        doSetSymbollot4_NotInScope(symbollot4List);
    }

    protected void doSetSymbollot4_NotInScope(Collection<String> symbollot4List) {
        regINS(CK_NINS, cTL(symbollot4List), xgetCValueSymbollot4(), "SYMBOLLOT4");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SYMBOLLOT4: {varchar(30)} <br>
     * <pre>e.g. setSymbollot4_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param symbollot4 The value of symbollot4 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSymbollot4_LikeSearch(String symbollot4, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(symbollot4), xgetCValueSymbollot4(), "SYMBOLLOT4", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SYMBOLLOT4: {varchar(30)}
     * @param symbollot4 The value of symbollot4 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSymbollot4_NotLikeSearch(String symbollot4, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(symbollot4), xgetCValueSymbollot4(), "SYMBOLLOT4", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SYMBOLLOT4: {varchar(30)}
     * @param symbollot4 The value of symbollot4 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbollot4_PrefixSearch(String symbollot4) {
        setSymbollot4_LikeSearch(symbollot4, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SYMBOLLOT4: {varchar(30)}
     */
    public void setSymbollot4_IsNull() { regSymbollot4(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SYMBOLLOT4: {varchar(30)}
     */
    public void setSymbollot4_IsNullOrEmpty() { regSymbollot4(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SYMBOLLOT4: {varchar(30)}
     */
    public void setSymbollot4_IsNotNull() { regSymbollot4(CK_ISNN, DOBJ); }

    protected void regSymbollot4(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSymbollot4(), "SYMBOLLOT4"); }
    protected abstract ConditionValue xgetCValueSymbollot4();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOLMAKETIME: {varchar(30)}
     * @param symbolmaketime The value of symbolmaketime as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolmaketime_Equal(String symbolmaketime) {
        doSetSymbolmaketime_Equal(fRES(symbolmaketime));
    }

    protected void doSetSymbolmaketime_Equal(String symbolmaketime) {
        regSymbolmaketime(CK_EQ, symbolmaketime);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOLMAKETIME: {varchar(30)}
     * @param symbolmaketime The value of symbolmaketime as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolmaketime_NotEqual(String symbolmaketime) {
        doSetSymbolmaketime_NotEqual(fRES(symbolmaketime));
    }

    protected void doSetSymbolmaketime_NotEqual(String symbolmaketime) {
        regSymbolmaketime(CK_NES, symbolmaketime);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOLMAKETIME: {varchar(30)}
     * @param symbolmaketime The value of symbolmaketime as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolmaketime_GreaterThan(String symbolmaketime) {
        regSymbolmaketime(CK_GT, fRES(symbolmaketime));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOLMAKETIME: {varchar(30)}
     * @param symbolmaketime The value of symbolmaketime as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolmaketime_LessThan(String symbolmaketime) {
        regSymbolmaketime(CK_LT, fRES(symbolmaketime));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOLMAKETIME: {varchar(30)}
     * @param symbolmaketime The value of symbolmaketime as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolmaketime_GreaterEqual(String symbolmaketime) {
        regSymbolmaketime(CK_GE, fRES(symbolmaketime));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOLMAKETIME: {varchar(30)}
     * @param symbolmaketime The value of symbolmaketime as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolmaketime_LessEqual(String symbolmaketime) {
        regSymbolmaketime(CK_LE, fRES(symbolmaketime));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SYMBOLMAKETIME: {varchar(30)}
     * @param symbolmaketimeList The collection of symbolmaketime as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolmaketime_InScope(Collection<String> symbolmaketimeList) {
        doSetSymbolmaketime_InScope(symbolmaketimeList);
    }

    protected void doSetSymbolmaketime_InScope(Collection<String> symbolmaketimeList) {
        regINS(CK_INS, cTL(symbolmaketimeList), xgetCValueSymbolmaketime(), "SYMBOLMAKETIME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SYMBOLMAKETIME: {varchar(30)}
     * @param symbolmaketimeList The collection of symbolmaketime as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolmaketime_NotInScope(Collection<String> symbolmaketimeList) {
        doSetSymbolmaketime_NotInScope(symbolmaketimeList);
    }

    protected void doSetSymbolmaketime_NotInScope(Collection<String> symbolmaketimeList) {
        regINS(CK_NINS, cTL(symbolmaketimeList), xgetCValueSymbolmaketime(), "SYMBOLMAKETIME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SYMBOLMAKETIME: {varchar(30)} <br>
     * <pre>e.g. setSymbolmaketime_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param symbolmaketime The value of symbolmaketime as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSymbolmaketime_LikeSearch(String symbolmaketime, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(symbolmaketime), xgetCValueSymbolmaketime(), "SYMBOLMAKETIME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SYMBOLMAKETIME: {varchar(30)}
     * @param symbolmaketime The value of symbolmaketime as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSymbolmaketime_NotLikeSearch(String symbolmaketime, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(symbolmaketime), xgetCValueSymbolmaketime(), "SYMBOLMAKETIME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SYMBOLMAKETIME: {varchar(30)}
     * @param symbolmaketime The value of symbolmaketime as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolmaketime_PrefixSearch(String symbolmaketime) {
        setSymbolmaketime_LikeSearch(symbolmaketime, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SYMBOLMAKETIME: {varchar(30)}
     */
    public void setSymbolmaketime_IsNull() { regSymbolmaketime(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SYMBOLMAKETIME: {varchar(30)}
     */
    public void setSymbolmaketime_IsNullOrEmpty() { regSymbolmaketime(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SYMBOLMAKETIME: {varchar(30)}
     */
    public void setSymbolmaketime_IsNotNull() { regSymbolmaketime(CK_ISNN, DOBJ); }

    protected void regSymbolmaketime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSymbolmaketime(), "SYMBOLMAKETIME"); }
    protected abstract ConditionValue xgetCValueSymbolmaketime();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOLCIRCULATIONID: {varchar(30)}
     * @param symbolcirculationid The value of symbolcirculationid as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolcirculationid_Equal(String symbolcirculationid) {
        doSetSymbolcirculationid_Equal(fRES(symbolcirculationid));
    }

    protected void doSetSymbolcirculationid_Equal(String symbolcirculationid) {
        regSymbolcirculationid(CK_EQ, symbolcirculationid);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOLCIRCULATIONID: {varchar(30)}
     * @param symbolcirculationid The value of symbolcirculationid as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolcirculationid_NotEqual(String symbolcirculationid) {
        doSetSymbolcirculationid_NotEqual(fRES(symbolcirculationid));
    }

    protected void doSetSymbolcirculationid_NotEqual(String symbolcirculationid) {
        regSymbolcirculationid(CK_NES, symbolcirculationid);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOLCIRCULATIONID: {varchar(30)}
     * @param symbolcirculationid The value of symbolcirculationid as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolcirculationid_GreaterThan(String symbolcirculationid) {
        regSymbolcirculationid(CK_GT, fRES(symbolcirculationid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOLCIRCULATIONID: {varchar(30)}
     * @param symbolcirculationid The value of symbolcirculationid as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolcirculationid_LessThan(String symbolcirculationid) {
        regSymbolcirculationid(CK_LT, fRES(symbolcirculationid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOLCIRCULATIONID: {varchar(30)}
     * @param symbolcirculationid The value of symbolcirculationid as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolcirculationid_GreaterEqual(String symbolcirculationid) {
        regSymbolcirculationid(CK_GE, fRES(symbolcirculationid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOLCIRCULATIONID: {varchar(30)}
     * @param symbolcirculationid The value of symbolcirculationid as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolcirculationid_LessEqual(String symbolcirculationid) {
        regSymbolcirculationid(CK_LE, fRES(symbolcirculationid));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SYMBOLCIRCULATIONID: {varchar(30)}
     * @param symbolcirculationidList The collection of symbolcirculationid as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolcirculationid_InScope(Collection<String> symbolcirculationidList) {
        doSetSymbolcirculationid_InScope(symbolcirculationidList);
    }

    protected void doSetSymbolcirculationid_InScope(Collection<String> symbolcirculationidList) {
        regINS(CK_INS, cTL(symbolcirculationidList), xgetCValueSymbolcirculationid(), "SYMBOLCIRCULATIONID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SYMBOLCIRCULATIONID: {varchar(30)}
     * @param symbolcirculationidList The collection of symbolcirculationid as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolcirculationid_NotInScope(Collection<String> symbolcirculationidList) {
        doSetSymbolcirculationid_NotInScope(symbolcirculationidList);
    }

    protected void doSetSymbolcirculationid_NotInScope(Collection<String> symbolcirculationidList) {
        regINS(CK_NINS, cTL(symbolcirculationidList), xgetCValueSymbolcirculationid(), "SYMBOLCIRCULATIONID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SYMBOLCIRCULATIONID: {varchar(30)} <br>
     * <pre>e.g. setSymbolcirculationid_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param symbolcirculationid The value of symbolcirculationid as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSymbolcirculationid_LikeSearch(String symbolcirculationid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(symbolcirculationid), xgetCValueSymbolcirculationid(), "SYMBOLCIRCULATIONID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SYMBOLCIRCULATIONID: {varchar(30)}
     * @param symbolcirculationid The value of symbolcirculationid as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSymbolcirculationid_NotLikeSearch(String symbolcirculationid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(symbolcirculationid), xgetCValueSymbolcirculationid(), "SYMBOLCIRCULATIONID", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SYMBOLCIRCULATIONID: {varchar(30)}
     * @param symbolcirculationid The value of symbolcirculationid as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolcirculationid_PrefixSearch(String symbolcirculationid) {
        setSymbolcirculationid_LikeSearch(symbolcirculationid, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SYMBOLCIRCULATIONID: {varchar(30)}
     */
    public void setSymbolcirculationid_IsNull() { regSymbolcirculationid(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SYMBOLCIRCULATIONID: {varchar(30)}
     */
    public void setSymbolcirculationid_IsNullOrEmpty() { regSymbolcirculationid(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SYMBOLCIRCULATIONID: {varchar(30)}
     */
    public void setSymbolcirculationid_IsNotNull() { regSymbolcirculationid(CK_ISNN, DOBJ); }

    protected void regSymbolcirculationid(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSymbolcirculationid(), "SYMBOLCIRCULATIONID"); }
    protected abstract ConditionValue xgetCValueSymbolcirculationid();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SYMBOLRCVKEY: {bigint(19)}
     * @param symbolrcvkey The value of symbolrcvkey as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSymbolrcvkey_Equal(Long symbolrcvkey) {
        doSetSymbolrcvkey_Equal(symbolrcvkey);
    }

    protected void doSetSymbolrcvkey_Equal(Long symbolrcvkey) {
        regSymbolrcvkey(CK_EQ, symbolrcvkey);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SYMBOLRCVKEY: {bigint(19)}
     * @param symbolrcvkey The value of symbolrcvkey as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSymbolrcvkey_NotEqual(Long symbolrcvkey) {
        doSetSymbolrcvkey_NotEqual(symbolrcvkey);
    }

    protected void doSetSymbolrcvkey_NotEqual(Long symbolrcvkey) {
        regSymbolrcvkey(CK_NES, symbolrcvkey);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SYMBOLRCVKEY: {bigint(19)}
     * @param symbolrcvkey The value of symbolrcvkey as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSymbolrcvkey_GreaterThan(Long symbolrcvkey) {
        regSymbolrcvkey(CK_GT, symbolrcvkey);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SYMBOLRCVKEY: {bigint(19)}
     * @param symbolrcvkey The value of symbolrcvkey as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSymbolrcvkey_LessThan(Long symbolrcvkey) {
        regSymbolrcvkey(CK_LT, symbolrcvkey);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SYMBOLRCVKEY: {bigint(19)}
     * @param symbolrcvkey The value of symbolrcvkey as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSymbolrcvkey_GreaterEqual(Long symbolrcvkey) {
        regSymbolrcvkey(CK_GE, symbolrcvkey);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SYMBOLRCVKEY: {bigint(19)}
     * @param symbolrcvkey The value of symbolrcvkey as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSymbolrcvkey_LessEqual(Long symbolrcvkey) {
        regSymbolrcvkey(CK_LE, symbolrcvkey);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SYMBOLRCVKEY: {bigint(19)}
     * @param minNumber The min number of symbolrcvkey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of symbolrcvkey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSymbolrcvkey_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSymbolrcvkey(), "SYMBOLRCVKEY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SYMBOLRCVKEY: {bigint(19)}
     * @param symbolrcvkeyList The collection of symbolrcvkey as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolrcvkey_InScope(Collection<Long> symbolrcvkeyList) {
        doSetSymbolrcvkey_InScope(symbolrcvkeyList);
    }

    protected void doSetSymbolrcvkey_InScope(Collection<Long> symbolrcvkeyList) {
        regINS(CK_INS, cTL(symbolrcvkeyList), xgetCValueSymbolrcvkey(), "SYMBOLRCVKEY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SYMBOLRCVKEY: {bigint(19)}
     * @param symbolrcvkeyList The collection of symbolrcvkey as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolrcvkey_NotInScope(Collection<Long> symbolrcvkeyList) {
        doSetSymbolrcvkey_NotInScope(symbolrcvkeyList);
    }

    protected void doSetSymbolrcvkey_NotInScope(Collection<Long> symbolrcvkeyList) {
        regINS(CK_NINS, cTL(symbolrcvkeyList), xgetCValueSymbolrcvkey(), "SYMBOLRCVKEY");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SYMBOLRCVKEY: {bigint(19)}
     */
    public void setSymbolrcvkey_IsNull() { regSymbolrcvkey(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SYMBOLRCVKEY: {bigint(19)}
     */
    public void setSymbolrcvkey_IsNotNull() { regSymbolrcvkey(CK_ISNN, DOBJ); }

    protected void regSymbolrcvkey(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSymbolrcvkey(), "SYMBOLRCVKEY"); }
    protected abstract ConditionValue xgetCValueSymbolrcvkey();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOLLOT3: {varchar(30)}
     * @param symbollot3 The value of symbollot3 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbollot3_Equal(String symbollot3) {
        doSetSymbollot3_Equal(fRES(symbollot3));
    }

    protected void doSetSymbollot3_Equal(String symbollot3) {
        regSymbollot3(CK_EQ, symbollot3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOLLOT3: {varchar(30)}
     * @param symbollot3 The value of symbollot3 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbollot3_NotEqual(String symbollot3) {
        doSetSymbollot3_NotEqual(fRES(symbollot3));
    }

    protected void doSetSymbollot3_NotEqual(String symbollot3) {
        regSymbollot3(CK_NES, symbollot3);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOLLOT3: {varchar(30)}
     * @param symbollot3 The value of symbollot3 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbollot3_GreaterThan(String symbollot3) {
        regSymbollot3(CK_GT, fRES(symbollot3));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOLLOT3: {varchar(30)}
     * @param symbollot3 The value of symbollot3 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbollot3_LessThan(String symbollot3) {
        regSymbollot3(CK_LT, fRES(symbollot3));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOLLOT3: {varchar(30)}
     * @param symbollot3 The value of symbollot3 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbollot3_GreaterEqual(String symbollot3) {
        regSymbollot3(CK_GE, fRES(symbollot3));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYMBOLLOT3: {varchar(30)}
     * @param symbollot3 The value of symbollot3 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbollot3_LessEqual(String symbollot3) {
        regSymbollot3(CK_LE, fRES(symbollot3));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SYMBOLLOT3: {varchar(30)}
     * @param symbollot3List The collection of symbollot3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbollot3_InScope(Collection<String> symbollot3List) {
        doSetSymbollot3_InScope(symbollot3List);
    }

    protected void doSetSymbollot3_InScope(Collection<String> symbollot3List) {
        regINS(CK_INS, cTL(symbollot3List), xgetCValueSymbollot3(), "SYMBOLLOT3");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SYMBOLLOT3: {varchar(30)}
     * @param symbollot3List The collection of symbollot3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbollot3_NotInScope(Collection<String> symbollot3List) {
        doSetSymbollot3_NotInScope(symbollot3List);
    }

    protected void doSetSymbollot3_NotInScope(Collection<String> symbollot3List) {
        regINS(CK_NINS, cTL(symbollot3List), xgetCValueSymbollot3(), "SYMBOLLOT3");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SYMBOLLOT3: {varchar(30)} <br>
     * <pre>e.g. setSymbollot3_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param symbollot3 The value of symbollot3 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSymbollot3_LikeSearch(String symbollot3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(symbollot3), xgetCValueSymbollot3(), "SYMBOLLOT3", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SYMBOLLOT3: {varchar(30)}
     * @param symbollot3 The value of symbollot3 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSymbollot3_NotLikeSearch(String symbollot3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(symbollot3), xgetCValueSymbollot3(), "SYMBOLLOT3", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SYMBOLLOT3: {varchar(30)}
     * @param symbollot3 The value of symbollot3 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbollot3_PrefixSearch(String symbollot3) {
        setSymbollot3_LikeSearch(symbollot3, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SYMBOLLOT3: {varchar(30)}
     */
    public void setSymbollot3_IsNull() { regSymbollot3(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SYMBOLLOT3: {varchar(30)}
     */
    public void setSymbollot3_IsNullOrEmpty() { regSymbollot3(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SYMBOLLOT3: {varchar(30)}
     */
    public void setSymbollot3_IsNotNull() { regSymbollot3(CK_ISNN, DOBJ); }

    protected void regSymbollot3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSymbollot3(), "SYMBOLLOT3"); }
    protected abstract ConditionValue xgetCValueSymbollot3();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * QRData: {varchar(255)}
     * @param qrdata The value of qrdata as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQrdata_Equal(String qrdata) {
        doSetQrdata_Equal(fRES(qrdata));
    }

    protected void doSetQrdata_Equal(String qrdata) {
        regQrdata(CK_EQ, qrdata);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * QRData: {varchar(255)}
     * @param qrdata The value of qrdata as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQrdata_NotEqual(String qrdata) {
        doSetQrdata_NotEqual(fRES(qrdata));
    }

    protected void doSetQrdata_NotEqual(String qrdata) {
        regQrdata(CK_NES, qrdata);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * QRData: {varchar(255)}
     * @param qrdata The value of qrdata as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQrdata_GreaterThan(String qrdata) {
        regQrdata(CK_GT, fRES(qrdata));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * QRData: {varchar(255)}
     * @param qrdata The value of qrdata as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQrdata_LessThan(String qrdata) {
        regQrdata(CK_LT, fRES(qrdata));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * QRData: {varchar(255)}
     * @param qrdata The value of qrdata as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQrdata_GreaterEqual(String qrdata) {
        regQrdata(CK_GE, fRES(qrdata));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * QRData: {varchar(255)}
     * @param qrdata The value of qrdata as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQrdata_LessEqual(String qrdata) {
        regQrdata(CK_LE, fRES(qrdata));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * QRData: {varchar(255)}
     * @param qrdataList The collection of qrdata as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQrdata_InScope(Collection<String> qrdataList) {
        doSetQrdata_InScope(qrdataList);
    }

    protected void doSetQrdata_InScope(Collection<String> qrdataList) {
        regINS(CK_INS, cTL(qrdataList), xgetCValueQrdata(), "QRData");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * QRData: {varchar(255)}
     * @param qrdataList The collection of qrdata as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQrdata_NotInScope(Collection<String> qrdataList) {
        doSetQrdata_NotInScope(qrdataList);
    }

    protected void doSetQrdata_NotInScope(Collection<String> qrdataList) {
        regINS(CK_NINS, cTL(qrdataList), xgetCValueQrdata(), "QRData");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * QRData: {varchar(255)} <br>
     * <pre>e.g. setQrdata_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param qrdata The value of qrdata as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setQrdata_LikeSearch(String qrdata, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(qrdata), xgetCValueQrdata(), "QRData", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * QRData: {varchar(255)}
     * @param qrdata The value of qrdata as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setQrdata_NotLikeSearch(String qrdata, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(qrdata), xgetCValueQrdata(), "QRData", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * QRData: {varchar(255)}
     * @param qrdata The value of qrdata as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQrdata_PrefixSearch(String qrdata) {
        setQrdata_LikeSearch(qrdata, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * QRData: {varchar(255)}
     */
    public void setQrdata_IsNull() { regQrdata(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * QRData: {varchar(255)}
     */
    public void setQrdata_IsNullOrEmpty() { regQrdata(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * QRData: {varchar(255)}
     */
    public void setQrdata_IsNotNull() { regQrdata(CK_ISNN, DOBJ); }

    protected void regQrdata(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueQrdata(), "QRData"); }
    protected abstract ConditionValue xgetCValueQrdata();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TREXAMRESULT_ID: {IX, bigint(19)}
     * @param trexamresultId The value of trexamresultId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrexamresultId_Equal(Long trexamresultId) {
        doSetTrexamresultId_Equal(trexamresultId);
    }

    protected void doSetTrexamresultId_Equal(Long trexamresultId) {
        regTrexamresultId(CK_EQ, trexamresultId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TREXAMRESULT_ID: {IX, bigint(19)}
     * @param trexamresultId The value of trexamresultId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrexamresultId_NotEqual(Long trexamresultId) {
        doSetTrexamresultId_NotEqual(trexamresultId);
    }

    protected void doSetTrexamresultId_NotEqual(Long trexamresultId) {
        regTrexamresultId(CK_NES, trexamresultId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TREXAMRESULT_ID: {IX, bigint(19)}
     * @param trexamresultId The value of trexamresultId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrexamresultId_GreaterThan(Long trexamresultId) {
        regTrexamresultId(CK_GT, trexamresultId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TREXAMRESULT_ID: {IX, bigint(19)}
     * @param trexamresultId The value of trexamresultId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrexamresultId_LessThan(Long trexamresultId) {
        regTrexamresultId(CK_LT, trexamresultId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TREXAMRESULT_ID: {IX, bigint(19)}
     * @param trexamresultId The value of trexamresultId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrexamresultId_GreaterEqual(Long trexamresultId) {
        regTrexamresultId(CK_GE, trexamresultId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TREXAMRESULT_ID: {IX, bigint(19)}
     * @param trexamresultId The value of trexamresultId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrexamresultId_LessEqual(Long trexamresultId) {
        regTrexamresultId(CK_LE, trexamresultId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TREXAMRESULT_ID: {IX, bigint(19)}
     * @param minNumber The min number of trexamresultId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of trexamresultId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTrexamresultId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTrexamresultId(), "TREXAMRESULT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TREXAMRESULT_ID: {IX, bigint(19)}
     * @param trexamresultIdList The collection of trexamresultId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrexamresultId_InScope(Collection<Long> trexamresultIdList) {
        doSetTrexamresultId_InScope(trexamresultIdList);
    }

    protected void doSetTrexamresultId_InScope(Collection<Long> trexamresultIdList) {
        regINS(CK_INS, cTL(trexamresultIdList), xgetCValueTrexamresultId(), "TREXAMRESULT_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TREXAMRESULT_ID: {IX, bigint(19)}
     * @param trexamresultIdList The collection of trexamresultId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrexamresultId_NotInScope(Collection<Long> trexamresultIdList) {
        doSetTrexamresultId_NotInScope(trexamresultIdList);
    }

    protected void doSetTrexamresultId_NotInScope(Collection<Long> trexamresultIdList) {
        regINS(CK_NINS, cTL(trexamresultIdList), xgetCValueTrexamresultId(), "TREXAMRESULT_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TREXAMRESULT_ID: {IX, bigint(19)}
     */
    public void setTrexamresultId_IsNull() { regTrexamresultId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TREXAMRESULT_ID: {IX, bigint(19)}
     */
    public void setTrexamresultId_IsNotNull() { regTrexamresultId(CK_ISNN, DOBJ); }

    protected void regTrexamresultId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTrexamresultId(), "TREXAMRESULT_ID"); }
    protected abstract ConditionValue xgetCValueTrexamresultId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASEITFNO: {varchar(30)}
     * @param caseitfno The value of caseitfno as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseitfno_Equal(String caseitfno) {
        doSetCaseitfno_Equal(fRES(caseitfno));
    }

    protected void doSetCaseitfno_Equal(String caseitfno) {
        regCaseitfno(CK_EQ, caseitfno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASEITFNO: {varchar(30)}
     * @param caseitfno The value of caseitfno as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseitfno_NotEqual(String caseitfno) {
        doSetCaseitfno_NotEqual(fRES(caseitfno));
    }

    protected void doSetCaseitfno_NotEqual(String caseitfno) {
        regCaseitfno(CK_NES, caseitfno);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASEITFNO: {varchar(30)}
     * @param caseitfno The value of caseitfno as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseitfno_GreaterThan(String caseitfno) {
        regCaseitfno(CK_GT, fRES(caseitfno));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASEITFNO: {varchar(30)}
     * @param caseitfno The value of caseitfno as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseitfno_LessThan(String caseitfno) {
        regCaseitfno(CK_LT, fRES(caseitfno));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASEITFNO: {varchar(30)}
     * @param caseitfno The value of caseitfno as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseitfno_GreaterEqual(String caseitfno) {
        regCaseitfno(CK_GE, fRES(caseitfno));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASEITFNO: {varchar(30)}
     * @param caseitfno The value of caseitfno as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseitfno_LessEqual(String caseitfno) {
        regCaseitfno(CK_LE, fRES(caseitfno));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CASEITFNO: {varchar(30)}
     * @param caseitfnoList The collection of caseitfno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseitfno_InScope(Collection<String> caseitfnoList) {
        doSetCaseitfno_InScope(caseitfnoList);
    }

    protected void doSetCaseitfno_InScope(Collection<String> caseitfnoList) {
        regINS(CK_INS, cTL(caseitfnoList), xgetCValueCaseitfno(), "CASEITFNO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CASEITFNO: {varchar(30)}
     * @param caseitfnoList The collection of caseitfno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseitfno_NotInScope(Collection<String> caseitfnoList) {
        doSetCaseitfno_NotInScope(caseitfnoList);
    }

    protected void doSetCaseitfno_NotInScope(Collection<String> caseitfnoList) {
        regINS(CK_NINS, cTL(caseitfnoList), xgetCValueCaseitfno(), "CASEITFNO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CASEITFNO: {varchar(30)} <br>
     * <pre>e.g. setCaseitfno_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param caseitfno The value of caseitfno as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCaseitfno_LikeSearch(String caseitfno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(caseitfno), xgetCValueCaseitfno(), "CASEITFNO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CASEITFNO: {varchar(30)}
     * @param caseitfno The value of caseitfno as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCaseitfno_NotLikeSearch(String caseitfno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(caseitfno), xgetCValueCaseitfno(), "CASEITFNO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CASEITFNO: {varchar(30)}
     * @param caseitfno The value of caseitfno as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseitfno_PrefixSearch(String caseitfno) {
        setCaseitfno_LikeSearch(caseitfno, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CASEITFNO: {varchar(30)}
     */
    public void setCaseitfno_IsNull() { regCaseitfno(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CASEITFNO: {varchar(30)}
     */
    public void setCaseitfno_IsNullOrEmpty() { regCaseitfno(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CASEITFNO: {varchar(30)}
     */
    public void setCaseitfno_IsNotNull() { regCaseitfno(CK_ISNN, DOBJ); }

    protected void regCaseitfno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCaseitfno(), "CASEITFNO"); }
    protected abstract ConditionValue xgetCValueCaseitfno();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASEBARCODEVALIANT: {varchar(30)}
     * @param casebarcodevaliant The value of casebarcodevaliant as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasebarcodevaliant_Equal(String casebarcodevaliant) {
        doSetCasebarcodevaliant_Equal(fRES(casebarcodevaliant));
    }

    protected void doSetCasebarcodevaliant_Equal(String casebarcodevaliant) {
        regCasebarcodevaliant(CK_EQ, casebarcodevaliant);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASEBARCODEVALIANT: {varchar(30)}
     * @param casebarcodevaliant The value of casebarcodevaliant as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasebarcodevaliant_NotEqual(String casebarcodevaliant) {
        doSetCasebarcodevaliant_NotEqual(fRES(casebarcodevaliant));
    }

    protected void doSetCasebarcodevaliant_NotEqual(String casebarcodevaliant) {
        regCasebarcodevaliant(CK_NES, casebarcodevaliant);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASEBARCODEVALIANT: {varchar(30)}
     * @param casebarcodevaliant The value of casebarcodevaliant as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasebarcodevaliant_GreaterThan(String casebarcodevaliant) {
        regCasebarcodevaliant(CK_GT, fRES(casebarcodevaliant));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASEBARCODEVALIANT: {varchar(30)}
     * @param casebarcodevaliant The value of casebarcodevaliant as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasebarcodevaliant_LessThan(String casebarcodevaliant) {
        regCasebarcodevaliant(CK_LT, fRES(casebarcodevaliant));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASEBARCODEVALIANT: {varchar(30)}
     * @param casebarcodevaliant The value of casebarcodevaliant as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasebarcodevaliant_GreaterEqual(String casebarcodevaliant) {
        regCasebarcodevaliant(CK_GE, fRES(casebarcodevaliant));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASEBARCODEVALIANT: {varchar(30)}
     * @param casebarcodevaliant The value of casebarcodevaliant as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasebarcodevaliant_LessEqual(String casebarcodevaliant) {
        regCasebarcodevaliant(CK_LE, fRES(casebarcodevaliant));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CASEBARCODEVALIANT: {varchar(30)}
     * @param casebarcodevaliantList The collection of casebarcodevaliant as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasebarcodevaliant_InScope(Collection<String> casebarcodevaliantList) {
        doSetCasebarcodevaliant_InScope(casebarcodevaliantList);
    }

    protected void doSetCasebarcodevaliant_InScope(Collection<String> casebarcodevaliantList) {
        regINS(CK_INS, cTL(casebarcodevaliantList), xgetCValueCasebarcodevaliant(), "CASEBARCODEVALIANT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CASEBARCODEVALIANT: {varchar(30)}
     * @param casebarcodevaliantList The collection of casebarcodevaliant as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasebarcodevaliant_NotInScope(Collection<String> casebarcodevaliantList) {
        doSetCasebarcodevaliant_NotInScope(casebarcodevaliantList);
    }

    protected void doSetCasebarcodevaliant_NotInScope(Collection<String> casebarcodevaliantList) {
        regINS(CK_NINS, cTL(casebarcodevaliantList), xgetCValueCasebarcodevaliant(), "CASEBARCODEVALIANT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CASEBARCODEVALIANT: {varchar(30)} <br>
     * <pre>e.g. setCasebarcodevaliant_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param casebarcodevaliant The value of casebarcodevaliant as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCasebarcodevaliant_LikeSearch(String casebarcodevaliant, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(casebarcodevaliant), xgetCValueCasebarcodevaliant(), "CASEBARCODEVALIANT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CASEBARCODEVALIANT: {varchar(30)}
     * @param casebarcodevaliant The value of casebarcodevaliant as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCasebarcodevaliant_NotLikeSearch(String casebarcodevaliant, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(casebarcodevaliant), xgetCValueCasebarcodevaliant(), "CASEBARCODEVALIANT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CASEBARCODEVALIANT: {varchar(30)}
     * @param casebarcodevaliant The value of casebarcodevaliant as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasebarcodevaliant_PrefixSearch(String casebarcodevaliant) {
        setCasebarcodevaliant_LikeSearch(casebarcodevaliant, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CASEBARCODEVALIANT: {varchar(30)}
     */
    public void setCasebarcodevaliant_IsNull() { regCasebarcodevaliant(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CASEBARCODEVALIANT: {varchar(30)}
     */
    public void setCasebarcodevaliant_IsNullOrEmpty() { regCasebarcodevaliant(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CASEBARCODEVALIANT: {varchar(30)}
     */
    public void setCasebarcodevaliant_IsNotNull() { regCasebarcodevaliant(CK_ISNN, DOBJ); }

    protected void regCasebarcodevaliant(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCasebarcodevaliant(), "CASEBARCODEVALIANT"); }
    protected abstract ConditionValue xgetCValueCasebarcodevaliant();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASELOT4: {varchar(30)}
     * @param caselot4 The value of caselot4 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaselot4_Equal(String caselot4) {
        doSetCaselot4_Equal(fRES(caselot4));
    }

    protected void doSetCaselot4_Equal(String caselot4) {
        regCaselot4(CK_EQ, caselot4);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASELOT4: {varchar(30)}
     * @param caselot4 The value of caselot4 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaselot4_NotEqual(String caselot4) {
        doSetCaselot4_NotEqual(fRES(caselot4));
    }

    protected void doSetCaselot4_NotEqual(String caselot4) {
        regCaselot4(CK_NES, caselot4);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASELOT4: {varchar(30)}
     * @param caselot4 The value of caselot4 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaselot4_GreaterThan(String caselot4) {
        regCaselot4(CK_GT, fRES(caselot4));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASELOT4: {varchar(30)}
     * @param caselot4 The value of caselot4 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaselot4_LessThan(String caselot4) {
        regCaselot4(CK_LT, fRES(caselot4));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASELOT4: {varchar(30)}
     * @param caselot4 The value of caselot4 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaselot4_GreaterEqual(String caselot4) {
        regCaselot4(CK_GE, fRES(caselot4));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASELOT4: {varchar(30)}
     * @param caselot4 The value of caselot4 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaselot4_LessEqual(String caselot4) {
        regCaselot4(CK_LE, fRES(caselot4));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CASELOT4: {varchar(30)}
     * @param caselot4List The collection of caselot4 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaselot4_InScope(Collection<String> caselot4List) {
        doSetCaselot4_InScope(caselot4List);
    }

    protected void doSetCaselot4_InScope(Collection<String> caselot4List) {
        regINS(CK_INS, cTL(caselot4List), xgetCValueCaselot4(), "CASELOT4");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CASELOT4: {varchar(30)}
     * @param caselot4List The collection of caselot4 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaselot4_NotInScope(Collection<String> caselot4List) {
        doSetCaselot4_NotInScope(caselot4List);
    }

    protected void doSetCaselot4_NotInScope(Collection<String> caselot4List) {
        regINS(CK_NINS, cTL(caselot4List), xgetCValueCaselot4(), "CASELOT4");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CASELOT4: {varchar(30)} <br>
     * <pre>e.g. setCaselot4_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param caselot4 The value of caselot4 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCaselot4_LikeSearch(String caselot4, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(caselot4), xgetCValueCaselot4(), "CASELOT4", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CASELOT4: {varchar(30)}
     * @param caselot4 The value of caselot4 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCaselot4_NotLikeSearch(String caselot4, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(caselot4), xgetCValueCaselot4(), "CASELOT4", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CASELOT4: {varchar(30)}
     * @param caselot4 The value of caselot4 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaselot4_PrefixSearch(String caselot4) {
        setCaselot4_LikeSearch(caselot4, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CASELOT4: {varchar(30)}
     */
    public void setCaselot4_IsNull() { regCaselot4(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CASELOT4: {varchar(30)}
     */
    public void setCaselot4_IsNullOrEmpty() { regCaselot4(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CASELOT4: {varchar(30)}
     */
    public void setCaselot4_IsNotNull() { regCaselot4(CK_ISNN, DOBJ); }

    protected void regCaselot4(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCaselot4(), "CASELOT4"); }
    protected abstract ConditionValue xgetCValueCaselot4();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * DATETIME: {datetime2(26, 6)}
     * @param datetime The value of datetime as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setDatetime_Equal(java.sql.Timestamp datetime) {
        regDatetime(CK_EQ,  datetime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DATETIME: {datetime2(26, 6)}
     * @param datetime The value of datetime as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDatetime_GreaterThan(java.sql.Timestamp datetime) {
        regDatetime(CK_GT,  datetime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DATETIME: {datetime2(26, 6)}
     * @param datetime The value of datetime as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDatetime_LessThan(java.sql.Timestamp datetime) {
        regDatetime(CK_LT,  datetime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DATETIME: {datetime2(26, 6)}
     * @param datetime The value of datetime as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDatetime_GreaterEqual(java.sql.Timestamp datetime) {
        regDatetime(CK_GE,  datetime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DATETIME: {datetime2(26, 6)}
     * @param datetime The value of datetime as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDatetime_LessEqual(java.sql.Timestamp datetime) {
        regDatetime(CK_LE, datetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * DATETIME: {datetime2(26, 6)}
     * <pre>e.g. setDatetime_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of datetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of datetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setDatetime_FromTo(Date fromDatetime, Date toDatetime, FromToOption fromToOption) {
        regFTQ((fromDatetime != null ? new java.sql.Timestamp(fromDatetime.getTime()) : null), (toDatetime != null ? new java.sql.Timestamp(toDatetime.getTime()) : null), xgetCValueDatetime(), "DATETIME", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * DATETIME: {datetime2(26, 6)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #CC4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of datetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDate The to-date(yyyy/MM/dd) of datetime. (basically NotNull: if op.allowOneSide(), null allowed)
     */
    public void setDatetime_DateFromTo(Date fromDate, Date toDate) {
        setDatetime_FromTo(fromDate, toDate, xcDFTOP());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DATETIME: {datetime2(26, 6)}
     */
    public void setDatetime_IsNull() { regDatetime(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DATETIME: {datetime2(26, 6)}
     */
    public void setDatetime_IsNotNull() { regDatetime(CK_ISNN, DOBJ); }

    protected void regDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDatetime(), "DATETIME"); }
    protected abstract ConditionValue xgetCValueDatetime();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASECENTERNO: {varchar(30)}
     * @param casecenterno The value of casecenterno as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasecenterno_Equal(String casecenterno) {
        doSetCasecenterno_Equal(fRES(casecenterno));
    }

    protected void doSetCasecenterno_Equal(String casecenterno) {
        regCasecenterno(CK_EQ, casecenterno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASECENTERNO: {varchar(30)}
     * @param casecenterno The value of casecenterno as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasecenterno_NotEqual(String casecenterno) {
        doSetCasecenterno_NotEqual(fRES(casecenterno));
    }

    protected void doSetCasecenterno_NotEqual(String casecenterno) {
        regCasecenterno(CK_NES, casecenterno);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASECENTERNO: {varchar(30)}
     * @param casecenterno The value of casecenterno as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasecenterno_GreaterThan(String casecenterno) {
        regCasecenterno(CK_GT, fRES(casecenterno));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASECENTERNO: {varchar(30)}
     * @param casecenterno The value of casecenterno as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasecenterno_LessThan(String casecenterno) {
        regCasecenterno(CK_LT, fRES(casecenterno));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASECENTERNO: {varchar(30)}
     * @param casecenterno The value of casecenterno as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasecenterno_GreaterEqual(String casecenterno) {
        regCasecenterno(CK_GE, fRES(casecenterno));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASECENTERNO: {varchar(30)}
     * @param casecenterno The value of casecenterno as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasecenterno_LessEqual(String casecenterno) {
        regCasecenterno(CK_LE, fRES(casecenterno));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CASECENTERNO: {varchar(30)}
     * @param casecenternoList The collection of casecenterno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasecenterno_InScope(Collection<String> casecenternoList) {
        doSetCasecenterno_InScope(casecenternoList);
    }

    protected void doSetCasecenterno_InScope(Collection<String> casecenternoList) {
        regINS(CK_INS, cTL(casecenternoList), xgetCValueCasecenterno(), "CASECENTERNO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CASECENTERNO: {varchar(30)}
     * @param casecenternoList The collection of casecenterno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasecenterno_NotInScope(Collection<String> casecenternoList) {
        doSetCasecenterno_NotInScope(casecenternoList);
    }

    protected void doSetCasecenterno_NotInScope(Collection<String> casecenternoList) {
        regINS(CK_NINS, cTL(casecenternoList), xgetCValueCasecenterno(), "CASECENTERNO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CASECENTERNO: {varchar(30)} <br>
     * <pre>e.g. setCasecenterno_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param casecenterno The value of casecenterno as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCasecenterno_LikeSearch(String casecenterno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(casecenterno), xgetCValueCasecenterno(), "CASECENTERNO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CASECENTERNO: {varchar(30)}
     * @param casecenterno The value of casecenterno as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCasecenterno_NotLikeSearch(String casecenterno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(casecenterno), xgetCValueCasecenterno(), "CASECENTERNO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CASECENTERNO: {varchar(30)}
     * @param casecenterno The value of casecenterno as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasecenterno_PrefixSearch(String casecenterno) {
        setCasecenterno_LikeSearch(casecenterno, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CASECENTERNO: {varchar(30)}
     */
    public void setCasecenterno_IsNull() { regCasecenterno(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CASECENTERNO: {varchar(30)}
     */
    public void setCasecenterno_IsNullOrEmpty() { regCasecenterno(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CASECENTERNO: {varchar(30)}
     */
    public void setCasecenterno_IsNotNull() { regCasecenterno(CK_ISNN, DOBJ); }

    protected void regCasecenterno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCasecenterno(), "CASECENTERNO"); }
    protected abstract ConditionValue xgetCValueCasecenterno();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASEPACKNO: {varchar(30)}
     * @param casepackno The value of casepackno as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasepackno_Equal(String casepackno) {
        doSetCasepackno_Equal(fRES(casepackno));
    }

    protected void doSetCasepackno_Equal(String casepackno) {
        regCasepackno(CK_EQ, casepackno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASEPACKNO: {varchar(30)}
     * @param casepackno The value of casepackno as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasepackno_NotEqual(String casepackno) {
        doSetCasepackno_NotEqual(fRES(casepackno));
    }

    protected void doSetCasepackno_NotEqual(String casepackno) {
        regCasepackno(CK_NES, casepackno);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASEPACKNO: {varchar(30)}
     * @param casepackno The value of casepackno as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasepackno_GreaterThan(String casepackno) {
        regCasepackno(CK_GT, fRES(casepackno));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASEPACKNO: {varchar(30)}
     * @param casepackno The value of casepackno as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasepackno_LessThan(String casepackno) {
        regCasepackno(CK_LT, fRES(casepackno));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASEPACKNO: {varchar(30)}
     * @param casepackno The value of casepackno as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasepackno_GreaterEqual(String casepackno) {
        regCasepackno(CK_GE, fRES(casepackno));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASEPACKNO: {varchar(30)}
     * @param casepackno The value of casepackno as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasepackno_LessEqual(String casepackno) {
        regCasepackno(CK_LE, fRES(casepackno));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CASEPACKNO: {varchar(30)}
     * @param casepacknoList The collection of casepackno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasepackno_InScope(Collection<String> casepacknoList) {
        doSetCasepackno_InScope(casepacknoList);
    }

    protected void doSetCasepackno_InScope(Collection<String> casepacknoList) {
        regINS(CK_INS, cTL(casepacknoList), xgetCValueCasepackno(), "CASEPACKNO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CASEPACKNO: {varchar(30)}
     * @param casepacknoList The collection of casepackno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasepackno_NotInScope(Collection<String> casepacknoList) {
        doSetCasepackno_NotInScope(casepacknoList);
    }

    protected void doSetCasepackno_NotInScope(Collection<String> casepacknoList) {
        regINS(CK_NINS, cTL(casepacknoList), xgetCValueCasepackno(), "CASEPACKNO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CASEPACKNO: {varchar(30)} <br>
     * <pre>e.g. setCasepackno_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param casepackno The value of casepackno as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCasepackno_LikeSearch(String casepackno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(casepackno), xgetCValueCasepackno(), "CASEPACKNO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CASEPACKNO: {varchar(30)}
     * @param casepackno The value of casepackno as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCasepackno_NotLikeSearch(String casepackno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(casepackno), xgetCValueCasepackno(), "CASEPACKNO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CASEPACKNO: {varchar(30)}
     * @param casepackno The value of casepackno as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasepackno_PrefixSearch(String casepackno) {
        setCasepackno_LikeSearch(casepackno, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CASEPACKNO: {varchar(30)}
     */
    public void setCasepackno_IsNull() { regCasepackno(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CASEPACKNO: {varchar(30)}
     */
    public void setCasepackno_IsNullOrEmpty() { regCasepackno(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CASEPACKNO: {varchar(30)}
     */
    public void setCasepackno_IsNotNull() { regCasepackno(CK_ISNN, DOBJ); }

    protected void regCasepackno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCasepackno(), "CASEPACKNO"); }
    protected abstract ConditionValue xgetCValueCasepackno();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASEPACKTIME: {varchar(30)}
     * @param casepacktime The value of casepacktime as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasepacktime_Equal(String casepacktime) {
        doSetCasepacktime_Equal(fRES(casepacktime));
    }

    protected void doSetCasepacktime_Equal(String casepacktime) {
        regCasepacktime(CK_EQ, casepacktime);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASEPACKTIME: {varchar(30)}
     * @param casepacktime The value of casepacktime as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasepacktime_NotEqual(String casepacktime) {
        doSetCasepacktime_NotEqual(fRES(casepacktime));
    }

    protected void doSetCasepacktime_NotEqual(String casepacktime) {
        regCasepacktime(CK_NES, casepacktime);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASEPACKTIME: {varchar(30)}
     * @param casepacktime The value of casepacktime as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasepacktime_GreaterThan(String casepacktime) {
        regCasepacktime(CK_GT, fRES(casepacktime));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASEPACKTIME: {varchar(30)}
     * @param casepacktime The value of casepacktime as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasepacktime_LessThan(String casepacktime) {
        regCasepacktime(CK_LT, fRES(casepacktime));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASEPACKTIME: {varchar(30)}
     * @param casepacktime The value of casepacktime as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasepacktime_GreaterEqual(String casepacktime) {
        regCasepacktime(CK_GE, fRES(casepacktime));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASEPACKTIME: {varchar(30)}
     * @param casepacktime The value of casepacktime as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasepacktime_LessEqual(String casepacktime) {
        regCasepacktime(CK_LE, fRES(casepacktime));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CASEPACKTIME: {varchar(30)}
     * @param casepacktimeList The collection of casepacktime as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasepacktime_InScope(Collection<String> casepacktimeList) {
        doSetCasepacktime_InScope(casepacktimeList);
    }

    protected void doSetCasepacktime_InScope(Collection<String> casepacktimeList) {
        regINS(CK_INS, cTL(casepacktimeList), xgetCValueCasepacktime(), "CASEPACKTIME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CASEPACKTIME: {varchar(30)}
     * @param casepacktimeList The collection of casepacktime as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasepacktime_NotInScope(Collection<String> casepacktimeList) {
        doSetCasepacktime_NotInScope(casepacktimeList);
    }

    protected void doSetCasepacktime_NotInScope(Collection<String> casepacktimeList) {
        regINS(CK_NINS, cTL(casepacktimeList), xgetCValueCasepacktime(), "CASEPACKTIME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CASEPACKTIME: {varchar(30)} <br>
     * <pre>e.g. setCasepacktime_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param casepacktime The value of casepacktime as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCasepacktime_LikeSearch(String casepacktime, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(casepacktime), xgetCValueCasepacktime(), "CASEPACKTIME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CASEPACKTIME: {varchar(30)}
     * @param casepacktime The value of casepacktime as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCasepacktime_NotLikeSearch(String casepacktime, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(casepacktime), xgetCValueCasepacktime(), "CASEPACKTIME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CASEPACKTIME: {varchar(30)}
     * @param casepacktime The value of casepacktime as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasepacktime_PrefixSearch(String casepacktime) {
        setCasepacktime_LikeSearch(casepacktime, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CASEPACKTIME: {varchar(30)}
     */
    public void setCasepacktime_IsNull() { regCasepacktime(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CASEPACKTIME: {varchar(30)}
     */
    public void setCasepacktime_IsNullOrEmpty() { regCasepacktime(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CASEPACKTIME: {varchar(30)}
     */
    public void setCasepacktime_IsNotNull() { regCasepacktime(CK_ISNN, DOBJ); }

    protected void regCasepacktime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCasepacktime(), "CASEPACKTIME"); }
    protected abstract ConditionValue xgetCValueCasepacktime();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASEBARCODE: {IX, varchar(60)}
     * @param casebarcode The value of casebarcode as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasebarcode_Equal(String casebarcode) {
        doSetCasebarcode_Equal(fRES(casebarcode));
    }

    protected void doSetCasebarcode_Equal(String casebarcode) {
        regCasebarcode(CK_EQ, casebarcode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASEBARCODE: {IX, varchar(60)}
     * @param casebarcode The value of casebarcode as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasebarcode_NotEqual(String casebarcode) {
        doSetCasebarcode_NotEqual(fRES(casebarcode));
    }

    protected void doSetCasebarcode_NotEqual(String casebarcode) {
        regCasebarcode(CK_NES, casebarcode);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASEBARCODE: {IX, varchar(60)}
     * @param casebarcode The value of casebarcode as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasebarcode_GreaterThan(String casebarcode) {
        regCasebarcode(CK_GT, fRES(casebarcode));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASEBARCODE: {IX, varchar(60)}
     * @param casebarcode The value of casebarcode as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasebarcode_LessThan(String casebarcode) {
        regCasebarcode(CK_LT, fRES(casebarcode));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASEBARCODE: {IX, varchar(60)}
     * @param casebarcode The value of casebarcode as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasebarcode_GreaterEqual(String casebarcode) {
        regCasebarcode(CK_GE, fRES(casebarcode));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASEBARCODE: {IX, varchar(60)}
     * @param casebarcode The value of casebarcode as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasebarcode_LessEqual(String casebarcode) {
        regCasebarcode(CK_LE, fRES(casebarcode));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CASEBARCODE: {IX, varchar(60)}
     * @param casebarcodeList The collection of casebarcode as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasebarcode_InScope(Collection<String> casebarcodeList) {
        doSetCasebarcode_InScope(casebarcodeList);
    }

    protected void doSetCasebarcode_InScope(Collection<String> casebarcodeList) {
        regINS(CK_INS, cTL(casebarcodeList), xgetCValueCasebarcode(), "CASEBARCODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CASEBARCODE: {IX, varchar(60)}
     * @param casebarcodeList The collection of casebarcode as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasebarcode_NotInScope(Collection<String> casebarcodeList) {
        doSetCasebarcode_NotInScope(casebarcodeList);
    }

    protected void doSetCasebarcode_NotInScope(Collection<String> casebarcodeList) {
        regINS(CK_NINS, cTL(casebarcodeList), xgetCValueCasebarcode(), "CASEBARCODE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CASEBARCODE: {IX, varchar(60)} <br>
     * <pre>e.g. setCasebarcode_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param casebarcode The value of casebarcode as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCasebarcode_LikeSearch(String casebarcode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(casebarcode), xgetCValueCasebarcode(), "CASEBARCODE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CASEBARCODE: {IX, varchar(60)}
     * @param casebarcode The value of casebarcode as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCasebarcode_NotLikeSearch(String casebarcode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(casebarcode), xgetCValueCasebarcode(), "CASEBARCODE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CASEBARCODE: {IX, varchar(60)}
     * @param casebarcode The value of casebarcode as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasebarcode_PrefixSearch(String casebarcode) {
        setCasebarcode_LikeSearch(casebarcode, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CASEBARCODE: {IX, varchar(60)}
     */
    public void setCasebarcode_IsNull() { regCasebarcode(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CASEBARCODE: {IX, varchar(60)}
     */
    public void setCasebarcode_IsNullOrEmpty() { regCasebarcode(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CASEBARCODE: {IX, varchar(60)}
     */
    public void setCasebarcode_IsNotNull() { regCasebarcode(CK_ISNN, DOBJ); }

    protected void regCasebarcode(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCasebarcode(), "CASEBARCODE"); }
    protected abstract ConditionValue xgetCValueCasebarcode();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MIXEDFLG: {char(1), default=[(0)]}
     * @param mixedflg The value of mixedflg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMixedflg_Equal(String mixedflg) {
        doSetMixedflg_Equal(fRES(mixedflg));
    }

    protected void doSetMixedflg_Equal(String mixedflg) {
        regMixedflg(CK_EQ, mixedflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MIXEDFLG: {char(1), default=[(0)]}
     * @param mixedflg The value of mixedflg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMixedflg_NotEqual(String mixedflg) {
        doSetMixedflg_NotEqual(fRES(mixedflg));
    }

    protected void doSetMixedflg_NotEqual(String mixedflg) {
        regMixedflg(CK_NES, mixedflg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MIXEDFLG: {char(1), default=[(0)]}
     * @param mixedflg The value of mixedflg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMixedflg_GreaterThan(String mixedflg) {
        regMixedflg(CK_GT, fRES(mixedflg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MIXEDFLG: {char(1), default=[(0)]}
     * @param mixedflg The value of mixedflg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMixedflg_LessThan(String mixedflg) {
        regMixedflg(CK_LT, fRES(mixedflg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MIXEDFLG: {char(1), default=[(0)]}
     * @param mixedflg The value of mixedflg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMixedflg_GreaterEqual(String mixedflg) {
        regMixedflg(CK_GE, fRES(mixedflg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MIXEDFLG: {char(1), default=[(0)]}
     * @param mixedflg The value of mixedflg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMixedflg_LessEqual(String mixedflg) {
        regMixedflg(CK_LE, fRES(mixedflg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MIXEDFLG: {char(1), default=[(0)]}
     * @param mixedflgList The collection of mixedflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMixedflg_InScope(Collection<String> mixedflgList) {
        doSetMixedflg_InScope(mixedflgList);
    }

    protected void doSetMixedflg_InScope(Collection<String> mixedflgList) {
        regINS(CK_INS, cTL(mixedflgList), xgetCValueMixedflg(), "MIXEDFLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MIXEDFLG: {char(1), default=[(0)]}
     * @param mixedflgList The collection of mixedflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMixedflg_NotInScope(Collection<String> mixedflgList) {
        doSetMixedflg_NotInScope(mixedflgList);
    }

    protected void doSetMixedflg_NotInScope(Collection<String> mixedflgList) {
        regINS(CK_NINS, cTL(mixedflgList), xgetCValueMixedflg(), "MIXEDFLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MIXEDFLG: {char(1), default=[(0)]} <br>
     * <pre>e.g. setMixedflg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param mixedflg The value of mixedflg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setMixedflg_LikeSearch(String mixedflg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(mixedflg), xgetCValueMixedflg(), "MIXEDFLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MIXEDFLG: {char(1), default=[(0)]}
     * @param mixedflg The value of mixedflg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setMixedflg_NotLikeSearch(String mixedflg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(mixedflg), xgetCValueMixedflg(), "MIXEDFLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MIXEDFLG: {char(1), default=[(0)]}
     * @param mixedflg The value of mixedflg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMixedflg_PrefixSearch(String mixedflg) {
        setMixedflg_LikeSearch(mixedflg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MIXEDFLG: {char(1), default=[(0)]}
     */
    public void setMixedflg_IsNull() { regMixedflg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MIXEDFLG: {char(1), default=[(0)]}
     */
    public void setMixedflg_IsNotNull() { regMixedflg(CK_ISNN, DOBJ); }

    protected void regMixedflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMixedflg(), "MIXEDFLG"); }
    protected abstract ConditionValue xgetCValueMixedflg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPEDFLG: {char(1), default=[(0)]}
     * @param shippedflg The value of shippedflg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippedflg_Equal(String shippedflg) {
        doSetShippedflg_Equal(fRES(shippedflg));
    }

    protected void doSetShippedflg_Equal(String shippedflg) {
        regShippedflg(CK_EQ, shippedflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPEDFLG: {char(1), default=[(0)]}
     * @param shippedflg The value of shippedflg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippedflg_NotEqual(String shippedflg) {
        doSetShippedflg_NotEqual(fRES(shippedflg));
    }

    protected void doSetShippedflg_NotEqual(String shippedflg) {
        regShippedflg(CK_NES, shippedflg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPEDFLG: {char(1), default=[(0)]}
     * @param shippedflg The value of shippedflg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippedflg_GreaterThan(String shippedflg) {
        regShippedflg(CK_GT, fRES(shippedflg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPEDFLG: {char(1), default=[(0)]}
     * @param shippedflg The value of shippedflg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippedflg_LessThan(String shippedflg) {
        regShippedflg(CK_LT, fRES(shippedflg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPEDFLG: {char(1), default=[(0)]}
     * @param shippedflg The value of shippedflg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippedflg_GreaterEqual(String shippedflg) {
        regShippedflg(CK_GE, fRES(shippedflg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPEDFLG: {char(1), default=[(0)]}
     * @param shippedflg The value of shippedflg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippedflg_LessEqual(String shippedflg) {
        regShippedflg(CK_LE, fRES(shippedflg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPPEDFLG: {char(1), default=[(0)]}
     * @param shippedflgList The collection of shippedflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippedflg_InScope(Collection<String> shippedflgList) {
        doSetShippedflg_InScope(shippedflgList);
    }

    protected void doSetShippedflg_InScope(Collection<String> shippedflgList) {
        regINS(CK_INS, cTL(shippedflgList), xgetCValueShippedflg(), "SHIPPEDFLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPPEDFLG: {char(1), default=[(0)]}
     * @param shippedflgList The collection of shippedflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippedflg_NotInScope(Collection<String> shippedflgList) {
        doSetShippedflg_NotInScope(shippedflgList);
    }

    protected void doSetShippedflg_NotInScope(Collection<String> shippedflgList) {
        regINS(CK_NINS, cTL(shippedflgList), xgetCValueShippedflg(), "SHIPPEDFLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPPEDFLG: {char(1), default=[(0)]} <br>
     * <pre>e.g. setShippedflg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param shippedflg The value of shippedflg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setShippedflg_LikeSearch(String shippedflg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(shippedflg), xgetCValueShippedflg(), "SHIPPEDFLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPPEDFLG: {char(1), default=[(0)]}
     * @param shippedflg The value of shippedflg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setShippedflg_NotLikeSearch(String shippedflg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shippedflg), xgetCValueShippedflg(), "SHIPPEDFLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPPEDFLG: {char(1), default=[(0)]}
     * @param shippedflg The value of shippedflg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippedflg_PrefixSearch(String shippedflg) {
        setShippedflg_LikeSearch(shippedflg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIPPEDFLG: {char(1), default=[(0)]}
     */
    public void setShippedflg_IsNull() { regShippedflg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIPPEDFLG: {char(1), default=[(0)]}
     */
    public void setShippedflg_IsNotNull() { regShippedflg(CK_ISNN, DOBJ); }

    protected void regShippedflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShippedflg(), "SHIPPEDFLG"); }
    protected abstract ConditionValue xgetCValueShippedflg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASECREATETYPE: {NotNull, varchar(30)}
     * @param casecreatetype The value of casecreatetype as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasecreatetype_Equal(String casecreatetype) {
        doSetCasecreatetype_Equal(fRES(casecreatetype));
    }

    protected void doSetCasecreatetype_Equal(String casecreatetype) {
        regCasecreatetype(CK_EQ, casecreatetype);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASECREATETYPE: {NotNull, varchar(30)}
     * @param casecreatetype The value of casecreatetype as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasecreatetype_NotEqual(String casecreatetype) {
        doSetCasecreatetype_NotEqual(fRES(casecreatetype));
    }

    protected void doSetCasecreatetype_NotEqual(String casecreatetype) {
        regCasecreatetype(CK_NES, casecreatetype);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASECREATETYPE: {NotNull, varchar(30)}
     * @param casecreatetype The value of casecreatetype as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasecreatetype_GreaterThan(String casecreatetype) {
        regCasecreatetype(CK_GT, fRES(casecreatetype));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASECREATETYPE: {NotNull, varchar(30)}
     * @param casecreatetype The value of casecreatetype as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasecreatetype_LessThan(String casecreatetype) {
        regCasecreatetype(CK_LT, fRES(casecreatetype));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASECREATETYPE: {NotNull, varchar(30)}
     * @param casecreatetype The value of casecreatetype as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasecreatetype_GreaterEqual(String casecreatetype) {
        regCasecreatetype(CK_GE, fRES(casecreatetype));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASECREATETYPE: {NotNull, varchar(30)}
     * @param casecreatetype The value of casecreatetype as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasecreatetype_LessEqual(String casecreatetype) {
        regCasecreatetype(CK_LE, fRES(casecreatetype));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CASECREATETYPE: {NotNull, varchar(30)}
     * @param casecreatetypeList The collection of casecreatetype as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasecreatetype_InScope(Collection<String> casecreatetypeList) {
        doSetCasecreatetype_InScope(casecreatetypeList);
    }

    protected void doSetCasecreatetype_InScope(Collection<String> casecreatetypeList) {
        regINS(CK_INS, cTL(casecreatetypeList), xgetCValueCasecreatetype(), "CASECREATETYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CASECREATETYPE: {NotNull, varchar(30)}
     * @param casecreatetypeList The collection of casecreatetype as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasecreatetype_NotInScope(Collection<String> casecreatetypeList) {
        doSetCasecreatetype_NotInScope(casecreatetypeList);
    }

    protected void doSetCasecreatetype_NotInScope(Collection<String> casecreatetypeList) {
        regINS(CK_NINS, cTL(casecreatetypeList), xgetCValueCasecreatetype(), "CASECREATETYPE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CASECREATETYPE: {NotNull, varchar(30)} <br>
     * <pre>e.g. setCasecreatetype_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param casecreatetype The value of casecreatetype as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCasecreatetype_LikeSearch(String casecreatetype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(casecreatetype), xgetCValueCasecreatetype(), "CASECREATETYPE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CASECREATETYPE: {NotNull, varchar(30)}
     * @param casecreatetype The value of casecreatetype as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCasecreatetype_NotLikeSearch(String casecreatetype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(casecreatetype), xgetCValueCasecreatetype(), "CASECREATETYPE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CASECREATETYPE: {NotNull, varchar(30)}
     * @param casecreatetype The value of casecreatetype as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasecreatetype_PrefixSearch(String casecreatetype) {
        setCasecreatetype_LikeSearch(casecreatetype, xcLSOPPre());
    }

    protected void regCasecreatetype(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCasecreatetype(), "CASECREATETYPE"); }
    protected abstract ConditionValue xgetCValueCasecreatetype();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CREATEDATETIME: {datetime2(26, 6)}
     * @param createdatetime The value of createdatetime as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCreatedatetime_Equal(java.sql.Timestamp createdatetime) {
        regCreatedatetime(CK_EQ,  createdatetime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CREATEDATETIME: {datetime2(26, 6)}
     * @param createdatetime The value of createdatetime as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCreatedatetime_GreaterThan(java.sql.Timestamp createdatetime) {
        regCreatedatetime(CK_GT,  createdatetime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CREATEDATETIME: {datetime2(26, 6)}
     * @param createdatetime The value of createdatetime as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCreatedatetime_LessThan(java.sql.Timestamp createdatetime) {
        regCreatedatetime(CK_LT,  createdatetime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CREATEDATETIME: {datetime2(26, 6)}
     * @param createdatetime The value of createdatetime as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCreatedatetime_GreaterEqual(java.sql.Timestamp createdatetime) {
        regCreatedatetime(CK_GE,  createdatetime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CREATEDATETIME: {datetime2(26, 6)}
     * @param createdatetime The value of createdatetime as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCreatedatetime_LessEqual(java.sql.Timestamp createdatetime) {
        regCreatedatetime(CK_LE, createdatetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CREATEDATETIME: {datetime2(26, 6)}
     * <pre>e.g. setCreatedatetime_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of createdatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of createdatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setCreatedatetime_FromTo(Date fromDatetime, Date toDatetime, FromToOption fromToOption) {
        regFTQ((fromDatetime != null ? new java.sql.Timestamp(fromDatetime.getTime()) : null), (toDatetime != null ? new java.sql.Timestamp(toDatetime.getTime()) : null), xgetCValueCreatedatetime(), "CREATEDATETIME", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CREATEDATETIME: {datetime2(26, 6)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #CC4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of createdatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDate The to-date(yyyy/MM/dd) of createdatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     */
    public void setCreatedatetime_DateFromTo(Date fromDate, Date toDate) {
        setCreatedatetime_FromTo(fromDate, toDate, xcDFTOP());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CREATEDATETIME: {datetime2(26, 6)}
     */
    public void setCreatedatetime_IsNull() { regCreatedatetime(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CREATEDATETIME: {datetime2(26, 6)}
     */
    public void setCreatedatetime_IsNotNull() { regCreatedatetime(CK_ISNN, DOBJ); }

    protected void regCreatedatetime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCreatedatetime(), "CREATEDATETIME"); }
    protected abstract ConditionValue xgetCValueCreatedatetime();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * InitNum: {bigint(19)}
     * @param initnum The value of initnum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setInitnum_Equal(Long initnum) {
        doSetInitnum_Equal(initnum);
    }

    protected void doSetInitnum_Equal(Long initnum) {
        regInitnum(CK_EQ, initnum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * InitNum: {bigint(19)}
     * @param initnum The value of initnum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInitnum_NotEqual(Long initnum) {
        doSetInitnum_NotEqual(initnum);
    }

    protected void doSetInitnum_NotEqual(Long initnum) {
        regInitnum(CK_NES, initnum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * InitNum: {bigint(19)}
     * @param initnum The value of initnum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInitnum_GreaterThan(Long initnum) {
        regInitnum(CK_GT, initnum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * InitNum: {bigint(19)}
     * @param initnum The value of initnum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInitnum_LessThan(Long initnum) {
        regInitnum(CK_LT, initnum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * InitNum: {bigint(19)}
     * @param initnum The value of initnum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInitnum_GreaterEqual(Long initnum) {
        regInitnum(CK_GE, initnum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * InitNum: {bigint(19)}
     * @param initnum The value of initnum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInitnum_LessEqual(Long initnum) {
        regInitnum(CK_LE, initnum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * InitNum: {bigint(19)}
     * @param minNumber The min number of initnum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of initnum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setInitnum_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueInitnum(), "InitNum", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * InitNum: {bigint(19)}
     * @param initnumList The collection of initnum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInitnum_InScope(Collection<Long> initnumList) {
        doSetInitnum_InScope(initnumList);
    }

    protected void doSetInitnum_InScope(Collection<Long> initnumList) {
        regINS(CK_INS, cTL(initnumList), xgetCValueInitnum(), "InitNum");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * InitNum: {bigint(19)}
     * @param initnumList The collection of initnum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInitnum_NotInScope(Collection<Long> initnumList) {
        doSetInitnum_NotInScope(initnumList);
    }

    protected void doSetInitnum_NotInScope(Collection<Long> initnumList) {
        regINS(CK_NINS, cTL(initnumList), xgetCValueInitnum(), "InitNum");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * InitNum: {bigint(19)}
     */
    public void setInitnum_IsNull() { regInitnum(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * InitNum: {bigint(19)}
     */
    public void setInitnum_IsNotNull() { regInitnum(CK_ISNN, DOBJ); }

    protected void regInitnum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInitnum(), "InitNum"); }
    protected abstract ConditionValue xgetCValueInitnum();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ParentCaseCd: {bigint(19)}
     * @param parentcasecd The value of parentcasecd as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setParentcasecd_Equal(Long parentcasecd) {
        doSetParentcasecd_Equal(parentcasecd);
    }

    protected void doSetParentcasecd_Equal(Long parentcasecd) {
        regParentcasecd(CK_EQ, parentcasecd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ParentCaseCd: {bigint(19)}
     * @param parentcasecd The value of parentcasecd as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setParentcasecd_NotEqual(Long parentcasecd) {
        doSetParentcasecd_NotEqual(parentcasecd);
    }

    protected void doSetParentcasecd_NotEqual(Long parentcasecd) {
        regParentcasecd(CK_NES, parentcasecd);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ParentCaseCd: {bigint(19)}
     * @param parentcasecd The value of parentcasecd as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setParentcasecd_GreaterThan(Long parentcasecd) {
        regParentcasecd(CK_GT, parentcasecd);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ParentCaseCd: {bigint(19)}
     * @param parentcasecd The value of parentcasecd as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setParentcasecd_LessThan(Long parentcasecd) {
        regParentcasecd(CK_LT, parentcasecd);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ParentCaseCd: {bigint(19)}
     * @param parentcasecd The value of parentcasecd as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setParentcasecd_GreaterEqual(Long parentcasecd) {
        regParentcasecd(CK_GE, parentcasecd);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ParentCaseCd: {bigint(19)}
     * @param parentcasecd The value of parentcasecd as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setParentcasecd_LessEqual(Long parentcasecd) {
        regParentcasecd(CK_LE, parentcasecd);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ParentCaseCd: {bigint(19)}
     * @param minNumber The min number of parentcasecd. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of parentcasecd. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setParentcasecd_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueParentcasecd(), "ParentCaseCd", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ParentCaseCd: {bigint(19)}
     * @param parentcasecdList The collection of parentcasecd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setParentcasecd_InScope(Collection<Long> parentcasecdList) {
        doSetParentcasecd_InScope(parentcasecdList);
    }

    protected void doSetParentcasecd_InScope(Collection<Long> parentcasecdList) {
        regINS(CK_INS, cTL(parentcasecdList), xgetCValueParentcasecd(), "ParentCaseCd");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ParentCaseCd: {bigint(19)}
     * @param parentcasecdList The collection of parentcasecd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setParentcasecd_NotInScope(Collection<Long> parentcasecdList) {
        doSetParentcasecd_NotInScope(parentcasecdList);
    }

    protected void doSetParentcasecd_NotInScope(Collection<Long> parentcasecdList) {
        regINS(CK_NINS, cTL(parentcasecdList), xgetCValueParentcasecd(), "ParentCaseCd");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ParentCaseCd: {bigint(19)}
     */
    public void setParentcasecd_IsNull() { regParentcasecd(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ParentCaseCd: {bigint(19)}
     */
    public void setParentcasecd_IsNotNull() { regParentcasecd(CK_ISNN, DOBJ); }

    protected void regParentcasecd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueParentcasecd(), "ParentCaseCd"); }
    protected abstract ConditionValue xgetCValueParentcasecd();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TR_PICKLIST_ID: {bigint(19)}
     * @param trPicklistId The value of trPicklistId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrPicklistId_Equal(Long trPicklistId) {
        doSetTrPicklistId_Equal(trPicklistId);
    }

    protected void doSetTrPicklistId_Equal(Long trPicklistId) {
        regTrPicklistId(CK_EQ, trPicklistId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TR_PICKLIST_ID: {bigint(19)}
     * @param trPicklistId The value of trPicklistId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrPicklistId_NotEqual(Long trPicklistId) {
        doSetTrPicklistId_NotEqual(trPicklistId);
    }

    protected void doSetTrPicklistId_NotEqual(Long trPicklistId) {
        regTrPicklistId(CK_NES, trPicklistId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TR_PICKLIST_ID: {bigint(19)}
     * @param trPicklistId The value of trPicklistId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrPicklistId_GreaterThan(Long trPicklistId) {
        regTrPicklistId(CK_GT, trPicklistId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TR_PICKLIST_ID: {bigint(19)}
     * @param trPicklistId The value of trPicklistId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrPicklistId_LessThan(Long trPicklistId) {
        regTrPicklistId(CK_LT, trPicklistId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TR_PICKLIST_ID: {bigint(19)}
     * @param trPicklistId The value of trPicklistId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrPicklistId_GreaterEqual(Long trPicklistId) {
        regTrPicklistId(CK_GE, trPicklistId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TR_PICKLIST_ID: {bigint(19)}
     * @param trPicklistId The value of trPicklistId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrPicklistId_LessEqual(Long trPicklistId) {
        regTrPicklistId(CK_LE, trPicklistId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TR_PICKLIST_ID: {bigint(19)}
     * @param minNumber The min number of trPicklistId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of trPicklistId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTrPicklistId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTrPicklistId(), "TR_PICKLIST_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TR_PICKLIST_ID: {bigint(19)}
     * @param trPicklistIdList The collection of trPicklistId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrPicklistId_InScope(Collection<Long> trPicklistIdList) {
        doSetTrPicklistId_InScope(trPicklistIdList);
    }

    protected void doSetTrPicklistId_InScope(Collection<Long> trPicklistIdList) {
        regINS(CK_INS, cTL(trPicklistIdList), xgetCValueTrPicklistId(), "TR_PICKLIST_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TR_PICKLIST_ID: {bigint(19)}
     * @param trPicklistIdList The collection of trPicklistId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrPicklistId_NotInScope(Collection<Long> trPicklistIdList) {
        doSetTrPicklistId_NotInScope(trPicklistIdList);
    }

    protected void doSetTrPicklistId_NotInScope(Collection<Long> trPicklistIdList) {
        regINS(CK_NINS, cTL(trPicklistIdList), xgetCValueTrPicklistId(), "TR_PICKLIST_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TR_PICKLIST_ID: {bigint(19)}
     */
    public void setTrPicklistId_IsNull() { regTrPicklistId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TR_PICKLIST_ID: {bigint(19)}
     */
    public void setTrPicklistId_IsNotNull() { regTrPicklistId(CK_ISNN, DOBJ); }

    protected void regTrPicklistId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTrPicklistId(), "TR_PICKLIST_ID"); }
    protected abstract ConditionValue xgetCValueTrPicklistId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PicklistGNo: {bigint(19)}
     * @param picklistgno The value of picklistgno as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPicklistgno_Equal(Long picklistgno) {
        doSetPicklistgno_Equal(picklistgno);
    }

    protected void doSetPicklistgno_Equal(Long picklistgno) {
        regPicklistgno(CK_EQ, picklistgno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PicklistGNo: {bigint(19)}
     * @param picklistgno The value of picklistgno as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPicklistgno_NotEqual(Long picklistgno) {
        doSetPicklistgno_NotEqual(picklistgno);
    }

    protected void doSetPicklistgno_NotEqual(Long picklistgno) {
        regPicklistgno(CK_NES, picklistgno);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PicklistGNo: {bigint(19)}
     * @param picklistgno The value of picklistgno as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPicklistgno_GreaterThan(Long picklistgno) {
        regPicklistgno(CK_GT, picklistgno);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PicklistGNo: {bigint(19)}
     * @param picklistgno The value of picklistgno as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPicklistgno_LessThan(Long picklistgno) {
        regPicklistgno(CK_LT, picklistgno);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PicklistGNo: {bigint(19)}
     * @param picklistgno The value of picklistgno as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPicklistgno_GreaterEqual(Long picklistgno) {
        regPicklistgno(CK_GE, picklistgno);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PicklistGNo: {bigint(19)}
     * @param picklistgno The value of picklistgno as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPicklistgno_LessEqual(Long picklistgno) {
        regPicklistgno(CK_LE, picklistgno);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PicklistGNo: {bigint(19)}
     * @param minNumber The min number of picklistgno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of picklistgno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPicklistgno_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePicklistgno(), "PicklistGNo", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PicklistGNo: {bigint(19)}
     * @param picklistgnoList The collection of picklistgno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPicklistgno_InScope(Collection<Long> picklistgnoList) {
        doSetPicklistgno_InScope(picklistgnoList);
    }

    protected void doSetPicklistgno_InScope(Collection<Long> picklistgnoList) {
        regINS(CK_INS, cTL(picklistgnoList), xgetCValuePicklistgno(), "PicklistGNo");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PicklistGNo: {bigint(19)}
     * @param picklistgnoList The collection of picklistgno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPicklistgno_NotInScope(Collection<Long> picklistgnoList) {
        doSetPicklistgno_NotInScope(picklistgnoList);
    }

    protected void doSetPicklistgno_NotInScope(Collection<Long> picklistgnoList) {
        regINS(CK_NINS, cTL(picklistgnoList), xgetCValuePicklistgno(), "PicklistGNo");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PicklistGNo: {bigint(19)}
     */
    public void setPicklistgno_IsNull() { regPicklistgno(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PicklistGNo: {bigint(19)}
     */
    public void setPicklistgno_IsNotNull() { regPicklistgno(CK_ISNN, DOBJ); }

    protected void regPicklistgno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePicklistgno(), "PicklistGNo"); }
    protected abstract ConditionValue xgetCValuePicklistgno();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * RecombDatetime: {datetime2(26, 6)}
     * @param recombdatetime The value of recombdatetime as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setRecombdatetime_Equal(java.sql.Timestamp recombdatetime) {
        regRecombdatetime(CK_EQ,  recombdatetime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RecombDatetime: {datetime2(26, 6)}
     * @param recombdatetime The value of recombdatetime as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRecombdatetime_GreaterThan(java.sql.Timestamp recombdatetime) {
        regRecombdatetime(CK_GT,  recombdatetime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RecombDatetime: {datetime2(26, 6)}
     * @param recombdatetime The value of recombdatetime as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRecombdatetime_LessThan(java.sql.Timestamp recombdatetime) {
        regRecombdatetime(CK_LT,  recombdatetime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RecombDatetime: {datetime2(26, 6)}
     * @param recombdatetime The value of recombdatetime as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRecombdatetime_GreaterEqual(java.sql.Timestamp recombdatetime) {
        regRecombdatetime(CK_GE,  recombdatetime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RecombDatetime: {datetime2(26, 6)}
     * @param recombdatetime The value of recombdatetime as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRecombdatetime_LessEqual(java.sql.Timestamp recombdatetime) {
        regRecombdatetime(CK_LE, recombdatetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * RecombDatetime: {datetime2(26, 6)}
     * <pre>e.g. setRecombdatetime_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of recombdatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of recombdatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setRecombdatetime_FromTo(Date fromDatetime, Date toDatetime, FromToOption fromToOption) {
        regFTQ((fromDatetime != null ? new java.sql.Timestamp(fromDatetime.getTime()) : null), (toDatetime != null ? new java.sql.Timestamp(toDatetime.getTime()) : null), xgetCValueRecombdatetime(), "RecombDatetime", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * RecombDatetime: {datetime2(26, 6)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #CC4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of recombdatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDate The to-date(yyyy/MM/dd) of recombdatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     */
    public void setRecombdatetime_DateFromTo(Date fromDate, Date toDate) {
        setRecombdatetime_FromTo(fromDate, toDate, xcDFTOP());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RecombDatetime: {datetime2(26, 6)}
     */
    public void setRecombdatetime_IsNull() { regRecombdatetime(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RecombDatetime: {datetime2(26, 6)}
     */
    public void setRecombdatetime_IsNotNull() { regRecombdatetime(CK_ISNN, DOBJ); }

    protected void regRecombdatetime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRecombdatetime(), "RecombDatetime"); }
    protected abstract ConditionValue xgetCValueRecombdatetime();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ReprintedFlg: {varchar(30)}
     * @param reprintedflg The value of reprintedflg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReprintedflg_Equal(String reprintedflg) {
        doSetReprintedflg_Equal(fRES(reprintedflg));
    }

    protected void doSetReprintedflg_Equal(String reprintedflg) {
        regReprintedflg(CK_EQ, reprintedflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ReprintedFlg: {varchar(30)}
     * @param reprintedflg The value of reprintedflg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReprintedflg_NotEqual(String reprintedflg) {
        doSetReprintedflg_NotEqual(fRES(reprintedflg));
    }

    protected void doSetReprintedflg_NotEqual(String reprintedflg) {
        regReprintedflg(CK_NES, reprintedflg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ReprintedFlg: {varchar(30)}
     * @param reprintedflg The value of reprintedflg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReprintedflg_GreaterThan(String reprintedflg) {
        regReprintedflg(CK_GT, fRES(reprintedflg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ReprintedFlg: {varchar(30)}
     * @param reprintedflg The value of reprintedflg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReprintedflg_LessThan(String reprintedflg) {
        regReprintedflg(CK_LT, fRES(reprintedflg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ReprintedFlg: {varchar(30)}
     * @param reprintedflg The value of reprintedflg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReprintedflg_GreaterEqual(String reprintedflg) {
        regReprintedflg(CK_GE, fRES(reprintedflg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ReprintedFlg: {varchar(30)}
     * @param reprintedflg The value of reprintedflg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReprintedflg_LessEqual(String reprintedflg) {
        regReprintedflg(CK_LE, fRES(reprintedflg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ReprintedFlg: {varchar(30)}
     * @param reprintedflgList The collection of reprintedflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReprintedflg_InScope(Collection<String> reprintedflgList) {
        doSetReprintedflg_InScope(reprintedflgList);
    }

    protected void doSetReprintedflg_InScope(Collection<String> reprintedflgList) {
        regINS(CK_INS, cTL(reprintedflgList), xgetCValueReprintedflg(), "ReprintedFlg");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ReprintedFlg: {varchar(30)}
     * @param reprintedflgList The collection of reprintedflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReprintedflg_NotInScope(Collection<String> reprintedflgList) {
        doSetReprintedflg_NotInScope(reprintedflgList);
    }

    protected void doSetReprintedflg_NotInScope(Collection<String> reprintedflgList) {
        regINS(CK_NINS, cTL(reprintedflgList), xgetCValueReprintedflg(), "ReprintedFlg");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ReprintedFlg: {varchar(30)} <br>
     * <pre>e.g. setReprintedflg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param reprintedflg The value of reprintedflg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setReprintedflg_LikeSearch(String reprintedflg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(reprintedflg), xgetCValueReprintedflg(), "ReprintedFlg", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ReprintedFlg: {varchar(30)}
     * @param reprintedflg The value of reprintedflg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setReprintedflg_NotLikeSearch(String reprintedflg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(reprintedflg), xgetCValueReprintedflg(), "ReprintedFlg", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ReprintedFlg: {varchar(30)}
     * @param reprintedflg The value of reprintedflg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReprintedflg_PrefixSearch(String reprintedflg) {
        setReprintedflg_LikeSearch(reprintedflg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ReprintedFlg: {varchar(30)}
     */
    public void setReprintedflg_IsNull() { regReprintedflg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ReprintedFlg: {varchar(30)}
     */
    public void setReprintedflg_IsNullOrEmpty() { regReprintedflg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ReprintedFlg: {varchar(30)}
     */
    public void setReprintedflg_IsNotNull() { regReprintedflg(CK_ISNN, DOBJ); }

    protected void regReprintedflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReprintedflg(), "ReprintedFlg"); }
    protected abstract ConditionValue xgetCValueReprintedflg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TraceSts: {bigint(19)}
     * @param tracests The value of tracests as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTracests_Equal(Long tracests) {
        doSetTracests_Equal(tracests);
    }

    protected void doSetTracests_Equal(Long tracests) {
        regTracests(CK_EQ, tracests);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TraceSts: {bigint(19)}
     * @param tracests The value of tracests as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTracests_NotEqual(Long tracests) {
        doSetTracests_NotEqual(tracests);
    }

    protected void doSetTracests_NotEqual(Long tracests) {
        regTracests(CK_NES, tracests);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TraceSts: {bigint(19)}
     * @param tracests The value of tracests as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTracests_GreaterThan(Long tracests) {
        regTracests(CK_GT, tracests);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TraceSts: {bigint(19)}
     * @param tracests The value of tracests as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTracests_LessThan(Long tracests) {
        regTracests(CK_LT, tracests);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TraceSts: {bigint(19)}
     * @param tracests The value of tracests as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTracests_GreaterEqual(Long tracests) {
        regTracests(CK_GE, tracests);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TraceSts: {bigint(19)}
     * @param tracests The value of tracests as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTracests_LessEqual(Long tracests) {
        regTracests(CK_LE, tracests);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TraceSts: {bigint(19)}
     * @param minNumber The min number of tracests. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of tracests. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTracests_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTracests(), "TraceSts", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TraceSts: {bigint(19)}
     * @param tracestsList The collection of tracests as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTracests_InScope(Collection<Long> tracestsList) {
        doSetTracests_InScope(tracestsList);
    }

    protected void doSetTracests_InScope(Collection<Long> tracestsList) {
        regINS(CK_INS, cTL(tracestsList), xgetCValueTracests(), "TraceSts");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TraceSts: {bigint(19)}
     * @param tracestsList The collection of tracests as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTracests_NotInScope(Collection<Long> tracestsList) {
        doSetTracests_NotInScope(tracestsList);
    }

    protected void doSetTracests_NotInScope(Collection<Long> tracestsList) {
        regINS(CK_NINS, cTL(tracestsList), xgetCValueTracests(), "TraceSts");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TraceSts: {bigint(19)}
     */
    public void setTracests_IsNull() { regTracests(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TraceSts: {bigint(19)}
     */
    public void setTracests_IsNotNull() { regTracests(CK_ISNN, DOBJ); }

    protected void regTracests(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTracests(), "TraceSts"); }
    protected abstract ConditionValue xgetCValueTracests();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {NotNull, bigint(19)}
     * @param clientId The value of clientId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_Equal(Long clientId) {
        doSetClientId_Equal(clientId);
    }

    protected void doSetClientId_Equal(Long clientId) {
        regClientId(CK_EQ, clientId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {NotNull, bigint(19)}
     * @param clientId The value of clientId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_NotEqual(Long clientId) {
        doSetClientId_NotEqual(clientId);
    }

    protected void doSetClientId_NotEqual(Long clientId) {
        regClientId(CK_NES, clientId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {NotNull, bigint(19)}
     * @param clientId The value of clientId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_GreaterThan(Long clientId) {
        regClientId(CK_GT, clientId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {NotNull, bigint(19)}
     * @param clientId The value of clientId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_LessThan(Long clientId) {
        regClientId(CK_LT, clientId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {NotNull, bigint(19)}
     * @param clientId The value of clientId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_GreaterEqual(Long clientId) {
        regClientId(CK_GE, clientId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {NotNull, bigint(19)}
     * @param clientId The value of clientId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_LessEqual(Long clientId) {
        regClientId(CK_LE, clientId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {NotNull, bigint(19)}
     * @param minNumber The min number of clientId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of clientId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setClientId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueClientId(), "CLIENT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CLIENT_ID: {NotNull, bigint(19)}
     * @param clientIdList The collection of clientId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientId_InScope(Collection<Long> clientIdList) {
        doSetClientId_InScope(clientIdList);
    }

    protected void doSetClientId_InScope(Collection<Long> clientIdList) {
        regINS(CK_INS, cTL(clientIdList), xgetCValueClientId(), "CLIENT_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CLIENT_ID: {NotNull, bigint(19)}
     * @param clientIdList The collection of clientId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientId_NotInScope(Collection<Long> clientIdList) {
        doSetClientId_NotInScope(clientIdList);
    }

    protected void doSetClientId_NotInScope(Collection<Long> clientIdList) {
        regINS(CK_NINS, cTL(clientIdList), xgetCValueClientId(), "CLIENT_ID");
    }

    protected void regClientId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueClientId(), "CLIENT_ID"); }
    protected abstract ConditionValue xgetCValueClientId();

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
     * SHTYPECD: {varchar(30)}
     * @param shtypecd The value of shtypecd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShtypecd_Equal(String shtypecd) {
        doSetShtypecd_Equal(fRES(shtypecd));
    }

    protected void doSetShtypecd_Equal(String shtypecd) {
        regShtypecd(CK_EQ, shtypecd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHTYPECD: {varchar(30)}
     * @param shtypecd The value of shtypecd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShtypecd_NotEqual(String shtypecd) {
        doSetShtypecd_NotEqual(fRES(shtypecd));
    }

    protected void doSetShtypecd_NotEqual(String shtypecd) {
        regShtypecd(CK_NES, shtypecd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHTYPECD: {varchar(30)}
     * @param shtypecd The value of shtypecd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShtypecd_GreaterThan(String shtypecd) {
        regShtypecd(CK_GT, fRES(shtypecd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHTYPECD: {varchar(30)}
     * @param shtypecd The value of shtypecd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShtypecd_LessThan(String shtypecd) {
        regShtypecd(CK_LT, fRES(shtypecd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHTYPECD: {varchar(30)}
     * @param shtypecd The value of shtypecd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShtypecd_GreaterEqual(String shtypecd) {
        regShtypecd(CK_GE, fRES(shtypecd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHTYPECD: {varchar(30)}
     * @param shtypecd The value of shtypecd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShtypecd_LessEqual(String shtypecd) {
        regShtypecd(CK_LE, fRES(shtypecd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHTYPECD: {varchar(30)}
     * @param shtypecdList The collection of shtypecd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShtypecd_InScope(Collection<String> shtypecdList) {
        doSetShtypecd_InScope(shtypecdList);
    }

    protected void doSetShtypecd_InScope(Collection<String> shtypecdList) {
        regINS(CK_INS, cTL(shtypecdList), xgetCValueShtypecd(), "SHTYPECD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHTYPECD: {varchar(30)}
     * @param shtypecdList The collection of shtypecd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShtypecd_NotInScope(Collection<String> shtypecdList) {
        doSetShtypecd_NotInScope(shtypecdList);
    }

    protected void doSetShtypecd_NotInScope(Collection<String> shtypecdList) {
        regINS(CK_NINS, cTL(shtypecdList), xgetCValueShtypecd(), "SHTYPECD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHTYPECD: {varchar(30)} <br>
     * <pre>e.g. setShtypecd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param shtypecd The value of shtypecd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setShtypecd_LikeSearch(String shtypecd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(shtypecd), xgetCValueShtypecd(), "SHTYPECD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHTYPECD: {varchar(30)}
     * @param shtypecd The value of shtypecd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setShtypecd_NotLikeSearch(String shtypecd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shtypecd), xgetCValueShtypecd(), "SHTYPECD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHTYPECD: {varchar(30)}
     * @param shtypecd The value of shtypecd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShtypecd_PrefixSearch(String shtypecd) {
        setShtypecd_LikeSearch(shtypecd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHTYPECD: {varchar(30)}
     */
    public void setShtypecd_IsNull() { regShtypecd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SHTYPECD: {varchar(30)}
     */
    public void setShtypecd_IsNullOrEmpty() { regShtypecd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHTYPECD: {varchar(30)}
     */
    public void setShtypecd_IsNotNull() { regShtypecd(CK_ISNN, DOBJ); }

    protected void regShtypecd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShtypecd(), "SHTYPECD"); }
    protected abstract ConditionValue xgetCValueShtypecd();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {bigint(19)}
     * @param centerId The value of centerId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_Equal(Long centerId) {
        doSetCenterId_Equal(centerId);
    }

    protected void doSetCenterId_Equal(Long centerId) {
        regCenterId(CK_EQ, centerId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {bigint(19)}
     * @param centerId The value of centerId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_NotEqual(Long centerId) {
        doSetCenterId_NotEqual(centerId);
    }

    protected void doSetCenterId_NotEqual(Long centerId) {
        regCenterId(CK_NES, centerId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {bigint(19)}
     * @param centerId The value of centerId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_GreaterThan(Long centerId) {
        regCenterId(CK_GT, centerId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {bigint(19)}
     * @param centerId The value of centerId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_LessThan(Long centerId) {
        regCenterId(CK_LT, centerId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {bigint(19)}
     * @param centerId The value of centerId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_GreaterEqual(Long centerId) {
        regCenterId(CK_GE, centerId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {bigint(19)}
     * @param centerId The value of centerId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_LessEqual(Long centerId) {
        regCenterId(CK_LE, centerId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {bigint(19)}
     * @param minNumber The min number of centerId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of centerId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCenterId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCenterId(), "CENTER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CENTER_ID: {bigint(19)}
     * @param centerIdList The collection of centerId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterId_InScope(Collection<Long> centerIdList) {
        doSetCenterId_InScope(centerIdList);
    }

    protected void doSetCenterId_InScope(Collection<Long> centerIdList) {
        regINS(CK_INS, cTL(centerIdList), xgetCValueCenterId(), "CENTER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CENTER_ID: {bigint(19)}
     * @param centerIdList The collection of centerId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterId_NotInScope(Collection<Long> centerIdList) {
        doSetCenterId_NotInScope(centerIdList);
    }

    protected void doSetCenterId_NotInScope(Collection<Long> centerIdList) {
        regINS(CK_NINS, cTL(centerIdList), xgetCValueCenterId(), "CENTER_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CENTER_ID: {bigint(19)}
     */
    public void setCenterId_IsNull() { regCenterId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CENTER_ID: {bigint(19)}
     */
    public void setCenterId_IsNotNull() { regCenterId(CK_ISNN, DOBJ); }

    protected void regCenterId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCenterId(), "CENTER_ID"); }
    protected abstract ConditionValue xgetCValueCenterId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * RESTCTN: {decimal(16, 6)}
     * @param restctn The value of restctn as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setRestctn_Equal(java.math.BigDecimal restctn) {
        doSetRestctn_Equal(restctn);
    }

    protected void doSetRestctn_Equal(java.math.BigDecimal restctn) {
        regRestctn(CK_EQ, restctn);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RESTCTN: {decimal(16, 6)}
     * @param restctn The value of restctn as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRestctn_NotEqual(java.math.BigDecimal restctn) {
        doSetRestctn_NotEqual(restctn);
    }

    protected void doSetRestctn_NotEqual(java.math.BigDecimal restctn) {
        regRestctn(CK_NES, restctn);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RESTCTN: {decimal(16, 6)}
     * @param restctn The value of restctn as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRestctn_GreaterThan(java.math.BigDecimal restctn) {
        regRestctn(CK_GT, restctn);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RESTCTN: {decimal(16, 6)}
     * @param restctn The value of restctn as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRestctn_LessThan(java.math.BigDecimal restctn) {
        regRestctn(CK_LT, restctn);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RESTCTN: {decimal(16, 6)}
     * @param restctn The value of restctn as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRestctn_GreaterEqual(java.math.BigDecimal restctn) {
        regRestctn(CK_GE, restctn);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RESTCTN: {decimal(16, 6)}
     * @param restctn The value of restctn as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRestctn_LessEqual(java.math.BigDecimal restctn) {
        regRestctn(CK_LE, restctn);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * RESTCTN: {decimal(16, 6)}
     * @param minNumber The min number of restctn. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of restctn. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setRestctn_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueRestctn(), "RESTCTN", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RESTCTN: {decimal(16, 6)}
     * @param restctnList The collection of restctn as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRestctn_InScope(Collection<java.math.BigDecimal> restctnList) {
        doSetRestctn_InScope(restctnList);
    }

    protected void doSetRestctn_InScope(Collection<java.math.BigDecimal> restctnList) {
        regINS(CK_INS, cTL(restctnList), xgetCValueRestctn(), "RESTCTN");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RESTCTN: {decimal(16, 6)}
     * @param restctnList The collection of restctn as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRestctn_NotInScope(Collection<java.math.BigDecimal> restctnList) {
        doSetRestctn_NotInScope(restctnList);
    }

    protected void doSetRestctn_NotInScope(Collection<java.math.BigDecimal> restctnList) {
        regINS(CK_NINS, cTL(restctnList), xgetCValueRestctn(), "RESTCTN");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RESTCTN: {decimal(16, 6)}
     */
    public void setRestctn_IsNull() { regRestctn(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RESTCTN: {decimal(16, 6)}
     */
    public void setRestctn_IsNotNull() { regRestctn(CK_ISNN, DOBJ); }

    protected void regRestctn(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRestctn(), "RESTCTN"); }
    protected abstract ConditionValue xgetCValueRestctn();

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
    public HpSLCFunction<TTrsymbolCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TTrsymbolCB.class);
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
    public HpSLCFunction<TTrsymbolCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TTrsymbolCB.class);
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
    public HpSLCFunction<TTrsymbolCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TTrsymbolCB.class);
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
    public HpSLCFunction<TTrsymbolCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TTrsymbolCB.class);
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
    public HpSLCFunction<TTrsymbolCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TTrsymbolCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TTrsymbolCB&gt;() {
     *     public void query(TTrsymbolCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TTrsymbolCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TTrsymbolCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrsymbolCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TTrsymbolCQ sq);

    protected TTrsymbolCB xcreateScalarConditionCB() {
        TTrsymbolCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TTrsymbolCB xcreateScalarConditionPartitionByCB() {
        TTrsymbolCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TTrsymbolCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrsymbolCB cb = new TTrsymbolCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "TRSYMBOL_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TTrsymbolCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TTrsymbolCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TTrsymbolCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrsymbolCB cb = new TTrsymbolCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "TRSYMBOL_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TTrsymbolCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TTrsymbolCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTrsymbolCB cb = new TTrsymbolCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TTrsymbolCQ sq);

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
    protected TTrsymbolCB newMyCB() {
        return new TTrsymbolCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TTrsymbolCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
