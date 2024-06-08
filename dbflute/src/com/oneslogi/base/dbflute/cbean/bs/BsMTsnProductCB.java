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
 * The base condition-bean of M_TSN_PRODUCT.
 * @author DBFlute(AutoGenerator)
 */
public class BsMTsnProductCB extends AbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MTsnProductCQ _conditionQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMTsnProductCB() {
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
        return "M_TSN_PRODUCT";
    }

    // ===================================================================================
    //                                                                 PrimaryKey Handling
    //                                                                 ===================
    /**
     * Accept the query condition of primary key as equal.
     * @param tsnProductId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return this. (NotNull)
     */
    public MTsnProductCB acceptPK(Long tsnProductId) {
        assertObjectNotNull("tsnProductId", tsnProductId);
        BsMTsnProductCB cb = this;
        cb.query().setTsnProductId_Equal(tsnProductId);
        return (MTsnProductCB)this;
    }

    /**
     * Accept the query condition of primary key as equal. (old style)
     * @param tsnProductId : PK, ID, NotNull, bigint identity(19). (NotNull)
     */
    public void acceptPrimaryKey(Long tsnProductId) {
        assertObjectNotNull("tsnProductId", tsnProductId);
        BsMTsnProductCB cb = this;
        cb.query().setTsnProductId_Equal(tsnProductId);
    }

    public ConditionBean addOrderBy_PK_Asc() {
        query().addOrderBy_TsnProductId_Asc();
        return this;
    }

    public ConditionBean addOrderBy_PK_Desc() {
        query().addOrderBy_TsnProductId_Desc();
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
    public MTsnProductCQ query() {
        assertQueryPurpose(); // assert only when user-public query
        return doGetConditionQuery();
    }

    public MTsnProductCQ xdfgetConditionQuery() { // public for parameter comment and internal
        return doGetConditionQuery();
    }

    protected MTsnProductCQ doGetConditionQuery() {
        if (_conditionQuery == null) {
            _conditionQuery = createLocalCQ();
        }
        return _conditionQuery;
    }

    protected MTsnProductCQ createLocalCQ() {
        return xcreateCQ(null, getSqlClause(), getSqlClause().getBasePointAliasName(), 0);
    }

    protected MTsnProductCQ xcreateCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        MTsnProductCQ cq = xnewCQ(childQuery, sqlClause, aliasName, nestLevel);
        cq.xsetBaseCB(this);
        return cq;
    }

    protected MTsnProductCQ xnewCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        return new MTsnProductCQ(childQuery, sqlClause, aliasName, nestLevel);
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
    public void union(UnionQuery<MTsnProductCB> unionCBLambda) {
        final MTsnProductCB cb = new MTsnProductCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionCBLambda.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final MTsnProductCQ cq = cb.query(); query().xsetUnionQuery(cq);
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
    public void unionAll(UnionQuery<MTsnProductCB> unionCBLambda) {
        final MTsnProductCB cb = new MTsnProductCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionCBLambda.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final MTsnProductCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
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

    public static class HpSpecification extends HpAbstractSpecification<MTsnProductCQ> {
        public HpSpecification(ConditionBean baseCB, HpSpQyCall<MTsnProductCQ> qyCall
                             , HpCBPurpose purpose, DBMetaProvider dbmetaProvider
                             , HpSDRFunctionFactory sdrFuncFactory)
        { super(baseCB, qyCall, purpose, dbmetaProvider, sdrFuncFactory); }
        /**
         * TSN_PRODUCT_ID: {PK, ID, NotNull, bigint identity(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnTsnProductId() { return doColumn("TSN_PRODUCT_ID"); }
        /**
         * IMPORT_FLG: {NotNull, char(1), default=[(0)]}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnImportFlg() { return doColumn("IMPORT_FLG"); }
        /**
         * ZZMATNR: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnZzmatnr() { return doColumn("ZZMATNR"); }
        /**
         * BRFNFL: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnBrfnfl() { return doColumn("BRFNFL"); }
        /**
         * BRFNHF: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnBrfnhf() { return doColumn("BRFNHF"); }
        /**
         * BRANFL: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnBranfl() { return doColumn("BRANFL"); }
        /**
         * BRANHF: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnBranhf() { return doColumn("BRANHF"); }
        /**
         * SOBRFNFL: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSobrfnfl() { return doColumn("SOBRFNFL"); }
        /**
         * SOBRFNHF: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSobrfnhf() { return doColumn("SOBRFNHF"); }
        /**
         * BRKNAME: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnBrkname() { return doColumn("BRKNAME"); }
        /**
         * CGGDID: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCggdid() { return doColumn("CGGDID"); }
        /**
         * ZZDEVCID: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnZzdevcid() { return doColumn("ZZDEVCID"); }
        /**
         * USID: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnUsid() { return doColumn("USID"); }
        /**
         * CGRID: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCgrid() { return doColumn("CGRID"); }
        /**
         * CBCCCVCE: {decimal(16, 6)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCbcccvce() { return doColumn("CBCCCVCE"); }
        /**
         * SFCBQA: {decimal(16, 6)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSfcbqa() { return doColumn("SFCBQA"); }
        /**
         * CTNUM: {decimal(16, 6)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCtnum() { return doColumn("CTNUM"); }
        /**
         * CBNUM: {decimal(16, 6)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCbnum() { return doColumn("CBNUM"); }
        /**
         * PATCBQA: {decimal(16, 6)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnPatcbqa() { return doColumn("PATCBQA"); }
        /**
         * ZZSEFFID: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnZzseffid() { return doColumn("ZZSEFFID"); }
        /**
         * ZZABLYMD: {varchar(8)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnZzablymd() { return doColumn("ZZABLYMD"); }
        /**
         * CRSPYMD: {varchar(8)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCrspymd() { return doColumn("CRSPYMD"); }
        /**
         * SEYMD: {varchar(8)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSeymd() { return doColumn("SEYMD"); }
        /**
         * DPBNYD: {varchar(8)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDpbnyd() { return doColumn("DPBNYD"); }
        /**
         * SOBGNYMD: {varchar(8)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSobgnymd() { return doColumn("SOBGNYMD"); }
        /**
         * EXSLYMD: {varchar(8)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnExslymd() { return doColumn("EXSLYMD"); }
        /**
         * AUBRID: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnAubrid() { return doColumn("AUBRID"); }
        /**
         * FWBRID: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnFwbrid() { return doColumn("FWBRID"); }
        /**
         * BRCRID: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnBrcrid() { return doColumn("BRCRID"); }
        /**
         * PABRCD: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnPabrcd() { return doColumn("PABRCD"); }
        /**
         * AUBRCD: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnAubrcd() { return doColumn("AUBRCD"); }
        /**
         * ZZMATNRA: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnZzmatnra() { return doColumn("ZZMATNRA"); }
        /**
         * MRAUCD: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnMraucd() { return doColumn("MRAUCD"); }
        /**
         * ZZSOMIUM: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnZzsomium() { return doColumn("ZZSOMIUM"); }
        /**
         * ZZREGPRCA: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnZzregprca() { return doColumn("ZZREGPRCA"); }
        /**
         * TFPR: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnTfpr() { return doColumn("TFPR"); }
        /**
         * MGRTA: {decimal(16, 6)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnMgrta() { return doColumn("MGRTA"); }
        /**
         * MGRTOK: {decimal(16, 6)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnMgrtok() { return doColumn("MGRTOK"); }
        /**
         * TLNPRU: {decimal(16, 6)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnTlnpru() { return doColumn("TLNPRU"); }
        /**
         * HANUMWT: {decimal(16, 6)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnHanumwt() { return doColumn("HANUMWT"); }
        /**
         * CNSCVCT: {decimal(16, 6)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCnscvct() { return doColumn("CNSCVCT"); }
        /**
         * CGTAXCCT: {decimal(16, 6)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCgtaxcct() { return doColumn("CGTAXCCT"); }
        /**
         * NTXQART: {decimal(16, 6)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnNtxqart() { return doColumn("NTXQART"); }
        /**
         * LTXQART: {decimal(16, 6)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnLtxqart() { return doColumn("LTXQART"); }
        /**
         * ADVTAXRT: {decimal(16, 6)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnAdvtaxrt() { return doColumn("ADVTAXRT"); }
        /**
         * CTYTAXRT: {decimal(16, 6)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCtytaxrt() { return doColumn("CTYTAXRT"); }
        /**
         * PRFPRT: {decimal(16, 6)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnPrfprt() { return doColumn("PRFPRT"); }
        /**
         * NOTAX: {decimal(16, 6)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnNotax() { return doColumn("NOTAX"); }
        /**
         * BRKD: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnBrkd() { return doColumn("BRKD"); }
        /**
         * FMLYCD: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnFmlycd() { return doColumn("FMLYCD"); }
        /**
         * PRGRCD: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnPrgrcd() { return doColumn("PRGRCD"); }
        /**
         * NCTNCLS: {decimal(16, 6)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnNctncls() { return doColumn("NCTNCLS"); }
        /**
         * TARCLS: {decimal(16, 6)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnTarcls() { return doColumn("TARCLS"); }
        /**
         * PDPKSPCD: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnPdpkspcd() { return doColumn("PDPKSPCD"); }
        /**
         * FLTID: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnFltid() { return doColumn("FLTID"); }
        /**
         * KSUBCDID: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnKsubcdid() { return doColumn("KSUBCDID"); }
        /**
         * KSUBCD: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnKsubcd() { return doColumn("KSUBCD"); }
        /**
         * CTBCDID: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCtbcdid() { return doColumn("CTBCDID"); }
        /**
         * CTBCD: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCtbcd() { return doColumn("CTBCD"); }
        /**
         * CBBCDID: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCbbcdid() { return doColumn("CBBCDID"); }
        /**
         * CBBCD: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCbbcd() { return doColumn("CBBCD"); }
        /**
         * CTFM: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCtfm() { return doColumn("CTFM"); }
        /**
         * CTSZL: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCtszl() { return doColumn("CTSZL"); }
        /**
         * CTSZW: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCtszw() { return doColumn("CTSZW"); }
        /**
         * CTSZH: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCtszh() { return doColumn("CTSZH"); }
        /**
         * CTCC: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCtcc() { return doColumn("CTCC"); }
        /**
         * CTWEIGHT: {decimal(16, 6)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCtweight() { return doColumn("CTWEIGHT"); }
        /**
         * CBSZL: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCbszl() { return doColumn("CBSZL"); }
        /**
         * CBSZW: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCbszw() { return doColumn("CBSZW"); }
        /**
         * CBSZH: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCbszh() { return doColumn("CBSZH"); }
        /**
         * CBCC: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCbcc() { return doColumn("CBCC"); }
        /**
         * CBWT: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCbwt() { return doColumn("CBWT"); }
        /**
         * BSCDT: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnBscdt() { return doColumn("BSCDT"); }
        /**
         * BSCDK: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnBscdk() { return doColumn("BSCDK"); }
        /**
         * BSCDC: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnBscdc() { return doColumn("BSCDC"); }
        /**
         * BSCDQ: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnBscdq() { return doColumn("BSCDQ"); }
        /**
         * BSCDH: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnBscdh() { return doColumn("BSCDH"); }
        /**
         * SPAGCDT: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSpagcdt() { return doColumn("SPAGCDT"); }
        /**
         * SPAGCDK: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSpagcdk() { return doColumn("SPAGCDK"); }
        /**
         * SPAGCDC: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSpagcdc() { return doColumn("SPAGCDC"); }
        /**
         * SPAGCDQ: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSpagcdq() { return doColumn("SPAGCDQ"); }
        /**
         * SPAGCDH: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSpagcdh() { return doColumn("SPAGCDH"); }
        /**
         * RBSCD1: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnRbscd1() { return doColumn("RBSCD1"); }
        /**
         * RBSCD2: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnRbscd2() { return doColumn("RBSCD2"); }
        /**
         * RBSCD3: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnRbscd3() { return doColumn("RBSCD3"); }
        /**
         * RBSCD4: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnRbscd4() { return doColumn("RBSCD4"); }
        /**
         * RBSCD5: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnRbscd5() { return doColumn("RBSCD5"); }
        /**
         * USSBCD1: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnUssbcd1() { return doColumn("USSBCD1"); }
        /**
         * USSBCD2: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnUssbcd2() { return doColumn("USSBCD2"); }
        /**
         * USSBCD3: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnUssbcd3() { return doColumn("USSBCD3"); }
        /**
         * USSBCD4: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnUssbcd4() { return doColumn("USSBCD4"); }
        /**
         * USSBCD5: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnUssbcd5() { return doColumn("USSBCD5"); }
        /**
         * SPLCPCD: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSplcpcd() { return doColumn("SPLCPCD"); }
        /**
         * MAKERCD: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnMakercd() { return doColumn("MAKERCD"); }
        /**
         * LAND1: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnLand1() { return doColumn("LAND1"); }
        /**
         * CGCLSDID: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCgclsdid() { return doColumn("CGCLSDID"); }
        /**
         * GNLOTRNK: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnGnlotrnk() { return doColumn("GNLOTRNK"); }
        /**
         * MROTRNK: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnMrotrnk() { return doColumn("MROTRNK"); }
        /**
         * COID: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCoid() { return doColumn("COID"); }
        /**
         * BRWKID: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnBrwkid() { return doColumn("BRWKID"); }
        /**
         * SHUNID: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnShunid() { return doColumn("SHUNID"); }
        /**
         * DSTKBN: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDstkbn() { return doColumn("DSTKBN"); }
        /**
         * REOMATNR: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnReomatnr() { return doColumn("REOMATNR"); }
        /**
         * DSPECKB: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDspeckb() { return doColumn("DSPECKB"); }
        /**
         * SGMID: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSgmid() { return doColumn("SGMID"); }
        /**
         * MAKILENG: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnMakileng() { return doColumn("MAKILENG"); }
        /**
         * MAKIDIA: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnMakidia() { return doColumn("MAKIDIA"); }
        /**
         * GDMSRP: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnGdmsrp() { return doColumn("GDMSRP"); }
        /**
         * GDSLU: {decimal(16, 6)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnGdslu() { return doColumn("GDSLU"); }
        /**
         * GDPRU: {decimal(16, 6)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnGdpru() { return doColumn("GDPRU"); }
        /**
         * EXIMA: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnExima() { return doColumn("EXIMA"); }
        /**
         * EXIMB: {decimal(16, 6)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnEximb() { return doColumn("EXIMB"); }
        /**
         * EXIMC: {decimal(16, 6)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnEximc() { return doColumn("EXIMC"); }
        /**
         * EXIMD: {decimal(16, 6)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnEximd() { return doColumn("EXIMD"); }
        /**
         * EXIME: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnExime() { return doColumn("EXIME"); }
        /**
         * EXIMF: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnEximf() { return doColumn("EXIMF"); }
        /**
         * EXIMG: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnEximg() { return doColumn("EXIMG"); }
        /**
         * EXIMH: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnEximh() { return doColumn("EXIMH"); }
        /**
         * EXIMI: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnEximi() { return doColumn("EXIMI"); }
        /**
         * EXIMJ: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnEximj() { return doColumn("EXIMJ"); }
        /**
         * EXIMK: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnEximk() { return doColumn("EXIMK"); }
        /**
         * EXIML: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnEximl() { return doColumn("EXIML"); }
        /**
         * EXIMM: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnEximm() { return doColumn("EXIMM"); }
        /**
         * EXIMN: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnEximn() { return doColumn("EXIMN"); }
        /**
         * EXIMO: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnEximo() { return doColumn("EXIMO"); }
        /**
         * EXIMP: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnEximp() { return doColumn("EXIMP"); }
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
         * AUBRCHFG: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnAubrchfg() { return doColumn("AUBRCHFG"); }
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
            columnTsnProductId(); // PK
        }
        @Override
        protected String getTableDbName() { return "M_TSN_PRODUCT"; }
        /**
         * Prepare for (Specify)MyselfDerived (SubQuery).
         * @return The object to set up a function for myself table. (NotNull)
         */
        public HpSDRFunction<MTsnProductCB, MTsnProductCQ> myselfDerived() {
            assertDerived("myselfDerived"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<MTsnProductCB> sq, MTsnProductCQ cq, String al, DerivedReferrerOption op)
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
    public MTsnProductCB dreamCruiseCB() {
        MTsnProductCB cb = new MTsnProductCB();
        cb.xsetupForDreamCruise((MTsnProductCB) this);
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
    public HpColQyOperand<MTsnProductCB> columnQuery(final SpecifyQuery<MTsnProductCB> colCBLambda) {
        return xcreateColQyOperand((rightSp, operand) -> {
            return xcolqy(xcreateColumnQueryCB(), xcreateColumnQueryCB(), colCBLambda, rightSp, operand);
        });
    }

    protected MTsnProductCB xcreateColumnQueryCB() {
        MTsnProductCB cb = new MTsnProductCB();
        cb.xsetupForColumnQuery((MTsnProductCB)this);
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
    public void orScopeQuery(OrQuery<MTsnProductCB> orCBLambda) {
        xorSQ((MTsnProductCB)this, orCBLambda);
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
    public void orScopeQueryAndPart(AndQuery<MTsnProductCB> andCBLambda) {
        xorSQAP((MTsnProductCB)this, andCBLambda);
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
        final MTsnProductCB cb;
        if (mainCB != null) {
            cb = (MTsnProductCB)mainCB;
        } else {
            cb = new MTsnProductCB();
        }
        specify().xsetSyncQyCall(xcreateSpQyCall(() -> true, () -> cb.query()));
    }

    // ===================================================================================
    //                                                                            Internal
    //                                                                            ========
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xgetConditionBeanClassNameInternally() { return MTsnProductCB.class.getName(); }
    protected String xgetConditionQueryClassNameInternally() { return MTsnProductCQ.class.getName(); }
    protected String xgetSubQueryClassNameInternally() { return SubQuery.class.getName(); }
    protected String xgetConditionOptionClassNameInternally() { return ConditionOption.class.getName(); }
}
