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
 * The DTO mapper of B_LOG_DTL as TABLE. <br>
 * ログ明細
 * <pre>
 * [primary-key]
 *     LOG_DTL_ID
 *
 * [column]
 *     LOG_DTL_ID, LOG_ID, LOG_DTL_TYPE, LOG_DTL_STATUS, LOG_DTL_SECTION_ID, LOG_DTL_SECTION_NM, PROCESS_INFO, PROCESS_DT, MESSAGE_REPLACE_STRING1, MESSAGE_REPLACE_STRING2, MESSAGE_REPLACE_STRING3, MESSAGE_REPLACE_STRING4, MESSAGE_REPLACE_STRING5, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     LOG_DTL_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     B_LOG, B_CLASS_DTL(ByLogDtlType)
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     bLog, bClassDtlByLogDtlType, bClassDtlByLogDtlStatus
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsBLogDtlDtoMapper implements DtoMapper<BLogDtl, BLogDtlDto>, Serializable {

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
    protected boolean _suppressBLog;
    protected boolean _suppressBClassDtlByLogDtlType;
    protected boolean _suppressBClassDtlByLogDtlStatus;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsBLogDtlDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsBLogDtlDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public BLogDtlDto mappingToDto(BLogDtl entity) {
        if (entity == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Entity localKey = createInstanceKeyEntity(entity);
        Object cachedLocalDto = instanceCache ? _relationDtoMap.get(localKey) : null;
        if (cachedLocalDto != null) {
            return (BLogDtlDto)cachedLocalDto;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        BLogDtlDto dto = new BLogDtlDto();
        dto.setLogDtlId(entity.getLogDtlId());
        dto.setLogId(entity.getLogId());
        dto.setLogDtlType(entity.getLogDtlType());
        dto.setLogDtlStatus(entity.getLogDtlStatus());
        dto.setLogDtlSectionId(entity.getLogDtlSectionId());
        dto.setLogDtlSectionNm(entity.getLogDtlSectionNm());
        dto.setProcessInfo(entity.getProcessInfo());
        dto.setProcessDt(entity.getProcessDt());
        dto.setMessageReplaceString1(entity.getMessageReplaceString1());
        dto.setMessageReplaceString2(entity.getMessageReplaceString2());
        dto.setMessageReplaceString3(entity.getMessageReplaceString3());
        dto.setMessageReplaceString4(entity.getMessageReplaceString4());
        dto.setMessageReplaceString5(entity.getMessageReplaceString5());
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
        if (!_suppressBLog && entity.getBLog() != null) {
            BLog relationEntity = entity.getBLog();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BLogDto relationDto = (BLogDto)cachedDto;
                dto.setBLog(relationDto);
                if (reverseReference) {
                    relationDto.getBLogDtlList().add(dto);
                }
            } else {
                BLogDtoMapper mapper = new BLogDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressBLogDtlList();
                BLogDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBLog(relationDto);
                if (reverseReference) {
                    relationDto.getBLogDtlList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBLog());
                }
            }
        };
        if (!_suppressBClassDtlByLogDtlType && entity.getBClassDtlByLogDtlType() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByLogDtlType();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByLogDtlType(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByLogDtlType(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByLogDtlType());
                }
            }
        };
        if (!_suppressBClassDtlByLogDtlStatus && entity.getBClassDtlByLogDtlStatus() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByLogDtlStatus();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByLogDtlStatus(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByLogDtlStatus(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByLogDtlStatus());
                }
            }
        };
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<BLogDtlDto> mappingToDtoList(List<BLogDtl> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<BLogDtlDto> dtoList = new ArrayList<BLogDtlDto>();
        for (BLogDtl entity : entityList) {
            BLogDtlDto dto = mappingToDto(entity);
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
    public BLogDtl mappingToEntity(BLogDtlDto dto) {
        if (dto == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Object localKey = createInstanceKeyDto(dto, dto.instanceHash());
        Entity cachedLocalEntity = instanceCache ? _relationEntityMap.get(localKey) : null;
        if (cachedLocalEntity != null) {
            return (BLogDtl)cachedLocalEntity;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        BLogDtl entity = new BLogDtl();
        if (needsMapping(dto, dto.getLogDtlId(), "logDtlId")) {
            entity.setLogDtlId(dto.getLogDtlId());
        }
        if (needsMapping(dto, dto.getLogId(), "logId")) {
            entity.setLogId(dto.getLogId());
        }
        if (needsMapping(dto, dto.getLogDtlType(), "logDtlType")) {
            entity.setLogDtlTypeAsLogDtlType(CDef.LogDtlType.codeOf(dto.getLogDtlType()));
        }
        if (needsMapping(dto, dto.getLogDtlStatus(), "logDtlStatus")) {
            entity.setLogDtlStatusAsLogDtlStatus(CDef.LogDtlStatus.codeOf(dto.getLogDtlStatus()));
        }
        if (needsMapping(dto, dto.getLogDtlSectionId(), "logDtlSectionId")) {
            entity.setLogDtlSectionId(dto.getLogDtlSectionId());
        }
        if (needsMapping(dto, dto.getLogDtlSectionNm(), "logDtlSectionNm")) {
            entity.setLogDtlSectionNm(dto.getLogDtlSectionNm());
        }
        if (needsMapping(dto, dto.getProcessInfo(), "processInfo")) {
            entity.setProcessInfo(dto.getProcessInfo());
        }
        if (needsMapping(dto, dto.getProcessDt(), "processDt")) {
            entity.setProcessDt(dto.getProcessDt());
        }
        if (needsMapping(dto, dto.getMessageReplaceString1(), "messageReplaceString1")) {
            entity.setMessageReplaceString1(dto.getMessageReplaceString1());
        }
        if (needsMapping(dto, dto.getMessageReplaceString2(), "messageReplaceString2")) {
            entity.setMessageReplaceString2(dto.getMessageReplaceString2());
        }
        if (needsMapping(dto, dto.getMessageReplaceString3(), "messageReplaceString3")) {
            entity.setMessageReplaceString3(dto.getMessageReplaceString3());
        }
        if (needsMapping(dto, dto.getMessageReplaceString4(), "messageReplaceString4")) {
            entity.setMessageReplaceString4(dto.getMessageReplaceString4());
        }
        if (needsMapping(dto, dto.getMessageReplaceString5(), "messageReplaceString5")) {
            entity.setMessageReplaceString5(dto.getMessageReplaceString5());
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
        if (!_suppressBLog && dto.getBLog() != null) {
            BLogDto relationDto = dto.getBLog();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BLog relationEntity = (BLog)cachedEntity;
                entity.setBLog(relationEntity);
                if (reverseReference) {
                    relationEntity.getBLogDtlList().add(entity);
                }
            } else {
                BLogDtoMapper mapper = new BLogDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressBLogDtlList();
                BLog relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBLog(relationEntity);
                if (reverseReference) {
                    relationEntity.getBLogDtlList().add(entity);
                }
                if (instanceCache && entity.getBLog().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBLog());
                }
            }
        };
        if (!_suppressBClassDtlByLogDtlType && dto.getBClassDtlByLogDtlType() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByLogDtlType();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByLogDtlType(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByLogDtlType(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByLogDtlType().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByLogDtlType());
                }
            }
        };
        if (!_suppressBClassDtlByLogDtlStatus && dto.getBClassDtlByLogDtlStatus() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByLogDtlStatus();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByLogDtlStatus(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByLogDtlStatus(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByLogDtlStatus().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByLogDtlStatus());
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
    protected boolean needsMapping(BLogDtlDto dto, Object value, String propName) {
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
    public List<BLogDtl> mappingToEntityList(List<BLogDtlDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<BLogDtl> entityList = new ArrayList<BLogDtl>();
        for (BLogDtlDto dto : dtoList) {
            BLogDtl entity = mappingToEntity(dto);
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
    public void suppressBLog() {
        _suppressBLog = true;
    }
    public void suppressBClassDtlByLogDtlType() {
        _suppressBClassDtlByLogDtlType = true;
    }
    public void suppressBClassDtlByLogDtlStatus() {
        _suppressBClassDtlByLogDtlStatus = true;
    }
    protected void doSuppressAll() { // internal
        suppressBLog();
        suppressBClassDtlByLogDtlType();
        suppressBClassDtlByLogDtlStatus();
    }
    protected void doSuppressClear() { // internal
        _suppressBLog = false;
        _suppressBClassDtlByLogDtlType = false;
        _suppressBClassDtlByLogDtlStatus = false;
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
    public BLogDtlDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (BLogDtlDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public BLogDtlDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (BLogDtlDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public BLogDtlDtoMapper reverseReference() {
        setReverseReference(true);
        return (BLogDtlDtoMapper)this;
    }
}
