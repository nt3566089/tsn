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
 * The DTO mapper of SqlReceivePlanBulkMasterData. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     RECEIVE_PLAN_H_ID, RECEIVE_PLAN_B_ID, PRODUCT_ID, LOCATION_ID, LOC_ZONE_WAREHOUSE_ID, MW_WAREHOUSE_ID, SUPPLY_CUSTOMER_ID, SUPPLY_VENDOR_FLG, DEPOSIT_CUSTOMER_ID, DEPOSIT_FLG, DECIMAL_EXIST_FLG
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
public abstract class BsSqlReceivePlanBulkMasterDataDtoMapper implements DtoMapper<SqlReceivePlanBulkMasterData, SqlReceivePlanBulkMasterDataDto>, Serializable {

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
    public BsSqlReceivePlanBulkMasterDataDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsSqlReceivePlanBulkMasterDataDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public SqlReceivePlanBulkMasterDataDto mappingToDto(SqlReceivePlanBulkMasterData entity) {
        if (entity == null) {
            return null;
        }
        SqlReceivePlanBulkMasterDataDto dto = new SqlReceivePlanBulkMasterDataDto();
        dto.setReceivePlanHId(entity.getReceivePlanHId());
        dto.setReceivePlanBId(entity.getReceivePlanBId());
        dto.setProductId(entity.getProductId());
        dto.setLocationId(entity.getLocationId());
        dto.setLocZoneWarehouseId(entity.getLocZoneWarehouseId());
        dto.setMwWarehouseId(entity.getMwWarehouseId());
        dto.setSupplyCustomerId(entity.getSupplyCustomerId());
        dto.setSupplyVendorFlg(entity.getSupplyVendorFlg());
        dto.setDepositCustomerId(entity.getDepositCustomerId());
        dto.setDepositFlg(entity.getDepositFlg());
        dto.setDecimalExistFlg(entity.getDecimalExistFlg());
        reflectDerivedProperty(entity, dto, true);
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<SqlReceivePlanBulkMasterDataDto> mappingToDtoList(List<SqlReceivePlanBulkMasterData> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<SqlReceivePlanBulkMasterDataDto> dtoList = new ArrayList<SqlReceivePlanBulkMasterDataDto>();
        for (SqlReceivePlanBulkMasterData entity : entityList) {
            SqlReceivePlanBulkMasterDataDto dto = mappingToDto(entity);
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
    public SqlReceivePlanBulkMasterData mappingToEntity(SqlReceivePlanBulkMasterDataDto dto) {
        if (dto == null) {
            return null;
        }
        SqlReceivePlanBulkMasterData entity = new SqlReceivePlanBulkMasterData();
        if (needsMapping(dto, dto.getReceivePlanHId(), "receivePlanHId")) {
            entity.setReceivePlanHId(dto.getReceivePlanHId());
        }
        if (needsMapping(dto, dto.getReceivePlanBId(), "receivePlanBId")) {
            entity.setReceivePlanBId(dto.getReceivePlanBId());
        }
        if (needsMapping(dto, dto.getProductId(), "productId")) {
            entity.setProductId(dto.getProductId());
        }
        if (needsMapping(dto, dto.getLocationId(), "locationId")) {
            entity.setLocationId(dto.getLocationId());
        }
        if (needsMapping(dto, dto.getLocZoneWarehouseId(), "locZoneWarehouseId")) {
            entity.setLocZoneWarehouseId(dto.getLocZoneWarehouseId());
        }
        if (needsMapping(dto, dto.getMwWarehouseId(), "mwWarehouseId")) {
            entity.setMwWarehouseId(dto.getMwWarehouseId());
        }
        if (needsMapping(dto, dto.getSupplyCustomerId(), "supplyCustomerId")) {
            entity.setSupplyCustomerId(dto.getSupplyCustomerId());
        }
        if (needsMapping(dto, dto.getSupplyVendorFlg(), "supplyVendorFlg")) {
            entity.setSupplyVendorFlg(dto.getSupplyVendorFlg());
        }
        if (needsMapping(dto, dto.getDepositCustomerId(), "depositCustomerId")) {
            entity.setDepositCustomerId(dto.getDepositCustomerId());
        }
        if (needsMapping(dto, dto.getDepositFlg(), "depositFlg")) {
            entity.setDepositFlgAsDepositFlg(CDef.DepositFlg.codeOf(dto.getDepositFlg()));
        }
        if (needsMapping(dto, dto.getDecimalExistFlg(), "decimalExistFlg")) {
            entity.setDecimalExistFlgAsDecimalExistFlg(CDef.DecimalExistFlg.codeOf(dto.getDecimalExistFlg()));
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
    protected boolean needsMapping(SqlReceivePlanBulkMasterDataDto dto, Object value, String propName) {
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
    public List<SqlReceivePlanBulkMasterData> mappingToEntityList(List<SqlReceivePlanBulkMasterDataDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<SqlReceivePlanBulkMasterData> entityList = new ArrayList<SqlReceivePlanBulkMasterData>();
        for (SqlReceivePlanBulkMasterDataDto dto : dtoList) {
            SqlReceivePlanBulkMasterData entity = mappingToEntity(dto);
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
    public SqlReceivePlanBulkMasterDataDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (SqlReceivePlanBulkMasterDataDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public SqlReceivePlanBulkMasterDataDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (SqlReceivePlanBulkMasterDataDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public SqlReceivePlanBulkMasterDataDtoMapper reverseReference() {
        setReverseReference(true);
        return (SqlReceivePlanBulkMasterDataDtoMapper)this;
    }
}
