package com.oneslogi.base.dbflute.dto;

import com.oneslogi.base.dbflute.dto.bs.BsMCustomerDto;

/**
 * The entity of M_CUSTOMER.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class MCustomerDto extends BsMCustomerDto {

	/** Serial version UID. (Default) */
	private static final long serialVersionUID = 1L;

	// 行番号
	private String lineNo;

	private String deliveryCourseCd;

	private Long deliveryOrder;

	private Long deliveryReadTime;

	private String clientCd;

	private String clientCustomerCd;

	// [C-CWMS-0060] EDI機能(汎用)バッチ化対応(受信ID削除) 2016.08.01 kawana

	private String chkErrorShow;

	private String errorProcessMet;

	private String  deliveryFlgNm;

	private String  vendorFlgNm;

	private String  onetimeFlgNm;

	private String  depositFlgNm;

	private String  shippingStopFlgNm;

	private String  limitDtReverseFlgNm;

	private Long zipId;

	/**
	 * 社内入荷センタCD
	 */
	private String centerCd;
	// [C-CWMS-0039] センタ間移動機能を追加 2015.09.18 kawana Start
	/**
	 * 社内入荷センタ名称
	 */
	private String centerNm;

	// [C-CWMS-0039] センタ間移動機能を追加 2015.09.18 kawana End

	// [#3147][Ver3.0] ユーザ預託管理機能を追加 2017.12.06 honma Add Start
	// 選択
	private String depositCheckBox;
	// [#3147][Ver3.0] ユーザ預託管理機能を追加 2017.12.06 honma Add End

	public Long getZipId() {
		return zipId;
	}

	public void setZipId(Long zipId) {
		this.zipId = zipId;
	}


	public String getLineNo() {
		return lineNo;
	}

	public void setLineNo(String lineNo) {
		this.lineNo = lineNo;
	}

	public String getDeliveryCourseCd() {
		return deliveryCourseCd;
	}

	public void setDeliveryCourseCd(String deliveryCourseCd) {
		this.deliveryCourseCd = deliveryCourseCd;
	}

	public String getClientCustomerCd() {
		return clientCustomerCd;
	}

	public void setClientCustomerCd(String clientCustomerCd) {
		this.clientCustomerCd = clientCustomerCd;
	}

	public String getCenterCd() {
		return centerCd;
	}

	public void setCenterCd(String centerCd) {
		this.centerCd = centerCd;
	}

	public String getClientCd() {
		return clientCd;
	}

	public void setClientCd(String clientCd) {
		this.clientCd = clientCd;
	}

	public Long getDeliveryOrder() {
		return deliveryOrder;
	}

	public void setDeliveryOrder(Long deliveryOrder) {
		this.deliveryOrder = deliveryOrder;
	}

	public Long getDeliveryReadTime() {
		return deliveryReadTime;
	}

	public void setDeliveryReadTime(Long deliveryReadTime) {
		this.deliveryReadTime = deliveryReadTime;
	}

	/**
	 * @return centerNm
	 */
	public String getCenterNm() {
		return centerNm;
	}

	/**
	 * @param centerNm セットする centerNm
	 */
	public void setCenterNm(String centerNm) {
		this.centerNm = centerNm;
	}

	public String getChkErrorShow() {
		return chkErrorShow;
	}

	public void setChkErrorShow(String chkErrorShow) {
		this.chkErrorShow = chkErrorShow;
	}

	public String getErrorProcessMet() {
		return errorProcessMet;
	}

	public void setErrorProcessMet(String errorProcessMet) {
		this.errorProcessMet = errorProcessMet;
	}

	public String getDeliveryFlgNm() {
		return deliveryFlgNm;
	}

	public void setDeliveryFlgNm(String deliveryFlgNm) {
		this.deliveryFlgNm = deliveryFlgNm;
	}

	public String getVendorFlgNm() {
		return vendorFlgNm;
	}

	public void setVendorFlgNm(String vendorFlgNm) {
		this.vendorFlgNm = vendorFlgNm;
	}

	public String getOnetimeFlgNm() {
		return onetimeFlgNm;
	}

	public void setOnetimeFlgNm(String onetimeFlgNm) {
		this.onetimeFlgNm = onetimeFlgNm;
	}

	public String getDepositFlgNm() {
		return depositFlgNm;
	}

	public void setDepositFlgNm(String depositFlgNm) {
		this.depositFlgNm = depositFlgNm;
	}

	public String getShippingStopFlgNm() {
		return shippingStopFlgNm;
	}

	public void setShippingStopFlgNm(String shippingStopFlgNm) {
		this.shippingStopFlgNm = shippingStopFlgNm;
	}

	public String getLimitDtReverseFlgNm() {
		return limitDtReverseFlgNm;
	}

	public void setLimitDtReverseFlgNm(String limitDtReverseFlgNm) {
		this.limitDtReverseFlgNm = limitDtReverseFlgNm;
	}

	// [#3147][Ver3.0] ユーザ預託管理機能を追加 2017.12.06 honma Add Start
	public String getDepositCheckBox() {
		return depositCheckBox;
	}

	public void setDepositCheckBox(String depositCheckBox) {
		this.depositCheckBox = depositCheckBox;
	}
	// [#3147][Ver3.0] ユーザ預託管理機能を追加 2017.12.06 honma Add End

}
