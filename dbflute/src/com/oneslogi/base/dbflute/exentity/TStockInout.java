package com.oneslogi.base.dbflute.exentity;

import com.oneslogi.base.dbflute.bsentity.BsTStockInout;

/**
 * The entity of T_STOCK_INOUT.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class TStockInout extends BsTStockInout {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

	// ===== chaseメソッド(DBFlute 1.0.5N ⇒ 1.2.0対応) =====

	public TAllocInstB chaseTAllocInstB() {
		return _tAllocInstB != null ? _tAllocInstB : new TAllocInstB();
	}

	public TMoveRecordB chaseTMoveRecordB() {
		return _tMoveRecordB != null ? _tMoveRecordB : new TMoveRecordB();
	}

	public TStoreRecordB chaseTStoreRecordB() {
		return _tStoreRecordB != null ? _tStoreRecordB : new TStoreRecordB();
	}

	// ======================================================

    // ===== 導出カラム =====

 	// センタCD
    protected String centerCd;

 	// 処理日(From)
    protected String processDtFrom;;

    // 処理日(To)
    protected String processDtTo;

    // ロケーションCD（From）
    protected String locationCdFrom;

    // ロケーションCD（To）
    protected String locationCdTo;

 	// 商品CD
    protected String productCd;

 	// 商品名称
    protected String productNm;

	//JANCD
	public String janCd;

	//ロット
	public String lot;

	//期限日(From)
	public String limitDtFrom;

	//期限日(To)
	public String limitDtTo;

	// [Ver3.0] unit of measure対応 2017.11.29 駱 Del

    // [Ver3.0] unit of measure対応 2017.11.29 駱 Start
    /** 商品単位 */
    private String productUnit;

    /** 入数内訳 */
    private String unitNumBreakdown;

    /** 前残内訳 */
    private String preChargeBreakdown;

    /** 受入内訳 */
    private String stockInBreakdown;

    /** 払出内訳 */
    private String stockOutBreakdown;

    /** 当日在庫内訳 */
    private String chargeBreakdown;
    // [Ver3.0] unit of measure対応 2017.11.29 駱 End
 	// 区分フラグ
    protected String sameFlg;

	/** 定数:処理日 */
	public static final String ALIAS_PROCESSDT = "MAX_PROCESS_DT";

    protected String maxProcessDt;

  //検索条件から入庫No.分割表示を削除 2016.03.14 ichikawa

	/**
	 * @return maxProcessDt
	 */
	public String getMaxProcessDt() {
		return maxProcessDt;
	}

	/**
	 * @param maxProcessDt セットする maxProcessDt
	 */
	public void setMaxProcessDt(String maxProcessDt) {
		this.maxProcessDt = maxProcessDt;
	}
    // ===== 以下Eclipse自動生成のアクセサメソッド =====

	public String getJanCd() {
		return janCd;
	}

	public void setJanCd(String janCd) {
		this.janCd = janCd;
	}

	public String getLot() {
		return lot;
	}

	public void setLot(String lot) {
		this.lot = lot;
	}

	public String getProcessDtFrom() {
		return processDtFrom;
	}

	public String getCenterCd() {
		return centerCd;
	}

	public void setCenterCd(String centerCd) {
		this.centerCd = centerCd;
	}

	public void setProcessDtFrom(String processDtFrom) {
		this.processDtFrom = processDtFrom;
	}

	public String getProcessDtTo() {
		return processDtTo;
	}

	public void setProcessDtTo(String processDtTo) {
		this.processDtTo = processDtTo;
	}

	public String getLocationCdTo() {
		return locationCdTo;
	}

	public void setLocationCdTo(String locationCdTo) {
		this.locationCdTo = locationCdTo;
	}

	public String getLocationCdFrom() {
		return locationCdFrom;
	}

	public void setLocationCdFrom(String locationCdFrom) {
		this.locationCdFrom = locationCdFrom;
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

	// [Ver3.0] unit of measure対応 2017.11.29 駱 Del

	public String getSameFlg() {
		return sameFlg;
	}

	public void setSameFlg(String sameFlg) {
		this.sameFlg = sameFlg;
	}

	// [Ver3.0] unit of measure対応 2017.11.29 駱 Start
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

	public String getPreChargeBreakdown() {
		return preChargeBreakdown;
	}

	public void setPreChargeBreakdown(String preChargeBreakdown) {
		this.preChargeBreakdown = preChargeBreakdown;
	}

	public String getStockInBreakdown() {
		return stockInBreakdown;
	}

	public void setStockInBreakdown(String stockInBreakdown) {
		this.stockInBreakdown = stockInBreakdown;
	}

	public String getStockOutBreakdown() {
		return stockOutBreakdown;
	}

	public void setStockOutBreakdown(String stockOutBreakdown) {
		this.stockOutBreakdown = stockOutBreakdown;
	}

	public String getChargeBreakdown() {
		return chargeBreakdown;
	}

	public void setChargeBreakdown(String chargeBreakdown) {
		this.chargeBreakdown = chargeBreakdown;
	}
	// [Ver3.0] unit of measure対応 2017.11.29 駱 End
}
