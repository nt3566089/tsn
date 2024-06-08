package com.oneslogi.wms.dto.common;

import java.io.Serializable;

import com.oneslogi.base.dbflute.dto.BUserDto;
import com.oneslogi.base.dto.BaseDto;

public class UserDto extends BaseDto {

	public static class UserData implements Serializable {

		public BUserDto bUser = new BUserDto();

	}

	public UserData data = new UserData();
}
