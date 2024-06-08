package com.oneslogi.wms.dto.master;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.oneslogi.base.dto.BaseDto;

public class UserWarehouseDto extends BaseDto {
	public static class DropDownListData implements Serializable {

		public Long warehouseId;

		public String warehouseNm;

		public String warehouseCd;

		public String centerCd;

	};

	public List<DropDownListData> data = new ArrayList<DropDownListData>();

}
