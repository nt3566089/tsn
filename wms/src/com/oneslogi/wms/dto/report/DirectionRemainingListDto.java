package com.oneslogi.wms.dto.report;

import com.oneslogi.base.dto.ReportDto;

/**
 * 方面別残数リストDTOクラス
 */
public class DirectionRemainingListDto extends ReportDto {

	/** 仕分作業回数 */
	public String sortingQty;
	/** ライン/ブロック */
	public String lineBlockNum;
	/** 作成日時 */
	public String createDate;
	/** 割込および仕分順1 */
	public String sortingOrderNum1;
	/** 割込および仕分順2 */
	public String sortingOrderNum2;
	/** 割込および仕分順3 */
	public String sortingOrderNum3;
	/** 割込および仕分順4 */
	public String sortingOrderNum4;
	/** 割込および仕分順5 */
	public String sortingOrderNum5;
	/** 割込および仕分順6 */
	public String sortingOrderNum6;
	/** 割込および仕分順7 */
	public String sortingOrderNum7;
	/** 割込および仕分順8 */
	public String sortingOrderNum8;
	/** 割込および仕分順9 */
	public String sortingOrderNum9;
	/** 割込および仕分順10 */
	public String sortingOrderNum10;
	/** 短縮組織名1 */
	public String centerAbbr1;
	/** 短縮組織名2 */
	public String centerAbbr2;
	/** 短縮組織名3 */
	public String centerAbbr3;
	/** 短縮組織名4 */
	public String centerAbbr4;
	/** 短縮組織名5 */
	public String centerAbbr5;
	/** 短縮組織名6 */
	public String centerAbbr6;
	/** 短縮組織名7 */
	public String centerAbbr7;
	/** 短縮組織名8 */
	public String centerAbbr8;
	/** 短縮組織名9 */
	public String centerAbbr9;
	/** 短縮組織名10 */
	public String centerAbbr10;
	/** 配達日1 */
	public String deliveryDate1;
	/** 配達日2 */
	public String deliveryDate2;
	/** 配達日3 */
	public String deliveryDate3;
	/** 配達日4 */
	public String deliveryDate4;
	/** 配達日5 */
	public String deliveryDate5;
	/** 配達日6 */
	public String deliveryDate6;
	/** 配達日7 */
	public String deliveryDate7;
	/** 配達日8 */
	public String deliveryDate8;
	/** 配達日9 */
	public String deliveryDate9;
	/** 配達日10 */
	public String deliveryDate10;
	/** 方面1 */
	public String directionCd1;
	/** 方面2 */
	public String directionCd2;
	/** 方面3 */
	public String directionCd3;
	/** 方面4 */
	public String directionCd4;
	/** 方面5 */
	public String directionCd5;
	/** 方面6 */
	public String directionCd6;
	/** 方面7 */
	public String directionCd7;
	/** 方面8 */
	public String directionCd8;
	/** 方面9 */
	public String directionCd9;
	/** 方面10 */
	public String directionCd10;
	/** ロケーション */
	public String locationCd;
	/** 繰越1 */
	public Long carryForwardQty1;
	/** 繰越2 */
	public Long carryForwardQty2;
	/** 残段ボール1 */
	public Long remainingCaseQty1;
	/** 残カートン1 */
	public Long remainingCartonQty1;
	/** 残段ボール2 */
	public Long remainingCaseQty2;
	/** 残カートン2 */
	public Long remainingCartonQty2;
	/** 残段ボール3 */
	public Long remainingCaseQty3;
	/** 残カートン3 */
	public Long remainingCartonQty3;
	/** 残段ボール4 */
	public Long remainingCaseQty4;
	/** 残カートン4 */
	public Long remainingCartonQty4;
	/** 残段ボール5 */
	public Long remainingCaseQty5;
	/** 残カートン5 */
	public Long remainingCartonQty5;
	/** 残段ボール6 */
	public Long remainingCaseQty6;
	/** 残カートン6 */
	public Long remainingCartonQty6;
	/** 残段ボール7 */
	public Long remainingCaseQty7;
	/** 残カートン7 */
	public Long remainingCartonQty7;
	/** 残段ボール8 */
	public Long remainingCaseQty8;
	/** 残カートン8 */
	public Long remainingCartonQty8;
	/** 残段ボール9 */
	public Long remainingCaseQty9;
	/** 残カートン9 */
	public Long remainingCartonQty9;
	/** 残段ボール10 */
	public Long remainingCaseQty10;
	/** 残カートン10 */
	public Long remainingCartonQty10;
	/** 銘柄名 */
	public String itemNm;
	/** 銘柄コード */
	public String itemCd;

