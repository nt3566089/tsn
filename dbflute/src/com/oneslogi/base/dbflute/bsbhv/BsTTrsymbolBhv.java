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
 * The behavior of T_TRSYMBOL as TABLE. <br>
 * <pre>
 * [primary key]
 *     TRSYMBOL_ID
 *
 * [column]
 *     TRSYMBOL_ID, CASECD, PRODUCT_CD, ITEMCD, PRODUCT_CD_CASE, PRODUCT_CD_IN, LOT3, DESIGNCD_IN, DESIGNCD_CASE, LOT4, LOT1, LOT2, SYMBOLLINENO, OWNERCD, STOCK_TYPE_CD, FOREIGNCARGOFLG, CUSTOMSRELEASEFLG, DAMAGEFLG, RECEIVE_PLAN_H_ID, RECEIVE_PLAN_B_ID, RCVLINENO, SENDRCVKEY, MAKERCASENO, SYMBOLSTS, SYMBOLADDFLG, PRINTEDFLG, SYMBOLSNDDATE, SYMBOLPASTDATE, SYMBOLPALLETONDATE, RECEIVEDATE, PALLET_ID, BASE_PALLET_ID, PARENTPALLETUPDDATE, PRINTINGDATE, LOCATION_ID, RESTQTY, RECEIVEDQTY, DISTRIBUTIONCD, TRANSPORTCD, ORDERNO, RCV_PALLET_ID, SYMBOLFACTORYCD, SYMBOLITEMCD, SYMBOLSKU, SYMBOLRECEIVECD, SYMBOLPRODUCTMARK, SYMBOLORDERNO, SYMBOLPRINTERNO, SYMBOLMAKENO, SYMBOLLOT4, SYMBOLMAKETIME, SYMBOLCIRCULATIONID, SYMBOLRCVKEY, SYMBOLLOT3, QRData, TREXAMRESULT_ID, CASEITFNO, CASEBARCODEVALIANT, CASELOT4, DATETIME, CASECENTERNO, CASEPACKNO, CASEPACKTIME, CASEBARCODE, MIXEDFLG, SHIPPEDFLG, CASECREATETYPE, CREATEDATETIME, InitNum, ParentCaseCd, TR_PICKLIST_ID, PicklistGNo, RecombDatetime, ReprintedFlg, TraceSts, CLIENT_ID, BATJPRODUCTIONYM, COMETODATE, RCVPALLETNO, TAXPALLETNO, SHTYPECD, CENTER_ID, RESTCTN, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TRSYMBOL_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     T_CENTER_SYMBOL
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     tCenterSymbolList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsTTrsymbolBhv extends AbstractBehaviorWritable<TTrsymbol, TTrsymbolCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /** 段ボール情報を取得します。 */
    public static final String PATH_selectSqlCardboardMoveHistoryList = "selectSqlCardboardMoveHistoryList";
    /** 段ボール情報をリスト検索、ケース情報を取得する。 */
    public static final String PATH_selectSqlTTrsymbolCorrectList = "selectSqlTTrsymbolCorrectList";
    /** 段ボール情報取得 */
    public static final String PATH_selectSqlTTrsymbolInventoryInputProductSortingPlace = "selectSqlTTrsymbolInventoryInputProductSortingPlace";
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public TTrsymbolDbm asDBMeta() { return TTrsymbolDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "T_TRSYMBOL"; }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public TTrsymbolDbm getMyDBMeta() { return TTrsymbolDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public TTrsymbolCB newConditionBean() { return new TTrsymbolCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public TTrsymbol newMyEntity() { return new TTrsymbol(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public TTrsymbolCB newMyConditionBean() { return new TTrsymbolCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * TTrsymbolCB cb = <span style="color: #70226C">new</span> TTrsymbolCB();
     * cb.query().setFoo...(value);
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">tTrsymbolBhv</span>.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of TTrsymbol. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(TTrsymbolCB cb) {
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
     * TTrsymbolCB cb = <span style="color: #70226C">new</span> TTrsymbolCB();
     * cb.query().setFoo...(value);
     * TTrsymbol tTrsymbol = <span style="color: #0000C0">tTrsymbolBhv</span>.<span style="color: #DD4747">selectEntity</span>(cb);
     * <span style="color: #70226C">if</span> (tTrsymbol != <span style="color: #70226C">null</span>) { <span style="color: #3F7E5E">// null check</span>
     *     ... = tTrsymbol.get...();
     * } <span style="color: #70226C">else</span> {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of TTrsymbol. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TTrsymbol selectEntity(TTrsymbolCB cb) {
        return facadeSelectEntity(cb);
    }

    protected TTrsymbol facadeSelectEntity(TTrsymbolCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends TTrsymbol> OptionalEntity<ENTITY> doSelectOptionalEntity(TTrsymbolCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * TTrsymbolCB cb = <span style="color: #70226C">new</span> TTrsymbolCB();
     * cb.query().set...;
     * TTrsymbol tTrsymbol = <span style="color: #0000C0">tTrsymbolBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = tTrsymbol.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of TTrsymbol. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TTrsymbol selectEntityWithDeletedCheck(TTrsymbolCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param trsymbolId : PK, ID, IX, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TTrsymbol selectByPKValue(Long trsymbolId) {
        return facadeSelectByPKValue(trsymbolId);
    }

    protected TTrsymbol facadeSelectByPKValue(Long trsymbolId) {
        return doSelectByPK(trsymbolId, typeOfSelectedEntity());
    }

    protected <ENTITY extends TTrsymbol> ENTITY doSelectByPK(Long trsymbolId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(trsymbolId), tp);
    }

    protected <ENTITY extends TTrsymbol> OptionalEntity<ENTITY> doSelectOptionalByPK(Long trsymbolId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(trsymbolId, tp), trsymbolId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param trsymbolId : PK, ID, IX, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TTrsymbol selectByPKValueWithDeletedCheck(Long trsymbolId) {
        return doSelectByPKWithDeletedCheck(trsymbolId, typeOfSelectedEntity());
    }

    protected <ENTITY extends TTrsymbol> ENTITY doSelectByPKWithDeletedCheck(Long trsymbolId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(trsymbolId), tp);
    }

    protected TTrsymbolCB xprepareCBAsPK(Long trsymbolId) {
        assertObjectNotNull("trsymbolId", trsymbolId);
        return newConditionBean().acceptPK(trsymbolId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * TTrsymbolCB cb = <span style="color: #70226C">new</span> TTrsymbolCB();
     * cb.query().set...;
     * cb.query().addOrderBy...;
     * ListResultBean&lt;TTrsymbol&gt; <span style="color: #553000">tTrsymbolList</span> = <span style="color: #0000C0">tTrsymbolBhv</span>.<span style="color: #CC4747">selectList</span>(cb);
     * <span style="color: #70226C">for</span> (TTrsymbol tTrsymbol : <span style="color: #553000">tTrsymbolList</span>) {
     *     ... = tTrsymbol.get...;
     * }
     * </pre>
     * @param cb The condition-bean of TTrsymbol. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<TTrsymbol> selectList(TTrsymbolCB cb) {
        return facadeSelectList(cb);
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * TTrsymbolCB cb = <span style="color: #70226C">new</span> TTrsymbolCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;TTrsymbol&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">tTrsymbolBhv</span>.<span style="color: #CC4747">selectPage</span>(cb);
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (TTrsymbol tTrsymbol : <span style="color: #553000">page</span>) {
     *     ... = tTrsymbol.get...();
     * }
     * </pre>
     * @param cb The condition-bean of TTrsymbol. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<TTrsymbol> selectPage(TTrsymbolCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * TTrsymbolCB cb = <span style="color: #70226C">new</span> TTrsymbolCB();
     * cb.query().set...
     * <span style="color: #0000C0">tTrsymbolBhv</span>.<span style="color: #CC4747">selectCursor</span>(cb, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cb The condition-bean of TTrsymbol. (NotNull)
     * @param entityRowHandler The handler of entity row of TTrsymbol. (NotNull)
     */
    public void selectCursor(TTrsymbolCB cb, EntityRowHandler<TTrsymbol> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">tTrsymbolBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<TTrsymbolCB, RESULT> selectScalar(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">tTrsymbolBhv</span>.<span style="color: #CC4747">scalarSelect</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<TTrsymbolCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param tTrsymbolList The entity list of TTrsymbol. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<TTrsymbol> tTrsymbolList, ReferrerLoaderHandler<LoaderOfTTrsymbol> loaderLambda) {
        xassLRArg(tTrsymbolList, loaderLambda);
        loaderLambda.handle(new LoaderOfTTrsymbol().ready(tTrsymbolList, _behaviorSelector));
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
     * @param tTrsymbol The entity of TTrsymbol. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(TTrsymbol tTrsymbol, ReferrerLoaderHandler<LoaderOfTTrsymbol> loaderLambda) {
        xassLRArg(tTrsymbol, loaderLambda);
        loaderLambda.handle(new LoaderOfTTrsymbol().ready(xnewLRAryLs(tTrsymbol), _behaviorSelector));
    }

    /**
     * Load referrer of TCenterSymbolList by the set-upper of referrer. <br>
     * T_CENTER_SYMBOL by TRSYMBOL_ID, named 'TCenterSymbolList'.
     * <pre>
     * <span style="color: #0000C0">tTrsymbolBhv</span>.<span style="color: #CC4747">loadTCenterSymbolList</span>(<span style="color: #553000">tTrsymbolList</span>, <span style="color: #553000">symbolCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">symbolCB</span>.setupSelect...
     *     <span style="color: #553000">symbolCB</span>.query().set...
     *     <span style="color: #553000">symbolCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (TTrsymbol tTrsymbol : <span style="color: #553000">tTrsymbolList</span>) {
     *     ... = tTrsymbol.<span style="color: #CC4747">getTCenterSymbolList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setTrsymbolId_InScope(pkList);
     * cb.query().addOrderBy_TrsymbolId_Asc();
     * </pre>
     * @param tTrsymbolList The entity list of TTrsymbol. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TCenterSymbol> loadTCenterSymbolList(List<TTrsymbol> tTrsymbolList, ConditionBeanSetupper<TCenterSymbolCB> refCBLambda) {
        xassLRArg(tTrsymbolList, refCBLambda);
        return doLoadTCenterSymbolList(tTrsymbolList, new LoadReferrerOption<TCenterSymbolCB, TCenterSymbol>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TCenterSymbolList by the set-upper of referrer. <br>
     * T_CENTER_SYMBOL by TRSYMBOL_ID, named 'TCenterSymbolList'.
     * <pre>
     * <span style="color: #0000C0">tTrsymbolBhv</span>.<span style="color: #CC4747">loadTCenterSymbolList</span>(<span style="color: #553000">tTrsymbol</span>, <span style="color: #553000">symbolCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">symbolCB</span>.setupSelect...
     *     <span style="color: #553000">symbolCB</span>.query().set...
     *     <span style="color: #553000">symbolCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">tTrsymbol</span>.<span style="color: #CC4747">getTCenterSymbolList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setTrsymbolId_InScope(pkList);
     * cb.query().addOrderBy_TrsymbolId_Asc();
     * </pre>
     * @param tTrsymbol The entity of TTrsymbol. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TCenterSymbol> loadTCenterSymbolList(TTrsymbol tTrsymbol, ConditionBeanSetupper<TCenterSymbolCB> refCBLambda) {
        xassLRArg(tTrsymbol, refCBLambda);
        return doLoadTCenterSymbolList(xnewLRLs(tTrsymbol), new LoadReferrerOption<TCenterSymbolCB, TCenterSymbol>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param tTrsymbol The entity of TTrsymbol. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TCenterSymbol> loadTCenterSymbolList(TTrsymbol tTrsymbol, LoadReferrerOption<TCenterSymbolCB, TCenterSymbol> loadReferrerOption) {
        xassLRArg(tTrsymbol, loadReferrerOption);
        return loadTCenterSymbolList(xnewLRLs(tTrsymbol), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param tTrsymbolList The entity list of TTrsymbol. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TCenterSymbol> loadTCenterSymbolList(List<TTrsymbol> tTrsymbolList, LoadReferrerOption<TCenterSymbolCB, TCenterSymbol> loadReferrerOption) {
        xassLRArg(tTrsymbolList, loadReferrerOption);
        if (tTrsymbolList.isEmpty()) { return (NestedReferrerListGateway<TCenterSymbol>)EMPTY_NREF_LGWAY; }
        return doLoadTCenterSymbolList(tTrsymbolList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TCenterSymbol> doLoadTCenterSymbolList(List<TTrsymbol> tTrsymbolList, LoadReferrerOption<TCenterSymbolCB, TCenterSymbol> option) {
        return helpLoadReferrerInternally(tTrsymbolList, option, "tCenterSymbolList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key trsymbolId.
     * @param tTrsymbolList The list of tTrsymbol. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractTrsymbolIdList(List<TTrsymbol> tTrsymbolList)
    { return helpExtractListInternally(tTrsymbolList, "trsymbolId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * TTrsymbol tTrsymbol = <span style="color: #70226C">new</span> TTrsymbol();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * tTrsymbol.setFoo...(value);
     * tTrsymbol.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tTrsymbol.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tTrsymbol.set...;</span>
     * <span style="color: #0000C0">tTrsymbolBhv</span>.<span style="color: #CC4747">insert</span>(tTrsymbol);
     * ... = tTrsymbol.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param tTrsymbol The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(TTrsymbol tTrsymbol) {
        doInsert(tTrsymbol, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * TTrsymbol tTrsymbol = <span style="color: #70226C">new</span> TTrsymbol();
     * tTrsymbol.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tTrsymbol.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tTrsymbol.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tTrsymbol.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * tTrsymbol.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">tTrsymbolBhv</span>.<span style="color: #CC4747">update</span>(tTrsymbol);
     * </pre>
     * @param tTrsymbol The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(TTrsymbol tTrsymbol) {
        doUpdate(tTrsymbol, null);
    }

    /**
     * Update the entity non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * TTrsymbol tTrsymbol = <span style="color: #70226C">new</span> TTrsymbol();
     * tTrsymbol.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tTrsymbol.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tTrsymbol.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tTrsymbol.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tTrsymbol.setVersionNo(value);</span>
     * <span style="color: #0000C0">tTrsymbolBhv</span>.<span style="color: #CC4747">updateNonstrict</span>(tTrsymbol);
     * </pre>
     * @param tTrsymbol The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(TTrsymbol tTrsymbol) {
        doUpdateNonstrict(tTrsymbol, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param tTrsymbol The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(TTrsymbol tTrsymbol) {
        doInsertOrUpdate(tTrsymbol, null, null);
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param tTrsymbol The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(TTrsymbol tTrsymbol) {
        doInsertOrUpdateNonstrict(tTrsymbol, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * TTrsymbol tTrsymbol = <span style="color: #70226C">new</span> TTrsymbol();
     * tTrsymbol.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * tTrsymbol.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">tTrsymbolBhv</span>.<span style="color: #CC4747">delete</span>(tTrsymbol);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param tTrsymbol The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(TTrsymbol tTrsymbol) {
        doDelete(tTrsymbol, null);
    }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl} <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * TTrsymbol tTrsymbol = <span style="color: #70226C">new</span> TTrsymbol();
     * tTrsymbol.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tTrsymbol.setVersionNo(value);</span>
     * <span style="color: #0000C0">tTrsymbolBhv</span>.<span style="color: #CC4747">deleteNonstrict</span>(tTrsymbol);
     * </pre>
     * @param tTrsymbol The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(TTrsymbol tTrsymbol) {
        doDeleteNonstrict(tTrsymbol, null);
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * TTrsymbol tTrsymbol = <span style="color: #70226C">new</span> TTrsymbol();
     * tTrsymbol.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tTrsymbol.setVersionNo(value);</span>
     * <span style="color: #0000C0">tTrsymbolBhv</span>.<span style="color: #CC4747">deleteNonstrictIgnoreDeleted</span>(tTrsymbol);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param tTrsymbol The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(TTrsymbol tTrsymbol) {
        doDeleteNonstrictIgnoreDeleted(tTrsymbol, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(TTrsymbol et, final DeleteOption<TTrsymbolCB> op) {
        assertObjectNotNull("tTrsymbol", et); prepareDeleteOption(op); helpDeleteNonstrictIgnoreDeletedInternally(et, op);
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
     *     TTrsymbol tTrsymbol = <span style="color: #70226C">new</span> TTrsymbol();
     *     tTrsymbol.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         tTrsymbol.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     tTrsymbolList.add(tTrsymbol);
     * }
     * <span style="color: #0000C0">tTrsymbolBhv</span>.<span style="color: #CC4747">batchInsert</span>(tTrsymbolList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param tTrsymbolList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<TTrsymbol> tTrsymbolList) {
        return doBatchInsert(tTrsymbolList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     TTrsymbol tTrsymbol = <span style="color: #70226C">new</span> TTrsymbol();
     *     tTrsymbol.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         tTrsymbol.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         tTrsymbol.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//tTrsymbol.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     tTrsymbolList.add(tTrsymbol);
     * }
     * <span style="color: #0000C0">tTrsymbolBhv</span>.<span style="color: #CC4747">batchUpdate</span>(tTrsymbolList);
     * </pre>
     * @param tTrsymbolList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<TTrsymbol> tTrsymbolList) {
        return doBatchUpdate(tTrsymbolList, null);
    }

    /**
     * Batch-update the entity list specified-only. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * tTrsymbolBhv.<span style="color: #CC4747">batchUpdate</span>(tTrsymbolList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">tTrsymbolBhv</span>.<span style="color: #CC4747">batchUpdate</span>(tTrsymbolList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param tTrsymbolList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<TTrsymbol> tTrsymbolList, SpecifyQuery<TTrsymbolCB> colCBLambda) {
        return doBatchUpdate(tTrsymbolList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * <span style="color: #70226C">for</span> (... : ...) {
     *     TTrsymbol tTrsymbol = <span style="color: #70226C">new</span> TTrsymbol();
     *     tTrsymbol.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         tTrsymbol.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         tTrsymbol.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//tTrsymbol.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     tTrsymbolList.add(tTrsymbol);
     * }
     * <span style="color: #0000C0">tTrsymbolBhv</span>.<span style="color: #CC4747">batchUpdate</span>(tTrsymbolList);
     * </pre>
     * @param tTrsymbolList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<TTrsymbol> tTrsymbolList) {
        return doBatchUpdateNonstrict(tTrsymbolList, null);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * <span style="color: #0000C0">tTrsymbolBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(tTrsymbolList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">tTrsymbolBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(tTrsymbolList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).</p>
     * @param tTrsymbolList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<TTrsymbol> tTrsymbolList, SpecifyQuery<TTrsymbolCB> colCBLambda) {
        return doBatchUpdateNonstrict(tTrsymbolList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param tTrsymbolList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<TTrsymbol> tTrsymbolList) {
        return doBatchDelete(tTrsymbolList, null);
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param tTrsymbolList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<TTrsymbol> tTrsymbolList) {
        return doBatchDeleteNonstrict(tTrsymbolList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">tTrsymbolBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;TTrsymbol, TTrsymbolCB&gt;() {
     *     public ConditionBean setup(TTrsymbol entity, TTrsymbolCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<TTrsymbol, TTrsymbolCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * TTrsymbol tTrsymbol = <span style="color: #70226C">new</span> TTrsymbol();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//tTrsymbol.setPK...(value);</span>
     * tTrsymbol.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tTrsymbol.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tTrsymbol.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tTrsymbol.setVersionNo(value);</span>
     * TTrsymbolCB cb = <span style="color: #70226C">new</span> TTrsymbolCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">tTrsymbolBhv</span>.<span style="color: #CC4747">queryUpdate</span>(tTrsymbol, cb);
     * </pre>
     * @param tTrsymbol The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of TTrsymbol. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(TTrsymbol tTrsymbol, TTrsymbolCB cb) {
        return doQueryUpdate(tTrsymbol, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * TTrsymbolCB cb = new TTrsymbolCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">tTrsymbolBhv</span>.<span style="color: #CC4747">queryDelete</span>(tTrsymbol, cb);
     * </pre>
     * @param cb The condition-bean of TTrsymbol. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(TTrsymbolCB cb) {
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
     * TTrsymbol tTrsymbol = <span style="color: #70226C">new</span> TTrsymbol();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * tTrsymbol.setFoo...(value);
     * tTrsymbol.setBar...(value);
     * <span style="color: #0000C0">tTrsymbolBhv</span>.<span style="color: #CC4747">varyingInsert</span>(tTrsymbol, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = tTrsymbol.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param tTrsymbol The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(TTrsymbol tTrsymbol, WritableOptionCall<TTrsymbolCB, InsertOption<TTrsymbolCB>> opLambda) {
        doInsert(tTrsymbol, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * TTrsymbol tTrsymbol = <span style="color: #70226C">new</span> TTrsymbol();
     * tTrsymbol.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tTrsymbol.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * tTrsymbol.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">tTrsymbolBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(tTrsymbol, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param tTrsymbol The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(TTrsymbol tTrsymbol, WritableOptionCall<TTrsymbolCB, UpdateOption<TTrsymbolCB>> opLambda) {
        doUpdate(tTrsymbol, createUpdateOption(opLambda));
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * TTrsymbol tTrsymbol = <span style="color: #70226C">new</span> TTrsymbol();
     * tTrsymbol.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tTrsymbol.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tTrsymbol.setVersionNo(value);</span>
     * <span style="color: #0000C0">tTrsymbolBhv</span>.<span style="color: #CC4747">varyingUpdateNonstrict</span>(tTrsymbol, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param tTrsymbol The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(TTrsymbol tTrsymbol, WritableOptionCall<TTrsymbolCB, UpdateOption<TTrsymbolCB>> opLambda) {
        doUpdateNonstrict(tTrsymbol, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param tTrsymbol The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(TTrsymbol tTrsymbol, WritableOptionCall<TTrsymbolCB, InsertOption<TTrsymbolCB>> insertOpLambda, WritableOptionCall<TTrsymbolCB, UpdateOption<TTrsymbolCB>> updateOpLambda) {
        doInsertOrUpdate(tTrsymbol, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param tTrsymbol The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(TTrsymbol tTrsymbol, WritableOptionCall<TTrsymbolCB, InsertOption<TTrsymbolCB>> insertOpLambda, WritableOptionCall<TTrsymbolCB, UpdateOption<TTrsymbolCB>> updateOpLambda) {
        doInsertOrUpdateNonstrict(tTrsymbol, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param tTrsymbol The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(TTrsymbol tTrsymbol, WritableOptionCall<TTrsymbolCB, DeleteOption<TTrsymbolCB>> opLambda) {
        doDelete(tTrsymbol, createDeleteOption(opLambda));
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as deleteNonstrict(entity).
     * @param tTrsymbol The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(TTrsymbol tTrsymbol, WritableOptionCall<TTrsymbolCB, DeleteOption<TTrsymbolCB>> opLambda) {
        doDeleteNonstrict(tTrsymbol, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param tTrsymbolList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<TTrsymbol> tTrsymbolList, WritableOptionCall<TTrsymbolCB, InsertOption<TTrsymbolCB>> opLambda) {
        return doBatchInsert(tTrsymbolList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param tTrsymbolList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<TTrsymbol> tTrsymbolList, WritableOptionCall<TTrsymbolCB, UpdateOption<TTrsymbolCB>> opLambda) {
        return doBatchUpdate(tTrsymbolList, createUpdateOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param tTrsymbolList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<TTrsymbol> tTrsymbolList, WritableOptionCall<TTrsymbolCB, UpdateOption<TTrsymbolCB>> opLambda) {
        return doBatchUpdateNonstrict(tTrsymbolList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param tTrsymbolList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<TTrsymbol> tTrsymbolList, WritableOptionCall<TTrsymbolCB, DeleteOption<TTrsymbolCB>> opLambda) {
        return doBatchDelete(tTrsymbolList, createDeleteOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param tTrsymbolList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<TTrsymbol> tTrsymbolList, WritableOptionCall<TTrsymbolCB, DeleteOption<TTrsymbolCB>> opLambda) {
        return doBatchDeleteNonstrict(tTrsymbolList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<TTrsymbol, TTrsymbolCB> manyArgLambda, WritableOptionCall<TTrsymbolCB, InsertOption<TTrsymbolCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * TTrsymbol tTrsymbol = <span style="color: #70226C">new</span> TTrsymbol();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//tTrsymbol.setPK...(value);</span>
     * tTrsymbol.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tTrsymbol.setVersionNo(value);</span>
     * TTrsymbolCB cb = <span style="color: #70226C">new</span> TTrsymbolCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">tTrsymbolBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(tTrsymbol, cb, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param tTrsymbol The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of TTrsymbol. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(TTrsymbol tTrsymbol, TTrsymbolCB cb, WritableOptionCall<TTrsymbolCB, UpdateOption<TTrsymbolCB>> opLambda) {
        return doQueryUpdate(tTrsymbol, cb, createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * @param cb The condition-bean of TTrsymbol. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(TTrsymbolCB cb, WritableOptionCall<TTrsymbolCB, DeleteOption<TTrsymbolCB>> opLambda) {
        return doQueryDelete(cb, createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span>
     * tTrsymbolBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span>
     * tTrsymbolBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * tTrsymbolBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * tTrsymbolBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * tTrsymbolBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * tTrsymbolBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * tTrsymbolBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span>
     * tTrsymbolBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * tTrsymbolBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * tTrsymbolBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * tTrsymbolBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * tTrsymbolBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * tTrsymbolBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span>
     * tTrsymbolBhv.outideSql().removeBlockComment().selectList()
     * tTrsymbolBhv.outideSql().removeLineComment().selectList()
     * tTrsymbolBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlBasicExecutor<TTrsymbolBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<TTrsymbolBhv> facadeExecutor = doOutsideSql();
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
    protected Class<? extends TTrsymbol> typeOfSelectedEntity() { return TTrsymbol.class; }
    protected Class<TTrsymbol> typeOfHandlingEntity() { return TTrsymbol.class; }
    protected Class<TTrsymbolCB> typeOfHandlingConditionBean() { return TTrsymbolCB.class; }
}
