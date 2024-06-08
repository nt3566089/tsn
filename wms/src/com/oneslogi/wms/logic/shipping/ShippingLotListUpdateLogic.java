package com.oneslogi.wms.logic.shipping;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.cbean.TLotCB;
import com.oneslogi.base.dbflute.exbhv.TLastLotBhv;
import com.oneslogi.base.dbflute.exbhv.TLotBhv;
import com.oneslogi.base.dbflute.exentity.TLastLot;
import com.oneslogi.base.dbflute.exentity.TLot;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 最終ロット管理データ更新処理ロジッククラス
 */
public class ShippingLotListUpdateLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private TLastLotBhv tLastLotBhv;
	@Inject
	private TLotBhv tLotBhv;

	/**
	 * <h2>最終ロット管理データを更新する。</h2>
	 * <pre>
	 * 引数を条件に最終ロット管理からデータを検索し、
	 * 期限日存在チェック後、
	 * 最終ロット管理データを更新する。
	 * </pre>
	 * @param tLastLot 最終ロット管理：全項目
	 * @param tLot ロット：期限日・商品ID・ロット
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void update(TLastLot tLastLot, TLot tLot, ErrorStatus errSts) {

		// ===== 期限日存在チェック =====
		TLotCB cbTlot = tLotBhv.newMyConditionBean();
		cbTlot.query().setLimitDt_Equal(tLot.getLimitDt());
		cbTlot.query().setProductId_Equal(tLot.getProductId());
		cbTlot.query().setLot_Equal(tLot.getLot());

		List<TLot> tLotList = new ArrayList<TLot>();

		tLotList = tLotBhv.selectList(cbTlot);

		if (tLotList.size() == 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.LOT_NOT_FOUND_IN_LOT_MASTER_ERROR);
			return;
		}

		// ===== 最終ロット管理データ更新実行 =====
		for (TLot lot : tLotList) {
			tLastLot.setLotId(lot.getLotId());
			tLastLotBhv.update(tLastLot);
		}
	}
}