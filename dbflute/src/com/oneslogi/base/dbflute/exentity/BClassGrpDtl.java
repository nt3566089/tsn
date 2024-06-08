package com.oneslogi.base.dbflute.exentity;

import com.oneslogi.base.dbflute.bsentity.BsBClassGrpDtl;

/**
 * The entity of b_class_grp_dtl.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class BClassGrpDtl extends BsBClassGrpDtl {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

   	// ===== chaseメソッド(DBFlute 1.0.5N ⇒ 1.2.0対応) =====

    public BClassDtl chaseBClassDtl() {
        return _bClassDtl != null ? _bClassDtl : new BClassDtl();
    }

   	// ======================================================

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
