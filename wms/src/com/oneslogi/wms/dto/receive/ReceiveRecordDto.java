package com.oneslogi.wms.dto.receive;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dto.BaseDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class ReceiveRecordDto extends BaseDto {

	/**
	 * 入庫実績送信（販物）用明細クラス
	 */
	public static class ReceiveRecordBody implements Serializable {

		// 1:出力内容
		public String outputString = null;

	}

	/**
	 * 入庫実績送信（販物）用DTO実装クラス
	 */
	public static class ReceiveRecordData implements Serializable {

		// 国産データ出力用リスト
		public List<ReceiveRecordBody> domesticList = new ArrayList<ReceiveRecordBody>();

		// 輸入データ出力用リスト
		public List<ReceiveRecordBody> importList = new ArrayList<ReceiveRecordBody>();

	}

	public ReceiveRecordData data = new ReceiveRecordData();
}
