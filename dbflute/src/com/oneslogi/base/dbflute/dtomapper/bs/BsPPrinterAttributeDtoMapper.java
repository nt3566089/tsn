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
 * The DTO mapper of P_PRINTER_ATTRIBUTE as TABLE. <br>
 * プリンタ属性マスタ
 * <pre>
 * [primary-key]
 *     PRINTER_ATTRIBUTE_ID
 *
 * [column]
 *     PRINTER_ATTRIBUTE_ID, PRINTER_ID, TRAY_NM, VISIBLE, ADD_TERMINAL, UPD_TERMINAL, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PRINTER_ATTRIBUTE_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     P_PRINTER, B_CLASS_DTL(ByVisible)
 *
 * [referrer-table]
 *     P_LAYOUT_PRINT_SETTING, P_USER_AUTO_PRINT_SETTING, P_TERMINAL_AUTO_PRINT_SET
 *
 * [foreign-property]
 *     pPrinter, bClassDtlByVisible
 *
 * [referrer-property]
 *     pLayoutPrintSettingList, pUserAutoPrintSettingByPrinterAttributeIdList, pTerminalAutoPrintSetByPrinterAttributeIdList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsPPrinterAttributeDtoMapper implements DtoMapper<PPrinterAttribute, PPrinterAttributeDto>, Serializable {

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
    protected boolean _suppressPPrinter;
    protected boolean _suppressBClassDtlByVisible;
    protected boolean _suppressPLayoutPrintSettingList;
    protected boolean _suppressPUserAutoPrintSettingByPrinterAttributeIdList;
    protected boolean _suppressPTerminalAutoPrintSetByPrinterAttributeIdList;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsPPrinterAttributeDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsPPrinterAttributeDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public PPrinterAttributeDto mappingToDto(PPrinterAttribute entity) {
        if (entity == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Entity localKey = createInstanceKeyEntity(entity);
        Object cachedLocalDto = instanceCache ? _relationDtoMap.get(localKey) : null;
        if (cachedLocalDto != null) {
            return (PPrinterAttributeDto)cachedLocalDto;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        PPrinterAttributeDto dto = new PPrinterAttributeDto();
        dto.setPrinterAttributeId(entity.getPrinterAttributeId());
        dto.setPrinterId(entity.getPrinterId());
        dto.setTrayNm(entity.getTrayNm());
        dto.setVisible(entity.getVisible());
        dto.setAddTerminal(entity.getAddTerminal());
        dto.setUpdTerminal(entity.getUpdTerminal());
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
        if (!_suppressPPrinter && entity.getPPrinter() != null) {
            PPrinter relationEntity = entity.getPPrinter();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                PPrinterDto relationDto = (PPrinterDto)cachedDto;
                dto.setPPrinter(relationDto);
                if (reverseReference) {
                    relationDto.getPPrinterAttributeList().add(dto);
                }
            } else {
                PPrinterDtoMapper mapper = new PPrinterDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressPPrinterAttributeList();
                PPrinterDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setPPrinter(relationDto);
                if (reverseReference) {
                    relationDto.getPPrinterAttributeList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getPPrinter());
                }
            }
        };
        if (!_suppressBClassDtlByVisible && entity.getBClassDtlByVisible() != null) {
            BClassDtl relationEntity = entity.getBClassDtlByVisible();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BClassDtlDto relationDto = (BClassDtlDto)cachedDto;
                dto.setBClassDtlByVisible(relationDto);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtlDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBClassDtlByVisible(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBClassDtlByVisible());
                }
            }
        };
        if (!_suppressPLayoutPrintSettingList && !entity.getPLayoutPrintSettingList().isEmpty()) {
            PLayoutPrintSettingDtoMapper mapper = new PLayoutPrintSettingDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressPPrinterAttribute();
            List<PLayoutPrintSettingDto> relationDtoList = mapper.mappingToDtoList(entity.getPLayoutPrintSettingList());
            dto.setPLayoutPrintSettingList(relationDtoList);
            if (reverseReference) {
                for (PLayoutPrintSettingDto relationDto : relationDtoList) {
                    relationDto.setPPrinterAttribute(dto);
                }
            }
        };
        if (!_suppressPUserAutoPrintSettingByPrinterAttributeIdList && !entity.getPUserAutoPrintSettingByPrinterAttributeIdList().isEmpty()) {
            PUserAutoPrintSettingDtoMapper mapper = new PUserAutoPrintSettingDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressPPrinterAttributeByPrinterAttributeId();
            List<PUserAutoPrintSettingDto> relationDtoList = mapper.mappingToDtoList(entity.getPUserAutoPrintSettingByPrinterAttributeIdList());
            dto.setPUserAutoPrintSettingByPrinterAttributeIdList(relationDtoList);
            if (reverseReference) {
                for (PUserAutoPrintSettingDto relationDto : relationDtoList) {
                    relationDto.setPPrinterAttributeByPrinterAttributeId(dto);
                }
            }
        };
        if (!_suppressPTerminalAutoPrintSetByPrinterAttributeIdList && !entity.getPTerminalAutoPrintSetByPrinterAttributeIdList().isEmpty()) {
            PTerminalAutoPrintSetDtoMapper mapper = new PTerminalAutoPrintSetDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressPPrinterAttributeByPrinterAttributeId();
            List<PTerminalAutoPrintSetDto> relationDtoList = mapper.mappingToDtoList(entity.getPTerminalAutoPrintSetByPrinterAttributeIdList());
            dto.setPTerminalAutoPrintSetByPrinterAttributeIdList(relationDtoList);
            if (reverseReference) {
                for (PTerminalAutoPrintSetDto relationDto : relationDtoList) {
                    relationDto.setPPrinterAttributeByPrinterAttributeId(dto);
                }
            }
        };
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<PPrinterAttributeDto> mappingToDtoList(List<PPrinterAttribute> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<PPrinterAttributeDto> dtoList = new ArrayList<PPrinterAttributeDto>();
        for (PPrinterAttribute entity : entityList) {
            PPrinterAttributeDto dto = mappingToDto(entity);
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
    public PPrinterAttribute mappingToEntity(PPrinterAttributeDto dto) {
        if (dto == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Object localKey = createInstanceKeyDto(dto, dto.instanceHash());
        Entity cachedLocalEntity = instanceCache ? _relationEntityMap.get(localKey) : null;
        if (cachedLocalEntity != null) {
            return (PPrinterAttribute)cachedLocalEntity;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        PPrinterAttribute entity = new PPrinterAttribute();
        if (needsMapping(dto, dto.getPrinterAttributeId(), "printerAttributeId")) {
            entity.setPrinterAttributeId(dto.getPrinterAttributeId());
        }
        if (needsMapping(dto, dto.getPrinterId(), "printerId")) {
            entity.setPrinterId(dto.getPrinterId());
        }
        if (needsMapping(dto, dto.getTrayNm(), "trayNm")) {
            entity.setTrayNm(dto.getTrayNm());
        }
        if (needsMapping(dto, dto.getVisible(), "visible")) {
            entity.setVisibleAsVisible(CDef.Visible.codeOf(dto.getVisible()));
        }
        if (needsMapping(dto, dto.getAddTerminal(), "addTerminal")) {
            entity.setAddTerminal(dto.getAddTerminal());
        }
        if (needsMapping(dto, dto.getUpdTerminal(), "updTerminal")) {
            entity.setUpdTerminal(dto.getUpdTerminal());
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
        if (!_suppressPPrinter && dto.getPPrinter() != null) {
            PPrinterDto relationDto = dto.getPPrinter();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                PPrinter relationEntity = (PPrinter)cachedEntity;
                entity.setPPrinter(relationEntity);
                if (reverseReference) {
                    relationEntity.getPPrinterAttributeList().add(entity);
                }
            } else {
                PPrinterDtoMapper mapper = new PPrinterDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressPPrinterAttributeList();
                PPrinter relationEntity = mapper.mappingToEntity(relationDto);
                entity.setPPrinter(relationEntity);
                if (reverseReference) {
                    relationEntity.getPPrinterAttributeList().add(entity);
                }
                if (instanceCache && entity.getPPrinter().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getPPrinter());
                }
            }
        };
        if (!_suppressBClassDtlByVisible && dto.getBClassDtlByVisible() != null) {
            BClassDtlDto relationDto = dto.getBClassDtlByVisible();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BClassDtl relationEntity = (BClassDtl)cachedEntity;
                entity.setBClassDtlByVisible(relationEntity);
                if (reverseReference) {
                }
            } else {
                BClassDtlDtoMapper mapper = new BClassDtlDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                BClassDtl relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBClassDtlByVisible(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getBClassDtlByVisible().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBClassDtlByVisible());
                }
            }
        };
        if (!_suppressPLayoutPrintSettingList && !dto.getPLayoutPrintSettingList().isEmpty()) {
            PLayoutPrintSettingDtoMapper mapper = new PLayoutPrintSettingDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressPPrinterAttribute();
            List<PLayoutPrintSetting> relationEntityList = mapper.mappingToEntityList(dto.getPLayoutPrintSettingList());
            entity.setPLayoutPrintSettingList(relationEntityList);
            if (reverseReference) {
                for (PLayoutPrintSetting relationEntity : relationEntityList) {
                    relationEntity.setPPrinterAttribute(entity);
                }
            }
        };
        if (!_suppressPUserAutoPrintSettingByPrinterAttributeIdList && !dto.getPUserAutoPrintSettingByPrinterAttributeIdList().isEmpty()) {
            PUserAutoPrintSettingDtoMapper mapper = new PUserAutoPrintSettingDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressPPrinterAttributeByPrinterAttributeId();
            List<PUserAutoPrintSetting> relationEntityList = mapper.mappingToEntityList(dto.getPUserAutoPrintSettingByPrinterAttributeIdList());
            entity.setPUserAutoPrintSettingByPrinterAttributeIdList(relationEntityList);
            if (reverseReference) {
                for (PUserAutoPrintSetting relationEntity : relationEntityList) {
                    relationEntity.setPPrinterAttributeByPrinterAttributeId(entity);
                }
            }
        };
        if (!_suppressPTerminalAutoPrintSetByPrinterAttributeIdList && !dto.getPTerminalAutoPrintSetByPrinterAttributeIdList().isEmpty()) {
            PTerminalAutoPrintSetDtoMapper mapper = new PTerminalAutoPrintSetDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressPPrinterAttributeByPrinterAttributeId();
            List<PTerminalAutoPrintSet> relationEntityList = mapper.mappingToEntityList(dto.getPTerminalAutoPrintSetByPrinterAttributeIdList());
            entity.setPTerminalAutoPrintSetByPrinterAttributeIdList(relationEntityList);
            if (reverseReference) {
                for (PTerminalAutoPrintSet relationEntity : relationEntityList) {
                    relationEntity.setPPrinterAttributeByPrinterAttributeId(entity);
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
    protected boolean needsMapping(PPrinterAttributeDto dto, Object value, String propName) {
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
    public List<PPrinterAttribute> mappingToEntityList(List<PPrinterAttributeDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<PPrinterAttribute> entityList = new ArrayList<PPrinterAttribute>();
        for (PPrinterAttributeDto dto : dtoList) {
            PPrinterAttribute entity = mappingToEntity(dto);
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
    public void suppressPPrinter() {
        _suppressPPrinter = true;
    }
    public void suppressBClassDtlByVisible() {
        _suppressBClassDtlByVisible = true;
    }
    public void suppressPLayoutPrintSettingList() {
        _suppressPLayoutPrintSettingList = true;
    }
    public void suppressPUserAutoPrintSettingByPrinterAttributeIdList() {
        _suppressPUserAutoPrintSettingByPrinterAttributeIdList = true;
    }
    public void suppressPTerminalAutoPrintSetByPrinterAttributeIdList() {
        _suppressPTerminalAutoPrintSetByPrinterAttributeIdList = true;
    }
    protected void doSuppressAll() { // internal
        suppressPPrinter();
        suppressBClassDtlByVisible();
        suppressPLayoutPrintSettingList();
        suppressPUserAutoPrintSettingByPrinterAttributeIdList();
        suppressPTerminalAutoPrintSetByPrinterAttributeIdList();
    }
    protected void doSuppressClear() { // internal
        _suppressPPrinter = false;
        _suppressBClassDtlByVisible = false;
        _suppressPLayoutPrintSettingList = false;
        _suppressPUserAutoPrintSettingByPrinterAttributeIdList = false;
        _suppressPTerminalAutoPrintSetByPrinterAttributeIdList = false;
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
    public PPrinterAttributeDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (PPrinterAttributeDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public PPrinterAttributeDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (PPrinterAttributeDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public PPrinterAttributeDtoMapper reverseReference() {
        setReverseReference(true);
        return (PPrinterAttributeDtoMapper)this;
    }
}
