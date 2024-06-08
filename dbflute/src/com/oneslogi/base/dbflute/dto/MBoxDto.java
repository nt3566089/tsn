package com.oneslogi.base.dbflute.dto;

import com.oneslogi.base.dbflute.dto.bs.BsMBoxDto;

/**
 * The entity of M_BOX.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class MBoxDto extends BsMBoxDto {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

	// ===== 導出カラム =====

	// [#1798] 不要なコード(行No.)を削除 2017.05.31 kawana

	/** 標準荷材フラグ */
	private Boolean standardFlg;

	// ===== 以下Eclipse自動生成のアクセサメソッド =====

	/**
	 * @return standardFlg
	 */
	public Boolean getStandardFlg() {
		return standardFlg;
	}

	/**
	 * @param standardFlg セットする standardFlg
	 */
	public void setStandardFlg(Boolean standardFlg) {
		this.standardFlg = standardFlg;
	}
}
