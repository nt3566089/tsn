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
 * The DTO mapper of T_TRHANBAIINV as TABLE. <br>
 * 販売物流在庫情報
 * <pre>
 * [primary-key]
 *     TRHANBAIINV_ID
 *
 * [column]
 *     TRHANBAIINV_ID, INOUTKBN, PRODUCT_CD, GOODITEMKBN, STOCKQTY, DAMAGEITEMQTY, REFUNDITEMQTY, STOCKDATETIME, CENTER_ID, CLIENT_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TRHANBAIINV_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     M_CENTER, M_CLIENT
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     mCenter, mClient
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsTTrhanbaiinvDtoMapper implements DtoMapper<TTrhanbaiinv, TTrhanbaiinvDto>, Serializable {

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
    protected boolean _suppressMCenter;
    protected boolean _suppressMClient;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTTrhanbaiinvDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsTTrhanbaiinvDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public TTrhanbaiinvDto mappingToDto(TTrhanbaiinv entity) {
        if (entity == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Entity localKey = createInstanceKeyEntity(entity);
        Object cachedLocalDto = instanceCache ? _relationDtoMap.get(localKey) : null;
        if (cachedLocalDto != null) {
            return (TTrhanbaiinvDto)cachedLocalDto;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        TTrhanbaiinvDto dto = new TTrhanbaiinvDto();
        dto.setTrhanbaiinvId(entity.getTrhanbaiinvId());
        dto.setInoutkbn(entity.getInoutkbn());
        dto.setProductCd(entity.getProductCd());
        dto.setGooditemkbn(entity.getGooditemkbn());
        dto.setStockqty(entity.getStockqty());
        dto.setDamageitemqty(entity.getDamageitemqty());
        dto.setRefunditemqty(entity.getRefunditemqty());
        dto.setStockdatetime(entity.getStockdatetime());
        dto.setCenterId(entity.getCenterId());
        dto.setClientId(entity.getClientId());
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
        if (!_suppressMCenter && entity.getMCenter() != null) {
            MCenter relationEntity = entity.getMCenter();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                MCenterDto relationDto = (MCenterDto)cachedDto;
                dto.setMCenter(relationDto);
                if (reverseReference) {
                    relationDto.getTTrhanbaiinvList().add(dto);
                }
            } else {
                MCenterDtoMapper mapper = new MCenterDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTTrhanbaiinvList();
                MCenterDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMCenter(relationDto);
                if (reverseReference) {
                    relationDto.getTTrhanbaiinvList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMCenter());
                }
            }
        };
        if (!_suppressMClient && entity.getMClient() != null) {
            MClient relationEntity = entity.getMClient();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                MClientDto relationDto = (MClientDto)cachedDto;
                dto.setMClient(relationDto);
                if (reverseReference) {
                    relationDto.getTTrhanbaiinvList().add(dto);
                }
            } else {
                MClientDtoMapper mapper = new MClientDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTTrhanbaiinvList();
                MClientDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMClient(relationDto);
                if (reverseReference) {
                    relationDto.getTTrhanbaiinvList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMClient());
                }
            }
        };
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<TTrhanbaiinvDto> mappingToDtoList(List<TTrhanbaiinv> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<TTrhanbaiinvDto> dtoList = new ArrayList<TTrhanbaiinvDto>();
        for (TTrhanbaiinv entity : entityList) {
            TTrhanbaiinvDto dto = mappingToDto(entity);
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
    public TTrhanbaiinv mappingToEntity(TTrhanbaiinvDto dto) {
        if (dto == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Object localKey = createInstanceKeyDto(dto, dto.instanceHash());
        Entity cachedLocalEntity = instanceCache ? _relationEntityMap.get(localKey) : null;
        if (cachedLocalEntity != null) {
            return (TTrhanbaiinv)cachedLocalEntity;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        TTrhanbaiinv entity = new TTrhanbaiinv();
        if (needsMapping(dto, dto.getTrhanbaiinvId(), "trhanbaiinvId")) {
            entity.setTrhanbaiinvId(dto.getTrhanbaiinvId());
        }
        if (needsMapping(dto, dto.getInoutkbn(), "inoutkbn")) {
            entity.setInoutkbn(dto.getInoutkbn());
        }
        if (needsMapping(dto, dto.getProductCd(), "productCd")) {
            entity.setProductCd(dto.getProductCd());
        }
        if (needsMapping(dto, dto.getGooditemkbn(), "gooditemkbn")) {
            entity.setGooditemkbn(dto.getGooditemkbn());
        }
        if (needsMapping(dto, dto.getStockqty(), "stockqty")) {
            entity.setStockqty(dto.getStockqty());
        }
        if (needsMapping(dto, dto.getDamageitemqty(), "damageitemqty")) {
            entity.setDamageitemqty(dto.getDamageitemqty());
        }
        if (needsMapping(dto, dto.getRefunditemqty(), "refunditemqty")) {
            entity.setRefunditemqty(dto.getRefunditemqty());
        }
        if (needsMapping(dto, dto.getStockdatetime(), "stockdatetime")) {
            entity.setStockdatetime(dto.getStockdatetime());
        }
        if (needsMapping(dto, dto.getCenterId(), "centerId")) {
            entity.setCenterId(dto.getCenterId());
        }
        if (needsMapping(dto, dto.getClientId(), "clientId")) {
            entity.setClientId(dto.getClientId());
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
        if (!_suppressMCenter && dto.getMCenter() != null) {
            MCenterDto relationDto = dto.getMCenter();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                MCenter relationEntity = (MCenter)cachedEntity;
                entity.setMCenter(relationEntity);
                if (reverseReference) {
                    relationEntity.getTTrhanbaiinvList().add(entity);
                }
            } else {
                MCenterDtoMapper mapper = new MCenterDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTTrhanbaiinvList();
                MCenter relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMCenter(relationEntity);
                if (reverseReference) {
                    relationEntity.getTTrhanbaiinvList().add(entity);
                }
                if (instanceCache && entity.getMCenter().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMCenter());
                }
            }
        };
        if (!_suppressMClient && dto.getMClient() != null) {
            MClientDto relationDto = dto.getMClient();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                MClient relationEntity = (MClient)cachedEntity;
                entity.setMClient(relationEntity);
                if (reverseReference) {
                    relationEntity.getTTrhanbaiinvList().add(entity);
                }
            } else {
                MClientDtoMapper mapper = new MClientDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTTrhanbaiinvList();
                MClient relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMClient(relationEntity);
                if (reverseReference) {
                    relationEntity.getTTrhanbaiinvList().add(entity);
                }
                if (instanceCache && entity.getMClient().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMClient());
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
    protected boolean needsMapping(TTrhanbaiinvDto dto, Object value, String propName) {
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
    public List<TTrhanbaiinv> mappingToEntityList(List<TTrhanbaiinvDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<TTrhanbaiinv> entityList = new ArrayList<TTrhanbaiinv>();
        for (TTrhanbaiinvDto dto : dtoList) {
            TTrhanbaiinv entity = mappingToEntity(dto);
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
    public void suppressMCenter() {
        _suppressMCenter = true;
    }
    public void suppressMClient() {
        _suppressMClient = true;
    }
    protected void doSuppressAll() { // internal
        suppressMCenter();
        suppressMClient();
    }
    protected void doSuppressClear() { // internal
        _suppressMCenter = false;
        _suppressMClient = false;
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
    public TTrhanbaiinvDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (TTrhanbaiinvDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public TTrhanbaiinvDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (TTrhanbaiinvDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public TTrhanbaiinvDtoMapper reverseReference() {
        setReverseReference(true);
        return (TTrhanbaiinvDtoMapper)this;
    }
}
