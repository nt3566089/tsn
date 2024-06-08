package com.oneslogi.wms.batch.receive;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.exentity.EReceivePlan;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.batch.AbstractWmsBatch;
import com.oneslogi.wms.logic.receive.ReceivePlanBulkInputSelectLogic;

//[バグ #14][バッチ処理でログインユーザの情報が参照できない] 2016.10.3 inoue Start
//基底クラスを変更。
//public class ReceivePlanBulkInputBatch extends AbstractBatch {
public class ReceivePlanBulkInputBatch extends AbstractWmsBatch {
//[バグ #14][バッチ処理でログインユーザの情報が参照できない] 2016.10.3 inoue End

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

	@Inject
	private ReceivePlanBulkInputSelectLogic bulkInputSelectLogic;

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
		bulkInputSelectLogic.startLog(receiveCd, centerCd, clientCd);

		// エラーチェック
		bulkInputSelectLogic.checkError(receiveCd, centerCd, clientCd);

		// エラーデータ検索実行
		// [#3780][Ver3.0] 出荷指示一括取込(ETL) - 金額関連項目での文字列チェック異常 2018.02.27 honma Mod Start
		List<EReceivePlan> eReceivePlanList = bulkInputSelectLogic.selectEReceivePlanList(receiveCd, ReceivePlanBulkInputSelectLogic.SelectCls.ERROR_ONLY);
		// [#3780][Ver3.0] 出荷指示一括取込(ETL) - 金額関連項目での文字列チェック異常 2018.02.27 honma Mod End

		if (0 < eReceivePlanList.size()) {
			// エラーデータ有
			bulkInputSelectLogic.endFailureLog();
			return StatusCode.ERROR_DATA_EXIST_ERROR;
		}

		// データ登録
		bulkInputSelectLogic.register(receiveCd, centerCd, clientCd, errRetSts(StatusCode.RECEIVE_PLAN_REGISTER_FAILED));
		if (0 < getErrorManager().size()) {
			bulkInputSelectLogic.endFailureLog();
			return StatusCode.RECEIVE_PLAN_REGISTER_FAILED;
		}

		// ログ書込終了
		bulkInputSelectLogic.endSuccessLog();

		return StatusCode.SUCCESS;
	}

}
