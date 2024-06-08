package com.oneslogi.wms.logic.master;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.dbflute.exception.SQLFailureException;

import com.oneslogi.base.BaseMessageConst;
import com.oneslogi.base.dbflute.exbhv.MCarrierSlipSgwBhv;
import com.oneslogi.base.dbflute.exentity.MCarrierSlipSgw;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 佐川送り状マスタメンテナンス更新ロジッククラス
 */
public class CarrierSlipSgwMasterUpdateLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private MCarrierSlipSgwBhv mCarrierSlipSgwBhv;

	/**
	 * <h2>佐川送り状マスタデータを更新する。</h2>
	 * <pre>
	 *
	 * 削除フラグ＝1の場合、佐川送り状マスタのデータを削除し、
	 * それ以外の場合、佐川送り状マスタのデータを更新する。
	 * FK違反の場合、削除エラーをエラーステータスに設定する。
	 *  </pre>
	 * @param mCarrierSlipSgw 佐川送り状マスタ：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void update(MCarrierSlipSgw mCarrierSlipSgw, ErrorStatus errSts) {
		// 削除
		if (mCarrierSlipSgw.getDelFlg().equals("1")) {
			// ===== 佐川送り状マスタ削除実行 =====
			try {
				mCarrierSlipSgwBhv.delete(mCarrierSlipSgw);
			} catch (SQLFailureException e) {
				if (e.getSQLException() != null) {
					// データベースから削除したときのエラーがFK違反の場合
					getErrorManager().add(errSts, BaseMessageConst.DELETE_EXCEPTION_ERROR, e.getSQLException().getMessage());
				} else {
					throw e;
				}
			}
		} else {
			// ===== 佐川送り状マスタ更新実行 =====
			mCarrierSlipSgwBhv.update(mCarrierSlipSgw);
		}
	}

	/**
	 * <h2>佐川送り状マスタリストデータを一括削除、更新する。</h2>
	 * <pre>
	 *
	 * 佐川送り状マスタのデータを一括削除、更新する。
	 *
	 * </pre>
	 * @param mCarrierSlipSgwList 佐川送り状マスタリスト：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void batchUpdate(List<MCarrierSlipSgw> mCarrierSlipSgwList, ErrorStatus errSts) {

		List<MCarrierSlipSgw> deleteList = new ArrayList<>();

		List<MCarrierSlipSgw> updateList = new ArrayList<>();

		for (MCarrierSlipSgw mCarrierSlipSgw : mCarrierSlipSgwList) {
			// 削除
			if (mCarrierSlipSgw.getDelFlg().equals("1")) {
				deleteList.add(mCarrierSlipSgw);
				// ===== 佐川送り状マスタ削除実行 =====
//				try {
//					mCarrierSlipSgwBhv.delete(mCarrierSlipSgw);
//				} catch (SQLFailureException e) {
//					if (e.getSQLException() != null) {
//						// データベースから削除したときのエラーがFK違反の場合
//						getErrorManager().add(errSts, BaseMessageConst.DELETE_EXCEPTION_ERROR, e.getSQLException().getMessage());
//					} else {
//						throw e;
//					}
//				}
			} else {
				updateList.add(mCarrierSlipSgw);
				// ===== 佐川送り状マスタ更新実行 =====
//				mCarrierSlipSgwBhv.update(mCarrierSlipSgw);
			}
		}

		if (!deleteList.isEmpty()){
			// ===== 佐川送り状マスタ削除実行 =====
			mCarrierSlipSgwBhv.batchDelete(deleteList);
		}

		if (!updateList.isEmpty()){
			mCarrierSlipSgwBhv.batchUpdate(updateList);
		}
	}

}
