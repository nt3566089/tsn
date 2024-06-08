package com.oneslogi.base.dbflute.dto;

import com.oneslogi.base.dbflute.dto.bs.BsMClientCenterDto;

/**
 * The entity of M_CLIENT_CENTER.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class MClientCenterDto extends BsMClientCenterDto {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    /** システム管理日付(翌稼働日) */
    private String systemDateAdd;

	// 行番号
	private String lineNo;

	// バッチ処理中フラグ
	private String batchProgressFlgNm;

	// ===== 以下Eclipse自動生成のアクセサメソッド =====

	public String getLineNo() {
		return lineNo;
	}

	public void setLineNo(String lineNo) {
		this.lineNo = lineNo;
	}

	/**
	 * @return numDif
	 */
	public String getSystemDateAdd() {
		return systemDateAdd;
	}

	/**
	 * @param numDiff セットする numDiff
	 */
	public void setSystemDateAdd(String systemDateAdd) {
		this.systemDateAdd = systemDateAdd;
	}

	public String getBatchProgressFlgNm() {
		return batchProgressFlgNm;
	}

	public void setBatchProgressFlgNm(String batchProgressFlgNm) {
		this.batchProgressFlgNm = batchProgressFlgNm;
	}
}
