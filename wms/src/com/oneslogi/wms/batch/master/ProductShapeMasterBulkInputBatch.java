package com.oneslogi.wms.batch.master;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.exentity.EProductShape;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.batch.AbstractWmsBatch;
import com.oneslogi.wms.dto.master.ProductShapeMasterBulkInputDto;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.master.ProductShapeMasterBulkInputLogic;

/**
 * 商品荷姿マスタ一括取込データ取得バッチクラス
 */
//[バグ #14][バッチ処理でログインユーザの情報が参照できない] 2016.10.3 inoue Start
// 基底クラスを変更。
//public class ProductShapeMasterBulkInputBatch extends AbstractBatch {
public class ProductShapeMasterBulkInputBatch extends AbstractWmsBatch {
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
		protected static final int PRODUCT_MASTER_REGISTER_FAILED = 3;
		/**
		 * 受信CD異常
		 */
		protected static final int RECEIVE_CD_ERROR = 9;
	}

	// ===== 使用ロジッククラス =====
	@Inject
	private ProductShapeMasterBulkInputLogic productShapeMasterBulkInputLogic;

	@Inject
	private ClientLogic clientLogic;

	@Override
	protected int execute() {
		Map<String, String> args = getKeyValueArgs();

		String receiveCd = args.get("receiveCd");
		String clientCd = args.get("clientCd");

		if (CU.isNullOrEmpty(receiveCd)) {
			return StatusCode.RECEIVE_CD_ERROR;
		}

		// ログ書込開始
		productShapeMasterBulkInputLogic.startLog(receiveCd, clientCd);

		// 荷主ID取得
		MClient mClient = new MClient();
		mClient.setClientCd(clientCd);
		mClient = clientLogic.getUkEntity(mClient);

		ProductShapeMasterBulkInputDto productMasterBulkInputDto = new ProductShapeMasterBulkInputDto();
		productMasterBulkInputDto.data.receiveCd = receiveCd;
		productMasterBulkInputDto.data.head.getMClient().setClientCd(clientCd);

		// [Ver3.0] unit of measure対応 2017.12.14 NING Del

		// [Ver3.0] unit of measure対応 2017.12.14 NING Start
		// エラーチェック
		productShapeMasterBulkInputLogic.checkError(receiveCd, mClient);

		// エラーデータ検索実行
		// [#3780][Ver3.0] 出荷指示一括取込(ETL) - 金額関連項目での文字列チェック異常 2018.02.27 honma Mod Start
		List<EProductShape> eProductShapeList = productShapeMasterBulkInputLogic.selectEProductShapeList(receiveCd, ProductShapeMasterBulkInputLogic.SelectCls.ERROR_ONLY);
		// [#3780][Ver3.0] 出荷指示一括取込(ETL) - 金額関連項目での文字列チェック異常 2018.02.27 honma Mod End
		// [Ver3.0] unit of measure対応 2017.12.14 NING End

		if (0 < eProductShapeList.size()) {
			// エラーデータ有
			productShapeMasterBulkInputLogic.endFailureLog();
			return StatusCode.ERROR_DATA_EXIST_ERROR;
		}

		// データ登録
		productShapeMasterBulkInputLogic.register(productMasterBulkInputDto, errRetSts(StatusCode.PRODUCT_MASTER_REGISTER_FAILED));
		if (0 < getErrorManager().size()) {
			productShapeMasterBulkInputLogic.endFailureLog();
			return StatusCode.PRODUCT_MASTER_REGISTER_FAILED;
		}

		// ログ書込終了
		productShapeMasterBulkInputLogic.endSuccessLog();

		return StatusCode.SUCCESS;
	}

}
