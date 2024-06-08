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
 * The behavior of T_PIC_MTHD_RCMD as TABLE. <br>
 * <pre>
 * [primary key]
 *     PIC_MTHD_RCMD_ID
 *
 * [column]
 *     PIC_MTHD_RCMD_ID, CLIENT_ID, CENTER_ID, PICKING_BATCH_NO, RCMD_PICKING_CLS, PACKING_NUM, WORK_VOLUME, DELIVERY_COURSE_CD, DELIVERY_COURSE_NM, CARRIER_CD, CARRIER_NM, EMERGENCY_FLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PIC_MTHD_RCMD_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     M_CENTER, M_CLIENT, B_CLASS_DTL(ByRcmdPickingCls)
 *
 * [referrer table]
 *     T_PIC_MTHD_RCMD_CART, T_PIC_MTHD_RCMD_DATA
 *
 * [foreign property]
 *     mCenter, mClient, bClassDtlByRcmdPickingCls, bClassDtlByEmergencyFlg
 *
 * [referrer property]
 *     tPicMthdRcmdCartList, tPicMthdRcmdDataList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsTPicMthdRcmdBhv extends AbstractBehaviorWritable<TPicMthdRcmd, TPicMthdRcmdCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public TPicMthdRcmdDbm asDBMeta() { return TPicMthdRcmdDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "T_PIC_MTHD_RCMD"; }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public TPicMthdRcmdDbm getMyDBMeta() { return TPicMthdRcmdDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public TPicMthdRcmdCB newConditionBean() { return new TPicMthdRcmdCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public TPicMthdRcmd newMyEntity() { return new TPicMthdRcmd(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public TPicMthdRcmdCB newMyConditionBean() { return new TPicMthdRcmdCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * TPicMthdRcmdCB cb = <span style="color: #70226C">new</span> TPicMthdRcmdCB();
     * cb.query().setFoo...(value);
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">tPicMthdRcmdBhv</span>.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of TPicMthdRcmd. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(TPicMthdRcmdCB cb) {
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
     * TPicMthdRcmdCB cb = <span style="color: #70226C">new</span> TPicMthdRcmdCB();
     * cb.query().setFoo...(value);
     * TPicMthdRcmd tPicMthdRcmd = <span style="color: #0000C0">tPicMthdRcmdBhv</span>.<span style="color: #DD4747">selectEntity</span>(cb);
     * <span style="color: #70226C">if</span> (tPicMthdRcmd != <span style="color: #70226C">null</span>) { <span style="color: #3F7E5E">// null check</span>
     *     ... = tPicMthdRcmd.get...();
     * } <span style="color: #70226C">else</span> {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of TPicMthdRcmd. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TPicMthdRcmd selectEntity(TPicMthdRcmdCB cb) {
        return facadeSelectEntity(cb);
    }

    protected TPicMthdRcmd facadeSelectEntity(TPicMthdRcmdCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends TPicMthdRcmd> OptionalEntity<ENTITY> doSelectOptionalEntity(TPicMthdRcmdCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * TPicMthdRcmdCB cb = <span style="color: #70226C">new</span> TPicMthdRcmdCB();
     * cb.query().set...;
     * TPicMthdRcmd tPicMthdRcmd = <span style="color: #0000C0">tPicMthdRcmdBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = tPicMthdRcmd.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of TPicMthdRcmd. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TPicMthdRcmd selectEntityWithDeletedCheck(TPicMthdRcmdCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param picMthdRcmdId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TPicMthdRcmd selectByPKValue(Long picMthdRcmdId) {
        return facadeSelectByPKValue(picMthdRcmdId);
    }

    protected TPicMthdRcmd facadeSelectByPKValue(Long picMthdRcmdId) {
        return doSelectByPK(picMthdRcmdId, typeOfSelectedEntity());
    }

    protected <ENTITY extends TPicMthdRcmd> ENTITY doSelectByPK(Long picMthdRcmdId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(picMthdRcmdId), tp);
    }

    protected <ENTITY extends TPicMthdRcmd> OptionalEntity<ENTITY> doSelectOptionalByPK(Long picMthdRcmdId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(picMthdRcmdId, tp), picMthdRcmdId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param picMthdRcmdId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TPicMthdRcmd selectByPKValueWithDeletedCheck(Long picMthdRcmdId) {
        return doSelectByPKWithDeletedCheck(picMthdRcmdId, typeOfSelectedEntity());
    }

    protected <ENTITY extends TPicMthdRcmd> ENTITY doSelectByPKWithDeletedCheck(Long picMthdRcmdId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(picMthdRcmdId), tp);
    }

    protected TPicMthdRcmdCB xprepareCBAsPK(Long picMthdRcmdId) {
        assertObjectNotNull("picMthdRcmdId", picMthdRcmdId);
        return newConditionBean().acceptPK(picMthdRcmdId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * TPicMthdRcmdCB cb = <span style="color: #70226C">new</span> TPicMthdRcmdCB();
     * cb.query().set...;
     * cb.query().addOrderBy...;
     * ListResultBean&lt;TPicMthdRcmd&gt; <span style="color: #553000">tPicMthdRcmdList</span> = <span style="color: #0000C0">tPicMthdRcmdBhv</span>.<span style="color: #CC4747">selectList</span>(cb);
     * <span style="color: #70226C">for</span> (TPicMthdRcmd tPicMthdRcmd : <span style="color: #553000">tPicMthdRcmdList</span>) {
     *     ... = tPicMthdRcmd.get...;
     * }
     * </pre>
     * @param cb The condition-bean of TPicMthdRcmd. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<TPicMthdRcmd> selectList(TPicMthdRcmdCB cb) {
        return facadeSelectList(cb);
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * TPicMthdRcmdCB cb = <span style="color: #70226C">new</span> TPicMthdRcmdCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;TPicMthdRcmd&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">tPicMthdRcmdBhv</span>.<span style="color: #CC4747">selectPage</span>(cb);
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (TPicMthdRcmd tPicMthdRcmd : <span style="color: #553000">page</span>) {
     *     ... = tPicMthdRcmd.get...();
     * }
     * </pre>
     * @param cb The condition-bean of TPicMthdRcmd. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<TPicMthdRcmd> selectPage(TPicMthdRcmdCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * TPicMthdRcmdCB cb = <span style="color: #70226C">new</span> TPicMthdRcmdCB();
     * cb.query().set...
     * <span style="color: #0000C0">tPicMthdRcmdBhv</span>.<span style="color: #CC4747">selectCursor</span>(cb, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cb The condition-bean of TPicMthdRcmd. (NotNull)
     * @param entityRowHandler The handler of entity row of TPicMthdRcmd. (NotNull)
     */
    public void selectCursor(TPicMthdRcmdCB cb, EntityRowHandler<TPicMthdRcmd> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">tPicMthdRcmdBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<TPicMthdRcmdCB, RESULT> selectScalar(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">tPicMthdRcmdBhv</span>.<span style="color: #CC4747">scalarSelect</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<TPicMthdRcmdCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param tPicMthdRcmdList The entity list of TPicMthdRcmd. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<TPicMthdRcmd> tPicMthdRcmdList, ReferrerLoaderHandler<LoaderOfTPicMthdRcmd> loaderLambda) {
        xassLRArg(tPicMthdRcmdList, loaderLambda);
        loaderLambda.handle(new LoaderOfTPicMthdRcmd().ready(tPicMthdRcmdList, _behaviorSelector));
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
     * @param tPicMthdRcmd The entity of TPicMthdRcmd. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(TPicMthdRcmd tPicMthdRcmd, ReferrerLoaderHandler<LoaderOfTPicMthdRcmd> loaderLambda) {
        xassLRArg(tPicMthdRcmd, loaderLambda);
        loaderLambda.handle(new LoaderOfTPicMthdRcmd().ready(xnewLRAryLs(tPicMthdRcmd), _behaviorSelector));
    }

    /**
     * Load referrer of TPicMthdRcmdCartList by the set-upper of referrer. <br>
     * T_PIC_MTHD_RCMD_CART by PIC_MTHD_RCMD_ID, named 'TPicMthdRcmdCartList'.
     * <pre>
     * <span style="color: #0000C0">tPicMthdRcmdBhv</span>.<span style="color: #CC4747">loadTPicMthdRcmdCartList</span>(<span style="color: #553000">tPicMthdRcmdList</span>, <span style="color: #553000">cartCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cartCB</span>.setupSelect...
     *     <span style="color: #553000">cartCB</span>.query().set...
     *     <span style="color: #553000">cartCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (TPicMthdRcmd tPicMthdRcmd : <span style="color: #553000">tPicMthdRcmdList</span>) {
     *     ... = tPicMthdRcmd.<span style="color: #CC4747">getTPicMthdRcmdCartList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setPicMthdRcmdId_InScope(pkList);
     * cb.query().addOrderBy_PicMthdRcmdId_Asc();
     * </pre>
     * @param tPicMthdRcmdList The entity list of TPicMthdRcmd. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TPicMthdRcmdCart> loadTPicMthdRcmdCartList(List<TPicMthdRcmd> tPicMthdRcmdList, ConditionBeanSetupper<TPicMthdRcmdCartCB> refCBLambda) {
        xassLRArg(tPicMthdRcmdList, refCBLambda);
        return doLoadTPicMthdRcmdCartList(tPicMthdRcmdList, new LoadReferrerOption<TPicMthdRcmdCartCB, TPicMthdRcmdCart>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TPicMthdRcmdCartList by the set-upper of referrer. <br>
     * T_PIC_MTHD_RCMD_CART by PIC_MTHD_RCMD_ID, named 'TPicMthdRcmdCartList'.
     * <pre>
     * <span style="color: #0000C0">tPicMthdRcmdBhv</span>.<span style="color: #CC4747">loadTPicMthdRcmdCartList</span>(<span style="color: #553000">tPicMthdRcmd</span>, <span style="color: #553000">cartCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cartCB</span>.setupSelect...
     *     <span style="color: #553000">cartCB</span>.query().set...
     *     <span style="color: #553000">cartCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">tPicMthdRcmd</span>.<span style="color: #CC4747">getTPicMthdRcmdCartList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setPicMthdRcmdId_InScope(pkList);
     * cb.query().addOrderBy_PicMthdRcmdId_Asc();
     * </pre>
     * @param tPicMthdRcmd The entity of TPicMthdRcmd. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TPicMthdRcmdCart> loadTPicMthdRcmdCartList(TPicMthdRcmd tPicMthdRcmd, ConditionBeanSetupper<TPicMthdRcmdCartCB> refCBLambda) {
        xassLRArg(tPicMthdRcmd, refCBLambda);
        return doLoadTPicMthdRcmdCartList(xnewLRLs(tPicMthdRcmd), new LoadReferrerOption<TPicMthdRcmdCartCB, TPicMthdRcmdCart>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param tPicMthdRcmd The entity of TPicMthdRcmd. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TPicMthdRcmdCart> loadTPicMthdRcmdCartList(TPicMthdRcmd tPicMthdRcmd, LoadReferrerOption<TPicMthdRcmdCartCB, TPicMthdRcmdCart> loadReferrerOption) {
        xassLRArg(tPicMthdRcmd, loadReferrerOption);
        return loadTPicMthdRcmdCartList(xnewLRLs(tPicMthdRcmd), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param tPicMthdRcmdList The entity list of TPicMthdRcmd. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TPicMthdRcmdCart> loadTPicMthdRcmdCartList(List<TPicMthdRcmd> tPicMthdRcmdList, LoadReferrerOption<TPicMthdRcmdCartCB, TPicMthdRcmdCart> loadReferrerOption) {
        xassLRArg(tPicMthdRcmdList, loadReferrerOption);
        if (tPicMthdRcmdList.isEmpty()) { return (NestedReferrerListGateway<TPicMthdRcmdCart>)EMPTY_NREF_LGWAY; }
        return doLoadTPicMthdRcmdCartList(tPicMthdRcmdList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TPicMthdRcmdCart> doLoadTPicMthdRcmdCartList(List<TPicMthdRcmd> tPicMthdRcmdList, LoadReferrerOption<TPicMthdRcmdCartCB, TPicMthdRcmdCart> option) {
        return helpLoadReferrerInternally(tPicMthdRcmdList, option, "tPicMthdRcmdCartList");
    }

    /**
     * Load referrer of TPicMthdRcmdDataList by the set-upper of referrer. <br>
     * T_PIC_MTHD_RCMD_DATA by PIC_MTHD_RCMD_ID, named 'TPicMthdRcmdDataList'.
     * <pre>
     * <span style="color: #0000C0">tPicMthdRcmdBhv</span>.<span style="color: #CC4747">loadTPicMthdRcmdDataList</span>(<span style="color: #553000">tPicMthdRcmdList</span>, <span style="color: #553000">dataCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">dataCB</span>.setupSelect...
     *     <span style="color: #553000">dataCB</span>.query().set...
     *     <span style="color: #553000">dataCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (TPicMthdRcmd tPicMthdRcmd : <span style="color: #553000">tPicMthdRcmdList</span>) {
     *     ... = tPicMthdRcmd.<span style="color: #CC4747">getTPicMthdRcmdDataList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setPicMthdRcmdId_InScope(pkList);
     * cb.query().addOrderBy_PicMthdRcmdId_Asc();
     * </pre>
     * @param tPicMthdRcmdList The entity list of TPicMthdRcmd. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TPicMthdRcmdData> loadTPicMthdRcmdDataList(List<TPicMthdRcmd> tPicMthdRcmdList, ConditionBeanSetupper<TPicMthdRcmdDataCB> refCBLambda) {
        xassLRArg(tPicMthdRcmdList, refCBLambda);
        return doLoadTPicMthdRcmdDataList(tPicMthdRcmdList, new LoadReferrerOption<TPicMthdRcmdDataCB, TPicMthdRcmdData>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TPicMthdRcmdDataList by the set-upper of referrer. <br>
     * T_PIC_MTHD_RCMD_DATA by PIC_MTHD_RCMD_ID, named 'TPicMthdRcmdDataList'.
     * <pre>
     * <span style="color: #0000C0">tPicMthdRcmdBhv</span>.<span style="color: #CC4747">loadTPicMthdRcmdDataList</span>(<span style="color: #553000">tPicMthdRcmd</span>, <span style="color: #553000">dataCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">dataCB</span>.setupSelect...
     *     <span style="color: #553000">dataCB</span>.query().set...
     *     <span style="color: #553000">dataCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">tPicMthdRcmd</span>.<span style="color: #CC4747">getTPicMthdRcmdDataList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setPicMthdRcmdId_InScope(pkList);
     * cb.query().addOrderBy_PicMthdRcmdId_Asc();
     * </pre>
     * @param tPicMthdRcmd The entity of TPicMthdRcmd. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TPicMthdRcmdData> loadTPicMthdRcmdDataList(TPicMthdRcmd tPicMthdRcmd, ConditionBeanSetupper<TPicMthdRcmdDataCB> refCBLambda) {
        xassLRArg(tPicMthdRcmd, refCBLambda);
        return doLoadTPicMthdRcmdDataList(xnewLRLs(tPicMthdRcmd), new LoadReferrerOption<TPicMthdRcmdDataCB, TPicMthdRcmdData>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param tPicMthdRcmd The entity of TPicMthdRcmd. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TPicMthdRcmdData> loadTPicMthdRcmdDataList(TPicMthdRcmd tPicMthdRcmd, LoadReferrerOption<TPicMthdRcmdDataCB, TPicMthdRcmdData> loadReferrerOption) {
        xassLRArg(tPicMthdRcmd, loadReferrerOption);
        return loadTPicMthdRcmdDataList(xnewLRLs(tPicMthdRcmd), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param tPicMthdRcmdList The entity list of TPicMthdRcmd. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TPicMthdRcmdData> loadTPicMthdRcmdDataList(List<TPicMthdRcmd> tPicMthdRcmdList, LoadReferrerOption<TPicMthdRcmdDataCB, TPicMthdRcmdData> loadReferrerOption) {
        xassLRArg(tPicMthdRcmdList, loadReferrerOption);
        if (tPicMthdRcmdList.isEmpty()) { return (NestedReferrerListGateway<TPicMthdRcmdData>)EMPTY_NREF_LGWAY; }
        return doLoadTPicMthdRcmdDataList(tPicMthdRcmdList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TPicMthdRcmdData> doLoadTPicMthdRcmdDataList(List<TPicMthdRcmd> tPicMthdRcmdList, LoadReferrerOption<TPicMthdRcmdDataCB, TPicMthdRcmdData> option) {
        return helpLoadReferrerInternally(tPicMthdRcmdList, option, "tPicMthdRcmdDataList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'MCenter'.
     * @param tPicMthdRcmdList The list of tPicMthdRcmd. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MCenter> pulloutMCenter(List<TPicMthdRcmd> tPicMthdRcmdList)
    { return helpPulloutInternally(tPicMthdRcmdList, "mCenter"); }

    /**
     * Pull out the list of foreign table 'MClient'.
     * @param tPicMthdRcmdList The list of tPicMthdRcmd. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MClient> pulloutMClient(List<TPicMthdRcmd> tPicMthdRcmdList)
    { return helpPulloutInternally(tPicMthdRcmdList, "mClient"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param tPicMthdRcmdList The list of tPicMthdRcmd. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByRcmdPickingCls(List<TPicMthdRcmd> tPicMthdRcmdList)
    { return helpPulloutInternally(tPicMthdRcmdList, "bClassDtlByRcmdPickingCls"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param tPicMthdRcmdList The list of tPicMthdRcmd. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByEmergencyFlg(List<TPicMthdRcmd> tPicMthdRcmdList)
    { return helpPulloutInternally(tPicMthdRcmdList, "bClassDtlByEmergencyFlg"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key picMthdRcmdId.
     * @param tPicMthdRcmdList The list of tPicMthdRcmd. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractPicMthdRcmdIdList(List<TPicMthdRcmd> tPicMthdRcmdList)
    { return helpExtractListInternally(tPicMthdRcmdList, "picMthdRcmdId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * TPicMthdRcmd tPicMthdRcmd = <span style="color: #70226C">new</span> TPicMthdRcmd();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * tPicMthdRcmd.setFoo...(value);
     * tPicMthdRcmd.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tPicMthdRcmd.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tPicMthdRcmd.set...;</span>
     * <span style="color: #0000C0">tPicMthdRcmdBhv</span>.<span style="color: #CC4747">insert</span>(tPicMthdRcmd);
     * ... = tPicMthdRcmd.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param tPicMthdRcmd The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(TPicMthdRcmd tPicMthdRcmd) {
        doInsert(tPicMthdRcmd, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * TPicMthdRcmd tPicMthdRcmd = <span style="color: #70226C">new</span> TPicMthdRcmd();
     * tPicMthdRcmd.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tPicMthdRcmd.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tPicMthdRcmd.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tPicMthdRcmd.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * tPicMthdRcmd.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">tPicMthdRcmdBhv</span>.<span style="color: #CC4747">update</span>(tPicMthdRcmd);
     * </pre>
     * @param tPicMthdRcmd The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(TPicMthdRcmd tPicMthdRcmd) {
        doUpdate(tPicMthdRcmd, null);
    }

    /**
     * Update the entity non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * TPicMthdRcmd tPicMthdRcmd = <span style="color: #70226C">new</span> TPicMthdRcmd();
     * tPicMthdRcmd.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tPicMthdRcmd.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tPicMthdRcmd.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tPicMthdRcmd.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tPicMthdRcmd.setVersionNo(value);</span>
     * <span style="color: #0000C0">tPicMthdRcmdBhv</span>.<span style="color: #CC4747">updateNonstrict</span>(tPicMthdRcmd);
     * </pre>
     * @param tPicMthdRcmd The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(TPicMthdRcmd tPicMthdRcmd) {
        doUpdateNonstrict(tPicMthdRcmd, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param tPicMthdRcmd The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(TPicMthdRcmd tPicMthdRcmd) {
        doInsertOrUpdate(tPicMthdRcmd, null, null);
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param tPicMthdRcmd The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(TPicMthdRcmd tPicMthdRcmd) {
        doInsertOrUpdateNonstrict(tPicMthdRcmd, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * TPicMthdRcmd tPicMthdRcmd = <span style="color: #70226C">new</span> TPicMthdRcmd();
     * tPicMthdRcmd.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * tPicMthdRcmd.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">tPicMthdRcmdBhv</span>.<span style="color: #CC4747">delete</span>(tPicMthdRcmd);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param tPicMthdRcmd The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(TPicMthdRcmd tPicMthdRcmd) {
        doDelete(tPicMthdRcmd, null);
    }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl} <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * TPicMthdRcmd tPicMthdRcmd = <span style="color: #70226C">new</span> TPicMthdRcmd();
     * tPicMthdRcmd.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tPicMthdRcmd.setVersionNo(value);</span>
     * <span style="color: #0000C0">tPicMthdRcmdBhv</span>.<span style="color: #CC4747">deleteNonstrict</span>(tPicMthdRcmd);
     * </pre>
     * @param tPicMthdRcmd The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(TPicMthdRcmd tPicMthdRcmd) {
        doDeleteNonstrict(tPicMthdRcmd, null);
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * TPicMthdRcmd tPicMthdRcmd = <span style="color: #70226C">new</span> TPicMthdRcmd();
     * tPicMthdRcmd.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tPicMthdRcmd.setVersionNo(value);</span>
     * <span style="color: #0000C0">tPicMthdRcmdBhv</span>.<span style="color: #CC4747">deleteNonstrictIgnoreDeleted</span>(tPicMthdRcmd);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param tPicMthdRcmd The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(TPicMthdRcmd tPicMthdRcmd) {
        doDeleteNonstrictIgnoreDeleted(tPicMthdRcmd, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(TPicMthdRcmd et, final DeleteOption<TPicMthdRcmdCB> op) {
        assertObjectNotNull("tPicMthdRcmd", et); prepareDeleteOption(op); helpDeleteNonstrictIgnoreDeletedInternally(et, op);
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
     *     TPicMthdRcmd tPicMthdRcmd = <span style="color: #70226C">new</span> TPicMthdRcmd();
     *     tPicMthdRcmd.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         tPicMthdRcmd.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     tPicMthdRcmdList.add(tPicMthdRcmd);
     * }
     * <span style="color: #0000C0">tPicMthdRcmdBhv</span>.<span style="color: #CC4747">batchInsert</span>(tPicMthdRcmdList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param tPicMthdRcmdList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<TPicMthdRcmd> tPicMthdRcmdList) {
        return doBatchInsert(tPicMthdRcmdList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     TPicMthdRcmd tPicMthdRcmd = <span style="color: #70226C">new</span> TPicMthdRcmd();
     *     tPicMthdRcmd.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         tPicMthdRcmd.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         tPicMthdRcmd.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//tPicMthdRcmd.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     tPicMthdRcmdList.add(tPicMthdRcmd);
     * }
     * <span style="color: #0000C0">tPicMthdRcmdBhv</span>.<span style="color: #CC4747">batchUpdate</span>(tPicMthdRcmdList);
     * </pre>
     * @param tPicMthdRcmdList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<TPicMthdRcmd> tPicMthdRcmdList) {
        return doBatchUpdate(tPicMthdRcmdList, null);
    }

    /**
     * Batch-update the entity list specified-only. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * tPicMthdRcmdBhv.<span style="color: #CC4747">batchUpdate</span>(tPicMthdRcmdList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">tPicMthdRcmdBhv</span>.<span style="color: #CC4747">batchUpdate</span>(tPicMthdRcmdList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param tPicMthdRcmdList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<TPicMthdRcmd> tPicMthdRcmdList, SpecifyQuery<TPicMthdRcmdCB> colCBLambda) {
        return doBatchUpdate(tPicMthdRcmdList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * <span style="color: #70226C">for</span> (... : ...) {
     *     TPicMthdRcmd tPicMthdRcmd = <span style="color: #70226C">new</span> TPicMthdRcmd();
     *     tPicMthdRcmd.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         tPicMthdRcmd.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         tPicMthdRcmd.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//tPicMthdRcmd.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     tPicMthdRcmdList.add(tPicMthdRcmd);
     * }
     * <span style="color: #0000C0">tPicMthdRcmdBhv</span>.<span style="color: #CC4747">batchUpdate</span>(tPicMthdRcmdList);
     * </pre>
     * @param tPicMthdRcmdList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<TPicMthdRcmd> tPicMthdRcmdList) {
        return doBatchUpdateNonstrict(tPicMthdRcmdList, null);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * <span style="color: #0000C0">tPicMthdRcmdBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(tPicMthdRcmdList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">tPicMthdRcmdBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(tPicMthdRcmdList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).</p>
     * @param tPicMthdRcmdList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<TPicMthdRcmd> tPicMthdRcmdList, SpecifyQuery<TPicMthdRcmdCB> colCBLambda) {
        return doBatchUpdateNonstrict(tPicMthdRcmdList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param tPicMthdRcmdList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<TPicMthdRcmd> tPicMthdRcmdList) {
        return doBatchDelete(tPicMthdRcmdList, null);
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param tPicMthdRcmdList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<TPicMthdRcmd> tPicMthdRcmdList) {
        return doBatchDeleteNonstrict(tPicMthdRcmdList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">tPicMthdRcmdBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;TPicMthdRcmd, TPicMthdRcmdCB&gt;() {
     *     public ConditionBean setup(TPicMthdRcmd entity, TPicMthdRcmdCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<TPicMthdRcmd, TPicMthdRcmdCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * TPicMthdRcmd tPicMthdRcmd = <span style="color: #70226C">new</span> TPicMthdRcmd();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//tPicMthdRcmd.setPK...(value);</span>
     * tPicMthdRcmd.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tPicMthdRcmd.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tPicMthdRcmd.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tPicMthdRcmd.setVersionNo(value);</span>
     * TPicMthdRcmdCB cb = <span style="color: #70226C">new</span> TPicMthdRcmdCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">tPicMthdRcmdBhv</span>.<span style="color: #CC4747">queryUpdate</span>(tPicMthdRcmd, cb);
     * </pre>
     * @param tPicMthdRcmd The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of TPicMthdRcmd. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(TPicMthdRcmd tPicMthdRcmd, TPicMthdRcmdCB cb) {
        return doQueryUpdate(tPicMthdRcmd, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * TPicMthdRcmdCB cb = new TPicMthdRcmdCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">tPicMthdRcmdBhv</span>.<span style="color: #CC4747">queryDelete</span>(tPicMthdRcmd, cb);
     * </pre>
     * @param cb The condition-bean of TPicMthdRcmd. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(TPicMthdRcmdCB cb) {
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
     * TPicMthdRcmd tPicMthdRcmd = <span style="color: #70226C">new</span> TPicMthdRcmd();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * tPicMthdRcmd.setFoo...(value);
     * tPicMthdRcmd.setBar...(value);
     * <span style="color: #0000C0">tPicMthdRcmdBhv</span>.<span style="color: #CC4747">varyingInsert</span>(tPicMthdRcmd, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = tPicMthdRcmd.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param tPicMthdRcmd The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(TPicMthdRcmd tPicMthdRcmd, WritableOptionCall<TPicMthdRcmdCB, InsertOption<TPicMthdRcmdCB>> opLambda) {
        doInsert(tPicMthdRcmd, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * TPicMthdRcmd tPicMthdRcmd = <span style="color: #70226C">new</span> TPicMthdRcmd();
     * tPicMthdRcmd.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tPicMthdRcmd.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * tPicMthdRcmd.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">tPicMthdRcmdBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(tPicMthdRcmd, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param tPicMthdRcmd The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(TPicMthdRcmd tPicMthdRcmd, WritableOptionCall<TPicMthdRcmdCB, UpdateOption<TPicMthdRcmdCB>> opLambda) {
        doUpdate(tPicMthdRcmd, createUpdateOption(opLambda));
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * TPicMthdRcmd tPicMthdRcmd = <span style="color: #70226C">new</span> TPicMthdRcmd();
     * tPicMthdRcmd.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tPicMthdRcmd.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tPicMthdRcmd.setVersionNo(value);</span>
     * <span style="color: #0000C0">tPicMthdRcmdBhv</span>.<span style="color: #CC4747">varyingUpdateNonstrict</span>(tPicMthdRcmd, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param tPicMthdRcmd The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(TPicMthdRcmd tPicMthdRcmd, WritableOptionCall<TPicMthdRcmdCB, UpdateOption<TPicMthdRcmdCB>> opLambda) {
        doUpdateNonstrict(tPicMthdRcmd, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param tPicMthdRcmd The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(TPicMthdRcmd tPicMthdRcmd, WritableOptionCall<TPicMthdRcmdCB, InsertOption<TPicMthdRcmdCB>> insertOpLambda, WritableOptionCall<TPicMthdRcmdCB, UpdateOption<TPicMthdRcmdCB>> updateOpLambda) {
        doInsertOrUpdate(tPicMthdRcmd, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param tPicMthdRcmd The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(TPicMthdRcmd tPicMthdRcmd, WritableOptionCall<TPicMthdRcmdCB, InsertOption<TPicMthdRcmdCB>> insertOpLambda, WritableOptionCall<TPicMthdRcmdCB, UpdateOption<TPicMthdRcmdCB>> updateOpLambda) {
        doInsertOrUpdateNonstrict(tPicMthdRcmd, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param tPicMthdRcmd The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(TPicMthdRcmd tPicMthdRcmd, WritableOptionCall<TPicMthdRcmdCB, DeleteOption<TPicMthdRcmdCB>> opLambda) {
        doDelete(tPicMthdRcmd, createDeleteOption(opLambda));
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as deleteNonstrict(entity).
     * @param tPicMthdRcmd The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(TPicMthdRcmd tPicMthdRcmd, WritableOptionCall<TPicMthdRcmdCB, DeleteOption<TPicMthdRcmdCB>> opLambda) {
        doDeleteNonstrict(tPicMthdRcmd, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param tPicMthdRcmdList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<TPicMthdRcmd> tPicMthdRcmdList, WritableOptionCall<TPicMthdRcmdCB, InsertOption<TPicMthdRcmdCB>> opLambda) {
        return doBatchInsert(tPicMthdRcmdList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param tPicMthdRcmdList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<TPicMthdRcmd> tPicMthdRcmdList, WritableOptionCall<TPicMthdRcmdCB, UpdateOption<TPicMthdRcmdCB>> opLambda) {
        return doBatchUpdate(tPicMthdRcmdList, createUpdateOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param tPicMthdRcmdList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<TPicMthdRcmd> tPicMthdRcmdList, WritableOptionCall<TPicMthdRcmdCB, UpdateOption<TPicMthdRcmdCB>> opLambda) {
        return doBatchUpdateNonstrict(tPicMthdRcmdList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param tPicMthdRcmdList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<TPicMthdRcmd> tPicMthdRcmdList, WritableOptionCall<TPicMthdRcmdCB, DeleteOption<TPicMthdRcmdCB>> opLambda) {
        return doBatchDelete(tPicMthdRcmdList, createDeleteOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param tPicMthdRcmdList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<TPicMthdRcmd> tPicMthdRcmdList, WritableOptionCall<TPicMthdRcmdCB, DeleteOption<TPicMthdRcmdCB>> opLambda) {
        return doBatchDeleteNonstrict(tPicMthdRcmdList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<TPicMthdRcmd, TPicMthdRcmdCB> manyArgLambda, WritableOptionCall<TPicMthdRcmdCB, InsertOption<TPicMthdRcmdCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * TPicMthdRcmd tPicMthdRcmd = <span style="color: #70226C">new</span> TPicMthdRcmd();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//tPicMthdRcmd.setPK...(value);</span>
     * tPicMthdRcmd.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tPicMthdRcmd.setVersionNo(value);</span>
     * TPicMthdRcmdCB cb = <span style="color: #70226C">new</span> TPicMthdRcmdCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">tPicMthdRcmdBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(tPicMthdRcmd, cb, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param tPicMthdRcmd The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of TPicMthdRcmd. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(TPicMthdRcmd tPicMthdRcmd, TPicMthdRcmdCB cb, WritableOptionCall<TPicMthdRcmdCB, UpdateOption<TPicMthdRcmdCB>> opLambda) {
        return doQueryUpdate(tPicMthdRcmd, cb, createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * @param cb The condition-bean of TPicMthdRcmd. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(TPicMthdRcmdCB cb, WritableOptionCall<TPicMthdRcmdCB, DeleteOption<TPicMthdRcmdCB>> opLambda) {
        return doQueryDelete(cb, createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span>
     * tPicMthdRcmdBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span>
     * tPicMthdRcmdBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * tPicMthdRcmdBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * tPicMthdRcmdBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * tPicMthdRcmdBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * tPicMthdRcmdBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * tPicMthdRcmdBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span>
     * tPicMthdRcmdBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * tPicMthdRcmdBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * tPicMthdRcmdBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * tPicMthdRcmdBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * tPicMthdRcmdBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * tPicMthdRcmdBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span>
     * tPicMthdRcmdBhv.outideSql().removeBlockComment().selectList()
     * tPicMthdRcmdBhv.outideSql().removeLineComment().selectList()
     * tPicMthdRcmdBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlBasicExecutor<TPicMthdRcmdBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<TPicMthdRcmdBhv> facadeExecutor = doOutsideSql();
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
    protected Class<? extends TPicMthdRcmd> typeOfSelectedEntity() { return TPicMthdRcmd.class; }
    protected Class<TPicMthdRcmd> typeOfHandlingEntity() { return TPicMthdRcmd.class; }
    protected Class<TPicMthdRcmdCB> typeOfHandlingConditionBean() { return TPicMthdRcmdCB.class; }
}
