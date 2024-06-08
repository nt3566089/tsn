package com.oneslogi.base.dbflute.dto;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.oneslogi.base.dbflute.dto.bs.BsTReceivePlanBDto;

/**
 * The entity of T_RECEIVE_PLAN_B.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class TReceivePlanBDto extends BsTReceivePlanBDto {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

	// ===== 検索条件 =====

	// [#2945][Ver3.0] 複数荷姿対応 2017.11.20 潘 Start -->
	//入庫数量
	private String storeNum;
	// [#2945][Ver3.0] 複数荷姿対応 2017.11.20 潘 End -->
	// [Ver3.0] unit of measure対応 2017.11.21 REN Start
	//入数
	private String stringUnitNum;

	//内訳
	private String breakdown;

	//最小梱包単位
	private String minimumPackingUnit;
	// [Ver3.0] unit of measure対応 2017.11.21 REN End


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

	// 入庫バラ数
	private BigDecimal totalPreceNum;

	// 入庫バラ数
	private BigDecimal preceNum;

	// [Ver3.0] unit of measure対応 2017.11.20 駱 Del

	//メッセージ
	private String messageNm;

    // HT検品担当者
    private String userNm;

    private String receiveStatusTemp;



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
	//入庫ラベルNo.
	private String maxStoreLabelNo;
    //登録日時
	private Timestamp lastAddDt;
	//HT検品完了日
   	private String lastHtStoreInspectionDt;
    //入庫格納フラグNM
  	private String lastStoreFlgNm;
    //入庫格納ロケーションNM
   	private String maxLocationNm;
    //ケース入数
   	private Long maxUnitNum;
    //在庫区分CD
   	private String maxStockTypeCd;
    //在庫区分NM
   	private String maxStockTypeNm;

    //顧客発注No.
   	public static final String TRPB_clientOrderNo = "CLIENT_ORDER_NO";
   	private String maxclientOrderNo;
   	private String maxClientReceiveNo;

    //ロット
   	public static final String TRPB_Lot= "LOT";
   	private String maxLot;

    //期限日
   	public static final String TRPB_LimitDt = "LIMIT_DT";
   	private String maxLimitDt;


	private Long unitNum = 0l;

	// 入荷納品ステータス
 	private String strReceiveDeliveryStatus;

    //仕入先CD
   	public static final String TRPB_CustomerCd = "MAX_CUSTOMER_CD";
   	private String maxCustomerCd;

    //仕入先名称
   	public static final String TRPB_CustomerNm = "MAX_CUSTOMER_NM";
   	private String maxCustomerNm;

    //仕入先略称
   	public static final String TRPB_customerAbbr = "MAX_CUSTOMER_ABBR";
   	private String maxCustomerAbbr;

    //予定預託CD
   	public static final String TRPB_PlanDepositCd = "MAX_PLAN_DEPOSIT_ID";
   	private String maxPlanDepositCd;

    //予定預託名称
   	public static final String TRPB_PlanDepositNm = "MAX_PLAN_DEPOSIT_Nm";
   	private String maxPlanDepositNm;

   	//入荷予定受信ID
   	private long receivePanId;

   	private long eReceiveVerNo;

   	private String errorMessageNm;

   	private String planWarehouseNm;

   	//予定倉庫CD
   	private String lcsWarehouseCd;

	// [#3000][Ver3.0] 複数荷姿対応（部品API製造 - 画面）2017.11.13 honma Add Start
	// 商品単位
	private String productUnit;

	// 入数内訳
	private String unitNumBreakdown;

	// 予定内訳
	private String planBreakdown;

	// 入庫内訳
	private String storeBreakdown;
	// [#3000][Ver3.0] 複数荷姿対応（部品API製造 - 画面）2017.11.13 honma Add End

	// [ver3.0] [#3135] 検索結果に預託Cdと預託名称を追加 2017.12.18 matsumoto Start
	// 預託Cd
	private String depositCd;
	// 預託名称
	private String depositNm;
	// [ver3.0] [#3135] 検索結果に預託Cdと預託名称を追加 2017.12.18 matsumoto End


	// ===== 以下Eclipse自動生成のアクセサメソッド =====

	public String getPlanWarehouseNm() {
		return planWarehouseNm;
	}

	public String getLcsWarehouseCd() {
		return lcsWarehouseCd;
	}

	public void setLcsWarehouseCd(String lcsWarehouseCd) {
		this.lcsWarehouseCd = lcsWarehouseCd;
	}

	public void setPlanWarehouseNm(String planWarehouseNm) {
		this.planWarehouseNm = planWarehouseNm;
	}

	public String getErrorMessageNm() {
		return errorMessageNm;
	}

	public void setErrorMessageNm(String errorMessageNm) {
		this.errorMessageNm = errorMessageNm;
	}

	public long geteReceiveVerNo() {
		return eReceiveVerNo;
	}

	public void seteReceiveVerNo(long eReceiveVerNo) {
		this.eReceiveVerNo = eReceiveVerNo;
	}

	public long getReceivePanId() {
		return receivePanId;
	}

	public void setReceivePanId(long receivePanId) {
		this.receivePanId = receivePanId;
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

	public String getMessageNm() {
		return messageNm;
	}

	public void setMessageNm(String messageNm) {
		this.messageNm = messageNm;
	}

	public String getUserNm() {
		return userNm;
	}

	public void setUserNm(String userNm) {
		this.userNm = userNm;
	}

	public Long getUnitNum() {
		return unitNum;
	}

	public void setUnitNum(Long unitNum) {
		this.unitNum = unitNum;
	}

	public String getStrReceiveDeliveryStatus() {
		return strReceiveDeliveryStatus;
	}

	public void setStrReceiveDeliveryStatus(String strReceiveDeliveryStatus) {
		this.strReceiveDeliveryStatus = strReceiveDeliveryStatus;
	}

	public String getMaxStoreLabelNo() {
		return maxStoreLabelNo;
	}

	public void setMaxStoreLabelNo(String maxStoreLabelNo) {
		this.maxStoreLabelNo = maxStoreLabelNo;
	}

	public Timestamp getLastAddDt() {
		return lastAddDt;
	}

	public void setLastAddDt(Timestamp lastAddDt) {
		this.lastAddDt = lastAddDt;
	}

	public String getLastHtStoreInspectionDt() {
		return lastHtStoreInspectionDt;
	}

	public void setLastHtStoreInspectionDt(String lastHtStoreInspectionDt) {
		this.lastHtStoreInspectionDt = lastHtStoreInspectionDt;
	}

	public String getLastStoreFlgNm() {
		return lastStoreFlgNm;
	}

	public void setLastStoreFlgNm(String lastStoreFlgNm) {
		this.lastStoreFlgNm = lastStoreFlgNm;
	}

	public String getMaxLocationNm() {
		return maxLocationNm;
	}

	public void setMaxLocationNm(String maxLocationNm) {
		this.maxLocationNm = maxLocationNm;
	}

	public Long getMaxUnitNum() {
		return maxUnitNum;
	}

	public void setMaxUnitNum(Long maxUnitNum) {
		this.maxUnitNum = maxUnitNum;
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

	public String getMaxclientOrderNo() {
		return maxclientOrderNo;
	}

	public void setMaxclientOrderNo(String maxclientOrderNo) {
		this.maxclientOrderNo = maxclientOrderNo;
	}

	public String getMaxLot() {
		return maxLot;
	}

	public void setMaxLot(String maxLot) {
		this.maxLot = maxLot;
	}

	public String getMaxLimitDt() {
		return maxLimitDt;
	}

	public void setMaxLimitDt(String maxLimitDt) {
		this.maxLimitDt = maxLimitDt;
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

	public String getMaxPlanDepositCd() {
		return maxPlanDepositCd;
	}

	public void setMaxPlanDepositCd(String maxPlanDepositCd) {
		this.maxPlanDepositCd = maxPlanDepositCd;
	}

	public String getMaxPlanDepositNm() {
		return maxPlanDepositNm;
	}

	public void setMaxPlanDepositNm(String maxPlanDepositNm) {
		this.maxPlanDepositNm = maxPlanDepositNm;
	}

	public String getMaxClientReceiveNo() {
		return maxClientReceiveNo;
	}

	public void setMaxClientReceiveNo(String maxClientReceiveNo) {
		this.maxClientReceiveNo = maxClientReceiveNo;
	}

	public BigDecimal getPreceNum() {
		return preceNum;
	}

	public void setPreceNum(BigDecimal preceNum) {
		this.preceNum = preceNum;
	}

	public String getReceiveStatusTemp() {
		return receiveStatusTemp;
	}

	public void setReceiveStatusTemp(String receiveStatusTemp) {
		this.receiveStatusTemp = receiveStatusTemp;
	}

	public BigDecimal getTotalPreceNum() {
		return totalPreceNum;
	}

	public void setTotalPreceNum(BigDecimal totalPreceNum) {
		this.totalPreceNum = totalPreceNum;
	}

	// [#3000][Ver3.0] 複数荷姿対応（部品API製造 - 画面）2017.11.13 honma Add Start
	public String getProductUnit() {
		return productUnit;
	}

	public void setProductUnit(String productUnit) {
		this.productUnit = productUnit;
	}

	public String getUnitNumBreakdown() {
		return unitNumBreakdown;
	}

	public void setUnitNumBreakdown(String unitNumBreakdown) {
		this.unitNumBreakdown = unitNumBreakdown;
	}

	public String getPlanBreakdown() {
		return planBreakdown;
	}

	public void setPlanBreakdown(String planBreakdown) {
		this.planBreakdown = planBreakdown;
	}

	public String getStoreBreakdown() {
		return storeBreakdown;
	}

	public void setStoreBreakdown(String storeBreakdown) {
		this.storeBreakdown = storeBreakdown;
	}
	// [#3000][Ver3.0] 複数荷姿対応（部品API製造 - 画面）2017.11.13 honma Add End

	// [ver3.0] [#3135] 検索結果に預託Cdと預託名称を追加 2017.12.18 matsumoto Start
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
	// [ver3.0] [#3135] 検索結果に預託Cdと預託名称を追加 2017.12.18 matsumoto End

	public String getStringUnitNum() {
		return stringUnitNum;
	}

	public void setStringUnitNum(String stringUnitNum) {
		this.stringUnitNum = stringUnitNum;
	}

	public String getBreakdown() {
		return breakdown;
	}

	public void setBreakdown(String breakdown) {
		this.breakdown = breakdown;
	}

	public String getMinimumPackingUnit() {
		return minimumPackingUnit;
	}

	public void setMinimumPackingUnit(String minimumPackingUnit) {
		this.minimumPackingUnit = minimumPackingUnit;
	}

	public String getStoreNum() {
		return storeNum;
	}

	public void setStoreNum(String storeNum) {
		this.storeNum = storeNum;
	}
}
