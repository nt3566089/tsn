package com.oneslogi.ht.wms.logic.receive;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.exbhv.TStoreRecordBBhv;
import com.oneslogi.base.dbflute.exentity.TStoreRecordB;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 入庫格納入庫実績更新ロジッククラス
 */
public class ReceiveStoreUpdateLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private TStoreRecordBBhv tStoreRecordBBhv;

	/**
	 * <h2>入庫実績ボディデータを更新する。</h2>
	 * <pre>
	 * 引数の入庫実績ボディデータを更新する。
	 * </pre>
	 * @param tStoreRecordB 入庫実績ボディ
	 */
	public void update(TStoreRecordB tStoreRecordB) {

		tStoreRecordBBhv.update(tStoreRecordB);

	}
}
