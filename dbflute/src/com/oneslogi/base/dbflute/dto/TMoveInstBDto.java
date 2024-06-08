package com.oneslogi.base.dbflute.dto;

import java.math.BigDecimal;

import com.oneslogi.base.dbflute.dto.bs.BsTMoveInstBDto;

/**
 * The entity of T_MOVE_INST_B.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class TMoveInstBDto extends BsTMoveInstBDto {

	/** Serial version UID. (Default) */
	private static final long serialVersionUID = 1L;

	// 発行条件
	private String printCondition;

	public String getPrintCondition() {
		return printCondition;
	}

	// ロケーションCD(Ｆｒｏｍ)
	private String locationCdFrom;

	// ロケーションCD(Ｔｏ)
	private String locationCdTo;

	// 期限日From
	private String limitDtFrom;

	// 期限日To
	private String limitDtTo;

	// 入庫日From
	private String storeDtFrom;

	// 入庫日To
	private String storeDtTo;

	// 在庫移動の入庫No分割を削除 2016.03.11 kawana Start
	// 元入庫NoID
	private Long oldStoreNoId;
	// 在庫移動の入庫No分割を削除 2016.03.11 kawana End

	// [C-CWMS-0057] 在庫移動明細一覧画面のため 2016.8.15 ATK Start
	// 入出庫区分名称
	private String inoutTypeNm;

	// [#250][ONEsLOGI Cloud/WMS バグ・品質向上対策] アシスト機能不具合修正 2016.11.16 shimizu Start
	// ロケーションNM(Ｆｒｏｍ)
	private String locationNmFrom;

	// ロケーションNM(Ｔｏ)
	private String locationNmTo;
	// [#250][ONEsLOGI Cloud/WMS バグ・品質向上対策] アシスト機能不具合修正 2016.11.16 shimizu End

	// [#908] ケース入数が未設定なのにケース数が表示される不具合を修正 2017.01.26 kawana Start

	// 指示ケース数
	private Long instCaseNum;
	// 指示ピース数
	private BigDecimal instPieceNum;
	// 指示出庫数
	private BigDecimal instNumOut;
	// 指示出庫ケース数
	private Long instCaseNumOut;
	// 指示出庫ピース数
	private BigDecimal instPieceNumOut;
	// 指示入庫数
	private BigDecimal instNumIn;
	// 指示入庫ケース数
	private Long instCaseNumIn;
	// 指示入庫ピース数
	private BigDecimal instPieceNumIn;

	// [#908] ケース入数が未設定なのにケース数が表示される不具合を修正 2017.01.26 kawana End

	// [Ver3.0] unit of measure対応 2017.11.22 潘 Start
	// 商品単位
		private String productUnit;

	// 入数内訳
	private String unitNumBreakdown;

	// 指示内訳
	private String instBreakdown;

	// 指示出庫内訳
	private String instOutBreakdown;

	// 指示入庫内訳
	private String instInBreakdown;
	// [Ver3.0] unit of measure対応 2017.11.22 潘 End

	// [Ver3.0] unit of measure対応 2017.11.27 REN Start
  	//入数
  	private String stringUnitNum;

  	//内訳
  	private String breakdown;

  	//最小梱包単位
  	private String minimumPackingUnit;
    // [Ver3.0] unit of measure対応 2017.11.27 REN End

	// ===== 以下、ゲッタとセッタ ===================================================

	public String getInoutTypeNm() {
		return inoutTypeNm;
	}

	public void setInoutTypeNm(String inoutTypeNm) {
		__modifiedProperties.add("_inoutTypeNm");
		this.inoutTypeNm = inoutTypeNm;
	}
	// [C-CWMS-0057] 在庫移動明細一覧画面のため 2016.8.15 ATK End

	public void setPrintCondition(String printCondition) {
		this.printCondition = printCondition;
	}

	public String getLocationCdFrom() {
		return locationCdFrom;
	}

	public void setLocationCdFrom(String locationCdFrom) {
		this.locationCdFrom = locationCdFrom;
	}

	public String getLocationCdTo() {
		return locationCdTo;
	}

	public void setLocationCdTo(String locationCdTo) {
		this.locationCdTo = locationCdTo;
	}

	public String getLimitDtFrom() {
		return limitDtFrom;
	}

	public void setLimitDtFrom(String limitDtFrom) {
		this.limitDtFrom = limitDtFrom;
	}

	public String getLimitDtTo() {
		return limitDtTo;
	}

	public void setLimitDtTo(String limitDtTo) {
		this.limitDtTo = limitDtTo;
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

	public Long getOldStoreNoId() {
		return oldStoreNoId;
	}

	public void setOldStoreNoId(Long oldStoreNoId) {
		this.oldStoreNoId = oldStoreNoId;
	}

	public String getLocationNmFrom() {
		return locationNmFrom;
	}

	public void setLocationNmFrom(String locationNmFrom) {
		this.locationNmFrom = locationNmFrom;
	}

	public String getLocationNmTo() {
		return locationNmTo;
	}

	public void setLocationNmTo(String locationNmTo) {
		this.locationNmTo = locationNmTo;
	}

	public Long getInstCaseNum() {
		return instCaseNum;
	}

	public BigDecimal getInstPieceNum() {
		return instPieceNum;
	}

	public BigDecimal getInstNumOut() {
		return instNumOut;
	}

	public Long getInstCaseNumOut() {
		return instCaseNumOut;
	}

	public BigDecimal getInstPieceNumOut() {
		return instPieceNumOut;
	}

	public BigDecimal getInstNumIn() {
		return instNumIn;
	}

	public Long getInstCaseNumIn() {
		return instCaseNumIn;
	}

	public BigDecimal getInstPieceNumIn() {
		return instPieceNumIn;
	}

	public void setInstCaseNum(Long instCaseNum) {
		this.instCaseNum = instCaseNum;
	}

	public void setInstPieceNum(BigDecimal instPieceNum) {
		this.instPieceNum = instPieceNum;
	}

	public void setInstNumOut(BigDecimal instNumOut) {
		this.instNumOut = instNumOut;
	}

	public void setInstCaseNumOut(Long instCaseNumOut) {
		this.instCaseNumOut = instCaseNumOut;
	}

	public void setInstPieceNumOut(BigDecimal instPieceNumOut) {
		this.instPieceNumOut = instPieceNumOut;
	}

	public void setInstNumIn(BigDecimal instNumIn) {
		this.instNumIn = instNumIn;
	}

	public void setInstCaseNumIn(Long instCaseNumIn) {
		this.instCaseNumIn = instCaseNumIn;
	}

	public void setInstPieceNumIn(BigDecimal instPieceNumIn) {
		this.instPieceNumIn = instPieceNumIn;
	}

	// [Ver3.0] unit of measure対応 2017.11.22 潘 Start
	public String getProductUnit() {
		return productUnit;
	}

	public void setProductUnit(String productUnit) {
		this.productUnit = productUnit;
	}

	public String getUnitNumBreakdown() {
		return unitNumBreakdown;
	}

	public void setUnitNumBreakdown(String unitNumBreakdown) {
		this.unitNumBreakdown = unitNumBreakdown;
	}

	public String getInstBreakdown() {
		return instBreakdown;
	}

	public void setInstBreakdown(String instBreakdown) {
		this.instBreakdown = instBreakdown;
	}

	public String getInstOutBreakdown() {
		return instOutBreakdown;
	}

	public void setInstOutBreakdown(String instOutBreakdown) {
		this.instOutBreakdown = instOutBreakdown;
	}

	public String getInstInBreakdown() {
		return instInBreakdown;
	}

	public void setInstInBreakdown(String instInBreakdown) {
		this.instInBreakdown = instInBreakdown;
	}
	// [Ver3.0] unit of measure対応 2017.11.22 潘 End

	// [Ver3.0] unit of measure対応 2017.11.27 REN Start
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
    // [Ver3.0] unit of measure対応 2017.11.27 REN End
}
