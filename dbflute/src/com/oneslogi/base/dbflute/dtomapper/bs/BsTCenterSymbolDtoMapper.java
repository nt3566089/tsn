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
 * The DTO mapper of T_CENTER_SYMBOL as TABLE. <br>
 * 拠点シンボル
 * <pre>
 * [primary-key]
 *     CENTER_SYMBOL_ID
 *
 * [column]
 *     CENTER_SYMBOL_ID, CENTER_ID, CLIENT_ID, PALLET_ID, TRSYMBOL_ID, CHILD_CENTER_SYMBOL_ID, SORTSTOCK_NUMBER, QR_CODE, LOT_ID, CASE_MOVE_STS, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     CENTER_SYMBOL_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     M_CENTER, T_CENTER_SYMBOL, M_CLIENT, T_PALLET, T_TRSYMBOL
 *
 * [referrer-table]
 *     T_CENTER_SYMBOL
 *
 * [foreign-property]
 *     mCenter, tCenterSymbolSelf, mClient, tPallet, tTrsymbol
 *
 * [referrer-property]
 *     tCenterSymbolSelfList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsTCenterSymbolDtoMapper implements DtoMapper<TCenterSymbol, TCenterSymbolDto>, Serializable {

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
    protected boolean _suppressTCenterSymbolSelf;
    protected boolean _suppressMClient;
    protected boolean _suppressTPallet;
    protected boolean _suppressTTrsymbol;
    protected boolean _suppressTCenterSymbolSelfList;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTCenterSymbolDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsTCenterSymbolDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public TCenterSymbolDto mappingToDto(TCenterSymbol entity) {
        if (entity == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Entity localKey = createInstanceKeyEntity(entity);
        Object cachedLocalDto = instanceCache ? _relationDtoMap.get(localKey) : null;
        if (cachedLocalDto != null) {
            return (TCenterSymbolDto)cachedLocalDto;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        TCenterSymbolDto dto = new TCenterSymbolDto();
        dto.setCenterSymbolId(entity.getCenterSymbolId());
        dto.setCenterId(entity.getCenterId());
        dto.setClientId(entity.getClientId());
        dto.setPalletId(entity.getPalletId());
        dto.setTrsymbolId(entity.getTrsymbolId());
        dto.setChildCenterSymbolId(entity.getChildCenterSymbolId());
        dto.setSortstockNumber(entity.getSortstockNumber());
        dto.setQrCode(entity.getQrCode());
        dto.setLotId(entity.getLotId());
        dto.setCaseMoveSts(entity.getCaseMoveSts());
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
                    relationDto.getTCenterSymbolList().add(dto);
                }
            } else {
                MCenterDtoMapper mapper = new MCenterDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTCenterSymbolList();
                MCenterDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMCenter(relationDto);
                if (reverseReference) {
                    relationDto.getTCenterSymbolList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMCenter());
                }
            }
        };
        if (!_suppressTCenterSymbolSelf && entity.getTCenterSymbolSelf() != null) {
            TCenterSymbol relationEntity = entity.getTCenterSymbolSelf();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                TCenterSymbolDto relationDto = (TCenterSymbolDto)cachedDto;
                dto.setTCenterSymbolSelf(relationDto);
                if (reverseReference) {
                    relationDto.getTCenterSymbolSelfList().add(dto);
                }
            } else {
                TCenterSymbolDtoMapper mapper = new TCenterSymbolDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTCenterSymbolSelfList();
                TCenterSymbolDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setTCenterSymbolSelf(relationDto);
                if (reverseReference) {
                    relationDto.getTCenterSymbolSelfList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getTCenterSymbolSelf());
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
                    relationDto.getTCenterSymbolList().add(dto);
                }
            } else {
                MClientDtoMapper mapper = new MClientDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTCenterSymbolList();
                MClientDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMClient(relationDto);
                if (reverseReference) {
                    relationDto.getTCenterSymbolList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMClient());
                }
            }
        };
        if (!_suppressTPallet && entity.getTPallet() != null) {
            TPallet relationEntity = entity.getTPallet();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                TPalletDto relationDto = (TPalletDto)cachedDto;
                dto.setTPallet(relationDto);
                if (reverseReference) {
                    relationDto.getTCenterSymbolList().add(dto);
                }
            } else {
                TPalletDtoMapper mapper = new TPalletDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTCenterSymbolList();
                TPalletDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setTPallet(relationDto);
                if (reverseReference) {
                    relationDto.getTCenterSymbolList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getTPallet());
                }
            }
        };
        if (!_suppressTTrsymbol && entity.getTTrsymbol() != null) {
            TTrsymbol relationEntity = entity.getTTrsymbol();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                TTrsymbolDto relationDto = (TTrsymbolDto)cachedDto;
                dto.setTTrsymbol(relationDto);
                if (reverseReference) {
                    relationDto.getTCenterSymbolList().add(dto);
                }
            } else {
                TTrsymbolDtoMapper mapper = new TTrsymbolDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTCenterSymbolList();
                TTrsymbolDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setTTrsymbol(relationDto);
                if (reverseReference) {
                    relationDto.getTCenterSymbolList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getTTrsymbol());
                }
            }
        };
        if (!_suppressTCenterSymbolSelfList && !entity.getTCenterSymbolSelfList().isEmpty()) {
            TCenterSymbolDtoMapper mapper = new TCenterSymbolDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressTCenterSymbolSelf();
            List<TCenterSymbolDto> relationDtoList = mapper.mappingToDtoList(entity.getTCenterSymbolSelfList());
            dto.setTCenterSymbolSelfList(relationDtoList);
            if (reverseReference) {
                for (TCenterSymbolDto relationDto : relationDtoList) {
                    relationDto.setTCenterSymbolSelf(dto);
                }
            }
        };
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<TCenterSymbolDto> mappingToDtoList(List<TCenterSymbol> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<TCenterSymbolDto> dtoList = new ArrayList<TCenterSymbolDto>();
        for (TCenterSymbol entity : entityList) {
            TCenterSymbolDto dto = mappingToDto(entity);
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
    public TCenterSymbol mappingToEntity(TCenterSymbolDto dto) {
        if (dto == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Object localKey = createInstanceKeyDto(dto, dto.instanceHash());
        Entity cachedLocalEntity = instanceCache ? _relationEntityMap.get(localKey) : null;
        if (cachedLocalEntity != null) {
            return (TCenterSymbol)cachedLocalEntity;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        TCenterSymbol entity = new TCenterSymbol();
        if (needsMapping(dto, dto.getCenterSymbolId(), "centerSymbolId")) {
            entity.setCenterSymbolId(dto.getCenterSymbolId());
        }
        if (needsMapping(dto, dto.getCenterId(), "centerId")) {
            entity.setCenterId(dto.getCenterId());
        }
        if (needsMapping(dto, dto.getClientId(), "clientId")) {
            entity.setClientId(dto.getClientId());
        }
        if (needsMapping(dto, dto.getPalletId(), "palletId")) {
            entity.setPalletId(dto.getPalletId());
        }
        if (needsMapping(dto, dto.getTrsymbolId(), "trsymbolId")) {
            entity.setTrsymbolId(dto.getTrsymbolId());
        }
        if (needsMapping(dto, dto.getChildCenterSymbolId(), "childCenterSymbolId")) {
            entity.setChildCenterSymbolId(dto.getChildCenterSymbolId());
        }
        if (needsMapping(dto, dto.getSortstockNumber(), "sortstockNumber")) {
            entity.setSortstockNumber(dto.getSortstockNumber());
        }
        if (needsMapping(dto, dto.getQrCode(), "qrCode")) {
            entity.setQrCode(dto.getQrCode());
        }
        if (needsMapping(dto, dto.getLotId(), "lotId")) {
            entity.setLotId(dto.getLotId());
        }
        if (needsMapping(dto, dto.getCaseMoveSts(), "caseMoveSts")) {
            entity.setCaseMoveSts(dto.getCaseMoveSts());
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
                    relationEntity.getTCenterSymbolList().add(entity);
                }
            } else {
                MCenterDtoMapper mapper = new MCenterDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTCenterSymbolList();
                MCenter relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMCenter(relationEntity);
                if (reverseReference) {
                    relationEntity.getTCenterSymbolList().add(entity);
                }
                if (instanceCache && entity.getMCenter().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMCenter());
                }
            }
        };
        if (!_suppressTCenterSymbolSelf && dto.getTCenterSymbolSelf() != null) {
            TCenterSymbolDto relationDto = dto.getTCenterSymbolSelf();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                TCenterSymbol relationEntity = (TCenterSymbol)cachedEntity;
                entity.setTCenterSymbolSelf(relationEntity);
                if (reverseReference) {
                    relationEntity.getTCenterSymbolSelfList().add(entity);
                }
            } else {
                TCenterSymbolDtoMapper mapper = new TCenterSymbolDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTCenterSymbolSelfList();
                TCenterSymbol relationEntity = mapper.mappingToEntity(relationDto);
                entity.setTCenterSymbolSelf(relationEntity);
                if (reverseReference) {
                    relationEntity.getTCenterSymbolSelfList().add(entity);
                }
                if (instanceCache && entity.getTCenterSymbolSelf().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getTCenterSymbolSelf());
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
                    relationEntity.getTCenterSymbolList().add(entity);
                }
            } else {
                MClientDtoMapper mapper = new MClientDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTCenterSymbolList();
                MClient relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMClient(relationEntity);
                if (reverseReference) {
                    relationEntity.getTCenterSymbolList().add(entity);
                }
                if (instanceCache && entity.getMClient().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMClient());
                }
            }
        };
        if (!_suppressTPallet && dto.getTPallet() != null) {
            TPalletDto relationDto = dto.getTPallet();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                TPallet relationEntity = (TPallet)cachedEntity;
                entity.setTPallet(relationEntity);
                if (reverseReference) {
                    relationEntity.getTCenterSymbolList().add(entity);
                }
            } else {
                TPalletDtoMapper mapper = new TPalletDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTCenterSymbolList();
                TPallet relationEntity = mapper.mappingToEntity(relationDto);
                entity.setTPallet(relationEntity);
                if (reverseReference) {
                    relationEntity.getTCenterSymbolList().add(entity);
                }
                if (instanceCache && entity.getTPallet().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getTPallet());
                }
            }
        };
        if (!_suppressTTrsymbol && dto.getTTrsymbol() != null) {
            TTrsymbolDto relationDto = dto.getTTrsymbol();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                TTrsymbol relationEntity = (TTrsymbol)cachedEntity;
                entity.setTTrsymbol(relationEntity);
                if (reverseReference) {
                    relationEntity.getTCenterSymbolList().add(entity);
                }
            } else {
                TTrsymbolDtoMapper mapper = new TTrsymbolDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTCenterSymbolList();
                TTrsymbol relationEntity = mapper.mappingToEntity(relationDto);
                entity.setTTrsymbol(relationEntity);
                if (reverseReference) {
                    relationEntity.getTCenterSymbolList().add(entity);
                }
                if (instanceCache && entity.getTTrsymbol().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getTTrsymbol());
                }
            }
        };
        if (!_suppressTCenterSymbolSelfList && !dto.getTCenterSymbolSelfList().isEmpty()) {
            TCenterSymbolDtoMapper mapper = new TCenterSymbolDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressTCenterSymbolSelf();
            List<TCenterSymbol> relationEntityList = mapper.mappingToEntityList(dto.getTCenterSymbolSelfList());
            entity.setTCenterSymbolSelfList(relationEntityList);
            if (reverseReference) {
                for (TCenterSymbol relationEntity : relationEntityList) {
                    relationEntity.setTCenterSymbolSelf(entity);
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
    protected boolean needsMapping(TCenterSymbolDto dto, Object value, String propName) {
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
    public List<TCenterSymbol> mappingToEntityList(List<TCenterSymbolDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<TCenterSymbol> entityList = new ArrayList<TCenterSymbol>();
        for (TCenterSymbolDto dto : dtoList) {
            TCenterSymbol entity = mappingToEntity(dto);
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
    public void suppressTCenterSymbolSelf() {
        _suppressTCenterSymbolSelf = true;
    }
    public void suppressMClient() {
        _suppressMClient = true;
    }
    public void suppressTPallet() {
        _suppressTPallet = true;
    }
    public void suppressTTrsymbol() {
        _suppressTTrsymbol = true;
    }
    public void suppressTCenterSymbolSelfList() {
        _suppressTCenterSymbolSelfList = true;
    }
    protected void doSuppressAll() { // internal
        suppressMCenter();
        suppressTCenterSymbolSelf();
        suppressMClient();
        suppressTPallet();
        suppressTTrsymbol();
        suppressTCenterSymbolSelfList();
    }
    protected void doSuppressClear() { // internal
        _suppressMCenter = false;
        _suppressTCenterSymbolSelf = false;
        _suppressMClient = false;
        _suppressTPallet = false;
        _suppressTTrsymbol = false;
        _suppressTCenterSymbolSelfList = false;
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
    public TCenterSymbolDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (TCenterSymbolDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public TCenterSymbolDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (TCenterSymbolDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public TCenterSymbolDtoMapper reverseReference() {
        setReverseReference(true);
        return (TCenterSymbolDtoMapper)this;
    }
}
