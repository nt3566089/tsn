package com.oneslogi.wms.dto.report;

import java.math.BigDecimal;

import com.oneslogi.base.dto.ReportDto;

/**
 * 方面別段ボール明細リスト(紙) DTOクラス
 */
public class DirectionCardboardDtlListDto extends ReportDto {

	/** 配達日 */
	public String deliveryDate;
	/** 配達拠点 */
	public String centerNm;
	/** 方面 */
	public String directionCd;
	/** ピストン区分 */
	public String pistonType;
	/** 銘柄コード */
	public String itemCd;
	/** 銘柄名 */
	public String itemNm;
	/** 丸段 */
	public BigDecimal sprqaQty;
	/** 一般出力順 */
	public BigDecimal outputOrder;
	/** 総合計 */
	public BigDecimal totalSprqaQty;
	/**  フッタ項目 表示フラグ */
	public Boolean showFooterItemFlg;

	// ===== 以下、ゲッタ・セッタ =====

	public String getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(String deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public String getCenterNm() {
		return centerNm;
	}

	public void setCenterNm(String centerNm) {
		this.centerNm = centerNm;
	}

	public String getDirectionCd() {
		return directionCd;
	}

	public void setDirectionCd(String directionCd) {
		this.directionCd = directionCd;
	}

	public String getPistonType() {
		return pistonType;
	}

	public void setPistonType(String pistonType) {
		this.pistonType = pistonType;
	}

	public String getItemCd() {
		return itemCd;
	}

	public void setItemCd(String itemCd) {
		this.itemCd = itemCd;
	}

	public String getItemNm() {
		return itemNm;
	}

	public void setItemNm(String itemNm) {
		this.itemNm = itemNm;
	}

	public BigDecimal getSprqaQty() {
		return sprqaQty;
	}

	public void setSprqaQty(BigDecimal sprqaQty) {
		this.sprqaQty = sprqaQty;
	}

	public BigDecimal getOutputOrder() {
		return outputOrder;
	}

	public void setOutputOrder(BigDecimal outputOrder) {
		this.outputOrder = outputOrder;
	}

	public BigDecimal getTotalSprqaQty() {
		return totalSprqaQty;
	}

	public void setTotalSprqaQty(BigDecimal totalSprqaQty) {
		this.totalSprqaQty = totalSprqaQty;
	}

	public Boolean getShowFooterItemFlg() {
		return showFooterItemFlg;
	}

	public void setShowFooterItemFlg(Boolean showFooterItemFlg) {
		this.showFooterItemFlg = showFooterItemFlg;
	}

}
