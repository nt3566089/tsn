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
 * The DTO mapper of P_LAYOUT_PRINT_SETTING as TABLE. <br>
 * レイアウト別印刷設定マスタ
 * <pre>
 * [primary-key]
 *     LAYOUT_PRINT_SETTING_ID
 *
 * [column]
 *     LAYOUT_PRINT_SETTING_ID, REPORT_LAYOUT_ID, PRINTER_GROUP_ID, PRINTER_ID, PRINTER_ATTRIBUTE_ID, PRINT_NUM, SHEET_COLLATE, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     LAYOUT_PRINT_SETTING_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     P_PRINTER_GROUP, P_PRINTER_ATTRIBUTE, P_REPORT_LAYOUT, P_PRINTER, B_CLASS_DTL(BySheetCollate)
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     pPrinterGroup, pPrinterAttribute, pReportLayout, pPrinter, bClassDtlBySheetCollate
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsPLayoutPrintSettingDtoMapper implements DtoMapper<PLayoutPrintSetting, PLayoutPrintSettingDto>, Serializable {

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
    protected boolean _suppressPPrinterAttribute;
    protected boolean _suppressPReportLayout;
    protected boolean _suppressPPrinter;
    protected boolean _suppressBClassDtlBySheetCollate;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsPLayoutPrintSettingDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsPLayoutPrintSettingDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public PLayoutPrintSettingDto mappingToDto(PLayoutPrintSetting entity) {
        if (entity == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Entity localKey = createInstanceKeyEntity(entity);
        Object cachedLocalDto = instanceCache ? _relationDtoMap.get(localKey) : null;
        if (cachedLocalDto != null) {
            return (PLayoutPrintSettingDto)cachedLocalDto;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        PLayoutPrintSettingDto dto = new PLayoutPrintSettingDto();
        dto.setLayoutPrintSettingId(entity.getLayoutPrintSettingId());
        dto.setReportLayoutId(entity.getReportLayoutId());
        dto.setPrinterGroupId(entity.getPrinterGroupId());
        dto.setPrinterId(entity.getPrinterId());
        dto.setPrinterAttributeId(entity.getPrinterAttributeId());
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
        if (!_suppressPPrinterGroup && entity.getPPrinterGroup() != null) {
            PPrinterGroup relationEntity = entity.getPPrinterGroup();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                PPrinterGroupDto relationDto = (PPrinterGroupDto)cachedDto;
                dto.setPPrinterGroup(relationDto);
                if (reverseReference) {
                    relationDto.getPLayoutPrintSettingList().add(dto);
                }
            } else {
                PPrinterGroupDtoMapper mapper = new PPrinterGroupDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressPLayoutPrintSettingList();
                PPrinterGroupDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setPPrinterGroup(relationDto);
                if (reverseReference) {
                    relationDto.getPLayoutPrintSettingList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getPPrinterGroup());
                }
            }
        };
        if (!_suppressPPrinterAttribute && entity.getPPrinterAttribute() != null) {
            PPrinterAttribute relationEntity = entity.getPPrinterAttribute();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                PPrinterAttributeDto relationDto = (PPrinterAttributeDto)cachedDto;
                dto.setPPrinterAttribute(relationDto);
                if (reverseReference) {
                    relationDto.getPLayoutPrintSettingList().add(dto);
                }
            } else {
                PPrinterAttributeDtoMapper mapper = new PPrinterAttributeDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressPLayoutPrintSettingList();
                PPrinterAttributeDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setPPrinterAttribute(relationDto);
                if (reverseReference) {
                    relationDto.getPLayoutPrintSettingList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getPPrinterAttribute());
                }
            }
        };
        if (!_suppressPReportLayout && entity.getPReportLayout() != null) {
            PReportLayout relationEntity = entity.getPReportLayout();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                PReportLayoutDto relationDto = (PReportLayoutDto)cachedDto;
                dto.setPReportLayout(relationDto);
                if (reverseReference) {
                    relationDto.setPLayoutPrintSettingAsOne(dto);
                }
            } else {
                PReportLayoutDtoMapper mapper = new PReportLayoutDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressPLayoutPrintSettingAsOne();
                PReportLayoutDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setPReportLayout(relationDto);
                if (reverseReference) {
                    relationDto.setPLayoutPrintSettingAsOne(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getPReportLayout());
                }
            }
        };
        if (!_suppressPPrinter && entity.getPPrinter() != null) {
            PPrinter relationEntity = entity.getPPrinter();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                PPrinterDto relationDto = (PPrinterDto)cachedDto;
                dto.setPPrinter(relationDto);
                if (reverseReference) {
                    relationDto.getPLayoutPrintSettingList().add(dto);
                }
            } else {
                PPrinterDtoMapper mapper = new PPrinterDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressPLayoutPrintSettingList();
                PPrinterDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setPPrinter(relationDto);
                if (reverseReference) {
                    relationDto.getPLayoutPrintSettingList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getPPrinter());
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
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<PLayoutPrintSettingDto> mappingToDtoList(List<PLayoutPrintSetting> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<PLayoutPrintSettingDto> dtoList = new ArrayList<PLayoutPrintSettingDto>();
        for (PLayoutPrintSetting entity : entityList) {
            PLayoutPrintSettingDto dto = mappingToDto(entity);
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
    public PLayoutPrintSetting mappingToEntity(PLayoutPrintSettingDto dto) {
        if (dto == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Object localKey = createInstanceKeyDto(dto, dto.instanceHash());
        Entity cachedLocalEntity = instanceCache ? _relationEntityMap.get(localKey) : null;
        if (cachedLocalEntity != null) {
            return (PLayoutPrintSetting)cachedLocalEntity;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        PLayoutPrintSetting entity = new PLayoutPrintSetting();
        if (needsMapping(dto, dto.getLayoutPrintSettingId(), "layoutPrintSettingId")) {
            entity.setLayoutPrintSettingId(dto.getLayoutPrintSettingId());
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
        if (needsMapping(dto, dto.getPrintNum(), "printNum")) {
            entity.setPrintNum(dto.getPrintNum());
        }
        if (needsMapping(dto, dto.getSheetCollate(), "sheetCollate")) {
            entity.setSheetCollateAsSheetCollate(CDef.SheetCollate.codeOf(dto.getSheetCollate()));
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
                    relationEntity.getPLayoutPrintSettingList().add(entity);
                }
            } else {
                PPrinterGroupDtoMapper mapper = new PPrinterGroupDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressPLayoutPrintSettingList();
                PPrinterGroup relationEntity = mapper.mappingToEntity(relationDto);
                entity.setPPrinterGroup(relationEntity);
                if (reverseReference) {
                    relationEntity.getPLayoutPrintSettingList().add(entity);
                }
                if (instanceCache && entity.getPPrinterGroup().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getPPrinterGroup());
                }
            }
        };
        if (!_suppressPPrinterAttribute && dto.getPPrinterAttribute() != null) {
            PPrinterAttributeDto relationDto = dto.getPPrinterAttribute();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                PPrinterAttribute relationEntity = (PPrinterAttribute)cachedEntity;
                entity.setPPrinterAttribute(relationEntity);
                if (reverseReference) {
                    relationEntity.getPLayoutPrintSettingList().add(entity);
                }
            } else {
                PPrinterAttributeDtoMapper mapper = new PPrinterAttributeDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressPLayoutPrintSettingList();
                PPrinterAttribute relationEntity = mapper.mappingToEntity(relationDto);
                entity.setPPrinterAttribute(relationEntity);
                if (reverseReference) {
                    relationEntity.getPLayoutPrintSettingList().add(entity);
                }
                if (instanceCache && entity.getPPrinterAttribute().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getPPrinterAttribute());
                }
            }
        };
        if (!_suppressPReportLayout && dto.getPReportLayout() != null) {
            PReportLayoutDto relationDto = dto.getPReportLayout();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                PReportLayout relationEntity = (PReportLayout)cachedEntity;
                entity.setPReportLayout(relationEntity);
                if (reverseReference) {
                    relationEntity.setPLayoutPrintSettingAsOne(entity);
                }
            } else {
                PReportLayoutDtoMapper mapper = new PReportLayoutDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressPLayoutPrintSettingAsOne();
                PReportLayout relationEntity = mapper.mappingToEntity(relationDto);
                entity.setPReportLayout(relationEntity);
                if (reverseReference) {
                    relationEntity.setPLayoutPrintSettingAsOne(entity);
                }
                if (instanceCache && entity.getPReportLayout().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getPReportLayout());
                }
            }
        };
        if (!_suppressPPrinter && dto.getPPrinter() != null) {
            PPrinterDto relationDto = dto.getPPrinter();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                PPrinter relationEntity = (PPrinter)cachedEntity;
                entity.setPPrinter(relationEntity);
                if (reverseReference) {
                    relationEntity.getPLayoutPrintSettingList().add(entity);
                }
            } else {
                PPrinterDtoMapper mapper = new PPrinterDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressPLayoutPrintSettingList();
                PPrinter relationEntity = mapper.mappingToEntity(relationDto);
                entity.setPPrinter(relationEntity);
                if (reverseReference) {
                    relationEntity.getPLayoutPrintSettingList().add(entity);
                }
                if (instanceCache && entity.getPPrinter().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getPPrinter());
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
    protected boolean needsMapping(PLayoutPrintSettingDto dto, Object value, String propName) {
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
    public List<PLayoutPrintSetting> mappingToEntityList(List<PLayoutPrintSettingDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<PLayoutPrintSetting> entityList = new ArrayList<PLayoutPrintSetting>();
        for (PLayoutPrintSettingDto dto : dtoList) {
            PLayoutPrintSetting entity = mappingToEntity(dto);
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
    public void suppressPPrinterAttribute() {
        _suppressPPrinterAttribute = true;
    }
    public void suppressPReportLayout() {
        _suppressPReportLayout = true;
    }
    public void suppressPPrinter() {
        _suppressPPrinter = true;
    }
    public void suppressBClassDtlBySheetCollate() {
        _suppressBClassDtlBySheetCollate = true;
    }
    protected void doSuppressAll() { // internal
        suppressPPrinterGroup();
        suppressPPrinterAttribute();
        suppressPReportLayout();
        suppressPPrinter();
        suppressBClassDtlBySheetCollate();
    }
    protected void doSuppressClear() { // internal
        _suppressPPrinterGroup = false;
        _suppressPPrinterAttribute = false;
        _suppressPReportLayout = false;
        _suppressPPrinter = false;
        _suppressBClassDtlBySheetCollate = false;
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
    public PLayoutPrintSettingDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (PLayoutPrintSettingDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public PLayoutPrintSettingDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (PLayoutPrintSettingDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public PLayoutPrintSettingDtoMapper reverseReference() {
        setReverseReference(true);
        return (PLayoutPrintSettingDtoMapper)this;
    }
}
