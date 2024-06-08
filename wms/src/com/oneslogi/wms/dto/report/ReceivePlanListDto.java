package com.oneslogi.wms.dto.report;

import java.math.BigDecimal;

import com.oneslogi.base.dto.ReportDto;

public class ReceivePlanListDto extends ReportDto {

	//帳票ID
	public Long reportId;

	//帳票CD
	public String reportCd;

	// [Ver3.0] unit of measure対応 2017.11.21 REN Start
	//入数
	private String stringUnitNum;

	//内訳
	private String breakdown;

	//最小梱包単位
	private String minimumPackingUnit;
	// [Ver3.0] unit of measure対応 2017.11.21 REN End

	//
	public Long receivePlanHId;

	//センタCD：センタ略称
	public String centerCd;

	//センタ略称
	public String centerNm;

	//荷主
	public String clientCd;

	//荷主略称
	public String clientNm;

	//仕入先CD：仕入先略称
	public String planSupplierCd;

	//仕入先略称
	public String planSupplierNm;

	//入荷予定日
	public String receivePlanDt;

	//WMS入荷伝票No.
	public String receiveSlipNo;

	//預託
	public String depositCd;

	public String depositNm;

    //顧客入荷指示No.
	public String clientReceiveNo;

	//処理区分
	public String processTypeCd;

	//処理区分
	public String processTypeNm;

	// [ON推-品向-955] 在庫区分を追加 2015.10.01 kawana Start

	//在庫区分CD
	public String stockTypeCd;

	//在庫区分名称
	public String stockTypeNm;

	// [ON推-品向-955] 在庫区分を追加 2015.10.01 kawana End

	//
	public Long receivePlanBId;

	//No.
	public Long lineNo;

	//商品CD
	public String productCd;

	//商品名称
	public String productNm;

	//顧客発注No.
	public String clientOrderNo;

	// [#3110] 帳票レイアウト変更 jancd表示の統一 2018.01.25 fujiwara Start
	//JANCD
	public String janCd;
	// [#3110] 帳票レイアウト変更 jancd表示の統一 2018.01.25 fujiwara End

	//期限日
	public String planLimitDt;

	//ロット
	public String planLot;

	//入荷総数(予定)
	public BigDecimal planNum;

	//入荷総数(実績)
	public BigDecimal num;

	//ケース数(予定)
	public BigDecimal planCaseNum;

	//ケース数(実績)
	public BigDecimal caseNum;

	//ピース数(予定)
	public BigDecimal planPieceNum;

	//ピース数(実績)
	public BigDecimal pieceNum;

	//入数
	public Long reNum;

	//確認
	// [SK2-009] 予定ロケーションのみ表示するように修正します。 2014.12.09 衛 Start
	//ロケーションNM
	public String locationNm;
	public String getLocationNm() {
		return locationNm;
	}

	public void setLocationNm(String locationNm) {
		this.locationNm = locationNm;
	}
	// [SK2-009] 予定ロケーションのみ表示するように修正します。 2014.12.09 衛 End
	public Long getReceivePlanHId() {
		return receivePlanHId;
	}

	public String getCenterCd() {
		return centerCd;
	}

	public String getCenterNm() {
		return centerNm;
	}

	public String getClientCd() {
		return clientCd;
	}

	public String getClientNm() {
		return clientNm;
	}

	public String getPlanSupplierCd() {
		return planSupplierCd;
	}

	public String getPlanSupplierNm() {
		return planSupplierNm;
	}

	public String getReceivePlanDt() {
		return receivePlanDt;
	}

	public String getReceiveSlipNo() {
		return receiveSlipNo;
	}

	public Long getReceivePlanBId() {
		return receivePlanBId;
	}

	public Long getLineNo() {
		return lineNo;
	}

	public String getProductCd() {
		return productCd;
	}

	public String getProductNm() {
		return productNm;
	}

	public String getPlanLot() {
		return planLot;
	}

	public String getPlanLimitDt() {
		return planLimitDt;
	}

	public BigDecimal getPlanNum() {
		return planNum;
	}

	public Long getReportId() {
		return reportId;
	}

	public void setReportId(Long reportId) {
		this.reportId = reportId;
	}

	// [Ver3.0] unit of measure対応 2017.11.21 REN Start
	//入数
	public String getStringUnitNum() {
	return stringUnitNum;
	}

	public void setStringUnitNum(String stringUnitNum) {
	this.stringUnitNum = stringUnitNum;
	}
	//内訳
	public String getBreakdown() {
	return breakdown;
	}

	public void setBreakdown(String breakdown) {
	this.breakdown = breakdown;
	}

	//最小梱包単位
	public String getMinimumPackingUnit() {
	return minimumPackingUnit;
	}

	public void setMinimumPackingUnit(String minimumPackingUnit) {
	this.minimumPackingUnit = minimumPackingUnit;
	}
	// [Ver3.0] unit of measure対応 2017.11.21 REN End


