package com.oneslogi.base.dbflute.dto;

import com.oneslogi.base.dbflute.dto.bs.BsTStoreRecordHDto;

/**
 * The entity of T_STORE_RECORD_H.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class TStoreRecordHDto extends BsTStoreRecordHDto {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    //入庫No.管理フラグ
  	private String storeNoFlg;

	public String getStoreNoFlg() {
		return storeNoFlg;
	}

	public void setStoreNoFlg(String storeNoFlg) {
		this.storeNoFlg = storeNoFlg;
	}
}
