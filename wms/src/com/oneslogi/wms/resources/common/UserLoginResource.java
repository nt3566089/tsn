package com.oneslogi.wms.resources.common;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.oneslogi.base.cdi.annotation.CheckBase;
import com.oneslogi.base.cdi.annotation.CheckBase.CheckMode;
import com.oneslogi.base.dbflute.cbean.MUserLoginCB;
import com.oneslogi.base.dbflute.dto.MUserLoginDto;
import com.oneslogi.base.dbflute.dtomapper.MUserLoginDtoMapper;
import com.oneslogi.base.dbflute.exbhv.MUserLoginBhv;
import com.oneslogi.base.dbflute.exentity.MUserLogin;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.dto.master.UserLoginDto;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * ユーザログインデータ取得用リソースクラス
 */
@CheckBase(CheckMode.TYPE_NOT_CHECK)
@Path("/common/userLogin")
public class UserLoginResource extends AbstractWmsResource {

	// ===== 使用テーブル =====

	@Inject
	private MUserLoginBhv mUserLoginBhv;

	//[Ver2.2.1][#2517] 荷主センタマスタの存在有無チェックをBaseContextInitializer.javaに移動したため不要になり、削除 2017.10.05 miyabe

	@GET
	@Path("/record")
	public UserLoginDto record() {

		MUserLoginCB cb = new MUserLoginBhv().newMyConditionBean();
		cb.setupSelect_MClient();
		cb.setupSelect_MCenter().withBTimeZone();
		cb.query().setUserId_Equal(this.getUserId());

		MUserLogin mUserLogin = mUserLoginBhv.selectEntity(cb);
		//[Ver2.3][#2517] ログイン時のユーザログインマスタ更新処理をBaseContextInitializerへ移動 2017.10.05 miyabe
		MUserLoginDtoMapper mapper = new MUserLoginDtoMapper();
		MUserLoginDto dto = mapper.mappingToDto(mUserLogin);

		UserLoginDto userLoginDto = new UserLoginDto();
		UserLoginDto.UserLoginData data = new UserLoginDto.UserLoginData();
		data.mUserLogin = dto;
		userLoginDto.data = data;

		if (dto != null && dto.getMCenter() != null && dto.getMCenter().getBTimeZone() != null) {
			data.utcTime = CU.getUtcTime(dto.getMCenter().getBTimeZone().getTimeZoneCd());
		}

		return userLoginDto;
	}

}
