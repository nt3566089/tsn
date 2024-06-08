package com.oneslogi.base.dbflute.dtomapper.bs;

import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;

import org.dbflute.Entity;
import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.InstanceKeyEntity;
import org.dbflute.dbmeta.dtomap.DtoMapper;
import org.dbflute.dbmeta.dtomap.InstanceKeyDto;
import org.dbflute.helper.beans.DfBeanDesc;
import org.dbflute.helper.beans.DfPropertyDesc;
import org.dbflute.helper.beans.factory.DfBeanDescFactory;
import org.dbflute.jdbc.Classification;
import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.exentity.*;
import com.oneslogi.base.dbflute.dto.*;
import com.oneslogi.base.dbflute.dtomapper.*;

/**
 * The DTO mapper of M_PARAM as TABLE. <br>
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
 *     M_DELIVERY_COURSE, M_BOX_GRP, M_BOX, M_ZONE, M_CLIENT_CENTER, B_CLASS_DTL(ByAfterTagOutFlg)
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     mDeliveryCourse, mBoxGrp, mBox, mZone, mClientCenter, bClassDtlByAfterTagOutFlg, bClassDtlByAfterDelivSlipOutFlg, bClassDtlByAfterDelivSlipOutTgt, bClassDtlBySglRowInspAfterOutCls, bClassDtlByBoxSelectSkip, bClassDtlByCasePicFlg, bClassDtlByDelFlg, bClassDtlByHtCharReadFlg, bClassDtlByMergeCls, bClassDtlByMultiPicCls, bClassDtlByOverStoreNumFlg, bClassDtlByPackingCalCls, bClassDtlByPackingProcessCls, bClassDtlByPastStoreDtFlg, bClassDtlByProductLabelJanBarcode, bClassDtlByProductLabelOutUnit, bClassDtlByProductLabelProdBarcode, bClassDtlByProductPartPacking, bClassDtlByDecimalProductPacking, bClassDtlByEmReplenishAllocCls, bClassDtlByRgReplenishUnitCls, bClassDtlByEmReplenishUnitCls, bClassDtlByResultAfterProductLabel, bClassDtlByResultAfterProductTarget, bClassDtlByStoreDtFlg, bClassDtlByStoreNoFlg, bClassDtlByTagDeliveryOutFlg, bClassDtlByUseHtShipFlg, bClassDtlByInspectionLabelOutFlg, bClassDtlBySglRowPicFlg, bClassDtlByTotalPicFlg, bClassDtlByPicMthdRcmdFlg, bClassDtlByPicMthdRcmdBreakKey, bClassDtlByAutoShipInstFlg, bClassDtlByStockOutAutoInstFlg, bClassDtlByAutoEmgSetFlg, bClassDtlByAutoEmgSetTgt, bClassDtlByStockOutAllocCls, bClassDtlByStockOutInstCxlFlg, bClassDtlByStockOutInstSplitFlg, bClassDtlByPicMthdRcmdMltPlOut, bClassDtlByPicMthdRcmdSplSlOut, bClassDtlByErrorSoundPlayFlg, bClassDtlByWarnSoundPlayFlg, bClassDtlByInspSoundPlayFlg, bClassDtlByInspCompSoundPlayFlg, bClassDtlByCesIntegrationFlg, bClassDtlByPackingSlipAutoOutputFlg
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsMParamDtoMapper implements DtoMapper<MParam, MParamDto>, Serializable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final Map<Entity, Object> _relationDtoMap;
    protected final Map<Object, Entity> _relationEntityMap;
    protected boolean _exceptCommonColumn;
    protected boolean _reverseReference; // default: one-way reference
    protected boolean _instanceCache = true; // default: cached
    protected boolean _suppressMDeliveryCourse;
    protected boolean _suppressMBoxGrp;
    protected boolean _suppressMBox;
    protected boolean _suppressMZone;
    protected boolean _suppressMClientCenter;
    protected boolean _suppressBClassDtlByAfterTagOutFlg;
    protected boolean _suppressBClassDtlByAfterDelivSlipOutFlg;
    protected boolean _suppressBClassDtlByAfterDelivSlipOutTgt;
    protected boolean _suppressBClassDtlBySglRowInspAfterOutCls;
    protected boolean _suppressBClassDtlByBoxSelectSkip;
    protected boolean _suppressBClassDtlByCasePicFlg;
    protected boolean _suppressBClassDtlByDelFlg;
    protected boolean _suppressBClassDtlByHtCharReadFlg;
    protected boolean _suppressBClassDtlByMergeCls;
    protected boolean _suppressBClassDtlByMultiPicCls;
    protected boolean _suppressBClassDtlByOverStoreNumFlg;
    protected boolean _suppressBClassDtlByPackingCalCls;
    protected boolean _suppressBClassDtlByPackingProcessCls;
    protected boolean _suppressBClassDtlByPastStoreDtFlg;
    protected boolean _suppressBClassDtlByProductLabelJanBarcode;
    protected boolean _suppressBClassDtlByProductLabelOutUnit;
    protected boolean _suppressBClassDtlByProductLabelProdBarcode;
    protected boolean _suppressBClassDtlByProductPartPacking;
    protected boolean _suppressBClassDtlByDecimalProductPacking;
    protected boolean _suppressBClassDtlByEmReplenishAllocCls;
    protected boolean _suppressBClassDtlByRgReplenishUnitCls;
    protected boolean _suppressBClassDtlByEmReplenishUnitCls;
    protected boolean _suppressBClassDtlByResultAfterProductLabel;
    protected boolean _suppressBClassDtlByResultAfterProductTarget;
    protected boolean _suppressBClassDtlByStoreDtFlg;
    protected boolean _suppressBClassDtlByStoreNoFlg;
    protected boolean _suppressBClassDtlByTagDeliveryOutFlg;
    protected boolean _suppressBClassDtlByUseHtShipFlg;
    protected boolean _suppressBClassDtlByInspectionLabelOutFlg;
    protected boolean _suppressBClassDtlBySglRowPicFlg;
    protected boolean _suppressBClassDtlByTotalPicFlg;
    protected boolean _suppressBClassDtlByPicMthdRcmdFlg;
    protected boolean _suppressBClassDtlByPicMthdRcmdBreakKey;
    protected boolean _suppressBClassDtlByAutoShipInstFlg;
    protected boolean _suppressBClassDtlByStockOutAutoInstFlg;
    protected boolean _suppressBClassDtlByAutoEmgSetFlg;
    protected boolean _suppressBClassDtlByAutoEmgSetTgt;
    protected boolean _suppressBClassDtlByStockOutAllocCls;
    protected boolean _suppressBClassDtlByStockOutInstCxlFlg;
    protected boolean _suppressBClassDtlByStockOutInstSplitFlg;
    protected boolean _suppressBClassDtlByPicMthdRcmdMltPlOut;
    protected boolean _suppressBClassDtlByPicMthdRcmdSplSlOut;
    protected boolean _suppressBClassDtlByErrorSoundPlayFlg;
    protected boolean _suppressBClassDtlByWarnSoundPlayFlg;
    protected boolean _suppressBClassDtlByInspSoundPlayFlg;
    protected boolean _suppressBClassDtlByInspCompSoundPlayFlg;
    protected boolean _suppressBClassDtlByCesIntegrationFlg;
    protected boolean _suppressBClassDtlByPackingSlipAutoOutputFlg;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMParamDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsMParamDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
        _relationDtoMap = relationDtoMap;
        _relationEntityMap = relationEntityMap;
    }

    // ===================================================================================
    //                                                                             Mapping
    //                                                                             =======
    // -----------------------------------------------------
    //                                                to DTO
    //                                                ------
    /**
     * {@inheritDoc}
     */
    public MParamDto mappingToDto(MParam entity) {
        if (entity == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Entity localKey = createInstanceKeyEntity(entity);
        Object cachedLocalDto = instanceCache ? _relationDtoMap.get(localKey) : null;
        if (cachedLocalDto != null) {
            return (MParamDto)cachedLocalDto;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        MParamDto dto = new MParamDto();
        dto.setClientCenterId(entity.getClientCenterId());
        dto.setDeliveryCourseId(entity.getDeliveryCourseId());
        dto.setStoreDtFlg(entity.getStoreDtFlg());
        dto.setStoreNoFlg(entity.getStoreNoFlg());
        dto.setMergeCls(entity.getMergeCls());
        dto.setTKeepingDays(entity.getTKeepingDays());
        dto.setHKeepingDays(entity.getHKeepingDays());
        dto.setDKeepingDays(entity.getDKeepingDays());
        dto.setOverStoreNumFlg(entity.getOverStoreNumFlg());
        dto.setPastStoreDtFlg(entity.getPastStoreDtFlg());
        dto.setUseHtShipFlg(entity.getUseHtShipFlg());
        dto.setAllocSortKey(entity.getAllocSortKey());
        dto.setRgReplenishUnitCls(entity.getRgReplenishUnitCls());
        dto.setEmReplenishUnitCls(entity.getEmReplenishUnitCls());
        dto.setEmReplenishZoneId(entity.getEmReplenishZoneId());
        dto.setEmReplenishAllocCls(entity.getEmReplenishAllocCls());
        dto.setPackingCalCls(entity.getPackingCalCls());
        dto.setPackingProcessCls(entity.getPackingProcessCls());
        dto.setProductPartPacking(entity.getProductPartPacking());
        dto.setDecimalProductPacking(entity.getDecimalProductPacking());
        dto.setPackingBoxGroupId(entity.getPackingBoxGroupId());
        dto.setTotalPicFlg(entity.getTotalPicFlg());
        dto.setMultiPicCls(entity.getMultiPicCls());
        dto.setBacketColNum(entity.getBacketColNum());
        dto.setBacketRowNum(entity.getBacketRowNum());
        dto.setCasePicFlg(entity.getCasePicFlg());
        dto.setSglRowPicFlg(entity.getSglRowPicFlg());
        dto.setSglRowPicMaxInstNum(entity.getSglRowPicMaxInstNum());
        dto.setPicMthdRcmdFlg(entity.getPicMthdRcmdFlg());
        dto.setPicMthdRcmdBreakKey(entity.getPicMthdRcmdBreakKey());
        dto.setPicMthdRcmdApiKey(entity.getPicMthdRcmdApiKey());
        dto.setPicMthdRcmdMltPlOut(entity.getPicMthdRcmdMltPlOut());
        dto.setPicMthdRcmdSplSlOut(entity.getPicMthdRcmdSplSlOut());
        dto.setProductLabelOutUnit(entity.getProductLabelOutUnit());
        dto.setResultAfterProductLabel(entity.getResultAfterProductLabel());
        dto.setResultAfterProductTarget(entity.getResultAfterProductTarget());
        dto.setProductLabelJanBarcode(entity.getProductLabelJanBarcode());
        dto.setProductLabelProdBarcode(entity.getProductLabelProdBarcode());
        dto.setProductLabelJanStartbit(entity.getProductLabelJanStartbit());
        dto.setProductLabelJanEndbit(entity.getProductLabelJanEndbit());
        dto.setProductLabelProdStartbit(entity.getProductLabelProdStartbit());
        dto.setProductLabelProdEndbit(entity.getProductLabelProdEndbit());
        dto.setBoxSelectSkip(entity.getBoxSelectSkip());
        dto.setDefaultBoxId(entity.getDefaultBoxId());
        dto.setErrorSoundPlayFlg(entity.getErrorSoundPlayFlg());
        dto.setWarnSoundPlayFlg(entity.getWarnSoundPlayFlg());
        dto.setInspSoundPlayFlg(entity.getInspSoundPlayFlg());
        dto.setInspCompSoundPlayFlg(entity.getInspCompSoundPlayFlg());
        dto.setAfterTagOutFlg(entity.getAfterTagOutFlg());
        dto.setTagDeliveryOutFlg(entity.getTagDeliveryOutFlg());
        dto.setAfterDelivSlipOutFlg(entity.getAfterDelivSlipOutFlg());
        dto.setAfterDelivSlipOutTgt(entity.getAfterDelivSlipOutTgt());
        dto.setSglRowInspAfterOutCls(entity.getSglRowInspAfterOutCls());
        dto.setHtCharReadFlg(entity.getHtCharReadFlg());
        dto.setHtLotInputType(entity.getHtLotInputType());
        dto.setHtSerialInputType(entity.getHtSerialInputType());
        dto.setInspectionLabelOutFlg(entity.getInspectionLabelOutFlg());
        dto.setAutoShipInstFlg(entity.getAutoShipInstFlg());
        dto.setStockOutAutoInstFlg(entity.getStockOutAutoInstFlg());
        dto.setAutoEmgSetFlg(entity.getAutoEmgSetFlg());
        dto.setAutoEmgSetTgt(entity.getAutoEmgSetTgt());
        dto.setAutoEmgSetMinute(entity.getAutoEmgSetMinute());
        dto.setStockOutInstCxlFlg(entity.getStockOutInstCxlFlg());
        dto.setStockOutAllocCls(entity.getStockOutAllocCls());
        dto.setStockOutInstSplitFlg(entity.getStockOutInstSplitFlg());
        dto.setCesIntegrationFlg(entity.getCesIntegrationFlg());
        dto.setPackingSlipAutoOutputFlg(entity.getPackingSlipAutoOutputFlg());
        dto.setCenterKbn(entity.getCenterKbn());
        if (!exceptCommonColumn) {
            dto.setDelFlg(entity.getDelFlg());
        }
        if (!exceptCommonColumn) {
            dto.setVersionNo(entity.getVersionNo());
        }
        if (!exceptCommonColumn) {
            dto.setControlNo(entity.getControlNo());
        }
        if (!exceptCommonColumn) {
            dto.setAddDt(entity.getAddDt());
        }
        if (!exceptCommonColumn) {
            dto.setAddUser(entity.getAddUser());
        }
        if (!exceptCommonColumn) {
            dto.setAddProcess(entity.getAddProcess());
        }
        if (!exceptCommonColumn) {
            dto.setUpdDt(entity.getUpdDt());
        }
        if (!exceptCommonColumn) {
            dto.setUpdUser(entity.getUpdUser());
        }
        if (!exceptCommonColumn) {
            dto.setUpdProcess(entity.getUpdProcess());
        }
        reflectDerivedProperty(entity, dto, true);
        if (instanceCache && entity.hasPrimaryKeyValue()) { // caches only a DTO that has a primary key value
            _relationDtoMap.put(localKey, dto);
        }
        boolean reverseReference = isReverseReference();
        if (!_suppressMDeliveryCourse && entity.getMDeliveryCourse() != null) {
            MDeliveryCourse relationEntity = entity.getMDeliveryCourse();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                MDeliveryCourseDto relationDto = (MDeliveryCourseDto)cachedDto;
                dto.setMDeliveryCourse(relationDto);
                if (reverseReference) {
                    relationDto.getMParamList().add(dto);
                }
            } else {
                MDeliveryCourseDtoMapper mapper = new MDeliveryCourseDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressMParamList();
                MDeliveryCourseDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMDeliveryCourse(relationDto);
                if (reverseReference) {
                    relationDto.getMParamList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMDeliveryCourse());
                }
            }
        };
        if (!_suppressMBoxGrp && entity.getMBoxGrp() != null) {
            MBoxGrp relationEntity = entity.getMBoxGrp();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                MBoxGrpDto relationDto = (MBoxGrpDto)cachedDto;
                dto.setMBoxGrp(relationDto);
                if (reverseReference) {
                    relationDto.getMParamList().add(dto);
                }
            } else {
                MBoxGrpDtoMapper mapper = new MBoxGrpDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressMParamList();
                MBoxGrpDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMBoxGrp(relationDto);
                if (reverseReference) {
                    relationDto.getMParamList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMBoxGrp());
                }
            }
        };
        if (!_suppressMBox && entity.getMBox() != null) {
            MBox relationEntity = entity.getMBox();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                MBoxDto relationDto = (MBoxDto)cachedDto;
                dto.setMBox(relationDto);
                if (reverseReference) {
                    relationDto.getMParamList().add(dto);
                }
            } else {
                MBoxDtoMapper mapper = new MBoxDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressMParamList();
                MBoxDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMBox(relationDto);
                if (reverseReference) {
                    relationDto.getMParamList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMBox());
                }
            }
        };
        if (!_suppressMZone && entity.getMZone() != null) {
            MZone relationEntity = entity.getMZone();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                MZoneDto relationDto = (MZoneDto)cachedDto;
                dto.setMZone(relationDto);
                if (reverseReference) {
                    relationDto.getMParamList().add(dto);
                }
            } else {
                MZoneDtoMapper mapper = new MZoneDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressMParamList();
                MZoneDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMZone(relationDto);
                if (reverseReference) {
                    relationDto.getMParamList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMZone());
                }
            }
        };
        if (!_suppressMClientCenter && entity.getMClientCenter() != null) {
            MClientCenter relationEntity = entity.getMClientCenter();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                MClientCenterDto relationDto = (MClientCenterDto)cachedDto;
                dto.setMClientCenter(relationDto);
                if (reverseReference) {
                    relationDto.setMParamAsOne(dto);
                }
            } else {
                MClientCenterDtoMapper mapper = new MClientCenterDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressMParamAsOne();
                MClientCenterDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMClientCenter(relationDto);
                if (reverseReference) {
                    relationDto.setMParamAsOne(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMClientCenter());
                }
            }
        };
        if (!_suppressBClassDtlByAfterTagOutFlg && entity.getBClassDtlByAfterTagOutFlg() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByAfterTagOutFlg();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByAfterTagOutFlg(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByAfterTagOutFlg(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByAfterTagOutFlg());
                }
            }
        };
        if (!_suppressBClassDtlByAfterDelivSlipOutFlg && entity.getBClassDtlByAfterDelivSlipOutFlg() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByAfterDelivSlipOutFlg();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByAfterDelivSlipOutFlg(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByAfterDelivSlipOutFlg(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByAfterDelivSlipOutFlg());
                }
            }
        };
        if (!_suppressBClassDtlByAfterDelivSlipOutTgt && entity.getBClassDtlByAfterDelivSlipOutTgt() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByAfterDelivSlipOutTgt();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByAfterDelivSlipOutTgt(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByAfterDelivSlipOutTgt(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByAfterDelivSlipOutTgt());
                }
            }
        };
        if (!_suppressBClassDtlBySglRowInspAfterOutCls && entity.getBClassDtlBySglRowInspAfterOutCls() != null) {
            BClassDtl relationEntity = entity.getBClassDtlBySglRowInspAfterOutCls();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlBySglRowInspAfterOutCls(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlBySglRowInspAfterOutCls(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlBySglRowInspAfterOutCls());
                }
            }
        };
        if (!_suppressBClassDtlByBoxSelectSkip && entity.getBClassDtlByBoxSelectSkip() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByBoxSelectSkip();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByBoxSelectSkip(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByBoxSelectSkip(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByBoxSelectSkip());
                }
            }
        };
        if (!_suppressBClassDtlByCasePicFlg && entity.getBClassDtlByCasePicFlg() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByCasePicFlg();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByCasePicFlg(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByCasePicFlg(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByCasePicFlg());
                }
            }
        };
        if (!_suppressBClassDtlByDelFlg && entity.getBClassDtlByDelFlg() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByDelFlg();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByDelFlg(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByDelFlg(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByDelFlg());
                }
            }
        };
        if (!_suppressBClassDtlByHtCharReadFlg && entity.getBClassDtlByHtCharReadFlg() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByHtCharReadFlg();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByHtCharReadFlg(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByHtCharReadFlg(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByHtCharReadFlg());
                }
            }
        };
        if (!_suppressBClassDtlByMergeCls && entity.getBClassDtlByMergeCls() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByMergeCls();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByMergeCls(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByMergeCls(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByMergeCls());
                }
            }
        };
        if (!_suppressBClassDtlByMultiPicCls && entity.getBClassDtlByMultiPicCls() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByMultiPicCls();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByMultiPicCls(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByMultiPicCls(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByMultiPicCls());
                }
            }
        };
        if (!_suppressBClassDtlByOverStoreNumFlg && entity.getBClassDtlByOverStoreNumFlg() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByOverStoreNumFlg();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByOverStoreNumFlg(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByOverStoreNumFlg(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByOverStoreNumFlg());
                }
            }
        };
        if (!_suppressBClassDtlByPackingCalCls && entity.getBClassDtlByPackingCalCls() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByPackingCalCls();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByPackingCalCls(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByPackingCalCls(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByPackingCalCls());
                }
            }
        };
        if (!_suppressBClassDtlByPackingProcessCls && entity.getBClassDtlByPackingProcessCls() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByPackingProcessCls();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByPackingProcessCls(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByPackingProcessCls(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByPackingProcessCls());
                }
            }
        };
        if (!_suppressBClassDtlByPastStoreDtFlg && entity.getBClassDtlByPastStoreDtFlg() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByPastStoreDtFlg();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByPastStoreDtFlg(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByPastStoreDtFlg(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByPastStoreDtFlg());
                }
            }
        };
        if (!_suppressBClassDtlByProductLabelJanBarcode && entity.getBClassDtlByProductLabelJanBarcode() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByProductLabelJanBarcode();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByProductLabelJanBarcode(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByProductLabelJanBarcode(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByProductLabelJanBarcode());
                }
            }
        };
        if (!_suppressBClassDtlByProductLabelOutUnit && entity.getBClassDtlByProductLabelOutUnit() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByProductLabelOutUnit();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByProductLabelOutUnit(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByProductLabelOutUnit(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByProductLabelOutUnit());
                }
            }
        };
        if (!_suppressBClassDtlByProductLabelProdBarcode && entity.getBClassDtlByProductLabelProdBarcode() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByProductLabelProdBarcode();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByProductLabelProdBarcode(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByProductLabelProdBarcode(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByProductLabelProdBarcode());
                }
            }
        };
        if (!_suppressBClassDtlByProductPartPacking && entity.getBClassDtlByProductPartPacking() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByProductPartPacking();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByProductPartPacking(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByProductPartPacking(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByProductPartPacking());
                }
            }
        };
        if (!_suppressBClassDtlByDecimalProductPacking && entity.getBClassDtlByDecimalProductPacking() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByDecimalProductPacking();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByDecimalProductPacking(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByDecimalProductPacking(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByDecimalProductPacking());
                }
            }
        };
        if (!_suppressBClassDtlByEmReplenishAllocCls && entity.getBClassDtlByEmReplenishAllocCls() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByEmReplenishAllocCls();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByEmReplenishAllocCls(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByEmReplenishAllocCls(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByEmReplenishAllocCls());
                }
            }
        };
        if (!_suppressBClassDtlByRgReplenishUnitCls && entity.getBClassDtlByRgReplenishUnitCls() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByRgReplenishUnitCls();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByRgReplenishUnitCls(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByRgReplenishUnitCls(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByRgReplenishUnitCls());
                }
            }
        };
        if (!_suppressBClassDtlByEmReplenishUnitCls && entity.getBClassDtlByEmReplenishUnitCls() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByEmReplenishUnitCls();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByEmReplenishUnitCls(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByEmReplenishUnitCls(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByEmReplenishUnitCls());
                }
            }
        };
        if (!_suppressBClassDtlByResultAfterProductLabel && entity.getBClassDtlByResultAfterProductLabel() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByResultAfterProductLabel();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByResultAfterProductLabel(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByResultAfterProductLabel(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByResultAfterProductLabel());
                }
            }
        };
        if (!_suppressBClassDtlByResultAfterProductTarget && entity.getBClassDtlByResultAfterProductTarget() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByResultAfterProductTarget();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByResultAfterProductTarget(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByResultAfterProductTarget(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByResultAfterProductTarget());
                }
            }
        };
        if (!_suppressBClassDtlByStoreDtFlg && entity.getBClassDtlByStoreDtFlg() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByStoreDtFlg();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByStoreDtFlg(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByStoreDtFlg(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByStoreDtFlg());
                }
            }
        };
        if (!_suppressBClassDtlByStoreNoFlg && entity.getBClassDtlByStoreNoFlg() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByStoreNoFlg();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByStoreNoFlg(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByStoreNoFlg(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByStoreNoFlg());
                }
            }
        };
        if (!_suppressBClassDtlByTagDeliveryOutFlg && entity.getBClassDtlByTagDeliveryOutFlg() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByTagDeliveryOutFlg();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByTagDeliveryOutFlg(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByTagDeliveryOutFlg(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByTagDeliveryOutFlg());
                }
            }
        };
        if (!_suppressBClassDtlByUseHtShipFlg && entity.getBClassDtlByUseHtShipFlg() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByUseHtShipFlg();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByUseHtShipFlg(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByUseHtShipFlg(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByUseHtShipFlg());
                }
            }
        };
        if (!_suppressBClassDtlByInspectionLabelOutFlg && entity.getBClassDtlByInspectionLabelOutFlg() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByInspectionLabelOutFlg();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByInspectionLabelOutFlg(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByInspectionLabelOutFlg(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByInspectionLabelOutFlg());
                }
            }
        };
        if (!_suppressBClassDtlBySglRowPicFlg && entity.getBClassDtlBySglRowPicFlg() != null) {
            BClassDtl relationEntity = entity.getBClassDtlBySglRowPicFlg();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlBySglRowPicFlg(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlBySglRowPicFlg(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlBySglRowPicFlg());
                }
            }
        };
        if (!_suppressBClassDtlByTotalPicFlg && entity.getBClassDtlByTotalPicFlg() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByTotalPicFlg();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByTotalPicFlg(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByTotalPicFlg(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByTotalPicFlg());
                }
            }
        };
        if (!_suppressBClassDtlByPicMthdRcmdFlg && entity.getBClassDtlByPicMthdRcmdFlg() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByPicMthdRcmdFlg();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByPicMthdRcmdFlg(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByPicMthdRcmdFlg(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByPicMthdRcmdFlg());
                }
            }
        };
        if (!_suppressBClassDtlByPicMthdRcmdBreakKey && entity.getBClassDtlByPicMthdRcmdBreakKey() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByPicMthdRcmdBreakKey();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByPicMthdRcmdBreakKey(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByPicMthdRcmdBreakKey(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByPicMthdRcmdBreakKey());
                }
            }
        };
        if (!_suppressBClassDtlByAutoShipInstFlg && entity.getBClassDtlByAutoShipInstFlg() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByAutoShipInstFlg();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByAutoShipInstFlg(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByAutoShipInstFlg(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByAutoShipInstFlg());
                }
            }
        };
        if (!_suppressBClassDtlByStockOutAutoInstFlg && entity.getBClassDtlByStockOutAutoInstFlg() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByStockOutAutoInstFlg();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByStockOutAutoInstFlg(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByStockOutAutoInstFlg(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByStockOutAutoInstFlg());
                }
            }
        };
        if (!_suppressBClassDtlByAutoEmgSetFlg && entity.getBClassDtlByAutoEmgSetFlg() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByAutoEmgSetFlg();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByAutoEmgSetFlg(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByAutoEmgSetFlg(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByAutoEmgSetFlg());
                }
            }
        };
        if (!_suppressBClassDtlByAutoEmgSetTgt && entity.getBClassDtlByAutoEmgSetTgt() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByAutoEmgSetTgt();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByAutoEmgSetTgt(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByAutoEmgSetTgt(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByAutoEmgSetTgt());
                }
            }
        };
        if (!_suppressBClassDtlByStockOutAllocCls && entity.getBClassDtlByStockOutAllocCls() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByStockOutAllocCls();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByStockOutAllocCls(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByStockOutAllocCls(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByStockOutAllocCls());
                }
            }
        };
        if (!_suppressBClassDtlByStockOutInstCxlFlg && entity.getBClassDtlByStockOutInstCxlFlg() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByStockOutInstCxlFlg();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByStockOutInstCxlFlg(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByStockOutInstCxlFlg(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByStockOutInstCxlFlg());
                }
            }
        };
        if (!_suppressBClassDtlByStockOutInstSplitFlg && entity.getBClassDtlByStockOutInstSplitFlg() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByStockOutInstSplitFlg();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByStockOutInstSplitFlg(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByStockOutInstSplitFlg(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByStockOutInstSplitFlg());
                }
            }
        };
        if (!_suppressBClassDtlByPicMthdRcmdMltPlOut && entity.getBClassDtlByPicMthdRcmdMltPlOut() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByPicMthdRcmdMltPlOut();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByPicMthdRcmdMltPlOut(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByPicMthdRcmdMltPlOut(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByPicMthdRcmdMltPlOut());
                }
            }
        };
        if (!_suppressBClassDtlByPicMthdRcmdSplSlOut && entity.getBClassDtlByPicMthdRcmdSplSlOut() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByPicMthdRcmdSplSlOut();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByPicMthdRcmdSplSlOut(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByPicMthdRcmdSplSlOut(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByPicMthdRcmdSplSlOut());
                }
            }
        };
        if (!_suppressBClassDtlByErrorSoundPlayFlg && entity.getBClassDtlByErrorSoundPlayFlg() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByErrorSoundPlayFlg();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByErrorSoundPlayFlg(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByErrorSoundPlayFlg(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByErrorSoundPlayFlg());
                }
            }
        };
        if (!_suppressBClassDtlByWarnSoundPlayFlg && entity.getBClassDtlByWarnSoundPlayFlg() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByWarnSoundPlayFlg();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByWarnSoundPlayFlg(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByWarnSoundPlayFlg(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByWarnSoundPlayFlg());
                }
            }
        };
        if (!_suppressBClassDtlByInspSoundPlayFlg && entity.getBClassDtlByInspSoundPlayFlg() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByInspSoundPlayFlg();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByInspSoundPlayFlg(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByInspSoundPlayFlg(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByInspSoundPlayFlg());
                }
            }
        };
        if (!_suppressBClassDtlByInspCompSoundPlayFlg && entity.getBClassDtlByInspCompSoundPlayFlg() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByInspCompSoundPlayFlg();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByInspCompSoundPlayFlg(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByInspCompSoundPlayFlg(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByInspCompSoundPlayFlg());
                }
            }
        };
        if (!_suppressBClassDtlByCesIntegrationFlg && entity.getBClassDtlByCesIntegrationFlg() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByCesIntegrationFlg();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByCesIntegrationFlg(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByCesIntegrationFlg(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByCesIntegrationFlg());
                }
            }
        };
        if (!_suppressBClassDtlByPackingSlipAutoOutputFlg && entity.getBClassDtlByPackingSlipAutoOutputFlg() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByPackingSlipAutoOutputFlg();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByPackingSlipAutoOutputFlg(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByPackingSlipAutoOutputFlg(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByPackingSlipAutoOutputFlg());
                }
            }
        };
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<MParamDto> mappingToDtoList(List<MParam> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<MParamDto> dtoList = new ArrayList<MParamDto>();
        for (MParam entity : entityList) {
            MParamDto dto = mappingToDto(entity);
            if (dto != null) {
                dtoList.add(dto);
            } else {
                if (isAcceptNullElementOnList()) {
                    dtoList.add(null);
                }
            }
        }
        return dtoList;
    }

    // -----------------------------------------------------
    //                                             to Entity
    //                                             ---------
    /**
     * {@inheritDoc}
     */
    public MParam mappingToEntity(MParamDto dto) {
        if (dto == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Object localKey = createInstanceKeyDto(dto, dto.instanceHash());
        Entity cachedLocalEntity = instanceCache ? _relationEntityMap.get(localKey) : null;
        if (cachedLocalEntity != null) {
            return (MParam)cachedLocalEntity;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        MParam entity = new MParam();
        if (needsMapping(dto, dto.getClientCenterId(), "clientCenterId")) {
            entity.setClientCenterId(dto.getClientCenterId());
        }
        if (needsMapping(dto, dto.getDeliveryCourseId(), "deliveryCourseId")) {
            entity.setDeliveryCourseId(dto.getDeliveryCourseId());
        }
        if (needsMapping(dto, dto.getStoreDtFlg(), "storeDtFlg")) {
            entity.setStoreDtFlgAsStoreDtFlg(CDef.StoreDtFlg.codeOf(dto.getStoreDtFlg()));
        }
        if (needsMapping(dto, dto.getStoreNoFlg(), "storeNoFlg")) {
            entity.setStoreNoFlgAsStoreNoFlg(CDef.StoreNoFlg.codeOf(dto.getStoreNoFlg()));
        }
        if (needsMapping(dto, dto.getMergeCls(), "mergeCls")) {
            entity.setMergeClsAsMergeCls(CDef.MergeCls.codeOf(dto.getMergeCls()));
        }
        if (needsMapping(dto, dto.getTKeepingDays(), "TKeepingDays")) {
            entity.setTKeepingDays(dto.getTKeepingDays());
        }
        if (needsMapping(dto, dto.getHKeepingDays(), "HKeepingDays")) {
            entity.setHKeepingDays(dto.getHKeepingDays());
        }
        if (needsMapping(dto, dto.getDKeepingDays(), "DKeepingDays")) {
            entity.setDKeepingDays(dto.getDKeepingDays());
        }
        if (needsMapping(dto, dto.getOverStoreNumFlg(), "overStoreNumFlg")) {
            entity.setOverStoreNumFlgAsOverStoreNumFlg(CDef.OverStoreNumFlg.codeOf(dto.getOverStoreNumFlg()));
        }
        if (needsMapping(dto, dto.getPastStoreDtFlg(), "pastStoreDtFlg")) {
            entity.setPastStoreDtFlgAsPastStoreDtFlg(CDef.PastStoreDtFlg.codeOf(dto.getPastStoreDtFlg()));
        }
        if (needsMapping(dto, dto.getUseHtShipFlg(), "useHtShipFlg")) {
            entity.setUseHtShipFlgAsUseHtShipFlg(CDef.UseHtShipFlg.codeOf(dto.getUseHtShipFlg()));
        }
        if (needsMapping(dto, dto.getAllocSortKey(), "allocSortKey")) {
            entity.setAllocSortKey(dto.getAllocSortKey());
        }
        if (needsMapping(dto, dto.getRgReplenishUnitCls(), "rgReplenishUnitCls")) {
            entity.setRgReplenishUnitClsAsReplenishUnitCls(CDef.ReplenishUnitCls.codeOf(dto.getRgReplenishUnitCls()));
        }
        if (needsMapping(dto, dto.getEmReplenishUnitCls(), "emReplenishUnitCls")) {
            entity.setEmReplenishUnitClsAsReplenishUnitCls(CDef.ReplenishUnitCls.codeOf(dto.getEmReplenishUnitCls()));
        }
        if (needsMapping(dto, dto.getEmReplenishZoneId(), "emReplenishZoneId")) {
            entity.setEmReplenishZoneId(dto.getEmReplenishZoneId());
        }
        if (needsMapping(dto, dto.getEmReplenishAllocCls(), "emReplenishAllocCls")) {
            entity.setEmReplenishAllocClsAsReplenishAllocCls(CDef.ReplenishAllocCls.codeOf(dto.getEmReplenishAllocCls()));
        }
        if (needsMapping(dto, dto.getPackingCalCls(), "packingCalCls")) {
            entity.setPackingCalClsAsPackingCalCls(CDef.PackingCalCls.codeOf(dto.getPackingCalCls()));
        }
        if (needsMapping(dto, dto.getPackingProcessCls(), "packingProcessCls")) {
            entity.setPackingProcessClsAsPackingProcessCls(CDef.PackingProcessCls.codeOf(dto.getPackingProcessCls()));
        }
        if (needsMapping(dto, dto.getProductPartPacking(), "productPartPacking")) {
            entity.setProductPartPackingAsProductPartPacking(CDef.ProductPartPacking.codeOf(dto.getProductPartPacking()));
        }
        if (needsMapping(dto, dto.getDecimalProductPacking(), "decimalProductPacking")) {
            entity.setDecimalProductPackingAsDecimalProductPacking(CDef.DecimalProductPacking.codeOf(dto.getDecimalProductPacking()));
        }
        if (needsMapping(dto, dto.getPackingBoxGroupId(), "packingBoxGroupId")) {
            entity.setPackingBoxGroupId(dto.getPackingBoxGroupId());
        }
        if (needsMapping(dto, dto.getTotalPicFlg(), "totalPicFlg")) {
            entity.setTotalPicFlgAsTotalPicFlg(CDef.TotalPicFlg.codeOf(dto.getTotalPicFlg()));
        }
        if (needsMapping(dto, dto.getMultiPicCls(), "multiPicCls")) {
            entity.setMultiPicClsAsMultiPicCls(CDef.MultiPicCls.codeOf(dto.getMultiPicCls()));
        }
        if (needsMapping(dto, dto.getBacketColNum(), "backetColNum")) {
            entity.setBacketColNum(dto.getBacketColNum());
        }
        if (needsMapping(dto, dto.getBacketRowNum(), "backetRowNum")) {
            entity.setBacketRowNum(dto.getBacketRowNum());
        }
        if (needsMapping(dto, dto.getCasePicFlg(), "casePicFlg")) {
            entity.setCasePicFlgAsCasePicFlg(CDef.CasePicFlg.codeOf(dto.getCasePicFlg()));
        }
        if (needsMapping(dto, dto.getSglRowPicFlg(), "sglRowPicFlg")) {
            entity.setSglRowPicFlgAsSglRowPicFlg(CDef.SglRowPicFlg.codeOf(dto.getSglRowPicFlg()));
        }
        if (needsMapping(dto, dto.getSglRowPicMaxInstNum(), "sglRowPicMaxInstNum")) {
            entity.setSglRowPicMaxInstNum(dto.getSglRowPicMaxInstNum());
        }
        if (needsMapping(dto, dto.getPicMthdRcmdFlg(), "picMthdRcmdFlg")) {
            entity.setPicMthdRcmdFlgAsPicMthdRcmdFlg(CDef.PicMthdRcmdFlg.codeOf(dto.getPicMthdRcmdFlg()));
        }
        if (needsMapping(dto, dto.getPicMthdRcmdBreakKey(), "picMthdRcmdBreakKey")) {
            entity.setPicMthdRcmdBreakKeyAsPicMthdRcmdBreakKey(CDef.PicMthdRcmdBreakKey.codeOf(dto.getPicMthdRcmdBreakKey()));
        }
        if (needsMapping(dto, dto.getPicMthdRcmdApiKey(), "picMthdRcmdApiKey")) {
            entity.setPicMthdRcmdApiKey(dto.getPicMthdRcmdApiKey());
        }
        if (needsMapping(dto, dto.getPicMthdRcmdMltPlOut(), "picMthdRcmdMltPlOut")) {
            entity.setPicMthdRcmdMltPlOutAsPicMthdRcmdListOut(CDef.PicMthdRcmdListOut.codeOf(dto.getPicMthdRcmdMltPlOut()));
        }
        if (needsMapping(dto, dto.getPicMthdRcmdSplSlOut(), "picMthdRcmdSplSlOut")) {
            entity.setPicMthdRcmdSplSlOutAsPicMthdRcmdListOut(CDef.PicMthdRcmdListOut.codeOf(dto.getPicMthdRcmdSplSlOut()));
        }
        if (needsMapping(dto, dto.getProductLabelOutUnit(), "productLabelOutUnit")) {
            entity.setProductLabelOutUnitAsProductLabelOutUnit(CDef.ProductLabelOutUnit.codeOf(dto.getProductLabelOutUnit()));
        }
        if (needsMapping(dto, dto.getResultAfterProductLabel(), "resultAfterProductLabel")) {
            entity.setResultAfterProductLabelAsResultAfterProductLabel(CDef.ResultAfterProductLabel.codeOf(dto.getResultAfterProductLabel()));
        }
        if (needsMapping(dto, dto.getResultAfterProductTarget(), "resultAfterProductTarget")) {
            entity.setResultAfterProductTargetAsResultAfterProductTarget(CDef.ResultAfterProductTarget.codeOf(dto.getResultAfterProductTarget()));
        }
        if (needsMapping(dto, dto.getProductLabelJanBarcode(), "productLabelJanBarcode")) {
            entity.setProductLabelJanBarcodeAsProductLabelJanBarcode(CDef.ProductLabelJanBarcode.codeOf(dto.getProductLabelJanBarcode()));
        }
        if (needsMapping(dto, dto.getProductLabelProdBarcode(), "productLabelProdBarcode")) {
            entity.setProductLabelProdBarcodeAsProductLabelProdBarcode(CDef.ProductLabelProdBarcode.codeOf(dto.getProductLabelProdBarcode()));
        }
        if (needsMapping(dto, dto.getProductLabelJanStartbit(), "productLabelJanStartbit")) {
            entity.setProductLabelJanStartbit(dto.getProductLabelJanStartbit());
        }
        if (needsMapping(dto, dto.getProductLabelJanEndbit(), "productLabelJanEndbit")) {
            entity.setProductLabelJanEndbit(dto.getProductLabelJanEndbit());
        }
        if (needsMapping(dto, dto.getProductLabelProdStartbit(), "productLabelProdStartbit")) {
            entity.setProductLabelProdStartbit(dto.getProductLabelProdStartbit());
        }
        if (needsMapping(dto, dto.getProductLabelProdEndbit(), "productLabelProdEndbit")) {
            entity.setProductLabelProdEndbit(dto.getProductLabelProdEndbit());
        }
        if (needsMapping(dto, dto.getBoxSelectSkip(), "boxSelectSkip")) {
            entity.setBoxSelectSkipAsBoxSelectSkip(CDef.BoxSelectSkip.codeOf(dto.getBoxSelectSkip()));
        }
        if (needsMapping(dto, dto.getDefaultBoxId(), "defaultBoxId")) {
            entity.setDefaultBoxId(dto.getDefaultBoxId());
        }
        if (needsMapping(dto, dto.getErrorSoundPlayFlg(), "errorSoundPlayFlg")) {
            entity.setErrorSoundPlayFlgAsSoundPlayFlg(CDef.SoundPlayFlg.codeOf(dto.getErrorSoundPlayFlg()));
        }
        if (needsMapping(dto, dto.getWarnSoundPlayFlg(), "warnSoundPlayFlg")) {
            entity.setWarnSoundPlayFlgAsSoundPlayFlg(CDef.SoundPlayFlg.codeOf(dto.getWarnSoundPlayFlg()));
        }
        if (needsMapping(dto, dto.getInspSoundPlayFlg(), "inspSoundPlayFlg")) {
            entity.setInspSoundPlayFlgAsSoundPlayFlg(CDef.SoundPlayFlg.codeOf(dto.getInspSoundPlayFlg()));
        }
        if (needsMapping(dto, dto.getInspCompSoundPlayFlg(), "inspCompSoundPlayFlg")) {
            entity.setInspCompSoundPlayFlgAsSoundPlayFlg(CDef.SoundPlayFlg.codeOf(dto.getInspCompSoundPlayFlg()));
        }
        if (needsMapping(dto, dto.getAfterTagOutFlg(), "afterTagOutFlg")) {
            entity.setAfterTagOutFlgAsAfterTagOutFlg(CDef.AfterTagOutFlg.codeOf(dto.getAfterTagOutFlg()));
        }
        if (needsMapping(dto, dto.getTagDeliveryOutFlg(), "tagDeliveryOutFlg")) {
            entity.setTagDeliveryOutFlgAsTagDeliveryOutFlg(CDef.TagDeliveryOutFlg.codeOf(dto.getTagDeliveryOutFlg()));
        }
        if (needsMapping(dto, dto.getAfterDelivSlipOutFlg(), "afterDelivSlipOutFlg")) {
            entity.setAfterDelivSlipOutFlgAsAfterTagOutFlg(CDef.AfterTagOutFlg.codeOf(dto.getAfterDelivSlipOutFlg()));
        }
        if (needsMapping(dto, dto.getAfterDelivSlipOutTgt(), "afterDelivSlipOutTgt")) {
            entity.setAfterDelivSlipOutTgtAsAfterDelivSlipOutTgt(CDef.AfterDelivSlipOutTgt.codeOf(dto.getAfterDelivSlipOutTgt()));
        }
        if (needsMapping(dto, dto.getSglRowInspAfterOutCls(), "sglRowInspAfterOutCls")) {
            entity.setSglRowInspAfterOutClsAsSglRowInspAfterOutCls(CDef.SglRowInspAfterOutCls.codeOf(dto.getSglRowInspAfterOutCls()));
        }
        if (needsMapping(dto, dto.getHtCharReadFlg(), "htCharReadFlg")) {
            entity.setHtCharReadFlgAsHtCharReadFlg(CDef.HtCharReadFlg.codeOf(dto.getHtCharReadFlg()));
        }
        if (needsMapping(dto, dto.getHtLotInputType(), "htLotInputType")) {
            entity.setHtLotInputType(dto.getHtLotInputType());
        }
        if (needsMapping(dto, dto.getHtSerialInputType(), "htSerialInputType")) {
            entity.setHtSerialInputType(dto.getHtSerialInputType());
        }
        if (needsMapping(dto, dto.getInspectionLabelOutFlg(), "inspectionLabelOutFlg")) {
            entity.setInspectionLabelOutFlgAsInspectionLabelOutFlg(CDef.InspectionLabelOutFlg.codeOf(dto.getInspectionLabelOutFlg()));
        }
        if (needsMapping(dto, dto.getAutoShipInstFlg(), "autoShipInstFlg")) {
            entity.setAutoShipInstFlgAsAutoShipInstFlg(CDef.AutoShipInstFlg.codeOf(dto.getAutoShipInstFlg()));
        }
        if (needsMapping(dto, dto.getStockOutAutoInstFlg(), "stockOutAutoInstFlg")) {
            entity.setStockOutAutoInstFlgAsStockOutAutoInstFlg(CDef.StockOutAutoInstFlg.codeOf(dto.getStockOutAutoInstFlg()));
        }
        if (needsMapping(dto, dto.getAutoEmgSetFlg(), "autoEmgSetFlg")) {
            entity.setAutoEmgSetFlgAsAutoEmgSetFlg(CDef.AutoEmgSetFlg.codeOf(dto.getAutoEmgSetFlg()));
        }
        if (needsMapping(dto, dto.getAutoEmgSetTgt(), "autoEmgSetTgt")) {
            entity.setAutoEmgSetTgtAsAutoEmgSetTgt(CDef.AutoEmgSetTgt.codeOf(dto.getAutoEmgSetTgt()));
        }
        if (needsMapping(dto, dto.getAutoEmgSetMinute(), "autoEmgSetMinute")) {
            entity.setAutoEmgSetMinute(dto.getAutoEmgSetMinute());
        }
        if (needsMapping(dto, dto.getStockOutInstCxlFlg(), "stockOutInstCxlFlg")) {
            entity.setStockOutInstCxlFlgAsStockOutInstCxlFlg(CDef.StockOutInstCxlFlg.codeOf(dto.getStockOutInstCxlFlg()));
        }
        if (needsMapping(dto, dto.getStockOutAllocCls(), "stockOutAllocCls")) {
            entity.setStockOutAllocClsAsStockOutAllocCls(CDef.StockOutAllocCls.codeOf(dto.getStockOutAllocCls()));
        }
        if (needsMapping(dto, dto.getStockOutInstSplitFlg(), "stockOutInstSplitFlg")) {
            entity.setStockOutInstSplitFlgAsStockOutInstSplitFlg(CDef.StockOutInstSplitFlg.codeOf(dto.getStockOutInstSplitFlg()));
        }
        if (needsMapping(dto, dto.getCesIntegrationFlg(), "cesIntegrationFlg")) {
            entity.setCesIntegrationFlgAsCesIntegrationFlg(CDef.CesIntegrationFlg.codeOf(dto.getCesIntegrationFlg()));
        }
        if (needsMapping(dto, dto.getPackingSlipAutoOutputFlg(), "packingSlipAutoOutputFlg")) {
            entity.setPackingSlipAutoOutputFlgAsPackingSlipAutoOutputFlg(CDef.PackingSlipAutoOutputFlg.codeOf(dto.getPackingSlipAutoOutputFlg()));
        }
        if (needsMapping(dto, dto.getCenterKbn(), "centerKbn")) {
            entity.setCenterKbn(dto.getCenterKbn());
        }
        if (needsMapping(dto, dto.getDelFlg(), "delFlg") && !exceptCommonColumn) {
            entity.setDelFlgAsDelFlg(CDef.DelFlg.codeOf(dto.getDelFlg()));
        }
        if (needsMapping(dto, dto.getVersionNo(), "versionNo") && !exceptCommonColumn) {
            entity.setVersionNo(dto.getVersionNo());
        }
        if (needsMapping(dto, dto.getControlNo(), "controlNo") && !exceptCommonColumn) {
            entity.setControlNo(dto.getControlNo());
        }
        if (needsMapping(dto, dto.getAddDt(), "addDt") && !exceptCommonColumn) {
            entity.setAddDt(dto.getAddDt());
        }
        if (needsMapping(dto, dto.getAddUser(), "addUser") && !exceptCommonColumn) {
            entity.setAddUser(dto.getAddUser());
        }
        if (needsMapping(dto, dto.getAddProcess(), "addProcess") && !exceptCommonColumn) {
            entity.setAddProcess(dto.getAddProcess());
        }
        if (needsMapping(dto, dto.getUpdDt(), "updDt") && !exceptCommonColumn) {
            entity.setUpdDt(dto.getUpdDt());
        }
        if (needsMapping(dto, dto.getUpdUser(), "updUser") && !exceptCommonColumn) {
            entity.setUpdUser(dto.getUpdUser());
        }
        if (needsMapping(dto, dto.getUpdProcess(), "updProcess") && !exceptCommonColumn) {
            entity.setUpdProcess(dto.getUpdProcess());
        }
        reflectDerivedProperty(entity, dto, false);
        if (instanceCache && entity.hasPrimaryKeyValue()) { // caches only an entity that has a primary key value
            _relationEntityMap.put(localKey, entity);
        }
        boolean reverseReference = isReverseReference();
        if (!_suppressMDeliveryCourse && dto.getMDeliveryCourse() != null) {
            MDeliveryCourseDto relationDto = dto.getMDeliveryCourse();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                MDeliveryCourse relationEntity = (MDeliveryCourse)cachedEntity;
                entity.setMDeliveryCourse(relationEntity);
                if (reverseReference) {
                    relationEntity.getMParamList().add(entity);
                }
            } else {
                MDeliveryCourseDtoMapper mapper = new MDeliveryCourseDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressMParamList();
                MDeliveryCourse relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMDeliveryCourse(relationEntity);
                if (reverseReference) {
                    relationEntity.getMParamList().add(entity);
                }
                if (instanceCache && entity.getMDeliveryCourse().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMDeliveryCourse());
                }
            }
        };
        if (!_suppressMBoxGrp && dto.getMBoxGrp() != null) {
            MBoxGrpDto relationDto = dto.getMBoxGrp();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                MBoxGrp relationEntity = (MBoxGrp)cachedEntity;
                entity.setMBoxGrp(relationEntity);
                if (reverseReference) {
                    relationEntity.getMParamList().add(entity);
                }
            } else {
                MBoxGrpDtoMapper mapper = new MBoxGrpDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressMParamList();
                MBoxGrp relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMBoxGrp(relationEntity);
                if (reverseReference) {
                    relationEntity.getMParamList().add(entity);
                }
                if (instanceCache && entity.getMBoxGrp().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMBoxGrp());
                }
            }
        };
        if (!_suppressMBox && dto.getMBox() != null) {
            MBoxDto relationDto = dto.getMBox();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                MBox relationEntity = (MBox)cachedEntity;
                entity.setMBox(relationEntity);
                if (reverseReference) {
                    relationEntity.getMParamList().add(entity);
                }
            } else {
                MBoxDtoMapper mapper = new MBoxDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressMParamList();
                MBox relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMBox(relationEntity);
                if (reverseReference) {
                    relationEntity.getMParamList().add(entity);
                }
                if (instanceCache && entity.getMBox().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMBox());
                }
            }
        };
        if (!_suppressMZone && dto.getMZone() != null) {
            MZoneDto relationDto = dto.getMZone();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                MZone relationEntity = (MZone)cachedEntity;
                entity.setMZone(relationEntity);
                if (reverseReference) {
                    relationEntity.getMParamList().add(entity);
                }
            } else {
                MZoneDtoMapper mapper = new MZoneDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressMParamList();
                MZone relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMZone(relationEntity);
                if (reverseReference) {
                    relationEntity.getMParamList().add(entity);
                }
                if (instanceCache && entity.getMZone().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMZone());
                }
            }
        };
        if (!_suppressMClientCenter && dto.getMClientCenter() != null) {
            MClientCenterDto relationDto = dto.getMClientCenter();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                MClientCenter relationEntity = (MClientCenter)cachedEntity;
                entity.setMClientCenter(relationEntity);
                if (reverseReference) {
                    relationEntity.setMParamAsOne(entity);
                }
            } else {
                MClientCenterDtoMapper mapper = new MClientCenterDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressMParamAsOne();
                MClientCenter relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMClientCenter(relationEntity);
                if (reverseReference) {
                    relationEntity.setMParamAsOne(entity);
                }
                if (instanceCache && entity.getMClientCenter().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMClientCenter());
                }
            }
        };
        if (!_suppressBClassDtlByAfterTagOutFlg && dto.getBClassDtlByAfterTagOutFlg() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByAfterTagOutFlg();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByAfterTagOutFlg(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByAfterTagOutFlg(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByAfterTagOutFlg().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByAfterTagOutFlg());
                }
            }
        };
        if (!_suppressBClassDtlByAfterDelivSlipOutFlg && dto.getBClassDtlByAfterDelivSlipOutFlg() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByAfterDelivSlipOutFlg();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByAfterDelivSlipOutFlg(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByAfterDelivSlipOutFlg(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByAfterDelivSlipOutFlg().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByAfterDelivSlipOutFlg());
                }
            }
        };
        if (!_suppressBClassDtlByAfterDelivSlipOutTgt && dto.getBClassDtlByAfterDelivSlipOutTgt() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByAfterDelivSlipOutTgt();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByAfterDelivSlipOutTgt(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByAfterDelivSlipOutTgt(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByAfterDelivSlipOutTgt().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByAfterDelivSlipOutTgt());
                }
            }
        };
        if (!_suppressBClassDtlBySglRowInspAfterOutCls && dto.getBClassDtlBySglRowInspAfterOutCls() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlBySglRowInspAfterOutCls();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlBySglRowInspAfterOutCls(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlBySglRowInspAfterOutCls(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlBySglRowInspAfterOutCls().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlBySglRowInspAfterOutCls());
                }
            }
        };
        if (!_suppressBClassDtlByBoxSelectSkip && dto.getBClassDtlByBoxSelectSkip() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByBoxSelectSkip();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByBoxSelectSkip(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByBoxSelectSkip(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByBoxSelectSkip().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByBoxSelectSkip());
                }
            }
        };
        if (!_suppressBClassDtlByCasePicFlg && dto.getBClassDtlByCasePicFlg() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByCasePicFlg();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByCasePicFlg(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByCasePicFlg(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByCasePicFlg().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByCasePicFlg());
                }
            }
        };
        if (!_suppressBClassDtlByDelFlg && dto.getBClassDtlByDelFlg() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByDelFlg();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByDelFlg(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByDelFlg(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByDelFlg().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByDelFlg());
                }
            }
        };
        if (!_suppressBClassDtlByHtCharReadFlg && dto.getBClassDtlByHtCharReadFlg() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByHtCharReadFlg();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByHtCharReadFlg(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByHtCharReadFlg(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByHtCharReadFlg().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByHtCharReadFlg());
                }
            }
        };
        if (!_suppressBClassDtlByMergeCls && dto.getBClassDtlByMergeCls() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByMergeCls();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByMergeCls(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByMergeCls(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByMergeCls().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByMergeCls());
                }
            }
        };
        if (!_suppressBClassDtlByMultiPicCls && dto.getBClassDtlByMultiPicCls() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByMultiPicCls();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByMultiPicCls(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByMultiPicCls(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByMultiPicCls().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByMultiPicCls());
                }
            }
        };
        if (!_suppressBClassDtlByOverStoreNumFlg && dto.getBClassDtlByOverStoreNumFlg() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByOverStoreNumFlg();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByOverStoreNumFlg(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByOverStoreNumFlg(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByOverStoreNumFlg().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByOverStoreNumFlg());
                }
            }
        };
        if (!_suppressBClassDtlByPackingCalCls && dto.getBClassDtlByPackingCalCls() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByPackingCalCls();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByPackingCalCls(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByPackingCalCls(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByPackingCalCls().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByPackingCalCls());
                }
            }
        };
        if (!_suppressBClassDtlByPackingProcessCls && dto.getBClassDtlByPackingProcessCls() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByPackingProcessCls();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByPackingProcessCls(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByPackingProcessCls(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByPackingProcessCls().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByPackingProcessCls());
                }
            }
        };
        if (!_suppressBClassDtlByPastStoreDtFlg && dto.getBClassDtlByPastStoreDtFlg() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByPastStoreDtFlg();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByPastStoreDtFlg(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByPastStoreDtFlg(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByPastStoreDtFlg().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByPastStoreDtFlg());
                }
            }
        };
        if (!_suppressBClassDtlByProductLabelJanBarcode && dto.getBClassDtlByProductLabelJanBarcode() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByProductLabelJanBarcode();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByProductLabelJanBarcode(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByProductLabelJanBarcode(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByProductLabelJanBarcode().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByProductLabelJanBarcode());
                }
            }
        };
        if (!_suppressBClassDtlByProductLabelOutUnit && dto.getBClassDtlByProductLabelOutUnit() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByProductLabelOutUnit();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByProductLabelOutUnit(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByProductLabelOutUnit(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByProductLabelOutUnit().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByProductLabelOutUnit());
                }
            }
        };
        if (!_suppressBClassDtlByProductLabelProdBarcode && dto.getBClassDtlByProductLabelProdBarcode() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByProductLabelProdBarcode();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByProductLabelProdBarcode(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByProductLabelProdBarcode(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByProductLabelProdBarcode().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByProductLabelProdBarcode());
                }
            }
        };
        if (!_suppressBClassDtlByProductPartPacking && dto.getBClassDtlByProductPartPacking() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByProductPartPacking();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByProductPartPacking(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByProductPartPacking(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByProductPartPacking().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByProductPartPacking());
                }
            }
        };
        if (!_suppressBClassDtlByDecimalProductPacking && dto.getBClassDtlByDecimalProductPacking() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByDecimalProductPacking();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByDecimalProductPacking(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByDecimalProductPacking(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByDecimalProductPacking().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByDecimalProductPacking());
                }
            }
        };
        if (!_suppressBClassDtlByEmReplenishAllocCls && dto.getBClassDtlByEmReplenishAllocCls() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByEmReplenishAllocCls();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByEmReplenishAllocCls(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByEmReplenishAllocCls(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByEmReplenishAllocCls().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByEmReplenishAllocCls());
                }
            }
        };
        if (!_suppressBClassDtlByRgReplenishUnitCls && dto.getBClassDtlByRgReplenishUnitCls() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByRgReplenishUnitCls();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByRgReplenishUnitCls(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByRgReplenishUnitCls(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByRgReplenishUnitCls().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByRgReplenishUnitCls());
                }
            }
        };
        if (!_suppressBClassDtlByEmReplenishUnitCls && dto.getBClassDtlByEmReplenishUnitCls() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByEmReplenishUnitCls();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByEmReplenishUnitCls(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByEmReplenishUnitCls(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByEmReplenishUnitCls().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByEmReplenishUnitCls());
                }
            }
        };
        if (!_suppressBClassDtlByResultAfterProductLabel && dto.getBClassDtlByResultAfterProductLabel() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByResultAfterProductLabel();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByResultAfterProductLabel(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByResultAfterProductLabel(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByResultAfterProductLabel().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByResultAfterProductLabel());
                }
            }
        };
        if (!_suppressBClassDtlByResultAfterProductTarget && dto.getBClassDtlByResultAfterProductTarget() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByResultAfterProductTarget();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByResultAfterProductTarget(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByResultAfterProductTarget(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByResultAfterProductTarget().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByResultAfterProductTarget());
                }
            }
        };
        if (!_suppressBClassDtlByStoreDtFlg && dto.getBClassDtlByStoreDtFlg() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByStoreDtFlg();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByStoreDtFlg(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByStoreDtFlg(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByStoreDtFlg().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByStoreDtFlg());
                }
            }
        };
        if (!_suppressBClassDtlByStoreNoFlg && dto.getBClassDtlByStoreNoFlg() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByStoreNoFlg();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByStoreNoFlg(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByStoreNoFlg(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByStoreNoFlg().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByStoreNoFlg());
                }
            }
        };
        if (!_suppressBClassDtlByTagDeliveryOutFlg && dto.getBClassDtlByTagDeliveryOutFlg() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByTagDeliveryOutFlg();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByTagDeliveryOutFlg(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByTagDeliveryOutFlg(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByTagDeliveryOutFlg().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByTagDeliveryOutFlg());
                }
            }
        };
        if (!_suppressBClassDtlByUseHtShipFlg && dto.getBClassDtlByUseHtShipFlg() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByUseHtShipFlg();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByUseHtShipFlg(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByUseHtShipFlg(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByUseHtShipFlg().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByUseHtShipFlg());
                }
            }
        };
        if (!_suppressBClassDtlByInspectionLabelOutFlg && dto.getBClassDtlByInspectionLabelOutFlg() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByInspectionLabelOutFlg();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByInspectionLabelOutFlg(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByInspectionLabelOutFlg(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByInspectionLabelOutFlg().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByInspectionLabelOutFlg());
                }
            }
        };
        if (!_suppressBClassDtlBySglRowPicFlg && dto.getBClassDtlBySglRowPicFlg() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlBySglRowPicFlg();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlBySglRowPicFlg(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlBySglRowPicFlg(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlBySglRowPicFlg().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlBySglRowPicFlg());
                }
            }
        };
        if (!_suppressBClassDtlByTotalPicFlg && dto.getBClassDtlByTotalPicFlg() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByTotalPicFlg();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByTotalPicFlg(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByTotalPicFlg(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByTotalPicFlg().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByTotalPicFlg());
                }
            }
        };
        if (!_suppressBClassDtlByPicMthdRcmdFlg && dto.getBClassDtlByPicMthdRcmdFlg() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByPicMthdRcmdFlg();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByPicMthdRcmdFlg(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByPicMthdRcmdFlg(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByPicMthdRcmdFlg().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByPicMthdRcmdFlg());
                }
            }
        };
        if (!_suppressBClassDtlByPicMthdRcmdBreakKey && dto.getBClassDtlByPicMthdRcmdBreakKey() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByPicMthdRcmdBreakKey();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByPicMthdRcmdBreakKey(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByPicMthdRcmdBreakKey(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByPicMthdRcmdBreakKey().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByPicMthdRcmdBreakKey());
                }
            }
        };
        if (!_suppressBClassDtlByAutoShipInstFlg && dto.getBClassDtlByAutoShipInstFlg() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByAutoShipInstFlg();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByAutoShipInstFlg(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByAutoShipInstFlg(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByAutoShipInstFlg().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByAutoShipInstFlg());
                }
            }
        };
        if (!_suppressBClassDtlByStockOutAutoInstFlg && dto.getBClassDtlByStockOutAutoInstFlg() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByStockOutAutoInstFlg();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByStockOutAutoInstFlg(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByStockOutAutoInstFlg(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByStockOutAutoInstFlg().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByStockOutAutoInstFlg());
                }
            }
        };
        if (!_suppressBClassDtlByAutoEmgSetFlg && dto.getBClassDtlByAutoEmgSetFlg() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByAutoEmgSetFlg();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByAutoEmgSetFlg(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByAutoEmgSetFlg(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByAutoEmgSetFlg().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByAutoEmgSetFlg());
                }
            }
        };
        if (!_suppressBClassDtlByAutoEmgSetTgt && dto.getBClassDtlByAutoEmgSetTgt() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByAutoEmgSetTgt();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByAutoEmgSetTgt(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByAutoEmgSetTgt(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByAutoEmgSetTgt().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByAutoEmgSetTgt());
                }
            }
        };
        if (!_suppressBClassDtlByStockOutAllocCls && dto.getBClassDtlByStockOutAllocCls() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByStockOutAllocCls();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByStockOutAllocCls(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByStockOutAllocCls(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByStockOutAllocCls().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByStockOutAllocCls());
                }
            }
        };
        if (!_suppressBClassDtlByStockOutInstCxlFlg && dto.getBClassDtlByStockOutInstCxlFlg() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByStockOutInstCxlFlg();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByStockOutInstCxlFlg(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByStockOutInstCxlFlg(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByStockOutInstCxlFlg().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByStockOutInstCxlFlg());
                }
            }
        };
        if (!_suppressBClassDtlByStockOutInstSplitFlg && dto.getBClassDtlByStockOutInstSplitFlg() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByStockOutInstSplitFlg();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByStockOutInstSplitFlg(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByStockOutInstSplitFlg(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByStockOutInstSplitFlg().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByStockOutInstSplitFlg());
                }
            }
        };
        if (!_suppressBClassDtlByPicMthdRcmdMltPlOut && dto.getBClassDtlByPicMthdRcmdMltPlOut() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByPicMthdRcmdMltPlOut();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByPicMthdRcmdMltPlOut(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByPicMthdRcmdMltPlOut(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByPicMthdRcmdMltPlOut().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByPicMthdRcmdMltPlOut());
                }
            }
        };
        if (!_suppressBClassDtlByPicMthdRcmdSplSlOut && dto.getBClassDtlByPicMthdRcmdSplSlOut() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByPicMthdRcmdSplSlOut();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByPicMthdRcmdSplSlOut(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByPicMthdRcmdSplSlOut(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByPicMthdRcmdSplSlOut().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByPicMthdRcmdSplSlOut());
                }
            }
        };
        if (!_suppressBClassDtlByErrorSoundPlayFlg && dto.getBClassDtlByErrorSoundPlayFlg() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByErrorSoundPlayFlg();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByErrorSoundPlayFlg(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByErrorSoundPlayFlg(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByErrorSoundPlayFlg().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByErrorSoundPlayFlg());
                }
            }
        };
        if (!_suppressBClassDtlByWarnSoundPlayFlg && dto.getBClassDtlByWarnSoundPlayFlg() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByWarnSoundPlayFlg();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByWarnSoundPlayFlg(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByWarnSoundPlayFlg(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByWarnSoundPlayFlg().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByWarnSoundPlayFlg());
                }
            }
        };
        if (!_suppressBClassDtlByInspSoundPlayFlg && dto.getBClassDtlByInspSoundPlayFlg() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByInspSoundPlayFlg();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByInspSoundPlayFlg(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByInspSoundPlayFlg(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByInspSoundPlayFlg().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByInspSoundPlayFlg());
                }
            }
        };
        if (!_suppressBClassDtlByInspCompSoundPlayFlg && dto.getBClassDtlByInspCompSoundPlayFlg() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByInspCompSoundPlayFlg();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByInspCompSoundPlayFlg(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByInspCompSoundPlayFlg(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByInspCompSoundPlayFlg().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByInspCompSoundPlayFlg());
                }
            }
        };
        if (!_suppressBClassDtlByCesIntegrationFlg && dto.getBClassDtlByCesIntegrationFlg() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByCesIntegrationFlg();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByCesIntegrationFlg(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByCesIntegrationFlg(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByCesIntegrationFlg().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByCesIntegrationFlg());
                }
            }
        };
        if (!_suppressBClassDtlByPackingSlipAutoOutputFlg && dto.getBClassDtlByPackingSlipAutoOutputFlg() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByPackingSlipAutoOutputFlg();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByPackingSlipAutoOutputFlg(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByPackingSlipAutoOutputFlg(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByPackingSlipAutoOutputFlg().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByPackingSlipAutoOutputFlg());
                }
            }
        };
        return entity;
    }

    /**
     * Does the property need to be mapped to an entity? <br>
     * If modified info of DTO has at least one property, only modified properties are mapped.
     * And if no property is modified, all properties are mapped (but the other option exists).
     * @param dto The instance of DTO. (NotNull)
     * @param value The value of DTO's property. (NotNull)
     * @param propName The property name of DTO. (NotNull)
     * @return The determination, true or false.
     */
    protected boolean needsMapping(MParamDto dto, Object value, String propName) {
        Set<String> modifiedProperties = dto.mymodifiedProperties();
        if (modifiedProperties.isEmpty()) {
            return isMappingToEntityContainsNull() || value != null;
        }
        return modifiedProperties.contains(propName);
    }

    /**
     * Does the mapping to an entity contain null values? (when no property is modified) <br>
     * Default is true that means a setter is called if the value is null.
     * But this method is valid only when no property is modified.
     * @return The determination, true or false.
     */
    protected boolean isMappingToEntityContainsNull() { // for extension
        return true; // as default
    }

    /**
     * {@inheritDoc}
     */
    public List<MParam> mappingToEntityList(List<MParamDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<MParam> entityList = new ArrayList<MParam>();
        for (MParamDto dto : dtoList) {
            MParam entity = mappingToEntity(dto);
            if (entity != null) {
                entityList.add(entity);
            } else {
                if (isAcceptNullElementOnList()) {
                    entityList.add(null);
                }
            }
        }
        return entityList;
    }

    protected boolean isAcceptNullElementOnList() {
        return true; // as default
    }

    // -----------------------------------------------------
    //                                          Instance Key
    //                                          ------------
    protected Object createInstanceKeyDto(final Object dto, final int instanceHash) {
        return new InstanceKeyDto(dto, instanceHash);
    }

    protected InstanceKeyEntity createInstanceKeyEntity(Entity entity) {
        return new InstanceKeyEntity(entity);
    }

    public void disableInstanceCache() { // internal option
        _instanceCache = false;
    }

    // -----------------------------------------------------
    //                                      Derived Property
    //                                      ----------------
    protected void reflectDerivedProperty(Entity entity, Object dto, boolean toDto) {
        DfBeanDesc entityDesc = DfBeanDescFactory.getBeanDesc(entity.getClass());
        DfBeanDesc dtoDesc = DfBeanDescFactory.getBeanDesc(dto.getClass());
        DBMeta dbmeta = entity.asDBMeta();
        for (String propertyName : entityDesc.getProppertyNameList()) {
            if (isOutOfDerivedPropertyName(entity, dto, toDto, dbmeta, entityDesc, dtoDesc, propertyName)) {
                continue;
            }
            DfPropertyDesc entityProp = entityDesc.getPropertyDesc(propertyName);
            Class<?> propertyType = entityProp.getPropertyType();
            if (isOutOfDerivedPropertyType(entity, dto, toDto, propertyName, propertyType)) {
                continue;
            }
            if (entityProp.isReadable() && entityProp.isWritable()) {
                DfPropertyDesc dtoProp = dtoDesc.getPropertyDesc(propertyName);
                if (dtoProp.isReadable() && dtoProp.isWritable()) {
                    if (toDto) {
                        dtoProp.setValue(dto, entityProp.getValue(entity));
                    } else {
                        entityProp.setValue(entity, dtoProp.getValue(dto));
                    }
                }
            }
        }
    }

    protected boolean isOutOfDerivedPropertyName(Entity entity, Object dto, boolean toDto
                                               , DBMeta dbmeta, DfBeanDesc entityDesc, DfBeanDesc dtoDesc
                                               , String propertyName) {
        return dbmeta.hasColumn(propertyName)
                    || dbmeta.hasForeign(propertyName) || dbmeta.hasReferrer(propertyName)
                    || !dtoDesc.hasPropertyDesc(propertyName);
    }

    protected boolean isOutOfDerivedPropertyType(Entity entity, Object dto, boolean toDto
                                               , String propertyName, Class<?> propertyType) {
        return List.class.isAssignableFrom(propertyType)
                || Entity.class.isAssignableFrom(propertyType)
                || Classification.class.isAssignableFrom(propertyType);
    }

    // ===================================================================================
    //                                                                   Suppress Relation
    //                                                                   =================
    // (basically) to suppress infinity loop
    public void suppressMDeliveryCourse() {
        _suppressMDeliveryCourse = true;
    }
    public void suppressMBoxGrp() {
        _suppressMBoxGrp = true;
    }
    public void suppressMBox() {
        _suppressMBox = true;
    }
    public void suppressMZone() {
        _suppressMZone = true;
    }
    public void suppressMClientCenter() {
        _suppressMClientCenter = true;
    }
    public void suppressBClassDtlByAfterTagOutFlg() {
        _suppressBClassDtlByAfterTagOutFlg = true;
    }
    public void suppressBClassDtlByAfterDelivSlipOutFlg() {
        _suppressBClassDtlByAfterDelivSlipOutFlg = true;
    }
    public void suppressBClassDtlByAfterDelivSlipOutTgt() {
        _suppressBClassDtlByAfterDelivSlipOutTgt = true;
    }
    public void suppressBClassDtlBySglRowInspAfterOutCls() {
        _suppressBClassDtlBySglRowInspAfterOutCls = true;
    }
    public void suppressBClassDtlByBoxSelectSkip() {
        _suppressBClassDtlByBoxSelectSkip = true;
    }
    public void suppressBClassDtlByCasePicFlg() {
        _suppressBClassDtlByCasePicFlg = true;
    }
    public void suppressBClassDtlByDelFlg() {
        _suppressBClassDtlByDelFlg = true;
    }
    public void suppressBClassDtlByHtCharReadFlg() {
        _suppressBClassDtlByHtCharReadFlg = true;
    }
    public void suppressBClassDtlByMergeCls() {
        _suppressBClassDtlByMergeCls = true;
    }
    public void suppressBClassDtlByMultiPicCls() {
        _suppressBClassDtlByMultiPicCls = true;
    }
    public void suppressBClassDtlByOverStoreNumFlg() {
        _suppressBClassDtlByOverStoreNumFlg = true;
    }
    public void suppressBClassDtlByPackingCalCls() {
        _suppressBClassDtlByPackingCalCls = true;
    }
    public void suppressBClassDtlByPackingProcessCls() {
        _suppressBClassDtlByPackingProcessCls = true;
    }
    public void suppressBClassDtlByPastStoreDtFlg() {
        _suppressBClassDtlByPastStoreDtFlg = true;
    }
    public void suppressBClassDtlByProductLabelJanBarcode() {
        _suppressBClassDtlByProductLabelJanBarcode = true;
    }
    public void suppressBClassDtlByProductLabelOutUnit() {
        _suppressBClassDtlByProductLabelOutUnit = true;
    }
    public void suppressBClassDtlByProductLabelProdBarcode() {
        _suppressBClassDtlByProductLabelProdBarcode = true;
    }
    public void suppressBClassDtlByProductPartPacking() {
        _suppressBClassDtlByProductPartPacking = true;
    }
    public void suppressBClassDtlByDecimalProductPacking() {
        _suppressBClassDtlByDecimalProductPacking = true;
    }
    public void suppressBClassDtlByEmReplenishAllocCls() {
        _suppressBClassDtlByEmReplenishAllocCls = true;
    }
    public void suppressBClassDtlByRgReplenishUnitCls() {
        _suppressBClassDtlByRgReplenishUnitCls = true;
    }
    public void suppressBClassDtlByEmReplenishUnitCls() {
        _suppressBClassDtlByEmReplenishUnitCls = true;
    }
    public void suppressBClassDtlByResultAfterProductLabel() {
        _suppressBClassDtlByResultAfterProductLabel = true;
    }
    public void suppressBClassDtlByResultAfterProductTarget() {
        _suppressBClassDtlByResultAfterProductTarget = true;
    }
    public void suppressBClassDtlByStoreDtFlg() {
        _suppressBClassDtlByStoreDtFlg = true;
    }
    public void suppressBClassDtlByStoreNoFlg() {
        _suppressBClassDtlByStoreNoFlg = true;
    }
    public void suppressBClassDtlByTagDeliveryOutFlg() {
        _suppressBClassDtlByTagDeliveryOutFlg = true;
    }
    public void suppressBClassDtlByUseHtShipFlg() {
        _suppressBClassDtlByUseHtShipFlg = true;
    }
    public void suppressBClassDtlByInspectionLabelOutFlg() {
        _suppressBClassDtlByInspectionLabelOutFlg = true;
    }
    public void suppressBClassDtlBySglRowPicFlg() {
        _suppressBClassDtlBySglRowPicFlg = true;
    }
    public void suppressBClassDtlByTotalPicFlg() {
        _suppressBClassDtlByTotalPicFlg = true;
    }
    public void suppressBClassDtlByPicMthdRcmdFlg() {
        _suppressBClassDtlByPicMthdRcmdFlg = true;
    }
    public void suppressBClassDtlByPicMthdRcmdBreakKey() {
        _suppressBClassDtlByPicMthdRcmdBreakKey = true;
    }
    public void suppressBClassDtlByAutoShipInstFlg() {
        _suppressBClassDtlByAutoShipInstFlg = true;
    }
    public void suppressBClassDtlByStockOutAutoInstFlg() {
        _suppressBClassDtlByStockOutAutoInstFlg = true;
    }
    public void suppressBClassDtlByAutoEmgSetFlg() {
        _suppressBClassDtlByAutoEmgSetFlg = true;
    }
    public void suppressBClassDtlByAutoEmgSetTgt() {
        _suppressBClassDtlByAutoEmgSetTgt = true;
    }
    public void suppressBClassDtlByStockOutAllocCls() {
        _suppressBClassDtlByStockOutAllocCls = true;
    }
    public void suppressBClassDtlByStockOutInstCxlFlg() {
        _suppressBClassDtlByStockOutInstCxlFlg = true;
    }
    public void suppressBClassDtlByStockOutInstSplitFlg() {
        _suppressBClassDtlByStockOutInstSplitFlg = true;
    }
    public void suppressBClassDtlByPicMthdRcmdMltPlOut() {
        _suppressBClassDtlByPicMthdRcmdMltPlOut = true;
    }
    public void suppressBClassDtlByPicMthdRcmdSplSlOut() {
        _suppressBClassDtlByPicMthdRcmdSplSlOut = true;
    }
    public void suppressBClassDtlByErrorSoundPlayFlg() {
        _suppressBClassDtlByErrorSoundPlayFlg = true;
    }
    public void suppressBClassDtlByWarnSoundPlayFlg() {
        _suppressBClassDtlByWarnSoundPlayFlg = true;
    }
    public void suppressBClassDtlByInspSoundPlayFlg() {
        _suppressBClassDtlByInspSoundPlayFlg = true;
    }
    public void suppressBClassDtlByInspCompSoundPlayFlg() {
        _suppressBClassDtlByInspCompSoundPlayFlg = true;
    }
    public void suppressBClassDtlByCesIntegrationFlg() {
        _suppressBClassDtlByCesIntegrationFlg = true;
    }
    public void suppressBClassDtlByPackingSlipAutoOutputFlg() {
        _suppressBClassDtlByPackingSlipAutoOutputFlg = true;
    }
    protected void doSuppressAll() { // internal
        suppressMDeliveryCourse();
        suppressMBoxGrp();
        suppressMBox();
        suppressMZone();
        suppressMClientCenter();
        suppressBClassDtlByAfterTagOutFlg();
        suppressBClassDtlByAfterDelivSlipOutFlg();
        suppressBClassDtlByAfterDelivSlipOutTgt();
        suppressBClassDtlBySglRowInspAfterOutCls();
        suppressBClassDtlByBoxSelectSkip();
        suppressBClassDtlByCasePicFlg();
        suppressBClassDtlByDelFlg();
        suppressBClassDtlByHtCharReadFlg();
        suppressBClassDtlByMergeCls();
        suppressBClassDtlByMultiPicCls();
        suppressBClassDtlByOverStoreNumFlg();
        suppressBClassDtlByPackingCalCls();
        suppressBClassDtlByPackingProcessCls();
        suppressBClassDtlByPastStoreDtFlg();
        suppressBClassDtlByProductLabelJanBarcode();
        suppressBClassDtlByProductLabelOutUnit();
        suppressBClassDtlByProductLabelProdBarcode();
        suppressBClassDtlByProductPartPacking();
        suppressBClassDtlByDecimalProductPacking();
        suppressBClassDtlByEmReplenishAllocCls();
        suppressBClassDtlByRgReplenishUnitCls();
        suppressBClassDtlByEmReplenishUnitCls();
        suppressBClassDtlByResultAfterProductLabel();
        suppressBClassDtlByResultAfterProductTarget();
        suppressBClassDtlByStoreDtFlg();
        suppressBClassDtlByStoreNoFlg();
        suppressBClassDtlByTagDeliveryOutFlg();
        suppressBClassDtlByUseHtShipFlg();
        suppressBClassDtlByInspectionLabelOutFlg();
        suppressBClassDtlBySglRowPicFlg();
        suppressBClassDtlByTotalPicFlg();
        suppressBClassDtlByPicMthdRcmdFlg();
        suppressBClassDtlByPicMthdRcmdBreakKey();
        suppressBClassDtlByAutoShipInstFlg();
        suppressBClassDtlByStockOutAutoInstFlg();
        suppressBClassDtlByAutoEmgSetFlg();
        suppressBClassDtlByAutoEmgSetTgt();
        suppressBClassDtlByStockOutAllocCls();
        suppressBClassDtlByStockOutInstCxlFlg();
        suppressBClassDtlByStockOutInstSplitFlg();
        suppressBClassDtlByPicMthdRcmdMltPlOut();
        suppressBClassDtlByPicMthdRcmdSplSlOut();
        suppressBClassDtlByErrorSoundPlayFlg();
        suppressBClassDtlByWarnSoundPlayFlg();
        suppressBClassDtlByInspSoundPlayFlg();
        suppressBClassDtlByInspCompSoundPlayFlg();
        suppressBClassDtlByCesIntegrationFlg();
        suppressBClassDtlByPackingSlipAutoOutputFlg();
    }
    protected void doSuppressClear() { // internal
        _suppressMDeliveryCourse = false;
        _suppressMBoxGrp = false;
        _suppressMBox = false;
        _suppressMZone = false;
        _suppressMClientCenter = false;
        _suppressBClassDtlByAfterTagOutFlg = false;
        _suppressBClassDtlByAfterDelivSlipOutFlg = false;
        _suppressBClassDtlByAfterDelivSlipOutTgt = false;
        _suppressBClassDtlBySglRowInspAfterOutCls = false;
        _suppressBClassDtlByBoxSelectSkip = false;
        _suppressBClassDtlByCasePicFlg = false;
        _suppressBClassDtlByDelFlg = false;
        _suppressBClassDtlByHtCharReadFlg = false;
        _suppressBClassDtlByMergeCls = false;
        _suppressBClassDtlByMultiPicCls = false;
        _suppressBClassDtlByOverStoreNumFlg = false;
        _suppressBClassDtlByPackingCalCls = false;
        _suppressBClassDtlByPackingProcessCls = false;
        _suppressBClassDtlByPastStoreDtFlg = false;
        _suppressBClassDtlByProductLabelJanBarcode = false;
        _suppressBClassDtlByProductLabelOutUnit = false;
        _suppressBClassDtlByProductLabelProdBarcode = false;
        _suppressBClassDtlByProductPartPacking = false;
        _suppressBClassDtlByDecimalProductPacking = false;
        _suppressBClassDtlByEmReplenishAllocCls = false;
        _suppressBClassDtlByRgReplenishUnitCls = false;
        _suppressBClassDtlByEmReplenishUnitCls = false;
        _suppressBClassDtlByResultAfterProductLabel = false;
        _suppressBClassDtlByResultAfterProductTarget = false;
        _suppressBClassDtlByStoreDtFlg = false;
        _suppressBClassDtlByStoreNoFlg = false;
        _suppressBClassDtlByTagDeliveryOutFlg = false;
        _suppressBClassDtlByUseHtShipFlg = false;
        _suppressBClassDtlByInspectionLabelOutFlg = false;
        _suppressBClassDtlBySglRowPicFlg = false;
        _suppressBClassDtlByTotalPicFlg = false;
        _suppressBClassDtlByPicMthdRcmdFlg = false;
        _suppressBClassDtlByPicMthdRcmdBreakKey = false;
        _suppressBClassDtlByAutoShipInstFlg = false;
        _suppressBClassDtlByStockOutAutoInstFlg = false;
        _suppressBClassDtlByAutoEmgSetFlg = false;
        _suppressBClassDtlByAutoEmgSetTgt = false;
        _suppressBClassDtlByStockOutAllocCls = false;
        _suppressBClassDtlByStockOutInstCxlFlg = false;
        _suppressBClassDtlByStockOutInstSplitFlg = false;
        _suppressBClassDtlByPicMthdRcmdMltPlOut = false;
        _suppressBClassDtlByPicMthdRcmdSplSlOut = false;
        _suppressBClassDtlByErrorSoundPlayFlg = false;
        _suppressBClassDtlByWarnSoundPlayFlg = false;
        _suppressBClassDtlByInspSoundPlayFlg = false;
        _suppressBClassDtlByInspCompSoundPlayFlg = false;
        _suppressBClassDtlByCesIntegrationFlg = false;
        _suppressBClassDtlByPackingSlipAutoOutputFlg = false;
    }

    // ===================================================================================
    //                                                                      Mapping Option
    //                                                                      ==============
    /**
     * {@inheritDoc}
     */
    public void setBaseOnlyMapping(boolean baseOnlyMapping) {
        if (baseOnlyMapping) {
            doSuppressAll();
        } else {
            doSuppressClear();
        }
    }

    protected boolean isExceptCommonColumn() {
        return _exceptCommonColumn;
    }

    /**
     * {@inheritDoc}
     */
    public void setExceptCommonColumn(boolean exceptCommonColumn) {
        _exceptCommonColumn = exceptCommonColumn;
    }

    protected boolean isReverseReference() {
        return _reverseReference;
    }

    /**
     * {@inheritDoc}
     */
    public void setReverseReference(boolean reverseReference) {
        _reverseReference = reverseReference;
    }

    // -----------------------------------------------------
    //                                           Easy-to-Use
    //                                           -----------
    /**
     * Enable base-only mapping that means the mapping ignores all references.
     * @return this. (NotNull)
     */
    public MParamDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (MParamDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public MParamDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (MParamDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public MParamDtoMapper reverseReference() {
        setReverseReference(true);
        return (MParamDtoMapper)this;
    }
}
