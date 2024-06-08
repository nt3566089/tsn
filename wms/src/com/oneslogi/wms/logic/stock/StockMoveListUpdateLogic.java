package com.oneslogi.wms.logic.stock;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.cbean.TMoveInstBCB;
import com.oneslogi.base.dbflute.cbean.TMoveInstHCB;
import com.oneslogi.base.dbflute.cbean.TMoveRecordBCB;
import com.oneslogi.base.dbflute.exbhv.TMoveInstBBhv;
import com.oneslogi.base.dbflute.exbhv.TMoveInstHBhv;
import com.oneslogi.base.dbflute.exbhv.TMoveRecordBBhv;
import com.oneslogi.base.dbflute.exentity.MClientCenter;
import com.oneslogi.base.dbflute.exentity.MProcessType;
import com.oneslogi.base.dbflute.exentity.TMoveInstB;
import com.oneslogi.base.dbflute.exentity.TMoveInstH;
import com.oneslogi.base.dbflute.exentity.TMoveRecordB;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsNumberingConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.core.logic.NumberingCenterLogic;
import com.oneslogi.wms.core.logic.stockupdate.StockUpdateLogic;
import com.oneslogi.wms.logic.common.ClientCenterLogic;
import com.oneslogi.wms.logic.common.ProcessTypeLogic;

/**
 * 在庫移動一覧更新ロジッククラス
 */
public class StockMoveListUpdateLogic extends AbstractWmsLogic {

	// ===== 使用ロジッククラス =====
	@Inject
	private NumberingCenterLogic numberingCenterLogic;
	@Inject
	private ClientCenterLogic clientCenterLogic;
	// [セット品対応] 在庫更新クラスを使用するように変更 2015.11.19 kawana Start
	@Inject
	private StockUpdateLogic stockUpdateLogic;
	// [セット品対応] 在庫更新クラスを使用するように変更 2015.11.19 kawana End
	// ===== 使用テーブル =====
	@Inject
	private TMoveInstBBhv tMoveInstBBhv;

	// [セット品対応] 在庫更新クラスを使用するように変更(該当処理を削除) 2015.11.19 kawana

	@Inject
	private TMoveRecordBBhv tMoveRecordBBhv;
	@Inject
	private TMoveInstHBhv tMoveInstHBhv;

	// [セット品対応] 在庫更新クラスを使用するように変更(該当処理を削除) 2015.11.19 kawana

	// [#2233] 処理対象に処理区分【移動】を追加 2017.08.22 ase Start
	@Inject
	private ProcessTypeLogic processTypeLogic;
	// [#2233] 処理対象に処理区分【移動】を追加 2017.08.22 ase End

