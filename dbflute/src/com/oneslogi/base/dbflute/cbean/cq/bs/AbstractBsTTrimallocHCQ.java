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
 * The abstract condition-query of T_TRIMALLOC_H.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTTrimallocHCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTTrimallocHCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "T_TRIMALLOC_H";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRIMALLOC_H_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trimallocHId The value of trimallocHId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrimallocHId_Equal(Long trimallocHId) {
        doSetTrimallocHId_Equal(trimallocHId);
    }

    protected void doSetTrimallocHId_Equal(Long trimallocHId) {
        regTrimallocHId(CK_EQ, trimallocHId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRIMALLOC_H_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trimallocHId The value of trimallocHId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrimallocHId_NotEqual(Long trimallocHId) {
        doSetTrimallocHId_NotEqual(trimallocHId);
    }

    protected void doSetTrimallocHId_NotEqual(Long trimallocHId) {
        regTrimallocHId(CK_NES, trimallocHId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRIMALLOC_H_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trimallocHId The value of trimallocHId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrimallocHId_GreaterThan(Long trimallocHId) {
        regTrimallocHId(CK_GT, trimallocHId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRIMALLOC_H_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trimallocHId The value of trimallocHId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrimallocHId_LessThan(Long trimallocHId) {
        regTrimallocHId(CK_LT, trimallocHId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRIMALLOC_H_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trimallocHId The value of trimallocHId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrimallocHId_GreaterEqual(Long trimallocHId) {
        regTrimallocHId(CK_GE, trimallocHId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRIMALLOC_H_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trimallocHId The value of trimallocHId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrimallocHId_LessEqual(Long trimallocHId) {
        regTrimallocHId(CK_LE, trimallocHId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TRIMALLOC_H_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of trimallocHId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of trimallocHId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTrimallocHId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTrimallocHId(), "TRIMALLOC_H_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRIMALLOC_H_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trimallocHIdList The collection of trimallocHId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrimallocHId_InScope(Collection<Long> trimallocHIdList) {
        doSetTrimallocHId_InScope(trimallocHIdList);
    }

    protected void doSetTrimallocHId_InScope(Collection<Long> trimallocHIdList) {
        regINS(CK_INS, cTL(trimallocHIdList), xgetCValueTrimallocHId(), "TRIMALLOC_H_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRIMALLOC_H_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trimallocHIdList The collection of trimallocHId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrimallocHId_NotInScope(Collection<Long> trimallocHIdList) {
        doSetTrimallocHId_NotInScope(trimallocHIdList);
    }

    protected void doSetTrimallocHId_NotInScope(Collection<Long> trimallocHIdList) {
        regINS(CK_NINS, cTL(trimallocHIdList), xgetCValueTrimallocHId(), "TRIMALLOC_H_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select TRIMALLOC_H_ID from T_TRIMALLOCSCHKRI where ...)} <br>
     * T_TRIMALLOCSCHKRI by TRIMALLOC_H_ID, named 'TTrimallocschkriAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTTrimallocschkriList</span>(trimallocschkriCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     trimallocschkriCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TTrimallocschkriList for 'exists'. (NotNull)
     */
    public void existsTTrimallocschkriList(SubQuery<TTrimallocschkriCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTrimallocschkriCB cb = new TTrimallocschkriCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepTrimallocHId_ExistsReferrer_TTrimallocschkriList(cb.query());
        registerExistsReferrer(cb.query(), "TRIMALLOC_H_ID", "TRIMALLOC_H_ID", pp, "tTrimallocschkriList");
    }
    public abstract String keepTrimallocHId_ExistsReferrer_TTrimallocschkriList(TTrimallocschkriCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select TRIMALLOC_H_ID from T_TRIMALLOCSCHKRI where ...)} <br>
     * T_TRIMALLOCSCHKRI by TRIMALLOC_H_ID, named 'TTrimallocschkriAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTTrimallocschkriList</span>(trimallocschkriCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     trimallocschkriCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TrimallocHId_NotExistsReferrer_TTrimallocschkriList for 'not exists'. (NotNull)
     */
    public void notExistsTTrimallocschkriList(SubQuery<TTrimallocschkriCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTrimallocschkriCB cb = new TTrimallocschkriCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepTrimallocHId_NotExistsReferrer_TTrimallocschkriList(cb.query());
        registerNotExistsReferrer(cb.query(), "TRIMALLOC_H_ID", "TRIMALLOC_H_ID", pp, "tTrimallocschkriList");
    }
    public abstract String keepTrimallocHId_NotExistsReferrer_TTrimallocschkriList(TTrimallocschkriCQ sq);

    public void xsderiveTTrimallocschkriList(String fn, SubQuery<TTrimallocschkriCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrimallocschkriCB cb = new TTrimallocschkriCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepTrimallocHId_SpecifyDerivedReferrer_TTrimallocschkriList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "TRIMALLOC_H_ID", "TRIMALLOC_H_ID", pp, "tTrimallocschkriList", al, op);
    }
    public abstract String keepTrimallocHId_SpecifyDerivedReferrer_TTrimallocschkriList(TTrimallocschkriCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_TRIMALLOCSCHKRI where ...)} <br>
     * T_TRIMALLOCSCHKRI by TRIMALLOC_H_ID, named 'TTrimallocschkriAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTTrimallocschkriList()</span>.<span style="color: #CC4747">max</span>(trimallocschkriCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     trimallocschkriCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     trimallocschkriCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TTrimallocschkriCB> derivedTTrimallocschkriList() {
        return xcreateQDRFunctionTTrimallocschkriList();
    }
    protected HpQDRFunction<TTrimallocschkriCB> xcreateQDRFunctionTTrimallocschkriList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTTrimallocschkriList(fn, sq, rd, vl, op));
    }
    public void xqderiveTTrimallocschkriList(String fn, SubQuery<TTrimallocschkriCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrimallocschkriCB cb = new TTrimallocschkriCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepTrimallocHId_QueryDerivedReferrer_TTrimallocschkriList(cb.query()); String prpp = keepTrimallocHId_QueryDerivedReferrer_TTrimallocschkriListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "TRIMALLOC_H_ID", "TRIMALLOC_H_ID", sqpp, "tTrimallocschkriList", rd, vl, prpp, op);
    }
    public abstract String keepTrimallocHId_QueryDerivedReferrer_TTrimallocschkriList(TTrimallocschkriCQ sq);
    public abstract String keepTrimallocHId_QueryDerivedReferrer_TTrimallocschkriListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TRIMALLOC_H_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setTrimallocHId_IsNull() { regTrimallocHId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TRIMALLOC_H_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setTrimallocHId_IsNotNull() { regTrimallocHId(CK_ISNN, DOBJ); }

    protected void regTrimallocHId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTrimallocHId(), "TRIMALLOC_H_ID"); }
    protected abstract ConditionValue xgetCValueTrimallocHId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_IMP_KEY: {NotNull, bigint(19)}
     * @param allocImpKey The value of allocImpKey as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocImpKey_Equal(Long allocImpKey) {
        doSetAllocImpKey_Equal(allocImpKey);
    }

    protected void doSetAllocImpKey_Equal(Long allocImpKey) {
        regAllocImpKey(CK_EQ, allocImpKey);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_IMP_KEY: {NotNull, bigint(19)}
     * @param allocImpKey The value of allocImpKey as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocImpKey_NotEqual(Long allocImpKey) {
        doSetAllocImpKey_NotEqual(allocImpKey);
    }

    protected void doSetAllocImpKey_NotEqual(Long allocImpKey) {
        regAllocImpKey(CK_NES, allocImpKey);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_IMP_KEY: {NotNull, bigint(19)}
     * @param allocImpKey The value of allocImpKey as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocImpKey_GreaterThan(Long allocImpKey) {
        regAllocImpKey(CK_GT, allocImpKey);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_IMP_KEY: {NotNull, bigint(19)}
     * @param allocImpKey The value of allocImpKey as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocImpKey_LessThan(Long allocImpKey) {
        regAllocImpKey(CK_LT, allocImpKey);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_IMP_KEY: {NotNull, bigint(19)}
     * @param allocImpKey The value of allocImpKey as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocImpKey_GreaterEqual(Long allocImpKey) {
        regAllocImpKey(CK_GE, allocImpKey);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_IMP_KEY: {NotNull, bigint(19)}
     * @param allocImpKey The value of allocImpKey as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocImpKey_LessEqual(Long allocImpKey) {
        regAllocImpKey(CK_LE, allocImpKey);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_IMP_KEY: {NotNull, bigint(19)}
     * @param minNumber The min number of allocImpKey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of allocImpKey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setAllocImpKey_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueAllocImpKey(), "ALLOC_IMP_KEY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ALLOC_IMP_KEY: {NotNull, bigint(19)}
     * @param allocImpKeyList The collection of allocImpKey as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocImpKey_InScope(Collection<Long> allocImpKeyList) {
        doSetAllocImpKey_InScope(allocImpKeyList);
    }

    protected void doSetAllocImpKey_InScope(Collection<Long> allocImpKeyList) {
        regINS(CK_INS, cTL(allocImpKeyList), xgetCValueAllocImpKey(), "ALLOC_IMP_KEY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ALLOC_IMP_KEY: {NotNull, bigint(19)}
     * @param allocImpKeyList The collection of allocImpKey as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocImpKey_NotInScope(Collection<Long> allocImpKeyList) {
        doSetAllocImpKey_NotInScope(allocImpKeyList);
    }

    protected void doSetAllocImpKey_NotInScope(Collection<Long> allocImpKeyList) {
        regINS(CK_NINS, cTL(allocImpKeyList), xgetCValueAllocImpKey(), "ALLOC_IMP_KEY");
    }

    protected void regAllocImpKey(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAllocImpKey(), "ALLOC_IMP_KEY"); }
    protected abstract ConditionValue xgetCValueAllocImpKey();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSECD: {NotNull, varchar(30)}
     * @param warehousecd The value of warehousecd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousecd_Equal(String warehousecd) {
        doSetWarehousecd_Equal(fRES(warehousecd));
    }

    protected void doSetWarehousecd_Equal(String warehousecd) {
        regWarehousecd(CK_EQ, warehousecd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSECD: {NotNull, varchar(30)}
     * @param warehousecd The value of warehousecd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousecd_NotEqual(String warehousecd) {
        doSetWarehousecd_NotEqual(fRES(warehousecd));
    }

    protected void doSetWarehousecd_NotEqual(String warehousecd) {
        regWarehousecd(CK_NES, warehousecd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSECD: {NotNull, varchar(30)}
     * @param warehousecd The value of warehousecd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousecd_GreaterThan(String warehousecd) {
        regWarehousecd(CK_GT, fRES(warehousecd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSECD: {NotNull, varchar(30)}
     * @param warehousecd The value of warehousecd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousecd_LessThan(String warehousecd) {
        regWarehousecd(CK_LT, fRES(warehousecd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSECD: {NotNull, varchar(30)}
     * @param warehousecd The value of warehousecd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousecd_GreaterEqual(String warehousecd) {
        regWarehousecd(CK_GE, fRES(warehousecd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSECD: {NotNull, varchar(30)}
     * @param warehousecd The value of warehousecd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousecd_LessEqual(String warehousecd) {
        regWarehousecd(CK_LE, fRES(warehousecd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WAREHOUSECD: {NotNull, varchar(30)}
     * @param warehousecdList The collection of warehousecd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousecd_InScope(Collection<String> warehousecdList) {
        doSetWarehousecd_InScope(warehousecdList);
    }

    protected void doSetWarehousecd_InScope(Collection<String> warehousecdList) {
        regINS(CK_INS, cTL(warehousecdList), xgetCValueWarehousecd(), "WAREHOUSECD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WAREHOUSECD: {NotNull, varchar(30)}
     * @param warehousecdList The collection of warehousecd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousecd_NotInScope(Collection<String> warehousecdList) {
        doSetWarehousecd_NotInScope(warehousecdList);
    }

    protected void doSetWarehousecd_NotInScope(Collection<String> warehousecdList) {
        regINS(CK_NINS, cTL(warehousecdList), xgetCValueWarehousecd(), "WAREHOUSECD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WAREHOUSECD: {NotNull, varchar(30)} <br>
     * <pre>e.g. setWarehousecd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param warehousecd The value of warehousecd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setWarehousecd_LikeSearch(String warehousecd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(warehousecd), xgetCValueWarehousecd(), "WAREHOUSECD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WAREHOUSECD: {NotNull, varchar(30)}
     * @param warehousecd The value of warehousecd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setWarehousecd_NotLikeSearch(String warehousecd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(warehousecd), xgetCValueWarehousecd(), "WAREHOUSECD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WAREHOUSECD: {NotNull, varchar(30)}
     * @param warehousecd The value of warehousecd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousecd_PrefixSearch(String warehousecd) {
        setWarehousecd_LikeSearch(warehousecd, xcLSOPPre());
    }

    protected void regWarehousecd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWarehousecd(), "WAREHOUSECD"); }
    protected abstract ConditionValue xgetCValueWarehousecd();

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
     * SHIPSCH_DATE: {NotNull, varchar(8)}
     * @param shipschDate The value of shipschDate as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipschDate_Equal(String shipschDate) {
        doSetShipschDate_Equal(fRES(shipschDate));
    }

    protected void doSetShipschDate_Equal(String shipschDate) {
        regShipschDate(CK_EQ, shipschDate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPSCH_DATE: {NotNull, varchar(8)}
     * @param shipschDate The value of shipschDate as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipschDate_NotEqual(String shipschDate) {
        doSetShipschDate_NotEqual(fRES(shipschDate));
    }

    protected void doSetShipschDate_NotEqual(String shipschDate) {
        regShipschDate(CK_NES, shipschDate);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPSCH_DATE: {NotNull, varchar(8)}
     * @param shipschDate The value of shipschDate as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipschDate_GreaterThan(String shipschDate) {
        regShipschDate(CK_GT, fRES(shipschDate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPSCH_DATE: {NotNull, varchar(8)}
     * @param shipschDate The value of shipschDate as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipschDate_LessThan(String shipschDate) {
        regShipschDate(CK_LT, fRES(shipschDate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPSCH_DATE: {NotNull, varchar(8)}
     * @param shipschDate The value of shipschDate as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipschDate_GreaterEqual(String shipschDate) {
        regShipschDate(CK_GE, fRES(shipschDate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPSCH_DATE: {NotNull, varchar(8)}
     * @param shipschDate The value of shipschDate as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipschDate_LessEqual(String shipschDate) {
        regShipschDate(CK_LE, fRES(shipschDate));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPSCH_DATE: {NotNull, varchar(8)}
     * @param shipschDateList The collection of shipschDate as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipschDate_InScope(Collection<String> shipschDateList) {
        doSetShipschDate_InScope(shipschDateList);
    }

    protected void doSetShipschDate_InScope(Collection<String> shipschDateList) {
        regINS(CK_INS, cTL(shipschDateList), xgetCValueShipschDate(), "SHIPSCH_DATE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPSCH_DATE: {NotNull, varchar(8)}
     * @param shipschDateList The collection of shipschDate as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipschDate_NotInScope(Collection<String> shipschDateList) {
        doSetShipschDate_NotInScope(shipschDateList);
    }

    protected void doSetShipschDate_NotInScope(Collection<String> shipschDateList) {
        regINS(CK_NINS, cTL(shipschDateList), xgetCValueShipschDate(), "SHIPSCH_DATE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPSCH_DATE: {NotNull, varchar(8)} <br>
     * <pre>e.g. setShipschDate_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param shipschDate The value of shipschDate as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setShipschDate_LikeSearch(String shipschDate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(shipschDate), xgetCValueShipschDate(), "SHIPSCH_DATE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPSCH_DATE: {NotNull, varchar(8)}
     * @param shipschDate The value of shipschDate as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setShipschDate_NotLikeSearch(String shipschDate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shipschDate), xgetCValueShipschDate(), "SHIPSCH_DATE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPSCH_DATE: {NotNull, varchar(8)}
     * @param shipschDate The value of shipschDate as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipschDate_PrefixSearch(String shipschDate) {
        setShipschDate_LikeSearch(shipschDate, xcLSOPPre());
    }

    protected void regShipschDate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShipschDate(), "SHIPSCH_DATE"); }
    protected abstract ConditionValue xgetCValueShipschDate();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICK_BATCH_KEY: {NotNull, bigint(19)}
     * @param pickBatchKey The value of pickBatchKey as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickBatchKey_Equal(Long pickBatchKey) {
        doSetPickBatchKey_Equal(pickBatchKey);
    }

    protected void doSetPickBatchKey_Equal(Long pickBatchKey) {
        regPickBatchKey(CK_EQ, pickBatchKey);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICK_BATCH_KEY: {NotNull, bigint(19)}
     * @param pickBatchKey The value of pickBatchKey as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickBatchKey_NotEqual(Long pickBatchKey) {
        doSetPickBatchKey_NotEqual(pickBatchKey);
    }

    protected void doSetPickBatchKey_NotEqual(Long pickBatchKey) {
        regPickBatchKey(CK_NES, pickBatchKey);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICK_BATCH_KEY: {NotNull, bigint(19)}
     * @param pickBatchKey The value of pickBatchKey as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickBatchKey_GreaterThan(Long pickBatchKey) {
        regPickBatchKey(CK_GT, pickBatchKey);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICK_BATCH_KEY: {NotNull, bigint(19)}
     * @param pickBatchKey The value of pickBatchKey as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickBatchKey_LessThan(Long pickBatchKey) {
        regPickBatchKey(CK_LT, pickBatchKey);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICK_BATCH_KEY: {NotNull, bigint(19)}
     * @param pickBatchKey The value of pickBatchKey as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickBatchKey_GreaterEqual(Long pickBatchKey) {
        regPickBatchKey(CK_GE, pickBatchKey);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICK_BATCH_KEY: {NotNull, bigint(19)}
     * @param pickBatchKey The value of pickBatchKey as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickBatchKey_LessEqual(Long pickBatchKey) {
        regPickBatchKey(CK_LE, pickBatchKey);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PICK_BATCH_KEY: {NotNull, bigint(19)}
     * @param minNumber The min number of pickBatchKey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of pickBatchKey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPickBatchKey_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePickBatchKey(), "PICK_BATCH_KEY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PICK_BATCH_KEY: {NotNull, bigint(19)}
     * @param pickBatchKeyList The collection of pickBatchKey as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickBatchKey_InScope(Collection<Long> pickBatchKeyList) {
        doSetPickBatchKey_InScope(pickBatchKeyList);
    }

    protected void doSetPickBatchKey_InScope(Collection<Long> pickBatchKeyList) {
        regINS(CK_INS, cTL(pickBatchKeyList), xgetCValuePickBatchKey(), "PICK_BATCH_KEY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PICK_BATCH_KEY: {NotNull, bigint(19)}
     * @param pickBatchKeyList The collection of pickBatchKey as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickBatchKey_NotInScope(Collection<Long> pickBatchKeyList) {
        doSetPickBatchKey_NotInScope(pickBatchKeyList);
    }

    protected void doSetPickBatchKey_NotInScope(Collection<Long> pickBatchKeyList) {
        regINS(CK_NINS, cTL(pickBatchKeyList), xgetCValuePickBatchKey(), "PICK_BATCH_KEY");
    }

    protected void regPickBatchKey(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePickBatchKey(), "PICK_BATCH_KEY"); }
    protected abstract ConditionValue xgetCValuePickBatchKey();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RESTOCK_FLG: {varchar(30)}
     * @param restockFlg The value of restockFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRestockFlg_Equal(String restockFlg) {
        doSetRestockFlg_Equal(fRES(restockFlg));
    }

    protected void doSetRestockFlg_Equal(String restockFlg) {
        regRestockFlg(CK_EQ, restockFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RESTOCK_FLG: {varchar(30)}
     * @param restockFlg The value of restockFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRestockFlg_NotEqual(String restockFlg) {
        doSetRestockFlg_NotEqual(fRES(restockFlg));
    }

    protected void doSetRestockFlg_NotEqual(String restockFlg) {
        regRestockFlg(CK_NES, restockFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RESTOCK_FLG: {varchar(30)}
     * @param restockFlg The value of restockFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRestockFlg_GreaterThan(String restockFlg) {
        regRestockFlg(CK_GT, fRES(restockFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RESTOCK_FLG: {varchar(30)}
     * @param restockFlg The value of restockFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRestockFlg_LessThan(String restockFlg) {
        regRestockFlg(CK_LT, fRES(restockFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RESTOCK_FLG: {varchar(30)}
     * @param restockFlg The value of restockFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRestockFlg_GreaterEqual(String restockFlg) {
        regRestockFlg(CK_GE, fRES(restockFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RESTOCK_FLG: {varchar(30)}
     * @param restockFlg The value of restockFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRestockFlg_LessEqual(String restockFlg) {
        regRestockFlg(CK_LE, fRES(restockFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RESTOCK_FLG: {varchar(30)}
     * @param restockFlgList The collection of restockFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRestockFlg_InScope(Collection<String> restockFlgList) {
        doSetRestockFlg_InScope(restockFlgList);
    }

    protected void doSetRestockFlg_InScope(Collection<String> restockFlgList) {
        regINS(CK_INS, cTL(restockFlgList), xgetCValueRestockFlg(), "RESTOCK_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RESTOCK_FLG: {varchar(30)}
     * @param restockFlgList The collection of restockFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRestockFlg_NotInScope(Collection<String> restockFlgList) {
        doSetRestockFlg_NotInScope(restockFlgList);
    }

    protected void doSetRestockFlg_NotInScope(Collection<String> restockFlgList) {
        regINS(CK_NINS, cTL(restockFlgList), xgetCValueRestockFlg(), "RESTOCK_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RESTOCK_FLG: {varchar(30)} <br>
     * <pre>e.g. setRestockFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param restockFlg The value of restockFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setRestockFlg_LikeSearch(String restockFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(restockFlg), xgetCValueRestockFlg(), "RESTOCK_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RESTOCK_FLG: {varchar(30)}
     * @param restockFlg The value of restockFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setRestockFlg_NotLikeSearch(String restockFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(restockFlg), xgetCValueRestockFlg(), "RESTOCK_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RESTOCK_FLG: {varchar(30)}
     * @param restockFlg The value of restockFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRestockFlg_PrefixSearch(String restockFlg) {
        setRestockFlg_LikeSearch(restockFlg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RESTOCK_FLG: {varchar(30)}
     */
    public void setRestockFlg_IsNull() { regRestockFlg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * RESTOCK_FLG: {varchar(30)}
     */
    public void setRestockFlg_IsNullOrEmpty() { regRestockFlg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RESTOCK_FLG: {varchar(30)}
     */
    public void setRestockFlg_IsNotNull() { regRestockFlg(CK_ISNN, DOBJ); }

    protected void regRestockFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRestockFlg(), "RESTOCK_FLG"); }
    protected abstract ConditionValue xgetCValueRestockFlg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRIORITIES: {bigint(19)}
     * @param priorities The value of priorities as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPriorities_Equal(Long priorities) {
        doSetPriorities_Equal(priorities);
    }

    protected void doSetPriorities_Equal(Long priorities) {
        regPriorities(CK_EQ, priorities);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRIORITIES: {bigint(19)}
     * @param priorities The value of priorities as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPriorities_NotEqual(Long priorities) {
        doSetPriorities_NotEqual(priorities);
    }

    protected void doSetPriorities_NotEqual(Long priorities) {
        regPriorities(CK_NES, priorities);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRIORITIES: {bigint(19)}
     * @param priorities The value of priorities as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPriorities_GreaterThan(Long priorities) {
        regPriorities(CK_GT, priorities);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRIORITIES: {bigint(19)}
     * @param priorities The value of priorities as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPriorities_LessThan(Long priorities) {
        regPriorities(CK_LT, priorities);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRIORITIES: {bigint(19)}
     * @param priorities The value of priorities as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPriorities_GreaterEqual(Long priorities) {
        regPriorities(CK_GE, priorities);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRIORITIES: {bigint(19)}
     * @param priorities The value of priorities as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPriorities_LessEqual(Long priorities) {
        regPriorities(CK_LE, priorities);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PRIORITIES: {bigint(19)}
     * @param minNumber The min number of priorities. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of priorities. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPriorities_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePriorities(), "PRIORITIES", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRIORITIES: {bigint(19)}
     * @param prioritiesList The collection of priorities as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPriorities_InScope(Collection<Long> prioritiesList) {
        doSetPriorities_InScope(prioritiesList);
    }

    protected void doSetPriorities_InScope(Collection<Long> prioritiesList) {
        regINS(CK_INS, cTL(prioritiesList), xgetCValuePriorities(), "PRIORITIES");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRIORITIES: {bigint(19)}
     * @param prioritiesList The collection of priorities as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPriorities_NotInScope(Collection<Long> prioritiesList) {
        doSetPriorities_NotInScope(prioritiesList);
    }

    protected void doSetPriorities_NotInScope(Collection<Long> prioritiesList) {
        regINS(CK_NINS, cTL(prioritiesList), xgetCValuePriorities(), "PRIORITIES");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PRIORITIES: {bigint(19)}
     */
    public void setPriorities_IsNull() { regPriorities(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PRIORITIES: {bigint(19)}
     */
    public void setPriorities_IsNotNull() { regPriorities(CK_ISNN, DOBJ); }

    protected void regPriorities(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePriorities(), "PRIORITIES"); }
    protected abstract ConditionValue xgetCValuePriorities();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKADJUST_STS: {bigint(19)}
     * @param pickadjustSts The value of pickadjustSts as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickadjustSts_Equal(Long pickadjustSts) {
        doSetPickadjustSts_Equal(pickadjustSts);
    }

    protected void doSetPickadjustSts_Equal(Long pickadjustSts) {
        regPickadjustSts(CK_EQ, pickadjustSts);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKADJUST_STS: {bigint(19)}
     * @param pickadjustSts The value of pickadjustSts as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickadjustSts_NotEqual(Long pickadjustSts) {
        doSetPickadjustSts_NotEqual(pickadjustSts);
    }

    protected void doSetPickadjustSts_NotEqual(Long pickadjustSts) {
        regPickadjustSts(CK_NES, pickadjustSts);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKADJUST_STS: {bigint(19)}
     * @param pickadjustSts The value of pickadjustSts as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickadjustSts_GreaterThan(Long pickadjustSts) {
        regPickadjustSts(CK_GT, pickadjustSts);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKADJUST_STS: {bigint(19)}
     * @param pickadjustSts The value of pickadjustSts as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickadjustSts_LessThan(Long pickadjustSts) {
        regPickadjustSts(CK_LT, pickadjustSts);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKADJUST_STS: {bigint(19)}
     * @param pickadjustSts The value of pickadjustSts as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickadjustSts_GreaterEqual(Long pickadjustSts) {
        regPickadjustSts(CK_GE, pickadjustSts);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKADJUST_STS: {bigint(19)}
     * @param pickadjustSts The value of pickadjustSts as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickadjustSts_LessEqual(Long pickadjustSts) {
        regPickadjustSts(CK_LE, pickadjustSts);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PICKADJUST_STS: {bigint(19)}
     * @param minNumber The min number of pickadjustSts. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of pickadjustSts. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPickadjustSts_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePickadjustSts(), "PICKADJUST_STS", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PICKADJUST_STS: {bigint(19)}
     * @param pickadjustStsList The collection of pickadjustSts as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickadjustSts_InScope(Collection<Long> pickadjustStsList) {
        doSetPickadjustSts_InScope(pickadjustStsList);
    }

    protected void doSetPickadjustSts_InScope(Collection<Long> pickadjustStsList) {
        regINS(CK_INS, cTL(pickadjustStsList), xgetCValuePickadjustSts(), "PICKADJUST_STS");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PICKADJUST_STS: {bigint(19)}
     * @param pickadjustStsList The collection of pickadjustSts as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickadjustSts_NotInScope(Collection<Long> pickadjustStsList) {
        doSetPickadjustSts_NotInScope(pickadjustStsList);
    }

    protected void doSetPickadjustSts_NotInScope(Collection<Long> pickadjustStsList) {
        regINS(CK_NINS, cTL(pickadjustStsList), xgetCValuePickadjustSts(), "PICKADJUST_STS");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PICKADJUST_STS: {bigint(19)}
     */
    public void setPickadjustSts_IsNull() { regPickadjustSts(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PICKADJUST_STS: {bigint(19)}
     */
    public void setPickadjustSts_IsNotNull() { regPickadjustSts(CK_ISNN, DOBJ); }

    protected void regPickadjustSts(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePickadjustSts(), "PICKADJUST_STS"); }
    protected abstract ConditionValue xgetCValuePickadjustSts();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ALCIMRSN_FLG: {varchar(30)}
     * @param alcimrsnFlg The value of alcimrsnFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAlcimrsnFlg_Equal(String alcimrsnFlg) {
        doSetAlcimrsnFlg_Equal(fRES(alcimrsnFlg));
    }

    protected void doSetAlcimrsnFlg_Equal(String alcimrsnFlg) {
        regAlcimrsnFlg(CK_EQ, alcimrsnFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ALCIMRSN_FLG: {varchar(30)}
     * @param alcimrsnFlg The value of alcimrsnFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAlcimrsnFlg_NotEqual(String alcimrsnFlg) {
        doSetAlcimrsnFlg_NotEqual(fRES(alcimrsnFlg));
    }

    protected void doSetAlcimrsnFlg_NotEqual(String alcimrsnFlg) {
        regAlcimrsnFlg(CK_NES, alcimrsnFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ALCIMRSN_FLG: {varchar(30)}
     * @param alcimrsnFlg The value of alcimrsnFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAlcimrsnFlg_GreaterThan(String alcimrsnFlg) {
        regAlcimrsnFlg(CK_GT, fRES(alcimrsnFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ALCIMRSN_FLG: {varchar(30)}
     * @param alcimrsnFlg The value of alcimrsnFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAlcimrsnFlg_LessThan(String alcimrsnFlg) {
        regAlcimrsnFlg(CK_LT, fRES(alcimrsnFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ALCIMRSN_FLG: {varchar(30)}
     * @param alcimrsnFlg The value of alcimrsnFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAlcimrsnFlg_GreaterEqual(String alcimrsnFlg) {
        regAlcimrsnFlg(CK_GE, fRES(alcimrsnFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ALCIMRSN_FLG: {varchar(30)}
     * @param alcimrsnFlg The value of alcimrsnFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAlcimrsnFlg_LessEqual(String alcimrsnFlg) {
        regAlcimrsnFlg(CK_LE, fRES(alcimrsnFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ALCIMRSN_FLG: {varchar(30)}
     * @param alcimrsnFlgList The collection of alcimrsnFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAlcimrsnFlg_InScope(Collection<String> alcimrsnFlgList) {
        doSetAlcimrsnFlg_InScope(alcimrsnFlgList);
    }

    protected void doSetAlcimrsnFlg_InScope(Collection<String> alcimrsnFlgList) {
        regINS(CK_INS, cTL(alcimrsnFlgList), xgetCValueAlcimrsnFlg(), "ALCIMRSN_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ALCIMRSN_FLG: {varchar(30)}
     * @param alcimrsnFlgList The collection of alcimrsnFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAlcimrsnFlg_NotInScope(Collection<String> alcimrsnFlgList) {
        doSetAlcimrsnFlg_NotInScope(alcimrsnFlgList);
    }

    protected void doSetAlcimrsnFlg_NotInScope(Collection<String> alcimrsnFlgList) {
        regINS(CK_NINS, cTL(alcimrsnFlgList), xgetCValueAlcimrsnFlg(), "ALCIMRSN_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ALCIMRSN_FLG: {varchar(30)} <br>
     * <pre>e.g. setAlcimrsnFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param alcimrsnFlg The value of alcimrsnFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAlcimrsnFlg_LikeSearch(String alcimrsnFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(alcimrsnFlg), xgetCValueAlcimrsnFlg(), "ALCIMRSN_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ALCIMRSN_FLG: {varchar(30)}
     * @param alcimrsnFlg The value of alcimrsnFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setAlcimrsnFlg_NotLikeSearch(String alcimrsnFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(alcimrsnFlg), xgetCValueAlcimrsnFlg(), "ALCIMRSN_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ALCIMRSN_FLG: {varchar(30)}
     * @param alcimrsnFlg The value of alcimrsnFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAlcimrsnFlg_PrefixSearch(String alcimrsnFlg) {
        setAlcimrsnFlg_LikeSearch(alcimrsnFlg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ALCIMRSN_FLG: {varchar(30)}
     */
    public void setAlcimrsnFlg_IsNull() { regAlcimrsnFlg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ALCIMRSN_FLG: {varchar(30)}
     */
    public void setAlcimrsnFlg_IsNullOrEmpty() { regAlcimrsnFlg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ALCIMRSN_FLG: {varchar(30)}
     */
    public void setAlcimrsnFlg_IsNotNull() { regAlcimrsnFlg(CK_ISNN, DOBJ); }

    protected void regAlcimrsnFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAlcimrsnFlg(), "ALCIMRSN_FLG"); }
    protected abstract ConditionValue xgetCValueAlcimrsnFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * QTY_ADJUST_FLG: {char(1)}
     * @param qtyAdjustFlg The value of qtyAdjustFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQtyAdjustFlg_Equal(String qtyAdjustFlg) {
        doSetQtyAdjustFlg_Equal(fRES(qtyAdjustFlg));
    }

    protected void doSetQtyAdjustFlg_Equal(String qtyAdjustFlg) {
        regQtyAdjustFlg(CK_EQ, qtyAdjustFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * QTY_ADJUST_FLG: {char(1)}
     * @param qtyAdjustFlg The value of qtyAdjustFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQtyAdjustFlg_NotEqual(String qtyAdjustFlg) {
        doSetQtyAdjustFlg_NotEqual(fRES(qtyAdjustFlg));
    }

    protected void doSetQtyAdjustFlg_NotEqual(String qtyAdjustFlg) {
        regQtyAdjustFlg(CK_NES, qtyAdjustFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * QTY_ADJUST_FLG: {char(1)}
     * @param qtyAdjustFlg The value of qtyAdjustFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQtyAdjustFlg_GreaterThan(String qtyAdjustFlg) {
        regQtyAdjustFlg(CK_GT, fRES(qtyAdjustFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * QTY_ADJUST_FLG: {char(1)}
     * @param qtyAdjustFlg The value of qtyAdjustFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQtyAdjustFlg_LessThan(String qtyAdjustFlg) {
        regQtyAdjustFlg(CK_LT, fRES(qtyAdjustFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * QTY_ADJUST_FLG: {char(1)}
     * @param qtyAdjustFlg The value of qtyAdjustFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQtyAdjustFlg_GreaterEqual(String qtyAdjustFlg) {
        regQtyAdjustFlg(CK_GE, fRES(qtyAdjustFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * QTY_ADJUST_FLG: {char(1)}
     * @param qtyAdjustFlg The value of qtyAdjustFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQtyAdjustFlg_LessEqual(String qtyAdjustFlg) {
        regQtyAdjustFlg(CK_LE, fRES(qtyAdjustFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * QTY_ADJUST_FLG: {char(1)}
     * @param qtyAdjustFlgList The collection of qtyAdjustFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQtyAdjustFlg_InScope(Collection<String> qtyAdjustFlgList) {
        doSetQtyAdjustFlg_InScope(qtyAdjustFlgList);
    }

    protected void doSetQtyAdjustFlg_InScope(Collection<String> qtyAdjustFlgList) {
        regINS(CK_INS, cTL(qtyAdjustFlgList), xgetCValueQtyAdjustFlg(), "QTY_ADJUST_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * QTY_ADJUST_FLG: {char(1)}
     * @param qtyAdjustFlgList The collection of qtyAdjustFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQtyAdjustFlg_NotInScope(Collection<String> qtyAdjustFlgList) {
        doSetQtyAdjustFlg_NotInScope(qtyAdjustFlgList);
    }

    protected void doSetQtyAdjustFlg_NotInScope(Collection<String> qtyAdjustFlgList) {
        regINS(CK_NINS, cTL(qtyAdjustFlgList), xgetCValueQtyAdjustFlg(), "QTY_ADJUST_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * QTY_ADJUST_FLG: {char(1)} <br>
     * <pre>e.g. setQtyAdjustFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param qtyAdjustFlg The value of qtyAdjustFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setQtyAdjustFlg_LikeSearch(String qtyAdjustFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(qtyAdjustFlg), xgetCValueQtyAdjustFlg(), "QTY_ADJUST_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * QTY_ADJUST_FLG: {char(1)}
     * @param qtyAdjustFlg The value of qtyAdjustFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setQtyAdjustFlg_NotLikeSearch(String qtyAdjustFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(qtyAdjustFlg), xgetCValueQtyAdjustFlg(), "QTY_ADJUST_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * QTY_ADJUST_FLG: {char(1)}
     * @param qtyAdjustFlg The value of qtyAdjustFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQtyAdjustFlg_PrefixSearch(String qtyAdjustFlg) {
        setQtyAdjustFlg_LikeSearch(qtyAdjustFlg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * QTY_ADJUST_FLG: {char(1)}
     */
    public void setQtyAdjustFlg_IsNull() { regQtyAdjustFlg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * QTY_ADJUST_FLG: {char(1)}
     */
    public void setQtyAdjustFlg_IsNotNull() { regQtyAdjustFlg(CK_ISNN, DOBJ); }

    protected void regQtyAdjustFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueQtyAdjustFlg(), "QTY_ADJUST_FLG"); }
    protected abstract ConditionValue xgetCValueQtyAdjustFlg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {NotNull, bigint(19)}
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
     * CENTER_ID: {NotNull, bigint(19)}
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
     * CENTER_ID: {NotNull, bigint(19)}
     * @param centerId The value of centerId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_GreaterThan(Long centerId) {
        regCenterId(CK_GT, centerId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {NotNull, bigint(19)}
     * @param centerId The value of centerId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_LessThan(Long centerId) {
        regCenterId(CK_LT, centerId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {NotNull, bigint(19)}
     * @param centerId The value of centerId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_GreaterEqual(Long centerId) {
        regCenterId(CK_GE, centerId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {NotNull, bigint(19)}
     * @param centerId The value of centerId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_LessEqual(Long centerId) {
        regCenterId(CK_LE, centerId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {NotNull, bigint(19)}
     * @param minNumber The min number of centerId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of centerId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCenterId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCenterId(), "CENTER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CENTER_ID: {NotNull, bigint(19)}
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
     * CENTER_ID: {NotNull, bigint(19)}
     * @param centerIdList The collection of centerId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterId_NotInScope(Collection<Long> centerIdList) {
        doSetCenterId_NotInScope(centerIdList);
    }

    protected void doSetCenterId_NotInScope(Collection<Long> centerIdList) {
        regINS(CK_NINS, cTL(centerIdList), xgetCValueCenterId(), "CENTER_ID");
    }

    protected void regCenterId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCenterId(), "CENTER_ID"); }
    protected abstract ConditionValue xgetCValueCenterId();

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
     * RCV_STKEXA_DATE: {NotNull, varchar(8)}
     * @param rcvStkexaDate The value of rcvStkexaDate as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvStkexaDate_Equal(String rcvStkexaDate) {
        doSetRcvStkexaDate_Equal(fRES(rcvStkexaDate));
    }

    protected void doSetRcvStkexaDate_Equal(String rcvStkexaDate) {
        regRcvStkexaDate(CK_EQ, rcvStkexaDate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCV_STKEXA_DATE: {NotNull, varchar(8)}
     * @param rcvStkexaDate The value of rcvStkexaDate as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvStkexaDate_NotEqual(String rcvStkexaDate) {
        doSetRcvStkexaDate_NotEqual(fRES(rcvStkexaDate));
    }

    protected void doSetRcvStkexaDate_NotEqual(String rcvStkexaDate) {
        regRcvStkexaDate(CK_NES, rcvStkexaDate);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCV_STKEXA_DATE: {NotNull, varchar(8)}
     * @param rcvStkexaDate The value of rcvStkexaDate as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvStkexaDate_GreaterThan(String rcvStkexaDate) {
        regRcvStkexaDate(CK_GT, fRES(rcvStkexaDate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCV_STKEXA_DATE: {NotNull, varchar(8)}
     * @param rcvStkexaDate The value of rcvStkexaDate as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvStkexaDate_LessThan(String rcvStkexaDate) {
        regRcvStkexaDate(CK_LT, fRES(rcvStkexaDate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCV_STKEXA_DATE: {NotNull, varchar(8)}
     * @param rcvStkexaDate The value of rcvStkexaDate as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvStkexaDate_GreaterEqual(String rcvStkexaDate) {
        regRcvStkexaDate(CK_GE, fRES(rcvStkexaDate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCV_STKEXA_DATE: {NotNull, varchar(8)}
     * @param rcvStkexaDate The value of rcvStkexaDate as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvStkexaDate_LessEqual(String rcvStkexaDate) {
        regRcvStkexaDate(CK_LE, fRES(rcvStkexaDate));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RCV_STKEXA_DATE: {NotNull, varchar(8)}
     * @param rcvStkexaDateList The collection of rcvStkexaDate as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvStkexaDate_InScope(Collection<String> rcvStkexaDateList) {
        doSetRcvStkexaDate_InScope(rcvStkexaDateList);
    }

    protected void doSetRcvStkexaDate_InScope(Collection<String> rcvStkexaDateList) {
        regINS(CK_INS, cTL(rcvStkexaDateList), xgetCValueRcvStkexaDate(), "RCV_STKEXA_DATE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RCV_STKEXA_DATE: {NotNull, varchar(8)}
     * @param rcvStkexaDateList The collection of rcvStkexaDate as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvStkexaDate_NotInScope(Collection<String> rcvStkexaDateList) {
        doSetRcvStkexaDate_NotInScope(rcvStkexaDateList);
    }

    protected void doSetRcvStkexaDate_NotInScope(Collection<String> rcvStkexaDateList) {
        regINS(CK_NINS, cTL(rcvStkexaDateList), xgetCValueRcvStkexaDate(), "RCV_STKEXA_DATE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RCV_STKEXA_DATE: {NotNull, varchar(8)} <br>
     * <pre>e.g. setRcvStkexaDate_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param rcvStkexaDate The value of rcvStkexaDate as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setRcvStkexaDate_LikeSearch(String rcvStkexaDate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(rcvStkexaDate), xgetCValueRcvStkexaDate(), "RCV_STKEXA_DATE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RCV_STKEXA_DATE: {NotNull, varchar(8)}
     * @param rcvStkexaDate The value of rcvStkexaDate as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setRcvStkexaDate_NotLikeSearch(String rcvStkexaDate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(rcvStkexaDate), xgetCValueRcvStkexaDate(), "RCV_STKEXA_DATE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RCV_STKEXA_DATE: {NotNull, varchar(8)}
     * @param rcvStkexaDate The value of rcvStkexaDate as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvStkexaDate_PrefixSearch(String rcvStkexaDate) {
        setRcvStkexaDate_LikeSearch(rcvStkexaDate, xcLSOPPre());
    }

    protected void regRcvStkexaDate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRcvStkexaDate(), "RCV_STKEXA_DATE"); }
    protected abstract ConditionValue xgetCValueRcvStkexaDate();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_SHORTAGE_QTY: {NotNull, bigint(19)}
     * @param stockShortageQty The value of stockShortageQty as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockShortageQty_Equal(Long stockShortageQty) {
        doSetStockShortageQty_Equal(stockShortageQty);
    }

    protected void doSetStockShortageQty_Equal(Long stockShortageQty) {
        regStockShortageQty(CK_EQ, stockShortageQty);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_SHORTAGE_QTY: {NotNull, bigint(19)}
     * @param stockShortageQty The value of stockShortageQty as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockShortageQty_NotEqual(Long stockShortageQty) {
        doSetStockShortageQty_NotEqual(stockShortageQty);
    }

    protected void doSetStockShortageQty_NotEqual(Long stockShortageQty) {
        regStockShortageQty(CK_NES, stockShortageQty);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_SHORTAGE_QTY: {NotNull, bigint(19)}
     * @param stockShortageQty The value of stockShortageQty as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockShortageQty_GreaterThan(Long stockShortageQty) {
        regStockShortageQty(CK_GT, stockShortageQty);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_SHORTAGE_QTY: {NotNull, bigint(19)}
     * @param stockShortageQty The value of stockShortageQty as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockShortageQty_LessThan(Long stockShortageQty) {
        regStockShortageQty(CK_LT, stockShortageQty);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_SHORTAGE_QTY: {NotNull, bigint(19)}
     * @param stockShortageQty The value of stockShortageQty as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockShortageQty_GreaterEqual(Long stockShortageQty) {
        regStockShortageQty(CK_GE, stockShortageQty);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_SHORTAGE_QTY: {NotNull, bigint(19)}
     * @param stockShortageQty The value of stockShortageQty as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockShortageQty_LessEqual(Long stockShortageQty) {
        regStockShortageQty(CK_LE, stockShortageQty);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_SHORTAGE_QTY: {NotNull, bigint(19)}
     * @param minNumber The min number of stockShortageQty. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of stockShortageQty. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setStockShortageQty_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueStockShortageQty(), "STOCK_SHORTAGE_QTY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * STOCK_SHORTAGE_QTY: {NotNull, bigint(19)}
     * @param stockShortageQtyList The collection of stockShortageQty as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockShortageQty_InScope(Collection<Long> stockShortageQtyList) {
        doSetStockShortageQty_InScope(stockShortageQtyList);
    }

    protected void doSetStockShortageQty_InScope(Collection<Long> stockShortageQtyList) {
        regINS(CK_INS, cTL(stockShortageQtyList), xgetCValueStockShortageQty(), "STOCK_SHORTAGE_QTY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * STOCK_SHORTAGE_QTY: {NotNull, bigint(19)}
     * @param stockShortageQtyList The collection of stockShortageQty as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockShortageQty_NotInScope(Collection<Long> stockShortageQtyList) {
        doSetStockShortageQty_NotInScope(stockShortageQtyList);
    }

    protected void doSetStockShortageQty_NotInScope(Collection<Long> stockShortageQtyList) {
        regINS(CK_NINS, cTL(stockShortageQtyList), xgetCValueStockShortageQty(), "STOCK_SHORTAGE_QTY");
    }

    protected void regStockShortageQty(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStockShortageQty(), "STOCK_SHORTAGE_QTY"); }
    protected abstract ConditionValue xgetCValueStockShortageQty();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_SUM_QTY: {NotNull, bigint(19)}
     * @param stockSumQty The value of stockSumQty as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockSumQty_Equal(Long stockSumQty) {
        doSetStockSumQty_Equal(stockSumQty);
    }

    protected void doSetStockSumQty_Equal(Long stockSumQty) {
        regStockSumQty(CK_EQ, stockSumQty);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_SUM_QTY: {NotNull, bigint(19)}
     * @param stockSumQty The value of stockSumQty as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockSumQty_NotEqual(Long stockSumQty) {
        doSetStockSumQty_NotEqual(stockSumQty);
    }

    protected void doSetStockSumQty_NotEqual(Long stockSumQty) {
        regStockSumQty(CK_NES, stockSumQty);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_SUM_QTY: {NotNull, bigint(19)}
     * @param stockSumQty The value of stockSumQty as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockSumQty_GreaterThan(Long stockSumQty) {
        regStockSumQty(CK_GT, stockSumQty);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_SUM_QTY: {NotNull, bigint(19)}
     * @param stockSumQty The value of stockSumQty as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockSumQty_LessThan(Long stockSumQty) {
        regStockSumQty(CK_LT, stockSumQty);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_SUM_QTY: {NotNull, bigint(19)}
     * @param stockSumQty The value of stockSumQty as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockSumQty_GreaterEqual(Long stockSumQty) {
        regStockSumQty(CK_GE, stockSumQty);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_SUM_QTY: {NotNull, bigint(19)}
     * @param stockSumQty The value of stockSumQty as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockSumQty_LessEqual(Long stockSumQty) {
        regStockSumQty(CK_LE, stockSumQty);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_SUM_QTY: {NotNull, bigint(19)}
     * @param minNumber The min number of stockSumQty. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of stockSumQty. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setStockSumQty_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueStockSumQty(), "STOCK_SUM_QTY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * STOCK_SUM_QTY: {NotNull, bigint(19)}
     * @param stockSumQtyList The collection of stockSumQty as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockSumQty_InScope(Collection<Long> stockSumQtyList) {
        doSetStockSumQty_InScope(stockSumQtyList);
    }

    protected void doSetStockSumQty_InScope(Collection<Long> stockSumQtyList) {
        regINS(CK_INS, cTL(stockSumQtyList), xgetCValueStockSumQty(), "STOCK_SUM_QTY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * STOCK_SUM_QTY: {NotNull, bigint(19)}
     * @param stockSumQtyList The collection of stockSumQty as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockSumQty_NotInScope(Collection<Long> stockSumQtyList) {
        doSetStockSumQty_NotInScope(stockSumQtyList);
    }

    protected void doSetStockSumQty_NotInScope(Collection<Long> stockSumQtyList) {
        regINS(CK_NINS, cTL(stockSumQtyList), xgetCValueStockSumQty(), "STOCK_SUM_QTY");
    }

    protected void regStockSumQty(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStockSumQty(), "STOCK_SUM_QTY"); }
    protected abstract ConditionValue xgetCValueStockSumQty();

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
    public HpSLCFunction<TTrimallocHCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TTrimallocHCB.class);
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
    public HpSLCFunction<TTrimallocHCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TTrimallocHCB.class);
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
    public HpSLCFunction<TTrimallocHCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TTrimallocHCB.class);
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
    public HpSLCFunction<TTrimallocHCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TTrimallocHCB.class);
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
    public HpSLCFunction<TTrimallocHCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TTrimallocHCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TTrimallocHCB&gt;() {
     *     public void query(TTrimallocHCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TTrimallocHCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TTrimallocHCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrimallocHCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TTrimallocHCQ sq);

    protected TTrimallocHCB xcreateScalarConditionCB() {
        TTrimallocHCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TTrimallocHCB xcreateScalarConditionPartitionByCB() {
        TTrimallocHCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TTrimallocHCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrimallocHCB cb = new TTrimallocHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "TRIMALLOC_H_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TTrimallocHCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TTrimallocHCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TTrimallocHCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrimallocHCB cb = new TTrimallocHCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "TRIMALLOC_H_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TTrimallocHCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TTrimallocHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTrimallocHCB cb = new TTrimallocHCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TTrimallocHCQ sq);

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
    protected TTrimallocHCB newMyCB() {
        return new TTrimallocHCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TTrimallocHCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
