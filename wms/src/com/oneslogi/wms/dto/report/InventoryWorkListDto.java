package com.oneslogi.wms.dto.report;

import java.math.BigDecimal;

import com.oneslogi.base.dto.ReportDto;
import com.oneslogi.base.util.CommonUtil;

public class InventoryWorkListDto extends ReportDto {

	public String clientCd;

	public String clientNm;

	public String centerCd;

	public String centerNm;

	public String warehouseCd;

	public String warehouseNm;

	public String inventoryDt;

	public String zoneCd;

	public String zoneNm;

	public String stockTypeCd;

	public String stockTypeNm;

	public String depositCd;

	public String depositNm;

	public String locationCd;

	public String locationNm;

	public String productCd;

	public String productNm;

	public String janCd;

	public Long unitNum;

	public String storeLabelNo;

	//[ON推-品質問題点指摘（新ｿﾘV2-034）]修正対応 2016.08.01 chou Add Start
    //入庫日
	public String storeDt;

    //入庫No.管理フラグ
	public String storeNoFlg;
	//[ON推-品質問題点指摘（新ｿﾘV2-034）]修正対応 2016.08.01 chou Add End

	public Long storeNo;

	public BigDecimal stockNum;

	// 2014/10/27 新ｿﾘ-038 add start
	public BigDecimal allocNum;
	// 2014/10/27 新ｿﾘ-038 add end

	public BigDecimal stockCaseNum;

	public BigDecimal stockPieceNum;

	public BigDecimal totalPieceNmu;

	public String lot;

	public String limitDt;

	public String stockExistOnlyFlg;
	// 作業中数を追加する 2015.11.13 hayashi Start
	public BigDecimal moveNum;
	// 作業中数を追加する 2015.11.13 hayashi End

	// [Ver3.0] unit of measure対応 2017.11.28 HDIS王 Start
	//入数
	private String stringUnitNum;

	//内訳
	private String breakdown;

	//最小梱包単位
	private String minimumPackingUnit;
	// [Ver3.0] unit of measure対応 2017.11.28 HDIS王 End

	public String getClientCd() {
		return clientCd;
	}

	public String getClientNm() {
		return clientNm;
	}

	public String getCenterCd() {
		return centerCd;
	}

	public String getCenterNm() {
		return centerNm;
	}

	public String getWarehouseCd() {
		return warehouseCd;
	}

	public String getWarehouseNm() {
		return warehouseNm;
	}

	public String getInventoryDt() {
		return inventoryDt;
	}

	public String getZoneCd() {
		return zoneCd;
	}

	public String getZoneNm() {
		return zoneNm;
	}

	public String getStockTypeCd() {
		return stockTypeCd;
	}

	public String getStockTypeNm() {
		return stockTypeNm;
	}

	public String getDepositCd() {
		return depositCd;
	}

	public String getDepositNm() {
		return depositNm;
	}

	public String getLocationCd() {
		return locationCd;
	}

	public String getLocationNm() {
		return locationNm;
	}

	public String getProductCd() {
		return productCd;
	}

	public String getProductNm() {
		return productNm;
	}

	public String getJanCd() {
		return janCd;
	}

	public Long getUnitNum() {
		return CommonUtil.nullToZero(unitNum);
	}

	public String getStoreLabelNo() {
		return storeLabelNo;
	}

	public Long getStoreNo() {
		return CommonUtil.nullToZero(storeNo);
	}

	public BigDecimal getStockNum() {
		return CommonUtil.nullToZero(stockNum);
	}

	// 2014/10/27 新ｿﾘ-038 add start
	public BigDecimal getAllocNum() {
		return CommonUtil.nullToZero(allocNum);
	}
	// 2014/10/27 新ｿﾘ-038 add end

	public BigDecimal getStockCaseNum() {
		return CommonUtil.nullToZero(stockCaseNum);
	}

	public BigDecimal getStockPieceNum() {
		return CommonUtil.nullToZero(stockPieceNum);
	}

	public BigDecimal getTotalPieceNmu() {
		return CommonUtil.nullToZero(totalPieceNmu);
	}

	public String getLot() {
		return lot;
	}

	public String getlimitDt() {
		return limitDt;
	}

	public String getStockExistOnlyFlg() {
		return stockExistOnlyFlg;
	}

	public BigDecimal getMoveNum() {
		return CommonUtil.nullToZero(moveNum);
	}
	//[ON推-品質問題点指摘（新ｿﾘV2-034）]修正対応 2016.08.01 chou Add Start
	public String getStoreDt() {
		return storeDt;
	}

	public String getStoreNoFlg() {
		return storeNoFlg;
	}
	//[ON推-品質問題点指摘（新ｿﾘV2-034）]修正対応 2016.08.01 chou Add End

	// [Ver3.0] unit of measure対応 2017.11.28 HDIS王 Start
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
	// [Ver3.0] unit of measure対応 2017.11.28 HDIS王 End
}
