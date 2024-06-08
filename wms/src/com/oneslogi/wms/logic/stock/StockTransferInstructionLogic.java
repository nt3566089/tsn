package com.oneslogi.wms.logic.stock;

import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.exbhv.TMoveInstBBhv;
import com.oneslogi.base.dbflute.exbhv.TMoveInstHBhv;
import com.oneslogi.base.dbflute.exbhv.TMoveInstRBhv;
import com.oneslogi.base.dbflute.exentity.TMoveInstB;
import com.oneslogi.base.dbflute.exentity.TMoveInstH;
import com.oneslogi.base.dbflute.exentity.TMoveInstR;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 在庫移動指示ロジッククラス
 */
public class StockTransferInstructionLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private TMoveInstHBhv tMoveInstHBhv;
	@Inject
	private TMoveInstBBhv tMoveInstBBhv;
	// [C-CWMS-0032] 入庫ラベル発行の出力フラグ更新 2015.08.31 ki Start
	@Inject
	private TMoveInstRBhv tMoveInstRBhv;
	// [C-CWMS-0032] 入庫ラベル発行の出力フラグ更新 2015.08.31 ki End

	// ===== 使用ロジッククラス =====
	// なし

	/**
	 * <h2>在庫調整［＋］の指示処理を行う。</h2>
	 * <pre>
	 * 引数チェックを行い、引数がNULLの場合、致命的例外をスローする。
	 * その後、下記処理を行う。
	 * ・在庫移動指示ヘッダ登録
	 * ・在庫移動指示ボディ登録[入庫]
	 * ・在庫移動指示帳票登録
	 * </pre>
	 * @param instHeader 在庫移動指示ヘッダ：全項目
	 * @param instBody 在庫移動指示ボディ：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void stockAdjustmentPlus(TMoveInstH instHeader, TMoveInstB instBody, ErrorStatus errSts) {
		// ===== 初期処理 =====
		// なし

		// ===== 引数チェック =====
		// instHeaderがNULLの場合
		if (instHeader == null) {
			// 致命的例外スロー
			this.getErrorManager().throwException(new IllegalArgumentException());
		}
		// instBodyがNULLの場合
		if (instBody == null) {
			// 致命的例外スロー
			this.getErrorManager().throwException(new IllegalArgumentException());
		}

		// ===== 在庫移動指示ヘッダ登録 =====
		// 在庫移動指示ヘッダの登録実行
		tMoveInstHBhv.insert(instHeader);
		// 登録したときのヘッダID
		long instHeaderId = instHeader.getMoveInstHId();

		// ===== 在庫移動指示ボディ登録[入庫] =====
		// 在庫移動指示ボディの登録データ編集
		// エンティティ編集
		instBody.setMoveInstHId(instHeaderId);
		// 在庫移動指示ボディの登録実行
		tMoveInstBBhv.insert(instBody);

		// [C-CWMS-0032] 入庫ラベル発行の出力フラグ更新 2015.08.31 ki Start
        // 在庫移動指示帳票登録
        TMoveInstR tMoveInstR = new TMoveInstR();
        tMoveInstR.setMoveInstHId(instHeaderId);
        tMoveInstR.setInstOutFlg("0");
        tMoveInstRBhv.insert(tMoveInstR);
		// [C-CWMS-0032] 入庫ラベル発行の出力フラグ更新 2015.08.31 ki End
	}

	/**
	 * <h2>在庫調整［－］の指示処理を行う。</h2>
	 * <pre>
	 * 引数チェックを行い、引数がNULLの場合、致命的例外をスローする。
	 * その後、下記処理を行う。
	 * ・在庫移動指示ヘッダ登録
	 * ・在庫移動指示ボディ登録[出庫]
	 * ・在庫移動指示帳票登録
	 * </pre>
	 * @param instHeader 在庫移動指示ヘッダ：全項目
	 * @param instBody 在庫移動指示ボディ：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void stockAdjustmentMinus(TMoveInstH instHeader, TMoveInstB instBody, ErrorStatus errSts) {
		// ===== 初期処理 =====
		// なし

		// ===== 引数チェック =====
		// instHeaderがNULLの場合
		if (instHeader == null) {
			// 致命的例外スロー
			this.getErrorManager().throwException(new IllegalArgumentException());
		}
		// instBodyがNULLの場合
		if (instBody == null) {
			// 致命的例外スロー
			this.getErrorManager().throwException(new IllegalArgumentException());
		}

		// ===== 在庫移動指示ヘッダ登録 =====
		// 在庫移動指示ヘッダの登録実行
		tMoveInstHBhv.insert(instHeader);
		// 登録したときのヘッダID
		long instHeaderId = instHeader.getMoveInstHId();

		// ===== 在庫移動指示ボディ登録[出庫] =====
		// 在庫移動指示ボディの登録データ編集
		// エンティティ編集
		instBody.setMoveInstHId(instHeaderId);
		// 在庫移動指示ボディの登録実行
		tMoveInstBBhv.insert(instBody);

		// [C-CWMS-0032] 入庫ラベル発行の出力フラグ更新 2015.08.31 ki Start
        // 在庫移動指示帳票登録
        TMoveInstR tMoveInstR = new TMoveInstR();
        tMoveInstR.setMoveInstHId(instHeaderId);
        tMoveInstR.setInstOutFlg("0");
        tMoveInstRBhv.insert(tMoveInstR);
		// [C-CWMS-0032] 入庫ラベル発行の出力フラグ更新 2015.08.31 ki End
	}

	/**
	 * <h2>在庫移動の指示処理を行う。</h2>
	 * <pre>
	 * 引数チェックを行い、引数がNULLの場合、致命的例外をスローする。
	 * その後、下記処理を行う。
	 * ・在庫移動指示ヘッダ登録
	 * ・在庫移動指示ボディ登録[出庫][入庫]
	 * ・在庫移動指示帳票登録
	 * </pre>
	 * @param instHeader 在庫移動指示ヘッダ：全項目
	 * @param instBodyList 在庫移動指示ボディリスト：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void stockMove(TMoveInstH instHeader, List<TMoveInstB> instBodyList, ErrorStatus errSts) {
		// ===== 初期処理 =====
		// なし

		// ===== 引数チェック =====
		// instHeaderがNULLの場合
		if (instHeader == null) {
			// 致命的例外スロー
			this.getErrorManager().throwException(new IllegalArgumentException());
		}
		// instBodyList件数≠2の場合
		if (instBodyList.size() != 2) {
			// 致命的例外スロー
			this.getErrorManager().throwException(new IllegalArgumentException());
		}

		// ===== 在庫移動指示ヘッダ登録 =====
		// 在庫移動指示ヘッダの登録実行
		tMoveInstHBhv.insert(instHeader);
		// 登録したときのヘッダID
		long instHeaderId = instHeader.getMoveInstHId();

		// ===== 在庫移動指示ボディ登録[出庫][入庫] =====
		// 在庫移動指示ボディの登録データ編集
		// 在庫移動指示ボディのデータ件数分繰返
		for (TMoveInstB body : instBodyList) {
			// エンティティ編集
			body.setMoveInstHId(instHeaderId);
			// 在庫移動指示ボディの登録実行
			tMoveInstBBhv.insert(body);
		}

		// [C-CWMS-0032] 入庫ラベル発行の出力フラグ更新 2015.08.31 ki Start
        // 在庫移動指示帳票登録
        TMoveInstR tMoveInstR = new TMoveInstR();
        tMoveInstR.setMoveInstHId(instHeaderId);
        tMoveInstR.setInstOutFlg("0");
        tMoveInstRBhv.insert(tMoveInstR);
		// [C-CWMS-0032] 入庫ラベル発行の出力フラグ更新 2015.08.31 ki End
	}

}
