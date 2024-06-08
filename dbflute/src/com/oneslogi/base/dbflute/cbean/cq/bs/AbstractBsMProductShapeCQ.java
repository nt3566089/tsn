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
 * The abstract condition-query of M_PRODUCT_SHAPE.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsMProductShapeCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsMProductShapeCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "M_PRODUCT_SHAPE";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_SHAPE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param productShapeId The value of productShapeId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductShapeId_Equal(Long productShapeId) {
        doSetProductShapeId_Equal(productShapeId);
    }

    protected void doSetProductShapeId_Equal(Long productShapeId) {
        regProductShapeId(CK_EQ, productShapeId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_SHAPE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param productShapeId The value of productShapeId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductShapeId_NotEqual(Long productShapeId) {
        doSetProductShapeId_NotEqual(productShapeId);
    }

    protected void doSetProductShapeId_NotEqual(Long productShapeId) {
        regProductShapeId(CK_NES, productShapeId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_SHAPE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param productShapeId The value of productShapeId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductShapeId_GreaterThan(Long productShapeId) {
        regProductShapeId(CK_GT, productShapeId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_SHAPE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param productShapeId The value of productShapeId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductShapeId_LessThan(Long productShapeId) {
        regProductShapeId(CK_LT, productShapeId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_SHAPE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param productShapeId The value of productShapeId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductShapeId_GreaterEqual(Long productShapeId) {
        regProductShapeId(CK_GE, productShapeId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_SHAPE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param productShapeId The value of productShapeId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductShapeId_LessEqual(Long productShapeId) {
        regProductShapeId(CK_LE, productShapeId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_SHAPE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of productShapeId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of productShapeId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setProductShapeId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueProductShapeId(), "PRODUCT_SHAPE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRODUCT_SHAPE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param productShapeIdList The collection of productShapeId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductShapeId_InScope(Collection<Long> productShapeIdList) {
        doSetProductShapeId_InScope(productShapeIdList);
    }

    protected void doSetProductShapeId_InScope(Collection<Long> productShapeIdList) {
        regINS(CK_INS, cTL(productShapeIdList), xgetCValueProductShapeId(), "PRODUCT_SHAPE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRODUCT_SHAPE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param productShapeIdList The collection of productShapeId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductShapeId_NotInScope(Collection<Long> productShapeIdList) {
        doSetProductShapeId_NotInScope(productShapeIdList);
    }

    protected void doSetProductShapeId_NotInScope(Collection<Long> productShapeIdList) {
        regINS(CK_NINS, cTL(productShapeIdList), xgetCValueProductShapeId(), "PRODUCT_SHAPE_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select MAX_STORE_PRODUCT_SHAPE_ID from M_LOCATION where ...)} <br>
     * M_LOCATION by MAX_STORE_PRODUCT_SHAPE_ID, named 'MLocationByMaxStoreProductShapeIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMLocationByMaxStoreProductShapeIdList</span>(locationCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     locationCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MLocationByMaxStoreProductShapeIdList for 'exists'. (NotNull)
     */
    public void existsMLocationByMaxStoreProductShapeIdList(SubQuery<MLocationCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MLocationCB cb = new MLocationCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProductShapeId_ExistsReferrer_MLocationByMaxStoreProductShapeIdList(cb.query());
        registerExistsReferrer(cb.query(), "PRODUCT_SHAPE_ID", "MAX_STORE_PRODUCT_SHAPE_ID", pp, "mLocationByMaxStoreProductShapeIdList");
    }
    public abstract String keepProductShapeId_ExistsReferrer_MLocationByMaxStoreProductShapeIdList(MLocationCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select REPLENISH_P_PRODUCT_SHAPE_ID from M_LOCATION where ...)} <br>
     * M_LOCATION by REPLENISH_P_PRODUCT_SHAPE_ID, named 'MLocationByReplenishPProductShapeIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMLocationByReplenishPProductShapeIdList</span>(locationCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     locationCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MLocationByReplenishPProductShapeIdList for 'exists'. (NotNull)
     */
    public void existsMLocationByReplenishPProductShapeIdList(SubQuery<MLocationCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MLocationCB cb = new MLocationCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProductShapeId_ExistsReferrer_MLocationByReplenishPProductShapeIdList(cb.query());
        registerExistsReferrer(cb.query(), "PRODUCT_SHAPE_ID", "REPLENISH_P_PRODUCT_SHAPE_ID", pp, "mLocationByReplenishPProductShapeIdList");
    }
    public abstract String keepProductShapeId_ExistsReferrer_MLocationByReplenishPProductShapeIdList(MLocationCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select MAX_STORE_PRODUCT_SHAPE_ID from M_LOCATION where ...)} <br>
     * M_LOCATION by MAX_STORE_PRODUCT_SHAPE_ID, named 'MLocationByMaxStoreProductShapeIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMLocationByMaxStoreProductShapeIdList</span>(locationCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     locationCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ProductShapeId_NotExistsReferrer_MLocationByMaxStoreProductShapeIdList for 'not exists'. (NotNull)
     */
    public void notExistsMLocationByMaxStoreProductShapeIdList(SubQuery<MLocationCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MLocationCB cb = new MLocationCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProductShapeId_NotExistsReferrer_MLocationByMaxStoreProductShapeIdList(cb.query());
        registerNotExistsReferrer(cb.query(), "PRODUCT_SHAPE_ID", "MAX_STORE_PRODUCT_SHAPE_ID", pp, "mLocationByMaxStoreProductShapeIdList");
    }
    public abstract String keepProductShapeId_NotExistsReferrer_MLocationByMaxStoreProductShapeIdList(MLocationCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select REPLENISH_P_PRODUCT_SHAPE_ID from M_LOCATION where ...)} <br>
     * M_LOCATION by REPLENISH_P_PRODUCT_SHAPE_ID, named 'MLocationByReplenishPProductShapeIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMLocationByReplenishPProductShapeIdList</span>(locationCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     locationCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ProductShapeId_NotExistsReferrer_MLocationByReplenishPProductShapeIdList for 'not exists'. (NotNull)
     */
    public void notExistsMLocationByReplenishPProductShapeIdList(SubQuery<MLocationCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MLocationCB cb = new MLocationCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProductShapeId_NotExistsReferrer_MLocationByReplenishPProductShapeIdList(cb.query());
        registerNotExistsReferrer(cb.query(), "PRODUCT_SHAPE_ID", "REPLENISH_P_PRODUCT_SHAPE_ID", pp, "mLocationByReplenishPProductShapeIdList");
    }
    public abstract String keepProductShapeId_NotExistsReferrer_MLocationByReplenishPProductShapeIdList(MLocationCQ sq);

    public void xsderiveMLocationByMaxStoreProductShapeIdList(String fn, SubQuery<MLocationCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MLocationCB cb = new MLocationCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepProductShapeId_SpecifyDerivedReferrer_MLocationByMaxStoreProductShapeIdList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "PRODUCT_SHAPE_ID", "MAX_STORE_PRODUCT_SHAPE_ID", pp, "mLocationByMaxStoreProductShapeIdList", al, op);
    }
    public abstract String keepProductShapeId_SpecifyDerivedReferrer_MLocationByMaxStoreProductShapeIdList(MLocationCQ sq);

    public void xsderiveMLocationByReplenishPProductShapeIdList(String fn, SubQuery<MLocationCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MLocationCB cb = new MLocationCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepProductShapeId_SpecifyDerivedReferrer_MLocationByReplenishPProductShapeIdList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "PRODUCT_SHAPE_ID", "REPLENISH_P_PRODUCT_SHAPE_ID", pp, "mLocationByReplenishPProductShapeIdList", al, op);
    }
    public abstract String keepProductShapeId_SpecifyDerivedReferrer_MLocationByReplenishPProductShapeIdList(MLocationCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from M_LOCATION where ...)} <br>
     * M_LOCATION by MAX_STORE_PRODUCT_SHAPE_ID, named 'MLocationByMaxStoreProductShapeIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMLocationByMaxStoreProductShapeIdList()</span>.<span style="color: #CC4747">max</span>(locationCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     locationCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     locationCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MLocationCB> derivedMLocationByMaxStoreProductShapeIdList() {
        return xcreateQDRFunctionMLocationByMaxStoreProductShapeIdList();
    }
    protected HpQDRFunction<MLocationCB> xcreateQDRFunctionMLocationByMaxStoreProductShapeIdList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMLocationByMaxStoreProductShapeIdList(fn, sq, rd, vl, op));
    }
    public void xqderiveMLocationByMaxStoreProductShapeIdList(String fn, SubQuery<MLocationCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MLocationCB cb = new MLocationCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepProductShapeId_QueryDerivedReferrer_MLocationByMaxStoreProductShapeIdList(cb.query()); String prpp = keepProductShapeId_QueryDerivedReferrer_MLocationByMaxStoreProductShapeIdListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "PRODUCT_SHAPE_ID", "MAX_STORE_PRODUCT_SHAPE_ID", sqpp, "mLocationByMaxStoreProductShapeIdList", rd, vl, prpp, op);
    }
    public abstract String keepProductShapeId_QueryDerivedReferrer_MLocationByMaxStoreProductShapeIdList(MLocationCQ sq);
    public abstract String keepProductShapeId_QueryDerivedReferrer_MLocationByMaxStoreProductShapeIdListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from M_LOCATION where ...)} <br>
     * M_LOCATION by REPLENISH_P_PRODUCT_SHAPE_ID, named 'MLocationByReplenishPProductShapeIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMLocationByReplenishPProductShapeIdList()</span>.<span style="color: #CC4747">max</span>(locationCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     locationCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     locationCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MLocationCB> derivedMLocationByReplenishPProductShapeIdList() {
        return xcreateQDRFunctionMLocationByReplenishPProductShapeIdList();
    }
    protected HpQDRFunction<MLocationCB> xcreateQDRFunctionMLocationByReplenishPProductShapeIdList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMLocationByReplenishPProductShapeIdList(fn, sq, rd, vl, op));
    }
    public void xqderiveMLocationByReplenishPProductShapeIdList(String fn, SubQuery<MLocationCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MLocationCB cb = new MLocationCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepProductShapeId_QueryDerivedReferrer_MLocationByReplenishPProductShapeIdList(cb.query()); String prpp = keepProductShapeId_QueryDerivedReferrer_MLocationByReplenishPProductShapeIdListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "PRODUCT_SHAPE_ID", "REPLENISH_P_PRODUCT_SHAPE_ID", sqpp, "mLocationByReplenishPProductShapeIdList", rd, vl, prpp, op);
    }
    public abstract String keepProductShapeId_QueryDerivedReferrer_MLocationByReplenishPProductShapeIdList(MLocationCQ sq);
    public abstract String keepProductShapeId_QueryDerivedReferrer_MLocationByReplenishPProductShapeIdListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PRODUCT_SHAPE_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setProductShapeId_IsNull() { regProductShapeId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PRODUCT_SHAPE_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setProductShapeId_IsNotNull() { regProductShapeId(CK_ISNN, DOBJ); }

    protected void regProductShapeId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProductShapeId(), "PRODUCT_SHAPE_ID"); }
    protected abstract ConditionValue xgetCValueProductShapeId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {UQ+, IX, NotNull, bigint(19), FK to M_PRODUCT}
     * @param productId The value of productId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductId_Equal(Long productId) {
        doSetProductId_Equal(productId);
    }

    protected void doSetProductId_Equal(Long productId) {
        regProductId(CK_EQ, productId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {UQ+, IX, NotNull, bigint(19), FK to M_PRODUCT}
     * @param productId The value of productId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductId_NotEqual(Long productId) {
        doSetProductId_NotEqual(productId);
    }

    protected void doSetProductId_NotEqual(Long productId) {
        regProductId(CK_NES, productId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {UQ+, IX, NotNull, bigint(19), FK to M_PRODUCT}
     * @param productId The value of productId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductId_GreaterThan(Long productId) {
        regProductId(CK_GT, productId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {UQ+, IX, NotNull, bigint(19), FK to M_PRODUCT}
     * @param productId The value of productId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductId_LessThan(Long productId) {
        regProductId(CK_LT, productId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {UQ+, IX, NotNull, bigint(19), FK to M_PRODUCT}
     * @param productId The value of productId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductId_GreaterEqual(Long productId) {
        regProductId(CK_GE, productId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {UQ+, IX, NotNull, bigint(19), FK to M_PRODUCT}
     * @param productId The value of productId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductId_LessEqual(Long productId) {
        regProductId(CK_LE, productId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {UQ+, IX, NotNull, bigint(19), FK to M_PRODUCT}
     * @param minNumber The min number of productId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of productId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setProductId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueProductId(), "PRODUCT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRODUCT_ID: {UQ+, IX, NotNull, bigint(19), FK to M_PRODUCT}
     * @param productIdList The collection of productId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductId_InScope(Collection<Long> productIdList) {
        doSetProductId_InScope(productIdList);
    }

    protected void doSetProductId_InScope(Collection<Long> productIdList) {
        regINS(CK_INS, cTL(productIdList), xgetCValueProductId(), "PRODUCT_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRODUCT_ID: {UQ+, IX, NotNull, bigint(19), FK to M_PRODUCT}
     * @param productIdList The collection of productId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductId_NotInScope(Collection<Long> productIdList) {
        doSetProductId_NotInScope(productIdList);
    }

    protected void doSetProductId_NotInScope(Collection<Long> productIdList) {
        regINS(CK_NINS, cTL(productIdList), xgetCValueProductId(), "PRODUCT_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select PRODUCT_ID from M_PRODUCT where ...)} <br />
     * M_PRODUCT by my PRODUCT_ID, named 'MProduct'.
     * @param subCBLambda The callback for sub-query of MProduct for 'in-scope'. (NotNull)
     */
    public void inScopeMProduct(SubQuery<MProductCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MProductCB cb = new MProductCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepProductId_InScopeRelation_MProduct(cb.query());
        registerInScopeRelation(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "mProduct", false);
    }
    public abstract String keepProductId_InScopeRelation_MProduct(MProductCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select PRODUCT_ID from M_PRODUCT where ...)} <br />
     * M_PRODUCT by my PRODUCT_ID, named 'MProduct'.
     * @param subCBLambda The callback for sub-query of MProduct for 'not in-scope'. (NotNull)
     */
    public void notInScopeMProduct(SubQuery<MProductCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MProductCB cb = new MProductCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepProductId_NotInScopeRelation_MProduct(cb.query());
        registerInScopeRelation(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "mProduct", true);
    }
    public abstract String keepProductId_NotInScopeRelation_MProduct(MProductCQ sq);

    protected void regProductId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProductId(), "PRODUCT_ID"); }
    protected abstract ConditionValue xgetCValueProductId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHAPE_GRP_DTL_ID: {+UQ, IX, NotNull, bigint(19), FK to M_SHAPE_GRP_DTL}
     * @param shapeGrpDtlId The value of shapeGrpDtlId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setShapeGrpDtlId_Equal(Long shapeGrpDtlId) {
        doSetShapeGrpDtlId_Equal(shapeGrpDtlId);
    }

    protected void doSetShapeGrpDtlId_Equal(Long shapeGrpDtlId) {
        regShapeGrpDtlId(CK_EQ, shapeGrpDtlId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHAPE_GRP_DTL_ID: {+UQ, IX, NotNull, bigint(19), FK to M_SHAPE_GRP_DTL}
     * @param shapeGrpDtlId The value of shapeGrpDtlId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShapeGrpDtlId_NotEqual(Long shapeGrpDtlId) {
        doSetShapeGrpDtlId_NotEqual(shapeGrpDtlId);
    }

    protected void doSetShapeGrpDtlId_NotEqual(Long shapeGrpDtlId) {
        regShapeGrpDtlId(CK_NES, shapeGrpDtlId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHAPE_GRP_DTL_ID: {+UQ, IX, NotNull, bigint(19), FK to M_SHAPE_GRP_DTL}
     * @param shapeGrpDtlId The value of shapeGrpDtlId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShapeGrpDtlId_GreaterThan(Long shapeGrpDtlId) {
        regShapeGrpDtlId(CK_GT, shapeGrpDtlId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHAPE_GRP_DTL_ID: {+UQ, IX, NotNull, bigint(19), FK to M_SHAPE_GRP_DTL}
     * @param shapeGrpDtlId The value of shapeGrpDtlId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShapeGrpDtlId_LessThan(Long shapeGrpDtlId) {
        regShapeGrpDtlId(CK_LT, shapeGrpDtlId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHAPE_GRP_DTL_ID: {+UQ, IX, NotNull, bigint(19), FK to M_SHAPE_GRP_DTL}
     * @param shapeGrpDtlId The value of shapeGrpDtlId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShapeGrpDtlId_GreaterEqual(Long shapeGrpDtlId) {
        regShapeGrpDtlId(CK_GE, shapeGrpDtlId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHAPE_GRP_DTL_ID: {+UQ, IX, NotNull, bigint(19), FK to M_SHAPE_GRP_DTL}
     * @param shapeGrpDtlId The value of shapeGrpDtlId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShapeGrpDtlId_LessEqual(Long shapeGrpDtlId) {
        regShapeGrpDtlId(CK_LE, shapeGrpDtlId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SHAPE_GRP_DTL_ID: {+UQ, IX, NotNull, bigint(19), FK to M_SHAPE_GRP_DTL}
     * @param minNumber The min number of shapeGrpDtlId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of shapeGrpDtlId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setShapeGrpDtlId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueShapeGrpDtlId(), "SHAPE_GRP_DTL_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SHAPE_GRP_DTL_ID: {+UQ, IX, NotNull, bigint(19), FK to M_SHAPE_GRP_DTL}
     * @param shapeGrpDtlIdList The collection of shapeGrpDtlId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShapeGrpDtlId_InScope(Collection<Long> shapeGrpDtlIdList) {
        doSetShapeGrpDtlId_InScope(shapeGrpDtlIdList);
    }

    protected void doSetShapeGrpDtlId_InScope(Collection<Long> shapeGrpDtlIdList) {
        regINS(CK_INS, cTL(shapeGrpDtlIdList), xgetCValueShapeGrpDtlId(), "SHAPE_GRP_DTL_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SHAPE_GRP_DTL_ID: {+UQ, IX, NotNull, bigint(19), FK to M_SHAPE_GRP_DTL}
     * @param shapeGrpDtlIdList The collection of shapeGrpDtlId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShapeGrpDtlId_NotInScope(Collection<Long> shapeGrpDtlIdList) {
        doSetShapeGrpDtlId_NotInScope(shapeGrpDtlIdList);
    }

    protected void doSetShapeGrpDtlId_NotInScope(Collection<Long> shapeGrpDtlIdList) {
        regINS(CK_NINS, cTL(shapeGrpDtlIdList), xgetCValueShapeGrpDtlId(), "SHAPE_GRP_DTL_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select SHAPE_GRP_DTL_ID from M_SHAPE_GRP_DTL where ...)} <br />
     * M_SHAPE_GRP_DTL by my SHAPE_GRP_DTL_ID, named 'MShapeGrpDtl'.
     * @param subCBLambda The callback for sub-query of MShapeGrpDtl for 'in-scope'. (NotNull)
     */
    public void inScopeMShapeGrpDtl(SubQuery<MShapeGrpDtlCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MShapeGrpDtlCB cb = new MShapeGrpDtlCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepShapeGrpDtlId_InScopeRelation_MShapeGrpDtl(cb.query());
        registerInScopeRelation(cb.query(), "SHAPE_GRP_DTL_ID", "SHAPE_GRP_DTL_ID", pp, "mShapeGrpDtl", false);
    }
    public abstract String keepShapeGrpDtlId_InScopeRelation_MShapeGrpDtl(MShapeGrpDtlCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select SHAPE_GRP_DTL_ID from M_SHAPE_GRP_DTL where ...)} <br />
     * M_SHAPE_GRP_DTL by my SHAPE_GRP_DTL_ID, named 'MShapeGrpDtl'.
     * @param subCBLambda The callback for sub-query of MShapeGrpDtl for 'not in-scope'. (NotNull)
     */
    public void notInScopeMShapeGrpDtl(SubQuery<MShapeGrpDtlCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MShapeGrpDtlCB cb = new MShapeGrpDtlCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepShapeGrpDtlId_NotInScopeRelation_MShapeGrpDtl(cb.query());
        registerInScopeRelation(cb.query(), "SHAPE_GRP_DTL_ID", "SHAPE_GRP_DTL_ID", pp, "mShapeGrpDtl", true);
    }
    public abstract String keepShapeGrpDtlId_NotInScopeRelation_MShapeGrpDtl(MShapeGrpDtlCQ sq);

    protected void regShapeGrpDtlId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShapeGrpDtlId(), "SHAPE_GRP_DTL_ID"); }
    protected abstract ConditionValue xgetCValueShapeGrpDtlId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * UNIT_NUM: {bigint(19)}
     * @param unitNum The value of unitNum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnitNum_Equal(Long unitNum) {
        doSetUnitNum_Equal(unitNum);
    }

    protected void doSetUnitNum_Equal(Long unitNum) {
        regUnitNum(CK_EQ, unitNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * UNIT_NUM: {bigint(19)}
     * @param unitNum The value of unitNum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnitNum_NotEqual(Long unitNum) {
        doSetUnitNum_NotEqual(unitNum);
    }

    protected void doSetUnitNum_NotEqual(Long unitNum) {
        regUnitNum(CK_NES, unitNum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * UNIT_NUM: {bigint(19)}
     * @param unitNum The value of unitNum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnitNum_GreaterThan(Long unitNum) {
        regUnitNum(CK_GT, unitNum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * UNIT_NUM: {bigint(19)}
     * @param unitNum The value of unitNum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnitNum_LessThan(Long unitNum) {
        regUnitNum(CK_LT, unitNum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * UNIT_NUM: {bigint(19)}
     * @param unitNum The value of unitNum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnitNum_GreaterEqual(Long unitNum) {
        regUnitNum(CK_GE, unitNum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * UNIT_NUM: {bigint(19)}
     * @param unitNum The value of unitNum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnitNum_LessEqual(Long unitNum) {
        regUnitNum(CK_LE, unitNum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * UNIT_NUM: {bigint(19)}
     * @param minNumber The min number of unitNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of unitNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setUnitNum_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueUnitNum(), "UNIT_NUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * UNIT_NUM: {bigint(19)}
     * @param unitNumList The collection of unitNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnitNum_InScope(Collection<Long> unitNumList) {
        doSetUnitNum_InScope(unitNumList);
    }

    protected void doSetUnitNum_InScope(Collection<Long> unitNumList) {
        regINS(CK_INS, cTL(unitNumList), xgetCValueUnitNum(), "UNIT_NUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * UNIT_NUM: {bigint(19)}
     * @param unitNumList The collection of unitNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnitNum_NotInScope(Collection<Long> unitNumList) {
        doSetUnitNum_NotInScope(unitNumList);
    }

    protected void doSetUnitNum_NotInScope(Collection<Long> unitNumList) {
        regINS(CK_NINS, cTL(unitNumList), xgetCValueUnitNum(), "UNIT_NUM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * UNIT_NUM: {bigint(19)}
     */
    public void setUnitNum_IsNull() { regUnitNum(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * UNIT_NUM: {bigint(19)}
     */
    public void setUnitNum_IsNotNull() { regUnitNum(CK_ISNN, DOBJ); }

    protected void regUnitNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUnitNum(), "UNIT_NUM"); }
    protected abstract ConditionValue xgetCValueUnitNum();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * LENGTH: {decimal(16, 6)}
     * @param length The value of length as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setLength_Equal(java.math.BigDecimal length) {
        doSetLength_Equal(length);
    }

    protected void doSetLength_Equal(java.math.BigDecimal length) {
        regLength(CK_EQ, length);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LENGTH: {decimal(16, 6)}
     * @param length The value of length as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLength_NotEqual(java.math.BigDecimal length) {
        doSetLength_NotEqual(length);
    }

    protected void doSetLength_NotEqual(java.math.BigDecimal length) {
        regLength(CK_NES, length);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LENGTH: {decimal(16, 6)}
     * @param length The value of length as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLength_GreaterThan(java.math.BigDecimal length) {
        regLength(CK_GT, length);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LENGTH: {decimal(16, 6)}
     * @param length The value of length as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLength_LessThan(java.math.BigDecimal length) {
        regLength(CK_LT, length);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LENGTH: {decimal(16, 6)}
     * @param length The value of length as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLength_GreaterEqual(java.math.BigDecimal length) {
        regLength(CK_GE, length);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LENGTH: {decimal(16, 6)}
     * @param length The value of length as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLength_LessEqual(java.math.BigDecimal length) {
        regLength(CK_LE, length);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * LENGTH: {decimal(16, 6)}
     * @param minNumber The min number of length. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of length. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setLength_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueLength(), "LENGTH", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LENGTH: {decimal(16, 6)}
     * @param lengthList The collection of length as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLength_InScope(Collection<java.math.BigDecimal> lengthList) {
        doSetLength_InScope(lengthList);
    }

    protected void doSetLength_InScope(Collection<java.math.BigDecimal> lengthList) {
        regINS(CK_INS, cTL(lengthList), xgetCValueLength(), "LENGTH");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LENGTH: {decimal(16, 6)}
     * @param lengthList The collection of length as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLength_NotInScope(Collection<java.math.BigDecimal> lengthList) {
        doSetLength_NotInScope(lengthList);
    }

    protected void doSetLength_NotInScope(Collection<java.math.BigDecimal> lengthList) {
        regINS(CK_NINS, cTL(lengthList), xgetCValueLength(), "LENGTH");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LENGTH: {decimal(16, 6)}
     */
    public void setLength_IsNull() { regLength(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LENGTH: {decimal(16, 6)}
     */
    public void setLength_IsNotNull() { regLength(CK_ISNN, DOBJ); }

    protected void regLength(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLength(), "LENGTH"); }
    protected abstract ConditionValue xgetCValueLength();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * WIDTH: {decimal(16, 6)}
     * @param width The value of width as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setWidth_Equal(java.math.BigDecimal width) {
        doSetWidth_Equal(width);
    }

    protected void doSetWidth_Equal(java.math.BigDecimal width) {
        regWidth(CK_EQ, width);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * WIDTH: {decimal(16, 6)}
     * @param width The value of width as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWidth_NotEqual(java.math.BigDecimal width) {
        doSetWidth_NotEqual(width);
    }

    protected void doSetWidth_NotEqual(java.math.BigDecimal width) {
        regWidth(CK_NES, width);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * WIDTH: {decimal(16, 6)}
     * @param width The value of width as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setWidth_GreaterThan(java.math.BigDecimal width) {
        regWidth(CK_GT, width);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * WIDTH: {decimal(16, 6)}
     * @param width The value of width as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setWidth_LessThan(java.math.BigDecimal width) {
        regWidth(CK_LT, width);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * WIDTH: {decimal(16, 6)}
     * @param width The value of width as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWidth_GreaterEqual(java.math.BigDecimal width) {
        regWidth(CK_GE, width);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * WIDTH: {decimal(16, 6)}
     * @param width The value of width as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWidth_LessEqual(java.math.BigDecimal width) {
        regWidth(CK_LE, width);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * WIDTH: {decimal(16, 6)}
     * @param minNumber The min number of width. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of width. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setWidth_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueWidth(), "WIDTH", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * WIDTH: {decimal(16, 6)}
     * @param widthList The collection of width as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWidth_InScope(Collection<java.math.BigDecimal> widthList) {
        doSetWidth_InScope(widthList);
    }

    protected void doSetWidth_InScope(Collection<java.math.BigDecimal> widthList) {
        regINS(CK_INS, cTL(widthList), xgetCValueWidth(), "WIDTH");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * WIDTH: {decimal(16, 6)}
     * @param widthList The collection of width as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWidth_NotInScope(Collection<java.math.BigDecimal> widthList) {
        doSetWidth_NotInScope(widthList);
    }

    protected void doSetWidth_NotInScope(Collection<java.math.BigDecimal> widthList) {
        regINS(CK_NINS, cTL(widthList), xgetCValueWidth(), "WIDTH");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * WIDTH: {decimal(16, 6)}
     */
    public void setWidth_IsNull() { regWidth(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * WIDTH: {decimal(16, 6)}
     */
    public void setWidth_IsNotNull() { regWidth(CK_ISNN, DOBJ); }

    protected void regWidth(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWidth(), "WIDTH"); }
    protected abstract ConditionValue xgetCValueWidth();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * HEIGHT: {decimal(16, 6)}
     * @param height The value of height as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setHeight_Equal(java.math.BigDecimal height) {
        doSetHeight_Equal(height);
    }

    protected void doSetHeight_Equal(java.math.BigDecimal height) {
        regHeight(CK_EQ, height);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * HEIGHT: {decimal(16, 6)}
     * @param height The value of height as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setHeight_NotEqual(java.math.BigDecimal height) {
        doSetHeight_NotEqual(height);
    }

    protected void doSetHeight_NotEqual(java.math.BigDecimal height) {
        regHeight(CK_NES, height);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * HEIGHT: {decimal(16, 6)}
     * @param height The value of height as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setHeight_GreaterThan(java.math.BigDecimal height) {
        regHeight(CK_GT, height);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * HEIGHT: {decimal(16, 6)}
     * @param height The value of height as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setHeight_LessThan(java.math.BigDecimal height) {
        regHeight(CK_LT, height);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * HEIGHT: {decimal(16, 6)}
     * @param height The value of height as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setHeight_GreaterEqual(java.math.BigDecimal height) {
        regHeight(CK_GE, height);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * HEIGHT: {decimal(16, 6)}
     * @param height The value of height as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setHeight_LessEqual(java.math.BigDecimal height) {
        regHeight(CK_LE, height);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * HEIGHT: {decimal(16, 6)}
     * @param minNumber The min number of height. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of height. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setHeight_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueHeight(), "HEIGHT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * HEIGHT: {decimal(16, 6)}
     * @param heightList The collection of height as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHeight_InScope(Collection<java.math.BigDecimal> heightList) {
        doSetHeight_InScope(heightList);
    }

    protected void doSetHeight_InScope(Collection<java.math.BigDecimal> heightList) {
        regINS(CK_INS, cTL(heightList), xgetCValueHeight(), "HEIGHT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * HEIGHT: {decimal(16, 6)}
     * @param heightList The collection of height as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHeight_NotInScope(Collection<java.math.BigDecimal> heightList) {
        doSetHeight_NotInScope(heightList);
    }

    protected void doSetHeight_NotInScope(Collection<java.math.BigDecimal> heightList) {
        regINS(CK_NINS, cTL(heightList), xgetCValueHeight(), "HEIGHT");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * HEIGHT: {decimal(16, 6)}
     */
    public void setHeight_IsNull() { regHeight(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * HEIGHT: {decimal(16, 6)}
     */
    public void setHeight_IsNotNull() { regHeight(CK_ISNN, DOBJ); }

    protected void regHeight(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueHeight(), "HEIGHT"); }
    protected abstract ConditionValue xgetCValueHeight();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * VOLUME: {decimal(16, 6)}
     * @param volume The value of volume as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setVolume_Equal(java.math.BigDecimal volume) {
        doSetVolume_Equal(volume);
    }

    protected void doSetVolume_Equal(java.math.BigDecimal volume) {
        regVolume(CK_EQ, volume);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * VOLUME: {decimal(16, 6)}
     * @param volume The value of volume as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setVolume_NotEqual(java.math.BigDecimal volume) {
        doSetVolume_NotEqual(volume);
    }

    protected void doSetVolume_NotEqual(java.math.BigDecimal volume) {
        regVolume(CK_NES, volume);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * VOLUME: {decimal(16, 6)}
     * @param volume The value of volume as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setVolume_GreaterThan(java.math.BigDecimal volume) {
        regVolume(CK_GT, volume);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * VOLUME: {decimal(16, 6)}
     * @param volume The value of volume as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setVolume_LessThan(java.math.BigDecimal volume) {
        regVolume(CK_LT, volume);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * VOLUME: {decimal(16, 6)}
     * @param volume The value of volume as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setVolume_GreaterEqual(java.math.BigDecimal volume) {
        regVolume(CK_GE, volume);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * VOLUME: {decimal(16, 6)}
     * @param volume The value of volume as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setVolume_LessEqual(java.math.BigDecimal volume) {
        regVolume(CK_LE, volume);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * VOLUME: {decimal(16, 6)}
     * @param minNumber The min number of volume. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of volume. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setVolume_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueVolume(), "VOLUME", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * VOLUME: {decimal(16, 6)}
     * @param volumeList The collection of volume as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVolume_InScope(Collection<java.math.BigDecimal> volumeList) {
        doSetVolume_InScope(volumeList);
    }

    protected void doSetVolume_InScope(Collection<java.math.BigDecimal> volumeList) {
        regINS(CK_INS, cTL(volumeList), xgetCValueVolume(), "VOLUME");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * VOLUME: {decimal(16, 6)}
     * @param volumeList The collection of volume as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVolume_NotInScope(Collection<java.math.BigDecimal> volumeList) {
        doSetVolume_NotInScope(volumeList);
    }

    protected void doSetVolume_NotInScope(Collection<java.math.BigDecimal> volumeList) {
        regINS(CK_NINS, cTL(volumeList), xgetCValueVolume(), "VOLUME");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * VOLUME: {decimal(16, 6)}
     */
    public void setVolume_IsNull() { regVolume(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * VOLUME: {decimal(16, 6)}
     */
    public void setVolume_IsNotNull() { regVolume(CK_ISNN, DOBJ); }

    protected void regVolume(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueVolume(), "VOLUME"); }
    protected abstract ConditionValue xgetCValueVolume();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * NET_WEIGHT: {decimal(16, 6)}
     * @param netWeight The value of netWeight as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setNetWeight_Equal(java.math.BigDecimal netWeight) {
        doSetNetWeight_Equal(netWeight);
    }

    protected void doSetNetWeight_Equal(java.math.BigDecimal netWeight) {
        regNetWeight(CK_EQ, netWeight);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NET_WEIGHT: {decimal(16, 6)}
     * @param netWeight The value of netWeight as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNetWeight_NotEqual(java.math.BigDecimal netWeight) {
        doSetNetWeight_NotEqual(netWeight);
    }

    protected void doSetNetWeight_NotEqual(java.math.BigDecimal netWeight) {
        regNetWeight(CK_NES, netWeight);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NET_WEIGHT: {decimal(16, 6)}
     * @param netWeight The value of netWeight as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNetWeight_GreaterThan(java.math.BigDecimal netWeight) {
        regNetWeight(CK_GT, netWeight);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NET_WEIGHT: {decimal(16, 6)}
     * @param netWeight The value of netWeight as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNetWeight_LessThan(java.math.BigDecimal netWeight) {
        regNetWeight(CK_LT, netWeight);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * NET_WEIGHT: {decimal(16, 6)}
     * @param netWeight The value of netWeight as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNetWeight_GreaterEqual(java.math.BigDecimal netWeight) {
        regNetWeight(CK_GE, netWeight);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * NET_WEIGHT: {decimal(16, 6)}
     * @param netWeight The value of netWeight as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNetWeight_LessEqual(java.math.BigDecimal netWeight) {
        regNetWeight(CK_LE, netWeight);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * NET_WEIGHT: {decimal(16, 6)}
     * @param minNumber The min number of netWeight. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of netWeight. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setNetWeight_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueNetWeight(), "NET_WEIGHT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * NET_WEIGHT: {decimal(16, 6)}
     * @param netWeightList The collection of netWeight as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNetWeight_InScope(Collection<java.math.BigDecimal> netWeightList) {
        doSetNetWeight_InScope(netWeightList);
    }

    protected void doSetNetWeight_InScope(Collection<java.math.BigDecimal> netWeightList) {
        regINS(CK_INS, cTL(netWeightList), xgetCValueNetWeight(), "NET_WEIGHT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * NET_WEIGHT: {decimal(16, 6)}
     * @param netWeightList The collection of netWeight as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNetWeight_NotInScope(Collection<java.math.BigDecimal> netWeightList) {
        doSetNetWeight_NotInScope(netWeightList);
    }

    protected void doSetNetWeight_NotInScope(Collection<java.math.BigDecimal> netWeightList) {
        regINS(CK_NINS, cTL(netWeightList), xgetCValueNetWeight(), "NET_WEIGHT");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * NET_WEIGHT: {decimal(16, 6)}
     */
    public void setNetWeight_IsNull() { regNetWeight(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * NET_WEIGHT: {decimal(16, 6)}
     */
    public void setNetWeight_IsNotNull() { regNetWeight(CK_ISNN, DOBJ); }

    protected void regNetWeight(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNetWeight(), "NET_WEIGHT"); }
    protected abstract ConditionValue xgetCValueNetWeight();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * GROSS_WEIGHT: {decimal(16, 6)}
     * @param grossWeight The value of grossWeight as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setGrossWeight_Equal(java.math.BigDecimal grossWeight) {
        doSetGrossWeight_Equal(grossWeight);
    }

    protected void doSetGrossWeight_Equal(java.math.BigDecimal grossWeight) {
        regGrossWeight(CK_EQ, grossWeight);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * GROSS_WEIGHT: {decimal(16, 6)}
     * @param grossWeight The value of grossWeight as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setGrossWeight_NotEqual(java.math.BigDecimal grossWeight) {
        doSetGrossWeight_NotEqual(grossWeight);
    }

    protected void doSetGrossWeight_NotEqual(java.math.BigDecimal grossWeight) {
        regGrossWeight(CK_NES, grossWeight);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * GROSS_WEIGHT: {decimal(16, 6)}
     * @param grossWeight The value of grossWeight as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setGrossWeight_GreaterThan(java.math.BigDecimal grossWeight) {
        regGrossWeight(CK_GT, grossWeight);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * GROSS_WEIGHT: {decimal(16, 6)}
     * @param grossWeight The value of grossWeight as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setGrossWeight_LessThan(java.math.BigDecimal grossWeight) {
        regGrossWeight(CK_LT, grossWeight);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * GROSS_WEIGHT: {decimal(16, 6)}
     * @param grossWeight The value of grossWeight as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setGrossWeight_GreaterEqual(java.math.BigDecimal grossWeight) {
        regGrossWeight(CK_GE, grossWeight);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * GROSS_WEIGHT: {decimal(16, 6)}
     * @param grossWeight The value of grossWeight as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setGrossWeight_LessEqual(java.math.BigDecimal grossWeight) {
        regGrossWeight(CK_LE, grossWeight);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * GROSS_WEIGHT: {decimal(16, 6)}
     * @param minNumber The min number of grossWeight. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of grossWeight. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setGrossWeight_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueGrossWeight(), "GROSS_WEIGHT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * GROSS_WEIGHT: {decimal(16, 6)}
     * @param grossWeightList The collection of grossWeight as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGrossWeight_InScope(Collection<java.math.BigDecimal> grossWeightList) {
        doSetGrossWeight_InScope(grossWeightList);
    }

    protected void doSetGrossWeight_InScope(Collection<java.math.BigDecimal> grossWeightList) {
        regINS(CK_INS, cTL(grossWeightList), xgetCValueGrossWeight(), "GROSS_WEIGHT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * GROSS_WEIGHT: {decimal(16, 6)}
     * @param grossWeightList The collection of grossWeight as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGrossWeight_NotInScope(Collection<java.math.BigDecimal> grossWeightList) {
        doSetGrossWeight_NotInScope(grossWeightList);
    }

    protected void doSetGrossWeight_NotInScope(Collection<java.math.BigDecimal> grossWeightList) {
        regINS(CK_NINS, cTL(grossWeightList), xgetCValueGrossWeight(), "GROSS_WEIGHT");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * GROSS_WEIGHT: {decimal(16, 6)}
     */
    public void setGrossWeight_IsNull() { regGrossWeight(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * GROSS_WEIGHT: {decimal(16, 6)}
     */
    public void setGrossWeight_IsNotNull() { regGrossWeight(CK_ISNN, DOBJ); }

    protected void regGrossWeight(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueGrossWeight(), "GROSS_WEIGHT"); }
    protected abstract ConditionValue xgetCValueGrossWeight();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg}
     * @param delFlg The value of delFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelFlg_Equal(String delFlg) {
        doSetDelFlg_Equal(fRES(delFlg));
    }

    /**
     * Equal(=). As DelFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg} <br>
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

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg}
     * @param delFlgList The collection of delFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelFlg_InScope(Collection<String> delFlgList) {
        doSetDelFlg_InScope(delFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As DelFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg} <br>
     * 削除フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelFlg_InScope_AsDelFlg(Collection<CDef.DelFlg> cdefList) {
        doSetDelFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetDelFlg_InScope(Collection<String> delFlgList) {
        regINS(CK_INS, cTL(delFlgList), xgetCValueDelFlg(), "DEL_FLG");
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
    public HpSLCFunction<MProductShapeCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, MProductShapeCB.class);
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
    public HpSLCFunction<MProductShapeCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, MProductShapeCB.class);
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
    public HpSLCFunction<MProductShapeCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, MProductShapeCB.class);
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
    public HpSLCFunction<MProductShapeCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, MProductShapeCB.class);
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
    public HpSLCFunction<MProductShapeCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, MProductShapeCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;MProductShapeCB&gt;() {
     *     public void query(MProductShapeCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<MProductShapeCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, MProductShapeCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        MProductShapeCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(MProductShapeCQ sq);

    protected MProductShapeCB xcreateScalarConditionCB() {
        MProductShapeCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected MProductShapeCB xcreateScalarConditionPartitionByCB() {
        MProductShapeCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<MProductShapeCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MProductShapeCB cb = new MProductShapeCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "PRODUCT_SHAPE_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(MProductShapeCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<MProductShapeCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(MProductShapeCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MProductShapeCB cb = new MProductShapeCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "PRODUCT_SHAPE_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(MProductShapeCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<MProductShapeCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MProductShapeCB cb = new MProductShapeCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(MProductShapeCQ sq);

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
    protected MProductShapeCB newMyCB() {
        return new MProductShapeCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return MProductShapeCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
