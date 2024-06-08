package com.oneslogi.ht.wms.logic.receive;

import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.cbean.WHtReceiveStoreCB;
import com.oneslogi.base.dbflute.exbhv.WHtReceiveStoreBhv;
import com.oneslogi.base.dbflute.exentity.WHtReceiveStore;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 入庫格納ワーク削除ロジッククラス
 */
public class ReceiveStoreWkDeleteLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private WHtReceiveStoreBhv wHtReceiveStoreBhv;

	/**
	 * <h2>入庫格納ワークデータを削除する。</h2>
	 * <pre>
	 * 引数の条件で入庫格納ワークデータを取得し、
	 * 該当入庫格納ワークデータを削除する。
	 * </pre>
	 * @param wHtReceiveStore 入庫格納ワーク：荷主ID・センタID・入庫格納ワークID・MACアドレス
	 */
	public void clearWHtReceiveStoreWorkNo(WHtReceiveStore wHtReceiveStore) {
		//入庫格納ワークテーブルの取得
		WHtReceiveStoreCB wHtReceiveStoreCB = wHtReceiveStoreBhv.newMyConditionBean();
		wHtReceiveStoreCB.query().setCenterId_Equal(wHtReceiveStore.getCenterId());
		wHtReceiveStoreCB.query().setClientId_Equal(wHtReceiveStore.getClientId());
		wHtReceiveStoreCB.query().setHtReceiveStoreId_Equal(wHtReceiveStore.getHtReceiveStoreId());
		wHtReceiveStoreCB.query().setMacAddress_Equal(wHtReceiveStore.getMacAddress());

		List<WHtReceiveStore> lstWHtReceiveStore = wHtReceiveStoreBhv.selectList(wHtReceiveStoreCB);

		//入庫格納ワークテーブルのクリア
		wHtReceiveStoreBhv.batchDelete(lstWHtReceiveStore);
	}

}
