package com.oneslogi.wms.dto.shipping;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.dto.MCustomerDto;
import com.oneslogi.base.dbflute.dto.TAllocInstHDto;
import com.oneslogi.base.dbflute.dto.TPickingHDto;
import com.oneslogi.base.dbflute.dto.customize.SqlOrderPickingDataListDto;
import com.oneslogi.base.dto.BaseDto;
import com.oneslogi.base.dto.PagingDto;
import com.oneslogi.wms.dto.report.OrderPickingListDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class OrderPickingSDDto extends PagingDto {

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
		// [#1942] ページング不正を修正 2017.06.21 kawana Start
		// 検索結果 - 指示一覧
		public List<OrderPickingListDto> headList = new ArrayList<OrderPickingListDto>();
		// 検索結果 - 指示明細一覧
		public List<SqlOrderPickingDataListDto> list = new ArrayList<SqlOrderPickingDataListDto>();
		// [#1942] ページング不正を修正 2017.06.21 kawana End
		// インデックス
		public int index = -1;
		// [Ver3.1][#5487] SDピッキングからピッキングする際同一梱包No.のデータが複数ある場合各内訳、商品単位を取得する 2018.11.05 matsumoto Start
		public boolean isAutoFlg = false;
		// [Ver3.1][#5487] SDピッキングからピッキングする際同一梱包No.のデータが複数ある場合各内訳、商品単位を取得する 2018.11.05 matsumoto End
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
