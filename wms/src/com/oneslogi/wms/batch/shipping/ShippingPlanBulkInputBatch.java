package com.oneslogi.wms.batch.shipping;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.exentity.EShippingInst;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.batch.AbstractWmsBatch;
import com.oneslogi.wms.logic.shipping.ShippingPlanBulkInputCheckStatusLogic;
import com.oneslogi.wms.logic.shipping.ShippingPlanBulkInputRegisterLogic;
import com.oneslogi.wms.logic.shipping.ShippingPlanBulkInputSelectLogic;

//[バグ #14][バッチ処理でログインユーザの情報が参照できない] 2016.10.3 inoue Start
//基底クラスを変更。
//public class ShippingPlanBulkInputBatch extends AbstractBatch {
public class ShippingPlanBulkInputBatch extends AbstractWmsBatch {
//[バグ #14][バッチ処理でログインユーザの情報が参照できない] 2016.10.3 inoue End

	// ===== 定数定義 =====

	/**
	 * ステータスコード定義(ロジック呼出用)
	 */
	protected static class StatusCode {
		/**
		 * 正常終了
		 */
		protected static final int SUCCESS = 0;
		/**
		 * エラーデータ存在チェック異常
		 */
		protected static final int ERROR_DATA_EXIST_ERROR = 2;
		/**
		 * 登録異常
		 */
		protected static final int RECEIVE_PLAN_REGISTER_FAILED = 3;
		/**
		 * 受信CD異常
		 */
		protected static final int RECEIVE_CD_ERROR = 9;
	}

	// ===== 使用ロジッククラス =====
	@Inject
	private ShippingPlanBulkInputRegisterLogic shippingPlanBulkInputRegisterLogic;
	@Inject
	private ShippingPlanBulkInputCheckStatusLogic shippingPlanBulkInputCheckStatusLogic;
	@Inject
	private ShippingPlanBulkInputSelectLogic shippingPlanBulkInputSelectLogic;

	@Override
	protected int execute() {
		Map<String, String> args = getKeyValueArgs();

		String receiveCd = args.get("receiveCd");
		String centerCd = args.get("centerCd");
		String clientCd = args.get("clientCd");

		if (CU.isNullOrEmpty(receiveCd)) {
			return StatusCode.RECEIVE_CD_ERROR;
		}

		// ログ書込開始
		shippingPlanBulkInputRegisterLogic.startLog(receiveCd, centerCd, clientCd);

		// エラーチェック
		shippingPlanBulkInputCheckStatusLogic.checkError(receiveCd, centerCd, clientCd, shippingPlanBulkInputRegisterLogic.getOutputLog());

		// エラーデータ検索実行
		// [#3780][Ver3.0] 出荷指示一括取込(ETL) - 金額関連項目での文字列チェック異常 2018.02.27 honma Mod Start
		List<EShippingInst> eShippingInstList = shippingPlanBulkInputSelectLogic.selectEShippingInstList(receiveCd, ShippingPlanBulkInputSelectLogic.SelectCls.ERROR_ONLY);
		// [#3780][Ver3.0] 出荷指示一括取込(ETL) - 金額関連項目での文字列チェック異常 2018.02.27 honma Mod End

		if (0 < eShippingInstList.size()) {
			// エラーデータ有
			shippingPlanBulkInputRegisterLogic.endFailureLog();
			return StatusCode.ERROR_DATA_EXIST_ERROR;
		}

		// データ登録
		shippingPlanBulkInputRegisterLogic.register(receiveCd, centerCd, clientCd, errRetSts(StatusCode.RECEIVE_PLAN_REGISTER_FAILED));
		if (0 < getErrorManager().size()) {
			shippingPlanBulkInputRegisterLogic.endFailureLog();
			return StatusCode.RECEIVE_PLAN_REGISTER_FAILED;
		}

		// ログ書込終了
		shippingPlanBulkInputRegisterLogic.endSuccessLog();

		return StatusCode.SUCCESS;
	}

}
