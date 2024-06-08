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
 * The DTO mapper of M_PROCESS_TYPE as TABLE. <br>
 * 処理区分マスタ
 * <pre>
 * [primary-key]
 *     PROCESS_TYPE_ID
 *
 * [column]
 *     PROCESS_TYPE_ID, PROCESS_TYPE_CD, DICT_ID, RECEIVE_FLG, SHIPPING_FLG, STOCK_ADJUST_FLG, DEFAULT_FLG, STOCK_TYPE_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PROCESS_TYPE_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     B_DICT, M_STOCK_TYPE, V_DICT, B_CLASS_DTL(ByReceiveFlg)
 *
 * [referrer-table]
 *     H_MOVE_H, H_RECEIVE_H, H_SHIPPING_H, H_STOCK_INOUT, T_ALLOC_INST_H, T_MOVE_INST_H, T_PACKING_H, T_PICKING_H, T_RECEIVE_PLAN_H, T_SHIPPING_INST_H, T_STOCK_INOUT, T_STORE_RECORD_H, W_HT_RECEIVE_NO_PLAN_INSP
 *
 * [foreign-property]
 *     bDict, mStockType, vDict, bClassDtlByReceiveFlg, bClassDtlByShippingFlg, bClassDtlByStockAdjustFlg
 *
 * [referrer-property]
 *     hMoveHList, hReceiveHList, hShippingHList, hStockInoutList, tAllocInstHList, tMoveInstHList, tPackingHList, tPickingHList, tReceivePlanHList, tShippingInstHList, tStockInoutList, tStoreRecordHList, wHtReceiveNoPlanInspList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsMProcessTypeDtoMapper implements DtoMapper<MProcessType, MProcessTypeDto>, Serializable {

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
    protected boolean _suppressBDict;
    protected boolean _suppressMStockType;
    protected boolean _suppressVDict;
    protected boolean _suppressBClassDtlByReceiveFlg;
    protected boolean _suppressBClassDtlByShippingFlg;
    protected boolean _suppressBClassDtlByStockAdjustFlg;
    protected boolean _suppressHMoveHList;
    protected boolean _suppressHReceiveHList;
    protected boolean _suppressHShippingHList;
    protected boolean _suppressHStockInoutList;
    protected boolean _suppressTAllocInstHList;
    protected boolean _suppressTMoveInstHList;
    protected boolean _suppressTPackingHList;
    protected boolean _suppressTPickingHList;
    protected boolean _suppressTReceivePlanHList;
    protected boolean _suppressTShippingInstHList;
    protected boolean _suppressTStockInoutList;
    protected boolean _suppressTStoreRecordHList;
    protected boolean _suppressWHtReceiveNoPlanInspList;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMProcessTypeDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsMProcessTypeDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public MProcessTypeDto mappingToDto(MProcessType entity) {
        if (entity == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Entity localKey = createInstanceKeyEntity(entity);
        Object cachedLocalDto = instanceCache ? _relationDtoMap.get(localKey) : null;
        if (cachedLocalDto != null) {
            return (MProcessTypeDto)cachedLocalDto;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        MProcessTypeDto dto = new MProcessTypeDto();
        dto.setProcessTypeId(entity.getProcessTypeId());
        dto.setProcessTypeCd(entity.getProcessTypeCd());
        dto.setDictId(entity.getDictId());
        dto.setReceiveFlg(entity.getReceiveFlg());
        dto.setShippingFlg(entity.getShippingFlg());
        dto.setStockAdjustFlg(entity.getStockAdjustFlg());
        dto.setDefaultFlg(entity.getDefaultFlg());
        dto.setStockTypeId(entity.getStockTypeId());
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
        if (!_suppressBDict && entity.getBDict() != null) {
            BDict relationEntity = entity.getBDict();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BDictDto relationDto = (BDictDto)cachedDto;
                dto.setBDict(relationDto);
                if (reverseReference) {
                    relationDto.getMProcessTypeList().add(dto);
                }
            } else {
                BDictDtoMapper mapper = new BDictDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressMProcessTypeList();
                BDictDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBDict(relationDto);
                if (reverseReference) {
                    relationDto.getMProcessTypeList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBDict());
                }
            }
        };
        if (!_suppressMStockType && entity.getMStockType() != null) {
            MStockType relationEntity = entity.getMStockType();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                MStockTypeDto relationDto = (MStockTypeDto)cachedDto;
                dto.setMStockType(relationDto);
                if (reverseReference) {
                    relationDto.getMProcessTypeList().add(dto);
                }
            } else {
                MStockTypeDtoMapper mapper = new MStockTypeDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressMProcessTypeList();
                MStockTypeDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMStockType(relationDto);
                if (reverseReference) {
                    relationDto.getMProcessTypeList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMStockType());
                }
            }
        };
        if (!_suppressVDict && entity.getVDict() != null) {
            VDict relationEntity = entity.getVDict();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                VDictDto relationDto = (VDictDto)cachedDto;
                dto.setVDict(relationDto);
                if (reverseReference) {
                }
            } else {
                VDictDtoMapper mapper = new VDictDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                VDictDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setVDict(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getVDict());
                }
            }
        };
        if (!_suppressBClassDtlByReceiveFlg && entity.getBClassDtlByReceiveFlg() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByReceiveFlg();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByReceiveFlg(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByReceiveFlg(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByReceiveFlg());
                }
            }
        };
        if (!_suppressBClassDtlByShippingFlg && entity.getBClassDtlByShippingFlg() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByShippingFlg();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByShippingFlg(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByShippingFlg(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByShippingFlg());
                }
            }
        };
        if (!_suppressBClassDtlByStockAdjustFlg && entity.getBClassDtlByStockAdjustFlg() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByStockAdjustFlg();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByStockAdjustFlg(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByStockAdjustFlg(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByStockAdjustFlg());
                }
            }
        };
        if (!_suppressHMoveHList && !entity.getHMoveHList().isEmpty()) {
            HMoveHDtoMapper mapper = new HMoveHDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMProcessType();
            List<HMoveHDto> relationDtoList = mapper.mappingToDtoList(entity.getHMoveHList());
            dto.setHMoveHList(relationDtoList);
            if (reverseReference) {
                for (HMoveHDto relationDto : relationDtoList) {
                    relationDto.setMProcessType(dto);
                }
            }
        };
        if (!_suppressHReceiveHList && !entity.getHReceiveHList().isEmpty()) {
            HReceiveHDtoMapper mapper = new HReceiveHDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMProcessType();
            List<HReceiveHDto> relationDtoList = mapper.mappingToDtoList(entity.getHReceiveHList());
            dto.setHReceiveHList(relationDtoList);
            if (reverseReference) {
                for (HReceiveHDto relationDto : relationDtoList) {
                    relationDto.setMProcessType(dto);
                }
            }
        };
        if (!_suppressHShippingHList && !entity.getHShippingHList().isEmpty()) {
            HShippingHDtoMapper mapper = new HShippingHDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMProcessType();
            List<HShippingHDto> relationDtoList = mapper.mappingToDtoList(entity.getHShippingHList());
            dto.setHShippingHList(relationDtoList);
            if (reverseReference) {
                for (HShippingHDto relationDto : relationDtoList) {
                    relationDto.setMProcessType(dto);
                }
            }
        };
        if (!_suppressHStockInoutList && !entity.getHStockInoutList().isEmpty()) {
            HStockInoutDtoMapper mapper = new HStockInoutDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMProcessType();
            List<HStockInoutDto> relationDtoList = mapper.mappingToDtoList(entity.getHStockInoutList());
            dto.setHStockInoutList(relationDtoList);
            if (reverseReference) {
                for (HStockInoutDto relationDto : relationDtoList) {
                    relationDto.setMProcessType(dto);
                }
            }
        };
        if (!_suppressTAllocInstHList && !entity.getTAllocInstHList().isEmpty()) {
            TAllocInstHDtoMapper mapper = new TAllocInstHDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMProcessType();
            List<TAllocInstHDto> relationDtoList = mapper.mappingToDtoList(entity.getTAllocInstHList());
            dto.setTAllocInstHList(relationDtoList);
            if (reverseReference) {
                for (TAllocInstHDto relationDto : relationDtoList) {
                    relationDto.setMProcessType(dto);
                }
            }
        };
        if (!_suppressTMoveInstHList && !entity.getTMoveInstHList().isEmpty()) {
            TMoveInstHDtoMapper mapper = new TMoveInstHDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMProcessType();
            List<TMoveInstHDto> relationDtoList = mapper.mappingToDtoList(entity.getTMoveInstHList());
            dto.setTMoveInstHList(relationDtoList);
            if (reverseReference) {
                for (TMoveInstHDto relationDto : relationDtoList) {
                    relationDto.setMProcessType(dto);
                }
            }
        };
        if (!_suppressTPackingHList && !entity.getTPackingHList().isEmpty()) {
            TPackingHDtoMapper mapper = new TPackingHDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMProcessType();
            List<TPackingHDto> relationDtoList = mapper.mappingToDtoList(entity.getTPackingHList());
            dto.setTPackingHList(relationDtoList);
            if (reverseReference) {
                for (TPackingHDto relationDto : relationDtoList) {
                    relationDto.setMProcessType(dto);
                }
            }
        };
        if (!_suppressTPickingHList && !entity.getTPickingHList().isEmpty()) {
            TPickingHDtoMapper mapper = new TPickingHDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMProcessType();
            List<TPickingHDto> relationDtoList = mapper.mappingToDtoList(entity.getTPickingHList());
            dto.setTPickingHList(relationDtoList);
            if (reverseReference) {
                for (TPickingHDto relationDto : relationDtoList) {
                    relationDto.setMProcessType(dto);
                }
            }
        };
        if (!_suppressTReceivePlanHList && !entity.getTReceivePlanHList().isEmpty()) {
            TReceivePlanHDtoMapper mapper = new TReceivePlanHDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMProcessType();
            List<TReceivePlanHDto> relationDtoList = mapper.mappingToDtoList(entity.getTReceivePlanHList());
            dto.setTReceivePlanHList(relationDtoList);
            if (reverseReference) {
                for (TReceivePlanHDto relationDto : relationDtoList) {
                    relationDto.setMProcessType(dto);
                }
            }
        };
        if (!_suppressTShippingInstHList && !entity.getTShippingInstHList().isEmpty()) {
            TShippingInstHDtoMapper mapper = new TShippingInstHDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMProcessType();
            List<TShippingInstHDto> relationDtoList = mapper.mappingToDtoList(entity.getTShippingInstHList());
            dto.setTShippingInstHList(relationDtoList);
            if (reverseReference) {
                for (TShippingInstHDto relationDto : relationDtoList) {
                    relationDto.setMProcessType(dto);
                }
            }
        };
        if (!_suppressTStockInoutList && !entity.getTStockInoutList().isEmpty()) {
            TStockInoutDtoMapper mapper = new TStockInoutDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMProcessType();
            List<TStockInoutDto> relationDtoList = mapper.mappingToDtoList(entity.getTStockInoutList());
            dto.setTStockInoutList(relationDtoList);
            if (reverseReference) {
                for (TStockInoutDto relationDto : relationDtoList) {
                    relationDto.setMProcessType(dto);
                }
            }
        };
        if (!_suppressTStoreRecordHList && !entity.getTStoreRecordHList().isEmpty()) {
            TStoreRecordHDtoMapper mapper = new TStoreRecordHDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMProcessType();
            List<TStoreRecordHDto> relationDtoList = mapper.mappingToDtoList(entity.getTStoreRecordHList());
            dto.setTStoreRecordHList(relationDtoList);
            if (reverseReference) {
                for (TStoreRecordHDto relationDto : relationDtoList) {
                    relationDto.setMProcessType(dto);
                }
            }
        };
        if (!_suppressWHtReceiveNoPlanInspList && !entity.getWHtReceiveNoPlanInspList().isEmpty()) {
            WHtReceiveNoPlanInspDtoMapper mapper = new WHtReceiveNoPlanInspDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMProcessType();
            List<WHtReceiveNoPlanInspDto> relationDtoList = mapper.mappingToDtoList(entity.getWHtReceiveNoPlanInspList());
            dto.setWHtReceiveNoPlanInspList(relationDtoList);
            if (reverseReference) {
                for (WHtReceiveNoPlanInspDto relationDto : relationDtoList) {
                    relationDto.setMProcessType(dto);
                }
            }
        };
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<MProcessTypeDto> mappingToDtoList(List<MProcessType> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<MProcessTypeDto> dtoList = new ArrayList<MProcessTypeDto>();
        for (MProcessType entity : entityList) {
            MProcessTypeDto dto = mappingToDto(entity);
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
    public MProcessType mappingToEntity(MProcessTypeDto dto) {
        if (dto == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Object localKey = createInstanceKeyDto(dto, dto.instanceHash());
        Entity cachedLocalEntity = instanceCache ? _relationEntityMap.get(localKey) : null;
        if (cachedLocalEntity != null) {
            return (MProcessType)cachedLocalEntity;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        MProcessType entity = new MProcessType();
        if (needsMapping(dto, dto.getProcessTypeId(), "processTypeId")) {
            entity.setProcessTypeId(dto.getProcessTypeId());
        }
        if (needsMapping(dto, dto.getProcessTypeCd(), "processTypeCd")) {
            entity.setProcessTypeCd(dto.getProcessTypeCd());
        }
        if (needsMapping(dto, dto.getDictId(), "dictId")) {
            entity.setDictId(dto.getDictId());
        }
        if (needsMapping(dto, dto.getReceiveFlg(), "receiveFlg")) {
            entity.setReceiveFlgAsReceiveFlg(CDef.ReceiveFlg.codeOf(dto.getReceiveFlg()));
        }
        if (needsMapping(dto, dto.getShippingFlg(), "shippingFlg")) {
            entity.setShippingFlgAsShippingFlg(CDef.ShippingFlg.codeOf(dto.getShippingFlg()));
        }
        if (needsMapping(dto, dto.getStockAdjustFlg(), "stockAdjustFlg")) {
            entity.setStockAdjustFlgAsStockAdjustFlg(CDef.StockAdjustFlg.codeOf(dto.getStockAdjustFlg()));
        }
        if (needsMapping(dto, dto.getDefaultFlg(), "defaultFlg")) {
            entity.setDefaultFlg(dto.getDefaultFlg());
        }
        if (needsMapping(dto, dto.getStockTypeId(), "stockTypeId")) {
            entity.setStockTypeId(dto.getStockTypeId());
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
        if (!_suppressBDict && dto.getBDict() != null) {
            BDictDto relationDto = dto.getBDict();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BDict relationEntity = (BDict)cachedEntity;
                entity.setBDict(relationEntity);
                if (reverseReference) {
                    relationEntity.getMProcessTypeList().add(entity);
                }
            } else {
                BDictDtoMapper mapper = new BDictDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressMProcessTypeList();
                BDict relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBDict(relationEntity);
                if (reverseReference) {
                    relationEntity.getMProcessTypeList().add(entity);
                }
                if (instanceCache && entity.getBDict().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBDict());
                }
            }
        };
        if (!_suppressMStockType && dto.getMStockType() != null) {
            MStockTypeDto relationDto = dto.getMStockType();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                MStockType relationEntity = (MStockType)cachedEntity;
                entity.setMStockType(relationEntity);
                if (reverseReference) {
                    relationEntity.getMProcessTypeList().add(entity);
                }
            } else {
                MStockTypeDtoMapper mapper = new MStockTypeDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressMProcessTypeList();
                MStockType relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMStockType(relationEntity);
                if (reverseReference) {
                    relationEntity.getMProcessTypeList().add(entity);
                }
                if (instanceCache && entity.getMStockType().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMStockType());
                }
            }
        };
        if (!_suppressVDict && dto.getVDict() != null) {
            VDictDto relationDto = dto.getVDict();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                VDict relationEntity = (VDict)cachedEntity;
                entity.setVDict(relationEntity);
                if (reverseReference) {
                }
            } else {
                VDictDtoMapper mapper = new VDictDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                VDict relationEntity = mapper.mappingToEntity(relationDto);
                entity.setVDict(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getVDict().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getVDict());
                }
            }
        };
        if (!_suppressBClassDtlByReceiveFlg && dto.getBClassDtlByReceiveFlg() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByReceiveFlg();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByReceiveFlg(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByReceiveFlg(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByReceiveFlg().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByReceiveFlg());
                }
            }
        };
        if (!_suppressBClassDtlByShippingFlg && dto.getBClassDtlByShippingFlg() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByShippingFlg();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByShippingFlg(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByShippingFlg(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByShippingFlg().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByShippingFlg());
                }
            }
        };
        if (!_suppressBClassDtlByStockAdjustFlg && dto.getBClassDtlByStockAdjustFlg() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByStockAdjustFlg();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByStockAdjustFlg(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByStockAdjustFlg(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByStockAdjustFlg().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByStockAdjustFlg());
                }
            }
        };
        if (!_suppressHMoveHList && !dto.getHMoveHList().isEmpty()) {
            HMoveHDtoMapper mapper = new HMoveHDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMProcessType();
            List<HMoveH> relationEntityList = mapper.mappingToEntityList(dto.getHMoveHList());
            entity.setHMoveHList(relationEntityList);
            if (reverseReference) {
                for (HMoveH relationEntity : relationEntityList) {
                    relationEntity.setMProcessType(entity);
                }
            }
        };
        if (!_suppressHReceiveHList && !dto.getHReceiveHList().isEmpty()) {
            HReceiveHDtoMapper mapper = new HReceiveHDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMProcessType();
            List<HReceiveH> relationEntityList = mapper.mappingToEntityList(dto.getHReceiveHList());
            entity.setHReceiveHList(relationEntityList);
            if (reverseReference) {
                for (HReceiveH relationEntity : relationEntityList) {
                    relationEntity.setMProcessType(entity);
                }
            }
        };
        if (!_suppressHShippingHList && !dto.getHShippingHList().isEmpty()) {
            HShippingHDtoMapper mapper = new HShippingHDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMProcessType();
            List<HShippingH> relationEntityList = mapper.mappingToEntityList(dto.getHShippingHList());
            entity.setHShippingHList(relationEntityList);
            if (reverseReference) {
                for (HShippingH relationEntity : relationEntityList) {
                    relationEntity.setMProcessType(entity);
                }
            }
        };
        if (!_suppressHStockInoutList && !dto.getHStockInoutList().isEmpty()) {
            HStockInoutDtoMapper mapper = new HStockInoutDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMProcessType();
            List<HStockInout> relationEntityList = mapper.mappingToEntityList(dto.getHStockInoutList());
            entity.setHStockInoutList(relationEntityList);
            if (reverseReference) {
                for (HStockInout relationEntity : relationEntityList) {
                    relationEntity.setMProcessType(entity);
                }
            }
        };
        if (!_suppressTAllocInstHList && !dto.getTAllocInstHList().isEmpty()) {
            TAllocInstHDtoMapper mapper = new TAllocInstHDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMProcessType();
            List<TAllocInstH> relationEntityList = mapper.mappingToEntityList(dto.getTAllocInstHList());
            entity.setTAllocInstHList(relationEntityList);
            if (reverseReference) {
                for (TAllocInstH relationEntity : relationEntityList) {
                    relationEntity.setMProcessType(entity);
                }
            }
        };
        if (!_suppressTMoveInstHList && !dto.getTMoveInstHList().isEmpty()) {
            TMoveInstHDtoMapper mapper = new TMoveInstHDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMProcessType();
            List<TMoveInstH> relationEntityList = mapper.mappingToEntityList(dto.getTMoveInstHList());
            entity.setTMoveInstHList(relationEntityList);
            if (reverseReference) {
                for (TMoveInstH relationEntity : relationEntityList) {
                    relationEntity.setMProcessType(entity);
                }
            }
        };
        if (!_suppressTPackingHList && !dto.getTPackingHList().isEmpty()) {
            TPackingHDtoMapper mapper = new TPackingHDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMProcessType();
            List<TPackingH> relationEntityList = mapper.mappingToEntityList(dto.getTPackingHList());
            entity.setTPackingHList(relationEntityList);
            if (reverseReference) {
                for (TPackingH relationEntity : relationEntityList) {
                    relationEntity.setMProcessType(entity);
                }
            }
        };
        if (!_suppressTPickingHList && !dto.getTPickingHList().isEmpty()) {
            TPickingHDtoMapper mapper = new TPickingHDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMProcessType();
            List<TPickingH> relationEntityList = mapper.mappingToEntityList(dto.getTPickingHList());
            entity.setTPickingHList(relationEntityList);
            if (reverseReference) {
                for (TPickingH relationEntity : relationEntityList) {
                    relationEntity.setMProcessType(entity);
                }
            }
        };
        if (!_suppressTReceivePlanHList && !dto.getTReceivePlanHList().isEmpty()) {
            TReceivePlanHDtoMapper mapper = new TReceivePlanHDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMProcessType();
            List<TReceivePlanH> relationEntityList = mapper.mappingToEntityList(dto.getTReceivePlanHList());
            entity.setTReceivePlanHList(relationEntityList);
            if (reverseReference) {
                for (TReceivePlanH relationEntity : relationEntityList) {
                    relationEntity.setMProcessType(entity);
                }
            }
        };
        if (!_suppressTShippingInstHList && !dto.getTShippingInstHList().isEmpty()) {
            TShippingInstHDtoMapper mapper = new TShippingInstHDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMProcessType();
            List<TShippingInstH> relationEntityList = mapper.mappingToEntityList(dto.getTShippingInstHList());
            entity.setTShippingInstHList(relationEntityList);
            if (reverseReference) {
                for (TShippingInstH relationEntity : relationEntityList) {
                    relationEntity.setMProcessType(entity);
                }
            }
        };
        if (!_suppressTStockInoutList && !dto.getTStockInoutList().isEmpty()) {
            TStockInoutDtoMapper mapper = new TStockInoutDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMProcessType();
            List<TStockInout> relationEntityList = mapper.mappingToEntityList(dto.getTStockInoutList());
            entity.setTStockInoutList(relationEntityList);
            if (reverseReference) {
                for (TStockInout relationEntity : relationEntityList) {
                    relationEntity.setMProcessType(entity);
                }
            }
        };
        if (!_suppressTStoreRecordHList && !dto.getTStoreRecordHList().isEmpty()) {
            TStoreRecordHDtoMapper mapper = new TStoreRecordHDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMProcessType();
            List<TStoreRecordH> relationEntityList = mapper.mappingToEntityList(dto.getTStoreRecordHList());
            entity.setTStoreRecordHList(relationEntityList);
            if (reverseReference) {
                for (TStoreRecordH relationEntity : relationEntityList) {
                    relationEntity.setMProcessType(entity);
                }
            }
        };
        if (!_suppressWHtReceiveNoPlanInspList && !dto.getWHtReceiveNoPlanInspList().isEmpty()) {
            WHtReceiveNoPlanInspDtoMapper mapper = new WHtReceiveNoPlanInspDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMProcessType();
            List<WHtReceiveNoPlanInsp> relationEntityList = mapper.mappingToEntityList(dto.getWHtReceiveNoPlanInspList());
            entity.setWHtReceiveNoPlanInspList(relationEntityList);
            if (reverseReference) {
                for (WHtReceiveNoPlanInsp relationEntity : relationEntityList) {
                    relationEntity.setMProcessType(entity);
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
    protected boolean needsMapping(MProcessTypeDto dto, Object value, String propName) {
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
    public List<MProcessType> mappingToEntityList(List<MProcessTypeDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<MProcessType> entityList = new ArrayList<MProcessType>();
        for (MProcessTypeDto dto : dtoList) {
            MProcessType entity = mappingToEntity(dto);
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
    public void suppressBDict() {
        _suppressBDict = true;
    }
    public void suppressMStockType() {
        _suppressMStockType = true;
    }
    public void suppressVDict() {
        _suppressVDict = true;
    }
    public void suppressBClassDtlByReceiveFlg() {
        _suppressBClassDtlByReceiveFlg = true;
    }
    public void suppressBClassDtlByShippingFlg() {
        _suppressBClassDtlByShippingFlg = true;
    }
    public void suppressBClassDtlByStockAdjustFlg() {
        _suppressBClassDtlByStockAdjustFlg = true;
    }
    public void suppressHMoveHList() {
        _suppressHMoveHList = true;
    }
    public void suppressHReceiveHList() {
        _suppressHReceiveHList = true;
    }
    public void suppressHShippingHList() {
        _suppressHShippingHList = true;
    }
    public void suppressHStockInoutList() {
        _suppressHStockInoutList = true;
    }
    public void suppressTAllocInstHList() {
        _suppressTAllocInstHList = true;
    }
    public void suppressTMoveInstHList() {
        _suppressTMoveInstHList = true;
    }
    public void suppressTPackingHList() {
        _suppressTPackingHList = true;
    }
    public void suppressTPickingHList() {
        _suppressTPickingHList = true;
    }
    public void suppressTReceivePlanHList() {
        _suppressTReceivePlanHList = true;
    }
    public void suppressTShippingInstHList() {
        _suppressTShippingInstHList = true;
    }
    public void suppressTStockInoutList() {
        _suppressTStockInoutList = true;
    }
    public void suppressTStoreRecordHList() {
        _suppressTStoreRecordHList = true;
    }
    public void suppressWHtReceiveNoPlanInspList() {
        _suppressWHtReceiveNoPlanInspList = true;
    }
    protected void doSuppressAll() { // internal
        suppressBDict();
        suppressMStockType();
        suppressVDict();
        suppressBClassDtlByReceiveFlg();
        suppressBClassDtlByShippingFlg();
        suppressBClassDtlByStockAdjustFlg();
        suppressHMoveHList();
        suppressHReceiveHList();
        suppressHShippingHList();
        suppressHStockInoutList();
        suppressTAllocInstHList();
        suppressTMoveInstHList();
        suppressTPackingHList();
        suppressTPickingHList();
        suppressTReceivePlanHList();
        suppressTShippingInstHList();
        suppressTStockInoutList();
        suppressTStoreRecordHList();
        suppressWHtReceiveNoPlanInspList();
    }
    protected void doSuppressClear() { // internal
        _suppressBDict = false;
        _suppressMStockType = false;
        _suppressVDict = false;
        _suppressBClassDtlByReceiveFlg = false;
        _suppressBClassDtlByShippingFlg = false;
        _suppressBClassDtlByStockAdjustFlg = false;
        _suppressHMoveHList = false;
        _suppressHReceiveHList = false;
        _suppressHShippingHList = false;
        _suppressHStockInoutList = false;
        _suppressTAllocInstHList = false;
        _suppressTMoveInstHList = false;
        _suppressTPackingHList = false;
        _suppressTPickingHList = false;
        _suppressTReceivePlanHList = false;
        _suppressTShippingInstHList = false;
        _suppressTStockInoutList = false;
        _suppressTStoreRecordHList = false;
        _suppressWHtReceiveNoPlanInspList = false;
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
    public MProcessTypeDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (MProcessTypeDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public MProcessTypeDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (MProcessTypeDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public MProcessTypeDtoMapper reverseReference() {
        setReverseReference(true);
        return (MProcessTypeDtoMapper)this;
    }
}
