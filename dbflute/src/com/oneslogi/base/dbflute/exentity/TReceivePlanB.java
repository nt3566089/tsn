package com.oneslogi.base.dbflute.exentity;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.oneslogi.base.dbflute.bsentity.BsTReceivePlanB;

/**
 * The entity of T_RECEIVE_PLAN_B.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class TReceivePlanB extends BsTReceivePlanB {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

	// ===== chaseメソッド(DBFlute 1.0.5N ⇒ 1.2.0対応) =====

	public MLocation chaseMLocation() {
		return _mLocation != null ? _mLocation : new MLocation();
	}

	public MProduct chaseMProduct() {
		return _mProduct != null ? _mProduct : new MProduct();
	}

	public TReceivePlanH chaseTReceivePlanH() {
		return _tReceivePlanH != null ? _tReceivePlanH : new TReceivePlanH();
	}

	public MWarehouse chaseMWarehouse() {
		return _mWarehouse != null ? _mWarehouse : new MWarehouse();
	}

	public TReceivePlanSpare chaseTReceivePlanSpareAsOne() {
		return _tReceivePlanSpareAsOne != null ? _tReceivePlanSpareAsOne : new TReceivePlanSpare();
	}

	// ======================================================

	//メッセージ
	private String messageNm;

    // HT検品担当者
    private String userNm;

    // 入庫バラ数
 	private BigDecimal totalPreceNum;

 	// 入庫バラ数
 	private BigDecimal preceNum;
    // [Ver3.0] unit of measure対応 2017.11.20 駱 Del

    // [Ver3.0] unit of measure対応 2017.11.20 駱 Start

	// 商品単位
	private String productUnit;

	// 入数内訳
	private String unitNumBreakdown;

	// 予定内訳
	private String planBreakdown;

	// 入庫内訳
	private String storeBreakdown;
	// [Ver3.0] unit of measure対応 2017.11.20 駱 End

    // 入数
    private Long unitNum;

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

	// 行数
 	private Long rowCount;


  	private String receiveStatusTemp;

 	// 入庫実績ボディの入庫日最小値
 	public static final String TRPB_fistStoreDt = "FIRST_STORE_DT";
 	private String firstStoreDt;

 	// 入庫実績ボディの入庫日最大値
 	public static final String TRPB_lastStoreDt = "LAST_STORE_DT";
 	private String lastStoreDt;

 	// 入荷予定ボディの予定数合計
 	public static final String TRPB_sumPlanNum = "SUM_PLAN_NUM";
 	private BigDecimal sumPlanNum;

 	// 入庫実績ボディの入庫数合計
 	public static final String TRPB_sumStoreNum = "SUM_STORE_NUM";
 	private BigDecimal sumStoreNum;

 	public static final String TRPB_maxStockTypeId = "MAX_STOCKTYPE_ID";
 	private Long maxStockTypeId;

 	//在庫区分CD最大値
 	public static final String TRPB_maxStockTypeCd = "MAX_STOCKTYPE_CD";
 	private String maxStockTypeCd;

 	//在庫区分NM最大値
 	public static final String TRPB_maxStockTypeNm = "MAX_STOCKTYPE_NM";
 	private String maxStockTypeNm;

 	//在庫区分NM最大値
 	public static final String TRPB_maxLocationNm = "MAX_LOCATION_NM";
 	private String maxLocationNm;

    //入庫格納フラグNM最大値
  	public static final String TRPB_lastStoreFlgNm = "LAST_STORE_FLG_NM";
  	private String lastStoreFlgNm;

    // 入庫実績ボディのHT検品完了日最大値
   	public static final String TRPB_lastHtStoreInspectionDt = "LAST_HT_STORE_INSPECTION_DT";
   	private String lastHtStoreInspectionDt;

    // 入庫実績ボディのHT検品担当者ID最大値
   	public static final String TRPB_lastHtStoreInspectionUserId = "LAST_HT_STORE_INSPECTION_USER_ID";
   	private String lastHtStoreInspectionUserId;

    // 入庫実績ボディの登録日時最大値
   	public static final String TRPB_AddDt = "LAST_ADD_DT";
   	private Timestamp lastAddDt;

    //入庫ラベルNo.最大値
   	public static final String TRPB_maxStoreLabelNo = "MAX_STORE_LABEL_NO";
   	private String maxStoreLabelNo;

    //入数最大値
   	public static final String TRPB_maxUnitNum = "MAX_UNIT_NUM";
   	private Long maxUnitNum;

    //顧客発注No.
   	public static final String TRPB_clientOrderNo = "MAX_CLIENT_ORDER_NO";
   	private String maxclientOrderNo;

    //顧客入荷指示No.
   	public static final String TRPB_ClientReceiveNo = "MAX_CLIENT_RECEIVE_NO";
   	private String maxClientReceiveNo;

    //ロット
   	public static final String TRPB_Lot= "MAX_LOT";
   	private String maxLot;

    //期限日
   	public static final String TRPB_LimitDt = "MAX_LIMIT_DT";
   	private String maxLimitDt;

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
   	public static final String TRPB_PlanDepositCd = "MAX_PLAN_DEPOSIT_CD";
   	private String maxPlanDepositCd;

    //予定預託名称
   	public static final String TRPB_PlanDepositNm = "MAX_PLAN_DEPOSIT_Nm";
   	private String maxPlanDepositNm;

   	//入荷予定受信ID
   	private long receivePanId;

   	private long eReceiveVerNo;

   	//予定倉庫CD
   	private String lcsWarehouseCd;

   	public String getLcsWarehouseCd() {
		return lcsWarehouseCd;
	}

	public void setLcsWarehouseCd(String lcsWarehouseCd) {
		this.lcsWarehouseCd = lcsWarehouseCd;
	}

	// [Ver3.0] unit of measure対応 2017.11.21 REN Start
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
	// [Ver3.0] unit of measure対応 2017.11.21 REN End
	public String getErrorMessageNm() {
		return errorMessageNm;
	}

	public void setErrorMessageNm(String errorMessageNm) {
		this.errorMessageNm = errorMessageNm;
	}

	private String errorMessageNm;


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

	public String getReceiveStatusTemp() {
		return receiveStatusTemp;
	}

	public void setReceiveStatusTemp(String receiveStatusTemp) {
		this.receiveStatusTemp = receiveStatusTemp;
	}

	public Long getMaxUnitNum() {
		return maxUnitNum;
	}

	public void setMaxUnitNum(Long maxUnitNum) {
		this.maxUnitNum = maxUnitNum;
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

	public String getLastHtStoreInspectionUserId() {
		return lastHtStoreInspectionUserId;
	}

	public void setLastHtStoreInspectionUserId(String lastHtStoreInspectionUserId) {
		this.lastHtStoreInspectionUserId = lastHtStoreInspectionUserId;
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

	public String getMaxStockTypeNm() {
		return maxStockTypeNm;
	}

	public void setMaxStockTypeNm(String maxStockTypeNm) {
		this.maxStockTypeNm = maxStockTypeNm;
	}

	public String getMaxStockTypeCd() {
		return maxStockTypeCd;
	}

	public void setMaxStockTypeCd(String maxStockTypeCd) {
		this.maxStockTypeCd = maxStockTypeCd;
	}

	// 入荷納品ステータス
 	private String strReceiveDeliveryStatus;

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

	// [Ver3.0] unit of measure対応 2017.11.20 駱 Del

	public Long getUnitNum() {
		return unitNum;
	}

	public void setUnitNum(Long unitNum) {
		this.unitNum = unitNum;
	}

 	public String getReceivePlanDtFrom() {
 		return receivePlanDtFrom;
 	}

 	public Long getMaxStockTypeId() {
		return maxStockTypeId;
	}

	public void setMaxStockTypeId(Long maxStockTypeId) {
		this.maxStockTypeId = maxStockTypeId;
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

	public String getStrReceiveDeliveryStatus() {
		return strReceiveDeliveryStatus;
	}

	public void setStrReceiveDeliveryStatus(String strReceiveDeliveryStatus) {
		this.strReceiveDeliveryStatus = strReceiveDeliveryStatus;
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

	public BigDecimal getTotalPreceNum() {
		return totalPreceNum;
	}

	public void setTotalPreceNum(BigDecimal totalPreceNum) {
		this.totalPreceNum = totalPreceNum;
	}

	public BigDecimal getPreceNum() {
		return preceNum;
	}

	public void setPreceNum(BigDecimal preceNum) {
		this.preceNum = preceNum;
	}

	// [Ver3.0] unit of measure対応 2017.11.20 駱 Del

    // [Ver3.0] unit of measure対応 2017.11.20 駱 Start
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
    // [Ver3.0] unit of measure対応 2017.11.20 駱 End

}
