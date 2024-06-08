package com.oneslogi.base.dbflute.dto;

import com.oneslogi.base.dbflute.dto.bs.BsWReplenishInstInputDto;

/**
 * The entity of W_REPLENISH_INST_INPUT.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class WReplenishInstInputDto extends BsWReplenishInstInputDto {

    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;
    
    /** 拠点マスタ */
    private MCenterDto mCenterDto;
    
    /** 荷主マスタ */
    private MClientDto mClientDto;
    
    /** エラー処理方法 */
    private String errorProcessMet;
    
    /** エラーのみ表示 */
    private String chkErrorShow;
    
	public String getChkErrorShow() {
		return chkErrorShow;
	}

	public void setChkErrorShow(String chkErrorShow) {
		this.chkErrorShow = chkErrorShow;
	}

	public String getErrorProcessMet() {
		return errorProcessMet;
	}

	public void setErrorProcessMet(String errorProcessMet) {
		this.errorProcessMet = errorProcessMet;
	}

	public MCenterDto getmCenterDto() {
		return mCenterDto;
	}

	public void setmCenterDto(MCenterDto mCenterDto) {
		this.mCenterDto = mCenterDto;
	}

	public MClientDto getmClientDto() {
		return mClientDto;
	}

	public void setmClientDto(MClientDto mClientDto) {
		this.mClientDto = mClientDto;
	}
}
