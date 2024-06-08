package com.oneslogi.base.dbflute.exentity;

import com.oneslogi.base.dbflute.bsentity.BsPReportLayout;

/**
 * The entity of P_REPORT_LAYOUT.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class PReportLayout extends BsPReportLayout {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

   	// ===== chaseメソッド(DBFlute 1.0.5N ⇒ 1.2.0対応) =====

    public PReport chasePReport() {
        return _pReport != null ? _pReport : new PReport();
    }

   	// ======================================================

    private String displayFlg;
    public String getDisplayFlg() {
		return displayFlg;
	}
    public void setDisplayFlg(String displayFlg) {
		this.displayFlg = displayFlg;
	}
}
