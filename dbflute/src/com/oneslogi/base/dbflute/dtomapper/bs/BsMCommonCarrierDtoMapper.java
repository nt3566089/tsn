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
 * The DTO mapper of M_COMMON_CARRIER as TABLE. <br>
 * 共通運送業者マスタ
 * <pre>
 * [primary-key]
 *     COMMON_CARRIER_ID
 *
 * [column]
 *     COMMON_CARRIER_ID, CARRIER_CD, CARRIER_NM, CARRIER_ABBR, ARRIVAL_STORE_BARCODE, ARRIVAL_STORE_START_BIT, ARRIVAL_STORE_END_BIT, ARRIVAL_STORE_FORMAT, TRACKING_BARCODE, TRACKING_START_BIT, TRACKING_END_BIT, BOL_OUTPUT_TARGET_FLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     COMMON_CARRIER_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     B_CLASS_DTL(ByArrivalStoreFormat)
 *
 * [referrer-table]
 *     M_CARRIER, M_CARRIER_ZIP
 *
 * [foreign-property]
 *     bClassDtlByArrivalStoreFormat, bClassDtlByBolOutputTargetFlg
 *
 * [referrer-property]
 *     mCarrierList, mCarrierZipList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsMCommonCarrierDtoMapper implements DtoMapper<MCommonCarrier, MCommonCarrierDto>, Serializable {

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
    protected boolean _suppressBClassDtlByArrivalStoreFormat;
    protected boolean _suppressBClassDtlByBolOutputTargetFlg;
    protected boolean _suppressMCarrierList;
    protected boolean _suppressMCarrierZipList;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMCommonCarrierDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsMCommonCarrierDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public MCommonCarrierDto mappingToDto(MCommonCarrier entity) {
        if (entity == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Entity localKey = createInstanceKeyEntity(entity);
        Object cachedLocalDto = instanceCache ? _relationDtoMap.get(localKey) : null;
        if (cachedLocalDto != null) {
            return (MCommonCarrierDto)cachedLocalDto;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        MCommonCarrierDto dto = new MCommonCarrierDto();
        dto.setCommonCarrierId(entity.getCommonCarrierId());
        dto.setCarrierCd(entity.getCarrierCd());
        dto.setCarrierNm(entity.getCarrierNm());
        dto.setCarrierAbbr(entity.getCarrierAbbr());
        dto.setArrivalStoreBarcode(entity.getArrivalStoreBarcode());
        dto.setArrivalStoreStartBit(entity.getArrivalStoreStartBit());
        dto.setArrivalStoreEndBit(entity.getArrivalStoreEndBit());
        dto.setArrivalStoreFormat(entity.getArrivalStoreFormat());
        dto.setTrackingBarcode(entity.getTrackingBarcode());
        dto.setTrackingStartBit(entity.getTrackingStartBit());
        dto.setTrackingEndBit(entity.getTrackingEndBit());
        dto.setBolOutputTargetFlg(entity.getBolOutputTargetFlg());
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
        if (!_suppressBClassDtlByArrivalStoreFormat && entity.getBClassDtlByArrivalStoreFormat() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByArrivalStoreFormat();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByArrivalStoreFormat(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByArrivalStoreFormat(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByArrivalStoreFormat());
                }
            }
        };
        if (!_suppressBClassDtlByBolOutputTargetFlg && entity.getBClassDtlByBolOutputTargetFlg() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByBolOutputTargetFlg();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByBolOutputTargetFlg(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByBolOutputTargetFlg(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByBolOutputTargetFlg());
                }
            }
        };
        if (!_suppressMCarrierList && !entity.getMCarrierList().isEmpty()) {
            MCarrierDtoMapper mapper = new MCarrierDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCommonCarrier();
            List<MCarrierDto> relationDtoList = mapper.mappingToDtoList(entity.getMCarrierList());
            dto.setMCarrierList(relationDtoList);
            if (reverseReference) {
                for (MCarrierDto relationDto : relationDtoList) {
                    relationDto.setMCommonCarrier(dto);
                }
            }
        };
        if (!_suppressMCarrierZipList && !entity.getMCarrierZipList().isEmpty()) {
            MCarrierZipDtoMapper mapper = new MCarrierZipDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCommonCarrier();
            List<MCarrierZipDto> relationDtoList = mapper.mappingToDtoList(entity.getMCarrierZipList());
            dto.setMCarrierZipList(relationDtoList);
            if (reverseReference) {
                for (MCarrierZipDto relationDto : relationDtoList) {
                    relationDto.setMCommonCarrier(dto);
                }
            }
        };
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<MCommonCarrierDto> mappingToDtoList(List<MCommonCarrier> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<MCommonCarrierDto> dtoList = new ArrayList<MCommonCarrierDto>();
        for (MCommonCarrier entity : entityList) {
            MCommonCarrierDto dto = mappingToDto(entity);
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
    public MCommonCarrier mappingToEntity(MCommonCarrierDto dto) {
        if (dto == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Object localKey = createInstanceKeyDto(dto, dto.instanceHash());
        Entity cachedLocalEntity = instanceCache ? _relationEntityMap.get(localKey) : null;
        if (cachedLocalEntity != null) {
            return (MCommonCarrier)cachedLocalEntity;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        MCommonCarrier entity = new MCommonCarrier();
        if (needsMapping(dto, dto.getCommonCarrierId(), "commonCarrierId")) {
            entity.setCommonCarrierId(dto.getCommonCarrierId());
        }
        if (needsMapping(dto, dto.getCarrierCd(), "carrierCd")) {
            entity.setCarrierCd(dto.getCarrierCd());
        }
        if (needsMapping(dto, dto.getCarrierNm(), "carrierNm")) {
            entity.setCarrierNm(dto.getCarrierNm());
        }
        if (needsMapping(dto, dto.getCarrierAbbr(), "carrierAbbr")) {
            entity.setCarrierAbbr(dto.getCarrierAbbr());
        }
        if (needsMapping(dto, dto.getArrivalStoreBarcode(), "arrivalStoreBarcode")) {
            entity.setArrivalStoreBarcode(dto.getArrivalStoreBarcode());
        }
        if (needsMapping(dto, dto.getArrivalStoreStartBit(), "arrivalStoreStartBit")) {
            entity.setArrivalStoreStartBit(dto.getArrivalStoreStartBit());
        }
        if (needsMapping(dto, dto.getArrivalStoreEndBit(), "arrivalStoreEndBit")) {
            entity.setArrivalStoreEndBit(dto.getArrivalStoreEndBit());
        }
        if (needsMapping(dto, dto.getArrivalStoreFormat(), "arrivalStoreFormat")) {
            entity.setArrivalStoreFormatAsArrivalStoreFormat(CDef.ArrivalStoreFormat.codeOf(dto.getArrivalStoreFormat()));
        }
        if (needsMapping(dto, dto.getTrackingBarcode(), "trackingBarcode")) {
            entity.setTrackingBarcode(dto.getTrackingBarcode());
        }
        if (needsMapping(dto, dto.getTrackingStartBit(), "trackingStartBit")) {
            entity.setTrackingStartBit(dto.getTrackingStartBit());
        }
        if (needsMapping(dto, dto.getTrackingEndBit(), "trackingEndBit")) {
            entity.setTrackingEndBit(dto.getTrackingEndBit());
        }
        if (needsMapping(dto, dto.getBolOutputTargetFlg(), "bolOutputTargetFlg")) {
            entity.setBolOutputTargetFlgAsBolOutputTargetFlg(CDef.BolOutputTargetFlg.codeOf(dto.getBolOutputTargetFlg()));
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
        if (!_suppressBClassDtlByArrivalStoreFormat && dto.getBClassDtlByArrivalStoreFormat() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByArrivalStoreFormat();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByArrivalStoreFormat(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByArrivalStoreFormat(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByArrivalStoreFormat().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByArrivalStoreFormat());
                }
            }
        };
        if (!_suppressBClassDtlByBolOutputTargetFlg && dto.getBClassDtlByBolOutputTargetFlg() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByBolOutputTargetFlg();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByBolOutputTargetFlg(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByBolOutputTargetFlg(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByBolOutputTargetFlg().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByBolOutputTargetFlg());
                }
            }
        };
        if (!_suppressMCarrierList && !dto.getMCarrierList().isEmpty()) {
            MCarrierDtoMapper mapper = new MCarrierDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCommonCarrier();
            List<MCarrier> relationEntityList = mapper.mappingToEntityList(dto.getMCarrierList());
            entity.setMCarrierList(relationEntityList);
            if (reverseReference) {
                for (MCarrier relationEntity : relationEntityList) {
                    relationEntity.setMCommonCarrier(entity);
                }
            }
        };
        if (!_suppressMCarrierZipList && !dto.getMCarrierZipList().isEmpty()) {
            MCarrierZipDtoMapper mapper = new MCarrierZipDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCommonCarrier();
            List<MCarrierZip> relationEntityList = mapper.mappingToEntityList(dto.getMCarrierZipList());
            entity.setMCarrierZipList(relationEntityList);
            if (reverseReference) {
                for (MCarrierZip relationEntity : relationEntityList) {
                    relationEntity.setMCommonCarrier(entity);
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
    protected boolean needsMapping(MCommonCarrierDto dto, Object value, String propName) {
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
    public List<MCommonCarrier> mappingToEntityList(List<MCommonCarrierDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<MCommonCarrier> entityList = new ArrayList<MCommonCarrier>();
        for (MCommonCarrierDto dto : dtoList) {
            MCommonCarrier entity = mappingToEntity(dto);
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
    public void suppressBClassDtlByArrivalStoreFormat() {
        _suppressBClassDtlByArrivalStoreFormat = true;
    }
    public void suppressBClassDtlByBolOutputTargetFlg() {
        _suppressBClassDtlByBolOutputTargetFlg = true;
    }
    public void suppressMCarrierList() {
        _suppressMCarrierList = true;
    }
    public void suppressMCarrierZipList() {
        _suppressMCarrierZipList = true;
    }
    protected void doSuppressAll() { // internal
        suppressBClassDtlByArrivalStoreFormat();
        suppressBClassDtlByBolOutputTargetFlg();
        suppressMCarrierList();
        suppressMCarrierZipList();
    }
    protected void doSuppressClear() { // internal
        _suppressBClassDtlByArrivalStoreFormat = false;
        _suppressBClassDtlByBolOutputTargetFlg = false;
        _suppressMCarrierList = false;
        _suppressMCarrierZipList = false;
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
    public MCommonCarrierDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (MCommonCarrierDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public MCommonCarrierDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (MCommonCarrierDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public MCommonCarrierDtoMapper reverseReference() {
        setReverseReference(true);
        return (MCommonCarrierDtoMapper)this;
    }
}
