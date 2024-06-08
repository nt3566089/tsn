package com.oneslogi.wms.dto.report;

import java.math.BigDecimal;

import com.oneslogi.base.dto.ReportDto;
import com.oneslogi.base.util.CommonUtil;

public class InventoryDiffListDto extends ReportDto {

	public String clientCd;

	public String clientNm;

	public String centerCd;

	public String centerNm;

	public String warehouseCd;

	public String warehouseNm;

	public String inventoryDt;

	public String stockTypeCd;

	public String stockTypeNm;

	public String depositCd;

	public String depositNm;

	public String productCd;

	public String productNm;

	public String janCd;

	public String storeLabelNo;

	//[ON推-品質問題点指摘（新ｿﾘV2-034）]修正対応 2016.08.01 chou Add Start
	//入庫日
	public String storeDt;

	//入庫No.管理フラグ
	public String storeNoFlg;
	//[ON推-品質問題点指摘（新ｿﾘV2-034）]修正対応 2016.08.01 chou Add End

	// [Ver3.0] unit of measure対応 2017.11.29 REN Start
	//入数
	private String stringUnitNum;

	//在庫内訳
	private String stockBreakdown;

	//棚卸内訳
	private String inventoryBreakdown;

	//最小梱包単位
	private String minimumPackingUnit;
	// [Ver3.0] unit of measure対応 2017.11.29 REN End

	public Long storeNo;

	public String limitDt;

	public String lot;

	public Long unitNum;

	public String locationCd;

	public String locationNm;

	public BigDecimal stockNum;

	public BigDecimal stockCaseNum;

	public BigDecimal stockPieceNum;

	public BigDecimal inventoryNum;

	public BigDecimal inventoryCaseNum;

	public BigDecimal inventoryPieceNum;

	public BigDecimal diffNum;

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

	public String getProductCd() {
		return productCd;
	}

	public String getProductNm() {
		return productNm;
	}

	public String getJanCd() {
		return janCd;
	}

	public String getStoreLabelNo() {
		return storeLabelNo;
	}

	public Long getStoreNo() {
		return CommonUtil.nullToZero(storeNo);
	}

	public String getlimitDt() {
		return limitDt;
	}

	public String getLot() {
		return lot;
	}

	public Long getUnitNum() {
		return CommonUtil.nullToZero(unitNum);
	}

	public String getLocationCd() {
		return locationCd;
	}

	public String getLocationNm() {
		return locationNm;
	}

	public BigDecimal getStockNum() {
		return CommonUtil.nullToZero(stockNum);
	}

	public BigDecimal getStockCaseNum() {
		return CommonUtil.nullToZero(stockCaseNum);
	}

	public BigDecimal getStockPieceNum() {
		return CommonUtil.nullToZero(stockPieceNum);
	}

	public BigDecimal getInventoryNum() {
		return CommonUtil.nullToZero(inventoryNum);
	}

	public BigDecimal getInventoryCaseNum() {
		return CommonUtil.nullToZero(inventoryCaseNum);
	}

	public BigDecimal getInventoryPieceNum() {
		return CommonUtil.nullToZero(inventoryPieceNum);
	}

	public BigDecimal getDiffNum() {
		return CommonUtil.nullToZero(diffNum);
	}

	//[ON推-品質問題点指摘（新ｿﾘV2-034）]修正対応 2016.08.01 chou Add Start
	public String getStoreDt() {
		return storeDt;
	}

	public String getStoreNoFlg() {
		return storeNoFlg;
	}

	//[ON推-品質問題点指摘（新ｿﾘV2-034）]修正対応 2016.08.01 chou Add End

	// [Ver3.0] unit of measure対応 2017.11.29 REN Start
	//入数
	public String getStringUnitNum() {
		return stringUnitNum;
	}

	public void setStringUnitNum(String stringUnitNum) {
		this.stringUnitNum = stringUnitNum;
	}

	//在庫内訳
	public String getStockBreakdown() {
		return stockBreakdown;
	}

	public void setStockBreakdown(String stockBreakdown) {
		this.stockBreakdown = stockBreakdown;
	}

	//棚卸内訳
	public String getInventoryBreakdown() {
		return inventoryBreakdown;
	}

	public void setInventoryBreakdown(String inventoryBreakdown) {
		this.inventoryBreakdown = inventoryBreakdown;
	}

	//最小梱包単位
	public String getMinimumPackingUnit() {
		return minimumPackingUnit;
	}

	public void setMinimumPackingUnit(String minimumPackingUnit) {
		this.minimumPackingUnit = minimumPackingUnit;
	}

	// [Ver3.0] unit of measure対応 2017.11.29 REN End
}
