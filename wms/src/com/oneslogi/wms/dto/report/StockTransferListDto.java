package com.oneslogi.wms.dto.report;

import com.oneslogi.base.dto.ReportDto;

/**
 * 山出しリストDTOクラス
 */
public class StockTransferListDto extends ReportDto {

	/** 注意喚起コメント */
	public String alertComment;
	/** コメント */
	public String directionComment;
	/** 山出し日 */
	public String pickListDate;
	/** 補充先 */
	public String lineBlock;
	/** 仕分ラック */
	public String sortingRackNo;
	/** 種別 */
	public String typeText;
	/** 月替りデ変 */
	public String monthText;
	/** 補充区分 */
	public String orderType;
	/** 山出しリストNo. */
	public String pickListKey;
	/** 月替りデ変区分 */
	public String monthFlg;
	/** 山出しルート順 */
	public String outSeq;
	/** 補充先ソートキー */
	public String rmaNo;
	/** フロントラック区分 */
	public String frontRackFlg;
	/** 通常異型品区分 */
	public String stdDifFlg;
	/** 山出しタイプ */
	public String pickList;
	/** ソート用補充区分 */
	public String shopToSub;
	/** 山出しリスト明細行№ */
	public Long pickListGNo;
	/** 引当ロケ */
	public String allocLoc;
	/** 銘柄CD */
	public String productCd;
	/** 銘柄名称 */
	public String productNm;
	/** 指示数量（ケース） */
	public Long qtyCase;
	/** 指示数量（カートン） */
	public Long qtyBowl;
	/** デザイン区分 */
	public String designFlg;
	/** 製造年月日 */
	public String manufactureDate;
	/** 仕分ロケ */
	public String sotedLoc;
	/** アスタリスク */
	public String asteriskText;
	/** 拠点CD */
	public String centerCd;
	/** 拠点名称 */
	public String centerNm;
	/** ユーザ名称 */
	public String userNm;
	/** ユーザコード */
	public String userCd;

	// ===== 以下、ゲッタ・セッタ =====

	public String getAlertComment() {
		return alertComment;
	}

	public void setAlertComment(String alertComment) {
		this.alertComment = alertComment;
	}

	public String getDirectionComment() {
		return directionComment;
	}

	public void setDirectionComment(String directionComment) {
		this.directionComment = directionComment;
	}

	public String getPickListDate() {
		return pickListDate;
	}

	public void setPickListDate(String pickListDate) {
		this.pickListDate = pickListDate;
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

	public String getTypeText() {
		return typeText;
	}

	public void setTypeText(String typeText) {
		this.typeText = typeText;
	}

	public String getMonthText() {
		return monthText;
	}

	public void setMonthText(String monthText) {
		this.monthText = monthText;
	}

	public String getOrderType() {
		return orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public String getPickListKey() {
		return pickListKey;
	}

	public void setPickListKey(String pickListKey) {
		this.pickListKey = pickListKey;
	}

	public String getMonthFlg() {
		return monthFlg;
	}

	public void setMonthFlg(String monthFlg) {
		this.monthFlg = monthFlg;
	}

	public String getOutSeq() {
		return outSeq;
	}

	public void setOutSeq(String outSeq) {
		this.outSeq = outSeq;
	}

	public String getRmaNo() {
		return rmaNo;
	}

	public void setRmaNo(String rmaNo) {
		this.rmaNo = rmaNo;
	}

	public String getFrontRackFlg() {
		return frontRackFlg;
	}

	public void setFrontRackFlg(String frontRackFlg) {
		this.frontRackFlg = frontRackFlg;
	}

	public String getStdDifFlg() {
		return stdDifFlg;
	}

	public void setStdDifFlg(String stdDifFlg) {
		this.stdDifFlg = stdDifFlg;
	}

	public String getPickList() {
		return pickList;
	}

	public void setPickList(String pickList) {
		this.pickList = pickList;
	}

	public String getShopToSub() {
		return shopToSub;
	}

	public void setShopToSub(String shopToSub) {
		this.shopToSub = shopToSub;
	}

	public Long getPickListGNo() {
		return pickListGNo;
	}

	public void setPickListGNo(Long pickListGNo) {
		this.pickListGNo = pickListGNo;
	}

	public String getAllocLoc() {
		return allocLoc;
	}

	public void setAllocLoc(String allocLoc) {
		this.allocLoc = allocLoc;
	}

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

	public String getDesignFlg() {
		return designFlg;
	}

	public void setDesignFlg(String designFlg) {
		this.designFlg = designFlg;
	}

	public String getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(String manufactureDate) {
		this.manufactureDate = manufactureDate;
	}

	public String getSotedLoc() {
		return sotedLoc;
	}

	public void setSotedLoc(String sotedLoc) {
		this.sotedLoc = sotedLoc;
	}

	public String getAsteriskText() {
		return asteriskText;
	}

	public void setAsteriskText(String asteriskText) {
		this.asteriskText = asteriskText;
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
