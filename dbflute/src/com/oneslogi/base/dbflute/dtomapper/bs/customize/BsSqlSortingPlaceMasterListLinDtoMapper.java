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
 * The DTO mapper of SqlSortingPlaceMasterListLin. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     LINCD, LINNM, LINBLK1, LINBLK2, LINBLK3, HDRDBOXRSFID, HDRDBOXRSFID_NM, PKGRT, SPRPRSID, SPRPRSID_NM, DEL_FLG, DEL_FLG_NM
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
public abstract class BsSqlSortingPlaceMasterListLinDtoMapper implements DtoMapper<SqlSortingPlaceMasterListLin, SqlSortingPlaceMasterListLinDto>, Serializable {

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
    public BsSqlSortingPlaceMasterListLinDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsSqlSortingPlaceMasterListLinDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public SqlSortingPlaceMasterListLinDto mappingToDto(SqlSortingPlaceMasterListLin entity) {
        if (entity == null) {
            return null;
        }
        SqlSortingPlaceMasterListLinDto dto = new SqlSortingPlaceMasterListLinDto();
        dto.setLincd(entity.getLincd());
        dto.setLinnm(entity.getLinnm());
        dto.setLinblk1(entity.getLinblk1());
        dto.setLinblk2(entity.getLinblk2());
        dto.setLinblk3(entity.getLinblk3());
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
    public List<SqlSortingPlaceMasterListLinDto> mappingToDtoList(List<SqlSortingPlaceMasterListLin> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<SqlSortingPlaceMasterListLinDto> dtoList = new ArrayList<SqlSortingPlaceMasterListLinDto>();
        for (SqlSortingPlaceMasterListLin entity : entityList) {
            SqlSortingPlaceMasterListLinDto dto = mappingToDto(entity);
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
    public SqlSortingPlaceMasterListLin mappingToEntity(SqlSortingPlaceMasterListLinDto dto) {
        if (dto == null) {
            return null;
        }
        SqlSortingPlaceMasterListLin entity = new SqlSortingPlaceMasterListLin();
        if (needsMapping(dto, dto.getLincd(), "lincd")) {
            entity.setLincd(dto.getLincd());
        }
        if (needsMapping(dto, dto.getLinnm(), "linnm")) {
            entity.setLinnm(dto.getLinnm());
        }
        if (needsMapping(dto, dto.getLinblk1(), "linblk1")) {
            entity.setLinblk1(dto.getLinblk1());
        }
        if (needsMapping(dto, dto.getLinblk2(), "linblk2")) {
            entity.setLinblk2(dto.getLinblk2());
        }
        if (needsMapping(dto, dto.getLinblk3(), "linblk3")) {
            entity.setLinblk3(dto.getLinblk3());
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
    protected boolean needsMapping(SqlSortingPlaceMasterListLinDto dto, Object value, String propName) {
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
    public List<SqlSortingPlaceMasterListLin> mappingToEntityList(List<SqlSortingPlaceMasterListLinDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<SqlSortingPlaceMasterListLin> entityList = new ArrayList<SqlSortingPlaceMasterListLin>();
        for (SqlSortingPlaceMasterListLinDto dto : dtoList) {
            SqlSortingPlaceMasterListLin entity = mappingToEntity(dto);
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
    public SqlSortingPlaceMasterListLinDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (SqlSortingPlaceMasterListLinDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public SqlSortingPlaceMasterListLinDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (SqlSortingPlaceMasterListLinDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public SqlSortingPlaceMasterListLinDtoMapper reverseReference() {
        setReverseReference(true);
        return (SqlSortingPlaceMasterListLinDtoMapper)this;
    }
}
