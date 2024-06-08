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

/**
 * The base condition-bean of E_SHOP_IMPORT_SEND.
 * @author DBFlute(AutoGenerator)
 */
public class BsEShopImportSendCB extends AbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected EShopImportSendCQ _conditionQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsEShopImportSendCB() {
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
        return "E_SHOP_IMPORT_SEND";
    }

    // ===================================================================================
    //                                                                 PrimaryKey Handling
    //                                                                 ===================
    /**
     * Accept the query condition of primary key as equal.
     * @param shopImportSendId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return this. (NotNull)
     */
    public EShopImportSendCB acceptPK(Long shopImportSendId) {
        assertObjectNotNull("shopImportSendId", shopImportSendId);
        BsEShopImportSendCB cb = this;
        cb.query().setShopImportSendId_Equal(shopImportSendId);
        return (EShopImportSendCB)this;
    }

    /**
     * Accept the query condition of primary key as equal. (old style)
     * @param shopImportSendId : PK, ID, NotNull, bigint identity(19). (NotNull)
     */
    public void acceptPrimaryKey(Long shopImportSendId) {
        assertObjectNotNull("shopImportSendId", shopImportSendId);
        BsEShopImportSendCB cb = this;
        cb.query().setShopImportSendId_Equal(shopImportSendId);
    }

    public ConditionBean addOrderBy_PK_Asc() {
        query().addOrderBy_ShopImportSendId_Asc();
        return this;
    }

    public ConditionBean addOrderBy_PK_Desc() {
        query().addOrderBy_ShopImportSendId_Desc();
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
    public EShopImportSendCQ query() {
        assertQueryPurpose(); // assert only when user-public query
        return doGetConditionQuery();
    }

    public EShopImportSendCQ xdfgetConditionQuery() { // public for parameter comment and internal
        return doGetConditionQuery();
    }

    protected EShopImportSendCQ doGetConditionQuery() {
        if (_conditionQuery == null) {
            _conditionQuery = createLocalCQ();
        }
        return _conditionQuery;
    }

    protected EShopImportSendCQ createLocalCQ() {
        return xcreateCQ(null, getSqlClause(), getSqlClause().getBasePointAliasName(), 0);
    }

    protected EShopImportSendCQ xcreateCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        EShopImportSendCQ cq = xnewCQ(childQuery, sqlClause, aliasName, nestLevel);
        cq.xsetBaseCB(this);
        return cq;
    }

    protected EShopImportSendCQ xnewCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        return new EShopImportSendCQ(childQuery, sqlClause, aliasName, nestLevel);
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
    public void union(UnionQuery<EShopImportSendCB> unionCBLambda) {
        final EShopImportSendCB cb = new EShopImportSendCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionCBLambda.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final EShopImportSendCQ cq = cb.query(); query().xsetUnionQuery(cq);
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
    public void unionAll(UnionQuery<EShopImportSendCB> unionCBLambda) {
        final EShopImportSendCB cb = new EShopImportSendCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionCBLambda.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final EShopImportSendCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
    }

    // ===================================================================================
    //                                                                         SetupSelect
    //                                                                         ===========
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

    public static class HpSpecification extends HpAbstractSpecification<EShopImportSendCQ> {
        public HpSpecification(ConditionBean baseCB, HpSpQyCall<EShopImportSendCQ> qyCall
                             , HpCBPurpose purpose, DBMetaProvider dbmetaProvider
                             , HpSDRFunctionFactory sdrFuncFactory)
        { super(baseCB, qyCall, purpose, dbmetaProvider, sdrFuncFactory); }
        /**
         * SHOP_IMPORT_SEND_ID: {PK, ID, NotNull, bigint identity(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnShopImportSendId() { return doColumn("SHOP_IMPORT_SEND_ID"); }
        /**
         * SEND_CD: {NotNull, varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSendCd() { return doColumn("SEND_CD"); }
        /**
         * SEND_ROW_ID: {NotNull, bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSendRowId() { return doColumn("SEND_ROW_ID"); }
        /**
         * WORK_FLG: {NotNull, char(1), default=[0]}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnWorkFlg() { return doColumn("WORK_FLG"); }
        /**
         * SYMBOL_POS_KEY: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSymbolPosKey() { return doColumn("SYMBOL_POS_KEY"); }
        /**
         * WAREHOUSE_CD: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnWarehouseCd() { return doColumn("WAREHOUSE_CD"); }
        /**
         * WAREHOUSE_SNAME: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnWarehouseSname() { return doColumn("WAREHOUSE_SNAME"); }
        /**
         * FACTORY_CD: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnFactoryCd() { return doColumn("FACTORY_CD"); }
        /**
         * FACTORY_SNAME: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnFactorySname() { return doColumn("FACTORY_SNAME"); }
        /**
         * ITEM_CD_CASE: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnItemCdCase() { return doColumn("ITEM_CD_CASE"); }
        /**
         * ITEM_SNAME_CASE: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnItemSnameCase() { return doColumn("ITEM_SNAME_CASE"); }
        /**
         * ITEM_CD_WH: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnItemCdWh() { return doColumn("ITEM_CD_WH"); }
        /**
         * ITEM_SNAME_WH: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnItemSnameWh() { return doColumn("ITEM_SNAME_WH"); }
        /**
         * RCV_KEY: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnRcvKey() { return doColumn("RCV_KEY"); }
        /**
         * MACHINE_NO: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnMachineNo() { return doColumn("MACHINE_NO"); }
        /**
         * CREATE_NO: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCreateNo() { return doColumn("CREATE_NO"); }
        /**
         * LIMIT_DATE_NOW: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnLimitDateNow() { return doColumn("LIMIT_DATE_NOW"); }
        /**
         * DESIGN_CD_CASE: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDesignCdCase() { return doColumn("DESIGN_CD_CASE"); }
        /**
         * FIRMTRANSPORT_NO: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnFirmtransportNo() { return doColumn("FIRMTRANSPORT_NO"); }
        /**
         * MANUFACTURE_CD: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnManufactureCd() { return doColumn("MANUFACTURE_CD"); }
        /**
         * OTHER_LOT1: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnOtherLot1() { return doColumn("OTHER_LOT1"); }
        /**
         * CASE_CREATE_TYPE: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCaseCreateType() { return doColumn("CASE_CREATE_TYPE"); }
        /**
         * CODE_SNAME: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCodeSname() { return doColumn("CODE_SNAME"); }
        /**
         * RECEIVE_DATE: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnReceiveDate() { return doColumn("RECEIVE_DATE"); }
        /**
         * ARRIVAL_PORT_DATE: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnArrivalPortDate() { return doColumn("ARRIVAL_PORT_DATE"); }
        /**
         * SHIP_NAME: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnShipName() { return doColumn("SHIP_NAME"); }
        /**
         * INIT_NUM: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnInitNum() { return doColumn("INIT_NUM"); }
        /**
         * MIXED_FLG: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnMixedFlg() { return doColumn("MIXED_FLG"); }
        /**
         * LEND_FLG: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnLendFlg() { return doColumn("LEND_FLG"); }
        /**
         * LOC_GROUP: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnLocGroup() { return doColumn("LOC_GROUP"); }
        /**
         * LOC_CD: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnLocCd() { return doColumn("LOC_CD"); }
        /**
         * SHIP_DATE: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnShipDate() { return doColumn("SHIP_DATE"); }
        /**
         * CURRENT_LOCATION_CD: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCurrentLocationCd() { return doColumn("CURRENT_LOCATION_CD"); }
        /**
         * CURRENT_LOCATION_SNAME: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCurrentLocationSname() { return doColumn("CURRENT_LOCATION_SNAME"); }
        /**
         * SHIP_TO_CD: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnShipToCd() { return doColumn("SHIP_TO_CD"); }
        /**
         * SHIP_TO_SNAME: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnShipToSname() { return doColumn("SHIP_TO_SNAME"); }
        /**
         * CREATE_DATETIME: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCreateDatetime() { return doColumn("CREATE_DATETIME"); }
        /**
         * TRACE_TYPE: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnTraceType() { return doColumn("TRACE_TYPE"); }
        /**
         * TRACE_TYPE_SNAME: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnTraceTypeSname() { return doColumn("TRACE_TYPE_SNAME"); }
        /**
         * EXAM_STS: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnExamSts() { return doColumn("EXAM_STS"); }
        /**
         * CASE_IN_NUM: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCaseInNum() { return doColumn("CASE_IN_NUM"); }
        /**
         * SHIPPING_NUM: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnShippingNum() { return doColumn("SHIPPING_NUM"); }
        /**
         * ASSORT_DATETIME: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnAssortDatetime() { return doColumn("ASSORT_DATETIME"); }
        /**
         * LINE_BLOCK: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnLineBlock() { return doColumn("LINE_BLOCK"); }
        /**
         * ASSORTED_UNIT: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnAssortedUnit() { return doColumn("ASSORTED_UNIT"); }
        /**
         * ASSORTED_INDEX: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnAssortedIndex() { return doColumn("ASSORTED_INDEX"); }
        /**
         * OPERATION_CODE: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnOperationCode() { return doColumn("OPERATION_CODE"); }
        /**
         * OPERATION_NUM: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnOperationNum() { return doColumn("OPERATION_NUM"); }
        /**
         * ASSORT_NUM: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnAssortNum() { return doColumn("ASSORT_NUM"); }
        /**
         * ASSORT_DIF_NUM: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnAssortDifNum() { return doColumn("ASSORT_DIF_NUM"); }
        /**
         * DIRECTION_CD: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDirectionCd() { return doColumn("DIRECTION_CD"); }
        /**
         * PISTON_TYPE: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnPistonType() { return doColumn("PISTON_TYPE"); }
        /**
         * CUSTOMER_CD: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCustomerCd() { return doColumn("CUSTOMER_CD"); }
        /**
         * DIRECTION_NUM: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDirectionNum() { return doColumn("DIRECTION_NUM"); }
        /**
         * SUPPLIER_RCV_NO: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSupplierRcvNo() { return doColumn("SUPPLIER_RCV_NO"); }
        /**
         * TOKUHAN_CD: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnTokuhanCd() { return doColumn("TOKUHAN_CD"); }
        /**
         * TOKUHAN_SNAME: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnTokuhanSname() { return doColumn("TOKUHAN_SNAME"); }
        /**
         * MAKER_CASE_NO: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnMakerCaseNo() { return doColumn("MAKER_CASE_NO"); }
        /**
         * CASE_ITF_NO: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCaseItfNo() { return doColumn("CASE_ITF_NO"); }
        /**
         * CASE_BARCODE_VALIANT: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCaseBarcodeValiant() { return doColumn("CASE_BARCODE_VALIANT"); }
        /**
         * CASE_LOT4: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCaseLot4() { return doColumn("CASE_LOT4"); }
        /**
         * CASE_CENTER_NO: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCaseCenterNo() { return doColumn("CASE_CENTER_NO"); }
        /**
         * CASE_PACK_NO: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCasePackNo() { return doColumn("CASE_PACK_NO"); }
        /**
         * CASE_PACK_TIME: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCasePackTime() { return doColumn("CASE_PACK_TIME"); }
        /**
         * SENDER_LOCATION: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSenderLocation() { return doColumn("SENDER_LOCATION"); }
        /**
         * RECEIVER_LOCATION: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnReceiverLocation() { return doColumn("RECEIVER_LOCATION"); }
        /**
         * SHIPMENT_ID: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnShipmentId() { return doColumn("SHIPMENT_ID"); }
        /**
         * SHIPMENT_DATE: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnShipmentDate() { return doColumn("SHIPMENT_DATE"); }
        /**
         * NUMBER_OF_PALLETS: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnNumberOfPallets() { return doColumn("NUMBER_OF_PALLETS"); }
        /**
         * CARRIER_NO: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCarrierNo() { return doColumn("CARRIER_NO"); }
        /**
         * ORDER_NO: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnOrderNo() { return doColumn("ORDER_NO"); }
        /**
         * SRC_CD: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSrcCd() { return doColumn("SRC_CD"); }
        /**
         * BL_NO: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnBlNo() { return doColumn("BL_NO"); }
        /**
         * INVOICE_NO: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnInvoiceNo() { return doColumn("INVOICE_NO"); }
        /**
         * SSCC: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSscc() { return doColumn("SSCC"); }
        /**
         * CASE_NO: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCaseNo() { return doColumn("CASE_NO"); }
        /**
         * INV_NUM: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnInvNum() { return doColumn("INV_NUM"); }
        /**
         * SORT_NUM: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSortNum() { return doColumn("SORT_NUM"); }
        /**
         * ADOPT_NUM: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnAdoptNum() { return doColumn("ADOPT_NUM"); }
        /**
         * DELIVERY_DATETIME: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDeliveryDatetime() { return doColumn("DELIVERY_DATETIME"); }
        /**
         * SPARE_STR: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSpareStr() { return doColumn("SPARE_STR"); }
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
            columnShopImportSendId(); // PK
        }
        @Override
        protected String getTableDbName() { return "E_SHOP_IMPORT_SEND"; }
        /**
         * Prepare for (Specify)MyselfDerived (SubQuery).
         * @return The object to set up a function for myself table. (NotNull)
         */
        public HpSDRFunction<EShopImportSendCB, EShopImportSendCQ> myselfDerived() {
            assertDerived("myselfDerived"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<EShopImportSendCB> sq, EShopImportSendCQ cq, String al, DerivedReferrerOption op)
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
    public EShopImportSendCB dreamCruiseCB() {
        EShopImportSendCB cb = new EShopImportSendCB();
        cb.xsetupForDreamCruise((EShopImportSendCB) this);
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
    public HpColQyOperand<EShopImportSendCB> columnQuery(final SpecifyQuery<EShopImportSendCB> colCBLambda) {
        return xcreateColQyOperand((rightSp, operand) -> {
            return xcolqy(xcreateColumnQueryCB(), xcreateColumnQueryCB(), colCBLambda, rightSp, operand);
        });
    }

    protected EShopImportSendCB xcreateColumnQueryCB() {
        EShopImportSendCB cb = new EShopImportSendCB();
        cb.xsetupForColumnQuery((EShopImportSendCB)this);
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
    public void orScopeQuery(OrQuery<EShopImportSendCB> orCBLambda) {
        xorSQ((EShopImportSendCB)this, orCBLambda);
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
    public void orScopeQueryAndPart(AndQuery<EShopImportSendCB> andCBLambda) {
        xorSQAP((EShopImportSendCB)this, andCBLambda);
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
        final EShopImportSendCB cb;
        if (mainCB != null) {
            cb = (EShopImportSendCB)mainCB;
        } else {
            cb = new EShopImportSendCB();
        }
        specify().xsetSyncQyCall(xcreateSpQyCall(() -> true, () -> cb.query()));
    }

    // ===================================================================================
    //                                                                            Internal
    //                                                                            ========
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xgetConditionBeanClassNameInternally() { return EShopImportSendCB.class.getName(); }
    protected String xgetConditionQueryClassNameInternally() { return EShopImportSendCQ.class.getName(); }
    protected String xgetSubQueryClassNameInternally() { return SubQuery.class.getName(); }
    protected String xgetConditionOptionClassNameInternally() { return ConditionOption.class.getName(); }
}
