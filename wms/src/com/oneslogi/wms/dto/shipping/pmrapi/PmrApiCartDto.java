package com.oneslogi.wms.dto.shipping.pmrapi;

import java.util.List;

public class PmrApiCartDto {

	/** 台車番号 */
	private int cartNo;
	/** 梱包番号セット */
	private List<String> packingNo;

	// ===== 以下、ゲッタとセッタ =====

	public int getCartNo() {
		return cartNo;
	}

	public void setCartNo(int cartNo) {
		this.cartNo = cartNo;
	}

	public List<String> getPackingNo() {
		return packingNo;
	}

	public void setPackingNo(List<String> packingNo) {
		this.packingNo = packingNo;
	}

}
