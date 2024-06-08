package com.oneslogi.ht.wms.dto.shipping;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.oneslogi.base.dbflute.dto.MBoxDto;
import com.oneslogi.base.dbflute.dto.MCenterDto;
import com.oneslogi.base.dbflute.dto.MClientDto;
import com.oneslogi.base.dbflute.dto.MProductDto;
import com.oneslogi.base.dbflute.dto.WHtShippingDto;
import com.oneslogi.ht.base.dto.HandyBaseDto;

/**
 * バラ出荷検品情報を保持します
 *
 */
public class ShippingNoPackingDto extends HandyBaseDto {

	public static WHtShippingDto chaseWHtShippingDto() {
		return chaseWHtShippingDto(new WHtShippingDto());
	}

	public static WHtShippingDto chaseWHtShippingDto(WHtShippingDto dto) {

		//【C-CWMS-0040】「出荷検品ワーク」テーブルから削除した項目削除  2015/09/11 NayZaw Start
		//getMWarehouse(),getMLocation(),getTLot()  はいらない為コメント
		if (dto.getMCenter() == null) {
			dto.setMCenter(new MCenterDto());
		}
		if (dto.getMClient() == null) {
			dto.setMClient(new MClientDto());
		}
		/*if (dto.getMWarehouse() == null) {
			dto.setMWarehouse(new MWarehouseDto());
		}*/
		if (dto.getMProduct() == null) {
			dto.setMProduct(new MProductDto());
		}
		/*if (dto.getMLocation() == null) {
			dto.setMLocation(new MLocationDto());
		}*/
		if (dto.getMBox() == null) {
			dto.setMBox(new MBoxDto());
		}
		/*if (dto.getTLot() == null) {
			dto.setTLot(new TLotDto());
		}*/

		return dto;
		//【C-CWMS-0040】「出荷検品ワーク」テーブルから削除した項目削除  2015/09/11 NayZaw End
	}

	public static class ShippingNoPackingData implements Serializable {

		/** 出荷検品ワーク */
		public WHtShippingDto wHtShippingDto = chaseWHtShippingDto();

		/** 出荷検品ワーク一覧 */
		public List<WHtShippingDto> lstWHtShippingDto = new ArrayList<WHtShippingDto>();

	};

	public ShippingNoPackingData data = new ShippingNoPackingData();
	// [Ver3.0] unit of measure対応 2017.11.28 王 Start
	/** 検品数(画面表示用) */
	public String qty;
	// [Ver3.0] unit of measure対応 2017.11.28 王 End
	//[C-CWMS-0051] 出荷検品No.で検品する処理の為追加 2015.12.9 NayZaw Start
	/** 出荷梱包Noで検品するか判断するフラグ*/
	public boolean isPackingNo;
	//[C-CWMS-0051] 出荷検品No.で検品する処理の為追加 2015.12.9 NayZaw End

	// Ver２．１向けエンハンス C-CWMS-0055 2016.06.13 sja Start
	public String isBoxSelectSkip = "0"; // 荷材選択スキップ 0：スキップしない、1：スキップする
	public MBoxDto defaultBox = new MBoxDto(); // デフォルト荷材
	// Ver２．１向けエンハンス C-CWMS-0055 2016.06.13 sja End
	// [Ver3.1][#5749] 出庫指示に対し出庫作業メッセージが複数ある場合全て表示する 2018.12.07 matsumoto Start
	/** 出庫作業メッセージ表示数 */
    public Integer commentDisplayedCount;
    // [Ver3.1][#5749] 出庫指示に対し出庫作業メッセージが複数ある場合全て表示する 2018.12.07 matsumoto End

	/**
	 * @return wHtShippingDto
	 */
	public WHtShippingDto getwHtShippingDto() {
		return data.wHtShippingDto;
	}

	/**
	 * @param wHtShippingDto セットする wHtShippingDto
	 */
	public void setwHtShippingDto(WHtShippingDto wHtShippingDto) {
		this.data.wHtShippingDto = wHtShippingDto;
	}

	/**
	 * @return lstWHtShippingDto
	 */
	public List<WHtShippingDto> getLstWHtShippingDto() {
		return data.lstWHtShippingDto;
	}

	/**
	 * @param lstWHtShippingDto セットする lstWHtShippingDto
	 */
	public void setLstWHtShippingDto(List<WHtShippingDto> lstWHtShippingDto) {
		this.data.lstWHtShippingDto = lstWHtShippingDto;
	}
	// [Ver3.0] unit of measure対応 2017.11.28 王 Start
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
	// [Ver3.0] unit of measure対応 2017.11.28 王 End
	//[C-CWMS-0051] 出荷検品No.で検品する処理の為追加 2015.12.9 NayZaw Start
	/**
	 * @return isPackingNo
	 */
	public Boolean getIsPackingNo() {
		return isPackingNo;
	}

	/**
	 * @param isPackingNo セットする isPackingNo
	 */
	public void setIsPackingNo(Boolean isPackingNo) {
		this.isPackingNo = isPackingNo;
	}
	//[C-CWMS-0051] 出荷検品No.で検品する処理の為追加 2015.12.9 NayZaw End

	// Ver２．１向けエンハンス C-CWMS-0055 2016.06.13 sja Start
	/**
	 * @return isBoxSelectSkip
	 */
	public String getIsBoxSelectSkip() {
		return isBoxSelectSkip;
	}
	/**
	 * @param isBoxSelectSkip セットする isBoxSelectSkip
	 */
	public void setIsBoxSelectSkip(String isBoxSelectSkip) {
		this.isBoxSelectSkip = isBoxSelectSkip;
	}

	/**
	 * @return isBoxSelectSkip
	 */
	public MBoxDto getDefaultBox() {
		return defaultBox;
	}
	/**
	 * @param defaultBox セットする defaultBox
	 */
	public void setDefaultBox(MBoxDto defaultBox) {
		this.defaultBox = defaultBox;
	}
	// Ver２．１向けエンハンス C-CWMS-0055 2016.06.13 sja End
	// [Ver3.1][#5749] 出庫指示に対し出庫作業メッセージが複数ある場合全て表示する 2018.12.07 matsumoto Start
	/**
	 * @return commentDisplayedCount
	 */
	public Integer getCommentDisplayedCount() {
		return commentDisplayedCount;
	}

	/**
	 * @param commentDisplayedCount セットする commentDisplayedCount
	 */
	public void setCommentDisplayedCount(Integer commentDisplayedCount) {
		this.commentDisplayedCount = commentDisplayedCount;
	}
	// [Ver3.1][#5749] 出庫指示に対し出庫作業メッセージが複数ある場合全て表示する 2018.12.07 matsumoto End
}
