package com.oneslogi.base.dbflute.exentity.customize;

import com.oneslogi.base.dbflute.bsentity.customize.BsSqlELocationList;

/**
 * The entity of SqlELocationList.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class SqlELocationList extends BsSqlELocationList {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    // [#3982] ロケーションマスタ一括取込でExcel出力するとNo.が表示されない 2018.03.16 kawana Start
    /** 行番号 */
    private String lineNo;
    // [#3982] ロケーションマスタ一括取込でExcel出力するとNo.が表示されない 2018.03.16 kawana End
    /** エラーのみ表示 */
    private String chkErrorShow;
    /** ロケーション種別*/
    private String locationTypeNm;
	/** ピックロケフラグ*/
    private String pickingLocationFlgNm;
    /** 引当禁止フラグ*/
    private String allocNgFlgNm;
    /** ピッキング順序*/
    private String pickingOrder;
    /** 削除フラグ*/
    private String delFlgNm;
    /** 補充在庫区分*/
    private String replenishStockTypeNm;

    // ========== 以下、getterとsetter ==========

	public String getLineNo() {
		return lineNo;
	}

	public void setLineNo(String lineNo) {
		this.lineNo = lineNo;
	}

	public String getReplenishStockTypeNm() {
		return replenishStockTypeNm;
	}

	public void setReplenishStockTypeNm(String replenishStockTypeNm) {
		this.replenishStockTypeNm = replenishStockTypeNm;
	}

	public String getDelFlgNm() {
		return delFlgNm;
	}

	public void setDelFlgNm(String delFlgNm) {
		this.delFlgNm = delFlgNm;
	}

	public String getLocationTypeNm() {
		return locationTypeNm;
	}

	public void setLocationTypeNm(String locationTypeNm) {
		this.locationTypeNm = locationTypeNm;
	}

	public String getPickingLocationFlgNm() {
		return pickingLocationFlgNm;
	}

	public void setPickingLocationFlgNm(String pickingLocationFlgNm) {
		this.pickingLocationFlgNm = pickingLocationFlgNm;
	}

	public String getAllocNgFlgNm() {
		return allocNgFlgNm;
	}

	public void setAllocNgFlgNm(String allocNgFlgNm) {
		this.allocNgFlgNm = allocNgFlgNm;
	}

	public String getPickingOrder() {
		return pickingOrder;
	}

	public void setPickingOrder(String pickingOrder) {
		this.pickingOrder = pickingOrder;
	}


	public String getChkErrorShow() {
		return chkErrorShow;
	}

	public void setChkErrorShow(String chkErrorShow) {
		this.chkErrorShow = chkErrorShow;
	}
}
