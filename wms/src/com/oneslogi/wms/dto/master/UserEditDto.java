package com.oneslogi.wms.dto.master;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.dto.BUserDto;
import com.oneslogi.base.dbflute.dto.MCenterDto;
import com.oneslogi.base.dbflute.dto.MClientDto;
import com.oneslogi.base.dbflute.dto.MCustomerDto;
import com.oneslogi.base.dto.BaseDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class UserEditDto extends BaseDto{

	public static BUserDto chaseBUserDto() {
		return chaseBUserDto(new BUserDto());
	}

	public static BUserDto chaseBUserDto (BUserDto dto) {
		return dto;
	}

	public static MCenterDto chaseMCenterDto() {
		return chaseMCenterDto(new MCenterDto());
	}

	public static MCenterDto chaseMCenterDto(MCenterDto dto) {
		return dto;
	}

	public static MClientDto chasMClientDto() {
		return chaseMClientDto(new MClientDto());
	}

	public static MClientDto chaseMClientDto(MClientDto dto) {
		return dto;
	}

	public static class UserEditData implements Serializable {
		public BUserDto user = chaseBUserDto();
		public List<MCenterDto> centerList = new ArrayList<MCenterDto>();
		public List<MClientDto> clientList = new ArrayList<MClientDto>();
		// [#3147][Ver3.0] ユーザ預託管理機能を追加 2017.12.06 honma Add Start
		public List<MCenterDto> searchConditonCenterList = new ArrayList<MCenterDto>();
		public List<MClientDto> searchConditonClientList = new ArrayList<MClientDto>();
		public List<MCustomerDto> depositList = new ArrayList<MCustomerDto>();
		// [#3147][Ver3.0] ユーザ預託管理機能を追加 2017.12.06 honma Add End
	}

	public UserEditData data = new UserEditData();
}
