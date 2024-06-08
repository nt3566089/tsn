package com.oneslogi.wms.dto.report;

import com.oneslogi.base.dto.ReportDto;

/**
 * 取替集計表DTOクラス
 */
public class ExchangeTotalizationListDto extends ReportDto {

	/** 配達拠点 */
	public String centerNm;
	/** 販売日 */
	public String dlvYMD;
	/** 配達拠点コード */
	public String dpcd;
	/** 配達方面 */
	public String ded;
	/** ピストン区分 */
	public String pstnId;
	/** 銘柄名 */
	public String productAbbr;
	/** 丸段 */
	public Long sprqaful;
	/** バラ段 */
	public Long pieceQty;
	/** カートン */
	public Long cartonQty;
	/** 端数 */
	public Long fractionQty;
	/** 内外区分 */
	public String ioId;
	/** 一般出力順 */
	public String userNum3;
	/** 銘柄コード */
	public String zzmatnr;
	/** 合計項目 表示フラグ */
	public Boolean showSumItemFlg;

	// ===== 以下、ゲッタ・セッタ =====

	public String getCenterNm() {
		return centerNm;
	}

	public void setCenterNm(String centerNm) {
		this.centerNm = centerNm;
	}

	public String getDlvYMD() {
		return dlvYMD;
	}

	public void setDlvYMD(String dlvYMD) {
		this.dlvYMD = dlvYMD;
	}

	public String getDpcd() {
		return dpcd;
	}

	public void setDpcd(String dpcd) {
		this.dpcd = dpcd;
	}

	public String getDed() {
		return ded;
	}

	public void setDed(String ded) {
		this.ded = ded;
	}

	public String getPstnId() {
		return pstnId;
	}

	public void setPstnId(String pstnId) {
		this.pstnId = pstnId;
	}

	public String getProductAbbr() {
		return productAbbr;
	}

	public void setProductAbbr(String productAbbr) {
		this.productAbbr = productAbbr;
	}

	public Long getSprqaful() {
		return sprqaful;
	}

	public void setSprqaful(Long sprqaful) {
		this.sprqaful = sprqaful;
	}

	public Long getPieceQty() {
		return pieceQty;
	}

	public void setPieceQty(Long pieceQty) {
		this.pieceQty = pieceQty;
	}

	public Long getCartonQty() {
		return cartonQty;
	}

	public void setCartonQty(Long cartonQty) {
		this.cartonQty = cartonQty;
	}

	public Long getFractionQty() {
		return fractionQty;
	}

	public void setFractionQty(Long fractionQty) {
		this.fractionQty = fractionQty;
	}

	public String getIoId() {
		return ioId;
	}

	public void setIoId(String ioId) {
		this.ioId = ioId;
	}

	public String getUserNum3() {
		return userNum3;
	}

	public void setUserNum3(String userNum3) {
		this.userNum3 = userNum3;
	}

	public String getZzmatnr() {
		return zzmatnr;
	}

	public void setZzmatnr(String zzmatnr) {
		this.zzmatnr = zzmatnr;
	}

	public Boolean getShowSumItemFlg() {
		return showSumItemFlg;
	}

	public void setShowSumItemFlg(Boolean showSumItemFlg) {
		this.showSumItemFlg = showSumItemFlg;
	}

}
