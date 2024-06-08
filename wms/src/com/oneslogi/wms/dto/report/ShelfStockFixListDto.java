package com.oneslogi.wms.dto.report;

import java.math.BigDecimal;

import com.oneslogi.base.dto.ReportDto;

/**
 * 棚在庫修正リストDTOクラス
 */
public class ShelfStockFixListDto extends ReportDto {

	/** ライン/ブロック */
	public String linBlk;
	/** ロケーション */
	public String locationCd;
	/** 銘柄CD */
	public String productCd;
	/** 銘柄名 */
	public String productNm;
	/** 修正前段ボール */
	public BigDecimal cbqa1;
	/** 修正前カートン */
	public BigDecimal ctqa1;
	/** 修正数量段ボール */
	public BigDecimal cbqa2;
	/** 修正数量カートン */
	public BigDecimal ctqa2;
	/** 修正後段ボール */
	public BigDecimal cbqa3;
	/** 修正後カートン */
	public BigDecimal ctqa3;
	/** ロケ修正情報 */
	public String addProcess;


	// ===== 以下、ゲッタ・セッタ =====

	public String getLinBlk() {
		return linBlk;
	}

	public void setLinBlk(String linBlk) {
		this.linBlk = linBlk;
	}

	public String getLocationCd() {
		return locationCd;
	}

	public void setLocationCd(String locationCd) {
		this.locationCd = locationCd;
	}

	public String getProductCd() {
		return productCd;
	}

	public void setProductCd(String productCd) {
		this.productCd = productCd;
	}

	public String getProductNm() {
		return productNm;
	}

	public void setProductNm(String productNm) {
		this.productNm = productNm;
	}

	public BigDecimal getCbqa1() {
		return cbqa1;
	}

	public void setCbqa1(BigDecimal cbqa1) {
		this.cbqa1 = cbqa1;
	}

	public BigDecimal getCtqa1() {
		return ctqa1;
	}

	public void setCtqa1(BigDecimal ctqa1) {
		this.ctqa1 = ctqa1;
	}

	public BigDecimal getCbqa2() {
		return cbqa2;
	}

	public void setCbqa2(BigDecimal cbqa2) {
		this.cbqa2 = cbqa2;
	}

	public BigDecimal getCtqa2() {
		return ctqa2;
	}

	public void setCtqa2(BigDecimal ctqa2) {
		this.ctqa2 = ctqa2;
	}

	public BigDecimal getCbqa3() {
		return cbqa3;
	}

	public void setCbqa3(BigDecimal cbqa3) {
		this.cbqa3 = cbqa3;
	}

	public BigDecimal getCtqa3() {
		return ctqa3;
	}

	public void setCtqa3(BigDecimal ctqa3) {
		this.ctqa3 = ctqa3;
	}

	public String getAddProcess() {
		return addProcess;
	}

	public void setAddProcess(String addProcess) {
		this.addProcess = addProcess;
	}

}
