package com.oneslogi.wms.dto.report;

import java.math.BigDecimal;

import com.oneslogi.base.dto.ReportDto;

/**
 *パレットはり紙DTOクラス
 */
public class PalletLabelDto extends ReportDto {

	/**  製造年月日*/
	public String lot4;
	/**  製造記号*/
	public String lot2;
	/**  入庫時数量（ケース）*/
	public BigDecimal receiveQtyCase;
	/**  入庫時数量（カートン）*/
	public BigDecimal receiveQtyBowl;
	/**  銘柄コード*/
	public String itemCd;
	/**  デザイン区分*/
	public String lot3;
	/**  バーコード文字列*/
	public String barcode39;
	/**  銘柄名称*/
	public String itemSName;
	/**  商社搬入番号*/
	public String lot1;
	/**  外貨内貨区分*/
	public String foreignCargoCd;
	/**  検査対象区分*/
	public String otherLot1;
	/**  パレット管理番号*/
	public String palletNo;
	/**  複数製造月日区分*/
	public String pluralProductionKbn;
	/**  輸送番号*/
	public String transportNo1;
	/**  逆転入庫区分*/
	public String rtnRcvKbn;
	/**  作成日*/
	public String printingDate;
	/**  在庫区分名称*/
	public String otherLot1Name;
	/**  パレット分割区分*/
	public String palletCuttingKbn;
	/**  輸送形態コード*/
	public String shTypeCd;
	/**  拠点コード*/
	public String centerCd;
	/**  拠点名称*/
	public String centerNm;
	/**  保税管理番号*/
	public String transportNo2;
	/**  受入検品SDユーザID*/
	public String acceptUserCd;
	/**  受入検品確定日時*/
	public String acceptDate;
	/**  パレット番号（08需給）*/
	public String rcvPalletNo;
	/**  一般出力順*/
	public String userNum3;
	/**  保税/倉庫フラグ*/
	public String bondedWarehouseFlg;
	/**  在庫区分*/
	public String stockTypeCd;
	/**  デザイン区分(表示判定)*/
	public String lot3Show;





	// ===== 以下、ゲッタ・セッタ =====

	public String getLot4() {
		return lot4;
	}

	public void setLot4(String lot4) {
		this.lot4 = lot4;
	}

	public String getLot2() {
		return lot2;
	}

	public void setLot2(String lot2) {
		this.lot2 = lot2;
	}

	public BigDecimal getReceiveQtyCase() {
		return receiveQtyCase;
	}

	public void setReceiveQtyCase(BigDecimal receiveQtyCase) {
		this.receiveQtyCase = receiveQtyCase;
	}

	public BigDecimal getReceiveQtyBowl() {
		return receiveQtyBowl;
	}

	public void setReceiveQtyBowl(BigDecimal receiveQtyBowl) {
		
		this.receiveQtyBowl = receiveQtyBowl;
	}

	public String getItemCd() {
		return itemCd;
	}

	public void setItemCd(String itemCd) {
		this.itemCd = itemCd;
	}

	public String getLot3() {
		return lot3;
	}

	public void setLot3(String lot3) {
		this.lot3 = lot3;
	}

	public String getBarcode39() {
		return barcode39;
	}

	public void setBarcode39(String barcode39) {
		this.barcode39 = barcode39;
	}

	public String getItemSName() {
		return itemSName;
	}

	public void setItemSName(String itemSName) {
		this.itemSName = itemSName;
	}

	public String getLot1() {
		return lot1;
	}

	public void setLot1(String lot1) {
		this.lot1 = lot1;
	}

	public String getForeignCargoCd() {
		return foreignCargoCd;
	}

	public void setForeignCargoCd(String foreignCargoCd) {
		this.foreignCargoCd = foreignCargoCd;
	}

	
	public String getOtherLot1() {
		return otherLot1;
	}

	public void setOtherLot1(String otherLot1) {
		this.otherLot1 = otherLot1;
	}

	public String getPalletNo() {
		return palletNo;
	}

	public void setPalletNo(String palletNo) {
		this.palletNo = palletNo;
	}

	public String getPluralProductionKbn() {
		return pluralProductionKbn;
	}

	public void setPluralProductionKbn(String pluralProductionKbn) {
		this.pluralProductionKbn = pluralProductionKbn;
	}

	public String getTransportNo1() {
		return transportNo1;
	}

	public void setTransportNo1(String transportNo1) {
		this.transportNo1 = transportNo1;
	}

	public String getRtnRcvKbn() {
		return rtnRcvKbn;
	}

	public void setRtnRcvKbn(String rtnRcvKbn) {
		this.rtnRcvKbn = rtnRcvKbn;
	}

	public String getPrintingDate() {
		return printingDate;
	}

	public void setPrintingDate(String printingDate) {
		this.printingDate = printingDate;
	}

	public String getOtherLot1Name() {
		return otherLot1Name;
	}

	public void setOtherLot1Name(String otherLot1Name) {
		this.otherLot1Name = otherLot1Name;
	}

	public String getPalletCuttingKbn() {
		return palletCuttingKbn;
	}

	public void setPalletCuttingKbn(String palletCuttingKbn) {
		this.palletCuttingKbn = palletCuttingKbn;
	}

	public String getShTypeCd() {
		return shTypeCd;
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
	
	public String getTransportNo2() {
		return transportNo2;
	}

	public void setTransportNo2(String transportNo2) {
		this.transportNo2 = transportNo2;
	}

	public String getAcceptUserCd() {
		return acceptUserCd;
	}

	public void setAcceptUserCd(String acceptUserCd) {
		this.acceptUserCd = acceptUserCd;
	}

	public void setShTypeCd(String shTypeCd) {
		this.shTypeCd = shTypeCd;
	}

	public String getAcceptDate() {
		return acceptDate;
	}

	public void setAcceptDate(String acceptDate) {
		this.acceptDate = acceptDate;
	}

	public String getRcvPalletNo() {
		return rcvPalletNo;
	}

	public void setRcvPalletNo(String rcvPalletNo) {
		this.rcvPalletNo = rcvPalletNo;
	}

	public String getUserNum3() {
		return userNum3;
	}

	public void setUserNum3(String userNum3) {
		this.userNum3 = userNum3;
	}

	public String geBondedWarehouseFlg() {
		return bondedWarehouseFlg;
	}

	public void setBondedWarehouseFlg(String bondedWarehouseFlg) {
		this.bondedWarehouseFlg = bondedWarehouseFlg;
	}

	public String getStockTypeCd() {
		return stockTypeCd;
	}

	public void setStockTypeCd(String stockTypeCd) {
		this.stockTypeCd = stockTypeCd;
	}

	public String getLot3Show() {
		return lot3Show;
	}

	public void setLot3Show(String lot3Show) {
		this.lot3Show = lot3Show;
	}
}
