package com.oneslogi.base.dbflute.exentity;

import com.oneslogi.base.dbflute.bsentity.BsTLastLot;

/**
 * The entity of T_LAST_LOT.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class TLastLot extends BsTLastLot {

	/** Serial version UID. (Default) */
	private static final long serialVersionUID = 1L;

	// ===== chaseメソッド(DBFlute 1.0.5N ⇒ 1.2.0対応) =====

	public TLot chaseTLot() {
		return _tLot != null ? _tLot : new TLot();
	}

	// ======================================================

	// [#1517] 出荷期限日一覧の不要な項目 (行No、センタCDを削除) 2017.04.18 kawana Start

	// ===== 導出カラム =====

	/** 荷主CD */
	private String clientCd;

	/** 出荷日の最大値 */
	private String shippingDt;

	public static final String TAIH_shippingDt = "SHIPPING_DT";

	// [#1517] 出荷期限日一覧の不要な項目 (行No、センタCDを削除) 2017.04.18 kawana End

	// ===== 以下Eclipse自動生成のアクセサメソッド =====

	public String getShippingDt() {
		return shippingDt;
	}

	public void setShippingDt(String shippingDt) {
		this.shippingDt = shippingDt;
	}

	public String getClientCd() {
		return clientCd;
	}

	public void setClientCd(String clientCd) {
		this.clientCd = clientCd;
	}
}
