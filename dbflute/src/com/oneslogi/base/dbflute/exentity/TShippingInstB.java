package com.oneslogi.base.dbflute.exentity;

import java.math.BigDecimal;

import com.oneslogi.base.dbflute.bsentity.BsTShippingInstB;

/**
 * The entity of T_SHIPPING_INST_B.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class TShippingInstB extends BsTShippingInstB {

	/** Serial version UID. (Default) */
	private static final long serialVersionUID = 1L;

	// ===== chaseメソッド(DBFlute 1.0.5N ⇒ 1.2.0対応) =====

	public MLocation chaseMLocation() {
		return _mLocation != null ? _mLocation : new MLocation();
	}

	public MProduct chaseMProduct() {
		return _mProduct != null ? _mProduct : new MProduct();
	}

	public TShippingInstH chaseTShippingInstH() {
		return _tShippingInstH != null ? _tShippingInstH : new TShippingInstH();
	}

	public TShippingInstSpare chaseTShippingInstSpareAsOne() {
		return _tShippingInstSpareAsOne != null ? _tShippingInstSpareAsOne : new TShippingInstSpare();
	}

	public MCustomer chaseMCustomer() {
		return _mCustomer != null ? _mCustomer : new MCustomer();
	}

	public MShape chaseMShape() {
		return _mShape != null ? _mShape : new MShape();
	}

	public MWarehouse chaseMWarehouse() {
		return _mWarehouse != null ? _mWarehouse : new MWarehouse();
	}

	// ======================================================

	// ===== 導出カラム =====

	// エラーメッセージ
	private String bodyMessageNm;
	//送り状データ作成フラグ
	public static final String ALIAS_invoiceCreateFlg = "INVOICE_CREATE_FLG";
	private String invoiceCreateFlg;
	//積込リスト出力フラグ
	public static final String ALIAS_stwOutFlg = "STW_OUT_FLG";
	private String stwOutFlg;
	//ロケーション名称
	public static final String ALIAS_tpbLocationNm = "TPB_LOCATION_NM";
	private String tpbLocationNm;
	//出庫数(出庫ボディ)
	public static final String ALIAS_tpbPickingNum = "TPB_PICKING_NUM";
	private long tpbPickingNum;
	//ロット
	public static final String ALIAS_tpbLot = "TPB_LOT";
	private String tpbLot;
	//期限日
	public static final String ALIAS_tpbLimitDt = "TPB_LIMIT_DT";
	private String tpbLimitDt;
	//入庫ラベルNo.
	public static final String ALIAS_tpbStoreLabelNo = "TPB_STORE_LABEL_NO";
	private String tpbStoreLabelNo;

	//引当可能数
	private BigDecimal chargeNum;

	// [#5144][v3.1] 欠品フラグを出庫指示ヘッダに移動(stockOutNum削除) 2018.07.27 kawana Delete

	//入庫No.管理フラグ
	private String storeNoFlg;
	//ロット管理フラグ
	private String lotManagFlg;
	//期限日管理フラグ
	private String limitDtManagFlg;

	private BigDecimal oldPickingNum;

	private String depositNm;

	private long shippingInstReceiveId;

	private String stockTypeNm;

	private String warehouseNm;

	private String errorMessageNm;
	//指定倉庫CD
	private String lctWarehouseCd;

    // [Ver3.0] unit of measure対応 2017.11.23 駱 Start

	// 商品単位
	private String productUnit;

	// 入数内訳
	private String unitNumBreakdown;

	// [#3132][Ver3.0] 小数有無フラグを加味した小数点チェック処理について 列型複数荷姿対応のため小数点チェック処理削除 2018.02.19 honma Delete

	// [Ver3.0] unit of measure対応 2017.11.23 駱 End

	// ===== 以下Eclipse自動生成のアクセサメソッド =====

	public String getDepositNm() {
		return depositNm;
	}

	public String getLctWarehouseCd() {
		return lctWarehouseCd;
	}

	public void setLctWarehouseCd(String lctWarehouseCd) {
		this.lctWarehouseCd = lctWarehouseCd;
	}

	public String getErrorMessageNm() {
		return errorMessageNm;
	}

	public void setErrorMessageNm(String errorMessageNm) {
		this.errorMessageNm = errorMessageNm;
	}

	public String getWarehouseNm() {
		return warehouseNm;
	}

	public void setWarehouseNm(String warehouseNm) {
		this.warehouseNm = warehouseNm;
	}

	public void setDepositNm(String depositNm) {
		this.depositNm = depositNm;
	}

	public long getShippingInstReceiveId() {
		return shippingInstReceiveId;
	}

	public void setShippingInstReceiveId(long shippingInstReceiveId) {
		this.shippingInstReceiveId = shippingInstReceiveId;
	}

	public String getStockTypeNm() {
		return stockTypeNm;
	}

	public void setStockTypeNm(String stockTypeNm) {
		this.stockTypeNm = stockTypeNm;
	}

	public String getLotManagFlg() {
		return lotManagFlg;
	}

	public void setLotManagFlg(String lotManagFlg) {
		this.lotManagFlg = lotManagFlg;
	}

	public String getLimitDtManagFlg() {
		return limitDtManagFlg;
	}

	public void setLimitDtManagFlg(String limitDtManagFlg) {
		this.limitDtManagFlg = limitDtManagFlg;
	}

	public String getStoreNoFlg() {
		return storeNoFlg;
	}

	public void setStoreNoFlg(String storeNoFlg) {
		this.storeNoFlg = storeNoFlg;
	}

	public String getBodyMessageNm() {
		return bodyMessageNm;
	}

	public void setBodyMessageNm(String bodyMessageNm) {
		this.bodyMessageNm = bodyMessageNm;
	}

	public String getInvoiceCreateFlg() {
		return invoiceCreateFlg;
	}

	public void setInvoiceCreateFlg(String invoiceCreateFlg) {
		this.invoiceCreateFlg = invoiceCreateFlg;
	}

	public String getStwOutFlg() {
		return stwOutFlg;
	}

	public void setStwOutFlg(String stwOutFlg) {
		this.stwOutFlg = stwOutFlg;
	}

	public BigDecimal getChargeNum() {
		return chargeNum;
	}

	public void setChargeNum(BigDecimal chargeNum) {
		this.chargeNum = chargeNum;
	}

	public BigDecimal getOldPickingNum() {
		return oldPickingNum;
	}

	public void setOldPickingNum(BigDecimal oldPickingNum) {
		this.oldPickingNum = oldPickingNum;
	}

	public String getTpbLocationNm() {
		return tpbLocationNm;
	}

	public void setTpbLocationNm(String tpbLocationNm) {
		this.tpbLocationNm = tpbLocationNm;
	}

	public long getTpbPickingNum() {
		return tpbPickingNum;
	}

	public void setTpbPickingNum(long tpbPickingNum) {
		this.tpbPickingNum = tpbPickingNum;
	}

	public String getTpbLot() {
		return tpbLot;
	}

	public void setTpbLot(String tpbLot) {
		this.tpbLot = tpbLot;
	}

	public String getTpbLimitDt() {
		return tpbLimitDt;
	}

	public void setTpbLimitDt(String tpbLimitDt) {
		this.tpbLimitDt = tpbLimitDt;
	}

	public String getTpbStoreLabelNo() {
		return tpbStoreLabelNo;
	}

	public void setTpbStoreLabelNo(String tpbStoreLabelNo) {
		this.tpbStoreLabelNo = tpbStoreLabelNo;
	}

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

}
