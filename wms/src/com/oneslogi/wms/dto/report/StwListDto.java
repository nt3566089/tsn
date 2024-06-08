package com.oneslogi.wms.dto.report;

import com.oneslogi.base.dto.ReportDto;

public class StwListDto extends ReportDto {

	//帳票CD
	public String reportCd;

	//センタCD
	public String centerCd;

	//センタ名称
	public String centerNm;

	//荷主
	public String clientCd;

	//荷主名称
	public String clientNm;

	//出荷日
	public String shippingDt;

	//配送コースCD
	public String deliveryCourseCd;

	//配送コース名称
	public String deliveryCourseNm;

	//運送業者CD
	public String carrierCd;

	//運送業者名称
	public String carrierNm;

	//処理区分
	public String processTypeCd;

	//処理区分
	public String processTypeNm;

	//納品先CD
	public String supplierCustomerCd;

	//納品先名称
	public String supplierCustomerNm;

	//出庫作業No.
	public String pickingWorkNo;

	//個口数
	public Long sumPickingHCount;

	//住所１
	public String delivAddress1;

	//住所２
	public String delivAddress2;

	public Long getCultureId() {
		return cultureId;
	}

	public void setCultureId(Long cultureId) {
		this.cultureId = cultureId;
	}

	public String getReportCd() {
		return reportCd;
	}

	public void setReportCd(String reportCd) {
		this.reportCd = reportCd;
	}

	public String getCenterCd() {
		return centerCd;
	}

	public void setCenterCd(String centerCd) {
		this.centerCd = centerCd;
	}

	public String getCenterNm() {
		return centerNm;
	}

	public void setCenterNm(String centerNm) {
		this.centerNm = centerNm;
	}

	public String getClientCd() {
		return clientCd;
	}

	public void setClientCd(String clientCd) {
		this.clientCd = clientCd;
	}

	public String getClientNm() {
		return clientNm;
	}

	public void setClientNm(String clientNm) {
		this.clientNm = clientNm;
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

	public String getDeliveryCourseNm() {
		return deliveryCourseNm;
	}

	public void setDeliveryCourseNm(String deliveryCourseNm) {
		this.deliveryCourseNm = deliveryCourseNm;
	}

	public String getCarrierCd() {
		return carrierCd;
	}

	public void setCarrierCd(String carrierCd) {
		this.carrierCd = carrierCd;
	}

	public String getCarrierNm() {
		return carrierNm;
	}

	public void setCarrierNm(String carrierNm) {
		this.carrierNm = carrierNm;
	}

	public String getProcessTypeCd() {
		return processTypeCd;
	}

	public void setProcessTypeCd(String processTypeCd) {
		this.processTypeCd = processTypeCd;
	}

	public String getProcessTypeNm() {
		return processTypeNm;
	}

	public void setProcessTypeNm(String processTypeNm) {
		this.processTypeNm = processTypeNm;
	}

	public String getSupplierCustomerCd() {
		return supplierCustomerCd;
	}

	public void setSupplierCustomerCd(String supplierCustomerCd) {
		this.supplierCustomerCd = supplierCustomerCd;
	}

	public String getSupplierCustomerNm() {
		return supplierCustomerNm;
	}

	public void setSupplierCustomerNm(String supplierCustomerNm) {
		this.supplierCustomerNm = supplierCustomerNm;
	}

	public String getPickingWorkNo() {
		return pickingWorkNo;
	}

	public void setPickingWorkNo(String pickingWorkNo) {
		this.pickingWorkNo = pickingWorkNo;
	}

	public Long getSumPickingHCount() {
		return sumPickingHCount;
	}

	public void setSumPickingHCount(Long sumPickingHCount) {
		this.sumPickingHCount = sumPickingHCount;
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
}
