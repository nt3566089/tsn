package com.oneslogi.wms.dto.tsnCommon;

public class TSplitDetailData {

	// 工場コード
	private String factoryCd;
	// 銘柄コード
	private String itemCd;
	// SKU
	private String sku;
	// 仕向地コード
	private String destinationCd;
	// 製造記号
	private String manufactureCd;
	// 発注番号
	private String orderNo;
	// 号機
	private String machineNo;
	// 生出番号
	private String createNo;
	// 製造年月日
	private String limitDate;
	// 実製造時間
	private String makeTime;
	// 流通識別コード
	private String distributionCd;
	// 商社搬入番号
	private String firmtransportCd;
	// 入庫キー
	private String rcvKey;
	// デザイン区分
	private String designCd;
	// BATJ製造月記号
	private String batjMfYm;
	// 個装数量
	private String qty;
	// 銘柄変更前銘柄コード
	private String lastItemCd;
	// 銘柄変更前デザイン区分
	private String lastDesignCd;
	// 段ボール有無フラグ
	private String caseFlg;

	public String getFactoryCd() {
		return factoryCd;
	}
	public void setFactoryCd(String factoryCd) {
		this.factoryCd = factoryCd;
	}
	public String getItemCd() {
		return itemCd;
	}
	public void setItemCd(String itemCd) {
		this.itemCd = itemCd;
	}
	public String getSku() {
		return sku;
	}
	public void setSku(String sku) {
		this.sku = sku;
	}
	public String getDestinationCd() {
		return destinationCd;
	}
	public void setDestinationCd(String destinationCd) {
		this.destinationCd = destinationCd;
	}
	public String getManufactureCd() {
		return manufactureCd;
	}
	public void setManufactureCd(String manufactureCd) {
		this.manufactureCd = manufactureCd;
	}
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getMachineNo() {
		return machineNo;
	}
	public void setMachineNo(String machineNo) {
		this.machineNo = machineNo;
	}
	public String getCreateNo() {
		return createNo;
	}
	public void setCreateNo(String createNo) {
		this.createNo = createNo;
	}
	public String getLimitDate() {
		return limitDate;
	}
	public void setLimitDate(String limitDate) {
		this.limitDate = limitDate;
	}
	public String getMakeTime() {
		return makeTime;
	}
	public void setMakeTime(String makeTime) {
		this.makeTime = makeTime;
	}
	public String getDistributionCd() {
		return distributionCd;
	}
	public void setDistributionCd(String distributionCd) {
		this.distributionCd = distributionCd;
	}
	public String getFirmtransportCd() {
		return firmtransportCd;
	}
	public void setFirmtransportCd(String firmtransportCd) {
		this.firmtransportCd = firmtransportCd;
	}
	public String getRcvKey() {
		return rcvKey;
	}
	public void setRcvKey(String rcvKey) {
		this.rcvKey = rcvKey;
	}
	public String getDesignCd() {
		return designCd;
	}
	public void setDesignCd(String designCd) {
		this.designCd = designCd;
	}
	public String getBatjMfYm() {
		return batjMfYm;
	}
	public void setBatjMfYm(String batjMfYm) {
		this.batjMfYm = batjMfYm;
	}
	public String getQty() {
		return qty;
	}
	public void setQty(String qty) {
		this.qty = qty;
	}
	public String getLastItemCd() {
		return lastItemCd;
	}
	public void setLastItemCd(String lastItemCd) {
		this.lastItemCd = lastItemCd;
	}
	public String getLastDesignCd() {
		return lastDesignCd;
	}
	public void setLastDesignCd(String lastDesignCd) {
		this.lastDesignCd = lastDesignCd;
	}
	public String getCaseFlg() {
		return caseFlg;
	}
	public void setCaseFlg(String caseFlg) {
		this.caseFlg = caseFlg;
	}
}
