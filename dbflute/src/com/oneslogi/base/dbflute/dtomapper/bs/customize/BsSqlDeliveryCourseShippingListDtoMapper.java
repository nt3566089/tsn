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
 * The DTO mapper of SqlDeliveryCourseShippingList. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     CLIENT_ID, CLIENT_CD, CLIENT_NM, CENTER_ID, CENTER_CD, CENTER_NM, EMERGENCY_FLG, ERROR_FLG, CANCEL_FLG, STOCK_OUT_FLG, WORK_DT, SHIPPING_DT, MAX_UPD_DT, PICKING_TIME, STOWAGE_TIME, SHIPPING_TIME, DELIVERY_COURSE_CD, DELIVERY_COURSE_NM, CARRIER_CD, CARRIER_NM, COUNT_SUPPLY_CUSTOMER_CD, PICKING_BATCH_NO, SHIPPING_STATUS, SHIPPING_STATUS_MAX, SHIPPING_STATUS_NM, SHIPPING_SLIP_NO, NUM, TSIH_NUM, COUNT_PRODUCT_CD, INST_NUM, ALLOC_NUM, COUNT_SHIPPING_PACKING_NO, SUM_GROSS_WEIGHT, PIC_LIST_STATUS1, PIC_LIST_STATUS2, CHK_STATUS, INVOICE_CREATE, PACKING_OUT, LOADING_STATUS, SHIPPING_FIXED
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
public abstract class BsSqlDeliveryCourseShippingListDtoMapper implements DtoMapper<SqlDeliveryCourseShippingList, SqlDeliveryCourseShippingListDto>, Serializable {

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
    public BsSqlDeliveryCourseShippingListDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsSqlDeliveryCourseShippingListDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public SqlDeliveryCourseShippingListDto mappingToDto(SqlDeliveryCourseShippingList entity) {
        if (entity == null) {
            return null;
        }
        SqlDeliveryCourseShippingListDto dto = new SqlDeliveryCourseShippingListDto();
        dto.setClientId(entity.getClientId());
        dto.setClientCd(entity.getClientCd());
        dto.setClientNm(entity.getClientNm());
        dto.setCenterId(entity.getCenterId());
        dto.setCenterCd(entity.getCenterCd());
        dto.setCenterNm(entity.getCenterNm());
        dto.setEmergencyFlg(entity.getEmergencyFlg());
        dto.setErrorFlg(entity.getErrorFlg());
        dto.setCancelFlg(entity.getCancelFlg());
        dto.setStockOutFlg(entity.getStockOutFlg());
        dto.setWorkDt(entity.getWorkDt());
        dto.setShippingDt(entity.getShippingDt());
        dto.setMaxUpdDt(entity.getMaxUpdDt());
        dto.setPickingTime(entity.getPickingTime());
        dto.setStowageTime(entity.getStowageTime());
        dto.setShippingTime(entity.getShippingTime());
        dto.setDeliveryCourseCd(entity.getDeliveryCourseCd());
        dto.setDeliveryCourseNm(entity.getDeliveryCourseNm());
        dto.setCarrierCd(entity.getCarrierCd());
        dto.setCarrierNm(entity.getCarrierNm());
        dto.setCountSupplyCustomerCd(entity.getCountSupplyCustomerCd());
        dto.setPickingBatchNo(entity.getPickingBatchNo());
        dto.setShippingStatus(entity.getShippingStatus());
        dto.setShippingStatusMax(entity.getShippingStatusMax());
        dto.setShippingStatusNm(entity.getShippingStatusNm());
        dto.setShippingSlipNo(entity.getShippingSlipNo());
        dto.setNum(entity.getNum());
        dto.setTsihNum(entity.getTsihNum());
        dto.setCountProductCd(entity.getCountProductCd());
        dto.setInstNum(entity.getInstNum());
        dto.setAllocNum(entity.getAllocNum());
        dto.setCountShippingPackingNo(entity.getCountShippingPackingNo());
        dto.setSumGrossWeight(entity.getSumGrossWeight());
        dto.setPicListStatus1(entity.getPicListStatus1());
        dto.setPicListStatus2(entity.getPicListStatus2());
        dto.setChkStatus(entity.getChkStatus());
        dto.setInvoiceCreate(entity.getInvoiceCreate());
        dto.setPackingOut(entity.getPackingOut());
        dto.setLoadingStatus(entity.getLoadingStatus());
        dto.setShippingFixed(entity.getShippingFixed());
        reflectDerivedProperty(entity, dto, true);
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<SqlDeliveryCourseShippingListDto> mappingToDtoList(List<SqlDeliveryCourseShippingList> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<SqlDeliveryCourseShippingListDto> dtoList = new ArrayList<SqlDeliveryCourseShippingListDto>();
        for (SqlDeliveryCourseShippingList entity : entityList) {
            SqlDeliveryCourseShippingListDto dto = mappingToDto(entity);
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
    public SqlDeliveryCourseShippingList mappingToEntity(SqlDeliveryCourseShippingListDto dto) {
        if (dto == null) {
            return null;
        }
        SqlDeliveryCourseShippingList entity = new SqlDeliveryCourseShippingList();
        if (needsMapping(dto, dto.getClientId(), "clientId")) {
            entity.setClientId(dto.getClientId());
        }
        if (needsMapping(dto, dto.getClientCd(), "clientCd")) {
            entity.setClientCd(dto.getClientCd());
        }
        if (needsMapping(dto, dto.getClientNm(), "clientNm")) {
            entity.setClientNm(dto.getClientNm());
        }
        if (needsMapping(dto, dto.getCenterId(), "centerId")) {
            entity.setCenterId(dto.getCenterId());
        }
        if (needsMapping(dto, dto.getCenterCd(), "centerCd")) {
            entity.setCenterCd(dto.getCenterCd());
        }
        if (needsMapping(dto, dto.getCenterNm(), "centerNm")) {
            entity.setCenterNm(dto.getCenterNm());
        }
        if (needsMapping(dto, dto.getEmergencyFlg(), "emergencyFlg")) {
            entity.setEmergencyFlg(dto.getEmergencyFlg());
        }
        if (needsMapping(dto, dto.getErrorFlg(), "errorFlg")) {
            entity.setErrorFlg(dto.getErrorFlg());
        }
        if (needsMapping(dto, dto.getCancelFlg(), "cancelFlg")) {
            entity.setCancelFlg(dto.getCancelFlg());
        }
        if (needsMapping(dto, dto.getStockOutFlg(), "stockOutFlg")) {
            entity.setStockOutFlg(dto.getStockOutFlg());
        }
        if (needsMapping(dto, dto.getWorkDt(), "workDt")) {
            entity.setWorkDt(dto.getWorkDt());
        }
        if (needsMapping(dto, dto.getShippingDt(), "shippingDt")) {
            entity.setShippingDt(dto.getShippingDt());
        }
        if (needsMapping(dto, dto.getMaxUpdDt(), "maxUpdDt")) {
            entity.setMaxUpdDt(dto.getMaxUpdDt());
        }
        if (needsMapping(dto, dto.getPickingTime(), "pickingTime")) {
            entity.setPickingTime(dto.getPickingTime());
        }
        if (needsMapping(dto, dto.getStowageTime(), "stowageTime")) {
            entity.setStowageTime(dto.getStowageTime());
        }
        if (needsMapping(dto, dto.getShippingTime(), "shippingTime")) {
            entity.setShippingTime(dto.getShippingTime());
        }
        if (needsMapping(dto, dto.getDeliveryCourseCd(), "deliveryCourseCd")) {
            entity.setDeliveryCourseCd(dto.getDeliveryCourseCd());
        }
        if (needsMapping(dto, dto.getDeliveryCourseNm(), "deliveryCourseNm")) {
            entity.setDeliveryCourseNm(dto.getDeliveryCourseNm());
        }
        if (needsMapping(dto, dto.getCarrierCd(), "carrierCd")) {
            entity.setCarrierCd(dto.getCarrierCd());
        }
        if (needsMapping(dto, dto.getCarrierNm(), "carrierNm")) {
            entity.setCarrierNm(dto.getCarrierNm());
        }
        if (needsMapping(dto, dto.getCountSupplyCustomerCd(), "countSupplyCustomerCd")) {
            entity.setCountSupplyCustomerCd(dto.getCountSupplyCustomerCd());
        }
        if (needsMapping(dto, dto.getPickingBatchNo(), "pickingBatchNo")) {
            entity.setPickingBatchNo(dto.getPickingBatchNo());
        }
        if (needsMapping(dto, dto.getShippingStatus(), "shippingStatus")) {
            entity.setShippingStatusAsShippingStatus(CDef.ShippingStatus.codeOf(dto.getShippingStatus()));
        }
        if (needsMapping(dto, dto.getShippingStatusMax(), "shippingStatusMax")) {
            entity.setShippingStatusMaxAsShippingStatus(CDef.ShippingStatus.codeOf(dto.getShippingStatusMax()));
        }
        if (needsMapping(dto, dto.getShippingStatusNm(), "shippingStatusNm")) {
            entity.setShippingStatusNm(dto.getShippingStatusNm());
        }
        if (needsMapping(dto, dto.getShippingSlipNo(), "shippingSlipNo")) {
            entity.setShippingSlipNo(dto.getShippingSlipNo());
        }
        if (needsMapping(dto, dto.getNum(), "num")) {
            entity.setNum(dto.getNum());
        }
        if (needsMapping(dto, dto.getTsihNum(), "tsihNum")) {
            entity.setTsihNum(dto.getTsihNum());
        }
        if (needsMapping(dto, dto.getCountProductCd(), "countProductCd")) {
            entity.setCountProductCd(dto.getCountProductCd());
        }
        if (needsMapping(dto, dto.getInstNum(), "instNum")) {
            entity.setInstNum(dto.getInstNum());
        }
        if (needsMapping(dto, dto.getAllocNum(), "allocNum")) {
            entity.setAllocNum(dto.getAllocNum());
        }
        if (needsMapping(dto, dto.getCountShippingPackingNo(), "countShippingPackingNo")) {
            entity.setCountShippingPackingNo(dto.getCountShippingPackingNo());
        }
        if (needsMapping(dto, dto.getSumGrossWeight(), "sumGrossWeight")) {
            entity.setSumGrossWeight(dto.getSumGrossWeight());
        }
        if (needsMapping(dto, dto.getPicListStatus1(), "picListStatus1")) {
            entity.setPicListStatus1(dto.getPicListStatus1());
        }
        if (needsMapping(dto, dto.getPicListStatus2(), "picListStatus2")) {
            entity.setPicListStatus2(dto.getPicListStatus2());
        }
        if (needsMapping(dto, dto.getChkStatus(), "chkStatus")) {
            entity.setChkStatus(dto.getChkStatus());
        }
        if (needsMapping(dto, dto.getInvoiceCreate(), "invoiceCreate")) {
            entity.setInvoiceCreate(dto.getInvoiceCreate());
        }
        if (needsMapping(dto, dto.getPackingOut(), "packingOut")) {
            entity.setPackingOut(dto.getPackingOut());
        }
        if (needsMapping(dto, dto.getLoadingStatus(), "loadingStatus")) {
            entity.setLoadingStatus(dto.getLoadingStatus());
        }
        if (needsMapping(dto, dto.getShippingFixed(), "shippingFixed")) {
            entity.setShippingFixed(dto.getShippingFixed());
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
    protected boolean needsMapping(SqlDeliveryCourseShippingListDto dto, Object value, String propName) {
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
    public List<SqlDeliveryCourseShippingList> mappingToEntityList(List<SqlDeliveryCourseShippingListDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<SqlDeliveryCourseShippingList> entityList = new ArrayList<SqlDeliveryCourseShippingList>();
        for (SqlDeliveryCourseShippingListDto dto : dtoList) {
            SqlDeliveryCourseShippingList entity = mappingToEntity(dto);
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
    public SqlDeliveryCourseShippingListDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (SqlDeliveryCourseShippingListDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public SqlDeliveryCourseShippingListDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (SqlDeliveryCourseShippingListDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public SqlDeliveryCourseShippingListDtoMapper reverseReference() {
        setReverseReference(true);
        return (SqlDeliveryCourseShippingListDtoMapper)this;
    }
}
