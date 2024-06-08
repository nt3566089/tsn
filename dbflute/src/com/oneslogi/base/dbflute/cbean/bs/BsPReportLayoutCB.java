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
 * The base condition-bean of P_REPORT_LAYOUT.
 * @author DBFlute(AutoGenerator)
 */
public class BsPReportLayoutCB extends AbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected PReportLayoutCQ _conditionQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsPReportLayoutCB() {
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
        return "P_REPORT_LAYOUT";
    }

    // ===================================================================================
    //                                                                 PrimaryKey Handling
    //                                                                 ===================
    /**
     * Accept the query condition of primary key as equal.
     * @param reportLayoutId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return this. (NotNull)
     */
    public PReportLayoutCB acceptPK(Long reportLayoutId) {
        assertObjectNotNull("reportLayoutId", reportLayoutId);
        BsPReportLayoutCB cb = this;
        cb.query().setReportLayoutId_Equal(reportLayoutId);
        return (PReportLayoutCB)this;
    }

    /**
     * Accept the query condition of primary key as equal. (old style)
     * @param reportLayoutId : PK, ID, NotNull, bigint identity(19). (NotNull)
     */
    public void acceptPrimaryKey(Long reportLayoutId) {
        assertObjectNotNull("reportLayoutId", reportLayoutId);
        BsPReportLayoutCB cb = this;
        cb.query().setReportLayoutId_Equal(reportLayoutId);
    }

    /**
     * Accept the query condition of unique key as equal.
     * @param reportId : UQ+, IX, NotNull, bigint(19), FK to P_REPORT. (NotNull)
     * @param reportLayoutNm : +UQ, NotNull, varchar(60). (NotNull)
     * @return this. (NotNull)
     */
    public PReportLayoutCB acceptUniqueOf(Long reportId, String reportLayoutNm) {
        assertObjectNotNull("reportId", reportId);assertObjectNotNull("reportLayoutNm", reportLayoutNm);
        BsPReportLayoutCB cb = this;
        cb.query().setReportId_Equal(reportId);cb.query().setReportLayoutNm_Equal(reportLayoutNm);
        return (PReportLayoutCB)this;
    }

    public ConditionBean addOrderBy_PK_Asc() {
        query().addOrderBy_ReportLayoutId_Asc();
        return this;
    }

    public ConditionBean addOrderBy_PK_Desc() {
        query().addOrderBy_ReportLayoutId_Desc();
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
    public PReportLayoutCQ query() {
        assertQueryPurpose(); // assert only when user-public query
        return doGetConditionQuery();
    }

    public PReportLayoutCQ xdfgetConditionQuery() { // public for parameter comment and internal
        return doGetConditionQuery();
    }

    protected PReportLayoutCQ doGetConditionQuery() {
        if (_conditionQuery == null) {
            _conditionQuery = createLocalCQ();
        }
        return _conditionQuery;
    }

    protected PReportLayoutCQ createLocalCQ() {
        return xcreateCQ(null, getSqlClause(), getSqlClause().getBasePointAliasName(), 0);
    }

    protected PReportLayoutCQ xcreateCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        PReportLayoutCQ cq = xnewCQ(childQuery, sqlClause, aliasName, nestLevel);
        cq.xsetBaseCB(this);
        return cq;
    }

    protected PReportLayoutCQ xnewCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        return new PReportLayoutCQ(childQuery, sqlClause, aliasName, nestLevel);
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
    public void union(UnionQuery<PReportLayoutCB> unionCBLambda) {
        final PReportLayoutCB cb = new PReportLayoutCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionCBLambda.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final PReportLayoutCQ cq = cb.query(); query().xsetUnionQuery(cq);
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
    public void unionAll(UnionQuery<PReportLayoutCB> unionCBLambda) {
        final PReportLayoutCB cb = new PReportLayoutCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionCBLambda.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final PReportLayoutCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
    }

    // ===================================================================================
    //                                                                         SetupSelect
    //                                                                         ===========
    /**
     * Set up relation columns to select clause. <br>
     * P_REPORT by my REPORT_ID, named 'PReport'.
     * <pre>
     * <span style="color: #0000C0">pReportLayoutBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_PReport()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">pReportLayout</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">pReportLayout</span>.<span style="color: #CC4747">getPReport()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     */
    public void setupSelect_PReport() {
        assertSetupSelectPurpose("pReport");
        if (hasSpecifiedLocalColumn()) {
            specify().columnReportId();
        }
        doSetupSelect(() -> query().queryPReport());
    }

    protected BClassDtlNss _nssBClassDtlByUpdatable;
    public BClassDtlNss xdfgetNssBClassDtlByUpdatable() {
        if (_nssBClassDtlByUpdatable == null) { _nssBClassDtlByUpdatable = new BClassDtlNss(null); }
        return _nssBClassDtlByUpdatable;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my UPDATABLE, named 'BClassDtlByUpdatable'.
     * <pre>
     * <span style="color: #0000C0">pReportLayoutBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByUpdatable()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">pReportLayout</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">pReportLayout</span>.<span style="color: #CC4747">getBClassDtlByUpdatable()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByUpdatable() {
        assertSetupSelectPurpose("bClassDtlByUpdatable");
        if (hasSpecifiedLocalColumn()) {
            specify().columnUpdatable();
        }
        doSetupSelect(() -> query().queryBClassDtlByUpdatable());
        if (_nssBClassDtlByUpdatable == null || !_nssBClassDtlByUpdatable.hasConditionQuery())
        { _nssBClassDtlByUpdatable = new BClassDtlNss(query().queryBClassDtlByUpdatable()); }
        return _nssBClassDtlByUpdatable;
    }

    protected BClassDtlNss _nssBClassDtlByAutoPrintTargetFlg;
    public BClassDtlNss xdfgetNssBClassDtlByAutoPrintTargetFlg() {
        if (_nssBClassDtlByAutoPrintTargetFlg == null) { _nssBClassDtlByAutoPrintTargetFlg = new BClassDtlNss(null); }
        return _nssBClassDtlByAutoPrintTargetFlg;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my AUTO_PRINT_TARGET_FLG, named 'BClassDtlByAutoPrintTargetFlg'.
     * <pre>
     * <span style="color: #0000C0">pReportLayoutBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByAutoPrintTargetFlg()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">pReportLayout</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">pReportLayout</span>.<span style="color: #CC4747">getBClassDtlByAutoPrintTargetFlg()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByAutoPrintTargetFlg() {
        assertSetupSelectPurpose("bClassDtlByAutoPrintTargetFlg");
        if (hasSpecifiedLocalColumn()) {
            specify().columnAutoPrintTargetFlg();
        }
        doSetupSelect(() -> query().queryBClassDtlByAutoPrintTargetFlg());
        if (_nssBClassDtlByAutoPrintTargetFlg == null || !_nssBClassDtlByAutoPrintTargetFlg.hasConditionQuery())
        { _nssBClassDtlByAutoPrintTargetFlg = new BClassDtlNss(query().queryBClassDtlByAutoPrintTargetFlg()); }
        return _nssBClassDtlByAutoPrintTargetFlg;
    }

    protected PLayoutPrintSettingNss _nssPLayoutPrintSettingAsOne;
    public PLayoutPrintSettingNss xdfgetNssPLayoutPrintSettingAsOne() {
        if (_nssPLayoutPrintSettingAsOne == null) { _nssPLayoutPrintSettingAsOne = new PLayoutPrintSettingNss(null); }
        return _nssPLayoutPrintSettingAsOne;
    }
    /**
     * Set up relation columns to select clause. <br>
     * P_LAYOUT_PRINT_SETTING by REPORT_LAYOUT_ID, named 'PLayoutPrintSettingAsOne'.
     * <pre>
     * <span style="color: #0000C0">pReportLayoutBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_PLayoutPrintSettingAsOne()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">pReportLayout</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">pReportLayout</span>.<span style="color: #CC4747">getPLayoutPrintSettingAsOne()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public PLayoutPrintSettingNss setupSelect_PLayoutPrintSettingAsOne() {
        assertSetupSelectPurpose("pLayoutPrintSettingAsOne");
        doSetupSelect(() -> query().queryPLayoutPrintSettingAsOne());
        if (_nssPLayoutPrintSettingAsOne == null || !_nssPLayoutPrintSettingAsOne.hasConditionQuery())
        { _nssPLayoutPrintSettingAsOne = new PLayoutPrintSettingNss(query().queryPLayoutPrintSettingAsOne()); }
        return _nssPLayoutPrintSettingAsOne;
    }

    protected PSubrepLayoutNss _nssPSubrepLayoutAsOne;
    public PSubrepLayoutNss xdfgetNssPSubrepLayoutAsOne() {
        if (_nssPSubrepLayoutAsOne == null) { _nssPSubrepLayoutAsOne = new PSubrepLayoutNss(null); }
        return _nssPSubrepLayoutAsOne;
    }
    /**
     * Set up relation columns to select clause. <br>
     * P_SUBREP_LAYOUT by REPORT_LAYOUT_ID, named 'PSubrepLayoutAsOne'.
     * <pre>
     * <span style="color: #0000C0">pReportLayoutBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_PSubrepLayoutAsOne()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">pReportLayout</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">pReportLayout</span>.<span style="color: #CC4747">getPSubrepLayoutAsOne()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public PSubrepLayoutNss setupSelect_PSubrepLayoutAsOne() {
        assertSetupSelectPurpose("pSubrepLayoutAsOne");
        doSetupSelect(() -> query().queryPSubrepLayoutAsOne());
        if (_nssPSubrepLayoutAsOne == null || !_nssPSubrepLayoutAsOne.hasConditionQuery())
        { _nssPSubrepLayoutAsOne = new PSubrepLayoutNss(query().queryPSubrepLayoutAsOne()); }
        return _nssPSubrepLayoutAsOne;
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

    public static class HpSpecification extends HpAbstractSpecification<PReportLayoutCQ> {
        protected PReportCB.HpSpecification _pReport;
        protected BClassDtlCB.HpSpecification _bClassDtlByUpdatable;
        protected BClassDtlCB.HpSpecification _bClassDtlByAutoPrintTargetFlg;
        protected PLayoutPrintSettingCB.HpSpecification _pLayoutPrintSettingAsOne;
        protected PSubrepLayoutCB.HpSpecification _pSubrepLayoutAsOne;
        public HpSpecification(ConditionBean baseCB, HpSpQyCall<PReportLayoutCQ> qyCall
                             , HpCBPurpose purpose, DBMetaProvider dbmetaProvider
                             , HpSDRFunctionFactory sdrFuncFactory)
        { super(baseCB, qyCall, purpose, dbmetaProvider, sdrFuncFactory); }
        /**
         * REPORT_LAYOUT_ID: {PK, ID, NotNull, bigint identity(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnReportLayoutId() { return doColumn("REPORT_LAYOUT_ID"); }
        /**
         * REPORT_ID: {UQ+, IX, NotNull, bigint(19), FK to P_REPORT}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnReportId() { return doColumn("REPORT_ID"); }
        /**
         * REPORT_LAYOUT_NM: {+UQ, NotNull, varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnReportLayoutNm() { return doColumn("REPORT_LAYOUT_NM"); }
        /**
         * REPORT_LAYOUT_DATA: {NotNull, varchar(2147483647)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnReportLayoutData() { return doColumn("REPORT_LAYOUT_DATA"); }
        /**
         * UPDATABLE: {NotNull, char(1), FK to B_CLASS_DTL, classification=Updatable}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnUpdatable() { return doColumn("UPDATABLE"); }
        /**
         * ATTRIBUTE1: {varchar(100)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnAttribute1() { return doColumn("ATTRIBUTE1"); }
        /**
         * ATTRIBUTE2: {varchar(100)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnAttribute2() { return doColumn("ATTRIBUTE2"); }
        /**
         * ATTRIBUTE3: {varchar(100)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnAttribute3() { return doColumn("ATTRIBUTE3"); }
        /**
         * ATTRIBUTE4: {varchar(100)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnAttribute4() { return doColumn("ATTRIBUTE4"); }
        /**
         * ATTRIBUTE5: {varchar(100)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnAttribute5() { return doColumn("ATTRIBUTE5"); }
        /**
         * AUTO_PRINT_TARGET_FLG: {NotNull, char(1), default=[(0)], FK to B_CLASS_DTL, classification=AutoPrintTargetFlg}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnAutoPrintTargetFlg() { return doColumn("AUTO_PRINT_TARGET_FLG"); }
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
            columnReportLayoutId(); // PK
            if (qyCall().qy().hasConditionQueryPReport()
                    || qyCall().qy().xgetReferrerQuery() instanceof PReportCQ) {
                columnReportId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByUpdatable()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnUpdatable(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByAutoPrintTargetFlg()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnAutoPrintTargetFlg(); // FK or one-to-one referrer
            }
        }
        @Override
        protected String getTableDbName() { return "P_REPORT_LAYOUT"; }
        /**
         * Prepare to specify functions about relation table. <br>
         * P_REPORT by my REPORT_ID, named 'PReport'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public PReportCB.HpSpecification specifyPReport() {
            assertRelation("pReport");
            if (_pReport == null) {
                _pReport = new PReportCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryPReport()
                                    , () -> _qyCall.qy().queryPReport())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _pReport.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryPReport()
                      , () -> xsyncQyCall().qy().queryPReport()));
                }
            }
            return _pReport;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_CLASS_DTL by my UPDATABLE, named 'BClassDtlByUpdatable'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByUpdatable() {
            assertRelation("bClassDtlByUpdatable");
            if (_bClassDtlByUpdatable == null) {
                _bClassDtlByUpdatable = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByUpdatable()
                                    , () -> _qyCall.qy().queryBClassDtlByUpdatable())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByUpdatable.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByUpdatable()
                      , () -> xsyncQyCall().qy().queryBClassDtlByUpdatable()));
                }
            }
            return _bClassDtlByUpdatable;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_CLASS_DTL by my AUTO_PRINT_TARGET_FLG, named 'BClassDtlByAutoPrintTargetFlg'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByAutoPrintTargetFlg() {
            assertRelation("bClassDtlByAutoPrintTargetFlg");
            if (_bClassDtlByAutoPrintTargetFlg == null) {
                _bClassDtlByAutoPrintTargetFlg = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByAutoPrintTargetFlg()
                                    , () -> _qyCall.qy().queryBClassDtlByAutoPrintTargetFlg())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByAutoPrintTargetFlg.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByAutoPrintTargetFlg()
                      , () -> xsyncQyCall().qy().queryBClassDtlByAutoPrintTargetFlg()));
                }
            }
            return _bClassDtlByAutoPrintTargetFlg;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * P_LAYOUT_PRINT_SETTING by REPORT_LAYOUT_ID, named 'PLayoutPrintSettingAsOne'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public PLayoutPrintSettingCB.HpSpecification specifyPLayoutPrintSettingAsOne() {
            assertRelation("pLayoutPrintSettingAsOne");
            if (_pLayoutPrintSettingAsOne == null) {
                _pLayoutPrintSettingAsOne = new PLayoutPrintSettingCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryPLayoutPrintSettingAsOne()
                                    , () -> _qyCall.qy().queryPLayoutPrintSettingAsOne())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _pLayoutPrintSettingAsOne.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryPLayoutPrintSettingAsOne()
                      , () -> xsyncQyCall().qy().queryPLayoutPrintSettingAsOne()));
                }
            }
            return _pLayoutPrintSettingAsOne;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * P_SUBREP_LAYOUT by REPORT_LAYOUT_ID, named 'PSubrepLayoutAsOne'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public PSubrepLayoutCB.HpSpecification specifyPSubrepLayoutAsOne() {
            assertRelation("pSubrepLayoutAsOne");
            if (_pSubrepLayoutAsOne == null) {
                _pSubrepLayoutAsOne = new PSubrepLayoutCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryPSubrepLayoutAsOne()
                                    , () -> _qyCall.qy().queryPSubrepLayoutAsOne())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _pSubrepLayoutAsOne.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryPSubrepLayoutAsOne()
                      , () -> xsyncQyCall().qy().queryPSubrepLayoutAsOne()));
                }
            }
            return _pSubrepLayoutAsOne;
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from P_REPORT_LAYOUT_ITEM where ...) as FOO_MAX} <br>
         * P_REPORT_LAYOUT_ITEM by REPORT_LAYOUT_ID, named 'PReportLayoutItemList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(itemCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     itemCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     itemCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, PReportLayoutItem.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<PReportLayoutItemCB, PReportLayoutCQ> derivedPReportLayoutItemList() {
            assertDerived("pReportLayoutItemList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<PReportLayoutItemCB> sq, PReportLayoutCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderivePReportLayoutItemList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from P_USER_AUTO_PRINT_SETTING where ...) as FOO_MAX} <br>
         * P_USER_AUTO_PRINT_SETTING by REPORT_LAYOUT_ID, named 'PUserAutoPrintSettingByReportLayoutIdList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(settingCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     settingCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     settingCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, PUserAutoPrintSetting.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<PUserAutoPrintSettingCB, PReportLayoutCQ> derivedPUserAutoPrintSettingByReportLayoutIdList() {
            assertDerived("pUserAutoPrintSettingByReportLayoutIdList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<PUserAutoPrintSettingCB> sq, PReportLayoutCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderivePUserAutoPrintSettingByReportLayoutIdList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from P_TERMINAL_AUTO_PRINT_SET where ...) as FOO_MAX} <br>
         * P_TERMINAL_AUTO_PRINT_SET by REPORT_LAYOUT_ID, named 'PTerminalAutoPrintSetByReportLayoutIdList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(setCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     setCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     setCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, PTerminalAutoPrintSet.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<PTerminalAutoPrintSetCB, PReportLayoutCQ> derivedPTerminalAutoPrintSetByReportLayoutIdList() {
            assertDerived("pTerminalAutoPrintSetByReportLayoutIdList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<PTerminalAutoPrintSetCB> sq, PReportLayoutCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderivePTerminalAutoPrintSetByReportLayoutIdList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)MyselfDerived (SubQuery).
         * @return The object to set up a function for myself table. (NotNull)
         */
        public HpSDRFunction<PReportLayoutCB, PReportLayoutCQ> myselfDerived() {
            assertDerived("myselfDerived"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<PReportLayoutCB> sq, PReportLayoutCQ cq, String al, DerivedReferrerOption op)
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
    public PReportLayoutCB dreamCruiseCB() {
        PReportLayoutCB cb = new PReportLayoutCB();
        cb.xsetupForDreamCruise((PReportLayoutCB) this);
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
    public HpColQyOperand<PReportLayoutCB> columnQuery(final SpecifyQuery<PReportLayoutCB> colCBLambda) {
        return xcreateColQyOperand((rightSp, operand) -> {
            return xcolqy(xcreateColumnQueryCB(), xcreateColumnQueryCB(), colCBLambda, rightSp, operand);
        });
    }

    protected PReportLayoutCB xcreateColumnQueryCB() {
        PReportLayoutCB cb = new PReportLayoutCB();
        cb.xsetupForColumnQuery((PReportLayoutCB)this);
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
    public void orScopeQuery(OrQuery<PReportLayoutCB> orCBLambda) {
        xorSQ((PReportLayoutCB)this, orCBLambda);
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
    public void orScopeQueryAndPart(AndQuery<PReportLayoutCB> andCBLambda) {
        xorSQAP((PReportLayoutCB)this, andCBLambda);
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
        final PReportLayoutCB cb;
        if (mainCB != null) {
            cb = (PReportLayoutCB)mainCB;
        } else {
            cb = new PReportLayoutCB();
        }
        specify().xsetSyncQyCall(xcreateSpQyCall(() -> true, () -> cb.query()));
    }

    // ===================================================================================
    //                                                                            Internal
    //                                                                            ========
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xgetConditionBeanClassNameInternally() { return PReportLayoutCB.class.getName(); }
    protected String xgetConditionQueryClassNameInternally() { return PReportLayoutCQ.class.getName(); }
    protected String xgetSubQueryClassNameInternally() { return SubQuery.class.getName(); }
    protected String xgetConditionOptionClassNameInternally() { return ConditionOption.class.getName(); }
}
