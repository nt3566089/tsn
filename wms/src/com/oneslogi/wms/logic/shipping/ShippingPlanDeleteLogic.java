package com.oneslogi.wms.logic.shipping;

import java.util.List;

import javax.inject.Inject;

import org.dbflute.cbean.result.ListResultBean;

import com.oneslogi.base.dbflute.cbean.TShippingInstBCB;
import com.oneslogi.base.dbflute.cbean.TShippingInstHCB;
import com.oneslogi.base.dbflute.exbhv.TShippingInstBBhv;
import com.oneslogi.base.dbflute.exbhv.TShippingInstHBhv;
import com.oneslogi.base.dbflute.exbhv.TShippingInstSpareBhv;
import com.oneslogi.base.dbflute.exentity.TShippingInstB;
import com.oneslogi.base.dbflute.exentity.TShippingInstH;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 出荷指示削除処理ロジッククラス
 */
public class ShippingPlanDeleteLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private TShippingInstHBhv tShippingInstHBhv;
	@Inject
	private TShippingInstBBhv tShippingInstBBhv;
	// [#2253]予備項目対応 2017.08.18 sampei Start
	@Inject
	private TShippingInstSpareBhv tShippingInstSpareBhv;
	// [#2253]予備項目対応 2017.08.18 sampei End
	/**
	 * <h2>出荷指示をキャンセルする。</h2>
	 * <pre>
	 * 引数を条件に対象データを取得し、
	 * 出荷指示ヘッダの出荷ステータスにキャンセルを更新する。
	 *
	 * </pre>
	 * @param controlNo コントロールNo.
	 */
	public void Cancel(Long controlNo) {

		// ===== 出荷指示ヘッダデータ取得 =====

		ListResultBean<TShippingInstH> result = null;
		// 検索条件の設定
		TShippingInstHCB cb = tShippingInstHBhv.newMyConditionBean();

		//コントロールNo.の設定
		cb.query().setControlNo_Equal(controlNo);

		result = tShippingInstHBhv.selectList(cb);

		if (result.size() > 0) {
			for (TShippingInstH tShippingInstH : result) {
				tShippingInstH.setShippingStatus("90");

			}

			tShippingInstHBhv.batchUpdate(result);
		}
	}

	/**
	 * <h2>出荷指示データを削除する。</h2>
	 * <pre>
	 * 引数を条件に対象データを取得し、
	 * 出荷指示ヘッダと出荷指示ボディと出荷指示予備の削除フラグを削除済に更新する。
	 *
	 * </pre>
	 * @param controlNo コントロールNo
	 */
	public void delete(Long controlNo) {

		List<TShippingInstB> tShippingInstBList = null;

		TShippingInstBCB tShippingInstBCB = tShippingInstBBhv.newMyConditionBean();
		tShippingInstBCB.setupSelect_TShippingInstH();
		tShippingInstBCB.query().queryTShippingInstH().setControlNo_Equal(controlNo);
		// [#2253]予備項目対応 2017.09.15 sampei Start
		tShippingInstBCB.setupSelect_TShippingInstSpareAsOne();
		// [#2253]予備項目対応 2017.09.15 sampei Start
		tShippingInstBList = tShippingInstBBhv.selectList(tShippingInstBCB);

		if (tShippingInstBList.size() > 0) {
			for (TShippingInstB tShippingInstB : tShippingInstBList) {
				tShippingInstB.setDelFlg_$1();
				tShippingInstB.getTShippingInstH().setDelFlg_$1();

				// [#2253]予備項目対応 2017.08.18 sampei Start
				if(tShippingInstB.getTShippingInstSpareAsOne() != null){
					tShippingInstB.getTShippingInstSpareAsOne().setDelFlg_$1();
					tShippingInstSpareBhv.update(tShippingInstB.getTShippingInstSpareAsOne());
				}
				// [#2253]予備項目対応 2017.08.18 sampei End

				tShippingInstBBhv.update(tShippingInstB);
				tShippingInstHBhv.update(tShippingInstB.getTShippingInstH());
			}
		}
	}

}