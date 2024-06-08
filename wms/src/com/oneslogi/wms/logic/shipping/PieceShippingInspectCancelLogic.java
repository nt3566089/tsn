package com.oneslogi.wms.logic.shipping;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.cbean.TPackingBCB;
import com.oneslogi.base.dbflute.cbean.TShippingInstHCB;
import com.oneslogi.base.dbflute.cbean.WHtShippingCB;
import com.oneslogi.base.dbflute.cbean.WShippingInterruptCB;
import com.oneslogi.base.dbflute.exbhv.TPackingBBhv;
import com.oneslogi.base.dbflute.exbhv.TShippingInstHBhv;
import com.oneslogi.base.dbflute.exbhv.WHtShippingBhv;
import com.oneslogi.base.dbflute.exbhv.WShippingInterruptBhv;
import com.oneslogi.base.dbflute.exentity.TPackingB;
import com.oneslogi.base.dbflute.exentity.TPickingH;
import com.oneslogi.base.dbflute.exentity.TShippingInstH;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 出荷検品解除ロジッククラス
 */
public class PieceShippingInspectCancelLogic  extends AbstractWmsLogic  {

	// ===== 使用ロジッククラス =====

	@Inject
	private ShipStatusUpdateLogic shipStatusUpdateLogic;
	// [#5143][v3.1] 単行出荷検品ワーク対応 2018.08.20 kawana Start
	@Inject
	private SingleRowShippingInspectLogic singleRowShippingInspectLogic;
	// [#5143][v3.1] 単行出荷検品ワーク対応 2018.08.20 kawana End

	// [#4650][v3.0] 検品解除は梱包データを再作成せずに検品フラグを下げるだけに変更(不要になった PackingCalculateLogic 削除) 2018.06.05 kawana Del

	// ===== 使用テーブル =====
	@Inject
	private TShippingInstHBhv tShippingInstHBhv;

	// [C-CWMS-0051] 出庫フラグ、検品フラグを梱包ボディに移動(不要な処理を削除) 2015.10.30 kawana

	@Inject
	private TPackingBBhv tPackingBBhv;
	@Inject
	private	WHtShippingBhv wHtShippingBhv;
	@Inject
	private WShippingInterruptBhv wShippingInterruptBhv;
//	@Inject
//	private WHtShippingInterruptBhv wHtShippingInterruptBhv;		//WShippingInterruptを使用した為不要になる。

	// [#4650][v3.0] 検品解除は梱包データを再作成せずに検品フラグを下げるだけに変更(不要になった MParamBhv, TPickingBBhv, TPackingRBhv, TPackingHBhv 削除) 2018.06.05 kawana Del

