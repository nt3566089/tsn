package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of E_BONDED_SHIPPING_PLAN_BULK_INPUT as TABLE. <br>
 * <pre>
 * [primary key]
 *     BONDED_SHIPPING_PLAN_BULK_INPUT_ID
 *
 * [column]
 *     BONDED_SHIPPING_PLAN_BULK_INPUT_ID, RECEIVE_CD, RECEIVE_ROW_ID, IMPORT_FLG, ERROR_FLG, ERROR_MESSAGE_CD, SBWAREHOUSECD, CUSTORDERNO, ORDERTYPE, SHIPCD, CarryoutPlanCd, ShipToCd, ShipToNm, ReceivePlanYm, ShTypeCd, ShTypeNm, Refno, PickingComment, PhoneNo, BATJMfYm, RmaNo, OwnerOrderNo, PalletNo, PRODUCT_CD, DesignCd, ManufactureYm, FirmcarryNo, Qty, InOutKbn, StockType, CustomsReleaseDate, SupplierCvNo, IfItemCd, SendFlg, PalletOrder, PalletType, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     BONDED_SHIPPING_PLAN_BULK_INPUT_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfEBondedShippingPlanBulkInput {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<EBondedShippingPlanBulkInput> _selectedList;
    protected BehaviorSelector _selector;
    protected EBondedShippingPlanBulkInputBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfEBondedShippingPlanBulkInput ready(List<EBondedShippingPlanBulkInput> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected EBondedShippingPlanBulkInputBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(EBondedShippingPlanBulkInputBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<EBondedShippingPlanBulkInput> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
