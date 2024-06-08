package com.oneslogi.wms.batch.shipping;

import java.util.Map;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.exentity.TShippingInstH;
import com.oneslogi.wms.WmsNumberingConst;
import com.oneslogi.wms.batch.AbstractWmsBatch;
import com.oneslogi.wms.core.logic.NumberingCenterLogic;
import com.oneslogi.wms.logic.shipping.ShipStatusCheckLogic;
import com.oneslogi.wms.logic.shipping.WorkOrderLogic;

/**
 * 出庫指示バッチクラス
 */
public class ShippingInstBatch extends AbstractWmsBatch {

	/**
	 * ステータスコード定義(ロジック呼出用)
	 */
	protected static class StatusCode {
		/**
		 * 正常終了
		 */
		protected static final int SUCCESS = 0;
		/**
		 * 出庫指示データチェック異常
		 */
		protected static final int DATA_CHECK_ERROR = 2;
		/**
		 * 出庫指示異常
		 */
		protected static final int INDICATOR_ERROR = 3;
	}

	// ===== 使用ロジッククラス =====
	@Inject
	private ShipStatusCheckLogic shipStatusCheckLogic;
	@Inject
	private WorkOrderLogic workOrderLogic;
	@Inject
	private NumberingCenterLogic numberingLogic;

	/**
	 * <h2>出庫指示処理を実施する。</h2>
	 * <pre>
	 * 次の順にロジッククラスを呼出し出庫指示処理をする
	 * 1. 出庫指示前チェック処理
	 * 2. 出庫指示処理
	 * 3. 出庫指示後チェック処理
	 *
	 * 本メソッドで出庫指示バッチNo.と処理No.を採番する
	 * </pre>
	 * @return int ステータスコード
	 */
	@Override
	protected int execute() {
		Map<String, String> args = getKeyValueArgs();

		final long clientId = Long.valueOf(args.get("clientId"));
		final long centerId = Long.valueOf(args.get("centerId"));
		final String clientCd = args.get("clientCd");
		final String centerCd = args.get("centerCd");
		final long controlNo = Long.valueOf(args.get("controlNo"));
		final int dataCount = Integer.valueOf(args.get("dataCount"));

		// 出庫指示バッチNo 採番
		String pickingBatchNo = numberingLogic.getNumbering(centerId, WmsNumberingConst.PICKING_BATCH_NO);
		// 処理No. 採番
		String processNo = numberingLogic.getNumbering(centerId, WmsNumberingConst.PROCESS_NO);

		// ログ書込開始
		workOrderLogic.startLog(centerCd, clientCd, pickingBatchNo, processNo, dataCount);

		this.setDataCache(true);
		TShippingInstH shippingInstH = new TShippingInstH();
		shippingInstH.setControlNo(controlNo);
		shippingInstH.setCenterId(centerId);
		shippingInstH.setClientId(clientId);

		// ===== データチェック =====
		shipStatusCheckLogic.workOrderBatch(shippingInstH, dataCount, errRetSts(StatusCode.DATA_CHECK_ERROR));
		if (0 < getErrorManager().size()) {
			workOrderLogic.endFailureLog();
			return StatusCode.DATA_CHECK_ERROR;
		}

		// ===== 出庫指示 =====
		workOrderLogic.shipInstructe(shippingInstH, pickingBatchNo, processNo, errRetSts(StatusCode.INDICATOR_ERROR));
		if (0 < getErrorManager().size()) {
			workOrderLogic.endFailureLog();
			return StatusCode.INDICATOR_ERROR;
		}

		// ===== データチェック(処理後) =====
		shipStatusCheckLogic.workOrderAfter(shippingInstH, dataCount, errRetSts(StatusCode.DATA_CHECK_ERROR));
		if (0 < getErrorManager().size()) {
			workOrderLogic.endFailureLog();
			return StatusCode.DATA_CHECK_ERROR;
		}

		// ログ書込終了
		workOrderLogic.endSuccessLog();

		return StatusCode.SUCCESS;
	}
}
