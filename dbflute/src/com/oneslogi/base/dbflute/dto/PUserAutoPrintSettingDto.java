package com.oneslogi.base.dbflute.dto;

import com.oneslogi.base.dbflute.dto.bs.BsPUserAutoPrintSettingDto;

/**
 * The entity of p_user_auto_print_setting.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class PUserAutoPrintSettingDto extends BsPUserAutoPrintSettingDto {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    // 帳票レイアウト名
    private String reportLayoutNm;
    // プリンタグループ名
    private String printerGroupNm;
    // プリンタ名
    private String printerNm;
    // トレイ名
    private String trayNm;


	/**
	 * @return reportLayoutNm
	 */
	public String getReportLayoutNm() {
		return reportLayoutNm;
	}

	/**
	 * @param reportLayoutNm セットする reportLayoutNm
	 */
	public void setReportLayoutNm(String reportLayoutNm) {
		this.reportLayoutNm = reportLayoutNm;
	}

	/**
	 * @return printerGroupNm
	 */
	public String getPrinterGroupNm() {
		return printerGroupNm;
	}

	/**
	 * @param printerGroupNm セットする printerGroupNm
	 */
	public void setPrinterGroupNm(String printerGroupNm) {
		this.printerGroupNm = printerGroupNm;
	}

	/**
	 * @return printerNm
	 */
	public String getPrinterNm() {
		return printerNm;
	}

	/**
	 * @param printerNm セットする printerNm
	 */
	public void setPrinterNm(String printerNm) {
		this.printerNm = printerNm;
	}

	/**
	 * @return trayNm
	 */
	public String getTrayNm() {
		return trayNm;
	}

	/**
	 * @param trayNm セットする trayNm
	 */
	public void setTrayNm(String trayNm) {
		this.trayNm = trayNm;
	}

	// [#6677][v3.1] 端末別自動印刷設定機能の追加 2019.09.02 kawana Start
    private String terminalAssignCd;

	public String getTerminalAssignCd() {
		return terminalAssignCd;
	}

	public void setTerminalAssignCd(String terminalAssignCd) {
		this.terminalAssignCd = terminalAssignCd;
	}
	// [#6677][v3.1] 端末別自動印刷設定機能の追加 2019.09.02 kawana End
}
