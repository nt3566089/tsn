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
 * The DTO mapper of B_CULTURE_ATTRIBUTE as TABLE. <br>
 * カルチャ属性マスタ
 * <pre>
 * [primary-key]
 *     CULTURE_ID
 *
 * [column]
 *     CULTURE_ID, DATE_TIME_FORMAT_DISPLAY, DATE_TIME_FORMAT_REPORT, DATE_TIME_FORMAT_EXCEL, DATE_TIME_FORMAT_TEXT, DATE_FORMAT_DISPLAY, DATE_FORMAT_REPORT, DATE_FORMAT_EXCEL, DATE_FORMAT_TEXT, TIME_FORMAT_DISPLAY, TIME_FORMAT_REPORT, TIME_FORMAT_EXCEL, TIME_FORMAT_TEXT, NUMBER_FORMAT_DISPLAY, NUMBER_FORMAT_REPORT, NUMBER_FORMAT_EXCEL, NUMBER_FORMAT_TEXT, CURRENCY_FORMAT_REPORT, FONT_NAME_EXCEL, FONT_SIZE_EXCEL, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     CULTURE_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     B_CULTURE
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     bCulture
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsBCultureAttributeDtoMapper implements DtoMapper<BCultureAttribute, BCultureAttributeDto>, Serializable {

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
    protected boolean _suppressBCulture;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsBCultureAttributeDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsBCultureAttributeDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public BCultureAttributeDto mappingToDto(BCultureAttribute entity) {
        if (entity == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Entity localKey = createInstanceKeyEntity(entity);
        Object cachedLocalDto = instanceCache ? _relationDtoMap.get(localKey) : null;
        if (cachedLocalDto != null) {
            return (BCultureAttributeDto)cachedLocalDto;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        BCultureAttributeDto dto = new BCultureAttributeDto();
        dto.setCultureId(entity.getCultureId());
        dto.setDateTimeFormatDisplay(entity.getDateTimeFormatDisplay());
        dto.setDateTimeFormatReport(entity.getDateTimeFormatReport());
        dto.setDateTimeFormatExcel(entity.getDateTimeFormatExcel());
        dto.setDateTimeFormatText(entity.getDateTimeFormatText());
        dto.setDateFormatDisplay(entity.getDateFormatDisplay());
        dto.setDateFormatReport(entity.getDateFormatReport());
        dto.setDateFormatExcel(entity.getDateFormatExcel());
        dto.setDateFormatText(entity.getDateFormatText());
        dto.setTimeFormatDisplay(entity.getTimeFormatDisplay());
        dto.setTimeFormatReport(entity.getTimeFormatReport());
        dto.setTimeFormatExcel(entity.getTimeFormatExcel());
        dto.setTimeFormatText(entity.getTimeFormatText());
        dto.setNumberFormatDisplay(entity.getNumberFormatDisplay());
        dto.setNumberFormatReport(entity.getNumberFormatReport());
        dto.setNumberFormatExcel(entity.getNumberFormatExcel());
        dto.setNumberFormatText(entity.getNumberFormatText());
        dto.setCurrencyFormatReport(entity.getCurrencyFormatReport());
        dto.setFontNameExcel(entity.getFontNameExcel());
        dto.setFontSizeExcel(entity.getFontSizeExcel());
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
        if (!_suppressBCulture && entity.getBCulture() != null) {
            BCulture relationEntity = entity.getBCulture();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BCultureDto relationDto = (BCultureDto)cachedDto;
                dto.setBCulture(relationDto);
                if (reverseReference) {
                    relationDto.setBCultureAttributeAsOne(dto);
                }
            } else {
                BCultureDtoMapper mapper = new BCultureDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressBCultureAttributeAsOne();
                BCultureDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBCulture(relationDto);
                if (reverseReference) {
                    relationDto.setBCultureAttributeAsOne(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBCulture());
                }
            }
        };
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<BCultureAttributeDto> mappingToDtoList(List<BCultureAttribute> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<BCultureAttributeDto> dtoList = new ArrayList<BCultureAttributeDto>();
        for (BCultureAttribute entity : entityList) {
            BCultureAttributeDto dto = mappingToDto(entity);
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
    public BCultureAttribute mappingToEntity(BCultureAttributeDto dto) {
        if (dto == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Object localKey = createInstanceKeyDto(dto, dto.instanceHash());
        Entity cachedLocalEntity = instanceCache ? _relationEntityMap.get(localKey) : null;
        if (cachedLocalEntity != null) {
            return (BCultureAttribute)cachedLocalEntity;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        BCultureAttribute entity = new BCultureAttribute();
        if (needsMapping(dto, dto.getCultureId(), "cultureId")) {
            entity.setCultureId(dto.getCultureId());
        }
        if (needsMapping(dto, dto.getDateTimeFormatDisplay(), "dateTimeFormatDisplay")) {
            entity.setDateTimeFormatDisplay(dto.getDateTimeFormatDisplay());
        }
        if (needsMapping(dto, dto.getDateTimeFormatReport(), "dateTimeFormatReport")) {
            entity.setDateTimeFormatReport(dto.getDateTimeFormatReport());
        }
        if (needsMapping(dto, dto.getDateTimeFormatExcel(), "dateTimeFormatExcel")) {
            entity.setDateTimeFormatExcel(dto.getDateTimeFormatExcel());
        }
        if (needsMapping(dto, dto.getDateTimeFormatText(), "dateTimeFormatText")) {
            entity.setDateTimeFormatText(dto.getDateTimeFormatText());
        }
        if (needsMapping(dto, dto.getDateFormatDisplay(), "dateFormatDisplay")) {
            entity.setDateFormatDisplay(dto.getDateFormatDisplay());
        }
        if (needsMapping(dto, dto.getDateFormatReport(), "dateFormatReport")) {
            entity.setDateFormatReport(dto.getDateFormatReport());
        }
        if (needsMapping(dto, dto.getDateFormatExcel(), "dateFormatExcel")) {
            entity.setDateFormatExcel(dto.getDateFormatExcel());
        }
        if (needsMapping(dto, dto.getDateFormatText(), "dateFormatText")) {
            entity.setDateFormatText(dto.getDateFormatText());
        }
        if (needsMapping(dto, dto.getTimeFormatDisplay(), "timeFormatDisplay")) {
            entity.setTimeFormatDisplay(dto.getTimeFormatDisplay());
        }
        if (needsMapping(dto, dto.getTimeFormatReport(), "timeFormatReport")) {
            entity.setTimeFormatReport(dto.getTimeFormatReport());
        }
        if (needsMapping(dto, dto.getTimeFormatExcel(), "timeFormatExcel")) {
            entity.setTimeFormatExcel(dto.getTimeFormatExcel());
        }
        if (needsMapping(dto, dto.getTimeFormatText(), "timeFormatText")) {
            entity.setTimeFormatText(dto.getTimeFormatText());
        }
        if (needsMapping(dto, dto.getNumberFormatDisplay(), "numberFormatDisplay")) {
            entity.setNumberFormatDisplay(dto.getNumberFormatDisplay());
        }
        if (needsMapping(dto, dto.getNumberFormatReport(), "numberFormatReport")) {
            entity.setNumberFormatReport(dto.getNumberFormatReport());
        }
        if (needsMapping(dto, dto.getNumberFormatExcel(), "numberFormatExcel")) {
            entity.setNumberFormatExcel(dto.getNumberFormatExcel());
        }
        if (needsMapping(dto, dto.getNumberFormatText(), "numberFormatText")) {
            entity.setNumberFormatText(dto.getNumberFormatText());
        }
        if (needsMapping(dto, dto.getCurrencyFormatReport(), "currencyFormatReport")) {
            entity.setCurrencyFormatReport(dto.getCurrencyFormatReport());
        }
        if (needsMapping(dto, dto.getFontNameExcel(), "fontNameExcel")) {
            entity.setFontNameExcel(dto.getFontNameExcel());
        }
        if (needsMapping(dto, dto.getFontSizeExcel(), "fontSizeExcel")) {
            entity.setFontSizeExcel(dto.getFontSizeExcel());
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
        if (!_suppressBCulture && dto.getBCulture() != null) {
            BCultureDto relationDto = dto.getBCulture();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BCulture relationEntity = (BCulture)cachedEntity;
                entity.setBCulture(relationEntity);
                if (reverseReference) {
                    relationEntity.setBCultureAttributeAsOne(entity);
                }
            } else {
                BCultureDtoMapper mapper = new BCultureDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressBCultureAttributeAsOne();
                BCulture relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBCulture(relationEntity);
                if (reverseReference) {
                    relationEntity.setBCultureAttributeAsOne(entity);
                }
                if (instanceCache && entity.getBCulture().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBCulture());
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
    protected boolean needsMapping(BCultureAttributeDto dto, Object value, String propName) {
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
    public List<BCultureAttribute> mappingToEntityList(List<BCultureAttributeDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<BCultureAttribute> entityList = new ArrayList<BCultureAttribute>();
        for (BCultureAttributeDto dto : dtoList) {
            BCultureAttribute entity = mappingToEntity(dto);
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
    public void suppressBCulture() {
        _suppressBCulture = true;
    }
    protected void doSuppressAll() { // internal
        suppressBCulture();
    }
    protected void doSuppressClear() { // internal
        _suppressBCulture = false;
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
    public BCultureAttributeDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (BCultureAttributeDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public BCultureAttributeDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (BCultureAttributeDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public BCultureAttributeDtoMapper reverseReference() {
        setReverseReference(true);
        return (BCultureAttributeDtoMapper)this;
    }
}
