package com.oneslogi.base.dbflute.dto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.oneslogi.base.dbflute.dto.bs.BsTStockDto;
import com.oneslogi.base.dbflute.exentity.MLocation;

/**
 * The entity of T_STOCK.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class TStockDto extends BsTStockDto {

	/** Serial version UID. (Default) */
	private static final long serialVersionUID = 1L;

	//荷姿ID
	protected Long _maxSharpId;
	// [Ver3.0] unit of measure対応 2017.11.21 REN Start
  	//入数
  	private String stringUnitNum;

  	//内訳
  	private String breakdown;

  	//最小梱包単位
  	private String minimumPackingUnit;
    // [Ver3.0] unit of measure対応 2017.11.21 REN End

	//商品ID
	protected Long _MaxproductId;

	//在庫総数
	private BigDecimal _sumChargeNum;

	//処理区分
	protected String _processTypeCd;

	//在庫移動指示備考
	protected String _instComment;

	//調整後数量
	protected BigDecimal _chargeNum_A;

	//調整数量
	protected BigDecimal _adjNum;

	protected int _rowCount;

	private Long _display;
	private Long _stockdisplayfld;
	private String _dtAddLdn;
	/** DATA_TIME: {VARCHAR(200)} */
	private String _dataTime;
	/** CHARGE_NUM_DISPLAY: {NUMBER(1)} */
	private Long _chargeNumDisplay;

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
	// 入荷予定日
	protected String receivePlanDt;

	// 入荷予定数
	protected BigDecimal receivePlanNum;

	// センタリスト
	protected List<MCenterDto> mCenterList;

	// 在庫数 0非表示
	protected String stockNumDisplay;

	// 期限切れ在庫数
	protected BigDecimal expiredStockNum;

	/** 在庫総数 */
	protected BigDecimal stockNum;

	// [ON推-品向-960] 在庫数を追加 2015.10.06 kawana Start
	/** 在庫ケース数 */
	private BigDecimal caseStockNum;
	/** 在庫ピース数 */
	private BigDecimal pieceStockNum;
	// [ON推-品向-960] 在庫数を追加 2015.10.06 kawana End

	// 定点切れ
	protected String fixedPointDisplay;

	// [C-CWMS-0038]トータル在庫問合せ画面新規 2015.08.26 hayashi End
	// セット品について、画面新規 2015.11.09 hayashi Start
	private BigDecimal _moveNumInfo;
	private String _rowColorFlg;
	private String _dblFlg;
	// セット品について、画面新規 2015.11.09 hayashi End

	// [ON推-CT113-015] 行Noを追加する 2015.12.28 hayashi Start
	//　行No
	private Long lineNo;

	// [ON推-CT113-015] 行Noを追加する 2015.12.28 hayashi End

	// [#2799][Ver3.0] unit of measure 対応 2017.11.13 honma Add Start
	/** 入数内訳 */
	private String unitNumBreakdown;
	// [#2799][Ver3.0] unit of measure 対応 2017.11.13 honma Add End
	// [#4067][Ver3.0] 入庫ラベル - ゾーン表示不正 2018.03.30 honma Add Start
	/** 推奨ロケ */
	private MLocation recommendLocation;
	// [#4067][Ver3.0] 入庫ラベル - ゾーン表示不正 2018.03.30 honma Add End

	// [Ver3.0][#3137] ユーザCDの追加 2017.12.25 Shimizu Add Start
	/** ユーザCD */
	private String referenceUserCd;
	// [Ver3.0][#3137] ユーザCDの追加 2017.12.25 Shimizu Add End

	// [Ver3.0] unit of measure対応 2017.11.27 ライ Start
    private String productUnit;
    // [Ver3.0] unit of measure対応 2017.11.27 ライ END
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

	public Long getMaxSharpId() {
		return _maxSharpId;
	}

	public void setMaxSharpId(Long maxSharpId) {
		__modifiedProperties.add("_maxSharpId");
		this._maxSharpId = maxSharpId;
	}

	public Long getMaxProductId() {
		return _MaxproductId;
	}

	public void setMaxProductId(Long maxProductId) {
		__modifiedProperties.add("_MaxproductId");
		this._MaxproductId = maxProductId;
	}

	public BigDecimal getSumChargeNum() {
		return _sumChargeNum;
	}

	public void setSumChargeNum(BigDecimal sumChargeNum) {
		__modifiedProperties.add("_sumChargeNum");
		this._sumChargeNum = sumChargeNum;
	}

	public String getProcessTypeCd() {
		return _processTypeCd;
	}

	public void setProcessTypeCd(String processTypeCd) {
		__modifiedProperties.add("_processTypeCd");
		this._processTypeCd = processTypeCd;
	}

	public String getInstComment() {
		return _instComment;
	}

	public void setInstComment(String instComment) {
		__modifiedProperties.add("_instComment");
		this._instComment = instComment;
	}

	public BigDecimal getChargeNum_A() {
		return _chargeNum_A;
	}

	public void setChargeNum_A(BigDecimal chargeNum_A) {
		__modifiedProperties.add("_chargeNum_A");
		this._chargeNum_A = chargeNum_A;
	}

	public BigDecimal getAdjNum() {
		return _adjNum;
	}

	public void setAdjNum(BigDecimal adjNum) {
		__modifiedProperties.add("_adjNum");
		this._adjNum = adjNum;
	}

	public int getRowCount() {
		return _rowCount;
	}

	public void setRowCount(int rowCount) {
		__modifiedProperties.add("_rowCount");
		this._rowCount = rowCount;
	}

	/**
	* [get] DATA_TIME: {VARCHAR(200)} <br />
	* ��t
	* @return The value of the column 'DATA_TIME'. (NullAllowed even if selected: for no constraint)
	*/
	public String getDataTime() {
		return _dataTime;
	}

	/**
	 * [set] DATA_TIME: {VARCHAR(200)} <br />
	 * ��t
	 * @param updProcess The value of the column 'DATA_TIME'. (NullAllowed: null update allowed for no constraint)
	 */
	public void setDataTime(String dataTime) {
		//__modifiedProperties.addPropertyName("dataTime");
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
		// __modifiedProperties.addPropertyName("chargeNumDisplay");
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
		// __modifiedProperties.addPropertyName("display");
		this._display = display;
	}

	public Long getStockdisplayfld() {
		return _stockdisplayfld;
	}

	public void setStockdisplayfld(Long stockdisplayfld) {
		//__modifiedProperties.addPropertyName("stockdisplayfld");
		this._stockdisplayfld = stockdisplayfld;
	}

	public String getDtAddLdn() {
		return _dtAddLdn;
	}

	public void setDtAddLdn(String dtAddLdn) {
		this._dtAddLdn = dtAddLdn;
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

	public String getReceivePlanDt() {
		return receivePlanDt;
	}

	public void setReceivePlanDt(String _receivePlanDt) {
		__modifiedProperties.add("_receivePlanDt");
		this.receivePlanDt = _receivePlanDt;
	}

	public BigDecimal getReceivePlanNum() {
		return receivePlanNum;
	}

	public void setReceivePlanNum(BigDecimal _receivePlanNum) {
		__modifiedProperties.add("_receivePlanNum");
		this.receivePlanNum = _receivePlanNum;
	}

	public List<MCenterDto> getMCenterList() {
		if (mCenterList == null) {
			mCenterList = new ArrayList<MCenterDto>();
		}
		return mCenterList;
	}

	public void setMCenterList(List<MCenterDto> mCenterList) {
		this.mCenterList = mCenterList;
	}

	public String getStockNumDisplay() {

		return stockNumDisplay;
	}

	public void setStockNumDisplay(String _stockNumDisplay) {
		__modifiedProperties.add("_stockNumDisplay");
		this.stockNumDisplay = _stockNumDisplay;
	}

	public BigDecimal getExpiredStockNum() {
		return expiredStockNum;
	}

	public void setExpiredStockNum(BigDecimal _expiredStockNum) {
		__modifiedProperties.add("_expiredStockNum");
		this.expiredStockNum = _expiredStockNum;
	}

	public BigDecimal getStockNum() {
		return stockNum;
	}

	public void setStockNum(BigDecimal _stockNum) {
		__modifiedProperties.add("_stockNum");
		this.stockNum = _stockNum;
	}

	public String getFixedPointDisplay() {
		return fixedPointDisplay;
	}

	public void setFixedPointDisplay(String _fixedPointDisplay) {
		__modifiedProperties.add("_fixedPointDisplay");
		this.fixedPointDisplay = _fixedPointDisplay;
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
		return _moveNumInfo;
	}

	public void setMoveNumInfo(BigDecimal moveNumInfo) {
		__modifiedProperties.add("_moveNumInfo");
		this._moveNumInfo = moveNumInfo;
	}

	public String getRowColorFlg() {
		return _rowColorFlg;
	}

	public void setRowColorFlg(String rowColorFlg) {
		__modifiedProperties.add("_rowColorFlg");
		this._rowColorFlg = rowColorFlg;
	}

	public String getDblFlg() {
		return _dblFlg;
	}

	public void setDblFlg(String _dblFlg) {
		this._dblFlg = _dblFlg;
	}

	public Long getLineNo() {
		return lineNo;
	}

	public void setLineNo(Long lineNo) {
		this.lineNo = lineNo;
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
	public void setMoveLocationCD(String moveLocationCd) {
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
