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
 * The base condition-bean of M_PRODUCT.
 * @author DBFlute(AutoGenerator)
 */
public class BsMProductCB extends AbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MProductCQ _conditionQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMProductCB() {
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
        return "M_PRODUCT";
    }

    // ===================================================================================
    //                                                                 PrimaryKey Handling
    //                                                                 ===================
    /**
     * Accept the query condition of primary key as equal.
     * @param productId : PK, ID, NotNull, bigint identity(19), FK to M_PRODUCT. (NotNull)
     * @return this. (NotNull)
     */
    public MProductCB acceptPK(Long productId) {
        assertObjectNotNull("productId", productId);
        BsMProductCB cb = this;
        cb.query().setProductId_Equal(productId);
        return (MProductCB)this;
    }

    /**
     * Accept the query condition of primary key as equal. (old style)
     * @param productId : PK, ID, NotNull, bigint identity(19), FK to M_PRODUCT. (NotNull)
     */
    public void acceptPrimaryKey(Long productId) {
        assertObjectNotNull("productId", productId);
        BsMProductCB cb = this;
        cb.query().setProductId_Equal(productId);
    }

    /**
     * Accept the query condition of unique key as equal.
     * @param clientId : UQ+, NotNull, bigint(19), FK to M_CLIENT. (NotNull)
     * @param productCd : +UQ, IX, NotNull, varchar(100). (NotNull)
     * @return this. (NotNull)
     */
    public MProductCB acceptUniqueOf(Long clientId, String productCd) {
        assertObjectNotNull("clientId", clientId);assertObjectNotNull("productCd", productCd);
        BsMProductCB cb = this;
        cb.query().setClientId_Equal(clientId);cb.query().setProductCd_Equal(productCd);
        return (MProductCB)this;
    }

    public ConditionBean addOrderBy_PK_Asc() {
        query().addOrderBy_ProductId_Asc();
        return this;
    }

    public ConditionBean addOrderBy_PK_Desc() {
        query().addOrderBy_ProductId_Desc();
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
    public MProductCQ query() {
        assertQueryPurpose(); // assert only when user-public query
        return doGetConditionQuery();
    }

    public MProductCQ xdfgetConditionQuery() { // public for parameter comment and internal
        return doGetConditionQuery();
    }

    protected MProductCQ doGetConditionQuery() {
        if (_conditionQuery == null) {
            _conditionQuery = createLocalCQ();
        }
        return _conditionQuery;
    }

    protected MProductCQ createLocalCQ() {
        return xcreateCQ(null, getSqlClause(), getSqlClause().getBasePointAliasName(), 0);
    }

    protected MProductCQ xcreateCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        MProductCQ cq = xnewCQ(childQuery, sqlClause, aliasName, nestLevel);
        cq.xsetBaseCB(this);
        return cq;
    }

    protected MProductCQ xnewCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        return new MProductCQ(childQuery, sqlClause, aliasName, nestLevel);
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
    public void union(UnionQuery<MProductCB> unionCBLambda) {
        final MProductCB cb = new MProductCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionCBLambda.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final MProductCQ cq = cb.query(); query().xsetUnionQuery(cq);
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
    public void unionAll(UnionQuery<MProductCB> unionCBLambda) {
        final MProductCB cb = new MProductCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionCBLambda.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final MProductCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
    }

    // ===================================================================================
    //                                                                         SetupSelect
    //                                                                         ===========
    protected MClientNss _nssMClient;
    public MClientNss xdfgetNssMClient() {
        if (_nssMClient == null) { _nssMClient = new MClientNss(null); }
        return _nssMClient;
    }
    /**
     * Set up relation columns to select clause. <br>
     * M_CLIENT by my CLIENT_ID, named 'MClient'.
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_MClient()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mProduct</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mProduct</span>.<span style="color: #CC4747">getMClient()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MClientNss setupSelect_MClient() {
        assertSetupSelectPurpose("mClient");
        if (hasSpecifiedLocalColumn()) {
            specify().columnClientId();
        }
        doSetupSelect(() -> query().queryMClient());
        if (_nssMClient == null || !_nssMClient.hasConditionQuery())
        { _nssMClient = new MClientNss(query().queryMClient()); }
        return _nssMClient;
    }

    protected MProductNss _nssMProductSelf;
    public MProductNss xdfgetNssMProductSelf() {
        if (_nssMProductSelf == null) { _nssMProductSelf = new MProductNss(null); }
        return _nssMProductSelf;
    }
    /**
     * Set up relation columns to select clause. <br>
     * M_PRODUCT by my PRODUCT_ID, named 'MProductSelf'.
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_MProductSelf()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mProduct</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mProduct</span>.<span style="color: #CC4747">getMProductSelf()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MProductNss setupSelect_MProductSelf() {
        assertSetupSelectPurpose("mProductSelf");
        doSetupSelect(() -> query().queryMProductSelf());
        if (_nssMProductSelf == null || !_nssMProductSelf.hasConditionQuery())
        { _nssMProductSelf = new MProductNss(query().queryMProductSelf()); }
        return _nssMProductSelf;
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
     * <span style="color: #0000C0">mProductBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_MShapeGrp()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mProduct</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mProduct</span>.<span style="color: #CC4747">getMShapeGrp()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
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

    protected BClassDtlNss _nssBClassDtlByDelFlg;
    public BClassDtlNss xdfgetNssBClassDtlByDelFlg() {
        if (_nssBClassDtlByDelFlg == null) { _nssBClassDtlByDelFlg = new BClassDtlNss(null); }
        return _nssBClassDtlByDelFlg;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my DEL_FLG, named 'BClassDtlByDelFlg'.
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByDelFlg()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mProduct</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mProduct</span>.<span style="color: #CC4747">getBClassDtlByDelFlg()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
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

    protected BClassDtlNss _nssBClassDtlByLimitDtManagFlg;
    public BClassDtlNss xdfgetNssBClassDtlByLimitDtManagFlg() {
        if (_nssBClassDtlByLimitDtManagFlg == null) { _nssBClassDtlByLimitDtManagFlg = new BClassDtlNss(null); }
        return _nssBClassDtlByLimitDtManagFlg;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my LIMIT_DT_MANAG_FLG, named 'BClassDtlByLimitDtManagFlg'.
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByLimitDtManagFlg()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mProduct</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mProduct</span>.<span style="color: #CC4747">getBClassDtlByLimitDtManagFlg()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByLimitDtManagFlg() {
        assertSetupSelectPurpose("bClassDtlByLimitDtManagFlg");
        if (hasSpecifiedLocalColumn()) {
            specify().columnLimitDtManagFlg();
        }
        doSetupSelect(() -> query().queryBClassDtlByLimitDtManagFlg());
        if (_nssBClassDtlByLimitDtManagFlg == null || !_nssBClassDtlByLimitDtManagFlg.hasConditionQuery())
        { _nssBClassDtlByLimitDtManagFlg = new BClassDtlNss(query().queryBClassDtlByLimitDtManagFlg()); }
        return _nssBClassDtlByLimitDtManagFlg;
    }

    protected BClassDtlNss _nssBClassDtlByLimitDtReverseFlg;
    public BClassDtlNss xdfgetNssBClassDtlByLimitDtReverseFlg() {
        if (_nssBClassDtlByLimitDtReverseFlg == null) { _nssBClassDtlByLimitDtReverseFlg = new BClassDtlNss(null); }
        return _nssBClassDtlByLimitDtReverseFlg;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my LIMIT_DT_REVERSE_FLG, named 'BClassDtlByLimitDtReverseFlg'.
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByLimitDtReverseFlg()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mProduct</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mProduct</span>.<span style="color: #CC4747">getBClassDtlByLimitDtReverseFlg()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByLimitDtReverseFlg() {
        assertSetupSelectPurpose("bClassDtlByLimitDtReverseFlg");
        if (hasSpecifiedLocalColumn()) {
            specify().columnLimitDtReverseFlg();
        }
        doSetupSelect(() -> query().queryBClassDtlByLimitDtReverseFlg());
        if (_nssBClassDtlByLimitDtReverseFlg == null || !_nssBClassDtlByLimitDtReverseFlg.hasConditionQuery())
        { _nssBClassDtlByLimitDtReverseFlg = new BClassDtlNss(query().queryBClassDtlByLimitDtReverseFlg()); }
        return _nssBClassDtlByLimitDtReverseFlg;
    }

    protected BClassDtlNss _nssBClassDtlByLotManagFlg;
    public BClassDtlNss xdfgetNssBClassDtlByLotManagFlg() {
        if (_nssBClassDtlByLotManagFlg == null) { _nssBClassDtlByLotManagFlg = new BClassDtlNss(null); }
        return _nssBClassDtlByLotManagFlg;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my LOT_MANAG_FLG, named 'BClassDtlByLotManagFlg'.
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByLotManagFlg()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mProduct</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mProduct</span>.<span style="color: #CC4747">getBClassDtlByLotManagFlg()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByLotManagFlg() {
        assertSetupSelectPurpose("bClassDtlByLotManagFlg");
        if (hasSpecifiedLocalColumn()) {
            specify().columnLotManagFlg();
        }
        doSetupSelect(() -> query().queryBClassDtlByLotManagFlg());
        if (_nssBClassDtlByLotManagFlg == null || !_nssBClassDtlByLotManagFlg.hasConditionQuery())
        { _nssBClassDtlByLotManagFlg = new BClassDtlNss(query().queryBClassDtlByLotManagFlg()); }
        return _nssBClassDtlByLotManagFlg;
    }

    protected BClassDtlNss _nssBClassDtlByLotReverseFlg;
    public BClassDtlNss xdfgetNssBClassDtlByLotReverseFlg() {
        if (_nssBClassDtlByLotReverseFlg == null) { _nssBClassDtlByLotReverseFlg = new BClassDtlNss(null); }
        return _nssBClassDtlByLotReverseFlg;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my LOT_REVERSE_FLG, named 'BClassDtlByLotReverseFlg'.
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByLotReverseFlg()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mProduct</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mProduct</span>.<span style="color: #CC4747">getBClassDtlByLotReverseFlg()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByLotReverseFlg() {
        assertSetupSelectPurpose("bClassDtlByLotReverseFlg");
        if (hasSpecifiedLocalColumn()) {
            specify().columnLotReverseFlg();
        }
        doSetupSelect(() -> query().queryBClassDtlByLotReverseFlg());
        if (_nssBClassDtlByLotReverseFlg == null || !_nssBClassDtlByLotReverseFlg.hasConditionQuery())
        { _nssBClassDtlByLotReverseFlg = new BClassDtlNss(query().queryBClassDtlByLotReverseFlg()); }
        return _nssBClassDtlByLotReverseFlg;
    }

    protected BClassDtlNss _nssBClassDtlByMergeCls;
    public BClassDtlNss xdfgetNssBClassDtlByMergeCls() {
        if (_nssBClassDtlByMergeCls == null) { _nssBClassDtlByMergeCls = new BClassDtlNss(null); }
        return _nssBClassDtlByMergeCls;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my MERGE_CLS, named 'BClassDtlByMergeCls'.
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByMergeCls()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mProduct</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mProduct</span>.<span style="color: #CC4747">getBClassDtlByMergeCls()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByMergeCls() {
        assertSetupSelectPurpose("bClassDtlByMergeCls");
        if (hasSpecifiedLocalColumn()) {
            specify().columnMergeCls();
        }
        doSetupSelect(() -> query().queryBClassDtlByMergeCls());
        if (_nssBClassDtlByMergeCls == null || !_nssBClassDtlByMergeCls.hasConditionQuery())
        { _nssBClassDtlByMergeCls = new BClassDtlNss(query().queryBClassDtlByMergeCls()); }
        return _nssBClassDtlByMergeCls;
    }

    protected BClassDtlNss _nssBClassDtlByShippingStopFlg;
    public BClassDtlNss xdfgetNssBClassDtlByShippingStopFlg() {
        if (_nssBClassDtlByShippingStopFlg == null) { _nssBClassDtlByShippingStopFlg = new BClassDtlNss(null); }
        return _nssBClassDtlByShippingStopFlg;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my SHIPPING_STOP_FLG, named 'BClassDtlByShippingStopFlg'.
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByShippingStopFlg()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mProduct</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mProduct</span>.<span style="color: #CC4747">getBClassDtlByShippingStopFlg()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByShippingStopFlg() {
        assertSetupSelectPurpose("bClassDtlByShippingStopFlg");
        if (hasSpecifiedLocalColumn()) {
            specify().columnShippingStopFlg();
        }
        doSetupSelect(() -> query().queryBClassDtlByShippingStopFlg());
        if (_nssBClassDtlByShippingStopFlg == null || !_nssBClassDtlByShippingStopFlg.hasConditionQuery())
        { _nssBClassDtlByShippingStopFlg = new BClassDtlNss(query().queryBClassDtlByShippingStopFlg()); }
        return _nssBClassDtlByShippingStopFlg;
    }

    protected BClassDtlNss _nssBClassDtlByFreightCls;
    public BClassDtlNss xdfgetNssBClassDtlByFreightCls() {
        if (_nssBClassDtlByFreightCls == null) { _nssBClassDtlByFreightCls = new BClassDtlNss(null); }
        return _nssBClassDtlByFreightCls;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my FREIGHT_CLS, named 'BClassDtlByFreightCls'.
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByFreightCls()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mProduct</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mProduct</span>.<span style="color: #CC4747">getBClassDtlByFreightCls()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByFreightCls() {
        assertSetupSelectPurpose("bClassDtlByFreightCls");
        if (hasSpecifiedLocalColumn()) {
            specify().columnFreightCls();
        }
        doSetupSelect(() -> query().queryBClassDtlByFreightCls());
        if (_nssBClassDtlByFreightCls == null || !_nssBClassDtlByFreightCls.hasConditionQuery())
        { _nssBClassDtlByFreightCls = new BClassDtlNss(query().queryBClassDtlByFreightCls()); }
        return _nssBClassDtlByFreightCls;
    }

    protected MProductNss _nssMProductSelfAsOne;
    public MProductNss xdfgetNssMProductSelfAsOne() {
        if (_nssMProductSelfAsOne == null) { _nssMProductSelfAsOne = new MProductNss(null); }
        return _nssMProductSelfAsOne;
    }
    /**
     * Set up relation columns to select clause. <br>
     * M_PRODUCT by PRODUCT_ID, named 'MProductSelfAsOne'.
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_MProductSelfAsOne()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mProduct</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mProduct</span>.<span style="color: #CC4747">getMProductSelfAsOne()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MProductNss setupSelect_MProductSelfAsOne() {
        assertSetupSelectPurpose("mProductSelfAsOne");
        doSetupSelect(() -> query().queryMProductSelfAsOne());
        if (_nssMProductSelfAsOne == null || !_nssMProductSelfAsOne.hasConditionQuery())
        { _nssMProductSelfAsOne = new MProductNss(query().queryMProductSelfAsOne()); }
        return _nssMProductSelfAsOne;
    }

    protected MProductTermNss _nssMProductTermAsOne;
    public MProductTermNss xdfgetNssMProductTermAsOne() {
        if (_nssMProductTermAsOne == null) { _nssMProductTermAsOne = new MProductTermNss(null); }
        return _nssMProductTermAsOne;
    }
    /**
     * Set up relation columns to select clause. <br>
     * M_PRODUCT_TERM by PRODUCT_ID, named 'MProductTermAsOne'.
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_MProductTermAsOne()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mProduct</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mProduct</span>.<span style="color: #CC4747">getMProductTermAsOne()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MProductTermNss setupSelect_MProductTermAsOne() {
        assertSetupSelectPurpose("mProductTermAsOne");
        doSetupSelect(() -> query().queryMProductTermAsOne());
        if (_nssMProductTermAsOne == null || !_nssMProductTermAsOne.hasConditionQuery())
        { _nssMProductTermAsOne = new MProductTermNss(query().queryMProductTermAsOne()); }
        return _nssMProductTermAsOne;
    }

    protected MSetParentNss _nssMSetParentAsOne;
    public MSetParentNss xdfgetNssMSetParentAsOne() {
        if (_nssMSetParentAsOne == null) { _nssMSetParentAsOne = new MSetParentNss(null); }
        return _nssMSetParentAsOne;
    }
    /**
     * Set up relation columns to select clause. <br>
     * M_SET_PARENT by PRODUCT_ID, named 'MSetParentAsOne'.
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_MSetParentAsOne()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mProduct</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mProduct</span>.<span style="color: #CC4747">getMSetParentAsOne()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MSetParentNss setupSelect_MSetParentAsOne() {
        assertSetupSelectPurpose("mSetParentAsOne");
        doSetupSelect(() -> query().queryMSetParentAsOne());
        if (_nssMSetParentAsOne == null || !_nssMSetParentAsOne.hasConditionQuery())
        { _nssMSetParentAsOne = new MSetParentNss(query().queryMSetParentAsOne()); }
        return _nssMSetParentAsOne;
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

    public static class HpSpecification extends HpAbstractSpecification<MProductCQ> {
        protected MClientCB.HpSpecification _mClient;
        protected MProductCB.HpSpecification _mProductSelf;
        protected MShapeGrpCB.HpSpecification _mShapeGrp;
        protected BClassDtlCB.HpSpecification _bClassDtlByDelFlg;
        protected BClassDtlCB.HpSpecification _bClassDtlByLimitDtManagFlg;
        protected BClassDtlCB.HpSpecification _bClassDtlByLimitDtReverseFlg;
        protected BClassDtlCB.HpSpecification _bClassDtlByLotManagFlg;
        protected BClassDtlCB.HpSpecification _bClassDtlByLotReverseFlg;
        protected BClassDtlCB.HpSpecification _bClassDtlByMergeCls;
        protected BClassDtlCB.HpSpecification _bClassDtlByShippingStopFlg;
        protected BClassDtlCB.HpSpecification _bClassDtlByFreightCls;
        protected MProductCB.HpSpecification _mProductSelfAsOne;
        protected MProductTermCB.HpSpecification _mProductTermAsOne;
        protected MSetParentCB.HpSpecification _mSetParentAsOne;
        public HpSpecification(ConditionBean baseCB, HpSpQyCall<MProductCQ> qyCall
                             , HpCBPurpose purpose, DBMetaProvider dbmetaProvider
                             , HpSDRFunctionFactory sdrFuncFactory)
        { super(baseCB, qyCall, purpose, dbmetaProvider, sdrFuncFactory); }
        /**
         * PRODUCT_ID: {PK, ID, NotNull, bigint identity(19), FK to M_PRODUCT}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnProductId() { return doColumn("PRODUCT_ID"); }
        /**
         * CLIENT_ID: {UQ+, NotNull, bigint(19), FK to M_CLIENT}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnClientId() { return doColumn("CLIENT_ID"); }
        /**
         * PRODUCT_CD: {+UQ, IX, NotNull, varchar(100)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnProductCd() { return doColumn("PRODUCT_CD"); }
        /**
         * PRODUCT_NM: {NotNull, varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnProductNm() { return doColumn("PRODUCT_NM"); }
        /**
         * PRODUCT_ABBR: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnProductAbbr() { return doColumn("PRODUCT_ABBR"); }
        /**
         * JAN_CD: {IX, varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnJanCd() { return doColumn("JAN_CD"); }
        /**
         * LOT_MANAG_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=LotManagFlg}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnLotManagFlg() { return doColumn("LOT_MANAG_FLG"); }
        /**
         * LIMIT_DT_MANAG_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=LimitDtManagFlg}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnLimitDtManagFlg() { return doColumn("LIMIT_DT_MANAG_FLG"); }
        /**
         * RECEIVE_LIMIT_NUM: {bigint(19), default=[(0)]}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnReceiveLimitNum() { return doColumn("RECEIVE_LIMIT_NUM"); }
        /**
         * SHIPPING_LIMIT_NUM: {bigint(19), default=[(0)]}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnShippingLimitNum() { return doColumn("SHIPPING_LIMIT_NUM"); }
        /**
         * MERGE_CLS: {NotNull, varchar(30), default=[02], FK to B_CLASS_DTL, classification=MergeCls}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnMergeCls() { return doColumn("MERGE_CLS"); }
        /**
         * LOT_REVERSE_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=LotReverseFlg}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnLotReverseFlg() { return doColumn("LOT_REVERSE_FLG"); }
        /**
         * LIMIT_DT_REVERSE_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=LimitDtReverseFlg}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnLimitDtReverseFlg() { return doColumn("LIMIT_DT_REVERSE_FLG"); }
        /**
         * SHIPPING_STOP_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=ShippingStopFlg}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnShippingStopFlg() { return doColumn("SHIPPING_STOP_FLG"); }
        /**
         * FIXED_POINT: {decimal(16, 6)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnFixedPoint() { return doColumn("FIXED_POINT"); }
        /**
         * SHAPE_GRP_ID: {bigint(19), FK to M_SHAPE_GRP}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnShapeGrpId() { return doColumn("SHAPE_GRP_ID"); }
        /**
         * NMFC_CODE: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnNmfcCode() { return doColumn("NMFC_CODE"); }
        /**
         * FREIGHT_CLS: {varchar(30), FK to B_CLASS_DTL, classification=FreightCls}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnFreightCls() { return doColumn("FREIGHT_CLS"); }
        /**
         * COUNNTRY_OF_ORIGIN: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCounntryOfOrigin() { return doColumn("COUNNTRY_OF_ORIGIN"); }
        /**
         * UNIT_VAL: {decimal(16, 6)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnUnitVal() { return doColumn("UNIT_VAL"); }
        /**
         * HTS_CD: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnHtsCd() { return doColumn("HTS_CD"); }
        /**
         * ITEMGROUP: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnItemgroup() { return doColumn("ITEMGROUP"); }
        /**
         * ACTFLG: {NotNull, decimal(16, 6), default=[(1)]}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnActflg() { return doColumn("ACTFLG"); }
        /**
         * INVTYPE: {NotNull, varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnInvtype() { return doColumn("INVTYPE"); }
        /**
         * SETITEMFLG: {NotNull, decimal(16, 6), default=[(0)]}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSetitemflg() { return doColumn("SETITEMFLG"); }
        /**
         * OWNERITEMCD: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnOwneritemcd() { return doColumn("OWNERITEMCD"); }
        /**
         * SUPPLIERITEMCD: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSupplieritemcd() { return doColumn("SUPPLIERITEMCD"); }
        /**
         * POSITEMCD: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnPositemcd() { return doColumn("POSITEMCD"); }
        /**
         * ITFCD: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnItfcd() { return doColumn("ITFCD"); }
        /**
         * MANUITEMCD: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnManuitemcd() { return doColumn("MANUITEMCD"); }
        /**
         * PRICE_BUY: {NotNull, bigint(19), default=[(0)]}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnPriceBuy() { return doColumn("PRICE_BUY"); }
        /**
         * PRICE_WHOLESALE: {NotNull, bigint(19), default=[(0)]}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnPriceWholesale() { return doColumn("PRICE_WHOLESALE"); }
        /**
         * PRICE_SALE: {NotNull, bigint(19), default=[(0)]}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnPriceSale() { return doColumn("PRICE_SALE"); }
        /**
         * ALLOCPOLICYKEY: {decimal(16, 6)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnAllocpolicykey() { return doColumn("ALLOCPOLICYKEY"); }
        /**
         * SLOTPOLICYKEY: {decimal(16, 6)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSlotpolicykey() { return doColumn("SLOTPOLICYKEY"); }
        /**
         * INWORKINGKEY: {decimal(16, 6)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnInworkingkey() { return doColumn("INWORKINGKEY"); }
        /**
         * OUTWORKINGKEY: {decimal(16, 6)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnOutworkingkey() { return doColumn("OUTWORKINGKEY"); }
        /**
         * ABCTYPE: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnAbctype() { return doColumn("ABCTYPE"); }
        /**
         * QTY1TYPE: {NotNull, decimal(16, 6), default=[(0)]}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnQty1type() { return doColumn("QTY1TYPE"); }
        /**
         * UNIT1: {NotNull, decimal(16, 6), default=[(0)]}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnUnit1() { return doColumn("UNIT1"); }
        /**
         * UNIT1STYLE: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnUnit1style() { return doColumn("UNIT1STYLE"); }
        /**
         * LENGTH1: {NotNull, bigint(19), default=[(0)]}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnLength1() { return doColumn("LENGTH1"); }
        /**
         * WIDTH1: {NotNull, bigint(19), default=[(0)]}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnWidth1() { return doColumn("WIDTH1"); }
        /**
         * HEIGHT1: {NotNull, bigint(19), default=[(0)]}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnHeight1() { return doColumn("HEIGHT1"); }
        /**
         * GROSSWEIGHT1: {NotNull, bigint(19), default=[(0)]}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnGrossweight1() { return doColumn("GROSSWEIGHT1"); }
        /**
         * NETWEIGHT1: {NotNull, bigint(19), default=[(0)]}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnNetweight1() { return doColumn("NETWEIGHT1"); }
        /**
         * CUBE1: {NotNull, bigint(19), default=[(0)]}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCube1() { return doColumn("CUBE1"); }
        /**
         * LITER1: {NotNull, bigint(19), default=[(0)]}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnLiter1() { return doColumn("LITER1"); }
        /**
         * UNIT2: {NotNull, decimal(16, 6), default=[(0)]}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnUnit2() { return doColumn("UNIT2"); }
        /**
         * UNIT2STYLE: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnUnit2style() { return doColumn("UNIT2STYLE"); }
        /**
         * LENGTH2: {NotNull, bigint(19), default=[(0)]}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnLength2() { return doColumn("LENGTH2"); }
        /**
         * WIDTH2: {NotNull, bigint(19), default=[(0)]}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnWidth2() { return doColumn("WIDTH2"); }
        /**
         * HEIGHT2: {NotNull, bigint(19), default=[(0)]}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnHeight2() { return doColumn("HEIGHT2"); }
        /**
         * GROSSWEIGHT2: {NotNull, bigint(19), default=[(0)]}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnGrossweight2() { return doColumn("GROSSWEIGHT2"); }
        /**
         * NETWEIGHT2: {NotNull, bigint(19), default=[(0)]}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnNetweight2() { return doColumn("NETWEIGHT2"); }
        /**
         * CUBE2: {NotNull, bigint(19), default=[(0)]}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCube2() { return doColumn("CUBE2"); }
        /**
         * LITER2: {NotNull, bigint(19), default=[(0)]}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnLiter2() { return doColumn("LITER2"); }
        /**
         * UNIT3: {NotNull, decimal(16, 6), default=[(0)]}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnUnit3() { return doColumn("UNIT3"); }
        /**
         * UNIT3STYLE: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnUnit3style() { return doColumn("UNIT3STYLE"); }
        /**
         * LENGTH3: {NotNull, bigint(19), default=[(0)]}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnLength3() { return doColumn("LENGTH3"); }
        /**
         * WIDTH3: {NotNull, bigint(19), default=[(0)]}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnWidth3() { return doColumn("WIDTH3"); }
        /**
         * HEIGHT3: {NotNull, bigint(19), default=[(0)]}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnHeight3() { return doColumn("HEIGHT3"); }
        /**
         * GROSSWEIGHT3: {NotNull, bigint(19), default=[(0)]}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnGrossweight3() { return doColumn("GROSSWEIGHT3"); }
        /**
         * NETWEIGHT3: {NotNull, bigint(19), default=[(0)]}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnNetweight3() { return doColumn("NETWEIGHT3"); }
        /**
         * CUBE3: {NotNull, bigint(19), default=[(0)]}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCube3() { return doColumn("CUBE3"); }
        /**
         * LITER3: {NotNull, bigint(19), default=[(0)]}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnLiter3() { return doColumn("LITER3"); }
        /**
         * P_QTY: {decimal(16, 6), default=[(0)]}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnPQty() { return doColumn("P_QTY"); }
        /**
         * P_HEIGHT: {decimal(16, 6), default=[(0)]}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnPHeight() { return doColumn("P_HEIGHT"); }
        /**
         * P_ODD: {decimal(16, 6), default=[(0)]}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnPOdd() { return doColumn("P_ODD"); }
        /**
         * P_DESCRIPTION: {varchar(4000)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnPDescription() { return doColumn("P_DESCRIPTION"); }
        /**
         * NOTES: {varchar(4000)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnNotes() { return doColumn("NOTES"); }
        /**
         * QTY2USEDFLG: {NotNull, decimal(16, 6), default=[(0)]}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnQty2usedflg() { return doColumn("QTY2USEDFLG"); }
        /**
         * QTY2STYLE: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnQty2style() { return doColumn("QTY2STYLE"); }
        /**
         * QTY3USEDFLG: {NotNull, decimal(16, 6), default=[(0)]}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnQty3usedflg() { return doColumn("QTY3USEDFLG"); }
        /**
         * QTY3STYLE: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnQty3style() { return doColumn("QTY3STYLE"); }
        /**
         * SP_CALCFLG: {NotNull, decimal(16, 6), default=[(0)]}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSpCalcflg() { return doColumn("SP_CALCFLG"); }
        /**
         * SP_LOTATRB1USEDFLG: {NotNull, decimal(16, 6), default=[(0)]}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSpLotatrb1usedflg() { return doColumn("SP_LOTATRB1USEDFLG"); }
        /**
         * SP_OPERATOR1: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSpOperator1() { return doColumn("SP_OPERATOR1"); }
        /**
         * SP_LOTATRB2USEDFLG: {NotNull, decimal(16, 6), default=[(0)]}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSpLotatrb2usedflg() { return doColumn("SP_LOTATRB2USEDFLG"); }
        /**
         * SP_OPERATOR2: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSpOperator2() { return doColumn("SP_OPERATOR2"); }
        /**
         * SP_LOTATRB3USEDFLG: {NotNull, decimal(16, 6), default=[(0)]}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSpLotatrb3usedflg() { return doColumn("SP_LOTATRB3USEDFLG"); }
        /**
         * SP_OPERATOR3: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSpOperator3() { return doColumn("SP_OPERATOR3"); }
        /**
         * SP_RATE: {NotNull, bigint(19), default=[(0)]}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSpRate() { return doColumn("SP_RATE"); }
        /**
         * LOTATRB1TITLE: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnLotatrb1title() { return doColumn("LOTATRB1TITLE"); }
        /**
         * LOTATRB2TITLE: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnLotatrb2title() { return doColumn("LOTATRB2TITLE"); }
        /**
         * LOTATRB3TITLE: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnLotatrb3title() { return doColumn("LOTATRB3TITLE"); }
        /**
         * LOTATRB4TITLE: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnLotatrb4title() { return doColumn("LOTATRB4TITLE"); }
        /**
         * LOTATRB5TITLE: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnLotatrb5title() { return doColumn("LOTATRB5TITLE"); }
        /**
         * LOTATRB6TITLE: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnLotatrb6title() { return doColumn("LOTATRB6TITLE"); }
        /**
         * LOTATRB7TITLE: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnLotatrb7title() { return doColumn("LOTATRB7TITLE"); }
        /**
         * LOTATRB8TITLE: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnLotatrb8title() { return doColumn("LOTATRB8TITLE"); }
        /**
         * LOTATRB9TITLE: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnLotatrb9title() { return doColumn("LOTATRB9TITLE"); }
        /**
         * LOTATRB10TITLE: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnLotatrb10title() { return doColumn("LOTATRB10TITLE"); }
        /**
         * F_USER1: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnFUser1() { return doColumn("F_USER1"); }
        /**
         * F_USER2: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnFUser2() { return doColumn("F_USER2"); }
        /**
         * F_USER3: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnFUser3() { return doColumn("F_USER3"); }
        /**
         * F_USER4: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnFUser4() { return doColumn("F_USER4"); }
        /**
         * F_USER5: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnFUser5() { return doColumn("F_USER5"); }
        /**
         * ITEM40: {decimal(16, 6), default=[(0)]}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnItem40() { return doColumn("ITEM40"); }
        /**
         * PRICE_INSURANCE: {NotNull, bigint(19), default=[(0)]}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnPriceInsurance() { return doColumn("PRICE_INSURANCE"); }
        /**
         * LIMITDAY: {NotNull, decimal(16, 6), default=[(0)]}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnLimitday() { return doColumn("LIMITDAY"); }
        /**
         * DELIVERABLEDAY: {NotNull, bigint(19), default=[(0)]}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDeliverableday() { return doColumn("DELIVERABLEDAY"); }
        /**
         * PRINTDATEFLG: {NotNull, decimal(16, 6), default=[(0)]}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnPrintdateflg() { return doColumn("PRINTDATEFLG"); }
        /**
         * SUPPLIERCD: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSuppliercd() { return doColumn("SUPPLIERCD"); }
        /**
         * DISPATCHQTYTYPE: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDispatchqtytype() { return doColumn("DISPATCHQTYTYPE"); }
        /**
         * TARIFFQTYTYPE: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnTariffqtytype() { return doColumn("TARIFFQTYTYPE"); }
        /**
         * USERUSE1: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnUseruse1() { return doColumn("USERUSE1"); }
        /**
         * USERUSE2: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnUseruse2() { return doColumn("USERUSE2"); }
        /**
         * USERUSE3: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnUseruse3() { return doColumn("USERUSE3"); }
        /**
         * USERUSE4: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnUseruse4() { return doColumn("USERUSE4"); }
        /**
         * USERUSE5: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnUseruse5() { return doColumn("USERUSE5"); }
        /**
         * LOT1NULLFLG: {NotNull, decimal(16, 6), default=[(0)]}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnLot1nullflg() { return doColumn("LOT1NULLFLG"); }
        /**
         * LOT2NULLFLG: {NotNull, decimal(16, 6), default=[(0)]}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnLot2nullflg() { return doColumn("LOT2NULLFLG"); }
        /**
         * LOT3NULLFLG: {NotNull, decimal(16, 6), default=[(0)]}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnLot3nullflg() { return doColumn("LOT3NULLFLG"); }
        /**
         * LOT4NULLFLG: {NotNull, decimal(16, 6), default=[(0)]}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnLot4nullflg() { return doColumn("LOT4NULLFLG"); }
        /**
         * LOT5NULLFLG: {NotNull, decimal(16, 6), default=[(0)]}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnLot5nullflg() { return doColumn("LOT5NULLFLG"); }
        /**
         * OTHERLOT1NULLFLG: {NotNull, decimal(16, 6), default=[(0)]}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnOtherlot1nullflg() { return doColumn("OTHERLOT1NULLFLG"); }
        /**
         * OTHERLOT2NULLFLG: {NotNull, decimal(16, 6), default=[(0)]}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnOtherlot2nullflg() { return doColumn("OTHERLOT2NULLFLG"); }
        /**
         * OTHERLOT3NULLFLG: {NotNull, decimal(16, 6), default=[(0)]}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnOtherlot3nullflg() { return doColumn("OTHERLOT3NULLFLG"); }
        /**
         * OTHERLOT4NULLFLG: {NotNull, decimal(16, 6), default=[(0)]}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnOtherlot4nullflg() { return doColumn("OTHERLOT4NULLFLG"); }
        /**
         * OTHERLOT5NULLFLG: {NotNull, decimal(16, 6), default=[(0)]}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnOtherlot5nullflg() { return doColumn("OTHERLOT5NULLFLG"); }
        /**
         * ITEMPRINTNAME: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnItemprintname() { return doColumn("ITEMPRINTNAME"); }
        /**
         * PRICELEVEL: {NotNull, decimal(16, 6), default=[(0)]}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnPricelevel() { return doColumn("PRICELEVEL"); }
        /**
         * ITEMCATALOGURL: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnItemcatalogurl() { return doColumn("ITEMCATALOGURL"); }
        /**
         * USERNUM1: {bigint(19), default=[(0)]}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnUsernum1() { return doColumn("USERNUM1"); }
        /**
         * USERNUM2: {bigint(19), default=[(0)]}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnUsernum2() { return doColumn("USERNUM2"); }
        /**
         * USERNUM3: {bigint(19), default=[(0)]}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnUsernum3() { return doColumn("USERNUM3"); }
        /**
         * USERNUM4: {bigint(19), default=[(0)]}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnUsernum4() { return doColumn("USERNUM4"); }
        /**
         * USERNUM5: {bigint(19), default=[(0)]}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnUsernum5() { return doColumn("USERNUM5"); }
        /**
         * USERDATE1: {varchar(8)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnUserdate1() { return doColumn("USERDATE1"); }
        /**
         * USERDATE2: {varchar(8)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnUserdate2() { return doColumn("USERDATE2"); }
        /**
         * USERDATE3: {varchar(8)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnUserdate3() { return doColumn("USERDATE3"); }
        /**
         * USERDATE4: {varchar(8)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnUserdate4() { return doColumn("USERDATE4"); }
        /**
         * USERDATE5: {varchar(8)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnUserdate5() { return doColumn("USERDATE5"); }
        /**
         * CGGDID: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCggdid() { return doColumn("CGGDID"); }
        /**
         * BRCTG: {NotNull, bigint(19), default=[(0)]}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnBrctg() { return doColumn("BRCTG"); }
        /**
         * CTWEIGHT: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCtweight() { return doColumn("CTWEIGHT"); }
        /**
         * BXOSZL: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnBxoszl() { return doColumn("BXOSZL"); }
        /**
         * BXOSZW: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnBxoszw() { return doColumn("BXOSZW"); }
        /**
         * BXOSZH: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnBxoszh() { return doColumn("BXOSZH"); }
        /**
         * BXCPY: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnBxcpy() { return doColumn("BXCPY"); }
        /**
         * BXWEIGHT: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnBxweight() { return doColumn("BXWEIGHT"); }
        /**
         * ITEM_ADMIN: {NotNull, varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnItemAdmin() { return doColumn("ITEM_ADMIN"); }
        /**
         * SNAME: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSname() { return doColumn("SNAME"); }
        /**
         * FractionPieceWeight: {decimal(16, 6)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnFractionpieceweight() { return doColumn("FractionPieceWeight"); }
        /**
         * TaxEquivalentNumber: {decimal(16, 6)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnTaxequivalentnumber() { return doColumn("TaxEquivalentNumber"); }
        /**
         * SYHNKBNJT: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSyhnkbnjt() { return doColumn("SYHNKBNJT"); }
        /**
         * IOID_CLS: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnIoidCls() { return doColumn("IOID_CLS"); }
        /**
         * ITFCD_CLS: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnItfcdCls() { return doColumn("ITFCD_CLS"); }
        /**
         * MANUITEMCD_CLS: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnManuitemcdCls() { return doColumn("MANUITEMCD_CLS"); }
        /**
         * CTCPY: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCtcpy() { return doColumn("CTCPY"); }
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
            columnProductId(); // PK
            if (qyCall().qy().hasConditionQueryMClient()
                    || qyCall().qy().xgetReferrerQuery() instanceof MClientCQ) {
                columnClientId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryMShapeGrp()
                    || qyCall().qy().xgetReferrerQuery() instanceof MShapeGrpCQ) {
                columnShapeGrpId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByDelFlg()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnDelFlg(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByLimitDtManagFlg()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnLimitDtManagFlg(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByLimitDtReverseFlg()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnLimitDtReverseFlg(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByLotManagFlg()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnLotManagFlg(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByLotReverseFlg()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnLotReverseFlg(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByMergeCls()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnMergeCls(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByShippingStopFlg()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnShippingStopFlg(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByFreightCls()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnFreightCls(); // FK or one-to-one referrer
            }
        }
        @Override
        protected String getTableDbName() { return "M_PRODUCT"; }
        /**
         * Prepare to specify functions about relation table. <br>
         * M_CLIENT by my CLIENT_ID, named 'MClient'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MClientCB.HpSpecification specifyMClient() {
            assertRelation("mClient");
            if (_mClient == null) {
                _mClient = new MClientCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryMClient()
                                    , () -> _qyCall.qy().queryMClient())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _mClient.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMClient()
                      , () -> xsyncQyCall().qy().queryMClient()));
                }
            }
            return _mClient;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * M_PRODUCT by my PRODUCT_ID, named 'MProductSelf'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MProductCB.HpSpecification specifyMProductSelf() {
            assertRelation("mProductSelf");
            if (_mProductSelf == null) {
                _mProductSelf = new MProductCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryMProductSelf()
                                    , () -> _qyCall.qy().queryMProductSelf())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _mProductSelf.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMProductSelf()
                      , () -> xsyncQyCall().qy().queryMProductSelf()));
                }
            }
            return _mProductSelf;
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
         * Prepare to specify functions about relation table. <br>
         * B_CLASS_DTL by my LIMIT_DT_MANAG_FLG, named 'BClassDtlByLimitDtManagFlg'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByLimitDtManagFlg() {
            assertRelation("bClassDtlByLimitDtManagFlg");
            if (_bClassDtlByLimitDtManagFlg == null) {
                _bClassDtlByLimitDtManagFlg = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByLimitDtManagFlg()
                                    , () -> _qyCall.qy().queryBClassDtlByLimitDtManagFlg())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByLimitDtManagFlg.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByLimitDtManagFlg()
                      , () -> xsyncQyCall().qy().queryBClassDtlByLimitDtManagFlg()));
                }
            }
            return _bClassDtlByLimitDtManagFlg;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_CLASS_DTL by my LIMIT_DT_REVERSE_FLG, named 'BClassDtlByLimitDtReverseFlg'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByLimitDtReverseFlg() {
            assertRelation("bClassDtlByLimitDtReverseFlg");
            if (_bClassDtlByLimitDtReverseFlg == null) {
                _bClassDtlByLimitDtReverseFlg = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByLimitDtReverseFlg()
                                    , () -> _qyCall.qy().queryBClassDtlByLimitDtReverseFlg())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByLimitDtReverseFlg.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByLimitDtReverseFlg()
                      , () -> xsyncQyCall().qy().queryBClassDtlByLimitDtReverseFlg()));
                }
            }
            return _bClassDtlByLimitDtReverseFlg;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_CLASS_DTL by my LOT_MANAG_FLG, named 'BClassDtlByLotManagFlg'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByLotManagFlg() {
            assertRelation("bClassDtlByLotManagFlg");
            if (_bClassDtlByLotManagFlg == null) {
                _bClassDtlByLotManagFlg = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByLotManagFlg()
                                    , () -> _qyCall.qy().queryBClassDtlByLotManagFlg())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByLotManagFlg.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByLotManagFlg()
                      , () -> xsyncQyCall().qy().queryBClassDtlByLotManagFlg()));
                }
            }
            return _bClassDtlByLotManagFlg;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_CLASS_DTL by my LOT_REVERSE_FLG, named 'BClassDtlByLotReverseFlg'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByLotReverseFlg() {
            assertRelation("bClassDtlByLotReverseFlg");
            if (_bClassDtlByLotReverseFlg == null) {
                _bClassDtlByLotReverseFlg = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByLotReverseFlg()
                                    , () -> _qyCall.qy().queryBClassDtlByLotReverseFlg())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByLotReverseFlg.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByLotReverseFlg()
                      , () -> xsyncQyCall().qy().queryBClassDtlByLotReverseFlg()));
                }
            }
            return _bClassDtlByLotReverseFlg;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_CLASS_DTL by my MERGE_CLS, named 'BClassDtlByMergeCls'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByMergeCls() {
            assertRelation("bClassDtlByMergeCls");
            if (_bClassDtlByMergeCls == null) {
                _bClassDtlByMergeCls = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByMergeCls()
                                    , () -> _qyCall.qy().queryBClassDtlByMergeCls())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByMergeCls.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByMergeCls()
                      , () -> xsyncQyCall().qy().queryBClassDtlByMergeCls()));
                }
            }
            return _bClassDtlByMergeCls;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_CLASS_DTL by my SHIPPING_STOP_FLG, named 'BClassDtlByShippingStopFlg'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByShippingStopFlg() {
            assertRelation("bClassDtlByShippingStopFlg");
            if (_bClassDtlByShippingStopFlg == null) {
                _bClassDtlByShippingStopFlg = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByShippingStopFlg()
                                    , () -> _qyCall.qy().queryBClassDtlByShippingStopFlg())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByShippingStopFlg.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByShippingStopFlg()
                      , () -> xsyncQyCall().qy().queryBClassDtlByShippingStopFlg()));
                }
            }
            return _bClassDtlByShippingStopFlg;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_CLASS_DTL by my FREIGHT_CLS, named 'BClassDtlByFreightCls'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByFreightCls() {
            assertRelation("bClassDtlByFreightCls");
            if (_bClassDtlByFreightCls == null) {
                _bClassDtlByFreightCls = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByFreightCls()
                                    , () -> _qyCall.qy().queryBClassDtlByFreightCls())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByFreightCls.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByFreightCls()
                      , () -> xsyncQyCall().qy().queryBClassDtlByFreightCls()));
                }
            }
            return _bClassDtlByFreightCls;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * M_PRODUCT by PRODUCT_ID, named 'MProductSelfAsOne'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MProductCB.HpSpecification specifyMProductSelfAsOne() {
            assertRelation("mProductSelfAsOne");
            if (_mProductSelfAsOne == null) {
                _mProductSelfAsOne = new MProductCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryMProductSelfAsOne()
                                    , () -> _qyCall.qy().queryMProductSelfAsOne())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _mProductSelfAsOne.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMProductSelfAsOne()
                      , () -> xsyncQyCall().qy().queryMProductSelfAsOne()));
                }
            }
            return _mProductSelfAsOne;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * M_PRODUCT_TERM by PRODUCT_ID, named 'MProductTermAsOne'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MProductTermCB.HpSpecification specifyMProductTermAsOne() {
            assertRelation("mProductTermAsOne");
            if (_mProductTermAsOne == null) {
                _mProductTermAsOne = new MProductTermCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryMProductTermAsOne()
                                    , () -> _qyCall.qy().queryMProductTermAsOne())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _mProductTermAsOne.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMProductTermAsOne()
                      , () -> xsyncQyCall().qy().queryMProductTermAsOne()));
                }
            }
            return _mProductTermAsOne;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * M_SET_PARENT by PRODUCT_ID, named 'MSetParentAsOne'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MSetParentCB.HpSpecification specifyMSetParentAsOne() {
            assertRelation("mSetParentAsOne");
            if (_mSetParentAsOne == null) {
                _mSetParentAsOne = new MSetParentCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryMSetParentAsOne()
                                    , () -> _qyCall.qy().queryMSetParentAsOne())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _mSetParentAsOne.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMSetParentAsOne()
                      , () -> xsyncQyCall().qy().queryMSetParentAsOne()));
                }
            }
            return _mSetParentAsOne;
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from M_LOCATION where ...) as FOO_MAX} <br>
         * M_LOCATION by REPLENISH_PRODUCT_ID, named 'MLocationList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(locationCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     locationCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     locationCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, MLocation.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<MLocationCB, MProductCQ> derivedMLocationList() {
            assertDerived("mLocationList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<MLocationCB> sq, MProductCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveMLocationList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from M_MFWHxITEM where ...) as FOO_MAX} <br>
         * M_MFWHxITEM by PRODUCT_ID, named 'MMfwhxitemList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(entityCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     entityCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     entityCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, MMfwhxitem.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<MMfwhxitemCB, MProductCQ> derivedMMfwhxitemList() {
            assertDerived("mMfwhxitemList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<MMfwhxitemCB> sq, MProductCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveMMfwhxitemList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from M_PRODUCT_SHAPE where ...) as FOO_MAX} <br>
         * M_PRODUCT_SHAPE by PRODUCT_ID, named 'MProductShapeList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(shapeCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     shapeCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     shapeCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, MProductShape.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<MProductShapeCB, MProductCQ> derivedMProductShapeList() {
            assertDerived("mProductShapeList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<MProductShapeCB> sq, MProductCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveMProductShapeList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from M_SET_STRUCTURE where ...) as FOO_MAX} <br>
         * M_SET_STRUCTURE by PRODUCT_ID, named 'MSetStructureList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(structureCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     structureCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     structureCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, MSetStructure.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<MSetStructureCB, MProductCQ> derivedMSetStructureList() {
            assertDerived("mSetStructureList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<MSetStructureCB> sq, MProductCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveMSetStructureList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from T_ALLOC_INST_B where ...) as FOO_MAX} <br>
         * T_ALLOC_INST_B by PRODUCT_ID, named 'TAllocInstBList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     bCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     bCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TAllocInstB.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TAllocInstBCB, MProductCQ> derivedTAllocInstBList() {
            assertDerived("tAllocInstBList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TAllocInstBCB> sq, MProductCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTAllocInstBList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from T_ALLOC_LOT where ...) as FOO_MAX} <br>
         * T_ALLOC_LOT by PRODUCT_ID, named 'TAllocLotList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(lotCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     lotCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     lotCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TAllocLot.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TAllocLotCB, MProductCQ> derivedTAllocLotList() {
            assertDerived("tAllocLotList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TAllocLotCB> sq, MProductCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTAllocLotList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from T_INVENTORY_B where ...) as FOO_MAX} <br>
         * T_INVENTORY_B by PRODUCT_ID, named 'TInventoryBList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     bCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     bCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TInventoryB.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TInventoryBCB, MProductCQ> derivedTInventoryBList() {
            assertDerived("tInventoryBList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TInventoryBCB> sq, MProductCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTInventoryBList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from T_KEEPING_LOT where ...) as FOO_MAX} <br>
         * T_KEEPING_LOT by PRODUCT_ID, named 'TKeepingLotList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(lotCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     lotCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     lotCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TKeepingLot.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TKeepingLotCB, MProductCQ> derivedTKeepingLotList() {
            assertDerived("tKeepingLotList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TKeepingLotCB> sq, MProductCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTKeepingLotList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from T_LAST_LOT where ...) as FOO_MAX} <br>
         * T_LAST_LOT by PRODUCT_ID, named 'TLastLotList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(lotCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     lotCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     lotCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TLastLot.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TLastLotCB, MProductCQ> derivedTLastLotList() {
            assertDerived("tLastLotList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TLastLotCB> sq, MProductCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTLastLotList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from T_LOT where ...) as FOO_MAX} <br>
         * T_LOT by PRODUCT_ID, named 'TLotList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(lotCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     lotCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     lotCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TLot.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TLotCB, MProductCQ> derivedTLotList() {
            assertDerived("tLotList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TLotCB> sq, MProductCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTLotList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from T_MOVE_INST_B where ...) as FOO_MAX} <br>
         * T_MOVE_INST_B by PRODUCT_ID, named 'TMoveInstBList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     bCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     bCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TMoveInstB.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TMoveInstBCB, MProductCQ> derivedTMoveInstBList() {
            assertDerived("tMoveInstBList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TMoveInstBCB> sq, MProductCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTMoveInstBList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from T_RECEIVE_PLAN_B where ...) as FOO_MAX} <br>
         * T_RECEIVE_PLAN_B by PRODUCT_ID, named 'TReceivePlanBList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     bCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     bCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TReceivePlanB.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TReceivePlanBCB, MProductCQ> derivedTReceivePlanBList() {
            assertDerived("tReceivePlanBList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TReceivePlanBCB> sq, MProductCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTReceivePlanBList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from T_SERIAL_NO where ...) as FOO_MAX} <br>
         * T_SERIAL_NO by PRODUCT_ID, named 'TSerialNoList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(noCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     noCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     noCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TSerialNo.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TSerialNoCB, MProductCQ> derivedTSerialNoList() {
            assertDerived("tSerialNoList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TSerialNoCB> sq, MProductCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTSerialNoList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from T_SHIPPING_INST_B where ...) as FOO_MAX} <br>
         * T_SHIPPING_INST_B by PRODUCT_ID, named 'TShippingInstBList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     bCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     bCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TShippingInstB.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TShippingInstBCB, MProductCQ> derivedTShippingInstBList() {
            assertDerived("tShippingInstBList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TShippingInstBCB> sq, MProductCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTShippingInstBList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from T_STOCK where ...) as FOO_MAX} <br>
         * T_STOCK by PRODUCT_ID, named 'TStockList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(stockCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     stockCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     stockCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TStock.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TStockCB, MProductCQ> derivedTStockList() {
            assertDerived("tStockList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TStockCB> sq, MProductCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTStockList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from T_TRINVCHECKINFO where ...) as FOO_MAX} <br>
         * T_TRINVCHECKINFO by PRODUCT_ID, named 'TTrinvcheckinfoList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(trinvcheckinfoCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     trinvcheckinfoCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     trinvcheckinfoCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TTrinvcheckinfo.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TTrinvcheckinfoCB, MProductCQ> derivedTTrinvcheckinfoList() {
            assertDerived("tTrinvcheckinfoList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TTrinvcheckinfoCB> sq, MProductCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTTrinvcheckinfoList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from T_YTRSODETAIL where ...) as FOO_MAX} <br>
         * T_YTRSODETAIL by PRODUCT_ID, named 'TYtrsodetailList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(ytrsodetailCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     ytrsodetailCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     ytrsodetailCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TYtrsodetail.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TYtrsodetailCB, MProductCQ> derivedTYtrsodetailList() {
            assertDerived("tYtrsodetailList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TYtrsodetailCB> sq, MProductCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTYtrsodetailList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from W_HT_INVENTORY_INPUT_PROD where ...) as FOO_MAX} <br>
         * W_HT_INVENTORY_INPUT_PROD by PRODUCT_ID, named 'WHtInventoryInputProdList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(prodCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     prodCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     prodCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, WHtInventoryInputProd.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<WHtInventoryInputProdCB, MProductCQ> derivedWHtInventoryInputProdList() {
            assertDerived("wHtInventoryInputProdList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<WHtInventoryInputProdCB> sq, MProductCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveWHtInventoryInputProdList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from W_HT_RECEIVE_INSPECTION where ...) as FOO_MAX} <br>
         * W_HT_RECEIVE_INSPECTION by PRODUCT_ID, named 'WHtReceiveInspectionList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(inspectionCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     inspectionCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     inspectionCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, WHtReceiveInspection.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<WHtReceiveInspectionCB, MProductCQ> derivedWHtReceiveInspectionList() {
            assertDerived("wHtReceiveInspectionList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<WHtReceiveInspectionCB> sq, MProductCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveWHtReceiveInspectionList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from W_HT_RECEIVE_NO_PLAN_INSP where ...) as FOO_MAX} <br>
         * W_HT_RECEIVE_NO_PLAN_INSP by PRODUCT_ID, named 'WHtReceiveNoPlanInspList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(inspCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     inspCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     inspCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, WHtReceiveNoPlanInsp.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<WHtReceiveNoPlanInspCB, MProductCQ> derivedWHtReceiveNoPlanInspList() {
            assertDerived("wHtReceiveNoPlanInspList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<WHtReceiveNoPlanInspCB> sq, MProductCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveWHtReceiveNoPlanInspList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from W_HT_RECEIVE_STORE where ...) as FOO_MAX} <br>
         * W_HT_RECEIVE_STORE by PRODUCT_ID, named 'WHtReceiveStoreList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(storeCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     storeCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     storeCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, WHtReceiveStore.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<WHtReceiveStoreCB, MProductCQ> derivedWHtReceiveStoreList() {
            assertDerived("wHtReceiveStoreList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<WHtReceiveStoreCB> sq, MProductCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveWHtReceiveStoreList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from W_HT_SHIPPING where ...) as FOO_MAX} <br>
         * W_HT_SHIPPING by PRODUCT_ID, named 'WHtShippingList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(shippingCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     shippingCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     shippingCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, WHtShipping.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<WHtShippingCB, MProductCQ> derivedWHtShippingList() {
            assertDerived("wHtShippingList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<WHtShippingCB> sq, MProductCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveWHtShippingList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from W_HT_SHIPPING_PICKING where ...) as FOO_MAX} <br>
         * W_HT_SHIPPING_PICKING by PRODUCT_ID, named 'WHtShippingPickingList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(pickingCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     pickingCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     pickingCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, WHtShippingPicking.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<WHtShippingPickingCB, MProductCQ> derivedWHtShippingPickingList() {
            assertDerived("wHtShippingPickingList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<WHtShippingPickingCB> sq, MProductCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveWHtShippingPickingList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from W_SGL_ROW_SHIP_INSP_H where ...) as FOO_MAX} <br>
         * W_SGL_ROW_SHIP_INSP_H by PRODUCT_ID, named 'WSglRowShipInspHList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     hCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     hCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, WSglRowShipInspH.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<WSglRowShipInspHCB, MProductCQ> derivedWSglRowShipInspHList() {
            assertDerived("wSglRowShipInspHList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<WSglRowShipInspHCB> sq, MProductCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveWSglRowShipInspHList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from W_SHIPPING_INTERRUPT where ...) as FOO_MAX} <br>
         * W_SHIPPING_INTERRUPT by PRODUCT_ID, named 'WShippingInterruptList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(interruptCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     interruptCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     interruptCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, WShippingInterrupt.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<WShippingInterruptCB, MProductCQ> derivedWShippingInterruptList() {
            assertDerived("wShippingInterruptList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<WShippingInterruptCB> sq, MProductCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveWShippingInterruptList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)MyselfDerived (SubQuery).
         * @return The object to set up a function for myself table. (NotNull)
         */
        public HpSDRFunction<MProductCB, MProductCQ> myselfDerived() {
            assertDerived("myselfDerived"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<MProductCB> sq, MProductCQ cq, String al, DerivedReferrerOption op)
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
    public MProductCB dreamCruiseCB() {
        MProductCB cb = new MProductCB();
        cb.xsetupForDreamCruise((MProductCB) this);
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
    public HpColQyOperand<MProductCB> columnQuery(final SpecifyQuery<MProductCB> colCBLambda) {
        return xcreateColQyOperand((rightSp, operand) -> {
            return xcolqy(xcreateColumnQueryCB(), xcreateColumnQueryCB(), colCBLambda, rightSp, operand);
        });
    }

    protected MProductCB xcreateColumnQueryCB() {
        MProductCB cb = new MProductCB();
        cb.xsetupForColumnQuery((MProductCB)this);
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
    public void orScopeQuery(OrQuery<MProductCB> orCBLambda) {
        xorSQ((MProductCB)this, orCBLambda);
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
    public void orScopeQueryAndPart(AndQuery<MProductCB> andCBLambda) {
        xorSQAP((MProductCB)this, andCBLambda);
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
        final MProductCB cb;
        if (mainCB != null) {
            cb = (MProductCB)mainCB;
        } else {
            cb = new MProductCB();
        }
        specify().xsetSyncQyCall(xcreateSpQyCall(() -> true, () -> cb.query()));
    }

    // ===================================================================================
    //                                                                            Internal
    //                                                                            ========
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xgetConditionBeanClassNameInternally() { return MProductCB.class.getName(); }
    protected String xgetConditionQueryClassNameInternally() { return MProductCQ.class.getName(); }
    protected String xgetSubQueryClassNameInternally() { return SubQuery.class.getName(); }
    protected String xgetConditionOptionClassNameInternally() { return ConditionOption.class.getName(); }
}
