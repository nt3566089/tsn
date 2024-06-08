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
 * The DTO mapper of H_PACKING_B as TABLE. <br>
 * 梱包ボディ履歴
 * <pre>
 * [primary-key]
 *     PACKING_B_ID
 *
 * [column]
 *     PACKING_B_ID, PACKING_H_ID, SHIPPING_INST_B_ID, STOCK_ID, PACKING_NUM, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PACKING_B_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     H_PACKING_H, H_SHIPPING_B, H_STOCK
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     hPackingH, hShippingB, hStock
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsHPackingBDtoMapper implements DtoMapper<HPackingB, HPackingBDto>, Serializable {

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
    protected boolean _suppressHPackingH;
    protected boolean _suppressHShippingB;
    protected boolean _suppressHStock;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsHPackingBDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsHPackingBDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public HPackingBDto mappingToDto(HPackingB entity) {
        if (entity == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Entity localKey = createInstanceKeyEntity(entity);
        Object cachedLocalDto = instanceCache ? _relationDtoMap.get(localKey) : null;
        if (cachedLocalDto != null) {
            return (HPackingBDto)cachedLocalDto;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        HPackingBDto dto = new HPackingBDto();
        dto.setPackingBId(entity.getPackingBId());
        dto.setPackingHId(entity.getPackingHId());
        dto.setShippingInstBId(entity.getShippingInstBId());
        dto.setStockId(entity.getStockId());
        dto.setPackingNum(entity.getPackingNum());
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
        if (!_suppressHPackingH && entity.getHPackingH() != null) {
            HPackingH relationEntity = entity.getHPackingH();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                HPackingHDto relationDto = (HPackingHDto)cachedDto;
                dto.setHPackingH(relationDto);
                if (reverseReference) {
                    relationDto.getHPackingBList().add(dto);
                }
            } else {
                HPackingHDtoMapper mapper = new HPackingHDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressHPackingBList();
                HPackingHDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setHPackingH(relationDto);
                if (reverseReference) {
                    relationDto.getHPackingBList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getHPackingH());
                }
            }
        };
        if (!_suppressHShippingB && entity.getHShippingB() != null) {
            HShippingB relationEntity = entity.getHShippingB();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                HShippingBDto relationDto = (HShippingBDto)cachedDto;
                dto.setHShippingB(relationDto);
                if (reverseReference) {
                    relationDto.getHPackingBList().add(dto);
                }
            } else {
                HShippingBDtoMapper mapper = new HShippingBDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressHPackingBList();
                HShippingBDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setHShippingB(relationDto);
                if (reverseReference) {
                    relationDto.getHPackingBList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getHShippingB());
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
                    relationDto.getHPackingBList().add(dto);
                }
            } else {
                HStockDtoMapper mapper = new HStockDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressHPackingBList();
                HStockDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setHStock(relationDto);
                if (reverseReference) {
                    relationDto.getHPackingBList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getHStock());
                }
            }
        };
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<HPackingBDto> mappingToDtoList(List<HPackingB> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<HPackingBDto> dtoList = new ArrayList<HPackingBDto>();
        for (HPackingB entity : entityList) {
            HPackingBDto dto = mappingToDto(entity);
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
    public HPackingB mappingToEntity(HPackingBDto dto) {
        if (dto == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Object localKey = createInstanceKeyDto(dto, dto.instanceHash());
        Entity cachedLocalEntity = instanceCache ? _relationEntityMap.get(localKey) : null;
        if (cachedLocalEntity != null) {
            return (HPackingB)cachedLocalEntity;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        HPackingB entity = new HPackingB();
        if (needsMapping(dto, dto.getPackingBId(), "packingBId")) {
            entity.setPackingBId(dto.getPackingBId());
        }
        if (needsMapping(dto, dto.getPackingHId(), "packingHId")) {
            entity.setPackingHId(dto.getPackingHId());
        }
        if (needsMapping(dto, dto.getShippingInstBId(), "shippingInstBId")) {
            entity.setShippingInstBId(dto.getShippingInstBId());
        }
        if (needsMapping(dto, dto.getStockId(), "stockId")) {
            entity.setStockId(dto.getStockId());
        }
        if (needsMapping(dto, dto.getPackingNum(), "packingNum")) {
            entity.setPackingNum(dto.getPackingNum());
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
        if (!_suppressHPackingH && dto.getHPackingH() != null) {
            HPackingHDto relationDto = dto.getHPackingH();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                HPackingH relationEntity = (HPackingH)cachedEntity;
                entity.setHPackingH(relationEntity);
                if (reverseReference) {
                    relationEntity.getHPackingBList().add(entity);
                }
            } else {
                HPackingHDtoMapper mapper = new HPackingHDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressHPackingBList();
                HPackingH relationEntity = mapper.mappingToEntity(relationDto);
                entity.setHPackingH(relationEntity);
                if (reverseReference) {
                    relationEntity.getHPackingBList().add(entity);
                }
                if (instanceCache && entity.getHPackingH().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getHPackingH());
                }
            }
        };
        if (!_suppressHShippingB && dto.getHShippingB() != null) {
            HShippingBDto relationDto = dto.getHShippingB();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                HShippingB relationEntity = (HShippingB)cachedEntity;
                entity.setHShippingB(relationEntity);
                if (reverseReference) {
                    relationEntity.getHPackingBList().add(entity);
                }
            } else {
                HShippingBDtoMapper mapper = new HShippingBDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressHPackingBList();
                HShippingB relationEntity = mapper.mappingToEntity(relationDto);
                entity.setHShippingB(relationEntity);
                if (reverseReference) {
                    relationEntity.getHPackingBList().add(entity);
                }
                if (instanceCache && entity.getHShippingB().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getHShippingB());
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
                    relationEntity.getHPackingBList().add(entity);
                }
            } else {
                HStockDtoMapper mapper = new HStockDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressHPackingBList();
                HStock relationEntity = mapper.mappingToEntity(relationDto);
                entity.setHStock(relationEntity);
                if (reverseReference) {
                    relationEntity.getHPackingBList().add(entity);
                }
                if (instanceCache && entity.getHStock().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getHStock());
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
    protected boolean needsMapping(HPackingBDto dto, Object value, String propName) {
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
    public List<HPackingB> mappingToEntityList(List<HPackingBDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<HPackingB> entityList = new ArrayList<HPackingB>();
        for (HPackingBDto dto : dtoList) {
            HPackingB entity = mappingToEntity(dto);
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
    public void suppressHPackingH() {
        _suppressHPackingH = true;
    }
    public void suppressHShippingB() {
        _suppressHShippingB = true;
    }
    public void suppressHStock() {
        _suppressHStock = true;
    }
    protected void doSuppressAll() { // internal
        suppressHPackingH();
        suppressHShippingB();
        suppressHStock();
    }
    protected void doSuppressClear() { // internal
        _suppressHPackingH = false;
        _suppressHShippingB = false;
        _suppressHStock = false;
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
    public HPackingBDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (HPackingBDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public HPackingBDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (HPackingBDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public HPackingBDtoMapper reverseReference() {
        setReverseReference(true);
        return (HPackingBDtoMapper)this;
    }
}
