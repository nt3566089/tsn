package com.oneslogi.wms.dto.report;

import java.math.BigDecimal;

import com.oneslogi.base.dto.ReportDto;
public class StockSetInstListDto extends ReportDto {

	//帳票CD
	public String reportCd;
	//画面CD
	public String pgmCd;
	//WMS在庫移動伝票No
	public String moveSlipNo;
	//荷主

	public String clientCd;
	//荷主名称
	public String clientNm;
	//センタCD
	public String centerCd;
	//センタ名称
	public String centerNm;
	//倉庫ID
	public String warehouseCd;
	//倉庫名称
	public String warehouseNm;
	//親商品CD
	public String productCdH;
	//親商品名称
	public String productNmH;
	//預託CD
	public String depositCdH;
	//預託名称
	public String depositNmH;
	//在庫区分
	public String stockTypeCdH;
	//在庫区分名称
	public String stockTypeNmH;
	//ロケーションCD
	public String locationCdH;
	//ロケーション名称
	public String locationNmH;
	//数量
	public BigDecimal instNumH;
	//ロット
	public String lotH;
	//期限日
	public String limitDtH;
	//入庫日
	public String storeDtH;

	//構成品CD
	public String productCd;
	//構成品名称
	public String productNm;
	//構成数
	public Long unitNum;
	// [#3110] 帳票レイアウト変更 jancd表示の統一 2018.01.26 fujiwara Start
	//JANCD
	public String janCd;
	// [#3110] 帳票レイアウト変更 jancd表示の統一 2018.01.26 fujiwara End
	//入庫ラベルNo.
	public String storeLabelNo;
	//預託CD
	public String depositCd;
	//預託名称
	public String depositNm;
	//在庫区分
	public String stockTypeCd;
	//在庫区分名称
	public String stockTypeNm;
	//ピッキング順序
	public Long pickingOrder;
	//ロケーションCD
	public String locationCd;
	//ロケーション名称
	public String locationNm;
	//入庫日
	public String storeDt;
	//期限日
	public String limitDt;
	//ロット
	public String lot;
	//指示数
	public BigDecimal instNum;
	//引当可能数
	public BigDecimal chargeNum;
	// [#3612][Ver3.0] セット組/解除指示書への荷姿単位追加 2018.02.22 honma Add Start
	public String minimumPackingUnit;
	// [#3612][Ver3.0] セット組/解除指示書への荷姿単位追加 2018.02.22 honma Add End
	//同じ商品一行目フラグ
	public String isFirstFlg;
	//同じ商品最後行フラグ
	public String isLastFlg;
	/**
	 * @return the cultureId
	 */
	public Long getCultureId() {
		return cultureId;
	}
	/**
	 * @param cultureId the cultureId to set
	 */
	public void setCultureId(Long cultureId) {
		this.cultureId = cultureId;
	}
	/**
	 * @return the reportCd
	 */
	public String getReportCd() {
		return reportCd;
	}
	/**
	 * @param reportCd the reportCd to set
	 */
	public void setReportCd(String reportCd) {
		this.reportCd = reportCd;
	}
	/**
	 * @return the pgmCd
	 */
	public String getPgmCd() {
		return pgmCd;
	}
	/**
	 * @param pgmCd the pgmCd to set
	 */
	public void setPgmCd(String pgmCd) {
		this.pgmCd = pgmCd;
	}
	/**
	 * @return the moveSlipNo
	 */
	public String getMoveSlipNo() {
		return moveSlipNo;
	}
	/**
	 * @param moveSlipNo the moveSlipNo to set
	 */
	public void setMoveSlipNo(String moveSlipNo) {
		this.moveSlipNo = moveSlipNo;
	}
	/**
	 * @return the clientCd
	 */
	public String getClientCd() {
		return clientCd;
	}
	/**
	 * @param clientCd the clientCd to set
	 */
	public void setClientCd(String clientCd) {
		this.clientCd = clientCd;
	}
	/**
	 * @return the clientNm
	 */
	public String getClientNm() {
		return clientNm;
	}
	/**
	 * @param clientNm the clientNm to set
	 */
	public void setClientNm(String clientNm) {
		this.clientNm = clientNm;
	}
	/**
	 * @return the centerCd
	 */
	public String getCenterCd() {
		return centerCd;
	}
	/**
	 * @param centerCd the centerCd to set
	 */
	public void setCenterCd(String centerCd) {
		this.centerCd = centerCd;
	}
	/**
	 * @return the centerNm
	 */
	public String getCenterNm() {
		return centerNm;
	}
	/**
	 * @param centerNm the centerNm to set
	 */
	public void setCenterNm(String centerNm) {
		this.centerNm = centerNm;
	}
	/**
	 * @return the warehouseCd
	 */
	public String getWarehouseCd() {
		return warehouseCd;
	}
	/**
	 * @param warehouseCd the warehouseCd to set
	 */
	public void setWarehouseCd(String warehouseCd) {
		this.warehouseCd = warehouseCd;
	}
	/**
	 * @return the warehouseNm
	 */
	public String getWarehouseNm() {
		return warehouseNm;
	}
	/**
	 * @param warehouseNm the warehouseNm to set
	 */
	public void setWarehouseNm(String warehouseNm) {
		this.warehouseNm = warehouseNm;
	}
	/**
	 * @return the productCdH
	 */
	public String getProductCdH() {
		return productCdH;
	}
	/**
	 * @param productCdH the productCdH to set
	 */
	public void setProductCdH(String productCdH) {
		this.productCdH = productCdH;
	}
	/**
	 * @return the productNmH
	 */
	public String getProductNmH() {
		return productNmH;
	}
	/**
	 * @param productNmH the productNmH to set
	 */
	public void setProductNmH(String productNmH) {
		this.productNmH = productNmH;
	}
	/**
	 * @return the depositCdH
	 */
	public String getDepositCdH() {
		return depositCdH;
	}
	/**
	 * @param depositCdH the depositCdH to set
	 */
	public void setDepositCdH(String depositCdH) {
		this.depositCdH = depositCdH;
	}
	/**
	 * @return the depositNmH
	 */
	public String getDepositNmH() {
		return depositNmH;
	}
	/**
	 * @param depositNmH the depositNmH to set
	 */
	public void setDepositNmH(String depositNmH) {
		this.depositNmH = depositNmH;
	}
	/**
	 * @return the stockTypeCdH
	 */
	public String getStockTypeCdH() {
		return stockTypeCdH;
	}
	/**
	 * @param stockTypeCdH the stockTypeCdH to set
	 */
	public void setStockTypeCdH(String stockTypeCdH) {
		this.stockTypeCdH = stockTypeCdH;
	}
	/**
	 * @return the stockTypeNmH
	 */
	public String getStockTypeNmH() {
		return stockTypeNmH;
	}
	/**
	 * @param stockTypeNmH the stockTypeNmH to set
	 */
	public void setStockTypeNmH(String stockTypeNmH) {
		this.stockTypeNmH = stockTypeNmH;
	}
	/**
	 * @return the locationCdH
	 */
	public String getLocationCdH() {
		return locationCdH;
	}
	/**
	 * @param locationCdH the locationCdH to set
	 */
	public void setLocationCdH(String locationCdH) {
		this.locationCdH = locationCdH;
	}
	/**
	 * @return the locationNmH
	 */
	public String getLocationNmH() {
		return locationNmH;
	}
	/**
	 * @param locationNmH the locationNmH to set
	 */
	public void setLocationNmH(String locationNmH) {
		this.locationNmH = locationNmH;
	}
	/**
	 * @return the instNumH
	 */
	public BigDecimal getInstNumH() {
		return instNumH;
	}
	/**
	 * @param instNumH the instNumH to set
	 */
	public void setInstNumH(BigDecimal instNumH) {
		this.instNumH = instNumH;
	}
	/**
	 * @return the lotH
	 */
	public String getLotH() {
		return lotH;
	}
	/**
	 * @param lotH the lotH to set
	 */
	public void setLotH(String lotH) {
		this.lotH = lotH;
	}
	/**
	 * @return the limitDtH
	 */
	public String getLimitDtH() {
		return limitDtH;
	}
	/**
	 * @param limitDtH the limitDtH to set
	 */
	public void setLimitDtH(String limitDtH) {
		this.limitDtH = limitDtH;
	}
	/**
	 * @return the storeDtH
	 */
	public String getStoreDtH() {
		return storeDtH;
	}
	/**
	 * @param storeDtH the storeDtH to set
	 */
	public void setStoreDtH(String storeDtH) {
		this.storeDtH = storeDtH;
	}
	/**
	 * @return the productCd
	 */
	public String getProductCd() {
		return productCd;
	}
	/**
	 * @param productCd the productCd to set
	 */
	public void setProductCd(String productCd) {
		this.productCd = productCd;
	}
	/**
	 * @return the productNm
	 */
	public String getProductNm() {
		return productNm;
	}
	/**
	 * @param productNm the productNm to set
	 */
	public void setProductNm(String productNm) {
		this.productNm = productNm;
	}
	/**
	 * @return the unitNum
	 */
	public Long getUnitNum() {
		return unitNum;
	}
	/**
	 * @param unitNum the unitNum to set
	 */
	public void setUnitNum(Long unitNum) {
		this.unitNum = unitNum;
	}
	// [#3110] 帳票レイアウト変更 jancd表示の統一 2018.01.26 fujiwara Start
	/**
	 * @return the janCd
	 */
	public String getJanCd() {
		return janCd;
	}
	/**
	 * @param janCd the janCd to set
	 */
	public void setJanCd(String janCd) {
		this.janCd = janCd;
	}
	// [#3110] 帳票レイアウト変更 jancd表示の統一 2018.01.26 fujiwara End

