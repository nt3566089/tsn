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
 * The DTO mapper of B_ROLE_GRP_DTL as TABLE. <br>
 * 権限グループ明細マスタ
 * <pre>
 * [primary-key]
 *     ROLE_GRP_DTL_ID
 *
 * [column]
 *     ROLE_GRP_DTL_ID, ROLE_GRP_ID, ROLE_ID, APPLY_ORDER, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     ROLE_GRP_DTL_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     B_ROLE, B_ROLE_GRP
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     bRole, bRoleGrp
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsBRoleGrpDtlDtoMapper implements DtoMapper<BRoleGrpDtl, BRoleGrpDtlDto>, Serializable {

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
    protected boolean _suppressBRole;
    protected boolean _suppressBRoleGrp;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsBRoleGrpDtlDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsBRoleGrpDtlDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public BRoleGrpDtlDto mappingToDto(BRoleGrpDtl entity) {
        if (entity == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Entity localKey = createInstanceKeyEntity(entity);
        Object cachedLocalDto = instanceCache ? _relationDtoMap.get(localKey) : null;
        if (cachedLocalDto != null) {
            return (BRoleGrpDtlDto)cachedLocalDto;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        BRoleGrpDtlDto dto = new BRoleGrpDtlDto();
        dto.setRoleGrpDtlId(entity.getRoleGrpDtlId());
        dto.setRoleGrpId(entity.getRoleGrpId());
        dto.setRoleId(entity.getRoleId());
        dto.setApplyOrder(entity.getApplyOrder());
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
        if (!_suppressBRole && entity.getBRole() != null) {
            BRole relationEntity = entity.getBRole();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BRoleDto relationDto = (BRoleDto)cachedDto;
                dto.setBRole(relationDto);
                if (reverseReference) {
                    relationDto.getBRoleGrpDtlList().add(dto);
                }
            } else {
                BRoleDtoMapper mapper = new BRoleDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressBRoleGrpDtlList();
                BRoleDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBRole(relationDto);
                if (reverseReference) {
                    relationDto.getBRoleGrpDtlList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBRole());
                }
            }
        };
        if (!_suppressBRoleGrp && entity.getBRoleGrp() != null) {
            BRoleGrp relationEntity = entity.getBRoleGrp();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BRoleGrpDto relationDto = (BRoleGrpDto)cachedDto;
                dto.setBRoleGrp(relationDto);
                if (reverseReference) {
                    relationDto.getBRoleGrpDtlList().add(dto);
                }
            } else {
                BRoleGrpDtoMapper mapper = new BRoleGrpDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressBRoleGrpDtlList();
                BRoleGrpDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBRoleGrp(relationDto);
                if (reverseReference) {
                    relationDto.getBRoleGrpDtlList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getBRoleGrp());
                }
            }
        };
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<BRoleGrpDtlDto> mappingToDtoList(List<BRoleGrpDtl> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<BRoleGrpDtlDto> dtoList = new ArrayList<BRoleGrpDtlDto>();
        for (BRoleGrpDtl entity : entityList) {
            BRoleGrpDtlDto dto = mappingToDto(entity);
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
    public BRoleGrpDtl mappingToEntity(BRoleGrpDtlDto dto) {
        if (dto == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Object localKey = createInstanceKeyDto(dto, dto.instanceHash());
        Entity cachedLocalEntity = instanceCache ? _relationEntityMap.get(localKey) : null;
        if (cachedLocalEntity != null) {
            return (BRoleGrpDtl)cachedLocalEntity;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        BRoleGrpDtl entity = new BRoleGrpDtl();
        if (needsMapping(dto, dto.getRoleGrpDtlId(), "roleGrpDtlId")) {
            entity.setRoleGrpDtlId(dto.getRoleGrpDtlId());
        }
        if (needsMapping(dto, dto.getRoleGrpId(), "roleGrpId")) {
            entity.setRoleGrpId(dto.getRoleGrpId());
        }
        if (needsMapping(dto, dto.getRoleId(), "roleId")) {
            entity.setRoleId(dto.getRoleId());
        }
        if (needsMapping(dto, dto.getApplyOrder(), "applyOrder")) {
            entity.setApplyOrder(dto.getApplyOrder());
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
        if (!_suppressBRole && dto.getBRole() != null) {
            BRoleDto relationDto = dto.getBRole();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BRole relationEntity = (BRole)cachedEntity;
                entity.setBRole(relationEntity);
                if (reverseReference) {
                    relationEntity.getBRoleGrpDtlList().add(entity);
                }
            } else {
                BRoleDtoMapper mapper = new BRoleDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressBRoleGrpDtlList();
                BRole relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBRole(relationEntity);
                if (reverseReference) {
                    relationEntity.getBRoleGrpDtlList().add(entity);
                }
                if (instanceCache && entity.getBRole().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBRole());
                }
            }
        };
        if (!_suppressBRoleGrp && dto.getBRoleGrp() != null) {
            BRoleGrpDto relationDto = dto.getBRoleGrp();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BRoleGrp relationEntity = (BRoleGrp)cachedEntity;
                entity.setBRoleGrp(relationEntity);
                if (reverseReference) {
                    relationEntity.getBRoleGrpDtlList().add(entity);
                }
            } else {
                BRoleGrpDtoMapper mapper = new BRoleGrpDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressBRoleGrpDtlList();
                BRoleGrp relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBRoleGrp(relationEntity);
                if (reverseReference) {
                    relationEntity.getBRoleGrpDtlList().add(entity);
                }
                if (instanceCache && entity.getBRoleGrp().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getBRoleGrp());
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
    protected boolean needsMapping(BRoleGrpDtlDto dto, Object value, String propName) {
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
    public List<BRoleGrpDtl> mappingToEntityList(List<BRoleGrpDtlDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<BRoleGrpDtl> entityList = new ArrayList<BRoleGrpDtl>();
        for (BRoleGrpDtlDto dto : dtoList) {
            BRoleGrpDtl entity = mappingToEntity(dto);
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
    public void suppressBRole() {
        _suppressBRole = true;
    }
    public void suppressBRoleGrp() {
        _suppressBRoleGrp = true;
    }
    protected void doSuppressAll() { // internal
        suppressBRole();
        suppressBRoleGrp();
    }
    protected void doSuppressClear() { // internal
        _suppressBRole = false;
        _suppressBRoleGrp = false;
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
    public BRoleGrpDtlDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (BRoleGrpDtlDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public BRoleGrpDtlDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (BRoleGrpDtlDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public BRoleGrpDtlDtoMapper reverseReference() {
        setReverseReference(true);
        return (BRoleGrpDtlDtoMapper)this;
    }
}
