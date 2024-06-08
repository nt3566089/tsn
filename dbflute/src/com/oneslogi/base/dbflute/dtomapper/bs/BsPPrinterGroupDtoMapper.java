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
 * The DTO mapper of P_PRINTER_GROUP as TABLE. <br>
 * プリンタグループマスタ
 * <pre>
 * [primary-key]
 *     PRINTER_GROUP_ID
 *
 * [column]
 *     PRINTER_GROUP_ID, PRINTER_GROUP_NM, ATTRIBUTE1, ATTRIBUTE2, ATTRIBUTE3, ATTRIBUTE4, ATTRIBUTE5, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PRINTER_GROUP_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     
 *
 * [referrer-table]
 *     P_LAYOUT_PRINT_SETTING, P_PRINTER, P_USER_AUTO_PRINT_SETTING, P_TERMINAL_AUTO_PRINT_SET
 *
 * [foreign-property]
 *     
 *
 * [referrer-property]
 *     pLayoutPrintSettingList, pPrinterList, pUserAutoPrintSettingByPrinterGroupIdList, pTerminalAutoPrintSetByPrinterGroupIdList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsPPrinterGroupDtoMapper implements DtoMapper<PPrinterGroup, PPrinterGroupDto>, Serializable {

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
    protected boolean _suppressPLayoutPrintSettingList;
    protected boolean _suppressPPrinterList;
    protected boolean _suppressPUserAutoPrintSettingByPrinterGroupIdList;
    protected boolean _suppressPTerminalAutoPrintSetByPrinterGroupIdList;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsPPrinterGroupDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsPPrinterGroupDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public PPrinterGroupDto mappingToDto(PPrinterGroup entity) {
        if (entity == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Entity localKey = createInstanceKeyEntity(entity);
        Object cachedLocalDto = instanceCache ? _relationDtoMap.get(localKey) : null;
        if (cachedLocalDto != null) {
            return (PPrinterGroupDto)cachedLocalDto;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        PPrinterGroupDto dto = new PPrinterGroupDto();
        dto.setPrinterGroupId(entity.getPrinterGroupId());
        dto.setPrinterGroupNm(entity.getPrinterGroupNm());
        dto.setAttribute1(entity.getAttribute1());
        dto.setAttribute2(entity.getAttribute2());
        dto.setAttribute3(entity.getAttribute3());
        dto.setAttribute4(entity.getAttribute4());
        dto.setAttribute5(entity.getAttribute5());
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
        if (!_suppressPLayoutPrintSettingList && !entity.getPLayoutPrintSettingList().isEmpty()) {
            PLayoutPrintSettingDtoMapper mapper = new PLayoutPrintSettingDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressPPrinterGroup();
            List<PLayoutPrintSettingDto> relationDtoList = mapper.mappingToDtoList(entity.getPLayoutPrintSettingList());
            dto.setPLayoutPrintSettingList(relationDtoList);
            if (reverseReference) {
                for (PLayoutPrintSettingDto relationDto : relationDtoList) {
                    relationDto.setPPrinterGroup(dto);
                }
            }
        };
        if (!_suppressPPrinterList && !entity.getPPrinterList().isEmpty()) {
            PPrinterDtoMapper mapper = new PPrinterDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressPPrinterGroup();
            List<PPrinterDto> relationDtoList = mapper.mappingToDtoList(entity.getPPrinterList());
            dto.setPPrinterList(relationDtoList);
            if (reverseReference) {
                for (PPrinterDto relationDto : relationDtoList) {
                    relationDto.setPPrinterGroup(dto);
                }
            }
        };
        if (!_suppressPUserAutoPrintSettingByPrinterGroupIdList && !entity.getPUserAutoPrintSettingByPrinterGroupIdList().isEmpty()) {
            PUserAutoPrintSettingDtoMapper mapper = new PUserAutoPrintSettingDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressPPrinterGroupByPrinterGroupId();
            List<PUserAutoPrintSettingDto> relationDtoList = mapper.mappingToDtoList(entity.getPUserAutoPrintSettingByPrinterGroupIdList());
            dto.setPUserAutoPrintSettingByPrinterGroupIdList(relationDtoList);
            if (reverseReference) {
                for (PUserAutoPrintSettingDto relationDto : relationDtoList) {
                    relationDto.setPPrinterGroupByPrinterGroupId(dto);
                }
            }
        };
        if (!_suppressPTerminalAutoPrintSetByPrinterGroupIdList && !entity.getPTerminalAutoPrintSetByPrinterGroupIdList().isEmpty()) {
            PTerminalAutoPrintSetDtoMapper mapper = new PTerminalAutoPrintSetDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressPPrinterGroupByPrinterGroupId();
            List<PTerminalAutoPrintSetDto> relationDtoList = mapper.mappingToDtoList(entity.getPTerminalAutoPrintSetByPrinterGroupIdList());
            dto.setPTerminalAutoPrintSetByPrinterGroupIdList(relationDtoList);
            if (reverseReference) {
                for (PTerminalAutoPrintSetDto relationDto : relationDtoList) {
                    relationDto.setPPrinterGroupByPrinterGroupId(dto);
                }
            }
        };
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<PPrinterGroupDto> mappingToDtoList(List<PPrinterGroup> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<PPrinterGroupDto> dtoList = new ArrayList<PPrinterGroupDto>();
        for (PPrinterGroup entity : entityList) {
            PPrinterGroupDto dto = mappingToDto(entity);
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
    public PPrinterGroup mappingToEntity(PPrinterGroupDto dto) {
        if (dto == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Object localKey = createInstanceKeyDto(dto, dto.instanceHash());
        Entity cachedLocalEntity = instanceCache ? _relationEntityMap.get(localKey) : null;
        if (cachedLocalEntity != null) {
            return (PPrinterGroup)cachedLocalEntity;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        PPrinterGroup entity = new PPrinterGroup();
        if (needsMapping(dto, dto.getPrinterGroupId(), "printerGroupId")) {
            entity.setPrinterGroupId(dto.getPrinterGroupId());
        }
        if (needsMapping(dto, dto.getPrinterGroupNm(), "printerGroupNm")) {
            entity.setPrinterGroupNm(dto.getPrinterGroupNm());
        }
        if (needsMapping(dto, dto.getAttribute1(), "attribute1")) {
            entity.setAttribute1(dto.getAttribute1());
        }
        if (needsMapping(dto, dto.getAttribute2(), "attribute2")) {
            entity.setAttribute2(dto.getAttribute2());
        }
        if (needsMapping(dto, dto.getAttribute3(), "attribute3")) {
            entity.setAttribute3(dto.getAttribute3());
        }
        if (needsMapping(dto, dto.getAttribute4(), "attribute4")) {
            entity.setAttribute4(dto.getAttribute4());
        }
        if (needsMapping(dto, dto.getAttribute5(), "attribute5")) {
            entity.setAttribute5(dto.getAttribute5());
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
        if (!_suppressPLayoutPrintSettingList && !dto.getPLayoutPrintSettingList().isEmpty()) {
            PLayoutPrintSettingDtoMapper mapper = new PLayoutPrintSettingDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressPPrinterGroup();
            List<PLayoutPrintSetting> relationEntityList = mapper.mappingToEntityList(dto.getPLayoutPrintSettingList());
            entity.setPLayoutPrintSettingList(relationEntityList);
            if (reverseReference) {
                for (PLayoutPrintSetting relationEntity : relationEntityList) {
                    relationEntity.setPPrinterGroup(entity);
                }
            }
        };
        if (!_suppressPPrinterList && !dto.getPPrinterList().isEmpty()) {
            PPrinterDtoMapper mapper = new PPrinterDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressPPrinterGroup();
            List<PPrinter> relationEntityList = mapper.mappingToEntityList(dto.getPPrinterList());
            entity.setPPrinterList(relationEntityList);
            if (reverseReference) {
                for (PPrinter relationEntity : relationEntityList) {
                    relationEntity.setPPrinterGroup(entity);
                }
            }
        };
        if (!_suppressPUserAutoPrintSettingByPrinterGroupIdList && !dto.getPUserAutoPrintSettingByPrinterGroupIdList().isEmpty()) {
            PUserAutoPrintSettingDtoMapper mapper = new PUserAutoPrintSettingDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressPPrinterGroupByPrinterGroupId();
            List<PUserAutoPrintSetting> relationEntityList = mapper.mappingToEntityList(dto.getPUserAutoPrintSettingByPrinterGroupIdList());
            entity.setPUserAutoPrintSettingByPrinterGroupIdList(relationEntityList);
            if (reverseReference) {
                for (PUserAutoPrintSetting relationEntity : relationEntityList) {
                    relationEntity.setPPrinterGroupByPrinterGroupId(entity);
                }
            }
        };
        if (!_suppressPTerminalAutoPrintSetByPrinterGroupIdList && !dto.getPTerminalAutoPrintSetByPrinterGroupIdList().isEmpty()) {
            PTerminalAutoPrintSetDtoMapper mapper = new PTerminalAutoPrintSetDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressPPrinterGroupByPrinterGroupId();
            List<PTerminalAutoPrintSet> relationEntityList = mapper.mappingToEntityList(dto.getPTerminalAutoPrintSetByPrinterGroupIdList());
            entity.setPTerminalAutoPrintSetByPrinterGroupIdList(relationEntityList);
            if (reverseReference) {
                for (PTerminalAutoPrintSet relationEntity : relationEntityList) {
                    relationEntity.setPPrinterGroupByPrinterGroupId(entity);
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
    protected boolean needsMapping(PPrinterGroupDto dto, Object value, String propName) {
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
    public List<PPrinterGroup> mappingToEntityList(List<PPrinterGroupDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<PPrinterGroup> entityList = new ArrayList<PPrinterGroup>();
        for (PPrinterGroupDto dto : dtoList) {
            PPrinterGroup entity = mappingToEntity(dto);
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
    public void suppressPLayoutPrintSettingList() {
        _suppressPLayoutPrintSettingList = true;
    }
    public void suppressPPrinterList() {
        _suppressPPrinterList = true;
    }
    public void suppressPUserAutoPrintSettingByPrinterGroupIdList() {
        _suppressPUserAutoPrintSettingByPrinterGroupIdList = true;
    }
    public void suppressPTerminalAutoPrintSetByPrinterGroupIdList() {
        _suppressPTerminalAutoPrintSetByPrinterGroupIdList = true;
    }
    protected void doSuppressAll() { // internal
        suppressPLayoutPrintSettingList();
        suppressPPrinterList();
        suppressPUserAutoPrintSettingByPrinterGroupIdList();
        suppressPTerminalAutoPrintSetByPrinterGroupIdList();
    }
    protected void doSuppressClear() { // internal
        _suppressPLayoutPrintSettingList = false;
        _suppressPPrinterList = false;
        _suppressPUserAutoPrintSettingByPrinterGroupIdList = false;
        _suppressPTerminalAutoPrintSetByPrinterGroupIdList = false;
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
    public PPrinterGroupDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (PPrinterGroupDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public PPrinterGroupDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (PPrinterGroupDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public PPrinterGroupDtoMapper reverseReference() {
        setReverseReference(true);
        return (PPrinterGroupDtoMapper)this;
    }
}
