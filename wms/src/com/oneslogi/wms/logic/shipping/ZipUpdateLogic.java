package com.oneslogi.wms.logic.shipping;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.cbean.TShippingInstHCB;
import com.oneslogi.base.dbflute.exbhv.TAllocInstHBhv;
import com.oneslogi.base.dbflute.exbhv.TShippingInstHBhv;
import com.oneslogi.base.dbflute.exentity.TAllocInstH;
import com.oneslogi.base.dbflute.exentity.TShippingInstH;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 郵便番号一括変更ロジッククラス
 */
public class ZipUpdateLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private TShippingInstHBhv tShippingInstHBhv;
	@Inject
	private TAllocInstHBhv tAllocInstHBhv;

	/**
	 * * <h2> 郵便番号を一括変更する。</h2>
	 * <pre>
	 * 出荷指示ヘッダと引当指示ヘッダの郵便番号を一括更新する。
	 *
	 * </pre>
	 * @param header 出荷指示ヘッダ：コントロールNo.・届先郵便番号
	 */
	public void update(TShippingInstH header) {
		List<TShippingInstH> shippingList = new ArrayList<TShippingInstH>();
		List<TAllocInstH> allocList = new ArrayList<TAllocInstH>();

		// 対象データの取得処理(出荷指示ヘッダ)
		TShippingInstHCB cb = tShippingInstHBhv.newMyConditionBean();
		cb.query().setControlNo_Equal(header.getControlNo());
		shippingList = tShippingInstHBhv.selectList(cb);

		// 結果判定
		if (shippingList.size() == 0) {
			return;
		}

		// 出荷指示ヘッダエンティティ編集
		for (TShippingInstH tShippingInstH : shippingList) {
			tShippingInstH.setDelivZipCd(header.getDelivZipCd());
		}

		// 出荷指示ヘッダ更新実行
		tShippingInstHBhv.batchUpdate(shippingList);

		// 対象データの取得処理(出荷指示ヘッダ&引当指示ヘッダ)
		cb.setupSelect_TAllocInstH();
		cb.query().setControlNo_Equal(header.getControlNo());
		shippingList = tShippingInstHBhv.selectList(cb);

		// 結果判定
		if (shippingList.size() == 0) {
			return;
		}

		for (TShippingInstH tShippingInstH : shippingList) {
			// 対象データの取得処理(引当指示ヘッダ)
			TAllocInstH tAllocInstH = tShippingInstH.getTAllocInstH();
			if (tAllocInstH != null) {
				// 引当指示ヘッダエンティティ編集
				tAllocInstH.setDelivZipCd(header.getDelivZipCd());

				if (allocList.size() == 0) {
					allocList.add(tAllocInstH);
				} else {
					boolean flag = true;
					for (TAllocInstH alloc : allocList) {
						// [ON推-品向-931] ラッパークラスの比較不正を修正 2015.08.20 kawana Start
						if (CU.isNotNullAndEquals(tAllocInstH.getAllocInstHId(), alloc.getAllocInstHId())) {
							// [ON推-品向-931] ラッパークラスの比較不正を修正 2015.08.20 kawana End
							flag = false;
							break;
						}
					}
					if (flag) {
						allocList.add(tAllocInstH);
					}
				}
			}

		}

		// 引当指示ヘッダ更新実行
		tAllocInstHBhv.batchUpdate(allocList);
	}
}
