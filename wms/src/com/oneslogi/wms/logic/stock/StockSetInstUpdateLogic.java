package com.oneslogi.wms.logic.stock;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.exbhv.TMoveInstBBhv;
import com.oneslogi.base.dbflute.exbhv.TMoveInstHBhv;
import com.oneslogi.base.dbflute.exbhv.TMoveInstRBhv;
import com.oneslogi.base.dbflute.exbhv.TMoveRecordBBhv;
import com.oneslogi.base.dbflute.exentity.MClientCenter;
import com.oneslogi.base.dbflute.exentity.TMoveInstB;
import com.oneslogi.base.dbflute.exentity.TMoveInstH;
import com.oneslogi.base.dbflute.exentity.TMoveInstR;
import com.oneslogi.base.dbflute.exentity.TMoveRecordB;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsNumberingConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.core.logic.NumberingCenterLogic;
import com.oneslogi.wms.core.logic.stockupdate.StockUpdateLogic;
import com.oneslogi.wms.logic.common.ClientCenterLogic;

/**
 * セット組指示ロジッククラス
 */
public class StockSetInstUpdateLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	// [セット品対応] 在庫更新クラスを使用するように変更(該当処理を削除) 2015.11.19 kawana
	@Inject
	private TMoveInstHBhv tMoveInstHBhv;
	@Inject
	private TMoveInstBBhv tMoveInstBBhv;
	@Inject
	private TMoveInstRBhv tMoveInstRBhv;
	// [セット品対応] 在庫更新クラスを使用するように変更 2015.11.19 kawana Start
	@Inject
	private TMoveRecordBBhv tMoveRecordBBhv;
	// ===== 使用ロジック =====
	@Inject
	private NumberingCenterLogic numberingCenterLogic;
	@Inject
	private ClientCenterLogic clientCenterLogic;
	@Inject
	private StockUpdateLogic stockUpdateLogic;
	// [セット品対応] 在庫更新クラスを使用するように変更 2015.11.19 kawana End

	/**
	 * <h2>セット組指示処理を行う。</h2>
	 * <pre>
	 * 引数のデータで下記の処理を行う。
	 * ・処理Noを採番後、在庫移動指示の登録（在庫移動指示ヘッダ、在庫移動指示帳票）
	 * ・在庫移動指示ボディの登録（[出庫]）
	 * ・在庫移動実績ボディの登録（[出庫]）
	 * ・在庫移動指示ボディの登録（[入庫]）
	 * ・【在庫更新・在庫移動［出庫］】の実行
	 *
	 * 【在庫更新・在庫移動［出庫］】
	 * ・{@link StockUpdateLogic#stockMoveOut(TMoveInstH, List, List, com.oneslogi.base.exception.ErrorManager.ErrorStatus) 在庫移動[出庫]メソッド}を呼び出す。
	 *
	 * </pre>
	 * @param instHeader       在庫移動指示ヘッダ：全項目
	 * @param instBody         在庫移動指示ボディ[入庫]：全項目
	 * @param instBodyList     在庫移動指示ボディ[出庫]：全項目
	 * @param errSts           エラー時に設定するエラーステータス
	 */
	public void update(TMoveInstH instHeader, TMoveInstB instBody, List<TMoveInstB> instBodyList, ErrorStatus errSts) {
		// [セット品対応] 在庫更新クラスを使用するように変更 2015.11.19 kawana Start
		// システム日付を取得
		MClientCenter clientCenterC = new MClientCenter();
		clientCenterC.setClientId(instHeader.getClientId());
		clientCenterC.setCenterId(instHeader.getCenterId());
		MClientCenter clientCenter = clientCenterLogic.getUkEntityWithDeletedCheck(clientCenterC);
		String systemDt = clientCenter.getSystemDt();

		// 処理Noを採番
		String processNo = numberingCenterLogic.getNumbering(instHeader.getCenterId(), WmsNumberingConst.PROCESS_NO);
		// [セット品対応] 在庫更新クラスを使用するように変更 2015.11.19 kawana End

		// [ON推-品向-1119] 在庫移動指示ボディの挿入順を変更 2016.04.18 kawana Start
		// 在庫移動指示ヘッダ登録
		Long instHeaderId = moveInstH_insert(instHeader);
		// [ON推-品向-1119] 在庫移動指示ボディの挿入順を変更 2016.04.18 kawana End

		// [セット品対応] 在庫更新クラスを使用するように変更 2015.11.19 kawana Start
		List<TMoveRecordB> recordBodyList = new ArrayList<TMoveRecordB>();
		// [セット品対応] 在庫更新クラスを使用するように変更 2015.11.19 kawana End

		// 在庫移動指示[出庫]データ件数繰り返し
		for (TMoveInstB moveInstB : instBodyList) {

			// 在庫移動指示登録[出庫]
			moveInstPlus_insert(instHeaderId, moveInstB);

			// [セット品対応] 在庫更新クラスを使用するように変更 2015.11.19 kawana Start
			// 移動実績を登録
			TMoveRecordB recordB = moveRecordB_insert(instHeader, moveInstB, systemDt, processNo);
			recordBodyList.add(recordB);
			// [セット品対応] 在庫更新クラスを使用するように変更 2015.11.19 kawana End
		}

		// [ON推-品向-1119] 在庫移動指示ボディの挿入順を変更 2016.04.18 kawana Start
		// 在庫移動指示登録[入庫]
		moveInstMinus_insert(instHeaderId, instBody);
		// [ON推-品向-1119] 在庫移動指示ボディの挿入順を変更 2016.04.18 kawana End

		// [セット品対応] 在庫更新クラスを使用するように変更 2015.11.19 kawana Start
		// 在庫更新 - 在庫移動[出庫]
		stockUpdateLogic.stockMoveOut(instHeader, instBodyList, recordBodyList, errSts);
		if (0 < getErrorManager().size()) {
			return;
		}
		// [セット品対応] 在庫更新クラスを使用するように変更 2015.11.19 kawana End
	}

	// [ON推-品向-1119] 在庫移動指示ボディの挿入順を変更 2016.04.18 kawana Start
	/**
	 * 在庫移動指示ヘッダ登録
	 */
	private Long moveInstH_insert(TMoveInstH instHeader) {
		// WMS在庫移動伝票No.を登録する直前に採番
		String moveSlipNo = numberingCenterLogic.getNumbering(instHeader.getCenterId(), WmsNumberingConst.MOVE_SLIP_NO);

		// ===== 在庫移動指示ヘッダ登録 =====
		// WMS在庫移動伝票No.
		instHeader.setMoveSlipNo(moveSlipNo);
		// 在庫移動指示ステータス(作業中)
		instHeader.setMoveInstStatus_$01();
		// 入力区分
		instHeader.setInputType_$00();
		// 在庫移動指示ヘッダの登録実行
		tMoveInstHBhv.insert(instHeader);
		// 登録したときのヘッダID
		long instHeaderId = instHeader.getMoveInstHId();

		// ===== 在庫移動指示帳票登録 =====
		TMoveInstR tMoveInstR = new TMoveInstR();
		tMoveInstR.setMoveInstHId(instHeaderId);
		tMoveInstR.setInstOutFlg_$0();
		tMoveInstRBhv.insert(tMoveInstR);

		return instHeaderId;
	}

	/**
	 * 在庫移動指示ボディ登録[入庫]
	 */
	private void moveInstMinus_insert(Long instHeaderId, TMoveInstB instBody) {

		// ===== 在庫移動指示ボディ登録[入庫] =====
		// 在庫移動指示ボディの登録データ編集
		// 在校移動指示ヘッダID
		instBody.setMoveInstHId(instHeaderId);
		// 在庫移動指示ステータス(作業中)
		instBody.setMoveInstStatus_$01();
		// 入出庫区分
		instBody.setInoutType_$0();
		// 在庫移動指示ボディの登録実行
		tMoveInstBBhv.insert(instBody);
	}

	// [ON推-品向-1119] 在庫移動指示ボディの挿入順を変更 2016.04.18 kawana End

	/**
	 * 在庫移動指示登録[出庫]
	 */
	private void moveInstPlus_insert(Long instHeaderId, TMoveInstB instBody) {
		// ===== 在庫移動指示ボディ登録[出庫] =====
		// 在庫移動指示ボディの登録データ編集
		// 在校移動指示ヘッダID
		instBody.setMoveInstHId(instHeaderId);
		// 在庫移動指示ステータス(作業中)
		instBody.setMoveInstStatus_$01();
		// 入出庫区分
		instBody.setInoutType_$1();
		// 在庫移動指示ボディの登録実行
		tMoveInstBBhv.insert(instBody);
	}

	// 在庫移動実績ボディ登録
	private TMoveRecordB moveRecordB_insert(TMoveInstH moveInstH, TMoveInstB moveInstB, String systemDt, String processNo) {
		// ===== 在庫移動実績ボディ登録処理 =====
		TMoveRecordB moveRecordB = new TMoveRecordB();
		// 在庫移動指示ヘッダID
		moveRecordB.setMoveInstHId(moveInstB.getMoveInstHId());
		// 在庫移動指示ボディID
		moveRecordB.setMoveInstBId(moveInstB.getMoveInstBId());
		// 処理No.
		moveRecordB.setProcessNo(processNo);
		// ロケーションID
		moveRecordB.setLocationId(moveInstB.getLocationId());
		// 移動日
		moveRecordB.setMoveDt(systemDt);
		// 在庫移動実績数
		moveRecordB.setMoveNum(moveInstB.getInstNum());
		// 登録実行
		tMoveRecordBBhv.insert(moveRecordB);

		return moveRecordB;
	}

	// [セット品対応] 在庫更新クラスを使用するように変更(該当処理を削除) 2015.11.19 kawana
}