	/**
	 * @return the storeLabelNo
	 */
	public String getStoreLabelNo() {
		return storeLabelNo;
	}
	/**
	 * @param storeLabelNo the storeLabelNo to set
	 */
	public void setStoreLabelNo(String storeLabelNo) {
		this.storeLabelNo = storeLabelNo;
	}
	/**
	 * @return the depositCd
	 */
	public String getDepositCd() {
		return depositCd;
	}
	/**
	 * @param depositCd the depositCd to set
	 */
	public void setDepositCd(String depositCd) {
		this.depositCd = depositCd;
	}
	/**
	 * @return the depositNm
	 */
	public String getDepositNm() {
		return depositNm;
	}
	/**
	 * @param depositNm the depositNm to set
	 */
	public void setDepositNm(String depositNm) {
		this.depositNm = depositNm;
	}
	/**
	 * @return the stockTypeCd
	 */
	public String getStockTypeCd() {
		return stockTypeCd;
	}
	/**
	 * @param stockTypeCd the stockTypeCd to set
	 */
	public void setStockTypeCd(String stockTypeCd) {
		this.stockTypeCd = stockTypeCd;
	}
	/**
	 * @return the stockTypeNm
	 */
	public String getStockTypeNm() {
		return stockTypeNm;
	}
	/**
	 * @param stockTypeNm the stockTypeNm to set
	 */
	public void setStockTypeNm(String stockTypeNm) {
		this.stockTypeNm = stockTypeNm;
	}
	/**
	 * @return the pickingOrder
	 */
	public Long getPickingOrder() {
		return pickingOrder;
	}
	/**
	 * @param pickingOrder the pickingOrder to set
	 */
	public void setPickingOrder(Long pickingOrder) {
		this.pickingOrder = pickingOrder;
	}
	/**
	 * @return the locationCd
	 */
	public String getLocationCd() {
		return locationCd;
	}
	/**
	 * @param locationCd the locationCd to set
	 */
	public void setLocationCd(String locationCd) {
		this.locationCd = locationCd;
	}
	/**
	 * @return the locationNm
	 */
	public String getLocationNm() {
		return locationNm;
	}
	/**
	 * @param locationNm the locationNm to set
	 */
	public void setLocationNm(String locationNm) {
		this.locationNm = locationNm;
	}
	/**
	 * @return the storeDt
	 */
	public String getStoreDt() {
		return storeDt;
	}
	/**
	 * @param storeDt the storeDt to set
	 */
	public void setStoreDt(String storeDt) {
		this.storeDt = storeDt;
	}
	/**
	 * @return the limitDt
	 */
	public String getLimitDt() {
		return limitDt;
	}
	/**
	 * @param limitDt the limitDt to set
	 */
	public void setLimitDt(String limitDt) {
		this.limitDt = limitDt;
	}
	/**
	 * @return the lot
	 */
	public String getLot() {
		return lot;
	}
	/**
	 * @param lot the lot to set
	 */
	public void setLot(String lot) {
		this.lot = lot;
	}
	/**
	 * @return the instNum
	 */
	public BigDecimal getInstNum() {
		return instNum;
	}
	/**
	 * @param instNum the instNum to set
	 */
	public void setInstNum(BigDecimal instNum) {
		this.instNum = instNum;
	}
	/**
	 * @return the chargeNum
	 */
	public BigDecimal getChargeNum() {
		return chargeNum;
	}
	/**
	 * @param chargeNum the chargeNum to set
	 */
	public void setChargeNum(BigDecimal chargeNum) {
		this.chargeNum = chargeNum;
	}
	/**
	 * @return minimumPackingUnit
	 */
	public String getMinimumPackingUnit() {
		return minimumPackingUnit;
	}
	/**
	 * @param minimumPackingUnit the minimumPackingUnit to set
	 */
	public void setMinimumPackingUnit(String minimumPackingUnit) {
		this.minimumPackingUnit = minimumPackingUnit;
	}
	/**
	 * @return the isFirstFlg
	 */
	public String getIsFirstFlg() {
		return isFirstFlg;
	}
	/**
	 * @param isFirstFlg the isFirstFlg to set
	 */
	public void setIsFirstFlg(String isFirstFlg) {
		this.isFirstFlg = isFirstFlg;
	}
	/**
	 * @return the isLastFlg
	 */
	public String getIsLastFlg() {
		return isLastFlg;
	}
	/**
	 * @param isLastFlg the isLastFlg to set
	 */
	public void setIsLastFlg(String isLastFlg) {
		this.isLastFlg = isLastFlg;
	}

}
