package com.oneslogi.base.dbflute.dto;

import com.oneslogi.base.dbflute.dto.bs.BsTPackingBDto;

/**
 * The entity of t_packing_b.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class TPackingBDto extends BsTPackingBDto {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    private String _productCd;

	private String _boxId;

	private String _boxCd;

	// 顧客出荷指示No.
	private String clientShippingNo;

	// [#5107][v3.1] 最適ピッキング方法提案機能 追加 2018.08.30 kawana Start
	// 緊急フラグ
	private String emergencyFlg;
	// [#5107][v3.1] 最適ピッキング方法提案機能 追加 2018.08.30 kawana End


	// ===== 以下、セッタ、ゲッタ =====

	public String getProductCd() {
		return _productCd;
	}

	public void setProductCd(String productCd) {
		this._productCd = productCd;
	}

	public String getBoxId() {
		return _boxId;
	}

	public void setBoxId(String boxId) {
		this._boxId = boxId;
	}

	public String getBoxCd() {
		return _boxCd;
	}

	public void setBoxCd(String _boxCd) {
		this._boxCd = _boxCd;
	}

	public String getClientShippingNo() {
		return clientShippingNo;
	}

	public void setClientShippingNo(String clientShippingNo) {
		this.clientShippingNo = clientShippingNo;
	}

	public String getEmergencyFlg() {
		return emergencyFlg;
	}

	public void setEmergencyFlg(String emergencyFlg) {
		this.emergencyFlg = emergencyFlg;
	}

}
