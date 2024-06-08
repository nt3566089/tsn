package com.oneslogi.wms.dto.report;

import com.oneslogi.base.dto.ReportDto;

public class EcDeliverySlipListDto extends ReportDto {
	// 帳票ID
	public Long reportId;
	// 帳票CD
	public String reportCd;
	// 納品書タイトル
	private String statementTitle;
	// 納品書記載URL
	private String statementUrl;
	// 荷主名称
	private String clientNm;
	// 注文者郵便番号
	private String orderZipCd;
	// 注文者住所：都道府県
	private String orderAddress1;
	// 注文者住所：都市区
	private String orderAddress2;
	// 注文者住所：町以降
	private String orderAddress3;
	// 注文者名称
	private String orderCustomerNm;
	// 送付先郵便番号
	private String delivZipCd;
	// 送付先住所：都道府県
	private String delivAddress1;
	// 送付先住所：都市区
	private String delivAddress2;
	// 送付先住所：町以降
	private String delivAddress3;
	// 送付先名称
	private String delivCustomerNm;
	// [EC-CT1-161] 出庫作業Noの全桁のバーコードを追加するため、修正 2015.03.31 KYO Start
	// 出庫作業No.
	private String pickingWorkNo;
	// 出庫作業No.(下５桁)
	private String pickingWorkNoLastFive;
	// [EC-CT1-161] 出庫作業Noの全桁のバーコードを追加するため、修正 2015.03.31 KYO End
	// 注文日
	private String orderDt;
	// 受注番号
	private String orderNo;
	// 決済方法
	private String paymentMethod;
    // クレジットカード種類
	private String cardType;
	// 商品名
	private String productNm;
	// 商品名(長い場合)
	private String productNmLng;
	// 商品番号
	private String productNo;
	// 項目・選択肢
	private String itemChoice;
	// 項目・選択肢(長い場合)
	private String itemChoiceLng;
	// 個数
	private String orderNum;
	// 単価
	private String unitPrice;
	// 小計
	private String subTotal;
	// 合計
	private String total;
	// 消費税
	private String tax;
	// 送料
	private String carriage;
	// 代引料
	private String cod;
	// 合計金額
	private String totalAmount;
	// クーポン利用額
	private String couponUse;
	// ポイント利用額
	private String pointUse;
	// 請求金額
	private String amountBilled;
    // ギフトフラグ
	private String giftFlg;
	// ギフト用納品書種類
	private String giftStatementType;
	// 納品書明細置換え文字列
	private String giftStatementDetail;
	// [C-CWMS-0026] クーポン・ポイントの他で値引がある内容の追加 2015.05.19 kyo Start
	private String otherDiscount;
	// [C-CWMS-0026] クーポン・ポイントの他で値引がある内容の追加 2015.05.19 kyo End

