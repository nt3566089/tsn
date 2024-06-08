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
 * The base condition-bean of E_TSN_MFCOMPANY.
 * @author DBFlute(AutoGenerator)
 */
public class BsETsnMfcompanyCB extends AbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected ETsnMfcompanyCQ _conditionQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsETsnMfcompanyCB() {
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
        return "E_TSN_MFCOMPANY";
    }

    // ===================================================================================
    //                                                                 PrimaryKey Handling
    //                                                                 ===================
    /**
     * Accept the query condition of primary key as equal.
     * @param tsnMfcompanyId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return this. (NotNull)
     */
    public ETsnMfcompanyCB acceptPK(Long tsnMfcompanyId) {
        assertObjectNotNull("tsnMfcompanyId", tsnMfcompanyId);
        BsETsnMfcompanyCB cb = this;
        cb.query().setTsnMfcompanyId_Equal(tsnMfcompanyId);
        return (ETsnMfcompanyCB)this;
    }

    /**
     * Accept the query condition of primary key as equal. (old style)
     * @param tsnMfcompanyId : PK, ID, NotNull, bigint identity(19). (NotNull)
     */
    public void acceptPrimaryKey(Long tsnMfcompanyId) {
        assertObjectNotNull("tsnMfcompanyId", tsnMfcompanyId);
        BsETsnMfcompanyCB cb = this;
        cb.query().setTsnMfcompanyId_Equal(tsnMfcompanyId);
    }

    public ConditionBean addOrderBy_PK_Asc() {
        query().addOrderBy_TsnMfcompanyId_Asc();
        return this;
    }

    public ConditionBean addOrderBy_PK_Desc() {
        query().addOrderBy_TsnMfcompanyId_Desc();
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
    public ETsnMfcompanyCQ query() {
        assertQueryPurpose(); // assert only when user-public query
        return doGetConditionQuery();
    }

    public ETsnMfcompanyCQ xdfgetConditionQuery() { // public for parameter comment and internal
        return doGetConditionQuery();
    }

    protected ETsnMfcompanyCQ doGetConditionQuery() {
        if (_conditionQuery == null) {
            _conditionQuery = createLocalCQ();
        }
        return _conditionQuery;
    }

    protected ETsnMfcompanyCQ createLocalCQ() {
        return xcreateCQ(null, getSqlClause(), getSqlClause().getBasePointAliasName(), 0);
    }

    protected ETsnMfcompanyCQ xcreateCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        ETsnMfcompanyCQ cq = xnewCQ(childQuery, sqlClause, aliasName, nestLevel);
        cq.xsetBaseCB(this);
        return cq;
    }

    protected ETsnMfcompanyCQ xnewCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        return new ETsnMfcompanyCQ(childQuery, sqlClause, aliasName, nestLevel);
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
    public void union(UnionQuery<ETsnMfcompanyCB> unionCBLambda) {
        final ETsnMfcompanyCB cb = new ETsnMfcompanyCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionCBLambda.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final ETsnMfcompanyCQ cq = cb.query(); query().xsetUnionQuery(cq);
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
    public void unionAll(UnionQuery<ETsnMfcompanyCB> unionCBLambda) {
        final ETsnMfcompanyCB cb = new ETsnMfcompanyCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionCBLambda.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final ETsnMfcompanyCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
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

    public static class HpSpecification extends HpAbstractSpecification<ETsnMfcompanyCQ> {
        public HpSpecification(ConditionBean baseCB, HpSpQyCall<ETsnMfcompanyCQ> qyCall
                             , HpCBPurpose purpose, DBMetaProvider dbmetaProvider
                             , HpSDRFunctionFactory sdrFuncFactory)
        { super(baseCB, qyCall, purpose, dbmetaProvider, sdrFuncFactory); }
        /**
         * TSN_MFCOMPANY_ID: {PK, ID, NotNull, bigint identity(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnTsnMfcompanyId() { return doColumn("TSN_MFCOMPANY_ID"); }
        /**
         * IMPORT_FLG: {NotNull, char(1), default=[(0)]}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnImportFlg() { return doColumn("IMPORT_FLG"); }
        /**
         * ZZORGNCD: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnZzorgncd() { return doColumn("ZZORGNCD"); }
        /**
         * ZZORGNID: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnZzorgnid() { return doColumn("ZZORGNID"); }
        /**
         * ORGNMKJF: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnOrgnmkjf() { return doColumn("ORGNMKJF"); }
        /**
         * JTONFNF: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnJtonfnf() { return doColumn("JTONFNF"); }
        /**
         * ONFNHA: {varchar(100)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnOnfnha() { return doColumn("ONFNHA"); }
        /**
         * JTONFNH: {varchar(100)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnJtonfnh() { return doColumn("JTONFNH"); }
        /**
         * ZZORGNAM: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnZzorgnam() { return doColumn("ZZORGNAM"); }
        /**
         * JTONANF: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnJtonanf() { return doColumn("JTONANF"); }
        /**
         * ONANHA: {varchar(100)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnOnanha() { return doColumn("ONANHA"); }
        /**
         * JTONANH: {varchar(100)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnJtonanh() { return doColumn("JTONANH"); }
        /**
         * ANWHNM: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnAnwhnm() { return doColumn("ANWHNM"); }
        /**
         * IOORID: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnIoorid() { return doColumn("IOORID"); }
        /**
         * ORGPSNO: {varchar(100), default=[000-0000]}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnOrgpsno() { return doColumn("ORGPSNO"); }
        /**
         * ADVCD: {varchar(100)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnAdvcd() { return doColumn("ADVCD"); }
        /**
         * COUNC: {varchar(100)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCounc() { return doColumn("COUNC"); }
        /**
         * ORGADR1: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnOrgadr1() { return doColumn("ORGADR1"); }
        /**
         * ORGTEL: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnOrgtel() { return doColumn("ORGTEL"); }
        /**
         * ORTL2: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnOrtl2() { return doColumn("ORTL2"); }
        /**
         * ORGFAX: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnOrgfax() { return doColumn("ORGFAX"); }
        /**
         * ZZHORGCD: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnZzhorgcd() { return doColumn("ZZHORGCD"); }
        /**
         * ZZBASECD: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnZzbasecd() { return doColumn("ZZBASECD"); }
        /**
         * CSADMAG: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCsadmag() { return doColumn("CSADMAG"); }
        /**
         * TAXOCD: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnTaxocd() { return doColumn("TAXOCD"); }
        /**
         * UPTAXID: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnUptaxid() { return doColumn("UPTAXID"); }
        /**
         * STATCID: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnStatcid() { return doColumn("STATCID"); }
        /**
         * STLNDID: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnStlndid() { return doColumn("STLNDID"); }
        /**
         * ZZWHMGID: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnZzwhmgid() { return doColumn("ZZWHMGID"); }
        /**
         * TSCPNM: {varchar(100)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnTscpnm() { return doColumn("TSCPNM"); }
        /**
         * DEPCD: {varchar(100)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDepcd() { return doColumn("DEPCD"); }
        /**
         * CNLID: {varchar(100)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCnlid() { return doColumn("CNLID"); }
        /**
         * OTRNK: {varchar(100)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnOtrnk() { return doColumn("OTRNK"); }
        /**
         * ORATTID1: {varchar(100)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnOrattid1() { return doColumn("ORATTID1"); }
        /**
         * ORATTID2: {varchar(100)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnOrattid2() { return doColumn("ORATTID2"); }
        /**
         * ORATTID3: {varchar(100)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnOrattid3() { return doColumn("ORATTID3"); }
        /**
         * ATTID1: {varchar(100)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnAttid1() { return doColumn("ATTID1"); }
        /**
         * ATTID2: {varchar(100)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnAttid2() { return doColumn("ATTID2"); }
        /**
         * ATTID3: {varchar(100)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnAttid3() { return doColumn("ATTID3"); }
        /**
         * ORATTID4: {varchar(100)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnOrattid4() { return doColumn("ORATTID4"); }
        /**
         * BSDID: {varchar(100)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnBsdid() { return doColumn("BSDID"); }
        /**
         * RPBCD: {varchar(100)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnRpbcd() { return doColumn("RPBCD"); }
        /**
         * FAUORGCD: {varchar(100)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnFauorgcd() { return doColumn("FAUORGCD"); }
        /**
         * AUORGCD: {varchar(100)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnAuorgcd() { return doColumn("AUORGCD"); }
        /**
         * CSTCTCD: {varchar(100)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCstctcd() { return doColumn("CSTCTCD"); }
        /**
         * BIZARCD: {varchar(100)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnBizarcd() { return doColumn("BIZARCD"); }
        /**
         * FWCTCD: {varchar(100)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnFwctcd() { return doColumn("FWCTCD"); }
        /**
         * RDVDID: {varchar(100)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnRdvdid() { return doColumn("RDVDID"); }
        /**
         * ZZABLYMD: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnZzablymd() { return doColumn("ZZABLYMD"); }
        /**
         * BPTNID: {varchar(100)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnBptnid() { return doColumn("BPTNID"); }
        /**
         * SNKHG: {varchar(100)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSnkhg() { return doColumn("SNKHG"); }
        /**
         * TXCANSFG: {varchar(100)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnTxcansfg() { return doColumn("TXCANSFG"); }
        /**
         * CSNPT: {varchar(100)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCsnpt() { return doColumn("CSNPT"); }
        /**
         * TBSOCSTM: {varchar(100)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnTbsocstm() { return doColumn("TBSOCSTM"); }
        /**
         * ODTSCD: {varchar(100)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnOdtscd() { return doColumn("ODTSCD"); }
        /**
         * LNARCD: {varchar(100)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnLnarcd() { return doColumn("LNARCD"); }
        /**
         * SASASID: {varchar(100)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSasasid() { return doColumn("SASASID"); }
        /**
         * CMLRASID: {varchar(100)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCmlrasid() { return doColumn("CMLRASID"); }
        /**
         * CSOID: {varchar(100)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCsoid() { return doColumn("CSOID"); }
        /**
         * UPMN: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnUpmn() { return doColumn("UPMN"); }
        /**
         * CHNGYD: {varchar(8)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnChngyd() { return doColumn("CHNGYD"); }
        /**
         * UPDTM: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnUpdtm() { return doColumn("UPDTM"); }
        /**
         * UPDIS: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnUpdis() { return doColumn("UPDIS"); }
        /**
         * UPBMN: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnUpbmn() { return doColumn("UPBMN"); }
        /**
         * BCHNGYD: {varchar(8)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnBchngyd() { return doColumn("BCHNGYD"); }
        /**
         * BUPDTM: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnBupdtm() { return doColumn("BUPDTM"); }
        /**
         * UPOBMN: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnUpobmn() { return doColumn("UPOBMN"); }
        /**
         * OBCHNGYD: {varchar(8)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnObchngyd() { return doColumn("OBCHNGYD"); }
        /**
         * OBUPDTM: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnObupdtm() { return doColumn("OBUPDTM"); }
        /**
         * ZZFRDATEH: {varchar(8)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnZzfrdateh() { return doColumn("ZZFRDATEH"); }
        /**
         * ZZTODATEH: {varchar(8)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnZztodateh() { return doColumn("ZZTODATEH"); }
        /**
         * RCDUPDPS: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnRcdupdps() { return doColumn("RCDUPDPS"); }
        /**
         * UPDUSRID: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnUpdusrid() { return doColumn("UPDUSRID"); }
        /**
         * UPDPOCD: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnUpdpocd() { return doColumn("UPDPOCD"); }
        /**
         * OTCMPFG: {decimal(16, 6)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnOtcmpfg() { return doColumn("OTCMPFG"); }
        /**
         * TMCMPFG: {decimal(16, 6)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnTmcmpfg() { return doColumn("TMCMPFG"); }
        /**
         * STMID: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnStmid() { return doColumn("STMID"); }
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
            columnTsnMfcompanyId(); // PK
        }
        @Override
        protected String getTableDbName() { return "E_TSN_MFCOMPANY"; }
        /**
         * Prepare for (Specify)MyselfDerived (SubQuery).
         * @return The object to set up a function for myself table. (NotNull)
         */
        public HpSDRFunction<ETsnMfcompanyCB, ETsnMfcompanyCQ> myselfDerived() {
            assertDerived("myselfDerived"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<ETsnMfcompanyCB> sq, ETsnMfcompanyCQ cq, String al, DerivedReferrerOption op)
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
    public ETsnMfcompanyCB dreamCruiseCB() {
        ETsnMfcompanyCB cb = new ETsnMfcompanyCB();
        cb.xsetupForDreamCruise((ETsnMfcompanyCB) this);
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
    public HpColQyOperand<ETsnMfcompanyCB> columnQuery(final SpecifyQuery<ETsnMfcompanyCB> colCBLambda) {
        return xcreateColQyOperand((rightSp, operand) -> {
            return xcolqy(xcreateColumnQueryCB(), xcreateColumnQueryCB(), colCBLambda, rightSp, operand);
        });
    }

    protected ETsnMfcompanyCB xcreateColumnQueryCB() {
        ETsnMfcompanyCB cb = new ETsnMfcompanyCB();
        cb.xsetupForColumnQuery((ETsnMfcompanyCB)this);
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
    public void orScopeQuery(OrQuery<ETsnMfcompanyCB> orCBLambda) {
        xorSQ((ETsnMfcompanyCB)this, orCBLambda);
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
    public void orScopeQueryAndPart(AndQuery<ETsnMfcompanyCB> andCBLambda) {
        xorSQAP((ETsnMfcompanyCB)this, andCBLambda);
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
        final ETsnMfcompanyCB cb;
        if (mainCB != null) {
            cb = (ETsnMfcompanyCB)mainCB;
        } else {
            cb = new ETsnMfcompanyCB();
        }
        specify().xsetSyncQyCall(xcreateSpQyCall(() -> true, () -> cb.query()));
    }

    // ===================================================================================
    //                                                                            Internal
    //                                                                            ========
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xgetConditionBeanClassNameInternally() { return ETsnMfcompanyCB.class.getName(); }
    protected String xgetConditionQueryClassNameInternally() { return ETsnMfcompanyCQ.class.getName(); }
    protected String xgetSubQueryClassNameInternally() { return SubQuery.class.getName(); }
    protected String xgetConditionOptionClassNameInternally() { return ConditionOption.class.getName(); }
}
