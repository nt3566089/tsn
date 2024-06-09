package com.oneslogi.base.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import com.oneslogi.base.dbflute.allcommon.EntityDefinedCommonColumn;
import com.oneslogi.base.dbflute.allcommon.DBMetaInstanceHandler;
import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The entity of M_PARAM as TABLE. <br>
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
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long clientCenterId = entity.getClientCenterId();
 * Long deliveryCourseId = entity.getDeliveryCourseId();
 * String storeDtFlg = entity.getStoreDtFlg();
 * String storeNoFlg = entity.getStoreNoFlg();
 * String mergeCls = entity.getMergeCls();
 * Long tKeepingDays = entity.getTKeepingDays();
 * Long hKeepingDays = entity.getHKeepingDays();
 * Long dKeepingDays = entity.getDKeepingDays();
 * String overStoreNumFlg = entity.getOverStoreNumFlg();
 * String pastStoreDtFlg = entity.getPastStoreDtFlg();
 * String useHtShipFlg = entity.getUseHtShipFlg();
 * String allocSortKey = entity.getAllocSortKey();
 * String rgReplenishUnitCls = entity.getRgReplenishUnitCls();
 * String emReplenishUnitCls = entity.getEmReplenishUnitCls();
 * Long emReplenishZoneId = entity.getEmReplenishZoneId();
 * String emReplenishAllocCls = entity.getEmReplenishAllocCls();
 * String packingCalCls = entity.getPackingCalCls();
 * String packingProcessCls = entity.getPackingProcessCls();
 * String productPartPacking = entity.getProductPartPacking();
 * String decimalProductPacking = entity.getDecimalProductPacking();
 * Long packingBoxGroupId = entity.getPackingBoxGroupId();
 * String totalPicFlg = entity.getTotalPicFlg();
 * String multiPicCls = entity.getMultiPicCls();
 * Long backetColNum = entity.getBacketColNum();
 * Long backetRowNum = entity.getBacketRowNum();
 * String casePicFlg = entity.getCasePicFlg();
 * String sglRowPicFlg = entity.getSglRowPicFlg();
 * Long sglRowPicMaxInstNum = entity.getSglRowPicMaxInstNum();
 * String picMthdRcmdFlg = entity.getPicMthdRcmdFlg();
 * String picMthdRcmdBreakKey = entity.getPicMthdRcmdBreakKey();
 * String picMthdRcmdApiKey = entity.getPicMthdRcmdApiKey();
 * String picMthdRcmdMltPlOut = entity.getPicMthdRcmdMltPlOut();
 * String picMthdRcmdSplSlOut = entity.getPicMthdRcmdSplSlOut();
 * String productLabelOutUnit = entity.getProductLabelOutUnit();
 * String resultAfterProductLabel = entity.getResultAfterProductLabel();
 * String resultAfterProductTarget = entity.getResultAfterProductTarget();
 * String productLabelJanBarcode = entity.getProductLabelJanBarcode();
 * String productLabelProdBarcode = entity.getProductLabelProdBarcode();
 * String productLabelJanStartbit = entity.getProductLabelJanStartbit();
 * String productLabelJanEndbit = entity.getProductLabelJanEndbit();
 * String productLabelProdStartbit = entity.getProductLabelProdStartbit();
 * String productLabelProdEndbit = entity.getProductLabelProdEndbit();
 * String boxSelectSkip = entity.getBoxSelectSkip();
 * Long defaultBoxId = entity.getDefaultBoxId();
 * String errorSoundPlayFlg = entity.getErrorSoundPlayFlg();
 * String warnSoundPlayFlg = entity.getWarnSoundPlayFlg();
 * String inspSoundPlayFlg = entity.getInspSoundPlayFlg();
 * String inspCompSoundPlayFlg = entity.getInspCompSoundPlayFlg();
 * String afterTagOutFlg = entity.getAfterTagOutFlg();
 * String tagDeliveryOutFlg = entity.getTagDeliveryOutFlg();
 * String afterDelivSlipOutFlg = entity.getAfterDelivSlipOutFlg();
 * String afterDelivSlipOutTgt = entity.getAfterDelivSlipOutTgt();
 * String sglRowInspAfterOutCls = entity.getSglRowInspAfterOutCls();
 * String htCharReadFlg = entity.getHtCharReadFlg();
 * String htLotInputType = entity.getHtLotInputType();
 * String htSerialInputType = entity.getHtSerialInputType();
 * String inspectionLabelOutFlg = entity.getInspectionLabelOutFlg();
 * String autoShipInstFlg = entity.getAutoShipInstFlg();
 * String stockOutAutoInstFlg = entity.getStockOutAutoInstFlg();
 * String autoEmgSetFlg = entity.getAutoEmgSetFlg();
 * String autoEmgSetTgt = entity.getAutoEmgSetTgt();
 * Long autoEmgSetMinute = entity.getAutoEmgSetMinute();
 * String stockOutInstCxlFlg = entity.getStockOutInstCxlFlg();
 * String stockOutAllocCls = entity.getStockOutAllocCls();
 * String stockOutInstSplitFlg = entity.getStockOutInstSplitFlg();
 * String cesIntegrationFlg = entity.getCesIntegrationFlg();
 * String packingSlipAutoOutputFlg = entity.getPackingSlipAutoOutputFlg();
 * String centerKbn = entity.getCenterKbn();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setClientCenterId(clientCenterId);
 * entity.setDeliveryCourseId(deliveryCourseId);
 * entity.setStoreDtFlg(storeDtFlg);
 * entity.setStoreNoFlg(storeNoFlg);
 * entity.setMergeCls(mergeCls);
 * entity.setTKeepingDays(tKeepingDays);
 * entity.setHKeepingDays(hKeepingDays);
 * entity.setDKeepingDays(dKeepingDays);
 * entity.setOverStoreNumFlg(overStoreNumFlg);
 * entity.setPastStoreDtFlg(pastStoreDtFlg);
 * entity.setUseHtShipFlg(useHtShipFlg);
 * entity.setAllocSortKey(allocSortKey);
 * entity.setRgReplenishUnitCls(rgReplenishUnitCls);
 * entity.setEmReplenishUnitCls(emReplenishUnitCls);
 * entity.setEmReplenishZoneId(emReplenishZoneId);
 * entity.setEmReplenishAllocCls(emReplenishAllocCls);
 * entity.setPackingCalCls(packingCalCls);
 * entity.setPackingProcessCls(packingProcessCls);
 * entity.setProductPartPacking(productPartPacking);
 * entity.setDecimalProductPacking(decimalProductPacking);
 * entity.setPackingBoxGroupId(packingBoxGroupId);
 * entity.setTotalPicFlg(totalPicFlg);
 * entity.setMultiPicCls(multiPicCls);
 * entity.setBacketColNum(backetColNum);
 * entity.setBacketRowNum(backetRowNum);
 * entity.setCasePicFlg(casePicFlg);
 * entity.setSglRowPicFlg(sglRowPicFlg);
 * entity.setSglRowPicMaxInstNum(sglRowPicMaxInstNum);
 * entity.setPicMthdRcmdFlg(picMthdRcmdFlg);
 * entity.setPicMthdRcmdBreakKey(picMthdRcmdBreakKey);
 * entity.setPicMthdRcmdApiKey(picMthdRcmdApiKey);
 * entity.setPicMthdRcmdMltPlOut(picMthdRcmdMltPlOut);
 * entity.setPicMthdRcmdSplSlOut(picMthdRcmdSplSlOut);
 * entity.setProductLabelOutUnit(productLabelOutUnit);
 * entity.setResultAfterProductLabel(resultAfterProductLabel);
 * entity.setResultAfterProductTarget(resultAfterProductTarget);
 * entity.setProductLabelJanBarcode(productLabelJanBarcode);
 * entity.setProductLabelProdBarcode(productLabelProdBarcode);
 * entity.setProductLabelJanStartbit(productLabelJanStartbit);
 * entity.setProductLabelJanEndbit(productLabelJanEndbit);
 * entity.setProductLabelProdStartbit(productLabelProdStartbit);
 * entity.setProductLabelProdEndbit(productLabelProdEndbit);
 * entity.setBoxSelectSkip(boxSelectSkip);
 * entity.setDefaultBoxId(defaultBoxId);
 * entity.setErrorSoundPlayFlg(errorSoundPlayFlg);
 * entity.setWarnSoundPlayFlg(warnSoundPlayFlg);
 * entity.setInspSoundPlayFlg(inspSoundPlayFlg);
 * entity.setInspCompSoundPlayFlg(inspCompSoundPlayFlg);
 * entity.setAfterTagOutFlg(afterTagOutFlg);
 * entity.setTagDeliveryOutFlg(tagDeliveryOutFlg);
 * entity.setAfterDelivSlipOutFlg(afterDelivSlipOutFlg);
 * entity.setAfterDelivSlipOutTgt(afterDelivSlipOutTgt);
 * entity.setSglRowInspAfterOutCls(sglRowInspAfterOutCls);
 * entity.setHtCharReadFlg(htCharReadFlg);
 * entity.setHtLotInputType(htLotInputType);
 * entity.setHtSerialInputType(htSerialInputType);
 * entity.setInspectionLabelOutFlg(inspectionLabelOutFlg);
 * entity.setAutoShipInstFlg(autoShipInstFlg);
 * entity.setStockOutAutoInstFlg(stockOutAutoInstFlg);
 * entity.setAutoEmgSetFlg(autoEmgSetFlg);
 * entity.setAutoEmgSetTgt(autoEmgSetTgt);
 * entity.setAutoEmgSetMinute(autoEmgSetMinute);
 * entity.setStockOutInstCxlFlg(stockOutInstCxlFlg);
 * entity.setStockOutAllocCls(stockOutAllocCls);
 * entity.setStockOutInstSplitFlg(stockOutInstSplitFlg);
 * entity.setCesIntegrationFlg(cesIntegrationFlg);
 * entity.setPackingSlipAutoOutputFlg(packingSlipAutoOutputFlg);
 * entity.setCenterKbn(centerKbn);
 * entity.setDelFlg(delFlg);
 * entity.setVersionNo(versionNo);
 * entity.setControlNo(controlNo);
 * entity.setAddDt(addDt);
 * entity.setAddUser(addUser);
 * entity.setAddProcess(addProcess);
 * entity.setUpdDt(updDt);
 * entity.setUpdUser(updUser);
 * entity.setUpdProcess(updProcess);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsMParam extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** CLIENT_CENTER_ID: {PK, ID, NotNull, bigint identity(19), FK to M_CLIENT_CENTER} */
    protected Long _clientCenterId;

    /** DELIVERY_COURSE_ID: {IX, bigint(19), FK to M_DELIVERY_COURSE} */
    protected Long _deliveryCourseId;

    /** STORE_DT_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=StoreDtFlg} */
    protected String _storeDtFlg;

    /** STORE_NO_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=StoreNoFlg} */
    protected String _storeNoFlg;

    /** MERGE_CLS: {NotNull, varchar(30), default=[02], FK to B_CLASS_DTL, classification=MergeCls} */
    protected String _mergeCls;

    /** T_KEEPING_DAYS: {NotNull, bigint(19), default=[(0)]} */
    protected Long _tKeepingDays;

    /** H_KEEPING_DAYS: {NotNull, bigint(19), default=[(0)]} */
    protected Long _hKeepingDays;

    /** D_KEEPING_DAYS: {NotNull, bigint(19), default=[(0)]} */
    protected Long _dKeepingDays;

    /** OVER_STORE_NUM_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=OverStoreNumFlg} */
    protected String _overStoreNumFlg;

    /** PAST_STORE_DT_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=PastStoreDtFlg} */
    protected String _pastStoreDtFlg;

    /** USE_HT_SHIP_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=UseHtShipFlg} */
    protected String _useHtShipFlg;

    /** ALLOC_SORT_KEY: {varchar(100)} */
    protected String _allocSortKey;

    /** RG_REPLENISH_UNIT_CLS: {varchar(30), default=[1], FK to B_CLASS_DTL, classification=ReplenishUnitCls} */
    protected String _rgReplenishUnitCls;

    /** EM_REPLENISH_UNIT_CLS: {varchar(30), default=[0], FK to B_CLASS_DTL, classification=ReplenishUnitCls} */
    protected String _emReplenishUnitCls;

    /** EM_REPLENISH_ZONE_ID: {IX, bigint(19), FK to M_ZONE} */
    protected Long _emReplenishZoneId;

    /** EM_REPLENISH_ALLOC_CLS: {varchar(30), FK to B_CLASS_DTL, classification=ReplenishAllocCls} */
    protected String _emReplenishAllocCls;

    /** PACKING_CAL_CLS: {varchar(30), default=[0], FK to B_CLASS_DTL, classification=PackingCalCls} */
    protected String _packingCalCls;

    /** PACKING_PROCESS_CLS: {varchar(30), default=[0], FK to B_CLASS_DTL, classification=PackingProcessCls} */
    protected String _packingProcessCls;

    /** PRODUCT_PART_PACKING: {varchar(30), default=[0], FK to B_CLASS_DTL, classification=ProductPartPacking} */
    protected String _productPartPacking;

    /** DECIMAL_PRODUCT_PACKING: {varchar(30), FK to B_CLASS_DTL, classification=DecimalProductPacking} */
    protected String _decimalProductPacking;

    /** PACKING_BOX_GROUP_ID: {IX, bigint(19), FK to M_BOX_GRP} */
    protected Long _packingBoxGroupId;

    /** TOTAL_PIC_FLG: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=TotalPicFlg} */
    protected String _totalPicFlg;

    /** MULTI_PIC_CLS: {NotNull, varchar(30), default=[0], FK to B_CLASS_DTL, classification=MultiPicCls} */
    protected String _multiPicCls;

    /** BACKET_COL_NUM: {bigint(19), default=[(0)]} */
    protected Long _backetColNum;

    /** BACKET_ROW_NUM: {bigint(19), default=[(0)]} */
    protected Long _backetRowNum;

    /** CASE_PIC_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=CasePicFlg} */
    protected String _casePicFlg;

    /** SGL_ROW_PIC_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=SglRowPicFlg} */
    protected String _sglRowPicFlg;

    /** SGL_ROW_PIC_MAX_INST_NUM: {bigint(19)} */
    protected Long _sglRowPicMaxInstNum;

    /** PIC_MTHD_RCMD_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=PicMthdRcmdFlg} */
    protected String _picMthdRcmdFlg;

    /** PIC_MTHD_RCMD_BREAK_KEY: {varchar(30), FK to B_CLASS_DTL, classification=PicMthdRcmdBreakKey} */
    protected String _picMthdRcmdBreakKey;

    /** PIC_MTHD_RCMD_API_KEY: {varchar(255)} */
    protected String _picMthdRcmdApiKey;

    /** PIC_MTHD_RCMD_MLT_PL_OUT: {char(1), FK to B_CLASS_DTL, classification=PicMthdRcmdListOut} */
    protected String _picMthdRcmdMltPlOut;

    /** PIC_MTHD_RCMD_SPL_SL_OUT: {char(1), FK to B_CLASS_DTL, classification=PicMthdRcmdListOut} */
    protected String _picMthdRcmdSplSlOut;

    /** PRODUCT_LABEL_OUT_UNIT: {char(1), FK to B_CLASS_DTL, classification=ProductLabelOutUnit} */
    protected String _productLabelOutUnit;

    /** RESULT_AFTER_PRODUCT_LABEL: {char(1), FK to B_CLASS_DTL, classification=ResultAfterProductLabel} */
    protected String _resultAfterProductLabel;

    /** RESULT_AFTER_PRODUCT_TARGET: {char(1), FK to B_CLASS_DTL, classification=ResultAfterProductTarget} */
    protected String _resultAfterProductTarget;

    /** PRODUCT_LABEL_JAN_BARCODE: {varchar(30), FK to B_CLASS_DTL, classification=ProductLabelJanBarcode} */
    protected String _productLabelJanBarcode;

    /** PRODUCT_LABEL_PROD_BARCODE: {varchar(30), FK to B_CLASS_DTL, classification=ProductLabelProdBarcode} */
    protected String _productLabelProdBarcode;

    /** PRODUCT_LABEL_JAN_STARTBIT: {varchar(30)} */
    protected String _productLabelJanStartbit;

    /** PRODUCT_LABEL_JAN_ENDBIT: {varchar(30)} */
    protected String _productLabelJanEndbit;

    /** PRODUCT_LABEL_PROD_STARTBIT: {varchar(30)} */
    protected String _productLabelProdStartbit;

    /** PRODUCT_LABEL_PROD_ENDBIT: {varchar(30)} */
    protected String _productLabelProdEndbit;

    /** BOX_SELECT_SKIP: {char(1), FK to B_CLASS_DTL, classification=BoxSelectSkip} */
    protected String _boxSelectSkip;

    /** DEFAULT_BOX_ID: {IX, bigint(19), FK to M_BOX} */
    protected Long _defaultBoxId;

    /** ERROR_SOUND_PLAY_FLG: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=SoundPlayFlg} */
    protected String _errorSoundPlayFlg;

    /** WARN_SOUND_PLAY_FLG: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=SoundPlayFlg} */
    protected String _warnSoundPlayFlg;

    /** INSP_SOUND_PLAY_FLG: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=SoundPlayFlg} */
    protected String _inspSoundPlayFlg;

    /** INSP_COMP_SOUND_PLAY_FLG: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=SoundPlayFlg} */
    protected String _inspCompSoundPlayFlg;

    /** AFTER_TAG_OUT_FLG: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=AfterTagOutFlg} */
    protected String _afterTagOutFlg;

    /** TAG_DELIVERY_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=TagDeliveryOutFlg} */
    protected String _tagDeliveryOutFlg;

    /** AFTER_DELIV_SLIP_OUT_FLG: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=AfterTagOutFlg} */
    protected String _afterDelivSlipOutFlg;

    /** AFTER_DELIV_SLIP_OUT_TGT: {char(1), FK to B_CLASS_DTL, classification=AfterDelivSlipOutTgt} */
    protected String _afterDelivSlipOutTgt;

    /** SGL_ROW_INSP_AFTER_OUT_CLS: {varchar(30), FK to B_CLASS_DTL, classification=SglRowInspAfterOutCls} */
    protected String _sglRowInspAfterOutCls;

    /** HT_CHAR_READ_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=HtCharReadFlg} */
    protected String _htCharReadFlg;

    /** HT_LOT_INPUT_TYPE: {varchar(30)} */
    protected String _htLotInputType;

    /** HT_SERIAL_INPUT_TYPE: {varchar(30)} */
    protected String _htSerialInputType;

    /** INSPECTION_LABEL_OUT_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=InspectionLabelOutFlg} */
    protected String _inspectionLabelOutFlg;

    /** AUTO_SHIP_INST_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=AutoShipInstFlg} */
    protected String _autoShipInstFlg;

    /** STOCK_OUT_AUTO_INST_FLG: {char(1), FK to B_CLASS_DTL, classification=StockOutAutoInstFlg} */
    protected String _stockOutAutoInstFlg;

    /** AUTO_EMG_SET_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=AutoEmgSetFlg} */
    protected String _autoEmgSetFlg;

    /** AUTO_EMG_SET_TGT: {varchar(30), FK to B_CLASS_DTL, classification=AutoEmgSetTgt} */
    protected String _autoEmgSetTgt;

    /** AUTO_EMG_SET_MINUTE: {bigint(19)} */
    protected Long _autoEmgSetMinute;

    /** STOCK_OUT_INST_CXL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=StockOutInstCxlFlg} */
    protected String _stockOutInstCxlFlg;

    /** STOCK_OUT_ALLOC_CLS: {varchar(30), default=[0], FK to B_CLASS_DTL, classification=StockOutAllocCls} */
    protected String _stockOutAllocCls;

    /** STOCK_OUT_INST_SPLIT_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=StockOutInstSplitFlg} */
    protected String _stockOutInstSplitFlg;

    /** CES_INTEGRATION_FLG: {char(1), FK to B_CLASS_DTL, classification=CesIntegrationFlg} */
    protected String _cesIntegrationFlg;

    /** PACKING_SLIP_AUTO_OUTPUT_FLG: {char(1), FK to B_CLASS_DTL, classification=PackingSlipAutoOutputFlg} */
    protected String _packingSlipAutoOutputFlg;

    /** CENTER_KBN: {NotNull, char(1), default=[0]} */
    protected String _centerKbn;

    /** DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg} */
    protected String _delFlg;

    /** VERSION_NO: {NotNull, bigint(19), default=[(0)]} */
    protected Long _versionNo;

    /** CONTROL_NO: {bigint(19)} */
    protected Long _controlNo;

    /** ADD_DT: {datetime2(26, 6)} */
    protected java.sql.Timestamp _addDt;

    /** ADD_USER: {varchar(255)} */
    protected String _addUser;

    /** ADD_PROCESS: {varchar(4000)} */
    protected String _addProcess;

    /** UPD_DT: {datetime2(26, 6)} */
    protected java.sql.Timestamp _updDt;

    /** UPD_USER: {varchar(255)} */
    protected String _updUser;

    /** UPD_PROCESS: {varchar(4000)} */
    protected String _updProcess;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "M_PARAM";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============

    private boolean sequenceToPrimaryKey = true;

    public boolean needsSequenceToPrimaryKey() {
        return sequenceToPrimaryKey;
    }

    /**
     * Sequenceオブジェクトによる採番を制御する。
     * falseを指定した場合、空の場合のみ自動採番する。
     * turueを指定した場合、空以外でも自動採番する。
     */
    public void setSequenceToPrimaryKey(boolean value) {
        sequenceToPrimaryKey = value;
    }

    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_clientCenterId == null) { return false; }
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of storeDtFlg as the classification of StoreDtFlg. <br>
     * STORE_DT_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=StoreDtFlg} <br>
     * 入庫日管理フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.StoreDtFlg getStoreDtFlgAsStoreDtFlg() {
        return CDef.StoreDtFlg.codeOf(getStoreDtFlg());
    }

    /**
     * Set the value of storeDtFlg as the classification of StoreDtFlg. <br>
     * STORE_DT_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=StoreDtFlg} <br>
     * 入庫日管理フラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setStoreDtFlgAsStoreDtFlg(CDef.StoreDtFlg cdef) {
        setStoreDtFlg(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of storeNoFlg as the classification of StoreNoFlg. <br>
     * STORE_NO_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=StoreNoFlg} <br>
     * 入庫No.管理フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.StoreNoFlg getStoreNoFlgAsStoreNoFlg() {
        return CDef.StoreNoFlg.codeOf(getStoreNoFlg());
    }

    /**
     * Set the value of storeNoFlg as the classification of StoreNoFlg. <br>
     * STORE_NO_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=StoreNoFlg} <br>
     * 入庫No.管理フラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setStoreNoFlgAsStoreNoFlg(CDef.StoreNoFlg cdef) {
        setStoreNoFlg(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of mergeCls as the classification of MergeCls. <br>
     * MERGE_CLS: {NotNull, varchar(30), default=[02], FK to B_CLASS_DTL, classification=MergeCls} <br>
     * 入庫No.マージ区分
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.MergeCls getMergeClsAsMergeCls() {
        return CDef.MergeCls.codeOf(getMergeCls());
    }

    /**
     * Set the value of mergeCls as the classification of MergeCls. <br>
     * MERGE_CLS: {NotNull, varchar(30), default=[02], FK to B_CLASS_DTL, classification=MergeCls} <br>
     * 入庫No.マージ区分
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setMergeClsAsMergeCls(CDef.MergeCls cdef) {
        setMergeCls(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of overStoreNumFlg as the classification of OverStoreNumFlg. <br>
     * OVER_STORE_NUM_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=OverStoreNumFlg} <br>
     * HT/SD過入荷可フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.OverStoreNumFlg getOverStoreNumFlgAsOverStoreNumFlg() {
        return CDef.OverStoreNumFlg.codeOf(getOverStoreNumFlg());
    }

    /**
     * Set the value of overStoreNumFlg as the classification of OverStoreNumFlg. <br>
     * OVER_STORE_NUM_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=OverStoreNumFlg} <br>
     * HT/SD過入荷可フラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setOverStoreNumFlgAsOverStoreNumFlg(CDef.OverStoreNumFlg cdef) {
        setOverStoreNumFlg(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of pastStoreDtFlg as the classification of PastStoreDtFlg. <br>
     * PAST_STORE_DT_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=PastStoreDtFlg} <br>
     * HT/SD過去日入力可フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.PastStoreDtFlg getPastStoreDtFlgAsPastStoreDtFlg() {
        return CDef.PastStoreDtFlg.codeOf(getPastStoreDtFlg());
    }

    /**
     * Set the value of pastStoreDtFlg as the classification of PastStoreDtFlg. <br>
     * PAST_STORE_DT_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=PastStoreDtFlg} <br>
     * HT/SD過去日入力可フラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setPastStoreDtFlgAsPastStoreDtFlg(CDef.PastStoreDtFlg cdef) {
        setPastStoreDtFlg(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of useHtShipFlg as the classification of UseHtShipFlg. <br>
     * USE_HT_SHIP_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=UseHtShipFlg} <br>
     * HT/SDケースピック使用フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.UseHtShipFlg getUseHtShipFlgAsUseHtShipFlg() {
        return CDef.UseHtShipFlg.codeOf(getUseHtShipFlg());
    }

    /**
     * Set the value of useHtShipFlg as the classification of UseHtShipFlg. <br>
     * USE_HT_SHIP_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=UseHtShipFlg} <br>
     * HT/SDケースピック使用フラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setUseHtShipFlgAsUseHtShipFlg(CDef.UseHtShipFlg cdef) {
        setUseHtShipFlg(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of rgReplenishUnitCls as the classification of ReplenishUnitCls. <br>
     * RG_REPLENISH_UNIT_CLS: {varchar(30), default=[1], FK to B_CLASS_DTL, classification=ReplenishUnitCls} <br>
     * 補充単位区分
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.ReplenishUnitCls getRgReplenishUnitClsAsReplenishUnitCls() {
        return CDef.ReplenishUnitCls.codeOf(getRgReplenishUnitCls());
    }

    /**
     * Set the value of rgReplenishUnitCls as the classification of ReplenishUnitCls. <br>
     * RG_REPLENISH_UNIT_CLS: {varchar(30), default=[1], FK to B_CLASS_DTL, classification=ReplenishUnitCls} <br>
     * 補充単位区分
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setRgReplenishUnitClsAsReplenishUnitCls(CDef.ReplenishUnitCls cdef) {
        setRgReplenishUnitCls(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of emReplenishUnitCls as the classification of ReplenishUnitCls. <br>
     * EM_REPLENISH_UNIT_CLS: {varchar(30), default=[0], FK to B_CLASS_DTL, classification=ReplenishUnitCls} <br>
     * 補充単位区分
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.ReplenishUnitCls getEmReplenishUnitClsAsReplenishUnitCls() {
        return CDef.ReplenishUnitCls.codeOf(getEmReplenishUnitCls());
    }

    /**
     * Set the value of emReplenishUnitCls as the classification of ReplenishUnitCls. <br>
     * EM_REPLENISH_UNIT_CLS: {varchar(30), default=[0], FK to B_CLASS_DTL, classification=ReplenishUnitCls} <br>
     * 補充単位区分
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setEmReplenishUnitClsAsReplenishUnitCls(CDef.ReplenishUnitCls cdef) {
        setEmReplenishUnitCls(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of emReplenishAllocCls as the classification of ReplenishAllocCls. <br>
     * EM_REPLENISH_ALLOC_CLS: {varchar(30), FK to B_CLASS_DTL, classification=ReplenishAllocCls} <br>
     * 補充ロケ割付区分
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.ReplenishAllocCls getEmReplenishAllocClsAsReplenishAllocCls() {
        return CDef.ReplenishAllocCls.codeOf(getEmReplenishAllocCls());
    }

    /**
     * Set the value of emReplenishAllocCls as the classification of ReplenishAllocCls. <br>
     * EM_REPLENISH_ALLOC_CLS: {varchar(30), FK to B_CLASS_DTL, classification=ReplenishAllocCls} <br>
     * 補充ロケ割付区分
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setEmReplenishAllocClsAsReplenishAllocCls(CDef.ReplenishAllocCls cdef) {
        setEmReplenishAllocCls(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of packingCalCls as the classification of PackingCalCls. <br>
     * PACKING_CAL_CLS: {varchar(30), default=[0], FK to B_CLASS_DTL, classification=PackingCalCls} <br>
     * 梱包計算処理区分
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.PackingCalCls getPackingCalClsAsPackingCalCls() {
        return CDef.PackingCalCls.codeOf(getPackingCalCls());
    }

    /**
     * Set the value of packingCalCls as the classification of PackingCalCls. <br>
     * PACKING_CAL_CLS: {varchar(30), default=[0], FK to B_CLASS_DTL, classification=PackingCalCls} <br>
     * 梱包計算処理区分
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setPackingCalClsAsPackingCalCls(CDef.PackingCalCls cdef) {
        setPackingCalCls(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of packingProcessCls as the classification of PackingProcessCls. <br>
     * PACKING_PROCESS_CLS: {varchar(30), default=[0], FK to B_CLASS_DTL, classification=PackingProcessCls} <br>
     * 梱包方法
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.PackingProcessCls getPackingProcessClsAsPackingProcessCls() {
        return CDef.PackingProcessCls.codeOf(getPackingProcessCls());
    }

    /**
     * Set the value of packingProcessCls as the classification of PackingProcessCls. <br>
     * PACKING_PROCESS_CLS: {varchar(30), default=[0], FK to B_CLASS_DTL, classification=PackingProcessCls} <br>
     * 梱包方法
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setPackingProcessClsAsPackingProcessCls(CDef.PackingProcessCls cdef) {
        setPackingProcessCls(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of productPartPacking as the classification of ProductPartPacking. <br>
     * PRODUCT_PART_PACKING: {varchar(30), default=[0], FK to B_CLASS_DTL, classification=ProductPartPacking} <br>
     * 商品毎別梱包
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.ProductPartPacking getProductPartPackingAsProductPartPacking() {
        return CDef.ProductPartPacking.codeOf(getProductPartPacking());
    }

    /**
     * Set the value of productPartPacking as the classification of ProductPartPacking. <br>
     * PRODUCT_PART_PACKING: {varchar(30), default=[0], FK to B_CLASS_DTL, classification=ProductPartPacking} <br>
     * 商品毎別梱包
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setProductPartPackingAsProductPartPacking(CDef.ProductPartPacking cdef) {
        setProductPartPacking(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of decimalProductPacking as the classification of DecimalProductPacking. <br>
     * DECIMAL_PRODUCT_PACKING: {varchar(30), FK to B_CLASS_DTL, classification=DecimalProductPacking} <br>
     * 小数管理商品梱包単位
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.DecimalProductPacking getDecimalProductPackingAsDecimalProductPacking() {
        return CDef.DecimalProductPacking.codeOf(getDecimalProductPacking());
    }

    /**
     * Set the value of decimalProductPacking as the classification of DecimalProductPacking. <br>
     * DECIMAL_PRODUCT_PACKING: {varchar(30), FK to B_CLASS_DTL, classification=DecimalProductPacking} <br>
     * 小数管理商品梱包単位
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setDecimalProductPackingAsDecimalProductPacking(CDef.DecimalProductPacking cdef) {
        setDecimalProductPacking(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of totalPicFlg as the classification of TotalPicFlg. <br>
     * TOTAL_PIC_FLG: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=TotalPicFlg} <br>
     * トータルピックフラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.TotalPicFlg getTotalPicFlgAsTotalPicFlg() {
        return CDef.TotalPicFlg.codeOf(getTotalPicFlg());
    }

    /**
     * Set the value of totalPicFlg as the classification of TotalPicFlg. <br>
     * TOTAL_PIC_FLG: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=TotalPicFlg} <br>
     * トータルピックフラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setTotalPicFlgAsTotalPicFlg(CDef.TotalPicFlg cdef) {
        setTotalPicFlg(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of multiPicCls as the classification of MultiPicCls. <br>
     * MULTI_PIC_CLS: {NotNull, varchar(30), default=[0], FK to B_CLASS_DTL, classification=MultiPicCls} <br>
     * マルチピック計算区分
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.MultiPicCls getMultiPicClsAsMultiPicCls() {
        return CDef.MultiPicCls.codeOf(getMultiPicCls());
    }

    /**
     * Set the value of multiPicCls as the classification of MultiPicCls. <br>
     * MULTI_PIC_CLS: {NotNull, varchar(30), default=[0], FK to B_CLASS_DTL, classification=MultiPicCls} <br>
     * マルチピック計算区分
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setMultiPicClsAsMultiPicCls(CDef.MultiPicCls cdef) {
        setMultiPicCls(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of casePicFlg as the classification of CasePicFlg. <br>
     * CASE_PIC_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=CasePicFlg} <br>
     * ケースピッキングフラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.CasePicFlg getCasePicFlgAsCasePicFlg() {
        return CDef.CasePicFlg.codeOf(getCasePicFlg());
    }

    /**
     * Set the value of casePicFlg as the classification of CasePicFlg. <br>
     * CASE_PIC_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=CasePicFlg} <br>
     * ケースピッキングフラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setCasePicFlgAsCasePicFlg(CDef.CasePicFlg cdef) {
        setCasePicFlg(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of sglRowPicFlg as the classification of SglRowPicFlg. <br>
     * SGL_ROW_PIC_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=SglRowPicFlg} <br>
     * 単行ピックフラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.SglRowPicFlg getSglRowPicFlgAsSglRowPicFlg() {
        return CDef.SglRowPicFlg.codeOf(getSglRowPicFlg());
    }

    /**
     * Set the value of sglRowPicFlg as the classification of SglRowPicFlg. <br>
     * SGL_ROW_PIC_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=SglRowPicFlg} <br>
     * 単行ピックフラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setSglRowPicFlgAsSglRowPicFlg(CDef.SglRowPicFlg cdef) {
        setSglRowPicFlg(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of picMthdRcmdFlg as the classification of PicMthdRcmdFlg. <br>
     * PIC_MTHD_RCMD_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=PicMthdRcmdFlg} <br>
     * 最適ピック提案フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.PicMthdRcmdFlg getPicMthdRcmdFlgAsPicMthdRcmdFlg() {
        return CDef.PicMthdRcmdFlg.codeOf(getPicMthdRcmdFlg());
    }

    /**
     * Set the value of picMthdRcmdFlg as the classification of PicMthdRcmdFlg. <br>
     * PIC_MTHD_RCMD_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=PicMthdRcmdFlg} <br>
     * 最適ピック提案フラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setPicMthdRcmdFlgAsPicMthdRcmdFlg(CDef.PicMthdRcmdFlg cdef) {
        setPicMthdRcmdFlg(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of picMthdRcmdBreakKey as the classification of PicMthdRcmdBreakKey. <br>
     * PIC_MTHD_RCMD_BREAK_KEY: {varchar(30), FK to B_CLASS_DTL, classification=PicMthdRcmdBreakKey} <br>
     * 最適ピック提案ブレイクキー
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.PicMthdRcmdBreakKey getPicMthdRcmdBreakKeyAsPicMthdRcmdBreakKey() {
        return CDef.PicMthdRcmdBreakKey.codeOf(getPicMthdRcmdBreakKey());
    }

    /**
     * Set the value of picMthdRcmdBreakKey as the classification of PicMthdRcmdBreakKey. <br>
     * PIC_MTHD_RCMD_BREAK_KEY: {varchar(30), FK to B_CLASS_DTL, classification=PicMthdRcmdBreakKey} <br>
     * 最適ピック提案ブレイクキー
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setPicMthdRcmdBreakKeyAsPicMthdRcmdBreakKey(CDef.PicMthdRcmdBreakKey cdef) {
        setPicMthdRcmdBreakKey(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of picMthdRcmdMltPlOut as the classification of PicMthdRcmdListOut. <br>
     * PIC_MTHD_RCMD_MLT_PL_OUT: {char(1), FK to B_CLASS_DTL, classification=PicMthdRcmdListOut} <br>
     * 最適ピックリスト出力フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.PicMthdRcmdListOut getPicMthdRcmdMltPlOutAsPicMthdRcmdListOut() {
        return CDef.PicMthdRcmdListOut.codeOf(getPicMthdRcmdMltPlOut());
    }

    /**
     * Set the value of picMthdRcmdMltPlOut as the classification of PicMthdRcmdListOut. <br>
     * PIC_MTHD_RCMD_MLT_PL_OUT: {char(1), FK to B_CLASS_DTL, classification=PicMthdRcmdListOut} <br>
     * 最適ピックリスト出力フラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setPicMthdRcmdMltPlOutAsPicMthdRcmdListOut(CDef.PicMthdRcmdListOut cdef) {
        setPicMthdRcmdMltPlOut(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of picMthdRcmdSplSlOut as the classification of PicMthdRcmdListOut. <br>
     * PIC_MTHD_RCMD_SPL_SL_OUT: {char(1), FK to B_CLASS_DTL, classification=PicMthdRcmdListOut} <br>
     * 最適ピックリスト出力フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.PicMthdRcmdListOut getPicMthdRcmdSplSlOutAsPicMthdRcmdListOut() {
        return CDef.PicMthdRcmdListOut.codeOf(getPicMthdRcmdSplSlOut());
    }

    /**
     * Set the value of picMthdRcmdSplSlOut as the classification of PicMthdRcmdListOut. <br>
     * PIC_MTHD_RCMD_SPL_SL_OUT: {char(1), FK to B_CLASS_DTL, classification=PicMthdRcmdListOut} <br>
     * 最適ピックリスト出力フラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setPicMthdRcmdSplSlOutAsPicMthdRcmdListOut(CDef.PicMthdRcmdListOut cdef) {
        setPicMthdRcmdSplSlOut(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of productLabelOutUnit as the classification of ProductLabelOutUnit. <br>
     * PRODUCT_LABEL_OUT_UNIT: {char(1), FK to B_CLASS_DTL, classification=ProductLabelOutUnit} <br>
     * 商品ラベル出力単位
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.ProductLabelOutUnit getProductLabelOutUnitAsProductLabelOutUnit() {
        return CDef.ProductLabelOutUnit.codeOf(getProductLabelOutUnit());
    }

    /**
     * Set the value of productLabelOutUnit as the classification of ProductLabelOutUnit. <br>
     * PRODUCT_LABEL_OUT_UNIT: {char(1), FK to B_CLASS_DTL, classification=ProductLabelOutUnit} <br>
     * 商品ラベル出力単位
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setProductLabelOutUnitAsProductLabelOutUnit(CDef.ProductLabelOutUnit cdef) {
        setProductLabelOutUnit(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of resultAfterProductLabel as the classification of ResultAfterProductLabel. <br>
     * RESULT_AFTER_PRODUCT_LABEL: {char(1), FK to B_CLASS_DTL, classification=ResultAfterProductLabel} <br>
     * 実績入力後入庫/商品ラベル出力
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.ResultAfterProductLabel getResultAfterProductLabelAsResultAfterProductLabel() {
        return CDef.ResultAfterProductLabel.codeOf(getResultAfterProductLabel());
    }

    /**
     * Set the value of resultAfterProductLabel as the classification of ResultAfterProductLabel. <br>
     * RESULT_AFTER_PRODUCT_LABEL: {char(1), FK to B_CLASS_DTL, classification=ResultAfterProductLabel} <br>
     * 実績入力後入庫/商品ラベル出力
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setResultAfterProductLabelAsResultAfterProductLabel(CDef.ResultAfterProductLabel cdef) {
        setResultAfterProductLabel(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of resultAfterProductTarget as the classification of ResultAfterProductTarget. <br>
     * RESULT_AFTER_PRODUCT_TARGET: {char(1), FK to B_CLASS_DTL, classification=ResultAfterProductTarget} <br>
     * 実績入力後入庫/商品ラベル出力対象
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.ResultAfterProductTarget getResultAfterProductTargetAsResultAfterProductTarget() {
        return CDef.ResultAfterProductTarget.codeOf(getResultAfterProductTarget());
    }

    /**
     * Set the value of resultAfterProductTarget as the classification of ResultAfterProductTarget. <br>
     * RESULT_AFTER_PRODUCT_TARGET: {char(1), FK to B_CLASS_DTL, classification=ResultAfterProductTarget} <br>
     * 実績入力後入庫/商品ラベル出力対象
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setResultAfterProductTargetAsResultAfterProductTarget(CDef.ResultAfterProductTarget cdef) {
        setResultAfterProductTarget(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of productLabelJanBarcode as the classification of ProductLabelJanBarcode. <br>
     * PRODUCT_LABEL_JAN_BARCODE: {varchar(30), FK to B_CLASS_DTL, classification=ProductLabelJanBarcode} <br>
     * 商品ラベルソースCDバーコード種別
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.ProductLabelJanBarcode getProductLabelJanBarcodeAsProductLabelJanBarcode() {
        return CDef.ProductLabelJanBarcode.codeOf(getProductLabelJanBarcode());
    }

    /**
     * Set the value of productLabelJanBarcode as the classification of ProductLabelJanBarcode. <br>
     * PRODUCT_LABEL_JAN_BARCODE: {varchar(30), FK to B_CLASS_DTL, classification=ProductLabelJanBarcode} <br>
     * 商品ラベルソースCDバーコード種別
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setProductLabelJanBarcodeAsProductLabelJanBarcode(CDef.ProductLabelJanBarcode cdef) {
        setProductLabelJanBarcode(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of productLabelProdBarcode as the classification of ProductLabelProdBarcode. <br>
     * PRODUCT_LABEL_PROD_BARCODE: {varchar(30), FK to B_CLASS_DTL, classification=ProductLabelProdBarcode} <br>
     * 商品ラベル商品CDバーコード種別
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.ProductLabelProdBarcode getProductLabelProdBarcodeAsProductLabelProdBarcode() {
        return CDef.ProductLabelProdBarcode.codeOf(getProductLabelProdBarcode());
    }

    /**
     * Set the value of productLabelProdBarcode as the classification of ProductLabelProdBarcode. <br>
     * PRODUCT_LABEL_PROD_BARCODE: {varchar(30), FK to B_CLASS_DTL, classification=ProductLabelProdBarcode} <br>
     * 商品ラベル商品CDバーコード種別
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setProductLabelProdBarcodeAsProductLabelProdBarcode(CDef.ProductLabelProdBarcode cdef) {
        setProductLabelProdBarcode(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of boxSelectSkip as the classification of BoxSelectSkip. <br>
     * BOX_SELECT_SKIP: {char(1), FK to B_CLASS_DTL, classification=BoxSelectSkip} <br>
     * 荷材選択スキップ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.BoxSelectSkip getBoxSelectSkipAsBoxSelectSkip() {
        return CDef.BoxSelectSkip.codeOf(getBoxSelectSkip());
    }

    /**
     * Set the value of boxSelectSkip as the classification of BoxSelectSkip. <br>
     * BOX_SELECT_SKIP: {char(1), FK to B_CLASS_DTL, classification=BoxSelectSkip} <br>
     * 荷材選択スキップ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setBoxSelectSkipAsBoxSelectSkip(CDef.BoxSelectSkip cdef) {
        setBoxSelectSkip(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of errorSoundPlayFlg as the classification of SoundPlayFlg. <br>
     * ERROR_SOUND_PLAY_FLG: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=SoundPlayFlg} <br>
     * 操作音再生フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.SoundPlayFlg getErrorSoundPlayFlgAsSoundPlayFlg() {
        return CDef.SoundPlayFlg.codeOf(getErrorSoundPlayFlg());
    }

    /**
     * Set the value of errorSoundPlayFlg as the classification of SoundPlayFlg. <br>
     * ERROR_SOUND_PLAY_FLG: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=SoundPlayFlg} <br>
     * 操作音再生フラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setErrorSoundPlayFlgAsSoundPlayFlg(CDef.SoundPlayFlg cdef) {
        setErrorSoundPlayFlg(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of warnSoundPlayFlg as the classification of SoundPlayFlg. <br>
     * WARN_SOUND_PLAY_FLG: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=SoundPlayFlg} <br>
     * 操作音再生フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.SoundPlayFlg getWarnSoundPlayFlgAsSoundPlayFlg() {
        return CDef.SoundPlayFlg.codeOf(getWarnSoundPlayFlg());
    }

    /**
     * Set the value of warnSoundPlayFlg as the classification of SoundPlayFlg. <br>
     * WARN_SOUND_PLAY_FLG: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=SoundPlayFlg} <br>
     * 操作音再生フラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setWarnSoundPlayFlgAsSoundPlayFlg(CDef.SoundPlayFlg cdef) {
        setWarnSoundPlayFlg(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of inspSoundPlayFlg as the classification of SoundPlayFlg. <br>
     * INSP_SOUND_PLAY_FLG: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=SoundPlayFlg} <br>
     * 操作音再生フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.SoundPlayFlg getInspSoundPlayFlgAsSoundPlayFlg() {
        return CDef.SoundPlayFlg.codeOf(getInspSoundPlayFlg());
    }

    /**
     * Set the value of inspSoundPlayFlg as the classification of SoundPlayFlg. <br>
     * INSP_SOUND_PLAY_FLG: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=SoundPlayFlg} <br>
     * 操作音再生フラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setInspSoundPlayFlgAsSoundPlayFlg(CDef.SoundPlayFlg cdef) {
        setInspSoundPlayFlg(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of inspCompSoundPlayFlg as the classification of SoundPlayFlg. <br>
     * INSP_COMP_SOUND_PLAY_FLG: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=SoundPlayFlg} <br>
     * 操作音再生フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.SoundPlayFlg getInspCompSoundPlayFlgAsSoundPlayFlg() {
        return CDef.SoundPlayFlg.codeOf(getInspCompSoundPlayFlg());
    }

    /**
     * Set the value of inspCompSoundPlayFlg as the classification of SoundPlayFlg. <br>
     * INSP_COMP_SOUND_PLAY_FLG: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=SoundPlayFlg} <br>
     * 操作音再生フラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setInspCompSoundPlayFlgAsSoundPlayFlg(CDef.SoundPlayFlg cdef) {
        setInspCompSoundPlayFlg(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of afterTagOutFlg as the classification of AfterTagOutFlg. <br>
     * AFTER_TAG_OUT_FLG: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=AfterTagOutFlg} <br>
     * 検品後荷札出力フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.AfterTagOutFlg getAfterTagOutFlgAsAfterTagOutFlg() {
        return CDef.AfterTagOutFlg.codeOf(getAfterTagOutFlg());
    }

    /**
     * Set the value of afterTagOutFlg as the classification of AfterTagOutFlg. <br>
     * AFTER_TAG_OUT_FLG: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=AfterTagOutFlg} <br>
     * 検品後荷札出力フラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setAfterTagOutFlgAsAfterTagOutFlg(CDef.AfterTagOutFlg cdef) {
        setAfterTagOutFlg(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of tagDeliveryOutFlg as the classification of TagDeliveryOutFlg. <br>
     * TAG_DELIVERY_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=TagDeliveryOutFlg} <br>
     * 荷札納品書在中出力フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.TagDeliveryOutFlg getTagDeliveryOutFlgAsTagDeliveryOutFlg() {
        return CDef.TagDeliveryOutFlg.codeOf(getTagDeliveryOutFlg());
    }

    /**
     * Set the value of tagDeliveryOutFlg as the classification of TagDeliveryOutFlg. <br>
     * TAG_DELIVERY_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=TagDeliveryOutFlg} <br>
     * 荷札納品書在中出力フラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setTagDeliveryOutFlgAsTagDeliveryOutFlg(CDef.TagDeliveryOutFlg cdef) {
        setTagDeliveryOutFlg(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of afterDelivSlipOutFlg as the classification of AfterTagOutFlg. <br>
     * AFTER_DELIV_SLIP_OUT_FLG: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=AfterTagOutFlg} <br>
     * 検品後荷札出力フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.AfterTagOutFlg getAfterDelivSlipOutFlgAsAfterTagOutFlg() {
        return CDef.AfterTagOutFlg.codeOf(getAfterDelivSlipOutFlg());
    }

    /**
     * Set the value of afterDelivSlipOutFlg as the classification of AfterTagOutFlg. <br>
     * AFTER_DELIV_SLIP_OUT_FLG: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=AfterTagOutFlg} <br>
     * 検品後荷札出力フラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setAfterDelivSlipOutFlgAsAfterTagOutFlg(CDef.AfterTagOutFlg cdef) {
        setAfterDelivSlipOutFlg(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of afterDelivSlipOutTgt as the classification of AfterDelivSlipOutTgt. <br>
     * AFTER_DELIV_SLIP_OUT_TGT: {char(1), FK to B_CLASS_DTL, classification=AfterDelivSlipOutTgt} <br>
     * 検品後納品明細出力対象
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.AfterDelivSlipOutTgt getAfterDelivSlipOutTgtAsAfterDelivSlipOutTgt() {
        return CDef.AfterDelivSlipOutTgt.codeOf(getAfterDelivSlipOutTgt());
    }

    /**
     * Set the value of afterDelivSlipOutTgt as the classification of AfterDelivSlipOutTgt. <br>
     * AFTER_DELIV_SLIP_OUT_TGT: {char(1), FK to B_CLASS_DTL, classification=AfterDelivSlipOutTgt} <br>
     * 検品後納品明細出力対象
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setAfterDelivSlipOutTgtAsAfterDelivSlipOutTgt(CDef.AfterDelivSlipOutTgt cdef) {
        setAfterDelivSlipOutTgt(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of sglRowInspAfterOutCls as the classification of SglRowInspAfterOutCls. <br>
     * SGL_ROW_INSP_AFTER_OUT_CLS: {varchar(30), FK to B_CLASS_DTL, classification=SglRowInspAfterOutCls} <br>
     * 単行出荷検品荷札/納品明細出力区分
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.SglRowInspAfterOutCls getSglRowInspAfterOutClsAsSglRowInspAfterOutCls() {
        return CDef.SglRowInspAfterOutCls.codeOf(getSglRowInspAfterOutCls());
    }

    /**
     * Set the value of sglRowInspAfterOutCls as the classification of SglRowInspAfterOutCls. <br>
     * SGL_ROW_INSP_AFTER_OUT_CLS: {varchar(30), FK to B_CLASS_DTL, classification=SglRowInspAfterOutCls} <br>
     * 単行出荷検品荷札/納品明細出力区分
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setSglRowInspAfterOutClsAsSglRowInspAfterOutCls(CDef.SglRowInspAfterOutCls cdef) {
        setSglRowInspAfterOutCls(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of htCharReadFlg as the classification of HtCharReadFlg. <br>
     * HT_CHAR_READ_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=HtCharReadFlg} <br>
     * HT文字認識使用フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.HtCharReadFlg getHtCharReadFlgAsHtCharReadFlg() {
        return CDef.HtCharReadFlg.codeOf(getHtCharReadFlg());
    }

    /**
     * Set the value of htCharReadFlg as the classification of HtCharReadFlg. <br>
     * HT_CHAR_READ_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=HtCharReadFlg} <br>
     * HT文字認識使用フラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setHtCharReadFlgAsHtCharReadFlg(CDef.HtCharReadFlg cdef) {
        setHtCharReadFlg(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of inspectionLabelOutFlg as the classification of InspectionLabelOutFlg. <br>
     * INSPECTION_LABEL_OUT_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=InspectionLabelOutFlg} <br>
     * 検品ラベル出力
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.InspectionLabelOutFlg getInspectionLabelOutFlgAsInspectionLabelOutFlg() {
        return CDef.InspectionLabelOutFlg.codeOf(getInspectionLabelOutFlg());
    }

    /**
     * Set the value of inspectionLabelOutFlg as the classification of InspectionLabelOutFlg. <br>
     * INSPECTION_LABEL_OUT_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=InspectionLabelOutFlg} <br>
     * 検品ラベル出力
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setInspectionLabelOutFlgAsInspectionLabelOutFlg(CDef.InspectionLabelOutFlg cdef) {
        setInspectionLabelOutFlg(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of autoShipInstFlg as the classification of AutoShipInstFlg. <br>
     * AUTO_SHIP_INST_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=AutoShipInstFlg} <br>
     * 自動出庫指示フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.AutoShipInstFlg getAutoShipInstFlgAsAutoShipInstFlg() {
        return CDef.AutoShipInstFlg.codeOf(getAutoShipInstFlg());
    }

    /**
     * Set the value of autoShipInstFlg as the classification of AutoShipInstFlg. <br>
     * AUTO_SHIP_INST_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=AutoShipInstFlg} <br>
     * 自動出庫指示フラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setAutoShipInstFlgAsAutoShipInstFlg(CDef.AutoShipInstFlg cdef) {
        setAutoShipInstFlg(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of stockOutAutoInstFlg as the classification of StockOutAutoInstFlg. <br>
     * STOCK_OUT_AUTO_INST_FLG: {char(1), FK to B_CLASS_DTL, classification=StockOutAutoInstFlg} <br>
     * 欠品時自動出庫指示フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.StockOutAutoInstFlg getStockOutAutoInstFlgAsStockOutAutoInstFlg() {
        return CDef.StockOutAutoInstFlg.codeOf(getStockOutAutoInstFlg());
    }

    /**
     * Set the value of stockOutAutoInstFlg as the classification of StockOutAutoInstFlg. <br>
     * STOCK_OUT_AUTO_INST_FLG: {char(1), FK to B_CLASS_DTL, classification=StockOutAutoInstFlg} <br>
     * 欠品時自動出庫指示フラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setStockOutAutoInstFlgAsStockOutAutoInstFlg(CDef.StockOutAutoInstFlg cdef) {
        setStockOutAutoInstFlg(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of autoEmgSetFlg as the classification of AutoEmgSetFlg. <br>
     * AUTO_EMG_SET_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=AutoEmgSetFlg} <br>
     * 自動緊急フラグ設定フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.AutoEmgSetFlg getAutoEmgSetFlgAsAutoEmgSetFlg() {
        return CDef.AutoEmgSetFlg.codeOf(getAutoEmgSetFlg());
    }

    /**
     * Set the value of autoEmgSetFlg as the classification of AutoEmgSetFlg. <br>
     * AUTO_EMG_SET_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=AutoEmgSetFlg} <br>
     * 自動緊急フラグ設定フラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setAutoEmgSetFlgAsAutoEmgSetFlg(CDef.AutoEmgSetFlg cdef) {
        setAutoEmgSetFlg(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of autoEmgSetTgt as the classification of AutoEmgSetTgt. <br>
     * AUTO_EMG_SET_TGT: {varchar(30), FK to B_CLASS_DTL, classification=AutoEmgSetTgt} <br>
     * 自動緊急フラグ判断対象
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.AutoEmgSetTgt getAutoEmgSetTgtAsAutoEmgSetTgt() {
        return CDef.AutoEmgSetTgt.codeOf(getAutoEmgSetTgt());
    }

    /**
     * Set the value of autoEmgSetTgt as the classification of AutoEmgSetTgt. <br>
     * AUTO_EMG_SET_TGT: {varchar(30), FK to B_CLASS_DTL, classification=AutoEmgSetTgt} <br>
     * 自動緊急フラグ判断対象
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setAutoEmgSetTgtAsAutoEmgSetTgt(CDef.AutoEmgSetTgt cdef) {
        setAutoEmgSetTgt(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of stockOutInstCxlFlg as the classification of StockOutInstCxlFlg. <br>
     * STOCK_OUT_INST_CXL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=StockOutInstCxlFlg} <br>
     * 欠品時出庫指示取消フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.StockOutInstCxlFlg getStockOutInstCxlFlgAsStockOutInstCxlFlg() {
        return CDef.StockOutInstCxlFlg.codeOf(getStockOutInstCxlFlg());
    }

    /**
     * Set the value of stockOutInstCxlFlg as the classification of StockOutInstCxlFlg. <br>
     * STOCK_OUT_INST_CXL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=StockOutInstCxlFlg} <br>
     * 欠品時出庫指示取消フラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setStockOutInstCxlFlgAsStockOutInstCxlFlg(CDef.StockOutInstCxlFlg cdef) {
        setStockOutInstCxlFlg(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of stockOutAllocCls as the classification of StockOutAllocCls. <br>
     * STOCK_OUT_ALLOC_CLS: {varchar(30), default=[0], FK to B_CLASS_DTL, classification=StockOutAllocCls} <br>
     * 欠品時引当区分
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.StockOutAllocCls getStockOutAllocClsAsStockOutAllocCls() {
        return CDef.StockOutAllocCls.codeOf(getStockOutAllocCls());
    }

    /**
     * Set the value of stockOutAllocCls as the classification of StockOutAllocCls. <br>
     * STOCK_OUT_ALLOC_CLS: {varchar(30), default=[0], FK to B_CLASS_DTL, classification=StockOutAllocCls} <br>
     * 欠品時引当区分
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setStockOutAllocClsAsStockOutAllocCls(CDef.StockOutAllocCls cdef) {
        setStockOutAllocCls(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of stockOutInstSplitFlg as the classification of StockOutInstSplitFlg. <br>
     * STOCK_OUT_INST_SPLIT_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=StockOutInstSplitFlg} <br>
     * 欠品時出荷指示分離フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.StockOutInstSplitFlg getStockOutInstSplitFlgAsStockOutInstSplitFlg() {
        return CDef.StockOutInstSplitFlg.codeOf(getStockOutInstSplitFlg());
    }

    /**
     * Set the value of stockOutInstSplitFlg as the classification of StockOutInstSplitFlg. <br>
     * STOCK_OUT_INST_SPLIT_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=StockOutInstSplitFlg} <br>
     * 欠品時出荷指示分離フラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setStockOutInstSplitFlgAsStockOutInstSplitFlg(CDef.StockOutInstSplitFlg cdef) {
        setStockOutInstSplitFlg(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of cesIntegrationFlg as the classification of CesIntegrationFlg. <br>
     * CES_INTEGRATION_FLG: {char(1), FK to B_CLASS_DTL, classification=CesIntegrationFlg} <br>
     * CES連携フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.CesIntegrationFlg getCesIntegrationFlgAsCesIntegrationFlg() {
        return CDef.CesIntegrationFlg.codeOf(getCesIntegrationFlg());
    }

    /**
     * Set the value of cesIntegrationFlg as the classification of CesIntegrationFlg. <br>
     * CES_INTEGRATION_FLG: {char(1), FK to B_CLASS_DTL, classification=CesIntegrationFlg} <br>
     * CES連携フラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setCesIntegrationFlgAsCesIntegrationFlg(CDef.CesIntegrationFlg cdef) {
        setCesIntegrationFlg(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of packingSlipAutoOutputFlg as the classification of PackingSlipAutoOutputFlg. <br>
     * PACKING_SLIP_AUTO_OUTPUT_FLG: {char(1), FK to B_CLASS_DTL, classification=PackingSlipAutoOutputFlg} <br>
     * 納品明細書自動発行フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.PackingSlipAutoOutputFlg getPackingSlipAutoOutputFlgAsPackingSlipAutoOutputFlg() {
        return CDef.PackingSlipAutoOutputFlg.codeOf(getPackingSlipAutoOutputFlg());
    }

    /**
     * Set the value of packingSlipAutoOutputFlg as the classification of PackingSlipAutoOutputFlg. <br>
     * PACKING_SLIP_AUTO_OUTPUT_FLG: {char(1), FK to B_CLASS_DTL, classification=PackingSlipAutoOutputFlg} <br>
     * 納品明細書自動発行フラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setPackingSlipAutoOutputFlgAsPackingSlipAutoOutputFlg(CDef.PackingSlipAutoOutputFlg cdef) {
        setPackingSlipAutoOutputFlg(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of delFlg as the classification of DelFlg. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg} <br>
     * 削除フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.DelFlg getDelFlgAsDelFlg() {
        return CDef.DelFlg.codeOf(getDelFlg());
    }

    /**
     * Set the value of delFlg as the classification of DelFlg. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg} <br>
     * 削除フラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setDelFlgAsDelFlg(CDef.DelFlg cdef) {
        setDelFlg(cdef != null ? cdef.code() : null);
    }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of storeDtFlg as $0 (0). <br>
     * $0: 管理しない
     */
    public void setStoreDtFlg_$0() {
        setStoreDtFlgAsStoreDtFlg(CDef.StoreDtFlg.$0);
    }

    /**
     * Set the value of storeDtFlg as $1 (1). <br>
     * $1: 管理する
     */
    public void setStoreDtFlg_$1() {
        setStoreDtFlgAsStoreDtFlg(CDef.StoreDtFlg.$1);
    }

    /**
     * Set the value of storeNoFlg as $0 (0). <br>
     * $0: 管理しない
     */
    public void setStoreNoFlg_$0() {
        setStoreNoFlgAsStoreNoFlg(CDef.StoreNoFlg.$0);
    }

    /**
     * Set the value of storeNoFlg as $1 (1). <br>
     * $1: 管理する
     */
    public void setStoreNoFlg_$1() {
        setStoreNoFlgAsStoreNoFlg(CDef.StoreNoFlg.$1);
    }

    /**
     * Set the value of mergeCls as $00 (00). <br>
     * $00: マージしない
     */
    public void setMergeCls_$00() {
        setMergeClsAsMergeCls(CDef.MergeCls.$00);
    }

    /**
     * Set the value of mergeCls as $01 (01). <br>
     * $01: ピックロケのみ自動マージ
     */
    public void setMergeCls_$01() {
        setMergeClsAsMergeCls(CDef.MergeCls.$01);
    }

    /**
     * Set the value of mergeCls as $02 (02). <br>
     * $02: 自動マージ
     */
    public void setMergeCls_$02() {
        setMergeClsAsMergeCls(CDef.MergeCls.$02);
    }

    /**
     * Set the value of overStoreNumFlg as $0 (0). <br>
     * $0: 不可
     */
    public void setOverStoreNumFlg_$0() {
        setOverStoreNumFlgAsOverStoreNumFlg(CDef.OverStoreNumFlg.$0);
    }

    /**
     * Set the value of overStoreNumFlg as $1 (1). <br>
     * $1: 可能
     */
    public void setOverStoreNumFlg_$1() {
        setOverStoreNumFlgAsOverStoreNumFlg(CDef.OverStoreNumFlg.$1);
    }

    /**
     * Set the value of pastStoreDtFlg as $0 (0). <br>
     * $0: 不可
     */
    public void setPastStoreDtFlg_$0() {
        setPastStoreDtFlgAsPastStoreDtFlg(CDef.PastStoreDtFlg.$0);
    }

    /**
     * Set the value of pastStoreDtFlg as $1 (1). <br>
     * $1: 可能
     */
    public void setPastStoreDtFlg_$1() {
        setPastStoreDtFlgAsPastStoreDtFlg(CDef.PastStoreDtFlg.$1);
    }

    /**
     * Set the value of useHtShipFlg as $0 (0). <br>
     * $0: 未使用
     */
    public void setUseHtShipFlg_$0() {
        setUseHtShipFlgAsUseHtShipFlg(CDef.UseHtShipFlg.$0);
    }

    /**
     * Set the value of useHtShipFlg as $1 (1). <br>
     * $1: 使用
     */
    public void setUseHtShipFlg_$1() {
        setUseHtShipFlgAsUseHtShipFlg(CDef.UseHtShipFlg.$1);
    }

    /**
     * Set the value of rgReplenishUnitCls as $0 (0). <br>
     * $0: 必要数
     */
    public void setRgReplenishUnitCls_$0() {
        setRgReplenishUnitClsAsReplenishUnitCls(CDef.ReplenishUnitCls.$0);
    }

    /**
     * Set the value of rgReplenishUnitCls as $1 (1). <br>
     * $1: 最大格納数荷姿切上
     */
    public void setRgReplenishUnitCls_$1() {
        setRgReplenishUnitClsAsReplenishUnitCls(CDef.ReplenishUnitCls.$1);
    }

    /**
     * Set the value of emReplenishUnitCls as $0 (0). <br>
     * $0: 必要数
     */
    public void setEmReplenishUnitCls_$0() {
        setEmReplenishUnitClsAsReplenishUnitCls(CDef.ReplenishUnitCls.$0);
    }

    /**
     * Set the value of emReplenishUnitCls as $1 (1). <br>
     * $1: 最大格納数荷姿切上
     */
    public void setEmReplenishUnitCls_$1() {
        setEmReplenishUnitClsAsReplenishUnitCls(CDef.ReplenishUnitCls.$1);
    }

    /**
     * Set the value of emReplenishAllocCls as $0 (0). <br>
     * $0: バッチ毎同一SKUは同一ロケに割付
     */
    public void setEmReplenishAllocCls_$0() {
        setEmReplenishAllocClsAsReplenishAllocCls(CDef.ReplenishAllocCls.$0);
    }

    /**
     * Set the value of emReplenishAllocCls as $1 (1). <br>
     * $1: 補充毎に別ロケを割付
     */
    public void setEmReplenishAllocCls_$1() {
        setEmReplenishAllocClsAsReplenishAllocCls(CDef.ReplenishAllocCls.$1);
    }

    /**
     * Set the value of packingCalCls as $0 (0). <br>
     * $0: 梱包計算無
     */
    public void setPackingCalCls_$0() {
        setPackingCalClsAsPackingCalCls(CDef.PackingCalCls.$0);
    }

    /**
     * Set the value of packingCalCls as $1 (1). <br>
     * $1: 容積と重量による梱包計算
     */
    public void setPackingCalCls_$1() {
        setPackingCalClsAsPackingCalCls(CDef.PackingCalCls.$1);
    }

    /**
     * Set the value of packingProcessCls as $0 (0). <br>
     * $0: 受取側考慮(出荷指示昇順)
     */
    public void setPackingProcessCls_$0() {
        setPackingProcessClsAsPackingProcessCls(CDef.PackingProcessCls.$0);
    }

    /**
     * Set the value of packingProcessCls as $1 (1). <br>
     * $1: なるべく詰める(容積降順)
     */
    public void setPackingProcessCls_$1() {
        setPackingProcessClsAsPackingProcessCls(CDef.PackingProcessCls.$1);
    }

    /**
     * Set the value of productPartPacking as $0 (0). <br>
     * $0: 不可
     */
    public void setProductPartPacking_$0() {
        setProductPartPackingAsProductPartPacking(CDef.ProductPartPacking.$0);
    }

    /**
     * Set the value of productPartPacking as $1 (1). <br>
     * $1: 可能
     */
    public void setProductPartPacking_$1() {
        setProductPartPackingAsProductPartPacking(CDef.ProductPartPacking.$1);
    }

    /**
     * Set the value of decimalProductPacking as $0 (0). <br>
     * $0: 荷姿単位で1梱包
     */
    public void setDecimalProductPacking_$0() {
        setDecimalProductPackingAsDecimalProductPacking(CDef.DecimalProductPacking.$0);
    }

    /**
     * Set the value of decimalProductPacking as $1 (1). <br>
     * $1: 商品単位で1梱包
     */
    public void setDecimalProductPacking_$1() {
        setDecimalProductPackingAsDecimalProductPacking(CDef.DecimalProductPacking.$1);
    }

    /**
     * Set the value of totalPicFlg as $0 (0). <br>
     * $0: トータルピック無
     */
    public void setTotalPicFlg_$0() {
        setTotalPicFlgAsTotalPicFlg(CDef.TotalPicFlg.$0);
    }

    /**
     * Set the value of totalPicFlg as $1 (1). <br>
     * $1: トータルピック有
     */
    public void setTotalPicFlg_$1() {
        setTotalPicFlgAsTotalPicFlg(CDef.TotalPicFlg.$1);
    }

    /**
     * Set the value of multiPicCls as $0 (0). <br>
     * $0: マルチピック計算無
     */
    public void setMultiPicCls_$0() {
        setMultiPicClsAsMultiPicCls(CDef.MultiPicCls.$0);
    }

    /**
     * Set the value of multiPicCls as $1 (1). <br>
     * $1: マルチピック計算有
     */
    public void setMultiPicCls_$1() {
        setMultiPicClsAsMultiPicCls(CDef.MultiPicCls.$1);
    }

    /**
     * Set the value of casePicFlg as $0 (0). <br>
     * $0: ケースピック無
     */
    public void setCasePicFlg_$0() {
        setCasePicFlgAsCasePicFlg(CDef.CasePicFlg.$0);
    }

    /**
     * Set the value of casePicFlg as $1 (1). <br>
     * $1: ケースピック有
     */
    public void setCasePicFlg_$1() {
        setCasePicFlgAsCasePicFlg(CDef.CasePicFlg.$1);
    }

    /**
     * Set the value of sglRowPicFlg as $0 (0). <br>
     * $0: 単行ピック無
     */
    public void setSglRowPicFlg_$0() {
        setSglRowPicFlgAsSglRowPicFlg(CDef.SglRowPicFlg.$0);
    }

    /**
     * Set the value of sglRowPicFlg as $1 (1). <br>
     * $1: 単行ピック有
     */
    public void setSglRowPicFlg_$1() {
        setSglRowPicFlgAsSglRowPicFlg(CDef.SglRowPicFlg.$1);
    }

    /**
     * Set the value of picMthdRcmdFlg as $0 (0). <br>
     * $0: 未使用
     */
    public void setPicMthdRcmdFlg_$0() {
        setPicMthdRcmdFlgAsPicMthdRcmdFlg(CDef.PicMthdRcmdFlg.$0);
    }

    /**
     * Set the value of picMthdRcmdFlg as $1 (1). <br>
     * $1: 使用
     */
    public void setPicMthdRcmdFlg_$1() {
        setPicMthdRcmdFlgAsPicMthdRcmdFlg(CDef.PicMthdRcmdFlg.$1);
    }

    /**
     * Set the value of picMthdRcmdBreakKey as $1 (1). <br>
     * $1: 配送コース
     */
    public void setPicMthdRcmdBreakKey_$1() {
        setPicMthdRcmdBreakKeyAsPicMthdRcmdBreakKey(CDef.PicMthdRcmdBreakKey.$1);
    }

    /**
     * Set the value of picMthdRcmdBreakKey as $2 (2). <br>
     * $2: 運送業者
     */
    public void setPicMthdRcmdBreakKey_$2() {
        setPicMthdRcmdBreakKeyAsPicMthdRcmdBreakKey(CDef.PicMthdRcmdBreakKey.$2);
    }

    /**
     * Set the value of picMthdRcmdMltPlOut as $0 (0). <br>
     * $0: 出力しない
     */
    public void setPicMthdRcmdMltPlOut_$0() {
        setPicMthdRcmdMltPlOutAsPicMthdRcmdListOut(CDef.PicMthdRcmdListOut.$0);
    }

    /**
     * Set the value of picMthdRcmdMltPlOut as $1 (1). <br>
     * $1: 出力する
     */
    public void setPicMthdRcmdMltPlOut_$1() {
        setPicMthdRcmdMltPlOutAsPicMthdRcmdListOut(CDef.PicMthdRcmdListOut.$1);
    }

    /**
     * Set the value of picMthdRcmdSplSlOut as $0 (0). <br>
     * $0: 出力しない
     */
    public void setPicMthdRcmdSplSlOut_$0() {
        setPicMthdRcmdSplSlOutAsPicMthdRcmdListOut(CDef.PicMthdRcmdListOut.$0);
    }

    /**
     * Set the value of picMthdRcmdSplSlOut as $1 (1). <br>
     * $1: 出力する
     */
    public void setPicMthdRcmdSplSlOut_$1() {
        setPicMthdRcmdSplSlOutAsPicMthdRcmdListOut(CDef.PicMthdRcmdListOut.$1);
    }

    /**
     * Set the value of productLabelOutUnit as $0 (0). <br>
     * $0: 1明細1枚
     */
    public void setProductLabelOutUnit_$0() {
        setProductLabelOutUnitAsProductLabelOutUnit(CDef.ProductLabelOutUnit.$0);
    }

    /**
     * Set the value of productLabelOutUnit as $1 (1). <br>
     * $1: 荷姿毎に1枚(在庫最小単位は全体で1枚)
     */
    public void setProductLabelOutUnit_$1() {
        setProductLabelOutUnitAsProductLabelOutUnit(CDef.ProductLabelOutUnit.$1);
    }

    /**
     * Set the value of productLabelOutUnit as $2 (2). <br>
     * $2: 在庫最小単位毎に1枚
     */
    public void setProductLabelOutUnit_$2() {
        setProductLabelOutUnitAsProductLabelOutUnit(CDef.ProductLabelOutUnit.$2);
    }

    /**
     * Set the value of resultAfterProductLabel as $0 (0). <br>
     * $0: 出力しない
     */
    public void setResultAfterProductLabel_$0() {
        setResultAfterProductLabelAsResultAfterProductLabel(CDef.ResultAfterProductLabel.$0);
    }

    /**
     * Set the value of resultAfterProductLabel as $1 (1). <br>
     * $1: 画面で実績入力後のみ出力
     */
    public void setResultAfterProductLabel_$1() {
        setResultAfterProductLabelAsResultAfterProductLabel(CDef.ResultAfterProductLabel.$1);
    }

    /**
     * Set the value of resultAfterProductLabel as $2 (2). <br>
     * $2: HT/SDで実績入力後のみ出力
     */
    public void setResultAfterProductLabel_$2() {
        setResultAfterProductLabelAsResultAfterProductLabel(CDef.ResultAfterProductLabel.$2);
    }

    /**
     * Set the value of resultAfterProductLabel as $3 (3). <br>
     * $3: 出力する
     */
    public void setResultAfterProductLabel_$3() {
        setResultAfterProductLabelAsResultAfterProductLabel(CDef.ResultAfterProductLabel.$3);
    }

    /**
     * Set the value of resultAfterProductTarget as $1 (1). <br>
     * $1: 入庫ラベル
     */
    public void setResultAfterProductTarget_$1() {
        setResultAfterProductTargetAsResultAfterProductTarget(CDef.ResultAfterProductTarget.$1);
    }

    /**
     * Set the value of resultAfterProductTarget as $2 (2). <br>
     * $2: 商品ラベル
     */
    public void setResultAfterProductTarget_$2() {
        setResultAfterProductTargetAsResultAfterProductTarget(CDef.ResultAfterProductTarget.$2);
    }

    /**
     * Set the value of productLabelJanBarcode as $CODABAR (CODABAR). <br>
     * $CODABAR: CODABAR(NW-7)
     */
    public void setProductLabelJanBarcode_$CODABAR() {
        setProductLabelJanBarcodeAsProductLabelJanBarcode(CDef.ProductLabelJanBarcode.$CODABAR);
    }

    /**
     * Set the value of productLabelJanBarcode as $CODE128 (CODE128). <br>
     * $CODE128: CODE128
     */
    public void setProductLabelJanBarcode_$CODE128() {
        setProductLabelJanBarcodeAsProductLabelJanBarcode(CDef.ProductLabelJanBarcode.$CODE128);
    }

    /**
     * Set the value of productLabelJanBarcode as $CODE39 (CODE39). <br>
     * $CODE39: CODE39
     */
    public void setProductLabelJanBarcode_$CODE39() {
        setProductLabelJanBarcodeAsProductLabelJanBarcode(CDef.ProductLabelJanBarcode.$CODE39);
    }

    /**
     * Set the value of productLabelJanBarcode as $ITF (ITF). <br>
     * $ITF: ITF
     */
    public void setProductLabelJanBarcode_$ITF() {
        setProductLabelJanBarcodeAsProductLabelJanBarcode(CDef.ProductLabelJanBarcode.$ITF);
    }

    /**
     * Set the value of productLabelJanBarcode as $JAN (JAN). <br>
     * $JAN: JAN(8or13)
     */
    public void setProductLabelJanBarcode_$JAN() {
        setProductLabelJanBarcodeAsProductLabelJanBarcode(CDef.ProductLabelJanBarcode.$JAN);
    }

    /**
     * Set the value of productLabelProdBarcode as $CODABAR (CODABAR). <br>
     * $CODABAR: CODABAR(NW-7)
     */
    public void setProductLabelProdBarcode_$CODABAR() {
        setProductLabelProdBarcodeAsProductLabelProdBarcode(CDef.ProductLabelProdBarcode.$CODABAR);
    }

    /**
     * Set the value of productLabelProdBarcode as $CODE128 (CODE128). <br>
     * $CODE128: CODE128
     */
    public void setProductLabelProdBarcode_$CODE128() {
        setProductLabelProdBarcodeAsProductLabelProdBarcode(CDef.ProductLabelProdBarcode.$CODE128);
    }

    /**
     * Set the value of productLabelProdBarcode as $CODE39 (CODE39). <br>
     * $CODE39: CODE39
     */
    public void setProductLabelProdBarcode_$CODE39() {
        setProductLabelProdBarcodeAsProductLabelProdBarcode(CDef.ProductLabelProdBarcode.$CODE39);
    }

    /**
     * Set the value of productLabelProdBarcode as $ITF (ITF). <br>
     * $ITF: ITF
     */
    public void setProductLabelProdBarcode_$ITF() {
        setProductLabelProdBarcodeAsProductLabelProdBarcode(CDef.ProductLabelProdBarcode.$ITF);
    }

    /**
     * Set the value of productLabelProdBarcode as $JAN (JAN). <br>
     * $JAN: JAN(8or13)
     */
    public void setProductLabelProdBarcode_$JAN() {
        setProductLabelProdBarcodeAsProductLabelProdBarcode(CDef.ProductLabelProdBarcode.$JAN);
    }

    /**
     * Set the value of boxSelectSkip as $0 (0). <br>
     * $0: スキップしない
     */
    public void setBoxSelectSkip_$0() {
        setBoxSelectSkipAsBoxSelectSkip(CDef.BoxSelectSkip.$0);
    }

    /**
     * Set the value of boxSelectSkip as $1 (1). <br>
     * $1: スキップする
     */
    public void setBoxSelectSkip_$1() {
        setBoxSelectSkipAsBoxSelectSkip(CDef.BoxSelectSkip.$1);
    }

    /**
     * Set the value of errorSoundPlayFlg as $0 (0). <br>
     * $0: 再生しない
     */
    public void setErrorSoundPlayFlg_$0() {
        setErrorSoundPlayFlgAsSoundPlayFlg(CDef.SoundPlayFlg.$0);
    }

    /**
     * Set the value of errorSoundPlayFlg as $1 (1). <br>
     * $1: 再生する
     */
    public void setErrorSoundPlayFlg_$1() {
        setErrorSoundPlayFlgAsSoundPlayFlg(CDef.SoundPlayFlg.$1);
    }

    /**
     * Set the value of warnSoundPlayFlg as $0 (0). <br>
     * $0: 再生しない
     */
    public void setWarnSoundPlayFlg_$0() {
        setWarnSoundPlayFlgAsSoundPlayFlg(CDef.SoundPlayFlg.$0);
    }

    /**
     * Set the value of warnSoundPlayFlg as $1 (1). <br>
     * $1: 再生する
     */
    public void setWarnSoundPlayFlg_$1() {
        setWarnSoundPlayFlgAsSoundPlayFlg(CDef.SoundPlayFlg.$1);
    }

    /**
     * Set the value of inspSoundPlayFlg as $0 (0). <br>
     * $0: 再生しない
     */
    public void setInspSoundPlayFlg_$0() {
        setInspSoundPlayFlgAsSoundPlayFlg(CDef.SoundPlayFlg.$0);
    }

    /**
     * Set the value of inspSoundPlayFlg as $1 (1). <br>
     * $1: 再生する
     */
    public void setInspSoundPlayFlg_$1() {
        setInspSoundPlayFlgAsSoundPlayFlg(CDef.SoundPlayFlg.$1);
    }

    /**
     * Set the value of inspCompSoundPlayFlg as $0 (0). <br>
     * $0: 再生しない
     */
    public void setInspCompSoundPlayFlg_$0() {
        setInspCompSoundPlayFlgAsSoundPlayFlg(CDef.SoundPlayFlg.$0);
    }

    /**
     * Set the value of inspCompSoundPlayFlg as $1 (1). <br>
     * $1: 再生する
     */
    public void setInspCompSoundPlayFlg_$1() {
        setInspCompSoundPlayFlgAsSoundPlayFlg(CDef.SoundPlayFlg.$1);
    }

    /**
     * Set the value of afterTagOutFlg as $0 (0). <br>
     * $0: 出力しない
     */
    public void setAfterTagOutFlg_$0() {
        setAfterTagOutFlgAsAfterTagOutFlg(CDef.AfterTagOutFlg.$0);
    }

    /**
     * Set the value of afterTagOutFlg as $1 (1). <br>
     * $1: バラ出荷検品後に出力
     */
    public void setAfterTagOutFlg_$1() {
        setAfterTagOutFlgAsAfterTagOutFlg(CDef.AfterTagOutFlg.$1);
    }

    /**
     * Set the value of afterTagOutFlg as $2 (2). <br>
     * $2: ケース出荷検品後に出力
     */
    public void setAfterTagOutFlg_$2() {
        setAfterTagOutFlgAsAfterTagOutFlg(CDef.AfterTagOutFlg.$2);
    }

    /**
     * Set the value of afterTagOutFlg as $3 (3). <br>
     * $3: バラ・ケース出荷検品後に出力
     */
    public void setAfterTagOutFlg_$3() {
        setAfterTagOutFlgAsAfterTagOutFlg(CDef.AfterTagOutFlg.$3);
    }

    /**
     * Set the value of tagDeliveryOutFlg as $0 (0). <br>
     * $0: 出力しない
     */
    public void setTagDeliveryOutFlg_$0() {
        setTagDeliveryOutFlgAsTagDeliveryOutFlg(CDef.TagDeliveryOutFlg.$0);
    }

    /**
     * Set the value of tagDeliveryOutFlg as $1 (1). <br>
     * $1: 1枚目のみ出力
     */
    public void setTagDeliveryOutFlg_$1() {
        setTagDeliveryOutFlgAsTagDeliveryOutFlg(CDef.TagDeliveryOutFlg.$1);
    }

    /**
     * Set the value of afterDelivSlipOutFlg as $0 (0). <br>
     * $0: 出力しない
     */
    public void setAfterDelivSlipOutFlg_$0() {
        setAfterDelivSlipOutFlgAsAfterTagOutFlg(CDef.AfterTagOutFlg.$0);
    }

    /**
     * Set the value of afterDelivSlipOutFlg as $1 (1). <br>
     * $1: バラ出荷検品後に出力
     */
    public void setAfterDelivSlipOutFlg_$1() {
        setAfterDelivSlipOutFlgAsAfterTagOutFlg(CDef.AfterTagOutFlg.$1);
    }

    /**
     * Set the value of afterDelivSlipOutFlg as $2 (2). <br>
     * $2: ケース出荷検品後に出力
     */
    public void setAfterDelivSlipOutFlg_$2() {
        setAfterDelivSlipOutFlgAsAfterTagOutFlg(CDef.AfterTagOutFlg.$2);
    }

    /**
     * Set the value of afterDelivSlipOutFlg as $3 (3). <br>
     * $3: バラ・ケース出荷検品後に出力
     */
    public void setAfterDelivSlipOutFlg_$3() {
        setAfterDelivSlipOutFlgAsAfterTagOutFlg(CDef.AfterTagOutFlg.$3);
    }

    /**
     * Set the value of afterDelivSlipOutTgt as $1 (1). <br>
     * $1: ECお買上明細
     */
    public void setAfterDelivSlipOutTgt_$1() {
        setAfterDelivSlipOutTgtAsAfterDelivSlipOutTgt(CDef.AfterDelivSlipOutTgt.$1);
    }

    /**
     * Set the value of afterDelivSlipOutTgt as $2 (2). <br>
     * $2: 納品明細
     */
    public void setAfterDelivSlipOutTgt_$2() {
        setAfterDelivSlipOutTgtAsAfterDelivSlipOutTgt(CDef.AfterDelivSlipOutTgt.$2);
    }

    /**
     * Set the value of sglRowInspAfterOutCls as $1 (1). <br>
     * $1: 最初の商品検品後に出力
     */
    public void setSglRowInspAfterOutCls_$1() {
        setSglRowInspAfterOutClsAsSglRowInspAfterOutCls(CDef.SglRowInspAfterOutCls.$1);
    }

    /**
     * Set the value of sglRowInspAfterOutCls as $2 (2). <br>
     * $2: 随時出力
     */
    public void setSglRowInspAfterOutCls_$2() {
        setSglRowInspAfterOutClsAsSglRowInspAfterOutCls(CDef.SglRowInspAfterOutCls.$2);
    }

    /**
     * Set the value of sglRowInspAfterOutCls as $3 (3). <br>
     * $3: 最後の商品検品後に出力
     */
    public void setSglRowInspAfterOutCls_$3() {
        setSglRowInspAfterOutClsAsSglRowInspAfterOutCls(CDef.SglRowInspAfterOutCls.$3);
    }

    /**
     * Set the value of htCharReadFlg as $0 (0). <br>
     * $0: 未使用
     */
    public void setHtCharReadFlg_$0() {
        setHtCharReadFlgAsHtCharReadFlg(CDef.HtCharReadFlg.$0);
    }

    /**
     * Set the value of htCharReadFlg as $1 (1). <br>
     * $1: 使用
     */
    public void setHtCharReadFlg_$1() {
        setHtCharReadFlgAsHtCharReadFlg(CDef.HtCharReadFlg.$1);
    }

    /**
     * Set the value of inspectionLabelOutFlg as $0 (0). <br>
     * $0: 出力しない
     */
    public void setInspectionLabelOutFlg_$0() {
        setInspectionLabelOutFlgAsInspectionLabelOutFlg(CDef.InspectionLabelOutFlg.$0);
    }

    /**
     * Set the value of inspectionLabelOutFlg as $1 (1). <br>
     * $1: 出力する
     */
    public void setInspectionLabelOutFlg_$1() {
        setInspectionLabelOutFlgAsInspectionLabelOutFlg(CDef.InspectionLabelOutFlg.$1);
    }

    /**
     * Set the value of autoShipInstFlg as $0 (0). <br>
     * $0: 未使用
     */
    public void setAutoShipInstFlg_$0() {
        setAutoShipInstFlgAsAutoShipInstFlg(CDef.AutoShipInstFlg.$0);
    }

    /**
     * Set the value of autoShipInstFlg as $1 (1). <br>
     * $1: 使用
     */
    public void setAutoShipInstFlg_$1() {
        setAutoShipInstFlgAsAutoShipInstFlg(CDef.AutoShipInstFlg.$1);
    }

    /**
     * Set the value of stockOutAutoInstFlg as $0 (0). <br>
     * $0: 自動出庫指示に含めない
     */
    public void setStockOutAutoInstFlg_$0() {
        setStockOutAutoInstFlgAsStockOutAutoInstFlg(CDef.StockOutAutoInstFlg.$0);
    }

    /**
     * Set the value of stockOutAutoInstFlg as $1 (1). <br>
     * $1: 自動出庫指示に含める
     */
    public void setStockOutAutoInstFlg_$1() {
        setStockOutAutoInstFlgAsStockOutAutoInstFlg(CDef.StockOutAutoInstFlg.$1);
    }

    /**
     * Set the value of autoEmgSetFlg as $0 (0). <br>
     * $0: 未使用
     */
    public void setAutoEmgSetFlg_$0() {
        setAutoEmgSetFlgAsAutoEmgSetFlg(CDef.AutoEmgSetFlg.$0);
    }

    /**
     * Set the value of autoEmgSetFlg as $1 (1). <br>
     * $1: 使用
     */
    public void setAutoEmgSetFlg_$1() {
        setAutoEmgSetFlgAsAutoEmgSetFlg(CDef.AutoEmgSetFlg.$1);
    }

    /**
     * Set the value of autoEmgSetTgt as $1 (1). <br>
     * $1: 積込予定時刻
     */
    public void setAutoEmgSetTgt_$1() {
        setAutoEmgSetTgtAsAutoEmgSetTgt(CDef.AutoEmgSetTgt.$1);
    }

    /**
     * Set the value of autoEmgSetTgt as $2 (2). <br>
     * $2: 出荷予定時刻
     */
    public void setAutoEmgSetTgt_$2() {
        setAutoEmgSetTgtAsAutoEmgSetTgt(CDef.AutoEmgSetTgt.$2);
    }

    /**
     * Set the value of stockOutInstCxlFlg as $0 (0). <br>
     * $0: 出庫指示を取消しない
     */
    public void setStockOutInstCxlFlg_$0() {
        setStockOutInstCxlFlgAsStockOutInstCxlFlg(CDef.StockOutInstCxlFlg.$0);
    }

    /**
     * Set the value of stockOutInstCxlFlg as $1 (1). <br>
     * $1: 出庫指示を取消
     */
    public void setStockOutInstCxlFlg_$1() {
        setStockOutInstCxlFlgAsStockOutInstCxlFlg(CDef.StockOutInstCxlFlg.$1);
    }

    /**
     * Set the value of stockOutAllocCls as $0 (0). <br>
     * $0: 引当可能数を引当
     */
    public void setStockOutAllocCls_$0() {
        setStockOutAllocClsAsStockOutAllocCls(CDef.StockOutAllocCls.$0);
    }

    /**
     * Set the value of stockOutAllocCls as $1 (1). <br>
     * $1: 商品毎に0引当
     */
    public void setStockOutAllocCls_$1() {
        setStockOutAllocClsAsStockOutAllocCls(CDef.StockOutAllocCls.$1);
    }

    /**
     * Set the value of stockOutAllocCls as $2 (2). <br>
     * $2: 納品先毎に0引当
     */
    public void setStockOutAllocCls_$2() {
        setStockOutAllocClsAsStockOutAllocCls(CDef.StockOutAllocCls.$2);
    }

    /**
     * Set the value of stockOutInstSplitFlg as $0 (0). <br>
     * $0: 分離しない
     */
    public void setStockOutInstSplitFlg_$0() {
        setStockOutInstSplitFlgAsStockOutInstSplitFlg(CDef.StockOutInstSplitFlg.$0);
    }

    /**
     * Set the value of stockOutInstSplitFlg as $1 (1). <br>
     * $1: 分離する
     */
    public void setStockOutInstSplitFlg_$1() {
        setStockOutInstSplitFlgAsStockOutInstSplitFlg(CDef.StockOutInstSplitFlg.$1);
    }

    /**
     * Set the value of cesIntegrationFlg as $0 (0). <br>
     * $0: 連携しない
     */
    public void setCesIntegrationFlg_$0() {
        setCesIntegrationFlgAsCesIntegrationFlg(CDef.CesIntegrationFlg.$0);
    }

    /**
     * Set the value of cesIntegrationFlg as $1 (1). <br>
     * $1: 連携する
     */
    public void setCesIntegrationFlg_$1() {
        setCesIntegrationFlgAsCesIntegrationFlg(CDef.CesIntegrationFlg.$1);
    }

    /**
     * Set the value of packingSlipAutoOutputFlg as $0 (0). <br>
     * $0: 発行しない
     */
    public void setPackingSlipAutoOutputFlg_$0() {
        setPackingSlipAutoOutputFlgAsPackingSlipAutoOutputFlg(CDef.PackingSlipAutoOutputFlg.$0);
    }

    /**
     * Set the value of packingSlipAutoOutputFlg as $1 (1). <br>
     * $1: 発行する
     */
    public void setPackingSlipAutoOutputFlg_$1() {
        setPackingSlipAutoOutputFlgAsPackingSlipAutoOutputFlg(CDef.PackingSlipAutoOutputFlg.$1);
    }

    /**
     * Set the value of delFlg as $0 (0). <br>
     * $0: 未削除
     */
    public void setDelFlg_$0() {
        setDelFlgAsDelFlg(CDef.DelFlg.$0);
    }

    /**
     * Set the value of delFlg as $1 (1). <br>
     * $1: 削除済
     */
    public void setDelFlg_$1() {
        setDelFlgAsDelFlg(CDef.DelFlg.$1);
    }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of storeDtFlg $0? <br>
     * $0: 管理しない
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isStoreDtFlg$0() {
        CDef.StoreDtFlg cdef = getStoreDtFlgAsStoreDtFlg();
        return cdef != null ? cdef.equals(CDef.StoreDtFlg.$0) : false;
    }

    /**
     * Is the value of storeDtFlg $1? <br>
     * $1: 管理する
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isStoreDtFlg$1() {
        CDef.StoreDtFlg cdef = getStoreDtFlgAsStoreDtFlg();
        return cdef != null ? cdef.equals(CDef.StoreDtFlg.$1) : false;
    }

    /**
     * Is the value of storeNoFlg $0? <br>
     * $0: 管理しない
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isStoreNoFlg$0() {
        CDef.StoreNoFlg cdef = getStoreNoFlgAsStoreNoFlg();
        return cdef != null ? cdef.equals(CDef.StoreNoFlg.$0) : false;
    }

    /**
     * Is the value of storeNoFlg $1? <br>
     * $1: 管理する
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isStoreNoFlg$1() {
        CDef.StoreNoFlg cdef = getStoreNoFlgAsStoreNoFlg();
        return cdef != null ? cdef.equals(CDef.StoreNoFlg.$1) : false;
    }

    /**
     * Is the value of mergeCls $00? <br>
     * $00: マージしない
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isMergeCls$00() {
        CDef.MergeCls cdef = getMergeClsAsMergeCls();
        return cdef != null ? cdef.equals(CDef.MergeCls.$00) : false;
    }

    /**
     * Is the value of mergeCls $01? <br>
     * $01: ピックロケのみ自動マージ
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isMergeCls$01() {
        CDef.MergeCls cdef = getMergeClsAsMergeCls();
        return cdef != null ? cdef.equals(CDef.MergeCls.$01) : false;
    }

    /**
     * Is the value of mergeCls $02? <br>
     * $02: 自動マージ
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isMergeCls$02() {
        CDef.MergeCls cdef = getMergeClsAsMergeCls();
        return cdef != null ? cdef.equals(CDef.MergeCls.$02) : false;
    }

    /**
     * Is the value of overStoreNumFlg $0? <br>
     * $0: 不可
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isOverStoreNumFlg$0() {
        CDef.OverStoreNumFlg cdef = getOverStoreNumFlgAsOverStoreNumFlg();
        return cdef != null ? cdef.equals(CDef.OverStoreNumFlg.$0) : false;
    }

    /**
     * Is the value of overStoreNumFlg $1? <br>
     * $1: 可能
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isOverStoreNumFlg$1() {
        CDef.OverStoreNumFlg cdef = getOverStoreNumFlgAsOverStoreNumFlg();
        return cdef != null ? cdef.equals(CDef.OverStoreNumFlg.$1) : false;
    }

    /**
     * Is the value of pastStoreDtFlg $0? <br>
     * $0: 不可
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isPastStoreDtFlg$0() {
        CDef.PastStoreDtFlg cdef = getPastStoreDtFlgAsPastStoreDtFlg();
        return cdef != null ? cdef.equals(CDef.PastStoreDtFlg.$0) : false;
    }

    /**
     * Is the value of pastStoreDtFlg $1? <br>
     * $1: 可能
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isPastStoreDtFlg$1() {
        CDef.PastStoreDtFlg cdef = getPastStoreDtFlgAsPastStoreDtFlg();
        return cdef != null ? cdef.equals(CDef.PastStoreDtFlg.$1) : false;
    }

    /**
     * Is the value of useHtShipFlg $0? <br>
     * $0: 未使用
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isUseHtShipFlg$0() {
        CDef.UseHtShipFlg cdef = getUseHtShipFlgAsUseHtShipFlg();
        return cdef != null ? cdef.equals(CDef.UseHtShipFlg.$0) : false;
    }

    /**
     * Is the value of useHtShipFlg $1? <br>
     * $1: 使用
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isUseHtShipFlg$1() {
        CDef.UseHtShipFlg cdef = getUseHtShipFlgAsUseHtShipFlg();
        return cdef != null ? cdef.equals(CDef.UseHtShipFlg.$1) : false;
    }

    /**
     * Is the value of rgReplenishUnitCls $0? <br>
     * $0: 必要数
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isRgReplenishUnitCls$0() {
        CDef.ReplenishUnitCls cdef = getRgReplenishUnitClsAsReplenishUnitCls();
        return cdef != null ? cdef.equals(CDef.ReplenishUnitCls.$0) : false;
    }

    /**
     * Is the value of rgReplenishUnitCls $1? <br>
     * $1: 最大格納数荷姿切上
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isRgReplenishUnitCls$1() {
        CDef.ReplenishUnitCls cdef = getRgReplenishUnitClsAsReplenishUnitCls();
        return cdef != null ? cdef.equals(CDef.ReplenishUnitCls.$1) : false;
    }

    /**
     * Is the value of emReplenishUnitCls $0? <br>
     * $0: 必要数
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isEmReplenishUnitCls$0() {
        CDef.ReplenishUnitCls cdef = getEmReplenishUnitClsAsReplenishUnitCls();
        return cdef != null ? cdef.equals(CDef.ReplenishUnitCls.$0) : false;
    }

    /**
     * Is the value of emReplenishUnitCls $1? <br>
     * $1: 最大格納数荷姿切上
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isEmReplenishUnitCls$1() {
        CDef.ReplenishUnitCls cdef = getEmReplenishUnitClsAsReplenishUnitCls();
        return cdef != null ? cdef.equals(CDef.ReplenishUnitCls.$1) : false;
    }

    /**
     * Is the value of emReplenishAllocCls $0? <br>
     * $0: バッチ毎同一SKUは同一ロケに割付
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isEmReplenishAllocCls$0() {
        CDef.ReplenishAllocCls cdef = getEmReplenishAllocClsAsReplenishAllocCls();
        return cdef != null ? cdef.equals(CDef.ReplenishAllocCls.$0) : false;
    }

    /**
     * Is the value of emReplenishAllocCls $1? <br>
     * $1: 補充毎に別ロケを割付
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isEmReplenishAllocCls$1() {
        CDef.ReplenishAllocCls cdef = getEmReplenishAllocClsAsReplenishAllocCls();
        return cdef != null ? cdef.equals(CDef.ReplenishAllocCls.$1) : false;
    }

    /**
     * Is the value of packingCalCls $0? <br>
     * $0: 梱包計算無
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isPackingCalCls$0() {
        CDef.PackingCalCls cdef = getPackingCalClsAsPackingCalCls();
        return cdef != null ? cdef.equals(CDef.PackingCalCls.$0) : false;
    }

    /**
     * Is the value of packingCalCls $1? <br>
     * $1: 容積と重量による梱包計算
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isPackingCalCls$1() {
        CDef.PackingCalCls cdef = getPackingCalClsAsPackingCalCls();
        return cdef != null ? cdef.equals(CDef.PackingCalCls.$1) : false;
    }

    /**
     * Is the value of packingProcessCls $0? <br>
     * $0: 受取側考慮(出荷指示昇順)
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isPackingProcessCls$0() {
        CDef.PackingProcessCls cdef = getPackingProcessClsAsPackingProcessCls();
        return cdef != null ? cdef.equals(CDef.PackingProcessCls.$0) : false;
    }

    /**
     * Is the value of packingProcessCls $1? <br>
     * $1: なるべく詰める(容積降順)
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isPackingProcessCls$1() {
        CDef.PackingProcessCls cdef = getPackingProcessClsAsPackingProcessCls();
        return cdef != null ? cdef.equals(CDef.PackingProcessCls.$1) : false;
    }

    /**
     * Is the value of productPartPacking $0? <br>
     * $0: 不可
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isProductPartPacking$0() {
        CDef.ProductPartPacking cdef = getProductPartPackingAsProductPartPacking();
        return cdef != null ? cdef.equals(CDef.ProductPartPacking.$0) : false;
    }

    /**
     * Is the value of productPartPacking $1? <br>
     * $1: 可能
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isProductPartPacking$1() {
        CDef.ProductPartPacking cdef = getProductPartPackingAsProductPartPacking();
        return cdef != null ? cdef.equals(CDef.ProductPartPacking.$1) : false;
    }

    /**
     * Is the value of decimalProductPacking $0? <br>
     * $0: 荷姿単位で1梱包
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isDecimalProductPacking$0() {
        CDef.DecimalProductPacking cdef = getDecimalProductPackingAsDecimalProductPacking();
        return cdef != null ? cdef.equals(CDef.DecimalProductPacking.$0) : false;
    }

    /**
     * Is the value of decimalProductPacking $1? <br>
     * $1: 商品単位で1梱包
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isDecimalProductPacking$1() {
        CDef.DecimalProductPacking cdef = getDecimalProductPackingAsDecimalProductPacking();
        return cdef != null ? cdef.equals(CDef.DecimalProductPacking.$1) : false;
    }

    /**
     * Is the value of totalPicFlg $0? <br>
     * $0: トータルピック無
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isTotalPicFlg$0() {
        CDef.TotalPicFlg cdef = getTotalPicFlgAsTotalPicFlg();
        return cdef != null ? cdef.equals(CDef.TotalPicFlg.$0) : false;
    }

    /**
     * Is the value of totalPicFlg $1? <br>
     * $1: トータルピック有
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isTotalPicFlg$1() {
        CDef.TotalPicFlg cdef = getTotalPicFlgAsTotalPicFlg();
        return cdef != null ? cdef.equals(CDef.TotalPicFlg.$1) : false;
    }

    /**
     * Is the value of multiPicCls $0? <br>
     * $0: マルチピック計算無
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isMultiPicCls$0() {
        CDef.MultiPicCls cdef = getMultiPicClsAsMultiPicCls();
        return cdef != null ? cdef.equals(CDef.MultiPicCls.$0) : false;
    }

    /**
     * Is the value of multiPicCls $1? <br>
     * $1: マルチピック計算有
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isMultiPicCls$1() {
        CDef.MultiPicCls cdef = getMultiPicClsAsMultiPicCls();
        return cdef != null ? cdef.equals(CDef.MultiPicCls.$1) : false;
    }

    /**
     * Is the value of casePicFlg $0? <br>
     * $0: ケースピック無
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isCasePicFlg$0() {
        CDef.CasePicFlg cdef = getCasePicFlgAsCasePicFlg();
        return cdef != null ? cdef.equals(CDef.CasePicFlg.$0) : false;
    }

    /**
     * Is the value of casePicFlg $1? <br>
     * $1: ケースピック有
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isCasePicFlg$1() {
        CDef.CasePicFlg cdef = getCasePicFlgAsCasePicFlg();
        return cdef != null ? cdef.equals(CDef.CasePicFlg.$1) : false;
    }

    /**
     * Is the value of sglRowPicFlg $0? <br>
     * $0: 単行ピック無
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isSglRowPicFlg$0() {
        CDef.SglRowPicFlg cdef = getSglRowPicFlgAsSglRowPicFlg();
        return cdef != null ? cdef.equals(CDef.SglRowPicFlg.$0) : false;
    }

    /**
     * Is the value of sglRowPicFlg $1? <br>
     * $1: 単行ピック有
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isSglRowPicFlg$1() {
        CDef.SglRowPicFlg cdef = getSglRowPicFlgAsSglRowPicFlg();
        return cdef != null ? cdef.equals(CDef.SglRowPicFlg.$1) : false;
    }

    /**
     * Is the value of picMthdRcmdFlg $0? <br>
     * $0: 未使用
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isPicMthdRcmdFlg$0() {
        CDef.PicMthdRcmdFlg cdef = getPicMthdRcmdFlgAsPicMthdRcmdFlg();
        return cdef != null ? cdef.equals(CDef.PicMthdRcmdFlg.$0) : false;
    }

    /**
     * Is the value of picMthdRcmdFlg $1? <br>
     * $1: 使用
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isPicMthdRcmdFlg$1() {
        CDef.PicMthdRcmdFlg cdef = getPicMthdRcmdFlgAsPicMthdRcmdFlg();
        return cdef != null ? cdef.equals(CDef.PicMthdRcmdFlg.$1) : false;
    }

    /**
     * Is the value of picMthdRcmdBreakKey $1? <br>
     * $1: 配送コース
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isPicMthdRcmdBreakKey$1() {
        CDef.PicMthdRcmdBreakKey cdef = getPicMthdRcmdBreakKeyAsPicMthdRcmdBreakKey();
        return cdef != null ? cdef.equals(CDef.PicMthdRcmdBreakKey.$1) : false;
    }

    /**
     * Is the value of picMthdRcmdBreakKey $2? <br>
     * $2: 運送業者
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isPicMthdRcmdBreakKey$2() {
        CDef.PicMthdRcmdBreakKey cdef = getPicMthdRcmdBreakKeyAsPicMthdRcmdBreakKey();
        return cdef != null ? cdef.equals(CDef.PicMthdRcmdBreakKey.$2) : false;
    }

    /**
     * Is the value of picMthdRcmdMltPlOut $0? <br>
     * $0: 出力しない
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isPicMthdRcmdMltPlOut$0() {
        CDef.PicMthdRcmdListOut cdef = getPicMthdRcmdMltPlOutAsPicMthdRcmdListOut();
        return cdef != null ? cdef.equals(CDef.PicMthdRcmdListOut.$0) : false;
    }

    /**
     * Is the value of picMthdRcmdMltPlOut $1? <br>
     * $1: 出力する
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isPicMthdRcmdMltPlOut$1() {
        CDef.PicMthdRcmdListOut cdef = getPicMthdRcmdMltPlOutAsPicMthdRcmdListOut();
        return cdef != null ? cdef.equals(CDef.PicMthdRcmdListOut.$1) : false;
    }

    /**
     * Is the value of picMthdRcmdSplSlOut $0? <br>
     * $0: 出力しない
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isPicMthdRcmdSplSlOut$0() {
        CDef.PicMthdRcmdListOut cdef = getPicMthdRcmdSplSlOutAsPicMthdRcmdListOut();
        return cdef != null ? cdef.equals(CDef.PicMthdRcmdListOut.$0) : false;
    }

    /**
     * Is the value of picMthdRcmdSplSlOut $1? <br>
     * $1: 出力する
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isPicMthdRcmdSplSlOut$1() {
        CDef.PicMthdRcmdListOut cdef = getPicMthdRcmdSplSlOutAsPicMthdRcmdListOut();
        return cdef != null ? cdef.equals(CDef.PicMthdRcmdListOut.$1) : false;
    }

    /**
     * Is the value of productLabelOutUnit $0? <br>
     * $0: 1明細1枚
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isProductLabelOutUnit$0() {
        CDef.ProductLabelOutUnit cdef = getProductLabelOutUnitAsProductLabelOutUnit();
        return cdef != null ? cdef.equals(CDef.ProductLabelOutUnit.$0) : false;
    }

    /**
     * Is the value of productLabelOutUnit $1? <br>
     * $1: 荷姿毎に1枚(在庫最小単位は全体で1枚)
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isProductLabelOutUnit$1() {
        CDef.ProductLabelOutUnit cdef = getProductLabelOutUnitAsProductLabelOutUnit();
        return cdef != null ? cdef.equals(CDef.ProductLabelOutUnit.$1) : false;
    }

    /**
     * Is the value of productLabelOutUnit $2? <br>
     * $2: 在庫最小単位毎に1枚
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isProductLabelOutUnit$2() {
        CDef.ProductLabelOutUnit cdef = getProductLabelOutUnitAsProductLabelOutUnit();
        return cdef != null ? cdef.equals(CDef.ProductLabelOutUnit.$2) : false;
    }

    /**
     * Is the value of resultAfterProductLabel $0? <br>
     * $0: 出力しない
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isResultAfterProductLabel$0() {
        CDef.ResultAfterProductLabel cdef = getResultAfterProductLabelAsResultAfterProductLabel();
        return cdef != null ? cdef.equals(CDef.ResultAfterProductLabel.$0) : false;
    }

    /**
     * Is the value of resultAfterProductLabel $1? <br>
     * $1: 画面で実績入力後のみ出力
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isResultAfterProductLabel$1() {
        CDef.ResultAfterProductLabel cdef = getResultAfterProductLabelAsResultAfterProductLabel();
        return cdef != null ? cdef.equals(CDef.ResultAfterProductLabel.$1) : false;
    }

    /**
     * Is the value of resultAfterProductLabel $2? <br>
     * $2: HT/SDで実績入力後のみ出力
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isResultAfterProductLabel$2() {
        CDef.ResultAfterProductLabel cdef = getResultAfterProductLabelAsResultAfterProductLabel();
        return cdef != null ? cdef.equals(CDef.ResultAfterProductLabel.$2) : false;
    }

    /**
     * Is the value of resultAfterProductLabel $3? <br>
     * $3: 出力する
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isResultAfterProductLabel$3() {
        CDef.ResultAfterProductLabel cdef = getResultAfterProductLabelAsResultAfterProductLabel();
        return cdef != null ? cdef.equals(CDef.ResultAfterProductLabel.$3) : false;
    }

    /**
     * Is the value of resultAfterProductTarget $1? <br>
     * $1: 入庫ラベル
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isResultAfterProductTarget$1() {
        CDef.ResultAfterProductTarget cdef = getResultAfterProductTargetAsResultAfterProductTarget();
        return cdef != null ? cdef.equals(CDef.ResultAfterProductTarget.$1) : false;
    }

    /**
     * Is the value of resultAfterProductTarget $2? <br>
     * $2: 商品ラベル
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isResultAfterProductTarget$2() {
        CDef.ResultAfterProductTarget cdef = getResultAfterProductTargetAsResultAfterProductTarget();
        return cdef != null ? cdef.equals(CDef.ResultAfterProductTarget.$2) : false;
    }

    /**
     * Is the value of productLabelJanBarcode $CODABAR? <br>
     * $CODABAR: CODABAR(NW-7)
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isProductLabelJanBarcode$CODABAR() {
        CDef.ProductLabelJanBarcode cdef = getProductLabelJanBarcodeAsProductLabelJanBarcode();
        return cdef != null ? cdef.equals(CDef.ProductLabelJanBarcode.$CODABAR) : false;
    }

    /**
     * Is the value of productLabelJanBarcode $CODE128? <br>
     * $CODE128: CODE128
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isProductLabelJanBarcode$CODE128() {
        CDef.ProductLabelJanBarcode cdef = getProductLabelJanBarcodeAsProductLabelJanBarcode();
        return cdef != null ? cdef.equals(CDef.ProductLabelJanBarcode.$CODE128) : false;
    }

    /**
     * Is the value of productLabelJanBarcode $CODE39? <br>
     * $CODE39: CODE39
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isProductLabelJanBarcode$CODE39() {
        CDef.ProductLabelJanBarcode cdef = getProductLabelJanBarcodeAsProductLabelJanBarcode();
        return cdef != null ? cdef.equals(CDef.ProductLabelJanBarcode.$CODE39) : false;
    }

    /**
     * Is the value of productLabelJanBarcode $ITF? <br>
     * $ITF: ITF
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isProductLabelJanBarcode$ITF() {
        CDef.ProductLabelJanBarcode cdef = getProductLabelJanBarcodeAsProductLabelJanBarcode();
        return cdef != null ? cdef.equals(CDef.ProductLabelJanBarcode.$ITF) : false;
    }

    /**
     * Is the value of productLabelJanBarcode $JAN? <br>
     * $JAN: JAN(8or13)
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isProductLabelJanBarcode$JAN() {
        CDef.ProductLabelJanBarcode cdef = getProductLabelJanBarcodeAsProductLabelJanBarcode();
        return cdef != null ? cdef.equals(CDef.ProductLabelJanBarcode.$JAN) : false;
    }

    /**
     * Is the value of productLabelProdBarcode $CODABAR? <br>
     * $CODABAR: CODABAR(NW-7)
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isProductLabelProdBarcode$CODABAR() {
        CDef.ProductLabelProdBarcode cdef = getProductLabelProdBarcodeAsProductLabelProdBarcode();
        return cdef != null ? cdef.equals(CDef.ProductLabelProdBarcode.$CODABAR) : false;
    }

    /**
     * Is the value of productLabelProdBarcode $CODE128? <br>
     * $CODE128: CODE128
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isProductLabelProdBarcode$CODE128() {
        CDef.ProductLabelProdBarcode cdef = getProductLabelProdBarcodeAsProductLabelProdBarcode();
        return cdef != null ? cdef.equals(CDef.ProductLabelProdBarcode.$CODE128) : false;
    }

    /**
     * Is the value of productLabelProdBarcode $CODE39? <br>
     * $CODE39: CODE39
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isProductLabelProdBarcode$CODE39() {
        CDef.ProductLabelProdBarcode cdef = getProductLabelProdBarcodeAsProductLabelProdBarcode();
        return cdef != null ? cdef.equals(CDef.ProductLabelProdBarcode.$CODE39) : false;
    }

    /**
     * Is the value of productLabelProdBarcode $ITF? <br>
     * $ITF: ITF
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isProductLabelProdBarcode$ITF() {
        CDef.ProductLabelProdBarcode cdef = getProductLabelProdBarcodeAsProductLabelProdBarcode();
        return cdef != null ? cdef.equals(CDef.ProductLabelProdBarcode.$ITF) : false;
    }

    /**
     * Is the value of productLabelProdBarcode $JAN? <br>
     * $JAN: JAN(8or13)
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isProductLabelProdBarcode$JAN() {
        CDef.ProductLabelProdBarcode cdef = getProductLabelProdBarcodeAsProductLabelProdBarcode();
        return cdef != null ? cdef.equals(CDef.ProductLabelProdBarcode.$JAN) : false;
    }

    /**
     * Is the value of boxSelectSkip $0? <br>
     * $0: スキップしない
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isBoxSelectSkip$0() {
        CDef.BoxSelectSkip cdef = getBoxSelectSkipAsBoxSelectSkip();
        return cdef != null ? cdef.equals(CDef.BoxSelectSkip.$0) : false;
    }

    /**
     * Is the value of boxSelectSkip $1? <br>
     * $1: スキップする
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isBoxSelectSkip$1() {
        CDef.BoxSelectSkip cdef = getBoxSelectSkipAsBoxSelectSkip();
        return cdef != null ? cdef.equals(CDef.BoxSelectSkip.$1) : false;
    }

    /**
     * Is the value of errorSoundPlayFlg $0? <br>
     * $0: 再生しない
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isErrorSoundPlayFlg$0() {
        CDef.SoundPlayFlg cdef = getErrorSoundPlayFlgAsSoundPlayFlg();
        return cdef != null ? cdef.equals(CDef.SoundPlayFlg.$0) : false;
    }

    /**
     * Is the value of errorSoundPlayFlg $1? <br>
     * $1: 再生する
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isErrorSoundPlayFlg$1() {
        CDef.SoundPlayFlg cdef = getErrorSoundPlayFlgAsSoundPlayFlg();
        return cdef != null ? cdef.equals(CDef.SoundPlayFlg.$1) : false;
    }

    /**
     * Is the value of warnSoundPlayFlg $0? <br>
     * $0: 再生しない
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isWarnSoundPlayFlg$0() {
        CDef.SoundPlayFlg cdef = getWarnSoundPlayFlgAsSoundPlayFlg();
        return cdef != null ? cdef.equals(CDef.SoundPlayFlg.$0) : false;
    }

    /**
     * Is the value of warnSoundPlayFlg $1? <br>
     * $1: 再生する
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isWarnSoundPlayFlg$1() {
        CDef.SoundPlayFlg cdef = getWarnSoundPlayFlgAsSoundPlayFlg();
        return cdef != null ? cdef.equals(CDef.SoundPlayFlg.$1) : false;
    }

    /**
     * Is the value of inspSoundPlayFlg $0? <br>
     * $0: 再生しない
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isInspSoundPlayFlg$0() {
        CDef.SoundPlayFlg cdef = getInspSoundPlayFlgAsSoundPlayFlg();
        return cdef != null ? cdef.equals(CDef.SoundPlayFlg.$0) : false;
    }

    /**
     * Is the value of inspSoundPlayFlg $1? <br>
     * $1: 再生する
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isInspSoundPlayFlg$1() {
        CDef.SoundPlayFlg cdef = getInspSoundPlayFlgAsSoundPlayFlg();
        return cdef != null ? cdef.equals(CDef.SoundPlayFlg.$1) : false;
    }

    /**
     * Is the value of inspCompSoundPlayFlg $0? <br>
     * $0: 再生しない
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isInspCompSoundPlayFlg$0() {
        CDef.SoundPlayFlg cdef = getInspCompSoundPlayFlgAsSoundPlayFlg();
        return cdef != null ? cdef.equals(CDef.SoundPlayFlg.$0) : false;
    }

    /**
     * Is the value of inspCompSoundPlayFlg $1? <br>
     * $1: 再生する
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isInspCompSoundPlayFlg$1() {
        CDef.SoundPlayFlg cdef = getInspCompSoundPlayFlgAsSoundPlayFlg();
        return cdef != null ? cdef.equals(CDef.SoundPlayFlg.$1) : false;
    }

    /**
     * Is the value of afterTagOutFlg $0? <br>
     * $0: 出力しない
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isAfterTagOutFlg$0() {
        CDef.AfterTagOutFlg cdef = getAfterTagOutFlgAsAfterTagOutFlg();
        return cdef != null ? cdef.equals(CDef.AfterTagOutFlg.$0) : false;
    }

    /**
     * Is the value of afterTagOutFlg $1? <br>
     * $1: バラ出荷検品後に出力
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isAfterTagOutFlg$1() {
        CDef.AfterTagOutFlg cdef = getAfterTagOutFlgAsAfterTagOutFlg();
        return cdef != null ? cdef.equals(CDef.AfterTagOutFlg.$1) : false;
    }

    /**
     * Is the value of afterTagOutFlg $2? <br>
     * $2: ケース出荷検品後に出力
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isAfterTagOutFlg$2() {
        CDef.AfterTagOutFlg cdef = getAfterTagOutFlgAsAfterTagOutFlg();
        return cdef != null ? cdef.equals(CDef.AfterTagOutFlg.$2) : false;
    }

    /**
     * Is the value of afterTagOutFlg $3? <br>
     * $3: バラ・ケース出荷検品後に出力
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isAfterTagOutFlg$3() {
        CDef.AfterTagOutFlg cdef = getAfterTagOutFlgAsAfterTagOutFlg();
        return cdef != null ? cdef.equals(CDef.AfterTagOutFlg.$3) : false;
    }

    /**
     * Is the value of tagDeliveryOutFlg $0? <br>
     * $0: 出力しない
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isTagDeliveryOutFlg$0() {
        CDef.TagDeliveryOutFlg cdef = getTagDeliveryOutFlgAsTagDeliveryOutFlg();
        return cdef != null ? cdef.equals(CDef.TagDeliveryOutFlg.$0) : false;
    }

    /**
     * Is the value of tagDeliveryOutFlg $1? <br>
     * $1: 1枚目のみ出力
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isTagDeliveryOutFlg$1() {
        CDef.TagDeliveryOutFlg cdef = getTagDeliveryOutFlgAsTagDeliveryOutFlg();
        return cdef != null ? cdef.equals(CDef.TagDeliveryOutFlg.$1) : false;
    }

    /**
     * Is the value of afterDelivSlipOutFlg $0? <br>
     * $0: 出力しない
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isAfterDelivSlipOutFlg$0() {
        CDef.AfterTagOutFlg cdef = getAfterDelivSlipOutFlgAsAfterTagOutFlg();
        return cdef != null ? cdef.equals(CDef.AfterTagOutFlg.$0) : false;
    }

    /**
     * Is the value of afterDelivSlipOutFlg $1? <br>
     * $1: バラ出荷検品後に出力
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isAfterDelivSlipOutFlg$1() {
        CDef.AfterTagOutFlg cdef = getAfterDelivSlipOutFlgAsAfterTagOutFlg();
        return cdef != null ? cdef.equals(CDef.AfterTagOutFlg.$1) : false;
    }

    /**
     * Is the value of afterDelivSlipOutFlg $2? <br>
     * $2: ケース出荷検品後に出力
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isAfterDelivSlipOutFlg$2() {
        CDef.AfterTagOutFlg cdef = getAfterDelivSlipOutFlgAsAfterTagOutFlg();
        return cdef != null ? cdef.equals(CDef.AfterTagOutFlg.$2) : false;
    }

    /**
     * Is the value of afterDelivSlipOutFlg $3? <br>
     * $3: バラ・ケース出荷検品後に出力
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isAfterDelivSlipOutFlg$3() {
        CDef.AfterTagOutFlg cdef = getAfterDelivSlipOutFlgAsAfterTagOutFlg();
        return cdef != null ? cdef.equals(CDef.AfterTagOutFlg.$3) : false;
    }

    /**
     * Is the value of afterDelivSlipOutTgt $1? <br>
     * $1: ECお買上明細
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isAfterDelivSlipOutTgt$1() {
        CDef.AfterDelivSlipOutTgt cdef = getAfterDelivSlipOutTgtAsAfterDelivSlipOutTgt();
        return cdef != null ? cdef.equals(CDef.AfterDelivSlipOutTgt.$1) : false;
    }

    /**
     * Is the value of afterDelivSlipOutTgt $2? <br>
     * $2: 納品明細
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isAfterDelivSlipOutTgt$2() {
        CDef.AfterDelivSlipOutTgt cdef = getAfterDelivSlipOutTgtAsAfterDelivSlipOutTgt();
        return cdef != null ? cdef.equals(CDef.AfterDelivSlipOutTgt.$2) : false;
    }

    /**
     * Is the value of sglRowInspAfterOutCls $1? <br>
     * $1: 最初の商品検品後に出力
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isSglRowInspAfterOutCls$1() {
        CDef.SglRowInspAfterOutCls cdef = getSglRowInspAfterOutClsAsSglRowInspAfterOutCls();
        return cdef != null ? cdef.equals(CDef.SglRowInspAfterOutCls.$1) : false;
    }

    /**
     * Is the value of sglRowInspAfterOutCls $2? <br>
     * $2: 随時出力
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isSglRowInspAfterOutCls$2() {
        CDef.SglRowInspAfterOutCls cdef = getSglRowInspAfterOutClsAsSglRowInspAfterOutCls();
        return cdef != null ? cdef.equals(CDef.SglRowInspAfterOutCls.$2) : false;
    }

    /**
     * Is the value of sglRowInspAfterOutCls $3? <br>
     * $3: 最後の商品検品後に出力
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isSglRowInspAfterOutCls$3() {
        CDef.SglRowInspAfterOutCls cdef = getSglRowInspAfterOutClsAsSglRowInspAfterOutCls();
        return cdef != null ? cdef.equals(CDef.SglRowInspAfterOutCls.$3) : false;
    }

    /**
     * Is the value of htCharReadFlg $0? <br>
     * $0: 未使用
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isHtCharReadFlg$0() {
        CDef.HtCharReadFlg cdef = getHtCharReadFlgAsHtCharReadFlg();
        return cdef != null ? cdef.equals(CDef.HtCharReadFlg.$0) : false;
    }

    /**
     * Is the value of htCharReadFlg $1? <br>
     * $1: 使用
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isHtCharReadFlg$1() {
        CDef.HtCharReadFlg cdef = getHtCharReadFlgAsHtCharReadFlg();
        return cdef != null ? cdef.equals(CDef.HtCharReadFlg.$1) : false;
    }

    /**
     * Is the value of inspectionLabelOutFlg $0? <br>
     * $0: 出力しない
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isInspectionLabelOutFlg$0() {
        CDef.InspectionLabelOutFlg cdef = getInspectionLabelOutFlgAsInspectionLabelOutFlg();
        return cdef != null ? cdef.equals(CDef.InspectionLabelOutFlg.$0) : false;
    }

    /**
     * Is the value of inspectionLabelOutFlg $1? <br>
     * $1: 出力する
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isInspectionLabelOutFlg$1() {
        CDef.InspectionLabelOutFlg cdef = getInspectionLabelOutFlgAsInspectionLabelOutFlg();
        return cdef != null ? cdef.equals(CDef.InspectionLabelOutFlg.$1) : false;
    }

    /**
     * Is the value of autoShipInstFlg $0? <br>
     * $0: 未使用
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isAutoShipInstFlg$0() {
        CDef.AutoShipInstFlg cdef = getAutoShipInstFlgAsAutoShipInstFlg();
        return cdef != null ? cdef.equals(CDef.AutoShipInstFlg.$0) : false;
    }

    /**
     * Is the value of autoShipInstFlg $1? <br>
     * $1: 使用
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isAutoShipInstFlg$1() {
        CDef.AutoShipInstFlg cdef = getAutoShipInstFlgAsAutoShipInstFlg();
        return cdef != null ? cdef.equals(CDef.AutoShipInstFlg.$1) : false;
    }

    /**
     * Is the value of stockOutAutoInstFlg $0? <br>
     * $0: 自動出庫指示に含めない
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isStockOutAutoInstFlg$0() {
        CDef.StockOutAutoInstFlg cdef = getStockOutAutoInstFlgAsStockOutAutoInstFlg();
        return cdef != null ? cdef.equals(CDef.StockOutAutoInstFlg.$0) : false;
    }

    /**
     * Is the value of stockOutAutoInstFlg $1? <br>
     * $1: 自動出庫指示に含める
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isStockOutAutoInstFlg$1() {
        CDef.StockOutAutoInstFlg cdef = getStockOutAutoInstFlgAsStockOutAutoInstFlg();
        return cdef != null ? cdef.equals(CDef.StockOutAutoInstFlg.$1) : false;
    }

    /**
     * Is the value of autoEmgSetFlg $0? <br>
     * $0: 未使用
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isAutoEmgSetFlg$0() {
        CDef.AutoEmgSetFlg cdef = getAutoEmgSetFlgAsAutoEmgSetFlg();
        return cdef != null ? cdef.equals(CDef.AutoEmgSetFlg.$0) : false;
    }

    /**
     * Is the value of autoEmgSetFlg $1? <br>
     * $1: 使用
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isAutoEmgSetFlg$1() {
        CDef.AutoEmgSetFlg cdef = getAutoEmgSetFlgAsAutoEmgSetFlg();
        return cdef != null ? cdef.equals(CDef.AutoEmgSetFlg.$1) : false;
    }

    /**
     * Is the value of autoEmgSetTgt $1? <br>
     * $1: 積込予定時刻
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isAutoEmgSetTgt$1() {
        CDef.AutoEmgSetTgt cdef = getAutoEmgSetTgtAsAutoEmgSetTgt();
        return cdef != null ? cdef.equals(CDef.AutoEmgSetTgt.$1) : false;
    }

    /**
     * Is the value of autoEmgSetTgt $2? <br>
     * $2: 出荷予定時刻
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isAutoEmgSetTgt$2() {
        CDef.AutoEmgSetTgt cdef = getAutoEmgSetTgtAsAutoEmgSetTgt();
        return cdef != null ? cdef.equals(CDef.AutoEmgSetTgt.$2) : false;
    }

    /**
     * Is the value of stockOutInstCxlFlg $0? <br>
     * $0: 出庫指示を取消しない
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isStockOutInstCxlFlg$0() {
        CDef.StockOutInstCxlFlg cdef = getStockOutInstCxlFlgAsStockOutInstCxlFlg();
        return cdef != null ? cdef.equals(CDef.StockOutInstCxlFlg.$0) : false;
    }

    /**
     * Is the value of stockOutInstCxlFlg $1? <br>
     * $1: 出庫指示を取消
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isStockOutInstCxlFlg$1() {
        CDef.StockOutInstCxlFlg cdef = getStockOutInstCxlFlgAsStockOutInstCxlFlg();
        return cdef != null ? cdef.equals(CDef.StockOutInstCxlFlg.$1) : false;
    }

    /**
     * Is the value of stockOutAllocCls $0? <br>
     * $0: 引当可能数を引当
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isStockOutAllocCls$0() {
        CDef.StockOutAllocCls cdef = getStockOutAllocClsAsStockOutAllocCls();
        return cdef != null ? cdef.equals(CDef.StockOutAllocCls.$0) : false;
    }

    /**
     * Is the value of stockOutAllocCls $1? <br>
     * $1: 商品毎に0引当
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isStockOutAllocCls$1() {
        CDef.StockOutAllocCls cdef = getStockOutAllocClsAsStockOutAllocCls();
        return cdef != null ? cdef.equals(CDef.StockOutAllocCls.$1) : false;
    }

    /**
     * Is the value of stockOutAllocCls $2? <br>
     * $2: 納品先毎に0引当
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isStockOutAllocCls$2() {
        CDef.StockOutAllocCls cdef = getStockOutAllocClsAsStockOutAllocCls();
        return cdef != null ? cdef.equals(CDef.StockOutAllocCls.$2) : false;
    }

    /**
     * Is the value of stockOutInstSplitFlg $0? <br>
     * $0: 分離しない
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isStockOutInstSplitFlg$0() {
        CDef.StockOutInstSplitFlg cdef = getStockOutInstSplitFlgAsStockOutInstSplitFlg();
        return cdef != null ? cdef.equals(CDef.StockOutInstSplitFlg.$0) : false;
    }

    /**
     * Is the value of stockOutInstSplitFlg $1? <br>
     * $1: 分離する
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isStockOutInstSplitFlg$1() {
        CDef.StockOutInstSplitFlg cdef = getStockOutInstSplitFlgAsStockOutInstSplitFlg();
        return cdef != null ? cdef.equals(CDef.StockOutInstSplitFlg.$1) : false;
    }

    /**
     * Is the value of cesIntegrationFlg $0? <br>
     * $0: 連携しない
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isCesIntegrationFlg$0() {
        CDef.CesIntegrationFlg cdef = getCesIntegrationFlgAsCesIntegrationFlg();
        return cdef != null ? cdef.equals(CDef.CesIntegrationFlg.$0) : false;
    }

    /**
     * Is the value of cesIntegrationFlg $1? <br>
     * $1: 連携する
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isCesIntegrationFlg$1() {
        CDef.CesIntegrationFlg cdef = getCesIntegrationFlgAsCesIntegrationFlg();
        return cdef != null ? cdef.equals(CDef.CesIntegrationFlg.$1) : false;
    }

    /**
     * Is the value of packingSlipAutoOutputFlg $0? <br>
     * $0: 発行しない
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isPackingSlipAutoOutputFlg$0() {
        CDef.PackingSlipAutoOutputFlg cdef = getPackingSlipAutoOutputFlgAsPackingSlipAutoOutputFlg();
        return cdef != null ? cdef.equals(CDef.PackingSlipAutoOutputFlg.$0) : false;
    }

    /**
     * Is the value of packingSlipAutoOutputFlg $1? <br>
     * $1: 発行する
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isPackingSlipAutoOutputFlg$1() {
        CDef.PackingSlipAutoOutputFlg cdef = getPackingSlipAutoOutputFlgAsPackingSlipAutoOutputFlg();
        return cdef != null ? cdef.equals(CDef.PackingSlipAutoOutputFlg.$1) : false;
    }

    /**
     * Is the value of delFlg $0? <br>
     * $0: 未削除
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isDelFlg$0() {
        CDef.DelFlg cdef = getDelFlgAsDelFlg();
        return cdef != null ? cdef.equals(CDef.DelFlg.$0) : false;
    }

    /**
     * Is the value of delFlg $1? <br>
     * $1: 削除済
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isDelFlg$1() {
        CDef.DelFlg cdef = getDelFlgAsDelFlg();
        return cdef != null ? cdef.equals(CDef.DelFlg.$1) : false;
    }

    // ===================================================================================
    //                                                           Classification Name/Alias
    //                                                           =========================
    /**
     * Get the value of the column 'storeDtFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getStoreDtFlgName() {
        CDef.StoreDtFlg cdef = getStoreDtFlgAsStoreDtFlg();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'storeNoFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getStoreNoFlgName() {
        CDef.StoreNoFlg cdef = getStoreNoFlgAsStoreNoFlg();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'mergeCls' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getMergeClsName() {
        CDef.MergeCls cdef = getMergeClsAsMergeCls();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'overStoreNumFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getOverStoreNumFlgName() {
        CDef.OverStoreNumFlg cdef = getOverStoreNumFlgAsOverStoreNumFlg();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'pastStoreDtFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getPastStoreDtFlgName() {
        CDef.PastStoreDtFlg cdef = getPastStoreDtFlgAsPastStoreDtFlg();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'useHtShipFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getUseHtShipFlgName() {
        CDef.UseHtShipFlg cdef = getUseHtShipFlgAsUseHtShipFlg();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'rgReplenishUnitCls' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getRgReplenishUnitClsName() {
        CDef.ReplenishUnitCls cdef = getRgReplenishUnitClsAsReplenishUnitCls();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'emReplenishUnitCls' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getEmReplenishUnitClsName() {
        CDef.ReplenishUnitCls cdef = getEmReplenishUnitClsAsReplenishUnitCls();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'emReplenishAllocCls' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getEmReplenishAllocClsName() {
        CDef.ReplenishAllocCls cdef = getEmReplenishAllocClsAsReplenishAllocCls();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'packingCalCls' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getPackingCalClsName() {
        CDef.PackingCalCls cdef = getPackingCalClsAsPackingCalCls();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'packingProcessCls' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getPackingProcessClsName() {
        CDef.PackingProcessCls cdef = getPackingProcessClsAsPackingProcessCls();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'productPartPacking' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getProductPartPackingName() {
        CDef.ProductPartPacking cdef = getProductPartPackingAsProductPartPacking();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'decimalProductPacking' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getDecimalProductPackingName() {
        CDef.DecimalProductPacking cdef = getDecimalProductPackingAsDecimalProductPacking();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'totalPicFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getTotalPicFlgName() {
        CDef.TotalPicFlg cdef = getTotalPicFlgAsTotalPicFlg();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'multiPicCls' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getMultiPicClsName() {
        CDef.MultiPicCls cdef = getMultiPicClsAsMultiPicCls();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'casePicFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getCasePicFlgName() {
        CDef.CasePicFlg cdef = getCasePicFlgAsCasePicFlg();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'sglRowPicFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getSglRowPicFlgName() {
        CDef.SglRowPicFlg cdef = getSglRowPicFlgAsSglRowPicFlg();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'picMthdRcmdFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getPicMthdRcmdFlgName() {
        CDef.PicMthdRcmdFlg cdef = getPicMthdRcmdFlgAsPicMthdRcmdFlg();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'picMthdRcmdBreakKey' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getPicMthdRcmdBreakKeyName() {
        CDef.PicMthdRcmdBreakKey cdef = getPicMthdRcmdBreakKeyAsPicMthdRcmdBreakKey();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'picMthdRcmdMltPlOut' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getPicMthdRcmdMltPlOutName() {
        CDef.PicMthdRcmdListOut cdef = getPicMthdRcmdMltPlOutAsPicMthdRcmdListOut();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'picMthdRcmdSplSlOut' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getPicMthdRcmdSplSlOutName() {
        CDef.PicMthdRcmdListOut cdef = getPicMthdRcmdSplSlOutAsPicMthdRcmdListOut();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'productLabelOutUnit' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getProductLabelOutUnitName() {
        CDef.ProductLabelOutUnit cdef = getProductLabelOutUnitAsProductLabelOutUnit();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'resultAfterProductLabel' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getResultAfterProductLabelName() {
        CDef.ResultAfterProductLabel cdef = getResultAfterProductLabelAsResultAfterProductLabel();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'resultAfterProductTarget' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getResultAfterProductTargetName() {
        CDef.ResultAfterProductTarget cdef = getResultAfterProductTargetAsResultAfterProductTarget();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'productLabelJanBarcode' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getProductLabelJanBarcodeName() {
        CDef.ProductLabelJanBarcode cdef = getProductLabelJanBarcodeAsProductLabelJanBarcode();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'productLabelProdBarcode' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getProductLabelProdBarcodeName() {
        CDef.ProductLabelProdBarcode cdef = getProductLabelProdBarcodeAsProductLabelProdBarcode();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'boxSelectSkip' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getBoxSelectSkipName() {
        CDef.BoxSelectSkip cdef = getBoxSelectSkipAsBoxSelectSkip();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'errorSoundPlayFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getErrorSoundPlayFlgName() {
        CDef.SoundPlayFlg cdef = getErrorSoundPlayFlgAsSoundPlayFlg();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'warnSoundPlayFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getWarnSoundPlayFlgName() {
        CDef.SoundPlayFlg cdef = getWarnSoundPlayFlgAsSoundPlayFlg();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'inspSoundPlayFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getInspSoundPlayFlgName() {
        CDef.SoundPlayFlg cdef = getInspSoundPlayFlgAsSoundPlayFlg();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'inspCompSoundPlayFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getInspCompSoundPlayFlgName() {
        CDef.SoundPlayFlg cdef = getInspCompSoundPlayFlgAsSoundPlayFlg();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'afterTagOutFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getAfterTagOutFlgName() {
        CDef.AfterTagOutFlg cdef = getAfterTagOutFlgAsAfterTagOutFlg();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'tagDeliveryOutFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getTagDeliveryOutFlgName() {
        CDef.TagDeliveryOutFlg cdef = getTagDeliveryOutFlgAsTagDeliveryOutFlg();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'afterDelivSlipOutFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getAfterDelivSlipOutFlgName() {
        CDef.AfterTagOutFlg cdef = getAfterDelivSlipOutFlgAsAfterTagOutFlg();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'afterDelivSlipOutTgt' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getAfterDelivSlipOutTgtName() {
        CDef.AfterDelivSlipOutTgt cdef = getAfterDelivSlipOutTgtAsAfterDelivSlipOutTgt();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'sglRowInspAfterOutCls' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getSglRowInspAfterOutClsName() {
        CDef.SglRowInspAfterOutCls cdef = getSglRowInspAfterOutClsAsSglRowInspAfterOutCls();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'htCharReadFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getHtCharReadFlgName() {
        CDef.HtCharReadFlg cdef = getHtCharReadFlgAsHtCharReadFlg();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'inspectionLabelOutFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getInspectionLabelOutFlgName() {
        CDef.InspectionLabelOutFlg cdef = getInspectionLabelOutFlgAsInspectionLabelOutFlg();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'autoShipInstFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getAutoShipInstFlgName() {
        CDef.AutoShipInstFlg cdef = getAutoShipInstFlgAsAutoShipInstFlg();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'stockOutAutoInstFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getStockOutAutoInstFlgName() {
        CDef.StockOutAutoInstFlg cdef = getStockOutAutoInstFlgAsStockOutAutoInstFlg();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'autoEmgSetFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getAutoEmgSetFlgName() {
        CDef.AutoEmgSetFlg cdef = getAutoEmgSetFlgAsAutoEmgSetFlg();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'autoEmgSetTgt' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getAutoEmgSetTgtName() {
        CDef.AutoEmgSetTgt cdef = getAutoEmgSetTgtAsAutoEmgSetTgt();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'stockOutInstCxlFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getStockOutInstCxlFlgName() {
        CDef.StockOutInstCxlFlg cdef = getStockOutInstCxlFlgAsStockOutInstCxlFlg();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'stockOutAllocCls' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getStockOutAllocClsName() {
        CDef.StockOutAllocCls cdef = getStockOutAllocClsAsStockOutAllocCls();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'stockOutInstSplitFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getStockOutInstSplitFlgName() {
        CDef.StockOutInstSplitFlg cdef = getStockOutInstSplitFlgAsStockOutInstSplitFlg();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'cesIntegrationFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getCesIntegrationFlgName() {
        CDef.CesIntegrationFlg cdef = getCesIntegrationFlgAsCesIntegrationFlg();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'packingSlipAutoOutputFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getPackingSlipAutoOutputFlgName() {
        CDef.PackingSlipAutoOutputFlg cdef = getPackingSlipAutoOutputFlgAsPackingSlipAutoOutputFlg();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'delFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getDelFlgName() {
        CDef.DelFlg cdef = getDelFlgAsDelFlg();
        return cdef != null ? cdef.name() : null;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** M_CLIENT_CENTER by my CLIENT_CENTER_ID, named 'MClientCenter'. */
    protected MClientCenter _mClientCenter;

    /**
     * [get] M_CLIENT_CENTER by my CLIENT_CENTER_ID, named 'MClientCenter'. <br>
     * @return The entity of foreign property 'MClientCenter'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MClientCenter getMClientCenter() {
        return _mClientCenter;
    }

    /**
     * [set] M_CLIENT_CENTER by my CLIENT_CENTER_ID, named 'MClientCenter'.
     * @param mClientCenter The entity of foreign property 'MClientCenter'. (NullAllowed)
     */
    public void setMClientCenter(MClientCenter mClientCenter) {
        _mClientCenter = mClientCenter;
    }

    /** M_BOX by my DEFAULT_BOX_ID, named 'MBox'. */
    protected MBox _mBox;

    /**
     * [get] M_BOX by my DEFAULT_BOX_ID, named 'MBox'. <br>
     * @return The entity of foreign property 'MBox'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MBox getMBox() {
        return _mBox;
    }

    /**
     * [set] M_BOX by my DEFAULT_BOX_ID, named 'MBox'.
     * @param mBox The entity of foreign property 'MBox'. (NullAllowed)
     */
    public void setMBox(MBox mBox) {
        _mBox = mBox;
    }

    /** M_DELIVERY_COURSE by my DELIVERY_COURSE_ID, named 'MDeliveryCourse'. */
    protected MDeliveryCourse _mDeliveryCourse;

    /**
     * [get] M_DELIVERY_COURSE by my DELIVERY_COURSE_ID, named 'MDeliveryCourse'. <br>
     * @return The entity of foreign property 'MDeliveryCourse'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MDeliveryCourse getMDeliveryCourse() {
        return _mDeliveryCourse;
    }

    /**
     * [set] M_DELIVERY_COURSE by my DELIVERY_COURSE_ID, named 'MDeliveryCourse'.
     * @param mDeliveryCourse The entity of foreign property 'MDeliveryCourse'. (NullAllowed)
     */
    public void setMDeliveryCourse(MDeliveryCourse mDeliveryCourse) {
        _mDeliveryCourse = mDeliveryCourse;
    }

    /** M_ZONE by my EM_REPLENISH_ZONE_ID, named 'MZone'. */
    protected MZone _mZone;

    /**
     * [get] M_ZONE by my EM_REPLENISH_ZONE_ID, named 'MZone'. <br>
     * @return The entity of foreign property 'MZone'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MZone getMZone() {
        return _mZone;
    }

    /**
     * [set] M_ZONE by my EM_REPLENISH_ZONE_ID, named 'MZone'.
     * @param mZone The entity of foreign property 'MZone'. (NullAllowed)
     */
    public void setMZone(MZone mZone) {
        _mZone = mZone;
    }

    /** M_BOX_GRP by my PACKING_BOX_GROUP_ID, named 'MBoxGrp'. */
    protected MBoxGrp _mBoxGrp;

    /**
     * [get] M_BOX_GRP by my PACKING_BOX_GROUP_ID, named 'MBoxGrp'. <br>
     * @return The entity of foreign property 'MBoxGrp'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MBoxGrp getMBoxGrp() {
        return _mBoxGrp;
    }

    /**
     * [set] M_BOX_GRP by my PACKING_BOX_GROUP_ID, named 'MBoxGrp'.
     * @param mBoxGrp The entity of foreign property 'MBoxGrp'. (NullAllowed)
     */
    public void setMBoxGrp(MBoxGrp mBoxGrp) {
        _mBoxGrp = mBoxGrp;
    }

    /** B_CLASS_DTL by my AFTER_TAG_OUT_FLG, named 'BClassDtlByAfterTagOutFlg'. */
    protected BClassDtl _bClassDtlByAfterTagOutFlg;

    /**
     * [get] B_CLASS_DTL by my AFTER_TAG_OUT_FLG, named 'BClassDtlByAfterTagOutFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByAfterTagOutFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByAfterTagOutFlg() {
        return _bClassDtlByAfterTagOutFlg;
    }

    /**
     * [set] B_CLASS_DTL by my AFTER_TAG_OUT_FLG, named 'BClassDtlByAfterTagOutFlg'.
     * @param bClassDtlByAfterTagOutFlg The entity of foreign property 'BClassDtlByAfterTagOutFlg'. (NullAllowed)
     */
    public void setBClassDtlByAfterTagOutFlg(BClassDtl bClassDtlByAfterTagOutFlg) {
        _bClassDtlByAfterTagOutFlg = bClassDtlByAfterTagOutFlg;
    }

    /** B_CLASS_DTL by my AFTER_DELIV_SLIP_OUT_FLG, named 'BClassDtlByAfterDelivSlipOutFlg'. */
    protected BClassDtl _bClassDtlByAfterDelivSlipOutFlg;

    /**
     * [get] B_CLASS_DTL by my AFTER_DELIV_SLIP_OUT_FLG, named 'BClassDtlByAfterDelivSlipOutFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByAfterDelivSlipOutFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByAfterDelivSlipOutFlg() {
        return _bClassDtlByAfterDelivSlipOutFlg;
    }

    /**
     * [set] B_CLASS_DTL by my AFTER_DELIV_SLIP_OUT_FLG, named 'BClassDtlByAfterDelivSlipOutFlg'.
     * @param bClassDtlByAfterDelivSlipOutFlg The entity of foreign property 'BClassDtlByAfterDelivSlipOutFlg'. (NullAllowed)
     */
    public void setBClassDtlByAfterDelivSlipOutFlg(BClassDtl bClassDtlByAfterDelivSlipOutFlg) {
        _bClassDtlByAfterDelivSlipOutFlg = bClassDtlByAfterDelivSlipOutFlg;
    }

    /** B_CLASS_DTL by my AFTER_DELIV_SLIP_OUT_TGT, named 'BClassDtlByAfterDelivSlipOutTgt'. */
    protected BClassDtl _bClassDtlByAfterDelivSlipOutTgt;

    /**
     * [get] B_CLASS_DTL by my AFTER_DELIV_SLIP_OUT_TGT, named 'BClassDtlByAfterDelivSlipOutTgt'. <br>
     * @return The entity of foreign property 'BClassDtlByAfterDelivSlipOutTgt'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByAfterDelivSlipOutTgt() {
        return _bClassDtlByAfterDelivSlipOutTgt;
    }

    /**
     * [set] B_CLASS_DTL by my AFTER_DELIV_SLIP_OUT_TGT, named 'BClassDtlByAfterDelivSlipOutTgt'.
     * @param bClassDtlByAfterDelivSlipOutTgt The entity of foreign property 'BClassDtlByAfterDelivSlipOutTgt'. (NullAllowed)
     */
    public void setBClassDtlByAfterDelivSlipOutTgt(BClassDtl bClassDtlByAfterDelivSlipOutTgt) {
        _bClassDtlByAfterDelivSlipOutTgt = bClassDtlByAfterDelivSlipOutTgt;
    }

    /** B_CLASS_DTL by my SGL_ROW_INSP_AFTER_OUT_CLS, named 'BClassDtlBySglRowInspAfterOutCls'. */
    protected BClassDtl _bClassDtlBySglRowInspAfterOutCls;

    /**
     * [get] B_CLASS_DTL by my SGL_ROW_INSP_AFTER_OUT_CLS, named 'BClassDtlBySglRowInspAfterOutCls'. <br>
     * @return The entity of foreign property 'BClassDtlBySglRowInspAfterOutCls'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlBySglRowInspAfterOutCls() {
        return _bClassDtlBySglRowInspAfterOutCls;
    }

    /**
     * [set] B_CLASS_DTL by my SGL_ROW_INSP_AFTER_OUT_CLS, named 'BClassDtlBySglRowInspAfterOutCls'.
     * @param bClassDtlBySglRowInspAfterOutCls The entity of foreign property 'BClassDtlBySglRowInspAfterOutCls'. (NullAllowed)
     */
    public void setBClassDtlBySglRowInspAfterOutCls(BClassDtl bClassDtlBySglRowInspAfterOutCls) {
        _bClassDtlBySglRowInspAfterOutCls = bClassDtlBySglRowInspAfterOutCls;
    }

    /** B_CLASS_DTL by my BOX_SELECT_SKIP, named 'BClassDtlByBoxSelectSkip'. */
    protected BClassDtl _bClassDtlByBoxSelectSkip;

    /**
     * [get] B_CLASS_DTL by my BOX_SELECT_SKIP, named 'BClassDtlByBoxSelectSkip'. <br>
     * @return The entity of foreign property 'BClassDtlByBoxSelectSkip'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByBoxSelectSkip() {
        return _bClassDtlByBoxSelectSkip;
    }

    /**
     * [set] B_CLASS_DTL by my BOX_SELECT_SKIP, named 'BClassDtlByBoxSelectSkip'.
     * @param bClassDtlByBoxSelectSkip The entity of foreign property 'BClassDtlByBoxSelectSkip'. (NullAllowed)
     */
    public void setBClassDtlByBoxSelectSkip(BClassDtl bClassDtlByBoxSelectSkip) {
        _bClassDtlByBoxSelectSkip = bClassDtlByBoxSelectSkip;
    }

    /** B_CLASS_DTL by my CASE_PIC_FLG, named 'BClassDtlByCasePicFlg'. */
    protected BClassDtl _bClassDtlByCasePicFlg;

    /**
     * [get] B_CLASS_DTL by my CASE_PIC_FLG, named 'BClassDtlByCasePicFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByCasePicFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByCasePicFlg() {
        return _bClassDtlByCasePicFlg;
    }

    /**
     * [set] B_CLASS_DTL by my CASE_PIC_FLG, named 'BClassDtlByCasePicFlg'.
     * @param bClassDtlByCasePicFlg The entity of foreign property 'BClassDtlByCasePicFlg'. (NullAllowed)
     */
    public void setBClassDtlByCasePicFlg(BClassDtl bClassDtlByCasePicFlg) {
        _bClassDtlByCasePicFlg = bClassDtlByCasePicFlg;
    }

    /** B_CLASS_DTL by my DEL_FLG, named 'BClassDtlByDelFlg'. */
    protected BClassDtl _bClassDtlByDelFlg;

    /**
     * [get] B_CLASS_DTL by my DEL_FLG, named 'BClassDtlByDelFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByDelFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByDelFlg() {
        return _bClassDtlByDelFlg;
    }

    /**
     * [set] B_CLASS_DTL by my DEL_FLG, named 'BClassDtlByDelFlg'.
     * @param bClassDtlByDelFlg The entity of foreign property 'BClassDtlByDelFlg'. (NullAllowed)
     */
    public void setBClassDtlByDelFlg(BClassDtl bClassDtlByDelFlg) {
        _bClassDtlByDelFlg = bClassDtlByDelFlg;
    }

    /** B_CLASS_DTL by my HT_CHAR_READ_FLG, named 'BClassDtlByHtCharReadFlg'. */
    protected BClassDtl _bClassDtlByHtCharReadFlg;

    /**
     * [get] B_CLASS_DTL by my HT_CHAR_READ_FLG, named 'BClassDtlByHtCharReadFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByHtCharReadFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByHtCharReadFlg() {
        return _bClassDtlByHtCharReadFlg;
    }

    /**
     * [set] B_CLASS_DTL by my HT_CHAR_READ_FLG, named 'BClassDtlByHtCharReadFlg'.
     * @param bClassDtlByHtCharReadFlg The entity of foreign property 'BClassDtlByHtCharReadFlg'. (NullAllowed)
     */
    public void setBClassDtlByHtCharReadFlg(BClassDtl bClassDtlByHtCharReadFlg) {
        _bClassDtlByHtCharReadFlg = bClassDtlByHtCharReadFlg;
    }

    /** B_CLASS_DTL by my MERGE_CLS, named 'BClassDtlByMergeCls'. */
    protected BClassDtl _bClassDtlByMergeCls;

    /**
     * [get] B_CLASS_DTL by my MERGE_CLS, named 'BClassDtlByMergeCls'. <br>
     * @return The entity of foreign property 'BClassDtlByMergeCls'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByMergeCls() {
        return _bClassDtlByMergeCls;
    }

    /**
     * [set] B_CLASS_DTL by my MERGE_CLS, named 'BClassDtlByMergeCls'.
     * @param bClassDtlByMergeCls The entity of foreign property 'BClassDtlByMergeCls'. (NullAllowed)
     */
    public void setBClassDtlByMergeCls(BClassDtl bClassDtlByMergeCls) {
        _bClassDtlByMergeCls = bClassDtlByMergeCls;
    }

    /** B_CLASS_DTL by my MULTI_PIC_CLS, named 'BClassDtlByMultiPicCls'. */
    protected BClassDtl _bClassDtlByMultiPicCls;

    /**
     * [get] B_CLASS_DTL by my MULTI_PIC_CLS, named 'BClassDtlByMultiPicCls'. <br>
     * @return The entity of foreign property 'BClassDtlByMultiPicCls'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByMultiPicCls() {
        return _bClassDtlByMultiPicCls;
    }

    /**
     * [set] B_CLASS_DTL by my MULTI_PIC_CLS, named 'BClassDtlByMultiPicCls'.
     * @param bClassDtlByMultiPicCls The entity of foreign property 'BClassDtlByMultiPicCls'. (NullAllowed)
     */
    public void setBClassDtlByMultiPicCls(BClassDtl bClassDtlByMultiPicCls) {
        _bClassDtlByMultiPicCls = bClassDtlByMultiPicCls;
    }

    /** B_CLASS_DTL by my OVER_STORE_NUM_FLG, named 'BClassDtlByOverStoreNumFlg'. */
    protected BClassDtl _bClassDtlByOverStoreNumFlg;

    /**
     * [get] B_CLASS_DTL by my OVER_STORE_NUM_FLG, named 'BClassDtlByOverStoreNumFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByOverStoreNumFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByOverStoreNumFlg() {
        return _bClassDtlByOverStoreNumFlg;
    }

    /**
     * [set] B_CLASS_DTL by my OVER_STORE_NUM_FLG, named 'BClassDtlByOverStoreNumFlg'.
     * @param bClassDtlByOverStoreNumFlg The entity of foreign property 'BClassDtlByOverStoreNumFlg'. (NullAllowed)
     */
    public void setBClassDtlByOverStoreNumFlg(BClassDtl bClassDtlByOverStoreNumFlg) {
        _bClassDtlByOverStoreNumFlg = bClassDtlByOverStoreNumFlg;
    }

    /** B_CLASS_DTL by my PACKING_CAL_CLS, named 'BClassDtlByPackingCalCls'. */
    protected BClassDtl _bClassDtlByPackingCalCls;

    /**
     * [get] B_CLASS_DTL by my PACKING_CAL_CLS, named 'BClassDtlByPackingCalCls'. <br>
     * @return The entity of foreign property 'BClassDtlByPackingCalCls'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByPackingCalCls() {
        return _bClassDtlByPackingCalCls;
    }

    /**
     * [set] B_CLASS_DTL by my PACKING_CAL_CLS, named 'BClassDtlByPackingCalCls'.
     * @param bClassDtlByPackingCalCls The entity of foreign property 'BClassDtlByPackingCalCls'. (NullAllowed)
     */
    public void setBClassDtlByPackingCalCls(BClassDtl bClassDtlByPackingCalCls) {
        _bClassDtlByPackingCalCls = bClassDtlByPackingCalCls;
    }

    /** B_CLASS_DTL by my PACKING_PROCESS_CLS, named 'BClassDtlByPackingProcessCls'. */
    protected BClassDtl _bClassDtlByPackingProcessCls;

    /**
     * [get] B_CLASS_DTL by my PACKING_PROCESS_CLS, named 'BClassDtlByPackingProcessCls'. <br>
     * @return The entity of foreign property 'BClassDtlByPackingProcessCls'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByPackingProcessCls() {
        return _bClassDtlByPackingProcessCls;
    }

    /**
     * [set] B_CLASS_DTL by my PACKING_PROCESS_CLS, named 'BClassDtlByPackingProcessCls'.
     * @param bClassDtlByPackingProcessCls The entity of foreign property 'BClassDtlByPackingProcessCls'. (NullAllowed)
     */
    public void setBClassDtlByPackingProcessCls(BClassDtl bClassDtlByPackingProcessCls) {
        _bClassDtlByPackingProcessCls = bClassDtlByPackingProcessCls;
    }

    /** B_CLASS_DTL by my PAST_STORE_DT_FLG, named 'BClassDtlByPastStoreDtFlg'. */
    protected BClassDtl _bClassDtlByPastStoreDtFlg;

    /**
     * [get] B_CLASS_DTL by my PAST_STORE_DT_FLG, named 'BClassDtlByPastStoreDtFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByPastStoreDtFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByPastStoreDtFlg() {
        return _bClassDtlByPastStoreDtFlg;
    }

    /**
     * [set] B_CLASS_DTL by my PAST_STORE_DT_FLG, named 'BClassDtlByPastStoreDtFlg'.
     * @param bClassDtlByPastStoreDtFlg The entity of foreign property 'BClassDtlByPastStoreDtFlg'. (NullAllowed)
     */
    public void setBClassDtlByPastStoreDtFlg(BClassDtl bClassDtlByPastStoreDtFlg) {
        _bClassDtlByPastStoreDtFlg = bClassDtlByPastStoreDtFlg;
    }

    /** B_CLASS_DTL by my PRODUCT_LABEL_JAN_BARCODE, named 'BClassDtlByProductLabelJanBarcode'. */
    protected BClassDtl _bClassDtlByProductLabelJanBarcode;

    /**
     * [get] B_CLASS_DTL by my PRODUCT_LABEL_JAN_BARCODE, named 'BClassDtlByProductLabelJanBarcode'. <br>
     * @return The entity of foreign property 'BClassDtlByProductLabelJanBarcode'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByProductLabelJanBarcode() {
        return _bClassDtlByProductLabelJanBarcode;
    }

    /**
     * [set] B_CLASS_DTL by my PRODUCT_LABEL_JAN_BARCODE, named 'BClassDtlByProductLabelJanBarcode'.
     * @param bClassDtlByProductLabelJanBarcode The entity of foreign property 'BClassDtlByProductLabelJanBarcode'. (NullAllowed)
     */
    public void setBClassDtlByProductLabelJanBarcode(BClassDtl bClassDtlByProductLabelJanBarcode) {
        _bClassDtlByProductLabelJanBarcode = bClassDtlByProductLabelJanBarcode;
    }

    /** B_CLASS_DTL by my PRODUCT_LABEL_OUT_UNIT, named 'BClassDtlByProductLabelOutUnit'. */
    protected BClassDtl _bClassDtlByProductLabelOutUnit;

    /**
     * [get] B_CLASS_DTL by my PRODUCT_LABEL_OUT_UNIT, named 'BClassDtlByProductLabelOutUnit'. <br>
     * @return The entity of foreign property 'BClassDtlByProductLabelOutUnit'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByProductLabelOutUnit() {
        return _bClassDtlByProductLabelOutUnit;
    }

    /**
     * [set] B_CLASS_DTL by my PRODUCT_LABEL_OUT_UNIT, named 'BClassDtlByProductLabelOutUnit'.
     * @param bClassDtlByProductLabelOutUnit The entity of foreign property 'BClassDtlByProductLabelOutUnit'. (NullAllowed)
     */
    public void setBClassDtlByProductLabelOutUnit(BClassDtl bClassDtlByProductLabelOutUnit) {
        _bClassDtlByProductLabelOutUnit = bClassDtlByProductLabelOutUnit;
    }

    /** B_CLASS_DTL by my PRODUCT_LABEL_PROD_BARCODE, named 'BClassDtlByProductLabelProdBarcode'. */
    protected BClassDtl _bClassDtlByProductLabelProdBarcode;

    /**
     * [get] B_CLASS_DTL by my PRODUCT_LABEL_PROD_BARCODE, named 'BClassDtlByProductLabelProdBarcode'. <br>
     * @return The entity of foreign property 'BClassDtlByProductLabelProdBarcode'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByProductLabelProdBarcode() {
        return _bClassDtlByProductLabelProdBarcode;
    }

    /**
     * [set] B_CLASS_DTL by my PRODUCT_LABEL_PROD_BARCODE, named 'BClassDtlByProductLabelProdBarcode'.
     * @param bClassDtlByProductLabelProdBarcode The entity of foreign property 'BClassDtlByProductLabelProdBarcode'. (NullAllowed)
     */
    public void setBClassDtlByProductLabelProdBarcode(BClassDtl bClassDtlByProductLabelProdBarcode) {
        _bClassDtlByProductLabelProdBarcode = bClassDtlByProductLabelProdBarcode;
    }

    /** B_CLASS_DTL by my PRODUCT_PART_PACKING, named 'BClassDtlByProductPartPacking'. */
    protected BClassDtl _bClassDtlByProductPartPacking;

    /**
     * [get] B_CLASS_DTL by my PRODUCT_PART_PACKING, named 'BClassDtlByProductPartPacking'. <br>
     * @return The entity of foreign property 'BClassDtlByProductPartPacking'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByProductPartPacking() {
        return _bClassDtlByProductPartPacking;
    }

    /**
     * [set] B_CLASS_DTL by my PRODUCT_PART_PACKING, named 'BClassDtlByProductPartPacking'.
     * @param bClassDtlByProductPartPacking The entity of foreign property 'BClassDtlByProductPartPacking'. (NullAllowed)
     */
    public void setBClassDtlByProductPartPacking(BClassDtl bClassDtlByProductPartPacking) {
        _bClassDtlByProductPartPacking = bClassDtlByProductPartPacking;
    }

    /** B_CLASS_DTL by my DECIMAL_PRODUCT_PACKING, named 'BClassDtlByDecimalProductPacking'. */
    protected BClassDtl _bClassDtlByDecimalProductPacking;

    /**
     * [get] B_CLASS_DTL by my DECIMAL_PRODUCT_PACKING, named 'BClassDtlByDecimalProductPacking'. <br>
     * @return The entity of foreign property 'BClassDtlByDecimalProductPacking'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByDecimalProductPacking() {
        return _bClassDtlByDecimalProductPacking;
    }

    /**
     * [set] B_CLASS_DTL by my DECIMAL_PRODUCT_PACKING, named 'BClassDtlByDecimalProductPacking'.
     * @param bClassDtlByDecimalProductPacking The entity of foreign property 'BClassDtlByDecimalProductPacking'. (NullAllowed)
     */
    public void setBClassDtlByDecimalProductPacking(BClassDtl bClassDtlByDecimalProductPacking) {
        _bClassDtlByDecimalProductPacking = bClassDtlByDecimalProductPacking;
    }

    /** B_CLASS_DTL by my EM_REPLENISH_ALLOC_CLS, named 'BClassDtlByEmReplenishAllocCls'. */
    protected BClassDtl _bClassDtlByEmReplenishAllocCls;

    /**
     * [get] B_CLASS_DTL by my EM_REPLENISH_ALLOC_CLS, named 'BClassDtlByEmReplenishAllocCls'. <br>
     * @return The entity of foreign property 'BClassDtlByEmReplenishAllocCls'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByEmReplenishAllocCls() {
        return _bClassDtlByEmReplenishAllocCls;
    }

    /**
     * [set] B_CLASS_DTL by my EM_REPLENISH_ALLOC_CLS, named 'BClassDtlByEmReplenishAllocCls'.
     * @param bClassDtlByEmReplenishAllocCls The entity of foreign property 'BClassDtlByEmReplenishAllocCls'. (NullAllowed)
     */
    public void setBClassDtlByEmReplenishAllocCls(BClassDtl bClassDtlByEmReplenishAllocCls) {
        _bClassDtlByEmReplenishAllocCls = bClassDtlByEmReplenishAllocCls;
    }

    /** B_CLASS_DTL by my RG_REPLENISH_UNIT_CLS, named 'BClassDtlByRgReplenishUnitCls'. */
    protected BClassDtl _bClassDtlByRgReplenishUnitCls;

    /**
     * [get] B_CLASS_DTL by my RG_REPLENISH_UNIT_CLS, named 'BClassDtlByRgReplenishUnitCls'. <br>
     * @return The entity of foreign property 'BClassDtlByRgReplenishUnitCls'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByRgReplenishUnitCls() {
        return _bClassDtlByRgReplenishUnitCls;
    }

    /**
     * [set] B_CLASS_DTL by my RG_REPLENISH_UNIT_CLS, named 'BClassDtlByRgReplenishUnitCls'.
     * @param bClassDtlByRgReplenishUnitCls The entity of foreign property 'BClassDtlByRgReplenishUnitCls'. (NullAllowed)
     */
    public void setBClassDtlByRgReplenishUnitCls(BClassDtl bClassDtlByRgReplenishUnitCls) {
        _bClassDtlByRgReplenishUnitCls = bClassDtlByRgReplenishUnitCls;
    }

    /** B_CLASS_DTL by my EM_REPLENISH_UNIT_CLS, named 'BClassDtlByEmReplenishUnitCls'. */
    protected BClassDtl _bClassDtlByEmReplenishUnitCls;

    /**
     * [get] B_CLASS_DTL by my EM_REPLENISH_UNIT_CLS, named 'BClassDtlByEmReplenishUnitCls'. <br>
     * @return The entity of foreign property 'BClassDtlByEmReplenishUnitCls'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByEmReplenishUnitCls() {
        return _bClassDtlByEmReplenishUnitCls;
    }

    /**
     * [set] B_CLASS_DTL by my EM_REPLENISH_UNIT_CLS, named 'BClassDtlByEmReplenishUnitCls'.
     * @param bClassDtlByEmReplenishUnitCls The entity of foreign property 'BClassDtlByEmReplenishUnitCls'. (NullAllowed)
     */
    public void setBClassDtlByEmReplenishUnitCls(BClassDtl bClassDtlByEmReplenishUnitCls) {
        _bClassDtlByEmReplenishUnitCls = bClassDtlByEmReplenishUnitCls;
    }

    /** B_CLASS_DTL by my RESULT_AFTER_PRODUCT_LABEL, named 'BClassDtlByResultAfterProductLabel'. */
    protected BClassDtl _bClassDtlByResultAfterProductLabel;

    /**
     * [get] B_CLASS_DTL by my RESULT_AFTER_PRODUCT_LABEL, named 'BClassDtlByResultAfterProductLabel'. <br>
     * @return The entity of foreign property 'BClassDtlByResultAfterProductLabel'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByResultAfterProductLabel() {
        return _bClassDtlByResultAfterProductLabel;
    }

    /**
     * [set] B_CLASS_DTL by my RESULT_AFTER_PRODUCT_LABEL, named 'BClassDtlByResultAfterProductLabel'.
     * @param bClassDtlByResultAfterProductLabel The entity of foreign property 'BClassDtlByResultAfterProductLabel'. (NullAllowed)
     */
    public void setBClassDtlByResultAfterProductLabel(BClassDtl bClassDtlByResultAfterProductLabel) {
        _bClassDtlByResultAfterProductLabel = bClassDtlByResultAfterProductLabel;
    }

    /** B_CLASS_DTL by my RESULT_AFTER_PRODUCT_TARGET, named 'BClassDtlByResultAfterProductTarget'. */
    protected BClassDtl _bClassDtlByResultAfterProductTarget;

    /**
     * [get] B_CLASS_DTL by my RESULT_AFTER_PRODUCT_TARGET, named 'BClassDtlByResultAfterProductTarget'. <br>
     * @return The entity of foreign property 'BClassDtlByResultAfterProductTarget'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByResultAfterProductTarget() {
        return _bClassDtlByResultAfterProductTarget;
    }

    /**
     * [set] B_CLASS_DTL by my RESULT_AFTER_PRODUCT_TARGET, named 'BClassDtlByResultAfterProductTarget'.
     * @param bClassDtlByResultAfterProductTarget The entity of foreign property 'BClassDtlByResultAfterProductTarget'. (NullAllowed)
     */
    public void setBClassDtlByResultAfterProductTarget(BClassDtl bClassDtlByResultAfterProductTarget) {
        _bClassDtlByResultAfterProductTarget = bClassDtlByResultAfterProductTarget;
    }

    /** B_CLASS_DTL by my STORE_DT_FLG, named 'BClassDtlByStoreDtFlg'. */
    protected BClassDtl _bClassDtlByStoreDtFlg;

    /**
     * [get] B_CLASS_DTL by my STORE_DT_FLG, named 'BClassDtlByStoreDtFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByStoreDtFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByStoreDtFlg() {
        return _bClassDtlByStoreDtFlg;
    }

    /**
     * [set] B_CLASS_DTL by my STORE_DT_FLG, named 'BClassDtlByStoreDtFlg'.
     * @param bClassDtlByStoreDtFlg The entity of foreign property 'BClassDtlByStoreDtFlg'. (NullAllowed)
     */
    public void setBClassDtlByStoreDtFlg(BClassDtl bClassDtlByStoreDtFlg) {
        _bClassDtlByStoreDtFlg = bClassDtlByStoreDtFlg;
    }

    /** B_CLASS_DTL by my STORE_NO_FLG, named 'BClassDtlByStoreNoFlg'. */
    protected BClassDtl _bClassDtlByStoreNoFlg;

    /**
     * [get] B_CLASS_DTL by my STORE_NO_FLG, named 'BClassDtlByStoreNoFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByStoreNoFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByStoreNoFlg() {
        return _bClassDtlByStoreNoFlg;
    }

    /**
     * [set] B_CLASS_DTL by my STORE_NO_FLG, named 'BClassDtlByStoreNoFlg'.
     * @param bClassDtlByStoreNoFlg The entity of foreign property 'BClassDtlByStoreNoFlg'. (NullAllowed)
     */
    public void setBClassDtlByStoreNoFlg(BClassDtl bClassDtlByStoreNoFlg) {
        _bClassDtlByStoreNoFlg = bClassDtlByStoreNoFlg;
    }

    /** B_CLASS_DTL by my TAG_DELIVERY_OUT_FLG, named 'BClassDtlByTagDeliveryOutFlg'. */
    protected BClassDtl _bClassDtlByTagDeliveryOutFlg;

    /**
     * [get] B_CLASS_DTL by my TAG_DELIVERY_OUT_FLG, named 'BClassDtlByTagDeliveryOutFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByTagDeliveryOutFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByTagDeliveryOutFlg() {
        return _bClassDtlByTagDeliveryOutFlg;
    }

    /**
     * [set] B_CLASS_DTL by my TAG_DELIVERY_OUT_FLG, named 'BClassDtlByTagDeliveryOutFlg'.
     * @param bClassDtlByTagDeliveryOutFlg The entity of foreign property 'BClassDtlByTagDeliveryOutFlg'. (NullAllowed)
     */
    public void setBClassDtlByTagDeliveryOutFlg(BClassDtl bClassDtlByTagDeliveryOutFlg) {
        _bClassDtlByTagDeliveryOutFlg = bClassDtlByTagDeliveryOutFlg;
    }

    /** B_CLASS_DTL by my USE_HT_SHIP_FLG, named 'BClassDtlByUseHtShipFlg'. */
    protected BClassDtl _bClassDtlByUseHtShipFlg;

    /**
     * [get] B_CLASS_DTL by my USE_HT_SHIP_FLG, named 'BClassDtlByUseHtShipFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByUseHtShipFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByUseHtShipFlg() {
        return _bClassDtlByUseHtShipFlg;
    }

    /**
     * [set] B_CLASS_DTL by my USE_HT_SHIP_FLG, named 'BClassDtlByUseHtShipFlg'.
     * @param bClassDtlByUseHtShipFlg The entity of foreign property 'BClassDtlByUseHtShipFlg'. (NullAllowed)
     */
    public void setBClassDtlByUseHtShipFlg(BClassDtl bClassDtlByUseHtShipFlg) {
        _bClassDtlByUseHtShipFlg = bClassDtlByUseHtShipFlg;
    }

    /** B_CLASS_DTL by my INSPECTION_LABEL_OUT_FLG, named 'BClassDtlByInspectionLabelOutFlg'. */
    protected BClassDtl _bClassDtlByInspectionLabelOutFlg;

    /**
     * [get] B_CLASS_DTL by my INSPECTION_LABEL_OUT_FLG, named 'BClassDtlByInspectionLabelOutFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByInspectionLabelOutFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByInspectionLabelOutFlg() {
        return _bClassDtlByInspectionLabelOutFlg;
    }

    /**
     * [set] B_CLASS_DTL by my INSPECTION_LABEL_OUT_FLG, named 'BClassDtlByInspectionLabelOutFlg'.
     * @param bClassDtlByInspectionLabelOutFlg The entity of foreign property 'BClassDtlByInspectionLabelOutFlg'. (NullAllowed)
     */
    public void setBClassDtlByInspectionLabelOutFlg(BClassDtl bClassDtlByInspectionLabelOutFlg) {
        _bClassDtlByInspectionLabelOutFlg = bClassDtlByInspectionLabelOutFlg;
    }

    /** B_CLASS_DTL by my SGL_ROW_PIC_FLG, named 'BClassDtlBySglRowPicFlg'. */
    protected BClassDtl _bClassDtlBySglRowPicFlg;

    /**
     * [get] B_CLASS_DTL by my SGL_ROW_PIC_FLG, named 'BClassDtlBySglRowPicFlg'. <br>
     * @return The entity of foreign property 'BClassDtlBySglRowPicFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlBySglRowPicFlg() {
        return _bClassDtlBySglRowPicFlg;
    }

    /**
     * [set] B_CLASS_DTL by my SGL_ROW_PIC_FLG, named 'BClassDtlBySglRowPicFlg'.
     * @param bClassDtlBySglRowPicFlg The entity of foreign property 'BClassDtlBySglRowPicFlg'. (NullAllowed)
     */
    public void setBClassDtlBySglRowPicFlg(BClassDtl bClassDtlBySglRowPicFlg) {
        _bClassDtlBySglRowPicFlg = bClassDtlBySglRowPicFlg;
    }

    /** B_CLASS_DTL by my TOTAL_PIC_FLG, named 'BClassDtlByTotalPicFlg'. */
    protected BClassDtl _bClassDtlByTotalPicFlg;

    /**
     * [get] B_CLASS_DTL by my TOTAL_PIC_FLG, named 'BClassDtlByTotalPicFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByTotalPicFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByTotalPicFlg() {
        return _bClassDtlByTotalPicFlg;
    }

    /**
     * [set] B_CLASS_DTL by my TOTAL_PIC_FLG, named 'BClassDtlByTotalPicFlg'.
     * @param bClassDtlByTotalPicFlg The entity of foreign property 'BClassDtlByTotalPicFlg'. (NullAllowed)
     */
    public void setBClassDtlByTotalPicFlg(BClassDtl bClassDtlByTotalPicFlg) {
        _bClassDtlByTotalPicFlg = bClassDtlByTotalPicFlg;
    }

    /** B_CLASS_DTL by my PIC_MTHD_RCMD_FLG, named 'BClassDtlByPicMthdRcmdFlg'. */
    protected BClassDtl _bClassDtlByPicMthdRcmdFlg;

    /**
     * [get] B_CLASS_DTL by my PIC_MTHD_RCMD_FLG, named 'BClassDtlByPicMthdRcmdFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByPicMthdRcmdFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByPicMthdRcmdFlg() {
        return _bClassDtlByPicMthdRcmdFlg;
    }

    /**
     * [set] B_CLASS_DTL by my PIC_MTHD_RCMD_FLG, named 'BClassDtlByPicMthdRcmdFlg'.
     * @param bClassDtlByPicMthdRcmdFlg The entity of foreign property 'BClassDtlByPicMthdRcmdFlg'. (NullAllowed)
     */
    public void setBClassDtlByPicMthdRcmdFlg(BClassDtl bClassDtlByPicMthdRcmdFlg) {
        _bClassDtlByPicMthdRcmdFlg = bClassDtlByPicMthdRcmdFlg;
    }

    /** B_CLASS_DTL by my PIC_MTHD_RCMD_BREAK_KEY, named 'BClassDtlByPicMthdRcmdBreakKey'. */
    protected BClassDtl _bClassDtlByPicMthdRcmdBreakKey;

    /**
     * [get] B_CLASS_DTL by my PIC_MTHD_RCMD_BREAK_KEY, named 'BClassDtlByPicMthdRcmdBreakKey'. <br>
     * @return The entity of foreign property 'BClassDtlByPicMthdRcmdBreakKey'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByPicMthdRcmdBreakKey() {
        return _bClassDtlByPicMthdRcmdBreakKey;
    }

    /**
     * [set] B_CLASS_DTL by my PIC_MTHD_RCMD_BREAK_KEY, named 'BClassDtlByPicMthdRcmdBreakKey'.
     * @param bClassDtlByPicMthdRcmdBreakKey The entity of foreign property 'BClassDtlByPicMthdRcmdBreakKey'. (NullAllowed)
     */
    public void setBClassDtlByPicMthdRcmdBreakKey(BClassDtl bClassDtlByPicMthdRcmdBreakKey) {
        _bClassDtlByPicMthdRcmdBreakKey = bClassDtlByPicMthdRcmdBreakKey;
    }

    /** B_CLASS_DTL by my AUTO_SHIP_INST_FLG, named 'BClassDtlByAutoShipInstFlg'. */
    protected BClassDtl _bClassDtlByAutoShipInstFlg;

    /**
     * [get] B_CLASS_DTL by my AUTO_SHIP_INST_FLG, named 'BClassDtlByAutoShipInstFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByAutoShipInstFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByAutoShipInstFlg() {
        return _bClassDtlByAutoShipInstFlg;
    }

    /**
     * [set] B_CLASS_DTL by my AUTO_SHIP_INST_FLG, named 'BClassDtlByAutoShipInstFlg'.
     * @param bClassDtlByAutoShipInstFlg The entity of foreign property 'BClassDtlByAutoShipInstFlg'. (NullAllowed)
     */
    public void setBClassDtlByAutoShipInstFlg(BClassDtl bClassDtlByAutoShipInstFlg) {
        _bClassDtlByAutoShipInstFlg = bClassDtlByAutoShipInstFlg;
    }

    /** B_CLASS_DTL by my STOCK_OUT_AUTO_INST_FLG, named 'BClassDtlByStockOutAutoInstFlg'. */
    protected BClassDtl _bClassDtlByStockOutAutoInstFlg;

    /**
     * [get] B_CLASS_DTL by my STOCK_OUT_AUTO_INST_FLG, named 'BClassDtlByStockOutAutoInstFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByStockOutAutoInstFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByStockOutAutoInstFlg() {
        return _bClassDtlByStockOutAutoInstFlg;
    }

    /**
     * [set] B_CLASS_DTL by my STOCK_OUT_AUTO_INST_FLG, named 'BClassDtlByStockOutAutoInstFlg'.
     * @param bClassDtlByStockOutAutoInstFlg The entity of foreign property 'BClassDtlByStockOutAutoInstFlg'. (NullAllowed)
     */
    public void setBClassDtlByStockOutAutoInstFlg(BClassDtl bClassDtlByStockOutAutoInstFlg) {
        _bClassDtlByStockOutAutoInstFlg = bClassDtlByStockOutAutoInstFlg;
    }

    /** B_CLASS_DTL by my AUTO_EMG_SET_FLG, named 'BClassDtlByAutoEmgSetFlg'. */
    protected BClassDtl _bClassDtlByAutoEmgSetFlg;

    /**
     * [get] B_CLASS_DTL by my AUTO_EMG_SET_FLG, named 'BClassDtlByAutoEmgSetFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByAutoEmgSetFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByAutoEmgSetFlg() {
        return _bClassDtlByAutoEmgSetFlg;
    }

    /**
     * [set] B_CLASS_DTL by my AUTO_EMG_SET_FLG, named 'BClassDtlByAutoEmgSetFlg'.
     * @param bClassDtlByAutoEmgSetFlg The entity of foreign property 'BClassDtlByAutoEmgSetFlg'. (NullAllowed)
     */
    public void setBClassDtlByAutoEmgSetFlg(BClassDtl bClassDtlByAutoEmgSetFlg) {
        _bClassDtlByAutoEmgSetFlg = bClassDtlByAutoEmgSetFlg;
    }

    /** B_CLASS_DTL by my AUTO_EMG_SET_TGT, named 'BClassDtlByAutoEmgSetTgt'. */
    protected BClassDtl _bClassDtlByAutoEmgSetTgt;

    /**
     * [get] B_CLASS_DTL by my AUTO_EMG_SET_TGT, named 'BClassDtlByAutoEmgSetTgt'. <br>
     * @return The entity of foreign property 'BClassDtlByAutoEmgSetTgt'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByAutoEmgSetTgt() {
        return _bClassDtlByAutoEmgSetTgt;
    }

    /**
     * [set] B_CLASS_DTL by my AUTO_EMG_SET_TGT, named 'BClassDtlByAutoEmgSetTgt'.
     * @param bClassDtlByAutoEmgSetTgt The entity of foreign property 'BClassDtlByAutoEmgSetTgt'. (NullAllowed)
     */
    public void setBClassDtlByAutoEmgSetTgt(BClassDtl bClassDtlByAutoEmgSetTgt) {
        _bClassDtlByAutoEmgSetTgt = bClassDtlByAutoEmgSetTgt;
    }

    /** B_CLASS_DTL by my STOCK_OUT_ALLOC_CLS, named 'BClassDtlByStockOutAllocCls'. */
    protected BClassDtl _bClassDtlByStockOutAllocCls;

    /**
     * [get] B_CLASS_DTL by my STOCK_OUT_ALLOC_CLS, named 'BClassDtlByStockOutAllocCls'. <br>
     * @return The entity of foreign property 'BClassDtlByStockOutAllocCls'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByStockOutAllocCls() {
        return _bClassDtlByStockOutAllocCls;
    }

    /**
     * [set] B_CLASS_DTL by my STOCK_OUT_ALLOC_CLS, named 'BClassDtlByStockOutAllocCls'.
     * @param bClassDtlByStockOutAllocCls The entity of foreign property 'BClassDtlByStockOutAllocCls'. (NullAllowed)
     */
    public void setBClassDtlByStockOutAllocCls(BClassDtl bClassDtlByStockOutAllocCls) {
        _bClassDtlByStockOutAllocCls = bClassDtlByStockOutAllocCls;
    }

    /** B_CLASS_DTL by my STOCK_OUT_INST_CXL_FLG, named 'BClassDtlByStockOutInstCxlFlg'. */
    protected BClassDtl _bClassDtlByStockOutInstCxlFlg;

    /**
     * [get] B_CLASS_DTL by my STOCK_OUT_INST_CXL_FLG, named 'BClassDtlByStockOutInstCxlFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByStockOutInstCxlFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByStockOutInstCxlFlg() {
        return _bClassDtlByStockOutInstCxlFlg;
    }

    /**
     * [set] B_CLASS_DTL by my STOCK_OUT_INST_CXL_FLG, named 'BClassDtlByStockOutInstCxlFlg'.
     * @param bClassDtlByStockOutInstCxlFlg The entity of foreign property 'BClassDtlByStockOutInstCxlFlg'. (NullAllowed)
     */
    public void setBClassDtlByStockOutInstCxlFlg(BClassDtl bClassDtlByStockOutInstCxlFlg) {
        _bClassDtlByStockOutInstCxlFlg = bClassDtlByStockOutInstCxlFlg;
    }

    /** B_CLASS_DTL by my STOCK_OUT_INST_SPLIT_FLG, named 'BClassDtlByStockOutInstSplitFlg'. */
    protected BClassDtl _bClassDtlByStockOutInstSplitFlg;

    /**
     * [get] B_CLASS_DTL by my STOCK_OUT_INST_SPLIT_FLG, named 'BClassDtlByStockOutInstSplitFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByStockOutInstSplitFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByStockOutInstSplitFlg() {
        return _bClassDtlByStockOutInstSplitFlg;
    }

    /**
     * [set] B_CLASS_DTL by my STOCK_OUT_INST_SPLIT_FLG, named 'BClassDtlByStockOutInstSplitFlg'.
     * @param bClassDtlByStockOutInstSplitFlg The entity of foreign property 'BClassDtlByStockOutInstSplitFlg'. (NullAllowed)
     */
    public void setBClassDtlByStockOutInstSplitFlg(BClassDtl bClassDtlByStockOutInstSplitFlg) {
        _bClassDtlByStockOutInstSplitFlg = bClassDtlByStockOutInstSplitFlg;
    }

    /** B_CLASS_DTL by my PIC_MTHD_RCMD_MLT_PL_OUT, named 'BClassDtlByPicMthdRcmdMltPlOut'. */
    protected BClassDtl _bClassDtlByPicMthdRcmdMltPlOut;

    /**
     * [get] B_CLASS_DTL by my PIC_MTHD_RCMD_MLT_PL_OUT, named 'BClassDtlByPicMthdRcmdMltPlOut'. <br>
     * @return The entity of foreign property 'BClassDtlByPicMthdRcmdMltPlOut'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByPicMthdRcmdMltPlOut() {
        return _bClassDtlByPicMthdRcmdMltPlOut;
    }

    /**
     * [set] B_CLASS_DTL by my PIC_MTHD_RCMD_MLT_PL_OUT, named 'BClassDtlByPicMthdRcmdMltPlOut'.
     * @param bClassDtlByPicMthdRcmdMltPlOut The entity of foreign property 'BClassDtlByPicMthdRcmdMltPlOut'. (NullAllowed)
     */
    public void setBClassDtlByPicMthdRcmdMltPlOut(BClassDtl bClassDtlByPicMthdRcmdMltPlOut) {
        _bClassDtlByPicMthdRcmdMltPlOut = bClassDtlByPicMthdRcmdMltPlOut;
    }

    /** B_CLASS_DTL by my PIC_MTHD_RCMD_SPL_SL_OUT, named 'BClassDtlByPicMthdRcmdSplSlOut'. */
    protected BClassDtl _bClassDtlByPicMthdRcmdSplSlOut;

    /**
     * [get] B_CLASS_DTL by my PIC_MTHD_RCMD_SPL_SL_OUT, named 'BClassDtlByPicMthdRcmdSplSlOut'. <br>
     * @return The entity of foreign property 'BClassDtlByPicMthdRcmdSplSlOut'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByPicMthdRcmdSplSlOut() {
        return _bClassDtlByPicMthdRcmdSplSlOut;
    }

    /**
     * [set] B_CLASS_DTL by my PIC_MTHD_RCMD_SPL_SL_OUT, named 'BClassDtlByPicMthdRcmdSplSlOut'.
     * @param bClassDtlByPicMthdRcmdSplSlOut The entity of foreign property 'BClassDtlByPicMthdRcmdSplSlOut'. (NullAllowed)
     */
    public void setBClassDtlByPicMthdRcmdSplSlOut(BClassDtl bClassDtlByPicMthdRcmdSplSlOut) {
        _bClassDtlByPicMthdRcmdSplSlOut = bClassDtlByPicMthdRcmdSplSlOut;
    }

    /** B_CLASS_DTL by my ERROR_SOUND_PLAY_FLG, named 'BClassDtlByErrorSoundPlayFlg'. */
    protected BClassDtl _bClassDtlByErrorSoundPlayFlg;

    /**
     * [get] B_CLASS_DTL by my ERROR_SOUND_PLAY_FLG, named 'BClassDtlByErrorSoundPlayFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByErrorSoundPlayFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByErrorSoundPlayFlg() {
        return _bClassDtlByErrorSoundPlayFlg;
    }

    /**
     * [set] B_CLASS_DTL by my ERROR_SOUND_PLAY_FLG, named 'BClassDtlByErrorSoundPlayFlg'.
     * @param bClassDtlByErrorSoundPlayFlg The entity of foreign property 'BClassDtlByErrorSoundPlayFlg'. (NullAllowed)
     */
    public void setBClassDtlByErrorSoundPlayFlg(BClassDtl bClassDtlByErrorSoundPlayFlg) {
        _bClassDtlByErrorSoundPlayFlg = bClassDtlByErrorSoundPlayFlg;
    }

    /** B_CLASS_DTL by my WARN_SOUND_PLAY_FLG, named 'BClassDtlByWarnSoundPlayFlg'. */
    protected BClassDtl _bClassDtlByWarnSoundPlayFlg;

    /**
     * [get] B_CLASS_DTL by my WARN_SOUND_PLAY_FLG, named 'BClassDtlByWarnSoundPlayFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByWarnSoundPlayFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByWarnSoundPlayFlg() {
        return _bClassDtlByWarnSoundPlayFlg;
    }

    /**
     * [set] B_CLASS_DTL by my WARN_SOUND_PLAY_FLG, named 'BClassDtlByWarnSoundPlayFlg'.
     * @param bClassDtlByWarnSoundPlayFlg The entity of foreign property 'BClassDtlByWarnSoundPlayFlg'. (NullAllowed)
     */
    public void setBClassDtlByWarnSoundPlayFlg(BClassDtl bClassDtlByWarnSoundPlayFlg) {
        _bClassDtlByWarnSoundPlayFlg = bClassDtlByWarnSoundPlayFlg;
    }

    /** B_CLASS_DTL by my INSP_SOUND_PLAY_FLG, named 'BClassDtlByInspSoundPlayFlg'. */
    protected BClassDtl _bClassDtlByInspSoundPlayFlg;

    /**
     * [get] B_CLASS_DTL by my INSP_SOUND_PLAY_FLG, named 'BClassDtlByInspSoundPlayFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByInspSoundPlayFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByInspSoundPlayFlg() {
        return _bClassDtlByInspSoundPlayFlg;
    }

    /**
     * [set] B_CLASS_DTL by my INSP_SOUND_PLAY_FLG, named 'BClassDtlByInspSoundPlayFlg'.
     * @param bClassDtlByInspSoundPlayFlg The entity of foreign property 'BClassDtlByInspSoundPlayFlg'. (NullAllowed)
     */
    public void setBClassDtlByInspSoundPlayFlg(BClassDtl bClassDtlByInspSoundPlayFlg) {
        _bClassDtlByInspSoundPlayFlg = bClassDtlByInspSoundPlayFlg;
    }

    /** B_CLASS_DTL by my INSP_COMP_SOUND_PLAY_FLG, named 'BClassDtlByInspCompSoundPlayFlg'. */
    protected BClassDtl _bClassDtlByInspCompSoundPlayFlg;

    /**
     * [get] B_CLASS_DTL by my INSP_COMP_SOUND_PLAY_FLG, named 'BClassDtlByInspCompSoundPlayFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByInspCompSoundPlayFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByInspCompSoundPlayFlg() {
        return _bClassDtlByInspCompSoundPlayFlg;
    }

    /**
     * [set] B_CLASS_DTL by my INSP_COMP_SOUND_PLAY_FLG, named 'BClassDtlByInspCompSoundPlayFlg'.
     * @param bClassDtlByInspCompSoundPlayFlg The entity of foreign property 'BClassDtlByInspCompSoundPlayFlg'. (NullAllowed)
     */
    public void setBClassDtlByInspCompSoundPlayFlg(BClassDtl bClassDtlByInspCompSoundPlayFlg) {
        _bClassDtlByInspCompSoundPlayFlg = bClassDtlByInspCompSoundPlayFlg;
    }

    /** B_CLASS_DTL by my CES_INTEGRATION_FLG, named 'BClassDtlByCesIntegrationFlg'. */
    protected BClassDtl _bClassDtlByCesIntegrationFlg;

    /**
     * [get] B_CLASS_DTL by my CES_INTEGRATION_FLG, named 'BClassDtlByCesIntegrationFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByCesIntegrationFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByCesIntegrationFlg() {
        return _bClassDtlByCesIntegrationFlg;
    }

    /**
     * [set] B_CLASS_DTL by my CES_INTEGRATION_FLG, named 'BClassDtlByCesIntegrationFlg'.
     * @param bClassDtlByCesIntegrationFlg The entity of foreign property 'BClassDtlByCesIntegrationFlg'. (NullAllowed)
     */
    public void setBClassDtlByCesIntegrationFlg(BClassDtl bClassDtlByCesIntegrationFlg) {
        _bClassDtlByCesIntegrationFlg = bClassDtlByCesIntegrationFlg;
    }

    /** B_CLASS_DTL by my PACKING_SLIP_AUTO_OUTPUT_FLG, named 'BClassDtlByPackingSlipAutoOutputFlg'. */
    protected BClassDtl _bClassDtlByPackingSlipAutoOutputFlg;

    /**
     * [get] B_CLASS_DTL by my PACKING_SLIP_AUTO_OUTPUT_FLG, named 'BClassDtlByPackingSlipAutoOutputFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByPackingSlipAutoOutputFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByPackingSlipAutoOutputFlg() {
        return _bClassDtlByPackingSlipAutoOutputFlg;
    }

    /**
     * [set] B_CLASS_DTL by my PACKING_SLIP_AUTO_OUTPUT_FLG, named 'BClassDtlByPackingSlipAutoOutputFlg'.
     * @param bClassDtlByPackingSlipAutoOutputFlg The entity of foreign property 'BClassDtlByPackingSlipAutoOutputFlg'. (NullAllowed)
     */
    public void setBClassDtlByPackingSlipAutoOutputFlg(BClassDtl bClassDtlByPackingSlipAutoOutputFlg) {
        _bClassDtlByPackingSlipAutoOutputFlg = bClassDtlByPackingSlipAutoOutputFlg;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsMParam) {
            BsMParam other = (BsMParam)obj;
            if (!xSV(_clientCenterId, other._clientCenterId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _clientCenterId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_mClientCenter != null)
        { sb.append(li).append(xbRDS(_mClientCenter, "mClientCenter")); }
        if (_mBox != null)
        { sb.append(li).append(xbRDS(_mBox, "mBox")); }
        if (_mDeliveryCourse != null)
        { sb.append(li).append(xbRDS(_mDeliveryCourse, "mDeliveryCourse")); }
        if (_mZone != null)
        { sb.append(li).append(xbRDS(_mZone, "mZone")); }
        if (_mBoxGrp != null)
        { sb.append(li).append(xbRDS(_mBoxGrp, "mBoxGrp")); }
        if (_bClassDtlByAfterTagOutFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByAfterTagOutFlg, "bClassDtlByAfterTagOutFlg")); }
        if (_bClassDtlByAfterDelivSlipOutFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByAfterDelivSlipOutFlg, "bClassDtlByAfterDelivSlipOutFlg")); }
        if (_bClassDtlByAfterDelivSlipOutTgt != null)
        { sb.append(li).append(xbRDS(_bClassDtlByAfterDelivSlipOutTgt, "bClassDtlByAfterDelivSlipOutTgt")); }
        if (_bClassDtlBySglRowInspAfterOutCls != null)
        { sb.append(li).append(xbRDS(_bClassDtlBySglRowInspAfterOutCls, "bClassDtlBySglRowInspAfterOutCls")); }
        if (_bClassDtlByBoxSelectSkip != null)
        { sb.append(li).append(xbRDS(_bClassDtlByBoxSelectSkip, "bClassDtlByBoxSelectSkip")); }
        if (_bClassDtlByCasePicFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByCasePicFlg, "bClassDtlByCasePicFlg")); }
        if (_bClassDtlByDelFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByDelFlg, "bClassDtlByDelFlg")); }
        if (_bClassDtlByHtCharReadFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByHtCharReadFlg, "bClassDtlByHtCharReadFlg")); }
        if (_bClassDtlByMergeCls != null)
        { sb.append(li).append(xbRDS(_bClassDtlByMergeCls, "bClassDtlByMergeCls")); }
        if (_bClassDtlByMultiPicCls != null)
        { sb.append(li).append(xbRDS(_bClassDtlByMultiPicCls, "bClassDtlByMultiPicCls")); }
        if (_bClassDtlByOverStoreNumFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByOverStoreNumFlg, "bClassDtlByOverStoreNumFlg")); }
        if (_bClassDtlByPackingCalCls != null)
        { sb.append(li).append(xbRDS(_bClassDtlByPackingCalCls, "bClassDtlByPackingCalCls")); }
        if (_bClassDtlByPackingProcessCls != null)
        { sb.append(li).append(xbRDS(_bClassDtlByPackingProcessCls, "bClassDtlByPackingProcessCls")); }
        if (_bClassDtlByPastStoreDtFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByPastStoreDtFlg, "bClassDtlByPastStoreDtFlg")); }
        if (_bClassDtlByProductLabelJanBarcode != null)
        { sb.append(li).append(xbRDS(_bClassDtlByProductLabelJanBarcode, "bClassDtlByProductLabelJanBarcode")); }
        if (_bClassDtlByProductLabelOutUnit != null)
        { sb.append(li).append(xbRDS(_bClassDtlByProductLabelOutUnit, "bClassDtlByProductLabelOutUnit")); }
        if (_bClassDtlByProductLabelProdBarcode != null)
        { sb.append(li).append(xbRDS(_bClassDtlByProductLabelProdBarcode, "bClassDtlByProductLabelProdBarcode")); }
        if (_bClassDtlByProductPartPacking != null)
        { sb.append(li).append(xbRDS(_bClassDtlByProductPartPacking, "bClassDtlByProductPartPacking")); }
        if (_bClassDtlByDecimalProductPacking != null)
        { sb.append(li).append(xbRDS(_bClassDtlByDecimalProductPacking, "bClassDtlByDecimalProductPacking")); }
        if (_bClassDtlByEmReplenishAllocCls != null)
        { sb.append(li).append(xbRDS(_bClassDtlByEmReplenishAllocCls, "bClassDtlByEmReplenishAllocCls")); }
        if (_bClassDtlByRgReplenishUnitCls != null)
        { sb.append(li).append(xbRDS(_bClassDtlByRgReplenishUnitCls, "bClassDtlByRgReplenishUnitCls")); }
        if (_bClassDtlByEmReplenishUnitCls != null)
        { sb.append(li).append(xbRDS(_bClassDtlByEmReplenishUnitCls, "bClassDtlByEmReplenishUnitCls")); }
        if (_bClassDtlByResultAfterProductLabel != null)
        { sb.append(li).append(xbRDS(_bClassDtlByResultAfterProductLabel, "bClassDtlByResultAfterProductLabel")); }
        if (_bClassDtlByResultAfterProductTarget != null)
        { sb.append(li).append(xbRDS(_bClassDtlByResultAfterProductTarget, "bClassDtlByResultAfterProductTarget")); }
        if (_bClassDtlByStoreDtFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByStoreDtFlg, "bClassDtlByStoreDtFlg")); }
        if (_bClassDtlByStoreNoFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByStoreNoFlg, "bClassDtlByStoreNoFlg")); }
        if (_bClassDtlByTagDeliveryOutFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByTagDeliveryOutFlg, "bClassDtlByTagDeliveryOutFlg")); }
        if (_bClassDtlByUseHtShipFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByUseHtShipFlg, "bClassDtlByUseHtShipFlg")); }
        if (_bClassDtlByInspectionLabelOutFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByInspectionLabelOutFlg, "bClassDtlByInspectionLabelOutFlg")); }
        if (_bClassDtlBySglRowPicFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlBySglRowPicFlg, "bClassDtlBySglRowPicFlg")); }
        if (_bClassDtlByTotalPicFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByTotalPicFlg, "bClassDtlByTotalPicFlg")); }
        if (_bClassDtlByPicMthdRcmdFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByPicMthdRcmdFlg, "bClassDtlByPicMthdRcmdFlg")); }
        if (_bClassDtlByPicMthdRcmdBreakKey != null)
        { sb.append(li).append(xbRDS(_bClassDtlByPicMthdRcmdBreakKey, "bClassDtlByPicMthdRcmdBreakKey")); }
        if (_bClassDtlByAutoShipInstFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByAutoShipInstFlg, "bClassDtlByAutoShipInstFlg")); }
        if (_bClassDtlByStockOutAutoInstFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByStockOutAutoInstFlg, "bClassDtlByStockOutAutoInstFlg")); }
        if (_bClassDtlByAutoEmgSetFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByAutoEmgSetFlg, "bClassDtlByAutoEmgSetFlg")); }
        if (_bClassDtlByAutoEmgSetTgt != null)
        { sb.append(li).append(xbRDS(_bClassDtlByAutoEmgSetTgt, "bClassDtlByAutoEmgSetTgt")); }
        if (_bClassDtlByStockOutAllocCls != null)
        { sb.append(li).append(xbRDS(_bClassDtlByStockOutAllocCls, "bClassDtlByStockOutAllocCls")); }
        if (_bClassDtlByStockOutInstCxlFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByStockOutInstCxlFlg, "bClassDtlByStockOutInstCxlFlg")); }
        if (_bClassDtlByStockOutInstSplitFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByStockOutInstSplitFlg, "bClassDtlByStockOutInstSplitFlg")); }
        if (_bClassDtlByPicMthdRcmdMltPlOut != null)
        { sb.append(li).append(xbRDS(_bClassDtlByPicMthdRcmdMltPlOut, "bClassDtlByPicMthdRcmdMltPlOut")); }
        if (_bClassDtlByPicMthdRcmdSplSlOut != null)
        { sb.append(li).append(xbRDS(_bClassDtlByPicMthdRcmdSplSlOut, "bClassDtlByPicMthdRcmdSplSlOut")); }
        if (_bClassDtlByErrorSoundPlayFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByErrorSoundPlayFlg, "bClassDtlByErrorSoundPlayFlg")); }
        if (_bClassDtlByWarnSoundPlayFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByWarnSoundPlayFlg, "bClassDtlByWarnSoundPlayFlg")); }
        if (_bClassDtlByInspSoundPlayFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByInspSoundPlayFlg, "bClassDtlByInspSoundPlayFlg")); }
        if (_bClassDtlByInspCompSoundPlayFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByInspCompSoundPlayFlg, "bClassDtlByInspCompSoundPlayFlg")); }
        if (_bClassDtlByCesIntegrationFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByCesIntegrationFlg, "bClassDtlByCesIntegrationFlg")); }
        if (_bClassDtlByPackingSlipAutoOutputFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByPackingSlipAutoOutputFlg, "bClassDtlByPackingSlipAutoOutputFlg")); }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_clientCenterId));
        sb.append(dm).append(xfND(_deliveryCourseId));
        sb.append(dm).append(xfND(_storeDtFlg));
        sb.append(dm).append(xfND(_storeNoFlg));
        sb.append(dm).append(xfND(_mergeCls));
        sb.append(dm).append(xfND(_tKeepingDays));
        sb.append(dm).append(xfND(_hKeepingDays));
        sb.append(dm).append(xfND(_dKeepingDays));
        sb.append(dm).append(xfND(_overStoreNumFlg));
        sb.append(dm).append(xfND(_pastStoreDtFlg));
        sb.append(dm).append(xfND(_useHtShipFlg));
        sb.append(dm).append(xfND(_allocSortKey));
        sb.append(dm).append(xfND(_rgReplenishUnitCls));
        sb.append(dm).append(xfND(_emReplenishUnitCls));
        sb.append(dm).append(xfND(_emReplenishZoneId));
        sb.append(dm).append(xfND(_emReplenishAllocCls));
        sb.append(dm).append(xfND(_packingCalCls));
        sb.append(dm).append(xfND(_packingProcessCls));
        sb.append(dm).append(xfND(_productPartPacking));
        sb.append(dm).append(xfND(_decimalProductPacking));
        sb.append(dm).append(xfND(_packingBoxGroupId));
        sb.append(dm).append(xfND(_totalPicFlg));
        sb.append(dm).append(xfND(_multiPicCls));
        sb.append(dm).append(xfND(_backetColNum));
        sb.append(dm).append(xfND(_backetRowNum));
        sb.append(dm).append(xfND(_casePicFlg));
        sb.append(dm).append(xfND(_sglRowPicFlg));
        sb.append(dm).append(xfND(_sglRowPicMaxInstNum));
        sb.append(dm).append(xfND(_picMthdRcmdFlg));
        sb.append(dm).append(xfND(_picMthdRcmdBreakKey));
        sb.append(dm).append(xfND(_picMthdRcmdApiKey));
        sb.append(dm).append(xfND(_picMthdRcmdMltPlOut));
        sb.append(dm).append(xfND(_picMthdRcmdSplSlOut));
        sb.append(dm).append(xfND(_productLabelOutUnit));
        sb.append(dm).append(xfND(_resultAfterProductLabel));
        sb.append(dm).append(xfND(_resultAfterProductTarget));
        sb.append(dm).append(xfND(_productLabelJanBarcode));
        sb.append(dm).append(xfND(_productLabelProdBarcode));
        sb.append(dm).append(xfND(_productLabelJanStartbit));
        sb.append(dm).append(xfND(_productLabelJanEndbit));
        sb.append(dm).append(xfND(_productLabelProdStartbit));
        sb.append(dm).append(xfND(_productLabelProdEndbit));
        sb.append(dm).append(xfND(_boxSelectSkip));
        sb.append(dm).append(xfND(_defaultBoxId));
        sb.append(dm).append(xfND(_errorSoundPlayFlg));
        sb.append(dm).append(xfND(_warnSoundPlayFlg));
        sb.append(dm).append(xfND(_inspSoundPlayFlg));
        sb.append(dm).append(xfND(_inspCompSoundPlayFlg));
        sb.append(dm).append(xfND(_afterTagOutFlg));
        sb.append(dm).append(xfND(_tagDeliveryOutFlg));
        sb.append(dm).append(xfND(_afterDelivSlipOutFlg));
        sb.append(dm).append(xfND(_afterDelivSlipOutTgt));
        sb.append(dm).append(xfND(_sglRowInspAfterOutCls));
        sb.append(dm).append(xfND(_htCharReadFlg));
        sb.append(dm).append(xfND(_htLotInputType));
        sb.append(dm).append(xfND(_htSerialInputType));
        sb.append(dm).append(xfND(_inspectionLabelOutFlg));
        sb.append(dm).append(xfND(_autoShipInstFlg));
        sb.append(dm).append(xfND(_stockOutAutoInstFlg));
        sb.append(dm).append(xfND(_autoEmgSetFlg));
        sb.append(dm).append(xfND(_autoEmgSetTgt));
        sb.append(dm).append(xfND(_autoEmgSetMinute));
        sb.append(dm).append(xfND(_stockOutInstCxlFlg));
        sb.append(dm).append(xfND(_stockOutAllocCls));
        sb.append(dm).append(xfND(_stockOutInstSplitFlg));
        sb.append(dm).append(xfND(_cesIntegrationFlg));
        sb.append(dm).append(xfND(_packingSlipAutoOutputFlg));
        sb.append(dm).append(xfND(_centerKbn));
        sb.append(dm).append(xfND(_delFlg));
        sb.append(dm).append(xfND(_versionNo));
        sb.append(dm).append(xfND(_controlNo));
        sb.append(dm).append(xfND(_addDt));
        sb.append(dm).append(xfND(_addUser));
        sb.append(dm).append(xfND(_addProcess));
        sb.append(dm).append(xfND(_updDt));
        sb.append(dm).append(xfND(_updUser));
        sb.append(dm).append(xfND(_updProcess));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_mClientCenter != null)
        { sb.append(dm).append("mClientCenter"); }
        if (_mBox != null)
        { sb.append(dm).append("mBox"); }
        if (_mDeliveryCourse != null)
        { sb.append(dm).append("mDeliveryCourse"); }
        if (_mZone != null)
        { sb.append(dm).append("mZone"); }
        if (_mBoxGrp != null)
        { sb.append(dm).append("mBoxGrp"); }
        if (_bClassDtlByAfterTagOutFlg != null)
        { sb.append(dm).append("bClassDtlByAfterTagOutFlg"); }
        if (_bClassDtlByAfterDelivSlipOutFlg != null)
        { sb.append(dm).append("bClassDtlByAfterDelivSlipOutFlg"); }
        if (_bClassDtlByAfterDelivSlipOutTgt != null)
        { sb.append(dm).append("bClassDtlByAfterDelivSlipOutTgt"); }
        if (_bClassDtlBySglRowInspAfterOutCls != null)
        { sb.append(dm).append("bClassDtlBySglRowInspAfterOutCls"); }
        if (_bClassDtlByBoxSelectSkip != null)
        { sb.append(dm).append("bClassDtlByBoxSelectSkip"); }
        if (_bClassDtlByCasePicFlg != null)
        { sb.append(dm).append("bClassDtlByCasePicFlg"); }
        if (_bClassDtlByDelFlg != null)
        { sb.append(dm).append("bClassDtlByDelFlg"); }
        if (_bClassDtlByHtCharReadFlg != null)
        { sb.append(dm).append("bClassDtlByHtCharReadFlg"); }
        if (_bClassDtlByMergeCls != null)
        { sb.append(dm).append("bClassDtlByMergeCls"); }
        if (_bClassDtlByMultiPicCls != null)
        { sb.append(dm).append("bClassDtlByMultiPicCls"); }
        if (_bClassDtlByOverStoreNumFlg != null)
        { sb.append(dm).append("bClassDtlByOverStoreNumFlg"); }
        if (_bClassDtlByPackingCalCls != null)
        { sb.append(dm).append("bClassDtlByPackingCalCls"); }
        if (_bClassDtlByPackingProcessCls != null)
        { sb.append(dm).append("bClassDtlByPackingProcessCls"); }
        if (_bClassDtlByPastStoreDtFlg != null)
        { sb.append(dm).append("bClassDtlByPastStoreDtFlg"); }
        if (_bClassDtlByProductLabelJanBarcode != null)
        { sb.append(dm).append("bClassDtlByProductLabelJanBarcode"); }
        if (_bClassDtlByProductLabelOutUnit != null)
        { sb.append(dm).append("bClassDtlByProductLabelOutUnit"); }
        if (_bClassDtlByProductLabelProdBarcode != null)
        { sb.append(dm).append("bClassDtlByProductLabelProdBarcode"); }
        if (_bClassDtlByProductPartPacking != null)
        { sb.append(dm).append("bClassDtlByProductPartPacking"); }
        if (_bClassDtlByDecimalProductPacking != null)
        { sb.append(dm).append("bClassDtlByDecimalProductPacking"); }
        if (_bClassDtlByEmReplenishAllocCls != null)
        { sb.append(dm).append("bClassDtlByEmReplenishAllocCls"); }
        if (_bClassDtlByRgReplenishUnitCls != null)
        { sb.append(dm).append("bClassDtlByRgReplenishUnitCls"); }
        if (_bClassDtlByEmReplenishUnitCls != null)
        { sb.append(dm).append("bClassDtlByEmReplenishUnitCls"); }
        if (_bClassDtlByResultAfterProductLabel != null)
        { sb.append(dm).append("bClassDtlByResultAfterProductLabel"); }
        if (_bClassDtlByResultAfterProductTarget != null)
        { sb.append(dm).append("bClassDtlByResultAfterProductTarget"); }
        if (_bClassDtlByStoreDtFlg != null)
        { sb.append(dm).append("bClassDtlByStoreDtFlg"); }
        if (_bClassDtlByStoreNoFlg != null)
        { sb.append(dm).append("bClassDtlByStoreNoFlg"); }
        if (_bClassDtlByTagDeliveryOutFlg != null)
        { sb.append(dm).append("bClassDtlByTagDeliveryOutFlg"); }
        if (_bClassDtlByUseHtShipFlg != null)
        { sb.append(dm).append("bClassDtlByUseHtShipFlg"); }
        if (_bClassDtlByInspectionLabelOutFlg != null)
        { sb.append(dm).append("bClassDtlByInspectionLabelOutFlg"); }
        if (_bClassDtlBySglRowPicFlg != null)
        { sb.append(dm).append("bClassDtlBySglRowPicFlg"); }
        if (_bClassDtlByTotalPicFlg != null)
        { sb.append(dm).append("bClassDtlByTotalPicFlg"); }
        if (_bClassDtlByPicMthdRcmdFlg != null)
        { sb.append(dm).append("bClassDtlByPicMthdRcmdFlg"); }
        if (_bClassDtlByPicMthdRcmdBreakKey != null)
        { sb.append(dm).append("bClassDtlByPicMthdRcmdBreakKey"); }
        if (_bClassDtlByAutoShipInstFlg != null)
        { sb.append(dm).append("bClassDtlByAutoShipInstFlg"); }
        if (_bClassDtlByStockOutAutoInstFlg != null)
        { sb.append(dm).append("bClassDtlByStockOutAutoInstFlg"); }
        if (_bClassDtlByAutoEmgSetFlg != null)
        { sb.append(dm).append("bClassDtlByAutoEmgSetFlg"); }
        if (_bClassDtlByAutoEmgSetTgt != null)
        { sb.append(dm).append("bClassDtlByAutoEmgSetTgt"); }
        if (_bClassDtlByStockOutAllocCls != null)
        { sb.append(dm).append("bClassDtlByStockOutAllocCls"); }
        if (_bClassDtlByStockOutInstCxlFlg != null)
        { sb.append(dm).append("bClassDtlByStockOutInstCxlFlg"); }
        if (_bClassDtlByStockOutInstSplitFlg != null)
        { sb.append(dm).append("bClassDtlByStockOutInstSplitFlg"); }
        if (_bClassDtlByPicMthdRcmdMltPlOut != null)
        { sb.append(dm).append("bClassDtlByPicMthdRcmdMltPlOut"); }
        if (_bClassDtlByPicMthdRcmdSplSlOut != null)
        { sb.append(dm).append("bClassDtlByPicMthdRcmdSplSlOut"); }
        if (_bClassDtlByErrorSoundPlayFlg != null)
        { sb.append(dm).append("bClassDtlByErrorSoundPlayFlg"); }
        if (_bClassDtlByWarnSoundPlayFlg != null)
        { sb.append(dm).append("bClassDtlByWarnSoundPlayFlg"); }
        if (_bClassDtlByInspSoundPlayFlg != null)
        { sb.append(dm).append("bClassDtlByInspSoundPlayFlg"); }
        if (_bClassDtlByInspCompSoundPlayFlg != null)
        { sb.append(dm).append("bClassDtlByInspCompSoundPlayFlg"); }
        if (_bClassDtlByCesIntegrationFlg != null)
        { sb.append(dm).append("bClassDtlByCesIntegrationFlg"); }
        if (_bClassDtlByPackingSlipAutoOutputFlg != null)
        { sb.append(dm).append("bClassDtlByPackingSlipAutoOutputFlg"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public MParam clone() {
        return (MParam)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] CLIENT_CENTER_ID: {PK, ID, NotNull, bigint identity(19), FK to M_CLIENT_CENTER} <br>
     * 荷主拠点ID
     * @return The value of the column 'CLIENT_CENTER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getClientCenterId() {
        checkSpecifiedProperty("clientCenterId");
        return _clientCenterId;
    }

    /**
     * [set] CLIENT_CENTER_ID: {PK, ID, NotNull, bigint identity(19), FK to M_CLIENT_CENTER} <br>
     * 荷主拠点ID
     * @param clientCenterId The value of the column 'CLIENT_CENTER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setClientCenterId(Long clientCenterId) {
        registerModifiedProperty("clientCenterId");
        _clientCenterId = clientCenterId;
    }

    /**
     * [get] DELIVERY_COURSE_ID: {IX, bigint(19), FK to M_DELIVERY_COURSE} <br>
     * 配送コースID
     * @return The value of the column 'DELIVERY_COURSE_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getDeliveryCourseId() {
        checkSpecifiedProperty("deliveryCourseId");
        return _deliveryCourseId;
    }

    /**
     * [set] DELIVERY_COURSE_ID: {IX, bigint(19), FK to M_DELIVERY_COURSE} <br>
     * 配送コースID
     * @param deliveryCourseId The value of the column 'DELIVERY_COURSE_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDeliveryCourseId(Long deliveryCourseId) {
        registerModifiedProperty("deliveryCourseId");
        _deliveryCourseId = deliveryCourseId;
    }

    /**
     * [get] STORE_DT_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=StoreDtFlg} <br>
     * 入庫日管理フラグ
     * @return The value of the column 'STORE_DT_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getStoreDtFlg() {
        checkSpecifiedProperty("storeDtFlg");
        return convertEmptyToNull(_storeDtFlg);
    }

    /**
     * [set] STORE_DT_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=StoreDtFlg} <br>
     * 入庫日管理フラグ
     * @param storeDtFlg The value of the column 'STORE_DT_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStoreDtFlg(String storeDtFlg) {
        registerModifiedProperty("storeDtFlg");
        _storeDtFlg = storeDtFlg;
    }

    /**
     * [get] STORE_NO_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=StoreNoFlg} <br>
     * 入庫No.管理フラグ
     * @return The value of the column 'STORE_NO_FLG'. (basically NotNull if selected: for the constraint)
     */
    public String getStoreNoFlg() {
        checkSpecifiedProperty("storeNoFlg");
        return convertEmptyToNull(_storeNoFlg);
    }

    /**
     * [set] STORE_NO_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=StoreNoFlg} <br>
     * 入庫No.管理フラグ
     * @param storeNoFlg The value of the column 'STORE_NO_FLG'. (basically NotNull if update: for the constraint)
     */
    public void setStoreNoFlg(String storeNoFlg) {
        registerModifiedProperty("storeNoFlg");
        _storeNoFlg = storeNoFlg;
    }

    /**
     * [get] MERGE_CLS: {NotNull, varchar(30), default=[02], FK to B_CLASS_DTL, classification=MergeCls} <br>
     * 入庫No.マージ区分
     * @return The value of the column 'MERGE_CLS'. (basically NotNull if selected: for the constraint)
     */
    public String getMergeCls() {
        checkSpecifiedProperty("mergeCls");
        return convertEmptyToNull(_mergeCls);
    }

    /**
     * [set] MERGE_CLS: {NotNull, varchar(30), default=[02], FK to B_CLASS_DTL, classification=MergeCls} <br>
     * 入庫No.マージ区分
     * @param mergeCls The value of the column 'MERGE_CLS'. (basically NotNull if update: for the constraint)
     */
    public void setMergeCls(String mergeCls) {
        registerModifiedProperty("mergeCls");
        _mergeCls = mergeCls;
    }

    /**
     * [get] T_KEEPING_DAYS: {NotNull, bigint(19), default=[(0)]} <br>
     * トランザクション保持期間
     * @return The value of the column 'T_KEEPING_DAYS'. (basically NotNull if selected: for the constraint)
     */
    public Long getTKeepingDays() {
        checkSpecifiedProperty("TKeepingDays");
        return _tKeepingDays;
    }

    /**
     * [set] T_KEEPING_DAYS: {NotNull, bigint(19), default=[(0)]} <br>
     * トランザクション保持期間
     * @param tKeepingDays The value of the column 'T_KEEPING_DAYS'. (basically NotNull if update: for the constraint)
     */
    public void setTKeepingDays(Long tKeepingDays) {
        registerModifiedProperty("TKeepingDays");
        _tKeepingDays = tKeepingDays;
    }

    /**
     * [get] H_KEEPING_DAYS: {NotNull, bigint(19), default=[(0)]} <br>
     * 履歴保持期間
     * @return The value of the column 'H_KEEPING_DAYS'. (basically NotNull if selected: for the constraint)
     */
    public Long getHKeepingDays() {
        checkSpecifiedProperty("HKeepingDays");
        return _hKeepingDays;
    }

    /**
     * [set] H_KEEPING_DAYS: {NotNull, bigint(19), default=[(0)]} <br>
     * 履歴保持期間
     * @param hKeepingDays The value of the column 'H_KEEPING_DAYS'. (basically NotNull if update: for the constraint)
     */
    public void setHKeepingDays(Long hKeepingDays) {
        registerModifiedProperty("HKeepingDays");
        _hKeepingDays = hKeepingDays;
    }

    /**
     * [get] D_KEEPING_DAYS: {NotNull, bigint(19), default=[(0)]} <br>
     * 削除保持期間
     * @return The value of the column 'D_KEEPING_DAYS'. (basically NotNull if selected: for the constraint)
     */
    public Long getDKeepingDays() {
        checkSpecifiedProperty("DKeepingDays");
        return _dKeepingDays;
    }

    /**
     * [set] D_KEEPING_DAYS: {NotNull, bigint(19), default=[(0)]} <br>
     * 削除保持期間
     * @param dKeepingDays The value of the column 'D_KEEPING_DAYS'. (basically NotNull if update: for the constraint)
     */
    public void setDKeepingDays(Long dKeepingDays) {
        registerModifiedProperty("DKeepingDays");
        _dKeepingDays = dKeepingDays;
    }

    /**
     * [get] OVER_STORE_NUM_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=OverStoreNumFlg} <br>
     * HT/SD過入荷可フラグ
     * @return The value of the column 'OVER_STORE_NUM_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getOverStoreNumFlg() {
        checkSpecifiedProperty("overStoreNumFlg");
        return convertEmptyToNull(_overStoreNumFlg);
    }

    /**
     * [set] OVER_STORE_NUM_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=OverStoreNumFlg} <br>
     * HT/SD過入荷可フラグ
     * @param overStoreNumFlg The value of the column 'OVER_STORE_NUM_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOverStoreNumFlg(String overStoreNumFlg) {
        registerModifiedProperty("overStoreNumFlg");
        _overStoreNumFlg = overStoreNumFlg;
    }

    /**
     * [get] PAST_STORE_DT_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=PastStoreDtFlg} <br>
     * HT/SD過去日入力可フラグ
     * @return The value of the column 'PAST_STORE_DT_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getPastStoreDtFlg() {
        checkSpecifiedProperty("pastStoreDtFlg");
        return convertEmptyToNull(_pastStoreDtFlg);
    }

    /**
     * [set] PAST_STORE_DT_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=PastStoreDtFlg} <br>
     * HT/SD過去日入力可フラグ
     * @param pastStoreDtFlg The value of the column 'PAST_STORE_DT_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPastStoreDtFlg(String pastStoreDtFlg) {
        registerModifiedProperty("pastStoreDtFlg");
        _pastStoreDtFlg = pastStoreDtFlg;
    }

    /**
     * [get] USE_HT_SHIP_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=UseHtShipFlg} <br>
     * 出荷時HT/SD使用フラグ
     * @return The value of the column 'USE_HT_SHIP_FLG'. (basically NotNull if selected: for the constraint)
     */
    public String getUseHtShipFlg() {
        checkSpecifiedProperty("useHtShipFlg");
        return convertEmptyToNull(_useHtShipFlg);
    }

    /**
     * [set] USE_HT_SHIP_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=UseHtShipFlg} <br>
     * 出荷時HT/SD使用フラグ
     * @param useHtShipFlg The value of the column 'USE_HT_SHIP_FLG'. (basically NotNull if update: for the constraint)
     */
    public void setUseHtShipFlg(String useHtShipFlg) {
        registerModifiedProperty("useHtShipFlg");
        _useHtShipFlg = useHtShipFlg;
    }

    /**
     * [get] ALLOC_SORT_KEY: {varchar(100)} <br>
     * 引当ソートキー
     * @return The value of the column 'ALLOC_SORT_KEY'. (NullAllowed even if selected: for no constraint)
     */
    public String getAllocSortKey() {
        checkSpecifiedProperty("allocSortKey");
        return convertEmptyToNull(_allocSortKey);
    }

    /**
     * [set] ALLOC_SORT_KEY: {varchar(100)} <br>
     * 引当ソートキー
     * @param allocSortKey The value of the column 'ALLOC_SORT_KEY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAllocSortKey(String allocSortKey) {
        registerModifiedProperty("allocSortKey");
        _allocSortKey = allocSortKey;
    }

    /**
     * [get] RG_REPLENISH_UNIT_CLS: {varchar(30), default=[1], FK to B_CLASS_DTL, classification=ReplenishUnitCls} <br>
     * 定期補充単位区分
     * @return The value of the column 'RG_REPLENISH_UNIT_CLS'. (NullAllowed even if selected: for no constraint)
     */
    public String getRgReplenishUnitCls() {
        checkSpecifiedProperty("rgReplenishUnitCls");
        return convertEmptyToNull(_rgReplenishUnitCls);
    }

    /**
     * [set] RG_REPLENISH_UNIT_CLS: {varchar(30), default=[1], FK to B_CLASS_DTL, classification=ReplenishUnitCls} <br>
     * 定期補充単位区分
     * @param rgReplenishUnitCls The value of the column 'RG_REPLENISH_UNIT_CLS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRgReplenishUnitCls(String rgReplenishUnitCls) {
        registerModifiedProperty("rgReplenishUnitCls");
        _rgReplenishUnitCls = rgReplenishUnitCls;
    }

    /**
     * [get] EM_REPLENISH_UNIT_CLS: {varchar(30), default=[0], FK to B_CLASS_DTL, classification=ReplenishUnitCls} <br>
     * 緊急補充単位区分
     * @return The value of the column 'EM_REPLENISH_UNIT_CLS'. (NullAllowed even if selected: for no constraint)
     */
    public String getEmReplenishUnitCls() {
        checkSpecifiedProperty("emReplenishUnitCls");
        return convertEmptyToNull(_emReplenishUnitCls);
    }

    /**
     * [set] EM_REPLENISH_UNIT_CLS: {varchar(30), default=[0], FK to B_CLASS_DTL, classification=ReplenishUnitCls} <br>
     * 緊急補充単位区分
     * @param emReplenishUnitCls The value of the column 'EM_REPLENISH_UNIT_CLS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setEmReplenishUnitCls(String emReplenishUnitCls) {
        registerModifiedProperty("emReplenishUnitCls");
        _emReplenishUnitCls = emReplenishUnitCls;
    }

    /**
     * [get] EM_REPLENISH_ZONE_ID: {IX, bigint(19), FK to M_ZONE} <br>
     * 緊急補充ゾーンID
     * @return The value of the column 'EM_REPLENISH_ZONE_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getEmReplenishZoneId() {
        checkSpecifiedProperty("emReplenishZoneId");
        return _emReplenishZoneId;
    }

    /**
     * [set] EM_REPLENISH_ZONE_ID: {IX, bigint(19), FK to M_ZONE} <br>
     * 緊急補充ゾーンID
     * @param emReplenishZoneId The value of the column 'EM_REPLENISH_ZONE_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setEmReplenishZoneId(Long emReplenishZoneId) {
        registerModifiedProperty("emReplenishZoneId");
        _emReplenishZoneId = emReplenishZoneId;
    }

    /**
     * [get] EM_REPLENISH_ALLOC_CLS: {varchar(30), FK to B_CLASS_DTL, classification=ReplenishAllocCls} <br>
     * 緊急補充ロケ割付区分
     * @return The value of the column 'EM_REPLENISH_ALLOC_CLS'. (NullAllowed even if selected: for no constraint)
     */
    public String getEmReplenishAllocCls() {
        checkSpecifiedProperty("emReplenishAllocCls");
        return convertEmptyToNull(_emReplenishAllocCls);
    }

    /**
     * [set] EM_REPLENISH_ALLOC_CLS: {varchar(30), FK to B_CLASS_DTL, classification=ReplenishAllocCls} <br>
     * 緊急補充ロケ割付区分
     * @param emReplenishAllocCls The value of the column 'EM_REPLENISH_ALLOC_CLS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setEmReplenishAllocCls(String emReplenishAllocCls) {
        registerModifiedProperty("emReplenishAllocCls");
        _emReplenishAllocCls = emReplenishAllocCls;
    }

    /**
     * [get] PACKING_CAL_CLS: {varchar(30), default=[0], FK to B_CLASS_DTL, classification=PackingCalCls} <br>
     * 梱包計算処理区分
     * @return The value of the column 'PACKING_CAL_CLS'. (NullAllowed even if selected: for no constraint)
     */
    public String getPackingCalCls() {
        checkSpecifiedProperty("packingCalCls");
        return convertEmptyToNull(_packingCalCls);
    }

    /**
     * [set] PACKING_CAL_CLS: {varchar(30), default=[0], FK to B_CLASS_DTL, classification=PackingCalCls} <br>
     * 梱包計算処理区分
     * @param packingCalCls The value of the column 'PACKING_CAL_CLS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPackingCalCls(String packingCalCls) {
        registerModifiedProperty("packingCalCls");
        _packingCalCls = packingCalCls;
    }

    /**
     * [get] PACKING_PROCESS_CLS: {varchar(30), default=[0], FK to B_CLASS_DTL, classification=PackingProcessCls} <br>
     * 詰め込み方
     * @return The value of the column 'PACKING_PROCESS_CLS'. (NullAllowed even if selected: for no constraint)
     */
    public String getPackingProcessCls() {
        checkSpecifiedProperty("packingProcessCls");
        return convertEmptyToNull(_packingProcessCls);
    }

    /**
     * [set] PACKING_PROCESS_CLS: {varchar(30), default=[0], FK to B_CLASS_DTL, classification=PackingProcessCls} <br>
     * 詰め込み方
     * @param packingProcessCls The value of the column 'PACKING_PROCESS_CLS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPackingProcessCls(String packingProcessCls) {
        registerModifiedProperty("packingProcessCls");
        _packingProcessCls = packingProcessCls;
    }

    /**
     * [get] PRODUCT_PART_PACKING: {varchar(30), default=[0], FK to B_CLASS_DTL, classification=ProductPartPacking} <br>
     * 商品毎別梱包
     * @return The value of the column 'PRODUCT_PART_PACKING'. (NullAllowed even if selected: for no constraint)
     */
    public String getProductPartPacking() {
        checkSpecifiedProperty("productPartPacking");
        return convertEmptyToNull(_productPartPacking);
    }

    /**
     * [set] PRODUCT_PART_PACKING: {varchar(30), default=[0], FK to B_CLASS_DTL, classification=ProductPartPacking} <br>
     * 商品毎別梱包
     * @param productPartPacking The value of the column 'PRODUCT_PART_PACKING'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProductPartPacking(String productPartPacking) {
        registerModifiedProperty("productPartPacking");
        _productPartPacking = productPartPacking;
    }

    /**
     * [get] DECIMAL_PRODUCT_PACKING: {varchar(30), FK to B_CLASS_DTL, classification=DecimalProductPacking} <br>
     * 小数管理商品梱包単位
     * @return The value of the column 'DECIMAL_PRODUCT_PACKING'. (NullAllowed even if selected: for no constraint)
     */
    public String getDecimalProductPacking() {
        checkSpecifiedProperty("decimalProductPacking");
        return convertEmptyToNull(_decimalProductPacking);
    }

    /**
     * [set] DECIMAL_PRODUCT_PACKING: {varchar(30), FK to B_CLASS_DTL, classification=DecimalProductPacking} <br>
     * 小数管理商品梱包単位
     * @param decimalProductPacking The value of the column 'DECIMAL_PRODUCT_PACKING'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDecimalProductPacking(String decimalProductPacking) {
        registerModifiedProperty("decimalProductPacking");
        _decimalProductPacking = decimalProductPacking;
    }

    /**
     * [get] PACKING_BOX_GROUP_ID: {IX, bigint(19), FK to M_BOX_GRP} <br>
     * 梱包荷材グループID
     * @return The value of the column 'PACKING_BOX_GROUP_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getPackingBoxGroupId() {
        checkSpecifiedProperty("packingBoxGroupId");
        return _packingBoxGroupId;
    }

    /**
     * [set] PACKING_BOX_GROUP_ID: {IX, bigint(19), FK to M_BOX_GRP} <br>
     * 梱包荷材グループID
     * @param packingBoxGroupId The value of the column 'PACKING_BOX_GROUP_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPackingBoxGroupId(Long packingBoxGroupId) {
        registerModifiedProperty("packingBoxGroupId");
        _packingBoxGroupId = packingBoxGroupId;
    }

    /**
     * [get] TOTAL_PIC_FLG: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=TotalPicFlg} <br>
     * トータルピックフラグ
     * @return The value of the column 'TOTAL_PIC_FLG'. (basically NotNull if selected: for the constraint)
     */
    public String getTotalPicFlg() {
        checkSpecifiedProperty("totalPicFlg");
        return convertEmptyToNull(_totalPicFlg);
    }

    /**
     * [set] TOTAL_PIC_FLG: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=TotalPicFlg} <br>
     * トータルピックフラグ
     * @param totalPicFlg The value of the column 'TOTAL_PIC_FLG'. (basically NotNull if update: for the constraint)
     */
    public void setTotalPicFlg(String totalPicFlg) {
        registerModifiedProperty("totalPicFlg");
        _totalPicFlg = totalPicFlg;
    }

    /**
     * [get] MULTI_PIC_CLS: {NotNull, varchar(30), default=[0], FK to B_CLASS_DTL, classification=MultiPicCls} <br>
     * マルチピック計算区分
     * @return The value of the column 'MULTI_PIC_CLS'. (basically NotNull if selected: for the constraint)
     */
    public String getMultiPicCls() {
        checkSpecifiedProperty("multiPicCls");
        return convertEmptyToNull(_multiPicCls);
    }

    /**
     * [set] MULTI_PIC_CLS: {NotNull, varchar(30), default=[0], FK to B_CLASS_DTL, classification=MultiPicCls} <br>
     * マルチピック計算区分
     * @param multiPicCls The value of the column 'MULTI_PIC_CLS'. (basically NotNull if update: for the constraint)
     */
    public void setMultiPicCls(String multiPicCls) {
        registerModifiedProperty("multiPicCls");
        _multiPicCls = multiPicCls;
    }

    /**
     * [get] BACKET_COL_NUM: {bigint(19), default=[(0)]} <br>
     * バケット列数
     * @return The value of the column 'BACKET_COL_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public Long getBacketColNum() {
        checkSpecifiedProperty("backetColNum");
        return _backetColNum;
    }

    /**
     * [set] BACKET_COL_NUM: {bigint(19), default=[(0)]} <br>
     * バケット列数
     * @param backetColNum The value of the column 'BACKET_COL_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBacketColNum(Long backetColNum) {
        registerModifiedProperty("backetColNum");
        _backetColNum = backetColNum;
    }

    /**
     * [get] BACKET_ROW_NUM: {bigint(19), default=[(0)]} <br>
     * バケット段数
     * @return The value of the column 'BACKET_ROW_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public Long getBacketRowNum() {
        checkSpecifiedProperty("backetRowNum");
        return _backetRowNum;
    }

    /**
     * [set] BACKET_ROW_NUM: {bigint(19), default=[(0)]} <br>
     * バケット段数
     * @param backetRowNum The value of the column 'BACKET_ROW_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBacketRowNum(Long backetRowNum) {
        registerModifiedProperty("backetRowNum");
        _backetRowNum = backetRowNum;
    }

    /**
     * [get] CASE_PIC_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=CasePicFlg} <br>
     * ケースピックフラグ
     * @return The value of the column 'CASE_PIC_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getCasePicFlg() {
        checkSpecifiedProperty("casePicFlg");
        return convertEmptyToNull(_casePicFlg);
    }

    /**
     * [set] CASE_PIC_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=CasePicFlg} <br>
     * ケースピックフラグ
     * @param casePicFlg The value of the column 'CASE_PIC_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCasePicFlg(String casePicFlg) {
        registerModifiedProperty("casePicFlg");
        _casePicFlg = casePicFlg;
    }

    /**
     * [get] SGL_ROW_PIC_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=SglRowPicFlg} <br>
     * 単行ピックフラグ
     * @return The value of the column 'SGL_ROW_PIC_FLG'. (basically NotNull if selected: for the constraint)
     */
    public String getSglRowPicFlg() {
        checkSpecifiedProperty("sglRowPicFlg");
        return convertEmptyToNull(_sglRowPicFlg);
    }

    /**
     * [set] SGL_ROW_PIC_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=SglRowPicFlg} <br>
     * 単行ピックフラグ
     * @param sglRowPicFlg The value of the column 'SGL_ROW_PIC_FLG'. (basically NotNull if update: for the constraint)
     */
    public void setSglRowPicFlg(String sglRowPicFlg) {
        registerModifiedProperty("sglRowPicFlg");
        _sglRowPicFlg = sglRowPicFlg;
    }

    /**
     * [get] SGL_ROW_PIC_MAX_INST_NUM: {bigint(19)} <br>
     * 単行ピック上限指示数
     * @return The value of the column 'SGL_ROW_PIC_MAX_INST_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public Long getSglRowPicMaxInstNum() {
        checkSpecifiedProperty("sglRowPicMaxInstNum");
        return _sglRowPicMaxInstNum;
    }

    /**
     * [set] SGL_ROW_PIC_MAX_INST_NUM: {bigint(19)} <br>
     * 単行ピック上限指示数
     * @param sglRowPicMaxInstNum The value of the column 'SGL_ROW_PIC_MAX_INST_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSglRowPicMaxInstNum(Long sglRowPicMaxInstNum) {
        registerModifiedProperty("sglRowPicMaxInstNum");
        _sglRowPicMaxInstNum = sglRowPicMaxInstNum;
    }

    /**
     * [get] PIC_MTHD_RCMD_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=PicMthdRcmdFlg} <br>
     * 最適ピック提案フラグ
     * @return The value of the column 'PIC_MTHD_RCMD_FLG'. (basically NotNull if selected: for the constraint)
     */
    public String getPicMthdRcmdFlg() {
        checkSpecifiedProperty("picMthdRcmdFlg");
        return convertEmptyToNull(_picMthdRcmdFlg);
    }

    /**
     * [set] PIC_MTHD_RCMD_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=PicMthdRcmdFlg} <br>
     * 最適ピック提案フラグ
     * @param picMthdRcmdFlg The value of the column 'PIC_MTHD_RCMD_FLG'. (basically NotNull if update: for the constraint)
     */
    public void setPicMthdRcmdFlg(String picMthdRcmdFlg) {
        registerModifiedProperty("picMthdRcmdFlg");
        _picMthdRcmdFlg = picMthdRcmdFlg;
    }

    /**
     * [get] PIC_MTHD_RCMD_BREAK_KEY: {varchar(30), FK to B_CLASS_DTL, classification=PicMthdRcmdBreakKey} <br>
     * 最適ピック提案ブレイクキー
     * @return The value of the column 'PIC_MTHD_RCMD_BREAK_KEY'. (NullAllowed even if selected: for no constraint)
     */
    public String getPicMthdRcmdBreakKey() {
        checkSpecifiedProperty("picMthdRcmdBreakKey");
        return convertEmptyToNull(_picMthdRcmdBreakKey);
    }

    /**
     * [set] PIC_MTHD_RCMD_BREAK_KEY: {varchar(30), FK to B_CLASS_DTL, classification=PicMthdRcmdBreakKey} <br>
     * 最適ピック提案ブレイクキー
     * @param picMthdRcmdBreakKey The value of the column 'PIC_MTHD_RCMD_BREAK_KEY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPicMthdRcmdBreakKey(String picMthdRcmdBreakKey) {
        registerModifiedProperty("picMthdRcmdBreakKey");
        _picMthdRcmdBreakKey = picMthdRcmdBreakKey;
    }

    /**
     * [get] PIC_MTHD_RCMD_API_KEY: {varchar(255)} <br>
     * 最適ピック提案APIキー
     * @return The value of the column 'PIC_MTHD_RCMD_API_KEY'. (NullAllowed even if selected: for no constraint)
     */
    public String getPicMthdRcmdApiKey() {
        checkSpecifiedProperty("picMthdRcmdApiKey");
        return convertEmptyToNull(_picMthdRcmdApiKey);
    }

    /**
     * [set] PIC_MTHD_RCMD_API_KEY: {varchar(255)} <br>
     * 最適ピック提案APIキー
     * @param picMthdRcmdApiKey The value of the column 'PIC_MTHD_RCMD_API_KEY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPicMthdRcmdApiKey(String picMthdRcmdApiKey) {
        registerModifiedProperty("picMthdRcmdApiKey");
        _picMthdRcmdApiKey = picMthdRcmdApiKey;
    }

    /**
     * [get] PIC_MTHD_RCMD_MLT_PL_OUT: {char(1), FK to B_CLASS_DTL, classification=PicMthdRcmdListOut} <br>
     * 最適ピック提案マルチピック摘み取りリスト出力フラグ
     * @return The value of the column 'PIC_MTHD_RCMD_MLT_PL_OUT'. (NullAllowed even if selected: for no constraint)
     */
    public String getPicMthdRcmdMltPlOut() {
        checkSpecifiedProperty("picMthdRcmdMltPlOut");
        return convertEmptyToNull(_picMthdRcmdMltPlOut);
    }

    /**
     * [set] PIC_MTHD_RCMD_MLT_PL_OUT: {char(1), FK to B_CLASS_DTL, classification=PicMthdRcmdListOut} <br>
     * 最適ピック提案マルチピック摘み取りリスト出力フラグ
     * @param picMthdRcmdMltPlOut The value of the column 'PIC_MTHD_RCMD_MLT_PL_OUT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPicMthdRcmdMltPlOut(String picMthdRcmdMltPlOut) {
        registerModifiedProperty("picMthdRcmdMltPlOut");
        _picMthdRcmdMltPlOut = picMthdRcmdMltPlOut;
    }

    /**
     * [get] PIC_MTHD_RCMD_SPL_SL_OUT: {char(1), FK to B_CLASS_DTL, classification=PicMthdRcmdListOut} <br>
     * 最適ピック提案単行ピック種蒔きリスト出力フラグ
     * @return The value of the column 'PIC_MTHD_RCMD_SPL_SL_OUT'. (NullAllowed even if selected: for no constraint)
     */
    public String getPicMthdRcmdSplSlOut() {
        checkSpecifiedProperty("picMthdRcmdSplSlOut");
        return convertEmptyToNull(_picMthdRcmdSplSlOut);
    }

    /**
     * [set] PIC_MTHD_RCMD_SPL_SL_OUT: {char(1), FK to B_CLASS_DTL, classification=PicMthdRcmdListOut} <br>
     * 最適ピック提案単行ピック種蒔きリスト出力フラグ
     * @param picMthdRcmdSplSlOut The value of the column 'PIC_MTHD_RCMD_SPL_SL_OUT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPicMthdRcmdSplSlOut(String picMthdRcmdSplSlOut) {
        registerModifiedProperty("picMthdRcmdSplSlOut");
        _picMthdRcmdSplSlOut = picMthdRcmdSplSlOut;
    }

    /**
     * [get] PRODUCT_LABEL_OUT_UNIT: {char(1), FK to B_CLASS_DTL, classification=ProductLabelOutUnit} <br>
     * 商品ラベル出力単位
     * @return The value of the column 'PRODUCT_LABEL_OUT_UNIT'. (NullAllowed even if selected: for no constraint)
     */
    public String getProductLabelOutUnit() {
        checkSpecifiedProperty("productLabelOutUnit");
        return convertEmptyToNull(_productLabelOutUnit);
    }

    /**
     * [set] PRODUCT_LABEL_OUT_UNIT: {char(1), FK to B_CLASS_DTL, classification=ProductLabelOutUnit} <br>
     * 商品ラベル出力単位
     * @param productLabelOutUnit The value of the column 'PRODUCT_LABEL_OUT_UNIT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProductLabelOutUnit(String productLabelOutUnit) {
        registerModifiedProperty("productLabelOutUnit");
        _productLabelOutUnit = productLabelOutUnit;
    }

    /**
     * [get] RESULT_AFTER_PRODUCT_LABEL: {char(1), FK to B_CLASS_DTL, classification=ResultAfterProductLabel} <br>
     * 実績入力後入庫/商品ラベル出力フラグ
     * @return The value of the column 'RESULT_AFTER_PRODUCT_LABEL'. (NullAllowed even if selected: for no constraint)
     */
    public String getResultAfterProductLabel() {
        checkSpecifiedProperty("resultAfterProductLabel");
        return convertEmptyToNull(_resultAfterProductLabel);
    }

    /**
     * [set] RESULT_AFTER_PRODUCT_LABEL: {char(1), FK to B_CLASS_DTL, classification=ResultAfterProductLabel} <br>
     * 実績入力後入庫/商品ラベル出力フラグ
     * @param resultAfterProductLabel The value of the column 'RESULT_AFTER_PRODUCT_LABEL'. (NullAllowed: null update allowed for no constraint)
     */
    public void setResultAfterProductLabel(String resultAfterProductLabel) {
        registerModifiedProperty("resultAfterProductLabel");
        _resultAfterProductLabel = resultAfterProductLabel;
    }

    /**
     * [get] RESULT_AFTER_PRODUCT_TARGET: {char(1), FK to B_CLASS_DTL, classification=ResultAfterProductTarget} <br>
     * 実績入力後入庫/商品ラベル出力対象
     * @return The value of the column 'RESULT_AFTER_PRODUCT_TARGET'. (NullAllowed even if selected: for no constraint)
     */
    public String getResultAfterProductTarget() {
        checkSpecifiedProperty("resultAfterProductTarget");
        return convertEmptyToNull(_resultAfterProductTarget);
    }

    /**
     * [set] RESULT_AFTER_PRODUCT_TARGET: {char(1), FK to B_CLASS_DTL, classification=ResultAfterProductTarget} <br>
     * 実績入力後入庫/商品ラベル出力対象
     * @param resultAfterProductTarget The value of the column 'RESULT_AFTER_PRODUCT_TARGET'. (NullAllowed: null update allowed for no constraint)
     */
    public void setResultAfterProductTarget(String resultAfterProductTarget) {
        registerModifiedProperty("resultAfterProductTarget");
        _resultAfterProductTarget = resultAfterProductTarget;
    }

    /**
     * [get] PRODUCT_LABEL_JAN_BARCODE: {varchar(30), FK to B_CLASS_DTL, classification=ProductLabelJanBarcode} <br>
     * 商品ラベルJANCDバーコード種別
     * @return The value of the column 'PRODUCT_LABEL_JAN_BARCODE'. (NullAllowed even if selected: for no constraint)
     */
    public String getProductLabelJanBarcode() {
        checkSpecifiedProperty("productLabelJanBarcode");
        return convertEmptyToNull(_productLabelJanBarcode);
    }

    /**
     * [set] PRODUCT_LABEL_JAN_BARCODE: {varchar(30), FK to B_CLASS_DTL, classification=ProductLabelJanBarcode} <br>
     * 商品ラベルJANCDバーコード種別
     * @param productLabelJanBarcode The value of the column 'PRODUCT_LABEL_JAN_BARCODE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProductLabelJanBarcode(String productLabelJanBarcode) {
        registerModifiedProperty("productLabelJanBarcode");
        _productLabelJanBarcode = productLabelJanBarcode;
    }

    /**
     * [get] PRODUCT_LABEL_PROD_BARCODE: {varchar(30), FK to B_CLASS_DTL, classification=ProductLabelProdBarcode} <br>
     * 商品ラベル商品CDバーコード種別
     * @return The value of the column 'PRODUCT_LABEL_PROD_BARCODE'. (NullAllowed even if selected: for no constraint)
     */
    public String getProductLabelProdBarcode() {
        checkSpecifiedProperty("productLabelProdBarcode");
        return convertEmptyToNull(_productLabelProdBarcode);
    }

    /**
     * [set] PRODUCT_LABEL_PROD_BARCODE: {varchar(30), FK to B_CLASS_DTL, classification=ProductLabelProdBarcode} <br>
     * 商品ラベル商品CDバーコード種別
     * @param productLabelProdBarcode The value of the column 'PRODUCT_LABEL_PROD_BARCODE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProductLabelProdBarcode(String productLabelProdBarcode) {
        registerModifiedProperty("productLabelProdBarcode");
        _productLabelProdBarcode = productLabelProdBarcode;
    }

    /**
     * [get] PRODUCT_LABEL_JAN_STARTBIT: {varchar(30)} <br>
     * 商品ラベルバーコードJANCDスタートビット
     * @return The value of the column 'PRODUCT_LABEL_JAN_STARTBIT'. (NullAllowed even if selected: for no constraint)
     */
    public String getProductLabelJanStartbit() {
        checkSpecifiedProperty("productLabelJanStartbit");
        return convertEmptyToNull(_productLabelJanStartbit);
    }

    /**
     * [set] PRODUCT_LABEL_JAN_STARTBIT: {varchar(30)} <br>
     * 商品ラベルバーコードJANCDスタートビット
     * @param productLabelJanStartbit The value of the column 'PRODUCT_LABEL_JAN_STARTBIT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProductLabelJanStartbit(String productLabelJanStartbit) {
        registerModifiedProperty("productLabelJanStartbit");
        _productLabelJanStartbit = productLabelJanStartbit;
    }

    /**
     * [get] PRODUCT_LABEL_JAN_ENDBIT: {varchar(30)} <br>
     * 商品ラベルバーコードJANCDエンドビット
     * @return The value of the column 'PRODUCT_LABEL_JAN_ENDBIT'. (NullAllowed even if selected: for no constraint)
     */
    public String getProductLabelJanEndbit() {
        checkSpecifiedProperty("productLabelJanEndbit");
        return convertEmptyToNull(_productLabelJanEndbit);
    }

    /**
     * [set] PRODUCT_LABEL_JAN_ENDBIT: {varchar(30)} <br>
     * 商品ラベルバーコードJANCDエンドビット
     * @param productLabelJanEndbit The value of the column 'PRODUCT_LABEL_JAN_ENDBIT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProductLabelJanEndbit(String productLabelJanEndbit) {
        registerModifiedProperty("productLabelJanEndbit");
        _productLabelJanEndbit = productLabelJanEndbit;
    }

    /**
     * [get] PRODUCT_LABEL_PROD_STARTBIT: {varchar(30)} <br>
     * 商品ラベルバーコード商品CDスタートビット
     * @return The value of the column 'PRODUCT_LABEL_PROD_STARTBIT'. (NullAllowed even if selected: for no constraint)
     */
    public String getProductLabelProdStartbit() {
        checkSpecifiedProperty("productLabelProdStartbit");
        return convertEmptyToNull(_productLabelProdStartbit);
    }

    /**
     * [set] PRODUCT_LABEL_PROD_STARTBIT: {varchar(30)} <br>
     * 商品ラベルバーコード商品CDスタートビット
     * @param productLabelProdStartbit The value of the column 'PRODUCT_LABEL_PROD_STARTBIT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProductLabelProdStartbit(String productLabelProdStartbit) {
        registerModifiedProperty("productLabelProdStartbit");
        _productLabelProdStartbit = productLabelProdStartbit;
    }

    /**
     * [get] PRODUCT_LABEL_PROD_ENDBIT: {varchar(30)} <br>
     * 商品ラベルバーコード商品CDエンドビット
     * @return The value of the column 'PRODUCT_LABEL_PROD_ENDBIT'. (NullAllowed even if selected: for no constraint)
     */
    public String getProductLabelProdEndbit() {
        checkSpecifiedProperty("productLabelProdEndbit");
        return convertEmptyToNull(_productLabelProdEndbit);
    }

    /**
     * [set] PRODUCT_LABEL_PROD_ENDBIT: {varchar(30)} <br>
     * 商品ラベルバーコード商品CDエンドビット
     * @param productLabelProdEndbit The value of the column 'PRODUCT_LABEL_PROD_ENDBIT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProductLabelProdEndbit(String productLabelProdEndbit) {
        registerModifiedProperty("productLabelProdEndbit");
        _productLabelProdEndbit = productLabelProdEndbit;
    }

    /**
     * [get] BOX_SELECT_SKIP: {char(1), FK to B_CLASS_DTL, classification=BoxSelectSkip} <br>
     * 荷材選択スキップ
     * @return The value of the column 'BOX_SELECT_SKIP'. (NullAllowed even if selected: for no constraint)
     */
    public String getBoxSelectSkip() {
        checkSpecifiedProperty("boxSelectSkip");
        return convertEmptyToNull(_boxSelectSkip);
    }

    /**
     * [set] BOX_SELECT_SKIP: {char(1), FK to B_CLASS_DTL, classification=BoxSelectSkip} <br>
     * 荷材選択スキップ
     * @param boxSelectSkip The value of the column 'BOX_SELECT_SKIP'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBoxSelectSkip(String boxSelectSkip) {
        registerModifiedProperty("boxSelectSkip");
        _boxSelectSkip = boxSelectSkip;
    }

    /**
     * [get] DEFAULT_BOX_ID: {IX, bigint(19), FK to M_BOX} <br>
     * デフォルト荷材ID
     * @return The value of the column 'DEFAULT_BOX_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getDefaultBoxId() {
        checkSpecifiedProperty("defaultBoxId");
        return _defaultBoxId;
    }

    /**
     * [set] DEFAULT_BOX_ID: {IX, bigint(19), FK to M_BOX} <br>
     * デフォルト荷材ID
     * @param defaultBoxId The value of the column 'DEFAULT_BOX_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDefaultBoxId(Long defaultBoxId) {
        registerModifiedProperty("defaultBoxId");
        _defaultBoxId = defaultBoxId;
    }

    /**
     * [get] ERROR_SOUND_PLAY_FLG: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=SoundPlayFlg} <br>
     * エラー音再生フラグ
     * @return The value of the column 'ERROR_SOUND_PLAY_FLG'. (basically NotNull if selected: for the constraint)
     */
    public String getErrorSoundPlayFlg() {
        checkSpecifiedProperty("errorSoundPlayFlg");
        return convertEmptyToNull(_errorSoundPlayFlg);
    }

    /**
     * [set] ERROR_SOUND_PLAY_FLG: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=SoundPlayFlg} <br>
     * エラー音再生フラグ
     * @param errorSoundPlayFlg The value of the column 'ERROR_SOUND_PLAY_FLG'. (basically NotNull if update: for the constraint)
     */
    public void setErrorSoundPlayFlg(String errorSoundPlayFlg) {
        registerModifiedProperty("errorSoundPlayFlg");
        _errorSoundPlayFlg = errorSoundPlayFlg;
    }

    /**
     * [get] WARN_SOUND_PLAY_FLG: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=SoundPlayFlg} <br>
     * 警告音再生フラグ
     * @return The value of the column 'WARN_SOUND_PLAY_FLG'. (basically NotNull if selected: for the constraint)
     */
    public String getWarnSoundPlayFlg() {
        checkSpecifiedProperty("warnSoundPlayFlg");
        return convertEmptyToNull(_warnSoundPlayFlg);
    }

    /**
     * [set] WARN_SOUND_PLAY_FLG: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=SoundPlayFlg} <br>
     * 警告音再生フラグ
     * @param warnSoundPlayFlg The value of the column 'WARN_SOUND_PLAY_FLG'. (basically NotNull if update: for the constraint)
     */
    public void setWarnSoundPlayFlg(String warnSoundPlayFlg) {
        registerModifiedProperty("warnSoundPlayFlg");
        _warnSoundPlayFlg = warnSoundPlayFlg;
    }

    /**
     * [get] INSP_SOUND_PLAY_FLG: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=SoundPlayFlg} <br>
     * 検品音再生フラグ
     * @return The value of the column 'INSP_SOUND_PLAY_FLG'. (basically NotNull if selected: for the constraint)
     */
    public String getInspSoundPlayFlg() {
        checkSpecifiedProperty("inspSoundPlayFlg");
        return convertEmptyToNull(_inspSoundPlayFlg);
    }

    /**
     * [set] INSP_SOUND_PLAY_FLG: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=SoundPlayFlg} <br>
     * 検品音再生フラグ
     * @param inspSoundPlayFlg The value of the column 'INSP_SOUND_PLAY_FLG'. (basically NotNull if update: for the constraint)
     */
    public void setInspSoundPlayFlg(String inspSoundPlayFlg) {
        registerModifiedProperty("inspSoundPlayFlg");
        _inspSoundPlayFlg = inspSoundPlayFlg;
    }

    /**
     * [get] INSP_COMP_SOUND_PLAY_FLG: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=SoundPlayFlg} <br>
     * 検品完了音再生フラグ
     * @return The value of the column 'INSP_COMP_SOUND_PLAY_FLG'. (basically NotNull if selected: for the constraint)
     */
    public String getInspCompSoundPlayFlg() {
        checkSpecifiedProperty("inspCompSoundPlayFlg");
        return convertEmptyToNull(_inspCompSoundPlayFlg);
    }

    /**
     * [set] INSP_COMP_SOUND_PLAY_FLG: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=SoundPlayFlg} <br>
     * 検品完了音再生フラグ
     * @param inspCompSoundPlayFlg The value of the column 'INSP_COMP_SOUND_PLAY_FLG'. (basically NotNull if update: for the constraint)
     */
    public void setInspCompSoundPlayFlg(String inspCompSoundPlayFlg) {
        registerModifiedProperty("inspCompSoundPlayFlg");
        _inspCompSoundPlayFlg = inspCompSoundPlayFlg;
    }

    /**
     * [get] AFTER_TAG_OUT_FLG: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=AfterTagOutFlg} <br>
     * 検品後荷札出力フラグ
     * @return The value of the column 'AFTER_TAG_OUT_FLG'. (basically NotNull if selected: for the constraint)
     */
    public String getAfterTagOutFlg() {
        checkSpecifiedProperty("afterTagOutFlg");
        return convertEmptyToNull(_afterTagOutFlg);
    }

    /**
     * [set] AFTER_TAG_OUT_FLG: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=AfterTagOutFlg} <br>
     * 検品後荷札出力フラグ
     * @param afterTagOutFlg The value of the column 'AFTER_TAG_OUT_FLG'. (basically NotNull if update: for the constraint)
     */
    public void setAfterTagOutFlg(String afterTagOutFlg) {
        registerModifiedProperty("afterTagOutFlg");
        _afterTagOutFlg = afterTagOutFlg;
    }

    /**
     * [get] TAG_DELIVERY_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=TagDeliveryOutFlg} <br>
     * 荷札納品書在中出力フラグ
     * @return The value of the column 'TAG_DELIVERY_OUT_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getTagDeliveryOutFlg() {
        checkSpecifiedProperty("tagDeliveryOutFlg");
        return convertEmptyToNull(_tagDeliveryOutFlg);
    }

    /**
     * [set] TAG_DELIVERY_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=TagDeliveryOutFlg} <br>
     * 荷札納品書在中出力フラグ
     * @param tagDeliveryOutFlg The value of the column 'TAG_DELIVERY_OUT_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTagDeliveryOutFlg(String tagDeliveryOutFlg) {
        registerModifiedProperty("tagDeliveryOutFlg");
        _tagDeliveryOutFlg = tagDeliveryOutFlg;
    }

    /**
     * [get] AFTER_DELIV_SLIP_OUT_FLG: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=AfterTagOutFlg} <br>
     * 検品後納品明細出力フラグ
     * @return The value of the column 'AFTER_DELIV_SLIP_OUT_FLG'. (basically NotNull if selected: for the constraint)
     */
    public String getAfterDelivSlipOutFlg() {
        checkSpecifiedProperty("afterDelivSlipOutFlg");
        return convertEmptyToNull(_afterDelivSlipOutFlg);
    }

    /**
     * [set] AFTER_DELIV_SLIP_OUT_FLG: {NotNull, char(1), default=[1], FK to B_CLASS_DTL, classification=AfterTagOutFlg} <br>
     * 検品後納品明細出力フラグ
     * @param afterDelivSlipOutFlg The value of the column 'AFTER_DELIV_SLIP_OUT_FLG'. (basically NotNull if update: for the constraint)
     */
    public void setAfterDelivSlipOutFlg(String afterDelivSlipOutFlg) {
        registerModifiedProperty("afterDelivSlipOutFlg");
        _afterDelivSlipOutFlg = afterDelivSlipOutFlg;
    }

    /**
     * [get] AFTER_DELIV_SLIP_OUT_TGT: {char(1), FK to B_CLASS_DTL, classification=AfterDelivSlipOutTgt} <br>
     * 検品後納品明細出力対象
     * @return The value of the column 'AFTER_DELIV_SLIP_OUT_TGT'. (NullAllowed even if selected: for no constraint)
     */
    public String getAfterDelivSlipOutTgt() {
        checkSpecifiedProperty("afterDelivSlipOutTgt");
        return convertEmptyToNull(_afterDelivSlipOutTgt);
    }

    /**
     * [set] AFTER_DELIV_SLIP_OUT_TGT: {char(1), FK to B_CLASS_DTL, classification=AfterDelivSlipOutTgt} <br>
     * 検品後納品明細出力対象
     * @param afterDelivSlipOutTgt The value of the column 'AFTER_DELIV_SLIP_OUT_TGT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAfterDelivSlipOutTgt(String afterDelivSlipOutTgt) {
        registerModifiedProperty("afterDelivSlipOutTgt");
        _afterDelivSlipOutTgt = afterDelivSlipOutTgt;
    }

    /**
     * [get] SGL_ROW_INSP_AFTER_OUT_CLS: {varchar(30), FK to B_CLASS_DTL, classification=SglRowInspAfterOutCls} <br>
     * 単行出荷検品荷札/納品明細出力区分
     * @return The value of the column 'SGL_ROW_INSP_AFTER_OUT_CLS'. (NullAllowed even if selected: for no constraint)
     */
    public String getSglRowInspAfterOutCls() {
        checkSpecifiedProperty("sglRowInspAfterOutCls");
        return convertEmptyToNull(_sglRowInspAfterOutCls);
    }

    /**
     * [set] SGL_ROW_INSP_AFTER_OUT_CLS: {varchar(30), FK to B_CLASS_DTL, classification=SglRowInspAfterOutCls} <br>
     * 単行出荷検品荷札/納品明細出力区分
     * @param sglRowInspAfterOutCls The value of the column 'SGL_ROW_INSP_AFTER_OUT_CLS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSglRowInspAfterOutCls(String sglRowInspAfterOutCls) {
        registerModifiedProperty("sglRowInspAfterOutCls");
        _sglRowInspAfterOutCls = sglRowInspAfterOutCls;
    }

    /**
     * [get] HT_CHAR_READ_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=HtCharReadFlg} <br>
     * HT文字認識使用フラグ
     * @return The value of the column 'HT_CHAR_READ_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getHtCharReadFlg() {
        checkSpecifiedProperty("htCharReadFlg");
        return convertEmptyToNull(_htCharReadFlg);
    }

    /**
     * [set] HT_CHAR_READ_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=HtCharReadFlg} <br>
     * HT文字認識使用フラグ
     * @param htCharReadFlg The value of the column 'HT_CHAR_READ_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setHtCharReadFlg(String htCharReadFlg) {
        registerModifiedProperty("htCharReadFlg");
        _htCharReadFlg = htCharReadFlg;
    }

    /**
     * [get] HT_LOT_INPUT_TYPE: {varchar(30)} <br>
     * HTロット入力方式
     * @return The value of the column 'HT_LOT_INPUT_TYPE'. (NullAllowed even if selected: for no constraint)
     */
    public String getHtLotInputType() {
        checkSpecifiedProperty("htLotInputType");
        return convertEmptyToNull(_htLotInputType);
    }

    /**
     * [set] HT_LOT_INPUT_TYPE: {varchar(30)} <br>
     * HTロット入力方式
     * @param htLotInputType The value of the column 'HT_LOT_INPUT_TYPE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setHtLotInputType(String htLotInputType) {
        registerModifiedProperty("htLotInputType");
        _htLotInputType = htLotInputType;
    }

    /**
     * [get] HT_SERIAL_INPUT_TYPE: {varchar(30)} <br>
     * HTシリアル入力方式
     * @return The value of the column 'HT_SERIAL_INPUT_TYPE'. (NullAllowed even if selected: for no constraint)
     */
    public String getHtSerialInputType() {
        checkSpecifiedProperty("htSerialInputType");
        return convertEmptyToNull(_htSerialInputType);
    }

    /**
     * [set] HT_SERIAL_INPUT_TYPE: {varchar(30)} <br>
     * HTシリアル入力方式
     * @param htSerialInputType The value of the column 'HT_SERIAL_INPUT_TYPE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setHtSerialInputType(String htSerialInputType) {
        registerModifiedProperty("htSerialInputType");
        _htSerialInputType = htSerialInputType;
    }

    /**
     * [get] INSPECTION_LABEL_OUT_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=InspectionLabelOutFlg} <br>
     * SD検品ラベル出力フラグ
     * @return The value of the column 'INSPECTION_LABEL_OUT_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getInspectionLabelOutFlg() {
        checkSpecifiedProperty("inspectionLabelOutFlg");
        return convertEmptyToNull(_inspectionLabelOutFlg);
    }

    /**
     * [set] INSPECTION_LABEL_OUT_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=InspectionLabelOutFlg} <br>
     * SD検品ラベル出力フラグ
     * @param inspectionLabelOutFlg The value of the column 'INSPECTION_LABEL_OUT_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInspectionLabelOutFlg(String inspectionLabelOutFlg) {
        registerModifiedProperty("inspectionLabelOutFlg");
        _inspectionLabelOutFlg = inspectionLabelOutFlg;
    }

    /**
     * [get] AUTO_SHIP_INST_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=AutoShipInstFlg} <br>
     * 自動出庫指示フラグ
     * @return The value of the column 'AUTO_SHIP_INST_FLG'. (basically NotNull if selected: for the constraint)
     */
    public String getAutoShipInstFlg() {
        checkSpecifiedProperty("autoShipInstFlg");
        return convertEmptyToNull(_autoShipInstFlg);
    }

    /**
     * [set] AUTO_SHIP_INST_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=AutoShipInstFlg} <br>
     * 自動出庫指示フラグ
     * @param autoShipInstFlg The value of the column 'AUTO_SHIP_INST_FLG'. (basically NotNull if update: for the constraint)
     */
    public void setAutoShipInstFlg(String autoShipInstFlg) {
        registerModifiedProperty("autoShipInstFlg");
        _autoShipInstFlg = autoShipInstFlg;
    }

    /**
     * [get] STOCK_OUT_AUTO_INST_FLG: {char(1), FK to B_CLASS_DTL, classification=StockOutAutoInstFlg} <br>
     * 欠品時自動出庫指示フラグ
     * @return The value of the column 'STOCK_OUT_AUTO_INST_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getStockOutAutoInstFlg() {
        checkSpecifiedProperty("stockOutAutoInstFlg");
        return convertEmptyToNull(_stockOutAutoInstFlg);
    }

    /**
     * [set] STOCK_OUT_AUTO_INST_FLG: {char(1), FK to B_CLASS_DTL, classification=StockOutAutoInstFlg} <br>
     * 欠品時自動出庫指示フラグ
     * @param stockOutAutoInstFlg The value of the column 'STOCK_OUT_AUTO_INST_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStockOutAutoInstFlg(String stockOutAutoInstFlg) {
        registerModifiedProperty("stockOutAutoInstFlg");
        _stockOutAutoInstFlg = stockOutAutoInstFlg;
    }

    /**
     * [get] AUTO_EMG_SET_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=AutoEmgSetFlg} <br>
     * 自動緊急フラグ設定フラグ
     * @return The value of the column 'AUTO_EMG_SET_FLG'. (basically NotNull if selected: for the constraint)
     */
    public String getAutoEmgSetFlg() {
        checkSpecifiedProperty("autoEmgSetFlg");
        return convertEmptyToNull(_autoEmgSetFlg);
    }

    /**
     * [set] AUTO_EMG_SET_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=AutoEmgSetFlg} <br>
     * 自動緊急フラグ設定フラグ
     * @param autoEmgSetFlg The value of the column 'AUTO_EMG_SET_FLG'. (basically NotNull if update: for the constraint)
     */
    public void setAutoEmgSetFlg(String autoEmgSetFlg) {
        registerModifiedProperty("autoEmgSetFlg");
        _autoEmgSetFlg = autoEmgSetFlg;
    }

    /**
     * [get] AUTO_EMG_SET_TGT: {varchar(30), FK to B_CLASS_DTL, classification=AutoEmgSetTgt} <br>
     * 自動緊急フラグ判断対象
     * @return The value of the column 'AUTO_EMG_SET_TGT'. (NullAllowed even if selected: for no constraint)
     */
    public String getAutoEmgSetTgt() {
        checkSpecifiedProperty("autoEmgSetTgt");
        return convertEmptyToNull(_autoEmgSetTgt);
    }

    /**
     * [set] AUTO_EMG_SET_TGT: {varchar(30), FK to B_CLASS_DTL, classification=AutoEmgSetTgt} <br>
     * 自動緊急フラグ判断対象
     * @param autoEmgSetTgt The value of the column 'AUTO_EMG_SET_TGT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAutoEmgSetTgt(String autoEmgSetTgt) {
        registerModifiedProperty("autoEmgSetTgt");
        _autoEmgSetTgt = autoEmgSetTgt;
    }

    /**
     * [get] AUTO_EMG_SET_MINUTE: {bigint(19)} <br>
     * 自動緊急フラグ判断時間(分)
     * @return The value of the column 'AUTO_EMG_SET_MINUTE'. (NullAllowed even if selected: for no constraint)
     */
    public Long getAutoEmgSetMinute() {
        checkSpecifiedProperty("autoEmgSetMinute");
        return _autoEmgSetMinute;
    }

    /**
     * [set] AUTO_EMG_SET_MINUTE: {bigint(19)} <br>
     * 自動緊急フラグ判断時間(分)
     * @param autoEmgSetMinute The value of the column 'AUTO_EMG_SET_MINUTE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAutoEmgSetMinute(Long autoEmgSetMinute) {
        registerModifiedProperty("autoEmgSetMinute");
        _autoEmgSetMinute = autoEmgSetMinute;
    }

    /**
     * [get] STOCK_OUT_INST_CXL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=StockOutInstCxlFlg} <br>
     * 欠品時出庫指示取消フラグ
     * @return The value of the column 'STOCK_OUT_INST_CXL_FLG'. (basically NotNull if selected: for the constraint)
     */
    public String getStockOutInstCxlFlg() {
        checkSpecifiedProperty("stockOutInstCxlFlg");
        return convertEmptyToNull(_stockOutInstCxlFlg);
    }

    /**
     * [set] STOCK_OUT_INST_CXL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=StockOutInstCxlFlg} <br>
     * 欠品時出庫指示取消フラグ
     * @param stockOutInstCxlFlg The value of the column 'STOCK_OUT_INST_CXL_FLG'. (basically NotNull if update: for the constraint)
     */
    public void setStockOutInstCxlFlg(String stockOutInstCxlFlg) {
        registerModifiedProperty("stockOutInstCxlFlg");
        _stockOutInstCxlFlg = stockOutInstCxlFlg;
    }

    /**
     * [get] STOCK_OUT_ALLOC_CLS: {varchar(30), default=[0], FK to B_CLASS_DTL, classification=StockOutAllocCls} <br>
     * 欠品時引当区分
     * @return The value of the column 'STOCK_OUT_ALLOC_CLS'. (NullAllowed even if selected: for no constraint)
     */
    public String getStockOutAllocCls() {
        checkSpecifiedProperty("stockOutAllocCls");
        return convertEmptyToNull(_stockOutAllocCls);
    }

    /**
     * [set] STOCK_OUT_ALLOC_CLS: {varchar(30), default=[0], FK to B_CLASS_DTL, classification=StockOutAllocCls} <br>
     * 欠品時引当区分
     * @param stockOutAllocCls The value of the column 'STOCK_OUT_ALLOC_CLS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStockOutAllocCls(String stockOutAllocCls) {
        registerModifiedProperty("stockOutAllocCls");
        _stockOutAllocCls = stockOutAllocCls;
    }

    /**
     * [get] STOCK_OUT_INST_SPLIT_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=StockOutInstSplitFlg} <br>
     * 欠品時出荷指示分離フラグ
     * @return The value of the column 'STOCK_OUT_INST_SPLIT_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getStockOutInstSplitFlg() {
        checkSpecifiedProperty("stockOutInstSplitFlg");
        return convertEmptyToNull(_stockOutInstSplitFlg);
    }

    /**
     * [set] STOCK_OUT_INST_SPLIT_FLG: {char(1), default=[0], FK to B_CLASS_DTL, classification=StockOutInstSplitFlg} <br>
     * 欠品時出荷指示分離フラグ
     * @param stockOutInstSplitFlg The value of the column 'STOCK_OUT_INST_SPLIT_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStockOutInstSplitFlg(String stockOutInstSplitFlg) {
        registerModifiedProperty("stockOutInstSplitFlg");
        _stockOutInstSplitFlg = stockOutInstSplitFlg;
    }

    /**
     * [get] CES_INTEGRATION_FLG: {char(1), FK to B_CLASS_DTL, classification=CesIntegrationFlg} <br>
     * CES連携フラグ
     * @return The value of the column 'CES_INTEGRATION_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getCesIntegrationFlg() {
        checkSpecifiedProperty("cesIntegrationFlg");
        return convertEmptyToNull(_cesIntegrationFlg);
    }

    /**
     * [set] CES_INTEGRATION_FLG: {char(1), FK to B_CLASS_DTL, classification=CesIntegrationFlg} <br>
     * CES連携フラグ
     * @param cesIntegrationFlg The value of the column 'CES_INTEGRATION_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCesIntegrationFlg(String cesIntegrationFlg) {
        registerModifiedProperty("cesIntegrationFlg");
        _cesIntegrationFlg = cesIntegrationFlg;
    }

    /**
     * [get] PACKING_SLIP_AUTO_OUTPUT_FLG: {char(1), FK to B_CLASS_DTL, classification=PackingSlipAutoOutputFlg} <br>
     * 納品明細書自動発行フラグ
     * @return The value of the column 'PACKING_SLIP_AUTO_OUTPUT_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getPackingSlipAutoOutputFlg() {
        checkSpecifiedProperty("packingSlipAutoOutputFlg");
        return convertEmptyToNull(_packingSlipAutoOutputFlg);
    }

    /**
     * [set] PACKING_SLIP_AUTO_OUTPUT_FLG: {char(1), FK to B_CLASS_DTL, classification=PackingSlipAutoOutputFlg} <br>
     * 納品明細書自動発行フラグ
     * @param packingSlipAutoOutputFlg The value of the column 'PACKING_SLIP_AUTO_OUTPUT_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPackingSlipAutoOutputFlg(String packingSlipAutoOutputFlg) {
        registerModifiedProperty("packingSlipAutoOutputFlg");
        _packingSlipAutoOutputFlg = packingSlipAutoOutputFlg;
    }

    /**
     * [get] CENTER_KBN: {NotNull, char(1), default=[0]} <br>
     * 拠点区分
     * @return The value of the column 'CENTER_KBN'. (basically NotNull if selected: for the constraint)
     */
    public String getCenterKbn() {
        checkSpecifiedProperty("centerKbn");
        return convertEmptyToNull(_centerKbn);
    }

    /**
     * [set] CENTER_KBN: {NotNull, char(1), default=[0]} <br>
     * 拠点区分
     * @param centerKbn The value of the column 'CENTER_KBN'. (basically NotNull if update: for the constraint)
     */
    public void setCenterKbn(String centerKbn) {
        registerModifiedProperty("centerKbn");
        _centerKbn = centerKbn;
    }

    /**
     * [get] DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg} <br>
     * 削除フラグ
     * @return The value of the column 'DEL_FLG'. (basically NotNull if selected: for the constraint)
     */
    public String getDelFlg() {
        checkSpecifiedProperty("delFlg");
        return convertEmptyToNull(_delFlg);
    }

    /**
     * [set] DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg} <br>
     * 削除フラグ
     * @param delFlg The value of the column 'DEL_FLG'. (basically NotNull if update: for the constraint)
     */
    public void setDelFlg(String delFlg) {
        registerModifiedProperty("delFlg");
        _delFlg = delFlg;
    }

    /**
     * [get] VERSION_NO: {NotNull, bigint(19), default=[(0)]} <br>
     * バージョンNo.
     * @return The value of the column 'VERSION_NO'. (basically NotNull if selected: for the constraint)
     */
    public Long getVersionNo() {
        checkSpecifiedProperty("versionNo");
        return _versionNo;
    }

    /**
     * [set] VERSION_NO: {NotNull, bigint(19), default=[(0)]} <br>
     * バージョンNo.
     * @param versionNo The value of the column 'VERSION_NO'. (basically NotNull if update: for the constraint)
     */
    public void setVersionNo(Long versionNo) {
        registerModifiedProperty("versionNo");
        _versionNo = versionNo;
    }

    /**
     * [get] CONTROL_NO: {bigint(19)} <br>
     * コントロールNo.
     * @return The value of the column 'CONTROL_NO'. (NullAllowed even if selected: for no constraint)
     */
    public Long getControlNo() {
        checkSpecifiedProperty("controlNo");
        return _controlNo;
    }

    /**
     * [set] CONTROL_NO: {bigint(19)} <br>
     * コントロールNo.
     * @param controlNo The value of the column 'CONTROL_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setControlNo(Long controlNo) {
        registerModifiedProperty("controlNo");
        _controlNo = controlNo;
    }

    /**
     * [get] ADD_DT: {datetime2(26, 6)} <br>
     * 登録日時
     * @return The value of the column 'ADD_DT'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getAddDt() {
        checkSpecifiedProperty("addDt");
        return _addDt;
    }

    /**
     * [set] ADD_DT: {datetime2(26, 6)} <br>
     * 登録日時
     * @param addDt The value of the column 'ADD_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddDt(java.sql.Timestamp addDt) {
        registerModifiedProperty("addDt");
        _addDt = addDt;
    }

    /**
     * [get] ADD_USER: {varchar(255)} <br>
     * 登録ユーザ
     * @return The value of the column 'ADD_USER'. (NullAllowed even if selected: for no constraint)
     */
    public String getAddUser() {
        checkSpecifiedProperty("addUser");
        return convertEmptyToNull(_addUser);
    }

    /**
     * [set] ADD_USER: {varchar(255)} <br>
     * 登録ユーザ
     * @param addUser The value of the column 'ADD_USER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddUser(String addUser) {
        registerModifiedProperty("addUser");
        _addUser = addUser;
    }

    /**
     * [get] ADD_PROCESS: {varchar(4000)} <br>
     * 登録プロセス
     * @return The value of the column 'ADD_PROCESS'. (NullAllowed even if selected: for no constraint)
     */
    public String getAddProcess() {
        checkSpecifiedProperty("addProcess");
        return convertEmptyToNull(_addProcess);
    }

    /**
     * [set] ADD_PROCESS: {varchar(4000)} <br>
     * 登録プロセス
     * @param addProcess The value of the column 'ADD_PROCESS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddProcess(String addProcess) {
        registerModifiedProperty("addProcess");
        _addProcess = addProcess;
    }

    /**
     * [get] UPD_DT: {datetime2(26, 6)} <br>
     * 更新日時
     * @return The value of the column 'UPD_DT'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getUpdDt() {
        checkSpecifiedProperty("updDt");
        return _updDt;
    }

    /**
     * [set] UPD_DT: {datetime2(26, 6)} <br>
     * 更新日時
     * @param updDt The value of the column 'UPD_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdDt(java.sql.Timestamp updDt) {
        registerModifiedProperty("updDt");
        _updDt = updDt;
    }

    /**
     * [get] UPD_USER: {varchar(255)} <br>
     * 更新ユーザ
     * @return The value of the column 'UPD_USER'. (NullAllowed even if selected: for no constraint)
     */
    public String getUpdUser() {
        checkSpecifiedProperty("updUser");
        return convertEmptyToNull(_updUser);
    }

    /**
     * [set] UPD_USER: {varchar(255)} <br>
     * 更新ユーザ
     * @param updUser The value of the column 'UPD_USER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdUser(String updUser) {
        registerModifiedProperty("updUser");
        _updUser = updUser;
    }

    /**
     * [get] UPD_PROCESS: {varchar(4000)} <br>
     * 更新プロセス
     * @return The value of the column 'UPD_PROCESS'. (NullAllowed even if selected: for no constraint)
     */
    public String getUpdProcess() {
        checkSpecifiedProperty("updProcess");
        return convertEmptyToNull(_updProcess);
    }

    /**
     * [set] UPD_PROCESS: {varchar(4000)} <br>
     * 更新プロセス
     * @param updProcess The value of the column 'UPD_PROCESS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdProcess(String updProcess) {
        registerModifiedProperty("updProcess");
        _updProcess = updProcess;
    }
}
