package com.oneslogi.base.dbflute.dto;

import com.oneslogi.base.dbflute.dto.bs.BsMClientDto;

/**
 * The entity of M_CLIENT.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class MClientDto extends BsMClientDto {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

	// ===== 導出カラム =====

	// 行番号
	private String lineNo;

	// 選択
   	private String clientCheckBox;

	// ===== 以下Eclipse自動生成のアクセサメソッド =====

	public String getLineNo() {
		return lineNo;
	}

	public void setLineNo(String lineNo) {
		this.lineNo = lineNo;
	}

	public String getClientCheckBox() {
		return clientCheckBox;
	}

	public void setClientCheckBox(String clientCheckBox) {
		this.clientCheckBox = clientCheckBox;
	}
}
