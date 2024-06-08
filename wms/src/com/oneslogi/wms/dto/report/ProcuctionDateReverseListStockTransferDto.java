package com.oneslogi.wms.dto.report;

import com.oneslogi.base.dto.ReportDto;

/**
 * 製造年月日逆転リスト（山出し）DTOクラス
 */
public class ProcuctionDateReverseListStockTransferDto extends ReportDto {

	/** 銘柄コード */
	public String productCd;
	/** 銘柄名称 */
	public String productNm;
	/** 使用区分 */
	public String userNum1;
	/** 一般出力順 */
	public String userNum3;
	/** 月替り記号 */
	public String monthMark;
	/** 補充先 */
	public String lineBlock;
	/** 仕分ラック番号 */
	public String sortingRackNo;
	/** 仕分ロケ */
	public String asSortedUnit;
	/** デザイン区分 */
	public String lot3;
	/** 製造年月日 */
	public String lot4;
	/** 山出し数量（ケース） */
	public Long qtyCase;
	/** 山出し数量（カートン） */
	public Long qtyBowl;
	/** 補充先ソートキー */
	public String rmaNo;
	/** 月替りデ変区分 */
	public String monthFlg;
	/** 拠点コード */
	public String centerCd;
	/** 拠点名称 */
	public String centerNm;
	/** ユーザ名称 */
	public String userNm;
	/** ユーザコード */
	public String userCd;

	// ===== 以下、ゲッタ・セッタ =====

	public String getProductCd() {
		return productCd;
	}

	public void setProductCd(String productCd) {
		this.productCd = productCd;
	}

	public String getProductNm() {
		return productNm;
	}

	public void setProductNm(String productNm) {
		this.productNm = productNm;
	}

	public String getUserNum1() {
		return userNum1;
	}

	public void setUserNum1(String userNum1) {
		this.userNum1 = userNum1;
	}

	public String getUserNum3() {
		return userNum3;
	}

	public void setUserNum3(String userNum3) {
		this.userNum3 = userNum3;
	}

	public String getMonthMark() {
		return monthMark;
	}

	public void setMonthMark(String monthMark) {
		this.monthMark = monthMark;
	}

	public String getLineBlock() {
		return lineBlock;
	}

	public void setLineBlock(String lineBlock) {
		this.lineBlock = lineBlock;
	}

	public String getSortingRackNo() {
		return sortingRackNo;
	}

	public void setSortingRackNo(String sortingRackNo) {
		this.sortingRackNo = sortingRackNo;
	}

	public String getAsSortedUnit() {
		return asSortedUnit;
	}

	public void setAsSortedUnit(String asSortedUnit) {
		this.asSortedUnit = asSortedUnit;
	}

	public String getLot3() {
		return lot3;
	}

	public void setLot3(String lot3) {
		this.lot3 = lot3;
	}

	public String getLot4() {
		return lot4;
	}

	public void setLot4(String lot4) {
		this.lot4 = lot4;
	}

	public Long getQtyCase() {
		return qtyCase;
	}

	public void setQtyCase(Long qtyCase) {
		this.qtyCase = qtyCase;
	}

	public Long getQtyBowl() {
		return qtyBowl;
	}

	public void setQtyBowl(Long qtyBowl) {
		this.qtyBowl = qtyBowl;
	}

	public String getRmaNo() {
		return rmaNo;
	}

	public void setRmaNo(String rmaNo) {
		this.rmaNo = rmaNo;
	}

	public String getMonthFlg() {
		return monthFlg;
	}

	public void setMonthFlg(String monthFlg) {
		this.monthFlg = monthFlg;
	}

	public String getCenterCd() {
		return centerCd;
	}

	public void setCenterCd(String centerCd) {
		this.centerCd = centerCd;
	}

	public String getCenterNm() {
		return centerNm;
	}

	public void setCenterNm(String centerNm) {
		this.centerNm = centerNm;
	}

	public String getUserNm() {
		return userNm;
	}

	public void setUserNm(String userNm) {
		this.userNm = userNm;
	}

	public String getUserCd() {
		return userCd;
	}

	public void setUserCd(String userCd) {
		this.userCd = userCd;
	}

}
