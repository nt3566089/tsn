package com.oneslogi.base.dbflute.exentity;

import com.oneslogi.base.dbflute.bsentity.BsEBarcodeLabel;

/**
 * The entity of e_barcode_label.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class EBarcodeLabel extends BsEBarcodeLabel {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    /** バーコード種別 */
    private String barcodeType;

    /** スタートビット */
    private String startBit;

    /** エンドビット */
    private String endBit;

	/** エラーのみ表示 */
    private String chkErrorShow;

    /** エラー処理方法 */
    private String errorProcessMet;

    /** エラーメッセージ */
    private String errorMessageNm;

	public String getBarcodeType() {
		return barcodeType;
	}

	public void setBarcodeType(String barcodeType) {
		this.barcodeType = barcodeType;
	}

	public String getStartBit() {
		return startBit;
	}

	public void setStartBit(String startBit) {
		this.startBit = startBit;
	}

	public String getEndBit() {
		return endBit;
	}

	public void setEndBit(String endBit) {
		this.endBit = endBit;
	}

	public String getChkErrorShow() {
		return chkErrorShow;
	}

	public void setChkErrorShow(String chkErrorShow) {
		this.chkErrorShow = chkErrorShow;
	}

	public String getErrorProcessMet() {
		return errorProcessMet;
	}

	public void setErrorProcessMet(String errorProcessMet) {
		this.errorProcessMet = errorProcessMet;
	}

	public String getErrorMessageNm() {
		return errorMessageNm;
	}

	public void setErrorMessageNm(String errorMessageNm) {
		this.errorMessageNm = errorMessageNm;
	}
}
