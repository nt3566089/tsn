package com.oneslogi.wms.dto.shipping;

import java.math.BigDecimal;


// 出荷指示ボディ
public class ShippingSendFromSdsDtoBody {
	// Invoice Line ID
	public Long invLId;
	// 商品CD
	public String productCd;
	// 預託CD
	public String depositCd;
	// 在庫区分CD
	public String stockTypeCd;
	// 指示数
	public BigDecimal instNum;
	// 指定ロット
	public String lot;
	// 指定期限
	public String limitDt;
	// 指定倉庫CD
	public String warehouseCd;
	// 指定ロケーションCD
	public String locationCd;

	// 出荷指示ボディ
	public Long getInvLId() {
		return invLId;
	}

	public void setInvLId(Long invLId) {
		this.invLId = invLId;
	}

	public String getProductCd() {
		return productCd;
	}

	public void setProductCd(String productCd) {
		this.productCd = productCd;
	}

	public String getDepositCd() {
		return depositCd;
	}

	public void setDepositCd(String depositCd) {
		this.depositCd = depositCd;
	}

	public String getStockTypeCd() {
		return stockTypeCd;
	}

	public void setStockTypeCd(String stockTypeCd) {
		this.stockTypeCd = stockTypeCd;
	}

	public BigDecimal getInstNum() {
		return instNum;
	}

	public void setInstNum(BigDecimal bigDecimal) {
		this.instNum = bigDecimal;
	}

	public String getLot() {
		return lot;
	}

	public void setLot(String lot) {
		this.lot = lot;
	}

	public String getLimitDt() {
		return limitDt;
	}

	public void setLimitDt(String limitDt) {
		this.limitDt = limitDt;
	}

	public String getWarehouseCd() {
		return warehouseCd;
	}

	public void setWarehouseCd(String warehouseCd) {
		this.warehouseCd = warehouseCd;
	}

	public String getLocationCd() {
		return locationCd;
	}

	public void setLocationCd(String locationCd) {
		this.locationCd = locationCd;
	}
}
