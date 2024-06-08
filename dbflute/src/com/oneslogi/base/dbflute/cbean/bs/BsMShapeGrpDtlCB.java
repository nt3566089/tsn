package com.oneslogi.base.dbflute.cbean.bs;

import org.dbflute.cbean.AbstractConditionBean;
import org.dbflute.cbean.ConditionBean;
import org.dbflute.cbean.ConditionQuery;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.dream.*;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.cbean.sqlclause.SqlClauseCreator;
import org.dbflute.cbean.scoping.*;
import org.dbflute.dbmeta.DBMetaProvider;
import org.dbflute.twowaysql.factory.SqlAnalyzerFactory;
import org.dbflute.twowaysql.style.BoundDateDisplayTimeZoneProvider;
import com.oneslogi.base.dbflute.allcommon.DBFluteConfig;
import com.oneslogi.base.dbflute.allcommon.DBMetaInstanceHandler;
import com.oneslogi.base.dbflute.allcommon.ImplementedInvokerAssistant;
import com.oneslogi.base.dbflute.allcommon.ImplementedSqlClauseCreator;
import com.oneslogi.base.dbflute.cbean.*;
import com.oneslogi.base.dbflute.cbean.cq.*;
import com.oneslogi.base.dbflute.cbean.nss.*;

/**
 * The base condition-bean of M_SHAPE_GRP_DTL.
 * @author DBFlute(AutoGenerator)
 */
