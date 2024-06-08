package com.oneslogi.base.dbflute.dto;

import java.math.BigDecimal;

import net.vvakame.util.jsonpullparser.annotation.JsonKey;

import com.oneslogi.base.dbflute.dto.bs.BsTStoreRecordBDto;

/**
 * The entity of T_STORE_RECORD_B.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class TStoreRecordBDto extends BsTStoreRecordBDto {

	/** Serial version UID. (Default) */
	private static final long serialVersionUID = 1L;

	//入庫日From検索条件等受け渡し用
	/** STORE_DT_FROM: {NotNull, VARCHAR2(8)} */
	@JsonKey
	protected String _storeDtFrom;

	// [C-CWMS-0032] 入庫ラベル発行の出力フラグ更新 2015.08.20 ki Start
	// 発行条件
	private String printCondition;
	// [C-CWMS-0032] 入庫ラベル発行の出力フラグ更新 2015.08.20 ki End

	/**
	 * [get] STORE_DT_FROM: {NotNull, VARCHAR2(8)} <br />
	 * 入庫日From
	 * @return The value of the column 'STORE_DT_FROM'. (NullAllowed)
	 */
	public String getStoreDtFrom() {
		return _storeDtFrom;
	}

	/**
	 * [set] STORE_DT_FROM: {NotNull, VARCHAR2(8)} <br />
	 * 入庫日From
	 * @param storeDtFrom The value of the column 'STORE_DT_FROM'. (NullAllowed)
	 */
	public void setStoreDtFrom(String storeDtFrom) {
		__modifiedProperties.add("storeDtFrom");
		this._storeDtFrom = storeDtFrom;
	}

	//入庫日To検索条件等受け渡し用
	/** STORE_DT_TO: {NotNull, VARCHAR2(8)} */
	@JsonKey
	protected String _storeDtTo;

	/**
	 * [get] STORE_DT_TO: {NotNull, VARCHAR2(8)} <br />
	 * 入庫日To
	 * @return The value of the column 'STORE_DT_TO'. (NullAllowed)
	 */
	public String getStoreDtTo() {
		return _storeDtTo;
	}

	/**
	 * [set] STORE_DT_TO: {NotNull, VARCHAR2(8)} <br />
	 * 入庫日To
	 * @param storeDtTo The value of the column 'STORE_DT_TO'. (NullAllowed)
	 */
	public void setStoreDtTo(String storeDtTo) {
		__modifiedProperties.add("storeDtTo");
		this._storeDtTo = storeDtTo;
	}

	// ===== 導出カラム =====

	// 入庫ケース数
	public static final String ALIAS_storeCaseNum = "STORE_CASE_NUM";
	private BigDecimal storeCaseNum;

	// 入庫バラ数
	public static final String ALIAS_storePieceNum = "STORE_PIECE_NUM";
	private BigDecimal storePieceNum;

	// ケース入数
	public static final String ALIAS_unitNum = "UNIT_NUM";
	private Long unitNum;

	//入庫ラベルNo.
	public static final String ALIAS_storeLabelNo = "STORE_LABEL_NO";
	private String storeLabelNo;

	//既存フラグ
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

	// ===== 以下Eclipse自動生成のアクセサメソッド =====

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

	public BigDecimal getStorePieceNum() {
		return storePieceNum;
	}

	public void setStorePieceNum(BigDecimal storePieceNum) {
		this.storePieceNum = storePieceNum;
	}

	public BigDecimal getStoreCaseNum() {
		return storeCaseNum;
	}

	public void setStoreCaseNum(BigDecimal storeCaseNum) {
		this.storeCaseNum = storeCaseNum;
	}

	public Long getUnitNum() {
		return unitNum;
	}

	public void setUnitNum(Long unitNum) {
		this.unitNum = unitNum;
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
