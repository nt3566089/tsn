package com.oneslogi.base.dbflute.dto;

import com.oneslogi.base.dbflute.dto.bs.BsMProcessTypeDto;

/**
 * The entity of M_PROCESS_TYPE.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class MProcessTypeDto extends BsMProcessTypeDto {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;
	// ===== 導出カラム =====

	// 行番号
	private String lineNo;

	private String processTypeNm;

	// ===== 以下Eclipse自動生成のアクセサメソッド =====

	public String getLineNo() {
		return lineNo;
	}

	public void setLineNo(String lineNo) {
		this.lineNo = lineNo;
	}

	public String getProcessTypeNm() {
		return processTypeNm;
	}

	public void setProcessTypeNm(String processTypeNm) {
		this.processTypeNm = processTypeNm;
	}
}
