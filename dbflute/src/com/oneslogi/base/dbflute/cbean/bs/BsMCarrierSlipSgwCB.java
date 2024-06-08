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
 * The base condition-bean of M_CARRIER_SLIP_SGW.
 * @author DBFlute(AutoGenerator)
 */
public class BsMCarrierSlipSgwCB extends AbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MCarrierSlipSgwCQ _conditionQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMCarrierSlipSgwCB() {
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
        return "M_CARRIER_SLIP_SGW";
    }

    // ===================================================================================
    //                                                                 PrimaryKey Handling
    //                                                                 ===================
    /**
     * Accept the query condition of primary key as equal.
     * @param carrierSlipSgwId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return this. (NotNull)
     */
    public MCarrierSlipSgwCB acceptPK(Long carrierSlipSgwId) {
        assertObjectNotNull("carrierSlipSgwId", carrierSlipSgwId);
        BsMCarrierSlipSgwCB cb = this;
        cb.query().setCarrierSlipSgwId_Equal(carrierSlipSgwId);
        return (MCarrierSlipSgwCB)this;
    }

    /**
     * Accept the query condition of primary key as equal. (old style)
     * @param carrierSlipSgwId : PK, ID, NotNull, bigint identity(19). (NotNull)
     */
    public void acceptPrimaryKey(Long carrierSlipSgwId) {
        assertObjectNotNull("carrierSlipSgwId", carrierSlipSgwId);
        BsMCarrierSlipSgwCB cb = this;
        cb.query().setCarrierSlipSgwId_Equal(carrierSlipSgwId);
    }

    /**
     * Accept the query condition of unique key as equal.
     * @param centerId : UQ+, NotNull, bigint(19), FK to M_CENTER. (NotNull)
     * @param tagType : +UQ, NotNull, varchar(30). (NotNull)
     * @return this. (NotNull)
     */
    public MCarrierSlipSgwCB acceptUniqueOf(Long centerId, String tagType) {
        assertObjectNotNull("centerId", centerId);assertObjectNotNull("tagType", tagType);
        BsMCarrierSlipSgwCB cb = this;
        cb.query().setCenterId_Equal(centerId);cb.query().setTagType_Equal(tagType);
        return (MCarrierSlipSgwCB)this;
    }

    public ConditionBean addOrderBy_PK_Asc() {
        query().addOrderBy_CarrierSlipSgwId_Asc();
        return this;
    }

    public ConditionBean addOrderBy_PK_Desc() {
        query().addOrderBy_CarrierSlipSgwId_Desc();
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
    public MCarrierSlipSgwCQ query() {
        assertQueryPurpose(); // assert only when user-public query
        return doGetConditionQuery();
    }

    public MCarrierSlipSgwCQ xdfgetConditionQuery() { // public for parameter comment and internal
        return doGetConditionQuery();
    }

    protected MCarrierSlipSgwCQ doGetConditionQuery() {
        if (_conditionQuery == null) {
            _conditionQuery = createLocalCQ();
        }
        return _conditionQuery;
    }

    protected MCarrierSlipSgwCQ createLocalCQ() {
        return xcreateCQ(null, getSqlClause(), getSqlClause().getBasePointAliasName(), 0);
    }

    protected MCarrierSlipSgwCQ xcreateCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        MCarrierSlipSgwCQ cq = xnewCQ(childQuery, sqlClause, aliasName, nestLevel);
        cq.xsetBaseCB(this);
        return cq;
    }

    protected MCarrierSlipSgwCQ xnewCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        return new MCarrierSlipSgwCQ(childQuery, sqlClause, aliasName, nestLevel);
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
    public void union(UnionQuery<MCarrierSlipSgwCB> unionCBLambda) {
        final MCarrierSlipSgwCB cb = new MCarrierSlipSgwCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionCBLambda.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final MCarrierSlipSgwCQ cq = cb.query(); query().xsetUnionQuery(cq);
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
    public void unionAll(UnionQuery<MCarrierSlipSgwCB> unionCBLambda) {
        final MCarrierSlipSgwCB cb = new MCarrierSlipSgwCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionCBLambda.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final MCarrierSlipSgwCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
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
     * <span style="color: #0000C0">mCarrierSlipSgwBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_MCenter()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mCarrierSlipSgw</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mCarrierSlipSgw</span>.<span style="color: #CC4747">getMCenter()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
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

    protected MCenterClassDtlNss _nssMCenterClassDtlByApiBinsyuCode;
    public MCenterClassDtlNss xdfgetNssMCenterClassDtlByApiBinsyuCode() {
        if (_nssMCenterClassDtlByApiBinsyuCode == null) { _nssMCenterClassDtlByApiBinsyuCode = new MCenterClassDtlNss(null); }
        return _nssMCenterClassDtlByApiBinsyuCode;
    }
    /**
     * Set up relation columns to select clause. <br>
     * M_CENTER_CLASS_DTL by my API_BINSYU_CODE, named 'MCenterClassDtlByApiBinsyuCode'.
     * <pre>
     * <span style="color: #0000C0">mCarrierSlipSgwBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_MCenterClassDtlByApiBinsyuCode(centerId)</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mCarrierSlipSgw</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mCarrierSlipSgw</span>.<span style="color: #CC4747">getMCenterClassDtlByApiBinsyuCode()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @param centerId The bind parameter of fixed condition for centerId. (NotNull)
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MCenterClassDtlNss setupSelect_MCenterClassDtlByApiBinsyuCode(final Long centerId) {
        assertSetupSelectPurpose("mCenterClassDtlByApiBinsyuCode");
        if (hasSpecifiedLocalColumn()) {
            specify().columnApiBinsyuCode();
        }
        doSetupSelect(() -> query().queryMCenterClassDtlByApiBinsyuCode(centerId));
        if (_nssMCenterClassDtlByApiBinsyuCode == null || !_nssMCenterClassDtlByApiBinsyuCode.hasConditionQuery())
        { _nssMCenterClassDtlByApiBinsyuCode = new MCenterClassDtlNss(query().queryMCenterClassDtlByApiBinsyuCode(centerId)); }
        return _nssMCenterClassDtlByApiBinsyuCode;
    }

    protected MCenterClassDtlNss _nssMCenterClassDtlByApiDaibikiFlg;
    public MCenterClassDtlNss xdfgetNssMCenterClassDtlByApiDaibikiFlg() {
        if (_nssMCenterClassDtlByApiDaibikiFlg == null) { _nssMCenterClassDtlByApiDaibikiFlg = new MCenterClassDtlNss(null); }
        return _nssMCenterClassDtlByApiDaibikiFlg;
    }
    /**
     * Set up relation columns to select clause. <br>
     * M_CENTER_CLASS_DTL by my API_DAIBIKI_FLG, named 'MCenterClassDtlByApiDaibikiFlg'.
     * <pre>
     * <span style="color: #0000C0">mCarrierSlipSgwBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_MCenterClassDtlByApiDaibikiFlg(centerId)</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mCarrierSlipSgw</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mCarrierSlipSgw</span>.<span style="color: #CC4747">getMCenterClassDtlByApiDaibikiFlg()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @param centerId The bind parameter of fixed condition for centerId. (NotNull)
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MCenterClassDtlNss setupSelect_MCenterClassDtlByApiDaibikiFlg(final Long centerId) {
        assertSetupSelectPurpose("mCenterClassDtlByApiDaibikiFlg");
        if (hasSpecifiedLocalColumn()) {
            specify().columnApiDaibikiFlg();
        }
        doSetupSelect(() -> query().queryMCenterClassDtlByApiDaibikiFlg(centerId));
        if (_nssMCenterClassDtlByApiDaibikiFlg == null || !_nssMCenterClassDtlByApiDaibikiFlg.hasConditionQuery())
        { _nssMCenterClassDtlByApiDaibikiFlg = new MCenterClassDtlNss(query().queryMCenterClassDtlByApiDaibikiFlg(centerId)); }
        return _nssMCenterClassDtlByApiDaibikiFlg;
    }

    protected MCenterClassDtlNss _nssMCenterClassDtlByApiDaibikiType;
    public MCenterClassDtlNss xdfgetNssMCenterClassDtlByApiDaibikiType() {
        if (_nssMCenterClassDtlByApiDaibikiType == null) { _nssMCenterClassDtlByApiDaibikiType = new MCenterClassDtlNss(null); }
        return _nssMCenterClassDtlByApiDaibikiType;
    }
    /**
     * Set up relation columns to select clause. <br>
     * M_CENTER_CLASS_DTL by my API_DAIBIKI_TYPE, named 'MCenterClassDtlByApiDaibikiType'.
     * <pre>
     * <span style="color: #0000C0">mCarrierSlipSgwBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_MCenterClassDtlByApiDaibikiType(centerId)</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mCarrierSlipSgw</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mCarrierSlipSgw</span>.<span style="color: #CC4747">getMCenterClassDtlByApiDaibikiType()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @param centerId The bind parameter of fixed condition for centerId. (NotNull)
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MCenterClassDtlNss setupSelect_MCenterClassDtlByApiDaibikiType(final Long centerId) {
        assertSetupSelectPurpose("mCenterClassDtlByApiDaibikiType");
        if (hasSpecifiedLocalColumn()) {
            specify().columnApiDaibikiType();
        }
        doSetupSelect(() -> query().queryMCenterClassDtlByApiDaibikiType(centerId));
        if (_nssMCenterClassDtlByApiDaibikiType == null || !_nssMCenterClassDtlByApiDaibikiType.hasConditionQuery())
        { _nssMCenterClassDtlByApiDaibikiType = new MCenterClassDtlNss(query().queryMCenterClassDtlByApiDaibikiType(centerId)); }
        return _nssMCenterClassDtlByApiDaibikiType;
    }

    protected MCenterClassDtlNss _nssMCenterClassDtlByApiEidomeFlg;
    public MCenterClassDtlNss xdfgetNssMCenterClassDtlByApiEidomeFlg() {
        if (_nssMCenterClassDtlByApiEidomeFlg == null) { _nssMCenterClassDtlByApiEidomeFlg = new MCenterClassDtlNss(null); }
        return _nssMCenterClassDtlByApiEidomeFlg;
    }
    /**
     * Set up relation columns to select clause. <br>
     * M_CENTER_CLASS_DTL by my API_EIDOME_FLG, named 'MCenterClassDtlByApiEidomeFlg'.
     * <pre>
     * <span style="color: #0000C0">mCarrierSlipSgwBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_MCenterClassDtlByApiEidomeFlg(centerId)</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mCarrierSlipSgw</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mCarrierSlipSgw</span>.<span style="color: #CC4747">getMCenterClassDtlByApiEidomeFlg()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @param centerId The bind parameter of fixed condition for centerId. (NotNull)
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MCenterClassDtlNss setupSelect_MCenterClassDtlByApiEidomeFlg(final Long centerId) {
        assertSetupSelectPurpose("mCenterClassDtlByApiEidomeFlg");
        if (hasSpecifiedLocalColumn()) {
            specify().columnApiEidomeFlg();
        }
        doSetupSelect(() -> query().queryMCenterClassDtlByApiEidomeFlg(centerId));
        if (_nssMCenterClassDtlByApiEidomeFlg == null || !_nssMCenterClassDtlByApiEidomeFlg.hasConditionQuery())
        { _nssMCenterClassDtlByApiEidomeFlg = new MCenterClassDtlNss(query().queryMCenterClassDtlByApiEidomeFlg(centerId)); }
        return _nssMCenterClassDtlByApiEidomeFlg;
    }

    protected MCenterClassDtlNss _nssMCenterClassDtlByApiWeightCd1;
    public MCenterClassDtlNss xdfgetNssMCenterClassDtlByApiWeightCd1() {
        if (_nssMCenterClassDtlByApiWeightCd1 == null) { _nssMCenterClassDtlByApiWeightCd1 = new MCenterClassDtlNss(null); }
        return _nssMCenterClassDtlByApiWeightCd1;
    }
    /**
     * Set up relation columns to select clause. <br>
     * M_CENTER_CLASS_DTL by my API_WEIGHT_CD_1, named 'MCenterClassDtlByApiWeightCd1'.
     * <pre>
     * <span style="color: #0000C0">mCarrierSlipSgwBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_MCenterClassDtlByApiWeightCd1(centerId)</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mCarrierSlipSgw</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mCarrierSlipSgw</span>.<span style="color: #CC4747">getMCenterClassDtlByApiWeightCd1()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @param centerId The bind parameter of fixed condition for centerId. (NotNull)
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MCenterClassDtlNss setupSelect_MCenterClassDtlByApiWeightCd1(final Long centerId) {
        assertSetupSelectPurpose("mCenterClassDtlByApiWeightCd1");
        if (hasSpecifiedLocalColumn()) {
            specify().columnApiWeightCd1();
        }
        doSetupSelect(() -> query().queryMCenterClassDtlByApiWeightCd1(centerId));
        if (_nssMCenterClassDtlByApiWeightCd1 == null || !_nssMCenterClassDtlByApiWeightCd1.hasConditionQuery())
        { _nssMCenterClassDtlByApiWeightCd1 = new MCenterClassDtlNss(query().queryMCenterClassDtlByApiWeightCd1(centerId)); }
        return _nssMCenterClassDtlByApiWeightCd1;
    }

    protected MCenterClassDtlNss _nssMCenterClassDtlByApiWeightCd2;
    public MCenterClassDtlNss xdfgetNssMCenterClassDtlByApiWeightCd2() {
        if (_nssMCenterClassDtlByApiWeightCd2 == null) { _nssMCenterClassDtlByApiWeightCd2 = new MCenterClassDtlNss(null); }
        return _nssMCenterClassDtlByApiWeightCd2;
    }
    /**
     * Set up relation columns to select clause. <br>
     * M_CENTER_CLASS_DTL by my API_WEIGHT_CD_2, named 'MCenterClassDtlByApiWeightCd2'.
     * <pre>
     * <span style="color: #0000C0">mCarrierSlipSgwBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_MCenterClassDtlByApiWeightCd2(centerId)</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mCarrierSlipSgw</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mCarrierSlipSgw</span>.<span style="color: #CC4747">getMCenterClassDtlByApiWeightCd2()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @param centerId The bind parameter of fixed condition for centerId. (NotNull)
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MCenterClassDtlNss setupSelect_MCenterClassDtlByApiWeightCd2(final Long centerId) {
        assertSetupSelectPurpose("mCenterClassDtlByApiWeightCd2");
        if (hasSpecifiedLocalColumn()) {
            specify().columnApiWeightCd2();
        }
        doSetupSelect(() -> query().queryMCenterClassDtlByApiWeightCd2(centerId));
        if (_nssMCenterClassDtlByApiWeightCd2 == null || !_nssMCenterClassDtlByApiWeightCd2.hasConditionQuery())
        { _nssMCenterClassDtlByApiWeightCd2 = new MCenterClassDtlNss(query().queryMCenterClassDtlByApiWeightCd2(centerId)); }
        return _nssMCenterClassDtlByApiWeightCd2;
    }

    protected BClassDtlNss _nssBClassDtlByCharacterCd;
    public BClassDtlNss xdfgetNssBClassDtlByCharacterCd() {
        if (_nssBClassDtlByCharacterCd == null) { _nssBClassDtlByCharacterCd = new BClassDtlNss(null); }
        return _nssBClassDtlByCharacterCd;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my CHARACTER_CD, named 'BClassDtlByCharacterCd'.
     * <pre>
     * <span style="color: #0000C0">mCarrierSlipSgwBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByCharacterCd()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mCarrierSlipSgw</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mCarrierSlipSgw</span>.<span style="color: #CC4747">getBClassDtlByCharacterCd()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByCharacterCd() {
        assertSetupSelectPurpose("bClassDtlByCharacterCd");
        if (hasSpecifiedLocalColumn()) {
            specify().columnCharacterCd();
        }
        doSetupSelect(() -> query().queryBClassDtlByCharacterCd());
        if (_nssBClassDtlByCharacterCd == null || !_nssBClassDtlByCharacterCd.hasConditionQuery())
        { _nssBClassDtlByCharacterCd = new BClassDtlNss(query().queryBClassDtlByCharacterCd()); }
        return _nssBClassDtlByCharacterCd;
    }

    protected BClassDtlNss _nssBClassDtlByCodCls;
    public BClassDtlNss xdfgetNssBClassDtlByCodCls() {
        if (_nssBClassDtlByCodCls == null) { _nssBClassDtlByCodCls = new BClassDtlNss(null); }
        return _nssBClassDtlByCodCls;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my COD_CLS, named 'BClassDtlByCodCls'.
     * <pre>
     * <span style="color: #0000C0">mCarrierSlipSgwBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByCodCls()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mCarrierSlipSgw</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mCarrierSlipSgw</span>.<span style="color: #CC4747">getBClassDtlByCodCls()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByCodCls() {
        assertSetupSelectPurpose("bClassDtlByCodCls");
        if (hasSpecifiedLocalColumn()) {
            specify().columnCodCls();
        }
        doSetupSelect(() -> query().queryBClassDtlByCodCls());
        if (_nssBClassDtlByCodCls == null || !_nssBClassDtlByCodCls.hasConditionQuery())
        { _nssBClassDtlByCodCls = new BClassDtlNss(query().queryBClassDtlByCodCls()); }
        return _nssBClassDtlByCodCls;
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
     * <span style="color: #0000C0">mCarrierSlipSgwBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByDelFlg()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mCarrierSlipSgw</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mCarrierSlipSgw</span>.<span style="color: #CC4747">getBClassDtlByDelFlg()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
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

    protected MCenterClassDtlNss _nssMCenterClassDtlBySealType1;
    public MCenterClassDtlNss xdfgetNssMCenterClassDtlBySealType1() {
        if (_nssMCenterClassDtlBySealType1 == null) { _nssMCenterClassDtlBySealType1 = new MCenterClassDtlNss(null); }
        return _nssMCenterClassDtlBySealType1;
    }
    /**
     * Set up relation columns to select clause. <br>
     * M_CENTER_CLASS_DTL by my SEAL_TYPE1, named 'MCenterClassDtlBySealType1'.
     * <pre>
     * <span style="color: #0000C0">mCarrierSlipSgwBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_MCenterClassDtlBySealType1(centerId)</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mCarrierSlipSgw</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mCarrierSlipSgw</span>.<span style="color: #CC4747">getMCenterClassDtlBySealType1()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @param centerId The bind parameter of fixed condition for centerId. (NotNull)
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MCenterClassDtlNss setupSelect_MCenterClassDtlBySealType1(final Long centerId) {
        assertSetupSelectPurpose("mCenterClassDtlBySealType1");
        if (hasSpecifiedLocalColumn()) {
            specify().columnSealType1();
        }
        doSetupSelect(() -> query().queryMCenterClassDtlBySealType1(centerId));
        if (_nssMCenterClassDtlBySealType1 == null || !_nssMCenterClassDtlBySealType1.hasConditionQuery())
        { _nssMCenterClassDtlBySealType1 = new MCenterClassDtlNss(query().queryMCenterClassDtlBySealType1(centerId)); }
        return _nssMCenterClassDtlBySealType1;
    }

    protected MCenterClassDtlNss _nssMCenterClassDtlBySealType2;
    public MCenterClassDtlNss xdfgetNssMCenterClassDtlBySealType2() {
        if (_nssMCenterClassDtlBySealType2 == null) { _nssMCenterClassDtlBySealType2 = new MCenterClassDtlNss(null); }
        return _nssMCenterClassDtlBySealType2;
    }
    /**
     * Set up relation columns to select clause. <br>
     * M_CENTER_CLASS_DTL by my SEAL_TYPE2, named 'MCenterClassDtlBySealType2'.
     * <pre>
     * <span style="color: #0000C0">mCarrierSlipSgwBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_MCenterClassDtlBySealType2(centerId)</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mCarrierSlipSgw</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mCarrierSlipSgw</span>.<span style="color: #CC4747">getMCenterClassDtlBySealType2()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @param centerId The bind parameter of fixed condition for centerId. (NotNull)
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MCenterClassDtlNss setupSelect_MCenterClassDtlBySealType2(final Long centerId) {
        assertSetupSelectPurpose("mCenterClassDtlBySealType2");
        if (hasSpecifiedLocalColumn()) {
            specify().columnSealType2();
        }
        doSetupSelect(() -> query().queryMCenterClassDtlBySealType2(centerId));
        if (_nssMCenterClassDtlBySealType2 == null || !_nssMCenterClassDtlBySealType2.hasConditionQuery())
        { _nssMCenterClassDtlBySealType2 = new MCenterClassDtlNss(query().queryMCenterClassDtlBySealType2(centerId)); }
        return _nssMCenterClassDtlBySealType2;
    }

    protected MCenterClassDtlNss _nssMCenterClassDtlBySealType3;
    public MCenterClassDtlNss xdfgetNssMCenterClassDtlBySealType3() {
        if (_nssMCenterClassDtlBySealType3 == null) { _nssMCenterClassDtlBySealType3 = new MCenterClassDtlNss(null); }
        return _nssMCenterClassDtlBySealType3;
    }
    /**
     * Set up relation columns to select clause. <br>
     * M_CENTER_CLASS_DTL by my SEAL_TYPE3, named 'MCenterClassDtlBySealType3'.
     * <pre>
     * <span style="color: #0000C0">mCarrierSlipSgwBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_MCenterClassDtlBySealType3(centerId)</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mCarrierSlipSgw</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mCarrierSlipSgw</span>.<span style="color: #CC4747">getMCenterClassDtlBySealType3()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @param centerId The bind parameter of fixed condition for centerId. (NotNull)
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MCenterClassDtlNss setupSelect_MCenterClassDtlBySealType3(final Long centerId) {
        assertSetupSelectPurpose("mCenterClassDtlBySealType3");
        if (hasSpecifiedLocalColumn()) {
            specify().columnSealType3();
        }
        doSetupSelect(() -> query().queryMCenterClassDtlBySealType3(centerId));
        if (_nssMCenterClassDtlBySealType3 == null || !_nssMCenterClassDtlBySealType3.hasConditionQuery())
        { _nssMCenterClassDtlBySealType3 = new MCenterClassDtlNss(query().queryMCenterClassDtlBySealType3(centerId)); }
        return _nssMCenterClassDtlBySealType3;
    }

    protected BClassDtlNss _nssBClassDtlBySettlementType;
    public BClassDtlNss xdfgetNssBClassDtlBySettlementType() {
        if (_nssBClassDtlBySettlementType == null) { _nssBClassDtlBySettlementType = new BClassDtlNss(null); }
        return _nssBClassDtlBySettlementType;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my SETTLEMENT_TYPE, named 'BClassDtlBySettlementType'.
     * <pre>
     * <span style="color: #0000C0">mCarrierSlipSgwBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlBySettlementType()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mCarrierSlipSgw</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mCarrierSlipSgw</span>.<span style="color: #CC4747">getBClassDtlBySettlementType()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlBySettlementType() {
        assertSetupSelectPurpose("bClassDtlBySettlementType");
        if (hasSpecifiedLocalColumn()) {
            specify().columnSettlementType();
        }
        doSetupSelect(() -> query().queryBClassDtlBySettlementType());
        if (_nssBClassDtlBySettlementType == null || !_nssBClassDtlBySettlementType.hasConditionQuery())
        { _nssBClassDtlBySettlementType = new BClassDtlNss(query().queryBClassDtlBySettlementType()); }
        return _nssBClassDtlBySettlementType;
    }

    protected MCenterClassDtlNss _nssMCenterClassDtlBySlipShapeCd;
    public MCenterClassDtlNss xdfgetNssMCenterClassDtlBySlipShapeCd() {
        if (_nssMCenterClassDtlBySlipShapeCd == null) { _nssMCenterClassDtlBySlipShapeCd = new MCenterClassDtlNss(null); }
        return _nssMCenterClassDtlBySlipShapeCd;
    }
    /**
     * Set up relation columns to select clause. <br>
     * M_CENTER_CLASS_DTL by my SLIP_SHAPE_CD, named 'MCenterClassDtlBySlipShapeCd'.
     * <pre>
     * <span style="color: #0000C0">mCarrierSlipSgwBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_MCenterClassDtlBySlipShapeCd(centerId)</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mCarrierSlipSgw</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mCarrierSlipSgw</span>.<span style="color: #CC4747">getMCenterClassDtlBySlipShapeCd()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @param centerId The bind parameter of fixed condition for centerId. (NotNull)
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MCenterClassDtlNss setupSelect_MCenterClassDtlBySlipShapeCd(final Long centerId) {
        assertSetupSelectPurpose("mCenterClassDtlBySlipShapeCd");
        if (hasSpecifiedLocalColumn()) {
            specify().columnSlipShapeCd();
        }
        doSetupSelect(() -> query().queryMCenterClassDtlBySlipShapeCd(centerId));
        if (_nssMCenterClassDtlBySlipShapeCd == null || !_nssMCenterClassDtlBySlipShapeCd.hasConditionQuery())
        { _nssMCenterClassDtlBySlipShapeCd = new MCenterClassDtlNss(query().queryMCenterClassDtlBySlipShapeCd(centerId)); }
        return _nssMCenterClassDtlBySlipShapeCd;
    }

    protected MCenterClassDtlNss _nssMCenterClassDtlByTransportTypeItem;
    public MCenterClassDtlNss xdfgetNssMCenterClassDtlByTransportTypeItem() {
        if (_nssMCenterClassDtlByTransportTypeItem == null) { _nssMCenterClassDtlByTransportTypeItem = new MCenterClassDtlNss(null); }
        return _nssMCenterClassDtlByTransportTypeItem;
    }
    /**
     * Set up relation columns to select clause. <br>
     * M_CENTER_CLASS_DTL by my TRANSPORT_TYPE_ITEM, named 'MCenterClassDtlByTransportTypeItem'.
     * <pre>
     * <span style="color: #0000C0">mCarrierSlipSgwBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_MCenterClassDtlByTransportTypeItem(centerId)</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mCarrierSlipSgw</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mCarrierSlipSgw</span>.<span style="color: #CC4747">getMCenterClassDtlByTransportTypeItem()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @param centerId The bind parameter of fixed condition for centerId. (NotNull)
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MCenterClassDtlNss setupSelect_MCenterClassDtlByTransportTypeItem(final Long centerId) {
        assertSetupSelectPurpose("mCenterClassDtlByTransportTypeItem");
        if (hasSpecifiedLocalColumn()) {
            specify().columnTransportTypeItem();
        }
        doSetupSelect(() -> query().queryMCenterClassDtlByTransportTypeItem(centerId));
        if (_nssMCenterClassDtlByTransportTypeItem == null || !_nssMCenterClassDtlByTransportTypeItem.hasConditionQuery())
        { _nssMCenterClassDtlByTransportTypeItem = new MCenterClassDtlNss(query().queryMCenterClassDtlByTransportTypeItem(centerId)); }
        return _nssMCenterClassDtlByTransportTypeItem;
    }

    protected MCenterClassDtlNss _nssMCenterClassDtlByTransportTypeSpeed;
    public MCenterClassDtlNss xdfgetNssMCenterClassDtlByTransportTypeSpeed() {
        if (_nssMCenterClassDtlByTransportTypeSpeed == null) { _nssMCenterClassDtlByTransportTypeSpeed = new MCenterClassDtlNss(null); }
        return _nssMCenterClassDtlByTransportTypeSpeed;
    }
    /**
     * Set up relation columns to select clause. <br>
     * M_CENTER_CLASS_DTL by my TRANSPORT_TYPE_SPEED, named 'MCenterClassDtlByTransportTypeSpeed'.
     * <pre>
     * <span style="color: #0000C0">mCarrierSlipSgwBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_MCenterClassDtlByTransportTypeSpeed(centerId)</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mCarrierSlipSgw</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mCarrierSlipSgw</span>.<span style="color: #CC4747">getMCenterClassDtlByTransportTypeSpeed()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @param centerId The bind parameter of fixed condition for centerId. (NotNull)
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MCenterClassDtlNss setupSelect_MCenterClassDtlByTransportTypeSpeed(final Long centerId) {
        assertSetupSelectPurpose("mCenterClassDtlByTransportTypeSpeed");
        if (hasSpecifiedLocalColumn()) {
            specify().columnTransportTypeSpeed();
        }
        doSetupSelect(() -> query().queryMCenterClassDtlByTransportTypeSpeed(centerId));
        if (_nssMCenterClassDtlByTransportTypeSpeed == null || !_nssMCenterClassDtlByTransportTypeSpeed.hasConditionQuery())
        { _nssMCenterClassDtlByTransportTypeSpeed = new MCenterClassDtlNss(query().queryMCenterClassDtlByTransportTypeSpeed(centerId)); }
        return _nssMCenterClassDtlByTransportTypeSpeed;
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

    public static class HpSpecification extends HpAbstractSpecification<MCarrierSlipSgwCQ> {
        protected MCenterCB.HpSpecification _mCenter;
        protected MCenterClassDtlCB.HpSpecification _mCenterClassDtlByApiBinsyuCode;
        protected MCenterClassDtlCB.HpSpecification _mCenterClassDtlByApiDaibikiFlg;
        protected MCenterClassDtlCB.HpSpecification _mCenterClassDtlByApiDaibikiType;
        protected MCenterClassDtlCB.HpSpecification _mCenterClassDtlByApiEidomeFlg;
        protected MCenterClassDtlCB.HpSpecification _mCenterClassDtlByApiWeightCd1;
        protected MCenterClassDtlCB.HpSpecification _mCenterClassDtlByApiWeightCd2;
        protected BClassDtlCB.HpSpecification _bClassDtlByCharacterCd;
        protected BClassDtlCB.HpSpecification _bClassDtlByCodCls;
        protected BClassDtlCB.HpSpecification _bClassDtlByDelFlg;
        protected MCenterClassDtlCB.HpSpecification _mCenterClassDtlBySealType1;
        protected MCenterClassDtlCB.HpSpecification _mCenterClassDtlBySealType2;
        protected MCenterClassDtlCB.HpSpecification _mCenterClassDtlBySealType3;
        protected BClassDtlCB.HpSpecification _bClassDtlBySettlementType;
        protected MCenterClassDtlCB.HpSpecification _mCenterClassDtlBySlipShapeCd;
        protected MCenterClassDtlCB.HpSpecification _mCenterClassDtlByTransportTypeItem;
        protected MCenterClassDtlCB.HpSpecification _mCenterClassDtlByTransportTypeSpeed;
        public HpSpecification(ConditionBean baseCB, HpSpQyCall<MCarrierSlipSgwCQ> qyCall
                             , HpCBPurpose purpose, DBMetaProvider dbmetaProvider
                             , HpSDRFunctionFactory sdrFuncFactory)
        { super(baseCB, qyCall, purpose, dbmetaProvider, sdrFuncFactory); }
        /**
         * CARRIER_SLIP_SGW_ID: {PK, ID, NotNull, bigint identity(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCarrierSlipSgwId() { return doColumn("CARRIER_SLIP_SGW_ID"); }
        /**
         * CENTER_ID: {UQ+, NotNull, bigint(19), FK to M_CENTER}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCenterId() { return doColumn("CENTER_ID"); }
        /**
         * TAG_TYPE: {+UQ, NotNull, varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnTagType() { return doColumn("TAG_TYPE"); }
        /**
         * TAG_NM: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnTagNm() { return doColumn("TAG_NM"); }
        /**
         * CHARACTER_CD: {varchar(30), FK to B_CLASS_DTL, classification=CharacterCd}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCharacterCd() { return doColumn("CHARACTER_CD"); }
        /**
         * SLIP_CUSTOMER_CD: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSlipCustomerCd() { return doColumn("SLIP_CUSTOMER_CD"); }
        /**
         * WEB_API_REQUEST_URL: {varchar(100)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnWebApiRequestUrl() { return doColumn("WEB_API_REQUEST_URL"); }
        /**
         * CUSTOMER_ID: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCustomerId() { return doColumn("CUSTOMER_ID"); }
        /**
         * LOGIN_PASSWORD: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnLoginPassword() { return doColumn("LOGIN_PASSWORD"); }
        /**
         * DEPT_CONSIGNOR_NM: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDeptConsignorNm() { return doColumn("DEPT_CONSIGNOR_NM"); }
        /**
         * CONSIGNOR_TEL_NO: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnConsignorTelNo() { return doColumn("CONSIGNOR_TEL_NO"); }
        /**
         * SLIP_CLIENT_TEL_NO: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSlipClientTelNo() { return doColumn("SLIP_CLIENT_TEL_NO"); }
        /**
         * SLIP_CLIENT_ZIP_CD: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSlipClientZipCd() { return doColumn("SLIP_CLIENT_ZIP_CD"); }
        /**
         * SLIP_CLIENT_ADDRESS1: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSlipClientAddress1() { return doColumn("SLIP_CLIENT_ADDRESS1"); }
        /**
         * SLIP_CLIENT_ADDRESS2: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSlipClientAddress2() { return doColumn("SLIP_CLIENT_ADDRESS2"); }
        /**
         * SLIP_CLIENT_NM1: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSlipClientNm1() { return doColumn("SLIP_CLIENT_NM1"); }
        /**
         * SLIP_CLIENT_NM2: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSlipClientNm2() { return doColumn("SLIP_CLIENT_NM2"); }
        /**
         * SLIP_SHAPE_CD: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterSlipShapeCd}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSlipShapeCd() { return doColumn("SLIP_SHAPE_CD"); }
        /**
         * SLIP_ITEM_NM1: {varchar(255)}
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
         * TRANSPORT_TYPE_SPEED: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterTransportTypeSpeed}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnTransportTypeSpeed() { return doColumn("TRANSPORT_TYPE_SPEED"); }
        /**
         * TRANSPORT_TYPE_ITEM: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterTransportTypeItem}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnTransportTypeItem() { return doColumn("TRANSPORT_TYPE_ITEM"); }
        /**
         * SETTLEMENT_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=SettlementType}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSettlementType() { return doColumn("SETTLEMENT_TYPE"); }
        /**
         * SEAL_TYPE1: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterSealType}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSealType1() { return doColumn("SEAL_TYPE1"); }
        /**
         * SEAL_TYPE2: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterSealType}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSealType2() { return doColumn("SEAL_TYPE2"); }
        /**
         * SEAL_TYPE3: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterSealType}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSealType3() { return doColumn("SEAL_TYPE3"); }
        /**
         * COD_CLS: {varchar(30), FK to B_CLASS_DTL, classification=CodCls}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCodCls() { return doColumn("COD_CLS"); }
        /**
         * SEND_CD: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSendCd() { return doColumn("SEND_CD"); }
        /**
         * API_OKURI_CODE: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnApiOkuriCode() { return doColumn("API_OKURI_CODE"); }
        /**
         * API_BINSYU_CODE: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterApiBinsyuCode}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnApiBinsyuCode() { return doColumn("API_BINSYU_CODE"); }
        /**
         * API_DAIBIKI_FLG: {char(1), FK to M_CENTER_CLASS_DTL, classification=CenterApiDaibikiFlg}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnApiDaibikiFlg() { return doColumn("API_DAIBIKI_FLG"); }
        /**
         * API_DAIBIKI_TYPE: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterApiDaibikiType}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnApiDaibikiType() { return doColumn("API_DAIBIKI_TYPE"); }
        /**
         * API_WEIGHT_CD_1: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterApiWeightCd}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnApiWeightCd1() { return doColumn("API_WEIGHT_CD_1"); }
        /**
         * API_WEIGHT_CD_2: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterApiWeightCd}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnApiWeightCd2() { return doColumn("API_WEIGHT_CD_2"); }
        /**
         * API_EIDOME_FLG: {char(1), FK to M_CENTER_CLASS_DTL, classification=CenterApiEidomeFlg}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnApiEidomeFlg() { return doColumn("API_EIDOME_FLG"); }
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
            columnCarrierSlipSgwId(); // PK
            if (qyCall().qy().hasConditionQueryMCenter()
                    || qyCall().qy().xgetReferrerQuery() instanceof MCenterCQ) {
                columnCenterId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryMCenterClassDtlByApiBinsyuCode()
                    || qyCall().qy().xgetReferrerQuery() instanceof MCenterClassDtlCQ) {
                columnApiBinsyuCode(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryMCenterClassDtlByApiDaibikiFlg()
                    || qyCall().qy().xgetReferrerQuery() instanceof MCenterClassDtlCQ) {
                columnApiDaibikiFlg(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryMCenterClassDtlByApiDaibikiType()
                    || qyCall().qy().xgetReferrerQuery() instanceof MCenterClassDtlCQ) {
                columnApiDaibikiType(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryMCenterClassDtlByApiEidomeFlg()
                    || qyCall().qy().xgetReferrerQuery() instanceof MCenterClassDtlCQ) {
                columnApiEidomeFlg(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryMCenterClassDtlByApiWeightCd1()
                    || qyCall().qy().xgetReferrerQuery() instanceof MCenterClassDtlCQ) {
                columnApiWeightCd1(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryMCenterClassDtlByApiWeightCd2()
                    || qyCall().qy().xgetReferrerQuery() instanceof MCenterClassDtlCQ) {
                columnApiWeightCd2(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByCharacterCd()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnCharacterCd(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByCodCls()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnCodCls(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByDelFlg()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnDelFlg(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryMCenterClassDtlBySealType1()
                    || qyCall().qy().xgetReferrerQuery() instanceof MCenterClassDtlCQ) {
                columnSealType1(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryMCenterClassDtlBySealType2()
                    || qyCall().qy().xgetReferrerQuery() instanceof MCenterClassDtlCQ) {
                columnSealType2(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryMCenterClassDtlBySealType3()
                    || qyCall().qy().xgetReferrerQuery() instanceof MCenterClassDtlCQ) {
                columnSealType3(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlBySettlementType()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnSettlementType(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryMCenterClassDtlBySlipShapeCd()
                    || qyCall().qy().xgetReferrerQuery() instanceof MCenterClassDtlCQ) {
                columnSlipShapeCd(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryMCenterClassDtlByTransportTypeItem()
                    || qyCall().qy().xgetReferrerQuery() instanceof MCenterClassDtlCQ) {
                columnTransportTypeItem(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryMCenterClassDtlByTransportTypeSpeed()
                    || qyCall().qy().xgetReferrerQuery() instanceof MCenterClassDtlCQ) {
                columnTransportTypeSpeed(); // FK or one-to-one referrer
            }
        }
        @Override
        protected String getTableDbName() { return "M_CARRIER_SLIP_SGW"; }
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
         * M_CENTER_CLASS_DTL by my API_BINSYU_CODE, named 'MCenterClassDtlByApiBinsyuCode'.
         * @param centerId The bind parameter of fixed condition for centerId. (NotNull)
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MCenterClassDtlCB.HpSpecification specifyMCenterClassDtlByApiBinsyuCode(final Long centerId) {
            assertRelation("mCenterClassDtlByApiBinsyuCode");
            if (_mCenterClassDtlByApiBinsyuCode == null) {
                _mCenterClassDtlByApiBinsyuCode = new MCenterClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryMCenterClassDtlByApiBinsyuCode()
                                    , () -> _qyCall.qy().queryMCenterClassDtlByApiBinsyuCode(centerId))
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _mCenterClassDtlByApiBinsyuCode.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMCenterClassDtlByApiBinsyuCode()
                      , () -> xsyncQyCall().qy().queryMCenterClassDtlByApiBinsyuCode(centerId)));
                }
            }
            return _mCenterClassDtlByApiBinsyuCode;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * M_CENTER_CLASS_DTL by my API_BINSYU_CODE, named 'MCenterClassDtlByApiBinsyuCode'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MCenterClassDtlCB.HpSpecification specifyMCenterClassDtlByApiBinsyuCode() {
            assertRelation("mCenterClassDtlByApiBinsyuCode");
            if (_mCenterClassDtlByApiBinsyuCode == null) {
                _mCenterClassDtlByApiBinsyuCode = new MCenterClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryMCenterClassDtlByApiBinsyuCode()
                                    , () -> _qyCall.qy().xdfgetConditionQueryMCenterClassDtlByApiBinsyuCode())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _mCenterClassDtlByApiBinsyuCode.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMCenterClassDtlByApiBinsyuCode()
                      , () -> xsyncQyCall().qy().xdfgetConditionQueryMCenterClassDtlByApiBinsyuCode()));
                }
            }
            return _mCenterClassDtlByApiBinsyuCode;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * M_CENTER_CLASS_DTL by my API_DAIBIKI_FLG, named 'MCenterClassDtlByApiDaibikiFlg'.
         * @param centerId The bind parameter of fixed condition for centerId. (NotNull)
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MCenterClassDtlCB.HpSpecification specifyMCenterClassDtlByApiDaibikiFlg(final Long centerId) {
            assertRelation("mCenterClassDtlByApiDaibikiFlg");
            if (_mCenterClassDtlByApiDaibikiFlg == null) {
                _mCenterClassDtlByApiDaibikiFlg = new MCenterClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryMCenterClassDtlByApiDaibikiFlg()
                                    , () -> _qyCall.qy().queryMCenterClassDtlByApiDaibikiFlg(centerId))
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _mCenterClassDtlByApiDaibikiFlg.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMCenterClassDtlByApiDaibikiFlg()
                      , () -> xsyncQyCall().qy().queryMCenterClassDtlByApiDaibikiFlg(centerId)));
                }
            }
            return _mCenterClassDtlByApiDaibikiFlg;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * M_CENTER_CLASS_DTL by my API_DAIBIKI_FLG, named 'MCenterClassDtlByApiDaibikiFlg'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MCenterClassDtlCB.HpSpecification specifyMCenterClassDtlByApiDaibikiFlg() {
            assertRelation("mCenterClassDtlByApiDaibikiFlg");
            if (_mCenterClassDtlByApiDaibikiFlg == null) {
                _mCenterClassDtlByApiDaibikiFlg = new MCenterClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryMCenterClassDtlByApiDaibikiFlg()
                                    , () -> _qyCall.qy().xdfgetConditionQueryMCenterClassDtlByApiDaibikiFlg())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _mCenterClassDtlByApiDaibikiFlg.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMCenterClassDtlByApiDaibikiFlg()
                      , () -> xsyncQyCall().qy().xdfgetConditionQueryMCenterClassDtlByApiDaibikiFlg()));
                }
            }
            return _mCenterClassDtlByApiDaibikiFlg;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * M_CENTER_CLASS_DTL by my API_DAIBIKI_TYPE, named 'MCenterClassDtlByApiDaibikiType'.
         * @param centerId The bind parameter of fixed condition for centerId. (NotNull)
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MCenterClassDtlCB.HpSpecification specifyMCenterClassDtlByApiDaibikiType(final Long centerId) {
            assertRelation("mCenterClassDtlByApiDaibikiType");
            if (_mCenterClassDtlByApiDaibikiType == null) {
                _mCenterClassDtlByApiDaibikiType = new MCenterClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryMCenterClassDtlByApiDaibikiType()
                                    , () -> _qyCall.qy().queryMCenterClassDtlByApiDaibikiType(centerId))
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _mCenterClassDtlByApiDaibikiType.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMCenterClassDtlByApiDaibikiType()
                      , () -> xsyncQyCall().qy().queryMCenterClassDtlByApiDaibikiType(centerId)));
                }
            }
            return _mCenterClassDtlByApiDaibikiType;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * M_CENTER_CLASS_DTL by my API_DAIBIKI_TYPE, named 'MCenterClassDtlByApiDaibikiType'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MCenterClassDtlCB.HpSpecification specifyMCenterClassDtlByApiDaibikiType() {
            assertRelation("mCenterClassDtlByApiDaibikiType");
            if (_mCenterClassDtlByApiDaibikiType == null) {
                _mCenterClassDtlByApiDaibikiType = new MCenterClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryMCenterClassDtlByApiDaibikiType()
                                    , () -> _qyCall.qy().xdfgetConditionQueryMCenterClassDtlByApiDaibikiType())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _mCenterClassDtlByApiDaibikiType.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMCenterClassDtlByApiDaibikiType()
                      , () -> xsyncQyCall().qy().xdfgetConditionQueryMCenterClassDtlByApiDaibikiType()));
                }
            }
            return _mCenterClassDtlByApiDaibikiType;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * M_CENTER_CLASS_DTL by my API_EIDOME_FLG, named 'MCenterClassDtlByApiEidomeFlg'.
         * @param centerId The bind parameter of fixed condition for centerId. (NotNull)
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MCenterClassDtlCB.HpSpecification specifyMCenterClassDtlByApiEidomeFlg(final Long centerId) {
            assertRelation("mCenterClassDtlByApiEidomeFlg");
            if (_mCenterClassDtlByApiEidomeFlg == null) {
                _mCenterClassDtlByApiEidomeFlg = new MCenterClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryMCenterClassDtlByApiEidomeFlg()
                                    , () -> _qyCall.qy().queryMCenterClassDtlByApiEidomeFlg(centerId))
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _mCenterClassDtlByApiEidomeFlg.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMCenterClassDtlByApiEidomeFlg()
                      , () -> xsyncQyCall().qy().queryMCenterClassDtlByApiEidomeFlg(centerId)));
                }
            }
            return _mCenterClassDtlByApiEidomeFlg;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * M_CENTER_CLASS_DTL by my API_EIDOME_FLG, named 'MCenterClassDtlByApiEidomeFlg'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MCenterClassDtlCB.HpSpecification specifyMCenterClassDtlByApiEidomeFlg() {
            assertRelation("mCenterClassDtlByApiEidomeFlg");
            if (_mCenterClassDtlByApiEidomeFlg == null) {
                _mCenterClassDtlByApiEidomeFlg = new MCenterClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryMCenterClassDtlByApiEidomeFlg()
                                    , () -> _qyCall.qy().xdfgetConditionQueryMCenterClassDtlByApiEidomeFlg())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _mCenterClassDtlByApiEidomeFlg.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMCenterClassDtlByApiEidomeFlg()
                      , () -> xsyncQyCall().qy().xdfgetConditionQueryMCenterClassDtlByApiEidomeFlg()));
                }
            }
            return _mCenterClassDtlByApiEidomeFlg;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * M_CENTER_CLASS_DTL by my API_WEIGHT_CD_1, named 'MCenterClassDtlByApiWeightCd1'.
         * @param centerId The bind parameter of fixed condition for centerId. (NotNull)
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MCenterClassDtlCB.HpSpecification specifyMCenterClassDtlByApiWeightCd1(final Long centerId) {
            assertRelation("mCenterClassDtlByApiWeightCd1");
            if (_mCenterClassDtlByApiWeightCd1 == null) {
                _mCenterClassDtlByApiWeightCd1 = new MCenterClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryMCenterClassDtlByApiWeightCd1()
                                    , () -> _qyCall.qy().queryMCenterClassDtlByApiWeightCd1(centerId))
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _mCenterClassDtlByApiWeightCd1.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMCenterClassDtlByApiWeightCd1()
                      , () -> xsyncQyCall().qy().queryMCenterClassDtlByApiWeightCd1(centerId)));
                }
            }
            return _mCenterClassDtlByApiWeightCd1;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * M_CENTER_CLASS_DTL by my API_WEIGHT_CD_1, named 'MCenterClassDtlByApiWeightCd1'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MCenterClassDtlCB.HpSpecification specifyMCenterClassDtlByApiWeightCd1() {
            assertRelation("mCenterClassDtlByApiWeightCd1");
            if (_mCenterClassDtlByApiWeightCd1 == null) {
                _mCenterClassDtlByApiWeightCd1 = new MCenterClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryMCenterClassDtlByApiWeightCd1()
                                    , () -> _qyCall.qy().xdfgetConditionQueryMCenterClassDtlByApiWeightCd1())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _mCenterClassDtlByApiWeightCd1.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMCenterClassDtlByApiWeightCd1()
                      , () -> xsyncQyCall().qy().xdfgetConditionQueryMCenterClassDtlByApiWeightCd1()));
                }
            }
            return _mCenterClassDtlByApiWeightCd1;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * M_CENTER_CLASS_DTL by my API_WEIGHT_CD_2, named 'MCenterClassDtlByApiWeightCd2'.
         * @param centerId The bind parameter of fixed condition for centerId. (NotNull)
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MCenterClassDtlCB.HpSpecification specifyMCenterClassDtlByApiWeightCd2(final Long centerId) {
            assertRelation("mCenterClassDtlByApiWeightCd2");
            if (_mCenterClassDtlByApiWeightCd2 == null) {
                _mCenterClassDtlByApiWeightCd2 = new MCenterClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryMCenterClassDtlByApiWeightCd2()
                                    , () -> _qyCall.qy().queryMCenterClassDtlByApiWeightCd2(centerId))
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _mCenterClassDtlByApiWeightCd2.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMCenterClassDtlByApiWeightCd2()
                      , () -> xsyncQyCall().qy().queryMCenterClassDtlByApiWeightCd2(centerId)));
                }
            }
            return _mCenterClassDtlByApiWeightCd2;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * M_CENTER_CLASS_DTL by my API_WEIGHT_CD_2, named 'MCenterClassDtlByApiWeightCd2'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MCenterClassDtlCB.HpSpecification specifyMCenterClassDtlByApiWeightCd2() {
            assertRelation("mCenterClassDtlByApiWeightCd2");
            if (_mCenterClassDtlByApiWeightCd2 == null) {
                _mCenterClassDtlByApiWeightCd2 = new MCenterClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryMCenterClassDtlByApiWeightCd2()
                                    , () -> _qyCall.qy().xdfgetConditionQueryMCenterClassDtlByApiWeightCd2())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _mCenterClassDtlByApiWeightCd2.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMCenterClassDtlByApiWeightCd2()
                      , () -> xsyncQyCall().qy().xdfgetConditionQueryMCenterClassDtlByApiWeightCd2()));
                }
            }
            return _mCenterClassDtlByApiWeightCd2;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_CLASS_DTL by my CHARACTER_CD, named 'BClassDtlByCharacterCd'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByCharacterCd() {
            assertRelation("bClassDtlByCharacterCd");
            if (_bClassDtlByCharacterCd == null) {
                _bClassDtlByCharacterCd = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByCharacterCd()
                                    , () -> _qyCall.qy().queryBClassDtlByCharacterCd())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByCharacterCd.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByCharacterCd()
                      , () -> xsyncQyCall().qy().queryBClassDtlByCharacterCd()));
                }
            }
            return _bClassDtlByCharacterCd;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_CLASS_DTL by my COD_CLS, named 'BClassDtlByCodCls'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByCodCls() {
            assertRelation("bClassDtlByCodCls");
            if (_bClassDtlByCodCls == null) {
                _bClassDtlByCodCls = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByCodCls()
                                    , () -> _qyCall.qy().queryBClassDtlByCodCls())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByCodCls.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByCodCls()
                      , () -> xsyncQyCall().qy().queryBClassDtlByCodCls()));
                }
            }
            return _bClassDtlByCodCls;
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
         * M_CENTER_CLASS_DTL by my SEAL_TYPE1, named 'MCenterClassDtlBySealType1'.
         * @param centerId The bind parameter of fixed condition for centerId. (NotNull)
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MCenterClassDtlCB.HpSpecification specifyMCenterClassDtlBySealType1(final Long centerId) {
            assertRelation("mCenterClassDtlBySealType1");
            if (_mCenterClassDtlBySealType1 == null) {
                _mCenterClassDtlBySealType1 = new MCenterClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryMCenterClassDtlBySealType1()
                                    , () -> _qyCall.qy().queryMCenterClassDtlBySealType1(centerId))
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _mCenterClassDtlBySealType1.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMCenterClassDtlBySealType1()
                      , () -> xsyncQyCall().qy().queryMCenterClassDtlBySealType1(centerId)));
                }
            }
            return _mCenterClassDtlBySealType1;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * M_CENTER_CLASS_DTL by my SEAL_TYPE1, named 'MCenterClassDtlBySealType1'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MCenterClassDtlCB.HpSpecification specifyMCenterClassDtlBySealType1() {
            assertRelation("mCenterClassDtlBySealType1");
            if (_mCenterClassDtlBySealType1 == null) {
                _mCenterClassDtlBySealType1 = new MCenterClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryMCenterClassDtlBySealType1()
                                    , () -> _qyCall.qy().xdfgetConditionQueryMCenterClassDtlBySealType1())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _mCenterClassDtlBySealType1.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMCenterClassDtlBySealType1()
                      , () -> xsyncQyCall().qy().xdfgetConditionQueryMCenterClassDtlBySealType1()));
                }
            }
            return _mCenterClassDtlBySealType1;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * M_CENTER_CLASS_DTL by my SEAL_TYPE2, named 'MCenterClassDtlBySealType2'.
         * @param centerId The bind parameter of fixed condition for centerId. (NotNull)
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MCenterClassDtlCB.HpSpecification specifyMCenterClassDtlBySealType2(final Long centerId) {
            assertRelation("mCenterClassDtlBySealType2");
            if (_mCenterClassDtlBySealType2 == null) {
                _mCenterClassDtlBySealType2 = new MCenterClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryMCenterClassDtlBySealType2()
                                    , () -> _qyCall.qy().queryMCenterClassDtlBySealType2(centerId))
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _mCenterClassDtlBySealType2.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMCenterClassDtlBySealType2()
                      , () -> xsyncQyCall().qy().queryMCenterClassDtlBySealType2(centerId)));
                }
            }
            return _mCenterClassDtlBySealType2;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * M_CENTER_CLASS_DTL by my SEAL_TYPE2, named 'MCenterClassDtlBySealType2'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MCenterClassDtlCB.HpSpecification specifyMCenterClassDtlBySealType2() {
            assertRelation("mCenterClassDtlBySealType2");
            if (_mCenterClassDtlBySealType2 == null) {
                _mCenterClassDtlBySealType2 = new MCenterClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryMCenterClassDtlBySealType2()
                                    , () -> _qyCall.qy().xdfgetConditionQueryMCenterClassDtlBySealType2())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _mCenterClassDtlBySealType2.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMCenterClassDtlBySealType2()
                      , () -> xsyncQyCall().qy().xdfgetConditionQueryMCenterClassDtlBySealType2()));
                }
            }
            return _mCenterClassDtlBySealType2;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * M_CENTER_CLASS_DTL by my SEAL_TYPE3, named 'MCenterClassDtlBySealType3'.
         * @param centerId The bind parameter of fixed condition for centerId. (NotNull)
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MCenterClassDtlCB.HpSpecification specifyMCenterClassDtlBySealType3(final Long centerId) {
            assertRelation("mCenterClassDtlBySealType3");
            if (_mCenterClassDtlBySealType3 == null) {
                _mCenterClassDtlBySealType3 = new MCenterClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryMCenterClassDtlBySealType3()
                                    , () -> _qyCall.qy().queryMCenterClassDtlBySealType3(centerId))
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _mCenterClassDtlBySealType3.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMCenterClassDtlBySealType3()
                      , () -> xsyncQyCall().qy().queryMCenterClassDtlBySealType3(centerId)));
                }
            }
            return _mCenterClassDtlBySealType3;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * M_CENTER_CLASS_DTL by my SEAL_TYPE3, named 'MCenterClassDtlBySealType3'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MCenterClassDtlCB.HpSpecification specifyMCenterClassDtlBySealType3() {
            assertRelation("mCenterClassDtlBySealType3");
            if (_mCenterClassDtlBySealType3 == null) {
                _mCenterClassDtlBySealType3 = new MCenterClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryMCenterClassDtlBySealType3()
                                    , () -> _qyCall.qy().xdfgetConditionQueryMCenterClassDtlBySealType3())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _mCenterClassDtlBySealType3.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMCenterClassDtlBySealType3()
                      , () -> xsyncQyCall().qy().xdfgetConditionQueryMCenterClassDtlBySealType3()));
                }
            }
            return _mCenterClassDtlBySealType3;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_CLASS_DTL by my SETTLEMENT_TYPE, named 'BClassDtlBySettlementType'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlBySettlementType() {
            assertRelation("bClassDtlBySettlementType");
            if (_bClassDtlBySettlementType == null) {
                _bClassDtlBySettlementType = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlBySettlementType()
                                    , () -> _qyCall.qy().queryBClassDtlBySettlementType())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlBySettlementType.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlBySettlementType()
                      , () -> xsyncQyCall().qy().queryBClassDtlBySettlementType()));
                }
            }
            return _bClassDtlBySettlementType;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * M_CENTER_CLASS_DTL by my SLIP_SHAPE_CD, named 'MCenterClassDtlBySlipShapeCd'.
         * @param centerId The bind parameter of fixed condition for centerId. (NotNull)
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MCenterClassDtlCB.HpSpecification specifyMCenterClassDtlBySlipShapeCd(final Long centerId) {
            assertRelation("mCenterClassDtlBySlipShapeCd");
            if (_mCenterClassDtlBySlipShapeCd == null) {
                _mCenterClassDtlBySlipShapeCd = new MCenterClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryMCenterClassDtlBySlipShapeCd()
                                    , () -> _qyCall.qy().queryMCenterClassDtlBySlipShapeCd(centerId))
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _mCenterClassDtlBySlipShapeCd.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMCenterClassDtlBySlipShapeCd()
                      , () -> xsyncQyCall().qy().queryMCenterClassDtlBySlipShapeCd(centerId)));
                }
            }
            return _mCenterClassDtlBySlipShapeCd;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * M_CENTER_CLASS_DTL by my SLIP_SHAPE_CD, named 'MCenterClassDtlBySlipShapeCd'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MCenterClassDtlCB.HpSpecification specifyMCenterClassDtlBySlipShapeCd() {
            assertRelation("mCenterClassDtlBySlipShapeCd");
            if (_mCenterClassDtlBySlipShapeCd == null) {
                _mCenterClassDtlBySlipShapeCd = new MCenterClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryMCenterClassDtlBySlipShapeCd()
                                    , () -> _qyCall.qy().xdfgetConditionQueryMCenterClassDtlBySlipShapeCd())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _mCenterClassDtlBySlipShapeCd.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMCenterClassDtlBySlipShapeCd()
                      , () -> xsyncQyCall().qy().xdfgetConditionQueryMCenterClassDtlBySlipShapeCd()));
                }
            }
            return _mCenterClassDtlBySlipShapeCd;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * M_CENTER_CLASS_DTL by my TRANSPORT_TYPE_ITEM, named 'MCenterClassDtlByTransportTypeItem'.
         * @param centerId The bind parameter of fixed condition for centerId. (NotNull)
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MCenterClassDtlCB.HpSpecification specifyMCenterClassDtlByTransportTypeItem(final Long centerId) {
            assertRelation("mCenterClassDtlByTransportTypeItem");
            if (_mCenterClassDtlByTransportTypeItem == null) {
                _mCenterClassDtlByTransportTypeItem = new MCenterClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryMCenterClassDtlByTransportTypeItem()
                                    , () -> _qyCall.qy().queryMCenterClassDtlByTransportTypeItem(centerId))
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _mCenterClassDtlByTransportTypeItem.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMCenterClassDtlByTransportTypeItem()
                      , () -> xsyncQyCall().qy().queryMCenterClassDtlByTransportTypeItem(centerId)));
                }
            }
            return _mCenterClassDtlByTransportTypeItem;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * M_CENTER_CLASS_DTL by my TRANSPORT_TYPE_ITEM, named 'MCenterClassDtlByTransportTypeItem'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MCenterClassDtlCB.HpSpecification specifyMCenterClassDtlByTransportTypeItem() {
            assertRelation("mCenterClassDtlByTransportTypeItem");
            if (_mCenterClassDtlByTransportTypeItem == null) {
                _mCenterClassDtlByTransportTypeItem = new MCenterClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryMCenterClassDtlByTransportTypeItem()
                                    , () -> _qyCall.qy().xdfgetConditionQueryMCenterClassDtlByTransportTypeItem())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _mCenterClassDtlByTransportTypeItem.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMCenterClassDtlByTransportTypeItem()
                      , () -> xsyncQyCall().qy().xdfgetConditionQueryMCenterClassDtlByTransportTypeItem()));
                }
            }
            return _mCenterClassDtlByTransportTypeItem;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * M_CENTER_CLASS_DTL by my TRANSPORT_TYPE_SPEED, named 'MCenterClassDtlByTransportTypeSpeed'.
         * @param centerId The bind parameter of fixed condition for centerId. (NotNull)
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MCenterClassDtlCB.HpSpecification specifyMCenterClassDtlByTransportTypeSpeed(final Long centerId) {
            assertRelation("mCenterClassDtlByTransportTypeSpeed");
            if (_mCenterClassDtlByTransportTypeSpeed == null) {
                _mCenterClassDtlByTransportTypeSpeed = new MCenterClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryMCenterClassDtlByTransportTypeSpeed()
                                    , () -> _qyCall.qy().queryMCenterClassDtlByTransportTypeSpeed(centerId))
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _mCenterClassDtlByTransportTypeSpeed.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMCenterClassDtlByTransportTypeSpeed()
                      , () -> xsyncQyCall().qy().queryMCenterClassDtlByTransportTypeSpeed(centerId)));
                }
            }
            return _mCenterClassDtlByTransportTypeSpeed;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * M_CENTER_CLASS_DTL by my TRANSPORT_TYPE_SPEED, named 'MCenterClassDtlByTransportTypeSpeed'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MCenterClassDtlCB.HpSpecification specifyMCenterClassDtlByTransportTypeSpeed() {
            assertRelation("mCenterClassDtlByTransportTypeSpeed");
            if (_mCenterClassDtlByTransportTypeSpeed == null) {
                _mCenterClassDtlByTransportTypeSpeed = new MCenterClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryMCenterClassDtlByTransportTypeSpeed()
                                    , () -> _qyCall.qy().xdfgetConditionQueryMCenterClassDtlByTransportTypeSpeed())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _mCenterClassDtlByTransportTypeSpeed.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMCenterClassDtlByTransportTypeSpeed()
                      , () -> xsyncQyCall().qy().xdfgetConditionQueryMCenterClassDtlByTransportTypeSpeed()));
                }
            }
            return _mCenterClassDtlByTransportTypeSpeed;
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from M_DELIVERY_COURSE where ...) as FOO_MAX} <br>
         * M_DELIVERY_COURSE by CARRIER_SLIP_SGW_ID, named 'MDeliveryCourseList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(courseCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     courseCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     courseCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, MDeliveryCourse.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<MDeliveryCourseCB, MCarrierSlipSgwCQ> derivedMDeliveryCourseList() {
            assertDerived("mDeliveryCourseList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<MDeliveryCourseCB> sq, MCarrierSlipSgwCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveMDeliveryCourseList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)MyselfDerived (SubQuery).
         * @return The object to set up a function for myself table. (NotNull)
         */
        public HpSDRFunction<MCarrierSlipSgwCB, MCarrierSlipSgwCQ> myselfDerived() {
            assertDerived("myselfDerived"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<MCarrierSlipSgwCB> sq, MCarrierSlipSgwCQ cq, String al, DerivedReferrerOption op)
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
    public MCarrierSlipSgwCB dreamCruiseCB() {
        MCarrierSlipSgwCB cb = new MCarrierSlipSgwCB();
        cb.xsetupForDreamCruise((MCarrierSlipSgwCB) this);
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
    public HpColQyOperand<MCarrierSlipSgwCB> columnQuery(final SpecifyQuery<MCarrierSlipSgwCB> colCBLambda) {
        return xcreateColQyOperand((rightSp, operand) -> {
            return xcolqy(xcreateColumnQueryCB(), xcreateColumnQueryCB(), colCBLambda, rightSp, operand);
        });
    }

    protected MCarrierSlipSgwCB xcreateColumnQueryCB() {
        MCarrierSlipSgwCB cb = new MCarrierSlipSgwCB();
        cb.xsetupForColumnQuery((MCarrierSlipSgwCB)this);
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
    public void orScopeQuery(OrQuery<MCarrierSlipSgwCB> orCBLambda) {
        xorSQ((MCarrierSlipSgwCB)this, orCBLambda);
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
    public void orScopeQueryAndPart(AndQuery<MCarrierSlipSgwCB> andCBLambda) {
        xorSQAP((MCarrierSlipSgwCB)this, andCBLambda);
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
        final MCarrierSlipSgwCB cb;
        if (mainCB != null) {
            cb = (MCarrierSlipSgwCB)mainCB;
        } else {
            cb = new MCarrierSlipSgwCB();
        }
        specify().xsetSyncQyCall(xcreateSpQyCall(() -> true, () -> cb.query()));
    }

    // ===================================================================================
    //                                                                            Internal
    //                                                                            ========
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xgetConditionBeanClassNameInternally() { return MCarrierSlipSgwCB.class.getName(); }
    protected String xgetConditionQueryClassNameInternally() { return MCarrierSlipSgwCQ.class.getName(); }
    protected String xgetSubQueryClassNameInternally() { return SubQuery.class.getName(); }
    protected String xgetConditionOptionClassNameInternally() { return ConditionOption.class.getName(); }
}
