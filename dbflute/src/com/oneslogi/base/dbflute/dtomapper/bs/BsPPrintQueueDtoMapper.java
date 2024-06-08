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
 * The DTO mapper of P_PRINT_QUEUE as TABLE. <br>
 * 印刷キュー情報
 * <pre>
 * [primary-key]
 *     PRINT_QUEUE_ID
 *
 * [column]
 *     PRINT_QUEUE_ID, PRINT_REQUEST_ID, PRINTER_GROUP_ID, PRINT_QUEUE_STATUS, PRINTER_NM, TRAY_NM, PRINT_NUM, SHEET_COLLATE, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PRINT_QUEUE_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     P_PRINT_REQUEST, B_CLASS_DTL(ByPrintQueueStatus)
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     pPrintRequest, bClassDtlByPrintQueueStatus
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsPPrintQueueDtoMapper implements DtoMapper<PPrintQueue, PPrintQueueDto>, Serializable {

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
    protected boolean _suppressPPrintRequest;
    protected boolean _suppressBClassDtlByPrintQueueStatus;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsPPrintQueueDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsPPrintQueueDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public PPrintQueueDto mappingToDto(PPrintQueue entity) {
        if (entity == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Entity localKey = createInstanceKeyEntity(entity);
        Object cachedLocalDto = instanceCache ? _relationDtoMap.get(localKey) : null;
        if (cachedLocalDto != null) {
            return (PPrintQueueDto)cachedLocalDto;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        PPrintQueueDto dto = new PPrintQueueDto();
        dto.setPrintQueueId(entity.getPrintQueueId());
        dto.setPrintRequestId(entity.getPrintRequestId());
        dto.setPrinterGroupId(entity.getPrinterGroupId());
        dto.setPrintQueueStatus(entity.getPrintQueueStatus());
        dto.setPrinterNm(entity.getPrinterNm());
        dto.setTrayNm(entity.getTrayNm());
        dto.setPrintNum(entity.getPrintNum());
        dto.setSheetCollate(entity.getSheetCollate());
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
        if (!_suppressPPrintRequest && entity.getPPrintRequest() != null) {
            PPrintRequest relationEntity = entity.getPPrintRequest();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                PPrintRequestDto relationDto = (PPrintRequestDto)cachedDto;
                dto.setPPrintRequest(relationDto);
                if (reverseReference) {
                    relationDto.getPPrintQueueList().add(dto);
                }
            } else {
                PPrintRequestDtoMapper mapper = new PPrintRequestDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressPPrintQueueList();
                PPrintRequestDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setPPrintRequest(relationDto);
                if (reverseReference) {
                    relationDto.getPPrintQueueList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getPPrintRequest());
                }
            }
        };
        if (!_suppressBClassDtlByPrintQueueStatus && entity.getBClassDtlByPrintQueueStatus() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByPrintQueueStatus();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByPrintQueueStatus(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByPrintQueueStatus(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByPrintQueueStatus());
                }
            }
        };
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<PPrintQueueDto> mappingToDtoList(List<PPrintQueue> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<PPrintQueueDto> dtoList = new ArrayList<PPrintQueueDto>();
        for (PPrintQueue entity : entityList) {
            PPrintQueueDto dto = mappingToDto(entity);
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
    public PPrintQueue mappingToEntity(PPrintQueueDto dto) {
        if (dto == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Object localKey = createInstanceKeyDto(dto, dto.instanceHash());
        Entity cachedLocalEntity = instanceCache ? _relationEntityMap.get(localKey) : null;
        if (cachedLocalEntity != null) {
            return (PPrintQueue)cachedLocalEntity;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        PPrintQueue entity = new PPrintQueue();
        if (needsMapping(dto, dto.getPrintQueueId(), "printQueueId")) {
            entity.setPrintQueueId(dto.getPrintQueueId());
        }
        if (needsMapping(dto, dto.getPrintRequestId(), "printRequestId")) {
            entity.setPrintRequestId(dto.getPrintRequestId());
        }
        if (needsMapping(dto, dto.getPrinterGroupId(), "printerGroupId")) {
            entity.setPrinterGroupId(dto.getPrinterGroupId());
        }
        if (needsMapping(dto, dto.getPrintQueueStatus(), "printQueueStatus")) {
            entity.setPrintQueueStatusAsPrintQueueStatus(CDef.PrintQueueStatus.codeOf(dto.getPrintQueueStatus()));
        }
        if (needsMapping(dto, dto.getPrinterNm(), "printerNm")) {
            entity.setPrinterNm(dto.getPrinterNm());
        }
        if (needsMapping(dto, dto.getTrayNm(), "trayNm")) {
            entity.setTrayNm(dto.getTrayNm());
        }
        if (needsMapping(dto, dto.getPrintNum(), "printNum")) {
            entity.setPrintNum(dto.getPrintNum());
        }
        if (needsMapping(dto, dto.getSheetCollate(), "sheetCollate")) {
            entity.setSheetCollate(dto.getSheetCollate());
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
        if (!_suppressPPrintRequest && dto.getPPrintRequest() != null) {
            PPrintRequestDto relationDto = dto.getPPrintRequest();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                PPrintRequest relationEntity = (PPrintRequest)cachedEntity;
                entity.setPPrintRequest(relationEntity);
                if (reverseReference) {
                    relationEntity.getPPrintQueueList().add(entity);
                }
            } else {
                PPrintRequestDtoMapper mapper = new PPrintRequestDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressPPrintQueueList();
                PPrintRequest relationEntity = mapper.mappingToEntity(relationDto);
                entity.setPPrintRequest(relationEntity);
                if (reverseReference) {
                    relationEntity.getPPrintQueueList().add(entity);
                }
                if (instanceCache && entity.getPPrintRequest().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getPPrintRequest());
                }
            }
        };
        if (!_suppressBClassDtlByPrintQueueStatus && dto.getBClassDtlByPrintQueueStatus() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByPrintQueueStatus();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByPrintQueueStatus(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByPrintQueueStatus(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByPrintQueueStatus().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByPrintQueueStatus());
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
    protected boolean needsMapping(PPrintQueueDto dto, Object value, String propName) {
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
    public List<PPrintQueue> mappingToEntityList(List<PPrintQueueDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<PPrintQueue> entityList = new ArrayList<PPrintQueue>();
        for (PPrintQueueDto dto : dtoList) {
            PPrintQueue entity = mappingToEntity(dto);
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
    public void suppressPPrintRequest() {
        _suppressPPrintRequest = true;
    }
    public void suppressBClassDtlByPrintQueueStatus() {
        _suppressBClassDtlByPrintQueueStatus = true;
    }
    protected void doSuppressAll() { // internal
        suppressPPrintRequest();
        suppressBClassDtlByPrintQueueStatus();
    }
    protected void doSuppressClear() { // internal
        _suppressPPrintRequest = false;
        _suppressBClassDtlByPrintQueueStatus = false;
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
    public PPrintQueueDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (PPrintQueueDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public PPrintQueueDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (PPrintQueueDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public PPrintQueueDtoMapper reverseReference() {
        setReverseReference(true);
        return (PPrintQueueDtoMapper)this;
    }
}