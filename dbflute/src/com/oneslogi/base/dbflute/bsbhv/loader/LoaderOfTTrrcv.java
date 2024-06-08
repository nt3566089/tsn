package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;
import com.oneslogi.base.dbflute.cbean.*;

/**
 * The referrer loader of T_TRRCV as TABLE. <br>
 * <pre>
 * [primary key]
 *     RECEIVE_PLAN_H_ID
 *
 * [column]
 *     RECEIVE_PLAN_H_ID, PREKEY, TEMPLATEFLG, RCVINSPECTFLG, SUPPLIERRCVNO, RMANO, RCVTYPE, ITEMCD, PARTFLG, RECEIVE_STS, PRIORITIES, COMPANYCD, RECEIVEDATE, LOGISTICSCD, SUPPLIERCD, SUPPLIERNAME, ADDRESS1, ADDRESS2, ADDRESS3, POSTNO, COUNTRYCD, PORTCD, DISTRICTCD, SUPPLIERPHONE, FAX1, EMAIL, REFNAME, FROMCD, FROMSUB, FROMNAME, FROMADDRESS1, FROMADDRESS2, FROMADDRESS3, FROMPOSTNO, FROMCOUNTRYCD, FROMPORTCD, FROMDISTRICTCD, FROMPHONE, FROMFAX, FROMEMAIL, FROMREFNAME, CARRIERCD, CARRIERNAME, CARRIERWBNO, DELIVERYCD, CARRIERNO, CARRIERSNAME, CARRIERSEQ, EXPECTEDTIME, NOTES, OTHERREFNO1, OTHERREFNO2, OTHERREFNO3, ALLOCGROUP, TRACCEPT_ID, ACCEPTUSERCD, INSPECTEDUSERCD, RECEIVEDUSERCD, MOVEKEY, ASSYKEY, PRODUCEKEY, TERMINAL_CD, WAREHOUSE_CD, FC_FLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     T_RECEIVE_PLAN_H, T_TRRCVEXTEND(AsOne)
 *
 * [referrer table]
 *     T_TRRCVDETAIL, T_TRRCVEXTEND
 *
 * [foreign property]
 *     tReceivePlanH, tTrrcvextendAsOne
 *
 * [referrer property]
 *     tTrrcvdetailList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfTTrrcv {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TTrrcv> _selectedList;
    protected BehaviorSelector _selector;
    protected TTrrcvBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTTrrcv ready(List<TTrrcv> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TTrrcvBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TTrrcvBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<TTrrcvdetail> _referrerTTrrcvdetailList;

    /**
     * Load referrer of TTrrcvdetailList by the set-upper of referrer. <br>
     * T_TRRCVDETAIL by RECEIVE_PLAN_H_ID, named 'TTrrcvdetailList'.
     * <pre>
     * <span style="color: #0000C0">tTrrcvBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">tTrrcvList</span>, <span style="color: #553000">trrcvLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">trrcvLoader</span>.<span style="color: #CC4747">loadTTrrcvdetailList</span>(<span style="color: #553000">trrcvdetailCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">trrcvdetailCB</span>.setupSelect...
     *         <span style="color: #553000">trrcvdetailCB</span>.query().set...
     *         <span style="color: #553000">trrcvdetailCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">trrcvdetailLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    trrcvdetailLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (TTrrcv tTrrcv : <span style="color: #553000">tTrrcvList</span>) {
     *     ... = tTrrcv.<span style="color: #CC4747">getTTrrcvdetailList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setReceivePlanHId_InScope(pkList);
     * cb.query().addOrderBy_ReceivePlanHId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTTrrcvdetail> loadTTrrcvdetailList(ConditionBeanSetupper<TTrrcvdetailCB> refCBLambda) {
        myBhv().loadTTrrcvdetailList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTTrrcvdetailList = refLs);
        return hd -> hd.handle(new LoaderOfTTrrcvdetail().ready(_referrerTTrrcvdetailList, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfTReceivePlanH _foreignTReceivePlanHLoader;
    public LoaderOfTReceivePlanH pulloutTReceivePlanH() {
        if (_foreignTReceivePlanHLoader == null)
        { _foreignTReceivePlanHLoader = new LoaderOfTReceivePlanH().ready(myBhv().pulloutTReceivePlanH(_selectedList), _selector); }
        return _foreignTReceivePlanHLoader;
    }

    protected LoaderOfTTrrcvextend _foreignTTrrcvextendAsOneLoader;
    public LoaderOfTTrrcvextend pulloutTTrrcvextendAsOne() {
        if (_foreignTTrrcvextendAsOneLoader == null)
        { _foreignTTrrcvextendAsOneLoader = new LoaderOfTTrrcvextend().ready(myBhv().pulloutTTrrcvextendAsOne(_selectedList), _selector); }
        return _foreignTTrrcvextendAsOneLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TTrrcv> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
