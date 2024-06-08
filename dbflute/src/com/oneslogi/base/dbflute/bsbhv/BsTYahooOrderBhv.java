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
 * The behavior of T_YAHOO_ORDER as TABLE. <br>
 * <pre>
 * [primary key]
 *     YAHOO_ORDER_ID
 *
 * [column]
 *     YAHOO_ORDER_ID, ORDER_ID, PARENT_ORDER_ID, DEVICE_TYPE, IS_AFFILIATE, FSP_LICENSE_CODE, FSP_LICENSE_NAME, ORDER_TIME, ORDER_TIME_UNIX_EPOCH, USE_POINT_TYPE, ORDER_STATUS, STORE_STATUS, REFERER, ENTRY_POINT, CLINK, SUSPECT_MESSAGE, IS_ITEM_COUPON, IS_SHIPPING_COUPON, SHIP_NAME, SHIP_FIRST_NAME, SHIP_LAST_NAME, SHIP_ADDRESS1, SHIP_ADDRESS2, SHIP_CITY, SHIP_PREFECTURE, SHIP_ZIP_CODE, SHIP_NAME_KANA, SHIP_FIRST_NAME_KANA, SHIP_LAST_NAME_KANA, SHIP_ADDRESS1_KANA, SHIP_ADDRESS2_KANA, SHIP_CITY_KANA, SHIP_PREFECTURE_KANA, SHIP_SECTION1_FIELD, SHIP_SECTION1_VALUE, SHIP_SECTION2_FIELD, SHIP_SECTION2_VALUE, SHIP_PHONE_NUMBER, SHIP_EMG_PHONE_NUMBER, SHIP_METHOD, SHIP_METHOD_NAME, SHIP_REQUEST_DATE, SHIP_REQUEST_TIME, SHIP_NOTES, ARRIVE_TYPE, SHIP_INVOICE_NUMBER1, SHIP_INVOICE_NUMBER2, SHIP_URL, SHIP_DATE, GIFT_WRAP_TYPE, GIFT_WRAP_PAPER_TYPE, GIFT_WRAP_NAME, NEED_BILL_SLIP, NEED_DETAILED_SLIP, NEED_RECEIPT, OPTION1_FIELD, OPTION1_VALUE, OPTION2_FIELD, OPTION2_VALUE, GIFT_WRAP_MASSAGE, BILL_NAME, BILL_FIRST_NAME, BILL_LAST_NAME, BILL_ADDRESS1, BILL_ADDRESS2, BILL_CITY, BILL_PREFECTURE, BILL_ZIP_CODE, BILL_NAME_KANA, BILL_FIRST_NAME_KANA, BILL_LAST_NAME_KANA, BILL_ADDRESS1_KANA, BILL_ADDRESS2_KANA, BILL_CITY_KANA, BILL_PREFECTURE_KANA, BILL_SECTION1_FIELD, BILL_SECTION1_VALUE, BILL_SECTION2_FIELD, BILL_SECTION2_VALUE, BILL_PHONE_NUMBER, BILL_EMG_PHONE_NUMBER, BILL_MAIL_ADDRESS, PAY_MATHOD, PAY_MATHOD_NAME, PAY_KIND, CARD_PAY_COUNT, CARD_PAY_TYPE, SETTLE_STATUS, SETTLE_ID, PAY_NO, PAY_NO_ISSUE_DATE, PAY_DATE, BUYER_COMMENTS, AGE_CONFIRM, QUANTITY_DETAIL, SHIP_CHARGE, PAY_CHARGE, GIFT_WRAP_CHARGE, DISCOUNT, ADJUSTMENTS, USE_POINT, GET_POINT, TOTAL, TOTAL_PRICE, SHIPPING_C_DISCOUNT, ITEM_C_DISCOUNT, TOTAL_MALL_C_DISCOUNT, GET_POINT_CRG_TO_STORE, LINE_ID, QUANTITY, ITEM_ID, SUB_CODE, TITLE, ITEM_OPTION_NAME, ITEM_OPTION_VALUE, SUB_CODE_OPTION, INSCRIPTION_NAME, INSCRIPTION_VALUE, UNIT_PRICE, UNIT_GET_POINT, LINE_SUB_TOTAL, LINE_GET_POINT, POINT_FSP_CODE, ITEM_CONDITION, COUPON_ID, COUPON_DISCOUNT, ORIGINAL_PRICE, IS_GET_POINT_FIX, GET_POINT_FIX_DATE, RELEASE_DATE, GET_POINT_TYPE, JAN, PRODUCT_ID, POINT_CHARGED_TO_STORE, PACKING_QTY, SLIP_ITEM_NM1, SLIP_ITEM_NM2, SLIP_ITEM_NM3, SLIP_ITEM_NM4, SLIP_ITEM_NM5, SLIP_ITEM_CD1, SLIP_ITEM_CD2, FREIGHT_HANDLING1, FREIGHT_HANDLING2, ARTICLE, RECEIVE_ID, ROW_NO, ERROR_FLG, IMPORT_FLG, IMPORT_TYPE_ID, EC_ORDER_B_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     YAHOO_ORDER_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     T_EC_ORDER_B
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     tEcOrderB
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsTYahooOrderBhv extends AbstractBehaviorWritable<TYahooOrder, TYahooOrderCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public TYahooOrderDbm asDBMeta() { return TYahooOrderDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "T_YAHOO_ORDER"; }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public TYahooOrderDbm getMyDBMeta() { return TYahooOrderDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public TYahooOrderCB newConditionBean() { return new TYahooOrderCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public TYahooOrder newMyEntity() { return new TYahooOrder(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public TYahooOrderCB newMyConditionBean() { return new TYahooOrderCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * TYahooOrderCB cb = <span style="color: #70226C">new</span> TYahooOrderCB();
     * cb.query().setFoo...(value);
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">tYahooOrderBhv</span>.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of TYahooOrder. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(TYahooOrderCB cb) {
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
     * TYahooOrderCB cb = <span style="color: #70226C">new</span> TYahooOrderCB();
     * cb.query().setFoo...(value);
     * TYahooOrder tYahooOrder = <span style="color: #0000C0">tYahooOrderBhv</span>.<span style="color: #DD4747">selectEntity</span>(cb);
     * <span style="color: #70226C">if</span> (tYahooOrder != <span style="color: #70226C">null</span>) { <span style="color: #3F7E5E">// null check</span>
     *     ... = tYahooOrder.get...();
     * } <span style="color: #70226C">else</span> {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of TYahooOrder. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TYahooOrder selectEntity(TYahooOrderCB cb) {
        return facadeSelectEntity(cb);
    }

    protected TYahooOrder facadeSelectEntity(TYahooOrderCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends TYahooOrder> OptionalEntity<ENTITY> doSelectOptionalEntity(TYahooOrderCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * TYahooOrderCB cb = <span style="color: #70226C">new</span> TYahooOrderCB();
     * cb.query().set...;
     * TYahooOrder tYahooOrder = <span style="color: #0000C0">tYahooOrderBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = tYahooOrder.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of TYahooOrder. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TYahooOrder selectEntityWithDeletedCheck(TYahooOrderCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param yahooOrderId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TYahooOrder selectByPKValue(Long yahooOrderId) {
        return facadeSelectByPKValue(yahooOrderId);
    }

    protected TYahooOrder facadeSelectByPKValue(Long yahooOrderId) {
        return doSelectByPK(yahooOrderId, typeOfSelectedEntity());
    }

    protected <ENTITY extends TYahooOrder> ENTITY doSelectByPK(Long yahooOrderId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(yahooOrderId), tp);
    }

    protected <ENTITY extends TYahooOrder> OptionalEntity<ENTITY> doSelectOptionalByPK(Long yahooOrderId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(yahooOrderId, tp), yahooOrderId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param yahooOrderId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TYahooOrder selectByPKValueWithDeletedCheck(Long yahooOrderId) {
        return doSelectByPKWithDeletedCheck(yahooOrderId, typeOfSelectedEntity());
    }

    protected <ENTITY extends TYahooOrder> ENTITY doSelectByPKWithDeletedCheck(Long yahooOrderId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(yahooOrderId), tp);
    }

    protected TYahooOrderCB xprepareCBAsPK(Long yahooOrderId) {
        assertObjectNotNull("yahooOrderId", yahooOrderId);
        return newConditionBean().acceptPK(yahooOrderId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * TYahooOrderCB cb = <span style="color: #70226C">new</span> TYahooOrderCB();
     * cb.query().set...;
     * cb.query().addOrderBy...;
     * ListResultBean&lt;TYahooOrder&gt; <span style="color: #553000">tYahooOrderList</span> = <span style="color: #0000C0">tYahooOrderBhv</span>.<span style="color: #CC4747">selectList</span>(cb);
     * <span style="color: #70226C">for</span> (TYahooOrder tYahooOrder : <span style="color: #553000">tYahooOrderList</span>) {
     *     ... = tYahooOrder.get...;
     * }
     * </pre>
     * @param cb The condition-bean of TYahooOrder. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<TYahooOrder> selectList(TYahooOrderCB cb) {
        return facadeSelectList(cb);
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * TYahooOrderCB cb = <span style="color: #70226C">new</span> TYahooOrderCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;TYahooOrder&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">tYahooOrderBhv</span>.<span style="color: #CC4747">selectPage</span>(cb);
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (TYahooOrder tYahooOrder : <span style="color: #553000">page</span>) {
     *     ... = tYahooOrder.get...();
     * }
     * </pre>
     * @param cb The condition-bean of TYahooOrder. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<TYahooOrder> selectPage(TYahooOrderCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * TYahooOrderCB cb = <span style="color: #70226C">new</span> TYahooOrderCB();
     * cb.query().set...
     * <span style="color: #0000C0">tYahooOrderBhv</span>.<span style="color: #CC4747">selectCursor</span>(cb, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cb The condition-bean of TYahooOrder. (NotNull)
     * @param entityRowHandler The handler of entity row of TYahooOrder. (NotNull)
     */
    public void selectCursor(TYahooOrderCB cb, EntityRowHandler<TYahooOrder> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">tYahooOrderBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<TYahooOrderCB, RESULT> selectScalar(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">tYahooOrderBhv</span>.<span style="color: #CC4747">scalarSelect</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<TYahooOrderCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param tYahooOrderList The entity list of TYahooOrder. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<TYahooOrder> tYahooOrderList, ReferrerLoaderHandler<LoaderOfTYahooOrder> loaderLambda) {
        xassLRArg(tYahooOrderList, loaderLambda);
        loaderLambda.handle(new LoaderOfTYahooOrder().ready(tYahooOrderList, _behaviorSelector));
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
     * @param tYahooOrder The entity of TYahooOrder. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(TYahooOrder tYahooOrder, ReferrerLoaderHandler<LoaderOfTYahooOrder> loaderLambda) {
        xassLRArg(tYahooOrder, loaderLambda);
        loaderLambda.handle(new LoaderOfTYahooOrder().ready(xnewLRAryLs(tYahooOrder), _behaviorSelector));
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'TEcOrderB'.
     * @param tYahooOrderList The list of tYahooOrder. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<TEcOrderB> pulloutTEcOrderB(List<TYahooOrder> tYahooOrderList)
    { return helpPulloutInternally(tYahooOrderList, "tEcOrderB"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key yahooOrderId.
     * @param tYahooOrderList The list of tYahooOrder. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractYahooOrderIdList(List<TYahooOrder> tYahooOrderList)
    { return helpExtractListInternally(tYahooOrderList, "yahooOrderId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * TYahooOrder tYahooOrder = <span style="color: #70226C">new</span> TYahooOrder();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * tYahooOrder.setFoo...(value);
     * tYahooOrder.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tYahooOrder.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tYahooOrder.set...;</span>
     * <span style="color: #0000C0">tYahooOrderBhv</span>.<span style="color: #CC4747">insert</span>(tYahooOrder);
     * ... = tYahooOrder.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param tYahooOrder The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(TYahooOrder tYahooOrder) {
        doInsert(tYahooOrder, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * TYahooOrder tYahooOrder = <span style="color: #70226C">new</span> TYahooOrder();
     * tYahooOrder.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tYahooOrder.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tYahooOrder.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tYahooOrder.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * tYahooOrder.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">tYahooOrderBhv</span>.<span style="color: #CC4747">update</span>(tYahooOrder);
     * </pre>
     * @param tYahooOrder The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(TYahooOrder tYahooOrder) {
        doUpdate(tYahooOrder, null);
    }

    /**
     * Update the entity non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * TYahooOrder tYahooOrder = <span style="color: #70226C">new</span> TYahooOrder();
     * tYahooOrder.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tYahooOrder.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tYahooOrder.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tYahooOrder.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tYahooOrder.setVersionNo(value);</span>
     * <span style="color: #0000C0">tYahooOrderBhv</span>.<span style="color: #CC4747">updateNonstrict</span>(tYahooOrder);
     * </pre>
     * @param tYahooOrder The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(TYahooOrder tYahooOrder) {
        doUpdateNonstrict(tYahooOrder, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param tYahooOrder The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(TYahooOrder tYahooOrder) {
        doInsertOrUpdate(tYahooOrder, null, null);
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param tYahooOrder The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(TYahooOrder tYahooOrder) {
        doInsertOrUpdateNonstrict(tYahooOrder, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * TYahooOrder tYahooOrder = <span style="color: #70226C">new</span> TYahooOrder();
     * tYahooOrder.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * tYahooOrder.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">tYahooOrderBhv</span>.<span style="color: #CC4747">delete</span>(tYahooOrder);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param tYahooOrder The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(TYahooOrder tYahooOrder) {
        doDelete(tYahooOrder, null);
    }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl} <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * TYahooOrder tYahooOrder = <span style="color: #70226C">new</span> TYahooOrder();
     * tYahooOrder.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tYahooOrder.setVersionNo(value);</span>
     * <span style="color: #0000C0">tYahooOrderBhv</span>.<span style="color: #CC4747">deleteNonstrict</span>(tYahooOrder);
     * </pre>
     * @param tYahooOrder The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(TYahooOrder tYahooOrder) {
        doDeleteNonstrict(tYahooOrder, null);
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * TYahooOrder tYahooOrder = <span style="color: #70226C">new</span> TYahooOrder();
     * tYahooOrder.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tYahooOrder.setVersionNo(value);</span>
     * <span style="color: #0000C0">tYahooOrderBhv</span>.<span style="color: #CC4747">deleteNonstrictIgnoreDeleted</span>(tYahooOrder);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param tYahooOrder The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(TYahooOrder tYahooOrder) {
        doDeleteNonstrictIgnoreDeleted(tYahooOrder, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(TYahooOrder et, final DeleteOption<TYahooOrderCB> op) {
        assertObjectNotNull("tYahooOrder", et); prepareDeleteOption(op); helpDeleteNonstrictIgnoreDeletedInternally(et, op);
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
     *     TYahooOrder tYahooOrder = <span style="color: #70226C">new</span> TYahooOrder();
     *     tYahooOrder.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         tYahooOrder.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     tYahooOrderList.add(tYahooOrder);
     * }
     * <span style="color: #0000C0">tYahooOrderBhv</span>.<span style="color: #CC4747">batchInsert</span>(tYahooOrderList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param tYahooOrderList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<TYahooOrder> tYahooOrderList) {
        return doBatchInsert(tYahooOrderList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     TYahooOrder tYahooOrder = <span style="color: #70226C">new</span> TYahooOrder();
     *     tYahooOrder.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         tYahooOrder.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         tYahooOrder.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//tYahooOrder.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     tYahooOrderList.add(tYahooOrder);
     * }
     * <span style="color: #0000C0">tYahooOrderBhv</span>.<span style="color: #CC4747">batchUpdate</span>(tYahooOrderList);
     * </pre>
     * @param tYahooOrderList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<TYahooOrder> tYahooOrderList) {
        return doBatchUpdate(tYahooOrderList, null);
    }

    /**
     * Batch-update the entity list specified-only. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * tYahooOrderBhv.<span style="color: #CC4747">batchUpdate</span>(tYahooOrderList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">tYahooOrderBhv</span>.<span style="color: #CC4747">batchUpdate</span>(tYahooOrderList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param tYahooOrderList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<TYahooOrder> tYahooOrderList, SpecifyQuery<TYahooOrderCB> colCBLambda) {
        return doBatchUpdate(tYahooOrderList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * <span style="color: #70226C">for</span> (... : ...) {
     *     TYahooOrder tYahooOrder = <span style="color: #70226C">new</span> TYahooOrder();
     *     tYahooOrder.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         tYahooOrder.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         tYahooOrder.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//tYahooOrder.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     tYahooOrderList.add(tYahooOrder);
     * }
     * <span style="color: #0000C0">tYahooOrderBhv</span>.<span style="color: #CC4747">batchUpdate</span>(tYahooOrderList);
     * </pre>
     * @param tYahooOrderList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<TYahooOrder> tYahooOrderList) {
        return doBatchUpdateNonstrict(tYahooOrderList, null);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * <span style="color: #0000C0">tYahooOrderBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(tYahooOrderList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">tYahooOrderBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(tYahooOrderList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).</p>
     * @param tYahooOrderList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<TYahooOrder> tYahooOrderList, SpecifyQuery<TYahooOrderCB> colCBLambda) {
        return doBatchUpdateNonstrict(tYahooOrderList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param tYahooOrderList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<TYahooOrder> tYahooOrderList) {
        return doBatchDelete(tYahooOrderList, null);
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param tYahooOrderList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<TYahooOrder> tYahooOrderList) {
        return doBatchDeleteNonstrict(tYahooOrderList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">tYahooOrderBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;TYahooOrder, TYahooOrderCB&gt;() {
     *     public ConditionBean setup(TYahooOrder entity, TYahooOrderCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<TYahooOrder, TYahooOrderCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * TYahooOrder tYahooOrder = <span style="color: #70226C">new</span> TYahooOrder();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//tYahooOrder.setPK...(value);</span>
     * tYahooOrder.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tYahooOrder.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tYahooOrder.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tYahooOrder.setVersionNo(value);</span>
     * TYahooOrderCB cb = <span style="color: #70226C">new</span> TYahooOrderCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">tYahooOrderBhv</span>.<span style="color: #CC4747">queryUpdate</span>(tYahooOrder, cb);
     * </pre>
     * @param tYahooOrder The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of TYahooOrder. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(TYahooOrder tYahooOrder, TYahooOrderCB cb) {
        return doQueryUpdate(tYahooOrder, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * TYahooOrderCB cb = new TYahooOrderCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">tYahooOrderBhv</span>.<span style="color: #CC4747">queryDelete</span>(tYahooOrder, cb);
     * </pre>
     * @param cb The condition-bean of TYahooOrder. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(TYahooOrderCB cb) {
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
     * TYahooOrder tYahooOrder = <span style="color: #70226C">new</span> TYahooOrder();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * tYahooOrder.setFoo...(value);
     * tYahooOrder.setBar...(value);
     * <span style="color: #0000C0">tYahooOrderBhv</span>.<span style="color: #CC4747">varyingInsert</span>(tYahooOrder, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = tYahooOrder.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param tYahooOrder The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(TYahooOrder tYahooOrder, WritableOptionCall<TYahooOrderCB, InsertOption<TYahooOrderCB>> opLambda) {
        doInsert(tYahooOrder, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * TYahooOrder tYahooOrder = <span style="color: #70226C">new</span> TYahooOrder();
     * tYahooOrder.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tYahooOrder.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * tYahooOrder.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">tYahooOrderBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(tYahooOrder, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param tYahooOrder The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(TYahooOrder tYahooOrder, WritableOptionCall<TYahooOrderCB, UpdateOption<TYahooOrderCB>> opLambda) {
        doUpdate(tYahooOrder, createUpdateOption(opLambda));
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * TYahooOrder tYahooOrder = <span style="color: #70226C">new</span> TYahooOrder();
     * tYahooOrder.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tYahooOrder.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tYahooOrder.setVersionNo(value);</span>
     * <span style="color: #0000C0">tYahooOrderBhv</span>.<span style="color: #CC4747">varyingUpdateNonstrict</span>(tYahooOrder, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param tYahooOrder The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(TYahooOrder tYahooOrder, WritableOptionCall<TYahooOrderCB, UpdateOption<TYahooOrderCB>> opLambda) {
        doUpdateNonstrict(tYahooOrder, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param tYahooOrder The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(TYahooOrder tYahooOrder, WritableOptionCall<TYahooOrderCB, InsertOption<TYahooOrderCB>> insertOpLambda, WritableOptionCall<TYahooOrderCB, UpdateOption<TYahooOrderCB>> updateOpLambda) {
        doInsertOrUpdate(tYahooOrder, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param tYahooOrder The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(TYahooOrder tYahooOrder, WritableOptionCall<TYahooOrderCB, InsertOption<TYahooOrderCB>> insertOpLambda, WritableOptionCall<TYahooOrderCB, UpdateOption<TYahooOrderCB>> updateOpLambda) {
        doInsertOrUpdateNonstrict(tYahooOrder, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param tYahooOrder The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(TYahooOrder tYahooOrder, WritableOptionCall<TYahooOrderCB, DeleteOption<TYahooOrderCB>> opLambda) {
        doDelete(tYahooOrder, createDeleteOption(opLambda));
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as deleteNonstrict(entity).
     * @param tYahooOrder The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(TYahooOrder tYahooOrder, WritableOptionCall<TYahooOrderCB, DeleteOption<TYahooOrderCB>> opLambda) {
        doDeleteNonstrict(tYahooOrder, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param tYahooOrderList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<TYahooOrder> tYahooOrderList, WritableOptionCall<TYahooOrderCB, InsertOption<TYahooOrderCB>> opLambda) {
        return doBatchInsert(tYahooOrderList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param tYahooOrderList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<TYahooOrder> tYahooOrderList, WritableOptionCall<TYahooOrderCB, UpdateOption<TYahooOrderCB>> opLambda) {
        return doBatchUpdate(tYahooOrderList, createUpdateOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param tYahooOrderList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<TYahooOrder> tYahooOrderList, WritableOptionCall<TYahooOrderCB, UpdateOption<TYahooOrderCB>> opLambda) {
        return doBatchUpdateNonstrict(tYahooOrderList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param tYahooOrderList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<TYahooOrder> tYahooOrderList, WritableOptionCall<TYahooOrderCB, DeleteOption<TYahooOrderCB>> opLambda) {
        return doBatchDelete(tYahooOrderList, createDeleteOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param tYahooOrderList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<TYahooOrder> tYahooOrderList, WritableOptionCall<TYahooOrderCB, DeleteOption<TYahooOrderCB>> opLambda) {
        return doBatchDeleteNonstrict(tYahooOrderList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<TYahooOrder, TYahooOrderCB> manyArgLambda, WritableOptionCall<TYahooOrderCB, InsertOption<TYahooOrderCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * TYahooOrder tYahooOrder = <span style="color: #70226C">new</span> TYahooOrder();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//tYahooOrder.setPK...(value);</span>
     * tYahooOrder.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tYahooOrder.setVersionNo(value);</span>
     * TYahooOrderCB cb = <span style="color: #70226C">new</span> TYahooOrderCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">tYahooOrderBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(tYahooOrder, cb, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param tYahooOrder The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of TYahooOrder. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(TYahooOrder tYahooOrder, TYahooOrderCB cb, WritableOptionCall<TYahooOrderCB, UpdateOption<TYahooOrderCB>> opLambda) {
        return doQueryUpdate(tYahooOrder, cb, createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * @param cb The condition-bean of TYahooOrder. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(TYahooOrderCB cb, WritableOptionCall<TYahooOrderCB, DeleteOption<TYahooOrderCB>> opLambda) {
        return doQueryDelete(cb, createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span>
     * tYahooOrderBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span>
     * tYahooOrderBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * tYahooOrderBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * tYahooOrderBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * tYahooOrderBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * tYahooOrderBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * tYahooOrderBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span>
     * tYahooOrderBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * tYahooOrderBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * tYahooOrderBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * tYahooOrderBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * tYahooOrderBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * tYahooOrderBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span>
     * tYahooOrderBhv.outideSql().removeBlockComment().selectList()
     * tYahooOrderBhv.outideSql().removeLineComment().selectList()
     * tYahooOrderBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlBasicExecutor<TYahooOrderBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<TYahooOrderBhv> facadeExecutor = doOutsideSql();
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
    protected Class<? extends TYahooOrder> typeOfSelectedEntity() { return TYahooOrder.class; }
    protected Class<TYahooOrder> typeOfHandlingEntity() { return TYahooOrder.class; }
    protected Class<TYahooOrderCB> typeOfHandlingConditionBean() { return TYahooOrderCB.class; }
}
