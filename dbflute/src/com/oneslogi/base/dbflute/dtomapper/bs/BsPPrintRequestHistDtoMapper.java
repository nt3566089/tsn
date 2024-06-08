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
 * The DTO mapper of P_PRINT_REQUEST_HIST as TABLE. <br>
 * 印刷履歴情報
 * <pre>
 * [primary-key]
 *     PRINT_REQUEST_HIST_ID
 *
 * [column]
 *     PRINT_REQUEST_HIST_ID, PRINT_REQUEST_ID, PRINT_REQUEST_NO, PRINTER_NM, TRAY_NM, PRINT_NUM, DOCUMENT_PAGE_SIZE, SHEET_COLLATE, PRINT_RESULT_CLASS, PROCESS_INFO, QUEUE_ADD_DT, PRINT_DT, PRINT_DATA_TYPE, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PRINT_REQUEST_HIST_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     P_PRINT_REQUEST, B_CLASS_DTL(BySheetCollate)
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     pPrintRequest, bClassDtlBySheetCollate, bClassDtlByPrintResultClass
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsPPrintRequestHistDtoMapper implements DtoMapper<PPrintRequestHist, PPrintRequestHistDto>, Serializable {

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
    protected boolean _suppressBClassDtlBySheetCollate;
    protected boolean _suppressBClassDtlByPrintResultClass;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsPPrintRequestHistDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsPPrintRequestHistDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public PPrintRequestHistDto mappingToDto(PPrintRequestHist entity) {
        if (entity == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Entity localKey = createInstanceKeyEntity(entity);
        Object cachedLocalDto = instanceCache ? _relationDtoMap.get(localKey) : null;
        if (cachedLocalDto != null) {
            return (PPrintRequestHistDto)cachedLocalDto;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        PPrintRequestHistDto dto = new PPrintRequestHistDto();
        dto.setPrintRequestHistId(entity.getPrintRequestHistId());
        dto.setPrintRequestId(entity.getPrintRequestId());
        dto.setPrintRequestNo(entity.getPrintRequestNo());
        dto.setPrinterNm(entity.getPrinterNm());
        dto.setTrayNm(entity.getTrayNm());
        dto.setPrintNum(entity.getPrintNum());
        dto.setDocumentPageSize(entity.getDocumentPageSize());
        dto.setSheetCollate(entity.getSheetCollate());
        dto.setPrintResultClass(entity.getPrintResultClass());
        dto.setProcessInfo(entity.getProcessInfo());
        dto.setQueueAddDt(entity.getQueueAddDt());
        dto.setPrintDt(entity.getPrintDt());
        dto.setPrintDataType(entity.getPrintDataType());
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
                    relationDto.getPPrintRequestHistList().add(dto);
                }
            } else {
                PPrintRequestDtoMapper mapper = new PPrintRequestDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressPPrintRequestHistList();
                PPrintRequestDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setPPrintRequest(relationDto);
                if (reverseReference) {
                    relationDto.getPPrintRequestHistList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getPPrintRequest());
                }
            }
        };
        if (!_suppressBClassDtlBySheetCollate && entity.getBClassDtlBySheetCollate() != null) {
            BClassDtl relationEntity = entity.getBClassDtlBySheetCollate();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlBySheetCollate(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlBySheetCollate(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlBySheetCollate());
                }
            }
        };
        if (!_suppressBClassDtlByPrintResultClass && entity.getBClassDtlByPrintResultClass() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByPrintResultClass();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByPrintResultClass(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByPrintResultClass(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByPrintResultClass());
                }
            }
        };
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<PPrintRequestHistDto> mappingToDtoList(List<PPrintRequestHist> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<PPrintRequestHistDto> dtoList = new ArrayList<PPrintRequestHistDto>();
        for (PPrintRequestHist entity : entityList) {
            PPrintRequestHistDto dto = mappingToDto(entity);
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
    public PPrintRequestHist mappingToEntity(PPrintRequestHistDto dto) {
        if (dto == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Object localKey = createInstanceKeyDto(dto, dto.instanceHash());
        Entity cachedLocalEntity = instanceCache ? _relationEntityMap.get(localKey) : null;
        if (cachedLocalEntity != null) {
            return (PPrintRequestHist)cachedLocalEntity;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        PPrintRequestHist entity = new PPrintRequestHist();
        if (needsMapping(dto, dto.getPrintRequestHistId(), "printRequestHistId")) {
            entity.setPrintRequestHistId(dto.getPrintRequestHistId());
        }
        if (needsMapping(dto, dto.getPrintRequestId(), "printRequestId")) {
            entity.setPrintRequestId(dto.getPrintRequestId());
        }
        if (needsMapping(dto, dto.getPrintRequestNo(), "printRequestNo")) {
            entity.setPrintRequestNo(dto.getPrintRequestNo());
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
        if (needsMapping(dto, dto.getDocumentPageSize(), "documentPageSize")) {
            entity.setDocumentPageSize(dto.getDocumentPageSize());
        }
        if (needsMapping(dto, dto.getSheetCollate(), "sheetCollate")) {
            entity.setSheetCollateAsSheetCollate(CDef.SheetCollate.codeOf(dto.getSheetCollate()));
        }
        if (needsMapping(dto, dto.getPrintResultClass(), "printResultClass")) {
            entity.setPrintResultClassAsPrintResultClass(CDef.PrintResultClass.codeOf(dto.getPrintResultClass()));
        }
        if (needsMapping(dto, dto.getProcessInfo(), "processInfo")) {
            entity.setProcessInfo(dto.getProcessInfo());
        }
        if (needsMapping(dto, dto.getQueueAddDt(), "queueAddDt")) {
            entity.setQueueAddDt(dto.getQueueAddDt());
        }
        if (needsMapping(dto, dto.getPrintDt(), "printDt")) {
            entity.setPrintDt(dto.getPrintDt());
        }
        if (needsMapping(dto, dto.getPrintDataType(), "printDataType")) {
            entity.setPrintDataType(dto.getPrintDataType());
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
                    relationEntity.getPPrintRequestHistList().add(entity);
                }
            } else {
                PPrintRequestDtoMapper mapper = new PPrintRequestDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressPPrintRequestHistList();
                PPrintRequest relationEntity = mapper.mappingToEntity(relationDto);
                entity.setPPrintRequest(relationEntity);
                if (reverseReference) {
                    relationEntity.getPPrintRequestHistList().add(entity);
                }
                if (instanceCache && entity.getPPrintRequest().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getPPrintRequest());
                }
            }
        };
        if (!_suppressBClassDtlBySheetCollate && dto.getBClassDtlBySheetCollate() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlBySheetCollate();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlBySheetCollate(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlBySheetCollate(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlBySheetCollate().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlBySheetCollate());
                }
            }
        };
        if (!_suppressBClassDtlByPrintResultClass && dto.getBClassDtlByPrintResultClass() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByPrintResultClass();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByPrintResultClass(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByPrintResultClass(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByPrintResultClass().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByPrintResultClass());
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
    protected boolean needsMapping(PPrintRequestHistDto dto, Object value, String propName) {
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
    public List<PPrintRequestHist> mappingToEntityList(List<PPrintRequestHistDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<PPrintRequestHist> entityList = new ArrayList<PPrintRequestHist>();
        for (PPrintRequestHistDto dto : dtoList) {
            PPrintRequestHist entity = mappingToEntity(dto);
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
    public void suppressBClassDtlBySheetCollate() {
        _suppressBClassDtlBySheetCollate = true;
    }
    public void suppressBClassDtlByPrintResultClass() {
        _suppressBClassDtlByPrintResultClass = true;
    }
    protected void doSuppressAll() { // internal
        suppressPPrintRequest();
        suppressBClassDtlBySheetCollate();
        suppressBClassDtlByPrintResultClass();
    }
    protected void doSuppressClear() { // internal
        _suppressPPrintRequest = false;
        _suppressBClassDtlBySheetCollate = false;
        _suppressBClassDtlByPrintResultClass = false;
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
    public PPrintRequestHistDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (PPrintRequestHistDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public PPrintRequestHistDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (PPrintRequestHistDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public PPrintRequestHistDtoMapper reverseReference() {
        setReverseReference(true);
        return (PPrintRequestHistDtoMapper)this;
    }
}
