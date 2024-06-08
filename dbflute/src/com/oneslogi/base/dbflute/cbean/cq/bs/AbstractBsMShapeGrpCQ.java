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
 * The abstract condition-query of M_SHAPE_GRP.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsMShapeGrpCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsMShapeGrpCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "M_SHAPE_GRP";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHAPE_GRP_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param shapeGrpId The value of shapeGrpId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setShapeGrpId_Equal(Long shapeGrpId) {
        doSetShapeGrpId_Equal(shapeGrpId);
    }

    protected void doSetShapeGrpId_Equal(Long shapeGrpId) {
        regShapeGrpId(CK_EQ, shapeGrpId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHAPE_GRP_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param shapeGrpId The value of shapeGrpId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShapeGrpId_NotEqual(Long shapeGrpId) {
        doSetShapeGrpId_NotEqual(shapeGrpId);
    }

    protected void doSetShapeGrpId_NotEqual(Long shapeGrpId) {
        regShapeGrpId(CK_NES, shapeGrpId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHAPE_GRP_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param shapeGrpId The value of shapeGrpId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShapeGrpId_GreaterThan(Long shapeGrpId) {
        regShapeGrpId(CK_GT, shapeGrpId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHAPE_GRP_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param shapeGrpId The value of shapeGrpId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShapeGrpId_LessThan(Long shapeGrpId) {
        regShapeGrpId(CK_LT, shapeGrpId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHAPE_GRP_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param shapeGrpId The value of shapeGrpId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShapeGrpId_GreaterEqual(Long shapeGrpId) {
        regShapeGrpId(CK_GE, shapeGrpId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHAPE_GRP_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param shapeGrpId The value of shapeGrpId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShapeGrpId_LessEqual(Long shapeGrpId) {
        regShapeGrpId(CK_LE, shapeGrpId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SHAPE_GRP_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of shapeGrpId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of shapeGrpId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setShapeGrpId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueShapeGrpId(), "SHAPE_GRP_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SHAPE_GRP_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param shapeGrpIdList The collection of shapeGrpId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShapeGrpId_InScope(Collection<Long> shapeGrpIdList) {
        doSetShapeGrpId_InScope(shapeGrpIdList);
    }

    protected void doSetShapeGrpId_InScope(Collection<Long> shapeGrpIdList) {
        regINS(CK_INS, cTL(shapeGrpIdList), xgetCValueShapeGrpId(), "SHAPE_GRP_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SHAPE_GRP_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param shapeGrpIdList The collection of shapeGrpId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShapeGrpId_NotInScope(Collection<Long> shapeGrpIdList) {
        doSetShapeGrpId_NotInScope(shapeGrpIdList);
    }

    protected void doSetShapeGrpId_NotInScope(Collection<Long> shapeGrpIdList) {
        regINS(CK_NINS, cTL(shapeGrpIdList), xgetCValueShapeGrpId(), "SHAPE_GRP_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select SHAPE_GRP_ID from M_CLIENT where ...)} <br>
     * M_CLIENT by SHAPE_GRP_ID, named 'MClientAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMClientList</span>(clientCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     clientCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MClientList for 'exists'. (NotNull)
     */
    public void existsMClientList(SubQuery<MClientCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MClientCB cb = new MClientCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepShapeGrpId_ExistsReferrer_MClientList(cb.query());
        registerExistsReferrer(cb.query(), "SHAPE_GRP_ID", "SHAPE_GRP_ID", pp, "mClientList");
    }
    public abstract String keepShapeGrpId_ExistsReferrer_MClientList(MClientCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select SHAPE_GRP_ID from M_PRODUCT where ...)} <br>
     * M_PRODUCT by SHAPE_GRP_ID, named 'MProductAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMProductList</span>(productCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     productCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MProductList for 'exists'. (NotNull)
     */
    public void existsMProductList(SubQuery<MProductCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MProductCB cb = new MProductCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepShapeGrpId_ExistsReferrer_MProductList(cb.query());
        registerExistsReferrer(cb.query(), "SHAPE_GRP_ID", "SHAPE_GRP_ID", pp, "mProductList");
    }
    public abstract String keepShapeGrpId_ExistsReferrer_MProductList(MProductCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select SHAPE_GRP_ID from M_SHAPE_GRP_DTL where ...)} <br>
     * M_SHAPE_GRP_DTL by SHAPE_GRP_ID, named 'MShapeGrpDtlAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMShapeGrpDtlList</span>(dtlCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     dtlCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MShapeGrpDtlList for 'exists'. (NotNull)
     */
    public void existsMShapeGrpDtlList(SubQuery<MShapeGrpDtlCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MShapeGrpDtlCB cb = new MShapeGrpDtlCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepShapeGrpId_ExistsReferrer_MShapeGrpDtlList(cb.query());
        registerExistsReferrer(cb.query(), "SHAPE_GRP_ID", "SHAPE_GRP_ID", pp, "mShapeGrpDtlList");
    }
    public abstract String keepShapeGrpId_ExistsReferrer_MShapeGrpDtlList(MShapeGrpDtlCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select SHAPE_GRP_ID from M_CLIENT where ...)} <br>
     * M_CLIENT by SHAPE_GRP_ID, named 'MClientAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMClientList</span>(clientCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     clientCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ShapeGrpId_NotExistsReferrer_MClientList for 'not exists'. (NotNull)
     */
    public void notExistsMClientList(SubQuery<MClientCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MClientCB cb = new MClientCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepShapeGrpId_NotExistsReferrer_MClientList(cb.query());
        registerNotExistsReferrer(cb.query(), "SHAPE_GRP_ID", "SHAPE_GRP_ID", pp, "mClientList");
    }
    public abstract String keepShapeGrpId_NotExistsReferrer_MClientList(MClientCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select SHAPE_GRP_ID from M_PRODUCT where ...)} <br>
     * M_PRODUCT by SHAPE_GRP_ID, named 'MProductAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMProductList</span>(productCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     productCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ShapeGrpId_NotExistsReferrer_MProductList for 'not exists'. (NotNull)
     */
    public void notExistsMProductList(SubQuery<MProductCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MProductCB cb = new MProductCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepShapeGrpId_NotExistsReferrer_MProductList(cb.query());
        registerNotExistsReferrer(cb.query(), "SHAPE_GRP_ID", "SHAPE_GRP_ID", pp, "mProductList");
    }
    public abstract String keepShapeGrpId_NotExistsReferrer_MProductList(MProductCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select SHAPE_GRP_ID from M_SHAPE_GRP_DTL where ...)} <br>
     * M_SHAPE_GRP_DTL by SHAPE_GRP_ID, named 'MShapeGrpDtlAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMShapeGrpDtlList</span>(dtlCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     dtlCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ShapeGrpId_NotExistsReferrer_MShapeGrpDtlList for 'not exists'. (NotNull)
     */
    public void notExistsMShapeGrpDtlList(SubQuery<MShapeGrpDtlCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MShapeGrpDtlCB cb = new MShapeGrpDtlCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepShapeGrpId_NotExistsReferrer_MShapeGrpDtlList(cb.query());
        registerNotExistsReferrer(cb.query(), "SHAPE_GRP_ID", "SHAPE_GRP_ID", pp, "mShapeGrpDtlList");
    }
    public abstract String keepShapeGrpId_NotExistsReferrer_MShapeGrpDtlList(MShapeGrpDtlCQ sq);

    public void xsderiveMClientList(String fn, SubQuery<MClientCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MClientCB cb = new MClientCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepShapeGrpId_SpecifyDerivedReferrer_MClientList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "SHAPE_GRP_ID", "SHAPE_GRP_ID", pp, "mClientList", al, op);
    }
    public abstract String keepShapeGrpId_SpecifyDerivedReferrer_MClientList(MClientCQ sq);

    public void xsderiveMProductList(String fn, SubQuery<MProductCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MProductCB cb = new MProductCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepShapeGrpId_SpecifyDerivedReferrer_MProductList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "SHAPE_GRP_ID", "SHAPE_GRP_ID", pp, "mProductList", al, op);
    }
    public abstract String keepShapeGrpId_SpecifyDerivedReferrer_MProductList(MProductCQ sq);

    public void xsderiveMShapeGrpDtlList(String fn, SubQuery<MShapeGrpDtlCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MShapeGrpDtlCB cb = new MShapeGrpDtlCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepShapeGrpId_SpecifyDerivedReferrer_MShapeGrpDtlList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "SHAPE_GRP_ID", "SHAPE_GRP_ID", pp, "mShapeGrpDtlList", al, op);
    }
    public abstract String keepShapeGrpId_SpecifyDerivedReferrer_MShapeGrpDtlList(MShapeGrpDtlCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from M_CLIENT where ...)} <br>
     * M_CLIENT by SHAPE_GRP_ID, named 'MClientAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMClientList()</span>.<span style="color: #CC4747">max</span>(clientCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     clientCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     clientCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MClientCB> derivedMClientList() {
        return xcreateQDRFunctionMClientList();
    }
    protected HpQDRFunction<MClientCB> xcreateQDRFunctionMClientList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMClientList(fn, sq, rd, vl, op));
    }
    public void xqderiveMClientList(String fn, SubQuery<MClientCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MClientCB cb = new MClientCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepShapeGrpId_QueryDerivedReferrer_MClientList(cb.query()); String prpp = keepShapeGrpId_QueryDerivedReferrer_MClientListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "SHAPE_GRP_ID", "SHAPE_GRP_ID", sqpp, "mClientList", rd, vl, prpp, op);
    }
    public abstract String keepShapeGrpId_QueryDerivedReferrer_MClientList(MClientCQ sq);
    public abstract String keepShapeGrpId_QueryDerivedReferrer_MClientListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from M_PRODUCT where ...)} <br>
     * M_PRODUCT by SHAPE_GRP_ID, named 'MProductAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMProductList()</span>.<span style="color: #CC4747">max</span>(productCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     productCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     productCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MProductCB> derivedMProductList() {
        return xcreateQDRFunctionMProductList();
    }
    protected HpQDRFunction<MProductCB> xcreateQDRFunctionMProductList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMProductList(fn, sq, rd, vl, op));
    }
    public void xqderiveMProductList(String fn, SubQuery<MProductCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MProductCB cb = new MProductCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepShapeGrpId_QueryDerivedReferrer_MProductList(cb.query()); String prpp = keepShapeGrpId_QueryDerivedReferrer_MProductListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "SHAPE_GRP_ID", "SHAPE_GRP_ID", sqpp, "mProductList", rd, vl, prpp, op);
    }
    public abstract String keepShapeGrpId_QueryDerivedReferrer_MProductList(MProductCQ sq);
    public abstract String keepShapeGrpId_QueryDerivedReferrer_MProductListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from M_SHAPE_GRP_DTL where ...)} <br>
     * M_SHAPE_GRP_DTL by SHAPE_GRP_ID, named 'MShapeGrpDtlAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMShapeGrpDtlList()</span>.<span style="color: #CC4747">max</span>(dtlCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     dtlCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     dtlCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MShapeGrpDtlCB> derivedMShapeGrpDtlList() {
        return xcreateQDRFunctionMShapeGrpDtlList();
    }
    protected HpQDRFunction<MShapeGrpDtlCB> xcreateQDRFunctionMShapeGrpDtlList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMShapeGrpDtlList(fn, sq, rd, vl, op));
    }
    public void xqderiveMShapeGrpDtlList(String fn, SubQuery<MShapeGrpDtlCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MShapeGrpDtlCB cb = new MShapeGrpDtlCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepShapeGrpId_QueryDerivedReferrer_MShapeGrpDtlList(cb.query()); String prpp = keepShapeGrpId_QueryDerivedReferrer_MShapeGrpDtlListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "SHAPE_GRP_ID", "SHAPE_GRP_ID", sqpp, "mShapeGrpDtlList", rd, vl, prpp, op);
    }
    public abstract String keepShapeGrpId_QueryDerivedReferrer_MShapeGrpDtlList(MShapeGrpDtlCQ sq);
    public abstract String keepShapeGrpId_QueryDerivedReferrer_MShapeGrpDtlListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHAPE_GRP_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setShapeGrpId_IsNull() { regShapeGrpId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHAPE_GRP_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setShapeGrpId_IsNotNull() { regShapeGrpId(CK_ISNN, DOBJ); }

    protected void regShapeGrpId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShapeGrpId(), "SHAPE_GRP_ID"); }
    protected abstract ConditionValue xgetCValueShapeGrpId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {IX+, NotNull, bigint(19), FK to M_CLIENT}
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
     * CLIENT_ID: {IX+, NotNull, bigint(19), FK to M_CLIENT}
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
     * CLIENT_ID: {IX+, NotNull, bigint(19), FK to M_CLIENT}
     * @param clientId The value of clientId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_GreaterThan(Long clientId) {
        regClientId(CK_GT, clientId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {IX+, NotNull, bigint(19), FK to M_CLIENT}
     * @param clientId The value of clientId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_LessThan(Long clientId) {
        regClientId(CK_LT, clientId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {IX+, NotNull, bigint(19), FK to M_CLIENT}
     * @param clientId The value of clientId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_GreaterEqual(Long clientId) {
        regClientId(CK_GE, clientId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {IX+, NotNull, bigint(19), FK to M_CLIENT}
     * @param clientId The value of clientId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_LessEqual(Long clientId) {
        regClientId(CK_LE, clientId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {IX+, NotNull, bigint(19), FK to M_CLIENT}
     * @param minNumber The min number of clientId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of clientId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setClientId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueClientId(), "CLIENT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CLIENT_ID: {IX+, NotNull, bigint(19), FK to M_CLIENT}
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
     * CLIENT_ID: {IX+, NotNull, bigint(19), FK to M_CLIENT}
     * @param clientIdList The collection of clientId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientId_NotInScope(Collection<Long> clientIdList) {
        doSetClientId_NotInScope(clientIdList);
    }

    protected void doSetClientId_NotInScope(Collection<Long> clientIdList) {
        regINS(CK_NINS, cTL(clientIdList), xgetCValueClientId(), "CLIENT_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select CLIENT_ID from M_CLIENT where ...)} <br />
     * M_CLIENT by my CLIENT_ID, named 'MClient'.
     * @param subCBLambda The callback for sub-query of MClient for 'in-scope'. (NotNull)
     */
    public void inScopeMClient(SubQuery<MClientCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MClientCB cb = new MClientCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepClientId_InScopeRelation_MClient(cb.query());
        registerInScopeRelation(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "mClient", false);
    }
    public abstract String keepClientId_InScopeRelation_MClient(MClientCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select CLIENT_ID from M_CLIENT where ...)} <br />
     * M_CLIENT by my CLIENT_ID, named 'MClient'.
     * @param subCBLambda The callback for sub-query of MClient for 'not in-scope'. (NotNull)
     */
    public void notInScopeMClient(SubQuery<MClientCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MClientCB cb = new MClientCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepClientId_NotInScopeRelation_MClient(cb.query());
        registerInScopeRelation(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "mClient", true);
    }
    public abstract String keepClientId_NotInScopeRelation_MClient(MClientCQ sq);

    protected void regClientId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueClientId(), "CLIENT_ID"); }
    protected abstract ConditionValue xgetCValueClientId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHAPE_GRP_CD: {NotNull, varchar(30)}
     * @param shapeGrpCd The value of shapeGrpCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShapeGrpCd_Equal(String shapeGrpCd) {
        doSetShapeGrpCd_Equal(fRES(shapeGrpCd));
    }

    protected void doSetShapeGrpCd_Equal(String shapeGrpCd) {
        regShapeGrpCd(CK_EQ, shapeGrpCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHAPE_GRP_CD: {NotNull, varchar(30)}
     * @param shapeGrpCd The value of shapeGrpCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShapeGrpCd_NotEqual(String shapeGrpCd) {
        doSetShapeGrpCd_NotEqual(fRES(shapeGrpCd));
    }

    protected void doSetShapeGrpCd_NotEqual(String shapeGrpCd) {
        regShapeGrpCd(CK_NES, shapeGrpCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHAPE_GRP_CD: {NotNull, varchar(30)}
     * @param shapeGrpCd The value of shapeGrpCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShapeGrpCd_GreaterThan(String shapeGrpCd) {
        regShapeGrpCd(CK_GT, fRES(shapeGrpCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHAPE_GRP_CD: {NotNull, varchar(30)}
     * @param shapeGrpCd The value of shapeGrpCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShapeGrpCd_LessThan(String shapeGrpCd) {
        regShapeGrpCd(CK_LT, fRES(shapeGrpCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHAPE_GRP_CD: {NotNull, varchar(30)}
     * @param shapeGrpCd The value of shapeGrpCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShapeGrpCd_GreaterEqual(String shapeGrpCd) {
        regShapeGrpCd(CK_GE, fRES(shapeGrpCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHAPE_GRP_CD: {NotNull, varchar(30)}
     * @param shapeGrpCd The value of shapeGrpCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShapeGrpCd_LessEqual(String shapeGrpCd) {
        regShapeGrpCd(CK_LE, fRES(shapeGrpCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHAPE_GRP_CD: {NotNull, varchar(30)}
     * @param shapeGrpCdList The collection of shapeGrpCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShapeGrpCd_InScope(Collection<String> shapeGrpCdList) {
        doSetShapeGrpCd_InScope(shapeGrpCdList);
    }

    protected void doSetShapeGrpCd_InScope(Collection<String> shapeGrpCdList) {
        regINS(CK_INS, cTL(shapeGrpCdList), xgetCValueShapeGrpCd(), "SHAPE_GRP_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHAPE_GRP_CD: {NotNull, varchar(30)}
     * @param shapeGrpCdList The collection of shapeGrpCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShapeGrpCd_NotInScope(Collection<String> shapeGrpCdList) {
        doSetShapeGrpCd_NotInScope(shapeGrpCdList);
    }

    protected void doSetShapeGrpCd_NotInScope(Collection<String> shapeGrpCdList) {
        regINS(CK_NINS, cTL(shapeGrpCdList), xgetCValueShapeGrpCd(), "SHAPE_GRP_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHAPE_GRP_CD: {NotNull, varchar(30)} <br>
     * <pre>e.g. setShapeGrpCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param shapeGrpCd The value of shapeGrpCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setShapeGrpCd_LikeSearch(String shapeGrpCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(shapeGrpCd), xgetCValueShapeGrpCd(), "SHAPE_GRP_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHAPE_GRP_CD: {NotNull, varchar(30)}
     * @param shapeGrpCd The value of shapeGrpCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setShapeGrpCd_NotLikeSearch(String shapeGrpCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shapeGrpCd), xgetCValueShapeGrpCd(), "SHAPE_GRP_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHAPE_GRP_CD: {NotNull, varchar(30)}
     * @param shapeGrpCd The value of shapeGrpCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShapeGrpCd_PrefixSearch(String shapeGrpCd) {
        setShapeGrpCd_LikeSearch(shapeGrpCd, xcLSOPPre());
    }

    protected void regShapeGrpCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShapeGrpCd(), "SHAPE_GRP_CD"); }
    protected abstract ConditionValue xgetCValueShapeGrpCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHAPE_GRP_NAME: {NotNull, varchar(255)}
     * @param shapeGrpName The value of shapeGrpName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShapeGrpName_Equal(String shapeGrpName) {
        doSetShapeGrpName_Equal(fRES(shapeGrpName));
    }

    protected void doSetShapeGrpName_Equal(String shapeGrpName) {
        regShapeGrpName(CK_EQ, shapeGrpName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHAPE_GRP_NAME: {NotNull, varchar(255)}
     * @param shapeGrpName The value of shapeGrpName as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShapeGrpName_NotEqual(String shapeGrpName) {
        doSetShapeGrpName_NotEqual(fRES(shapeGrpName));
    }

    protected void doSetShapeGrpName_NotEqual(String shapeGrpName) {
        regShapeGrpName(CK_NES, shapeGrpName);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHAPE_GRP_NAME: {NotNull, varchar(255)}
     * @param shapeGrpName The value of shapeGrpName as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShapeGrpName_GreaterThan(String shapeGrpName) {
        regShapeGrpName(CK_GT, fRES(shapeGrpName));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHAPE_GRP_NAME: {NotNull, varchar(255)}
     * @param shapeGrpName The value of shapeGrpName as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShapeGrpName_LessThan(String shapeGrpName) {
        regShapeGrpName(CK_LT, fRES(shapeGrpName));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHAPE_GRP_NAME: {NotNull, varchar(255)}
     * @param shapeGrpName The value of shapeGrpName as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShapeGrpName_GreaterEqual(String shapeGrpName) {
        regShapeGrpName(CK_GE, fRES(shapeGrpName));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHAPE_GRP_NAME: {NotNull, varchar(255)}
     * @param shapeGrpName The value of shapeGrpName as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShapeGrpName_LessEqual(String shapeGrpName) {
        regShapeGrpName(CK_LE, fRES(shapeGrpName));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHAPE_GRP_NAME: {NotNull, varchar(255)}
     * @param shapeGrpNameList The collection of shapeGrpName as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShapeGrpName_InScope(Collection<String> shapeGrpNameList) {
        doSetShapeGrpName_InScope(shapeGrpNameList);
    }

    protected void doSetShapeGrpName_InScope(Collection<String> shapeGrpNameList) {
        regINS(CK_INS, cTL(shapeGrpNameList), xgetCValueShapeGrpName(), "SHAPE_GRP_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHAPE_GRP_NAME: {NotNull, varchar(255)}
     * @param shapeGrpNameList The collection of shapeGrpName as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShapeGrpName_NotInScope(Collection<String> shapeGrpNameList) {
        doSetShapeGrpName_NotInScope(shapeGrpNameList);
    }

    protected void doSetShapeGrpName_NotInScope(Collection<String> shapeGrpNameList) {
        regINS(CK_NINS, cTL(shapeGrpNameList), xgetCValueShapeGrpName(), "SHAPE_GRP_NAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHAPE_GRP_NAME: {NotNull, varchar(255)} <br>
     * <pre>e.g. setShapeGrpName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param shapeGrpName The value of shapeGrpName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setShapeGrpName_LikeSearch(String shapeGrpName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(shapeGrpName), xgetCValueShapeGrpName(), "SHAPE_GRP_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHAPE_GRP_NAME: {NotNull, varchar(255)}
     * @param shapeGrpName The value of shapeGrpName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setShapeGrpName_NotLikeSearch(String shapeGrpName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shapeGrpName), xgetCValueShapeGrpName(), "SHAPE_GRP_NAME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHAPE_GRP_NAME: {NotNull, varchar(255)}
     * @param shapeGrpName The value of shapeGrpName as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShapeGrpName_PrefixSearch(String shapeGrpName) {
        setShapeGrpName_LikeSearch(shapeGrpName, xcLSOPPre());
    }

    protected void regShapeGrpName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShapeGrpName(), "SHAPE_GRP_NAME"); }
    protected abstract ConditionValue xgetCValueShapeGrpName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DECIMAL_EXIST_FLG: {NotNull, char(1), FK to B_CLASS_DTL, classification=DecimalExistFlg}
     * @param decimalExistFlg The value of decimalExistFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDecimalExistFlg_Equal(String decimalExistFlg) {
        doSetDecimalExistFlg_Equal(fRES(decimalExistFlg));
    }

    /**
     * Equal(=). As DecimalExistFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DECIMAL_EXIST_FLG: {NotNull, char(1), FK to B_CLASS_DTL, classification=DecimalExistFlg} <br>
     * 小数有無フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setDecimalExistFlg_Equal_AsDecimalExistFlg(CDef.DecimalExistFlg cdef) {
        doSetDecimalExistFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 小数を含まない
     */
    public void setDecimalExistFlg_Equal_$0() {
        setDecimalExistFlg_Equal_AsDecimalExistFlg(CDef.DecimalExistFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 小数を含む
     */
    public void setDecimalExistFlg_Equal_$1() {
        setDecimalExistFlg_Equal_AsDecimalExistFlg(CDef.DecimalExistFlg.$1);
    }

    protected void doSetDecimalExistFlg_Equal(String decimalExistFlg) {
        regDecimalExistFlg(CK_EQ, decimalExistFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DECIMAL_EXIST_FLG: {NotNull, char(1), FK to B_CLASS_DTL, classification=DecimalExistFlg}
     * @param decimalExistFlg The value of decimalExistFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDecimalExistFlg_NotEqual(String decimalExistFlg) {
        doSetDecimalExistFlg_NotEqual(fRES(decimalExistFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As DecimalExistFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DECIMAL_EXIST_FLG: {NotNull, char(1), FK to B_CLASS_DTL, classification=DecimalExistFlg} <br>
     * 小数有無フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setDecimalExistFlg_NotEqual_AsDecimalExistFlg(CDef.DecimalExistFlg cdef) {
        doSetDecimalExistFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 小数を含まない
     */
    public void setDecimalExistFlg_NotEqual_$0() {
        setDecimalExistFlg_NotEqual_AsDecimalExistFlg(CDef.DecimalExistFlg.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 小数を含む
     */
    public void setDecimalExistFlg_NotEqual_$1() {
        setDecimalExistFlg_NotEqual_AsDecimalExistFlg(CDef.DecimalExistFlg.$1);
    }

    protected void doSetDecimalExistFlg_NotEqual(String decimalExistFlg) {
        regDecimalExistFlg(CK_NES, decimalExistFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DECIMAL_EXIST_FLG: {NotNull, char(1), FK to B_CLASS_DTL, classification=DecimalExistFlg}
     * @param decimalExistFlgList The collection of decimalExistFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDecimalExistFlg_InScope(Collection<String> decimalExistFlgList) {
        doSetDecimalExistFlg_InScope(decimalExistFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As DecimalExistFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DECIMAL_EXIST_FLG: {NotNull, char(1), FK to B_CLASS_DTL, classification=DecimalExistFlg} <br>
     * 小数有無フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDecimalExistFlg_InScope_AsDecimalExistFlg(Collection<CDef.DecimalExistFlg> cdefList) {
        doSetDecimalExistFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetDecimalExistFlg_InScope(Collection<String> decimalExistFlgList) {
        regINS(CK_INS, cTL(decimalExistFlgList), xgetCValueDecimalExistFlg(), "DECIMAL_EXIST_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DECIMAL_EXIST_FLG: {NotNull, char(1), FK to B_CLASS_DTL, classification=DecimalExistFlg}
     * @param decimalExistFlgList The collection of decimalExistFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDecimalExistFlg_NotInScope(Collection<String> decimalExistFlgList) {
        doSetDecimalExistFlg_NotInScope(decimalExistFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As DecimalExistFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DECIMAL_EXIST_FLG: {NotNull, char(1), FK to B_CLASS_DTL, classification=DecimalExistFlg} <br>
     * 小数有無フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDecimalExistFlg_NotInScope_AsDecimalExistFlg(Collection<CDef.DecimalExistFlg> cdefList) {
        doSetDecimalExistFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetDecimalExistFlg_NotInScope(Collection<String> decimalExistFlgList) {
        regINS(CK_NINS, cTL(decimalExistFlgList), xgetCValueDecimalExistFlg(), "DECIMAL_EXIST_FLG");
    }

    protected void regDecimalExistFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDecimalExistFlg(), "DECIMAL_EXIST_FLG"); }
    protected abstract ConditionValue xgetCValueDecimalExistFlg();

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
    public HpSLCFunction<MShapeGrpCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, MShapeGrpCB.class);
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
    public HpSLCFunction<MShapeGrpCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, MShapeGrpCB.class);
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
    public HpSLCFunction<MShapeGrpCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, MShapeGrpCB.class);
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
    public HpSLCFunction<MShapeGrpCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, MShapeGrpCB.class);
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
    public HpSLCFunction<MShapeGrpCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, MShapeGrpCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;MShapeGrpCB&gt;() {
     *     public void query(MShapeGrpCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<MShapeGrpCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, MShapeGrpCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        MShapeGrpCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(MShapeGrpCQ sq);

    protected MShapeGrpCB xcreateScalarConditionCB() {
        MShapeGrpCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected MShapeGrpCB xcreateScalarConditionPartitionByCB() {
        MShapeGrpCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<MShapeGrpCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MShapeGrpCB cb = new MShapeGrpCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "SHAPE_GRP_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(MShapeGrpCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<MShapeGrpCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(MShapeGrpCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MShapeGrpCB cb = new MShapeGrpCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "SHAPE_GRP_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(MShapeGrpCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<MShapeGrpCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MShapeGrpCB cb = new MShapeGrpCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(MShapeGrpCQ sq);

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
    protected MShapeGrpCB newMyCB() {
        return new MShapeGrpCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return MShapeGrpCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
