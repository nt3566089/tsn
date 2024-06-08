package com.oneslogi.wms.logic.stock;

import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.cbean.MLocationCB;
import com.oneslogi.base.dbflute.exbhv.MLocationBhv;
import com.oneslogi.base.dbflute.exentity.MLocation;
import com.oneslogi.base.dbflute.exentity.TMoveInstB;
import com.oneslogi.base.dbflute.exentity.TMoveInstH;
import com.oneslogi.base.dbflute.exentity.TMoveRecordB;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 在庫移動処理ロジッククラス
 */
public class StockMoveUpdateLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private StockTransferInstructionLogic stocktransferInstruction;
	@Inject
	private StockTransferResultLogic stocktransferResult;
	@Inject
	private StockTransferStatusUpdateLogic stocktransferStatusUpdate;
	// [C-CWMS-0050] 2016.2.17 nayzaw Start
	@Inject
	private MLocationBhv mLocationBhv;
	// [C-CWMS-0050] 2016.2.17 nayzaw End
	/**
	 * <h2>在庫移動処理を行う。</h2>
	 * <pre>
	 * 引数のデータで下記の処理を行う。
	 * ・【在庫移動指示.在庫移動】処理の行う
	 * ・入出庫区分が1(出庫)の場合、【在庫移動実績.在庫移動［出庫］】処理を行う
	 * ・入出庫区分が1(出庫)の場合、【在庫移動ステータス更新.在庫移動［出庫］】処理を行う
	 * ・入出庫区分が0(入庫)の場合、【在庫移動実績.在庫移動［入庫］】処理を行う
	 * ・入出庫区分が0(入庫)の場合、【在庫移動ステータス更新.在庫移動［入庫］】処理を行う
	 *
	 * 【在庫移動指示.在庫移動】
	 * ・{@link StockTransferInstructionLogic#stockMove(TMoveInstH, List, com.oneslogi.base.exception.ErrorManager.ErrorStatus) 在庫移動指示メソッド}を呼び出す。
	 *
	 * 【在庫移動実績.在庫移動［出庫］】
	 * ・{@link StockTransferResultLogic#stockMoveOut(TMoveInstH, List, com.oneslogi.base.exception.ErrorManager.ErrorStatus) 在庫移動［出庫］メソッド}を呼び出す。
	 *
	 * 【在庫移動ステータス更新.在庫移動［出庫］】
	 * ・{@link StockTransferStatusUpdateLogic#stockMoveOut(TMoveInstH, TMoveInstB, com.oneslogi.base.exception.ErrorManager.ErrorStatus) 在庫移動ステータス更新［出庫］メソッド}を呼び出す。
	 *
	 * 【在庫移動実績.在庫移動［入庫］】
	 * ・{@link StockTransferResultLogic#stockMoveIn(TMoveInstH, List, com.oneslogi.base.exception.ErrorManager.ErrorStatus) 在庫移動［入庫］メソッド}を呼び出す。
	 *
	 * 【在庫移動ステータス更新.在庫移動［入庫］】
	 * ・{@link StockTransferStatusUpdateLogic#stockMoveIn(TMoveInstH, TMoveInstB, com.oneslogi.base.exception.ErrorManager.ErrorStatus) 在庫移動ステータス更新［入庫］メソッド}を呼び出す。
	 *
	 * </pre>
	 * @param tMoveInstBList   在庫移動指示ボディリスト：入出庫区分
	 * @param tMoveInstH       在庫移動指示ヘッダ：全項目
	 * @param errSts           エラー時に設定するエラーステータス
	 */
	public void update(List<TMoveInstB> tMoveInstBList,
			           TMoveInstH       tMoveInstH,
			           ErrorStatus      errSts) {

		// ===== 在庫移動指示.在庫移動クラスを呼出し =====
		stocktransferInstruction.stockMove(tMoveInstH, tMoveInstBList, errSts);

		//ON推-CT4-027 2014/10/28 ADD START
		if (0 < getErrorManager().size()) {
			return;
		}
		//ON推-CT4-027 2014/10/28 ADD END

		// ===== tMoveInstBListのデータ件数分繰返 =====
		for (TMoveInstB body : tMoveInstBList) {
			// ===== 処理区分判定=====

			// ===== tMoveInstBList．入出庫区分が１：出庫の場合 =====
			if (body.isInoutType$1()){
				// ===== 在庫移動実績.在庫移動［出庫］クラスを呼出し =====
				stocktransferResult.stockMoveOut(tMoveInstH,tMoveInstBList,errSts);

				//ON推-CT4-027 2014/10/28 ADD START
				if (0 < getErrorManager().size()) {
					return;
				}
				//ON推-CT4-027 2014/10/28 ADD END

				// ===== 在庫移動ステータス更新.在庫移動［出庫］クラスを呼出し =====
				stocktransferStatusUpdate.stockMoveOut(tMoveInstH,body,errSts);

				//ON推-CT4-027 2014/10/28 ADD START
				if (0 < getErrorManager().size()) {
					return;
				}
				//ON推-CT4-027 2014/10/28 ADD END

			// ===== tMoveInstBList．入出庫区分が０：入庫の場合 =====
			}else if (body.isInoutType$0()){
				// ===== 在庫移動実績.在庫移動［入庫］クラスを呼出し =====
				stocktransferResult.stockMoveIn(tMoveInstH,tMoveInstBList,errSts);

				//ON推-CT4-027 2014/10/28 ADD START
				if (0 < getErrorManager().size()) {
					return;
				}
				//ON推-CT4-027 2014/10/28 ADD END

				// ===== 在庫移動ステータス更新.在庫移動［入庫］クラスを呼出し =====
				stocktransferStatusUpdate.stockMoveIn(tMoveInstH,body,errSts);

				//ON推-CT4-027 2014/10/28 ADD START
				if (0 < getErrorManager().size()) {
					return;
				}
				//ON推-CT4-027 2014/10/28 ADD END

			}
		}
	}

	// [C-CWMS-0050] 補充管理件対応 2016.2.17 nayzaw Start

	/**
	 * <h2>ロケーションの更新処理を行う(全数在庫移動)。</h2>
	 * <pre>
	 * 引数を条件に移動元と移動先ロケーションデータを取得し、
	 * 移動元の補充ロケ情報を移動先ロケーションに更新する。
	 * 移動元の補充ロケ情報をクリアする。
	 *
	 * </pre>
	 * @param moveFrom      移動元在庫移動指ボディ（移動元）：商品ID・在庫区分ID・預託ID
	 * @param moveTo        移動先在庫移動指ボディ（移動先）：ロケーションID
	 * @param recordBody    在庫移動実績ボディ：ロケーションID
	 */
	public void updateLocationReplenishData(TMoveInstB moveFrom,TMoveInstB moveTo,TMoveRecordB recordBody){

		//移動元ロケーションの情報取得
		MLocationCB sourceCB = mLocationBhv.newMyConditionBean();
		sourceCB.query().setLocationId_Equal(recordBody.getLocationId());
		// [1.1.4-CT-096] ロケーションID、商品ID、在庫区分、預託単位で全数移動チェック方法に修正 2016.6.20 nayzaw Start
		sourceCB.query().setReplenishProductId_Equal(moveFrom.getProductId());
		sourceCB.query().setReplenishStockTypeId_Equal(moveFrom.getStockTypeId());
		sourceCB.query().setReplenishDepositId_Equal(moveFrom.getDepositId());
		MLocation sourceLoc = mLocationBhv.selectEntity(sourceCB);
		// [1.1.4-CT-096] ロケーションID、商品ID、在庫区分、預託単位で全数移動チェック方法に修正 2016.6.20 nayzaw End

		// [#2194] 補充情報設定処理の共通化 2017.07.28 kawana Start

		if (sourceLoc == null) {
			// 補充設定なし または 別SKUの補充設定

			return;
		}

		// ===== 補充設定の更新 =====
		stocktransferResult.updateLocationReplenishData(sourceLoc.getLocationId(), moveTo.getLocationId());

		// [#2194] 補充情報設定処理の共通化 2017.07.28 kawana End
	}
	// [C-CWMS-0050] 補充管理件対応 2016.2.17 nayzaw End
}
