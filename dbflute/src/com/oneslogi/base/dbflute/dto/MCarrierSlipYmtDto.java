package com.oneslogi.base.dbflute.dto;

import com.oneslogi.base.dbflute.dto.bs.BsMCarrierSlipYmtDto;

/**
 * The entity of m_carrier_slip_ymt.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class MCarrierSlipYmtDto extends BsMCarrierSlipYmtDto {

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
