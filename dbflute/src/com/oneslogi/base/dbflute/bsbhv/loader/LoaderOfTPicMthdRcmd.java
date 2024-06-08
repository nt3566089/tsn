package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;
import com.oneslogi.base.dbflute.cbean.*;

/**
 * The referrer loader of T_PIC_MTHD_RCMD as TABLE. <br>
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
public class LoaderOfTPicMthdRcmd {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TPicMthdRcmd> _selectedList;
    protected BehaviorSelector _selector;
    protected TPicMthdRcmdBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTPicMthdRcmd ready(List<TPicMthdRcmd> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TPicMthdRcmdBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TPicMthdRcmdBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<TPicMthdRcmdCart> _referrerTPicMthdRcmdCartList;

    /**
     * Load referrer of TPicMthdRcmdCartList by the set-upper of referrer. <br>
     * T_PIC_MTHD_RCMD_CART by PIC_MTHD_RCMD_ID, named 'TPicMthdRcmdCartList'.
     * <pre>
     * <span style="color: #0000C0">tPicMthdRcmdBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">tPicMthdRcmdList</span>, <span style="color: #553000">rcmdLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">rcmdLoader</span>.<span style="color: #CC4747">loadTPicMthdRcmdCartList</span>(<span style="color: #553000">cartCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cartCB</span>.setupSelect...
     *         <span style="color: #553000">cartCB</span>.query().set...
     *         <span style="color: #553000">cartCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">cartLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    cartLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (TPicMthdRcmd tPicMthdRcmd : <span style="color: #553000">tPicMthdRcmdList</span>) {
     *     ... = tPicMthdRcmd.<span style="color: #CC4747">getTPicMthdRcmdCartList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setPicMthdRcmdId_InScope(pkList);
     * cb.query().addOrderBy_PicMthdRcmdId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTPicMthdRcmdCart> loadTPicMthdRcmdCartList(ConditionBeanSetupper<TPicMthdRcmdCartCB> refCBLambda) {
        myBhv().loadTPicMthdRcmdCartList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTPicMthdRcmdCartList = refLs);
        return hd -> hd.handle(new LoaderOfTPicMthdRcmdCart().ready(_referrerTPicMthdRcmdCartList, _selector));
    }

    protected List<TPicMthdRcmdData> _referrerTPicMthdRcmdDataList;

    /**
     * Load referrer of TPicMthdRcmdDataList by the set-upper of referrer. <br>
     * T_PIC_MTHD_RCMD_DATA by PIC_MTHD_RCMD_ID, named 'TPicMthdRcmdDataList'.
     * <pre>
     * <span style="color: #0000C0">tPicMthdRcmdBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">tPicMthdRcmdList</span>, <span style="color: #553000">rcmdLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">rcmdLoader</span>.<span style="color: #CC4747">loadTPicMthdRcmdDataList</span>(<span style="color: #553000">dataCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">dataCB</span>.setupSelect...
     *         <span style="color: #553000">dataCB</span>.query().set...
     *         <span style="color: #553000">dataCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">dataLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    dataLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (TPicMthdRcmd tPicMthdRcmd : <span style="color: #553000">tPicMthdRcmdList</span>) {
     *     ... = tPicMthdRcmd.<span style="color: #CC4747">getTPicMthdRcmdDataList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setPicMthdRcmdId_InScope(pkList);
     * cb.query().addOrderBy_PicMthdRcmdId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTPicMthdRcmdData> loadTPicMthdRcmdDataList(ConditionBeanSetupper<TPicMthdRcmdDataCB> refCBLambda) {
        myBhv().loadTPicMthdRcmdDataList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTPicMthdRcmdDataList = refLs);
        return hd -> hd.handle(new LoaderOfTPicMthdRcmdData().ready(_referrerTPicMthdRcmdDataList, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfMCenter _foreignMCenterLoader;
    public LoaderOfMCenter pulloutMCenter() {
        if (_foreignMCenterLoader == null)
        { _foreignMCenterLoader = new LoaderOfMCenter().ready(myBhv().pulloutMCenter(_selectedList), _selector); }
        return _foreignMCenterLoader;
    }

    protected LoaderOfMClient _foreignMClientLoader;
    public LoaderOfMClient pulloutMClient() {
        if (_foreignMClientLoader == null)
        { _foreignMClientLoader = new LoaderOfMClient().ready(myBhv().pulloutMClient(_selectedList), _selector); }
        return _foreignMClientLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByRcmdPickingClsLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByRcmdPickingCls() {
        if (_foreignBClassDtlByRcmdPickingClsLoader == null)
        { _foreignBClassDtlByRcmdPickingClsLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByRcmdPickingCls(_selectedList), _selector); }
        return _foreignBClassDtlByRcmdPickingClsLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByEmergencyFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByEmergencyFlg() {
        if (_foreignBClassDtlByEmergencyFlgLoader == null)
        { _foreignBClassDtlByEmergencyFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByEmergencyFlg(_selectedList), _selector); }
        return _foreignBClassDtlByEmergencyFlgLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TPicMthdRcmd> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
