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
 * The DTO mapper of P_PRINTER as TABLE. <br>
 * プリンタマスタ
 * <pre>
 * [primary-key]
 *     PRINTER_ID
 *
 * [column]
 *     PRINTER_ID, PRINTER_GROUP_ID, PRINTER_NM, VISIBLE, ADD_TERMINAL, UPD_TERMINAL, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PRINTER_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     P_PRINTER_GROUP, B_CLASS_DTL(ByVisible)
 *
 * [referrer-table]
 *     P_LAYOUT_PRINT_SETTING, P_PRINTER_ATTRIBUTE, P_USER_AUTO_PRINT_SETTING, P_TERMINAL_AUTO_PRINT_SET
 *
 * [foreign-property]
 *     pPrinterGroup, bClassDtlByVisible
 *
 * [referrer-property]
 *     pLayoutPrintSettingList, pPrinterAttributeList, pUserAutoPrintSettingByPrinterIdList, pTerminalAutoPrintSetByPrinterIdList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsPPrinterDtoMapper implements DtoMapper<PPrinter, PPrinterDto>, Serializable {

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
    protected boolean _suppressPPrinterGroup;
    protected boolean _suppressBClassDtlByVisible;
    protected boolean _suppressPLayoutPrintSettingList;
    protected boolean _suppressPPrinterAttributeList;
    protected boolean _suppressPUserAutoPrintSettingByPrinterIdList;
    protected boolean _suppressPTerminalAutoPrintSetByPrinterIdList;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsPPrinterDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsPPrinterDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public PPrinterDto mappingToDto(PPrinter entity) {
        if (entity == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Entity localKey = createInstanceKeyEntity(entity);
        Object cachedLocalDto = instanceCache ? _relationDtoMap.get(localKey) : null;
        if (cachedLocalDto != null) {
            return (PPrinterDto)cachedLocalDto;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        PPrinterDto dto = new PPrinterDto();
        dto.setPrinterId(entity.getPrinterId());
        dto.setPrinterGroupId(entity.getPrinterGroupId());
        dto.setPrinterNm(entity.getPrinterNm());
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
        if (!_suppressPPrinterGroup && entity.getPPrinterGroup() != null) {
            PPrinterGroup relationEntity = entity.getPPrinterGroup();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                PPrinterGroupDto relationDto = (PPrinterGroupDto)cachedDto;
                dto.setPPrinterGroup(relationDto);
                if (reverseReference) {
                    relationDto.getPPrinterList().add(dto);
                }
            } else {
                PPrinterGroupDtoMapper mapper = new PPrinterGroupDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressPPrinterList();
                PPrinterGroupDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setPPrinterGroup(relationDto);
                if (reverseReference) {
                    relationDto.getPPrinterList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getPPrinterGroup());
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
            mapper.suppressPPrinter();
            List<PLayoutPrintSettingDto> relationDtoList = mapper.mappingToDtoList(entity.getPLayoutPrintSettingList());
            dto.setPLayoutPrintSettingList(relationDtoList);
            if (reverseReference) {
                for (PLayoutPrintSettingDto relationDto : relationDtoList) {
                    relationDto.setPPrinter(dto);
                }
            }
        };
        if (!_suppressPPrinterAttributeList && !entity.getPPrinterAttributeList().isEmpty()) {
            PPrinterAttributeDtoMapper mapper = new PPrinterAttributeDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressPPrinter();
            List<PPrinterAttributeDto> relationDtoList = mapper.mappingToDtoList(entity.getPPrinterAttributeList());
            dto.setPPrinterAttributeList(relationDtoList);
            if (reverseReference) {
                for (PPrinterAttributeDto relationDto : relationDtoList) {
                    relationDto.setPPrinter(dto);
                }
            }
        };
        if (!_suppressPUserAutoPrintSettingByPrinterIdList && !entity.getPUserAutoPrintSettingByPrinterIdList().isEmpty()) {
            PUserAutoPrintSettingDtoMapper mapper = new PUserAutoPrintSettingDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressPPrinterByPrinterId();
            List<PUserAutoPrintSettingDto> relationDtoList = mapper.mappingToDtoList(entity.getPUserAutoPrintSettingByPrinterIdList());
            dto.setPUserAutoPrintSettingByPrinterIdList(relationDtoList);
            if (reverseReference) {
                for (PUserAutoPrintSettingDto relationDto : relationDtoList) {
                    relationDto.setPPrinterByPrinterId(dto);
                }
            }
        };
        if (!_suppressPTerminalAutoPrintSetByPrinterIdList && !entity.getPTerminalAutoPrintSetByPrinterIdList().isEmpty()) {
            PTerminalAutoPrintSetDtoMapper mapper = new PTerminalAutoPrintSetDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressPPrinterByPrinterId();
            List<PTerminalAutoPrintSetDto> relationDtoList = mapper.mappingToDtoList(entity.getPTerminalAutoPrintSetByPrinterIdList());
            dto.setPTerminalAutoPrintSetByPrinterIdList(relationDtoList);
            if (reverseReference) {
                for (PTerminalAutoPrintSetDto relationDto : relationDtoList) {
                    relationDto.setPPrinterByPrinterId(dto);
                }
            }
        };
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<PPrinterDto> mappingToDtoList(List<PPrinter> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<PPrinterDto> dtoList = new ArrayList<PPrinterDto>();
        for (PPrinter entity : entityList) {
            PPrinterDto dto = mappingToDto(entity);
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
    public PPrinter mappingToEntity(PPrinterDto dto) {
        if (dto == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Object localKey = createInstanceKeyDto(dto, dto.instanceHash());
        Entity cachedLocalEntity = instanceCache ? _relationEntityMap.get(localKey) : null;
        if (cachedLocalEntity != null) {
            return (PPrinter)cachedLocalEntity;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        PPrinter entity = new PPrinter();
        if (needsMapping(dto, dto.getPrinterId(), "printerId")) {
            entity.setPrinterId(dto.getPrinterId());
        }
        if (needsMapping(dto, dto.getPrinterGroupId(), "printerGroupId")) {
            entity.setPrinterGroupId(dto.getPrinterGroupId());
        }
        if (needsMapping(dto, dto.getPrinterNm(), "printerNm")) {
            entity.setPrinterNm(dto.getPrinterNm());
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
        if (!_suppressPPrinterGroup && dto.getPPrinterGroup() != null) {
            PPrinterGroupDto relationDto = dto.getPPrinterGroup();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                PPrinterGroup relationEntity = (PPrinterGroup)cachedEntity;
                entity.setPPrinterGroup(relationEntity);
                if (reverseReference) {
                    relationEntity.getPPrinterList().add(entity);
                }
            } else {
                PPrinterGroupDtoMapper mapper = new PPrinterGroupDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressPPrinterList();
                PPrinterGroup relationEntity = mapper.mappingToEntity(relationDto);
                entity.setPPrinterGroup(relationEntity);
                if (reverseReference) {
                    relationEntity.getPPrinterList().add(entity);
                }
                if (instanceCache && entity.getPPrinterGroup().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getPPrinterGroup());
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
            mapper.suppressPPrinter();
            List<PLayoutPrintSetting> relationEntityList = mapper.mappingToEntityList(dto.getPLayoutPrintSettingList());
            entity.setPLayoutPrintSettingList(relationEntityList);
            if (reverseReference) {
                for (PLayoutPrintSetting relationEntity : relationEntityList) {
                    relationEntity.setPPrinter(entity);
                }
            }
        };
        if (!_suppressPPrinterAttributeList && !dto.getPPrinterAttributeList().isEmpty()) {
            PPrinterAttributeDtoMapper mapper = new PPrinterAttributeDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressPPrinter();
            List<PPrinterAttribute> relationEntityList = mapper.mappingToEntityList(dto.getPPrinterAttributeList());
            entity.setPPrinterAttributeList(relationEntityList);
            if (reverseReference) {
                for (PPrinterAttribute relationEntity : relationEntityList) {
                    relationEntity.setPPrinter(entity);
                }
            }
        };
        if (!_suppressPUserAutoPrintSettingByPrinterIdList && !dto.getPUserAutoPrintSettingByPrinterIdList().isEmpty()) {
            PUserAutoPrintSettingDtoMapper mapper = new PUserAutoPrintSettingDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressPPrinterByPrinterId();
            List<PUserAutoPrintSetting> relationEntityList = mapper.mappingToEntityList(dto.getPUserAutoPrintSettingByPrinterIdList());
            entity.setPUserAutoPrintSettingByPrinterIdList(relationEntityList);
            if (reverseReference) {
                for (PUserAutoPrintSetting relationEntity : relationEntityList) {
                    relationEntity.setPPrinterByPrinterId(entity);
                }
            }
        };
        if (!_suppressPTerminalAutoPrintSetByPrinterIdList && !dto.getPTerminalAutoPrintSetByPrinterIdList().isEmpty()) {
            PTerminalAutoPrintSetDtoMapper mapper = new PTerminalAutoPrintSetDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressPPrinterByPrinterId();
            List<PTerminalAutoPrintSet> relationEntityList = mapper.mappingToEntityList(dto.getPTerminalAutoPrintSetByPrinterIdList());
            entity.setPTerminalAutoPrintSetByPrinterIdList(relationEntityList);
            if (reverseReference) {
                for (PTerminalAutoPrintSet relationEntity : relationEntityList) {
                    relationEntity.setPPrinterByPrinterId(entity);
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
    protected boolean needsMapping(PPrinterDto dto, Object value, String propName) {
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
    public List<PPrinter> mappingToEntityList(List<PPrinterDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<PPrinter> entityList = new ArrayList<PPrinter>();
        for (PPrinterDto dto : dtoList) {
            PPrinter entity = mappingToEntity(dto);
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
    public void suppressPPrinterGroup() {
        _suppressPPrinterGroup = true;
    }
    public void suppressBClassDtlByVisible() {
        _suppressBClassDtlByVisible = true;
    }
    public void suppressPLayoutPrintSettingList() {
        _suppressPLayoutPrintSettingList = true;
    }
    public void suppressPPrinterAttributeList() {
        _suppressPPrinterAttributeList = true;
    }
    public void suppressPUserAutoPrintSettingByPrinterIdList() {
        _suppressPUserAutoPrintSettingByPrinterIdList = true;
    }
    public void suppressPTerminalAutoPrintSetByPrinterIdList() {
        _suppressPTerminalAutoPrintSetByPrinterIdList = true;
    }
    protected void doSuppressAll() { // internal
        suppressPPrinterGroup();
        suppressBClassDtlByVisible();
        suppressPLayoutPrintSettingList();
        suppressPPrinterAttributeList();
        suppressPUserAutoPrintSettingByPrinterIdList();
        suppressPTerminalAutoPrintSetByPrinterIdList();
    }
    protected void doSuppressClear() { // internal
        _suppressPPrinterGroup = false;
        _suppressBClassDtlByVisible = false;
        _suppressPLayoutPrintSettingList = false;
        _suppressPPrinterAttributeList = false;
        _suppressPUserAutoPrintSettingByPrinterIdList = false;
        _suppressPTerminalAutoPrintSetByPrinterIdList = false;
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
    public PPrinterDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (PPrinterDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public PPrinterDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (PPrinterDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public PPrinterDtoMapper reverseReference() {
        setReverseReference(true);
        return (PPrinterDtoMapper)this;
    }
}
