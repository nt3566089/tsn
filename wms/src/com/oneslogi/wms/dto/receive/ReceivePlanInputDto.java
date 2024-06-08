package com.oneslogi.wms.dto.receive;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.dto.MCenterDto;
import com.oneslogi.base.dbflute.dto.MClientDto;
import com.oneslogi.base.dbflute.dto.MCustomerDto;
import com.oneslogi.base.dbflute.dto.MLocationDto;
import com.oneslogi.base.dbflute.dto.MProcessTypeDto;
import com.oneslogi.base.dbflute.dto.MProductDto;
import com.oneslogi.base.dbflute.dto.MStockTypeDto;
import com.oneslogi.base.dbflute.dto.TReceivePlanBDto;
import com.oneslogi.base.dbflute.dto.TReceivePlanHDto;
import com.oneslogi.base.dbflute.dto.TReceivePlanSpareDto;
import com.oneslogi.base.dto.BaseDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class ReceivePlanInputDto extends BaseDto {

	public static TReceivePlanHDto chaseTReceivePlanHDto() {
		return chaseTReceivePlanHDto(new TReceivePlanHDto());
	}

	public static TReceivePlanHDto chaseTReceivePlanHDto(TReceivePlanHDto dto) {
		if (dto.getMCenter() == null) {
			dto.setMCenter(new MCenterDto());
		}
		if (dto.getMClient() == null) {
			dto.setMClient(new MClientDto());
		}
		if (dto.getMProcessType() == null) {
			dto.setMProcessType(new MProcessTypeDto());
		}
		if (dto.getMCustomerByPlanSupplierId() == null) {
			dto.setMCustomerByPlanSupplierId(new MCustomerDto());
		}
		if (dto.getMCustomerByPlanDepositId() == null) {
			dto.setMCustomerByPlanDepositId(new MCustomerDto());
		}
		//【Ver1.1.1】[C-CWMS-0035] 入荷予定入力画面に在庫区分を追加する 2015.08.07 hayashi Start
		if (dto.getMStockType() == null) {
			dto.setMStockType(new MStockTypeDto());
		}
		//【Ver1.1.1】[C-CWMS-0035] 入荷予定入力画面に在庫区分を追加する 2015.08.07 hayashi End
		return dto;
	}

	public static TReceivePlanBDto chaseTReceivePlanBDto() {
		return chaseTReceivePlanBDto(new TReceivePlanBDto());
	}

	public static TReceivePlanBDto chaseTReceivePlanBDto(TReceivePlanBDto dto) {
		if (dto.getMProduct() == null) {
			dto.setMProduct(new MProductDto());
		}
		if (dto.getMLocation() == null) {
			dto.setMLocation(new MLocationDto());
		}

		// [#2253]予備項目対応 2017.08.18 sampei Start
		if(dto.getTReceivePlanSpareAsOne() == null){
			dto.setTReceivePlanSpareAsOne(new TReceivePlanSpareDto());
		}
		// [#2253]予備項目対応 2017.08.18 sampei End

		return dto;
	}

	public static class ReceivePlanData implements Serializable {
		public TReceivePlanHDto head = chaseTReceivePlanHDto();
		public List<TReceivePlanBDto> body = new ArrayList<TReceivePlanBDto>();
		public TReceivePlanBDto blankRow = chaseTReceivePlanBDto();
		// [C-NIS-0008] システム日付の入力有無を設定ファイルで変更できるように変更 2015.07.03 kawana Start
		// 入荷予定日デフォルト表示設定
		public Integer planDtDefFlg;
		// [C-NIS-0008] システム日付の入力有無を設定ファイルで変更できるように変更 2015.07.03 kawana End
	};

	public ReceivePlanData data = new ReceivePlanData();
}
