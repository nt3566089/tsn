package com.oneslogi.base.dbflute.dto;

import java.math.BigDecimal;

import com.oneslogi.base.dbflute.dto.bs.BsTMoveInstHDto;

/**
 * The entity of T_MOVE_INST_H.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class TMoveInstHDto extends BsTMoveInstHDto {

	/** Serial version UID. (Default) */
	private static final long serialVersionUID = 1L;

	// セット品について、画面新規 2015.11.09 hayashi Start
	// 指示日From
	private String _instDtFrom;
	// 指示日From
	private String _instDtTo;
	//[ON推-品向-1081]修正対応 2016.4.12 chou Del

	// 倉庫CD(入庫)
	private String _warehouseCd;
	// 倉庫名称(入庫)
	private String _warehouseNm;
	// セット品について、画面新規 2015.11.09 hayashi End

	//[ON推-品向-1081] 検索条件に項目を追加 2016.4.11 chou Add Start
	//商品ID(入庫)
	private Long productId;
	//商品CD(入庫)
	private String productCd;
	//商品名称(入庫)
	private String productNm;
	//商品ID(出庫)
	private Long outProductId;
	//商品CD(出庫)
	private String outProductCd;
	//商品名称(出庫)
	private String outProductNm;
	//発行状況
	private String printCondition;
	//出庫ロケーション名称
	private String pickingLocationNm;
	//入庫ロケーション名称
	private String storeLocationNm;

	// [Ver3.0] unit of measure対応 2017.11.28 REN Del

	//指示総数(入庫)
	private BigDecimal instTotalNum;
	//指示総数(出庫)
	private BigDecimal outInstTotalNum;
	//移動元入庫ラベルNo.
	private String moveSourceStoreLabelNo;
	// 倉庫CD(出庫)
	private String outWarehouseCd;
	// 倉庫名称(出庫)
	private String outWarehouseNm;
	//[ON推-品向-1081] 検索条件に項目を追加 2016.4.11 chou Add End
	// [Ver3.0] unit of measure対応 2017.11.28 REN Start
	// 商品単位
	private String productUnit;

	// 入数内訳
	private String unitNumBreakdown;

	// 指示内訳
	private String instBreakdown;

	// [Ver3.0] unit of measure対応 2017.11.28 REN End
	// [ON推-品向-1143] 在庫移動一覧 - 未完了のみ表示 追加 2016.04.28 kawana Start
	// 未完了のみ表示フラグ
	private String notCompletedFlg;
	// [ON推-品向-1143] 在庫移動一覧 - 未完了のみ表示 追加 2016.04.28 kawana End

	public String getInstDtTo() {
		return _instDtTo;
	}

	public String getInstDtFrom() {
		return _instDtFrom;
	}

	public void setInstDtFrom(String instDtFrom) {
		__modifiedProperties.add("_instDtFrom");
		this._instDtFrom = instDtFrom;
	}

	public void setInstDtTo(String instDtTo) {
		__modifiedProperties.add("_instDtTo");
		this._instDtTo = instDtTo;
	}

	//[ON推-品向-1081]修正対応 2016.4.12 chou Del

	// [Ver3.0] unit of measure対応 2017.11.28 REN Start
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

	// [Ver3.0] unit of measure対応 2017.11.28 REN End

	public String getWarehouseCd() {
		return _warehouseCd;
	}

	public void setWarehouseCd(String warehouseCd) {
		__modifiedProperties.add("_warehouseCd");
		this._warehouseCd = warehouseCd;
	}

	public String getWarehouseNm() {
		return _warehouseNm;
	}

	public void setWarehouseNm(String warehouseNm) {
		__modifiedProperties.add("_warehouseNm");
		this._warehouseNm = warehouseNm;
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

	public String getPrintCondition() {
		return printCondition;
	}

	public void setPrintCondition(String printCondition) {
		this.printCondition = printCondition;
	}

	// [Ver3.0] unit of measure対応 2017.11.28 REN Del

	public BigDecimal getInstTotalNum() {
		return instTotalNum;
	}

	public void setInstTotalNum(BigDecimal instTotalNum) {
		this.instTotalNum = instTotalNum;
	}

	public String getMoveSourceStoreLabelNo() {
		return moveSourceStoreLabelNo;
	}

	public void setMoveSourceStoreLabelNo(String moveSourceStoreLabelNo) {
		this.moveSourceStoreLabelNo = moveSourceStoreLabelNo;
	}

	public String getPickingLocationNm() {
		return pickingLocationNm;
	}

	public void setPickingLocationNm(String pickingLocationNm) {
		this.pickingLocationNm = pickingLocationNm;
	}

	public String getStoreLocationNm() {
		return storeLocationNm;
	}

	public void setStoreLocationNm(String storeLocationNm) {
		this.storeLocationNm = storeLocationNm;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getOutWarehouseCd() {
		return outWarehouseCd;
	}

	public void setOutWarehouseCd(String outWarehouseCd) {
		this.outWarehouseCd = outWarehouseCd;
	}

	public BigDecimal getOutInstTotalNum() {
		return outInstTotalNum;
	}

	public void setOutInstTotalNum(BigDecimal outInstTotalNum) {
		this.outInstTotalNum = outInstTotalNum;
	}

	public String getOutWarehouseNm() {
		return outWarehouseNm;
	}

	public void setOutWarehouseNm(String outWarehouseNm) {
		this.outWarehouseNm = outWarehouseNm;
	}

	public Long getOutProductId() {
		return outProductId;
	}

	public void setOutProductId(Long outProductId) {
		this.outProductId = outProductId;
	}

	public String getOutProductCd() {
		return outProductCd;
	}

	public void setOutProductCd(String outProductCd) {
		this.outProductCd = outProductCd;
	}

	public String getOutProductNm() {
		return outProductNm;
	}

	public void setOutProductNm(String outProductNm) {
		this.outProductNm = outProductNm;
	}

	public String getNotCompletedFlg() {
		return notCompletedFlg;
	}

	public void setNotCompletedFlg(String notCompletedFlg) {
		this.notCompletedFlg = notCompletedFlg;
	}

}
