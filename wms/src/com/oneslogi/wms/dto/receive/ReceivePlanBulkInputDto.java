package com.oneslogi.wms.dto.receive;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.dto.MCenterDto;
import com.oneslogi.base.dbflute.dto.MClientDto;
import com.oneslogi.base.dbflute.dto.MCustomerDto;
import com.oneslogi.base.dbflute.dto.MProcessTypeDto;
import com.oneslogi.base.dbflute.dto.MProductDto;
import com.oneslogi.base.dbflute.dto.MStockTypeDto;
import com.oneslogi.base.dbflute.dto.MWarehouseDto;
import com.oneslogi.base.dbflute.dto.TReceivePlanBDto;
import com.oneslogi.base.dbflute.dto.TReceivePlanHDto;
import com.oneslogi.base.dbflute.dto.TReceivePlanSpareDto;
import com.oneslogi.base.dto.BaseDto;
import com.oneslogi.base.dto.PagingDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class ReceivePlanBulkInputDto extends PagingDto {

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
		return dto;
	}

	public static TReceivePlanBDto chaseTReceivePlanBDto() {
		return chaseTReceivePlanBDto(new TReceivePlanBDto());
	}

	public static TReceivePlanBDto chaseTReceivePlanBDto(TReceivePlanBDto dto) {
		if (dto.getMWarehouse() == null) {
			dto.setMWarehouse(new MWarehouseDto());
		}
		if (dto.getMProduct() == null) {
			dto.setMProduct(new MProductDto());
		}
		if (dto.getTReceivePlanH() == null) {
			dto.setTReceivePlanH(new TReceivePlanHDto());
		}

		TReceivePlanHDto tReceivePlanHDto = dto.getTReceivePlanH();
		if (tReceivePlanHDto.getMProcessType() == null) {
			tReceivePlanHDto.setMProcessType(new MProcessTypeDto());
		}
		if (tReceivePlanHDto.getMCustomerByPlanSupplierId() == null) {
			tReceivePlanHDto.setMCustomerByPlanSupplierId(new MCustomerDto());
		}
		if (tReceivePlanHDto.getMCustomerByPlanDepositId() == null) {
			tReceivePlanHDto.setMCustomerByPlanDepositId(new MCustomerDto());
		}
		if (tReceivePlanHDto.getMStockType() == null) {
			tReceivePlanHDto.setMStockType(new MStockTypeDto());
		}

		// [#2253]予備項目対応 2017.08.18 sampei Start
		if(dto.getTReceivePlanSpareAsOne() == null){
			dto.setTReceivePlanSpareAsOne(new TReceivePlanSpareDto());
		}
		// [#2253]予備項目対応 2017.08.18 sampei End

		return dto;
	}

	public static class ReceivePlanUploadData implements Serializable {
		public String receiveCd;
		//[Ver3.1][#5754] データが0件の場合はボタンを非活性になるよう修正 2018.12.17 tanaka start
		public int dataCount;
		//[Ver3.1][#5754] データが0件の場合はボタンを非活性になるよう修正 2018.12.17 tanaka end
		// [#219][2.1.0-CT-039] 登録時の関係マスタチェック処理とエラーがある場合のメッセージ設定の既存処理追加 2016.11.21 honma Add Start
		public int errorCount;
		// [#219][2.1.0-CT-039] 登録時の関係マスタチェック処理とエラーがある場合のメッセージ設定の既存処理追加 2016.11.21 honma Add End
		public TReceivePlanHDto head = chaseTReceivePlanHDto();
		public List<TReceivePlanBDto> receivePlan = new ArrayList<TReceivePlanBDto>();
		public TReceivePlanBDto blankRow = chaseTReceivePlanBDto();
	};

	public ReceivePlanUploadData data = new ReceivePlanUploadData();

}
