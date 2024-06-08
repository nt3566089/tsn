package com.oneslogi.ht.wms.logic.inventory;

import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.cbean.WHtInventoryInputProdCB;
import com.oneslogi.base.dbflute.exbhv.WHtInventoryInputProdBhv;
import com.oneslogi.base.dbflute.exentity.WHtInventoryInputProd;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 商品棚卸入力商品棚卸ワーク取得ロジッククラス
 */
public class InventoryInputProductWkSelectLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	/* 商品棚卸ワーク     */
	@Inject
	private WHtInventoryInputProdBhv wHtInventoryInputProductBhv;

	/**
	 * <h2>商品棚卸ワークのデータを取得する。</h2>
	 * <pre>
	 * 引数を条件に商品棚卸ワークからデータを検索し、
	 * 検索結果がある場合、商品棚卸ワークのデータを取得する。
	 *
	 * 検索対象が見つからない場合、０件エラーをエラーステータスに設定する。
	 * </pre>
	 * @param wHtInventoryInputProduct 商品棚卸ワーク：MACアドレス
	 * @return List<WHtInventoryInputProd> 商品棚卸ワークリスト
	 */
	public List<WHtInventoryInputProd> selectList(WHtInventoryInputProd wHtInventoryInputProduct) {
		//商品棚卸ワークテーブルのデータ取得
		WHtInventoryInputProdCB wHtInventoryInputProductCB = wHtInventoryInputProductBhv.newMyConditionBean();
		wHtInventoryInputProductCB.setupSelect_MProduct();
		wHtInventoryInputProductCB.setupSelect_TLot();
		wHtInventoryInputProductCB.setupSelect_MLocation();
		wHtInventoryInputProductCB.query().setMacAddress_Equal(wHtInventoryInputProduct.getMacAddress());

		wHtInventoryInputProductCB.query().addOrderBy_AddDt_Asc();

		List<WHtInventoryInputProd> lstWHtInventoryInputProduct = wHtInventoryInputProductBhv.selectList(wHtInventoryInputProductCB);

		if (lstWHtInventoryInputProduct.size() == 0) {
			//該当データが存在しません。
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_DATA_NOT_FOUND_ERROR);
			return lstWHtInventoryInputProduct;
		}

		return lstWHtInventoryInputProduct;
	}
}