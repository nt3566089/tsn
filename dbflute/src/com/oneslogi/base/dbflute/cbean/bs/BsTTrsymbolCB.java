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
 * The base condition-bean of T_TRSYMBOL.
 * @author DBFlute(AutoGenerator)
 */
public class BsTTrsymbolCB extends AbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TTrsymbolCQ _conditionQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTTrsymbolCB() {
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
        return "T_TRSYMBOL";
    }

    // ===================================================================================
    //                                                                 PrimaryKey Handling
    //                                                                 ===================
    /**
     * Accept the query condition of primary key as equal.
     * @param trsymbolId : PK, ID, IX, NotNull, bigint identity(19). (NotNull)
     * @return this. (NotNull)
     */
    public TTrsymbolCB acceptPK(Long trsymbolId) {
        assertObjectNotNull("trsymbolId", trsymbolId);
        BsTTrsymbolCB cb = this;
        cb.query().setTrsymbolId_Equal(trsymbolId);
        return (TTrsymbolCB)this;
    }

    /**
     * Accept the query condition of primary key as equal. (old style)
     * @param trsymbolId : PK, ID, IX, NotNull, bigint identity(19). (NotNull)
     */
    public void acceptPrimaryKey(Long trsymbolId) {
        assertObjectNotNull("trsymbolId", trsymbolId);
        BsTTrsymbolCB cb = this;
        cb.query().setTrsymbolId_Equal(trsymbolId);
    }

    public ConditionBean addOrderBy_PK_Asc() {
        query().addOrderBy_TrsymbolId_Asc();
        return this;
    }

    public ConditionBean addOrderBy_PK_Desc() {
        query().addOrderBy_TrsymbolId_Desc();
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
    public TTrsymbolCQ query() {
        assertQueryPurpose(); // assert only when user-public query
        return doGetConditionQuery();
    }

    public TTrsymbolCQ xdfgetConditionQuery() { // public for parameter comment and internal
        return doGetConditionQuery();
    }

    protected TTrsymbolCQ doGetConditionQuery() {
        if (_conditionQuery == null) {
            _conditionQuery = createLocalCQ();
        }
        return _conditionQuery;
    }

    protected TTrsymbolCQ createLocalCQ() {
        return xcreateCQ(null, getSqlClause(), getSqlClause().getBasePointAliasName(), 0);
    }

    protected TTrsymbolCQ xcreateCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        TTrsymbolCQ cq = xnewCQ(childQuery, sqlClause, aliasName, nestLevel);
        cq.xsetBaseCB(this);
        return cq;
    }

    protected TTrsymbolCQ xnewCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        return new TTrsymbolCQ(childQuery, sqlClause, aliasName, nestLevel);
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
    public void union(UnionQuery<TTrsymbolCB> unionCBLambda) {
        final TTrsymbolCB cb = new TTrsymbolCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionCBLambda.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final TTrsymbolCQ cq = cb.query(); query().xsetUnionQuery(cq);
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
    public void unionAll(UnionQuery<TTrsymbolCB> unionCBLambda) {
        final TTrsymbolCB cb = new TTrsymbolCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionCBLambda.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final TTrsymbolCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
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

    public static class HpSpecification extends HpAbstractSpecification<TTrsymbolCQ> {
        public HpSpecification(ConditionBean baseCB, HpSpQyCall<TTrsymbolCQ> qyCall
                             , HpCBPurpose purpose, DBMetaProvider dbmetaProvider
                             , HpSDRFunctionFactory sdrFuncFactory)
        { super(baseCB, qyCall, purpose, dbmetaProvider, sdrFuncFactory); }
        /**
         * TRSYMBOL_ID: {PK, ID, IX, NotNull, bigint identity(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnTrsymbolId() { return doColumn("TRSYMBOL_ID"); }
        /**
         * CASECD: {NotNull, bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCasecd() { return doColumn("CASECD"); }
        /**
         * PRODUCT_CD: {IX, varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnProductCd() { return doColumn("PRODUCT_CD"); }
        /**
         * ITEMCD: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnItemcd() { return doColumn("ITEMCD"); }
        /**
         * PRODUCT_CD_CASE: {IX+, varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnProductCdCase() { return doColumn("PRODUCT_CD_CASE"); }
        /**
         * PRODUCT_CD_IN: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnProductCdIn() { return doColumn("PRODUCT_CD_IN"); }
        /**
         * LOT3: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnLot3() { return doColumn("LOT3"); }
        /**
         * DESIGNCD_IN: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDesigncdIn() { return doColumn("DESIGNCD_IN"); }
        /**
         * DESIGNCD_CASE: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDesigncdCase() { return doColumn("DESIGNCD_CASE"); }
        /**
         * LOT4: {varchar(8)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnLot4() { return doColumn("LOT4"); }
        /**
         * LOT1: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnLot1() { return doColumn("LOT1"); }
        /**
         * LOT2: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnLot2() { return doColumn("LOT2"); }
        /**
         * SYMBOLLINENO: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSymbollineno() { return doColumn("SYMBOLLINENO"); }
        /**
         * OWNERCD: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnOwnercd() { return doColumn("OWNERCD"); }
        /**
         * STOCK_TYPE_CD: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnStockTypeCd() { return doColumn("STOCK_TYPE_CD"); }
        /**
         * FOREIGNCARGOFLG: {decimal(16, 6)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnForeigncargoflg() { return doColumn("FOREIGNCARGOFLG"); }
        /**
         * CUSTOMSRELEASEFLG: {decimal(16, 6)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCustomsreleaseflg() { return doColumn("CUSTOMSRELEASEFLG"); }
        /**
         * DAMAGEFLG: {decimal(16, 6)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDamageflg() { return doColumn("DAMAGEFLG"); }
        /**
         * RECEIVE_PLAN_H_ID: {IX, bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnReceivePlanHId() { return doColumn("RECEIVE_PLAN_H_ID"); }
        /**
         * RECEIVE_PLAN_B_ID: {decimal(16, 6)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnReceivePlanBId() { return doColumn("RECEIVE_PLAN_B_ID"); }
        /**
         * RCVLINENO: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnRcvlineno() { return doColumn("RCVLINENO"); }
        /**
         * SENDRCVKEY: {IX, decimal(16, 6)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSendrcvkey() { return doColumn("SENDRCVKEY"); }
        /**
         * MAKERCASENO: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnMakercaseno() { return doColumn("MAKERCASENO"); }
        /**
         * SYMBOLSTS: {NotNull, varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSymbolsts() { return doColumn("SYMBOLSTS"); }
        /**
         * SYMBOLADDFLG: {NotNull, varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSymboladdflg() { return doColumn("SYMBOLADDFLG"); }
        /**
         * PRINTEDFLG: {NotNull, char(1)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnPrintedflg() { return doColumn("PRINTEDFLG"); }
        /**
         * SYMBOLSNDDATE: {varchar(8)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSymbolsnddate() { return doColumn("SYMBOLSNDDATE"); }
        /**
         * SYMBOLPASTDATE: {varchar(8)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSymbolpastdate() { return doColumn("SYMBOLPASTDATE"); }
        /**
         * SYMBOLPALLETONDATE: {varchar(8)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSymbolpalletondate() { return doColumn("SYMBOLPALLETONDATE"); }
        /**
         * RECEIVEDATE: {varchar(8)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnReceivedate() { return doColumn("RECEIVEDATE"); }
        /**
         * PALLET_ID: {IX, bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnPalletId() { return doColumn("PALLET_ID"); }
        /**
         * BASE_PALLET_ID: {decimal(16, 6)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnBasePalletId() { return doColumn("BASE_PALLET_ID"); }
        /**
         * PARENTPALLETUPDDATE: {datetime2(26, 6)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnParentpalletupddate() { return doColumn("PARENTPALLETUPDDATE"); }
        /**
         * PRINTINGDATE: {varchar(8)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnPrintingdate() { return doColumn("PRINTINGDATE"); }
        /**
         * LOCATION_ID: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnLocationId() { return doColumn("LOCATION_ID"); }
        /**
         * RESTQTY: {decimal(16, 6)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnRestqty() { return doColumn("RESTQTY"); }
        /**
         * RECEIVEDQTY: {decimal(16, 6)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnReceivedqty() { return doColumn("RECEIVEDQTY"); }
        /**
         * DISTRIBUTIONCD: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDistributioncd() { return doColumn("DISTRIBUTIONCD"); }
        /**
         * TRANSPORTCD: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnTransportcd() { return doColumn("TRANSPORTCD"); }
        /**
         * ORDERNO: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnOrderno() { return doColumn("ORDERNO"); }
        /**
         * RCV_PALLET_ID: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnRcvPalletId() { return doColumn("RCV_PALLET_ID"); }
        /**
         * SYMBOLFACTORYCD: {IX+, varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSymbolfactorycd() { return doColumn("SYMBOLFACTORYCD"); }
        /**
         * SYMBOLITEMCD: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSymbolitemcd() { return doColumn("SYMBOLITEMCD"); }
        /**
         * SYMBOLSKU: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSymbolsku() { return doColumn("SYMBOLSKU"); }
        /**
         * SYMBOLRECEIVECD: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSymbolreceivecd() { return doColumn("SYMBOLRECEIVECD"); }
        /**
         * SYMBOLPRODUCTMARK: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSymbolproductmark() { return doColumn("SYMBOLPRODUCTMARK"); }
        /**
         * SYMBOLORDERNO: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSymbolorderno() { return doColumn("SYMBOLORDERNO"); }
        /**
         * SYMBOLPRINTERNO: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSymbolprinterno() { return doColumn("SYMBOLPRINTERNO"); }
        /**
         * SYMBOLMAKENO: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSymbolmakeno() { return doColumn("SYMBOLMAKENO"); }
        /**
         * SYMBOLLOT4: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSymbollot4() { return doColumn("SYMBOLLOT4"); }
        /**
         * SYMBOLMAKETIME: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSymbolmaketime() { return doColumn("SYMBOLMAKETIME"); }
        /**
         * SYMBOLCIRCULATIONID: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSymbolcirculationid() { return doColumn("SYMBOLCIRCULATIONID"); }
        /**
         * SYMBOLRCVKEY: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSymbolrcvkey() { return doColumn("SYMBOLRCVKEY"); }
        /**
         * SYMBOLLOT3: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSymbollot3() { return doColumn("SYMBOLLOT3"); }
        /**
         * QRData: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnQrdata() { return doColumn("QRData"); }
        /**
         * TREXAMRESULT_ID: {IX, bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnTrexamresultId() { return doColumn("TREXAMRESULT_ID"); }
        /**
         * CASEITFNO: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCaseitfno() { return doColumn("CASEITFNO"); }
        /**
         * CASEBARCODEVALIANT: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCasebarcodevaliant() { return doColumn("CASEBARCODEVALIANT"); }
        /**
         * CASELOT4: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCaselot4() { return doColumn("CASELOT4"); }
        /**
         * DATETIME: {datetime2(26, 6)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDatetime() { return doColumn("DATETIME"); }
        /**
         * CASECENTERNO: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCasecenterno() { return doColumn("CASECENTERNO"); }
        /**
         * CASEPACKNO: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCasepackno() { return doColumn("CASEPACKNO"); }
        /**
         * CASEPACKTIME: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCasepacktime() { return doColumn("CASEPACKTIME"); }
        /**
         * CASEBARCODE: {IX, varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCasebarcode() { return doColumn("CASEBARCODE"); }
        /**
         * MIXEDFLG: {char(1), default=[(0)]}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnMixedflg() { return doColumn("MIXEDFLG"); }
        /**
         * SHIPPEDFLG: {char(1), default=[(0)]}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnShippedflg() { return doColumn("SHIPPEDFLG"); }
        /**
         * CASECREATETYPE: {NotNull, varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCasecreatetype() { return doColumn("CASECREATETYPE"); }
        /**
         * CREATEDATETIME: {datetime2(26, 6)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCreatedatetime() { return doColumn("CREATEDATETIME"); }
        /**
         * InitNum: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnInitnum() { return doColumn("InitNum"); }
        /**
         * ParentCaseCd: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnParentcasecd() { return doColumn("ParentCaseCd"); }
        /**
         * TR_PICKLIST_ID: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnTrPicklistId() { return doColumn("TR_PICKLIST_ID"); }
        /**
         * PicklistGNo: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnPicklistgno() { return doColumn("PicklistGNo"); }
        /**
         * RecombDatetime: {datetime2(26, 6)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnRecombdatetime() { return doColumn("RecombDatetime"); }
        /**
         * ReprintedFlg: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnReprintedflg() { return doColumn("ReprintedFlg"); }
        /**
         * TraceSts: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnTracests() { return doColumn("TraceSts"); }
        /**
         * CLIENT_ID: {NotNull, bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnClientId() { return doColumn("CLIENT_ID"); }
        /**
         * BATJPRODUCTIONYM: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnBatjproductionym() { return doColumn("BATJPRODUCTIONYM"); }
        /**
         * COMETODATE: {varchar(8)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCometodate() { return doColumn("COMETODATE"); }
        /**
         * RCVPALLETNO: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnRcvpalletno() { return doColumn("RCVPALLETNO"); }
        /**
         * TAXPALLETNO: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnTaxpalletno() { return doColumn("TAXPALLETNO"); }
        /**
         * SHTYPECD: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnShtypecd() { return doColumn("SHTYPECD"); }
        /**
         * CENTER_ID: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCenterId() { return doColumn("CENTER_ID"); }
        /**
         * RESTCTN: {decimal(16, 6)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnRestctn() { return doColumn("RESTCTN"); }
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
            columnTrsymbolId(); // PK
        }
        @Override
        protected String getTableDbName() { return "T_TRSYMBOL"; }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from T_CENTER_SYMBOL where ...) as FOO_MAX} <br>
         * T_CENTER_SYMBOL by TRSYMBOL_ID, named 'TCenterSymbolList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(symbolCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     symbolCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     symbolCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TCenterSymbol.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TCenterSymbolCB, TTrsymbolCQ> derivedTCenterSymbolList() {
            assertDerived("tCenterSymbolList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TCenterSymbolCB> sq, TTrsymbolCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTCenterSymbolList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)MyselfDerived (SubQuery).
         * @return The object to set up a function for myself table. (NotNull)
         */
        public HpSDRFunction<TTrsymbolCB, TTrsymbolCQ> myselfDerived() {
            assertDerived("myselfDerived"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TTrsymbolCB> sq, TTrsymbolCQ cq, String al, DerivedReferrerOption op)
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
    public TTrsymbolCB dreamCruiseCB() {
        TTrsymbolCB cb = new TTrsymbolCB();
        cb.xsetupForDreamCruise((TTrsymbolCB) this);
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
    public HpColQyOperand<TTrsymbolCB> columnQuery(final SpecifyQuery<TTrsymbolCB> colCBLambda) {
        return xcreateColQyOperand((rightSp, operand) -> {
            return xcolqy(xcreateColumnQueryCB(), xcreateColumnQueryCB(), colCBLambda, rightSp, operand);
        });
    }

    protected TTrsymbolCB xcreateColumnQueryCB() {
        TTrsymbolCB cb = new TTrsymbolCB();
        cb.xsetupForColumnQuery((TTrsymbolCB)this);
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
    public void orScopeQuery(OrQuery<TTrsymbolCB> orCBLambda) {
        xorSQ((TTrsymbolCB)this, orCBLambda);
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
    public void orScopeQueryAndPart(AndQuery<TTrsymbolCB> andCBLambda) {
        xorSQAP((TTrsymbolCB)this, andCBLambda);
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
        final TTrsymbolCB cb;
        if (mainCB != null) {
            cb = (TTrsymbolCB)mainCB;
        } else {
            cb = new TTrsymbolCB();
        }
        specify().xsetSyncQyCall(xcreateSpQyCall(() -> true, () -> cb.query()));
    }

    // ===================================================================================
    //                                                                            Internal
    //                                                                            ========
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xgetConditionBeanClassNameInternally() { return TTrsymbolCB.class.getName(); }
    protected String xgetConditionQueryClassNameInternally() { return TTrsymbolCQ.class.getName(); }
    protected String xgetSubQueryClassNameInternally() { return SubQuery.class.getName(); }
    protected String xgetConditionOptionClassNameInternally() { return ConditionOption.class.getName(); }
}
