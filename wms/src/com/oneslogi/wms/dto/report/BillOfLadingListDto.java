package com.oneslogi.wms.dto.report;

import java.math.BigDecimal;
import java.util.List;

import com.oneslogi.base.dto.ReportDto;

public class BillOfLadingListDto extends ReportDto {

	//空白行Flg
	public String nullFlg;

	//合計Flg
	public String sumFlg;

	//帳票CD
	public String reportCd;

	//出庫ヘッダID
	public Long pickingHId;

	//出庫作業No.
	public String pickingWorkNo;

	//Date
	public String shippingDt;

	// Name
	public String clientNm;

	//ADDRESS
	public String address1;

	//City/State/Zip
	public String zipCdFrom;

	//Bill of Lading Number
	public String bolNo;

	// Name
	public String delivCustomerNm;

	//ADDRESS
	public String delivAddress1;

	//City/State/Zip
	public String zipCdTo;

	//Carrier Name
	public String carrierNm;

	//SCAC Code
	public String carrierCd;

	//Pro Number
	public String carrierTraceNum;

	//Freight Charge Terms
	public String paymentTerm;

	//Customer Order Number
	public String clientShippingNo;

	//# PKGS
	public Long pkgs;

	//Weight
	public BigDecimal weight;

	//Carrier Information
	public List<BillOfLadingListSubDto> subReportData;

	public String getNullFlg() {
		return nullFlg;
	}

	public void setNullFlg(String nullFlg) {
		this.nullFlg = nullFlg;
	}

	public String getSumFlg() {
		return sumFlg;
	}

	public void setSumFlg(String sumFlg) {
		this.sumFlg = sumFlg;
	}

	public String getReportCd() {
		return reportCd;
	}

	public void setReportCd(String reportCd) {
		this.reportCd = reportCd;
	}

	public Long getPickingHId() {
		return pickingHId;
	}

	public void setPickingHId(Long pickingHId) {
		this.pickingHId = pickingHId;
	}

	public String getPickingWorkNo() {
		return pickingWorkNo;
	}

	public void setPickingWorkNo(String pickingWorkNo) {
		this.pickingWorkNo = pickingWorkNo;
	}

	public String getShippingDt() {
		return shippingDt;
	}

	public void setShippingDt(String shippingDt) {
		this.shippingDt = shippingDt;
	}

	public String getClientNm() {
		return clientNm;
	}

	public void setClientNm(String clientNm) {
		this.clientNm = clientNm;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getZipCdFrom() {
		return zipCdFrom;
	}

	public void setZipCdFrom(String zipCdFrom) {
		this.zipCdFrom = zipCdFrom;
	}

	public String getBolNo() {
		return bolNo;
	}

	public void setBolNo(String bolNo) {
		this.bolNo = bolNo;
	}

	public String getDelivCustomerNm() {
		return delivCustomerNm;
	}

	public void setDelivCustomerNm(String delivCustomerNm) {
		this.delivCustomerNm = delivCustomerNm;
	}

	public String getDelivAddress1() {
		return delivAddress1;
	}

	public void setDelivAddress1(String delivAddress1) {
		this.delivAddress1 = delivAddress1;
	}

	public String getZipCdTo() {
		return zipCdTo;
	}

	public void setZipCdTo(String zipCdTo) {
		this.zipCdTo = zipCdTo;
	}

	public String getCarrierNm() {
		return carrierNm;
	}

	public void setCarrierNm(String carrierNm) {
		this.carrierNm = carrierNm;
	}

	public String getCarrierCd() {
		return carrierCd;
	}

	public void setCarrierCd(String carrierCd) {
		this.carrierCd = carrierCd;
	}

	public String getCarrierTraceNum() {
		return carrierTraceNum;
	}

	public void setCarrierTraceNum(String carrierTraceNum) {
		this.carrierTraceNum = carrierTraceNum;
	}

	public String getPaymentTerm() {
		return paymentTerm;
	}

	public void setPaymentTerm(String paymentTerm) {
		this.paymentTerm = paymentTerm;
	}

	public String getClientShippingNo() {
		return clientShippingNo;
	}

	public void setClientShippingNo(String clientShippingNo) {
		this.clientShippingNo = clientShippingNo;
	}

	public Long getPkgs() {
		return pkgs;
	}

	public void setPkgs(Long pkgs) {
		this.pkgs = pkgs;
	}

	public BigDecimal getWeight() {
		return weight;
	}

	public void setWeight(BigDecimal weight) {
		this.weight = weight;
	}

	public List<BillOfLadingListSubDto> getSubReportData() {
		return subReportData;
	}

	public void setSubReportData(List<BillOfLadingListSubDto> subReportData) {
		this.subReportData = subReportData;
	}


}
