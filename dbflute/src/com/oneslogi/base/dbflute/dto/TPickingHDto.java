package com.oneslogi.base.dbflute.dto;

import com.oneslogi.base.dbflute.dto.bs.BsTPickingHDto;

/**
 * The entity of t_picking_h.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class TPickingHDto extends BsTPickingHDto {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

	// ===== 検索条件 =====
 	// 未確定のみ表示
   	private String noConfirmedFlg;

	// 出荷日From
	private String shippingDtFrom;

	// 出荷日To
	private String shippingDtTo;

	// [検査-160] ソート順変更と共に結合条件異常を修正 2014.12.04 yokosuka Start
	// 作業日From
	private String workDtFrom;

	// 作業日To
	private String workDtTo;
	// [検査-160] ソート順変更と共に結合条件異常を修正 2014.12.04 yokosuka End

	//出荷確定解除フラグ
	private String confirmCancelFlg;

	// 日付(From)
	private String dtFrom;

	// 日付(To)
	private String dtTo;

	// 作業日/出荷日区分
	private String takingShippingFlg;

	// ピッキング方法
	private String picCls;

	// 発行区分
	private String listOutKbn;

	// 倉庫CD
	private String warehouseCd;

	// 出庫指示バッチNo.
	private String  pickingBatchNo;

	// 緊急フラグ
	private String  emergencyFlg;

	// 一次ピッキングリスト
	private String picListCls1;

	// 二次ピッキングリスト
	private String picListCls2;

	//データ種別
	private String tagType;

	//顧客出荷指示No.
	private String clientShippingNo;
	// [新ｿﾘ-084] 確認メッセージの出力ので、変数を追加 2014.11.21 fengc Start
	//複数の倉庫フラグ
	private String isOtherWarehouse;
	// [新ｿﾘ-084] 確認メッセージの出力ので、変数を追加 2014.11.21 fengc End
	// [新ｿﾘ-084] 確認メッセージの出力ので、変数を追加 2014.11.26 fengc Start
	// レポートCD
	private String reportCd;

	// メッセージ出力フラグ
	private String isMessageOutPutFlg;
	// [新ｿﾘ-084] 確認メッセージの出力ので、変数を追加 2014.11.26 fengc End

	// [C-EC-004] 欠品有無のみ検索条件追加 2015.1.27 Sakata Start
	//欠品有無のみ
	private String noStockOutFlg;
	// [C-EC-004] 欠品有無のみ検索条件追加 2015.1.27 Sakata End

	// [ON推-品向-1029] 配送コースCD検索条件追加 2015.11.30 ichikawa Start
	//配送コースCD
	private String deliveryCourseCd;
	//配送コース名
	private String deliveryCourseNm;
	// [ON推-品向-1029] 配送コースCD検索条件追加 2015.11.30 ichikawa End
	// Ver２．１向けエンハンス 荷札出力対応 C-CWMS-0058 2016/07/14 SJA Start
	// 送り状・荷札
	private String picListCls3;

	// [#1005] SDケースピッキング ケースピッキングNo.追加 2017.02.24 honma Add Start
	// ケースピッキングNo.
	private String casePickingNo;
	// [#1005] SDケースピッキング ケースピッキングNo.追加 2017.02.24 honma Add End

	// [#1561] オーダーピッキングに出荷梱包No.の検索条件を追加 2017.04.13 kawana Start
	private String shippingPackingNo;
	// [#1561] オーダーピッキングに出荷梱包No.の検索条件を追加 2017.04.13 kawana End

	//  米国出荷ドキュメント追加対応 2018.01.07 PYM Start
	//発行対象
	private String bolOutputTargetFlg;

	//Bill of Lading発行FLG
	private String bolOutFlg;

	//運送業者
	private String carrierCd;

	//[Ver3.1][#5129]検索条件にケースピックフラグ追加 2018.09.21 miyabe add Start
	//ケースピックフラグ
	private String casePicFlg;
	//[Ver3.1][#5129]検索条件にケースピックフラグ追加 2018.09.21 miyabe add End

	public String getBolOutputTargetFlg() {
		return bolOutputTargetFlg;
	}

	public void setBolOutputTargetFlg(String bolOutputTargetFlg) {
		this.bolOutputTargetFlg = bolOutputTargetFlg;
	}

	public String getBolOutFlg() {
		return bolOutFlg;
	}

	public void setBolOutFlg(String bolOutFlg) {
		this.bolOutFlg = bolOutFlg;
	}

	public String getCarrierCd() {
		return carrierCd;
	}

	public void setCarrierCd(String carrierCd) {
		this.carrierCd = carrierCd;
	}
	//  米国出荷ドキュメント追加対応 2018.01.07 PYM End

	public String getPicListCls3() {
		return picListCls3;
	}

	public void setPicListCls3(String picListCls3) {
		this.picListCls3 = picListCls3;
	}

	// Ver２．１向けエンハンス 荷札出力対応 C-CWMS-0058 2016/07/14 SJA End

	// ===== 以下Eclipse自動生成のアクセサメソッド =====

	public String getNoConfirmedFlg() {
		return noConfirmedFlg;
	}

	public void setNoConfirmedFlg(String noConfirmedFlg) {
		this.noConfirmedFlg = noConfirmedFlg;
	}

	public String getShippingDtFrom() {
		return shippingDtFrom;
	}

	public void setShippingDtFrom(String shippingDtFrom) {
		this.shippingDtFrom = shippingDtFrom;
	}

	public String getShippingDtTo() {
		return shippingDtTo;
	}

	public void setShippingDtTo(String shippingDtTo) {
		this.shippingDtTo = shippingDtTo;
	}

	// [検査-160] ソート順変更と共に結合条件異常を修正 2014.12.04 yokosuka Start
	public String getWorkDtFrom() {
		return workDtFrom;
	}

	public void setWorkDtFrom(String workDtFrom) {
		this.workDtFrom = workDtFrom;
	}

	public String getWorkDtTo() {
		return workDtTo;
	}

	public void setWorkDtTo(String workDtTo) {
		this.workDtTo = workDtTo;
	}
	// [検査-160] ソート順変更と共に結合条件異常を修正 2014.12.04 yokosuka End

	public String getConfirmCancelFlg() {
		return confirmCancelFlg;
	}

	public void setConfirmCancelFlg(String confirmCancelFlg) {
		this.confirmCancelFlg = confirmCancelFlg;
	}

	public String getDtFrom() {
		return dtFrom;
	}

	public void setDtFrom(String dtFrom) {
		this.dtFrom = dtFrom;
	}

	public String getDtTo() {
		return dtTo;
	}

	public void setDtTo(String dtTo) {
		this.dtTo = dtTo;
	}

	public String getTakingShippingFlg() {
		return takingShippingFlg;
	}

	public void setTakingShippingFlg(String takingShippingFlg) {
		this.takingShippingFlg = takingShippingFlg;
	}

	public String getPicCls() {
		return picCls;
	}

	public void setPicCls(String picCls) {
		this.picCls = picCls;
	}

	public String getListOutKbn() {
		return listOutKbn;
	}

	public void setListOutKbn(String listOutKbn) {
		this.listOutKbn = listOutKbn;
	}

	public String getWarehouseCd() {
		return warehouseCd;
	}

	public void setWarehouseCd(String warehouseCd) {
		this.warehouseCd = warehouseCd;
	}

	public String getPickingBatchNo() {
		return pickingBatchNo;
	}

	public void setPickingBatchNo(String pickingBatchNo) {
		this.pickingBatchNo = pickingBatchNo;
	}

	public String getEmergencyFlg() {
		return emergencyFlg;
	}

	public void setEmergencyFlg(String emergencyFlg) {
		this.emergencyFlg = emergencyFlg;
	}

	public String getPicListCls1() {
		return picListCls1;
	}

	public void setPicListCls1(String picListCls1) {
		this.picListCls1 = picListCls1;
	}

	public String getPicListCls2() {
		return picListCls2;
	}

	public void setPicListCls2(String picListCls2) {
		this.picListCls2 = picListCls2;
	}
	public String getTagType() {
		return tagType;
	}

	public void setTagType(String tagType) {
		this.tagType = tagType;
	}

	public String getClientShippingNo() {
		return clientShippingNo;
	}

	public void setClientShippingNo(String clientShippingNo) {
		this.clientShippingNo = clientShippingNo;
	}

	public String getIsOtherWarehouse() {
		return isOtherWarehouse;
	}

	public void setIsOtherWarehouse(String isOtherWarehouse) {
		this.isOtherWarehouse = isOtherWarehouse;
	}

	public String getReportCd() {
		return reportCd;
	}

	public void setReportCd(String reportCd) {
		this.reportCd = reportCd;
	}

	public String getIsMessageOutPutFlg() {
		return isMessageOutPutFlg;
	}

	public void setIsMessageOutPutFlg(String isMessageOutPutFlg) {
		this.isMessageOutPutFlg = isMessageOutPutFlg;
	}

	public String getNoStockOutFlg() {
		return noStockOutFlg;
	}

	public void setNoStockOutFlg(String noStockOutFlg) {
		this.noStockOutFlg = noStockOutFlg;
	}

	public String getDeliveryCourseCd() {
		return deliveryCourseCd;
	}

	public void setDeliveryCourseCd(String deliveryCourseCd) {
		this.deliveryCourseCd = deliveryCourseCd;
	}

	public String getDeliveryCourseNm() {
		return deliveryCourseNm;
	}

	public void setDeliveryCourseNm(String deliveryCourseNm) {
		this.deliveryCourseNm = deliveryCourseNm;
	}

	// [#1005] SDケースピッキング ケースピッキングNo.追加 2017.02.24 honma Add Start
	public String getCasePickingNo() {
		return casePickingNo;
	}

	public void setCasePickingNo(String casePickingNo) {
		this.casePickingNo = casePickingNo;
	}
	// [#1005] SDケースピッキング ケースピッキングNo.追加 2017.02.24 honma Add End

	public String getShippingPackingNo() {
		return shippingPackingNo;
	}

	public void setShippingPackingNo(String shippingPackingNo) {
		this.shippingPackingNo = shippingPackingNo;
	}

	//[Ver3.1][#5129]検索条件にケースピックフラグ追加 2018.09.21 miyabe add Start
	public String getCasePicFlg() {
	    return casePicFlg;
	}

	public void setCasePicFlg(String casePicFlg) {
	    this.casePicFlg = casePicFlg;
	}
	//[Ver3.1][#5129]検索条件にケースピックフラグ追加 2018.09.21 miyabe add End
}
