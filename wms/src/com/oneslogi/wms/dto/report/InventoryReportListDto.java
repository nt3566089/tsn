package com.oneslogi.wms.dto.report;

import com.oneslogi.base.dto.ReportDto;

/**
 * 在庫調査表DTOクラス
 */
public class InventoryReportListDto extends ReportDto {

	/** 実施日 */
	public String executeDate;
	/** 事業所名 */
	public String centerNm;
	/** 銘柄コード */
	public String itemCd;
	/** 銘柄名称 */
	public String productNm;
	/** 前日までの過不足 */
	public Long ydayTleQulyTotalInv;
	/** 当日過不足 */
	public Long tdayEqyTotalInv;
	/** 過不足計 */
	public Long excessDeficiencyTotal;
	/** 台帳在庫 */
	public Long sysinvTotalInv;
	/** SD在庫調査計 */
	public Long investTotalInv;
	/** 保管場在庫 */
	public Long investKeepLocInv;
	/** 引取場在庫 */
	public Long investReceiveLocInv;
	/** かし品在庫 */
	public Long investDamageItem;
	/** 仕分場在庫 */
	public Long investClssifyLocInv;
	/** 仮置場在庫仕分済分 */
	public Long investTmpLocInv;
	/** 離島在庫 */
	public Long investAutoInv;
	/** 過剰 */
	public Long excessTotalInv;
	/** 不足 */
	public Long defectTotalInv;
	/** 合計_過不足計 */
	public Long totalExcessDeficiencyTotal;
	/** 合計_台帳在庫 */
	public Long totalSysinvTotalInv;
	/** 合計_SD在庫調査計 */
	public Long totalInvestTotalInv;
	/** 合計_保管場在庫 */
	public Long totalInvestKeepLocInv;
	/** 合計_引取場在庫 */
	public Long totalInvestReceiveLocInv;
	/** 合計_かし品在庫 */
	public Long totalInvestDamageItem;
	/** 合計_仕分場在庫 */
	public Long totalInvestClssifyLocInv;
	/** 合計_仮置場在庫仕分済分 */
	public Long totalInvestTmpLocInv;
	/** 合計_離島在庫 */
	public Long totalInvestAutoInv;
	/** 一般出力順 */
	public String userNum3;
	/** 庫内作業集約コード */
	public String dualItemCd;
	/** 庫内作業集約フラグ */
	public String dualItemCdFlg;
	/** CAP銘柄 */
	public String capItemFlg;
	/** 拠点コ－ド */
	public String warehouseCd;
	/** ユーザ名称 */
	public String userNm;
	/** ユーザコード */
	public String userCd;
	/** たばこ商品区分 */
	public String category;
	/** たばこ商品区分(ソートキー) */
	public String categorySortKey;
	/** 帳票出力区分 */
	public String reportOutType;

	// ===== 以下、ゲッタ・セッタ =====

	public String getExecuteDate() {
		return executeDate;
	}

	public void setExecuteDate(String executeDate) {
		this.executeDate = executeDate;
	}

	public String getCenterNm() {
		return centerNm;
	}

	public void setCenterNm(String centerNm) {
		this.centerNm = centerNm;
	}

	public String getItemCd() {
		return itemCd;
	}

	public void setItemCd(String itemCd) {
		this.itemCd = itemCd;
	}

	public String getProductNm() {
		return productNm;
	}

	public void setProductNm(String productNm) {
		this.productNm = productNm;
	}

	public Long getYdayTleQulyTotalInv() {
		return ydayTleQulyTotalInv;
	}

	public void setYdayTleQulyTotalInv(Long ydayTleQulyTotalInv) {
		this.ydayTleQulyTotalInv = ydayTleQulyTotalInv;
	}

	public Long getTdayEqyTotalInv() {
		return tdayEqyTotalInv;
	}

	public void setTdayEqyTotalInv(Long tdayEqyTotalInv) {
		this.tdayEqyTotalInv = tdayEqyTotalInv;
	}

	public Long getExcessDeficiencyTotal() {
		return excessDeficiencyTotal;
	}

	public void setExcessDeficiencyTotal(Long excessDeficiencyTotal) {
		this.excessDeficiencyTotal = excessDeficiencyTotal;
	}

	public Long getSysinvTotalInv() {
		return sysinvTotalInv;
	}

	public void setSysinvTotalInv(Long sysinvTotalInv) {
		this.sysinvTotalInv = sysinvTotalInv;
	}

	public Long getInvestTotalInv() {
		return investTotalInv;
	}

	public void setInvestTotalInv(Long investTotalInv) {
		this.investTotalInv = investTotalInv;
	}

	public Long getInvestKeepLocInv() {
		return investKeepLocInv;
	}

	public void setInvestKeepLocInv(Long investKeepLocInv) {
		this.investKeepLocInv = investKeepLocInv;
	}

	public Long getInvestReceiveLocInv() {
		return investReceiveLocInv;
	}

	public void setInvestReceiveLocInv(Long investReceiveLocInv) {
		this.investReceiveLocInv = investReceiveLocInv;
	}

