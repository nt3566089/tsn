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
 * The behavior of M_IMPORT_TYPE_B as TABLE. <br>
 * <pre>
 * [primary key]
 *     IMPORT_TYPE_B_ID
 *
 * [column]
 *     IMPORT_TYPE_B_ID, IMPORT_TYPE_ID, COLUMN_NO, EDI_COLUMN_ID, UPLOAD_COLUMN_NM, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     IMPORT_TYPE_B_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     M_EDI_COLUMN, M_IMPORT_TYPE
 *
 * [referrer table]
 *     M_IMPORT_TYPE_B_COPY_B, M_IMPORT_TYPE_B_COPY_H
 *
 * [foreign property]
 *     mEdiColumn, mImportType
 *
 * [referrer property]
 *     mImportTypeBCopyBList, mImportTypeBCopyHList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsMImportTypeBBhv extends AbstractBehaviorWritable<MImportTypeB, MImportTypeBCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public MImportTypeBDbm asDBMeta() { return MImportTypeBDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "M_IMPORT_TYPE_B"; }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public MImportTypeBDbm getMyDBMeta() { return MImportTypeBDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public MImportTypeBCB newConditionBean() { return new MImportTypeBCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public MImportTypeB newMyEntity() { return new MImportTypeB(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public MImportTypeBCB newMyConditionBean() { return new MImportTypeBCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * MImportTypeBCB cb = <span style="color: #70226C">new</span> MImportTypeBCB();
     * cb.query().setFoo...(value);
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">mImportTypeBBhv</span>.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of MImportTypeB. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(MImportTypeBCB cb) {
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
     * MImportTypeBCB cb = <span style="color: #70226C">new</span> MImportTypeBCB();
     * cb.query().setFoo...(value);
     * MImportTypeB mImportTypeB = <span style="color: #0000C0">mImportTypeBBhv</span>.<span style="color: #DD4747">selectEntity</span>(cb);
     * <span style="color: #70226C">if</span> (mImportTypeB != <span style="color: #70226C">null</span>) { <span style="color: #3F7E5E">// null check</span>
     *     ... = mImportTypeB.get...();
     * } <span style="color: #70226C">else</span> {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of MImportTypeB. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MImportTypeB selectEntity(MImportTypeBCB cb) {
        return facadeSelectEntity(cb);
    }

    protected MImportTypeB facadeSelectEntity(MImportTypeBCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends MImportTypeB> OptionalEntity<ENTITY> doSelectOptionalEntity(MImportTypeBCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * MImportTypeBCB cb = <span style="color: #70226C">new</span> MImportTypeBCB();
     * cb.query().set...;
     * MImportTypeB mImportTypeB = <span style="color: #0000C0">mImportTypeBBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = mImportTypeB.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of MImportTypeB. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MImportTypeB selectEntityWithDeletedCheck(MImportTypeBCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param importTypeBId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MImportTypeB selectByPKValue(Long importTypeBId) {
        return facadeSelectByPKValue(importTypeBId);
    }

    protected MImportTypeB facadeSelectByPKValue(Long importTypeBId) {
        return doSelectByPK(importTypeBId, typeOfSelectedEntity());
    }

    protected <ENTITY extends MImportTypeB> ENTITY doSelectByPK(Long importTypeBId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(importTypeBId), tp);
    }

    protected <ENTITY extends MImportTypeB> OptionalEntity<ENTITY> doSelectOptionalByPK(Long importTypeBId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(importTypeBId, tp), importTypeBId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param importTypeBId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MImportTypeB selectByPKValueWithDeletedCheck(Long importTypeBId) {
        return doSelectByPKWithDeletedCheck(importTypeBId, typeOfSelectedEntity());
    }

    protected <ENTITY extends MImportTypeB> ENTITY doSelectByPKWithDeletedCheck(Long importTypeBId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(importTypeBId), tp);
    }

    protected MImportTypeBCB xprepareCBAsPK(Long importTypeBId) {
        assertObjectNotNull("importTypeBId", importTypeBId);
        return newConditionBean().acceptPK(importTypeBId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * MImportTypeBCB cb = <span style="color: #70226C">new</span> MImportTypeBCB();
     * cb.query().set...;
     * cb.query().addOrderBy...;
     * ListResultBean&lt;MImportTypeB&gt; <span style="color: #553000">mImportTypeBList</span> = <span style="color: #0000C0">mImportTypeBBhv</span>.<span style="color: #CC4747">selectList</span>(cb);
     * <span style="color: #70226C">for</span> (MImportTypeB mImportTypeB : <span style="color: #553000">mImportTypeBList</span>) {
     *     ... = mImportTypeB.get...;
     * }
     * </pre>
     * @param cb The condition-bean of MImportTypeB. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<MImportTypeB> selectList(MImportTypeBCB cb) {
        return facadeSelectList(cb);
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * MImportTypeBCB cb = <span style="color: #70226C">new</span> MImportTypeBCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;MImportTypeB&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">mImportTypeBBhv</span>.<span style="color: #CC4747">selectPage</span>(cb);
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (MImportTypeB mImportTypeB : <span style="color: #553000">page</span>) {
     *     ... = mImportTypeB.get...();
     * }
     * </pre>
     * @param cb The condition-bean of MImportTypeB. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<MImportTypeB> selectPage(MImportTypeBCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * MImportTypeBCB cb = <span style="color: #70226C">new</span> MImportTypeBCB();
     * cb.query().set...
     * <span style="color: #0000C0">mImportTypeBBhv</span>.<span style="color: #CC4747">selectCursor</span>(cb, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cb The condition-bean of MImportTypeB. (NotNull)
     * @param entityRowHandler The handler of entity row of MImportTypeB. (NotNull)
     */
    public void selectCursor(MImportTypeBCB cb, EntityRowHandler<MImportTypeB> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">mImportTypeBBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<MImportTypeBCB, RESULT> selectScalar(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">mImportTypeBBhv</span>.<span style="color: #CC4747">scalarSelect</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<MImportTypeBCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param mImportTypeBList The entity list of MImportTypeB. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<MImportTypeB> mImportTypeBList, ReferrerLoaderHandler<LoaderOfMImportTypeB> loaderLambda) {
        xassLRArg(mImportTypeBList, loaderLambda);
        loaderLambda.handle(new LoaderOfMImportTypeB().ready(mImportTypeBList, _behaviorSelector));
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
     * @param mImportTypeB The entity of MImportTypeB. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(MImportTypeB mImportTypeB, ReferrerLoaderHandler<LoaderOfMImportTypeB> loaderLambda) {
        xassLRArg(mImportTypeB, loaderLambda);
        loaderLambda.handle(new LoaderOfMImportTypeB().ready(xnewLRAryLs(mImportTypeB), _behaviorSelector));
    }

    /**
     * Load referrer of MImportTypeBCopyBList by the set-upper of referrer. <br>
     * M_IMPORT_TYPE_B_COPY_B by IMPORT_TYPE_B_ID, named 'MImportTypeBCopyBList'.
     * <pre>
     * <span style="color: #0000C0">mImportTypeBBhv</span>.<span style="color: #CC4747">loadMImportTypeBCopyBList</span>(<span style="color: #553000">mImportTypeBList</span>, <span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bCB</span>.setupSelect...
     *     <span style="color: #553000">bCB</span>.query().set...
     *     <span style="color: #553000">bCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MImportTypeB mImportTypeB : <span style="color: #553000">mImportTypeBList</span>) {
     *     ... = mImportTypeB.<span style="color: #CC4747">getMImportTypeBCopyBList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setImportTypeBId_InScope(pkList);
     * cb.query().addOrderBy_ImportTypeBId_Asc();
     * </pre>
     * @param mImportTypeBList The entity list of MImportTypeB. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MImportTypeBCopyB> loadMImportTypeBCopyBList(List<MImportTypeB> mImportTypeBList, ConditionBeanSetupper<MImportTypeBCopyBCB> refCBLambda) {
        xassLRArg(mImportTypeBList, refCBLambda);
        return doLoadMImportTypeBCopyBList(mImportTypeBList, new LoadReferrerOption<MImportTypeBCopyBCB, MImportTypeBCopyB>().xinit(refCBLambda));
    }

    /**
     * Load referrer of MImportTypeBCopyBList by the set-upper of referrer. <br>
     * M_IMPORT_TYPE_B_COPY_B by IMPORT_TYPE_B_ID, named 'MImportTypeBCopyBList'.
     * <pre>
     * <span style="color: #0000C0">mImportTypeBBhv</span>.<span style="color: #CC4747">loadMImportTypeBCopyBList</span>(<span style="color: #553000">mImportTypeB</span>, <span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bCB</span>.setupSelect...
     *     <span style="color: #553000">bCB</span>.query().set...
     *     <span style="color: #553000">bCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mImportTypeB</span>.<span style="color: #CC4747">getMImportTypeBCopyBList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setImportTypeBId_InScope(pkList);
     * cb.query().addOrderBy_ImportTypeBId_Asc();
     * </pre>
     * @param mImportTypeB The entity of MImportTypeB. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MImportTypeBCopyB> loadMImportTypeBCopyBList(MImportTypeB mImportTypeB, ConditionBeanSetupper<MImportTypeBCopyBCB> refCBLambda) {
        xassLRArg(mImportTypeB, refCBLambda);
        return doLoadMImportTypeBCopyBList(xnewLRLs(mImportTypeB), new LoadReferrerOption<MImportTypeBCopyBCB, MImportTypeBCopyB>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mImportTypeB The entity of MImportTypeB. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MImportTypeBCopyB> loadMImportTypeBCopyBList(MImportTypeB mImportTypeB, LoadReferrerOption<MImportTypeBCopyBCB, MImportTypeBCopyB> loadReferrerOption) {
        xassLRArg(mImportTypeB, loadReferrerOption);
        return loadMImportTypeBCopyBList(xnewLRLs(mImportTypeB), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mImportTypeBList The entity list of MImportTypeB. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<MImportTypeBCopyB> loadMImportTypeBCopyBList(List<MImportTypeB> mImportTypeBList, LoadReferrerOption<MImportTypeBCopyBCB, MImportTypeBCopyB> loadReferrerOption) {
        xassLRArg(mImportTypeBList, loadReferrerOption);
        if (mImportTypeBList.isEmpty()) { return (NestedReferrerListGateway<MImportTypeBCopyB>)EMPTY_NREF_LGWAY; }
        return doLoadMImportTypeBCopyBList(mImportTypeBList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<MImportTypeBCopyB> doLoadMImportTypeBCopyBList(List<MImportTypeB> mImportTypeBList, LoadReferrerOption<MImportTypeBCopyBCB, MImportTypeBCopyB> option) {
        return helpLoadReferrerInternally(mImportTypeBList, option, "mImportTypeBCopyBList");
    }

    /**
     * Load referrer of MImportTypeBCopyHList by the set-upper of referrer. <br>
     * M_IMPORT_TYPE_B_COPY_H by IMPORT_TYPE_B_ID, named 'MImportTypeBCopyHList'.
     * <pre>
     * <span style="color: #0000C0">mImportTypeBBhv</span>.<span style="color: #CC4747">loadMImportTypeBCopyHList</span>(<span style="color: #553000">mImportTypeBList</span>, <span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hCB</span>.setupSelect...
     *     <span style="color: #553000">hCB</span>.query().set...
     *     <span style="color: #553000">hCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MImportTypeB mImportTypeB : <span style="color: #553000">mImportTypeBList</span>) {
     *     ... = mImportTypeB.<span style="color: #CC4747">getMImportTypeBCopyHList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setImportTypeBId_InScope(pkList);
     * cb.query().addOrderBy_ImportTypeBId_Asc();
     * </pre>
     * @param mImportTypeBList The entity list of MImportTypeB. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MImportTypeBCopyH> loadMImportTypeBCopyHList(List<MImportTypeB> mImportTypeBList, ConditionBeanSetupper<MImportTypeBCopyHCB> refCBLambda) {
        xassLRArg(mImportTypeBList, refCBLambda);
        return doLoadMImportTypeBCopyHList(mImportTypeBList, new LoadReferrerOption<MImportTypeBCopyHCB, MImportTypeBCopyH>().xinit(refCBLambda));
    }

    /**
     * Load referrer of MImportTypeBCopyHList by the set-upper of referrer. <br>
     * M_IMPORT_TYPE_B_COPY_H by IMPORT_TYPE_B_ID, named 'MImportTypeBCopyHList'.
     * <pre>
     * <span style="color: #0000C0">mImportTypeBBhv</span>.<span style="color: #CC4747">loadMImportTypeBCopyHList</span>(<span style="color: #553000">mImportTypeB</span>, <span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hCB</span>.setupSelect...
     *     <span style="color: #553000">hCB</span>.query().set...
     *     <span style="color: #553000">hCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mImportTypeB</span>.<span style="color: #CC4747">getMImportTypeBCopyHList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setImportTypeBId_InScope(pkList);
     * cb.query().addOrderBy_ImportTypeBId_Asc();
     * </pre>
     * @param mImportTypeB The entity of MImportTypeB. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MImportTypeBCopyH> loadMImportTypeBCopyHList(MImportTypeB mImportTypeB, ConditionBeanSetupper<MImportTypeBCopyHCB> refCBLambda) {
        xassLRArg(mImportTypeB, refCBLambda);
        return doLoadMImportTypeBCopyHList(xnewLRLs(mImportTypeB), new LoadReferrerOption<MImportTypeBCopyHCB, MImportTypeBCopyH>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mImportTypeB The entity of MImportTypeB. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MImportTypeBCopyH> loadMImportTypeBCopyHList(MImportTypeB mImportTypeB, LoadReferrerOption<MImportTypeBCopyHCB, MImportTypeBCopyH> loadReferrerOption) {
        xassLRArg(mImportTypeB, loadReferrerOption);
        return loadMImportTypeBCopyHList(xnewLRLs(mImportTypeB), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mImportTypeBList The entity list of MImportTypeB. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<MImportTypeBCopyH> loadMImportTypeBCopyHList(List<MImportTypeB> mImportTypeBList, LoadReferrerOption<MImportTypeBCopyHCB, MImportTypeBCopyH> loadReferrerOption) {
        xassLRArg(mImportTypeBList, loadReferrerOption);
        if (mImportTypeBList.isEmpty()) { return (NestedReferrerListGateway<MImportTypeBCopyH>)EMPTY_NREF_LGWAY; }
        return doLoadMImportTypeBCopyHList(mImportTypeBList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<MImportTypeBCopyH> doLoadMImportTypeBCopyHList(List<MImportTypeB> mImportTypeBList, LoadReferrerOption<MImportTypeBCopyHCB, MImportTypeBCopyH> option) {
        return helpLoadReferrerInternally(mImportTypeBList, option, "mImportTypeBCopyHList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'MEdiColumn'.
     * @param mImportTypeBList The list of mImportTypeB. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MEdiColumn> pulloutMEdiColumn(List<MImportTypeB> mImportTypeBList)
    { return helpPulloutInternally(mImportTypeBList, "mEdiColumn"); }

    /**
     * Pull out the list of foreign table 'MImportType'.
     * @param mImportTypeBList The list of mImportTypeB. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MImportType> pulloutMImportType(List<MImportTypeB> mImportTypeBList)
    { return helpPulloutInternally(mImportTypeBList, "mImportType"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key importTypeBId.
     * @param mImportTypeBList The list of mImportTypeB. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractImportTypeBIdList(List<MImportTypeB> mImportTypeBList)
    { return helpExtractListInternally(mImportTypeBList, "importTypeBId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * MImportTypeB mImportTypeB = <span style="color: #70226C">new</span> MImportTypeB();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * mImportTypeB.setFoo...(value);
     * mImportTypeB.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mImportTypeB.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mImportTypeB.set...;</span>
     * <span style="color: #0000C0">mImportTypeBBhv</span>.<span style="color: #CC4747">insert</span>(mImportTypeB);
     * ... = mImportTypeB.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param mImportTypeB The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(MImportTypeB mImportTypeB) {
        doInsert(mImportTypeB, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * MImportTypeB mImportTypeB = <span style="color: #70226C">new</span> MImportTypeB();
     * mImportTypeB.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mImportTypeB.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mImportTypeB.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mImportTypeB.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * mImportTypeB.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">mImportTypeBBhv</span>.<span style="color: #CC4747">update</span>(mImportTypeB);
     * </pre>
     * @param mImportTypeB The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(MImportTypeB mImportTypeB) {
        doUpdate(mImportTypeB, null);
    }

    /**
     * Update the entity non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * MImportTypeB mImportTypeB = <span style="color: #70226C">new</span> MImportTypeB();
     * mImportTypeB.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mImportTypeB.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mImportTypeB.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mImportTypeB.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mImportTypeB.setVersionNo(value);</span>
     * <span style="color: #0000C0">mImportTypeBBhv</span>.<span style="color: #CC4747">updateNonstrict</span>(mImportTypeB);
     * </pre>
     * @param mImportTypeB The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(MImportTypeB mImportTypeB) {
        doUpdateNonstrict(mImportTypeB, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param mImportTypeB The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(MImportTypeB mImportTypeB) {
        doInsertOrUpdate(mImportTypeB, null, null);
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param mImportTypeB The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(MImportTypeB mImportTypeB) {
        doInsertOrUpdateNonstrict(mImportTypeB, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * MImportTypeB mImportTypeB = <span style="color: #70226C">new</span> MImportTypeB();
     * mImportTypeB.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * mImportTypeB.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">mImportTypeBBhv</span>.<span style="color: #CC4747">delete</span>(mImportTypeB);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param mImportTypeB The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(MImportTypeB mImportTypeB) {
        doDelete(mImportTypeB, null);
    }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl} <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * MImportTypeB mImportTypeB = <span style="color: #70226C">new</span> MImportTypeB();
     * mImportTypeB.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mImportTypeB.setVersionNo(value);</span>
     * <span style="color: #0000C0">mImportTypeBBhv</span>.<span style="color: #CC4747">deleteNonstrict</span>(mImportTypeB);
     * </pre>
     * @param mImportTypeB The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(MImportTypeB mImportTypeB) {
        doDeleteNonstrict(mImportTypeB, null);
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * MImportTypeB mImportTypeB = <span style="color: #70226C">new</span> MImportTypeB();
     * mImportTypeB.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mImportTypeB.setVersionNo(value);</span>
     * <span style="color: #0000C0">mImportTypeBBhv</span>.<span style="color: #CC4747">deleteNonstrictIgnoreDeleted</span>(mImportTypeB);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param mImportTypeB The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(MImportTypeB mImportTypeB) {
        doDeleteNonstrictIgnoreDeleted(mImportTypeB, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(MImportTypeB et, final DeleteOption<MImportTypeBCB> op) {
        assertObjectNotNull("mImportTypeB", et); prepareDeleteOption(op); helpDeleteNonstrictIgnoreDeletedInternally(et, op);
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
     *     MImportTypeB mImportTypeB = <span style="color: #70226C">new</span> MImportTypeB();
     *     mImportTypeB.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         mImportTypeB.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     mImportTypeBList.add(mImportTypeB);
     * }
     * <span style="color: #0000C0">mImportTypeBBhv</span>.<span style="color: #CC4747">batchInsert</span>(mImportTypeBList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param mImportTypeBList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<MImportTypeB> mImportTypeBList) {
        return doBatchInsert(mImportTypeBList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     MImportTypeB mImportTypeB = <span style="color: #70226C">new</span> MImportTypeB();
     *     mImportTypeB.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         mImportTypeB.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         mImportTypeB.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//mImportTypeB.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     mImportTypeBList.add(mImportTypeB);
     * }
     * <span style="color: #0000C0">mImportTypeBBhv</span>.<span style="color: #CC4747">batchUpdate</span>(mImportTypeBList);
     * </pre>
     * @param mImportTypeBList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<MImportTypeB> mImportTypeBList) {
        return doBatchUpdate(mImportTypeBList, null);
    }

    /**
     * Batch-update the entity list specified-only. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * mImportTypeBBhv.<span style="color: #CC4747">batchUpdate</span>(mImportTypeBList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">mImportTypeBBhv</span>.<span style="color: #CC4747">batchUpdate</span>(mImportTypeBList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param mImportTypeBList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<MImportTypeB> mImportTypeBList, SpecifyQuery<MImportTypeBCB> colCBLambda) {
        return doBatchUpdate(mImportTypeBList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * <span style="color: #70226C">for</span> (... : ...) {
     *     MImportTypeB mImportTypeB = <span style="color: #70226C">new</span> MImportTypeB();
     *     mImportTypeB.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         mImportTypeB.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         mImportTypeB.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//mImportTypeB.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     mImportTypeBList.add(mImportTypeB);
     * }
     * <span style="color: #0000C0">mImportTypeBBhv</span>.<span style="color: #CC4747">batchUpdate</span>(mImportTypeBList);
     * </pre>
     * @param mImportTypeBList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<MImportTypeB> mImportTypeBList) {
        return doBatchUpdateNonstrict(mImportTypeBList, null);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * <span style="color: #0000C0">mImportTypeBBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(mImportTypeBList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">mImportTypeBBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(mImportTypeBList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).</p>
     * @param mImportTypeBList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<MImportTypeB> mImportTypeBList, SpecifyQuery<MImportTypeBCB> colCBLambda) {
        return doBatchUpdateNonstrict(mImportTypeBList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param mImportTypeBList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<MImportTypeB> mImportTypeBList) {
        return doBatchDelete(mImportTypeBList, null);
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param mImportTypeBList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<MImportTypeB> mImportTypeBList) {
        return doBatchDeleteNonstrict(mImportTypeBList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">mImportTypeBBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;MImportTypeB, MImportTypeBCB&gt;() {
     *     public ConditionBean setup(MImportTypeB entity, MImportTypeBCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<MImportTypeB, MImportTypeBCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * MImportTypeB mImportTypeB = <span style="color: #70226C">new</span> MImportTypeB();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//mImportTypeB.setPK...(value);</span>
     * mImportTypeB.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mImportTypeB.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mImportTypeB.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mImportTypeB.setVersionNo(value);</span>
     * MImportTypeBCB cb = <span style="color: #70226C">new</span> MImportTypeBCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">mImportTypeBBhv</span>.<span style="color: #CC4747">queryUpdate</span>(mImportTypeB, cb);
     * </pre>
     * @param mImportTypeB The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of MImportTypeB. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(MImportTypeB mImportTypeB, MImportTypeBCB cb) {
        return doQueryUpdate(mImportTypeB, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * MImportTypeBCB cb = new MImportTypeBCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">mImportTypeBBhv</span>.<span style="color: #CC4747">queryDelete</span>(mImportTypeB, cb);
     * </pre>
     * @param cb The condition-bean of MImportTypeB. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(MImportTypeBCB cb) {
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
     * MImportTypeB mImportTypeB = <span style="color: #70226C">new</span> MImportTypeB();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * mImportTypeB.setFoo...(value);
     * mImportTypeB.setBar...(value);
     * <span style="color: #0000C0">mImportTypeBBhv</span>.<span style="color: #CC4747">varyingInsert</span>(mImportTypeB, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = mImportTypeB.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param mImportTypeB The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(MImportTypeB mImportTypeB, WritableOptionCall<MImportTypeBCB, InsertOption<MImportTypeBCB>> opLambda) {
        doInsert(mImportTypeB, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * MImportTypeB mImportTypeB = <span style="color: #70226C">new</span> MImportTypeB();
     * mImportTypeB.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mImportTypeB.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * mImportTypeB.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">mImportTypeBBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(mImportTypeB, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param mImportTypeB The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(MImportTypeB mImportTypeB, WritableOptionCall<MImportTypeBCB, UpdateOption<MImportTypeBCB>> opLambda) {
        doUpdate(mImportTypeB, createUpdateOption(opLambda));
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * MImportTypeB mImportTypeB = <span style="color: #70226C">new</span> MImportTypeB();
     * mImportTypeB.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mImportTypeB.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mImportTypeB.setVersionNo(value);</span>
     * <span style="color: #0000C0">mImportTypeBBhv</span>.<span style="color: #CC4747">varyingUpdateNonstrict</span>(mImportTypeB, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param mImportTypeB The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(MImportTypeB mImportTypeB, WritableOptionCall<MImportTypeBCB, UpdateOption<MImportTypeBCB>> opLambda) {
        doUpdateNonstrict(mImportTypeB, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param mImportTypeB The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(MImportTypeB mImportTypeB, WritableOptionCall<MImportTypeBCB, InsertOption<MImportTypeBCB>> insertOpLambda, WritableOptionCall<MImportTypeBCB, UpdateOption<MImportTypeBCB>> updateOpLambda) {
        doInsertOrUpdate(mImportTypeB, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param mImportTypeB The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(MImportTypeB mImportTypeB, WritableOptionCall<MImportTypeBCB, InsertOption<MImportTypeBCB>> insertOpLambda, WritableOptionCall<MImportTypeBCB, UpdateOption<MImportTypeBCB>> updateOpLambda) {
        doInsertOrUpdateNonstrict(mImportTypeB, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param mImportTypeB The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(MImportTypeB mImportTypeB, WritableOptionCall<MImportTypeBCB, DeleteOption<MImportTypeBCB>> opLambda) {
        doDelete(mImportTypeB, createDeleteOption(opLambda));
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as deleteNonstrict(entity).
     * @param mImportTypeB The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(MImportTypeB mImportTypeB, WritableOptionCall<MImportTypeBCB, DeleteOption<MImportTypeBCB>> opLambda) {
        doDeleteNonstrict(mImportTypeB, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param mImportTypeBList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<MImportTypeB> mImportTypeBList, WritableOptionCall<MImportTypeBCB, InsertOption<MImportTypeBCB>> opLambda) {
        return doBatchInsert(mImportTypeBList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param mImportTypeBList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<MImportTypeB> mImportTypeBList, WritableOptionCall<MImportTypeBCB, UpdateOption<MImportTypeBCB>> opLambda) {
        return doBatchUpdate(mImportTypeBList, createUpdateOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param mImportTypeBList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<MImportTypeB> mImportTypeBList, WritableOptionCall<MImportTypeBCB, UpdateOption<MImportTypeBCB>> opLambda) {
        return doBatchUpdateNonstrict(mImportTypeBList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param mImportTypeBList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<MImportTypeB> mImportTypeBList, WritableOptionCall<MImportTypeBCB, DeleteOption<MImportTypeBCB>> opLambda) {
        return doBatchDelete(mImportTypeBList, createDeleteOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param mImportTypeBList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<MImportTypeB> mImportTypeBList, WritableOptionCall<MImportTypeBCB, DeleteOption<MImportTypeBCB>> opLambda) {
        return doBatchDeleteNonstrict(mImportTypeBList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<MImportTypeB, MImportTypeBCB> manyArgLambda, WritableOptionCall<MImportTypeBCB, InsertOption<MImportTypeBCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * MImportTypeB mImportTypeB = <span style="color: #70226C">new</span> MImportTypeB();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//mImportTypeB.setPK...(value);</span>
     * mImportTypeB.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mImportTypeB.setVersionNo(value);</span>
     * MImportTypeBCB cb = <span style="color: #70226C">new</span> MImportTypeBCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">mImportTypeBBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(mImportTypeB, cb, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param mImportTypeB The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of MImportTypeB. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(MImportTypeB mImportTypeB, MImportTypeBCB cb, WritableOptionCall<MImportTypeBCB, UpdateOption<MImportTypeBCB>> opLambda) {
        return doQueryUpdate(mImportTypeB, cb, createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * @param cb The condition-bean of MImportTypeB. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(MImportTypeBCB cb, WritableOptionCall<MImportTypeBCB, DeleteOption<MImportTypeBCB>> opLambda) {
        return doQueryDelete(cb, createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span>
     * mImportTypeBBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span>
     * mImportTypeBBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * mImportTypeBBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * mImportTypeBBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * mImportTypeBBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * mImportTypeBBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * mImportTypeBBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span>
     * mImportTypeBBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * mImportTypeBBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * mImportTypeBBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * mImportTypeBBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * mImportTypeBBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * mImportTypeBBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span>
     * mImportTypeBBhv.outideSql().removeBlockComment().selectList()
     * mImportTypeBBhv.outideSql().removeLineComment().selectList()
     * mImportTypeBBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlBasicExecutor<MImportTypeBBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<MImportTypeBBhv> facadeExecutor = doOutsideSql();
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
    protected Class<? extends MImportTypeB> typeOfSelectedEntity() { return MImportTypeB.class; }
    protected Class<MImportTypeB> typeOfHandlingEntity() { return MImportTypeB.class; }
    protected Class<MImportTypeBCB> typeOfHandlingConditionBean() { return MImportTypeBCB.class; }
}
