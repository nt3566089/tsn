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
 * The base condition-bean of M_CARRIER_SLIP_YUPK.
 * @author DBFlute(AutoGenerator)
 */
public class BsMCarrierSlipYupkCB extends AbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MCarrierSlipYupkCQ _conditionQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMCarrierSlipYupkCB() {
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
        return "M_CARRIER_SLIP_YUPK";
    }

    // ===================================================================================
    //                                                                 PrimaryKey Handling
    //                                                                 ===================
    /**
     * Accept the query condition of primary key as equal.
     * @param carrierSlipYupkId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return this. (NotNull)
     */
    public MCarrierSlipYupkCB acceptPK(Long carrierSlipYupkId) {
        assertObjectNotNull("carrierSlipYupkId", carrierSlipYupkId);
        BsMCarrierSlipYupkCB cb = this;
        cb.query().setCarrierSlipYupkId_Equal(carrierSlipYupkId);
        return (MCarrierSlipYupkCB)this;
    }

    /**
     * Accept the query condition of primary key as equal. (old style)
     * @param carrierSlipYupkId : PK, ID, NotNull, bigint identity(19). (NotNull)
     */
    public void acceptPrimaryKey(Long carrierSlipYupkId) {
        assertObjectNotNull("carrierSlipYupkId", carrierSlipYupkId);
        BsMCarrierSlipYupkCB cb = this;
        cb.query().setCarrierSlipYupkId_Equal(carrierSlipYupkId);
    }

    /**
     * Accept the query condition of unique key as equal.
     * @param centerId : UQ+, NotNull, bigint(19), FK to M_CENTER. (NotNull)
     * @param tagType : +UQ, NotNull, varchar(30). (NotNull)
     * @return this. (NotNull)
     */
    public MCarrierSlipYupkCB acceptUniqueOf(Long centerId, String tagType) {
        assertObjectNotNull("centerId", centerId);assertObjectNotNull("tagType", tagType);
        BsMCarrierSlipYupkCB cb = this;
        cb.query().setCenterId_Equal(centerId);cb.query().setTagType_Equal(tagType);
        return (MCarrierSlipYupkCB)this;
    }

    public ConditionBean addOrderBy_PK_Asc() {
        query().addOrderBy_CarrierSlipYupkId_Asc();
        return this;
    }

    public ConditionBean addOrderBy_PK_Desc() {
        query().addOrderBy_CarrierSlipYupkId_Desc();
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
    public MCarrierSlipYupkCQ query() {
        assertQueryPurpose(); // assert only when user-public query
        return doGetConditionQuery();
    }

    public MCarrierSlipYupkCQ xdfgetConditionQuery() { // public for parameter comment and internal
        return doGetConditionQuery();
    }

    protected MCarrierSlipYupkCQ doGetConditionQuery() {
        if (_conditionQuery == null) {
            _conditionQuery = createLocalCQ();
        }
        return _conditionQuery;
    }

    protected MCarrierSlipYupkCQ createLocalCQ() {
        return xcreateCQ(null, getSqlClause(), getSqlClause().getBasePointAliasName(), 0);
    }

    protected MCarrierSlipYupkCQ xcreateCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        MCarrierSlipYupkCQ cq = xnewCQ(childQuery, sqlClause, aliasName, nestLevel);
        cq.xsetBaseCB(this);
        return cq;
    }

    protected MCarrierSlipYupkCQ xnewCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        return new MCarrierSlipYupkCQ(childQuery, sqlClause, aliasName, nestLevel);
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
    public void union(UnionQuery<MCarrierSlipYupkCB> unionCBLambda) {
        final MCarrierSlipYupkCB cb = new MCarrierSlipYupkCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionCBLambda.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final MCarrierSlipYupkCQ cq = cb.query(); query().xsetUnionQuery(cq);
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
    public void unionAll(UnionQuery<MCarrierSlipYupkCB> unionCBLambda) {
        final MCarrierSlipYupkCB cb = new MCarrierSlipYupkCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionCBLambda.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final MCarrierSlipYupkCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
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
     * <span style="color: #0000C0">mCarrierSlipYupkBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_MCenter()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mCarrierSlipYupk</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mCarrierSlipYupk</span>.<span style="color: #CC4747">getMCenter()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
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

    protected BClassDtlNss _nssBClassDtlByCharacterCd;
    public BClassDtlNss xdfgetNssBClassDtlByCharacterCd() {
        if (_nssBClassDtlByCharacterCd == null) { _nssBClassDtlByCharacterCd = new BClassDtlNss(null); }
        return _nssBClassDtlByCharacterCd;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my CHARACTER_CD, named 'BClassDtlByCharacterCd'.
     * <pre>
     * <span style="color: #0000C0">mCarrierSlipYupkBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByCharacterCd()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mCarrierSlipYupk</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mCarrierSlipYupk</span>.<span style="color: #CC4747">getBClassDtlByCharacterCd()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
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

    protected BClassDtlNss _nssBClassDtlByCodType;
    public BClassDtlNss xdfgetNssBClassDtlByCodType() {
        if (_nssBClassDtlByCodType == null) { _nssBClassDtlByCodType = new BClassDtlNss(null); }
        return _nssBClassDtlByCodType;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my COD_TYPE, named 'BClassDtlByCodType'.
     * <pre>
     * <span style="color: #0000C0">mCarrierSlipYupkBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByCodType()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mCarrierSlipYupk</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mCarrierSlipYupk</span>.<span style="color: #CC4747">getBClassDtlByCodType()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByCodType() {
        assertSetupSelectPurpose("bClassDtlByCodType");
        if (hasSpecifiedLocalColumn()) {
            specify().columnCodType();
        }
        doSetupSelect(() -> query().queryBClassDtlByCodType());
        if (_nssBClassDtlByCodType == null || !_nssBClassDtlByCodType.hasConditionQuery())
        { _nssBClassDtlByCodType = new BClassDtlNss(query().queryBClassDtlByCodType()); }
        return _nssBClassDtlByCodType;
    }

    protected BClassDtlNss _nssBClassDtlByCoolType;
    public BClassDtlNss xdfgetNssBClassDtlByCoolType() {
        if (_nssBClassDtlByCoolType == null) { _nssBClassDtlByCoolType = new BClassDtlNss(null); }
        return _nssBClassDtlByCoolType;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my COOL_TYPE, named 'BClassDtlByCoolType'.
     * <pre>
     * <span style="color: #0000C0">mCarrierSlipYupkBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByCoolType()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mCarrierSlipYupk</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mCarrierSlipYupk</span>.<span style="color: #CC4747">getBClassDtlByCoolType()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByCoolType() {
        assertSetupSelectPurpose("bClassDtlByCoolType");
        if (hasSpecifiedLocalColumn()) {
            specify().columnCoolType();
        }
        doSetupSelect(() -> query().queryBClassDtlByCoolType());
        if (_nssBClassDtlByCoolType == null || !_nssBClassDtlByCoolType.hasConditionQuery())
        { _nssBClassDtlByCoolType = new BClassDtlNss(query().queryBClassDtlByCoolType()); }
        return _nssBClassDtlByCoolType;
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
     * <span style="color: #0000C0">mCarrierSlipYupkBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByDelFlg()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mCarrierSlipYupk</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mCarrierSlipYupk</span>.<span style="color: #CC4747">getBClassDtlByDelFlg()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
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

    protected BClassDtlNss _nssBClassDtlByNoStockCls;
    public BClassDtlNss xdfgetNssBClassDtlByNoStockCls() {
        if (_nssBClassDtlByNoStockCls == null) { _nssBClassDtlByNoStockCls = new BClassDtlNss(null); }
        return _nssBClassDtlByNoStockCls;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my NO_STOCK_CLS, named 'BClassDtlByNoStockCls'.
     * <pre>
     * <span style="color: #0000C0">mCarrierSlipYupkBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByNoStockCls()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mCarrierSlipYupk</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mCarrierSlipYupk</span>.<span style="color: #CC4747">getBClassDtlByNoStockCls()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByNoStockCls() {
        assertSetupSelectPurpose("bClassDtlByNoStockCls");
        if (hasSpecifiedLocalColumn()) {
            specify().columnNoStockCls();
        }
        doSetupSelect(() -> query().queryBClassDtlByNoStockCls());
        if (_nssBClassDtlByNoStockCls == null || !_nssBClassDtlByNoStockCls.hasConditionQuery())
        { _nssBClassDtlByNoStockCls = new BClassDtlNss(query().queryBClassDtlByNoStockCls()); }
        return _nssBClassDtlByNoStockCls;
    }

    protected BClassDtlNss _nssBClassDtlByNoUpsideDownCls;
    public BClassDtlNss xdfgetNssBClassDtlByNoUpsideDownCls() {
        if (_nssBClassDtlByNoUpsideDownCls == null) { _nssBClassDtlByNoUpsideDownCls = new BClassDtlNss(null); }
        return _nssBClassDtlByNoUpsideDownCls;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my NO_UPSIDE_DOWN_CLS, named 'BClassDtlByNoUpsideDownCls'.
     * <pre>
     * <span style="color: #0000C0">mCarrierSlipYupkBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByNoUpsideDownCls()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mCarrierSlipYupk</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mCarrierSlipYupk</span>.<span style="color: #CC4747">getBClassDtlByNoUpsideDownCls()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByNoUpsideDownCls() {
        assertSetupSelectPurpose("bClassDtlByNoUpsideDownCls");
        if (hasSpecifiedLocalColumn()) {
            specify().columnNoUpsideDownCls();
        }
        doSetupSelect(() -> query().queryBClassDtlByNoUpsideDownCls());
        if (_nssBClassDtlByNoUpsideDownCls == null || !_nssBClassDtlByNoUpsideDownCls.hasConditionQuery())
        { _nssBClassDtlByNoUpsideDownCls = new BClassDtlNss(query().queryBClassDtlByNoUpsideDownCls()); }
        return _nssBClassDtlByNoUpsideDownCls;
    }

    protected BClassDtlNss _nssBClassDtlByPostType;
    public BClassDtlNss xdfgetNssBClassDtlByPostType() {
        if (_nssBClassDtlByPostType == null) { _nssBClassDtlByPostType = new BClassDtlNss(null); }
        return _nssBClassDtlByPostType;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my POST_TYPE, named 'BClassDtlByPostType'.
     * <pre>
     * <span style="color: #0000C0">mCarrierSlipYupkBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByPostType()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mCarrierSlipYupk</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mCarrierSlipYupk</span>.<span style="color: #CC4747">getBClassDtlByPostType()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByPostType() {
        assertSetupSelectPurpose("bClassDtlByPostType");
        if (hasSpecifiedLocalColumn()) {
            specify().columnPostType();
        }
        doSetupSelect(() -> query().queryBClassDtlByPostType());
        if (_nssBClassDtlByPostType == null || !_nssBClassDtlByPostType.hasConditionQuery())
        { _nssBClassDtlByPostType = new BClassDtlNss(query().queryBClassDtlByPostType()); }
        return _nssBClassDtlByPostType;
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

    public static class HpSpecification extends HpAbstractSpecification<MCarrierSlipYupkCQ> {
        protected MCenterCB.HpSpecification _mCenter;
        protected BClassDtlCB.HpSpecification _bClassDtlByCharacterCd;
        protected BClassDtlCB.HpSpecification _bClassDtlByCodType;
        protected BClassDtlCB.HpSpecification _bClassDtlByCoolType;
        protected BClassDtlCB.HpSpecification _bClassDtlByDelFlg;
        protected BClassDtlCB.HpSpecification _bClassDtlByNoStockCls;
        protected BClassDtlCB.HpSpecification _bClassDtlByNoUpsideDownCls;
        protected BClassDtlCB.HpSpecification _bClassDtlByPostType;
        public HpSpecification(ConditionBean baseCB, HpSpQyCall<MCarrierSlipYupkCQ> qyCall
                             , HpCBPurpose purpose, DBMetaProvider dbmetaProvider
                             , HpSDRFunctionFactory sdrFuncFactory)
        { super(baseCB, qyCall, purpose, dbmetaProvider, sdrFuncFactory); }
        /**
         * CARRIER_SLIP_YUPK_ID: {PK, ID, NotNull, bigint identity(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCarrierSlipYupkId() { return doColumn("CARRIER_SLIP_YUPK_ID"); }
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
         * POST_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=PostType}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnPostType() { return doColumn("POST_TYPE"); }
        /**
         * COOL_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=CoolType}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCoolType() { return doColumn("COOL_TYPE"); }
        /**
         * COD_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=CodType}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCodType() { return doColumn("COD_TYPE"); }
        /**
         * CARRIER_TYPE: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCarrierType() { return doColumn("CARRIER_TYPE"); }
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
         * SLIP_CLIENT_ADDRESS3: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSlipClientAddress3() { return doColumn("SLIP_CLIENT_ADDRESS3"); }
        /**
         * SLIP_CLIENT_NM1: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSlipClientNm1() { return doColumn("SLIP_CLIENT_NM1"); }
        /**
         * SLIP_CLIENT_TEL_NO: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSlipClientTelNo() { return doColumn("SLIP_CLIENT_TEL_NO"); }
        /**
         * SLIP_CLIENT_MAIL: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSlipClientMail() { return doColumn("SLIP_CLIENT_MAIL"); }
        /**
         * NO_UPSIDE_DOWN_CLS: {char(1), FK to B_CLASS_DTL, classification=NoUpsideDownCls}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnNoUpsideDownCls() { return doColumn("NO_UPSIDE_DOWN_CLS"); }
        /**
         * NO_STOCK_CLS: {char(1), FK to B_CLASS_DTL, classification=NoStockCls}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnNoStockCls() { return doColumn("NO_STOCK_CLS"); }
        /**
         * SLIP_PRODUCT_SIZE_CLS: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSlipProductSizeCls() { return doColumn("SLIP_PRODUCT_SIZE_CLS"); }
        /**
         * SLIP_PRODUCT_NO: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSlipProductNo() { return doColumn("SLIP_PRODUCT_NO"); }
        /**
         * SLIP_ITEM_NM: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSlipItemNm() { return doColumn("SLIP_ITEM_NM"); }
        /**
         * SHIP_RESERVE_DATA_MARK: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnShipReserveDataMark() { return doColumn("SHIP_RESERVE_DATA_MARK"); }
        /**
         * DELI_CERT_PRE_YEARS: {bigint(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDeliCertPreYears() { return doColumn("DELI_CERT_PRE_YEARS"); }
        /**
         * SEND_NM: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSendNm() { return doColumn("SEND_NM"); }
        /**
         * PRODUCT_TYPE_CODE: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnProductTypeCode() { return doColumn("PRODUCT_TYPE_CODE"); }
        /**
         * POST_BIZ_CARD_CUSTOMER_NO: {varchar(100)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnPostBizCardCustomerNo() { return doColumn("POST_BIZ_CARD_CUSTOMER_NO"); }
        /**
         * SHIPPING_COMPANY_CODE: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnShippingCompanyCode() { return doColumn("SHIPPING_COMPANY_CODE"); }
        /**
         * SHIPMENT_CODE: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnShipmentCode() { return doColumn("SHIPMENT_CODE"); }
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
            columnCarrierSlipYupkId(); // PK
            if (qyCall().qy().hasConditionQueryMCenter()
                    || qyCall().qy().xgetReferrerQuery() instanceof MCenterCQ) {
                columnCenterId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByCharacterCd()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnCharacterCd(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByCodType()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnCodType(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByCoolType()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnCoolType(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByDelFlg()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnDelFlg(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByNoStockCls()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnNoStockCls(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByNoUpsideDownCls()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnNoUpsideDownCls(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByPostType()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnPostType(); // FK or one-to-one referrer
            }
        }
        @Override
        protected String getTableDbName() { return "M_CARRIER_SLIP_YUPK"; }
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
         * B_CLASS_DTL by my COD_TYPE, named 'BClassDtlByCodType'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByCodType() {
            assertRelation("bClassDtlByCodType");
            if (_bClassDtlByCodType == null) {
                _bClassDtlByCodType = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByCodType()
                                    , () -> _qyCall.qy().queryBClassDtlByCodType())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByCodType.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByCodType()
                      , () -> xsyncQyCall().qy().queryBClassDtlByCodType()));
                }
            }
            return _bClassDtlByCodType;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_CLASS_DTL by my COOL_TYPE, named 'BClassDtlByCoolType'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByCoolType() {
            assertRelation("bClassDtlByCoolType");
            if (_bClassDtlByCoolType == null) {
                _bClassDtlByCoolType = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByCoolType()
                                    , () -> _qyCall.qy().queryBClassDtlByCoolType())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByCoolType.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByCoolType()
                      , () -> xsyncQyCall().qy().queryBClassDtlByCoolType()));
                }
            }
            return _bClassDtlByCoolType;
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
         * B_CLASS_DTL by my NO_STOCK_CLS, named 'BClassDtlByNoStockCls'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByNoStockCls() {
            assertRelation("bClassDtlByNoStockCls");
            if (_bClassDtlByNoStockCls == null) {
                _bClassDtlByNoStockCls = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByNoStockCls()
                                    , () -> _qyCall.qy().queryBClassDtlByNoStockCls())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByNoStockCls.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByNoStockCls()
                      , () -> xsyncQyCall().qy().queryBClassDtlByNoStockCls()));
                }
            }
            return _bClassDtlByNoStockCls;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_CLASS_DTL by my NO_UPSIDE_DOWN_CLS, named 'BClassDtlByNoUpsideDownCls'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByNoUpsideDownCls() {
            assertRelation("bClassDtlByNoUpsideDownCls");
            if (_bClassDtlByNoUpsideDownCls == null) {
                _bClassDtlByNoUpsideDownCls = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByNoUpsideDownCls()
                                    , () -> _qyCall.qy().queryBClassDtlByNoUpsideDownCls())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByNoUpsideDownCls.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByNoUpsideDownCls()
                      , () -> xsyncQyCall().qy().queryBClassDtlByNoUpsideDownCls()));
                }
            }
            return _bClassDtlByNoUpsideDownCls;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_CLASS_DTL by my POST_TYPE, named 'BClassDtlByPostType'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByPostType() {
            assertRelation("bClassDtlByPostType");
            if (_bClassDtlByPostType == null) {
                _bClassDtlByPostType = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByPostType()
                                    , () -> _qyCall.qy().queryBClassDtlByPostType())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByPostType.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByPostType()
                      , () -> xsyncQyCall().qy().queryBClassDtlByPostType()));
                }
            }
            return _bClassDtlByPostType;
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from M_DELIVERY_COURSE where ...) as FOO_MAX} <br>
         * M_DELIVERY_COURSE by CARRIER_SLIP_YUPK_ID, named 'MDeliveryCourseList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(courseCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     courseCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     courseCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, MDeliveryCourse.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<MDeliveryCourseCB, MCarrierSlipYupkCQ> derivedMDeliveryCourseList() {
            assertDerived("mDeliveryCourseList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<MDeliveryCourseCB> sq, MCarrierSlipYupkCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveMDeliveryCourseList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)MyselfDerived (SubQuery).
         * @return The object to set up a function for myself table. (NotNull)
         */
        public HpSDRFunction<MCarrierSlipYupkCB, MCarrierSlipYupkCQ> myselfDerived() {
            assertDerived("myselfDerived"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<MCarrierSlipYupkCB> sq, MCarrierSlipYupkCQ cq, String al, DerivedReferrerOption op)
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
    public MCarrierSlipYupkCB dreamCruiseCB() {
        MCarrierSlipYupkCB cb = new MCarrierSlipYupkCB();
        cb.xsetupForDreamCruise((MCarrierSlipYupkCB) this);
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
    public HpColQyOperand<MCarrierSlipYupkCB> columnQuery(final SpecifyQuery<MCarrierSlipYupkCB> colCBLambda) {
        return xcreateColQyOperand((rightSp, operand) -> {
            return xcolqy(xcreateColumnQueryCB(), xcreateColumnQueryCB(), colCBLambda, rightSp, operand);
        });
    }

    protected MCarrierSlipYupkCB xcreateColumnQueryCB() {
        MCarrierSlipYupkCB cb = new MCarrierSlipYupkCB();
        cb.xsetupForColumnQuery((MCarrierSlipYupkCB)this);
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
    public void orScopeQuery(OrQuery<MCarrierSlipYupkCB> orCBLambda) {
        xorSQ((MCarrierSlipYupkCB)this, orCBLambda);
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
    public void orScopeQueryAndPart(AndQuery<MCarrierSlipYupkCB> andCBLambda) {
        xorSQAP((MCarrierSlipYupkCB)this, andCBLambda);
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
        final MCarrierSlipYupkCB cb;
        if (mainCB != null) {
            cb = (MCarrierSlipYupkCB)mainCB;
        } else {
            cb = new MCarrierSlipYupkCB();
        }
        specify().xsetSyncQyCall(xcreateSpQyCall(() -> true, () -> cb.query()));
    }

    // ===================================================================================
    //                                                                            Internal
    //                                                                            ========
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xgetConditionBeanClassNameInternally() { return MCarrierSlipYupkCB.class.getName(); }
    protected String xgetConditionQueryClassNameInternally() { return MCarrierSlipYupkCQ.class.getName(); }
    protected String xgetSubQueryClassNameInternally() { return SubQuery.class.getName(); }
    protected String xgetConditionOptionClassNameInternally() { return ConditionOption.class.getName(); }
}
