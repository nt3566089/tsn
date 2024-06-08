package com.oneslogi.base.dbflute.exentity;

import java.math.BigDecimal;
import java.util.List;

import com.oneslogi.base.dbflute.bsentity.BsTStock;

/**
 * The entity of T_STOCK.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class TStock extends BsTStock {

	/** Serial version UID. (Default) */
	private static final long serialVersionUID = 1L;

	// ===== chaseメソッド(DBFlute 1.0.5N ⇒ 1.2.0対応) =====

	public MClient chaseMClient() {
		return _mClient != null ? _mClient : new MClient();
	}

	public MCustomer chaseMCustomer() {
		return _mCustomer != null ? _mCustomer : new MCustomer();
	}

	public MLocation chaseMLocation() {
		return _mLocation != null ? _mLocation : new MLocation();
	}

	public MProduct chaseMProduct() {
		return _mProduct != null ? _mProduct : new MProduct();
	}

	public MStockType chaseMStockType() {
		return _mStockType != null ? _mStockType : new MStockType();
	}

	public MWarehouse chaseMWarehouse() {
		return _mWarehouse != null ? _mWarehouse : new MWarehouse();
	}

	public TLot chaseTLot() {
		return _tLot != null ? _tLot : new TLot();
	}

	public TStoreNo chaseTStoreNo() {
		return _tStoreNo != null ? _tStoreNo : new TStoreNo();
	}

	// ======================================================

	public static final String ALIAS_maxSharpId = "MAX_SHARP_ID";
	private Long maxSharpId;

	public static final String ALIAS_maxProductId = "MAX_PRODUCT_ID";
	private Long maxProductId;

	public static final String ALIAS_sum_Charge_Num = "SUM_CHARGE_NUM";
	protected BigDecimal sumChargeNum;

	public static final String ALIAS_Process_Type_Cd = "PROCESS_TYPE_CD";
	private String processTypeCd;

	public static final String ALIAS_Inst_Comment = "INST_COMMENT";
	private String instComment;

	public static final String ALIAS_ChargeNum_A = "CHARGE_NUM_A";
	private BigDecimal chargeNum_A;

	public static final String ALIAS_Adj_Num = "ADJ_NUM";
	private BigDecimal adjNum;

	public static final String ALIAS_Row_Count = "ROW_COUNT";
	private int rowCount;

	// 入庫実績ボディの商品荷姿．入数
	public static final String SHAPE_UnitNum = "SHAPE_UNIT_NUM";
	private Long shapeUnitNum;

	private String _dataTime;
	private Long _chargeNumDisplay;
	private Long _display;
	private Long _stockdisplayfld;
	private String _dtAddLdn;

	// [Ver3.0] unit of measure対応 2017.11.21 REN Start
	//入数
	private String stringUnitNum;

	//内訳
	private String breakdown;

	//最小梱包単位
	private String minimumPackingUnit;
	// [Ver3.0] unit of measure対応 2017.11.21 REN End

	// [C-NIS-0001][C-NIS-0003][C-NIS-0004] ケース数、ピース数を追加 2015.07.27 kawana Start

	/** 引当可能ケース数 */
	private BigDecimal caseChargeNum;
	/** 引当可能ピース数 */
	private BigDecimal pieceChargeNum;
	/** 引当済ケース数 */
	private BigDecimal caseAllocNum;
	/** 引当済ピース数 */
	private BigDecimal pieceAllocNum;
	/** 移動中ケース数 */
	private BigDecimal caseMoveNum;
	/** 移動中ピース数 */
	private BigDecimal pieceMoveNum;
	// [C-CWMS-0039] センタ間移動機能を追加 2015.09.15 kawana Start
	/** 積送中ケース数 */
	private BigDecimal caseTransitNum;
	/** 積送中ピース数 */
	private BigDecimal pieceTransitNum;
	// [C-CWMS-0039] センタ間移動機能を追加 2015.09.15 kawana End
	/** 調整前ケース数 */
	private BigDecimal casePreChargeNum;
	/** 調整前ピース数 */
	private BigDecimal piecePreChargeNum;
	/** 調整後ケース数 */
	private BigDecimal caseAftChargeNum;
	/** 調整後ピース数 */
	private BigDecimal pieceAftChargeNum;
	/** 調整ケース数 */
	private BigDecimal caseAdjNum;
	/** 調整ピース数 */
	private BigDecimal pieceAdjNum;
	/** 在庫総ケース数 */
	private BigDecimal caseSumChargeNum;
	/** 在庫総ピース数 */
	private BigDecimal pieceSumChargeNum;
	// [C-CWMS-0039] センタ間移動機能を追加 2015.09.15 kawana Start
	/** 積送中在庫のみ表示 */
	private String transitDisplay;
	// [C-CWMS-0039] センタ間移動機能を追加 2015.09.15 kawana End

	// [C-NIS-0001][C-NIS-0003][C-NIS-0004] ケース数、ピース数を追加 2015.07.27 kawana End

	// [C-CWMS-0038]トータル在庫問合せ画面新規 2015.08.26 hayashi Start
	// センタリスト
	protected List<MCenter> mCenterList;

	// 入荷予定日
	private String receivePlanDt;

	// 入荷予定数
	private BigDecimal receivePlanNum;

	/** 在庫総数 */
	private BigDecimal stockNum;

	// [ON推-品向-960] 在庫数を追加 2015.10.06 kawana Start
	/** 在庫ケース数 */
	private BigDecimal caseStockNum;
	/** 在庫ピース数 */
	private BigDecimal pieceStockNum;
	// [ON推-品向-960] 在庫数を追加 2015.10.06 kawana End

	// 期限切れ数
	private BigDecimal expiredStockNum;

	// 在庫数 0非表示
	private String stockNumDisplay;

	// 定点切れ
	private String fixedPointDisplay;

	// [#2799][Ver3.0] unit of measure 対応 2017.11.13 honma Add Start
	/** 入数内訳 */
	private String unitNumBreakdown;
	// [#2799][Ver3.0] unit of measure 対応 2017.11.13 honma Add End
	// [#4067][Ver3.0] 入庫ラベル - ゾーン表示不正 2018.03.30 honma Add Start
	/** 推奨ロケ */
	private MLocation recommendLocation;
	// [#4067][Ver3.0] 入庫ラベル - ゾーン表示不正 2018.03.30 honma Add End

	public Long getMaxSharpId() {
		return maxSharpId;
	}

	// [C-CWMS-0038]トータル在庫問合せ画面新規 2015.08.26 hayashi End
	// セット品について、画面新規 2015.11.09 hayashi Start
	private BigDecimal moveNumInfo;
	private String rowColorFlg;
	// セット品について、画面新規 2015.11.09 hayashi End

	// [Ver3.0][#3137] ユーザCDの追加 2017.12.25 Shimizu Add Start
	/** ユーザCD */
	private String referenceUserCd;

	// [Ver3.0][#3137] ユーザCDの追加 2017.12.25 Shimizu Add End

	// [Ver3.0] unit of measure対応 2017.11.21 ライ Start
    private String productUnit;
    // [Ver3.0] unit of measure対応 2017.11.21 ライ END
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

	public void setMaxSharpId(Long maxSharpId) {
		this.maxSharpId = maxSharpId;
	}

	public Long getMaxProductId() {
		return maxProductId;
	}

	public void setMaxProductId(Long maxProductId) {
		this.maxProductId = maxProductId;
	}

	public BigDecimal getSumChargeNum() {
		return sumChargeNum;
	}

	public void setSumChargeNum(BigDecimal sumChargeNum) {
		this.sumChargeNum = sumChargeNum;
	}

	public String getProcessTypeCd() {
		return processTypeCd;
	}

	public void setProcessTypeCd(String processTypeCd) {
		this.processTypeCd = processTypeCd;
	}

	public String getInstComment() {
		return instComment;
	}

	public void setInstComment(String instComment) {
		this.instComment = instComment;
	}

	public BigDecimal getChargeNum_A() {
		return chargeNum_A;
	}

	public void setChargeNum_A(BigDecimal chargeNum_A) {
		this.chargeNum_A = chargeNum_A;
	}

	public BigDecimal getAdjNum() {
		return adjNum;
	}

	public void setAdjNum(BigDecimal adjNum) {
		this.adjNum = adjNum;
	}

	public int getRowCount() {
		return rowCount;
	}

	public void setRowCount(int rowCount) {
		this.rowCount = rowCount;
	}

	/**
	 * [get] DATA_TIME: {VARCHAR(200)} <br />
	 * ��t
	 * @return The value of the column 'DATA_TIME'. (NullAllowed even if selected: for no constraint)
	 */
	public String getDataTime() {
		return convertEmptyToNull(_dataTime);
	}

	/**
	 * [set] DATA_TIME: {VARCHAR(200)} <br />
	 * ��t
	 * @param updProcess The value of the column 'DATA_TIME'. (NullAllowed: null update allowed for no constraint)
	 */
	public void setDataTime(String dataTime) {
		__modifiedProperties.addPropertyName("dataTime");
		this._dataTime = dataTime;
	}

	/**
	 * [get] CHARGE_NUM_DISPLAY: {NUMBER(1)} <br />
	 * ��\�� 0��\��
	 * @return The value of the column 'CHARGE_NUM_DISPLAY'. (NullAllowed even if selected: for no constraint)
	 */
	public Long getChargeNumDisplay() {
		return _chargeNumDisplay;
	}

	/**
	 * [set] CHARGE_NUM_DISPLAY: {NUMBER(1)} <br />
	 * ��\�� 0��\��
	 * @param updProcess The value of the column 'CHARGE_NUM_DISPLAY'. (NullAllowed: null update allowed for no constraint)
	 */
	public void setChargeNumDisplay(Long chargeNumDisplay) {
		__modifiedProperties.addPropertyName("chargeNumDisplay");
		this._chargeNumDisplay = chargeNumDisplay;
	}

	/**
	 * [get] DISPLAY: {NUMBER(1)} <br />
	 * 0��\��
	 * @return The value of the column 'DISPLAY'. (NullAllowed even if selected: for no constraint)
	 */
	public Long getDisplay() {
		return _display;
	}

	/**
	 * [set] DISPLAY: {NUMBER(1)} <br />
	 * 0��\��
	 * @param updProcess The value of the column 'DISPLAY'. (NullAllowed: null update allowed for no constraint)
	 */
	public void setDisplay(Long display) {
		__modifiedProperties.addPropertyName("display");
		this._display = display;
	}

	public Long getStockdisplayfld() {
		return _stockdisplayfld;
	}

	public void setStockdisplayfld(Long stockdisplayfld) {
		__modifiedProperties.addPropertyName("stockdisplayfld");
		this._stockdisplayfld = stockdisplayfld;
	}

	public String getDtAddLdn() {
		return _dtAddLdn;
	}

	public void setDtAddLdn(String dtAddLdn) {
		this._dtAddLdn = dtAddLdn;
	}

	public Long getShapeUnitNum() {
		return shapeUnitNum;
	}

	public void setShapeUnitNum(Long shapeUnitNum) {
		this.shapeUnitNum = shapeUnitNum;
	}

	public BigDecimal getCaseChargeNum() {
		return caseChargeNum;
	}

	public void setCaseChargeNum(BigDecimal caseChargeNum) {
		this.caseChargeNum = caseChargeNum;
	}

	public BigDecimal getPieceChargeNum() {
		return pieceChargeNum;
	}

	public void setPieceChargeNum(BigDecimal pieceChargeNum) {
		this.pieceChargeNum = pieceChargeNum;
	}

	public BigDecimal getCaseAllocNum() {
		return caseAllocNum;
	}

	public void setCaseAllocNum(BigDecimal caseAllocNum) {
		this.caseAllocNum = caseAllocNum;
	}

	public BigDecimal getPieceAllocNum() {
		return pieceAllocNum;
	}

	public void setPieceAllocNum(BigDecimal pieceAllocNum) {
		this.pieceAllocNum = pieceAllocNum;
	}

	public BigDecimal getCaseMoveNum() {
		return caseMoveNum;
	}

	public void setCaseMoveNum(BigDecimal caseMoveNum) {
		this.caseMoveNum = caseMoveNum;
	}

	public BigDecimal getPieceMoveNum() {
		return pieceMoveNum;
	}

	public void setPieceMoveNum(BigDecimal pieceMoveNum) {
		this.pieceMoveNum = pieceMoveNum;
	}

	public BigDecimal getCasePreChargeNum() {
		return casePreChargeNum;
	}

	public void setCasePreChargeNum(BigDecimal casePreChargeNum) {
		this.casePreChargeNum = casePreChargeNum;
	}

	public BigDecimal getPiecePreChargeNum() {
		return piecePreChargeNum;
	}

	public void setPiecePreChargeNum(BigDecimal piecePreChargeNum) {
		this.piecePreChargeNum = piecePreChargeNum;
	}

	public BigDecimal getCaseAftChargeNum() {
		return caseAftChargeNum;
	}

	public void setCaseAftChargeNum(BigDecimal caseAftChargeNum) {
		this.caseAftChargeNum = caseAftChargeNum;
	}

	public BigDecimal getPieceAftChargeNum() {
		return pieceAftChargeNum;
	}

	public void setPieceAftChargeNum(BigDecimal pieceAftChargeNum) {
		this.pieceAftChargeNum = pieceAftChargeNum;
	}

	public BigDecimal getCaseAdjNum() {
		return caseAdjNum;
	}

	public void setCaseAdjNum(BigDecimal caseAdjNum) {
		this.caseAdjNum = caseAdjNum;
	}

	public BigDecimal getPieceAdjNum() {
		return pieceAdjNum;
	}

	public void setPieceAdjNum(BigDecimal pieceAdjNum) {
		this.pieceAdjNum = pieceAdjNum;
	}

	public BigDecimal getCaseSumChargeNum() {
		return caseSumChargeNum;
	}

	public void setCaseSumChargeNum(BigDecimal caseSumChargeNum) {
		this.caseSumChargeNum = caseSumChargeNum;
	}

	public BigDecimal getPieceSumChargeNum() {
		return pieceSumChargeNum;
	}

	public void setPieceSumChargeNum(BigDecimal pieceSumChargeNum) {
		this.pieceSumChargeNum = pieceSumChargeNum;
	}

	public List<MCenter> getMCenterList() {
		if (mCenterList == null) {
			mCenterList = newReferrerList();
		}
		return mCenterList;
	}

	public void setMCenterList(List<MCenter> mCenterList) {
		this.mCenterList = mCenterList;
	}

	public String getReceivePlanDt() {
		return receivePlanDt;
	}

	public void setReceivePlanDt(String receivePlanDt) {
		this.receivePlanDt = receivePlanDt;
	}

	public BigDecimal getReceivePlanNum() {
		return receivePlanNum;
	}

	public void setReceivePlanNum(BigDecimal receivePlanNum) {
		this.receivePlanNum = receivePlanNum;
	}

	public BigDecimal getStockNum() {
		return stockNum;
	}

	public void setStockNum(BigDecimal stockNum) {
		this.stockNum = stockNum;
	}

	/**
	 * @return caseStockNum
	 */
	public BigDecimal getCaseStockNum() {
		return caseStockNum;
	}

	/**
	 * @param caseStockNum セットする caseStockNum
	 */
	public void setCaseStockNum(BigDecimal caseStockNum) {
		this.caseStockNum = caseStockNum;
	}

	/**
	 * @return pieceStockNum
	 */
	public BigDecimal getPieceStockNum() {
		return pieceStockNum;
	}

	/**
	 * @param pieceStockNum セットする pieceStockNum
	 */
	public void setPieceStockNum(BigDecimal pieceStockNum) {
		this.pieceStockNum = pieceStockNum;
	}

	public BigDecimal getExpiredStockNum() {
		return expiredStockNum;
	}

	public void setExpiredStockNum(BigDecimal expiredStockNum) {
		this.expiredStockNum = expiredStockNum;
	}

	public String getStockNumDisplay() {
		return stockNumDisplay;
	}

	public void setStockNumDisplay(String stockNumDisplay) {
		this.stockNumDisplay = stockNumDisplay;
	}

	public String getFixedPointDisplay() {
		return fixedPointDisplay;
	}

	public void setFixedPointDisplay(String fixedPointDisplay) {
		this.fixedPointDisplay = fixedPointDisplay;
	}

	/**
	 * @return caseTransitNum
	 */
	public BigDecimal getCaseTransitNum() {
		return caseTransitNum;
	}

	/**
	 * @param caseTransitNum セットする caseTransitNum
	 */
	public void setCaseTransitNum(BigDecimal caseTransitNum) {
		this.caseTransitNum = caseTransitNum;
	}

	/**
	 * @return pieceTransitNum
	 */
	public BigDecimal getPieceTransitNum() {
		return pieceTransitNum;
	}

	/**
	 * @param pieceTransitNum セットする pieceTransitNum
	 */
	public void setPieceTransitNum(BigDecimal pieceTransitNum) {
		this.pieceTransitNum = pieceTransitNum;
	}

	/**
	 * @return transitDisplay
	 */
	public String getTransitDisplay() {
		return transitDisplay;
	}

	/**
	 * @param transitDisplay セットする transitDisplay
	 */
	public void setTransitDisplay(String transitDisplay) {
		this.transitDisplay = transitDisplay;
	}

	public BigDecimal getMoveNumInfo() {
		return moveNumInfo;
	}

	public void setMoveNumInfo(BigDecimal moveNumInfo) {
		this.moveNumInfo = moveNumInfo;
	}

	public String getRowColorFlg() {
		return rowColorFlg;
	}

	public void setRowColorFlg(String rowColorFlg) {
		this.rowColorFlg = rowColorFlg;
	}

	// [#2233] 在庫一括移動指示用 2017.08.16 Ase Start
	/**
	 * 移動先ロケーションCD
	 */
	private String moveLocationCd;

	/**
	 * 移動先ロケーションCDを取得します。
	 * @return 移動先ロケーションCD
	 */
	public String getMoveLocationCd() {
		return moveLocationCd;
	}

	/**
	 * 移動先ロケーションCDを設定します。
	 * @param moveLocationCd 移動先ロケーションCD
	 */
	public void setMoveLocationCd(String moveLocationCd) {
		this.moveLocationCd = moveLocationCd;
	}

	/**
	 * 移動ケース数
	 */
	private BigDecimal moveCaseNum;

	/**
	 * 移動ケース数を取得します。
	 * @return 移動ケース数
	 */
	public BigDecimal getMoveCaseNum() {
		return moveCaseNum;
	}

	/**
	 * 移動ケース数を設定します。
	 * @param moveCaseNum 移動ケース数
	 */
	public void setMoveCaseNum(BigDecimal moveCaseNum) {
		this.moveCaseNum = moveCaseNum;
	}

	/**
	 * 移動ピース数
	 */
	private BigDecimal movePieceNum;

	/**
	 * 移動ピース数を取得します。
	 * @return 移動ピース数
	 */
	public BigDecimal getMovePieceNum() {
		return movePieceNum;
	}

	/**
	 * 移動ピース数を設定します。
	 * @param movePieceNum 移動ピース数
	 */
	public void setMovePieceNum(BigDecimal movePieceNum) {
		this.movePieceNum = movePieceNum;
	}

	/**
	 * 移動総数
	 */
	private BigDecimal moveInstNum;

	/**
	 * 移動総数を取得します。
	 * @return 移動総数
	 */
	public BigDecimal getMoveInstNum() {
		return moveInstNum;
	}

	/**
	 * 移動総数を設定します。
	 * @param moveInstNum 移動総数
	 */
	public void setMoveInstNum(BigDecimal moveInstNum) {
		this.moveInstNum = moveInstNum;
	}

	// [#2233] 在庫一括移動指示用 2017.08.16 Ase End

	// [#2799][Ver3.0] unit of measure 対応 2017.11.13 honma Add Start
	public String getUnitNumBreakdown() {
		return unitNumBreakdown;
	}

	public void setUnitNumBreakdown(String unitNumBreakdown) {
		this.unitNumBreakdown = unitNumBreakdown;
	}

	// [#2799][Ver3.0] unit of measure 対応 2017.11.13 honma Add End

	// [#4067][Ver3.0] 入庫ラベル - ゾーン表示不正 2018.03.30 honma Add Start
	public MLocation getRecommendLocation() {
		return recommendLocation;
	}

	public void setRecommendLocation(MLocation recommendLocation) {
		this.recommendLocation = recommendLocation;
	}
	// [#4067][Ver3.0] 入庫ラベル - ゾーン表示不正 2018.03.30 honma Add End

	// [Ver3.0][#3137] ユーザCDの追加 2017.12.25 Shimizu Add Start
	public String getReferenceUserCd() {
		return referenceUserCd;
	}

	public void setReferenceUserCd(String referenceUserCd) {
		this.referenceUserCd = referenceUserCd;
	}
	// [Ver3.0][#3137] ユーザCDの追加 2017.12.25 Shimizu Add End

	public String getProductUnit() {
		return productUnit;
	}

	public void setProductUnit(String productUnit) {
		this.productUnit = productUnit;
	}

}
