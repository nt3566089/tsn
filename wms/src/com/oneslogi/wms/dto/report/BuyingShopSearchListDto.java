package com.oneslogi.wms.dto.report;

import com.oneslogi.base.dto.ReportDto;

/**
 * 買受店検索リストDTOクラス
 */
public class BuyingShopSearchListDto extends ReportDto {

	/** 仕分日 */
	public String srYmd;
	/** ライン/ブロック */
	public String lineBlockCd;
	/** 配達拠点 */
	public String centerNm;
	/** 方面 */
	public String ded;
	/** 対象銘柄_銘柄コード */
	public String zzMatnr1;
	/** 対象銘柄_銘柄名称 */
	public String productNm1;
	/** 参考銘柄_銘柄コード */
	public String zzMatnr2;
	/** 参考銘柄_銘柄名称 */
	public String productNm2;
	/** 配達日 */
	public String dlvYmd;
	/** ピストン区分 */
	public String pstnId;
	/** 仕分順 */
	public String srRnk;
	/** お得意様コード */
	public String ssCd;
	/** 通番 */
	public String dlvSnm;
	/** お得意様 */
	public String ssNm;
	/** 対象銘柄_段ボール */
	public Long slqaCb1;
	/** 対象銘柄_カートン合計 */
	public Long slqaCt1;
	/** 対象銘柄_箱タイプ */
	public String boxTyp1;
	/** 対象銘柄_箱No */
	public String boxNo1;
	/** 対象銘柄_数量 */
	public Long slqaNum1;
	/** 参考銘柄_段ボール */
	public Long slqaCb2;
	/** 参考銘柄_カートン合計 */
	public Long slqaCt2;
	/** 参考銘柄_箱タイプ */
	public String boxTyp2;
	/** 参考銘柄_箱No */
	public String boxNo2;
	/** 参考銘柄_数量 */
	public Long slqaNum2;
	/** 総合計_段ボール数 */
	public Long slqaCb3;
	/** 総合計_カートン合計 */
	public Long slqaCt3;
	/** 最終行フラグ */
	public Boolean lastDetailFlg;

	// ===== 以下、ゲッタ・セッタ =====

	public String getSrYmd() {
		return srYmd;
	}

	public void setSrYmd(String srYmd) {
		this.srYmd = srYmd;
	}

	public String getLineBlockCd() {
		return lineBlockCd;
	}

	public void setLineBlockCd(String lineBlockCd) {
		this.lineBlockCd = lineBlockCd;
	}

	public String getCenterNm() {
		return centerNm;
	}

	public void setCenterNm(String centerNm) {
		this.centerNm = centerNm;
	}

	public String getDed() {
		return ded;
	}

	public void setDed(String ded) {
		this.ded = ded;
	}

	public String getZzMatnr1() {
		return zzMatnr1;
	}

	public void setZzMatnr1(String zzMatnr1) {
		this.zzMatnr1 = zzMatnr1;
	}

	public String getProductNm1() {
		return productNm1;
	}

	public void setProductNm1(String productNm1) {
		this.productNm1 = productNm1;
	}

	public String getZzMatnr2() {
		return zzMatnr2;
	}

	public void setZzMatnr2(String zzMatnr2) {
		this.zzMatnr2 = zzMatnr2;
	}

	public String getProductNm2() {
		return productNm2;
	}

	public void setProductNm2(String productNm2) {
		this.productNm2 = productNm2;
	}

	public String getDlvYmd() {
		return dlvYmd;
	}

	public void setDlvYmd(String dlvYmd) {
		this.dlvYmd = dlvYmd;
	}

	public String getPstnId() {
		return pstnId;
	}

	public void setPstnId(String pstnId) {
		this.pstnId = pstnId;
	}

	public String getSrRnk() {
		return srRnk;
	}

	public void setSrRnk(String srRnk) {
		this.srRnk = srRnk;
	}

	public String getSsCd() {
		return ssCd;
	}

	public void setSsCd(String ssCd) {
		this.ssCd = ssCd;
	}

	public String getDlvSnm() {
		return dlvSnm;
	}

	public void setDlvSnm(String dlvSnm) {
		this.dlvSnm = dlvSnm;
	}

	public String getSsNm() {
		return ssNm;
	}

	public void setSsNm(String ssNm) {
		this.ssNm = ssNm;
	}

	public Long getSlqaCb1() {
		return slqaCb1;
	}

	public void setSlqaCb1(Long slqaCb1) {
		this.slqaCb1 = slqaCb1;
	}

	public Long getSlqaCt1() {
		return slqaCt1;
	}

	public void setSlqaCt1(Long slqaCt1) {
		this.slqaCt1 = slqaCt1;
	}

	public String getBoxTyp1() {
		return boxTyp1;
	}

	public void setBoxTyp1(String boxTyp1) {
		this.boxTyp1 = boxTyp1;
	}

	public String getBoxNo1() {
		return boxNo1;
	}

	public void setBoxNo1(String boxNo1) {
		this.boxNo1 = boxNo1;
	}

	public Long getSlqaNum1() {
		return slqaNum1;
	}

	public void setSlqaNum1(Long slqaNum1) {
		this.slqaNum1 = slqaNum1;
	}

	public Long getSlqaCb2() {
		return slqaCb2;
	}

	public void setSlqaCb2(Long slqaCb2) {
		this.slqaCb2 = slqaCb2;
	}

	public Long getSlqaCt2() {
		return slqaCt2;
	}

	public void setSlqaCt2(Long slqaCt2) {
		this.slqaCt2 = slqaCt2;
	}

	public String getBoxTyp2() {
		return boxTyp2;
	}

	public void setBoxTyp2(String boxTyp2) {
		this.boxTyp2 = boxTyp2;
	}

	public String getBoxNo2() {
		return boxNo2;
	}

	public void setBoxNo2(String boxNo2) {
		this.boxNo2 = boxNo2;
	}

	public Long getSlqaNum2() {
		return slqaNum2;
	}

	public void setSlqaNum2(Long slqaNum2) {
		this.slqaNum2 = slqaNum2;
	}

	public Long getSlqaCb3() {
		return slqaCb3;
	}

	public void setSlqaCb3(Long slqaCb3) {
		this.slqaCb3 = slqaCb3;
	}

	public Long getSlqaCt3() {
		return slqaCt3;
	}

	public void setSlqaCt3(Long slqaCt3) {
		this.slqaCt3 = slqaCt3;
	}

	public Boolean getLastDetailFlg() {
		return lastDetailFlg;
	}

	public void setLastDetailFlg(Boolean lastDetailFlg) {
		this.lastDetailFlg = lastDetailFlg;
	}

}
