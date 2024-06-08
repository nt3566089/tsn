package com.oneslogi.wms.logic.stock;

import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.exbhv.TMoveInstBBhv;
import com.oneslogi.base.dbflute.exbhv.TMoveInstHBhv;
import com.oneslogi.base.dbflute.exbhv.TMoveInstRBhv;
import com.oneslogi.base.dbflute.exbhv.TMoveRecordBBhv;
import com.oneslogi.base.dbflute.exentity.TMoveInstB;
import com.oneslogi.base.dbflute.exentity.TMoveInstH;
import com.oneslogi.base.dbflute.exentity.TMoveInstR;
import com.oneslogi.base.dbflute.exentity.TMoveRecordB;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsNumberingConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.core.logic.NumberingCenterLogic;
import com.oneslogi.wms.core.logic.stockupdate.StockUpdateLogic;

/**
 * 補充指示登録ロジッククラス
 */
public class ReplenishInstInsertLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private TMoveInstHBhv tMoveInstHBhv;

	@Inject
	private TMoveInstBBhv tMoveInstBBhv;

	@Inject
	private TMoveInstRBhv tMoveInstRBhv;

	@Inject
	private TMoveRecordBBhv tMoveRecordBBhv;

	@Inject
	private NumberingCenterLogic numberingLogic;

	@Inject
	private StockUpdateLogic stockUpdateLogic;

	//[Ver1.1.4][ON推-補充処理の不具合] 2016.02.05 chou 削除

	private long moveInstHId = 0L;//登録するヘッダIDを保存

	/**
	 * <h2>補充指示登録処理を行う。</h2>
	 * <pre>
	 * 在庫移動指示ヘッダ、在庫移動指示ボディの登録処理を行う。
	 * 在庫移動指示帳票を登録する。
	 * 入出庫区分が"1：出庫"の場合、在庫移動実績ボディの登録処理を行う。
	 * </pre>
	 * @param instHeader 在庫移動指示ヘッダ：全項目
	 * @param instBodyList 在庫移動指示ボディリスト：全項目
	 * @param recordBody 在庫移動実績ボディ：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void insert(TMoveInstH instHeader, List<TMoveInstB> instBodyList, TMoveRecordB recordBody,  ErrorStatus errSts) {

		// ===== 引数チェック =====

		if (instHeader == null) {
			// 致命的例外スロー
			this.getErrorManager().throwException(new IllegalArgumentException());
		}

		if (instBodyList.size() == 0) {
			// 致命的例外スロー
			this.getErrorManager().throwException(new IllegalArgumentException());
		}

		//[Ver1.1.4][ON推-補充処理の不具合] 2016.02.05 chou 修正 Start

		// ===== 在庫移動指示ヘッダ登録 =====
		// 在庫移動指示ヘッダの登録実行
		tMoveInstHBhv.insert(instHeader);

		// 登録したヘッダIDを変数に設定
		this.moveInstHId = instHeader.getMoveInstHId();

		// ===== 在庫移動指示帳票登録 =====
		TMoveInstR tMoveInstR = new TMoveInstR();
		tMoveInstR.setMoveInstHId(this.moveInstHId);
		tMoveInstR.setInstOutFlg("0");
		tMoveInstRBhv.insert(tMoveInstR);

		//[Ver1.1.4][ON推-補充処理の不具合] 2016.02.05 chou 修正 End

		// ===== 在庫移動指示ボディ登録[出庫][入庫] =====
		// 在庫移動指示ボディの登録データ編集
		// 在庫移動指示ボディのデータ件数分繰返
		for (TMoveInstB body : instBodyList) {
			// エンティティ編集
			body.setMoveInstHId(this.moveInstHId);
			// 在庫移動指示ボディの登録実行
			tMoveInstBBhv.insert(body);
		}

		// instBodyListのデータ件数分繰返
		for (TMoveInstB body : instBodyList) {

			// instBodyList.入出庫区分＝出庫の場合のみに、在庫移動実績ボディの登録を実行
			if(body.getInoutType() == "1"){

				// ===== 在庫移動実績ボディ登録[出庫] =====
				// 在庫移動実績ボディの登録データ編集

				//在庫移動指示ヘッダID
				recordBody.setMoveInstHId(this.moveInstHId);
				//在庫移動指示ボディID
				recordBody.setMoveInstBId(body.getMoveInstBId());
				//処理No.
				recordBody.setProcessNo(numberingLogic.getNumbering(instHeader.getCenterId(), WmsNumberingConst.PROCESS_NO));
				//ロケーションID
				recordBody.setLocationId(body.getLocationId());
				//移動日
				recordBody.setMoveDt(instHeader.getInstDt());
				//在庫移動実績数
				recordBody.setMoveNum(body.getInstNum());

				// 在庫移動実績ボディの登録実行
				tMoveRecordBBhv.insert(recordBody);
			}
		}

	}


	/**
	 * <h2>在庫移動［出庫］時処理を行う。</h2>
	 * <pre>
	 * 【在庫更新.在庫移動[出庫]】処理を行う。
	 * 全数出庫の場合、在庫移動実績ボディ(出庫データ)の全数出庫フラグを全数出庫に更新する。
	 *
	 * 【在庫更新.在庫移動[出庫]】
	 * ・{@link StockUpdateLogic#stockMoveOut(TMoveInstH, List, TMoveRecordB, com.oneslogi.base.exception.ErrorManager.ErrorStatus) 在庫移動[出庫]メソッド}を呼び出す。
	 *
	 * </pre>
	 * @param instHeader 在庫移動指示ヘッダ：全項目
	 * @param instBodyList 在庫移動指示ボディリスト：全項目
	 * @param recordBody 在庫移動実績ボディ：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void stockMoveOut(TMoveInstH instHeader, List<TMoveInstB> instBodyList, TMoveRecordB recordBody, ErrorStatus errSts) {

		// ===== 在庫更新.在庫移動[出庫] =====
		// 下記パラメータを設定して在庫更新.在庫移動[出庫]メソッドを呼出し
		this.stockUpdateLogic.stockMoveOut(instHeader, instBodyList, recordBody, errSts);

		// ===== 在庫移動実績ボディ更新[出庫](全数出庫フラグ) =====
		// 在庫移動実績ボディ.全数出庫フラグ＝全数出庫の場合
    	// [#1899] [1.33 品質向上対応] [ver2.2.1] 区分値マスタ変更に伴い誤字修正 2017.06.28 miyabe Start
		if(recordBody.getAllShippingFlg() == "1"){
    	// [#1899] [1.33 品質向上対応] [ver2.2.1] 区分値マスタ変更に伴い誤字修正 2017.06.28 miyabe End
			// 在庫移動実績ボディの更新実行
			tMoveRecordBBhv.update(recordBody);
		}

		//[Ver1.1.4][ON推-補充処理の不具合] 2016.03.10 chou 削除 Start
//		// ===== 在庫移動指示ボディ更新[入庫](入庫No.ID、入庫ラベルNo.) =====
//		// instBodyListのデータ件数分繰返
//		for (TMoveInstB body : instBodyList) {
//			// instBodyList.入出庫区分＝入庫の場合
//			if(body.getInoutType() == "0"){
//				// 入庫No.IDで入庫ラベルNo.を検索
//				TStoreNo tsno = tStoreNoBhv.selectByPKValue(body.getStoreNoId());
//				if(tsno != null) {
//					body.setStoreLabelNo(tsno.getStoreLabelNo());
//				}else{
//					body.setStoreLabelNo(null);
//				}
//
//				// 在庫移動指示ボディの更新実行
//				tMoveInstBBhv.update(body);
//			}
//		}
		//[Ver1.1.4][ON推-補充処理の不具合] 2016.03.10 chou 削除 End

	}

}
