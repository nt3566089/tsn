package com.oneslogi.wms.logic.shipping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.cbean.TPackingHCB;
import com.oneslogi.base.dbflute.cbean.TPackingRCB;
import com.oneslogi.base.dbflute.cbean.TPickingRCB;
import com.oneslogi.base.dbflute.cbean.TShippingInstHCB;
import com.oneslogi.base.dbflute.exbhv.TAllocInstHBhv;
import com.oneslogi.base.dbflute.exbhv.TPackingHBhv;
import com.oneslogi.base.dbflute.exbhv.TPackingRBhv;
import com.oneslogi.base.dbflute.exbhv.TPickingRBhv;
import com.oneslogi.base.dbflute.exbhv.TShippingInstHBhv;
import com.oneslogi.base.dbflute.exentity.TAllocInstH;
import com.oneslogi.base.dbflute.exentity.TPackingH;
import com.oneslogi.base.dbflute.exentity.TPackingR;
import com.oneslogi.base.dbflute.exentity.TPickingR;
import com.oneslogi.base.dbflute.exentity.TShippingInstH;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 配送コース一括変更ロジッククラス
 */
public class DeliveryCourseShippingUpdateLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private TShippingInstHBhv tShippingInstHBhv;
	@Inject
	private TAllocInstHBhv tAllocInstHBhv;

	@Inject
	private TPickingRBhv tPickingRBhv;
	@Inject
	private TPackingHBhv tPackingHBhv;
	@Inject
	private TPackingRBhv tPackingRBhv;


	/**
	 * <h2> 配送コースを一括変更する。</h2>
	 * <pre>
	 * 引数を条件に出荷指示ヘッダのデータを検索し、
	 * 対象データに紐づく引当指示ヘッダデータが存在する場合、引当指示ヘッダの配送コースを更新する。
	 *
	 * </pre>
	 * @param header 出荷指示ヘッダ：コントロールNo.・配送コースID・配送コースCD
	 */
	public void update(TShippingInstH header) {
		List<TShippingInstH> shippingList = new ArrayList<TShippingInstH>();
		List<TAllocInstH> allocList = new ArrayList<TAllocInstH>();

		// [#2165] 出庫指示後の配送コース変更機能の追加  2017/08/03 sampei Start
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
			tShippingInstH.setDeliveryCourseId(header.getDeliveryCourseId());
			tShippingInstH.setDeliveryCourseCd(header.getDeliveryCourseCd());
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
				tAllocInstH.setDeliveryCourseId(header.getDeliveryCourseId());

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

		//
		if(allocInstHIdMap.size() > 0){
			// 引当指示ヘッダID
			Iterator<Long> valuesAllocH = allocInstHIdMap.values().iterator();
			while (valuesAllocH.hasNext()) {
				allocInstHIdList.add(valuesAllocH.next());
			}

			// 配送コースの変更
			TShippingInstHCB cb2 = tShippingInstHBhv.newConditionBean();
			TShippingInstH tShippingInstH = new TShippingInstH();
			cb2.query().setAllocInstHId_InScope(allocInstHIdList);
			tShippingInstH.setDeliveryCourseId(header.getDeliveryCourseId());
			tShippingInstH.setDeliveryCourseCd(header.getDeliveryCourseCd());
			tShippingInstHBhv.queryUpdate(tShippingInstH, cb2);


			// 送り状・荷札・積込リスト情報のクリア

			// 出庫帳票
			TPickingRCB cb3 = tPickingRBhv.newMyConditionBean();
			// 検索条件
			cb3.query().queryTPickingH().setAllocInstHId_InScope(allocInstHIdList);
			// 出庫帳票更新用データ編集
			TPickingR tPickingR = new TPickingR();
			tPickingR.setSlipOutFlg(null);
			tPickingR.setSlipOutUserId(null);
			tPickingR.setSlipOutDt(null);
			tPickingR.setInvoiceCreateFlg_$0();
			tPickingR.setInvoiceCreateDt(null);
			tPickingR.setInvoiceIssueNum(null);
			// 出庫帳票更新用データを更新
			tPickingRBhv.queryUpdate(tPickingR, cb3);

			// 梱包帳票
			TPackingRCB cb4 = tPackingRBhv.newMyConditionBean();
			// 検索条件
			cb4.query().queryTPackingH().setAllocInstHId_InScope(allocInstHIdList);
			// 梱包帳票更新用データ編集
			TPackingR tPackingR = new TPackingR();
			tPackingR.setTagOutFlg(null);
			tPackingR.setTagOutUserId(null);
			tPackingR.setTagOutDt(null);
			tPackingR.setTagDlUrl(null);
			tPackingR.setStwOutFlg_$0();
			tPackingR.setStwOutUserId(null);
			tPackingR.setStwOutDt(null);
			// 出荷指示ボディデータを更新
			tPackingRBhv.queryUpdate(tPackingR, cb4);

			// 梱包ヘッダ
			TPackingHCB cb5 = tPackingHBhv.newMyConditionBean();
			// 検索条件
			cb5.query().setAllocInstHId_InScope(allocInstHIdList);
			// 梱包ヘッダ更新用データ編集
			TPackingH tPackingH = new TPackingH();
			tPackingH.setCarrierTraceNum(null);
			tPackingH.setLoadingFlg_$0();
			// 梱包ヘッダデータを更新
			tPackingHBhv.queryUpdate(tPackingH, cb5);

		}
		// [#2165] 出庫指示後の配送コース変更機能の追加  2017/08/03 sampei End
	}
}
