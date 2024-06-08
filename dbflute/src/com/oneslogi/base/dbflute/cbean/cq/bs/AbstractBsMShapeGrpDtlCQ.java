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
 * The abstract condition-query of M_SHAPE_GRP_DTL.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsMShapeGrpDtlCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsMShapeGrpDtlCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "M_SHAPE_GRP_DTL";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHAPE_GRP_DTL_ID: {PK, ID, NotNull, bigint identity(19)}
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
     * SHAPE_GRP_DTL_ID: {PK, ID, NotNull, bigint identity(19)}
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
     * SHAPE_GRP_DTL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param shapeGrpDtlId The value of shapeGrpDtlId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShapeGrpDtlId_GreaterThan(Long shapeGrpDtlId) {
        regShapeGrpDtlId(CK_GT, shapeGrpDtlId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHAPE_GRP_DTL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param shapeGrpDtlId The value of shapeGrpDtlId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShapeGrpDtlId_LessThan(Long shapeGrpDtlId) {
        regShapeGrpDtlId(CK_LT, shapeGrpDtlId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHAPE_GRP_DTL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param shapeGrpDtlId The value of shapeGrpDtlId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShapeGrpDtlId_GreaterEqual(Long shapeGrpDtlId) {
        regShapeGrpDtlId(CK_GE, shapeGrpDtlId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHAPE_GRP_DTL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param shapeGrpDtlId The value of shapeGrpDtlId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShapeGrpDtlId_LessEqual(Long shapeGrpDtlId) {
        regShapeGrpDtlId(CK_LE, shapeGrpDtlId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SHAPE_GRP_DTL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of shapeGrpDtlId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of shapeGrpDtlId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setShapeGrpDtlId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueShapeGrpDtlId(), "SHAPE_GRP_DTL_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SHAPE_GRP_DTL_ID: {PK, ID, NotNull, bigint identity(19)}
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
     * SHAPE_GRP_DTL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param shapeGrpDtlIdList The collection of shapeGrpDtlId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShapeGrpDtlId_NotInScope(Collection<Long> shapeGrpDtlIdList) {
        doSetShapeGrpDtlId_NotInScope(shapeGrpDtlIdList);
    }

    protected void doSetShapeGrpDtlId_NotInScope(Collection<Long> shapeGrpDtlIdList) {
        regINS(CK_NINS, cTL(shapeGrpDtlIdList), xgetCValueShapeGrpDtlId(), "SHAPE_GRP_DTL_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select SHAPE_GRP_DTL_ID from M_PRODUCT_SHAPE where ...)} <br>
     * M_PRODUCT_SHAPE by SHAPE_GRP_DTL_ID, named 'MProductShapeAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMProductShapeList</span>(shapeCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     shapeCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MProductShapeList for 'exists'. (NotNull)
     */
    public void existsMProductShapeList(SubQuery<MProductShapeCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MProductShapeCB cb = new MProductShapeCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepShapeGrpDtlId_ExistsReferrer_MProductShapeList(cb.query());
        registerExistsReferrer(cb.query(), "SHAPE_GRP_DTL_ID", "SHAPE_GRP_DTL_ID", pp, "mProductShapeList");
    }
    public abstract String keepShapeGrpDtlId_ExistsReferrer_MProductShapeList(MProductShapeCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select SHAPE_GRP_DTL_ID from M_PRODUCT_SHAPE where ...)} <br>
     * M_PRODUCT_SHAPE by SHAPE_GRP_DTL_ID, named 'MProductShapeAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMProductShapeList</span>(shapeCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     shapeCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ShapeGrpDtlId_NotExistsReferrer_MProductShapeList for 'not exists'. (NotNull)
     */
    public void notExistsMProductShapeList(SubQuery<MProductShapeCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MProductShapeCB cb = new MProductShapeCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepShapeGrpDtlId_NotExistsReferrer_MProductShapeList(cb.query());
        registerNotExistsReferrer(cb.query(), "SHAPE_GRP_DTL_ID", "SHAPE_GRP_DTL_ID", pp, "mProductShapeList");
    }
    public abstract String keepShapeGrpDtlId_NotExistsReferrer_MProductShapeList(MProductShapeCQ sq);

    public void xsderiveMProductShapeList(String fn, SubQuery<MProductShapeCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MProductShapeCB cb = new MProductShapeCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepShapeGrpDtlId_SpecifyDerivedReferrer_MProductShapeList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "SHAPE_GRP_DTL_ID", "SHAPE_GRP_DTL_ID", pp, "mProductShapeList", al, op);
    }
    public abstract String keepShapeGrpDtlId_SpecifyDerivedReferrer_MProductShapeList(MProductShapeCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from M_PRODUCT_SHAPE where ...)} <br>
     * M_PRODUCT_SHAPE by SHAPE_GRP_DTL_ID, named 'MProductShapeAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMProductShapeList()</span>.<span style="color: #CC4747">max</span>(shapeCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     shapeCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     shapeCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MProductShapeCB> derivedMProductShapeList() {
        return xcreateQDRFunctionMProductShapeList();
    }
    protected HpQDRFunction<MProductShapeCB> xcreateQDRFunctionMProductShapeList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMProductShapeList(fn, sq, rd, vl, op));
    }
    public void xqderiveMProductShapeList(String fn, SubQuery<MProductShapeCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MProductShapeCB cb = new MProductShapeCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepShapeGrpDtlId_QueryDerivedReferrer_MProductShapeList(cb.query()); String prpp = keepShapeGrpDtlId_QueryDerivedReferrer_MProductShapeListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "SHAPE_GRP_DTL_ID", "SHAPE_GRP_DTL_ID", sqpp, "mProductShapeList", rd, vl, prpp, op);
    }
    public abstract String keepShapeGrpDtlId_QueryDerivedReferrer_MProductShapeList(MProductShapeCQ sq);
    public abstract String keepShapeGrpDtlId_QueryDerivedReferrer_MProductShapeListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHAPE_GRP_DTL_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setShapeGrpDtlId_IsNull() { regShapeGrpDtlId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHAPE_GRP_DTL_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setShapeGrpDtlId_IsNotNull() { regShapeGrpDtlId(CK_ISNN, DOBJ); }

    protected void regShapeGrpDtlId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShapeGrpDtlId(), "SHAPE_GRP_DTL_ID"); }
    protected abstract ConditionValue xgetCValueShapeGrpDtlId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHAPE_GRP_ID: {IX, NotNull, bigint(19), FK to M_SHAPE_GRP}
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
     * SHAPE_GRP_ID: {IX, NotNull, bigint(19), FK to M_SHAPE_GRP}
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
     * SHAPE_GRP_ID: {IX, NotNull, bigint(19), FK to M_SHAPE_GRP}
     * @param shapeGrpId The value of shapeGrpId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShapeGrpId_GreaterThan(Long shapeGrpId) {
        regShapeGrpId(CK_GT, shapeGrpId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHAPE_GRP_ID: {IX, NotNull, bigint(19), FK to M_SHAPE_GRP}
     * @param shapeGrpId The value of shapeGrpId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShapeGrpId_LessThan(Long shapeGrpId) {
        regShapeGrpId(CK_LT, shapeGrpId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHAPE_GRP_ID: {IX, NotNull, bigint(19), FK to M_SHAPE_GRP}
     * @param shapeGrpId The value of shapeGrpId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShapeGrpId_GreaterEqual(Long shapeGrpId) {
        regShapeGrpId(CK_GE, shapeGrpId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHAPE_GRP_ID: {IX, NotNull, bigint(19), FK to M_SHAPE_GRP}
     * @param shapeGrpId The value of shapeGrpId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShapeGrpId_LessEqual(Long shapeGrpId) {
        regShapeGrpId(CK_LE, shapeGrpId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SHAPE_GRP_ID: {IX, NotNull, bigint(19), FK to M_SHAPE_GRP}
     * @param minNumber The min number of shapeGrpId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of shapeGrpId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setShapeGrpId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueShapeGrpId(), "SHAPE_GRP_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SHAPE_GRP_ID: {IX, NotNull, bigint(19), FK to M_SHAPE_GRP}
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
     * SHAPE_GRP_ID: {IX, NotNull, bigint(19), FK to M_SHAPE_GRP}
     * @param shapeGrpIdList The collection of shapeGrpId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShapeGrpId_NotInScope(Collection<Long> shapeGrpIdList) {
        doSetShapeGrpId_NotInScope(shapeGrpIdList);
    }

    protected void doSetShapeGrpId_NotInScope(Collection<Long> shapeGrpIdList) {
        regINS(CK_NINS, cTL(shapeGrpIdList), xgetCValueShapeGrpId(), "SHAPE_GRP_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select SHAPE_GRP_ID from M_SHAPE_GRP where ...)} <br />
     * M_SHAPE_GRP by my SHAPE_GRP_ID, named 'MShapeGrp'.
     * @param subCBLambda The callback for sub-query of MShapeGrp for 'in-scope'. (NotNull)
     */
    public void inScopeMShapeGrp(SubQuery<MShapeGrpCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MShapeGrpCB cb = new MShapeGrpCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepShapeGrpId_InScopeRelation_MShapeGrp(cb.query());
        registerInScopeRelation(cb.query(), "SHAPE_GRP_ID", "SHAPE_GRP_ID", pp, "mShapeGrp", false);
    }
    public abstract String keepShapeGrpId_InScopeRelation_MShapeGrp(MShapeGrpCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select SHAPE_GRP_ID from M_SHAPE_GRP where ...)} <br />
     * M_SHAPE_GRP by my SHAPE_GRP_ID, named 'MShapeGrp'.
     * @param subCBLambda The callback for sub-query of MShapeGrp for 'not in-scope'. (NotNull)
     */
    public void notInScopeMShapeGrp(SubQuery<MShapeGrpCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MShapeGrpCB cb = new MShapeGrpCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepShapeGrpId_NotInScopeRelation_MShapeGrp(cb.query());
        registerInScopeRelation(cb.query(), "SHAPE_GRP_ID", "SHAPE_GRP_ID", pp, "mShapeGrp", true);
    }
    public abstract String keepShapeGrpId_NotInScopeRelation_MShapeGrp(MShapeGrpCQ sq);

    protected void regShapeGrpId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShapeGrpId(), "SHAPE_GRP_ID"); }
    protected abstract ConditionValue xgetCValueShapeGrpId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHAPE_ID: {IX, NotNull, bigint(19), FK to M_SHAPE}
     * @param shapeId The value of shapeId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setShapeId_Equal(Long shapeId) {
        doSetShapeId_Equal(shapeId);
    }

    protected void doSetShapeId_Equal(Long shapeId) {
        regShapeId(CK_EQ, shapeId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHAPE_ID: {IX, NotNull, bigint(19), FK to M_SHAPE}
     * @param shapeId The value of shapeId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShapeId_NotEqual(Long shapeId) {
        doSetShapeId_NotEqual(shapeId);
    }

    protected void doSetShapeId_NotEqual(Long shapeId) {
        regShapeId(CK_NES, shapeId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHAPE_ID: {IX, NotNull, bigint(19), FK to M_SHAPE}
     * @param shapeId The value of shapeId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShapeId_GreaterThan(Long shapeId) {
        regShapeId(CK_GT, shapeId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHAPE_ID: {IX, NotNull, bigint(19), FK to M_SHAPE}
     * @param shapeId The value of shapeId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShapeId_LessThan(Long shapeId) {
        regShapeId(CK_LT, shapeId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHAPE_ID: {IX, NotNull, bigint(19), FK to M_SHAPE}
     * @param shapeId The value of shapeId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShapeId_GreaterEqual(Long shapeId) {
        regShapeId(CK_GE, shapeId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHAPE_ID: {IX, NotNull, bigint(19), FK to M_SHAPE}
     * @param shapeId The value of shapeId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShapeId_LessEqual(Long shapeId) {
        regShapeId(CK_LE, shapeId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SHAPE_ID: {IX, NotNull, bigint(19), FK to M_SHAPE}
     * @param minNumber The min number of shapeId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of shapeId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setShapeId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueShapeId(), "SHAPE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SHAPE_ID: {IX, NotNull, bigint(19), FK to M_SHAPE}
     * @param shapeIdList The collection of shapeId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShapeId_InScope(Collection<Long> shapeIdList) {
        doSetShapeId_InScope(shapeIdList);
    }

    protected void doSetShapeId_InScope(Collection<Long> shapeIdList) {
        regINS(CK_INS, cTL(shapeIdList), xgetCValueShapeId(), "SHAPE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SHAPE_ID: {IX, NotNull, bigint(19), FK to M_SHAPE}
     * @param shapeIdList The collection of shapeId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShapeId_NotInScope(Collection<Long> shapeIdList) {
        doSetShapeId_NotInScope(shapeIdList);
    }

    protected void doSetShapeId_NotInScope(Collection<Long> shapeIdList) {
        regINS(CK_NINS, cTL(shapeIdList), xgetCValueShapeId(), "SHAPE_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select SHAPE_ID from M_SHAPE where ...)} <br />
     * M_SHAPE by my SHAPE_ID, named 'MShape'.
     * @param subCBLambda The callback for sub-query of MShape for 'in-scope'. (NotNull)
     */
    public void inScopeMShape(SubQuery<MShapeCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MShapeCB cb = new MShapeCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepShapeId_InScopeRelation_MShape(cb.query());
        registerInScopeRelation(cb.query(), "SHAPE_ID", "SHAPE_ID", pp, "mShape", false);
    }
    public abstract String keepShapeId_InScopeRelation_MShape(MShapeCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select SHAPE_ID from M_SHAPE where ...)} <br />
     * M_SHAPE by my SHAPE_ID, named 'MShape'.
     * @param subCBLambda The callback for sub-query of MShape for 'not in-scope'. (NotNull)
     */
    public void notInScopeMShape(SubQuery<MShapeCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MShapeCB cb = new MShapeCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepShapeId_NotInScopeRelation_MShape(cb.query());
        registerInScopeRelation(cb.query(), "SHAPE_ID", "SHAPE_ID", pp, "mShape", true);
    }
    public abstract String keepShapeId_NotInScopeRelation_MShape(MShapeCQ sq);

    protected void regShapeId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShapeId(), "SHAPE_ID"); }
    protected abstract ConditionValue xgetCValueShapeId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * GTIN14_SYMBOL: {bigint(19), default=[(1)]}
     * @param gtin14Symbol The value of gtin14Symbol as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setGtin14Symbol_Equal(Long gtin14Symbol) {
        doSetGtin14Symbol_Equal(gtin14Symbol);
    }

    protected void doSetGtin14Symbol_Equal(Long gtin14Symbol) {
        regGtin14Symbol(CK_EQ, gtin14Symbol);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * GTIN14_SYMBOL: {bigint(19), default=[(1)]}
     * @param gtin14Symbol The value of gtin14Symbol as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setGtin14Symbol_NotEqual(Long gtin14Symbol) {
        doSetGtin14Symbol_NotEqual(gtin14Symbol);
    }

    protected void doSetGtin14Symbol_NotEqual(Long gtin14Symbol) {
        regGtin14Symbol(CK_NES, gtin14Symbol);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * GTIN14_SYMBOL: {bigint(19), default=[(1)]}
     * @param gtin14Symbol The value of gtin14Symbol as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setGtin14Symbol_GreaterThan(Long gtin14Symbol) {
        regGtin14Symbol(CK_GT, gtin14Symbol);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * GTIN14_SYMBOL: {bigint(19), default=[(1)]}
     * @param gtin14Symbol The value of gtin14Symbol as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setGtin14Symbol_LessThan(Long gtin14Symbol) {
        regGtin14Symbol(CK_LT, gtin14Symbol);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * GTIN14_SYMBOL: {bigint(19), default=[(1)]}
     * @param gtin14Symbol The value of gtin14Symbol as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setGtin14Symbol_GreaterEqual(Long gtin14Symbol) {
        regGtin14Symbol(CK_GE, gtin14Symbol);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * GTIN14_SYMBOL: {bigint(19), default=[(1)]}
     * @param gtin14Symbol The value of gtin14Symbol as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setGtin14Symbol_LessEqual(Long gtin14Symbol) {
        regGtin14Symbol(CK_LE, gtin14Symbol);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * GTIN14_SYMBOL: {bigint(19), default=[(1)]}
     * @param minNumber The min number of gtin14Symbol. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of gtin14Symbol. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setGtin14Symbol_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueGtin14Symbol(), "GTIN14_SYMBOL", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * GTIN14_SYMBOL: {bigint(19), default=[(1)]}
     * @param gtin14SymbolList The collection of gtin14Symbol as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGtin14Symbol_InScope(Collection<Long> gtin14SymbolList) {
        doSetGtin14Symbol_InScope(gtin14SymbolList);
    }

    protected void doSetGtin14Symbol_InScope(Collection<Long> gtin14SymbolList) {
        regINS(CK_INS, cTL(gtin14SymbolList), xgetCValueGtin14Symbol(), "GTIN14_SYMBOL");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * GTIN14_SYMBOL: {bigint(19), default=[(1)]}
     * @param gtin14SymbolList The collection of gtin14Symbol as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGtin14Symbol_NotInScope(Collection<Long> gtin14SymbolList) {
        doSetGtin14Symbol_NotInScope(gtin14SymbolList);
    }

    protected void doSetGtin14Symbol_NotInScope(Collection<Long> gtin14SymbolList) {
        regINS(CK_NINS, cTL(gtin14SymbolList), xgetCValueGtin14Symbol(), "GTIN14_SYMBOL");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * GTIN14_SYMBOL: {bigint(19), default=[(1)]}
     */
    public void setGtin14Symbol_IsNull() { regGtin14Symbol(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * GTIN14_SYMBOL: {bigint(19), default=[(1)]}
     */
    public void setGtin14Symbol_IsNotNull() { regGtin14Symbol(CK_ISNN, DOBJ); }

    protected void regGtin14Symbol(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueGtin14Symbol(), "GTIN14_SYMBOL"); }
    protected abstract ConditionValue xgetCValueGtin14Symbol();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASE_PICK_FLG: {char(1), FK to B_CLASS_DTL, classification=CasePickFlg}
     * @param casePickFlg The value of casePickFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasePickFlg_Equal(String casePickFlg) {
        doSetCasePickFlg_Equal(fRES(casePickFlg));
    }

    /**
     * Equal(=). As CasePickFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASE_PICK_FLG: {char(1), FK to B_CLASS_DTL, classification=CasePickFlg} <br>
     * ケースピッキング対象
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setCasePickFlg_Equal_AsCasePickFlg(CDef.CasePickFlg cdef) {
        doSetCasePickFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 対象外
     */
    public void setCasePickFlg_Equal_$0() {
        setCasePickFlg_Equal_AsCasePickFlg(CDef.CasePickFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 対象
     */
    public void setCasePickFlg_Equal_$1() {
        setCasePickFlg_Equal_AsCasePickFlg(CDef.CasePickFlg.$1);
    }

    protected void doSetCasePickFlg_Equal(String casePickFlg) {
        regCasePickFlg(CK_EQ, casePickFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASE_PICK_FLG: {char(1), FK to B_CLASS_DTL, classification=CasePickFlg}
     * @param casePickFlg The value of casePickFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasePickFlg_NotEqual(String casePickFlg) {
        doSetCasePickFlg_NotEqual(fRES(casePickFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As CasePickFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASE_PICK_FLG: {char(1), FK to B_CLASS_DTL, classification=CasePickFlg} <br>
     * ケースピッキング対象
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setCasePickFlg_NotEqual_AsCasePickFlg(CDef.CasePickFlg cdef) {
        doSetCasePickFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 対象外
     */
    public void setCasePickFlg_NotEqual_$0() {
        setCasePickFlg_NotEqual_AsCasePickFlg(CDef.CasePickFlg.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 対象
     */
    public void setCasePickFlg_NotEqual_$1() {
        setCasePickFlg_NotEqual_AsCasePickFlg(CDef.CasePickFlg.$1);
    }

    protected void doSetCasePickFlg_NotEqual(String casePickFlg) {
        regCasePickFlg(CK_NES, casePickFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CASE_PICK_FLG: {char(1), FK to B_CLASS_DTL, classification=CasePickFlg}
     * @param casePickFlgList The collection of casePickFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasePickFlg_InScope(Collection<String> casePickFlgList) {
        doSetCasePickFlg_InScope(casePickFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As CasePickFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CASE_PICK_FLG: {char(1), FK to B_CLASS_DTL, classification=CasePickFlg} <br>
     * ケースピッキング対象
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasePickFlg_InScope_AsCasePickFlg(Collection<CDef.CasePickFlg> cdefList) {
        doSetCasePickFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetCasePickFlg_InScope(Collection<String> casePickFlgList) {
        regINS(CK_INS, cTL(casePickFlgList), xgetCValueCasePickFlg(), "CASE_PICK_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CASE_PICK_FLG: {char(1), FK to B_CLASS_DTL, classification=CasePickFlg}
     * @param casePickFlgList The collection of casePickFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasePickFlg_NotInScope(Collection<String> casePickFlgList) {
        doSetCasePickFlg_NotInScope(casePickFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As CasePickFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CASE_PICK_FLG: {char(1), FK to B_CLASS_DTL, classification=CasePickFlg} <br>
     * ケースピッキング対象
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasePickFlg_NotInScope_AsCasePickFlg(Collection<CDef.CasePickFlg> cdefList) {
        doSetCasePickFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetCasePickFlg_NotInScope(Collection<String> casePickFlgList) {
        regINS(CK_NINS, cTL(casePickFlgList), xgetCValueCasePickFlg(), "CASE_PICK_FLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CASE_PICK_FLG: {char(1), FK to B_CLASS_DTL, classification=CasePickFlg}
     */
    public void setCasePickFlg_IsNull() { regCasePickFlg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CASE_PICK_FLG: {char(1), FK to B_CLASS_DTL, classification=CasePickFlg}
     */
    public void setCasePickFlg_IsNotNull() { regCasePickFlg(CK_ISNN, DOBJ); }

    protected void regCasePickFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCasePickFlg(), "CASE_PICK_FLG"); }
    protected abstract ConditionValue xgetCValueCasePickFlg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHAPE_SORT: {NotNull, bigint(19)}
     * @param shapeSort The value of shapeSort as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setShapeSort_Equal(Long shapeSort) {
        doSetShapeSort_Equal(shapeSort);
    }

    protected void doSetShapeSort_Equal(Long shapeSort) {
        regShapeSort(CK_EQ, shapeSort);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHAPE_SORT: {NotNull, bigint(19)}
     * @param shapeSort The value of shapeSort as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShapeSort_NotEqual(Long shapeSort) {
        doSetShapeSort_NotEqual(shapeSort);
    }

    protected void doSetShapeSort_NotEqual(Long shapeSort) {
        regShapeSort(CK_NES, shapeSort);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHAPE_SORT: {NotNull, bigint(19)}
     * @param shapeSort The value of shapeSort as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShapeSort_GreaterThan(Long shapeSort) {
        regShapeSort(CK_GT, shapeSort);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHAPE_SORT: {NotNull, bigint(19)}
     * @param shapeSort The value of shapeSort as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShapeSort_LessThan(Long shapeSort) {
        regShapeSort(CK_LT, shapeSort);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHAPE_SORT: {NotNull, bigint(19)}
     * @param shapeSort The value of shapeSort as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShapeSort_GreaterEqual(Long shapeSort) {
        regShapeSort(CK_GE, shapeSort);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHAPE_SORT: {NotNull, bigint(19)}
     * @param shapeSort The value of shapeSort as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShapeSort_LessEqual(Long shapeSort) {
        regShapeSort(CK_LE, shapeSort);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SHAPE_SORT: {NotNull, bigint(19)}
     * @param minNumber The min number of shapeSort. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of shapeSort. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setShapeSort_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueShapeSort(), "SHAPE_SORT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SHAPE_SORT: {NotNull, bigint(19)}
     * @param shapeSortList The collection of shapeSort as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShapeSort_InScope(Collection<Long> shapeSortList) {
        doSetShapeSort_InScope(shapeSortList);
    }

    protected void doSetShapeSort_InScope(Collection<Long> shapeSortList) {
        regINS(CK_INS, cTL(shapeSortList), xgetCValueShapeSort(), "SHAPE_SORT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SHAPE_SORT: {NotNull, bigint(19)}
     * @param shapeSortList The collection of shapeSort as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShapeSort_NotInScope(Collection<Long> shapeSortList) {
        doSetShapeSort_NotInScope(shapeSortList);
    }

    protected void doSetShapeSort_NotInScope(Collection<Long> shapeSortList) {
        regINS(CK_NINS, cTL(shapeSortList), xgetCValueShapeSort(), "SHAPE_SORT");
    }

    protected void regShapeSort(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShapeSort(), "SHAPE_SORT"); }
    protected abstract ConditionValue xgetCValueShapeSort();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EM_REPLENISH_SHAPE_FLG: {char(1), FK to B_CLASS_DTL, classification=EmReplenishShapeFlg}
     * @param emReplenishShapeFlg The value of emReplenishShapeFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmReplenishShapeFlg_Equal(String emReplenishShapeFlg) {
        doSetEmReplenishShapeFlg_Equal(fRES(emReplenishShapeFlg));
    }

    /**
     * Equal(=). As EmReplenishShapeFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EM_REPLENISH_SHAPE_FLG: {char(1), FK to B_CLASS_DTL, classification=EmReplenishShapeFlg} <br>
     * 緊急補充ゾーン補充荷姿
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setEmReplenishShapeFlg_Equal_AsEmReplenishShapeFlg(CDef.EmReplenishShapeFlg cdef) {
        doSetEmReplenishShapeFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 対象外
     */
    public void setEmReplenishShapeFlg_Equal_$0() {
        setEmReplenishShapeFlg_Equal_AsEmReplenishShapeFlg(CDef.EmReplenishShapeFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 対象
     */
    public void setEmReplenishShapeFlg_Equal_$1() {
        setEmReplenishShapeFlg_Equal_AsEmReplenishShapeFlg(CDef.EmReplenishShapeFlg.$1);
    }

    protected void doSetEmReplenishShapeFlg_Equal(String emReplenishShapeFlg) {
        regEmReplenishShapeFlg(CK_EQ, emReplenishShapeFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EM_REPLENISH_SHAPE_FLG: {char(1), FK to B_CLASS_DTL, classification=EmReplenishShapeFlg}
     * @param emReplenishShapeFlg The value of emReplenishShapeFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmReplenishShapeFlg_NotEqual(String emReplenishShapeFlg) {
        doSetEmReplenishShapeFlg_NotEqual(fRES(emReplenishShapeFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As EmReplenishShapeFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EM_REPLENISH_SHAPE_FLG: {char(1), FK to B_CLASS_DTL, classification=EmReplenishShapeFlg} <br>
     * 緊急補充ゾーン補充荷姿
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setEmReplenishShapeFlg_NotEqual_AsEmReplenishShapeFlg(CDef.EmReplenishShapeFlg cdef) {
        doSetEmReplenishShapeFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 対象外
     */
    public void setEmReplenishShapeFlg_NotEqual_$0() {
        setEmReplenishShapeFlg_NotEqual_AsEmReplenishShapeFlg(CDef.EmReplenishShapeFlg.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 対象
     */
    public void setEmReplenishShapeFlg_NotEqual_$1() {
        setEmReplenishShapeFlg_NotEqual_AsEmReplenishShapeFlg(CDef.EmReplenishShapeFlg.$1);
    }

    protected void doSetEmReplenishShapeFlg_NotEqual(String emReplenishShapeFlg) {
        regEmReplenishShapeFlg(CK_NES, emReplenishShapeFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EM_REPLENISH_SHAPE_FLG: {char(1), FK to B_CLASS_DTL, classification=EmReplenishShapeFlg}
     * @param emReplenishShapeFlgList The collection of emReplenishShapeFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmReplenishShapeFlg_InScope(Collection<String> emReplenishShapeFlgList) {
        doSetEmReplenishShapeFlg_InScope(emReplenishShapeFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As EmReplenishShapeFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EM_REPLENISH_SHAPE_FLG: {char(1), FK to B_CLASS_DTL, classification=EmReplenishShapeFlg} <br>
     * 緊急補充ゾーン補充荷姿
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmReplenishShapeFlg_InScope_AsEmReplenishShapeFlg(Collection<CDef.EmReplenishShapeFlg> cdefList) {
        doSetEmReplenishShapeFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetEmReplenishShapeFlg_InScope(Collection<String> emReplenishShapeFlgList) {
        regINS(CK_INS, cTL(emReplenishShapeFlgList), xgetCValueEmReplenishShapeFlg(), "EM_REPLENISH_SHAPE_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EM_REPLENISH_SHAPE_FLG: {char(1), FK to B_CLASS_DTL, classification=EmReplenishShapeFlg}
     * @param emReplenishShapeFlgList The collection of emReplenishShapeFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmReplenishShapeFlg_NotInScope(Collection<String> emReplenishShapeFlgList) {
        doSetEmReplenishShapeFlg_NotInScope(emReplenishShapeFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As EmReplenishShapeFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EM_REPLENISH_SHAPE_FLG: {char(1), FK to B_CLASS_DTL, classification=EmReplenishShapeFlg} <br>
     * 緊急補充ゾーン補充荷姿
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmReplenishShapeFlg_NotInScope_AsEmReplenishShapeFlg(Collection<CDef.EmReplenishShapeFlg> cdefList) {
        doSetEmReplenishShapeFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetEmReplenishShapeFlg_NotInScope(Collection<String> emReplenishShapeFlgList) {
        regINS(CK_NINS, cTL(emReplenishShapeFlgList), xgetCValueEmReplenishShapeFlg(), "EM_REPLENISH_SHAPE_FLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * EM_REPLENISH_SHAPE_FLG: {char(1), FK to B_CLASS_DTL, classification=EmReplenishShapeFlg}
     */
    public void setEmReplenishShapeFlg_IsNull() { regEmReplenishShapeFlg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * EM_REPLENISH_SHAPE_FLG: {char(1), FK to B_CLASS_DTL, classification=EmReplenishShapeFlg}
     */
    public void setEmReplenishShapeFlg_IsNotNull() { regEmReplenishShapeFlg(CK_ISNN, DOBJ); }

    protected void regEmReplenishShapeFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueEmReplenishShapeFlg(), "EM_REPLENISH_SHAPE_FLG"); }
    protected abstract ConditionValue xgetCValueEmReplenishShapeFlg();

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
    public HpSLCFunction<MShapeGrpDtlCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, MShapeGrpDtlCB.class);
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
    public HpSLCFunction<MShapeGrpDtlCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, MShapeGrpDtlCB.class);
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
    public HpSLCFunction<MShapeGrpDtlCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, MShapeGrpDtlCB.class);
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
    public HpSLCFunction<MShapeGrpDtlCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, MShapeGrpDtlCB.class);
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
    public HpSLCFunction<MShapeGrpDtlCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, MShapeGrpDtlCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;MShapeGrpDtlCB&gt;() {
     *     public void query(MShapeGrpDtlCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<MShapeGrpDtlCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, MShapeGrpDtlCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        MShapeGrpDtlCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(MShapeGrpDtlCQ sq);

    protected MShapeGrpDtlCB xcreateScalarConditionCB() {
        MShapeGrpDtlCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected MShapeGrpDtlCB xcreateScalarConditionPartitionByCB() {
        MShapeGrpDtlCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<MShapeGrpDtlCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MShapeGrpDtlCB cb = new MShapeGrpDtlCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "SHAPE_GRP_DTL_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(MShapeGrpDtlCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<MShapeGrpDtlCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(MShapeGrpDtlCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MShapeGrpDtlCB cb = new MShapeGrpDtlCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "SHAPE_GRP_DTL_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(MShapeGrpDtlCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<MShapeGrpDtlCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MShapeGrpDtlCB cb = new MShapeGrpDtlCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(MShapeGrpDtlCQ sq);

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
    protected MShapeGrpDtlCB newMyCB() {
        return new MShapeGrpDtlCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return MShapeGrpDtlCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
