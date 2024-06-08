package com.oneslogi.base.dbflute.exentity;

import java.math.BigDecimal;

import com.oneslogi.base.dbflute.bsentity.BsTPackingB;

/**
 * The entity of t_packing_b.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class TPackingB extends BsTPackingB {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

	// ===== chaseメソッド(DBFlute 1.0.5N ⇒ 1.2.0対応) =====

	public TPackingH chaseTPackingH() {
		return _tPackingH != null ? _tPackingH : new TPackingH();
	}

	public TPickingB chaseTPickingB() {
		return _tPickingB != null ? _tPickingB : new TPickingB();
	}

	// ======================================================

    private String _productCd;

	private String _boxId;

	private String _boxCd;

	// 顧客出荷指示No.
	public static final String ALIAS_clientShippingNo = "CLIENT_SHIPPING_NO";
	protected String clientShippingNo;
	// [ONEsLOGI Cloud/WMS バグ・品質向上対策 機能 #403]対応 2016.12.29 nayzaw Start
	// 出庫指示バッチNo.
	public static final String ALIAS_pickingBatchNo = "PICKING_BATCH_NO";
	protected String pickingBatchNo;
	// 出荷指示ヘッダ件数
	public static final String ALIAS_shippingInstHCount = "SHIPPING_INST_H_COUNT";
	protected String shippingInstHCount;
	//
	public static final String ALIAS_minCarrierTraceNum = "MIN_CARRIER_TRACE_NUM";
	protected String minCarrierTraceNum;
	// 梱包ヘッダ件数
	public static final String ALIAS_packingHCount = "PACKING_H_COUNT";
	protected int packingHCount;

	// キャリアEDIシステム(CES)連携対応 2017.01.16 HAN Start
	private BigDecimal _weight;
	// キャリアEDIシステム(CES)連携対応 2017.01.16 HAN End

	// [#5107][v3.1] 最適ピッキング方法提案機能 追加 2018.08.30 kawana Start
	// 緊急フラグ
	public static final String ALIAS_emergencyFlg = "EMERGENCY_FLG";
	protected String emergencyFlg;
	// [#5107][v3.1] 最適ピッキング方法提案機能 追加 2018.08.30 kawana End


	// ===== 以下、セッタ、ゲッタ =====

	public String getPickingBatchNo() {
		return pickingBatchNo;
	}

	public void setPickingBatchNo(String pickingBatchNo) {
		this.pickingBatchNo = pickingBatchNo;
	}
	// [ONEsLOGI Cloud/WMS バグ・品質向上対策 機能 #403]対応 2016.12.29 nayzaw End
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
	// [ONEsLOGI Cloud/WMS バグ・品質向上対策 機能 #403]対応 2016.12.29 nayzaw Start
	public String getShippingInstHCount() {
		return shippingInstHCount;
	}

	public void setShippingInstHCount(String shippingInstHCount){
		this.shippingInstHCount = shippingInstHCount;
	}
	public String getMinCarrierTraceNum() {
		return minCarrierTraceNum;
	}

	public void setMinCarrierTraceNum(String minCarrierTraceNum) {
		this.minCarrierTraceNum = minCarrierTraceNum;
	}

	public int getPackingHCount() {
		return packingHCount;
	}

	public void setPackingHCount(int packingHCount) {
		this.packingHCount = packingHCount;
	}
	// [ONEsLOGI Cloud/WMS バグ・品質向上対策 機能 #403]対応 2016.12.29 nayzaw End

	// キャリアEDIシステム(CES)連携対応 2017.01.16 HAN Start
	public BigDecimal getWeight() {
		return _weight;
	}

	public void setWeight(BigDecimal _weight) {
		this._weight = _weight;
	}

	public String getEmergencyFlg() {
		return emergencyFlg;
	}

	public void setEmergencyFlg(String emergencyFlg) {
		this.emergencyFlg = emergencyFlg;
	}

	// キャリアEDIシステム(CES)連携対応 2017.01.16 HAN End
}
