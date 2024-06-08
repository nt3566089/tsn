package com.oneslogi.wms.dto.shipping;

import java.util.List;


public class ShippingSendFromSdsDto {
	// 出荷指示ヘッダ
	// Invoice ID
	public Long invHId;
	// [ON推-CT113-024] SDS連携修正 2016.01.20 koyama Start
	// 出荷指示ヘッダID
	public Long shippingInstHId;
	// [ON推-CT113-024] SDS連携修正 2016.01.20 koyama End
	// [新WMS-113-018] 登録時、確認or警告メッセージを表示 2016.02.04 koyama Start
	// 荷主ID
	public Long clientId;
	// センタID
	public Long centerId;
	// [新WMS-113-018] 登録時、確認or警告メッセージを表示 2016.02.04 koyama Start
	// 荷主CD
	public String clientCd;
	// センタCD
	public String centerCd;
	// 緊急フラグ
	public String emergencyFlg;
	// 顧客出荷指示No.
	public String clientShippingNo;
	// 納品先CD
	public String supplyCustomerCd;
	// 処理区分
	public Long processTypeId;
	// 作業日
	public String workD;
	// 出荷日
	public String shippingDt;
	// 配送コースCD
	public String deliveryCourseCd;
	// 納品指定日
	public String delivDt;
	// 納品時間帯CD
	public String delivTz;
	// 届先CD
	public String delivCustomerCd;
	// 届先名称
	public String delivCustomerNm;
	// 届先郵便番号
	public String delivZipCd;
	// 届先住所1
	public String delivAddress1;
	// 届先住所2
	public String delivAddress2;
	// 届先住所3
	public String delivAddress3;
	// 届先電話番号
	public String delivTelNo;
	// 届先住所補足
	public String delivAddressSupply;
	// 出庫作業メッセージ
	public String pickingWorkMessage;
	// [ON推-CT113-024] SDS連携修正 2016.01.20 koyama Start
	// エラーフラグ
	public String errFlg;
	// [ON推-CT113-024] SDS連携修正 2016.01.20 koyama End
	// 出荷指示ボディList
	public List<ShippingSendFromSdsDtoBody> tShippingInstBDtoList;

	public Long getInvHId() {
		return invHId;
	}

	public void setInvHId(Long invHId) {
		this.invHId = invHId;
	}

	// [ON推-CT113-024] SDS連携修正 2016.01.20 koyama Start
	public Long getShippingInstHId() {
		return shippingInstHId;
	}

	public void setShippingInstHId(Long shippingInstHId) {
		this.shippingInstHId = shippingInstHId;
	}
	// [ON推-CT113-024] SDS連携修正 2016.01.20 koyama End

	// [新WMS-113-018] 登録時、確認or警告メッセージを表示 2016.02.04 koyama Start
	public Long getClientId() {
		return clientId;
	}

	public void setClientId(Long clientId) {
		this.clientId = clientId;
	}

	public Long getCenterId() {
		return centerId;
	}

	public void setCenterId(Long centerId) {
		this.centerId = centerId;
	}
	// [新WMS-113-018] 登録時、確認or警告メッセージを表示 2016.02.04 koyama Start

	public String getClientCd() {
		return clientCd;
	}

	public void setClientCd(String clientCd) {
		this.clientCd = clientCd;
	}

	public String getCenterCd() {
		return centerCd;
	}

	public void setCenterCd(String centerCd) {
		this.centerCd = centerCd;
	}

	public String getEmergencyFlg() {
		return emergencyFlg;
	}

	public void setEmergencyFlg(String emergencyFlg) {
		this.emergencyFlg = emergencyFlg;
	}

	public String getClientShippingNo() {
		return clientShippingNo;
	}

	public void setClientShippingNo(String clientShippingNo) {
		this.clientShippingNo = clientShippingNo;
	}

	public String getSupplyCustomerCd() {
		return supplyCustomerCd;
	}

	public void setSupplyCustomerCd(String supplyCustomerCd) {
		this.supplyCustomerCd = supplyCustomerCd;
	}

	public Long getProcessTypeId() {
		return processTypeId;
	}

	public void setProcessTypeId(Long processTypeId) {
		this.processTypeId = processTypeId;
	}

	public String getWorkD() {
		return workD;
	}

	public void setWorkD(String workD) {
		this.workD = workD;
	}

	public String getShippingDt() {
		return shippingDt;
	}

	public void setShippingDt(String shippingDt) {
		this.shippingDt = shippingDt;
	}

	public String getDeliveryCourseCd() {
		return deliveryCourseCd;
	}

	public void setDeliveryCourseCd(String deliveryCourseCd) {
		this.deliveryCourseCd = deliveryCourseCd;
	}

	public String getDelivDt() {
		return delivDt;
	}

	public void setDelivDt(String delivDt) {
		this.delivDt = delivDt;
	}

	public String getDelivTz() {
		return delivTz;
	}

	public void setDelivTz(String delivTz) {
		this.delivTz = delivTz;
	}

	public String getDelivCustomerCd() {
		return delivCustomerCd;
	}

	public void setDelivCustomerCd(String delivCustomerCd) {
		this.delivCustomerCd = delivCustomerCd;
	}

	public String getDelivCustomerNm() {
		return delivCustomerNm;
	}

	public void setDelivCustomerNm(String delivCustomerNm) {
		this.delivCustomerNm = delivCustomerNm;
	}

	public String getDelivZipCd() {
		return delivZipCd;
	}

	public void setDelivZipCd(String delivZipCd) {
		this.delivZipCd = delivZipCd;
	}

	public String getDelivAddress1() {
		return delivAddress1;
	}

	public void setDelivAddress1(String delivAddress1) {
		this.delivAddress1 = delivAddress1;
	}

	public String getDelivAddress2() {
		return delivAddress2;
	}

	public void setDelivAddress2(String delivAddress2) {
		this.delivAddress2 = delivAddress2;
	}

	public String getDelivAddress3() {
		return delivAddress3;
	}

	public void setDelivAddress3(String delivAddress3) {
		this.delivAddress3 = delivAddress3;
	}

	public String getDelivTelNo() {
		return delivTelNo;
	}

	public void setDelivTelNo(String delivTelNo) {
		this.delivTelNo = delivTelNo;
	}

	public String getDelivAddressSupply() {
		return delivAddressSupply;
	}

	public void setDelivAddressSupply(String delivAddressSupply) {
		this.delivAddressSupply = delivAddressSupply;
	}

	public String getPickingWorkMessage() {
		return pickingWorkMessage;
	}

	public void setPickingWorkMessage(String pickingWorkMessage) {
		this.pickingWorkMessage = pickingWorkMessage;
	}

	// [ON推-CT113-024] SDS連携修正 2016.01.20 koyama Start
	public String getErrFlg() {
		return errFlg;
	}

	public void setErrFlg(String errFlg) {
		this.errFlg = errFlg;
	}
	// [ON推-CT113-024] SDS連携修正 2016.01.20 koyama End

	public List<ShippingSendFromSdsDtoBody> getTShippingInstBDtoList() {
		return tShippingInstBDtoList;
	}

	public void setTShippingInstBDtoList(List<ShippingSendFromSdsDtoBody> tShippingInstBDtoList) {
		this.tShippingInstBDtoList = tShippingInstBDtoList;
	}
}
