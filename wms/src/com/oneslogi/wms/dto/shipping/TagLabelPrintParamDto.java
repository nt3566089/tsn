package com.oneslogi.wms.dto.shipping;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dto.BaseDto;
import com.oneslogi.base.dto.PrintParamDto;
import com.oneslogi.wms.logic.shipping.TagLabelPrintLogic.TagLabelCls;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class TagLabelPrintParamDto extends PrintParamDto {

	public static class TagLabelPrintParamData implements Serializable {

		public Long centerId = null;
		public Long clientId = null;
		public String targetNo = null;
		public boolean isShippingPackingNo = false;
		public int tagLabelCls = TagLabelCls.TAG_PIECE.code();
		public List<Long> listReportId = new ArrayList<Long>();
	};

	public TagLabelPrintParamData data = new TagLabelPrintParamData();
}
