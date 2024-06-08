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
 * The behavior of M_IMPORT_TYPE as TABLE. <br>
 * <pre>
 * [primary key]
 *     IMPORT_TYPE_ID
 *
 * [column]
 *     IMPORT_TYPE_ID, CLIENT_ID, IMPORT_TYPE_CD, IMPORT_TYPE_NM, EDI_ID, CHARACTER_CD, LINE_FEED_CD, DELIMITER, SKIPPING_ROWS, UPLOAD_TABLE_NM, DUPLICATE_COLUMN_NM, RCV_ID_COLUMN_NM, ROW_NO_COLUMN_NM, GIFT_STATEMENT_TYPE, GIFT_STATEMENT_DETAIL, O_KEEPING_DAYS, STATEMENT_TITLE, STATEMENT_URL, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     IMPORT_TYPE_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     M_CLIENT, M_EDI, B_CLASS_DTL(ByGiftStatementType)
 *
 * [referrer table]
 *     M_IMPORT_TYPE_B, T_EC_ORDER_H
 *
 * [foreign property]
 *     mClient, mEdi, bClassDtlByGiftStatementType, bClassDtlByLineFeedCd, bClassDtlByUploadTableNm
 *
 * [referrer property]
 *     mImportTypeBList, tEcOrderHList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsMImportTypeBhv extends AbstractBehaviorWritable<MImportType, MImportTypeCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public MImportTypeDbm asDBMeta() { return MImportTypeDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "M_IMPORT_TYPE"; }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public MImportTypeDbm getMyDBMeta() { return MImportTypeDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public MImportTypeCB newConditionBean() { return new MImportTypeCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public MImportType newMyEntity() { return new MImportType(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public MImportTypeCB newMyConditionBean() { return new MImportTypeCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * MImportTypeCB cb = <span style="color: #70226C">new</span> MImportTypeCB();
     * cb.query().setFoo...(value);
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">mImportTypeBhv</span>.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of MImportType. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(MImportTypeCB cb) {
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
     * MImportTypeCB cb = <span style="color: #70226C">new</span> MImportTypeCB();
     * cb.query().setFoo...(value);
     * MImportType mImportType = <span style="color: #0000C0">mImportTypeBhv</span>.<span style="color: #DD4747">selectEntity</span>(cb);
     * <span style="color: #70226C">if</span> (mImportType != <span style="color: #70226C">null</span>) { <span style="color: #3F7E5E">// null check</span>
     *     ... = mImportType.get...();
     * } <span style="color: #70226C">else</span> {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of MImportType. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MImportType selectEntity(MImportTypeCB cb) {
        return facadeSelectEntity(cb);
    }

    protected MImportType facadeSelectEntity(MImportTypeCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends MImportType> OptionalEntity<ENTITY> doSelectOptionalEntity(MImportTypeCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * MImportTypeCB cb = <span style="color: #70226C">new</span> MImportTypeCB();
     * cb.query().set...;
     * MImportType mImportType = <span style="color: #0000C0">mImportTypeBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = mImportType.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of MImportType. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MImportType selectEntityWithDeletedCheck(MImportTypeCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param importTypeId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MImportType selectByPKValue(Long importTypeId) {
        return facadeSelectByPKValue(importTypeId);
    }

    protected MImportType facadeSelectByPKValue(Long importTypeId) {
        return doSelectByPK(importTypeId, typeOfSelectedEntity());
    }

    protected <ENTITY extends MImportType> ENTITY doSelectByPK(Long importTypeId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(importTypeId), tp);
    }

    protected <ENTITY extends MImportType> OptionalEntity<ENTITY> doSelectOptionalByPK(Long importTypeId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(importTypeId, tp), importTypeId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param importTypeId : PK, ID, NotNull, bigint identity(19). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MImportType selectByPKValueWithDeletedCheck(Long importTypeId) {
        return doSelectByPKWithDeletedCheck(importTypeId, typeOfSelectedEntity());
    }

    protected <ENTITY extends MImportType> ENTITY doSelectByPKWithDeletedCheck(Long importTypeId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(importTypeId), tp);
    }

    protected MImportTypeCB xprepareCBAsPK(Long importTypeId) {
        assertObjectNotNull("importTypeId", importTypeId);
        return newConditionBean().acceptPK(importTypeId);
    }

    /**
     * Select the entity by the unique-key value.
     * @param clientId : UQ+, NotNull, bigint(19), FK to M_CLIENT. (NotNull)
     * @param importTypeCd : +UQ, IX, NotNull, varchar(30). (NotNull)
     * @return The optional entity selected by the unique key. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<MImportType> selectByUniqueOf(Long clientId, String importTypeCd) {
        return facadeSelectByUniqueOf(clientId, importTypeCd);
    }

    protected OptionalEntity<MImportType> facadeSelectByUniqueOf(Long clientId, String importTypeCd) {
        return doSelectByUniqueOf(clientId, importTypeCd, typeOfSelectedEntity());
    }

    protected <ENTITY extends MImportType> OptionalEntity<ENTITY> doSelectByUniqueOf(Long clientId, String importTypeCd, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(xprepareCBAsUniqueOf(clientId, importTypeCd), tp), clientId, importTypeCd);
    }

    protected MImportTypeCB xprepareCBAsUniqueOf(Long clientId, String importTypeCd) {
        assertObjectNotNull("clientId", clientId);assertObjectNotNull("importTypeCd", importTypeCd);
        return newConditionBean().acceptUniqueOf(clientId, importTypeCd);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * MImportTypeCB cb = <span style="color: #70226C">new</span> MImportTypeCB();
     * cb.query().set...;
     * cb.query().addOrderBy...;
     * ListResultBean&lt;MImportType&gt; <span style="color: #553000">mImportTypeList</span> = <span style="color: #0000C0">mImportTypeBhv</span>.<span style="color: #CC4747">selectList</span>(cb);
     * <span style="color: #70226C">for</span> (MImportType mImportType : <span style="color: #553000">mImportTypeList</span>) {
     *     ... = mImportType.get...;
     * }
     * </pre>
     * @param cb The condition-bean of MImportType. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<MImportType> selectList(MImportTypeCB cb) {
        return facadeSelectList(cb);
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * MImportTypeCB cb = <span style="color: #70226C">new</span> MImportTypeCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;MImportType&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">mImportTypeBhv</span>.<span style="color: #CC4747">selectPage</span>(cb);
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (MImportType mImportType : <span style="color: #553000">page</span>) {
     *     ... = mImportType.get...();
     * }
     * </pre>
     * @param cb The condition-bean of MImportType. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<MImportType> selectPage(MImportTypeCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * MImportTypeCB cb = <span style="color: #70226C">new</span> MImportTypeCB();
     * cb.query().set...
     * <span style="color: #0000C0">mImportTypeBhv</span>.<span style="color: #CC4747">selectCursor</span>(cb, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cb The condition-bean of MImportType. (NotNull)
     * @param entityRowHandler The handler of entity row of MImportType. (NotNull)
     */
    public void selectCursor(MImportTypeCB cb, EntityRowHandler<MImportType> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">mImportTypeBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<MImportTypeCB, RESULT> selectScalar(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">mImportTypeBhv</span>.<span style="color: #CC4747">scalarSelect</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<MImportTypeCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param mImportTypeList The entity list of MImportType. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<MImportType> mImportTypeList, ReferrerLoaderHandler<LoaderOfMImportType> loaderLambda) {
        xassLRArg(mImportTypeList, loaderLambda);
        loaderLambda.handle(new LoaderOfMImportType().ready(mImportTypeList, _behaviorSelector));
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
     * @param mImportType The entity of MImportType. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(MImportType mImportType, ReferrerLoaderHandler<LoaderOfMImportType> loaderLambda) {
        xassLRArg(mImportType, loaderLambda);
        loaderLambda.handle(new LoaderOfMImportType().ready(xnewLRAryLs(mImportType), _behaviorSelector));
    }

    /**
     * Load referrer of MImportTypeBList by the set-upper of referrer. <br>
     * M_IMPORT_TYPE_B by IMPORT_TYPE_ID, named 'MImportTypeBList'.
     * <pre>
     * <span style="color: #0000C0">mImportTypeBhv</span>.<span style="color: #CC4747">loadMImportTypeBList</span>(<span style="color: #553000">mImportTypeList</span>, <span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bCB</span>.setupSelect...
     *     <span style="color: #553000">bCB</span>.query().set...
     *     <span style="color: #553000">bCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MImportType mImportType : <span style="color: #553000">mImportTypeList</span>) {
     *     ... = mImportType.<span style="color: #CC4747">getMImportTypeBList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setImportTypeId_InScope(pkList);
     * cb.query().addOrderBy_ImportTypeId_Asc();
     * </pre>
     * @param mImportTypeList The entity list of MImportType. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MImportTypeB> loadMImportTypeBList(List<MImportType> mImportTypeList, ConditionBeanSetupper<MImportTypeBCB> refCBLambda) {
        xassLRArg(mImportTypeList, refCBLambda);
        return doLoadMImportTypeBList(mImportTypeList, new LoadReferrerOption<MImportTypeBCB, MImportTypeB>().xinit(refCBLambda));
    }

    /**
     * Load referrer of MImportTypeBList by the set-upper of referrer. <br>
     * M_IMPORT_TYPE_B by IMPORT_TYPE_ID, named 'MImportTypeBList'.
     * <pre>
     * <span style="color: #0000C0">mImportTypeBhv</span>.<span style="color: #CC4747">loadMImportTypeBList</span>(<span style="color: #553000">mImportType</span>, <span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bCB</span>.setupSelect...
     *     <span style="color: #553000">bCB</span>.query().set...
     *     <span style="color: #553000">bCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mImportType</span>.<span style="color: #CC4747">getMImportTypeBList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setImportTypeId_InScope(pkList);
     * cb.query().addOrderBy_ImportTypeId_Asc();
     * </pre>
     * @param mImportType The entity of MImportType. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MImportTypeB> loadMImportTypeBList(MImportType mImportType, ConditionBeanSetupper<MImportTypeBCB> refCBLambda) {
        xassLRArg(mImportType, refCBLambda);
        return doLoadMImportTypeBList(xnewLRLs(mImportType), new LoadReferrerOption<MImportTypeBCB, MImportTypeB>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mImportType The entity of MImportType. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MImportTypeB> loadMImportTypeBList(MImportType mImportType, LoadReferrerOption<MImportTypeBCB, MImportTypeB> loadReferrerOption) {
        xassLRArg(mImportType, loadReferrerOption);
        return loadMImportTypeBList(xnewLRLs(mImportType), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mImportTypeList The entity list of MImportType. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<MImportTypeB> loadMImportTypeBList(List<MImportType> mImportTypeList, LoadReferrerOption<MImportTypeBCB, MImportTypeB> loadReferrerOption) {
        xassLRArg(mImportTypeList, loadReferrerOption);
        if (mImportTypeList.isEmpty()) { return (NestedReferrerListGateway<MImportTypeB>)EMPTY_NREF_LGWAY; }
        return doLoadMImportTypeBList(mImportTypeList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<MImportTypeB> doLoadMImportTypeBList(List<MImportType> mImportTypeList, LoadReferrerOption<MImportTypeBCB, MImportTypeB> option) {
        return helpLoadReferrerInternally(mImportTypeList, option, "mImportTypeBList");
    }

    /**
     * Load referrer of TEcOrderHList by the set-upper of referrer. <br>
     * T_EC_ORDER_H by IMPORT_TYPE_ID, named 'TEcOrderHList'.
     * <pre>
     * <span style="color: #0000C0">mImportTypeBhv</span>.<span style="color: #CC4747">loadTEcOrderHList</span>(<span style="color: #553000">mImportTypeList</span>, <span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hCB</span>.setupSelect...
     *     <span style="color: #553000">hCB</span>.query().set...
     *     <span style="color: #553000">hCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MImportType mImportType : <span style="color: #553000">mImportTypeList</span>) {
     *     ... = mImportType.<span style="color: #CC4747">getTEcOrderHList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setImportTypeId_InScope(pkList);
     * cb.query().addOrderBy_ImportTypeId_Asc();
     * </pre>
     * @param mImportTypeList The entity list of MImportType. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TEcOrderH> loadTEcOrderHList(List<MImportType> mImportTypeList, ConditionBeanSetupper<TEcOrderHCB> refCBLambda) {
        xassLRArg(mImportTypeList, refCBLambda);
        return doLoadTEcOrderHList(mImportTypeList, new LoadReferrerOption<TEcOrderHCB, TEcOrderH>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TEcOrderHList by the set-upper of referrer. <br>
     * T_EC_ORDER_H by IMPORT_TYPE_ID, named 'TEcOrderHList'.
     * <pre>
     * <span style="color: #0000C0">mImportTypeBhv</span>.<span style="color: #CC4747">loadTEcOrderHList</span>(<span style="color: #553000">mImportType</span>, <span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hCB</span>.setupSelect...
     *     <span style="color: #553000">hCB</span>.query().set...
     *     <span style="color: #553000">hCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mImportType</span>.<span style="color: #CC4747">getTEcOrderHList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setImportTypeId_InScope(pkList);
     * cb.query().addOrderBy_ImportTypeId_Asc();
     * </pre>
     * @param mImportType The entity of MImportType. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TEcOrderH> loadTEcOrderHList(MImportType mImportType, ConditionBeanSetupper<TEcOrderHCB> refCBLambda) {
        xassLRArg(mImportType, refCBLambda);
        return doLoadTEcOrderHList(xnewLRLs(mImportType), new LoadReferrerOption<TEcOrderHCB, TEcOrderH>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mImportType The entity of MImportType. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TEcOrderH> loadTEcOrderHList(MImportType mImportType, LoadReferrerOption<TEcOrderHCB, TEcOrderH> loadReferrerOption) {
        xassLRArg(mImportType, loadReferrerOption);
        return loadTEcOrderHList(xnewLRLs(mImportType), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mImportTypeList The entity list of MImportType. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TEcOrderH> loadTEcOrderHList(List<MImportType> mImportTypeList, LoadReferrerOption<TEcOrderHCB, TEcOrderH> loadReferrerOption) {
        xassLRArg(mImportTypeList, loadReferrerOption);
        if (mImportTypeList.isEmpty()) { return (NestedReferrerListGateway<TEcOrderH>)EMPTY_NREF_LGWAY; }
        return doLoadTEcOrderHList(mImportTypeList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TEcOrderH> doLoadTEcOrderHList(List<MImportType> mImportTypeList, LoadReferrerOption<TEcOrderHCB, TEcOrderH> option) {
        return helpLoadReferrerInternally(mImportTypeList, option, "tEcOrderHList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'MClient'.
     * @param mImportTypeList The list of mImportType. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MClient> pulloutMClient(List<MImportType> mImportTypeList)
    { return helpPulloutInternally(mImportTypeList, "mClient"); }

    /**
     * Pull out the list of foreign table 'MEdi'.
     * @param mImportTypeList The list of mImportType. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MEdi> pulloutMEdi(List<MImportType> mImportTypeList)
    { return helpPulloutInternally(mImportTypeList, "mEdi"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param mImportTypeList The list of mImportType. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByGiftStatementType(List<MImportType> mImportTypeList)
    { return helpPulloutInternally(mImportTypeList, "bClassDtlByGiftStatementType"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param mImportTypeList The list of mImportType. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByLineFeedCd(List<MImportType> mImportTypeList)
    { return helpPulloutInternally(mImportTypeList, "bClassDtlByLineFeedCd"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param mImportTypeList The list of mImportType. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByUploadTableNm(List<MImportType> mImportTypeList)
    { return helpPulloutInternally(mImportTypeList, "bClassDtlByUploadTableNm"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key importTypeId.
     * @param mImportTypeList The list of mImportType. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractImportTypeIdList(List<MImportType> mImportTypeList)
    { return helpExtractListInternally(mImportTypeList, "importTypeId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * MImportType mImportType = <span style="color: #70226C">new</span> MImportType();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * mImportType.setFoo...(value);
     * mImportType.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mImportType.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mImportType.set...;</span>
     * <span style="color: #0000C0">mImportTypeBhv</span>.<span style="color: #CC4747">insert</span>(mImportType);
     * ... = mImportType.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param mImportType The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(MImportType mImportType) {
        doInsert(mImportType, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * MImportType mImportType = <span style="color: #70226C">new</span> MImportType();
     * mImportType.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mImportType.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mImportType.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mImportType.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * mImportType.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">mImportTypeBhv</span>.<span style="color: #CC4747">update</span>(mImportType);
     * </pre>
     * @param mImportType The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(MImportType mImportType) {
        doUpdate(mImportType, null);
    }

    /**
     * Update the entity non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * MImportType mImportType = <span style="color: #70226C">new</span> MImportType();
     * mImportType.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mImportType.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mImportType.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mImportType.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mImportType.setVersionNo(value);</span>
     * <span style="color: #0000C0">mImportTypeBhv</span>.<span style="color: #CC4747">updateNonstrict</span>(mImportType);
     * </pre>
     * @param mImportType The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(MImportType mImportType) {
        doUpdateNonstrict(mImportType, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param mImportType The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(MImportType mImportType) {
        doInsertOrUpdate(mImportType, null, null);
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param mImportType The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(MImportType mImportType) {
        doInsertOrUpdateNonstrict(mImportType, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * MImportType mImportType = <span style="color: #70226C">new</span> MImportType();
     * mImportType.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * mImportType.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">mImportTypeBhv</span>.<span style="color: #CC4747">delete</span>(mImportType);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param mImportType The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(MImportType mImportType) {
        doDelete(mImportType, null);
    }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl} <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * MImportType mImportType = <span style="color: #70226C">new</span> MImportType();
     * mImportType.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mImportType.setVersionNo(value);</span>
     * <span style="color: #0000C0">mImportTypeBhv</span>.<span style="color: #CC4747">deleteNonstrict</span>(mImportType);
     * </pre>
     * @param mImportType The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(MImportType mImportType) {
        doDeleteNonstrict(mImportType, null);
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * MImportType mImportType = <span style="color: #70226C">new</span> MImportType();
     * mImportType.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mImportType.setVersionNo(value);</span>
     * <span style="color: #0000C0">mImportTypeBhv</span>.<span style="color: #CC4747">deleteNonstrictIgnoreDeleted</span>(mImportType);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param mImportType The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(MImportType mImportType) {
        doDeleteNonstrictIgnoreDeleted(mImportType, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(MImportType et, final DeleteOption<MImportTypeCB> op) {
        assertObjectNotNull("mImportType", et); prepareDeleteOption(op); helpDeleteNonstrictIgnoreDeletedInternally(et, op);
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
     *     MImportType mImportType = <span style="color: #70226C">new</span> MImportType();
     *     mImportType.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         mImportType.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     mImportTypeList.add(mImportType);
     * }
     * <span style="color: #0000C0">mImportTypeBhv</span>.<span style="color: #CC4747">batchInsert</span>(mImportTypeList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param mImportTypeList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<MImportType> mImportTypeList) {
        return doBatchInsert(mImportTypeList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     MImportType mImportType = <span style="color: #70226C">new</span> MImportType();
     *     mImportType.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         mImportType.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         mImportType.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//mImportType.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     mImportTypeList.add(mImportType);
     * }
     * <span style="color: #0000C0">mImportTypeBhv</span>.<span style="color: #CC4747">batchUpdate</span>(mImportTypeList);
     * </pre>
     * @param mImportTypeList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<MImportType> mImportTypeList) {
        return doBatchUpdate(mImportTypeList, null);
    }

    /**
     * Batch-update the entity list specified-only. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * mImportTypeBhv.<span style="color: #CC4747">batchUpdate</span>(mImportTypeList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">mImportTypeBhv</span>.<span style="color: #CC4747">batchUpdate</span>(mImportTypeList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param mImportTypeList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<MImportType> mImportTypeList, SpecifyQuery<MImportTypeCB> colCBLambda) {
        return doBatchUpdate(mImportTypeList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * <span style="color: #70226C">for</span> (... : ...) {
     *     MImportType mImportType = <span style="color: #70226C">new</span> MImportType();
     *     mImportType.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         mImportType.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         mImportType.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//mImportType.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     mImportTypeList.add(mImportType);
     * }
     * <span style="color: #0000C0">mImportTypeBhv</span>.<span style="color: #CC4747">batchUpdate</span>(mImportTypeList);
     * </pre>
     * @param mImportTypeList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<MImportType> mImportTypeList) {
        return doBatchUpdateNonstrict(mImportTypeList, null);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * <span style="color: #0000C0">mImportTypeBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(mImportTypeList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">mImportTypeBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(mImportTypeList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).</p>
     * @param mImportTypeList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<MImportType> mImportTypeList, SpecifyQuery<MImportTypeCB> colCBLambda) {
        return doBatchUpdateNonstrict(mImportTypeList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param mImportTypeList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<MImportType> mImportTypeList) {
        return doBatchDelete(mImportTypeList, null);
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param mImportTypeList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<MImportType> mImportTypeList) {
        return doBatchDeleteNonstrict(mImportTypeList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">mImportTypeBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;MImportType, MImportTypeCB&gt;() {
     *     public ConditionBean setup(MImportType entity, MImportTypeCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<MImportType, MImportTypeCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * MImportType mImportType = <span style="color: #70226C">new</span> MImportType();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//mImportType.setPK...(value);</span>
     * mImportType.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mImportType.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mImportType.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mImportType.setVersionNo(value);</span>
     * MImportTypeCB cb = <span style="color: #70226C">new</span> MImportTypeCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">mImportTypeBhv</span>.<span style="color: #CC4747">queryUpdate</span>(mImportType, cb);
     * </pre>
     * @param mImportType The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of MImportType. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(MImportType mImportType, MImportTypeCB cb) {
        return doQueryUpdate(mImportType, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * MImportTypeCB cb = new MImportTypeCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">mImportTypeBhv</span>.<span style="color: #CC4747">queryDelete</span>(mImportType, cb);
     * </pre>
     * @param cb The condition-bean of MImportType. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(MImportTypeCB cb) {
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
     * MImportType mImportType = <span style="color: #70226C">new</span> MImportType();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * mImportType.setFoo...(value);
     * mImportType.setBar...(value);
     * <span style="color: #0000C0">mImportTypeBhv</span>.<span style="color: #CC4747">varyingInsert</span>(mImportType, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = mImportType.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param mImportType The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(MImportType mImportType, WritableOptionCall<MImportTypeCB, InsertOption<MImportTypeCB>> opLambda) {
        doInsert(mImportType, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * MImportType mImportType = <span style="color: #70226C">new</span> MImportType();
     * mImportType.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mImportType.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * mImportType.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">mImportTypeBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(mImportType, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param mImportType The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(MImportType mImportType, WritableOptionCall<MImportTypeCB, UpdateOption<MImportTypeCB>> opLambda) {
        doUpdate(mImportType, createUpdateOption(opLambda));
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * MImportType mImportType = <span style="color: #70226C">new</span> MImportType();
     * mImportType.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mImportType.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mImportType.setVersionNo(value);</span>
     * <span style="color: #0000C0">mImportTypeBhv</span>.<span style="color: #CC4747">varyingUpdateNonstrict</span>(mImportType, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param mImportType The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(MImportType mImportType, WritableOptionCall<MImportTypeCB, UpdateOption<MImportTypeCB>> opLambda) {
        doUpdateNonstrict(mImportType, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param mImportType The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(MImportType mImportType, WritableOptionCall<MImportTypeCB, InsertOption<MImportTypeCB>> insertOpLambda, WritableOptionCall<MImportTypeCB, UpdateOption<MImportTypeCB>> updateOpLambda) {
        doInsertOrUpdate(mImportType, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param mImportType The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(MImportType mImportType, WritableOptionCall<MImportTypeCB, InsertOption<MImportTypeCB>> insertOpLambda, WritableOptionCall<MImportTypeCB, UpdateOption<MImportTypeCB>> updateOpLambda) {
        doInsertOrUpdateNonstrict(mImportType, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param mImportType The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(MImportType mImportType, WritableOptionCall<MImportTypeCB, DeleteOption<MImportTypeCB>> opLambda) {
        doDelete(mImportType, createDeleteOption(opLambda));
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as deleteNonstrict(entity).
     * @param mImportType The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(MImportType mImportType, WritableOptionCall<MImportTypeCB, DeleteOption<MImportTypeCB>> opLambda) {
        doDeleteNonstrict(mImportType, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param mImportTypeList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<MImportType> mImportTypeList, WritableOptionCall<MImportTypeCB, InsertOption<MImportTypeCB>> opLambda) {
        return doBatchInsert(mImportTypeList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param mImportTypeList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<MImportType> mImportTypeList, WritableOptionCall<MImportTypeCB, UpdateOption<MImportTypeCB>> opLambda) {
        return doBatchUpdate(mImportTypeList, createUpdateOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param mImportTypeList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<MImportType> mImportTypeList, WritableOptionCall<MImportTypeCB, UpdateOption<MImportTypeCB>> opLambda) {
        return doBatchUpdateNonstrict(mImportTypeList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param mImportTypeList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<MImportType> mImportTypeList, WritableOptionCall<MImportTypeCB, DeleteOption<MImportTypeCB>> opLambda) {
        return doBatchDelete(mImportTypeList, createDeleteOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param mImportTypeList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<MImportType> mImportTypeList, WritableOptionCall<MImportTypeCB, DeleteOption<MImportTypeCB>> opLambda) {
        return doBatchDeleteNonstrict(mImportTypeList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<MImportType, MImportTypeCB> manyArgLambda, WritableOptionCall<MImportTypeCB, InsertOption<MImportTypeCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * MImportType mImportType = <span style="color: #70226C">new</span> MImportType();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//mImportType.setPK...(value);</span>
     * mImportType.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mImportType.setVersionNo(value);</span>
     * MImportTypeCB cb = <span style="color: #70226C">new</span> MImportTypeCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">mImportTypeBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(mImportType, cb, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param mImportType The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of MImportType. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(MImportType mImportType, MImportTypeCB cb, WritableOptionCall<MImportTypeCB, UpdateOption<MImportTypeCB>> opLambda) {
        return doQueryUpdate(mImportType, cb, createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * @param cb The condition-bean of MImportType. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(MImportTypeCB cb, WritableOptionCall<MImportTypeCB, DeleteOption<MImportTypeCB>> opLambda) {
        return doQueryDelete(cb, createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span>
     * mImportTypeBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span>
     * mImportTypeBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * mImportTypeBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * mImportTypeBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * mImportTypeBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * mImportTypeBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * mImportTypeBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span>
     * mImportTypeBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * mImportTypeBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * mImportTypeBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * mImportTypeBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * mImportTypeBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * mImportTypeBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span>
     * mImportTypeBhv.outideSql().removeBlockComment().selectList()
     * mImportTypeBhv.outideSql().removeLineComment().selectList()
     * mImportTypeBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlBasicExecutor<MImportTypeBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<MImportTypeBhv> facadeExecutor = doOutsideSql();
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
    protected Class<? extends MImportType> typeOfSelectedEntity() { return MImportType.class; }
    protected Class<MImportType> typeOfHandlingEntity() { return MImportType.class; }
    protected Class<MImportTypeCB> typeOfHandlingConditionBean() { return MImportTypeCB.class; }
}
