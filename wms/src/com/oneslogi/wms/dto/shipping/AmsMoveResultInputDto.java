package com.oneslogi.wms.dto.shipping;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dto.BaseDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class AmsMoveResultInputDto extends BaseDto {

	public static class AmsMoveResultInputBody implements Serializable {
		//移動要求バッチNo.
		public String batchNo = null;
		//移動要求ヘッダNo.
		public String headerNo = null;
		//移動要求行No.
		public String lineNo = null;
		//移動要求連携No.
		public String linkNo = null;
		//移動要求作業No.
		public String workNo = null;
		//マップCD
		public String mapCd = null;
		//AGVシリアル番号
		public String agvSerialNumber = null;
		//AGV型式名
		public String agvModelCd = null;
		//要求内容
		public String requestDetail = null;
		//移動元
		public String moveSource = null;
		//移動先
		public String moveDestination = null;
		//移動物品
		public String item = null;
		//移動数
		public String quantity = null;
		//優先順位
		public String priority = null;
	}

	public static class AmsMoveResultInputData implements Serializable {
		// ボディ
		public List<AmsMoveResultInputBody> moveRequests = new ArrayList<AmsMoveResultInputBody>();
	};

	public AmsMoveResultInputData data = new AmsMoveResultInputData();
}