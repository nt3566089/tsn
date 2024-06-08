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
 * The DTO mapper of T_PICKING_H as TABLE. <br>
 * 出庫ヘッダ
 * <pre>
 * [primary-key]
 *     PICKING_H_ID
 *
 * [column]
 *     PICKING_H_ID, CLIENT_ID, CENTER_ID, PROCESS_TYPE_ID, PICKING_STATUS, DELIV_UNIT_NO, PICKING_WORK_NO, ALLOC_INST_H_ID, FORCE_FIXED_FLG, PICKING_GROUP_NO, SGL_ROW_PIC_FLG, SHIPPING_FIXED_DT, CENTER_TRANSIT_FLG, PACKING_CAL_CLS, BOL_NO, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PICKING_H_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     M_PROCESS_TYPE, M_CENTER, M_CLIENT, T_ALLOC_INST_H, B_CLASS_DTL(ByCenterTransitFlg), T_PICKING_R(AsOne)
 *
 * [referrer-table]
 *     T_PACKING_H, T_PICKING_B, T_PIC_MTHD_RCMD_DATA, T_RECEIVE_PLAN_H, W_SGL_ROW_SHIP_INSP_B, T_PICKING_R
 *
 * [foreign-property]
 *     mProcessType, mCenter, mClient, tAllocInstH, bClassDtlByCenterTransitFlg, bClassDtlByForceFixedFlg, bClassDtlByPackingCalCls, bClassDtlByPickingStatus, bClassDtlBySglRowPicFlg, tPickingRAsOne
 *
 * [referrer-property]
 *     tPackingHList, tPickingBList, tPicMthdRcmdDataList, tReceivePlanHList, wSglRowShipInspBList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsTPickingHDtoMapper implements DtoMapper<TPickingH, TPickingHDto>, Serializable {

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
    protected boolean _suppressMProcessType;
    protected boolean _suppressMCenter;
    protected boolean _suppressMClient;
    protected boolean _suppressTAllocInstH;
    protected boolean _suppressBClassDtlByCenterTransitFlg;
    protected boolean _suppressBClassDtlByForceFixedFlg;
    protected boolean _suppressBClassDtlByPackingCalCls;
    protected boolean _suppressBClassDtlByPickingStatus;
    protected boolean _suppressBClassDtlBySglRowPicFlg;
    protected boolean _suppressTPackingHList;
    protected boolean _suppressTPickingBList;
    protected boolean _suppressTPickingRAsOne;
    protected boolean _suppressTPicMthdRcmdDataList;
    protected boolean _suppressTReceivePlanHList;
    protected boolean _suppressWSglRowShipInspBList;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTPickingHDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsTPickingHDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public TPickingHDto mappingToDto(TPickingH entity) {
        if (entity == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Entity localKey = createInstanceKeyEntity(entity);
        Object cachedLocalDto = instanceCache ? _relationDtoMap.get(localKey) : null;
        if (cachedLocalDto != null) {
            return (TPickingHDto)cachedLocalDto;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        TPickingHDto dto = new TPickingHDto();
        dto.setPickingHId(entity.getPickingHId());
        dto.setClientId(entity.getClientId());
        dto.setCenterId(entity.getCenterId());
        dto.setProcessTypeId(entity.getProcessTypeId());
        dto.setPickingStatus(entity.getPickingStatus());
        dto.setDelivUnitNo(entity.getDelivUnitNo());
        dto.setPickingWorkNo(entity.getPickingWorkNo());
        dto.setAllocInstHId(entity.getAllocInstHId());
        dto.setForceFixedFlg(entity.getForceFixedFlg());
        dto.setPickingGroupNo(entity.getPickingGroupNo());
        dto.setSglRowPicFlg(entity.getSglRowPicFlg());
        dto.setShippingFixedDt(entity.getShippingFixedDt());
        dto.setCenterTransitFlg(entity.getCenterTransitFlg());
        dto.setPackingCalCls(entity.getPackingCalCls());
        dto.setBolNo(entity.getBolNo());
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
        if (!_suppressMProcessType && entity.getMProcessType() != null) {
            MProcessType relationEntity = entity.getMProcessType();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                MProcessTypeDto relationDto = (MProcessTypeDto)cachedDto;
                dto.setMProcessType(relationDto);
                if (reverseReference) {
                    relationDto.getTPickingHList().add(dto);
                }
            } else {
                MProcessTypeDtoMapper mapper = new MProcessTypeDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTPickingHList();
                MProcessTypeDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMProcessType(relationDto);
                if (reverseReference) {
                    relationDto.getTPickingHList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMProcessType());
                }
            }
        };
        if (!_suppressMCenter && entity.getMCenter() != null) {
            MCenter relationEntity = entity.getMCenter();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                MCenterDto relationDto = (MCenterDto)cachedDto;
                dto.setMCenter(relationDto);
                if (reverseReference) {
                    relationDto.getTPickingHList().add(dto);
                }
            } else {
                MCenterDtoMapper mapper = new MCenterDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTPickingHList();
                MCenterDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMCenter(relationDto);
                if (reverseReference) {
                    relationDto.getTPickingHList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMCenter());
                }
            }
        };
        if (!_suppressMClient && entity.getMClient() != null) {
            MClient relationEntity = entity.getMClient();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                MClientDto relationDto = (MClientDto)cachedDto;
                dto.setMClient(relationDto);
                if (reverseReference) {
                    relationDto.getTPickingHList().add(dto);
                }
            } else {
                MClientDtoMapper mapper = new MClientDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTPickingHList();
                MClientDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMClient(relationDto);
                if (reverseReference) {
                    relationDto.getTPickingHList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMClient());
                }
            }
        };
        if (!_suppressTAllocInstH && entity.getTAllocInstH() != null) {
            TAllocInstH relationEntity = entity.getTAllocInstH();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                TAllocInstHDto relationDto = (TAllocInstHDto)cachedDto;
                dto.setTAllocInstH(relationDto);
                if (reverseReference) {
                    relationDto.getTPickingHList().add(dto);
                }
            } else {
                TAllocInstHDtoMapper mapper = new TAllocInstHDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTPickingHList();
                TAllocInstHDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setTAllocInstH(relationDto);
                if (reverseReference) {
                    relationDto.getTPickingHList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getTAllocInstH());
                }
            }
        };
        if (!_suppressBClassDtlByCenterTransitFlg && entity.getBClassDtlByCenterTransitFlg() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByCenterTransitFlg();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByCenterTransitFlg(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByCenterTransitFlg(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByCenterTransitFlg());
                }
            }
        };
        if (!_suppressBClassDtlByForceFixedFlg && entity.getBClassDtlByForceFixedFlg() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByForceFixedFlg();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByForceFixedFlg(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByForceFixedFlg(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByForceFixedFlg());
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
        if (!_suppressBClassDtlByPickingStatus && entity.getBClassDtlByPickingStatus() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByPickingStatus();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByPickingStatus(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByPickingStatus(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByPickingStatus());
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
        if (!_suppressTPackingHList && !entity.getTPackingHList().isEmpty()) {
            TPackingHDtoMapper mapper = new TPackingHDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressTPickingH();
            List<TPackingHDto> relationDtoList = mapper.mappingToDtoList(entity.getTPackingHList());
            dto.setTPackingHList(relationDtoList);
            if (reverseReference) {
                for (TPackingHDto relationDto : relationDtoList) {
                    relationDto.setTPickingH(dto);
                }
            }
        };
        if (!_suppressTPickingBList && !entity.getTPickingBList().isEmpty()) {
            TPickingBDtoMapper mapper = new TPickingBDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressTPickingH();
            List<TPickingBDto> relationDtoList = mapper.mappingToDtoList(entity.getTPickingBList());
            dto.setTPickingBList(relationDtoList);
            if (reverseReference) {
                for (TPickingBDto relationDto : relationDtoList) {
                    relationDto.setTPickingH(dto);
                }
            }
        };
        if (!_suppressTPickingRAsOne && entity.getTPickingRAsOne() != null) {
            TPickingR relationEntity = entity.getTPickingRAsOne();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                TPickingRDto relationDto = (TPickingRDto)cachedDto;
                dto.setTPickingRAsOne(relationDto);
                if (reverseReference) {
                    relationDto.setTPickingH(dto);
                }
            } else {
                TPickingRDtoMapper mapper = new TPickingRDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTPickingH();
                TPickingRDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setTPickingRAsOne(relationDto);
                if (reverseReference) {
                    relationDto.setTPickingH(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getTPickingRAsOne());
                }
            }
        };
        if (!_suppressTPicMthdRcmdDataList && !entity.getTPicMthdRcmdDataList().isEmpty()) {
            TPicMthdRcmdDataDtoMapper mapper = new TPicMthdRcmdDataDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressTPickingH();
            List<TPicMthdRcmdDataDto> relationDtoList = mapper.mappingToDtoList(entity.getTPicMthdRcmdDataList());
            dto.setTPicMthdRcmdDataList(relationDtoList);
            if (reverseReference) {
                for (TPicMthdRcmdDataDto relationDto : relationDtoList) {
                    relationDto.setTPickingH(dto);
                }
            }
        };
        if (!_suppressTReceivePlanHList && !entity.getTReceivePlanHList().isEmpty()) {
            TReceivePlanHDtoMapper mapper = new TReceivePlanHDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressTPickingH();
            List<TReceivePlanHDto> relationDtoList = mapper.mappingToDtoList(entity.getTReceivePlanHList());
            dto.setTReceivePlanHList(relationDtoList);
            if (reverseReference) {
                for (TReceivePlanHDto relationDto : relationDtoList) {
                    relationDto.setTPickingH(dto);
                }
            }
        };
        if (!_suppressWSglRowShipInspBList && !entity.getWSglRowShipInspBList().isEmpty()) {
            WSglRowShipInspBDtoMapper mapper = new WSglRowShipInspBDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressTPickingH();
            List<WSglRowShipInspBDto> relationDtoList = mapper.mappingToDtoList(entity.getWSglRowShipInspBList());
            dto.setWSglRowShipInspBList(relationDtoList);
            if (reverseReference) {
                for (WSglRowShipInspBDto relationDto : relationDtoList) {
                    relationDto.setTPickingH(dto);
                }
            }
        };
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<TPickingHDto> mappingToDtoList(List<TPickingH> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<TPickingHDto> dtoList = new ArrayList<TPickingHDto>();
        for (TPickingH entity : entityList) {
            TPickingHDto dto = mappingToDto(entity);
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
    public TPickingH mappingToEntity(TPickingHDto dto) {
        if (dto == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Object localKey = createInstanceKeyDto(dto, dto.instanceHash());
        Entity cachedLocalEntity = instanceCache ? _relationEntityMap.get(localKey) : null;
        if (cachedLocalEntity != null) {
            return (TPickingH)cachedLocalEntity;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        TPickingH entity = new TPickingH();
        if (needsMapping(dto, dto.getPickingHId(), "pickingHId")) {
            entity.setPickingHId(dto.getPickingHId());
        }
        if (needsMapping(dto, dto.getClientId(), "clientId")) {
            entity.setClientId(dto.getClientId());
        }
        if (needsMapping(dto, dto.getCenterId(), "centerId")) {
            entity.setCenterId(dto.getCenterId());
        }
        if (needsMapping(dto, dto.getProcessTypeId(), "processTypeId")) {
            entity.setProcessTypeId(dto.getProcessTypeId());
        }
        if (needsMapping(dto, dto.getPickingStatus(), "pickingStatus")) {
            entity.setPickingStatusAsPickingStatus(CDef.PickingStatus.codeOf(dto.getPickingStatus()));
        }
        if (needsMapping(dto, dto.getDelivUnitNo(), "delivUnitNo")) {
            entity.setDelivUnitNo(dto.getDelivUnitNo());
        }
        if (needsMapping(dto, dto.getPickingWorkNo(), "pickingWorkNo")) {
            entity.setPickingWorkNo(dto.getPickingWorkNo());
        }
        if (needsMapping(dto, dto.getAllocInstHId(), "allocInstHId")) {
            entity.setAllocInstHId(dto.getAllocInstHId());
        }
        if (needsMapping(dto, dto.getForceFixedFlg(), "forceFixedFlg")) {
            entity.setForceFixedFlgAsForceFixedFlg(CDef.ForceFixedFlg.codeOf(dto.getForceFixedFlg()));
        }
        if (needsMapping(dto, dto.getPickingGroupNo(), "pickingGroupNo")) {
            entity.setPickingGroupNo(dto.getPickingGroupNo());
        }
        if (needsMapping(dto, dto.getSglRowPicFlg(), "sglRowPicFlg")) {
            entity.setSglRowPicFlgAsSglRowPicFlg(CDef.SglRowPicFlg.codeOf(dto.getSglRowPicFlg()));
        }
        if (needsMapping(dto, dto.getShippingFixedDt(), "shippingFixedDt")) {
            entity.setShippingFixedDt(dto.getShippingFixedDt());
        }
        if (needsMapping(dto, dto.getCenterTransitFlg(), "centerTransitFlg")) {
            entity.setCenterTransitFlgAsCenterTransitFlg(CDef.CenterTransitFlg.codeOf(dto.getCenterTransitFlg()));
        }
        if (needsMapping(dto, dto.getPackingCalCls(), "packingCalCls")) {
            entity.setPackingCalClsAsPackingCalCls(CDef.PackingCalCls.codeOf(dto.getPackingCalCls()));
        }
        if (needsMapping(dto, dto.getBolNo(), "bolNo")) {
            entity.setBolNo(dto.getBolNo());
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
        if (!_suppressMProcessType && dto.getMProcessType() != null) {
            MProcessTypeDto relationDto = dto.getMProcessType();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                MProcessType relationEntity = (MProcessType)cachedEntity;
                entity.setMProcessType(relationEntity);
                if (reverseReference) {
                    relationEntity.getTPickingHList().add(entity);
                }
            } else {
                MProcessTypeDtoMapper mapper = new MProcessTypeDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTPickingHList();
                MProcessType relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMProcessType(relationEntity);
                if (reverseReference) {
                    relationEntity.getTPickingHList().add(entity);
                }
                if (instanceCache && entity.getMProcessType().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMProcessType());
                }
            }
        };
        if (!_suppressMCenter && dto.getMCenter() != null) {
            MCenterDto relationDto = dto.getMCenter();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                MCenter relationEntity = (MCenter)cachedEntity;
                entity.setMCenter(relationEntity);
                if (reverseReference) {
                    relationEntity.getTPickingHList().add(entity);
                }
            } else {
                MCenterDtoMapper mapper = new MCenterDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTPickingHList();
                MCenter relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMCenter(relationEntity);
                if (reverseReference) {
                    relationEntity.getTPickingHList().add(entity);
                }
                if (instanceCache && entity.getMCenter().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMCenter());
                }
            }
        };
        if (!_suppressMClient && dto.getMClient() != null) {
            MClientDto relationDto = dto.getMClient();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                MClient relationEntity = (MClient)cachedEntity;
                entity.setMClient(relationEntity);
                if (reverseReference) {
                    relationEntity.getTPickingHList().add(entity);
                }
            } else {
                MClientDtoMapper mapper = new MClientDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTPickingHList();
                MClient relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMClient(relationEntity);
                if (reverseReference) {
                    relationEntity.getTPickingHList().add(entity);
                }
                if (instanceCache && entity.getMClient().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMClient());
                }
            }
        };
        if (!_suppressTAllocInstH && dto.getTAllocInstH() != null) {
            TAllocInstHDto relationDto = dto.getTAllocInstH();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                TAllocInstH relationEntity = (TAllocInstH)cachedEntity;
                entity.setTAllocInstH(relationEntity);
                if (reverseReference) {
                    relationEntity.getTPickingHList().add(entity);
                }
            } else {
                TAllocInstHDtoMapper mapper = new TAllocInstHDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTPickingHList();
                TAllocInstH relationEntity = mapper.mappingToEntity(relationDto);
                entity.setTAllocInstH(relationEntity);
                if (reverseReference) {
                    relationEntity.getTPickingHList().add(entity);
                }
                if (instanceCache && entity.getTAllocInstH().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getTAllocInstH());
                }
            }
        };
        if (!_suppressBClassDtlByCenterTransitFlg && dto.getBClassDtlByCenterTransitFlg() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByCenterTransitFlg();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByCenterTransitFlg(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByCenterTransitFlg(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByCenterTransitFlg().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByCenterTransitFlg());
                }
            }
        };
        if (!_suppressBClassDtlByForceFixedFlg && dto.getBClassDtlByForceFixedFlg() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByForceFixedFlg();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByForceFixedFlg(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByForceFixedFlg(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByForceFixedFlg().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByForceFixedFlg());
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
        if (!_suppressBClassDtlByPickingStatus && dto.getBClassDtlByPickingStatus() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByPickingStatus();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByPickingStatus(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByPickingStatus(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByPickingStatus().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByPickingStatus());
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
        if (!_suppressTPackingHList && !dto.getTPackingHList().isEmpty()) {
            TPackingHDtoMapper mapper = new TPackingHDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressTPickingH();
            List<TPackingH> relationEntityList = mapper.mappingToEntityList(dto.getTPackingHList());
            entity.setTPackingHList(relationEntityList);
            if (reverseReference) {
                for (TPackingH relationEntity : relationEntityList) {
                    relationEntity.setTPickingH(entity);
                }
            }
        };
        if (!_suppressTPickingBList && !dto.getTPickingBList().isEmpty()) {
            TPickingBDtoMapper mapper = new TPickingBDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressTPickingH();
            List<TPickingB> relationEntityList = mapper.mappingToEntityList(dto.getTPickingBList());
            entity.setTPickingBList(relationEntityList);
            if (reverseReference) {
                for (TPickingB relationEntity : relationEntityList) {
                    relationEntity.setTPickingH(entity);
                }
            }
        };
        if (!_suppressTPickingRAsOne && dto.getTPickingRAsOne() != null) {
            TPickingRDto relationDto = dto.getTPickingRAsOne();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                TPickingR relationEntity = (TPickingR)cachedEntity;
                entity.setTPickingRAsOne(relationEntity);
                if (reverseReference) {
                    relationEntity.setTPickingH(entity);
                }
            } else {
                TPickingRDtoMapper mapper = new TPickingRDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTPickingH();
                TPickingR relationEntity = mapper.mappingToEntity(relationDto);
                entity.setTPickingRAsOne(relationEntity);
                if (reverseReference) {
                    relationEntity.setTPickingH(entity);
                }
                if (instanceCache && entity.getTPickingRAsOne().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getTPickingRAsOne());
                }
            }
        };
        if (!_suppressTPicMthdRcmdDataList && !dto.getTPicMthdRcmdDataList().isEmpty()) {
            TPicMthdRcmdDataDtoMapper mapper = new TPicMthdRcmdDataDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressTPickingH();
            List<TPicMthdRcmdData> relationEntityList = mapper.mappingToEntityList(dto.getTPicMthdRcmdDataList());
            entity.setTPicMthdRcmdDataList(relationEntityList);
            if (reverseReference) {
                for (TPicMthdRcmdData relationEntity : relationEntityList) {
                    relationEntity.setTPickingH(entity);
                }
            }
        };
        if (!_suppressTReceivePlanHList && !dto.getTReceivePlanHList().isEmpty()) {
            TReceivePlanHDtoMapper mapper = new TReceivePlanHDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressTPickingH();
            List<TReceivePlanH> relationEntityList = mapper.mappingToEntityList(dto.getTReceivePlanHList());
            entity.setTReceivePlanHList(relationEntityList);
            if (reverseReference) {
                for (TReceivePlanH relationEntity : relationEntityList) {
                    relationEntity.setTPickingH(entity);
                }
            }
        };
        if (!_suppressWSglRowShipInspBList && !dto.getWSglRowShipInspBList().isEmpty()) {
            WSglRowShipInspBDtoMapper mapper = new WSglRowShipInspBDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressTPickingH();
            List<WSglRowShipInspB> relationEntityList = mapper.mappingToEntityList(dto.getWSglRowShipInspBList());
            entity.setWSglRowShipInspBList(relationEntityList);
            if (reverseReference) {
                for (WSglRowShipInspB relationEntity : relationEntityList) {
                    relationEntity.setTPickingH(entity);
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
    protected boolean needsMapping(TPickingHDto dto, Object value, String propName) {
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
    public List<TPickingH> mappingToEntityList(List<TPickingHDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<TPickingH> entityList = new ArrayList<TPickingH>();
        for (TPickingHDto dto : dtoList) {
            TPickingH entity = mappingToEntity(dto);
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
    public void suppressMProcessType() {
        _suppressMProcessType = true;
    }
    public void suppressMCenter() {
        _suppressMCenter = true;
    }
    public void suppressMClient() {
        _suppressMClient = true;
    }
    public void suppressTAllocInstH() {
        _suppressTAllocInstH = true;
    }
    public void suppressBClassDtlByCenterTransitFlg() {
        _suppressBClassDtlByCenterTransitFlg = true;
    }
    public void suppressBClassDtlByForceFixedFlg() {
        _suppressBClassDtlByForceFixedFlg = true;
    }
    public void suppressBClassDtlByPackingCalCls() {
        _suppressBClassDtlByPackingCalCls = true;
    }
    public void suppressBClassDtlByPickingStatus() {
        _suppressBClassDtlByPickingStatus = true;
    }
    public void suppressBClassDtlBySglRowPicFlg() {
        _suppressBClassDtlBySglRowPicFlg = true;
    }
    public void suppressTPackingHList() {
        _suppressTPackingHList = true;
    }
    public void suppressTPickingBList() {
        _suppressTPickingBList = true;
    }
    public void suppressTPickingRAsOne() {
        _suppressTPickingRAsOne = true;
    }
    public void suppressTPicMthdRcmdDataList() {
        _suppressTPicMthdRcmdDataList = true;
    }
    public void suppressTReceivePlanHList() {
        _suppressTReceivePlanHList = true;
    }
    public void suppressWSglRowShipInspBList() {
        _suppressWSglRowShipInspBList = true;
    }
    protected void doSuppressAll() { // internal
        suppressMProcessType();
        suppressMCenter();
        suppressMClient();
        suppressTAllocInstH();
        suppressBClassDtlByCenterTransitFlg();
        suppressBClassDtlByForceFixedFlg();
        suppressBClassDtlByPackingCalCls();
        suppressBClassDtlByPickingStatus();
        suppressBClassDtlBySglRowPicFlg();
        suppressTPackingHList();
        suppressTPickingBList();
        suppressTPickingRAsOne();
        suppressTPicMthdRcmdDataList();
        suppressTReceivePlanHList();
        suppressWSglRowShipInspBList();
    }
    protected void doSuppressClear() { // internal
        _suppressMProcessType = false;
        _suppressMCenter = false;
        _suppressMClient = false;
        _suppressTAllocInstH = false;
        _suppressBClassDtlByCenterTransitFlg = false;
        _suppressBClassDtlByForceFixedFlg = false;
        _suppressBClassDtlByPackingCalCls = false;
        _suppressBClassDtlByPickingStatus = false;
        _suppressBClassDtlBySglRowPicFlg = false;
        _suppressTPackingHList = false;
        _suppressTPickingBList = false;
        _suppressTPickingRAsOne = false;
        _suppressTPicMthdRcmdDataList = false;
        _suppressTReceivePlanHList = false;
        _suppressWSglRowShipInspBList = false;
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
    public TPickingHDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (TPickingHDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public TPickingHDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (TPickingHDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public TPickingHDtoMapper reverseReference() {
        setReverseReference(true);
        return (TPickingHDtoMapper)this;
    }
}
