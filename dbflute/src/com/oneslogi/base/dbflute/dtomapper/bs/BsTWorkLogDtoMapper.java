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
 * The DTO mapper of T_WORK_LOG as TABLE. <br>
 * 作業実績
 * <pre>
 * [primary-key]
 *     WORK_LOG_ID
 *
 * [column]
 *     WORK_LOG_ID, CLIENT_CD, CENTER_CD, USER_CD, WORK_CD, WORK_DT, WORK_START_DT, WORK_END_DT, WORK_QTY, TRACE_ITEM, MAC_ADDRESS, WORK_STATUS, WORK_LOG_OUT_FLG, WORK_LOG_OUT_DT, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     WORK_LOG_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     B_CLASS_DTL(ByWorkStatus)
 *
 * [referrer-table]
 *     T_WORK_DATA
 *
 * [foreign-property]
 *     bClassDtlByWorkStatus, bClassDtlByWorkLogOutFlg
 *
 * [referrer-property]
 *     tWorkDataList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsTWorkLogDtoMapper implements DtoMapper<TWorkLog, TWorkLogDto>, Serializable {

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
    protected boolean _suppressBClassDtlByWorkStatus;
    protected boolean _suppressBClassDtlByWorkLogOutFlg;
    protected boolean _suppressTWorkDataList;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTWorkLogDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsTWorkLogDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public TWorkLogDto mappingToDto(TWorkLog entity) {
        if (entity == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Entity localKey = createInstanceKeyEntity(entity);
        Object cachedLocalDto = instanceCache ? _relationDtoMap.get(localKey) : null;
        if (cachedLocalDto != null) {
            return (TWorkLogDto)cachedLocalDto;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        TWorkLogDto dto = new TWorkLogDto();
        dto.setWorkLogId(entity.getWorkLogId());
        dto.setClientCd(entity.getClientCd());
        dto.setCenterCd(entity.getCenterCd());
        dto.setUserCd(entity.getUserCd());
        dto.setWorkCd(entity.getWorkCd());
        dto.setWorkDt(entity.getWorkDt());
        dto.setWorkStartDt(entity.getWorkStartDt());
        dto.setWorkEndDt(entity.getWorkEndDt());
        dto.setWorkQty(entity.getWorkQty());
        dto.setTraceItem(entity.getTraceItem());
        dto.setMacAddress(entity.getMacAddress());
        dto.setWorkStatus(entity.getWorkStatus());
        dto.setWorkLogOutFlg(entity.getWorkLogOutFlg());
        dto.setWorkLogOutDt(entity.getWorkLogOutDt());
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
        if (!_suppressBClassDtlByWorkStatus && entity.getBClassDtlByWorkStatus() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByWorkStatus();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByWorkStatus(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByWorkStatus(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByWorkStatus());
                }
            }
        };
        if (!_suppressBClassDtlByWorkLogOutFlg && entity.getBClassDtlByWorkLogOutFlg() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByWorkLogOutFlg();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByWorkLogOutFlg(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByWorkLogOutFlg(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByWorkLogOutFlg());
                }
            }
        };
        if (!_suppressTWorkDataList && !entity.getTWorkDataList().isEmpty()) {
            TWorkDataDtoMapper mapper = new TWorkDataDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressTWorkLog();
            List<TWorkDataDto> relationDtoList = mapper.mappingToDtoList(entity.getTWorkDataList());
            dto.setTWorkDataList(relationDtoList);
            if (reverseReference) {
                for (TWorkDataDto relationDto : relationDtoList) {
                    relationDto.setTWorkLog(dto);
                }
            }
        };
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<TWorkLogDto> mappingToDtoList(List<TWorkLog> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<TWorkLogDto> dtoList = new ArrayList<TWorkLogDto>();
        for (TWorkLog entity : entityList) {
            TWorkLogDto dto = mappingToDto(entity);
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
    public TWorkLog mappingToEntity(TWorkLogDto dto) {
        if (dto == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Object localKey = createInstanceKeyDto(dto, dto.instanceHash());
        Entity cachedLocalEntity = instanceCache ? _relationEntityMap.get(localKey) : null;
        if (cachedLocalEntity != null) {
            return (TWorkLog)cachedLocalEntity;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        TWorkLog entity = new TWorkLog();
        if (needsMapping(dto, dto.getWorkLogId(), "workLogId")) {
            entity.setWorkLogId(dto.getWorkLogId());
        }
        if (needsMapping(dto, dto.getClientCd(), "clientCd")) {
            entity.setClientCd(dto.getClientCd());
        }
        if (needsMapping(dto, dto.getCenterCd(), "centerCd")) {
            entity.setCenterCd(dto.getCenterCd());
        }
        if (needsMapping(dto, dto.getUserCd(), "userCd")) {
            entity.setUserCd(dto.getUserCd());
        }
        if (needsMapping(dto, dto.getWorkCd(), "workCd")) {
            entity.setWorkCd(dto.getWorkCd());
        }
        if (needsMapping(dto, dto.getWorkDt(), "workDt")) {
            entity.setWorkDt(dto.getWorkDt());
        }
        if (needsMapping(dto, dto.getWorkStartDt(), "workStartDt")) {
            entity.setWorkStartDt(dto.getWorkStartDt());
        }
        if (needsMapping(dto, dto.getWorkEndDt(), "workEndDt")) {
            entity.setWorkEndDt(dto.getWorkEndDt());
        }
        if (needsMapping(dto, dto.getWorkQty(), "workQty")) {
            entity.setWorkQty(dto.getWorkQty());
        }
        if (needsMapping(dto, dto.getTraceItem(), "traceItem")) {
            entity.setTraceItem(dto.getTraceItem());
        }
        if (needsMapping(dto, dto.getMacAddress(), "macAddress")) {
            entity.setMacAddress(dto.getMacAddress());
        }
        if (needsMapping(dto, dto.getWorkStatus(), "workStatus")) {
            entity.setWorkStatusAsWorkStatus(CDef.WorkStatus.codeOf(dto.getWorkStatus()));
        }
        if (needsMapping(dto, dto.getWorkLogOutFlg(), "workLogOutFlg")) {
            entity.setWorkLogOutFlgAsWorkLogOutFlg(CDef.WorkLogOutFlg.codeOf(dto.getWorkLogOutFlg()));
        }
        if (needsMapping(dto, dto.getWorkLogOutDt(), "workLogOutDt")) {
            entity.setWorkLogOutDt(dto.getWorkLogOutDt());
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
        if (!_suppressBClassDtlByWorkStatus && dto.getBClassDtlByWorkStatus() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByWorkStatus();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByWorkStatus(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByWorkStatus(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByWorkStatus().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByWorkStatus());
                }
            }
        };
        if (!_suppressBClassDtlByWorkLogOutFlg && dto.getBClassDtlByWorkLogOutFlg() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByWorkLogOutFlg();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByWorkLogOutFlg(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByWorkLogOutFlg(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByWorkLogOutFlg().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByWorkLogOutFlg());
                }
            }
        };
        if (!_suppressTWorkDataList && !dto.getTWorkDataList().isEmpty()) {
            TWorkDataDtoMapper mapper = new TWorkDataDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressTWorkLog();
            List<TWorkData> relationEntityList = mapper.mappingToEntityList(dto.getTWorkDataList());
            entity.setTWorkDataList(relationEntityList);
            if (reverseReference) {
                for (TWorkData relationEntity : relationEntityList) {
                    relationEntity.setTWorkLog(entity);
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
    protected boolean needsMapping(TWorkLogDto dto, Object value, String propName) {
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
    public List<TWorkLog> mappingToEntityList(List<TWorkLogDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<TWorkLog> entityList = new ArrayList<TWorkLog>();
        for (TWorkLogDto dto : dtoList) {
            TWorkLog entity = mappingToEntity(dto);
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
    public void suppressBClassDtlByWorkStatus() {
        _suppressBClassDtlByWorkStatus = true;
    }
    public void suppressBClassDtlByWorkLogOutFlg() {
        _suppressBClassDtlByWorkLogOutFlg = true;
    }
    public void suppressTWorkDataList() {
        _suppressTWorkDataList = true;
    }
    protected void doSuppressAll() { // internal
        suppressBClassDtlByWorkStatus();
        suppressBClassDtlByWorkLogOutFlg();
        suppressTWorkDataList();
    }
    protected void doSuppressClear() { // internal
        _suppressBClassDtlByWorkStatus = false;
        _suppressBClassDtlByWorkLogOutFlg = false;
        _suppressTWorkDataList = false;
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
    public TWorkLogDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (TWorkLogDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public TWorkLogDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (TWorkLogDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public TWorkLogDtoMapper reverseReference() {
        setReverseReference(true);
        return (TWorkLogDtoMapper)this;
    }
}
