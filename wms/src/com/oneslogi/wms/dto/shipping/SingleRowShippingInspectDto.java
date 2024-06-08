package com.oneslogi.wms.dto.shipping;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.dto.MBoxDto;
import com.oneslogi.base.dbflute.dto.MCenterDto;
import com.oneslogi.base.dbflute.dto.MClientDto;
import com.oneslogi.base.dbflute.dto.MProductDto;
import com.oneslogi.base.dbflute.dto.WSglRowShipInspBDto;
import com.oneslogi.base.dbflute.dto.WSglRowShipInspHDto;
import com.oneslogi.base.dto.BaseDto;
import com.oneslogi.base.dto.PagingDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class SingleRowShippingInspectDto extends PagingDto {

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

		if (dto.getMProduct() == null) {
			dto.setMProduct(new MProductDto());
		}

		return dto;
	}

	public static WSglRowShipInspBDto chaseWSglRowShipInspBDto() {

		return chaseWSglRowShipInspBDto(new WSglRowShipInspBDto());
	}

	public static WSglRowShipInspBDto chaseWSglRowShipInspBDto(WSglRowShipInspBDto dto) {

		if (dto.getWSglRowShipInspH() == null) {
			dto.setWSglRowShipInspH(chaseWSglRowShipInspHDto());
		} else {
			dto.setWSglRowShipInspH(chaseWSglRowShipInspHDto(dto.getWSglRowShipInspH()));
		}

		return dto;
	}

	public static class ShippingInpectData implements Serializable {

		// 検索条件
		public WSglRowShipInspHDto search = chaseWSglRowShipInspHDto();

		// 作業指示数リスト
		public Set<Long> instNumList = null;
		// デフォルト荷材
		public MBoxDto defaultBox = null;

		// 検品中データ
		public WSglRowShipInspBDto inspData = chaseWSglRowShipInspBDto();
		// 検品リスト
		public List<WSglRowShipInspBDto> list = null;
		// ユーザ検品伝票数
		public Integer userInspSlipNum = null;

		// 1伝票の検品完了
		public boolean isInspectedSlip = false;
		// 次の検品データ有無
		public boolean noNextData = false;
		// 出庫作業メッセージ
		public String pickingWorkMessage = null;
	};

	public ShippingInpectData data = new ShippingInpectData();

}
