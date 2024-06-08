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
 * The base condition-bean of P_LAYOUT_PRINT_SETTING.
 * @author DBFlute(AutoGenerator)
 */
public class BsPLayoutPrintSettingCB extends AbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected PLayoutPrintSettingCQ _conditionQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsPLayoutPrintSettingCB() {
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
        return "P_LAYOUT_PRINT_SETTING";
    }

    // ===================================================================================
    //                                                                 PrimaryKey Handling
    //                                                                 ===================
    /**
     * Accept the query condition of primary key as equal.
     * @param layoutPrintSettingId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return this. (NotNull)
     */
    public PLayoutPrintSettingCB acceptPK(Long layoutPrintSettingId) {
        assertObjectNotNull("layoutPrintSettingId", layoutPrintSettingId);
        BsPLayoutPrintSettingCB cb = this;
        cb.query().setLayoutPrintSettingId_Equal(layoutPrintSettingId);
        return (PLayoutPrintSettingCB)this;
    }

    /**
     * Accept the query condition of primary key as equal. (old style)
     * @param layoutPrintSettingId : PK, ID, NotNull, bigint identity(19). (NotNull)
     */
    public void acceptPrimaryKey(Long layoutPrintSettingId) {
        assertObjectNotNull("layoutPrintSettingId", layoutPrintSettingId);
        BsPLayoutPrintSettingCB cb = this;
        cb.query().setLayoutPrintSettingId_Equal(layoutPrintSettingId);
    }

    /**
     * Accept the query condition of unique key as equal.
     * @param reportLayoutId : UQ, NotNull, bigint(19), FK to P_REPORT_LAYOUT. (NotNull)
     * @return this. (NotNull)
     */
    public PLayoutPrintSettingCB acceptUniqueOf(Long reportLayoutId) {
        assertObjectNotNull("reportLayoutId", reportLayoutId);
        BsPLayoutPrintSettingCB cb = this;
        cb.query().setReportLayoutId_Equal(reportLayoutId);
        return (PLayoutPrintSettingCB)this;
    }

    public ConditionBean addOrderBy_PK_Asc() {
        query().addOrderBy_LayoutPrintSettingId_Asc();
        return this;
    }

    public ConditionBean addOrderBy_PK_Desc() {
        query().addOrderBy_LayoutPrintSettingId_Desc();
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
    public PLayoutPrintSettingCQ query() {
        assertQueryPurpose(); // assert only when user-public query
        return doGetConditionQuery();
    }

    public PLayoutPrintSettingCQ xdfgetConditionQuery() { // public for parameter comment and internal
        return doGetConditionQuery();
    }

    protected PLayoutPrintSettingCQ doGetConditionQuery() {
        if (_conditionQuery == null) {
            _conditionQuery = createLocalCQ();
        }
        return _conditionQuery;
    }

    protected PLayoutPrintSettingCQ createLocalCQ() {
        return xcreateCQ(null, getSqlClause(), getSqlClause().getBasePointAliasName(), 0);
    }

    protected PLayoutPrintSettingCQ xcreateCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        PLayoutPrintSettingCQ cq = xnewCQ(childQuery, sqlClause, aliasName, nestLevel);
        cq.xsetBaseCB(this);
        return cq;
    }

    protected PLayoutPrintSettingCQ xnewCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        return new PLayoutPrintSettingCQ(childQuery, sqlClause, aliasName, nestLevel);
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
    public void union(UnionQuery<PLayoutPrintSettingCB> unionCBLambda) {
        final PLayoutPrintSettingCB cb = new PLayoutPrintSettingCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionCBLambda.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final PLayoutPrintSettingCQ cq = cb.query(); query().xsetUnionQuery(cq);
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
    public void unionAll(UnionQuery<PLayoutPrintSettingCB> unionCBLambda) {
        final PLayoutPrintSettingCB cb = new PLayoutPrintSettingCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionCBLambda.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final PLayoutPrintSettingCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
    }

    // ===================================================================================
    //                                                                         SetupSelect
    //                                                                         ===========
    /**
     * Set up relation columns to select clause. <br>
     * P_PRINTER_GROUP by my PRINTER_GROUP_ID, named 'PPrinterGroup'.
     * <pre>
     * <span style="color: #0000C0">pLayoutPrintSettingBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_PPrinterGroup()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">pLayoutPrintSetting</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">pLayoutPrintSetting</span>.<span style="color: #CC4747">getPPrinterGroup()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     */
    public void setupSelect_PPrinterGroup() {
        assertSetupSelectPurpose("pPrinterGroup");
        if (hasSpecifiedLocalColumn()) {
            specify().columnPrinterGroupId();
        }
        doSetupSelect(() -> query().queryPPrinterGroup());
    }

    protected PPrinterAttributeNss _nssPPrinterAttribute;
    public PPrinterAttributeNss xdfgetNssPPrinterAttribute() {
        if (_nssPPrinterAttribute == null) { _nssPPrinterAttribute = new PPrinterAttributeNss(null); }
        return _nssPPrinterAttribute;
    }
    /**
     * Set up relation columns to select clause. <br>
     * P_PRINTER_ATTRIBUTE by my PRINTER_ATTRIBUTE_ID, named 'PPrinterAttribute'.
     * <pre>
     * <span style="color: #0000C0">pLayoutPrintSettingBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_PPrinterAttribute()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">pLayoutPrintSetting</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">pLayoutPrintSetting</span>.<span style="color: #CC4747">getPPrinterAttribute()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public PPrinterAttributeNss setupSelect_PPrinterAttribute() {
        assertSetupSelectPurpose("pPrinterAttribute");
        if (hasSpecifiedLocalColumn()) {
            specify().columnPrinterAttributeId();
        }
        doSetupSelect(() -> query().queryPPrinterAttribute());
        if (_nssPPrinterAttribute == null || !_nssPPrinterAttribute.hasConditionQuery())
        { _nssPPrinterAttribute = new PPrinterAttributeNss(query().queryPPrinterAttribute()); }
        return _nssPPrinterAttribute;
    }

    protected PReportLayoutNss _nssPReportLayout;
    public PReportLayoutNss xdfgetNssPReportLayout() {
        if (_nssPReportLayout == null) { _nssPReportLayout = new PReportLayoutNss(null); }
        return _nssPReportLayout;
    }
    /**
     * Set up relation columns to select clause. <br>
     * P_REPORT_LAYOUT by my REPORT_LAYOUT_ID, named 'PReportLayout'.
     * <pre>
     * <span style="color: #0000C0">pLayoutPrintSettingBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_PReportLayout()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">pLayoutPrintSetting</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">pLayoutPrintSetting</span>.<span style="color: #CC4747">getPReportLayout()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public PReportLayoutNss setupSelect_PReportLayout() {
        assertSetupSelectPurpose("pReportLayout");
        if (hasSpecifiedLocalColumn()) {
            specify().columnReportLayoutId();
        }
        doSetupSelect(() -> query().queryPReportLayout());
        if (_nssPReportLayout == null || !_nssPReportLayout.hasConditionQuery())
        { _nssPReportLayout = new PReportLayoutNss(query().queryPReportLayout()); }
        return _nssPReportLayout;
    }

    protected PPrinterNss _nssPPrinter;
    public PPrinterNss xdfgetNssPPrinter() {
        if (_nssPPrinter == null) { _nssPPrinter = new PPrinterNss(null); }
        return _nssPPrinter;
    }
    /**
     * Set up relation columns to select clause. <br>
     * P_PRINTER by my PRINTER_ID, named 'PPrinter'.
     * <pre>
     * <span style="color: #0000C0">pLayoutPrintSettingBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_PPrinter()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">pLayoutPrintSetting</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">pLayoutPrintSetting</span>.<span style="color: #CC4747">getPPrinter()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public PPrinterNss setupSelect_PPrinter() {
        assertSetupSelectPurpose("pPrinter");
        if (hasSpecifiedLocalColumn()) {
            specify().columnPrinterId();
        }
        doSetupSelect(() -> query().queryPPrinter());
        if (_nssPPrinter == null || !_nssPPrinter.hasConditionQuery())
        { _nssPPrinter = new PPrinterNss(query().queryPPrinter()); }
        return _nssPPrinter;
    }

    protected BClassDtlNss _nssBClassDtlBySheetCollate;
    public BClassDtlNss xdfgetNssBClassDtlBySheetCollate() {
        if (_nssBClassDtlBySheetCollate == null) { _nssBClassDtlBySheetCollate = new BClassDtlNss(null); }
        return _nssBClassDtlBySheetCollate;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my SHEET_COLLATE, named 'BClassDtlBySheetCollate'.
     * <pre>
     * <span style="color: #0000C0">pLayoutPrintSettingBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlBySheetCollate()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">pLayoutPrintSetting</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">pLayoutPrintSetting</span>.<span style="color: #CC4747">getBClassDtlBySheetCollate()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlBySheetCollate() {
        assertSetupSelectPurpose("bClassDtlBySheetCollate");
        if (hasSpecifiedLocalColumn()) {
            specify().columnSheetCollate();
        }
        doSetupSelect(() -> query().queryBClassDtlBySheetCollate());
        if (_nssBClassDtlBySheetCollate == null || !_nssBClassDtlBySheetCollate.hasConditionQuery())
        { _nssBClassDtlBySheetCollate = new BClassDtlNss(query().queryBClassDtlBySheetCollate()); }
        return _nssBClassDtlBySheetCollate;
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

    public static class HpSpecification extends HpAbstractSpecification<PLayoutPrintSettingCQ> {
        protected PPrinterGroupCB.HpSpecification _pPrinterGroup;
        protected PPrinterAttributeCB.HpSpecification _pPrinterAttribute;
        protected PReportLayoutCB.HpSpecification _pReportLayout;
        protected PPrinterCB.HpSpecification _pPrinter;
        protected BClassDtlCB.HpSpecification _bClassDtlBySheetCollate;
        public HpSpecification(ConditionBean baseCB, HpSpQyCall<PLayoutPrintSettingCQ> qyCall
                             , HpCBPurpose purpose, DBMetaProvider dbmetaProvider
                             , HpSDRFunctionFactory sdrFuncFactory)
        { super(baseCB, qyCall, purpose, dbmetaProvider, sdrFuncFactory); }
        /**
         * LAYOUT_PRINT_SETTING_ID: {PK, ID, NotNull, bigint identity(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnLayoutPrintSettingId() { return doColumn("LAYOUT_PRINT_SETTING_ID"); }
        /**
         * REPORT_LAYOUT_ID: {UQ, NotNull, bigint(19), FK to P_REPORT_LAYOUT}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnReportLayoutId() { return doColumn("REPORT_LAYOUT_ID"); }
        /**
         * PRINTER_GROUP_ID: {IX, bigint(19), FK to P_PRINTER_GROUP}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnPrinterGroupId() { return doColumn("PRINTER_GROUP_ID"); }
        /**
         * PRINTER_ID: {IX, bigint(19), FK to P_PRINTER}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnPrinterId() { return doColumn("PRINTER_ID"); }
        /**
         * PRINTER_ATTRIBUTE_ID: {IX, bigint(19), FK to P_PRINTER_ATTRIBUTE}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnPrinterAttributeId() { return doColumn("PRINTER_ATTRIBUTE_ID"); }
        /**
         * PRINT_NUM: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnPrintNum() { return doColumn("PRINT_NUM"); }
        /**
         * SHEET_COLLATE: {char(1), FK to B_CLASS_DTL, classification=SheetCollate}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSheetCollate() { return doColumn("SHEET_COLLATE"); }
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
            columnLayoutPrintSettingId(); // PK
            if (qyCall().qy().hasConditionQueryPPrinterGroup()
                    || qyCall().qy().xgetReferrerQuery() instanceof PPrinterGroupCQ) {
                columnPrinterGroupId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryPPrinterAttribute()
                    || qyCall().qy().xgetReferrerQuery() instanceof PPrinterAttributeCQ) {
                columnPrinterAttributeId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryPReportLayout()
                    || qyCall().qy().xgetReferrerQuery() instanceof PReportLayoutCQ) {
                columnReportLayoutId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryPPrinter()
                    || qyCall().qy().xgetReferrerQuery() instanceof PPrinterCQ) {
                columnPrinterId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlBySheetCollate()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnSheetCollate(); // FK or one-to-one referrer
            }
        }
        @Override
        protected String getTableDbName() { return "P_LAYOUT_PRINT_SETTING"; }
        /**
         * Prepare to specify functions about relation table. <br>
         * P_PRINTER_GROUP by my PRINTER_GROUP_ID, named 'PPrinterGroup'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public PPrinterGroupCB.HpSpecification specifyPPrinterGroup() {
            assertRelation("pPrinterGroup");
            if (_pPrinterGroup == null) {
                _pPrinterGroup = new PPrinterGroupCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryPPrinterGroup()
                                    , () -> _qyCall.qy().queryPPrinterGroup())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _pPrinterGroup.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryPPrinterGroup()
                      , () -> xsyncQyCall().qy().queryPPrinterGroup()));
                }
            }
            return _pPrinterGroup;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * P_PRINTER_ATTRIBUTE by my PRINTER_ATTRIBUTE_ID, named 'PPrinterAttribute'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public PPrinterAttributeCB.HpSpecification specifyPPrinterAttribute() {
            assertRelation("pPrinterAttribute");
            if (_pPrinterAttribute == null) {
                _pPrinterAttribute = new PPrinterAttributeCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryPPrinterAttribute()
                                    , () -> _qyCall.qy().queryPPrinterAttribute())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _pPrinterAttribute.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryPPrinterAttribute()
                      , () -> xsyncQyCall().qy().queryPPrinterAttribute()));
                }
            }
            return _pPrinterAttribute;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * P_REPORT_LAYOUT by my REPORT_LAYOUT_ID, named 'PReportLayout'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public PReportLayoutCB.HpSpecification specifyPReportLayout() {
            assertRelation("pReportLayout");
            if (_pReportLayout == null) {
                _pReportLayout = new PReportLayoutCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryPReportLayout()
                                    , () -> _qyCall.qy().queryPReportLayout())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _pReportLayout.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryPReportLayout()
                      , () -> xsyncQyCall().qy().queryPReportLayout()));
                }
            }
            return _pReportLayout;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * P_PRINTER by my PRINTER_ID, named 'PPrinter'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public PPrinterCB.HpSpecification specifyPPrinter() {
            assertRelation("pPrinter");
            if (_pPrinter == null) {
                _pPrinter = new PPrinterCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryPPrinter()
                                    , () -> _qyCall.qy().queryPPrinter())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _pPrinter.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryPPrinter()
                      , () -> xsyncQyCall().qy().queryPPrinter()));
                }
            }
            return _pPrinter;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_CLASS_DTL by my SHEET_COLLATE, named 'BClassDtlBySheetCollate'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlBySheetCollate() {
            assertRelation("bClassDtlBySheetCollate");
            if (_bClassDtlBySheetCollate == null) {
                _bClassDtlBySheetCollate = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlBySheetCollate()
                                    , () -> _qyCall.qy().queryBClassDtlBySheetCollate())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlBySheetCollate.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlBySheetCollate()
                      , () -> xsyncQyCall().qy().queryBClassDtlBySheetCollate()));
                }
            }
            return _bClassDtlBySheetCollate;
        }
        /**
         * Prepare for (Specify)MyselfDerived (SubQuery).
         * @return The object to set up a function for myself table. (NotNull)
         */
        public HpSDRFunction<PLayoutPrintSettingCB, PLayoutPrintSettingCQ> myselfDerived() {
            assertDerived("myselfDerived"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<PLayoutPrintSettingCB> sq, PLayoutPrintSettingCQ cq, String al, DerivedReferrerOption op)
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
    public PLayoutPrintSettingCB dreamCruiseCB() {
        PLayoutPrintSettingCB cb = new PLayoutPrintSettingCB();
        cb.xsetupForDreamCruise((PLayoutPrintSettingCB) this);
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
    public HpColQyOperand<PLayoutPrintSettingCB> columnQuery(final SpecifyQuery<PLayoutPrintSettingCB> colCBLambda) {
        return xcreateColQyOperand((rightSp, operand) -> {
            return xcolqy(xcreateColumnQueryCB(), xcreateColumnQueryCB(), colCBLambda, rightSp, operand);
        });
    }

    protected PLayoutPrintSettingCB xcreateColumnQueryCB() {
        PLayoutPrintSettingCB cb = new PLayoutPrintSettingCB();
        cb.xsetupForColumnQuery((PLayoutPrintSettingCB)this);
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
    public void orScopeQuery(OrQuery<PLayoutPrintSettingCB> orCBLambda) {
        xorSQ((PLayoutPrintSettingCB)this, orCBLambda);
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
    public void orScopeQueryAndPart(AndQuery<PLayoutPrintSettingCB> andCBLambda) {
        xorSQAP((PLayoutPrintSettingCB)this, andCBLambda);
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
        final PLayoutPrintSettingCB cb;
        if (mainCB != null) {
            cb = (PLayoutPrintSettingCB)mainCB;
        } else {
            cb = new PLayoutPrintSettingCB();
        }
        specify().xsetSyncQyCall(xcreateSpQyCall(() -> true, () -> cb.query()));
    }

    // ===================================================================================
    //                                                                            Internal
    //                                                                            ========
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xgetConditionBeanClassNameInternally() { return PLayoutPrintSettingCB.class.getName(); }
    protected String xgetConditionQueryClassNameInternally() { return PLayoutPrintSettingCQ.class.getName(); }
    protected String xgetSubQueryClassNameInternally() { return SubQuery.class.getName(); }
    protected String xgetConditionOptionClassNameInternally() { return ConditionOption.class.getName(); }
}
