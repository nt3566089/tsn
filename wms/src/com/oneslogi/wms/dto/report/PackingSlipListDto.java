package com.oneslogi.wms.dto.report;

import java.math.BigDecimal;

import com.oneslogi.base.dto.ReportDto;

public class PackingSlipListDto extends ReportDto {

	//帳票CD
	public String reportCd;

	//荷主
	public String clientCd;

	//荷主名称
	public String clientNm;

	//荷主センタ住所１
	public String clientAddress1;

	//荷主センタ住所２
	public String clientAddress2;

	//荷主センタ住所３
	public String clientAddress3;

	//荷主電話番号
	public String clientTelNo;

	//出荷日
	public String shippingDt;

	//オーダーNo
	public String clientShippingNo;

	//請求先名称
	public String supplyCustomerNm;

	//請求先住所１
	public String billAddress1;

	//請求先住所２
	public String billAddress2;

	//請求先住所３
	public String billAddress3;

	//請求先電話番号
	public String billTelNo;

	//出荷先名称
	public String delivCustomerNm;

	//請求先住所１
	public String delivAddress1;

	//出荷先住所２
	public String delivAddress2;

	//出荷先住所３
	public String delivAddress3;

	//出荷先電話番号
	public String delivTelNo;

	//商品コード
	public String productCd;

	//商品名称
	public String productNm;

	//数量
	public BigDecimal allocNum;

	public String getReportCd() {
		return reportCd;
	}

	public void setReportCd(String reportCd) {
		this.reportCd = reportCd;
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

	public String getClientAddress1() {
		return clientAddress1;
	}

	public void setClientAddress1(String clientAddress1) {
		this.clientAddress1 = clientAddress1;
	}

	public String getClientAddress2() {
		return clientAddress2;
	}

	public void setClientAddress2(String clientAddress2) {
		this.clientAddress2 = clientAddress2;
	}

	public String getClientAddress3() {
		return clientAddress3;
	}

	public void setClientAddress3(String clientAddress3) {
		this.clientAddress3 = clientAddress3;
	}

	public String getClientTelNo() {
		return clientTelNo;
	}

	public void setClientTelNo(String clientTelNo) {
		this.clientTelNo = clientTelNo;
	}

	public String getShippingDt() {
		return shippingDt;
	}

	public void setShippingDt(String shippingDt) {
		this.shippingDt = shippingDt;
	}

	public String getClientShippingNo() {
		return clientShippingNo;
	}

	public void setClientShippingNo(String clientShippingNo) {
		this.clientShippingNo = clientShippingNo;
	}

	public String getSupplyCustomerNm() {
		return supplyCustomerNm;
	}

	public void setSupplyCustomerNm(String supplyCustomerNm) {
		this.supplyCustomerNm = supplyCustomerNm;
	}

	public String getBillAddress1() {
		return billAddress1;
	}

	public void setBillAddress1(String billAddress1) {
		this.billAddress1 = billAddress1;
	}

	public String getBillAddress2() {
		return billAddress2;
	}

	public void setBillAddress2(String billAddress2) {
		this.billAddress2 = billAddress2;
	}

	public String getBillAddress3() {
		return billAddress3;
	}

	public void setBillAddress3(String billAddress3) {
		this.billAddress3 = billAddress3;
	}

	public String getBillTelNo() {
		return billTelNo;
	}

	public void setBillTelNo(String billTelNo) {
		this.billTelNo = billTelNo;
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

	public String getProductCd() {
		return productCd;
	}

	public void setProductCd(String productCd) {
		this.productCd = productCd;
	}

	public String getProductNm() {
		return productNm;
	}

	public void setProductNm(String productNm) {
		this.productNm = productNm;
	}

	public BigDecimal getAllocNum() {
		return allocNum;
	}

	public void setAllocNum(BigDecimal allocNum) {
		this.allocNum = allocNum;
	}

}
