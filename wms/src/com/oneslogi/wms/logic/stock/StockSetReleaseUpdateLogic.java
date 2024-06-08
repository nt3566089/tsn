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
 * セット解除指示ロジッククラス
 */
public class StockSetReleaseUpdateLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
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
	 * <h2>セット解除指示処理を行う。</h2>
	 * <pre>
	 * 引数のデータで下記の処理を行い、セット解除指示を行う。
	 * ・在庫移動指示ヘッダの登録
	 * ・在庫移動指示ボディ[入庫]の登録
	 * ・在庫移動指示ボディ[出庫]の登録
	 * ・処理Noを採番後、在庫移動実績ボディの登録
	 * ・【在庫更新.在庫移動[出庫]】処理を行う
	 *
	 * 【在庫更新.在庫移動[出庫]】
	 * ・{@link StockUpdateLogic#stockMoveOut(TMoveInstH, List, List, com.oneslogi.base.exception.ErrorManager.ErrorStatus) 在庫移動[出庫]メソッド}を呼び出す。
	 *
	 * </pre>
	 * @param header       在庫移動指示ヘッダ：全項目
	 * @param bodyList     在庫移動指示ボディリスト[入庫]：全項目
	 * @param body         在庫移動指示ボディ[出庫]：全項目
	 * @param errSts       エラー時に設定するエラーステータス
	 */
	public void update(TMoveInstH header, List<TMoveInstB> bodyList, TMoveInstB body, ErrorStatus errSts) {

		// 在庫移動指示ヘッダ登録
		Long headerId = moveInstH_insert(header);

		// [ON推-CT113-018] 親商品の処理流れを移動する  2015.12.28 hayashi Start
		// 在庫移動指示ボディ[出庫]登録
		moveInstBPlus_insert(headerId, body);
		// [ON推-CT113-018] 親商品の処理流れを移動する  2015.12.28 hayashi End

		// 在庫移動指示ボディ[入庫]データ件数繰り返し
		for(TMoveInstB moveInstB : bodyList){
			// 在庫移動指示ボディ[入庫]登録
			moveInstB_insert(headerId, moveInstB);
		}

		// [セット品対応] 在庫更新クラスを使用するように変更(該当処理を削除) 2015.11.19 kawana


		// [セット品対応] 在庫更新クラスを使用するように変更 2015.11.19 kawana Start
		// システム日付を取得
		MClientCenter clientCenterC = new MClientCenter();
		clientCenterC.setClientId(header.getClientId());
		clientCenterC.setCenterId(header.getCenterId());
		MClientCenter clientCenter = clientCenterLogic.getUkEntityWithDeletedCheck(clientCenterC);
		String systemDt = clientCenter.getSystemDt();

		// 処理Noを採番
		String processNo = numberingCenterLogic.getNumbering(header.getCenterId(), WmsNumberingConst.PROCESS_NO);

		// 移動実績を登録
		TMoveRecordB recordB = moveRecordB_insert(header, body, systemDt, processNo);

		// 在庫更新 - 在庫移動[出庫]
		List<TMoveInstB> instBodyList = new ArrayList<TMoveInstB>();
		instBodyList.add(body);
		instBodyList.addAll(bodyList);

		List<TMoveRecordB> recordBodyList = new ArrayList<TMoveRecordB>();
		recordBodyList.add(recordB);

		// 在庫更新 - 在庫移動[出庫]
		stockUpdateLogic.stockMoveOut(header, instBodyList, recordBodyList, errSts);
		if (0 < getErrorManager().size()) {
			return;
		}
		// [セット品対応] 在庫更新クラスを使用するように変更 2015.11.19 kawana End
	}

	/**
	 * 在庫移動指示ヘッダ登録
	 */
	private Long moveInstH_insert(TMoveInstH header) {
		// WMS在庫移動伝票No.を登録する直前に採番
		String moveSlipNo = numberingCenterLogic.getNumbering(header.getCenterId(), WmsNumberingConst.MOVE_SLIP_NO);
		// ===== 在庫移動指示ヘッダ登録 =====
		// 在庫移動指示ステータス(作業中)
		header.setMoveInstStatus_$01();
		// 入力区分
		header.setInputType_$00();
		// WMS在庫移動伝票No.
		header.setMoveSlipNo(moveSlipNo);
		// 在庫移動指示ヘッダの登録実行
		tMoveInstHBhv.insert(header);
		// 登録したときのヘッダID
		long instHeaderId = header.getMoveInstHId();

        // 在庫移動指示帳票登録
        TMoveInstR tMoveInstR = new TMoveInstR();
        tMoveInstR.setMoveInstHId(instHeaderId);
        tMoveInstR.setInstOutFlg_$0();
        tMoveInstRBhv.insert(tMoveInstR);

        return instHeaderId;
	}

	/**
	 * 在庫移動指示ボディ[入庫]登録
	 */
	private void moveInstB_insert(Long headerId, TMoveInstB body) {
        // ===== 在庫移動指示ボディ[入庫]登録 =====
    	// 在庫移動指示ボディの登録データ編集
		// 在校移動指示ヘッダID
		body.setMoveInstHId(headerId);
		// 在庫移動指示ステータス(作業中)
		body.setMoveInstStatus_$01();
		// 入出庫区分
		body.setInoutType_$0();
    	// 在庫移動指示ボディの登録実行
    	tMoveInstBBhv.insert(body);
	}

	/**
	 * 在庫移動指示ボディ[出庫]登録
	 */
	private void moveInstBPlus_insert(Long headerId, TMoveInstB body) {
        // ===== 在庫移動指示ボディ[出庫]登録 =====
    	// 在庫移動指示ボディの登録データ編集
		// 在校移動指示ヘッダID
		body.setMoveInstHId(headerId);
		// 在庫移動指示ステータス(作業中)
		body.setMoveInstStatus_$01();
		// 入出庫区分
		body.setInoutType_$1();
    	// 在庫移動指示ボディの登録実行
    	tMoveInstBBhv.insert(body);
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