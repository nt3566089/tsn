package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;
import com.oneslogi.base.dbflute.cbean.*;

/**
 * The referrer loader of T_EC_ORDER_H as TABLE. <br>
 * <pre>
 * [primary key]
 *     EC_ORDER_H_ID
 *
 * [column]
 *     EC_ORDER_H_ID, CLIENT_ID, CENTER_ID, IMPORT_DT, ORDER_NO, PRIORITY_FLG, ORDER_DT, ORDER_TIME, DELIV_DT, DELIV_TZ, COMMENT1, COMMENT2, GIFT_FLG, NOSHI, ORDER_ZIP_CD, ORDER_ADDRESS1, ORDER_ADDRESS2, ORDER_ADDRESS3, ORDER_CUSTOMER_NM, ORDER_CUSTOMER_NM_KANA, ORDER_TEL_NO, DELIV_MATCH_FLG, MERGE_ID, MERGE_STATUS, DELIV_ZIP_CD, DELIV_ADDRESS1, DELIV_ADDRESS2, DELIV_ADDRESS3, INVOICE_DELIV_ADDRESS1, INVOICE_DELIV_ADDRESS2, INVOICE_DELIV_ADDRESS3, DELIV_CUSTOMER_NM, DELIV_CUSTOMER_NM_KANA, DELIV_TEL_NO, DELIV_METHOD, DELIV_TYPE, DELIV_COMPANY, PAYMENT_METHOD, CARD_TYPE, TOTAL, TAX, CARRIAGE, COD, TOTAL_AMOUNT, COUPON_DISCOUNT, POINT_DISCOUNT, OTHER_DISCOUNT, AMOUNT_BILLED, MERGE_TOTAL, MERGE_CARRIAGE, MERGE_COD, MERGE_TAX, MERGE_AMOUNT_BILLED, MERGE_TOTAL_AMOUNT, MERGE_COUPON_DISCOUNT, MERGE_POINT_DISCOUNT, MERGE_OTHER_DISCOUNT, PACKING_QTY, SLIP_ITEM_NM1, SLIP_ITEM_NM2, SLIP_ITEM_NM3, SLIP_ITEM_NM4, SLIP_ITEM_NM5, SLIP_ITEM_CD1, SLIP_ITEM_CD2, FREIGHT_HANDLING1, FREIGHT_HANDLING2, ARTICLE, RECEIVE_ID, ERROR_FLG, ERROR_MESSAGE_CD, IMPORT_FLG, IMPORT_TYPE_ID, SHIPPING_INST_H_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     EC_ORDER_H_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     M_CENTER, M_CLIENT, M_IMPORT_TYPE, T_SHIPPING_INST_H, B_CLASS_DTL(ByDelivMatchFlg), T_EC_ORDER_R(AsOne)
 *
 * [referrer table]
 *     T_EC_ORDER_B, T_EC_ORDER_R
 *
 * [foreign property]
 *     mCenter, mClient, mImportType, tShippingInstH, bClassDtlByDelivMatchFlg, bClassDtlByErrorFlg, bClassDtlByGiftFlg, bClassDtlByImportFlg, bClassDtlByPriorityFlg, tEcOrderRAsOne
 *
 * [referrer property]
 *     tEcOrderBList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfTEcOrderH {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TEcOrderH> _selectedList;
    protected BehaviorSelector _selector;
    protected TEcOrderHBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTEcOrderH ready(List<TEcOrderH> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TEcOrderHBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TEcOrderHBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<TEcOrderB> _referrerTEcOrderBList;

    /**
     * Load referrer of TEcOrderBList by the set-upper of referrer. <br>
     * T_EC_ORDER_B by EC_ORDER_H_ID, named 'TEcOrderBList'.
     * <pre>
     * <span style="color: #0000C0">tEcOrderHBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">tEcOrderHList</span>, <span style="color: #553000">hLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hLoader</span>.<span style="color: #CC4747">loadTEcOrderBList</span>(<span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">bCB</span>.setupSelect...
     *         <span style="color: #553000">bCB</span>.query().set...
     *         <span style="color: #553000">bCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">bLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    bLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (TEcOrderH tEcOrderH : <span style="color: #553000">tEcOrderHList</span>) {
     *     ... = tEcOrderH.<span style="color: #CC4747">getTEcOrderBList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setEcOrderHId_InScope(pkList);
     * cb.query().addOrderBy_EcOrderHId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTEcOrderB> loadTEcOrderBList(ConditionBeanSetupper<TEcOrderBCB> refCBLambda) {
        myBhv().loadTEcOrderBList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTEcOrderBList = refLs);
        return hd -> hd.handle(new LoaderOfTEcOrderB().ready(_referrerTEcOrderBList, _selector));
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

    protected LoaderOfMImportType _foreignMImportTypeLoader;
    public LoaderOfMImportType pulloutMImportType() {
        if (_foreignMImportTypeLoader == null)
        { _foreignMImportTypeLoader = new LoaderOfMImportType().ready(myBhv().pulloutMImportType(_selectedList), _selector); }
        return _foreignMImportTypeLoader;
    }

    protected LoaderOfTShippingInstH _foreignTShippingInstHLoader;
    public LoaderOfTShippingInstH pulloutTShippingInstH() {
        if (_foreignTShippingInstHLoader == null)
        { _foreignTShippingInstHLoader = new LoaderOfTShippingInstH().ready(myBhv().pulloutTShippingInstH(_selectedList), _selector); }
        return _foreignTShippingInstHLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByDelivMatchFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByDelivMatchFlg() {
        if (_foreignBClassDtlByDelivMatchFlgLoader == null)
        { _foreignBClassDtlByDelivMatchFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByDelivMatchFlg(_selectedList), _selector); }
        return _foreignBClassDtlByDelivMatchFlgLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByErrorFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByErrorFlg() {
        if (_foreignBClassDtlByErrorFlgLoader == null)
        { _foreignBClassDtlByErrorFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByErrorFlg(_selectedList), _selector); }
        return _foreignBClassDtlByErrorFlgLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByGiftFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByGiftFlg() {
        if (_foreignBClassDtlByGiftFlgLoader == null)
        { _foreignBClassDtlByGiftFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByGiftFlg(_selectedList), _selector); }
        return _foreignBClassDtlByGiftFlgLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByImportFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByImportFlg() {
        if (_foreignBClassDtlByImportFlgLoader == null)
        { _foreignBClassDtlByImportFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByImportFlg(_selectedList), _selector); }
        return _foreignBClassDtlByImportFlgLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByPriorityFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByPriorityFlg() {
        if (_foreignBClassDtlByPriorityFlgLoader == null)
        { _foreignBClassDtlByPriorityFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByPriorityFlg(_selectedList), _selector); }
        return _foreignBClassDtlByPriorityFlgLoader;
    }

    protected LoaderOfTEcOrderR _foreignTEcOrderRAsOneLoader;
    public LoaderOfTEcOrderR pulloutTEcOrderRAsOne() {
        if (_foreignTEcOrderRAsOneLoader == null)
        { _foreignTEcOrderRAsOneLoader = new LoaderOfTEcOrderR().ready(myBhv().pulloutTEcOrderRAsOne(_selectedList), _selector); }
        return _foreignTEcOrderRAsOneLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TEcOrderH> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
