package com.oneslogi.wms.dto.report;

import java.math.BigDecimal;

import com.oneslogi.base.dto.ReportDto;

/**
 *返品差異リストDTOクラス
 */
public class ReturnedDiffListDto extends ReportDto {

	/**  お得様確認フラグ(帳票区分)*/
	public String status ;
	/**  お得様コード*/
	public String otherRefNo1 ;
	/**  入庫予定日*/
	public String rcvSchDate ;
	/**  返品区分*/
	public String otherRefNo3 ;
	/**  お得意様名称*/
	public String fromName ;
	/**  配達方面*/
	public String fromAddress2 ;
	/**  ピストン区分*/
	public String carrierName ;
	/**  配達順位*/
	public String priorities ;
	/**  伝票番号*/
	public String supplierRcvNo ;
	/**  銘柄コード*/
	public String itemCd ;
	/**  銘柄名称*/
	public String itemSname ;
	/**  入庫予定数*/
	public BigDecimal expQty ;
	/**  実績数*/
	public BigDecimal rcvQty ;
	/**  実績数(内カートン）*/
	public BigDecimal ctRcvQty ;
	/**  実績数(内個数）*/
	public BigDecimal koRcvQty ;
	/**  状態コード（実績）*/
	public String flg ;
	/**  状態コード名称*/
	public String flgName ;
	/**  不足本数*/
	public BigDecimal lostSu ;
	/**  一般出力順*/
	public String userNum3 ;
	/**  返品検品ステータス*/
	public String otherLot1 ;
	/**  検品ステータス*/
	public String carrierNo ;
	/**  拠点コード*/
	public String centerCd ;
	/**  拠点名称*/
	public String centerNm ;
	/**  ユーザコード*/
	public String userCd ;




	// ===== 以下、ゲッタ・セッタ =====

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getOtherRefNo1() {
		return otherRefNo1;
	}

	public void setOtherRefNo1(String otherRefNo1) {
		this.otherRefNo1 = otherRefNo1;
	}

	public String getRcvSchDate() {
		return rcvSchDate;
	}

	public void setRcvSchDate(String rcvSchDate) {
		this.rcvSchDate = rcvSchDate;
	}

	public String getOtherRefNo3() {
		return otherRefNo3;
	}

	public void setOtherRefNo3(String otherRefNo3) {
		this.otherRefNo3 = otherRefNo3;
	}

	public String getFromName() {
		return fromName;
	}

	public void setFromName(String fromName) {
		this.fromName = fromName;
	}

	public String getFromAddress2() {
		return fromAddress2;
	}

	public void setFromAddress2(String fromAddress2) {
		this.fromAddress2 = fromAddress2;
	}

	public String getCarrierName() {
		return carrierName;
	}

	public void setCarrierName(String carrierName) {
		this.carrierName = carrierName;
	}

	public String getPriorities() {
		return priorities;
	}

	public void setPriorities(String priorities) {
		this.priorities = priorities;
	}

	public String getSupplierRcvNo() {
		return supplierRcvNo;
	}

	public void setSupplierRcvNo(String supplierRcvNo) {
		this.supplierRcvNo = supplierRcvNo;
	}


	public String getItemCd() {
		return itemCd;
	}

	public void setItemCd(String itemCd) {
		this.itemCd = itemCd;
	}

	public String getItemSname() {
		return itemSname;
	}

	public void setItemSname(String itemSname) {
		this.itemSname = itemSname;
	}

	public BigDecimal getExpQty() {
		return expQty;
	}

	public void setExpQty(BigDecimal expQty) {
		this.expQty = expQty;
	}

	public BigDecimal getRcvQty() {
		return rcvQty;
	}

	public void setRcvQty(BigDecimal rcvQty) {
		this.rcvQty = rcvQty;
	}

	public BigDecimal getCtRcvQty() {
		return ctRcvQty;
	}

	public void setCtRcvQty(BigDecimal ctRcvQty) {
		this.ctRcvQty = ctRcvQty;
	}

	public BigDecimal getKoRcvQty() {
		return koRcvQty;
	}

	public void setKoRcvQty(BigDecimal koRcvQty) {
		this.koRcvQty = koRcvQty;
	}

	public String getFlg() {
		return flg;
	}

	public void setFlg(String flg) {
		this.flg = flg;
	}

	public String getFlgName() {
		return flgName;
	}

	public void setFlgName(String flgName) {
		this.flgName = flgName;
	}

	public BigDecimal getLostSu() {
		return lostSu;
	}

	public void setLostSu(BigDecimal lostSu) {
		this.lostSu = lostSu;
	}

	public String getUserNum3() {
		return userNum3;
	}

	public void setUserNum3(String userNum3) {
		this.userNum3 = userNum3;
	}

	public String getOtherLot1() {
		return otherLot1;
	}

	public void setOtherLot1(String otherLot1) {
		this.otherLot1 = otherLot1;
	}

	public String getCarrierNo() {
		return carrierNo;
	}

	public void setCarrierNo(String carrierNo) {
		this.carrierNo = carrierNo;
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

	public String getUserCd() {
		return userCd;
	}

	public void setUserCd(String userCd) {
		this.userCd = userCd;
	}

}
