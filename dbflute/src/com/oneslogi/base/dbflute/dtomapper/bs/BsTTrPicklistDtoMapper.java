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
 * The DTO mapper of T_TR_PICKLIST as TABLE. <br>
 * 山出しリスト
 * <pre>
 * [primary-key]
 *     T_TR_PICKLIST_ID
 *
 * [column]
 *     T_TR_PICKLIST_ID, TRPICKDETAIL_ID, PICK_LIST_KEY, PICKLIST_G_NO, PL_BATCH_KEY, STOCK_ID, LOT_ID, PICKLIST_DATE, PRODUCT_CD, MANUFACTURE_DATE, DESIGN_FLG, MONTH_FLG, DAILY_FLG, FRONT_RACK_FLG, LOC_FLG, STD_DIF_FLG, ORDER_TYPE, SHIP_TOSUB, RMA_NO, SOTED_LOCATION_ID, SOTED_LOCATION_CD, ALLOC_LOCATION_ID, ALLOC_LOCATION_CD, ROOT_OUT_SEQ, DIRECTION_COMMENT, QTY_CASE, QTY_BOWL, QTY, HT_QTY_CASE, HT_QTY_BOWL, HT_QTY, COMPLETE_STS, START_TIME, END_TIME, USER_CD, SUPPLIERCD, SCHDATE, CASE_OUT_NUMBER, CENTER_ID, CLIENT_ID, LINE_BLOCK, SORTING_RACK_NO, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     T_TR_PICKLIST_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     T_TRPICKDETAIL
 *
 * [referrer-table]
 *     T_TRPICKLISTEXP
 *
 * [foreign-property]
 *     tTrpickdetail
 *
 * [referrer-property]
 *     tTrpicklistexpList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsTTrPicklistDtoMapper implements DtoMapper<TTrPicklist, TTrPicklistDto>, Serializable {

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
    protected boolean _suppressTTrpickdetail;
    protected boolean _suppressTTrpicklistexpList;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTTrPicklistDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsTTrPicklistDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public TTrPicklistDto mappingToDto(TTrPicklist entity) {
        if (entity == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Entity localKey = createInstanceKeyEntity(entity);
        Object cachedLocalDto = instanceCache ? _relationDtoMap.get(localKey) : null;
        if (cachedLocalDto != null) {
            return (TTrPicklistDto)cachedLocalDto;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        TTrPicklistDto dto = new TTrPicklistDto();
        dto.setTTrPicklistId(entity.getTTrPicklistId());
        dto.setTrpickdetailId(entity.getTrpickdetailId());
        dto.setPickListKey(entity.getPickListKey());
        dto.setPicklistGNo(entity.getPicklistGNo());
        dto.setPlBatchKey(entity.getPlBatchKey());
        dto.setStockId(entity.getStockId());
        dto.setLotId(entity.getLotId());
        dto.setPicklistDate(entity.getPicklistDate());
        dto.setProductCd(entity.getProductCd());
        dto.setManufactureDate(entity.getManufactureDate());
        dto.setDesignFlg(entity.getDesignFlg());
        dto.setMonthFlg(entity.getMonthFlg());
        dto.setDailyFlg(entity.getDailyFlg());
        dto.setFrontRackFlg(entity.getFrontRackFlg());
        dto.setLocFlg(entity.getLocFlg());
        dto.setStdDifFlg(entity.getStdDifFlg());
        dto.setOrderType(entity.getOrderType());
        dto.setShipTosub(entity.getShipTosub());
        dto.setRmaNo(entity.getRmaNo());
        dto.setSotedLocationId(entity.getSotedLocationId());
        dto.setSotedLocationCd(entity.getSotedLocationCd());
        dto.setAllocLocationId(entity.getAllocLocationId());
        dto.setAllocLocationCd(entity.getAllocLocationCd());
        dto.setRootOutSeq(entity.getRootOutSeq());
        dto.setDirectionComment(entity.getDirectionComment());
        dto.setQtyCase(entity.getQtyCase());
        dto.setQtyBowl(entity.getQtyBowl());
        dto.setQty(entity.getQty());
        dto.setHtQtyCase(entity.getHtQtyCase());
        dto.setHtQtyBowl(entity.getHtQtyBowl());
        dto.setHtQty(entity.getHtQty());
        dto.setCompleteSts(entity.getCompleteSts());
        dto.setStartTime(entity.getStartTime());
        dto.setEndTime(entity.getEndTime());
        dto.setUserCd(entity.getUserCd());
        dto.setSuppliercd(entity.getSuppliercd());
        dto.setSchdate(entity.getSchdate());
        dto.setCaseOutNumber(entity.getCaseOutNumber());
        dto.setCenterId(entity.getCenterId());
        dto.setClientId(entity.getClientId());
        dto.setLineBlock(entity.getLineBlock());
        dto.setSortingRackNo(entity.getSortingRackNo());
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
        if (!_suppressTTrpickdetail && entity.getTTrpickdetail() != null) {
            TTrpickdetail relationEntity = entity.getTTrpickdetail();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                TTrpickdetailDto relationDto = (TTrpickdetailDto)cachedDto;
                dto.setTTrpickdetail(relationDto);
                if (reverseReference) {
                    relationDto.getTTrPicklistList().add(dto);
                }
            } else {
                TTrpickdetailDtoMapper mapper = new TTrpickdetailDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTTrPicklistList();
                TTrpickdetailDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setTTrpickdetail(relationDto);
                if (reverseReference) {
                    relationDto.getTTrPicklistList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getTTrpickdetail());
                }
            }
        };
        if (!_suppressTTrpicklistexpList && !entity.getTTrpicklistexpList().isEmpty()) {
            TTrpicklistexpDtoMapper mapper = new TTrpicklistexpDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressTTrPicklist();
            List<TTrpicklistexpDto> relationDtoList = mapper.mappingToDtoList(entity.getTTrpicklistexpList());
            dto.setTTrpicklistexpList(relationDtoList);
            if (reverseReference) {
                for (TTrpicklistexpDto relationDto : relationDtoList) {
                    relationDto.setTTrPicklist(dto);
                }
            }
        };
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<TTrPicklistDto> mappingToDtoList(List<TTrPicklist> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<TTrPicklistDto> dtoList = new ArrayList<TTrPicklistDto>();
        for (TTrPicklist entity : entityList) {
            TTrPicklistDto dto = mappingToDto(entity);
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
    public TTrPicklist mappingToEntity(TTrPicklistDto dto) {
        if (dto == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Object localKey = createInstanceKeyDto(dto, dto.instanceHash());
        Entity cachedLocalEntity = instanceCache ? _relationEntityMap.get(localKey) : null;
        if (cachedLocalEntity != null) {
            return (TTrPicklist)cachedLocalEntity;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        TTrPicklist entity = new TTrPicklist();
        if (needsMapping(dto, dto.getTTrPicklistId(), "TTrPicklistId")) {
            entity.setTTrPicklistId(dto.getTTrPicklistId());
        }
        if (needsMapping(dto, dto.getTrpickdetailId(), "trpickdetailId")) {
            entity.setTrpickdetailId(dto.getTrpickdetailId());
        }
        if (needsMapping(dto, dto.getPickListKey(), "pickListKey")) {
            entity.setPickListKey(dto.getPickListKey());
        }
        if (needsMapping(dto, dto.getPicklistGNo(), "picklistGNo")) {
            entity.setPicklistGNo(dto.getPicklistGNo());
        }
        if (needsMapping(dto, dto.getPlBatchKey(), "plBatchKey")) {
            entity.setPlBatchKey(dto.getPlBatchKey());
        }
        if (needsMapping(dto, dto.getStockId(), "stockId")) {
            entity.setStockId(dto.getStockId());
        }
        if (needsMapping(dto, dto.getLotId(), "lotId")) {
            entity.setLotId(dto.getLotId());
        }
        if (needsMapping(dto, dto.getPicklistDate(), "picklistDate")) {
            entity.setPicklistDate(dto.getPicklistDate());
        }
        if (needsMapping(dto, dto.getProductCd(), "productCd")) {
            entity.setProductCd(dto.getProductCd());
        }
        if (needsMapping(dto, dto.getManufactureDate(), "manufactureDate")) {
            entity.setManufactureDate(dto.getManufactureDate());
        }
        if (needsMapping(dto, dto.getDesignFlg(), "designFlg")) {
            entity.setDesignFlg(dto.getDesignFlg());
        }
        if (needsMapping(dto, dto.getMonthFlg(), "monthFlg")) {
            entity.setMonthFlg(dto.getMonthFlg());
        }
        if (needsMapping(dto, dto.getDailyFlg(), "dailyFlg")) {
            entity.setDailyFlg(dto.getDailyFlg());
        }
        if (needsMapping(dto, dto.getFrontRackFlg(), "frontRackFlg")) {
            entity.setFrontRackFlg(dto.getFrontRackFlg());
        }
        if (needsMapping(dto, dto.getLocFlg(), "locFlg")) {
            entity.setLocFlg(dto.getLocFlg());
        }
        if (needsMapping(dto, dto.getStdDifFlg(), "stdDifFlg")) {
            entity.setStdDifFlg(dto.getStdDifFlg());
        }
        if (needsMapping(dto, dto.getOrderType(), "orderType")) {
            entity.setOrderType(dto.getOrderType());
        }
        if (needsMapping(dto, dto.getShipTosub(), "shipTosub")) {
            entity.setShipTosub(dto.getShipTosub());
        }
        if (needsMapping(dto, dto.getRmaNo(), "rmaNo")) {
            entity.setRmaNo(dto.getRmaNo());
        }
        if (needsMapping(dto, dto.getSotedLocationId(), "sotedLocationId")) {
            entity.setSotedLocationId(dto.getSotedLocationId());
        }
        if (needsMapping(dto, dto.getSotedLocationCd(), "sotedLocationCd")) {
            entity.setSotedLocationCd(dto.getSotedLocationCd());
        }
        if (needsMapping(dto, dto.getAllocLocationId(), "allocLocationId")) {
            entity.setAllocLocationId(dto.getAllocLocationId());
        }
        if (needsMapping(dto, dto.getAllocLocationCd(), "allocLocationCd")) {
            entity.setAllocLocationCd(dto.getAllocLocationCd());
        }
        if (needsMapping(dto, dto.getRootOutSeq(), "rootOutSeq")) {
            entity.setRootOutSeq(dto.getRootOutSeq());
        }
        if (needsMapping(dto, dto.getDirectionComment(), "directionComment")) {
            entity.setDirectionComment(dto.getDirectionComment());
        }
        if (needsMapping(dto, dto.getQtyCase(), "qtyCase")) {
            entity.setQtyCase(dto.getQtyCase());
        }
        if (needsMapping(dto, dto.getQtyBowl(), "qtyBowl")) {
            entity.setQtyBowl(dto.getQtyBowl());
        }
        if (needsMapping(dto, dto.getQty(), "qty")) {
            entity.setQty(dto.getQty());
        }
        if (needsMapping(dto, dto.getHtQtyCase(), "htQtyCase")) {
            entity.setHtQtyCase(dto.getHtQtyCase());
        }
        if (needsMapping(dto, dto.getHtQtyBowl(), "htQtyBowl")) {
            entity.setHtQtyBowl(dto.getHtQtyBowl());
        }
        if (needsMapping(dto, dto.getHtQty(), "htQty")) {
            entity.setHtQty(dto.getHtQty());
        }
        if (needsMapping(dto, dto.getCompleteSts(), "completeSts")) {
            entity.setCompleteSts(dto.getCompleteSts());
        }
        if (needsMapping(dto, dto.getStartTime(), "startTime")) {
            entity.setStartTime(dto.getStartTime());
        }
        if (needsMapping(dto, dto.getEndTime(), "endTime")) {
            entity.setEndTime(dto.getEndTime());
        }
        if (needsMapping(dto, dto.getUserCd(), "userCd")) {
            entity.setUserCd(dto.getUserCd());
        }
        if (needsMapping(dto, dto.getSuppliercd(), "suppliercd")) {
            entity.setSuppliercd(dto.getSuppliercd());
        }
        if (needsMapping(dto, dto.getSchdate(), "schdate")) {
            entity.setSchdate(dto.getSchdate());
        }
        if (needsMapping(dto, dto.getCaseOutNumber(), "caseOutNumber")) {
            entity.setCaseOutNumber(dto.getCaseOutNumber());
        }
        if (needsMapping(dto, dto.getCenterId(), "centerId")) {
            entity.setCenterId(dto.getCenterId());
        }
        if (needsMapping(dto, dto.getClientId(), "clientId")) {
            entity.setClientId(dto.getClientId());
        }
        if (needsMapping(dto, dto.getLineBlock(), "lineBlock")) {
            entity.setLineBlock(dto.getLineBlock());
        }
        if (needsMapping(dto, dto.getSortingRackNo(), "sortingRackNo")) {
            entity.setSortingRackNo(dto.getSortingRackNo());
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
        if (!_suppressTTrpickdetail && dto.getTTrpickdetail() != null) {
            TTrpickdetailDto relationDto = dto.getTTrpickdetail();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                TTrpickdetail relationEntity = (TTrpickdetail)cachedEntity;
                entity.setTTrpickdetail(relationEntity);
                if (reverseReference) {
                    relationEntity.getTTrPicklistList().add(entity);
                }
            } else {
                TTrpickdetailDtoMapper mapper = new TTrpickdetailDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTTrPicklistList();
                TTrpickdetail relationEntity = mapper.mappingToEntity(relationDto);
                entity.setTTrpickdetail(relationEntity);
                if (reverseReference) {
                    relationEntity.getTTrPicklistList().add(entity);
                }
                if (instanceCache && entity.getTTrpickdetail().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getTTrpickdetail());
                }
            }
        };
        if (!_suppressTTrpicklistexpList && !dto.getTTrpicklistexpList().isEmpty()) {
            TTrpicklistexpDtoMapper mapper = new TTrpicklistexpDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressTTrPicklist();
            List<TTrpicklistexp> relationEntityList = mapper.mappingToEntityList(dto.getTTrpicklistexpList());
            entity.setTTrpicklistexpList(relationEntityList);
            if (reverseReference) {
                for (TTrpicklistexp relationEntity : relationEntityList) {
                    relationEntity.setTTrPicklist(entity);
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
    protected boolean needsMapping(TTrPicklistDto dto, Object value, String propName) {
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
    public List<TTrPicklist> mappingToEntityList(List<TTrPicklistDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<TTrPicklist> entityList = new ArrayList<TTrPicklist>();
        for (TTrPicklistDto dto : dtoList) {
            TTrPicklist entity = mappingToEntity(dto);
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
    public void suppressTTrpickdetail() {
        _suppressTTrpickdetail = true;
    }
    public void suppressTTrpicklistexpList() {
        _suppressTTrpicklistexpList = true;
    }
    protected void doSuppressAll() { // internal
        suppressTTrpickdetail();
        suppressTTrpicklistexpList();
    }
    protected void doSuppressClear() { // internal
        _suppressTTrpickdetail = false;
        _suppressTTrpicklistexpList = false;
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
    public TTrPicklistDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (TTrPicklistDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public TTrPicklistDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (TTrPicklistDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public TTrPicklistDtoMapper reverseReference() {
        setReverseReference(true);
        return (TTrPicklistDtoMapper)this;
    }
}
