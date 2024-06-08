package com.oneslogi.base.dbflute.dtomapper.bs;

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
import com.oneslogi.base.dbflute.exentity.*;
import com.oneslogi.base.dbflute.dto.*;
import com.oneslogi.base.dbflute.dtomapper.*;

/**
 * The DTO mapper of E_RETURNED_RECEIVE_PLAN as TABLE. <br>
 * 返品入庫予定受信テーブル
 * <pre>
 * [primary-key]
 *     RETURNED_RECEIVE_PLAN_ID
 *
 * [column]
 *     RETURNED_RECEIVE_PLAN_ID, RECEIVE_CD, RECEIVE_ROW_ID, IMPORT_FLG, ERROR_FLG, ERROR_MESSAGE_CD, HEADER_FLG, SORT_BS_CD, DELIVAY_CENTER_CD, ORDER_GROUP, SALE_DATETIME, CUSTOMER_CD, SLIP_TYPE, SLIP_NO, SEQUENCE_NO, ORDER_DATE, SHIPING_DATE, OTORGCD, ORDORGCD, RLYBSCD, DIRECTION_CD, PISTON_ID, DELIVALY_RANK, BULK_DELIVALY_NO, DIVMTD, ZZHDVRID, CUSTOMER_NM, HEADER_PRICE_SALE, ZREGPRCC, TAX, ZZGODFPC, ZZGODSPC, ZZGODCTX, COMPANY_CD, SALE_TYPE, HVRT_REASON, HVRT_INOUT_DATE, CNG_PRT_SLIP_NO, PROCESS_TYPE, EOS_ORD_AFT_FLG, EOS_SLIP_NO, HDRD_BX_TYPE, INOT_RFSL_TYPE, BX_MNT_RFSL_TYPE, REPORT_MERFE_TIMING, REPORT_OUT_DATETIME, CLIENT_ID, KWMENG, STATUS_CD, STG_VAL, DETAIL_PRICE_SALE, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     RETURNED_RECEIVE_PLAN_ID
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
public abstract class BsEReturnedReceivePlanDtoMapper implements DtoMapper<EReturnedReceivePlan, EReturnedReceivePlanDto>, Serializable {

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
    public BsEReturnedReceivePlanDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsEReturnedReceivePlanDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public EReturnedReceivePlanDto mappingToDto(EReturnedReceivePlan entity) {
        if (entity == null) {
            return null;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        EReturnedReceivePlanDto dto = new EReturnedReceivePlanDto();
        dto.setReturnedReceivePlanId(entity.getReturnedReceivePlanId());
        dto.setReceiveCd(entity.getReceiveCd());
        dto.setReceiveRowId(entity.getReceiveRowId());
        dto.setImportFlg(entity.getImportFlg());
        dto.setErrorFlg(entity.getErrorFlg());
        dto.setErrorMessageCd(entity.getErrorMessageCd());
        dto.setHeaderFlg(entity.getHeaderFlg());
        dto.setSortBsCd(entity.getSortBsCd());
        dto.setDelivayCenterCd(entity.getDelivayCenterCd());
        dto.setOrderGroup(entity.getOrderGroup());
        dto.setSaleDatetime(entity.getSaleDatetime());
        dto.setCustomerCd(entity.getCustomerCd());
        dto.setSlipType(entity.getSlipType());
        dto.setSlipNo(entity.getSlipNo());
        dto.setSequenceNo(entity.getSequenceNo());
        dto.setOrderDate(entity.getOrderDate());
        dto.setShipingDate(entity.getShipingDate());
        dto.setOtorgcd(entity.getOtorgcd());
        dto.setOrdorgcd(entity.getOrdorgcd());
        dto.setRlybscd(entity.getRlybscd());
        dto.setDirectionCd(entity.getDirectionCd());
        dto.setPistonId(entity.getPistonId());
        dto.setDelivalyRank(entity.getDelivalyRank());
        dto.setBulkDelivalyNo(entity.getBulkDelivalyNo());
        dto.setDivmtd(entity.getDivmtd());
        dto.setZzhdvrid(entity.getZzhdvrid());
        dto.setCustomerNm(entity.getCustomerNm());
        dto.setHeaderPriceSale(entity.getHeaderPriceSale());
        dto.setZregprcc(entity.getZregprcc());
        dto.setTax(entity.getTax());
        dto.setZzgodfpc(entity.getZzgodfpc());
        dto.setZzgodspc(entity.getZzgodspc());
        dto.setZzgodctx(entity.getZzgodctx());
        dto.setCompanyCd(entity.getCompanyCd());
        dto.setSaleType(entity.getSaleType());
        dto.setHvrtReason(entity.getHvrtReason());
        dto.setHvrtInoutDate(entity.getHvrtInoutDate());
        dto.setCngPrtSlipNo(entity.getCngPrtSlipNo());
        dto.setProcessType(entity.getProcessType());
        dto.setEosOrdAftFlg(entity.getEosOrdAftFlg());
        dto.setEosSlipNo(entity.getEosSlipNo());
        dto.setHdrdBxType(entity.getHdrdBxType());
        dto.setInotRfslType(entity.getInotRfslType());
        dto.setBxMntRfslType(entity.getBxMntRfslType());
        dto.setReportMerfeTiming(entity.getReportMerfeTiming());
        dto.setReportOutDatetime(entity.getReportOutDatetime());
        dto.setClientId(entity.getClientId());
        dto.setKwmeng(entity.getKwmeng());
        dto.setStatusCd(entity.getStatusCd());
        dto.setStgVal(entity.getStgVal());
        dto.setDetailPriceSale(entity.getDetailPriceSale());
        if (!exceptCommonColumn) {
            dto.setDelFlg(entity.getDelFlg());
        }
        if (!exceptCommonColumn) {
            dto.setVersionNo(entity.getVersionNo());
        }
        if (!exceptCommonColumn) {
            dto.setControlNo(entity.getControlNo());
        }
        if (!exceptCommonColumn) {
            dto.setAddDt(entity.getAddDt());
        }
        if (!exceptCommonColumn) {
            dto.setAddUser(entity.getAddUser());
        }
        if (!exceptCommonColumn) {
            dto.setAddProcess(entity.getAddProcess());
        }
        if (!exceptCommonColumn) {
            dto.setUpdDt(entity.getUpdDt());
        }
        if (!exceptCommonColumn) {
            dto.setUpdUser(entity.getUpdUser());
        }
        if (!exceptCommonColumn) {
            dto.setUpdProcess(entity.getUpdProcess());
        }
        reflectDerivedProperty(entity, dto, true);
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<EReturnedReceivePlanDto> mappingToDtoList(List<EReturnedReceivePlan> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<EReturnedReceivePlanDto> dtoList = new ArrayList<EReturnedReceivePlanDto>();
        for (EReturnedReceivePlan entity : entityList) {
            EReturnedReceivePlanDto dto = mappingToDto(entity);
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
    public EReturnedReceivePlan mappingToEntity(EReturnedReceivePlanDto dto) {
        if (dto == null) {
            return null;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        EReturnedReceivePlan entity = new EReturnedReceivePlan();
        if (needsMapping(dto, dto.getReturnedReceivePlanId(), "returnedReceivePlanId")) {
            entity.setReturnedReceivePlanId(dto.getReturnedReceivePlanId());
        }
        if (needsMapping(dto, dto.getReceiveCd(), "receiveCd")) {
            entity.setReceiveCd(dto.getReceiveCd());
        }
        if (needsMapping(dto, dto.getReceiveRowId(), "receiveRowId")) {
            entity.setReceiveRowId(dto.getReceiveRowId());
        }
        if (needsMapping(dto, dto.getImportFlg(), "importFlg")) {
            entity.setImportFlg(dto.getImportFlg());
        }
        if (needsMapping(dto, dto.getErrorFlg(), "errorFlg")) {
            entity.setErrorFlg(dto.getErrorFlg());
        }
        if (needsMapping(dto, dto.getErrorMessageCd(), "errorMessageCd")) {
            entity.setErrorMessageCd(dto.getErrorMessageCd());
        }
        if (needsMapping(dto, dto.getHeaderFlg(), "headerFlg")) {
            entity.setHeaderFlg(dto.getHeaderFlg());
        }
        if (needsMapping(dto, dto.getSortBsCd(), "sortBsCd")) {
            entity.setSortBsCd(dto.getSortBsCd());
        }
        if (needsMapping(dto, dto.getDelivayCenterCd(), "delivayCenterCd")) {
            entity.setDelivayCenterCd(dto.getDelivayCenterCd());
        }
        if (needsMapping(dto, dto.getOrderGroup(), "orderGroup")) {
            entity.setOrderGroup(dto.getOrderGroup());
        }
        if (needsMapping(dto, dto.getSaleDatetime(), "saleDatetime")) {
            entity.setSaleDatetime(dto.getSaleDatetime());
        }
        if (needsMapping(dto, dto.getCustomerCd(), "customerCd")) {
            entity.setCustomerCd(dto.getCustomerCd());
        }
        if (needsMapping(dto, dto.getSlipType(), "slipType")) {
            entity.setSlipType(dto.getSlipType());
        }
        if (needsMapping(dto, dto.getSlipNo(), "slipNo")) {
            entity.setSlipNo(dto.getSlipNo());
        }
        if (needsMapping(dto, dto.getSequenceNo(), "sequenceNo")) {
            entity.setSequenceNo(dto.getSequenceNo());
        }
        if (needsMapping(dto, dto.getOrderDate(), "orderDate")) {
            entity.setOrderDate(dto.getOrderDate());
        }
        if (needsMapping(dto, dto.getShipingDate(), "shipingDate")) {
            entity.setShipingDate(dto.getShipingDate());
        }
        if (needsMapping(dto, dto.getOtorgcd(), "otorgcd")) {
            entity.setOtorgcd(dto.getOtorgcd());
        }
        if (needsMapping(dto, dto.getOrdorgcd(), "ordorgcd")) {
            entity.setOrdorgcd(dto.getOrdorgcd());
        }
        if (needsMapping(dto, dto.getRlybscd(), "rlybscd")) {
            entity.setRlybscd(dto.getRlybscd());
        }
        if (needsMapping(dto, dto.getDirectionCd(), "directionCd")) {
            entity.setDirectionCd(dto.getDirectionCd());
        }
        if (needsMapping(dto, dto.getPistonId(), "pistonId")) {
            entity.setPistonId(dto.getPistonId());
        }
        if (needsMapping(dto, dto.getDelivalyRank(), "delivalyRank")) {
            entity.setDelivalyRank(dto.getDelivalyRank());
        }
        if (needsMapping(dto, dto.getBulkDelivalyNo(), "bulkDelivalyNo")) {
            entity.setBulkDelivalyNo(dto.getBulkDelivalyNo());
        }
        if (needsMapping(dto, dto.getDivmtd(), "divmtd")) {
            entity.setDivmtd(dto.getDivmtd());
        }
        if (needsMapping(dto, dto.getZzhdvrid(), "zzhdvrid")) {
            entity.setZzhdvrid(dto.getZzhdvrid());
        }
        if (needsMapping(dto, dto.getCustomerNm(), "customerNm")) {
            entity.setCustomerNm(dto.getCustomerNm());
        }
        if (needsMapping(dto, dto.getHeaderPriceSale(), "headerPriceSale")) {
            entity.setHeaderPriceSale(dto.getHeaderPriceSale());
        }
        if (needsMapping(dto, dto.getZregprcc(), "zregprcc")) {
            entity.setZregprcc(dto.getZregprcc());
        }
        if (needsMapping(dto, dto.getTax(), "tax")) {
            entity.setTax(dto.getTax());
        }
        if (needsMapping(dto, dto.getZzgodfpc(), "zzgodfpc")) {
            entity.setZzgodfpc(dto.getZzgodfpc());
        }
        if (needsMapping(dto, dto.getZzgodspc(), "zzgodspc")) {
            entity.setZzgodspc(dto.getZzgodspc());
        }
        if (needsMapping(dto, dto.getZzgodctx(), "zzgodctx")) {
            entity.setZzgodctx(dto.getZzgodctx());
        }
        if (needsMapping(dto, dto.getCompanyCd(), "companyCd")) {
            entity.setCompanyCd(dto.getCompanyCd());
        }
        if (needsMapping(dto, dto.getSaleType(), "saleType")) {
            entity.setSaleType(dto.getSaleType());
        }
        if (needsMapping(dto, dto.getHvrtReason(), "hvrtReason")) {
            entity.setHvrtReason(dto.getHvrtReason());
        }
        if (needsMapping(dto, dto.getHvrtInoutDate(), "hvrtInoutDate")) {
            entity.setHvrtInoutDate(dto.getHvrtInoutDate());
        }
        if (needsMapping(dto, dto.getCngPrtSlipNo(), "cngPrtSlipNo")) {
            entity.setCngPrtSlipNo(dto.getCngPrtSlipNo());
        }
        if (needsMapping(dto, dto.getProcessType(), "processType")) {
            entity.setProcessType(dto.getProcessType());
        }
        if (needsMapping(dto, dto.getEosOrdAftFlg(), "eosOrdAftFlg")) {
            entity.setEosOrdAftFlg(dto.getEosOrdAftFlg());
        }
        if (needsMapping(dto, dto.getEosSlipNo(), "eosSlipNo")) {
            entity.setEosSlipNo(dto.getEosSlipNo());
        }
        if (needsMapping(dto, dto.getHdrdBxType(), "hdrdBxType")) {
            entity.setHdrdBxType(dto.getHdrdBxType());
        }
        if (needsMapping(dto, dto.getInotRfslType(), "inotRfslType")) {
            entity.setInotRfslType(dto.getInotRfslType());
        }
        if (needsMapping(dto, dto.getBxMntRfslType(), "bxMntRfslType")) {
            entity.setBxMntRfslType(dto.getBxMntRfslType());
        }
        if (needsMapping(dto, dto.getReportMerfeTiming(), "reportMerfeTiming")) {
            entity.setReportMerfeTiming(dto.getReportMerfeTiming());
        }
        if (needsMapping(dto, dto.getReportOutDatetime(), "reportOutDatetime")) {
            entity.setReportOutDatetime(dto.getReportOutDatetime());
        }
        if (needsMapping(dto, dto.getClientId(), "clientId")) {
            entity.setClientId(dto.getClientId());
        }
        if (needsMapping(dto, dto.getKwmeng(), "kwmeng")) {
            entity.setKwmeng(dto.getKwmeng());
        }
        if (needsMapping(dto, dto.getStatusCd(), "statusCd")) {
            entity.setStatusCd(dto.getStatusCd());
        }
        if (needsMapping(dto, dto.getStgVal(), "stgVal")) {
            entity.setStgVal(dto.getStgVal());
        }
        if (needsMapping(dto, dto.getDetailPriceSale(), "detailPriceSale")) {
            entity.setDetailPriceSale(dto.getDetailPriceSale());
        }
        if (needsMapping(dto, dto.getDelFlg(), "delFlg") && !exceptCommonColumn) {
            entity.setDelFlgAsDelFlg(CDef.DelFlg.codeOf(dto.getDelFlg()));
        }
        if (needsMapping(dto, dto.getVersionNo(), "versionNo") && !exceptCommonColumn) {
            entity.setVersionNo(dto.getVersionNo());
        }
        if (needsMapping(dto, dto.getControlNo(), "controlNo") && !exceptCommonColumn) {
            entity.setControlNo(dto.getControlNo());
        }
        if (needsMapping(dto, dto.getAddDt(), "addDt") && !exceptCommonColumn) {
            entity.setAddDt(dto.getAddDt());
        }
        if (needsMapping(dto, dto.getAddUser(), "addUser") && !exceptCommonColumn) {
            entity.setAddUser(dto.getAddUser());
        }
        if (needsMapping(dto, dto.getAddProcess(), "addProcess") && !exceptCommonColumn) {
            entity.setAddProcess(dto.getAddProcess());
        }
        if (needsMapping(dto, dto.getUpdDt(), "updDt") && !exceptCommonColumn) {
            entity.setUpdDt(dto.getUpdDt());
        }
        if (needsMapping(dto, dto.getUpdUser(), "updUser") && !exceptCommonColumn) {
            entity.setUpdUser(dto.getUpdUser());
        }
        if (needsMapping(dto, dto.getUpdProcess(), "updProcess") && !exceptCommonColumn) {
            entity.setUpdProcess(dto.getUpdProcess());
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
    protected boolean needsMapping(EReturnedReceivePlanDto dto, Object value, String propName) {
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
    public List<EReturnedReceivePlan> mappingToEntityList(List<EReturnedReceivePlanDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<EReturnedReceivePlan> entityList = new ArrayList<EReturnedReceivePlan>();
        for (EReturnedReceivePlanDto dto : dtoList) {
            EReturnedReceivePlan entity = mappingToEntity(dto);
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
    public EReturnedReceivePlanDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (EReturnedReceivePlanDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public EReturnedReceivePlanDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (EReturnedReceivePlanDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public EReturnedReceivePlanDtoMapper reverseReference() {
        setReverseReference(true);
        return (EReturnedReceivePlanDtoMapper)this;
    }
}