	/**
	 * <h2>在庫移動の完了処理を行う。</h2>
	 * <pre>
	 *
	 * 引数のデータで下記の処理を行う。
	 * ・処理Noを採番後、在庫移動実績ボディを登録する。
	 * ・在庫移動指示ボディを更新する。
	 * ・緊急補充指示以外の場合、【在庫更新.在庫移動[入庫]】処理を呼び出す。
	 * ・在庫移動指示ヘッダを更新する。
	 *
	 * 【在庫更新.在庫移動[入庫]】
	 * ・{@link StockUpdateLogic#stockMoveIn(TMoveInstH, List, List, com.oneslogi.base.exception.ErrorManager.ErrorStatus) 在庫移動[入庫]メソッド}を呼び出す。
	 *
	 * </pre>
	 * @param moveInstH       在庫移動指示ヘッダ：全項目
	 * @param moveInstBList   在庫移動指示ボディリスト：全項目
	 * @param errSts          エラー時に設定するエラーステータス
	 */
	public void update_finished(TMoveInstH moveInstH, List<TMoveInstB> moveInstBList, ErrorStatus errSts) {

		// システム日付を取得
		MClientCenter clientCenterC = new MClientCenter();
		clientCenterC.setClientId(moveInstH.getClientId());
		clientCenterC.setCenterId(moveInstH.getCenterId());
		MClientCenter clientCenter = clientCenterLogic.getUkEntityWithDeletedCheck(clientCenterC);
		String systemDt = clientCenter.getSystemDt();

		// [セット品対応] 在庫更新クラスを使用するように変更 2015.11.19 kawana Start

		// 処理No.を採番する
		String processNo = numberingCenterLogic.getNumbering(moveInstH.getCenterId(), WmsNumberingConst.PROCESS_NO);

		List<TMoveRecordB> moveRecordBList = new ArrayList<TMoveRecordB>();
		// [セット品対応] 在庫更新クラスを使用するように変更 2015.11.19 kawana End

		// 在庫移動指示ボディ件数で繰り返し
		for (TMoveInstB moveInstB : moveInstBList) {

			// [#2233] 処理区分【移動】かつ 入出庫区分：出庫の場合、在庫移動実績ボディを登録しない 2017.08.22 ase Start
//			// ===== 在庫移動実績ボディ登録 =====
//			TMoveRecordB moveRecordB = moveRecordB_insert(moveInstH, moveInstB, systemDt, processNo);
//
//			// [セット品対応] 在庫更新クラスを使用するように変更 2015.11.19 kawana Start
//			// 移動実績ボディリストに追加
//			moveRecordBList.add(moveRecordB);
//			// [セット品対応] 在庫更新クラスを使用するように変更 2015.11.19 kawana End
			MProcessType mProcessType = new MProcessType();
			mProcessType = new MProcessType();
			mProcessType.setProcessTypeCd(CDef.ProcessTypeCd.$21.code());
			mProcessType = processTypeLogic.getUkEntity(mProcessType);

			// [#3868] FindBugsで発見したバグを修正 2018.03.02 kawana Start
			if (!(CU.isNotNullAndEquals(moveInstH.getProcessTypeId(), mProcessType.getProcessTypeId()) && moveInstB.isInoutType$1())) {
				// [#3868] FindBugsで発見したバグを修正 2018.03.02 kawana End

				// ===== 在庫移動実績ボディ登録 =====
				TMoveRecordB moveRecordB = moveRecordB_insert(moveInstH, moveInstB, systemDt, processNo);

				// 移動実績ボディリストに追加
				moveRecordBList.add(moveRecordB);
			}
			// [#2233] 処理区分【移動】かつ 入出庫区分：出庫の場合、在庫移動実績ボディを登録しない 2017.08.22 ase End


			// ===== 在庫移動指示ボディ更新 =====
			// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.19 miyabe Start
			moveInstB_update(moveInstB.getMoveInstBId(), CDef.MoveInstStatus.$02.code());
			// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.19 miyabe End
		}

		//[ON推-品向-1081]修正対応 2016.4.12 chou Mod Start

		//緊急補充指示以外の場合に対して、在庫の移動を行う
		if (!moveInstH.getMProcessType().getProcessTypeCd().equals(CDef.ProcessTypeCd.$33.code())) {//"33":緊急補充
			// 在庫更新 - 在庫移動[入庫]
			stockUpdateLogic.stockMoveIn(moveInstH, moveInstBList, moveRecordBList, errSts);
		}

		//[ON推-品向-1081]修正対応 2016.4.12 chou Mod End

		if (0 < getErrorManager().size()) {
			return;
		}

		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.19 miyabe Start
		// ===== 在庫移動指示ヘッダ更新 =====
		moveInstH_update(moveInstH.getMoveInstHId(), CDef.MoveInstStatus.$02.code());
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.19 miyabe End
	}

