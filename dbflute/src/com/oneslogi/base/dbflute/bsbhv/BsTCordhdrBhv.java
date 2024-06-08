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
 * The behavior of T_CORDHDR as TABLE. <br>
 * <pre>
 * [primary key]
 *     ORDER_H_ID
 *
 * [column]
 *     ORDER_H_ID, CENTER_ID, CLIENT_ID, ZZORGNCD, DPCD, ZZORDYMD, ORDGR, DLVYMD, DED, PSTNID, SCDDLVYMD, SCDDED, SCDPSTNID, IOID, CTQA, STA, WRKMFG, SROPRTCNT, CORDRCVCNT, COMPLETE_FLG, RCV_FLG, SKIP_KBN, SORT_DATE, COMMENT, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     ORDER_H_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     M_CENTER, M_CLIENT
 *
 * [referrer table]
 *     T_CORDDTAEC, T_CORDDTASR
 *
 * [foreign property]
 *     mCenter, mClient
 *
 * [referrer property]
 *     tCorddtaecList, tCorddtasrList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsTCordhdrBhv extends AbstractBehaviorWritable<TCordhdr, TCordhdrCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public TCordhdrDbm asDBMeta() { return TCordhdrDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "T_CORDHDR"; }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public TCordhdrDbm getMyDBMeta() { return TCordhdrDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public TCordhdrCB newConditionBean() { return new TCordhdrCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public TCordhdr newMyEntity() { return new TCordhdr(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public TCordhdrCB newMyConditionBean() { return new TCordhdrCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * TCordhdrCB cb = <span style="color: #70226C">new</span> TCordhdrCB();
     * cb.query().setFoo...(value);
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">tCordhdrBhv</span>.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of TCordhdr. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(TCordhdrCB cb) {
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
     * TCordhdrCB cb = <span style="color: #70226C">new</span> TCordhdrCB();
     * cb.query().setFoo...(value);
     * TCordhdr tCordhdr = <span style="color: #0000C0">tCordhdrBhv</span>.<span style="color: #DD4747">selectEntity</span>(cb);
     * <span style="color: #70226C">if</span> (tCordhdr != <span style="color: #70226C">null</span>) { <span style="color: #3F7E5E">// null check</span>
     *     ... = tCordhdr.get...();
     * } <span style="color: #70226C">else</span> {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of TCordhdr. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TCordhdr selectEntity(TCordhdrCB cb) {
        return facadeSelectEntity(cb);
    }

    protected TCordhdr facadeSelectEntity(TCordhdrCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends TCordhdr> OptionalEntity<ENTITY> doSelectOptionalEntity(TCordhdrCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * TCordhdrCB cb = <span style="color: #70226C">new</span> TCordhdrCB();
     * cb.query().set...;
     * TCordhdr tCordhdr = <span style="color: #0000C0">tCordhdrBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = tCordhdr.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of TCordhdr. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TCordhdr selectEntityWithDeletedCheck(TCordhdrCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param orderHId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TCordhdr selectByPKValue(Long orderHId) {
        return facadeSelectByPKValue(orderHId);
    }

    protected TCordhdr facadeSelectByPKValue(Long orderHId) {
        return doSelectByPK(orderHId, typeOfSelectedEntity());
    }

    protected <ENTITY extends TCordhdr> ENTITY doSelectByPK(Long orderHId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(orderHId), tp);
    }

    protected <ENTITY extends TCordhdr> OptionalEntity<ENTITY> doSelectOptionalByPK(Long orderHId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(orderHId, tp), orderHId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param orderHId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TCordhdr selectByPKValueWithDeletedCheck(Long orderHId) {
        return doSelectByPKWithDeletedCheck(orderHId, typeOfSelectedEntity());
    }

    protected <ENTITY extends TCordhdr> ENTITY doSelectByPKWithDeletedCheck(Long orderHId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(orderHId), tp);
    }

    protected TCordhdrCB xprepareCBAsPK(Long orderHId) {
        assertObjectNotNull("orderHId", orderHId);
        return newConditionBean().acceptPK(orderHId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * TCordhdrCB cb = <span style="color: #70226C">new</span> TCordhdrCB();
     * cb.query().set...;
     * cb.query().addOrderBy...;
     * ListResultBean&lt;TCordhdr&gt; <span style="color: #553000">tCordhdrList</span> = <span style="color: #0000C0">tCordhdrBhv</span>.<span style="color: #CC4747">selectList</span>(cb);
     * <span style="color: #70226C">for</span> (TCordhdr tCordhdr : <span style="color: #553000">tCordhdrList</span>) {
     *     ... = tCordhdr.get...;
     * }
     * </pre>
     * @param cb The condition-bean of TCordhdr. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<TCordhdr> selectList(TCordhdrCB cb) {
        return facadeSelectList(cb);
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * TCordhdrCB cb = <span style="color: #70226C">new</span> TCordhdrCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;TCordhdr&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">tCordhdrBhv</span>.<span style="color: #CC4747">selectPage</span>(cb);
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (TCordhdr tCordhdr : <span style="color: #553000">page</span>) {
     *     ... = tCordhdr.get...();
     * }
     * </pre>
     * @param cb The condition-bean of TCordhdr. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<TCordhdr> selectPage(TCordhdrCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * TCordhdrCB cb = <span style="color: #70226C">new</span> TCordhdrCB();
     * cb.query().set...
     * <span style="color: #0000C0">tCordhdrBhv</span>.<span style="color: #CC4747">selectCursor</span>(cb, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cb The condition-bean of TCordhdr. (NotNull)
     * @param entityRowHandler The handler of entity row of TCordhdr. (NotNull)
     */
    public void selectCursor(TCordhdrCB cb, EntityRowHandler<TCordhdr> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">tCordhdrBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<TCordhdrCB, RESULT> selectScalar(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">tCordhdrBhv</span>.<span style="color: #CC4747">scalarSelect</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<TCordhdrCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param tCordhdrList The entity list of TCordhdr. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<TCordhdr> tCordhdrList, ReferrerLoaderHandler<LoaderOfTCordhdr> loaderLambda) {
        xassLRArg(tCordhdrList, loaderLambda);
        loaderLambda.handle(new LoaderOfTCordhdr().ready(tCordhdrList, _behaviorSelector));
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
     * @param tCordhdr The entity of TCordhdr. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(TCordhdr tCordhdr, ReferrerLoaderHandler<LoaderOfTCordhdr> loaderLambda) {
        xassLRArg(tCordhdr, loaderLambda);
        loaderLambda.handle(new LoaderOfTCordhdr().ready(xnewLRAryLs(tCordhdr), _behaviorSelector));
    }

    /**
     * Load referrer of TCorddtaecList by the set-upper of referrer. <br>
     * T_CORDDTAEC by ORDER_H_ID, named 'TCorddtaecList'.
     * <pre>
     * <span style="color: #0000C0">tCordhdrBhv</span>.<span style="color: #CC4747">loadTCorddtaecList</span>(<span style="color: #553000">tCordhdrList</span>, <span style="color: #553000">corddtaecCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">corddtaecCB</span>.setupSelect...
     *     <span style="color: #553000">corddtaecCB</span>.query().set...
     *     <span style="color: #553000">corddtaecCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (TCordhdr tCordhdr : <span style="color: #553000">tCordhdrList</span>) {
     *     ... = tCordhdr.<span style="color: #CC4747">getTCorddtaecList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setOrderHId_InScope(pkList);
     * cb.query().addOrderBy_OrderHId_Asc();
     * </pre>
     * @param tCordhdrList The entity list of TCordhdr. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TCorddtaec> loadTCorddtaecList(List<TCordhdr> tCordhdrList, ConditionBeanSetupper<TCorddtaecCB> refCBLambda) {
        xassLRArg(tCordhdrList, refCBLambda);
        return doLoadTCorddtaecList(tCordhdrList, new LoadReferrerOption<TCorddtaecCB, TCorddtaec>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TCorddtaecList by the set-upper of referrer. <br>
     * T_CORDDTAEC by ORDER_H_ID, named 'TCorddtaecList'.
     * <pre>
     * <span style="color: #0000C0">tCordhdrBhv</span>.<span style="color: #CC4747">loadTCorddtaecList</span>(<span style="color: #553000">tCordhdr</span>, <span style="color: #553000">corddtaecCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">corddtaecCB</span>.setupSelect...
     *     <span style="color: #553000">corddtaecCB</span>.query().set...
     *     <span style="color: #553000">corddtaecCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">tCordhdr</span>.<span style="color: #CC4747">getTCorddtaecList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setOrderHId_InScope(pkList);
     * cb.query().addOrderBy_OrderHId_Asc();
     * </pre>
     * @param tCordhdr The entity of TCordhdr. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TCorddtaec> loadTCorddtaecList(TCordhdr tCordhdr, ConditionBeanSetupper<TCorddtaecCB> refCBLambda) {
        xassLRArg(tCordhdr, refCBLambda);
        return doLoadTCorddtaecList(xnewLRLs(tCordhdr), new LoadReferrerOption<TCorddtaecCB, TCorddtaec>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param tCordhdr The entity of TCordhdr. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TCorddtaec> loadTCorddtaecList(TCordhdr tCordhdr, LoadReferrerOption<TCorddtaecCB, TCorddtaec> loadReferrerOption) {
        xassLRArg(tCordhdr, loadReferrerOption);
        return loadTCorddtaecList(xnewLRLs(tCordhdr), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param tCordhdrList The entity list of TCordhdr. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TCorddtaec> loadTCorddtaecList(List<TCordhdr> tCordhdrList, LoadReferrerOption<TCorddtaecCB, TCorddtaec> loadReferrerOption) {
        xassLRArg(tCordhdrList, loadReferrerOption);
        if (tCordhdrList.isEmpty()) { return (NestedReferrerListGateway<TCorddtaec>)EMPTY_NREF_LGWAY; }
        return doLoadTCorddtaecList(tCordhdrList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TCorddtaec> doLoadTCorddtaecList(List<TCordhdr> tCordhdrList, LoadReferrerOption<TCorddtaecCB, TCorddtaec> option) {
        return helpLoadReferrerInternally(tCordhdrList, option, "tCorddtaecList");
    }

    /**
     * Load referrer of TCorddtasrList by the set-upper of referrer. <br>
     * T_CORDDTASR by ORDER_H_ID, named 'TCorddtasrList'.
     * <pre>
     * <span style="color: #0000C0">tCordhdrBhv</span>.<span style="color: #CC4747">loadTCorddtasrList</span>(<span style="color: #553000">tCordhdrList</span>, <span style="color: #553000">corddtasrCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">corddtasrCB</span>.setupSelect...
     *     <span style="color: #553000">corddtasrCB</span>.query().set...
     *     <span style="color: #553000">corddtasrCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (TCordhdr tCordhdr : <span style="color: #553000">tCordhdrList</span>) {
     *     ... = tCordhdr.<span style="color: #CC4747">getTCorddtasrList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setOrderHId_InScope(pkList);
     * cb.query().addOrderBy_OrderHId_Asc();
     * </pre>
     * @param tCordhdrList The entity list of TCordhdr. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TCorddtasr> loadTCorddtasrList(List<TCordhdr> tCordhdrList, ConditionBeanSetupper<TCorddtasrCB> refCBLambda) {
        xassLRArg(tCordhdrList, refCBLambda);
        return doLoadTCorddtasrList(tCordhdrList, new LoadReferrerOption<TCorddtasrCB, TCorddtasr>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TCorddtasrList by the set-upper of referrer. <br>
     * T_CORDDTASR by ORDER_H_ID, named 'TCorddtasrList'.
     * <pre>
     * <span style="color: #0000C0">tCordhdrBhv</span>.<span style="color: #CC4747">loadTCorddtasrList</span>(<span style="color: #553000">tCordhdr</span>, <span style="color: #553000">corddtasrCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">corddtasrCB</span>.setupSelect...
     *     <span style="color: #553000">corddtasrCB</span>.query().set...
     *     <span style="color: #553000">corddtasrCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">tCordhdr</span>.<span style="color: #CC4747">getTCorddtasrList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setOrderHId_InScope(pkList);
     * cb.query().addOrderBy_OrderHId_Asc();
     * </pre>
     * @param tCordhdr The entity of TCordhdr. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TCorddtasr> loadTCorddtasrList(TCordhdr tCordhdr, ConditionBeanSetupper<TCorddtasrCB> refCBLambda) {
        xassLRArg(tCordhdr, refCBLambda);
        return doLoadTCorddtasrList(xnewLRLs(tCordhdr), new LoadReferrerOption<TCorddtasrCB, TCorddtasr>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param tCordhdr The entity of TCordhdr. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TCorddtasr> loadTCorddtasrList(TCordhdr tCordhdr, LoadReferrerOption<TCorddtasrCB, TCorddtasr> loadReferrerOption) {
        xassLRArg(tCordhdr, loadReferrerOption);
        return loadTCorddtasrList(xnewLRLs(tCordhdr), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param tCordhdrList The entity list of TCordhdr. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TCorddtasr> loadTCorddtasrList(List<TCordhdr> tCordhdrList, LoadReferrerOption<TCorddtasrCB, TCorddtasr> loadReferrerOption) {
        xassLRArg(tCordhdrList, loadReferrerOption);
        if (tCordhdrList.isEmpty()) { return (NestedReferrerListGateway<TCorddtasr>)EMPTY_NREF_LGWAY; }
        return doLoadTCorddtasrList(tCordhdrList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TCorddtasr> doLoadTCorddtasrList(List<TCordhdr> tCordhdrList, LoadReferrerOption<TCorddtasrCB, TCorddtasr> option) {
        return helpLoadReferrerInternally(tCordhdrList, option, "tCorddtasrList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'MCenter'.
     * @param tCordhdrList The list of tCordhdr. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MCenter> pulloutMCenter(List<TCordhdr> tCordhdrList)
    { return helpPulloutInternally(tCordhdrList, "mCenter"); }

    /**
     * Pull out the list of foreign table 'MClient'.
     * @param tCordhdrList The list of tCordhdr. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MClient> pulloutMClient(List<TCordhdr> tCordhdrList)
    { return helpPulloutInternally(tCordhdrList, "mClient"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key orderHId.
     * @param tCordhdrList The list of tCordhdr. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractOrderHIdList(List<TCordhdr> tCordhdrList)
    { return helpExtractListInternally(tCordhdrList, "orderHId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * TCordhdr tCordhdr = <span style="color: #70226C">new</span> TCordhdr();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * tCordhdr.setFoo...(value);
     * tCordhdr.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tCordhdr.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tCordhdr.set...;</span>
     * <span style="color: #0000C0">tCordhdrBhv</span>.<span style="color: #CC4747">insert</span>(tCordhdr);
     * ... = tCordhdr.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param tCordhdr The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(TCordhdr tCordhdr) {
        doInsert(tCordhdr, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * TCordhdr tCordhdr = <span style="color: #70226C">new</span> TCordhdr();
     * tCordhdr.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tCordhdr.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tCordhdr.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tCordhdr.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * tCordhdr.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">tCordhdrBhv</span>.<span style="color: #CC4747">update</span>(tCordhdr);
     * </pre>
     * @param tCordhdr The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(TCordhdr tCordhdr) {
        doUpdate(tCordhdr, null);
    }

    /**
     * Update the entity non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * TCordhdr tCordhdr = <span style="color: #70226C">new</span> TCordhdr();
     * tCordhdr.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tCordhdr.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tCordhdr.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tCordhdr.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tCordhdr.setVersionNo(value);</span>
     * <span style="color: #0000C0">tCordhdrBhv</span>.<span style="color: #CC4747">updateNonstrict</span>(tCordhdr);
     * </pre>
     * @param tCordhdr The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(TCordhdr tCordhdr) {
        doUpdateNonstrict(tCordhdr, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param tCordhdr The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(TCordhdr tCordhdr) {
        doInsertOrUpdate(tCordhdr, null, null);
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param tCordhdr The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(TCordhdr tCordhdr) {
        doInsertOrUpdateNonstrict(tCordhdr, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * TCordhdr tCordhdr = <span style="color: #70226C">new</span> TCordhdr();
     * tCordhdr.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * tCordhdr.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">tCordhdrBhv</span>.<span style="color: #CC4747">delete</span>(tCordhdr);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param tCordhdr The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(TCordhdr tCordhdr) {
        doDelete(tCordhdr, null);
    }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl} <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * TCordhdr tCordhdr = <span style="color: #70226C">new</span> TCordhdr();
     * tCordhdr.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tCordhdr.setVersionNo(value);</span>
     * <span style="color: #0000C0">tCordhdrBhv</span>.<span style="color: #CC4747">deleteNonstrict</span>(tCordhdr);
     * </pre>
     * @param tCordhdr The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(TCordhdr tCordhdr) {
        doDeleteNonstrict(tCordhdr, null);
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * TCordhdr tCordhdr = <span style="color: #70226C">new</span> TCordhdr();
     * tCordhdr.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tCordhdr.setVersionNo(value);</span>
     * <span style="color: #0000C0">tCordhdrBhv</span>.<span style="color: #CC4747">deleteNonstrictIgnoreDeleted</span>(tCordhdr);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param tCordhdr The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(TCordhdr tCordhdr) {
        doDeleteNonstrictIgnoreDeleted(tCordhdr, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(TCordhdr et, final DeleteOption<TCordhdrCB> op) {
        assertObjectNotNull("tCordhdr", et); prepareDeleteOption(op); helpDeleteNonstrictIgnoreDeletedInternally(et, op);
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
     *     TCordhdr tCordhdr = <span style="color: #70226C">new</span> TCordhdr();
     *     tCordhdr.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         tCordhdr.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     tCordhdrList.add(tCordhdr);
     * }
     * <span style="color: #0000C0">tCordhdrBhv</span>.<span style="color: #CC4747">batchInsert</span>(tCordhdrList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param tCordhdrList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<TCordhdr> tCordhdrList) {
        return doBatchInsert(tCordhdrList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     TCordhdr tCordhdr = <span style="color: #70226C">new</span> TCordhdr();
     *     tCordhdr.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         tCordhdr.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         tCordhdr.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//tCordhdr.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     tCordhdrList.add(tCordhdr);
     * }
     * <span style="color: #0000C0">tCordhdrBhv</span>.<span style="color: #CC4747">batchUpdate</span>(tCordhdrList);
     * </pre>
     * @param tCordhdrList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<TCordhdr> tCordhdrList) {
        return doBatchUpdate(tCordhdrList, null);
    }

    /**
     * Batch-update the entity list specified-only. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * tCordhdrBhv.<span style="color: #CC4747">batchUpdate</span>(tCordhdrList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">tCordhdrBhv</span>.<span style="color: #CC4747">batchUpdate</span>(tCordhdrList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param tCordhdrList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<TCordhdr> tCordhdrList, SpecifyQuery<TCordhdrCB> colCBLambda) {
        return doBatchUpdate(tCordhdrList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * <span style="color: #70226C">for</span> (... : ...) {
     *     TCordhdr tCordhdr = <span style="color: #70226C">new</span> TCordhdr();
     *     tCordhdr.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         tCordhdr.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         tCordhdr.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//tCordhdr.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     tCordhdrList.add(tCordhdr);
     * }
     * <span style="color: #0000C0">tCordhdrBhv</span>.<span style="color: #CC4747">batchUpdate</span>(tCordhdrList);
     * </pre>
     * @param tCordhdrList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<TCordhdr> tCordhdrList) {
        return doBatchUpdateNonstrict(tCordhdrList, null);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * <span style="color: #0000C0">tCordhdrBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(tCordhdrList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">tCordhdrBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(tCordhdrList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).</p>
     * @param tCordhdrList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<TCordhdr> tCordhdrList, SpecifyQuery<TCordhdrCB> colCBLambda) {
        return doBatchUpdateNonstrict(tCordhdrList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param tCordhdrList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<TCordhdr> tCordhdrList) {
        return doBatchDelete(tCordhdrList, null);
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param tCordhdrList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<TCordhdr> tCordhdrList) {
        return doBatchDeleteNonstrict(tCordhdrList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">tCordhdrBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;TCordhdr, TCordhdrCB&gt;() {
     *     public ConditionBean setup(TCordhdr entity, TCordhdrCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<TCordhdr, TCordhdrCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * TCordhdr tCordhdr = <span style="color: #70226C">new</span> TCordhdr();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//tCordhdr.setPK...(value);</span>
     * tCordhdr.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tCordhdr.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tCordhdr.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tCordhdr.setVersionNo(value);</span>
     * TCordhdrCB cb = <span style="color: #70226C">new</span> TCordhdrCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">tCordhdrBhv</span>.<span style="color: #CC4747">queryUpdate</span>(tCordhdr, cb);
     * </pre>
     * @param tCordhdr The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of TCordhdr. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(TCordhdr tCordhdr, TCordhdrCB cb) {
        return doQueryUpdate(tCordhdr, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * TCordhdrCB cb = new TCordhdrCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">tCordhdrBhv</span>.<span style="color: #CC4747">queryDelete</span>(tCordhdr, cb);
     * </pre>
     * @param cb The condition-bean of TCordhdr. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(TCordhdrCB cb) {
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
     * TCordhdr tCordhdr = <span style="color: #70226C">new</span> TCordhdr();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * tCordhdr.setFoo...(value);
     * tCordhdr.setBar...(value);
     * <span style="color: #0000C0">tCordhdrBhv</span>.<span style="color: #CC4747">varyingInsert</span>(tCordhdr, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = tCordhdr.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param tCordhdr The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(TCordhdr tCordhdr, WritableOptionCall<TCordhdrCB, InsertOption<TCordhdrCB>> opLambda) {
        doInsert(tCordhdr, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * TCordhdr tCordhdr = <span style="color: #70226C">new</span> TCordhdr();
     * tCordhdr.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tCordhdr.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * tCordhdr.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">tCordhdrBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(tCordhdr, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param tCordhdr The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(TCordhdr tCordhdr, WritableOptionCall<TCordhdrCB, UpdateOption<TCordhdrCB>> opLambda) {
        doUpdate(tCordhdr, createUpdateOption(opLambda));
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * TCordhdr tCordhdr = <span style="color: #70226C">new</span> TCordhdr();
     * tCordhdr.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tCordhdr.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tCordhdr.setVersionNo(value);</span>
     * <span style="color: #0000C0">tCordhdrBhv</span>.<span style="color: #CC4747">varyingUpdateNonstrict</span>(tCordhdr, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param tCordhdr The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(TCordhdr tCordhdr, WritableOptionCall<TCordhdrCB, UpdateOption<TCordhdrCB>> opLambda) {
        doUpdateNonstrict(tCordhdr, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param tCordhdr The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(TCordhdr tCordhdr, WritableOptionCall<TCordhdrCB, InsertOption<TCordhdrCB>> insertOpLambda, WritableOptionCall<TCordhdrCB, UpdateOption<TCordhdrCB>> updateOpLambda) {
        doInsertOrUpdate(tCordhdr, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param tCordhdr The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(TCordhdr tCordhdr, WritableOptionCall<TCordhdrCB, InsertOption<TCordhdrCB>> insertOpLambda, WritableOptionCall<TCordhdrCB, UpdateOption<TCordhdrCB>> updateOpLambda) {
        doInsertOrUpdateNonstrict(tCordhdr, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param tCordhdr The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(TCordhdr tCordhdr, WritableOptionCall<TCordhdrCB, DeleteOption<TCordhdrCB>> opLambda) {
        doDelete(tCordhdr, createDeleteOption(opLambda));
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as deleteNonstrict(entity).
     * @param tCordhdr The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(TCordhdr tCordhdr, WritableOptionCall<TCordhdrCB, DeleteOption<TCordhdrCB>> opLambda) {
        doDeleteNonstrict(tCordhdr, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param tCordhdrList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<TCordhdr> tCordhdrList, WritableOptionCall<TCordhdrCB, InsertOption<TCordhdrCB>> opLambda) {
        return doBatchInsert(tCordhdrList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param tCordhdrList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<TCordhdr> tCordhdrList, WritableOptionCall<TCordhdrCB, UpdateOption<TCordhdrCB>> opLambda) {
        return doBatchUpdate(tCordhdrList, createUpdateOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param tCordhdrList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<TCordhdr> tCordhdrList, WritableOptionCall<TCordhdrCB, UpdateOption<TCordhdrCB>> opLambda) {
        return doBatchUpdateNonstrict(tCordhdrList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param tCordhdrList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<TCordhdr> tCordhdrList, WritableOptionCall<TCordhdrCB, DeleteOption<TCordhdrCB>> opLambda) {
        return doBatchDelete(tCordhdrList, createDeleteOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param tCordhdrList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<TCordhdr> tCordhdrList, WritableOptionCall<TCordhdrCB, DeleteOption<TCordhdrCB>> opLambda) {
        return doBatchDeleteNonstrict(tCordhdrList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<TCordhdr, TCordhdrCB> manyArgLambda, WritableOptionCall<TCordhdrCB, InsertOption<TCordhdrCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * TCordhdr tCordhdr = <span style="color: #70226C">new</span> TCordhdr();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//tCordhdr.setPK...(value);</span>
     * tCordhdr.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tCordhdr.setVersionNo(value);</span>
     * TCordhdrCB cb = <span style="color: #70226C">new</span> TCordhdrCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">tCordhdrBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(tCordhdr, cb, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param tCordhdr The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of TCordhdr. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(TCordhdr tCordhdr, TCordhdrCB cb, WritableOptionCall<TCordhdrCB, UpdateOption<TCordhdrCB>> opLambda) {
        return doQueryUpdate(tCordhdr, cb, createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * @param cb The condition-bean of TCordhdr. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(TCordhdrCB cb, WritableOptionCall<TCordhdrCB, DeleteOption<TCordhdrCB>> opLambda) {
        return doQueryDelete(cb, createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span>
     * tCordhdrBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span>
     * tCordhdrBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * tCordhdrBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * tCordhdrBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * tCordhdrBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * tCordhdrBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * tCordhdrBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span>
     * tCordhdrBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * tCordhdrBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * tCordhdrBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * tCordhdrBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * tCordhdrBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * tCordhdrBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span>
     * tCordhdrBhv.outideSql().removeBlockComment().selectList()
     * tCordhdrBhv.outideSql().removeLineComment().selectList()
     * tCordhdrBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlBasicExecutor<TCordhdrBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<TCordhdrBhv> facadeExecutor = doOutsideSql();
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
    protected Class<? extends TCordhdr> typeOfSelectedEntity() { return TCordhdr.class; }
    protected Class<TCordhdr> typeOfHandlingEntity() { return TCordhdr.class; }
    protected Class<TCordhdrCB> typeOfHandlingConditionBean() { return TCordhdrCB.class; }
}
