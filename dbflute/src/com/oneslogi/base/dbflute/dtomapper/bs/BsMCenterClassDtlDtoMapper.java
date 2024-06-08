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
 * The DTO mapper of M_CENTER_CLASS_DTL as TABLE. <br>
 * 拠点区分値明細マスタ
 * <pre>
 * [primary-key]
 *     CENTER_CLASS_DTL_ID
 *
 * [column]
 *     CENTER_CLASS_DTL_ID, CENTER_CLASS_ID, CLASS_DTL_CD, DICT_ID, VIEW_ORDER, DEFAULT_FLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     CENTER_CLASS_DTL_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     M_CENTER_CLASS, B_DICT, V_DICT, M_CENTER_CLASS_DTL_SUB(AsOne)
 *
 * [referrer-table]
 *     M_CENTER_CLASS_GRP_DTL, M_CENTER_CLASS_DTL_SUB
 *
 * [foreign-property]
 *     mCenterClass, bDict, vDict, mCenterClassDtlSubAsOne
 *
 * [referrer-property]
 *     mCenterClassGrpDtlList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsMCenterClassDtlDtoMapper implements DtoMapper<MCenterClassDtl, MCenterClassDtlDto>, Serializable {

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
    protected boolean _suppressMCenterClass;
    protected boolean _suppressBDict;
    protected boolean _suppressVDict;
    protected boolean _suppressMCenterClassDtlSubAsOne;
    protected boolean _suppressMCenterClassGrpDtlList;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMCenterClassDtlDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsMCenterClassDtlDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public MCenterClassDtlDto mappingToDto(MCenterClassDtl entity) {
        if (entity == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Entity localKey = createInstanceKeyEntity(entity);
        Object cachedLocalDto = instanceCache ? _relationDtoMap.get(localKey) : null;
        if (cachedLocalDto != null) {
            return (MCenterClassDtlDto)cachedLocalDto;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        MCenterClassDtlDto dto = new MCenterClassDtlDto();
        dto.setCenterClassDtlId(entity.getCenterClassDtlId());
        dto.setCenterClassId(entity.getCenterClassId());
        dto.setClassDtlCd(entity.getClassDtlCd());
        dto.setDictId(entity.getDictId());
        dto.setViewOrder(entity.getViewOrder());
        dto.setDefaultFlg(entity.getDefaultFlg());
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
        if (!_suppressMCenterClass && entity.getMCenterClass() != null) {
            MCenterClass relationEntity = entity.getMCenterClass();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                MCenterClassDto relationDto = (MCenterClassDto)cachedDto;
                dto.setMCenterClass(relationDto);
                if (reverseReference) {
                    relationDto.getMCenterClassDtlList().add(dto);
                }
            } else {
                MCenterClassDtoMapper mapper = new MCenterClassDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressMCenterClassDtlList();
                MCenterClassDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMCenterClass(relationDto);
                if (reverseReference) {
                    relationDto.getMCenterClassDtlList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMCenterClass());
                }
            }
        };
        if (!_suppressBDict && entity.getBDict() != null) {
            BDict relationEntity = entity.getBDict();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                BDictDto relationDto = (BDictDto)cachedDto;
                dto.setBDict(relationDto);
                if (reverseReference) {
                    relationDto.getMCenterClassDtlList().add(dto);
                }
            } else {
                BDictDtoMapper mapper = new BDictDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressMCenterClassDtlList();
                BDictDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setBDict(relationDto);
                if (reverseReference) {
                    relationDto.getMCenterClassDtlList().add(dto);
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
        if (!_suppressMCenterClassDtlSubAsOne && entity.getMCenterClassDtlSubAsOne() != null) {
            MCenterClassDtlSub relationEntity = entity.getMCenterClassDtlSubAsOne();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                MCenterClassDtlSubDto relationDto = (MCenterClassDtlSubDto)cachedDto;
                dto.setMCenterClassDtlSubAsOne(relationDto);
                if (reverseReference) {
                    relationDto.setMCenterClassDtl(dto);
                }
            } else {
                MCenterClassDtlSubDtoMapper mapper = new MCenterClassDtlSubDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressMCenterClassDtl();
                MCenterClassDtlSubDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMCenterClassDtlSubAsOne(relationDto);
                if (reverseReference) {
                    relationDto.setMCenterClassDtl(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getMCenterClassDtlSubAsOne());
                }
            }
        };
        if (!_suppressMCenterClassGrpDtlList && !entity.getMCenterClassGrpDtlList().isEmpty()) {
            MCenterClassGrpDtlDtoMapper mapper = new MCenterClassGrpDtlDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenterClassDtl();
            List<MCenterClassGrpDtlDto> relationDtoList = mapper.mappingToDtoList(entity.getMCenterClassGrpDtlList());
            dto.setMCenterClassGrpDtlList(relationDtoList);
            if (reverseReference) {
                for (MCenterClassGrpDtlDto relationDto : relationDtoList) {
                    relationDto.setMCenterClassDtl(dto);
                }
            }
        };
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<MCenterClassDtlDto> mappingToDtoList(List<MCenterClassDtl> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<MCenterClassDtlDto> dtoList = new ArrayList<MCenterClassDtlDto>();
        for (MCenterClassDtl entity : entityList) {
            MCenterClassDtlDto dto = mappingToDto(entity);
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
    public MCenterClassDtl mappingToEntity(MCenterClassDtlDto dto) {
        if (dto == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Object localKey = createInstanceKeyDto(dto, dto.instanceHash());
        Entity cachedLocalEntity = instanceCache ? _relationEntityMap.get(localKey) : null;
        if (cachedLocalEntity != null) {
            return (MCenterClassDtl)cachedLocalEntity;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        MCenterClassDtl entity = new MCenterClassDtl();
        if (needsMapping(dto, dto.getCenterClassDtlId(), "centerClassDtlId")) {
            entity.setCenterClassDtlId(dto.getCenterClassDtlId());
        }
        if (needsMapping(dto, dto.getCenterClassId(), "centerClassId")) {
            entity.setCenterClassId(dto.getCenterClassId());
        }
        if (needsMapping(dto, dto.getClassDtlCd(), "classDtlCd")) {
            entity.setClassDtlCd(dto.getClassDtlCd());
        }
        if (needsMapping(dto, dto.getDictId(), "dictId")) {
            entity.setDictId(dto.getDictId());
        }
        if (needsMapping(dto, dto.getViewOrder(), "viewOrder")) {
            entity.setViewOrder(dto.getViewOrder());
        }
        if (needsMapping(dto, dto.getDefaultFlg(), "defaultFlg")) {
            entity.setDefaultFlg(dto.getDefaultFlg());
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
        if (!_suppressMCenterClass && dto.getMCenterClass() != null) {
            MCenterClassDto relationDto = dto.getMCenterClass();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                MCenterClass relationEntity = (MCenterClass)cachedEntity;
                entity.setMCenterClass(relationEntity);
                if (reverseReference) {
                    relationEntity.getMCenterClassDtlList().add(entity);
                }
            } else {
                MCenterClassDtoMapper mapper = new MCenterClassDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressMCenterClassDtlList();
                MCenterClass relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMCenterClass(relationEntity);
                if (reverseReference) {
                    relationEntity.getMCenterClassDtlList().add(entity);
                }
                if (instanceCache && entity.getMCenterClass().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMCenterClass());
                }
            }
        };
        if (!_suppressBDict && dto.getBDict() != null) {
            BDictDto relationDto = dto.getBDict();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                BDict relationEntity = (BDict)cachedEntity;
                entity.setBDict(relationEntity);
                if (reverseReference) {
                    relationEntity.getMCenterClassDtlList().add(entity);
                }
            } else {
                BDictDtoMapper mapper = new BDictDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressMCenterClassDtlList();
                BDict relationEntity = mapper.mappingToEntity(relationDto);
                entity.setBDict(relationEntity);
                if (reverseReference) {
                    relationEntity.getMCenterClassDtlList().add(entity);
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
        if (!_suppressMCenterClassDtlSubAsOne && dto.getMCenterClassDtlSubAsOne() != null) {
            MCenterClassDtlSubDto relationDto = dto.getMCenterClassDtlSubAsOne();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                MCenterClassDtlSub relationEntity = (MCenterClassDtlSub)cachedEntity;
                entity.setMCenterClassDtlSubAsOne(relationEntity);
                if (reverseReference) {
                    relationEntity.setMCenterClassDtl(entity);
                }
            } else {
                MCenterClassDtlSubDtoMapper mapper = new MCenterClassDtlSubDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressMCenterClassDtl();
                MCenterClassDtlSub relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMCenterClassDtlSubAsOne(relationEntity);
                if (reverseReference) {
                    relationEntity.setMCenterClassDtl(entity);
                }
                if (instanceCache && entity.getMCenterClassDtlSubAsOne().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getMCenterClassDtlSubAsOne());
                }
            }
        };
        if (!_suppressMCenterClassGrpDtlList && !dto.getMCenterClassGrpDtlList().isEmpty()) {
            MCenterClassGrpDtlDtoMapper mapper = new MCenterClassGrpDtlDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMCenterClassDtl();
            List<MCenterClassGrpDtl> relationEntityList = mapper.mappingToEntityList(dto.getMCenterClassGrpDtlList());
            entity.setMCenterClassGrpDtlList(relationEntityList);
            if (reverseReference) {
                for (MCenterClassGrpDtl relationEntity : relationEntityList) {
                    relationEntity.setMCenterClassDtl(entity);
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
    protected boolean needsMapping(MCenterClassDtlDto dto, Object value, String propName) {
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
    public List<MCenterClassDtl> mappingToEntityList(List<MCenterClassDtlDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<MCenterClassDtl> entityList = new ArrayList<MCenterClassDtl>();
        for (MCenterClassDtlDto dto : dtoList) {
            MCenterClassDtl entity = mappingToEntity(dto);
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
    public void suppressMCenterClass() {
        _suppressMCenterClass = true;
    }
    public void suppressBDict() {
        _suppressBDict = true;
    }
    public void suppressVDict() {
        _suppressVDict = true;
    }
    public void suppressMCenterClassDtlSubAsOne() {
        _suppressMCenterClassDtlSubAsOne = true;
    }
    public void suppressMCenterClassGrpDtlList() {
        _suppressMCenterClassGrpDtlList = true;
    }
    protected void doSuppressAll() { // internal
        suppressMCenterClass();
        suppressBDict();
        suppressVDict();
        suppressMCenterClassDtlSubAsOne();
        suppressMCenterClassGrpDtlList();
    }
    protected void doSuppressClear() { // internal
        _suppressMCenterClass = false;
        _suppressBDict = false;
        _suppressVDict = false;
        _suppressMCenterClassDtlSubAsOne = false;
        _suppressMCenterClassGrpDtlList = false;
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
    public MCenterClassDtlDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (MCenterClassDtlDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public MCenterClassDtlDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (MCenterClassDtlDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public MCenterClassDtlDtoMapper reverseReference() {
        setReverseReference(true);
        return (MCenterClassDtlDtoMapper)this;
    }
}
