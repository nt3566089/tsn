package com.oneslogi.base.dbflute.dto;

import com.oneslogi.base.dbflute.dto.bs.BsTLotDto;

/**
 * The entity of T_LOT.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class TLotDto extends BsTLotDto {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    // ===== 導出カラム =====

 	// 期限日(From)
    protected String limitDtFrom;

    // 期限日(To)
    protected String limitDtTo;

    // 期限日数
    private String limitDtNum;

    // ===== 以下Eclipse自動生成のアクセサメソッド =====

	public String getLimitDtFrom() {
		return limitDtFrom;
	}

	public void setLimitDtFrom(String limitDtFrom) {
		this.limitDtFrom = limitDtFrom;
	}

	public String getLimitDtTo() {
		return limitDtTo;
	}

	public void setLimitDtTo(String limitDtTo) {
		this.limitDtTo = limitDtTo;
	}

	public String getLimitDtNum() {
        return limitDtNum;
    }

    public void setLimitDtNum(String limitDtNum) {
        this.limitDtNum = limitDtNum;
    }
}
