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
 * The DTO mapper of SqlShippingConfirmList. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     ALLOC_INST_H_ID, PICKING_H_ID, UPD_DT, PICKING, CLIENT_ID, CLIENT_CD, CLIENT_NM, CENTER_ID, CENTER_CD, CENTER_NM, EMERGENCY_FLG, STOCK_OUT_FLG, WORK_DT, SHIPPING_DT, SHIPPING_H_UPD_DT, PICKING_TIME, STOWAGE_TIME, SHIPPING_TIME, DELIVERY_COURSE_CD, DELIVERY_COURSE_NM, CARRIER_CD, CARRIER_NM, SUPPLY_CUSTOMER_CD, SUPPLY_CUSTOMER_NM, DELIV_CUSTOMER_CD, DELIV_CUSTOMER_NM, PICKING_BATCH_NO, PICKING_WORK_NO, PICKING_STATUS, PICKING_STATUS_NM, BOL_NO, SHIPPING_SLIP_NO, SHIPPING_H_COUNT, INST_NUM, ALLOC_NUM, PACKING_H_ID, GROSS_WEIGHT, TOTAL_VOLUME, INVOICE_CREATE_FLG, INVOICE_CREATE_FLG_NM, FORCE_FIXED_FLG, FORCE_FIXED_FLG_NM, SHIPPING_STOP_FLG, SHIPPING_STOP_FLG_NM, STOP_FLG, STOP_FLG_NM, CENTER_TRANSIT_FLG
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
public abstract class BsSqlShippingConfirmListDtoMapper implements DtoMapper<SqlShippingConfirmList, SqlShippingConfirmListDto>, Serializable {

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
    public BsSqlShippingConfirmListDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsSqlShippingConfirmListDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public SqlShippingConfirmListDto mappingToDto(SqlShippingConfirmList entity) {
        if (entity == null) {
            return null;
        }
        SqlShippingConfirmListDto dto = new SqlShippingConfirmListDto();
        dto.setAllocInstHId(entity.getAllocInstHId());
        dto.setPickingHId(entity.getPickingHId());
        dto.setUpdDt(entity.getUpdDt());
        dto.setPicking(entity.getPicking());
        dto.setClientId(entity.getClientId());
        dto.setClientCd(entity.getClientCd());
        dto.setClientNm(entity.getClientNm());
        dto.setCenterId(entity.getCenterId());
        dto.setCenterCd(entity.getCenterCd());
        dto.setCenterNm(entity.getCenterNm());
        dto.setEmergencyFlg(entity.getEmergencyFlg());
        dto.setStockOutFlg(entity.getStockOutFlg());
        dto.setWorkDt(entity.getWorkDt());
        dto.setShippingDt(entity.getShippingDt());
        dto.setShippingHUpdDt(entity.getShippingHUpdDt());
        dto.setPickingTime(entity.getPickingTime());
        dto.setStowageTime(entity.getStowageTime());
        dto.setShippingTime(entity.getShippingTime());
        dto.setDeliveryCourseCd(entity.getDeliveryCourseCd());
        dto.setDeliveryCourseNm(entity.getDeliveryCourseNm());
        dto.setCarrierCd(entity.getCarrierCd());
        dto.setCarrierNm(entity.getCarrierNm());
        dto.setSupplyCustomerCd(entity.getSupplyCustomerCd());
        dto.setSupplyCustomerNm(entity.getSupplyCustomerNm());
        dto.setDelivCustomerCd(entity.getDelivCustomerCd());
        dto.setDelivCustomerNm(entity.getDelivCustomerNm());
        dto.setPickingBatchNo(entity.getPickingBatchNo());
        dto.setPickingWorkNo(entity.getPickingWorkNo());
        dto.setPickingStatus(entity.getPickingStatus());
        dto.setPickingStatusNm(entity.getPickingStatusNm());
        dto.setBolNo(entity.getBolNo());
        dto.setShippingSlipNo(entity.getShippingSlipNo());
        dto.setShippingHCount(entity.getShippingHCount());
        dto.setInstNum(entity.getInstNum());
        dto.setAllocNum(entity.getAllocNum());
        dto.setPackingHId(entity.getPackingHId());
        dto.setGrossWeight(entity.getGrossWeight());
        dto.setTotalVolume(entity.getTotalVolume());
        dto.setInvoiceCreateFlg(entity.getInvoiceCreateFlg());
        dto.setInvoiceCreateFlgNm(entity.getInvoiceCreateFlgNm());
        dto.setForceFixedFlg(entity.getForceFixedFlg());
        dto.setForceFixedFlgNm(entity.getForceFixedFlgNm());
        dto.setShippingStopFlg(entity.getShippingStopFlg());
        dto.setShippingStopFlgNm(entity.getShippingStopFlgNm());
        dto.setStopFlg(entity.getStopFlg());
        dto.setStopFlgNm(entity.getStopFlgNm());
        dto.setCenterTransitFlg(entity.getCenterTransitFlg());
        reflectDerivedProperty(entity, dto, true);
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<SqlShippingConfirmListDto> mappingToDtoList(List<SqlShippingConfirmList> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<SqlShippingConfirmListDto> dtoList = new ArrayList<SqlShippingConfirmListDto>();
        for (SqlShippingConfirmList entity : entityList) {
            SqlShippingConfirmListDto dto = mappingToDto(entity);
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
    public SqlShippingConfirmList mappingToEntity(SqlShippingConfirmListDto dto) {
        if (dto == null) {
            return null;
        }
        SqlShippingConfirmList entity = new SqlShippingConfirmList();
        if (needsMapping(dto, dto.getAllocInstHId(), "allocInstHId")) {
            entity.setAllocInstHId(dto.getAllocInstHId());
        }
        if (needsMapping(dto, dto.getPickingHId(), "pickingHId")) {
            entity.setPickingHId(dto.getPickingHId());
        }
        if (needsMapping(dto, dto.getUpdDt(), "updDt")) {
            entity.setUpdDt(dto.getUpdDt());
        }
        if (needsMapping(dto, dto.getPicking(), "picking")) {
            entity.setPicking(dto.getPicking());
        }
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
        if (needsMapping(dto, dto.getStockOutFlg(), "stockOutFlg")) {
            entity.setStockOutFlg(dto.getStockOutFlg());
        }
        if (needsMapping(dto, dto.getWorkDt(), "workDt")) {
            entity.setWorkDt(dto.getWorkDt());
        }
        if (needsMapping(dto, dto.getShippingDt(), "shippingDt")) {
            entity.setShippingDt(dto.getShippingDt());
        }
        if (needsMapping(dto, dto.getShippingHUpdDt(), "shippingHUpdDt")) {
            entity.setShippingHUpdDt(dto.getShippingHUpdDt());
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
        if (needsMapping(dto, dto.getSupplyCustomerCd(), "supplyCustomerCd")) {
            entity.setSupplyCustomerCd(dto.getSupplyCustomerCd());
        }
        if (needsMapping(dto, dto.getSupplyCustomerNm(), "supplyCustomerNm")) {
            entity.setSupplyCustomerNm(dto.getSupplyCustomerNm());
        }
        if (needsMapping(dto, dto.getDelivCustomerCd(), "delivCustomerCd")) {
            entity.setDelivCustomerCd(dto.getDelivCustomerCd());
        }
        if (needsMapping(dto, dto.getDelivCustomerNm(), "delivCustomerNm")) {
            entity.setDelivCustomerNm(dto.getDelivCustomerNm());
        }
        if (needsMapping(dto, dto.getPickingBatchNo(), "pickingBatchNo")) {
            entity.setPickingBatchNo(dto.getPickingBatchNo());
        }
        if (needsMapping(dto, dto.getPickingWorkNo(), "pickingWorkNo")) {
            entity.setPickingWorkNo(dto.getPickingWorkNo());
        }
        if (needsMapping(dto, dto.getPickingStatus(), "pickingStatus")) {
            entity.setPickingStatusAsShippingStatus(CDef.ShippingStatus.codeOf(dto.getPickingStatus()));
        }
        if (needsMapping(dto, dto.getPickingStatusNm(), "pickingStatusNm")) {
            entity.setPickingStatusNm(dto.getPickingStatusNm());
        }
        if (needsMapping(dto, dto.getBolNo(), "bolNo")) {
            entity.setBolNo(dto.getBolNo());
        }
        if (needsMapping(dto, dto.getShippingSlipNo(), "shippingSlipNo")) {
            entity.setShippingSlipNo(dto.getShippingSlipNo());
        }
        if (needsMapping(dto, dto.getShippingHCount(), "shippingHCount")) {
            entity.setShippingHCount(dto.getShippingHCount());
        }
        if (needsMapping(dto, dto.getInstNum(), "instNum")) {
            entity.setInstNum(dto.getInstNum());
        }
        if (needsMapping(dto, dto.getAllocNum(), "allocNum")) {
            entity.setAllocNum(dto.getAllocNum());
        }
        if (needsMapping(dto, dto.getPackingHId(), "packingHId")) {
            entity.setPackingHId(dto.getPackingHId());
        }
        if (needsMapping(dto, dto.getGrossWeight(), "grossWeight")) {
            entity.setGrossWeight(dto.getGrossWeight());
        }
        if (needsMapping(dto, dto.getTotalVolume(), "totalVolume")) {
            entity.setTotalVolume(dto.getTotalVolume());
        }
        if (needsMapping(dto, dto.getInvoiceCreateFlg(), "invoiceCreateFlg")) {
            entity.setInvoiceCreateFlg(dto.getInvoiceCreateFlg());
        }
        if (needsMapping(dto, dto.getInvoiceCreateFlgNm(), "invoiceCreateFlgNm")) {
            entity.setInvoiceCreateFlgNm(dto.getInvoiceCreateFlgNm());
        }
        if (needsMapping(dto, dto.getForceFixedFlg(), "forceFixedFlg")) {
            entity.setForceFixedFlgAsForceFixedFlg(CDef.ForceFixedFlg.codeOf(dto.getForceFixedFlg()));
        }
        if (needsMapping(dto, dto.getForceFixedFlgNm(), "forceFixedFlgNm")) {
            entity.setForceFixedFlgNm(dto.getForceFixedFlgNm());
        }
        if (needsMapping(dto, dto.getShippingStopFlg(), "shippingStopFlg")) {
            entity.setShippingStopFlg(dto.getShippingStopFlg());
        }
        if (needsMapping(dto, dto.getShippingStopFlgNm(), "shippingStopFlgNm")) {
            entity.setShippingStopFlgNm(dto.getShippingStopFlgNm());
        }
        if (needsMapping(dto, dto.getStopFlg(), "stopFlg")) {
            entity.setStopFlg(dto.getStopFlg());
        }
        if (needsMapping(dto, dto.getStopFlgNm(), "stopFlgNm")) {
            entity.setStopFlgNm(dto.getStopFlgNm());
        }
        if (needsMapping(dto, dto.getCenterTransitFlg(), "centerTransitFlg")) {
            entity.setCenterTransitFlgAsCenterTransitFlg(CDef.CenterTransitFlg.codeOf(dto.getCenterTransitFlg()));
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
    protected boolean needsMapping(SqlShippingConfirmListDto dto, Object value, String propName) {
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
    public List<SqlShippingConfirmList> mappingToEntityList(List<SqlShippingConfirmListDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<SqlShippingConfirmList> entityList = new ArrayList<SqlShippingConfirmList>();
        for (SqlShippingConfirmListDto dto : dtoList) {
            SqlShippingConfirmList entity = mappingToEntity(dto);
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
    public SqlShippingConfirmListDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (SqlShippingConfirmListDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public SqlShippingConfirmListDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (SqlShippingConfirmListDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public SqlShippingConfirmListDtoMapper reverseReference() {
        setReverseReference(true);
        return (SqlShippingConfirmListDtoMapper)this;
    }
}
