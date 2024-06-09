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
 * The base condition-bean of T_EC_ORDER_H.
 * @author DBFlute(AutoGenerator)
 */
public class BsTEcOrderHCB extends AbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TEcOrderHCQ _conditionQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTEcOrderHCB() {
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
        return "T_EC_ORDER_H";
    }

    // ===================================================================================
    //                                                                 PrimaryKey Handling
    //                                                                 ===================
    /**
     * Accept the query condition of primary key as equal.
     * @param ecOrderHId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return this. (NotNull)
     */
    public TEcOrderHCB acceptPK(Long ecOrderHId) {
        assertObjectNotNull("ecOrderHId", ecOrderHId);
        BsTEcOrderHCB cb = this;
        cb.query().setEcOrderHId_Equal(ecOrderHId);
        return (TEcOrderHCB)this;
    }

    /**
     * Accept the query condition of primary key as equal. (old style)
     * @param ecOrderHId : PK, ID, NotNull, bigint identity(19). (NotNull)
     */
    public void acceptPrimaryKey(Long ecOrderHId) {
        assertObjectNotNull("ecOrderHId", ecOrderHId);
        BsTEcOrderHCB cb = this;
        cb.query().setEcOrderHId_Equal(ecOrderHId);
    }

    public ConditionBean addOrderBy_PK_Asc() {
        query().addOrderBy_EcOrderHId_Asc();
        return this;
    }

    public ConditionBean addOrderBy_PK_Desc() {
        query().addOrderBy_EcOrderHId_Desc();
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
    public TEcOrderHCQ query() {
        assertQueryPurpose(); // assert only when user-public query
        return doGetConditionQuery();
    }

    public TEcOrderHCQ xdfgetConditionQuery() { // public for parameter comment and internal
        return doGetConditionQuery();
    }

    protected TEcOrderHCQ doGetConditionQuery() {
        if (_conditionQuery == null) {
            _conditionQuery = createLocalCQ();
        }
        return _conditionQuery;
    }

    protected TEcOrderHCQ createLocalCQ() {
        return xcreateCQ(null, getSqlClause(), getSqlClause().getBasePointAliasName(), 0);
    }

    protected TEcOrderHCQ xcreateCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        TEcOrderHCQ cq = xnewCQ(childQuery, sqlClause, aliasName, nestLevel);
        cq.xsetBaseCB(this);
        return cq;
    }

    protected TEcOrderHCQ xnewCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        return new TEcOrderHCQ(childQuery, sqlClause, aliasName, nestLevel);
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
    public void union(UnionQuery<TEcOrderHCB> unionCBLambda) {
        final TEcOrderHCB cb = new TEcOrderHCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionCBLambda.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final TEcOrderHCQ cq = cb.query(); query().xsetUnionQuery(cq);
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
    public void unionAll(UnionQuery<TEcOrderHCB> unionCBLambda) {
        final TEcOrderHCB cb = new TEcOrderHCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionCBLambda.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final TEcOrderHCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
    }

    // ===================================================================================
    //                                                                         SetupSelect
    //                                                                         ===========
    protected MCenterNss _nssMCenter;
    public MCenterNss xdfgetNssMCenter() {
        if (_nssMCenter == null) { _nssMCenter = new MCenterNss(null); }
        return _nssMCenter;
    }
    /**
     * Set up relation columns to select clause. <br>
     * M_CENTER by my CENTER_ID, named 'MCenter'.
     * <pre>
     * <span style="color: #0000C0">tEcOrderHBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_MCenter()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">tEcOrderH</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">tEcOrderH</span>.<span style="color: #CC4747">getMCenter()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MCenterNss setupSelect_MCenter() {
        assertSetupSelectPurpose("mCenter");
        if (hasSpecifiedLocalColumn()) {
            specify().columnCenterId();
        }
        doSetupSelect(() -> query().queryMCenter());
        if (_nssMCenter == null || !_nssMCenter.hasConditionQuery())
        { _nssMCenter = new MCenterNss(query().queryMCenter()); }
        return _nssMCenter;
    }

    protected MClientNss _nssMClient;
    public MClientNss xdfgetNssMClient() {
        if (_nssMClient == null) { _nssMClient = new MClientNss(null); }
        return _nssMClient;
    }
    /**
     * Set up relation columns to select clause. <br>
     * M_CLIENT by my CLIENT_ID, named 'MClient'.
     * <pre>
     * <span style="color: #0000C0">tEcOrderHBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_MClient()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">tEcOrderH</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">tEcOrderH</span>.<span style="color: #CC4747">getMClient()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
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

    protected MImportTypeNss _nssMImportType;
    public MImportTypeNss xdfgetNssMImportType() {
        if (_nssMImportType == null) { _nssMImportType = new MImportTypeNss(null); }
        return _nssMImportType;
    }
    /**
     * Set up relation columns to select clause. <br>
     * M_IMPORT_TYPE by my IMPORT_TYPE_ID, named 'MImportType'.
     * <pre>
     * <span style="color: #0000C0">tEcOrderHBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_MImportType()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">tEcOrderH</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">tEcOrderH</span>.<span style="color: #CC4747">getMImportType()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MImportTypeNss setupSelect_MImportType() {
        assertSetupSelectPurpose("mImportType");
        if (hasSpecifiedLocalColumn()) {
            specify().columnImportTypeId();
        }
        doSetupSelect(() -> query().queryMImportType());
        if (_nssMImportType == null || !_nssMImportType.hasConditionQuery())
        { _nssMImportType = new MImportTypeNss(query().queryMImportType()); }
        return _nssMImportType;
    }

    protected TShippingInstHNss _nssTShippingInstH;
    public TShippingInstHNss xdfgetNssTShippingInstH() {
        if (_nssTShippingInstH == null) { _nssTShippingInstH = new TShippingInstHNss(null); }
        return _nssTShippingInstH;
    }
    /**
     * Set up relation columns to select clause. <br>
     * T_SHIPPING_INST_H by my SHIPPING_INST_H_ID, named 'TShippingInstH'.
     * <pre>
     * <span style="color: #0000C0">tEcOrderHBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_TShippingInstH()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">tEcOrderH</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">tEcOrderH</span>.<span style="color: #CC4747">getTShippingInstH()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public TShippingInstHNss setupSelect_TShippingInstH() {
        assertSetupSelectPurpose("tShippingInstH");
        if (hasSpecifiedLocalColumn()) {
            specify().columnShippingInstHId();
        }
        doSetupSelect(() -> query().queryTShippingInstH());
        if (_nssTShippingInstH == null || !_nssTShippingInstH.hasConditionQuery())
        { _nssTShippingInstH = new TShippingInstHNss(query().queryTShippingInstH()); }
        return _nssTShippingInstH;
    }

    protected BClassDtlNss _nssBClassDtlByDelivMatchFlg;
    public BClassDtlNss xdfgetNssBClassDtlByDelivMatchFlg() {
        if (_nssBClassDtlByDelivMatchFlg == null) { _nssBClassDtlByDelivMatchFlg = new BClassDtlNss(null); }
        return _nssBClassDtlByDelivMatchFlg;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my DELIV_MATCH_FLG, named 'BClassDtlByDelivMatchFlg'.
     * <pre>
     * <span style="color: #0000C0">tEcOrderHBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByDelivMatchFlg()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">tEcOrderH</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">tEcOrderH</span>.<span style="color: #CC4747">getBClassDtlByDelivMatchFlg()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByDelivMatchFlg() {
        assertSetupSelectPurpose("bClassDtlByDelivMatchFlg");
        if (hasSpecifiedLocalColumn()) {
            specify().columnDelivMatchFlg();
        }
        doSetupSelect(() -> query().queryBClassDtlByDelivMatchFlg());
        if (_nssBClassDtlByDelivMatchFlg == null || !_nssBClassDtlByDelivMatchFlg.hasConditionQuery())
        { _nssBClassDtlByDelivMatchFlg = new BClassDtlNss(query().queryBClassDtlByDelivMatchFlg()); }
        return _nssBClassDtlByDelivMatchFlg;
    }

    protected BClassDtlNss _nssBClassDtlByErrorFlg;
    public BClassDtlNss xdfgetNssBClassDtlByErrorFlg() {
        if (_nssBClassDtlByErrorFlg == null) { _nssBClassDtlByErrorFlg = new BClassDtlNss(null); }
        return _nssBClassDtlByErrorFlg;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my ERROR_FLG, named 'BClassDtlByErrorFlg'.
     * <pre>
     * <span style="color: #0000C0">tEcOrderHBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByErrorFlg()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">tEcOrderH</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">tEcOrderH</span>.<span style="color: #CC4747">getBClassDtlByErrorFlg()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByErrorFlg() {
        assertSetupSelectPurpose("bClassDtlByErrorFlg");
        if (hasSpecifiedLocalColumn()) {
            specify().columnErrorFlg();
        }
        doSetupSelect(() -> query().queryBClassDtlByErrorFlg());
        if (_nssBClassDtlByErrorFlg == null || !_nssBClassDtlByErrorFlg.hasConditionQuery())
        { _nssBClassDtlByErrorFlg = new BClassDtlNss(query().queryBClassDtlByErrorFlg()); }
        return _nssBClassDtlByErrorFlg;
    }

    protected BClassDtlNss _nssBClassDtlByGiftFlg;
    public BClassDtlNss xdfgetNssBClassDtlByGiftFlg() {
        if (_nssBClassDtlByGiftFlg == null) { _nssBClassDtlByGiftFlg = new BClassDtlNss(null); }
        return _nssBClassDtlByGiftFlg;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my GIFT_FLG, named 'BClassDtlByGiftFlg'.
     * <pre>
     * <span style="color: #0000C0">tEcOrderHBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByGiftFlg()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">tEcOrderH</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">tEcOrderH</span>.<span style="color: #CC4747">getBClassDtlByGiftFlg()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByGiftFlg() {
        assertSetupSelectPurpose("bClassDtlByGiftFlg");
        if (hasSpecifiedLocalColumn()) {
            specify().columnGiftFlg();
        }
        doSetupSelect(() -> query().queryBClassDtlByGiftFlg());
        if (_nssBClassDtlByGiftFlg == null || !_nssBClassDtlByGiftFlg.hasConditionQuery())
        { _nssBClassDtlByGiftFlg = new BClassDtlNss(query().queryBClassDtlByGiftFlg()); }
        return _nssBClassDtlByGiftFlg;
    }

    protected BClassDtlNss _nssBClassDtlByImportFlg;
    public BClassDtlNss xdfgetNssBClassDtlByImportFlg() {
        if (_nssBClassDtlByImportFlg == null) { _nssBClassDtlByImportFlg = new BClassDtlNss(null); }
        return _nssBClassDtlByImportFlg;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my IMPORT_FLG, named 'BClassDtlByImportFlg'.
     * <pre>
     * <span style="color: #0000C0">tEcOrderHBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByImportFlg()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">tEcOrderH</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">tEcOrderH</span>.<span style="color: #CC4747">getBClassDtlByImportFlg()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByImportFlg() {
        assertSetupSelectPurpose("bClassDtlByImportFlg");
        if (hasSpecifiedLocalColumn()) {
            specify().columnImportFlg();
        }
        doSetupSelect(() -> query().queryBClassDtlByImportFlg());
        if (_nssBClassDtlByImportFlg == null || !_nssBClassDtlByImportFlg.hasConditionQuery())
        { _nssBClassDtlByImportFlg = new BClassDtlNss(query().queryBClassDtlByImportFlg()); }
        return _nssBClassDtlByImportFlg;
    }

    protected BClassDtlNss _nssBClassDtlByPriorityFlg;
    public BClassDtlNss xdfgetNssBClassDtlByPriorityFlg() {
        if (_nssBClassDtlByPriorityFlg == null) { _nssBClassDtlByPriorityFlg = new BClassDtlNss(null); }
        return _nssBClassDtlByPriorityFlg;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my PRIORITY_FLG, named 'BClassDtlByPriorityFlg'.
     * <pre>
     * <span style="color: #0000C0">tEcOrderHBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByPriorityFlg()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">tEcOrderH</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">tEcOrderH</span>.<span style="color: #CC4747">getBClassDtlByPriorityFlg()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByPriorityFlg() {
        assertSetupSelectPurpose("bClassDtlByPriorityFlg");
        if (hasSpecifiedLocalColumn()) {
            specify().columnPriorityFlg();
        }
        doSetupSelect(() -> query().queryBClassDtlByPriorityFlg());
        if (_nssBClassDtlByPriorityFlg == null || !_nssBClassDtlByPriorityFlg.hasConditionQuery())
        { _nssBClassDtlByPriorityFlg = new BClassDtlNss(query().queryBClassDtlByPriorityFlg()); }
        return _nssBClassDtlByPriorityFlg;
    }

    protected TEcOrderRNss _nssTEcOrderRAsOne;
    public TEcOrderRNss xdfgetNssTEcOrderRAsOne() {
        if (_nssTEcOrderRAsOne == null) { _nssTEcOrderRAsOne = new TEcOrderRNss(null); }
        return _nssTEcOrderRAsOne;
    }
    /**
     * Set up relation columns to select clause. <br>
     * T_EC_ORDER_R by EC_ORDER_H_ID, named 'TEcOrderRAsOne'.
     * <pre>
     * <span style="color: #0000C0">tEcOrderHBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_TEcOrderRAsOne()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">tEcOrderH</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">tEcOrderH</span>.<span style="color: #CC4747">getTEcOrderRAsOne()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public TEcOrderRNss setupSelect_TEcOrderRAsOne() {
        assertSetupSelectPurpose("tEcOrderRAsOne");
        doSetupSelect(() -> query().queryTEcOrderRAsOne());
        if (_nssTEcOrderRAsOne == null || !_nssTEcOrderRAsOne.hasConditionQuery())
        { _nssTEcOrderRAsOne = new TEcOrderRNss(query().queryTEcOrderRAsOne()); }
        return _nssTEcOrderRAsOne;
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

    public static class HpSpecification extends HpAbstractSpecification<TEcOrderHCQ> {
        protected MCenterCB.HpSpecification _mCenter;
        protected MClientCB.HpSpecification _mClient;
        protected MImportTypeCB.HpSpecification _mImportType;
        protected TShippingInstHCB.HpSpecification _tShippingInstH;
        protected BClassDtlCB.HpSpecification _bClassDtlByDelivMatchFlg;
        protected BClassDtlCB.HpSpecification _bClassDtlByErrorFlg;
        protected BClassDtlCB.HpSpecification _bClassDtlByGiftFlg;
        protected BClassDtlCB.HpSpecification _bClassDtlByImportFlg;
        protected BClassDtlCB.HpSpecification _bClassDtlByPriorityFlg;
        protected TEcOrderRCB.HpSpecification _tEcOrderRAsOne;
        public HpSpecification(ConditionBean baseCB, HpSpQyCall<TEcOrderHCQ> qyCall
                             , HpCBPurpose purpose, DBMetaProvider dbmetaProvider
                             , HpSDRFunctionFactory sdrFuncFactory)
        { super(baseCB, qyCall, purpose, dbmetaProvider, sdrFuncFactory); }
        /**
         * EC_ORDER_H_ID: {PK, ID, NotNull, bigint identity(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnEcOrderHId() { return doColumn("EC_ORDER_H_ID"); }
        /**
         * CLIENT_ID: {bigint(19), FK to M_CLIENT}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnClientId() { return doColumn("CLIENT_ID"); }
        /**
         * CENTER_ID: {bigint(19), FK to M_CENTER}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCenterId() { return doColumn("CENTER_ID"); }
        /**
         * IMPORT_DT: {IX, varchar(8)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnImportDt() { return doColumn("IMPORT_DT"); }
        /**
         * ORDER_NO: {IX, varchar(100)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnOrderNo() { return doColumn("ORDER_NO"); }
        /**
         * PRIORITY_FLG: {char(1), FK to B_CLASS_DTL, classification=PriorityFlg}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnPriorityFlg() { return doColumn("PRIORITY_FLG"); }
        /**
         * ORDER_DT: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnOrderDt() { return doColumn("ORDER_DT"); }
        /**
         * ORDER_TIME: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnOrderTime() { return doColumn("ORDER_TIME"); }
        /**
         * DELIV_DT: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDelivDt() { return doColumn("DELIV_DT"); }
        /**
         * DELIV_TZ: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDelivTz() { return doColumn("DELIV_TZ"); }
        /**
         * COMMENT1: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnComment1() { return doColumn("COMMENT1"); }
        /**
         * COMMENT2: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnComment2() { return doColumn("COMMENT2"); }
        /**
         * GIFT_FLG: {char(1), FK to B_CLASS_DTL, classification=GiftFlg}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnGiftFlg() { return doColumn("GIFT_FLG"); }
        /**
         * NOSHI: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnNoshi() { return doColumn("NOSHI"); }
        /**
         * ORDER_ZIP_CD: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnOrderZipCd() { return doColumn("ORDER_ZIP_CD"); }
        /**
         * ORDER_ADDRESS1: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnOrderAddress1() { return doColumn("ORDER_ADDRESS1"); }
        /**
         * ORDER_ADDRESS2: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnOrderAddress2() { return doColumn("ORDER_ADDRESS2"); }
        /**
         * ORDER_ADDRESS3: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnOrderAddress3() { return doColumn("ORDER_ADDRESS3"); }
        /**
         * ORDER_CUSTOMER_NM: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnOrderCustomerNm() { return doColumn("ORDER_CUSTOMER_NM"); }
        /**
         * ORDER_CUSTOMER_NM_KANA: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnOrderCustomerNmKana() { return doColumn("ORDER_CUSTOMER_NM_KANA"); }
        /**
         * ORDER_TEL_NO: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnOrderTelNo() { return doColumn("ORDER_TEL_NO"); }
        /**
         * DELIV_MATCH_FLG: {char(1), FK to B_CLASS_DTL, classification=DelivMatchFlg}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDelivMatchFlg() { return doColumn("DELIV_MATCH_FLG"); }
        /**
         * MERGE_ID: {IX, varchar(100)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnMergeId() { return doColumn("MERGE_ID"); }
        /**
         * MERGE_STATUS: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnMergeStatus() { return doColumn("MERGE_STATUS"); }
        /**
         * DELIV_ZIP_CD: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDelivZipCd() { return doColumn("DELIV_ZIP_CD"); }
        /**
         * DELIV_ADDRESS1: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDelivAddress1() { return doColumn("DELIV_ADDRESS1"); }
        /**
         * DELIV_ADDRESS2: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDelivAddress2() { return doColumn("DELIV_ADDRESS2"); }
        /**
         * DELIV_ADDRESS3: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDelivAddress3() { return doColumn("DELIV_ADDRESS3"); }
        /**
         * INVOICE_DELIV_ADDRESS1: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnInvoiceDelivAddress1() { return doColumn("INVOICE_DELIV_ADDRESS1"); }
        /**
         * INVOICE_DELIV_ADDRESS2: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnInvoiceDelivAddress2() { return doColumn("INVOICE_DELIV_ADDRESS2"); }
        /**
         * INVOICE_DELIV_ADDRESS3: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnInvoiceDelivAddress3() { return doColumn("INVOICE_DELIV_ADDRESS3"); }
        /**
         * DELIV_CUSTOMER_NM: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDelivCustomerNm() { return doColumn("DELIV_CUSTOMER_NM"); }
        /**
         * DELIV_CUSTOMER_NM_KANA: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDelivCustomerNmKana() { return doColumn("DELIV_CUSTOMER_NM_KANA"); }
        /**
         * DELIV_TEL_NO: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDelivTelNo() { return doColumn("DELIV_TEL_NO"); }
        /**
         * DELIV_METHOD: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDelivMethod() { return doColumn("DELIV_METHOD"); }
        /**
         * DELIV_TYPE: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDelivType() { return doColumn("DELIV_TYPE"); }
        /**
         * DELIV_COMPANY: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDelivCompany() { return doColumn("DELIV_COMPANY"); }
        /**
         * PAYMENT_METHOD: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnPaymentMethod() { return doColumn("PAYMENT_METHOD"); }
        /**
         * CARD_TYPE: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCardType() { return doColumn("CARD_TYPE"); }
        /**
         * TOTAL: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnTotal() { return doColumn("TOTAL"); }
        /**
         * TAX: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnTax() { return doColumn("TAX"); }
        /**
         * CARRIAGE: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCarriage() { return doColumn("CARRIAGE"); }
        /**
         * COD: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCod() { return doColumn("COD"); }
        /**
         * TOTAL_AMOUNT: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnTotalAmount() { return doColumn("TOTAL_AMOUNT"); }
        /**
         * COUPON_DISCOUNT: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCouponDiscount() { return doColumn("COUPON_DISCOUNT"); }
        /**
         * POINT_DISCOUNT: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnPointDiscount() { return doColumn("POINT_DISCOUNT"); }
        /**
         * OTHER_DISCOUNT: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnOtherDiscount() { return doColumn("OTHER_DISCOUNT"); }
        /**
         * AMOUNT_BILLED: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnAmountBilled() { return doColumn("AMOUNT_BILLED"); }
        /**
         * MERGE_TOTAL: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnMergeTotal() { return doColumn("MERGE_TOTAL"); }
        /**
         * MERGE_CARRIAGE: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnMergeCarriage() { return doColumn("MERGE_CARRIAGE"); }
        /**
         * MERGE_COD: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnMergeCod() { return doColumn("MERGE_COD"); }
        /**
         * MERGE_TAX: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnMergeTax() { return doColumn("MERGE_TAX"); }
        /**
         * MERGE_AMOUNT_BILLED: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnMergeAmountBilled() { return doColumn("MERGE_AMOUNT_BILLED"); }
        /**
         * MERGE_TOTAL_AMOUNT: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnMergeTotalAmount() { return doColumn("MERGE_TOTAL_AMOUNT"); }
        /**
         * MERGE_COUPON_DISCOUNT: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnMergeCouponDiscount() { return doColumn("MERGE_COUPON_DISCOUNT"); }
        /**
         * MERGE_POINT_DISCOUNT: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnMergePointDiscount() { return doColumn("MERGE_POINT_DISCOUNT"); }
        /**
         * MERGE_OTHER_DISCOUNT: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnMergeOtherDiscount() { return doColumn("MERGE_OTHER_DISCOUNT"); }
        /**
         * PACKING_QTY: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnPackingQty() { return doColumn("PACKING_QTY"); }
        /**
         * SLIP_ITEM_NM1: {varchar(2147483647)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSlipItemNm1() { return doColumn("SLIP_ITEM_NM1"); }
        /**
         * SLIP_ITEM_NM2: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSlipItemNm2() { return doColumn("SLIP_ITEM_NM2"); }
        /**
         * SLIP_ITEM_NM3: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSlipItemNm3() { return doColumn("SLIP_ITEM_NM3"); }
        /**
         * SLIP_ITEM_NM4: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSlipItemNm4() { return doColumn("SLIP_ITEM_NM4"); }
        /**
         * SLIP_ITEM_NM5: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSlipItemNm5() { return doColumn("SLIP_ITEM_NM5"); }
        /**
         * SLIP_ITEM_CD1: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSlipItemCd1() { return doColumn("SLIP_ITEM_CD1"); }
        /**
         * SLIP_ITEM_CD2: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSlipItemCd2() { return doColumn("SLIP_ITEM_CD2"); }
        /**
         * FREIGHT_HANDLING1: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnFreightHandling1() { return doColumn("FREIGHT_HANDLING1"); }
        /**
         * FREIGHT_HANDLING2: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnFreightHandling2() { return doColumn("FREIGHT_HANDLING2"); }
        /**
         * ARTICLE: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnArticle() { return doColumn("ARTICLE"); }
        /**
         * RECEIVE_ID: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnReceiveId() { return doColumn("RECEIVE_ID"); }
        /**
         * ERROR_FLG: {char(1), FK to B_CLASS_DTL, classification=ErrorFlg}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnErrorFlg() { return doColumn("ERROR_FLG"); }
        /**
         * ERROR_MESSAGE_CD: {varchar(100)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnErrorMessageCd() { return doColumn("ERROR_MESSAGE_CD"); }
        /**
         * IMPORT_FLG: {char(1), FK to B_CLASS_DTL, classification=ImportFlg}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnImportFlg() { return doColumn("IMPORT_FLG"); }
        /**
         * IMPORT_TYPE_ID: {IX, bigint(19), FK to M_IMPORT_TYPE}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnImportTypeId() { return doColumn("IMPORT_TYPE_ID"); }
        /**
         * SHIPPING_INST_H_ID: {IX, bigint(19), FK to T_SHIPPING_INST_H}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnShippingInstHId() { return doColumn("SHIPPING_INST_H_ID"); }
        /**
         * DEL_FLG: {NotNull, char(1), default=[0], classification=DelFlg}
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
            columnEcOrderHId(); // PK
            if (qyCall().qy().hasConditionQueryMCenter()
                    || qyCall().qy().xgetReferrerQuery() instanceof MCenterCQ) {
                columnCenterId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryMClient()
                    || qyCall().qy().xgetReferrerQuery() instanceof MClientCQ) {
                columnClientId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryMImportType()
                    || qyCall().qy().xgetReferrerQuery() instanceof MImportTypeCQ) {
                columnImportTypeId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryTShippingInstH()
                    || qyCall().qy().xgetReferrerQuery() instanceof TShippingInstHCQ) {
                columnShippingInstHId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByDelivMatchFlg()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnDelivMatchFlg(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByErrorFlg()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnErrorFlg(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByGiftFlg()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnGiftFlg(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByImportFlg()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnImportFlg(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByPriorityFlg()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnPriorityFlg(); // FK or one-to-one referrer
            }
        }
        @Override
        protected String getTableDbName() { return "T_EC_ORDER_H"; }
        /**
         * Prepare to specify functions about relation table. <br>
         * M_CENTER by my CENTER_ID, named 'MCenter'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MCenterCB.HpSpecification specifyMCenter() {
            assertRelation("mCenter");
            if (_mCenter == null) {
                _mCenter = new MCenterCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryMCenter()
                                    , () -> _qyCall.qy().queryMCenter())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _mCenter.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMCenter()
                      , () -> xsyncQyCall().qy().queryMCenter()));
                }
            }
            return _mCenter;
        }
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
         * M_IMPORT_TYPE by my IMPORT_TYPE_ID, named 'MImportType'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MImportTypeCB.HpSpecification specifyMImportType() {
            assertRelation("mImportType");
            if (_mImportType == null) {
                _mImportType = new MImportTypeCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryMImportType()
                                    , () -> _qyCall.qy().queryMImportType())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _mImportType.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMImportType()
                      , () -> xsyncQyCall().qy().queryMImportType()));
                }
            }
            return _mImportType;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * T_SHIPPING_INST_H by my SHIPPING_INST_H_ID, named 'TShippingInstH'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public TShippingInstHCB.HpSpecification specifyTShippingInstH() {
            assertRelation("tShippingInstH");
            if (_tShippingInstH == null) {
                _tShippingInstH = new TShippingInstHCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryTShippingInstH()
                                    , () -> _qyCall.qy().queryTShippingInstH())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _tShippingInstH.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryTShippingInstH()
                      , () -> xsyncQyCall().qy().queryTShippingInstH()));
                }
            }
            return _tShippingInstH;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_CLASS_DTL by my DELIV_MATCH_FLG, named 'BClassDtlByDelivMatchFlg'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByDelivMatchFlg() {
            assertRelation("bClassDtlByDelivMatchFlg");
            if (_bClassDtlByDelivMatchFlg == null) {
                _bClassDtlByDelivMatchFlg = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByDelivMatchFlg()
                                    , () -> _qyCall.qy().queryBClassDtlByDelivMatchFlg())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByDelivMatchFlg.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByDelivMatchFlg()
                      , () -> xsyncQyCall().qy().queryBClassDtlByDelivMatchFlg()));
                }
            }
            return _bClassDtlByDelivMatchFlg;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_CLASS_DTL by my ERROR_FLG, named 'BClassDtlByErrorFlg'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByErrorFlg() {
            assertRelation("bClassDtlByErrorFlg");
            if (_bClassDtlByErrorFlg == null) {
                _bClassDtlByErrorFlg = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByErrorFlg()
                                    , () -> _qyCall.qy().queryBClassDtlByErrorFlg())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByErrorFlg.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByErrorFlg()
                      , () -> xsyncQyCall().qy().queryBClassDtlByErrorFlg()));
                }
            }
            return _bClassDtlByErrorFlg;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_CLASS_DTL by my GIFT_FLG, named 'BClassDtlByGiftFlg'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByGiftFlg() {
            assertRelation("bClassDtlByGiftFlg");
            if (_bClassDtlByGiftFlg == null) {
                _bClassDtlByGiftFlg = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByGiftFlg()
                                    , () -> _qyCall.qy().queryBClassDtlByGiftFlg())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByGiftFlg.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByGiftFlg()
                      , () -> xsyncQyCall().qy().queryBClassDtlByGiftFlg()));
                }
            }
            return _bClassDtlByGiftFlg;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_CLASS_DTL by my IMPORT_FLG, named 'BClassDtlByImportFlg'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByImportFlg() {
            assertRelation("bClassDtlByImportFlg");
            if (_bClassDtlByImportFlg == null) {
                _bClassDtlByImportFlg = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByImportFlg()
                                    , () -> _qyCall.qy().queryBClassDtlByImportFlg())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByImportFlg.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByImportFlg()
                      , () -> xsyncQyCall().qy().queryBClassDtlByImportFlg()));
                }
            }
            return _bClassDtlByImportFlg;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_CLASS_DTL by my PRIORITY_FLG, named 'BClassDtlByPriorityFlg'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByPriorityFlg() {
            assertRelation("bClassDtlByPriorityFlg");
            if (_bClassDtlByPriorityFlg == null) {
                _bClassDtlByPriorityFlg = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByPriorityFlg()
                                    , () -> _qyCall.qy().queryBClassDtlByPriorityFlg())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByPriorityFlg.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByPriorityFlg()
                      , () -> xsyncQyCall().qy().queryBClassDtlByPriorityFlg()));
                }
            }
            return _bClassDtlByPriorityFlg;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * T_EC_ORDER_R by EC_ORDER_H_ID, named 'TEcOrderRAsOne'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public TEcOrderRCB.HpSpecification specifyTEcOrderRAsOne() {
            assertRelation("tEcOrderRAsOne");
            if (_tEcOrderRAsOne == null) {
                _tEcOrderRAsOne = new TEcOrderRCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryTEcOrderRAsOne()
                                    , () -> _qyCall.qy().queryTEcOrderRAsOne())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _tEcOrderRAsOne.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryTEcOrderRAsOne()
                      , () -> xsyncQyCall().qy().queryTEcOrderRAsOne()));
                }
            }
            return _tEcOrderRAsOne;
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from T_EC_ORDER_B where ...) as FOO_MAX} <br>
         * T_EC_ORDER_B by EC_ORDER_H_ID, named 'TEcOrderBList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     bCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     bCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TEcOrderB.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TEcOrderBCB, TEcOrderHCQ> derivedTEcOrderBList() {
            assertDerived("tEcOrderBList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TEcOrderBCB> sq, TEcOrderHCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTEcOrderBList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)MyselfDerived (SubQuery).
         * @return The object to set up a function for myself table. (NotNull)
         */
        public HpSDRFunction<TEcOrderHCB, TEcOrderHCQ> myselfDerived() {
            assertDerived("myselfDerived"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TEcOrderHCB> sq, TEcOrderHCQ cq, String al, DerivedReferrerOption op)
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
    public TEcOrderHCB dreamCruiseCB() {
        TEcOrderHCB cb = new TEcOrderHCB();
        cb.xsetupForDreamCruise((TEcOrderHCB) this);
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
    public HpColQyOperand<TEcOrderHCB> columnQuery(final SpecifyQuery<TEcOrderHCB> colCBLambda) {
        return xcreateColQyOperand((rightSp, operand) -> {
            return xcolqy(xcreateColumnQueryCB(), xcreateColumnQueryCB(), colCBLambda, rightSp, operand);
        });
    }

    protected TEcOrderHCB xcreateColumnQueryCB() {
        TEcOrderHCB cb = new TEcOrderHCB();
        cb.xsetupForColumnQuery((TEcOrderHCB)this);
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
    public void orScopeQuery(OrQuery<TEcOrderHCB> orCBLambda) {
        xorSQ((TEcOrderHCB)this, orCBLambda);
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
    public void orScopeQueryAndPart(AndQuery<TEcOrderHCB> andCBLambda) {
        xorSQAP((TEcOrderHCB)this, andCBLambda);
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
        final TEcOrderHCB cb;
        if (mainCB != null) {
            cb = (TEcOrderHCB)mainCB;
        } else {
            cb = new TEcOrderHCB();
        }
        specify().xsetSyncQyCall(xcreateSpQyCall(() -> true, () -> cb.query()));
    }

    // ===================================================================================
    //                                                                            Internal
    //                                                                            ========
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xgetConditionBeanClassNameInternally() { return TEcOrderHCB.class.getName(); }
    protected String xgetConditionQueryClassNameInternally() { return TEcOrderHCQ.class.getName(); }
    protected String xgetSubQueryClassNameInternally() { return SubQuery.class.getName(); }
    protected String xgetConditionOptionClassNameInternally() { return ConditionOption.class.getName(); }
}
