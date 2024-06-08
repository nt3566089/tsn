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
 * パラピッキング情報を保持します
 *
 */
public class ShippingPickingProductDto extends HandyBaseDto {

//	public static WHtShippingDto chaseWHtShippingDto() {
//		return chaseWHtShippingDto(new WHtShippingDto());
//	}

	public static WHtShippingPickingDto chaseWHtShippingPickingDto() {
		return chaseWHtShippingPickingDto(new WHtShippingPickingDto());
	}

//	public static WHtShippingDto chaseWHtShippingDto(WHtShippingDto dto) {
//		if (dto.getMCenter() == null) {
//			dto.setMCenter(new MCenterDto());
//		}
//		if (dto.getMClient() == null) {
//			dto.setMClient(new MClientDto());
//		}
//		if (dto.getMWarehouse() == null) {
//			dto.setMWarehouse(new MWarehouseDto());
//		}
//		if (dto.getMProduct() == null) {
//			dto.setMProduct(new MProductDto());
//		}
//		if (dto.getMLocation() == null) {
//			dto.setMLocation(new MLocationDto());
//		}
//		if (dto.getMBox() == null) {
//			dto.setMBox(new MBoxDto());
//		}
//		if (dto.getTLot() == null) {
//			dto.setTLot(new TLotDto());
//		}
//
//		return dto;
//	}
//
	public static WHtShippingPickingDto chaseWHtShippingPickingDto(WHtShippingPickingDto dto) {
		if (dto.getMCenter() == null) {
			dto.setMCenter(new MCenterDto());
		}
		if (dto.getMClient() == null) {
			dto.setMClient(new MClientDto());
		}
//		不要
//		if (dto.getMWarehouse() == null) {
//			dto.setMWarehouse(new MWarehouseDto());
//		}
		if (dto.getMProduct() == null) {
			dto.setMProduct(new MProductDto());
		}
		if (dto.getMLocation() == null) {
			dto.setMLocation(new MLocationDto());
		}
//		不要
//		if (dto.getMBox() == null) {
//			dto.setMBox(new MBoxDto());
//		}
		if (dto.getTLot() == null) {
			dto.setTLot(new TLotDto());
		}

		return dto;
	}

	public static class ShippingNoPackingData implements Serializable {

//		/** 出荷検品ワーク */
//		public WHtShippingDto wHtShippingDto = chaseWHtShippingDto();
//
//		/** 出荷検品ワーク一覧 */
//		public List<WHtShippingDto> lstWHtShippingDto = new ArrayList<WHtShippingDto>();

		/** 出荷検品ワーク */
		public WHtShippingPickingDto wHtShippingPickingDto = chaseWHtShippingPickingDto();

		/** 出荷検品ワーク一覧 */
		public List<WHtShippingPickingDto> lstWHtShippingPickingDto = new ArrayList<WHtShippingPickingDto>();

	};

	public ShippingNoPackingData data = new ShippingNoPackingData();
	// [Ver3.0] unit of measure対応 2017.11.24 王 Start
	/** 数量 */
	public String qty;
	// [Ver3.0] unit of measure対応 2017.11.24 王 End
	/** JAN/商品 */
	public String janCd;

	// [C-CWMS-0051] 出荷梱包No.で検品するか判断するフラグ追加 2015.12.15 NayZaw Start
	/** 出荷梱包No.で検品するか判断するフラグ*/
	public boolean isPackingNo;
	// [C-CWMS-0051] 出荷梱包No.で検品するか判断するフラグ追加 2015.12.15 NayZaw End

//	/**
//	 * @return wHtShippingDto
//	 */
//	public WHtShippingDto getwHtShippingDto() {
//		return data.wHtShippingDto;
//	}

	/**
	 * @return wHtShippingPickingDto
	 */
	public WHtShippingPickingDto getwHtShippingPickingDto() {
		return data.wHtShippingPickingDto;
	}

//	/**
//	 * @param wHtShippingDto セットする wHtShippingDto
//	 */
//	public void setwHtShippingDto(WHtShippingDto wHtShippingDto) {
//		this.data.wHtShippingDto = wHtShippingDto;
//	}

	/**
	 * @param wHtShippingPickingDto セットする wHtShippingPickingDto
	 */
	public void setwHtShippingPickingDto(WHtShippingPickingDto wHtShippingPickingDto) {
		this.data.wHtShippingPickingDto = wHtShippingPickingDto;
	}


//	/**
//	 * @return lstWHtShippingDto
//	 */
//	public List<WHtShippingDto> getLstWHtShippingDto() {
//		return data.lstWHtShippingDto;
//	}
//
//	/**
//	 * @param lstWHtShippingDto セットする lstWHtShippingDto
//	 */
//	public void setLstWHtShippingDto(List<WHtShippingDto> lstWHtShippingDto) {
//		this.data.lstWHtShippingDto = lstWHtShippingDto;
//	}

	/**
	 * @return lstWHtShippingPickingDto
	 */
	public List<WHtShippingPickingDto> getLstWHtShippingPickingDto() {
		return data.lstWHtShippingPickingDto;
	}

	/**
	 * @param lstWHtShippingPickingDto セットする lstWHtShippingDto
	 */
	public void setLstWHtShippingPickingDto(List<WHtShippingPickingDto> lstWHtShippingPickingDto) {
		this.data.lstWHtShippingPickingDto = lstWHtShippingPickingDto;
	}
	// [Ver3.0] unit of measure対応 2017.11.24 王 Start
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
	// [Ver3.0] unit of measure対応 2017.11.24 王 End
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
	// [C-CWMS-0051] 出荷梱包No.で検品するか判断するフラグ追加 2015.12.15 NayZaw Start
	/**
	 * @return isPackingNo
	 */
	public boolean getIsPackingNo() {
		return isPackingNo;
	}

	/**
	 * @param isPackingNo セットする isPackingNo
	 */
	public void setIsPackingNo(boolean isPackingNo) {
		this.isPackingNo = isPackingNo;
	}
	// [C-CWMS-0051] 出荷梱包No.で検品するか判断するフラグ追加 2015.12.15 NayZaw End
}
