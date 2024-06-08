package com.oneslogi.wms.resources.common;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import com.oneslogi.base.dbflute.dto.BUserDto;
import com.oneslogi.base.dbflute.dtomapper.BUserDtoMapper;
import com.oneslogi.base.dbflute.exentity.BUser;
import com.oneslogi.wms.dto.common.UserDto;
import com.oneslogi.wms.logic.common.UserLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * ユーザデータ取得用リソースクラス
 */
@Path("/common/user")
public class UserResource extends AbstractWmsResource {

	@Inject
	private UserLogic userLogic;

	@GET
	@Path("/record")
	public UserDto record(@QueryParam("userCd") String userCd) {

		BUser bUser = new BUser();
		bUser.setUserCd(userCd);
		BUser entity = userLogic.getUkEntity(bUser);
		if (entity == null) {
			return null;
		}

		BUserDtoMapper mapper = new BUserDtoMapper();
		BUserDto dto = mapper.mappingToDto(entity);
		UserDto resultDto = new UserDto();
		resultDto.data.bUser = dto;

		return resultDto;
	}
}
