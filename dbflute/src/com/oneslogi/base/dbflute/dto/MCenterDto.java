package com.oneslogi.base.dbflute.dto;

import java.math.BigDecimal;

import com.oneslogi.base.dbflute.dto.bs.BsMCenterDto;

/**
 * The entity of M_CENTER.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class MCenterDto extends BsMCenterDto {

	/** Serial version UID. (Default) */
	private static final long serialVersionUID = 1L;

	// 選択
	private String centerCheckBox;

	// 在庫数
	private BigDecimal stockNum;

	// 期限切れ数
	private BigDecimal expiredStockNum;

	private String mode;

	// [Ver3.0][#3267] カルチャ、タイムゾーンのドロップダウン追加 2018.01.04 shimizu Start
	// カルチャCD
	private String cultureCd;
	// タイムゾーンCD
	private String timeZoneCd;
	// [Ver3.0][#3267] カルチャ、タイムゾーンのドロップダウン追加 2018.01.04 shimizu End

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public String getCenterCheckBox() {
		return centerCheckBox;
	}

	public void setCenterCheckBox(String centerCheckBox) {
		this.centerCheckBox = centerCheckBox;
	}

	public BigDecimal getStockNum() {
		return stockNum;
	}

	public void setStockNum(BigDecimal stockNum) {
		this.stockNum = stockNum;
	}

	public BigDecimal getExpiredStockNum() {
		return expiredStockNum;
	}

	public void setExpiredStockNum(BigDecimal expiredStockNum) {
		this.expiredStockNum = expiredStockNum;
	}
	// [Ver3.0][#3267] カルチャ、タイムゾーンのドロップダウン追加 2018.01.04 shimizu Start
	public String getCultureCd() {
		return cultureCd;
	}

	public void setCultureCd(String cultureCd) {
		this.cultureCd = cultureCd;
	}

	public String getTimeZoneCd() {
		return timeZoneCd;
	}

	public void setTimeZoneCd(String timeZoneCd) {
		this.timeZoneCd = timeZoneCd;
	}
	// [Ver3.0][#3267] カルチャ、タイムゾーンのドロップダウン追加 2018.01.04 shimizu End
}
