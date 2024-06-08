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
 * The DTO mapper of T_TRIMALLOCADJUST as TABLE. <br>
 * 山出し引当不能調整情報
 * <pre>
 * [primary-key]
 *     TRIMALLOCADJUST_ID
 *
 * [column]
 *     TRIMALLOCADJUST_ID, TRIMALLOCSTOCK_ID, TRIMALLOCSCH_ID, ALLOC_IMP_KEY, ALC_IMP_RESG_NO, ALC_IMP_STKG_NO, ADJUSTED_QTY, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TRIMALLOCADJUST_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     T_TRIMALLOCSTOCK, T_TRIMALLOCSCHKRI
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     tTrimallocstock, tTrimallocschkri
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsTTrimallocadjustDtoMapper implements DtoMapper<TTrimallocadjust, TTrimallocadjustDto>, Serializable {

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
    protected boolean _suppressTTrimallocstock;
    protected boolean _suppressTTrimallocschkri;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTTrimallocadjustDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsTTrimallocadjustDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public TTrimallocadjustDto mappingToDto(TTrimallocadjust entity) {
        if (entity == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Entity localKey = createInstanceKeyEntity(entity);
        Object cachedLocalDto = instanceCache ? _relationDtoMap.get(localKey) : null;
        if (cachedLocalDto != null) {
            return (TTrimallocadjustDto)cachedLocalDto;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        TTrimallocadjustDto dto = new TTrimallocadjustDto();
        dto.setTrimallocadjustId(entity.getTrimallocadjustId());
        dto.setTrimallocstockId(entity.getTrimallocstockId());
        dto.setTrimallocschId(entity.getTrimallocschId());
        dto.setAllocImpKey(entity.getAllocImpKey());
        dto.setAlcImpResgNo(entity.getAlcImpResgNo());
        dto.setAlcImpStkgNo(entity.getAlcImpStkgNo());
        dto.setAdjustedQty(entity.getAdjustedQty());
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
        if (!_suppressTTrimallocstock && entity.getTTrimallocstock() != null) {
            TTrimallocstock relationEntity = entity.getTTrimallocstock();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                TTrimallocstockDto relationDto = (TTrimallocstockDto)cachedDto;
                dto.setTTrimallocstock(relationDto);
                if (reverseReference) {
                    relationDto.getTTrimallocadjustList().add(dto);
                }
            } else {
                TTrimallocstockDtoMapper mapper = new TTrimallocstockDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTTrimallocadjustList();
                TTrimallocstockDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setTTrimallocstock(relationDto);
                if (reverseReference) {
                    relationDto.getTTrimallocadjustList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getTTrimallocstock());
                }
            }
        };
        if (!_suppressTTrimallocschkri && entity.getTTrimallocschkri() != null) {
            TTrimallocschkri relationEntity = entity.getTTrimallocschkri();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                TTrimallocschkriDto relationDto = (TTrimallocschkriDto)cachedDto;
                dto.setTTrimallocschkri(relationDto);
                if (reverseReference) {
                    relationDto.getTTrimallocadjustList().add(dto);
                }
            } else {
                TTrimallocschkriDtoMapper mapper = new TTrimallocschkriDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTTrimallocadjustList();
                TTrimallocschkriDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setTTrimallocschkri(relationDto);
                if (reverseReference) {
                    relationDto.getTTrimallocadjustList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getTTrimallocschkri());
                }
            }
        };
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<TTrimallocadjustDto> mappingToDtoList(List<TTrimallocadjust> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<TTrimallocadjustDto> dtoList = new ArrayList<TTrimallocadjustDto>();
        for (TTrimallocadjust entity : entityList) {
            TTrimallocadjustDto dto = mappingToDto(entity);
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
    public TTrimallocadjust mappingToEntity(TTrimallocadjustDto dto) {
        if (dto == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Object localKey = createInstanceKeyDto(dto, dto.instanceHash());
        Entity cachedLocalEntity = instanceCache ? _relationEntityMap.get(localKey) : null;
        if (cachedLocalEntity != null) {
            return (TTrimallocadjust)cachedLocalEntity;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        TTrimallocadjust entity = new TTrimallocadjust();
        if (needsMapping(dto, dto.getTrimallocadjustId(), "trimallocadjustId")) {
            entity.setTrimallocadjustId(dto.getTrimallocadjustId());
        }
        if (needsMapping(dto, dto.getTrimallocstockId(), "trimallocstockId")) {
            entity.setTrimallocstockId(dto.getTrimallocstockId());
        }
        if (needsMapping(dto, dto.getTrimallocschId(), "trimallocschId")) {
            entity.setTrimallocschId(dto.getTrimallocschId());
        }
        if (needsMapping(dto, dto.getAllocImpKey(), "allocImpKey")) {
            entity.setAllocImpKey(dto.getAllocImpKey());
        }
        if (needsMapping(dto, dto.getAlcImpResgNo(), "alcImpResgNo")) {
            entity.setAlcImpResgNo(dto.getAlcImpResgNo());
        }
        if (needsMapping(dto, dto.getAlcImpStkgNo(), "alcImpStkgNo")) {
            entity.setAlcImpStkgNo(dto.getAlcImpStkgNo());
        }
        if (needsMapping(dto, dto.getAdjustedQty(), "adjustedQty")) {
            entity.setAdjustedQty(dto.getAdjustedQty());
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
        if (!_suppressTTrimallocstock && dto.getTTrimallocstock() != null) {
            TTrimallocstockDto relationDto = dto.getTTrimallocstock();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                TTrimallocstock relationEntity = (TTrimallocstock)cachedEntity;
                entity.setTTrimallocstock(relationEntity);
                if (reverseReference) {
                    relationEntity.getTTrimallocadjustList().add(entity);
                }
            } else {
                TTrimallocstockDtoMapper mapper = new TTrimallocstockDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTTrimallocadjustList();
                TTrimallocstock relationEntity = mapper.mappingToEntity(relationDto);
                entity.setTTrimallocstock(relationEntity);
                if (reverseReference) {
                    relationEntity.getTTrimallocadjustList().add(entity);
                }
                if (instanceCache && entity.getTTrimallocstock().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getTTrimallocstock());
                }
            }
        };
        if (!_suppressTTrimallocschkri && dto.getTTrimallocschkri() != null) {
            TTrimallocschkriDto relationDto = dto.getTTrimallocschkri();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                TTrimallocschkri relationEntity = (TTrimallocschkri)cachedEntity;
                entity.setTTrimallocschkri(relationEntity);
                if (reverseReference) {
                    relationEntity.getTTrimallocadjustList().add(entity);
                }
            } else {
                TTrimallocschkriDtoMapper mapper = new TTrimallocschkriDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTTrimallocadjustList();
                TTrimallocschkri relationEntity = mapper.mappingToEntity(relationDto);
                entity.setTTrimallocschkri(relationEntity);
                if (reverseReference) {
                    relationEntity.getTTrimallocadjustList().add(entity);
                }
                if (instanceCache && entity.getTTrimallocschkri().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getTTrimallocschkri());
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
    protected boolean needsMapping(TTrimallocadjustDto dto, Object value, String propName) {
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
    public List<TTrimallocadjust> mappingToEntityList(List<TTrimallocadjustDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<TTrimallocadjust> entityList = new ArrayList<TTrimallocadjust>();
        for (TTrimallocadjustDto dto : dtoList) {
            TTrimallocadjust entity = mappingToEntity(dto);
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
    public void suppressTTrimallocstock() {
        _suppressTTrimallocstock = true;
    }
    public void suppressTTrimallocschkri() {
        _suppressTTrimallocschkri = true;
    }
    protected void doSuppressAll() { // internal
        suppressTTrimallocstock();
        suppressTTrimallocschkri();
    }
    protected void doSuppressClear() { // internal
        _suppressTTrimallocstock = false;
        _suppressTTrimallocschkri = false;
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
    public TTrimallocadjustDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (TTrimallocadjustDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public TTrimallocadjustDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (TTrimallocadjustDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public TTrimallocadjustDtoMapper reverseReference() {
        setReverseReference(true);
        return (TTrimallocadjustDtoMapper)this;
    }
}