public class BsMShapeGrpDtlCB extends AbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MShapeGrpDtlCQ _conditionQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMShapeGrpDtlCB() {
        if (DBFluteConfig.getInstance().isPagingCountLater()) {
            enablePagingCountLater();
        }
        if (DBFluteConfig.getInstance().isPagingCountLeastJoin()) {
            enablePagingCountLeastJoin();
        }
        if (DBFluteConfig.getInstance().isNonSpecifiedColumnAccessAllowed()) {
            enableNonSpecifiedColumnAccess();
        }
        if (DBFluteConfig.getInstance().isSpecifyColumnRequired()) {
            enableSpecifyColumnRequired();
        }
        xsetSpecifyColumnRequiredExceptDeterminer(DBFluteConfig.getInstance().getSpecifyColumnRequiredExceptDeterminer());
        if (DBFluteConfig.getInstance().isSpecifyColumnRequiredWarningOnly()) {
            xenableSpecifyColumnRequiredWarningOnly();
        }
        if (DBFluteConfig.getInstance().isQueryUpdateCountPreCheck()) {
            enableQueryUpdateCountPreCheck();
        }
    }

    // ===================================================================================
    //                                                                           SqlClause
    //                                                                           =========
    @Override
    protected SqlClause createSqlClause() {
        SqlClauseCreator creator = DBFluteConfig.getInstance().getSqlClauseCreator();
        if (creator != null) {
            return creator.createSqlClause(this);
        }
        return new ImplementedSqlClauseCreator().createSqlClause(this); // as default
    }

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    @Override
    protected DBMetaProvider getDBMetaProvider() {
        return DBMetaInstanceHandler.getProvider(); // as default
    }

    public String asTableDbName() {
        return "M_SHAPE_GRP_DTL";
    }

    // ===================================================================================
    //                                                                 PrimaryKey Handling
    //                                                                 ===================
    /**
     * Accept the query condition of primary key as equal.
     * @param shapeGrpDtlId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return this. (NotNull)
     */
    public MShapeGrpDtlCB acceptPK(Long shapeGrpDtlId) {
        assertObjectNotNull("shapeGrpDtlId", shapeGrpDtlId);
        BsMShapeGrpDtlCB cb = this;
        cb.query().setShapeGrpDtlId_Equal(shapeGrpDtlId);
        return (MShapeGrpDtlCB)this;
    }

    /**
     * Accept the query condition of primary key as equal. (old style)
     * @param shapeGrpDtlId : PK, ID, NotNull, bigint identity(19). (NotNull)
     */
    public void acceptPrimaryKey(Long shapeGrpDtlId) {
        assertObjectNotNull("shapeGrpDtlId", shapeGrpDtlId);
        BsMShapeGrpDtlCB cb = this;
        cb.query().setShapeGrpDtlId_Equal(shapeGrpDtlId);
    }

    public ConditionBean addOrderBy_PK_Asc() {
        query().addOrderBy_ShapeGrpDtlId_Asc();
        return this;
    }

    public ConditionBean addOrderBy_PK_Desc() {
        query().addOrderBy_ShapeGrpDtlId_Desc();
        return this;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Prepare for various queries. <br>
     * Examples of main functions are following:
     * <pre>
     * <span style="color: #3F7E5E">// Basic Queries</span>
     * cb.query().setMemberId_Equal(value);        <span style="color: #3F7E5E">// =</span>
     * cb.query().setMemberId_NotEqual(value);     <span style="color: #3F7E5E">// !=</span>
     * cb.query().setMemberId_GreaterThan(value);  <span style="color: #3F7E5E">// &gt;</span>
     * cb.query().setMemberId_LessThan(value);     <span style="color: #3F7E5E">// &lt;</span>
     * cb.query().setMemberId_GreaterEqual(value); <span style="color: #3F7E5E">// &gt;=</span>
     * cb.query().setMemberId_LessEqual(value);    <span style="color: #3F7E5E">// &lt;=</span>
     * cb.query().setMemberName_InScope(valueList);    <span style="color: #3F7E5E">// in ('a', 'b')</span>
     * cb.query().setMemberName_NotInScope(valueList); <span style="color: #3F7E5E">// not in ('a', 'b')</span>
     * <span style="color: #3F7E5E">// LikeSearch with various options: (versatile)</span>
     * <span style="color: #3F7E5E">// {like ... [options]}</span>
     * cb.query().setMemberName_LikeSearch(value, option);
     * cb.query().setMemberName_NotLikeSearch(value, option); <span style="color: #3F7E5E">// not like ...</span>
     * <span style="color: #3F7E5E">// FromTo with various options: (versatile)</span>
     * <span style="color: #3F7E5E">// {(default) fromDatetime &lt;= BIRTHDATE &lt;= toDatetime}</span>
     * cb.query().setBirthdate_FromTo(fromDatetime, toDatetime, option);
     * <span style="color: #3F7E5E">// DateFromTo: (Date means yyyy/MM/dd)</span>
     * <span style="color: #3F7E5E">// {fromDate &lt;= BIRTHDATE &lt; toDate + 1 day}</span>
     * cb.query().setBirthdate_IsNull();    <span style="color: #3F7E5E">// is null</span>
     * cb.query().setBirthdate_IsNotNull(); <span style="color: #3F7E5E">// is not null</span>
     *
     * <span style="color: #3F7E5E">// ExistsReferrer: (correlated sub-query)</span>
     * <span style="color: #3F7E5E">// {where exists (select PURCHASE_ID from PURCHASE where ...)}</span>
     * cb.query().existsPurchase(purchaseCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     purchaseCB.query().set... <span style="color: #3F7E5E">// referrer sub-query condition</span>
     * });
     * cb.query().notExistsPurchase...
     *
     * <span style="color: #3F7E5E">// (Query)DerivedReferrer: (correlated sub-query)</span>
     * cb.query().derivedPurchaseList().max(purchaseCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     purchaseCB.specify().columnPurchasePrice(); <span style="color: #3F7E5E">// derived column for function</span>
     *     purchaseCB.query().set... <span style="color: #3F7E5E">// referrer sub-query condition</span>
     * }).greaterEqual(value);
     *
     * <span style="color: #3F7E5E">// ScalarCondition: (self-table sub-query)</span>
     * cb.query().scalar_Equal().max(scalarCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     scalarCB.specify().columnBirthdate(); <span style="color: #3F7E5E">// derived column for function</span>
     *     scalarCB.query().set... <span style="color: #3F7E5E">// scalar sub-query condition</span>
     * });
     *
     * <span style="color: #3F7E5E">// OrderBy</span>
     * cb.query().addOrderBy_MemberName_Asc();
     * cb.query().addOrderBy_MemberName_Desc().withManualOrder(option);
     * cb.query().addOrderBy_MemberName_Desc().withNullsFirst();
     * cb.query().addOrderBy_MemberName_Desc().withNullsLast();
     * cb.query().addSpecifiedDerivedOrderBy_Desc(aliasName);
     *
     * <span style="color: #3F7E5E">// Query(Relation)</span>
     * cb.query().queryMemberStatus()...;
     * cb.query().queryMemberAddressAsValid(targetDate)...;
     * </pre>
     * @return The instance of condition-query for base-point table to set up query. (NotNull)
     */
    public MShapeGrpDtlCQ query() {
        assertQueryPurpose(); // assert only when user-public query
        return doGetConditionQuery();
    }

    public MShapeGrpDtlCQ xdfgetConditionQuery() { // public for parameter comment and internal
        return doGetConditionQuery();
    }

    protected MShapeGrpDtlCQ doGetConditionQuery() {
        if (_conditionQuery == null) {
            _conditionQuery = createLocalCQ();
        }
        return _conditionQuery;
    }

    protected MShapeGrpDtlCQ createLocalCQ() {
        return xcreateCQ(null, getSqlClause(), getSqlClause().getBasePointAliasName(), 0);
    }

    protected MShapeGrpDtlCQ xcreateCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        MShapeGrpDtlCQ cq = xnewCQ(childQuery, sqlClause, aliasName, nestLevel);
        cq.xsetBaseCB(this);
        return cq;
    }

    protected MShapeGrpDtlCQ xnewCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        return new MShapeGrpDtlCQ(childQuery, sqlClause, aliasName, nestLevel);
    }

    /**
     * {@inheritDoc}
     */
    public ConditionQuery localCQ() {
        return doGetConditionQuery();
    }

    // ===================================================================================
    //                                                                               Union
    //                                                                               =====
    /**
     * Set up 'union' for base-point table. <br>
     * You don't need to call SetupSelect in union-query,
     * because it inherits calls before. (Don't call SetupSelect after here)
     * <pre>
     * cb.query().<span style="color: #CC4747">union</span>(<span style="color: #553000">unionCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">unionCB</span>.query().set...
     * });
     * </pre>
     * @param unionCBLambda The callback for query of 'union'. (NotNull)
     */
    public void union(UnionQuery<MShapeGrpDtlCB> unionCBLambda) {
        final MShapeGrpDtlCB cb = new MShapeGrpDtlCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionCBLambda.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final MShapeGrpDtlCQ cq = cb.query(); query().xsetUnionQuery(cq);
    }

    /**
     * Set up 'union all' for base-point table. <br>
     * You don't need to call SetupSelect in union-query,
     * because it inherits calls before. (Don't call SetupSelect after here)
     * <pre>
     * cb.query().<span style="color: #CC4747">unionAll</span>(<span style="color: #553000">unionCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">unionCB</span>.query().set...
     * });
     * </pre>
     * @param unionCBLambda The callback for query of 'union all'. (NotNull)
     */
    public void unionAll(UnionQuery<MShapeGrpDtlCB> unionCBLambda) {
        final MShapeGrpDtlCB cb = new MShapeGrpDtlCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionCBLambda.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final MShapeGrpDtlCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
    }

    // ===================================================================================
    //                                                                         SetupSelect
    //                                                                         ===========
    protected MShapeNss _nssMShape;
    public MShapeNss xdfgetNssMShape() {
        if (_nssMShape == null) { _nssMShape = new MShapeNss(null); }
        return _nssMShape;
    }
    /**
     * Set up relation columns to select clause. <br>
     * M_SHAPE by my SHAPE_ID, named 'MShape'.
     * <pre>
     * <span style="color: #0000C0">mShapeGrpDtlBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_MShape()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mShapeGrpDtl</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mShapeGrpDtl</span>.<span style="color: #CC4747">getMShape()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MShapeNss setupSelect_MShape() {
        assertSetupSelectPurpose("mShape");
        if (hasSpecifiedLocalColumn()) {
            specify().columnShapeId();
        }
        doSetupSelect(() -> query().queryMShape());
        if (_nssMShape == null || !_nssMShape.hasConditionQuery())
        { _nssMShape = new MShapeNss(query().queryMShape()); }
        return _nssMShape;
    }

    protected MShapeGrpNss _nssMShapeGrp;
    public MShapeGrpNss xdfgetNssMShapeGrp() {
        if (_nssMShapeGrp == null) { _nssMShapeGrp = new MShapeGrpNss(null); }
        return _nssMShapeGrp;
    }
    /**
     * Set up relation columns to select clause. <br>
     * M_SHAPE_GRP by my SHAPE_GRP_ID, named 'MShapeGrp'.
     * <pre>
     * <span style="color: #0000C0">mShapeGrpDtlBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_MShapeGrp()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mShapeGrpDtl</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mShapeGrpDtl</span>.<span style="color: #CC4747">getMShapeGrp()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MShapeGrpNss setupSelect_MShapeGrp() {
        assertSetupSelectPurpose("mShapeGrp");
        if (hasSpecifiedLocalColumn()) {
            specify().columnShapeGrpId();
        }
        doSetupSelect(() -> query().queryMShapeGrp());
        if (_nssMShapeGrp == null || !_nssMShapeGrp.hasConditionQuery())
        { _nssMShapeGrp = new MShapeGrpNss(query().queryMShapeGrp()); }
        return _nssMShapeGrp;
    }

    protected BClassDtlNss _nssBClassDtlByCasePickFlg;
    public BClassDtlNss xdfgetNssBClassDtlByCasePickFlg() {
        if (_nssBClassDtlByCasePickFlg == null) { _nssBClassDtlByCasePickFlg = new BClassDtlNss(null); }
        return _nssBClassDtlByCasePickFlg;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my CASE_PICK_FLG, named 'BClassDtlByCasePickFlg'.
     * <pre>
     * <span style="color: #0000C0">mShapeGrpDtlBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByCasePickFlg()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mShapeGrpDtl</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mShapeGrpDtl</span>.<span style="color: #CC4747">getBClassDtlByCasePickFlg()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByCasePickFlg() {
        assertSetupSelectPurpose("bClassDtlByCasePickFlg");
        if (hasSpecifiedLocalColumn()) {
            specify().columnCasePickFlg();
        }
        doSetupSelect(() -> query().queryBClassDtlByCasePickFlg());
        if (_nssBClassDtlByCasePickFlg == null || !_nssBClassDtlByCasePickFlg.hasConditionQuery())
        { _nssBClassDtlByCasePickFlg = new BClassDtlNss(query().queryBClassDtlByCasePickFlg()); }
        return _nssBClassDtlByCasePickFlg;
    }

    protected BClassDtlNss _nssBClassDtlByEmReplenishShapeFlg;
    public BClassDtlNss xdfgetNssBClassDtlByEmReplenishShapeFlg() {
        if (_nssBClassDtlByEmReplenishShapeFlg == null) { _nssBClassDtlByEmReplenishShapeFlg = new BClassDtlNss(null); }
        return _nssBClassDtlByEmReplenishShapeFlg;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my EM_REPLENISH_SHAPE_FLG, named 'BClassDtlByEmReplenishShapeFlg'.
     * <pre>
     * <span style="color: #0000C0">mShapeGrpDtlBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByEmReplenishShapeFlg()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mShapeGrpDtl</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mShapeGrpDtl</span>.<span style="color: #CC4747">getBClassDtlByEmReplenishShapeFlg()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByEmReplenishShapeFlg() {
        assertSetupSelectPurpose("bClassDtlByEmReplenishShapeFlg");
        if (hasSpecifiedLocalColumn()) {
            specify().columnEmReplenishShapeFlg();
        }
        doSetupSelect(() -> query().queryBClassDtlByEmReplenishShapeFlg());
        if (_nssBClassDtlByEmReplenishShapeFlg == null || !_nssBClassDtlByEmReplenishShapeFlg.hasConditionQuery())
        { _nssBClassDtlByEmReplenishShapeFlg = new BClassDtlNss(query().queryBClassDtlByEmReplenishShapeFlg()); }
        return _nssBClassDtlByEmReplenishShapeFlg;
    }

    protected BClassDtlNss _nssBClassDtlByDelFlg;
    public BClassDtlNss xdfgetNssBClassDtlByDelFlg() {
        if (_nssBClassDtlByDelFlg == null) { _nssBClassDtlByDelFlg = new BClassDtlNss(null); }
        return _nssBClassDtlByDelFlg;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my DEL_FLG, named 'BClassDtlByDelFlg'.
     * <pre>
     * <span style="color: #0000C0">mShapeGrpDtlBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByDelFlg()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mShapeGrpDtl</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mShapeGrpDtl</span>.<span style="color: #CC4747">getBClassDtlByDelFlg()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByDelFlg() {
        assertSetupSelectPurpose("bClassDtlByDelFlg");
        if (hasSpecifiedLocalColumn()) {
            specify().columnDelFlg();
        }
        doSetupSelect(() -> query().queryBClassDtlByDelFlg());
        if (_nssBClassDtlByDelFlg == null || !_nssBClassDtlByDelFlg.hasConditionQuery())
        { _nssBClassDtlByDelFlg = new BClassDtlNss(query().queryBClassDtlByDelFlg()); }
        return _nssBClassDtlByDelFlg;
    }

    // [DBFlute-0.7.4]
    // ===================================================================================
    //                                                                             Specify
    //                                                                             =======
    protected HpSpecification _specification;

    /**
     * Prepare for SpecifyColumn, (Specify)DerivedReferrer. <br>
     * This method should be called after SetupSelect.
     * <pre>
     * <span style="color: #0000C0">memberBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.setupSelect_MemberStatus(); <span style="color: #3F7E5E">// should be called before specify()</span>
     *     <span style="color: #553000">cb</span>.specify().columnMemberName();
     *     <span style="color: #553000">cb</span>.specify().specifyMemberStatus().columnMemberStatusName();
     *     <span style="color: #553000">cb</span>.specify().derivedPurchaseList().max(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">purchaseCB</span>.specify().columnPurchaseDatetime();
     *         <span style="color: #553000">purchaseCB</span>.query().set...
     *     }, aliasName);
     * }).alwaysPresent(<span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ...
     * });
     * </pre>
     * @return The instance of specification. (NotNull)
     */
    public HpSpecification specify() {
        assertSpecifyPurpose();
        if (_specification == null) { _specification = new HpSpecification(this
            , xcreateSpQyCall(() -> true, () -> xdfgetConditionQuery())
            , _purpose, getDBMetaProvider(), xcSDRFnFc()); }
        return _specification;
    }

    public HpColumnSpHandler localSp() {
        return specify();
    }

    public boolean hasSpecifiedLocalColumn() {
        return _specification != null && _specification.hasSpecifiedColumn();
    }

    public static class HpSpecification extends HpAbstractSpecification<MShapeGrpDtlCQ> {
        protected MShapeCB.HpSpecification _mShape;
        protected MShapeGrpCB.HpSpecification _mShapeGrp;
        protected BClassDtlCB.HpSpecification _bClassDtlByCasePickFlg;
        protected BClassDtlCB.HpSpecification _bClassDtlByEmReplenishShapeFlg;
        protected BClassDtlCB.HpSpecification _bClassDtlByDelFlg;
        public HpSpecification(ConditionBean baseCB, HpSpQyCall<MShapeGrpDtlCQ> qyCall
                             , HpCBPurpose purpose, DBMetaProvider dbmetaProvider
                             , HpSDRFunctionFactory sdrFuncFactory)
        { super(baseCB, qyCall, purpose, dbmetaProvider, sdrFuncFactory); }
        /**
         * SHAPE_GRP_DTL_ID: {PK, ID, NotNull, bigint identity(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnShapeGrpDtlId() { return doColumn("SHAPE_GRP_DTL_ID"); }
        /**
         * SHAPE_GRP_ID: {IX, NotNull, bigint(19), FK to M_SHAPE_GRP}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnShapeGrpId() { return doColumn("SHAPE_GRP_ID"); }
        /**
         * SHAPE_ID: {IX, NotNull, bigint(19), FK to M_SHAPE}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnShapeId() { return doColumn("SHAPE_ID"); }
        /**
         * GTIN14_SYMBOL: {bigint(19), default=[(1)]}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnGtin14Symbol() { return doColumn("GTIN14_SYMBOL"); }
        /**
         * CASE_PICK_FLG: {char(1), FK to B_CLASS_DTL, classification=CasePickFlg}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCasePickFlg() { return doColumn("CASE_PICK_FLG"); }
        /**
         * SHAPE_SORT: {NotNull, bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnShapeSort() { return doColumn("SHAPE_SORT"); }
        /**
         * EM_REPLENISH_SHAPE_FLG: {char(1), FK to B_CLASS_DTL, classification=EmReplenishShapeFlg}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnEmReplenishShapeFlg() { return doColumn("EM_REPLENISH_SHAPE_FLG"); }
        /**
         * DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDelFlg() { return doColumn("DEL_FLG"); }
        /**
         * VERSION_NO: {NotNull, bigint(19), default=[(0)]}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnVersionNo() { return doColumn("VERSION_NO"); }
        /**
         * CONTROL_NO: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnControlNo() { return doColumn("CONTROL_NO"); }
        /**
         * ADD_DT: {datetime2(26, 6)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnAddDt() { return doColumn("ADD_DT"); }
        /**
         * ADD_USER: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnAddUser() { return doColumn("ADD_USER"); }
        /**
         * ADD_PROCESS: {varchar(4000)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnAddProcess() { return doColumn("ADD_PROCESS"); }
        /**
         * UPD_DT: {datetime2(26, 6)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnUpdDt() { return doColumn("UPD_DT"); }
        /**
         * UPD_USER: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnUpdUser() { return doColumn("UPD_USER"); }
        /**
         * UPD_PROCESS: {varchar(4000)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnUpdProcess() { return doColumn("UPD_PROCESS"); }
        public void everyColumn() { doEveryColumn(); }
        public void exceptRecordMetaColumn() { doExceptRecordMetaColumn(); }
        @Override
        protected void doSpecifyRequiredColumn() {
            columnShapeGrpDtlId(); // PK
            if (qyCall().qy().hasConditionQueryMShape()
                    || qyCall().qy().xgetReferrerQuery() instanceof MShapeCQ) {
                columnShapeId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryMShapeGrp()
                    || qyCall().qy().xgetReferrerQuery() instanceof MShapeGrpCQ) {
                columnShapeGrpId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByCasePickFlg()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnCasePickFlg(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByEmReplenishShapeFlg()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnEmReplenishShapeFlg(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByDelFlg()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnDelFlg(); // FK or one-to-one referrer
            }
        }
        @Override
        protected String getTableDbName() { return "M_SHAPE_GRP_DTL"; }
        /**
         * Prepare to specify functions about relation table. <br>
         * M_SHAPE by my SHAPE_ID, named 'MShape'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MShapeCB.HpSpecification specifyMShape() {
            assertRelation("mShape");
            if (_mShape == null) {
                _mShape = new MShapeCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryMShape()
                                    , () -> _qyCall.qy().queryMShape())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _mShape.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMShape()
                      , () -> xsyncQyCall().qy().queryMShape()));
                }
            }
            return _mShape;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * M_SHAPE_GRP by my SHAPE_GRP_ID, named 'MShapeGrp'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MShapeGrpCB.HpSpecification specifyMShapeGrp() {
            assertRelation("mShapeGrp");
            if (_mShapeGrp == null) {
                _mShapeGrp = new MShapeGrpCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryMShapeGrp()
                                    , () -> _qyCall.qy().queryMShapeGrp())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _mShapeGrp.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMShapeGrp()
                      , () -> xsyncQyCall().qy().queryMShapeGrp()));
                }
            }
            return _mShapeGrp;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_CLASS_DTL by my CASE_PICK_FLG, named 'BClassDtlByCasePickFlg'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByCasePickFlg() {
            assertRelation("bClassDtlByCasePickFlg");
            if (_bClassDtlByCasePickFlg == null) {
                _bClassDtlByCasePickFlg = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByCasePickFlg()
                                    , () -> _qyCall.qy().queryBClassDtlByCasePickFlg())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByCasePickFlg.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByCasePickFlg()
                      , () -> xsyncQyCall().qy().queryBClassDtlByCasePickFlg()));
                }
            }
            return _bClassDtlByCasePickFlg;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_CLASS_DTL by my EM_REPLENISH_SHAPE_FLG, named 'BClassDtlByEmReplenishShapeFlg'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByEmReplenishShapeFlg() {
            assertRelation("bClassDtlByEmReplenishShapeFlg");
            if (_bClassDtlByEmReplenishShapeFlg == null) {
                _bClassDtlByEmReplenishShapeFlg = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByEmReplenishShapeFlg()
                                    , () -> _qyCall.qy().queryBClassDtlByEmReplenishShapeFlg())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByEmReplenishShapeFlg.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByEmReplenishShapeFlg()
                      , () -> xsyncQyCall().qy().queryBClassDtlByEmReplenishShapeFlg()));
                }
            }
            return _bClassDtlByEmReplenishShapeFlg;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_CLASS_DTL by my DEL_FLG, named 'BClassDtlByDelFlg'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByDelFlg() {
            assertRelation("bClassDtlByDelFlg");
            if (_bClassDtlByDelFlg == null) {
                _bClassDtlByDelFlg = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByDelFlg()
                                    , () -> _qyCall.qy().queryBClassDtlByDelFlg())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByDelFlg.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByDelFlg()
                      , () -> xsyncQyCall().qy().queryBClassDtlByDelFlg()));
                }
            }
            return _bClassDtlByDelFlg;
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from M_PRODUCT_SHAPE where ...) as FOO_MAX} <br>
         * M_PRODUCT_SHAPE by SHAPE_GRP_DTL_ID, named 'MProductShapeList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(shapeCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     shapeCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     shapeCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, MProductShape.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<MProductShapeCB, MShapeGrpDtlCQ> derivedMProductShapeList() {
            assertDerived("mProductShapeList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<MProductShapeCB> sq, MShapeGrpDtlCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveMProductShapeList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)MyselfDerived (SubQuery).
         * @return The object to set up a function for myself table. (NotNull)
         */
        public HpSDRFunction<MShapeGrpDtlCB, MShapeGrpDtlCQ> myselfDerived() {
            assertDerived("myselfDerived"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<MShapeGrpDtlCB> sq, MShapeGrpDtlCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsmyselfDerive(fn, sq, al, op), _dbmetaProvider);
        }
    }

    // ===================================================================================
    //                                                                        Dream Cruise
    //                                                                        ============
    /**
     * Welcome to the Dream Cruise for condition-bean deep world. <br>
     * This is very specialty so you can get the frontier spirit. Bon voyage!
     * @return The condition-bean for dream cruise, which is linked to main condition-bean.
     */
    public MShapeGrpDtlCB dreamCruiseCB() {
        MShapeGrpDtlCB cb = new MShapeGrpDtlCB();
        cb.xsetupForDreamCruise((MShapeGrpDtlCB) this);
        return cb;
    }

    protected ConditionBean xdoCreateDreamCruiseCB() {
        return dreamCruiseCB();
    }

    // [DBFlute-0.9.5.3]
    // ===================================================================================
    //                                                                        Column Query
    //                                                                        ============
    /**
     * Set up column-query. {column1 = column2}
     * <pre>
     * <span style="color: #3F7E5E">// where FOO &lt; BAR</span>
     * cb.<span style="color: #CC4747">columnQuery</span>(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFoo()</span>; <span style="color: #3F7E5E">// left column</span>
     * }).lessThan(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBar()</span>; <span style="color: #3F7E5E">// right column</span>
     * }); <span style="color: #3F7E5E">// you can calculate for right column like '}).plus(3);'</span>
     * </pre>
     * @param colCBLambda The callback for specify-query of left column. (NotNull)
     * @return The object for setting up operand and right column. (NotNull)
     */
    public HpColQyOperand<MShapeGrpDtlCB> columnQuery(final SpecifyQuery<MShapeGrpDtlCB> colCBLambda) {
        return xcreateColQyOperand((rightSp, operand) -> {
            return xcolqy(xcreateColumnQueryCB(), xcreateColumnQueryCB(), colCBLambda, rightSp, operand);
        });
    }

    protected MShapeGrpDtlCB xcreateColumnQueryCB() {
        MShapeGrpDtlCB cb = new MShapeGrpDtlCB();
        cb.xsetupForColumnQuery((MShapeGrpDtlCB)this);
        return cb;
    }

    // [DBFlute-0.9.6.3]
    // ===================================================================================
    //                                                                       OrScope Query
    //                                                                       =============
    /**
     * Set up the query for or-scope. <br>
     * (Same-column-and-same-condition-key conditions are allowed in or-scope)
     * <pre>
     * <span style="color: #3F7E5E">// where (FOO = '...' or BAR = '...')</span>
     * cb.<span style="color: #CC4747">orScopeQuery</span>(<span style="color: #553000">orCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">orCB</span>.query().setFoo...
     *     <span style="color: #553000">orCB</span>.query().setBar...
     * });
     * </pre>
     * @param orCBLambda The callback for query of or-condition. (NotNull)
     */
    public void orScopeQuery(OrQuery<MShapeGrpDtlCB> orCBLambda) {
        xorSQ((MShapeGrpDtlCB)this, orCBLambda);
    }

    @Override
    protected HpCBPurpose xhandleOrSQPurposeChange() {
        return null; // means no check
    }

    /**
     * Set up the and-part of or-scope. <br>
     * (However nested or-scope query and as-or-split of like-search in and-part are unsupported)
     * <pre>
     * <span style="color: #3F7E5E">// where (FOO = '...' or (BAR = '...' and QUX = '...'))</span>
     * cb.<span style="color: #994747">orScopeQuery</span>(<span style="color: #553000">orCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">orCB</span>.query().setFoo...
     *     <span style="color: #553000">orCB</span>.<span style="color: #CC4747">orScopeQueryAndPart</span>(<span style="color: #553000">andCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">andCB</span>.query().setBar...
     *         <span style="color: #553000">andCB</span>.query().setQux...
     *     });
     * });
     * </pre>
     * @param andCBLambda The callback for query of and-condition. (NotNull)
     */
    public void orScopeQueryAndPart(AndQuery<MShapeGrpDtlCB> andCBLambda) {
        xorSQAP((MShapeGrpDtlCB)this, andCBLambda);
    }

    /**
     * Check invalid query when query is set. <br>
     * (it throws an exception if set query is invalid) <br>
     * You should call this before registrations of where clause and other queries. <br>
     * Union and SubQuery and other sub condition-bean inherit this. <br>
     *
     * <p>renamed to checkNullOrEmptyQuery() since 1.1,
     * but not deprecated because it might have many use.</p>
     *
     * #java8 compatible option
     */
    public void checkInvalidQuery() {
        checkNullOrEmptyQuery();
    }

    /**
     * Accept (no check) an invalid query when a query is set. <br>
     * (no condition if a set query is invalid) <br>
     * You should call this before registrations of where clause and other queries. <br>
     * Union and SubQuery and other sub condition-bean inherit this.
     * @deprecated use ignoreNullOrEmptyQuery()
     */
    public void acceptInvalidQuery() {
        getSqlClause().ignoreNullOrEmptyQuery();
    }

    /**
     * Allow to auto-detect joins that can be inner-join. <br>
     * <pre>
     * o You should call this before registrations of where clause.
     * o Union and SubQuery and other sub condition-bean inherit this.
     * o You should confirm your SQL on the log to be tuned by inner-join correctly.
     * </pre>
     * @deprecated use enableInnerJoinAutoDetect()
     */
    public void allowInnerJoinAutoDetect() {
        enableInnerJoinAutoDetect();
    }

    /**
     * Suppress auto-detecting inner-join. <br>
     * You should call this before registrations of where clause.
     * @deprecated use disableInnerJoinAutoDetect()
     */
    public void suppressInnerJoinAutoDetect() {
        disableInnerJoinAutoDetect();
    }

    /**
     * Allow an empty string for query. <br>
     * (you can use an empty string as condition) <br>
     * You should call this before registrations of where clause and other queries. <br>
     * Union and SubQuery and other sub condition-bean inherit this.
     * @deprecated use enableEmptyStringQuery()
     */
    public void allowEmptyStringQuery() {
        doEnableEmptyStringQuery();
    }

    /**
     * Enable checking record count before QueryUpdate (contains QueryDelete). (default is disabled) <br>
     * No query update if zero count. (basically for MySQL's deadlock by next-key lock)
     * @deprecated use enableQueryUpdateCountPreCheck()
     */
    public void enableCheckCountBeforeQueryUpdate() {
        enableQueryUpdateCountPreCheck();
    }

    /**
     * Disable checking record count before QueryUpdate (contains QueryDelete). (back to default) <br>
     * Executes query update even if zero count. (normal specification)
     * @deprecated use disableQueryUpdateCountPreCheck()
     */
    public void disableCheckCountBeforeQueryUpdate() {
        disableQueryUpdateCountPreCheck();
    }

    /**
     * Allow "that's bad timing" check.
     * @deprecated use enableThatsBadTiming()
     */
    public void allowThatsBadTiming() {
        enableThatsBadTiming();
    }

    /**
     * Suppress "that's bad timing" check.
     * @deprecated use disableThatsBadTiming()
     */
    public void suppressThatsBadTiming() {
        disableThatsBadTiming();
    }

    // ===================================================================================
    //                                                                          DisplaySQL
    //                                                                          ==========
    @Override
    protected SqlAnalyzerFactory getSqlAnalyzerFactory()
    { return new ImplementedInvokerAssistant().assistSqlAnalyzerFactory(); }
    @Override
    protected String getConfiguredLogDatePattern() { return DBFluteConfig.getInstance().getLogDatePattern(); }
    @Override
    protected String getConfiguredLogTimestampPattern() { return DBFluteConfig.getInstance().getLogTimestampPattern(); }
    @Override
    protected String getConfiguredLogTimePattern() { return DBFluteConfig.getInstance().getLogTimePattern(); }
    @Override
    protected BoundDateDisplayTimeZoneProvider getConfiguredLogTimeZoneProvider() { return DBFluteConfig.getInstance().getLogTimeZoneProvider(); }

    // ===================================================================================
    //                                                                       Meta Handling
    //                                                                       =============
    public boolean hasUnionQueryOrUnionAllQuery() {
        return query().hasUnionQueryOrUnionAllQuery();
    }

    // ===================================================================================
    //                                                                        Purpose Type
    //                                                                        ============
    @Override
    protected void xprepareSyncQyCall(ConditionBean mainCB) {
        final MShapeGrpDtlCB cb;
        if (mainCB != null) {
            cb = (MShapeGrpDtlCB)mainCB;
        } else {
            cb = new MShapeGrpDtlCB();
        }
        specify().xsetSyncQyCall(xcreateSpQyCall(() -> true, () -> cb.query()));
    }

    // ===================================================================================
    //                                                                            Internal
    //                                                                            ========
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xgetConditionBeanClassNameInternally() { return MShapeGrpDtlCB.class.getName(); }
    protected String xgetConditionQueryClassNameInternally() { return MShapeGrpDtlCQ.class.getName(); }
    protected String xgetSubQueryClassNameInternally() { return SubQuery.class.getName(); }
    protected String xgetConditionOptionClassNameInternally() { return ConditionOption.class.getName(); }
}
