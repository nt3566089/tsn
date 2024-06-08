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
 * The behavior of B_COL as TABLE. <br>
 * <pre>
 * [primary key]
 *     COL_ID
 *
 * [column]
 *     COL_ID, ITEM_ID, COL_CD, DICT_ID, COL_ORDER, COL_TYPE, VISIBLE, EDITABLE, TEXT_ALIGN, NECESSARY, COL_WIDTH, IN_COL_INDEX, IN_COL_DEFAULT_VALUE, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     COL_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     B_DICT, B_ITEM, V_DICT, V_HT_DICT, B_CLASS_DTL(ByColType), B_COL_VALID(AsOne)
 *
 * [referrer table]
 *     B_COL_ROLE, M_CENTER_COL, M_CLIENT_COL, B_COL_VALID
 *
 * [foreign property]
 *     bDict, bItem, vDict, vHtDict, bClassDtlByColType, bClassDtlByVisible, bClassDtlByEditable, bClassDtlByTextAlign, bClassDtlByNecessary, bColValidAsOne
 *
 * [referrer property]
 *     bColRoleList, mCenterColList, mClientColList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsBColBhv extends AbstractBehaviorWritable<BCol, BColCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public BColDbm asDBMeta() { return BColDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "B_COL"; }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public BColDbm getMyDBMeta() { return BColDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public BColCB newConditionBean() { return new BColCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public BCol newMyEntity() { return new BCol(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public BColCB newMyConditionBean() { return new BColCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * BColCB cb = <span style="color: #70226C">new</span> BColCB();
     * cb.query().setFoo...(value);
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">bColBhv</span>.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of BCol. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(BColCB cb) {
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
     * BColCB cb = <span style="color: #70226C">new</span> BColCB();
     * cb.query().setFoo...(value);
     * BCol bCol = <span style="color: #0000C0">bColBhv</span>.<span style="color: #DD4747">selectEntity</span>(cb);
     * <span style="color: #70226C">if</span> (bCol != <span style="color: #70226C">null</span>) { <span style="color: #3F7E5E">// null check</span>
     *     ... = bCol.get...();
     * } <span style="color: #70226C">else</span> {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of BCol. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public BCol selectEntity(BColCB cb) {
        return facadeSelectEntity(cb);
    }

    protected BCol facadeSelectEntity(BColCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends BCol> OptionalEntity<ENTITY> doSelectOptionalEntity(BColCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * BColCB cb = <span style="color: #70226C">new</span> BColCB();
     * cb.query().set...;
     * BCol bCol = <span style="color: #0000C0">bColBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = bCol.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of BCol. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public BCol selectEntityWithDeletedCheck(BColCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param colId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public BCol selectByPKValue(Long colId) {
        return facadeSelectByPKValue(colId);
    }

    protected BCol facadeSelectByPKValue(Long colId) {
        return doSelectByPK(colId, typeOfSelectedEntity());
    }

    protected <ENTITY extends BCol> ENTITY doSelectByPK(Long colId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(colId), tp);
    }

    protected <ENTITY extends BCol> OptionalEntity<ENTITY> doSelectOptionalByPK(Long colId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(colId, tp), colId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param colId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public BCol selectByPKValueWithDeletedCheck(Long colId) {
        return doSelectByPKWithDeletedCheck(colId, typeOfSelectedEntity());
    }

    protected <ENTITY extends BCol> ENTITY doSelectByPKWithDeletedCheck(Long colId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(colId), tp);
    }

    protected BColCB xprepareCBAsPK(Long colId) {
        assertObjectNotNull("colId", colId);
        return newConditionBean().acceptPK(colId);
    }

    /**
     * Select the entity by the unique-key value.
     * @param itemId : UQ+, IX, NotNull, bigint(19), FK to B_ITEM. (NotNull)
     * @param colCd : +UQ, varchar(100). (NotNull)
     * @return The optional entity selected by the unique key. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<BCol> selectByUniqueOf(Long itemId, String colCd) {
        return facadeSelectByUniqueOf(itemId, colCd);
    }

    protected OptionalEntity<BCol> facadeSelectByUniqueOf(Long itemId, String colCd) {
        return doSelectByUniqueOf(itemId, colCd, typeOfSelectedEntity());
    }

    protected <ENTITY extends BCol> OptionalEntity<ENTITY> doSelectByUniqueOf(Long itemId, String colCd, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(xprepareCBAsUniqueOf(itemId, colCd), tp), itemId, colCd);
    }

    protected BColCB xprepareCBAsUniqueOf(Long itemId, String colCd) {
        assertObjectNotNull("itemId", itemId);assertObjectNotNull("colCd", colCd);
        return newConditionBean().acceptUniqueOf(itemId, colCd);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * BColCB cb = <span style="color: #70226C">new</span> BColCB();
     * cb.query().set...;
     * cb.query().addOrderBy...;
     * ListResultBean&lt;BCol&gt; <span style="color: #553000">bColList</span> = <span style="color: #0000C0">bColBhv</span>.<span style="color: #CC4747">selectList</span>(cb);
     * <span style="color: #70226C">for</span> (BCol bCol : <span style="color: #553000">bColList</span>) {
     *     ... = bCol.get...;
     * }
     * </pre>
     * @param cb The condition-bean of BCol. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<BCol> selectList(BColCB cb) {
        return facadeSelectList(cb);
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * BColCB cb = <span style="color: #70226C">new</span> BColCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;BCol&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">bColBhv</span>.<span style="color: #CC4747">selectPage</span>(cb);
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (BCol bCol : <span style="color: #553000">page</span>) {
     *     ... = bCol.get...();
     * }
     * </pre>
     * @param cb The condition-bean of BCol. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<BCol> selectPage(BColCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * BColCB cb = <span style="color: #70226C">new</span> BColCB();
     * cb.query().set...
     * <span style="color: #0000C0">bColBhv</span>.<span style="color: #CC4747">selectCursor</span>(cb, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cb The condition-bean of BCol. (NotNull)
     * @param entityRowHandler The handler of entity row of BCol. (NotNull)
     */
    public void selectCursor(BColCB cb, EntityRowHandler<BCol> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">bColBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<BColCB, RESULT> selectScalar(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">bColBhv</span>.<span style="color: #CC4747">scalarSelect</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<BColCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param bColList The entity list of BCol. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<BCol> bColList, ReferrerLoaderHandler<LoaderOfBCol> loaderLambda) {
        xassLRArg(bColList, loaderLambda);
        loaderLambda.handle(new LoaderOfBCol().ready(bColList, _behaviorSelector));
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
     * @param bCol The entity of BCol. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(BCol bCol, ReferrerLoaderHandler<LoaderOfBCol> loaderLambda) {
        xassLRArg(bCol, loaderLambda);
        loaderLambda.handle(new LoaderOfBCol().ready(xnewLRAryLs(bCol), _behaviorSelector));
    }

    /**
     * Load referrer of BColRoleList by the set-upper of referrer. <br>
     * B_COL_ROLE by COL_ID, named 'BColRoleList'.
     * <pre>
     * <span style="color: #0000C0">bColBhv</span>.<span style="color: #CC4747">loadBColRoleList</span>(<span style="color: #553000">bColList</span>, <span style="color: #553000">roleCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">roleCB</span>.setupSelect...
     *     <span style="color: #553000">roleCB</span>.query().set...
     *     <span style="color: #553000">roleCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (BCol bCol : <span style="color: #553000">bColList</span>) {
     *     ... = bCol.<span style="color: #CC4747">getBColRoleList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setColId_InScope(pkList);
     * cb.query().addOrderBy_ColId_Asc();
     * </pre>
     * @param bColList The entity list of BCol. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<BColRole> loadBColRoleList(List<BCol> bColList, ConditionBeanSetupper<BColRoleCB> refCBLambda) {
        xassLRArg(bColList, refCBLambda);
        return doLoadBColRoleList(bColList, new LoadReferrerOption<BColRoleCB, BColRole>().xinit(refCBLambda));
    }

    /**
     * Load referrer of BColRoleList by the set-upper of referrer. <br>
     * B_COL_ROLE by COL_ID, named 'BColRoleList'.
     * <pre>
     * <span style="color: #0000C0">bColBhv</span>.<span style="color: #CC4747">loadBColRoleList</span>(<span style="color: #553000">bCol</span>, <span style="color: #553000">roleCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">roleCB</span>.setupSelect...
     *     <span style="color: #553000">roleCB</span>.query().set...
     *     <span style="color: #553000">roleCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">bCol</span>.<span style="color: #CC4747">getBColRoleList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setColId_InScope(pkList);
     * cb.query().addOrderBy_ColId_Asc();
     * </pre>
     * @param bCol The entity of BCol. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<BColRole> loadBColRoleList(BCol bCol, ConditionBeanSetupper<BColRoleCB> refCBLambda) {
        xassLRArg(bCol, refCBLambda);
        return doLoadBColRoleList(xnewLRLs(bCol), new LoadReferrerOption<BColRoleCB, BColRole>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param bCol The entity of BCol. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<BColRole> loadBColRoleList(BCol bCol, LoadReferrerOption<BColRoleCB, BColRole> loadReferrerOption) {
        xassLRArg(bCol, loadReferrerOption);
        return loadBColRoleList(xnewLRLs(bCol), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param bColList The entity list of BCol. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<BColRole> loadBColRoleList(List<BCol> bColList, LoadReferrerOption<BColRoleCB, BColRole> loadReferrerOption) {
        xassLRArg(bColList, loadReferrerOption);
        if (bColList.isEmpty()) { return (NestedReferrerListGateway<BColRole>)EMPTY_NREF_LGWAY; }
        return doLoadBColRoleList(bColList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<BColRole> doLoadBColRoleList(List<BCol> bColList, LoadReferrerOption<BColRoleCB, BColRole> option) {
        return helpLoadReferrerInternally(bColList, option, "bColRoleList");
    }

    /**
     * Load referrer of MCenterColList by the set-upper of referrer. <br>
     * M_CENTER_COL by COL_ID, named 'MCenterColList'.
     * <pre>
     * <span style="color: #0000C0">bColBhv</span>.<span style="color: #CC4747">loadMCenterColList</span>(<span style="color: #553000">bColList</span>, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">colCB</span>.setupSelect...
     *     <span style="color: #553000">colCB</span>.query().set...
     *     <span style="color: #553000">colCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (BCol bCol : <span style="color: #553000">bColList</span>) {
     *     ... = bCol.<span style="color: #CC4747">getMCenterColList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setColId_InScope(pkList);
     * cb.query().addOrderBy_ColId_Asc();
     * </pre>
     * @param bColList The entity list of BCol. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MCenterCol> loadMCenterColList(List<BCol> bColList, ConditionBeanSetupper<MCenterColCB> refCBLambda) {
        xassLRArg(bColList, refCBLambda);
        return doLoadMCenterColList(bColList, new LoadReferrerOption<MCenterColCB, MCenterCol>().xinit(refCBLambda));
    }

    /**
     * Load referrer of MCenterColList by the set-upper of referrer. <br>
     * M_CENTER_COL by COL_ID, named 'MCenterColList'.
     * <pre>
     * <span style="color: #0000C0">bColBhv</span>.<span style="color: #CC4747">loadMCenterColList</span>(<span style="color: #553000">bCol</span>, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">colCB</span>.setupSelect...
     *     <span style="color: #553000">colCB</span>.query().set...
     *     <span style="color: #553000">colCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">bCol</span>.<span style="color: #CC4747">getMCenterColList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setColId_InScope(pkList);
     * cb.query().addOrderBy_ColId_Asc();
     * </pre>
     * @param bCol The entity of BCol. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MCenterCol> loadMCenterColList(BCol bCol, ConditionBeanSetupper<MCenterColCB> refCBLambda) {
        xassLRArg(bCol, refCBLambda);
        return doLoadMCenterColList(xnewLRLs(bCol), new LoadReferrerOption<MCenterColCB, MCenterCol>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param bCol The entity of BCol. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MCenterCol> loadMCenterColList(BCol bCol, LoadReferrerOption<MCenterColCB, MCenterCol> loadReferrerOption) {
        xassLRArg(bCol, loadReferrerOption);
        return loadMCenterColList(xnewLRLs(bCol), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param bColList The entity list of BCol. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<MCenterCol> loadMCenterColList(List<BCol> bColList, LoadReferrerOption<MCenterColCB, MCenterCol> loadReferrerOption) {
        xassLRArg(bColList, loadReferrerOption);
        if (bColList.isEmpty()) { return (NestedReferrerListGateway<MCenterCol>)EMPTY_NREF_LGWAY; }
        return doLoadMCenterColList(bColList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<MCenterCol> doLoadMCenterColList(List<BCol> bColList, LoadReferrerOption<MCenterColCB, MCenterCol> option) {
        return helpLoadReferrerInternally(bColList, option, "mCenterColList");
    }

    /**
     * Load referrer of MClientColList by the set-upper of referrer. <br>
     * M_CLIENT_COL by COL_ID, named 'MClientColList'.
     * <pre>
     * <span style="color: #0000C0">bColBhv</span>.<span style="color: #CC4747">loadMClientColList</span>(<span style="color: #553000">bColList</span>, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">colCB</span>.setupSelect...
     *     <span style="color: #553000">colCB</span>.query().set...
     *     <span style="color: #553000">colCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (BCol bCol : <span style="color: #553000">bColList</span>) {
     *     ... = bCol.<span style="color: #CC4747">getMClientColList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setColId_InScope(pkList);
     * cb.query().addOrderBy_ColId_Asc();
     * </pre>
     * @param bColList The entity list of BCol. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MClientCol> loadMClientColList(List<BCol> bColList, ConditionBeanSetupper<MClientColCB> refCBLambda) {
        xassLRArg(bColList, refCBLambda);
        return doLoadMClientColList(bColList, new LoadReferrerOption<MClientColCB, MClientCol>().xinit(refCBLambda));
    }

    /**
     * Load referrer of MClientColList by the set-upper of referrer. <br>
     * M_CLIENT_COL by COL_ID, named 'MClientColList'.
     * <pre>
     * <span style="color: #0000C0">bColBhv</span>.<span style="color: #CC4747">loadMClientColList</span>(<span style="color: #553000">bCol</span>, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">colCB</span>.setupSelect...
     *     <span style="color: #553000">colCB</span>.query().set...
     *     <span style="color: #553000">colCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">bCol</span>.<span style="color: #CC4747">getMClientColList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setColId_InScope(pkList);
     * cb.query().addOrderBy_ColId_Asc();
     * </pre>
     * @param bCol The entity of BCol. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MClientCol> loadMClientColList(BCol bCol, ConditionBeanSetupper<MClientColCB> refCBLambda) {
        xassLRArg(bCol, refCBLambda);
        return doLoadMClientColList(xnewLRLs(bCol), new LoadReferrerOption<MClientColCB, MClientCol>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param bCol The entity of BCol. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MClientCol> loadMClientColList(BCol bCol, LoadReferrerOption<MClientColCB, MClientCol> loadReferrerOption) {
        xassLRArg(bCol, loadReferrerOption);
        return loadMClientColList(xnewLRLs(bCol), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param bColList The entity list of BCol. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<MClientCol> loadMClientColList(List<BCol> bColList, LoadReferrerOption<MClientColCB, MClientCol> loadReferrerOption) {
        xassLRArg(bColList, loadReferrerOption);
        if (bColList.isEmpty()) { return (NestedReferrerListGateway<MClientCol>)EMPTY_NREF_LGWAY; }
        return doLoadMClientColList(bColList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<MClientCol> doLoadMClientColList(List<BCol> bColList, LoadReferrerOption<MClientColCB, MClientCol> option) {
        return helpLoadReferrerInternally(bColList, option, "mClientColList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'BDict'.
     * @param bColList The list of bCol. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BDict> pulloutBDict(List<BCol> bColList)
    { return helpPulloutInternally(bColList, "bDict"); }

    /**
     * Pull out the list of foreign table 'BItem'.
     * @param bColList The list of bCol. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BItem> pulloutBItem(List<BCol> bColList)
    { return helpPulloutInternally(bColList, "bItem"); }

    /**
     * Pull out the list of foreign table 'VDict'.
     * @param bColList The list of bCol. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<VDict> pulloutVDict(List<BCol> bColList)
    { return helpPulloutInternally(bColList, "vDict"); }

    /**
     * Pull out the list of foreign table 'VHtDict'.
     * @param bColList The list of bCol. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<VHtDict> pulloutVHtDict(List<BCol> bColList)
    { return helpPulloutInternally(bColList, "vHtDict"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param bColList The list of bCol. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByColType(List<BCol> bColList)
    { return helpPulloutInternally(bColList, "bClassDtlByColType"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param bColList The list of bCol. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByVisible(List<BCol> bColList)
    { return helpPulloutInternally(bColList, "bClassDtlByVisible"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param bColList The list of bCol. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByEditable(List<BCol> bColList)
    { return helpPulloutInternally(bColList, "bClassDtlByEditable"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param bColList The list of bCol. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByTextAlign(List<BCol> bColList)
    { return helpPulloutInternally(bColList, "bClassDtlByTextAlign"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param bColList The list of bCol. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByNecessary(List<BCol> bColList)
    { return helpPulloutInternally(bColList, "bClassDtlByNecessary"); }

    /**
     * Pull out the list of referrer-as-one table 'BColValid'.
     * @param bColList The list of bCol. (NotNull, EmptyAllowed)
     * @return The list of referrer-as-one table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BColValid> pulloutBColValidAsOne(List<BCol> bColList)
    { return helpPulloutInternally(bColList, "bColValidAsOne"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key colId.
     * @param bColList The list of bCol. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractColIdList(List<BCol> bColList)
    { return helpExtractListInternally(bColList, "colId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * BCol bCol = <span style="color: #70226C">new</span> BCol();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * bCol.setFoo...(value);
     * bCol.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//bCol.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//bCol.set...;</span>
     * <span style="color: #0000C0">bColBhv</span>.<span style="color: #CC4747">insert</span>(bCol);
     * ... = bCol.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param bCol The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(BCol bCol) {
        doInsert(bCol, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * BCol bCol = <span style="color: #70226C">new</span> BCol();
     * bCol.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * bCol.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//bCol.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//bCol.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * bCol.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">bColBhv</span>.<span style="color: #CC4747">update</span>(bCol);
     * </pre>
     * @param bCol The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(BCol bCol) {
        doUpdate(bCol, null);
    }

    /**
     * Update the entity non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * BCol bCol = <span style="color: #70226C">new</span> BCol();
     * bCol.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * bCol.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//bCol.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//bCol.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//bCol.setVersionNo(value);</span>
     * <span style="color: #0000C0">bColBhv</span>.<span style="color: #CC4747">updateNonstrict</span>(bCol);
     * </pre>
     * @param bCol The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(BCol bCol) {
        doUpdateNonstrict(bCol, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param bCol The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(BCol bCol) {
        doInsertOrUpdate(bCol, null, null);
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param bCol The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(BCol bCol) {
        doInsertOrUpdateNonstrict(bCol, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * BCol bCol = <span style="color: #70226C">new</span> BCol();
     * bCol.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * bCol.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">bColBhv</span>.<span style="color: #CC4747">delete</span>(bCol);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param bCol The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(BCol bCol) {
        doDelete(bCol, null);
    }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl} <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * BCol bCol = <span style="color: #70226C">new</span> BCol();
     * bCol.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//bCol.setVersionNo(value);</span>
     * <span style="color: #0000C0">bColBhv</span>.<span style="color: #CC4747">deleteNonstrict</span>(bCol);
     * </pre>
     * @param bCol The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(BCol bCol) {
        doDeleteNonstrict(bCol, null);
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * BCol bCol = <span style="color: #70226C">new</span> BCol();
     * bCol.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//bCol.setVersionNo(value);</span>
     * <span style="color: #0000C0">bColBhv</span>.<span style="color: #CC4747">deleteNonstrictIgnoreDeleted</span>(bCol);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param bCol The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(BCol bCol) {
        doDeleteNonstrictIgnoreDeleted(bCol, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(BCol et, final DeleteOption<BColCB> op) {
        assertObjectNotNull("bCol", et); prepareDeleteOption(op); helpDeleteNonstrictIgnoreDeletedInternally(et, op);
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
     *     BCol bCol = <span style="color: #70226C">new</span> BCol();
     *     bCol.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         bCol.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     bColList.add(bCol);
     * }
     * <span style="color: #0000C0">bColBhv</span>.<span style="color: #CC4747">batchInsert</span>(bColList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param bColList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<BCol> bColList) {
        return doBatchInsert(bColList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     BCol bCol = <span style="color: #70226C">new</span> BCol();
     *     bCol.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         bCol.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         bCol.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//bCol.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     bColList.add(bCol);
     * }
     * <span style="color: #0000C0">bColBhv</span>.<span style="color: #CC4747">batchUpdate</span>(bColList);
     * </pre>
     * @param bColList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<BCol> bColList) {
        return doBatchUpdate(bColList, null);
    }

    /**
     * Batch-update the entity list specified-only. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * bColBhv.<span style="color: #CC4747">batchUpdate</span>(bColList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">bColBhv</span>.<span style="color: #CC4747">batchUpdate</span>(bColList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param bColList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<BCol> bColList, SpecifyQuery<BColCB> colCBLambda) {
        return doBatchUpdate(bColList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * <span style="color: #70226C">for</span> (... : ...) {
     *     BCol bCol = <span style="color: #70226C">new</span> BCol();
     *     bCol.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         bCol.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         bCol.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//bCol.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     bColList.add(bCol);
     * }
     * <span style="color: #0000C0">bColBhv</span>.<span style="color: #CC4747">batchUpdate</span>(bColList);
     * </pre>
     * @param bColList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<BCol> bColList) {
        return doBatchUpdateNonstrict(bColList, null);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * <span style="color: #0000C0">bColBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(bColList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">bColBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(bColList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).</p>
     * @param bColList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<BCol> bColList, SpecifyQuery<BColCB> colCBLambda) {
        return doBatchUpdateNonstrict(bColList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param bColList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<BCol> bColList) {
        return doBatchDelete(bColList, null);
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param bColList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<BCol> bColList) {
        return doBatchDeleteNonstrict(bColList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">bColBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;BCol, BColCB&gt;() {
     *     public ConditionBean setup(BCol entity, BColCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<BCol, BColCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * BCol bCol = <span style="color: #70226C">new</span> BCol();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//bCol.setPK...(value);</span>
     * bCol.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//bCol.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//bCol.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//bCol.setVersionNo(value);</span>
     * BColCB cb = <span style="color: #70226C">new</span> BColCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">bColBhv</span>.<span style="color: #CC4747">queryUpdate</span>(bCol, cb);
     * </pre>
     * @param bCol The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of BCol. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(BCol bCol, BColCB cb) {
        return doQueryUpdate(bCol, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * BColCB cb = new BColCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">bColBhv</span>.<span style="color: #CC4747">queryDelete</span>(bCol, cb);
     * </pre>
     * @param cb The condition-bean of BCol. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(BColCB cb) {
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
     * BCol bCol = <span style="color: #70226C">new</span> BCol();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * bCol.setFoo...(value);
     * bCol.setBar...(value);
     * <span style="color: #0000C0">bColBhv</span>.<span style="color: #CC4747">varyingInsert</span>(bCol, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = bCol.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param bCol The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(BCol bCol, WritableOptionCall<BColCB, InsertOption<BColCB>> opLambda) {
        doInsert(bCol, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * BCol bCol = <span style="color: #70226C">new</span> BCol();
     * bCol.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * bCol.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * bCol.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">bColBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(bCol, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param bCol The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(BCol bCol, WritableOptionCall<BColCB, UpdateOption<BColCB>> opLambda) {
        doUpdate(bCol, createUpdateOption(opLambda));
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * BCol bCol = <span style="color: #70226C">new</span> BCol();
     * bCol.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * bCol.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//bCol.setVersionNo(value);</span>
     * <span style="color: #0000C0">bColBhv</span>.<span style="color: #CC4747">varyingUpdateNonstrict</span>(bCol, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param bCol The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(BCol bCol, WritableOptionCall<BColCB, UpdateOption<BColCB>> opLambda) {
        doUpdateNonstrict(bCol, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param bCol The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(BCol bCol, WritableOptionCall<BColCB, InsertOption<BColCB>> insertOpLambda, WritableOptionCall<BColCB, UpdateOption<BColCB>> updateOpLambda) {
        doInsertOrUpdate(bCol, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param bCol The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(BCol bCol, WritableOptionCall<BColCB, InsertOption<BColCB>> insertOpLambda, WritableOptionCall<BColCB, UpdateOption<BColCB>> updateOpLambda) {
        doInsertOrUpdateNonstrict(bCol, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param bCol The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(BCol bCol, WritableOptionCall<BColCB, DeleteOption<BColCB>> opLambda) {
        doDelete(bCol, createDeleteOption(opLambda));
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as deleteNonstrict(entity).
     * @param bCol The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(BCol bCol, WritableOptionCall<BColCB, DeleteOption<BColCB>> opLambda) {
        doDeleteNonstrict(bCol, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param bColList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<BCol> bColList, WritableOptionCall<BColCB, InsertOption<BColCB>> opLambda) {
        return doBatchInsert(bColList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param bColList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<BCol> bColList, WritableOptionCall<BColCB, UpdateOption<BColCB>> opLambda) {
        return doBatchUpdate(bColList, createUpdateOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param bColList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<BCol> bColList, WritableOptionCall<BColCB, UpdateOption<BColCB>> opLambda) {
        return doBatchUpdateNonstrict(bColList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param bColList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<BCol> bColList, WritableOptionCall<BColCB, DeleteOption<BColCB>> opLambda) {
        return doBatchDelete(bColList, createDeleteOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param bColList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<BCol> bColList, WritableOptionCall<BColCB, DeleteOption<BColCB>> opLambda) {
        return doBatchDeleteNonstrict(bColList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<BCol, BColCB> manyArgLambda, WritableOptionCall<BColCB, InsertOption<BColCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * BCol bCol = <span style="color: #70226C">new</span> BCol();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//bCol.setPK...(value);</span>
     * bCol.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//bCol.setVersionNo(value);</span>
     * BColCB cb = <span style="color: #70226C">new</span> BColCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">bColBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(bCol, cb, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param bCol The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of BCol. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(BCol bCol, BColCB cb, WritableOptionCall<BColCB, UpdateOption<BColCB>> opLambda) {
        return doQueryUpdate(bCol, cb, createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * @param cb The condition-bean of BCol. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(BColCB cb, WritableOptionCall<BColCB, DeleteOption<BColCB>> opLambda) {
        return doQueryDelete(cb, createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span>
     * bColBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span>
     * bColBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * bColBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * bColBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * bColBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * bColBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * bColBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span>
     * bColBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * bColBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * bColBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * bColBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * bColBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * bColBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span>
     * bColBhv.outideSql().removeBlockComment().selectList()
     * bColBhv.outideSql().removeLineComment().selectList()
     * bColBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlBasicExecutor<BColBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<BColBhv> facadeExecutor = doOutsideSql();
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
    protected Class<? extends BCol> typeOfSelectedEntity() { return BCol.class; }
    protected Class<BCol> typeOfHandlingEntity() { return BCol.class; }
    protected Class<BColCB> typeOfHandlingConditionBean() { return BColCB.class; }
}
