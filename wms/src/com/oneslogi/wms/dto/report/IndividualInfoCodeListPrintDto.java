package com.oneslogi.wms.dto.report;

import com.oneslogi.base.dto.ReportDto;

/**
 * 個体情報コード一覧DTOクラス
 */
public class IndividualInfoCodeListPrintDto extends ReportDto {

	/** P/Lno */
	public String soPalletNo;
	/** 受入先名称 */
	public String shipToNm;
	/** 問合番号 */
	public String rmaNo;
	/** 整理番号 */
	public String ownerSoNo;
	/** 識別バーコード文字列 */
	public String palletSymbolBarcode39;
	/** 識別QRコード文字列 */
	public String palletSymbolQrCode;
	/** 個体情報QRコード1 */
	public String qrCode1;
	/** 製造月日1 */
	public String lot4_1;
	/** 号機1 */
	public String machineNo1;
	/** 生出番号1 */
	public String createNo1;
	/** 個体情報QRコード2 */
	public String qrCode2;
	/** 製造月日2 */
	public String lot4_2;
	/** 号機2 */
	public String machineNo2;
	/** 生出番号2 */
	public String createNo2;
	/** 個体情報QRコード3 */
	public String qrCode3;
	/** 製造月日3 */
	public String lot4_3;
	/** 号機3 */
	public String machineNo3;
	/** 生出番号3 */
	public String createNo3;
	/** 個体情報QRコード4 */
	public String qrCode4;
	/** 製造月日4 */
	public String lot4_4;
	/** 号機4 */
	public String machineNo4;
	/** 生出番号4 */
	public String createNo4;
	/** 製造月混載フラグ */
	public Boolean isMixLot4;
	/** 銘柄混載フラグ */
	public Boolean isMixItem;
	/** 代表QR */
	public String concatQrCode;
	/** 代表QRの長さ */
	public Integer concatQrCodeLength;

	// ===== 以下、ゲッタ・セッタ =====

	public String getSoPalletNo() {
		return soPalletNo;
	}

	public void setSoPalletNo(String soPalletNo) {
		this.soPalletNo = soPalletNo;
	}

	public String getShipToNm() {
		return shipToNm;
	}

	public void setShipToNm(String shipToNm) {
		this.shipToNm = shipToNm;
	}

	public String getRmaNo() {
		return rmaNo;
	}

	public void setRmaNo(String rmaNo) {
		this.rmaNo = rmaNo;
	}

	public String getOwnerSoNo() {
		return ownerSoNo;
	}

	public void setOwnerSoNo(String ownerSoNo) {
		this.ownerSoNo = ownerSoNo;
	}

	public String getPalletSymbolBarcode39() {
		return palletSymbolBarcode39;
	}

	public void setPalletSymbolBarcode39(String palletSymbolBarcode39) {
		this.palletSymbolBarcode39 = palletSymbolBarcode39;
	}

	public String getPalletSymbolQrCode() {
		return palletSymbolQrCode;
	}

	public void setPalletSymbolQrCode(String palletSymbolQrCode) {
		this.palletSymbolQrCode = palletSymbolQrCode;
	}

	public String getQrCode1() {
		return qrCode1;
	}

	public void setQrCode1(String qrCode1) {
		this.qrCode1 = qrCode1;
	}

	public String getLot4_1() {
		return lot4_1;
	}

	public void setLot4_1(String lot4_1) {
		this.lot4_1 = lot4_1;
	}

	public String getMachineNo1() {
		return machineNo1;
	}

	public void setMachineNo1(String machineNo1) {
		this.machineNo1 = machineNo1;
	}

	public String getCreateNo1() {
		return createNo1;
	}

	public void setCreateNo1(String createNo1) {
		this.createNo1 = createNo1;
	}

	public String getQrCode2() {
		return qrCode2;
	}

	public void setQrCode2(String qrCode2) {
		this.qrCode2 = qrCode2;
	}

	public String getLot4_2() {
		return lot4_2;
	}

	public void setLot4_2(String lot4_2) {
		this.lot4_2 = lot4_2;
	}

	public String getMachineNo2() {
		return machineNo2;
	}

	public void setMachineNo2(String machineNo2) {
		this.machineNo2 = machineNo2;
	}

	public String getCreateNo2() {
		return createNo2;
	}

	public void setCreateNo2(String createNo2) {
		this.createNo2 = createNo2;
	}

	public String getQrCode3() {
		return qrCode3;
	}

	public void setQrCode3(String qrCode3) {
		this.qrCode3 = qrCode3;
	}

	public String getLot4_3() {
		return lot4_3;
	}

	public void setLot4_3(String lot4_3) {
		this.lot4_3 = lot4_3;
	}

	public String getMachineNo3() {
		return machineNo3;
	}

	public void setMachineNo3(String machineNo3) {
		this.machineNo3 = machineNo3;
	}

	public String getCreateNo3() {
		return createNo3;
	}

	public void setCreateNo3(String createNo3) {
		this.createNo3 = createNo3;
	}

	public String getQrCode4() {
		return qrCode4;
	}

	public void setQrCode4(String qrCode4) {
		this.qrCode4 = qrCode4;
	}

	public String getLot4_4() {
		return lot4_4;
	}

	public void setLot4_4(String lot4_4) {
		this.lot4_4 = lot4_4;
	}

	public String getMachineNo4() {
		return machineNo4;
	}

	public void setMachineNo4(String machineNo4) {
		this.machineNo4 = machineNo4;
	}

	public String getCreateNo4() {
		return createNo4;
	}

	public void setCreateNo4(String createNo4) {
		this.createNo4 = createNo4;
	}

	public Boolean getIsMixLot4() {
		return isMixLot4;
	}

	public void setIsMixLot4(Boolean isMixLot4) {
		this.isMixLot4 = isMixLot4;
	}

	public Boolean getIsMixItem() {
		return isMixItem;
	}

	public void setIsMixItem(Boolean isMixItem) {
		this.isMixItem = isMixItem;
	}

	public String getConcatQrCode() {
		return concatQrCode;
	}

	public void setConcatQrCode(String concatQrCode) {
		this.concatQrCode = concatQrCode;
	}

	public Integer getConcatQrCodeLength() {
		return concatQrCodeLength;
	}

	public void setConcatQrCodeLength(Integer concatQrCodeLength) {
		this.concatQrCodeLength = concatQrCodeLength;
	}

}
