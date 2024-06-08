package com.oneslogi.base.dbflute.dto.bs.customize;

import java.io.Serializable;
import java.util.*;

import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of SqlShipmentRequestHeader. <br>
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
@JsonModel(decamelize = false)
public abstract class BsSqlShipmentRequestHeaderDto implements Serializable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                                Column
    //                                                ------
    /** CLIENT_ID: {bigint(19)} */
    @JsonKey
    protected Long _clientId;

    /** CLIENT_CD: {varchar(30)} */
    @JsonKey
    protected String _clientCd;

    /** CENTER_ID: {bigint(19)} */
    @JsonKey
    protected Long _centerId;

    /** CENTER_CD: {varchar(30)} */
    @JsonKey
    protected String _centerCd;

    /** WAREHOUSE_ID: {varchar(30)} */
    @JsonKey
    protected String _warehouseId;

    /** COMP_ID: {bigint(19)} */
    @JsonKey
    protected Long _compId;

    /** COMP_CD: {varchar(30)} */
    @JsonKey
    protected String _compCd;

    /** DELIVERY_COURSE_ID: {bigint(19)} */
    @JsonKey
    protected Long _deliveryCourseId;

    /** DELIVERY_COURSE_CD: {varchar(30)} */
    @JsonKey
    protected String _deliveryCourseCd;

    /** PICKING_WORK_NO: {varchar(30)} */
    @JsonKey
    protected String _pickingWorkNo;

    /** SHIPPING_SLIP_NO: {varchar(30)} */
    @JsonKey
    protected String _shippingSlipNo;

    /** CLIENT_SHIPPING_NO: {varchar(30)} */
    @JsonKey
    protected String _clientShippingNo;

    /** DELIV_CUMISTOMER_CD: {varchar(30)} */
    @JsonKey
    protected String _delivCumistomerCd;

    /** DELIV_CUSTOMER_NM: {varchar(255)} */
    @JsonKey
    protected String _delivCustomerNm;

    /** DELIV_ADDRESS_SUPPLY: {varchar(60)} */
    @JsonKey
    protected String _delivAddressSupply;

    /** DELIV_ADDRESS1: {varchar(255)} */
    @JsonKey
    protected String _delivAddress1;

    /** DELIV_ADDRESS2: {varchar(255)} */
    @JsonKey
    protected String _delivAddress2;

    /** DELIV_ADDRESS3: {varchar(255)} */
    @JsonKey
    protected String _delivAddress3;

    /** SHP_TO_CITY: {varchar(255)} */
    @JsonKey
    protected String _shpToCity;

    /** SHP_TO_STATE: {varchar(255)} */
    @JsonKey
    protected String _shpToState;

    /** DELIV_ZIP_CD: {varchar(30)} */
    @JsonKey
    protected String _delivZipCd;

    /** PUBLIC_CD: {varchar(30)} */
    @JsonKey
    protected String _publicCd;

    /** DELIV_TEL_NO: {varchar(255)} */
    @JsonKey
    protected String _delivTelNo;

    /** PAYMENT_TERM: {varchar(30)} */
    @JsonKey
    protected String _paymentTerm;

    /** COLLECT_ACCOUNT_NO_BILL_TO: {varchar(30)} */
    @JsonKey
    protected String _collectAccountNoBillTo;

    /** COLLECT_ZIP_CD_BILL_TO: {varchar(30)} */
    @JsonKey
    protected String _collectZipCdBillTo;

    /** COLLECT_COUNTRY_CD_BILL_TO: {varchar(30)} */
    @JsonKey
    protected String _collectCountryCdBillTo;

    /** PAYMENT_TERM_CD_TAXES_TO: {varchar(30)} */
    @JsonKey
    protected String _paymentTermCdTaxesTo;

    /** COLLECT_ACCOUNT_NO_TAXES_TO: {varchar(30)} */
    @JsonKey
    protected String _collectAccountNoTaxesTo;

    /** COLLECT_ZIP_CD_TAXES_TO: {varchar(30)} */
    @JsonKey
    protected String _collectZipCdTaxesTo;

    /** COLLECT_COUNTRY_CD_TAXES_TO: {varchar(30)} */
    @JsonKey
    protected String _collectCountryCdTaxesTo;

    /** COD_PAYMENT_TERM_CD: {varchar(30)} */
    @JsonKey
    protected String _codPaymentTermCd;

    /** COD_AMOUNT: {decimal(38, 6)} */
    @JsonKey
    protected java.math.BigDecimal _codAmount;

    /** COD_FEE_PAYER: {varchar(30)} */
    @JsonKey
    protected String _codFeePayer;

    /** TERMS_OF_SALES: {varchar(30)} */
    @JsonKey
    protected String _termsOfSales;

    /** BROKER_NAME: {varchar(255)} */
    @JsonKey
    protected String _brokerName;

    /** BROKER_PHONE_NO: {varchar(30)} */
    @JsonKey
    protected String _brokerPhoneNo;

    /** BROKER_FAX_NO: {varchar(30)} */
    @JsonKey
    protected String _brokerFaxNo;

    /** SAT_DELIVERY_FLG: {char(1)} */
    @JsonKey
    protected String _satDeliveryFlg;

    /** RESIDENTIAL_DELIVERY_FLG: {char(1)} */
    @JsonKey
    protected String _residentialDeliveryFlg;

    /** COD_FLG: {char(1)} */
    @JsonKey
    protected String _codFlg;

    /** SIGNATURE_REQUIRED_FLG: {char(1)} */
    @JsonKey
    protected String _signatureRequiredFlg;

    /** SIGNATURE_RELEASE_FLG: {char(1)} */
    @JsonKey
    protected String _signatureReleaseFlg;

    /** CALL_BEFORE_DELIVERY_FLG: {char(1)} */
    @JsonKey
    protected String _callBeforeDeliveryFlg;

    /** FREEZABLE_PROTECTION_FLG: {char(1)} */
    @JsonKey
    protected String _freezableProtectionFlg;

    /** GUARANTEED_PLUS_FLG: {char(1)} */
    @JsonKey
    protected String _guaranteedPlusFlg;

    /** RESIDENTIAL_PICKUP_FLG: {char(1)} */
    @JsonKey
    protected String _residentialPickupFlg;

    /** DO_NOT_STACK_STACK_FLG: {char(1)} */
    @JsonKey
    protected String _doNotStackStackFlg;

    /** LIMITED_ACCESS_DELIVERY_FLG: {char(1)} */
    @JsonKey
    protected String _limitedAccessDeliveryFlg;

    /** LIMITED_ACCESS_PICKUP_FLG: {char(1)} */
    @JsonKey
    protected String _limitedAccessPickupFlg;

    /** OVER_SIZED_FLG: {char(1)} */
    @JsonKey
    protected String _overSizedFlg;

    /** POISON_FLG: {char(1)} */
    @JsonKey
    protected String _poisonFlg;

    /** FOOG_FLG: {char(1)} */
    @JsonKey
    protected String _foogFlg;

    /** LIFTGATE_DELIVERY_PREPAID_FLG: {char(1)} */
    @JsonKey
    protected String _liftgateDeliveryPrepaidFlg;

    /** LIFTGATE_DELIVERY_COLLECT_FLG: {char(1)} */
    @JsonKey
    protected String _liftgateDeliveryCollectFlg;

    /** LIFTGATE_PICKUP_PREPAID_FLG: {char(1)} */
    @JsonKey
    protected String _liftgatePickupPrepaidFlg;

    /** LIFTGATE_PICKUP_COLLECT_FLG: {char(1)} */
    @JsonKey
    protected String _liftgatePickupCollectFlg;

    /** INSIDE_DELIVERY_PREPAID_FLG: {char(1)} */
    @JsonKey
    protected String _insideDeliveryPrepaidFlg;

    /** INSIDE_DELIVERY_COLLECT_FLG: {char(1)} */
    @JsonKey
    protected String _insideDeliveryCollectFlg;

    /** INSIDE_PICKUP_PREPAID_FLG: {char(1)} */
    @JsonKey
    protected String _insidePickupPrepaidFlg;

    /** INSIDE_PICKUP_COLLECT_FLG: {char(1)} */
    @JsonKey
    protected String _insidePickupCollectFlg;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsSqlShipmentRequestHeaderDto() {
    }

    // ===================================================================================
    //                                                                 Modified Properties
    //                                                                 ===================
    public Set<String> mymodifiedProperties() {
        return __modifiedProperties;
    }

    public void clearModifiedInfo() {
        __modifiedProperties.clear();
    }

    public boolean hasModification() {
        return !__modifiedProperties.isEmpty();
    }

    // ===================================================================================
    //                                                                       Foreign Table
    //                                                                       =============
    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsSqlShipmentRequestHeaderDto)) { return false; }
        final BsSqlShipmentRequestHeaderDto otherEntity = (BsSqlShipmentRequestHeaderDto)other;
        if (!helpComparingValue(getClientId(), otherEntity.getClientId())) { return false; }
        if (!helpComparingValue(getClientCd(), otherEntity.getClientCd())) { return false; }
        if (!helpComparingValue(getCenterId(), otherEntity.getCenterId())) { return false; }
        if (!helpComparingValue(getCenterCd(), otherEntity.getCenterCd())) { return false; }
        if (!helpComparingValue(getWarehouseId(), otherEntity.getWarehouseId())) { return false; }
        if (!helpComparingValue(getCompId(), otherEntity.getCompId())) { return false; }
        if (!helpComparingValue(getCompCd(), otherEntity.getCompCd())) { return false; }
        if (!helpComparingValue(getDeliveryCourseId(), otherEntity.getDeliveryCourseId())) { return false; }
        if (!helpComparingValue(getDeliveryCourseCd(), otherEntity.getDeliveryCourseCd())) { return false; }
        if (!helpComparingValue(getPickingWorkNo(), otherEntity.getPickingWorkNo())) { return false; }
        if (!helpComparingValue(getShippingSlipNo(), otherEntity.getShippingSlipNo())) { return false; }
        if (!helpComparingValue(getClientShippingNo(), otherEntity.getClientShippingNo())) { return false; }
        if (!helpComparingValue(getDelivCumistomerCd(), otherEntity.getDelivCumistomerCd())) { return false; }
        if (!helpComparingValue(getDelivCustomerNm(), otherEntity.getDelivCustomerNm())) { return false; }
        if (!helpComparingValue(getDelivAddressSupply(), otherEntity.getDelivAddressSupply())) { return false; }
        if (!helpComparingValue(getDelivAddress1(), otherEntity.getDelivAddress1())) { return false; }
        if (!helpComparingValue(getDelivAddress2(), otherEntity.getDelivAddress2())) { return false; }
        if (!helpComparingValue(getDelivAddress3(), otherEntity.getDelivAddress3())) { return false; }
        if (!helpComparingValue(getShpToCity(), otherEntity.getShpToCity())) { return false; }
        if (!helpComparingValue(getShpToState(), otherEntity.getShpToState())) { return false; }
        if (!helpComparingValue(getDelivZipCd(), otherEntity.getDelivZipCd())) { return false; }
        if (!helpComparingValue(getPublicCd(), otherEntity.getPublicCd())) { return false; }
        if (!helpComparingValue(getDelivTelNo(), otherEntity.getDelivTelNo())) { return false; }
        if (!helpComparingValue(getPaymentTerm(), otherEntity.getPaymentTerm())) { return false; }
        if (!helpComparingValue(getCollectAccountNoBillTo(), otherEntity.getCollectAccountNoBillTo())) { return false; }
        if (!helpComparingValue(getCollectZipCdBillTo(), otherEntity.getCollectZipCdBillTo())) { return false; }
        if (!helpComparingValue(getCollectCountryCdBillTo(), otherEntity.getCollectCountryCdBillTo())) { return false; }
        if (!helpComparingValue(getPaymentTermCdTaxesTo(), otherEntity.getPaymentTermCdTaxesTo())) { return false; }
        if (!helpComparingValue(getCollectAccountNoTaxesTo(), otherEntity.getCollectAccountNoTaxesTo())) { return false; }
        if (!helpComparingValue(getCollectZipCdTaxesTo(), otherEntity.getCollectZipCdTaxesTo())) { return false; }
        if (!helpComparingValue(getCollectCountryCdTaxesTo(), otherEntity.getCollectCountryCdTaxesTo())) { return false; }
        if (!helpComparingValue(getCodPaymentTermCd(), otherEntity.getCodPaymentTermCd())) { return false; }
        if (!helpComparingValue(getCodAmount(), otherEntity.getCodAmount())) { return false; }
        if (!helpComparingValue(getCodFeePayer(), otherEntity.getCodFeePayer())) { return false; }
        if (!helpComparingValue(getTermsOfSales(), otherEntity.getTermsOfSales())) { return false; }
        if (!helpComparingValue(getBrokerName(), otherEntity.getBrokerName())) { return false; }
        if (!helpComparingValue(getBrokerPhoneNo(), otherEntity.getBrokerPhoneNo())) { return false; }
        if (!helpComparingValue(getBrokerFaxNo(), otherEntity.getBrokerFaxNo())) { return false; }
        if (!helpComparingValue(getSatDeliveryFlg(), otherEntity.getSatDeliveryFlg())) { return false; }
        if (!helpComparingValue(getResidentialDeliveryFlg(), otherEntity.getResidentialDeliveryFlg())) { return false; }
        if (!helpComparingValue(getCodFlg(), otherEntity.getCodFlg())) { return false; }
        if (!helpComparingValue(getSignatureRequiredFlg(), otherEntity.getSignatureRequiredFlg())) { return false; }
        if (!helpComparingValue(getSignatureReleaseFlg(), otherEntity.getSignatureReleaseFlg())) { return false; }
        if (!helpComparingValue(getCallBeforeDeliveryFlg(), otherEntity.getCallBeforeDeliveryFlg())) { return false; }
        if (!helpComparingValue(getFreezableProtectionFlg(), otherEntity.getFreezableProtectionFlg())) { return false; }
        if (!helpComparingValue(getGuaranteedPlusFlg(), otherEntity.getGuaranteedPlusFlg())) { return false; }
        if (!helpComparingValue(getResidentialPickupFlg(), otherEntity.getResidentialPickupFlg())) { return false; }
        if (!helpComparingValue(getDoNotStackStackFlg(), otherEntity.getDoNotStackStackFlg())) { return false; }
        if (!helpComparingValue(getLimitedAccessDeliveryFlg(), otherEntity.getLimitedAccessDeliveryFlg())) { return false; }
        if (!helpComparingValue(getLimitedAccessPickupFlg(), otherEntity.getLimitedAccessPickupFlg())) { return false; }
        if (!helpComparingValue(getOverSizedFlg(), otherEntity.getOverSizedFlg())) { return false; }
        if (!helpComparingValue(getPoisonFlg(), otherEntity.getPoisonFlg())) { return false; }
        if (!helpComparingValue(getFoogFlg(), otherEntity.getFoogFlg())) { return false; }
        if (!helpComparingValue(getLiftgateDeliveryPrepaidFlg(), otherEntity.getLiftgateDeliveryPrepaidFlg())) { return false; }
        if (!helpComparingValue(getLiftgateDeliveryCollectFlg(), otherEntity.getLiftgateDeliveryCollectFlg())) { return false; }
        if (!helpComparingValue(getLiftgatePickupPrepaidFlg(), otherEntity.getLiftgatePickupPrepaidFlg())) { return false; }
        if (!helpComparingValue(getLiftgatePickupCollectFlg(), otherEntity.getLiftgatePickupCollectFlg())) { return false; }
        if (!helpComparingValue(getInsideDeliveryPrepaidFlg(), otherEntity.getInsideDeliveryPrepaidFlg())) { return false; }
        if (!helpComparingValue(getInsideDeliveryCollectFlg(), otherEntity.getInsideDeliveryCollectFlg())) { return false; }
        if (!helpComparingValue(getInsidePickupPrepaidFlg(), otherEntity.getInsidePickupPrepaidFlg())) { return false; }
        if (!helpComparingValue(getInsidePickupCollectFlg(), otherEntity.getInsidePickupCollectFlg())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "SqlShipmentRequestHeader");
        result = xCH(result, getClientId());
        result = xCH(result, getClientCd());
        result = xCH(result, getCenterId());
        result = xCH(result, getCenterCd());
        result = xCH(result, getWarehouseId());
        result = xCH(result, getCompId());
        result = xCH(result, getCompCd());
        result = xCH(result, getDeliveryCourseId());
        result = xCH(result, getDeliveryCourseCd());
        result = xCH(result, getPickingWorkNo());
        result = xCH(result, getShippingSlipNo());
        result = xCH(result, getClientShippingNo());
        result = xCH(result, getDelivCumistomerCd());
        result = xCH(result, getDelivCustomerNm());
        result = xCH(result, getDelivAddressSupply());
        result = xCH(result, getDelivAddress1());
        result = xCH(result, getDelivAddress2());
        result = xCH(result, getDelivAddress3());
        result = xCH(result, getShpToCity());
        result = xCH(result, getShpToState());
        result = xCH(result, getDelivZipCd());
        result = xCH(result, getPublicCd());
        result = xCH(result, getDelivTelNo());
        result = xCH(result, getPaymentTerm());
        result = xCH(result, getCollectAccountNoBillTo());
        result = xCH(result, getCollectZipCdBillTo());
        result = xCH(result, getCollectCountryCdBillTo());
        result = xCH(result, getPaymentTermCdTaxesTo());
        result = xCH(result, getCollectAccountNoTaxesTo());
        result = xCH(result, getCollectZipCdTaxesTo());
        result = xCH(result, getCollectCountryCdTaxesTo());
        result = xCH(result, getCodPaymentTermCd());
        result = xCH(result, getCodAmount());
        result = xCH(result, getCodFeePayer());
        result = xCH(result, getTermsOfSales());
        result = xCH(result, getBrokerName());
        result = xCH(result, getBrokerPhoneNo());
        result = xCH(result, getBrokerFaxNo());
        result = xCH(result, getSatDeliveryFlg());
        result = xCH(result, getResidentialDeliveryFlg());
        result = xCH(result, getCodFlg());
        result = xCH(result, getSignatureRequiredFlg());
        result = xCH(result, getSignatureReleaseFlg());
        result = xCH(result, getCallBeforeDeliveryFlg());
        result = xCH(result, getFreezableProtectionFlg());
        result = xCH(result, getGuaranteedPlusFlg());
        result = xCH(result, getResidentialPickupFlg());
        result = xCH(result, getDoNotStackStackFlg());
        result = xCH(result, getLimitedAccessDeliveryFlg());
        result = xCH(result, getLimitedAccessPickupFlg());
        result = xCH(result, getOverSizedFlg());
        result = xCH(result, getPoisonFlg());
        result = xCH(result, getFoogFlg());
        result = xCH(result, getLiftgateDeliveryPrepaidFlg());
        result = xCH(result, getLiftgateDeliveryCollectFlg());
        result = xCH(result, getLiftgatePickupPrepaidFlg());
        result = xCH(result, getLiftgatePickupCollectFlg());
        result = xCH(result, getInsideDeliveryPrepaidFlg());
        result = xCH(result, getInsideDeliveryCollectFlg());
        result = xCH(result, getInsidePickupPrepaidFlg());
        result = xCH(result, getInsidePickupCollectFlg());
        return result;
    }
    protected int xCH(int result, Object value) { // calculateHashcode()
        if (value == null) {
            return result;
        }
        return (31 * result) + (value instanceof byte[] ? ((byte[]) value).length : value.hashCode());
    }

    public int instanceHash() {
        return super.hashCode();
    }

    public String toString() {
        String c = ", ";
        StringBuilder sb = new StringBuilder();
        sb.append(c).append(getClientId());
        sb.append(c).append(getClientCd());
        sb.append(c).append(getCenterId());
        sb.append(c).append(getCenterCd());
        sb.append(c).append(getWarehouseId());
        sb.append(c).append(getCompId());
        sb.append(c).append(getCompCd());
        sb.append(c).append(getDeliveryCourseId());
        sb.append(c).append(getDeliveryCourseCd());
        sb.append(c).append(getPickingWorkNo());
        sb.append(c).append(getShippingSlipNo());
        sb.append(c).append(getClientShippingNo());
        sb.append(c).append(getDelivCumistomerCd());
        sb.append(c).append(getDelivCustomerNm());
        sb.append(c).append(getDelivAddressSupply());
        sb.append(c).append(getDelivAddress1());
        sb.append(c).append(getDelivAddress2());
        sb.append(c).append(getDelivAddress3());
        sb.append(c).append(getShpToCity());
        sb.append(c).append(getShpToState());
        sb.append(c).append(getDelivZipCd());
        sb.append(c).append(getPublicCd());
        sb.append(c).append(getDelivTelNo());
        sb.append(c).append(getPaymentTerm());
        sb.append(c).append(getCollectAccountNoBillTo());
        sb.append(c).append(getCollectZipCdBillTo());
        sb.append(c).append(getCollectCountryCdBillTo());
        sb.append(c).append(getPaymentTermCdTaxesTo());
        sb.append(c).append(getCollectAccountNoTaxesTo());
        sb.append(c).append(getCollectZipCdTaxesTo());
        sb.append(c).append(getCollectCountryCdTaxesTo());
        sb.append(c).append(getCodPaymentTermCd());
        sb.append(c).append(getCodAmount());
        sb.append(c).append(getCodFeePayer());
        sb.append(c).append(getTermsOfSales());
        sb.append(c).append(getBrokerName());
        sb.append(c).append(getBrokerPhoneNo());
        sb.append(c).append(getBrokerFaxNo());
        sb.append(c).append(getSatDeliveryFlg());
        sb.append(c).append(getResidentialDeliveryFlg());
        sb.append(c).append(getCodFlg());
        sb.append(c).append(getSignatureRequiredFlg());
        sb.append(c).append(getSignatureReleaseFlg());
        sb.append(c).append(getCallBeforeDeliveryFlg());
        sb.append(c).append(getFreezableProtectionFlg());
        sb.append(c).append(getGuaranteedPlusFlg());
        sb.append(c).append(getResidentialPickupFlg());
        sb.append(c).append(getDoNotStackStackFlg());
        sb.append(c).append(getLimitedAccessDeliveryFlg());
        sb.append(c).append(getLimitedAccessPickupFlg());
        sb.append(c).append(getOverSizedFlg());
        sb.append(c).append(getPoisonFlg());
        sb.append(c).append(getFoogFlg());
        sb.append(c).append(getLiftgateDeliveryPrepaidFlg());
        sb.append(c).append(getLiftgateDeliveryCollectFlg());
        sb.append(c).append(getLiftgatePickupPrepaidFlg());
        sb.append(c).append(getLiftgatePickupCollectFlg());
        sb.append(c).append(getInsideDeliveryPrepaidFlg());
        sb.append(c).append(getInsideDeliveryCollectFlg());
        sb.append(c).append(getInsidePickupPrepaidFlg());
        sb.append(c).append(getInsidePickupCollectFlg());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] CLIENT_ID: {bigint(19)} <br>
     * @return The value of the column 'CLIENT_ID'. (NullAllowed)
     */
    public Long getClientId() {
        return _clientId;
    }

    /**
     * [set] CLIENT_ID: {bigint(19)} <br>
     * @param clientId The value of the column 'CLIENT_ID'. (NullAllowed)
     */
    public void setClientId(Long clientId) {
        __modifiedProperties.add("clientId");
        this._clientId = clientId;
    }

    /**
     * [get] CLIENT_CD: {varchar(30)} <br>
     * @return The value of the column 'CLIENT_CD'. (NullAllowed)
     */
    public String getClientCd() {
        return _clientCd;
    }

    /**
     * [set] CLIENT_CD: {varchar(30)} <br>
     * @param clientCd The value of the column 'CLIENT_CD'. (NullAllowed)
     */
    public void setClientCd(String clientCd) {
        __modifiedProperties.add("clientCd");
        this._clientCd = clientCd;
    }

    /**
     * [get] CENTER_ID: {bigint(19)} <br>
     * @return The value of the column 'CENTER_ID'. (NullAllowed)
     */
    public Long getCenterId() {
        return _centerId;
    }

    /**
     * [set] CENTER_ID: {bigint(19)} <br>
     * @param centerId The value of the column 'CENTER_ID'. (NullAllowed)
     */
    public void setCenterId(Long centerId) {
        __modifiedProperties.add("centerId");
        this._centerId = centerId;
    }

    /**
     * [get] CENTER_CD: {varchar(30)} <br>
     * @return The value of the column 'CENTER_CD'. (NullAllowed)
     */
    public String getCenterCd() {
        return _centerCd;
    }

    /**
     * [set] CENTER_CD: {varchar(30)} <br>
     * @param centerCd The value of the column 'CENTER_CD'. (NullAllowed)
     */
    public void setCenterCd(String centerCd) {
        __modifiedProperties.add("centerCd");
        this._centerCd = centerCd;
    }

    /**
     * [get] WAREHOUSE_ID: {varchar(30)} <br>
     * @return The value of the column 'WAREHOUSE_ID'. (NullAllowed)
     */
    public String getWarehouseId() {
        return _warehouseId;
    }

    /**
     * [set] WAREHOUSE_ID: {varchar(30)} <br>
     * @param warehouseId The value of the column 'WAREHOUSE_ID'. (NullAllowed)
     */
    public void setWarehouseId(String warehouseId) {
        __modifiedProperties.add("warehouseId");
        this._warehouseId = warehouseId;
    }

    /**
     * [get] COMP_ID: {bigint(19)} <br>
     * @return The value of the column 'COMP_ID'. (NullAllowed)
     */
    public Long getCompId() {
        return _compId;
    }

    /**
     * [set] COMP_ID: {bigint(19)} <br>
     * @param compId The value of the column 'COMP_ID'. (NullAllowed)
     */
    public void setCompId(Long compId) {
        __modifiedProperties.add("compId");
        this._compId = compId;
    }

    /**
     * [get] COMP_CD: {varchar(30)} <br>
     * @return The value of the column 'COMP_CD'. (NullAllowed)
     */
    public String getCompCd() {
        return _compCd;
    }

    /**
     * [set] COMP_CD: {varchar(30)} <br>
     * @param compCd The value of the column 'COMP_CD'. (NullAllowed)
     */
    public void setCompCd(String compCd) {
        __modifiedProperties.add("compCd");
        this._compCd = compCd;
    }

    /**
     * [get] DELIVERY_COURSE_ID: {bigint(19)} <br>
     * @return The value of the column 'DELIVERY_COURSE_ID'. (NullAllowed)
     */
    public Long getDeliveryCourseId() {
        return _deliveryCourseId;
    }

    /**
     * [set] DELIVERY_COURSE_ID: {bigint(19)} <br>
     * @param deliveryCourseId The value of the column 'DELIVERY_COURSE_ID'. (NullAllowed)
     */
    public void setDeliveryCourseId(Long deliveryCourseId) {
        __modifiedProperties.add("deliveryCourseId");
        this._deliveryCourseId = deliveryCourseId;
    }

    /**
     * [get] DELIVERY_COURSE_CD: {varchar(30)} <br>
     * @return The value of the column 'DELIVERY_COURSE_CD'. (NullAllowed)
     */
    public String getDeliveryCourseCd() {
        return _deliveryCourseCd;
    }

    /**
     * [set] DELIVERY_COURSE_CD: {varchar(30)} <br>
     * @param deliveryCourseCd The value of the column 'DELIVERY_COURSE_CD'. (NullAllowed)
     */
    public void setDeliveryCourseCd(String deliveryCourseCd) {
        __modifiedProperties.add("deliveryCourseCd");
        this._deliveryCourseCd = deliveryCourseCd;
    }

    /**
     * [get] PICKING_WORK_NO: {varchar(30)} <br>
     * @return The value of the column 'PICKING_WORK_NO'. (NullAllowed)
     */
    public String getPickingWorkNo() {
        return _pickingWorkNo;
    }

    /**
     * [set] PICKING_WORK_NO: {varchar(30)} <br>
     * @param pickingWorkNo The value of the column 'PICKING_WORK_NO'. (NullAllowed)
     */
    public void setPickingWorkNo(String pickingWorkNo) {
        __modifiedProperties.add("pickingWorkNo");
        this._pickingWorkNo = pickingWorkNo;
    }

    /**
     * [get] SHIPPING_SLIP_NO: {varchar(30)} <br>
     * @return The value of the column 'SHIPPING_SLIP_NO'. (NullAllowed)
     */
    public String getShippingSlipNo() {
        return _shippingSlipNo;
    }

    /**
     * [set] SHIPPING_SLIP_NO: {varchar(30)} <br>
     * @param shippingSlipNo The value of the column 'SHIPPING_SLIP_NO'. (NullAllowed)
     */
    public void setShippingSlipNo(String shippingSlipNo) {
        __modifiedProperties.add("shippingSlipNo");
        this._shippingSlipNo = shippingSlipNo;
    }

    /**
     * [get] CLIENT_SHIPPING_NO: {varchar(30)} <br>
     * @return The value of the column 'CLIENT_SHIPPING_NO'. (NullAllowed)
     */
    public String getClientShippingNo() {
        return _clientShippingNo;
    }

    /**
     * [set] CLIENT_SHIPPING_NO: {varchar(30)} <br>
     * @param clientShippingNo The value of the column 'CLIENT_SHIPPING_NO'. (NullAllowed)
     */
    public void setClientShippingNo(String clientShippingNo) {
        __modifiedProperties.add("clientShippingNo");
        this._clientShippingNo = clientShippingNo;
    }

    /**
     * [get] DELIV_CUMISTOMER_CD: {varchar(30)} <br>
     * @return The value of the column 'DELIV_CUMISTOMER_CD'. (NullAllowed)
     */
    public String getDelivCumistomerCd() {
        return _delivCumistomerCd;
    }

    /**
     * [set] DELIV_CUMISTOMER_CD: {varchar(30)} <br>
     * @param delivCumistomerCd The value of the column 'DELIV_CUMISTOMER_CD'. (NullAllowed)
     */
    public void setDelivCumistomerCd(String delivCumistomerCd) {
        __modifiedProperties.add("delivCumistomerCd");
        this._delivCumistomerCd = delivCumistomerCd;
    }

    /**
     * [get] DELIV_CUSTOMER_NM: {varchar(255)} <br>
     * @return The value of the column 'DELIV_CUSTOMER_NM'. (NullAllowed)
     */
    public String getDelivCustomerNm() {
        return _delivCustomerNm;
    }

    /**
     * [set] DELIV_CUSTOMER_NM: {varchar(255)} <br>
     * @param delivCustomerNm The value of the column 'DELIV_CUSTOMER_NM'. (NullAllowed)
     */
    public void setDelivCustomerNm(String delivCustomerNm) {
        __modifiedProperties.add("delivCustomerNm");
        this._delivCustomerNm = delivCustomerNm;
    }

    /**
     * [get] DELIV_ADDRESS_SUPPLY: {varchar(60)} <br>
     * @return The value of the column 'DELIV_ADDRESS_SUPPLY'. (NullAllowed)
     */
    public String getDelivAddressSupply() {
        return _delivAddressSupply;
    }

    /**
     * [set] DELIV_ADDRESS_SUPPLY: {varchar(60)} <br>
     * @param delivAddressSupply The value of the column 'DELIV_ADDRESS_SUPPLY'. (NullAllowed)
     */
    public void setDelivAddressSupply(String delivAddressSupply) {
        __modifiedProperties.add("delivAddressSupply");
        this._delivAddressSupply = delivAddressSupply;
    }

    /**
     * [get] DELIV_ADDRESS1: {varchar(255)} <br>
     * @return The value of the column 'DELIV_ADDRESS1'. (NullAllowed)
     */
    public String getDelivAddress1() {
        return _delivAddress1;
    }

    /**
     * [set] DELIV_ADDRESS1: {varchar(255)} <br>
     * @param delivAddress1 The value of the column 'DELIV_ADDRESS1'. (NullAllowed)
     */
    public void setDelivAddress1(String delivAddress1) {
        __modifiedProperties.add("delivAddress1");
        this._delivAddress1 = delivAddress1;
    }

    /**
     * [get] DELIV_ADDRESS2: {varchar(255)} <br>
     * @return The value of the column 'DELIV_ADDRESS2'. (NullAllowed)
     */
    public String getDelivAddress2() {
        return _delivAddress2;
    }

    /**
     * [set] DELIV_ADDRESS2: {varchar(255)} <br>
     * @param delivAddress2 The value of the column 'DELIV_ADDRESS2'. (NullAllowed)
     */
    public void setDelivAddress2(String delivAddress2) {
        __modifiedProperties.add("delivAddress2");
        this._delivAddress2 = delivAddress2;
    }

    /**
     * [get] DELIV_ADDRESS3: {varchar(255)} <br>
     * @return The value of the column 'DELIV_ADDRESS3'. (NullAllowed)
     */
    public String getDelivAddress3() {
        return _delivAddress3;
    }

    /**
     * [set] DELIV_ADDRESS3: {varchar(255)} <br>
     * @param delivAddress3 The value of the column 'DELIV_ADDRESS3'. (NullAllowed)
     */
    public void setDelivAddress3(String delivAddress3) {
        __modifiedProperties.add("delivAddress3");
        this._delivAddress3 = delivAddress3;
    }

    /**
     * [get] SHP_TO_CITY: {varchar(255)} <br>
     * @return The value of the column 'SHP_TO_CITY'. (NullAllowed)
     */
    public String getShpToCity() {
        return _shpToCity;
    }

    /**
     * [set] SHP_TO_CITY: {varchar(255)} <br>
     * @param shpToCity The value of the column 'SHP_TO_CITY'. (NullAllowed)
     */
    public void setShpToCity(String shpToCity) {
        __modifiedProperties.add("shpToCity");
        this._shpToCity = shpToCity;
    }

    /**
     * [get] SHP_TO_STATE: {varchar(255)} <br>
     * @return The value of the column 'SHP_TO_STATE'. (NullAllowed)
     */
    public String getShpToState() {
        return _shpToState;
    }

    /**
     * [set] SHP_TO_STATE: {varchar(255)} <br>
     * @param shpToState The value of the column 'SHP_TO_STATE'. (NullAllowed)
     */
    public void setShpToState(String shpToState) {
        __modifiedProperties.add("shpToState");
        this._shpToState = shpToState;
    }

    /**
     * [get] DELIV_ZIP_CD: {varchar(30)} <br>
     * @return The value of the column 'DELIV_ZIP_CD'. (NullAllowed)
     */
    public String getDelivZipCd() {
        return _delivZipCd;
    }

    /**
     * [set] DELIV_ZIP_CD: {varchar(30)} <br>
     * @param delivZipCd The value of the column 'DELIV_ZIP_CD'. (NullAllowed)
     */
    public void setDelivZipCd(String delivZipCd) {
        __modifiedProperties.add("delivZipCd");
        this._delivZipCd = delivZipCd;
    }

    /**
     * [get] PUBLIC_CD: {varchar(30)} <br>
     * @return The value of the column 'PUBLIC_CD'. (NullAllowed)
     */
    public String getPublicCd() {
        return _publicCd;
    }

    /**
     * [set] PUBLIC_CD: {varchar(30)} <br>
     * @param publicCd The value of the column 'PUBLIC_CD'. (NullAllowed)
     */
    public void setPublicCd(String publicCd) {
        __modifiedProperties.add("publicCd");
        this._publicCd = publicCd;
    }

    /**
     * [get] DELIV_TEL_NO: {varchar(255)} <br>
     * @return The value of the column 'DELIV_TEL_NO'. (NullAllowed)
     */
    public String getDelivTelNo() {
        return _delivTelNo;
    }

    /**
     * [set] DELIV_TEL_NO: {varchar(255)} <br>
     * @param delivTelNo The value of the column 'DELIV_TEL_NO'. (NullAllowed)
     */
    public void setDelivTelNo(String delivTelNo) {
        __modifiedProperties.add("delivTelNo");
        this._delivTelNo = delivTelNo;
    }

    /**
     * [get] PAYMENT_TERM: {varchar(30)} <br>
     * @return The value of the column 'PAYMENT_TERM'. (NullAllowed)
     */
    public String getPaymentTerm() {
        return _paymentTerm;
    }

    /**
     * [set] PAYMENT_TERM: {varchar(30)} <br>
     * @param paymentTerm The value of the column 'PAYMENT_TERM'. (NullAllowed)
     */
    public void setPaymentTerm(String paymentTerm) {
        __modifiedProperties.add("paymentTerm");
        this._paymentTerm = paymentTerm;
    }

    /**
     * [get] COLLECT_ACCOUNT_NO_BILL_TO: {varchar(30)} <br>
     * @return The value of the column 'COLLECT_ACCOUNT_NO_BILL_TO'. (NullAllowed)
     */
    public String getCollectAccountNoBillTo() {
        return _collectAccountNoBillTo;
    }

    /**
     * [set] COLLECT_ACCOUNT_NO_BILL_TO: {varchar(30)} <br>
     * @param collectAccountNoBillTo The value of the column 'COLLECT_ACCOUNT_NO_BILL_TO'. (NullAllowed)
     */
    public void setCollectAccountNoBillTo(String collectAccountNoBillTo) {
        __modifiedProperties.add("collectAccountNoBillTo");
        this._collectAccountNoBillTo = collectAccountNoBillTo;
    }

    /**
     * [get] COLLECT_ZIP_CD_BILL_TO: {varchar(30)} <br>
     * @return The value of the column 'COLLECT_ZIP_CD_BILL_TO'. (NullAllowed)
     */
    public String getCollectZipCdBillTo() {
        return _collectZipCdBillTo;
    }

    /**
     * [set] COLLECT_ZIP_CD_BILL_TO: {varchar(30)} <br>
     * @param collectZipCdBillTo The value of the column 'COLLECT_ZIP_CD_BILL_TO'. (NullAllowed)
     */
    public void setCollectZipCdBillTo(String collectZipCdBillTo) {
        __modifiedProperties.add("collectZipCdBillTo");
        this._collectZipCdBillTo = collectZipCdBillTo;
    }

    /**
     * [get] COLLECT_COUNTRY_CD_BILL_TO: {varchar(30)} <br>
     * @return The value of the column 'COLLECT_COUNTRY_CD_BILL_TO'. (NullAllowed)
     */
    public String getCollectCountryCdBillTo() {
        return _collectCountryCdBillTo;
    }

    /**
     * [set] COLLECT_COUNTRY_CD_BILL_TO: {varchar(30)} <br>
     * @param collectCountryCdBillTo The value of the column 'COLLECT_COUNTRY_CD_BILL_TO'. (NullAllowed)
     */
    public void setCollectCountryCdBillTo(String collectCountryCdBillTo) {
        __modifiedProperties.add("collectCountryCdBillTo");
        this._collectCountryCdBillTo = collectCountryCdBillTo;
    }

    /**
     * [get] PAYMENT_TERM_CD_TAXES_TO: {varchar(30)} <br>
     * @return The value of the column 'PAYMENT_TERM_CD_TAXES_TO'. (NullAllowed)
     */
    public String getPaymentTermCdTaxesTo() {
        return _paymentTermCdTaxesTo;
    }

    /**
     * [set] PAYMENT_TERM_CD_TAXES_TO: {varchar(30)} <br>
     * @param paymentTermCdTaxesTo The value of the column 'PAYMENT_TERM_CD_TAXES_TO'. (NullAllowed)
     */
    public void setPaymentTermCdTaxesTo(String paymentTermCdTaxesTo) {
        __modifiedProperties.add("paymentTermCdTaxesTo");
        this._paymentTermCdTaxesTo = paymentTermCdTaxesTo;
    }

    /**
     * [get] COLLECT_ACCOUNT_NO_TAXES_TO: {varchar(30)} <br>
     * @return The value of the column 'COLLECT_ACCOUNT_NO_TAXES_TO'. (NullAllowed)
     */
    public String getCollectAccountNoTaxesTo() {
        return _collectAccountNoTaxesTo;
    }

    /**
     * [set] COLLECT_ACCOUNT_NO_TAXES_TO: {varchar(30)} <br>
     * @param collectAccountNoTaxesTo The value of the column 'COLLECT_ACCOUNT_NO_TAXES_TO'. (NullAllowed)
     */
    public void setCollectAccountNoTaxesTo(String collectAccountNoTaxesTo) {
        __modifiedProperties.add("collectAccountNoTaxesTo");
        this._collectAccountNoTaxesTo = collectAccountNoTaxesTo;
    }

    /**
     * [get] COLLECT_ZIP_CD_TAXES_TO: {varchar(30)} <br>
     * @return The value of the column 'COLLECT_ZIP_CD_TAXES_TO'. (NullAllowed)
     */
    public String getCollectZipCdTaxesTo() {
        return _collectZipCdTaxesTo;
    }

    /**
     * [set] COLLECT_ZIP_CD_TAXES_TO: {varchar(30)} <br>
     * @param collectZipCdTaxesTo The value of the column 'COLLECT_ZIP_CD_TAXES_TO'. (NullAllowed)
     */
    public void setCollectZipCdTaxesTo(String collectZipCdTaxesTo) {
        __modifiedProperties.add("collectZipCdTaxesTo");
        this._collectZipCdTaxesTo = collectZipCdTaxesTo;
    }

    /**
     * [get] COLLECT_COUNTRY_CD_TAXES_TO: {varchar(30)} <br>
     * @return The value of the column 'COLLECT_COUNTRY_CD_TAXES_TO'. (NullAllowed)
     */
    public String getCollectCountryCdTaxesTo() {
        return _collectCountryCdTaxesTo;
    }

    /**
     * [set] COLLECT_COUNTRY_CD_TAXES_TO: {varchar(30)} <br>
     * @param collectCountryCdTaxesTo The value of the column 'COLLECT_COUNTRY_CD_TAXES_TO'. (NullAllowed)
     */
    public void setCollectCountryCdTaxesTo(String collectCountryCdTaxesTo) {
        __modifiedProperties.add("collectCountryCdTaxesTo");
        this._collectCountryCdTaxesTo = collectCountryCdTaxesTo;
    }

    /**
     * [get] COD_PAYMENT_TERM_CD: {varchar(30)} <br>
     * @return The value of the column 'COD_PAYMENT_TERM_CD'. (NullAllowed)
     */
    public String getCodPaymentTermCd() {
        return _codPaymentTermCd;
    }

    /**
     * [set] COD_PAYMENT_TERM_CD: {varchar(30)} <br>
     * @param codPaymentTermCd The value of the column 'COD_PAYMENT_TERM_CD'. (NullAllowed)
     */
    public void setCodPaymentTermCd(String codPaymentTermCd) {
        __modifiedProperties.add("codPaymentTermCd");
        this._codPaymentTermCd = codPaymentTermCd;
    }

    /**
     * [get] COD_AMOUNT: {decimal(38, 6)} <br>
     * @return The value of the column 'COD_AMOUNT'. (NullAllowed)
     */
    public java.math.BigDecimal getCodAmount() {
        return _codAmount;
    }

    /**
     * [set] COD_AMOUNT: {decimal(38, 6)} <br>
     * @param codAmount The value of the column 'COD_AMOUNT'. (NullAllowed)
     */
    public void setCodAmount(java.math.BigDecimal codAmount) {
        __modifiedProperties.add("codAmount");
        this._codAmount = codAmount;
    }

    /**
     * [get] COD_FEE_PAYER: {varchar(30)} <br>
     * @return The value of the column 'COD_FEE_PAYER'. (NullAllowed)
     */
    public String getCodFeePayer() {
        return _codFeePayer;
    }

    /**
     * [set] COD_FEE_PAYER: {varchar(30)} <br>
     * @param codFeePayer The value of the column 'COD_FEE_PAYER'. (NullAllowed)
     */
    public void setCodFeePayer(String codFeePayer) {
        __modifiedProperties.add("codFeePayer");
        this._codFeePayer = codFeePayer;
    }

    /**
     * [get] TERMS_OF_SALES: {varchar(30)} <br>
     * @return The value of the column 'TERMS_OF_SALES'. (NullAllowed)
     */
    public String getTermsOfSales() {
        return _termsOfSales;
    }

    /**
     * [set] TERMS_OF_SALES: {varchar(30)} <br>
     * @param termsOfSales The value of the column 'TERMS_OF_SALES'. (NullAllowed)
     */
    public void setTermsOfSales(String termsOfSales) {
        __modifiedProperties.add("termsOfSales");
        this._termsOfSales = termsOfSales;
    }

    /**
     * [get] BROKER_NAME: {varchar(255)} <br>
     * @return The value of the column 'BROKER_NAME'. (NullAllowed)
     */
    public String getBrokerName() {
        return _brokerName;
    }

    /**
     * [set] BROKER_NAME: {varchar(255)} <br>
     * @param brokerName The value of the column 'BROKER_NAME'. (NullAllowed)
     */
    public void setBrokerName(String brokerName) {
        __modifiedProperties.add("brokerName");
        this._brokerName = brokerName;
    }

    /**
     * [get] BROKER_PHONE_NO: {varchar(30)} <br>
     * @return The value of the column 'BROKER_PHONE_NO'. (NullAllowed)
     */
    public String getBrokerPhoneNo() {
        return _brokerPhoneNo;
    }

    /**
     * [set] BROKER_PHONE_NO: {varchar(30)} <br>
     * @param brokerPhoneNo The value of the column 'BROKER_PHONE_NO'. (NullAllowed)
     */
    public void setBrokerPhoneNo(String brokerPhoneNo) {
        __modifiedProperties.add("brokerPhoneNo");
        this._brokerPhoneNo = brokerPhoneNo;
    }

    /**
     * [get] BROKER_FAX_NO: {varchar(30)} <br>
     * @return The value of the column 'BROKER_FAX_NO'. (NullAllowed)
     */
    public String getBrokerFaxNo() {
        return _brokerFaxNo;
    }

    /**
     * [set] BROKER_FAX_NO: {varchar(30)} <br>
     * @param brokerFaxNo The value of the column 'BROKER_FAX_NO'. (NullAllowed)
     */
    public void setBrokerFaxNo(String brokerFaxNo) {
        __modifiedProperties.add("brokerFaxNo");
        this._brokerFaxNo = brokerFaxNo;
    }

    /**
     * [get] SAT_DELIVERY_FLG: {char(1)} <br>
     * @return The value of the column 'SAT_DELIVERY_FLG'. (NullAllowed)
     */
    public String getSatDeliveryFlg() {
        return _satDeliveryFlg;
    }

    /**
     * [set] SAT_DELIVERY_FLG: {char(1)} <br>
     * @param satDeliveryFlg The value of the column 'SAT_DELIVERY_FLG'. (NullAllowed)
     */
    public void setSatDeliveryFlg(String satDeliveryFlg) {
        __modifiedProperties.add("satDeliveryFlg");
        this._satDeliveryFlg = satDeliveryFlg;
    }

    /**
     * [get] RESIDENTIAL_DELIVERY_FLG: {char(1)} <br>
     * @return The value of the column 'RESIDENTIAL_DELIVERY_FLG'. (NullAllowed)
     */
    public String getResidentialDeliveryFlg() {
        return _residentialDeliveryFlg;
    }

    /**
     * [set] RESIDENTIAL_DELIVERY_FLG: {char(1)} <br>
     * @param residentialDeliveryFlg The value of the column 'RESIDENTIAL_DELIVERY_FLG'. (NullAllowed)
     */
    public void setResidentialDeliveryFlg(String residentialDeliveryFlg) {
        __modifiedProperties.add("residentialDeliveryFlg");
        this._residentialDeliveryFlg = residentialDeliveryFlg;
    }

    /**
     * [get] COD_FLG: {char(1)} <br>
     * @return The value of the column 'COD_FLG'. (NullAllowed)
     */
    public String getCodFlg() {
        return _codFlg;
    }

    /**
     * [set] COD_FLG: {char(1)} <br>
     * @param codFlg The value of the column 'COD_FLG'. (NullAllowed)
     */
    public void setCodFlg(String codFlg) {
        __modifiedProperties.add("codFlg");
        this._codFlg = codFlg;
    }

    /**
     * [get] SIGNATURE_REQUIRED_FLG: {char(1)} <br>
     * @return The value of the column 'SIGNATURE_REQUIRED_FLG'. (NullAllowed)
     */
    public String getSignatureRequiredFlg() {
        return _signatureRequiredFlg;
    }

    /**
     * [set] SIGNATURE_REQUIRED_FLG: {char(1)} <br>
     * @param signatureRequiredFlg The value of the column 'SIGNATURE_REQUIRED_FLG'. (NullAllowed)
     */
    public void setSignatureRequiredFlg(String signatureRequiredFlg) {
        __modifiedProperties.add("signatureRequiredFlg");
        this._signatureRequiredFlg = signatureRequiredFlg;
    }

    /**
     * [get] SIGNATURE_RELEASE_FLG: {char(1)} <br>
     * @return The value of the column 'SIGNATURE_RELEASE_FLG'. (NullAllowed)
     */
    public String getSignatureReleaseFlg() {
        return _signatureReleaseFlg;
    }

    /**
     * [set] SIGNATURE_RELEASE_FLG: {char(1)} <br>
     * @param signatureReleaseFlg The value of the column 'SIGNATURE_RELEASE_FLG'. (NullAllowed)
     */
    public void setSignatureReleaseFlg(String signatureReleaseFlg) {
        __modifiedProperties.add("signatureReleaseFlg");
        this._signatureReleaseFlg = signatureReleaseFlg;
    }

    /**
     * [get] CALL_BEFORE_DELIVERY_FLG: {char(1)} <br>
     * @return The value of the column 'CALL_BEFORE_DELIVERY_FLG'. (NullAllowed)
     */
    public String getCallBeforeDeliveryFlg() {
        return _callBeforeDeliveryFlg;
    }

    /**
     * [set] CALL_BEFORE_DELIVERY_FLG: {char(1)} <br>
     * @param callBeforeDeliveryFlg The value of the column 'CALL_BEFORE_DELIVERY_FLG'. (NullAllowed)
     */
    public void setCallBeforeDeliveryFlg(String callBeforeDeliveryFlg) {
        __modifiedProperties.add("callBeforeDeliveryFlg");
        this._callBeforeDeliveryFlg = callBeforeDeliveryFlg;
    }

    /**
     * [get] FREEZABLE_PROTECTION_FLG: {char(1)} <br>
     * @return The value of the column 'FREEZABLE_PROTECTION_FLG'. (NullAllowed)
     */
    public String getFreezableProtectionFlg() {
        return _freezableProtectionFlg;
    }

    /**
     * [set] FREEZABLE_PROTECTION_FLG: {char(1)} <br>
     * @param freezableProtectionFlg The value of the column 'FREEZABLE_PROTECTION_FLG'. (NullAllowed)
     */
    public void setFreezableProtectionFlg(String freezableProtectionFlg) {
        __modifiedProperties.add("freezableProtectionFlg");
        this._freezableProtectionFlg = freezableProtectionFlg;
    }

    /**
     * [get] GUARANTEED_PLUS_FLG: {char(1)} <br>
     * @return The value of the column 'GUARANTEED_PLUS_FLG'. (NullAllowed)
     */
    public String getGuaranteedPlusFlg() {
        return _guaranteedPlusFlg;
    }

    /**
     * [set] GUARANTEED_PLUS_FLG: {char(1)} <br>
     * @param guaranteedPlusFlg The value of the column 'GUARANTEED_PLUS_FLG'. (NullAllowed)
     */
    public void setGuaranteedPlusFlg(String guaranteedPlusFlg) {
        __modifiedProperties.add("guaranteedPlusFlg");
        this._guaranteedPlusFlg = guaranteedPlusFlg;
    }

    /**
     * [get] RESIDENTIAL_PICKUP_FLG: {char(1)} <br>
     * @return The value of the column 'RESIDENTIAL_PICKUP_FLG'. (NullAllowed)
     */
    public String getResidentialPickupFlg() {
        return _residentialPickupFlg;
    }

    /**
     * [set] RESIDENTIAL_PICKUP_FLG: {char(1)} <br>
     * @param residentialPickupFlg The value of the column 'RESIDENTIAL_PICKUP_FLG'. (NullAllowed)
     */
    public void setResidentialPickupFlg(String residentialPickupFlg) {
        __modifiedProperties.add("residentialPickupFlg");
        this._residentialPickupFlg = residentialPickupFlg;
    }

    /**
     * [get] DO_NOT_STACK_STACK_FLG: {char(1)} <br>
     * @return The value of the column 'DO_NOT_STACK_STACK_FLG'. (NullAllowed)
     */
    public String getDoNotStackStackFlg() {
        return _doNotStackStackFlg;
    }

    /**
     * [set] DO_NOT_STACK_STACK_FLG: {char(1)} <br>
     * @param doNotStackStackFlg The value of the column 'DO_NOT_STACK_STACK_FLG'. (NullAllowed)
     */
    public void setDoNotStackStackFlg(String doNotStackStackFlg) {
        __modifiedProperties.add("doNotStackStackFlg");
        this._doNotStackStackFlg = doNotStackStackFlg;
    }

    /**
     * [get] LIMITED_ACCESS_DELIVERY_FLG: {char(1)} <br>
     * @return The value of the column 'LIMITED_ACCESS_DELIVERY_FLG'. (NullAllowed)
     */
    public String getLimitedAccessDeliveryFlg() {
        return _limitedAccessDeliveryFlg;
    }

    /**
     * [set] LIMITED_ACCESS_DELIVERY_FLG: {char(1)} <br>
     * @param limitedAccessDeliveryFlg The value of the column 'LIMITED_ACCESS_DELIVERY_FLG'. (NullAllowed)
     */
    public void setLimitedAccessDeliveryFlg(String limitedAccessDeliveryFlg) {
        __modifiedProperties.add("limitedAccessDeliveryFlg");
        this._limitedAccessDeliveryFlg = limitedAccessDeliveryFlg;
    }

    /**
     * [get] LIMITED_ACCESS_PICKUP_FLG: {char(1)} <br>
     * @return The value of the column 'LIMITED_ACCESS_PICKUP_FLG'. (NullAllowed)
     */
    public String getLimitedAccessPickupFlg() {
        return _limitedAccessPickupFlg;
    }

    /**
     * [set] LIMITED_ACCESS_PICKUP_FLG: {char(1)} <br>
     * @param limitedAccessPickupFlg The value of the column 'LIMITED_ACCESS_PICKUP_FLG'. (NullAllowed)
     */
    public void setLimitedAccessPickupFlg(String limitedAccessPickupFlg) {
        __modifiedProperties.add("limitedAccessPickupFlg");
        this._limitedAccessPickupFlg = limitedAccessPickupFlg;
    }

    /**
     * [get] OVER_SIZED_FLG: {char(1)} <br>
     * @return The value of the column 'OVER_SIZED_FLG'. (NullAllowed)
     */
    public String getOverSizedFlg() {
        return _overSizedFlg;
    }

    /**
     * [set] OVER_SIZED_FLG: {char(1)} <br>
     * @param overSizedFlg The value of the column 'OVER_SIZED_FLG'. (NullAllowed)
     */
    public void setOverSizedFlg(String overSizedFlg) {
        __modifiedProperties.add("overSizedFlg");
        this._overSizedFlg = overSizedFlg;
    }

    /**
     * [get] POISON_FLG: {char(1)} <br>
     * @return The value of the column 'POISON_FLG'. (NullAllowed)
     */
    public String getPoisonFlg() {
        return _poisonFlg;
    }

    /**
     * [set] POISON_FLG: {char(1)} <br>
     * @param poisonFlg The value of the column 'POISON_FLG'. (NullAllowed)
     */
    public void setPoisonFlg(String poisonFlg) {
        __modifiedProperties.add("poisonFlg");
        this._poisonFlg = poisonFlg;
    }

    /**
     * [get] FOOG_FLG: {char(1)} <br>
     * @return The value of the column 'FOOG_FLG'. (NullAllowed)
     */
    public String getFoogFlg() {
        return _foogFlg;
    }

    /**
     * [set] FOOG_FLG: {char(1)} <br>
     * @param foogFlg The value of the column 'FOOG_FLG'. (NullAllowed)
     */
    public void setFoogFlg(String foogFlg) {
        __modifiedProperties.add("foogFlg");
        this._foogFlg = foogFlg;
    }

    /**
     * [get] LIFTGATE_DELIVERY_PREPAID_FLG: {char(1)} <br>
     * @return The value of the column 'LIFTGATE_DELIVERY_PREPAID_FLG'. (NullAllowed)
     */
    public String getLiftgateDeliveryPrepaidFlg() {
        return _liftgateDeliveryPrepaidFlg;
    }

    /**
     * [set] LIFTGATE_DELIVERY_PREPAID_FLG: {char(1)} <br>
     * @param liftgateDeliveryPrepaidFlg The value of the column 'LIFTGATE_DELIVERY_PREPAID_FLG'. (NullAllowed)
     */
    public void setLiftgateDeliveryPrepaidFlg(String liftgateDeliveryPrepaidFlg) {
        __modifiedProperties.add("liftgateDeliveryPrepaidFlg");
        this._liftgateDeliveryPrepaidFlg = liftgateDeliveryPrepaidFlg;
    }

    /**
     * [get] LIFTGATE_DELIVERY_COLLECT_FLG: {char(1)} <br>
     * @return The value of the column 'LIFTGATE_DELIVERY_COLLECT_FLG'. (NullAllowed)
     */
    public String getLiftgateDeliveryCollectFlg() {
        return _liftgateDeliveryCollectFlg;
    }

    /**
     * [set] LIFTGATE_DELIVERY_COLLECT_FLG: {char(1)} <br>
     * @param liftgateDeliveryCollectFlg The value of the column 'LIFTGATE_DELIVERY_COLLECT_FLG'. (NullAllowed)
     */
    public void setLiftgateDeliveryCollectFlg(String liftgateDeliveryCollectFlg) {
        __modifiedProperties.add("liftgateDeliveryCollectFlg");
        this._liftgateDeliveryCollectFlg = liftgateDeliveryCollectFlg;
    }

    /**
     * [get] LIFTGATE_PICKUP_PREPAID_FLG: {char(1)} <br>
     * @return The value of the column 'LIFTGATE_PICKUP_PREPAID_FLG'. (NullAllowed)
     */
    public String getLiftgatePickupPrepaidFlg() {
        return _liftgatePickupPrepaidFlg;
    }

    /**
     * [set] LIFTGATE_PICKUP_PREPAID_FLG: {char(1)} <br>
     * @param liftgatePickupPrepaidFlg The value of the column 'LIFTGATE_PICKUP_PREPAID_FLG'. (NullAllowed)
     */
    public void setLiftgatePickupPrepaidFlg(String liftgatePickupPrepaidFlg) {
        __modifiedProperties.add("liftgatePickupPrepaidFlg");
        this._liftgatePickupPrepaidFlg = liftgatePickupPrepaidFlg;
    }

    /**
     * [get] LIFTGATE_PICKUP_COLLECT_FLG: {char(1)} <br>
     * @return The value of the column 'LIFTGATE_PICKUP_COLLECT_FLG'. (NullAllowed)
     */
    public String getLiftgatePickupCollectFlg() {
        return _liftgatePickupCollectFlg;
    }

    /**
     * [set] LIFTGATE_PICKUP_COLLECT_FLG: {char(1)} <br>
     * @param liftgatePickupCollectFlg The value of the column 'LIFTGATE_PICKUP_COLLECT_FLG'. (NullAllowed)
     */
    public void setLiftgatePickupCollectFlg(String liftgatePickupCollectFlg) {
        __modifiedProperties.add("liftgatePickupCollectFlg");
        this._liftgatePickupCollectFlg = liftgatePickupCollectFlg;
    }

    /**
     * [get] INSIDE_DELIVERY_PREPAID_FLG: {char(1)} <br>
     * @return The value of the column 'INSIDE_DELIVERY_PREPAID_FLG'. (NullAllowed)
     */
    public String getInsideDeliveryPrepaidFlg() {
        return _insideDeliveryPrepaidFlg;
    }

    /**
     * [set] INSIDE_DELIVERY_PREPAID_FLG: {char(1)} <br>
     * @param insideDeliveryPrepaidFlg The value of the column 'INSIDE_DELIVERY_PREPAID_FLG'. (NullAllowed)
     */
    public void setInsideDeliveryPrepaidFlg(String insideDeliveryPrepaidFlg) {
        __modifiedProperties.add("insideDeliveryPrepaidFlg");
        this._insideDeliveryPrepaidFlg = insideDeliveryPrepaidFlg;
    }

    /**
     * [get] INSIDE_DELIVERY_COLLECT_FLG: {char(1)} <br>
     * @return The value of the column 'INSIDE_DELIVERY_COLLECT_FLG'. (NullAllowed)
     */
    public String getInsideDeliveryCollectFlg() {
        return _insideDeliveryCollectFlg;
    }

    /**
     * [set] INSIDE_DELIVERY_COLLECT_FLG: {char(1)} <br>
     * @param insideDeliveryCollectFlg The value of the column 'INSIDE_DELIVERY_COLLECT_FLG'. (NullAllowed)
     */
    public void setInsideDeliveryCollectFlg(String insideDeliveryCollectFlg) {
        __modifiedProperties.add("insideDeliveryCollectFlg");
        this._insideDeliveryCollectFlg = insideDeliveryCollectFlg;
    }

    /**
     * [get] INSIDE_PICKUP_PREPAID_FLG: {char(1)} <br>
     * @return The value of the column 'INSIDE_PICKUP_PREPAID_FLG'. (NullAllowed)
     */
    public String getInsidePickupPrepaidFlg() {
        return _insidePickupPrepaidFlg;
    }

    /**
     * [set] INSIDE_PICKUP_PREPAID_FLG: {char(1)} <br>
     * @param insidePickupPrepaidFlg The value of the column 'INSIDE_PICKUP_PREPAID_FLG'. (NullAllowed)
     */
    public void setInsidePickupPrepaidFlg(String insidePickupPrepaidFlg) {
        __modifiedProperties.add("insidePickupPrepaidFlg");
        this._insidePickupPrepaidFlg = insidePickupPrepaidFlg;
    }

    /**
     * [get] INSIDE_PICKUP_COLLECT_FLG: {char(1)} <br>
     * @return The value of the column 'INSIDE_PICKUP_COLLECT_FLG'. (NullAllowed)
     */
    public String getInsidePickupCollectFlg() {
        return _insidePickupCollectFlg;
    }

    /**
     * [set] INSIDE_PICKUP_COLLECT_FLG: {char(1)} <br>
     * @param insidePickupCollectFlg The value of the column 'INSIDE_PICKUP_COLLECT_FLG'. (NullAllowed)
     */
    public void setInsidePickupCollectFlg(String insidePickupCollectFlg) {
        __modifiedProperties.add("insidePickupCollectFlg");
        this._insidePickupCollectFlg = insidePickupCollectFlg;
    }

}
