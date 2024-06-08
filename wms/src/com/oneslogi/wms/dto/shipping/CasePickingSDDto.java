package com.oneslogi.wms.dto.shipping;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.dto.MCustomerDto;
import com.oneslogi.base.dbflute.dto.TAllocInstHDto;
import com.oneslogi.base.dbflute.dto.TPickingHDto;
import com.oneslogi.base.dbflute.dto.customize.SqlCasePickingDataListDto;
import com.oneslogi.base.dbflute.dto.customize.SqlCasePickingNoListDto;
import com.oneslogi.base.dto.BaseDto;
import com.oneslogi.base.dto.PagingDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class CasePickingSDDto extends PagingDto {

	public static TPickingHDto chaseTPickingHDto() {
		return chaseTPickingHDto(new TPickingHDto());
	}

	public static TPickingHDto chaseTPickingHDto(TPickingHDto dto) {

		if (dto.getTAllocInstH() == null) {
			dto.setTAllocInstH(new TAllocInstHDto());
			dto.getTAllocInstH().setMCustomerBySupplyCustomerId(new MCustomerDto());
		}

		return dto;
	}

	public static class OrderPickingSDData implements Serializable {
		// ヘッダ部DTO
		public TPickingHDto head = chaseTPickingHDto();
		// [#1942] ケースピッキングのページング不正を修正 2017.06.20 kawana Start
		// 検索結果 - ヘッダリスト
		public List<SqlCasePickingNoListDto> headList = new ArrayList<SqlCasePickingNoListDto>();
		// 検索結果 - 明細リスト
		public List<SqlCasePickingDataListDto> list = new ArrayList<SqlCasePickingDataListDto>();
		// [#1942] ケースピッキングのページング不正を修正 2017.06.20 kawana End
		// インデックス
		public int index = -1;
		// [#2946][Ver3.0] WAS連携対応 2018/01/16 PYM Start
	    // 明細条数
	 	private int detailCount;
	 	private int detailNum;
		private BigDecimal pickingNumSumUsedByLog;
	 	public int getDetailNum() {
			return detailNum;
		}
		public void setDetailNum(int detailNum) {
			this.detailNum = detailNum;
		}
		public BigDecimal getPickingNumSumUsedByLog() {
			return pickingNumSumUsedByLog;
		}
		public void setPickingNumSumUsedByLog(BigDecimal pickingNumSumUsedByLog) {
			this.pickingNumSumUsedByLog = pickingNumSumUsedByLog;
		}
		public int getDetailCount() {
			return detailCount;
		}
		public void setDetailCount(int detailCount) {
			this.detailCount = detailCount;
		}
		// [#2946][Ver3.0] WAS連携対応 2018/01/16 PYM End
	};

	public OrderPickingSDData data = new OrderPickingSDData();
}
