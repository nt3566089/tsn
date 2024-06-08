package com.oneslogi.wms.batch.master;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.exentity.ELocation;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.batch.AbstractWmsBatch;
import com.oneslogi.wms.dto.master.LocationMasterBulkInputDto;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.master.LocationMasterBulkInputSelectLogic;

/**
 * ロケーションマスタ一括取込バッチクラス
 */
//[バグ #14][バッチ処理でログインユーザの情報が参照できない] 2016.10.3 inoue Start
//基底クラスを変更。
//public class LocationMasterBulkInputBatch extends AbstractBatch {
public class LocationMasterBulkInputBatch extends AbstractWmsBatch {
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
		protected static final int LOCATION_MASTER_REGISTER_FAILED = 3;
		/**
		 * 荷主CD異常
		 */
		protected static final int CLIENT_CD_ERROR = 4;
		/**
		 * 受信CD異常
		 */
		protected static final int RECEIVE_CD_ERROR = 9;
	}

	@Inject
	private LocationMasterBulkInputSelectLogic locationMasterBulkInputLogic;
	@Inject
	private ClientLogic clientLogic;

	/**
	 * <h2>ロケーションマスタ受信テーブルからデータを選択し、ロケーションマスタテーブルに登録/更新する。</h2>
	 * <pre>
	 * 引数の検索条件にデータベースからデータを取得する。
	 * 取得したデータに対し、エラーチェックを行う。
	 * ロケーションマスタテーブルに登録/更新する。
	 * </pre>
	 * @return int ステータスコード
	 */
	@Override
	protected int execute() {
		Map<String, String> args = getKeyValueArgs();

		String receiveCd = args.get("receiveCd");
		String clientCd = args.get("clientCd");
		String centerCd = args.get("centerCd");

		LocationMasterBulkInputDto locationMasterBulkInputDto  = new LocationMasterBulkInputDto();
		locationMasterBulkInputDto.data.receiveCd = receiveCd;
		locationMasterBulkInputDto.data.head.setClientCd(clientCd);
		locationMasterBulkInputDto.data.head.setCenterCd(centerCd);

		if (CU.isNullOrEmpty(receiveCd)) {

			return StatusCode.RECEIVE_CD_ERROR;
		}

		// 荷主ID設定
		MClient clientC = new MClient();
		clientC.setClientCd(clientCd);
		MClient client = clientLogic.getUkEntity(clientC);

		if (client == null) {
			return StatusCode.CLIENT_CD_ERROR;
		}
		locationMasterBulkInputDto.data.head.setClientId(client.getClientId());

		// ログ書込開始
		// [#491][2.1.0-CT-084] EDI受信ログが出力されるように修正 2016.12.19 honma Mod Start
		locationMasterBulkInputLogic.startLog(receiveCd, centerCd, clientCd);
		// [#491][2.1.0-CT-084] EDI受信ログが出力されるように修正 2016.12.19 honma Mod End

		// エラーチェック
		locationMasterBulkInputLogic.checkError(locationMasterBulkInputDto);

		// エラーデータ検索実行
		// [#3780][Ver3.0] 出荷指示一括取込(ETL) - 金額関連項目での文字列チェック異常 2018.02.27 honma Mod Start
		List<ELocation> eLocationList = locationMasterBulkInputLogic.selectELocationList(receiveCd, LocationMasterBulkInputSelectLogic.SelectCls.ERROR_ONLY);
		// [#3780][Ver3.0] 出荷指示一括取込(ETL) - 金額関連項目での文字列チェック異常 2018.02.27 honma Mod End

		if (0 < eLocationList.size()) {
			// エラーデータ有
			locationMasterBulkInputLogic.endFailureLog();
			return StatusCode.ERROR_DATA_EXIST_ERROR;
		}

		// データ登録
		locationMasterBulkInputLogic.register(locationMasterBulkInputDto, errRetSts(StatusCode.LOCATION_MASTER_REGISTER_FAILED));
		if (0 < getErrorManager().size()) {
			locationMasterBulkInputLogic.endFailureLog();
			return StatusCode.LOCATION_MASTER_REGISTER_FAILED;
		}

		// ログ書込終了
		locationMasterBulkInputLogic.endSuccessLog();

		return StatusCode.SUCCESS;
	}

}
