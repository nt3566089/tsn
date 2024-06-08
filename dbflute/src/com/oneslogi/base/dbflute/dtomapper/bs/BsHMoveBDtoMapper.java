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
 * The DTO mapper of H_MOVE_B as TABLE. <br>
 * 在庫移動ボディ履歴
 * <pre>
 * [primary-key]
 *     MOVE_RECORD_B_ID
 *
 * [column]
 *     MOVE_RECORD_B_ID, MOVE_INST_H_ID, INOUT_TYPE, STOCK_ID, PROCESS_NO, MOVE_DT, MOVE_NUM, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
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
 *     H_MOVE_H, H_STOCK, B_CLASS_DTL(ByInoutType)
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     hMoveH, hStock, bClassDtlByInoutType
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsHMoveBDtoMapper implements DtoMapper<HMoveB, HMoveBDto>, Serializable {

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
    protected boolean _suppressHMoveH;
    protected boolean _suppressHStock;
    protected boolean _suppressBClassDtlByInoutType;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsHMoveBDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsHMoveBDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public HMoveBDto mappingToDto(HMoveB entity) {
        if (entity == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Entity localKey = createInstanceKeyEntity(entity);
        Object cachedLocalDto = instanceCache ? _relationDtoMap.get(localKey) : null;
        if (cachedLocalDto != null) {
            return (HMoveBDto)cachedLocalDto;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        HMoveBDto dto = new HMoveBDto();
        dto.setMoveRecordBId(entity.getMoveRecordBId());
        dto.setMoveInstHId(entity.getMoveInstHId());
        dto.setInoutType(entity.getInoutType());
        dto.setStockId(entity.getStockId());
        dto.setProcessNo(entity.getProcessNo());
        dto.setMoveDt(entity.getMoveDt());
        dto.setMoveNum(entity.getMoveNum());
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
        if (!_suppressHMoveH && entity.getHMoveH() != null) {
            HMoveH relationEntity = entity.getHMoveH();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                HMoveHDto relationDto = (HMoveHDto)cachedDto;
                dto.setHMoveH(relationDto);
                if (reverseReference) {
                    relationDto.getHMoveBList().add(dto);
                }
            } else {
                HMoveHDtoMapper mapper = new HMoveHDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressHMoveBList();
                HMoveHDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setHMoveH(relationDto);
                if (reverseReference) {
                    relationDto.getHMoveBList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getHMoveH());
                }
            }
        };
        if (!_suppressHStock && entity.getHStock() != null) {
            HStock relationEntity = entity.getHStock();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                HStockDto relationDto = (HStockDto)cachedDto;
                dto.setHStock(relationDto);
                if (reverseReference) {
                    relationDto.getHMoveBList().add(dto);
                }
            } else {
                HStockDtoMapper mapper = new HStockDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressHMoveBList();
                HStockDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setHStock(relationDto);
                if (reverseReference) {
                    relationDto.getHMoveBList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getHStock());
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
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<HMoveBDto> mappingToDtoList(List<HMoveB> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<HMoveBDto> dtoList = new ArrayList<HMoveBDto>();
        for (HMoveB entity : entityList) {
            HMoveBDto dto = mappingToDto(entity);
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
    public HMoveB mappingToEntity(HMoveBDto dto) {
        if (dto == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Object localKey = createInstanceKeyDto(dto, dto.instanceHash());
        Entity cachedLocalEntity = instanceCache ? _relationEntityMap.get(localKey) : null;
        if (cachedLocalEntity != null) {
            return (HMoveB)cachedLocalEntity;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        HMoveB entity = new HMoveB();
        if (needsMapping(dto, dto.getMoveRecordBId(), "moveRecordBId")) {
            entity.setMoveRecordBId(dto.getMoveRecordBId());
        }
        if (needsMapping(dto, dto.getMoveInstHId(), "moveInstHId")) {
            entity.setMoveInstHId(dto.getMoveInstHId());
        }
        if (needsMapping(dto, dto.getInoutType(), "inoutType")) {
            entity.setInoutTypeAsInoutType(CDef.InoutType.codeOf(dto.getInoutType()));
        }
        if (needsMapping(dto, dto.getStockId(), "stockId")) {
            entity.setStockId(dto.getStockId());
        }
        if (needsMapping(dto, dto.getProcessNo(), "processNo")) {
            entity.setProcessNo(dto.getProcessNo());
        }
        if (needsMapping(dto, dto.getMoveDt(), "moveDt")) {
            entity.setMoveDt(dto.getMoveDt());
        }
        if (needsMapping(dto, dto.getMoveNum(), "moveNum")) {
            entity.setMoveNum(dto.getMoveNum());
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
        if (!_suppressHMoveH && dto.getHMoveH() != null) {
            HMoveHDto relationDto = dto.getHMoveH();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                HMoveH relationEntity = (HMoveH)cachedEntity;
                entity.setHMoveH(relationEntity);
                if (reverseReference) {
                    relationEntity.getHMoveBList().add(entity);
                }
            } else {
                HMoveHDtoMapper mapper = new HMoveHDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressHMoveBList();
                HMoveH relationEntity = mapper.mappingToEntity(relationDto);
                entity.setHMoveH(relationEntity);
                if (reverseReference) {
                    relationEntity.getHMoveBList().add(entity);
                }
                if (instanceCache && entity.getHMoveH().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getHMoveH());
                }
            }
        };
        if (!_suppressHStock && dto.getHStock() != null) {
            HStockDto relationDto = dto.getHStock();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                HStock relationEntity = (HStock)cachedEntity;
                entity.setHStock(relationEntity);
                if (reverseReference) {
                    relationEntity.getHMoveBList().add(entity);
                }
            } else {
                HStockDtoMapper mapper = new HStockDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressHMoveBList();
                HStock relationEntity = mapper.mappingToEntity(relationDto);
                entity.setHStock(relationEntity);
                if (reverseReference) {
                    relationEntity.getHMoveBList().add(entity);
                }
                if (instanceCache && entity.getHStock().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getHStock());
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
    protected boolean needsMapping(HMoveBDto dto, Object value, String propName) {
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
    public List<HMoveB> mappingToEntityList(List<HMoveBDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<HMoveB> entityList = new ArrayList<HMoveB>();
        for (HMoveBDto dto : dtoList) {
            HMoveB entity = mappingToEntity(dto);
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
    public void suppressHMoveH() {
        _suppressHMoveH = true;
    }
    public void suppressHStock() {
        _suppressHStock = true;
    }
    public void suppressBClassDtlByInoutType() {
        _suppressBClassDtlByInoutType = true;
    }
    protected void doSuppressAll() { // internal
        suppressHMoveH();
        suppressHStock();
        suppressBClassDtlByInoutType();
    }
    protected void doSuppressClear() { // internal
        _suppressHMoveH = false;
        _suppressHStock = false;
        _suppressBClassDtlByInoutType = false;
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
    public HMoveBDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (HMoveBDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public HMoveBDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (HMoveBDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public HMoveBDtoMapper reverseReference() {
        setReverseReference(true);
        return (HMoveBDtoMapper)this;
    }
}
