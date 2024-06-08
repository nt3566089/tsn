package com.oneslogi.base.dbflute.dto.customize;

import com.oneslogi.base.dbflute.dto.bs.customize.BsSqlELocationListDto;

/**
 * The entity of SqlELocationList.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class SqlELocationListDto extends BsSqlELocationListDto {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    /** 行番号 */
    private String lineNo;

	/** エラーのみ表示 */
    private String chkErrorShow;

    /** エラー処理方法 */
    private String errorProcessMet;

    /** 検索件数 */
    private int counter;

    /** 荷主ID */
    private Long clientId;

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

    public Long getClientId() {
		return clientId;
	}

	public void setClientId(Long clientId) {
		this.clientId = clientId;
	}

    public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}

	public String getLineNo() {
		return lineNo;
	}

	public void setLineNo(String lineNo) {
		this.lineNo = lineNo;
	}

	public String getErrorProcessMet() {
		return errorProcessMet;
	}

	public void setErrorProcessMet(String errorProcessMet) {
		this.errorProcessMet = errorProcessMet;
	}

	public String getChkErrorShow() {
		return chkErrorShow;
	}

	public void setChkErrorShow(String chkErrorShow) {
		this.chkErrorShow = chkErrorShow;
	}
}
