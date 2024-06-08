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
 * The DTO mapper of M_CARRIER_ZIP as TABLE. <br>
 * 運送業者郵便番号マスタ
 * <pre>
 * [primary-key]
 *     CARRIER_ZIP_ID
 *
 * [column]
 *     CARRIER_ZIP_ID, COMMON_CARRIER_ID, ZIP_ID, ARRIVAL_STORE_CD, ARRIVAL_STORE_NM, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     CARRIER_ZIP_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     M_COMMON_CARRIER, M_ZIP
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     mCommonCarrier, mZip
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsMCarrierZipDtoMapper implements DtoMapper<MCarrierZip, MCarrierZipDto>, Serializable {

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
    protected boolean _suppressMCommonCarrier;
    protected boolean _suppressMZip;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMCarrierZipDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsMCarrierZipDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public MCarrierZipDto mappingToDto(MCarrierZip entity) {
        if (entity == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Entity localKey = createInstanceKeyEntity(entity);
        Object cachedLocalDto = instanceCache ? _relationDtoMap.get(localKey) : null;
        if (cachedLocalDto != null) {
            return (MCarrierZipDto)cachedLocalDto;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        MCarrierZipDto dto = new MCarrierZipDto();
        dto.setCarrierZipId(entity.getCarrierZipId());
        dto.setCommonCarrierId(entity.getCommonCarrierId());
        dto.setZipId(entity.getZipId());
        dto.setArrivalStoreCd(entity.getArrivalStoreCd());
        dto.setArrivalStoreNm(entity.getArrivalStoreNm());
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
        if (!_suppressMCommonCarrier && entity.getMCommonCarrier() != null) {
            MCommonCarrier relationEntity = entity.getMCommonCarrier();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                MCommonCarrierDto relationDto = (MCommonCarrierDto)cachedDto;
                dto.setMCommonCarrier(relationDto);
                if (reverseReference) {
                    relationDto.getMCarrierZipList().add(dto);
                }
            } else {
                MCommonCarrierDtoMapper mapper = new MCommonCarrierDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressMCarrierZipList();
                MCommonCarrierDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMCommonCarrier(relationDto);
                if (reverseReference) {
                    relationDto.getMCarrierZipList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMCommonCarrier());
                }
            }
        };
        if (!_suppressMZip && entity.getMZip() != null) {
            MZip relationEntity = entity.getMZip();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                MZipDto relationDto = (MZipDto)cachedDto;
                dto.setMZip(relationDto);
                if (reverseReference) {
                    relationDto.getMCarrierZipList().add(dto);
                }
            } else {
                MZipDtoMapper mapper = new MZipDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressMCarrierZipList();
                MZipDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMZip(relationDto);
                if (reverseReference) {
                    relationDto.getMCarrierZipList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMZip());
                }
            }
        };
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<MCarrierZipDto> mappingToDtoList(List<MCarrierZip> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<MCarrierZipDto> dtoList = new ArrayList<MCarrierZipDto>();
        for (MCarrierZip entity : entityList) {
            MCarrierZipDto dto = mappingToDto(entity);
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
    public MCarrierZip mappingToEntity(MCarrierZipDto dto) {
        if (dto == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Object localKey = createInstanceKeyDto(dto, dto.instanceHash());
        Entity cachedLocalEntity = instanceCache ? _relationEntityMap.get(localKey) : null;
        if (cachedLocalEntity != null) {
            return (MCarrierZip)cachedLocalEntity;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        MCarrierZip entity = new MCarrierZip();
        if (needsMapping(dto, dto.getCarrierZipId(), "carrierZipId")) {
            entity.setCarrierZipId(dto.getCarrierZipId());
        }
        if (needsMapping(dto, dto.getCommonCarrierId(), "commonCarrierId")) {
            entity.setCommonCarrierId(dto.getCommonCarrierId());
        }
        if (needsMapping(dto, dto.getZipId(), "zipId")) {
            entity.setZipId(dto.getZipId());
        }
        if (needsMapping(dto, dto.getArrivalStoreCd(), "arrivalStoreCd")) {
            entity.setArrivalStoreCd(dto.getArrivalStoreCd());
        }
        if (needsMapping(dto, dto.getArrivalStoreNm(), "arrivalStoreNm")) {
            entity.setArrivalStoreNm(dto.getArrivalStoreNm());
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
        if (!_suppressMCommonCarrier && dto.getMCommonCarrier() != null) {
            MCommonCarrierDto relationDto = dto.getMCommonCarrier();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                MCommonCarrier relationEntity = (MCommonCarrier)cachedEntity;
                entity.setMCommonCarrier(relationEntity);
                if (reverseReference) {
                    relationEntity.getMCarrierZipList().add(entity);
                }
            } else {
                MCommonCarrierDtoMapper mapper = new MCommonCarrierDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressMCarrierZipList();
                MCommonCarrier relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMCommonCarrier(relationEntity);
                if (reverseReference) {
                    relationEntity.getMCarrierZipList().add(entity);
                }
                if (instanceCache && entity.getMCommonCarrier().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMCommonCarrier());
                }
            }
        };
        if (!_suppressMZip && dto.getMZip() != null) {
            MZipDto relationDto = dto.getMZip();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                MZip relationEntity = (MZip)cachedEntity;
                entity.setMZip(relationEntity);
                if (reverseReference) {
                    relationEntity.getMCarrierZipList().add(entity);
                }
            } else {
                MZipDtoMapper mapper = new MZipDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressMCarrierZipList();
                MZip relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMZip(relationEntity);
                if (reverseReference) {
                    relationEntity.getMCarrierZipList().add(entity);
                }
                if (instanceCache && entity.getMZip().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMZip());
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
    protected boolean needsMapping(MCarrierZipDto dto, Object value, String propName) {
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
    public List<MCarrierZip> mappingToEntityList(List<MCarrierZipDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<MCarrierZip> entityList = new ArrayList<MCarrierZip>();
        for (MCarrierZipDto dto : dtoList) {
            MCarrierZip entity = mappingToEntity(dto);
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
    public void suppressMCommonCarrier() {
        _suppressMCommonCarrier = true;
    }
    public void suppressMZip() {
        _suppressMZip = true;
    }
    protected void doSuppressAll() { // internal
        suppressMCommonCarrier();
        suppressMZip();
    }
    protected void doSuppressClear() { // internal
        _suppressMCommonCarrier = false;
        _suppressMZip = false;
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
    public MCarrierZipDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (MCarrierZipDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public MCarrierZipDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (MCarrierZipDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public MCarrierZipDtoMapper reverseReference() {
        setReverseReference(true);
        return (MCarrierZipDtoMapper)this;
    }
}
