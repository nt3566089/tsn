package com.oneslogi.wms.batch.shipping;

import java.util.Map;

import javax.inject.Inject;

import com.oneslogi.wms.batch.AbstractWmsBatch;
import com.oneslogi.wms.logic.shipping.ShipStatusUpdateLogic;
import com.oneslogi.wms.logic.shipping.UpdateControlNoLogic;

/**
 * 出庫指示後処理バッチクラス
 */
public class ShippingInstAfterBatch extends AbstractWmsBatch {

	/**
	 * ステータスコード定義(ロジック呼出用)
	 */
	protected static class StatusCode {
		/**
		 * 正常終了
		 */
		protected static final int SUCCESS = 0;
	}

	@Inject
	private ShipStatusUpdateLogic shipStatusUpdateLogic;
	@Inject
	private UpdateControlNoLogic updateControlNoLogic;

	/**
	 * <h2>出庫指示処理の後処理を実施する。</h2>
	 * <pre>
	 * 次の順にロジッククラスを呼出す
	 * 1. 出庫指示中異常時のステータス更新処理
	 * 2. コントロールNo.クリア処理
	 *
	 * 本メソッドで出庫指示バッチNo.と処理No.を採番する
	 * </pre>
	 * @return int ステータスコード
	 */
	@Override
	protected int execute() {

		Map<String, String> args = getKeyValueArgs();
		final long controlNo = Long.valueOf(args.get("controlNo"));

		// ===== 出庫指示中のままのデータを未出荷に変更 =====
		shipStatusUpdateLogic.workOrderBatchCancel(controlNo);

		// ===== コントロールNo.クリア処理 =====
		updateControlNoLogic.clearShippingInstH(controlNo);

		return StatusCode.SUCCESS;
	}
}
