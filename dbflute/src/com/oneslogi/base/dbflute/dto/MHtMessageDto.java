package com.oneslogi.base.dbflute.dto;

import com.oneslogi.base.dbflute.dto.bs.BsMHtMessageDto;

/**
 * The entity of m_ht_message.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class MHtMessageDto extends BsMHtMessageDto {

	//[#2873] [HTマスタ化対応]  HTメッセージマスタメンテナンス画面追加 2017.10.24 fujiwara Start
	/** Serial version UID. (Default) */
	private static final long serialVersionUID = 1L;
	//メッセージ名(変更前)
	private String oldMessageNm;

	public String getOldMessageNm() {
		return oldMessageNm;
	}

	public void setOldMessageNm(String oldMessageNm) {
		this.oldMessageNm = oldMessageNm;
	}
	//[#2873] [HTマスタ化対応]  HTメッセージマスタメンテナンス画面追加 2017.10.24 fujiwara End
}
