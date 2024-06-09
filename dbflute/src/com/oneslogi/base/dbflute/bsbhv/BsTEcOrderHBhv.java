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
 * The behavior of T_EC_ORDER_H as TABLE. <br>
 * <pre>
 * [primary key]
 *     EC_ORDER_H_ID
 *
 * [column]
 *     EC_ORDER_H_ID, CLIENT_ID, CENTER_ID, IMPORT_DT, ORDER_NO, PRIORITY_FLG, ORDER_DT, ORDER_TIME, DELIV_DT, DELIV_TZ, COMMENT1, COMMENT2, GIFT_FLG, NOSHI, ORDER_ZIP_CD, ORDER_ADDRESS1, ORDER_ADDRESS2, ORDER_ADDRESS3, ORDER_CUSTOMER_NM, ORDER_CUSTOMER_NM_KANA, ORDER_TEL_NO, DELIV_MATCH_FLG, MERGE_ID, MERGE_STATUS, DELIV_ZIP_CD, DELIV_ADDRESS1, DELIV_ADDRESS2, DELIV_ADDRESS3, INVOICE_DELIV_ADDRESS1, INVOICE_DELIV_ADDRESS2, INVOICE_DELIV_ADDRESS3, DELIV_CUSTOMER_NM, DELIV_CUSTOMER_NM_KANA, DELIV_TEL_NO, DELIV_METHOD, DELIV_TYPE, DELIV_COMPANY, PAYMENT_METHOD, CARD_TYPE, TOTAL, TAX, CARRIAGE, COD, TOTAL_AMOUNT, COUPON_DISCOUNT, POINT_DISCOUNT, OTHER_DISCOUNT, AMOUNT_BILLED, MERGE_TOTAL, MERGE_CARRIAGE, MERGE_COD, MERGE_TAX, MERGE_AMOUNT_BILLED, MERGE_TOTAL_AMOUNT, MERGE_COUPON_DISCOUNT, MERGE_POINT_DISCOUNT, MERGE_OTHER_DISCOUNT, PACKING_QTY, SLIP_ITEM_NM1, SLIP_ITEM_NM2, SLIP_ITEM_NM3, SLIP_ITEM_NM4, SLIP_ITEM_NM5, SLIP_ITEM_CD1, SLIP_ITEM_CD2, FREIGHT_HANDLING1, FREIGHT_HANDLING2, ARTICLE, RECEIVE_ID, ERROR_FLG, ERROR_MESSAGE_CD, IMPORT_FLG, IMPORT_TYPE_ID, SHIPPING_INST_H_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     EC_ORDER_H_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     M_CENTER, M_CLIENT, M_IMPORT_TYPE, T_SHIPPING_INST_H, B_CLASS_DTL(ByDelivMatchFlg), T_EC_ORDER_R(AsOne)
 *
 * [referrer table]
 *     T_EC_ORDER_B, T_EC_ORDER_R
 *
 * [foreign property]
 *     mCenter, mClient, mImportType, tShippingInstH, bClassDtlByDelivMatchFlg, bClassDtlByErrorFlg, bClassDtlByGiftFlg, bClassDtlByImportFlg, bClassDtlByPriorityFlg, tEcOrderRAsOne
 *
 * [referrer property]
 *     tEcOrderBList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsTEcOrderHBhv extends AbstractBehaviorWritable<TEcOrderH, TEcOrderHCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public TEcOrderHDbm asDBMeta() { return TEcOrderHDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "T_EC_ORDER_H"; }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public TEcOrderHDbm getMyDBMeta() { return TEcOrderHDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public TEcOrderHCB newConditionBean() { return new TEcOrderHCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public TEcOrderH newMyEntity() { return new TEcOrderH(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public TEcOrderHCB newMyConditionBean() { return new TEcOrderHCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * TEcOrderHCB cb = <span style="color: #70226C">new</span> TEcOrderHCB();
     * cb.query().setFoo...(value);
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">tEcOrderHBhv</span>.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of TEcOrderH. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(TEcOrderHCB cb) {
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
     * TEcOrderHCB cb = <span style="color: #70226C">new</span> TEcOrderHCB();
     * cb.query().setFoo...(value);
     * TEcOrderH tEcOrderH = <span style="color: #0000C0">tEcOrderHBhv</span>.<span style="color: #DD4747">selectEntity</span>(cb);
     * <span style="color: #70226C">if</span> (tEcOrderH != <span style="color: #70226C">null</span>) { <span style="color: #3F7E5E">// null check</span>
     *     ... = tEcOrderH.get...();
     * } <span style="color: #70226C">else</span> {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of TEcOrderH. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TEcOrderH selectEntity(TEcOrderHCB cb) {
        return facadeSelectEntity(cb);
    }

    protected TEcOrderH facadeSelectEntity(TEcOrderHCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends TEcOrderH> OptionalEntity<ENTITY> doSelectOptionalEntity(TEcOrderHCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * TEcOrderHCB cb = <span style="color: #70226C">new</span> TEcOrderHCB();
     * cb.query().set...;
     * TEcOrderH tEcOrderH = <span style="color: #0000C0">tEcOrderHBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = tEcOrderH.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of TEcOrderH. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TEcOrderH selectEntityWithDeletedCheck(TEcOrderHCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param ecOrderHId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TEcOrderH selectByPKValue(Long ecOrderHId) {
        return facadeSelectByPKValue(ecOrderHId);
    }

    protected TEcOrderH facadeSelectByPKValue(Long ecOrderHId) {
        return doSelectByPK(ecOrderHId, typeOfSelectedEntity());
    }

    protected <ENTITY extends TEcOrderH> ENTITY doSelectByPK(Long ecOrderHId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(ecOrderHId), tp);
    }

    protected <ENTITY extends TEcOrderH> OptionalEntity<ENTITY> doSelectOptionalByPK(Long ecOrderHId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(ecOrderHId, tp), ecOrderHId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param ecOrderHId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TEcOrderH selectByPKValueWithDeletedCheck(Long ecOrderHId) {
        return doSelectByPKWithDeletedCheck(ecOrderHId, typeOfSelectedEntity());
    }

    protected <ENTITY extends TEcOrderH> ENTITY doSelectByPKWithDeletedCheck(Long ecOrderHId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(ecOrderHId), tp);
    }

    protected TEcOrderHCB xprepareCBAsPK(Long ecOrderHId) {
        assertObjectNotNull("ecOrderHId", ecOrderHId);
        return newConditionBean().acceptPK(ecOrderHId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * TEcOrderHCB cb = <span style="color: #70226C">new</span> TEcOrderHCB();
     * cb.query().set...;
     * cb.query().addOrderBy...;
     * ListResultBean&lt;TEcOrderH&gt; <span style="color: #553000">tEcOrderHList</span> = <span style="color: #0000C0">tEcOrderHBhv</span>.<span style="color: #CC4747">selectList</span>(cb);
     * <span style="color: #70226C">for</span> (TEcOrderH tEcOrderH : <span style="color: #553000">tEcOrderHList</span>) {
     *     ... = tEcOrderH.get...;
     * }
     * </pre>
     * @param cb The condition-bean of TEcOrderH. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<TEcOrderH> selectList(TEcOrderHCB cb) {
        return facadeSelectList(cb);
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * TEcOrderHCB cb = <span style="color: #70226C">new</span> TEcOrderHCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;TEcOrderH&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">tEcOrderHBhv</span>.<span style="color: #CC4747">selectPage</span>(cb);
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (TEcOrderH tEcOrderH : <span style="color: #553000">page</span>) {
     *     ... = tEcOrderH.get...();
     * }
     * </pre>
     * @param cb The condition-bean of TEcOrderH. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<TEcOrderH> selectPage(TEcOrderHCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * TEcOrderHCB cb = <span style="color: #70226C">new</span> TEcOrderHCB();
     * cb.query().set...
     * <span style="color: #0000C0">tEcOrderHBhv</span>.<span style="color: #CC4747">selectCursor</span>(cb, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cb The condition-bean of TEcOrderH. (NotNull)
     * @param entityRowHandler The handler of entity row of TEcOrderH. (NotNull)
     */
    public void selectCursor(TEcOrderHCB cb, EntityRowHandler<TEcOrderH> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">tEcOrderHBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<TEcOrderHCB, RESULT> selectScalar(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">tEcOrderHBhv</span>.<span style="color: #CC4747">scalarSelect</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<TEcOrderHCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param tEcOrderHList The entity list of TEcOrderH. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<TEcOrderH> tEcOrderHList, ReferrerLoaderHandler<LoaderOfTEcOrderH> loaderLambda) {
        xassLRArg(tEcOrderHList, loaderLambda);
        loaderLambda.handle(new LoaderOfTEcOrderH().ready(tEcOrderHList, _behaviorSelector));
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
     * @param tEcOrderH The entity of TEcOrderH. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(TEcOrderH tEcOrderH, ReferrerLoaderHandler<LoaderOfTEcOrderH> loaderLambda) {
        xassLRArg(tEcOrderH, loaderLambda);
        loaderLambda.handle(new LoaderOfTEcOrderH().ready(xnewLRAryLs(tEcOrderH), _behaviorSelector));
    }

    /**
     * Load referrer of TEcOrderBList by the set-upper of referrer. <br>
     * T_EC_ORDER_B by EC_ORDER_H_ID, named 'TEcOrderBList'.
     * <pre>
     * <span style="color: #0000C0">tEcOrderHBhv</span>.<span style="color: #CC4747">loadTEcOrderBList</span>(<span style="color: #553000">tEcOrderHList</span>, <span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bCB</span>.setupSelect...
     *     <span style="color: #553000">bCB</span>.query().set...
     *     <span style="color: #553000">bCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (TEcOrderH tEcOrderH : <span style="color: #553000">tEcOrderHList</span>) {
     *     ... = tEcOrderH.<span style="color: #CC4747">getTEcOrderBList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setEcOrderHId_InScope(pkList);
     * cb.query().addOrderBy_EcOrderHId_Asc();
     * </pre>
     * @param tEcOrderHList The entity list of TEcOrderH. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TEcOrderB> loadTEcOrderBList(List<TEcOrderH> tEcOrderHList, ConditionBeanSetupper<TEcOrderBCB> refCBLambda) {
        xassLRArg(tEcOrderHList, refCBLambda);
        return doLoadTEcOrderBList(tEcOrderHList, new LoadReferrerOption<TEcOrderBCB, TEcOrderB>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TEcOrderBList by the set-upper of referrer. <br>
     * T_EC_ORDER_B by EC_ORDER_H_ID, named 'TEcOrderBList'.
     * <pre>
     * <span style="color: #0000C0">tEcOrderHBhv</span>.<span style="color: #CC4747">loadTEcOrderBList</span>(<span style="color: #553000">tEcOrderH</span>, <span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bCB</span>.setupSelect...
     *     <span style="color: #553000">bCB</span>.query().set...
     *     <span style="color: #553000">bCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">tEcOrderH</span>.<span style="color: #CC4747">getTEcOrderBList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setEcOrderHId_InScope(pkList);
     * cb.query().addOrderBy_EcOrderHId_Asc();
     * </pre>
     * @param tEcOrderH The entity of TEcOrderH. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TEcOrderB> loadTEcOrderBList(TEcOrderH tEcOrderH, ConditionBeanSetupper<TEcOrderBCB> refCBLambda) {
        xassLRArg(tEcOrderH, refCBLambda);
        return doLoadTEcOrderBList(xnewLRLs(tEcOrderH), new LoadReferrerOption<TEcOrderBCB, TEcOrderB>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param tEcOrderH The entity of TEcOrderH. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TEcOrderB> loadTEcOrderBList(TEcOrderH tEcOrderH, LoadReferrerOption<TEcOrderBCB, TEcOrderB> loadReferrerOption) {
        xassLRArg(tEcOrderH, loadReferrerOption);
        return loadTEcOrderBList(xnewLRLs(tEcOrderH), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param tEcOrderHList The entity list of TEcOrderH. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TEcOrderB> loadTEcOrderBList(List<TEcOrderH> tEcOrderHList, LoadReferrerOption<TEcOrderBCB, TEcOrderB> loadReferrerOption) {
        xassLRArg(tEcOrderHList, loadReferrerOption);
        if (tEcOrderHList.isEmpty()) { return (NestedReferrerListGateway<TEcOrderB>)EMPTY_NREF_LGWAY; }
        return doLoadTEcOrderBList(tEcOrderHList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TEcOrderB> doLoadTEcOrderBList(List<TEcOrderH> tEcOrderHList, LoadReferrerOption<TEcOrderBCB, TEcOrderB> option) {
        return helpLoadReferrerInternally(tEcOrderHList, option, "tEcOrderBList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'MCenter'.
     * @param tEcOrderHList The list of tEcOrderH. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MCenter> pulloutMCenter(List<TEcOrderH> tEcOrderHList)
    { return helpPulloutInternally(tEcOrderHList, "mCenter"); }

    /**
     * Pull out the list of foreign table 'MClient'.
     * @param tEcOrderHList The list of tEcOrderH. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MClient> pulloutMClient(List<TEcOrderH> tEcOrderHList)
    { return helpPulloutInternally(tEcOrderHList, "mClient"); }

    /**
     * Pull out the list of foreign table 'MImportType'.
     * @param tEcOrderHList The list of tEcOrderH. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MImportType> pulloutMImportType(List<TEcOrderH> tEcOrderHList)
    { return helpPulloutInternally(tEcOrderHList, "mImportType"); }

    /**
     * Pull out the list of foreign table 'TShippingInstH'.
     * @param tEcOrderHList The list of tEcOrderH. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<TShippingInstH> pulloutTShippingInstH(List<TEcOrderH> tEcOrderHList)
    { return helpPulloutInternally(tEcOrderHList, "tShippingInstH"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param tEcOrderHList The list of tEcOrderH. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByDelivMatchFlg(List<TEcOrderH> tEcOrderHList)
    { return helpPulloutInternally(tEcOrderHList, "bClassDtlByDelivMatchFlg"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param tEcOrderHList The list of tEcOrderH. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByErrorFlg(List<TEcOrderH> tEcOrderHList)
    { return helpPulloutInternally(tEcOrderHList, "bClassDtlByErrorFlg"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param tEcOrderHList The list of tEcOrderH. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByGiftFlg(List<TEcOrderH> tEcOrderHList)
    { return helpPulloutInternally(tEcOrderHList, "bClassDtlByGiftFlg"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param tEcOrderHList The list of tEcOrderH. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByImportFlg(List<TEcOrderH> tEcOrderHList)
    { return helpPulloutInternally(tEcOrderHList, "bClassDtlByImportFlg"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param tEcOrderHList The list of tEcOrderH. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByPriorityFlg(List<TEcOrderH> tEcOrderHList)
    { return helpPulloutInternally(tEcOrderHList, "bClassDtlByPriorityFlg"); }

    /**
     * Pull out the list of referrer-as-one table 'TEcOrderR'.
     * @param tEcOrderHList The list of tEcOrderH. (NotNull, EmptyAllowed)
     * @return The list of referrer-as-one table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<TEcOrderR> pulloutTEcOrderRAsOne(List<TEcOrderH> tEcOrderHList)
    { return helpPulloutInternally(tEcOrderHList, "tEcOrderRAsOne"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key ecOrderHId.
     * @param tEcOrderHList The list of tEcOrderH. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractEcOrderHIdList(List<TEcOrderH> tEcOrderHList)
    { return helpExtractListInternally(tEcOrderHList, "ecOrderHId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * TEcOrderH tEcOrderH = <span style="color: #70226C">new</span> TEcOrderH();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * tEcOrderH.setFoo...(value);
     * tEcOrderH.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tEcOrderH.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tEcOrderH.set...;</span>
     * <span style="color: #0000C0">tEcOrderHBhv</span>.<span style="color: #CC4747">insert</span>(tEcOrderH);
     * ... = tEcOrderH.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param tEcOrderH The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(TEcOrderH tEcOrderH) {
        doInsert(tEcOrderH, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * TEcOrderH tEcOrderH = <span style="color: #70226C">new</span> TEcOrderH();
     * tEcOrderH.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tEcOrderH.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tEcOrderH.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tEcOrderH.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * tEcOrderH.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">tEcOrderHBhv</span>.<span style="color: #CC4747">update</span>(tEcOrderH);
     * </pre>
     * @param tEcOrderH The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(TEcOrderH tEcOrderH) {
        doUpdate(tEcOrderH, null);
    }

    /**
     * Update the entity non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * TEcOrderH tEcOrderH = <span style="color: #70226C">new</span> TEcOrderH();
     * tEcOrderH.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tEcOrderH.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tEcOrderH.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tEcOrderH.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tEcOrderH.setVersionNo(value);</span>
     * <span style="color: #0000C0">tEcOrderHBhv</span>.<span style="color: #CC4747">updateNonstrict</span>(tEcOrderH);
     * </pre>
     * @param tEcOrderH The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(TEcOrderH tEcOrderH) {
        doUpdateNonstrict(tEcOrderH, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param tEcOrderH The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(TEcOrderH tEcOrderH) {
        doInsertOrUpdate(tEcOrderH, null, null);
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param tEcOrderH The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(TEcOrderH tEcOrderH) {
        doInsertOrUpdateNonstrict(tEcOrderH, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * TEcOrderH tEcOrderH = <span style="color: #70226C">new</span> TEcOrderH();
     * tEcOrderH.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * tEcOrderH.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">tEcOrderHBhv</span>.<span style="color: #CC4747">delete</span>(tEcOrderH);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param tEcOrderH The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(TEcOrderH tEcOrderH) {
        doDelete(tEcOrderH, null);
    }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl} <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * TEcOrderH tEcOrderH = <span style="color: #70226C">new</span> TEcOrderH();
     * tEcOrderH.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tEcOrderH.setVersionNo(value);</span>
     * <span style="color: #0000C0">tEcOrderHBhv</span>.<span style="color: #CC4747">deleteNonstrict</span>(tEcOrderH);
     * </pre>
     * @param tEcOrderH The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(TEcOrderH tEcOrderH) {
        doDeleteNonstrict(tEcOrderH, null);
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * TEcOrderH tEcOrderH = <span style="color: #70226C">new</span> TEcOrderH();
     * tEcOrderH.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tEcOrderH.setVersionNo(value);</span>
     * <span style="color: #0000C0">tEcOrderHBhv</span>.<span style="color: #CC4747">deleteNonstrictIgnoreDeleted</span>(tEcOrderH);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param tEcOrderH The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(TEcOrderH tEcOrderH) {
        doDeleteNonstrictIgnoreDeleted(tEcOrderH, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(TEcOrderH et, final DeleteOption<TEcOrderHCB> op) {
        assertObjectNotNull("tEcOrderH", et); prepareDeleteOption(op); helpDeleteNonstrictIgnoreDeletedInternally(et, op);
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
     *     TEcOrderH tEcOrderH = <span style="color: #70226C">new</span> TEcOrderH();
     *     tEcOrderH.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         tEcOrderH.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     tEcOrderHList.add(tEcOrderH);
     * }
     * <span style="color: #0000C0">tEcOrderHBhv</span>.<span style="color: #CC4747">batchInsert</span>(tEcOrderHList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param tEcOrderHList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<TEcOrderH> tEcOrderHList) {
        return doBatchInsert(tEcOrderHList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     TEcOrderH tEcOrderH = <span style="color: #70226C">new</span> TEcOrderH();
     *     tEcOrderH.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         tEcOrderH.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         tEcOrderH.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//tEcOrderH.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     tEcOrderHList.add(tEcOrderH);
     * }
     * <span style="color: #0000C0">tEcOrderHBhv</span>.<span style="color: #CC4747">batchUpdate</span>(tEcOrderHList);
     * </pre>
     * @param tEcOrderHList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<TEcOrderH> tEcOrderHList) {
        return doBatchUpdate(tEcOrderHList, null);
    }

    /**
     * Batch-update the entity list specified-only. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * tEcOrderHBhv.<span style="color: #CC4747">batchUpdate</span>(tEcOrderHList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">tEcOrderHBhv</span>.<span style="color: #CC4747">batchUpdate</span>(tEcOrderHList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param tEcOrderHList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<TEcOrderH> tEcOrderHList, SpecifyQuery<TEcOrderHCB> colCBLambda) {
        return doBatchUpdate(tEcOrderHList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * <span style="color: #70226C">for</span> (... : ...) {
     *     TEcOrderH tEcOrderH = <span style="color: #70226C">new</span> TEcOrderH();
     *     tEcOrderH.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         tEcOrderH.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         tEcOrderH.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//tEcOrderH.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     tEcOrderHList.add(tEcOrderH);
     * }
     * <span style="color: #0000C0">tEcOrderHBhv</span>.<span style="color: #CC4747">batchUpdate</span>(tEcOrderHList);
     * </pre>
     * @param tEcOrderHList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<TEcOrderH> tEcOrderHList) {
        return doBatchUpdateNonstrict(tEcOrderHList, null);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * <span style="color: #0000C0">tEcOrderHBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(tEcOrderHList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">tEcOrderHBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(tEcOrderHList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).</p>
     * @param tEcOrderHList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<TEcOrderH> tEcOrderHList, SpecifyQuery<TEcOrderHCB> colCBLambda) {
        return doBatchUpdateNonstrict(tEcOrderHList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param tEcOrderHList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<TEcOrderH> tEcOrderHList) {
        return doBatchDelete(tEcOrderHList, null);
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param tEcOrderHList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<TEcOrderH> tEcOrderHList) {
        return doBatchDeleteNonstrict(tEcOrderHList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">tEcOrderHBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;TEcOrderH, TEcOrderHCB&gt;() {
     *     public ConditionBean setup(TEcOrderH entity, TEcOrderHCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<TEcOrderH, TEcOrderHCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * TEcOrderH tEcOrderH = <span style="color: #70226C">new</span> TEcOrderH();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//tEcOrderH.setPK...(value);</span>
     * tEcOrderH.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tEcOrderH.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tEcOrderH.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tEcOrderH.setVersionNo(value);</span>
     * TEcOrderHCB cb = <span style="color: #70226C">new</span> TEcOrderHCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">tEcOrderHBhv</span>.<span style="color: #CC4747">queryUpdate</span>(tEcOrderH, cb);
     * </pre>
     * @param tEcOrderH The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of TEcOrderH. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(TEcOrderH tEcOrderH, TEcOrderHCB cb) {
        return doQueryUpdate(tEcOrderH, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * TEcOrderHCB cb = new TEcOrderHCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">tEcOrderHBhv</span>.<span style="color: #CC4747">queryDelete</span>(tEcOrderH, cb);
     * </pre>
     * @param cb The condition-bean of TEcOrderH. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(TEcOrderHCB cb) {
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
     * TEcOrderH tEcOrderH = <span style="color: #70226C">new</span> TEcOrderH();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * tEcOrderH.setFoo...(value);
     * tEcOrderH.setBar...(value);
     * <span style="color: #0000C0">tEcOrderHBhv</span>.<span style="color: #CC4747">varyingInsert</span>(tEcOrderH, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = tEcOrderH.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param tEcOrderH The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(TEcOrderH tEcOrderH, WritableOptionCall<TEcOrderHCB, InsertOption<TEcOrderHCB>> opLambda) {
        doInsert(tEcOrderH, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * TEcOrderH tEcOrderH = <span style="color: #70226C">new</span> TEcOrderH();
     * tEcOrderH.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tEcOrderH.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * tEcOrderH.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">tEcOrderHBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(tEcOrderH, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param tEcOrderH The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(TEcOrderH tEcOrderH, WritableOptionCall<TEcOrderHCB, UpdateOption<TEcOrderHCB>> opLambda) {
        doUpdate(tEcOrderH, createUpdateOption(opLambda));
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * TEcOrderH tEcOrderH = <span style="color: #70226C">new</span> TEcOrderH();
     * tEcOrderH.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tEcOrderH.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tEcOrderH.setVersionNo(value);</span>
     * <span style="color: #0000C0">tEcOrderHBhv</span>.<span style="color: #CC4747">varyingUpdateNonstrict</span>(tEcOrderH, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param tEcOrderH The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(TEcOrderH tEcOrderH, WritableOptionCall<TEcOrderHCB, UpdateOption<TEcOrderHCB>> opLambda) {
        doUpdateNonstrict(tEcOrderH, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param tEcOrderH The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(TEcOrderH tEcOrderH, WritableOptionCall<TEcOrderHCB, InsertOption<TEcOrderHCB>> insertOpLambda, WritableOptionCall<TEcOrderHCB, UpdateOption<TEcOrderHCB>> updateOpLambda) {
        doInsertOrUpdate(tEcOrderH, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param tEcOrderH The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(TEcOrderH tEcOrderH, WritableOptionCall<TEcOrderHCB, InsertOption<TEcOrderHCB>> insertOpLambda, WritableOptionCall<TEcOrderHCB, UpdateOption<TEcOrderHCB>> updateOpLambda) {
        doInsertOrUpdateNonstrict(tEcOrderH, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param tEcOrderH The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(TEcOrderH tEcOrderH, WritableOptionCall<TEcOrderHCB, DeleteOption<TEcOrderHCB>> opLambda) {
        doDelete(tEcOrderH, createDeleteOption(opLambda));
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as deleteNonstrict(entity).
     * @param tEcOrderH The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(TEcOrderH tEcOrderH, WritableOptionCall<TEcOrderHCB, DeleteOption<TEcOrderHCB>> opLambda) {
        doDeleteNonstrict(tEcOrderH, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param tEcOrderHList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<TEcOrderH> tEcOrderHList, WritableOptionCall<TEcOrderHCB, InsertOption<TEcOrderHCB>> opLambda) {
        return doBatchInsert(tEcOrderHList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param tEcOrderHList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<TEcOrderH> tEcOrderHList, WritableOptionCall<TEcOrderHCB, UpdateOption<TEcOrderHCB>> opLambda) {
        return doBatchUpdate(tEcOrderHList, createUpdateOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param tEcOrderHList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<TEcOrderH> tEcOrderHList, WritableOptionCall<TEcOrderHCB, UpdateOption<TEcOrderHCB>> opLambda) {
        return doBatchUpdateNonstrict(tEcOrderHList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param tEcOrderHList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<TEcOrderH> tEcOrderHList, WritableOptionCall<TEcOrderHCB, DeleteOption<TEcOrderHCB>> opLambda) {
        return doBatchDelete(tEcOrderHList, createDeleteOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param tEcOrderHList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<TEcOrderH> tEcOrderHList, WritableOptionCall<TEcOrderHCB, DeleteOption<TEcOrderHCB>> opLambda) {
        return doBatchDeleteNonstrict(tEcOrderHList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<TEcOrderH, TEcOrderHCB> manyArgLambda, WritableOptionCall<TEcOrderHCB, InsertOption<TEcOrderHCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * TEcOrderH tEcOrderH = <span style="color: #70226C">new</span> TEcOrderH();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//tEcOrderH.setPK...(value);</span>
     * tEcOrderH.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tEcOrderH.setVersionNo(value);</span>
     * TEcOrderHCB cb = <span style="color: #70226C">new</span> TEcOrderHCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">tEcOrderHBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(tEcOrderH, cb, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param tEcOrderH The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of TEcOrderH. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(TEcOrderH tEcOrderH, TEcOrderHCB cb, WritableOptionCall<TEcOrderHCB, UpdateOption<TEcOrderHCB>> opLambda) {
        return doQueryUpdate(tEcOrderH, cb, createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * @param cb The condition-bean of TEcOrderH. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(TEcOrderHCB cb, WritableOptionCall<TEcOrderHCB, DeleteOption<TEcOrderHCB>> opLambda) {
        return doQueryDelete(cb, createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span>
     * tEcOrderHBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span>
     * tEcOrderHBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * tEcOrderHBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * tEcOrderHBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * tEcOrderHBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * tEcOrderHBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * tEcOrderHBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span>
     * tEcOrderHBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * tEcOrderHBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * tEcOrderHBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * tEcOrderHBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * tEcOrderHBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * tEcOrderHBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span>
     * tEcOrderHBhv.outideSql().removeBlockComment().selectList()
     * tEcOrderHBhv.outideSql().removeLineComment().selectList()
     * tEcOrderHBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlBasicExecutor<TEcOrderHBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<TEcOrderHBhv> facadeExecutor = doOutsideSql();
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
    protected Class<? extends TEcOrderH> typeOfSelectedEntity() { return TEcOrderH.class; }
    protected Class<TEcOrderH> typeOfHandlingEntity() { return TEcOrderH.class; }
    protected Class<TEcOrderHCB> typeOfHandlingConditionBean() { return TEcOrderHCB.class; }
}
