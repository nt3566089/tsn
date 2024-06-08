package com.oneslogi.base.dbflute.exentity;

import java.math.BigDecimal;

import com.oneslogi.base.dbflute.bsentity.BsMCenter;

/**
 * The entity of M_CENTER.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class MCenter extends BsMCenter {

	/** Serial version UID. (Default) */
	private static final long serialVersionUID = 1L;

	// ===== chaseメソッド(DBFlute 1.0.5N ⇒ 1.2.0対応) =====

	public BTimeZone chaseBTimeZone() {
		return _bTimeZone != null ? _bTimeZone : new BTimeZone();
	}

	// ======================================================

	// 選択
	private String centerCheckBox;

	// 在庫数
	private BigDecimal stockNum;

	// 期限切れ数
	private BigDecimal expiredStockNum;

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

}
