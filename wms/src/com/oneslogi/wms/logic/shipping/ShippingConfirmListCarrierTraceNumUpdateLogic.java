package com.oneslogi.wms.logic.shipping;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.cbean.TPackingHCB;
import com.oneslogi.base.dbflute.exbhv.TPackingHBhv;
import com.oneslogi.base.dbflute.exentity.TPackingH;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 貨物追跡番号登録ロジッククラス
 */
public class ShippingConfirmListCarrierTraceNumUpdateLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private TPackingHBhv tPackingHBhv;

	/**
	 * <h2>梱包ヘッダを更新する。</h2>
	 *
	 * <pre>
	 * 梱包ヘッダのデータを更新する。
	 * </pre>
	 *
	 * @param centerId センタID
	 * @param bolNo Bill of Lading No.
	 * @param carrierTraceNum 貨物追跡No.
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void update(String centerId,String bolNo,String carrierTraceNum, ErrorStatus errSts) {
		List<TPackingH> resultList = new ArrayList<TPackingH>();
		// 削除フラグ自動検索無効化
		this.setBehaviorAutoDelFlg(false);

		// ===== 出庫ヘッダデータ取得 =====
		TPackingHCB cbTPAH = tPackingHBhv.newMyConditionBean();
		cbTPAH.setupSelect_TPickingH();
		// ===== 検索条件 =====
		//センタID
		cbTPAH.query().setCenterId_Equal(Long.valueOf(centerId));
		// bolNo
		cbTPAH.query().queryTPickingH().setBolNo_Equal(bolNo);
		// ===== 検索実行 =====
		resultList = tPackingHBhv.selectList(cbTPAH);
		for (TPackingH tPackingH : resultList) {
			tPackingH.setCarrierTraceNum(carrierTraceNum);
			tPackingHBhv.update(tPackingH);
		}
	}
}