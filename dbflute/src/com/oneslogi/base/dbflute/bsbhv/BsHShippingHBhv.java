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
 * The behavior of H_SHIPPING_H as TABLE. <br>
 * <pre>
 * [primary key]
 *     SHIPPING_INST_H_ID
 *
 * [column]
 *     SHIPPING_INST_H_ID, HIST_DT, CLIENT_ID, CLIENT_CD, CLIENT_NM, CENTER_ID, CENTER_CD, CENTER_NM, PROCESS_TYPE_ID, DELIV_PLAN_DT, DELIV_DT, DELIV_TZ, SHIPPING_DT, WORK_DT, CLIENT_SHIPPING_NO, SHIPPING_SLIP_NO, SUPPLY_CUSTOMER_ID, SUPPLY_CUSTOMER_CD, SUPPLY_CUSTOMER_NM, DELIV_CUSTOMER_ID, DELIV_CUSTOMER_CD, DELIV_ZIP_CD, DELIV_ADDRESS1, DELIV_ADDRESS2, DELIV_ADDRESS3, DELIV_ADDRESS_SUPPLY, DELIV_CUSTOMER_NM, DELIV_TEL_NO, DELIVERY_COURSE_ID, DELIVERY_COURSE_CD, DELIVERY_COURSE_NM, CARRIER_ID, CARRIER_CD, CARRIER_NM, EMERGENCY_FLG, PICKING_WORK_MESSAGE, TOTAL_PRICE, TOTAL_TAX, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SHIPPING_INST_H_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     M_PROCESS_TYPE, B_CLASS_DTL(ByDelivTz)
 *
 * [referrer table]
 *     H_PACKING_H, H_SHIPPING_B
 *
 * [foreign property]
 *     mProcessType, bClassDtlByDelivTz, bClassDtlByEmergencyFlg
 *
 * [referrer property]
 *     hPackingHList, hShippingBList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsHShippingHBhv extends AbstractBehaviorWritable<HShippingH, HShippingHCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public HShippingHDbm asDBMeta() { return HShippingHDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "H_SHIPPING_H"; }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public HShippingHDbm getMyDBMeta() { return HShippingHDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public HShippingHCB newConditionBean() { return new HShippingHCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public HShippingH newMyEntity() { return new HShippingH(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public HShippingHCB newMyConditionBean() { return new HShippingHCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * HShippingHCB cb = <span style="color: #70226C">new</span> HShippingHCB();
     * cb.query().setFoo...(value);
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">hShippingHBhv</span>.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of HShippingH. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(HShippingHCB cb) {
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
     * HShippingHCB cb = <span style="color: #70226C">new</span> HShippingHCB();
     * cb.query().setFoo...(value);
     * HShippingH hShippingH = <span style="color: #0000C0">hShippingHBhv</span>.<span style="color: #DD4747">selectEntity</span>(cb);
     * <span style="color: #70226C">if</span> (hShippingH != <span style="color: #70226C">null</span>) { <span style="color: #3F7E5E">// null check</span>
     *     ... = hShippingH.get...();
     * } <span style="color: #70226C">else</span> {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of HShippingH. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public HShippingH selectEntity(HShippingHCB cb) {
        return facadeSelectEntity(cb);
    }

    protected HShippingH facadeSelectEntity(HShippingHCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends HShippingH> OptionalEntity<ENTITY> doSelectOptionalEntity(HShippingHCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * HShippingHCB cb = <span style="color: #70226C">new</span> HShippingHCB();
     * cb.query().set...;
     * HShippingH hShippingH = <span style="color: #0000C0">hShippingHBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = hShippingH.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of HShippingH. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public HShippingH selectEntityWithDeletedCheck(HShippingHCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param shippingInstHId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public HShippingH selectByPKValue(Long shippingInstHId) {
        return facadeSelectByPKValue(shippingInstHId);
    }

    protected HShippingH facadeSelectByPKValue(Long shippingInstHId) {
        return doSelectByPK(shippingInstHId, typeOfSelectedEntity());
    }

    protected <ENTITY extends HShippingH> ENTITY doSelectByPK(Long shippingInstHId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(shippingInstHId), tp);
    }

    protected <ENTITY extends HShippingH> OptionalEntity<ENTITY> doSelectOptionalByPK(Long shippingInstHId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(shippingInstHId, tp), shippingInstHId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param shippingInstHId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public HShippingH selectByPKValueWithDeletedCheck(Long shippingInstHId) {
        return doSelectByPKWithDeletedCheck(shippingInstHId, typeOfSelectedEntity());
    }

    protected <ENTITY extends HShippingH> ENTITY doSelectByPKWithDeletedCheck(Long shippingInstHId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(shippingInstHId), tp);
    }

    protected HShippingHCB xprepareCBAsPK(Long shippingInstHId) {
        assertObjectNotNull("shippingInstHId", shippingInstHId);
        return newConditionBean().acceptPK(shippingInstHId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * HShippingHCB cb = <span style="color: #70226C">new</span> HShippingHCB();
     * cb.query().set...;
     * cb.query().addOrderBy...;
     * ListResultBean&lt;HShippingH&gt; <span style="color: #553000">hShippingHList</span> = <span style="color: #0000C0">hShippingHBhv</span>.<span style="color: #CC4747">selectList</span>(cb);
     * <span style="color: #70226C">for</span> (HShippingH hShippingH : <span style="color: #553000">hShippingHList</span>) {
     *     ... = hShippingH.get...;
     * }
     * </pre>
     * @param cb The condition-bean of HShippingH. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<HShippingH> selectList(HShippingHCB cb) {
        return facadeSelectList(cb);
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * HShippingHCB cb = <span style="color: #70226C">new</span> HShippingHCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;HShippingH&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">hShippingHBhv</span>.<span style="color: #CC4747">selectPage</span>(cb);
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (HShippingH hShippingH : <span style="color: #553000">page</span>) {
     *     ... = hShippingH.get...();
     * }
     * </pre>
     * @param cb The condition-bean of HShippingH. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<HShippingH> selectPage(HShippingHCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * HShippingHCB cb = <span style="color: #70226C">new</span> HShippingHCB();
     * cb.query().set...
     * <span style="color: #0000C0">hShippingHBhv</span>.<span style="color: #CC4747">selectCursor</span>(cb, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cb The condition-bean of HShippingH. (NotNull)
     * @param entityRowHandler The handler of entity row of HShippingH. (NotNull)
     */
    public void selectCursor(HShippingHCB cb, EntityRowHandler<HShippingH> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">hShippingHBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<HShippingHCB, RESULT> selectScalar(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">hShippingHBhv</span>.<span style="color: #CC4747">scalarSelect</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<HShippingHCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param hShippingHList The entity list of HShippingH. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<HShippingH> hShippingHList, ReferrerLoaderHandler<LoaderOfHShippingH> loaderLambda) {
        xassLRArg(hShippingHList, loaderLambda);
        loaderLambda.handle(new LoaderOfHShippingH().ready(hShippingHList, _behaviorSelector));
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
     * @param hShippingH The entity of HShippingH. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(HShippingH hShippingH, ReferrerLoaderHandler<LoaderOfHShippingH> loaderLambda) {
        xassLRArg(hShippingH, loaderLambda);
        loaderLambda.handle(new LoaderOfHShippingH().ready(xnewLRAryLs(hShippingH), _behaviorSelector));
    }

    /**
     * Load referrer of HPackingHList by the set-upper of referrer. <br>
     * H_PACKING_H by SHIPPING_INST_H_ID, named 'HPackingHList'.
     * <pre>
     * <span style="color: #0000C0">hShippingHBhv</span>.<span style="color: #CC4747">loadHPackingHList</span>(<span style="color: #553000">hShippingHList</span>, <span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hCB</span>.setupSelect...
     *     <span style="color: #553000">hCB</span>.query().set...
     *     <span style="color: #553000">hCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (HShippingH hShippingH : <span style="color: #553000">hShippingHList</span>) {
     *     ... = hShippingH.<span style="color: #CC4747">getHPackingHList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setShippingInstHId_InScope(pkList);
     * cb.query().addOrderBy_ShippingInstHId_Asc();
     * </pre>
     * @param hShippingHList The entity list of HShippingH. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<HPackingH> loadHPackingHList(List<HShippingH> hShippingHList, ConditionBeanSetupper<HPackingHCB> refCBLambda) {
        xassLRArg(hShippingHList, refCBLambda);
        return doLoadHPackingHList(hShippingHList, new LoadReferrerOption<HPackingHCB, HPackingH>().xinit(refCBLambda));
    }

    /**
     * Load referrer of HPackingHList by the set-upper of referrer. <br>
     * H_PACKING_H by SHIPPING_INST_H_ID, named 'HPackingHList'.
     * <pre>
     * <span style="color: #0000C0">hShippingHBhv</span>.<span style="color: #CC4747">loadHPackingHList</span>(<span style="color: #553000">hShippingH</span>, <span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hCB</span>.setupSelect...
     *     <span style="color: #553000">hCB</span>.query().set...
     *     <span style="color: #553000">hCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">hShippingH</span>.<span style="color: #CC4747">getHPackingHList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setShippingInstHId_InScope(pkList);
     * cb.query().addOrderBy_ShippingInstHId_Asc();
     * </pre>
     * @param hShippingH The entity of HShippingH. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<HPackingH> loadHPackingHList(HShippingH hShippingH, ConditionBeanSetupper<HPackingHCB> refCBLambda) {
        xassLRArg(hShippingH, refCBLambda);
        return doLoadHPackingHList(xnewLRLs(hShippingH), new LoadReferrerOption<HPackingHCB, HPackingH>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param hShippingH The entity of HShippingH. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<HPackingH> loadHPackingHList(HShippingH hShippingH, LoadReferrerOption<HPackingHCB, HPackingH> loadReferrerOption) {
        xassLRArg(hShippingH, loadReferrerOption);
        return loadHPackingHList(xnewLRLs(hShippingH), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param hShippingHList The entity list of HShippingH. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<HPackingH> loadHPackingHList(List<HShippingH> hShippingHList, LoadReferrerOption<HPackingHCB, HPackingH> loadReferrerOption) {
        xassLRArg(hShippingHList, loadReferrerOption);
        if (hShippingHList.isEmpty()) { return (NestedReferrerListGateway<HPackingH>)EMPTY_NREF_LGWAY; }
        return doLoadHPackingHList(hShippingHList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<HPackingH> doLoadHPackingHList(List<HShippingH> hShippingHList, LoadReferrerOption<HPackingHCB, HPackingH> option) {
        return helpLoadReferrerInternally(hShippingHList, option, "hPackingHList");
    }

    /**
     * Load referrer of HShippingBList by the set-upper of referrer. <br>
     * H_SHIPPING_B by SHIPPING_INST_H_ID, named 'HShippingBList'.
     * <pre>
     * <span style="color: #0000C0">hShippingHBhv</span>.<span style="color: #CC4747">loadHShippingBList</span>(<span style="color: #553000">hShippingHList</span>, <span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bCB</span>.setupSelect...
     *     <span style="color: #553000">bCB</span>.query().set...
     *     <span style="color: #553000">bCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (HShippingH hShippingH : <span style="color: #553000">hShippingHList</span>) {
     *     ... = hShippingH.<span style="color: #CC4747">getHShippingBList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setShippingInstHId_InScope(pkList);
     * cb.query().addOrderBy_ShippingInstHId_Asc();
     * </pre>
     * @param hShippingHList The entity list of HShippingH. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<HShippingB> loadHShippingBList(List<HShippingH> hShippingHList, ConditionBeanSetupper<HShippingBCB> refCBLambda) {
        xassLRArg(hShippingHList, refCBLambda);
        return doLoadHShippingBList(hShippingHList, new LoadReferrerOption<HShippingBCB, HShippingB>().xinit(refCBLambda));
    }

    /**
     * Load referrer of HShippingBList by the set-upper of referrer. <br>
     * H_SHIPPING_B by SHIPPING_INST_H_ID, named 'HShippingBList'.
     * <pre>
     * <span style="color: #0000C0">hShippingHBhv</span>.<span style="color: #CC4747">loadHShippingBList</span>(<span style="color: #553000">hShippingH</span>, <span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bCB</span>.setupSelect...
     *     <span style="color: #553000">bCB</span>.query().set...
     *     <span style="color: #553000">bCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">hShippingH</span>.<span style="color: #CC4747">getHShippingBList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setShippingInstHId_InScope(pkList);
     * cb.query().addOrderBy_ShippingInstHId_Asc();
     * </pre>
     * @param hShippingH The entity of HShippingH. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<HShippingB> loadHShippingBList(HShippingH hShippingH, ConditionBeanSetupper<HShippingBCB> refCBLambda) {
        xassLRArg(hShippingH, refCBLambda);
        return doLoadHShippingBList(xnewLRLs(hShippingH), new LoadReferrerOption<HShippingBCB, HShippingB>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param hShippingH The entity of HShippingH. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<HShippingB> loadHShippingBList(HShippingH hShippingH, LoadReferrerOption<HShippingBCB, HShippingB> loadReferrerOption) {
        xassLRArg(hShippingH, loadReferrerOption);
        return loadHShippingBList(xnewLRLs(hShippingH), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param hShippingHList The entity list of HShippingH. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<HShippingB> loadHShippingBList(List<HShippingH> hShippingHList, LoadReferrerOption<HShippingBCB, HShippingB> loadReferrerOption) {
        xassLRArg(hShippingHList, loadReferrerOption);
        if (hShippingHList.isEmpty()) { return (NestedReferrerListGateway<HShippingB>)EMPTY_NREF_LGWAY; }
        return doLoadHShippingBList(hShippingHList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<HShippingB> doLoadHShippingBList(List<HShippingH> hShippingHList, LoadReferrerOption<HShippingBCB, HShippingB> option) {
        return helpLoadReferrerInternally(hShippingHList, option, "hShippingBList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'MProcessType'.
     * @param hShippingHList The list of hShippingH. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MProcessType> pulloutMProcessType(List<HShippingH> hShippingHList)
    { return helpPulloutInternally(hShippingHList, "mProcessType"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param hShippingHList The list of hShippingH. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByDelivTz(List<HShippingH> hShippingHList)
    { return helpPulloutInternally(hShippingHList, "bClassDtlByDelivTz"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param hShippingHList The list of hShippingH. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByEmergencyFlg(List<HShippingH> hShippingHList)
    { return helpPulloutInternally(hShippingHList, "bClassDtlByEmergencyFlg"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key shippingInstHId.
     * @param hShippingHList The list of hShippingH. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractShippingInstHIdList(List<HShippingH> hShippingHList)
    { return helpExtractListInternally(hShippingHList, "shippingInstHId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * HShippingH hShippingH = <span style="color: #70226C">new</span> HShippingH();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * hShippingH.setFoo...(value);
     * hShippingH.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//hShippingH.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//hShippingH.set...;</span>
     * <span style="color: #0000C0">hShippingHBhv</span>.<span style="color: #CC4747">insert</span>(hShippingH);
     * ... = hShippingH.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param hShippingH The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(HShippingH hShippingH) {
        doInsert(hShippingH, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * HShippingH hShippingH = <span style="color: #70226C">new</span> HShippingH();
     * hShippingH.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * hShippingH.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//hShippingH.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//hShippingH.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * hShippingH.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">hShippingHBhv</span>.<span style="color: #CC4747">update</span>(hShippingH);
     * </pre>
     * @param hShippingH The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(HShippingH hShippingH) {
        doUpdate(hShippingH, null);
    }

    /**
     * Update the entity non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * HShippingH hShippingH = <span style="color: #70226C">new</span> HShippingH();
     * hShippingH.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * hShippingH.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//hShippingH.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//hShippingH.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//hShippingH.setVersionNo(value);</span>
     * <span style="color: #0000C0">hShippingHBhv</span>.<span style="color: #CC4747">updateNonstrict</span>(hShippingH);
     * </pre>
     * @param hShippingH The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(HShippingH hShippingH) {
        doUpdateNonstrict(hShippingH, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param hShippingH The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(HShippingH hShippingH) {
        doInsertOrUpdate(hShippingH, null, null);
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param hShippingH The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(HShippingH hShippingH) {
        doInsertOrUpdateNonstrict(hShippingH, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * HShippingH hShippingH = <span style="color: #70226C">new</span> HShippingH();
     * hShippingH.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * hShippingH.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">hShippingHBhv</span>.<span style="color: #CC4747">delete</span>(hShippingH);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param hShippingH The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(HShippingH hShippingH) {
        doDelete(hShippingH, null);
    }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl} <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * HShippingH hShippingH = <span style="color: #70226C">new</span> HShippingH();
     * hShippingH.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//hShippingH.setVersionNo(value);</span>
     * <span style="color: #0000C0">hShippingHBhv</span>.<span style="color: #CC4747">deleteNonstrict</span>(hShippingH);
     * </pre>
     * @param hShippingH The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(HShippingH hShippingH) {
        doDeleteNonstrict(hShippingH, null);
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * HShippingH hShippingH = <span style="color: #70226C">new</span> HShippingH();
     * hShippingH.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//hShippingH.setVersionNo(value);</span>
     * <span style="color: #0000C0">hShippingHBhv</span>.<span style="color: #CC4747">deleteNonstrictIgnoreDeleted</span>(hShippingH);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param hShippingH The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(HShippingH hShippingH) {
        doDeleteNonstrictIgnoreDeleted(hShippingH, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(HShippingH et, final DeleteOption<HShippingHCB> op) {
        assertObjectNotNull("hShippingH", et); prepareDeleteOption(op); helpDeleteNonstrictIgnoreDeletedInternally(et, op);
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
     *     HShippingH hShippingH = <span style="color: #70226C">new</span> HShippingH();
     *     hShippingH.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         hShippingH.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     hShippingHList.add(hShippingH);
     * }
     * <span style="color: #0000C0">hShippingHBhv</span>.<span style="color: #CC4747">batchInsert</span>(hShippingHList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param hShippingHList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<HShippingH> hShippingHList) {
        return doBatchInsert(hShippingHList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     HShippingH hShippingH = <span style="color: #70226C">new</span> HShippingH();
     *     hShippingH.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         hShippingH.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         hShippingH.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//hShippingH.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     hShippingHList.add(hShippingH);
     * }
     * <span style="color: #0000C0">hShippingHBhv</span>.<span style="color: #CC4747">batchUpdate</span>(hShippingHList);
     * </pre>
     * @param hShippingHList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<HShippingH> hShippingHList) {
        return doBatchUpdate(hShippingHList, null);
    }

    /**
     * Batch-update the entity list specified-only. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * hShippingHBhv.<span style="color: #CC4747">batchUpdate</span>(hShippingHList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">hShippingHBhv</span>.<span style="color: #CC4747">batchUpdate</span>(hShippingHList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param hShippingHList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<HShippingH> hShippingHList, SpecifyQuery<HShippingHCB> colCBLambda) {
        return doBatchUpdate(hShippingHList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * <span style="color: #70226C">for</span> (... : ...) {
     *     HShippingH hShippingH = <span style="color: #70226C">new</span> HShippingH();
     *     hShippingH.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         hShippingH.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         hShippingH.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//hShippingH.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     hShippingHList.add(hShippingH);
     * }
     * <span style="color: #0000C0">hShippingHBhv</span>.<span style="color: #CC4747">batchUpdate</span>(hShippingHList);
     * </pre>
     * @param hShippingHList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<HShippingH> hShippingHList) {
        return doBatchUpdateNonstrict(hShippingHList, null);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * <span style="color: #0000C0">hShippingHBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(hShippingHList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">hShippingHBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(hShippingHList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).</p>
     * @param hShippingHList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<HShippingH> hShippingHList, SpecifyQuery<HShippingHCB> colCBLambda) {
        return doBatchUpdateNonstrict(hShippingHList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param hShippingHList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<HShippingH> hShippingHList) {
        return doBatchDelete(hShippingHList, null);
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param hShippingHList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<HShippingH> hShippingHList) {
        return doBatchDeleteNonstrict(hShippingHList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">hShippingHBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;HShippingH, HShippingHCB&gt;() {
     *     public ConditionBean setup(HShippingH entity, HShippingHCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<HShippingH, HShippingHCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * HShippingH hShippingH = <span style="color: #70226C">new</span> HShippingH();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//hShippingH.setPK...(value);</span>
     * hShippingH.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//hShippingH.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//hShippingH.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//hShippingH.setVersionNo(value);</span>
     * HShippingHCB cb = <span style="color: #70226C">new</span> HShippingHCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">hShippingHBhv</span>.<span style="color: #CC4747">queryUpdate</span>(hShippingH, cb);
     * </pre>
     * @param hShippingH The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of HShippingH. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(HShippingH hShippingH, HShippingHCB cb) {
        return doQueryUpdate(hShippingH, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * HShippingHCB cb = new HShippingHCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">hShippingHBhv</span>.<span style="color: #CC4747">queryDelete</span>(hShippingH, cb);
     * </pre>
     * @param cb The condition-bean of HShippingH. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(HShippingHCB cb) {
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
     * HShippingH hShippingH = <span style="color: #70226C">new</span> HShippingH();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * hShippingH.setFoo...(value);
     * hShippingH.setBar...(value);
     * <span style="color: #0000C0">hShippingHBhv</span>.<span style="color: #CC4747">varyingInsert</span>(hShippingH, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = hShippingH.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param hShippingH The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(HShippingH hShippingH, WritableOptionCall<HShippingHCB, InsertOption<HShippingHCB>> opLambda) {
        doInsert(hShippingH, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * HShippingH hShippingH = <span style="color: #70226C">new</span> HShippingH();
     * hShippingH.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * hShippingH.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * hShippingH.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">hShippingHBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(hShippingH, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param hShippingH The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(HShippingH hShippingH, WritableOptionCall<HShippingHCB, UpdateOption<HShippingHCB>> opLambda) {
        doUpdate(hShippingH, createUpdateOption(opLambda));
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * HShippingH hShippingH = <span style="color: #70226C">new</span> HShippingH();
     * hShippingH.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * hShippingH.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//hShippingH.setVersionNo(value);</span>
     * <span style="color: #0000C0">hShippingHBhv</span>.<span style="color: #CC4747">varyingUpdateNonstrict</span>(hShippingH, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param hShippingH The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(HShippingH hShippingH, WritableOptionCall<HShippingHCB, UpdateOption<HShippingHCB>> opLambda) {
        doUpdateNonstrict(hShippingH, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param hShippingH The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(HShippingH hShippingH, WritableOptionCall<HShippingHCB, InsertOption<HShippingHCB>> insertOpLambda, WritableOptionCall<HShippingHCB, UpdateOption<HShippingHCB>> updateOpLambda) {
        doInsertOrUpdate(hShippingH, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param hShippingH The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(HShippingH hShippingH, WritableOptionCall<HShippingHCB, InsertOption<HShippingHCB>> insertOpLambda, WritableOptionCall<HShippingHCB, UpdateOption<HShippingHCB>> updateOpLambda) {
        doInsertOrUpdateNonstrict(hShippingH, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param hShippingH The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(HShippingH hShippingH, WritableOptionCall<HShippingHCB, DeleteOption<HShippingHCB>> opLambda) {
        doDelete(hShippingH, createDeleteOption(opLambda));
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as deleteNonstrict(entity).
     * @param hShippingH The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(HShippingH hShippingH, WritableOptionCall<HShippingHCB, DeleteOption<HShippingHCB>> opLambda) {
        doDeleteNonstrict(hShippingH, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param hShippingHList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<HShippingH> hShippingHList, WritableOptionCall<HShippingHCB, InsertOption<HShippingHCB>> opLambda) {
        return doBatchInsert(hShippingHList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param hShippingHList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<HShippingH> hShippingHList, WritableOptionCall<HShippingHCB, UpdateOption<HShippingHCB>> opLambda) {
        return doBatchUpdate(hShippingHList, createUpdateOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param hShippingHList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<HShippingH> hShippingHList, WritableOptionCall<HShippingHCB, UpdateOption<HShippingHCB>> opLambda) {
        return doBatchUpdateNonstrict(hShippingHList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param hShippingHList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<HShippingH> hShippingHList, WritableOptionCall<HShippingHCB, DeleteOption<HShippingHCB>> opLambda) {
        return doBatchDelete(hShippingHList, createDeleteOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param hShippingHList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<HShippingH> hShippingHList, WritableOptionCall<HShippingHCB, DeleteOption<HShippingHCB>> opLambda) {
        return doBatchDeleteNonstrict(hShippingHList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<HShippingH, HShippingHCB> manyArgLambda, WritableOptionCall<HShippingHCB, InsertOption<HShippingHCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * HShippingH hShippingH = <span style="color: #70226C">new</span> HShippingH();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//hShippingH.setPK...(value);</span>
     * hShippingH.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//hShippingH.setVersionNo(value);</span>
     * HShippingHCB cb = <span style="color: #70226C">new</span> HShippingHCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">hShippingHBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(hShippingH, cb, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param hShippingH The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of HShippingH. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(HShippingH hShippingH, HShippingHCB cb, WritableOptionCall<HShippingHCB, UpdateOption<HShippingHCB>> opLambda) {
        return doQueryUpdate(hShippingH, cb, createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * @param cb The condition-bean of HShippingH. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(HShippingHCB cb, WritableOptionCall<HShippingHCB, DeleteOption<HShippingHCB>> opLambda) {
        return doQueryDelete(cb, createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span>
     * hShippingHBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span>
     * hShippingHBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * hShippingHBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * hShippingHBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * hShippingHBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * hShippingHBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * hShippingHBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span>
     * hShippingHBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * hShippingHBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * hShippingHBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * hShippingHBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * hShippingHBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * hShippingHBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span>
     * hShippingHBhv.outideSql().removeBlockComment().selectList()
     * hShippingHBhv.outideSql().removeLineComment().selectList()
     * hShippingHBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlBasicExecutor<HShippingHBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<HShippingHBhv> facadeExecutor = doOutsideSql();
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
    protected Class<? extends HShippingH> typeOfSelectedEntity() { return HShippingH.class; }
    protected Class<HShippingH> typeOfHandlingEntity() { return HShippingH.class; }
    protected Class<HShippingHCB> typeOfHandlingConditionBean() { return HShippingHCB.class; }
}
