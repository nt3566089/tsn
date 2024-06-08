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
import com.oneslogi.base.dbflute.exentity.customize.*;
import com.oneslogi.base.dbflute.dto.customize.*;
import com.oneslogi.base.dbflute.dtomapper.customize.*;

/**
 * The DTO mapper of SqlAllocateControlMasterList. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     MFPICKCTL_ID, PRODUCT_CD, PRODUCT_NM, PICKFRDATE, PICKTODATE, VALIDTYPE, VALIDTYPE_NM, PICKRANK1, PICKRANK1_NM, PICKRANK2, PICKRANK2_NM, PICKRANK3, PICKRANK3_NM, PICKRANK4, PICKRANK4_NM, PICKRANK5, PICKRANK5_NM, UPD_DT, UPD_USER, CLIENT_CD, CLIENT_NM, CLIENT_ID, CENTER_CD, CENTER_NM, VERSION_NO
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
public abstract class BsSqlAllocateControlMasterListDtoMapper implements DtoMapper<SqlAllocateControlMasterList, SqlAllocateControlMasterListDto>, Serializable {

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
    public BsSqlAllocateControlMasterListDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsSqlAllocateControlMasterListDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public SqlAllocateControlMasterListDto mappingToDto(SqlAllocateControlMasterList entity) {
        if (entity == null) {
            return null;
        }
        SqlAllocateControlMasterListDto dto = new SqlAllocateControlMasterListDto();
        dto.setMfpickctlId(entity.getMfpickctlId());
        dto.setProductCd(entity.getProductCd());
        dto.setProductNm(entity.getProductNm());
        dto.setPickfrdate(entity.getPickfrdate());
        dto.setPicktodate(entity.getPicktodate());
        dto.setValidtype(entity.getValidtype());
        dto.setValidtypeNm(entity.getValidtypeNm());
        dto.setPickrank1(entity.getPickrank1());
        dto.setPickrank1Nm(entity.getPickrank1Nm());
        dto.setPickrank2(entity.getPickrank2());
        dto.setPickrank2Nm(entity.getPickrank2Nm());
        dto.setPickrank3(entity.getPickrank3());
        dto.setPickrank3Nm(entity.getPickrank3Nm());
        dto.setPickrank4(entity.getPickrank4());
        dto.setPickrank4Nm(entity.getPickrank4Nm());
        dto.setPickrank5(entity.getPickrank5());
        dto.setPickrank5Nm(entity.getPickrank5Nm());
        dto.setUpdDt(entity.getUpdDt());
        dto.setUpdUser(entity.getUpdUser());
        dto.setClientCd(entity.getClientCd());
        dto.setClientNm(entity.getClientNm());
        dto.setClientId(entity.getClientId());
        dto.setCenterCd(entity.getCenterCd());
        dto.setCenterNm(entity.getCenterNm());
        dto.setVersionNo(entity.getVersionNo());
        reflectDerivedProperty(entity, dto, true);
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<SqlAllocateControlMasterListDto> mappingToDtoList(List<SqlAllocateControlMasterList> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<SqlAllocateControlMasterListDto> dtoList = new ArrayList<SqlAllocateControlMasterListDto>();
        for (SqlAllocateControlMasterList entity : entityList) {
            SqlAllocateControlMasterListDto dto = mappingToDto(entity);
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
    public SqlAllocateControlMasterList mappingToEntity(SqlAllocateControlMasterListDto dto) {
        if (dto == null) {
            return null;
        }
        SqlAllocateControlMasterList entity = new SqlAllocateControlMasterList();
        if (needsMapping(dto, dto.getMfpickctlId(), "mfpickctlId")) {
            entity.setMfpickctlId(dto.getMfpickctlId());
        }
        if (needsMapping(dto, dto.getProductCd(), "productCd")) {
            entity.setProductCd(dto.getProductCd());
        }
        if (needsMapping(dto, dto.getProductNm(), "productNm")) {
            entity.setProductNm(dto.getProductNm());
        }
        if (needsMapping(dto, dto.getPickfrdate(), "pickfrdate")) {
            entity.setPickfrdate(dto.getPickfrdate());
        }
        if (needsMapping(dto, dto.getPicktodate(), "picktodate")) {
            entity.setPicktodate(dto.getPicktodate());
        }
        if (needsMapping(dto, dto.getValidtype(), "validtype")) {
            entity.setValidtype(dto.getValidtype());
        }
        if (needsMapping(dto, dto.getValidtypeNm(), "validtypeNm")) {
            entity.setValidtypeNm(dto.getValidtypeNm());
        }
        if (needsMapping(dto, dto.getPickrank1(), "pickrank1")) {
            entity.setPickrank1(dto.getPickrank1());
        }
        if (needsMapping(dto, dto.getPickrank1Nm(), "pickrank1Nm")) {
            entity.setPickrank1Nm(dto.getPickrank1Nm());
        }
        if (needsMapping(dto, dto.getPickrank2(), "pickrank2")) {
            entity.setPickrank2(dto.getPickrank2());
        }
        if (needsMapping(dto, dto.getPickrank2Nm(), "pickrank2Nm")) {
            entity.setPickrank2Nm(dto.getPickrank2Nm());
        }
        if (needsMapping(dto, dto.getPickrank3(), "pickrank3")) {
            entity.setPickrank3(dto.getPickrank3());
        }
        if (needsMapping(dto, dto.getPickrank3Nm(), "pickrank3Nm")) {
            entity.setPickrank3Nm(dto.getPickrank3Nm());
        }
        if (needsMapping(dto, dto.getPickrank4(), "pickrank4")) {
            entity.setPickrank4(dto.getPickrank4());
        }
        if (needsMapping(dto, dto.getPickrank4Nm(), "pickrank4Nm")) {
            entity.setPickrank4Nm(dto.getPickrank4Nm());
        }
        if (needsMapping(dto, dto.getPickrank5(), "pickrank5")) {
            entity.setPickrank5(dto.getPickrank5());
        }
        if (needsMapping(dto, dto.getPickrank5Nm(), "pickrank5Nm")) {
            entity.setPickrank5Nm(dto.getPickrank5Nm());
        }
        if (needsMapping(dto, dto.getUpdDt(), "updDt")) {
            entity.setUpdDt(dto.getUpdDt());
        }
        if (needsMapping(dto, dto.getUpdUser(), "updUser")) {
            entity.setUpdUser(dto.getUpdUser());
        }
        if (needsMapping(dto, dto.getClientCd(), "clientCd")) {
            entity.setClientCd(dto.getClientCd());
        }
        if (needsMapping(dto, dto.getClientNm(), "clientNm")) {
            entity.setClientNm(dto.getClientNm());
        }
        if (needsMapping(dto, dto.getClientId(), "clientId")) {
            entity.setClientId(dto.getClientId());
        }
        if (needsMapping(dto, dto.getCenterCd(), "centerCd")) {
            entity.setCenterCd(dto.getCenterCd());
        }
        if (needsMapping(dto, dto.getCenterNm(), "centerNm")) {
            entity.setCenterNm(dto.getCenterNm());
        }
        if (needsMapping(dto, dto.getVersionNo(), "versionNo")) {
            entity.setVersionNo(dto.getVersionNo());
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
    protected boolean needsMapping(SqlAllocateControlMasterListDto dto, Object value, String propName) {
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
    public List<SqlAllocateControlMasterList> mappingToEntityList(List<SqlAllocateControlMasterListDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<SqlAllocateControlMasterList> entityList = new ArrayList<SqlAllocateControlMasterList>();
        for (SqlAllocateControlMasterListDto dto : dtoList) {
            SqlAllocateControlMasterList entity = mappingToEntity(dto);
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
    public SqlAllocateControlMasterListDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (SqlAllocateControlMasterListDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public SqlAllocateControlMasterListDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (SqlAllocateControlMasterListDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public SqlAllocateControlMasterListDtoMapper reverseReference() {
        setReverseReference(true);
        return (SqlAllocateControlMasterListDtoMapper)this;
    }
}