	public Long getInvestDamageItem() {
		return investDamageItem;
	}

	public void setInvestDamageItem(Long investDamageItem) {
		this.investDamageItem = investDamageItem;
	}

	public Long getInvestClssifyLocInv() {
		return investClssifyLocInv;
	}

	public void setInvestClssifyLocInv(Long investClssifyLocInv) {
		this.investClssifyLocInv = investClssifyLocInv;
	}

	public Long getInvestTmpLocInv() {
		return investTmpLocInv;
	}

	public void setInvestTmpLocInv(Long investTmpLocInv) {
		this.investTmpLocInv = investTmpLocInv;
	}

	public Long getInvestAutoInv() {
		return investAutoInv;
	}

	public void setInvestAutoInv(Long investAutoInv) {
		this.investAutoInv = investAutoInv;
	}

	public Long getExcessTotalInv() {
		return excessTotalInv;
	}

	public void setExcessTotalInv(Long excessTotalInv) {
		this.excessTotalInv = excessTotalInv;
	}

	public Long getDefectTotalInv() {
		return defectTotalInv;
	}

	public void setDefectTotalInv(Long defectTotalInv) {
		this.defectTotalInv = defectTotalInv;
	}

	public Long getTotalExcessDeficiencyTotal() {
		return totalExcessDeficiencyTotal;
	}

	public void setTotalExcessDeficiencyTotal(Long totalExcessDeficiencyTotal) {
		this.totalExcessDeficiencyTotal = totalExcessDeficiencyTotal;
	}

	public Long getTotalSysinvTotalInv() {
		return totalSysinvTotalInv;
	}

	public void setTotalSysinvTotalInv(Long totalSysinvTotalInv) {
		this.totalSysinvTotalInv = totalSysinvTotalInv;
	}

	public Long getTotalInvestTotalInv() {
		return totalInvestTotalInv;
	}

	public void setTotalInvestTotalInv(Long totalInvestTotalInv) {
		this.totalInvestTotalInv = totalInvestTotalInv;
	}

	public Long getTotalInvestKeepLocInv() {
		return totalInvestKeepLocInv;
	}

	public void setTotalInvestKeepLocInv(Long totalInvestKeepLocInv) {
		this.totalInvestKeepLocInv = totalInvestKeepLocInv;
	}

	public Long getTotalInvestReceiveLocInv() {
		return totalInvestReceiveLocInv;
	}

	public void setTotalInvestReceiveLocInv(Long totalInvestReceiveLocInv) {
		this.totalInvestReceiveLocInv = totalInvestReceiveLocInv;
	}

	public Long getTotalInvestDamageItem() {
		return totalInvestDamageItem;
	}

	public void setTotalInvestDamageItem(Long totalInvestDamageItem) {
		this.totalInvestDamageItem = totalInvestDamageItem;
	}

	public Long getTotalInvestClssifyLocInv() {
		return totalInvestClssifyLocInv;
	}

	public void setTotalInvestClssifyLocInv(Long totalInvestClssifyLocInv) {
		this.totalInvestClssifyLocInv = totalInvestClssifyLocInv;
	}

	public Long getTotalInvestTmpLocInv() {
		return totalInvestTmpLocInv;
	}

	public void setTotalInvestTmpLocInv(Long totalInvestTmpLocInv) {
		this.totalInvestTmpLocInv = totalInvestTmpLocInv;
	}

	public Long getTotalInvestAutoInv() {
		return totalInvestAutoInv;
	}

	public void setTotalInvestAutoInv(Long totalInvestAutoInv) {
		this.totalInvestAutoInv = totalInvestAutoInv;
	}

	public String getUserNum3() {
		return userNum3;
	}

	public void setUserNum3(String userNum3) {
		this.userNum3 = userNum3;
	}

	public String getDualItemCd() {
		return dualItemCd;
	}

	public void setDualItemCd(String dualItemCd) {
		this.dualItemCd = dualItemCd;
	}

	public String getDualItemCdFlg() {
		return dualItemCdFlg;
	}

	public void setDualItemCdFlg(String dualItemCdFlg) {
		this.dualItemCdFlg = dualItemCdFlg;
	}

	public String getCapItemFlg() {
		return capItemFlg;
	}

	public void setCapItemFlg(String capItemFlg) {
		this.capItemFlg = capItemFlg;
	}

	public String getWarehouseCd() {
		return warehouseCd;
	}

	public void setWarehouseCd(String warehouseCd) {
		this.warehouseCd = warehouseCd;
	}

	public String getUserNm() {
		return userNm;
	}

	public void setUserNm(String userNm) {
		this.userNm = userNm;
	}

	public String getUserCd() {
		return userCd;
	}

	public void setUserCd(String userCd) {
		this.userCd = userCd;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getCategorySortKey() {
		return categorySortKey;
	}

	public void setCategorySortKey(String categorySortKey) {
		this.categorySortKey = categorySortKey;
	}

	public String getReportOutType() {
		return reportOutType;
	}

	public void setReportOutType(String reportOutType) {
		this.reportOutType = reportOutType;
	}

}
