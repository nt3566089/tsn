package com.oneslogi.base.dbflute.dto;

import com.oneslogi.base.dbflute.dto.bs.BsTStockInoutDto;

/**
 * The entity of T_STOCK_INOUT.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class TStockInoutDto extends BsTStockInoutDto {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    // ===== 導出カラム =====

 	// センタCD
    protected String centerCd;

 	// 処理日(From)
    protected String processDtFrom;

    // 処理日(To)
    protected String processDtTo;

 	// 在庫区分
    protected String stockTypeCd;

 	// 商品CD
    protected String productCd;

 	// 商品名称
    protected String productNm;

	//ロケーションCD（From）
	public String locationCdFrom;

	//ロケーションCD（To）
	public String locationCdTo;

	//JANCD
	public String janCd;

	//ロット
	public String lot;

	//処理区分CD
	public String processTypeCd;

	//期限日(From)
	public String limitDtFrom;

	//期限日(To)
	public String limitDtTo;

	//検索条件から入庫No.分割表示を削除 2016.03.14 ichikawa

	// [#250][ONEsLOGI Cloud/WMS バグ・品質向上対策] アシスト機能不具合修正 2016.11.16 shimizu Start
	//ロケーションNM（From）
	private String locationNmFrom;

	//ロケーションNM（To）
	private String locationNmTo;
	// [#250][ONEsLOGI Cloud/WMS バグ・品質向上対策] アシスト機能不具合修正 2016.11.16 shimizu End

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

    // ===== 以下Eclipse自動生成のアクセサメソッド =====

	public String getProcessTypeCd() {
		return processTypeCd;
	}

	public String getCenterCd() {
		return centerCd;
	}

	public void setCenterCd(String centerCd) {
		this.centerCd = centerCd;
	}

	public void setProcessTypeCd(String processTypeCd) {
		this.processTypeCd = processTypeCd;
	}

	public String getProcessDtFrom() {
		return processDtFrom;
	}

	public String getStockTypeCd() {
		return stockTypeCd;
	}

	public void setStockTypeCd(String stockTypeCd) {
		this.stockTypeCd = stockTypeCd;
	}

	public String getProductCd() {
		return productCd;
	}

	public void setProductCd(String productCd) {
		this.productCd = productCd;
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

	public String getProductNm() {
		return productNm;
	}

	public void setProductNm(String productNm) {
		this.productNm = productNm;
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

	// [#250][ONEsLOGI Cloud/WMS バグ・品質向上対策] アシスト機能不具合修正 2016.11.16 shimizu Start
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
	// [#250][ONEsLOGI Cloud/WMS バグ・品質向上対策] アシスト機能不具合修正 2016.11.16 shimizu End

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
