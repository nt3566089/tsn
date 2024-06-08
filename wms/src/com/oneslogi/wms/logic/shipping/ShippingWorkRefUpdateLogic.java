package com.oneslogi.wms.logic.shipping;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.cbean.TShippingInstHCB;
import com.oneslogi.base.dbflute.exbhv.TShippingInstHBhv;
import com.oneslogi.base.dbflute.exentity.TShippingInstH;

/**
 * 出庫作業メッセージ更新ロジッククラス
 */
public class ShippingWorkRefUpdateLogic {

	// ===== 使用テーブル =====
	@Inject
	private TShippingInstHBhv tShippingInstHBhv;


	/**
	 * <h2>出庫作業メッセージを更新する。</h2>
	 * <pre>
	 * 出荷指示ヘッダの出庫作業メッセージを更新する。
	 * 更新対象が存在しない場合、処理を終了する。
	 * </pre>
	 * @param header 出荷指示ヘッダ：コントロールNo.・出庫作業メッセージ
	 */
	public void update(TShippingInstH header) {
		List<TShippingInstH> shippingList = new ArrayList<TShippingInstH>();

		// 出荷指示ヘッダ対象データの取得処理
		TShippingInstHCB cb = tShippingInstHBhv.newMyConditionBean();
		cb.query().setControlNo_Equal(header.getControlNo());
		shippingList = tShippingInstHBhv.selectList(cb);

		// 結果判定
		if (shippingList.size() == 0) {
			return;
		}

		for (TShippingInstH tShippingInstH : shippingList) {
			// 出荷指示ヘッダエンティティ編集
			tShippingInstH.setPickingWorkMessage(header.getPickingWorkMessage());
		}

		// 出荷指示ヘッダ更新実行
		tShippingInstHBhv.batchUpdate(shippingList);
	}
}
