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
 * The DTO mapper of SqlReceiveDesignMasterList. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     MFRCVDESIGN_ID, PRODUCT_CD, PRODUCT_NM, RCVFRDATE, RCVTODATE, VALIDTYPE, VALID_TYPE_NM, DISTRIBUTIONCD, DISTRIBUTION_CD_NM, DESIGNFLG, DESIGN_FLG_NM, DEL_FLG, DEL_FLG_NM, ADD_DT, ADD_USER, UPD_DT, UPD_USER, USERNUM3
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
public abstract class BsSqlReceiveDesignMasterListDtoMapper implements DtoMapper<SqlReceiveDesignMasterList, SqlReceiveDesignMasterListDto>, Serializable {

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
    public BsSqlReceiveDesignMasterListDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsSqlReceiveDesignMasterListDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public SqlReceiveDesignMasterListDto mappingToDto(SqlReceiveDesignMasterList entity) {
        if (entity == null) {
            return null;
        }
        SqlReceiveDesignMasterListDto dto = new SqlReceiveDesignMasterListDto();
        dto.setMfrcvdesignId(entity.getMfrcvdesignId());
        dto.setProductCd(entity.getProductCd());
        dto.setProductNm(entity.getProductNm());
        dto.setRcvfrdate(entity.getRcvfrdate());
        dto.setRcvtodate(entity.getRcvtodate());
        dto.setValidtype(entity.getValidtype());
        dto.setValidTypeNm(entity.getValidTypeNm());
        dto.setDistributioncd(entity.getDistributioncd());
        dto.setDistributionCdNm(entity.getDistributionCdNm());
        dto.setDesignflg(entity.getDesignflg());
        dto.setDesignFlgNm(entity.getDesignFlgNm());
        dto.setDelFlg(entity.getDelFlg());
        dto.setDelFlgNm(entity.getDelFlgNm());
        dto.setAddDt(entity.getAddDt());
        dto.setAddUser(entity.getAddUser());
        dto.setUpdDt(entity.getUpdDt());
        dto.setUpdUser(entity.getUpdUser());
        dto.setUsernum3(entity.getUsernum3());
        reflectDerivedProperty(entity, dto, true);
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<SqlReceiveDesignMasterListDto> mappingToDtoList(List<SqlReceiveDesignMasterList> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<SqlReceiveDesignMasterListDto> dtoList = new ArrayList<SqlReceiveDesignMasterListDto>();
        for (SqlReceiveDesignMasterList entity : entityList) {
            SqlReceiveDesignMasterListDto dto = mappingToDto(entity);
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
    public SqlReceiveDesignMasterList mappingToEntity(SqlReceiveDesignMasterListDto dto) {
        if (dto == null) {
            return null;
        }
        SqlReceiveDesignMasterList entity = new SqlReceiveDesignMasterList();
        if (needsMapping(dto, dto.getMfrcvdesignId(), "mfrcvdesignId")) {
            entity.setMfrcvdesignId(dto.getMfrcvdesignId());
        }
        if (needsMapping(dto, dto.getProductCd(), "productCd")) {
            entity.setProductCd(dto.getProductCd());
        }
        if (needsMapping(dto, dto.getProductNm(), "productNm")) {
            entity.setProductNm(dto.getProductNm());
        }
        if (needsMapping(dto, dto.getRcvfrdate(), "rcvfrdate")) {
            entity.setRcvfrdate(dto.getRcvfrdate());
        }
        if (needsMapping(dto, dto.getRcvtodate(), "rcvtodate")) {
            entity.setRcvtodate(dto.getRcvtodate());
        }
        if (needsMapping(dto, dto.getValidtype(), "validtype")) {
            entity.setValidtype(dto.getValidtype());
        }
        if (needsMapping(dto, dto.getValidTypeNm(), "validTypeNm")) {
            entity.setValidTypeNm(dto.getValidTypeNm());
        }
        if (needsMapping(dto, dto.getDistributioncd(), "distributioncd")) {
            entity.setDistributioncd(dto.getDistributioncd());
        }
        if (needsMapping(dto, dto.getDistributionCdNm(), "distributionCdNm")) {
            entity.setDistributionCdNm(dto.getDistributionCdNm());
        }
        if (needsMapping(dto, dto.getDesignflg(), "designflg")) {
            entity.setDesignflg(dto.getDesignflg());
        }
        if (needsMapping(dto, dto.getDesignFlgNm(), "designFlgNm")) {
            entity.setDesignFlgNm(dto.getDesignFlgNm());
        }
        if (needsMapping(dto, dto.getDelFlg(), "delFlg")) {
            entity.setDelFlgAsDelFlg(CDef.DelFlg.codeOf(dto.getDelFlg()));
        }
        if (needsMapping(dto, dto.getDelFlgNm(), "delFlgNm")) {
            entity.setDelFlgNm(dto.getDelFlgNm());
        }
        if (needsMapping(dto, dto.getAddDt(), "addDt")) {
            entity.setAddDt(dto.getAddDt());
        }
        if (needsMapping(dto, dto.getAddUser(), "addUser")) {
            entity.setAddUser(dto.getAddUser());
        }
        if (needsMapping(dto, dto.getUpdDt(), "updDt")) {
            entity.setUpdDt(dto.getUpdDt());
        }
        if (needsMapping(dto, dto.getUpdUser(), "updUser")) {
            entity.setUpdUser(dto.getUpdUser());
        }
        if (needsMapping(dto, dto.getUsernum3(), "usernum3")) {
            entity.setUsernum3(dto.getUsernum3());
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
    protected boolean needsMapping(SqlReceiveDesignMasterListDto dto, Object value, String propName) {
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
    public List<SqlReceiveDesignMasterList> mappingToEntityList(List<SqlReceiveDesignMasterListDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<SqlReceiveDesignMasterList> entityList = new ArrayList<SqlReceiveDesignMasterList>();
        for (SqlReceiveDesignMasterListDto dto : dtoList) {
            SqlReceiveDesignMasterList entity = mappingToEntity(dto);
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
    public SqlReceiveDesignMasterListDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (SqlReceiveDesignMasterListDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public SqlReceiveDesignMasterListDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (SqlReceiveDesignMasterListDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public SqlReceiveDesignMasterListDtoMapper reverseReference() {
        setReverseReference(true);
        return (SqlReceiveDesignMasterListDtoMapper)this;
    }
}
