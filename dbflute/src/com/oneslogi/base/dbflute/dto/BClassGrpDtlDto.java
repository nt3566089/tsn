package com.oneslogi.base.dbflute.dto;

import com.oneslogi.base.dbflute.dto.bs.BsBClassGrpDtlDto;

/**
 * The entity of b_class_grp_dtl.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class BClassGrpDtlDto extends BsBClassGrpDtlDto {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    /** 選択フラグ **/
    private String selectFlg;

	/**
	 * @return 選択フラグ
	 */
	public String getSelectFlg() {
		return selectFlg;
	}

	/**
	 * @param 選択フラグ セットする 選択フラグ
	 */
	public void setSelectFlg(String selectFlg) {
		this.selectFlg = selectFlg;
	}
}
