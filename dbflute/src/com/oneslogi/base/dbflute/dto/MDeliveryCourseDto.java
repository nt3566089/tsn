package com.oneslogi.base.dbflute.dto;

import com.oneslogi.base.dbflute.dto.bs.BsMDeliveryCourseDto;

/**
 * The entity of M_DELIVERY_COURSE.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class MDeliveryCourseDto extends BsMDeliveryCourseDto {

	/** Serial version UID. (Default) */
	private static final long serialVersionUID = 1L;

	// [C-EC-0007] 配送コースマスタと送り状定義マスタの紐付け追加 2015.01.30 kawana Start
	// [Ver２．１向けエンハンス] 荷札出力対応 C-CWMS-0058 2016/07/06 HDIS Start
	// 送り状データ種別
//	private String tagType;
	private String slipTagType;
	// [Ver２．１向けエンハンス] 荷札出力対応 C-CWMS-0058 2016/07/06 HDIS End

	private String deliveryCourseCd0;

	public String getDeliveryCourseCd0() {
		return deliveryCourseCd0;
	}

	public void setDeliveryCourseCd0(String deliveryCourseCd0) {
		this.deliveryCourseCd0 = deliveryCourseCd0;
	}

	// [Ver２．１向けエンハンス] 荷札出力対応 C-CWMS-0058 2016/07/06 HDIS Start
//	public String getTagType() {
//		return tagType;
//	}
//
//	public void setTagType(String tagType) {
//		this.tagType = tagType;
//	}
	public String getSlipTagType() {
		return slipTagType;
	}

	public void setSlipTagType(String slipTagType) {
		this.slipTagType = slipTagType;
	}
	// [Ver２．１向けエンハンス] 荷札出力対応 C-CWMS-0058 2016/07/06 HDIS End
	// [C-EC-0007] 配送コースマスタと送り状定義マスタの紐付け追加 2015.01.30 kawana End
}
