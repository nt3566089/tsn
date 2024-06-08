package com.oneslogi.wms.dto.report;

import java.math.BigDecimal;

import com.oneslogi.base.dto.ReportDto;

/**
 * 仕分明細書DTOクラス
 */
public class SortingDtlListDto extends ReportDto {

	/** 使用箱 */
	public String usedBox;
	/** 作成日 */
	public String createDate;
	/** 作成時間 */
	public String createTime;
	/** 配達拠点 */
	public String centerNm;
	/** ライン/ブロック */
	public String lineBlockNum;
	/** 箱番号 */
	public String boxNo;
	/** メッセージ */
	public String message;
	/** 累計ｶｰﾄﾝ */
	public BigDecimal totalCartonQty;
	/** 配達日 */
	public String deliveryDate;
	/** 方面 */
	public String directionCd;
	/** 通番 */
	public String serialNum;
	/** お得意様コード */
	public String customerCd;
	/** お得意様名 */
	public String customerNm;
	/** ライン計 */
	public BigDecimal totalLineQty;
	/** ブロック計 */
	public BigDecimal totalBlockQty;
	/** 丸段 */
	public BigDecimal totalSprqaQty;
	/** 総合計 */
	public BigDecimal grandTotalQty;
	/** ロケーション1 */
	public String location1;
	/** ロケーション2 */
	public String location2;
	/** ｶｰﾄﾝ数量 */
	public BigDecimal cartonQty;
	/** 銘柄名 */
	public String itemNm;
	/** 箱またがりマーク */
	public String boxMark;
	/** 仕分順 */
	public BigDecimal sortingOrder;
	/** 配達通番印刷順 */
	public BigDecimal printOrder;
	/** 配達通番枝番 */
	public BigDecimal branchNum;
	/** メッセージ表示区分 */
	public String messageType;
	/** グループ内のページ数 */
	public Integer groupPageNo;
	/** グループ内の総ページ数 */
	public Integer groupTotalPageNo;

	// ===== 以下、ゲッタ・セッタ =====

	public String getUsedBox() {
		return usedBox;
	}

	public void setUsedBox(String usedBox) {
		this.usedBox = usedBox;
	}

	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getCenterNm() {
		return centerNm;
	}

	public void setCenterNm(String centerNm) {
		this.centerNm = centerNm;
	}

	public String getLineBlockNum() {
		return lineBlockNum;
	}

	public void setLineBlockNum(String lineBlockNum) {
		this.lineBlockNum = lineBlockNum;
	}

	public String getBoxNo() {
		return boxNo;
	}

	public void setBoxNo(String boxNo) {
		this.boxNo = boxNo;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public BigDecimal getTotalCartonQty() {
		return totalCartonQty;
	}

	public void setTotalCartonQty(BigDecimal totalCartonQty) {
		this.totalCartonQty = totalCartonQty;
	}

	public String getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(String deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public String getDirectionCd() {
		return directionCd;
	}

	public void setDirectionCd(String directionCd) {
		this.directionCd = directionCd;
	}
	
	public String getSerialNum() {
		return serialNum;
	}

	public void setSerialNum(String serialNum) {
		this.serialNum = serialNum;
	}


	public String getCustomerCd() {
		return customerCd;
	}

	public void setCustomerCd(String customerCd) {
		this.customerCd = customerCd;
	}

	public String getCustomerNm() {
		return customerNm;
	}

	public void setCustomerNm(String customerNm) {
		this.customerNm = customerNm;
	}

	public BigDecimal getTotalLineQty() {
		return totalLineQty;
	}

	public void setTotalLineQty(BigDecimal totalLineQty) {
		this.totalLineQty = totalLineQty;
	}

	public BigDecimal getTotalBlockQty() {
		return totalBlockQty;
	}

	public void setTotalBlockQty(BigDecimal totalBlockQty) {
		this.totalBlockQty = totalBlockQty;
	}

	public BigDecimal getTotalSprqaQty() {
		return totalSprqaQty;
	}

	public void setTotalSprqaQty(BigDecimal totalSprqaQty) {
		this.totalSprqaQty = totalSprqaQty;
	}

	public BigDecimal getGrandTotalQty() {
		return grandTotalQty;
	}

	public void setGrandTotalQty(BigDecimal grandTotalQty) {
		this.grandTotalQty = grandTotalQty;
	}

	public String getLocation1() {
		return location1;
	}

	public void setLocation1(String location1) {
		this.location1 = location1;
	}

	public String getLocation2() {
		return location2;
	}

	public void setLocation2(String location2) {
		this.location2 = location2;
	}

	public BigDecimal getCartonQty() {
		return cartonQty;
	}

	public void setCartonQty(BigDecimal cartonQty) {
		this.cartonQty = cartonQty;
	}

	public String getItemNm() {
		return itemNm;
	}

	public void setItemNm(String itemNm) {
		this.itemNm = itemNm;
	}

	public String getBoxMark() {
		return boxMark;
	}

	public void setBoxMark(String boxMark) {
		this.boxMark = boxMark;
	}

	public BigDecimal getSortingOrder() {
		return sortingOrder;
	}

	public void setSortingOrder(BigDecimal sortingOrder) {
		this.sortingOrder = sortingOrder;
	}

	public BigDecimal getPrintOrder() {
		return printOrder;
	}

	public void setPrintOrder(BigDecimal printOrder) {
		this.printOrder = printOrder;
	}

	public BigDecimal getBranchNum() {
		return branchNum;
	}

	public void setBranchNum(BigDecimal branchNum) {
		this.branchNum = branchNum;
	}

	public String getMessageType() {
		return messageType;
	}

	public void setMessageType(String messageType) {
		this.messageType = messageType;
	}

	public Integer getGroupPageNo() {
		return groupPageNo;
	}

	public void setGroupPageNo(Integer groupPageNo) {
		this.groupPageNo = groupPageNo;
	}

	public Integer getGroupTotalPageNo() {
		return groupTotalPageNo;
	}

	public void setGroupTotalPageNo(Integer groupTotalPageNo) {
		this.groupTotalPageNo = groupTotalPageNo;
	}

}
