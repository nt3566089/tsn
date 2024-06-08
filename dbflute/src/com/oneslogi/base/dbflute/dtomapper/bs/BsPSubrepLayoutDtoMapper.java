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
 * The DTO mapper of P_SUBREP_LAYOUT as TABLE. <br>
 * サブレポートレイアウトマスタ
 * <pre>
 * [primary-key]
 *     SUBREP_LAYOUT_ID
 *
 * [column]
 *     SUBREP_LAYOUT_ID, REPORT_LAYOUT_ID, SUBREP_LAYOUT_DATA, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SUBREP_LAYOUT_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     P_REPORT_LAYOUT
 *
 * [referrer-table]
 *     P_SUBREP_LAYOUT_ITEM
 *
 * [foreign-property]
 *     pReportLayout
 *
 * [referrer-property]
 *     pSubrepLayoutItemList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsPSubrepLayoutDtoMapper implements DtoMapper<PSubrepLayout, PSubrepLayoutDto>, Serializable {

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
    protected boolean _suppressPReportLayout;
    protected boolean _suppressPSubrepLayoutItemList;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsPSubrepLayoutDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsPSubrepLayoutDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public PSubrepLayoutDto mappingToDto(PSubrepLayout entity) {
        if (entity == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Entity localKey = createInstanceKeyEntity(entity);
        Object cachedLocalDto = instanceCache ? _relationDtoMap.get(localKey) : null;
        if (cachedLocalDto != null) {
            return (PSubrepLayoutDto)cachedLocalDto;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        PSubrepLayoutDto dto = new PSubrepLayoutDto();
        dto.setSubrepLayoutId(entity.getSubrepLayoutId());
        dto.setReportLayoutId(entity.getReportLayoutId());
        dto.setSubrepLayoutData(entity.getSubrepLayoutData());
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
        if (!_suppressPReportLayout && entity.getPReportLayout() != null) {
            PReportLayout relationEntity = entity.getPReportLayout();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                PReportLayoutDto relationDto = (PReportLayoutDto)cachedDto;
                dto.setPReportLayout(relationDto);
                if (reverseReference) {
                    relationDto.setPSubrepLayoutAsOne(dto);
                }
            } else {
                PReportLayoutDtoMapper mapper = new PReportLayoutDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressPSubrepLayoutAsOne();
                PReportLayoutDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setPReportLayout(relationDto);
                if (reverseReference) {
                    relationDto.setPSubrepLayoutAsOne(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getPReportLayout());
                }
            }
        };
        if (!_suppressPSubrepLayoutItemList && !entity.getPSubrepLayoutItemList().isEmpty()) {
            PSubrepLayoutItemDtoMapper mapper = new PSubrepLayoutItemDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressPSubrepLayout();
            List<PSubrepLayoutItemDto> relationDtoList = mapper.mappingToDtoList(entity.getPSubrepLayoutItemList());
            dto.setPSubrepLayoutItemList(relationDtoList);
            if (reverseReference) {
                for (PSubrepLayoutItemDto relationDto : relationDtoList) {
                    relationDto.setPSubrepLayout(dto);
                }
            }
        };
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<PSubrepLayoutDto> mappingToDtoList(List<PSubrepLayout> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<PSubrepLayoutDto> dtoList = new ArrayList<PSubrepLayoutDto>();
        for (PSubrepLayout entity : entityList) {
            PSubrepLayoutDto dto = mappingToDto(entity);
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
    public PSubrepLayout mappingToEntity(PSubrepLayoutDto dto) {
        if (dto == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Object localKey = createInstanceKeyDto(dto, dto.instanceHash());
        Entity cachedLocalEntity = instanceCache ? _relationEntityMap.get(localKey) : null;
        if (cachedLocalEntity != null) {
            return (PSubrepLayout)cachedLocalEntity;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        PSubrepLayout entity = new PSubrepLayout();
        if (needsMapping(dto, dto.getSubrepLayoutId(), "subrepLayoutId")) {
            entity.setSubrepLayoutId(dto.getSubrepLayoutId());
        }
        if (needsMapping(dto, dto.getReportLayoutId(), "reportLayoutId")) {
            entity.setReportLayoutId(dto.getReportLayoutId());
        }
        if (needsMapping(dto, dto.getSubrepLayoutData(), "subrepLayoutData")) {
            entity.setSubrepLayoutData(dto.getSubrepLayoutData());
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
        if (!_suppressPReportLayout && dto.getPReportLayout() != null) {
            PReportLayoutDto relationDto = dto.getPReportLayout();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                PReportLayout relationEntity = (PReportLayout)cachedEntity;
                entity.setPReportLayout(relationEntity);
                if (reverseReference) {
                    relationEntity.setPSubrepLayoutAsOne(entity);
                }
            } else {
                PReportLayoutDtoMapper mapper = new PReportLayoutDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressPSubrepLayoutAsOne();
                PReportLayout relationEntity = mapper.mappingToEntity(relationDto);
                entity.setPReportLayout(relationEntity);
                if (reverseReference) {
                    relationEntity.setPSubrepLayoutAsOne(entity);
                }
                if (instanceCache && entity.getPReportLayout().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getPReportLayout());
                }
            }
        };
        if (!_suppressPSubrepLayoutItemList && !dto.getPSubrepLayoutItemList().isEmpty()) {
            PSubrepLayoutItemDtoMapper mapper = new PSubrepLayoutItemDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressPSubrepLayout();
            List<PSubrepLayoutItem> relationEntityList = mapper.mappingToEntityList(dto.getPSubrepLayoutItemList());
            entity.setPSubrepLayoutItemList(relationEntityList);
            if (reverseReference) {
                for (PSubrepLayoutItem relationEntity : relationEntityList) {
                    relationEntity.setPSubrepLayout(entity);
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
    protected boolean needsMapping(PSubrepLayoutDto dto, Object value, String propName) {
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
    public List<PSubrepLayout> mappingToEntityList(List<PSubrepLayoutDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<PSubrepLayout> entityList = new ArrayList<PSubrepLayout>();
        for (PSubrepLayoutDto dto : dtoList) {
            PSubrepLayout entity = mappingToEntity(dto);
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
    public void suppressPReportLayout() {
        _suppressPReportLayout = true;
    }
    public void suppressPSubrepLayoutItemList() {
        _suppressPSubrepLayoutItemList = true;
    }
    protected void doSuppressAll() { // internal
        suppressPReportLayout();
        suppressPSubrepLayoutItemList();
    }
    protected void doSuppressClear() { // internal
        _suppressPReportLayout = false;
        _suppressPSubrepLayoutItemList = false;
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
    public PSubrepLayoutDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (PSubrepLayoutDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public PSubrepLayoutDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (PSubrepLayoutDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public PSubrepLayoutDtoMapper reverseReference() {
        setReverseReference(true);
        return (PSubrepLayoutDtoMapper)this;
    }
}
