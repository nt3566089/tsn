package com.oneslogi.wms.dto.common;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.oneslogi.base.dto.BaseDto;

public class ClientDto extends BaseDto {

	public static class DropDownListData implements Serializable {
		// [#3484] ロケーションマスタメンテナンス画面に荷主のドロップダウンを追加 2018.02.27 kawana Start
		/** 荷主ID */
		public Long clientId;
		// [#3484] ロケーションマスタメンテナンス画面に荷主のドロップダウンを追加 2018.02.27 kawana End
		/** 荷主CD */
		public String clientCd;
		/** 荷主名称 */
		public String clientNm;
	};

	public List<DropDownListData> data = new ArrayList<DropDownListData>();

}