	/**
	 * <h2>出荷検品解除を行う。</h2>
	 * <pre>
	 * 出荷指示ヘッダ、出庫ヘッダの対象データを取得し、
	 * 【出荷ステータス更新.出荷検品キャンセル】を行う。
	 * 出庫ボディの検品フラグが未検品を更新し、出荷検品中断テーブル、出荷検品ワークの梱包データを削除する。
	 *
	 * 【出荷ステータス更新.出荷検品キャンセル】
	 * ・{@link ShipStatusUpdateLogic#inspectCancel(List, com.oneslogi.base.exception.ErrorManager.ErrorStatus) 出荷検品キャンセルステータス更新メソッド}を呼び出す。
	 * </pre>
	 * @param shippingInstHead 出庫指示ヘッダ：コントロールNo.
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void pieceShippingInspectCancel(TShippingInstH shippingInstHead, ErrorStatus errSts)  {

		List<TShippingInstH> shippingList = new ArrayList<TShippingInstH>();
		List<TPickingH> tPickingHList = new ArrayList<TPickingH>();

		// 出荷指示ヘッダ対象データの取得処理
		TShippingInstHCB tShippingInstHCB = tShippingInstHBhv.newMyConditionBean();
		tShippingInstHCB.setupSelect_TAllocInstH();
		tShippingInstHCB.setupSelect_TAllocInstH().withTPickingH();
		tShippingInstHCB.query().setControlNo_Equal(shippingInstHead.getControlNo());
		shippingList = tShippingInstHBhv.selectList(tShippingInstHCB);

		// 結果判定
		if (shippingList.size() == 0) {
			return;
		}

		// 出庫ヘッダリストを取得
		for (TShippingInstH tShippingInstH : shippingList) {
			if(tShippingInstH.chaseTAllocInstH() != null){
				if(tShippingInstH.chaseTAllocInstH().chaseTPickingH() != null){
					TPickingH tPickingH = new TPickingH();
					tPickingH = tShippingInstH.chaseTAllocInstH().chaseTPickingH();
					tPickingHList.add(tPickingH);
				}
			}
		}

		// 結果判定
		if (tPickingHList.size() == 0) {
			return;
		}

		// [#476] 出荷ステータス更新の呼出を検品フラグの更新後に変更(ここから移動) 2016.12.16 kawana

		// 出庫ボディの検品フラグの更新と梱包データの削除処理とワークデータの削除処理
		if(tPickingHList.size() > 0){
			for(TPickingH tPickingH : tPickingHList){

				// [ON推-品向-1168] 出荷検品解除した時に梱包データを初期化 2016.07.05 kawana Start
				// [C-CWMS-0051] 出庫フラグ、検品フラグを梱包ボディに移動 2015.10.30 kawana Start
				updatePacking(tPickingH, errSts);
				if (0 < getErrorManager().size()) {
					return;
				}
				// [C-CWMS-0051] 出庫フラグ、検品フラグを梱包ボディに移動 2015.10.30 kawana End
				// [ON推-品向-1168] 出荷検品解除した時に梱包データを初期化 2016.07.05 kawana End

				// 出荷検品中断の削除実行
				WShippingInterruptCB wShippingInterruptCB = wShippingInterruptBhv.newMyConditionBean();
				wShippingInterruptCB.checkInvalidQuery();
				wShippingInterruptCB.query().setClientId_Equal(tPickingH.getClientId());
				wShippingInterruptCB.query().setCenterId_Equal(tPickingH.getCenterId());
				wShippingInterruptCB.query().setPickingWorkNo_Equal(tPickingH.getPickingWorkNo());
				wShippingInterruptBhv.queryDelete(wShippingInterruptCB);

				// 出荷検品ワークの削除実行
				WHtShippingCB wHtShippingCB = wHtShippingBhv.newMyConditionBean();
				wHtShippingCB.checkInvalidQuery();
				wHtShippingCB.query().setClientId_Equal(tPickingH.getClientId());
				wHtShippingCB.query().setCenterId_Equal(tPickingH.getCenterId());
				wHtShippingCB.query().setPickingWorkNo_Equal(tPickingH.getPickingWorkNo());
				wHtShippingBhv.queryDelete(wHtShippingCB);

				// 同じWShippingInterruptCBを使用した為削除 2015/09/14 Nay Zaw

				// [#5143][v3.1] 単行出荷検品ワーク対応 2018.08.20 kawana Start

				// ===== 単行出荷検品ワーク更新 =====

				singleRowShippingInspectLogic.inspectCancelWorkTableOnly(tPickingH);

				// [#5143][v3.1] 単行出荷検品ワーク対応 2018.08.20 kawana End
			}
		}

		// [#476] 出荷ステータス更新の呼出を検品フラグの更新後に変更 2016.12.16 kawana Start

		// ===== 出荷ステータス更新クラス.出荷検品キャンセルメッソドを呼出し =====
		shipStatusUpdateLogic.inspectCancel(tPickingHList, errSts);

		// [#476] 出荷ステータス更新の呼出を検品フラグの更新後に変更 2016.12.16 kawana End
	}

	// [ON推-品向-1168] 出荷検品解除した時に梱包データを初期化 2016.07.06 kawana Start

	/**
	 * 梱包ヘッダ・ボディの更新
	 */
	private void updatePacking(TPickingH tPickingH, ErrorStatus errSts)  {

		// [#4650][v3.0] 検品解除は梱包データを再作成せずに検品フラグを下げるだけに変更 2018.06.05 kawana Start

		// ===== 検品フラグを下げる =====

		// 解除する対象 条件
		TPackingBCB cb = tPackingBBhv.newMyConditionBean();
		cb.checkInvalidQuery();
		cb.query().queryTPackingH().queryTPickingH().setClientId_Equal(tPickingH.getClientId());
		cb.query().queryTPackingH().queryTPickingH().setCenterId_Equal(tPickingH.getCenterId());
		cb.query().queryTPackingH().queryTPickingH().setPickingWorkNo_Equal(tPickingH.getPickingWorkNo());
		//[ON推-1.1.4-CT-099]CT指摘の修正対応 2016.06.08 chou Add Start
		//出荷検品解除の処理は、混載フラグ=1：混載のみ対象とする。
		cb.query().queryTPackingH().setMixedFlg_Equal_$1();
		//[ON推-1.1.4-CT-099]CT指摘の修正対応 2016.06.08 chou Add End

		// 更新値(検品フラグ)
		TPackingB updatePackingBody = new TPackingB();
		updatePackingBody.setInspectionFlg_$0();

		// 出庫ボディ 更新実行
		tPackingBBhv.queryUpdate(updatePackingBody, cb);

		// [#4650][v3.0] 検品解除は梱包データを再作成せずに検品フラグを下げるだけに変更 2018.06.05 kawana End
	}

	// [#4650][v3.0] 検品解除は梱包データを再作成せずに検品フラグを下げるだけに変更(不要になったselectParamメソッド削除) 2018.06.05 kawana Del

	// [ON推-品向-1168] 出荷検品解除した時に梱包データを初期化 2016.07.06 kawana End
}
