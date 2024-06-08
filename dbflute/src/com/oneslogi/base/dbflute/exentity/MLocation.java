package com.oneslogi.base.dbflute.exentity;

import com.oneslogi.base.dbflute.bsentity.BsMLocation;

/**
 * The entity of M_LOCATION.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class MLocation extends BsMLocation {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

	// ===== chaseメソッド(DBFlute 1.0.5N ⇒ 1.2.0対応) =====

	public MCustomer chaseMCustomer() {
		return _mCustomer != null ? _mCustomer : new MCustomer();
	}

	public MProduct chaseMProduct() {
		return _mProduct != null ? _mProduct : new MProduct();
	}

	public MZone chaseMZone() {
		return _mZone != null ? _mZone : new MZone();
	}

	public BClassDtl chaseBClassDtlByAllocNgFlg() {
		return _bClassDtlByAllocNgFlg != null ? _bClassDtlByAllocNgFlg : new BClassDtl();
	}

	public MCenter chaseMCenter() {
		return _mCenter != null ? _mCenter : new MCenter();
	}

	// ======================================================

    /** ロケーションCD（From）*/
    private String locationCdFrom;

    /** ロケーションCD（To）*/
    private String locationCdTo;

    /** 行番号 */
    private String lineNo;

	// [C-CWMS-0060] EDI機能(汎用)バッチ化対応(受信ID削除) 2016.09.09 honma

	/** エラーのみ表示 */
	private String chkErrorShow;

	/**  */
	private String elocationId;

	private String errorFlg;

	public String getErrorFlg() {
		return errorFlg;
	}

	public void setErrorFlg(String errorFlg) {
		this.errorFlg = errorFlg;
	}

	public String getElocationId() {
		return elocationId;
	}

	public void setElocationId(String elocationId) {
		this.elocationId = elocationId;
	}

	public String getChkErrorShow() {
		return chkErrorShow;
	}

	public void setChkErrorShow(String chkErrorShow) {
		this.chkErrorShow = chkErrorShow;
	}

	public String getLocationCdFrom() {
		return locationCdFrom;
	}

	public void setLocationCdFrom(String locationCdFrom) {
		this.locationCdFrom = locationCdFrom;
	}

	public String getLocationCdTo() {
		return locationCdTo;
	}

	public void setLocationCdTo(String locationCdTo) {
		this.locationCdTo = locationCdTo;
	}

    public String getLineNo() {
		return lineNo;
	}

	public void setLineNo(String lineNo) {
		this.lineNo = lineNo;
	}

    // [1.1.4-CT-061] 検索条件に補充商品未設定を追加 2016.06.03 ichikawa Start
    private String replenishProductCdUnset;

    public String getReplenishProductCdUnset() {
    	return replenishProductCdUnset;
    }

    public void setReplenishProductCdUnset(String replenishProductCdUnset) {
    	this.replenishProductCdUnset = replenishProductCdUnset;
    }
    // [1.1.4-CT-061] 検索条件に補充商品未設定を追加 2016.06.03 ichikawa End
}
