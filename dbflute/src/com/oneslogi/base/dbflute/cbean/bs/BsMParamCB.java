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
 * The base condition-bean of M_PARAM.
 * @author DBFlute(AutoGenerator)
 */
public class BsMParamCB extends AbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MParamCQ _conditionQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMParamCB() {
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
        return "M_PARAM";
    }

    // ===================================================================================
    //                                                                 PrimaryKey Handling
    //                                                                 ===================
    /**
     * Accept the query condition of primary key as equal.
     * @param clientCenterId : PK, ID, NotNull, bigint identity(19), FK to M_CLIENT_CENTER. (NotNull)
     * @return this. (NotNull)
     */
    public MParamCB acceptPK(Long clientCenterId) {
        assertObjectNotNull("clientCenterId", clientCenterId);
        BsMParamCB cb = this;
        cb.query().setClientCenterId_Equal(clientCenterId);
        return (MParamCB)this;
    }

    /**
     * Accept the query condition of primary key as equal. (old style)
     * @param clientCenterId : PK, ID, NotNull, bigint identity(19), FK to M_CLIENT_CENTER. (NotNull)
     */
    public void acceptPrimaryKey(Long clientCenterId) {
        assertObjectNotNull("clientCenterId", clientCenterId);
        BsMParamCB cb = this;
        cb.query().setClientCenterId_Equal(clientCenterId);
    }

    public ConditionBean addOrderBy_PK_Asc() {
        query().addOrderBy_ClientCenterId_Asc();
        return this;
    }

    public ConditionBean addOrderBy_PK_Desc() {
        query().addOrderBy_ClientCenterId_Desc();
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
    public MParamCQ query() {
        assertQueryPurpose(); // assert only when user-public query
        return doGetConditionQuery();
    }

    public MParamCQ xdfgetConditionQuery() { // public for parameter comment and internal
        return doGetConditionQuery();
    }

    protected MParamCQ doGetConditionQuery() {
        if (_conditionQuery == null) {
            _conditionQuery = createLocalCQ();
        }
        return _conditionQuery;
    }

    protected MParamCQ createLocalCQ() {
        return xcreateCQ(null, getSqlClause(), getSqlClause().getBasePointAliasName(), 0);
    }

    protected MParamCQ xcreateCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        MParamCQ cq = xnewCQ(childQuery, sqlClause, aliasName, nestLevel);
        cq.xsetBaseCB(this);
        return cq;
    }

    protected MParamCQ xnewCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        return new MParamCQ(childQuery, sqlClause, aliasName, nestLevel);
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
    public void union(UnionQuery<MParamCB> unionCBLambda) {
        final MParamCB cb = new MParamCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionCBLambda.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final MParamCQ cq = cb.query(); query().xsetUnionQuery(cq);
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
    public void unionAll(UnionQuery<MParamCB> unionCBLambda) {
        final MParamCB cb = new MParamCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionCBLambda.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final MParamCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
    }

    // ===================================================================================
    //                                                                         SetupSelect
    //                                                                         ===========
    protected MClientCenterNss _nssMClientCenter;
    public MClientCenterNss xdfgetNssMClientCenter() {
        if (_nssMClientCenter == null) { _nssMClientCenter = new MClientCenterNss(null); }
        return _nssMClientCenter;
    }
    /**
     * Set up relation columns to select clause. <br>
     * M_CLIENT_CENTER by my CLIENT_CENTER_ID, named 'MClientCenter'.
     * <pre>
     * <span style="color: #0000C0">mParamBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_MClientCenter()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mParam</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mParam</span>.<span style="color: #CC4747">getMClientCenter()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MClientCenterNss setupSelect_MClientCenter() {
        assertSetupSelectPurpose("mClientCenter");
        doSetupSelect(() -> query().queryMClientCenter());
        if (_nssMClientCenter == null || !_nssMClientCenter.hasConditionQuery())
        { _nssMClientCenter = new MClientCenterNss(query().queryMClientCenter()); }
        return _nssMClientCenter;
    }

    protected MBoxNss _nssMBox;
    public MBoxNss xdfgetNssMBox() {
        if (_nssMBox == null) { _nssMBox = new MBoxNss(null); }
        return _nssMBox;
    }
    /**
     * Set up relation columns to select clause. <br>
     * M_BOX by my DEFAULT_BOX_ID, named 'MBox'.
     * <pre>
     * <span style="color: #0000C0">mParamBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_MBox()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mParam</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mParam</span>.<span style="color: #CC4747">getMBox()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MBoxNss setupSelect_MBox() {
        assertSetupSelectPurpose("mBox");
        if (hasSpecifiedLocalColumn()) {
            specify().columnDefaultBoxId();
        }
        doSetupSelect(() -> query().queryMBox());
        if (_nssMBox == null || !_nssMBox.hasConditionQuery())
        { _nssMBox = new MBoxNss(query().queryMBox()); }
        return _nssMBox;
    }

    protected MDeliveryCourseNss _nssMDeliveryCourse;
    public MDeliveryCourseNss xdfgetNssMDeliveryCourse() {
        if (_nssMDeliveryCourse == null) { _nssMDeliveryCourse = new MDeliveryCourseNss(null); }
        return _nssMDeliveryCourse;
    }
    /**
     * Set up relation columns to select clause. <br>
     * M_DELIVERY_COURSE by my DELIVERY_COURSE_ID, named 'MDeliveryCourse'.
     * <pre>
     * <span style="color: #0000C0">mParamBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_MDeliveryCourse()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mParam</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mParam</span>.<span style="color: #CC4747">getMDeliveryCourse()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MDeliveryCourseNss setupSelect_MDeliveryCourse() {
        assertSetupSelectPurpose("mDeliveryCourse");
        if (hasSpecifiedLocalColumn()) {
            specify().columnDeliveryCourseId();
        }
        doSetupSelect(() -> query().queryMDeliveryCourse());
        if (_nssMDeliveryCourse == null || !_nssMDeliveryCourse.hasConditionQuery())
        { _nssMDeliveryCourse = new MDeliveryCourseNss(query().queryMDeliveryCourse()); }
        return _nssMDeliveryCourse;
    }

    protected MZoneNss _nssMZone;
    public MZoneNss xdfgetNssMZone() {
        if (_nssMZone == null) { _nssMZone = new MZoneNss(null); }
        return _nssMZone;
    }
    /**
     * Set up relation columns to select clause. <br>
     * M_ZONE by my EM_REPLENISH_ZONE_ID, named 'MZone'.
     * <pre>
     * <span style="color: #0000C0">mParamBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_MZone()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mParam</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mParam</span>.<span style="color: #CC4747">getMZone()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MZoneNss setupSelect_MZone() {
        assertSetupSelectPurpose("mZone");
        if (hasSpecifiedLocalColumn()) {
            specify().columnEmReplenishZoneId();
        }
        doSetupSelect(() -> query().queryMZone());
        if (_nssMZone == null || !_nssMZone.hasConditionQuery())
        { _nssMZone = new MZoneNss(query().queryMZone()); }
        return _nssMZone;
    }

    protected MBoxGrpNss _nssMBoxGrp;
    public MBoxGrpNss xdfgetNssMBoxGrp() {
        if (_nssMBoxGrp == null) { _nssMBoxGrp = new MBoxGrpNss(null); }
        return _nssMBoxGrp;
    }
    /**
     * Set up relation columns to select clause. <br>
     * M_BOX_GRP by my PACKING_BOX_GROUP_ID, named 'MBoxGrp'.
     * <pre>
     * <span style="color: #0000C0">mParamBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_MBoxGrp()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mParam</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mParam</span>.<span style="color: #CC4747">getMBoxGrp()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MBoxGrpNss setupSelect_MBoxGrp() {
        assertSetupSelectPurpose("mBoxGrp");
        if (hasSpecifiedLocalColumn()) {
            specify().columnPackingBoxGroupId();
        }
        doSetupSelect(() -> query().queryMBoxGrp());
        if (_nssMBoxGrp == null || !_nssMBoxGrp.hasConditionQuery())
        { _nssMBoxGrp = new MBoxGrpNss(query().queryMBoxGrp()); }
        return _nssMBoxGrp;
    }

    protected BClassDtlNss _nssBClassDtlByAfterTagOutFlg;
    public BClassDtlNss xdfgetNssBClassDtlByAfterTagOutFlg() {
        if (_nssBClassDtlByAfterTagOutFlg == null) { _nssBClassDtlByAfterTagOutFlg = new BClassDtlNss(null); }
        return _nssBClassDtlByAfterTagOutFlg;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my AFTER_TAG_OUT_FLG, named 'BClassDtlByAfterTagOutFlg'.
     * <pre>
     * <span style="color: #0000C0">mParamBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByAfterTagOutFlg()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mParam</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mParam</span>.<span style="color: #CC4747">getBClassDtlByAfterTagOutFlg()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByAfterTagOutFlg() {
        assertSetupSelectPurpose("bClassDtlByAfterTagOutFlg");
        if (hasSpecifiedLocalColumn()) {
            specify().columnAfterTagOutFlg();
        }
        doSetupSelect(() -> query().queryBClassDtlByAfterTagOutFlg());
        if (_nssBClassDtlByAfterTagOutFlg == null || !_nssBClassDtlByAfterTagOutFlg.hasConditionQuery())
        { _nssBClassDtlByAfterTagOutFlg = new BClassDtlNss(query().queryBClassDtlByAfterTagOutFlg()); }
        return _nssBClassDtlByAfterTagOutFlg;
    }

    protected BClassDtlNss _nssBClassDtlByAfterDelivSlipOutFlg;
    public BClassDtlNss xdfgetNssBClassDtlByAfterDelivSlipOutFlg() {
        if (_nssBClassDtlByAfterDelivSlipOutFlg == null) { _nssBClassDtlByAfterDelivSlipOutFlg = new BClassDtlNss(null); }
        return _nssBClassDtlByAfterDelivSlipOutFlg;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my AFTER_DELIV_SLIP_OUT_FLG, named 'BClassDtlByAfterDelivSlipOutFlg'.
     * <pre>
     * <span style="color: #0000C0">mParamBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByAfterDelivSlipOutFlg()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mParam</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mParam</span>.<span style="color: #CC4747">getBClassDtlByAfterDelivSlipOutFlg()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByAfterDelivSlipOutFlg() {
        assertSetupSelectPurpose("bClassDtlByAfterDelivSlipOutFlg");
        if (hasSpecifiedLocalColumn()) {
            specify().columnAfterDelivSlipOutFlg();
        }
        doSetupSelect(() -> query().queryBClassDtlByAfterDelivSlipOutFlg());
        if (_nssBClassDtlByAfterDelivSlipOutFlg == null || !_nssBClassDtlByAfterDelivSlipOutFlg.hasConditionQuery())
        { _nssBClassDtlByAfterDelivSlipOutFlg = new BClassDtlNss(query().queryBClassDtlByAfterDelivSlipOutFlg()); }
        return _nssBClassDtlByAfterDelivSlipOutFlg;
    }

    protected BClassDtlNss _nssBClassDtlByAfterDelivSlipOutTgt;
    public BClassDtlNss xdfgetNssBClassDtlByAfterDelivSlipOutTgt() {
        if (_nssBClassDtlByAfterDelivSlipOutTgt == null) { _nssBClassDtlByAfterDelivSlipOutTgt = new BClassDtlNss(null); }
        return _nssBClassDtlByAfterDelivSlipOutTgt;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my AFTER_DELIV_SLIP_OUT_TGT, named 'BClassDtlByAfterDelivSlipOutTgt'.
     * <pre>
     * <span style="color: #0000C0">mParamBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByAfterDelivSlipOutTgt()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mParam</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mParam</span>.<span style="color: #CC4747">getBClassDtlByAfterDelivSlipOutTgt()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByAfterDelivSlipOutTgt() {
        assertSetupSelectPurpose("bClassDtlByAfterDelivSlipOutTgt");
        if (hasSpecifiedLocalColumn()) {
            specify().columnAfterDelivSlipOutTgt();
        }
        doSetupSelect(() -> query().queryBClassDtlByAfterDelivSlipOutTgt());
        if (_nssBClassDtlByAfterDelivSlipOutTgt == null || !_nssBClassDtlByAfterDelivSlipOutTgt.hasConditionQuery())
        { _nssBClassDtlByAfterDelivSlipOutTgt = new BClassDtlNss(query().queryBClassDtlByAfterDelivSlipOutTgt()); }
        return _nssBClassDtlByAfterDelivSlipOutTgt;
    }

    protected BClassDtlNss _nssBClassDtlBySglRowInspAfterOutCls;
    public BClassDtlNss xdfgetNssBClassDtlBySglRowInspAfterOutCls() {
        if (_nssBClassDtlBySglRowInspAfterOutCls == null) { _nssBClassDtlBySglRowInspAfterOutCls = new BClassDtlNss(null); }
        return _nssBClassDtlBySglRowInspAfterOutCls;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my SGL_ROW_INSP_AFTER_OUT_CLS, named 'BClassDtlBySglRowInspAfterOutCls'.
     * <pre>
     * <span style="color: #0000C0">mParamBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlBySglRowInspAfterOutCls()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mParam</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mParam</span>.<span style="color: #CC4747">getBClassDtlBySglRowInspAfterOutCls()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlBySglRowInspAfterOutCls() {
        assertSetupSelectPurpose("bClassDtlBySglRowInspAfterOutCls");
        if (hasSpecifiedLocalColumn()) {
            specify().columnSglRowInspAfterOutCls();
        }
        doSetupSelect(() -> query().queryBClassDtlBySglRowInspAfterOutCls());
        if (_nssBClassDtlBySglRowInspAfterOutCls == null || !_nssBClassDtlBySglRowInspAfterOutCls.hasConditionQuery())
        { _nssBClassDtlBySglRowInspAfterOutCls = new BClassDtlNss(query().queryBClassDtlBySglRowInspAfterOutCls()); }
        return _nssBClassDtlBySglRowInspAfterOutCls;
    }

    protected BClassDtlNss _nssBClassDtlByBoxSelectSkip;
    public BClassDtlNss xdfgetNssBClassDtlByBoxSelectSkip() {
        if (_nssBClassDtlByBoxSelectSkip == null) { _nssBClassDtlByBoxSelectSkip = new BClassDtlNss(null); }
        return _nssBClassDtlByBoxSelectSkip;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my BOX_SELECT_SKIP, named 'BClassDtlByBoxSelectSkip'.
     * <pre>
     * <span style="color: #0000C0">mParamBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByBoxSelectSkip()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mParam</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mParam</span>.<span style="color: #CC4747">getBClassDtlByBoxSelectSkip()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByBoxSelectSkip() {
        assertSetupSelectPurpose("bClassDtlByBoxSelectSkip");
        if (hasSpecifiedLocalColumn()) {
            specify().columnBoxSelectSkip();
        }
        doSetupSelect(() -> query().queryBClassDtlByBoxSelectSkip());
        if (_nssBClassDtlByBoxSelectSkip == null || !_nssBClassDtlByBoxSelectSkip.hasConditionQuery())
        { _nssBClassDtlByBoxSelectSkip = new BClassDtlNss(query().queryBClassDtlByBoxSelectSkip()); }
        return _nssBClassDtlByBoxSelectSkip;
    }

    protected BClassDtlNss _nssBClassDtlByCasePicFlg;
    public BClassDtlNss xdfgetNssBClassDtlByCasePicFlg() {
        if (_nssBClassDtlByCasePicFlg == null) { _nssBClassDtlByCasePicFlg = new BClassDtlNss(null); }
        return _nssBClassDtlByCasePicFlg;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my CASE_PIC_FLG, named 'BClassDtlByCasePicFlg'.
     * <pre>
     * <span style="color: #0000C0">mParamBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByCasePicFlg()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mParam</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mParam</span>.<span style="color: #CC4747">getBClassDtlByCasePicFlg()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByCasePicFlg() {
        assertSetupSelectPurpose("bClassDtlByCasePicFlg");
        if (hasSpecifiedLocalColumn()) {
            specify().columnCasePicFlg();
        }
        doSetupSelect(() -> query().queryBClassDtlByCasePicFlg());
        if (_nssBClassDtlByCasePicFlg == null || !_nssBClassDtlByCasePicFlg.hasConditionQuery())
        { _nssBClassDtlByCasePicFlg = new BClassDtlNss(query().queryBClassDtlByCasePicFlg()); }
        return _nssBClassDtlByCasePicFlg;
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
     * <span style="color: #0000C0">mParamBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByDelFlg()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mParam</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mParam</span>.<span style="color: #CC4747">getBClassDtlByDelFlg()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
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

    protected BClassDtlNss _nssBClassDtlByHtCharReadFlg;
    public BClassDtlNss xdfgetNssBClassDtlByHtCharReadFlg() {
        if (_nssBClassDtlByHtCharReadFlg == null) { _nssBClassDtlByHtCharReadFlg = new BClassDtlNss(null); }
        return _nssBClassDtlByHtCharReadFlg;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my HT_CHAR_READ_FLG, named 'BClassDtlByHtCharReadFlg'.
     * <pre>
     * <span style="color: #0000C0">mParamBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByHtCharReadFlg()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mParam</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mParam</span>.<span style="color: #CC4747">getBClassDtlByHtCharReadFlg()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByHtCharReadFlg() {
        assertSetupSelectPurpose("bClassDtlByHtCharReadFlg");
        if (hasSpecifiedLocalColumn()) {
            specify().columnHtCharReadFlg();
        }
        doSetupSelect(() -> query().queryBClassDtlByHtCharReadFlg());
        if (_nssBClassDtlByHtCharReadFlg == null || !_nssBClassDtlByHtCharReadFlg.hasConditionQuery())
        { _nssBClassDtlByHtCharReadFlg = new BClassDtlNss(query().queryBClassDtlByHtCharReadFlg()); }
        return _nssBClassDtlByHtCharReadFlg;
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
     * <span style="color: #0000C0">mParamBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByMergeCls()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mParam</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mParam</span>.<span style="color: #CC4747">getBClassDtlByMergeCls()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
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

    protected BClassDtlNss _nssBClassDtlByMultiPicCls;
    public BClassDtlNss xdfgetNssBClassDtlByMultiPicCls() {
        if (_nssBClassDtlByMultiPicCls == null) { _nssBClassDtlByMultiPicCls = new BClassDtlNss(null); }
        return _nssBClassDtlByMultiPicCls;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my MULTI_PIC_CLS, named 'BClassDtlByMultiPicCls'.
     * <pre>
     * <span style="color: #0000C0">mParamBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByMultiPicCls()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mParam</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mParam</span>.<span style="color: #CC4747">getBClassDtlByMultiPicCls()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByMultiPicCls() {
        assertSetupSelectPurpose("bClassDtlByMultiPicCls");
        if (hasSpecifiedLocalColumn()) {
            specify().columnMultiPicCls();
        }
        doSetupSelect(() -> query().queryBClassDtlByMultiPicCls());
        if (_nssBClassDtlByMultiPicCls == null || !_nssBClassDtlByMultiPicCls.hasConditionQuery())
        { _nssBClassDtlByMultiPicCls = new BClassDtlNss(query().queryBClassDtlByMultiPicCls()); }
        return _nssBClassDtlByMultiPicCls;
    }

    protected BClassDtlNss _nssBClassDtlByOverStoreNumFlg;
    public BClassDtlNss xdfgetNssBClassDtlByOverStoreNumFlg() {
        if (_nssBClassDtlByOverStoreNumFlg == null) { _nssBClassDtlByOverStoreNumFlg = new BClassDtlNss(null); }
        return _nssBClassDtlByOverStoreNumFlg;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my OVER_STORE_NUM_FLG, named 'BClassDtlByOverStoreNumFlg'.
     * <pre>
     * <span style="color: #0000C0">mParamBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByOverStoreNumFlg()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mParam</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mParam</span>.<span style="color: #CC4747">getBClassDtlByOverStoreNumFlg()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByOverStoreNumFlg() {
        assertSetupSelectPurpose("bClassDtlByOverStoreNumFlg");
        if (hasSpecifiedLocalColumn()) {
            specify().columnOverStoreNumFlg();
        }
        doSetupSelect(() -> query().queryBClassDtlByOverStoreNumFlg());
        if (_nssBClassDtlByOverStoreNumFlg == null || !_nssBClassDtlByOverStoreNumFlg.hasConditionQuery())
        { _nssBClassDtlByOverStoreNumFlg = new BClassDtlNss(query().queryBClassDtlByOverStoreNumFlg()); }
        return _nssBClassDtlByOverStoreNumFlg;
    }

    protected BClassDtlNss _nssBClassDtlByPackingCalCls;
    public BClassDtlNss xdfgetNssBClassDtlByPackingCalCls() {
        if (_nssBClassDtlByPackingCalCls == null) { _nssBClassDtlByPackingCalCls = new BClassDtlNss(null); }
        return _nssBClassDtlByPackingCalCls;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my PACKING_CAL_CLS, named 'BClassDtlByPackingCalCls'.
     * <pre>
     * <span style="color: #0000C0">mParamBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByPackingCalCls()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mParam</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mParam</span>.<span style="color: #CC4747">getBClassDtlByPackingCalCls()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByPackingCalCls() {
        assertSetupSelectPurpose("bClassDtlByPackingCalCls");
        if (hasSpecifiedLocalColumn()) {
            specify().columnPackingCalCls();
        }
        doSetupSelect(() -> query().queryBClassDtlByPackingCalCls());
        if (_nssBClassDtlByPackingCalCls == null || !_nssBClassDtlByPackingCalCls.hasConditionQuery())
        { _nssBClassDtlByPackingCalCls = new BClassDtlNss(query().queryBClassDtlByPackingCalCls()); }
        return _nssBClassDtlByPackingCalCls;
    }

    protected BClassDtlNss _nssBClassDtlByPackingProcessCls;
    public BClassDtlNss xdfgetNssBClassDtlByPackingProcessCls() {
        if (_nssBClassDtlByPackingProcessCls == null) { _nssBClassDtlByPackingProcessCls = new BClassDtlNss(null); }
        return _nssBClassDtlByPackingProcessCls;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my PACKING_PROCESS_CLS, named 'BClassDtlByPackingProcessCls'.
     * <pre>
     * <span style="color: #0000C0">mParamBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByPackingProcessCls()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mParam</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mParam</span>.<span style="color: #CC4747">getBClassDtlByPackingProcessCls()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByPackingProcessCls() {
        assertSetupSelectPurpose("bClassDtlByPackingProcessCls");
        if (hasSpecifiedLocalColumn()) {
            specify().columnPackingProcessCls();
        }
        doSetupSelect(() -> query().queryBClassDtlByPackingProcessCls());
        if (_nssBClassDtlByPackingProcessCls == null || !_nssBClassDtlByPackingProcessCls.hasConditionQuery())
        { _nssBClassDtlByPackingProcessCls = new BClassDtlNss(query().queryBClassDtlByPackingProcessCls()); }
        return _nssBClassDtlByPackingProcessCls;
    }

    protected BClassDtlNss _nssBClassDtlByPastStoreDtFlg;
    public BClassDtlNss xdfgetNssBClassDtlByPastStoreDtFlg() {
        if (_nssBClassDtlByPastStoreDtFlg == null) { _nssBClassDtlByPastStoreDtFlg = new BClassDtlNss(null); }
        return _nssBClassDtlByPastStoreDtFlg;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my PAST_STORE_DT_FLG, named 'BClassDtlByPastStoreDtFlg'.
     * <pre>
     * <span style="color: #0000C0">mParamBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByPastStoreDtFlg()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mParam</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mParam</span>.<span style="color: #CC4747">getBClassDtlByPastStoreDtFlg()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByPastStoreDtFlg() {
        assertSetupSelectPurpose("bClassDtlByPastStoreDtFlg");
        if (hasSpecifiedLocalColumn()) {
            specify().columnPastStoreDtFlg();
        }
        doSetupSelect(() -> query().queryBClassDtlByPastStoreDtFlg());
        if (_nssBClassDtlByPastStoreDtFlg == null || !_nssBClassDtlByPastStoreDtFlg.hasConditionQuery())
        { _nssBClassDtlByPastStoreDtFlg = new BClassDtlNss(query().queryBClassDtlByPastStoreDtFlg()); }
        return _nssBClassDtlByPastStoreDtFlg;
    }

    protected BClassDtlNss _nssBClassDtlByProductLabelJanBarcode;
    public BClassDtlNss xdfgetNssBClassDtlByProductLabelJanBarcode() {
        if (_nssBClassDtlByProductLabelJanBarcode == null) { _nssBClassDtlByProductLabelJanBarcode = new BClassDtlNss(null); }
        return _nssBClassDtlByProductLabelJanBarcode;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my PRODUCT_LABEL_JAN_BARCODE, named 'BClassDtlByProductLabelJanBarcode'.
     * <pre>
     * <span style="color: #0000C0">mParamBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByProductLabelJanBarcode()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mParam</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mParam</span>.<span style="color: #CC4747">getBClassDtlByProductLabelJanBarcode()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByProductLabelJanBarcode() {
        assertSetupSelectPurpose("bClassDtlByProductLabelJanBarcode");
        if (hasSpecifiedLocalColumn()) {
            specify().columnProductLabelJanBarcode();
        }
        doSetupSelect(() -> query().queryBClassDtlByProductLabelJanBarcode());
        if (_nssBClassDtlByProductLabelJanBarcode == null || !_nssBClassDtlByProductLabelJanBarcode.hasConditionQuery())
        { _nssBClassDtlByProductLabelJanBarcode = new BClassDtlNss(query().queryBClassDtlByProductLabelJanBarcode()); }
        return _nssBClassDtlByProductLabelJanBarcode;
    }

    protected BClassDtlNss _nssBClassDtlByProductLabelOutUnit;
    public BClassDtlNss xdfgetNssBClassDtlByProductLabelOutUnit() {
        if (_nssBClassDtlByProductLabelOutUnit == null) { _nssBClassDtlByProductLabelOutUnit = new BClassDtlNss(null); }
        return _nssBClassDtlByProductLabelOutUnit;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my PRODUCT_LABEL_OUT_UNIT, named 'BClassDtlByProductLabelOutUnit'.
     * <pre>
     * <span style="color: #0000C0">mParamBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByProductLabelOutUnit()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mParam</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mParam</span>.<span style="color: #CC4747">getBClassDtlByProductLabelOutUnit()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByProductLabelOutUnit() {
        assertSetupSelectPurpose("bClassDtlByProductLabelOutUnit");
        if (hasSpecifiedLocalColumn()) {
            specify().columnProductLabelOutUnit();
        }
        doSetupSelect(() -> query().queryBClassDtlByProductLabelOutUnit());
        if (_nssBClassDtlByProductLabelOutUnit == null || !_nssBClassDtlByProductLabelOutUnit.hasConditionQuery())
        { _nssBClassDtlByProductLabelOutUnit = new BClassDtlNss(query().queryBClassDtlByProductLabelOutUnit()); }
        return _nssBClassDtlByProductLabelOutUnit;
    }

    protected BClassDtlNss _nssBClassDtlByProductLabelProdBarcode;
    public BClassDtlNss xdfgetNssBClassDtlByProductLabelProdBarcode() {
        if (_nssBClassDtlByProductLabelProdBarcode == null) { _nssBClassDtlByProductLabelProdBarcode = new BClassDtlNss(null); }
        return _nssBClassDtlByProductLabelProdBarcode;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my PRODUCT_LABEL_PROD_BARCODE, named 'BClassDtlByProductLabelProdBarcode'.
     * <pre>
     * <span style="color: #0000C0">mParamBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByProductLabelProdBarcode()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mParam</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mParam</span>.<span style="color: #CC4747">getBClassDtlByProductLabelProdBarcode()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByProductLabelProdBarcode() {
        assertSetupSelectPurpose("bClassDtlByProductLabelProdBarcode");
        if (hasSpecifiedLocalColumn()) {
            specify().columnProductLabelProdBarcode();
        }
        doSetupSelect(() -> query().queryBClassDtlByProductLabelProdBarcode());
        if (_nssBClassDtlByProductLabelProdBarcode == null || !_nssBClassDtlByProductLabelProdBarcode.hasConditionQuery())
        { _nssBClassDtlByProductLabelProdBarcode = new BClassDtlNss(query().queryBClassDtlByProductLabelProdBarcode()); }
        return _nssBClassDtlByProductLabelProdBarcode;
    }

    protected BClassDtlNss _nssBClassDtlByProductPartPacking;
    public BClassDtlNss xdfgetNssBClassDtlByProductPartPacking() {
        if (_nssBClassDtlByProductPartPacking == null) { _nssBClassDtlByProductPartPacking = new BClassDtlNss(null); }
        return _nssBClassDtlByProductPartPacking;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my PRODUCT_PART_PACKING, named 'BClassDtlByProductPartPacking'.
     * <pre>
     * <span style="color: #0000C0">mParamBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByProductPartPacking()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mParam</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mParam</span>.<span style="color: #CC4747">getBClassDtlByProductPartPacking()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByProductPartPacking() {
        assertSetupSelectPurpose("bClassDtlByProductPartPacking");
        if (hasSpecifiedLocalColumn()) {
            specify().columnProductPartPacking();
        }
        doSetupSelect(() -> query().queryBClassDtlByProductPartPacking());
        if (_nssBClassDtlByProductPartPacking == null || !_nssBClassDtlByProductPartPacking.hasConditionQuery())
        { _nssBClassDtlByProductPartPacking = new BClassDtlNss(query().queryBClassDtlByProductPartPacking()); }
        return _nssBClassDtlByProductPartPacking;
    }

    protected BClassDtlNss _nssBClassDtlByDecimalProductPacking;
    public BClassDtlNss xdfgetNssBClassDtlByDecimalProductPacking() {
        if (_nssBClassDtlByDecimalProductPacking == null) { _nssBClassDtlByDecimalProductPacking = new BClassDtlNss(null); }
        return _nssBClassDtlByDecimalProductPacking;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my DECIMAL_PRODUCT_PACKING, named 'BClassDtlByDecimalProductPacking'.
     * <pre>
     * <span style="color: #0000C0">mParamBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByDecimalProductPacking()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mParam</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mParam</span>.<span style="color: #CC4747">getBClassDtlByDecimalProductPacking()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByDecimalProductPacking() {
        assertSetupSelectPurpose("bClassDtlByDecimalProductPacking");
        if (hasSpecifiedLocalColumn()) {
            specify().columnDecimalProductPacking();
        }
        doSetupSelect(() -> query().queryBClassDtlByDecimalProductPacking());
        if (_nssBClassDtlByDecimalProductPacking == null || !_nssBClassDtlByDecimalProductPacking.hasConditionQuery())
        { _nssBClassDtlByDecimalProductPacking = new BClassDtlNss(query().queryBClassDtlByDecimalProductPacking()); }
        return _nssBClassDtlByDecimalProductPacking;
    }

    protected BClassDtlNss _nssBClassDtlByEmReplenishAllocCls;
    public BClassDtlNss xdfgetNssBClassDtlByEmReplenishAllocCls() {
        if (_nssBClassDtlByEmReplenishAllocCls == null) { _nssBClassDtlByEmReplenishAllocCls = new BClassDtlNss(null); }
        return _nssBClassDtlByEmReplenishAllocCls;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my EM_REPLENISH_ALLOC_CLS, named 'BClassDtlByEmReplenishAllocCls'.
     * <pre>
     * <span style="color: #0000C0">mParamBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByEmReplenishAllocCls()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mParam</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mParam</span>.<span style="color: #CC4747">getBClassDtlByEmReplenishAllocCls()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByEmReplenishAllocCls() {
        assertSetupSelectPurpose("bClassDtlByEmReplenishAllocCls");
        if (hasSpecifiedLocalColumn()) {
            specify().columnEmReplenishAllocCls();
        }
        doSetupSelect(() -> query().queryBClassDtlByEmReplenishAllocCls());
        if (_nssBClassDtlByEmReplenishAllocCls == null || !_nssBClassDtlByEmReplenishAllocCls.hasConditionQuery())
        { _nssBClassDtlByEmReplenishAllocCls = new BClassDtlNss(query().queryBClassDtlByEmReplenishAllocCls()); }
        return _nssBClassDtlByEmReplenishAllocCls;
    }

    protected BClassDtlNss _nssBClassDtlByRgReplenishUnitCls;
    public BClassDtlNss xdfgetNssBClassDtlByRgReplenishUnitCls() {
        if (_nssBClassDtlByRgReplenishUnitCls == null) { _nssBClassDtlByRgReplenishUnitCls = new BClassDtlNss(null); }
        return _nssBClassDtlByRgReplenishUnitCls;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my RG_REPLENISH_UNIT_CLS, named 'BClassDtlByRgReplenishUnitCls'.
     * <pre>
     * <span style="color: #0000C0">mParamBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByRgReplenishUnitCls()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mParam</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mParam</span>.<span style="color: #CC4747">getBClassDtlByRgReplenishUnitCls()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByRgReplenishUnitCls() {
        assertSetupSelectPurpose("bClassDtlByRgReplenishUnitCls");
        if (hasSpecifiedLocalColumn()) {
            specify().columnRgReplenishUnitCls();
        }
        doSetupSelect(() -> query().queryBClassDtlByRgReplenishUnitCls());
        if (_nssBClassDtlByRgReplenishUnitCls == null || !_nssBClassDtlByRgReplenishUnitCls.hasConditionQuery())
        { _nssBClassDtlByRgReplenishUnitCls = new BClassDtlNss(query().queryBClassDtlByRgReplenishUnitCls()); }
        return _nssBClassDtlByRgReplenishUnitCls;
    }

    protected BClassDtlNss _nssBClassDtlByEmReplenishUnitCls;
    public BClassDtlNss xdfgetNssBClassDtlByEmReplenishUnitCls() {
        if (_nssBClassDtlByEmReplenishUnitCls == null) { _nssBClassDtlByEmReplenishUnitCls = new BClassDtlNss(null); }
        return _nssBClassDtlByEmReplenishUnitCls;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my EM_REPLENISH_UNIT_CLS, named 'BClassDtlByEmReplenishUnitCls'.
     * <pre>
     * <span style="color: #0000C0">mParamBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByEmReplenishUnitCls()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mParam</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mParam</span>.<span style="color: #CC4747">getBClassDtlByEmReplenishUnitCls()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByEmReplenishUnitCls() {
        assertSetupSelectPurpose("bClassDtlByEmReplenishUnitCls");
        if (hasSpecifiedLocalColumn()) {
            specify().columnEmReplenishUnitCls();
        }
        doSetupSelect(() -> query().queryBClassDtlByEmReplenishUnitCls());
        if (_nssBClassDtlByEmReplenishUnitCls == null || !_nssBClassDtlByEmReplenishUnitCls.hasConditionQuery())
        { _nssBClassDtlByEmReplenishUnitCls = new BClassDtlNss(query().queryBClassDtlByEmReplenishUnitCls()); }
        return _nssBClassDtlByEmReplenishUnitCls;
    }

    protected BClassDtlNss _nssBClassDtlByResultAfterProductLabel;
    public BClassDtlNss xdfgetNssBClassDtlByResultAfterProductLabel() {
        if (_nssBClassDtlByResultAfterProductLabel == null) { _nssBClassDtlByResultAfterProductLabel = new BClassDtlNss(null); }
        return _nssBClassDtlByResultAfterProductLabel;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my RESULT_AFTER_PRODUCT_LABEL, named 'BClassDtlByResultAfterProductLabel'.
     * <pre>
     * <span style="color: #0000C0">mParamBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByResultAfterProductLabel()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mParam</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mParam</span>.<span style="color: #CC4747">getBClassDtlByResultAfterProductLabel()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByResultAfterProductLabel() {
        assertSetupSelectPurpose("bClassDtlByResultAfterProductLabel");
        if (hasSpecifiedLocalColumn()) {
            specify().columnResultAfterProductLabel();
        }
        doSetupSelect(() -> query().queryBClassDtlByResultAfterProductLabel());
        if (_nssBClassDtlByResultAfterProductLabel == null || !_nssBClassDtlByResultAfterProductLabel.hasConditionQuery())
        { _nssBClassDtlByResultAfterProductLabel = new BClassDtlNss(query().queryBClassDtlByResultAfterProductLabel()); }
        return _nssBClassDtlByResultAfterProductLabel;
    }

    protected BClassDtlNss _nssBClassDtlByResultAfterProductTarget;
    public BClassDtlNss xdfgetNssBClassDtlByResultAfterProductTarget() {
        if (_nssBClassDtlByResultAfterProductTarget == null) { _nssBClassDtlByResultAfterProductTarget = new BClassDtlNss(null); }
        return _nssBClassDtlByResultAfterProductTarget;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my RESULT_AFTER_PRODUCT_TARGET, named 'BClassDtlByResultAfterProductTarget'.
     * <pre>
     * <span style="color: #0000C0">mParamBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByResultAfterProductTarget()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mParam</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mParam</span>.<span style="color: #CC4747">getBClassDtlByResultAfterProductTarget()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByResultAfterProductTarget() {
        assertSetupSelectPurpose("bClassDtlByResultAfterProductTarget");
        if (hasSpecifiedLocalColumn()) {
            specify().columnResultAfterProductTarget();
        }
        doSetupSelect(() -> query().queryBClassDtlByResultAfterProductTarget());
        if (_nssBClassDtlByResultAfterProductTarget == null || !_nssBClassDtlByResultAfterProductTarget.hasConditionQuery())
        { _nssBClassDtlByResultAfterProductTarget = new BClassDtlNss(query().queryBClassDtlByResultAfterProductTarget()); }
        return _nssBClassDtlByResultAfterProductTarget;
    }

    protected BClassDtlNss _nssBClassDtlByStoreDtFlg;
    public BClassDtlNss xdfgetNssBClassDtlByStoreDtFlg() {
        if (_nssBClassDtlByStoreDtFlg == null) { _nssBClassDtlByStoreDtFlg = new BClassDtlNss(null); }
        return _nssBClassDtlByStoreDtFlg;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my STORE_DT_FLG, named 'BClassDtlByStoreDtFlg'.
     * <pre>
     * <span style="color: #0000C0">mParamBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByStoreDtFlg()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mParam</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mParam</span>.<span style="color: #CC4747">getBClassDtlByStoreDtFlg()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByStoreDtFlg() {
        assertSetupSelectPurpose("bClassDtlByStoreDtFlg");
        if (hasSpecifiedLocalColumn()) {
            specify().columnStoreDtFlg();
        }
        doSetupSelect(() -> query().queryBClassDtlByStoreDtFlg());
        if (_nssBClassDtlByStoreDtFlg == null || !_nssBClassDtlByStoreDtFlg.hasConditionQuery())
        { _nssBClassDtlByStoreDtFlg = new BClassDtlNss(query().queryBClassDtlByStoreDtFlg()); }
        return _nssBClassDtlByStoreDtFlg;
    }

    protected BClassDtlNss _nssBClassDtlByStoreNoFlg;
    public BClassDtlNss xdfgetNssBClassDtlByStoreNoFlg() {
        if (_nssBClassDtlByStoreNoFlg == null) { _nssBClassDtlByStoreNoFlg = new BClassDtlNss(null); }
        return _nssBClassDtlByStoreNoFlg;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my STORE_NO_FLG, named 'BClassDtlByStoreNoFlg'.
     * <pre>
     * <span style="color: #0000C0">mParamBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByStoreNoFlg()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mParam</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mParam</span>.<span style="color: #CC4747">getBClassDtlByStoreNoFlg()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByStoreNoFlg() {
        assertSetupSelectPurpose("bClassDtlByStoreNoFlg");
        if (hasSpecifiedLocalColumn()) {
            specify().columnStoreNoFlg();
        }
        doSetupSelect(() -> query().queryBClassDtlByStoreNoFlg());
        if (_nssBClassDtlByStoreNoFlg == null || !_nssBClassDtlByStoreNoFlg.hasConditionQuery())
        { _nssBClassDtlByStoreNoFlg = new BClassDtlNss(query().queryBClassDtlByStoreNoFlg()); }
        return _nssBClassDtlByStoreNoFlg;
    }

    protected BClassDtlNss _nssBClassDtlByTagDeliveryOutFlg;
    public BClassDtlNss xdfgetNssBClassDtlByTagDeliveryOutFlg() {
        if (_nssBClassDtlByTagDeliveryOutFlg == null) { _nssBClassDtlByTagDeliveryOutFlg = new BClassDtlNss(null); }
        return _nssBClassDtlByTagDeliveryOutFlg;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my TAG_DELIVERY_OUT_FLG, named 'BClassDtlByTagDeliveryOutFlg'.
     * <pre>
     * <span style="color: #0000C0">mParamBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByTagDeliveryOutFlg()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mParam</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mParam</span>.<span style="color: #CC4747">getBClassDtlByTagDeliveryOutFlg()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByTagDeliveryOutFlg() {
        assertSetupSelectPurpose("bClassDtlByTagDeliveryOutFlg");
        if (hasSpecifiedLocalColumn()) {
            specify().columnTagDeliveryOutFlg();
        }
        doSetupSelect(() -> query().queryBClassDtlByTagDeliveryOutFlg());
        if (_nssBClassDtlByTagDeliveryOutFlg == null || !_nssBClassDtlByTagDeliveryOutFlg.hasConditionQuery())
        { _nssBClassDtlByTagDeliveryOutFlg = new BClassDtlNss(query().queryBClassDtlByTagDeliveryOutFlg()); }
        return _nssBClassDtlByTagDeliveryOutFlg;
    }

    protected BClassDtlNss _nssBClassDtlByUseHtShipFlg;
    public BClassDtlNss xdfgetNssBClassDtlByUseHtShipFlg() {
        if (_nssBClassDtlByUseHtShipFlg == null) { _nssBClassDtlByUseHtShipFlg = new BClassDtlNss(null); }
        return _nssBClassDtlByUseHtShipFlg;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my USE_HT_SHIP_FLG, named 'BClassDtlByUseHtShipFlg'.
     * <pre>
     * <span style="color: #0000C0">mParamBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByUseHtShipFlg()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mParam</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mParam</span>.<span style="color: #CC4747">getBClassDtlByUseHtShipFlg()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByUseHtShipFlg() {
        assertSetupSelectPurpose("bClassDtlByUseHtShipFlg");
        if (hasSpecifiedLocalColumn()) {
            specify().columnUseHtShipFlg();
        }
        doSetupSelect(() -> query().queryBClassDtlByUseHtShipFlg());
        if (_nssBClassDtlByUseHtShipFlg == null || !_nssBClassDtlByUseHtShipFlg.hasConditionQuery())
        { _nssBClassDtlByUseHtShipFlg = new BClassDtlNss(query().queryBClassDtlByUseHtShipFlg()); }
        return _nssBClassDtlByUseHtShipFlg;
    }

    protected BClassDtlNss _nssBClassDtlByInspectionLabelOutFlg;
    public BClassDtlNss xdfgetNssBClassDtlByInspectionLabelOutFlg() {
        if (_nssBClassDtlByInspectionLabelOutFlg == null) { _nssBClassDtlByInspectionLabelOutFlg = new BClassDtlNss(null); }
        return _nssBClassDtlByInspectionLabelOutFlg;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my INSPECTION_LABEL_OUT_FLG, named 'BClassDtlByInspectionLabelOutFlg'.
     * <pre>
     * <span style="color: #0000C0">mParamBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByInspectionLabelOutFlg()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mParam</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mParam</span>.<span style="color: #CC4747">getBClassDtlByInspectionLabelOutFlg()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByInspectionLabelOutFlg() {
        assertSetupSelectPurpose("bClassDtlByInspectionLabelOutFlg");
        if (hasSpecifiedLocalColumn()) {
            specify().columnInspectionLabelOutFlg();
        }
        doSetupSelect(() -> query().queryBClassDtlByInspectionLabelOutFlg());
        if (_nssBClassDtlByInspectionLabelOutFlg == null || !_nssBClassDtlByInspectionLabelOutFlg.hasConditionQuery())
        { _nssBClassDtlByInspectionLabelOutFlg = new BClassDtlNss(query().queryBClassDtlByInspectionLabelOutFlg()); }
        return _nssBClassDtlByInspectionLabelOutFlg;
    }

    protected BClassDtlNss _nssBClassDtlBySglRowPicFlg;
    public BClassDtlNss xdfgetNssBClassDtlBySglRowPicFlg() {
        if (_nssBClassDtlBySglRowPicFlg == null) { _nssBClassDtlBySglRowPicFlg = new BClassDtlNss(null); }
        return _nssBClassDtlBySglRowPicFlg;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my SGL_ROW_PIC_FLG, named 'BClassDtlBySglRowPicFlg'.
     * <pre>
     * <span style="color: #0000C0">mParamBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlBySglRowPicFlg()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mParam</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mParam</span>.<span style="color: #CC4747">getBClassDtlBySglRowPicFlg()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlBySglRowPicFlg() {
        assertSetupSelectPurpose("bClassDtlBySglRowPicFlg");
        if (hasSpecifiedLocalColumn()) {
            specify().columnSglRowPicFlg();
        }
        doSetupSelect(() -> query().queryBClassDtlBySglRowPicFlg());
        if (_nssBClassDtlBySglRowPicFlg == null || !_nssBClassDtlBySglRowPicFlg.hasConditionQuery())
        { _nssBClassDtlBySglRowPicFlg = new BClassDtlNss(query().queryBClassDtlBySglRowPicFlg()); }
        return _nssBClassDtlBySglRowPicFlg;
    }

    protected BClassDtlNss _nssBClassDtlByTotalPicFlg;
    public BClassDtlNss xdfgetNssBClassDtlByTotalPicFlg() {
        if (_nssBClassDtlByTotalPicFlg == null) { _nssBClassDtlByTotalPicFlg = new BClassDtlNss(null); }
        return _nssBClassDtlByTotalPicFlg;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my TOTAL_PIC_FLG, named 'BClassDtlByTotalPicFlg'.
     * <pre>
     * <span style="color: #0000C0">mParamBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByTotalPicFlg()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mParam</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mParam</span>.<span style="color: #CC4747">getBClassDtlByTotalPicFlg()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByTotalPicFlg() {
        assertSetupSelectPurpose("bClassDtlByTotalPicFlg");
        if (hasSpecifiedLocalColumn()) {
            specify().columnTotalPicFlg();
        }
        doSetupSelect(() -> query().queryBClassDtlByTotalPicFlg());
        if (_nssBClassDtlByTotalPicFlg == null || !_nssBClassDtlByTotalPicFlg.hasConditionQuery())
        { _nssBClassDtlByTotalPicFlg = new BClassDtlNss(query().queryBClassDtlByTotalPicFlg()); }
        return _nssBClassDtlByTotalPicFlg;
    }

    protected BClassDtlNss _nssBClassDtlByPicMthdRcmdFlg;
    public BClassDtlNss xdfgetNssBClassDtlByPicMthdRcmdFlg() {
        if (_nssBClassDtlByPicMthdRcmdFlg == null) { _nssBClassDtlByPicMthdRcmdFlg = new BClassDtlNss(null); }
        return _nssBClassDtlByPicMthdRcmdFlg;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my PIC_MTHD_RCMD_FLG, named 'BClassDtlByPicMthdRcmdFlg'.
     * <pre>
     * <span style="color: #0000C0">mParamBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByPicMthdRcmdFlg()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mParam</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mParam</span>.<span style="color: #CC4747">getBClassDtlByPicMthdRcmdFlg()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByPicMthdRcmdFlg() {
        assertSetupSelectPurpose("bClassDtlByPicMthdRcmdFlg");
        if (hasSpecifiedLocalColumn()) {
            specify().columnPicMthdRcmdFlg();
        }
        doSetupSelect(() -> query().queryBClassDtlByPicMthdRcmdFlg());
        if (_nssBClassDtlByPicMthdRcmdFlg == null || !_nssBClassDtlByPicMthdRcmdFlg.hasConditionQuery())
        { _nssBClassDtlByPicMthdRcmdFlg = new BClassDtlNss(query().queryBClassDtlByPicMthdRcmdFlg()); }
        return _nssBClassDtlByPicMthdRcmdFlg;
    }

    protected BClassDtlNss _nssBClassDtlByPicMthdRcmdBreakKey;
    public BClassDtlNss xdfgetNssBClassDtlByPicMthdRcmdBreakKey() {
        if (_nssBClassDtlByPicMthdRcmdBreakKey == null) { _nssBClassDtlByPicMthdRcmdBreakKey = new BClassDtlNss(null); }
        return _nssBClassDtlByPicMthdRcmdBreakKey;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my PIC_MTHD_RCMD_BREAK_KEY, named 'BClassDtlByPicMthdRcmdBreakKey'.
     * <pre>
     * <span style="color: #0000C0">mParamBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByPicMthdRcmdBreakKey()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mParam</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mParam</span>.<span style="color: #CC4747">getBClassDtlByPicMthdRcmdBreakKey()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByPicMthdRcmdBreakKey() {
        assertSetupSelectPurpose("bClassDtlByPicMthdRcmdBreakKey");
        if (hasSpecifiedLocalColumn()) {
            specify().columnPicMthdRcmdBreakKey();
        }
        doSetupSelect(() -> query().queryBClassDtlByPicMthdRcmdBreakKey());
        if (_nssBClassDtlByPicMthdRcmdBreakKey == null || !_nssBClassDtlByPicMthdRcmdBreakKey.hasConditionQuery())
        { _nssBClassDtlByPicMthdRcmdBreakKey = new BClassDtlNss(query().queryBClassDtlByPicMthdRcmdBreakKey()); }
        return _nssBClassDtlByPicMthdRcmdBreakKey;
    }

    protected BClassDtlNss _nssBClassDtlByAutoShipInstFlg;
    public BClassDtlNss xdfgetNssBClassDtlByAutoShipInstFlg() {
        if (_nssBClassDtlByAutoShipInstFlg == null) { _nssBClassDtlByAutoShipInstFlg = new BClassDtlNss(null); }
        return _nssBClassDtlByAutoShipInstFlg;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my AUTO_SHIP_INST_FLG, named 'BClassDtlByAutoShipInstFlg'.
     * <pre>
     * <span style="color: #0000C0">mParamBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByAutoShipInstFlg()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mParam</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mParam</span>.<span style="color: #CC4747">getBClassDtlByAutoShipInstFlg()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByAutoShipInstFlg() {
        assertSetupSelectPurpose("bClassDtlByAutoShipInstFlg");
        if (hasSpecifiedLocalColumn()) {
            specify().columnAutoShipInstFlg();
        }
        doSetupSelect(() -> query().queryBClassDtlByAutoShipInstFlg());
        if (_nssBClassDtlByAutoShipInstFlg == null || !_nssBClassDtlByAutoShipInstFlg.hasConditionQuery())
        { _nssBClassDtlByAutoShipInstFlg = new BClassDtlNss(query().queryBClassDtlByAutoShipInstFlg()); }
        return _nssBClassDtlByAutoShipInstFlg;
    }

    protected BClassDtlNss _nssBClassDtlByStockOutAutoInstFlg;
    public BClassDtlNss xdfgetNssBClassDtlByStockOutAutoInstFlg() {
        if (_nssBClassDtlByStockOutAutoInstFlg == null) { _nssBClassDtlByStockOutAutoInstFlg = new BClassDtlNss(null); }
        return _nssBClassDtlByStockOutAutoInstFlg;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my STOCK_OUT_AUTO_INST_FLG, named 'BClassDtlByStockOutAutoInstFlg'.
     * <pre>
     * <span style="color: #0000C0">mParamBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByStockOutAutoInstFlg()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mParam</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mParam</span>.<span style="color: #CC4747">getBClassDtlByStockOutAutoInstFlg()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByStockOutAutoInstFlg() {
        assertSetupSelectPurpose("bClassDtlByStockOutAutoInstFlg");
        if (hasSpecifiedLocalColumn()) {
            specify().columnStockOutAutoInstFlg();
        }
        doSetupSelect(() -> query().queryBClassDtlByStockOutAutoInstFlg());
        if (_nssBClassDtlByStockOutAutoInstFlg == null || !_nssBClassDtlByStockOutAutoInstFlg.hasConditionQuery())
        { _nssBClassDtlByStockOutAutoInstFlg = new BClassDtlNss(query().queryBClassDtlByStockOutAutoInstFlg()); }
        return _nssBClassDtlByStockOutAutoInstFlg;
    }

    protected BClassDtlNss _nssBClassDtlByAutoEmgSetFlg;
    public BClassDtlNss xdfgetNssBClassDtlByAutoEmgSetFlg() {
        if (_nssBClassDtlByAutoEmgSetFlg == null) { _nssBClassDtlByAutoEmgSetFlg = new BClassDtlNss(null); }
        return _nssBClassDtlByAutoEmgSetFlg;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my AUTO_EMG_SET_FLG, named 'BClassDtlByAutoEmgSetFlg'.
     * <pre>
     * <span style="color: #0000C0">mParamBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByAutoEmgSetFlg()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mParam</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mParam</span>.<span style="color: #CC4747">getBClassDtlByAutoEmgSetFlg()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByAutoEmgSetFlg() {
        assertSetupSelectPurpose("bClassDtlByAutoEmgSetFlg");
        if (hasSpecifiedLocalColumn()) {
            specify().columnAutoEmgSetFlg();
        }
        doSetupSelect(() -> query().queryBClassDtlByAutoEmgSetFlg());
        if (_nssBClassDtlByAutoEmgSetFlg == null || !_nssBClassDtlByAutoEmgSetFlg.hasConditionQuery())
        { _nssBClassDtlByAutoEmgSetFlg = new BClassDtlNss(query().queryBClassDtlByAutoEmgSetFlg()); }
        return _nssBClassDtlByAutoEmgSetFlg;
    }

    protected BClassDtlNss _nssBClassDtlByAutoEmgSetTgt;
    public BClassDtlNss xdfgetNssBClassDtlByAutoEmgSetTgt() {
        if (_nssBClassDtlByAutoEmgSetTgt == null) { _nssBClassDtlByAutoEmgSetTgt = new BClassDtlNss(null); }
        return _nssBClassDtlByAutoEmgSetTgt;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my AUTO_EMG_SET_TGT, named 'BClassDtlByAutoEmgSetTgt'.
     * <pre>
     * <span style="color: #0000C0">mParamBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByAutoEmgSetTgt()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mParam</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mParam</span>.<span style="color: #CC4747">getBClassDtlByAutoEmgSetTgt()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByAutoEmgSetTgt() {
        assertSetupSelectPurpose("bClassDtlByAutoEmgSetTgt");
        if (hasSpecifiedLocalColumn()) {
            specify().columnAutoEmgSetTgt();
        }
        doSetupSelect(() -> query().queryBClassDtlByAutoEmgSetTgt());
        if (_nssBClassDtlByAutoEmgSetTgt == null || !_nssBClassDtlByAutoEmgSetTgt.hasConditionQuery())
        { _nssBClassDtlByAutoEmgSetTgt = new BClassDtlNss(query().queryBClassDtlByAutoEmgSetTgt()); }
        return _nssBClassDtlByAutoEmgSetTgt;
    }

    protected BClassDtlNss _nssBClassDtlByStockOutAllocCls;
    public BClassDtlNss xdfgetNssBClassDtlByStockOutAllocCls() {
        if (_nssBClassDtlByStockOutAllocCls == null) { _nssBClassDtlByStockOutAllocCls = new BClassDtlNss(null); }
        return _nssBClassDtlByStockOutAllocCls;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my STOCK_OUT_ALLOC_CLS, named 'BClassDtlByStockOutAllocCls'.
     * <pre>
     * <span style="color: #0000C0">mParamBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByStockOutAllocCls()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mParam</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mParam</span>.<span style="color: #CC4747">getBClassDtlByStockOutAllocCls()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByStockOutAllocCls() {
        assertSetupSelectPurpose("bClassDtlByStockOutAllocCls");
        if (hasSpecifiedLocalColumn()) {
            specify().columnStockOutAllocCls();
        }
        doSetupSelect(() -> query().queryBClassDtlByStockOutAllocCls());
        if (_nssBClassDtlByStockOutAllocCls == null || !_nssBClassDtlByStockOutAllocCls.hasConditionQuery())
        { _nssBClassDtlByStockOutAllocCls = new BClassDtlNss(query().queryBClassDtlByStockOutAllocCls()); }
        return _nssBClassDtlByStockOutAllocCls;
    }

    protected BClassDtlNss _nssBClassDtlByStockOutInstCxlFlg;
    public BClassDtlNss xdfgetNssBClassDtlByStockOutInstCxlFlg() {
        if (_nssBClassDtlByStockOutInstCxlFlg == null) { _nssBClassDtlByStockOutInstCxlFlg = new BClassDtlNss(null); }
        return _nssBClassDtlByStockOutInstCxlFlg;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my STOCK_OUT_INST_CXL_FLG, named 'BClassDtlByStockOutInstCxlFlg'.
     * <pre>
     * <span style="color: #0000C0">mParamBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByStockOutInstCxlFlg()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mParam</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mParam</span>.<span style="color: #CC4747">getBClassDtlByStockOutInstCxlFlg()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByStockOutInstCxlFlg() {
        assertSetupSelectPurpose("bClassDtlByStockOutInstCxlFlg");
        if (hasSpecifiedLocalColumn()) {
            specify().columnStockOutInstCxlFlg();
        }
        doSetupSelect(() -> query().queryBClassDtlByStockOutInstCxlFlg());
        if (_nssBClassDtlByStockOutInstCxlFlg == null || !_nssBClassDtlByStockOutInstCxlFlg.hasConditionQuery())
        { _nssBClassDtlByStockOutInstCxlFlg = new BClassDtlNss(query().queryBClassDtlByStockOutInstCxlFlg()); }
        return _nssBClassDtlByStockOutInstCxlFlg;
    }

    protected BClassDtlNss _nssBClassDtlByStockOutInstSplitFlg;
    public BClassDtlNss xdfgetNssBClassDtlByStockOutInstSplitFlg() {
        if (_nssBClassDtlByStockOutInstSplitFlg == null) { _nssBClassDtlByStockOutInstSplitFlg = new BClassDtlNss(null); }
        return _nssBClassDtlByStockOutInstSplitFlg;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my STOCK_OUT_INST_SPLIT_FLG, named 'BClassDtlByStockOutInstSplitFlg'.
     * <pre>
     * <span style="color: #0000C0">mParamBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByStockOutInstSplitFlg()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mParam</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mParam</span>.<span style="color: #CC4747">getBClassDtlByStockOutInstSplitFlg()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByStockOutInstSplitFlg() {
        assertSetupSelectPurpose("bClassDtlByStockOutInstSplitFlg");
        if (hasSpecifiedLocalColumn()) {
            specify().columnStockOutInstSplitFlg();
        }
        doSetupSelect(() -> query().queryBClassDtlByStockOutInstSplitFlg());
        if (_nssBClassDtlByStockOutInstSplitFlg == null || !_nssBClassDtlByStockOutInstSplitFlg.hasConditionQuery())
        { _nssBClassDtlByStockOutInstSplitFlg = new BClassDtlNss(query().queryBClassDtlByStockOutInstSplitFlg()); }
        return _nssBClassDtlByStockOutInstSplitFlg;
    }

    protected BClassDtlNss _nssBClassDtlByPicMthdRcmdMltPlOut;
    public BClassDtlNss xdfgetNssBClassDtlByPicMthdRcmdMltPlOut() {
        if (_nssBClassDtlByPicMthdRcmdMltPlOut == null) { _nssBClassDtlByPicMthdRcmdMltPlOut = new BClassDtlNss(null); }
        return _nssBClassDtlByPicMthdRcmdMltPlOut;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my PIC_MTHD_RCMD_MLT_PL_OUT, named 'BClassDtlByPicMthdRcmdMltPlOut'.
     * <pre>
     * <span style="color: #0000C0">mParamBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByPicMthdRcmdMltPlOut()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mParam</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mParam</span>.<span style="color: #CC4747">getBClassDtlByPicMthdRcmdMltPlOut()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByPicMthdRcmdMltPlOut() {
        assertSetupSelectPurpose("bClassDtlByPicMthdRcmdMltPlOut");
        if (hasSpecifiedLocalColumn()) {
            specify().columnPicMthdRcmdMltPlOut();
        }
        doSetupSelect(() -> query().queryBClassDtlByPicMthdRcmdMltPlOut());
        if (_nssBClassDtlByPicMthdRcmdMltPlOut == null || !_nssBClassDtlByPicMthdRcmdMltPlOut.hasConditionQuery())
        { _nssBClassDtlByPicMthdRcmdMltPlOut = new BClassDtlNss(query().queryBClassDtlByPicMthdRcmdMltPlOut()); }
        return _nssBClassDtlByPicMthdRcmdMltPlOut;
    }

    protected BClassDtlNss _nssBClassDtlByPicMthdRcmdSplSlOut;
    public BClassDtlNss xdfgetNssBClassDtlByPicMthdRcmdSplSlOut() {
        if (_nssBClassDtlByPicMthdRcmdSplSlOut == null) { _nssBClassDtlByPicMthdRcmdSplSlOut = new BClassDtlNss(null); }
        return _nssBClassDtlByPicMthdRcmdSplSlOut;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my PIC_MTHD_RCMD_SPL_SL_OUT, named 'BClassDtlByPicMthdRcmdSplSlOut'.
     * <pre>
     * <span style="color: #0000C0">mParamBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByPicMthdRcmdSplSlOut()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mParam</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mParam</span>.<span style="color: #CC4747">getBClassDtlByPicMthdRcmdSplSlOut()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByPicMthdRcmdSplSlOut() {
        assertSetupSelectPurpose("bClassDtlByPicMthdRcmdSplSlOut");
        if (hasSpecifiedLocalColumn()) {
            specify().columnPicMthdRcmdSplSlOut();
        }
        doSetupSelect(() -> query().queryBClassDtlByPicMthdRcmdSplSlOut());
        if (_nssBClassDtlByPicMthdRcmdSplSlOut == null || !_nssBClassDtlByPicMthdRcmdSplSlOut.hasConditionQuery())
        { _nssBClassDtlByPicMthdRcmdSplSlOut = new BClassDtlNss(query().queryBClassDtlByPicMthdRcmdSplSlOut()); }
        return _nssBClassDtlByPicMthdRcmdSplSlOut;
    }

    protected BClassDtlNss _nssBClassDtlByErrorSoundPlayFlg;
    public BClassDtlNss xdfgetNssBClassDtlByErrorSoundPlayFlg() {
        if (_nssBClassDtlByErrorSoundPlayFlg == null) { _nssBClassDtlByErrorSoundPlayFlg = new BClassDtlNss(null); }
        return _nssBClassDtlByErrorSoundPlayFlg;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my ERROR_SOUND_PLAY_FLG, named 'BClassDtlByErrorSoundPlayFlg'.
     * <pre>
     * <span style="color: #0000C0">mParamBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByErrorSoundPlayFlg()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mParam</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mParam</span>.<span style="color: #CC4747">getBClassDtlByErrorSoundPlayFlg()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByErrorSoundPlayFlg() {
        assertSetupSelectPurpose("bClassDtlByErrorSoundPlayFlg");
        if (hasSpecifiedLocalColumn()) {
            specify().columnErrorSoundPlayFlg();
        }
        doSetupSelect(() -> query().queryBClassDtlByErrorSoundPlayFlg());
        if (_nssBClassDtlByErrorSoundPlayFlg == null || !_nssBClassDtlByErrorSoundPlayFlg.hasConditionQuery())
        { _nssBClassDtlByErrorSoundPlayFlg = new BClassDtlNss(query().queryBClassDtlByErrorSoundPlayFlg()); }
        return _nssBClassDtlByErrorSoundPlayFlg;
    }

    protected BClassDtlNss _nssBClassDtlByWarnSoundPlayFlg;
    public BClassDtlNss xdfgetNssBClassDtlByWarnSoundPlayFlg() {
        if (_nssBClassDtlByWarnSoundPlayFlg == null) { _nssBClassDtlByWarnSoundPlayFlg = new BClassDtlNss(null); }
        return _nssBClassDtlByWarnSoundPlayFlg;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my WARN_SOUND_PLAY_FLG, named 'BClassDtlByWarnSoundPlayFlg'.
     * <pre>
     * <span style="color: #0000C0">mParamBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByWarnSoundPlayFlg()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mParam</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mParam</span>.<span style="color: #CC4747">getBClassDtlByWarnSoundPlayFlg()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByWarnSoundPlayFlg() {
        assertSetupSelectPurpose("bClassDtlByWarnSoundPlayFlg");
        if (hasSpecifiedLocalColumn()) {
            specify().columnWarnSoundPlayFlg();
        }
        doSetupSelect(() -> query().queryBClassDtlByWarnSoundPlayFlg());
        if (_nssBClassDtlByWarnSoundPlayFlg == null || !_nssBClassDtlByWarnSoundPlayFlg.hasConditionQuery())
        { _nssBClassDtlByWarnSoundPlayFlg = new BClassDtlNss(query().queryBClassDtlByWarnSoundPlayFlg()); }
        return _nssBClassDtlByWarnSoundPlayFlg;
    }

    protected BClassDtlNss _nssBClassDtlByInspSoundPlayFlg;
    public BClassDtlNss xdfgetNssBClassDtlByInspSoundPlayFlg() {
        if (_nssBClassDtlByInspSoundPlayFlg == null) { _nssBClassDtlByInspSoundPlayFlg = new BClassDtlNss(null); }
        return _nssBClassDtlByInspSoundPlayFlg;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my INSP_SOUND_PLAY_FLG, named 'BClassDtlByInspSoundPlayFlg'.
     * <pre>
     * <span style="color: #0000C0">mParamBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByInspSoundPlayFlg()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mParam</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mParam</span>.<span style="color: #CC4747">getBClassDtlByInspSoundPlayFlg()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByInspSoundPlayFlg() {
        assertSetupSelectPurpose("bClassDtlByInspSoundPlayFlg");
        if (hasSpecifiedLocalColumn()) {
            specify().columnInspSoundPlayFlg();
        }
        doSetupSelect(() -> query().queryBClassDtlByInspSoundPlayFlg());
        if (_nssBClassDtlByInspSoundPlayFlg == null || !_nssBClassDtlByInspSoundPlayFlg.hasConditionQuery())
        { _nssBClassDtlByInspSoundPlayFlg = new BClassDtlNss(query().queryBClassDtlByInspSoundPlayFlg()); }
        return _nssBClassDtlByInspSoundPlayFlg;
    }

    protected BClassDtlNss _nssBClassDtlByInspCompSoundPlayFlg;
    public BClassDtlNss xdfgetNssBClassDtlByInspCompSoundPlayFlg() {
        if (_nssBClassDtlByInspCompSoundPlayFlg == null) { _nssBClassDtlByInspCompSoundPlayFlg = new BClassDtlNss(null); }
        return _nssBClassDtlByInspCompSoundPlayFlg;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my INSP_COMP_SOUND_PLAY_FLG, named 'BClassDtlByInspCompSoundPlayFlg'.
     * <pre>
     * <span style="color: #0000C0">mParamBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByInspCompSoundPlayFlg()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mParam</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mParam</span>.<span style="color: #CC4747">getBClassDtlByInspCompSoundPlayFlg()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByInspCompSoundPlayFlg() {
        assertSetupSelectPurpose("bClassDtlByInspCompSoundPlayFlg");
        if (hasSpecifiedLocalColumn()) {
            specify().columnInspCompSoundPlayFlg();
        }
        doSetupSelect(() -> query().queryBClassDtlByInspCompSoundPlayFlg());
        if (_nssBClassDtlByInspCompSoundPlayFlg == null || !_nssBClassDtlByInspCompSoundPlayFlg.hasConditionQuery())
        { _nssBClassDtlByInspCompSoundPlayFlg = new BClassDtlNss(query().queryBClassDtlByInspCompSoundPlayFlg()); }
        return _nssBClassDtlByInspCompSoundPlayFlg;
    }

    protected BClassDtlNss _nssBClassDtlByCesIntegrationFlg;
    public BClassDtlNss xdfgetNssBClassDtlByCesIntegrationFlg() {
        if (_nssBClassDtlByCesIntegrationFlg == null) { _nssBClassDtlByCesIntegrationFlg = new BClassDtlNss(null); }
        return _nssBClassDtlByCesIntegrationFlg;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my CES_INTEGRATION_FLG, named 'BClassDtlByCesIntegrationFlg'.
     * <pre>
     * <span style="color: #0000C0">mParamBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByCesIntegrationFlg()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mParam</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mParam</span>.<span style="color: #CC4747">getBClassDtlByCesIntegrationFlg()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByCesIntegrationFlg() {
        assertSetupSelectPurpose("bClassDtlByCesIntegrationFlg");
        if (hasSpecifiedLocalColumn()) {
            specify().columnCesIntegrationFlg();
        }
        doSetupSelect(() -> query().queryBClassDtlByCesIntegrationFlg());
        if (_nssBClassDtlByCesIntegrationFlg == null || !_nssBClassDtlByCesIntegrationFlg.hasConditionQuery())
        { _nssBClassDtlByCesIntegrationFlg = new BClassDtlNss(query().queryBClassDtlByCesIntegrationFlg()); }
        return _nssBClassDtlByCesIntegrationFlg;
    }

    protected BClassDtlNss _nssBClassDtlByPackingSlipAutoOutputFlg;
    public BClassDtlNss xdfgetNssBClassDtlByPackingSlipAutoOutputFlg() {
        if (_nssBClassDtlByPackingSlipAutoOutputFlg == null) { _nssBClassDtlByPackingSlipAutoOutputFlg = new BClassDtlNss(null); }
        return _nssBClassDtlByPackingSlipAutoOutputFlg;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my PACKING_SLIP_AUTO_OUTPUT_FLG, named 'BClassDtlByPackingSlipAutoOutputFlg'.
     * <pre>
     * <span style="color: #0000C0">mParamBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByPackingSlipAutoOutputFlg()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mParam</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mParam</span>.<span style="color: #CC4747">getBClassDtlByPackingSlipAutoOutputFlg()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByPackingSlipAutoOutputFlg() {
        assertSetupSelectPurpose("bClassDtlByPackingSlipAutoOutputFlg");
        if (hasSpecifiedLocalColumn()) {
            specify().columnPackingSlipAutoOutputFlg();
        }
        doSetupSelect(() -> query().queryBClassDtlByPackingSlipAutoOutputFlg());
        if (_nssBClassDtlByPackingSlipAutoOutputFlg == null || !_nssBClassDtlByPackingSlipAutoOutputFlg.hasConditionQuery())
        { _nssBClassDtlByPackingSlipAutoOutputFlg = new BClassDtlNss(query().queryBClassDtlByPackingSlipAutoOutputFlg()); }
        return _nssBClassDtlByPackingSlipAutoOutputFlg;
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

    public static class HpSpecification extends HpAbstractSpecification<MParamCQ> {
        protected MClientCenterCB.HpSpecification _mClientCenter;
        protected MBoxCB.HpSpecification _mBox;
        protected MDeliveryCourseCB.HpSpecification _mDeliveryCourse;
        protected MZoneCB.HpSpecification _mZone;
        protected MBoxGrpCB.HpSpecification _mBoxGrp;
        protected BClassDtlCB.HpSpecification _bClassDtlByAfterTagOutFlg;
        protected BClassDtlCB.HpSpecification _bClassDtlByAfterDelivSlipOutFlg;
        protected BClassDtlCB.HpSpecification _bClassDtlByAfterDelivSlipOutTgt;
        protected BClassDtlCB.HpSpecification _bClassDtlBySglRowInspAfterOutCls;
        protected BClassDtlCB.HpSpecification _bClassDtlByBoxSelectSkip;
        protected BClassDtlCB.HpSpecification _bClassDtlByCasePicFlg;
        protected BClassDtlCB.HpSpecification _bClassDtlByDelFlg;
        protected BClassDtlCB.HpSpecification _bClassDtlByHtCharReadFlg;
        protected BClassDtlCB.HpSpecification _bClassDtlByMergeCls;
        protected BClassDtlCB.HpSpecification _bClassDtlByMultiPicCls;
        protected BClassDtlCB.HpSpecification _bClassDtlByOverStoreNumFlg;
        protected BClassDtlCB.HpSpecification _bClassDtlByPackingCalCls;
        protected BClassDtlCB.HpSpecification _bClassDtlByPackingProcessCls;
        protected BClassDtlCB.HpSpecification _bClassDtlByPastStoreDtFlg;
        protected BClassDtlCB.HpSpecification _bClassDtlByProductLabelJanBarcode;
        protected BClassDtlCB.HpSpecification _bClassDtlByProductLabelOutUnit;
        protected BClassDtlCB.HpSpecification _bClassDtlByProductLabelProdBarcode;
        protected BClassDtlCB.HpSpecification _bClassDtlByProductPartPacking;
        protected BClassDtlCB.HpSpecification _bClassDtlByDecimalProductPacking;
        protected BClassDtlCB.HpSpecification _bClassDtlByEmReplenishAllocCls;
        protected BClassDtlCB.HpSpecification _bClassDtlByRgReplenishUnitCls;
        protected BClassDtlCB.HpSpecification _bClassDtlByEmReplenishUnitCls;
        protected BClassDtlCB.HpSpecification _bClassDtlByResultAfterProductLabel;
        protected BClassDtlCB.HpSpecification _bClassDtlByResultAfterProductTarget;
        protected BClassDtlCB.HpSpecification _bClassDtlByStoreDtFlg;
        protected BClassDtlCB.HpSpecification _bClassDtlByStoreNoFlg;
        protected BClassDtlCB.HpSpecification _bClassDtlByTagDeliveryOutFlg;
        protected BClassDtlCB.HpSpecification _bClassDtlByUseHtShipFlg;
        protected BClassDtlCB.HpSpecification _bClassDtlByInspectionLabelOutFlg;
        protected BClassDtlCB.HpSpecification _bClassDtlBySglRowPicFlg;
        protected BClassDtlCB.HpSpecification _bClassDtlByTotalPicFlg;
        protected BClassDtlCB.HpSpecification _bClassDtlByPicMthdRcmdFlg;
        protected BClassDtlCB.HpSpecification _bClassDtlByPicMthdRcmdBreakKey;
        protected BClassDtlCB.HpSpecification _bClassDtlByAutoShipInstFlg;
        protected BClassDtlCB.HpSpecification _bClassDtlByStockOutAutoInstFlg;
        protected BClassDtlCB.HpSpecification _bClassDtlByAutoEmgSetFlg;
        protected BClassDtlCB.HpSpecification _bClassDtlByAutoEmgSetTgt;
        protected BClassDtlCB.HpSpecification _bClassDtlByStockOutAllocCls;
        protected BClassDtlCB.HpSpecification _bClassDtlByStockOutInstCxlFlg;
        protected BClassDtlCB.HpSpecification _bClassDtlByStockOutInstSplitFlg;
        protected BClassDtlCB.HpSpecification _bClassDtlByPicMthdRcmdMltPlOut;
        protected BClassDtlCB.HpSpecification _bClassDtlByPicMthdRcmdSplSlOut;
        protected BClassDtlCB.HpSpecification _bClassDtlByErrorSoundPlayFlg;
        protected BClassDtlCB.HpSpecification _bClassDtlByWarnSoundPlayFlg;
        protected BClassDtlCB.HpSpecification _bClassDtlByInspSoundPlayFlg;
        protected BClassDtlCB.HpSpecification _bClassDtlByInspCompSoundPlayFlg;
        protected BClassDtlCB.HpSpecification _bClassDtlByCesIntegrationFlg;
        protected BClassDtlCB.HpSpecification _bClassDtlByPackingSlipAutoOutputFlg;
        public HpSpecification(ConditionBean baseCB, HpSpQyCall<MParamCQ> qyCall
                             , HpCBPurpose purpose, DBMetaProvider dbmetaProvider
                             , HpSDRFunctionFactory sdrFuncFactory)
        { super(baseCB, qyCall, purpose, dbmetaProvider, sdrFuncFactory); }
        /**
         * CLIENT_CENTER_ID: {PK, ID, NotNull, bigint identity(19), FK to M_CLIENT_CENTER}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnClientCenterId() { return doColumn("CLIENT_CENTER_ID"); }
        /**
         * DELIVERY_COURSE_ID: {IX, bigint(19), FK to M_DELIVERY_COURSE}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDeliveryCourseId() { return doColumn("DELIVERY_COURSE_ID"); }
        /**
         * STORE_DT_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=StoreDtFlg}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnStoreDtFlg() { return doColumn("STORE_DT_FLG"); }
        /**
         * STORE_NO_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=StoreNoFlg}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnStoreNoFlg() { return doColumn("STORE_NO_FLG"); }
        /**
         * MERGE_CLS: {NotNull, varchar(30), default=[02], FK to B_CLASS_DTL, classification=MergeCls}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnMergeCls() { return doColumn("MERGE_CLS"); }
        /**
         * T_KEEPING_DAYS: {NotNull, bigint(19), default=[(0)]}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnTKeepingDays() { return doColumn("T_KEEPING_DAYS"); }
        /**
         * H_KEEPING_DAYS: {NotNull, bigint(19), default=[(0)]}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnHKeepingDays() { return doColumn("H_KEEPING_DAYS"); }
        /**
         * D_KEEPING_DAYS: {NotNull, bigint(19), default=[(0)]}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDKeepingDays() { return doColumn("D_KEEPING_DAYS"); }
        /**
         * OVER_STORE_NUM_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=OverStoreNumFlg}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnOverStoreNumFlg() { return doColumn("OVER_STORE_NUM_FLG"); }
        /**
         * PAST_STORE_DT_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=PastStoreDtFlg}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnPastStoreDtFlg() { return doColumn("PAST_STORE_DT_FLG"); }
        /**
         * USE_HT_SHIP_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=UseHtShipFlg}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnUseHtShipFlg() { return doColumn("USE_HT_SHIP_FLG"); }
        /**
         * ALLOC_SORT_KEY: {varchar(100)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnAllocSortKey() { return doColumn("ALLOC_SORT_KEY"); }
        /**
         * RG_REPLENISH_UNIT_CLS: {varchar(30), default=[1], FK to B_CLASS_DTL, classification=ReplenishUnitCls}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnRgReplenishUnitCls() { return doColumn("RG_REPLENISH_UNIT_CLS"); }
        /**
         * EM_REPLENISH_UNIT_CLS: {varchar(30), default=[0], FK to B_CLASS_DTL, classification=ReplenishUnitCls}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnEmReplenishUnitCls() { return doColumn("EM_REPLENISH_UNIT_CLS"); }
        /**
         * EM_REPLENISH_ZONE_ID: {IX, bigint(19), FK to M_ZONE}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnEmReplenishZoneId() { return doColumn("EM_REPLENISH_ZONE_ID"); }
        /**
         * EM_REPLENISH_ALLOC_CLS: {varchar(30), FK to B_CLASS_DTL, classification=ReplenishAllocCls}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnEmReplenishAllocCls() { return doColumn("EM_REPLENISH_ALLOC_CLS"); }
        /**
         * PACKING_CAL_CLS: {varchar(30), default=[0], FK to B_CLASS_DTL, classification=PackingCalCls}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnPackingCalCls() { return doColumn("PACKING_CAL_CLS"); }
        /**
         * PACKING_PROCESS_CLS: {varchar(30), default=[0], FK to B_CLASS_DTL, classification=PackingProcessCls}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnPackingProcessCls() { return doColumn("PACKING_PROCESS_CLS"); }
        /**
         * PRODUCT_PART_PACKING: {varchar(30), default=[0], FK to B_CLASS_DTL, classification=ProductPartPacking}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnProductPartPacking() { return doColumn("PRODUCT_PART_PACKING"); }
        /**
         * DECIMAL_PRODUCT_PACKING: {varchar(30), FK to B_CLASS_DTL, classification=DecimalProductPacking}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDecimalProductPacking() { return doColumn("DECIMAL_PRODUCT_PACKING"); }
        /**
         * PACKING_BOX_GROUP_ID: {IX, bigint(19), FK to M_BOX_GRP}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnPackingBoxGroupId() { return doColumn("PACKING_BOX_GROUP_ID"); }
        /**
         * TOTAL_PIC_FLG: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=TotalPicFlg}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnTotalPicFlg() { return doColumn("TOTAL_PIC_FLG"); }
        /**
         * MULTI_PIC_CLS: {NotNull, varchar(30), default=[0], FK to B_CLASS_DTL, classification=MultiPicCls}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnMultiPicCls() { return doColumn("MULTI_PIC_CLS"); }
        /**
         * BACKET_COL_NUM: {bigint(19), default=[(0)]}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnBacketColNum() { return doColumn("BACKET_COL_NUM"); }
        /**
         * BACKET_ROW_NUM: {bigint(19), default=[(0)]}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnBacketRowNum() { return doColumn("BACKET_ROW_NUM"); }
        /**
         * CASE_PIC_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=CasePicFlg}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCasePicFlg() { return doColumn("CASE_PIC_FLG"); }
        /**
         * SGL_ROW_PIC_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=SglRowPicFlg}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSglRowPicFlg() { return doColumn("SGL_ROW_PIC_FLG"); }
        /**
         * SGL_ROW_PIC_MAX_INST_NUM: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSglRowPicMaxInstNum() { return doColumn("SGL_ROW_PIC_MAX_INST_NUM"); }
        /**
         * PIC_MTHD_RCMD_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=PicMthdRcmdFlg}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnPicMthdRcmdFlg() { return doColumn("PIC_MTHD_RCMD_FLG"); }
        /**
         * PIC_MTHD_RCMD_BREAK_KEY: {varchar(30), FK to B_CLASS_DTL, classification=PicMthdRcmdBreakKey}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnPicMthdRcmdBreakKey() { return doColumn("PIC_MTHD_RCMD_BREAK_KEY"); }
        /**
         * PIC_MTHD_RCMD_API_KEY: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnPicMthdRcmdApiKey() { return doColumn("PIC_MTHD_RCMD_API_KEY"); }
        /**
         * PIC_MTHD_RCMD_MLT_PL_OUT: {char(1), FK to B_CLASS_DTL, classification=PicMthdRcmdListOut}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnPicMthdRcmdMltPlOut() { return doColumn("PIC_MTHD_RCMD_MLT_PL_OUT"); }
        /**
         * PIC_MTHD_RCMD_SPL_SL_OUT: {char(1), FK to B_CLASS_DTL, classification=PicMthdRcmdListOut}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnPicMthdRcmdSplSlOut() { return doColumn("PIC_MTHD_RCMD_SPL_SL_OUT"); }
        /**
         * PRODUCT_LABEL_OUT_UNIT: {char(1), FK to B_CLASS_DTL, classification=ProductLabelOutUnit}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnProductLabelOutUnit() { return doColumn("PRODUCT_LABEL_OUT_UNIT"); }
        /**
         * RESULT_AFTER_PRODUCT_LABEL: {char(1), FK to B_CLASS_DTL, classification=ResultAfterProductLabel}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnResultAfterProductLabel() { return doColumn("RESULT_AFTER_PRODUCT_LABEL"); }
        /**
         * RESULT_AFTER_PRODUCT_TARGET: {char(1), FK to B_CLASS_DTL, classification=ResultAfterProductTarget}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnResultAfterProductTarget() { return doColumn("RESULT_AFTER_PRODUCT_TARGET"); }
        /**
         * PRODUCT_LABEL_JAN_BARCODE: {varchar(30), FK to B_CLASS_DTL, classification=ProductLabelJanBarcode}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnProductLabelJanBarcode() { return doColumn("PRODUCT_LABEL_JAN_BARCODE"); }
        /**
         * PRODUCT_LABEL_PROD_BARCODE: {varchar(30), FK to B_CLASS_DTL, classification=ProductLabelProdBarcode}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnProductLabelProdBarcode() { return doColumn("PRODUCT_LABEL_PROD_BARCODE"); }
        /**
         * PRODUCT_LABEL_JAN_STARTBIT: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnProductLabelJanStartbit() { return doColumn("PRODUCT_LABEL_JAN_STARTBIT"); }
        /**
         * PRODUCT_LABEL_JAN_ENDBIT: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnProductLabelJanEndbit() { return doColumn("PRODUCT_LABEL_JAN_ENDBIT"); }
        /**
         * PRODUCT_LABEL_PROD_STARTBIT: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnProductLabelProdStartbit() { return doColumn("PRODUCT_LABEL_PROD_STARTBIT"); }
        /**
         * PRODUCT_LABEL_PROD_ENDBIT: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnProductLabelProdEndbit() { return doColumn("PRODUCT_LABEL_PROD_ENDBIT"); }
        /**
         * BOX_SELECT_SKIP: {char(1), FK to B_CLASS_DTL, classification=BoxSelectSkip}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnBoxSelectSkip() { return doColumn("BOX_SELECT_SKIP"); }
        /**
         * DEFAULT_BOX_ID: {IX, bigint(19), FK to M_BOX}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDefaultBoxId() { return doColumn("DEFAULT_BOX_ID"); }
        /**
         * ERROR_SOUND_PLAY_FLG: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=SoundPlayFlg}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnErrorSoundPlayFlg() { return doColumn("ERROR_SOUND_PLAY_FLG"); }
        /**
         * WARN_SOUND_PLAY_FLG: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=SoundPlayFlg}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnWarnSoundPlayFlg() { return doColumn("WARN_SOUND_PLAY_FLG"); }
        /**
         * INSP_SOUND_PLAY_FLG: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=SoundPlayFlg}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnInspSoundPlayFlg() { return doColumn("INSP_SOUND_PLAY_FLG"); }
        /**
         * INSP_COMP_SOUND_PLAY_FLG: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=SoundPlayFlg}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnInspCompSoundPlayFlg() { return doColumn("INSP_COMP_SOUND_PLAY_FLG"); }
        /**
         * AFTER_TAG_OUT_FLG: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=AfterTagOutFlg}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnAfterTagOutFlg() { return doColumn("AFTER_TAG_OUT_FLG"); }
        /**
         * TAG_DELIVERY_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=TagDeliveryOutFlg}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnTagDeliveryOutFlg() { return doColumn("TAG_DELIVERY_OUT_FLG"); }
        /**
         * AFTER_DELIV_SLIP_OUT_FLG: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=AfterTagOutFlg}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnAfterDelivSlipOutFlg() { return doColumn("AFTER_DELIV_SLIP_OUT_FLG"); }
        /**
         * AFTER_DELIV_SLIP_OUT_TGT: {char(1), FK to B_CLASS_DTL, classification=AfterDelivSlipOutTgt}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnAfterDelivSlipOutTgt() { return doColumn("AFTER_DELIV_SLIP_OUT_TGT"); }
        /**
         * SGL_ROW_INSP_AFTER_OUT_CLS: {varchar(30), FK to B_CLASS_DTL, classification=SglRowInspAfterOutCls}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSglRowInspAfterOutCls() { return doColumn("SGL_ROW_INSP_AFTER_OUT_CLS"); }
        /**
         * HT_CHAR_READ_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=HtCharReadFlg}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnHtCharReadFlg() { return doColumn("HT_CHAR_READ_FLG"); }
        /**
         * HT_LOT_INPUT_TYPE: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnHtLotInputType() { return doColumn("HT_LOT_INPUT_TYPE"); }
        /**
         * HT_SERIAL_INPUT_TYPE: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnHtSerialInputType() { return doColumn("HT_SERIAL_INPUT_TYPE"); }
        /**
         * INSPECTION_LABEL_OUT_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=InspectionLabelOutFlg}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnInspectionLabelOutFlg() { return doColumn("INSPECTION_LABEL_OUT_FLG"); }
        /**
         * AUTO_SHIP_INST_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=AutoShipInstFlg}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnAutoShipInstFlg() { return doColumn("AUTO_SHIP_INST_FLG"); }
        /**
         * STOCK_OUT_AUTO_INST_FLG: {char(1), FK to B_CLASS_DTL, classification=StockOutAutoInstFlg}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnStockOutAutoInstFlg() { return doColumn("STOCK_OUT_AUTO_INST_FLG"); }
        /**
         * AUTO_EMG_SET_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=AutoEmgSetFlg}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnAutoEmgSetFlg() { return doColumn("AUTO_EMG_SET_FLG"); }
        /**
         * AUTO_EMG_SET_TGT: {varchar(30), FK to B_CLASS_DTL, classification=AutoEmgSetTgt}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnAutoEmgSetTgt() { return doColumn("AUTO_EMG_SET_TGT"); }
        /**
         * AUTO_EMG_SET_MINUTE: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnAutoEmgSetMinute() { return doColumn("AUTO_EMG_SET_MINUTE"); }
        /**
         * STOCK_OUT_INST_CXL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=StockOutInstCxlFlg}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnStockOutInstCxlFlg() { return doColumn("STOCK_OUT_INST_CXL_FLG"); }
        /**
         * STOCK_OUT_ALLOC_CLS: {varchar(30), default=[0], FK to B_CLASS_DTL, classification=StockOutAllocCls}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnStockOutAllocCls() { return doColumn("STOCK_OUT_ALLOC_CLS"); }
        /**
         * STOCK_OUT_INST_SPLIT_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=StockOutInstSplitFlg}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnStockOutInstSplitFlg() { return doColumn("STOCK_OUT_INST_SPLIT_FLG"); }
        /**
         * CES_INTEGRATION_FLG: {char(1), FK to B_CLASS_DTL, classification=CesIntegrationFlg}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCesIntegrationFlg() { return doColumn("CES_INTEGRATION_FLG"); }
        /**
         * PACKING_SLIP_AUTO_OUTPUT_FLG: {char(1), FK to B_CLASS_DTL, classification=PackingSlipAutoOutputFlg}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnPackingSlipAutoOutputFlg() { return doColumn("PACKING_SLIP_AUTO_OUTPUT_FLG"); }
        /**
         * CENTER_KBN: {NotNull, char(1), default=[0]}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCenterKbn() { return doColumn("CENTER_KBN"); }
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
            columnClientCenterId(); // PK
            if (qyCall().qy().hasConditionQueryMBox()
                    || qyCall().qy().xgetReferrerQuery() instanceof MBoxCQ) {
                columnDefaultBoxId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryMDeliveryCourse()
                    || qyCall().qy().xgetReferrerQuery() instanceof MDeliveryCourseCQ) {
                columnDeliveryCourseId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryMZone()
                    || qyCall().qy().xgetReferrerQuery() instanceof MZoneCQ) {
                columnEmReplenishZoneId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryMBoxGrp()
                    || qyCall().qy().xgetReferrerQuery() instanceof MBoxGrpCQ) {
                columnPackingBoxGroupId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByAfterTagOutFlg()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnAfterTagOutFlg(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByAfterDelivSlipOutFlg()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnAfterDelivSlipOutFlg(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByAfterDelivSlipOutTgt()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnAfterDelivSlipOutTgt(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlBySglRowInspAfterOutCls()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnSglRowInspAfterOutCls(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByBoxSelectSkip()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnBoxSelectSkip(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByCasePicFlg()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnCasePicFlg(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByDelFlg()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnDelFlg(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByHtCharReadFlg()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnHtCharReadFlg(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByMergeCls()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnMergeCls(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByMultiPicCls()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnMultiPicCls(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByOverStoreNumFlg()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnOverStoreNumFlg(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByPackingCalCls()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnPackingCalCls(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByPackingProcessCls()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnPackingProcessCls(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByPastStoreDtFlg()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnPastStoreDtFlg(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByProductLabelJanBarcode()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnProductLabelJanBarcode(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByProductLabelOutUnit()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnProductLabelOutUnit(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByProductLabelProdBarcode()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnProductLabelProdBarcode(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByProductPartPacking()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnProductPartPacking(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByDecimalProductPacking()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnDecimalProductPacking(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByEmReplenishAllocCls()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnEmReplenishAllocCls(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByRgReplenishUnitCls()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnRgReplenishUnitCls(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByEmReplenishUnitCls()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnEmReplenishUnitCls(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByResultAfterProductLabel()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnResultAfterProductLabel(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByResultAfterProductTarget()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnResultAfterProductTarget(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByStoreDtFlg()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnStoreDtFlg(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByStoreNoFlg()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnStoreNoFlg(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByTagDeliveryOutFlg()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnTagDeliveryOutFlg(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByUseHtShipFlg()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnUseHtShipFlg(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByInspectionLabelOutFlg()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnInspectionLabelOutFlg(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlBySglRowPicFlg()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnSglRowPicFlg(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByTotalPicFlg()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnTotalPicFlg(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByPicMthdRcmdFlg()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnPicMthdRcmdFlg(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByPicMthdRcmdBreakKey()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnPicMthdRcmdBreakKey(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByAutoShipInstFlg()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnAutoShipInstFlg(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByStockOutAutoInstFlg()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnStockOutAutoInstFlg(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByAutoEmgSetFlg()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnAutoEmgSetFlg(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByAutoEmgSetTgt()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnAutoEmgSetTgt(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByStockOutAllocCls()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnStockOutAllocCls(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByStockOutInstCxlFlg()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnStockOutInstCxlFlg(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByStockOutInstSplitFlg()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnStockOutInstSplitFlg(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByPicMthdRcmdMltPlOut()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnPicMthdRcmdMltPlOut(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByPicMthdRcmdSplSlOut()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnPicMthdRcmdSplSlOut(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByErrorSoundPlayFlg()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnErrorSoundPlayFlg(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByWarnSoundPlayFlg()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnWarnSoundPlayFlg(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByInspSoundPlayFlg()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnInspSoundPlayFlg(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByInspCompSoundPlayFlg()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnInspCompSoundPlayFlg(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByCesIntegrationFlg()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnCesIntegrationFlg(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByPackingSlipAutoOutputFlg()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnPackingSlipAutoOutputFlg(); // FK or one-to-one referrer
            }
        }
        @Override
        protected String getTableDbName() { return "M_PARAM"; }
        /**
         * Prepare to specify functions about relation table. <br>
         * M_CLIENT_CENTER by my CLIENT_CENTER_ID, named 'MClientCenter'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MClientCenterCB.HpSpecification specifyMClientCenter() {
            assertRelation("mClientCenter");
            if (_mClientCenter == null) {
                _mClientCenter = new MClientCenterCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryMClientCenter()
                                    , () -> _qyCall.qy().queryMClientCenter())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _mClientCenter.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMClientCenter()
                      , () -> xsyncQyCall().qy().queryMClientCenter()));
                }
            }
            return _mClientCenter;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * M_BOX by my DEFAULT_BOX_ID, named 'MBox'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MBoxCB.HpSpecification specifyMBox() {
            assertRelation("mBox");
            if (_mBox == null) {
                _mBox = new MBoxCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryMBox()
                                    , () -> _qyCall.qy().queryMBox())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _mBox.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMBox()
                      , () -> xsyncQyCall().qy().queryMBox()));
                }
            }
            return _mBox;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * M_DELIVERY_COURSE by my DELIVERY_COURSE_ID, named 'MDeliveryCourse'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MDeliveryCourseCB.HpSpecification specifyMDeliveryCourse() {
            assertRelation("mDeliveryCourse");
            if (_mDeliveryCourse == null) {
                _mDeliveryCourse = new MDeliveryCourseCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryMDeliveryCourse()
                                    , () -> _qyCall.qy().queryMDeliveryCourse())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _mDeliveryCourse.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMDeliveryCourse()
                      , () -> xsyncQyCall().qy().queryMDeliveryCourse()));
                }
            }
            return _mDeliveryCourse;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * M_ZONE by my EM_REPLENISH_ZONE_ID, named 'MZone'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MZoneCB.HpSpecification specifyMZone() {
            assertRelation("mZone");
            if (_mZone == null) {
                _mZone = new MZoneCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryMZone()
                                    , () -> _qyCall.qy().queryMZone())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _mZone.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMZone()
                      , () -> xsyncQyCall().qy().queryMZone()));
                }
            }
            return _mZone;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * M_BOX_GRP by my PACKING_BOX_GROUP_ID, named 'MBoxGrp'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MBoxGrpCB.HpSpecification specifyMBoxGrp() {
            assertRelation("mBoxGrp");
            if (_mBoxGrp == null) {
                _mBoxGrp = new MBoxGrpCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryMBoxGrp()
                                    , () -> _qyCall.qy().queryMBoxGrp())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _mBoxGrp.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMBoxGrp()
                      , () -> xsyncQyCall().qy().queryMBoxGrp()));
                }
            }
            return _mBoxGrp;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_CLASS_DTL by my AFTER_TAG_OUT_FLG, named 'BClassDtlByAfterTagOutFlg'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByAfterTagOutFlg() {
            assertRelation("bClassDtlByAfterTagOutFlg");
            if (_bClassDtlByAfterTagOutFlg == null) {
                _bClassDtlByAfterTagOutFlg = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByAfterTagOutFlg()
                                    , () -> _qyCall.qy().queryBClassDtlByAfterTagOutFlg())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByAfterTagOutFlg.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByAfterTagOutFlg()
                      , () -> xsyncQyCall().qy().queryBClassDtlByAfterTagOutFlg()));
                }
            }
            return _bClassDtlByAfterTagOutFlg;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_CLASS_DTL by my AFTER_DELIV_SLIP_OUT_FLG, named 'BClassDtlByAfterDelivSlipOutFlg'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByAfterDelivSlipOutFlg() {
            assertRelation("bClassDtlByAfterDelivSlipOutFlg");
            if (_bClassDtlByAfterDelivSlipOutFlg == null) {
                _bClassDtlByAfterDelivSlipOutFlg = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByAfterDelivSlipOutFlg()
                                    , () -> _qyCall.qy().queryBClassDtlByAfterDelivSlipOutFlg())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByAfterDelivSlipOutFlg.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByAfterDelivSlipOutFlg()
                      , () -> xsyncQyCall().qy().queryBClassDtlByAfterDelivSlipOutFlg()));
                }
            }
            return _bClassDtlByAfterDelivSlipOutFlg;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_CLASS_DTL by my AFTER_DELIV_SLIP_OUT_TGT, named 'BClassDtlByAfterDelivSlipOutTgt'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByAfterDelivSlipOutTgt() {
            assertRelation("bClassDtlByAfterDelivSlipOutTgt");
            if (_bClassDtlByAfterDelivSlipOutTgt == null) {
                _bClassDtlByAfterDelivSlipOutTgt = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByAfterDelivSlipOutTgt()
                                    , () -> _qyCall.qy().queryBClassDtlByAfterDelivSlipOutTgt())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByAfterDelivSlipOutTgt.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByAfterDelivSlipOutTgt()
                      , () -> xsyncQyCall().qy().queryBClassDtlByAfterDelivSlipOutTgt()));
                }
            }
            return _bClassDtlByAfterDelivSlipOutTgt;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_CLASS_DTL by my SGL_ROW_INSP_AFTER_OUT_CLS, named 'BClassDtlBySglRowInspAfterOutCls'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlBySglRowInspAfterOutCls() {
            assertRelation("bClassDtlBySglRowInspAfterOutCls");
            if (_bClassDtlBySglRowInspAfterOutCls == null) {
                _bClassDtlBySglRowInspAfterOutCls = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlBySglRowInspAfterOutCls()
                                    , () -> _qyCall.qy().queryBClassDtlBySglRowInspAfterOutCls())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlBySglRowInspAfterOutCls.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlBySglRowInspAfterOutCls()
                      , () -> xsyncQyCall().qy().queryBClassDtlBySglRowInspAfterOutCls()));
                }
            }
            return _bClassDtlBySglRowInspAfterOutCls;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_CLASS_DTL by my BOX_SELECT_SKIP, named 'BClassDtlByBoxSelectSkip'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByBoxSelectSkip() {
            assertRelation("bClassDtlByBoxSelectSkip");
            if (_bClassDtlByBoxSelectSkip == null) {
                _bClassDtlByBoxSelectSkip = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByBoxSelectSkip()
                                    , () -> _qyCall.qy().queryBClassDtlByBoxSelectSkip())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByBoxSelectSkip.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByBoxSelectSkip()
                      , () -> xsyncQyCall().qy().queryBClassDtlByBoxSelectSkip()));
                }
            }
            return _bClassDtlByBoxSelectSkip;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_CLASS_DTL by my CASE_PIC_FLG, named 'BClassDtlByCasePicFlg'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByCasePicFlg() {
            assertRelation("bClassDtlByCasePicFlg");
            if (_bClassDtlByCasePicFlg == null) {
                _bClassDtlByCasePicFlg = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByCasePicFlg()
                                    , () -> _qyCall.qy().queryBClassDtlByCasePicFlg())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByCasePicFlg.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByCasePicFlg()
                      , () -> xsyncQyCall().qy().queryBClassDtlByCasePicFlg()));
                }
            }
            return _bClassDtlByCasePicFlg;
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
         * B_CLASS_DTL by my HT_CHAR_READ_FLG, named 'BClassDtlByHtCharReadFlg'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByHtCharReadFlg() {
            assertRelation("bClassDtlByHtCharReadFlg");
            if (_bClassDtlByHtCharReadFlg == null) {
                _bClassDtlByHtCharReadFlg = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByHtCharReadFlg()
                                    , () -> _qyCall.qy().queryBClassDtlByHtCharReadFlg())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByHtCharReadFlg.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByHtCharReadFlg()
                      , () -> xsyncQyCall().qy().queryBClassDtlByHtCharReadFlg()));
                }
            }
            return _bClassDtlByHtCharReadFlg;
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
         * B_CLASS_DTL by my MULTI_PIC_CLS, named 'BClassDtlByMultiPicCls'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByMultiPicCls() {
            assertRelation("bClassDtlByMultiPicCls");
            if (_bClassDtlByMultiPicCls == null) {
                _bClassDtlByMultiPicCls = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByMultiPicCls()
                                    , () -> _qyCall.qy().queryBClassDtlByMultiPicCls())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByMultiPicCls.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByMultiPicCls()
                      , () -> xsyncQyCall().qy().queryBClassDtlByMultiPicCls()));
                }
            }
            return _bClassDtlByMultiPicCls;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_CLASS_DTL by my OVER_STORE_NUM_FLG, named 'BClassDtlByOverStoreNumFlg'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByOverStoreNumFlg() {
            assertRelation("bClassDtlByOverStoreNumFlg");
            if (_bClassDtlByOverStoreNumFlg == null) {
                _bClassDtlByOverStoreNumFlg = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByOverStoreNumFlg()
                                    , () -> _qyCall.qy().queryBClassDtlByOverStoreNumFlg())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByOverStoreNumFlg.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByOverStoreNumFlg()
                      , () -> xsyncQyCall().qy().queryBClassDtlByOverStoreNumFlg()));
                }
            }
            return _bClassDtlByOverStoreNumFlg;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_CLASS_DTL by my PACKING_CAL_CLS, named 'BClassDtlByPackingCalCls'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByPackingCalCls() {
            assertRelation("bClassDtlByPackingCalCls");
            if (_bClassDtlByPackingCalCls == null) {
                _bClassDtlByPackingCalCls = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByPackingCalCls()
                                    , () -> _qyCall.qy().queryBClassDtlByPackingCalCls())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByPackingCalCls.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByPackingCalCls()
                      , () -> xsyncQyCall().qy().queryBClassDtlByPackingCalCls()));
                }
            }
            return _bClassDtlByPackingCalCls;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_CLASS_DTL by my PACKING_PROCESS_CLS, named 'BClassDtlByPackingProcessCls'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByPackingProcessCls() {
            assertRelation("bClassDtlByPackingProcessCls");
            if (_bClassDtlByPackingProcessCls == null) {
                _bClassDtlByPackingProcessCls = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByPackingProcessCls()
                                    , () -> _qyCall.qy().queryBClassDtlByPackingProcessCls())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByPackingProcessCls.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByPackingProcessCls()
                      , () -> xsyncQyCall().qy().queryBClassDtlByPackingProcessCls()));
                }
            }
            return _bClassDtlByPackingProcessCls;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_CLASS_DTL by my PAST_STORE_DT_FLG, named 'BClassDtlByPastStoreDtFlg'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByPastStoreDtFlg() {
            assertRelation("bClassDtlByPastStoreDtFlg");
            if (_bClassDtlByPastStoreDtFlg == null) {
                _bClassDtlByPastStoreDtFlg = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByPastStoreDtFlg()
                                    , () -> _qyCall.qy().queryBClassDtlByPastStoreDtFlg())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByPastStoreDtFlg.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByPastStoreDtFlg()
                      , () -> xsyncQyCall().qy().queryBClassDtlByPastStoreDtFlg()));
                }
            }
            return _bClassDtlByPastStoreDtFlg;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_CLASS_DTL by my PRODUCT_LABEL_JAN_BARCODE, named 'BClassDtlByProductLabelJanBarcode'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByProductLabelJanBarcode() {
            assertRelation("bClassDtlByProductLabelJanBarcode");
            if (_bClassDtlByProductLabelJanBarcode == null) {
                _bClassDtlByProductLabelJanBarcode = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByProductLabelJanBarcode()
                                    , () -> _qyCall.qy().queryBClassDtlByProductLabelJanBarcode())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByProductLabelJanBarcode.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByProductLabelJanBarcode()
                      , () -> xsyncQyCall().qy().queryBClassDtlByProductLabelJanBarcode()));
                }
            }
            return _bClassDtlByProductLabelJanBarcode;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_CLASS_DTL by my PRODUCT_LABEL_OUT_UNIT, named 'BClassDtlByProductLabelOutUnit'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByProductLabelOutUnit() {
            assertRelation("bClassDtlByProductLabelOutUnit");
            if (_bClassDtlByProductLabelOutUnit == null) {
                _bClassDtlByProductLabelOutUnit = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByProductLabelOutUnit()
                                    , () -> _qyCall.qy().queryBClassDtlByProductLabelOutUnit())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByProductLabelOutUnit.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByProductLabelOutUnit()
                      , () -> xsyncQyCall().qy().queryBClassDtlByProductLabelOutUnit()));
                }
            }
            return _bClassDtlByProductLabelOutUnit;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_CLASS_DTL by my PRODUCT_LABEL_PROD_BARCODE, named 'BClassDtlByProductLabelProdBarcode'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByProductLabelProdBarcode() {
            assertRelation("bClassDtlByProductLabelProdBarcode");
            if (_bClassDtlByProductLabelProdBarcode == null) {
                _bClassDtlByProductLabelProdBarcode = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByProductLabelProdBarcode()
                                    , () -> _qyCall.qy().queryBClassDtlByProductLabelProdBarcode())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByProductLabelProdBarcode.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByProductLabelProdBarcode()
                      , () -> xsyncQyCall().qy().queryBClassDtlByProductLabelProdBarcode()));
                }
            }
            return _bClassDtlByProductLabelProdBarcode;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_CLASS_DTL by my PRODUCT_PART_PACKING, named 'BClassDtlByProductPartPacking'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByProductPartPacking() {
            assertRelation("bClassDtlByProductPartPacking");
            if (_bClassDtlByProductPartPacking == null) {
                _bClassDtlByProductPartPacking = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByProductPartPacking()
                                    , () -> _qyCall.qy().queryBClassDtlByProductPartPacking())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByProductPartPacking.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByProductPartPacking()
                      , () -> xsyncQyCall().qy().queryBClassDtlByProductPartPacking()));
                }
            }
            return _bClassDtlByProductPartPacking;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_CLASS_DTL by my DECIMAL_PRODUCT_PACKING, named 'BClassDtlByDecimalProductPacking'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByDecimalProductPacking() {
            assertRelation("bClassDtlByDecimalProductPacking");
            if (_bClassDtlByDecimalProductPacking == null) {
                _bClassDtlByDecimalProductPacking = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByDecimalProductPacking()
                                    , () -> _qyCall.qy().queryBClassDtlByDecimalProductPacking())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByDecimalProductPacking.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByDecimalProductPacking()
                      , () -> xsyncQyCall().qy().queryBClassDtlByDecimalProductPacking()));
                }
            }
            return _bClassDtlByDecimalProductPacking;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_CLASS_DTL by my EM_REPLENISH_ALLOC_CLS, named 'BClassDtlByEmReplenishAllocCls'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByEmReplenishAllocCls() {
            assertRelation("bClassDtlByEmReplenishAllocCls");
            if (_bClassDtlByEmReplenishAllocCls == null) {
                _bClassDtlByEmReplenishAllocCls = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByEmReplenishAllocCls()
                                    , () -> _qyCall.qy().queryBClassDtlByEmReplenishAllocCls())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByEmReplenishAllocCls.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByEmReplenishAllocCls()
                      , () -> xsyncQyCall().qy().queryBClassDtlByEmReplenishAllocCls()));
                }
            }
            return _bClassDtlByEmReplenishAllocCls;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_CLASS_DTL by my RG_REPLENISH_UNIT_CLS, named 'BClassDtlByRgReplenishUnitCls'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByRgReplenishUnitCls() {
            assertRelation("bClassDtlByRgReplenishUnitCls");
            if (_bClassDtlByRgReplenishUnitCls == null) {
                _bClassDtlByRgReplenishUnitCls = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByRgReplenishUnitCls()
                                    , () -> _qyCall.qy().queryBClassDtlByRgReplenishUnitCls())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByRgReplenishUnitCls.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByRgReplenishUnitCls()
                      , () -> xsyncQyCall().qy().queryBClassDtlByRgReplenishUnitCls()));
                }
            }
            return _bClassDtlByRgReplenishUnitCls;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_CLASS_DTL by my EM_REPLENISH_UNIT_CLS, named 'BClassDtlByEmReplenishUnitCls'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByEmReplenishUnitCls() {
            assertRelation("bClassDtlByEmReplenishUnitCls");
            if (_bClassDtlByEmReplenishUnitCls == null) {
                _bClassDtlByEmReplenishUnitCls = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByEmReplenishUnitCls()
                                    , () -> _qyCall.qy().queryBClassDtlByEmReplenishUnitCls())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByEmReplenishUnitCls.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByEmReplenishUnitCls()
                      , () -> xsyncQyCall().qy().queryBClassDtlByEmReplenishUnitCls()));
                }
            }
            return _bClassDtlByEmReplenishUnitCls;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_CLASS_DTL by my RESULT_AFTER_PRODUCT_LABEL, named 'BClassDtlByResultAfterProductLabel'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByResultAfterProductLabel() {
            assertRelation("bClassDtlByResultAfterProductLabel");
            if (_bClassDtlByResultAfterProductLabel == null) {
                _bClassDtlByResultAfterProductLabel = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByResultAfterProductLabel()
                                    , () -> _qyCall.qy().queryBClassDtlByResultAfterProductLabel())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByResultAfterProductLabel.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByResultAfterProductLabel()
                      , () -> xsyncQyCall().qy().queryBClassDtlByResultAfterProductLabel()));
                }
            }
            return _bClassDtlByResultAfterProductLabel;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_CLASS_DTL by my RESULT_AFTER_PRODUCT_TARGET, named 'BClassDtlByResultAfterProductTarget'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByResultAfterProductTarget() {
            assertRelation("bClassDtlByResultAfterProductTarget");
            if (_bClassDtlByResultAfterProductTarget == null) {
                _bClassDtlByResultAfterProductTarget = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByResultAfterProductTarget()
                                    , () -> _qyCall.qy().queryBClassDtlByResultAfterProductTarget())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByResultAfterProductTarget.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByResultAfterProductTarget()
                      , () -> xsyncQyCall().qy().queryBClassDtlByResultAfterProductTarget()));
                }
            }
            return _bClassDtlByResultAfterProductTarget;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_CLASS_DTL by my STORE_DT_FLG, named 'BClassDtlByStoreDtFlg'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByStoreDtFlg() {
            assertRelation("bClassDtlByStoreDtFlg");
            if (_bClassDtlByStoreDtFlg == null) {
                _bClassDtlByStoreDtFlg = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByStoreDtFlg()
                                    , () -> _qyCall.qy().queryBClassDtlByStoreDtFlg())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByStoreDtFlg.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByStoreDtFlg()
                      , () -> xsyncQyCall().qy().queryBClassDtlByStoreDtFlg()));
                }
            }
            return _bClassDtlByStoreDtFlg;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_CLASS_DTL by my STORE_NO_FLG, named 'BClassDtlByStoreNoFlg'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByStoreNoFlg() {
            assertRelation("bClassDtlByStoreNoFlg");
            if (_bClassDtlByStoreNoFlg == null) {
                _bClassDtlByStoreNoFlg = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByStoreNoFlg()
                                    , () -> _qyCall.qy().queryBClassDtlByStoreNoFlg())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByStoreNoFlg.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByStoreNoFlg()
                      , () -> xsyncQyCall().qy().queryBClassDtlByStoreNoFlg()));
                }
            }
            return _bClassDtlByStoreNoFlg;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_CLASS_DTL by my TAG_DELIVERY_OUT_FLG, named 'BClassDtlByTagDeliveryOutFlg'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByTagDeliveryOutFlg() {
            assertRelation("bClassDtlByTagDeliveryOutFlg");
            if (_bClassDtlByTagDeliveryOutFlg == null) {
                _bClassDtlByTagDeliveryOutFlg = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByTagDeliveryOutFlg()
                                    , () -> _qyCall.qy().queryBClassDtlByTagDeliveryOutFlg())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByTagDeliveryOutFlg.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByTagDeliveryOutFlg()
                      , () -> xsyncQyCall().qy().queryBClassDtlByTagDeliveryOutFlg()));
                }
            }
            return _bClassDtlByTagDeliveryOutFlg;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_CLASS_DTL by my USE_HT_SHIP_FLG, named 'BClassDtlByUseHtShipFlg'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByUseHtShipFlg() {
            assertRelation("bClassDtlByUseHtShipFlg");
            if (_bClassDtlByUseHtShipFlg == null) {
                _bClassDtlByUseHtShipFlg = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByUseHtShipFlg()
                                    , () -> _qyCall.qy().queryBClassDtlByUseHtShipFlg())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByUseHtShipFlg.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByUseHtShipFlg()
                      , () -> xsyncQyCall().qy().queryBClassDtlByUseHtShipFlg()));
                }
            }
            return _bClassDtlByUseHtShipFlg;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_CLASS_DTL by my INSPECTION_LABEL_OUT_FLG, named 'BClassDtlByInspectionLabelOutFlg'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByInspectionLabelOutFlg() {
            assertRelation("bClassDtlByInspectionLabelOutFlg");
            if (_bClassDtlByInspectionLabelOutFlg == null) {
                _bClassDtlByInspectionLabelOutFlg = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByInspectionLabelOutFlg()
                                    , () -> _qyCall.qy().queryBClassDtlByInspectionLabelOutFlg())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByInspectionLabelOutFlg.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByInspectionLabelOutFlg()
                      , () -> xsyncQyCall().qy().queryBClassDtlByInspectionLabelOutFlg()));
                }
            }
            return _bClassDtlByInspectionLabelOutFlg;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_CLASS_DTL by my SGL_ROW_PIC_FLG, named 'BClassDtlBySglRowPicFlg'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlBySglRowPicFlg() {
            assertRelation("bClassDtlBySglRowPicFlg");
            if (_bClassDtlBySglRowPicFlg == null) {
                _bClassDtlBySglRowPicFlg = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlBySglRowPicFlg()
                                    , () -> _qyCall.qy().queryBClassDtlBySglRowPicFlg())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlBySglRowPicFlg.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlBySglRowPicFlg()
                      , () -> xsyncQyCall().qy().queryBClassDtlBySglRowPicFlg()));
                }
            }
            return _bClassDtlBySglRowPicFlg;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_CLASS_DTL by my TOTAL_PIC_FLG, named 'BClassDtlByTotalPicFlg'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByTotalPicFlg() {
            assertRelation("bClassDtlByTotalPicFlg");
            if (_bClassDtlByTotalPicFlg == null) {
                _bClassDtlByTotalPicFlg = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByTotalPicFlg()
                                    , () -> _qyCall.qy().queryBClassDtlByTotalPicFlg())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByTotalPicFlg.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByTotalPicFlg()
                      , () -> xsyncQyCall().qy().queryBClassDtlByTotalPicFlg()));
                }
            }
            return _bClassDtlByTotalPicFlg;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_CLASS_DTL by my PIC_MTHD_RCMD_FLG, named 'BClassDtlByPicMthdRcmdFlg'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByPicMthdRcmdFlg() {
            assertRelation("bClassDtlByPicMthdRcmdFlg");
            if (_bClassDtlByPicMthdRcmdFlg == null) {
                _bClassDtlByPicMthdRcmdFlg = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByPicMthdRcmdFlg()
                                    , () -> _qyCall.qy().queryBClassDtlByPicMthdRcmdFlg())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByPicMthdRcmdFlg.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByPicMthdRcmdFlg()
                      , () -> xsyncQyCall().qy().queryBClassDtlByPicMthdRcmdFlg()));
                }
            }
            return _bClassDtlByPicMthdRcmdFlg;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_CLASS_DTL by my PIC_MTHD_RCMD_BREAK_KEY, named 'BClassDtlByPicMthdRcmdBreakKey'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByPicMthdRcmdBreakKey() {
            assertRelation("bClassDtlByPicMthdRcmdBreakKey");
            if (_bClassDtlByPicMthdRcmdBreakKey == null) {
                _bClassDtlByPicMthdRcmdBreakKey = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByPicMthdRcmdBreakKey()
                                    , () -> _qyCall.qy().queryBClassDtlByPicMthdRcmdBreakKey())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByPicMthdRcmdBreakKey.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByPicMthdRcmdBreakKey()
                      , () -> xsyncQyCall().qy().queryBClassDtlByPicMthdRcmdBreakKey()));
                }
            }
            return _bClassDtlByPicMthdRcmdBreakKey;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_CLASS_DTL by my AUTO_SHIP_INST_FLG, named 'BClassDtlByAutoShipInstFlg'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByAutoShipInstFlg() {
            assertRelation("bClassDtlByAutoShipInstFlg");
            if (_bClassDtlByAutoShipInstFlg == null) {
                _bClassDtlByAutoShipInstFlg = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByAutoShipInstFlg()
                                    , () -> _qyCall.qy().queryBClassDtlByAutoShipInstFlg())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByAutoShipInstFlg.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByAutoShipInstFlg()
                      , () -> xsyncQyCall().qy().queryBClassDtlByAutoShipInstFlg()));
                }
            }
            return _bClassDtlByAutoShipInstFlg;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_CLASS_DTL by my STOCK_OUT_AUTO_INST_FLG, named 'BClassDtlByStockOutAutoInstFlg'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByStockOutAutoInstFlg() {
            assertRelation("bClassDtlByStockOutAutoInstFlg");
            if (_bClassDtlByStockOutAutoInstFlg == null) {
                _bClassDtlByStockOutAutoInstFlg = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByStockOutAutoInstFlg()
                                    , () -> _qyCall.qy().queryBClassDtlByStockOutAutoInstFlg())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByStockOutAutoInstFlg.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByStockOutAutoInstFlg()
                      , () -> xsyncQyCall().qy().queryBClassDtlByStockOutAutoInstFlg()));
                }
            }
            return _bClassDtlByStockOutAutoInstFlg;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_CLASS_DTL by my AUTO_EMG_SET_FLG, named 'BClassDtlByAutoEmgSetFlg'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByAutoEmgSetFlg() {
            assertRelation("bClassDtlByAutoEmgSetFlg");
            if (_bClassDtlByAutoEmgSetFlg == null) {
                _bClassDtlByAutoEmgSetFlg = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByAutoEmgSetFlg()
                                    , () -> _qyCall.qy().queryBClassDtlByAutoEmgSetFlg())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByAutoEmgSetFlg.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByAutoEmgSetFlg()
                      , () -> xsyncQyCall().qy().queryBClassDtlByAutoEmgSetFlg()));
                }
            }
            return _bClassDtlByAutoEmgSetFlg;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_CLASS_DTL by my AUTO_EMG_SET_TGT, named 'BClassDtlByAutoEmgSetTgt'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByAutoEmgSetTgt() {
            assertRelation("bClassDtlByAutoEmgSetTgt");
            if (_bClassDtlByAutoEmgSetTgt == null) {
                _bClassDtlByAutoEmgSetTgt = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByAutoEmgSetTgt()
                                    , () -> _qyCall.qy().queryBClassDtlByAutoEmgSetTgt())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByAutoEmgSetTgt.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByAutoEmgSetTgt()
                      , () -> xsyncQyCall().qy().queryBClassDtlByAutoEmgSetTgt()));
                }
            }
            return _bClassDtlByAutoEmgSetTgt;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_CLASS_DTL by my STOCK_OUT_ALLOC_CLS, named 'BClassDtlByStockOutAllocCls'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByStockOutAllocCls() {
            assertRelation("bClassDtlByStockOutAllocCls");
            if (_bClassDtlByStockOutAllocCls == null) {
                _bClassDtlByStockOutAllocCls = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByStockOutAllocCls()
                                    , () -> _qyCall.qy().queryBClassDtlByStockOutAllocCls())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByStockOutAllocCls.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByStockOutAllocCls()
                      , () -> xsyncQyCall().qy().queryBClassDtlByStockOutAllocCls()));
                }
            }
            return _bClassDtlByStockOutAllocCls;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_CLASS_DTL by my STOCK_OUT_INST_CXL_FLG, named 'BClassDtlByStockOutInstCxlFlg'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByStockOutInstCxlFlg() {
            assertRelation("bClassDtlByStockOutInstCxlFlg");
            if (_bClassDtlByStockOutInstCxlFlg == null) {
                _bClassDtlByStockOutInstCxlFlg = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByStockOutInstCxlFlg()
                                    , () -> _qyCall.qy().queryBClassDtlByStockOutInstCxlFlg())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByStockOutInstCxlFlg.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByStockOutInstCxlFlg()
                      , () -> xsyncQyCall().qy().queryBClassDtlByStockOutInstCxlFlg()));
                }
            }
            return _bClassDtlByStockOutInstCxlFlg;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_CLASS_DTL by my STOCK_OUT_INST_SPLIT_FLG, named 'BClassDtlByStockOutInstSplitFlg'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByStockOutInstSplitFlg() {
            assertRelation("bClassDtlByStockOutInstSplitFlg");
            if (_bClassDtlByStockOutInstSplitFlg == null) {
                _bClassDtlByStockOutInstSplitFlg = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByStockOutInstSplitFlg()
                                    , () -> _qyCall.qy().queryBClassDtlByStockOutInstSplitFlg())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByStockOutInstSplitFlg.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByStockOutInstSplitFlg()
                      , () -> xsyncQyCall().qy().queryBClassDtlByStockOutInstSplitFlg()));
                }
            }
            return _bClassDtlByStockOutInstSplitFlg;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_CLASS_DTL by my PIC_MTHD_RCMD_MLT_PL_OUT, named 'BClassDtlByPicMthdRcmdMltPlOut'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByPicMthdRcmdMltPlOut() {
            assertRelation("bClassDtlByPicMthdRcmdMltPlOut");
            if (_bClassDtlByPicMthdRcmdMltPlOut == null) {
                _bClassDtlByPicMthdRcmdMltPlOut = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByPicMthdRcmdMltPlOut()
                                    , () -> _qyCall.qy().queryBClassDtlByPicMthdRcmdMltPlOut())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByPicMthdRcmdMltPlOut.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByPicMthdRcmdMltPlOut()
                      , () -> xsyncQyCall().qy().queryBClassDtlByPicMthdRcmdMltPlOut()));
                }
            }
            return _bClassDtlByPicMthdRcmdMltPlOut;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_CLASS_DTL by my PIC_MTHD_RCMD_SPL_SL_OUT, named 'BClassDtlByPicMthdRcmdSplSlOut'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByPicMthdRcmdSplSlOut() {
            assertRelation("bClassDtlByPicMthdRcmdSplSlOut");
            if (_bClassDtlByPicMthdRcmdSplSlOut == null) {
                _bClassDtlByPicMthdRcmdSplSlOut = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByPicMthdRcmdSplSlOut()
                                    , () -> _qyCall.qy().queryBClassDtlByPicMthdRcmdSplSlOut())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByPicMthdRcmdSplSlOut.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByPicMthdRcmdSplSlOut()
                      , () -> xsyncQyCall().qy().queryBClassDtlByPicMthdRcmdSplSlOut()));
                }
            }
            return _bClassDtlByPicMthdRcmdSplSlOut;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_CLASS_DTL by my ERROR_SOUND_PLAY_FLG, named 'BClassDtlByErrorSoundPlayFlg'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByErrorSoundPlayFlg() {
            assertRelation("bClassDtlByErrorSoundPlayFlg");
            if (_bClassDtlByErrorSoundPlayFlg == null) {
                _bClassDtlByErrorSoundPlayFlg = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByErrorSoundPlayFlg()
                                    , () -> _qyCall.qy().queryBClassDtlByErrorSoundPlayFlg())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByErrorSoundPlayFlg.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByErrorSoundPlayFlg()
                      , () -> xsyncQyCall().qy().queryBClassDtlByErrorSoundPlayFlg()));
                }
            }
            return _bClassDtlByErrorSoundPlayFlg;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_CLASS_DTL by my WARN_SOUND_PLAY_FLG, named 'BClassDtlByWarnSoundPlayFlg'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByWarnSoundPlayFlg() {
            assertRelation("bClassDtlByWarnSoundPlayFlg");
            if (_bClassDtlByWarnSoundPlayFlg == null) {
                _bClassDtlByWarnSoundPlayFlg = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByWarnSoundPlayFlg()
                                    , () -> _qyCall.qy().queryBClassDtlByWarnSoundPlayFlg())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByWarnSoundPlayFlg.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByWarnSoundPlayFlg()
                      , () -> xsyncQyCall().qy().queryBClassDtlByWarnSoundPlayFlg()));
                }
            }
            return _bClassDtlByWarnSoundPlayFlg;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_CLASS_DTL by my INSP_SOUND_PLAY_FLG, named 'BClassDtlByInspSoundPlayFlg'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByInspSoundPlayFlg() {
            assertRelation("bClassDtlByInspSoundPlayFlg");
            if (_bClassDtlByInspSoundPlayFlg == null) {
                _bClassDtlByInspSoundPlayFlg = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByInspSoundPlayFlg()
                                    , () -> _qyCall.qy().queryBClassDtlByInspSoundPlayFlg())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByInspSoundPlayFlg.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByInspSoundPlayFlg()
                      , () -> xsyncQyCall().qy().queryBClassDtlByInspSoundPlayFlg()));
                }
            }
            return _bClassDtlByInspSoundPlayFlg;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_CLASS_DTL by my INSP_COMP_SOUND_PLAY_FLG, named 'BClassDtlByInspCompSoundPlayFlg'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByInspCompSoundPlayFlg() {
            assertRelation("bClassDtlByInspCompSoundPlayFlg");
            if (_bClassDtlByInspCompSoundPlayFlg == null) {
                _bClassDtlByInspCompSoundPlayFlg = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByInspCompSoundPlayFlg()
                                    , () -> _qyCall.qy().queryBClassDtlByInspCompSoundPlayFlg())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByInspCompSoundPlayFlg.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByInspCompSoundPlayFlg()
                      , () -> xsyncQyCall().qy().queryBClassDtlByInspCompSoundPlayFlg()));
                }
            }
            return _bClassDtlByInspCompSoundPlayFlg;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_CLASS_DTL by my CES_INTEGRATION_FLG, named 'BClassDtlByCesIntegrationFlg'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByCesIntegrationFlg() {
            assertRelation("bClassDtlByCesIntegrationFlg");
            if (_bClassDtlByCesIntegrationFlg == null) {
                _bClassDtlByCesIntegrationFlg = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByCesIntegrationFlg()
                                    , () -> _qyCall.qy().queryBClassDtlByCesIntegrationFlg())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByCesIntegrationFlg.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByCesIntegrationFlg()
                      , () -> xsyncQyCall().qy().queryBClassDtlByCesIntegrationFlg()));
                }
            }
            return _bClassDtlByCesIntegrationFlg;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_CLASS_DTL by my PACKING_SLIP_AUTO_OUTPUT_FLG, named 'BClassDtlByPackingSlipAutoOutputFlg'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByPackingSlipAutoOutputFlg() {
            assertRelation("bClassDtlByPackingSlipAutoOutputFlg");
            if (_bClassDtlByPackingSlipAutoOutputFlg == null) {
                _bClassDtlByPackingSlipAutoOutputFlg = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByPackingSlipAutoOutputFlg()
                                    , () -> _qyCall.qy().queryBClassDtlByPackingSlipAutoOutputFlg())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByPackingSlipAutoOutputFlg.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByPackingSlipAutoOutputFlg()
                      , () -> xsyncQyCall().qy().queryBClassDtlByPackingSlipAutoOutputFlg()));
                }
            }
            return _bClassDtlByPackingSlipAutoOutputFlg;
        }
        /**
         * Prepare for (Specify)MyselfDerived (SubQuery).
         * @return The object to set up a function for myself table. (NotNull)
         */
        public HpSDRFunction<MParamCB, MParamCQ> myselfDerived() {
            assertDerived("myselfDerived"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<MParamCB> sq, MParamCQ cq, String al, DerivedReferrerOption op)
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
    public MParamCB dreamCruiseCB() {
        MParamCB cb = new MParamCB();
        cb.xsetupForDreamCruise((MParamCB) this);
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
    public HpColQyOperand<MParamCB> columnQuery(final SpecifyQuery<MParamCB> colCBLambda) {
        return xcreateColQyOperand((rightSp, operand) -> {
            return xcolqy(xcreateColumnQueryCB(), xcreateColumnQueryCB(), colCBLambda, rightSp, operand);
        });
    }

    protected MParamCB xcreateColumnQueryCB() {
        MParamCB cb = new MParamCB();
        cb.xsetupForColumnQuery((MParamCB)this);
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
    public void orScopeQuery(OrQuery<MParamCB> orCBLambda) {
        xorSQ((MParamCB)this, orCBLambda);
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
    public void orScopeQueryAndPart(AndQuery<MParamCB> andCBLambda) {
        xorSQAP((MParamCB)this, andCBLambda);
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
        final MParamCB cb;
        if (mainCB != null) {
            cb = (MParamCB)mainCB;
        } else {
            cb = new MParamCB();
        }
        specify().xsetSyncQyCall(xcreateSpQyCall(() -> true, () -> cb.query()));
    }

    // ===================================================================================
    //                                                                            Internal
    //                                                                            ========
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xgetConditionBeanClassNameInternally() { return MParamCB.class.getName(); }
    protected String xgetConditionQueryClassNameInternally() { return MParamCQ.class.getName(); }
    protected String xgetSubQueryClassNameInternally() { return SubQuery.class.getName(); }
    protected String xgetConditionOptionClassNameInternally() { return ConditionOption.class.getName(); }
}
