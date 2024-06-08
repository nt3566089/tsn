package com.oneslogi.wms.dto.master;

import java.io.Serializable;

import com.oneslogi.base.dbflute.dto.MUserLoginDto;
import com.oneslogi.base.dto.BaseDto;

public class UserLoginDto extends BaseDto {
	public static class UserLoginData implements Serializable {
		public MUserLoginDto mUserLogin = new MUserLoginDto();
		public String utcTime = null;
	};
	public UserLoginData data = new UserLoginData();

}
