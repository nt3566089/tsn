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
 * The DTO mapper of P_USER_AUTO_PRINT_SETTING as TABLE. <br>
 * ユーザ別自動印刷設定マスタ
 * <pre>
 * [primary-key]
 *     USER_AUTO_PRINT_SETTING_ID
 *
 * [column]
 *     USER_AUTO_PRINT_SETTING_ID, USER_ID, REPORT_LAYOUT_ID, PRINTER_GROUP_ID, PRINTER_ID, PRINTER_ATTRIBUTE_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     USER_AUTO_PRINT_SETTING_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     P_REPORT_LAYOUT(ByReportLayoutId), P_PRINTER_GROUP(ByPrinterGroupId), P_PRINTER(ByPrinterId), P_PRINTER_ATTRIBUTE(ByPrinterAttributeId)
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     pReportLayoutByReportLayoutId, pPrinterGroupByPrinterGroupId, pPrinterByPrinterId, pPrinterAttributeByPrinterAttributeId
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsPUserAutoPrintSettingDtoMapper implements DtoMapper<PUserAutoPrintSetting, PUserAutoPrintSettingDto>, Serializable {

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
    protected boolean _suppressPReportLayoutByReportLayoutId;
    protected boolean _suppressPPrinterGroupByPrinterGroupId;
    protected boolean _suppressPPrinterByPrinterId;
    protected boolean _suppressPPrinterAttributeByPrinterAttributeId;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsPUserAutoPrintSettingDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsPUserAutoPrintSettingDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public PUserAutoPrintSettingDto mappingToDto(PUserAutoPrintSetting entity) {
        if (entity == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Entity localKey = createInstanceKeyEntity(entity);
        Object cachedLocalDto = instanceCache ? _relationDtoMap.get(localKey) : null;
        if (cachedLocalDto != null) {
            return (PUserAutoPrintSettingDto)cachedLocalDto;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        PUserAutoPrintSettingDto dto = new PUserAutoPrintSettingDto();
        dto.setUserAutoPrintSettingId(entity.getUserAutoPrintSettingId());
        dto.setUserId(entity.getUserId());
        dto.setReportLayoutId(entity.getReportLayoutId());
        dto.setPrinterGroupId(entity.getPrinterGroupId());
        dto.setPrinterId(entity.getPrinterId());
        dto.setPrinterAttributeId(entity.getPrinterAttributeId());
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
        if (!_suppressPReportLayoutByReportLayoutId && entity.getPReportLayoutByReportLayoutId() != null) {
            PReportLayout relationEntity = entity.getPReportLayoutByReportLayoutId();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                PReportLayoutDto relationDto = (PReportLayoutDto)cachedDto;
                dto.setPReportLayoutByReportLayoutId(relationDto);
                if (reverseReference) {
                    relationDto.getPUserAutoPrintSettingByReportLayoutIdList().add(dto);
                }
            } else {
                PReportLayoutDtoMapper mapper = new PReportLayoutDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressPUserAutoPrintSettingByReportLayoutIdList();
                PReportLayoutDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setPReportLayoutByReportLayoutId(relationDto);
                if (reverseReference) {
                    relationDto.getPUserAutoPrintSettingByReportLayoutIdList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getPReportLayoutByReportLayoutId());
                }
            }
        };
        if (!_suppressPPrinterGroupByPrinterGroupId && entity.getPPrinterGroupByPrinterGroupId() != null) {
            PPrinterGroup relationEntity = entity.getPPrinterGroupByPrinterGroupId();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                PPrinterGroupDto relationDto = (PPrinterGroupDto)cachedDto;
                dto.setPPrinterGroupByPrinterGroupId(relationDto);
                if (reverseReference) {
                    relationDto.getPUserAutoPrintSettingByPrinterGroupIdList().add(dto);
                }
            } else {
                PPrinterGroupDtoMapper mapper = new PPrinterGroupDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressPUserAutoPrintSettingByPrinterGroupIdList();
                PPrinterGroupDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setPPrinterGroupByPrinterGroupId(relationDto);
                if (reverseReference) {
                    relationDto.getPUserAutoPrintSettingByPrinterGroupIdList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getPPrinterGroupByPrinterGroupId());
                }
            }
        };
        if (!_suppressPPrinterByPrinterId && entity.getPPrinterByPrinterId() != null) {
            PPrinter relationEntity = entity.getPPrinterByPrinterId();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                PPrinterDto relationDto = (PPrinterDto)cachedDto;
                dto.setPPrinterByPrinterId(relationDto);
                if (reverseReference) {
                    relationDto.getPUserAutoPrintSettingByPrinterIdList().add(dto);
                }
            } else {
                PPrinterDtoMapper mapper = new PPrinterDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressPUserAutoPrintSettingByPrinterIdList();
                PPrinterDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setPPrinterByPrinterId(relationDto);
                if (reverseReference) {
                    relationDto.getPUserAutoPrintSettingByPrinterIdList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getPPrinterByPrinterId());
                }
            }
        };
        if (!_suppressPPrinterAttributeByPrinterAttributeId && entity.getPPrinterAttributeByPrinterAttributeId() != null) {
            PPrinterAttribute relationEntity = entity.getPPrinterAttributeByPrinterAttributeId();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                PPrinterAttributeDto relationDto = (PPrinterAttributeDto)cachedDto;
                dto.setPPrinterAttributeByPrinterAttributeId(relationDto);
                if (reverseReference) {
                    relationDto.getPUserAutoPrintSettingByPrinterAttributeIdList().add(dto);
                }
            } else {
                PPrinterAttributeDtoMapper mapper = new PPrinterAttributeDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressPUserAutoPrintSettingByPrinterAttributeIdList();
                PPrinterAttributeDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setPPrinterAttributeByPrinterAttributeId(relationDto);
                if (reverseReference) {
                    relationDto.getPUserAutoPrintSettingByPrinterAttributeIdList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getPPrinterAttributeByPrinterAttributeId());
                }
            }
        };
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<PUserAutoPrintSettingDto> mappingToDtoList(List<PUserAutoPrintSetting> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<PUserAutoPrintSettingDto> dtoList = new ArrayList<PUserAutoPrintSettingDto>();
        for (PUserAutoPrintSetting entity : entityList) {
            PUserAutoPrintSettingDto dto = mappingToDto(entity);
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
    public PUserAutoPrintSetting mappingToEntity(PUserAutoPrintSettingDto dto) {
        if (dto == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Object localKey = createInstanceKeyDto(dto, dto.instanceHash());
        Entity cachedLocalEntity = instanceCache ? _relationEntityMap.get(localKey) : null;
        if (cachedLocalEntity != null) {
            return (PUserAutoPrintSetting)cachedLocalEntity;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        PUserAutoPrintSetting entity = new PUserAutoPrintSetting();
        if (needsMapping(dto, dto.getUserAutoPrintSettingId(), "userAutoPrintSettingId")) {
            entity.setUserAutoPrintSettingId(dto.getUserAutoPrintSettingId());
        }
        if (needsMapping(dto, dto.getUserId(), "userId")) {
            entity.setUserId(dto.getUserId());
        }
        if (needsMapping(dto, dto.getReportLayoutId(), "reportLayoutId")) {
            entity.setReportLayoutId(dto.getReportLayoutId());
        }
        if (needsMapping(dto, dto.getPrinterGroupId(), "printerGroupId")) {
            entity.setPrinterGroupId(dto.getPrinterGroupId());
        }
        if (needsMapping(dto, dto.getPrinterId(), "printerId")) {
            entity.setPrinterId(dto.getPrinterId());
        }
        if (needsMapping(dto, dto.getPrinterAttributeId(), "printerAttributeId")) {
            entity.setPrinterAttributeId(dto.getPrinterAttributeId());
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
        if (!_suppressPReportLayoutByReportLayoutId && dto.getPReportLayoutByReportLayoutId() != null) {
            PReportLayoutDto relationDto = dto.getPReportLayoutByReportLayoutId();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                PReportLayout relationEntity = (PReportLayout)cachedEntity;
                entity.setPReportLayoutByReportLayoutId(relationEntity);
                if (reverseReference) {
                    relationEntity.getPUserAutoPrintSettingByReportLayoutIdList().add(entity);
                }
            } else {
                PReportLayoutDtoMapper mapper = new PReportLayoutDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressPUserAutoPrintSettingByReportLayoutIdList();
                PReportLayout relationEntity = mapper.mappingToEntity(relationDto);
                entity.setPReportLayoutByReportLayoutId(relationEntity);
                if (reverseReference) {
                    relationEntity.getPUserAutoPrintSettingByReportLayoutIdList().add(entity);
                }
                if (instanceCache && entity.getPReportLayoutByReportLayoutId().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getPReportLayoutByReportLayoutId());
                }
            }
        };
        if (!_suppressPPrinterGroupByPrinterGroupId && dto.getPPrinterGroupByPrinterGroupId() != null) {
            PPrinterGroupDto relationDto = dto.getPPrinterGroupByPrinterGroupId();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                PPrinterGroup relationEntity = (PPrinterGroup)cachedEntity;
                entity.setPPrinterGroupByPrinterGroupId(relationEntity);
                if (reverseReference) {
                    relationEntity.getPUserAutoPrintSettingByPrinterGroupIdList().add(entity);
                }
            } else {
                PPrinterGroupDtoMapper mapper = new PPrinterGroupDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressPUserAutoPrintSettingByPrinterGroupIdList();
                PPrinterGroup relationEntity = mapper.mappingToEntity(relationDto);
                entity.setPPrinterGroupByPrinterGroupId(relationEntity);
                if (reverseReference) {
                    relationEntity.getPUserAutoPrintSettingByPrinterGroupIdList().add(entity);
                }
                if (instanceCache && entity.getPPrinterGroupByPrinterGroupId().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getPPrinterGroupByPrinterGroupId());
                }
            }
        };
        if (!_suppressPPrinterByPrinterId && dto.getPPrinterByPrinterId() != null) {
            PPrinterDto relationDto = dto.getPPrinterByPrinterId();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                PPrinter relationEntity = (PPrinter)cachedEntity;
                entity.setPPrinterByPrinterId(relationEntity);
                if (reverseReference) {
                    relationEntity.getPUserAutoPrintSettingByPrinterIdList().add(entity);
                }
            } else {
                PPrinterDtoMapper mapper = new PPrinterDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressPUserAutoPrintSettingByPrinterIdList();
                PPrinter relationEntity = mapper.mappingToEntity(relationDto);
                entity.setPPrinterByPrinterId(relationEntity);
                if (reverseReference) {
                    relationEntity.getPUserAutoPrintSettingByPrinterIdList().add(entity);
                }
                if (instanceCache && entity.getPPrinterByPrinterId().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getPPrinterByPrinterId());
                }
            }
        };
        if (!_suppressPPrinterAttributeByPrinterAttributeId && dto.getPPrinterAttributeByPrinterAttributeId() != null) {
            PPrinterAttributeDto relationDto = dto.getPPrinterAttributeByPrinterAttributeId();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                PPrinterAttribute relationEntity = (PPrinterAttribute)cachedEntity;
                entity.setPPrinterAttributeByPrinterAttributeId(relationEntity);
                if (reverseReference) {
                    relationEntity.getPUserAutoPrintSettingByPrinterAttributeIdList().add(entity);
                }
            } else {
                PPrinterAttributeDtoMapper mapper = new PPrinterAttributeDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressPUserAutoPrintSettingByPrinterAttributeIdList();
                PPrinterAttribute relationEntity = mapper.mappingToEntity(relationDto);
                entity.setPPrinterAttributeByPrinterAttributeId(relationEntity);
                if (reverseReference) {
                    relationEntity.getPUserAutoPrintSettingByPrinterAttributeIdList().add(entity);
                }
                if (instanceCache && entity.getPPrinterAttributeByPrinterAttributeId().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getPPrinterAttributeByPrinterAttributeId());
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
    protected boolean needsMapping(PUserAutoPrintSettingDto dto, Object value, String propName) {
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
    public List<PUserAutoPrintSetting> mappingToEntityList(List<PUserAutoPrintSettingDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<PUserAutoPrintSetting> entityList = new ArrayList<PUserAutoPrintSetting>();
        for (PUserAutoPrintSettingDto dto : dtoList) {
            PUserAutoPrintSetting entity = mappingToEntity(dto);
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
    public void suppressPReportLayoutByReportLayoutId() {
        _suppressPReportLayoutByReportLayoutId = true;
    }
    public void suppressPPrinterGroupByPrinterGroupId() {
        _suppressPPrinterGroupByPrinterGroupId = true;
    }
    public void suppressPPrinterByPrinterId() {
        _suppressPPrinterByPrinterId = true;
    }
    public void suppressPPrinterAttributeByPrinterAttributeId() {
        _suppressPPrinterAttributeByPrinterAttributeId = true;
    }
    protected void doSuppressAll() { // internal
        suppressPReportLayoutByReportLayoutId();
        suppressPPrinterGroupByPrinterGroupId();
        suppressPPrinterByPrinterId();
        suppressPPrinterAttributeByPrinterAttributeId();
    }
    protected void doSuppressClear() { // internal
        _suppressPReportLayoutByReportLayoutId = false;
        _suppressPPrinterGroupByPrinterGroupId = false;
        _suppressPPrinterByPrinterId = false;
        _suppressPPrinterAttributeByPrinterAttributeId = false;
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
    public PUserAutoPrintSettingDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (PUserAutoPrintSettingDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public PUserAutoPrintSettingDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (PUserAutoPrintSettingDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public PUserAutoPrintSettingDtoMapper reverseReference() {
        setReverseReference(true);
        return (PUserAutoPrintSettingDtoMapper)this;
    }
}
