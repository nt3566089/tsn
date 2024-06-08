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
 * The behavior of M_MFWHxITEM as TABLE. <br>
 * <pre>
 * [primary key]
 *     MFWH_ITEM_ID
 *
 * [column]
 *     MFWH_ITEM_ID, CLIENT_ID, CENTER_ID, PRODUCT_CD, SLOTLOCNAME, PICKLOCNAME, PHYSICALTYPE, PHYSICALCYCLE, PHYSICALGROUP, PHYSICALDATE, REORDERTYPE, REORDERINTERVAL, REORDERPOINT, REORDERQTY, REORDERLEADTIME, REORDERLASTDAY, SUPPLIERCD, REPLENISHPOINT, MAXQTY, CAUSELOC, SHIPPINGTYPE, SLOTPOLICYKEY, INWORKINGKEY, OUTWORKINGKEY, PROCESSWORKINGKEY, USERUSE1, USERUSE2, USERUSE3, USERUSE4, USERUSE5, SERIALFLG, FULLPALLETFLG, PLSLOTLOCNAME, PRODUCT_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     MFWH_ITEM_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     M_PRODUCT, M_CLIENT, M_CENTER
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     mProduct, mClient, mCenter
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsMMfwhxitemBhv extends AbstractBehaviorWritable<MMfwhxitem, MMfwhxitemCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /** 拠点別銘柄制御データリストの取得 */
    public static final String PATH_selectSqlCenterProductControlMasterList = "selectSqlCenterProductControlMasterList";
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public MMfwhxitemDbm asDBMeta() { return MMfwhxitemDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "M_MFWHxITEM"; }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public MMfwhxitemDbm getMyDBMeta() { return MMfwhxitemDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public MMfwhxitemCB newConditionBean() { return new MMfwhxitemCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public MMfwhxitem newMyEntity() { return new MMfwhxitem(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public MMfwhxitemCB newMyConditionBean() { return new MMfwhxitemCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * MMfwhxitemCB cb = <span style="color: #70226C">new</span> MMfwhxitemCB();
     * cb.query().setFoo...(value);
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">mMfwhxitemBhv</span>.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of MMfwhxitem. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(MMfwhxitemCB cb) {
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
     * MMfwhxitemCB cb = <span style="color: #70226C">new</span> MMfwhxitemCB();
     * cb.query().setFoo...(value);
     * MMfwhxitem mMfwhxitem = <span style="color: #0000C0">mMfwhxitemBhv</span>.<span style="color: #DD4747">selectEntity</span>(cb);
     * <span style="color: #70226C">if</span> (mMfwhxitem != <span style="color: #70226C">null</span>) { <span style="color: #3F7E5E">// null check</span>
     *     ... = mMfwhxitem.get...();
     * } <span style="color: #70226C">else</span> {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of MMfwhxitem. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MMfwhxitem selectEntity(MMfwhxitemCB cb) {
        return facadeSelectEntity(cb);
    }

    protected MMfwhxitem facadeSelectEntity(MMfwhxitemCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends MMfwhxitem> OptionalEntity<ENTITY> doSelectOptionalEntity(MMfwhxitemCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * MMfwhxitemCB cb = <span style="color: #70226C">new</span> MMfwhxitemCB();
     * cb.query().set...;
     * MMfwhxitem mMfwhxitem = <span style="color: #0000C0">mMfwhxitemBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = mMfwhxitem.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of MMfwhxitem. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MMfwhxitem selectEntityWithDeletedCheck(MMfwhxitemCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param mfwhItemId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MMfwhxitem selectByPKValue(Long mfwhItemId) {
        return facadeSelectByPKValue(mfwhItemId);
    }

    protected MMfwhxitem facadeSelectByPKValue(Long mfwhItemId) {
        return doSelectByPK(mfwhItemId, typeOfSelectedEntity());
    }

    protected <ENTITY extends MMfwhxitem> ENTITY doSelectByPK(Long mfwhItemId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(mfwhItemId), tp);
    }

    protected <ENTITY extends MMfwhxitem> OptionalEntity<ENTITY> doSelectOptionalByPK(Long mfwhItemId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(mfwhItemId, tp), mfwhItemId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param mfwhItemId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MMfwhxitem selectByPKValueWithDeletedCheck(Long mfwhItemId) {
        return doSelectByPKWithDeletedCheck(mfwhItemId, typeOfSelectedEntity());
    }

    protected <ENTITY extends MMfwhxitem> ENTITY doSelectByPKWithDeletedCheck(Long mfwhItemId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(mfwhItemId), tp);
    }

    protected MMfwhxitemCB xprepareCBAsPK(Long mfwhItemId) {
        assertObjectNotNull("mfwhItemId", mfwhItemId);
        return newConditionBean().acceptPK(mfwhItemId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * MMfwhxitemCB cb = <span style="color: #70226C">new</span> MMfwhxitemCB();
     * cb.query().set...;
     * cb.query().addOrderBy...;
     * ListResultBean&lt;MMfwhxitem&gt; <span style="color: #553000">mMfwhxitemList</span> = <span style="color: #0000C0">mMfwhxitemBhv</span>.<span style="color: #CC4747">selectList</span>(cb);
     * <span style="color: #70226C">for</span> (MMfwhxitem mMfwhxitem : <span style="color: #553000">mMfwhxitemList</span>) {
     *     ... = mMfwhxitem.get...;
     * }
     * </pre>
     * @param cb The condition-bean of MMfwhxitem. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<MMfwhxitem> selectList(MMfwhxitemCB cb) {
        return facadeSelectList(cb);
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * MMfwhxitemCB cb = <span style="color: #70226C">new</span> MMfwhxitemCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;MMfwhxitem&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">mMfwhxitemBhv</span>.<span style="color: #CC4747">selectPage</span>(cb);
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (MMfwhxitem mMfwhxitem : <span style="color: #553000">page</span>) {
     *     ... = mMfwhxitem.get...();
     * }
     * </pre>
     * @param cb The condition-bean of MMfwhxitem. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<MMfwhxitem> selectPage(MMfwhxitemCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * MMfwhxitemCB cb = <span style="color: #70226C">new</span> MMfwhxitemCB();
     * cb.query().set...
     * <span style="color: #0000C0">mMfwhxitemBhv</span>.<span style="color: #CC4747">selectCursor</span>(cb, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cb The condition-bean of MMfwhxitem. (NotNull)
     * @param entityRowHandler The handler of entity row of MMfwhxitem. (NotNull)
     */
    public void selectCursor(MMfwhxitemCB cb, EntityRowHandler<MMfwhxitem> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">mMfwhxitemBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<MMfwhxitemCB, RESULT> selectScalar(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">mMfwhxitemBhv</span>.<span style="color: #CC4747">scalarSelect</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<MMfwhxitemCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param mMfwhxitemList The entity list of MMfwhxitem. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<MMfwhxitem> mMfwhxitemList, ReferrerLoaderHandler<LoaderOfMMfwhxitem> loaderLambda) {
        xassLRArg(mMfwhxitemList, loaderLambda);
        loaderLambda.handle(new LoaderOfMMfwhxitem().ready(mMfwhxitemList, _behaviorSelector));
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
     * @param mMfwhxitem The entity of MMfwhxitem. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(MMfwhxitem mMfwhxitem, ReferrerLoaderHandler<LoaderOfMMfwhxitem> loaderLambda) {
        xassLRArg(mMfwhxitem, loaderLambda);
        loaderLambda.handle(new LoaderOfMMfwhxitem().ready(xnewLRAryLs(mMfwhxitem), _behaviorSelector));
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'MProduct'.
     * @param mMfwhxitemList The list of mMfwhxitem. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MProduct> pulloutMProduct(List<MMfwhxitem> mMfwhxitemList)
    { return helpPulloutInternally(mMfwhxitemList, "mProduct"); }

    /**
     * Pull out the list of foreign table 'MClient'.
     * @param mMfwhxitemList The list of mMfwhxitem. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MClient> pulloutMClient(List<MMfwhxitem> mMfwhxitemList)
    { return helpPulloutInternally(mMfwhxitemList, "mClient"); }

    /**
     * Pull out the list of foreign table 'MCenter'.
     * @param mMfwhxitemList The list of mMfwhxitem. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MCenter> pulloutMCenter(List<MMfwhxitem> mMfwhxitemList)
    { return helpPulloutInternally(mMfwhxitemList, "mCenter"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key mfwhItemId.
     * @param mMfwhxitemList The list of mMfwhxitem. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractMfwhItemIdList(List<MMfwhxitem> mMfwhxitemList)
    { return helpExtractListInternally(mMfwhxitemList, "mfwhItemId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * MMfwhxitem mMfwhxitem = <span style="color: #70226C">new</span> MMfwhxitem();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * mMfwhxitem.setFoo...(value);
     * mMfwhxitem.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mMfwhxitem.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mMfwhxitem.set...;</span>
     * <span style="color: #0000C0">mMfwhxitemBhv</span>.<span style="color: #CC4747">insert</span>(mMfwhxitem);
     * ... = mMfwhxitem.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param mMfwhxitem The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(MMfwhxitem mMfwhxitem) {
        doInsert(mMfwhxitem, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * MMfwhxitem mMfwhxitem = <span style="color: #70226C">new</span> MMfwhxitem();
     * mMfwhxitem.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mMfwhxitem.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mMfwhxitem.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mMfwhxitem.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * mMfwhxitem.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">mMfwhxitemBhv</span>.<span style="color: #CC4747">update</span>(mMfwhxitem);
     * </pre>
     * @param mMfwhxitem The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(MMfwhxitem mMfwhxitem) {
        doUpdate(mMfwhxitem, null);
    }

    /**
     * Update the entity non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * MMfwhxitem mMfwhxitem = <span style="color: #70226C">new</span> MMfwhxitem();
     * mMfwhxitem.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mMfwhxitem.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mMfwhxitem.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mMfwhxitem.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mMfwhxitem.setVersionNo(value);</span>
     * <span style="color: #0000C0">mMfwhxitemBhv</span>.<span style="color: #CC4747">updateNonstrict</span>(mMfwhxitem);
     * </pre>
     * @param mMfwhxitem The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(MMfwhxitem mMfwhxitem) {
        doUpdateNonstrict(mMfwhxitem, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param mMfwhxitem The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(MMfwhxitem mMfwhxitem) {
        doInsertOrUpdate(mMfwhxitem, null, null);
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param mMfwhxitem The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(MMfwhxitem mMfwhxitem) {
        doInsertOrUpdateNonstrict(mMfwhxitem, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * MMfwhxitem mMfwhxitem = <span style="color: #70226C">new</span> MMfwhxitem();
     * mMfwhxitem.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * mMfwhxitem.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">mMfwhxitemBhv</span>.<span style="color: #CC4747">delete</span>(mMfwhxitem);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param mMfwhxitem The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(MMfwhxitem mMfwhxitem) {
        doDelete(mMfwhxitem, null);
    }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl} <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * MMfwhxitem mMfwhxitem = <span style="color: #70226C">new</span> MMfwhxitem();
     * mMfwhxitem.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mMfwhxitem.setVersionNo(value);</span>
     * <span style="color: #0000C0">mMfwhxitemBhv</span>.<span style="color: #CC4747">deleteNonstrict</span>(mMfwhxitem);
     * </pre>
     * @param mMfwhxitem The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(MMfwhxitem mMfwhxitem) {
        doDeleteNonstrict(mMfwhxitem, null);
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * MMfwhxitem mMfwhxitem = <span style="color: #70226C">new</span> MMfwhxitem();
     * mMfwhxitem.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mMfwhxitem.setVersionNo(value);</span>
     * <span style="color: #0000C0">mMfwhxitemBhv</span>.<span style="color: #CC4747">deleteNonstrictIgnoreDeleted</span>(mMfwhxitem);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param mMfwhxitem The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(MMfwhxitem mMfwhxitem) {
        doDeleteNonstrictIgnoreDeleted(mMfwhxitem, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(MMfwhxitem et, final DeleteOption<MMfwhxitemCB> op) {
        assertObjectNotNull("mMfwhxitem", et); prepareDeleteOption(op); helpDeleteNonstrictIgnoreDeletedInternally(et, op);
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
     *     MMfwhxitem mMfwhxitem = <span style="color: #70226C">new</span> MMfwhxitem();
     *     mMfwhxitem.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         mMfwhxitem.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     mMfwhxitemList.add(mMfwhxitem);
     * }
     * <span style="color: #0000C0">mMfwhxitemBhv</span>.<span style="color: #CC4747">batchInsert</span>(mMfwhxitemList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param mMfwhxitemList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<MMfwhxitem> mMfwhxitemList) {
        return doBatchInsert(mMfwhxitemList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     MMfwhxitem mMfwhxitem = <span style="color: #70226C">new</span> MMfwhxitem();
     *     mMfwhxitem.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         mMfwhxitem.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         mMfwhxitem.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//mMfwhxitem.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     mMfwhxitemList.add(mMfwhxitem);
     * }
     * <span style="color: #0000C0">mMfwhxitemBhv</span>.<span style="color: #CC4747">batchUpdate</span>(mMfwhxitemList);
     * </pre>
     * @param mMfwhxitemList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<MMfwhxitem> mMfwhxitemList) {
        return doBatchUpdate(mMfwhxitemList, null);
    }

    /**
     * Batch-update the entity list specified-only. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * mMfwhxitemBhv.<span style="color: #CC4747">batchUpdate</span>(mMfwhxitemList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">mMfwhxitemBhv</span>.<span style="color: #CC4747">batchUpdate</span>(mMfwhxitemList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param mMfwhxitemList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<MMfwhxitem> mMfwhxitemList, SpecifyQuery<MMfwhxitemCB> colCBLambda) {
        return doBatchUpdate(mMfwhxitemList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * <span style="color: #70226C">for</span> (... : ...) {
     *     MMfwhxitem mMfwhxitem = <span style="color: #70226C">new</span> MMfwhxitem();
     *     mMfwhxitem.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         mMfwhxitem.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         mMfwhxitem.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//mMfwhxitem.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     mMfwhxitemList.add(mMfwhxitem);
     * }
     * <span style="color: #0000C0">mMfwhxitemBhv</span>.<span style="color: #CC4747">batchUpdate</span>(mMfwhxitemList);
     * </pre>
     * @param mMfwhxitemList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<MMfwhxitem> mMfwhxitemList) {
        return doBatchUpdateNonstrict(mMfwhxitemList, null);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * <span style="color: #0000C0">mMfwhxitemBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(mMfwhxitemList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">mMfwhxitemBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(mMfwhxitemList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).</p>
     * @param mMfwhxitemList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<MMfwhxitem> mMfwhxitemList, SpecifyQuery<MMfwhxitemCB> colCBLambda) {
        return doBatchUpdateNonstrict(mMfwhxitemList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param mMfwhxitemList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<MMfwhxitem> mMfwhxitemList) {
        return doBatchDelete(mMfwhxitemList, null);
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param mMfwhxitemList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<MMfwhxitem> mMfwhxitemList) {
        return doBatchDeleteNonstrict(mMfwhxitemList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">mMfwhxitemBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;MMfwhxitem, MMfwhxitemCB&gt;() {
     *     public ConditionBean setup(MMfwhxitem entity, MMfwhxitemCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<MMfwhxitem, MMfwhxitemCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * MMfwhxitem mMfwhxitem = <span style="color: #70226C">new</span> MMfwhxitem();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//mMfwhxitem.setPK...(value);</span>
     * mMfwhxitem.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mMfwhxitem.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mMfwhxitem.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mMfwhxitem.setVersionNo(value);</span>
     * MMfwhxitemCB cb = <span style="color: #70226C">new</span> MMfwhxitemCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">mMfwhxitemBhv</span>.<span style="color: #CC4747">queryUpdate</span>(mMfwhxitem, cb);
     * </pre>
     * @param mMfwhxitem The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of MMfwhxitem. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(MMfwhxitem mMfwhxitem, MMfwhxitemCB cb) {
        return doQueryUpdate(mMfwhxitem, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * MMfwhxitemCB cb = new MMfwhxitemCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">mMfwhxitemBhv</span>.<span style="color: #CC4747">queryDelete</span>(mMfwhxitem, cb);
     * </pre>
     * @param cb The condition-bean of MMfwhxitem. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(MMfwhxitemCB cb) {
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
     * MMfwhxitem mMfwhxitem = <span style="color: #70226C">new</span> MMfwhxitem();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * mMfwhxitem.setFoo...(value);
     * mMfwhxitem.setBar...(value);
     * <span style="color: #0000C0">mMfwhxitemBhv</span>.<span style="color: #CC4747">varyingInsert</span>(mMfwhxitem, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = mMfwhxitem.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param mMfwhxitem The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(MMfwhxitem mMfwhxitem, WritableOptionCall<MMfwhxitemCB, InsertOption<MMfwhxitemCB>> opLambda) {
        doInsert(mMfwhxitem, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * MMfwhxitem mMfwhxitem = <span style="color: #70226C">new</span> MMfwhxitem();
     * mMfwhxitem.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mMfwhxitem.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * mMfwhxitem.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">mMfwhxitemBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(mMfwhxitem, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param mMfwhxitem The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(MMfwhxitem mMfwhxitem, WritableOptionCall<MMfwhxitemCB, UpdateOption<MMfwhxitemCB>> opLambda) {
        doUpdate(mMfwhxitem, createUpdateOption(opLambda));
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * MMfwhxitem mMfwhxitem = <span style="color: #70226C">new</span> MMfwhxitem();
     * mMfwhxitem.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mMfwhxitem.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mMfwhxitem.setVersionNo(value);</span>
     * <span style="color: #0000C0">mMfwhxitemBhv</span>.<span style="color: #CC4747">varyingUpdateNonstrict</span>(mMfwhxitem, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param mMfwhxitem The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(MMfwhxitem mMfwhxitem, WritableOptionCall<MMfwhxitemCB, UpdateOption<MMfwhxitemCB>> opLambda) {
        doUpdateNonstrict(mMfwhxitem, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param mMfwhxitem The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(MMfwhxitem mMfwhxitem, WritableOptionCall<MMfwhxitemCB, InsertOption<MMfwhxitemCB>> insertOpLambda, WritableOptionCall<MMfwhxitemCB, UpdateOption<MMfwhxitemCB>> updateOpLambda) {
        doInsertOrUpdate(mMfwhxitem, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param mMfwhxitem The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(MMfwhxitem mMfwhxitem, WritableOptionCall<MMfwhxitemCB, InsertOption<MMfwhxitemCB>> insertOpLambda, WritableOptionCall<MMfwhxitemCB, UpdateOption<MMfwhxitemCB>> updateOpLambda) {
        doInsertOrUpdateNonstrict(mMfwhxitem, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param mMfwhxitem The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(MMfwhxitem mMfwhxitem, WritableOptionCall<MMfwhxitemCB, DeleteOption<MMfwhxitemCB>> opLambda) {
        doDelete(mMfwhxitem, createDeleteOption(opLambda));
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as deleteNonstrict(entity).
     * @param mMfwhxitem The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(MMfwhxitem mMfwhxitem, WritableOptionCall<MMfwhxitemCB, DeleteOption<MMfwhxitemCB>> opLambda) {
        doDeleteNonstrict(mMfwhxitem, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param mMfwhxitemList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<MMfwhxitem> mMfwhxitemList, WritableOptionCall<MMfwhxitemCB, InsertOption<MMfwhxitemCB>> opLambda) {
        return doBatchInsert(mMfwhxitemList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param mMfwhxitemList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<MMfwhxitem> mMfwhxitemList, WritableOptionCall<MMfwhxitemCB, UpdateOption<MMfwhxitemCB>> opLambda) {
        return doBatchUpdate(mMfwhxitemList, createUpdateOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param mMfwhxitemList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<MMfwhxitem> mMfwhxitemList, WritableOptionCall<MMfwhxitemCB, UpdateOption<MMfwhxitemCB>> opLambda) {
        return doBatchUpdateNonstrict(mMfwhxitemList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param mMfwhxitemList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<MMfwhxitem> mMfwhxitemList, WritableOptionCall<MMfwhxitemCB, DeleteOption<MMfwhxitemCB>> opLambda) {
        return doBatchDelete(mMfwhxitemList, createDeleteOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param mMfwhxitemList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<MMfwhxitem> mMfwhxitemList, WritableOptionCall<MMfwhxitemCB, DeleteOption<MMfwhxitemCB>> opLambda) {
        return doBatchDeleteNonstrict(mMfwhxitemList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<MMfwhxitem, MMfwhxitemCB> manyArgLambda, WritableOptionCall<MMfwhxitemCB, InsertOption<MMfwhxitemCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * MMfwhxitem mMfwhxitem = <span style="color: #70226C">new</span> MMfwhxitem();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//mMfwhxitem.setPK...(value);</span>
     * mMfwhxitem.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mMfwhxitem.setVersionNo(value);</span>
     * MMfwhxitemCB cb = <span style="color: #70226C">new</span> MMfwhxitemCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">mMfwhxitemBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(mMfwhxitem, cb, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param mMfwhxitem The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of MMfwhxitem. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(MMfwhxitem mMfwhxitem, MMfwhxitemCB cb, WritableOptionCall<MMfwhxitemCB, UpdateOption<MMfwhxitemCB>> opLambda) {
        return doQueryUpdate(mMfwhxitem, cb, createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * @param cb The condition-bean of MMfwhxitem. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(MMfwhxitemCB cb, WritableOptionCall<MMfwhxitemCB, DeleteOption<MMfwhxitemCB>> opLambda) {
        return doQueryDelete(cb, createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span>
     * mMfwhxitemBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span>
     * mMfwhxitemBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * mMfwhxitemBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * mMfwhxitemBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * mMfwhxitemBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * mMfwhxitemBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * mMfwhxitemBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span>
     * mMfwhxitemBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * mMfwhxitemBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * mMfwhxitemBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * mMfwhxitemBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * mMfwhxitemBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * mMfwhxitemBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span>
     * mMfwhxitemBhv.outideSql().removeBlockComment().selectList()
     * mMfwhxitemBhv.outideSql().removeLineComment().selectList()
     * mMfwhxitemBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlBasicExecutor<MMfwhxitemBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<MMfwhxitemBhv> facadeExecutor = doOutsideSql();
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
    protected Class<? extends MMfwhxitem> typeOfSelectedEntity() { return MMfwhxitem.class; }
    protected Class<MMfwhxitem> typeOfHandlingEntity() { return MMfwhxitem.class; }
    protected Class<MMfwhxitemCB> typeOfHandlingConditionBean() { return MMfwhxitemCB.class; }
}
