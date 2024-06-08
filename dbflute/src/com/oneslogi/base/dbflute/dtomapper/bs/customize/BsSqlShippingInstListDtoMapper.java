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
 * The DTO mapper of SqlShippingInstList. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     SHIPPING_INST_H_ID, CLIENT_ID, CLIENT_CD, CLIENT_NM, CENTER_ID, CENTER_CD, CENTER_NM, WORK_DT, SHIPPING_DT, PICKING_BATCH_NO, SUPPLY_CUSTOMER_CD, SUPPLY_CUSTOMER_NM, DELIV_CUSTOMER_CD, DELIV_CUSTOMER_NM, BOL_NO, BOL_OUT_FLG, BOL_OUT_NM, SHIPPING_SLIP_NO, CLIENT_SHIPPING_NO, SHIPPING_STATUS, SHIPPING_STATUS_NM, DELIVERY_COURSE_CD, DELIVERY_COURSE_NM, CARRIER_CD, CARRIER_NM, SLIP_NO, LINE_NO, PRODUCT_ID, INST_NUM, ALLOC_NUM, STOCK_OUT_FLG, OPL_OUT_FLG, MLT_OUT_FLG, TPL_OUT_FLG, PL_OUT_FLG, SPL_OUT_FLG, PL1_OUT_FLG, PL2_OUT_FLG, CASE_OUT_FLG, INSPECTION_OUT_FLG, SL_OUT_FLG, PACKING_OUT_FLG, INVOICE_CREATE_FLG, STW_OUT_FLG, OPL_OUT_NM, MLT_OUT_NM, TPL_OUT_NM, PL_OUT_NM, SPL_OUT_NM, PL1_OUT_NM, PL2_OUT_NM, CASE_OUT_NM, INSPECTION_OUT_NM, SL_OUT_NM, PACKING_OUT_NM, INVOICE_CREATE_NM, STW_OUT_NM, PICKING_NUM, INSPECTION_NUM, LOADING_STATUS, PICKING_WORK_NO, DELIV_UNIT_NO, DELIV_PLAN_DT, DELIV_DT, DELIV_TZ, DELIV_TZ_NM, MESSAGE_NM, PICKING_WORK_MESSAGE, PICKING_WORK_MESSAGE_COUNT, EMERGENCY_FLG, UPD_DT, PICKING_WORK_NO_CNT, UPD_DT_H, SHIPPING_STOP_CS, SHIPPING_STOP_CS_NM, SHIPPING_STOP_PD, SHIPPING_STOP_PD_NM, FORCE_FIXED_FLG, FORCE_FIXED_FLG_NM, NUM, VERSION_NO, CONTROL_NO
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
public abstract class BsSqlShippingInstListDtoMapper implements DtoMapper<SqlShippingInstList, SqlShippingInstListDto>, Serializable {

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
    public BsSqlShippingInstListDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsSqlShippingInstListDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public SqlShippingInstListDto mappingToDto(SqlShippingInstList entity) {
        if (entity == null) {
            return null;
        }
        SqlShippingInstListDto dto = new SqlShippingInstListDto();
        dto.setShippingInstHId(entity.getShippingInstHId());
        dto.setClientId(entity.getClientId());
        dto.setClientCd(entity.getClientCd());
        dto.setClientNm(entity.getClientNm());
        dto.setCenterId(entity.getCenterId());
        dto.setCenterCd(entity.getCenterCd());
        dto.setCenterNm(entity.getCenterNm());
        dto.setWorkDt(entity.getWorkDt());
        dto.setShippingDt(entity.getShippingDt());
        dto.setPickingBatchNo(entity.getPickingBatchNo());
        dto.setSupplyCustomerCd(entity.getSupplyCustomerCd());
        dto.setSupplyCustomerNm(entity.getSupplyCustomerNm());
        dto.setDelivCustomerCd(entity.getDelivCustomerCd());
        dto.setDelivCustomerNm(entity.getDelivCustomerNm());
        dto.setBolNo(entity.getBolNo());
        dto.setBolOutFlg(entity.getBolOutFlg());
        dto.setBolOutNm(entity.getBolOutNm());
        dto.setShippingSlipNo(entity.getShippingSlipNo());
        dto.setClientShippingNo(entity.getClientShippingNo());
        dto.setShippingStatus(entity.getShippingStatus());
        dto.setShippingStatusNm(entity.getShippingStatusNm());
        dto.setDeliveryCourseCd(entity.getDeliveryCourseCd());
        dto.setDeliveryCourseNm(entity.getDeliveryCourseNm());
        dto.setCarrierCd(entity.getCarrierCd());
        dto.setCarrierNm(entity.getCarrierNm());
        dto.setSlipNo(entity.getSlipNo());
        dto.setLineNo(entity.getLineNo());
        dto.setProductId(entity.getProductId());
        dto.setInstNum(entity.getInstNum());
        dto.setAllocNum(entity.getAllocNum());
        dto.setStockOutFlg(entity.getStockOutFlg());
        dto.setOplOutFlg(entity.getOplOutFlg());
        dto.setMltOutFlg(entity.getMltOutFlg());
        dto.setTplOutFlg(entity.getTplOutFlg());
        dto.setPlOutFlg(entity.getPlOutFlg());
        dto.setSplOutFlg(entity.getSplOutFlg());
        dto.setPl1OutFlg(entity.getPl1OutFlg());
        dto.setPl2OutFlg(entity.getPl2OutFlg());
        dto.setCaseOutFlg(entity.getCaseOutFlg());
        dto.setInspectionOutFlg(entity.getInspectionOutFlg());
        dto.setSlOutFlg(entity.getSlOutFlg());
        dto.setPackingOutFlg(entity.getPackingOutFlg());
        dto.setInvoiceCreateFlg(entity.getInvoiceCreateFlg());
        dto.setStwOutFlg(entity.getStwOutFlg());
        dto.setOplOutNm(entity.getOplOutNm());
        dto.setMltOutNm(entity.getMltOutNm());
        dto.setTplOutNm(entity.getTplOutNm());
        dto.setPlOutNm(entity.getPlOutNm());
        dto.setSplOutNm(entity.getSplOutNm());
        dto.setPl1OutNm(entity.getPl1OutNm());
        dto.setPl2OutNm(entity.getPl2OutNm());
        dto.setCaseOutNm(entity.getCaseOutNm());
        dto.setInspectionOutNm(entity.getInspectionOutNm());
        dto.setSlOutNm(entity.getSlOutNm());
        dto.setPackingOutNm(entity.getPackingOutNm());
        dto.setInvoiceCreateNm(entity.getInvoiceCreateNm());
        dto.setStwOutNm(entity.getStwOutNm());
        dto.setPickingNum(entity.getPickingNum());
        dto.setInspectionNum(entity.getInspectionNum());
        dto.setLoadingStatus(entity.getLoadingStatus());
        dto.setPickingWorkNo(entity.getPickingWorkNo());
        dto.setDelivUnitNo(entity.getDelivUnitNo());
        dto.setDelivPlanDt(entity.getDelivPlanDt());
        dto.setDelivDt(entity.getDelivDt());
        dto.setDelivTz(entity.getDelivTz());
        dto.setDelivTzNm(entity.getDelivTzNm());
        dto.setMessageNm(entity.getMessageNm());
        dto.setPickingWorkMessage(entity.getPickingWorkMessage());
        dto.setPickingWorkMessageCount(entity.getPickingWorkMessageCount());
        dto.setEmergencyFlg(entity.getEmergencyFlg());
        dto.setUpdDt(entity.getUpdDt());
        dto.setPickingWorkNoCnt(entity.getPickingWorkNoCnt());
        dto.setUpdDtH(entity.getUpdDtH());
        dto.setShippingStopCs(entity.getShippingStopCs());
        dto.setShippingStopCsNm(entity.getShippingStopCsNm());
        dto.setShippingStopPd(entity.getShippingStopPd());
        dto.setShippingStopPdNm(entity.getShippingStopPdNm());
        dto.setForceFixedFlg(entity.getForceFixedFlg());
        dto.setForceFixedFlgNm(entity.getForceFixedFlgNm());
        dto.setNum(entity.getNum());
        dto.setVersionNo(entity.getVersionNo());
        dto.setControlNo(entity.getControlNo());
        reflectDerivedProperty(entity, dto, true);
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<SqlShippingInstListDto> mappingToDtoList(List<SqlShippingInstList> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<SqlShippingInstListDto> dtoList = new ArrayList<SqlShippingInstListDto>();
        for (SqlShippingInstList entity : entityList) {
            SqlShippingInstListDto dto = mappingToDto(entity);
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
    public SqlShippingInstList mappingToEntity(SqlShippingInstListDto dto) {
        if (dto == null) {
            return null;
        }
        SqlShippingInstList entity = new SqlShippingInstList();
        if (needsMapping(dto, dto.getShippingInstHId(), "shippingInstHId")) {
            entity.setShippingInstHId(dto.getShippingInstHId());
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
        if (needsMapping(dto, dto.getWorkDt(), "workDt")) {
            entity.setWorkDt(dto.getWorkDt());
        }
        if (needsMapping(dto, dto.getShippingDt(), "shippingDt")) {
            entity.setShippingDt(dto.getShippingDt());
        }
        if (needsMapping(dto, dto.getPickingBatchNo(), "pickingBatchNo")) {
            entity.setPickingBatchNo(dto.getPickingBatchNo());
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
        if (needsMapping(dto, dto.getBolNo(), "bolNo")) {
            entity.setBolNo(dto.getBolNo());
        }
        if (needsMapping(dto, dto.getBolOutFlg(), "bolOutFlg")) {
            entity.setBolOutFlg(dto.getBolOutFlg());
        }
        if (needsMapping(dto, dto.getBolOutNm(), "bolOutNm")) {
            entity.setBolOutNm(dto.getBolOutNm());
        }
        if (needsMapping(dto, dto.getShippingSlipNo(), "shippingSlipNo")) {
            entity.setShippingSlipNo(dto.getShippingSlipNo());
        }
        if (needsMapping(dto, dto.getClientShippingNo(), "clientShippingNo")) {
            entity.setClientShippingNo(dto.getClientShippingNo());
        }
        if (needsMapping(dto, dto.getShippingStatus(), "shippingStatus")) {
            entity.setShippingStatus(dto.getShippingStatus());
        }
        if (needsMapping(dto, dto.getShippingStatusNm(), "shippingStatusNm")) {
            entity.setShippingStatusNm(dto.getShippingStatusNm());
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
        if (needsMapping(dto, dto.getSlipNo(), "slipNo")) {
            entity.setSlipNo(dto.getSlipNo());
        }
        if (needsMapping(dto, dto.getLineNo(), "lineNo")) {
            entity.setLineNo(dto.getLineNo());
        }
        if (needsMapping(dto, dto.getProductId(), "productId")) {
            entity.setProductId(dto.getProductId());
        }
        if (needsMapping(dto, dto.getInstNum(), "instNum")) {
            entity.setInstNum(dto.getInstNum());
        }
        if (needsMapping(dto, dto.getAllocNum(), "allocNum")) {
            entity.setAllocNum(dto.getAllocNum());
        }
        if (needsMapping(dto, dto.getStockOutFlg(), "stockOutFlg")) {
            entity.setStockOutFlg(dto.getStockOutFlg());
        }
        if (needsMapping(dto, dto.getOplOutFlg(), "oplOutFlg")) {
            entity.setOplOutFlg(dto.getOplOutFlg());
        }
        if (needsMapping(dto, dto.getMltOutFlg(), "mltOutFlg")) {
            entity.setMltOutFlg(dto.getMltOutFlg());
        }
        if (needsMapping(dto, dto.getTplOutFlg(), "tplOutFlg")) {
            entity.setTplOutFlg(dto.getTplOutFlg());
        }
        if (needsMapping(dto, dto.getPlOutFlg(), "plOutFlg")) {
            entity.setPlOutFlg(dto.getPlOutFlg());
        }
        if (needsMapping(dto, dto.getSplOutFlg(), "splOutFlg")) {
            entity.setSplOutFlg(dto.getSplOutFlg());
        }
        if (needsMapping(dto, dto.getPl1OutFlg(), "pl1OutFlg")) {
            entity.setPl1OutFlg(dto.getPl1OutFlg());
        }
        if (needsMapping(dto, dto.getPl2OutFlg(), "pl2OutFlg")) {
            entity.setPl2OutFlg(dto.getPl2OutFlg());
        }
        if (needsMapping(dto, dto.getCaseOutFlg(), "caseOutFlg")) {
            entity.setCaseOutFlg(dto.getCaseOutFlg());
        }
        if (needsMapping(dto, dto.getInspectionOutFlg(), "inspectionOutFlg")) {
            entity.setInspectionOutFlg(dto.getInspectionOutFlg());
        }
        if (needsMapping(dto, dto.getSlOutFlg(), "slOutFlg")) {
            entity.setSlOutFlg(dto.getSlOutFlg());
        }
        if (needsMapping(dto, dto.getPackingOutFlg(), "packingOutFlg")) {
            entity.setPackingOutFlg(dto.getPackingOutFlg());
        }
        if (needsMapping(dto, dto.getInvoiceCreateFlg(), "invoiceCreateFlg")) {
            entity.setInvoiceCreateFlg(dto.getInvoiceCreateFlg());
        }
        if (needsMapping(dto, dto.getStwOutFlg(), "stwOutFlg")) {
            entity.setStwOutFlg(dto.getStwOutFlg());
        }
        if (needsMapping(dto, dto.getOplOutNm(), "oplOutNm")) {
            entity.setOplOutNm(dto.getOplOutNm());
        }
        if (needsMapping(dto, dto.getMltOutNm(), "mltOutNm")) {
            entity.setMltOutNm(dto.getMltOutNm());
        }
        if (needsMapping(dto, dto.getTplOutNm(), "tplOutNm")) {
            entity.setTplOutNm(dto.getTplOutNm());
        }
        if (needsMapping(dto, dto.getPlOutNm(), "plOutNm")) {
            entity.setPlOutNm(dto.getPlOutNm());
        }
        if (needsMapping(dto, dto.getSplOutNm(), "splOutNm")) {
            entity.setSplOutNm(dto.getSplOutNm());
        }
        if (needsMapping(dto, dto.getPl1OutNm(), "pl1OutNm")) {
            entity.setPl1OutNm(dto.getPl1OutNm());
        }
        if (needsMapping(dto, dto.getPl2OutNm(), "pl2OutNm")) {
            entity.setPl2OutNm(dto.getPl2OutNm());
        }
        if (needsMapping(dto, dto.getCaseOutNm(), "caseOutNm")) {
            entity.setCaseOutNm(dto.getCaseOutNm());
        }
        if (needsMapping(dto, dto.getInspectionOutNm(), "inspectionOutNm")) {
            entity.setInspectionOutNm(dto.getInspectionOutNm());
        }
        if (needsMapping(dto, dto.getSlOutNm(), "slOutNm")) {
            entity.setSlOutNm(dto.getSlOutNm());
        }
        if (needsMapping(dto, dto.getPackingOutNm(), "packingOutNm")) {
            entity.setPackingOutNm(dto.getPackingOutNm());
        }
        if (needsMapping(dto, dto.getInvoiceCreateNm(), "invoiceCreateNm")) {
            entity.setInvoiceCreateNm(dto.getInvoiceCreateNm());
        }
        if (needsMapping(dto, dto.getStwOutNm(), "stwOutNm")) {
            entity.setStwOutNm(dto.getStwOutNm());
        }
        if (needsMapping(dto, dto.getPickingNum(), "pickingNum")) {
            entity.setPickingNum(dto.getPickingNum());
        }
        if (needsMapping(dto, dto.getInspectionNum(), "inspectionNum")) {
            entity.setInspectionNum(dto.getInspectionNum());
        }
        if (needsMapping(dto, dto.getLoadingStatus(), "loadingStatus")) {
            entity.setLoadingStatus(dto.getLoadingStatus());
        }
        if (needsMapping(dto, dto.getPickingWorkNo(), "pickingWorkNo")) {
            entity.setPickingWorkNo(dto.getPickingWorkNo());
        }
        if (needsMapping(dto, dto.getDelivUnitNo(), "delivUnitNo")) {
            entity.setDelivUnitNo(dto.getDelivUnitNo());
        }
        if (needsMapping(dto, dto.getDelivPlanDt(), "delivPlanDt")) {
            entity.setDelivPlanDt(dto.getDelivPlanDt());
        }
        if (needsMapping(dto, dto.getDelivDt(), "delivDt")) {
            entity.setDelivDt(dto.getDelivDt());
        }
        if (needsMapping(dto, dto.getDelivTz(), "delivTz")) {
            entity.setDelivTz(dto.getDelivTz());
        }
        if (needsMapping(dto, dto.getDelivTzNm(), "delivTzNm")) {
            entity.setDelivTzNm(dto.getDelivTzNm());
        }
        if (needsMapping(dto, dto.getMessageNm(), "messageNm")) {
            entity.setMessageNm(dto.getMessageNm());
        }
        if (needsMapping(dto, dto.getPickingWorkMessage(), "pickingWorkMessage")) {
            entity.setPickingWorkMessage(dto.getPickingWorkMessage());
        }
        if (needsMapping(dto, dto.getPickingWorkMessageCount(), "pickingWorkMessageCount")) {
            entity.setPickingWorkMessageCount(dto.getPickingWorkMessageCount());
        }
        if (needsMapping(dto, dto.getEmergencyFlg(), "emergencyFlg")) {
            entity.setEmergencyFlg(dto.getEmergencyFlg());
        }
        if (needsMapping(dto, dto.getUpdDt(), "updDt")) {
            entity.setUpdDt(dto.getUpdDt());
        }
        if (needsMapping(dto, dto.getPickingWorkNoCnt(), "pickingWorkNoCnt")) {
            entity.setPickingWorkNoCnt(dto.getPickingWorkNoCnt());
        }
        if (needsMapping(dto, dto.getUpdDtH(), "updDtH")) {
            entity.setUpdDtH(dto.getUpdDtH());
        }
        if (needsMapping(dto, dto.getShippingStopCs(), "shippingStopCs")) {
            entity.setShippingStopCs(dto.getShippingStopCs());
        }
        if (needsMapping(dto, dto.getShippingStopCsNm(), "shippingStopCsNm")) {
            entity.setShippingStopCsNm(dto.getShippingStopCsNm());
        }
        if (needsMapping(dto, dto.getShippingStopPd(), "shippingStopPd")) {
            entity.setShippingStopPd(dto.getShippingStopPd());
        }
        if (needsMapping(dto, dto.getShippingStopPdNm(), "shippingStopPdNm")) {
            entity.setShippingStopPdNm(dto.getShippingStopPdNm());
        }
        if (needsMapping(dto, dto.getForceFixedFlg(), "forceFixedFlg")) {
            entity.setForceFixedFlg(dto.getForceFixedFlg());
        }
        if (needsMapping(dto, dto.getForceFixedFlgNm(), "forceFixedFlgNm")) {
            entity.setForceFixedFlgNm(dto.getForceFixedFlgNm());
        }
        if (needsMapping(dto, dto.getNum(), "num")) {
            entity.setNum(dto.getNum());
        }
        if (needsMapping(dto, dto.getVersionNo(), "versionNo")) {
            entity.setVersionNo(dto.getVersionNo());
        }
        if (needsMapping(dto, dto.getControlNo(), "controlNo")) {
            entity.setControlNo(dto.getControlNo());
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
    protected boolean needsMapping(SqlShippingInstListDto dto, Object value, String propName) {
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
    public List<SqlShippingInstList> mappingToEntityList(List<SqlShippingInstListDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<SqlShippingInstList> entityList = new ArrayList<SqlShippingInstList>();
        for (SqlShippingInstListDto dto : dtoList) {
            SqlShippingInstList entity = mappingToEntity(dto);
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
    public SqlShippingInstListDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (SqlShippingInstListDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public SqlShippingInstListDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (SqlShippingInstListDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public SqlShippingInstListDtoMapper reverseReference() {
        setReverseReference(true);
        return (SqlShippingInstListDtoMapper)this;
    }
}
