package com.oneslogi.wms.logic;

import javax.inject.Inject;

import com.oneslogi.base.cookie.UserData;
import com.oneslogi.base.dbflute.cbean.MClientCenterCB;
import com.oneslogi.base.dbflute.exbhv.MClientCenterBhv;
import com.oneslogi.base.dbflute.exentity.MClientCenter;
import com.oneslogi.wms.WmsConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

public class DailyProcessCheckLogic extends AbstractWmsLogic {

	@Inject
	private MClientCenterBhv clientCenterBhv;

	public int dailyProcessCheck(UserData userData) {

		MClientCenterCB cb = clientCenterBhv.newMyConditionBean();
		cb.query().setClientId_Equal(Long.valueOf(userData.get(WmsConst.ONESLOGI_WMS_CLIENT_ID_KEY_NAME)));
		cb.query().setCenterId_Equal(Long.valueOf(userData.get(WmsConst.ONESLOGI_WMS_CENTER_ID_KEY_NAME)));

		// [Ver3.0][#2718] システム管理日付のチェック処理追加 2018.06.11 shimizu Start
		MClientCenter entity = clientCenterBhv.selectEntity(cb);

		// 荷主センタマスタ未存在（削除状態などで取得不可の場合も含め）
		if (entity == null) {
			return WmsConst.StatusCode.SUCCESS;
		}


		if (entity != null && entity.isBatchProgressFlg$1()) {
			return WmsConst.StatusCode.DAILY_CHECK_ERROR;
		}
		else if(!entity.getSystemDt().equals(userData.get(WmsConst.ONESLOGI_WMS_SYSTEM_DT_KEY_NAME))) {
			return WmsConst.StatusCode.SYSTEM_DT_CHECK_ERROR;
		}

		return WmsConst.StatusCode.SUCCESS;
		// [Ver3.0][#2718] システム管理日付のチェック処理追加 2018.06.11 shimizu End
	}

}
