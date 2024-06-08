package com.oneslogi.wms.plugins;

import com.oneslogi.base.dbflute.exbhv.pmbean.SqlLogListPmb;
import com.oneslogi.base.dbflute.exentity.BLog;
import com.oneslogi.base.logic.operation.LogListSelectLogicPlugin;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.core.AbstractWmsBase;

public class WmsLogListSelectLogicPlugin extends AbstractWmsBase implements LogListSelectLogicPlugin {

	@Override
	public SqlLogListPmb setCondition(BLog bLog, SqlLogListPmb pmb) {

		String timeZoneCd = this.getTimeZoneCd();

		if (CU.isNullOrEmpty(timeZoneCd)) {
			return pmb;
		}

		String fromYmd = bLog.getProcessDtFrom();
		String toYmd = bLog.getProcessDtTo();

		if (!CU.isNullOrEmpty(fromYmd)) {
			fromYmd = fromYmd + "000000";
			pmb.setProcessDtFrom(CU.convertFromClientStrDateTimeToServerStrDateTime(timeZoneCd, fromYmd));
		}

		if (!CU.isNullOrEmpty(toYmd)) {
			toYmd = toYmd + "235959";
			pmb.setProcessDtTo(CU.convertFromClientStrDateTimeToServerStrDateTime(timeZoneCd, toYmd));
		}

		return pmb;
	}

}
