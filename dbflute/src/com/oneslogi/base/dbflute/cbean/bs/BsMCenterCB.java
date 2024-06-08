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
 * The base condition-bean of M_CENTER.
 * @author DBFlute(AutoGenerator)
 */
public class BsMCenterCB extends AbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MCenterCQ _conditionQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMCenterCB() {
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
        return "M_CENTER";
    }

    // ===================================================================================
    //                                                                 PrimaryKey Handling
    //                                                                 ===================
    /**
     * Accept the query condition of primary key as equal.
     * @param centerId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return this. (NotNull)
     */
    public MCenterCB acceptPK(Long centerId) {
        assertObjectNotNull("centerId", centerId);
        BsMCenterCB cb = this;
        cb.query().setCenterId_Equal(centerId);
        return (MCenterCB)this;
    }

    /**
     * Accept the query condition of primary key as equal. (old style)
     * @param centerId : PK, ID, NotNull, bigint identity(19). (NotNull)
     */
    public void acceptPrimaryKey(Long centerId) {
        assertObjectNotNull("centerId", centerId);
        BsMCenterCB cb = this;
        cb.query().setCenterId_Equal(centerId);
    }

    /**
     * Accept the query condition of unique key as equal.
     * @param centerCd : UQ, NotNull, varchar(30). (NotNull)
     * @return this. (NotNull)
     */
    public MCenterCB acceptUniqueOf(String centerCd) {
        assertObjectNotNull("centerCd", centerCd);
        BsMCenterCB cb = this;
        cb.query().setCenterCd_Equal(centerCd);
        return (MCenterCB)this;
    }

    public ConditionBean addOrderBy_PK_Asc() {
        query().addOrderBy_CenterId_Asc();
        return this;
    }

    public ConditionBean addOrderBy_PK_Desc() {
        query().addOrderBy_CenterId_Desc();
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
    public MCenterCQ query() {
        assertQueryPurpose(); // assert only when user-public query
        return doGetConditionQuery();
    }

    public MCenterCQ xdfgetConditionQuery() { // public for parameter comment and internal
        return doGetConditionQuery();
    }

    protected MCenterCQ doGetConditionQuery() {
        if (_conditionQuery == null) {
            _conditionQuery = createLocalCQ();
        }
        return _conditionQuery;
    }

    protected MCenterCQ createLocalCQ() {
        return xcreateCQ(null, getSqlClause(), getSqlClause().getBasePointAliasName(), 0);
    }

    protected MCenterCQ xcreateCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        MCenterCQ cq = xnewCQ(childQuery, sqlClause, aliasName, nestLevel);
        cq.xsetBaseCB(this);
        return cq;
    }

    protected MCenterCQ xnewCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        return new MCenterCQ(childQuery, sqlClause, aliasName, nestLevel);
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
    public void union(UnionQuery<MCenterCB> unionCBLambda) {
        final MCenterCB cb = new MCenterCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionCBLambda.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final MCenterCQ cq = cb.query(); query().xsetUnionQuery(cq);
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
    public void unionAll(UnionQuery<MCenterCB> unionCBLambda) {
        final MCenterCB cb = new MCenterCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionCBLambda.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final MCenterCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
    }

    // ===================================================================================
    //                                                                         SetupSelect
    //                                                                         ===========
    /**
     * Set up relation columns to select clause. <br>
     * B_TIME_ZONE by my TIME_ZONE_ID, named 'BTimeZone'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BTimeZone()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mCenter</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mCenter</span>.<span style="color: #CC4747">getBTimeZone()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     */
    public void setupSelect_BTimeZone() {
        assertSetupSelectPurpose("bTimeZone");
        if (hasSpecifiedLocalColumn()) {
            specify().columnTimeZoneId();
        }
        doSetupSelect(() -> query().queryBTimeZone());
    }

    protected BCultureNss _nssBCulture;
    public BCultureNss xdfgetNssBCulture() {
        if (_nssBCulture == null) { _nssBCulture = new BCultureNss(null); }
        return _nssBCulture;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CULTURE by my CULTURE_ID, named 'BCulture'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BCulture()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mCenter</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mCenter</span>.<span style="color: #CC4747">getBCulture()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BCultureNss setupSelect_BCulture() {
        assertSetupSelectPurpose("bCulture");
        if (hasSpecifiedLocalColumn()) {
            specify().columnCultureId();
        }
        doSetupSelect(() -> query().queryBCulture());
        if (_nssBCulture == null || !_nssBCulture.hasConditionQuery())
        { _nssBCulture = new BCultureNss(query().queryBCulture()); }
        return _nssBCulture;
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
     * <span style="color: #0000C0">mCenterBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByDelFlg()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mCenter</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mCenter</span>.<span style="color: #CC4747">getBClassDtlByDelFlg()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
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

    public static class HpSpecification extends HpAbstractSpecification<MCenterCQ> {
        protected BTimeZoneCB.HpSpecification _bTimeZone;
        protected BCultureCB.HpSpecification _bCulture;
        protected BClassDtlCB.HpSpecification _bClassDtlByDelFlg;
        public HpSpecification(ConditionBean baseCB, HpSpQyCall<MCenterCQ> qyCall
                             , HpCBPurpose purpose, DBMetaProvider dbmetaProvider
                             , HpSDRFunctionFactory sdrFuncFactory)
        { super(baseCB, qyCall, purpose, dbmetaProvider, sdrFuncFactory); }
        /**
         * CENTER_ID: {PK, ID, NotNull, bigint identity(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCenterId() { return doColumn("CENTER_ID"); }
        /**
         * CENTER_CD: {UQ, NotNull, varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCenterCd() { return doColumn("CENTER_CD"); }
        /**
         * CENTER_NM: {NotNull, varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCenterNm() { return doColumn("CENTER_NM"); }
        /**
         * CENTER_ABBR: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCenterAbbr() { return doColumn("CENTER_ABBR"); }
        /**
         * CULTURE_ID: {IX, bigint(19), FK to B_CULTURE}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCultureId() { return doColumn("CULTURE_ID"); }
        /**
         * TIME_ZONE_ID: {bigint(19), FK to B_TIME_ZONE}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnTimeZoneId() { return doColumn("TIME_ZONE_ID"); }
        /**
         * WarehouseGroup: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnWarehousegroup() { return doColumn("WarehouseGroup"); }
        /**
         * VirtualWhouseFlg: {char(1)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnVirtualwhouseflg() { return doColumn("VirtualWhouseFlg"); }
        /**
         * Aname: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnAname() { return doColumn("Aname"); }
        /**
         * Address1: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnAddress1() { return doColumn("Address1"); }
        /**
         * Address2: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnAddress2() { return doColumn("Address2"); }
        /**
         * Address3: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnAddress3() { return doColumn("Address3"); }
        /**
         * PostNo: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnPostno() { return doColumn("PostNo"); }
        /**
         * CountryCd: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCountrycd() { return doColumn("CountryCd"); }
        /**
         * PortCd: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnPortcd() { return doColumn("PortCd"); }
        /**
         * DistrictCd: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDistrictcd() { return doColumn("DistrictCd"); }
        /**
         * Phone1: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnPhone1() { return doColumn("Phone1"); }
        /**
         * Phone2: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnPhone2() { return doColumn("Phone2"); }
        /**
         * Fax1: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnFax1() { return doColumn("Fax1"); }
        /**
         * Fax2: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnFax2() { return doColumn("Fax2"); }
        /**
         * WarehouseFlg: {char(1)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnWarehouseflg() { return doColumn("WarehouseFlg"); }
        /**
         * RefName: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnRefname() { return doColumn("RefName"); }
        /**
         * SubcontractFlg: {decimal(16, 6)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSubcontractflg() { return doColumn("SubcontractFlg"); }
        /**
         * WeightCapacity: {decimal(16, 6)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnWeightcapacity() { return doColumn("WeightCapacity"); }
        /**
         * Capacity: {decimal(16, 6)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCapacity() { return doColumn("Capacity"); }
        /**
         * HULFT_ID: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnHulftId() { return doColumn("HULFT_ID"); }
        /**
         * WarehouseCls: {char(1)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnWarehousecls() { return doColumn("WarehouseCls"); }
        /**
         * CMLRASID: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCmlrasid() { return doColumn("CMLRASID"); }
        /**
         * OWN_OR_ANOTHER_FLG: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnOwnOrAnotherFlg() { return doColumn("OWN_OR_ANOTHER_FLG"); }
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
            columnCenterId(); // PK
            if (qyCall().qy().hasConditionQueryBTimeZone()
                    || qyCall().qy().xgetReferrerQuery() instanceof BTimeZoneCQ) {
                columnTimeZoneId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBCulture()
                    || qyCall().qy().xgetReferrerQuery() instanceof BCultureCQ) {
                columnCultureId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByDelFlg()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnDelFlg(); // FK or one-to-one referrer
            }
        }
        @Override
        protected String getTableDbName() { return "M_CENTER"; }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_TIME_ZONE by my TIME_ZONE_ID, named 'BTimeZone'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BTimeZoneCB.HpSpecification specifyBTimeZone() {
            assertRelation("bTimeZone");
            if (_bTimeZone == null) {
                _bTimeZone = new BTimeZoneCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBTimeZone()
                                    , () -> _qyCall.qy().queryBTimeZone())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bTimeZone.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBTimeZone()
                      , () -> xsyncQyCall().qy().queryBTimeZone()));
                }
            }
            return _bTimeZone;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_CULTURE by my CULTURE_ID, named 'BCulture'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BCultureCB.HpSpecification specifyBCulture() {
            assertRelation("bCulture");
            if (_bCulture == null) {
                _bCulture = new BCultureCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBCulture()
                                    , () -> _qyCall.qy().queryBCulture())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bCulture.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBCulture()
                      , () -> xsyncQyCall().qy().queryBCulture()));
                }
            }
            return _bCulture;
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
         * {select max(FOO) from M_BOX where ...) as FOO_MAX} <br>
         * M_BOX by CENTER_ID, named 'MBoxList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(boxCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     boxCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     boxCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, MBox.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<MBoxCB, MCenterCQ> derivedMBoxList() {
            assertDerived("mBoxList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<MBoxCB> sq, MCenterCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveMBoxList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from M_BOX_GRP where ...) as FOO_MAX} <br>
         * M_BOX_GRP by CENTER_ID, named 'MBoxGrpList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(grpCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     grpCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     grpCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, MBoxGrp.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<MBoxGrpCB, MCenterCQ> derivedMBoxGrpList() {
            assertDerived("mBoxGrpList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<MBoxGrpCB> sq, MCenterCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveMBoxGrpList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from M_CARRIER where ...) as FOO_MAX} <br>
         * M_CARRIER by CENTER_ID, named 'MCarrierList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(carrierCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     carrierCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     carrierCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, MCarrier.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<MCarrierCB, MCenterCQ> derivedMCarrierList() {
            assertDerived("mCarrierList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<MCarrierCB> sq, MCenterCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveMCarrierList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from M_CARRIER_SLIP_SGW where ...) as FOO_MAX} <br>
         * M_CARRIER_SLIP_SGW by CENTER_ID, named 'MCarrierSlipSgwList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(sgwCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     sgwCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     sgwCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, MCarrierSlipSgw.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<MCarrierSlipSgwCB, MCenterCQ> derivedMCarrierSlipSgwList() {
            assertDerived("mCarrierSlipSgwList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<MCarrierSlipSgwCB> sq, MCenterCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveMCarrierSlipSgwList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from M_CARRIER_SLIP_YMT where ...) as FOO_MAX} <br>
         * M_CARRIER_SLIP_YMT by CENTER_ID, named 'MCarrierSlipYmtList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(ymtCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     ymtCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     ymtCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, MCarrierSlipYmt.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<MCarrierSlipYmtCB, MCenterCQ> derivedMCarrierSlipYmtList() {
            assertDerived("mCarrierSlipYmtList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<MCarrierSlipYmtCB> sq, MCenterCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveMCarrierSlipYmtList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from M_CARRIER_SLIP_YUPK where ...) as FOO_MAX} <br>
         * M_CARRIER_SLIP_YUPK by CENTER_ID, named 'MCarrierSlipYupkList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(yupkCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     yupkCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     yupkCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, MCarrierSlipYupk.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<MCarrierSlipYupkCB, MCenterCQ> derivedMCarrierSlipYupkList() {
            assertDerived("mCarrierSlipYupkList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<MCarrierSlipYupkCB> sq, MCenterCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveMCarrierSlipYupkList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from M_CBLK where ...) as FOO_MAX} <br>
         * M_CBLK by CENTER_ID, named 'MCblkList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(cblkCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     cblkCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     cblkCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, MCblk.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<MCblkCB, MCenterCQ> derivedMCblkList() {
            assertDerived("mCblkList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<MCblkCB> sq, MCenterCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveMCblkList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from M_CBRCTG where ...) as FOO_MAX} <br>
         * M_CBRCTG by CENTER_ID, named 'MCbrctgList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(cbrctgCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     cbrctgCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     cbrctgCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, MCbrctg.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<MCbrctgCB, MCenterCQ> derivedMCbrctgList() {
            assertDerived("mCbrctgList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<MCbrctgCB> sq, MCenterCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveMCbrctgList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from M_CDRCATT where ...) as FOO_MAX} <br>
         * M_CDRCATT by CENTER_ID, named 'MCdrcattList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(cdrcattCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     cdrcattCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     cdrcattCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, MCdrcatt.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<MCdrcattCB, MCenterCQ> derivedMCdrcattList() {
            assertDerived("mCdrcattList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<MCdrcattCB> sq, MCenterCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveMCdrcattList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from M_CENTER_CLASS where ...) as FOO_MAX} <br>
         * M_CENTER_CLASS by CENTER_ID, named 'MCenterClassList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(classCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     classCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     classCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, MCenterClass.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<MCenterClassCB, MCenterCQ> derivedMCenterClassList() {
            assertDerived("mCenterClassList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<MCenterClassCB> sq, MCenterCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveMCenterClassList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from M_CENTER_COL where ...) as FOO_MAX} <br>
         * M_CENTER_COL by CENTER_ID, named 'MCenterColList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(colCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     colCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     colCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, MCenterCol.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<MCenterColCB, MCenterCQ> derivedMCenterColList() {
            assertDerived("mCenterColList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<MCenterColCB> sq, MCenterCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveMCenterColList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from M_CENTER_CUSTOMER where ...) as FOO_MAX} <br>
         * M_CENTER_CUSTOMER by CENTER_ID, named 'MCenterCustomerList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(customerCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     customerCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     customerCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, MCenterCustomer.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<MCenterCustomerCB, MCenterCQ> derivedMCenterCustomerList() {
            assertDerived("mCenterCustomerList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<MCenterCustomerCB> sq, MCenterCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveMCenterCustomerList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from M_CENTER_ITEM where ...) as FOO_MAX} <br>
         * M_CENTER_ITEM by CENTER_ID, named 'MCenterItemList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(itemCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     itemCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     itemCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, MCenterItem.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<MCenterItemCB, MCenterCQ> derivedMCenterItemList() {
            assertDerived("mCenterItemList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<MCenterItemCB> sq, MCenterCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveMCenterItemList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from M_CENTER_SCREEN where ...) as FOO_MAX} <br>
         * M_CENTER_SCREEN by CENTER_ID, named 'MCenterScreenList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(screenCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     screenCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     screenCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, MCenterScreen.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<MCenterScreenCB, MCenterCQ> derivedMCenterScreenList() {
            assertDerived("mCenterScreenList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<MCenterScreenCB> sq, MCenterCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveMCenterScreenList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from M_CLIENT_CENTER where ...) as FOO_MAX} <br>
         * M_CLIENT_CENTER by CENTER_ID, named 'MClientCenterList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(centerCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     centerCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     centerCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, MClientCenter.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<MClientCenterCB, MCenterCQ> derivedMClientCenterList() {
            assertDerived("mClientCenterList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<MClientCenterCB> sq, MCenterCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveMClientCenterList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from M_CLIN where ...) as FOO_MAX} <br>
         * M_CLIN by CENTER_ID, named 'MClinList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(clinCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     clinCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     clinCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, MClin.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<MClinCB, MCenterCQ> derivedMClinList() {
            assertDerived("mClinList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<MClinCB> sq, MCenterCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveMClinList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from M_CORG where ...) as FOO_MAX} <br>
         * M_CORG by CENTER_ID, named 'MCorgList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(corgCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     corgCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     corgCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, MCorg.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<MCorgCB, MCenterCQ> derivedMCorgList() {
            assertDerived("mCorgList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<MCorgCB> sq, MCenterCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveMCorgList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from M_DELIVERY_COURSE where ...) as FOO_MAX} <br>
         * M_DELIVERY_COURSE by CENTER_ID, named 'MDeliveryCourseList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(courseCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     courseCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     courseCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, MDeliveryCourse.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<MDeliveryCourseCB, MCenterCQ> derivedMDeliveryCourseList() {
            assertDerived("mDeliveryCourseList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<MDeliveryCourseCB> sq, MCenterCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveMDeliveryCourseList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from M_LOCATION where ...) as FOO_MAX} <br>
         * M_LOCATION by CENTER_ID, named 'MLocationList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(locationCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     locationCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     locationCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, MLocation.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<MLocationCB, MCenterCQ> derivedMLocationList() {
            assertDerived("mLocationList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<MLocationCB> sq, MCenterCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveMLocationList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from M_MFINVOPERATION where ...) as FOO_MAX} <br>
         * M_MFINVOPERATION by CENTER_ID, named 'MMfinvoperationList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(mfinvoperationCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     mfinvoperationCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     mfinvoperationCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, MMfinvoperation.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<MMfinvoperationCB, MCenterCQ> derivedMMfinvoperationList() {
            assertDerived("mMfinvoperationList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<MMfinvoperationCB> sq, MCenterCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveMMfinvoperationList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from M_MFMONTHCHG where ...) as FOO_MAX} <br>
         * M_MFMONTHCHG by CENTER_ID, named 'MMfmonthchgList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(mfmonthchgCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     mfmonthchgCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     mfmonthchgCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, MMfmonthchg.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<MMfmonthchgCB, MCenterCQ> derivedMMfmonthchgList() {
            assertDerived("mMfmonthchgList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<MMfmonthchgCB> sq, MCenterCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveMMfmonthchgList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from M_MFSTOCKITEM where ...) as FOO_MAX} <br>
         * M_MFSTOCKITEM by CENTER_ID, named 'MMfstockitemList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(mfstockitemCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     mfstockitemCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     mfstockitemCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, MMfstockitem.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<MMfstockitemCB, MCenterCQ> derivedMMfstockitemList() {
            assertDerived("mMfstockitemList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<MMfstockitemCB> sq, MCenterCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveMMfstockitemList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from M_MFWHSTRCT where ...) as FOO_MAX} <br>
         * M_MFWHSTRCT by CENTER_ID, named 'MMfwhstrctList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(mfwhstrctCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     mfwhstrctCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     mfwhstrctCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, MMfwhstrct.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<MMfwhstrctCB, MCenterCQ> derivedMMfwhstrctList() {
            assertDerived("mMfwhstrctList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<MMfwhstrctCB> sq, MCenterCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveMMfwhstrctList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from M_MFWHxITEM where ...) as FOO_MAX} <br>
         * M_MFWHxITEM by CENTER_ID, named 'MMfwhxitemList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(entityCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     entityCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     entityCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, MMfwhxitem.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<MMfwhxitemCB, MCenterCQ> derivedMMfwhxitemList() {
            assertDerived("mMfwhxitemList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<MMfwhxitemCB> sq, MCenterCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveMMfwhxitemList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from M_NUMBERING_CENTER where ...) as FOO_MAX} <br>
         * M_NUMBERING_CENTER by CENTER_ID, named 'MNumberingCenterList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(centerCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     centerCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     centerCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, MNumberingCenter.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<MNumberingCenterCB, MCenterCQ> derivedMNumberingCenterList() {
            assertDerived("mNumberingCenterList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<MNumberingCenterCB> sq, MCenterCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveMNumberingCenterList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from M_USER_CENTER where ...) as FOO_MAX} <br>
         * M_USER_CENTER by CENTER_ID, named 'MUserCenterList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(centerCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     centerCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     centerCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, MUserCenter.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<MUserCenterCB, MCenterCQ> derivedMUserCenterList() {
            assertDerived("mUserCenterList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<MUserCenterCB> sq, MCenterCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveMUserCenterList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from M_USER_LOGIN where ...) as FOO_MAX} <br>
         * M_USER_LOGIN by CENTER_ID, named 'MUserLoginList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(loginCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     loginCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     loginCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, MUserLogin.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<MUserLoginCB, MCenterCQ> derivedMUserLoginList() {
            assertDerived("mUserLoginList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<MUserLoginCB> sq, MCenterCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveMUserLoginList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from M_WAREHOUSE where ...) as FOO_MAX} <br>
         * M_WAREHOUSE by CENTER_ID, named 'MWarehouseList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(warehouseCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     warehouseCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     warehouseCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, MWarehouse.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<MWarehouseCB, MCenterCQ> derivedMWarehouseList() {
            assertDerived("mWarehouseList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<MWarehouseCB> sq, MCenterCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveMWarehouseList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from M_WEB_HT_INFO where ...) as FOO_MAX} <br>
         * M_WEB_HT_INFO by CENTER_ID, named 'MWebHtInfoList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(infoCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     infoCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     infoCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, MWebHtInfo.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<MWebHtInfoCB, MCenterCQ> derivedMWebHtInfoList() {
            assertDerived("mWebHtInfoList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<MWebHtInfoCB> sq, MCenterCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveMWebHtInfoList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from T_ALLOC_INST_H where ...) as FOO_MAX} <br>
         * T_ALLOC_INST_H by CENTER_ID, named 'TAllocInstHList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     hCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     hCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TAllocInstH.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TAllocInstHCB, MCenterCQ> derivedTAllocInstHList() {
            assertDerived("tAllocInstHList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TAllocInstHCB> sq, MCenterCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTAllocInstHList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from T_CCOPAM where ...) as FOO_MAX} <br>
         * T_CCOPAM by CENTER_ID, named 'TCcopamList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(ccopamCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     ccopamCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     ccopamCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TCcopam.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TCcopamCB, MCenterCQ> derivedTCcopamList() {
            assertDerived("tCcopamList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TCcopamCB> sq, MCenterCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTCcopamList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from T_CENTER_SYMBOL where ...) as FOO_MAX} <br>
         * T_CENTER_SYMBOL by CENTER_ID, named 'TCenterSymbolList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(symbolCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     symbolCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     symbolCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TCenterSymbol.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TCenterSymbolCB, MCenterCQ> derivedTCenterSymbolList() {
            assertDerived("tCenterSymbolList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TCenterSymbolCB> sq, MCenterCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTCenterSymbolList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from T_CORDHDR where ...) as FOO_MAX} <br>
         * T_CORDHDR by CENTER_ID, named 'TCordhdrList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(cordhdrCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     cordhdrCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     cordhdrCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TCordhdr.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TCordhdrCB, MCenterCQ> derivedTCordhdrList() {
            assertDerived("tCordhdrList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TCordhdrCB> sq, MCenterCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTCordhdrList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from T_CSRWHADM where ...) as FOO_MAX} <br>
         * T_CSRWHADM by CENTER_ID, named 'TCsrwhadmList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(csrwhadmCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     csrwhadmCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     csrwhadmCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TCsrwhadm.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TCsrwhadmCB, MCenterCQ> derivedTCsrwhadmList() {
            assertDerived("tCsrwhadmList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TCsrwhadmCB> sq, MCenterCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTCsrwhadmList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from T_EC_ORDER_H where ...) as FOO_MAX} <br>
         * T_EC_ORDER_H by CENTER_ID, named 'TEcOrderHList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     hCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     hCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TEcOrderH.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TEcOrderHCB, MCenterCQ> derivedTEcOrderHList() {
            assertDerived("tEcOrderHList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TEcOrderHCB> sq, MCenterCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTEcOrderHList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from T_INVENTORY_H where ...) as FOO_MAX} <br>
         * T_INVENTORY_H by CENTER_ID, named 'TInventoryHList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     hCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     hCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TInventoryH.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TInventoryHCB, MCenterCQ> derivedTInventoryHList() {
            assertDerived("tInventoryHList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TInventoryHCB> sq, MCenterCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTInventoryHList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from T_MFLASTSHIPLOT where ...) as FOO_MAX} <br>
         * T_MFLASTSHIPLOT by CENTER_ID, named 'TMflastshiplotList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(mflastshiplotCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     mflastshiplotCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     mflastshiplotCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TMflastshiplot.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TMflastshiplotCB, MCenterCQ> derivedTMflastshiplotList() {
            assertDerived("tMflastshiplotList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TMflastshiplotCB> sq, MCenterCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTMflastshiplotList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from T_MOVE_INST_H where ...) as FOO_MAX} <br>
         * T_MOVE_INST_H by CENTER_ID, named 'TMoveInstHList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     hCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     hCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TMoveInstH.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TMoveInstHCB, MCenterCQ> derivedTMoveInstHList() {
            assertDerived("tMoveInstHList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TMoveInstHCB> sq, MCenterCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTMoveInstHList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from T_PACKING_H where ...) as FOO_MAX} <br>
         * T_PACKING_H by CENTER_ID, named 'TPackingHList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     hCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     hCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TPackingH.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TPackingHCB, MCenterCQ> derivedTPackingHList() {
            assertDerived("tPackingHList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TPackingHCB> sq, MCenterCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTPackingHList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from T_PALLET where ...) as FOO_MAX} <br>
         * T_PALLET by CENTER_ID, named 'TPalletList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(palletCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     palletCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     palletCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TPallet.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TPalletCB, MCenterCQ> derivedTPalletList() {
            assertDerived("tPalletList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TPalletCB> sq, MCenterCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTPalletList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from T_PICKING_H where ...) as FOO_MAX} <br>
         * T_PICKING_H by CENTER_ID, named 'TPickingHList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     hCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     hCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TPickingH.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TPickingHCB, MCenterCQ> derivedTPickingHList() {
            assertDerived("tPickingHList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TPickingHCB> sq, MCenterCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTPickingHList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from T_PIC_MTHD_RCMD where ...) as FOO_MAX} <br>
         * T_PIC_MTHD_RCMD by CENTER_ID, named 'TPicMthdRcmdList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(rcmdCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     rcmdCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     rcmdCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TPicMthdRcmd.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TPicMthdRcmdCB, MCenterCQ> derivedTPicMthdRcmdList() {
            assertDerived("tPicMthdRcmdList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TPicMthdRcmdCB> sq, MCenterCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTPicMthdRcmdList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from T_RECEIVE_PLAN_H where ...) as FOO_MAX} <br>
         * T_RECEIVE_PLAN_H by CENTER_ID, named 'TReceivePlanHList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     hCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     hCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TReceivePlanH.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TReceivePlanHCB, MCenterCQ> derivedTReceivePlanHList() {
            assertDerived("tReceivePlanHList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TReceivePlanHCB> sq, MCenterCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTReceivePlanHList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from T_SERIAL_NO where ...) as FOO_MAX} <br>
         * T_SERIAL_NO by CENTER_ID, named 'TSerialNoList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(noCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     noCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     noCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TSerialNo.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TSerialNoCB, MCenterCQ> derivedTSerialNoList() {
            assertDerived("tSerialNoList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TSerialNoCB> sq, MCenterCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTSerialNoList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from T_SHIPPING_INST_H where ...) as FOO_MAX} <br>
         * T_SHIPPING_INST_H by CENTER_ID, named 'TShippingInstHList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     hCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     hCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TShippingInstH.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TShippingInstHCB, MCenterCQ> derivedTShippingInstHList() {
            assertDerived("tShippingInstHList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TShippingInstHCB> sq, MCenterCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTShippingInstHList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from T_SPLINFO where ...) as FOO_MAX} <br>
         * T_SPLINFO by CENTER_ID, named 'TSplinfoList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(splinfoCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     splinfoCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     splinfoCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TSplinfo.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TSplinfoCB, MCenterCQ> derivedTSplinfoList() {
            assertDerived("tSplinfoList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TSplinfoCB> sq, MCenterCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTSplinfoList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from T_STORE_RECORD_H where ...) as FOO_MAX} <br>
         * T_STORE_RECORD_H by CENTER_ID, named 'TStoreRecordHList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     hCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     hCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TStoreRecordH.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TStoreRecordHCB, MCenterCQ> derivedTStoreRecordHList() {
            assertDerived("tStoreRecordHList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TStoreRecordHCB> sq, MCenterCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTStoreRecordHList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from T_TRALLINV where ...) as FOO_MAX} <br>
         * T_TRALLINV by CENTER_ID, named 'TTrallinvList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(trallinvCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     trallinvCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     trallinvCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TTrallinv.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TTrallinvCB, MCenterCQ> derivedTTrallinvList() {
            assertDerived("tTrallinvList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TTrallinvCB> sq, MCenterCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTTrallinvList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from T_TRALLINVHISTORY where ...) as FOO_MAX} <br>
         * T_TRALLINVHISTORY by CENTER_ID, named 'TTrallinvhistoryList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(trallinvhistoryCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     trallinvhistoryCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     trallinvhistoryCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TTrallinvhistory.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TTrallinvhistoryCB, MCenterCQ> derivedTTrallinvhistoryList() {
            assertDerived("tTrallinvhistoryList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TTrallinvhistoryCB> sq, MCenterCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTTrallinvhistoryList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from T_TRCASEINVENTORY where ...) as FOO_MAX} <br>
         * T_TRCASEINVENTORY by CENTER_ID, named 'TTrcaseinventoryList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(trcaseinventoryCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     trcaseinventoryCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     trcaseinventoryCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TTrcaseinventory.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TTrcaseinventoryCB, MCenterCQ> derivedTTrcaseinventoryList() {
            assertDerived("tTrcaseinventoryList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TTrcaseinventoryCB> sq, MCenterCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTTrcaseinventoryList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from T_TRCASENUM where ...) as FOO_MAX} <br>
         * T_TRCASENUM by CENTER_ID, named 'TTrcasenumList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(trcasenumCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     trcasenumCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     trcasenumCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TTrcasenum.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TTrcasenumCB, MCenterCQ> derivedTTrcasenumList() {
            assertDerived("tTrcasenumList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TTrcasenumCB> sq, MCenterCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTTrcasenumList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from T_TRCASESTOCK where ...) as FOO_MAX} <br>
         * T_TRCASESTOCK by CENTER_ID, named 'TTrcasestockList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(trcasestockCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     trcasestockCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     trcasestockCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TTrcasestock.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TTrcasestockCB, MCenterCQ> derivedTTrcasestockList() {
            assertDerived("tTrcasestockList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TTrcasestockCB> sq, MCenterCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTTrcasestockList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from T_TRHANBAIINV where ...) as FOO_MAX} <br>
         * T_TRHANBAIINV by CENTER_ID, named 'TTrhanbaiinvList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(trhanbaiinvCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     trhanbaiinvCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     trhanbaiinvCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TTrhanbaiinv.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TTrhanbaiinvCB, MCenterCQ> derivedTTrhanbaiinvList() {
            assertDerived("tTrhanbaiinvList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TTrhanbaiinvCB> sq, MCenterCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTTrhanbaiinvList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from T_TRINVCHECKINFO where ...) as FOO_MAX} <br>
         * T_TRINVCHECKINFO by CENTER_ID, named 'TTrinvcheckinfoList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(trinvcheckinfoCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     trinvcheckinfoCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     trinvcheckinfoCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TTrinvcheckinfo.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TTrinvcheckinfoCB, MCenterCQ> derivedTTrinvcheckinfoList() {
            assertDerived("tTrinvcheckinfoList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TTrinvcheckinfoCB> sq, MCenterCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTTrinvcheckinfoList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from T_TRINVCORRECT where ...) as FOO_MAX} <br>
         * T_TRINVCORRECT by CENTER_ID, named 'TTrinvcorrectList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(trinvcorrectCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     trinvcorrectCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     trinvcorrectCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TTrinvcorrect.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TTrinvcorrectCB, MCenterCQ> derivedTTrinvcorrectList() {
            assertDerived("tTrinvcorrectList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TTrinvcorrectCB> sq, MCenterCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTTrinvcorrectList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from T_TRINVREANSWER where ...) as FOO_MAX} <br>
         * T_TRINVREANSWER by CENTER_ID, named 'TTrinvreanswerList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(trinvreanswerCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     trinvreanswerCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     trinvreanswerCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TTrinvreanswer.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TTrinvreanswerCB, MCenterCQ> derivedTTrinvreanswerList() {
            assertDerived("tTrinvreanswerList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TTrinvreanswerCB> sq, MCenterCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTTrinvreanswerList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from T_TRINVREQUEST where ...) as FOO_MAX} <br>
         * T_TRINVREQUEST by CENTER_ID, named 'TTrinvrequestList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(trinvrequestCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     trinvrequestCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     trinvrequestCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TTrinvrequest.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TTrinvrequestCB, MCenterCQ> derivedTTrinvrequestList() {
            assertDerived("tTrinvrequestList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TTrinvrequestCB> sq, MCenterCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTTrinvrequestList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from T_TRITEMCONVRESULT where ...) as FOO_MAX} <br>
         * T_TRITEMCONVRESULT by CENTER_ID, named 'TTritemconvresultList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(tritemconvresultCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     tritemconvresultCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     tritemconvresultCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TTritemconvresult.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TTritemconvresultCB, MCenterCQ> derivedTTritemconvresultList() {
            assertDerived("tTritemconvresultList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TTritemconvresultCB> sq, MCenterCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTTritemconvresultList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from T_TRJUKYUINV where ...) as FOO_MAX} <br>
         * T_TRJUKYUINV by CENTER_ID, named 'TTrjukyuinvList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(trjukyuinvCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     trjukyuinvCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     trjukyuinvCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TTrjukyuinv.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TTrjukyuinvCB, MCenterCQ> derivedTTrjukyuinvList() {
            assertDerived("tTrjukyuinvList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TTrjukyuinvCB> sq, MCenterCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTTrjukyuinvList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from T_TRMANUFACTUREDATE where ...) as FOO_MAX} <br>
         * T_TRMANUFACTUREDATE by CENTER_ID, named 'TTrmanufacturedateList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(trmanufacturedateCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     trmanufacturedateCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     trmanufacturedateCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TTrmanufacturedate.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TTrmanufacturedateCB, MCenterCQ> derivedTTrmanufacturedateList() {
            assertDerived("tTrmanufacturedateList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TTrmanufacturedateCB> sq, MCenterCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTTrmanufacturedateList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from T_TRMANUFACTUREDATEDETAIL where ...) as FOO_MAX} <br>
         * T_TRMANUFACTUREDATEDETAIL by CENTER_ID, named 'TTrmanufacturedatedetailList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(trmanufacturedatedetailCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     trmanufacturedatedetailCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     trmanufacturedatedetailCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TTrmanufacturedatedetail.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TTrmanufacturedatedetailCB, MCenterCQ> derivedTTrmanufacturedatedetailList() {
            assertDerived("tTrmanufacturedatedetailList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TTrmanufacturedatedetailCB> sq, MCenterCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTTrmanufacturedatedetailList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from T_TRMANUFACTUREDATEHISTORY where ...) as FOO_MAX} <br>
         * T_TRMANUFACTUREDATEHISTORY by CENTER_ID, named 'TTrmanufacturedatehistoryList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(trmanufacturedatehistoryCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     trmanufacturedatehistoryCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     trmanufacturedatehistoryCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TTrmanufacturedatehistory.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TTrmanufacturedatehistoryCB, MCenterCQ> derivedTTrmanufacturedatehistoryList() {
            assertDerived("tTrmanufacturedatehistoryList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TTrmanufacturedatehistoryCB> sq, MCenterCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTTrmanufacturedatehistoryList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from T_TRPALLETTRACE where ...) as FOO_MAX} <br>
         * T_TRPALLETTRACE by CENTER_ID, named 'TTrpallettraceList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(trpallettraceCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     trpallettraceCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     trpallettraceCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TTrpallettrace.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TTrpallettraceCB, MCenterCQ> derivedTTrpallettraceList() {
            assertDerived("tTrpallettraceList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TTrpallettraceCB> sq, MCenterCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTTrpallettraceList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from T_TRREVERSESTOCK where ...) as FOO_MAX} <br>
         * T_TRREVERSESTOCK by CENTER_ID, named 'TTrreversestockList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(trreversestockCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     trreversestockCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     trreversestockCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TTrreversestock.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TTrreversestockCB, MCenterCQ> derivedTTrreversestockList() {
            assertDerived("tTrreversestockList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TTrreversestockCB> sq, MCenterCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTTrreversestockList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from T_TRSTOCKDIFFHISTORY where ...) as FOO_MAX} <br>
         * T_TRSTOCKDIFFHISTORY by CENTER_ID, named 'TTrstockdiffhistoryList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(trstockdiffhistoryCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     trstockdiffhistoryCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     trstockdiffhistoryCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TTrstockdiffhistory.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TTrstockdiffhistoryCB, MCenterCQ> derivedTTrstockdiffhistoryList() {
            assertDerived("tTrstockdiffhistoryList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TTrstockdiffhistoryCB> sq, MCenterCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTTrstockdiffhistoryList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from T_TRSYMBOLTRACE where ...) as FOO_MAX} <br>
         * T_TRSYMBOLTRACE by CENTER_ID, named 'TTrsymboltraceList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(trsymboltraceCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     trsymboltraceCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     trsymboltraceCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TTrsymboltrace.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TTrsymboltraceCB, MCenterCQ> derivedTTrsymboltraceList() {
            assertDerived("tTrsymboltraceList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TTrsymboltraceCB> sq, MCenterCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTTrsymboltraceList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from T_TRSYMBOLTRACEEXTEND where ...) as FOO_MAX} <br>
         * T_TRSYMBOLTRACEEXTEND by CENTER_ID, named 'TTrsymboltraceextendList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(trsymboltraceextendCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     trsymboltraceextendCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     trsymboltraceextendCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TTrsymboltraceextend.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TTrsymboltraceextendCB, MCenterCQ> derivedTTrsymboltraceextendList() {
            assertDerived("tTrsymboltraceextendList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TTrsymboltraceextendCB> sq, MCenterCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTTrsymboltraceextendList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from T_TRTRACE where ...) as FOO_MAX} <br>
         * T_TRTRACE by CENTER_ID, named 'TTrtraceList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(trtraceCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     trtraceCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     trtraceCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TTrtrace.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TTrtraceCB, MCenterCQ> derivedTTrtraceList() {
            assertDerived("tTrtraceList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TTrtraceCB> sq, MCenterCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTTrtraceList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from T_YTRSO where ...) as FOO_MAX} <br>
         * T_YTRSO by CENTER_ID, named 'TYtrsoList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(ytrsoCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     ytrsoCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     ytrsoCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TYtrso.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TYtrsoCB, MCenterCQ> derivedTYtrsoList() {
            assertDerived("tYtrsoList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TYtrsoCB> sq, MCenterCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTYtrsoList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from W_HT_INVENTORY_INPUT_PROD where ...) as FOO_MAX} <br>
         * W_HT_INVENTORY_INPUT_PROD by CENTER_ID, named 'WHtInventoryInputProdList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(prodCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     prodCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     prodCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, WHtInventoryInputProd.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<WHtInventoryInputProdCB, MCenterCQ> derivedWHtInventoryInputProdList() {
            assertDerived("wHtInventoryInputProdList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<WHtInventoryInputProdCB> sq, MCenterCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveWHtInventoryInputProdList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from W_HT_LOADING where ...) as FOO_MAX} <br>
         * W_HT_LOADING by CENTER_ID, named 'WHtLoadingList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(loadingCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     loadingCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     loadingCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, WHtLoading.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<WHtLoadingCB, MCenterCQ> derivedWHtLoadingList() {
            assertDerived("wHtLoadingList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<WHtLoadingCB> sq, MCenterCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveWHtLoadingList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from W_HT_RECEIVE_INSPECTION where ...) as FOO_MAX} <br>
         * W_HT_RECEIVE_INSPECTION by CENTER_ID, named 'WHtReceiveInspectionList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(inspectionCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     inspectionCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     inspectionCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, WHtReceiveInspection.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<WHtReceiveInspectionCB, MCenterCQ> derivedWHtReceiveInspectionList() {
            assertDerived("wHtReceiveInspectionList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<WHtReceiveInspectionCB> sq, MCenterCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveWHtReceiveInspectionList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from W_HT_RECEIVE_NO_PLAN_INSP where ...) as FOO_MAX} <br>
         * W_HT_RECEIVE_NO_PLAN_INSP by CENTER_ID, named 'WHtReceiveNoPlanInspList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(inspCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     inspCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     inspCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, WHtReceiveNoPlanInsp.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<WHtReceiveNoPlanInspCB, MCenterCQ> derivedWHtReceiveNoPlanInspList() {
            assertDerived("wHtReceiveNoPlanInspList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<WHtReceiveNoPlanInspCB> sq, MCenterCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveWHtReceiveNoPlanInspList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from W_HT_RECEIVE_STORE where ...) as FOO_MAX} <br>
         * W_HT_RECEIVE_STORE by CENTER_ID, named 'WHtReceiveStoreList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(storeCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     storeCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     storeCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, WHtReceiveStore.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<WHtReceiveStoreCB, MCenterCQ> derivedWHtReceiveStoreList() {
            assertDerived("wHtReceiveStoreList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<WHtReceiveStoreCB> sq, MCenterCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveWHtReceiveStoreList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from W_HT_SERIAL_RECEIVE_INSP where ...) as FOO_MAX} <br>
         * W_HT_SERIAL_RECEIVE_INSP by CENTER_ID, named 'WHtSerialReceiveInspList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(inspCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     inspCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     inspCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, WHtSerialReceiveInsp.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<WHtSerialReceiveInspCB, MCenterCQ> derivedWHtSerialReceiveInspList() {
            assertDerived("wHtSerialReceiveInspList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<WHtSerialReceiveInspCB> sq, MCenterCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveWHtSerialReceiveInspList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from W_HT_SERIAL_SHIPPING_INSP where ...) as FOO_MAX} <br>
         * W_HT_SERIAL_SHIPPING_INSP by CENTER_ID, named 'WHtSerialShippingInspList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(inspCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     inspCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     inspCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, WHtSerialShippingInsp.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<WHtSerialShippingInspCB, MCenterCQ> derivedWHtSerialShippingInspList() {
            assertDerived("wHtSerialShippingInspList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<WHtSerialShippingInspCB> sq, MCenterCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveWHtSerialShippingInspList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from W_HT_SHIPPING where ...) as FOO_MAX} <br>
         * W_HT_SHIPPING by CENTER_ID, named 'WHtShippingList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(shippingCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     shippingCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     shippingCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, WHtShipping.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<WHtShippingCB, MCenterCQ> derivedWHtShippingList() {
            assertDerived("wHtShippingList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<WHtShippingCB> sq, MCenterCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveWHtShippingList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from W_HT_SHIPPING_PICKING where ...) as FOO_MAX} <br>
         * W_HT_SHIPPING_PICKING by CENTER_ID, named 'WHtShippingPickingList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(pickingCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     pickingCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     pickingCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, WHtShippingPicking.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<WHtShippingPickingCB, MCenterCQ> derivedWHtShippingPickingList() {
            assertDerived("wHtShippingPickingList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<WHtShippingPickingCB> sq, MCenterCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveWHtShippingPickingList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from W_SGL_ROW_SHIP_INSP_H where ...) as FOO_MAX} <br>
         * W_SGL_ROW_SHIP_INSP_H by CENTER_ID, named 'WSglRowShipInspHList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     hCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     hCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, WSglRowShipInspH.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<WSglRowShipInspHCB, MCenterCQ> derivedWSglRowShipInspHList() {
            assertDerived("wSglRowShipInspHList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<WSglRowShipInspHCB> sq, MCenterCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveWSglRowShipInspHList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from W_SHIPPING_INTERRUPT where ...) as FOO_MAX} <br>
         * W_SHIPPING_INTERRUPT by CENTER_ID, named 'WShippingInterruptList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(interruptCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     interruptCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     interruptCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, WShippingInterrupt.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<WShippingInterruptCB, MCenterCQ> derivedWShippingInterruptList() {
            assertDerived("wShippingInterruptList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<WShippingInterruptCB> sq, MCenterCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveWShippingInterruptList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)MyselfDerived (SubQuery).
         * @return The object to set up a function for myself table. (NotNull)
         */
        public HpSDRFunction<MCenterCB, MCenterCQ> myselfDerived() {
            assertDerived("myselfDerived"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<MCenterCB> sq, MCenterCQ cq, String al, DerivedReferrerOption op)
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
    public MCenterCB dreamCruiseCB() {
        MCenterCB cb = new MCenterCB();
        cb.xsetupForDreamCruise((MCenterCB) this);
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
    public HpColQyOperand<MCenterCB> columnQuery(final SpecifyQuery<MCenterCB> colCBLambda) {
        return xcreateColQyOperand((rightSp, operand) -> {
            return xcolqy(xcreateColumnQueryCB(), xcreateColumnQueryCB(), colCBLambda, rightSp, operand);
        });
    }

    protected MCenterCB xcreateColumnQueryCB() {
        MCenterCB cb = new MCenterCB();
        cb.xsetupForColumnQuery((MCenterCB)this);
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
    public void orScopeQuery(OrQuery<MCenterCB> orCBLambda) {
        xorSQ((MCenterCB)this, orCBLambda);
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
    public void orScopeQueryAndPart(AndQuery<MCenterCB> andCBLambda) {
        xorSQAP((MCenterCB)this, andCBLambda);
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
        final MCenterCB cb;
        if (mainCB != null) {
            cb = (MCenterCB)mainCB;
        } else {
            cb = new MCenterCB();
        }
        specify().xsetSyncQyCall(xcreateSpQyCall(() -> true, () -> cb.query()));
    }

    // ===================================================================================
    //                                                                            Internal
    //                                                                            ========
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xgetConditionBeanClassNameInternally() { return MCenterCB.class.getName(); }
    protected String xgetConditionQueryClassNameInternally() { return MCenterCQ.class.getName(); }
    protected String xgetSubQueryClassNameInternally() { return SubQuery.class.getName(); }
    protected String xgetConditionOptionClassNameInternally() { return ConditionOption.class.getName(); }
}
