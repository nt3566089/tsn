package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;
import com.oneslogi.base.dbflute.cbean.*;

/**
 * The referrer loader of H_RECEIVE_H as TABLE. <br>
 * <pre>
 * [primary key]
 *     STORE_RECORD_H_ID
 *
 * [column]
 *     STORE_RECORD_H_ID, HIST_DT, CLIENT_ID, CLIENT_CD, CLIENT_NM, CENTER_ID, CENTER_CD, CENTER_NM, PROCESS_TYPE_ID, RECEIVE_PLAN_DT, CLIENT_RECEIVE_NO, RECEIVE_SLIP_NO, SUPPLIER_ID, SUPPLIER_CD, SUPPLIER_NM, DEPOSIT_ID, DEPOSIT_CD, DEPOSIT_NM, RECEIVE_DELIVERY_STATUS, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     STORE_RECORD_H_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     M_PROCESS_TYPE, B_CLASS_DTL(ByReceiveDeliveryStatus)
 *
 * [referrer table]
 *     H_RECEIVE_B
 *
 * [foreign property]
 *     mProcessType, bClassDtlByReceiveDeliveryStatus
 *
 * [referrer property]
 *     hReceiveBList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfHReceiveH {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<HReceiveH> _selectedList;
    protected BehaviorSelector _selector;
    protected HReceiveHBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfHReceiveH ready(List<HReceiveH> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected HReceiveHBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(HReceiveHBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<HReceiveB> _referrerHReceiveBList;

    /**
     * Load referrer of HReceiveBList by the set-upper of referrer. <br>
     * H_RECEIVE_B by STORE_RECORD_H_ID, named 'HReceiveBList'.
     * <pre>
     * <span style="color: #0000C0">hReceiveHBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">hReceiveHList</span>, <span style="color: #553000">hLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hLoader</span>.<span style="color: #CC4747">loadHReceiveBList</span>(<span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">bCB</span>.setupSelect...
     *         <span style="color: #553000">bCB</span>.query().set...
     *         <span style="color: #553000">bCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">bLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    bLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (HReceiveH hReceiveH : <span style="color: #553000">hReceiveHList</span>) {
     *     ... = hReceiveH.<span style="color: #CC4747">getHReceiveBList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setStoreRecordHId_InScope(pkList);
     * cb.query().addOrderBy_StoreRecordHId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfHReceiveB> loadHReceiveBList(ConditionBeanSetupper<HReceiveBCB> refCBLambda) {
        myBhv().loadHReceiveBList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerHReceiveBList = refLs);
        return hd -> hd.handle(new LoaderOfHReceiveB().ready(_referrerHReceiveBList, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfMProcessType _foreignMProcessTypeLoader;
    public LoaderOfMProcessType pulloutMProcessType() {
        if (_foreignMProcessTypeLoader == null)
        { _foreignMProcessTypeLoader = new LoaderOfMProcessType().ready(myBhv().pulloutMProcessType(_selectedList), _selector); }
        return _foreignMProcessTypeLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByReceiveDeliveryStatusLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByReceiveDeliveryStatus() {
        if (_foreignBClassDtlByReceiveDeliveryStatusLoader == null)
        { _foreignBClassDtlByReceiveDeliveryStatusLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByReceiveDeliveryStatus(_selectedList), _selector); }
        return _foreignBClassDtlByReceiveDeliveryStatusLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<HReceiveH> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
