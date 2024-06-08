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
 * The behavior of T_CORDDTASR as TABLE. <br>
 * <pre>
 * [primary key]
 *     ORDER_SORT_ID
 *
 * [column]
 *     ORDER_SORT_ID, ORDER_H_ID, SRWHCD, DPCD, ZZORDYMD, ORDGR, DLVYMD, DED, PSTNID, SCDDLVYMD, SCDDED, SCDPSTNID, HPYNID, IPYNID, SRDED, SRPSTNID, SRYMD, SROPRTCNT, SRLINCD, SRRNK, DLVSNM, DLVDTLSNM, SSCD, SSNM, HDVID, DTLSNM, ZZMATNR, SLQACB, SLQACT, SLQANUM, LINBLK, LOCNO, LOCID, DLVPRTRNK, SRDLVYMD, SRHPYNID, SRIPYNID, SRSRLINCD, SRSRRNK, SRDLVSNM, SRDLVDTLSNM, SRDLVPRTRNK, BRTYP, BOXNO, BOXNOCNSNM, BOXTYP, MGBOXDID, DMDID, TTBOXQA, BOXCTQATA, BOXCTQAAPSRPLC, TTSROPRTCNT, BXMTRID, SPPLYMD, SLPTYP, SEQNO, OTORGCD, ORDORGCD, RLYBSCD, DLVRNK, LMPDLVNO, DIVMTD, SLEDIV, HVRTRSN, HVRTINOTYMD, CNGPRTSLPNO, TRNSCTNDIV, EOSORDAFTFLG, EOSSLPNO, HDRDBXDIV, INOTRFSLDIV, BXMNTRFSLDIV, SLPMRGTMG, SLPOTYMD, CMPCD, STSCD, STGVAL, SLPNO, TTTOPDEDRNK, CORDRCVCNT, ORDDVFG, LBCBQA, DRCLSTLBCBID, LBBOXNO, LBTTBOXQA, IKEIINCLDFLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     ORDER_SORT_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     T_CORDHDR
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     tCordhdr
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsTCorddtasrBhv extends AbstractBehaviorWritable<TCorddtasr, TCorddtasrCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public TCorddtasrDbm asDBMeta() { return TCorddtasrDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "T_CORDDTASR"; }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public TCorddtasrDbm getMyDBMeta() { return TCorddtasrDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public TCorddtasrCB newConditionBean() { return new TCorddtasrCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public TCorddtasr newMyEntity() { return new TCorddtasr(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public TCorddtasrCB newMyConditionBean() { return new TCorddtasrCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * TCorddtasrCB cb = <span style="color: #70226C">new</span> TCorddtasrCB();
     * cb.query().setFoo...(value);
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">tCorddtasrBhv</span>.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of TCorddtasr. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(TCorddtasrCB cb) {
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
     * TCorddtasrCB cb = <span style="color: #70226C">new</span> TCorddtasrCB();
     * cb.query().setFoo...(value);
     * TCorddtasr tCorddtasr = <span style="color: #0000C0">tCorddtasrBhv</span>.<span style="color: #DD4747">selectEntity</span>(cb);
     * <span style="color: #70226C">if</span> (tCorddtasr != <span style="color: #70226C">null</span>) { <span style="color: #3F7E5E">// null check</span>
     *     ... = tCorddtasr.get...();
     * } <span style="color: #70226C">else</span> {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of TCorddtasr. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TCorddtasr selectEntity(TCorddtasrCB cb) {
        return facadeSelectEntity(cb);
    }

    protected TCorddtasr facadeSelectEntity(TCorddtasrCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends TCorddtasr> OptionalEntity<ENTITY> doSelectOptionalEntity(TCorddtasrCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * TCorddtasrCB cb = <span style="color: #70226C">new</span> TCorddtasrCB();
     * cb.query().set...;
     * TCorddtasr tCorddtasr = <span style="color: #0000C0">tCorddtasrBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = tCorddtasr.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of TCorddtasr. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TCorddtasr selectEntityWithDeletedCheck(TCorddtasrCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param orderSortId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TCorddtasr selectByPKValue(Long orderSortId) {
        return facadeSelectByPKValue(orderSortId);
    }

    protected TCorddtasr facadeSelectByPKValue(Long orderSortId) {
        return doSelectByPK(orderSortId, typeOfSelectedEntity());
    }

    protected <ENTITY extends TCorddtasr> ENTITY doSelectByPK(Long orderSortId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(orderSortId), tp);
    }

    protected <ENTITY extends TCorddtasr> OptionalEntity<ENTITY> doSelectOptionalByPK(Long orderSortId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(orderSortId, tp), orderSortId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param orderSortId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TCorddtasr selectByPKValueWithDeletedCheck(Long orderSortId) {
        return doSelectByPKWithDeletedCheck(orderSortId, typeOfSelectedEntity());
    }

    protected <ENTITY extends TCorddtasr> ENTITY doSelectByPKWithDeletedCheck(Long orderSortId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(orderSortId), tp);
    }

    protected TCorddtasrCB xprepareCBAsPK(Long orderSortId) {
        assertObjectNotNull("orderSortId", orderSortId);
        return newConditionBean().acceptPK(orderSortId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * TCorddtasrCB cb = <span style="color: #70226C">new</span> TCorddtasrCB();
     * cb.query().set...;
     * cb.query().addOrderBy...;
     * ListResultBean&lt;TCorddtasr&gt; <span style="color: #553000">tCorddtasrList</span> = <span style="color: #0000C0">tCorddtasrBhv</span>.<span style="color: #CC4747">selectList</span>(cb);
     * <span style="color: #70226C">for</span> (TCorddtasr tCorddtasr : <span style="color: #553000">tCorddtasrList</span>) {
     *     ... = tCorddtasr.get...;
     * }
     * </pre>
     * @param cb The condition-bean of TCorddtasr. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<TCorddtasr> selectList(TCorddtasrCB cb) {
        return facadeSelectList(cb);
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * TCorddtasrCB cb = <span style="color: #70226C">new</span> TCorddtasrCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;TCorddtasr&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">tCorddtasrBhv</span>.<span style="color: #CC4747">selectPage</span>(cb);
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (TCorddtasr tCorddtasr : <span style="color: #553000">page</span>) {
     *     ... = tCorddtasr.get...();
     * }
     * </pre>
     * @param cb The condition-bean of TCorddtasr. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<TCorddtasr> selectPage(TCorddtasrCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * TCorddtasrCB cb = <span style="color: #70226C">new</span> TCorddtasrCB();
     * cb.query().set...
     * <span style="color: #0000C0">tCorddtasrBhv</span>.<span style="color: #CC4747">selectCursor</span>(cb, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cb The condition-bean of TCorddtasr. (NotNull)
     * @param entityRowHandler The handler of entity row of TCorddtasr. (NotNull)
     */
    public void selectCursor(TCorddtasrCB cb, EntityRowHandler<TCorddtasr> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">tCorddtasrBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<TCorddtasrCB, RESULT> selectScalar(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">tCorddtasrBhv</span>.<span style="color: #CC4747">scalarSelect</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<TCorddtasrCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param tCorddtasrList The entity list of TCorddtasr. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<TCorddtasr> tCorddtasrList, ReferrerLoaderHandler<LoaderOfTCorddtasr> loaderLambda) {
        xassLRArg(tCorddtasrList, loaderLambda);
        loaderLambda.handle(new LoaderOfTCorddtasr().ready(tCorddtasrList, _behaviorSelector));
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
     * @param tCorddtasr The entity of TCorddtasr. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(TCorddtasr tCorddtasr, ReferrerLoaderHandler<LoaderOfTCorddtasr> loaderLambda) {
        xassLRArg(tCorddtasr, loaderLambda);
        loaderLambda.handle(new LoaderOfTCorddtasr().ready(xnewLRAryLs(tCorddtasr), _behaviorSelector));
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'TCordhdr'.
     * @param tCorddtasrList The list of tCorddtasr. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<TCordhdr> pulloutTCordhdr(List<TCorddtasr> tCorddtasrList)
    { return helpPulloutInternally(tCorddtasrList, "tCordhdr"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key orderSortId.
     * @param tCorddtasrList The list of tCorddtasr. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractOrderSortIdList(List<TCorddtasr> tCorddtasrList)
    { return helpExtractListInternally(tCorddtasrList, "orderSortId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * TCorddtasr tCorddtasr = <span style="color: #70226C">new</span> TCorddtasr();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * tCorddtasr.setFoo...(value);
     * tCorddtasr.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tCorddtasr.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tCorddtasr.set...;</span>
     * <span style="color: #0000C0">tCorddtasrBhv</span>.<span style="color: #CC4747">insert</span>(tCorddtasr);
     * ... = tCorddtasr.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param tCorddtasr The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(TCorddtasr tCorddtasr) {
        doInsert(tCorddtasr, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * TCorddtasr tCorddtasr = <span style="color: #70226C">new</span> TCorddtasr();
     * tCorddtasr.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tCorddtasr.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tCorddtasr.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tCorddtasr.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * tCorddtasr.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">tCorddtasrBhv</span>.<span style="color: #CC4747">update</span>(tCorddtasr);
     * </pre>
     * @param tCorddtasr The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(TCorddtasr tCorddtasr) {
        doUpdate(tCorddtasr, null);
    }

    /**
     * Update the entity non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * TCorddtasr tCorddtasr = <span style="color: #70226C">new</span> TCorddtasr();
     * tCorddtasr.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tCorddtasr.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tCorddtasr.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tCorddtasr.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tCorddtasr.setVersionNo(value);</span>
     * <span style="color: #0000C0">tCorddtasrBhv</span>.<span style="color: #CC4747">updateNonstrict</span>(tCorddtasr);
     * </pre>
     * @param tCorddtasr The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(TCorddtasr tCorddtasr) {
        doUpdateNonstrict(tCorddtasr, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param tCorddtasr The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(TCorddtasr tCorddtasr) {
        doInsertOrUpdate(tCorddtasr, null, null);
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param tCorddtasr The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(TCorddtasr tCorddtasr) {
        doInsertOrUpdateNonstrict(tCorddtasr, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * TCorddtasr tCorddtasr = <span style="color: #70226C">new</span> TCorddtasr();
     * tCorddtasr.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * tCorddtasr.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">tCorddtasrBhv</span>.<span style="color: #CC4747">delete</span>(tCorddtasr);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param tCorddtasr The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(TCorddtasr tCorddtasr) {
        doDelete(tCorddtasr, null);
    }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl} <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * TCorddtasr tCorddtasr = <span style="color: #70226C">new</span> TCorddtasr();
     * tCorddtasr.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tCorddtasr.setVersionNo(value);</span>
     * <span style="color: #0000C0">tCorddtasrBhv</span>.<span style="color: #CC4747">deleteNonstrict</span>(tCorddtasr);
     * </pre>
     * @param tCorddtasr The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(TCorddtasr tCorddtasr) {
        doDeleteNonstrict(tCorddtasr, null);
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * TCorddtasr tCorddtasr = <span style="color: #70226C">new</span> TCorddtasr();
     * tCorddtasr.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tCorddtasr.setVersionNo(value);</span>
     * <span style="color: #0000C0">tCorddtasrBhv</span>.<span style="color: #CC4747">deleteNonstrictIgnoreDeleted</span>(tCorddtasr);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param tCorddtasr The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(TCorddtasr tCorddtasr) {
        doDeleteNonstrictIgnoreDeleted(tCorddtasr, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(TCorddtasr et, final DeleteOption<TCorddtasrCB> op) {
        assertObjectNotNull("tCorddtasr", et); prepareDeleteOption(op); helpDeleteNonstrictIgnoreDeletedInternally(et, op);
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
     *     TCorddtasr tCorddtasr = <span style="color: #70226C">new</span> TCorddtasr();
     *     tCorddtasr.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         tCorddtasr.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     tCorddtasrList.add(tCorddtasr);
     * }
     * <span style="color: #0000C0">tCorddtasrBhv</span>.<span style="color: #CC4747">batchInsert</span>(tCorddtasrList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param tCorddtasrList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<TCorddtasr> tCorddtasrList) {
        return doBatchInsert(tCorddtasrList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     TCorddtasr tCorddtasr = <span style="color: #70226C">new</span> TCorddtasr();
     *     tCorddtasr.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         tCorddtasr.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         tCorddtasr.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//tCorddtasr.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     tCorddtasrList.add(tCorddtasr);
     * }
     * <span style="color: #0000C0">tCorddtasrBhv</span>.<span style="color: #CC4747">batchUpdate</span>(tCorddtasrList);
     * </pre>
     * @param tCorddtasrList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<TCorddtasr> tCorddtasrList) {
        return doBatchUpdate(tCorddtasrList, null);
    }

    /**
     * Batch-update the entity list specified-only. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * tCorddtasrBhv.<span style="color: #CC4747">batchUpdate</span>(tCorddtasrList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">tCorddtasrBhv</span>.<span style="color: #CC4747">batchUpdate</span>(tCorddtasrList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param tCorddtasrList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<TCorddtasr> tCorddtasrList, SpecifyQuery<TCorddtasrCB> colCBLambda) {
        return doBatchUpdate(tCorddtasrList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * <span style="color: #70226C">for</span> (... : ...) {
     *     TCorddtasr tCorddtasr = <span style="color: #70226C">new</span> TCorddtasr();
     *     tCorddtasr.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         tCorddtasr.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         tCorddtasr.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//tCorddtasr.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     tCorddtasrList.add(tCorddtasr);
     * }
     * <span style="color: #0000C0">tCorddtasrBhv</span>.<span style="color: #CC4747">batchUpdate</span>(tCorddtasrList);
     * </pre>
     * @param tCorddtasrList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<TCorddtasr> tCorddtasrList) {
        return doBatchUpdateNonstrict(tCorddtasrList, null);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * <span style="color: #0000C0">tCorddtasrBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(tCorddtasrList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">tCorddtasrBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(tCorddtasrList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).</p>
     * @param tCorddtasrList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<TCorddtasr> tCorddtasrList, SpecifyQuery<TCorddtasrCB> colCBLambda) {
        return doBatchUpdateNonstrict(tCorddtasrList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param tCorddtasrList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<TCorddtasr> tCorddtasrList) {
        return doBatchDelete(tCorddtasrList, null);
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param tCorddtasrList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<TCorddtasr> tCorddtasrList) {
        return doBatchDeleteNonstrict(tCorddtasrList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">tCorddtasrBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;TCorddtasr, TCorddtasrCB&gt;() {
     *     public ConditionBean setup(TCorddtasr entity, TCorddtasrCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<TCorddtasr, TCorddtasrCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * TCorddtasr tCorddtasr = <span style="color: #70226C">new</span> TCorddtasr();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//tCorddtasr.setPK...(value);</span>
     * tCorddtasr.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tCorddtasr.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tCorddtasr.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tCorddtasr.setVersionNo(value);</span>
     * TCorddtasrCB cb = <span style="color: #70226C">new</span> TCorddtasrCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">tCorddtasrBhv</span>.<span style="color: #CC4747">queryUpdate</span>(tCorddtasr, cb);
     * </pre>
     * @param tCorddtasr The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of TCorddtasr. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(TCorddtasr tCorddtasr, TCorddtasrCB cb) {
        return doQueryUpdate(tCorddtasr, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * TCorddtasrCB cb = new TCorddtasrCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">tCorddtasrBhv</span>.<span style="color: #CC4747">queryDelete</span>(tCorddtasr, cb);
     * </pre>
     * @param cb The condition-bean of TCorddtasr. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(TCorddtasrCB cb) {
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
     * TCorddtasr tCorddtasr = <span style="color: #70226C">new</span> TCorddtasr();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * tCorddtasr.setFoo...(value);
     * tCorddtasr.setBar...(value);
     * <span style="color: #0000C0">tCorddtasrBhv</span>.<span style="color: #CC4747">varyingInsert</span>(tCorddtasr, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = tCorddtasr.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param tCorddtasr The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(TCorddtasr tCorddtasr, WritableOptionCall<TCorddtasrCB, InsertOption<TCorddtasrCB>> opLambda) {
        doInsert(tCorddtasr, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * TCorddtasr tCorddtasr = <span style="color: #70226C">new</span> TCorddtasr();
     * tCorddtasr.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tCorddtasr.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * tCorddtasr.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">tCorddtasrBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(tCorddtasr, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param tCorddtasr The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(TCorddtasr tCorddtasr, WritableOptionCall<TCorddtasrCB, UpdateOption<TCorddtasrCB>> opLambda) {
        doUpdate(tCorddtasr, createUpdateOption(opLambda));
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * TCorddtasr tCorddtasr = <span style="color: #70226C">new</span> TCorddtasr();
     * tCorddtasr.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tCorddtasr.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tCorddtasr.setVersionNo(value);</span>
     * <span style="color: #0000C0">tCorddtasrBhv</span>.<span style="color: #CC4747">varyingUpdateNonstrict</span>(tCorddtasr, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param tCorddtasr The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(TCorddtasr tCorddtasr, WritableOptionCall<TCorddtasrCB, UpdateOption<TCorddtasrCB>> opLambda) {
        doUpdateNonstrict(tCorddtasr, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param tCorddtasr The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(TCorddtasr tCorddtasr, WritableOptionCall<TCorddtasrCB, InsertOption<TCorddtasrCB>> insertOpLambda, WritableOptionCall<TCorddtasrCB, UpdateOption<TCorddtasrCB>> updateOpLambda) {
        doInsertOrUpdate(tCorddtasr, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param tCorddtasr The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(TCorddtasr tCorddtasr, WritableOptionCall<TCorddtasrCB, InsertOption<TCorddtasrCB>> insertOpLambda, WritableOptionCall<TCorddtasrCB, UpdateOption<TCorddtasrCB>> updateOpLambda) {
        doInsertOrUpdateNonstrict(tCorddtasr, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param tCorddtasr The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(TCorddtasr tCorddtasr, WritableOptionCall<TCorddtasrCB, DeleteOption<TCorddtasrCB>> opLambda) {
        doDelete(tCorddtasr, createDeleteOption(opLambda));
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as deleteNonstrict(entity).
     * @param tCorddtasr The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(TCorddtasr tCorddtasr, WritableOptionCall<TCorddtasrCB, DeleteOption<TCorddtasrCB>> opLambda) {
        doDeleteNonstrict(tCorddtasr, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param tCorddtasrList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<TCorddtasr> tCorddtasrList, WritableOptionCall<TCorddtasrCB, InsertOption<TCorddtasrCB>> opLambda) {
        return doBatchInsert(tCorddtasrList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param tCorddtasrList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<TCorddtasr> tCorddtasrList, WritableOptionCall<TCorddtasrCB, UpdateOption<TCorddtasrCB>> opLambda) {
        return doBatchUpdate(tCorddtasrList, createUpdateOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param tCorddtasrList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<TCorddtasr> tCorddtasrList, WritableOptionCall<TCorddtasrCB, UpdateOption<TCorddtasrCB>> opLambda) {
        return doBatchUpdateNonstrict(tCorddtasrList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param tCorddtasrList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<TCorddtasr> tCorddtasrList, WritableOptionCall<TCorddtasrCB, DeleteOption<TCorddtasrCB>> opLambda) {
        return doBatchDelete(tCorddtasrList, createDeleteOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param tCorddtasrList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<TCorddtasr> tCorddtasrList, WritableOptionCall<TCorddtasrCB, DeleteOption<TCorddtasrCB>> opLambda) {
        return doBatchDeleteNonstrict(tCorddtasrList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<TCorddtasr, TCorddtasrCB> manyArgLambda, WritableOptionCall<TCorddtasrCB, InsertOption<TCorddtasrCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * TCorddtasr tCorddtasr = <span style="color: #70226C">new</span> TCorddtasr();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//tCorddtasr.setPK...(value);</span>
     * tCorddtasr.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tCorddtasr.setVersionNo(value);</span>
     * TCorddtasrCB cb = <span style="color: #70226C">new</span> TCorddtasrCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">tCorddtasrBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(tCorddtasr, cb, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param tCorddtasr The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of TCorddtasr. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(TCorddtasr tCorddtasr, TCorddtasrCB cb, WritableOptionCall<TCorddtasrCB, UpdateOption<TCorddtasrCB>> opLambda) {
        return doQueryUpdate(tCorddtasr, cb, createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * @param cb The condition-bean of TCorddtasr. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(TCorddtasrCB cb, WritableOptionCall<TCorddtasrCB, DeleteOption<TCorddtasrCB>> opLambda) {
        return doQueryDelete(cb, createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span>
     * tCorddtasrBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span>
     * tCorddtasrBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * tCorddtasrBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * tCorddtasrBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * tCorddtasrBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * tCorddtasrBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * tCorddtasrBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span>
     * tCorddtasrBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * tCorddtasrBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * tCorddtasrBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * tCorddtasrBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * tCorddtasrBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * tCorddtasrBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span>
     * tCorddtasrBhv.outideSql().removeBlockComment().selectList()
     * tCorddtasrBhv.outideSql().removeLineComment().selectList()
     * tCorddtasrBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlBasicExecutor<TCorddtasrBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<TCorddtasrBhv> facadeExecutor = doOutsideSql();
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
    protected Class<? extends TCorddtasr> typeOfSelectedEntity() { return TCorddtasr.class; }
    protected Class<TCorddtasr> typeOfHandlingEntity() { return TCorddtasr.class; }
    protected Class<TCorddtasrCB> typeOfHandlingConditionBean() { return TCorddtasrCB.class; }
}
