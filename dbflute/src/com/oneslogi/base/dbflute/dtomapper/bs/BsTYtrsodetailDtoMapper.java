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
 * The DTO mapper of T_YTRSODETAIL as TABLE. <br>
 * 山出し指示ボディ
 * <pre>
 * [primary-key]
 *     TRSODETAIL_ID
 *
 * [column]
 *     TRSODETAIL_ID, TRSO_ID, PRODUCT_ID, SO_LINE_NO, PRODUCT_CD, IFITEM_CD, LOCATION_ID, LOCATION_CD, DAMAGE_FLG, NO_SHIPPING_FLG, EXPECT_QTY, ALLOC_QTY, PICKED_QTY, SORTED_QTY, INSPECTED_QTY, SHIPPED_QTY, ADJUST_QTY, LOC_FLG, STD_DIF_FLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TRSODETAIL_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     M_PRODUCT, T_YTRSO
 *
 * [referrer-table]
 *     T_TRIMALLOCSCHKRI, T_TRPICKDETAIL
 *
 * [foreign-property]
 *     mProduct, tYtrso
 *
 * [referrer-property]
 *     tTrimallocschkriList, tTrpickdetailList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsTYtrsodetailDtoMapper implements DtoMapper<TYtrsodetail, TYtrsodetailDto>, Serializable {

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
    protected boolean _suppressMProduct;
    protected boolean _suppressTYtrso;
    protected boolean _suppressTTrimallocschkriList;
    protected boolean _suppressTTrpickdetailList;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTYtrsodetailDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsTYtrsodetailDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public TYtrsodetailDto mappingToDto(TYtrsodetail entity) {
        if (entity == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Entity localKey = createInstanceKeyEntity(entity);
        Object cachedLocalDto = instanceCache ? _relationDtoMap.get(localKey) : null;
        if (cachedLocalDto != null) {
            return (TYtrsodetailDto)cachedLocalDto;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        TYtrsodetailDto dto = new TYtrsodetailDto();
        dto.setTrsodetailId(entity.getTrsodetailId());
        dto.setTrsoId(entity.getTrsoId());
        dto.setProductId(entity.getProductId());
        dto.setSoLineNo(entity.getSoLineNo());
        dto.setProductCd(entity.getProductCd());
        dto.setIfitemCd(entity.getIfitemCd());
        dto.setLocationId(entity.getLocationId());
        dto.setLocationCd(entity.getLocationCd());
        dto.setDamageFlg(entity.getDamageFlg());
        dto.setNoShippingFlg(entity.getNoShippingFlg());
        dto.setExpectQty(entity.getExpectQty());
        dto.setAllocQty(entity.getAllocQty());
        dto.setPickedQty(entity.getPickedQty());
        dto.setSortedQty(entity.getSortedQty());
        dto.setInspectedQty(entity.getInspectedQty());
        dto.setShippedQty(entity.getShippedQty());
        dto.setAdjustQty(entity.getAdjustQty());
        dto.setLocFlg(entity.getLocFlg());
        dto.setStdDifFlg(entity.getStdDifFlg());
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
        if (!_suppressMProduct && entity.getMProduct() != null) {
            MProduct relationEntity = entity.getMProduct();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                MProductDto relationDto = (MProductDto)cachedDto;
                dto.setMProduct(relationDto);
                if (reverseReference) {
                    relationDto.getTYtrsodetailList().add(dto);
                }
            } else {
                MProductDtoMapper mapper = new MProductDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTYtrsodetailList();
                MProductDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMProduct(relationDto);
                if (reverseReference) {
                    relationDto.getTYtrsodetailList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMProduct());
                }
            }
        };
        if (!_suppressTYtrso && entity.getTYtrso() != null) {
            TYtrso relationEntity = entity.getTYtrso();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                TYtrsoDto relationDto = (TYtrsoDto)cachedDto;
                dto.setTYtrso(relationDto);
                if (reverseReference) {
                    relationDto.getTYtrsodetailList().add(dto);
                }
            } else {
                TYtrsoDtoMapper mapper = new TYtrsoDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTYtrsodetailList();
                TYtrsoDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setTYtrso(relationDto);
                if (reverseReference) {
                    relationDto.getTYtrsodetailList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getTYtrso());
                }
            }
        };
        if (!_suppressTTrimallocschkriList && !entity.getTTrimallocschkriList().isEmpty()) {
            TTrimallocschkriDtoMapper mapper = new TTrimallocschkriDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressTYtrsodetail();
            List<TTrimallocschkriDto> relationDtoList = mapper.mappingToDtoList(entity.getTTrimallocschkriList());
            dto.setTTrimallocschkriList(relationDtoList);
            if (reverseReference) {
                for (TTrimallocschkriDto relationDto : relationDtoList) {
                    relationDto.setTYtrsodetail(dto);
                }
            }
        };
        if (!_suppressTTrpickdetailList && !entity.getTTrpickdetailList().isEmpty()) {
            TTrpickdetailDtoMapper mapper = new TTrpickdetailDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressTYtrsodetail();
            List<TTrpickdetailDto> relationDtoList = mapper.mappingToDtoList(entity.getTTrpickdetailList());
            dto.setTTrpickdetailList(relationDtoList);
            if (reverseReference) {
                for (TTrpickdetailDto relationDto : relationDtoList) {
                    relationDto.setTYtrsodetail(dto);
                }
            }
        };
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<TYtrsodetailDto> mappingToDtoList(List<TYtrsodetail> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<TYtrsodetailDto> dtoList = new ArrayList<TYtrsodetailDto>();
        for (TYtrsodetail entity : entityList) {
            TYtrsodetailDto dto = mappingToDto(entity);
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
    public TYtrsodetail mappingToEntity(TYtrsodetailDto dto) {
        if (dto == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Object localKey = createInstanceKeyDto(dto, dto.instanceHash());
        Entity cachedLocalEntity = instanceCache ? _relationEntityMap.get(localKey) : null;
        if (cachedLocalEntity != null) {
            return (TYtrsodetail)cachedLocalEntity;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        TYtrsodetail entity = new TYtrsodetail();
        if (needsMapping(dto, dto.getTrsodetailId(), "trsodetailId")) {
            entity.setTrsodetailId(dto.getTrsodetailId());
        }
        if (needsMapping(dto, dto.getTrsoId(), "trsoId")) {
            entity.setTrsoId(dto.getTrsoId());
        }
        if (needsMapping(dto, dto.getProductId(), "productId")) {
            entity.setProductId(dto.getProductId());
        }
        if (needsMapping(dto, dto.getSoLineNo(), "soLineNo")) {
            entity.setSoLineNo(dto.getSoLineNo());
        }
        if (needsMapping(dto, dto.getProductCd(), "productCd")) {
            entity.setProductCd(dto.getProductCd());
        }
        if (needsMapping(dto, dto.getIfitemCd(), "ifitemCd")) {
            entity.setIfitemCd(dto.getIfitemCd());
        }
        if (needsMapping(dto, dto.getLocationId(), "locationId")) {
            entity.setLocationId(dto.getLocationId());
        }
        if (needsMapping(dto, dto.getLocationCd(), "locationCd")) {
            entity.setLocationCd(dto.getLocationCd());
        }
        if (needsMapping(dto, dto.getDamageFlg(), "damageFlg")) {
            entity.setDamageFlg(dto.getDamageFlg());
        }
        if (needsMapping(dto, dto.getNoShippingFlg(), "noShippingFlg")) {
            entity.setNoShippingFlg(dto.getNoShippingFlg());
        }
        if (needsMapping(dto, dto.getExpectQty(), "expectQty")) {
            entity.setExpectQty(dto.getExpectQty());
        }
        if (needsMapping(dto, dto.getAllocQty(), "allocQty")) {
            entity.setAllocQty(dto.getAllocQty());
        }
        if (needsMapping(dto, dto.getPickedQty(), "pickedQty")) {
            entity.setPickedQty(dto.getPickedQty());
        }
        if (needsMapping(dto, dto.getSortedQty(), "sortedQty")) {
            entity.setSortedQty(dto.getSortedQty());
        }
        if (needsMapping(dto, dto.getInspectedQty(), "inspectedQty")) {
            entity.setInspectedQty(dto.getInspectedQty());
        }
        if (needsMapping(dto, dto.getShippedQty(), "shippedQty")) {
            entity.setShippedQty(dto.getShippedQty());
        }
        if (needsMapping(dto, dto.getAdjustQty(), "adjustQty")) {
            entity.setAdjustQty(dto.getAdjustQty());
        }
        if (needsMapping(dto, dto.getLocFlg(), "locFlg")) {
            entity.setLocFlg(dto.getLocFlg());
        }
        if (needsMapping(dto, dto.getStdDifFlg(), "stdDifFlg")) {
            entity.setStdDifFlg(dto.getStdDifFlg());
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
        if (!_suppressMProduct && dto.getMProduct() != null) {
            MProductDto relationDto = dto.getMProduct();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                MProduct relationEntity = (MProduct)cachedEntity;
                entity.setMProduct(relationEntity);
                if (reverseReference) {
                    relationEntity.getTYtrsodetailList().add(entity);
                }
            } else {
                MProductDtoMapper mapper = new MProductDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTYtrsodetailList();
                MProduct relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMProduct(relationEntity);
                if (reverseReference) {
                    relationEntity.getTYtrsodetailList().add(entity);
                }
                if (instanceCache && entity.getMProduct().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMProduct());
                }
            }
        };
        if (!_suppressTYtrso && dto.getTYtrso() != null) {
            TYtrsoDto relationDto = dto.getTYtrso();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                TYtrso relationEntity = (TYtrso)cachedEntity;
                entity.setTYtrso(relationEntity);
                if (reverseReference) {
                    relationEntity.getTYtrsodetailList().add(entity);
                }
            } else {
                TYtrsoDtoMapper mapper = new TYtrsoDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTYtrsodetailList();
                TYtrso relationEntity = mapper.mappingToEntity(relationDto);
                entity.setTYtrso(relationEntity);
                if (reverseReference) {
                    relationEntity.getTYtrsodetailList().add(entity);
                }
                if (instanceCache && entity.getTYtrso().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getTYtrso());
                }
            }
        };
        if (!_suppressTTrimallocschkriList && !dto.getTTrimallocschkriList().isEmpty()) {
            TTrimallocschkriDtoMapper mapper = new TTrimallocschkriDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressTYtrsodetail();
            List<TTrimallocschkri> relationEntityList = mapper.mappingToEntityList(dto.getTTrimallocschkriList());
            entity.setTTrimallocschkriList(relationEntityList);
            if (reverseReference) {
                for (TTrimallocschkri relationEntity : relationEntityList) {
                    relationEntity.setTYtrsodetail(entity);
                }
            }
        };
        if (!_suppressTTrpickdetailList && !dto.getTTrpickdetailList().isEmpty()) {
            TTrpickdetailDtoMapper mapper = new TTrpickdetailDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressTYtrsodetail();
            List<TTrpickdetail> relationEntityList = mapper.mappingToEntityList(dto.getTTrpickdetailList());
            entity.setTTrpickdetailList(relationEntityList);
            if (reverseReference) {
                for (TTrpickdetail relationEntity : relationEntityList) {
                    relationEntity.setTYtrsodetail(entity);
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
    protected boolean needsMapping(TYtrsodetailDto dto, Object value, String propName) {
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
    public List<TYtrsodetail> mappingToEntityList(List<TYtrsodetailDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<TYtrsodetail> entityList = new ArrayList<TYtrsodetail>();
        for (TYtrsodetailDto dto : dtoList) {
            TYtrsodetail entity = mappingToEntity(dto);
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
    public void suppressMProduct() {
        _suppressMProduct = true;
    }
    public void suppressTYtrso() {
        _suppressTYtrso = true;
    }
    public void suppressTTrimallocschkriList() {
        _suppressTTrimallocschkriList = true;
    }
    public void suppressTTrpickdetailList() {
        _suppressTTrpickdetailList = true;
    }
    protected void doSuppressAll() { // internal
        suppressMProduct();
        suppressTYtrso();
        suppressTTrimallocschkriList();
        suppressTTrpickdetailList();
    }
    protected void doSuppressClear() { // internal
        _suppressMProduct = false;
        _suppressTYtrso = false;
        _suppressTTrimallocschkriList = false;
        _suppressTTrpickdetailList = false;
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
    public TYtrsodetailDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (TYtrsodetailDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public TYtrsodetailDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (TYtrsodetailDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public TYtrsodetailDtoMapper reverseReference() {
        setReverseReference(true);
        return (TYtrsodetailDtoMapper)this;
    }
}
