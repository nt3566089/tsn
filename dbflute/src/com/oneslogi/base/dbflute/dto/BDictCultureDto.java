package com.oneslogi.base.dbflute.dto;

import com.oneslogi.base.dbflute.dto.bs.BsBDictCultureDto;

/**
 * The entity of B_DICT_CULTURE.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class BDictCultureDto extends BsBDictCultureDto {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;


    // 行番号
 	private String lineNo;

 	public String getLineNo() {
 		return lineNo;
 	}

 	public void setLineNo(String lineNo) {
 		this.lineNo = lineNo;
 	}

    // 辞書名（変更前）
 	private String oldDictNm;

 	public String getOldDictNm() {
		return oldDictNm;
	}
	public void setOldDictNm(String oldDictNm) {
		this.oldDictNm = oldDictNm;
	}
}
