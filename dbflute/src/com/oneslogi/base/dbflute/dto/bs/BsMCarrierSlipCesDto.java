package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of M_CARRIER_SLIP_CES as TABLE. <br>
 * キャリアEDIシステム送り状マスタ
 * <pre>
 * [primary-key]
 *     CUSTOMER_ID
 *
 * [column]
 *     CUSTOMER_ID, COLLECT_ACCOUNT_NO_BILL_TO, COLLECT_ZIP_CD_BILL_TO, COLLECT_COUNTRY_CD_BILL_TO, PAYMENT_TERM_CD_TAXES_TO, COLLECT_ACCOUNT_NO_TAXES_TO, COLLECT_ZIP_CD_TAXES_TO, COLLECT_COUNTRY_CD_TAXES_TO, COD_PAYMENT_TERM_CD, COD_AMOUNT, COD_FEE_PAYER, TERMS_OF_SALES, BROKER_NAME, BROKER_PHONE_NO, BROKER_FAX_NO, SAT_DELIVERY_FLG, RESIDENTIAL_DELIVERY_FLG, COD_FLG, SIGNATURE_REQUIRED_FLG, SIGNATURE_RELEASE_FLG, CALL_BEFORE_DELIVERY_FLG, FREEZABLE_PROTECTION_FLG, GUARANTEED_PLUS_FLG, RESIDENTIAL_PICKUP_FLG, DO_NOT_STACK_STACK_FLG, LIMITED_ACCESS_DELIVERY_FLG, LIMITED_ACCESS_PICKUP_FLG, OVER_SIZED_FLG, POISON_FLG, FOOG_FLG, LIFTGATE_DELIVERY_PREPAID_FLG, LIFTGATE_DELIVERY_COLLECT_FLG, LIFTGATE_PICKUP_PREPAID_FLG, LIFTGATE_PICKUP_COLLECT_FLG, INSIDE_DELIVERY_PREPAID_FLG, INSIDE_DELIVERY_COLLECT_FLG, INSIDE_PICKUP_PREPAID_FLG, INSIDE_PICKUP_COLLECT_FLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     CUSTOMER_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     M_CUSTOMER, B_CLASS_DTL(BySatDeliveryFlg)
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     mCustomer, bClassDtlBySatDeliveryFlg, bClassDtlByResidentialDeliveryFlg, bClassDtlByCodFlg, bClassDtlBySignatureRequiredFlg, bClassDtlBySignatureReleaseFlg, bClassDtlByCallBeforeDeliveryFlg, bClassDtlByFreezableProtectionFlg, bClassDtlByGuaranteedPlusFlg, bClassDtlByResidentialPickupFlg, bClassDtlByDoNotStackStackFlg, bClassDtlByLimitedAccessDeliveryFlg, bClassDtlByLimitedAccessPickupFlg, bClassDtlByOverSizedFlg, bClassDtlByPoisonFlg, bClassDtlByFoogFlg, bClassDtlByLiftgateDeliveryPrepaidFlg, bClassDtlByLiftgateDeliveryCollectFlg, bClassDtlByLiftgatePickupPrepaidFlg, bClassDtlByLiftgatePickupCollectFlg, bClassDtlByInsideDeliveryPrepaidFlg, bClassDtlByInsideDeliveryCollectFlg, bClassDtlByInsidePickupPrepaidFlg, bClassDtlByInsidePickupCollectFlg, bClassDtlByDelFlg
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsMCarrierSlipCesDto implements Serializable {

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
    /** CUSTOMER_ID: {PK, ID, NotNull, bigint identity(19), FK to M_CUSTOMER} */
    @JsonKey
    protected Long _customerId;

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

    /** COD_AMOUNT: {decimal(16, 6)} */
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

    /** SAT_DELIVERY_FLG: {char(1), FK to B_CLASS_DTL, classification=SatDeliveryFlg} */
    @JsonKey
    protected String _satDeliveryFlg;

    /** RESIDENTIAL_DELIVERY_FLG: {char(1), FK to B_CLASS_DTL, classification=ResidentialDeliveryFlg} */
    @JsonKey
    protected String _residentialDeliveryFlg;

    /** COD_FLG: {char(1), FK to B_CLASS_DTL, classification=CodFlg} */
    @JsonKey
    protected String _codFlg;

    /** SIGNATURE_REQUIRED_FLG: {char(1), FK to B_CLASS_DTL, classification=SignatureRequiredFlg} */
    @JsonKey
    protected String _signatureRequiredFlg;

    /** SIGNATURE_RELEASE_FLG: {char(1), FK to B_CLASS_DTL, classification=SignatureReleaseFlg} */
    @JsonKey
    protected String _signatureReleaseFlg;

    /** CALL_BEFORE_DELIVERY_FLG: {char(1), FK to B_CLASS_DTL, classification=CallBeforeDeliveryFlg} */
    @JsonKey
    protected String _callBeforeDeliveryFlg;

    /** FREEZABLE_PROTECTION_FLG: {char(1), FK to B_CLASS_DTL, classification=FreezableProtectionFlg} */
    @JsonKey
    protected String _freezableProtectionFlg;

    /** GUARANTEED_PLUS_FLG: {char(1), FK to B_CLASS_DTL, classification=GuaranteedPlusFlg} */
    @JsonKey
    protected String _guaranteedPlusFlg;

    /** RESIDENTIAL_PICKUP_FLG: {char(1), FK to B_CLASS_DTL, classification=ResidentialPickupFlg} */
    @JsonKey
    protected String _residentialPickupFlg;

    /** DO_NOT_STACK_STACK_FLG: {char(1), FK to B_CLASS_DTL, classification=DoNotStackStackFlg} */
    @JsonKey
    protected String _doNotStackStackFlg;

    /** LIMITED_ACCESS_DELIVERY_FLG: {char(1), FK to B_CLASS_DTL, classification=LimitedAccessDeliveryFlg} */
    @JsonKey
    protected String _limitedAccessDeliveryFlg;

    /** LIMITED_ACCESS_PICKUP_FLG: {char(1), FK to B_CLASS_DTL, classification=LimitedAccessPickupFlg} */
    @JsonKey
    protected String _limitedAccessPickupFlg;

    /** OVER_SIZED_FLG: {char(1), FK to B_CLASS_DTL, classification=OverSizedFlg} */
    @JsonKey
    protected String _overSizedFlg;

    /** POISON_FLG: {char(1), FK to B_CLASS_DTL, classification=PoisonFlg} */
    @JsonKey
    protected String _poisonFlg;

    /** FOOG_FLG: {char(1), FK to B_CLASS_DTL, classification=FoogFlg} */
    @JsonKey
    protected String _foogFlg;

    /** LIFTGATE_DELIVERY_PREPAID_FLG: {char(1), FK to B_CLASS_DTL, classification=LiftgateDeliveryPrepaidFlg} */
    @JsonKey
    protected String _liftgateDeliveryPrepaidFlg;

    /** LIFTGATE_DELIVERY_COLLECT_FLG: {char(1), FK to B_CLASS_DTL, classification=LiftgateDeliveryCollectFlg} */
    @JsonKey
    protected String _liftgateDeliveryCollectFlg;

    /** LIFTGATE_PICKUP_PREPAID_FLG: {char(1), FK to B_CLASS_DTL, classification=LiftgatePickupPrepaidFlg} */
    @JsonKey
    protected String _liftgatePickupPrepaidFlg;

    /** LIFTGATE_PICKUP_COLLECT_FLG: {char(1), FK to B_CLASS_DTL, classification=LiftgatePickupCollectFlg} */
    @JsonKey
    protected String _liftgatePickupCollectFlg;

    /** INSIDE_DELIVERY_PREPAID_FLG: {char(1), FK to B_CLASS_DTL, classification=InsideDeliveryPrepaidFlg} */
    @JsonKey
    protected String _insideDeliveryPrepaidFlg;

    /** INSIDE_DELIVERY_COLLECT_FLG: {char(1), FK to B_CLASS_DTL, classification=InsideDeliveryCollectFlg} */
    @JsonKey
    protected String _insideDeliveryCollectFlg;

    /** INSIDE_PICKUP_PREPAID_FLG: {char(1), FK to B_CLASS_DTL, classification=InsidePickupPrepaidFlg} */
    @JsonKey
    protected String _insidePickupPrepaidFlg;

    /** INSIDE_PICKUP_COLLECT_FLG: {char(1), FK to B_CLASS_DTL, classification=InsidePickupCollectFlg} */
    @JsonKey
    protected String _insidePickupCollectFlg;

    /** DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg} */
    @JsonKey
    protected String _delFlg;

    /** VERSION_NO: {NotNull, bigint(19), default=[(0)]} */
    @JsonKey
    protected Long _versionNo;

    /** CONTROL_NO: {bigint(19)} */
    @JsonKey
    protected Long _controlNo;

    /** ADD_DT: {datetime2(26, 6)} */
    @JsonKey
    protected java.sql.Timestamp _addDt;

    /** ADD_USER: {varchar(255)} */
    @JsonKey
    protected String _addUser;

    /** ADD_PROCESS: {varchar(4000)} */
    @JsonKey
    protected String _addProcess;

    /** UPD_DT: {datetime2(26, 6)} */
    @JsonKey
    protected java.sql.Timestamp _updDt;

    /** UPD_USER: {varchar(255)} */
    @JsonKey
    protected String _updUser;

    /** UPD_PROCESS: {varchar(4000)} */
    @JsonKey
    protected String _updProcess;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMCarrierSlipCesDto() {
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
    protected MCustomerDto _mCustomer;

    public MCustomerDto getMCustomer() {
        return _mCustomer;
    }

    public void setMCustomer(MCustomerDto mCustomer) {
        this._mCustomer = mCustomer;
    }

    protected BClassDtlDto _bClassDtlBySatDeliveryFlg;

    public BClassDtlDto getBClassDtlBySatDeliveryFlg() {
        return _bClassDtlBySatDeliveryFlg;
    }

    public void setBClassDtlBySatDeliveryFlg(BClassDtlDto bClassDtlBySatDeliveryFlg) {
        this._bClassDtlBySatDeliveryFlg = bClassDtlBySatDeliveryFlg;
    }

    protected BClassDtlDto _bClassDtlByResidentialDeliveryFlg;

    public BClassDtlDto getBClassDtlByResidentialDeliveryFlg() {
        return _bClassDtlByResidentialDeliveryFlg;
    }

    public void setBClassDtlByResidentialDeliveryFlg(BClassDtlDto bClassDtlByResidentialDeliveryFlg) {
        this._bClassDtlByResidentialDeliveryFlg = bClassDtlByResidentialDeliveryFlg;
    }

    protected BClassDtlDto _bClassDtlByCodFlg;

    public BClassDtlDto getBClassDtlByCodFlg() {
        return _bClassDtlByCodFlg;
    }

    public void setBClassDtlByCodFlg(BClassDtlDto bClassDtlByCodFlg) {
        this._bClassDtlByCodFlg = bClassDtlByCodFlg;
    }

    protected BClassDtlDto _bClassDtlBySignatureRequiredFlg;

    public BClassDtlDto getBClassDtlBySignatureRequiredFlg() {
        return _bClassDtlBySignatureRequiredFlg;
    }

    public void setBClassDtlBySignatureRequiredFlg(BClassDtlDto bClassDtlBySignatureRequiredFlg) {
        this._bClassDtlBySignatureRequiredFlg = bClassDtlBySignatureRequiredFlg;
    }

    protected BClassDtlDto _bClassDtlBySignatureReleaseFlg;

    public BClassDtlDto getBClassDtlBySignatureReleaseFlg() {
        return _bClassDtlBySignatureReleaseFlg;
    }

    public void setBClassDtlBySignatureReleaseFlg(BClassDtlDto bClassDtlBySignatureReleaseFlg) {
        this._bClassDtlBySignatureReleaseFlg = bClassDtlBySignatureReleaseFlg;
    }

    protected BClassDtlDto _bClassDtlByCallBeforeDeliveryFlg;

    public BClassDtlDto getBClassDtlByCallBeforeDeliveryFlg() {
        return _bClassDtlByCallBeforeDeliveryFlg;
    }

    public void setBClassDtlByCallBeforeDeliveryFlg(BClassDtlDto bClassDtlByCallBeforeDeliveryFlg) {
        this._bClassDtlByCallBeforeDeliveryFlg = bClassDtlByCallBeforeDeliveryFlg;
    }

    protected BClassDtlDto _bClassDtlByFreezableProtectionFlg;

    public BClassDtlDto getBClassDtlByFreezableProtectionFlg() {
        return _bClassDtlByFreezableProtectionFlg;
    }

    public void setBClassDtlByFreezableProtectionFlg(BClassDtlDto bClassDtlByFreezableProtectionFlg) {
        this._bClassDtlByFreezableProtectionFlg = bClassDtlByFreezableProtectionFlg;
    }

    protected BClassDtlDto _bClassDtlByGuaranteedPlusFlg;

    public BClassDtlDto getBClassDtlByGuaranteedPlusFlg() {
        return _bClassDtlByGuaranteedPlusFlg;
    }

    public void setBClassDtlByGuaranteedPlusFlg(BClassDtlDto bClassDtlByGuaranteedPlusFlg) {
        this._bClassDtlByGuaranteedPlusFlg = bClassDtlByGuaranteedPlusFlg;
    }

    protected BClassDtlDto _bClassDtlByResidentialPickupFlg;

    public BClassDtlDto getBClassDtlByResidentialPickupFlg() {
        return _bClassDtlByResidentialPickupFlg;
    }

    public void setBClassDtlByResidentialPickupFlg(BClassDtlDto bClassDtlByResidentialPickupFlg) {
        this._bClassDtlByResidentialPickupFlg = bClassDtlByResidentialPickupFlg;
    }

    protected BClassDtlDto _bClassDtlByDoNotStackStackFlg;

    public BClassDtlDto getBClassDtlByDoNotStackStackFlg() {
        return _bClassDtlByDoNotStackStackFlg;
    }

    public void setBClassDtlByDoNotStackStackFlg(BClassDtlDto bClassDtlByDoNotStackStackFlg) {
        this._bClassDtlByDoNotStackStackFlg = bClassDtlByDoNotStackStackFlg;
    }

    protected BClassDtlDto _bClassDtlByLimitedAccessDeliveryFlg;

    public BClassDtlDto getBClassDtlByLimitedAccessDeliveryFlg() {
        return _bClassDtlByLimitedAccessDeliveryFlg;
    }

    public void setBClassDtlByLimitedAccessDeliveryFlg(BClassDtlDto bClassDtlByLimitedAccessDeliveryFlg) {
        this._bClassDtlByLimitedAccessDeliveryFlg = bClassDtlByLimitedAccessDeliveryFlg;
    }

    protected BClassDtlDto _bClassDtlByLimitedAccessPickupFlg;

    public BClassDtlDto getBClassDtlByLimitedAccessPickupFlg() {
        return _bClassDtlByLimitedAccessPickupFlg;
    }

    public void setBClassDtlByLimitedAccessPickupFlg(BClassDtlDto bClassDtlByLimitedAccessPickupFlg) {
        this._bClassDtlByLimitedAccessPickupFlg = bClassDtlByLimitedAccessPickupFlg;
    }

    protected BClassDtlDto _bClassDtlByOverSizedFlg;

    public BClassDtlDto getBClassDtlByOverSizedFlg() {
        return _bClassDtlByOverSizedFlg;
    }

    public void setBClassDtlByOverSizedFlg(BClassDtlDto bClassDtlByOverSizedFlg) {
        this._bClassDtlByOverSizedFlg = bClassDtlByOverSizedFlg;
    }

    protected BClassDtlDto _bClassDtlByPoisonFlg;

    public BClassDtlDto getBClassDtlByPoisonFlg() {
        return _bClassDtlByPoisonFlg;
    }

    public void setBClassDtlByPoisonFlg(BClassDtlDto bClassDtlByPoisonFlg) {
        this._bClassDtlByPoisonFlg = bClassDtlByPoisonFlg;
    }

    protected BClassDtlDto _bClassDtlByFoogFlg;

    public BClassDtlDto getBClassDtlByFoogFlg() {
        return _bClassDtlByFoogFlg;
    }

    public void setBClassDtlByFoogFlg(BClassDtlDto bClassDtlByFoogFlg) {
        this._bClassDtlByFoogFlg = bClassDtlByFoogFlg;
    }

    protected BClassDtlDto _bClassDtlByLiftgateDeliveryPrepaidFlg;

    public BClassDtlDto getBClassDtlByLiftgateDeliveryPrepaidFlg() {
        return _bClassDtlByLiftgateDeliveryPrepaidFlg;
    }

    public void setBClassDtlByLiftgateDeliveryPrepaidFlg(BClassDtlDto bClassDtlByLiftgateDeliveryPrepaidFlg) {
        this._bClassDtlByLiftgateDeliveryPrepaidFlg = bClassDtlByLiftgateDeliveryPrepaidFlg;
    }

    protected BClassDtlDto _bClassDtlByLiftgateDeliveryCollectFlg;

    public BClassDtlDto getBClassDtlByLiftgateDeliveryCollectFlg() {
        return _bClassDtlByLiftgateDeliveryCollectFlg;
    }

    public void setBClassDtlByLiftgateDeliveryCollectFlg(BClassDtlDto bClassDtlByLiftgateDeliveryCollectFlg) {
        this._bClassDtlByLiftgateDeliveryCollectFlg = bClassDtlByLiftgateDeliveryCollectFlg;
    }

    protected BClassDtlDto _bClassDtlByLiftgatePickupPrepaidFlg;

    public BClassDtlDto getBClassDtlByLiftgatePickupPrepaidFlg() {
        return _bClassDtlByLiftgatePickupPrepaidFlg;
    }

    public void setBClassDtlByLiftgatePickupPrepaidFlg(BClassDtlDto bClassDtlByLiftgatePickupPrepaidFlg) {
        this._bClassDtlByLiftgatePickupPrepaidFlg = bClassDtlByLiftgatePickupPrepaidFlg;
    }

    protected BClassDtlDto _bClassDtlByLiftgatePickupCollectFlg;

    public BClassDtlDto getBClassDtlByLiftgatePickupCollectFlg() {
        return _bClassDtlByLiftgatePickupCollectFlg;
    }

    public void setBClassDtlByLiftgatePickupCollectFlg(BClassDtlDto bClassDtlByLiftgatePickupCollectFlg) {
        this._bClassDtlByLiftgatePickupCollectFlg = bClassDtlByLiftgatePickupCollectFlg;
    }

    protected BClassDtlDto _bClassDtlByInsideDeliveryPrepaidFlg;

    public BClassDtlDto getBClassDtlByInsideDeliveryPrepaidFlg() {
        return _bClassDtlByInsideDeliveryPrepaidFlg;
    }

    public void setBClassDtlByInsideDeliveryPrepaidFlg(BClassDtlDto bClassDtlByInsideDeliveryPrepaidFlg) {
        this._bClassDtlByInsideDeliveryPrepaidFlg = bClassDtlByInsideDeliveryPrepaidFlg;
    }

    protected BClassDtlDto _bClassDtlByInsideDeliveryCollectFlg;

    public BClassDtlDto getBClassDtlByInsideDeliveryCollectFlg() {
        return _bClassDtlByInsideDeliveryCollectFlg;
    }

    public void setBClassDtlByInsideDeliveryCollectFlg(BClassDtlDto bClassDtlByInsideDeliveryCollectFlg) {
        this._bClassDtlByInsideDeliveryCollectFlg = bClassDtlByInsideDeliveryCollectFlg;
    }

    protected BClassDtlDto _bClassDtlByInsidePickupPrepaidFlg;

    public BClassDtlDto getBClassDtlByInsidePickupPrepaidFlg() {
        return _bClassDtlByInsidePickupPrepaidFlg;
    }

    public void setBClassDtlByInsidePickupPrepaidFlg(BClassDtlDto bClassDtlByInsidePickupPrepaidFlg) {
        this._bClassDtlByInsidePickupPrepaidFlg = bClassDtlByInsidePickupPrepaidFlg;
    }

    protected BClassDtlDto _bClassDtlByInsidePickupCollectFlg;

    public BClassDtlDto getBClassDtlByInsidePickupCollectFlg() {
        return _bClassDtlByInsidePickupCollectFlg;
    }

    public void setBClassDtlByInsidePickupCollectFlg(BClassDtlDto bClassDtlByInsidePickupCollectFlg) {
        this._bClassDtlByInsidePickupCollectFlg = bClassDtlByInsidePickupCollectFlg;
    }

    protected BClassDtlDto _bClassDtlByDelFlg;

    public BClassDtlDto getBClassDtlByDelFlg() {
        return _bClassDtlByDelFlg;
    }

    public void setBClassDtlByDelFlg(BClassDtlDto bClassDtlByDelFlg) {
        this._bClassDtlByDelFlg = bClassDtlByDelFlg;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsMCarrierSlipCesDto)) { return false; }
        final BsMCarrierSlipCesDto otherEntity = (BsMCarrierSlipCesDto)other;
        if (!helpComparingValue(getCustomerId(), otherEntity.getCustomerId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "M_CARRIER_SLIP_CES");
        result = xCH(result, getCustomerId());
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
        sb.append(c).append(getCustomerId());
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
        sb.append(c).append(getDelFlg());
        sb.append(c).append(getVersionNo());
        sb.append(c).append(getControlNo());
        sb.append(c).append(getAddDt());
        sb.append(c).append(getAddUser());
        sb.append(c).append(getAddProcess());
        sb.append(c).append(getUpdDt());
        sb.append(c).append(getUpdUser());
        sb.append(c).append(getUpdProcess());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] CUSTOMER_ID: {PK, ID, NotNull, bigint identity(19), FK to M_CUSTOMER} <br>
     * 取引先ID
     * @return The value of the column 'CUSTOMER_ID'. (NullAllowed)
     */
    public Long getCustomerId() {
        return _customerId;
    }

    /**
     * [set] CUSTOMER_ID: {PK, ID, NotNull, bigint identity(19), FK to M_CUSTOMER} <br>
     * 取引先ID
     * @param customerId The value of the column 'CUSTOMER_ID'. (NullAllowed)
     */
    public void setCustomerId(Long customerId) {
        __modifiedProperties.add("customerId");
        this._customerId = customerId;
    }

    /**
     * [get] COLLECT_ACCOUNT_NO_BILL_TO: {varchar(30)} <br>
     * Collect Account # (Bill To)
     * @return The value of the column 'COLLECT_ACCOUNT_NO_BILL_TO'. (NullAllowed)
     */
    public String getCollectAccountNoBillTo() {
        return _collectAccountNoBillTo;
    }

    /**
     * [set] COLLECT_ACCOUNT_NO_BILL_TO: {varchar(30)} <br>
     * Collect Account # (Bill To)
     * @param collectAccountNoBillTo The value of the column 'COLLECT_ACCOUNT_NO_BILL_TO'. (NullAllowed)
     */
    public void setCollectAccountNoBillTo(String collectAccountNoBillTo) {
        __modifiedProperties.add("collectAccountNoBillTo");
        this._collectAccountNoBillTo = collectAccountNoBillTo;
    }

    /**
     * [get] COLLECT_ZIP_CD_BILL_TO: {varchar(30)} <br>
     * Collect Zip Code (Bill To)
     * @return The value of the column 'COLLECT_ZIP_CD_BILL_TO'. (NullAllowed)
     */
    public String getCollectZipCdBillTo() {
        return _collectZipCdBillTo;
    }

    /**
     * [set] COLLECT_ZIP_CD_BILL_TO: {varchar(30)} <br>
     * Collect Zip Code (Bill To)
     * @param collectZipCdBillTo The value of the column 'COLLECT_ZIP_CD_BILL_TO'. (NullAllowed)
     */
    public void setCollectZipCdBillTo(String collectZipCdBillTo) {
        __modifiedProperties.add("collectZipCdBillTo");
        this._collectZipCdBillTo = collectZipCdBillTo;
    }

    /**
     * [get] COLLECT_COUNTRY_CD_BILL_TO: {varchar(30)} <br>
     * Collect Country Code (Bill To)
     * @return The value of the column 'COLLECT_COUNTRY_CD_BILL_TO'. (NullAllowed)
     */
    public String getCollectCountryCdBillTo() {
        return _collectCountryCdBillTo;
    }

    /**
     * [set] COLLECT_COUNTRY_CD_BILL_TO: {varchar(30)} <br>
     * Collect Country Code (Bill To)
     * @param collectCountryCdBillTo The value of the column 'COLLECT_COUNTRY_CD_BILL_TO'. (NullAllowed)
     */
    public void setCollectCountryCdBillTo(String collectCountryCdBillTo) {
        __modifiedProperties.add("collectCountryCdBillTo");
        this._collectCountryCdBillTo = collectCountryCdBillTo;
    }

    /**
     * [get] PAYMENT_TERM_CD_TAXES_TO: {varchar(30)} <br>
     * Payment Term Code (Taxes to)
     * @return The value of the column 'PAYMENT_TERM_CD_TAXES_TO'. (NullAllowed)
     */
    public String getPaymentTermCdTaxesTo() {
        return _paymentTermCdTaxesTo;
    }

    /**
     * [set] PAYMENT_TERM_CD_TAXES_TO: {varchar(30)} <br>
     * Payment Term Code (Taxes to)
     * @param paymentTermCdTaxesTo The value of the column 'PAYMENT_TERM_CD_TAXES_TO'. (NullAllowed)
     */
    public void setPaymentTermCdTaxesTo(String paymentTermCdTaxesTo) {
        __modifiedProperties.add("paymentTermCdTaxesTo");
        this._paymentTermCdTaxesTo = paymentTermCdTaxesTo;
    }

    /**
     * [get] COLLECT_ACCOUNT_NO_TAXES_TO: {varchar(30)} <br>
     * Collect Account # (Taxes to)
     * @return The value of the column 'COLLECT_ACCOUNT_NO_TAXES_TO'. (NullAllowed)
     */
    public String getCollectAccountNoTaxesTo() {
        return _collectAccountNoTaxesTo;
    }

    /**
     * [set] COLLECT_ACCOUNT_NO_TAXES_TO: {varchar(30)} <br>
     * Collect Account # (Taxes to)
     * @param collectAccountNoTaxesTo The value of the column 'COLLECT_ACCOUNT_NO_TAXES_TO'. (NullAllowed)
     */
    public void setCollectAccountNoTaxesTo(String collectAccountNoTaxesTo) {
        __modifiedProperties.add("collectAccountNoTaxesTo");
        this._collectAccountNoTaxesTo = collectAccountNoTaxesTo;
    }

    /**
     * [get] COLLECT_ZIP_CD_TAXES_TO: {varchar(30)} <br>
     * Collect Zip Code (Taxes to)
     * @return The value of the column 'COLLECT_ZIP_CD_TAXES_TO'. (NullAllowed)
     */
    public String getCollectZipCdTaxesTo() {
        return _collectZipCdTaxesTo;
    }

    /**
     * [set] COLLECT_ZIP_CD_TAXES_TO: {varchar(30)} <br>
     * Collect Zip Code (Taxes to)
     * @param collectZipCdTaxesTo The value of the column 'COLLECT_ZIP_CD_TAXES_TO'. (NullAllowed)
     */
    public void setCollectZipCdTaxesTo(String collectZipCdTaxesTo) {
        __modifiedProperties.add("collectZipCdTaxesTo");
        this._collectZipCdTaxesTo = collectZipCdTaxesTo;
    }

    /**
     * [get] COLLECT_COUNTRY_CD_TAXES_TO: {varchar(30)} <br>
     * Collect Country Code (Taxes To)
     * @return The value of the column 'COLLECT_COUNTRY_CD_TAXES_TO'. (NullAllowed)
     */
    public String getCollectCountryCdTaxesTo() {
        return _collectCountryCdTaxesTo;
    }

    /**
     * [set] COLLECT_COUNTRY_CD_TAXES_TO: {varchar(30)} <br>
     * Collect Country Code (Taxes To)
     * @param collectCountryCdTaxesTo The value of the column 'COLLECT_COUNTRY_CD_TAXES_TO'. (NullAllowed)
     */
    public void setCollectCountryCdTaxesTo(String collectCountryCdTaxesTo) {
        __modifiedProperties.add("collectCountryCdTaxesTo");
        this._collectCountryCdTaxesTo = collectCountryCdTaxesTo;
    }

    /**
     * [get] COD_PAYMENT_TERM_CD: {varchar(30)} <br>
     * COD Payment Term Code
     * @return The value of the column 'COD_PAYMENT_TERM_CD'. (NullAllowed)
     */
    public String getCodPaymentTermCd() {
        return _codPaymentTermCd;
    }

    /**
     * [set] COD_PAYMENT_TERM_CD: {varchar(30)} <br>
     * COD Payment Term Code
     * @param codPaymentTermCd The value of the column 'COD_PAYMENT_TERM_CD'. (NullAllowed)
     */
    public void setCodPaymentTermCd(String codPaymentTermCd) {
        __modifiedProperties.add("codPaymentTermCd");
        this._codPaymentTermCd = codPaymentTermCd;
    }

    /**
     * [get] COD_AMOUNT: {decimal(16, 6)} <br>
     * COD Amount
     * @return The value of the column 'COD_AMOUNT'. (NullAllowed)
     */
    public java.math.BigDecimal getCodAmount() {
        return _codAmount;
    }

    /**
     * [set] COD_AMOUNT: {decimal(16, 6)} <br>
     * COD Amount
     * @param codAmount The value of the column 'COD_AMOUNT'. (NullAllowed)
     */
    public void setCodAmount(java.math.BigDecimal codAmount) {
        __modifiedProperties.add("codAmount");
        this._codAmount = codAmount;
    }

    /**
     * [get] COD_FEE_PAYER: {varchar(30)} <br>
     * COD Fee Payer
     * @return The value of the column 'COD_FEE_PAYER'. (NullAllowed)
     */
    public String getCodFeePayer() {
        return _codFeePayer;
    }

    /**
     * [set] COD_FEE_PAYER: {varchar(30)} <br>
     * COD Fee Payer
     * @param codFeePayer The value of the column 'COD_FEE_PAYER'. (NullAllowed)
     */
    public void setCodFeePayer(String codFeePayer) {
        __modifiedProperties.add("codFeePayer");
        this._codFeePayer = codFeePayer;
    }

    /**
     * [get] TERMS_OF_SALES: {varchar(30)} <br>
     * Terms of Sales
     * @return The value of the column 'TERMS_OF_SALES'. (NullAllowed)
     */
    public String getTermsOfSales() {
        return _termsOfSales;
    }

    /**
     * [set] TERMS_OF_SALES: {varchar(30)} <br>
     * Terms of Sales
     * @param termsOfSales The value of the column 'TERMS_OF_SALES'. (NullAllowed)
     */
    public void setTermsOfSales(String termsOfSales) {
        __modifiedProperties.add("termsOfSales");
        this._termsOfSales = termsOfSales;
    }

    /**
     * [get] BROKER_NAME: {varchar(255)} <br>
     * Broker Name
     * @return The value of the column 'BROKER_NAME'. (NullAllowed)
     */
    public String getBrokerName() {
        return _brokerName;
    }

    /**
     * [set] BROKER_NAME: {varchar(255)} <br>
     * Broker Name
     * @param brokerName The value of the column 'BROKER_NAME'. (NullAllowed)
     */
    public void setBrokerName(String brokerName) {
        __modifiedProperties.add("brokerName");
        this._brokerName = brokerName;
    }

    /**
     * [get] BROKER_PHONE_NO: {varchar(30)} <br>
     * Broker Phone #
     * @return The value of the column 'BROKER_PHONE_NO'. (NullAllowed)
     */
    public String getBrokerPhoneNo() {
        return _brokerPhoneNo;
    }

    /**
     * [set] BROKER_PHONE_NO: {varchar(30)} <br>
     * Broker Phone #
     * @param brokerPhoneNo The value of the column 'BROKER_PHONE_NO'. (NullAllowed)
     */
    public void setBrokerPhoneNo(String brokerPhoneNo) {
        __modifiedProperties.add("brokerPhoneNo");
        this._brokerPhoneNo = brokerPhoneNo;
    }

    /**
     * [get] BROKER_FAX_NO: {varchar(30)} <br>
     * Broker Fax #
     * @return The value of the column 'BROKER_FAX_NO'. (NullAllowed)
     */
    public String getBrokerFaxNo() {
        return _brokerFaxNo;
    }

    /**
     * [set] BROKER_FAX_NO: {varchar(30)} <br>
     * Broker Fax #
     * @param brokerFaxNo The value of the column 'BROKER_FAX_NO'. (NullAllowed)
     */
    public void setBrokerFaxNo(String brokerFaxNo) {
        __modifiedProperties.add("brokerFaxNo");
        this._brokerFaxNo = brokerFaxNo;
    }

    /**
     * [get] SAT_DELIVERY_FLG: {char(1), FK to B_CLASS_DTL, classification=SatDeliveryFlg} <br>
     * Saturday Delivery Flag
     * @return The value of the column 'SAT_DELIVERY_FLG'. (NullAllowed)
     */
    public String getSatDeliveryFlg() {
        return _satDeliveryFlg;
    }

    /**
     * [set] SAT_DELIVERY_FLG: {char(1), FK to B_CLASS_DTL, classification=SatDeliveryFlg} <br>
     * Saturday Delivery Flag
     * @param satDeliveryFlg The value of the column 'SAT_DELIVERY_FLG'. (NullAllowed)
     */
    public void setSatDeliveryFlg(String satDeliveryFlg) {
        __modifiedProperties.add("satDeliveryFlg");
        this._satDeliveryFlg = satDeliveryFlg;
    }

    /**
     * [get] RESIDENTIAL_DELIVERY_FLG: {char(1), FK to B_CLASS_DTL, classification=ResidentialDeliveryFlg} <br>
     * Residential Delivery Flag
     * @return The value of the column 'RESIDENTIAL_DELIVERY_FLG'. (NullAllowed)
     */
    public String getResidentialDeliveryFlg() {
        return _residentialDeliveryFlg;
    }

    /**
     * [set] RESIDENTIAL_DELIVERY_FLG: {char(1), FK to B_CLASS_DTL, classification=ResidentialDeliveryFlg} <br>
     * Residential Delivery Flag
     * @param residentialDeliveryFlg The value of the column 'RESIDENTIAL_DELIVERY_FLG'. (NullAllowed)
     */
    public void setResidentialDeliveryFlg(String residentialDeliveryFlg) {
        __modifiedProperties.add("residentialDeliveryFlg");
        this._residentialDeliveryFlg = residentialDeliveryFlg;
    }

    /**
     * [get] COD_FLG: {char(1), FK to B_CLASS_DTL, classification=CodFlg} <br>
     * Collect on Delivery Flag
     * @return The value of the column 'COD_FLG'. (NullAllowed)
     */
    public String getCodFlg() {
        return _codFlg;
    }

    /**
     * [set] COD_FLG: {char(1), FK to B_CLASS_DTL, classification=CodFlg} <br>
     * Collect on Delivery Flag
     * @param codFlg The value of the column 'COD_FLG'. (NullAllowed)
     */
    public void setCodFlg(String codFlg) {
        __modifiedProperties.add("codFlg");
        this._codFlg = codFlg;
    }

    /**
     * [get] SIGNATURE_REQUIRED_FLG: {char(1), FK to B_CLASS_DTL, classification=SignatureRequiredFlg} <br>
     * Signature Required Flag
     * @return The value of the column 'SIGNATURE_REQUIRED_FLG'. (NullAllowed)
     */
    public String getSignatureRequiredFlg() {
        return _signatureRequiredFlg;
    }

    /**
     * [set] SIGNATURE_REQUIRED_FLG: {char(1), FK to B_CLASS_DTL, classification=SignatureRequiredFlg} <br>
     * Signature Required Flag
     * @param signatureRequiredFlg The value of the column 'SIGNATURE_REQUIRED_FLG'. (NullAllowed)
     */
    public void setSignatureRequiredFlg(String signatureRequiredFlg) {
        __modifiedProperties.add("signatureRequiredFlg");
        this._signatureRequiredFlg = signatureRequiredFlg;
    }

    /**
     * [get] SIGNATURE_RELEASE_FLG: {char(1), FK to B_CLASS_DTL, classification=SignatureReleaseFlg} <br>
     * Signature Release Flag
     * @return The value of the column 'SIGNATURE_RELEASE_FLG'. (NullAllowed)
     */
    public String getSignatureReleaseFlg() {
        return _signatureReleaseFlg;
    }

    /**
     * [set] SIGNATURE_RELEASE_FLG: {char(1), FK to B_CLASS_DTL, classification=SignatureReleaseFlg} <br>
     * Signature Release Flag
     * @param signatureReleaseFlg The value of the column 'SIGNATURE_RELEASE_FLG'. (NullAllowed)
     */
    public void setSignatureReleaseFlg(String signatureReleaseFlg) {
        __modifiedProperties.add("signatureReleaseFlg");
        this._signatureReleaseFlg = signatureReleaseFlg;
    }

    /**
     * [get] CALL_BEFORE_DELIVERY_FLG: {char(1), FK to B_CLASS_DTL, classification=CallBeforeDeliveryFlg} <br>
     * Call Before Delivery Flag
     * @return The value of the column 'CALL_BEFORE_DELIVERY_FLG'. (NullAllowed)
     */
    public String getCallBeforeDeliveryFlg() {
        return _callBeforeDeliveryFlg;
    }

    /**
     * [set] CALL_BEFORE_DELIVERY_FLG: {char(1), FK to B_CLASS_DTL, classification=CallBeforeDeliveryFlg} <br>
     * Call Before Delivery Flag
     * @param callBeforeDeliveryFlg The value of the column 'CALL_BEFORE_DELIVERY_FLG'. (NullAllowed)
     */
    public void setCallBeforeDeliveryFlg(String callBeforeDeliveryFlg) {
        __modifiedProperties.add("callBeforeDeliveryFlg");
        this._callBeforeDeliveryFlg = callBeforeDeliveryFlg;
    }

    /**
     * [get] FREEZABLE_PROTECTION_FLG: {char(1), FK to B_CLASS_DTL, classification=FreezableProtectionFlg} <br>
     * Freezable Protection Flag
     * @return The value of the column 'FREEZABLE_PROTECTION_FLG'. (NullAllowed)
     */
    public String getFreezableProtectionFlg() {
        return _freezableProtectionFlg;
    }

    /**
     * [set] FREEZABLE_PROTECTION_FLG: {char(1), FK to B_CLASS_DTL, classification=FreezableProtectionFlg} <br>
     * Freezable Protection Flag
     * @param freezableProtectionFlg The value of the column 'FREEZABLE_PROTECTION_FLG'. (NullAllowed)
     */
    public void setFreezableProtectionFlg(String freezableProtectionFlg) {
        __modifiedProperties.add("freezableProtectionFlg");
        this._freezableProtectionFlg = freezableProtectionFlg;
    }

    /**
     * [get] GUARANTEED_PLUS_FLG: {char(1), FK to B_CLASS_DTL, classification=GuaranteedPlusFlg} <br>
     * Guaranteed Plus Flag
     * @return The value of the column 'GUARANTEED_PLUS_FLG'. (NullAllowed)
     */
    public String getGuaranteedPlusFlg() {
        return _guaranteedPlusFlg;
    }

    /**
     * [set] GUARANTEED_PLUS_FLG: {char(1), FK to B_CLASS_DTL, classification=GuaranteedPlusFlg} <br>
     * Guaranteed Plus Flag
     * @param guaranteedPlusFlg The value of the column 'GUARANTEED_PLUS_FLG'. (NullAllowed)
     */
    public void setGuaranteedPlusFlg(String guaranteedPlusFlg) {
        __modifiedProperties.add("guaranteedPlusFlg");
        this._guaranteedPlusFlg = guaranteedPlusFlg;
    }

    /**
     * [get] RESIDENTIAL_PICKUP_FLG: {char(1), FK to B_CLASS_DTL, classification=ResidentialPickupFlg} <br>
     * Residential Pickup Flag
     * @return The value of the column 'RESIDENTIAL_PICKUP_FLG'. (NullAllowed)
     */
    public String getResidentialPickupFlg() {
        return _residentialPickupFlg;
    }

    /**
     * [set] RESIDENTIAL_PICKUP_FLG: {char(1), FK to B_CLASS_DTL, classification=ResidentialPickupFlg} <br>
     * Residential Pickup Flag
     * @param residentialPickupFlg The value of the column 'RESIDENTIAL_PICKUP_FLG'. (NullAllowed)
     */
    public void setResidentialPickupFlg(String residentialPickupFlg) {
        __modifiedProperties.add("residentialPickupFlg");
        this._residentialPickupFlg = residentialPickupFlg;
    }

    /**
     * [get] DO_NOT_STACK_STACK_FLG: {char(1), FK to B_CLASS_DTL, classification=DoNotStackStackFlg} <br>
     * Do Not Stack Pallets Flag
     * @return The value of the column 'DO_NOT_STACK_STACK_FLG'. (NullAllowed)
     */
    public String getDoNotStackStackFlg() {
        return _doNotStackStackFlg;
    }

    /**
     * [set] DO_NOT_STACK_STACK_FLG: {char(1), FK to B_CLASS_DTL, classification=DoNotStackStackFlg} <br>
     * Do Not Stack Pallets Flag
     * @param doNotStackStackFlg The value of the column 'DO_NOT_STACK_STACK_FLG'. (NullAllowed)
     */
    public void setDoNotStackStackFlg(String doNotStackStackFlg) {
        __modifiedProperties.add("doNotStackStackFlg");
        this._doNotStackStackFlg = doNotStackStackFlg;
    }

    /**
     * [get] LIMITED_ACCESS_DELIVERY_FLG: {char(1), FK to B_CLASS_DTL, classification=LimitedAccessDeliveryFlg} <br>
     * Limited Access Delivery Flag
     * @return The value of the column 'LIMITED_ACCESS_DELIVERY_FLG'. (NullAllowed)
     */
    public String getLimitedAccessDeliveryFlg() {
        return _limitedAccessDeliveryFlg;
    }

    /**
     * [set] LIMITED_ACCESS_DELIVERY_FLG: {char(1), FK to B_CLASS_DTL, classification=LimitedAccessDeliveryFlg} <br>
     * Limited Access Delivery Flag
     * @param limitedAccessDeliveryFlg The value of the column 'LIMITED_ACCESS_DELIVERY_FLG'. (NullAllowed)
     */
    public void setLimitedAccessDeliveryFlg(String limitedAccessDeliveryFlg) {
        __modifiedProperties.add("limitedAccessDeliveryFlg");
        this._limitedAccessDeliveryFlg = limitedAccessDeliveryFlg;
    }

    /**
     * [get] LIMITED_ACCESS_PICKUP_FLG: {char(1), FK to B_CLASS_DTL, classification=LimitedAccessPickupFlg} <br>
     * Limited Access Pickup Flag
     * @return The value of the column 'LIMITED_ACCESS_PICKUP_FLG'. (NullAllowed)
     */
    public String getLimitedAccessPickupFlg() {
        return _limitedAccessPickupFlg;
    }

    /**
     * [set] LIMITED_ACCESS_PICKUP_FLG: {char(1), FK to B_CLASS_DTL, classification=LimitedAccessPickupFlg} <br>
     * Limited Access Pickup Flag
     * @param limitedAccessPickupFlg The value of the column 'LIMITED_ACCESS_PICKUP_FLG'. (NullAllowed)
     */
    public void setLimitedAccessPickupFlg(String limitedAccessPickupFlg) {
        __modifiedProperties.add("limitedAccessPickupFlg");
        this._limitedAccessPickupFlg = limitedAccessPickupFlg;
    }

    /**
     * [get] OVER_SIZED_FLG: {char(1), FK to B_CLASS_DTL, classification=OverSizedFlg} <br>
     * Over-Sized / Extreme Length Flag
     * @return The value of the column 'OVER_SIZED_FLG'. (NullAllowed)
     */
    public String getOverSizedFlg() {
        return _overSizedFlg;
    }

    /**
     * [set] OVER_SIZED_FLG: {char(1), FK to B_CLASS_DTL, classification=OverSizedFlg} <br>
     * Over-Sized / Extreme Length Flag
     * @param overSizedFlg The value of the column 'OVER_SIZED_FLG'. (NullAllowed)
     */
    public void setOverSizedFlg(String overSizedFlg) {
        __modifiedProperties.add("overSizedFlg");
        this._overSizedFlg = overSizedFlg;
    }

    /**
     * [get] POISON_FLG: {char(1), FK to B_CLASS_DTL, classification=PoisonFlg} <br>
     * Poison Flag
     * @return The value of the column 'POISON_FLG'. (NullAllowed)
     */
    public String getPoisonFlg() {
        return _poisonFlg;
    }

    /**
     * [set] POISON_FLG: {char(1), FK to B_CLASS_DTL, classification=PoisonFlg} <br>
     * Poison Flag
     * @param poisonFlg The value of the column 'POISON_FLG'. (NullAllowed)
     */
    public void setPoisonFlg(String poisonFlg) {
        __modifiedProperties.add("poisonFlg");
        this._poisonFlg = poisonFlg;
    }

    /**
     * [get] FOOG_FLG: {char(1), FK to B_CLASS_DTL, classification=FoogFlg} <br>
     * Food Flag
     * @return The value of the column 'FOOG_FLG'. (NullAllowed)
     */
    public String getFoogFlg() {
        return _foogFlg;
    }

    /**
     * [set] FOOG_FLG: {char(1), FK to B_CLASS_DTL, classification=FoogFlg} <br>
     * Food Flag
     * @param foogFlg The value of the column 'FOOG_FLG'. (NullAllowed)
     */
    public void setFoogFlg(String foogFlg) {
        __modifiedProperties.add("foogFlg");
        this._foogFlg = foogFlg;
    }

    /**
     * [get] LIFTGATE_DELIVERY_PREPAID_FLG: {char(1), FK to B_CLASS_DTL, classification=LiftgateDeliveryPrepaidFlg} <br>
     * Liftgate at delivery Flag (Prepaid)
     * @return The value of the column 'LIFTGATE_DELIVERY_PREPAID_FLG'. (NullAllowed)
     */
    public String getLiftgateDeliveryPrepaidFlg() {
        return _liftgateDeliveryPrepaidFlg;
    }

    /**
     * [set] LIFTGATE_DELIVERY_PREPAID_FLG: {char(1), FK to B_CLASS_DTL, classification=LiftgateDeliveryPrepaidFlg} <br>
     * Liftgate at delivery Flag (Prepaid)
     * @param liftgateDeliveryPrepaidFlg The value of the column 'LIFTGATE_DELIVERY_PREPAID_FLG'. (NullAllowed)
     */
    public void setLiftgateDeliveryPrepaidFlg(String liftgateDeliveryPrepaidFlg) {
        __modifiedProperties.add("liftgateDeliveryPrepaidFlg");
        this._liftgateDeliveryPrepaidFlg = liftgateDeliveryPrepaidFlg;
    }

    /**
     * [get] LIFTGATE_DELIVERY_COLLECT_FLG: {char(1), FK to B_CLASS_DTL, classification=LiftgateDeliveryCollectFlg} <br>
     * Liftgate at delivery Flag (Collect)
     * @return The value of the column 'LIFTGATE_DELIVERY_COLLECT_FLG'. (NullAllowed)
     */
    public String getLiftgateDeliveryCollectFlg() {
        return _liftgateDeliveryCollectFlg;
    }

    /**
     * [set] LIFTGATE_DELIVERY_COLLECT_FLG: {char(1), FK to B_CLASS_DTL, classification=LiftgateDeliveryCollectFlg} <br>
     * Liftgate at delivery Flag (Collect)
     * @param liftgateDeliveryCollectFlg The value of the column 'LIFTGATE_DELIVERY_COLLECT_FLG'. (NullAllowed)
     */
    public void setLiftgateDeliveryCollectFlg(String liftgateDeliveryCollectFlg) {
        __modifiedProperties.add("liftgateDeliveryCollectFlg");
        this._liftgateDeliveryCollectFlg = liftgateDeliveryCollectFlg;
    }

    /**
     * [get] LIFTGATE_PICKUP_PREPAID_FLG: {char(1), FK to B_CLASS_DTL, classification=LiftgatePickupPrepaidFlg} <br>
     * Liftgate at pickup Flag (Prepaid)
     * @return The value of the column 'LIFTGATE_PICKUP_PREPAID_FLG'. (NullAllowed)
     */
    public String getLiftgatePickupPrepaidFlg() {
        return _liftgatePickupPrepaidFlg;
    }

    /**
     * [set] LIFTGATE_PICKUP_PREPAID_FLG: {char(1), FK to B_CLASS_DTL, classification=LiftgatePickupPrepaidFlg} <br>
     * Liftgate at pickup Flag (Prepaid)
     * @param liftgatePickupPrepaidFlg The value of the column 'LIFTGATE_PICKUP_PREPAID_FLG'. (NullAllowed)
     */
    public void setLiftgatePickupPrepaidFlg(String liftgatePickupPrepaidFlg) {
        __modifiedProperties.add("liftgatePickupPrepaidFlg");
        this._liftgatePickupPrepaidFlg = liftgatePickupPrepaidFlg;
    }

    /**
     * [get] LIFTGATE_PICKUP_COLLECT_FLG: {char(1), FK to B_CLASS_DTL, classification=LiftgatePickupCollectFlg} <br>
     * Liftgate at pickup Flag (Collect)
     * @return The value of the column 'LIFTGATE_PICKUP_COLLECT_FLG'. (NullAllowed)
     */
    public String getLiftgatePickupCollectFlg() {
        return _liftgatePickupCollectFlg;
    }

    /**
     * [set] LIFTGATE_PICKUP_COLLECT_FLG: {char(1), FK to B_CLASS_DTL, classification=LiftgatePickupCollectFlg} <br>
     * Liftgate at pickup Flag (Collect)
     * @param liftgatePickupCollectFlg The value of the column 'LIFTGATE_PICKUP_COLLECT_FLG'. (NullAllowed)
     */
    public void setLiftgatePickupCollectFlg(String liftgatePickupCollectFlg) {
        __modifiedProperties.add("liftgatePickupCollectFlg");
        this._liftgatePickupCollectFlg = liftgatePickupCollectFlg;
    }

    /**
     * [get] INSIDE_DELIVERY_PREPAID_FLG: {char(1), FK to B_CLASS_DTL, classification=InsideDeliveryPrepaidFlg} <br>
     * Inside Delivery Flag (Prepaid)
     * @return The value of the column 'INSIDE_DELIVERY_PREPAID_FLG'. (NullAllowed)
     */
    public String getInsideDeliveryPrepaidFlg() {
        return _insideDeliveryPrepaidFlg;
    }

    /**
     * [set] INSIDE_DELIVERY_PREPAID_FLG: {char(1), FK to B_CLASS_DTL, classification=InsideDeliveryPrepaidFlg} <br>
     * Inside Delivery Flag (Prepaid)
     * @param insideDeliveryPrepaidFlg The value of the column 'INSIDE_DELIVERY_PREPAID_FLG'. (NullAllowed)
     */
    public void setInsideDeliveryPrepaidFlg(String insideDeliveryPrepaidFlg) {
        __modifiedProperties.add("insideDeliveryPrepaidFlg");
        this._insideDeliveryPrepaidFlg = insideDeliveryPrepaidFlg;
    }

    /**
     * [get] INSIDE_DELIVERY_COLLECT_FLG: {char(1), FK to B_CLASS_DTL, classification=InsideDeliveryCollectFlg} <br>
     * Inside Delivery Flag (Collect)
     * @return The value of the column 'INSIDE_DELIVERY_COLLECT_FLG'. (NullAllowed)
     */
    public String getInsideDeliveryCollectFlg() {
        return _insideDeliveryCollectFlg;
    }

    /**
     * [set] INSIDE_DELIVERY_COLLECT_FLG: {char(1), FK to B_CLASS_DTL, classification=InsideDeliveryCollectFlg} <br>
     * Inside Delivery Flag (Collect)
     * @param insideDeliveryCollectFlg The value of the column 'INSIDE_DELIVERY_COLLECT_FLG'. (NullAllowed)
     */
    public void setInsideDeliveryCollectFlg(String insideDeliveryCollectFlg) {
        __modifiedProperties.add("insideDeliveryCollectFlg");
        this._insideDeliveryCollectFlg = insideDeliveryCollectFlg;
    }

    /**
     * [get] INSIDE_PICKUP_PREPAID_FLG: {char(1), FK to B_CLASS_DTL, classification=InsidePickupPrepaidFlg} <br>
     * Inside Pickup Flag (Prepaid)
     * @return The value of the column 'INSIDE_PICKUP_PREPAID_FLG'. (NullAllowed)
     */
    public String getInsidePickupPrepaidFlg() {
        return _insidePickupPrepaidFlg;
    }

    /**
     * [set] INSIDE_PICKUP_PREPAID_FLG: {char(1), FK to B_CLASS_DTL, classification=InsidePickupPrepaidFlg} <br>
     * Inside Pickup Flag (Prepaid)
     * @param insidePickupPrepaidFlg The value of the column 'INSIDE_PICKUP_PREPAID_FLG'. (NullAllowed)
     */
    public void setInsidePickupPrepaidFlg(String insidePickupPrepaidFlg) {
        __modifiedProperties.add("insidePickupPrepaidFlg");
        this._insidePickupPrepaidFlg = insidePickupPrepaidFlg;
    }

    /**
     * [get] INSIDE_PICKUP_COLLECT_FLG: {char(1), FK to B_CLASS_DTL, classification=InsidePickupCollectFlg} <br>
     * Inside Pickup Flag (Collect)
     * @return The value of the column 'INSIDE_PICKUP_COLLECT_FLG'. (NullAllowed)
     */
    public String getInsidePickupCollectFlg() {
        return _insidePickupCollectFlg;
    }

    /**
     * [set] INSIDE_PICKUP_COLLECT_FLG: {char(1), FK to B_CLASS_DTL, classification=InsidePickupCollectFlg} <br>
     * Inside Pickup Flag (Collect)
     * @param insidePickupCollectFlg The value of the column 'INSIDE_PICKUP_COLLECT_FLG'. (NullAllowed)
     */
    public void setInsidePickupCollectFlg(String insidePickupCollectFlg) {
        __modifiedProperties.add("insidePickupCollectFlg");
        this._insidePickupCollectFlg = insidePickupCollectFlg;
    }

    /**
     * [get] DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg} <br>
     * 削除フラグ
     * @return The value of the column 'DEL_FLG'. (NullAllowed)
     */
    public String getDelFlg() {
        return _delFlg;
    }

    /**
     * [set] DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg} <br>
     * 削除フラグ
     * @param delFlg The value of the column 'DEL_FLG'. (NullAllowed)
     */
    public void setDelFlg(String delFlg) {
        __modifiedProperties.add("delFlg");
        this._delFlg = delFlg;
    }

    /**
     * [get] VERSION_NO: {NotNull, bigint(19), default=[(0)]} <br>
     * バージョンNo.
     * @return The value of the column 'VERSION_NO'. (NullAllowed)
     */
    public Long getVersionNo() {
        return _versionNo;
    }

    /**
     * [set] VERSION_NO: {NotNull, bigint(19), default=[(0)]} <br>
     * バージョンNo.
     * @param versionNo The value of the column 'VERSION_NO'. (NullAllowed)
     */
    public void setVersionNo(Long versionNo) {
        __modifiedProperties.add("versionNo");
        this._versionNo = versionNo;
    }

    /**
     * [get] CONTROL_NO: {bigint(19)} <br>
     * コントロールNo.
     * @return The value of the column 'CONTROL_NO'. (NullAllowed)
     */
    public Long getControlNo() {
        return _controlNo;
    }

    /**
     * [set] CONTROL_NO: {bigint(19)} <br>
     * コントロールNo.
     * @param controlNo The value of the column 'CONTROL_NO'. (NullAllowed)
     */
    public void setControlNo(Long controlNo) {
        __modifiedProperties.add("controlNo");
        this._controlNo = controlNo;
    }

    /**
     * [get] ADD_DT: {datetime2(26, 6)} <br>
     * 登録日時
     * @return The value of the column 'ADD_DT'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getAddDt() {
        return _addDt;
    }

    /**
     * [set] ADD_DT: {datetime2(26, 6)} <br>
     * 登録日時
     * @param addDt The value of the column 'ADD_DT'. (NullAllowed)
     */
    public void setAddDt(java.sql.Timestamp addDt) {
        __modifiedProperties.add("addDt");
        this._addDt = addDt;
    }

    /**
     * [get] ADD_USER: {varchar(255)} <br>
     * 登録ユーザ
     * @return The value of the column 'ADD_USER'. (NullAllowed)
     */
    public String getAddUser() {
        return _addUser;
    }

    /**
     * [set] ADD_USER: {varchar(255)} <br>
     * 登録ユーザ
     * @param addUser The value of the column 'ADD_USER'. (NullAllowed)
     */
    public void setAddUser(String addUser) {
        __modifiedProperties.add("addUser");
        this._addUser = addUser;
    }

    /**
     * [get] ADD_PROCESS: {varchar(4000)} <br>
     * 登録プロセス
     * @return The value of the column 'ADD_PROCESS'. (NullAllowed)
     */
    public String getAddProcess() {
        return _addProcess;
    }

    /**
     * [set] ADD_PROCESS: {varchar(4000)} <br>
     * 登録プロセス
     * @param addProcess The value of the column 'ADD_PROCESS'. (NullAllowed)
     */
    public void setAddProcess(String addProcess) {
        __modifiedProperties.add("addProcess");
        this._addProcess = addProcess;
    }

    /**
     * [get] UPD_DT: {datetime2(26, 6)} <br>
     * 更新日時
     * @return The value of the column 'UPD_DT'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getUpdDt() {
        return _updDt;
    }

    /**
     * [set] UPD_DT: {datetime2(26, 6)} <br>
     * 更新日時
     * @param updDt The value of the column 'UPD_DT'. (NullAllowed)
     */
    public void setUpdDt(java.sql.Timestamp updDt) {
        __modifiedProperties.add("updDt");
        this._updDt = updDt;
    }

    /**
     * [get] UPD_USER: {varchar(255)} <br>
     * 更新ユーザ
     * @return The value of the column 'UPD_USER'. (NullAllowed)
     */
    public String getUpdUser() {
        return _updUser;
    }

    /**
     * [set] UPD_USER: {varchar(255)} <br>
     * 更新ユーザ
     * @param updUser The value of the column 'UPD_USER'. (NullAllowed)
     */
    public void setUpdUser(String updUser) {
        __modifiedProperties.add("updUser");
        this._updUser = updUser;
    }

    /**
     * [get] UPD_PROCESS: {varchar(4000)} <br>
     * 更新プロセス
     * @return The value of the column 'UPD_PROCESS'. (NullAllowed)
     */
    public String getUpdProcess() {
        return _updProcess;
    }

    /**
     * [set] UPD_PROCESS: {varchar(4000)} <br>
     * 更新プロセス
     * @param updProcess The value of the column 'UPD_PROCESS'. (NullAllowed)
     */
    public void setUpdProcess(String updProcess) {
        __modifiedProperties.add("updProcess");
        this._updProcess = updProcess;
    }

}
