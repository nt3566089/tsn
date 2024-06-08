package com.oneslogi.wms.dto.shipping;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dto.BaseDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class AmsMoveRequestsOutputDto extends BaseDto {

	public static class AgvMoveRequestsOutputBody implements Serializable {
		//移動要求バッチNo.
		public String batchNo = null;
		//移動要求ヘッダNo.
		public String headerNo = null;
		//移動要求行No.
		//public String lineNo = null;
		public Long lineNo = null;
		//移動要求連携No.
		public String linkNo = null;
		//移動要求作業No.
		public String workNo = null;
		//要求内容
		public String requestDetail = null;
		//移動元
		public String moveSource = null;
		//移動先
		public String moveDestination = null;
		//移動物品
		public String item = null;
		//移動数
		//public String quantity = null;
		public Long quantity = null;
		//優先順位
		//public String priority = null;
		public Long priority = null;
	}

	public static class AgvMoveRequestsOutputData implements Serializable {
		// マップＣＤ
		public String mapCd = null;
		// 移動指示データ
		public List<AgvMoveRequestsOutputBody> moveRequests = new ArrayList<AgvMoveRequestsOutputBody>();
	};

	public AgvMoveRequestsOutputData data = new AgvMoveRequestsOutputData();
}