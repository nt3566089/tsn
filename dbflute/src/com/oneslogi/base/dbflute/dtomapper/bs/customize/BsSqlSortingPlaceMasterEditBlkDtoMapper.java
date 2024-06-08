package com.oneslogi.base.dbflute.dtomapper.bs.customize;

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
import com.oneslogi.base.dbflute.exentity.customize.*;
import com.oneslogi.base.dbflute.dto.customize.*;
import com.oneslogi.base.dbflute.dtomapper.customize.*;

/**
 * The DTO mapper of SqlSortingPlaceMasterEditBlk. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     CBLK_ID, BLKCD, BLKNM, LOCIDFRNK, VERSION_NO, LOCIDFBRCTG1, LOCIDFBRCTG2, LOCIDFBRCTG3, LOCIDFBRCTG4, LOCIDFBRCTG5, LOCIDFBRCTG6, LOCIDFBRCTG7, LOCIDFBRCTG8, LOCIDFBRCTG9, LOCIDFBRCTG10, HDRDBOXRSFID, PKGRT, SPRPRSID, DEL_FLG, CENTER_ID
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsSqlSortingPlaceMasterEditBlkDtoMapper implements DtoMapper<SqlSortingPlaceMasterEditBlk, SqlSortingPlaceMasterEditBlkDto>, Serializable {

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

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsSqlSortingPlaceMasterEditBlkDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsSqlSortingPlaceMasterEditBlkDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public SqlSortingPlaceMasterEditBlkDto mappingToDto(SqlSortingPlaceMasterEditBlk entity) {
        if (entity == null) {
            return null;
        }
        SqlSortingPlaceMasterEditBlkDto dto = new SqlSortingPlaceMasterEditBlkDto();
        dto.setCblkId(entity.getCblkId());
        dto.setBlkcd(entity.getBlkcd());
        dto.setBlknm(entity.getBlknm());
        dto.setLocidfrnk(entity.getLocidfrnk());
        dto.setVersionNo(entity.getVersionNo());
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
        dto.setHdrdboxrsfid(entity.getHdrdboxrsfid());
        dto.setPkgrt(entity.getPkgrt());
        dto.setSprprsid(entity.getSprprsid());
        dto.setDelFlg(entity.getDelFlg());
        dto.setCenterId(entity.getCenterId());
        reflectDerivedProperty(entity, dto, true);
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<SqlSortingPlaceMasterEditBlkDto> mappingToDtoList(List<SqlSortingPlaceMasterEditBlk> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<SqlSortingPlaceMasterEditBlkDto> dtoList = new ArrayList<SqlSortingPlaceMasterEditBlkDto>();
        for (SqlSortingPlaceMasterEditBlk entity : entityList) {
            SqlSortingPlaceMasterEditBlkDto dto = mappingToDto(entity);
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
    public SqlSortingPlaceMasterEditBlk mappingToEntity(SqlSortingPlaceMasterEditBlkDto dto) {
        if (dto == null) {
            return null;
        }
        SqlSortingPlaceMasterEditBlk entity = new SqlSortingPlaceMasterEditBlk();
        if (needsMapping(dto, dto.getCblkId(), "cblkId")) {
            entity.setCblkId(dto.getCblkId());
        }
        if (needsMapping(dto, dto.getBlkcd(), "blkcd")) {
            entity.setBlkcd(dto.getBlkcd());
        }
        if (needsMapping(dto, dto.getBlknm(), "blknm")) {
            entity.setBlknm(dto.getBlknm());
        }
        if (needsMapping(dto, dto.getLocidfrnk(), "locidfrnk")) {
            entity.setLocidfrnk(dto.getLocidfrnk());
        }
        if (needsMapping(dto, dto.getVersionNo(), "versionNo")) {
            entity.setVersionNo(dto.getVersionNo());
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
        if (needsMapping(dto, dto.getHdrdboxrsfid(), "hdrdboxrsfid")) {
            entity.setHdrdboxrsfid(dto.getHdrdboxrsfid());
        }
        if (needsMapping(dto, dto.getPkgrt(), "pkgrt")) {
            entity.setPkgrt(dto.getPkgrt());
        }
        if (needsMapping(dto, dto.getSprprsid(), "sprprsid")) {
            entity.setSprprsid(dto.getSprprsid());
        }
        if (needsMapping(dto, dto.getDelFlg(), "delFlg")) {
            entity.setDelFlgAsDelFlg(CDef.DelFlg.codeOf(dto.getDelFlg()));
        }
        if (needsMapping(dto, dto.getCenterId(), "centerId")) {
            entity.setCenterId(dto.getCenterId());
        }
        reflectDerivedProperty(entity, dto, false);
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
    protected boolean needsMapping(SqlSortingPlaceMasterEditBlkDto dto, Object value, String propName) {
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
    public List<SqlSortingPlaceMasterEditBlk> mappingToEntityList(List<SqlSortingPlaceMasterEditBlkDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<SqlSortingPlaceMasterEditBlk> entityList = new ArrayList<SqlSortingPlaceMasterEditBlk>();
        for (SqlSortingPlaceMasterEditBlkDto dto : dtoList) {
            SqlSortingPlaceMasterEditBlk entity = mappingToEntity(dto);
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
    protected void doSuppressAll() { // internal
    }
    protected void doSuppressClear() { // internal
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
    public SqlSortingPlaceMasterEditBlkDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (SqlSortingPlaceMasterEditBlkDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public SqlSortingPlaceMasterEditBlkDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (SqlSortingPlaceMasterEditBlkDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public SqlSortingPlaceMasterEditBlkDtoMapper reverseReference() {
        setReverseReference(true);
        return (SqlSortingPlaceMasterEditBlkDtoMapper)this;
    }
}
