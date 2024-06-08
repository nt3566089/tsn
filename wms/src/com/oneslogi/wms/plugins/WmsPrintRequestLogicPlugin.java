package com.oneslogi.wms.plugins;

import java.sql.Timestamp;

import com.oneslogi.base.dbflute.cbean.PPrintRequestCB;
import com.oneslogi.base.enums.print.PrintStatus;
import com.oneslogi.base.enums.print.PrintedErrorFlg;
import com.oneslogi.base.enums.print.PrintedFlg;
import com.oneslogi.base.logic.print.PrintRequestLogicPlugin;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.core.AbstractWmsBase;

public class WmsPrintRequestLogicPlugin extends AbstractWmsBase implements PrintRequestLogicPlugin {

	@Override
	public PPrintRequestCB setCondition(final String reportCd, final Long reportLayoutId, final Long printerGroupId,
			final PrintStatus printStatus, final PrintedFlg printedFlg, final Timestamp queueAddDtFrom,
			final Timestamp queueAddDtTo, final PrintedErrorFlg errorFlg, final String userCd,
			final String printDataType, PPrintRequestCB cb) {

		String timeZoneCd = this.getTimeZoneCd();

		if (CU.isNullOrEmpty(timeZoneCd)) {
			return cb;
		}

		if (queueAddDtFrom != null) {
			cb.query().setQueueAddDt_GreaterEqual(CU.convertFromClientTimestampToServerTimestamp(timeZoneCd, queueAddDtFrom));
		}

		if (queueAddDtTo != null) {
			cb.query().setQueueAddDt_LessEqual(CU.convertFromClientTimestampToServerTimestamp(timeZoneCd, queueAddDtTo));
		}

		return cb;
	}

}
