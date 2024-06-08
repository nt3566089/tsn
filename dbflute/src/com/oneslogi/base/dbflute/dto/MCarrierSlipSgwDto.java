package com.oneslogi.base.dbflute.dto;

import com.oneslogi.base.dbflute.dto.bs.BsMCarrierSlipSgwDto;

/**
 * The entity of m_carrier_slip_sgw.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class MCarrierSlipSgwDto extends BsMCarrierSlipSgwDto {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

	// 行番号
	private String lineNo;

	// ===== 以下Eclipse自動生成のアクセサメソッド =====

	public String getLineNo() {
		return lineNo;
	}

	public void setLineNo(String lineNo) {
		this.lineNo = lineNo;
	}
}
