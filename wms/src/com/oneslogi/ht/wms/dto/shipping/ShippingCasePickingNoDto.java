package com.oneslogi.ht.wms.dto.shipping;

import javax.ws.rs.QueryParam;

import com.oneslogi.ht.base.dto.HandyBaseDto;

/**
 * ケースピッキング(ケースピッキングNo入力)画面の情報を保持します。
 *
 */
public class ShippingCasePickingNoDto extends HandyBaseDto {

	// [#975] HTケースピッキング - 処理単位をピッキンググループNo.単位からケースピッキングNo.単位に変更 2017.02.21 kawana Start

	/** ケースピッキングNo */
	@QueryParam("casePickingNo")
	// [#575] ValidateチェックのHT国際化 2017.02.14 sja Start
//	@HTLengthCheck(min = 1, max = 11, fieldNm = "ケースピッキングNo")
//	@HTBlankCheck(fieldNm = "ケースピッキングNo")
	// [#575] ValidateチェックのHT国際化 2017.02.14 sja End
	public String casePickingNo;

	// [#975] HTケースピッキング - 処理単位をピッキンググループNo.単位からケースピッキングNo.単位に変更 2017.02.21 kawana End

	public String getCasePickingNo() {
		return casePickingNo;
	}

	public void setCasePickingNo(String casePickingNo) {
		this.casePickingNo = casePickingNo;
	}


}
