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
 * The DTO mapper of SqlMonthlyDesignChangeInfoMaster. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     PRODUCT_CD, PRODUCT_NM, SOTEDUNIT, SOTEDUNIT_NM, LIMITDATE, DESIGNFLG, DESIGNFLG_NM, SOTEDLOC, PICKLISTKEY, PICKLISTGNO, UPD_DT, UPD_USER, DEL_FLG, DEL_FLG_NM, MFMONTHCHG_ID, VERSION_NO, CENTER_ID, SORT
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
public abstract class BsSqlMonthlyDesignChangeInfoMasterDtoMapper implements DtoMapper<SqlMonthlyDesignChangeInfoMaster, SqlMonthlyDesignChangeInfoMasterDto>, Serializable {

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
    public BsSqlMonthlyDesignChangeInfoMasterDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsSqlMonthlyDesignChangeInfoMasterDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public SqlMonthlyDesignChangeInfoMasterDto mappingToDto(SqlMonthlyDesignChangeInfoMaster entity) {
        if (entity == null) {
            return null;
        }
        SqlMonthlyDesignChangeInfoMasterDto dto = new SqlMonthlyDesignChangeInfoMasterDto();
        dto.setProductCd(entity.getProductCd());
        dto.setProductNm(entity.getProductNm());
        dto.setSotedunit(entity.getSotedunit());
        dto.setSotedunitNm(entity.getSotedunitNm());
        dto.setLimitdate(entity.getLimitdate());
        dto.setDesignflg(entity.getDesignflg());
        dto.setDesignflgNm(entity.getDesignflgNm());
        dto.setSotedloc(entity.getSotedloc());
        dto.setPicklistkey(entity.getPicklistkey());
        dto.setPicklistgno(entity.getPicklistgno());
        dto.setUpdDt(entity.getUpdDt());
        dto.setUpdUser(entity.getUpdUser());
        dto.setDelFlg(entity.getDelFlg());
        dto.setDelFlgNm(entity.getDelFlgNm());
        dto.setMfmonthchgId(entity.getMfmonthchgId());
        dto.setVersionNo(entity.getVersionNo());
        dto.setCenterId(entity.getCenterId());
        dto.setSort(entity.getSort());
        reflectDerivedProperty(entity, dto, true);
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<SqlMonthlyDesignChangeInfoMasterDto> mappingToDtoList(List<SqlMonthlyDesignChangeInfoMaster> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<SqlMonthlyDesignChangeInfoMasterDto> dtoList = new ArrayList<SqlMonthlyDesignChangeInfoMasterDto>();
        for (SqlMonthlyDesignChangeInfoMaster entity : entityList) {
            SqlMonthlyDesignChangeInfoMasterDto dto = mappingToDto(entity);
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
    public SqlMonthlyDesignChangeInfoMaster mappingToEntity(SqlMonthlyDesignChangeInfoMasterDto dto) {
        if (dto == null) {
            return null;
        }
        SqlMonthlyDesignChangeInfoMaster entity = new SqlMonthlyDesignChangeInfoMaster();
        if (needsMapping(dto, dto.getProductCd(), "productCd")) {
            entity.setProductCd(dto.getProductCd());
        }
        if (needsMapping(dto, dto.getProductNm(), "productNm")) {
            entity.setProductNm(dto.getProductNm());
        }
        if (needsMapping(dto, dto.getSotedunit(), "sotedunit")) {
            entity.setSotedunit(dto.getSotedunit());
        }
        if (needsMapping(dto, dto.getSotedunitNm(), "sotedunitNm")) {
            entity.setSotedunitNm(dto.getSotedunitNm());
        }
        if (needsMapping(dto, dto.getLimitdate(), "limitdate")) {
            entity.setLimitdate(dto.getLimitdate());
        }
        if (needsMapping(dto, dto.getDesignflg(), "designflg")) {
            entity.setDesignflg(dto.getDesignflg());
        }
        if (needsMapping(dto, dto.getDesignflgNm(), "designflgNm")) {
            entity.setDesignflgNm(dto.getDesignflgNm());
        }
        if (needsMapping(dto, dto.getSotedloc(), "sotedloc")) {
            entity.setSotedloc(dto.getSotedloc());
        }
        if (needsMapping(dto, dto.getPicklistkey(), "picklistkey")) {
            entity.setPicklistkey(dto.getPicklistkey());
        }
        if (needsMapping(dto, dto.getPicklistgno(), "picklistgno")) {
            entity.setPicklistgno(dto.getPicklistgno());
        }
        if (needsMapping(dto, dto.getUpdDt(), "updDt")) {
            entity.setUpdDt(dto.getUpdDt());
        }
        if (needsMapping(dto, dto.getUpdUser(), "updUser")) {
            entity.setUpdUser(dto.getUpdUser());
        }
        if (needsMapping(dto, dto.getDelFlg(), "delFlg")) {
            entity.setDelFlgAsDelFlg(CDef.DelFlg.codeOf(dto.getDelFlg()));
        }
        if (needsMapping(dto, dto.getDelFlgNm(), "delFlgNm")) {
            entity.setDelFlgNm(dto.getDelFlgNm());
        }
        if (needsMapping(dto, dto.getMfmonthchgId(), "mfmonthchgId")) {
            entity.setMfmonthchgId(dto.getMfmonthchgId());
        }
        if (needsMapping(dto, dto.getVersionNo(), "versionNo")) {
            entity.setVersionNo(dto.getVersionNo());
        }
        if (needsMapping(dto, dto.getCenterId(), "centerId")) {
            entity.setCenterId(dto.getCenterId());
        }
        if (needsMapping(dto, dto.getSort(), "sort")) {
            entity.setSort(dto.getSort());
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
    protected boolean needsMapping(SqlMonthlyDesignChangeInfoMasterDto dto, Object value, String propName) {
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
    public List<SqlMonthlyDesignChangeInfoMaster> mappingToEntityList(List<SqlMonthlyDesignChangeInfoMasterDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<SqlMonthlyDesignChangeInfoMaster> entityList = new ArrayList<SqlMonthlyDesignChangeInfoMaster>();
        for (SqlMonthlyDesignChangeInfoMasterDto dto : dtoList) {
            SqlMonthlyDesignChangeInfoMaster entity = mappingToEntity(dto);
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
    public SqlMonthlyDesignChangeInfoMasterDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (SqlMonthlyDesignChangeInfoMasterDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public SqlMonthlyDesignChangeInfoMasterDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (SqlMonthlyDesignChangeInfoMasterDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public SqlMonthlyDesignChangeInfoMasterDtoMapper reverseReference() {
        setReverseReference(true);
        return (SqlMonthlyDesignChangeInfoMasterDtoMapper)this;
    }
}
