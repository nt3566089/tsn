package com.oneslogi.base.dbflute.exentity;

import com.oneslogi.base.dbflute.bsentity.BsTEcOrderH;

/**
 * The entity of t_ec_order_h.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class TEcOrderH extends BsTEcOrderH {

	/** Serial version UID. (Default) */
	private static final long serialVersionUID = 1L;

	// ===== chaseメソッド(DBFlute 1.0.5N ⇒ 1.2.0対応) =====

	public MClient chaseMClient() {
		return _mClient != null ? _mClient : new MClient();
	}

	public MImportType chaseMImportType() {
		return _mImportType != null ? _mImportType : new MImportType();
	}

	public TEcOrderR chaseTEcOrderRAsOne() {
		return _tEcOrderRAsOne != null ? _tEcOrderRAsOne : new TEcOrderR();
	}

	public TShippingInstH chaseTShippingInstH() {
		return _tShippingInstH != null ? _tShippingInstH : new TShippingInstH();
	}

	// ======================================================


	// 日付区分
	private String dtCls;
	// 日付(From)
	private String dtFrom;
	// 日付(To)
	private String dtTo;

	// [#5144][v3.1] 欠品フラグを出庫指示ヘッダに移動(stockOutFlg削除) 2018.07.23 kawana Delete

	// 商品出荷停止フラグ
	protected String productShippingStopFlg;
	// 在庫引当禁止フラグ
	protected String allocNgFlg;
	// キャンセルデータ表示
	private String cancelDisplay;
	// 名寄せフラグ
	protected String mergeFlg;
	// [C-CWMS-0026] 使用項目をEC受注ヘッダに移動したため名寄せステータスを削除 2015.05.15 kawana
	// [新WMS-110-060] 表示用の名寄せIDを追加 2015.08.06 kawana Start
	private String mergeIdForDisplay;
	// [新WMS-110-060] 表示用の名寄せIDを追加 2015.08.06 kawana End
	// 検索条件にコメント有無を追加 2015.08.03 kawana Start
	// コメント有無フラグ
	protected String commentFlg;
	// 検索条件にコメント有無を追加 2015.08.03 kawana End

	// [#5144][v3.1] 欠品フラグを出庫指示ヘッダに移動(ALIAS_stockOutFlg削除) 2018.07.23 kawana Delete

	public static final String ALIAS_productShippingStopFlg = "PRODUCT_SHIPPING_STOP_FLG";
	public static final String ALIAS_allocNgFlg = "ALLOC_NG_FLG";

	// レポートCD
	private String reportCd;
	// メッセージ出力フラグ
	private String isMessageOutPutFlg;
	//複数の倉庫フラグ
	private String isOtherWarehouse;

	public String getDtCls() {
		return dtCls;
	}

	public void setDtCls(String dtCls) {
		this.dtCls = dtCls;
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

	public String getProductShippingStopFlg() {
		return productShippingStopFlg;
	}

	public void setProductShippingStopFlg(String productShippingStopFlg) {
		this.productShippingStopFlg = productShippingStopFlg;
	}

	public String getAllocNgFlg() {
		return allocNgFlg;
	}

	public void setAllocNgFlg(String allocNgFlg) {
		this.allocNgFlg = allocNgFlg;
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

	public String getIsOtherWarehouse() {
		return isOtherWarehouse;
	}

	public void setIsOtherWarehouse(String isOtherWarehouse) {
		this.isOtherWarehouse = isOtherWarehouse;
	}

	public String getCancelDisplay() {
		return cancelDisplay;
	}

	public void setCancelDisplay(String cancelDisplay) {
		this.cancelDisplay = cancelDisplay;
	}

	public String getMergeFlg() {
		return mergeFlg;
	}

	public void setMergeFlg(String mergeFlg) {
		this.mergeFlg = mergeFlg;
	}

	public String getMergeIdForDisplay() {
		return mergeIdForDisplay;
	}

	public void setMergeIdForDisplay(String mergeIdForDisplay) {
		this.mergeIdForDisplay = mergeIdForDisplay;
	}

	// 検索条件にコメント有無を追加 2015.08.03 kawana Start
	public String getCommentFlg() {
		return commentFlg;
	}

	public void setCommentFlg(String commentFlg) {
		this.commentFlg = commentFlg;
	}
	// 検索条件にコメント有無を追加 2015.08.03 kawana End
}
