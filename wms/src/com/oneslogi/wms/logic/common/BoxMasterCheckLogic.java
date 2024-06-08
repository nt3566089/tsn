package com.oneslogi.wms.logic.common;

import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.cbean.MBoxGrpDtlCB;
import com.oneslogi.base.dbflute.exbhv.MBoxGrpDtlBhv;
import com.oneslogi.base.dbflute.exentity.MBox;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 荷材マスタチェック共通ロジッククラス
 */
public class BoxMasterCheckLogic extends AbstractWmsLogic {
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
		 * 荷材コードで重複異常
		 */
		protected static final int BOX_CODE_DUPLICATE = 5;
	}

	// [新ｿﾘV2-001] 削除する場合に荷材グループマスタに登録されていないことのチェックを追加 2016.07.06 kawana Start
	// ===== 使用テーブル =====
	@Inject
	private MBoxGrpDtlBhv mBoxGrpDtlBhv;
	// [新ｿﾘV2-001] 削除する場合に荷材グループマスタに登録されていないことのチェックを追加 2016.07.06 kawana End

	// ===== 使用ロジッククラス =====
	@Inject
	private BoxLogic boxLogic;
	// [#5705][v3.1] 出荷データが存在する場合は削除不可に変更 2018.12.06 kawana Start
	@Inject
	private TransactionDataCheckLogic transactionDataCheckLogic;
	// [#5705][v3.1] 出荷データが存在する場合は削除不可に変更 2018.12.06 kawana End

	/**
	 * <h2>荷材マスタのチェック処理を行う。</h2>
	 * <pre>
	 * 荷材CDの重複チェックを行う。
	 * データが重複する場合、荷材コードで重複異常をステータスコードに設定する。
	 * </pre>
	 * @param mBoxList 荷材マスタリスト：センタID・荷材CD
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void checkBoxMaster(List<MBox> mBoxList, ErrorStatus errSts) {
		int rowIndex = -1;

		// チェック処理
		for (MBox mBox : mBoxList) {
			rowIndex++;

			// [新ｿﾘV2-001] 削除する場合に荷材グループマスタに登録されていないことのチェックを追加 2016.07.06 kawana Start

			if (mBox.getBoxId() == null) {
				// 登録の場合

				// 荷材CD重複チェック
				boxLogic.checkBoxCdInsert(mBox, errRetSts(errSts, StatusCode.BOX_CODE_DUPLICATE, rowIndex));
				if (0 < getErrorManager().size()) {
					return;
				}
			} else {
				// 修正の場合

				// 荷材CD重複チェック
				boxLogic.checkBoxCdUpdate(mBox, errRetSts(errSts, StatusCode.BOX_CODE_DUPLICATE, rowIndex));
				if (0 < getErrorManager().size()) {
					return;
				}

				if (mBox.isDelFlg$1()) {
					// 削除

					// 荷材グループ使用チェック
					if (useBoxGrp(mBox.getBoxId())) {
						// 使用中

						getErrorManager().add(errRetSts(errSts, rowIndex), WmsMessageConst.BOX_CANNOT_DELETE_USE_BOX_GRP_ERROR, mBox.getBoxCd());
						return;
					}

					// [#5705][v3.1] 出荷データが存在する場合は削除不可に変更 2018.12.06 kawana Start
					// トランザクション存在チェック
					if (transactionDataCheckLogic.existTran(mBox)) {
						getErrorManager().add(errRetSts(errSts, rowIndex), WmsMessageConst.TRANSACTION_DATA_FOUND_ERROR);
						return;
					}
					// [#5705][v3.1] 出荷データが存在する場合は削除不可に変更 2018.12.06 kawana End
				}
			}

			// [新ｿﾘV2-001] 削除する場合に荷材グループマスタに登録されていないことのチェックを追加 2016.07.06 kawana End
		}
	}

	// [新ｿﾘV2-001] 削除する場合に荷材グループマスタに登録されていないことのチェックを追加 2016.07.06 kawana Start

	/**
	 * 荷材グループでの使用有無をチェック
	 * @param boxId 荷材ID
	 * @return true : 使用中
	 */
	private boolean useBoxGrp(long boxId) {

		MBoxGrpDtlCB cb = mBoxGrpDtlBhv.newConditionBean();
		cb.checkInvalidQuery();
		cb.query().setBoxId_Equal(boxId);

		int count = mBoxGrpDtlBhv.selectCount(cb);
		if (0 < count) {
			return true;
		} else {
			return false;
		}
	}

	// [新ｿﾘV2-001] 削除する場合に荷材グループマスタに登録されていないことのチェックを追加 2016.07.06 kawana End
}
