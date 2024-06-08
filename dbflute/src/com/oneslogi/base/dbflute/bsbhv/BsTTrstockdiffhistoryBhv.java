package com.oneslogi.base.dbflute.bsbhv;

import java.util.List;

import org.dbflute.*;
import org.dbflute.bhv.*;
import org.dbflute.bhv.readable.*;
import org.dbflute.bhv.writable.*;
import org.dbflute.bhv.referrer.*;
import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.HpSLSFunction;
import org.dbflute.cbean.result.*;
import org.dbflute.cbean.scoping.SpecifyQuery;
import org.dbflute.exception.*;
import org.dbflute.optional.OptionalEntity;
import org.dbflute.outsidesql.executor.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.bsbhv.loader.*;
import com.oneslogi.base.dbflute.exentity.*;
import com.oneslogi.base.dbflute.bsentity.dbmeta.*;
import com.oneslogi.base.dbflute.cbean.*;

/**
 * The behavior of T_TRSTOCKDIFFHISTORY as TABLE. <br>
 * <pre>
 * [primary key]
 *     TRSTOCKDIFFHISTORY_ID
 *
 * [column]
 *     TRSTOCKDIFFHISTORY_ID, CENTER_CD, DIFFADD_DATE, DIFFOCC_AREA, LOCATION_CD, INOUT_KBN, PRODUCT_CD, GOOD_ITEM_KBN, DAMAGE_REFUND_KBN, DIFF_QTY, CENTER_ID, CLIENT_ID, PRINTEDFLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TRSTOCKDIFFHISTORY_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     M_CLIENT, M_CENTER
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     mClient, mCenter
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsTTrstockdiffhistoryBhv extends AbstractBehaviorWritable<TTrstockdiffhistory, TTrstockdiffhistoryCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /** 在庫過不足履歴を検索し、印刷対象件数を取得する。 */
    public static final String PATH_selectSqlGetPrintNum = "selectSqlGetPrintNum";
    /** コントロールNo.で在庫過不足履歴を検索し、適品過不足報告書項目を取得する。 */
    public static final String PATH_selectSqlGoodItemDiffReportList = "selectSqlGoodItemDiffReportList";
    /** (ii) 変数.対象データ無フラグ == '1'(印刷対象なし) の場合 */
    public static final String PATH_selectSqlGoodItemDiffReportListCenter = "selectSqlGoodItemDiffReportListCenter";
    /** 在庫過不足履歴を検索し、印刷対象件数を取得する。 */
    public static final String PATH_selectSqlGoodItemDiffReportListCount = "selectSqlGoodItemDiffReportListCount";
    /** コントロールNo.で在庫過不足履歴を検索し、不適品過不足報告書項目を取得する */
    public static final String PATH_selectSqlNoGoodItemDiffReportList = "selectSqlNoGoodItemDiffReportList";
    /** 在庫過不足履歴を検索し、印刷対象件数を取得する。 */
    public static final String PATH_selectSqlNoGoodItemDiffReportListCount = "selectSqlNoGoodItemDiffReportListCount";
    /** 変数.対象データ無フラグ == '0'(印刷対象あり) の場合 */
    public static final String PATH_selectSqlNotGoodItemDiffReportList = "selectSqlNotGoodItemDiffReportList";
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public TTrstockdiffhistoryDbm asDBMeta() { return TTrstockdiffhistoryDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "T_TRSTOCKDIFFHISTORY"; }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public TTrstockdiffhistoryDbm getMyDBMeta() { return TTrstockdiffhistoryDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public TTrstockdiffhistoryCB newConditionBean() { return new TTrstockdiffhistoryCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public TTrstockdiffhistory newMyEntity() { return new TTrstockdiffhistory(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public TTrstockdiffhistoryCB newMyConditionBean() { return new TTrstockdiffhistoryCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * TTrstockdiffhistoryCB cb = <span style="color: #70226C">new</span> TTrstockdiffhistoryCB();
     * cb.query().setFoo...(value);
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">tTrstockdiffhistoryBhv</span>.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of TTrstockdiffhistory. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(TTrstockdiffhistoryCB cb) {
        return facadeSelectCount(cb);
    }

    // ===================================================================================
    //                                                                       Entity Select
    //                                                                       =============
    /**
     * Select the entity by the condition-bean. #beforejava8 <br>
     * <span style="color: #AD4747; font-size: 120%">The return might be null if no data, so you should have null check.</span> <br>
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, use selectEntityWithDeletedCheck().</span>
     * <pre>
     * TTrstockdiffhistoryCB cb = <span style="color: #70226C">new</span> TTrstockdiffhistoryCB();
     * cb.query().setFoo...(value);
     * TTrstockdiffhistory tTrstockdiffhistory = <span style="color: #0000C0">tTrstockdiffhistoryBhv</span>.<span style="color: #DD4747">selectEntity</span>(cb);
     * <span style="color: #70226C">if</span> (tTrstockdiffhistory != <span style="color: #70226C">null</span>) { <span style="color: #3F7E5E">// null check</span>
     *     ... = tTrstockdiffhistory.get...();
     * } <span style="color: #70226C">else</span> {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of TTrstockdiffhistory. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TTrstockdiffhistory selectEntity(TTrstockdiffhistoryCB cb) {
        return facadeSelectEntity(cb);
    }

    protected TTrstockdiffhistory facadeSelectEntity(TTrstockdiffhistoryCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends TTrstockdiffhistory> OptionalEntity<ENTITY> doSelectOptionalEntity(TTrstockdiffhistoryCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * TTrstockdiffhistoryCB cb = <span style="color: #70226C">new</span> TTrstockdiffhistoryCB();
     * cb.query().set...;
     * TTrstockdiffhistory tTrstockdiffhistory = <span style="color: #0000C0">tTrstockdiffhistoryBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = tTrstockdiffhistory.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of TTrstockdiffhistory. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TTrstockdiffhistory selectEntityWithDeletedCheck(TTrstockdiffhistoryCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param trstockdiffhistoryId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TTrstockdiffhistory selectByPKValue(Long trstockdiffhistoryId) {
        return facadeSelectByPKValue(trstockdiffhistoryId);
    }

    protected TTrstockdiffhistory facadeSelectByPKValue(Long trstockdiffhistoryId) {
        return doSelectByPK(trstockdiffhistoryId, typeOfSelectedEntity());
    }

    protected <ENTITY extends TTrstockdiffhistory> ENTITY doSelectByPK(Long trstockdiffhistoryId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(trstockdiffhistoryId), tp);
    }

    protected <ENTITY extends TTrstockdiffhistory> OptionalEntity<ENTITY> doSelectOptionalByPK(Long trstockdiffhistoryId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(trstockdiffhistoryId, tp), trstockdiffhistoryId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param trstockdiffhistoryId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TTrstockdiffhistory selectByPKValueWithDeletedCheck(Long trstockdiffhistoryId) {
        return doSelectByPKWithDeletedCheck(trstockdiffhistoryId, typeOfSelectedEntity());
    }

    protected <ENTITY extends TTrstockdiffhistory> ENTITY doSelectByPKWithDeletedCheck(Long trstockdiffhistoryId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(trstockdiffhistoryId), tp);
    }

    protected TTrstockdiffhistoryCB xprepareCBAsPK(Long trstockdiffhistoryId) {
        assertObjectNotNull("trstockdiffhistoryId", trstockdiffhistoryId);
        return newConditionBean().acceptPK(trstockdiffhistoryId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * TTrstockdiffhistoryCB cb = <span style="color: #70226C">new</span> TTrstockdiffhistoryCB();
     * cb.query().set...;
     * cb.query().addOrderBy...;
     * ListResultBean&lt;TTrstockdiffhistory&gt; <span style="color: #553000">tTrstockdiffhistoryList</span> = <span style="color: #0000C0">tTrstockdiffhistoryBhv</span>.<span style="color: #CC4747">selectList</span>(cb);
     * <span style="color: #70226C">for</span> (TTrstockdiffhistory tTrstockdiffhistory : <span style="color: #553000">tTrstockdiffhistoryList</span>) {
     *     ... = tTrstockdiffhistory.get...;
     * }
     * </pre>
     * @param cb The condition-bean of TTrstockdiffhistory. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<TTrstockdiffhistory> selectList(TTrstockdiffhistoryCB cb) {
        return facadeSelectList(cb);
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * TTrstockdiffhistoryCB cb = <span style="color: #70226C">new</span> TTrstockdiffhistoryCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;TTrstockdiffhistory&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">tTrstockdiffhistoryBhv</span>.<span style="color: #CC4747">selectPage</span>(cb);
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (TTrstockdiffhistory tTrstockdiffhistory : <span style="color: #553000">page</span>) {
     *     ... = tTrstockdiffhistory.get...();
     * }
     * </pre>
     * @param cb The condition-bean of TTrstockdiffhistory. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<TTrstockdiffhistory> selectPage(TTrstockdiffhistoryCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * TTrstockdiffhistoryCB cb = <span style="color: #70226C">new</span> TTrstockdiffhistoryCB();
     * cb.query().set...
     * <span style="color: #0000C0">tTrstockdiffhistoryBhv</span>.<span style="color: #CC4747">selectCursor</span>(cb, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cb The condition-bean of TTrstockdiffhistory. (NotNull)
     * @param entityRowHandler The handler of entity row of TTrstockdiffhistory. (NotNull)
     */
    public void selectCursor(TTrstockdiffhistoryCB cb, EntityRowHandler<TTrstockdiffhistory> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">tTrstockdiffhistoryBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<TTrstockdiffhistoryCB, RESULT> selectScalar(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">tTrstockdiffhistoryBhv</span>.<span style="color: #CC4747">scalarSelect</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<TTrstockdiffhistoryCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    // ===================================================================================
    //                                                                            Sequence
    //                                                                            ========
    @Override
    protected Number doReadNextVal() {
        String msg = "This table is NOT related to sequence: " + asTableDbName();
        throw new UnsupportedOperationException(msg);
    }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    /**
     * Load referrer for the list by the referrer loader.
     * <pre>
     * List&lt;Member&gt; <span style="color: #553000">memberList</span> = <span style="color: #0000C0">memberBhv</span>.selectList(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * memberBhv.<span style="color: #CC4747">load</span>(<span style="color: #553000">memberList</span>, <span style="color: #553000">memberLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">memberLoader</span>.<span style="color: #CC4747">loadPurchase</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">purchaseCB</span>.setupSelect...
     *         <span style="color: #553000">purchaseCB</span>.query().set...
     *         <span style="color: #553000">purchaseCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can also load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(purchaseLoader -&gt; {</span>
     *     <span style="color: #3F7E5E">//    purchaseLoader.loadPurchasePayment(...);</span>
     *     <span style="color: #3F7E5E">//});</span>
     *
     *     <span style="color: #3F7E5E">// you can also pull out foreign table and load its referrer</span>
     *     <span style="color: #3F7E5E">// (setupSelect of the foreign table should be called)</span>
     *     <span style="color: #3F7E5E">//memberLoader.pulloutMemberStatus().loadMemberLogin(...)</span>
     * });
     * <span style="color: #70226C">for</span> (Member member : <span style="color: #553000">memberList</span>) {
     *     List&lt;Purchase&gt; purchaseList = member.<span style="color: #CC4747">getPurchaseList()</span>;
     *     <span style="color: #70226C">for</span> (Purchase purchase : purchaseList) {
     *         ...
     *     }
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has order by FK before callback.
     * @param tTrstockdiffhistoryList The entity list of TTrstockdiffhistory. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<TTrstockdiffhistory> tTrstockdiffhistoryList, ReferrerLoaderHandler<LoaderOfTTrstockdiffhistory> loaderLambda) {
        xassLRArg(tTrstockdiffhistoryList, loaderLambda);
        loaderLambda.handle(new LoaderOfTTrstockdiffhistory().ready(tTrstockdiffhistoryList, _behaviorSelector));
    }

    /**
     * Load referrer for the entity by the referrer loader.
     * <pre>
     * Member <span style="color: #553000">member</span> = <span style="color: #0000C0">memberBhv</span>.selectEntityWithDeletedCheck(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> <span style="color: #553000">cb</span>.acceptPK(1));
     * <span style="color: #0000C0">memberBhv</span>.<span style="color: #CC4747">load</span>(<span style="color: #553000">member</span>, <span style="color: #553000">memberLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">memberLoader</span>.<span style="color: #CC4747">loadPurchase</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">purchaseCB</span>.setupSelect...
     *         <span style="color: #553000">purchaseCB</span>.query().set...
     *         <span style="color: #553000">purchaseCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can also load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(purchaseLoader -&gt; {</span>
     *     <span style="color: #3F7E5E">//    purchaseLoader.loadPurchasePayment(...);</span>
     *     <span style="color: #3F7E5E">//});</span>
     *
     *     <span style="color: #3F7E5E">// you can also pull out foreign table and load its referrer</span>
     *     <span style="color: #3F7E5E">// (setupSelect of the foreign table should be called)</span>
     *     <span style="color: #3F7E5E">//memberLoader.pulloutMemberStatus().loadMemberLogin(...)</span>
     * });
     * List&lt;Purchase&gt; purchaseList = <span style="color: #553000">member</span>.<span style="color: #CC4747">getPurchaseList()</span>;
     * <span style="color: #70226C">for</span> (Purchase purchase : purchaseList) {
     *     ...
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has order by FK before callback.
     * @param tTrstockdiffhistory The entity of TTrstockdiffhistory. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(TTrstockdiffhistory tTrstockdiffhistory, ReferrerLoaderHandler<LoaderOfTTrstockdiffhistory> loaderLambda) {
        xassLRArg(tTrstockdiffhistory, loaderLambda);
        loaderLambda.handle(new LoaderOfTTrstockdiffhistory().ready(xnewLRAryLs(tTrstockdiffhistory), _behaviorSelector));
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'MClient'.
     * @param tTrstockdiffhistoryList The list of tTrstockdiffhistory. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MClient> pulloutMClient(List<TTrstockdiffhistory> tTrstockdiffhistoryList)
    { return helpPulloutInternally(tTrstockdiffhistoryList, "mClient"); }

    /**
     * Pull out the list of foreign table 'MCenter'.
     * @param tTrstockdiffhistoryList The list of tTrstockdiffhistory. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MCenter> pulloutMCenter(List<TTrstockdiffhistory> tTrstockdiffhistoryList)
    { return helpPulloutInternally(tTrstockdiffhistoryList, "mCenter"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key trstockdiffhistoryId.
     * @param tTrstockdiffhistoryList The list of tTrstockdiffhistory. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractTrstockdiffhistoryIdList(List<TTrstockdiffhistory> tTrstockdiffhistoryList)
    { return helpExtractListInternally(tTrstockdiffhistoryList, "trstockdiffhistoryId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * TTrstockdiffhistory tTrstockdiffhistory = <span style="color: #70226C">new</span> TTrstockdiffhistory();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * tTrstockdiffhistory.setFoo...(value);
     * tTrstockdiffhistory.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tTrstockdiffhistory.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tTrstockdiffhistory.set...;</span>
     * <span style="color: #0000C0">tTrstockdiffhistoryBhv</span>.<span style="color: #CC4747">insert</span>(tTrstockdiffhistory);
     * ... = tTrstockdiffhistory.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param tTrstockdiffhistory The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(TTrstockdiffhistory tTrstockdiffhistory) {
        doInsert(tTrstockdiffhistory, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * TTrstockdiffhistory tTrstockdiffhistory = <span style="color: #70226C">new</span> TTrstockdiffhistory();
     * tTrstockdiffhistory.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tTrstockdiffhistory.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tTrstockdiffhistory.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tTrstockdiffhistory.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * tTrstockdiffhistory.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">tTrstockdiffhistoryBhv</span>.<span style="color: #CC4747">update</span>(tTrstockdiffhistory);
     * </pre>
     * @param tTrstockdiffhistory The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(TTrstockdiffhistory tTrstockdiffhistory) {
        doUpdate(tTrstockdiffhistory, null);
    }

    /**
     * Update the entity non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * TTrstockdiffhistory tTrstockdiffhistory = <span style="color: #70226C">new</span> TTrstockdiffhistory();
     * tTrstockdiffhistory.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tTrstockdiffhistory.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tTrstockdiffhistory.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tTrstockdiffhistory.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tTrstockdiffhistory.setVersionNo(value);</span>
     * <span style="color: #0000C0">tTrstockdiffhistoryBhv</span>.<span style="color: #CC4747">updateNonstrict</span>(tTrstockdiffhistory);
     * </pre>
     * @param tTrstockdiffhistory The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(TTrstockdiffhistory tTrstockdiffhistory) {
        doUpdateNonstrict(tTrstockdiffhistory, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param tTrstockdiffhistory The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(TTrstockdiffhistory tTrstockdiffhistory) {
        doInsertOrUpdate(tTrstockdiffhistory, null, null);
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param tTrstockdiffhistory The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(TTrstockdiffhistory tTrstockdiffhistory) {
        doInsertOrUpdateNonstrict(tTrstockdiffhistory, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * TTrstockdiffhistory tTrstockdiffhistory = <span style="color: #70226C">new</span> TTrstockdiffhistory();
     * tTrstockdiffhistory.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * tTrstockdiffhistory.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">tTrstockdiffhistoryBhv</span>.<span style="color: #CC4747">delete</span>(tTrstockdiffhistory);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param tTrstockdiffhistory The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(TTrstockdiffhistory tTrstockdiffhistory) {
        doDelete(tTrstockdiffhistory, null);
    }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl} <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * TTrstockdiffhistory tTrstockdiffhistory = <span style="color: #70226C">new</span> TTrstockdiffhistory();
     * tTrstockdiffhistory.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tTrstockdiffhistory.setVersionNo(value);</span>
     * <span style="color: #0000C0">tTrstockdiffhistoryBhv</span>.<span style="color: #CC4747">deleteNonstrict</span>(tTrstockdiffhistory);
     * </pre>
     * @param tTrstockdiffhistory The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(TTrstockdiffhistory tTrstockdiffhistory) {
        doDeleteNonstrict(tTrstockdiffhistory, null);
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * TTrstockdiffhistory tTrstockdiffhistory = <span style="color: #70226C">new</span> TTrstockdiffhistory();
     * tTrstockdiffhistory.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tTrstockdiffhistory.setVersionNo(value);</span>
     * <span style="color: #0000C0">tTrstockdiffhistoryBhv</span>.<span style="color: #CC4747">deleteNonstrictIgnoreDeleted</span>(tTrstockdiffhistory);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param tTrstockdiffhistory The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(TTrstockdiffhistory tTrstockdiffhistory) {
        doDeleteNonstrictIgnoreDeleted(tTrstockdiffhistory, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(TTrstockdiffhistory et, final DeleteOption<TTrstockdiffhistoryCB> op) {
        assertObjectNotNull("tTrstockdiffhistory", et); prepareDeleteOption(op); helpDeleteNonstrictIgnoreDeletedInternally(et, op);
    }

    // ===================================================================================
    //                                                                        Batch Update
    //                                                                        ============
    /**
     * Batch-insert the entity list modified-only of same-set columns. (DefaultConstraintsEnabled) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <p><span style="color: #CC4747; font-size: 120%">The columns of least common multiple are registered like this:</span></p>
     * <pre>
     * <span style="color: #70226C">for</span> (... : ...) {
     *     TTrstockdiffhistory tTrstockdiffhistory = <span style="color: #70226C">new</span> TTrstockdiffhistory();
     *     tTrstockdiffhistory.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         tTrstockdiffhistory.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     tTrstockdiffhistoryList.add(tTrstockdiffhistory);
     * }
     * <span style="color: #0000C0">tTrstockdiffhistoryBhv</span>.<span style="color: #CC4747">batchInsert</span>(tTrstockdiffhistoryList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param tTrstockdiffhistoryList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<TTrstockdiffhistory> tTrstockdiffhistoryList) {
        return doBatchInsert(tTrstockdiffhistoryList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     TTrstockdiffhistory tTrstockdiffhistory = <span style="color: #70226C">new</span> TTrstockdiffhistory();
     *     tTrstockdiffhistory.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         tTrstockdiffhistory.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         tTrstockdiffhistory.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//tTrstockdiffhistory.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     tTrstockdiffhistoryList.add(tTrstockdiffhistory);
     * }
     * <span style="color: #0000C0">tTrstockdiffhistoryBhv</span>.<span style="color: #CC4747">batchUpdate</span>(tTrstockdiffhistoryList);
     * </pre>
     * @param tTrstockdiffhistoryList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<TTrstockdiffhistory> tTrstockdiffhistoryList) {
        return doBatchUpdate(tTrstockdiffhistoryList, null);
    }

    /**
     * Batch-update the entity list specified-only. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * tTrstockdiffhistoryBhv.<span style="color: #CC4747">batchUpdate</span>(tTrstockdiffhistoryList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">tTrstockdiffhistoryBhv</span>.<span style="color: #CC4747">batchUpdate</span>(tTrstockdiffhistoryList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param tTrstockdiffhistoryList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<TTrstockdiffhistory> tTrstockdiffhistoryList, SpecifyQuery<TTrstockdiffhistoryCB> colCBLambda) {
        return doBatchUpdate(tTrstockdiffhistoryList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * <span style="color: #70226C">for</span> (... : ...) {
     *     TTrstockdiffhistory tTrstockdiffhistory = <span style="color: #70226C">new</span> TTrstockdiffhistory();
     *     tTrstockdiffhistory.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         tTrstockdiffhistory.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         tTrstockdiffhistory.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//tTrstockdiffhistory.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     tTrstockdiffhistoryList.add(tTrstockdiffhistory);
     * }
     * <span style="color: #0000C0">tTrstockdiffhistoryBhv</span>.<span style="color: #CC4747">batchUpdate</span>(tTrstockdiffhistoryList);
     * </pre>
     * @param tTrstockdiffhistoryList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<TTrstockdiffhistory> tTrstockdiffhistoryList) {
        return doBatchUpdateNonstrict(tTrstockdiffhistoryList, null);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * <span style="color: #0000C0">tTrstockdiffhistoryBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(tTrstockdiffhistoryList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">tTrstockdiffhistoryBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(tTrstockdiffhistoryList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).</p>
     * @param tTrstockdiffhistoryList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<TTrstockdiffhistory> tTrstockdiffhistoryList, SpecifyQuery<TTrstockdiffhistoryCB> colCBLambda) {
        return doBatchUpdateNonstrict(tTrstockdiffhistoryList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param tTrstockdiffhistoryList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<TTrstockdiffhistory> tTrstockdiffhistoryList) {
        return doBatchDelete(tTrstockdiffhistoryList, null);
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param tTrstockdiffhistoryList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<TTrstockdiffhistory> tTrstockdiffhistoryList) {
        return doBatchDeleteNonstrict(tTrstockdiffhistoryList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">tTrstockdiffhistoryBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;TTrstockdiffhistory, TTrstockdiffhistoryCB&gt;() {
     *     public ConditionBean setup(TTrstockdiffhistory entity, TTrstockdiffhistoryCB intoCB) {
     *         FooCB cb = FooCB();
     *         cb.setupSelect_Bar();
     *
     *         <span style="color: #3F7E5E">// mapping</span>
     *         intoCB.specify().columnMyName().mappedFrom(cb.specify().columnFooName());
     *         intoCB.specify().columnMyCount().mappedFrom(cb.specify().columnFooCount());
     *         intoCB.specify().columnMyDate().mappedFrom(cb.specify().specifyBar().columnBarDate());
     *         entity.setMyFixedValue("foo"); <span style="color: #3F7E5E">// fixed value</span>
     *         <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     *         <span style="color: #3F7E5E">//entity.setRegisterUser(value);</span>
     *         <span style="color: #3F7E5E">//entity.set...;</span>
     *         <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     *         <span style="color: #3F7E5E">//entity.setVersionNo(value);</span>
     *
     *         return cb;
     *     }
     * });
     * </pre>
     * @param manyArgLambda The callback to set up query-insert. (NotNull)
     * @return The inserted count.
     */
    public int queryInsert(QueryInsertSetupper<TTrstockdiffhistory, TTrstockdiffhistoryCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * TTrstockdiffhistory tTrstockdiffhistory = <span style="color: #70226C">new</span> TTrstockdiffhistory();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//tTrstockdiffhistory.setPK...(value);</span>
     * tTrstockdiffhistory.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tTrstockdiffhistory.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tTrstockdiffhistory.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tTrstockdiffhistory.setVersionNo(value);</span>
     * TTrstockdiffhistoryCB cb = <span style="color: #70226C">new</span> TTrstockdiffhistoryCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">tTrstockdiffhistoryBhv</span>.<span style="color: #CC4747">queryUpdate</span>(tTrstockdiffhistory, cb);
     * </pre>
     * @param tTrstockdiffhistory The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of TTrstockdiffhistory. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(TTrstockdiffhistory tTrstockdiffhistory, TTrstockdiffhistoryCB cb) {
        return doQueryUpdate(tTrstockdiffhistory, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * TTrstockdiffhistoryCB cb = new TTrstockdiffhistoryCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">tTrstockdiffhistoryBhv</span>.<span style="color: #CC4747">queryDelete</span>(tTrstockdiffhistory, cb);
     * </pre>
     * @param cb The condition-bean of TTrstockdiffhistory. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(TTrstockdiffhistoryCB cb) {
        return doQueryDelete(cb, null);
    }

    // ===================================================================================
    //                                                                      Varying Update
    //                                                                      ==============
    // -----------------------------------------------------
    //                                         Entity Update
    //                                         -------------
    /**
     * Insert the entity with varying requests. <br>
     * For example, disableCommonColumnAutoSetup(), disablePrimaryKeyIdentity(). <br>
     * Other specifications are same as insert(entity).
     * <pre>
     * TTrstockdiffhistory tTrstockdiffhistory = <span style="color: #70226C">new</span> TTrstockdiffhistory();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * tTrstockdiffhistory.setFoo...(value);
     * tTrstockdiffhistory.setBar...(value);
     * <span style="color: #0000C0">tTrstockdiffhistoryBhv</span>.<span style="color: #CC4747">varyingInsert</span>(tTrstockdiffhistory, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = tTrstockdiffhistory.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param tTrstockdiffhistory The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(TTrstockdiffhistory tTrstockdiffhistory, WritableOptionCall<TTrstockdiffhistoryCB, InsertOption<TTrstockdiffhistoryCB>> opLambda) {
        doInsert(tTrstockdiffhistory, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * TTrstockdiffhistory tTrstockdiffhistory = <span style="color: #70226C">new</span> TTrstockdiffhistory();
     * tTrstockdiffhistory.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tTrstockdiffhistory.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * tTrstockdiffhistory.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">tTrstockdiffhistoryBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(tTrstockdiffhistory, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param tTrstockdiffhistory The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(TTrstockdiffhistory tTrstockdiffhistory, WritableOptionCall<TTrstockdiffhistoryCB, UpdateOption<TTrstockdiffhistoryCB>> opLambda) {
        doUpdate(tTrstockdiffhistory, createUpdateOption(opLambda));
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * TTrstockdiffhistory tTrstockdiffhistory = <span style="color: #70226C">new</span> TTrstockdiffhistory();
     * tTrstockdiffhistory.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tTrstockdiffhistory.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tTrstockdiffhistory.setVersionNo(value);</span>
     * <span style="color: #0000C0">tTrstockdiffhistoryBhv</span>.<span style="color: #CC4747">varyingUpdateNonstrict</span>(tTrstockdiffhistory, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param tTrstockdiffhistory The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(TTrstockdiffhistory tTrstockdiffhistory, WritableOptionCall<TTrstockdiffhistoryCB, UpdateOption<TTrstockdiffhistoryCB>> opLambda) {
        doUpdateNonstrict(tTrstockdiffhistory, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param tTrstockdiffhistory The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(TTrstockdiffhistory tTrstockdiffhistory, WritableOptionCall<TTrstockdiffhistoryCB, InsertOption<TTrstockdiffhistoryCB>> insertOpLambda, WritableOptionCall<TTrstockdiffhistoryCB, UpdateOption<TTrstockdiffhistoryCB>> updateOpLambda) {
        doInsertOrUpdate(tTrstockdiffhistory, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param tTrstockdiffhistory The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(TTrstockdiffhistory tTrstockdiffhistory, WritableOptionCall<TTrstockdiffhistoryCB, InsertOption<TTrstockdiffhistoryCB>> insertOpLambda, WritableOptionCall<TTrstockdiffhistoryCB, UpdateOption<TTrstockdiffhistoryCB>> updateOpLambda) {
        doInsertOrUpdateNonstrict(tTrstockdiffhistory, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param tTrstockdiffhistory The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(TTrstockdiffhistory tTrstockdiffhistory, WritableOptionCall<TTrstockdiffhistoryCB, DeleteOption<TTrstockdiffhistoryCB>> opLambda) {
        doDelete(tTrstockdiffhistory, createDeleteOption(opLambda));
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as deleteNonstrict(entity).
     * @param tTrstockdiffhistory The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(TTrstockdiffhistory tTrstockdiffhistory, WritableOptionCall<TTrstockdiffhistoryCB, DeleteOption<TTrstockdiffhistoryCB>> opLambda) {
        doDeleteNonstrict(tTrstockdiffhistory, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param tTrstockdiffhistoryList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<TTrstockdiffhistory> tTrstockdiffhistoryList, WritableOptionCall<TTrstockdiffhistoryCB, InsertOption<TTrstockdiffhistoryCB>> opLambda) {
        return doBatchInsert(tTrstockdiffhistoryList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param tTrstockdiffhistoryList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<TTrstockdiffhistory> tTrstockdiffhistoryList, WritableOptionCall<TTrstockdiffhistoryCB, UpdateOption<TTrstockdiffhistoryCB>> opLambda) {
        return doBatchUpdate(tTrstockdiffhistoryList, createUpdateOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param tTrstockdiffhistoryList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<TTrstockdiffhistory> tTrstockdiffhistoryList, WritableOptionCall<TTrstockdiffhistoryCB, UpdateOption<TTrstockdiffhistoryCB>> opLambda) {
        return doBatchUpdateNonstrict(tTrstockdiffhistoryList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param tTrstockdiffhistoryList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<TTrstockdiffhistory> tTrstockdiffhistoryList, WritableOptionCall<TTrstockdiffhistoryCB, DeleteOption<TTrstockdiffhistoryCB>> opLambda) {
        return doBatchDelete(tTrstockdiffhistoryList, createDeleteOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param tTrstockdiffhistoryList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<TTrstockdiffhistory> tTrstockdiffhistoryList, WritableOptionCall<TTrstockdiffhistoryCB, DeleteOption<TTrstockdiffhistoryCB>> opLambda) {
        return doBatchDeleteNonstrict(tTrstockdiffhistoryList, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Query Update
    //                                          ------------
    /**
     * Insert the several entities by query with varying requests (modified-only for fixed value). <br>
     * For example, disableCommonColumnAutoSetup(), disablePrimaryKeyIdentity(). <br>
     * Other specifications are same as queryInsert(entity, setupper).
     * @param manyArgLambda The set-upper of query-insert. (NotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The inserted count.
     */
    public int varyingQueryInsert(QueryInsertSetupper<TTrstockdiffhistory, TTrstockdiffhistoryCB> manyArgLambda, WritableOptionCall<TTrstockdiffhistoryCB, InsertOption<TTrstockdiffhistoryCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * TTrstockdiffhistory tTrstockdiffhistory = <span style="color: #70226C">new</span> TTrstockdiffhistory();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//tTrstockdiffhistory.setPK...(value);</span>
     * tTrstockdiffhistory.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tTrstockdiffhistory.setVersionNo(value);</span>
     * TTrstockdiffhistoryCB cb = <span style="color: #70226C">new</span> TTrstockdiffhistoryCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">tTrstockdiffhistoryBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(tTrstockdiffhistory, cb, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param tTrstockdiffhistory The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of TTrstockdiffhistory. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(TTrstockdiffhistory tTrstockdiffhistory, TTrstockdiffhistoryCB cb, WritableOptionCall<TTrstockdiffhistoryCB, UpdateOption<TTrstockdiffhistoryCB>> opLambda) {
        return doQueryUpdate(tTrstockdiffhistory, cb, createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * @param cb The condition-bean of TTrstockdiffhistory. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(TTrstockdiffhistoryCB cb, WritableOptionCall<TTrstockdiffhistoryCB, DeleteOption<TTrstockdiffhistoryCB>> opLambda) {
        return doQueryDelete(cb, createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span>
     * tTrstockdiffhistoryBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span>
     * tTrstockdiffhistoryBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * tTrstockdiffhistoryBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * tTrstockdiffhistoryBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * tTrstockdiffhistoryBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * tTrstockdiffhistoryBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * tTrstockdiffhistoryBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span>
     * tTrstockdiffhistoryBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * tTrstockdiffhistoryBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * tTrstockdiffhistoryBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * tTrstockdiffhistoryBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * tTrstockdiffhistoryBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * tTrstockdiffhistoryBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span>
     * tTrstockdiffhistoryBhv.outideSql().removeBlockComment().selectList()
     * tTrstockdiffhistoryBhv.outideSql().removeLineComment().selectList()
     * tTrstockdiffhistoryBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlBasicExecutor<TTrstockdiffhistoryBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<TTrstockdiffhistoryBhv> facadeExecutor = doOutsideSql();
        return facadeExecutor.xbasicExecutor(); // variable to resolve generic type
    }

    // ===================================================================================
    //                                                                Optimistic Lock Info
    //                                                                ====================
    @Override
    protected boolean hasVersionNoValue(Entity et) { return downcast(et).getVersionNo() != null; }

    // ===================================================================================
    //                                                                         Type Helper
    //                                                                         ===========
    protected Class<? extends TTrstockdiffhistory> typeOfSelectedEntity() { return TTrstockdiffhistory.class; }
    protected Class<TTrstockdiffhistory> typeOfHandlingEntity() { return TTrstockdiffhistory.class; }
    protected Class<TTrstockdiffhistoryCB> typeOfHandlingConditionBean() { return TTrstockdiffhistoryCB.class; }
}
