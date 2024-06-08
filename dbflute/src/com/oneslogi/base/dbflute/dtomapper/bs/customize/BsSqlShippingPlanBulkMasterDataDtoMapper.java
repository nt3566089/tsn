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
 * The DTO mapper of SqlShippingPlanBulkMasterData. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     SHIPPING_INST_H_ID, SHIPPING_INST_B_ID, SUPPLY_CUSTOMER_ID, SUPPLY_CUSTOMER_CD, SUPPLY_CUSTOMER_NM, SUPPLY_DELIVERY_FLG, DELIVERY_CUSTOMER_ID, DELIVERY_CUSTOMER_CD, DELIVERY_CUSTOMER_NM, DELIVERY_ZIP_CD, DELIVERY_TEL_NO, DELIVERY_ADDRESS1, DELIVERY_ADDRESS2, DELIVERY_ADDRESS3, DELIVERY_DELIVERY_FLG, DELIVERY_ONETIME_FLG, CLIENT_CENTER_ID, MCLIENT_CENTER_CENTER_ID, MCLIENT_CENTER_CLIENT_ID, MCLIENT_CENTER_CUSTOMER_ID, MCENTER_CENTER_ID, MCUSTOMER_CC_CUSTOMER_ID, MZIP_ZIP_ID, DELIVERY_COURSE_ID, DELIVERY_COURSE_CD, DELIVERY_COURSE_NM, MDELIV_COURSE_CARRIER_ID, MCARRIER_CARRIER_CD, MCARRIER_DEL_FLG, DEPOSIT_CUSTOMER_ID, DEPOSIT_CUSTOMER_CD, DEPOSIT_CUSTOMER_NM, DEPOSIT_DEPOSIT_FLG, STOCK_TYPE_ID, STOCK_TYPE_CD, MPRODUCT_PRODUCT_ID, MPRODUCT_PRODUCT_CD, MPRODUCT_PRODUCT_NM, MS_DECIMAL_EXIST_FLG, MW_WAREHOUSE_ID, MW_WAREHOUSE_CD, MW_WAREHOUSE_NM, ML_LOCATION_ID, ML_LOCATION_CD, ML_LOCATION_NM, MZ_MW_WAREHOUSE_ID, MZ_MW_WAREHOUSE_CD, CENTER_CUSTOMER_ID, DELIV_COURSE_ID_BY_CUSTOMER, CENTER_ID, DELIV_COURSE_CD_BY_CUSTOMER
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
public abstract class BsSqlShippingPlanBulkMasterDataDtoMapper implements DtoMapper<SqlShippingPlanBulkMasterData, SqlShippingPlanBulkMasterDataDto>, Serializable {

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
    public BsSqlShippingPlanBulkMasterDataDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsSqlShippingPlanBulkMasterDataDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public SqlShippingPlanBulkMasterDataDto mappingToDto(SqlShippingPlanBulkMasterData entity) {
        if (entity == null) {
            return null;
        }
        SqlShippingPlanBulkMasterDataDto dto = new SqlShippingPlanBulkMasterDataDto();
        dto.setShippingInstHId(entity.getShippingInstHId());
        dto.setShippingInstBId(entity.getShippingInstBId());
        dto.setSupplyCustomerId(entity.getSupplyCustomerId());
        dto.setSupplyCustomerCd(entity.getSupplyCustomerCd());
        dto.setSupplyCustomerNm(entity.getSupplyCustomerNm());
        dto.setSupplyDeliveryFlg(entity.getSupplyDeliveryFlg());
        dto.setDeliveryCustomerId(entity.getDeliveryCustomerId());
        dto.setDeliveryCustomerCd(entity.getDeliveryCustomerCd());
        dto.setDeliveryCustomerNm(entity.getDeliveryCustomerNm());
        dto.setDeliveryZipCd(entity.getDeliveryZipCd());
        dto.setDeliveryTelNo(entity.getDeliveryTelNo());
        dto.setDeliveryAddress1(entity.getDeliveryAddress1());
        dto.setDeliveryAddress2(entity.getDeliveryAddress2());
        dto.setDeliveryAddress3(entity.getDeliveryAddress3());
        dto.setDeliveryDeliveryFlg(entity.getDeliveryDeliveryFlg());
        dto.setDeliveryOnetimeFlg(entity.getDeliveryOnetimeFlg());
        dto.setClientCenterId(entity.getClientCenterId());
        dto.setMclientCenterCenterId(entity.getMclientCenterCenterId());
        dto.setMclientCenterClientId(entity.getMclientCenterClientId());
        dto.setMclientCenterCustomerId(entity.getMclientCenterCustomerId());
        dto.setMcenterCenterId(entity.getMcenterCenterId());
        dto.setMcustomerCcCustomerId(entity.getMcustomerCcCustomerId());
        dto.setMzipZipId(entity.getMzipZipId());
        dto.setDeliveryCourseId(entity.getDeliveryCourseId());
        dto.setDeliveryCourseCd(entity.getDeliveryCourseCd());
        dto.setDeliveryCourseNm(entity.getDeliveryCourseNm());
        dto.setMdelivCourseCarrierId(entity.getMdelivCourseCarrierId());
        dto.setMcarrierCarrierCd(entity.getMcarrierCarrierCd());
        dto.setMcarrierDelFlg(entity.getMcarrierDelFlg());
        dto.setDepositCustomerId(entity.getDepositCustomerId());
        dto.setDepositCustomerCd(entity.getDepositCustomerCd());
        dto.setDepositCustomerNm(entity.getDepositCustomerNm());
        dto.setDepositDepositFlg(entity.getDepositDepositFlg());
        dto.setStockTypeId(entity.getStockTypeId());
        dto.setStockTypeCd(entity.getStockTypeCd());
        dto.setMproductProductId(entity.getMproductProductId());
        dto.setMproductProductCd(entity.getMproductProductCd());
        dto.setMproductProductNm(entity.getMproductProductNm());
        dto.setMsDecimalExistFlg(entity.getMsDecimalExistFlg());
        dto.setMwWarehouseId(entity.getMwWarehouseId());
        dto.setMwWarehouseCd(entity.getMwWarehouseCd());
        dto.setMwWarehouseNm(entity.getMwWarehouseNm());
        dto.setMlLocationId(entity.getMlLocationId());
        dto.setMlLocationCd(entity.getMlLocationCd());
        dto.setMlLocationNm(entity.getMlLocationNm());
        dto.setMzMwWarehouseId(entity.getMzMwWarehouseId());
        dto.setMzMwWarehouseCd(entity.getMzMwWarehouseCd());
        dto.setCenterCustomerId(entity.getCenterCustomerId());
        dto.setDelivCourseIdByCustomer(entity.getDelivCourseIdByCustomer());
        dto.setCenterId(entity.getCenterId());
        dto.setDelivCourseCdByCustomer(entity.getDelivCourseCdByCustomer());
        reflectDerivedProperty(entity, dto, true);
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<SqlShippingPlanBulkMasterDataDto> mappingToDtoList(List<SqlShippingPlanBulkMasterData> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<SqlShippingPlanBulkMasterDataDto> dtoList = new ArrayList<SqlShippingPlanBulkMasterDataDto>();
        for (SqlShippingPlanBulkMasterData entity : entityList) {
            SqlShippingPlanBulkMasterDataDto dto = mappingToDto(entity);
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
    public SqlShippingPlanBulkMasterData mappingToEntity(SqlShippingPlanBulkMasterDataDto dto) {
        if (dto == null) {
            return null;
        }
        SqlShippingPlanBulkMasterData entity = new SqlShippingPlanBulkMasterData();
        if (needsMapping(dto, dto.getShippingInstHId(), "shippingInstHId")) {
            entity.setShippingInstHId(dto.getShippingInstHId());
        }
        if (needsMapping(dto, dto.getShippingInstBId(), "shippingInstBId")) {
            entity.setShippingInstBId(dto.getShippingInstBId());
        }
        if (needsMapping(dto, dto.getSupplyCustomerId(), "supplyCustomerId")) {
            entity.setSupplyCustomerId(dto.getSupplyCustomerId());
        }
        if (needsMapping(dto, dto.getSupplyCustomerCd(), "supplyCustomerCd")) {
            entity.setSupplyCustomerCd(dto.getSupplyCustomerCd());
        }
        if (needsMapping(dto, dto.getSupplyCustomerNm(), "supplyCustomerNm")) {
            entity.setSupplyCustomerNm(dto.getSupplyCustomerNm());
        }
        if (needsMapping(dto, dto.getSupplyDeliveryFlg(), "supplyDeliveryFlg")) {
            entity.setSupplyDeliveryFlg(dto.getSupplyDeliveryFlg());
        }
        if (needsMapping(dto, dto.getDeliveryCustomerId(), "deliveryCustomerId")) {
            entity.setDeliveryCustomerId(dto.getDeliveryCustomerId());
        }
        if (needsMapping(dto, dto.getDeliveryCustomerCd(), "deliveryCustomerCd")) {
            entity.setDeliveryCustomerCd(dto.getDeliveryCustomerCd());
        }
        if (needsMapping(dto, dto.getDeliveryCustomerNm(), "deliveryCustomerNm")) {
            entity.setDeliveryCustomerNm(dto.getDeliveryCustomerNm());
        }
        if (needsMapping(dto, dto.getDeliveryZipCd(), "deliveryZipCd")) {
            entity.setDeliveryZipCd(dto.getDeliveryZipCd());
        }
        if (needsMapping(dto, dto.getDeliveryTelNo(), "deliveryTelNo")) {
            entity.setDeliveryTelNo(dto.getDeliveryTelNo());
        }
        if (needsMapping(dto, dto.getDeliveryAddress1(), "deliveryAddress1")) {
            entity.setDeliveryAddress1(dto.getDeliveryAddress1());
        }
        if (needsMapping(dto, dto.getDeliveryAddress2(), "deliveryAddress2")) {
            entity.setDeliveryAddress2(dto.getDeliveryAddress2());
        }
        if (needsMapping(dto, dto.getDeliveryAddress3(), "deliveryAddress3")) {
            entity.setDeliveryAddress3(dto.getDeliveryAddress3());
        }
        if (needsMapping(dto, dto.getDeliveryDeliveryFlg(), "deliveryDeliveryFlg")) {
            entity.setDeliveryDeliveryFlg(dto.getDeliveryDeliveryFlg());
        }
        if (needsMapping(dto, dto.getDeliveryOnetimeFlg(), "deliveryOnetimeFlg")) {
            entity.setDeliveryOnetimeFlg(dto.getDeliveryOnetimeFlg());
        }
        if (needsMapping(dto, dto.getClientCenterId(), "clientCenterId")) {
            entity.setClientCenterId(dto.getClientCenterId());
        }
        if (needsMapping(dto, dto.getMclientCenterCenterId(), "mclientCenterCenterId")) {
            entity.setMclientCenterCenterId(dto.getMclientCenterCenterId());
        }
        if (needsMapping(dto, dto.getMclientCenterClientId(), "mclientCenterClientId")) {
            entity.setMclientCenterClientId(dto.getMclientCenterClientId());
        }
        if (needsMapping(dto, dto.getMclientCenterCustomerId(), "mclientCenterCustomerId")) {
            entity.setMclientCenterCustomerId(dto.getMclientCenterCustomerId());
        }
        if (needsMapping(dto, dto.getMcenterCenterId(), "mcenterCenterId")) {
            entity.setMcenterCenterId(dto.getMcenterCenterId());
        }
        if (needsMapping(dto, dto.getMcustomerCcCustomerId(), "mcustomerCcCustomerId")) {
            entity.setMcustomerCcCustomerId(dto.getMcustomerCcCustomerId());
        }
        if (needsMapping(dto, dto.getMzipZipId(), "mzipZipId")) {
            entity.setMzipZipId(dto.getMzipZipId());
        }
        if (needsMapping(dto, dto.getDeliveryCourseId(), "deliveryCourseId")) {
            entity.setDeliveryCourseId(dto.getDeliveryCourseId());
        }
        if (needsMapping(dto, dto.getDeliveryCourseCd(), "deliveryCourseCd")) {
            entity.setDeliveryCourseCd(dto.getDeliveryCourseCd());
        }
        if (needsMapping(dto, dto.getDeliveryCourseNm(), "deliveryCourseNm")) {
            entity.setDeliveryCourseNm(dto.getDeliveryCourseNm());
        }
        if (needsMapping(dto, dto.getMdelivCourseCarrierId(), "mdelivCourseCarrierId")) {
            entity.setMdelivCourseCarrierId(dto.getMdelivCourseCarrierId());
        }
        if (needsMapping(dto, dto.getMcarrierCarrierCd(), "mcarrierCarrierCd")) {
            entity.setMcarrierCarrierCd(dto.getMcarrierCarrierCd());
        }
        if (needsMapping(dto, dto.getMcarrierDelFlg(), "mcarrierDelFlg")) {
            entity.setMcarrierDelFlg(dto.getMcarrierDelFlg());
        }
        if (needsMapping(dto, dto.getDepositCustomerId(), "depositCustomerId")) {
            entity.setDepositCustomerId(dto.getDepositCustomerId());
        }
        if (needsMapping(dto, dto.getDepositCustomerCd(), "depositCustomerCd")) {
            entity.setDepositCustomerCd(dto.getDepositCustomerCd());
        }
        if (needsMapping(dto, dto.getDepositCustomerNm(), "depositCustomerNm")) {
            entity.setDepositCustomerNm(dto.getDepositCustomerNm());
        }
        if (needsMapping(dto, dto.getDepositDepositFlg(), "depositDepositFlg")) {
            entity.setDepositDepositFlg(dto.getDepositDepositFlg());
        }
        if (needsMapping(dto, dto.getStockTypeId(), "stockTypeId")) {
            entity.setStockTypeId(dto.getStockTypeId());
        }
        if (needsMapping(dto, dto.getStockTypeCd(), "stockTypeCd")) {
            entity.setStockTypeCd(dto.getStockTypeCd());
        }
        if (needsMapping(dto, dto.getMproductProductId(), "mproductProductId")) {
            entity.setMproductProductId(dto.getMproductProductId());
        }
        if (needsMapping(dto, dto.getMproductProductCd(), "mproductProductCd")) {
            entity.setMproductProductCd(dto.getMproductProductCd());
        }
        if (needsMapping(dto, dto.getMproductProductNm(), "mproductProductNm")) {
            entity.setMproductProductNm(dto.getMproductProductNm());
        }
        if (needsMapping(dto, dto.getMsDecimalExistFlg(), "msDecimalExistFlg")) {
            entity.setMsDecimalExistFlg(dto.getMsDecimalExistFlg());
        }
        if (needsMapping(dto, dto.getMwWarehouseId(), "mwWarehouseId")) {
            entity.setMwWarehouseId(dto.getMwWarehouseId());
        }
        if (needsMapping(dto, dto.getMwWarehouseCd(), "mwWarehouseCd")) {
            entity.setMwWarehouseCd(dto.getMwWarehouseCd());
        }
        if (needsMapping(dto, dto.getMwWarehouseNm(), "mwWarehouseNm")) {
            entity.setMwWarehouseNm(dto.getMwWarehouseNm());
        }
        if (needsMapping(dto, dto.getMlLocationId(), "mlLocationId")) {
            entity.setMlLocationId(dto.getMlLocationId());
        }
        if (needsMapping(dto, dto.getMlLocationCd(), "mlLocationCd")) {
            entity.setMlLocationCd(dto.getMlLocationCd());
        }
        if (needsMapping(dto, dto.getMlLocationNm(), "mlLocationNm")) {
            entity.setMlLocationNm(dto.getMlLocationNm());
        }
        if (needsMapping(dto, dto.getMzMwWarehouseId(), "mzMwWarehouseId")) {
            entity.setMzMwWarehouseId(dto.getMzMwWarehouseId());
        }
        if (needsMapping(dto, dto.getMzMwWarehouseCd(), "mzMwWarehouseCd")) {
            entity.setMzMwWarehouseCd(dto.getMzMwWarehouseCd());
        }
        if (needsMapping(dto, dto.getCenterCustomerId(), "centerCustomerId")) {
            entity.setCenterCustomerId(dto.getCenterCustomerId());
        }
        if (needsMapping(dto, dto.getDelivCourseIdByCustomer(), "delivCourseIdByCustomer")) {
            entity.setDelivCourseIdByCustomer(dto.getDelivCourseIdByCustomer());
        }
        if (needsMapping(dto, dto.getCenterId(), "centerId")) {
            entity.setCenterId(dto.getCenterId());
        }
        if (needsMapping(dto, dto.getDelivCourseCdByCustomer(), "delivCourseCdByCustomer")) {
            entity.setDelivCourseCdByCustomer(dto.getDelivCourseCdByCustomer());
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
    protected boolean needsMapping(SqlShippingPlanBulkMasterDataDto dto, Object value, String propName) {
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
    public List<SqlShippingPlanBulkMasterData> mappingToEntityList(List<SqlShippingPlanBulkMasterDataDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<SqlShippingPlanBulkMasterData> entityList = new ArrayList<SqlShippingPlanBulkMasterData>();
        for (SqlShippingPlanBulkMasterDataDto dto : dtoList) {
            SqlShippingPlanBulkMasterData entity = mappingToEntity(dto);
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
    public SqlShippingPlanBulkMasterDataDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (SqlShippingPlanBulkMasterDataDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public SqlShippingPlanBulkMasterDataDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (SqlShippingPlanBulkMasterDataDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public SqlShippingPlanBulkMasterDataDtoMapper reverseReference() {
        setReverseReference(true);
        return (SqlShippingPlanBulkMasterDataDtoMapper)this;
    }
}
