package com.oneslogi.wms.plugins;

import com.oneslogi.base.AbstractBase;
import com.oneslogi.base.dbflute.exentity.BUserAuth;
import com.oneslogi.base.dto.master.LiteLoginPwdMgtRegisterDto;
import com.oneslogi.base.resources.master.LiteLoginPwdMgtResourcePlugin;
import com.oneslogi.base.util.CU;

public class WmsLiteLoginPwdMgtResourcePlugin extends AbstractBase implements LiteLoginPwdMgtResourcePlugin {

	@Override
	public void setEntity(LiteLoginPwdMgtRegisterDto dto, BUserAuth bUserAuth) {

		String timeZoneCd = this.getTimeZoneCd();

		if (CU.isNullOrEmpty(timeZoneCd)) {
			return;
		}

		if (bUserAuth.getAvailableStartDate() != null) {
			bUserAuth.setAvailableStartDate(CU.convertFromClientTimestampToServerTimestamp(timeZoneCd, bUserAuth.getAvailableStartDate()));
		}

		if (bUserAuth.getAvailableEndDate() != null) {
			bUserAuth.setAvailableEndDate(CU.convertFromClientTimestampToServerTimestamp(timeZoneCd, bUserAuth.getAvailableEndDate()));
		}

	}

}
