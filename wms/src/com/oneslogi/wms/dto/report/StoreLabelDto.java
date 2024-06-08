package com.oneslogi.wms.dto.report;

import java.math.BigDecimal;

import com.oneslogi.base.dto.ReportDto;

public class StoreLabelDto extends ReportDto {

	//帳票名称
	public String reportNm;

	// [Ver3.0] unit of measure対応 2017.11.21 REN Start
	//入数
	private String stringUnitNum;

	//内訳
	private String breakdown;

	//最小梱包単位
	private String minimumPackingUnit;
	// [Ver3.0] unit of measure対応 2017.11.21 REN End

	//センタCD
	public String centerCd;

	//センタ略称
	public String centerNm;

	//荷主
	public String clientCd;

	//荷主略称
	public String clientNm;

	//商品CD
	public String productCd;

	//JANCD
	public String janCd;

	//商品名称
	public String productNm;

	//預託
	public String depositNm;

    //在庫区分
	public String stockType;

	//期限日
	public String limitDt;

	//ロット
	public String lot;

	//倉庫CD
	public String warehouseCd;

	//倉庫
	public String warehouseNm;

	//ゾーンCD
	public String zoneCd;

	//ゾーン
	public String zoneNm;

	//推奨	ロケ
	public String tLocationNm;

	//推奨	ロケ
	public String tLoactionCd;

	//数量  ケース数
	public BigDecimal caseNum;

	//数量 ピース数(実績)
	public BigDecimal paraNum;

	//入数
	public Long unitNum;

	//入庫数
	public BigDecimal storeNum;

	//入庫ラベルNo.
	public String storeLabelNo;
	//入庫No.
	public Long storeNo;

	public String printCondition;

	public String userCd;

	// [1.1.4-CT-041] 入庫ロケ変数追加 ネーゾー Start
	//入庫ロケCD
	public String inTLocationCd;

	//入庫ロケ名称
	public String inTLocationNm;
	// [1.1.4-CT-041] 入庫ロケ変数追加 ネーゾー End

	//[ON推-品質問題点指摘票(新ｿﾘV2-061)] 修正対応 2016.08.23 chou Add Start
	//入庫日
	public String storeDt;
	//[ON推-品質問題点指摘票(新ｿﾘV2-061)] 修正対応 2016.08.23 chou Add End

	// [#4220][Ver3.0] 帳票 - 表示項目最新化(ピックロケ表示対象) 2018.04.03 honma Add Start
	//ピックロケ
	public String pickTLocationCd;

	//ピックロケ
	public String pickTLocationNm;
	// [#4220][Ver3.0] 帳票 - 表示項目最新化(ピックロケ表示対象) 2018.04.03 honma Add End

	public String getClientCd() {
		return clientCd;
	}

	public void setClientCd(String clientCd) {
		this.clientCd = clientCd;
	}

	// [Ver3.0] unit of measure対応 2017.11.21 REN Start
	public String getStringUnitNum() {
	return stringUnitNum;
	}

	public void setStringUnitNum(String stringUnitNum) {
	this.stringUnitNum = stringUnitNum;
	}

	public String getBreakdown() {
	return breakdown;
	}

	public void setBreakdown(String breakdown) {
	this.breakdown = breakdown;
	}

	public String getMinimumPackingUnit() {
	return minimumPackingUnit;
	}

	public void setMinimumPackingUnit(String minimumPackingUnit) {
	this.minimumPackingUnit = minimumPackingUnit;
	}
	// [Ver3.0] unit of measure対応 2017.11.21 REN End

	public String getClientNm() {
		return clientNm;
	}

