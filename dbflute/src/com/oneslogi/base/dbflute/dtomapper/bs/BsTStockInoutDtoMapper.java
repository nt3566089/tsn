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
 * The DTO mapper of T_STOCK_INOUT as TABLE. <br>
 * 在庫受払
 * <pre>
 * [primary-key]
 *     STOCK_INOUT_ID
 *
 * [column]
 *     STOCK_INOUT_ID, FS_STOCK_INOUT_ID, BF_STOCK_INOUT_ID, MOVE_RECORD_B_ID, STORE_RECORD_B_ID, ALLOC_INST_B_ID, PROCESS_DT, PROCESS_TYPE_ID, PROCESS_NO, CORRECT_TYPE, STOCK_ID, INOUT_TYPE, STOCK_INOUT_NUM, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     STOCK_INOUT_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     T_ALLOC_INST_B, T_STOCK_INOUT, T_STORE_RECORD_B, M_PROCESS_TYPE, T_MOVE_RECORD_B, T_STOCK, B_CLASS_DTL(ByCorrectType)
 *
 * [referrer-table]
 *     T_STOCK_INOUT
 *
 * [foreign-property]
 *     tAllocInstB, tStockInoutByFsStockInoutIdSelf, tStoreRecordB, mProcessType, tMoveRecordB, tStock, tStockInoutByBfStockInoutIdSelf, bClassDtlByCorrectType, bClassDtlByInoutType
 *
 * [referrer-property]
 *     tStockInoutByFsStockInoutIdSelfList, tStockInoutByBfStockInoutIdSelfList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsTStockInoutDtoMapper implements DtoMapper<TStockInout, TStockInoutDto>, Serializable {

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
    protected boolean _suppressTAllocInstB;
    protected boolean _suppressTStockInoutByFsStockInoutIdSelf;
    protected boolean _suppressTStoreRecordB;
    protected boolean _suppressMProcessType;
    protected boolean _suppressTMoveRecordB;
    protected boolean _suppressTStock;
    protected boolean _suppressTStockInoutByBfStockInoutIdSelf;
    protected boolean _suppressBClassDtlByCorrectType;
    protected boolean _suppressBClassDtlByInoutType;
    protected boolean _suppressTStockInoutByFsStockInoutIdSelfList;
    protected boolean _suppressTStockInoutByBfStockInoutIdSelfList;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTStockInoutDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsTStockInoutDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public TStockInoutDto mappingToDto(TStockInout entity) {
        if (entity == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Entity localKey = createInstanceKeyEntity(entity);
        Object cachedLocalDto = instanceCache ? _relationDtoMap.get(localKey) : null;
        if (cachedLocalDto != null) {
            return (TStockInoutDto)cachedLocalDto;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        TStockInoutDto dto = new TStockInoutDto();
        dto.setStockInoutId(entity.getStockInoutId());
        dto.setFsStockInoutId(entity.getFsStockInoutId());
        dto.setBfStockInoutId(entity.getBfStockInoutId());
        dto.setMoveRecordBId(entity.getMoveRecordBId());
        dto.setStoreRecordBId(entity.getStoreRecordBId());
        dto.setAllocInstBId(entity.getAllocInstBId());
        dto.setProcessDt(entity.getProcessDt());
        dto.setProcessTypeId(entity.getProcessTypeId());
        dto.setProcessNo(entity.getProcessNo());
        dto.setCorrectType(entity.getCorrectType());
        dto.setStockId(entity.getStockId());
        dto.setInoutType(entity.getInoutType());
        dto.setStockInoutNum(entity.getStockInoutNum());
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
        if (!_suppressTAllocInstB && entity.getTAllocInstB() != null) {
            TAllocInstB relationEntity = entity.getTAllocInstB();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                TAllocInstBDto relationDto = (TAllocInstBDto)cachedDto;
                dto.setTAllocInstB(relationDto);
                if (reverseReference) {
                    relationDto.getTStockInoutList().add(dto);
                }
            } else {
                TAllocInstBDtoMapper mapper = new TAllocInstBDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTStockInoutList();
                TAllocInstBDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setTAllocInstB(relationDto);
                if (reverseReference) {
                    relationDto.getTStockInoutList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getTAllocInstB());
                }
            }
        };
        if (!_suppressTStockInoutByFsStockInoutIdSelf && entity.getTStockInoutByFsStockInoutIdSelf() != null) {
            TStockInout relationEntity = entity.getTStockInoutByFsStockInoutIdSelf();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                TStockInoutDto relationDto = (TStockInoutDto)cachedDto;
                dto.setTStockInoutByFsStockInoutIdSelf(relationDto);
                if (reverseReference) {
                    relationDto.getTStockInoutByFsStockInoutIdSelfList().add(dto);
                }
            } else {
                TStockInoutDtoMapper mapper = new TStockInoutDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTStockInoutByFsStockInoutIdSelfList();
                TStockInoutDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setTStockInoutByFsStockInoutIdSelf(relationDto);
                if (reverseReference) {
                    relationDto.getTStockInoutByFsStockInoutIdSelfList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getTStockInoutByFsStockInoutIdSelf());
                }
            }
        };
        if (!_suppressTStoreRecordB && entity.getTStoreRecordB() != null) {
            TStoreRecordB relationEntity = entity.getTStoreRecordB();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                TStoreRecordBDto relationDto = (TStoreRecordBDto)cachedDto;
                dto.setTStoreRecordB(relationDto);
                if (reverseReference) {
                    relationDto.getTStockInoutList().add(dto);
                }
            } else {
                TStoreRecordBDtoMapper mapper = new TStoreRecordBDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTStockInoutList();
                TStoreRecordBDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setTStoreRecordB(relationDto);
                if (reverseReference) {
                    relationDto.getTStockInoutList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getTStoreRecordB());
                }
            }
        };
        if (!_suppressMProcessType && entity.getMProcessType() != null) {
            MProcessType relationEntity = entity.getMProcessType();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                MProcessTypeDto relationDto = (MProcessTypeDto)cachedDto;
                dto.setMProcessType(relationDto);
                if (reverseReference) {
                    relationDto.getTStockInoutList().add(dto);
                }
            } else {
                MProcessTypeDtoMapper mapper = new MProcessTypeDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTStockInoutList();
                MProcessTypeDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMProcessType(relationDto);
                if (reverseReference) {
                    relationDto.getTStockInoutList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMProcessType());
                }
            }
        };
        if (!_suppressTMoveRecordB && entity.getTMoveRecordB() != null) {
            TMoveRecordB relationEntity = entity.getTMoveRecordB();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                TMoveRecordBDto relationDto = (TMoveRecordBDto)cachedDto;
                dto.setTMoveRecordB(relationDto);
                if (reverseReference) {
                    relationDto.getTStockInoutList().add(dto);
                }
            } else {
                TMoveRecordBDtoMapper mapper = new TMoveRecordBDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTStockInoutList();
                TMoveRecordBDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setTMoveRecordB(relationDto);
                if (reverseReference) {
                    relationDto.getTStockInoutList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getTMoveRecordB());
                }
            }
        };
        if (!_suppressTStock && entity.getTStock() != null) {
            TStock relationEntity = entity.getTStock();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                TStockDto relationDto = (TStockDto)cachedDto;
                dto.setTStock(relationDto);
                if (reverseReference) {
                    relationDto.getTStockInoutList().add(dto);
                }
            } else {
                TStockDtoMapper mapper = new TStockDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTStockInoutList();
                TStockDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setTStock(relationDto);
                if (reverseReference) {
                    relationDto.getTStockInoutList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getTStock());
                }
            }
        };
        if (!_suppressTStockInoutByBfStockInoutIdSelf && entity.getTStockInoutByBfStockInoutIdSelf() != null) {
            TStockInout relationEntity = entity.getTStockInoutByBfStockInoutIdSelf();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                TStockInoutDto relationDto = (TStockInoutDto)cachedDto;
                dto.setTStockInoutByBfStockInoutIdSelf(relationDto);
                if (reverseReference) {
                    relationDto.getTStockInoutByBfStockInoutIdSelfList().add(dto);
                }
            } else {
                TStockInoutDtoMapper mapper = new TStockInoutDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTStockInoutByBfStockInoutIdSelfList();
                TStockInoutDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setTStockInoutByBfStockInoutIdSelf(relationDto);
                if (reverseReference) {
                    relationDto.getTStockInoutByBfStockInoutIdSelfList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getTStockInoutByBfStockInoutIdSelf());
                }
            }
        };
        if (!_suppressBClassDtlByCorrectType && entity.getBClassDtlByCorrectType() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByCorrectType();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByCorrectType(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByCorrectType(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByCorrectType());
                }
            }
        };
        if (!_suppressBClassDtlByInoutType && entity.getBClassDtlByInoutType() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByInoutType();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByInoutType(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByInoutType(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByInoutType());
                }
            }
        };
        if (!_suppressTStockInoutByFsStockInoutIdSelfList && !entity.getTStockInoutByFsStockInoutIdSelfList().isEmpty()) {
            TStockInoutDtoMapper mapper = new TStockInoutDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressTStockInoutByFsStockInoutIdSelf();
            List<TStockInoutDto> relationDtoList = mapper.mappingToDtoList(entity.getTStockInoutByFsStockInoutIdSelfList());
            dto.setTStockInoutByFsStockInoutIdSelfList(relationDtoList);
            if (reverseReference) {
                for (TStockInoutDto relationDto : relationDtoList) {
                    relationDto.setTStockInoutByFsStockInoutIdSelf(dto);
                }
            }
        };
        if (!_suppressTStockInoutByBfStockInoutIdSelfList && !entity.getTStockInoutByBfStockInoutIdSelfList().isEmpty()) {
            TStockInoutDtoMapper mapper = new TStockInoutDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressTStockInoutByBfStockInoutIdSelf();
            List<TStockInoutDto> relationDtoList = mapper.mappingToDtoList(entity.getTStockInoutByBfStockInoutIdSelfList());
            dto.setTStockInoutByBfStockInoutIdSelfList(relationDtoList);
            if (reverseReference) {
                for (TStockInoutDto relationDto : relationDtoList) {
                    relationDto.setTStockInoutByBfStockInoutIdSelf(dto);
                }
            }
        };
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<TStockInoutDto> mappingToDtoList(List<TStockInout> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<TStockInoutDto> dtoList = new ArrayList<TStockInoutDto>();
        for (TStockInout entity : entityList) {
            TStockInoutDto dto = mappingToDto(entity);
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
    public TStockInout mappingToEntity(TStockInoutDto dto) {
        if (dto == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Object localKey = createInstanceKeyDto(dto, dto.instanceHash());
        Entity cachedLocalEntity = instanceCache ? _relationEntityMap.get(localKey) : null;
        if (cachedLocalEntity != null) {
            return (TStockInout)cachedLocalEntity;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        TStockInout entity = new TStockInout();
        if (needsMapping(dto, dto.getStockInoutId(), "stockInoutId")) {
            entity.setStockInoutId(dto.getStockInoutId());
        }
        if (needsMapping(dto, dto.getFsStockInoutId(), "fsStockInoutId")) {
            entity.setFsStockInoutId(dto.getFsStockInoutId());
        }
        if (needsMapping(dto, dto.getBfStockInoutId(), "bfStockInoutId")) {
            entity.setBfStockInoutId(dto.getBfStockInoutId());
        }
        if (needsMapping(dto, dto.getMoveRecordBId(), "moveRecordBId")) {
            entity.setMoveRecordBId(dto.getMoveRecordBId());
        }
        if (needsMapping(dto, dto.getStoreRecordBId(), "storeRecordBId")) {
            entity.setStoreRecordBId(dto.getStoreRecordBId());
        }
        if (needsMapping(dto, dto.getAllocInstBId(), "allocInstBId")) {
            entity.setAllocInstBId(dto.getAllocInstBId());
        }
        if (needsMapping(dto, dto.getProcessDt(), "processDt")) {
            entity.setProcessDt(dto.getProcessDt());
        }
        if (needsMapping(dto, dto.getProcessTypeId(), "processTypeId")) {
            entity.setProcessTypeId(dto.getProcessTypeId());
        }
        if (needsMapping(dto, dto.getProcessNo(), "processNo")) {
            entity.setProcessNo(dto.getProcessNo());
        }
        if (needsMapping(dto, dto.getCorrectType(), "correctType")) {
            entity.setCorrectTypeAsCorrectType(CDef.CorrectType.codeOf(dto.getCorrectType()));
        }
        if (needsMapping(dto, dto.getStockId(), "stockId")) {
            entity.setStockId(dto.getStockId());
        }
        if (needsMapping(dto, dto.getInoutType(), "inoutType")) {
            entity.setInoutTypeAsInoutType(CDef.InoutType.codeOf(dto.getInoutType()));
        }
        if (needsMapping(dto, dto.getStockInoutNum(), "stockInoutNum")) {
            entity.setStockInoutNum(dto.getStockInoutNum());
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
        if (!_suppressTAllocInstB && dto.getTAllocInstB() != null) {
            TAllocInstBDto relationDto = dto.getTAllocInstB();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                TAllocInstB relationEntity = (TAllocInstB)cachedEntity;
                entity.setTAllocInstB(relationEntity);
                if (reverseReference) {
                    relationEntity.getTStockInoutList().add(entity);
                }
            } else {
                TAllocInstBDtoMapper mapper = new TAllocInstBDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTStockInoutList();
                TAllocInstB relationEntity = mapper.mappingToEntity(relationDto);
                entity.setTAllocInstB(relationEntity);
                if (reverseReference) {
                    relationEntity.getTStockInoutList().add(entity);
                }
                if (instanceCache && entity.getTAllocInstB().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getTAllocInstB());
                }
            }
        };
        if (!_suppressTStockInoutByFsStockInoutIdSelf && dto.getTStockInoutByFsStockInoutIdSelf() != null) {
            TStockInoutDto relationDto = dto.getTStockInoutByFsStockInoutIdSelf();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                TStockInout relationEntity = (TStockInout)cachedEntity;
                entity.setTStockInoutByFsStockInoutIdSelf(relationEntity);
                if (reverseReference) {
                    relationEntity.getTStockInoutByFsStockInoutIdSelfList().add(entity);
                }
            } else {
                TStockInoutDtoMapper mapper = new TStockInoutDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTStockInoutByFsStockInoutIdSelfList();
                TStockInout relationEntity = mapper.mappingToEntity(relationDto);
                entity.setTStockInoutByFsStockInoutIdSelf(relationEntity);
                if (reverseReference) {
                    relationEntity.getTStockInoutByFsStockInoutIdSelfList().add(entity);
                }
                if (instanceCache && entity.getTStockInoutByFsStockInoutIdSelf().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getTStockInoutByFsStockInoutIdSelf());
                }
            }
        };
        if (!_suppressTStoreRecordB && dto.getTStoreRecordB() != null) {
            TStoreRecordBDto relationDto = dto.getTStoreRecordB();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                TStoreRecordB relationEntity = (TStoreRecordB)cachedEntity;
                entity.setTStoreRecordB(relationEntity);
                if (reverseReference) {
                    relationEntity.getTStockInoutList().add(entity);
                }
            } else {
                TStoreRecordBDtoMapper mapper = new TStoreRecordBDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTStockInoutList();
                TStoreRecordB relationEntity = mapper.mappingToEntity(relationDto);
                entity.setTStoreRecordB(relationEntity);
                if (reverseReference) {
                    relationEntity.getTStockInoutList().add(entity);
                }
                if (instanceCache && entity.getTStoreRecordB().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getTStoreRecordB());
                }
            }
        };
        if (!_suppressMProcessType && dto.getMProcessType() != null) {
            MProcessTypeDto relationDto = dto.getMProcessType();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                MProcessType relationEntity = (MProcessType)cachedEntity;
                entity.setMProcessType(relationEntity);
                if (reverseReference) {
                    relationEntity.getTStockInoutList().add(entity);
                }
            } else {
                MProcessTypeDtoMapper mapper = new MProcessTypeDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTStockInoutList();
                MProcessType relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMProcessType(relationEntity);
                if (reverseReference) {
                    relationEntity.getTStockInoutList().add(entity);
                }
                if (instanceCache && entity.getMProcessType().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMProcessType());
                }
            }
        };
        if (!_suppressTMoveRecordB && dto.getTMoveRecordB() != null) {
            TMoveRecordBDto relationDto = dto.getTMoveRecordB();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                TMoveRecordB relationEntity = (TMoveRecordB)cachedEntity;
                entity.setTMoveRecordB(relationEntity);
                if (reverseReference) {
                    relationEntity.getTStockInoutList().add(entity);
                }
            } else {
                TMoveRecordBDtoMapper mapper = new TMoveRecordBDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTStockInoutList();
                TMoveRecordB relationEntity = mapper.mappingToEntity(relationDto);
                entity.setTMoveRecordB(relationEntity);
                if (reverseReference) {
                    relationEntity.getTStockInoutList().add(entity);
                }
                if (instanceCache && entity.getTMoveRecordB().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getTMoveRecordB());
                }
            }
        };
        if (!_suppressTStock && dto.getTStock() != null) {
            TStockDto relationDto = dto.getTStock();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                TStock relationEntity = (TStock)cachedEntity;
                entity.setTStock(relationEntity);
                if (reverseReference) {
                    relationEntity.getTStockInoutList().add(entity);
                }
            } else {
                TStockDtoMapper mapper = new TStockDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTStockInoutList();
                TStock relationEntity = mapper.mappingToEntity(relationDto);
                entity.setTStock(relationEntity);
                if (reverseReference) {
                    relationEntity.getTStockInoutList().add(entity);
                }
                if (instanceCache && entity.getTStock().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getTStock());
                }
            }
        };
        if (!_suppressTStockInoutByBfStockInoutIdSelf && dto.getTStockInoutByBfStockInoutIdSelf() != null) {
            TStockInoutDto relationDto = dto.getTStockInoutByBfStockInoutIdSelf();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                TStockInout relationEntity = (TStockInout)cachedEntity;
                entity.setTStockInoutByBfStockInoutIdSelf(relationEntity);
                if (reverseReference) {
                    relationEntity.getTStockInoutByBfStockInoutIdSelfList().add(entity);
                }
            } else {
                TStockInoutDtoMapper mapper = new TStockInoutDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTStockInoutByBfStockInoutIdSelfList();
                TStockInout relationEntity = mapper.mappingToEntity(relationDto);
                entity.setTStockInoutByBfStockInoutIdSelf(relationEntity);
                if (reverseReference) {
                    relationEntity.getTStockInoutByBfStockInoutIdSelfList().add(entity);
                }
                if (instanceCache && entity.getTStockInoutByBfStockInoutIdSelf().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getTStockInoutByBfStockInoutIdSelf());
                }
            }
        };
        if (!_suppressBClassDtlByCorrectType && dto.getBClassDtlByCorrectType() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByCorrectType();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByCorrectType(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByCorrectType(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByCorrectType().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByCorrectType());
                }
            }
        };
        if (!_suppressBClassDtlByInoutType && dto.getBClassDtlByInoutType() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByInoutType();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByInoutType(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByInoutType(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByInoutType().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByInoutType());
                }
            }
        };
        if (!_suppressTStockInoutByFsStockInoutIdSelfList && !dto.getTStockInoutByFsStockInoutIdSelfList().isEmpty()) {
            TStockInoutDtoMapper mapper = new TStockInoutDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressTStockInoutByFsStockInoutIdSelf();
            List<TStockInout> relationEntityList = mapper.mappingToEntityList(dto.getTStockInoutByFsStockInoutIdSelfList());
            entity.setTStockInoutByFsStockInoutIdSelfList(relationEntityList);
            if (reverseReference) {
                for (TStockInout relationEntity : relationEntityList) {
                    relationEntity.setTStockInoutByFsStockInoutIdSelf(entity);
                }
            }
        };
        if (!_suppressTStockInoutByBfStockInoutIdSelfList && !dto.getTStockInoutByBfStockInoutIdSelfList().isEmpty()) {
            TStockInoutDtoMapper mapper = new TStockInoutDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressTStockInoutByBfStockInoutIdSelf();
            List<TStockInout> relationEntityList = mapper.mappingToEntityList(dto.getTStockInoutByBfStockInoutIdSelfList());
            entity.setTStockInoutByBfStockInoutIdSelfList(relationEntityList);
            if (reverseReference) {
                for (TStockInout relationEntity : relationEntityList) {
                    relationEntity.setTStockInoutByBfStockInoutIdSelf(entity);
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
    protected boolean needsMapping(TStockInoutDto dto, Object value, String propName) {
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
    public List<TStockInout> mappingToEntityList(List<TStockInoutDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<TStockInout> entityList = new ArrayList<TStockInout>();
        for (TStockInoutDto dto : dtoList) {
            TStockInout entity = mappingToEntity(dto);
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
    public void suppressTAllocInstB() {
        _suppressTAllocInstB = true;
    }
    public void suppressTStockInoutByFsStockInoutIdSelf() {
        _suppressTStockInoutByFsStockInoutIdSelf = true;
    }
    public void suppressTStoreRecordB() {
        _suppressTStoreRecordB = true;
    }
    public void suppressMProcessType() {
        _suppressMProcessType = true;
    }
    public void suppressTMoveRecordB() {
        _suppressTMoveRecordB = true;
    }
    public void suppressTStock() {
        _suppressTStock = true;
    }
    public void suppressTStockInoutByBfStockInoutIdSelf() {
        _suppressTStockInoutByBfStockInoutIdSelf = true;
    }
    public void suppressBClassDtlByCorrectType() {
        _suppressBClassDtlByCorrectType = true;
    }
    public void suppressBClassDtlByInoutType() {
        _suppressBClassDtlByInoutType = true;
    }
    public void suppressTStockInoutByFsStockInoutIdSelfList() {
        _suppressTStockInoutByFsStockInoutIdSelfList = true;
    }
    public void suppressTStockInoutByBfStockInoutIdSelfList() {
        _suppressTStockInoutByBfStockInoutIdSelfList = true;
    }
    protected void doSuppressAll() { // internal
        suppressTAllocInstB();
        suppressTStockInoutByFsStockInoutIdSelf();
        suppressTStoreRecordB();
        suppressMProcessType();
        suppressTMoveRecordB();
        suppressTStock();
        suppressTStockInoutByBfStockInoutIdSelf();
        suppressBClassDtlByCorrectType();
        suppressBClassDtlByInoutType();
        suppressTStockInoutByFsStockInoutIdSelfList();
        suppressTStockInoutByBfStockInoutIdSelfList();
    }
    protected void doSuppressClear() { // internal
        _suppressTAllocInstB = false;
        _suppressTStockInoutByFsStockInoutIdSelf = false;
        _suppressTStoreRecordB = false;
        _suppressMProcessType = false;
        _suppressTMoveRecordB = false;
        _suppressTStock = false;
        _suppressTStockInoutByBfStockInoutIdSelf = false;
        _suppressBClassDtlByCorrectType = false;
        _suppressBClassDtlByInoutType = false;
        _suppressTStockInoutByFsStockInoutIdSelfList = false;
        _suppressTStockInoutByBfStockInoutIdSelfList = false;
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
    public TStockInoutDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (TStockInoutDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public TStockInoutDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (TStockInoutDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public TStockInoutDtoMapper reverseReference() {
        setReverseReference(true);
        return (TStockInoutDtoMapper)this;
    }
}
