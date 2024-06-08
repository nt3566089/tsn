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
 * The DTO mapper of B_SCREEN as TABLE. <br>
 * 画面マスタ
 * <pre>
 * [primary-key]
 *     SCREEN_ID
 *
 * [column]
 *     SCREEN_ID, SCREEN_CD, DICT_ID, SYSTEM_TYPE, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SCREEN_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     B_DICT, V_DICT, V_HT_DICT
 *
 * [referrer-table]
 *     B_ITEM, B_MENU, B_SCREEN_ROLE, M_CENTER_SCREEN, M_CLIENT_SCREEN
 *
 * [foreign-property]
 *     bDict, vDict, vHtDict
 *
 * [referrer-property]
 *     bItemList, bMenuList, bScreenRoleList, mCenterScreenList, mClientScreenList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsBScreenDtoMapper implements DtoMapper<BScreen, BScreenDto>, Serializable {

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
    protected boolean _suppressVDict;
    protected boolean _suppressVHtDict;
    protected boolean _suppressBItemList;
    protected boolean _suppressBMenuList;
    protected boolean _suppressBScreenRoleList;
    protected boolean _suppressMCenterScreenList;
    protected boolean _suppressMClientScreenList;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsBScreenDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsBScreenDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public BScreenDto mappingToDto(BScreen entity) {
        if (entity == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Entity localKey = createInstanceKeyEntity(entity);
        Object cachedLocalDto = instanceCache ? _relationDtoMap.get(localKey) : null;
        if (cachedLocalDto != null) {
            return (BScreenDto)cachedLocalDto;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        BScreenDto dto = new BScreenDto();
        dto.setScreenId(entity.getScreenId());
        dto.setScreenCd(entity.getScreenCd());
        dto.setDictId(entity.getDictId());
        dto.setSystemType(entity.getSystemType());
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
                    relationDto.getBScreenList().add(dto);
                }
            } else {
                BDictDtoMapper mapper = new BDictDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressBScreenList();
                BDictDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBDict(relationDto);
                if (reverseReference) {
                    relationDto.getBScreenList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBDict());
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
        if (!_suppressBItemList && !entity.getBItemList().isEmpty()) {
            BItemDtoMapper mapper = new BItemDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBScreen();
            List<BItemDto> relationDtoList = mapper.mappingToDtoList(entity.getBItemList());
            dto.setBItemList(relationDtoList);
            if (reverseReference) {
                for (BItemDto relationDto : relationDtoList) {
                    relationDto.setBScreen(dto);
                }
            }
        };
        if (!_suppressBMenuList && !entity.getBMenuList().isEmpty()) {
            BMenuDtoMapper mapper = new BMenuDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBScreen();
            List<BMenuDto> relationDtoList = mapper.mappingToDtoList(entity.getBMenuList());
            dto.setBMenuList(relationDtoList);
            if (reverseReference) {
                for (BMenuDto relationDto : relationDtoList) {
                    relationDto.setBScreen(dto);
                }
            }
        };
        if (!_suppressBScreenRoleList && !entity.getBScreenRoleList().isEmpty()) {
            BScreenRoleDtoMapper mapper = new BScreenRoleDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBScreen();
            List<BScreenRoleDto> relationDtoList = mapper.mappingToDtoList(entity.getBScreenRoleList());
            dto.setBScreenRoleList(relationDtoList);
            if (reverseReference) {
                for (BScreenRoleDto relationDto : relationDtoList) {
                    relationDto.setBScreen(dto);
                }
            }
        };
        if (!_suppressMCenterScreenList && !entity.getMCenterScreenList().isEmpty()) {
            MCenterScreenDtoMapper mapper = new MCenterScreenDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBScreen();
            List<MCenterScreenDto> relationDtoList = mapper.mappingToDtoList(entity.getMCenterScreenList());
            dto.setMCenterScreenList(relationDtoList);
            if (reverseReference) {
                for (MCenterScreenDto relationDto : relationDtoList) {
                    relationDto.setBScreen(dto);
                }
            }
        };
        if (!_suppressMClientScreenList && !entity.getMClientScreenList().isEmpty()) {
            MClientScreenDtoMapper mapper = new MClientScreenDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBScreen();
            List<MClientScreenDto> relationDtoList = mapper.mappingToDtoList(entity.getMClientScreenList());
            dto.setMClientScreenList(relationDtoList);
            if (reverseReference) {
                for (MClientScreenDto relationDto : relationDtoList) {
                    relationDto.setBScreen(dto);
                }
            }
        };
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<BScreenDto> mappingToDtoList(List<BScreen> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<BScreenDto> dtoList = new ArrayList<BScreenDto>();
        for (BScreen entity : entityList) {
            BScreenDto dto = mappingToDto(entity);
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
    public BScreen mappingToEntity(BScreenDto dto) {
        if (dto == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Object localKey = createInstanceKeyDto(dto, dto.instanceHash());
        Entity cachedLocalEntity = instanceCache ? _relationEntityMap.get(localKey) : null;
        if (cachedLocalEntity != null) {
            return (BScreen)cachedLocalEntity;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        BScreen entity = new BScreen();
        if (needsMapping(dto, dto.getScreenId(), "screenId")) {
            entity.setScreenId(dto.getScreenId());
        }
        if (needsMapping(dto, dto.getScreenCd(), "screenCd")) {
            entity.setScreenCd(dto.getScreenCd());
        }
        if (needsMapping(dto, dto.getDictId(), "dictId")) {
            entity.setDictId(dto.getDictId());
        }
        if (needsMapping(dto, dto.getSystemType(), "systemType")) {
            entity.setSystemType(dto.getSystemType());
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
                    relationEntity.getBScreenList().add(entity);
                }
            } else {
                BDictDtoMapper mapper = new BDictDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressBScreenList();
                BDict relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBDict(relationEntity);
                if (reverseReference) {
                    relationEntity.getBScreenList().add(entity);
                }
                if (instanceCache && entity.getBDict().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBDict());
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
        if (!_suppressBItemList && !dto.getBItemList().isEmpty()) {
            BItemDtoMapper mapper = new BItemDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBScreen();
            List<BItem> relationEntityList = mapper.mappingToEntityList(dto.getBItemList());
            entity.setBItemList(relationEntityList);
            if (reverseReference) {
                for (BItem relationEntity : relationEntityList) {
                    relationEntity.setBScreen(entity);
                }
            }
        };
        if (!_suppressBMenuList && !dto.getBMenuList().isEmpty()) {
            BMenuDtoMapper mapper = new BMenuDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBScreen();
            List<BMenu> relationEntityList = mapper.mappingToEntityList(dto.getBMenuList());
            entity.setBMenuList(relationEntityList);
            if (reverseReference) {
                for (BMenu relationEntity : relationEntityList) {
                    relationEntity.setBScreen(entity);
                }
            }
        };
        if (!_suppressBScreenRoleList && !dto.getBScreenRoleList().isEmpty()) {
            BScreenRoleDtoMapper mapper = new BScreenRoleDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBScreen();
            List<BScreenRole> relationEntityList = mapper.mappingToEntityList(dto.getBScreenRoleList());
            entity.setBScreenRoleList(relationEntityList);
            if (reverseReference) {
                for (BScreenRole relationEntity : relationEntityList) {
                    relationEntity.setBScreen(entity);
                }
            }
        };
        if (!_suppressMCenterScreenList && !dto.getMCenterScreenList().isEmpty()) {
            MCenterScreenDtoMapper mapper = new MCenterScreenDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBScreen();
            List<MCenterScreen> relationEntityList = mapper.mappingToEntityList(dto.getMCenterScreenList());
            entity.setMCenterScreenList(relationEntityList);
            if (reverseReference) {
                for (MCenterScreen relationEntity : relationEntityList) {
                    relationEntity.setBScreen(entity);
                }
            }
        };
        if (!_suppressMClientScreenList && !dto.getMClientScreenList().isEmpty()) {
            MClientScreenDtoMapper mapper = new MClientScreenDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBScreen();
            List<MClientScreen> relationEntityList = mapper.mappingToEntityList(dto.getMClientScreenList());
            entity.setMClientScreenList(relationEntityList);
            if (reverseReference) {
                for (MClientScreen relationEntity : relationEntityList) {
                    relationEntity.setBScreen(entity);
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
    protected boolean needsMapping(BScreenDto dto, Object value, String propName) {
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
    public List<BScreen> mappingToEntityList(List<BScreenDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<BScreen> entityList = new ArrayList<BScreen>();
        for (BScreenDto dto : dtoList) {
            BScreen entity = mappingToEntity(dto);
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
    public void suppressVDict() {
        _suppressVDict = true;
    }
    public void suppressVHtDict() {
        _suppressVHtDict = true;
    }
    public void suppressBItemList() {
        _suppressBItemList = true;
    }
    public void suppressBMenuList() {
        _suppressBMenuList = true;
    }
    public void suppressBScreenRoleList() {
        _suppressBScreenRoleList = true;
    }
    public void suppressMCenterScreenList() {
        _suppressMCenterScreenList = true;
    }
    public void suppressMClientScreenList() {
        _suppressMClientScreenList = true;
    }
    protected void doSuppressAll() { // internal
        suppressBDict();
        suppressVDict();
        suppressVHtDict();
        suppressBItemList();
        suppressBMenuList();
        suppressBScreenRoleList();
        suppressMCenterScreenList();
        suppressMClientScreenList();
    }
    protected void doSuppressClear() { // internal
        _suppressBDict = false;
        _suppressVDict = false;
        _suppressVHtDict = false;
        _suppressBItemList = false;
        _suppressBMenuList = false;
        _suppressBScreenRoleList = false;
        _suppressMCenterScreenList = false;
        _suppressMClientScreenList = false;
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
    public BScreenDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (BScreenDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public BScreenDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (BScreenDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public BScreenDtoMapper reverseReference() {
        setReverseReference(true);
        return (BScreenDtoMapper)this;
    }
}
