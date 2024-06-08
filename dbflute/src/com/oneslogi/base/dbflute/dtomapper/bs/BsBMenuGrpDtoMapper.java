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
 * The DTO mapper of B_MENU_GRP as TABLE. <br>
 * メニューグループマスタ
 * <pre>
 * [primary-key]
 *     MENU_GRP_ID
 *
 * [column]
 *     MENU_GRP_ID, MENU_GRP_CD, DICT_ID, PARENT_MENU_GRP_ID, VIEW_ORDER, VISIBLE_TYPE, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     MENU_GRP_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     B_DICT, B_MENU_GRP, V_DICT, V_HT_DICT
 *
 * [referrer-table]
 *     B_MENU, B_MENU_GRP
 *
 * [foreign-property]
 *     bDict, bMenuGrpSelf, vDict, vHtDict
 *
 * [referrer-property]
 *     bMenuList, bMenuGrpSelfList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsBMenuGrpDtoMapper implements DtoMapper<BMenuGrp, BMenuGrpDto>, Serializable {

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
    protected boolean _suppressBDict;
    protected boolean _suppressBMenuGrpSelf;
    protected boolean _suppressVDict;
    protected boolean _suppressVHtDict;
    protected boolean _suppressBMenuList;
    protected boolean _suppressBMenuGrpSelfList;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsBMenuGrpDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsBMenuGrpDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public BMenuGrpDto mappingToDto(BMenuGrp entity) {
        if (entity == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Entity localKey = createInstanceKeyEntity(entity);
        Object cachedLocalDto = instanceCache ? _relationDtoMap.get(localKey) : null;
        if (cachedLocalDto != null) {
            return (BMenuGrpDto)cachedLocalDto;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        BMenuGrpDto dto = new BMenuGrpDto();
        dto.setMenuGrpId(entity.getMenuGrpId());
        dto.setMenuGrpCd(entity.getMenuGrpCd());
        dto.setDictId(entity.getDictId());
        dto.setParentMenuGrpId(entity.getParentMenuGrpId());
        dto.setViewOrder(entity.getViewOrder());
        dto.setVisibleType(entity.getVisibleType());
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
        if (!_suppressBDict && entity.getBDict() != null) {
            BDict relationEntity = entity.getBDict();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BDictDto relationDto = (BDictDto)cachedDto;
                dto.setBDict(relationDto);
                if (reverseReference) {
                    relationDto.getBMenuGrpList().add(dto);
                }
            } else {
                BDictDtoMapper mapper = new BDictDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressBMenuGrpList();
                BDictDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBDict(relationDto);
                if (reverseReference) {
                    relationDto.getBMenuGrpList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBDict());
                }
            }
        };
        if (!_suppressBMenuGrpSelf && entity.getBMenuGrpSelf() != null) {
            BMenuGrp relationEntity = entity.getBMenuGrpSelf();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BMenuGrpDto relationDto = (BMenuGrpDto)cachedDto;
                dto.setBMenuGrpSelf(relationDto);
                if (reverseReference) {
                    relationDto.getBMenuGrpSelfList().add(dto);
                }
            } else {
                BMenuGrpDtoMapper mapper = new BMenuGrpDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressBMenuGrpSelfList();
                BMenuGrpDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBMenuGrpSelf(relationDto);
                if (reverseReference) {
                    relationDto.getBMenuGrpSelfList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBMenuGrpSelf());
                }
            }
        };
        if (!_suppressVDict && entity.getVDict() != null) {
            VDict relationEntity = entity.getVDict();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                VDictDto relationDto = (VDictDto)cachedDto;
                dto.setVDict(relationDto);
                if (reverseReference) {
                }
            } else {
                VDictDtoMapper mapper = new VDictDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                VDictDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setVDict(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getVDict());
                }
            }
        };
        if (!_suppressVHtDict && entity.getVHtDict() != null) {
            VHtDict relationEntity = entity.getVHtDict();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                VHtDictDto relationDto = (VHtDictDto)cachedDto;
                dto.setVHtDict(relationDto);
                if (reverseReference) {
                }
            } else {
                VHtDictDtoMapper mapper = new VHtDictDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                VHtDictDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setVHtDict(relationDto);
                if (reverseReference) {
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getVHtDict());
                }
            }
        };
        if (!_suppressBMenuList && !entity.getBMenuList().isEmpty()) {
            BMenuDtoMapper mapper = new BMenuDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBMenuGrp();
            List<BMenuDto> relationDtoList = mapper.mappingToDtoList(entity.getBMenuList());
            dto.setBMenuList(relationDtoList);
            if (reverseReference) {
                for (BMenuDto relationDto : relationDtoList) {
                    relationDto.setBMenuGrp(dto);
                }
            }
        };
        if (!_suppressBMenuGrpSelfList && !entity.getBMenuGrpSelfList().isEmpty()) {
            BMenuGrpDtoMapper mapper = new BMenuGrpDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBMenuGrpSelf();
            List<BMenuGrpDto> relationDtoList = mapper.mappingToDtoList(entity.getBMenuGrpSelfList());
            dto.setBMenuGrpSelfList(relationDtoList);
            if (reverseReference) {
                for (BMenuGrpDto relationDto : relationDtoList) {
                    relationDto.setBMenuGrpSelf(dto);
                }
            }
        };
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<BMenuGrpDto> mappingToDtoList(List<BMenuGrp> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<BMenuGrpDto> dtoList = new ArrayList<BMenuGrpDto>();
        for (BMenuGrp entity : entityList) {
            BMenuGrpDto dto = mappingToDto(entity);
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
    public BMenuGrp mappingToEntity(BMenuGrpDto dto) {
        if (dto == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Object localKey = createInstanceKeyDto(dto, dto.instanceHash());
        Entity cachedLocalEntity = instanceCache ? _relationEntityMap.get(localKey) : null;
        if (cachedLocalEntity != null) {
            return (BMenuGrp)cachedLocalEntity;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        BMenuGrp entity = new BMenuGrp();
        if (needsMapping(dto, dto.getMenuGrpId(), "menuGrpId")) {
            entity.setMenuGrpId(dto.getMenuGrpId());
        }
        if (needsMapping(dto, dto.getMenuGrpCd(), "menuGrpCd")) {
            entity.setMenuGrpCd(dto.getMenuGrpCd());
        }
        if (needsMapping(dto, dto.getDictId(), "dictId")) {
            entity.setDictId(dto.getDictId());
        }
        if (needsMapping(dto, dto.getParentMenuGrpId(), "parentMenuGrpId")) {
            entity.setParentMenuGrpId(dto.getParentMenuGrpId());
        }
        if (needsMapping(dto, dto.getViewOrder(), "viewOrder")) {
            entity.setViewOrder(dto.getViewOrder());
        }
        if (needsMapping(dto, dto.getVisibleType(), "visibleType")) {
            entity.setVisibleType(dto.getVisibleType());
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
        if (!_suppressBDict && dto.getBDict() != null) {
            BDictDto relationDto = dto.getBDict();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BDict relationEntity = (BDict)cachedEntity;
                entity.setBDict(relationEntity);
                if (reverseReference) {
                    relationEntity.getBMenuGrpList().add(entity);
                }
            } else {
                BDictDtoMapper mapper = new BDictDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressBMenuGrpList();
                BDict relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBDict(relationEntity);
                if (reverseReference) {
                    relationEntity.getBMenuGrpList().add(entity);
                }
                if (instanceCache && entity.getBDict().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBDict());
                }
            }
        };
        if (!_suppressBMenuGrpSelf && dto.getBMenuGrpSelf() != null) {
            BMenuGrpDto relationDto = dto.getBMenuGrpSelf();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BMenuGrp relationEntity = (BMenuGrp)cachedEntity;
                entity.setBMenuGrpSelf(relationEntity);
                if (reverseReference) {
                    relationEntity.getBMenuGrpSelfList().add(entity);
                }
            } else {
                BMenuGrpDtoMapper mapper = new BMenuGrpDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressBMenuGrpSelfList();
                BMenuGrp relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBMenuGrpSelf(relationEntity);
                if (reverseReference) {
                    relationEntity.getBMenuGrpSelfList().add(entity);
                }
                if (instanceCache && entity.getBMenuGrpSelf().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBMenuGrpSelf());
                }
            }
        };
        if (!_suppressVDict && dto.getVDict() != null) {
            VDictDto relationDto = dto.getVDict();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                VDict relationEntity = (VDict)cachedEntity;
                entity.setVDict(relationEntity);
                if (reverseReference) {
                }
            } else {
                VDictDtoMapper mapper = new VDictDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                VDict relationEntity = mapper.mappingToEntity(relationDto);
                entity.setVDict(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getVDict().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getVDict());
                }
            }
        };
        if (!_suppressVHtDict && dto.getVHtDict() != null) {
            VHtDictDto relationDto = dto.getVHtDict();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                VHtDict relationEntity = (VHtDict)cachedEntity;
                entity.setVHtDict(relationEntity);
                if (reverseReference) {
                }
            } else {
                VHtDictDtoMapper mapper = new VHtDictDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                VHtDict relationEntity = mapper.mappingToEntity(relationDto);
                entity.setVHtDict(relationEntity);
                if (reverseReference) {
                }
                if (instanceCache && entity.getVHtDict().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getVHtDict());
                }
            }
        };
        if (!_suppressBMenuList && !dto.getBMenuList().isEmpty()) {
            BMenuDtoMapper mapper = new BMenuDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBMenuGrp();
            List<BMenu> relationEntityList = mapper.mappingToEntityList(dto.getBMenuList());
            entity.setBMenuList(relationEntityList);
            if (reverseReference) {
                for (BMenu relationEntity : relationEntityList) {
                    relationEntity.setBMenuGrp(entity);
                }
            }
        };
        if (!_suppressBMenuGrpSelfList && !dto.getBMenuGrpSelfList().isEmpty()) {
            BMenuGrpDtoMapper mapper = new BMenuGrpDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBMenuGrpSelf();
            List<BMenuGrp> relationEntityList = mapper.mappingToEntityList(dto.getBMenuGrpSelfList());
            entity.setBMenuGrpSelfList(relationEntityList);
            if (reverseReference) {
                for (BMenuGrp relationEntity : relationEntityList) {
                    relationEntity.setBMenuGrpSelf(entity);
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
    protected boolean needsMapping(BMenuGrpDto dto, Object value, String propName) {
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
    public List<BMenuGrp> mappingToEntityList(List<BMenuGrpDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<BMenuGrp> entityList = new ArrayList<BMenuGrp>();
        for (BMenuGrpDto dto : dtoList) {
            BMenuGrp entity = mappingToEntity(dto);
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
    public void suppressBDict() {
        _suppressBDict = true;
    }
    public void suppressBMenuGrpSelf() {
        _suppressBMenuGrpSelf = true;
    }
    public void suppressVDict() {
        _suppressVDict = true;
    }
    public void suppressVHtDict() {
        _suppressVHtDict = true;
    }
    public void suppressBMenuList() {
        _suppressBMenuList = true;
    }
    public void suppressBMenuGrpSelfList() {
        _suppressBMenuGrpSelfList = true;
    }
    protected void doSuppressAll() { // internal
        suppressBDict();
        suppressBMenuGrpSelf();
        suppressVDict();
        suppressVHtDict();
        suppressBMenuList();
        suppressBMenuGrpSelfList();
    }
    protected void doSuppressClear() { // internal
        _suppressBDict = false;
        _suppressBMenuGrpSelf = false;
        _suppressVDict = false;
        _suppressVHtDict = false;
        _suppressBMenuList = false;
        _suppressBMenuGrpSelfList = false;
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
    public BMenuGrpDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (BMenuGrpDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public BMenuGrpDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (BMenuGrpDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public BMenuGrpDtoMapper reverseReference() {
        setReverseReference(true);
        return (BMenuGrpDtoMapper)this;
    }
}
