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
 * The DTO mapper of T_PIC_MTHD_RCMD_CART as TABLE. <br>
 * ピッキング提案台車
 * <pre>
 * [primary-key]
 *     PIC_MTHD_RCMD_CART_ID
 *
 * [column]
 *     PIC_MTHD_RCMD_CART_ID, PACKING_H_ID, CART_NO, PIC_MTHD_RCMD_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PIC_MTHD_RCMD_CART_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     T_PIC_MTHD_RCMD, T_PACKING_H
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     tPicMthdRcmd, tPackingH
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsTPicMthdRcmdCartDtoMapper implements DtoMapper<TPicMthdRcmdCart, TPicMthdRcmdCartDto>, Serializable {

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
    protected boolean _suppressTPicMthdRcmd;
    protected boolean _suppressTPackingH;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTPicMthdRcmdCartDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsTPicMthdRcmdCartDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public TPicMthdRcmdCartDto mappingToDto(TPicMthdRcmdCart entity) {
        if (entity == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Entity localKey = createInstanceKeyEntity(entity);
        Object cachedLocalDto = instanceCache ? _relationDtoMap.get(localKey) : null;
        if (cachedLocalDto != null) {
            return (TPicMthdRcmdCartDto)cachedLocalDto;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        TPicMthdRcmdCartDto dto = new TPicMthdRcmdCartDto();
        dto.setPicMthdRcmdCartId(entity.getPicMthdRcmdCartId());
        dto.setPackingHId(entity.getPackingHId());
        dto.setCartNo(entity.getCartNo());
        dto.setPicMthdRcmdId(entity.getPicMthdRcmdId());
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
        if (!_suppressTPicMthdRcmd && entity.getTPicMthdRcmd() != null) {
            TPicMthdRcmd relationEntity = entity.getTPicMthdRcmd();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                TPicMthdRcmdDto relationDto = (TPicMthdRcmdDto)cachedDto;
                dto.setTPicMthdRcmd(relationDto);
                if (reverseReference) {
                    relationDto.getTPicMthdRcmdCartList().add(dto);
                }
            } else {
                TPicMthdRcmdDtoMapper mapper = new TPicMthdRcmdDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTPicMthdRcmdCartList();
                TPicMthdRcmdDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setTPicMthdRcmd(relationDto);
                if (reverseReference) {
                    relationDto.getTPicMthdRcmdCartList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getTPicMthdRcmd());
                }
            }
        };
        if (!_suppressTPackingH && entity.getTPackingH() != null) {
            TPackingH relationEntity = entity.getTPackingH();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                TPackingHDto relationDto = (TPackingHDto)cachedDto;
                dto.setTPackingH(relationDto);
                if (reverseReference) {
                    relationDto.getTPicMthdRcmdCartList().add(dto);
                }
            } else {
                TPackingHDtoMapper mapper = new TPackingHDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTPicMthdRcmdCartList();
                TPackingHDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setTPackingH(relationDto);
                if (reverseReference) {
                    relationDto.getTPicMthdRcmdCartList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getTPackingH());
                }
            }
        };
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<TPicMthdRcmdCartDto> mappingToDtoList(List<TPicMthdRcmdCart> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<TPicMthdRcmdCartDto> dtoList = new ArrayList<TPicMthdRcmdCartDto>();
        for (TPicMthdRcmdCart entity : entityList) {
            TPicMthdRcmdCartDto dto = mappingToDto(entity);
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
    public TPicMthdRcmdCart mappingToEntity(TPicMthdRcmdCartDto dto) {
        if (dto == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Object localKey = createInstanceKeyDto(dto, dto.instanceHash());
        Entity cachedLocalEntity = instanceCache ? _relationEntityMap.get(localKey) : null;
        if (cachedLocalEntity != null) {
            return (TPicMthdRcmdCart)cachedLocalEntity;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        TPicMthdRcmdCart entity = new TPicMthdRcmdCart();
        if (needsMapping(dto, dto.getPicMthdRcmdCartId(), "picMthdRcmdCartId")) {
            entity.setPicMthdRcmdCartId(dto.getPicMthdRcmdCartId());
        }
        if (needsMapping(dto, dto.getPackingHId(), "packingHId")) {
            entity.setPackingHId(dto.getPackingHId());
        }
        if (needsMapping(dto, dto.getCartNo(), "cartNo")) {
            entity.setCartNo(dto.getCartNo());
        }
        if (needsMapping(dto, dto.getPicMthdRcmdId(), "picMthdRcmdId")) {
            entity.setPicMthdRcmdId(dto.getPicMthdRcmdId());
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
        if (!_suppressTPicMthdRcmd && dto.getTPicMthdRcmd() != null) {
            TPicMthdRcmdDto relationDto = dto.getTPicMthdRcmd();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                TPicMthdRcmd relationEntity = (TPicMthdRcmd)cachedEntity;
                entity.setTPicMthdRcmd(relationEntity);
                if (reverseReference) {
                    relationEntity.getTPicMthdRcmdCartList().add(entity);
                }
            } else {
                TPicMthdRcmdDtoMapper mapper = new TPicMthdRcmdDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTPicMthdRcmdCartList();
                TPicMthdRcmd relationEntity = mapper.mappingToEntity(relationDto);
                entity.setTPicMthdRcmd(relationEntity);
                if (reverseReference) {
                    relationEntity.getTPicMthdRcmdCartList().add(entity);
                }
                if (instanceCache && entity.getTPicMthdRcmd().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getTPicMthdRcmd());
                }
            }
        };
        if (!_suppressTPackingH && dto.getTPackingH() != null) {
            TPackingHDto relationDto = dto.getTPackingH();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                TPackingH relationEntity = (TPackingH)cachedEntity;
                entity.setTPackingH(relationEntity);
                if (reverseReference) {
                    relationEntity.getTPicMthdRcmdCartList().add(entity);
                }
            } else {
                TPackingHDtoMapper mapper = new TPackingHDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressTPicMthdRcmdCartList();
                TPackingH relationEntity = mapper.mappingToEntity(relationDto);
                entity.setTPackingH(relationEntity);
                if (reverseReference) {
                    relationEntity.getTPicMthdRcmdCartList().add(entity);
                }
                if (instanceCache && entity.getTPackingH().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getTPackingH());
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
    protected boolean needsMapping(TPicMthdRcmdCartDto dto, Object value, String propName) {
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
    public List<TPicMthdRcmdCart> mappingToEntityList(List<TPicMthdRcmdCartDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<TPicMthdRcmdCart> entityList = new ArrayList<TPicMthdRcmdCart>();
        for (TPicMthdRcmdCartDto dto : dtoList) {
            TPicMthdRcmdCart entity = mappingToEntity(dto);
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
    public void suppressTPicMthdRcmd() {
        _suppressTPicMthdRcmd = true;
    }
    public void suppressTPackingH() {
        _suppressTPackingH = true;
    }
    protected void doSuppressAll() { // internal
        suppressTPicMthdRcmd();
        suppressTPackingH();
    }
    protected void doSuppressClear() { // internal
        _suppressTPicMthdRcmd = false;
        _suppressTPackingH = false;
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
    public TPicMthdRcmdCartDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (TPicMthdRcmdCartDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public TPicMthdRcmdCartDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (TPicMthdRcmdCartDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public TPicMthdRcmdCartDtoMapper reverseReference() {
        setReverseReference(true);
        return (TPicMthdRcmdCartDtoMapper)this;
    }
}