	public String getDepositCd() {
		return depositCd;
	}

	public void setDepositCd(String depositCd) {
		this.depositCd = depositCd;
	}

	public String getDepositNm() {
		return depositNm;
	}

	public void setDepositNm(String depositNm) {
		this.depositNm = depositNm;
	}

	public String getClientOrderNo() {
		return clientOrderNo;
	}

	public void setClientOrderNo(String clientOrderNo) {
		this.clientOrderNo = clientOrderNo;
	}

	public String getProcessTypeCd() {
		return processTypeCd;
	}

	public void setProcessTypeCd(String processTypeCd) {
		this.processTypeCd = processTypeCd;
	}

	public String getProcessTypeNm() {
		return processTypeNm;
	}

	public void setProcessTypeNm(String processTypeNm) {
		this.processTypeNm = processTypeNm;
	}

	/**
	 * @return stockTypeCd
	 */
	public String getStockTypeCd() {
		return stockTypeCd;
	}

	/**
	 * @param stockTypeCd セットする stockTypeCd
	 */
	public void setStockTypeCd(String stockTypeCd) {
		this.stockTypeCd = stockTypeCd;
	}

	/**
	 * @return stockTypeNm
	 */
	public String getStockTypeNm() {
		return stockTypeNm;
	}

	/**
	 * @param stockTypeNm セットする stockTypeNm
	 */
	public void setStockTypeNm(String stockTypeNm) {
		this.stockTypeNm = stockTypeNm;
	}

	// [#3110] 帳票レイアウト変更 jancd表示の統一 2018.01.25 fujiwara Start
	public String getJanCd() {
		return janCd;
	}

	public void setJanCd(String janCd) {
		this.janCd = janCd;
	}
	// [#3110] 帳票レイアウト変更 jancd表示の統一 2018.01.25 fujiwara End

	public BigDecimal getNum() {
		return num;
	}

	public void setNum(BigDecimal num) {
		this.num = num;
	}

	public BigDecimal getPlanCaseNum() {
		return planCaseNum;
	}

	public void setPlanCaseNum(BigDecimal planCaseNum) {
		this.planCaseNum = planCaseNum;
	}

	public BigDecimal getCaseNum() {
		return caseNum;
	}

	public void setCaseNum(BigDecimal caseNum) {
		this.caseNum = caseNum;
	}

	public BigDecimal getPlanPieceNum() {
		return planPieceNum;
	}

	public void setPlanPieceNum(BigDecimal planPieceNum) {
		this.planPieceNum = planPieceNum;
	}

	public BigDecimal getPieceNum() {
		return pieceNum;
	}

	public void setPieceNum(BigDecimal pieceNum) {
		this.pieceNum = pieceNum;
	}

	public Long getReNum() {
		return reNum;
	}

	public void setReNum(Long reNum) {
		this.reNum = reNum;
	}

	public void setReceivePlanHId(Long receivePlanHId) {
		this.receivePlanHId = receivePlanHId;
	}

	public void setCenterCd(String centerCd) {
		this.centerCd = centerCd;
	}

	public void setCenterNm(String centerNm) {
		this.centerNm = centerNm;
	}

	public void setClientCd(String clientCd) {
		this.clientCd = clientCd;
	}

	public void setClientNm(String clientNm) {
		this.clientNm = clientNm;
	}

	public void setPlanSupplierCd(String planSupplierCd) {
		this.planSupplierCd = planSupplierCd;
	}

	public void setPlanSupplierNm(String planSupplierNm) {
		this.planSupplierNm = planSupplierNm;
	}

	public void setReceivePlanDt(String receivePlanDt) {
		this.receivePlanDt = receivePlanDt;
	}

	public void setReceiveSlipNo(String receiveSlipNo) {
		this.receiveSlipNo = receiveSlipNo;
	}

	public void setReceivePlanBId(Long receivePlanBId) {
		this.receivePlanBId = receivePlanBId;
	}

	public void setLineNo(Long lineNo) {
		this.lineNo = lineNo;
	}

	public void setProductCd(String productCd) {
		this.productCd = productCd;
	}

	public void setProductNm(String productNm) {
		this.productNm = productNm;
	}

	public void setPlanLimitDt(String planLimitDt) {
		this.planLimitDt = planLimitDt;
	}

	public void setPlanLot(String planLot) {
		this.planLot = planLot;
	}

	public void setPlanNum(BigDecimal planNum) {
		this.planNum = planNum;
	}


	public String getClientReceiveNo() {
		return clientReceiveNo;
	}

	public void setClientReceiveNo(String clientReceiveNo) {
		this.clientReceiveNo = clientReceiveNo;
	}

	public String getReportCd() {
		return reportCd;
	}

	public void setReportCd(String reportCd) {
		this.reportCd = reportCd;
	}

}
