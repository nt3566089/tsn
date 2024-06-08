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
 * The DTO mapper of T_MOVE_RECORD_B as TABLE. <br>
 * 在庫移動実績ボディ
 * <pre>
 * [primary-key]
 *     MOVE_RECORD_B_ID
 *
 * [column]
 *     MOVE_RECORD_B_ID, MOVE_INST_H_ID, MOVE_INST_B_ID, PROCESS_NO, LOCATION_ID, MOVE_DT, MOVE_NUM, STORE_NO_MERGE_FLG, ALL_SHIPPING_FLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     MOVE_RECORD_B_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     T_MOVE_INST_B, T_MOVE_INST_H, M_LOCATION, B_CLASS_DTL(ByAllShippingFlg)
 *
 * [referrer-table]
 *     T_STOCK_INOUT
 *
 * [foreign-property]
 *     tMoveInstB, tMoveInstH, mLocation, bClassDtlByAllShippingFlg, bClassDtlByStoreNoMergeFlg
 *
 * [referrer-property]
 *     tStockInoutList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsTMoveRecordBDtoMapper implements DtoMapper<TMoveRecordB, TMoveRecordBDto>, Serializable {

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
    protected boolean _suppressTMoveInstB;
    protected boolean _suppressTMoveInstH;
    protected boolean _suppressMLocation;
    protected boolean _suppressBClassDtlByAllShippingFlg;
    protected boolean _suppressBClassDtlByStoreNoMergeFlg;
    protected boolean _suppressTStockInoutList;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTMoveRecordBDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsTMoveRecordBDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public TMoveRecordBDto mappingToDto(TMoveRecordB entity) {
        if (entity == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Entity localKey = createInstanceKeyEntity(entity);
        Object cachedLocalDto = instanceCache ? _relationDtoMap.get(localKey) : null;
        if (cachedLocalDto != null) {
            return (TMoveRecordBDto)cachedLocalDto;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        TMoveRecordBDto dto = new TMoveRecordBDto();
        dto.setMoveRecordBId(entity.getMoveRecordBId());
        dto.setMoveInstHId(entity.getMoveInstHId());
        dto.setMoveInstBId(entity.getMoveInstBId());
        dto.setProcessNo(entity.getProcessNo());
        dto.setLocationId(entity.getLocationId());
        dto.setMoveDt(entity.getMoveDt());
        dto.setMoveNum(entity.getMoveNum());
        dto.setStoreNoMergeFlg(entity.getStoreNoMergeFlg());
        dto.setAllShippingFlg(entity.getAllShippingFlg());
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
        if (!_suppressTMoveInstB && entity.getTMoveInstB() != null) {
            TMoveInstB relationEntity = entity.getTMoveInstB();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                TMoveInstBDto relationDto = (TMoveInstBDto)cachedDto;
                dto.setTMoveInstB(relationDto);
                if (reverseReference) {
                    relationDto.getTMoveRecordBList().add(dto);
                }
            } else {
                TMoveInstBDtoMapper mapper = new TMoveInstBDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTMoveRecordBList();
                TMoveInstBDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setTMoveInstB(relationDto);
                if (reverseReference) {
                    relationDto.getTMoveRecordBList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getTMoveInstB());
                }
            }
        };
        if (!_suppressTMoveInstH && entity.getTMoveInstH() != null) {
            TMoveInstH relationEntity = entity.getTMoveInstH();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                TMoveInstHDto relationDto = (TMoveInstHDto)cachedDto;
                dto.setTMoveInstH(relationDto);
                if (reverseReference) {
                    relationDto.getTMoveRecordBList().add(dto);
                }
            } else {
                TMoveInstHDtoMapper mapper = new TMoveInstHDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTMoveRecordBList();
                TMoveInstHDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setTMoveInstH(relationDto);
                if (reverseReference) {
                    relationDto.getTMoveRecordBList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getTMoveInstH());
                }
            }
        };
        if (!_suppressMLocation && entity.getMLocation() != null) {
            MLocation relationEntity = entity.getMLocation();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                MLocationDto relationDto = (MLocationDto)cachedDto;
                dto.setMLocation(relationDto);
                if (reverseReference) {
                    relationDto.getTMoveRecordBList().add(dto);
                }
            } else {
                MLocationDtoMapper mapper = new MLocationDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTMoveRecordBList();
                MLocationDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMLocation(relationDto);
                if (reverseReference) {
                    relationDto.getTMoveRecordBList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMLocation());
                }
            }
        };
        if (!_suppressBClassDtlByAllShippingFlg && entity.getBClassDtlByAllShippingFlg() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByAllShippingFlg();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByAllShippingFlg(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByAllShippingFlg(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByAllShippingFlg());
                }
            }
        };
        if (!_suppressBClassDtlByStoreNoMergeFlg && entity.getBClassDtlByStoreNoMergeFlg() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByStoreNoMergeFlg();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByStoreNoMergeFlg(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByStoreNoMergeFlg(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByStoreNoMergeFlg());
                }
            }
        };
        if (!_suppressTStockInoutList && !entity.getTStockInoutList().isEmpty()) {
            TStockInoutDtoMapper mapper = new TStockInoutDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressTMoveRecordB();
            List<TStockInoutDto> relationDtoList = mapper.mappingToDtoList(entity.getTStockInoutList());
            dto.setTStockInoutList(relationDtoList);
            if (reverseReference) {
                for (TStockInoutDto relationDto : relationDtoList) {
                    relationDto.setTMoveRecordB(dto);
                }
            }
        };
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<TMoveRecordBDto> mappingToDtoList(List<TMoveRecordB> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<TMoveRecordBDto> dtoList = new ArrayList<TMoveRecordBDto>();
        for (TMoveRecordB entity : entityList) {
            TMoveRecordBDto dto = mappingToDto(entity);
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
    public TMoveRecordB mappingToEntity(TMoveRecordBDto dto) {
        if (dto == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Object localKey = createInstanceKeyDto(dto, dto.instanceHash());
        Entity cachedLocalEntity = instanceCache ? _relationEntityMap.get(localKey) : null;
        if (cachedLocalEntity != null) {
            return (TMoveRecordB)cachedLocalEntity;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        TMoveRecordB entity = new TMoveRecordB();
        if (needsMapping(dto, dto.getMoveRecordBId(), "moveRecordBId")) {
            entity.setMoveRecordBId(dto.getMoveRecordBId());
        }
        if (needsMapping(dto, dto.getMoveInstHId(), "moveInstHId")) {
            entity.setMoveInstHId(dto.getMoveInstHId());
        }
        if (needsMapping(dto, dto.getMoveInstBId(), "moveInstBId")) {
            entity.setMoveInstBId(dto.getMoveInstBId());
        }
        if (needsMapping(dto, dto.getProcessNo(), "processNo")) {
            entity.setProcessNo(dto.getProcessNo());
        }
        if (needsMapping(dto, dto.getLocationId(), "locationId")) {
            entity.setLocationId(dto.getLocationId());
        }
        if (needsMapping(dto, dto.getMoveDt(), "moveDt")) {
            entity.setMoveDt(dto.getMoveDt());
        }
        if (needsMapping(dto, dto.getMoveNum(), "moveNum")) {
            entity.setMoveNum(dto.getMoveNum());
        }
        if (needsMapping(dto, dto.getStoreNoMergeFlg(), "storeNoMergeFlg")) {
            entity.setStoreNoMergeFlgAsStoreNoMergeFlg(CDef.StoreNoMergeFlg.codeOf(dto.getStoreNoMergeFlg()));
        }
        if (needsMapping(dto, dto.getAllShippingFlg(), "allShippingFlg")) {
            entity.setAllShippingFlgAsAllShippingFlg(CDef.AllShippingFlg.codeOf(dto.getAllShippingFlg()));
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
        if (!_suppressTMoveInstB && dto.getTMoveInstB() != null) {
            TMoveInstBDto relationDto = dto.getTMoveInstB();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                TMoveInstB relationEntity = (TMoveInstB)cachedEntity;
                entity.setTMoveInstB(relationEntity);
                if (reverseReference) {
                    relationEntity.getTMoveRecordBList().add(entity);
                }
            } else {
                TMoveInstBDtoMapper mapper = new TMoveInstBDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTMoveRecordBList();
                TMoveInstB relationEntity = mapper.mappingToEntity(relationDto);
                entity.setTMoveInstB(relationEntity);
                if (reverseReference) {
                    relationEntity.getTMoveRecordBList().add(entity);
                }
                if (instanceCache && entity.getTMoveInstB().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getTMoveInstB());
                }
            }
        };
        if (!_suppressTMoveInstH && dto.getTMoveInstH() != null) {
            TMoveInstHDto relationDto = dto.getTMoveInstH();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                TMoveInstH relationEntity = (TMoveInstH)cachedEntity;
                entity.setTMoveInstH(relationEntity);
                if (reverseReference) {
                    relationEntity.getTMoveRecordBList().add(entity);
                }
            } else {
                TMoveInstHDtoMapper mapper = new TMoveInstHDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTMoveRecordBList();
                TMoveInstH relationEntity = mapper.mappingToEntity(relationDto);
                entity.setTMoveInstH(relationEntity);
                if (reverseReference) {
                    relationEntity.getTMoveRecordBList().add(entity);
                }
                if (instanceCache && entity.getTMoveInstH().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getTMoveInstH());
                }
            }
        };
        if (!_suppressMLocation && dto.getMLocation() != null) {
            MLocationDto relationDto = dto.getMLocation();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                MLocation relationEntity = (MLocation)cachedEntity;
                entity.setMLocation(relationEntity);
                if (reverseReference) {
                    relationEntity.getTMoveRecordBList().add(entity);
                }
            } else {
                MLocationDtoMapper mapper = new MLocationDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTMoveRecordBList();
                MLocation relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMLocation(relationEntity);
                if (reverseReference) {
                    relationEntity.getTMoveRecordBList().add(entity);
                }
                if (instanceCache && entity.getMLocation().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMLocation());
                }
            }
        };
        if (!_suppressBClassDtlByAllShippingFlg && dto.getBClassDtlByAllShippingFlg() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByAllShippingFlg();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByAllShippingFlg(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByAllShippingFlg(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByAllShippingFlg().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByAllShippingFlg());
                }
            }
        };
        if (!_suppressBClassDtlByStoreNoMergeFlg && dto.getBClassDtlByStoreNoMergeFlg() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByStoreNoMergeFlg();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByStoreNoMergeFlg(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByStoreNoMergeFlg(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByStoreNoMergeFlg().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByStoreNoMergeFlg());
                }
            }
        };
        if (!_suppressTStockInoutList && !dto.getTStockInoutList().isEmpty()) {
            TStockInoutDtoMapper mapper = new TStockInoutDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressTMoveRecordB();
            List<TStockInout> relationEntityList = mapper.mappingToEntityList(dto.getTStockInoutList());
            entity.setTStockInoutList(relationEntityList);
            if (reverseReference) {
                for (TStockInout relationEntity : relationEntityList) {
                    relationEntity.setTMoveRecordB(entity);
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
    protected boolean needsMapping(TMoveRecordBDto dto, Object value, String propName) {
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
    public List<TMoveRecordB> mappingToEntityList(List<TMoveRecordBDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<TMoveRecordB> entityList = new ArrayList<TMoveRecordB>();
        for (TMoveRecordBDto dto : dtoList) {
            TMoveRecordB entity = mappingToEntity(dto);
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
    public void suppressTMoveInstB() {
        _suppressTMoveInstB = true;
    }
    public void suppressTMoveInstH() {
        _suppressTMoveInstH = true;
    }
    public void suppressMLocation() {
        _suppressMLocation = true;
    }
    public void suppressBClassDtlByAllShippingFlg() {
        _suppressBClassDtlByAllShippingFlg = true;
    }
    public void suppressBClassDtlByStoreNoMergeFlg() {
        _suppressBClassDtlByStoreNoMergeFlg = true;
    }
    public void suppressTStockInoutList() {
        _suppressTStockInoutList = true;
    }
    protected void doSuppressAll() { // internal
        suppressTMoveInstB();
        suppressTMoveInstH();
        suppressMLocation();
        suppressBClassDtlByAllShippingFlg();
        suppressBClassDtlByStoreNoMergeFlg();
        suppressTStockInoutList();
    }
    protected void doSuppressClear() { // internal
        _suppressTMoveInstB = false;
        _suppressTMoveInstH = false;
        _suppressMLocation = false;
        _suppressBClassDtlByAllShippingFlg = false;
        _suppressBClassDtlByStoreNoMergeFlg = false;
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
    public TMoveRecordBDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (TMoveRecordBDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public TMoveRecordBDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (TMoveRecordBDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public TMoveRecordBDtoMapper reverseReference() {
        setReverseReference(true);
        return (TMoveRecordBDtoMapper)this;
    }
}
