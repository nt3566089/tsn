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
 * The DTO mapper of B_ROLE as TABLE. <br>
 * 権限マスタ
 * <pre>
 * [primary-key]
 *     ROLE_ID
 *
 * [column]
 *     ROLE_ID, ROLE_CD, DICT_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     ROLE_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     B_DICT, V_DICT
 *
 * [referrer-table]
 *     B_COL_ROLE, B_FUNC_ROLE, B_ITEM_ROLE, B_ROLE_GRP_DTL, B_SCREEN_ROLE
 *
 * [foreign-property]
 *     bDict, vDict
 *
 * [referrer-property]
 *     bColRoleList, bFuncRoleList, bItemRoleList, bRoleGrpDtlList, bScreenRoleList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsBRoleDtoMapper implements DtoMapper<BRole, BRoleDto>, Serializable {

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
    protected boolean _suppressBColRoleList;
    protected boolean _suppressBFuncRoleList;
    protected boolean _suppressBItemRoleList;
    protected boolean _suppressBRoleGrpDtlList;
    protected boolean _suppressBScreenRoleList;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsBRoleDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsBRoleDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public BRoleDto mappingToDto(BRole entity) {
        if (entity == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Entity localKey = createInstanceKeyEntity(entity);
        Object cachedLocalDto = instanceCache ? _relationDtoMap.get(localKey) : null;
        if (cachedLocalDto != null) {
            return (BRoleDto)cachedLocalDto;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        BRoleDto dto = new BRoleDto();
        dto.setRoleId(entity.getRoleId());
        dto.setRoleCd(entity.getRoleCd());
        dto.setDictId(entity.getDictId());
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
                    relationDto.getBRoleList().add(dto);
                }
            } else {
                BDictDtoMapper mapper = new BDictDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressBRoleList();
                BDictDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBDict(relationDto);
                if (reverseReference) {
                    relationDto.getBRoleList().add(dto);
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
        if (!_suppressBColRoleList && !entity.getBColRoleList().isEmpty()) {
            BColRoleDtoMapper mapper = new BColRoleDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBRole();
            List<BColRoleDto> relationDtoList = mapper.mappingToDtoList(entity.getBColRoleList());
            dto.setBColRoleList(relationDtoList);
            if (reverseReference) {
                for (BColRoleDto relationDto : relationDtoList) {
                    relationDto.setBRole(dto);
                }
            }
        };
        if (!_suppressBFuncRoleList && !entity.getBFuncRoleList().isEmpty()) {
            BFuncRoleDtoMapper mapper = new BFuncRoleDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBRole();
            List<BFuncRoleDto> relationDtoList = mapper.mappingToDtoList(entity.getBFuncRoleList());
            dto.setBFuncRoleList(relationDtoList);
            if (reverseReference) {
                for (BFuncRoleDto relationDto : relationDtoList) {
                    relationDto.setBRole(dto);
                }
            }
        };
        if (!_suppressBItemRoleList && !entity.getBItemRoleList().isEmpty()) {
            BItemRoleDtoMapper mapper = new BItemRoleDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBRole();
            List<BItemRoleDto> relationDtoList = mapper.mappingToDtoList(entity.getBItemRoleList());
            dto.setBItemRoleList(relationDtoList);
            if (reverseReference) {
                for (BItemRoleDto relationDto : relationDtoList) {
                    relationDto.setBRole(dto);
                }
            }
        };
        if (!_suppressBRoleGrpDtlList && !entity.getBRoleGrpDtlList().isEmpty()) {
            BRoleGrpDtlDtoMapper mapper = new BRoleGrpDtlDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBRole();
            List<BRoleGrpDtlDto> relationDtoList = mapper.mappingToDtoList(entity.getBRoleGrpDtlList());
            dto.setBRoleGrpDtlList(relationDtoList);
            if (reverseReference) {
                for (BRoleGrpDtlDto relationDto : relationDtoList) {
                    relationDto.setBRole(dto);
                }
            }
        };
        if (!_suppressBScreenRoleList && !entity.getBScreenRoleList().isEmpty()) {
            BScreenRoleDtoMapper mapper = new BScreenRoleDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBRole();
            List<BScreenRoleDto> relationDtoList = mapper.mappingToDtoList(entity.getBScreenRoleList());
            dto.setBScreenRoleList(relationDtoList);
            if (reverseReference) {
                for (BScreenRoleDto relationDto : relationDtoList) {
                    relationDto.setBRole(dto);
                }
            }
        };
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<BRoleDto> mappingToDtoList(List<BRole> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<BRoleDto> dtoList = new ArrayList<BRoleDto>();
        for (BRole entity : entityList) {
            BRoleDto dto = mappingToDto(entity);
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
    public BRole mappingToEntity(BRoleDto dto) {
        if (dto == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Object localKey = createInstanceKeyDto(dto, dto.instanceHash());
        Entity cachedLocalEntity = instanceCache ? _relationEntityMap.get(localKey) : null;
        if (cachedLocalEntity != null) {
            return (BRole)cachedLocalEntity;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        BRole entity = new BRole();
        if (needsMapping(dto, dto.getRoleId(), "roleId")) {
            entity.setRoleId(dto.getRoleId());
        }
        if (needsMapping(dto, dto.getRoleCd(), "roleCd")) {
            entity.setRoleCd(dto.getRoleCd());
        }
        if (needsMapping(dto, dto.getDictId(), "dictId")) {
            entity.setDictId(dto.getDictId());
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
                    relationEntity.getBRoleList().add(entity);
                }
            } else {
                BDictDtoMapper mapper = new BDictDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressBRoleList();
                BDict relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBDict(relationEntity);
                if (reverseReference) {
                    relationEntity.getBRoleList().add(entity);
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
        if (!_suppressBColRoleList && !dto.getBColRoleList().isEmpty()) {
            BColRoleDtoMapper mapper = new BColRoleDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBRole();
            List<BColRole> relationEntityList = mapper.mappingToEntityList(dto.getBColRoleList());
            entity.setBColRoleList(relationEntityList);
            if (reverseReference) {
                for (BColRole relationEntity : relationEntityList) {
                    relationEntity.setBRole(entity);
                }
            }
        };
        if (!_suppressBFuncRoleList && !dto.getBFuncRoleList().isEmpty()) {
            BFuncRoleDtoMapper mapper = new BFuncRoleDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBRole();
            List<BFuncRole> relationEntityList = mapper.mappingToEntityList(dto.getBFuncRoleList());
            entity.setBFuncRoleList(relationEntityList);
            if (reverseReference) {
                for (BFuncRole relationEntity : relationEntityList) {
                    relationEntity.setBRole(entity);
                }
            }
        };
        if (!_suppressBItemRoleList && !dto.getBItemRoleList().isEmpty()) {
            BItemRoleDtoMapper mapper = new BItemRoleDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBRole();
            List<BItemRole> relationEntityList = mapper.mappingToEntityList(dto.getBItemRoleList());
            entity.setBItemRoleList(relationEntityList);
            if (reverseReference) {
                for (BItemRole relationEntity : relationEntityList) {
                    relationEntity.setBRole(entity);
                }
            }
        };
        if (!_suppressBRoleGrpDtlList && !dto.getBRoleGrpDtlList().isEmpty()) {
            BRoleGrpDtlDtoMapper mapper = new BRoleGrpDtlDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBRole();
            List<BRoleGrpDtl> relationEntityList = mapper.mappingToEntityList(dto.getBRoleGrpDtlList());
            entity.setBRoleGrpDtlList(relationEntityList);
            if (reverseReference) {
                for (BRoleGrpDtl relationEntity : relationEntityList) {
                    relationEntity.setBRole(entity);
                }
            }
        };
        if (!_suppressBScreenRoleList && !dto.getBScreenRoleList().isEmpty()) {
            BScreenRoleDtoMapper mapper = new BScreenRoleDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressBRole();
            List<BScreenRole> relationEntityList = mapper.mappingToEntityList(dto.getBScreenRoleList());
            entity.setBScreenRoleList(relationEntityList);
            if (reverseReference) {
                for (BScreenRole relationEntity : relationEntityList) {
                    relationEntity.setBRole(entity);
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
    protected boolean needsMapping(BRoleDto dto, Object value, String propName) {
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
    public List<BRole> mappingToEntityList(List<BRoleDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<BRole> entityList = new ArrayList<BRole>();
        for (BRoleDto dto : dtoList) {
            BRole entity = mappingToEntity(dto);
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
    public void suppressBColRoleList() {
        _suppressBColRoleList = true;
    }
    public void suppressBFuncRoleList() {
        _suppressBFuncRoleList = true;
    }
    public void suppressBItemRoleList() {
        _suppressBItemRoleList = true;
    }
    public void suppressBRoleGrpDtlList() {
        _suppressBRoleGrpDtlList = true;
    }
    public void suppressBScreenRoleList() {
        _suppressBScreenRoleList = true;
    }
    protected void doSuppressAll() { // internal
        suppressBDict();
        suppressVDict();
        suppressBColRoleList();
        suppressBFuncRoleList();
        suppressBItemRoleList();
        suppressBRoleGrpDtlList();
        suppressBScreenRoleList();
    }
    protected void doSuppressClear() { // internal
        _suppressBDict = false;
        _suppressVDict = false;
        _suppressBColRoleList = false;
        _suppressBFuncRoleList = false;
        _suppressBItemRoleList = false;
        _suppressBRoleGrpDtlList = false;
        _suppressBScreenRoleList = false;
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
    public BRoleDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (BRoleDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public BRoleDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (BRoleDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public BRoleDtoMapper reverseReference() {
        setReverseReference(true);
        return (BRoleDtoMapper)this;
    }
}
