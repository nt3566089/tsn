package com.oneslogi.wms.logic.shipping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
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
 * 出荷日（作業日）一括変更ロジッククラス
 */
public class ShippingDateUpdateLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private TShippingInstHBhv tShippingInstHBhv;
	@Inject
	private TAllocInstHBhv tAllocInstHBhv;

	/**
	 * * <h2> 出荷日（作業日）を一括変更する。</h2>
	 * <pre>
	 * 出荷指示ヘッダの出荷日（作業日）を一括更新する。
	 * 引当指示ヘッダのデータが存在する場合、引当指示ヘッダの出荷日（作業日）を一括更新する。
	 *
	 * </pre>
	 * @param header 出荷指示ヘッダ：コントロールNo.・出荷日・作業日
	 */
	public void update(TShippingInstH header) {
		List<TShippingInstH> shippingList = new ArrayList<TShippingInstH>();
		List<TAllocInstH> allocList = new ArrayList<TAllocInstH>();

		// [#2165] 引当指示ヘッダに紐付く他の出荷指示データの日付も変更する  2017/08/03 sampei Start
		HashMap<Long, Long> allocInstHIdMap = new HashMap<Long, Long>();
		ArrayList<Long> allocInstHIdList = new ArrayList<Long>();

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
			if (header.getShippingWorkDtFlg() == 1) {
				// 出荷日/作業日が1(出荷日)の場合
				tShippingInstH.setShippingDt(header.getShippingDt());
			} else {
				// 出荷日/作業日が0(作業日)の場合
				tShippingInstH.setWorkDt(header.getWorkDt());
			}
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
				if (header.getShippingWorkDtFlg() == 1) {
					// 出荷日/作業日が1(出荷日)の場合
					tAllocInstH.setShippingDt(header.getShippingDt());
				} else {
					// 出荷日/作業日が0(作業日)の場合
					tAllocInstH.setWorkDt(header.getWorkDt());
				}

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

				if (!allocInstHIdMap.containsKey(tAllocInstH.getAllocInstHId())) {
					allocInstHIdMap.put(tAllocInstH.getAllocInstHId(), tAllocInstH.getAllocInstHId());
				}
			}

		}

		// 引当指示ヘッダ更新実行
		tAllocInstHBhv.batchUpdate(allocList);

		// 選択行の引当指示データに紐付く出荷指示データの更新
		if(allocInstHIdMap.size() > 0){
			Iterator<Long> valuesAllocH = allocInstHIdMap.values().iterator();
			while (valuesAllocH.hasNext()) {
				allocInstHIdList.add(valuesAllocH.next());
			}

			TShippingInstHCB cb2 = tShippingInstHBhv.newConditionBean();
			TShippingInstH tShippingInstH = new TShippingInstH();
			cb2.query().setAllocInstHId_InScope(allocInstHIdList);
			if (header.getShippingWorkDtFlg() == 1) {
				// 出荷日/作業日が1(出荷日)の場合
				tShippingInstH.setShippingDt(header.getShippingDt());

			} else {
				// 出荷日/作業日が0(作業日)の場合
				tShippingInstH.setWorkDt(header.getWorkDt());
			}
			tShippingInstHBhv.queryUpdate(tShippingInstH, cb2);
		}
		// [#2165] 引当指示ヘッダに紐付く他の出荷指示データの日付も変更する  2017/08/03 sampei End
	}
}
