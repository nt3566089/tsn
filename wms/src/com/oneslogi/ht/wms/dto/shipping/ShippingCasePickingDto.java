package com.oneslogi.ht.wms.dto.shipping;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.oneslogi.base.dbflute.dto.MCenterDto;
import com.oneslogi.base.dbflute.dto.MClientDto;
import com.oneslogi.base.dbflute.dto.MLocationDto;
import com.oneslogi.base.dbflute.dto.MProductDto;
import com.oneslogi.base.dbflute.dto.TLotDto;
import com.oneslogi.base.dbflute.dto.WHtShippingPickingDto;
import com.oneslogi.ht.base.dto.HandyBaseDto;

/**
 * ケースピッキング情報を保持します
 *
 */
public class ShippingCasePickingDto extends HandyBaseDto {

	public static WHtShippingPickingDto chaseWHtShippingPickingDto() {
		return chaseWHtShippingPickingDto(new WHtShippingPickingDto());
	}

	public static WHtShippingPickingDto chaseWHtShippingPickingDto(WHtShippingPickingDto dto) {
		if (dto.getMCenter() == null) {
			dto.setMCenter(new MCenterDto());
		}
		if (dto.getMClient() == null) {
			dto.setMClient(new MClientDto());
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

	public static class ShippingNoPackingData implements Serializable {

		/** 出荷ピッキングワーク */
		public WHtShippingPickingDto wHtShippingPickingDto = chaseWHtShippingPickingDto();

		/** 出荷ピッキングワーク一覧 */
		public List<WHtShippingPickingDto> lstWHtShippingPickingDto = new ArrayList<WHtShippingPickingDto>();

		/** 出庫フラグの区分値リスト */
		public List<String> pickingFlgNmList = new ArrayList<String>();

	};

	public ShippingNoPackingData data = new ShippingNoPackingData();

	// [#975] HTケースピッキング - 処理単位をピッキンググループNo.単位からケースピッキングNo.単位に変更 2017.02.21 kawana Start
	/** ケースピッキングNo */
	public String casePickingNo;
	// [#975] HTケースピッキング - 処理単位をピッキンググループNo.単位からケースピッキングNo.単位に変更 2017.02.21 kawana End
	// [Ver3.0] unit of measure対応 2017.11.29 王 Start
	/** 数量 */
	public String qty;
	// [Ver3.0] unit of measure対応 2017.11.29 王 End
	// [Ver3.0] unit of measure対応 2017.11.27 王 Del
	/** janCd */
	public String janCd;

	//[ON推-品向-1059] 追加 2016.04.04 chou Start
	/** 入庫No. */
	public String storeLabelNo;
	//[ON推-品向-1059] 追加 2016.04.04 chou End

	/**
	 * @return wHtShippingPickingDto
	 */
	public WHtShippingPickingDto getwHtShippingPickingDto() {
		return data.wHtShippingPickingDto;
	}

	/**
	 * @param wHtShippingPickingDto セットする wHtShippingPickingDto
	 */
	public void setwHtShippingPickingDto(WHtShippingPickingDto wHtShippingPickingDto) {
		this.data.wHtShippingPickingDto = wHtShippingPickingDto;
	}

	/**
	 * @return lstWHtShippingPickingDto
	 */
	public List<WHtShippingPickingDto> getLstWHtShippingPickingDto() {
		return data.lstWHtShippingPickingDto;
	}

	/**
	 * @param lstWHtShippingPickingDto セットする lstWHtShippingPickingDto
	 */
	public void setLstWHtShippingPickingDto(List<WHtShippingPickingDto> lstWHtShippingPickingDto) {
		this.data.lstWHtShippingPickingDto = lstWHtShippingPickingDto;
	}

	/**
	 * @return casePickingNo
	 */
	public String getCasePickingNo() {
		return casePickingNo;
	}

	/**
	 * @param casePickingNo セットする casePickingNo
	 */
	public void setCasePickingNo(String casePickingNo) {
		this.casePickingNo = casePickingNo;
	}
	// [Ver3.0] unit of measure対応 2017.11.29 王 Start
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
	// [Ver3.0] unit of measure対応 2017.11.29 王 End
	/**
	 * @return janCd
	 */
	public String getJanCd() {
		return janCd;
	}

	/**
	 * @param janCd セットする janCd
	 */
	public void setJanCd(String janCd) {
		this.janCd = janCd;
	}

	/**
	 * @return pickingFlgNmList
	 */
	public List<String> getPickingFlgNmList() {
		return this.data.pickingFlgNmList;
	}

	/**
	 * @param pickingFlgNmList セットする pickingFlgNmList
	 */
	public void setPickingFlgNmList(List<String> pickingFlgNmList) {
		this.data.pickingFlgNmList = pickingFlgNmList;
	}

	// [Ver3.0] unit of measure対応 2017.11.27 王 Del

	//[ON推-品向-1059] 追加 2016.04.04 chou Start
	/**
	 * @return storeLabelNo
	 */
	public String getStoreLabelNo() {
		return storeLabelNo;
	}

	/**
	 * @param storeLabelNo セットする storeLabelNo
	 */
	public void setStoreLabelNo(String storeLabelNo) {
		this.storeLabelNo = storeLabelNo;
	}
	//[ON推-品向-1059] 追加 2016.04.04 chou End


}
