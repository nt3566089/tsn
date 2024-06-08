package com.oneslogi.wms.dto.report;

import java.math.BigDecimal;

import com.oneslogi.base.dto.ReportDto;

public class DeliverySlipListDto extends ReportDto {

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

	//納品先CD
	public String supplyCustomerCd;

	//納品先名称
	public String supplyCustomerNm;

	//出荷日
	public String shippingDt;

	//納品指定日
	public String delivDt;

	//WMS出荷伝票No.
	public String shippingSlipNo;

	//顧客出荷指示No.
	public String clientShippingNo;

	//商品CD
	public String productCd;

	//商品名称
	public String productNm;

	//電話番号
	public String telNo;

	//ロット
	public String lot;

	//期限日
	public String limitDt;

	//出庫数
	public BigDecimal pickingNum;

	// [EC-CT1-162] 出庫作業Noの全桁のバーコードを追加するため、修正 2015.03.31 KYO Start
	// 出庫作業No.
	public String pickingWorkNo;

	// 出庫作業No.(下５桁)
	public String pickingWorkNoLastFive;
	// [EC-CT1-162] 出庫作業Noの全桁のバーコードを追加するため、修正 2015.03.31 KYO End

	// [#2252]金額データ連携・納品書表示対応 2017.08.21 sampei Start
	// [Ver3.0][#3677] 金額データ連携　小数を許容するように修正する 2018.02.14 shimizu Start
	// 合計金額
	public BigDecimal totalPrice;

	// 合計消費税
	public BigDecimal totalTax;

	// 金額
	public BigDecimal price;

	// 消費税
	public BigDecimal tax;
	// [Ver3.0][#3677] 金額データ連携　小数を許容するように修正する 2018.02.14 shimizu End

	// 出荷指示ボディID
	public Long shippingInstBId;

	// [#2252]金額データ連携・納品書表示対応 2017.08.21 sampei End

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

	public String getSupplyCustomerCd() {
		return supplyCustomerCd;
	}

	public void setSupplyCustomerCd(String supplyCustomerCd) {
		this.supplyCustomerCd = supplyCustomerCd;
	}

	public String getSupplyCustomerNm() {
		return supplyCustomerNm;
	}

	public void setSupplyCustomerNm(String supplyCustomerNm) {
		this.supplyCustomerNm = supplyCustomerNm;
	}

	public String getShippingDt() {
		return shippingDt;
	}

	public void setShippingDt(String shippingDt) {
		this.shippingDt = shippingDt;
	}

	public String getDelivDt() {
		return delivDt;
	}

	public void setDelivDt(String delivDt) {
		this.delivDt = delivDt;
	}

	public String getShippingSlipNo() {
		return shippingSlipNo;
	}

	public void setShippingSlipNo(String shippingSlipNo) {
		this.shippingSlipNo = shippingSlipNo;
	}

	public String getClientShippingNo() {
		return clientShippingNo;
	}

	public void setClientShippingNo(String clientShippingNo) {
		this.clientShippingNo = clientShippingNo;
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

	public String getTelNo() {
		return telNo;
	}

	public void setTelNo(String telNo) {
		this.telNo = telNo;
	}

	public String getLot() {
		return lot;
	}

	public void setLot(String lot) {
		this.lot = lot;
	}

	public String getLimitDt() {
		return limitDt;
	}

	public void setLimitDt(String limitDt) {
		this.limitDt = limitDt;
	}

	public BigDecimal getPickingNum() {
		return pickingNum;
	}

	public void setPickingNum(BigDecimal pickingNum) {
		this.pickingNum = pickingNum;
	}
	// [EC-CT1-162] 出庫作業Noの全桁のバーコードを追加するため、修正 2015.03.31 KYO Start
	public String getPickingWorkNo() {
		return pickingWorkNo;
	}

	public void setPickingWorkNo(String pickingWorkNo) {
		this.pickingWorkNo = pickingWorkNo;
	}

	public String getPickingWorkNoLastFive() {
		return pickingWorkNoLastFive;
	}

	public void setPickingWorkNoLastFive(String pickingWorkNoLastFive) {
		this.pickingWorkNoLastFive = pickingWorkNoLastFive;
	}
	// [EC-CT1-162] 出庫作業Noの全桁のバーコードを追加するため、修正 2015.03.31 KYO End

	// [#2252]金額データ連携・納品書表示対応 2017.08.21 sampei Start
	// [Ver3.0][#3677] 金額データ連携　小数を許容するように修正する 2018.02.14 shimizu Start
	public Long getShippingInstBId() {
		return shippingInstBId;
	}

	public BigDecimal getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(BigDecimal totalPrice) {
		this.totalPrice = totalPrice;
	}

	public BigDecimal getTotalTax() {
		return totalTax;
	}

	public void setTotalTax(BigDecimal totalTax) {
		this.totalTax = totalTax;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public BigDecimal getTax() {
		return tax;
	}

	public void setTax(BigDecimal tax) {
		this.tax = tax;
	}
	// [Ver3.0][#3677] 金額データ連携　小数を許容するように修正する 2018.02.14 shimizu End

	public void setShippingInstBId(Long shippingInstBId) {
		this.shippingInstBId = shippingInstBId;
	}
	// [#2252]金額データ連携・納品書表示対応 2017.08.21 sampei End
}
