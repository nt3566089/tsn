package com.oneslogi.base.dbflute.exentity;

import java.math.BigDecimal;

import com.oneslogi.base.dbflute.bsentity.BsTMoveInstB;

/**
 * The entity of T_MOVE_INST_B.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class TMoveInstB extends BsTMoveInstB {

	/** Serial version UID. (Default) */
	private static final long serialVersionUID = 1L;

	// ===== chaseメソッド(DBFlute 1.0.5N ⇒ 1.2.0対応) =====

	public MCustomer chaseMCustomerByDepositId() {
		return _mCustomerByDepositId != null ? _mCustomerByDepositId : new MCustomer();
	}

	public MLocation chaseMLocation() {
		return _mLocation != null ? _mLocation : new MLocation();
	}

	public MProduct chaseMProduct() {
		return _mProduct != null ? _mProduct : new MProduct();
	}

	public MStockType chaseMStockType() {
		return _mStockType != null ? _mStockType : new MStockType();
	}

	public MWarehouse chaseMWarehouse() {
		return _mWarehouse != null ? _mWarehouse : new MWarehouse();
	}

	public TMoveInstH chaseTMoveInstH() {
		return _tMoveInstH != null ? _tMoveInstH : new TMoveInstH();
	}

	public TStoreNo chaseTStoreNo() {
		return _tStoreNo != null ? _tStoreNo : new TStoreNo();
	}

	// ======================================================

	// ===== 導出カラム =====

	//入庫	ロケ
	private String inTLocationNm;
	//入庫	ロケ
	private String inTLocationCd;
	//出庫	ロケ
	private String outTLocationNm;
	//出庫	ロケ
	private String outTLocationCd;
	// 発行条件
	private String printCondition;
	//調整移動区分
	private String clsMove;

	// [#908] ケース入数が未設定なのにケース数が表示される不具合を修正 2017.01.26 kawana Start

	// 指示ケース数
	private BigDecimal instCaseNum;
	// 指示ピース数
	private BigDecimal instPieceNum;

	// [#908] ケース入数が未設定なのにケース数が表示される不具合を修正 2017.01.26 kawana End

	// セット品について、画面新規 2015.11.09 hayashi Start
	// 指示出庫
	public static final String ALIAS_InstNumOut = "INST_NUM_OUT";
	private BigDecimal instNumOut;

	// [#908] ケース入数が未設定なのにケース数が表示される不具合を修正 2017.01.26 kawana Start

	// 指示出庫ケース数
	private BigDecimal instCaseNumOut;
	// 指示出庫ピース数
	private BigDecimal instPieceNumOut;

	// [#908] ケース入数が未設定なのにケース数が表示される不具合を修正 2017.01.26 kawana End

	// 指示入庫数
	public static final String ALIAS_InstNumIn = "INST_NUM_IN";
	private BigDecimal instNumIn;

	// [#908] ケース入数が未設定なのにケース数が表示される不具合を修正 2017.01.26 kawana Start

	// 指示入庫ケース数
	private BigDecimal instCaseNumIn;
	// 指示入庫ピース数
	private BigDecimal instPieceNumIn;

	// [#908] ケース入数が未設定なのにケース数が表示される不具合を修正 2017.01.26 kawana End

	// 引当可能数
	private BigDecimal chargeNum;
	// セット品について、画面新規 2015.11.09 hayashi End
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
		this.inoutTypeNm = inoutTypeNm;
	}
	// [C-CWMS-0057] 在庫移動明細一覧画面のため 2016.8.15 ATK End

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

	public String getPrintCondition() {
		return printCondition;
	}

	public void setPrintCondition(String printCondition) {
		this.printCondition = printCondition;
	}

	public String getClsMove() {
		return clsMove;
	}

	public void setClsMove(String clsMove) {
		this.clsMove = clsMove;
	}

	public BigDecimal getInstNumOut() {
		return instNumOut;
	}

	public void setInstNumOut(BigDecimal instNumOut) {
		this.instNumOut = instNumOut;
	}

	public BigDecimal getInstNumIn() {
		return instNumIn;
	}

	public void setInstNumIn(BigDecimal instNumIn) {
		this.instNumIn = instNumIn;
	}

	public BigDecimal getInstCaseNum() {
		return instCaseNum;
	}

	public BigDecimal getInstPieceNum() {
		return instPieceNum;
	}

	public BigDecimal getInstCaseNumOut() {
		return instCaseNumOut;
	}

	public BigDecimal getInstPieceNumOut() {
		return instPieceNumOut;
	}

	public BigDecimal getInstCaseNumIn() {
		return instCaseNumIn;
	}

	public BigDecimal getInstPieceNumIn() {
		return instPieceNumIn;
	}

	public void setInstCaseNum(BigDecimal instCaseNum) {
		this.instCaseNum = instCaseNum;
	}

	public void setInstPieceNum(BigDecimal instPieceNum) {
		this.instPieceNum = instPieceNum;
	}

	public void setInstCaseNumOut(BigDecimal instCaseNumOut) {
		this.instCaseNumOut = instCaseNumOut;
	}

	public void setInstPieceNumOut(BigDecimal instPieceNumOut) {
		this.instPieceNumOut = instPieceNumOut;
	}

	public void setInstCaseNumIn(BigDecimal instCaseNumIn) {
		this.instCaseNumIn = instCaseNumIn;
	}

	public void setInstPieceNumIn(BigDecimal instPieceNumIn) {
		this.instPieceNumIn = instPieceNumIn;
	}

	public BigDecimal getChargeNum() {
		return chargeNum;
	}

	public void setChargeNum(BigDecimal chargeNum) {
		this.chargeNum = chargeNum;
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
}
