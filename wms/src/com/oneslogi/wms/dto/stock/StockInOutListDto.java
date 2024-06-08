package com.oneslogi.wms.dto.stock;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import javax.xml.bind.annotation.XmlRootElement;

import net.arnx.jsonic.JSONHint;

import com.oneslogi.base.dbflute.dto.MClientDto;
import com.oneslogi.base.dbflute.dto.MCustomerDto;
import com.oneslogi.base.dbflute.dto.MProcessTypeDto;
import com.oneslogi.base.dbflute.dto.MStockTypeDto;
import com.oneslogi.base.dbflute.dto.MWarehouseDto;
import com.oneslogi.base.dbflute.dto.TStockDto;
import com.oneslogi.base.dbflute.dto.TStockInoutDto;
import com.oneslogi.base.dto.BaseDto;
import com.oneslogi.base.dto.PagingDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class StockInOutListDto extends PagingDto {

	//荷主CD
	public String clientCd;

	//センタCD
	public String centerCd;

	//荷主センタ変更対応 2017.02.14 sja Start
	//荷主名称
	public String clientNm;

	//センタ名称
	public String centerNm;
    //荷主センタ変更対応 2017.02.14 sja End

	//倉庫CD
	public String WarehouseCd;

	//倉庫名称
	public String WarehouseNm;

	//商品CD
	public String productCd;

	//商品名称
	public String productNm;

	//商品略称
	public String productAbbr;

	//JANCD
	public String janCd;

	//処理日
	public String processDt;

	//預託CD
	public String depositCd;

	//預託名称
	public String depositNm;

	//在庫区分CD
	public String stockTypeCd;

	//在庫区分名称
	public String stockTypeNm;

	//ロット
	public String lot;

	//期限日
	public String limitDt;

	//入庫ラベルNo.
	public String storeLabelNo;

	//元入庫ラベルNo.
	public String storeLabelNoOld;

	//仕入先CD
	public String supplierCd;

	//仕入先名称
	public String supplierNm;

	//仕入先略称
	public String supplierAbbr;

	//処理区分CD
	public String processTypeCd;

	//処理区分名称
	public String processTypeNm;

	//前残数
	public BigDecimal pChargeNumDay;

	//受入数
	public BigDecimal stockInNum;

	//払出数
	public BigDecimal stockOutNum;

	//当日在庫数
	public BigDecimal chargeNum;

	 // [Ver3.0] unit of measure対応 2017.11.29 駱 Start

	 /** 商品単位 */
    private String productUnit;

    /** 入数内訳 */
    private String unitNumBreakdown;

    /** 前残内訳 */
    private String preChargeBreakdown;

    /** 受入内訳 */
    private String stockInBreakdown;

    /** 払出内訳 */
    private String stockOutBreakdown;

    /** 当日在庫内訳 */
    private String chargeBreakdown;
    // [Ver3.0] unit of measure対応 2017.11.29 駱 End

	//ロケーションCD
	public String locationCd;

	//ロケーション名称
	public String locationNm;

	//ロケーションCD
	public String locationCdTo;

	//登録日時
	public java.sql.Timestamp addDt;

	//登録ユーザ
	public String addUser;

	//処理No.
	public String processNo;

	//納品先CD
	public String supplyCustomerCd;

	//納品先名称
	public String supplyCustomerNm;

	//納品先略称
	public String supplyCustomerAbbr;

	//在庫移動指示備考
	public String moveInstComment;

	//ソート順
	public String sortFlg;

	//期限切れ日
	public String finishDt;

	//引当禁止フラグ
	public String AllocNgFlg;

	//引当禁止フラグ名称
	public String AllocNgFlgName;

	// [ON推-品向-861] 入荷、出荷の顧客伝票Noを表示 2015.07.10 kawana Start

	// 顧客入荷指示No.
	private String clientReceiveNo;

	// 顧客出荷指示No.
	private String clientShippingNo;

	// [ON推-品向-861] 入荷、出荷の顧客伝票Noを表示 2015.07.10 kawana End

	// [C-NIS-0002] ケース数、ピース数を追加する 2015.07.01 hayashi Strat
	// 前残ケース数
	public BigDecimal casePreChargeNum;

	// 前残ピース数
	public BigDecimal piecePreChargeNum;

	// 受入ケース数
	public BigDecimal caseStockInNum;

	// 受入ピース数
	public BigDecimal pieceStockInNum;

	// 払出ケース数
	public BigDecimal caseStockOutNum;

	// 払出ピース数
	public BigDecimal pieceStockOutNum;

	// 当日在庫ケース数
	public BigDecimal caseChargeNum;

	// 当日在庫ピース数
	public BigDecimal pieceChargeNum;
	// [C-NIS-0002] ケース数、ピース数を追加する 2015.07.01 hayashi End

	//[ON推-品質問題点指摘票(新ｿﾘV2-064)] 修正対応 2016.08.24 chou Add Start
	//入庫日
	public String storeDt;
	//[ON推-品質問題点指摘票(新ｿﾘV2-064)] 修正対応 2016.08.24 chou Add End

	/** The modified properties for this DTO. */
	protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

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
		return WarehouseCd;
	}

	public void setWarehouseCd(String warehouseCd) {
		WarehouseCd = warehouseCd;
	}

	public String getWarehouseNm() {
		return WarehouseNm;
	}

	public void setWarehouseNm(String warehouseNm) {
		WarehouseNm = warehouseNm;
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

	public String getJanCd() {
		return janCd;
	}

	public void setJanCd(String janCd) {
		this.janCd = janCd;
	}

	public String getProcessDt() {
		return processDt;
	}

	public void setProcessDt(String processDt) {
		this.processDt = processDt;
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

	public String getStoreLabelNo() {
		return storeLabelNo;
	}

	public void setStoreLabelNo(String storeLabelNo) {
		this.storeLabelNo = storeLabelNo;
	}

	public String getStoreLabelNoOld() {
		return storeLabelNoOld;
	}

	public void setStoreLabelNoOld(String storeLabelNoOld) {
		this.storeLabelNoOld = storeLabelNoOld;
	}

	public String getSupplierCd() {
		return supplierCd;
	}

	public void setSupplierCd(String supplierCd) {
		this.supplierCd = supplierCd;
	}

	public String getSupplierNm() {
		return supplierNm;
	}

	public void setSupplierNm(String supplierNm) {
		this.supplierNm = supplierNm;
	}

	public String getSupplierAbbr() {
		return supplierAbbr;
	}

	public void setSupplierAbbr(String supplierAbbr) {
		this.supplierAbbr = supplierAbbr;
	}

	public String getProcessTypeCd() {
		return processTypeCd;
	}

	public void setProcessTypeCd(String processTypeCd) {
		this.processTypeCd = processTypeCd;
	}

	public BigDecimal getpChargeNumDay() {
		return pChargeNumDay;
	}

	public void setpChargeNumDay(BigDecimal pChargeNumDay) {
		this.pChargeNumDay = pChargeNumDay;
	}

	public BigDecimal getStockInNum() {
		return stockInNum;
	}

	public void setStockInNum(BigDecimal stockInNum) {
		this.stockInNum = stockInNum;
	}

	public BigDecimal getStockOutNum() {
		return stockOutNum;
	}

	public void setStockOutNum(BigDecimal stockOutNum) {
		this.stockOutNum = stockOutNum;
	}

	public BigDecimal getChargeNum() {
		return chargeNum;
	}

	public void setChargeNum(BigDecimal chargeNum) {
		this.chargeNum = chargeNum;
	}

	// [Ver3.0] unit of measure対応 2017.11.29 駱 Start
    public String getProductUnit() {
		return productUnit;
	}

	public void setProductUnit(String productUnit) {
		this.productUnit = productUnit;
	}

	public String getUnitNumBreakdown() {
		return unitNumBreakdown;
	}

	public void setUnitNumBreakdown(String unitNumBreakdown) {
		this.unitNumBreakdown = unitNumBreakdown;
	}

	public String getPreChargeBreakdown() {
		return preChargeBreakdown;
	}

	public void setPreChargeBreakdown(String preChargeBreakdown) {
		this.preChargeBreakdown = preChargeBreakdown;
	}

	public String getStockInBreakdown() {
		return stockInBreakdown;
	}

	public void setStockInBreakdown(String stockInBreakdown) {
		this.stockInBreakdown = stockInBreakdown;
	}

	public String getStockOutBreakdown() {
		return stockOutBreakdown;
	}

	public void setStockOutBreakdown(String stockOutBreakdown) {
		this.stockOutBreakdown = stockOutBreakdown;
	}

	public String getChargeBreakdown() {
		return chargeBreakdown;
	}

	public void setChargeBreakdown(String chargeBreakdown) {
		this.chargeBreakdown = chargeBreakdown;
	}
	// [Ver3.0] unit of measure対応 2017.11.29 駱 End

	public String getLocationCd() {
		return locationCd;
	}

	public void setLocationCd(String locationCd) {
		this.locationCd = locationCd;
	}

	public String getAddUser() {
		return addUser;
	}

	@JSONHint(format = "yyyy-MM-dd HH:mm:ss")
	public java.sql.Timestamp getAddDt() {
		return addDt;
	}

	public void setAddDt(java.sql.Timestamp addDt) {
		__modifiedProperties.add("addDt");
		this.addDt = addDt;
	}

	public void setAddUser(String addUser) {
		this.addUser = addUser;
	}

	public String getProcessNo() {
		return processNo;
	}

	public void setProcessNo(String processNo) {
		this.processNo = processNo;
	}

	public String getSupplyCustomerCd() {
		return supplyCustomerCd;
	}

	public void setSupplyCustomerCd(String supplyCustomerCd) {
		this.supplyCustomerCd = supplyCustomerCd;
	}

	public String getSupplyCustomerNm() {
		return supplyCustomerNm;
	}

	public void setSupplyCustomerNm(String supplyCustomerNm) {
		this.supplyCustomerNm = supplyCustomerNm;
	}

	public String getSupplyCustomerAbbr() {
		return supplyCustomerAbbr;
	}

	public void setSupplyCustomerAbbr(String supplyCustomerAbbr) {
		this.supplyCustomerAbbr = supplyCustomerAbbr;
	}

	public String getMoveInstComment() {
		return moveInstComment;
	}

	public void setMoveInstComment(String moveInstComment) {
		this.moveInstComment = moveInstComment;
	}

	public StockInOutListData getData() {
		return data;
	}

	public void setData(StockInOutListData data) {
		this.data = data;
	}

	public static TStockInoutDto chaseTStockInoutDto() {
		return chaseTStockInoutDto(new TStockInoutDto());
	}

	public String getSortFlg() {
		return sortFlg;
	}

	public void setSortFlg(String sortFlg) {
		this.sortFlg = sortFlg;
	}

	public String getDepositNm() {
		return depositNm;
	}

	public void setDepositNm(String depositNm) {
		this.depositNm = depositNm;
	}

	public String getStockTypeNm() {
		return stockTypeNm;
	}

	public void setStockTypeNm(String stockTypeNm) {
		this.stockTypeNm = stockTypeNm;
	}

	public String getProcessTypeNm() {
		return processTypeNm;
	}

	public void setProcessTypeNm(String processTypeNm) {
		this.processTypeNm = processTypeNm;
	}

	public String getFinishDt() {
		return finishDt;
	}

	public void setFinishDt(String finishDt) {
		this.finishDt = finishDt;
	}

	public String getAllocNgFlg() {
		return AllocNgFlg;
	}

	public void setAllocNgFlg(String allocNgFlg) {
		AllocNgFlg = allocNgFlg;
	}

	public String getAllocNgFlgName() {
		return AllocNgFlgName;
	}

	public void setAllocNgFlgName(String allocNgFlgName) {
		AllocNgFlgName = allocNgFlgName;
	}

	public String getLocationCdTo() {
		return locationCdTo;
	}

	public void setLocationCdTo(String locationCdTo) {
		this.locationCdTo = locationCdTo;
	}

	public String getLocationNm() {
		return locationNm;
	}

	public void setLocationNm(String locationNm) {
		this.locationNm = locationNm;
	}

	// [ON推-品向-861] 入荷、出荷の顧客伝票Noを表示 2015.07.10 kawana Start

	public String getClientReceiveNo() {
		return clientReceiveNo;
	}

	public void setClientReceiveNo(String clientReceiveNo) {
		this.clientReceiveNo = clientReceiveNo;
	}

	public String getClientShippingNo() {
		return clientShippingNo;
	}

	public void setClientShippingNo(String clientShippingNo) {
		this.clientShippingNo = clientShippingNo;
	}

	// [ON推-品向-861] 入荷、出荷の顧客伝票Noを表示 2015.07.10 kawana End

	public static TStockInoutDto chaseTStockInoutDto(TStockInoutDto dto) {

		dto.setTStock(new TStockDto());

		if (dto.getTStock().getMClient() == null) {
			dto.getTStock().setMClient(new MClientDto());
		}
		if (dto.getTStock().getMWarehouse() == null) {
			dto.getTStock().setMWarehouse(new MWarehouseDto());
		}
		if (dto.getMProcessType() == null) {
			dto.setMProcessType(new MProcessTypeDto());
		}
		if (dto.getTStock().getMStockType() == null) {
			dto.getTStock().setMStockType(new MStockTypeDto());
		}
		if (dto.getTStock().getMCustomer() == null) {
			dto.getTStock().setMCustomer(new MCustomerDto());
		}
		return dto;
	}

	public static class StockInOutListData implements Serializable {
		//検索条件
		public TStockInoutDto head = chaseTStockInoutDto();
		//検索結果
		public List<StockInOutListDto> body = new ArrayList<StockInOutListDto>();
	};

	public StockInOutListData data = new StockInOutListData();

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

	public BigDecimal getCaseStockInNum() {
		return caseStockInNum;
	}

	public void setCaseStockInNum(BigDecimal caseStockInNum) {
		this.caseStockInNum = caseStockInNum;
	}

	public BigDecimal getPieceStockInNum() {
		return pieceStockInNum;
	}

	public void setPieceStockInNum(BigDecimal pieceStockInNum) {
		this.pieceStockInNum = pieceStockInNum;
	}

	public BigDecimal getCaseStockOutNum() {
		return caseStockOutNum;
	}

	public void setCaseStockOutNum(BigDecimal caseStockOutNum) {
		this.caseStockOutNum = caseStockOutNum;
	}

	public BigDecimal getPieceStockOutNum() {
		return pieceStockOutNum;
	}

	public void setPieceStockOutNum(BigDecimal pieceStockOutNum) {
		this.pieceStockOutNum = pieceStockOutNum;
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
	//[ON推-品質問題点指摘票(新ｿﾘV2-064)] 修正対応 2016.08.24 chou Add Start
	public String getStoreDt() {
		return storeDt;
	}

	public void setStoreDt(String storeDt) {
		this.storeDt = storeDt;
	}
	//[ON推-品質問題点指摘票(新ｿﾘV2-064)] 修正対応 2016.08.24 chou Add End

	//荷主センタ変更対応 2017.02.14 sja Start
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
	//荷主センタ変更対応 2017.02.14 sja End
}
