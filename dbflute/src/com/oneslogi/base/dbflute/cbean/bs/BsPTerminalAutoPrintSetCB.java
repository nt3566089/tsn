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
 * The base condition-bean of P_TERMINAL_AUTO_PRINT_SET.
 * @author DBFlute(AutoGenerator)
 */
public class BsPTerminalAutoPrintSetCB extends AbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected PTerminalAutoPrintSetCQ _conditionQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsPTerminalAutoPrintSetCB() {
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
        return "P_TERMINAL_AUTO_PRINT_SET";
    }

    // ===================================================================================
    //                                                                 PrimaryKey Handling
    //                                                                 ===================
    /**
     * Accept the query condition of primary key as equal.
     * @param terminalAutoPrintSetId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return this. (NotNull)
     */
    public PTerminalAutoPrintSetCB acceptPK(Long terminalAutoPrintSetId) {
        assertObjectNotNull("terminalAutoPrintSetId", terminalAutoPrintSetId);
        BsPTerminalAutoPrintSetCB cb = this;
        cb.query().setTerminalAutoPrintSetId_Equal(terminalAutoPrintSetId);
        return (PTerminalAutoPrintSetCB)this;
    }

    /**
     * Accept the query condition of primary key as equal. (old style)
     * @param terminalAutoPrintSetId : PK, ID, NotNull, bigint identity(19). (NotNull)
     */
    public void acceptPrimaryKey(Long terminalAutoPrintSetId) {
        assertObjectNotNull("terminalAutoPrintSetId", terminalAutoPrintSetId);
        BsPTerminalAutoPrintSetCB cb = this;
        cb.query().setTerminalAutoPrintSetId_Equal(terminalAutoPrintSetId);
    }

    /**
     * Accept the query condition of unique key as equal.
     * @param terminalAssignCd : UQ+, IX, NotNull, varchar(100). (NotNull)
     * @param reportLayoutId : +UQ, IX, NotNull, bigint(19), FK to P_REPORT_LAYOUT. (NotNull)
     * @return this. (NotNull)
     */
    public PTerminalAutoPrintSetCB acceptUniqueOf(String terminalAssignCd, Long reportLayoutId) {
        assertObjectNotNull("terminalAssignCd", terminalAssignCd);assertObjectNotNull("reportLayoutId", reportLayoutId);
        BsPTerminalAutoPrintSetCB cb = this;
        cb.query().setTerminalAssignCd_Equal(terminalAssignCd);cb.query().setReportLayoutId_Equal(reportLayoutId);
        return (PTerminalAutoPrintSetCB)this;
    }

    public ConditionBean addOrderBy_PK_Asc() {
        query().addOrderBy_TerminalAutoPrintSetId_Asc();
        return this;
    }

    public ConditionBean addOrderBy_PK_Desc() {
        query().addOrderBy_TerminalAutoPrintSetId_Desc();
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
    public PTerminalAutoPrintSetCQ query() {
        assertQueryPurpose(); // assert only when user-public query
        return doGetConditionQuery();
    }

    public PTerminalAutoPrintSetCQ xdfgetConditionQuery() { // public for parameter comment and internal
        return doGetConditionQuery();
    }

    protected PTerminalAutoPrintSetCQ doGetConditionQuery() {
        if (_conditionQuery == null) {
            _conditionQuery = createLocalCQ();
        }
        return _conditionQuery;
    }

    protected PTerminalAutoPrintSetCQ createLocalCQ() {
        return xcreateCQ(null, getSqlClause(), getSqlClause().getBasePointAliasName(), 0);
    }

    protected PTerminalAutoPrintSetCQ xcreateCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        PTerminalAutoPrintSetCQ cq = xnewCQ(childQuery, sqlClause, aliasName, nestLevel);
        cq.xsetBaseCB(this);
        return cq;
    }

    protected PTerminalAutoPrintSetCQ xnewCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        return new PTerminalAutoPrintSetCQ(childQuery, sqlClause, aliasName, nestLevel);
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
    public void union(UnionQuery<PTerminalAutoPrintSetCB> unionCBLambda) {
        final PTerminalAutoPrintSetCB cb = new PTerminalAutoPrintSetCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionCBLambda.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final PTerminalAutoPrintSetCQ cq = cb.query(); query().xsetUnionQuery(cq);
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
    public void unionAll(UnionQuery<PTerminalAutoPrintSetCB> unionCBLambda) {
        final PTerminalAutoPrintSetCB cb = new PTerminalAutoPrintSetCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionCBLambda.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final PTerminalAutoPrintSetCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
    }

    // ===================================================================================
    //                                                                         SetupSelect
    //                                                                         ===========
    protected PReportLayoutNss _nssPReportLayoutByReportLayoutId;
    public PReportLayoutNss xdfgetNssPReportLayoutByReportLayoutId() {
        if (_nssPReportLayoutByReportLayoutId == null) { _nssPReportLayoutByReportLayoutId = new PReportLayoutNss(null); }
        return _nssPReportLayoutByReportLayoutId;
    }
    /**
     * Set up relation columns to select clause. <br>
     * P_REPORT_LAYOUT by my REPORT_LAYOUT_ID, named 'PReportLayoutByReportLayoutId'.
     * <pre>
     * <span style="color: #0000C0">pTerminalAutoPrintSetBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_PReportLayoutByReportLayoutId()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">pTerminalAutoPrintSet</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">pTerminalAutoPrintSet</span>.<span style="color: #CC4747">getPReportLayoutByReportLayoutId()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public PReportLayoutNss setupSelect_PReportLayoutByReportLayoutId() {
        assertSetupSelectPurpose("pReportLayoutByReportLayoutId");
        if (hasSpecifiedLocalColumn()) {
            specify().columnReportLayoutId();
        }
        doSetupSelect(() -> query().queryPReportLayoutByReportLayoutId());
        if (_nssPReportLayoutByReportLayoutId == null || !_nssPReportLayoutByReportLayoutId.hasConditionQuery())
        { _nssPReportLayoutByReportLayoutId = new PReportLayoutNss(query().queryPReportLayoutByReportLayoutId()); }
        return _nssPReportLayoutByReportLayoutId;
    }

    /**
     * Set up relation columns to select clause. <br>
     * P_PRINTER_GROUP by my PRINTER_GROUP_ID, named 'PPrinterGroupByPrinterGroupId'.
     * <pre>
     * <span style="color: #0000C0">pTerminalAutoPrintSetBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_PPrinterGroupByPrinterGroupId()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">pTerminalAutoPrintSet</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">pTerminalAutoPrintSet</span>.<span style="color: #CC4747">getPPrinterGroupByPrinterGroupId()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     */
    public void setupSelect_PPrinterGroupByPrinterGroupId() {
        assertSetupSelectPurpose("pPrinterGroupByPrinterGroupId");
        if (hasSpecifiedLocalColumn()) {
            specify().columnPrinterGroupId();
        }
        doSetupSelect(() -> query().queryPPrinterGroupByPrinterGroupId());
    }

    protected PPrinterNss _nssPPrinterByPrinterId;
    public PPrinterNss xdfgetNssPPrinterByPrinterId() {
        if (_nssPPrinterByPrinterId == null) { _nssPPrinterByPrinterId = new PPrinterNss(null); }
        return _nssPPrinterByPrinterId;
    }
    /**
     * Set up relation columns to select clause. <br>
     * P_PRINTER by my PRINTER_ID, named 'PPrinterByPrinterId'.
     * <pre>
     * <span style="color: #0000C0">pTerminalAutoPrintSetBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_PPrinterByPrinterId()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">pTerminalAutoPrintSet</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">pTerminalAutoPrintSet</span>.<span style="color: #CC4747">getPPrinterByPrinterId()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public PPrinterNss setupSelect_PPrinterByPrinterId() {
        assertSetupSelectPurpose("pPrinterByPrinterId");
        if (hasSpecifiedLocalColumn()) {
            specify().columnPrinterId();
        }
        doSetupSelect(() -> query().queryPPrinterByPrinterId());
        if (_nssPPrinterByPrinterId == null || !_nssPPrinterByPrinterId.hasConditionQuery())
        { _nssPPrinterByPrinterId = new PPrinterNss(query().queryPPrinterByPrinterId()); }
        return _nssPPrinterByPrinterId;
    }

    protected PPrinterAttributeNss _nssPPrinterAttributeByPrinterAttributeId;
    public PPrinterAttributeNss xdfgetNssPPrinterAttributeByPrinterAttributeId() {
        if (_nssPPrinterAttributeByPrinterAttributeId == null) { _nssPPrinterAttributeByPrinterAttributeId = new PPrinterAttributeNss(null); }
        return _nssPPrinterAttributeByPrinterAttributeId;
    }
    /**
     * Set up relation columns to select clause. <br>
     * P_PRINTER_ATTRIBUTE by my PRINTER_ATTRIBUTE_ID, named 'PPrinterAttributeByPrinterAttributeId'.
     * <pre>
     * <span style="color: #0000C0">pTerminalAutoPrintSetBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_PPrinterAttributeByPrinterAttributeId()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">pTerminalAutoPrintSet</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">pTerminalAutoPrintSet</span>.<span style="color: #CC4747">getPPrinterAttributeByPrinterAttributeId()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public PPrinterAttributeNss setupSelect_PPrinterAttributeByPrinterAttributeId() {
        assertSetupSelectPurpose("pPrinterAttributeByPrinterAttributeId");
        if (hasSpecifiedLocalColumn()) {
            specify().columnPrinterAttributeId();
        }
        doSetupSelect(() -> query().queryPPrinterAttributeByPrinterAttributeId());
        if (_nssPPrinterAttributeByPrinterAttributeId == null || !_nssPPrinterAttributeByPrinterAttributeId.hasConditionQuery())
        { _nssPPrinterAttributeByPrinterAttributeId = new PPrinterAttributeNss(query().queryPPrinterAttributeByPrinterAttributeId()); }
        return _nssPPrinterAttributeByPrinterAttributeId;
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

    public static class HpSpecification extends HpAbstractSpecification<PTerminalAutoPrintSetCQ> {
        protected PReportLayoutCB.HpSpecification _pReportLayoutByReportLayoutId;
        protected PPrinterGroupCB.HpSpecification _pPrinterGroupByPrinterGroupId;
        protected PPrinterCB.HpSpecification _pPrinterByPrinterId;
        protected PPrinterAttributeCB.HpSpecification _pPrinterAttributeByPrinterAttributeId;
        public HpSpecification(ConditionBean baseCB, HpSpQyCall<PTerminalAutoPrintSetCQ> qyCall
                             , HpCBPurpose purpose, DBMetaProvider dbmetaProvider
                             , HpSDRFunctionFactory sdrFuncFactory)
        { super(baseCB, qyCall, purpose, dbmetaProvider, sdrFuncFactory); }
        /**
         * TERMINAL_AUTO_PRINT_SET_ID: {PK, ID, NotNull, bigint identity(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnTerminalAutoPrintSetId() { return doColumn("TERMINAL_AUTO_PRINT_SET_ID"); }
        /**
         * TERMINAL_ASSIGN_CD: {UQ+, IX, NotNull, varchar(100)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnTerminalAssignCd() { return doColumn("TERMINAL_ASSIGN_CD"); }
        /**
         * REPORT_LAYOUT_ID: {+UQ, IX, NotNull, bigint(19), FK to P_REPORT_LAYOUT}
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
            columnTerminalAutoPrintSetId(); // PK
            if (qyCall().qy().hasConditionQueryPReportLayoutByReportLayoutId()
                    || qyCall().qy().xgetReferrerQuery() instanceof PReportLayoutCQ) {
                columnReportLayoutId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryPPrinterGroupByPrinterGroupId()
                    || qyCall().qy().xgetReferrerQuery() instanceof PPrinterGroupCQ) {
                columnPrinterGroupId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryPPrinterByPrinterId()
                    || qyCall().qy().xgetReferrerQuery() instanceof PPrinterCQ) {
                columnPrinterId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryPPrinterAttributeByPrinterAttributeId()
                    || qyCall().qy().xgetReferrerQuery() instanceof PPrinterAttributeCQ) {
                columnPrinterAttributeId(); // FK or one-to-one referrer
            }
        }
        @Override
        protected String getTableDbName() { return "P_TERMINAL_AUTO_PRINT_SET"; }
        /**
         * Prepare to specify functions about relation table. <br>
         * P_REPORT_LAYOUT by my REPORT_LAYOUT_ID, named 'PReportLayoutByReportLayoutId'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public PReportLayoutCB.HpSpecification specifyPReportLayoutByReportLayoutId() {
            assertRelation("pReportLayoutByReportLayoutId");
            if (_pReportLayoutByReportLayoutId == null) {
                _pReportLayoutByReportLayoutId = new PReportLayoutCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryPReportLayoutByReportLayoutId()
                                    , () -> _qyCall.qy().queryPReportLayoutByReportLayoutId())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _pReportLayoutByReportLayoutId.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryPReportLayoutByReportLayoutId()
                      , () -> xsyncQyCall().qy().queryPReportLayoutByReportLayoutId()));
                }
            }
            return _pReportLayoutByReportLayoutId;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * P_PRINTER_GROUP by my PRINTER_GROUP_ID, named 'PPrinterGroupByPrinterGroupId'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public PPrinterGroupCB.HpSpecification specifyPPrinterGroupByPrinterGroupId() {
            assertRelation("pPrinterGroupByPrinterGroupId");
            if (_pPrinterGroupByPrinterGroupId == null) {
                _pPrinterGroupByPrinterGroupId = new PPrinterGroupCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryPPrinterGroupByPrinterGroupId()
                                    , () -> _qyCall.qy().queryPPrinterGroupByPrinterGroupId())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _pPrinterGroupByPrinterGroupId.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryPPrinterGroupByPrinterGroupId()
                      , () -> xsyncQyCall().qy().queryPPrinterGroupByPrinterGroupId()));
                }
            }
            return _pPrinterGroupByPrinterGroupId;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * P_PRINTER by my PRINTER_ID, named 'PPrinterByPrinterId'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public PPrinterCB.HpSpecification specifyPPrinterByPrinterId() {
            assertRelation("pPrinterByPrinterId");
            if (_pPrinterByPrinterId == null) {
                _pPrinterByPrinterId = new PPrinterCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryPPrinterByPrinterId()
                                    , () -> _qyCall.qy().queryPPrinterByPrinterId())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _pPrinterByPrinterId.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryPPrinterByPrinterId()
                      , () -> xsyncQyCall().qy().queryPPrinterByPrinterId()));
                }
            }
            return _pPrinterByPrinterId;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * P_PRINTER_ATTRIBUTE by my PRINTER_ATTRIBUTE_ID, named 'PPrinterAttributeByPrinterAttributeId'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public PPrinterAttributeCB.HpSpecification specifyPPrinterAttributeByPrinterAttributeId() {
            assertRelation("pPrinterAttributeByPrinterAttributeId");
            if (_pPrinterAttributeByPrinterAttributeId == null) {
                _pPrinterAttributeByPrinterAttributeId = new PPrinterAttributeCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryPPrinterAttributeByPrinterAttributeId()
                                    , () -> _qyCall.qy().queryPPrinterAttributeByPrinterAttributeId())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _pPrinterAttributeByPrinterAttributeId.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryPPrinterAttributeByPrinterAttributeId()
                      , () -> xsyncQyCall().qy().queryPPrinterAttributeByPrinterAttributeId()));
                }
            }
            return _pPrinterAttributeByPrinterAttributeId;
        }
        /**
         * Prepare for (Specify)MyselfDerived (SubQuery).
         * @return The object to set up a function for myself table. (NotNull)
         */
        public HpSDRFunction<PTerminalAutoPrintSetCB, PTerminalAutoPrintSetCQ> myselfDerived() {
            assertDerived("myselfDerived"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<PTerminalAutoPrintSetCB> sq, PTerminalAutoPrintSetCQ cq, String al, DerivedReferrerOption op)
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
    public PTerminalAutoPrintSetCB dreamCruiseCB() {
        PTerminalAutoPrintSetCB cb = new PTerminalAutoPrintSetCB();
        cb.xsetupForDreamCruise((PTerminalAutoPrintSetCB) this);
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
    public HpColQyOperand<PTerminalAutoPrintSetCB> columnQuery(final SpecifyQuery<PTerminalAutoPrintSetCB> colCBLambda) {
        return xcreateColQyOperand((rightSp, operand) -> {
            return xcolqy(xcreateColumnQueryCB(), xcreateColumnQueryCB(), colCBLambda, rightSp, operand);
        });
    }

    protected PTerminalAutoPrintSetCB xcreateColumnQueryCB() {
        PTerminalAutoPrintSetCB cb = new PTerminalAutoPrintSetCB();
        cb.xsetupForColumnQuery((PTerminalAutoPrintSetCB)this);
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
    public void orScopeQuery(OrQuery<PTerminalAutoPrintSetCB> orCBLambda) {
        xorSQ((PTerminalAutoPrintSetCB)this, orCBLambda);
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
    public void orScopeQueryAndPart(AndQuery<PTerminalAutoPrintSetCB> andCBLambda) {
        xorSQAP((PTerminalAutoPrintSetCB)this, andCBLambda);
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
        final PTerminalAutoPrintSetCB cb;
        if (mainCB != null) {
            cb = (PTerminalAutoPrintSetCB)mainCB;
        } else {
            cb = new PTerminalAutoPrintSetCB();
        }
        specify().xsetSyncQyCall(xcreateSpQyCall(() -> true, () -> cb.query()));
    }

    // ===================================================================================
    //                                                                            Internal
    //                                                                            ========
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xgetConditionBeanClassNameInternally() { return PTerminalAutoPrintSetCB.class.getName(); }
    protected String xgetConditionQueryClassNameInternally() { return PTerminalAutoPrintSetCQ.class.getName(); }
    protected String xgetSubQueryClassNameInternally() { return SubQuery.class.getName(); }
    protected String xgetConditionOptionClassNameInternally() { return ConditionOption.class.getName(); }
}
