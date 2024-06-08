package com.oneslogi.base.dbflute.exentity;

import java.math.BigDecimal;

import com.oneslogi.base.dbflute.bsentity.BsTStoreRecordB;

/**
 * The entity of T_STORE_RECORD_B.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class TStoreRecordB extends BsTStoreRecordB {

	/** Serial version UID. (Default) */
	private static final long serialVersionUID = 1L;

	// ===== chaseメソッド(DBFlute 1.0.5N ⇒ 1.2.0対応) =====

	public TReceivePlanB chaseTReceivePlanB() {
		return _tReceivePlanB != null ? _tReceivePlanB : new TReceivePlanB();
	}

	public TStoreRecordH chaseTStoreRecordH() {
		return _tStoreRecordH != null ? _tStoreRecordH : new TStoreRecordH();
	}

	public MLocation chaseMLocation() {
		return _mLocation != null ? _mLocation : new MLocation();
	}

	// ======================================================

	/** 入庫日From  */
	private String storeDtFrom;

	/** 入庫日To  */
	private String storeDtTo;

	/** 入庫ケース数 */
	private BigDecimal storeCaseNum;

	/** 入庫バラ数 */
	private BigDecimal storePieceNum;

	/** ケース入数 */
	private Long unitNum;

	public static final String ALIAS_storeLabelNo = "STORE_LABEL_NO";
	/** 入庫ラベルNo. */
	private String storeLabelNo;

	/** 荷主CD */
	private String clientCd;

	/** 荷主略称 */
	private String clientAbbr;

	/** 荷主CD */
	private String centerCd;

	/** 荷主略称*/
	private String centerAbbr;

	/** 倉庫CD*/
	private String warehouseCd;

	/** 倉庫略称 */
	private String warehouseAbbr;

	/** 既存フラグ */
	private String existFlg;

	// [ON推-品向-601] 出力件数制限を追加により発行条件を追加 2015.04.16 kawana Start
	//入庫ラベルNo.(From)
	private String storeLabelNoFrom;

	//入庫ラベルNo.(To)
	private String storeLabelNoTo;
	// [ON推-品向-601] 出力件数制限を追加により発行条件を追加 2015.04.16 kawana End

	//在庫区分CD
	public static final String ALIAS_stockTypeCd = "STOCK_TYPE_CD";
	private String stockTypeCd;

	//在庫区分NM
	public static final String ALIAS_stockTypeNm = "STOCK_TYPE_NM";
	private String stockTypeNm;

	//ロケーションNM
	public static final String ALIAS_locationNm = "LOCATION_NM";
	private String locationNm;

	//ロケーション種別
	public static final String ALIAS_locationType = "LOCATION_TYPE";
	private String locationType;

	// [ON推-品向-568] 期限日を過ぎた商品の行の色を変更 2015.04.27 kawana Start
	// 限界期限日
	private String maxLimitDt;

	// 期限日NGフラグ
	private String limitDtNgFlg;
	// [ON推-品向-568] 期限日を過ぎた商品の行の色を変更 2015.04.27 kawana End

	// [C-CWMS-0032] 入庫ラベル発行の出力フラグ更新 2015.08.20 ki Start
 	// 発行条件
 	private String printCondition;
 	// WMS入荷伝票No
 	private String receiveSlipNo;
 	// 顧客入荷指示No
 	private String clientReceiveNo;
 	// [C-CWMS-0032] 入庫ラベル発行の出力フラグ更新 2015.08.20 ki End

 	// [ON推-品向-1154] マージしない商品の入庫数追加が出来ない問題を修正 2016.05.12 kawana Start
 	// 入庫数のみ更新フラグ
 	private boolean isUpdateOnlyStoreNum;
 	// [ON推-品向-1154] マージしない商品の入庫数追加が出来ない問題を修正 2016.05.12 kawana End

	//[Ver3.0][#3113]複数荷姿対応 2017.12.05 miyabe Start
 	//予定内訳
 	private String planBreakdown;
 	//入数内訳
 	private String unitNumBreakdown;
 	//商品単位
 	private String productUnit;
	//[Ver3.0][#3113]複数荷姿対応 2017.12.05 miyabe End

	public String getStoreLabelNo() {
		return storeLabelNo;
	}

	public void setStoreLabelNo(String storeLabelNo) {
		this.storeLabelNo = storeLabelNo;
	}

	public String getStockTypeCd() {
		return stockTypeCd;
	}

	public void setStockTypeCd(String stockTypeCd) {
		this.stockTypeCd = stockTypeCd;
	}

	public String getStockTypeNm() {
		return stockTypeNm;
	}

	public void setStockTypeNm(String stockTypeNm) {
		this.stockTypeNm = stockTypeNm;
	}

	public String getLocationNm() {
		return locationNm;
	}

	public void setLocationNm(String locationNm) {
		this.locationNm = locationNm;
	}

	public String getLocationType() {
		return locationType;
	}

	public void setLocationType(String locationType) {
		this.locationType = locationType;
	}

	public String getExistFlg() {
		return existFlg;
	}

	public void setExistFlg(String existFlg) {
		this.existFlg = existFlg;
	}

	public String getStoreDtFrom() {
		return storeDtFrom;
	}

	public void setStoreDtFrom(String storeDtFrom) {
		this.storeDtFrom = storeDtFrom;
	}

	public String getStoreDtTo() {
		return storeDtTo;
	}

	public void setStoreDtTo(String storeDtTo) {
		this.storeDtTo = storeDtTo;
	}

	public Long getUnitNum() {
		return unitNum;
	}

	public void setUnitNum(Long unitNum) {
		this.unitNum = unitNum;
	}

	public BigDecimal getStoreCaseNum() {
		return storeCaseNum;
	}

	public void setStoreCaseNum(BigDecimal storeCaseNum) {
		this.storeCaseNum = storeCaseNum;
	}

	public BigDecimal getStorePieceNum() {
		return storePieceNum;
	}

	public void setStorePieceNum(BigDecimal storePieceNum) {
		this.storePieceNum = storePieceNum;
	}

	public String getClientCd() {
		return clientCd;
	}

	public void setClientCd(String clientCd) {
		this.clientCd = clientCd;
	}

	public String getClientAbbr() {
		return clientAbbr;
	}

	public void setClientAbbr(String clientAbbr) {
		this.clientAbbr = clientAbbr;
	}

	public String getCenterAbbr() {
		return centerAbbr;
	}

	public void setCenterAbbr(String centerAbbr) {
		this.centerAbbr = centerAbbr;
	}

	public String getWarehouseAbbr() {
		return warehouseAbbr;
	}

	public void setWarehouseAbbr(String warehouseAbbr) {
		this.warehouseAbbr = warehouseAbbr;
	}

	public String getCenterCd() {
		return centerCd;
	}

	public void setCenterCd(String centerCd) {
		this.centerCd = centerCd;
	}

	public String getWarehouseCd() {
		return warehouseCd;
	}

	public void setWarehouseCd(String warehouseCd) {
		this.warehouseCd = warehouseCd;
	}

	public String getStoreLabelNoFrom() {
		return storeLabelNoFrom;
	}

	public void setStoreLabelNoFrom(String storeLabelNoFrom) {
		this.storeLabelNoFrom = storeLabelNoFrom;
	}

	public String getStoreLabelNoTo() {
		return storeLabelNoTo;
	}

	public void setStoreLabelNoTo(String storeLabelNoTo) {
		this.storeLabelNoTo = storeLabelNoTo;
	}

	public String getMaxLimitDt() {
		return maxLimitDt;
	}

	public void setMaxLimitDt(String maxLimitDt) {
		this.maxLimitDt = maxLimitDt;
	}

	public String getLimitDtNgFlg() {
		return limitDtNgFlg;
	}

	public void setLimitDtNgFlg(String limitDtNgFlg) {
		this.limitDtNgFlg = limitDtNgFlg;
	}

	// [C-CWMS-0032] 入庫ラベル発行の出力フラグ更新 2015.08.20 ki Start
 	public String getPrintCondition() {
 		return printCondition;
 	}

 	public void setPrintCondition(String printCondition) {
 		this.printCondition = printCondition;
 	}

 	public String getReceiveSlipNo() {
 		return receiveSlipNo;
 	}

 	public void setReceiveSlipNo(String receiveSlipNo) {
 		this.receiveSlipNo = receiveSlipNo;
 	}

 	public String getClientReceiveNo() {
 		return clientReceiveNo;
 	}

 	public void setClientReceiveNo(String clientReceiveNo) {
 		this.clientReceiveNo = clientReceiveNo;
 	}
    // [C-CWMS-0032] 入庫ラベル発行の出力フラグ更新 2015.08.20 ki End

	public boolean isUpdateOnlyStoreNum() {
		return isUpdateOnlyStoreNum;
	}

	public void setUpdateOnlyStoreNum(boolean isUpdateOnlyStoreNum) {
		this.isUpdateOnlyStoreNum = isUpdateOnlyStoreNum;
	}

	public String getPlanBreakdown() {
	    return planBreakdown;
	}

	public void setPlanBreakdown(String planBreakdown) {
	    this.planBreakdown = planBreakdown;
	}

	public String getUnitNumBreakdown() {
	    return unitNumBreakdown;
	}

	public void setUnitNumBreakdown(String unitNumBreakdown) {
	    this.unitNumBreakdown = unitNumBreakdown;
	}

	public String getProductUnit() {
	    return productUnit;
	}

	public void setProductUnit(String productUnit) {
	    this.productUnit = productUnit;
	}
}
