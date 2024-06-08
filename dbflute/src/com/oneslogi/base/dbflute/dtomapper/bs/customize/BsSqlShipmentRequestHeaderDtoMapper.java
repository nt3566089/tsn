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
 * The DTO mapper of SqlShipmentRequestHeader. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     CLIENT_ID, CLIENT_CD, CENTER_ID, CENTER_CD, WAREHOUSE_ID, COMP_ID, COMP_CD, DELIVERY_COURSE_ID, DELIVERY_COURSE_CD, PICKING_WORK_NO, SHIPPING_SLIP_NO, CLIENT_SHIPPING_NO, DELIV_CUMISTOMER_CD, DELIV_CUSTOMER_NM, DELIV_ADDRESS_SUPPLY, DELIV_ADDRESS1, DELIV_ADDRESS2, DELIV_ADDRESS3, SHP_TO_CITY, SHP_TO_STATE, DELIV_ZIP_CD, PUBLIC_CD, DELIV_TEL_NO, PAYMENT_TERM, COLLECT_ACCOUNT_NO_BILL_TO, COLLECT_ZIP_CD_BILL_TO, COLLECT_COUNTRY_CD_BILL_TO, PAYMENT_TERM_CD_TAXES_TO, COLLECT_ACCOUNT_NO_TAXES_TO, COLLECT_ZIP_CD_TAXES_TO, COLLECT_COUNTRY_CD_TAXES_TO, COD_PAYMENT_TERM_CD, COD_AMOUNT, COD_FEE_PAYER, TERMS_OF_SALES, BROKER_NAME, BROKER_PHONE_NO, BROKER_FAX_NO, SAT_DELIVERY_FLG, RESIDENTIAL_DELIVERY_FLG, COD_FLG, SIGNATURE_REQUIRED_FLG, SIGNATURE_RELEASE_FLG, CALL_BEFORE_DELIVERY_FLG, FREEZABLE_PROTECTION_FLG, GUARANTEED_PLUS_FLG, RESIDENTIAL_PICKUP_FLG, DO_NOT_STACK_STACK_FLG, LIMITED_ACCESS_DELIVERY_FLG, LIMITED_ACCESS_PICKUP_FLG, OVER_SIZED_FLG, POISON_FLG, FOOG_FLG, LIFTGATE_DELIVERY_PREPAID_FLG, LIFTGATE_DELIVERY_COLLECT_FLG, LIFTGATE_PICKUP_PREPAID_FLG, LIFTGATE_PICKUP_COLLECT_FLG, INSIDE_DELIVERY_PREPAID_FLG, INSIDE_DELIVERY_COLLECT_FLG, INSIDE_PICKUP_PREPAID_FLG, INSIDE_PICKUP_COLLECT_FLG
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
public abstract class BsSqlShipmentRequestHeaderDtoMapper implements DtoMapper<SqlShipmentRequestHeader, SqlShipmentRequestHeaderDto>, Serializable {

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
    public BsSqlShipmentRequestHeaderDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsSqlShipmentRequestHeaderDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public SqlShipmentRequestHeaderDto mappingToDto(SqlShipmentRequestHeader entity) {
        if (entity == null) {
            return null;
        }
        SqlShipmentRequestHeaderDto dto = new SqlShipmentRequestHeaderDto();
        dto.setClientId(entity.getClientId());
        dto.setClientCd(entity.getClientCd());
        dto.setCenterId(entity.getCenterId());
        dto.setCenterCd(entity.getCenterCd());
        dto.setWarehouseId(entity.getWarehouseId());
        dto.setCompId(entity.getCompId());
        dto.setCompCd(entity.getCompCd());
        dto.setDeliveryCourseId(entity.getDeliveryCourseId());
        dto.setDeliveryCourseCd(entity.getDeliveryCourseCd());
        dto.setPickingWorkNo(entity.getPickingWorkNo());
        dto.setShippingSlipNo(entity.getShippingSlipNo());
        dto.setClientShippingNo(entity.getClientShippingNo());
        dto.setDelivCumistomerCd(entity.getDelivCumistomerCd());
        dto.setDelivCustomerNm(entity.getDelivCustomerNm());
        dto.setDelivAddressSupply(entity.getDelivAddressSupply());
        dto.setDelivAddress1(entity.getDelivAddress1());
        dto.setDelivAddress2(entity.getDelivAddress2());
        dto.setDelivAddress3(entity.getDelivAddress3());
        dto.setShpToCity(entity.getShpToCity());
        dto.setShpToState(entity.getShpToState());
        dto.setDelivZipCd(entity.getDelivZipCd());
        dto.setPublicCd(entity.getPublicCd());
        dto.setDelivTelNo(entity.getDelivTelNo());
        dto.setPaymentTerm(entity.getPaymentTerm());
        dto.setCollectAccountNoBillTo(entity.getCollectAccountNoBillTo());
        dto.setCollectZipCdBillTo(entity.getCollectZipCdBillTo());
        dto.setCollectCountryCdBillTo(entity.getCollectCountryCdBillTo());
        dto.setPaymentTermCdTaxesTo(entity.getPaymentTermCdTaxesTo());
        dto.setCollectAccountNoTaxesTo(entity.getCollectAccountNoTaxesTo());
        dto.setCollectZipCdTaxesTo(entity.getCollectZipCdTaxesTo());
        dto.setCollectCountryCdTaxesTo(entity.getCollectCountryCdTaxesTo());
        dto.setCodPaymentTermCd(entity.getCodPaymentTermCd());
        dto.setCodAmount(entity.getCodAmount());
        dto.setCodFeePayer(entity.getCodFeePayer());
        dto.setTermsOfSales(entity.getTermsOfSales());
        dto.setBrokerName(entity.getBrokerName());
        dto.setBrokerPhoneNo(entity.getBrokerPhoneNo());
        dto.setBrokerFaxNo(entity.getBrokerFaxNo());
        dto.setSatDeliveryFlg(entity.getSatDeliveryFlg());
        dto.setResidentialDeliveryFlg(entity.getResidentialDeliveryFlg());
        dto.setCodFlg(entity.getCodFlg());
        dto.setSignatureRequiredFlg(entity.getSignatureRequiredFlg());
        dto.setSignatureReleaseFlg(entity.getSignatureReleaseFlg());
        dto.setCallBeforeDeliveryFlg(entity.getCallBeforeDeliveryFlg());
        dto.setFreezableProtectionFlg(entity.getFreezableProtectionFlg());
        dto.setGuaranteedPlusFlg(entity.getGuaranteedPlusFlg());
        dto.setResidentialPickupFlg(entity.getResidentialPickupFlg());
        dto.setDoNotStackStackFlg(entity.getDoNotStackStackFlg());
        dto.setLimitedAccessDeliveryFlg(entity.getLimitedAccessDeliveryFlg());
        dto.setLimitedAccessPickupFlg(entity.getLimitedAccessPickupFlg());
        dto.setOverSizedFlg(entity.getOverSizedFlg());
        dto.setPoisonFlg(entity.getPoisonFlg());
        dto.setFoogFlg(entity.getFoogFlg());
        dto.setLiftgateDeliveryPrepaidFlg(entity.getLiftgateDeliveryPrepaidFlg());
        dto.setLiftgateDeliveryCollectFlg(entity.getLiftgateDeliveryCollectFlg());
        dto.setLiftgatePickupPrepaidFlg(entity.getLiftgatePickupPrepaidFlg());
        dto.setLiftgatePickupCollectFlg(entity.getLiftgatePickupCollectFlg());
        dto.setInsideDeliveryPrepaidFlg(entity.getInsideDeliveryPrepaidFlg());
        dto.setInsideDeliveryCollectFlg(entity.getInsideDeliveryCollectFlg());
        dto.setInsidePickupPrepaidFlg(entity.getInsidePickupPrepaidFlg());
        dto.setInsidePickupCollectFlg(entity.getInsidePickupCollectFlg());
        reflectDerivedProperty(entity, dto, true);
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<SqlShipmentRequestHeaderDto> mappingToDtoList(List<SqlShipmentRequestHeader> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<SqlShipmentRequestHeaderDto> dtoList = new ArrayList<SqlShipmentRequestHeaderDto>();
        for (SqlShipmentRequestHeader entity : entityList) {
            SqlShipmentRequestHeaderDto dto = mappingToDto(entity);
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
    public SqlShipmentRequestHeader mappingToEntity(SqlShipmentRequestHeaderDto dto) {
        if (dto == null) {
            return null;
        }
        SqlShipmentRequestHeader entity = new SqlShipmentRequestHeader();
        if (needsMapping(dto, dto.getClientId(), "clientId")) {
            entity.setClientId(dto.getClientId());
        }
        if (needsMapping(dto, dto.getClientCd(), "clientCd")) {
            entity.setClientCd(dto.getClientCd());
        }
        if (needsMapping(dto, dto.getCenterId(), "centerId")) {
            entity.setCenterId(dto.getCenterId());
        }
        if (needsMapping(dto, dto.getCenterCd(), "centerCd")) {
            entity.setCenterCd(dto.getCenterCd());
        }
        if (needsMapping(dto, dto.getWarehouseId(), "warehouseId")) {
            entity.setWarehouseId(dto.getWarehouseId());
        }
        if (needsMapping(dto, dto.getCompId(), "compId")) {
            entity.setCompId(dto.getCompId());
        }
        if (needsMapping(dto, dto.getCompCd(), "compCd")) {
            entity.setCompCd(dto.getCompCd());
        }
        if (needsMapping(dto, dto.getDeliveryCourseId(), "deliveryCourseId")) {
            entity.setDeliveryCourseId(dto.getDeliveryCourseId());
        }
        if (needsMapping(dto, dto.getDeliveryCourseCd(), "deliveryCourseCd")) {
            entity.setDeliveryCourseCd(dto.getDeliveryCourseCd());
        }
        if (needsMapping(dto, dto.getPickingWorkNo(), "pickingWorkNo")) {
            entity.setPickingWorkNo(dto.getPickingWorkNo());
        }
        if (needsMapping(dto, dto.getShippingSlipNo(), "shippingSlipNo")) {
            entity.setShippingSlipNo(dto.getShippingSlipNo());
        }
        if (needsMapping(dto, dto.getClientShippingNo(), "clientShippingNo")) {
            entity.setClientShippingNo(dto.getClientShippingNo());
        }
        if (needsMapping(dto, dto.getDelivCumistomerCd(), "delivCumistomerCd")) {
            entity.setDelivCumistomerCd(dto.getDelivCumistomerCd());
        }
        if (needsMapping(dto, dto.getDelivCustomerNm(), "delivCustomerNm")) {
            entity.setDelivCustomerNm(dto.getDelivCustomerNm());
        }
        if (needsMapping(dto, dto.getDelivAddressSupply(), "delivAddressSupply")) {
            entity.setDelivAddressSupply(dto.getDelivAddressSupply());
        }
        if (needsMapping(dto, dto.getDelivAddress1(), "delivAddress1")) {
            entity.setDelivAddress1(dto.getDelivAddress1());
        }
        if (needsMapping(dto, dto.getDelivAddress2(), "delivAddress2")) {
            entity.setDelivAddress2(dto.getDelivAddress2());
        }
        if (needsMapping(dto, dto.getDelivAddress3(), "delivAddress3")) {
            entity.setDelivAddress3(dto.getDelivAddress3());
        }
        if (needsMapping(dto, dto.getShpToCity(), "shpToCity")) {
            entity.setShpToCity(dto.getShpToCity());
        }
        if (needsMapping(dto, dto.getShpToState(), "shpToState")) {
            entity.setShpToState(dto.getShpToState());
        }
        if (needsMapping(dto, dto.getDelivZipCd(), "delivZipCd")) {
            entity.setDelivZipCd(dto.getDelivZipCd());
        }
        if (needsMapping(dto, dto.getPublicCd(), "publicCd")) {
            entity.setPublicCd(dto.getPublicCd());
        }
        if (needsMapping(dto, dto.getDelivTelNo(), "delivTelNo")) {
            entity.setDelivTelNo(dto.getDelivTelNo());
        }
        if (needsMapping(dto, dto.getPaymentTerm(), "paymentTerm")) {
            entity.setPaymentTerm(dto.getPaymentTerm());
        }
        if (needsMapping(dto, dto.getCollectAccountNoBillTo(), "collectAccountNoBillTo")) {
            entity.setCollectAccountNoBillTo(dto.getCollectAccountNoBillTo());
        }
        if (needsMapping(dto, dto.getCollectZipCdBillTo(), "collectZipCdBillTo")) {
            entity.setCollectZipCdBillTo(dto.getCollectZipCdBillTo());
        }
        if (needsMapping(dto, dto.getCollectCountryCdBillTo(), "collectCountryCdBillTo")) {
            entity.setCollectCountryCdBillTo(dto.getCollectCountryCdBillTo());
        }
        if (needsMapping(dto, dto.getPaymentTermCdTaxesTo(), "paymentTermCdTaxesTo")) {
            entity.setPaymentTermCdTaxesTo(dto.getPaymentTermCdTaxesTo());
        }
        if (needsMapping(dto, dto.getCollectAccountNoTaxesTo(), "collectAccountNoTaxesTo")) {
            entity.setCollectAccountNoTaxesTo(dto.getCollectAccountNoTaxesTo());
        }
        if (needsMapping(dto, dto.getCollectZipCdTaxesTo(), "collectZipCdTaxesTo")) {
            entity.setCollectZipCdTaxesTo(dto.getCollectZipCdTaxesTo());
        }
        if (needsMapping(dto, dto.getCollectCountryCdTaxesTo(), "collectCountryCdTaxesTo")) {
            entity.setCollectCountryCdTaxesTo(dto.getCollectCountryCdTaxesTo());
        }
        if (needsMapping(dto, dto.getCodPaymentTermCd(), "codPaymentTermCd")) {
            entity.setCodPaymentTermCd(dto.getCodPaymentTermCd());
        }
        if (needsMapping(dto, dto.getCodAmount(), "codAmount")) {
            entity.setCodAmount(dto.getCodAmount());
        }
        if (needsMapping(dto, dto.getCodFeePayer(), "codFeePayer")) {
            entity.setCodFeePayer(dto.getCodFeePayer());
        }
        if (needsMapping(dto, dto.getTermsOfSales(), "termsOfSales")) {
            entity.setTermsOfSales(dto.getTermsOfSales());
        }
        if (needsMapping(dto, dto.getBrokerName(), "brokerName")) {
            entity.setBrokerName(dto.getBrokerName());
        }
        if (needsMapping(dto, dto.getBrokerPhoneNo(), "brokerPhoneNo")) {
            entity.setBrokerPhoneNo(dto.getBrokerPhoneNo());
        }
        if (needsMapping(dto, dto.getBrokerFaxNo(), "brokerFaxNo")) {
            entity.setBrokerFaxNo(dto.getBrokerFaxNo());
        }
        if (needsMapping(dto, dto.getSatDeliveryFlg(), "satDeliveryFlg")) {
            entity.setSatDeliveryFlg(dto.getSatDeliveryFlg());
        }
        if (needsMapping(dto, dto.getResidentialDeliveryFlg(), "residentialDeliveryFlg")) {
            entity.setResidentialDeliveryFlg(dto.getResidentialDeliveryFlg());
        }
        if (needsMapping(dto, dto.getCodFlg(), "codFlg")) {
            entity.setCodFlg(dto.getCodFlg());
        }
        if (needsMapping(dto, dto.getSignatureRequiredFlg(), "signatureRequiredFlg")) {
            entity.setSignatureRequiredFlg(dto.getSignatureRequiredFlg());
        }
        if (needsMapping(dto, dto.getSignatureReleaseFlg(), "signatureReleaseFlg")) {
            entity.setSignatureReleaseFlg(dto.getSignatureReleaseFlg());
        }
        if (needsMapping(dto, dto.getCallBeforeDeliveryFlg(), "callBeforeDeliveryFlg")) {
            entity.setCallBeforeDeliveryFlg(dto.getCallBeforeDeliveryFlg());
        }
        if (needsMapping(dto, dto.getFreezableProtectionFlg(), "freezableProtectionFlg")) {
            entity.setFreezableProtectionFlg(dto.getFreezableProtectionFlg());
        }
        if (needsMapping(dto, dto.getGuaranteedPlusFlg(), "guaranteedPlusFlg")) {
            entity.setGuaranteedPlusFlg(dto.getGuaranteedPlusFlg());
        }
        if (needsMapping(dto, dto.getResidentialPickupFlg(), "residentialPickupFlg")) {
            entity.setResidentialPickupFlg(dto.getResidentialPickupFlg());
        }
        if (needsMapping(dto, dto.getDoNotStackStackFlg(), "doNotStackStackFlg")) {
            entity.setDoNotStackStackFlg(dto.getDoNotStackStackFlg());
        }
        if (needsMapping(dto, dto.getLimitedAccessDeliveryFlg(), "limitedAccessDeliveryFlg")) {
            entity.setLimitedAccessDeliveryFlg(dto.getLimitedAccessDeliveryFlg());
        }
        if (needsMapping(dto, dto.getLimitedAccessPickupFlg(), "limitedAccessPickupFlg")) {
            entity.setLimitedAccessPickupFlg(dto.getLimitedAccessPickupFlg());
        }
        if (needsMapping(dto, dto.getOverSizedFlg(), "overSizedFlg")) {
            entity.setOverSizedFlg(dto.getOverSizedFlg());
        }
        if (needsMapping(dto, dto.getPoisonFlg(), "poisonFlg")) {
            entity.setPoisonFlg(dto.getPoisonFlg());
        }
        if (needsMapping(dto, dto.getFoogFlg(), "foogFlg")) {
            entity.setFoogFlg(dto.getFoogFlg());
        }
        if (needsMapping(dto, dto.getLiftgateDeliveryPrepaidFlg(), "liftgateDeliveryPrepaidFlg")) {
            entity.setLiftgateDeliveryPrepaidFlg(dto.getLiftgateDeliveryPrepaidFlg());
        }
        if (needsMapping(dto, dto.getLiftgateDeliveryCollectFlg(), "liftgateDeliveryCollectFlg")) {
            entity.setLiftgateDeliveryCollectFlg(dto.getLiftgateDeliveryCollectFlg());
        }
        if (needsMapping(dto, dto.getLiftgatePickupPrepaidFlg(), "liftgatePickupPrepaidFlg")) {
            entity.setLiftgatePickupPrepaidFlg(dto.getLiftgatePickupPrepaidFlg());
        }
        if (needsMapping(dto, dto.getLiftgatePickupCollectFlg(), "liftgatePickupCollectFlg")) {
            entity.setLiftgatePickupCollectFlg(dto.getLiftgatePickupCollectFlg());
        }
        if (needsMapping(dto, dto.getInsideDeliveryPrepaidFlg(), "insideDeliveryPrepaidFlg")) {
            entity.setInsideDeliveryPrepaidFlg(dto.getInsideDeliveryPrepaidFlg());
        }
        if (needsMapping(dto, dto.getInsideDeliveryCollectFlg(), "insideDeliveryCollectFlg")) {
            entity.setInsideDeliveryCollectFlg(dto.getInsideDeliveryCollectFlg());
        }
        if (needsMapping(dto, dto.getInsidePickupPrepaidFlg(), "insidePickupPrepaidFlg")) {
            entity.setInsidePickupPrepaidFlg(dto.getInsidePickupPrepaidFlg());
        }
        if (needsMapping(dto, dto.getInsidePickupCollectFlg(), "insidePickupCollectFlg")) {
            entity.setInsidePickupCollectFlg(dto.getInsidePickupCollectFlg());
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
    protected boolean needsMapping(SqlShipmentRequestHeaderDto dto, Object value, String propName) {
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
    public List<SqlShipmentRequestHeader> mappingToEntityList(List<SqlShipmentRequestHeaderDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<SqlShipmentRequestHeader> entityList = new ArrayList<SqlShipmentRequestHeader>();
        for (SqlShipmentRequestHeaderDto dto : dtoList) {
            SqlShipmentRequestHeader entity = mappingToEntity(dto);
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
    public SqlShipmentRequestHeaderDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (SqlShipmentRequestHeaderDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public SqlShipmentRequestHeaderDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (SqlShipmentRequestHeaderDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public SqlShipmentRequestHeaderDtoMapper reverseReference() {
        setReverseReference(true);
        return (SqlShipmentRequestHeaderDtoMapper)this;
    }
}
