package com.oneslogi.wms.dto.master;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.dto.MCenterCustomerDto;
import com.oneslogi.base.dbflute.dto.MCenterDto;
import com.oneslogi.base.dbflute.dto.MClientDto;
import com.oneslogi.base.dbflute.dto.MCustomerDto;
import com.oneslogi.base.dbflute.dto.MDeliveryCourseDto;
import com.oneslogi.base.dto.BaseDto;
import com.oneslogi.base.dto.PagingDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class CustomerMasterBulkInputDto extends PagingDto{

	public static MCustomerDto chaseMCustomerDto() {
		return chaseMCustomerDto(new MCustomerDto());
	}

	public static MCustomerDto chaseMCustomerDto (MCustomerDto dto) {

		if (dto.getMClient() == null) {
			dto.setMClient(new MClientDto());
		}
		return dto;
	}

	public static MCenterCustomerDto chaseMCustomerBodyDto() {
		return chaseMCustomerBodyDto(new MCenterCustomerDto());
	}

	public static MCenterCustomerDto chaseMCustomerBodyDto(MCenterCustomerDto dto) {
		if (dto.getMCenter() == null) {
			dto.setMCenter(new MCenterDto());
		}
		if (dto.getMCustomer() == null) {
			dto.setMCustomer(new MCustomerDto());
		}
		if (dto.getMDeliveryCourse() == null) {
			dto.setMDeliveryCourse(new MDeliveryCourseDto());
		}
		return dto;
	}

	public static class CustomerMasterEditData implements Serializable {
		// [C-CWMS-0060] EDI機能(汎用)バッチ化対応 2016.08.01 kawana Start
		public String receiveCd;
		// [C-CWMS-0060] EDI機能(汎用)バッチ化対応 2016.08.01 kawana End
		//[Ver3.1][#5754] データが0件の場合はボタンを非活性になるよう修正 2018.12.17 tanaka start
		public int dataCount;
		//[Ver3.1][#5754] データが0件の場合はボタンを非活性になるよう修正 2018.12.17 tanaka end
		// [#219][2.1.0-CT-039] 登録時の関係マスタチェック処理とエラーがある場合のメッセージ設定の既存処理追加 2016.11.18 honma Add Start
		public int errorCount;
		// [#219][2.1.0-CT-039] 登録時の関係マスタチェック処理とエラーがある場合のメッセージ設定の既存処理追加 2016.11.18 honma Add End
		public MCustomerDto head = chaseMCustomerDto();
		public List<MCenterCustomerDto> customerMaster = new ArrayList<MCenterCustomerDto>();
		public MCenterCustomerDto blankRow = chaseMCustomerBodyDto();
	}

	public CustomerMasterEditData data = new CustomerMasterEditData();
}
