package com.oneslogi.wms.logic.master;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.cbean.MProductShapeCB;
import com.oneslogi.base.dbflute.exbhv.MProductShapeBhv;
import com.oneslogi.base.dbflute.exentity.MProductShape;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 商品荷姿マスタデータの登録ロジッククラス
 */
public class ProductShapeMasterInsertLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private MProductShapeBhv mProductShapeBhv;

	/**
	 * <h2>商品荷姿マスタデータの登録処理を行う。</h2>
	 * <pre>
	 * 引数で受け取ったデータを商品荷姿マスタに登録する。
	 * データが存在した場合、既に登録済エラーをエラーステータスに設定する。
	 * </pre>
	 * @param mProductShape 商品荷姿マスタ：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void insert(MProductShape mProductShape, ErrorStatus errSts) {

		//検索条件の設定
		MProductShape result = null;
		MProductShapeCB cb = mProductShapeBhv.newMyConditionBean();

		// [Ver3.0] unit of measure対応 2017.12.21 NING Del
		// [Ver3.0] unit of measure対応 2017.12.21 NING Start
		//荷姿グループ明細IDの設定
		cb.query().setShapeGrpDtlId_Equal(mProductShape.getShapeGrpDtlId());
		// [Ver3.0] unit of measure対応 2017.12.21 NING End

		//商品IDの設定
		cb.query().setProductId_Equal(mProductShape.getProductId());

		result = mProductShapeBhv.selectEntity(cb);

		if (result == null) {
			//存在なかった場合
			// ===== 商品荷姿マスタ登録実行 =====
			mProductShapeBhv.insert(mProductShape);
		} else {
			//存在した場合
				this.getErrorManager().add(errSts, WmsMessageConst.ALREADY_REGISTERED_CANNOT_REGISTER_ERROR);
				return;
		}

	}
}
