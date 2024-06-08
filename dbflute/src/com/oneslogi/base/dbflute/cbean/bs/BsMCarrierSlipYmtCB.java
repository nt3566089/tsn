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
 * The base condition-bean of M_CARRIER_SLIP_YMT.
 * @author DBFlute(AutoGenerator)
 */
public class BsMCarrierSlipYmtCB extends AbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MCarrierSlipYmtCQ _conditionQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMCarrierSlipYmtCB() {
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
        return "M_CARRIER_SLIP_YMT";
    }

    // ===================================================================================
    //                                                                 PrimaryKey Handling
    //                                                                 ===================
    /**
     * Accept the query condition of primary key as equal.
     * @param carrierSlipYmtId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return this. (NotNull)
     */
    public MCarrierSlipYmtCB acceptPK(Long carrierSlipYmtId) {
        assertObjectNotNull("carrierSlipYmtId", carrierSlipYmtId);
        BsMCarrierSlipYmtCB cb = this;
        cb.query().setCarrierSlipYmtId_Equal(carrierSlipYmtId);
        return (MCarrierSlipYmtCB)this;
    }

    /**
     * Accept the query condition of primary key as equal. (old style)
     * @param carrierSlipYmtId : PK, ID, NotNull, bigint identity(19). (NotNull)
     */
    public void acceptPrimaryKey(Long carrierSlipYmtId) {
        assertObjectNotNull("carrierSlipYmtId", carrierSlipYmtId);
        BsMCarrierSlipYmtCB cb = this;
        cb.query().setCarrierSlipYmtId_Equal(carrierSlipYmtId);
    }

    /**
     * Accept the query condition of unique key as equal.
     * @param centerId : UQ+, NotNull, bigint(19), FK to M_CENTER. (NotNull)
     * @param tagType : +UQ, NotNull, varchar(30). (NotNull)
     * @return this. (NotNull)
     */
    public MCarrierSlipYmtCB acceptUniqueOf(Long centerId, String tagType) {
        assertObjectNotNull("centerId", centerId);assertObjectNotNull("tagType", tagType);
        BsMCarrierSlipYmtCB cb = this;
        cb.query().setCenterId_Equal(centerId);cb.query().setTagType_Equal(tagType);
        return (MCarrierSlipYmtCB)this;
    }

    public ConditionBean addOrderBy_PK_Asc() {
        query().addOrderBy_CarrierSlipYmtId_Asc();
        return this;
    }

    public ConditionBean addOrderBy_PK_Desc() {
        query().addOrderBy_CarrierSlipYmtId_Desc();
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
    public MCarrierSlipYmtCQ query() {
        assertQueryPurpose(); // assert only when user-public query
        return doGetConditionQuery();
    }

    public MCarrierSlipYmtCQ xdfgetConditionQuery() { // public for parameter comment and internal
        return doGetConditionQuery();
    }

    protected MCarrierSlipYmtCQ doGetConditionQuery() {
        if (_conditionQuery == null) {
            _conditionQuery = createLocalCQ();
        }
        return _conditionQuery;
    }

    protected MCarrierSlipYmtCQ createLocalCQ() {
        return xcreateCQ(null, getSqlClause(), getSqlClause().getBasePointAliasName(), 0);
    }

    protected MCarrierSlipYmtCQ xcreateCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        MCarrierSlipYmtCQ cq = xnewCQ(childQuery, sqlClause, aliasName, nestLevel);
        cq.xsetBaseCB(this);
        return cq;
    }

    protected MCarrierSlipYmtCQ xnewCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        return new MCarrierSlipYmtCQ(childQuery, sqlClause, aliasName, nestLevel);
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
    public void union(UnionQuery<MCarrierSlipYmtCB> unionCBLambda) {
        final MCarrierSlipYmtCB cb = new MCarrierSlipYmtCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionCBLambda.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final MCarrierSlipYmtCQ cq = cb.query(); query().xsetUnionQuery(cq);
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
    public void unionAll(UnionQuery<MCarrierSlipYmtCB> unionCBLambda) {
        final MCarrierSlipYmtCB cb = new MCarrierSlipYmtCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionCBLambda.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final MCarrierSlipYmtCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
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
     * <span style="color: #0000C0">mCarrierSlipYmtBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_MCenter()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mCarrierSlipYmt</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mCarrierSlipYmt</span>.<span style="color: #CC4747">getMCenter()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
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
     * <span style="color: #0000C0">mCarrierSlipYmtBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByCharacterCd()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mCarrierSlipYmt</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mCarrierSlipYmt</span>.<span style="color: #CC4747">getBClassDtlByCharacterCd()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
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

    protected BClassDtlNss _nssBClassDtlByCoolCls;
    public BClassDtlNss xdfgetNssBClassDtlByCoolCls() {
        if (_nssBClassDtlByCoolCls == null) { _nssBClassDtlByCoolCls = new BClassDtlNss(null); }
        return _nssBClassDtlByCoolCls;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my COOL_CLS, named 'BClassDtlByCoolCls'.
     * <pre>
     * <span style="color: #0000C0">mCarrierSlipYmtBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByCoolCls()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mCarrierSlipYmt</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mCarrierSlipYmt</span>.<span style="color: #CC4747">getBClassDtlByCoolCls()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByCoolCls() {
        assertSetupSelectPurpose("bClassDtlByCoolCls");
        if (hasSpecifiedLocalColumn()) {
            specify().columnCoolCls();
        }
        doSetupSelect(() -> query().queryBClassDtlByCoolCls());
        if (_nssBClassDtlByCoolCls == null || !_nssBClassDtlByCoolCls.hasConditionQuery())
        { _nssBClassDtlByCoolCls = new BClassDtlNss(query().queryBClassDtlByCoolCls()); }
        return _nssBClassDtlByCoolCls;
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
     * <span style="color: #0000C0">mCarrierSlipYmtBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByDelFlg()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mCarrierSlipYmt</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mCarrierSlipYmt</span>.<span style="color: #CC4747">getBClassDtlByDelFlg()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
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

    protected BClassDtlNss _nssBClassDtlByPackingShowFlg;
    public BClassDtlNss xdfgetNssBClassDtlByPackingShowFlg() {
        if (_nssBClassDtlByPackingShowFlg == null) { _nssBClassDtlByPackingShowFlg = new BClassDtlNss(null); }
        return _nssBClassDtlByPackingShowFlg;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my PACKING_SHOW_FLG, named 'BClassDtlByPackingShowFlg'.
     * <pre>
     * <span style="color: #0000C0">mCarrierSlipYmtBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByPackingShowFlg()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mCarrierSlipYmt</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mCarrierSlipYmt</span>.<span style="color: #CC4747">getBClassDtlByPackingShowFlg()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByPackingShowFlg() {
        assertSetupSelectPurpose("bClassDtlByPackingShowFlg");
        if (hasSpecifiedLocalColumn()) {
            specify().columnPackingShowFlg();
        }
        doSetupSelect(() -> query().queryBClassDtlByPackingShowFlg());
        if (_nssBClassDtlByPackingShowFlg == null || !_nssBClassDtlByPackingShowFlg.hasConditionQuery())
        { _nssBClassDtlByPackingShowFlg = new BClassDtlNss(query().queryBClassDtlByPackingShowFlg()); }
        return _nssBClassDtlByPackingShowFlg;
    }

    protected BClassDtlNss _nssBClassDtlBySlipType;
    public BClassDtlNss xdfgetNssBClassDtlBySlipType() {
        if (_nssBClassDtlBySlipType == null) { _nssBClassDtlBySlipType = new BClassDtlNss(null); }
        return _nssBClassDtlBySlipType;
    }
    /**
     * Set up relation columns to select clause. <br>
     * B_CLASS_DTL by my SLIP_TYPE, named 'BClassDtlBySlipType'.
     * <pre>
     * <span style="color: #0000C0">mCarrierSlipYmtBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlBySlipType()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mCarrierSlipYmt</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mCarrierSlipYmt</span>.<span style="color: #CC4747">getBClassDtlBySlipType()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlBySlipType() {
        assertSetupSelectPurpose("bClassDtlBySlipType");
        if (hasSpecifiedLocalColumn()) {
            specify().columnSlipType();
        }
        doSetupSelect(() -> query().queryBClassDtlBySlipType());
        if (_nssBClassDtlBySlipType == null || !_nssBClassDtlBySlipType.hasConditionQuery())
        { _nssBClassDtlBySlipType = new BClassDtlNss(query().queryBClassDtlBySlipType()); }
        return _nssBClassDtlBySlipType;
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

    public static class HpSpecification extends HpAbstractSpecification<MCarrierSlipYmtCQ> {
        protected MCenterCB.HpSpecification _mCenter;
        protected BClassDtlCB.HpSpecification _bClassDtlByCharacterCd;
        protected BClassDtlCB.HpSpecification _bClassDtlByCoolCls;
        protected BClassDtlCB.HpSpecification _bClassDtlByDelFlg;
        protected BClassDtlCB.HpSpecification _bClassDtlByPackingShowFlg;
        protected BClassDtlCB.HpSpecification _bClassDtlBySlipType;
        public HpSpecification(ConditionBean baseCB, HpSpQyCall<MCarrierSlipYmtCQ> qyCall
                             , HpCBPurpose purpose, DBMetaProvider dbmetaProvider
                             , HpSDRFunctionFactory sdrFuncFactory)
        { super(baseCB, qyCall, purpose, dbmetaProvider, sdrFuncFactory); }
        /**
         * CARRIER_SLIP_YMT_ID: {PK, ID, NotNull, bigint identity(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCarrierSlipYmtId() { return doColumn("CARRIER_SLIP_YMT_ID"); }
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
         * SLIP_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=SlipType}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSlipType() { return doColumn("SLIP_TYPE"); }
        /**
         * COOL_CLS: {varchar(30), FK to B_CLASS_DTL, classification=CoolCls}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCoolCls() { return doColumn("COOL_CLS"); }
        /**
         * HONORIFIC: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnHonorific() { return doColumn("HONORIFIC"); }
        /**
         * PACKING_SHOW_FLG: {char(1), FK to B_CLASS_DTL, classification=PackingShowFlg}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnPackingShowFlg() { return doColumn("PACKING_SHOW_FLG"); }
        /**
         * SLIP_CLIENT_TEL_NO: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSlipClientTelNo() { return doColumn("SLIP_CLIENT_TEL_NO"); }
        /**
         * SLIP_CLIENT_ZIP_CD: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSlipClientZipCd() { return doColumn("SLIP_CLIENT_ZIP_CD"); }
        /**
         * SLIP_CLIENT_ADDRESS1: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSlipClientAddress1() { return doColumn("SLIP_CLIENT_ADDRESS1"); }
        /**
         * SLIP_CLIENT_ADDRESS2: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSlipClientAddress2() { return doColumn("SLIP_CLIENT_ADDRESS2"); }
        /**
         * SLIP_CLIENT_ADDRESS3: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSlipClientAddress3() { return doColumn("SLIP_CLIENT_ADDRESS3"); }
        /**
         * SLIP_CLIENT_ADDRESS4: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSlipClientAddress4() { return doColumn("SLIP_CLIENT_ADDRESS4"); }
        /**
         * SLIP_CLIENT_NM: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSlipClientNm() { return doColumn("SLIP_CLIENT_NM"); }
        /**
         * SLIP_ITEM_CD1: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSlipItemCd1() { return doColumn("SLIP_ITEM_CD1"); }
        /**
         * SLIP_ITEM_NM1: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSlipItemNm1() { return doColumn("SLIP_ITEM_NM1"); }
        /**
         * SLIP_ITEM_CD2: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSlipItemCd2() { return doColumn("SLIP_ITEM_CD2"); }
        /**
         * SLIP_ITEM_NM2: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSlipItemNm2() { return doColumn("SLIP_ITEM_NM2"); }
        /**
         * FREIGHT_HANDLING1: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnFreightHandling1() { return doColumn("FREIGHT_HANDLING1"); }
        /**
         * FREIGHT_HANDLING2: {varchar(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnFreightHandling2() { return doColumn("FREIGHT_HANDLING2"); }
        /**
         * ARTICLE: {varchar(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnArticle() { return doColumn("ARTICLE"); }
        /**
         * BILLING_CUSTOMER_CD: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnBillingCustomerCd() { return doColumn("BILLING_CUSTOMER_CD"); }
        /**
         * FARE_NO: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnFareNo() { return doColumn("FARE_NO"); }
        /**
         * SEND_CD: {varchar(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSendCd() { return doColumn("SEND_CD"); }
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
            columnCarrierSlipYmtId(); // PK
            if (qyCall().qy().hasConditionQueryMCenter()
                    || qyCall().qy().xgetReferrerQuery() instanceof MCenterCQ) {
                columnCenterId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByCharacterCd()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnCharacterCd(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByCoolCls()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnCoolCls(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByDelFlg()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnDelFlg(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByPackingShowFlg()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnPackingShowFlg(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlBySlipType()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnSlipType(); // FK or one-to-one referrer
            }
        }
        @Override
        protected String getTableDbName() { return "M_CARRIER_SLIP_YMT"; }
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
         * B_CLASS_DTL by my COOL_CLS, named 'BClassDtlByCoolCls'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByCoolCls() {
            assertRelation("bClassDtlByCoolCls");
            if (_bClassDtlByCoolCls == null) {
                _bClassDtlByCoolCls = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByCoolCls()
                                    , () -> _qyCall.qy().queryBClassDtlByCoolCls())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByCoolCls.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByCoolCls()
                      , () -> xsyncQyCall().qy().queryBClassDtlByCoolCls()));
                }
            }
            return _bClassDtlByCoolCls;
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
         * B_CLASS_DTL by my PACKING_SHOW_FLG, named 'BClassDtlByPackingShowFlg'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByPackingShowFlg() {
            assertRelation("bClassDtlByPackingShowFlg");
            if (_bClassDtlByPackingShowFlg == null) {
                _bClassDtlByPackingShowFlg = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByPackingShowFlg()
                                    , () -> _qyCall.qy().queryBClassDtlByPackingShowFlg())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByPackingShowFlg.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByPackingShowFlg()
                      , () -> xsyncQyCall().qy().queryBClassDtlByPackingShowFlg()));
                }
            }
            return _bClassDtlByPackingShowFlg;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * B_CLASS_DTL by my SLIP_TYPE, named 'BClassDtlBySlipType'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlBySlipType() {
            assertRelation("bClassDtlBySlipType");
            if (_bClassDtlBySlipType == null) {
                _bClassDtlBySlipType = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlBySlipType()
                                    , () -> _qyCall.qy().queryBClassDtlBySlipType())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlBySlipType.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlBySlipType()
                      , () -> xsyncQyCall().qy().queryBClassDtlBySlipType()));
                }
            }
            return _bClassDtlBySlipType;
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from M_DELIVERY_COURSE where ...) as FOO_MAX} <br>
         * M_DELIVERY_COURSE by CARRIER_SLIP_YMT_ID, named 'MDeliveryCourseList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(courseCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     courseCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     courseCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, MDeliveryCourse.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<MDeliveryCourseCB, MCarrierSlipYmtCQ> derivedMDeliveryCourseList() {
            assertDerived("mDeliveryCourseList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<MDeliveryCourseCB> sq, MCarrierSlipYmtCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveMDeliveryCourseList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)MyselfDerived (SubQuery).
         * @return The object to set up a function for myself table. (NotNull)
         */
        public HpSDRFunction<MCarrierSlipYmtCB, MCarrierSlipYmtCQ> myselfDerived() {
            assertDerived("myselfDerived"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<MCarrierSlipYmtCB> sq, MCarrierSlipYmtCQ cq, String al, DerivedReferrerOption op)
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
    public MCarrierSlipYmtCB dreamCruiseCB() {
        MCarrierSlipYmtCB cb = new MCarrierSlipYmtCB();
        cb.xsetupForDreamCruise((MCarrierSlipYmtCB) this);
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
    public HpColQyOperand<MCarrierSlipYmtCB> columnQuery(final SpecifyQuery<MCarrierSlipYmtCB> colCBLambda) {
        return xcreateColQyOperand((rightSp, operand) -> {
            return xcolqy(xcreateColumnQueryCB(), xcreateColumnQueryCB(), colCBLambda, rightSp, operand);
        });
    }

    protected MCarrierSlipYmtCB xcreateColumnQueryCB() {
        MCarrierSlipYmtCB cb = new MCarrierSlipYmtCB();
        cb.xsetupForColumnQuery((MCarrierSlipYmtCB)this);
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
    public void orScopeQuery(OrQuery<MCarrierSlipYmtCB> orCBLambda) {
        xorSQ((MCarrierSlipYmtCB)this, orCBLambda);
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
    public void orScopeQueryAndPart(AndQuery<MCarrierSlipYmtCB> andCBLambda) {
        xorSQAP((MCarrierSlipYmtCB)this, andCBLambda);
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
        final MCarrierSlipYmtCB cb;
        if (mainCB != null) {
            cb = (MCarrierSlipYmtCB)mainCB;
        } else {
            cb = new MCarrierSlipYmtCB();
        }
        specify().xsetSyncQyCall(xcreateSpQyCall(() -> true, () -> cb.query()));
    }

    // ===================================================================================
    //                                                                            Internal
    //                                                                            ========
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xgetConditionBeanClassNameInternally() { return MCarrierSlipYmtCB.class.getName(); }
    protected String xgetConditionQueryClassNameInternally() { return MCarrierSlipYmtCQ.class.getName(); }
    protected String xgetSubQueryClassNameInternally() { return SubQuery.class.getName(); }
    protected String xgetConditionOptionClassNameInternally() { return ConditionOption.class.getName(); }
}