	// ===== 以下、ゲッタ・セッタ =====

	public String getSortingQty() {
		return sortingQty;
	}

	public void setSortingQty(String sortingQty) {
		this.sortingQty = sortingQty;
	}

	public String getLineBlockNum() {
		return lineBlockNum;
	}

	public void setLineBlockNum(String lineBlockNum) {
		this.lineBlockNum = lineBlockNum;
	}

	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	public String getSortingOrderNum1() {
		return sortingOrderNum1;
	}

	public void setSortingOrderNum1(String sortingOrderNum1) {
		this.sortingOrderNum1 = sortingOrderNum1;
	}

	public String getSortingOrderNum2() {
		return sortingOrderNum2;
	}

	public void setSortingOrderNum2(String sortingOrderNum2) {
		this.sortingOrderNum2 = sortingOrderNum2;
	}

	public String getSortingOrderNum3() {
		return sortingOrderNum3;
	}

	public void setSortingOrderNum3(String sortingOrderNum3) {
		this.sortingOrderNum3 = sortingOrderNum3;
	}

	public String getSortingOrderNum4() {
		return sortingOrderNum4;
	}

	public void setSortingOrderNum4(String sortingOrderNum4) {
		this.sortingOrderNum4 = sortingOrderNum4;
	}

	public String getSortingOrderNum5() {
		return sortingOrderNum5;
	}

	public void setSortingOrderNum5(String sortingOrderNum5) {
		this.sortingOrderNum5 = sortingOrderNum5;
	}

	public String getSortingOrderNum6() {
		return sortingOrderNum6;
	}

	public void setSortingOrderNum6(String sortingOrderNum6) {
		this.sortingOrderNum6 = sortingOrderNum6;
	}

	public String getSortingOrderNum7() {
		return sortingOrderNum7;
	}

	public void setSortingOrderNum7(String sortingOrderNum7) {
		this.sortingOrderNum7 = sortingOrderNum7;
	}

	public String getSortingOrderNum8() {
		return sortingOrderNum8;
	}

	public void setSortingOrderNum8(String sortingOrderNum8) {
		this.sortingOrderNum8 = sortingOrderNum8;
	}

	public String getSortingOrderNum9() {
		return sortingOrderNum9;
	}

	public void setSortingOrderNum9(String sortingOrderNum9) {
		this.sortingOrderNum9 = sortingOrderNum9;
	}

	public String getSortingOrderNum10() {
		return sortingOrderNum10;
	}

	public void setSortingOrderNum10(String sortingOrderNum10) {
		this.sortingOrderNum10 = sortingOrderNum10;
	}

	public String getCenterAbbr1() {
		return centerAbbr1;
	}

	public void setCenterAbbr1(String centerAbbr1) {
		this.centerAbbr1 = centerAbbr1;
	}

	public String getCenterAbbr2() {
		return centerAbbr2;
	}

	public void setCenterAbbr2(String centerAbbr2) {
		this.centerAbbr2 = centerAbbr2;
	}

	public String getCenterAbbr3() {
		return centerAbbr3;
	}

	public void setCenterAbbr3(String centerAbbr3) {
		this.centerAbbr3 = centerAbbr3;
	}

	public String getCenterAbbr4() {
		return centerAbbr4;
	}

	public void setCenterAbbr4(String centerAbbr4) {
		this.centerAbbr4 = centerAbbr4;
	}

	public String getCenterAbbr5() {
		return centerAbbr5;
	}

	public void setCenterAbbr5(String centerAbbr5) {
		this.centerAbbr5 = centerAbbr5;
	}

	public String getCenterAbbr6() {
		return centerAbbr6;
	}

	public void setCenterAbbr6(String centerAbbr6) {
		this.centerAbbr6 = centerAbbr6;
	}

	public String getCenterAbbr7() {
		return centerAbbr7;
	}

	public void setCenterAbbr7(String centerAbbr7) {
		this.centerAbbr7 = centerAbbr7;
	}

	public String getCenterAbbr8() {
		return centerAbbr8;
	}

	public void setCenterAbbr8(String centerAbbr8) {
		this.centerAbbr8 = centerAbbr8;
	}

	public String getCenterAbbr9() {
		return centerAbbr9;
	}

	public void setCenterAbbr9(String centerAbbr9) {
		this.centerAbbr9 = centerAbbr9;
	}

	public String getCenterAbbr10() {
		return centerAbbr10;
	}

	public void setCenterAbbr10(String centerAbbr10) {
		this.centerAbbr10 = centerAbbr10;
	}

