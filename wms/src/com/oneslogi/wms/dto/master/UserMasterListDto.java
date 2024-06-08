package com.oneslogi.wms.dto.master;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.dto.BCultureDto;
import com.oneslogi.base.dbflute.dto.BRoleGrpDto;
import com.oneslogi.base.dbflute.dto.BUserDto;
import com.oneslogi.base.dbflute.dto.MCenterDto;
import com.oneslogi.base.dbflute.dto.MClientDto;
import com.oneslogi.base.dbflute.dto.MUserCenterDto;
import com.oneslogi.base.dbflute.dto.MUserClientDto;
import com.oneslogi.base.dto.BaseDto;
import com.oneslogi.base.dto.PagingDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class UserMasterListDto extends PagingDto{

	public static BUserDto chaseUserListDto() {
		return chaseUserListDto(new BUserDto());
	}

	public static BUserDto chaseUserListDto (BUserDto dto) {
		if (dto.getBCulture() == null) {
			dto.setBCulture(new BCultureDto());
		}
		if (dto.getBRoleGrp() == null) {
			dto.setBRoleGrp(new BRoleGrpDto());
		}
		if (dto.getMUserCenterList().size() == 0) {
			dto.getMUserCenterList().add(0, new MUserCenterDto());
		}
		if (dto.getMUserCenterList().get(0).getMCenter() == null) {
			dto.getMUserCenterList().get(0).setMCenter(new MCenterDto());
		}
		if (dto.getMUserClientList().size() == 0) {
			dto.getMUserClientList().add(0, new MUserClientDto());
		}
		if (dto.getMUserClientList().get(0).getMClient() == null) {
			dto.getMUserClientList().get(0).setMClient(new MClientDto());
		}
		return dto;
	}

	public static class UserListData implements Serializable {

		// 検索条件
		public BUserDto head = chaseUserListDto();

		// 検索結果
		public List<BUserDto> body = new ArrayList<BUserDto>();

		// センタマスタリスト
		public List<MCenterDto> centerList = new ArrayList<MCenterDto>();

		// 荷主マスタリスト
		public List<MClientDto> clientList = new ArrayList<MClientDto>();
	}

	public UserListData data = new UserListData();
}
