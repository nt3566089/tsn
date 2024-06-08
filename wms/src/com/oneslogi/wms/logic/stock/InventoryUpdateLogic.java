package com.oneslogi.wms.logic.stock;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.exbhv.TInventoryBBhv;
import com.oneslogi.base.dbflute.exentity.TInventoryB;
import com.oneslogi.base.dbflute.exentity.TMoveInstH;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 棚卸データ更新登録ロジッククラス
 */
public class InventoryUpdateLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private TInventoryBBhv tInventoryBBhv;

//	/**
//	 * <h2>棚卸データ更新登録。</h2>
//	 * <pre>
//	 * 棚卸ボディデータに次の値を設定する。
//	 * ・在庫調整フラグ
//	 * ・在庫移動指示ヘッダID
//	 *
//	 * 【更新テーブル】
//	 * ・棚卸ボディ
//	 *
//	 *【パラメータの使用項目】
//	 *  (棚卸ボディ)
//	 *  ・棚卸ボディID : 必須
//	 * </pre>
//	 * @param tInventoryB 棚卸ボディ
//	 * @param tMoveInstH  在庫移動指示ヘッダ
//	 * @param errSts      エラー時に設定するエラーステータス
//	 * @return なし
//	 */
//	public void update(List<TInventoryB> tInventoryB,
//			                TMoveInstH tMoveInstH,
//			                ErrorStatus errSts) {
//
//		// ===== 棚卸データ更新 =====
//		// ===== 棚卸ボディリストのデータ件数分繰返 =====
//		for (TInventoryB body : tInventoryB) {
//			// ===== エンティティ編集(更新用データ編集) =====
//			body.setStockAdjustFlg_$1();
//			body.setMoveInstHId(tMoveInstH.getMoveInstHId());
//		}
//		// ===== 棚卸ボディの更新実行 =====
//		tInventoryBBhv.batchUpdate(tInventoryB);
//	}

	/**
	 * <h2>棚卸データ更新を行う。</h2>
	 * <pre>
	 * 棚卸ボディデータに下記項目を設定して更新を行う。
	 * ・在庫調整フラグ（"1：調整済"を設定）
	 * ・在庫移動指示ヘッダID
	 * </pre>
	 * @param tInventoryB 棚卸ボディ：全項目
	 * @param tMoveInstH  在庫移動指示ヘッダ：在庫移動指示ヘッダID
	 * @param errSts      エラー時に設定するエラーステータス
	 */
	public void update(TInventoryB tInventoryB,
		               TMoveInstH tMoveInstH,
		               ErrorStatus errSts) {

		// ===== 棚卸データ更新 =====

		// ===== エンティティ編集(更新用データ編集) =====
		tInventoryB.setStockAdjustFlg_$1();
		tInventoryB.setMoveInstHId(tMoveInstH.getMoveInstHId());

		// ===== 棚卸ボディの更新実行 =====
		tInventoryBBhv.update(tInventoryB);
	}

}
