package com.oneslogi.wms.dto.report;

import java.math.BigDecimal;

import com.oneslogi.base.dto.ReportDto;

public class StockReplenishLabelDto extends ReportDto {

	//帳票名称
	public String reportNm;

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

	// [Ver3.0] unit of measure対応 2017.11.28 REN Start
	//入数
	private String stringUnitNum;

	//内訳
	private String breakdown;

	//最小梱包単位
	private String minimumPackingUnit;
	// [Ver3.0] unit of measure対応 2017.11.28 REN End

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

	//入庫ラベルNo.(入庫:移動先)
	public String storeLabelNo;

	//[ON推-品向-1081]修正対応 2016.4.13 chou Add Start
	//入庫ラベルNo.(出庫:移動元)
	public String outStoreLabelNo;

	//指示元バッチNo.
	public String sourceBatchNo;
	//[ON推-品向-1081]修正対応 2016.4.13 chou Add End

	//[ON推-品質問題点指摘票(新ｿﾘV2-061)] 修正対応 2016.08.23 chou Add Start
	//入庫日
	public String storeDt;
	//[ON推-品質問題点指摘票(新ｿﾘV2-061)] 修正対応 2016.08.23 chou Add End

	//入庫No.
	public Long storeNo;

	public String printCondition;

	public String userCd;

	//出庫	ロケ
	public String outTLocationNm;

	//出庫	ロケ
	public String outTLocationCd;

	//入庫	ロケ
	public String inTLocationNm;

	//入庫	ロケ
	public String inTLocationCd;

	//ピックロケ
	public String pickTLocationNm;

	//ピックロケ
	public String pickTLoactionCd;

	//[#3801] 定期補充ラベルの出力順序の調整 ピッキング順序の追加 fujiwara 2018.03.02 Start
	//移動元ピッキング順序
	public Long outPickingOrder;

	//移動先ピッキング順序
	public Long inPickingOrder;
	//[#3801] 定期補充ラベルの出力順序の調整 ピッキング順序の追加 fujiwara 2018.03.02 End

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

	public String getOutTLocationCd() {
		return outTLocationCd;
	}

	public void setOutTLocationCd(String outTLocationCd) {
		this.outTLocationCd = outTLocationCd;
	}

	public String getOutTLocationNm() {
		return outTLocationNm;
	}

	public void setOutTLocationNm(String outTLocationNm) {
		this.outTLocationNm = outTLocationNm;
	}

	public String getInTLocationCd() {
		return inTLocationCd;
	}

	public void setInTLocationCd(String inTLocationCd) {
		this.inTLocationCd = inTLocationCd;
	}

	public String getInTLocationNm() {
		return inTLocationNm;
	}

	public void setInTLocationNm(String inTLocationNm) {
		this.inTLocationNm = inTLocationNm;
	}

	public String getPickTLocationNm() {
		return pickTLocationNm;
	}

	public void setPickTLocationNm(String pickTLocationNm) {
		this.pickTLocationNm = pickTLocationNm;
	}

	public String getPickTLocationCd() {
		return pickTLoactionCd;
	}

	public void setPickTLocationCd(String pickTLoactionCd) {
		this.pickTLoactionCd = pickTLoactionCd;
	}

	public String getOutStoreLabelNo() {
		return outStoreLabelNo;
	}

	public void setOutStoreLabelNo(String outStoreLabelNo) {
		this.outStoreLabelNo = outStoreLabelNo;
	}

	public String getSourceBatchNo() {
		return sourceBatchNo;
	}

	public void setSourceBatchNo(String sourceBatchNo) {
		this.sourceBatchNo = sourceBatchNo;
	}
	//[ON推-品質問題点指摘票(新ｿﾘV2-061)] 修正対応 2016.08.23 chou Add Start
	public String getStoreDt() {
		return storeDt;
	}

	public void setStoreDt(String storeDt) {
		this.storeDt = storeDt;
	}
	//[ON推-品質問題点指摘票(新ｿﾘV2-061)] 修正対応 2016.08.23 chou Add End
	// [Ver3.0] unit of measure対応 2017.11.28 REN Start
	//入数
	public String getStringUnitNum() {
	return stringUnitNum;
	}

	public void setStringUnitNum(String stringUnitNum) {
	this.stringUnitNum = stringUnitNum;
	}

	public String getBreakdown() {
	return breakdown;
	}

	//内訳
	public void setBreakdown(String breakdown) {
	this.breakdown = breakdown;
	}

	//最小梱包単位
	public String getMinimumPackingUnit() {
	return minimumPackingUnit;
	}

	public void setMinimumPackingUnit(String minimumPackingUnit) {
	this.minimumPackingUnit = minimumPackingUnit;
	}
	// [Ver3.0] unit of measure対応 2017.11.28 REN End

	//[#3801] 定期補充ラベルの出力順序の調整 ピッキング順序の追加 fujiwara 2018.03.02 Start
	/**
	 * @return outPickingOrder
	 */
	public Long getOutPickingOrder() {
		return outPickingOrder;
	}

	/**
	 * @param outPickingOrder セットする outPickingOrder
	 */
	public void setOutPickingOrder(Long outPickingOrder) {
		this.outPickingOrder = outPickingOrder;
	}

	/**
	 * @return inPickingOrder
	 */
	public Long getInPickingOrder() {
		return inPickingOrder;
	}

	/**
	 * @param inPickingOrder セットする inPickingOrder
	 */
	public void setInPickingOrder(Long inPickingOrder) {
		this.inPickingOrder = inPickingOrder;
	}
	//[#3801] 定期補充ラベルの出力順序の調整 ピッキング順序の追加 fujiwara 2018.03.02 End
}
