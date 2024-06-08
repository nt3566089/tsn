package com.oneslogi.wms.dto.receive;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.dto.MCenterDto;
import com.oneslogi.base.dbflute.dto.MClientDto;
import com.oneslogi.base.dbflute.dto.MCustomerDto;
import com.oneslogi.base.dbflute.dto.MProductDto;
import com.oneslogi.base.dbflute.dto.TReceivePlanBDto;
import com.oneslogi.base.dbflute.dto.TReceivePlanHDto;
import com.oneslogi.base.dto.BaseDto;
import com.oneslogi.base.dto.PagingDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class ReceivePartListDto extends PagingDto {

	public static TReceivePlanHDto chaseTReceivePlanHDto() {
		return chaseTReceivePlanHDto(new TReceivePlanHDto());
	}

	public static class DropDownListData implements Serializable {

		public String classNm;

		public String classCd;

		public String defaultFlg;

	}

	public static TReceivePlanHDto chaseTReceivePlanHDto(TReceivePlanHDto dto) {
		//荷主
		if (dto.getMClient() == null) {
			dto.setMClient(new MClientDto());
		}
		//センタ
		if (dto.getMCenter() == null) {
			dto.setMCenter(new MCenterDto());
		}
        //仕入先コード
		if (dto.getMCustomerByPlanSupplierId() == null) {
			dto.setMCustomerByPlanSupplierId(new MCustomerDto());
		}

		return dto;
	}


	public static TReceivePlanBDto chaseTReceivePlanBDto() {
		return chaseTReceivePlanBDto(new TReceivePlanBDto());
	}

	public static TReceivePlanBDto chaseTReceivePlanBDto(TReceivePlanBDto dto) {
		if (dto.getMProduct() == null) {
			dto.setMProduct(new MProductDto());
		}
		if (dto.getTReceivePlanH()== null) {
			dto.setTReceivePlanH(new TReceivePlanHDto());
		}
		return dto;
	}


   public static class ReceivePlanData implements Serializable {
		//検索条件
		public TReceivePlanHDto receivePartListSearch = chaseTReceivePlanHDto();
		//検索結果
		public List<TReceivePlanBDto> list = new ArrayList<TReceivePlanBDto>();
		public TReceivePlanBDto blankRow = chaseTReceivePlanBDto();
	};

	public ReceivePlanData data = new ReceivePlanData();
	public List<DropDownListData> dataList = new ArrayList<DropDownListData>();

}
