package com.oneslogi.base.dbflute.dto;

import com.oneslogi.base.dbflute.dto.bs.BsPReportLayoutDto;

/**
 * The entity of P_REPORT_LAYOUT.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class PReportLayoutDto extends BsPReportLayoutDto {

	/** Serial version UID. (Default) */
	private static final long serialVersionUID = 1L;

	protected String _displayFlg;

	public String getDisplayFlg() {
		return _displayFlg;
	}

	public void setDisplayFlg(String displayFlg) {
		__modifiedProperties.add("_displayFlg");
		this._displayFlg = displayFlg;
	}
}
