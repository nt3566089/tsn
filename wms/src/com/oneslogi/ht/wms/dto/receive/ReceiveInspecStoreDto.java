package com.oneslogi.ht.wms.dto.receive;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.oneslogi.base.dbflute.dto.MCenterDto;
import com.oneslogi.base.dbflute.dto.MClientDto;
import com.oneslogi.base.dbflute.dto.MLocationDto;
import com.oneslogi.base.dbflute.dto.MParamDto;
import com.oneslogi.base.dbflute.dto.MProductDto;
import com.oneslogi.base.dbflute.dto.MWarehouseDto;
import com.oneslogi.base.dbflute.dto.TLotDto;
import com.oneslogi.base.dbflute.dto.TReceivePlanBDto;
import com.oneslogi.base.dbflute.dto.TReceivePlanHDto;
import com.oneslogi.base.dbflute.dto.TStoreRecordBDto;
import com.oneslogi.base.dbflute.dto.WHtReceiveInspectionDto;
import com.oneslogi.ht.base.dto.HandyBaseDto;

/**
 * 入荷検品・格納情報を保持します。
 *
 */
public class ReceiveInspecStoreDto extends HandyBaseDto {

	public static WHtReceiveInspectionDto chaseWHtReceiveInspectionDto() {
		return chaseWHtReceiveInspectionDto(new WHtReceiveInspectionDto());
	}

	public static WHtReceiveInspectionDto chaseWHtReceiveInspectionDto(WHtReceiveInspectionDto dto) {
		if (dto.getMCenter() == null) {
			dto.setMCenter(new MCenterDto());
		}
		if (dto.getMClient() == null) {
			dto.setMClient(new MClientDto());
		}
		if (dto.getMWarehouse() == null) {
			dto.setMWarehouse(new MWarehouseDto());
		}
		if (dto.getMProduct() == null) {
			dto.setMProduct(new MProductDto());
		}
		if (dto.getMLocation() == null) {
			dto.setMLocation(new MLocationDto());
		}
		if (dto.getTLot() == null) {
			dto.setTLot(new TLotDto());
		}

		return dto;
	}

	public static TReceivePlanBDto chaseTReceivePlanBDto() {
		return chaseTReceivePlanBDto(new TReceivePlanBDto());
	}

	public static TReceivePlanBDto chaseTReceivePlanBDto(TReceivePlanBDto dto) {
		if (dto.getTReceivePlanH() == null) {
			dto.setTReceivePlanH(new TReceivePlanHDto());
		}

		if (dto.getTReceivePlanH().getMCenter() == null) {
			dto.getTReceivePlanH().setMCenter(new MCenterDto());
		}
		if (dto.getTReceivePlanH().getMClient() == null) {
			dto.getTReceivePlanH().setMClient(new MClientDto());
		}
		if (dto.getMWarehouse() == null) {
			dto.setMWarehouse(new MWarehouseDto());
		}
		if (dto.getMProduct() == null) {
			dto.setMProduct(new MProductDto());
		}
		if (dto.getMLocation() == null) {
			dto.setMLocation(new MLocationDto());
		}

		return dto;
	}

	public static TStoreRecordBDto chaseTStoreRecordBDto() {
		return chaseTStoreRecordBDto(new TStoreRecordBDto());
	}

	public static TStoreRecordBDto chaseTStoreRecordBDto(TStoreRecordBDto dto) {
		if (dto.getTReceivePlanB() == null) {
			dto.setTReceivePlanB(new TReceivePlanBDto());
		}

		if (dto.getMLocation() == null) {
			dto.setMLocation(new MLocationDto());
		}

		return dto;
	}
	public static class ReceiveInspecStoreData implements Serializable {

		/** 入荷予定データ */
		public TReceivePlanBDto tReceivePlanBDto = chaseTReceivePlanBDto();

		/**入荷予定データ一覧(センタ間移動場合、ロット又は期限日設定している商品のみ使用) */
		public List<TReceivePlanBDto> lstTReceivePlanBDto=new ArrayList<TReceivePlanBDto>();

		/** 入荷検品ワーク一覧 */
		public List<WHtReceiveInspectionDto> lstWHtReceiveInspectionDto = new ArrayList<WHtReceiveInspectionDto>();

		/** 入庫実績データ */
		public List<TStoreRecordBDto> lstTStoreRecordBDto = new ArrayList<TStoreRecordBDto>();

		/** 入庫実績データ */
		public TStoreRecordBDto tStoreRecordBDto = chaseTStoreRecordBDto();
	}

	public ReceiveInspecStoreData data = new ReceiveInspecStoreData();

	/** MACアドレス */
	public String macAddress;

	// [ON推-UT210-014] パラメータマスタ情報はマスタDtoのみの設定に変更 yokosuka 2016.07.13 [S]
	/** パラメータマスタ */
	public MParamDto mParamDto = new MParamDto();
	// [ON推-UT210-014] パラメータマスタ情報はマスタDtoのみの設定に変更 yokosuka 2016.07.13 [E]

	/** 差異フラグ */
	public String differentFlg;

	/** ラベル区分 */
	/**1:入庫ラベル使用；2:汎用ラベル使用 */
	public String labelKbn;

	/**  JAN/商品CD */
	public String janProdCd;

	/**  期限日 */
	public String limitDt;

	/** 数量 */
	// [Ver3.0] unit of measure対応 2017.11.27 王 Start
	public String qty;
	// [Ver3.0] unit of measure対応 2017.11.27 王 End
	// [Ver3.0] unit of measure対応 2017.11.27 王 Del
	/** 検品数 */
	public BigDecimal storeNum;

