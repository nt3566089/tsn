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
 * The DTO mapper of T_STOCK_REPORT as TABLE. <br>
 * 在庫日報
 * <pre>
 * [primary-key]
 *     STOCK_ID
 *
 * [column]
 *     STOCK_ID, STORE_NUM_DAY, PICKING_NUM_DAY, MOVE_PLS_NUM_DAY, MOVE_MNS_NUM_DAY, ADJ_PLS_NUM_DAY, ADJ_MNS_NUM_DAY, P_CHARGE_NUM_DAY, P_ALLOC_NUM_DAY, P_MOVE_NUM_DAY, P_TRANSIT_NUM_DAY, STORE_NUM_MONTH, PICKING_NUM_MONTH, MOVE_PLS_NUM_MONTH, MOVE_MNS_NUM_MONTH, ADJ_PLS_NUM_MONTH, ADJ_MNS_NUM_MONTH, P_CHARGE_NUM_MONTH, P_ALLOC_NUM_MONTH, P_MOVE_NUM_MONTH, P_TRANSIT_NUM_MONTH, CHARGE_NUM_10, ALLOC_NUM_10, MOVE_NUM_10, TRANSIT_NUM_10, CHARGE_NUM_15, ALLOC_NUM_15, MOVE_NUM_15, TRANSIT_NUM_15, CHARGE_NUM_20, ALLOC_NUM_20, MOVE_NUM_20, TRANSIT_NUM_20, CHARGE_NUM_LAST, ALLOC_NUM_LAST, MOVE_NUM_LAST, TRANSIT_NUM_LAST, LAST_STORE_DT, LAST_PICKING_DT, LASTRECEIVEDATE, LASTSHIPDATE, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     STOCK_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     T_STOCK
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     tStock
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsTStockReportDtoMapper implements DtoMapper<TStockReport, TStockReportDto>, Serializable {

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

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTStockReportDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsTStockReportDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public TStockReportDto mappingToDto(TStockReport entity) {
        if (entity == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Entity localKey = createInstanceKeyEntity(entity);
        Object cachedLocalDto = instanceCache ? _relationDtoMap.get(localKey) : null;
        if (cachedLocalDto != null) {
            return (TStockReportDto)cachedLocalDto;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        TStockReportDto dto = new TStockReportDto();
        dto.setStockId(entity.getStockId());
        dto.setStoreNumDay(entity.getStoreNumDay());
        dto.setPickingNumDay(entity.getPickingNumDay());
        dto.setMovePlsNumDay(entity.getMovePlsNumDay());
        dto.setMoveMnsNumDay(entity.getMoveMnsNumDay());
        dto.setAdjPlsNumDay(entity.getAdjPlsNumDay());
        dto.setAdjMnsNumDay(entity.getAdjMnsNumDay());
        dto.setPChargeNumDay(entity.getPChargeNumDay());
        dto.setPAllocNumDay(entity.getPAllocNumDay());
        dto.setPMoveNumDay(entity.getPMoveNumDay());
        dto.setPTransitNumDay(entity.getPTransitNumDay());
        dto.setStoreNumMonth(entity.getStoreNumMonth());
        dto.setPickingNumMonth(entity.getPickingNumMonth());
        dto.setMovePlsNumMonth(entity.getMovePlsNumMonth());
        dto.setMoveMnsNumMonth(entity.getMoveMnsNumMonth());
        dto.setAdjPlsNumMonth(entity.getAdjPlsNumMonth());
        dto.setAdjMnsNumMonth(entity.getAdjMnsNumMonth());
        dto.setPChargeNumMonth(entity.getPChargeNumMonth());
        dto.setPAllocNumMonth(entity.getPAllocNumMonth());
        dto.setPMoveNumMonth(entity.getPMoveNumMonth());
        dto.setPTransitNumMonth(entity.getPTransitNumMonth());
        dto.setChargeNum10(entity.getChargeNum10());
        dto.setAllocNum10(entity.getAllocNum10());
        dto.setMoveNum10(entity.getMoveNum10());
        dto.setTransitNum10(entity.getTransitNum10());
        dto.setChargeNum15(entity.getChargeNum15());
        dto.setAllocNum15(entity.getAllocNum15());
        dto.setMoveNum15(entity.getMoveNum15());
        dto.setTransitNum15(entity.getTransitNum15());
        dto.setChargeNum20(entity.getChargeNum20());
        dto.setAllocNum20(entity.getAllocNum20());
        dto.setMoveNum20(entity.getMoveNum20());
        dto.setTransitNum20(entity.getTransitNum20());
        dto.setChargeNumLast(entity.getChargeNumLast());
        dto.setAllocNumLast(entity.getAllocNumLast());
        dto.setMoveNumLast(entity.getMoveNumLast());
        dto.setTransitNumLast(entity.getTransitNumLast());
        dto.setLastStoreDt(entity.getLastStoreDt());
        dto.setLastPickingDt(entity.getLastPickingDt());
        dto.setLastreceivedate(entity.getLastreceivedate());
        dto.setLastshipdate(entity.getLastshipdate());
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
                    relationDto.setTStockReportAsOne(dto);
                }
            } else {
                TStockDtoMapper mapper = new TStockDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTStockReportAsOne();
                TStockDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setTStock(relationDto);
                if (reverseReference) {
                    relationDto.setTStockReportAsOne(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getTStock());
                }
            }
        };
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<TStockReportDto> mappingToDtoList(List<TStockReport> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<TStockReportDto> dtoList = new ArrayList<TStockReportDto>();
        for (TStockReport entity : entityList) {
            TStockReportDto dto = mappingToDto(entity);
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
    public TStockReport mappingToEntity(TStockReportDto dto) {
        if (dto == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Object localKey = createInstanceKeyDto(dto, dto.instanceHash());
        Entity cachedLocalEntity = instanceCache ? _relationEntityMap.get(localKey) : null;
        if (cachedLocalEntity != null) {
            return (TStockReport)cachedLocalEntity;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        TStockReport entity = new TStockReport();
        if (needsMapping(dto, dto.getStockId(), "stockId")) {
            entity.setStockId(dto.getStockId());
        }
        if (needsMapping(dto, dto.getStoreNumDay(), "storeNumDay")) {
            entity.setStoreNumDay(dto.getStoreNumDay());
        }
        if (needsMapping(dto, dto.getPickingNumDay(), "pickingNumDay")) {
            entity.setPickingNumDay(dto.getPickingNumDay());
        }
        if (needsMapping(dto, dto.getMovePlsNumDay(), "movePlsNumDay")) {
            entity.setMovePlsNumDay(dto.getMovePlsNumDay());
        }
        if (needsMapping(dto, dto.getMoveMnsNumDay(), "moveMnsNumDay")) {
            entity.setMoveMnsNumDay(dto.getMoveMnsNumDay());
        }
        if (needsMapping(dto, dto.getAdjPlsNumDay(), "adjPlsNumDay")) {
            entity.setAdjPlsNumDay(dto.getAdjPlsNumDay());
        }
        if (needsMapping(dto, dto.getAdjMnsNumDay(), "adjMnsNumDay")) {
            entity.setAdjMnsNumDay(dto.getAdjMnsNumDay());
        }
        if (needsMapping(dto, dto.getPChargeNumDay(), "PChargeNumDay")) {
            entity.setPChargeNumDay(dto.getPChargeNumDay());
        }
        if (needsMapping(dto, dto.getPAllocNumDay(), "PAllocNumDay")) {
            entity.setPAllocNumDay(dto.getPAllocNumDay());
        }
        if (needsMapping(dto, dto.getPMoveNumDay(), "PMoveNumDay")) {
            entity.setPMoveNumDay(dto.getPMoveNumDay());
        }
        if (needsMapping(dto, dto.getPTransitNumDay(), "PTransitNumDay")) {
            entity.setPTransitNumDay(dto.getPTransitNumDay());
        }
        if (needsMapping(dto, dto.getStoreNumMonth(), "storeNumMonth")) {
            entity.setStoreNumMonth(dto.getStoreNumMonth());
        }
        if (needsMapping(dto, dto.getPickingNumMonth(), "pickingNumMonth")) {
            entity.setPickingNumMonth(dto.getPickingNumMonth());
        }
        if (needsMapping(dto, dto.getMovePlsNumMonth(), "movePlsNumMonth")) {
            entity.setMovePlsNumMonth(dto.getMovePlsNumMonth());
        }
        if (needsMapping(dto, dto.getMoveMnsNumMonth(), "moveMnsNumMonth")) {
            entity.setMoveMnsNumMonth(dto.getMoveMnsNumMonth());
        }
        if (needsMapping(dto, dto.getAdjPlsNumMonth(), "adjPlsNumMonth")) {
            entity.setAdjPlsNumMonth(dto.getAdjPlsNumMonth());
        }
        if (needsMapping(dto, dto.getAdjMnsNumMonth(), "adjMnsNumMonth")) {
            entity.setAdjMnsNumMonth(dto.getAdjMnsNumMonth());
        }
        if (needsMapping(dto, dto.getPChargeNumMonth(), "PChargeNumMonth")) {
            entity.setPChargeNumMonth(dto.getPChargeNumMonth());
        }
        if (needsMapping(dto, dto.getPAllocNumMonth(), "PAllocNumMonth")) {
            entity.setPAllocNumMonth(dto.getPAllocNumMonth());
        }
        if (needsMapping(dto, dto.getPMoveNumMonth(), "PMoveNumMonth")) {
            entity.setPMoveNumMonth(dto.getPMoveNumMonth());
        }
        if (needsMapping(dto, dto.getPTransitNumMonth(), "PTransitNumMonth")) {
            entity.setPTransitNumMonth(dto.getPTransitNumMonth());
        }
        if (needsMapping(dto, dto.getChargeNum10(), "chargeNum10")) {
            entity.setChargeNum10(dto.getChargeNum10());
        }
        if (needsMapping(dto, dto.getAllocNum10(), "allocNum10")) {
            entity.setAllocNum10(dto.getAllocNum10());
        }
        if (needsMapping(dto, dto.getMoveNum10(), "moveNum10")) {
            entity.setMoveNum10(dto.getMoveNum10());
        }
        if (needsMapping(dto, dto.getTransitNum10(), "transitNum10")) {
            entity.setTransitNum10(dto.getTransitNum10());
        }
        if (needsMapping(dto, dto.getChargeNum15(), "chargeNum15")) {
            entity.setChargeNum15(dto.getChargeNum15());
        }
        if (needsMapping(dto, dto.getAllocNum15(), "allocNum15")) {
            entity.setAllocNum15(dto.getAllocNum15());
        }
        if (needsMapping(dto, dto.getMoveNum15(), "moveNum15")) {
            entity.setMoveNum15(dto.getMoveNum15());
        }
        if (needsMapping(dto, dto.getTransitNum15(), "transitNum15")) {
            entity.setTransitNum15(dto.getTransitNum15());
        }
        if (needsMapping(dto, dto.getChargeNum20(), "chargeNum20")) {
            entity.setChargeNum20(dto.getChargeNum20());
        }
        if (needsMapping(dto, dto.getAllocNum20(), "allocNum20")) {
            entity.setAllocNum20(dto.getAllocNum20());
        }
        if (needsMapping(dto, dto.getMoveNum20(), "moveNum20")) {
            entity.setMoveNum20(dto.getMoveNum20());
        }
        if (needsMapping(dto, dto.getTransitNum20(), "transitNum20")) {
            entity.setTransitNum20(dto.getTransitNum20());
        }
        if (needsMapping(dto, dto.getChargeNumLast(), "chargeNumLast")) {
            entity.setChargeNumLast(dto.getChargeNumLast());
        }
        if (needsMapping(dto, dto.getAllocNumLast(), "allocNumLast")) {
            entity.setAllocNumLast(dto.getAllocNumLast());
        }
        if (needsMapping(dto, dto.getMoveNumLast(), "moveNumLast")) {
            entity.setMoveNumLast(dto.getMoveNumLast());
        }
        if (needsMapping(dto, dto.getTransitNumLast(), "transitNumLast")) {
            entity.setTransitNumLast(dto.getTransitNumLast());
        }
        if (needsMapping(dto, dto.getLastStoreDt(), "lastStoreDt")) {
            entity.setLastStoreDt(dto.getLastStoreDt());
        }
        if (needsMapping(dto, dto.getLastPickingDt(), "lastPickingDt")) {
            entity.setLastPickingDt(dto.getLastPickingDt());
        }
        if (needsMapping(dto, dto.getLastreceivedate(), "lastreceivedate")) {
            entity.setLastreceivedate(dto.getLastreceivedate());
        }
        if (needsMapping(dto, dto.getLastshipdate(), "lastshipdate")) {
            entity.setLastshipdate(dto.getLastshipdate());
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
                    relationEntity.setTStockReportAsOne(entity);
                }
            } else {
                TStockDtoMapper mapper = new TStockDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTStockReportAsOne();
                TStock relationEntity = mapper.mappingToEntity(relationDto);
                entity.setTStock(relationEntity);
                if (reverseReference) {
                    relationEntity.setTStockReportAsOne(entity);
                }
                if (instanceCache && entity.getTStock().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getTStock());
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
    protected boolean needsMapping(TStockReportDto dto, Object value, String propName) {
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
    public List<TStockReport> mappingToEntityList(List<TStockReportDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<TStockReport> entityList = new ArrayList<TStockReport>();
        for (TStockReportDto dto : dtoList) {
            TStockReport entity = mappingToEntity(dto);
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
    protected void doSuppressAll() { // internal
        suppressTStock();
    }
    protected void doSuppressClear() { // internal
        _suppressTStock = false;
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
    public TStockReportDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (TStockReportDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public TStockReportDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (TStockReportDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public TStockReportDtoMapper reverseReference() {
        setReverseReference(true);
        return (TStockReportDtoMapper)this;
    }
}
