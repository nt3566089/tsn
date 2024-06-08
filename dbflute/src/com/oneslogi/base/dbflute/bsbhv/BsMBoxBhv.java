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
 * The behavior of M_BOX as TABLE. <br>
 * <pre>
 * [primary key]
 *     BOX_ID
 *
 * [column]
 *     BOX_ID, CENTER_ID, BOX_CD, BOX_NM, LENGTH, WIDTH, HEIGHT, VOLUME, VOLUME_RATE, PERMIT_VOLUME, PERMIT_WEIGHT, BOX_TYPE, BXOSZL, BXOSZW, BXOSZH, BXWEIGHT, bxcpy, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     BOX_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     M_CENTER, B_CLASS_DTL(ByDelFlg)
 *
 * [referrer table]
 *     M_BOX_GRP, M_BOX_GRP_DTL, M_CARRIER_BOX, M_PARAM, T_PACKING_H, W_HT_SHIPPING, W_SGL_ROW_SHIP_INSP_H, W_SHIPPING_INTERRUPT
 *
 * [foreign property]
 *     mCenter, bClassDtlByDelFlg
 *
 * [referrer property]
 *     mBoxGrpList, mBoxGrpDtlList, mCarrierBoxList, mParamList, tPackingHList, wHtShippingList, wSglRowShipInspHList, wShippingInterruptList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsMBoxBhv extends AbstractBehaviorWritable<MBox, MBoxCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /** 梱包箱情報マスタメンテナンスを取得します。 */
    public static final String PATH_selectSqlBoxMaster = "selectSqlBoxMaster";
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public MBoxDbm asDBMeta() { return MBoxDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "M_BOX"; }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public MBoxDbm getMyDBMeta() { return MBoxDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public MBoxCB newConditionBean() { return new MBoxCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public MBox newMyEntity() { return new MBox(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public MBoxCB newMyConditionBean() { return new MBoxCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * MBoxCB cb = <span style="color: #70226C">new</span> MBoxCB();
     * cb.query().setFoo...(value);
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">mBoxBhv</span>.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of MBox. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(MBoxCB cb) {
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
     * MBoxCB cb = <span style="color: #70226C">new</span> MBoxCB();
     * cb.query().setFoo...(value);
     * MBox mBox = <span style="color: #0000C0">mBoxBhv</span>.<span style="color: #DD4747">selectEntity</span>(cb);
     * <span style="color: #70226C">if</span> (mBox != <span style="color: #70226C">null</span>) { <span style="color: #3F7E5E">// null check</span>
     *     ... = mBox.get...();
     * } <span style="color: #70226C">else</span> {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of MBox. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MBox selectEntity(MBoxCB cb) {
        return facadeSelectEntity(cb);
    }

    protected MBox facadeSelectEntity(MBoxCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends MBox> OptionalEntity<ENTITY> doSelectOptionalEntity(MBoxCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * MBoxCB cb = <span style="color: #70226C">new</span> MBoxCB();
     * cb.query().set...;
     * MBox mBox = <span style="color: #0000C0">mBoxBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = mBox.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of MBox. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MBox selectEntityWithDeletedCheck(MBoxCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param boxId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MBox selectByPKValue(Long boxId) {
        return facadeSelectByPKValue(boxId);
    }

    protected MBox facadeSelectByPKValue(Long boxId) {
        return doSelectByPK(boxId, typeOfSelectedEntity());
    }

    protected <ENTITY extends MBox> ENTITY doSelectByPK(Long boxId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(boxId), tp);
    }

    protected <ENTITY extends MBox> OptionalEntity<ENTITY> doSelectOptionalByPK(Long boxId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(boxId, tp), boxId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param boxId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MBox selectByPKValueWithDeletedCheck(Long boxId) {
        return doSelectByPKWithDeletedCheck(boxId, typeOfSelectedEntity());
    }

    protected <ENTITY extends MBox> ENTITY doSelectByPKWithDeletedCheck(Long boxId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(boxId), tp);
    }

    protected MBoxCB xprepareCBAsPK(Long boxId) {
        assertObjectNotNull("boxId", boxId);
        return newConditionBean().acceptPK(boxId);
    }

    /**
     * Select the entity by the unique-key value.
     * @param centerId : UQ+, NotNull, bigint(19), FK to M_CENTER. (NotNull)
     * @param boxCd : +UQ, IX, NotNull, varchar(30). (NotNull)
     * @return The optional entity selected by the unique key. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<MBox> selectByUniqueOf(Long centerId, String boxCd) {
        return facadeSelectByUniqueOf(centerId, boxCd);
    }

    protected OptionalEntity<MBox> facadeSelectByUniqueOf(Long centerId, String boxCd) {
        return doSelectByUniqueOf(centerId, boxCd, typeOfSelectedEntity());
    }

    protected <ENTITY extends MBox> OptionalEntity<ENTITY> doSelectByUniqueOf(Long centerId, String boxCd, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(xprepareCBAsUniqueOf(centerId, boxCd), tp), centerId, boxCd);
    }

    protected MBoxCB xprepareCBAsUniqueOf(Long centerId, String boxCd) {
        assertObjectNotNull("centerId", centerId);assertObjectNotNull("boxCd", boxCd);
        return newConditionBean().acceptUniqueOf(centerId, boxCd);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * MBoxCB cb = <span style="color: #70226C">new</span> MBoxCB();
     * cb.query().set...;
     * cb.query().addOrderBy...;
     * ListResultBean&lt;MBox&gt; <span style="color: #553000">mBoxList</span> = <span style="color: #0000C0">mBoxBhv</span>.<span style="color: #CC4747">selectList</span>(cb);
     * <span style="color: #70226C">for</span> (MBox mBox : <span style="color: #553000">mBoxList</span>) {
     *     ... = mBox.get...;
     * }
     * </pre>
     * @param cb The condition-bean of MBox. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<MBox> selectList(MBoxCB cb) {
        return facadeSelectList(cb);
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * MBoxCB cb = <span style="color: #70226C">new</span> MBoxCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;MBox&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">mBoxBhv</span>.<span style="color: #CC4747">selectPage</span>(cb);
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (MBox mBox : <span style="color: #553000">page</span>) {
     *     ... = mBox.get...();
     * }
     * </pre>
     * @param cb The condition-bean of MBox. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<MBox> selectPage(MBoxCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * MBoxCB cb = <span style="color: #70226C">new</span> MBoxCB();
     * cb.query().set...
     * <span style="color: #0000C0">mBoxBhv</span>.<span style="color: #CC4747">selectCursor</span>(cb, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cb The condition-bean of MBox. (NotNull)
     * @param entityRowHandler The handler of entity row of MBox. (NotNull)
     */
    public void selectCursor(MBoxCB cb, EntityRowHandler<MBox> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">mBoxBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<MBoxCB, RESULT> selectScalar(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">mBoxBhv</span>.<span style="color: #CC4747">scalarSelect</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<MBoxCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param mBoxList The entity list of MBox. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<MBox> mBoxList, ReferrerLoaderHandler<LoaderOfMBox> loaderLambda) {
        xassLRArg(mBoxList, loaderLambda);
        loaderLambda.handle(new LoaderOfMBox().ready(mBoxList, _behaviorSelector));
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
     * @param mBox The entity of MBox. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(MBox mBox, ReferrerLoaderHandler<LoaderOfMBox> loaderLambda) {
        xassLRArg(mBox, loaderLambda);
        loaderLambda.handle(new LoaderOfMBox().ready(xnewLRAryLs(mBox), _behaviorSelector));
    }

    /**
     * Load referrer of MBoxGrpList by the set-upper of referrer. <br>
     * M_BOX_GRP by STANDARD_BOX_ID, named 'MBoxGrpList'.
     * <pre>
     * <span style="color: #0000C0">mBoxBhv</span>.<span style="color: #CC4747">loadMBoxGrpList</span>(<span style="color: #553000">mBoxList</span>, <span style="color: #553000">grpCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">grpCB</span>.setupSelect...
     *     <span style="color: #553000">grpCB</span>.query().set...
     *     <span style="color: #553000">grpCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MBox mBox : <span style="color: #553000">mBoxList</span>) {
     *     ... = mBox.<span style="color: #CC4747">getMBoxGrpList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setStandardBoxId_InScope(pkList);
     * cb.query().addOrderBy_StandardBoxId_Asc();
     * </pre>
     * @param mBoxList The entity list of MBox. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MBoxGrp> loadMBoxGrpList(List<MBox> mBoxList, ConditionBeanSetupper<MBoxGrpCB> refCBLambda) {
        xassLRArg(mBoxList, refCBLambda);
        return doLoadMBoxGrpList(mBoxList, new LoadReferrerOption<MBoxGrpCB, MBoxGrp>().xinit(refCBLambda));
    }

    /**
     * Load referrer of MBoxGrpList by the set-upper of referrer. <br>
     * M_BOX_GRP by STANDARD_BOX_ID, named 'MBoxGrpList'.
     * <pre>
     * <span style="color: #0000C0">mBoxBhv</span>.<span style="color: #CC4747">loadMBoxGrpList</span>(<span style="color: #553000">mBox</span>, <span style="color: #553000">grpCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">grpCB</span>.setupSelect...
     *     <span style="color: #553000">grpCB</span>.query().set...
     *     <span style="color: #553000">grpCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mBox</span>.<span style="color: #CC4747">getMBoxGrpList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setStandardBoxId_InScope(pkList);
     * cb.query().addOrderBy_StandardBoxId_Asc();
     * </pre>
     * @param mBox The entity of MBox. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MBoxGrp> loadMBoxGrpList(MBox mBox, ConditionBeanSetupper<MBoxGrpCB> refCBLambda) {
        xassLRArg(mBox, refCBLambda);
        return doLoadMBoxGrpList(xnewLRLs(mBox), new LoadReferrerOption<MBoxGrpCB, MBoxGrp>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mBox The entity of MBox. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MBoxGrp> loadMBoxGrpList(MBox mBox, LoadReferrerOption<MBoxGrpCB, MBoxGrp> loadReferrerOption) {
        xassLRArg(mBox, loadReferrerOption);
        return loadMBoxGrpList(xnewLRLs(mBox), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mBoxList The entity list of MBox. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<MBoxGrp> loadMBoxGrpList(List<MBox> mBoxList, LoadReferrerOption<MBoxGrpCB, MBoxGrp> loadReferrerOption) {
        xassLRArg(mBoxList, loadReferrerOption);
        if (mBoxList.isEmpty()) { return (NestedReferrerListGateway<MBoxGrp>)EMPTY_NREF_LGWAY; }
        return doLoadMBoxGrpList(mBoxList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<MBoxGrp> doLoadMBoxGrpList(List<MBox> mBoxList, LoadReferrerOption<MBoxGrpCB, MBoxGrp> option) {
        return helpLoadReferrerInternally(mBoxList, option, "mBoxGrpList");
    }

    /**
     * Load referrer of MBoxGrpDtlList by the set-upper of referrer. <br>
     * M_BOX_GRP_DTL by BOX_ID, named 'MBoxGrpDtlList'.
     * <pre>
     * <span style="color: #0000C0">mBoxBhv</span>.<span style="color: #CC4747">loadMBoxGrpDtlList</span>(<span style="color: #553000">mBoxList</span>, <span style="color: #553000">dtlCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">dtlCB</span>.setupSelect...
     *     <span style="color: #553000">dtlCB</span>.query().set...
     *     <span style="color: #553000">dtlCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MBox mBox : <span style="color: #553000">mBoxList</span>) {
     *     ... = mBox.<span style="color: #CC4747">getMBoxGrpDtlList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setBoxId_InScope(pkList);
     * cb.query().addOrderBy_BoxId_Asc();
     * </pre>
     * @param mBoxList The entity list of MBox. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MBoxGrpDtl> loadMBoxGrpDtlList(List<MBox> mBoxList, ConditionBeanSetupper<MBoxGrpDtlCB> refCBLambda) {
        xassLRArg(mBoxList, refCBLambda);
        return doLoadMBoxGrpDtlList(mBoxList, new LoadReferrerOption<MBoxGrpDtlCB, MBoxGrpDtl>().xinit(refCBLambda));
    }

    /**
     * Load referrer of MBoxGrpDtlList by the set-upper of referrer. <br>
     * M_BOX_GRP_DTL by BOX_ID, named 'MBoxGrpDtlList'.
     * <pre>
     * <span style="color: #0000C0">mBoxBhv</span>.<span style="color: #CC4747">loadMBoxGrpDtlList</span>(<span style="color: #553000">mBox</span>, <span style="color: #553000">dtlCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">dtlCB</span>.setupSelect...
     *     <span style="color: #553000">dtlCB</span>.query().set...
     *     <span style="color: #553000">dtlCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mBox</span>.<span style="color: #CC4747">getMBoxGrpDtlList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setBoxId_InScope(pkList);
     * cb.query().addOrderBy_BoxId_Asc();
     * </pre>
     * @param mBox The entity of MBox. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MBoxGrpDtl> loadMBoxGrpDtlList(MBox mBox, ConditionBeanSetupper<MBoxGrpDtlCB> refCBLambda) {
        xassLRArg(mBox, refCBLambda);
        return doLoadMBoxGrpDtlList(xnewLRLs(mBox), new LoadReferrerOption<MBoxGrpDtlCB, MBoxGrpDtl>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mBox The entity of MBox. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MBoxGrpDtl> loadMBoxGrpDtlList(MBox mBox, LoadReferrerOption<MBoxGrpDtlCB, MBoxGrpDtl> loadReferrerOption) {
        xassLRArg(mBox, loadReferrerOption);
        return loadMBoxGrpDtlList(xnewLRLs(mBox), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mBoxList The entity list of MBox. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<MBoxGrpDtl> loadMBoxGrpDtlList(List<MBox> mBoxList, LoadReferrerOption<MBoxGrpDtlCB, MBoxGrpDtl> loadReferrerOption) {
        xassLRArg(mBoxList, loadReferrerOption);
        if (mBoxList.isEmpty()) { return (NestedReferrerListGateway<MBoxGrpDtl>)EMPTY_NREF_LGWAY; }
        return doLoadMBoxGrpDtlList(mBoxList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<MBoxGrpDtl> doLoadMBoxGrpDtlList(List<MBox> mBoxList, LoadReferrerOption<MBoxGrpDtlCB, MBoxGrpDtl> option) {
        return helpLoadReferrerInternally(mBoxList, option, "mBoxGrpDtlList");
    }

    /**
     * Load referrer of MCarrierBoxList by the set-upper of referrer. <br>
     * M_CARRIER_BOX by BOX_ID, named 'MCarrierBoxList'.
     * <pre>
     * <span style="color: #0000C0">mBoxBhv</span>.<span style="color: #CC4747">loadMCarrierBoxList</span>(<span style="color: #553000">mBoxList</span>, <span style="color: #553000">boxCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">boxCB</span>.setupSelect...
     *     <span style="color: #553000">boxCB</span>.query().set...
     *     <span style="color: #553000">boxCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MBox mBox : <span style="color: #553000">mBoxList</span>) {
     *     ... = mBox.<span style="color: #CC4747">getMCarrierBoxList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setBoxId_InScope(pkList);
     * cb.query().addOrderBy_BoxId_Asc();
     * </pre>
     * @param mBoxList The entity list of MBox. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MCarrierBox> loadMCarrierBoxList(List<MBox> mBoxList, ConditionBeanSetupper<MCarrierBoxCB> refCBLambda) {
        xassLRArg(mBoxList, refCBLambda);
        return doLoadMCarrierBoxList(mBoxList, new LoadReferrerOption<MCarrierBoxCB, MCarrierBox>().xinit(refCBLambda));
    }

    /**
     * Load referrer of MCarrierBoxList by the set-upper of referrer. <br>
     * M_CARRIER_BOX by BOX_ID, named 'MCarrierBoxList'.
     * <pre>
     * <span style="color: #0000C0">mBoxBhv</span>.<span style="color: #CC4747">loadMCarrierBoxList</span>(<span style="color: #553000">mBox</span>, <span style="color: #553000">boxCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">boxCB</span>.setupSelect...
     *     <span style="color: #553000">boxCB</span>.query().set...
     *     <span style="color: #553000">boxCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mBox</span>.<span style="color: #CC4747">getMCarrierBoxList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setBoxId_InScope(pkList);
     * cb.query().addOrderBy_BoxId_Asc();
     * </pre>
     * @param mBox The entity of MBox. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MCarrierBox> loadMCarrierBoxList(MBox mBox, ConditionBeanSetupper<MCarrierBoxCB> refCBLambda) {
        xassLRArg(mBox, refCBLambda);
        return doLoadMCarrierBoxList(xnewLRLs(mBox), new LoadReferrerOption<MCarrierBoxCB, MCarrierBox>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mBox The entity of MBox. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MCarrierBox> loadMCarrierBoxList(MBox mBox, LoadReferrerOption<MCarrierBoxCB, MCarrierBox> loadReferrerOption) {
        xassLRArg(mBox, loadReferrerOption);
        return loadMCarrierBoxList(xnewLRLs(mBox), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mBoxList The entity list of MBox. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<MCarrierBox> loadMCarrierBoxList(List<MBox> mBoxList, LoadReferrerOption<MCarrierBoxCB, MCarrierBox> loadReferrerOption) {
        xassLRArg(mBoxList, loadReferrerOption);
        if (mBoxList.isEmpty()) { return (NestedReferrerListGateway<MCarrierBox>)EMPTY_NREF_LGWAY; }
        return doLoadMCarrierBoxList(mBoxList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<MCarrierBox> doLoadMCarrierBoxList(List<MBox> mBoxList, LoadReferrerOption<MCarrierBoxCB, MCarrierBox> option) {
        return helpLoadReferrerInternally(mBoxList, option, "mCarrierBoxList");
    }

    /**
     * Load referrer of MParamList by the set-upper of referrer. <br>
     * M_PARAM by DEFAULT_BOX_ID, named 'MParamList'.
     * <pre>
     * <span style="color: #0000C0">mBoxBhv</span>.<span style="color: #CC4747">loadMParamList</span>(<span style="color: #553000">mBoxList</span>, <span style="color: #553000">paramCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">paramCB</span>.setupSelect...
     *     <span style="color: #553000">paramCB</span>.query().set...
     *     <span style="color: #553000">paramCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MBox mBox : <span style="color: #553000">mBoxList</span>) {
     *     ... = mBox.<span style="color: #CC4747">getMParamList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setDefaultBoxId_InScope(pkList);
     * cb.query().addOrderBy_DefaultBoxId_Asc();
     * </pre>
     * @param mBoxList The entity list of MBox. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MParam> loadMParamList(List<MBox> mBoxList, ConditionBeanSetupper<MParamCB> refCBLambda) {
        xassLRArg(mBoxList, refCBLambda);
        return doLoadMParamList(mBoxList, new LoadReferrerOption<MParamCB, MParam>().xinit(refCBLambda));
    }

    /**
     * Load referrer of MParamList by the set-upper of referrer. <br>
     * M_PARAM by DEFAULT_BOX_ID, named 'MParamList'.
     * <pre>
     * <span style="color: #0000C0">mBoxBhv</span>.<span style="color: #CC4747">loadMParamList</span>(<span style="color: #553000">mBox</span>, <span style="color: #553000">paramCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">paramCB</span>.setupSelect...
     *     <span style="color: #553000">paramCB</span>.query().set...
     *     <span style="color: #553000">paramCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mBox</span>.<span style="color: #CC4747">getMParamList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setDefaultBoxId_InScope(pkList);
     * cb.query().addOrderBy_DefaultBoxId_Asc();
     * </pre>
     * @param mBox The entity of MBox. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MParam> loadMParamList(MBox mBox, ConditionBeanSetupper<MParamCB> refCBLambda) {
        xassLRArg(mBox, refCBLambda);
        return doLoadMParamList(xnewLRLs(mBox), new LoadReferrerOption<MParamCB, MParam>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mBox The entity of MBox. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MParam> loadMParamList(MBox mBox, LoadReferrerOption<MParamCB, MParam> loadReferrerOption) {
        xassLRArg(mBox, loadReferrerOption);
        return loadMParamList(xnewLRLs(mBox), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mBoxList The entity list of MBox. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<MParam> loadMParamList(List<MBox> mBoxList, LoadReferrerOption<MParamCB, MParam> loadReferrerOption) {
        xassLRArg(mBoxList, loadReferrerOption);
        if (mBoxList.isEmpty()) { return (NestedReferrerListGateway<MParam>)EMPTY_NREF_LGWAY; }
        return doLoadMParamList(mBoxList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<MParam> doLoadMParamList(List<MBox> mBoxList, LoadReferrerOption<MParamCB, MParam> option) {
        return helpLoadReferrerInternally(mBoxList, option, "mParamList");
    }

    /**
     * Load referrer of TPackingHList by the set-upper of referrer. <br>
     * T_PACKING_H by BOX_ID, named 'TPackingHList'.
     * <pre>
     * <span style="color: #0000C0">mBoxBhv</span>.<span style="color: #CC4747">loadTPackingHList</span>(<span style="color: #553000">mBoxList</span>, <span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hCB</span>.setupSelect...
     *     <span style="color: #553000">hCB</span>.query().set...
     *     <span style="color: #553000">hCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MBox mBox : <span style="color: #553000">mBoxList</span>) {
     *     ... = mBox.<span style="color: #CC4747">getTPackingHList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setBoxId_InScope(pkList);
     * cb.query().addOrderBy_BoxId_Asc();
     * </pre>
     * @param mBoxList The entity list of MBox. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TPackingH> loadTPackingHList(List<MBox> mBoxList, ConditionBeanSetupper<TPackingHCB> refCBLambda) {
        xassLRArg(mBoxList, refCBLambda);
        return doLoadTPackingHList(mBoxList, new LoadReferrerOption<TPackingHCB, TPackingH>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TPackingHList by the set-upper of referrer. <br>
     * T_PACKING_H by BOX_ID, named 'TPackingHList'.
     * <pre>
     * <span style="color: #0000C0">mBoxBhv</span>.<span style="color: #CC4747">loadTPackingHList</span>(<span style="color: #553000">mBox</span>, <span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hCB</span>.setupSelect...
     *     <span style="color: #553000">hCB</span>.query().set...
     *     <span style="color: #553000">hCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mBox</span>.<span style="color: #CC4747">getTPackingHList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setBoxId_InScope(pkList);
     * cb.query().addOrderBy_BoxId_Asc();
     * </pre>
     * @param mBox The entity of MBox. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TPackingH> loadTPackingHList(MBox mBox, ConditionBeanSetupper<TPackingHCB> refCBLambda) {
        xassLRArg(mBox, refCBLambda);
        return doLoadTPackingHList(xnewLRLs(mBox), new LoadReferrerOption<TPackingHCB, TPackingH>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mBox The entity of MBox. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TPackingH> loadTPackingHList(MBox mBox, LoadReferrerOption<TPackingHCB, TPackingH> loadReferrerOption) {
        xassLRArg(mBox, loadReferrerOption);
        return loadTPackingHList(xnewLRLs(mBox), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mBoxList The entity list of MBox. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TPackingH> loadTPackingHList(List<MBox> mBoxList, LoadReferrerOption<TPackingHCB, TPackingH> loadReferrerOption) {
        xassLRArg(mBoxList, loadReferrerOption);
        if (mBoxList.isEmpty()) { return (NestedReferrerListGateway<TPackingH>)EMPTY_NREF_LGWAY; }
        return doLoadTPackingHList(mBoxList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TPackingH> doLoadTPackingHList(List<MBox> mBoxList, LoadReferrerOption<TPackingHCB, TPackingH> option) {
        return helpLoadReferrerInternally(mBoxList, option, "tPackingHList");
    }

    /**
     * Load referrer of WHtShippingList by the set-upper of referrer. <br>
     * W_HT_SHIPPING by BOX_ID, named 'WHtShippingList'.
     * <pre>
     * <span style="color: #0000C0">mBoxBhv</span>.<span style="color: #CC4747">loadWHtShippingList</span>(<span style="color: #553000">mBoxList</span>, <span style="color: #553000">shippingCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">shippingCB</span>.setupSelect...
     *     <span style="color: #553000">shippingCB</span>.query().set...
     *     <span style="color: #553000">shippingCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MBox mBox : <span style="color: #553000">mBoxList</span>) {
     *     ... = mBox.<span style="color: #CC4747">getWHtShippingList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setBoxId_InScope(pkList);
     * cb.query().addOrderBy_BoxId_Asc();
     * </pre>
     * @param mBoxList The entity list of MBox. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtShipping> loadWHtShippingList(List<MBox> mBoxList, ConditionBeanSetupper<WHtShippingCB> refCBLambda) {
        xassLRArg(mBoxList, refCBLambda);
        return doLoadWHtShippingList(mBoxList, new LoadReferrerOption<WHtShippingCB, WHtShipping>().xinit(refCBLambda));
    }

    /**
     * Load referrer of WHtShippingList by the set-upper of referrer. <br>
     * W_HT_SHIPPING by BOX_ID, named 'WHtShippingList'.
     * <pre>
     * <span style="color: #0000C0">mBoxBhv</span>.<span style="color: #CC4747">loadWHtShippingList</span>(<span style="color: #553000">mBox</span>, <span style="color: #553000">shippingCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">shippingCB</span>.setupSelect...
     *     <span style="color: #553000">shippingCB</span>.query().set...
     *     <span style="color: #553000">shippingCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mBox</span>.<span style="color: #CC4747">getWHtShippingList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setBoxId_InScope(pkList);
     * cb.query().addOrderBy_BoxId_Asc();
     * </pre>
     * @param mBox The entity of MBox. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtShipping> loadWHtShippingList(MBox mBox, ConditionBeanSetupper<WHtShippingCB> refCBLambda) {
        xassLRArg(mBox, refCBLambda);
        return doLoadWHtShippingList(xnewLRLs(mBox), new LoadReferrerOption<WHtShippingCB, WHtShipping>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mBox The entity of MBox. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtShipping> loadWHtShippingList(MBox mBox, LoadReferrerOption<WHtShippingCB, WHtShipping> loadReferrerOption) {
        xassLRArg(mBox, loadReferrerOption);
        return loadWHtShippingList(xnewLRLs(mBox), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mBoxList The entity list of MBox. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<WHtShipping> loadWHtShippingList(List<MBox> mBoxList, LoadReferrerOption<WHtShippingCB, WHtShipping> loadReferrerOption) {
        xassLRArg(mBoxList, loadReferrerOption);
        if (mBoxList.isEmpty()) { return (NestedReferrerListGateway<WHtShipping>)EMPTY_NREF_LGWAY; }
        return doLoadWHtShippingList(mBoxList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<WHtShipping> doLoadWHtShippingList(List<MBox> mBoxList, LoadReferrerOption<WHtShippingCB, WHtShipping> option) {
        return helpLoadReferrerInternally(mBoxList, option, "wHtShippingList");
    }

    /**
     * Load referrer of WSglRowShipInspHList by the set-upper of referrer. <br>
     * W_SGL_ROW_SHIP_INSP_H by BOX_ID, named 'WSglRowShipInspHList'.
     * <pre>
     * <span style="color: #0000C0">mBoxBhv</span>.<span style="color: #CC4747">loadWSglRowShipInspHList</span>(<span style="color: #553000">mBoxList</span>, <span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hCB</span>.setupSelect...
     *     <span style="color: #553000">hCB</span>.query().set...
     *     <span style="color: #553000">hCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MBox mBox : <span style="color: #553000">mBoxList</span>) {
     *     ... = mBox.<span style="color: #CC4747">getWSglRowShipInspHList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setBoxId_InScope(pkList);
     * cb.query().addOrderBy_BoxId_Asc();
     * </pre>
     * @param mBoxList The entity list of MBox. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WSglRowShipInspH> loadWSglRowShipInspHList(List<MBox> mBoxList, ConditionBeanSetupper<WSglRowShipInspHCB> refCBLambda) {
        xassLRArg(mBoxList, refCBLambda);
        return doLoadWSglRowShipInspHList(mBoxList, new LoadReferrerOption<WSglRowShipInspHCB, WSglRowShipInspH>().xinit(refCBLambda));
    }

    /**
     * Load referrer of WSglRowShipInspHList by the set-upper of referrer. <br>
     * W_SGL_ROW_SHIP_INSP_H by BOX_ID, named 'WSglRowShipInspHList'.
     * <pre>
     * <span style="color: #0000C0">mBoxBhv</span>.<span style="color: #CC4747">loadWSglRowShipInspHList</span>(<span style="color: #553000">mBox</span>, <span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hCB</span>.setupSelect...
     *     <span style="color: #553000">hCB</span>.query().set...
     *     <span style="color: #553000">hCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mBox</span>.<span style="color: #CC4747">getWSglRowShipInspHList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setBoxId_InScope(pkList);
     * cb.query().addOrderBy_BoxId_Asc();
     * </pre>
     * @param mBox The entity of MBox. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WSglRowShipInspH> loadWSglRowShipInspHList(MBox mBox, ConditionBeanSetupper<WSglRowShipInspHCB> refCBLambda) {
        xassLRArg(mBox, refCBLambda);
        return doLoadWSglRowShipInspHList(xnewLRLs(mBox), new LoadReferrerOption<WSglRowShipInspHCB, WSglRowShipInspH>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mBox The entity of MBox. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WSglRowShipInspH> loadWSglRowShipInspHList(MBox mBox, LoadReferrerOption<WSglRowShipInspHCB, WSglRowShipInspH> loadReferrerOption) {
        xassLRArg(mBox, loadReferrerOption);
        return loadWSglRowShipInspHList(xnewLRLs(mBox), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mBoxList The entity list of MBox. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<WSglRowShipInspH> loadWSglRowShipInspHList(List<MBox> mBoxList, LoadReferrerOption<WSglRowShipInspHCB, WSglRowShipInspH> loadReferrerOption) {
        xassLRArg(mBoxList, loadReferrerOption);
        if (mBoxList.isEmpty()) { return (NestedReferrerListGateway<WSglRowShipInspH>)EMPTY_NREF_LGWAY; }
        return doLoadWSglRowShipInspHList(mBoxList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<WSglRowShipInspH> doLoadWSglRowShipInspHList(List<MBox> mBoxList, LoadReferrerOption<WSglRowShipInspHCB, WSglRowShipInspH> option) {
        return helpLoadReferrerInternally(mBoxList, option, "wSglRowShipInspHList");
    }

    /**
     * Load referrer of WShippingInterruptList by the set-upper of referrer. <br>
     * W_SHIPPING_INTERRUPT by BOX_ID, named 'WShippingInterruptList'.
     * <pre>
     * <span style="color: #0000C0">mBoxBhv</span>.<span style="color: #CC4747">loadWShippingInterruptList</span>(<span style="color: #553000">mBoxList</span>, <span style="color: #553000">interruptCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">interruptCB</span>.setupSelect...
     *     <span style="color: #553000">interruptCB</span>.query().set...
     *     <span style="color: #553000">interruptCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MBox mBox : <span style="color: #553000">mBoxList</span>) {
     *     ... = mBox.<span style="color: #CC4747">getWShippingInterruptList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setBoxId_InScope(pkList);
     * cb.query().addOrderBy_BoxId_Asc();
     * </pre>
     * @param mBoxList The entity list of MBox. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WShippingInterrupt> loadWShippingInterruptList(List<MBox> mBoxList, ConditionBeanSetupper<WShippingInterruptCB> refCBLambda) {
        xassLRArg(mBoxList, refCBLambda);
        return doLoadWShippingInterruptList(mBoxList, new LoadReferrerOption<WShippingInterruptCB, WShippingInterrupt>().xinit(refCBLambda));
    }

    /**
     * Load referrer of WShippingInterruptList by the set-upper of referrer. <br>
     * W_SHIPPING_INTERRUPT by BOX_ID, named 'WShippingInterruptList'.
     * <pre>
     * <span style="color: #0000C0">mBoxBhv</span>.<span style="color: #CC4747">loadWShippingInterruptList</span>(<span style="color: #553000">mBox</span>, <span style="color: #553000">interruptCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">interruptCB</span>.setupSelect...
     *     <span style="color: #553000">interruptCB</span>.query().set...
     *     <span style="color: #553000">interruptCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mBox</span>.<span style="color: #CC4747">getWShippingInterruptList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setBoxId_InScope(pkList);
     * cb.query().addOrderBy_BoxId_Asc();
     * </pre>
     * @param mBox The entity of MBox. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WShippingInterrupt> loadWShippingInterruptList(MBox mBox, ConditionBeanSetupper<WShippingInterruptCB> refCBLambda) {
        xassLRArg(mBox, refCBLambda);
        return doLoadWShippingInterruptList(xnewLRLs(mBox), new LoadReferrerOption<WShippingInterruptCB, WShippingInterrupt>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mBox The entity of MBox. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WShippingInterrupt> loadWShippingInterruptList(MBox mBox, LoadReferrerOption<WShippingInterruptCB, WShippingInterrupt> loadReferrerOption) {
        xassLRArg(mBox, loadReferrerOption);
        return loadWShippingInterruptList(xnewLRLs(mBox), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mBoxList The entity list of MBox. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<WShippingInterrupt> loadWShippingInterruptList(List<MBox> mBoxList, LoadReferrerOption<WShippingInterruptCB, WShippingInterrupt> loadReferrerOption) {
        xassLRArg(mBoxList, loadReferrerOption);
        if (mBoxList.isEmpty()) { return (NestedReferrerListGateway<WShippingInterrupt>)EMPTY_NREF_LGWAY; }
        return doLoadWShippingInterruptList(mBoxList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<WShippingInterrupt> doLoadWShippingInterruptList(List<MBox> mBoxList, LoadReferrerOption<WShippingInterruptCB, WShippingInterrupt> option) {
        return helpLoadReferrerInternally(mBoxList, option, "wShippingInterruptList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'MCenter'.
     * @param mBoxList The list of mBox. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MCenter> pulloutMCenter(List<MBox> mBoxList)
    { return helpPulloutInternally(mBoxList, "mCenter"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param mBoxList The list of mBox. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByDelFlg(List<MBox> mBoxList)
    { return helpPulloutInternally(mBoxList, "bClassDtlByDelFlg"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key boxId.
     * @param mBoxList The list of mBox. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractBoxIdList(List<MBox> mBoxList)
    { return helpExtractListInternally(mBoxList, "boxId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * MBox mBox = <span style="color: #70226C">new</span> MBox();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * mBox.setFoo...(value);
     * mBox.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mBox.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mBox.set...;</span>
     * <span style="color: #0000C0">mBoxBhv</span>.<span style="color: #CC4747">insert</span>(mBox);
     * ... = mBox.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param mBox The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(MBox mBox) {
        doInsert(mBox, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * MBox mBox = <span style="color: #70226C">new</span> MBox();
     * mBox.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mBox.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mBox.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mBox.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * mBox.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">mBoxBhv</span>.<span style="color: #CC4747">update</span>(mBox);
     * </pre>
     * @param mBox The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(MBox mBox) {
        doUpdate(mBox, null);
    }

    /**
     * Update the entity non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * MBox mBox = <span style="color: #70226C">new</span> MBox();
     * mBox.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mBox.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mBox.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mBox.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mBox.setVersionNo(value);</span>
     * <span style="color: #0000C0">mBoxBhv</span>.<span style="color: #CC4747">updateNonstrict</span>(mBox);
     * </pre>
     * @param mBox The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(MBox mBox) {
        doUpdateNonstrict(mBox, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param mBox The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(MBox mBox) {
        doInsertOrUpdate(mBox, null, null);
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param mBox The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(MBox mBox) {
        doInsertOrUpdateNonstrict(mBox, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * MBox mBox = <span style="color: #70226C">new</span> MBox();
     * mBox.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * mBox.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">mBoxBhv</span>.<span style="color: #CC4747">delete</span>(mBox);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param mBox The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(MBox mBox) {
        doDelete(mBox, null);
    }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl} <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * MBox mBox = <span style="color: #70226C">new</span> MBox();
     * mBox.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mBox.setVersionNo(value);</span>
     * <span style="color: #0000C0">mBoxBhv</span>.<span style="color: #CC4747">deleteNonstrict</span>(mBox);
     * </pre>
     * @param mBox The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(MBox mBox) {
        doDeleteNonstrict(mBox, null);
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * MBox mBox = <span style="color: #70226C">new</span> MBox();
     * mBox.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mBox.setVersionNo(value);</span>
     * <span style="color: #0000C0">mBoxBhv</span>.<span style="color: #CC4747">deleteNonstrictIgnoreDeleted</span>(mBox);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param mBox The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(MBox mBox) {
        doDeleteNonstrictIgnoreDeleted(mBox, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(MBox et, final DeleteOption<MBoxCB> op) {
        assertObjectNotNull("mBox", et); prepareDeleteOption(op); helpDeleteNonstrictIgnoreDeletedInternally(et, op);
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
     *     MBox mBox = <span style="color: #70226C">new</span> MBox();
     *     mBox.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         mBox.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     mBoxList.add(mBox);
     * }
     * <span style="color: #0000C0">mBoxBhv</span>.<span style="color: #CC4747">batchInsert</span>(mBoxList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param mBoxList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<MBox> mBoxList) {
        return doBatchInsert(mBoxList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     MBox mBox = <span style="color: #70226C">new</span> MBox();
     *     mBox.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         mBox.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         mBox.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//mBox.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     mBoxList.add(mBox);
     * }
     * <span style="color: #0000C0">mBoxBhv</span>.<span style="color: #CC4747">batchUpdate</span>(mBoxList);
     * </pre>
     * @param mBoxList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<MBox> mBoxList) {
        return doBatchUpdate(mBoxList, null);
    }

    /**
     * Batch-update the entity list specified-only. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * mBoxBhv.<span style="color: #CC4747">batchUpdate</span>(mBoxList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">mBoxBhv</span>.<span style="color: #CC4747">batchUpdate</span>(mBoxList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param mBoxList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<MBox> mBoxList, SpecifyQuery<MBoxCB> colCBLambda) {
        return doBatchUpdate(mBoxList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * <span style="color: #70226C">for</span> (... : ...) {
     *     MBox mBox = <span style="color: #70226C">new</span> MBox();
     *     mBox.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         mBox.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         mBox.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//mBox.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     mBoxList.add(mBox);
     * }
     * <span style="color: #0000C0">mBoxBhv</span>.<span style="color: #CC4747">batchUpdate</span>(mBoxList);
     * </pre>
     * @param mBoxList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<MBox> mBoxList) {
        return doBatchUpdateNonstrict(mBoxList, null);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * <span style="color: #0000C0">mBoxBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(mBoxList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">mBoxBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(mBoxList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).</p>
     * @param mBoxList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<MBox> mBoxList, SpecifyQuery<MBoxCB> colCBLambda) {
        return doBatchUpdateNonstrict(mBoxList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param mBoxList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<MBox> mBoxList) {
        return doBatchDelete(mBoxList, null);
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param mBoxList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<MBox> mBoxList) {
        return doBatchDeleteNonstrict(mBoxList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">mBoxBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;MBox, MBoxCB&gt;() {
     *     public ConditionBean setup(MBox entity, MBoxCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<MBox, MBoxCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * MBox mBox = <span style="color: #70226C">new</span> MBox();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//mBox.setPK...(value);</span>
     * mBox.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mBox.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mBox.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mBox.setVersionNo(value);</span>
     * MBoxCB cb = <span style="color: #70226C">new</span> MBoxCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">mBoxBhv</span>.<span style="color: #CC4747">queryUpdate</span>(mBox, cb);
     * </pre>
     * @param mBox The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of MBox. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(MBox mBox, MBoxCB cb) {
        return doQueryUpdate(mBox, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * MBoxCB cb = new MBoxCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">mBoxBhv</span>.<span style="color: #CC4747">queryDelete</span>(mBox, cb);
     * </pre>
     * @param cb The condition-bean of MBox. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(MBoxCB cb) {
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
     * MBox mBox = <span style="color: #70226C">new</span> MBox();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * mBox.setFoo...(value);
     * mBox.setBar...(value);
     * <span style="color: #0000C0">mBoxBhv</span>.<span style="color: #CC4747">varyingInsert</span>(mBox, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = mBox.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param mBox The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(MBox mBox, WritableOptionCall<MBoxCB, InsertOption<MBoxCB>> opLambda) {
        doInsert(mBox, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * MBox mBox = <span style="color: #70226C">new</span> MBox();
     * mBox.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mBox.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * mBox.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">mBoxBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(mBox, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param mBox The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(MBox mBox, WritableOptionCall<MBoxCB, UpdateOption<MBoxCB>> opLambda) {
        doUpdate(mBox, createUpdateOption(opLambda));
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * MBox mBox = <span style="color: #70226C">new</span> MBox();
     * mBox.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mBox.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mBox.setVersionNo(value);</span>
     * <span style="color: #0000C0">mBoxBhv</span>.<span style="color: #CC4747">varyingUpdateNonstrict</span>(mBox, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param mBox The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(MBox mBox, WritableOptionCall<MBoxCB, UpdateOption<MBoxCB>> opLambda) {
        doUpdateNonstrict(mBox, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param mBox The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(MBox mBox, WritableOptionCall<MBoxCB, InsertOption<MBoxCB>> insertOpLambda, WritableOptionCall<MBoxCB, UpdateOption<MBoxCB>> updateOpLambda) {
        doInsertOrUpdate(mBox, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param mBox The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(MBox mBox, WritableOptionCall<MBoxCB, InsertOption<MBoxCB>> insertOpLambda, WritableOptionCall<MBoxCB, UpdateOption<MBoxCB>> updateOpLambda) {
        doInsertOrUpdateNonstrict(mBox, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param mBox The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(MBox mBox, WritableOptionCall<MBoxCB, DeleteOption<MBoxCB>> opLambda) {
        doDelete(mBox, createDeleteOption(opLambda));
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as deleteNonstrict(entity).
     * @param mBox The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(MBox mBox, WritableOptionCall<MBoxCB, DeleteOption<MBoxCB>> opLambda) {
        doDeleteNonstrict(mBox, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param mBoxList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<MBox> mBoxList, WritableOptionCall<MBoxCB, InsertOption<MBoxCB>> opLambda) {
        return doBatchInsert(mBoxList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param mBoxList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<MBox> mBoxList, WritableOptionCall<MBoxCB, UpdateOption<MBoxCB>> opLambda) {
        return doBatchUpdate(mBoxList, createUpdateOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param mBoxList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<MBox> mBoxList, WritableOptionCall<MBoxCB, UpdateOption<MBoxCB>> opLambda) {
        return doBatchUpdateNonstrict(mBoxList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param mBoxList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<MBox> mBoxList, WritableOptionCall<MBoxCB, DeleteOption<MBoxCB>> opLambda) {
        return doBatchDelete(mBoxList, createDeleteOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param mBoxList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<MBox> mBoxList, WritableOptionCall<MBoxCB, DeleteOption<MBoxCB>> opLambda) {
        return doBatchDeleteNonstrict(mBoxList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<MBox, MBoxCB> manyArgLambda, WritableOptionCall<MBoxCB, InsertOption<MBoxCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * MBox mBox = <span style="color: #70226C">new</span> MBox();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//mBox.setPK...(value);</span>
     * mBox.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mBox.setVersionNo(value);</span>
     * MBoxCB cb = <span style="color: #70226C">new</span> MBoxCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">mBoxBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(mBox, cb, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param mBox The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of MBox. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(MBox mBox, MBoxCB cb, WritableOptionCall<MBoxCB, UpdateOption<MBoxCB>> opLambda) {
        return doQueryUpdate(mBox, cb, createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * @param cb The condition-bean of MBox. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(MBoxCB cb, WritableOptionCall<MBoxCB, DeleteOption<MBoxCB>> opLambda) {
        return doQueryDelete(cb, createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span>
     * mBoxBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span>
     * mBoxBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * mBoxBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * mBoxBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * mBoxBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * mBoxBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * mBoxBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span>
     * mBoxBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * mBoxBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * mBoxBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * mBoxBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * mBoxBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * mBoxBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span>
     * mBoxBhv.outideSql().removeBlockComment().selectList()
     * mBoxBhv.outideSql().removeLineComment().selectList()
     * mBoxBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlBasicExecutor<MBoxBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<MBoxBhv> facadeExecutor = doOutsideSql();
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
    protected Class<? extends MBox> typeOfSelectedEntity() { return MBox.class; }
    protected Class<MBox> typeOfHandlingEntity() { return MBox.class; }
    protected Class<MBoxCB> typeOfHandlingConditionBean() { return MBoxCB.class; }
}
