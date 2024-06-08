package com.oneslogi.wms.dto.master;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.exentity.WCarrierZipInput;
import com.oneslogi.base.dto.BaseDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class CarrierZipInputDto extends BaseDto {

	public static WCarrierZipInput chaseWCarrierZipInput() {
		return new WCarrierZipInput();
	}

	public static class CarrierZipInputData implements Serializable {
		public List<WCarrierZipInput> dataRows = new ArrayList<WCarrierZipInput>();
		public WCarrierZipInput blankRow = chaseWCarrierZipInput();
	};

	public CarrierZipInputData data = new CarrierZipInputData();
}
