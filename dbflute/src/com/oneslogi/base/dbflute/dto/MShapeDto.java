package com.oneslogi.base.dbflute.dto;

import com.oneslogi.base.dbflute.dto.bs.BsMShapeDto;

/**
 * The entity of M_SHAPE.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class MShapeDto extends BsMShapeDto {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

	// [エンハンス PH2.0] 荷姿マスタを追加 2015.11.13 sja Start

	// [#1798] 不要なコード(行No.)を削除 2017.05.31 kawana

	private String shapeNm;

	// [エンハンス PH2.0] 荷姿マスタを追加 2015.11.13 sja End

	// ===== 以下Eclipse自動生成のアクセサメソッド =====

	public String getShapeNm() {
		return shapeNm;
	}

	public void setShapeNm(String shapeNm) {
		this.shapeNm = shapeNm;
	}
}
