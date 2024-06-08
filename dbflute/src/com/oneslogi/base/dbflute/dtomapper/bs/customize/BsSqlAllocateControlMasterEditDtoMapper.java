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
 * The DTO mapper of SqlAllocateControlMasterEdit. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     MFPICKCTL_ID, PRODUCT_CD, PRODUCT_NM, PICKFRDATE, PICKTODATE, VALIDTYPE, PICKRANK1, PICKRANK2, PICKRANK3, PICKRANK4, PICKRANK5, UPD_DT, UPD_USER, CLIENT_CD, CLIENT_ID, CENTER_CD, CENTER_ID, VERSION_NO, DEL_FLG
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
public abstract class BsSqlAllocateControlMasterEditDtoMapper implements DtoMapper<SqlAllocateControlMasterEdit, SqlAllocateControlMasterEditDto>, Serializable {

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
    public BsSqlAllocateControlMasterEditDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsSqlAllocateControlMasterEditDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public SqlAllocateControlMasterEditDto mappingToDto(SqlAllocateControlMasterEdit entity) {
        if (entity == null) {
            return null;
        }
        SqlAllocateControlMasterEditDto dto = new SqlAllocateControlMasterEditDto();
        dto.setMfpickctlId(entity.getMfpickctlId());
        dto.setProductCd(entity.getProductCd());
        dto.setProductNm(entity.getProductNm());
        dto.setPickfrdate(entity.getPickfrdate());
        dto.setPicktodate(entity.getPicktodate());
        dto.setValidtype(entity.getValidtype());
        dto.setPickrank1(entity.getPickrank1());
        dto.setPickrank2(entity.getPickrank2());
        dto.setPickrank3(entity.getPickrank3());
        dto.setPickrank4(entity.getPickrank4());
        dto.setPickrank5(entity.getPickrank5());
        dto.setUpdDt(entity.getUpdDt());
        dto.setUpdUser(entity.getUpdUser());
        dto.setClientCd(entity.getClientCd());
        dto.setClientId(entity.getClientId());
        dto.setCenterCd(entity.getCenterCd());
        dto.setCenterId(entity.getCenterId());
        dto.setVersionNo(entity.getVersionNo());
        dto.setDelFlg(entity.getDelFlg());
        reflectDerivedProperty(entity, dto, true);
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<SqlAllocateControlMasterEditDto> mappingToDtoList(List<SqlAllocateControlMasterEdit> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<SqlAllocateControlMasterEditDto> dtoList = new ArrayList<SqlAllocateControlMasterEditDto>();
        for (SqlAllocateControlMasterEdit entity : entityList) {
            SqlAllocateControlMasterEditDto dto = mappingToDto(entity);
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
    public SqlAllocateControlMasterEdit mappingToEntity(SqlAllocateControlMasterEditDto dto) {
        if (dto == null) {
            return null;
        }
        SqlAllocateControlMasterEdit entity = new SqlAllocateControlMasterEdit();
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
        if (needsMapping(dto, dto.getPickrank1(), "pickrank1")) {
            entity.setPickrank1(dto.getPickrank1());
        }
        if (needsMapping(dto, dto.getPickrank2(), "pickrank2")) {
            entity.setPickrank2(dto.getPickrank2());
        }
        if (needsMapping(dto, dto.getPickrank3(), "pickrank3")) {
            entity.setPickrank3(dto.getPickrank3());
        }
        if (needsMapping(dto, dto.getPickrank4(), "pickrank4")) {
            entity.setPickrank4(dto.getPickrank4());
        }
        if (needsMapping(dto, dto.getPickrank5(), "pickrank5")) {
            entity.setPickrank5(dto.getPickrank5());
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
        if (needsMapping(dto, dto.getClientId(), "clientId")) {
            entity.setClientId(dto.getClientId());
        }
        if (needsMapping(dto, dto.getCenterCd(), "centerCd")) {
            entity.setCenterCd(dto.getCenterCd());
        }
        if (needsMapping(dto, dto.getCenterId(), "centerId")) {
            entity.setCenterId(dto.getCenterId());
        }
        if (needsMapping(dto, dto.getVersionNo(), "versionNo")) {
            entity.setVersionNo(dto.getVersionNo());
        }
        if (needsMapping(dto, dto.getDelFlg(), "delFlg")) {
            entity.setDelFlgAsDelFlg(CDef.DelFlg.codeOf(dto.getDelFlg()));
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
    protected boolean needsMapping(SqlAllocateControlMasterEditDto dto, Object value, String propName) {
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
    public List<SqlAllocateControlMasterEdit> mappingToEntityList(List<SqlAllocateControlMasterEditDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<SqlAllocateControlMasterEdit> entityList = new ArrayList<SqlAllocateControlMasterEdit>();
        for (SqlAllocateControlMasterEditDto dto : dtoList) {
            SqlAllocateControlMasterEdit entity = mappingToEntity(dto);
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
    public SqlAllocateControlMasterEditDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (SqlAllocateControlMasterEditDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public SqlAllocateControlMasterEditDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (SqlAllocateControlMasterEditDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public SqlAllocateControlMasterEditDtoMapper reverseReference() {
        setReverseReference(true);
        return (SqlAllocateControlMasterEditDtoMapper)this;
    }
}
