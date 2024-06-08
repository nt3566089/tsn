package com.oneslogi.base.dbflute.dto;

import java.math.BigDecimal;

import com.oneslogi.base.dbflute.dto.bs.BsTPickingBDto;

/**
 * The entity of t_picking_b.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class TPickingBDto extends BsTPickingBDto {

	/** Serial version UID. (Default) */
	private static final long serialVersionUID = 1L;

	// [ON推-品向-1101]明細に混載フラグを追加 2016.04.21 ichikawa Stert

	/** MIXED_FLG: Derived Referrer Alias. */
	public static final String ALIAS_mixedFlg = "MIXED_FLG";
	/** MIXED_FLG: (Derived Referrer) */
	protected String _mixedFlg;
	/** MIXED_FLG_NM: (Derived Referrer) */
	protected String _mixedFlgNm;
	// [ON推-品向-1101]明細に混載フラグを追加 2016.04.21 ichikawa End
	// [#5114][v3.1] 単行ピッキングリスト作成 2018.08.08 kawana Start
	// 入庫No.管理フラグ
	private String storeNoFlg;
	// 入数
	private String stringUnitNum;
	// 内訳
	private String breakdown;
	// 最小梱包単位
	private String minimumPackingUnit;
	// 合計ピック数
	private BigDecimal sumPickingNum;
	// 合計内訳
	private String sumBreakdown;
	// [#5114][v3.1] 単行ピッキングリスト作成 2018.08.08 kawana End

	public String getMixedFlg() {
		return _mixedFlg;
	}

	public void setMixedFlg(String _mixedFlg) {
		this._mixedFlg = _mixedFlg;
	}

	public String getMixedFlgNm() {
		return _mixedFlgNm;
	}

	public void setMixedFlgNm(String _mixedFlgNm) {
		this._mixedFlgNm = _mixedFlgNm;
	}

	public String getStoreNoFlg() {
		return storeNoFlg;
	}

	public void setStoreNoFlg(String storeNoFlg) {
		this.storeNoFlg = storeNoFlg;
	}

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

	public BigDecimal getSumPickingNum() {
		return sumPickingNum;
	}

	public void setSumPickingNum(BigDecimal sumPickingNum) {
		this.sumPickingNum = sumPickingNum;
	}

	public String getSumBreakdown() {
		return sumBreakdown;
	}

	public void setSumBreakdown(String sumBreakdown) {
		this.sumBreakdown = sumBreakdown;
	}
}