	public String getDeliveryDate1() {
		return deliveryDate1;
	}

	public void setDeliveryDate1(String deliveryDate1) {
		this.deliveryDate1 = deliveryDate1;
	}

	public String getDeliveryDate2() {
		return deliveryDate2;
	}

	public void setDeliveryDate2(String deliveryDate2) {
		this.deliveryDate2 = deliveryDate2;
	}

	public String getDeliveryDate3() {
		return deliveryDate3;
	}

	public void setDeliveryDate3(String deliveryDate3) {
		this.deliveryDate3 = deliveryDate3;
	}

	public String getDeliveryDate4() {
		return deliveryDate4;
	}

	public void setDeliveryDate4(String deliveryDate4) {
		this.deliveryDate4 = deliveryDate4;
	}

	public String getDeliveryDate5() {
		return deliveryDate5;
	}

	public void setDeliveryDate5(String deliveryDate5) {
		this.deliveryDate5 = deliveryDate5;
	}

	public String getDeliveryDate6() {
		return deliveryDate6;
	}

	public void setDeliveryDate6(String deliveryDate6) {
		this.deliveryDate6 = deliveryDate6;
	}

	public String getDeliveryDate7() {
		return deliveryDate7;
	}

	public void setDeliveryDate7(String deliveryDate7) {
		this.deliveryDate7 = deliveryDate7;
	}

	public String getDeliveryDate8() {
		return deliveryDate8;
	}

	public void setDeliveryDate8(String deliveryDate8) {
		this.deliveryDate8 = deliveryDate8;
	}

	public String getDeliveryDate9() {
		return deliveryDate9;
	}

	public void setDeliveryDate9(String deliveryDate9) {
		this.deliveryDate9 = deliveryDate9;
	}

	public String getDeliveryDate10() {
		return deliveryDate10;
	}

	public void setDeliveryDate10(String deliveryDate10) {
		this.deliveryDate10 = deliveryDate10;
	}

	public String getDirectionCd1() {
		return directionCd1;
	}

	public void setDirectionCd1(String directionCd1) {
		this.directionCd1 = directionCd1;
	}

	public String getDirectionCd2() {
		return directionCd2;
	}

	public void setDirectionCd2(String directionCd2) {
		this.directionCd2 = directionCd2;
	}

	public String getDirectionCd3() {
		return directionCd3;
	}

	public void setDirectionCd3(String directionCd3) {
		this.directionCd3 = directionCd3;
	}

	public String getDirectionCd4() {
		return directionCd4;
	}

	public void setDirectionCd4(String directionCd4) {
		this.directionCd4 = directionCd4;
	}

	public String getDirectionCd5() {
		return directionCd5;
	}

	public void setDirectionCd5(String directionCd5) {
		this.directionCd5 = directionCd5;
	}

	public String getDirectionCd6() {
		return directionCd6;
	}

	public void setDirectionCd6(String directionCd6) {
		this.directionCd6 = directionCd6;
	}

	public String getDirectionCd7() {
		return directionCd7;
	}

	public void setDirectionCd7(String directionCd7) {
		this.directionCd7 = directionCd7;
	}

	public String getDirectionCd8() {
		return directionCd8;
	}

	public void setDirectionCd8(String directionCd8) {
		this.directionCd8 = directionCd8;
	}

	public String getDirectionCd9() {
		return directionCd9;
	}

	public void setDirectionCd9(String directionCd9) {
		this.directionCd9 = directionCd9;
	}

	public String getDirectionCd10() {
		return directionCd10;
	}

	public void setDirectionCd10(String directionCd10) {
		this.directionCd10 = directionCd10;
	}

	public String getLocationCd() {
		return locationCd;
	}

	public void setLocationCd(String locationCd) {
		this.locationCd = locationCd;
	}

	public Long getCarryForwardQty1() {
		return carryForwardQty1;
	}

	public void setCarryForwardQty1(Long carryForwardQty1) {
		this.carryForwardQty1 = carryForwardQty1;
	}

	public Long getCarryForwardQty2() {
		return carryForwardQty2;
	}

	public void setCarryForwardQty2(Long carryForwardQty2) {
		this.carryForwardQty2 = carryForwardQty2;
	}

	public Long getRemainingCaseQty1() {
		return remainingCaseQty1;
	}

	public void setRemainingCaseQty1(Long remainingCaseQty1) {
		this.remainingCaseQty1 = remainingCaseQty1;
	}

	public Long getRemainingCartonQty1() {
		return remainingCartonQty1;
	}

