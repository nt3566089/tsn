package com.oneslogi.base.dbflute.dto;

import com.oneslogi.base.dbflute.dto.bs.BsTWorkLogDto;

/**
 * The entity of t_work_log.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class TWorkLogDto extends BsTWorkLogDto {

	/** Serial version UID. (Default) */
	private static final long serialVersionUID = 1L;

	// [#3712] WAS連携用に作業中数をコア部で管理 2018.02.27 kawana Start

	/** 作業データの変更有無 */
	private boolean modifiedWorkData = false;

	/** 作業ログ完了のスキップ有無 */
	private boolean skipWorkLogEnd = false;

	// [#3712] WAS連携用に作業中数をコア部で管理 2018.02.27 kawana End

	// ===== 以下、セッタとゲッタ =====

	public boolean isModifiedWorkData() {
		return modifiedWorkData;
	}

	public void setModifiedWorkData(boolean modifiedWorkData) {
		this.modifiedWorkData = modifiedWorkData;
	}

	public boolean isSkipWorkLogEnd() {
		return skipWorkLogEnd;
	}

	public void setSkipWorkLogEnd(boolean skipWorkLogEnd) {
		this.skipWorkLogEnd = skipWorkLogEnd;
	}
}
