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
 * The DTO mapper of SqlInstKeyList. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     INVENTORY_INST_KBN, INVENTORY_KEY, INVENTORY_DT, PRODUCT_DIVISION, LINE_BLOCK, DIRECTIONAL_PISTON, LOCATION_GRP, LOCATION_CD, FROM_LOCATION_CD, TO_LOCATION_CD, PRODUCT_CD, PRODUCT_NM, INVENTORY_INST_KBN_NM, PRODUCT_DIVISION_NM, LOCATION_GRP_NM, CLIENT_CD, CLIENT_NM, CENTER_CD, CENTER_NM
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
public abstract class BsSqlInstKeyListDtoMapper implements DtoMapper<SqlInstKeyList, SqlInstKeyListDto>, Serializable {

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
    public BsSqlInstKeyListDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsSqlInstKeyListDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public SqlInstKeyListDto mappingToDto(SqlInstKeyList entity) {
        if (entity == null) {
            return null;
        }
        SqlInstKeyListDto dto = new SqlInstKeyListDto();
        dto.setInventoryInstKbn(entity.getInventoryInstKbn());
        dto.setInventoryKey(entity.getInventoryKey());
        dto.setInventoryDt(entity.getInventoryDt());
        dto.setProductDivision(entity.getProductDivision());
        dto.setLineBlock(entity.getLineBlock());
        dto.setDirectionalPiston(entity.getDirectionalPiston());
        dto.setLocationGrp(entity.getLocationGrp());
        dto.setLocationCd(entity.getLocationCd());
        dto.setFromLocationCd(entity.getFromLocationCd());
        dto.setToLocationCd(entity.getToLocationCd());
        dto.setProductCd(entity.getProductCd());
        dto.setProductNm(entity.getProductNm());
        dto.setInventoryInstKbnNm(entity.getInventoryInstKbnNm());
        dto.setProductDivisionNm(entity.getProductDivisionNm());
        dto.setLocationGrpNm(entity.getLocationGrpNm());
        dto.setClientCd(entity.getClientCd());
        dto.setClientNm(entity.getClientNm());
        dto.setCenterCd(entity.getCenterCd());
        dto.setCenterNm(entity.getCenterNm());
        reflectDerivedProperty(entity, dto, true);
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<SqlInstKeyListDto> mappingToDtoList(List<SqlInstKeyList> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<SqlInstKeyListDto> dtoList = new ArrayList<SqlInstKeyListDto>();
        for (SqlInstKeyList entity : entityList) {
            SqlInstKeyListDto dto = mappingToDto(entity);
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
    public SqlInstKeyList mappingToEntity(SqlInstKeyListDto dto) {
        if (dto == null) {
            return null;
        }
        SqlInstKeyList entity = new SqlInstKeyList();
        if (needsMapping(dto, dto.getInventoryInstKbn(), "inventoryInstKbn")) {
            entity.setInventoryInstKbn(dto.getInventoryInstKbn());
        }
        if (needsMapping(dto, dto.getInventoryKey(), "inventoryKey")) {
            entity.setInventoryKey(dto.getInventoryKey());
        }
        if (needsMapping(dto, dto.getInventoryDt(), "inventoryDt")) {
            entity.setInventoryDt(dto.getInventoryDt());
        }
        if (needsMapping(dto, dto.getProductDivision(), "productDivision")) {
            entity.setProductDivision(dto.getProductDivision());
        }
        if (needsMapping(dto, dto.getLineBlock(), "lineBlock")) {
            entity.setLineBlock(dto.getLineBlock());
        }
        if (needsMapping(dto, dto.getDirectionalPiston(), "directionalPiston")) {
            entity.setDirectionalPiston(dto.getDirectionalPiston());
        }
        if (needsMapping(dto, dto.getLocationGrp(), "locationGrp")) {
            entity.setLocationGrp(dto.getLocationGrp());
        }
        if (needsMapping(dto, dto.getLocationCd(), "locationCd")) {
            entity.setLocationCd(dto.getLocationCd());
        }
        if (needsMapping(dto, dto.getFromLocationCd(), "fromLocationCd")) {
            entity.setFromLocationCd(dto.getFromLocationCd());
        }
        if (needsMapping(dto, dto.getToLocationCd(), "toLocationCd")) {
            entity.setToLocationCd(dto.getToLocationCd());
        }
        if (needsMapping(dto, dto.getProductCd(), "productCd")) {
            entity.setProductCd(dto.getProductCd());
        }
        if (needsMapping(dto, dto.getProductNm(), "productNm")) {
            entity.setProductNm(dto.getProductNm());
        }
        if (needsMapping(dto, dto.getInventoryInstKbnNm(), "inventoryInstKbnNm")) {
            entity.setInventoryInstKbnNm(dto.getInventoryInstKbnNm());
        }
        if (needsMapping(dto, dto.getProductDivisionNm(), "productDivisionNm")) {
            entity.setProductDivisionNm(dto.getProductDivisionNm());
        }
        if (needsMapping(dto, dto.getLocationGrpNm(), "locationGrpNm")) {
            entity.setLocationGrpNm(dto.getLocationGrpNm());
        }
        if (needsMapping(dto, dto.getClientCd(), "clientCd")) {
            entity.setClientCd(dto.getClientCd());
        }
        if (needsMapping(dto, dto.getClientNm(), "clientNm")) {
            entity.setClientNm(dto.getClientNm());
        }
        if (needsMapping(dto, dto.getCenterCd(), "centerCd")) {
            entity.setCenterCd(dto.getCenterCd());
        }
        if (needsMapping(dto, dto.getCenterNm(), "centerNm")) {
            entity.setCenterNm(dto.getCenterNm());
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
    protected boolean needsMapping(SqlInstKeyListDto dto, Object value, String propName) {
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
    public List<SqlInstKeyList> mappingToEntityList(List<SqlInstKeyListDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<SqlInstKeyList> entityList = new ArrayList<SqlInstKeyList>();
        for (SqlInstKeyListDto dto : dtoList) {
            SqlInstKeyList entity = mappingToEntity(dto);
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
    public SqlInstKeyListDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (SqlInstKeyListDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public SqlInstKeyListDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (SqlInstKeyListDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public SqlInstKeyListDtoMapper reverseReference() {
        setReverseReference(true);
        return (SqlInstKeyListDtoMapper)this;
    }
}
