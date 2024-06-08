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
 * The DTO mapper of T_TRFLEXIBILITYDETAIL as TABLE. <br>
 * 融通輸送明細情報
 * <pre>
 * [primary-key]
 *     FLEXIBLE_TRANSPORT_DETAIL_INFO_ID
 *
 * [column]
 *     FLEXIBLE_TRANSPORT_DETAIL_INFO_ID, FLEXIBLE_TRANSPORT_INFO_ID, FLEXIBITYLINENO, PRODUCT_ID, STDDIFFLG, FLEXPICKLISTNO, PRINTEDFLG, COMPLETEFLG, MANUFACTUREDATE, DESIGNCD, QTYCASE, QTYBOWL, HTQTYCASE, HTQTYBOWL, NV_EXTDATA1, CENTER_ID, CLIENT_ID, SOID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     FLEXIBLE_TRANSPORT_DETAIL_INFO_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     T_TRFLEXIBILITY
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     tTrflexibility
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsTTrflexibilitydetailDtoMapper implements DtoMapper<TTrflexibilitydetail, TTrflexibilitydetailDto>, Serializable {

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
    protected boolean _suppressTTrflexibility;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTTrflexibilitydetailDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsTTrflexibilitydetailDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public TTrflexibilitydetailDto mappingToDto(TTrflexibilitydetail entity) {
        if (entity == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Entity localKey = createInstanceKeyEntity(entity);
        Object cachedLocalDto = instanceCache ? _relationDtoMap.get(localKey) : null;
        if (cachedLocalDto != null) {
            return (TTrflexibilitydetailDto)cachedLocalDto;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        TTrflexibilitydetailDto dto = new TTrflexibilitydetailDto();
        dto.setFlexibleTransportDetailInfoId(entity.getFlexibleTransportDetailInfoId());
        dto.setFlexibleTransportInfoId(entity.getFlexibleTransportInfoId());
        dto.setFlexibitylineno(entity.getFlexibitylineno());
        dto.setProductId(entity.getProductId());
        dto.setStddifflg(entity.getStddifflg());
        dto.setFlexpicklistno(entity.getFlexpicklistno());
        dto.setPrintedflg(entity.getPrintedflg());
        dto.setCompleteflg(entity.getCompleteflg());
        dto.setManufacturedate(entity.getManufacturedate());
        dto.setDesigncd(entity.getDesigncd());
        dto.setQtycase(entity.getQtycase());
        dto.setQtybowl(entity.getQtybowl());
        dto.setHtqtycase(entity.getHtqtycase());
        dto.setHtqtybowl(entity.getHtqtybowl());
        dto.setNvExtdata1(entity.getNvExtdata1());
        dto.setCenterId(entity.getCenterId());
        dto.setClientId(entity.getClientId());
        dto.setSoid(entity.getSoid());
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
        if (!_suppressTTrflexibility && entity.getTTrflexibility() != null) {
            TTrflexibility relationEntity = entity.getTTrflexibility();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                TTrflexibilityDto relationDto = (TTrflexibilityDto)cachedDto;
                dto.setTTrflexibility(relationDto);
                if (reverseReference) {
                    relationDto.getTTrflexibilitydetailList().add(dto);
                }
            } else {
                TTrflexibilityDtoMapper mapper = new TTrflexibilityDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTTrflexibilitydetailList();
                TTrflexibilityDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setTTrflexibility(relationDto);
                if (reverseReference) {
                    relationDto.getTTrflexibilitydetailList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getTTrflexibility());
                }
            }
        };
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<TTrflexibilitydetailDto> mappingToDtoList(List<TTrflexibilitydetail> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<TTrflexibilitydetailDto> dtoList = new ArrayList<TTrflexibilitydetailDto>();
        for (TTrflexibilitydetail entity : entityList) {
            TTrflexibilitydetailDto dto = mappingToDto(entity);
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
    public TTrflexibilitydetail mappingToEntity(TTrflexibilitydetailDto dto) {
        if (dto == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Object localKey = createInstanceKeyDto(dto, dto.instanceHash());
        Entity cachedLocalEntity = instanceCache ? _relationEntityMap.get(localKey) : null;
        if (cachedLocalEntity != null) {
            return (TTrflexibilitydetail)cachedLocalEntity;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        TTrflexibilitydetail entity = new TTrflexibilitydetail();
        if (needsMapping(dto, dto.getFlexibleTransportDetailInfoId(), "flexibleTransportDetailInfoId")) {
            entity.setFlexibleTransportDetailInfoId(dto.getFlexibleTransportDetailInfoId());
        }
        if (needsMapping(dto, dto.getFlexibleTransportInfoId(), "flexibleTransportInfoId")) {
            entity.setFlexibleTransportInfoId(dto.getFlexibleTransportInfoId());
        }
        if (needsMapping(dto, dto.getFlexibitylineno(), "flexibitylineno")) {
            entity.setFlexibitylineno(dto.getFlexibitylineno());
        }
        if (needsMapping(dto, dto.getProductId(), "productId")) {
            entity.setProductId(dto.getProductId());
        }
        if (needsMapping(dto, dto.getStddifflg(), "stddifflg")) {
            entity.setStddifflg(dto.getStddifflg());
        }
        if (needsMapping(dto, dto.getFlexpicklistno(), "flexpicklistno")) {
            entity.setFlexpicklistno(dto.getFlexpicklistno());
        }
        if (needsMapping(dto, dto.getPrintedflg(), "printedflg")) {
            entity.setPrintedflg(dto.getPrintedflg());
        }
        if (needsMapping(dto, dto.getCompleteflg(), "completeflg")) {
            entity.setCompleteflg(dto.getCompleteflg());
        }
        if (needsMapping(dto, dto.getManufacturedate(), "manufacturedate")) {
            entity.setManufacturedate(dto.getManufacturedate());
        }
        if (needsMapping(dto, dto.getDesigncd(), "designcd")) {
            entity.setDesigncd(dto.getDesigncd());
        }
        if (needsMapping(dto, dto.getQtycase(), "qtycase")) {
            entity.setQtycase(dto.getQtycase());
        }
        if (needsMapping(dto, dto.getQtybowl(), "qtybowl")) {
            entity.setQtybowl(dto.getQtybowl());
        }
        if (needsMapping(dto, dto.getHtqtycase(), "htqtycase")) {
            entity.setHtqtycase(dto.getHtqtycase());
        }
        if (needsMapping(dto, dto.getHtqtybowl(), "htqtybowl")) {
            entity.setHtqtybowl(dto.getHtqtybowl());
        }
        if (needsMapping(dto, dto.getNvExtdata1(), "nvExtdata1")) {
            entity.setNvExtdata1(dto.getNvExtdata1());
        }
        if (needsMapping(dto, dto.getCenterId(), "centerId")) {
            entity.setCenterId(dto.getCenterId());
        }
        if (needsMapping(dto, dto.getClientId(), "clientId")) {
            entity.setClientId(dto.getClientId());
        }
        if (needsMapping(dto, dto.getSoid(), "soid")) {
            entity.setSoid(dto.getSoid());
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
        if (!_suppressTTrflexibility && dto.getTTrflexibility() != null) {
            TTrflexibilityDto relationDto = dto.getTTrflexibility();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                TTrflexibility relationEntity = (TTrflexibility)cachedEntity;
                entity.setTTrflexibility(relationEntity);
                if (reverseReference) {
                    relationEntity.getTTrflexibilitydetailList().add(entity);
                }
            } else {
                TTrflexibilityDtoMapper mapper = new TTrflexibilityDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTTrflexibilitydetailList();
                TTrflexibility relationEntity = mapper.mappingToEntity(relationDto);
                entity.setTTrflexibility(relationEntity);
                if (reverseReference) {
                    relationEntity.getTTrflexibilitydetailList().add(entity);
                }
                if (instanceCache && entity.getTTrflexibility().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getTTrflexibility());
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
    protected boolean needsMapping(TTrflexibilitydetailDto dto, Object value, String propName) {
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
    public List<TTrflexibilitydetail> mappingToEntityList(List<TTrflexibilitydetailDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<TTrflexibilitydetail> entityList = new ArrayList<TTrflexibilitydetail>();
        for (TTrflexibilitydetailDto dto : dtoList) {
            TTrflexibilitydetail entity = mappingToEntity(dto);
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
    public void suppressTTrflexibility() {
        _suppressTTrflexibility = true;
    }
    protected void doSuppressAll() { // internal
        suppressTTrflexibility();
    }
    protected void doSuppressClear() { // internal
        _suppressTTrflexibility = false;
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
    public TTrflexibilitydetailDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (TTrflexibilitydetailDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public TTrflexibilitydetailDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (TTrflexibilitydetailDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public TTrflexibilitydetailDtoMapper reverseReference() {
        setReverseReference(true);
        return (TTrflexibilitydetailDtoMapper)this;
    }
}
