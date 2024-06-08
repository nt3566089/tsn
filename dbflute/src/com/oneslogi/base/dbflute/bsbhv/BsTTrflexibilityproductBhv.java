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
 * The behavior of T_TRFLEXIBILITYPRODUCT as TABLE. <br>
 * <pre>
 * [primary key]
 *     TRFLEXIBILITYPRODUCT_ID
 *
 * [column]
 *     TRFLEXIBILITYPRODUCT_ID, SUPPLIERCD, SHIPCD, SCHDATE, FLEXIBITYNO, TRANSPORTCD, RCVDATE, OWNERCD, INSTRACTDATETIME, RCVMAKEFLG, REFLINENO, PRODUCT_CD, MANUFACTUREDATE, DESIGNCD, QTYCASE, QTYBOWL, CASEINFOFLG, FACTORYCD, ITEMCD_CASE, SKUCD, DESTINATIONCD, MANUFACTURECD, ORDERNO, MACHINENO, CREATENO, LIMITDATE, DATETIME, DISTRIBUTIONCD, OPERATIONNUM, RCVKEY, FIRMCARRYNO, BATJPRODUCTIONYM, COMETODATE, RECEIVEDATE, CARDBOARDNO, RCVPALLETNO, TAXPALLETNO, ITEMCD_IN, ITEMCD_WH, DESIGNCD_IN, DESIGNCD_WH, VA_EXTDATA1, VA_EXTDATA2, VA_EXTDATA3, NV_EXTDATA1, NV_EXTDATA2, NV_EXTDATA3, NM_EXTDATA1, NM_EXTDATA2, NM_EXTDATA3, DT_EXTDATA1, DT_EXTDATA2, DT_EXTDATA3, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TRFLEXIBILITYPRODUCT_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsTTrflexibilityproductBhv extends AbstractBehaviorWritable<TTrflexibilityproduct, TTrflexibilityproductCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public TTrflexibilityproductDbm asDBMeta() { return TTrflexibilityproductDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "T_TRFLEXIBILITYPRODUCT"; }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public TTrflexibilityproductDbm getMyDBMeta() { return TTrflexibilityproductDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public TTrflexibilityproductCB newConditionBean() { return new TTrflexibilityproductCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public TTrflexibilityproduct newMyEntity() { return new TTrflexibilityproduct(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public TTrflexibilityproductCB newMyConditionBean() { return new TTrflexibilityproductCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * TTrflexibilityproductCB cb = <span style="color: #70226C">new</span> TTrflexibilityproductCB();
     * cb.query().setFoo...(value);
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">tTrflexibilityproductBhv</span>.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of TTrflexibilityproduct. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(TTrflexibilityproductCB cb) {
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
     * TTrflexibilityproductCB cb = <span style="color: #70226C">new</span> TTrflexibilityproductCB();
     * cb.query().setFoo...(value);
     * TTrflexibilityproduct tTrflexibilityproduct = <span style="color: #0000C0">tTrflexibilityproductBhv</span>.<span style="color: #DD4747">selectEntity</span>(cb);
     * <span style="color: #70226C">if</span> (tTrflexibilityproduct != <span style="color: #70226C">null</span>) { <span style="color: #3F7E5E">// null check</span>
     *     ... = tTrflexibilityproduct.get...();
     * } <span style="color: #70226C">else</span> {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of TTrflexibilityproduct. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TTrflexibilityproduct selectEntity(TTrflexibilityproductCB cb) {
        return facadeSelectEntity(cb);
    }

    protected TTrflexibilityproduct facadeSelectEntity(TTrflexibilityproductCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends TTrflexibilityproduct> OptionalEntity<ENTITY> doSelectOptionalEntity(TTrflexibilityproductCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * TTrflexibilityproductCB cb = <span style="color: #70226C">new</span> TTrflexibilityproductCB();
     * cb.query().set...;
     * TTrflexibilityproduct tTrflexibilityproduct = <span style="color: #0000C0">tTrflexibilityproductBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = tTrflexibilityproduct.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of TTrflexibilityproduct. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TTrflexibilityproduct selectEntityWithDeletedCheck(TTrflexibilityproductCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param trflexibilityproductId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TTrflexibilityproduct selectByPKValue(Long trflexibilityproductId) {
        return facadeSelectByPKValue(trflexibilityproductId);
    }

    protected TTrflexibilityproduct facadeSelectByPKValue(Long trflexibilityproductId) {
        return doSelectByPK(trflexibilityproductId, typeOfSelectedEntity());
    }

    protected <ENTITY extends TTrflexibilityproduct> ENTITY doSelectByPK(Long trflexibilityproductId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(trflexibilityproductId), tp);
    }

    protected <ENTITY extends TTrflexibilityproduct> OptionalEntity<ENTITY> doSelectOptionalByPK(Long trflexibilityproductId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(trflexibilityproductId, tp), trflexibilityproductId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param trflexibilityproductId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TTrflexibilityproduct selectByPKValueWithDeletedCheck(Long trflexibilityproductId) {
        return doSelectByPKWithDeletedCheck(trflexibilityproductId, typeOfSelectedEntity());
    }

    protected <ENTITY extends TTrflexibilityproduct> ENTITY doSelectByPKWithDeletedCheck(Long trflexibilityproductId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(trflexibilityproductId), tp);
    }

    protected TTrflexibilityproductCB xprepareCBAsPK(Long trflexibilityproductId) {
        assertObjectNotNull("trflexibilityproductId", trflexibilityproductId);
        return newConditionBean().acceptPK(trflexibilityproductId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * TTrflexibilityproductCB cb = <span style="color: #70226C">new</span> TTrflexibilityproductCB();
     * cb.query().set...;
     * cb.query().addOrderBy...;
     * ListResultBean&lt;TTrflexibilityproduct&gt; <span style="color: #553000">tTrflexibilityproductList</span> = <span style="color: #0000C0">tTrflexibilityproductBhv</span>.<span style="color: #CC4747">selectList</span>(cb);
     * <span style="color: #70226C">for</span> (TTrflexibilityproduct tTrflexibilityproduct : <span style="color: #553000">tTrflexibilityproductList</span>) {
     *     ... = tTrflexibilityproduct.get...;
     * }
     * </pre>
     * @param cb The condition-bean of TTrflexibilityproduct. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<TTrflexibilityproduct> selectList(TTrflexibilityproductCB cb) {
        return facadeSelectList(cb);
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * TTrflexibilityproductCB cb = <span style="color: #70226C">new</span> TTrflexibilityproductCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;TTrflexibilityproduct&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">tTrflexibilityproductBhv</span>.<span style="color: #CC4747">selectPage</span>(cb);
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (TTrflexibilityproduct tTrflexibilityproduct : <span style="color: #553000">page</span>) {
     *     ... = tTrflexibilityproduct.get...();
     * }
     * </pre>
     * @param cb The condition-bean of TTrflexibilityproduct. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<TTrflexibilityproduct> selectPage(TTrflexibilityproductCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * TTrflexibilityproductCB cb = <span style="color: #70226C">new</span> TTrflexibilityproductCB();
     * cb.query().set...
     * <span style="color: #0000C0">tTrflexibilityproductBhv</span>.<span style="color: #CC4747">selectCursor</span>(cb, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cb The condition-bean of TTrflexibilityproduct. (NotNull)
     * @param entityRowHandler The handler of entity row of TTrflexibilityproduct. (NotNull)
     */
    public void selectCursor(TTrflexibilityproductCB cb, EntityRowHandler<TTrflexibilityproduct> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">tTrflexibilityproductBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<TTrflexibilityproductCB, RESULT> selectScalar(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">tTrflexibilityproductBhv</span>.<span style="color: #CC4747">scalarSelect</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<TTrflexibilityproductCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param tTrflexibilityproductList The entity list of TTrflexibilityproduct. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<TTrflexibilityproduct> tTrflexibilityproductList, ReferrerLoaderHandler<LoaderOfTTrflexibilityproduct> loaderLambda) {
        xassLRArg(tTrflexibilityproductList, loaderLambda);
        loaderLambda.handle(new LoaderOfTTrflexibilityproduct().ready(tTrflexibilityproductList, _behaviorSelector));
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
     * @param tTrflexibilityproduct The entity of TTrflexibilityproduct. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(TTrflexibilityproduct tTrflexibilityproduct, ReferrerLoaderHandler<LoaderOfTTrflexibilityproduct> loaderLambda) {
        xassLRArg(tTrflexibilityproduct, loaderLambda);
        loaderLambda.handle(new LoaderOfTTrflexibilityproduct().ready(xnewLRAryLs(tTrflexibilityproduct), _behaviorSelector));
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key trflexibilityproductId.
     * @param tTrflexibilityproductList The list of tTrflexibilityproduct. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractTrflexibilityproductIdList(List<TTrflexibilityproduct> tTrflexibilityproductList)
    { return helpExtractListInternally(tTrflexibilityproductList, "trflexibilityproductId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * TTrflexibilityproduct tTrflexibilityproduct = <span style="color: #70226C">new</span> TTrflexibilityproduct();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * tTrflexibilityproduct.setFoo...(value);
     * tTrflexibilityproduct.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tTrflexibilityproduct.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tTrflexibilityproduct.set...;</span>
     * <span style="color: #0000C0">tTrflexibilityproductBhv</span>.<span style="color: #CC4747">insert</span>(tTrflexibilityproduct);
     * ... = tTrflexibilityproduct.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param tTrflexibilityproduct The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(TTrflexibilityproduct tTrflexibilityproduct) {
        doInsert(tTrflexibilityproduct, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * TTrflexibilityproduct tTrflexibilityproduct = <span style="color: #70226C">new</span> TTrflexibilityproduct();
     * tTrflexibilityproduct.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tTrflexibilityproduct.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tTrflexibilityproduct.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tTrflexibilityproduct.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * tTrflexibilityproduct.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">tTrflexibilityproductBhv</span>.<span style="color: #CC4747">update</span>(tTrflexibilityproduct);
     * </pre>
     * @param tTrflexibilityproduct The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(TTrflexibilityproduct tTrflexibilityproduct) {
        doUpdate(tTrflexibilityproduct, null);
    }

    /**
     * Update the entity non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * TTrflexibilityproduct tTrflexibilityproduct = <span style="color: #70226C">new</span> TTrflexibilityproduct();
     * tTrflexibilityproduct.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tTrflexibilityproduct.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tTrflexibilityproduct.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tTrflexibilityproduct.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tTrflexibilityproduct.setVersionNo(value);</span>
     * <span style="color: #0000C0">tTrflexibilityproductBhv</span>.<span style="color: #CC4747">updateNonstrict</span>(tTrflexibilityproduct);
     * </pre>
     * @param tTrflexibilityproduct The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(TTrflexibilityproduct tTrflexibilityproduct) {
        doUpdateNonstrict(tTrflexibilityproduct, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param tTrflexibilityproduct The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(TTrflexibilityproduct tTrflexibilityproduct) {
        doInsertOrUpdate(tTrflexibilityproduct, null, null);
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param tTrflexibilityproduct The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(TTrflexibilityproduct tTrflexibilityproduct) {
        doInsertOrUpdateNonstrict(tTrflexibilityproduct, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * TTrflexibilityproduct tTrflexibilityproduct = <span style="color: #70226C">new</span> TTrflexibilityproduct();
     * tTrflexibilityproduct.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * tTrflexibilityproduct.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">tTrflexibilityproductBhv</span>.<span style="color: #CC4747">delete</span>(tTrflexibilityproduct);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param tTrflexibilityproduct The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(TTrflexibilityproduct tTrflexibilityproduct) {
        doDelete(tTrflexibilityproduct, null);
    }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl} <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * TTrflexibilityproduct tTrflexibilityproduct = <span style="color: #70226C">new</span> TTrflexibilityproduct();
     * tTrflexibilityproduct.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tTrflexibilityproduct.setVersionNo(value);</span>
     * <span style="color: #0000C0">tTrflexibilityproductBhv</span>.<span style="color: #CC4747">deleteNonstrict</span>(tTrflexibilityproduct);
     * </pre>
     * @param tTrflexibilityproduct The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(TTrflexibilityproduct tTrflexibilityproduct) {
        doDeleteNonstrict(tTrflexibilityproduct, null);
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * TTrflexibilityproduct tTrflexibilityproduct = <span style="color: #70226C">new</span> TTrflexibilityproduct();
     * tTrflexibilityproduct.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tTrflexibilityproduct.setVersionNo(value);</span>
     * <span style="color: #0000C0">tTrflexibilityproductBhv</span>.<span style="color: #CC4747">deleteNonstrictIgnoreDeleted</span>(tTrflexibilityproduct);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param tTrflexibilityproduct The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(TTrflexibilityproduct tTrflexibilityproduct) {
        doDeleteNonstrictIgnoreDeleted(tTrflexibilityproduct, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(TTrflexibilityproduct et, final DeleteOption<TTrflexibilityproductCB> op) {
        assertObjectNotNull("tTrflexibilityproduct", et); prepareDeleteOption(op); helpDeleteNonstrictIgnoreDeletedInternally(et, op);
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
     *     TTrflexibilityproduct tTrflexibilityproduct = <span style="color: #70226C">new</span> TTrflexibilityproduct();
     *     tTrflexibilityproduct.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         tTrflexibilityproduct.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     tTrflexibilityproductList.add(tTrflexibilityproduct);
     * }
     * <span style="color: #0000C0">tTrflexibilityproductBhv</span>.<span style="color: #CC4747">batchInsert</span>(tTrflexibilityproductList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param tTrflexibilityproductList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<TTrflexibilityproduct> tTrflexibilityproductList) {
        return doBatchInsert(tTrflexibilityproductList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     TTrflexibilityproduct tTrflexibilityproduct = <span style="color: #70226C">new</span> TTrflexibilityproduct();
     *     tTrflexibilityproduct.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         tTrflexibilityproduct.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         tTrflexibilityproduct.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//tTrflexibilityproduct.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     tTrflexibilityproductList.add(tTrflexibilityproduct);
     * }
     * <span style="color: #0000C0">tTrflexibilityproductBhv</span>.<span style="color: #CC4747">batchUpdate</span>(tTrflexibilityproductList);
     * </pre>
     * @param tTrflexibilityproductList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<TTrflexibilityproduct> tTrflexibilityproductList) {
        return doBatchUpdate(tTrflexibilityproductList, null);
    }

    /**
     * Batch-update the entity list specified-only. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * tTrflexibilityproductBhv.<span style="color: #CC4747">batchUpdate</span>(tTrflexibilityproductList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">tTrflexibilityproductBhv</span>.<span style="color: #CC4747">batchUpdate</span>(tTrflexibilityproductList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param tTrflexibilityproductList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<TTrflexibilityproduct> tTrflexibilityproductList, SpecifyQuery<TTrflexibilityproductCB> colCBLambda) {
        return doBatchUpdate(tTrflexibilityproductList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * <span style="color: #70226C">for</span> (... : ...) {
     *     TTrflexibilityproduct tTrflexibilityproduct = <span style="color: #70226C">new</span> TTrflexibilityproduct();
     *     tTrflexibilityproduct.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         tTrflexibilityproduct.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         tTrflexibilityproduct.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//tTrflexibilityproduct.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     tTrflexibilityproductList.add(tTrflexibilityproduct);
     * }
     * <span style="color: #0000C0">tTrflexibilityproductBhv</span>.<span style="color: #CC4747">batchUpdate</span>(tTrflexibilityproductList);
     * </pre>
     * @param tTrflexibilityproductList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<TTrflexibilityproduct> tTrflexibilityproductList) {
        return doBatchUpdateNonstrict(tTrflexibilityproductList, null);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * <span style="color: #0000C0">tTrflexibilityproductBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(tTrflexibilityproductList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">tTrflexibilityproductBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(tTrflexibilityproductList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).</p>
     * @param tTrflexibilityproductList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<TTrflexibilityproduct> tTrflexibilityproductList, SpecifyQuery<TTrflexibilityproductCB> colCBLambda) {
        return doBatchUpdateNonstrict(tTrflexibilityproductList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param tTrflexibilityproductList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<TTrflexibilityproduct> tTrflexibilityproductList) {
        return doBatchDelete(tTrflexibilityproductList, null);
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param tTrflexibilityproductList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<TTrflexibilityproduct> tTrflexibilityproductList) {
        return doBatchDeleteNonstrict(tTrflexibilityproductList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">tTrflexibilityproductBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;TTrflexibilityproduct, TTrflexibilityproductCB&gt;() {
     *     public ConditionBean setup(TTrflexibilityproduct entity, TTrflexibilityproductCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<TTrflexibilityproduct, TTrflexibilityproductCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * TTrflexibilityproduct tTrflexibilityproduct = <span style="color: #70226C">new</span> TTrflexibilityproduct();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//tTrflexibilityproduct.setPK...(value);</span>
     * tTrflexibilityproduct.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tTrflexibilityproduct.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tTrflexibilityproduct.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tTrflexibilityproduct.setVersionNo(value);</span>
     * TTrflexibilityproductCB cb = <span style="color: #70226C">new</span> TTrflexibilityproductCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">tTrflexibilityproductBhv</span>.<span style="color: #CC4747">queryUpdate</span>(tTrflexibilityproduct, cb);
     * </pre>
     * @param tTrflexibilityproduct The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of TTrflexibilityproduct. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(TTrflexibilityproduct tTrflexibilityproduct, TTrflexibilityproductCB cb) {
        return doQueryUpdate(tTrflexibilityproduct, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * TTrflexibilityproductCB cb = new TTrflexibilityproductCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">tTrflexibilityproductBhv</span>.<span style="color: #CC4747">queryDelete</span>(tTrflexibilityproduct, cb);
     * </pre>
     * @param cb The condition-bean of TTrflexibilityproduct. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(TTrflexibilityproductCB cb) {
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
     * TTrflexibilityproduct tTrflexibilityproduct = <span style="color: #70226C">new</span> TTrflexibilityproduct();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * tTrflexibilityproduct.setFoo...(value);
     * tTrflexibilityproduct.setBar...(value);
     * <span style="color: #0000C0">tTrflexibilityproductBhv</span>.<span style="color: #CC4747">varyingInsert</span>(tTrflexibilityproduct, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = tTrflexibilityproduct.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param tTrflexibilityproduct The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(TTrflexibilityproduct tTrflexibilityproduct, WritableOptionCall<TTrflexibilityproductCB, InsertOption<TTrflexibilityproductCB>> opLambda) {
        doInsert(tTrflexibilityproduct, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * TTrflexibilityproduct tTrflexibilityproduct = <span style="color: #70226C">new</span> TTrflexibilityproduct();
     * tTrflexibilityproduct.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tTrflexibilityproduct.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * tTrflexibilityproduct.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">tTrflexibilityproductBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(tTrflexibilityproduct, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param tTrflexibilityproduct The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(TTrflexibilityproduct tTrflexibilityproduct, WritableOptionCall<TTrflexibilityproductCB, UpdateOption<TTrflexibilityproductCB>> opLambda) {
        doUpdate(tTrflexibilityproduct, createUpdateOption(opLambda));
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * TTrflexibilityproduct tTrflexibilityproduct = <span style="color: #70226C">new</span> TTrflexibilityproduct();
     * tTrflexibilityproduct.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tTrflexibilityproduct.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tTrflexibilityproduct.setVersionNo(value);</span>
     * <span style="color: #0000C0">tTrflexibilityproductBhv</span>.<span style="color: #CC4747">varyingUpdateNonstrict</span>(tTrflexibilityproduct, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param tTrflexibilityproduct The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(TTrflexibilityproduct tTrflexibilityproduct, WritableOptionCall<TTrflexibilityproductCB, UpdateOption<TTrflexibilityproductCB>> opLambda) {
        doUpdateNonstrict(tTrflexibilityproduct, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param tTrflexibilityproduct The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(TTrflexibilityproduct tTrflexibilityproduct, WritableOptionCall<TTrflexibilityproductCB, InsertOption<TTrflexibilityproductCB>> insertOpLambda, WritableOptionCall<TTrflexibilityproductCB, UpdateOption<TTrflexibilityproductCB>> updateOpLambda) {
        doInsertOrUpdate(tTrflexibilityproduct, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param tTrflexibilityproduct The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(TTrflexibilityproduct tTrflexibilityproduct, WritableOptionCall<TTrflexibilityproductCB, InsertOption<TTrflexibilityproductCB>> insertOpLambda, WritableOptionCall<TTrflexibilityproductCB, UpdateOption<TTrflexibilityproductCB>> updateOpLambda) {
        doInsertOrUpdateNonstrict(tTrflexibilityproduct, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param tTrflexibilityproduct The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(TTrflexibilityproduct tTrflexibilityproduct, WritableOptionCall<TTrflexibilityproductCB, DeleteOption<TTrflexibilityproductCB>> opLambda) {
        doDelete(tTrflexibilityproduct, createDeleteOption(opLambda));
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as deleteNonstrict(entity).
     * @param tTrflexibilityproduct The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(TTrflexibilityproduct tTrflexibilityproduct, WritableOptionCall<TTrflexibilityproductCB, DeleteOption<TTrflexibilityproductCB>> opLambda) {
        doDeleteNonstrict(tTrflexibilityproduct, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param tTrflexibilityproductList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<TTrflexibilityproduct> tTrflexibilityproductList, WritableOptionCall<TTrflexibilityproductCB, InsertOption<TTrflexibilityproductCB>> opLambda) {
        return doBatchInsert(tTrflexibilityproductList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param tTrflexibilityproductList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<TTrflexibilityproduct> tTrflexibilityproductList, WritableOptionCall<TTrflexibilityproductCB, UpdateOption<TTrflexibilityproductCB>> opLambda) {
        return doBatchUpdate(tTrflexibilityproductList, createUpdateOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param tTrflexibilityproductList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<TTrflexibilityproduct> tTrflexibilityproductList, WritableOptionCall<TTrflexibilityproductCB, UpdateOption<TTrflexibilityproductCB>> opLambda) {
        return doBatchUpdateNonstrict(tTrflexibilityproductList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param tTrflexibilityproductList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<TTrflexibilityproduct> tTrflexibilityproductList, WritableOptionCall<TTrflexibilityproductCB, DeleteOption<TTrflexibilityproductCB>> opLambda) {
        return doBatchDelete(tTrflexibilityproductList, createDeleteOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param tTrflexibilityproductList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<TTrflexibilityproduct> tTrflexibilityproductList, WritableOptionCall<TTrflexibilityproductCB, DeleteOption<TTrflexibilityproductCB>> opLambda) {
        return doBatchDeleteNonstrict(tTrflexibilityproductList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<TTrflexibilityproduct, TTrflexibilityproductCB> manyArgLambda, WritableOptionCall<TTrflexibilityproductCB, InsertOption<TTrflexibilityproductCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * TTrflexibilityproduct tTrflexibilityproduct = <span style="color: #70226C">new</span> TTrflexibilityproduct();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//tTrflexibilityproduct.setPK...(value);</span>
     * tTrflexibilityproduct.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tTrflexibilityproduct.setVersionNo(value);</span>
     * TTrflexibilityproductCB cb = <span style="color: #70226C">new</span> TTrflexibilityproductCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">tTrflexibilityproductBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(tTrflexibilityproduct, cb, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param tTrflexibilityproduct The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of TTrflexibilityproduct. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(TTrflexibilityproduct tTrflexibilityproduct, TTrflexibilityproductCB cb, WritableOptionCall<TTrflexibilityproductCB, UpdateOption<TTrflexibilityproductCB>> opLambda) {
        return doQueryUpdate(tTrflexibilityproduct, cb, createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * @param cb The condition-bean of TTrflexibilityproduct. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(TTrflexibilityproductCB cb, WritableOptionCall<TTrflexibilityproductCB, DeleteOption<TTrflexibilityproductCB>> opLambda) {
        return doQueryDelete(cb, createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span>
     * tTrflexibilityproductBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span>
     * tTrflexibilityproductBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * tTrflexibilityproductBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * tTrflexibilityproductBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * tTrflexibilityproductBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * tTrflexibilityproductBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * tTrflexibilityproductBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span>
     * tTrflexibilityproductBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * tTrflexibilityproductBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * tTrflexibilityproductBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * tTrflexibilityproductBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * tTrflexibilityproductBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * tTrflexibilityproductBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span>
     * tTrflexibilityproductBhv.outideSql().removeBlockComment().selectList()
     * tTrflexibilityproductBhv.outideSql().removeLineComment().selectList()
     * tTrflexibilityproductBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlBasicExecutor<TTrflexibilityproductBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<TTrflexibilityproductBhv> facadeExecutor = doOutsideSql();
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
    protected Class<? extends TTrflexibilityproduct> typeOfSelectedEntity() { return TTrflexibilityproduct.class; }
    protected Class<TTrflexibilityproduct> typeOfHandlingEntity() { return TTrflexibilityproduct.class; }
    protected Class<TTrflexibilityproductCB> typeOfHandlingConditionBean() { return TTrflexibilityproductCB.class; }
}
