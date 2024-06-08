package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;
import com.oneslogi.base.dbflute.cbean.*;

/**
 * The referrer loader of H_SHIPPING_H as TABLE. <br>
 * <pre>
 * [primary key]
 *     SHIPPING_INST_H_ID
 *
 * [column]
 *     SHIPPING_INST_H_ID, HIST_DT, CLIENT_ID, CLIENT_CD, CLIENT_NM, CENTER_ID, CENTER_CD, CENTER_NM, PROCESS_TYPE_ID, DELIV_PLAN_DT, DELIV_DT, DELIV_TZ, SHIPPING_DT, WORK_DT, CLIENT_SHIPPING_NO, SHIPPING_SLIP_NO, SUPPLY_CUSTOMER_ID, SUPPLY_CUSTOMER_CD, SUPPLY_CUSTOMER_NM, DELIV_CUSTOMER_ID, DELIV_CUSTOMER_CD, DELIV_ZIP_CD, DELIV_ADDRESS1, DELIV_ADDRESS2, DELIV_ADDRESS3, DELIV_ADDRESS_SUPPLY, DELIV_CUSTOMER_NM, DELIV_TEL_NO, DELIVERY_COURSE_ID, DELIVERY_COURSE_CD, DELIVERY_COURSE_NM, CARRIER_ID, CARRIER_CD, CARRIER_NM, EMERGENCY_FLG, PICKING_WORK_MESSAGE, TOTAL_PRICE, TOTAL_TAX, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SHIPPING_INST_H_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     M_PROCESS_TYPE, B_CLASS_DTL(ByDelivTz)
 *
 * [referrer table]
 *     H_PACKING_H, H_SHIPPING_B
 *
 * [foreign property]
 *     mProcessType, bClassDtlByDelivTz, bClassDtlByEmergencyFlg
 *
 * [referrer property]
 *     hPackingHList, hShippingBList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfHShippingH {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<HShippingH> _selectedList;
    protected BehaviorSelector _selector;
    protected HShippingHBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfHShippingH ready(List<HShippingH> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected HShippingHBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(HShippingHBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<HPackingH> _referrerHPackingHList;

    /**
     * Load referrer of HPackingHList by the set-upper of referrer. <br>
     * H_PACKING_H by SHIPPING_INST_H_ID, named 'HPackingHList'.
     * <pre>
     * <span style="color: #0000C0">hShippingHBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">hShippingHList</span>, <span style="color: #553000">hLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hLoader</span>.<span style="color: #CC4747">loadHPackingHList</span>(<span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">hCB</span>.setupSelect...
     *         <span style="color: #553000">hCB</span>.query().set...
     *         <span style="color: #553000">hCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">hLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    hLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (HShippingH hShippingH : <span style="color: #553000">hShippingHList</span>) {
     *     ... = hShippingH.<span style="color: #CC4747">getHPackingHList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setShippingInstHId_InScope(pkList);
     * cb.query().addOrderBy_ShippingInstHId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfHPackingH> loadHPackingHList(ConditionBeanSetupper<HPackingHCB> refCBLambda) {
        myBhv().loadHPackingHList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerHPackingHList = refLs);
        return hd -> hd.handle(new LoaderOfHPackingH().ready(_referrerHPackingHList, _selector));
    }

    protected List<HShippingB> _referrerHShippingBList;

    /**
     * Load referrer of HShippingBList by the set-upper of referrer. <br>
     * H_SHIPPING_B by SHIPPING_INST_H_ID, named 'HShippingBList'.
     * <pre>
     * <span style="color: #0000C0">hShippingHBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">hShippingHList</span>, <span style="color: #553000">hLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hLoader</span>.<span style="color: #CC4747">loadHShippingBList</span>(<span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">bCB</span>.setupSelect...
     *         <span style="color: #553000">bCB</span>.query().set...
     *         <span style="color: #553000">bCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">bLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    bLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (HShippingH hShippingH : <span style="color: #553000">hShippingHList</span>) {
     *     ... = hShippingH.<span style="color: #CC4747">getHShippingBList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setShippingInstHId_InScope(pkList);
     * cb.query().addOrderBy_ShippingInstHId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfHShippingB> loadHShippingBList(ConditionBeanSetupper<HShippingBCB> refCBLambda) {
        myBhv().loadHShippingBList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerHShippingBList = refLs);
        return hd -> hd.handle(new LoaderOfHShippingB().ready(_referrerHShippingBList, _selector));
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

    protected LoaderOfBClassDtl _foreignBClassDtlByDelivTzLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByDelivTz() {
        if (_foreignBClassDtlByDelivTzLoader == null)
        { _foreignBClassDtlByDelivTzLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByDelivTz(_selectedList), _selector); }
        return _foreignBClassDtlByDelivTzLoader;
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
    public List<HShippingH> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
