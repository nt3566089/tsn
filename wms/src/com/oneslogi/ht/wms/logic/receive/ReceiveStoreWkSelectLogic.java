package com.oneslogi.ht.wms.logic.receive;

import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.cbean.WHtReceiveStoreCB;
import com.oneslogi.base.dbflute.exbhv.WHtReceiveStoreBhv;
import com.oneslogi.base.dbflute.exentity.WHtReceiveStore;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 入庫格納ワーク取得ロジッククラス
 */
public class ReceiveStoreWkSelectLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
		/* 入庫格納ワーク     */
		@Inject
		private WHtReceiveStoreBhv wHtReceiveStoreBhv;

	/**
	 * <h2>入庫格納ワークデータを取得する。</h2>
	 * <pre>
	 * 引数を条件に入庫格納ワークからデータを取得する。
	 * パラメータマスタと商品荷姿マスタからケース荷姿入数を取得し、入庫格納ワークデータに設定する。
	 *
	 * 検索対象が見つからない場合、０件エラーをエラーステータスに設定する。
	 * </pre>
	 * @param wHtReceiveStore 入庫格納ワーク：荷主ID・センタID・入庫格納ワークID・MACアドレス
	 * @return List<WHtReceiveStore> 入庫格納ワークリスト
	 */
		public List<WHtReceiveStore> selectList(WHtReceiveStore wHtReceiveStore) {
			//入庫格納ワークテーブルのデータ取得
			WHtReceiveStoreCB wHtReceiveStoreCB = wHtReceiveStoreBhv.newMyConditionBean();
			wHtReceiveStoreCB.setupSelect_MProduct();
			wHtReceiveStoreCB.setupSelect_TLot();
			wHtReceiveStoreCB.setupSelect_MLocation();
			wHtReceiveStoreCB.query().setCenterId_Equal(wHtReceiveStore.getCenterId());
			wHtReceiveStoreCB.query().setClientId_Equal(wHtReceiveStore.getClientId());
			wHtReceiveStoreCB.query().setHtReceiveStoreId_Equal(wHtReceiveStore.getHtReceiveStoreId());
			wHtReceiveStoreCB.query().setMacAddress_Equal(wHtReceiveStore.getMacAddress());
//[C-CWMS-0049]ケース入数表示をケース荷姿の入数に修正 2016/1/13 chou 削除 Start
/*
			// 商品荷姿．入数
			wHtReceiveStoreCB.specify().specifyMProduct().derivedMProductShapeList().max(new SubQuery<MProductShapeCB>(){
				@Override
				public void query(MProductShapeCB SubCB) {
					SubCB.specify().columnUnitNum();
					setDelFlg(SubCB);
				}
			}, WHtReceiveStore.SHAPE_UnitNum);
*/
//[C-CWMS-0049]ケース入数表示をケース荷姿の入数に修正 2016/1/13 chou 削除 End

			List<WHtReceiveStore> lstWHtReceiveStore = wHtReceiveStoreBhv.selectList(wHtReceiveStoreCB);

			if (lstWHtReceiveStore.size() == 0) {
				//該当データが存在しません。
				getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_DATA_NOT_FOUND_ERROR);
				return lstWHtReceiveStore;
			}
			// [Ver3.0] unit of measure対応 2017.11.27 王 Del
			return lstWHtReceiveStore;

		}

}