	public Long getReportId() {
		return reportId;
	}
	public void setReportId(Long reportId) {
		this.reportId = reportId;
	}
	public String getReportCd() {
		return reportCd;
	}
	public void setReportCd(String reportCd) {
		this.reportCd = reportCd;
	}
	public String getStatementTitle() {
		return statementTitle;
	}
	public void setStatementTitle(String statementTitle) {
		this.statementTitle = statementTitle;
	}
	public String getStatementUrl() {
		return statementUrl;
	}
	public void setStatementUrl(String statementUrl) {
		this.statementUrl = statementUrl;
	}
	public String getClientNm() {
		return clientNm;
	}
	public void setClientNm(String clientNm) {
		this.clientNm = clientNm;
	}
	public String getOrderZipCd() {
		return orderZipCd;
	}
	public void setOrderZipCd(String orderZipCd) {
		this.orderZipCd = orderZipCd;
	}
	public String getOrderAddress1() {
		return orderAddress1;
	}
	public void setOrderAddress1(String orderAddress1) {
		this.orderAddress1 = orderAddress1;
	}
	public String getOrderAddress2() {
		return orderAddress2;
	}
	public void setOrderAddress2(String orderAddress2) {
		this.orderAddress2 = orderAddress2;
	}
	public String getOrderAddress3() {
		return orderAddress3;
	}
	public void setOrderAddress3(String orderAddress3) {
		this.orderAddress3 = orderAddress3;
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
	public String getDelivCustomerNm() {
		return delivCustomerNm;
	}
	public void setDelivCustomerNm(String delivCustomerNm) {
		this.delivCustomerNm = delivCustomerNm;
	}
	public String getPickingWorkNo() {
		return pickingWorkNo;
	}
	public void setPickingWorkNo(String pickingWorkNo) {
		this.pickingWorkNo = pickingWorkNo;
	}
	// [EC-CT1-161] 出庫作業Noの全桁のバーコードを追加するため、修正 2015.03.31 KYO Start
	public String getPickingWorkNoLastFive() {
		return pickingWorkNoLastFive;
	}
	public void setPickingWorkNoLastFive(String pickingWorkNoLastFive) {
		this.pickingWorkNoLastFive = pickingWorkNoLastFive;
	}
	// [EC-CT1-161] 出庫作業Noの全桁のバーコードを追加するため、修正 2015.03.31 KYO End
	public String getOrderDt() {
		return orderDt;
	}
	public void setOrderDt(String orderDt) {
		this.orderDt = orderDt;
	}
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrderCustomerNm() {
		return orderCustomerNm;
	}
	public void setOrderCustomerNm(String orderCustomerNm) {
		this.orderCustomerNm = orderCustomerNm;
	}
	public String getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	public String getProductNm() {
		return productNm;
	}
	public void setProductNm(String productNm) {
		this.productNm = productNm;
	}
	public String getProductNo() {
		return productNo;
	}
	public void setProductNo(String productNo) {
		this.productNo = productNo;
	}
	public String getItemChoice() {
		return itemChoice;
	}
	public void setItemChoice(String itemChoice) {
		this.itemChoice = itemChoice;
	}
	public String getOrderNum() {
		return orderNum;
	}
	public void setOrderNum(String orderNum) {
		this.orderNum = orderNum;
	}
	public String getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(String unitPrice) {
		this.unitPrice = unitPrice;
	}
	public String getSubTotal() {
		return subTotal;
	}
	public void setSubTotal(String subTotal) {
		this.subTotal = subTotal;
	}
	public String getTotal() {
		return total;
	}
	public void setTotal(String total) {
		this.total = total;
	}
	public String getTax() {
		return tax;
	}
	public void setTax(String tax) {
		this.tax = tax;
	}
	public String getCarriage() {
		return carriage;
	}
	public void setCarriage(String carriage) {
		this.carriage = carriage;
	}
	public String getCod() {
		return cod;
	}
	public void setCod(String cod) {
		this.cod = cod;
	}
	public String getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getCouponUse() {
		return couponUse;
	}
	public void setCouponUse(String couponUse) {
		this.couponUse = couponUse;
	}
	public String getPointUse() {
		return pointUse;
	}
	public void setPointUse(String pointUse) {
		this.pointUse = pointUse;
	}
	public String getOtherDiscount() {
		return otherDiscount;
	}
	public void setOtherDiscount(String otherDiscount) {
		this.otherDiscount = otherDiscount;
	}
	public String getAmountBilled() {
		return amountBilled;
	}
	public void setAmountBilled(String amountBilled) {
		this.amountBilled = amountBilled;
	}
	public String getGiftFlg() {
		return giftFlg;
	}
	public void setGiftFlg(String giftFlg) {
		this.giftFlg = giftFlg;
	}
	public String getGiftStatementType() {
		return giftStatementType;
	}
	public void setGiftStatementType(String giftStatementType) {
		this.giftStatementType = giftStatementType;
	}
	public String getGiftStatementDetail() {
		return giftStatementDetail;
	}
	public void setGiftStatementDetail(String giftStatementDetail) {
		this.giftStatementDetail = giftStatementDetail;
	}
	public String getProductNmLng() {
		return productNmLng;
	}
	public void setProductNmLng(String productNmLng) {
		this.productNmLng = productNmLng;
	}
	public String getItemChoiceLng() {
		return itemChoiceLng;
	}
	public void setItemChoiceLng(String itemChoiceLng) {
		this.itemChoiceLng = itemChoiceLng;
	}
}
