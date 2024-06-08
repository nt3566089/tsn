package com.oneslogi.wms.dto.shipping;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.dto.TTrsolistDto;
import com.oneslogi.base.dbflute.dto.customize.SqlBondedShippingRelationListPrintDto;
import com.oneslogi.base.dto.BaseDto;
import com.oneslogi.base.dto.PagingDto;
import com.oneslogi.base.dto.PrintParamDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class BondedShippingRelationListPrintDto extends PagingDto {

	public static TTrsolistDto chaseTTrsolistDto() {
		return chaseTTrsolistDto(new TTrsolistDto());
	}

	public static TTrsolistDto chaseTTrsolistDto(TTrsolistDto dto) {
		return dto;
	}

	public static class BondedShippingRelationListPrintData implements Serializable {

		//検索条件を入れるDTO
		public TTrsolistDto search = chaseTTrsolistDto();

		//検索結果を入れるDTO
		public List<SqlBondedShippingRelationListPrintDto> list = new ArrayList<SqlBondedShippingRelationListPrintDto>();
		
		//印刷情報格納用Dto 棚出リスト
		public PrintParamDto prmBondedPickingListDto = new PrintParamDto();

		//印刷情報格納用Dto パレット明細(単品)
		public PrintParamDto prmPalleteDtlSingleDto = new PrintParamDto();

		//印刷情報格納用Dto パレット明細(端数)
		public PrintParamDto prmPalletDtlFractionDto = new PrintParamDto();

		//印刷情報格納用Dto 仕分場受入検品リスト
		public PrintParamDto prmSortingPlaceIncomingInspecListDto = new PrintParamDto();

		//印刷情報格納用Dto 積込リスト
		public PrintParamDto prmShippingLoadingListDto = new PrintParamDto();

	};

	public BondedShippingRelationListPrintData data = new BondedShippingRelationListPrintData();
}
