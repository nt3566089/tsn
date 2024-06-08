package com.oneslogi.base.dbflute.dto;

import com.oneslogi.base.dbflute.dto.bs.BsTLastLotDto;

/**
 * The entity of T_LAST_LOT.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class TLastLotDto extends BsTLastLotDto {

	/** Serial version UID. (Default) */
	private static final long serialVersionUID = 1L;

	// ===== 導出カラム =====

	// [#1517] 出荷期限日一覧の不要な項目 (行No、センタCDを削除) 2017.04.18 kawana Start

	/** 荷主CD */
	private String clientCd;

	/** 出荷日*/
	private String shippingDt;

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
