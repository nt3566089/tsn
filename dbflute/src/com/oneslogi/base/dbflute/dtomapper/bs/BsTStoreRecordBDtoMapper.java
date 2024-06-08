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
 * The DTO mapper of T_STORE_RECORD_B as TABLE. <br>
 * 入庫実績ボディ
 * <pre>
 * [primary-key]
 *     STORE_RECORD_B_ID
 *
 * [column]
 *     STORE_RECORD_B_ID, STORE_RECORD_H_ID, RECEIVE_PLAN_B_ID, PROCESS_NO, CLIENT_ORDER_NO, LOT, LIMIT_DT, STORE_DT, STORE_NUM, STORE_FLG, STORE_LOCATION_ID, INPUT_TYPE, HT_STORE_INSPECTION_DT, HT_STORE_INSPECTION_USER_ID, STORE_RECORD_B_COMMENT, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     STORE_RECORD_B_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     M_LOCATION, T_STORE_RECORD_H, T_RECEIVE_PLAN_B, B_CLASS_DTL(ByInputType)
 *
 * [referrer-table]
 *     T_STOCK_INOUT
 *
 * [foreign-property]
 *     mLocation, tStoreRecordH, tReceivePlanB, bClassDtlByInputType, bClassDtlByStoreFlg
 *
 * [referrer-property]
 *     tStockInoutList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsTStoreRecordBDtoMapper implements DtoMapper<TStoreRecordB, TStoreRecordBDto>, Serializable {

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
    protected boolean _suppressMLocation;
    protected boolean _suppressTStoreRecordH;
    protected boolean _suppressTReceivePlanB;
    protected boolean _suppressBClassDtlByInputType;
    protected boolean _suppressBClassDtlByStoreFlg;
    protected boolean _suppressTStockInoutList;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTStoreRecordBDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsTStoreRecordBDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public TStoreRecordBDto mappingToDto(TStoreRecordB entity) {
        if (entity == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Entity localKey = createInstanceKeyEntity(entity);
        Object cachedLocalDto = instanceCache ? _relationDtoMap.get(localKey) : null;
        if (cachedLocalDto != null) {
            return (TStoreRecordBDto)cachedLocalDto;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        TStoreRecordBDto dto = new TStoreRecordBDto();
        dto.setStoreRecordBId(entity.getStoreRecordBId());
        dto.setStoreRecordHId(entity.getStoreRecordHId());
        dto.setReceivePlanBId(entity.getReceivePlanBId());
        dto.setProcessNo(entity.getProcessNo());
        dto.setClientOrderNo(entity.getClientOrderNo());
        dto.setLot(entity.getLot());
        dto.setLimitDt(entity.getLimitDt());
        dto.setStoreDt(entity.getStoreDt());
        dto.setStoreNum(entity.getStoreNum());
        dto.setStoreFlg(entity.getStoreFlg());
        dto.setStoreLocationId(entity.getStoreLocationId());
        dto.setInputType(entity.getInputType());
        dto.setHtStoreInspectionDt(entity.getHtStoreInspectionDt());
        dto.setHtStoreInspectionUserId(entity.getHtStoreInspectionUserId());
        dto.setStoreRecordBComment(entity.getStoreRecordBComment());
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
        if (!_suppressMLocation && entity.getMLocation() != null) {
            MLocation relationEntity = entity.getMLocation();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                MLocationDto relationDto = (MLocationDto)cachedDto;
                dto.setMLocation(relationDto);
                if (reverseReference) {
                    relationDto.getTStoreRecordBList().add(dto);
                }
            } else {
                MLocationDtoMapper mapper = new MLocationDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTStoreRecordBList();
                MLocationDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMLocation(relationDto);
                if (reverseReference) {
                    relationDto.getTStoreRecordBList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMLocation());
                }
            }
        };
        if (!_suppressTStoreRecordH && entity.getTStoreRecordH() != null) {
            TStoreRecordH relationEntity = entity.getTStoreRecordH();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                TStoreRecordHDto relationDto = (TStoreRecordHDto)cachedDto;
                dto.setTStoreRecordH(relationDto);
                if (reverseReference) {
                    relationDto.getTStoreRecordBList().add(dto);
                }
            } else {
                TStoreRecordHDtoMapper mapper = new TStoreRecordHDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTStoreRecordBList();
                TStoreRecordHDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setTStoreRecordH(relationDto);
                if (reverseReference) {
                    relationDto.getTStoreRecordBList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getTStoreRecordH());
                }
            }
        };
        if (!_suppressTReceivePlanB && entity.getTReceivePlanB() != null) {
            TReceivePlanB relationEntity = entity.getTReceivePlanB();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                TReceivePlanBDto relationDto = (TReceivePlanBDto)cachedDto;
                dto.setTReceivePlanB(relationDto);
                if (reverseReference) {
                    relationDto.getTStoreRecordBList().add(dto);
                }
            } else {
                TReceivePlanBDtoMapper mapper = new TReceivePlanBDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTStoreRecordBList();
                TReceivePlanBDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setTReceivePlanB(relationDto);
                if (reverseReference) {
                    relationDto.getTStoreRecordBList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getTReceivePlanB());
                }
            }
        };
        if (!_suppressBClassDtlByInputType && entity.getBClassDtlByInputType() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByInputType();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByInputType(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByInputType(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByInputType());
                }
            }
        };
        if (!_suppressBClassDtlByStoreFlg && entity.getBClassDtlByStoreFlg() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByStoreFlg();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByStoreFlg(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByStoreFlg(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByStoreFlg());
                }
            }
        };
        if (!_suppressTStockInoutList && !entity.getTStockInoutList().isEmpty()) {
            TStockInoutDtoMapper mapper = new TStockInoutDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressTStoreRecordB();
            List<TStockInoutDto> relationDtoList = mapper.mappingToDtoList(entity.getTStockInoutList());
            dto.setTStockInoutList(relationDtoList);
            if (reverseReference) {
                for (TStockInoutDto relationDto : relationDtoList) {
                    relationDto.setTStoreRecordB(dto);
                }
            }
        };
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<TStoreRecordBDto> mappingToDtoList(List<TStoreRecordB> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<TStoreRecordBDto> dtoList = new ArrayList<TStoreRecordBDto>();
        for (TStoreRecordB entity : entityList) {
            TStoreRecordBDto dto = mappingToDto(entity);
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
    public TStoreRecordB mappingToEntity(TStoreRecordBDto dto) {
        if (dto == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Object localKey = createInstanceKeyDto(dto, dto.instanceHash());
        Entity cachedLocalEntity = instanceCache ? _relationEntityMap.get(localKey) : null;
        if (cachedLocalEntity != null) {
            return (TStoreRecordB)cachedLocalEntity;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        TStoreRecordB entity = new TStoreRecordB();
        if (needsMapping(dto, dto.getStoreRecordBId(), "storeRecordBId")) {
            entity.setStoreRecordBId(dto.getStoreRecordBId());
        }
        if (needsMapping(dto, dto.getStoreRecordHId(), "storeRecordHId")) {
            entity.setStoreRecordHId(dto.getStoreRecordHId());
        }
        if (needsMapping(dto, dto.getReceivePlanBId(), "receivePlanBId")) {
            entity.setReceivePlanBId(dto.getReceivePlanBId());
        }
        if (needsMapping(dto, dto.getProcessNo(), "processNo")) {
            entity.setProcessNo(dto.getProcessNo());
        }
        if (needsMapping(dto, dto.getClientOrderNo(), "clientOrderNo")) {
            entity.setClientOrderNo(dto.getClientOrderNo());
        }
        if (needsMapping(dto, dto.getLot(), "lot")) {
            entity.setLot(dto.getLot());
        }
        if (needsMapping(dto, dto.getLimitDt(), "limitDt")) {
            entity.setLimitDt(dto.getLimitDt());
        }
        if (needsMapping(dto, dto.getStoreDt(), "storeDt")) {
            entity.setStoreDt(dto.getStoreDt());
        }
        if (needsMapping(dto, dto.getStoreNum(), "storeNum")) {
            entity.setStoreNum(dto.getStoreNum());
        }
        if (needsMapping(dto, dto.getStoreFlg(), "storeFlg")) {
            entity.setStoreFlgAsStoreFlg(CDef.StoreFlg.codeOf(dto.getStoreFlg()));
        }
        if (needsMapping(dto, dto.getStoreLocationId(), "storeLocationId")) {
            entity.setStoreLocationId(dto.getStoreLocationId());
        }
        if (needsMapping(dto, dto.getInputType(), "inputType")) {
            entity.setInputTypeAsInputType(CDef.InputType.codeOf(dto.getInputType()));
        }
        if (needsMapping(dto, dto.getHtStoreInspectionDt(), "htStoreInspectionDt")) {
            entity.setHtStoreInspectionDt(dto.getHtStoreInspectionDt());
        }
        if (needsMapping(dto, dto.getHtStoreInspectionUserId(), "htStoreInspectionUserId")) {
            entity.setHtStoreInspectionUserId(dto.getHtStoreInspectionUserId());
        }
        if (needsMapping(dto, dto.getStoreRecordBComment(), "storeRecordBComment")) {
            entity.setStoreRecordBComment(dto.getStoreRecordBComment());
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
        if (!_suppressMLocation && dto.getMLocation() != null) {
            MLocationDto relationDto = dto.getMLocation();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                MLocation relationEntity = (MLocation)cachedEntity;
                entity.setMLocation(relationEntity);
                if (reverseReference) {
                    relationEntity.getTStoreRecordBList().add(entity);
                }
            } else {
                MLocationDtoMapper mapper = new MLocationDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTStoreRecordBList();
                MLocation relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMLocation(relationEntity);
                if (reverseReference) {
                    relationEntity.getTStoreRecordBList().add(entity);
                }
                if (instanceCache && entity.getMLocation().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMLocation());
                }
            }
        };
        if (!_suppressTStoreRecordH && dto.getTStoreRecordH() != null) {
            TStoreRecordHDto relationDto = dto.getTStoreRecordH();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                TStoreRecordH relationEntity = (TStoreRecordH)cachedEntity;
                entity.setTStoreRecordH(relationEntity);
                if (reverseReference) {
                    relationEntity.getTStoreRecordBList().add(entity);
                }
            } else {
                TStoreRecordHDtoMapper mapper = new TStoreRecordHDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTStoreRecordBList();
                TStoreRecordH relationEntity = mapper.mappingToEntity(relationDto);
                entity.setTStoreRecordH(relationEntity);
                if (reverseReference) {
                    relationEntity.getTStoreRecordBList().add(entity);
                }
                if (instanceCache && entity.getTStoreRecordH().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getTStoreRecordH());
                }
            }
        };
        if (!_suppressTReceivePlanB && dto.getTReceivePlanB() != null) {
            TReceivePlanBDto relationDto = dto.getTReceivePlanB();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                TReceivePlanB relationEntity = (TReceivePlanB)cachedEntity;
                entity.setTReceivePlanB(relationEntity);
                if (reverseReference) {
                    relationEntity.getTStoreRecordBList().add(entity);
                }
            } else {
                TReceivePlanBDtoMapper mapper = new TReceivePlanBDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTStoreRecordBList();
                TReceivePlanB relationEntity = mapper.mappingToEntity(relationDto);
                entity.setTReceivePlanB(relationEntity);
                if (reverseReference) {
                    relationEntity.getTStoreRecordBList().add(entity);
                }
                if (instanceCache && entity.getTReceivePlanB().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getTReceivePlanB());
                }
            }
        };
        if (!_suppressBClassDtlByInputType && dto.getBClassDtlByInputType() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByInputType();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByInputType(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByInputType(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByInputType().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByInputType());
                }
            }
        };
        if (!_suppressBClassDtlByStoreFlg && dto.getBClassDtlByStoreFlg() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByStoreFlg();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByStoreFlg(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByStoreFlg(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByStoreFlg().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByStoreFlg());
                }
            }
        };
        if (!_suppressTStockInoutList && !dto.getTStockInoutList().isEmpty()) {
            TStockInoutDtoMapper mapper = new TStockInoutDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressTStoreRecordB();
            List<TStockInout> relationEntityList = mapper.mappingToEntityList(dto.getTStockInoutList());
            entity.setTStockInoutList(relationEntityList);
            if (reverseReference) {
                for (TStockInout relationEntity : relationEntityList) {
                    relationEntity.setTStoreRecordB(entity);
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
    protected boolean needsMapping(TStoreRecordBDto dto, Object value, String propName) {
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
    public List<TStoreRecordB> mappingToEntityList(List<TStoreRecordBDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<TStoreRecordB> entityList = new ArrayList<TStoreRecordB>();
        for (TStoreRecordBDto dto : dtoList) {
            TStoreRecordB entity = mappingToEntity(dto);
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
    public void suppressMLocation() {
        _suppressMLocation = true;
    }
    public void suppressTStoreRecordH() {
        _suppressTStoreRecordH = true;
    }
    public void suppressTReceivePlanB() {
        _suppressTReceivePlanB = true;
    }
    public void suppressBClassDtlByInputType() {
        _suppressBClassDtlByInputType = true;
    }
    public void suppressBClassDtlByStoreFlg() {
        _suppressBClassDtlByStoreFlg = true;
    }
    public void suppressTStockInoutList() {
        _suppressTStockInoutList = true;
    }
    protected void doSuppressAll() { // internal
        suppressMLocation();
        suppressTStoreRecordH();
        suppressTReceivePlanB();
        suppressBClassDtlByInputType();
        suppressBClassDtlByStoreFlg();
        suppressTStockInoutList();
    }
    protected void doSuppressClear() { // internal
        _suppressMLocation = false;
        _suppressTStoreRecordH = false;
        _suppressTReceivePlanB = false;
        _suppressBClassDtlByInputType = false;
        _suppressBClassDtlByStoreFlg = false;
        _suppressTStockInoutList = false;
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
    public TStoreRecordBDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (TStoreRecordBDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public TStoreRecordBDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (TStoreRecordBDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public TStoreRecordBDtoMapper reverseReference() {
        setReverseReference(true);
        return (TStoreRecordBDtoMapper)this;
    }
}
