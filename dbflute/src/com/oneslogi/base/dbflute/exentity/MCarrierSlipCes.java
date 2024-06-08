package com.oneslogi.base.dbflute.exentity;

import com.oneslogi.base.dbflute.bsentity.BsMCarrierSlipCes;

/**
 * The entity of m_carrier_slip_ces.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class MCarrierSlipCes extends BsMCarrierSlipCes {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;
    // 荷主CD
    private String clientCd;
    // 荷主ID
    private Long clientId;
    // センタCD
    private String centerCd;
    // 取引先CD
    private String customerCd;
    // 取引先名
    private String customerNm;
    // Saturday Delivery フラグ名称
    private String satDeliveryFlgNm;
    // Residential Delivery フラグ名称
    private String residentialDeliveryFlgNm;
    // Collect On Delivery フラグ名称
    private String codFlgNm;
    // Signature Required フラグ名称
    private String signatureRequiredFlgNm;
    // Signature Releaseフラグ名称
    private String signatureReleaseFlgNm;
    // Call Before Delivery フラグ名称
    private String callBeforeDeliveryFlgNm;
    // Freezable Protection フラグ名称
    private String freezableProtectionFlgNm;
    // Guaranteed Plus フラグ名称
    private String guaranteedPlusFlgNm;
    // Residential Pickup フラグ名称
    private String residentialPickupFlgNm;
    // Do Not Stack Pallets フラグ名称
    private String doNotStackPalletsFlgNm;
    // Limited Access Delivery フラグ名称
    private String limitedAccessDeliveryFlgNm;
    // Limited Access Pickup フラグ名称
    private String limitedAccessPickupFlgNm;
    // Over-Sized/Extreme Length フラグ名称
    private String overSizedFlgNm;
    // Poison フラグ名称
    private String poisonFlgNm;
    // Food フラグ名称
    private String foodFlgNm;
    // Liftgate at delivery フラグ名称 (Prepaid)
    private String liftgateDeliveryPrepaidFlgNm;
    // Liftgate at delivery フラグ名称 (Collect)
    private String liftgateDeliveryCollectFlgNm;
    // Liftgate at pickup フラグ名称 (Prepaid)
    private String liftgatePickupPrepaidFlgNm;
    // Liftgate at pickup フラグ名称 (Collect)
    private String liftgatePickupCollectFlgNm;
    // Inside Delivery フラグ名称 (Prepaid)
    private String insideDeliveryPrepaidFlgNm;
    // Inside Delivery フラグ名称 (Collect)
    private String insideDeliveryCollectFlgNm;
    // Inside Pickup フラグ名称 (Prepaid)
    private String insidePickupPrepaidFlgNm;
    // Inside Pickup フラグ名称 (Collect)
    private String insidePickupCollectFlgNm;

  	public String getClientCd() {
 		return clientCd;
 	}

 	public void setClientCd(String clientCd) {
 		this.clientCd = clientCd;
 	}

  	public Long getClientId() {
 		return clientId;
 	}

 	public void setClientId(Long clientId) {
 		this.clientId = clientId;
 	}

  	public String getCenterCd() {
 		return centerCd;
 	}

 	public void setCenterCd(String centerCd) {
 		this.centerCd = centerCd;
 	}

  	public String getCustomerCd() {
 		return customerCd;
 	}

 	public void setCustomerCd(String customerCd) {
 		this.customerCd = customerCd;
 	}

  	public String getCustomerNm() {
 		return customerNm;
 	}

 	public void setCustomerNm(String customerNm) {
 		this.customerNm = customerNm;
 	}

  	public String getSatDeliveryFlgNm() {
 		return satDeliveryFlgNm;
 	}

 	public void setSatDeliveryFlgNm(String satDeliveryFlgNm) {
 		this.satDeliveryFlgNm = satDeliveryFlgNm;
 	}

  	public String getResidentialDeliveryFlgNm() {
 		return residentialDeliveryFlgNm;
 	}

 	public void setResidentialDeliveryFlgNm(String residentialDeliveryFlgNm) {
 		this.residentialDeliveryFlgNm = residentialDeliveryFlgNm;
 	}

  	public String getCodFlgNm() {
 		return codFlgNm;
 	}

 	public void setCodFlgNm(String codFlgNm) {
 		this.codFlgNm = codFlgNm;
 	}

  	public String getSignatureRequiredFlgNm() {
 		return signatureRequiredFlgNm;
 	}

 	public void setSignatureRequiredFlgNm(String signatureRequiredFlgNm) {
 		this.signatureRequiredFlgNm = signatureRequiredFlgNm;
 	}

  	public String getSignatureReleaseFlgNm() {
 		return signatureReleaseFlgNm;
 	}

 	public void setSignatureReleaseFlgNm(String signatureReleaseFlgNm) {
 		this.signatureReleaseFlgNm = signatureReleaseFlgNm;
 	}

  	public String getCallBeforeDeliveryFlgNm() {
 		return callBeforeDeliveryFlgNm;
 	}

 	public void setCallBeforeDeliveryFlgNm(String callBeforeDeliveryFlgNm) {
 		this.callBeforeDeliveryFlgNm = callBeforeDeliveryFlgNm;
 	}

  	public String getFreezableProtectionFlgNm() {
 		return freezableProtectionFlgNm;
 	}

 	public void setFreezableProtectionFlgNm(String freezableProtectionFlgNm) {
 		this.freezableProtectionFlgNm = freezableProtectionFlgNm;
 	}

  	public String getGuaranteedPlusFlgNm() {
 		return guaranteedPlusFlgNm;
 	}

 	public void setGuaranteedPlusFlgNm(String guaranteedPlusFlgNm) {
 		this.guaranteedPlusFlgNm = guaranteedPlusFlgNm;
 	}

  	public String getResidentialPickupFlgNm() {
 		return residentialPickupFlgNm;
 	}

 	public void setResidentialPickupFlgNm(String residentialPickupFlgNm) {
 		this.residentialPickupFlgNm = residentialPickupFlgNm;
 	}

  	public String getDoNotStackPalletsFlgNm() {
 		return doNotStackPalletsFlgNm;
 	}

 	public void setDoNotStackPalletsFlgNm(String doNotStackPalletsFlgNm) {
 		this.doNotStackPalletsFlgNm = doNotStackPalletsFlgNm;
 	}

  	public String getLimitedAccessDeliveryFlgNm() {
 		return limitedAccessDeliveryFlgNm;
 	}

 	public void setLimitedAccessDeliveryFlgNm(String limitedAccessDeliveryFlgNm) {
 		this.limitedAccessDeliveryFlgNm = limitedAccessDeliveryFlgNm;
 	}

  	public String getLimitedAccessPickupFlgNm() {
 		return limitedAccessPickupFlgNm;
 	}

 	public void setLimitedAccessPickupFlgNm(String limitedAccessPickupFlgNm) {
 		this.limitedAccessPickupFlgNm = limitedAccessPickupFlgNm;
 	}

  	public String getOverSizedFlgNm() {
 		return overSizedFlgNm;
 	}

 	public void setOverSizedFlgNm(String overSizedFlgNm) {
 		this.overSizedFlgNm = overSizedFlgNm;
 	}

  	public String getPoisonFlgNm() {
 		return poisonFlgNm;
 	}

 	public void setPoisonFlgNm(String poisonFlgNm) {
 		this.poisonFlgNm = poisonFlgNm;
 	}

  	public String getFoodFlgNm() {
 		return foodFlgNm;
 	}

 	public void setFoodFlgNm(String foodFlgNm) {
 		this.foodFlgNm = foodFlgNm;
 	}

  	public String getLiftgateDeliveryPrepaidFlgNm() {
 		return liftgateDeliveryPrepaidFlgNm;
 	}

 	public void setLiftgateDeliveryPrepaidFlgNm(String liftgateDeliveryPrepaidFlgNm) {
 		this.liftgateDeliveryPrepaidFlgNm = liftgateDeliveryPrepaidFlgNm;
 	}

  	public String getLiftgateDeliveryCollectFlgNm() {
 		return liftgateDeliveryCollectFlgNm;
 	}

 	public void setLiftgateDeliveryCollectFlgNm(String liftgateDeliveryCollectFlgNm) {
 		this.liftgateDeliveryCollectFlgNm = liftgateDeliveryCollectFlgNm;
 	}

  	public String getLiftgatePickupPrepaidFlgNm() {
 		return liftgatePickupPrepaidFlgNm;
 	}

 	public void setLiftgatePickupPrepaidFlgNm(String liftgatePickupPrepaidFlgNm) {
 		this.liftgatePickupPrepaidFlgNm = liftgatePickupPrepaidFlgNm;
 	}

  	public String getLiftgatePickupCollectFlgNm() {
 		return liftgatePickupCollectFlgNm;
 	}

 	public void setLiftgatePickupCollectFlgNm(String liftgatePickupCollectFlgNm) {
 		this.liftgatePickupCollectFlgNm = liftgatePickupCollectFlgNm;
 	}

  	public String getInsideDeliveryPrepaidFlgNm() {
 		return insideDeliveryPrepaidFlgNm;
 	}

 	public void setInsideDeliveryPrepaidFlgNm(String insideDeliveryPrepaidFlgNm) {
 		this.insideDeliveryPrepaidFlgNm = insideDeliveryPrepaidFlgNm;
 	}

  	public String getInsideDeliveryCollectFlgNm() {
 		return insideDeliveryCollectFlgNm;
 	}

 	public void setInsideDeliveryCollectFlgNm(String insideDeliveryCollectFlgNm) {
 		this.insideDeliveryCollectFlgNm = insideDeliveryCollectFlgNm;
 	}

  	public String getInsidePickupPrepaidFlgNm() {
 		return insidePickupPrepaidFlgNm;
 	}

 	public void setInsidePickupPrepaidFlgNm(String insidePickupPrepaidFlgNm) {
 		this.insidePickupPrepaidFlgNm = insidePickupPrepaidFlgNm;
 	}

  	public String getInsidePickupCollectFlgNm() {
 		return insidePickupCollectFlgNm;
 	}

 	public void setInsidePickupCollectFlgNm(String insidePickupCollectFlgNm) {
 		this.insidePickupCollectFlgNm = insidePickupCollectFlgNm;
 	}
}
