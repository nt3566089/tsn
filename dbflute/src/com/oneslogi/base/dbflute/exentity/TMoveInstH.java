package com.oneslogi.base.dbflute.exentity;

import java.math.BigDecimal;

import com.oneslogi.base.dbflute.bsentity.BsTMoveInstH;

/**
 * The entity of T_MOVE_INST_H.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class TMoveInstH extends BsTMoveInstH {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

	// ===== chaseメソッド(DBFlute 1.0.5N ⇒ 1.2.0対応) =====

	public MCenter chaseMCenter() {
		return _mCenter != null ? _mCenter : new MCenter();
	}

	public MClient chaseMClient() {
		return _mClient != null ? _mClient : new MClient();
	}

	public TMoveInstR chaseTMoveInstRAsOne() {
		return _tMoveInstRAsOne != null ? _tMoveInstRAsOne : new TMoveInstR();
	}

	// ======================================================

    // セット品について、画面新規 2015.11.09 hayashi Start
    //[ON推-品向-1081]修正対応 2016.4.12 chou Del

	// 倉庫CD(入庫)
	public static final String ALIAS_warehouseCd = "WAREHOUSE_CD";
	private String warehouseCd;

	// 倉庫名称(入庫)
	public static final String ALIAS_warehouseNm = "WAREHOUSE_NM";
	private String warehouseNm;

	// 倉庫ID
	private Long warehouseId;

	// 指示日From
	private String instDtFrom;

	// 指示日To
	private String instDtTo;
	// セット品について、画面新規 2015.11.09 hayashi End

	//[ON推-品向-1081] 検索条件に項目を追加 2016.4.11 chou Add Start
	//商品ID(入庫)
	public static final String ALIAS_productId = "PRODUCT_ID";
	private Long productId;

	//商品CD(入庫)
	public static final String ALIAS_productCd = "PRODUCT_CD";
	private String productCd;

	//商品名称(入庫)
	public static final String ALIAS_productNm = "PRODUCT_NM";
	private String productNm;

	//商品ID(出庫)
	public static final String ALIAS_outProductId = "OUT_PRODUCT_ID";
	private Long outProductId;

	//商品CD(出庫)
	public static final String ALIAS_outProductCd = "OUT_PRODUCT_CD";
	private String outProductCd;

	//商品名称(出庫)
	public static final String ALIAS_outProductNm = "OUT_PRODUCT_NM";
	private String outProductNm;

	//発行状況
	private String printCondition;

	//出庫ロケーション名称
	public static final String ALIAS_pickingLocationNm = "PICKING_LOCATION_NM";
	private String pickingLocationNm;

	//入庫ロケーション名称
	public static final String ALIAS_storeLocationNm = "STORE_LOCATION_NM";
	private String storeLocationNm;


	// [Ver3.0] unit of measure対応 2017.11.28 REN Del
	// [Ver3.0] unit of measure対応 2017.11.28 REN Start
	// 商品単位
	private String productUnit;

	// 入数内訳
	private String unitNumBreakdown;

	// 指示内訳
	private String instBreakdown;

	// [Ver3.0] unit of measure対応 2017.11.28 REN End

	//指示総数(入庫)
 	public static final String ALIAS_instTotalNum = "INST_TOTAL_NUM";
	private BigDecimal instTotalNum;

	//指示総数(出庫)
 	public static final String ALIAS_outInstTotalNum = "OUT_INST_TOTAL_NUM";
	private BigDecimal outInstTotalNum;

	//移動元入庫ラベルNo.
	public static final String ALIAS_moveSourceStoreLabelNo = "MOVE_SOURCE_STORE_LABEL_NO";
	private String moveSourceStoreLabelNo;

	// 倉庫CD(出庫)
	public static final String ALIAS_outWarehouseCd = "OUT_WAREHOUSE_CD";
	private String outWarehouseCd;

	// 倉庫名称(出庫)
	public static final String ALIAS_outWarehouseNm = "OUT_WAREHOUSE_NM";
	private String outWarehouseNm;

	//[ON推-品向-1081] 検索条件に項目を追加 2016.4.11 chou Add End

	// [ON推-品向-1143] 在庫移動一覧 - 未完了のみ表示 追加 2016.04.28 kawana Start
	// 未完了のみ表示フラグ
	private String notCompletedFlg;
	// [ON推-品向-1143] 在庫移動一覧 - 未完了のみ表示 追加 2016.04.28 kawana End

	//[ON推-品向-1081]修正対応 2016.4.12 chou Del

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
	public Long getWarehouseId() {
		return warehouseId;
	}
	public void setWarehouseId(Long warehouseId) {
		this.warehouseId = warehouseId;
	}
	public String getInstDtFrom() {
		return instDtFrom;
	}
	public void setInstDtFrom(String instDtFrom) {
		this.instDtFrom = instDtFrom;
	}
	public String getInstDtTo() {
		return instDtTo;
	}
	public void setInstDtTo(String instDtTo) {
		this.instDtTo = instDtTo;
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
