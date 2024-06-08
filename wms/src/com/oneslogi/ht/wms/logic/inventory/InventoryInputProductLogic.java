package com.oneslogi.ht.wms.logic.inventory;

import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.cbean.MStockTypeCB;
import com.oneslogi.base.dbflute.cbean.WHtInventoryInputProdCB;
import com.oneslogi.base.dbflute.exbhv.MStockTypeBhv;
import com.oneslogi.base.dbflute.exbhv.WHtInventoryInputProdBhv;
import com.oneslogi.base.dbflute.exentity.BUser;
import com.oneslogi.base.dbflute.exentity.MStockType;
import com.oneslogi.base.dbflute.exentity.WHtInventoryInputProd;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 商品棚卸入力共通ロジッククラス
 */
public class InventoryInputProductLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	/* 商品棚卸用一時テーブル         */
	@Inject
	private WHtInventoryInputProdBhv wHtInventoryInputProductBhv;
	/* 在庫区分マスタ     */
	@Inject
	private MStockTypeBhv mStockTypeBhv;

	/**
	 * <h2>商品棚卸ワークテーブルをクリアする。</h2>
	 * <pre>
	 * 引数のMACアドレスをキーに商品棚卸ワークデータを取得し、
	 * 取得したデータを商品棚卸ワークテーブルから削除する。
	 * </pre>
	 * @param wHtInventoryDto 商品棚卸ワーク：MACアドレス
	 */
	public void clearWHtInventory(WHtInventoryInputProd wHtInventoryDto) {
		//商品棚卸ワークテーブルの取得
		WHtInventoryInputProdCB wHtInventoryInputProductCB = wHtInventoryInputProductBhv.newMyConditionBean();
		wHtInventoryInputProductCB.query().setMacAddress_Equal(wHtInventoryDto.getMacAddress());

		List<WHtInventoryInputProd> lstWHtInventoryInputProd = wHtInventoryInputProductBhv.selectList(wHtInventoryInputProductCB);

		//商品棚卸ワークテーブルのクリア
		wHtInventoryInputProductBhv.batchDelete(lstWHtInventoryInputProd);
	}

	/**
	 * <h2>在庫区分を取得する。</h2>
	 * <pre>
	 * 引数を条件に在庫区分データを取得する。
	 *
	 * 検索結果が複数件存在する場合、１件目を返却する。
	 * 検索対象が見つからない場合、NULLを返す。
	 * </pre>
	 * @param bUser ユーザマスタ：カルチャID
	 * @param mStockType 在庫区分マスタ：在庫区分CD
	 * @return MStockType 在庫区分マスタ
	 */
	public MStockType getStockTypeNm(BUser bUser, MStockType mStockType) {
		//在庫区分マスタテーブルのデータ取得
		MStockTypeCB mStockTypeCB = mStockTypeBhv.newMyConditionBean();
		mStockTypeCB.setupSelect_VDict(bUser.getCultureId());
		mStockTypeCB.query().setStockTypeCd_Equal(mStockType.getStockTypeCd());

		List<MStockType> lstMStockType = mStockTypeBhv.selectList(mStockTypeCB);

		if (lstMStockType.size() != 0) {
			return lstMStockType.get(0);
		}else{
			return null;
		}
	}
}