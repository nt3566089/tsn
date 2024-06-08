package com.oneslogi.wms.logic.ecorder;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.cbean.TEcOrderHCB;
import com.oneslogi.base.dbflute.cbean.TShippingInstHCB;
import com.oneslogi.base.dbflute.exbhv.TEcOrderHBhv;
import com.oneslogi.base.dbflute.exbhv.TShippingInstHBhv;
import com.oneslogi.base.dbflute.exentity.TEcOrderH;
import com.oneslogi.base.dbflute.exentity.TShippingInstH;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * EC受注データ取得及び更新ロジッククラス
 */
public class EcOrderUpdateControlNoLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private TEcOrderHBhv tEcOrderHBhv;
	@Inject
	private TShippingInstHBhv tShippingInstHBhv;

	/**
	 * <h2>EC受注データを取得する。</h2>
	 * <pre>
	 * 受取ったコントロールNo.をキーにEC受注ヘッダデータを取得する。
	 * </pre>
	 * @param controlNo コントロールNo.
	 * @param errSts エラー時に設定するエラーステータス
	 * @return List<TEcOrderH> EC受注ヘッダリスト
	 */
	public List<TEcOrderH> select(long controlNo, ErrorStatus errSts) {

		TEcOrderHCB cb = tEcOrderHBhv.newMyConditionBean();
		// テーブル結合
		cb.query().setControlNo_Equal(controlNo);
		cb.setupSelect_TShippingInstH();
		// ソート条件
		cb.addOrderBy_PK_Asc();

		List<TEcOrderH> resultList = tEcOrderHBhv.selectList(cb);

		return resultList;
	}

	/**
	 * <h2>コントロールNo.を設定する。</h2>
	 * <pre>
	 * EC受注ヘッダと出荷指示ヘッダにコントロールNo.を設定する。
	 * </pre>
	 * @param ecOrderHList EC受注ヘッダリスト：EC受注ヘッダID・バージョンNo.
	 * @param controlNo コントロールNo.
	 * @param errSts エラー時に設定するエラーステータス
	 * @return int 出荷指示ヘッダと EC受注ヘッダの更新件数
	 */
	public int setControlNo(List<TEcOrderH> ecOrderHList, long controlNo, ErrorStatus errSts) {

		// [新WMS-110-060] キャンセル、削除時に名寄せIDが空になってしまう問題を修正 2015.08.06 kawana Start
		List<TShippingInstH> updateShippingInstList = new ArrayList<TShippingInstH>();
		List<TEcOrderH> updateEcOrderHList = new ArrayList<TEcOrderH>();
		for (TEcOrderH h : ecOrderHList) {

			TEcOrderH updateEch = new TEcOrderH();
			updateEch.setEcOrderHId(h.getEcOrderHId());
			updateEch.setVersionNo(h.getVersionNo());
			updateEch.setControlNo(controlNo);

			updateEcOrderHList.add(updateEch);

			TShippingInstH instH = h.chaseTShippingInstH();
			if (!CU.isNullOrEmpty(instH.getShippingStatus())) {

				TShippingInstH updateInstH = new TShippingInstH();
				updateInstH.setShippingInstHId(instH.getShippingInstHId());
				updateInstH.setVersionNo(instH.getVersionNo());
				updateInstH.setControlNo(controlNo);
				updateShippingInstList.add(updateInstH);
			}
		}

		// 出荷指示ヘッダにコントロールNo設定
		int[] instUpdateCount = tShippingInstHBhv.batchUpdate(updateShippingInstList);
		// EC受注ヘッダにコントロールNo設定
		int[] orderUpdateCount = tEcOrderHBhv.batchUpdate(updateEcOrderHList);
		// [新WMS-110-060] キャンセル、削除時に名寄せIDが空になってしまう問題を修正 2015.08.06 kawana End

		int updateCount = orderUpdateCount.length + instUpdateCount.length;

		return updateCount;
	}

	/**
	 * <h2>コントロールNoをクリアする。</h2>
	 * <pre>
	 * EC受注ヘッダと出荷指示ヘッダのコントロールNo.をクリアする。
	 * </pre>
	 * @param controlNo コントロールNo.
	 * @param errSts エラー時に設定するエラーステータス
	 * @return int 出荷指示ヘッダと EC受注ヘッダの更新件数
	 */
	public int clearControlNo(long controlNo, ErrorStatus errSts) {

		// 出荷指示ヘッダのクリア
		TShippingInstHCB instCb = tShippingInstHBhv.newMyConditionBean();
		instCb.query().setControlNo_Equal(controlNo);
		TShippingInstH instSet = new TShippingInstH();
		instSet.setControlNo(null);

		int instUpdateCount = tShippingInstHBhv.queryUpdate(instSet, instCb);

		// EC受注ヘッダのクリア
		TEcOrderHCB orderCb = tEcOrderHBhv.newMyConditionBean();
		orderCb.query().setControlNo_Equal(controlNo);
		TEcOrderH orderSet = new TEcOrderH();
		orderSet.setControlNo(null);
		int orderUpdateCount = tEcOrderHBhv.queryUpdate(orderSet, orderCb);

		int updateCount = instUpdateCount + orderUpdateCount;

		return updateCount;
	}
}
