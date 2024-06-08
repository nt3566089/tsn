package com.oneslogi.ht.wms.dto.shipping;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.oneslogi.base.dbflute.dto.MBoxDto;
import com.oneslogi.base.dbflute.dto.MCenterDto;
import com.oneslogi.base.dbflute.dto.MClientDto;
import com.oneslogi.base.dbflute.dto.MProductDto;
import com.oneslogi.base.dbflute.dto.TPickingHDto;
import com.oneslogi.base.dbflute.dto.WSglRowShipInspBDto;
import com.oneslogi.base.dbflute.dto.WSglRowShipInspHDto;
import com.oneslogi.ht.base.dto.HandyBaseDto;

/**
 * 単行出荷検品Dto
 *
 */
public class SingleRowShippingNoPackingDto extends HandyBaseDto {

	public static WSglRowShipInspHDto chaseWSglRowShipInspHDto() {
		return chaseWSglRowShipInspHDto(new WSglRowShipInspHDto());
	}

	public static WSglRowShipInspHDto chaseWSglRowShipInspHDto(WSglRowShipInspHDto dto) {
		if (dto.getMCenter() == null) {
			dto.setMCenter(new MCenterDto());
		}
		if (dto.getMClient() == null) {
			dto.setMClient(new MClientDto());
		}
		if (dto.getMBox() == null) {
			dto.setMBox(new MBoxDto());
		}
		if (dto.getMProduct() == null) {
			dto.setMProduct(new MProductDto());
		}

		return dto;
	}

	public static WSglRowShipInspBDto chaseWSglRowShipInspBDto() {
		return chaseWSglRowShipInspBDto(new WSglRowShipInspBDto());
	}

	public static WSglRowShipInspBDto chaseWSglRowShipInspBDto(WSglRowShipInspBDto dto) {
		if (dto.getTPickingH() == null) {
			dto.setTPickingH(new TPickingHDto());
		}

		return dto;
	}

	public static MBoxDto chaseMBoxDto() {
		return chaseMBoxDto(new MBoxDto());
	}


	public static MBoxDto chaseMBoxDto(MBoxDto dto) {

		return dto;
	}


	public static class SingleRowShippingNoPackingData implements Serializable {

		// 単行出荷検品ワーク
		public WSglRowShipInspHDto search = chaseWSglRowShipInspHDto();

		// 検品データ(ヘッダ)
		public WSglRowShipInspHDto wSglRowShipInspHDto = chaseWSglRowShipInspHDto();
		// 検品中データ
		public WSglRowShipInspBDto inspData = chaseWSglRowShipInspBDto();
		// 単行出荷検品ワーク一覧
		public List<WSglRowShipInspBDto> lstWSglRowShipInspBDto = new ArrayList<>();
		// 作業指示数のリスト
		public Set<Long> instNumList = null;
		// デフォルト荷材
		public MBoxDto defaultBox = chaseMBoxDto();
		// ログインユーザの検品済数
		public Long userInspectedQty = null;
		// 伝票残数
		public Long slipQtyRemain = null;
		// 作業メッセージ
		public String pickingWorkMessage;
		// 出庫作業No
		public String pickingWorkNo;
		// 納品先出荷停止フラグ (true:停止有り)
		public boolean shippingStopCustomerFlg = false;
		// 検品フラグ (true:検品有り)
		public boolean inspectedFlg = false;
		// 荷札発行エラーフラグ (true:エラー)
		public boolean tagOutErrorFlg = false;
		// 次の検品データ有無 (true:検品データ無し)
		public boolean noNextData = false;
	};

	public SingleRowShippingNoPackingData data = new SingleRowShippingNoPackingData();

	public WSglRowShipInspHDto getSearchDto() {
		return this.data.search;
	}

	public void setSearchDto(WSglRowShipInspHDto wSglRowShipInspHDto) {
		this.data.search = wSglRowShipInspHDto;
	}

	public WSglRowShipInspHDto getWSglRowShipInspHDto() {
		return this.data.wSglRowShipInspHDto;
	}

	public void setWSglRowShipInspHDto(WSglRowShipInspHDto wSglRowShipInspHDto) {
		this.data.wSglRowShipInspHDto = wSglRowShipInspHDto;
	}

	public List<WSglRowShipInspBDto> getLstWSglRowShipInspBDto() {
		return this.data.lstWSglRowShipInspBDto;
	}

	public void setLstWSglRowShipInspBDto(List<WSglRowShipInspBDto> lstWSglRowShipInspBDto) {
		this.data.lstWSglRowShipInspBDto = lstWSglRowShipInspBDto;
	}

	public WSglRowShipInspBDto getInspData() {
		return this.data.inspData;
	}

	public void setInspData(WSglRowShipInspBDto wSglRowShipInspBDto) {
		this.data.inspData = wSglRowShipInspBDto;
	}

	public Set<Long> getInstNumList() {
		return this.data.instNumList;
	}

	public void setInstNumList(Set<Long> instNumList) {
		this.data.instNumList = instNumList;
	}

	public MBoxDto getDefaultBox() {
		return this.data.defaultBox;
	}

	public void setDefaultBox(MBoxDto mBoxDto) {
		this.data.defaultBox = mBoxDto;
	}

	public Long getUserInspectedQty() {
		return this.data.userInspectedQty;
	}

	public void setUserInspectedQty(Long userInspectedQty) {
		this.data.userInspectedQty = userInspectedQty;
	}

	public String getPickingWorkMessage() {
		return this.data.pickingWorkMessage;
	}

	public void setPickingWorkMessage(String pickingWorkMessage) {
		this.data.pickingWorkMessage = pickingWorkMessage;
	}

	public String getPickingWorkNo() {
		return this.data.pickingWorkNo;
	}

	public void setPickingWorkNo(String pickingWorkNo) {
		this.data.pickingWorkNo = pickingWorkNo;
	}

	public Long getSlipQtyRemain() {
		return this.data.slipQtyRemain;
	}

	public void setSlipQtyRemain(Long slipQtyRemain) {
		this.data.slipQtyRemain = slipQtyRemain;
	}

	public boolean isShippingStopCustomerFlg() {
		return data.shippingStopCustomerFlg;
	}

	public void setShippingStopCustomerFlg(boolean shippingStopCustomerFlg) {
		this.data.shippingStopCustomerFlg = shippingStopCustomerFlg;
	}

	public boolean isInspectedFlg() {
		return data.inspectedFlg;
	}

	public void setInspectedFlg(boolean inspectedFlg) {
		this.data.inspectedFlg = inspectedFlg;
	}

	public boolean isTagOutErrorFlg() {
		return this.data.tagOutErrorFlg;
	}

	public void setTagOutErrorFlg(boolean tagOutErrorFlg) {
		this.data.tagOutErrorFlg = tagOutErrorFlg;
	}

	public boolean isNoNextData() {
		return data.noNextData;
	}

	public void setNoNextData(boolean noNextData) {
		this.data.noNextData = noNextData;
	}
}
