package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;
import com.oneslogi.base.dbflute.cbean.*;

/**
 * The referrer loader of B_USER as TABLE. <br>
 * <pre>
 * [primary key]
 *     USER_ID
 *
 * [column]
 *     USER_ID, USER_CD, USER_NM, CULTURE_ID, ROLE_GRP_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     USER_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     B_CULTURE, B_ROLE_GRP, B_CLASS_DTL(ByDelFlg), B_USER_AUTH(AsOne), M_USER_LOGIN(AsOne)
 *
 * [referrer table]
 *     M_USER_CENTER, M_USER_CLIENT, M_USER_DEPOSIT, T_EC_ORDER_R, T_INVENTORY_R, T_MOVE_INST_R, T_PACKING_R, T_PICKING_R, T_RECEIVE_PLAN_R, T_STORE_NO_R, T_STORE_RECORD_R, W_SGL_ROW_SHIP_INSP_B, T_PACKING_H, B_USER_AUTH, M_USER_LOGIN
 *
 * [foreign property]
 *     bCulture, bRoleGrp, bClassDtlByDelFlg, bUserAuthAsOne, mUserLoginAsOne
 *
 * [referrer property]
 *     mUserCenterList, mUserClientList, mUserDepositList, tEcOrderRList, tInventoryRList, tMoveInstRList, tPackingRByInspectionOutUserIdList, tPackingRByStwOutUserIdList, tPackingRByTagOutUserIdList, tPickingRByCaseOutUserIdList, tPickingRByPackingOutUserIdList, tPickingRByPl1OutUserIdList, tPickingRByPl2OutUserIdList, tPickingRByShippingRecordOutUserIdList, tPickingRBySlipOutUserIdList, tReceivePlanRList, tStoreNoRList, tStoreRecordRList, wSglRowShipInspBList, tPackingHByUpdUserList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfBUser {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<BUser> _selectedList;
    protected BehaviorSelector _selector;
    protected BUserBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfBUser ready(List<BUser> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected BUserBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(BUserBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<MUserCenter> _referrerMUserCenterList;

    /**
     * Load referrer of MUserCenterList by the set-upper of referrer. <br>
     * M_USER_CENTER by USER_ID, named 'MUserCenterList'.
     * <pre>
     * <span style="color: #0000C0">bUserBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">bUserList</span>, <span style="color: #553000">userLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">userLoader</span>.<span style="color: #CC4747">loadMUserCenterList</span>(<span style="color: #553000">centerCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">centerCB</span>.setupSelect...
     *         <span style="color: #553000">centerCB</span>.query().set...
     *         <span style="color: #553000">centerCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">centerLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    centerLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (BUser bUser : <span style="color: #553000">bUserList</span>) {
     *     ... = bUser.<span style="color: #CC4747">getMUserCenterList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setUserId_InScope(pkList);
     * cb.query().addOrderBy_UserId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMUserCenter> loadMUserCenterList(ConditionBeanSetupper<MUserCenterCB> refCBLambda) {
        myBhv().loadMUserCenterList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMUserCenterList = refLs);
        return hd -> hd.handle(new LoaderOfMUserCenter().ready(_referrerMUserCenterList, _selector));
    }

    protected List<MUserClient> _referrerMUserClientList;

    /**
     * Load referrer of MUserClientList by the set-upper of referrer. <br>
     * M_USER_CLIENT by USER_ID, named 'MUserClientList'.
     * <pre>
     * <span style="color: #0000C0">bUserBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">bUserList</span>, <span style="color: #553000">userLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">userLoader</span>.<span style="color: #CC4747">loadMUserClientList</span>(<span style="color: #553000">clientCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">clientCB</span>.setupSelect...
     *         <span style="color: #553000">clientCB</span>.query().set...
     *         <span style="color: #553000">clientCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">clientLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    clientLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (BUser bUser : <span style="color: #553000">bUserList</span>) {
     *     ... = bUser.<span style="color: #CC4747">getMUserClientList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setUserId_InScope(pkList);
     * cb.query().addOrderBy_UserId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMUserClient> loadMUserClientList(ConditionBeanSetupper<MUserClientCB> refCBLambda) {
        myBhv().loadMUserClientList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMUserClientList = refLs);
        return hd -> hd.handle(new LoaderOfMUserClient().ready(_referrerMUserClientList, _selector));
    }

    protected List<MUserDeposit> _referrerMUserDepositList;

    /**
     * Load referrer of MUserDepositList by the set-upper of referrer. <br>
     * M_USER_DEPOSIT by USER_ID, named 'MUserDepositList'.
     * <pre>
     * <span style="color: #0000C0">bUserBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">bUserList</span>, <span style="color: #553000">userLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">userLoader</span>.<span style="color: #CC4747">loadMUserDepositList</span>(<span style="color: #553000">depositCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">depositCB</span>.setupSelect...
     *         <span style="color: #553000">depositCB</span>.query().set...
     *         <span style="color: #553000">depositCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">depositLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    depositLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (BUser bUser : <span style="color: #553000">bUserList</span>) {
     *     ... = bUser.<span style="color: #CC4747">getMUserDepositList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setUserId_InScope(pkList);
     * cb.query().addOrderBy_UserId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMUserDeposit> loadMUserDepositList(ConditionBeanSetupper<MUserDepositCB> refCBLambda) {
        myBhv().loadMUserDepositList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMUserDepositList = refLs);
        return hd -> hd.handle(new LoaderOfMUserDeposit().ready(_referrerMUserDepositList, _selector));
    }

    protected List<TEcOrderR> _referrerTEcOrderRList;

    /**
     * Load referrer of TEcOrderRList by the set-upper of referrer. <br>
     * T_EC_ORDER_R by STATEMENT_OUT_USER_ID, named 'TEcOrderRList'.
     * <pre>
     * <span style="color: #0000C0">bUserBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">bUserList</span>, <span style="color: #553000">userLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">userLoader</span>.<span style="color: #CC4747">loadTEcOrderRList</span>(<span style="color: #553000">rCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">rCB</span>.setupSelect...
     *         <span style="color: #553000">rCB</span>.query().set...
     *         <span style="color: #553000">rCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">rLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    rLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (BUser bUser : <span style="color: #553000">bUserList</span>) {
     *     ... = bUser.<span style="color: #CC4747">getTEcOrderRList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setStatementOutUserId_InScope(pkList);
     * cb.query().addOrderBy_StatementOutUserId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTEcOrderR> loadTEcOrderRList(ConditionBeanSetupper<TEcOrderRCB> refCBLambda) {
        myBhv().loadTEcOrderRList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTEcOrderRList = refLs);
        return hd -> hd.handle(new LoaderOfTEcOrderR().ready(_referrerTEcOrderRList, _selector));
    }

    protected List<TInventoryR> _referrerTInventoryRList;

    /**
     * Load referrer of TInventoryRList by the set-upper of referrer. <br>
     * T_INVENTORY_R by TWL_OUT_USER_ID, named 'TInventoryRList'.
     * <pre>
     * <span style="color: #0000C0">bUserBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">bUserList</span>, <span style="color: #553000">userLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">userLoader</span>.<span style="color: #CC4747">loadTInventoryRList</span>(<span style="color: #553000">rCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">rCB</span>.setupSelect...
     *         <span style="color: #553000">rCB</span>.query().set...
     *         <span style="color: #553000">rCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">rLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    rLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (BUser bUser : <span style="color: #553000">bUserList</span>) {
     *     ... = bUser.<span style="color: #CC4747">getTInventoryRList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setTwlOutUserId_InScope(pkList);
     * cb.query().addOrderBy_TwlOutUserId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTInventoryR> loadTInventoryRList(ConditionBeanSetupper<TInventoryRCB> refCBLambda) {
        myBhv().loadTInventoryRList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTInventoryRList = refLs);
        return hd -> hd.handle(new LoaderOfTInventoryR().ready(_referrerTInventoryRList, _selector));
    }

    protected List<TMoveInstR> _referrerTMoveInstRList;

    /**
     * Load referrer of TMoveInstRList by the set-upper of referrer. <br>
     * T_MOVE_INST_R by INST_OUT_USER_ID, named 'TMoveInstRList'.
     * <pre>
     * <span style="color: #0000C0">bUserBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">bUserList</span>, <span style="color: #553000">userLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">userLoader</span>.<span style="color: #CC4747">loadTMoveInstRList</span>(<span style="color: #553000">rCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">rCB</span>.setupSelect...
     *         <span style="color: #553000">rCB</span>.query().set...
     *         <span style="color: #553000">rCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">rLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    rLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (BUser bUser : <span style="color: #553000">bUserList</span>) {
     *     ... = bUser.<span style="color: #CC4747">getTMoveInstRList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setInstOutUserId_InScope(pkList);
     * cb.query().addOrderBy_InstOutUserId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTMoveInstR> loadTMoveInstRList(ConditionBeanSetupper<TMoveInstRCB> refCBLambda) {
        myBhv().loadTMoveInstRList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTMoveInstRList = refLs);
        return hd -> hd.handle(new LoaderOfTMoveInstR().ready(_referrerTMoveInstRList, _selector));
    }

    protected List<TPackingR> _referrerTPackingRByInspectionOutUserIdList;

    /**
     * Load referrer of TPackingRByInspectionOutUserIdList by the set-upper of referrer. <br>
     * T_PACKING_R by INSPECTION_OUT_USER_ID, named 'TPackingRByInspectionOutUserIdList'.
     * <pre>
     * <span style="color: #0000C0">bUserBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">bUserList</span>, <span style="color: #553000">userLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">userLoader</span>.<span style="color: #CC4747">loadTPackingRByInspectionOutUserIdList</span>(<span style="color: #553000">rCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">rCB</span>.setupSelect...
     *         <span style="color: #553000">rCB</span>.query().set...
     *         <span style="color: #553000">rCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">rLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    rLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (BUser bUser : <span style="color: #553000">bUserList</span>) {
     *     ... = bUser.<span style="color: #CC4747">getTPackingRByInspectionOutUserIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setInspectionOutUserId_InScope(pkList);
     * cb.query().addOrderBy_InspectionOutUserId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTPackingR> loadTPackingRByInspectionOutUserIdList(ConditionBeanSetupper<TPackingRCB> refCBLambda) {
        myBhv().loadTPackingRByInspectionOutUserIdList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTPackingRByInspectionOutUserIdList = refLs);
        return hd -> hd.handle(new LoaderOfTPackingR().ready(_referrerTPackingRByInspectionOutUserIdList, _selector));
    }

    protected List<TPackingR> _referrerTPackingRByStwOutUserIdList;

    /**
     * Load referrer of TPackingRByStwOutUserIdList by the set-upper of referrer. <br>
     * T_PACKING_R by STW_OUT_USER_ID, named 'TPackingRByStwOutUserIdList'.
     * <pre>
     * <span style="color: #0000C0">bUserBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">bUserList</span>, <span style="color: #553000">userLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">userLoader</span>.<span style="color: #CC4747">loadTPackingRByStwOutUserIdList</span>(<span style="color: #553000">rCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">rCB</span>.setupSelect...
     *         <span style="color: #553000">rCB</span>.query().set...
     *         <span style="color: #553000">rCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">rLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    rLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (BUser bUser : <span style="color: #553000">bUserList</span>) {
     *     ... = bUser.<span style="color: #CC4747">getTPackingRByStwOutUserIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setStwOutUserId_InScope(pkList);
     * cb.query().addOrderBy_StwOutUserId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTPackingR> loadTPackingRByStwOutUserIdList(ConditionBeanSetupper<TPackingRCB> refCBLambda) {
        myBhv().loadTPackingRByStwOutUserIdList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTPackingRByStwOutUserIdList = refLs);
        return hd -> hd.handle(new LoaderOfTPackingR().ready(_referrerTPackingRByStwOutUserIdList, _selector));
    }

    protected List<TPackingR> _referrerTPackingRByTagOutUserIdList;

    /**
     * Load referrer of TPackingRByTagOutUserIdList by the set-upper of referrer. <br>
     * T_PACKING_R by TAG_OUT_USER_ID, named 'TPackingRByTagOutUserIdList'.
     * <pre>
     * <span style="color: #0000C0">bUserBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">bUserList</span>, <span style="color: #553000">userLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">userLoader</span>.<span style="color: #CC4747">loadTPackingRByTagOutUserIdList</span>(<span style="color: #553000">rCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">rCB</span>.setupSelect...
     *         <span style="color: #553000">rCB</span>.query().set...
     *         <span style="color: #553000">rCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">rLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    rLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (BUser bUser : <span style="color: #553000">bUserList</span>) {
     *     ... = bUser.<span style="color: #CC4747">getTPackingRByTagOutUserIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setTagOutUserId_InScope(pkList);
     * cb.query().addOrderBy_TagOutUserId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTPackingR> loadTPackingRByTagOutUserIdList(ConditionBeanSetupper<TPackingRCB> refCBLambda) {
        myBhv().loadTPackingRByTagOutUserIdList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTPackingRByTagOutUserIdList = refLs);
        return hd -> hd.handle(new LoaderOfTPackingR().ready(_referrerTPackingRByTagOutUserIdList, _selector));
    }

    protected List<TPickingR> _referrerTPickingRByCaseOutUserIdList;

    /**
     * Load referrer of TPickingRByCaseOutUserIdList by the set-upper of referrer. <br>
     * T_PICKING_R by CASE_OUT_USER_ID, named 'TPickingRByCaseOutUserIdList'.
     * <pre>
     * <span style="color: #0000C0">bUserBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">bUserList</span>, <span style="color: #553000">userLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">userLoader</span>.<span style="color: #CC4747">loadTPickingRByCaseOutUserIdList</span>(<span style="color: #553000">rCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">rCB</span>.setupSelect...
     *         <span style="color: #553000">rCB</span>.query().set...
     *         <span style="color: #553000">rCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">rLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    rLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (BUser bUser : <span style="color: #553000">bUserList</span>) {
     *     ... = bUser.<span style="color: #CC4747">getTPickingRByCaseOutUserIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCaseOutUserId_InScope(pkList);
     * cb.query().addOrderBy_CaseOutUserId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTPickingR> loadTPickingRByCaseOutUserIdList(ConditionBeanSetupper<TPickingRCB> refCBLambda) {
        myBhv().loadTPickingRByCaseOutUserIdList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTPickingRByCaseOutUserIdList = refLs);
        return hd -> hd.handle(new LoaderOfTPickingR().ready(_referrerTPickingRByCaseOutUserIdList, _selector));
    }

    protected List<TPickingR> _referrerTPickingRByPackingOutUserIdList;

    /**
     * Load referrer of TPickingRByPackingOutUserIdList by the set-upper of referrer. <br>
     * T_PICKING_R by PACKING_OUT_USER_ID, named 'TPickingRByPackingOutUserIdList'.
     * <pre>
     * <span style="color: #0000C0">bUserBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">bUserList</span>, <span style="color: #553000">userLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">userLoader</span>.<span style="color: #CC4747">loadTPickingRByPackingOutUserIdList</span>(<span style="color: #553000">rCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">rCB</span>.setupSelect...
     *         <span style="color: #553000">rCB</span>.query().set...
     *         <span style="color: #553000">rCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">rLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    rLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (BUser bUser : <span style="color: #553000">bUserList</span>) {
     *     ... = bUser.<span style="color: #CC4747">getTPickingRByPackingOutUserIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setPackingOutUserId_InScope(pkList);
     * cb.query().addOrderBy_PackingOutUserId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTPickingR> loadTPickingRByPackingOutUserIdList(ConditionBeanSetupper<TPickingRCB> refCBLambda) {
        myBhv().loadTPickingRByPackingOutUserIdList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTPickingRByPackingOutUserIdList = refLs);
        return hd -> hd.handle(new LoaderOfTPickingR().ready(_referrerTPickingRByPackingOutUserIdList, _selector));
    }

    protected List<TPickingR> _referrerTPickingRByPl1OutUserIdList;

    /**
     * Load referrer of TPickingRByPl1OutUserIdList by the set-upper of referrer. <br>
     * T_PICKING_R by PL1_OUT_USER_ID, named 'TPickingRByPl1OutUserIdList'.
     * <pre>
     * <span style="color: #0000C0">bUserBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">bUserList</span>, <span style="color: #553000">userLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">userLoader</span>.<span style="color: #CC4747">loadTPickingRByPl1OutUserIdList</span>(<span style="color: #553000">rCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">rCB</span>.setupSelect...
     *         <span style="color: #553000">rCB</span>.query().set...
     *         <span style="color: #553000">rCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">rLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    rLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (BUser bUser : <span style="color: #553000">bUserList</span>) {
     *     ... = bUser.<span style="color: #CC4747">getTPickingRByPl1OutUserIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setPl1OutUserId_InScope(pkList);
     * cb.query().addOrderBy_Pl1OutUserId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTPickingR> loadTPickingRByPl1OutUserIdList(ConditionBeanSetupper<TPickingRCB> refCBLambda) {
        myBhv().loadTPickingRByPl1OutUserIdList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTPickingRByPl1OutUserIdList = refLs);
        return hd -> hd.handle(new LoaderOfTPickingR().ready(_referrerTPickingRByPl1OutUserIdList, _selector));
    }

    protected List<TPickingR> _referrerTPickingRByPl2OutUserIdList;

    /**
     * Load referrer of TPickingRByPl2OutUserIdList by the set-upper of referrer. <br>
     * T_PICKING_R by PL2_OUT_USER_ID, named 'TPickingRByPl2OutUserIdList'.
     * <pre>
     * <span style="color: #0000C0">bUserBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">bUserList</span>, <span style="color: #553000">userLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">userLoader</span>.<span style="color: #CC4747">loadTPickingRByPl2OutUserIdList</span>(<span style="color: #553000">rCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">rCB</span>.setupSelect...
     *         <span style="color: #553000">rCB</span>.query().set...
     *         <span style="color: #553000">rCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">rLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    rLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (BUser bUser : <span style="color: #553000">bUserList</span>) {
     *     ... = bUser.<span style="color: #CC4747">getTPickingRByPl2OutUserIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setPl2OutUserId_InScope(pkList);
     * cb.query().addOrderBy_Pl2OutUserId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTPickingR> loadTPickingRByPl2OutUserIdList(ConditionBeanSetupper<TPickingRCB> refCBLambda) {
        myBhv().loadTPickingRByPl2OutUserIdList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTPickingRByPl2OutUserIdList = refLs);
        return hd -> hd.handle(new LoaderOfTPickingR().ready(_referrerTPickingRByPl2OutUserIdList, _selector));
    }

    protected List<TPickingR> _referrerTPickingRByShippingRecordOutUserIdList;

    /**
     * Load referrer of TPickingRByShippingRecordOutUserIdList by the set-upper of referrer. <br>
     * T_PICKING_R by SHIPPING_RECORD_OUT_USER_ID, named 'TPickingRByShippingRecordOutUserIdList'.
     * <pre>
     * <span style="color: #0000C0">bUserBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">bUserList</span>, <span style="color: #553000">userLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">userLoader</span>.<span style="color: #CC4747">loadTPickingRByShippingRecordOutUserIdList</span>(<span style="color: #553000">rCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">rCB</span>.setupSelect...
     *         <span style="color: #553000">rCB</span>.query().set...
     *         <span style="color: #553000">rCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">rLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    rLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (BUser bUser : <span style="color: #553000">bUserList</span>) {
     *     ... = bUser.<span style="color: #CC4747">getTPickingRByShippingRecordOutUserIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setShippingRecordOutUserId_InScope(pkList);
     * cb.query().addOrderBy_ShippingRecordOutUserId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTPickingR> loadTPickingRByShippingRecordOutUserIdList(ConditionBeanSetupper<TPickingRCB> refCBLambda) {
        myBhv().loadTPickingRByShippingRecordOutUserIdList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTPickingRByShippingRecordOutUserIdList = refLs);
        return hd -> hd.handle(new LoaderOfTPickingR().ready(_referrerTPickingRByShippingRecordOutUserIdList, _selector));
    }

    protected List<TPickingR> _referrerTPickingRBySlipOutUserIdList;

    /**
     * Load referrer of TPickingRBySlipOutUserIdList by the set-upper of referrer. <br>
     * T_PICKING_R by SLIP_OUT_USER_ID, named 'TPickingRBySlipOutUserIdList'.
     * <pre>
     * <span style="color: #0000C0">bUserBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">bUserList</span>, <span style="color: #553000">userLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">userLoader</span>.<span style="color: #CC4747">loadTPickingRBySlipOutUserIdList</span>(<span style="color: #553000">rCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">rCB</span>.setupSelect...
     *         <span style="color: #553000">rCB</span>.query().set...
     *         <span style="color: #553000">rCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">rLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    rLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (BUser bUser : <span style="color: #553000">bUserList</span>) {
     *     ... = bUser.<span style="color: #CC4747">getTPickingRBySlipOutUserIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setSlipOutUserId_InScope(pkList);
     * cb.query().addOrderBy_SlipOutUserId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTPickingR> loadTPickingRBySlipOutUserIdList(ConditionBeanSetupper<TPickingRCB> refCBLambda) {
        myBhv().loadTPickingRBySlipOutUserIdList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTPickingRBySlipOutUserIdList = refLs);
        return hd -> hd.handle(new LoaderOfTPickingR().ready(_referrerTPickingRBySlipOutUserIdList, _selector));
    }

    protected List<TReceivePlanR> _referrerTReceivePlanRList;

    /**
     * Load referrer of TReceivePlanRList by the set-upper of referrer. <br>
     * T_RECEIVE_PLAN_R by RPL_OUT_USER_ID, named 'TReceivePlanRList'.
     * <pre>
     * <span style="color: #0000C0">bUserBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">bUserList</span>, <span style="color: #553000">userLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">userLoader</span>.<span style="color: #CC4747">loadTReceivePlanRList</span>(<span style="color: #553000">rCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">rCB</span>.setupSelect...
     *         <span style="color: #553000">rCB</span>.query().set...
     *         <span style="color: #553000">rCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">rLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    rLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (BUser bUser : <span style="color: #553000">bUserList</span>) {
     *     ... = bUser.<span style="color: #CC4747">getTReceivePlanRList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setRplOutUserId_InScope(pkList);
     * cb.query().addOrderBy_RplOutUserId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTReceivePlanR> loadTReceivePlanRList(ConditionBeanSetupper<TReceivePlanRCB> refCBLambda) {
        myBhv().loadTReceivePlanRList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTReceivePlanRList = refLs);
        return hd -> hd.handle(new LoaderOfTReceivePlanR().ready(_referrerTReceivePlanRList, _selector));
    }

    protected List<TStoreNoR> _referrerTStoreNoRList;

    /**
     * Load referrer of TStoreNoRList by the set-upper of referrer. <br>
     * T_STORE_NO_R by TWL_OUT_USER_ID, named 'TStoreNoRList'.
     * <pre>
     * <span style="color: #0000C0">bUserBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">bUserList</span>, <span style="color: #553000">userLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">userLoader</span>.<span style="color: #CC4747">loadTStoreNoRList</span>(<span style="color: #553000">rCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">rCB</span>.setupSelect...
     *         <span style="color: #553000">rCB</span>.query().set...
     *         <span style="color: #553000">rCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">rLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    rLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (BUser bUser : <span style="color: #553000">bUserList</span>) {
     *     ... = bUser.<span style="color: #CC4747">getTStoreNoRList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setTwlOutUserId_InScope(pkList);
     * cb.query().addOrderBy_TwlOutUserId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTStoreNoR> loadTStoreNoRList(ConditionBeanSetupper<TStoreNoRCB> refCBLambda) {
        myBhv().loadTStoreNoRList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTStoreNoRList = refLs);
        return hd -> hd.handle(new LoaderOfTStoreNoR().ready(_referrerTStoreNoRList, _selector));
    }

    protected List<TStoreRecordR> _referrerTStoreRecordRList;

    /**
     * Load referrer of TStoreRecordRList by the set-upper of referrer. <br>
     * T_STORE_RECORD_R by RECEIVE_RECORD_OUT_USER_ID, named 'TStoreRecordRList'.
     * <pre>
     * <span style="color: #0000C0">bUserBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">bUserList</span>, <span style="color: #553000">userLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">userLoader</span>.<span style="color: #CC4747">loadTStoreRecordRList</span>(<span style="color: #553000">rCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">rCB</span>.setupSelect...
     *         <span style="color: #553000">rCB</span>.query().set...
     *         <span style="color: #553000">rCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">rLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    rLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (BUser bUser : <span style="color: #553000">bUserList</span>) {
     *     ... = bUser.<span style="color: #CC4747">getTStoreRecordRList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setReceiveRecordOutUserId_InScope(pkList);
     * cb.query().addOrderBy_ReceiveRecordOutUserId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTStoreRecordR> loadTStoreRecordRList(ConditionBeanSetupper<TStoreRecordRCB> refCBLambda) {
        myBhv().loadTStoreRecordRList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTStoreRecordRList = refLs);
        return hd -> hd.handle(new LoaderOfTStoreRecordR().ready(_referrerTStoreRecordRList, _selector));
    }

    protected List<WSglRowShipInspB> _referrerWSglRowShipInspBList;

    /**
     * Load referrer of WSglRowShipInspBList by the set-upper of referrer. <br>
     * W_SGL_ROW_SHIP_INSP_B by USER_ID, named 'WSglRowShipInspBList'.
     * <pre>
     * <span style="color: #0000C0">bUserBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">bUserList</span>, <span style="color: #553000">userLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">userLoader</span>.<span style="color: #CC4747">loadWSglRowShipInspBList</span>(<span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">bCB</span>.setupSelect...
     *         <span style="color: #553000">bCB</span>.query().set...
     *         <span style="color: #553000">bCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">bLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    bLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (BUser bUser : <span style="color: #553000">bUserList</span>) {
     *     ... = bUser.<span style="color: #CC4747">getWSglRowShipInspBList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setUserId_InScope(pkList);
     * cb.query().addOrderBy_UserId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfWSglRowShipInspB> loadWSglRowShipInspBList(ConditionBeanSetupper<WSglRowShipInspBCB> refCBLambda) {
        myBhv().loadWSglRowShipInspBList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerWSglRowShipInspBList = refLs);
        return hd -> hd.handle(new LoaderOfWSglRowShipInspB().ready(_referrerWSglRowShipInspBList, _selector));
    }

    protected List<TPackingH> _referrerTPackingHByUpdUserList;

    /**
     * Load referrer of TPackingHByUpdUserList by the set-upper of referrer. <br>
     * T_PACKING_H by UPD_USER, named 'TPackingHByUpdUserList'.
     * <pre>
     * <span style="color: #0000C0">bUserBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">bUserList</span>, <span style="color: #553000">userLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">userLoader</span>.<span style="color: #CC4747">loadTPackingHByUpdUserList</span>(<span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">hCB</span>.setupSelect...
     *         <span style="color: #553000">hCB</span>.query().set...
     *         <span style="color: #553000">hCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">hLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    hLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (BUser bUser : <span style="color: #553000">bUserList</span>) {
     *     ... = bUser.<span style="color: #CC4747">getTPackingHByUpdUserList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setUpdUser_InScope(pkList);
     * cb.query().addOrderBy_UpdUser_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTPackingH> loadTPackingHByUpdUserList(ConditionBeanSetupper<TPackingHCB> refCBLambda) {
        myBhv().loadTPackingHByUpdUserList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTPackingHByUpdUserList = refLs);
        return hd -> hd.handle(new LoaderOfTPackingH().ready(_referrerTPackingHByUpdUserList, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfBCulture _foreignBCultureLoader;
    public LoaderOfBCulture pulloutBCulture() {
        if (_foreignBCultureLoader == null)
        { _foreignBCultureLoader = new LoaderOfBCulture().ready(myBhv().pulloutBCulture(_selectedList), _selector); }
        return _foreignBCultureLoader;
    }

    protected LoaderOfBRoleGrp _foreignBRoleGrpLoader;
    public LoaderOfBRoleGrp pulloutBRoleGrp() {
        if (_foreignBRoleGrpLoader == null)
        { _foreignBRoleGrpLoader = new LoaderOfBRoleGrp().ready(myBhv().pulloutBRoleGrp(_selectedList), _selector); }
        return _foreignBRoleGrpLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByDelFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByDelFlg() {
        if (_foreignBClassDtlByDelFlgLoader == null)
        { _foreignBClassDtlByDelFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByDelFlg(_selectedList), _selector); }
        return _foreignBClassDtlByDelFlgLoader;
    }

    protected LoaderOfBUserAuth _foreignBUserAuthAsOneLoader;
    public LoaderOfBUserAuth pulloutBUserAuthAsOne() {
        if (_foreignBUserAuthAsOneLoader == null)
        { _foreignBUserAuthAsOneLoader = new LoaderOfBUserAuth().ready(myBhv().pulloutBUserAuthAsOne(_selectedList), _selector); }
        return _foreignBUserAuthAsOneLoader;
    }

    protected LoaderOfMUserLogin _foreignMUserLoginAsOneLoader;
    public LoaderOfMUserLogin pulloutMUserLoginAsOne() {
        if (_foreignMUserLoginAsOneLoader == null)
        { _foreignMUserLoginAsOneLoader = new LoaderOfMUserLogin().ready(myBhv().pulloutMUserLoginAsOne(_selectedList), _selector); }
        return _foreignMUserLoginAsOneLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<BUser> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
