package com.oneslogi.wms.logic.shipping;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.cbean.TTrsolistCB;
import com.oneslogi.base.dbflute.exbhv.TTrsolistBhv;
import com.oneslogi.base.dbflute.exentity.TTrsolist;
import com.oneslogi.base.dbflute.exentity.customize.SqlPickingListRePrint;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 保税出庫関連リスト出力データ更新ロジッククラス
 */
public class PickingListRePrintUpdateLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private TTrsolistBhv tTrsolistBhv;

	/**
	 * <h2>コントロールNo設定処理</h2>
	 * <pre>
	 * 次の処理を行う。
	 * ・印刷済フラグの更新
	 * ・発行日の更新
	 * ・コントロールNoクリア
	 * </pre>
	 * @param header 検索条件
	 * @param bodyList 明細情報
	 * @param update 出庫関連リスト印刷：コントロールNo.
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public int setControlNo(TTrsolist header, List<SqlPickingListRePrint> bodyList, TTrsolist update, ErrorStatus errSts) {

		List<TTrsolist> updateList = new ArrayList<>();

		for (SqlPickingListRePrint body : bodyList) {

			// 更新対象の出庫関連リスト出力を取得
			TTrsolistCB tTrsolistCB = tTrsolistBhv.newMyConditionBean();
			tTrsolistCB.query().setShippingListPrintId_Equal(body.getShippingListPrintId());
			TTrsolist tTrsolist = tTrsolistBhv.selectEntity(tTrsolistCB);

			tTrsolist.setControlNo(update.getControlNo());
			updateList.add(tTrsolist);
		}

		tTrsolistBhv.batchUpdate(updateList);

		return updateList.size();

	}

	/**
	 * <h2>コントロールNoクリア処理</h2>
	 * <pre>
	 * 次の処理を行う。
	 * ・印刷済フラグの更新
	 * ・発行日の更新
	 * ・コントロールNoクリア
	 * </pre>
	 * @param controlNo コントロールNo
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public int clearControlNo(Long controlNo, ErrorStatus errSts) {

		int updateCount = 0;

		TTrsolist update = new TTrsolist();
		update.setControlNo(null);
		Timestamp time = new Timestamp(System.currentTimeMillis());
		update.setPrintdatetime(time);
		
		TTrsolistCB tTrsolistCB = tTrsolistBhv.newConditionBean();
		tTrsolistCB.query().setControlNo_Equal(controlNo);
		
		updateCount = tTrsolistBhv.queryUpdate(update, tTrsolistCB);

		return updateCount;
	}
}
