package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.MParamCQ;

/**
 * The nest select set-upper of M_PARAM.
 * @author DBFlute(AutoGenerator)
 */
public class MParamNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final MParamCQ _query;
    public MParamNss(MParamCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * M_CLIENT_CENTER by my CLIENT_CENTER_ID, named 'MClientCenter'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MClientCenterNss withMClientCenter() {
        _query.xdoNss(() -> _query.queryMClientCenter());
        return new MClientCenterNss(_query.queryMClientCenter());
    }
    /**
     * With nested relation columns to select clause. <br>
     * M_BOX by my DEFAULT_BOX_ID, named 'MBox'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MBoxNss withMBox() {
        _query.xdoNss(() -> _query.queryMBox());
        return new MBoxNss(_query.queryMBox());
    }
    /**
     * With nested relation columns to select clause. <br>
     * M_DELIVERY_COURSE by my DELIVERY_COURSE_ID, named 'MDeliveryCourse'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MDeliveryCourseNss withMDeliveryCourse() {
        _query.xdoNss(() -> _query.queryMDeliveryCourse());
        return new MDeliveryCourseNss(_query.queryMDeliveryCourse());
    }
    /**
     * With nested relation columns to select clause. <br>
     * M_ZONE by my EM_REPLENISH_ZONE_ID, named 'MZone'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MZoneNss withMZone() {
        _query.xdoNss(() -> _query.queryMZone());
        return new MZoneNss(_query.queryMZone());
    }
    /**
     * With nested relation columns to select clause. <br>
     * M_BOX_GRP by my PACKING_BOX_GROUP_ID, named 'MBoxGrp'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MBoxGrpNss withMBoxGrp() {
        _query.xdoNss(() -> _query.queryMBoxGrp());
        return new MBoxGrpNss(_query.queryMBoxGrp());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my AFTER_TAG_OUT_FLG, named 'BClassDtlByAfterTagOutFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByAfterTagOutFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlByAfterTagOutFlg());
        return new BClassDtlNss(_query.queryBClassDtlByAfterTagOutFlg());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my AFTER_DELIV_SLIP_OUT_FLG, named 'BClassDtlByAfterDelivSlipOutFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByAfterDelivSlipOutFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlByAfterDelivSlipOutFlg());
        return new BClassDtlNss(_query.queryBClassDtlByAfterDelivSlipOutFlg());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my AFTER_DELIV_SLIP_OUT_TGT, named 'BClassDtlByAfterDelivSlipOutTgt'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByAfterDelivSlipOutTgt() {
        _query.xdoNss(() -> _query.queryBClassDtlByAfterDelivSlipOutTgt());
        return new BClassDtlNss(_query.queryBClassDtlByAfterDelivSlipOutTgt());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my SGL_ROW_INSP_AFTER_OUT_CLS, named 'BClassDtlBySglRowInspAfterOutCls'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlBySglRowInspAfterOutCls() {
        _query.xdoNss(() -> _query.queryBClassDtlBySglRowInspAfterOutCls());
        return new BClassDtlNss(_query.queryBClassDtlBySglRowInspAfterOutCls());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my BOX_SELECT_SKIP, named 'BClassDtlByBoxSelectSkip'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByBoxSelectSkip() {
        _query.xdoNss(() -> _query.queryBClassDtlByBoxSelectSkip());
        return new BClassDtlNss(_query.queryBClassDtlByBoxSelectSkip());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my CASE_PIC_FLG, named 'BClassDtlByCasePicFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByCasePicFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlByCasePicFlg());
        return new BClassDtlNss(_query.queryBClassDtlByCasePicFlg());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my DEL_FLG, named 'BClassDtlByDelFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByDelFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlByDelFlg());
        return new BClassDtlNss(_query.queryBClassDtlByDelFlg());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my HT_CHAR_READ_FLG, named 'BClassDtlByHtCharReadFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByHtCharReadFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlByHtCharReadFlg());
        return new BClassDtlNss(_query.queryBClassDtlByHtCharReadFlg());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my MERGE_CLS, named 'BClassDtlByMergeCls'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByMergeCls() {
        _query.xdoNss(() -> _query.queryBClassDtlByMergeCls());
        return new BClassDtlNss(_query.queryBClassDtlByMergeCls());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my MULTI_PIC_CLS, named 'BClassDtlByMultiPicCls'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByMultiPicCls() {
        _query.xdoNss(() -> _query.queryBClassDtlByMultiPicCls());
        return new BClassDtlNss(_query.queryBClassDtlByMultiPicCls());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my OVER_STORE_NUM_FLG, named 'BClassDtlByOverStoreNumFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByOverStoreNumFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlByOverStoreNumFlg());
        return new BClassDtlNss(_query.queryBClassDtlByOverStoreNumFlg());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my PACKING_CAL_CLS, named 'BClassDtlByPackingCalCls'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByPackingCalCls() {
        _query.xdoNss(() -> _query.queryBClassDtlByPackingCalCls());
        return new BClassDtlNss(_query.queryBClassDtlByPackingCalCls());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my PACKING_PROCESS_CLS, named 'BClassDtlByPackingProcessCls'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByPackingProcessCls() {
        _query.xdoNss(() -> _query.queryBClassDtlByPackingProcessCls());
        return new BClassDtlNss(_query.queryBClassDtlByPackingProcessCls());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my PAST_STORE_DT_FLG, named 'BClassDtlByPastStoreDtFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByPastStoreDtFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlByPastStoreDtFlg());
        return new BClassDtlNss(_query.queryBClassDtlByPastStoreDtFlg());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my PRODUCT_LABEL_JAN_BARCODE, named 'BClassDtlByProductLabelJanBarcode'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByProductLabelJanBarcode() {
        _query.xdoNss(() -> _query.queryBClassDtlByProductLabelJanBarcode());
        return new BClassDtlNss(_query.queryBClassDtlByProductLabelJanBarcode());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my PRODUCT_LABEL_OUT_UNIT, named 'BClassDtlByProductLabelOutUnit'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByProductLabelOutUnit() {
        _query.xdoNss(() -> _query.queryBClassDtlByProductLabelOutUnit());
        return new BClassDtlNss(_query.queryBClassDtlByProductLabelOutUnit());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my PRODUCT_LABEL_PROD_BARCODE, named 'BClassDtlByProductLabelProdBarcode'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByProductLabelProdBarcode() {
        _query.xdoNss(() -> _query.queryBClassDtlByProductLabelProdBarcode());
        return new BClassDtlNss(_query.queryBClassDtlByProductLabelProdBarcode());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my PRODUCT_PART_PACKING, named 'BClassDtlByProductPartPacking'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByProductPartPacking() {
        _query.xdoNss(() -> _query.queryBClassDtlByProductPartPacking());
        return new BClassDtlNss(_query.queryBClassDtlByProductPartPacking());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my DECIMAL_PRODUCT_PACKING, named 'BClassDtlByDecimalProductPacking'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByDecimalProductPacking() {
        _query.xdoNss(() -> _query.queryBClassDtlByDecimalProductPacking());
        return new BClassDtlNss(_query.queryBClassDtlByDecimalProductPacking());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my EM_REPLENISH_ALLOC_CLS, named 'BClassDtlByEmReplenishAllocCls'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByEmReplenishAllocCls() {
        _query.xdoNss(() -> _query.queryBClassDtlByEmReplenishAllocCls());
        return new BClassDtlNss(_query.queryBClassDtlByEmReplenishAllocCls());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my RG_REPLENISH_UNIT_CLS, named 'BClassDtlByRgReplenishUnitCls'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByRgReplenishUnitCls() {
        _query.xdoNss(() -> _query.queryBClassDtlByRgReplenishUnitCls());
        return new BClassDtlNss(_query.queryBClassDtlByRgReplenishUnitCls());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my EM_REPLENISH_UNIT_CLS, named 'BClassDtlByEmReplenishUnitCls'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByEmReplenishUnitCls() {
        _query.xdoNss(() -> _query.queryBClassDtlByEmReplenishUnitCls());
        return new BClassDtlNss(_query.queryBClassDtlByEmReplenishUnitCls());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my RESULT_AFTER_PRODUCT_LABEL, named 'BClassDtlByResultAfterProductLabel'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByResultAfterProductLabel() {
        _query.xdoNss(() -> _query.queryBClassDtlByResultAfterProductLabel());
        return new BClassDtlNss(_query.queryBClassDtlByResultAfterProductLabel());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my RESULT_AFTER_PRODUCT_TARGET, named 'BClassDtlByResultAfterProductTarget'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByResultAfterProductTarget() {
        _query.xdoNss(() -> _query.queryBClassDtlByResultAfterProductTarget());
        return new BClassDtlNss(_query.queryBClassDtlByResultAfterProductTarget());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my STORE_DT_FLG, named 'BClassDtlByStoreDtFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByStoreDtFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlByStoreDtFlg());
        return new BClassDtlNss(_query.queryBClassDtlByStoreDtFlg());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my STORE_NO_FLG, named 'BClassDtlByStoreNoFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByStoreNoFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlByStoreNoFlg());
        return new BClassDtlNss(_query.queryBClassDtlByStoreNoFlg());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my TAG_DELIVERY_OUT_FLG, named 'BClassDtlByTagDeliveryOutFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByTagDeliveryOutFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlByTagDeliveryOutFlg());
        return new BClassDtlNss(_query.queryBClassDtlByTagDeliveryOutFlg());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my USE_HT_SHIP_FLG, named 'BClassDtlByUseHtShipFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByUseHtShipFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlByUseHtShipFlg());
        return new BClassDtlNss(_query.queryBClassDtlByUseHtShipFlg());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my INSPECTION_LABEL_OUT_FLG, named 'BClassDtlByInspectionLabelOutFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByInspectionLabelOutFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlByInspectionLabelOutFlg());
        return new BClassDtlNss(_query.queryBClassDtlByInspectionLabelOutFlg());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my SGL_ROW_PIC_FLG, named 'BClassDtlBySglRowPicFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlBySglRowPicFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlBySglRowPicFlg());
        return new BClassDtlNss(_query.queryBClassDtlBySglRowPicFlg());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my TOTAL_PIC_FLG, named 'BClassDtlByTotalPicFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByTotalPicFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlByTotalPicFlg());
        return new BClassDtlNss(_query.queryBClassDtlByTotalPicFlg());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my PIC_MTHD_RCMD_FLG, named 'BClassDtlByPicMthdRcmdFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByPicMthdRcmdFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlByPicMthdRcmdFlg());
        return new BClassDtlNss(_query.queryBClassDtlByPicMthdRcmdFlg());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my PIC_MTHD_RCMD_BREAK_KEY, named 'BClassDtlByPicMthdRcmdBreakKey'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByPicMthdRcmdBreakKey() {
        _query.xdoNss(() -> _query.queryBClassDtlByPicMthdRcmdBreakKey());
        return new BClassDtlNss(_query.queryBClassDtlByPicMthdRcmdBreakKey());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my AUTO_SHIP_INST_FLG, named 'BClassDtlByAutoShipInstFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByAutoShipInstFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlByAutoShipInstFlg());
        return new BClassDtlNss(_query.queryBClassDtlByAutoShipInstFlg());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my STOCK_OUT_AUTO_INST_FLG, named 'BClassDtlByStockOutAutoInstFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByStockOutAutoInstFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlByStockOutAutoInstFlg());
        return new BClassDtlNss(_query.queryBClassDtlByStockOutAutoInstFlg());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my AUTO_EMG_SET_FLG, named 'BClassDtlByAutoEmgSetFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByAutoEmgSetFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlByAutoEmgSetFlg());
        return new BClassDtlNss(_query.queryBClassDtlByAutoEmgSetFlg());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my AUTO_EMG_SET_TGT, named 'BClassDtlByAutoEmgSetTgt'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByAutoEmgSetTgt() {
        _query.xdoNss(() -> _query.queryBClassDtlByAutoEmgSetTgt());
        return new BClassDtlNss(_query.queryBClassDtlByAutoEmgSetTgt());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my STOCK_OUT_ALLOC_CLS, named 'BClassDtlByStockOutAllocCls'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByStockOutAllocCls() {
        _query.xdoNss(() -> _query.queryBClassDtlByStockOutAllocCls());
        return new BClassDtlNss(_query.queryBClassDtlByStockOutAllocCls());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my STOCK_OUT_INST_CXL_FLG, named 'BClassDtlByStockOutInstCxlFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByStockOutInstCxlFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlByStockOutInstCxlFlg());
        return new BClassDtlNss(_query.queryBClassDtlByStockOutInstCxlFlg());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my STOCK_OUT_INST_SPLIT_FLG, named 'BClassDtlByStockOutInstSplitFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByStockOutInstSplitFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlByStockOutInstSplitFlg());
        return new BClassDtlNss(_query.queryBClassDtlByStockOutInstSplitFlg());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my PIC_MTHD_RCMD_MLT_PL_OUT, named 'BClassDtlByPicMthdRcmdMltPlOut'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByPicMthdRcmdMltPlOut() {
        _query.xdoNss(() -> _query.queryBClassDtlByPicMthdRcmdMltPlOut());
        return new BClassDtlNss(_query.queryBClassDtlByPicMthdRcmdMltPlOut());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my PIC_MTHD_RCMD_SPL_SL_OUT, named 'BClassDtlByPicMthdRcmdSplSlOut'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByPicMthdRcmdSplSlOut() {
        _query.xdoNss(() -> _query.queryBClassDtlByPicMthdRcmdSplSlOut());
        return new BClassDtlNss(_query.queryBClassDtlByPicMthdRcmdSplSlOut());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my ERROR_SOUND_PLAY_FLG, named 'BClassDtlByErrorSoundPlayFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByErrorSoundPlayFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlByErrorSoundPlayFlg());
        return new BClassDtlNss(_query.queryBClassDtlByErrorSoundPlayFlg());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my WARN_SOUND_PLAY_FLG, named 'BClassDtlByWarnSoundPlayFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByWarnSoundPlayFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlByWarnSoundPlayFlg());
        return new BClassDtlNss(_query.queryBClassDtlByWarnSoundPlayFlg());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my INSP_SOUND_PLAY_FLG, named 'BClassDtlByInspSoundPlayFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByInspSoundPlayFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlByInspSoundPlayFlg());
        return new BClassDtlNss(_query.queryBClassDtlByInspSoundPlayFlg());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my INSP_COMP_SOUND_PLAY_FLG, named 'BClassDtlByInspCompSoundPlayFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByInspCompSoundPlayFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlByInspCompSoundPlayFlg());
        return new BClassDtlNss(_query.queryBClassDtlByInspCompSoundPlayFlg());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my CES_INTEGRATION_FLG, named 'BClassDtlByCesIntegrationFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByCesIntegrationFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlByCesIntegrationFlg());
        return new BClassDtlNss(_query.queryBClassDtlByCesIntegrationFlg());
    }
    /**
     * With nested relation columns to select clause. <br>
     * B_CLASS_DTL by my PACKING_SLIP_AUTO_OUTPUT_FLG, named 'BClassDtlByPackingSlipAutoOutputFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByPackingSlipAutoOutputFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlByPackingSlipAutoOutputFlg());
        return new BClassDtlNss(_query.queryBClassDtlByPackingSlipAutoOutputFlg());
    }
}
