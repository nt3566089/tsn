package com.oneslogi.wms.batch.master;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.exentity.EZip;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.batch.AbstractWmsBatch;
import com.oneslogi.wms.dto.master.ZipMasterBulkInputDto;
import com.oneslogi.wms.logic.common.CenterClassLogic;
import com.oneslogi.wms.logic.master.ZipMasterBulkInputLogic;

/**
 * 郵便番号マスタ一括取込バッチクラス
 */
//基底クラスを変更。
public class ZipMasterBulkInputBatch extends AbstractWmsBatch {

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
		protected static final int ERROR_DATA_EXIST_ERROR = 1;
		/**
		 * 登録異常
		 */
		protected static final int ZIP_MASTER_REGISTER_FAILED = 2;
		/**
		 * 受信CD異常
		 */
		protected static final int RECEIVE_CD_ERROR = 3;
	}

	@Inject
	private ZipMasterBulkInputLogic zipMasterBulkInputLogic;

	@Inject
	private CenterClassLogic centerClassLogic;

	/**
	 * <h2>郵便番号マスタ受信テーブルからデータを選択し、郵便番号マスタテーブルに登録/更新する。</h2>
	 * <pre>
	 * 引数の検索条件にデータベースからデータを取得する。
	 * 取得したデータに対し、エラーチェックを行う。
	 * 郵便番号マスタテーブルに登録/更新する。
	 * </pre>
	 * @return int ステータスコード
	 */
	@Override
	protected int execute() {
		Map<String, String> args = getKeyValueArgs();

		String receiveCd = args.get("receiveCd");
		String uploadZipType = args.get("uploadZipType");

		ZipMasterBulkInputDto zipMasterBulkInputDto = new ZipMasterBulkInputDto();
		zipMasterBulkInputDto.data.receiveCd = receiveCd;

		// 大口事業所フラグ
		Map<String, String> companyFlgMap = centerClassLogic.getClassMapByCd("COMPANY_FLG");
		if (companyFlgMap.containsKey(uploadZipType)) {
			uploadZipType = uploadZipType + "-" + companyFlgMap.get(uploadZipType);
		}

		if (CU.isNullOrEmpty(receiveCd)) {

			return StatusCode.RECEIVE_CD_ERROR;
		}

		// ログ書込開始
		zipMasterBulkInputLogic.startLog(receiveCd, uploadZipType);

		// エラーチェック
		zipMasterBulkInputLogic.checkError(zipMasterBulkInputDto);

		// エラーデータ検索実行
		List<EZip> eZipList = zipMasterBulkInputLogic.selectEZipList(receiveCd, ZipMasterBulkInputLogic.SelectCls.ERROR_ONLY);

		if (0 < eZipList.size()) {
			// エラーデータ有
			zipMasterBulkInputLogic.endFailureLog();
			return StatusCode.ERROR_DATA_EXIST_ERROR;
		}

		// データ登録
		zipMasterBulkInputLogic.register(zipMasterBulkInputDto, errRetSts(StatusCode.ZIP_MASTER_REGISTER_FAILED));
		if (0 < getErrorManager().size()) {
			zipMasterBulkInputLogic.endFailureLog();
			return StatusCode.ZIP_MASTER_REGISTER_FAILED;
		}

		// ログ書込終了
		zipMasterBulkInputLogic.endSuccessLog();

		return StatusCode.SUCCESS;
	}

}
