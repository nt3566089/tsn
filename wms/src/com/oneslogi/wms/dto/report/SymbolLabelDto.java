package com.oneslogi.wms.dto.report;

import java.math.BigDecimal;

import com.oneslogi.base.dto.ReportDto;
/**
 *シンボルDTOクラス
 */
public class SymbolLabelDto extends ReportDto {


	/** 保税管理番号 */
	public String supplierRcvNo;
	/** 入庫年月日 */
	public String rcvDate;
	/** コンテナNo */
	public String carrierNo;
	/** カートン数 */
	public BigDecimal restQty;
	/** 銘柄コード */
	public String itemCd;
	/** 銘柄名称 */
	public String itemName;
	/** 商社搬入番号 */
	public String lot1;
	/** 製造年月日 */
	public String lot4;
	/** デザイン区分 */
	public String lot3;
	/** シンボル管理番号 */
	public String symbolNo;
	/** 拠点コード */
	public String centerCd;
	/** 号機 */
	public String printerNo;
	/** 生出番号 */
	public String makeNo;
	/**入庫キー */
	public String rcvKey;
	/**バーコード(輸入品) */
	public String barcodeImport;
	/**バーコード(国産品) */
	public String barcodeDomestic;
	/**製品区分 */
	public String carrierseq;
	/**ヘッダ・明細区分 */
	public String headerDetailFlg;
	/**入庫・出庫区分 */
	public String receiveShippingFlg;



	// ===== 以下、ゲッタ・セッタ =====

	public String getSupplierRcvNo() {
		return supplierRcvNo;
	}

	public void setSupplierRcvNo(String supplierRcvNo) {
		this.supplierRcvNo = supplierRcvNo;
	}

	public void setRcvDate(String rcvDate) {
		this.rcvDate = rcvDate;
	}

	public String getCarrierNo() {
		return carrierNo;
	}

	public void setCarrierNo(String carrierNo) {
		this.carrierNo = carrierNo;
	}

	public BigDecimal getRestQty() {
		return restQty;
	}

	public void setRestQty(BigDecimal restQty) {
		this.restQty = restQty;
	}

	public String getItemCd() {
		return itemCd;
	}

	public void setItemCd(String itemCd) {
		this.itemCd = itemCd;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getLot1() {
		return lot1;
	}

	public void setLot1(String lot1) {
		this.lot1 = lot1;
	}

	public String getLot4() {
		return lot4;
	}

	public void setLot4(String lot4) {
		this.lot4 = lot4;
	}

	public String getLot3() {
		return lot3;
	}

	public void setLot3(String lot3) {
		this.lot3 = lot3;
	}

	public String getSymbolNo() {
		return symbolNo;
	}

	public void setSymbolNo(String symbolNo) {
		this.symbolNo = symbolNo;
	}

	public String getCenterCd() {
		return centerCd;
	}

	public void setCenterCd(String centerCd) {
		this.centerCd = centerCd;
	}

	public String getPrinterNo() {
		return printerNo;
	}

	public void setPrinterNo(String printerNo) {
		this.printerNo = printerNo;
	}

	public String getMakeNo() {
		return makeNo;
	}

	public void setMakeNo(String makeNo) {
		this.makeNo = makeNo;
	}

	public String getRcvKey() {
		return rcvKey;
	}

	public void setRcvKey(String rcvKey) {
		this.rcvKey = rcvKey;
	}

	public String getBarcodeImport() {
		return barcodeImport;
	}

	public void setBarcodeImport(String barcodeImport) {
		this.barcodeImport = barcodeImport;
	}

	public String getBarcodeeDomestic() {
		return barcodeDomestic;
	}

	public void setBarcodeeDomestic(String barcodeDomestic) {
		this.barcodeDomestic = barcodeDomestic;
	}

	public String getCarrierseq() {
		return carrierseq;
	}

	public void setCarrierseq(String carrierseq) {
		this.carrierseq = carrierseq;
	}

	public String getHeaderDetailFlg() {
		return headerDetailFlg;
	}

	public void setHeaderDetailFlg(String headerDetailFlg) {
		this.headerDetailFlg = headerDetailFlg;
	}

	public String getReceiveShippingFlg() {
		return receiveShippingFlg;
	}

	public void setReceiveShippingFlg(String receiveShippingFlg) {
		this.receiveShippingFlg = receiveShippingFlg;
	}

}