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
 * The DTO mapper of M_IMPORT_TYPE_B as TABLE. <br>
 * 取込種別ボディマスタ
 * <pre>
 * [primary-key]
 *     IMPORT_TYPE_B_ID
 *
 * [column]
 *     IMPORT_TYPE_B_ID, IMPORT_TYPE_ID, COLUMN_NO, EDI_COLUMN_ID, UPLOAD_COLUMN_NM, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     IMPORT_TYPE_B_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     M_IMPORT_TYPE, M_EDI_COLUMN
 *
 * [referrer-table]
 *     M_IMPORT_TYPE_B_COPY_B, M_IMPORT_TYPE_B_COPY_H
 *
 * [foreign-property]
 *     mImportType, mEdiColumn
 *
 * [referrer-property]
 *     mImportTypeBCopyBList, mImportTypeBCopyHList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsMImportTypeBDtoMapper implements DtoMapper<MImportTypeB, MImportTypeBDto>, Serializable {

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
    protected boolean _suppressMImportType;
    protected boolean _suppressMEdiColumn;
    protected boolean _suppressMImportTypeBCopyBList;
    protected boolean _suppressMImportTypeBCopyHList;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMImportTypeBDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsMImportTypeBDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public MImportTypeBDto mappingToDto(MImportTypeB entity) {
        if (entity == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Entity localKey = createInstanceKeyEntity(entity);
        Object cachedLocalDto = instanceCache ? _relationDtoMap.get(localKey) : null;
        if (cachedLocalDto != null) {
            return (MImportTypeBDto)cachedLocalDto;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        MImportTypeBDto dto = new MImportTypeBDto();
        dto.setImportTypeBId(entity.getImportTypeBId());
        dto.setImportTypeId(entity.getImportTypeId());
        dto.setColumnNo(entity.getColumnNo());
        dto.setEdiColumnId(entity.getEdiColumnId());
        dto.setUploadColumnNm(entity.getUploadColumnNm());
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
        if (!_suppressMImportType && entity.getMImportType() != null) {
            MImportType relationEntity = entity.getMImportType();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                MImportTypeDto relationDto = (MImportTypeDto)cachedDto;
                dto.setMImportType(relationDto);
                if (reverseReference) {
                    relationDto.getMImportTypeBList().add(dto);
                }
            } else {
                MImportTypeDtoMapper mapper = new MImportTypeDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressMImportTypeBList();
                MImportTypeDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMImportType(relationDto);
                if (reverseReference) {
                    relationDto.getMImportTypeBList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMImportType());
                }
            }
        };
        if (!_suppressMEdiColumn && entity.getMEdiColumn() != null) {
            MEdiColumn relationEntity = entity.getMEdiColumn();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                MEdiColumnDto relationDto = (MEdiColumnDto)cachedDto;
                dto.setMEdiColumn(relationDto);
                if (reverseReference) {
                    relationDto.getMImportTypeBList().add(dto);
                }
            } else {
                MEdiColumnDtoMapper mapper = new MEdiColumnDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressMImportTypeBList();
                MEdiColumnDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMEdiColumn(relationDto);
                if (reverseReference) {
                    relationDto.getMImportTypeBList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMEdiColumn());
                }
            }
        };
        if (!_suppressMImportTypeBCopyBList && !entity.getMImportTypeBCopyBList().isEmpty()) {
            MImportTypeBCopyBDtoMapper mapper = new MImportTypeBCopyBDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMImportTypeB();
            List<MImportTypeBCopyBDto> relationDtoList = mapper.mappingToDtoList(entity.getMImportTypeBCopyBList());
            dto.setMImportTypeBCopyBList(relationDtoList);
            if (reverseReference) {
                for (MImportTypeBCopyBDto relationDto : relationDtoList) {
                    relationDto.setMImportTypeB(dto);
                }
            }
        };
        if (!_suppressMImportTypeBCopyHList && !entity.getMImportTypeBCopyHList().isEmpty()) {
            MImportTypeBCopyHDtoMapper mapper = new MImportTypeBCopyHDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMImportTypeB();
            List<MImportTypeBCopyHDto> relationDtoList = mapper.mappingToDtoList(entity.getMImportTypeBCopyHList());
            dto.setMImportTypeBCopyHList(relationDtoList);
            if (reverseReference) {
                for (MImportTypeBCopyHDto relationDto : relationDtoList) {
                    relationDto.setMImportTypeB(dto);
                }
            }
        };
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<MImportTypeBDto> mappingToDtoList(List<MImportTypeB> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<MImportTypeBDto> dtoList = new ArrayList<MImportTypeBDto>();
        for (MImportTypeB entity : entityList) {
            MImportTypeBDto dto = mappingToDto(entity);
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
    public MImportTypeB mappingToEntity(MImportTypeBDto dto) {
        if (dto == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Object localKey = createInstanceKeyDto(dto, dto.instanceHash());
        Entity cachedLocalEntity = instanceCache ? _relationEntityMap.get(localKey) : null;
        if (cachedLocalEntity != null) {
            return (MImportTypeB)cachedLocalEntity;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        MImportTypeB entity = new MImportTypeB();
        if (needsMapping(dto, dto.getImportTypeBId(), "importTypeBId")) {
            entity.setImportTypeBId(dto.getImportTypeBId());
        }
        if (needsMapping(dto, dto.getImportTypeId(), "importTypeId")) {
            entity.setImportTypeId(dto.getImportTypeId());
        }
        if (needsMapping(dto, dto.getColumnNo(), "columnNo")) {
            entity.setColumnNo(dto.getColumnNo());
        }
        if (needsMapping(dto, dto.getEdiColumnId(), "ediColumnId")) {
            entity.setEdiColumnId(dto.getEdiColumnId());
        }
        if (needsMapping(dto, dto.getUploadColumnNm(), "uploadColumnNm")) {
            entity.setUploadColumnNm(dto.getUploadColumnNm());
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
        if (!_suppressMImportType && dto.getMImportType() != null) {
            MImportTypeDto relationDto = dto.getMImportType();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                MImportType relationEntity = (MImportType)cachedEntity;
                entity.setMImportType(relationEntity);
                if (reverseReference) {
                    relationEntity.getMImportTypeBList().add(entity);
                }
            } else {
                MImportTypeDtoMapper mapper = new MImportTypeDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressMImportTypeBList();
                MImportType relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMImportType(relationEntity);
                if (reverseReference) {
                    relationEntity.getMImportTypeBList().add(entity);
                }
                if (instanceCache && entity.getMImportType().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMImportType());
                }
            }
        };
        if (!_suppressMEdiColumn && dto.getMEdiColumn() != null) {
            MEdiColumnDto relationDto = dto.getMEdiColumn();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                MEdiColumn relationEntity = (MEdiColumn)cachedEntity;
                entity.setMEdiColumn(relationEntity);
                if (reverseReference) {
                    relationEntity.getMImportTypeBList().add(entity);
                }
            } else {
                MEdiColumnDtoMapper mapper = new MEdiColumnDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressMImportTypeBList();
                MEdiColumn relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMEdiColumn(relationEntity);
                if (reverseReference) {
                    relationEntity.getMImportTypeBList().add(entity);
                }
                if (instanceCache && entity.getMEdiColumn().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMEdiColumn());
                }
            }
        };
        if (!_suppressMImportTypeBCopyBList && !dto.getMImportTypeBCopyBList().isEmpty()) {
            MImportTypeBCopyBDtoMapper mapper = new MImportTypeBCopyBDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMImportTypeB();
            List<MImportTypeBCopyB> relationEntityList = mapper.mappingToEntityList(dto.getMImportTypeBCopyBList());
            entity.setMImportTypeBCopyBList(relationEntityList);
            if (reverseReference) {
                for (MImportTypeBCopyB relationEntity : relationEntityList) {
                    relationEntity.setMImportTypeB(entity);
                }
            }
        };
        if (!_suppressMImportTypeBCopyHList && !dto.getMImportTypeBCopyHList().isEmpty()) {
            MImportTypeBCopyHDtoMapper mapper = new MImportTypeBCopyHDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMImportTypeB();
            List<MImportTypeBCopyH> relationEntityList = mapper.mappingToEntityList(dto.getMImportTypeBCopyHList());
            entity.setMImportTypeBCopyHList(relationEntityList);
            if (reverseReference) {
                for (MImportTypeBCopyH relationEntity : relationEntityList) {
                    relationEntity.setMImportTypeB(entity);
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
    protected boolean needsMapping(MImportTypeBDto dto, Object value, String propName) {
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
    public List<MImportTypeB> mappingToEntityList(List<MImportTypeBDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<MImportTypeB> entityList = new ArrayList<MImportTypeB>();
        for (MImportTypeBDto dto : dtoList) {
            MImportTypeB entity = mappingToEntity(dto);
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
    public void suppressMImportType() {
        _suppressMImportType = true;
    }
    public void suppressMEdiColumn() {
        _suppressMEdiColumn = true;
    }
    public void suppressMImportTypeBCopyBList() {
        _suppressMImportTypeBCopyBList = true;
    }
    public void suppressMImportTypeBCopyHList() {
        _suppressMImportTypeBCopyHList = true;
    }
    protected void doSuppressAll() { // internal
        suppressMImportType();
        suppressMEdiColumn();
        suppressMImportTypeBCopyBList();
        suppressMImportTypeBCopyHList();
    }
    protected void doSuppressClear() { // internal
        _suppressMImportType = false;
        _suppressMEdiColumn = false;
        _suppressMImportTypeBCopyBList = false;
        _suppressMImportTypeBCopyHList = false;
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
    public MImportTypeBDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (MImportTypeBDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public MImportTypeBDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (MImportTypeBDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public MImportTypeBDtoMapper reverseReference() {
        setReverseReference(true);
        return (MImportTypeBDtoMapper)this;
    }
}
