package com.oneslogi.base.dbflute.dto;

import com.oneslogi.base.dbflute.dto.bs.BsMHtDictCultureDto;

/**
 * The entity of m_ht_dict_culture.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class MHtDictCultureDto extends BsMHtDictCultureDto {

	/** Serial version UID. (Default) */
	private static final long serialVersionUID = 1L;

	//[#2873] [HTマスタ化対応]  HT辞書カルチャマスタメンテナンス画面追加 2017.10.18 fujiwara Start
	// 辞書名（変更前）
	private String oldDictNm;

	public String getOldDictNm() {
		return oldDictNm;
	}

	public void setOldDictNm(String oldDictNm) {
		this.oldDictNm = oldDictNm;
	}
	//[#2873] [HTマスタ化対応]  HT辞書カルチャマスタメンテナンス画面追加 2017.10.18 fujiwara End
}