	public void setClientNm(String clientNm) {
		this.clientNm = clientNm;
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

	public String getDepositNm() {
		return depositNm;
	}

	public void setDepositNm(String depositNm) {
		this.depositNm = depositNm;
	}

	public String getStockType() {
		return stockType;
	}

	public void setStockType(String stockType) {
		this.stockType = stockType;
	}

	public String getLimitDt() {
		return limitDt;
	}

	public void setLimitDt(String limitDt) {
		this.limitDt = limitDt;
	}

	public String getLot() {
		return lot;
	}

	public void setLot(String lot) {
		this.lot = lot;
	}

	public String getWarehouseCd() {
		return warehouseCd;
	}

	public void setWarehouseCd(String warehouseCd) {
		this.warehouseCd = warehouseCd;
	}

	public String getWarehouseNm() {
		return warehouseNm;
	}

	public void setWarehouseNm(String warehouseNm) {
		this.warehouseNm = warehouseNm;
	}

	public String getZoneCd() {
		return zoneCd;
	}

	public void setZoneCd(String zoneCd) {
		this.zoneCd = zoneCd;
	}

	public String getZoneNm() {
		return zoneNm;
	}

	public void setZoneNm(String zoneNm) {
		this.zoneNm = zoneNm;
	}

	public BigDecimal getCaseNum() {
		return caseNum;
	}

	public void setCaseNum(BigDecimal caseNum) {
		this.caseNum = caseNum;
	}

	public BigDecimal getParaNum() {
		return paraNum;
	}

	public void setParaNum(BigDecimal paraNum) {
		this.paraNum = paraNum;
	}

	public Long getUnitNum() {
		return unitNum;
	}

	public void setUnitNum(Long unitNum) {
		this.unitNum = unitNum;
	}

	public BigDecimal getStoreNum() {
		return storeNum;
	}

	public void setStoreNum(BigDecimal storeNum) {
		this.storeNum = storeNum;
	}

	public String getReportNm() {
		return reportNm;
	}

	public void setReportNm(String reportNm) {
		this.reportNm = reportNm;
	}

	public String getStoreLabelNo() {
		return storeLabelNo;
	}

	public void setStoreLabelNo(String storeLabelNo) {
		this.storeLabelNo = storeLabelNo;
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

	public Long getStoreNo() {
		return storeNo;
	}

	public void setStoreNo(Long storeNo) {
		this.storeNo = storeNo;
	}

	public String getPrintCondition() {
		return printCondition;
	}

	public void setPrintCondition(String printCondition) {
		this.printCondition = printCondition;
	}

	public String getJanCd() {
		return janCd;
	}

	public void setJanCd(String janCd) {
		this.janCd = janCd;
	}

	public String gettLoactionCd() {
		return tLoactionCd;
	}

	public void settLoactionCd(String tLoactionCd) {
		this.tLoactionCd = tLoactionCd;
	}

	public Long getCultureId() {
		return cultureId;
	}

	public void setCultureId(Long cultureId) {
		this.cultureId = cultureId;
	}

	public String gettLocationNm() {
		return tLocationNm;
	}

	public void settLocationNm(String tLocationNm) {
		this.tLocationNm = tLocationNm;
	}

	public String getUserCd() {
		return userCd;
	}

	public void setUserCd(String userCd) {
		this.userCd = userCd;
	}

	//[1.1.4-CT-041] 入庫ロケ変数追加 ネーゾー Start
	public String getInTLocationCd() {
		return inTLocationCd;
	}

	public void setInTLocationCd(String inTLocationCd) {
		this.inTLocationCd = inTLocationCd;
	}
	//[1.1.4-CT-041] 入庫ロケ変数追加 ネーゾー End
	//[ON推-品質問題点指摘票(新ｿﾘV2-061)] 修正対応 2016.08.23 chou Add Start
	public String getStoreDt() {
		return storeDt;
	}

	public void setStoreDt(String storeDt) {
		this.storeDt = storeDt;
	}
	//[ON推-品質問題点指摘票(新ｿﾘV2-061)] 修正対応 2016.08.23 chou Add End

	// [#4220][Ver3.0] 帳票 - 表示項目最新化(ピックロケ表示対象) 2018.04.03 honma Add Start
	public String getPickTLocationCd() {
		return pickTLocationCd;
	}

	public void setPickTLocationCd(String pickTLocationCd) {
		this.pickTLocationCd = pickTLocationCd;
	}

	public String getPickTLocationNm() {
		return pickTLocationNm;
	}

	public void setPickTLocationNm(String pickTLocationNm) {
		this.pickTLocationNm = pickTLocationNm;
	}
	// [#4220][Ver3.0] 帳票 - 表示項目最新化(ピックロケ表示対象) 2018.04.03 honma Add End
}
