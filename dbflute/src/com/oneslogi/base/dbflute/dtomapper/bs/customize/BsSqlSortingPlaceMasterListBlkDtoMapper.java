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
 * The DTO mapper of SqlSortingPlaceMasterListBlk. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     BLKCD, BLKNM, LOCIDFRNK, LOCIDFRNK_NM, LOCIDFBRCTG1, LOCIDFBRCTG2, LOCIDFBRCTG3, LOCIDFBRCTG4, LOCIDFBRCTG5, LOCIDFBRCTG6, LOCIDFBRCTG7, LOCIDFBRCTG8, LOCIDFBRCTG9, LOCIDFBRCTG10, LOCIDFBRCTG, HDRDBOXRSFID, HDRDBOXRSFID_NM, PKGRT, SPRPRSID, SPRPRSID_NM, DEL_FLG, DEL_FLG_NM
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
 *
 * [version-no]
 *     
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
public abstract class BsSqlSortingPlaceMasterListBlkDtoMapper implements DtoMapper<SqlSortingPlaceMasterListBlk, SqlSortingPlaceMasterListBlkDto>, Serializable {

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
    public BsSqlSortingPlaceMasterListBlkDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsSqlSortingPlaceMasterListBlkDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public SqlSortingPlaceMasterListBlkDto mappingToDto(SqlSortingPlaceMasterListBlk entity) {
        if (entity == null) {
            return null;
        }
        SqlSortingPlaceMasterListBlkDto dto = new SqlSortingPlaceMasterListBlkDto();
        dto.setBlkcd(entity.getBlkcd());
        dto.setBlknm(entity.getBlknm());
        dto.setLocidfrnk(entity.getLocidfrnk());
        dto.setLocidfrnkNm(entity.getLocidfrnkNm());
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
        dto.setLocidfbrctg(entity.getLocidfbrctg());
        dto.setHdrdboxrsfid(entity.getHdrdboxrsfid());
        dto.setHdrdboxrsfidNm(entity.getHdrdboxrsfidNm());
        dto.setPkgrt(entity.getPkgrt());
        dto.setSprprsid(entity.getSprprsid());
        dto.setSprprsidNm(entity.getSprprsidNm());
        dto.setDelFlg(entity.getDelFlg());
        dto.setDelFlgNm(entity.getDelFlgNm());
        reflectDerivedProperty(entity, dto, true);
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<SqlSortingPlaceMasterListBlkDto> mappingToDtoList(List<SqlSortingPlaceMasterListBlk> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<SqlSortingPlaceMasterListBlkDto> dtoList = new ArrayList<SqlSortingPlaceMasterListBlkDto>();
        for (SqlSortingPlaceMasterListBlk entity : entityList) {
            SqlSortingPlaceMasterListBlkDto dto = mappingToDto(entity);
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
    public SqlSortingPlaceMasterListBlk mappingToEntity(SqlSortingPlaceMasterListBlkDto dto) {
        if (dto == null) {
            return null;
        }
        SqlSortingPlaceMasterListBlk entity = new SqlSortingPlaceMasterListBlk();
        if (needsMapping(dto, dto.getBlkcd(), "blkcd")) {
            entity.setBlkcd(dto.getBlkcd());
        }
        if (needsMapping(dto, dto.getBlknm(), "blknm")) {
            entity.setBlknm(dto.getBlknm());
        }
        if (needsMapping(dto, dto.getLocidfrnk(), "locidfrnk")) {
            entity.setLocidfrnk(dto.getLocidfrnk());
        }
        if (needsMapping(dto, dto.getLocidfrnkNm(), "locidfrnkNm")) {
            entity.setLocidfrnkNm(dto.getLocidfrnkNm());
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
        if (needsMapping(dto, dto.getLocidfbrctg(), "locidfbrctg")) {
            entity.setLocidfbrctg(dto.getLocidfbrctg());
        }
        if (needsMapping(dto, dto.getHdrdboxrsfid(), "hdrdboxrsfid")) {
            entity.setHdrdboxrsfid(dto.getHdrdboxrsfid());
        }
        if (needsMapping(dto, dto.getHdrdboxrsfidNm(), "hdrdboxrsfidNm")) {
            entity.setHdrdboxrsfidNm(dto.getHdrdboxrsfidNm());
        }
        if (needsMapping(dto, dto.getPkgrt(), "pkgrt")) {
            entity.setPkgrt(dto.getPkgrt());
        }
        if (needsMapping(dto, dto.getSprprsid(), "sprprsid")) {
            entity.setSprprsid(dto.getSprprsid());
        }
        if (needsMapping(dto, dto.getSprprsidNm(), "sprprsidNm")) {
            entity.setSprprsidNm(dto.getSprprsidNm());
        }
        if (needsMapping(dto, dto.getDelFlg(), "delFlg")) {
            entity.setDelFlgAsDelFlg(CDef.DelFlg.codeOf(dto.getDelFlg()));
        }
        if (needsMapping(dto, dto.getDelFlgNm(), "delFlgNm")) {
            entity.setDelFlgNm(dto.getDelFlgNm());
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
    protected boolean needsMapping(SqlSortingPlaceMasterListBlkDto dto, Object value, String propName) {
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
    public List<SqlSortingPlaceMasterListBlk> mappingToEntityList(List<SqlSortingPlaceMasterListBlkDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<SqlSortingPlaceMasterListBlk> entityList = new ArrayList<SqlSortingPlaceMasterListBlk>();
        for (SqlSortingPlaceMasterListBlkDto dto : dtoList) {
            SqlSortingPlaceMasterListBlk entity = mappingToEntity(dto);
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
    public SqlSortingPlaceMasterListBlkDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (SqlSortingPlaceMasterListBlkDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public SqlSortingPlaceMasterListBlkDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (SqlSortingPlaceMasterListBlkDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public SqlSortingPlaceMasterListBlkDtoMapper reverseReference() {
        setReverseReference(true);
        return (SqlSortingPlaceMasterListBlkDtoMapper)this;
    }
}
