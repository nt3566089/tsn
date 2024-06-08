package com.oneslogi.wms.logic.stock;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.exentity.MProcessType;
import com.oneslogi.base.dbflute.exentity.TMoveInstB;
import com.oneslogi.base.dbflute.exentity.TMoveInstH;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 在庫調整処理ロジッククラス
 */
public class StockAdjustUpdateLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private StockTransferInstructionLogic stocktransferInstruction;
	@Inject
	private StockTransferResultLogic stocktransferResult;
	@Inject
	private StockTransferStatusUpdateLogic stocktransferStatusUpdate;
	/**
	 * <h2>在庫調整処理を行う。</h2>
	 * <pre>
	 * 在庫調整[+]の場合、下記の処理を行う。
	 * ・【在庫移動指示.在庫調整［＋］】
	 * ・【在庫移動実績.在庫調整［＋］】
	 * ・【在庫移動ステータス更新.在庫調整［＋］】
	 * 在庫調整[-]の場合、下記の処理を行う。
	 * ・【在庫移動指示.在庫調整［－］】
	 * ・【在庫移動実績.在庫調整［－］】
	 * ・【在庫移動ステータス更新.在庫調整［－］】
	 *
	 * 【在庫移動指示.在庫調整［＋］】
	 * ・{@link StockTransferInstructionLogic#stockAdjustmentPlus(TMoveInstH, TMoveInstB, com.oneslogi.base.exception.ErrorManager.ErrorStatus) 在庫調整［＋］メソッド}を呼び出す。
	 *
	 * 【在庫移動実績.在庫調整［＋］】
	 * ・{@link StockTransferResultLogic#stockAdjustmentPlus(TMoveInstH, TMoveInstB, com.oneslogi.base.exception.ErrorManager.ErrorStatus) 在庫調整［＋］メソッド}を呼び出す。
	 *
	 * 【在庫移動ステータス更新.在庫調整［＋］】
	 * ・{@link StockTransferStatusUpdateLogic#stockAdjustmentPlus(TMoveInstH, TMoveInstB, com.oneslogi.base.exception.ErrorManager.ErrorStatus) 在庫調整［＋］メソッド}を呼び出す。
	 *
	 * 【在庫移動指示.在庫調整［－］】
	 * ・{@link StockTransferInstructionLogic#stockAdjustmentMinus(TMoveInstH, TMoveInstB, com.oneslogi.base.exception.ErrorManager.ErrorStatus) 在庫調整［－］メソッド}を呼び出す。
	 *
	 * 【在庫移動実績.在庫調整［－］】
	 * ・{@link StockTransferResultLogic#stockAdjustmentMinus(TMoveInstH, TMoveInstB, com.oneslogi.base.exception.ErrorManager.ErrorStatus) 在庫調整［－］メソッド}を呼び出す。
	 *
	 * 【在庫移動ステータス更新.在庫調整［－］】
	 * ・{@link StockTransferStatusUpdateLogic#stockAdjustmentMinus(TMoveInstH, TMoveInstB, com.oneslogi.base.exception.ErrorManager.ErrorStatus) 在庫調整［－］メソッド}を呼び出す。
	 *
	 * </pre>
	 * @param mProcessType 処理区分マスタ：処理区分CD（在庫調整[+]：24、在庫調整[-]：23）
	 * @param tMoveInstH   在庫移動指示ヘッダ：全項目
	 * @param tMoveInstB   在庫移動指示ボディ：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void update(MProcessType mProcessType,
			           TMoveInstH   tMoveInstH,
			           TMoveInstB   tMoveInstB,
			           ErrorStatus  errSts) {

		// ===== 処理区分判定=====
		// ===== mProcessType.処理区分が調整［＋］の場合 =====
		// [ON推-品向-777] 処理区分、在庫区分の追加で異常終了 2015.04.15 kawana Start
		switch (CDef.ProcessTypeCd.codeOf(mProcessType.getProcessTypeCd())) {
		case $24: // 在庫調整[+]
			// ===== 在庫移動指示.在庫調整［＋］クラスを呼出し
			stocktransferInstruction.stockAdjustmentPlus(tMoveInstH,tMoveInstB,errSts);
			// ===== 在庫移動実績.在庫調整［＋］クラスを呼出し
			stocktransferResult.stockAdjustmentPlus(tMoveInstH,tMoveInstB,errSts);
			// ===== 在庫移動ステータス更新.在庫調整［＋］クラスを呼出し
			stocktransferStatusUpdate.stockAdjustmentPlus(tMoveInstH,tMoveInstB,errSts);
			break;
		case $23: // 在庫調整[-]
			// ===== 在庫移動指示.在庫調整［－］クラスを呼出し
			stocktransferInstruction.stockAdjustmentMinus(tMoveInstH,tMoveInstB,errSts);
			// ===== 在庫移動実績.在庫調整［－］クラスを呼出し
			stocktransferResult.stockAdjustmentMinus(tMoveInstH,tMoveInstB,errSts);
			// ===== 在庫移動ステータス更新.在庫調整［－］クラスを呼出し
			stocktransferStatusUpdate.stockAdjustmentMinus(tMoveInstH,tMoveInstB,errSts);
			break;
		default:
			break;
		}
		// [ON推-品向-777] 処理区分、在庫区分の追加で異常終了 2015.04.15 kawana End
	}
}
