package com.oneslogi.base.dbflute.exentity.customize;

import com.oneslogi.base.dbflute.bsentity.customize.BsSqlEZipList;

/**
 * The entity of SqlEZipList.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class SqlEZipList extends BsSqlEZipList {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    /** フラグ1 */
    private String flg1Nm;
    /** フラグ2 */
    private String flg2Nm;
    /** フラグ3 */
    private String flg3Nm;
    /** フラグ4 */
    private String flg4Nm;
    /** 更新区分 */
    private String updTypeNm;
    /** 変更理由 */
    private String reasonTypeNm;
    /** フラグ5 */
    private String flg5Nm;
    /** フラグ6 */
    private String flg6Nm;
    /** 修正コード */
    private String updCdNm;
    /** 大口フラグ */
    private String companyFlgNm;
    
    /** 行番号 */
    private String lineNo;

    /** エラーのみ表示 */
    private String chkErrorShow;

    /** エラー処理方法 */
    private String errorProcessMet;

    /** 検索件数 */
    private int counter;

    /** 郵便番号種別 */
    private String uploadZipType;

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    /**
     * フラグ1を取得します。
     * @return フラグ1
     */
    public String getFlg1Nm() {
        return flg1Nm;
    }

    /**
     * フラグ1を設定します。
     * @param flg1Nm フラグ1
     */
    public void setFlg1Nm(String flg1Nm) {
        this.flg1Nm = flg1Nm;
    }

    /**
     * フラグ2を取得します。
     * @return フラグ2
     */
    public String getFlg2Nm() {
        return flg2Nm;
    }

    /**
     * フラグ2を設定します。
     * @param flg2Nm フラグ2
     */
    public void setFlg2Nm(String flg2Nm) {
        this.flg2Nm = flg2Nm;
    }

    /**
     * フラグ3を取得します。
     * @return フラグ3
     */
    public String getFlg3Nm() {
        return flg3Nm;
    }

    /**
     * フラグ3を設定します。
     * @param flg3Nm フラグ3
     */
    public void setFlg3Nm(String flg3Nm) {
        this.flg3Nm = flg3Nm;
    }

    /**
     * フラグ4を取得します。
     * @return フラグ4
     */
    public String getFlg4Nm() {
        return flg4Nm;
    }

    /**
     * フラグ4を設定します。
     * @param flg4Nm フラグ4
     */
    public void setFlg4Nm(String flg4Nm) {
        this.flg4Nm = flg4Nm;
    }

    /**
     * 更新区分を取得します。
     * @return 更新区分
     */
    public String getUpdTypeNm() {
        return updTypeNm;
    }

    /**
     * 更新区分を設定します。
     * @param updTypeNm 更新区分
     */
    public void setUpdTypeNm(String updTypeNm) {
        this.updTypeNm = updTypeNm;
    }

    /**
     * 変更理由を取得します。
     * @return 変更理由
     */
    public String getReasonTypeNm() {
        return reasonTypeNm;
    }

    /**
     * 変更理由を設定します。
     * @param reasonTypeNm 変更理由
     */
    public void setReasonTypeNm(String reasonTypeNm) {
        this.reasonTypeNm = reasonTypeNm;
    }

    /**
     * フラグ5を取得します。
     * @return フラグ5
     */
    public String getFlg5Nm() {
        return flg5Nm;
    }

    /**
     * フラグ5を設定します。
     * @param flg5Nm フラグ5
     */
    public void setFlg5Nm(String flg5Nm) {
        this.flg5Nm = flg5Nm;
    }

    /**
     * フラグ6を取得します。
     * @return フラグ6
     */
    public String getFlg6Nm() {
        return flg6Nm;
    }

    /**
     * フラグ6を設定します。
     * @param flg6Nm フラグ6
     */
    public void setFlg6Nm(String flg6Nm) {
        this.flg6Nm = flg6Nm;
    }

    /**
     * 修正コードを取得します。
     * @return 修正コード
     */
    public String getUpdCdNm() {
        return updCdNm;
    }

    /**
     * 修正コードを設定します。
     * @param updCdNm 修正コード
     */
    public void setUpdCdNm(String updCdNm) {
        this.updCdNm = updCdNm;
    }

    /**
     * 大口フラグを取得します。
     * @return 大口フラグ
     */
    public String getCompanyFlgNm() {
        return companyFlgNm;
    }

    /**
     * 大口フラグを設定します。
     * @param companyFlgNm 大口フラグ
     */
    public void setCompanyFlgNm(String companyFlgNm) {
        this.companyFlgNm = companyFlgNm;
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

    public String getUploadZipType() {
        return uploadZipType;
    }

    public void setUploadZipType(String uploadZipType) {
        this.uploadZipType = uploadZipType;
    }

}
