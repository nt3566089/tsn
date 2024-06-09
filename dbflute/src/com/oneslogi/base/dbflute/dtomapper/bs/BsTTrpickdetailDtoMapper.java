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
 * The DTO mapper of T_TRPICKDETAIL as TABLE. <br>
 * 山出し指示詳細ボディ
 * <pre>
 * [primary-key]
 *     TRPICKDETAIL_ID
 *
 * [column]
 *     TRPICKDETAIL_ID, TRSODETAIL_ID, MOVE_INST_H_ID, STOCK_ID, LOCATION_ID, PICK_BATCH_KEY, PICK_BATCH_LINE_NO, PRODUCT_CD, IFITEM_CD, LOT_ID, LOCATION_CD, EXPECT_QTY, PICKED_QTY, SORTED_QTY, SHIPPED_QTY, PICK_USER_CD, LABEL_PRINTED_FLG, MONTH_FLG, PL_BATCH_KEY, WORKALLOCATENAME, ALERTFLG, REVERSE_FLG, REVERSE_LIST_OUTPUT__FLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TRPICKDETAIL_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     M_LOCATION, T_STOCK, T_YTRSODETAIL
 *
 * [referrer-table]
 *     T_TR_PICKLIST
 *
 * [foreign-property]
 *     mLocation, tStock, tYtrsodetail
 *
 * [referrer-property]
 *     tTrPicklistList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsTTrpickdetailDtoMapper implements DtoMapper<TTrpickdetail, TTrpickdetailDto>, Serializable {

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
    protected boolean _suppressTStock;
    protected boolean _suppressTYtrsodetail;
    protected boolean _suppressTTrPicklistList;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTTrpickdetailDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsTTrpickdetailDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public TTrpickdetailDto mappingToDto(TTrpickdetail entity) {
        if (entity == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Entity localKey = createInstanceKeyEntity(entity);
        Object cachedLocalDto = instanceCache ? _relationDtoMap.get(localKey) : null;
        if (cachedLocalDto != null) {
            return (TTrpickdetailDto)cachedLocalDto;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        TTrpickdetailDto dto = new TTrpickdetailDto();
        dto.setTrpickdetailId(entity.getTrpickdetailId());
        dto.setTrsodetailId(entity.getTrsodetailId());
        dto.setMoveInstHId(entity.getMoveInstHId());
        dto.setStockId(entity.getStockId());
        dto.setLocationId(entity.getLocationId());
        dto.setPickBatchKey(entity.getPickBatchKey());
        dto.setPickBatchLineNo(entity.getPickBatchLineNo());
        dto.setProductCd(entity.getProductCd());
        dto.setIfitemCd(entity.getIfitemCd());
        dto.setLotId(entity.getLotId());
        dto.setLocationCd(entity.getLocationCd());
        dto.setExpectQty(entity.getExpectQty());
        dto.setPickedQty(entity.getPickedQty());
        dto.setSortedQty(entity.getSortedQty());
        dto.setShippedQty(entity.getShippedQty());
        dto.setPickUserCd(entity.getPickUserCd());
        dto.setLabelPrintedFlg(entity.getLabelPrintedFlg());
        dto.setMonthFlg(entity.getMonthFlg());
        dto.setPlBatchKey(entity.getPlBatchKey());
        dto.setWorkallocatename(entity.getWorkallocatename());
        dto.setAlertflg(entity.getAlertflg());
        dto.setReverseFlg(entity.getReverseFlg());
        dto.setReverseListOutputFlg(entity.getReverseListOutputFlg());
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
                    relationDto.getTTrpickdetailList().add(dto);
                }
            } else {
                MLocationDtoMapper mapper = new MLocationDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTTrpickdetailList();
                MLocationDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMLocation(relationDto);
                if (reverseReference) {
                    relationDto.getTTrpickdetailList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMLocation());
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
                    relationDto.getTTrpickdetailList().add(dto);
                }
            } else {
                TStockDtoMapper mapper = new TStockDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTTrpickdetailList();
                TStockDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setTStock(relationDto);
                if (reverseReference) {
                    relationDto.getTTrpickdetailList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getTStock());
                }
            }
        };
        if (!_suppressTYtrsodetail && entity.getTYtrsodetail() != null) {
            TYtrsodetail relationEntity = entity.getTYtrsodetail();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                TYtrsodetailDto relationDto = (TYtrsodetailDto)cachedDto;
                dto.setTYtrsodetail(relationDto);
                if (reverseReference) {
                    relationDto.getTTrpickdetailList().add(dto);
                }
            } else {
                TYtrsodetailDtoMapper mapper = new TYtrsodetailDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTTrpickdetailList();
                TYtrsodetailDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setTYtrsodetail(relationDto);
                if (reverseReference) {
                    relationDto.getTTrpickdetailList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getTYtrsodetail());
                }
            }
        };
        if (!_suppressTTrPicklistList && !entity.getTTrPicklistList().isEmpty()) {
            TTrPicklistDtoMapper mapper = new TTrPicklistDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressTTrpickdetail();
            List<TTrPicklistDto> relationDtoList = mapper.mappingToDtoList(entity.getTTrPicklistList());
            dto.setTTrPicklistList(relationDtoList);
            if (reverseReference) {
                for (TTrPicklistDto relationDto : relationDtoList) {
                    relationDto.setTTrpickdetail(dto);
                }
            }
        };
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<TTrpickdetailDto> mappingToDtoList(List<TTrpickdetail> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<TTrpickdetailDto> dtoList = new ArrayList<TTrpickdetailDto>();
        for (TTrpickdetail entity : entityList) {
            TTrpickdetailDto dto = mappingToDto(entity);
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
    public TTrpickdetail mappingToEntity(TTrpickdetailDto dto) {
        if (dto == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Object localKey = createInstanceKeyDto(dto, dto.instanceHash());
        Entity cachedLocalEntity = instanceCache ? _relationEntityMap.get(localKey) : null;
        if (cachedLocalEntity != null) {
            return (TTrpickdetail)cachedLocalEntity;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        TTrpickdetail entity = new TTrpickdetail();
        if (needsMapping(dto, dto.getTrpickdetailId(), "trpickdetailId")) {
            entity.setTrpickdetailId(dto.getTrpickdetailId());
        }
        if (needsMapping(dto, dto.getTrsodetailId(), "trsodetailId")) {
            entity.setTrsodetailId(dto.getTrsodetailId());
        }
        if (needsMapping(dto, dto.getMoveInstHId(), "moveInstHId")) {
            entity.setMoveInstHId(dto.getMoveInstHId());
        }
        if (needsMapping(dto, dto.getStockId(), "stockId")) {
            entity.setStockId(dto.getStockId());
        }
        if (needsMapping(dto, dto.getLocationId(), "locationId")) {
            entity.setLocationId(dto.getLocationId());
        }
        if (needsMapping(dto, dto.getPickBatchKey(), "pickBatchKey")) {
            entity.setPickBatchKey(dto.getPickBatchKey());
        }
        if (needsMapping(dto, dto.getPickBatchLineNo(), "pickBatchLineNo")) {
            entity.setPickBatchLineNo(dto.getPickBatchLineNo());
        }
        if (needsMapping(dto, dto.getProductCd(), "productCd")) {
            entity.setProductCd(dto.getProductCd());
        }
        if (needsMapping(dto, dto.getIfitemCd(), "ifitemCd")) {
            entity.setIfitemCd(dto.getIfitemCd());
        }
        if (needsMapping(dto, dto.getLotId(), "lotId")) {
            entity.setLotId(dto.getLotId());
        }
        if (needsMapping(dto, dto.getLocationCd(), "locationCd")) {
            entity.setLocationCd(dto.getLocationCd());
        }
        if (needsMapping(dto, dto.getExpectQty(), "expectQty")) {
            entity.setExpectQty(dto.getExpectQty());
        }
        if (needsMapping(dto, dto.getPickedQty(), "pickedQty")) {
            entity.setPickedQty(dto.getPickedQty());
        }
        if (needsMapping(dto, dto.getSortedQty(), "sortedQty")) {
            entity.setSortedQty(dto.getSortedQty());
        }
        if (needsMapping(dto, dto.getShippedQty(), "shippedQty")) {
            entity.setShippedQty(dto.getShippedQty());
        }
        if (needsMapping(dto, dto.getPickUserCd(), "pickUserCd")) {
            entity.setPickUserCd(dto.getPickUserCd());
        }
        if (needsMapping(dto, dto.getLabelPrintedFlg(), "labelPrintedFlg")) {
            entity.setLabelPrintedFlg(dto.getLabelPrintedFlg());
        }
        if (needsMapping(dto, dto.getMonthFlg(), "monthFlg")) {
            entity.setMonthFlg(dto.getMonthFlg());
        }
        if (needsMapping(dto, dto.getPlBatchKey(), "plBatchKey")) {
            entity.setPlBatchKey(dto.getPlBatchKey());
        }
        if (needsMapping(dto, dto.getWorkallocatename(), "workallocatename")) {
            entity.setWorkallocatename(dto.getWorkallocatename());
        }
        if (needsMapping(dto, dto.getAlertflg(), "alertflg")) {
            entity.setAlertflg(dto.getAlertflg());
        }
        if (needsMapping(dto, dto.getReverseFlg(), "reverseFlg")) {
            entity.setReverseFlg(dto.getReverseFlg());
        }
        if (needsMapping(dto, dto.getReverseListOutputFlg(), "reverseListOutputFlg")) {
            entity.setReverseListOutputFlg(dto.getReverseListOutputFlg());
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
                    relationEntity.getTTrpickdetailList().add(entity);
                }
            } else {
                MLocationDtoMapper mapper = new MLocationDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTTrpickdetailList();
                MLocation relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMLocation(relationEntity);
                if (reverseReference) {
                    relationEntity.getTTrpickdetailList().add(entity);
                }
                if (instanceCache && entity.getMLocation().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMLocation());
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
                    relationEntity.getTTrpickdetailList().add(entity);
                }
            } else {
                TStockDtoMapper mapper = new TStockDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTTrpickdetailList();
                TStock relationEntity = mapper.mappingToEntity(relationDto);
                entity.setTStock(relationEntity);
                if (reverseReference) {
                    relationEntity.getTTrpickdetailList().add(entity);
                }
                if (instanceCache && entity.getTStock().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getTStock());
                }
            }
        };
        if (!_suppressTYtrsodetail && dto.getTYtrsodetail() != null) {
            TYtrsodetailDto relationDto = dto.getTYtrsodetail();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                TYtrsodetail relationEntity = (TYtrsodetail)cachedEntity;
                entity.setTYtrsodetail(relationEntity);
                if (reverseReference) {
                    relationEntity.getTTrpickdetailList().add(entity);
                }
            } else {
                TYtrsodetailDtoMapper mapper = new TYtrsodetailDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTTrpickdetailList();
                TYtrsodetail relationEntity = mapper.mappingToEntity(relationDto);
                entity.setTYtrsodetail(relationEntity);
                if (reverseReference) {
                    relationEntity.getTTrpickdetailList().add(entity);
                }
                if (instanceCache && entity.getTYtrsodetail().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getTYtrsodetail());
                }
            }
        };
        if (!_suppressTTrPicklistList && !dto.getTTrPicklistList().isEmpty()) {
            TTrPicklistDtoMapper mapper = new TTrPicklistDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressTTrpickdetail();
            List<TTrPicklist> relationEntityList = mapper.mappingToEntityList(dto.getTTrPicklistList());
            entity.setTTrPicklistList(relationEntityList);
            if (reverseReference) {
                for (TTrPicklist relationEntity : relationEntityList) {
                    relationEntity.setTTrpickdetail(entity);
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
    protected boolean needsMapping(TTrpickdetailDto dto, Object value, String propName) {
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
    public List<TTrpickdetail> mappingToEntityList(List<TTrpickdetailDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<TTrpickdetail> entityList = new ArrayList<TTrpickdetail>();
        for (TTrpickdetailDto dto : dtoList) {
            TTrpickdetail entity = mappingToEntity(dto);
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
    public void suppressTStock() {
        _suppressTStock = true;
    }
    public void suppressTYtrsodetail() {
        _suppressTYtrsodetail = true;
    }
    public void suppressTTrPicklistList() {
        _suppressTTrPicklistList = true;
    }
    protected void doSuppressAll() { // internal
        suppressMLocation();
        suppressTStock();
        suppressTYtrsodetail();
        suppressTTrPicklistList();
    }
    protected void doSuppressClear() { // internal
        _suppressMLocation = false;
        _suppressTStock = false;
        _suppressTYtrsodetail = false;
        _suppressTTrPicklistList = false;
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
    public TTrpickdetailDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (TTrpickdetailDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public TTrpickdetailDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (TTrpickdetailDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public TTrpickdetailDtoMapper reverseReference() {
        setReverseReference(true);
        return (TTrpickdetailDtoMapper)this;
    }
}
