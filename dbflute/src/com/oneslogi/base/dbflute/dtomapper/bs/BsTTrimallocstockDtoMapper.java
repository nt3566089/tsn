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
 * The DTO mapper of T_TRIMALLOCSTOCK as TABLE. <br>
 * 山出し引当不能在庫情報
 * <pre>
 * [primary-key]
 *     TRIMALLOCSTOCK_ID
 *
 * [column]
 *     TRIMALLOCSTOCK_ID, TRIMALLOC_H_ID, STOCK_ID, ALLOC_IMP_KEY, ALC_IMP_STKG_NO, LOCATION_CD, DESIGN_FLG, MANUFACTUREDATE, MONTH_FLG, QTY, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TRIMALLOCSTOCK_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     T_STOCK
 *
 * [referrer-table]
 *     T_TRIMALLOCADJUST
 *
 * [foreign-property]
 *     tStock
 *
 * [referrer-property]
 *     tTrimallocadjustList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsTTrimallocstockDtoMapper implements DtoMapper<TTrimallocstock, TTrimallocstockDto>, Serializable {

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
    protected boolean _suppressTStock;
    protected boolean _suppressTTrimallocadjustList;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTTrimallocstockDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsTTrimallocstockDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public TTrimallocstockDto mappingToDto(TTrimallocstock entity) {
        if (entity == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Entity localKey = createInstanceKeyEntity(entity);
        Object cachedLocalDto = instanceCache ? _relationDtoMap.get(localKey) : null;
        if (cachedLocalDto != null) {
            return (TTrimallocstockDto)cachedLocalDto;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        TTrimallocstockDto dto = new TTrimallocstockDto();
        dto.setTrimallocstockId(entity.getTrimallocstockId());
        dto.setTrimallocHId(entity.getTrimallocHId());
        dto.setStockId(entity.getStockId());
        dto.setAllocImpKey(entity.getAllocImpKey());
        dto.setAlcImpStkgNo(entity.getAlcImpStkgNo());
        dto.setLocationCd(entity.getLocationCd());
        dto.setDesignFlg(entity.getDesignFlg());
        dto.setManufacturedate(entity.getManufacturedate());
        dto.setMonthFlg(entity.getMonthFlg());
        dto.setQty(entity.getQty());
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
        if (!_suppressTStock && entity.getTStock() != null) {
            TStock relationEntity = entity.getTStock();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                TStockDto relationDto = (TStockDto)cachedDto;
                dto.setTStock(relationDto);
                if (reverseReference) {
                    relationDto.getTTrimallocstockList().add(dto);
                }
            } else {
                TStockDtoMapper mapper = new TStockDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTTrimallocstockList();
                TStockDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setTStock(relationDto);
                if (reverseReference) {
                    relationDto.getTTrimallocstockList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getTStock());
                }
            }
        };
        if (!_suppressTTrimallocadjustList && !entity.getTTrimallocadjustList().isEmpty()) {
            TTrimallocadjustDtoMapper mapper = new TTrimallocadjustDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressTTrimallocstock();
            List<TTrimallocadjustDto> relationDtoList = mapper.mappingToDtoList(entity.getTTrimallocadjustList());
            dto.setTTrimallocadjustList(relationDtoList);
            if (reverseReference) {
                for (TTrimallocadjustDto relationDto : relationDtoList) {
                    relationDto.setTTrimallocstock(dto);
                }
            }
        };
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<TTrimallocstockDto> mappingToDtoList(List<TTrimallocstock> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<TTrimallocstockDto> dtoList = new ArrayList<TTrimallocstockDto>();
        for (TTrimallocstock entity : entityList) {
            TTrimallocstockDto dto = mappingToDto(entity);
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
    public TTrimallocstock mappingToEntity(TTrimallocstockDto dto) {
        if (dto == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Object localKey = createInstanceKeyDto(dto, dto.instanceHash());
        Entity cachedLocalEntity = instanceCache ? _relationEntityMap.get(localKey) : null;
        if (cachedLocalEntity != null) {
            return (TTrimallocstock)cachedLocalEntity;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        TTrimallocstock entity = new TTrimallocstock();
        if (needsMapping(dto, dto.getTrimallocstockId(), "trimallocstockId")) {
            entity.setTrimallocstockId(dto.getTrimallocstockId());
        }
        if (needsMapping(dto, dto.getTrimallocHId(), "trimallocHId")) {
            entity.setTrimallocHId(dto.getTrimallocHId());
        }
        if (needsMapping(dto, dto.getStockId(), "stockId")) {
            entity.setStockId(dto.getStockId());
        }
        if (needsMapping(dto, dto.getAllocImpKey(), "allocImpKey")) {
            entity.setAllocImpKey(dto.getAllocImpKey());
        }
        if (needsMapping(dto, dto.getAlcImpStkgNo(), "alcImpStkgNo")) {
            entity.setAlcImpStkgNo(dto.getAlcImpStkgNo());
        }
        if (needsMapping(dto, dto.getLocationCd(), "locationCd")) {
            entity.setLocationCd(dto.getLocationCd());
        }
        if (needsMapping(dto, dto.getDesignFlg(), "designFlg")) {
            entity.setDesignFlg(dto.getDesignFlg());
        }
        if (needsMapping(dto, dto.getManufacturedate(), "manufacturedate")) {
            entity.setManufacturedate(dto.getManufacturedate());
        }
        if (needsMapping(dto, dto.getMonthFlg(), "monthFlg")) {
            entity.setMonthFlg(dto.getMonthFlg());
        }
        if (needsMapping(dto, dto.getQty(), "qty")) {
            entity.setQty(dto.getQty());
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
        if (!_suppressTStock && dto.getTStock() != null) {
            TStockDto relationDto = dto.getTStock();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                TStock relationEntity = (TStock)cachedEntity;
                entity.setTStock(relationEntity);
                if (reverseReference) {
                    relationEntity.getTTrimallocstockList().add(entity);
                }
            } else {
                TStockDtoMapper mapper = new TStockDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTTrimallocstockList();
                TStock relationEntity = mapper.mappingToEntity(relationDto);
                entity.setTStock(relationEntity);
                if (reverseReference) {
                    relationEntity.getTTrimallocstockList().add(entity);
                }
                if (instanceCache && entity.getTStock().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getTStock());
                }
            }
        };
        if (!_suppressTTrimallocadjustList && !dto.getTTrimallocadjustList().isEmpty()) {
            TTrimallocadjustDtoMapper mapper = new TTrimallocadjustDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressTTrimallocstock();
            List<TTrimallocadjust> relationEntityList = mapper.mappingToEntityList(dto.getTTrimallocadjustList());
            entity.setTTrimallocadjustList(relationEntityList);
            if (reverseReference) {
                for (TTrimallocadjust relationEntity : relationEntityList) {
                    relationEntity.setTTrimallocstock(entity);
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
    protected boolean needsMapping(TTrimallocstockDto dto, Object value, String propName) {
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
    public List<TTrimallocstock> mappingToEntityList(List<TTrimallocstockDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<TTrimallocstock> entityList = new ArrayList<TTrimallocstock>();
        for (TTrimallocstockDto dto : dtoList) {
            TTrimallocstock entity = mappingToEntity(dto);
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
    public void suppressTStock() {
        _suppressTStock = true;
    }
    public void suppressTTrimallocadjustList() {
        _suppressTTrimallocadjustList = true;
    }
    protected void doSuppressAll() { // internal
        suppressTStock();
        suppressTTrimallocadjustList();
    }
    protected void doSuppressClear() { // internal
        _suppressTStock = false;
        _suppressTTrimallocadjustList = false;
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
    public TTrimallocstockDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (TTrimallocstockDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public TTrimallocstockDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (TTrimallocstockDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public TTrimallocstockDtoMapper reverseReference() {
        setReverseReference(true);
        return (TTrimallocstockDtoMapper)this;
    }
}
