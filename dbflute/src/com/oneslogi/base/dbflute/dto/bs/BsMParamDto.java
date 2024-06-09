package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of M_PARAM as TABLE. <br>
 * パラメータマスタ
 * <pre>
 * [primary-key]
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
 * [foreign-table]
 *     M_CLIENT_CENTER, M_BOX, M_DELIVERY_COURSE, M_ZONE, M_BOX_GRP, B_CLASS_DTL(ByAfterTagOutFlg)
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     mClientCenter, mBox, mDeliveryCourse, mZone, mBoxGrp, bClassDtlByAfterTagOutFlg, bClassDtlByAfterDelivSlipOutFlg, bClassDtlByAfterDelivSlipOutTgt, bClassDtlBySglRowInspAfterOutCls, bClassDtlByBoxSelectSkip, bClassDtlByCasePicFlg, bClassDtlByDelFlg, bClassDtlByHtCharReadFlg, bClassDtlByMergeCls, bClassDtlByMultiPicCls, bClassDtlByOverStoreNumFlg, bClassDtlByPackingCalCls, bClassDtlByPackingProcessCls, bClassDtlByPastStoreDtFlg, bClassDtlByProductLabelJanBarcode, bClassDtlByProductLabelOutUnit, bClassDtlByProductLabelProdBarcode, bClassDtlByProductPartPacking, bClassDtlByDecimalProductPacking, bClassDtlByEmReplenishAllocCls, bClassDtlByRgReplenishUnitCls, bClassDtlByEmReplenishUnitCls, bClassDtlByResultAfterProductLabel, bClassDtlByResultAfterProductTarget, bClassDtlByStoreDtFlg, bClassDtlByStoreNoFlg, bClassDtlByTagDeliveryOutFlg, bClassDtlByUseHtShipFlg, bClassDtlByInspectionLabelOutFlg, bClassDtlBySglRowPicFlg, bClassDtlByTotalPicFlg, bClassDtlByPicMthdRcmdFlg, bClassDtlByPicMthdRcmdBreakKey, bClassDtlByAutoShipInstFlg, bClassDtlByStockOutAutoInstFlg, bClassDtlByAutoEmgSetFlg, bClassDtlByAutoEmgSetTgt, bClassDtlByStockOutAllocCls, bClassDtlByStockOutInstCxlFlg, bClassDtlByStockOutInstSplitFlg, bClassDtlByPicMthdRcmdMltPlOut, bClassDtlByPicMthdRcmdSplSlOut, bClassDtlByErrorSoundPlayFlg, bClassDtlByWarnSoundPlayFlg, bClassDtlByInspSoundPlayFlg, bClassDtlByInspCompSoundPlayFlg, bClassDtlByCesIntegrationFlg, bClassDtlByPackingSlipAutoOutputFlg
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsMParamDto implements Serializable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                                Column
    //                                                ------
    /** CLIENT_CENTER_ID: {PK, ID, NotNull, bigint identity(19), FK to M_CLIENT_CENTER} */
    @JsonKey
    protected Long _clientCenterId;

    /** DELIVERY_COURSE_ID: {IX, bigint(19), FK to M_DELIVERY_COURSE} */
    @JsonKey
    protected Long _deliveryCourseId;

    /** STORE_DT_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=StoreDtFlg} */
    @JsonKey
    protected String _storeDtFlg;

    /** STORE_NO_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=StoreNoFlg} */
    @JsonKey
    protected String _storeNoFlg;

    /** MERGE_CLS: {NotNull, varchar(30), default=[02], FK to B_CLASS_DTL, classification=MergeCls} */
    @JsonKey
    protected String _mergeCls;

    /** T_KEEPING_DAYS: {NotNull, bigint(19), default=[(0)]} */
    @JsonKey
    protected Long _tKeepingDays;

    /** H_KEEPING_DAYS: {NotNull, bigint(19), default=[(0)]} */
    @JsonKey
    protected Long _hKeepingDays;

    /** D_KEEPING_DAYS: {NotNull, bigint(19), default=[(0)]} */
    @JsonKey
    protected Long _dKeepingDays;

    /** OVER_STORE_NUM_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=OverStoreNumFlg} */
    @JsonKey
    protected String _overStoreNumFlg;

    /** PAST_STORE_DT_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=PastStoreDtFlg} */
    @JsonKey
    protected String _pastStoreDtFlg;

    /** USE_HT_SHIP_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=UseHtShipFlg} */
    @JsonKey
    protected String _useHtShipFlg;

    /** ALLOC_SORT_KEY: {varchar(100)} */
    @JsonKey
    protected String _allocSortKey;

    /** RG_REPLENISH_UNIT_CLS: {varchar(30), default=[1], FK to B_CLASS_DTL, classification=ReplenishUnitCls} */
    @JsonKey
    protected String _rgReplenishUnitCls;

    /** EM_REPLENISH_UNIT_CLS: {varchar(30), default=[0], FK to B_CLASS_DTL, classification=ReplenishUnitCls} */
    @JsonKey
    protected String _emReplenishUnitCls;

    /** EM_REPLENISH_ZONE_ID: {IX, bigint(19), FK to M_ZONE} */
    @JsonKey
    protected Long _emReplenishZoneId;

    /** EM_REPLENISH_ALLOC_CLS: {varchar(30), FK to B_CLASS_DTL, classification=ReplenishAllocCls} */
    @JsonKey
    protected String _emReplenishAllocCls;

    /** PACKING_CAL_CLS: {varchar(30), default=[0], FK to B_CLASS_DTL, classification=PackingCalCls} */
    @JsonKey
    protected String _packingCalCls;

    /** PACKING_PROCESS_CLS: {varchar(30), default=[0], FK to B_CLASS_DTL, classification=PackingProcessCls} */
    @JsonKey
    protected String _packingProcessCls;

    /** PRODUCT_PART_PACKING: {varchar(30), default=[0], FK to B_CLASS_DTL, classification=ProductPartPacking} */
    @JsonKey
    protected String _productPartPacking;

    /** DECIMAL_PRODUCT_PACKING: {varchar(30), FK to B_CLASS_DTL, classification=DecimalProductPacking} */
    @JsonKey
    protected String _decimalProductPacking;

    /** PACKING_BOX_GROUP_ID: {IX, bigint(19), FK to M_BOX_GRP} */
    @JsonKey
    protected Long _packingBoxGroupId;

    /** TOTAL_PIC_FLG: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=TotalPicFlg} */
    @JsonKey
    protected String _totalPicFlg;

    /** MULTI_PIC_CLS: {NotNull, varchar(30), default=[0], FK to B_CLASS_DTL, classification=MultiPicCls} */
    @JsonKey
    protected String _multiPicCls;

    /** BACKET_COL_NUM: {bigint(19), default=[(0)]} */
    @JsonKey
    protected Long _backetColNum;

    /** BACKET_ROW_NUM: {bigint(19), default=[(0)]} */
    @JsonKey
    protected Long _backetRowNum;

    /** CASE_PIC_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=CasePicFlg} */
    @JsonKey
    protected String _casePicFlg;

    /** SGL_ROW_PIC_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=SglRowPicFlg} */
    @JsonKey
    protected String _sglRowPicFlg;

    /** SGL_ROW_PIC_MAX_INST_NUM: {bigint(19)} */
    @JsonKey
    protected Long _sglRowPicMaxInstNum;

    /** PIC_MTHD_RCMD_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=PicMthdRcmdFlg} */
    @JsonKey
    protected String _picMthdRcmdFlg;

    /** PIC_MTHD_RCMD_BREAK_KEY: {varchar(30), FK to B_CLASS_DTL, classification=PicMthdRcmdBreakKey} */
    @JsonKey
    protected String _picMthdRcmdBreakKey;

    /** PIC_MTHD_RCMD_API_KEY: {varchar(255)} */
    @JsonKey
    protected String _picMthdRcmdApiKey;

    /** PIC_MTHD_RCMD_MLT_PL_OUT: {char(1), FK to B_CLASS_DTL, classification=PicMthdRcmdListOut} */
    @JsonKey
    protected String _picMthdRcmdMltPlOut;

    /** PIC_MTHD_RCMD_SPL_SL_OUT: {char(1), FK to B_CLASS_DTL, classification=PicMthdRcmdListOut} */
    @JsonKey
    protected String _picMthdRcmdSplSlOut;

    /** PRODUCT_LABEL_OUT_UNIT: {char(1), FK to B_CLASS_DTL, classification=ProductLabelOutUnit} */
    @JsonKey
    protected String _productLabelOutUnit;

    /** RESULT_AFTER_PRODUCT_LABEL: {char(1), FK to B_CLASS_DTL, classification=ResultAfterProductLabel} */
    @JsonKey
    protected String _resultAfterProductLabel;

    /** RESULT_AFTER_PRODUCT_TARGET: {char(1), FK to B_CLASS_DTL, classification=ResultAfterProductTarget} */
    @JsonKey
    protected String _resultAfterProductTarget;

    /** PRODUCT_LABEL_JAN_BARCODE: {varchar(30), FK to B_CLASS_DTL, classification=ProductLabelJanBarcode} */
    @JsonKey
    protected String _productLabelJanBarcode;

    /** PRODUCT_LABEL_PROD_BARCODE: {varchar(30), FK to B_CLASS_DTL, classification=ProductLabelProdBarcode} */
    @JsonKey
    protected String _productLabelProdBarcode;

    /** PRODUCT_LABEL_JAN_STARTBIT: {varchar(30)} */
    @JsonKey
    protected String _productLabelJanStartbit;

    /** PRODUCT_LABEL_JAN_ENDBIT: {varchar(30)} */
    @JsonKey
    protected String _productLabelJanEndbit;

    /** PRODUCT_LABEL_PROD_STARTBIT: {varchar(30)} */
    @JsonKey
    protected String _productLabelProdStartbit;

    /** PRODUCT_LABEL_PROD_ENDBIT: {varchar(30)} */
    @JsonKey
    protected String _productLabelProdEndbit;

    /** BOX_SELECT_SKIP: {char(1), FK to B_CLASS_DTL, classification=BoxSelectSkip} */
    @JsonKey
    protected String _boxSelectSkip;

    /** DEFAULT_BOX_ID: {IX, bigint(19), FK to M_BOX} */
    @JsonKey
    protected Long _defaultBoxId;

    /** ERROR_SOUND_PLAY_FLG: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=SoundPlayFlg} */
    @JsonKey
    protected String _errorSoundPlayFlg;

    /** WARN_SOUND_PLAY_FLG: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=SoundPlayFlg} */
    @JsonKey
    protected String _warnSoundPlayFlg;

    /** INSP_SOUND_PLAY_FLG: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=SoundPlayFlg} */
    @JsonKey
    protected String _inspSoundPlayFlg;

    /** INSP_COMP_SOUND_PLAY_FLG: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=SoundPlayFlg} */
    @JsonKey
    protected String _inspCompSoundPlayFlg;

    /** AFTER_TAG_OUT_FLG: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=AfterTagOutFlg} */
    @JsonKey
    protected String _afterTagOutFlg;

    /** TAG_DELIVERY_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=TagDeliveryOutFlg} */
    @JsonKey
    protected String _tagDeliveryOutFlg;

    /** AFTER_DELIV_SLIP_OUT_FLG: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=AfterTagOutFlg} */
    @JsonKey
    protected String _afterDelivSlipOutFlg;

    /** AFTER_DELIV_SLIP_OUT_TGT: {char(1), FK to B_CLASS_DTL, classification=AfterDelivSlipOutTgt} */
    @JsonKey
    protected String _afterDelivSlipOutTgt;

    /** SGL_ROW_INSP_AFTER_OUT_CLS: {varchar(30), FK to B_CLASS_DTL, classification=SglRowInspAfterOutCls} */
    @JsonKey
    protected String _sglRowInspAfterOutCls;

    /** HT_CHAR_READ_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=HtCharReadFlg} */
    @JsonKey
    protected String _htCharReadFlg;

    /** HT_LOT_INPUT_TYPE: {varchar(30)} */
    @JsonKey
    protected String _htLotInputType;

    /** HT_SERIAL_INPUT_TYPE: {varchar(30)} */
    @JsonKey
    protected String _htSerialInputType;

    /** INSPECTION_LABEL_OUT_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=InspectionLabelOutFlg} */
    @JsonKey
    protected String _inspectionLabelOutFlg;

    /** AUTO_SHIP_INST_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=AutoShipInstFlg} */
    @JsonKey
    protected String _autoShipInstFlg;

    /** STOCK_OUT_AUTO_INST_FLG: {char(1), FK to B_CLASS_DTL, classification=StockOutAutoInstFlg} */
    @JsonKey
    protected String _stockOutAutoInstFlg;

    /** AUTO_EMG_SET_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=AutoEmgSetFlg} */
    @JsonKey
    protected String _autoEmgSetFlg;

    /** AUTO_EMG_SET_TGT: {varchar(30), FK to B_CLASS_DTL, classification=AutoEmgSetTgt} */
    @JsonKey
    protected String _autoEmgSetTgt;

    /** AUTO_EMG_SET_MINUTE: {bigint(19)} */
    @JsonKey
    protected Long _autoEmgSetMinute;

    /** STOCK_OUT_INST_CXL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=StockOutInstCxlFlg} */
    @JsonKey
    protected String _stockOutInstCxlFlg;

    /** STOCK_OUT_ALLOC_CLS: {varchar(30), default=[0], FK to B_CLASS_DTL, classification=StockOutAllocCls} */
    @JsonKey
    protected String _stockOutAllocCls;

    /** STOCK_OUT_INST_SPLIT_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=StockOutInstSplitFlg} */
    @JsonKey
    protected String _stockOutInstSplitFlg;

    /** CES_INTEGRATION_FLG: {char(1), FK to B_CLASS_DTL, classification=CesIntegrationFlg} */
    @JsonKey
    protected String _cesIntegrationFlg;

    /** PACKING_SLIP_AUTO_OUTPUT_FLG: {char(1), FK to B_CLASS_DTL, classification=PackingSlipAutoOutputFlg} */
    @JsonKey
    protected String _packingSlipAutoOutputFlg;

    /** CENTER_KBN: {NotNull, char(1), default=[0]} */
    @JsonKey
    protected String _centerKbn;

    /** DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg} */
    @JsonKey
    protected String _delFlg;

    /** VERSION_NO: {NotNull, bigint(19), default=[(0)]} */
    @JsonKey
    protected Long _versionNo;

    /** CONTROL_NO: {bigint(19)} */
    @JsonKey
    protected Long _controlNo;

    /** ADD_DT: {datetime2(26, 6)} */
    @JsonKey
    protected java.sql.Timestamp _addDt;

    /** ADD_USER: {varchar(255)} */
    @JsonKey
    protected String _addUser;

    /** ADD_PROCESS: {varchar(4000)} */
    @JsonKey
    protected String _addProcess;

    /** UPD_DT: {datetime2(26, 6)} */
    @JsonKey
    protected java.sql.Timestamp _updDt;

    /** UPD_USER: {varchar(255)} */
    @JsonKey
    protected String _updUser;

    /** UPD_PROCESS: {varchar(4000)} */
    @JsonKey
    protected String _updProcess;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMParamDto() {
    }

    // ===================================================================================
    //                                                                 Modified Properties
    //                                                                 ===================
    public Set<String> mymodifiedProperties() {
        return __modifiedProperties;
    }

    public void clearModifiedInfo() {
        __modifiedProperties.clear();
    }

    public boolean hasModification() {
        return !__modifiedProperties.isEmpty();
    }

    // ===================================================================================
    //                                                                       Foreign Table
    //                                                                       =============
    protected MClientCenterDto _mClientCenter;

    public MClientCenterDto getMClientCenter() {
        return _mClientCenter;
    }

    public void setMClientCenter(MClientCenterDto mClientCenter) {
        this._mClientCenter = mClientCenter;
    }

    protected MBoxDto _mBox;

    public MBoxDto getMBox() {
        return _mBox;
    }

    public void setMBox(MBoxDto mBox) {
        this._mBox = mBox;
    }

    protected MDeliveryCourseDto _mDeliveryCourse;

    public MDeliveryCourseDto getMDeliveryCourse() {
        return _mDeliveryCourse;
    }

    public void setMDeliveryCourse(MDeliveryCourseDto mDeliveryCourse) {
        this._mDeliveryCourse = mDeliveryCourse;
    }

    protected MZoneDto _mZone;

    public MZoneDto getMZone() {
        return _mZone;
    }

    public void setMZone(MZoneDto mZone) {
        this._mZone = mZone;
    }

    protected MBoxGrpDto _mBoxGrp;

    public MBoxGrpDto getMBoxGrp() {
        return _mBoxGrp;
    }

    public void setMBoxGrp(MBoxGrpDto mBoxGrp) {
        this._mBoxGrp = mBoxGrp;
    }

    protected BClassDtlDto _bClassDtlByAfterTagOutFlg;

    public BClassDtlDto getBClassDtlByAfterTagOutFlg() {
        return _bClassDtlByAfterTagOutFlg;
    }

    public void setBClassDtlByAfterTagOutFlg(BClassDtlDto bClassDtlByAfterTagOutFlg) {
        this._bClassDtlByAfterTagOutFlg = bClassDtlByAfterTagOutFlg;
    }

    protected BClassDtlDto _bClassDtlByAfterDelivSlipOutFlg;

    public BClassDtlDto getBClassDtlByAfterDelivSlipOutFlg() {
        return _bClassDtlByAfterDelivSlipOutFlg;
    }

    public void setBClassDtlByAfterDelivSlipOutFlg(BClassDtlDto bClassDtlByAfterDelivSlipOutFlg) {
        this._bClassDtlByAfterDelivSlipOutFlg = bClassDtlByAfterDelivSlipOutFlg;
    }

    protected BClassDtlDto _bClassDtlByAfterDelivSlipOutTgt;

    public BClassDtlDto getBClassDtlByAfterDelivSlipOutTgt() {
        return _bClassDtlByAfterDelivSlipOutTgt;
    }

    public void setBClassDtlByAfterDelivSlipOutTgt(BClassDtlDto bClassDtlByAfterDelivSlipOutTgt) {
        this._bClassDtlByAfterDelivSlipOutTgt = bClassDtlByAfterDelivSlipOutTgt;
    }

    protected BClassDtlDto _bClassDtlBySglRowInspAfterOutCls;

    public BClassDtlDto getBClassDtlBySglRowInspAfterOutCls() {
        return _bClassDtlBySglRowInspAfterOutCls;
    }

    public void setBClassDtlBySglRowInspAfterOutCls(BClassDtlDto bClassDtlBySglRowInspAfterOutCls) {
        this._bClassDtlBySglRowInspAfterOutCls = bClassDtlBySglRowInspAfterOutCls;
    }

    protected BClassDtlDto _bClassDtlByBoxSelectSkip;

    public BClassDtlDto getBClassDtlByBoxSelectSkip() {
        return _bClassDtlByBoxSelectSkip;
    }

    public void setBClassDtlByBoxSelectSkip(BClassDtlDto bClassDtlByBoxSelectSkip) {
        this._bClassDtlByBoxSelectSkip = bClassDtlByBoxSelectSkip;
    }

    protected BClassDtlDto _bClassDtlByCasePicFlg;

    public BClassDtlDto getBClassDtlByCasePicFlg() {
        return _bClassDtlByCasePicFlg;
    }

    public void setBClassDtlByCasePicFlg(BClassDtlDto bClassDtlByCasePicFlg) {
        this._bClassDtlByCasePicFlg = bClassDtlByCasePicFlg;
    }

    protected BClassDtlDto _bClassDtlByDelFlg;

    public BClassDtlDto getBClassDtlByDelFlg() {
        return _bClassDtlByDelFlg;
    }

    public void setBClassDtlByDelFlg(BClassDtlDto bClassDtlByDelFlg) {
        this._bClassDtlByDelFlg = bClassDtlByDelFlg;
    }

    protected BClassDtlDto _bClassDtlByHtCharReadFlg;

    public BClassDtlDto getBClassDtlByHtCharReadFlg() {
        return _bClassDtlByHtCharReadFlg;
    }

    public void setBClassDtlByHtCharReadFlg(BClassDtlDto bClassDtlByHtCharReadFlg) {
        this._bClassDtlByHtCharReadFlg = bClassDtlByHtCharReadFlg;
    }

    protected BClassDtlDto _bClassDtlByMergeCls;

    public BClassDtlDto getBClassDtlByMergeCls() {
        return _bClassDtlByMergeCls;
    }

    public void setBClassDtlByMergeCls(BClassDtlDto bClassDtlByMergeCls) {
        this._bClassDtlByMergeCls = bClassDtlByMergeCls;
    }

    protected BClassDtlDto _bClassDtlByMultiPicCls;

    public BClassDtlDto getBClassDtlByMultiPicCls() {
        return _bClassDtlByMultiPicCls;
    }

    public void setBClassDtlByMultiPicCls(BClassDtlDto bClassDtlByMultiPicCls) {
        this._bClassDtlByMultiPicCls = bClassDtlByMultiPicCls;
    }

    protected BClassDtlDto _bClassDtlByOverStoreNumFlg;

    public BClassDtlDto getBClassDtlByOverStoreNumFlg() {
        return _bClassDtlByOverStoreNumFlg;
    }

    public void setBClassDtlByOverStoreNumFlg(BClassDtlDto bClassDtlByOverStoreNumFlg) {
        this._bClassDtlByOverStoreNumFlg = bClassDtlByOverStoreNumFlg;
    }

    protected BClassDtlDto _bClassDtlByPackingCalCls;

    public BClassDtlDto getBClassDtlByPackingCalCls() {
        return _bClassDtlByPackingCalCls;
    }

    public void setBClassDtlByPackingCalCls(BClassDtlDto bClassDtlByPackingCalCls) {
        this._bClassDtlByPackingCalCls = bClassDtlByPackingCalCls;
    }

    protected BClassDtlDto _bClassDtlByPackingProcessCls;

    public BClassDtlDto getBClassDtlByPackingProcessCls() {
        return _bClassDtlByPackingProcessCls;
    }

    public void setBClassDtlByPackingProcessCls(BClassDtlDto bClassDtlByPackingProcessCls) {
        this._bClassDtlByPackingProcessCls = bClassDtlByPackingProcessCls;
    }

    protected BClassDtlDto _bClassDtlByPastStoreDtFlg;

    public BClassDtlDto getBClassDtlByPastStoreDtFlg() {
        return _bClassDtlByPastStoreDtFlg;
    }

    public void setBClassDtlByPastStoreDtFlg(BClassDtlDto bClassDtlByPastStoreDtFlg) {
        this._bClassDtlByPastStoreDtFlg = bClassDtlByPastStoreDtFlg;
    }

    protected BClassDtlDto _bClassDtlByProductLabelJanBarcode;

    public BClassDtlDto getBClassDtlByProductLabelJanBarcode() {
        return _bClassDtlByProductLabelJanBarcode;
    }

    public void setBClassDtlByProductLabelJanBarcode(BClassDtlDto bClassDtlByProductLabelJanBarcode) {
        this._bClassDtlByProductLabelJanBarcode = bClassDtlByProductLabelJanBarcode;
    }

    protected BClassDtlDto _bClassDtlByProductLabelOutUnit;

    public BClassDtlDto getBClassDtlByProductLabelOutUnit() {
        return _bClassDtlByProductLabelOutUnit;
    }

    public void setBClassDtlByProductLabelOutUnit(BClassDtlDto bClassDtlByProductLabelOutUnit) {
        this._bClassDtlByProductLabelOutUnit = bClassDtlByProductLabelOutUnit;
    }

    protected BClassDtlDto _bClassDtlByProductLabelProdBarcode;

    public BClassDtlDto getBClassDtlByProductLabelProdBarcode() {
        return _bClassDtlByProductLabelProdBarcode;
    }

    public void setBClassDtlByProductLabelProdBarcode(BClassDtlDto bClassDtlByProductLabelProdBarcode) {
        this._bClassDtlByProductLabelProdBarcode = bClassDtlByProductLabelProdBarcode;
    }

    protected BClassDtlDto _bClassDtlByProductPartPacking;

    public BClassDtlDto getBClassDtlByProductPartPacking() {
        return _bClassDtlByProductPartPacking;
    }

    public void setBClassDtlByProductPartPacking(BClassDtlDto bClassDtlByProductPartPacking) {
        this._bClassDtlByProductPartPacking = bClassDtlByProductPartPacking;
    }

    protected BClassDtlDto _bClassDtlByDecimalProductPacking;

    public BClassDtlDto getBClassDtlByDecimalProductPacking() {
        return _bClassDtlByDecimalProductPacking;
    }

    public void setBClassDtlByDecimalProductPacking(BClassDtlDto bClassDtlByDecimalProductPacking) {
        this._bClassDtlByDecimalProductPacking = bClassDtlByDecimalProductPacking;
    }

    protected BClassDtlDto _bClassDtlByEmReplenishAllocCls;

    public BClassDtlDto getBClassDtlByEmReplenishAllocCls() {
        return _bClassDtlByEmReplenishAllocCls;
    }

    public void setBClassDtlByEmReplenishAllocCls(BClassDtlDto bClassDtlByEmReplenishAllocCls) {
        this._bClassDtlByEmReplenishAllocCls = bClassDtlByEmReplenishAllocCls;
    }

    protected BClassDtlDto _bClassDtlByRgReplenishUnitCls;

    public BClassDtlDto getBClassDtlByRgReplenishUnitCls() {
        return _bClassDtlByRgReplenishUnitCls;
    }

    public void setBClassDtlByRgReplenishUnitCls(BClassDtlDto bClassDtlByRgReplenishUnitCls) {
        this._bClassDtlByRgReplenishUnitCls = bClassDtlByRgReplenishUnitCls;
    }

    protected BClassDtlDto _bClassDtlByEmReplenishUnitCls;

    public BClassDtlDto getBClassDtlByEmReplenishUnitCls() {
        return _bClassDtlByEmReplenishUnitCls;
    }

    public void setBClassDtlByEmReplenishUnitCls(BClassDtlDto bClassDtlByEmReplenishUnitCls) {
        this._bClassDtlByEmReplenishUnitCls = bClassDtlByEmReplenishUnitCls;
    }

    protected BClassDtlDto _bClassDtlByResultAfterProductLabel;

    public BClassDtlDto getBClassDtlByResultAfterProductLabel() {
        return _bClassDtlByResultAfterProductLabel;
    }

    public void setBClassDtlByResultAfterProductLabel(BClassDtlDto bClassDtlByResultAfterProductLabel) {
        this._bClassDtlByResultAfterProductLabel = bClassDtlByResultAfterProductLabel;
    }

    protected BClassDtlDto _bClassDtlByResultAfterProductTarget;

    public BClassDtlDto getBClassDtlByResultAfterProductTarget() {
        return _bClassDtlByResultAfterProductTarget;
    }

    public void setBClassDtlByResultAfterProductTarget(BClassDtlDto bClassDtlByResultAfterProductTarget) {
        this._bClassDtlByResultAfterProductTarget = bClassDtlByResultAfterProductTarget;
    }

    protected BClassDtlDto _bClassDtlByStoreDtFlg;

    public BClassDtlDto getBClassDtlByStoreDtFlg() {
        return _bClassDtlByStoreDtFlg;
    }

    public void setBClassDtlByStoreDtFlg(BClassDtlDto bClassDtlByStoreDtFlg) {
        this._bClassDtlByStoreDtFlg = bClassDtlByStoreDtFlg;
    }

    protected BClassDtlDto _bClassDtlByStoreNoFlg;

    public BClassDtlDto getBClassDtlByStoreNoFlg() {
        return _bClassDtlByStoreNoFlg;
    }

    public void setBClassDtlByStoreNoFlg(BClassDtlDto bClassDtlByStoreNoFlg) {
        this._bClassDtlByStoreNoFlg = bClassDtlByStoreNoFlg;
    }

    protected BClassDtlDto _bClassDtlByTagDeliveryOutFlg;

    public BClassDtlDto getBClassDtlByTagDeliveryOutFlg() {
        return _bClassDtlByTagDeliveryOutFlg;
    }

    public void setBClassDtlByTagDeliveryOutFlg(BClassDtlDto bClassDtlByTagDeliveryOutFlg) {
        this._bClassDtlByTagDeliveryOutFlg = bClassDtlByTagDeliveryOutFlg;
    }

    protected BClassDtlDto _bClassDtlByUseHtShipFlg;

    public BClassDtlDto getBClassDtlByUseHtShipFlg() {
        return _bClassDtlByUseHtShipFlg;
    }

    public void setBClassDtlByUseHtShipFlg(BClassDtlDto bClassDtlByUseHtShipFlg) {
        this._bClassDtlByUseHtShipFlg = bClassDtlByUseHtShipFlg;
    }

    protected BClassDtlDto _bClassDtlByInspectionLabelOutFlg;

    public BClassDtlDto getBClassDtlByInspectionLabelOutFlg() {
        return _bClassDtlByInspectionLabelOutFlg;
    }

    public void setBClassDtlByInspectionLabelOutFlg(BClassDtlDto bClassDtlByInspectionLabelOutFlg) {
        this._bClassDtlByInspectionLabelOutFlg = bClassDtlByInspectionLabelOutFlg;
    }

    protected BClassDtlDto _bClassDtlBySglRowPicFlg;

    public BClassDtlDto getBClassDtlBySglRowPicFlg() {
        return _bClassDtlBySglRowPicFlg;
    }

    public void setBClassDtlBySglRowPicFlg(BClassDtlDto bClassDtlBySglRowPicFlg) {
        this._bClassDtlBySglRowPicFlg = bClassDtlBySglRowPicFlg;
    }

    protected BClassDtlDto _bClassDtlByTotalPicFlg;

    public BClassDtlDto getBClassDtlByTotalPicFlg() {
        return _bClassDtlByTotalPicFlg;
    }

    public void setBClassDtlByTotalPicFlg(BClassDtlDto bClassDtlByTotalPicFlg) {
        this._bClassDtlByTotalPicFlg = bClassDtlByTotalPicFlg;
    }

    protected BClassDtlDto _bClassDtlByPicMthdRcmdFlg;

    public BClassDtlDto getBClassDtlByPicMthdRcmdFlg() {
        return _bClassDtlByPicMthdRcmdFlg;
    }

    public void setBClassDtlByPicMthdRcmdFlg(BClassDtlDto bClassDtlByPicMthdRcmdFlg) {
        this._bClassDtlByPicMthdRcmdFlg = bClassDtlByPicMthdRcmdFlg;
    }

    protected BClassDtlDto _bClassDtlByPicMthdRcmdBreakKey;

    public BClassDtlDto getBClassDtlByPicMthdRcmdBreakKey() {
        return _bClassDtlByPicMthdRcmdBreakKey;
    }

    public void setBClassDtlByPicMthdRcmdBreakKey(BClassDtlDto bClassDtlByPicMthdRcmdBreakKey) {
        this._bClassDtlByPicMthdRcmdBreakKey = bClassDtlByPicMthdRcmdBreakKey;
    }

    protected BClassDtlDto _bClassDtlByAutoShipInstFlg;

    public BClassDtlDto getBClassDtlByAutoShipInstFlg() {
        return _bClassDtlByAutoShipInstFlg;
    }

    public void setBClassDtlByAutoShipInstFlg(BClassDtlDto bClassDtlByAutoShipInstFlg) {
        this._bClassDtlByAutoShipInstFlg = bClassDtlByAutoShipInstFlg;
    }

    protected BClassDtlDto _bClassDtlByStockOutAutoInstFlg;

    public BClassDtlDto getBClassDtlByStockOutAutoInstFlg() {
        return _bClassDtlByStockOutAutoInstFlg;
    }

    public void setBClassDtlByStockOutAutoInstFlg(BClassDtlDto bClassDtlByStockOutAutoInstFlg) {
        this._bClassDtlByStockOutAutoInstFlg = bClassDtlByStockOutAutoInstFlg;
    }

    protected BClassDtlDto _bClassDtlByAutoEmgSetFlg;

    public BClassDtlDto getBClassDtlByAutoEmgSetFlg() {
        return _bClassDtlByAutoEmgSetFlg;
    }

    public void setBClassDtlByAutoEmgSetFlg(BClassDtlDto bClassDtlByAutoEmgSetFlg) {
        this._bClassDtlByAutoEmgSetFlg = bClassDtlByAutoEmgSetFlg;
    }

    protected BClassDtlDto _bClassDtlByAutoEmgSetTgt;

    public BClassDtlDto getBClassDtlByAutoEmgSetTgt() {
        return _bClassDtlByAutoEmgSetTgt;
    }

    public void setBClassDtlByAutoEmgSetTgt(BClassDtlDto bClassDtlByAutoEmgSetTgt) {
        this._bClassDtlByAutoEmgSetTgt = bClassDtlByAutoEmgSetTgt;
    }

    protected BClassDtlDto _bClassDtlByStockOutAllocCls;

    public BClassDtlDto getBClassDtlByStockOutAllocCls() {
        return _bClassDtlByStockOutAllocCls;
    }

    public void setBClassDtlByStockOutAllocCls(BClassDtlDto bClassDtlByStockOutAllocCls) {
        this._bClassDtlByStockOutAllocCls = bClassDtlByStockOutAllocCls;
    }

    protected BClassDtlDto _bClassDtlByStockOutInstCxlFlg;

    public BClassDtlDto getBClassDtlByStockOutInstCxlFlg() {
        return _bClassDtlByStockOutInstCxlFlg;
    }

    public void setBClassDtlByStockOutInstCxlFlg(BClassDtlDto bClassDtlByStockOutInstCxlFlg) {
        this._bClassDtlByStockOutInstCxlFlg = bClassDtlByStockOutInstCxlFlg;
    }

    protected BClassDtlDto _bClassDtlByStockOutInstSplitFlg;

    public BClassDtlDto getBClassDtlByStockOutInstSplitFlg() {
        return _bClassDtlByStockOutInstSplitFlg;
    }

    public void setBClassDtlByStockOutInstSplitFlg(BClassDtlDto bClassDtlByStockOutInstSplitFlg) {
        this._bClassDtlByStockOutInstSplitFlg = bClassDtlByStockOutInstSplitFlg;
    }

    protected BClassDtlDto _bClassDtlByPicMthdRcmdMltPlOut;

    public BClassDtlDto getBClassDtlByPicMthdRcmdMltPlOut() {
        return _bClassDtlByPicMthdRcmdMltPlOut;
    }

    public void setBClassDtlByPicMthdRcmdMltPlOut(BClassDtlDto bClassDtlByPicMthdRcmdMltPlOut) {
        this._bClassDtlByPicMthdRcmdMltPlOut = bClassDtlByPicMthdRcmdMltPlOut;
    }

    protected BClassDtlDto _bClassDtlByPicMthdRcmdSplSlOut;

    public BClassDtlDto getBClassDtlByPicMthdRcmdSplSlOut() {
        return _bClassDtlByPicMthdRcmdSplSlOut;
    }

    public void setBClassDtlByPicMthdRcmdSplSlOut(BClassDtlDto bClassDtlByPicMthdRcmdSplSlOut) {
        this._bClassDtlByPicMthdRcmdSplSlOut = bClassDtlByPicMthdRcmdSplSlOut;
    }

    protected BClassDtlDto _bClassDtlByErrorSoundPlayFlg;

    public BClassDtlDto getBClassDtlByErrorSoundPlayFlg() {
        return _bClassDtlByErrorSoundPlayFlg;
    }

    public void setBClassDtlByErrorSoundPlayFlg(BClassDtlDto bClassDtlByErrorSoundPlayFlg) {
        this._bClassDtlByErrorSoundPlayFlg = bClassDtlByErrorSoundPlayFlg;
    }

    protected BClassDtlDto _bClassDtlByWarnSoundPlayFlg;

    public BClassDtlDto getBClassDtlByWarnSoundPlayFlg() {
        return _bClassDtlByWarnSoundPlayFlg;
    }

    public void setBClassDtlByWarnSoundPlayFlg(BClassDtlDto bClassDtlByWarnSoundPlayFlg) {
        this._bClassDtlByWarnSoundPlayFlg = bClassDtlByWarnSoundPlayFlg;
    }

    protected BClassDtlDto _bClassDtlByInspSoundPlayFlg;

    public BClassDtlDto getBClassDtlByInspSoundPlayFlg() {
        return _bClassDtlByInspSoundPlayFlg;
    }

    public void setBClassDtlByInspSoundPlayFlg(BClassDtlDto bClassDtlByInspSoundPlayFlg) {
        this._bClassDtlByInspSoundPlayFlg = bClassDtlByInspSoundPlayFlg;
    }

    protected BClassDtlDto _bClassDtlByInspCompSoundPlayFlg;

    public BClassDtlDto getBClassDtlByInspCompSoundPlayFlg() {
        return _bClassDtlByInspCompSoundPlayFlg;
    }

    public void setBClassDtlByInspCompSoundPlayFlg(BClassDtlDto bClassDtlByInspCompSoundPlayFlg) {
        this._bClassDtlByInspCompSoundPlayFlg = bClassDtlByInspCompSoundPlayFlg;
    }

    protected BClassDtlDto _bClassDtlByCesIntegrationFlg;

    public BClassDtlDto getBClassDtlByCesIntegrationFlg() {
        return _bClassDtlByCesIntegrationFlg;
    }

    public void setBClassDtlByCesIntegrationFlg(BClassDtlDto bClassDtlByCesIntegrationFlg) {
        this._bClassDtlByCesIntegrationFlg = bClassDtlByCesIntegrationFlg;
    }

    protected BClassDtlDto _bClassDtlByPackingSlipAutoOutputFlg;

    public BClassDtlDto getBClassDtlByPackingSlipAutoOutputFlg() {
        return _bClassDtlByPackingSlipAutoOutputFlg;
    }

    public void setBClassDtlByPackingSlipAutoOutputFlg(BClassDtlDto bClassDtlByPackingSlipAutoOutputFlg) {
        this._bClassDtlByPackingSlipAutoOutputFlg = bClassDtlByPackingSlipAutoOutputFlg;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsMParamDto)) { return false; }
        final BsMParamDto otherEntity = (BsMParamDto)other;
        if (!helpComparingValue(getClientCenterId(), otherEntity.getClientCenterId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "M_PARAM");
        result = xCH(result, getClientCenterId());
        return result;
    }
    protected int xCH(int result, Object value) { // calculateHashcode()
        if (value == null) {
            return result;
        }
        return (31 * result) + (value instanceof byte[] ? ((byte[]) value).length : value.hashCode());
    }

    public int instanceHash() {
        return super.hashCode();
    }

    public String toString() {
        String c = ", ";
        StringBuilder sb = new StringBuilder();
        sb.append(c).append(getClientCenterId());
        sb.append(c).append(getDeliveryCourseId());
        sb.append(c).append(getStoreDtFlg());
        sb.append(c).append(getStoreNoFlg());
        sb.append(c).append(getMergeCls());
        sb.append(c).append(getTKeepingDays());
        sb.append(c).append(getHKeepingDays());
        sb.append(c).append(getDKeepingDays());
        sb.append(c).append(getOverStoreNumFlg());
        sb.append(c).append(getPastStoreDtFlg());
        sb.append(c).append(getUseHtShipFlg());
        sb.append(c).append(getAllocSortKey());
        sb.append(c).append(getRgReplenishUnitCls());
        sb.append(c).append(getEmReplenishUnitCls());
        sb.append(c).append(getEmReplenishZoneId());
        sb.append(c).append(getEmReplenishAllocCls());
        sb.append(c).append(getPackingCalCls());
        sb.append(c).append(getPackingProcessCls());
        sb.append(c).append(getProductPartPacking());
        sb.append(c).append(getDecimalProductPacking());
        sb.append(c).append(getPackingBoxGroupId());
        sb.append(c).append(getTotalPicFlg());
        sb.append(c).append(getMultiPicCls());
        sb.append(c).append(getBacketColNum());
        sb.append(c).append(getBacketRowNum());
        sb.append(c).append(getCasePicFlg());
        sb.append(c).append(getSglRowPicFlg());
        sb.append(c).append(getSglRowPicMaxInstNum());
        sb.append(c).append(getPicMthdRcmdFlg());
        sb.append(c).append(getPicMthdRcmdBreakKey());
        sb.append(c).append(getPicMthdRcmdApiKey());
        sb.append(c).append(getPicMthdRcmdMltPlOut());
        sb.append(c).append(getPicMthdRcmdSplSlOut());
        sb.append(c).append(getProductLabelOutUnit());
        sb.append(c).append(getResultAfterProductLabel());
        sb.append(c).append(getResultAfterProductTarget());
        sb.append(c).append(getProductLabelJanBarcode());
        sb.append(c).append(getProductLabelProdBarcode());
        sb.append(c).append(getProductLabelJanStartbit());
        sb.append(c).append(getProductLabelJanEndbit());
        sb.append(c).append(getProductLabelProdStartbit());
        sb.append(c).append(getProductLabelProdEndbit());
        sb.append(c).append(getBoxSelectSkip());
        sb.append(c).append(getDefaultBoxId());
        sb.append(c).append(getErrorSoundPlayFlg());
        sb.append(c).append(getWarnSoundPlayFlg());
        sb.append(c).append(getInspSoundPlayFlg());
        sb.append(c).append(getInspCompSoundPlayFlg());
        sb.append(c).append(getAfterTagOutFlg());
        sb.append(c).append(getTagDeliveryOutFlg());
        sb.append(c).append(getAfterDelivSlipOutFlg());
        sb.append(c).append(getAfterDelivSlipOutTgt());
        sb.append(c).append(getSglRowInspAfterOutCls());
        sb.append(c).append(getHtCharReadFlg());
        sb.append(c).append(getHtLotInputType());
        sb.append(c).append(getHtSerialInputType());
        sb.append(c).append(getInspectionLabelOutFlg());
        sb.append(c).append(getAutoShipInstFlg());
        sb.append(c).append(getStockOutAutoInstFlg());
        sb.append(c).append(getAutoEmgSetFlg());
        sb.append(c).append(getAutoEmgSetTgt());
        sb.append(c).append(getAutoEmgSetMinute());
        sb.append(c).append(getStockOutInstCxlFlg());
        sb.append(c).append(getStockOutAllocCls());
        sb.append(c).append(getStockOutInstSplitFlg());
        sb.append(c).append(getCesIntegrationFlg());
        sb.append(c).append(getPackingSlipAutoOutputFlg());
        sb.append(c).append(getCenterKbn());
        sb.append(c).append(getDelFlg());
        sb.append(c).append(getVersionNo());
        sb.append(c).append(getControlNo());
        sb.append(c).append(getAddDt());
        sb.append(c).append(getAddUser());
        sb.append(c).append(getAddProcess());
        sb.append(c).append(getUpdDt());
        sb.append(c).append(getUpdUser());
        sb.append(c).append(getUpdProcess());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] CLIENT_CENTER_ID: {PK, ID, NotNull, bigint identity(19), FK to M_CLIENT_CENTER} <br>
     * 荷主拠点ID
     * @return The value of the column 'CLIENT_CENTER_ID'. (NullAllowed)
     */
    public Long getClientCenterId() {
        return _clientCenterId;
    }

    /**
     * [set] CLIENT_CENTER_ID: {PK, ID, NotNull, bigint identity(19), FK to M_CLIENT_CENTER} <br>
     * 荷主拠点ID
     * @param clientCenterId The value of the column 'CLIENT_CENTER_ID'. (NullAllowed)
     */
    public void setClientCenterId(Long clientCenterId) {
        __modifiedProperties.add("clientCenterId");
        this._clientCenterId = clientCenterId;
    }

    /**
     * [get] DELIVERY_COURSE_ID: {IX, bigint(19), FK to M_DELIVERY_COURSE} <br>
     * 配送コースID
     * @return The value of the column 'DELIVERY_COURSE_ID'. (NullAllowed)
     */
    public Long getDeliveryCourseId() {
        return _deliveryCourseId;
    }

    /**
     * [set] DELIVERY_COURSE_ID: {IX, bigint(19), FK to M_DELIVERY_COURSE} <br>
     * 配送コースID
     * @param deliveryCourseId The value of the column 'DELIVERY_COURSE_ID'. (NullAllowed)
     */
    public void setDeliveryCourseId(Long deliveryCourseId) {
        __modifiedProperties.add("deliveryCourseId");
        this._deliveryCourseId = deliveryCourseId;
    }

    /**
     * [get] STORE_DT_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=StoreDtFlg} <br>
     * 入庫日管理フラグ
     * @return The value of the column 'STORE_DT_FLG'. (NullAllowed)
     */
    public String getStoreDtFlg() {
        return _storeDtFlg;
    }

    /**
     * [set] STORE_DT_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=StoreDtFlg} <br>
     * 入庫日管理フラグ
     * @param storeDtFlg The value of the column 'STORE_DT_FLG'. (NullAllowed)
     */
    public void setStoreDtFlg(String storeDtFlg) {
        __modifiedProperties.add("storeDtFlg");
        this._storeDtFlg = storeDtFlg;
    }

    /**
     * [get] STORE_NO_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=StoreNoFlg} <br>
     * 入庫No.管理フラグ
     * @return The value of the column 'STORE_NO_FLG'. (NullAllowed)
     */
    public String getStoreNoFlg() {
        return _storeNoFlg;
    }

    /**
     * [set] STORE_NO_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=StoreNoFlg} <br>
     * 入庫No.管理フラグ
     * @param storeNoFlg The value of the column 'STORE_NO_FLG'. (NullAllowed)
     */
    public void setStoreNoFlg(String storeNoFlg) {
        __modifiedProperties.add("storeNoFlg");
        this._storeNoFlg = storeNoFlg;
    }

    /**
     * [get] MERGE_CLS: {NotNull, varchar(30), default=[02], FK to B_CLASS_DTL, classification=MergeCls} <br>
     * 入庫No.マージ区分
     * @return The value of the column 'MERGE_CLS'. (NullAllowed)
     */
    public String getMergeCls() {
        return _mergeCls;
    }

    /**
     * [set] MERGE_CLS: {NotNull, varchar(30), default=[02], FK to B_CLASS_DTL, classification=MergeCls} <br>
     * 入庫No.マージ区分
     * @param mergeCls The value of the column 'MERGE_CLS'. (NullAllowed)
     */
    public void setMergeCls(String mergeCls) {
        __modifiedProperties.add("mergeCls");
        this._mergeCls = mergeCls;
    }

    /**
     * [get] T_KEEPING_DAYS: {NotNull, bigint(19), default=[(0)]} <br>
     * トランザクション保持期間
     * @return The value of the column 'T_KEEPING_DAYS'. (NullAllowed)
     */
    public Long getTKeepingDays() {
        return _tKeepingDays;
    }

    /**
     * [set] T_KEEPING_DAYS: {NotNull, bigint(19), default=[(0)]} <br>
     * トランザクション保持期間
     * @param tKeepingDays The value of the column 'T_KEEPING_DAYS'. (NullAllowed)
     */
    public void setTKeepingDays(Long tKeepingDays) {
        __modifiedProperties.add("TKeepingDays");
        this._tKeepingDays = tKeepingDays;
    }

    /**
     * [get] H_KEEPING_DAYS: {NotNull, bigint(19), default=[(0)]} <br>
     * 履歴保持期間
     * @return The value of the column 'H_KEEPING_DAYS'. (NullAllowed)
     */
    public Long getHKeepingDays() {
        return _hKeepingDays;
    }

    /**
     * [set] H_KEEPING_DAYS: {NotNull, bigint(19), default=[(0)]} <br>
     * 履歴保持期間
     * @param hKeepingDays The value of the column 'H_KEEPING_DAYS'. (NullAllowed)
     */
    public void setHKeepingDays(Long hKeepingDays) {
        __modifiedProperties.add("HKeepingDays");
        this._hKeepingDays = hKeepingDays;
    }

    /**
     * [get] D_KEEPING_DAYS: {NotNull, bigint(19), default=[(0)]} <br>
     * 削除保持期間
     * @return The value of the column 'D_KEEPING_DAYS'. (NullAllowed)
     */
    public Long getDKeepingDays() {
        return _dKeepingDays;
    }

    /**
     * [set] D_KEEPING_DAYS: {NotNull, bigint(19), default=[(0)]} <br>
     * 削除保持期間
     * @param dKeepingDays The value of the column 'D_KEEPING_DAYS'. (NullAllowed)
     */
    public void setDKeepingDays(Long dKeepingDays) {
        __modifiedProperties.add("DKeepingDays");
        this._dKeepingDays = dKeepingDays;
    }

    /**
     * [get] OVER_STORE_NUM_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=OverStoreNumFlg} <br>
     * HT/SD過入荷可フラグ
     * @return The value of the column 'OVER_STORE_NUM_FLG'. (NullAllowed)
     */
    public String getOverStoreNumFlg() {
        return _overStoreNumFlg;
    }

    /**
     * [set] OVER_STORE_NUM_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=OverStoreNumFlg} <br>
     * HT/SD過入荷可フラグ
     * @param overStoreNumFlg The value of the column 'OVER_STORE_NUM_FLG'. (NullAllowed)
     */
    public void setOverStoreNumFlg(String overStoreNumFlg) {
        __modifiedProperties.add("overStoreNumFlg");
        this._overStoreNumFlg = overStoreNumFlg;
    }

    /**
     * [get] PAST_STORE_DT_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=PastStoreDtFlg} <br>
     * HT/SD過去日入力可フラグ
     * @return The value of the column 'PAST_STORE_DT_FLG'. (NullAllowed)
     */
    public String getPastStoreDtFlg() {
        return _pastStoreDtFlg;
    }

    /**
     * [set] PAST_STORE_DT_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=PastStoreDtFlg} <br>
     * HT/SD過去日入力可フラグ
     * @param pastStoreDtFlg The value of the column 'PAST_STORE_DT_FLG'. (NullAllowed)
     */
    public void setPastStoreDtFlg(String pastStoreDtFlg) {
        __modifiedProperties.add("pastStoreDtFlg");
        this._pastStoreDtFlg = pastStoreDtFlg;
    }

    /**
     * [get] USE_HT_SHIP_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=UseHtShipFlg} <br>
     * 出荷時HT/SD使用フラグ
     * @return The value of the column 'USE_HT_SHIP_FLG'. (NullAllowed)
     */
    public String getUseHtShipFlg() {
        return _useHtShipFlg;
    }

    /**
     * [set] USE_HT_SHIP_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=UseHtShipFlg} <br>
     * 出荷時HT/SD使用フラグ
     * @param useHtShipFlg The value of the column 'USE_HT_SHIP_FLG'. (NullAllowed)
     */
    public void setUseHtShipFlg(String useHtShipFlg) {
        __modifiedProperties.add("useHtShipFlg");
        this._useHtShipFlg = useHtShipFlg;
    }

    /**
     * [get] ALLOC_SORT_KEY: {varchar(100)} <br>
     * 引当ソートキー
     * @return The value of the column 'ALLOC_SORT_KEY'. (NullAllowed)
     */
    public String getAllocSortKey() {
        return _allocSortKey;
    }

    /**
     * [set] ALLOC_SORT_KEY: {varchar(100)} <br>
     * 引当ソートキー
     * @param allocSortKey The value of the column 'ALLOC_SORT_KEY'. (NullAllowed)
     */
    public void setAllocSortKey(String allocSortKey) {
        __modifiedProperties.add("allocSortKey");
        this._allocSortKey = allocSortKey;
    }

    /**
     * [get] RG_REPLENISH_UNIT_CLS: {varchar(30), default=[1], FK to B_CLASS_DTL, classification=ReplenishUnitCls} <br>
     * 定期補充単位区分
     * @return The value of the column 'RG_REPLENISH_UNIT_CLS'. (NullAllowed)
     */
    public String getRgReplenishUnitCls() {
        return _rgReplenishUnitCls;
    }

    /**
     * [set] RG_REPLENISH_UNIT_CLS: {varchar(30), default=[1], FK to B_CLASS_DTL, classification=ReplenishUnitCls} <br>
     * 定期補充単位区分
     * @param rgReplenishUnitCls The value of the column 'RG_REPLENISH_UNIT_CLS'. (NullAllowed)
     */
    public void setRgReplenishUnitCls(String rgReplenishUnitCls) {
        __modifiedProperties.add("rgReplenishUnitCls");
        this._rgReplenishUnitCls = rgReplenishUnitCls;
    }

    /**
     * [get] EM_REPLENISH_UNIT_CLS: {varchar(30), default=[0], FK to B_CLASS_DTL, classification=ReplenishUnitCls} <br>
     * 緊急補充単位区分
     * @return The value of the column 'EM_REPLENISH_UNIT_CLS'. (NullAllowed)
     */
    public String getEmReplenishUnitCls() {
        return _emReplenishUnitCls;
    }

    /**
     * [set] EM_REPLENISH_UNIT_CLS: {varchar(30), default=[0], FK to B_CLASS_DTL, classification=ReplenishUnitCls} <br>
     * 緊急補充単位区分
     * @param emReplenishUnitCls The value of the column 'EM_REPLENISH_UNIT_CLS'. (NullAllowed)
     */
    public void setEmReplenishUnitCls(String emReplenishUnitCls) {
        __modifiedProperties.add("emReplenishUnitCls");
        this._emReplenishUnitCls = emReplenishUnitCls;
    }

    /**
     * [get] EM_REPLENISH_ZONE_ID: {IX, bigint(19), FK to M_ZONE} <br>
     * 緊急補充ゾーンID
     * @return The value of the column 'EM_REPLENISH_ZONE_ID'. (NullAllowed)
     */
    public Long getEmReplenishZoneId() {
        return _emReplenishZoneId;
    }

    /**
     * [set] EM_REPLENISH_ZONE_ID: {IX, bigint(19), FK to M_ZONE} <br>
     * 緊急補充ゾーンID
     * @param emReplenishZoneId The value of the column 'EM_REPLENISH_ZONE_ID'. (NullAllowed)
     */
    public void setEmReplenishZoneId(Long emReplenishZoneId) {
        __modifiedProperties.add("emReplenishZoneId");
        this._emReplenishZoneId = emReplenishZoneId;
    }

    /**
     * [get] EM_REPLENISH_ALLOC_CLS: {varchar(30), FK to B_CLASS_DTL, classification=ReplenishAllocCls} <br>
     * 緊急補充ロケ割付区分
     * @return The value of the column 'EM_REPLENISH_ALLOC_CLS'. (NullAllowed)
     */
    public String getEmReplenishAllocCls() {
        return _emReplenishAllocCls;
    }

    /**
     * [set] EM_REPLENISH_ALLOC_CLS: {varchar(30), FK to B_CLASS_DTL, classification=ReplenishAllocCls} <br>
     * 緊急補充ロケ割付区分
     * @param emReplenishAllocCls The value of the column 'EM_REPLENISH_ALLOC_CLS'. (NullAllowed)
     */
    public void setEmReplenishAllocCls(String emReplenishAllocCls) {
        __modifiedProperties.add("emReplenishAllocCls");
        this._emReplenishAllocCls = emReplenishAllocCls;
    }

    /**
     * [get] PACKING_CAL_CLS: {varchar(30), default=[0], FK to B_CLASS_DTL, classification=PackingCalCls} <br>
     * 梱包計算処理区分
     * @return The value of the column 'PACKING_CAL_CLS'. (NullAllowed)
     */
    public String getPackingCalCls() {
        return _packingCalCls;
    }

    /**
     * [set] PACKING_CAL_CLS: {varchar(30), default=[0], FK to B_CLASS_DTL, classification=PackingCalCls} <br>
     * 梱包計算処理区分
     * @param packingCalCls The value of the column 'PACKING_CAL_CLS'. (NullAllowed)
     */
    public void setPackingCalCls(String packingCalCls) {
        __modifiedProperties.add("packingCalCls");
        this._packingCalCls = packingCalCls;
    }

    /**
     * [get] PACKING_PROCESS_CLS: {varchar(30), default=[0], FK to B_CLASS_DTL, classification=PackingProcessCls} <br>
     * 詰め込み方
     * @return The value of the column 'PACKING_PROCESS_CLS'. (NullAllowed)
     */
    public String getPackingProcessCls() {
        return _packingProcessCls;
    }

    /**
     * [set] PACKING_PROCESS_CLS: {varchar(30), default=[0], FK to B_CLASS_DTL, classification=PackingProcessCls} <br>
     * 詰め込み方
     * @param packingProcessCls The value of the column 'PACKING_PROCESS_CLS'. (NullAllowed)
     */
    public void setPackingProcessCls(String packingProcessCls) {
        __modifiedProperties.add("packingProcessCls");
        this._packingProcessCls = packingProcessCls;
    }

    /**
     * [get] PRODUCT_PART_PACKING: {varchar(30), default=[0], FK to B_CLASS_DTL, classification=ProductPartPacking} <br>
     * 商品毎別梱包
     * @return The value of the column 'PRODUCT_PART_PACKING'. (NullAllowed)
     */
    public String getProductPartPacking() {
        return _productPartPacking;
    }

    /**
     * [set] PRODUCT_PART_PACKING: {varchar(30), default=[0], FK to B_CLASS_DTL, classification=ProductPartPacking} <br>
     * 商品毎別梱包
     * @param productPartPacking The value of the column 'PRODUCT_PART_PACKING'. (NullAllowed)
     */
    public void setProductPartPacking(String productPartPacking) {
        __modifiedProperties.add("productPartPacking");
        this._productPartPacking = productPartPacking;
    }

    /**
     * [get] DECIMAL_PRODUCT_PACKING: {varchar(30), FK to B_CLASS_DTL, classification=DecimalProductPacking} <br>
     * 小数管理商品梱包単位
     * @return The value of the column 'DECIMAL_PRODUCT_PACKING'. (NullAllowed)
     */
    public String getDecimalProductPacking() {
        return _decimalProductPacking;
    }

    /**
     * [set] DECIMAL_PRODUCT_PACKING: {varchar(30), FK to B_CLASS_DTL, classification=DecimalProductPacking} <br>
     * 小数管理商品梱包単位
     * @param decimalProductPacking The value of the column 'DECIMAL_PRODUCT_PACKING'. (NullAllowed)
     */
    public void setDecimalProductPacking(String decimalProductPacking) {
        __modifiedProperties.add("decimalProductPacking");
        this._decimalProductPacking = decimalProductPacking;
    }

    /**
     * [get] PACKING_BOX_GROUP_ID: {IX, bigint(19), FK to M_BOX_GRP} <br>
     * 梱包荷材グループID
     * @return The value of the column 'PACKING_BOX_GROUP_ID'. (NullAllowed)
     */
    public Long getPackingBoxGroupId() {
        return _packingBoxGroupId;
    }

    /**
     * [set] PACKING_BOX_GROUP_ID: {IX, bigint(19), FK to M_BOX_GRP} <br>
     * 梱包荷材グループID
     * @param packingBoxGroupId The value of the column 'PACKING_BOX_GROUP_ID'. (NullAllowed)
     */
    public void setPackingBoxGroupId(Long packingBoxGroupId) {
        __modifiedProperties.add("packingBoxGroupId");
        this._packingBoxGroupId = packingBoxGroupId;
    }

    /**
     * [get] TOTAL_PIC_FLG: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=TotalPicFlg} <br>
     * トータルピックフラグ
     * @return The value of the column 'TOTAL_PIC_FLG'. (NullAllowed)
     */
    public String getTotalPicFlg() {
        return _totalPicFlg;
    }

    /**
     * [set] TOTAL_PIC_FLG: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=TotalPicFlg} <br>
     * トータルピックフラグ
     * @param totalPicFlg The value of the column 'TOTAL_PIC_FLG'. (NullAllowed)
     */
    public void setTotalPicFlg(String totalPicFlg) {
        __modifiedProperties.add("totalPicFlg");
        this._totalPicFlg = totalPicFlg;
    }

    /**
     * [get] MULTI_PIC_CLS: {NotNull, varchar(30), default=[0], FK to B_CLASS_DTL, classification=MultiPicCls} <br>
     * マルチピック計算区分
     * @return The value of the column 'MULTI_PIC_CLS'. (NullAllowed)
     */
    public String getMultiPicCls() {
        return _multiPicCls;
    }

    /**
     * [set] MULTI_PIC_CLS: {NotNull, varchar(30), default=[0], FK to B_CLASS_DTL, classification=MultiPicCls} <br>
     * マルチピック計算区分
     * @param multiPicCls The value of the column 'MULTI_PIC_CLS'. (NullAllowed)
     */
    public void setMultiPicCls(String multiPicCls) {
        __modifiedProperties.add("multiPicCls");
        this._multiPicCls = multiPicCls;
    }

    /**
     * [get] BACKET_COL_NUM: {bigint(19), default=[(0)]} <br>
     * バケット列数
     * @return The value of the column 'BACKET_COL_NUM'. (NullAllowed)
     */
    public Long getBacketColNum() {
        return _backetColNum;
    }

    /**
     * [set] BACKET_COL_NUM: {bigint(19), default=[(0)]} <br>
     * バケット列数
     * @param backetColNum The value of the column 'BACKET_COL_NUM'. (NullAllowed)
     */
    public void setBacketColNum(Long backetColNum) {
        __modifiedProperties.add("backetColNum");
        this._backetColNum = backetColNum;
    }

    /**
     * [get] BACKET_ROW_NUM: {bigint(19), default=[(0)]} <br>
     * バケット段数
     * @return The value of the column 'BACKET_ROW_NUM'. (NullAllowed)
     */
    public Long getBacketRowNum() {
        return _backetRowNum;
    }

    /**
     * [set] BACKET_ROW_NUM: {bigint(19), default=[(0)]} <br>
     * バケット段数
     * @param backetRowNum The value of the column 'BACKET_ROW_NUM'. (NullAllowed)
     */
    public void setBacketRowNum(Long backetRowNum) {
        __modifiedProperties.add("backetRowNum");
        this._backetRowNum = backetRowNum;
    }

    /**
     * [get] CASE_PIC_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=CasePicFlg} <br>
     * ケースピックフラグ
     * @return The value of the column 'CASE_PIC_FLG'. (NullAllowed)
     */
    public String getCasePicFlg() {
        return _casePicFlg;
    }

    /**
     * [set] CASE_PIC_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=CasePicFlg} <br>
     * ケースピックフラグ
     * @param casePicFlg The value of the column 'CASE_PIC_FLG'. (NullAllowed)
     */
    public void setCasePicFlg(String casePicFlg) {
        __modifiedProperties.add("casePicFlg");
        this._casePicFlg = casePicFlg;
    }

    /**
     * [get] SGL_ROW_PIC_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=SglRowPicFlg} <br>
     * 単行ピックフラグ
     * @return The value of the column 'SGL_ROW_PIC_FLG'. (NullAllowed)
     */
    public String getSglRowPicFlg() {
        return _sglRowPicFlg;
    }

    /**
     * [set] SGL_ROW_PIC_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=SglRowPicFlg} <br>
     * 単行ピックフラグ
     * @param sglRowPicFlg The value of the column 'SGL_ROW_PIC_FLG'. (NullAllowed)
     */
    public void setSglRowPicFlg(String sglRowPicFlg) {
        __modifiedProperties.add("sglRowPicFlg");
        this._sglRowPicFlg = sglRowPicFlg;
    }

    /**
     * [get] SGL_ROW_PIC_MAX_INST_NUM: {bigint(19)} <br>
     * 単行ピック上限指示数
     * @return The value of the column 'SGL_ROW_PIC_MAX_INST_NUM'. (NullAllowed)
     */
    public Long getSglRowPicMaxInstNum() {
        return _sglRowPicMaxInstNum;
    }

    /**
     * [set] SGL_ROW_PIC_MAX_INST_NUM: {bigint(19)} <br>
     * 単行ピック上限指示数
     * @param sglRowPicMaxInstNum The value of the column 'SGL_ROW_PIC_MAX_INST_NUM'. (NullAllowed)
     */
    public void setSglRowPicMaxInstNum(Long sglRowPicMaxInstNum) {
        __modifiedProperties.add("sglRowPicMaxInstNum");
        this._sglRowPicMaxInstNum = sglRowPicMaxInstNum;
    }

    /**
     * [get] PIC_MTHD_RCMD_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=PicMthdRcmdFlg} <br>
     * 最適ピック提案フラグ
     * @return The value of the column 'PIC_MTHD_RCMD_FLG'. (NullAllowed)
     */
    public String getPicMthdRcmdFlg() {
        return _picMthdRcmdFlg;
    }

    /**
     * [set] PIC_MTHD_RCMD_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=PicMthdRcmdFlg} <br>
     * 最適ピック提案フラグ
     * @param picMthdRcmdFlg The value of the column 'PIC_MTHD_RCMD_FLG'. (NullAllowed)
     */
    public void setPicMthdRcmdFlg(String picMthdRcmdFlg) {
        __modifiedProperties.add("picMthdRcmdFlg");
        this._picMthdRcmdFlg = picMthdRcmdFlg;
    }

    /**
     * [get] PIC_MTHD_RCMD_BREAK_KEY: {varchar(30), FK to B_CLASS_DTL, classification=PicMthdRcmdBreakKey} <br>
     * 最適ピック提案ブレイクキー
     * @return The value of the column 'PIC_MTHD_RCMD_BREAK_KEY'. (NullAllowed)
     */
    public String getPicMthdRcmdBreakKey() {
        return _picMthdRcmdBreakKey;
    }

    /**
     * [set] PIC_MTHD_RCMD_BREAK_KEY: {varchar(30), FK to B_CLASS_DTL, classification=PicMthdRcmdBreakKey} <br>
     * 最適ピック提案ブレイクキー
     * @param picMthdRcmdBreakKey The value of the column 'PIC_MTHD_RCMD_BREAK_KEY'. (NullAllowed)
     */
    public void setPicMthdRcmdBreakKey(String picMthdRcmdBreakKey) {
        __modifiedProperties.add("picMthdRcmdBreakKey");
        this._picMthdRcmdBreakKey = picMthdRcmdBreakKey;
    }

    /**
     * [get] PIC_MTHD_RCMD_API_KEY: {varchar(255)} <br>
     * 最適ピック提案APIキー
     * @return The value of the column 'PIC_MTHD_RCMD_API_KEY'. (NullAllowed)
     */
    public String getPicMthdRcmdApiKey() {
        return _picMthdRcmdApiKey;
    }

    /**
     * [set] PIC_MTHD_RCMD_API_KEY: {varchar(255)} <br>
     * 最適ピック提案APIキー
     * @param picMthdRcmdApiKey The value of the column 'PIC_MTHD_RCMD_API_KEY'. (NullAllowed)
     */
    public void setPicMthdRcmdApiKey(String picMthdRcmdApiKey) {
        __modifiedProperties.add("picMthdRcmdApiKey");
        this._picMthdRcmdApiKey = picMthdRcmdApiKey;
    }

    /**
     * [get] PIC_MTHD_RCMD_MLT_PL_OUT: {char(1), FK to B_CLASS_DTL, classification=PicMthdRcmdListOut} <br>
     * 最適ピック提案マルチピック摘み取りリスト出力フラグ
     * @return The value of the column 'PIC_MTHD_RCMD_MLT_PL_OUT'. (NullAllowed)
     */
    public String getPicMthdRcmdMltPlOut() {
        return _picMthdRcmdMltPlOut;
    }

    /**
     * [set] PIC_MTHD_RCMD_MLT_PL_OUT: {char(1), FK to B_CLASS_DTL, classification=PicMthdRcmdListOut} <br>
     * 最適ピック提案マルチピック摘み取りリスト出力フラグ
     * @param picMthdRcmdMltPlOut The value of the column 'PIC_MTHD_RCMD_MLT_PL_OUT'. (NullAllowed)
     */
    public void setPicMthdRcmdMltPlOut(String picMthdRcmdMltPlOut) {
        __modifiedProperties.add("picMthdRcmdMltPlOut");
        this._picMthdRcmdMltPlOut = picMthdRcmdMltPlOut;
    }

    /**
     * [get] PIC_MTHD_RCMD_SPL_SL_OUT: {char(1), FK to B_CLASS_DTL, classification=PicMthdRcmdListOut} <br>
     * 最適ピック提案単行ピック種蒔きリスト出力フラグ
     * @return The value of the column 'PIC_MTHD_RCMD_SPL_SL_OUT'. (NullAllowed)
     */
    public String getPicMthdRcmdSplSlOut() {
        return _picMthdRcmdSplSlOut;
    }

    /**
     * [set] PIC_MTHD_RCMD_SPL_SL_OUT: {char(1), FK to B_CLASS_DTL, classification=PicMthdRcmdListOut} <br>
     * 最適ピック提案単行ピック種蒔きリスト出力フラグ
     * @param picMthdRcmdSplSlOut The value of the column 'PIC_MTHD_RCMD_SPL_SL_OUT'. (NullAllowed)
     */
    public void setPicMthdRcmdSplSlOut(String picMthdRcmdSplSlOut) {
        __modifiedProperties.add("picMthdRcmdSplSlOut");
        this._picMthdRcmdSplSlOut = picMthdRcmdSplSlOut;
    }

    /**
     * [get] PRODUCT_LABEL_OUT_UNIT: {char(1), FK to B_CLASS_DTL, classification=ProductLabelOutUnit} <br>
     * 商品ラベル出力単位
     * @return The value of the column 'PRODUCT_LABEL_OUT_UNIT'. (NullAllowed)
     */
    public String getProductLabelOutUnit() {
        return _productLabelOutUnit;
    }

    /**
     * [set] PRODUCT_LABEL_OUT_UNIT: {char(1), FK to B_CLASS_DTL, classification=ProductLabelOutUnit} <br>
     * 商品ラベル出力単位
     * @param productLabelOutUnit The value of the column 'PRODUCT_LABEL_OUT_UNIT'. (NullAllowed)
     */
    public void setProductLabelOutUnit(String productLabelOutUnit) {
        __modifiedProperties.add("productLabelOutUnit");
        this._productLabelOutUnit = productLabelOutUnit;
    }

    /**
     * [get] RESULT_AFTER_PRODUCT_LABEL: {char(1), FK to B_CLASS_DTL, classification=ResultAfterProductLabel} <br>
     * 実績入力後入庫/商品ラベル出力フラグ
     * @return The value of the column 'RESULT_AFTER_PRODUCT_LABEL'. (NullAllowed)
     */
    public String getResultAfterProductLabel() {
        return _resultAfterProductLabel;
    }

    /**
     * [set] RESULT_AFTER_PRODUCT_LABEL: {char(1), FK to B_CLASS_DTL, classification=ResultAfterProductLabel} <br>
     * 実績入力後入庫/商品ラベル出力フラグ
     * @param resultAfterProductLabel The value of the column 'RESULT_AFTER_PRODUCT_LABEL'. (NullAllowed)
     */
    public void setResultAfterProductLabel(String resultAfterProductLabel) {
        __modifiedProperties.add("resultAfterProductLabel");
        this._resultAfterProductLabel = resultAfterProductLabel;
    }

    /**
     * [get] RESULT_AFTER_PRODUCT_TARGET: {char(1), FK to B_CLASS_DTL, classification=ResultAfterProductTarget} <br>
     * 実績入力後入庫/商品ラベル出力対象
     * @return The value of the column 'RESULT_AFTER_PRODUCT_TARGET'. (NullAllowed)
     */
    public String getResultAfterProductTarget() {
        return _resultAfterProductTarget;
    }

    /**
     * [set] RESULT_AFTER_PRODUCT_TARGET: {char(1), FK to B_CLASS_DTL, classification=ResultAfterProductTarget} <br>
     * 実績入力後入庫/商品ラベル出力対象
     * @param resultAfterProductTarget The value of the column 'RESULT_AFTER_PRODUCT_TARGET'. (NullAllowed)
     */
    public void setResultAfterProductTarget(String resultAfterProductTarget) {
        __modifiedProperties.add("resultAfterProductTarget");
        this._resultAfterProductTarget = resultAfterProductTarget;
    }

    /**
     * [get] PRODUCT_LABEL_JAN_BARCODE: {varchar(30), FK to B_CLASS_DTL, classification=ProductLabelJanBarcode} <br>
     * 商品ラベルJANCDバーコード種別
     * @return The value of the column 'PRODUCT_LABEL_JAN_BARCODE'. (NullAllowed)
     */
    public String getProductLabelJanBarcode() {
        return _productLabelJanBarcode;
    }

    /**
     * [set] PRODUCT_LABEL_JAN_BARCODE: {varchar(30), FK to B_CLASS_DTL, classification=ProductLabelJanBarcode} <br>
     * 商品ラベルJANCDバーコード種別
     * @param productLabelJanBarcode The value of the column 'PRODUCT_LABEL_JAN_BARCODE'. (NullAllowed)
     */
    public void setProductLabelJanBarcode(String productLabelJanBarcode) {
        __modifiedProperties.add("productLabelJanBarcode");
        this._productLabelJanBarcode = productLabelJanBarcode;
    }

    /**
     * [get] PRODUCT_LABEL_PROD_BARCODE: {varchar(30), FK to B_CLASS_DTL, classification=ProductLabelProdBarcode} <br>
     * 商品ラベル商品CDバーコード種別
     * @return The value of the column 'PRODUCT_LABEL_PROD_BARCODE'. (NullAllowed)
     */
    public String getProductLabelProdBarcode() {
        return _productLabelProdBarcode;
    }

    /**
     * [set] PRODUCT_LABEL_PROD_BARCODE: {varchar(30), FK to B_CLASS_DTL, classification=ProductLabelProdBarcode} <br>
     * 商品ラベル商品CDバーコード種別
     * @param productLabelProdBarcode The value of the column 'PRODUCT_LABEL_PROD_BARCODE'. (NullAllowed)
     */
    public void setProductLabelProdBarcode(String productLabelProdBarcode) {
        __modifiedProperties.add("productLabelProdBarcode");
        this._productLabelProdBarcode = productLabelProdBarcode;
    }

    /**
     * [get] PRODUCT_LABEL_JAN_STARTBIT: {varchar(30)} <br>
     * 商品ラベルバーコードJANCDスタートビット
     * @return The value of the column 'PRODUCT_LABEL_JAN_STARTBIT'. (NullAllowed)
     */
    public String getProductLabelJanStartbit() {
        return _productLabelJanStartbit;
    }

    /**
     * [set] PRODUCT_LABEL_JAN_STARTBIT: {varchar(30)} <br>
     * 商品ラベルバーコードJANCDスタートビット
     * @param productLabelJanStartbit The value of the column 'PRODUCT_LABEL_JAN_STARTBIT'. (NullAllowed)
     */
    public void setProductLabelJanStartbit(String productLabelJanStartbit) {
        __modifiedProperties.add("productLabelJanStartbit");
        this._productLabelJanStartbit = productLabelJanStartbit;
    }

    /**
     * [get] PRODUCT_LABEL_JAN_ENDBIT: {varchar(30)} <br>
     * 商品ラベルバーコードJANCDエンドビット
     * @return The value of the column 'PRODUCT_LABEL_JAN_ENDBIT'. (NullAllowed)
     */
    public String getProductLabelJanEndbit() {
        return _productLabelJanEndbit;
    }

    /**
     * [set] PRODUCT_LABEL_JAN_ENDBIT: {varchar(30)} <br>
     * 商品ラベルバーコードJANCDエンドビット
     * @param productLabelJanEndbit The value of the column 'PRODUCT_LABEL_JAN_ENDBIT'. (NullAllowed)
     */
    public void setProductLabelJanEndbit(String productLabelJanEndbit) {
        __modifiedProperties.add("productLabelJanEndbit");
        this._productLabelJanEndbit = productLabelJanEndbit;
    }

    /**
     * [get] PRODUCT_LABEL_PROD_STARTBIT: {varchar(30)} <br>
     * 商品ラベルバーコード商品CDスタートビット
     * @return The value of the column 'PRODUCT_LABEL_PROD_STARTBIT'. (NullAllowed)
     */
    public String getProductLabelProdStartbit() {
        return _productLabelProdStartbit;
    }

    /**
     * [set] PRODUCT_LABEL_PROD_STARTBIT: {varchar(30)} <br>
     * 商品ラベルバーコード商品CDスタートビット
     * @param productLabelProdStartbit The value of the column 'PRODUCT_LABEL_PROD_STARTBIT'. (NullAllowed)
     */
    public void setProductLabelProdStartbit(String productLabelProdStartbit) {
        __modifiedProperties.add("productLabelProdStartbit");
        this._productLabelProdStartbit = productLabelProdStartbit;
    }

    /**
     * [get] PRODUCT_LABEL_PROD_ENDBIT: {varchar(30)} <br>
     * 商品ラベルバーコード商品CDエンドビット
     * @return The value of the column 'PRODUCT_LABEL_PROD_ENDBIT'. (NullAllowed)
     */
    public String getProductLabelProdEndbit() {
        return _productLabelProdEndbit;
    }

    /**
     * [set] PRODUCT_LABEL_PROD_ENDBIT: {varchar(30)} <br>
     * 商品ラベルバーコード商品CDエンドビット
     * @param productLabelProdEndbit The value of the column 'PRODUCT_LABEL_PROD_ENDBIT'. (NullAllowed)
     */
    public void setProductLabelProdEndbit(String productLabelProdEndbit) {
        __modifiedProperties.add("productLabelProdEndbit");
        this._productLabelProdEndbit = productLabelProdEndbit;
    }

    /**
     * [get] BOX_SELECT_SKIP: {char(1), FK to B_CLASS_DTL, classification=BoxSelectSkip} <br>
     * 荷材選択スキップ
     * @return The value of the column 'BOX_SELECT_SKIP'. (NullAllowed)
     */
    public String getBoxSelectSkip() {
        return _boxSelectSkip;
    }

    /**
     * [set] BOX_SELECT_SKIP: {char(1), FK to B_CLASS_DTL, classification=BoxSelectSkip} <br>
     * 荷材選択スキップ
     * @param boxSelectSkip The value of the column 'BOX_SELECT_SKIP'. (NullAllowed)
     */
    public void setBoxSelectSkip(String boxSelectSkip) {
        __modifiedProperties.add("boxSelectSkip");
        this._boxSelectSkip = boxSelectSkip;
    }

    /**
     * [get] DEFAULT_BOX_ID: {IX, bigint(19), FK to M_BOX} <br>
     * デフォルト荷材ID
     * @return The value of the column 'DEFAULT_BOX_ID'. (NullAllowed)
     */
    public Long getDefaultBoxId() {
        return _defaultBoxId;
    }

    /**
     * [set] DEFAULT_BOX_ID: {IX, bigint(19), FK to M_BOX} <br>
     * デフォルト荷材ID
     * @param defaultBoxId The value of the column 'DEFAULT_BOX_ID'. (NullAllowed)
     */
    public void setDefaultBoxId(Long defaultBoxId) {
        __modifiedProperties.add("defaultBoxId");
        this._defaultBoxId = defaultBoxId;
    }

    /**
     * [get] ERROR_SOUND_PLAY_FLG: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=SoundPlayFlg} <br>
     * エラー音再生フラグ
     * @return The value of the column 'ERROR_SOUND_PLAY_FLG'. (NullAllowed)
     */
    public String getErrorSoundPlayFlg() {
        return _errorSoundPlayFlg;
    }

    /**
     * [set] ERROR_SOUND_PLAY_FLG: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=SoundPlayFlg} <br>
     * エラー音再生フラグ
     * @param errorSoundPlayFlg The value of the column 'ERROR_SOUND_PLAY_FLG'. (NullAllowed)
     */
    public void setErrorSoundPlayFlg(String errorSoundPlayFlg) {
        __modifiedProperties.add("errorSoundPlayFlg");
        this._errorSoundPlayFlg = errorSoundPlayFlg;
    }

    /**
     * [get] WARN_SOUND_PLAY_FLG: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=SoundPlayFlg} <br>
     * 警告音再生フラグ
     * @return The value of the column 'WARN_SOUND_PLAY_FLG'. (NullAllowed)
     */
    public String getWarnSoundPlayFlg() {
        return _warnSoundPlayFlg;
    }

    /**
     * [set] WARN_SOUND_PLAY_FLG: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=SoundPlayFlg} <br>
     * 警告音再生フラグ
     * @param warnSoundPlayFlg The value of the column 'WARN_SOUND_PLAY_FLG'. (NullAllowed)
     */
    public void setWarnSoundPlayFlg(String warnSoundPlayFlg) {
        __modifiedProperties.add("warnSoundPlayFlg");
        this._warnSoundPlayFlg = warnSoundPlayFlg;
    }

    /**
     * [get] INSP_SOUND_PLAY_FLG: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=SoundPlayFlg} <br>
     * 検品音再生フラグ
     * @return The value of the column 'INSP_SOUND_PLAY_FLG'. (NullAllowed)
     */
    public String getInspSoundPlayFlg() {
        return _inspSoundPlayFlg;
    }

    /**
     * [set] INSP_SOUND_PLAY_FLG: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=SoundPlayFlg} <br>
     * 検品音再生フラグ
     * @param inspSoundPlayFlg The value of the column 'INSP_SOUND_PLAY_FLG'. (NullAllowed)
     */
    public void setInspSoundPlayFlg(String inspSoundPlayFlg) {
        __modifiedProperties.add("inspSoundPlayFlg");
        this._inspSoundPlayFlg = inspSoundPlayFlg;
    }

    /**
     * [get] INSP_COMP_SOUND_PLAY_FLG: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=SoundPlayFlg} <br>
     * 検品完了音再生フラグ
     * @return The value of the column 'INSP_COMP_SOUND_PLAY_FLG'. (NullAllowed)
     */
    public String getInspCompSoundPlayFlg() {
        return _inspCompSoundPlayFlg;
    }

    /**
     * [set] INSP_COMP_SOUND_PLAY_FLG: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=SoundPlayFlg} <br>
     * 検品完了音再生フラグ
     * @param inspCompSoundPlayFlg The value of the column 'INSP_COMP_SOUND_PLAY_FLG'. (NullAllowed)
     */
    public void setInspCompSoundPlayFlg(String inspCompSoundPlayFlg) {
        __modifiedProperties.add("inspCompSoundPlayFlg");
        this._inspCompSoundPlayFlg = inspCompSoundPlayFlg;
    }

    /**
     * [get] AFTER_TAG_OUT_FLG: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=AfterTagOutFlg} <br>
     * 検品後荷札出力フラグ
     * @return The value of the column 'AFTER_TAG_OUT_FLG'. (NullAllowed)
     */
    public String getAfterTagOutFlg() {
        return _afterTagOutFlg;
    }

    /**
     * [set] AFTER_TAG_OUT_FLG: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=AfterTagOutFlg} <br>
     * 検品後荷札出力フラグ
     * @param afterTagOutFlg The value of the column 'AFTER_TAG_OUT_FLG'. (NullAllowed)
     */
    public void setAfterTagOutFlg(String afterTagOutFlg) {
        __modifiedProperties.add("afterTagOutFlg");
        this._afterTagOutFlg = afterTagOutFlg;
    }

    /**
     * [get] TAG_DELIVERY_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=TagDeliveryOutFlg} <br>
     * 荷札納品書在中出力フラグ
     * @return The value of the column 'TAG_DELIVERY_OUT_FLG'. (NullAllowed)
     */
    public String getTagDeliveryOutFlg() {
        return _tagDeliveryOutFlg;
    }

    /**
     * [set] TAG_DELIVERY_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=TagDeliveryOutFlg} <br>
     * 荷札納品書在中出力フラグ
     * @param tagDeliveryOutFlg The value of the column 'TAG_DELIVERY_OUT_FLG'. (NullAllowed)
     */
    public void setTagDeliveryOutFlg(String tagDeliveryOutFlg) {
        __modifiedProperties.add("tagDeliveryOutFlg");
        this._tagDeliveryOutFlg = tagDeliveryOutFlg;
    }

    /**
     * [get] AFTER_DELIV_SLIP_OUT_FLG: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=AfterTagOutFlg} <br>
     * 検品後納品明細出力フラグ
     * @return The value of the column 'AFTER_DELIV_SLIP_OUT_FLG'. (NullAllowed)
     */
    public String getAfterDelivSlipOutFlg() {
        return _afterDelivSlipOutFlg;
    }

    /**
     * [set] AFTER_DELIV_SLIP_OUT_FLG: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=AfterTagOutFlg} <br>
     * 検品後納品明細出力フラグ
     * @param afterDelivSlipOutFlg The value of the column 'AFTER_DELIV_SLIP_OUT_FLG'. (NullAllowed)
     */
    public void setAfterDelivSlipOutFlg(String afterDelivSlipOutFlg) {
        __modifiedProperties.add("afterDelivSlipOutFlg");
        this._afterDelivSlipOutFlg = afterDelivSlipOutFlg;
    }

    /**
     * [get] AFTER_DELIV_SLIP_OUT_TGT: {char(1), FK to B_CLASS_DTL, classification=AfterDelivSlipOutTgt} <br>
     * 検品後納品明細出力対象
     * @return The value of the column 'AFTER_DELIV_SLIP_OUT_TGT'. (NullAllowed)
     */
    public String getAfterDelivSlipOutTgt() {
        return _afterDelivSlipOutTgt;
    }

    /**
     * [set] AFTER_DELIV_SLIP_OUT_TGT: {char(1), FK to B_CLASS_DTL, classification=AfterDelivSlipOutTgt} <br>
     * 検品後納品明細出力対象
     * @param afterDelivSlipOutTgt The value of the column 'AFTER_DELIV_SLIP_OUT_TGT'. (NullAllowed)
     */
    public void setAfterDelivSlipOutTgt(String afterDelivSlipOutTgt) {
        __modifiedProperties.add("afterDelivSlipOutTgt");
        this._afterDelivSlipOutTgt = afterDelivSlipOutTgt;
    }

    /**
     * [get] SGL_ROW_INSP_AFTER_OUT_CLS: {varchar(30), FK to B_CLASS_DTL, classification=SglRowInspAfterOutCls} <br>
     * 単行出荷検品荷札/納品明細出力区分
     * @return The value of the column 'SGL_ROW_INSP_AFTER_OUT_CLS'. (NullAllowed)
     */
    public String getSglRowInspAfterOutCls() {
        return _sglRowInspAfterOutCls;
    }

    /**
     * [set] SGL_ROW_INSP_AFTER_OUT_CLS: {varchar(30), FK to B_CLASS_DTL, classification=SglRowInspAfterOutCls} <br>
     * 単行出荷検品荷札/納品明細出力区分
     * @param sglRowInspAfterOutCls The value of the column 'SGL_ROW_INSP_AFTER_OUT_CLS'. (NullAllowed)
     */
    public void setSglRowInspAfterOutCls(String sglRowInspAfterOutCls) {
        __modifiedProperties.add("sglRowInspAfterOutCls");
        this._sglRowInspAfterOutCls = sglRowInspAfterOutCls;
    }

    /**
     * [get] HT_CHAR_READ_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=HtCharReadFlg} <br>
     * HT文字認識使用フラグ
     * @return The value of the column 'HT_CHAR_READ_FLG'. (NullAllowed)
     */
    public String getHtCharReadFlg() {
        return _htCharReadFlg;
    }

    /**
     * [set] HT_CHAR_READ_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=HtCharReadFlg} <br>
     * HT文字認識使用フラグ
     * @param htCharReadFlg The value of the column 'HT_CHAR_READ_FLG'. (NullAllowed)
     */
    public void setHtCharReadFlg(String htCharReadFlg) {
        __modifiedProperties.add("htCharReadFlg");
        this._htCharReadFlg = htCharReadFlg;
    }

    /**
     * [get] HT_LOT_INPUT_TYPE: {varchar(30)} <br>
     * HTロット入力方式
     * @return The value of the column 'HT_LOT_INPUT_TYPE'. (NullAllowed)
     */
    public String getHtLotInputType() {
        return _htLotInputType;
    }

    /**
     * [set] HT_LOT_INPUT_TYPE: {varchar(30)} <br>
     * HTロット入力方式
     * @param htLotInputType The value of the column 'HT_LOT_INPUT_TYPE'. (NullAllowed)
     */
    public void setHtLotInputType(String htLotInputType) {
        __modifiedProperties.add("htLotInputType");
        this._htLotInputType = htLotInputType;
    }

    /**
     * [get] HT_SERIAL_INPUT_TYPE: {varchar(30)} <br>
     * HTシリアル入力方式
     * @return The value of the column 'HT_SERIAL_INPUT_TYPE'. (NullAllowed)
     */
    public String getHtSerialInputType() {
        return _htSerialInputType;
    }

    /**
     * [set] HT_SERIAL_INPUT_TYPE: {varchar(30)} <br>
     * HTシリアル入力方式
     * @param htSerialInputType The value of the column 'HT_SERIAL_INPUT_TYPE'. (NullAllowed)
     */
    public void setHtSerialInputType(String htSerialInputType) {
        __modifiedProperties.add("htSerialInputType");
        this._htSerialInputType = htSerialInputType;
    }

    /**
     * [get] INSPECTION_LABEL_OUT_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=InspectionLabelOutFlg} <br>
     * SD検品ラベル出力フラグ
     * @return The value of the column 'INSPECTION_LABEL_OUT_FLG'. (NullAllowed)
     */
    public String getInspectionLabelOutFlg() {
        return _inspectionLabelOutFlg;
    }

    /**
     * [set] INSPECTION_LABEL_OUT_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=InspectionLabelOutFlg} <br>
     * SD検品ラベル出力フラグ
     * @param inspectionLabelOutFlg The value of the column 'INSPECTION_LABEL_OUT_FLG'. (NullAllowed)
     */
    public void setInspectionLabelOutFlg(String inspectionLabelOutFlg) {
        __modifiedProperties.add("inspectionLabelOutFlg");
        this._inspectionLabelOutFlg = inspectionLabelOutFlg;
    }

    /**
     * [get] AUTO_SHIP_INST_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=AutoShipInstFlg} <br>
     * 自動出庫指示フラグ
     * @return The value of the column 'AUTO_SHIP_INST_FLG'. (NullAllowed)
     */
    public String getAutoShipInstFlg() {
        return _autoShipInstFlg;
    }

    /**
     * [set] AUTO_SHIP_INST_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=AutoShipInstFlg} <br>
     * 自動出庫指示フラグ
     * @param autoShipInstFlg The value of the column 'AUTO_SHIP_INST_FLG'. (NullAllowed)
     */
    public void setAutoShipInstFlg(String autoShipInstFlg) {
        __modifiedProperties.add("autoShipInstFlg");
        this._autoShipInstFlg = autoShipInstFlg;
    }

    /**
     * [get] STOCK_OUT_AUTO_INST_FLG: {char(1), FK to B_CLASS_DTL, classification=StockOutAutoInstFlg} <br>
     * 欠品時自動出庫指示フラグ
     * @return The value of the column 'STOCK_OUT_AUTO_INST_FLG'. (NullAllowed)
     */
    public String getStockOutAutoInstFlg() {
        return _stockOutAutoInstFlg;
    }

    /**
     * [set] STOCK_OUT_AUTO_INST_FLG: {char(1), FK to B_CLASS_DTL, classification=StockOutAutoInstFlg} <br>
     * 欠品時自動出庫指示フラグ
     * @param stockOutAutoInstFlg The value of the column 'STOCK_OUT_AUTO_INST_FLG'. (NullAllowed)
     */
    public void setStockOutAutoInstFlg(String stockOutAutoInstFlg) {
        __modifiedProperties.add("stockOutAutoInstFlg");
        this._stockOutAutoInstFlg = stockOutAutoInstFlg;
    }

    /**
     * [get] AUTO_EMG_SET_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=AutoEmgSetFlg} <br>
     * 自動緊急フラグ設定フラグ
     * @return The value of the column 'AUTO_EMG_SET_FLG'. (NullAllowed)
     */
    public String getAutoEmgSetFlg() {
        return _autoEmgSetFlg;
    }

    /**
     * [set] AUTO_EMG_SET_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=AutoEmgSetFlg} <br>
     * 自動緊急フラグ設定フラグ
     * @param autoEmgSetFlg The value of the column 'AUTO_EMG_SET_FLG'. (NullAllowed)
     */
    public void setAutoEmgSetFlg(String autoEmgSetFlg) {
        __modifiedProperties.add("autoEmgSetFlg");
        this._autoEmgSetFlg = autoEmgSetFlg;
    }

    /**
     * [get] AUTO_EMG_SET_TGT: {varchar(30), FK to B_CLASS_DTL, classification=AutoEmgSetTgt} <br>
     * 自動緊急フラグ判断対象
     * @return The value of the column 'AUTO_EMG_SET_TGT'. (NullAllowed)
     */
    public String getAutoEmgSetTgt() {
        return _autoEmgSetTgt;
    }

    /**
     * [set] AUTO_EMG_SET_TGT: {varchar(30), FK to B_CLASS_DTL, classification=AutoEmgSetTgt} <br>
     * 自動緊急フラグ判断対象
     * @param autoEmgSetTgt The value of the column 'AUTO_EMG_SET_TGT'. (NullAllowed)
     */
    public void setAutoEmgSetTgt(String autoEmgSetTgt) {
        __modifiedProperties.add("autoEmgSetTgt");
        this._autoEmgSetTgt = autoEmgSetTgt;
    }

    /**
     * [get] AUTO_EMG_SET_MINUTE: {bigint(19)} <br>
     * 自動緊急フラグ判断時間(分)
     * @return The value of the column 'AUTO_EMG_SET_MINUTE'. (NullAllowed)
     */
    public Long getAutoEmgSetMinute() {
        return _autoEmgSetMinute;
    }

    /**
     * [set] AUTO_EMG_SET_MINUTE: {bigint(19)} <br>
     * 自動緊急フラグ判断時間(分)
     * @param autoEmgSetMinute The value of the column 'AUTO_EMG_SET_MINUTE'. (NullAllowed)
     */
    public void setAutoEmgSetMinute(Long autoEmgSetMinute) {
        __modifiedProperties.add("autoEmgSetMinute");
        this._autoEmgSetMinute = autoEmgSetMinute;
    }

    /**
     * [get] STOCK_OUT_INST_CXL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=StockOutInstCxlFlg} <br>
     * 欠品時出庫指示取消フラグ
     * @return The value of the column 'STOCK_OUT_INST_CXL_FLG'. (NullAllowed)
     */
    public String getStockOutInstCxlFlg() {
        return _stockOutInstCxlFlg;
    }

    /**
     * [set] STOCK_OUT_INST_CXL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=StockOutInstCxlFlg} <br>
     * 欠品時出庫指示取消フラグ
     * @param stockOutInstCxlFlg The value of the column 'STOCK_OUT_INST_CXL_FLG'. (NullAllowed)
     */
    public void setStockOutInstCxlFlg(String stockOutInstCxlFlg) {
        __modifiedProperties.add("stockOutInstCxlFlg");
        this._stockOutInstCxlFlg = stockOutInstCxlFlg;
    }

    /**
     * [get] STOCK_OUT_ALLOC_CLS: {varchar(30), default=[0], FK to B_CLASS_DTL, classification=StockOutAllocCls} <br>
     * 欠品時引当区分
     * @return The value of the column 'STOCK_OUT_ALLOC_CLS'. (NullAllowed)
     */
    public String getStockOutAllocCls() {
        return _stockOutAllocCls;
    }

    /**
     * [set] STOCK_OUT_ALLOC_CLS: {varchar(30), default=[0], FK to B_CLASS_DTL, classification=StockOutAllocCls} <br>
     * 欠品時引当区分
     * @param stockOutAllocCls The value of the column 'STOCK_OUT_ALLOC_CLS'. (NullAllowed)
     */
    public void setStockOutAllocCls(String stockOutAllocCls) {
        __modifiedProperties.add("stockOutAllocCls");
        this._stockOutAllocCls = stockOutAllocCls;
    }

    /**
     * [get] STOCK_OUT_INST_SPLIT_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=StockOutInstSplitFlg} <br>
     * 欠品時出荷指示分離フラグ
     * @return The value of the column 'STOCK_OUT_INST_SPLIT_FLG'. (NullAllowed)
     */
    public String getStockOutInstSplitFlg() {
        return _stockOutInstSplitFlg;
    }

    /**
     * [set] STOCK_OUT_INST_SPLIT_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=StockOutInstSplitFlg} <br>
     * 欠品時出荷指示分離フラグ
     * @param stockOutInstSplitFlg The value of the column 'STOCK_OUT_INST_SPLIT_FLG'. (NullAllowed)
     */
    public void setStockOutInstSplitFlg(String stockOutInstSplitFlg) {
        __modifiedProperties.add("stockOutInstSplitFlg");
        this._stockOutInstSplitFlg = stockOutInstSplitFlg;
    }

    /**
     * [get] CES_INTEGRATION_FLG: {char(1), FK to B_CLASS_DTL, classification=CesIntegrationFlg} <br>
     * CES連携フラグ
     * @return The value of the column 'CES_INTEGRATION_FLG'. (NullAllowed)
     */
    public String getCesIntegrationFlg() {
        return _cesIntegrationFlg;
    }

    /**
     * [set] CES_INTEGRATION_FLG: {char(1), FK to B_CLASS_DTL, classification=CesIntegrationFlg} <br>
     * CES連携フラグ
     * @param cesIntegrationFlg The value of the column 'CES_INTEGRATION_FLG'. (NullAllowed)
     */
    public void setCesIntegrationFlg(String cesIntegrationFlg) {
        __modifiedProperties.add("cesIntegrationFlg");
        this._cesIntegrationFlg = cesIntegrationFlg;
    }

    /**
     * [get] PACKING_SLIP_AUTO_OUTPUT_FLG: {char(1), FK to B_CLASS_DTL, classification=PackingSlipAutoOutputFlg} <br>
     * 納品明細書自動発行フラグ
     * @return The value of the column 'PACKING_SLIP_AUTO_OUTPUT_FLG'. (NullAllowed)
     */
    public String getPackingSlipAutoOutputFlg() {
        return _packingSlipAutoOutputFlg;
    }

    /**
     * [set] PACKING_SLIP_AUTO_OUTPUT_FLG: {char(1), FK to B_CLASS_DTL, classification=PackingSlipAutoOutputFlg} <br>
     * 納品明細書自動発行フラグ
     * @param packingSlipAutoOutputFlg The value of the column 'PACKING_SLIP_AUTO_OUTPUT_FLG'. (NullAllowed)
     */
    public void setPackingSlipAutoOutputFlg(String packingSlipAutoOutputFlg) {
        __modifiedProperties.add("packingSlipAutoOutputFlg");
        this._packingSlipAutoOutputFlg = packingSlipAutoOutputFlg;
    }

    /**
     * [get] CENTER_KBN: {NotNull, char(1), default=[0]} <br>
     * 拠点区分
     * @return The value of the column 'CENTER_KBN'. (NullAllowed)
     */
    public String getCenterKbn() {
        return _centerKbn;
    }

    /**
     * [set] CENTER_KBN: {NotNull, char(1), default=[0]} <br>
     * 拠点区分
     * @param centerKbn The value of the column 'CENTER_KBN'. (NullAllowed)
     */
    public void setCenterKbn(String centerKbn) {
        __modifiedProperties.add("centerKbn");
        this._centerKbn = centerKbn;
    }

    /**
     * [get] DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg} <br>
     * 削除フラグ
     * @return The value of the column 'DEL_FLG'. (NullAllowed)
     */
    public String getDelFlg() {
        return _delFlg;
    }

    /**
     * [set] DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg} <br>
     * 削除フラグ
     * @param delFlg The value of the column 'DEL_FLG'. (NullAllowed)
     */
    public void setDelFlg(String delFlg) {
        __modifiedProperties.add("delFlg");
        this._delFlg = delFlg;
    }

    /**
     * [get] VERSION_NO: {NotNull, bigint(19), default=[(0)]} <br>
     * バージョンNo.
     * @return The value of the column 'VERSION_NO'. (NullAllowed)
     */
    public Long getVersionNo() {
        return _versionNo;
    }

    /**
     * [set] VERSION_NO: {NotNull, bigint(19), default=[(0)]} <br>
     * バージョンNo.
     * @param versionNo The value of the column 'VERSION_NO'. (NullAllowed)
     */
    public void setVersionNo(Long versionNo) {
        __modifiedProperties.add("versionNo");
        this._versionNo = versionNo;
    }

    /**
     * [get] CONTROL_NO: {bigint(19)} <br>
     * コントロールNo.
     * @return The value of the column 'CONTROL_NO'. (NullAllowed)
     */
    public Long getControlNo() {
        return _controlNo;
    }

    /**
     * [set] CONTROL_NO: {bigint(19)} <br>
     * コントロールNo.
     * @param controlNo The value of the column 'CONTROL_NO'. (NullAllowed)
     */
    public void setControlNo(Long controlNo) {
        __modifiedProperties.add("controlNo");
        this._controlNo = controlNo;
    }

    /**
     * [get] ADD_DT: {datetime2(26, 6)} <br>
     * 登録日時
     * @return The value of the column 'ADD_DT'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getAddDt() {
        return _addDt;
    }

    /**
     * [set] ADD_DT: {datetime2(26, 6)} <br>
     * 登録日時
     * @param addDt The value of the column 'ADD_DT'. (NullAllowed)
     */
    public void setAddDt(java.sql.Timestamp addDt) {
        __modifiedProperties.add("addDt");
        this._addDt = addDt;
    }

    /**
     * [get] ADD_USER: {varchar(255)} <br>
     * 登録ユーザ
     * @return The value of the column 'ADD_USER'. (NullAllowed)
     */
    public String getAddUser() {
        return _addUser;
    }

    /**
     * [set] ADD_USER: {varchar(255)} <br>
     * 登録ユーザ
     * @param addUser The value of the column 'ADD_USER'. (NullAllowed)
     */
    public void setAddUser(String addUser) {
        __modifiedProperties.add("addUser");
        this._addUser = addUser;
    }

    /**
     * [get] ADD_PROCESS: {varchar(4000)} <br>
     * 登録プロセス
     * @return The value of the column 'ADD_PROCESS'. (NullAllowed)
     */
    public String getAddProcess() {
        return _addProcess;
    }

    /**
     * [set] ADD_PROCESS: {varchar(4000)} <br>
     * 登録プロセス
     * @param addProcess The value of the column 'ADD_PROCESS'. (NullAllowed)
     */
    public void setAddProcess(String addProcess) {
        __modifiedProperties.add("addProcess");
        this._addProcess = addProcess;
    }

    /**
     * [get] UPD_DT: {datetime2(26, 6)} <br>
     * 更新日時
     * @return The value of the column 'UPD_DT'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getUpdDt() {
        return _updDt;
    }

    /**
     * [set] UPD_DT: {datetime2(26, 6)} <br>
     * 更新日時
     * @param updDt The value of the column 'UPD_DT'. (NullAllowed)
     */
    public void setUpdDt(java.sql.Timestamp updDt) {
        __modifiedProperties.add("updDt");
        this._updDt = updDt;
    }

    /**
     * [get] UPD_USER: {varchar(255)} <br>
     * 更新ユーザ
     * @return The value of the column 'UPD_USER'. (NullAllowed)
     */
    public String getUpdUser() {
        return _updUser;
    }

    /**
     * [set] UPD_USER: {varchar(255)} <br>
     * 更新ユーザ
     * @param updUser The value of the column 'UPD_USER'. (NullAllowed)
     */
    public void setUpdUser(String updUser) {
        __modifiedProperties.add("updUser");
        this._updUser = updUser;
    }

    /**
     * [get] UPD_PROCESS: {varchar(4000)} <br>
     * 更新プロセス
     * @return The value of the column 'UPD_PROCESS'. (NullAllowed)
     */
    public String getUpdProcess() {
        return _updProcess;
    }

    /**
     * [set] UPD_PROCESS: {varchar(4000)} <br>
     * 更新プロセス
     * @param updProcess The value of the column 'UPD_PROCESS'. (NullAllowed)
     */
    public void setUpdProcess(String updProcess) {
        __modifiedProperties.add("updProcess");
        this._updProcess = updProcess;
    }

}
