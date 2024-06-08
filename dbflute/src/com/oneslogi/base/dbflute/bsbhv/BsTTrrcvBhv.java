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
 * The behavior of T_TRRCV as TABLE. <br>
 * <pre>
 * [primary key]
 *     RECEIVE_PLAN_H_ID
 *
 * [column]
 *     RECEIVE_PLAN_H_ID, PREKEY, TEMPLATEFLG, RCVINSPECTFLG, SUPPLIERRCVNO, RMANO, RCVTYPE, ITEMCD, PARTFLG, RECEIVE_STS, PRIORITIES, COMPANYCD, RECEIVEDATE, LOGISTICSCD, SUPPLIERCD, SUPPLIERNAME, ADDRESS1, ADDRESS2, ADDRESS3, POSTNO, COUNTRYCD, PORTCD, DISTRICTCD, SUPPLIERPHONE, FAX1, EMAIL, REFNAME, FROMCD, FROMSUB, FROMNAME, FROMADDRESS1, FROMADDRESS2, FROMADDRESS3, FROMPOSTNO, FROMCOUNTRYCD, FROMPORTCD, FROMDISTRICTCD, FROMPHONE, FROMFAX, FROMEMAIL, FROMREFNAME, CARRIERCD, CARRIERNAME, CARRIERWBNO, DELIVERYCD, CARRIERNO, CARRIERSNAME, CARRIERSEQ, EXPECTEDTIME, NOTES, OTHERREFNO1, OTHERREFNO2, OTHERREFNO3, ALLOCGROUP, TRACCEPT_ID, ACCEPTUSERCD, INSPECTEDUSERCD, RECEIVEDUSERCD, MOVEKEY, ASSYKEY, PRODUCEKEY, TERMINAL_CD, WAREHOUSE_CD, FC_FLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     T_RECEIVE_PLAN_H, T_TRRCVEXTEND(AsOne)
 *
 * [referrer table]
 *     T_TRRCVDETAIL, T_TRRCVEXTEND
 *
 * [foreign property]
 *     tReceivePlanH, tTrrcvextendAsOne
 *
 * [referrer property]
 *     tTrrcvdetailList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsTTrrcvBhv extends AbstractBehaviorWritable<TTrrcv, TTrrcvCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /** 入庫実績データ取得 */
    public static final String PATH_selectSqlReceiveRecordList = "selectSqlReceiveRecordList";
    /** 入庫実績データ国産・輸入区分取得 */
    public static final String PATH_selectSqlReceiveRecordUsernum1List = "selectSqlReceiveRecordUsernum1List";
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public TTrrcvDbm asDBMeta() { return TTrrcvDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "T_TRRCV"; }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public TTrrcvDbm getMyDBMeta() { return TTrrcvDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public TTrrcvCB newConditionBean() { return new TTrrcvCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public TTrrcv newMyEntity() { return new TTrrcv(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public TTrrcvCB newMyConditionBean() { return new TTrrcvCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * TTrrcvCB cb = <span style="color: #70226C">new</span> TTrrcvCB();
     * cb.query().setFoo...(value);
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">tTrrcvBhv</span>.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of TTrrcv. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(TTrrcvCB cb) {
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
     * TTrrcvCB cb = <span style="color: #70226C">new</span> TTrrcvCB();
     * cb.query().setFoo...(value);
     * TTrrcv tTrrcv = <span style="color: #0000C0">tTrrcvBhv</span>.<span style="color: #DD4747">selectEntity</span>(cb);
     * <span style="color: #70226C">if</span> (tTrrcv != <span style="color: #70226C">null</span>) { <span style="color: #3F7E5E">// null check</span>
     *     ... = tTrrcv.get...();
     * } <span style="color: #70226C">else</span> {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of TTrrcv. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TTrrcv selectEntity(TTrrcvCB cb) {
        return facadeSelectEntity(cb);
    }

    protected TTrrcv facadeSelectEntity(TTrrcvCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends TTrrcv> OptionalEntity<ENTITY> doSelectOptionalEntity(TTrrcvCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * TTrrcvCB cb = <span style="color: #70226C">new</span> TTrrcvCB();
     * cb.query().set...;
     * TTrrcv tTrrcv = <span style="color: #0000C0">tTrrcvBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = tTrrcv.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of TTrrcv. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TTrrcv selectEntityWithDeletedCheck(TTrrcvCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param receivePlanHId : PK, IX, NotNull, bigint(19), FK to T_RECEIVE_PLAN_H. (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TTrrcv selectByPKValue(Long receivePlanHId) {
        return facadeSelectByPKValue(receivePlanHId);
    }

    protected TTrrcv facadeSelectByPKValue(Long receivePlanHId) {
        return doSelectByPK(receivePlanHId, typeOfSelectedEntity());
    }

    protected <ENTITY extends TTrrcv> ENTITY doSelectByPK(Long receivePlanHId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(receivePlanHId), tp);
    }

    protected <ENTITY extends TTrrcv> OptionalEntity<ENTITY> doSelectOptionalByPK(Long receivePlanHId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(receivePlanHId, tp), receivePlanHId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param receivePlanHId : PK, IX, NotNull, bigint(19), FK to T_RECEIVE_PLAN_H. (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TTrrcv selectByPKValueWithDeletedCheck(Long receivePlanHId) {
        return doSelectByPKWithDeletedCheck(receivePlanHId, typeOfSelectedEntity());
    }

    protected <ENTITY extends TTrrcv> ENTITY doSelectByPKWithDeletedCheck(Long receivePlanHId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(receivePlanHId), tp);
    }

    protected TTrrcvCB xprepareCBAsPK(Long receivePlanHId) {
        assertObjectNotNull("receivePlanHId", receivePlanHId);
        return newConditionBean().acceptPK(receivePlanHId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * TTrrcvCB cb = <span style="color: #70226C">new</span> TTrrcvCB();
     * cb.query().set...;
     * cb.query().addOrderBy...;
     * ListResultBean&lt;TTrrcv&gt; <span style="color: #553000">tTrrcvList</span> = <span style="color: #0000C0">tTrrcvBhv</span>.<span style="color: #CC4747">selectList</span>(cb);
     * <span style="color: #70226C">for</span> (TTrrcv tTrrcv : <span style="color: #553000">tTrrcvList</span>) {
     *     ... = tTrrcv.get...;
     * }
     * </pre>
     * @param cb The condition-bean of TTrrcv. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<TTrrcv> selectList(TTrrcvCB cb) {
        return facadeSelectList(cb);
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * TTrrcvCB cb = <span style="color: #70226C">new</span> TTrrcvCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;TTrrcv&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">tTrrcvBhv</span>.<span style="color: #CC4747">selectPage</span>(cb);
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (TTrrcv tTrrcv : <span style="color: #553000">page</span>) {
     *     ... = tTrrcv.get...();
     * }
     * </pre>
     * @param cb The condition-bean of TTrrcv. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<TTrrcv> selectPage(TTrrcvCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * TTrrcvCB cb = <span style="color: #70226C">new</span> TTrrcvCB();
     * cb.query().set...
     * <span style="color: #0000C0">tTrrcvBhv</span>.<span style="color: #CC4747">selectCursor</span>(cb, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cb The condition-bean of TTrrcv. (NotNull)
     * @param entityRowHandler The handler of entity row of TTrrcv. (NotNull)
     */
    public void selectCursor(TTrrcvCB cb, EntityRowHandler<TTrrcv> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">tTrrcvBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<TTrrcvCB, RESULT> selectScalar(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">tTrrcvBhv</span>.<span style="color: #CC4747">scalarSelect</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<TTrrcvCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param tTrrcvList The entity list of TTrrcv. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<TTrrcv> tTrrcvList, ReferrerLoaderHandler<LoaderOfTTrrcv> loaderLambda) {
        xassLRArg(tTrrcvList, loaderLambda);
        loaderLambda.handle(new LoaderOfTTrrcv().ready(tTrrcvList, _behaviorSelector));
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
     * @param tTrrcv The entity of TTrrcv. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(TTrrcv tTrrcv, ReferrerLoaderHandler<LoaderOfTTrrcv> loaderLambda) {
        xassLRArg(tTrrcv, loaderLambda);
        loaderLambda.handle(new LoaderOfTTrrcv().ready(xnewLRAryLs(tTrrcv), _behaviorSelector));
    }

    /**
     * Load referrer of TTrrcvdetailList by the set-upper of referrer. <br>
     * T_TRRCVDETAIL by RECEIVE_PLAN_H_ID, named 'TTrrcvdetailList'.
     * <pre>
     * <span style="color: #0000C0">tTrrcvBhv</span>.<span style="color: #CC4747">loadTTrrcvdetailList</span>(<span style="color: #553000">tTrrcvList</span>, <span style="color: #553000">trrcvdetailCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">trrcvdetailCB</span>.setupSelect...
     *     <span style="color: #553000">trrcvdetailCB</span>.query().set...
     *     <span style="color: #553000">trrcvdetailCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (TTrrcv tTrrcv : <span style="color: #553000">tTrrcvList</span>) {
     *     ... = tTrrcv.<span style="color: #CC4747">getTTrrcvdetailList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setReceivePlanHId_InScope(pkList);
     * cb.query().addOrderBy_ReceivePlanHId_Asc();
     * </pre>
     * @param tTrrcvList The entity list of TTrrcv. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TTrrcvdetail> loadTTrrcvdetailList(List<TTrrcv> tTrrcvList, ConditionBeanSetupper<TTrrcvdetailCB> refCBLambda) {
        xassLRArg(tTrrcvList, refCBLambda);
        return doLoadTTrrcvdetailList(tTrrcvList, new LoadReferrerOption<TTrrcvdetailCB, TTrrcvdetail>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TTrrcvdetailList by the set-upper of referrer. <br>
     * T_TRRCVDETAIL by RECEIVE_PLAN_H_ID, named 'TTrrcvdetailList'.
     * <pre>
     * <span style="color: #0000C0">tTrrcvBhv</span>.<span style="color: #CC4747">loadTTrrcvdetailList</span>(<span style="color: #553000">tTrrcv</span>, <span style="color: #553000">trrcvdetailCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">trrcvdetailCB</span>.setupSelect...
     *     <span style="color: #553000">trrcvdetailCB</span>.query().set...
     *     <span style="color: #553000">trrcvdetailCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">tTrrcv</span>.<span style="color: #CC4747">getTTrrcvdetailList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setReceivePlanHId_InScope(pkList);
     * cb.query().addOrderBy_ReceivePlanHId_Asc();
     * </pre>
     * @param tTrrcv The entity of TTrrcv. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TTrrcvdetail> loadTTrrcvdetailList(TTrrcv tTrrcv, ConditionBeanSetupper<TTrrcvdetailCB> refCBLambda) {
        xassLRArg(tTrrcv, refCBLambda);
        return doLoadTTrrcvdetailList(xnewLRLs(tTrrcv), new LoadReferrerOption<TTrrcvdetailCB, TTrrcvdetail>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param tTrrcv The entity of TTrrcv. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TTrrcvdetail> loadTTrrcvdetailList(TTrrcv tTrrcv, LoadReferrerOption<TTrrcvdetailCB, TTrrcvdetail> loadReferrerOption) {
        xassLRArg(tTrrcv, loadReferrerOption);
        return loadTTrrcvdetailList(xnewLRLs(tTrrcv), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param tTrrcvList The entity list of TTrrcv. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TTrrcvdetail> loadTTrrcvdetailList(List<TTrrcv> tTrrcvList, LoadReferrerOption<TTrrcvdetailCB, TTrrcvdetail> loadReferrerOption) {
        xassLRArg(tTrrcvList, loadReferrerOption);
        if (tTrrcvList.isEmpty()) { return (NestedReferrerListGateway<TTrrcvdetail>)EMPTY_NREF_LGWAY; }
        return doLoadTTrrcvdetailList(tTrrcvList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TTrrcvdetail> doLoadTTrrcvdetailList(List<TTrrcv> tTrrcvList, LoadReferrerOption<TTrrcvdetailCB, TTrrcvdetail> option) {
        return helpLoadReferrerInternally(tTrrcvList, option, "tTrrcvdetailList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'TReceivePlanH'.
     * @param tTrrcvList The list of tTrrcv. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<TReceivePlanH> pulloutTReceivePlanH(List<TTrrcv> tTrrcvList)
    { return helpPulloutInternally(tTrrcvList, "tReceivePlanH"); }

    /**
     * Pull out the list of referrer-as-one table 'TTrrcvextend'.
     * @param tTrrcvList The list of tTrrcv. (NotNull, EmptyAllowed)
     * @return The list of referrer-as-one table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<TTrrcvextend> pulloutTTrrcvextendAsOne(List<TTrrcv> tTrrcvList)
    { return helpPulloutInternally(tTrrcvList, "tTrrcvextendAsOne"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key receivePlanHId.
     * @param tTrrcvList The list of tTrrcv. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractReceivePlanHIdList(List<TTrrcv> tTrrcvList)
    { return helpExtractListInternally(tTrrcvList, "receivePlanHId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * TTrrcv tTrrcv = <span style="color: #70226C">new</span> TTrrcv();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * tTrrcv.setFoo...(value);
     * tTrrcv.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tTrrcv.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tTrrcv.set...;</span>
     * <span style="color: #0000C0">tTrrcvBhv</span>.<span style="color: #CC4747">insert</span>(tTrrcv);
     * ... = tTrrcv.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param tTrrcv The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(TTrrcv tTrrcv) {
        doInsert(tTrrcv, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * TTrrcv tTrrcv = <span style="color: #70226C">new</span> TTrrcv();
     * tTrrcv.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tTrrcv.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tTrrcv.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tTrrcv.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * tTrrcv.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">tTrrcvBhv</span>.<span style="color: #CC4747">update</span>(tTrrcv);
     * </pre>
     * @param tTrrcv The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(TTrrcv tTrrcv) {
        doUpdate(tTrrcv, null);
    }

    /**
     * Update the entity non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * TTrrcv tTrrcv = <span style="color: #70226C">new</span> TTrrcv();
     * tTrrcv.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tTrrcv.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tTrrcv.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tTrrcv.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tTrrcv.setVersionNo(value);</span>
     * <span style="color: #0000C0">tTrrcvBhv</span>.<span style="color: #CC4747">updateNonstrict</span>(tTrrcv);
     * </pre>
     * @param tTrrcv The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(TTrrcv tTrrcv) {
        doUpdateNonstrict(tTrrcv, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param tTrrcv The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(TTrrcv tTrrcv) {
        doInsertOrUpdate(tTrrcv, null, null);
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param tTrrcv The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(TTrrcv tTrrcv) {
        doInsertOrUpdateNonstrict(tTrrcv, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * TTrrcv tTrrcv = <span style="color: #70226C">new</span> TTrrcv();
     * tTrrcv.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * tTrrcv.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">tTrrcvBhv</span>.<span style="color: #CC4747">delete</span>(tTrrcv);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param tTrrcv The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(TTrrcv tTrrcv) {
        doDelete(tTrrcv, null);
    }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl} <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * TTrrcv tTrrcv = <span style="color: #70226C">new</span> TTrrcv();
     * tTrrcv.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tTrrcv.setVersionNo(value);</span>
     * <span style="color: #0000C0">tTrrcvBhv</span>.<span style="color: #CC4747">deleteNonstrict</span>(tTrrcv);
     * </pre>
     * @param tTrrcv The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(TTrrcv tTrrcv) {
        doDeleteNonstrict(tTrrcv, null);
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * TTrrcv tTrrcv = <span style="color: #70226C">new</span> TTrrcv();
     * tTrrcv.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tTrrcv.setVersionNo(value);</span>
     * <span style="color: #0000C0">tTrrcvBhv</span>.<span style="color: #CC4747">deleteNonstrictIgnoreDeleted</span>(tTrrcv);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param tTrrcv The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(TTrrcv tTrrcv) {
        doDeleteNonstrictIgnoreDeleted(tTrrcv, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(TTrrcv et, final DeleteOption<TTrrcvCB> op) {
        assertObjectNotNull("tTrrcv", et); prepareDeleteOption(op); helpDeleteNonstrictIgnoreDeletedInternally(et, op);
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
     *     TTrrcv tTrrcv = <span style="color: #70226C">new</span> TTrrcv();
     *     tTrrcv.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         tTrrcv.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     tTrrcvList.add(tTrrcv);
     * }
     * <span style="color: #0000C0">tTrrcvBhv</span>.<span style="color: #CC4747">batchInsert</span>(tTrrcvList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param tTrrcvList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<TTrrcv> tTrrcvList) {
        return doBatchInsert(tTrrcvList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     TTrrcv tTrrcv = <span style="color: #70226C">new</span> TTrrcv();
     *     tTrrcv.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         tTrrcv.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         tTrrcv.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//tTrrcv.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     tTrrcvList.add(tTrrcv);
     * }
     * <span style="color: #0000C0">tTrrcvBhv</span>.<span style="color: #CC4747">batchUpdate</span>(tTrrcvList);
     * </pre>
     * @param tTrrcvList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<TTrrcv> tTrrcvList) {
        return doBatchUpdate(tTrrcvList, null);
    }

    /**
     * Batch-update the entity list specified-only. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * tTrrcvBhv.<span style="color: #CC4747">batchUpdate</span>(tTrrcvList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">tTrrcvBhv</span>.<span style="color: #CC4747">batchUpdate</span>(tTrrcvList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param tTrrcvList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<TTrrcv> tTrrcvList, SpecifyQuery<TTrrcvCB> colCBLambda) {
        return doBatchUpdate(tTrrcvList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * <span style="color: #70226C">for</span> (... : ...) {
     *     TTrrcv tTrrcv = <span style="color: #70226C">new</span> TTrrcv();
     *     tTrrcv.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         tTrrcv.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         tTrrcv.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//tTrrcv.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     tTrrcvList.add(tTrrcv);
     * }
     * <span style="color: #0000C0">tTrrcvBhv</span>.<span style="color: #CC4747">batchUpdate</span>(tTrrcvList);
     * </pre>
     * @param tTrrcvList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<TTrrcv> tTrrcvList) {
        return doBatchUpdateNonstrict(tTrrcvList, null);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * <span style="color: #0000C0">tTrrcvBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(tTrrcvList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">tTrrcvBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(tTrrcvList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).</p>
     * @param tTrrcvList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<TTrrcv> tTrrcvList, SpecifyQuery<TTrrcvCB> colCBLambda) {
        return doBatchUpdateNonstrict(tTrrcvList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param tTrrcvList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<TTrrcv> tTrrcvList) {
        return doBatchDelete(tTrrcvList, null);
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param tTrrcvList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<TTrrcv> tTrrcvList) {
        return doBatchDeleteNonstrict(tTrrcvList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">tTrrcvBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;TTrrcv, TTrrcvCB&gt;() {
     *     public ConditionBean setup(TTrrcv entity, TTrrcvCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<TTrrcv, TTrrcvCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * TTrrcv tTrrcv = <span style="color: #70226C">new</span> TTrrcv();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//tTrrcv.setPK...(value);</span>
     * tTrrcv.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tTrrcv.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tTrrcv.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tTrrcv.setVersionNo(value);</span>
     * TTrrcvCB cb = <span style="color: #70226C">new</span> TTrrcvCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">tTrrcvBhv</span>.<span style="color: #CC4747">queryUpdate</span>(tTrrcv, cb);
     * </pre>
     * @param tTrrcv The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of TTrrcv. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(TTrrcv tTrrcv, TTrrcvCB cb) {
        return doQueryUpdate(tTrrcv, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * TTrrcvCB cb = new TTrrcvCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">tTrrcvBhv</span>.<span style="color: #CC4747">queryDelete</span>(tTrrcv, cb);
     * </pre>
     * @param cb The condition-bean of TTrrcv. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(TTrrcvCB cb) {
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
     * TTrrcv tTrrcv = <span style="color: #70226C">new</span> TTrrcv();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * tTrrcv.setFoo...(value);
     * tTrrcv.setBar...(value);
     * <span style="color: #0000C0">tTrrcvBhv</span>.<span style="color: #CC4747">varyingInsert</span>(tTrrcv, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = tTrrcv.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param tTrrcv The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(TTrrcv tTrrcv, WritableOptionCall<TTrrcvCB, InsertOption<TTrrcvCB>> opLambda) {
        doInsert(tTrrcv, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * TTrrcv tTrrcv = <span style="color: #70226C">new</span> TTrrcv();
     * tTrrcv.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tTrrcv.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * tTrrcv.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">tTrrcvBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(tTrrcv, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param tTrrcv The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(TTrrcv tTrrcv, WritableOptionCall<TTrrcvCB, UpdateOption<TTrrcvCB>> opLambda) {
        doUpdate(tTrrcv, createUpdateOption(opLambda));
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * TTrrcv tTrrcv = <span style="color: #70226C">new</span> TTrrcv();
     * tTrrcv.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tTrrcv.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tTrrcv.setVersionNo(value);</span>
     * <span style="color: #0000C0">tTrrcvBhv</span>.<span style="color: #CC4747">varyingUpdateNonstrict</span>(tTrrcv, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param tTrrcv The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(TTrrcv tTrrcv, WritableOptionCall<TTrrcvCB, UpdateOption<TTrrcvCB>> opLambda) {
        doUpdateNonstrict(tTrrcv, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param tTrrcv The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(TTrrcv tTrrcv, WritableOptionCall<TTrrcvCB, InsertOption<TTrrcvCB>> insertOpLambda, WritableOptionCall<TTrrcvCB, UpdateOption<TTrrcvCB>> updateOpLambda) {
        doInsertOrUpdate(tTrrcv, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param tTrrcv The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(TTrrcv tTrrcv, WritableOptionCall<TTrrcvCB, InsertOption<TTrrcvCB>> insertOpLambda, WritableOptionCall<TTrrcvCB, UpdateOption<TTrrcvCB>> updateOpLambda) {
        doInsertOrUpdateNonstrict(tTrrcv, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param tTrrcv The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(TTrrcv tTrrcv, WritableOptionCall<TTrrcvCB, DeleteOption<TTrrcvCB>> opLambda) {
        doDelete(tTrrcv, createDeleteOption(opLambda));
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as deleteNonstrict(entity).
     * @param tTrrcv The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(TTrrcv tTrrcv, WritableOptionCall<TTrrcvCB, DeleteOption<TTrrcvCB>> opLambda) {
        doDeleteNonstrict(tTrrcv, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param tTrrcvList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<TTrrcv> tTrrcvList, WritableOptionCall<TTrrcvCB, InsertOption<TTrrcvCB>> opLambda) {
        return doBatchInsert(tTrrcvList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param tTrrcvList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<TTrrcv> tTrrcvList, WritableOptionCall<TTrrcvCB, UpdateOption<TTrrcvCB>> opLambda) {
        return doBatchUpdate(tTrrcvList, createUpdateOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param tTrrcvList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<TTrrcv> tTrrcvList, WritableOptionCall<TTrrcvCB, UpdateOption<TTrrcvCB>> opLambda) {
        return doBatchUpdateNonstrict(tTrrcvList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param tTrrcvList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<TTrrcv> tTrrcvList, WritableOptionCall<TTrrcvCB, DeleteOption<TTrrcvCB>> opLambda) {
        return doBatchDelete(tTrrcvList, createDeleteOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param tTrrcvList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<TTrrcv> tTrrcvList, WritableOptionCall<TTrrcvCB, DeleteOption<TTrrcvCB>> opLambda) {
        return doBatchDeleteNonstrict(tTrrcvList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<TTrrcv, TTrrcvCB> manyArgLambda, WritableOptionCall<TTrrcvCB, InsertOption<TTrrcvCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * TTrrcv tTrrcv = <span style="color: #70226C">new</span> TTrrcv();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//tTrrcv.setPK...(value);</span>
     * tTrrcv.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tTrrcv.setVersionNo(value);</span>
     * TTrrcvCB cb = <span style="color: #70226C">new</span> TTrrcvCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">tTrrcvBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(tTrrcv, cb, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param tTrrcv The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of TTrrcv. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(TTrrcv tTrrcv, TTrrcvCB cb, WritableOptionCall<TTrrcvCB, UpdateOption<TTrrcvCB>> opLambda) {
        return doQueryUpdate(tTrrcv, cb, createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * @param cb The condition-bean of TTrrcv. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(TTrrcvCB cb, WritableOptionCall<TTrrcvCB, DeleteOption<TTrrcvCB>> opLambda) {
        return doQueryDelete(cb, createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span>
     * tTrrcvBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span>
     * tTrrcvBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * tTrrcvBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * tTrrcvBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * tTrrcvBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * tTrrcvBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * tTrrcvBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span>
     * tTrrcvBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * tTrrcvBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * tTrrcvBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * tTrrcvBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * tTrrcvBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * tTrrcvBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span>
     * tTrrcvBhv.outideSql().removeBlockComment().selectList()
     * tTrrcvBhv.outideSql().removeLineComment().selectList()
     * tTrrcvBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlBasicExecutor<TTrrcvBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<TTrrcvBhv> facadeExecutor = doOutsideSql();
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
    protected Class<? extends TTrrcv> typeOfSelectedEntity() { return TTrrcv.class; }
    protected Class<TTrrcv> typeOfHandlingEntity() { return TTrrcv.class; }
    protected Class<TTrrcvCB> typeOfHandlingConditionBean() { return TTrrcvCB.class; }
}
