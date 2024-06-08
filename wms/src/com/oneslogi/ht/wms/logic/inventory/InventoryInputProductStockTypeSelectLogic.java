package com.oneslogi.ht.wms.logic.inventory;

import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.cbean.MStockTypeCB;
import com.oneslogi.base.dbflute.exbhv.MStockTypeBhv;
import com.oneslogi.base.dbflute.exentity.BUser;
import com.oneslogi.base.dbflute.exentity.MStockType;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 商品棚卸入力在庫区分取得ロジッククラス
 */
public class InventoryInputProductStockTypeSelectLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	/* 在庫区分マスタ     */
	@Inject
	private MStockTypeBhv mStockTypeBhv;

	/**
	 * <h2>在庫区分マスタデータを取得する。</h2>
	 * <pre>
	 * 引数を条件に在庫区分マスタからデータを検索し、
	 * 検索結果がある場合、在庫区分マスタのデータを返却する。
	 *
	 * 検索対象が見つからない場合、０件エラーをエラーステータスに設定する。
	 * </pre>
	 * @param bUser ユーザーマスタ：カルチャID
	 * @return List<MStockType> 在庫区分マスタリスト
	 */
	public List<MStockType> selectList(BUser bUser) {
		//在庫区分マスタテーブルのデータ取得
		MStockTypeCB mStockTypeCB = mStockTypeBhv.newMyConditionBean();
		mStockTypeCB.setupSelect_VDict(bUser.getCultureId());

		mStockTypeCB.query().addOrderBy_StockTypeCd_Asc();

		List<MStockType> lstMStockType = mStockTypeBhv.selectList(mStockTypeCB);

		if (lstMStockType.size() == 0) {
			//該当データが存在しません。
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_DATA_NOT_FOUND_ERROR);
			return lstMStockType;
		}

		return lstMStockType;
	}
}