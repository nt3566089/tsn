package com.oneslogi.wms.logic.common;

import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MWarehouse;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 倉庫マスタ共通ロジッククラス
 */
public class WarehouseMasterCheckLogic extends AbstractWmsLogic {

	/**
	 * ステータスコード定義
	 */
	protected static class StatusCode {
		/**
		 * 正常終了
		 */
		protected static final int SUCCESS = 0;
		/**
		 * ユーザによる確認
		 */
		protected static final int CONFIRMATION = 1;
		/**
		 * 倉庫CDで重複エラー
		 */
		protected static final int WAREHOUSE_CODE_DUPLICATE = 2;
		// [SK2-071] 倉庫マスタに既存の倉庫削除後、倉庫マスタに紐づくゾーンを削除不可ため、追加 2014.12.17 許 Start
		/**
		 *ゾーンマスタに登録済
		 */
		protected static final int ZONE_EXIST = 3;
		// [SK2-071] 倉庫マスタに既存の倉庫削除後、倉庫マスタに紐づくゾーンを削除不可ため、追加 2014.12.17 許 End
		// [#5705][v3.1] 入荷・出荷データが存在する場合は削除不可に変更 2018.12.06 kawana Start
		/**
		 * トランザクションデータ存在エラー
		 */
		protected static final int TRAN_DATA_FOUND_ERROR = 4;
		// [#5705][v3.1] 入荷・出荷データが存在する場合は削除不可に変更 2018.12.06 kawana End
	}

	// ===== 使用ロジッククラス =====
	@Inject
	private CenterLogic centerLogic;
	@Inject
	private WarehouseLogic warehouseLogic;
	// [#5705][v3.1] 入荷・出荷データが存在する場合は削除不可に変更 2018.12.06 kawana Start
	@Inject
	private TransactionDataCheckLogic transactionDataCheckLogic;
	// [#5705][v3.1] 入荷・出荷データが存在する場合は削除不可に変更 2018.12.06 kawana End

	/**
	 * <h2>倉庫マスタのチェック処理を行う。</h2>
	 * <pre>
	 * 引数を条件にセンタマスタ、倉庫マスタで検索し、下記のチェックを行う。
	 * ・センタCD存在チェック。
	 * ・倉庫CD重複チェック。
	 * ・倉庫に紐つくゾーンマスタに登録済チェック。
	 * エラーの場合、エラー情報として管理する。
	 * </pre>
	 * @param mWarehouseList 倉庫マスタリスト：センタCD・倉庫ID・削除フラグ
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void checkWarehouseMaster(List<MWarehouse> mWarehouseList, ErrorStatus errSts) {
		int rowIndex = -1;

		// チェック処理
		for (MWarehouse mWarehouse : mWarehouseList) {
			rowIndex++;

			// センタCD存在チェック
			MCenter mCenter = new MCenter();
			mCenter.setCenterCd(mWarehouse.getMCenter().getCenterCd());
			mCenter = centerLogic.getUkEntity(mCenter);

			if (mCenter == null) {
				this.getErrorManager().add(errSts, WmsMessageConst.CENTER_NOT_FOUND_ERROR);
				return;
			} else {
				mWarehouse.setCenterId(mCenter.getCenterId());
			}

			// 倉庫CD重複チェック
			if (mWarehouse.getWarehouseId() == null) {
				// 登録の場合
				warehouseLogic.checkWarehouseCdInsert(mWarehouse, errRetSts(errSts,StatusCode.WAREHOUSE_CODE_DUPLICATE, rowIndex));
			} else {
				// 修正の場合
				warehouseLogic.checkWarehouseCdUpdate(mWarehouse, errRetSts(errSts,StatusCode.WAREHOUSE_CODE_DUPLICATE, rowIndex));
				// [SK2-071] 倉庫マスタ削除時、紐付くゾーンマスタが存在チェックを追加 2014.12.17 許 Start
				// 倉庫に紐つくゾーンマスタに登録済チェック
				if (mWarehouse.getDelFlg().equals("1")) {
					warehouseLogic.checkZoneExist(mWarehouse, errRetSts(errRetSts(StatusCode.ZONE_EXIST),StatusCode.ZONE_EXIST, rowIndex));

					// [#5705][v3.1] 入荷・出荷データが存在する場合は削除不可に変更 2018.12.06 kawana Start
					if (transactionDataCheckLogic.existTran(mWarehouse)) {
						// トランザクション存在チェック
						getErrorManager().add(errRetSts(StatusCode.TRAN_DATA_FOUND_ERROR), WmsMessageConst.TRANSACTION_DATA_FOUND_ERROR);
					}
					// [#5705][v3.1] 入荷・出荷データが存在する場合は削除不可に変更 2018.12.06 kawana End
				 }
				// [SK2-071] 倉庫マスタ削除時、紐付くゾーンマスタが存在チェックを追加 2014.12.17 許 End
			}
		}

	}
}