	/** 検品合計数 */
	public BigDecimal storeNumSum;

	/** 予定合計数 */
	public BigDecimal planNumSum;

	/**  ロケ */
	public String loc;

	// [ON推-UT210-014] パラメータマスタ情報はマスタDtoのみの設定に変更 yokosuka 2016.07.13 [S]
	public MParamDto getMParamDto() {
		return mParamDto;
	}

	public void setMParamDto(MParamDto mParamDto) {
		this.mParamDto = mParamDto;
	}
	// [ON推-UT210-014] パラメータマスタ情報はマスタDtoのみの設定に変更 yokosuka 2016.07.13 [E]


	public BigDecimal getStoreNum() {
		return storeNum;
	}

	public void setStoreNum(BigDecimal storeNum) {
		this.storeNum = storeNum;
	}

	public BigDecimal getStoreNumSum() {
		return storeNumSum;
	}

	public void setStoreNumSum(BigDecimal storeNumSum) {
		this.storeNumSum = storeNumSum;
	}

	public BigDecimal getPlanNumSum() {
		return planNumSum;
	}

	public void setPlanNumSum(BigDecimal planNumSum) {
		this.planNumSum = planNumSum;
	}

	public String getDifferentFlg() {
		return differentFlg;
	}

	public void setDifferentFlg(String differentFlg) {
		this.differentFlg = differentFlg;
	}

	/**
	 * @return tReceivePlanBDto
	 */
	public TReceivePlanBDto getTReceivePlanBDto() {
		return data.tReceivePlanBDto;
	}

	/**
	 * @param tReceivePlanBDto セットする tReceivePlanBDto
	 */
	public void setTReceivePlanBDto(TReceivePlanBDto tReceivePlanBDto) {
		data.tReceivePlanBDto = tReceivePlanBDto;
	}

	/**
	 * @return tStoreRecordBDto
	 */
	public TStoreRecordBDto getTStoreRecordBDto() {
		return data.tStoreRecordBDto;
	}

	/**
	 * @param tStoreRecordBDto セットする tStoreRecordBDto
	 */
	public void setTStoreRecordBDto(TStoreRecordBDto tStoreRecordBDto) {
		data.tStoreRecordBDto = tStoreRecordBDto;
	}

	/**
	 * @return lstTReceivePlanBDto
	 */
	public List<TReceivePlanBDto> getLstTReceivePlanBDto() {
		return data.lstTReceivePlanBDto;
	}

	/**
	 * @param lstTReceivePlanBDto セットする lstTReceivePlanBDto
	 */
	public void setLstTReceivePlanBDto(List<TReceivePlanBDto> lstTReceivePlanBDto) {
		data.lstTReceivePlanBDto = lstTReceivePlanBDto;
	}

	/**
	 * @return lstWHtReceiveInspectionDto
	 */
	public List<WHtReceiveInspectionDto> getLstWHtReceiveInspectionDto() {
		return data.lstWHtReceiveInspectionDto;
	}

	/**
	 * @param lstWHtReceiveInspectionDto セットする lstWHtReceiveInspectionDto
	 */
	public void setLstWHtReceiveInspectionDto(List<WHtReceiveInspectionDto> lstWHtReceiveInspectionDto) {
		data.lstWHtReceiveInspectionDto = lstWHtReceiveInspectionDto;
	}
	/**
	 * @return lstTStoreRecordBDto
	 */
	public List<TStoreRecordBDto> getLstTStoreRecordBDto() {
		return data.lstTStoreRecordBDto;
	}

	/**
	 * @param lstTStoreRecordBDto セットする lstTStoreRecordBDto
	 */
	public void setLstTStoreRecordBDto(List<TStoreRecordBDto> lstTStoreRecordBDto) {
		data.lstTStoreRecordBDto = lstTStoreRecordBDto;
	}

	/**
	 * @return macAddress
	 */
	public String getMacAddress() {
		return macAddress;
	}

	/**
	 * @param macAddress セットする macAddress
	 */
	public void setMacAddress(String macAddress) {
		this.macAddress = macAddress;
	}

	/**
	 * @return labelKbn
	 */
	public String getLabelKbn() {
		return labelKbn;
	}

	/**
	 * @param labelKbn セットする labelKbn
	 */
	public void setLabelKbn(String labelKbn) {
		this.labelKbn = labelKbn;
	}

	/**
	 * @return janProdCd
	 */
	public String getJanProdCd() {
		return janProdCd;
	}

	/**
	 * @param janProdCd セットする janProdCd
	 */
	public void setJanProdCd(String janProdCd) {
		this.janProdCd = janProdCd;
	}

	/**
	 * @return limitDt
	 */
	public String getLimitDt() {
		return limitDt;
	}

	/**
	 * @param limitDt セットする limitDt
	 */
	public void setLimitDt(String limitDt) {
		this.limitDt = limitDt;
	}

	// [Ver3.0] unit of measure対応 2017.11.27 王 Start
	/**
	 * @return qty
	 */
	public String getQty() {
		return qty;
	}

	/**
	 * @param qty セットする qty
	 */
	public void setQty(String qty) {
		this.qty = qty;
	}
	// [Ver3.0] unit of measure対応 2017.11.27 王 End

	// [Ver3.0] unit of measure対応 2017.11.27 王 Del
	/**
	 * @return loc
	 */
	public String getLoc() {
		return loc;
	}

	/**
	 * @param loc セットする loc
	 */
	public void setLoc(String loc) {
		this.loc = loc;
	}

	// [ON推-UT210-014] 処理位置不正の為、商品ラベル関係のデータ取得は共通処理に移動 yokosuka 2016.07.13
}
