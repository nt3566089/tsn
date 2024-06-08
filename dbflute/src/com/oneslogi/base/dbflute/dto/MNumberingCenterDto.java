package com.oneslogi.base.dbflute.dto;

import com.oneslogi.base.dbflute.dto.bs.BsMNumberingCenterDto;

/**
 * The entity of M_NUMBERING_CENTER.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class MNumberingCenterDto extends BsMNumberingCenterDto {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

	// キャッシュ使用数
	private Long cashUseCount;

	// [#1077][ver2.2.1]採番例追加 2017.08.16 miyabe Start
	private String numberingSample;

	/**
	 * numberingSampleを取得します。
	 * @return numberingSample
	 */
	public String getNumberingSample() {
	    return numberingSample;
	}

	/**
	 * numberingSampleを設定します。
	 * @param numberingSample numberingSample
	 */
	public void setNumberingSample(String numberingSample) {
	    this.numberingSample = numberingSample;
	}
	// [#1077][ver2.2.1]採番例追加 2017.08.16 miyabe End

    /**
	 * @return cashUseCount
	 */
	public Long getCashUseCount() {
		return cashUseCount;
	}

	/**
	 * @param cashUseCount セットする cashUseCount
	 */
	public void setCashUseCount(Long cashUseCount) {
		this.cashUseCount = cashUseCount;
	}


}
