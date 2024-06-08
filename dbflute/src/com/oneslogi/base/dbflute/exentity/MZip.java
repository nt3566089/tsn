package com.oneslogi.base.dbflute.exentity;

import com.oneslogi.base.dbflute.bsentity.BsMZip;

/**
 * The entity of M_ZIP.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class MZip extends BsMZip {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    /** エラーのみ表示 */
    private String chkErrorShow;

    /** エラーメッセージ */
    private String errorFlg;
    private String errorMessageCd;
    private String errorMessageNm;

    /** 行番号 */
    private String lineNo;

    /** エラー処理方法 */
    private String errorProcessMet;

    private String eZipId;

    public String getChkErrorShow() {
        return chkErrorShow;
    }

    public void setChkErrorShow(String chkErrorShow) {
        this.chkErrorShow = chkErrorShow;
    }

    public String getErrorFlg() {
        return errorFlg;
    }

    public void setErrorFlg(String errorFlg) {
        this.errorFlg = errorFlg;
    }

    public String getErrorMessageCd() {
        return errorMessageCd;
    }

    public void setErrorMessageCd(String errorMessageCd) {
        this.errorMessageCd = errorMessageCd;
    }

    public String getErrorMessageNm() {
        return errorMessageNm;
    }

    public void setErrorMessageNm(String errorMessageNm) {
        this.errorMessageNm = errorMessageNm;
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

    public String getEZipId() {
        return eZipId;
    }

    public void setEZipId(String eZipId) {
        this.eZipId = eZipId;
    }

}
