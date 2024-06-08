package com.oneslogi.wms.dto.report;

import java.math.BigDecimal;

import com.oneslogi.base.dto.ReportDto;

/**
 * スタート在庫修正リストDTOクラス
 */
public class StartStockFixListDto extends ReportDto {

	/** ライン/ブロック */
	public String lineBlock;
	/** ロケーション */
	public String locationCd;
	/** 銘柄CD */
	public String itemCd;
	/** 銘柄名 */
	public String itemName;
	/** 修正前段ボール */
	public BigDecimal beforeCorrectionCardboardQa;
	/** 修正前カートン */
	public BigDecimal beforeCorrectionCartonQa;
	/** 修正数量段ボール */
	public BigDecimal correctionCardboardQa;
	/** 修正数量カートン */
	public BigDecimal correctionCartonQa;
	/** 修正後段ボール */
	public BigDecimal afterCorrectionCardboardQa;
	/** 修正後カートン */
	public BigDecimal afterCorrectionCartonQa;

	// ===== 以下、ゲッタ・セッタ =====

	public String getLineBlock() {
		return lineBlock;
	}

	public void setLineBlock(String lineBlock) {
		this.lineBlock = lineBlock;
	}

	public String getLocationCd() {
		return locationCd;
	}

	public void setLocationCd(String locationCd) {
		this.locationCd = locationCd;
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

	public BigDecimal getBeforeCorrectionCardboardQa() {
		return beforeCorrectionCardboardQa;
	}

	public void setBeforeCorrectionCardboardQa(BigDecimal beforeCorrectionCardboardQa) {
		this.beforeCorrectionCardboardQa = beforeCorrectionCardboardQa;
	}

	public BigDecimal getBeforeCorrectionCartonQa() {
		return beforeCorrectionCartonQa;
	}

	public void setBeforeCorrectionCartonQa(BigDecimal beforeCorrectionCartonQa) {
		this.beforeCorrectionCartonQa = beforeCorrectionCartonQa;
	}

	public BigDecimal getCorrectionCardboardQa() {
		return correctionCardboardQa;
	}

	public void setCorrectionCardboardQa(BigDecimal correctionCardboardQa) {
		this.correctionCardboardQa = correctionCardboardQa;
	}

	public BigDecimal getCorrectionCartonQa() {
		return correctionCartonQa;
	}

	public void setCorrectionCartonQa(BigDecimal correctionCartonQa) {
		this.correctionCartonQa = correctionCartonQa;
	}

	public BigDecimal getAfterCorrectionCardboardQa() {
		return afterCorrectionCardboardQa;
	}

	public void setAfterCorrectionCardboardQa(BigDecimal afterCorrectionCardboardQa) {
		this.afterCorrectionCardboardQa = afterCorrectionCardboardQa;
	}

	public BigDecimal getAfterCorrectionCartonQa() {
		return afterCorrectionCartonQa;
	}

	public void setAfterCorrectionCartonQa(BigDecimal afterCorrectionCartonQa) {
		this.afterCorrectionCartonQa = afterCorrectionCartonQa;
	}

}
