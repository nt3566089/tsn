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
 * The base condition-bean of T_TRSREPLANDETAIL.
 * @author DBFlute(AutoGenerator)
 */
public class BsTTrsreplandetailCB extends AbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TTrsreplandetailCQ _conditionQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTTrsreplandetailCB() {
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
        return "T_TRSREPLANDETAIL";
    }

    // ===================================================================================
    //                                                                 PrimaryKey Handling
    //                                                                 ===================
    /**
     * Accept the query condition of primary key as equal.
     * @param trsreplandetailId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return this. (NotNull)
     */
    public TTrsreplandetailCB acceptPK(Long trsreplandetailId) {
        assertObjectNotNull("trsreplandetailId", trsreplandetailId);
        BsTTrsreplandetailCB cb = this;
        cb.query().setTrsreplandetailId_Equal(trsreplandetailId);
        return (TTrsreplandetailCB)this;
    }

    /**
     * Accept the query condition of primary key as equal. (old style)
     * @param trsreplandetailId : PK, ID, NotNull, bigint identity(19). (NotNull)
     */
    public void acceptPrimaryKey(Long trsreplandetailId) {
        assertObjectNotNull("trsreplandetailId", trsreplandetailId);
        BsTTrsreplandetailCB cb = this;
        cb.query().setTrsreplandetailId_Equal(trsreplandetailId);
    }

    public ConditionBean addOrderBy_PK_Asc() {
        query().addOrderBy_TrsreplandetailId_Asc();
        return this;
    }

    public ConditionBean addOrderBy_PK_Desc() {
        query().addOrderBy_TrsreplandetailId_Desc();
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
    public TTrsreplandetailCQ query() {
        assertQueryPurpose(); // assert only when user-public query
        return doGetConditionQuery();
    }

    public TTrsreplandetailCQ xdfgetConditionQuery() { // public for parameter comment and internal
        return doGetConditionQuery();
    }

    protected TTrsreplandetailCQ doGetConditionQuery() {
        if (_conditionQuery == null) {
            _conditionQuery = createLocalCQ();
        }
        return _conditionQuery;
    }

    protected TTrsreplandetailCQ createLocalCQ() {
        return xcreateCQ(null, getSqlClause(), getSqlClause().getBasePointAliasName(), 0);
    }

    protected TTrsreplandetailCQ xcreateCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        TTrsreplandetailCQ cq = xnewCQ(childQuery, sqlClause, aliasName, nestLevel);
        cq.xsetBaseCB(this);
        return cq;
    }

    protected TTrsreplandetailCQ xnewCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        return new TTrsreplandetailCQ(childQuery, sqlClause, aliasName, nestLevel);
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
    public void union(UnionQuery<TTrsreplandetailCB> unionCBLambda) {
        final TTrsreplandetailCB cb = new TTrsreplandetailCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionCBLambda.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final TTrsreplandetailCQ cq = cb.query(); query().xsetUnionQuery(cq);
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
    public void unionAll(UnionQuery<TTrsreplandetailCB> unionCBLambda) {
        final TTrsreplandetailCB cb = new TTrsreplandetailCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionCBLambda.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final TTrsreplandetailCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
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

    public static class HpSpecification extends HpAbstractSpecification<TTrsreplandetailCQ> {
        public HpSpecification(ConditionBean baseCB, HpSpQyCall<TTrsreplandetailCQ> qyCall
                             , HpCBPurpose purpose, DBMetaProvider dbmetaProvider
                             , HpSDRFunctionFactory sdrFuncFactory)
        { super(baseCB, qyCall, purpose, dbmetaProvider, sdrFuncFactory); }
        /**
         * TRSREPLANDETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnTrsreplandetailId() { return doColumn("TRSREPLANDETAIL_ID"); }
        /**
         * TRSREPLAN_ID: {NotNull, bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnTrsreplanId() { return doColumn("TRSREPLAN_ID"); }
        /**
         * RCVLINENO: {NotNull, bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnRcvlineno() { return doColumn("RCVLINENO"); }
        /**
         * SUPPLIERRCVLINENO: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSupplierrcvlineno() { return doColumn("SUPPLIERRCVLINENO"); }
        /**
         * XDOCFLG: {NotNull, decimal(16, 6), default=[(0)]}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnXdocflg() { return doColumn("XDOCFLG"); }
        /**
         * POKEY: {decimal(16, 6)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnPokey() { return doColumn("POKEY"); }
        /**
         * POLINENO: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnPolineno() { return doColumn("POLINENO"); }
        /**
         * POTYPE: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnPotype() { return doColumn("POTYPE"); }
        /**
         * OWNERPONO: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnOwnerpono() { return doColumn("OWNERPONO"); }
        /**
         * OWNERPOLINENO: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnOwnerpolineno() { return doColumn("OWNERPOLINENO"); }
        /**
         * ORIGINALPONO: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnOriginalpono() { return doColumn("ORIGINALPONO"); }
        /**
         * ORIGINALPOLINENO: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnOriginalpolineno() { return doColumn("ORIGINALPOLINENO"); }
        /**
         * PODATE: {varchar(8)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnPodate() { return doColumn("PODATE"); }
        /**
         * OWNERCD: {NotNull, varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnOwnercd() { return doColumn("OWNERCD"); }
        /**
         * ITEMADMIN: {NotNull, varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnItemadmin() { return doColumn("ITEMADMIN"); }
        /**
         * PRODUCT_CD: {NotNull, varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnProductCd() { return doColumn("PRODUCT_CD"); }
        /**
         * IFITEMCD: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnIfitemcd() { return doColumn("IFITEMCD"); }
        /**
         * LOT1: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnLot1() { return doColumn("LOT1"); }
        /**
         * LOT2: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnLot2() { return doColumn("LOT2"); }
        /**
         * LOT3: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnLot3() { return doColumn("LOT3"); }
        /**
         * LOT4: {varchar(8)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnLot4() { return doColumn("LOT4"); }
        /**
         * LOT5: {varchar(8)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnLot5() { return doColumn("LOT5"); }
        /**
         * OTHERLOT1: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnOtherlot1() { return doColumn("OTHERLOT1"); }
        /**
         * OTHERLOT2: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnOtherlot2() { return doColumn("OTHERLOT2"); }
        /**
         * OTHERLOT3: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnOtherlot3() { return doColumn("OTHERLOT3"); }
        /**
         * OTHERLOT4: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnOtherlot4() { return doColumn("OTHERLOT4"); }
        /**
         * OTHERLOT5: {decimal(16, 6)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnOtherlot5() { return doColumn("OTHERLOT5"); }
        /**
         * DAMAGEFLG: {NotNull, decimal(16, 6), default=[(0)]}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDamageflg() { return doColumn("DAMAGEFLG"); }
        /**
         * NOSHIPPINGFLG: {NotNull, decimal(16, 6), default=[(0)]}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnNoshippingflg() { return doColumn("NOSHIPPINGFLG"); }
        /**
         * FOREIGNCARGOFLG: {NotNull, decimal(16, 6), default=[(0)]}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnForeigncargoflg() { return doColumn("FOREIGNCARGOFLG"); }
        /**
         * CUSTOMSRELEASEFLG: {NotNull, decimal(16, 6), default=[(0)]}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCustomsreleaseflg() { return doColumn("CUSTOMSRELEASEFLG"); }
        /**
         * TAXFLG: {NotNull, decimal(16, 6), default=[(0)]}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnTaxflg() { return doColumn("TAXFLG"); }
        /**
         * EXPECTQTY1: {NotNull, decimal(16, 6), default=[(0)]}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnExpectqty1() { return doColumn("EXPECTQTY1"); }
        /**
         * EXPECTQTY2: {NotNull, bigint(19), default=[(0)]}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnExpectqty2() { return doColumn("EXPECTQTY2"); }
        /**
         * EXPECTQTY3: {NotNull, bigint(19), default=[(0)]}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnExpectqty3() { return doColumn("EXPECTQTY3"); }
        /**
         * RECEIVEDQTY1: {NotNull, decimal(16, 6), default=[(0)]}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnReceivedqty1() { return doColumn("RECEIVEDQTY1"); }
        /**
         * RECEIVEDQTY2: {NotNull, bigint(19), default=[(0)]}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnReceivedqty2() { return doColumn("RECEIVEDQTY2"); }
        /**
         * RECEIVEDQTY3: {NotNull, bigint(19), default=[(0)]}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnReceivedqty3() { return doColumn("RECEIVEDQTY3"); }
        /**
         * ADJUSTQTY1: {NotNull, decimal(16, 6), default=[(0)]}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnAdjustqty1() { return doColumn("ADJUSTQTY1"); }
        /**
         * ADJUSTQTY2: {NotNull, bigint(19), default=[(0)]}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnAdjustqty2() { return doColumn("ADJUSTQTY2"); }
        /**
         * ADJUSTQTY3: {NotNull, bigint(19), default=[(0)]}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnAdjustqty3() { return doColumn("ADJUSTQTY3"); }
        /**
         * RCVTAGQTY1: {NotNull, decimal(16, 6), default=[(0)]}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnRcvtagqty1() { return doColumn("RCVTAGQTY1"); }
        /**
         * XDOCFREEQTY1: {NotNull, decimal(16, 6), default=[(0)]}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnXdocfreeqty1() { return doColumn("XDOCFREEQTY1"); }
        /**
         * INSPECTEDQTY1: {NotNull, decimal(16, 6), default=[(0)]}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnInspectedqty1() { return doColumn("INSPECTEDQTY1"); }
        /**
         * INSPECTEDQTY2: {NotNull, bigint(19), default=[(0)]}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnInspectedqty2() { return doColumn("INSPECTEDQTY2"); }
        /**
         * INSPECTEDQTY3: {NotNull, bigint(19), default=[(0)]}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnInspectedqty3() { return doColumn("INSPECTEDQTY3"); }
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
         * NOTES: {varchar(4000)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnNotes() { return doColumn("NOTES"); }
        /**
         * ICDATE: {varchar(8)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnIcdate() { return doColumn("ICDATE"); }
        /**
         * ORDERKEY: {decimal(16, 6)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnOrderkey() { return doColumn("ORDERKEY"); }
        /**
         * ORDERLINENO: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnOrderlineno() { return doColumn("ORDERLINENO"); }
        /**
         * OWNERORDERNO: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnOwnerorderno() { return doColumn("OWNERORDERNO"); }
        /**
         * OWNERORDERLINENO: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnOwnerorderlineno() { return doColumn("OWNERORDERLINENO"); }
        /**
         * CUSTORDERNO: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCustorderno() { return doColumn("CUSTORDERNO"); }
        /**
         * CUSTORDERLINENO: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCustorderlineno() { return doColumn("CUSTORDERLINENO"); }
        /**
         * ORDERTYPE: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnOrdertype() { return doColumn("ORDERTYPE"); }
        /**
         * RCVQTYERRORFLG: {NotNull, decimal(16, 6), default=[(0)]}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnRcvqtyerrorflg() { return doColumn("RCVQTYERRORFLG"); }
        /**
         * LOGICFLG1: {NotNull, decimal(16, 6), default=[(0)]}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnLogicflg1() { return doColumn("LOGICFLG1"); }
        /**
         * LOGICFLG2: {NotNull, decimal(16, 6), default=[(0)]}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnLogicflg2() { return doColumn("LOGICFLG2"); }
        /**
         * LOGICFLG3: {NotNull, decimal(16, 6), default=[(0)]}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnLogicflg3() { return doColumn("LOGICFLG3"); }
        /**
         * MOVELINENO: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnMovelineno() { return doColumn("MOVELINENO"); }
        /**
         * ASSYLINENO: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnAssylineno() { return doColumn("ASSYLINENO"); }
        /**
         * PRODUCELINENO: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnProducelineno() { return doColumn("PRODUCELINENO"); }
        /**
         * CHECKLASTLOTFLG: {NotNull, decimal(16, 6), default=[(0)]}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnChecklastlotflg() { return doColumn("CHECKLASTLOTFLG"); }
        /**
         * CENTER_ID: {NotNull, bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCenterId() { return doColumn("CENTER_ID"); }
        /**
         * CLIENT_ID: {NotNull, bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnClientId() { return doColumn("CLIENT_ID"); }
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
            columnTrsreplandetailId(); // PK
        }
        @Override
        protected String getTableDbName() { return "T_TRSREPLANDETAIL"; }
        /**
         * Prepare for (Specify)MyselfDerived (SubQuery).
         * @return The object to set up a function for myself table. (NotNull)
         */
        public HpSDRFunction<TTrsreplandetailCB, TTrsreplandetailCQ> myselfDerived() {
            assertDerived("myselfDerived"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TTrsreplandetailCB> sq, TTrsreplandetailCQ cq, String al, DerivedReferrerOption op)
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
    public TTrsreplandetailCB dreamCruiseCB() {
        TTrsreplandetailCB cb = new TTrsreplandetailCB();
        cb.xsetupForDreamCruise((TTrsreplandetailCB) this);
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
    public HpColQyOperand<TTrsreplandetailCB> columnQuery(final SpecifyQuery<TTrsreplandetailCB> colCBLambda) {
        return xcreateColQyOperand((rightSp, operand) -> {
            return xcolqy(xcreateColumnQueryCB(), xcreateColumnQueryCB(), colCBLambda, rightSp, operand);
        });
    }

    protected TTrsreplandetailCB xcreateColumnQueryCB() {
        TTrsreplandetailCB cb = new TTrsreplandetailCB();
        cb.xsetupForColumnQuery((TTrsreplandetailCB)this);
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
    public void orScopeQuery(OrQuery<TTrsreplandetailCB> orCBLambda) {
        xorSQ((TTrsreplandetailCB)this, orCBLambda);
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
    public void orScopeQueryAndPart(AndQuery<TTrsreplandetailCB> andCBLambda) {
        xorSQAP((TTrsreplandetailCB)this, andCBLambda);
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
        final TTrsreplandetailCB cb;
        if (mainCB != null) {
            cb = (TTrsreplandetailCB)mainCB;
        } else {
            cb = new TTrsreplandetailCB();
        }
        specify().xsetSyncQyCall(xcreateSpQyCall(() -> true, () -> cb.query()));
    }

    // ===================================================================================
    //                                                                            Internal
    //                                                                            ========
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xgetConditionBeanClassNameInternally() { return TTrsreplandetailCB.class.getName(); }
    protected String xgetConditionQueryClassNameInternally() { return TTrsreplandetailCQ.class.getName(); }
    protected String xgetSubQueryClassNameInternally() { return SubQuery.class.getName(); }
    protected String xgetConditionOptionClassNameInternally() { return ConditionOption.class.getName(); }
}