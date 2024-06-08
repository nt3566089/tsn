package com.oneslogi.wms.logic.master;

import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.exbhv.MProductShapeBhv;
import com.oneslogi.base.dbflute.exentity.MProductShape;

/**
 * 商品荷姿マスタデータの削除ロジッククラス
 */
public class ProductShapeMasterBulkInputDeleteLogic {

	// ===== 使用テーブル =====
	@Inject
	private MProductShapeBhv mProductShapeBhv;

	/**
	 * <h2>商品荷姿マスタデータを一括更新する。</h2>
	 * <pre>
	 *
	 * 商品荷姿マスタを一括更新する。
	 * </pre>
	 * @param mProductShapeList 商品荷姿マスタリスト：全項目
	 */
	public void batchDelete(List<MProductShape> mProductShapeList) {
		// ===== 商品荷姿マスタ削除実行 =====
		mProductShapeBhv.batchDelete(mProductShapeList);
	}
}
