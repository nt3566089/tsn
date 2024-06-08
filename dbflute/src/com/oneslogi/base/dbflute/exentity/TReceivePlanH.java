package com.oneslogi.base.dbflute.exentity;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.oneslogi.base.dbflute.bsentity.BsTReceivePlanH;

/**
 * The entity of T_RECEIVE_PLAN_H.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class TReceivePlanH extends BsTReceivePlanH {

	/** Serial version UID. (Default) */
	private static final long serialVersionUID = 1L;

	// ===== chaseメソッド(DBFlute 1.0.5N ⇒ 1.2.0対応) =====

	public MCenter chaseMCenter() {
		return _mCenter != null ? _mCenter : new MCenter();
	}

	public MClient chaseMClient() {
		return _mClient != null ? _mClient : new MClient();
	}

	public MCustomer chaseMCustomerByPlanDepositId() {
		return _mCustomerByPlanDepositId != null ? _mCustomerByPlanDepositId : new MCustomer();
	}

	public MCustomer chaseMCustomerByPlanSupplierId() {
		return _mCustomerByPlanSupplierId != null ? _mCustomerByPlanSupplierId : new MCustomer();
	}

	public MProcessType chaseMProcessType() {
		return _mProcessType != null ? _mProcessType : new MProcessType();
	}

	public MStockType chaseMStockType() {
		return _mStockType != null ? _mStockType : new MStockType();
	}

	public TReceivePlanR chaseTReceivePlanRAsOne() {
		return _tReceivePlanRAsOne != null ? _tReceivePlanRAsOne : new TReceivePlanR();
	}

	// ======================================================

	// ===== 検索条件 =====

	// 入荷予定日From
	private String receivePlanDtFrom;

	// 入荷予定日To
	private String receivePlanDtTo;

	// 入庫日From
	private String storeDtFrom;

	// 入庫日To
	private String storeDtTo;

	// 発行条件
	private String printCondition;

	// エラーメッセージ
	private String messageNm;

	private String clientReceiveNo;

	// 商品名称
	private String productNm;

	// 顧客発注No.
	private String clientOrderNo;
	private String storeClientOrderNo;
	private String storeClientReceiveNo;

	// 予定倉庫CD
	private String planWarehouseCd;

	//元WMS入荷伝票№
	private String oldReceiveSlipNo;

	// [ver3.0] [#3135] 商品別入荷一覧(参照)画面の検索条件項目に預託CDを追加する 2017.12.14 matsumoto Start
	// 預託CD
	private String depositCustomerCd;
	// [ver3.0] [#3135] 商品別入荷一覧(参照)画面の検索条件項目に預託CDを追加する 2017.12.14 matsumoto End

	// [ver3.0] [#3135] ユーザCD 2017.12.15 matsumoto Start
	// ユーザCD
	private String loginUserCd;
	// [ver3.0] [#3135] ユーザCD 2017.12.15 matsumoto End



	// ===== 導出カラム =====

	// 行数
	private Long rowCount;

	// 最終更新日
	private Timestamp lastUpdDt;

	// 入庫実績ボディの入庫日最小値
	public static final String ALIAS_fistStoreDt = "FIRST_STORE_DT";
	private String firstStoreDt;

	// 入庫実績ボディの入庫日最大値
	public static final String ALIAS_lastStoreDt = "LAST_STORE_DT";
	private String lastStoreDt;

	// 入荷予定ボディの予定数合計
	public static final String ALIAS_sumPlanNum = "SUM_PLAN_NUM";
	private BigDecimal sumPlanNum;

	// 入庫実績ボディの入庫数合計
	public static final String ALIAS_sumStoreNum = "SUM_STORE_NUM";
	private BigDecimal sumStoreNum;

	// 入荷予定ボディIDのCOUNTを抽出
	public static final String ALIAS_sumPlanCount = "SUM_PLAN_COUNT";
	private Long sumPlanCount;

	// 商品CD
	private String productCd;

	//仕入先CD
	public static final String TRPB_CustomerCd = "MAX_CUSTOMER_CD";
	private String maxCustomerCd;

	//仕入先名称
	public static final String TRPB_CustomerNm = "MAX_CUSTOMER_NM";
	private String maxCustomerNm;

	//仕入先略称
	public static final String TRPB_customerAbbr = "MAX_CUSTOMER_ABBR";
	private String maxCustomerAbbr;

	//顧客入荷指示No.
	public static final String TRPB_ClientReceiveNo = "MAX_CLIENT_RECEIVE_NO";
	private String maxClientReceiveNo;

	//処理区分CD
	public static final String TRPB_ProcessTypeCd = "MAX_PROCESS_TYPE_CD";
	private String maxProcessTypeCd;
	//処理区分名称
	public static final String TRPB_ProcessTypeNm = "MAX_PROCESS_TYPE_NM";
	private String maxProcessTypeNm;

	// [Ver1.1.1] [ON推-品向-939] 予定在庫区分を追加する 2015.09.15 hayashi Start
	// 在庫区分CD
	public static final String TRPB_StockTypeCd = "MAX_STOCK_TYPE_CD";
	private String maxStockTypeCd;
	// 在庫区分名称
	public static final String TRPB_StockTypeNm = "MAX_STOCK_TYPE_NM";
	private String maxStockTypeNm;
	// [Ver1.1.1] [ON推-品向-939] 予定在庫区分を追加する 2015.09.15 hayashi End

	private String receiveSlipNoTemp;

	// [ON推-品向-996] 削除データ表示有無の検索条件を追加 2015.11.06 kawana Start

	/** 削除データ表示 */
	private String deleteDisplay;

	// [ON推-品向-996] 削除データ表示有無の検索条件を追加 2015.11.06 kawana End

	// [新ｿﾘV2-005] 入荷未完了一覧 - 検索時の入荷予定日と指示日を比較 2016.07.15 kawana Start

	/** 変更前入荷予定日 */
	private String preReceivePlanDt;

	// [新ｿﾘV2-005] 入荷未完了一覧 - 検索時の入荷予定日と指示日を比較 2016.07.15 kawana End

	// ===== 以下Eclipse自動生成のアクセサメソッド =====

	public String getOldReceiveSlipNo() {
		return oldReceiveSlipNo;
	}

	public void setOldReceiveSlipNo(String oldReceiveSlipNo) {
		this.oldReceiveSlipNo = oldReceiveSlipNo;
	}

	public String getMaxProcessTypeCd() {
		return maxProcessTypeCd;
	}

	public void setMaxProcessTypeCd(String maxProcessTypeCd) {
		this.maxProcessTypeCd = maxProcessTypeCd;
	}

	public String getMaxProcessTypeNm() {
		return maxProcessTypeNm;
	}

	public void setMaxProcessTypeNm(String maxProcessTypeNm) {
		this.maxProcessTypeNm = maxProcessTypeNm;
	}

	public String getReceivePlanDtFrom() {
		return receivePlanDtFrom;
	}

	public void setReceivePlanDtFrom(String receivePlanDtFrom) {
		this.receivePlanDtFrom = receivePlanDtFrom;
	}

	public String getReceivePlanDtTo() {
		return receivePlanDtTo;
	}

	public void setReceivePlanDtTo(String receivePlanDtTo) {
		this.receivePlanDtTo = receivePlanDtTo;
	}

	public String getStoreDtFrom() {
		return storeDtFrom;
	}

	public void setStoreDtFrom(String storeDtFrom) {
		this.storeDtFrom = storeDtFrom;
	}

	public String getStoreDtTo() {
		return storeDtTo;
	}

	public void setStoreDtTo(String storeDtTo) {
		this.storeDtTo = storeDtTo;
	}

	public String getPrintCondition() {
		return printCondition;
	}

	public void setPrintCondition(String printCondition) {
		this.printCondition = printCondition;
	}

	public Long getRowCount() {
		return rowCount;
	}

	public void setRowCount(Long rowCount) {
		this.rowCount = rowCount;
	}

	public Timestamp getLastUpdDt() {
		return lastUpdDt;
	}

	public void setLastUpdDt(Timestamp lastUpdDt) {
		this.lastUpdDt = lastUpdDt;
	}

	public String getFirstStoreDt() {
		return firstStoreDt;
	}

	public void setFirstStoreDt(String firstStoreDt) {
		this.firstStoreDt = firstStoreDt;
	}

	public String getLastStoreDt() {
		return lastStoreDt;
	}

	public void setLastStoreDt(String lastStoreDt) {
		this.lastStoreDt = lastStoreDt;
	}

	public BigDecimal getSumPlanNum() {
		return sumPlanNum;
	}

	public void setSumPlanNum(BigDecimal sumPlanNum) {
		this.sumPlanNum = sumPlanNum;
	}

	public BigDecimal getSumStoreNum() {
		return sumStoreNum;
	}

	public void setSumStoreNum(BigDecimal sumStoreNum) {
		this.sumStoreNum = sumStoreNum;
	}

	public Long getSumPlanCount() {
		return sumPlanCount;
	}

	public void setSumPlanCount(Long sumPlanCount) {
		this.sumPlanCount = sumPlanCount;
	}

	public String getMessageNm() {
		return messageNm;
	}

	public void setMessageNm(String messageNm) {
		this.messageNm = messageNm;
	}

	public String getProductCd() {
		return productCd;
	}

	public void setProductCd(String productCd) {
		this.productCd = productCd;
	}

	public String getClientReceiveNo() {
		return clientReceiveNo;
	}

	public void setClientReceiveNo(String clientReceiveNo) {
		this.clientReceiveNo = clientReceiveNo;
	}

	public String getProductNm() {
		return productNm;
	}

	public void setProductNm(String productNm) {
		this.productNm = productNm;
	}

	public String getClientOrderNo() {
		return clientOrderNo;
	}

	public void setClientOrderNo(String clientOrderNo) {
		this.clientOrderNo = clientOrderNo;
	}

	public String getPlanWarehouseCd() {
		return planWarehouseCd;
	}

	public void setPlanWarehouseCd(String planWarehouseCd) {
		this.planWarehouseCd = planWarehouseCd;
	}

	public String getMaxCustomerCd() {
		return maxCustomerCd;
	}

	public void setMaxCustomerCd(String maxCustomerCd) {
		this.maxCustomerCd = maxCustomerCd;
	}

	public String getMaxCustomerNm() {
		return maxCustomerNm;
	}

	public void setMaxCustomerNm(String maxCustomerNm) {
		this.maxCustomerNm = maxCustomerNm;
	}

	public String getMaxCustomerAbbr() {
		return maxCustomerAbbr;
	}

	public void setMaxCustomerAbbr(String maxCustomerAbbr) {
		this.maxCustomerAbbr = maxCustomerAbbr;
	}

	public String getStoreClientOrderNo() {
		return storeClientOrderNo;
	}

	public void setStoreClientOrderNo(String storeClientOrderNo) {
		this.storeClientOrderNo = storeClientOrderNo;
	}

	public String getStoreClientReceiveNo() {
		return storeClientReceiveNo;
	}

	public void setStoreClientReceiveNo(String storeClientReceiveNo) {
		this.storeClientReceiveNo = storeClientReceiveNo;
	}

	public String getMaxClientReceiveNo() {
		return maxClientReceiveNo;
	}

	public void setMaxClientReceiveNo(String maxClientReceiveNo) {
		this.maxClientReceiveNo = maxClientReceiveNo;
	}

	public String getReceiveSlipNoTemp() {
		return receiveSlipNoTemp;
	}

	public void setReceiveSlipNoTemp(String receiveSlipNoTemp) {
		this.receiveSlipNoTemp = receiveSlipNoTemp;
	}

	public String getMaxStockTypeCd() {
		return maxStockTypeCd;
	}

	public void setMaxStockTypeCd(String maxStockTypeCd) {
		this.maxStockTypeCd = maxStockTypeCd;
	}

	public String getMaxStockTypeNm() {
		return maxStockTypeNm;
	}

	public void setMaxStockTypeNm(String maxStockTypeNm) {
		this.maxStockTypeNm = maxStockTypeNm;
	}

	public String getDeleteDisplay() {
		return deleteDisplay;
	}

	public void setDeleteDisplay(String deleteDisplay) {
		this.deleteDisplay = deleteDisplay;
	}

	public String getPreReceivePlanDt() {
		return preReceivePlanDt;
	}

	public void setPreReceivePlanDt(String preReceivePlanDt) {
		this.preReceivePlanDt = preReceivePlanDt;
	}

	// [ver3.0] [#3135] 商品別入荷一覧(参照)画面の検索条件項目に預託CDを追加する 2017.12.14 matsumoto Start
	public String getDepositCustomerCd() {
		return depositCustomerCd;
	}

	public void setDepositCustomerCd(String depositCustomerCd) {
		this.depositCustomerCd = depositCustomerCd;
	}
	// [ver3.0] [#3135] 商品別入荷一覧(参照)画面の検索条件項目に預託CDを追加する 2017.12.14 matsumoto End

	// [ver3.0] [#3135] ユーザCD 2017.12.15 matsumoto Start
	public String getLoginUserCd() {
		return loginUserCd;
	}

	public void setLoginUserCd(String loginUserCd) {
		this.loginUserCd = loginUserCd;
	}
	// [ver3.0] [#3135] ユーザCD 2017.12.15 matsumoto End

}
