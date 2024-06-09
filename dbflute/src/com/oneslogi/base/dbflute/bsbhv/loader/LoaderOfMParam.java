package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of M_PARAM as TABLE. <br>
 * <pre>
 * [primary key]
 *     CLIENT_CENTER_ID
 *
 * [column]
 *     CLIENT_CENTER_ID, DELIVERY_COURSE_ID, STORE_DT_FLG, STORE_NO_FLG, MERGE_CLS, T_KEEPING_DAYS, H_KEEPING_DAYS, D_KEEPING_DAYS, OVER_STORE_NUM_FLG, PAST_STORE_DT_FLG, USE_HT_SHIP_FLG, ALLOC_SORT_KEY, RG_REPLENISH_UNIT_CLS, EM_REPLENISH_UNIT_CLS, EM_REPLENISH_ZONE_ID, EM_REPLENISH_ALLOC_CLS, PACKING_CAL_CLS, PACKING_PROCESS_CLS, PRODUCT_PART_PACKING, DECIMAL_PRODUCT_PACKING, PACKING_BOX_GROUP_ID, TOTAL_PIC_FLG, MULTI_PIC_CLS, BACKET_COL_NUM, BACKET_ROW_NUM, CASE_PIC_FLG, SGL_ROW_PIC_FLG, SGL_ROW_PIC_MAX_INST_NUM, PIC_MTHD_RCMD_FLG, PIC_MTHD_RCMD_BREAK_KEY, PIC_MTHD_RCMD_API_KEY, PIC_MTHD_RCMD_MLT_PL_OUT, PIC_MTHD_RCMD_SPL_SL_OUT, PRODUCT_LABEL_OUT_UNIT, RESULT_AFTER_PRODUCT_LABEL, RESULT_AFTER_PRODUCT_TARGET, PRODUCT_LABEL_JAN_BARCODE, PRODUCT_LABEL_PROD_BARCODE, PRODUCT_LABEL_JAN_STARTBIT, PRODUCT_LABEL_JAN_ENDBIT, PRODUCT_LABEL_PROD_STARTBIT, PRODUCT_LABEL_PROD_ENDBIT, BOX_SELECT_SKIP, DEFAULT_BOX_ID, ERROR_SOUND_PLAY_FLG, WARN_SOUND_PLAY_FLG, INSP_SOUND_PLAY_FLG, INSP_COMP_SOUND_PLAY_FLG, AFTER_TAG_OUT_FLG, TAG_DELIVERY_OUT_FLG, AFTER_DELIV_SLIP_OUT_FLG, AFTER_DELIV_SLIP_OUT_TGT, SGL_ROW_INSP_AFTER_OUT_CLS, HT_CHAR_READ_FLG, HT_LOT_INPUT_TYPE, HT_SERIAL_INPUT_TYPE, INSPECTION_LABEL_OUT_FLG, AUTO_SHIP_INST_FLG, STOCK_OUT_AUTO_INST_FLG, AUTO_EMG_SET_FLG, AUTO_EMG_SET_TGT, AUTO_EMG_SET_MINUTE, STOCK_OUT_INST_CXL_FLG, STOCK_OUT_ALLOC_CLS, STOCK_OUT_INST_SPLIT_FLG, CES_INTEGRATION_FLG, PACKING_SLIP_AUTO_OUTPUT_FLG, CENTER_KBN, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     CLIENT_CENTER_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     M_CLIENT_CENTER, M_BOX, M_DELIVERY_COURSE, M_ZONE, M_BOX_GRP, B_CLASS_DTL(ByAfterTagOutFlg)
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     mClientCenter, mBox, mDeliveryCourse, mZone, mBoxGrp, bClassDtlByAfterTagOutFlg, bClassDtlByAfterDelivSlipOutFlg, bClassDtlByAfterDelivSlipOutTgt, bClassDtlBySglRowInspAfterOutCls, bClassDtlByBoxSelectSkip, bClassDtlByCasePicFlg, bClassDtlByDelFlg, bClassDtlByHtCharReadFlg, bClassDtlByMergeCls, bClassDtlByMultiPicCls, bClassDtlByOverStoreNumFlg, bClassDtlByPackingCalCls, bClassDtlByPackingProcessCls, bClassDtlByPastStoreDtFlg, bClassDtlByProductLabelJanBarcode, bClassDtlByProductLabelOutUnit, bClassDtlByProductLabelProdBarcode, bClassDtlByProductPartPacking, bClassDtlByDecimalProductPacking, bClassDtlByEmReplenishAllocCls, bClassDtlByRgReplenishUnitCls, bClassDtlByEmReplenishUnitCls, bClassDtlByResultAfterProductLabel, bClassDtlByResultAfterProductTarget, bClassDtlByStoreDtFlg, bClassDtlByStoreNoFlg, bClassDtlByTagDeliveryOutFlg, bClassDtlByUseHtShipFlg, bClassDtlByInspectionLabelOutFlg, bClassDtlBySglRowPicFlg, bClassDtlByTotalPicFlg, bClassDtlByPicMthdRcmdFlg, bClassDtlByPicMthdRcmdBreakKey, bClassDtlByAutoShipInstFlg, bClassDtlByStockOutAutoInstFlg, bClassDtlByAutoEmgSetFlg, bClassDtlByAutoEmgSetTgt, bClassDtlByStockOutAllocCls, bClassDtlByStockOutInstCxlFlg, bClassDtlByStockOutInstSplitFlg, bClassDtlByPicMthdRcmdMltPlOut, bClassDtlByPicMthdRcmdSplSlOut, bClassDtlByErrorSoundPlayFlg, bClassDtlByWarnSoundPlayFlg, bClassDtlByInspSoundPlayFlg, bClassDtlByInspCompSoundPlayFlg, bClassDtlByCesIntegrationFlg, bClassDtlByPackingSlipAutoOutputFlg
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfMParam {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<MParam> _selectedList;
    protected BehaviorSelector _selector;
    protected MParamBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfMParam ready(List<MParam> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected MParamBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(MParamBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfMClientCenter _foreignMClientCenterLoader;
    public LoaderOfMClientCenter pulloutMClientCenter() {
        if (_foreignMClientCenterLoader == null)
        { _foreignMClientCenterLoader = new LoaderOfMClientCenter().ready(myBhv().pulloutMClientCenter(_selectedList), _selector); }
        return _foreignMClientCenterLoader;
    }

    protected LoaderOfMBox _foreignMBoxLoader;
    public LoaderOfMBox pulloutMBox() {
        if (_foreignMBoxLoader == null)
        { _foreignMBoxLoader = new LoaderOfMBox().ready(myBhv().pulloutMBox(_selectedList), _selector); }
        return _foreignMBoxLoader;
    }

    protected LoaderOfMDeliveryCourse _foreignMDeliveryCourseLoader;
    public LoaderOfMDeliveryCourse pulloutMDeliveryCourse() {
        if (_foreignMDeliveryCourseLoader == null)
        { _foreignMDeliveryCourseLoader = new LoaderOfMDeliveryCourse().ready(myBhv().pulloutMDeliveryCourse(_selectedList), _selector); }
        return _foreignMDeliveryCourseLoader;
    }

    protected LoaderOfMZone _foreignMZoneLoader;
    public LoaderOfMZone pulloutMZone() {
        if (_foreignMZoneLoader == null)
        { _foreignMZoneLoader = new LoaderOfMZone().ready(myBhv().pulloutMZone(_selectedList), _selector); }
        return _foreignMZoneLoader;
    }

    protected LoaderOfMBoxGrp _foreignMBoxGrpLoader;
    public LoaderOfMBoxGrp pulloutMBoxGrp() {
        if (_foreignMBoxGrpLoader == null)
        { _foreignMBoxGrpLoader = new LoaderOfMBoxGrp().ready(myBhv().pulloutMBoxGrp(_selectedList), _selector); }
        return _foreignMBoxGrpLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByAfterTagOutFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByAfterTagOutFlg() {
        if (_foreignBClassDtlByAfterTagOutFlgLoader == null)
        { _foreignBClassDtlByAfterTagOutFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByAfterTagOutFlg(_selectedList), _selector); }
        return _foreignBClassDtlByAfterTagOutFlgLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByAfterDelivSlipOutFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByAfterDelivSlipOutFlg() {
        if (_foreignBClassDtlByAfterDelivSlipOutFlgLoader == null)
        { _foreignBClassDtlByAfterDelivSlipOutFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByAfterDelivSlipOutFlg(_selectedList), _selector); }
        return _foreignBClassDtlByAfterDelivSlipOutFlgLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByAfterDelivSlipOutTgtLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByAfterDelivSlipOutTgt() {
        if (_foreignBClassDtlByAfterDelivSlipOutTgtLoader == null)
        { _foreignBClassDtlByAfterDelivSlipOutTgtLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByAfterDelivSlipOutTgt(_selectedList), _selector); }
        return _foreignBClassDtlByAfterDelivSlipOutTgtLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlBySglRowInspAfterOutClsLoader;
    public LoaderOfBClassDtl pulloutBClassDtlBySglRowInspAfterOutCls() {
        if (_foreignBClassDtlBySglRowInspAfterOutClsLoader == null)
        { _foreignBClassDtlBySglRowInspAfterOutClsLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlBySglRowInspAfterOutCls(_selectedList), _selector); }
        return _foreignBClassDtlBySglRowInspAfterOutClsLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByBoxSelectSkipLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByBoxSelectSkip() {
        if (_foreignBClassDtlByBoxSelectSkipLoader == null)
        { _foreignBClassDtlByBoxSelectSkipLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByBoxSelectSkip(_selectedList), _selector); }
        return _foreignBClassDtlByBoxSelectSkipLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByCasePicFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByCasePicFlg() {
        if (_foreignBClassDtlByCasePicFlgLoader == null)
        { _foreignBClassDtlByCasePicFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByCasePicFlg(_selectedList), _selector); }
        return _foreignBClassDtlByCasePicFlgLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByDelFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByDelFlg() {
        if (_foreignBClassDtlByDelFlgLoader == null)
        { _foreignBClassDtlByDelFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByDelFlg(_selectedList), _selector); }
        return _foreignBClassDtlByDelFlgLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByHtCharReadFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByHtCharReadFlg() {
        if (_foreignBClassDtlByHtCharReadFlgLoader == null)
        { _foreignBClassDtlByHtCharReadFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByHtCharReadFlg(_selectedList), _selector); }
        return _foreignBClassDtlByHtCharReadFlgLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByMergeClsLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByMergeCls() {
        if (_foreignBClassDtlByMergeClsLoader == null)
        { _foreignBClassDtlByMergeClsLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByMergeCls(_selectedList), _selector); }
        return _foreignBClassDtlByMergeClsLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByMultiPicClsLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByMultiPicCls() {
        if (_foreignBClassDtlByMultiPicClsLoader == null)
        { _foreignBClassDtlByMultiPicClsLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByMultiPicCls(_selectedList), _selector); }
        return _foreignBClassDtlByMultiPicClsLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByOverStoreNumFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByOverStoreNumFlg() {
        if (_foreignBClassDtlByOverStoreNumFlgLoader == null)
        { _foreignBClassDtlByOverStoreNumFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByOverStoreNumFlg(_selectedList), _selector); }
        return _foreignBClassDtlByOverStoreNumFlgLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByPackingCalClsLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByPackingCalCls() {
        if (_foreignBClassDtlByPackingCalClsLoader == null)
        { _foreignBClassDtlByPackingCalClsLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByPackingCalCls(_selectedList), _selector); }
        return _foreignBClassDtlByPackingCalClsLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByPackingProcessClsLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByPackingProcessCls() {
        if (_foreignBClassDtlByPackingProcessClsLoader == null)
        { _foreignBClassDtlByPackingProcessClsLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByPackingProcessCls(_selectedList), _selector); }
        return _foreignBClassDtlByPackingProcessClsLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByPastStoreDtFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByPastStoreDtFlg() {
        if (_foreignBClassDtlByPastStoreDtFlgLoader == null)
        { _foreignBClassDtlByPastStoreDtFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByPastStoreDtFlg(_selectedList), _selector); }
        return _foreignBClassDtlByPastStoreDtFlgLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByProductLabelJanBarcodeLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByProductLabelJanBarcode() {
        if (_foreignBClassDtlByProductLabelJanBarcodeLoader == null)
        { _foreignBClassDtlByProductLabelJanBarcodeLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByProductLabelJanBarcode(_selectedList), _selector); }
        return _foreignBClassDtlByProductLabelJanBarcodeLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByProductLabelOutUnitLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByProductLabelOutUnit() {
        if (_foreignBClassDtlByProductLabelOutUnitLoader == null)
        { _foreignBClassDtlByProductLabelOutUnitLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByProductLabelOutUnit(_selectedList), _selector); }
        return _foreignBClassDtlByProductLabelOutUnitLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByProductLabelProdBarcodeLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByProductLabelProdBarcode() {
        if (_foreignBClassDtlByProductLabelProdBarcodeLoader == null)
        { _foreignBClassDtlByProductLabelProdBarcodeLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByProductLabelProdBarcode(_selectedList), _selector); }
        return _foreignBClassDtlByProductLabelProdBarcodeLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByProductPartPackingLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByProductPartPacking() {
        if (_foreignBClassDtlByProductPartPackingLoader == null)
        { _foreignBClassDtlByProductPartPackingLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByProductPartPacking(_selectedList), _selector); }
        return _foreignBClassDtlByProductPartPackingLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByDecimalProductPackingLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByDecimalProductPacking() {
        if (_foreignBClassDtlByDecimalProductPackingLoader == null)
        { _foreignBClassDtlByDecimalProductPackingLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByDecimalProductPacking(_selectedList), _selector); }
        return _foreignBClassDtlByDecimalProductPackingLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByEmReplenishAllocClsLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByEmReplenishAllocCls() {
        if (_foreignBClassDtlByEmReplenishAllocClsLoader == null)
        { _foreignBClassDtlByEmReplenishAllocClsLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByEmReplenishAllocCls(_selectedList), _selector); }
        return _foreignBClassDtlByEmReplenishAllocClsLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByRgReplenishUnitClsLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByRgReplenishUnitCls() {
        if (_foreignBClassDtlByRgReplenishUnitClsLoader == null)
        { _foreignBClassDtlByRgReplenishUnitClsLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByRgReplenishUnitCls(_selectedList), _selector); }
        return _foreignBClassDtlByRgReplenishUnitClsLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByEmReplenishUnitClsLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByEmReplenishUnitCls() {
        if (_foreignBClassDtlByEmReplenishUnitClsLoader == null)
        { _foreignBClassDtlByEmReplenishUnitClsLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByEmReplenishUnitCls(_selectedList), _selector); }
        return _foreignBClassDtlByEmReplenishUnitClsLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByResultAfterProductLabelLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByResultAfterProductLabel() {
        if (_foreignBClassDtlByResultAfterProductLabelLoader == null)
        { _foreignBClassDtlByResultAfterProductLabelLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByResultAfterProductLabel(_selectedList), _selector); }
        return _foreignBClassDtlByResultAfterProductLabelLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByResultAfterProductTargetLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByResultAfterProductTarget() {
        if (_foreignBClassDtlByResultAfterProductTargetLoader == null)
        { _foreignBClassDtlByResultAfterProductTargetLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByResultAfterProductTarget(_selectedList), _selector); }
        return _foreignBClassDtlByResultAfterProductTargetLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByStoreDtFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByStoreDtFlg() {
        if (_foreignBClassDtlByStoreDtFlgLoader == null)
        { _foreignBClassDtlByStoreDtFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByStoreDtFlg(_selectedList), _selector); }
        return _foreignBClassDtlByStoreDtFlgLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByStoreNoFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByStoreNoFlg() {
        if (_foreignBClassDtlByStoreNoFlgLoader == null)
        { _foreignBClassDtlByStoreNoFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByStoreNoFlg(_selectedList), _selector); }
        return _foreignBClassDtlByStoreNoFlgLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByTagDeliveryOutFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByTagDeliveryOutFlg() {
        if (_foreignBClassDtlByTagDeliveryOutFlgLoader == null)
        { _foreignBClassDtlByTagDeliveryOutFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByTagDeliveryOutFlg(_selectedList), _selector); }
        return _foreignBClassDtlByTagDeliveryOutFlgLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByUseHtShipFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByUseHtShipFlg() {
        if (_foreignBClassDtlByUseHtShipFlgLoader == null)
        { _foreignBClassDtlByUseHtShipFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByUseHtShipFlg(_selectedList), _selector); }
        return _foreignBClassDtlByUseHtShipFlgLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByInspectionLabelOutFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByInspectionLabelOutFlg() {
        if (_foreignBClassDtlByInspectionLabelOutFlgLoader == null)
        { _foreignBClassDtlByInspectionLabelOutFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByInspectionLabelOutFlg(_selectedList), _selector); }
        return _foreignBClassDtlByInspectionLabelOutFlgLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlBySglRowPicFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlBySglRowPicFlg() {
        if (_foreignBClassDtlBySglRowPicFlgLoader == null)
        { _foreignBClassDtlBySglRowPicFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlBySglRowPicFlg(_selectedList), _selector); }
        return _foreignBClassDtlBySglRowPicFlgLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByTotalPicFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByTotalPicFlg() {
        if (_foreignBClassDtlByTotalPicFlgLoader == null)
        { _foreignBClassDtlByTotalPicFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByTotalPicFlg(_selectedList), _selector); }
        return _foreignBClassDtlByTotalPicFlgLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByPicMthdRcmdFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByPicMthdRcmdFlg() {
        if (_foreignBClassDtlByPicMthdRcmdFlgLoader == null)
        { _foreignBClassDtlByPicMthdRcmdFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByPicMthdRcmdFlg(_selectedList), _selector); }
        return _foreignBClassDtlByPicMthdRcmdFlgLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByPicMthdRcmdBreakKeyLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByPicMthdRcmdBreakKey() {
        if (_foreignBClassDtlByPicMthdRcmdBreakKeyLoader == null)
        { _foreignBClassDtlByPicMthdRcmdBreakKeyLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByPicMthdRcmdBreakKey(_selectedList), _selector); }
        return _foreignBClassDtlByPicMthdRcmdBreakKeyLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByAutoShipInstFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByAutoShipInstFlg() {
        if (_foreignBClassDtlByAutoShipInstFlgLoader == null)
        { _foreignBClassDtlByAutoShipInstFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByAutoShipInstFlg(_selectedList), _selector); }
        return _foreignBClassDtlByAutoShipInstFlgLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByStockOutAutoInstFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByStockOutAutoInstFlg() {
        if (_foreignBClassDtlByStockOutAutoInstFlgLoader == null)
        { _foreignBClassDtlByStockOutAutoInstFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByStockOutAutoInstFlg(_selectedList), _selector); }
        return _foreignBClassDtlByStockOutAutoInstFlgLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByAutoEmgSetFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByAutoEmgSetFlg() {
        if (_foreignBClassDtlByAutoEmgSetFlgLoader == null)
        { _foreignBClassDtlByAutoEmgSetFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByAutoEmgSetFlg(_selectedList), _selector); }
        return _foreignBClassDtlByAutoEmgSetFlgLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByAutoEmgSetTgtLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByAutoEmgSetTgt() {
        if (_foreignBClassDtlByAutoEmgSetTgtLoader == null)
        { _foreignBClassDtlByAutoEmgSetTgtLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByAutoEmgSetTgt(_selectedList), _selector); }
        return _foreignBClassDtlByAutoEmgSetTgtLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByStockOutAllocClsLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByStockOutAllocCls() {
        if (_foreignBClassDtlByStockOutAllocClsLoader == null)
        { _foreignBClassDtlByStockOutAllocClsLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByStockOutAllocCls(_selectedList), _selector); }
        return _foreignBClassDtlByStockOutAllocClsLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByStockOutInstCxlFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByStockOutInstCxlFlg() {
        if (_foreignBClassDtlByStockOutInstCxlFlgLoader == null)
        { _foreignBClassDtlByStockOutInstCxlFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByStockOutInstCxlFlg(_selectedList), _selector); }
        return _foreignBClassDtlByStockOutInstCxlFlgLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByStockOutInstSplitFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByStockOutInstSplitFlg() {
        if (_foreignBClassDtlByStockOutInstSplitFlgLoader == null)
        { _foreignBClassDtlByStockOutInstSplitFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByStockOutInstSplitFlg(_selectedList), _selector); }
        return _foreignBClassDtlByStockOutInstSplitFlgLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByPicMthdRcmdMltPlOutLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByPicMthdRcmdMltPlOut() {
        if (_foreignBClassDtlByPicMthdRcmdMltPlOutLoader == null)
        { _foreignBClassDtlByPicMthdRcmdMltPlOutLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByPicMthdRcmdMltPlOut(_selectedList), _selector); }
        return _foreignBClassDtlByPicMthdRcmdMltPlOutLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByPicMthdRcmdSplSlOutLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByPicMthdRcmdSplSlOut() {
        if (_foreignBClassDtlByPicMthdRcmdSplSlOutLoader == null)
        { _foreignBClassDtlByPicMthdRcmdSplSlOutLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByPicMthdRcmdSplSlOut(_selectedList), _selector); }
        return _foreignBClassDtlByPicMthdRcmdSplSlOutLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByErrorSoundPlayFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByErrorSoundPlayFlg() {
        if (_foreignBClassDtlByErrorSoundPlayFlgLoader == null)
        { _foreignBClassDtlByErrorSoundPlayFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByErrorSoundPlayFlg(_selectedList), _selector); }
        return _foreignBClassDtlByErrorSoundPlayFlgLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByWarnSoundPlayFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByWarnSoundPlayFlg() {
        if (_foreignBClassDtlByWarnSoundPlayFlgLoader == null)
        { _foreignBClassDtlByWarnSoundPlayFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByWarnSoundPlayFlg(_selectedList), _selector); }
        return _foreignBClassDtlByWarnSoundPlayFlgLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByInspSoundPlayFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByInspSoundPlayFlg() {
        if (_foreignBClassDtlByInspSoundPlayFlgLoader == null)
        { _foreignBClassDtlByInspSoundPlayFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByInspSoundPlayFlg(_selectedList), _selector); }
        return _foreignBClassDtlByInspSoundPlayFlgLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByInspCompSoundPlayFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByInspCompSoundPlayFlg() {
        if (_foreignBClassDtlByInspCompSoundPlayFlgLoader == null)
        { _foreignBClassDtlByInspCompSoundPlayFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByInspCompSoundPlayFlg(_selectedList), _selector); }
        return _foreignBClassDtlByInspCompSoundPlayFlgLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByCesIntegrationFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByCesIntegrationFlg() {
        if (_foreignBClassDtlByCesIntegrationFlgLoader == null)
        { _foreignBClassDtlByCesIntegrationFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByCesIntegrationFlg(_selectedList), _selector); }
        return _foreignBClassDtlByCesIntegrationFlgLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByPackingSlipAutoOutputFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByPackingSlipAutoOutputFlg() {
        if (_foreignBClassDtlByPackingSlipAutoOutputFlgLoader == null)
        { _foreignBClassDtlByPackingSlipAutoOutputFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByPackingSlipAutoOutputFlg(_selectedList), _selector); }
        return _foreignBClassDtlByPackingSlipAutoOutputFlgLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<MParam> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
