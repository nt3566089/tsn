package com.oneslogi.base.dbflute.dto;

import com.oneslogi.base.dbflute.dto.bs.BsMImportTypeBDto;

/**
 * The entity of m_import_type_b.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class MImportTypeBDto extends BsMImportTypeBDto {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

	// [C-CWMS-0026] 品名1～5などをEC受注テーブルから設定できるように変更 2015.05.27 kawana Start
	private String copyHColumnNm;
	private String copyBColumnNm;
	// [C-CWMS-0026] 品名1～5などをEC受注テーブルから設定できるように変更 2015.05.27 kawana End

	public String getCopyHColumnNm() {
		return copyHColumnNm;
	}

	public void setCopyHColumnNm(String copyHColumnNm) {
		this.copyHColumnNm = copyHColumnNm;
	}

	public String getCopyBColumnNm() {
		return copyBColumnNm;
	}

	public void setCopyBColumnNm(String copyBColumnNm) {
		this.copyBColumnNm = copyBColumnNm;
	}
}
