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
 * The DTO mapper of T_TRALLINV as TABLE. <br>
 * 統合在庫実績
 * <pre>
 * [primary-key]
 *     TRALLINV_ID
 *
 * [column]
 *     TRALLINV_ID, CENTER_ID, CLIENT_ID, EXECUTEDATE, INOUTKBN, SYSINVTOTALINV, SYSINVKEEPLOCINV, SYSINVRECEIVELOCINV, SYSINVDAMAGEITEM, SYSINVCLSSIFYLOCINV, SYSINVTMPLOCINV, SYSINVAUTOINV, INVESTTOTALINV, INVESTKEEPLOCINV, INVESTRECEIVELOCINV, INVESTDAMAGEITEM, INVESTCLSSIFYLOCINV, INVESTTMPLOCINV, INVESTAUTOINV, YDAYTLEQULYTOTALINV, YDAYTLEQULYKEEPLOCINV, YDAYTLEQULYRECEIVELOCINV, YDAYTLEQULYDAMAGEITEM, YDAYTLEQULYCLSSIFYLOCINV, YDAYTLEQULYTMPLOCINV, YDAYTLEQULYAUTOINV, TDAYEQYTOTALINV, TDAYEQYKEEPLOCINV, TDAYEQYRECEIVELOCINV, TDAYEQYDAMAGEITEM, TDAYEQYCLSSIFYLOCINV, TDAYEQYTMPLOCINV, TDAYEQYAUTOINV, CAPITEMFLG, PRODUCT_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TRALLINV_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     M_CLIENT, M_CENTER
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     mClient, mCenter
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsTTrallinvDtoMapper implements DtoMapper<TTrallinv, TTrallinvDto>, Serializable {

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
    protected boolean _suppressMClient;
    protected boolean _suppressMCenter;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTTrallinvDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsTTrallinvDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public TTrallinvDto mappingToDto(TTrallinv entity) {
        if (entity == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Entity localKey = createInstanceKeyEntity(entity);
        Object cachedLocalDto = instanceCache ? _relationDtoMap.get(localKey) : null;
        if (cachedLocalDto != null) {
            return (TTrallinvDto)cachedLocalDto;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        TTrallinvDto dto = new TTrallinvDto();
        dto.setTrallinvId(entity.getTrallinvId());
        dto.setCenterId(entity.getCenterId());
        dto.setClientId(entity.getClientId());
        dto.setExecutedate(entity.getExecutedate());
        dto.setInoutkbn(entity.getInoutkbn());
        dto.setSysinvtotalinv(entity.getSysinvtotalinv());
        dto.setSysinvkeeplocinv(entity.getSysinvkeeplocinv());
        dto.setSysinvreceivelocinv(entity.getSysinvreceivelocinv());
        dto.setSysinvdamageitem(entity.getSysinvdamageitem());
        dto.setSysinvclssifylocinv(entity.getSysinvclssifylocinv());
        dto.setSysinvtmplocinv(entity.getSysinvtmplocinv());
        dto.setSysinvautoinv(entity.getSysinvautoinv());
        dto.setInvesttotalinv(entity.getInvesttotalinv());
        dto.setInvestkeeplocinv(entity.getInvestkeeplocinv());
        dto.setInvestreceivelocinv(entity.getInvestreceivelocinv());
        dto.setInvestdamageitem(entity.getInvestdamageitem());
        dto.setInvestclssifylocinv(entity.getInvestclssifylocinv());
        dto.setInvesttmplocinv(entity.getInvesttmplocinv());
        dto.setInvestautoinv(entity.getInvestautoinv());
        dto.setYdaytlequlytotalinv(entity.getYdaytlequlytotalinv());
        dto.setYdaytlequlykeeplocinv(entity.getYdaytlequlykeeplocinv());
        dto.setYdaytlequlyreceivelocinv(entity.getYdaytlequlyreceivelocinv());
        dto.setYdaytlequlydamageitem(entity.getYdaytlequlydamageitem());
        dto.setYdaytlequlyclssifylocinv(entity.getYdaytlequlyclssifylocinv());
        dto.setYdaytlequlytmplocinv(entity.getYdaytlequlytmplocinv());
        dto.setYdaytlequlyautoinv(entity.getYdaytlequlyautoinv());
        dto.setTdayeqytotalinv(entity.getTdayeqytotalinv());
        dto.setTdayeqykeeplocinv(entity.getTdayeqykeeplocinv());
        dto.setTdayeqyreceivelocinv(entity.getTdayeqyreceivelocinv());
        dto.setTdayeqydamageitem(entity.getTdayeqydamageitem());
        dto.setTdayeqyclssifylocinv(entity.getTdayeqyclssifylocinv());
        dto.setTdayeqytmplocinv(entity.getTdayeqytmplocinv());
        dto.setTdayeqyautoinv(entity.getTdayeqyautoinv());
        dto.setCapitemflg(entity.getCapitemflg());
        dto.setProductId(entity.getProductId());
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
        if (!_suppressMClient && entity.getMClient() != null) {
            MClient relationEntity = entity.getMClient();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                MClientDto relationDto = (MClientDto)cachedDto;
                dto.setMClient(relationDto);
                if (reverseReference) {
                    relationDto.getTTrallinvList().add(dto);
                }
            } else {
                MClientDtoMapper mapper = new MClientDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTTrallinvList();
                MClientDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMClient(relationDto);
                if (reverseReference) {
                    relationDto.getTTrallinvList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMClient());
                }
            }
        };
        if (!_suppressMCenter && entity.getMCenter() != null) {
            MCenter relationEntity = entity.getMCenter();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                MCenterDto relationDto = (MCenterDto)cachedDto;
                dto.setMCenter(relationDto);
                if (reverseReference) {
                    relationDto.getTTrallinvList().add(dto);
                }
            } else {
                MCenterDtoMapper mapper = new MCenterDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTTrallinvList();
                MCenterDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMCenter(relationDto);
                if (reverseReference) {
                    relationDto.getTTrallinvList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMCenter());
                }
            }
        };
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<TTrallinvDto> mappingToDtoList(List<TTrallinv> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<TTrallinvDto> dtoList = new ArrayList<TTrallinvDto>();
        for (TTrallinv entity : entityList) {
            TTrallinvDto dto = mappingToDto(entity);
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
    public TTrallinv mappingToEntity(TTrallinvDto dto) {
        if (dto == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Object localKey = createInstanceKeyDto(dto, dto.instanceHash());
        Entity cachedLocalEntity = instanceCache ? _relationEntityMap.get(localKey) : null;
        if (cachedLocalEntity != null) {
            return (TTrallinv)cachedLocalEntity;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        TTrallinv entity = new TTrallinv();
        if (needsMapping(dto, dto.getTrallinvId(), "trallinvId")) {
            entity.setTrallinvId(dto.getTrallinvId());
        }
        if (needsMapping(dto, dto.getCenterId(), "centerId")) {
            entity.setCenterId(dto.getCenterId());
        }
        if (needsMapping(dto, dto.getClientId(), "clientId")) {
            entity.setClientId(dto.getClientId());
        }
        if (needsMapping(dto, dto.getExecutedate(), "executedate")) {
            entity.setExecutedate(dto.getExecutedate());
        }
        if (needsMapping(dto, dto.getInoutkbn(), "inoutkbn")) {
            entity.setInoutkbn(dto.getInoutkbn());
        }
        if (needsMapping(dto, dto.getSysinvtotalinv(), "sysinvtotalinv")) {
            entity.setSysinvtotalinv(dto.getSysinvtotalinv());
        }
        if (needsMapping(dto, dto.getSysinvkeeplocinv(), "sysinvkeeplocinv")) {
            entity.setSysinvkeeplocinv(dto.getSysinvkeeplocinv());
        }
        if (needsMapping(dto, dto.getSysinvreceivelocinv(), "sysinvreceivelocinv")) {
            entity.setSysinvreceivelocinv(dto.getSysinvreceivelocinv());
        }
        if (needsMapping(dto, dto.getSysinvdamageitem(), "sysinvdamageitem")) {
            entity.setSysinvdamageitem(dto.getSysinvdamageitem());
        }
        if (needsMapping(dto, dto.getSysinvclssifylocinv(), "sysinvclssifylocinv")) {
            entity.setSysinvclssifylocinv(dto.getSysinvclssifylocinv());
        }
        if (needsMapping(dto, dto.getSysinvtmplocinv(), "sysinvtmplocinv")) {
            entity.setSysinvtmplocinv(dto.getSysinvtmplocinv());
        }
        if (needsMapping(dto, dto.getSysinvautoinv(), "sysinvautoinv")) {
            entity.setSysinvautoinv(dto.getSysinvautoinv());
        }
        if (needsMapping(dto, dto.getInvesttotalinv(), "investtotalinv")) {
            entity.setInvesttotalinv(dto.getInvesttotalinv());
        }
        if (needsMapping(dto, dto.getInvestkeeplocinv(), "investkeeplocinv")) {
            entity.setInvestkeeplocinv(dto.getInvestkeeplocinv());
        }
        if (needsMapping(dto, dto.getInvestreceivelocinv(), "investreceivelocinv")) {
            entity.setInvestreceivelocinv(dto.getInvestreceivelocinv());
        }
        if (needsMapping(dto, dto.getInvestdamageitem(), "investdamageitem")) {
            entity.setInvestdamageitem(dto.getInvestdamageitem());
        }
        if (needsMapping(dto, dto.getInvestclssifylocinv(), "investclssifylocinv")) {
            entity.setInvestclssifylocinv(dto.getInvestclssifylocinv());
        }
        if (needsMapping(dto, dto.getInvesttmplocinv(), "investtmplocinv")) {
            entity.setInvesttmplocinv(dto.getInvesttmplocinv());
        }
        if (needsMapping(dto, dto.getInvestautoinv(), "investautoinv")) {
            entity.setInvestautoinv(dto.getInvestautoinv());
        }
        if (needsMapping(dto, dto.getYdaytlequlytotalinv(), "ydaytlequlytotalinv")) {
            entity.setYdaytlequlytotalinv(dto.getYdaytlequlytotalinv());
        }
        if (needsMapping(dto, dto.getYdaytlequlykeeplocinv(), "ydaytlequlykeeplocinv")) {
            entity.setYdaytlequlykeeplocinv(dto.getYdaytlequlykeeplocinv());
        }
        if (needsMapping(dto, dto.getYdaytlequlyreceivelocinv(), "ydaytlequlyreceivelocinv")) {
            entity.setYdaytlequlyreceivelocinv(dto.getYdaytlequlyreceivelocinv());
        }
        if (needsMapping(dto, dto.getYdaytlequlydamageitem(), "ydaytlequlydamageitem")) {
            entity.setYdaytlequlydamageitem(dto.getYdaytlequlydamageitem());
        }
        if (needsMapping(dto, dto.getYdaytlequlyclssifylocinv(), "ydaytlequlyclssifylocinv")) {
            entity.setYdaytlequlyclssifylocinv(dto.getYdaytlequlyclssifylocinv());
        }
        if (needsMapping(dto, dto.getYdaytlequlytmplocinv(), "ydaytlequlytmplocinv")) {
            entity.setYdaytlequlytmplocinv(dto.getYdaytlequlytmplocinv());
        }
        if (needsMapping(dto, dto.getYdaytlequlyautoinv(), "ydaytlequlyautoinv")) {
            entity.setYdaytlequlyautoinv(dto.getYdaytlequlyautoinv());
        }
        if (needsMapping(dto, dto.getTdayeqytotalinv(), "tdayeqytotalinv")) {
            entity.setTdayeqytotalinv(dto.getTdayeqytotalinv());
        }
        if (needsMapping(dto, dto.getTdayeqykeeplocinv(), "tdayeqykeeplocinv")) {
            entity.setTdayeqykeeplocinv(dto.getTdayeqykeeplocinv());
        }
        if (needsMapping(dto, dto.getTdayeqyreceivelocinv(), "tdayeqyreceivelocinv")) {
            entity.setTdayeqyreceivelocinv(dto.getTdayeqyreceivelocinv());
        }
        if (needsMapping(dto, dto.getTdayeqydamageitem(), "tdayeqydamageitem")) {
            entity.setTdayeqydamageitem(dto.getTdayeqydamageitem());
        }
        if (needsMapping(dto, dto.getTdayeqyclssifylocinv(), "tdayeqyclssifylocinv")) {
            entity.setTdayeqyclssifylocinv(dto.getTdayeqyclssifylocinv());
        }
        if (needsMapping(dto, dto.getTdayeqytmplocinv(), "tdayeqytmplocinv")) {
            entity.setTdayeqytmplocinv(dto.getTdayeqytmplocinv());
        }
        if (needsMapping(dto, dto.getTdayeqyautoinv(), "tdayeqyautoinv")) {
            entity.setTdayeqyautoinv(dto.getTdayeqyautoinv());
        }
        if (needsMapping(dto, dto.getCapitemflg(), "capitemflg")) {
            entity.setCapitemflg(dto.getCapitemflg());
        }
        if (needsMapping(dto, dto.getProductId(), "productId")) {
            entity.setProductId(dto.getProductId());
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
        if (!_suppressMClient && dto.getMClient() != null) {
            MClientDto relationDto = dto.getMClient();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                MClient relationEntity = (MClient)cachedEntity;
                entity.setMClient(relationEntity);
                if (reverseReference) {
                    relationEntity.getTTrallinvList().add(entity);
                }
            } else {
                MClientDtoMapper mapper = new MClientDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTTrallinvList();
                MClient relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMClient(relationEntity);
                if (reverseReference) {
                    relationEntity.getTTrallinvList().add(entity);
                }
                if (instanceCache && entity.getMClient().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMClient());
                }
            }
        };
        if (!_suppressMCenter && dto.getMCenter() != null) {
            MCenterDto relationDto = dto.getMCenter();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                MCenter relationEntity = (MCenter)cachedEntity;
                entity.setMCenter(relationEntity);
                if (reverseReference) {
                    relationEntity.getTTrallinvList().add(entity);
                }
            } else {
                MCenterDtoMapper mapper = new MCenterDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTTrallinvList();
                MCenter relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMCenter(relationEntity);
                if (reverseReference) {
                    relationEntity.getTTrallinvList().add(entity);
                }
                if (instanceCache && entity.getMCenter().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMCenter());
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
    protected boolean needsMapping(TTrallinvDto dto, Object value, String propName) {
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
    public List<TTrallinv> mappingToEntityList(List<TTrallinvDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<TTrallinv> entityList = new ArrayList<TTrallinv>();
        for (TTrallinvDto dto : dtoList) {
            TTrallinv entity = mappingToEntity(dto);
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
    public void suppressMClient() {
        _suppressMClient = true;
    }
    public void suppressMCenter() {
        _suppressMCenter = true;
    }
    protected void doSuppressAll() { // internal
        suppressMClient();
        suppressMCenter();
    }
    protected void doSuppressClear() { // internal
        _suppressMClient = false;
        _suppressMCenter = false;
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
    public TTrallinvDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (TTrallinvDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public TTrallinvDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (TTrallinvDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public TTrallinvDtoMapper reverseReference() {
        setReverseReference(true);
        return (TTrallinvDtoMapper)this;
    }
}