	/**
	 * <h2>在庫移動の取消処理を行う。</h2>
	 * <pre>
	 * 引数をキーに在庫移動実績ボディから取消対象データを検索し、【在庫更新.在庫移動[入庫]】を実行後、
	 * 在庫移動指示ボディと在庫移動指示ヘッダの在庫移動指示ステータスを"99"(取消)に更新する。
	 *
	 * 【在庫更新.在庫移動[入庫]】
	 * ・{@link StockUpdateLogic#stockMoveOutCancel(TMoveInstH, List, List, com.oneslogi.base.exception.ErrorManager.ErrorStatus) 在庫更新.在庫移動[出庫][赤]メソッド}を呼び出す。
	 *
	 * </pre>
	 * @param moveInstH       在庫移動指示ヘッダ：全項目
	 * @param moveInstBList   在庫移動指示ボディリスト：全項目
	 * @param errSts          エラー時に設定するエラーステータス
	 */
	public void update_cancel(TMoveInstH moveInstH, List<TMoveInstB> moveInstBList, ErrorStatus errSts) {

		// [セット品対応] 在庫更新クラスを使用するように変更 2015.11.19 kawana Start
		// 取消対象の実績ボディを検索
		TMoveRecordBCB recordCb = tMoveRecordBBhv.newMyConditionBean();
		recordCb.checkInvalidQuery();
		recordCb.query().setMoveInstHId_Equal(moveInstH.getMoveInstHId());
		recordCb.addOrderBy_PK_Asc();

		List<TMoveRecordB> moveRecordBList = tMoveRecordBBhv.selectList(recordCb);

		// 在庫更新 - 在庫移動[入庫]
		stockUpdateLogic.stockMoveOutCancel(moveInstH, moveInstBList, moveRecordBList, errSts);
		if (0 < getErrorManager().size()) {
			return;
		}
		// [セット品対応] 在庫更新クラスを使用するように変更 2015.11.19 kawana End

		// 在庫移動指示ボディ件数で繰り返し
		for (TMoveInstB moveInstB : moveInstBList) {

			// [セット品対応] 在庫更新クラスを使用するように変更(該当処理を削除) 2015.11.19 kawana

			// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.19 miyabe Start
			// ===== 在庫移動指示ボディ更新 =====
			moveInstB_update(moveInstB.getMoveInstBId(), CDef.MoveInstStatus.$99.code());
		}

		// ===== 在庫移動指示ヘッダ更新 =====
		moveInstH_update(moveInstH.getMoveInstHId(), CDef.MoveInstStatus.$99.code());
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.19 miyabe End
	}

	/***
	 * <h2>在庫移動指示ヘッダ更新。</h2>
	 * @param moveInstHId 在庫移動ヘッダID
	 * @param status 在庫移動指示ステータス
	 */
	private void moveInstH_update(Long moveInstHId, String status) {
		// エンティティ編集
		TMoveInstH moveInstH = new TMoveInstH();
		moveInstH.setMoveInstStatus(status);

		// ===== 在庫移動指示ヘッダ更新 =====
		TMoveInstHCB cb = tMoveInstHBhv.newMyConditionBean();

		// ===== 更新条件 =====
		// 在庫移動指示ヘッダId
		cb.query().setMoveInstHId_Equal(moveInstHId);

		// ===== 更新実行 =====
		tMoveInstHBhv.queryUpdate(moveInstH, cb);
	}

	/***
	 * <h2>在庫移動指示ボディ更新。</h2>
	 * @param moveInstBId 在庫移動指示ボディID
	 * @param status 在庫移動指示ステータス
	 */
	private void moveInstB_update(Long moveInstBId, String status) {
		// エンティティ編集
		TMoveInstB moveInstB = new TMoveInstB();
		moveInstB.setMoveInstStatus(status);

		// ===== 在庫移動指示ボディ更新 =====
		TMoveInstBCB cb = tMoveInstBBhv.newMyConditionBean();

		// ===== 更新条件 =====
		// 在庫移動指示ボディId
		cb.query().setMoveInstBId_Equal(moveInstBId);

		// ===== 更新実行 =====
		tMoveInstBBhv.queryUpdate(moveInstB, cb);
	}

	// [セット品対応] 在庫更新クラスを使用するように変更(該当処理を削除) 2015.11.19 kawana

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