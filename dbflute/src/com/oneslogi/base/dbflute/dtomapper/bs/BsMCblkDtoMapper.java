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
 * The DTO mapper of M_CBLK as TABLE. <br>
 * ブロックマスタ
 * <pre>
 * [primary-key]
 *     CBLK_ID
 *
 * [column]
 *     CBLK_ID, CENTER_ID, BLKCD, BLKNM, SRDTLMKFG, AMINPFG, LBLMKFG, LBLDFG, BCDDFG, LOCIDFRNK, LOCIDFBRCTG1, LOCIDFBRCTG2, LOCIDFBRCTG3, LOCIDFBRCTG4, LOCIDFBRCTG5, LOCIDFBRCTG6, LOCIDFBRCTG7, LOCIDFBRCTG8, LOCIDFBRCTG9, LOCIDFBRCTG10, SFTPCLRSFID, TSNBOXRSFID, JTBOXRSFID, HDRDBOXRSFID, ODRDVRSFID, PKGRT, SPRPRSID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     CBLK_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     M_CENTER
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     mCenter
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsMCblkDtoMapper implements DtoMapper<MCblk, MCblkDto>, Serializable {

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

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMCblkDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsMCblkDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public MCblkDto mappingToDto(MCblk entity) {
        if (entity == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Entity localKey = createInstanceKeyEntity(entity);
        Object cachedLocalDto = instanceCache ? _relationDtoMap.get(localKey) : null;
        if (cachedLocalDto != null) {
            return (MCblkDto)cachedLocalDto;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        MCblkDto dto = new MCblkDto();
        dto.setCblkId(entity.getCblkId());
        dto.setCenterId(entity.getCenterId());
        dto.setBlkcd(entity.getBlkcd());
        dto.setBlknm(entity.getBlknm());
        dto.setSrdtlmkfg(entity.getSrdtlmkfg());
        dto.setAminpfg(entity.getAminpfg());
        dto.setLblmkfg(entity.getLblmkfg());
        dto.setLbldfg(entity.getLbldfg());
        dto.setBcddfg(entity.getBcddfg());
        dto.setLocidfrnk(entity.getLocidfrnk());
        dto.setLocidfbrctg1(entity.getLocidfbrctg1());
        dto.setLocidfbrctg2(entity.getLocidfbrctg2());
        dto.setLocidfbrctg3(entity.getLocidfbrctg3());
        dto.setLocidfbrctg4(entity.getLocidfbrctg4());
        dto.setLocidfbrctg5(entity.getLocidfbrctg5());
        dto.setLocidfbrctg6(entity.getLocidfbrctg6());
        dto.setLocidfbrctg7(entity.getLocidfbrctg7());
        dto.setLocidfbrctg8(entity.getLocidfbrctg8());
        dto.setLocidfbrctg9(entity.getLocidfbrctg9());
        dto.setLocidfbrctg10(entity.getLocidfbrctg10());
        dto.setSftpclrsfid(entity.getSftpclrsfid());
        dto.setTsnboxrsfid(entity.getTsnboxrsfid());
        dto.setJtboxrsfid(entity.getJtboxrsfid());
        dto.setHdrdboxrsfid(entity.getHdrdboxrsfid());
        dto.setOdrdvrsfid(entity.getOdrdvrsfid());
        dto.setPkgrt(entity.getPkgrt());
        dto.setSprprsid(entity.getSprprsid());
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
                    relationDto.getMCblkList().add(dto);
                }
            } else {
                MCenterDtoMapper mapper = new MCenterDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressMCblkList();
                MCenterDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setMCenter(relationDto);
                if (reverseReference) {
                    relationDto.getMCblkList().add(dto);
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
    public List<MCblkDto> mappingToDtoList(List<MCblk> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<MCblkDto> dtoList = new ArrayList<MCblkDto>();
        for (MCblk entity : entityList) {
            MCblkDto dto = mappingToDto(entity);
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
    public MCblk mappingToEntity(MCblkDto dto) {
        if (dto == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Object localKey = createInstanceKeyDto(dto, dto.instanceHash());
        Entity cachedLocalEntity = instanceCache ? _relationEntityMap.get(localKey) : null;
        if (cachedLocalEntity != null) {
            return (MCblk)cachedLocalEntity;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        MCblk entity = new MCblk();
        if (needsMapping(dto, dto.getCblkId(), "cblkId")) {
            entity.setCblkId(dto.getCblkId());
        }
        if (needsMapping(dto, dto.getCenterId(), "centerId")) {
            entity.setCenterId(dto.getCenterId());
        }
        if (needsMapping(dto, dto.getBlkcd(), "blkcd")) {
            entity.setBlkcd(dto.getBlkcd());
        }
        if (needsMapping(dto, dto.getBlknm(), "blknm")) {
            entity.setBlknm(dto.getBlknm());
        }
        if (needsMapping(dto, dto.getSrdtlmkfg(), "srdtlmkfg")) {
            entity.setSrdtlmkfg(dto.getSrdtlmkfg());
        }
        if (needsMapping(dto, dto.getAminpfg(), "aminpfg")) {
            entity.setAminpfg(dto.getAminpfg());
        }
        if (needsMapping(dto, dto.getLblmkfg(), "lblmkfg")) {
            entity.setLblmkfg(dto.getLblmkfg());
        }
        if (needsMapping(dto, dto.getLbldfg(), "lbldfg")) {
            entity.setLbldfg(dto.getLbldfg());
        }
        if (needsMapping(dto, dto.getBcddfg(), "bcddfg")) {
            entity.setBcddfg(dto.getBcddfg());
        }
        if (needsMapping(dto, dto.getLocidfrnk(), "locidfrnk")) {
            entity.setLocidfrnk(dto.getLocidfrnk());
        }
        if (needsMapping(dto, dto.getLocidfbrctg1(), "locidfbrctg1")) {
            entity.setLocidfbrctg1(dto.getLocidfbrctg1());
        }
        if (needsMapping(dto, dto.getLocidfbrctg2(), "locidfbrctg2")) {
            entity.setLocidfbrctg2(dto.getLocidfbrctg2());
        }
        if (needsMapping(dto, dto.getLocidfbrctg3(), "locidfbrctg3")) {
            entity.setLocidfbrctg3(dto.getLocidfbrctg3());
        }
        if (needsMapping(dto, dto.getLocidfbrctg4(), "locidfbrctg4")) {
            entity.setLocidfbrctg4(dto.getLocidfbrctg4());
        }
        if (needsMapping(dto, dto.getLocidfbrctg5(), "locidfbrctg5")) {
            entity.setLocidfbrctg5(dto.getLocidfbrctg5());
        }
        if (needsMapping(dto, dto.getLocidfbrctg6(), "locidfbrctg6")) {
            entity.setLocidfbrctg6(dto.getLocidfbrctg6());
        }
        if (needsMapping(dto, dto.getLocidfbrctg7(), "locidfbrctg7")) {
            entity.setLocidfbrctg7(dto.getLocidfbrctg7());
        }
        if (needsMapping(dto, dto.getLocidfbrctg8(), "locidfbrctg8")) {
            entity.setLocidfbrctg8(dto.getLocidfbrctg8());
        }
        if (needsMapping(dto, dto.getLocidfbrctg9(), "locidfbrctg9")) {
            entity.setLocidfbrctg9(dto.getLocidfbrctg9());
        }
        if (needsMapping(dto, dto.getLocidfbrctg10(), "locidfbrctg10")) {
            entity.setLocidfbrctg10(dto.getLocidfbrctg10());
        }
        if (needsMapping(dto, dto.getSftpclrsfid(), "sftpclrsfid")) {
            entity.setSftpclrsfid(dto.getSftpclrsfid());
        }
        if (needsMapping(dto, dto.getTsnboxrsfid(), "tsnboxrsfid")) {
            entity.setTsnboxrsfid(dto.getTsnboxrsfid());
        }
        if (needsMapping(dto, dto.getJtboxrsfid(), "jtboxrsfid")) {
            entity.setJtboxrsfid(dto.getJtboxrsfid());
        }
        if (needsMapping(dto, dto.getHdrdboxrsfid(), "hdrdboxrsfid")) {
            entity.setHdrdboxrsfid(dto.getHdrdboxrsfid());
        }
        if (needsMapping(dto, dto.getOdrdvrsfid(), "odrdvrsfid")) {
            entity.setOdrdvrsfid(dto.getOdrdvrsfid());
        }
        if (needsMapping(dto, dto.getPkgrt(), "pkgrt")) {
            entity.setPkgrt(dto.getPkgrt());
        }
        if (needsMapping(dto, dto.getSprprsid(), "sprprsid")) {
            entity.setSprprsid(dto.getSprprsid());
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
                    relationEntity.getMCblkList().add(entity);
                }
            } else {
                MCenterDtoMapper mapper = new MCenterDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressMCblkList();
                MCenter relationEntity = mapper.mappingToEntity(relationDto);
                entity.setMCenter(relationEntity);
                if (reverseReference) {
                    relationEntity.getMCblkList().add(entity);
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
    protected boolean needsMapping(MCblkDto dto, Object value, String propName) {
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
    public List<MCblk> mappingToEntityList(List<MCblkDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<MCblk> entityList = new ArrayList<MCblk>();
        for (MCblkDto dto : dtoList) {
            MCblk entity = mappingToEntity(dto);
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
    protected void doSuppressAll() { // internal
        suppressMCenter();
    }
    protected void doSuppressClear() { // internal
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
    public MCblkDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (MCblkDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public MCblkDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (MCblkDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public MCblkDtoMapper reverseReference() {
        setReverseReference(true);
        return (MCblkDtoMapper)this;
    }
}
