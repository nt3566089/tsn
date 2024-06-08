package com.oneslogi.wms.batch.master;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.exentity.ECustomer;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.batch.AbstractWmsBatch;
import com.oneslogi.wms.logic.master.CustomerMasterBulkInputLogic;

//[バグ #14][バッチ処理でログインユーザの情報が参照できない] 2016.10.3 inoue Start
//基底クラスを変更。
//public class CustomerMasterBulkInputBatch extends AbstractBatch {
public class CustomerMasterBulkInputBatch extends AbstractWmsBatch {
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
		protected static final int CUSTOMER_MASTER_REGISTER_FAILED = 3;
		/**
		 * 受信CD異常
		 */
		protected static final int RECEIVE_CD_ERROR = 9;
	}

	@Inject
	private CustomerMasterBulkInputLogic customerMasterBulkInputLogic;

	@Override
	protected int execute() {
		Map<String, String> args = getKeyValueArgs();

		String receiveCd = args.get("receiveCd");
		String clientCd = args.get("clientCd");

		if (CU.isNullOrEmpty(receiveCd)) {

			return StatusCode.RECEIVE_CD_ERROR;
		}

		// ログ書込開始
		customerMasterBulkInputLogic.startLog(receiveCd, clientCd);

		// エラーチェック
		customerMasterBulkInputLogic.checkError(receiveCd);

		// エラーデータ検索実行
		// [#3780][Ver3.0] 出荷指示一括取込(ETL) - 金額関連項目での文字列チェック異常 2018.02.27 honma Mod Start
		List<ECustomer> eCustomerList = customerMasterBulkInputLogic.selectECustomerList(receiveCd, CustomerMasterBulkInputLogic.SelectCls.ERROR_ONLY);
		// [#3780][Ver3.0] 出荷指示一括取込(ETL) - 金額関連項目での文字列チェック異常 2018.02.27 honma Mod End

		if (0 < eCustomerList.size()) {
			// エラーデータ有
			customerMasterBulkInputLogic.endFailureLog();
			return StatusCode.ERROR_DATA_EXIST_ERROR;
		}

		// データ登録
		customerMasterBulkInputLogic.register(receiveCd, errRetSts(StatusCode.CUSTOMER_MASTER_REGISTER_FAILED));
		if (0 < getErrorManager().size()) {
			customerMasterBulkInputLogic.endFailureLog();
			return StatusCode.CUSTOMER_MASTER_REGISTER_FAILED;
		}

		// ログ書込終了
		customerMasterBulkInputLogic.endSuccessLog();

		return StatusCode.SUCCESS;
	}

}
