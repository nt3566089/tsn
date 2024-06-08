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
 * The DTO mapper of H_RECEIVE_B as TABLE. <br>
 * 入荷ボディ履歴
 * <pre>
 * [primary-key]
 *     STORE_RECORD_B_ID
 *
 * [column]
 *     STORE_RECORD_B_ID, STORE_RECORD_H_ID, STOCK_ID, PLAN_NUM, PROCESS_NO, STORE_DT, STORE_NUM, STORE_FLG, STORE_LOCATION_ID, STORE_LOCATION_CD, STORE_LOCATION_NM, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
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
 *     H_STOCK, H_RECEIVE_H, B_CLASS_DTL(ByStoreFlg), H_RECEIVE_SPARE(AsOne)
 *
 * [referrer-table]
 *     H_RECEIVE_SPARE
 *
 * [foreign-property]
 *     hStock, hReceiveH, bClassDtlByStoreFlg, hReceiveSpareAsOne
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsHReceiveBDtoMapper implements DtoMapper<HReceiveB, HReceiveBDto>, Serializable {

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
    protected boolean _suppressHStock;
    protected boolean _suppressHReceiveH;
    protected boolean _suppressBClassDtlByStoreFlg;
    protected boolean _suppressHReceiveSpareAsOne;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsHReceiveBDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsHReceiveBDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public HReceiveBDto mappingToDto(HReceiveB entity) {
        if (entity == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Entity localKey = createInstanceKeyEntity(entity);
        Object cachedLocalDto = instanceCache ? _relationDtoMap.get(localKey) : null;
        if (cachedLocalDto != null) {
            return (HReceiveBDto)cachedLocalDto;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        HReceiveBDto dto = new HReceiveBDto();
        dto.setStoreRecordBId(entity.getStoreRecordBId());
        dto.setStoreRecordHId(entity.getStoreRecordHId());
        dto.setStockId(entity.getStockId());
        dto.setPlanNum(entity.getPlanNum());
        dto.setProcessNo(entity.getProcessNo());
        dto.setStoreDt(entity.getStoreDt());
        dto.setStoreNum(entity.getStoreNum());
        dto.setStoreFlg(entity.getStoreFlg());
        dto.setStoreLocationId(entity.getStoreLocationId());
        dto.setStoreLocationCd(entity.getStoreLocationCd());
        dto.setStoreLocationNm(entity.getStoreLocationNm());
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
        if (!_suppressHStock && entity.getHStock() != null) {
            HStock relationEntity = entity.getHStock();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                HStockDto relationDto = (HStockDto)cachedDto;
                dto.setHStock(relationDto);
                if (reverseReference) {
                    relationDto.getHReceiveBList().add(dto);
                }
            } else {
                HStockDtoMapper mapper = new HStockDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressHReceiveBList();
                HStockDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setHStock(relationDto);
                if (reverseReference) {
                    relationDto.getHReceiveBList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getHStock());
                }
            }
        };
        if (!_suppressHReceiveH && entity.getHReceiveH() != null) {
            HReceiveH relationEntity = entity.getHReceiveH();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                HReceiveHDto relationDto = (HReceiveHDto)cachedDto;
                dto.setHReceiveH(relationDto);
                if (reverseReference) {
                    relationDto.getHReceiveBList().add(dto);
                }
            } else {
                HReceiveHDtoMapper mapper = new HReceiveHDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressHReceiveBList();
                HReceiveHDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setHReceiveH(relationDto);
                if (reverseReference) {
                    relationDto.getHReceiveBList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getHReceiveH());
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
        if (!_suppressHReceiveSpareAsOne && entity.getHReceiveSpareAsOne() != null) {
            HReceiveSpare relationEntity = entity.getHReceiveSpareAsOne();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                HReceiveSpareDto relationDto = (HReceiveSpareDto)cachedDto;
                dto.setHReceiveSpareAsOne(relationDto);
                if (reverseReference) {
                    relationDto.setHReceiveB(dto);
                }
            } else {
                HReceiveSpareDtoMapper mapper = new HReceiveSpareDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressHReceiveB();
                HReceiveSpareDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setHReceiveSpareAsOne(relationDto);
                if (reverseReference) {
                    relationDto.setHReceiveB(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getHReceiveSpareAsOne());
                }
            }
        };
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<HReceiveBDto> mappingToDtoList(List<HReceiveB> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<HReceiveBDto> dtoList = new ArrayList<HReceiveBDto>();
        for (HReceiveB entity : entityList) {
            HReceiveBDto dto = mappingToDto(entity);
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
    public HReceiveB mappingToEntity(HReceiveBDto dto) {
        if (dto == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Object localKey = createInstanceKeyDto(dto, dto.instanceHash());
        Entity cachedLocalEntity = instanceCache ? _relationEntityMap.get(localKey) : null;
        if (cachedLocalEntity != null) {
            return (HReceiveB)cachedLocalEntity;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        HReceiveB entity = new HReceiveB();
        if (needsMapping(dto, dto.getStoreRecordBId(), "storeRecordBId")) {
            entity.setStoreRecordBId(dto.getStoreRecordBId());
        }
        if (needsMapping(dto, dto.getStoreRecordHId(), "storeRecordHId")) {
            entity.setStoreRecordHId(dto.getStoreRecordHId());
        }
        if (needsMapping(dto, dto.getStockId(), "stockId")) {
            entity.setStockId(dto.getStockId());
        }
        if (needsMapping(dto, dto.getPlanNum(), "planNum")) {
            entity.setPlanNum(dto.getPlanNum());
        }
        if (needsMapping(dto, dto.getProcessNo(), "processNo")) {
            entity.setProcessNo(dto.getProcessNo());
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
        if (needsMapping(dto, dto.getStoreLocationCd(), "storeLocationCd")) {
            entity.setStoreLocationCd(dto.getStoreLocationCd());
        }
        if (needsMapping(dto, dto.getStoreLocationNm(), "storeLocationNm")) {
            entity.setStoreLocationNm(dto.getStoreLocationNm());
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
        if (!_suppressHStock && dto.getHStock() != null) {
            HStockDto relationDto = dto.getHStock();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                HStock relationEntity = (HStock)cachedEntity;
                entity.setHStock(relationEntity);
                if (reverseReference) {
                    relationEntity.getHReceiveBList().add(entity);
                }
            } else {
                HStockDtoMapper mapper = new HStockDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressHReceiveBList();
                HStock relationEntity = mapper.mappingToEntity(relationDto);
                entity.setHStock(relationEntity);
                if (reverseReference) {
                    relationEntity.getHReceiveBList().add(entity);
                }
                if (instanceCache && entity.getHStock().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getHStock());
                }
            }
        };
        if (!_suppressHReceiveH && dto.getHReceiveH() != null) {
            HReceiveHDto relationDto = dto.getHReceiveH();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                HReceiveH relationEntity = (HReceiveH)cachedEntity;
                entity.setHReceiveH(relationEntity);
                if (reverseReference) {
                    relationEntity.getHReceiveBList().add(entity);
                }
            } else {
                HReceiveHDtoMapper mapper = new HReceiveHDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressHReceiveBList();
                HReceiveH relationEntity = mapper.mappingToEntity(relationDto);
                entity.setHReceiveH(relationEntity);
                if (reverseReference) {
                    relationEntity.getHReceiveBList().add(entity);
                }
                if (instanceCache && entity.getHReceiveH().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getHReceiveH());
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
        if (!_suppressHReceiveSpareAsOne && dto.getHReceiveSpareAsOne() != null) {
            HReceiveSpareDto relationDto = dto.getHReceiveSpareAsOne();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                HReceiveSpare relationEntity = (HReceiveSpare)cachedEntity;
                entity.setHReceiveSpareAsOne(relationEntity);
                if (reverseReference) {
                    relationEntity.setHReceiveB(entity);
                }
            } else {
                HReceiveSpareDtoMapper mapper = new HReceiveSpareDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressHReceiveB();
                HReceiveSpare relationEntity = mapper.mappingToEntity(relationDto);
                entity.setHReceiveSpareAsOne(relationEntity);
                if (reverseReference) {
                    relationEntity.setHReceiveB(entity);
                }
                if (instanceCache && entity.getHReceiveSpareAsOne().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getHReceiveSpareAsOne());
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
    protected boolean needsMapping(HReceiveBDto dto, Object value, String propName) {
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
    public List<HReceiveB> mappingToEntityList(List<HReceiveBDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<HReceiveB> entityList = new ArrayList<HReceiveB>();
        for (HReceiveBDto dto : dtoList) {
            HReceiveB entity = mappingToEntity(dto);
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
    public void suppressHStock() {
        _suppressHStock = true;
    }
    public void suppressHReceiveH() {
        _suppressHReceiveH = true;
    }
    public void suppressBClassDtlByStoreFlg() {
        _suppressBClassDtlByStoreFlg = true;
    }
    public void suppressHReceiveSpareAsOne() {
        _suppressHReceiveSpareAsOne = true;
    }
    protected void doSuppressAll() { // internal
        suppressHStock();
        suppressHReceiveH();
        suppressBClassDtlByStoreFlg();
        suppressHReceiveSpareAsOne();
    }
    protected void doSuppressClear() { // internal
        _suppressHStock = false;
        _suppressHReceiveH = false;
        _suppressBClassDtlByStoreFlg = false;
        _suppressHReceiveSpareAsOne = false;
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
    public HReceiveBDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (HReceiveBDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public HReceiveBDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (HReceiveBDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public HReceiveBDtoMapper reverseReference() {
        setReverseReference(true);
        return (HReceiveBDtoMapper)this;
    }
}