	public void setRemainingCartonQty1(Long remainingCartonQty1) {
		this.remainingCartonQty1 = remainingCartonQty1;
	}

	public Long getRemainingCaseQty2() {
		return remainingCaseQty2;
	}

	public void setRemainingCaseQty2(Long remainingCaseQty2) {
		this.remainingCaseQty2 = remainingCaseQty2;
	}

	public Long getRemainingCartonQty2() {
		return remainingCartonQty2;
	}

	public void setRemainingCartonQty2(Long remainingCartonQty2) {
		this.remainingCartonQty2 = remainingCartonQty2;
	}

	public Long getRemainingCaseQty3() {
		return remainingCaseQty3;
	}

	public void setRemainingCaseQty3(Long remainingCaseQty3) {
		this.remainingCaseQty3 = remainingCaseQty3;
	}

	public Long getRemainingCartonQty3() {
		return remainingCartonQty3;
	}

	public void setRemainingCartonQty3(Long remainingCartonQty3) {
		this.remainingCartonQty3 = remainingCartonQty3;
	}

	public Long getRemainingCaseQty4() {
		return remainingCaseQty4;
	}

	public void setRemainingCaseQty4(Long remainingCaseQty4) {
		this.remainingCaseQty4 = remainingCaseQty4;
	}

	public Long getRemainingCartonQty4() {
		return remainingCartonQty4;
	}

	public void setRemainingCartonQty4(Long remainingCartonQty4) {
		this.remainingCartonQty4 = remainingCartonQty4;
	}

	public Long getRemainingCaseQty5() {
		return remainingCaseQty5;
	}

	public void setRemainingCaseQty5(Long remainingCaseQty5) {
		this.remainingCaseQty5 = remainingCaseQty5;
	}

	public Long getRemainingCartonQty5() {
		return remainingCartonQty5;
	}

	public void setRemainingCartonQty5(Long remainingCartonQty5) {
		this.remainingCartonQty5 = remainingCartonQty5;
	}

	public Long getRemainingCaseQty6() {
		return remainingCaseQty6;
	}

	public void setRemainingCaseQty6(Long remainingCaseQty6) {
		this.remainingCaseQty6 = remainingCaseQty6;
	}

	public Long getRemainingCartonQty6() {
		return remainingCartonQty6;
	}

	public void setRemainingCartonQty6(Long remainingCartonQty6) {
		this.remainingCartonQty6 = remainingCartonQty6;
	}

	public Long getRemainingCaseQty7() {
		return remainingCaseQty7;
	}

	public void setRemainingCaseQty7(Long remainingCaseQty7) {
		this.remainingCaseQty7 = remainingCaseQty7;
	}

	public Long getRemainingCartonQty7() {
		return remainingCartonQty7;
	}

	public void setRemainingCartonQty7(Long remainingCartonQty7) {
		this.remainingCartonQty7 = remainingCartonQty7;
	}

	public Long getRemainingCaseQty8() {
		return remainingCaseQty8;
	}

	public void setRemainingCaseQty8(Long remainingCaseQty8) {
		this.remainingCaseQty8 = remainingCaseQty8;
	}

	public Long getRemainingCartonQty8() {
		return remainingCartonQty8;
	}

	public void setRemainingCartonQty8(Long remainingCartonQty8) {
		this.remainingCartonQty8 = remainingCartonQty8;
	}

	public Long getRemainingCaseQty9() {
		return remainingCaseQty9;
	}

	public void setRemainingCaseQty9(Long remainingCaseQty9) {
		this.remainingCaseQty9 = remainingCaseQty9;
	}

	public Long getRemainingCartonQty9() {
		return remainingCartonQty9;
	}

	public void setRemainingCartonQty9(Long remainingCartonQty9) {
		this.remainingCartonQty9 = remainingCartonQty9;
	}

	public Long getRemainingCaseQty10() {
		return remainingCaseQty10;
	}

	public void setRemainingCaseQty10(Long remainingCaseQty10) {
		this.remainingCaseQty10 = remainingCaseQty10;
	}

	public Long getRemainingCartonQty10() {
		return remainingCartonQty10;
	}

	public void setRemainingCartonQty10(Long remainingCartonQty10) {
		this.remainingCartonQty10 = remainingCartonQty10;
	}

	public String getItemNm() {
		return itemNm;
	}

	public void setItemNm(String itemNm) {
		this.itemNm = itemNm;
	}

	public String getItemCd() {
		return itemCd;
	}

	public void setItemCd(String itemCd) {
		this.itemCd = itemCd;
	}

}
