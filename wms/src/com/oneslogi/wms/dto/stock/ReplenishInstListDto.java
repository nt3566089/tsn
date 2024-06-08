package com.oneslogi.wms.dto.stock;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dto.BaseDto;
import com.oneslogi.base.dto.OutputDto;
import com.oneslogi.wms.core.WCC;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class ReplenishInstListDto extends OutputDto {

	public static class ReplenishInstListHeadData implements Serializable {

		//検索条件（ヘッダ情報）

		//荷主CD
		public String clientCd_H;
		//センタCD
		public String centerCd_H;
		//在庫区分CD
		public String stockTypeCd_H;
		//預託CD
		public String depositCd_H;
		//商品CD
		public String productCd_H;
		//商品名称
		public String productNm_H;
		//補充先倉庫
		public String replenishToWarehouseCd_H;
		//補充先ゾーン
		public String replenishToZoneCd_H;
		//補充先ロケーションCD（From）
		public String replenishToLocationCdFrom_H;
		//補充先ロケーション名称（From）
		public String replenishToLocationNmFrom_H;
		//補充先ロケーションCD（To）
		public String replenishToLocationCdTo_H;
		//補充先ロケーション名称（To）
		public String replenishToLocationNmTo_H;
		//補充点条件
		public String replenishMinNumCond_H;



		//--------------------以下はeclipseで自動的に生成された。-----------------------------

		public String getClientCd_H() {
			return clientCd_H;
		}
		public void setClientCd_H(String clientCd_H) {
			this.clientCd_H = clientCd_H;
		}
		public String getCenterCd_H() {
			return centerCd_H;
		}
		public void setCenterCd_H(String centerCd_H) {
			this.centerCd_H = centerCd_H;
		}
		public String getStockTypeCd_H() {
			return stockTypeCd_H;
		}
		public void setStockTypeCd_H(String stockTypeCd_H) {
			this.stockTypeCd_H = stockTypeCd_H;
		}
		public String getProductCd_H() {
			return productCd_H;
		}
		public void setProductCd_H(String productCd_H) {
			this.productCd_H = productCd_H;
		}
		public String getProductNm_H() {
			return productNm_H;
		}
		public void setProductNm_H(String productNm_H) {
			this.productNm_H = productNm_H;
		}
		public String getReplenishToWarehouseCd_H() {
			return replenishToWarehouseCd_H;
		}
		public void setReplenishToWarehouseCd_H(String replenishToWarehouseCd_H) {
			this.replenishToWarehouseCd_H = replenishToWarehouseCd_H;
		}
		public String getReplenishToZoneCd_H() {
			return replenishToZoneCd_H;
		}
		public void setReplenishToZoneCd_H(String replenishToZoneCd_H) {
			this.replenishToZoneCd_H = replenishToZoneCd_H;
		}
		public String getReplenishToLocationCdFrom_H() {
			return replenishToLocationCdFrom_H;
		}
		public void setReplenishToLocationCdFrom_H(String replenishToLocationCdFrom_H) {
			this.replenishToLocationCdFrom_H = replenishToLocationCdFrom_H;
		}
		public String getReplenishToLocationNmFrom_H() {
			return replenishToLocationNmFrom_H;
		}
		public void setReplenishToLocationNmFrom_H(String replenishToLocationNmFrom_H) {
			this.replenishToLocationNmFrom_H = replenishToLocationNmFrom_H;
		}
		public String getReplenishToLocationCdTo_H() {
			return replenishToLocationCdTo_H;
		}
		public void setReplenishToLocationCdTo_H(String replenishToLocationCdTo_H) {
			this.replenishToLocationCdTo_H = replenishToLocationCdTo_H;
		}
		public String getReplenishToLocationNmTo_H() {
			return replenishToLocationNmTo_H;
		}
		public void setReplenishToLocationNmTo_H(String replenishToLocationNmTo_H) {
			this.replenishToLocationNmTo_H = replenishToLocationNmTo_H;
		}
		public String getReplenishMinNumCond_H() {
			return replenishMinNumCond_H;
		}
		public void setReplenishMinNumCond_H(String replenishMinNumCond_H) {
			this.replenishMinNumCond_H = replenishMinNumCond_H;
		}
		public String getDepositCd_H() {
			return depositCd_H;
		}
		public void setDepositCd_H(String depositCd_H) {
			this.depositCd_H = depositCd_H;
		}


	}

	public static class ReplenishInstListBodyData implements Serializable {

		//検索一覧結果（ボディ情報）
		//荷主ID
		public Long clientId;
		//荷主CD
		public String clientCd;
		//センタID
		public Long centerId;
		//センタCD
		public String centerCd;

		//荷主センタ変更対応 201７.02.09 sja Start
		//荷主名称
		public String clientNm;
		//センタ名称
		public String centerNm;
		//荷主センタ変更対応 201７.02.09 sja End

		//倉庫ID
		public Long warehouseId;
		//倉庫CD
		public String warehouseCd;
		//補充先ロケーションID
		public Long replenishToLocationId;
		//補充先ロケーションCD
		public String replenishToLocationCd;
		//補充先ロケーション名称
		public String replenishToLocationNm;
		//商品ID
		public Long productId;
		//商品CD
		public String productCd;
		//商品名称
		public String productNm;
		//商品略称
		public String productAbbr;
		//在庫区分ID
		public Long stockTypeId;
		//在庫区分CD
		public String stockTypeCd;
		//在庫区分名称
		public String stockTypeNm;

		//預託ID
		public Long depositId;
		//預託CD
		public String depositCd;
		//預託名称
		public String depositNm;

		//補充元在庫数
		public BigDecimal replenishFromStockNum = WCC.ZERO;
		//補充先在庫数
		public BigDecimal replenishToStockNum = WCC.ZERO;
		//補充指示済数
		public BigDecimal replenishInstOverNum = WCC.ZERO;
		//補充点
		public BigDecimal replenishMinNum = WCC.ZERO;
		//補充点-単位
		public String replenishMinUnit;
		//最大格納数
		public BigDecimal replenishMaxNum = WCC.ZERO;
		//最大格納数-単位
		public String replenishMaxUnit;
		//補充指示数
		public BigDecimal replenishInstNum = WCC.ZERO;
		//荷姿ID
		public Long shapeId;
		//荷姿CD
		public String shapeCd;
		//最大格納数商品荷姿の入数
		public Long unitNum = new Long(0);
		//[Ver1.1.4][ON推-補充指示数算出の不具合] 2016.01.27 chou 修正 Start
		//補充点商品荷姿の入数
		public Long unitNumP = new Long(0);
		//[Ver1.1.4][ON推-補充指示数算出の不具合] 2016.01.27 chou 修正 End
		// [#3347][Ver3.0] TODO残対応(UoM) 2018.01.15 honma Add Start
		// 商品単位
		public String productUnit;
		// [#3347][Ver3.0] TODO残対応(UoM) 2018.01.15 honma Add End

		//--------------------以下はeclipseで自動的に生成された。-----------------------------

		public String getClientCd() {
			return clientCd;
		}
		public void setClientCd(String clientCd) {
			this.clientCd = clientCd;
		}
		public String getCenterCd() {
			return centerCd;
		}
		public void setCenterCd(String centerCd) {
			this.centerCd = centerCd;
		}
		public String getWarehouseCd() {
			return warehouseCd;
		}
		public void setWarehouseCd(String warehouseCd) {
			this.warehouseCd = warehouseCd;
		}
		public String getReplenishToLocationCd() {
			return replenishToLocationCd;
		}
		public void setReplenishToLocationCd(String replenishToLocationCd) {
			this.replenishToLocationCd = replenishToLocationCd;
		}
		public String getReplenishToLocationNm() {
			return replenishToLocationNm;
		}
		public void setReplenishToLocationNm(String replenishToLocationNm) {
			this.replenishToLocationNm = replenishToLocationNm;
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
		public String getProductAbbr() {
			return productAbbr;
		}
		public void setProductAbbr(String productAbbr) {
			this.productAbbr = productAbbr;
		}
		public String getStockTypeCd() {
			return stockTypeCd;
		}
		public void setStockTypeCd(String stockTypeCd) {
			this.stockTypeCd = stockTypeCd;
		}
		public String getStockTypeNm() {
			return stockTypeNm;
		}
		public void setStockTypeNm(String stockTypeNm) {
			this.stockTypeNm = stockTypeNm;
		}
		public BigDecimal getReplenishFromStockNum() {
			return replenishFromStockNum;
		}
		public void setReplenishFromStockNum(BigDecimal replenishFromStockNum) {
			this.replenishFromStockNum = replenishFromStockNum;
		}
		public BigDecimal getReplenishToStockNum() {
			return replenishToStockNum;
		}
		public void setReplenishToStockNum(BigDecimal replenishToStockNum) {
			this.replenishToStockNum = replenishToStockNum;
		}
		public BigDecimal getReplenishInstOverNum() {
			return replenishInstOverNum;
		}
		public void setReplenishInstOverNum(BigDecimal replenishInstOverNum) {
			this.replenishInstOverNum = replenishInstOverNum;
		}
		public BigDecimal getReplenishMinNum() {
			return replenishMinNum;
		}
		public void setReplenishMinNum(BigDecimal replenishMinNum) {
			this.replenishMinNum = replenishMinNum;
		}
		public String getReplenishMinUnit() {
			return replenishMinUnit;
		}
		public void setReplenishMinUnit(String replenishMinUnit) {
			this.replenishMinUnit = replenishMinUnit;
		}
		public BigDecimal getReplenishMaxNum() {
			return replenishMaxNum;
		}
		public void setReplenishMaxNum(BigDecimal replenishMaxNum) {
			this.replenishMaxNum = replenishMaxNum;
		}
		public String getReplenishMaxUnit() {
			return replenishMaxUnit;
		}
		public void setReplenishMaxUnit(String replenishMaxUnit) {
			this.replenishMaxUnit = replenishMaxUnit;
		}
		public BigDecimal getReplenishInstNum() {
			return replenishInstNum;
		}
		public void setReplenishInstNum(BigDecimal replenishInstNum) {
			this.replenishInstNum = replenishInstNum;
		}
		public Long getShapeId() {
			return shapeId;
		}
		public void setShapeId(Long shapeId) {
			this.shapeId = shapeId;
		}
		public Long getClientId() {
			return clientId;
		}
		public void setClientId(Long clientId) {
			this.clientId = clientId;
		}
		public Long getCenterId() {
			return centerId;
		}
		public void setCenterId(Long centerId) {
			this.centerId = centerId;
		}
		public Long getWarehouseId() {
			return warehouseId;
		}
		public void setWarehouseId(Long warehouseId) {
			this.warehouseId = warehouseId;
		}
		public Long getReplenishToLocationId() {
			return replenishToLocationId;
		}
		public void setReplenishToLocationId(Long replenishToLocationId) {
			this.replenishToLocationId = replenishToLocationId;
		}
		public Long getProductId() {
			return productId;
		}
		public void setProductId(Long productId) {
			this.productId = productId;
		}
		public Long getStockTypeId() {
			return stockTypeId;
		}
		public void setStockTypeId(Long stockTypeId) {
			this.stockTypeId = stockTypeId;
		}
		public String getShapeCd() {
			return shapeCd;
		}
		public void setShapeCd(String shapeCd) {
			this.shapeCd = shapeCd;
		}
		public Long getUnitNum() {
			return unitNum;
		}
		public void setUnitNum(Long unitNum) {
			this.unitNum = unitNum;
		}
		public Long getDepositId() {
			return depositId;
		}
		public void setDepositId(Long depositId) {
			this.depositId = depositId;
		}
		public String getDepositCd() {
			return depositCd;
		}
		public void setDepositCd(String depositCd) {
			this.depositCd = depositCd;
		}
		public String getDepositNm() {
			return depositNm;
		}
		public void setDepositNm(String depositNm) {
			this.depositNm = depositNm;
		}
		//[Ver1.1.4][ON推-補充指示数算出の不具合] 2016.01.27 chou 修正 Start
		public Long getUnitNumP() {
			return unitNumP;
		}
		public void setUnitNumP(Long unitNumP) {
			this.unitNumP = unitNumP;
		}
		//[Ver1.1.4][ON推-補充指示数算出の不具合] 2016.01.27 chou 修正 End

		//荷主センタ変更対応 201７.02.09 sja Start
		public String getClientNm() {
			return clientNm;
		}
		public void setClientNm(String clientNm) {
			this.clientNm = clientNm;
		}
		public String getCenterNm() {
			return centerNm;
		}
		public void setCenterNm(String centerNm) {
			this.centerNm = centerNm;
		}
		//荷主センタ変更対応 201７.02.09 sja End
		// [#3347][Ver3.0] TODO残対応(UoM) 2018.01.15 honma Add Start
		public String getProductUnit() {
			return productUnit;
		}
		public void setProductUnit(String productUnit) {
			this.productUnit = productUnit;
		}
		// [#3347][Ver3.0] TODO残対応(UoM) 2018.01.15 honma Add End

	}

//------------------eclipseでの自動生成が完了-------------------------------



	public static class ReplenishInstListData implements Serializable {
		//検索条件
		public ReplenishInstListHeadData head = new ReplenishInstListHeadData();
		//検索結果
		public List<ReplenishInstListBodyData> body = new ArrayList<ReplenishInstListBodyData>();

		public boolean isSearchCurrentData = false;


	};

	public ReplenishInstListData data = new ReplenishInstListData();

	// [#1979]ページングは対応しない為、該当する処理を削除 2017.8.8 sampei

}
