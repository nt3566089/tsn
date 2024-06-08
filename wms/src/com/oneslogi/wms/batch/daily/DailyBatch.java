package com.oneslogi.wms.batch.daily;

import java.util.Map;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MClientCenter;
import com.oneslogi.wms.batch.AbstractWmsBatch;
import com.oneslogi.wms.logic.daily.DailyMainLogic;

/**
 * 日次締処理バッチクラス
 */
public class DailyBatch extends AbstractWmsBatch {

	/**
	 * ステータスコード定義(ロジック呼出用)
	 */
	protected static class StatusCode {
		/**
		 * 正常終了
		 */
		protected static final int SUCCESS = 0;
		/**
		 * 日次締処理異常
		 */
		protected static final int DAILY_PROCESS_ERROR = 2;
	}

	// ===== 使用ロジッククラス =====
	@Inject
	private DailyMainLogic dailyProcessLogic;

	/**
	 * <h2>日次締処理を実施する。</h2>
	 *
	 * @return int ステータスコード
	 */
	@Override
	protected int execute() {
		Map<String, String> args = getKeyValueArgs();

		final long centerId = Long.valueOf(args.get("centerId"));
		final long clientId = Long.valueOf(args.get("clientId"));
		final String centerCd = args.get("centerCd");
		final String clientCd = args.get("clientCd");
		final String nextDt = args.get("nextDt");

		MClientCenter clientCenter = new MClientCenter();
		clientCenter.setCenterId(centerId);
		clientCenter.setClientId(clientId);
		clientCenter.setSystemDateAdd(nextDt);
		MCenter center = new MCenter();
		center.setCenterCd(centerCd);
		MClient client = new MClient();
		client.setClientCd(clientCd);
		clientCenter.setMCenter(center);
		clientCenter.setMClient(client);

		dailyProcessLogic.mainProcess(clientCenter, errRetSts(StatusCode.DAILY_PROCESS_ERROR));
		if (getErrorManager().size() > 0) {
			return StatusCode.DAILY_PROCESS_ERROR;
		}

		return StatusCode.SUCCESS;
	}
}
