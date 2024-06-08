package com.oneslogi.base.dbflute.dto;

import java.math.BigDecimal;

import com.oneslogi.base.dbflute.dto.bs.BsTShippingInstBDto;

/**
 * The entity of T_SHIPPING_INST_B.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class TShippingInstBDto extends BsTShippingInstBDto {

	/** Serial version UID. (Default) */
	private static final long serialVersionUID = 1L;

	// ===== 導出カラム =====

	// エラーメッセージ
	private String bodyMessageNm;
	//送り状データ作成フラグ
	private String invoiceCreateFlg;
	//積込リスト出力フラグ
	private String stwOutFlg;
	//ロケーション名称
	private String tpbLocationNm;
	//出庫数(出庫ボディ)
	private long tpbPickingNum;
	//ロット
	private String tpbLot;
	//期限日
	private String tpbLimitDt;
	//入庫ラベルNo.
	private String tpbStoreLabelNo;
	//引当可能数
	private BigDecimal chargeNum;
	//入庫No.管理フラグ
	private String storeNoFlg;
	//ロット管理フラグ
	private String lotManagFlg;
	//期限日管理フラグ
	private String limitDtManagFlg;

	private BigDecimal oldPickingNum;

	// [#5144][v3.1] 欠品フラグを出庫指示ヘッダに移動(stockOutNum削除) 2018.07.27 kawana Delete

	private String depositNm;

	private long shippingInstReceiveId;

	private String stockTypeNm;

	private String warehouseNm;

	private String errorMessageNm;

	// [#3136][WMS Ver3.0] 検索条件に「預託CD」「預託名称」を追加 2017.12.15 shimizu Start
	// 預託CD
	private String referenceDepositCd;
	// 預託名称
	private String referenceDepositNm;
	// [#3136][WMS Ver3.0] 検索条件に「預託CD」「預託名称」を追加 2017.12.15 shimizu End

	//指定倉庫CD
	private String lctWarehouseCd;

    // [Ver3.0] unit of measure対応 2017.11.23 駱 Start

	// 商品単位
	private String productUnit;

	// 入数内訳
	private String unitNumBreakdown;

	//少数フラグ
	private String decimalExistFlg;
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

	public String getStockTypeNm() {
		return stockTypeNm;
	}

	public void setStockTypeNm(String stockTypeNm) {
		this.stockTypeNm = stockTypeNm;
	}

	public long getShippingInstReceiveId() {
		return shippingInstReceiveId;
	}

	public void setShippingInstReceiveId(long shippingInstReceiveId) {
		this.shippingInstReceiveId = shippingInstReceiveId;
	}

	public void setDepositNm(String depositNm) {
		this.depositNm = depositNm;
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

	// [#3136][WMS Ver3.0] 検索条件に「預託CD」「預託名称」を追加 2017.12.15 shimizu Start
	public String getReferenceDepositCd() {
		return referenceDepositCd;
	}

	public void setReferenceDepositCd(String referenceDepositCd) {
		this.referenceDepositCd = referenceDepositCd;
	}

	public String getReferenceDepositNm() {
		return referenceDepositNm;
	}

	public void setReferenceDepositNm(String referenceDepositNm) {
		this.referenceDepositNm = referenceDepositNm;
	}
	// [#3136][WMS Ver3.0] 検索条件に「預託CD」「預託名称」を追加 2017.12.15 shimizu End

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
	public String getDecimalExistFlg() {
		return decimalExistFlg;
	}

	public void setDecimalExistFlg(String decimalExistFlg) {
		this.decimalExistFlg = decimalExistFlg;
	}
}
