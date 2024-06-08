package com.oneslogi.base.dbflute.dto;

import com.oneslogi.base.dbflute.dto.bs.BsMStockTypeDto;

/**
 * The entity of M_STOCK_TYPE.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class MStockTypeDto extends BsMStockTypeDto {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;
	// ===== 導出カラム =====

	// 行番号
	private String lineNo;

	private String stockTypeNm;

	// ===== 以下Eclipse自動生成のアクセサメソッド =====

	public String getStockTypeNm() {
		return stockTypeNm;
	}

	public void setStockTypeNm(String stockTypeNm) {
		this.stockTypeNm = stockTypeNm;
	}

	public String getLineNo() {
		return lineNo;
	}

	public void setLineNo(String lineNo) {
		this.lineNo = lineNo;
	}
}
