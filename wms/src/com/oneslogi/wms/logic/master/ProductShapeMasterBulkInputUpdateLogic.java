package com.oneslogi.wms.logic.master;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.exbhv.MProductShapeBhv;
import com.oneslogi.base.dbflute.exentity.MProductShape;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 商品荷姿マスタデータの更新ロジッククラス
 */
public class ProductShapeMasterBulkInputUpdateLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private MProductShapeBhv mProductShapeBhv;

	/**
	 * <h2>商品荷姿マスタデータの更新処理を行う。</h2>
	 * <pre>
	 * 引数で受け取った商品荷姿マスタデータを更新する。
	 * </pre>
	 * @param mProductShape 商品荷姿マスタ：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void update(MProductShape mProductShape, ErrorStatus errSts) {

		// ===== 商品荷姿マスタ更新実行 =====
		mProductShapeBhv.update(mProductShape);
	}
}