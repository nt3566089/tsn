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
 * The behavior of T_CENTER_SYMBOL as TABLE. <br>
 * <pre>
 * [primary key]
 *     CENTER_SYMBOL_ID
 *
 * [column]
 *     CENTER_SYMBOL_ID, CENTER_ID, CLIENT_ID, PALLET_ID, TRSYMBOL_ID, CHILD_CENTER_SYMBOL_ID, SORTSTOCK_NUMBER, QR_CODE, LOT_ID, CASE_MOVE_STS, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     CENTER_SYMBOL_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     M_CENTER, T_CENTER_SYMBOL, M_CLIENT, T_PALLET, T_TRSYMBOL
 *
 * [referrer table]
 *     T_CENTER_SYMBOL
 *
 * [foreign property]
 *     mCenter, tCenterSymbolSelf, mClient, tPallet, tTrsymbol
 *
 * [referrer property]
 *     tCenterSymbolSelfList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsTCenterSymbolBhv extends AbstractBehaviorWritable<TCenterSymbol, TCenterSymbolCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public TCenterSymbolDbm asDBMeta() { return TCenterSymbolDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "T_CENTER_SYMBOL"; }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public TCenterSymbolDbm getMyDBMeta() { return TCenterSymbolDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public TCenterSymbolCB newConditionBean() { return new TCenterSymbolCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public TCenterSymbol newMyEntity() { return new TCenterSymbol(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public TCenterSymbolCB newMyConditionBean() { return new TCenterSymbolCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * TCenterSymbolCB cb = <span style="color: #70226C">new</span> TCenterSymbolCB();
     * cb.query().setFoo...(value);
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">tCenterSymbolBhv</span>.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of TCenterSymbol. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(TCenterSymbolCB cb) {
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
     * TCenterSymbolCB cb = <span style="color: #70226C">new</span> TCenterSymbolCB();
     * cb.query().setFoo...(value);
     * TCenterSymbol tCenterSymbol = <span style="color: #0000C0">tCenterSymbolBhv</span>.<span style="color: #DD4747">selectEntity</span>(cb);
     * <span style="color: #70226C">if</span> (tCenterSymbol != <span style="color: #70226C">null</span>) { <span style="color: #3F7E5E">// null check</span>
     *     ... = tCenterSymbol.get...();
     * } <span style="color: #70226C">else</span> {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of TCenterSymbol. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TCenterSymbol selectEntity(TCenterSymbolCB cb) {
        return facadeSelectEntity(cb);
    }

    protected TCenterSymbol facadeSelectEntity(TCenterSymbolCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends TCenterSymbol> OptionalEntity<ENTITY> doSelectOptionalEntity(TCenterSymbolCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * TCenterSymbolCB cb = <span style="color: #70226C">new</span> TCenterSymbolCB();
     * cb.query().set...;
     * TCenterSymbol tCenterSymbol = <span style="color: #0000C0">tCenterSymbolBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = tCenterSymbol.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of TCenterSymbol. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TCenterSymbol selectEntityWithDeletedCheck(TCenterSymbolCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param centerSymbolId : PK, ID, UQ+, IX, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TCenterSymbol selectByPKValue(Long centerSymbolId) {
        return facadeSelectByPKValue(centerSymbolId);
    }

    protected TCenterSymbol facadeSelectByPKValue(Long centerSymbolId) {
        return doSelectByPK(centerSymbolId, typeOfSelectedEntity());
    }

    protected <ENTITY extends TCenterSymbol> ENTITY doSelectByPK(Long centerSymbolId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(centerSymbolId), tp);
    }

    protected <ENTITY extends TCenterSymbol> OptionalEntity<ENTITY> doSelectOptionalByPK(Long centerSymbolId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(centerSymbolId, tp), centerSymbolId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param centerSymbolId : PK, ID, UQ+, IX, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TCenterSymbol selectByPKValueWithDeletedCheck(Long centerSymbolId) {
        return doSelectByPKWithDeletedCheck(centerSymbolId, typeOfSelectedEntity());
    }

    protected <ENTITY extends TCenterSymbol> ENTITY doSelectByPKWithDeletedCheck(Long centerSymbolId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(centerSymbolId), tp);
    }

    protected TCenterSymbolCB xprepareCBAsPK(Long centerSymbolId) {
        assertObjectNotNull("centerSymbolId", centerSymbolId);
        return newConditionBean().acceptPK(centerSymbolId);
    }

    /**
     * Select the entity by the unique-key value.
     * @param centerSymbolId : PK, ID, UQ+, IX, NotNull, bigint identity(19). (NotNull)
     * @param sortstockNumber : +UQ, bigint(19). (NotNull)
     * @return The optional entity selected by the unique key. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<TCenterSymbol> selectByUniqueOf(Long centerSymbolId, Long sortstockNumber) {
        return facadeSelectByUniqueOf(centerSymbolId, sortstockNumber);
    }

    protected OptionalEntity<TCenterSymbol> facadeSelectByUniqueOf(Long centerSymbolId, Long sortstockNumber) {
        return doSelectByUniqueOf(centerSymbolId, sortstockNumber, typeOfSelectedEntity());
    }

    protected <ENTITY extends TCenterSymbol> OptionalEntity<ENTITY> doSelectByUniqueOf(Long centerSymbolId, Long sortstockNumber, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(xprepareCBAsUniqueOf(centerSymbolId, sortstockNumber), tp), centerSymbolId, sortstockNumber);
    }

    protected TCenterSymbolCB xprepareCBAsUniqueOf(Long centerSymbolId, Long sortstockNumber) {
        assertObjectNotNull("centerSymbolId", centerSymbolId);assertObjectNotNull("sortstockNumber", sortstockNumber);
        return newConditionBean().acceptUniqueOf(centerSymbolId, sortstockNumber);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * TCenterSymbolCB cb = <span style="color: #70226C">new</span> TCenterSymbolCB();
     * cb.query().set...;
     * cb.query().addOrderBy...;
     * ListResultBean&lt;TCenterSymbol&gt; <span style="color: #553000">tCenterSymbolList</span> = <span style="color: #0000C0">tCenterSymbolBhv</span>.<span style="color: #CC4747">selectList</span>(cb);
     * <span style="color: #70226C">for</span> (TCenterSymbol tCenterSymbol : <span style="color: #553000">tCenterSymbolList</span>) {
     *     ... = tCenterSymbol.get...;
     * }
     * </pre>
     * @param cb The condition-bean of TCenterSymbol. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<TCenterSymbol> selectList(TCenterSymbolCB cb) {
        return facadeSelectList(cb);
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * TCenterSymbolCB cb = <span style="color: #70226C">new</span> TCenterSymbolCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;TCenterSymbol&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">tCenterSymbolBhv</span>.<span style="color: #CC4747">selectPage</span>(cb);
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (TCenterSymbol tCenterSymbol : <span style="color: #553000">page</span>) {
     *     ... = tCenterSymbol.get...();
     * }
     * </pre>
     * @param cb The condition-bean of TCenterSymbol. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<TCenterSymbol> selectPage(TCenterSymbolCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * TCenterSymbolCB cb = <span style="color: #70226C">new</span> TCenterSymbolCB();
     * cb.query().set...
     * <span style="color: #0000C0">tCenterSymbolBhv</span>.<span style="color: #CC4747">selectCursor</span>(cb, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cb The condition-bean of TCenterSymbol. (NotNull)
     * @param entityRowHandler The handler of entity row of TCenterSymbol. (NotNull)
     */
    public void selectCursor(TCenterSymbolCB cb, EntityRowHandler<TCenterSymbol> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">tCenterSymbolBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<TCenterSymbolCB, RESULT> selectScalar(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">tCenterSymbolBhv</span>.<span style="color: #CC4747">scalarSelect</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<TCenterSymbolCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param tCenterSymbolList The entity list of TCenterSymbol. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<TCenterSymbol> tCenterSymbolList, ReferrerLoaderHandler<LoaderOfTCenterSymbol> loaderLambda) {
        xassLRArg(tCenterSymbolList, loaderLambda);
        loaderLambda.handle(new LoaderOfTCenterSymbol().ready(tCenterSymbolList, _behaviorSelector));
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
     * @param tCenterSymbol The entity of TCenterSymbol. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(TCenterSymbol tCenterSymbol, ReferrerLoaderHandler<LoaderOfTCenterSymbol> loaderLambda) {
        xassLRArg(tCenterSymbol, loaderLambda);
        loaderLambda.handle(new LoaderOfTCenterSymbol().ready(xnewLRAryLs(tCenterSymbol), _behaviorSelector));
    }

    /**
     * Load referrer of TCenterSymbolSelfList by the set-upper of referrer. <br>
     * T_CENTER_SYMBOL by CHILD_CENTER_SYMBOL_ID, named 'TCenterSymbolSelfList'.
     * <pre>
     * <span style="color: #0000C0">tCenterSymbolBhv</span>.<span style="color: #CC4747">loadTCenterSymbolSelfList</span>(<span style="color: #553000">tCenterSymbolList</span>, <span style="color: #553000">symbolCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">symbolCB</span>.setupSelect...
     *     <span style="color: #553000">symbolCB</span>.query().set...
     *     <span style="color: #553000">symbolCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (TCenterSymbol tCenterSymbol : <span style="color: #553000">tCenterSymbolList</span>) {
     *     ... = tCenterSymbol.<span style="color: #CC4747">getTCenterSymbolSelfList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setChildCenterSymbolId_InScope(pkList);
     * cb.query().addOrderBy_ChildCenterSymbolId_Asc();
     * </pre>
     * @param tCenterSymbolList The entity list of TCenterSymbol. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TCenterSymbol> loadTCenterSymbolSelfList(List<TCenterSymbol> tCenterSymbolList, ConditionBeanSetupper<TCenterSymbolCB> refCBLambda) {
        xassLRArg(tCenterSymbolList, refCBLambda);
        return doLoadTCenterSymbolSelfList(tCenterSymbolList, new LoadReferrerOption<TCenterSymbolCB, TCenterSymbol>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TCenterSymbolSelfList by the set-upper of referrer. <br>
     * T_CENTER_SYMBOL by CHILD_CENTER_SYMBOL_ID, named 'TCenterSymbolSelfList'.
     * <pre>
     * <span style="color: #0000C0">tCenterSymbolBhv</span>.<span style="color: #CC4747">loadTCenterSymbolSelfList</span>(<span style="color: #553000">tCenterSymbol</span>, <span style="color: #553000">symbolCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">symbolCB</span>.setupSelect...
     *     <span style="color: #553000">symbolCB</span>.query().set...
     *     <span style="color: #553000">symbolCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">tCenterSymbol</span>.<span style="color: #CC4747">getTCenterSymbolSelfList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setChildCenterSymbolId_InScope(pkList);
     * cb.query().addOrderBy_ChildCenterSymbolId_Asc();
     * </pre>
     * @param tCenterSymbol The entity of TCenterSymbol. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TCenterSymbol> loadTCenterSymbolSelfList(TCenterSymbol tCenterSymbol, ConditionBeanSetupper<TCenterSymbolCB> refCBLambda) {
        xassLRArg(tCenterSymbol, refCBLambda);
        return doLoadTCenterSymbolSelfList(xnewLRLs(tCenterSymbol), new LoadReferrerOption<TCenterSymbolCB, TCenterSymbol>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param tCenterSymbol The entity of TCenterSymbol. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TCenterSymbol> loadTCenterSymbolSelfList(TCenterSymbol tCenterSymbol, LoadReferrerOption<TCenterSymbolCB, TCenterSymbol> loadReferrerOption) {
        xassLRArg(tCenterSymbol, loadReferrerOption);
        return loadTCenterSymbolSelfList(xnewLRLs(tCenterSymbol), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param tCenterSymbolList The entity list of TCenterSymbol. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TCenterSymbol> loadTCenterSymbolSelfList(List<TCenterSymbol> tCenterSymbolList, LoadReferrerOption<TCenterSymbolCB, TCenterSymbol> loadReferrerOption) {
        xassLRArg(tCenterSymbolList, loadReferrerOption);
        if (tCenterSymbolList.isEmpty()) { return (NestedReferrerListGateway<TCenterSymbol>)EMPTY_NREF_LGWAY; }
        return doLoadTCenterSymbolSelfList(tCenterSymbolList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TCenterSymbol> doLoadTCenterSymbolSelfList(List<TCenterSymbol> tCenterSymbolList, LoadReferrerOption<TCenterSymbolCB, TCenterSymbol> option) {
        return helpLoadReferrerInternally(tCenterSymbolList, option, "tCenterSymbolSelfList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'MCenter'.
     * @param tCenterSymbolList The list of tCenterSymbol. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MCenter> pulloutMCenter(List<TCenterSymbol> tCenterSymbolList)
    { return helpPulloutInternally(tCenterSymbolList, "mCenter"); }

    /**
     * Pull out the list of foreign table 'TCenterSymbol'.
     * @param tCenterSymbolList The list of tCenterSymbol. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<TCenterSymbol> pulloutTCenterSymbolSelf(List<TCenterSymbol> tCenterSymbolList)
    { return helpPulloutInternally(tCenterSymbolList, "tCenterSymbolSelf"); }

    /**
     * Pull out the list of foreign table 'MClient'.
     * @param tCenterSymbolList The list of tCenterSymbol. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MClient> pulloutMClient(List<TCenterSymbol> tCenterSymbolList)
    { return helpPulloutInternally(tCenterSymbolList, "mClient"); }

    /**
     * Pull out the list of foreign table 'TPallet'.
     * @param tCenterSymbolList The list of tCenterSymbol. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<TPallet> pulloutTPallet(List<TCenterSymbol> tCenterSymbolList)
    { return helpPulloutInternally(tCenterSymbolList, "tPallet"); }

    /**
     * Pull out the list of foreign table 'TTrsymbol'.
     * @param tCenterSymbolList The list of tCenterSymbol. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<TTrsymbol> pulloutTTrsymbol(List<TCenterSymbol> tCenterSymbolList)
    { return helpPulloutInternally(tCenterSymbolList, "tTrsymbol"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key centerSymbolId.
     * @param tCenterSymbolList The list of tCenterSymbol. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractCenterSymbolIdList(List<TCenterSymbol> tCenterSymbolList)
    { return helpExtractListInternally(tCenterSymbolList, "centerSymbolId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * TCenterSymbol tCenterSymbol = <span style="color: #70226C">new</span> TCenterSymbol();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * tCenterSymbol.setFoo...(value);
     * tCenterSymbol.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tCenterSymbol.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tCenterSymbol.set...;</span>
     * <span style="color: #0000C0">tCenterSymbolBhv</span>.<span style="color: #CC4747">insert</span>(tCenterSymbol);
     * ... = tCenterSymbol.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param tCenterSymbol The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(TCenterSymbol tCenterSymbol) {
        doInsert(tCenterSymbol, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * TCenterSymbol tCenterSymbol = <span style="color: #70226C">new</span> TCenterSymbol();
     * tCenterSymbol.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tCenterSymbol.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tCenterSymbol.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tCenterSymbol.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * tCenterSymbol.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">tCenterSymbolBhv</span>.<span style="color: #CC4747">update</span>(tCenterSymbol);
     * </pre>
     * @param tCenterSymbol The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(TCenterSymbol tCenterSymbol) {
        doUpdate(tCenterSymbol, null);
    }

    /**
     * Update the entity non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * TCenterSymbol tCenterSymbol = <span style="color: #70226C">new</span> TCenterSymbol();
     * tCenterSymbol.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tCenterSymbol.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tCenterSymbol.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tCenterSymbol.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tCenterSymbol.setVersionNo(value);</span>
     * <span style="color: #0000C0">tCenterSymbolBhv</span>.<span style="color: #CC4747">updateNonstrict</span>(tCenterSymbol);
     * </pre>
     * @param tCenterSymbol The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(TCenterSymbol tCenterSymbol) {
        doUpdateNonstrict(tCenterSymbol, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param tCenterSymbol The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(TCenterSymbol tCenterSymbol) {
        doInsertOrUpdate(tCenterSymbol, null, null);
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param tCenterSymbol The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(TCenterSymbol tCenterSymbol) {
        doInsertOrUpdateNonstrict(tCenterSymbol, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * TCenterSymbol tCenterSymbol = <span style="color: #70226C">new</span> TCenterSymbol();
     * tCenterSymbol.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * tCenterSymbol.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">tCenterSymbolBhv</span>.<span style="color: #CC4747">delete</span>(tCenterSymbol);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param tCenterSymbol The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(TCenterSymbol tCenterSymbol) {
        doDelete(tCenterSymbol, null);
    }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl} <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * TCenterSymbol tCenterSymbol = <span style="color: #70226C">new</span> TCenterSymbol();
     * tCenterSymbol.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tCenterSymbol.setVersionNo(value);</span>
     * <span style="color: #0000C0">tCenterSymbolBhv</span>.<span style="color: #CC4747">deleteNonstrict</span>(tCenterSymbol);
     * </pre>
     * @param tCenterSymbol The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(TCenterSymbol tCenterSymbol) {
        doDeleteNonstrict(tCenterSymbol, null);
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * TCenterSymbol tCenterSymbol = <span style="color: #70226C">new</span> TCenterSymbol();
     * tCenterSymbol.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tCenterSymbol.setVersionNo(value);</span>
     * <span style="color: #0000C0">tCenterSymbolBhv</span>.<span style="color: #CC4747">deleteNonstrictIgnoreDeleted</span>(tCenterSymbol);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param tCenterSymbol The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(TCenterSymbol tCenterSymbol) {
        doDeleteNonstrictIgnoreDeleted(tCenterSymbol, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(TCenterSymbol et, final DeleteOption<TCenterSymbolCB> op) {
        assertObjectNotNull("tCenterSymbol", et); prepareDeleteOption(op); helpDeleteNonstrictIgnoreDeletedInternally(et, op);
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
     *     TCenterSymbol tCenterSymbol = <span style="color: #70226C">new</span> TCenterSymbol();
     *     tCenterSymbol.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         tCenterSymbol.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     tCenterSymbolList.add(tCenterSymbol);
     * }
     * <span style="color: #0000C0">tCenterSymbolBhv</span>.<span style="color: #CC4747">batchInsert</span>(tCenterSymbolList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param tCenterSymbolList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<TCenterSymbol> tCenterSymbolList) {
        return doBatchInsert(tCenterSymbolList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     TCenterSymbol tCenterSymbol = <span style="color: #70226C">new</span> TCenterSymbol();
     *     tCenterSymbol.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         tCenterSymbol.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         tCenterSymbol.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//tCenterSymbol.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     tCenterSymbolList.add(tCenterSymbol);
     * }
     * <span style="color: #0000C0">tCenterSymbolBhv</span>.<span style="color: #CC4747">batchUpdate</span>(tCenterSymbolList);
     * </pre>
     * @param tCenterSymbolList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<TCenterSymbol> tCenterSymbolList) {
        return doBatchUpdate(tCenterSymbolList, null);
    }

    /**
     * Batch-update the entity list specified-only. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * tCenterSymbolBhv.<span style="color: #CC4747">batchUpdate</span>(tCenterSymbolList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">tCenterSymbolBhv</span>.<span style="color: #CC4747">batchUpdate</span>(tCenterSymbolList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param tCenterSymbolList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<TCenterSymbol> tCenterSymbolList, SpecifyQuery<TCenterSymbolCB> colCBLambda) {
        return doBatchUpdate(tCenterSymbolList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * <span style="color: #70226C">for</span> (... : ...) {
     *     TCenterSymbol tCenterSymbol = <span style="color: #70226C">new</span> TCenterSymbol();
     *     tCenterSymbol.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         tCenterSymbol.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         tCenterSymbol.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//tCenterSymbol.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     tCenterSymbolList.add(tCenterSymbol);
     * }
     * <span style="color: #0000C0">tCenterSymbolBhv</span>.<span style="color: #CC4747">batchUpdate</span>(tCenterSymbolList);
     * </pre>
     * @param tCenterSymbolList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<TCenterSymbol> tCenterSymbolList) {
        return doBatchUpdateNonstrict(tCenterSymbolList, null);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * <span style="color: #0000C0">tCenterSymbolBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(tCenterSymbolList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">tCenterSymbolBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(tCenterSymbolList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).</p>
     * @param tCenterSymbolList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<TCenterSymbol> tCenterSymbolList, SpecifyQuery<TCenterSymbolCB> colCBLambda) {
        return doBatchUpdateNonstrict(tCenterSymbolList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param tCenterSymbolList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<TCenterSymbol> tCenterSymbolList) {
        return doBatchDelete(tCenterSymbolList, null);
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param tCenterSymbolList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<TCenterSymbol> tCenterSymbolList) {
        return doBatchDeleteNonstrict(tCenterSymbolList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">tCenterSymbolBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;TCenterSymbol, TCenterSymbolCB&gt;() {
     *     public ConditionBean setup(TCenterSymbol entity, TCenterSymbolCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<TCenterSymbol, TCenterSymbolCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * TCenterSymbol tCenterSymbol = <span style="color: #70226C">new</span> TCenterSymbol();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//tCenterSymbol.setPK...(value);</span>
     * tCenterSymbol.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tCenterSymbol.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tCenterSymbol.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tCenterSymbol.setVersionNo(value);</span>
     * TCenterSymbolCB cb = <span style="color: #70226C">new</span> TCenterSymbolCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">tCenterSymbolBhv</span>.<span style="color: #CC4747">queryUpdate</span>(tCenterSymbol, cb);
     * </pre>
     * @param tCenterSymbol The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of TCenterSymbol. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(TCenterSymbol tCenterSymbol, TCenterSymbolCB cb) {
        return doQueryUpdate(tCenterSymbol, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * TCenterSymbolCB cb = new TCenterSymbolCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">tCenterSymbolBhv</span>.<span style="color: #CC4747">queryDelete</span>(tCenterSymbol, cb);
     * </pre>
     * @param cb The condition-bean of TCenterSymbol. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(TCenterSymbolCB cb) {
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
     * TCenterSymbol tCenterSymbol = <span style="color: #70226C">new</span> TCenterSymbol();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * tCenterSymbol.setFoo...(value);
     * tCenterSymbol.setBar...(value);
     * <span style="color: #0000C0">tCenterSymbolBhv</span>.<span style="color: #CC4747">varyingInsert</span>(tCenterSymbol, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = tCenterSymbol.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param tCenterSymbol The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(TCenterSymbol tCenterSymbol, WritableOptionCall<TCenterSymbolCB, InsertOption<TCenterSymbolCB>> opLambda) {
        doInsert(tCenterSymbol, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * TCenterSymbol tCenterSymbol = <span style="color: #70226C">new</span> TCenterSymbol();
     * tCenterSymbol.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tCenterSymbol.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * tCenterSymbol.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">tCenterSymbolBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(tCenterSymbol, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param tCenterSymbol The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(TCenterSymbol tCenterSymbol, WritableOptionCall<TCenterSymbolCB, UpdateOption<TCenterSymbolCB>> opLambda) {
        doUpdate(tCenterSymbol, createUpdateOption(opLambda));
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * TCenterSymbol tCenterSymbol = <span style="color: #70226C">new</span> TCenterSymbol();
     * tCenterSymbol.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tCenterSymbol.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tCenterSymbol.setVersionNo(value);</span>
     * <span style="color: #0000C0">tCenterSymbolBhv</span>.<span style="color: #CC4747">varyingUpdateNonstrict</span>(tCenterSymbol, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param tCenterSymbol The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(TCenterSymbol tCenterSymbol, WritableOptionCall<TCenterSymbolCB, UpdateOption<TCenterSymbolCB>> opLambda) {
        doUpdateNonstrict(tCenterSymbol, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param tCenterSymbol The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(TCenterSymbol tCenterSymbol, WritableOptionCall<TCenterSymbolCB, InsertOption<TCenterSymbolCB>> insertOpLambda, WritableOptionCall<TCenterSymbolCB, UpdateOption<TCenterSymbolCB>> updateOpLambda) {
        doInsertOrUpdate(tCenterSymbol, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param tCenterSymbol The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(TCenterSymbol tCenterSymbol, WritableOptionCall<TCenterSymbolCB, InsertOption<TCenterSymbolCB>> insertOpLambda, WritableOptionCall<TCenterSymbolCB, UpdateOption<TCenterSymbolCB>> updateOpLambda) {
        doInsertOrUpdateNonstrict(tCenterSymbol, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param tCenterSymbol The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(TCenterSymbol tCenterSymbol, WritableOptionCall<TCenterSymbolCB, DeleteOption<TCenterSymbolCB>> opLambda) {
        doDelete(tCenterSymbol, createDeleteOption(opLambda));
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as deleteNonstrict(entity).
     * @param tCenterSymbol The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(TCenterSymbol tCenterSymbol, WritableOptionCall<TCenterSymbolCB, DeleteOption<TCenterSymbolCB>> opLambda) {
        doDeleteNonstrict(tCenterSymbol, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param tCenterSymbolList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<TCenterSymbol> tCenterSymbolList, WritableOptionCall<TCenterSymbolCB, InsertOption<TCenterSymbolCB>> opLambda) {
        return doBatchInsert(tCenterSymbolList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param tCenterSymbolList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<TCenterSymbol> tCenterSymbolList, WritableOptionCall<TCenterSymbolCB, UpdateOption<TCenterSymbolCB>> opLambda) {
        return doBatchUpdate(tCenterSymbolList, createUpdateOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param tCenterSymbolList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<TCenterSymbol> tCenterSymbolList, WritableOptionCall<TCenterSymbolCB, UpdateOption<TCenterSymbolCB>> opLambda) {
        return doBatchUpdateNonstrict(tCenterSymbolList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param tCenterSymbolList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<TCenterSymbol> tCenterSymbolList, WritableOptionCall<TCenterSymbolCB, DeleteOption<TCenterSymbolCB>> opLambda) {
        return doBatchDelete(tCenterSymbolList, createDeleteOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param tCenterSymbolList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<TCenterSymbol> tCenterSymbolList, WritableOptionCall<TCenterSymbolCB, DeleteOption<TCenterSymbolCB>> opLambda) {
        return doBatchDeleteNonstrict(tCenterSymbolList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<TCenterSymbol, TCenterSymbolCB> manyArgLambda, WritableOptionCall<TCenterSymbolCB, InsertOption<TCenterSymbolCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * TCenterSymbol tCenterSymbol = <span style="color: #70226C">new</span> TCenterSymbol();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//tCenterSymbol.setPK...(value);</span>
     * tCenterSymbol.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tCenterSymbol.setVersionNo(value);</span>
     * TCenterSymbolCB cb = <span style="color: #70226C">new</span> TCenterSymbolCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">tCenterSymbolBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(tCenterSymbol, cb, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param tCenterSymbol The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of TCenterSymbol. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(TCenterSymbol tCenterSymbol, TCenterSymbolCB cb, WritableOptionCall<TCenterSymbolCB, UpdateOption<TCenterSymbolCB>> opLambda) {
        return doQueryUpdate(tCenterSymbol, cb, createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * @param cb The condition-bean of TCenterSymbol. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(TCenterSymbolCB cb, WritableOptionCall<TCenterSymbolCB, DeleteOption<TCenterSymbolCB>> opLambda) {
        return doQueryDelete(cb, createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span>
     * tCenterSymbolBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span>
     * tCenterSymbolBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * tCenterSymbolBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * tCenterSymbolBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * tCenterSymbolBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * tCenterSymbolBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * tCenterSymbolBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span>
     * tCenterSymbolBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * tCenterSymbolBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * tCenterSymbolBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * tCenterSymbolBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * tCenterSymbolBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * tCenterSymbolBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span>
     * tCenterSymbolBhv.outideSql().removeBlockComment().selectList()
     * tCenterSymbolBhv.outideSql().removeLineComment().selectList()
     * tCenterSymbolBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlBasicExecutor<TCenterSymbolBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<TCenterSymbolBhv> facadeExecutor = doOutsideSql();
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
    protected Class<? extends TCenterSymbol> typeOfSelectedEntity() { return TCenterSymbol.class; }
    protected Class<TCenterSymbol> typeOfHandlingEntity() { return TCenterSymbol.class; }
    protected Class<TCenterSymbolCB> typeOfHandlingConditionBean() { return TCenterSymbolCB.class; }
}
