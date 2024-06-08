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
 * The DTO mapper of SqlPickingListPrint. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     CLIENT_ID, CLIENT_CD, CLIENT_NM, CENTER_ID, CENTER_CD, CENTER_NM, WORK_DT, SHIPPING_DT, PICKING_BATCH_NO, PICKING_WORK_NO, SUPPLY_CUSTOMER_CD, SUPPLY_CUSTOMER_NM, DELIVERY_COURSE_CD, DELIVERY_COURSE_NM, CARRIER_CD, CARRIER_NM, SLIP_NO, LINE_NO, PRODUCT_ID, INST_NUM, ALLOC_NUM, STOCK_OUT_FLG, OPL_OUT_FLG, OPL_OUT_NM, TPL_OUT_FLG, TPL_OUT_NM, MLT_OUT_FLG, MLT_OUT_NM, SPL_OUT_FLG, SPL_OUT_NM, PL1_OUT_FLG, PL1_OUT_NM, PL1_OUT_DT, PL_OUT_FLG, PL_OUT_NM, SL_OUT_FLG, SL_OUT_NM, PL2_OUT_FLG, PL2_OUT_NM, PL2_OUT_DT, CASE_OUT_FLG, CASE_OUT_NM, CASE_OUT_DT, PICKING_GROUP_NO, EMERGENCY_FLG, UPD_DT, NUM, PACKING_CNT, PACKING_CASE_CNT, PACKING_MIXED_CNT, MULTI_PIC_FLG, MULTI_PIC_FLG_NM, TAG_OUT_FLG, TAG_OUT_FLG_NM, TAG_OUT_DT, SGL_ROW_PIC_FLG, SGL_ROW_PIC_NM, CASE_PIC_FLG, CASE_PIC_NM
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
public abstract class BsSqlPickingListPrintDtoMapper implements DtoMapper<SqlPickingListPrint, SqlPickingListPrintDto>, Serializable {

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
    public BsSqlPickingListPrintDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsSqlPickingListPrintDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public SqlPickingListPrintDto mappingToDto(SqlPickingListPrint entity) {
        if (entity == null) {
            return null;
        }
        SqlPickingListPrintDto dto = new SqlPickingListPrintDto();
        dto.setClientId(entity.getClientId());
        dto.setClientCd(entity.getClientCd());
        dto.setClientNm(entity.getClientNm());
        dto.setCenterId(entity.getCenterId());
        dto.setCenterCd(entity.getCenterCd());
        dto.setCenterNm(entity.getCenterNm());
        dto.setWorkDt(entity.getWorkDt());
        dto.setShippingDt(entity.getShippingDt());
        dto.setPickingBatchNo(entity.getPickingBatchNo());
        dto.setPickingWorkNo(entity.getPickingWorkNo());
        dto.setSupplyCustomerCd(entity.getSupplyCustomerCd());
        dto.setSupplyCustomerNm(entity.getSupplyCustomerNm());
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
        dto.setOplOutNm(entity.getOplOutNm());
        dto.setTplOutFlg(entity.getTplOutFlg());
        dto.setTplOutNm(entity.getTplOutNm());
        dto.setMltOutFlg(entity.getMltOutFlg());
        dto.setMltOutNm(entity.getMltOutNm());
        dto.setSplOutFlg(entity.getSplOutFlg());
        dto.setSplOutNm(entity.getSplOutNm());
        dto.setPl1OutFlg(entity.getPl1OutFlg());
        dto.setPl1OutNm(entity.getPl1OutNm());
        dto.setPl1OutDt(entity.getPl1OutDt());
        dto.setPlOutFlg(entity.getPlOutFlg());
        dto.setPlOutNm(entity.getPlOutNm());
        dto.setSlOutFlg(entity.getSlOutFlg());
        dto.setSlOutNm(entity.getSlOutNm());
        dto.setPl2OutFlg(entity.getPl2OutFlg());
        dto.setPl2OutNm(entity.getPl2OutNm());
        dto.setPl2OutDt(entity.getPl2OutDt());
        dto.setCaseOutFlg(entity.getCaseOutFlg());
        dto.setCaseOutNm(entity.getCaseOutNm());
        dto.setCaseOutDt(entity.getCaseOutDt());
        dto.setPickingGroupNo(entity.getPickingGroupNo());
        dto.setEmergencyFlg(entity.getEmergencyFlg());
        dto.setUpdDt(entity.getUpdDt());
        dto.setNum(entity.getNum());
        dto.setPackingCnt(entity.getPackingCnt());
        dto.setPackingCaseCnt(entity.getPackingCaseCnt());
        dto.setPackingMixedCnt(entity.getPackingMixedCnt());
        dto.setMultiPicFlg(entity.getMultiPicFlg());
        dto.setMultiPicFlgNm(entity.getMultiPicFlgNm());
        dto.setTagOutFlg(entity.getTagOutFlg());
        dto.setTagOutFlgNm(entity.getTagOutFlgNm());
        dto.setTagOutDt(entity.getTagOutDt());
        dto.setSglRowPicFlg(entity.getSglRowPicFlg());
        dto.setSglRowPicNm(entity.getSglRowPicNm());
        dto.setCasePicFlg(entity.getCasePicFlg());
        dto.setCasePicNm(entity.getCasePicNm());
        reflectDerivedProperty(entity, dto, true);
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<SqlPickingListPrintDto> mappingToDtoList(List<SqlPickingListPrint> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<SqlPickingListPrintDto> dtoList = new ArrayList<SqlPickingListPrintDto>();
        for (SqlPickingListPrint entity : entityList) {
            SqlPickingListPrintDto dto = mappingToDto(entity);
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
    public SqlPickingListPrint mappingToEntity(SqlPickingListPrintDto dto) {
        if (dto == null) {
            return null;
        }
        SqlPickingListPrint entity = new SqlPickingListPrint();
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
        if (needsMapping(dto, dto.getPickingWorkNo(), "pickingWorkNo")) {
            entity.setPickingWorkNo(dto.getPickingWorkNo());
        }
        if (needsMapping(dto, dto.getSupplyCustomerCd(), "supplyCustomerCd")) {
            entity.setSupplyCustomerCd(dto.getSupplyCustomerCd());
        }
        if (needsMapping(dto, dto.getSupplyCustomerNm(), "supplyCustomerNm")) {
            entity.setSupplyCustomerNm(dto.getSupplyCustomerNm());
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
        if (needsMapping(dto, dto.getOplOutNm(), "oplOutNm")) {
            entity.setOplOutNm(dto.getOplOutNm());
        }
        if (needsMapping(dto, dto.getTplOutFlg(), "tplOutFlg")) {
            entity.setTplOutFlg(dto.getTplOutFlg());
        }
        if (needsMapping(dto, dto.getTplOutNm(), "tplOutNm")) {
            entity.setTplOutNm(dto.getTplOutNm());
        }
        if (needsMapping(dto, dto.getMltOutFlg(), "mltOutFlg")) {
            entity.setMltOutFlg(dto.getMltOutFlg());
        }
        if (needsMapping(dto, dto.getMltOutNm(), "mltOutNm")) {
            entity.setMltOutNm(dto.getMltOutNm());
        }
        if (needsMapping(dto, dto.getSplOutFlg(), "splOutFlg")) {
            entity.setSplOutFlg(dto.getSplOutFlg());
        }
        if (needsMapping(dto, dto.getSplOutNm(), "splOutNm")) {
            entity.setSplOutNm(dto.getSplOutNm());
        }
        if (needsMapping(dto, dto.getPl1OutFlg(), "pl1OutFlg")) {
            entity.setPl1OutFlg(dto.getPl1OutFlg());
        }
        if (needsMapping(dto, dto.getPl1OutNm(), "pl1OutNm")) {
            entity.setPl1OutNm(dto.getPl1OutNm());
        }
        if (needsMapping(dto, dto.getPl1OutDt(), "pl1OutDt")) {
            entity.setPl1OutDt(dto.getPl1OutDt());
        }
        if (needsMapping(dto, dto.getPlOutFlg(), "plOutFlg")) {
            entity.setPlOutFlg(dto.getPlOutFlg());
        }
        if (needsMapping(dto, dto.getPlOutNm(), "plOutNm")) {
            entity.setPlOutNm(dto.getPlOutNm());
        }
        if (needsMapping(dto, dto.getSlOutFlg(), "slOutFlg")) {
            entity.setSlOutFlg(dto.getSlOutFlg());
        }
        if (needsMapping(dto, dto.getSlOutNm(), "slOutNm")) {
            entity.setSlOutNm(dto.getSlOutNm());
        }
        if (needsMapping(dto, dto.getPl2OutFlg(), "pl2OutFlg")) {
            entity.setPl2OutFlg(dto.getPl2OutFlg());
        }
        if (needsMapping(dto, dto.getPl2OutNm(), "pl2OutNm")) {
            entity.setPl2OutNm(dto.getPl2OutNm());
        }
        if (needsMapping(dto, dto.getPl2OutDt(), "pl2OutDt")) {
            entity.setPl2OutDt(dto.getPl2OutDt());
        }
        if (needsMapping(dto, dto.getCaseOutFlg(), "caseOutFlg")) {
            entity.setCaseOutFlg(dto.getCaseOutFlg());
        }
        if (needsMapping(dto, dto.getCaseOutNm(), "caseOutNm")) {
            entity.setCaseOutNm(dto.getCaseOutNm());
        }
        if (needsMapping(dto, dto.getCaseOutDt(), "caseOutDt")) {
            entity.setCaseOutDt(dto.getCaseOutDt());
        }
        if (needsMapping(dto, dto.getPickingGroupNo(), "pickingGroupNo")) {
            entity.setPickingGroupNo(dto.getPickingGroupNo());
        }
        if (needsMapping(dto, dto.getEmergencyFlg(), "emergencyFlg")) {
            entity.setEmergencyFlg(dto.getEmergencyFlg());
        }
        if (needsMapping(dto, dto.getUpdDt(), "updDt")) {
            entity.setUpdDt(dto.getUpdDt());
        }
        if (needsMapping(dto, dto.getNum(), "num")) {
            entity.setNum(dto.getNum());
        }
        if (needsMapping(dto, dto.getPackingCnt(), "packingCnt")) {
            entity.setPackingCnt(dto.getPackingCnt());
        }
        if (needsMapping(dto, dto.getPackingCaseCnt(), "packingCaseCnt")) {
            entity.setPackingCaseCnt(dto.getPackingCaseCnt());
        }
        if (needsMapping(dto, dto.getPackingMixedCnt(), "packingMixedCnt")) {
            entity.setPackingMixedCnt(dto.getPackingMixedCnt());
        }
        if (needsMapping(dto, dto.getMultiPicFlg(), "multiPicFlg")) {
            entity.setMultiPicFlgAsMultiPicFlg(CDef.MultiPicFlg.codeOf(dto.getMultiPicFlg()));
        }
        if (needsMapping(dto, dto.getMultiPicFlgNm(), "multiPicFlgNm")) {
            entity.setMultiPicFlgNm(dto.getMultiPicFlgNm());
        }
        if (needsMapping(dto, dto.getTagOutFlg(), "tagOutFlg")) {
            entity.setTagOutFlg(dto.getTagOutFlg());
        }
        if (needsMapping(dto, dto.getTagOutFlgNm(), "tagOutFlgNm")) {
            entity.setTagOutFlgNm(dto.getTagOutFlgNm());
        }
        if (needsMapping(dto, dto.getTagOutDt(), "tagOutDt")) {
            entity.setTagOutDt(dto.getTagOutDt());
        }
        if (needsMapping(dto, dto.getSglRowPicFlg(), "sglRowPicFlg")) {
            entity.setSglRowPicFlgAsSglRowPicFlg(CDef.SglRowPicFlg.codeOf(dto.getSglRowPicFlg()));
        }
        if (needsMapping(dto, dto.getSglRowPicNm(), "sglRowPicNm")) {
            entity.setSglRowPicNm(dto.getSglRowPicNm());
        }
        if (needsMapping(dto, dto.getCasePicFlg(), "casePicFlg")) {
            entity.setCasePicFlg(dto.getCasePicFlg());
        }
        if (needsMapping(dto, dto.getCasePicNm(), "casePicNm")) {
            entity.setCasePicNm(dto.getCasePicNm());
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
    protected boolean needsMapping(SqlPickingListPrintDto dto, Object value, String propName) {
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
    public List<SqlPickingListPrint> mappingToEntityList(List<SqlPickingListPrintDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<SqlPickingListPrint> entityList = new ArrayList<SqlPickingListPrint>();
        for (SqlPickingListPrintDto dto : dtoList) {
            SqlPickingListPrint entity = mappingToEntity(dto);
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
    public SqlPickingListPrintDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (SqlPickingListPrintDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public SqlPickingListPrintDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (SqlPickingListPrintDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public SqlPickingListPrintDtoMapper reverseReference() {
        setReverseReference(true);
        return (SqlPickingListPrintDtoMapper)this;
    }
}
