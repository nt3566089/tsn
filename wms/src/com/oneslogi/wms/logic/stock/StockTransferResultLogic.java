package com.oneslogi.wms.logic.stock;

import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.cbean.MLocationCB;
import com.oneslogi.base.dbflute.cbean.TMoveInstBCB;
import com.oneslogi.base.dbflute.exbhv.MLocationBhv;
import com.oneslogi.base.dbflute.exbhv.TMoveInstBBhv;
import com.oneslogi.base.dbflute.exbhv.TMoveRecordBBhv;
import com.oneslogi.base.dbflute.exentity.MClientCenter;
import com.oneslogi.base.dbflute.exentity.MLocation;
import com.oneslogi.base.dbflute.exentity.TMoveInstB;
import com.oneslogi.base.dbflute.exentity.TMoveInstH;
import com.oneslogi.base.dbflute.exentity.TMoveRecordB;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsNumberingConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.core.logic.NumberingCenterLogic;
import com.oneslogi.wms.core.logic.stockupdate.StockUpdateLogic;
import com.oneslogi.wms.logic.common.ClientCenterLogic;

/**
 * 在庫移動実績ロジッククラス
 */
public class StockTransferResultLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private TMoveRecordBBhv tMoveRecordBBhv;
	@Inject
	private TMoveInstBBhv tMoveInstBBhv;

	// ===== 使用ロジッククラス =====
	@Inject
	private NumberingCenterLogic numberingLogic;
	@Inject
	private ClientCenterLogic clientCenterLogic;
	@Inject
	private StockUpdateLogic stockUpdateLogic;
	// [C-CWMS-0050] 移動元のロケが対象商品の補充ロケとなっている場合の件対応 2016.2.19 nayzaw Start
	@Inject
	private MLocationBhv mLocationBhv;
	// [C-CWMS-0050] 移動元のロケが対象商品の補充ロケとなっている場合の件対応 2016.2.19 nayzaw End

	/**
	 * <h2>在庫調整［＋］の処理を行う。</h2>
	 * <pre>
	 * 引数チェックを行い、引数がNULLの場合、致命的例外をスローする。
	 *
	 * 処理Noを採番後、在庫移動実績ボディを登録し、【在庫更新.在庫調整[+]】処理を呼び出す。
	 *
	 * 【在庫更新.在庫調整[+]】
	 * ・{@link StockUpdateLogic#stockAdjustmentPlus(TMoveInstH, TMoveInstB, TMoveRecordB, com.oneslogi.base.exception.ErrorManager.ErrorStatus) 在庫調整[+]メソッド}を呼び出す。
	 *
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

		// ===== 在庫移動実績ボディ登録[出庫] =====
		// 在庫移動実績ボディの登録データ編集
		// システム管理日付取得(荷主マスタ検索)
		MClientCenter clientCenterC = new MClientCenter();
		clientCenterC.setClientId(instHeader.getClientId());
		clientCenterC.setCenterId(instHeader.getCenterId());
		MClientCenter clientCenter = clientCenterLogic.getUkEntityWithDeletedCheck(clientCenterC);
		// エンティティ編集
		TMoveRecordB recordBody = new TMoveRecordB();
		recordBody.setMoveInstHId(instHeader.getMoveInstHId());
		recordBody.setMoveInstBId(instBody.getMoveInstBId());
		recordBody.setProcessNo(numberingLogic.getNumbering(instHeader.getCenterId(), WmsNumberingConst.PROCESS_NO));
		recordBody.setLocationId(instBody.getLocationId());
		recordBody.setMoveDt(clientCenter.getSystemDt());
		recordBody.setMoveNum(instBody.getInstNum());
		// 在庫移動実績ボディの登録実行
		tMoveRecordBBhv.insert(recordBody);

		// ===== 在庫更新.在庫調整[+] =====
		// 下記パラメータを設定して在庫更新.在庫調整[+]メソッドを呼出し
		stockUpdateLogic.stockAdjustmentPlus(instHeader, instBody, recordBody, errSts);
	}

	/**
	 * <h2>在庫調整［－］の処理を行う。</h2>
	 * <pre>
	 * 引数チェックを行い、引数がNULLの場合、致命的例外をスローする。
	 *
	 * 処理Noを採番後、在庫移動実績ボディを登録し、【在庫更新.在庫調整[-]】処理を呼び出す。
	 *
	 * 【在庫更新.在庫調整[-]】
	 * ・{@link StockUpdateLogic#stockAdjustmentMinus(TMoveInstH, TMoveInstB, TMoveRecordB, com.oneslogi.base.exception.ErrorManager.ErrorStatus) 在庫調整[-]メソッド}を呼び出す。
	 *
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

		// ===== 在庫移動実績ボディ登録[入庫] =====
		// システム管理日付取得(荷主マスタ検索)
		MClientCenter clientCenterC = new MClientCenter();
		clientCenterC.setClientId(instHeader.getClientId());
		clientCenterC.setCenterId(instHeader.getCenterId());
		MClientCenter clientCenter = clientCenterLogic.getUkEntityWithDeletedCheck(clientCenterC);
		// エンティティ編集
		TMoveRecordB recordBody = new TMoveRecordB();
		recordBody.setMoveInstHId(instHeader.getMoveInstHId());
		recordBody.setMoveInstBId(instBody.getMoveInstBId());
		recordBody.setProcessNo(numberingLogic.getNumbering(instHeader.getCenterId(), WmsNumberingConst.PROCESS_NO));
		recordBody.setLocationId(instBody.getLocationId());
		recordBody.setMoveDt(clientCenter.getSystemDt());
		recordBody.setMoveNum(instBody.getInstNum());
		// 在庫移動実績ボディの登録実行
		tMoveRecordBBhv.insert(recordBody);

		// ===== 在庫更新.在庫調整[-] =====
		// 下記パラメータを設定して在庫更新.在庫調整[-]メソッドを呼出し
		stockUpdateLogic.stockAdjustmentMinus(instHeader, instBody, recordBody, errSts);
	}

	/**
	 * <h2>在庫移動［出庫］の処理を行う。</h2>
	 * <pre>
	 * 引数チェックを行い、引数がNULLの場合、致命的例外をスローする。
	 *
	 * 処理Noを採番後、在庫移動実績ボディ（移動元出庫）を登録し、【在庫更新.在庫移動[出庫]】処理を呼び出す。
	 *
	 * 全数出庫の場合、在庫移動実績ボディ（移動元出庫）の(全数出庫フラグ＝全数出庫)を更新する。
	 * 最後に、在庫移動指示ボディ（移動先入庫）の入庫no.を更新する。
	 *
	 * 【在庫更新.在庫移動[出庫]】
	 * ・{@link StockUpdateLogic#stockMoveOut(TMoveInstH, List, TMoveRecordB, com.oneslogi.base.exception.ErrorManager.ErrorStatus) 在庫移動[出庫]メソッド}を呼び出す。
	 *
	 * </pre>
	 * @param instHeader 在庫移動指示ヘッダ：全項目
	 * @param instBodyList 在庫移動指示ボディリスト：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void stockMoveOut(TMoveInstH instHeader, List<TMoveInstB> instBodyList, ErrorStatus errSts) {

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

		// ===== 在庫移動実績ボディ登録[出庫] =====
		// 在庫移動実績ボディの登録データ編集
		MClientCenter clientCenterC = new MClientCenter();
		TMoveRecordB recordBody = new TMoveRecordB();
		// instBodyListのデータ件数分繰返
		for (TMoveInstB body : instBodyList) {
			// instBodyList.入出庫区分＝出庫の場合
			if (body.getInoutType() == "1") {
				// システム管理日付取得(荷主マスタ検索)
				clientCenterC.setClientId(instHeader.getClientId());
				clientCenterC.setCenterId(instHeader.getCenterId());
				MClientCenter clientCenter = clientCenterLogic.getUkEntityWithDeletedCheck(clientCenterC);
				// エンティティ編集
				recordBody.setMoveInstHId(instHeader.getMoveInstHId());
				recordBody.setMoveInstBId(body.getMoveInstBId());
				recordBody.setProcessNo(numberingLogic.getNumbering(instHeader.getCenterId(), WmsNumberingConst.PROCESS_NO));
				recordBody.setLocationId(body.getLocationId());
				recordBody.setMoveDt(clientCenter.getSystemDt());
				recordBody.setMoveNum(body.getInstNum());
				// 在庫移動実績ボディの登録実行
				tMoveRecordBBhv.insert(recordBody);
			}
		}

		// ===== 在庫更新.在庫移動[出庫] =====
		// 下記パラメータを設定して在庫更新.在庫移動[出庫]メソッドを呼出し
		stockUpdateLogic.stockMoveOut(instHeader, instBodyList, recordBody, errSts);

		// ===== 在庫移動実績ボディ更新[出庫](全数出庫フラグ) =====
		// [ B ]の在庫移動実績ボディ.全数出庫フラグ＝全数出庫の場合
    	// [#1899] [1.33 品質向上対応] [ver2.2.1] 区分値マスタ変更に伴い誤字修正 2017.06.28 miyabe Start
		if(recordBody.getAllShippingFlg() == "1"){
    	// [#1899] [1.33 品質向上対応] [ver2.2.1] 区分値マスタ変更に伴い誤字修正 2017.06.28 miyabe End
			// 在庫移動実績ボディの更新実行
			tMoveRecordBBhv.update(recordBody);
		}

		// ===== 在庫移動指示ボディ更新[入庫](入庫No.) =====
		// instBodyListのデータ件数分繰返
		for (TMoveInstB body : instBodyList) {
			// instBodyList.入出庫区分＝入庫の場合
			if(body.getInoutType() == "0"){
				// [エンハンス PH2.0] 入数の設定値を変更 2015.12.01 sja Start
				// 在庫移動指示ボディの更新実行
				//tMoveInstBBhv.update(body);
				// エンティティ編集
				TMoveInstB moveInstB = new TMoveInstB();
				moveInstB.setStoreNoId(body.getStoreNoId());
				// [#1563] 入庫ラベルNo.を使用したHT在庫移動(部分)が出来ない問題を修正 2017.04.14 kawana Start
				moveInstB.setStoreLabelNo(body.getStoreLabelNo());
				// [#1563] 入庫ラベルNo.を使用したHT在庫移動(部分)が出来ない問題を修正 2017.04.14 kawana End
				// ===== 在庫移動指示ボディダ更新 =====
				TMoveInstBCB cb = tMoveInstBBhv.newMyConditionBean();
				// ===== 更新条件 =====
				// 在庫移動指示ヘッダId
				cb.query().setMoveInstBId_Equal(body.getMoveInstBId());
				// ===== 更新実行 =====
				tMoveInstBBhv.queryUpdate(moveInstB, cb);
				// [エンハンス PH2.0] 入数の設定値を変更 2015.12.01 sja End
			}
		}
	}

	/**
	 * <h2>在庫移動［入庫］の処理を行う。</h2>
	 * <pre>
	 * 引数チェックを行い、引数がNULLの場合、致命的例外をスローする。
	 *
	 * 処理Noを採番後、在庫移動実績ボディ（移動先入庫）を登録し、【在庫更新.在庫移動[入庫]】処理を呼び出す。
	 *
	 * 入庫No.マージの場合、在庫移動実績ボディ（移動先入庫）を更新する。
	 *
	 * 【在庫更新.在庫移動[入庫]】
	 * ・{@link StockUpdateLogic#stockMoveIn(TMoveInstH, List, TMoveRecordB, com.oneslogi.base.exception.ErrorManager.ErrorStatus) 在庫移動[入庫]メソッド}を呼び出す。
	 *
	 * </pre>
	 * @param instHeader 在庫移動指示ヘッダ：全項目
	 * @param instBodyList 在庫移動指示ボディリスト：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void stockMoveIn(TMoveInstH instHeader, List<TMoveInstB> instBodyList, ErrorStatus errSts) {

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

		// ===== 在庫移動実績ボディ登録[入庫] =====
		// 在庫移動実績ボディの登録データ編集
		MClientCenter clientCenterC = new MClientCenter();
		TMoveRecordB recordBody = new TMoveRecordB();
		// instBodyListのデータ件数分繰返
		for (TMoveInstB body : instBodyList) {
			// instBodyList.入出庫区分＝入庫の場合
			if(body.getInoutType() == "0"){
				// システム管理日付取得(荷主マスタ検索)
				clientCenterC.setClientId(instHeader.getClientId());
				clientCenterC.setCenterId(instHeader.getCenterId());
				MClientCenter clientCenter = clientCenterLogic.getUkEntityWithDeletedCheck(clientCenterC);
				// エンティティ編集
				recordBody.setMoveInstHId(instHeader.getMoveInstHId());
				recordBody.setMoveInstBId(body.getMoveInstBId());
				recordBody.setProcessNo(numberingLogic.getNumbering(instHeader.getCenterId(), WmsNumberingConst.PROCESS_NO));
				recordBody.setLocationId(body.getLocationId());
				recordBody.setMoveDt(clientCenter.getSystemDt());
				recordBody.setMoveNum(body.getInstNum());
				// 在庫移動実績ボディの登録実行
				tMoveRecordBBhv.insert(recordBody);
			}
		}

		// ===== 在庫更新.在庫移動[入庫] =====
		// 下記パラメータを設定して在庫更新.在庫移動[入庫]メソッドを呼出し
		stockUpdateLogic.stockMoveIn(instHeader, instBodyList, recordBody, errSts);

		// ===== 在庫移動実績ボディ更新[入庫](入庫No.マージフラグ) =====

		// [#231] 入庫Noマージ区分の区分値CDの綴り間違いを修正 2016.11.22 kawana Start
		// [ B ]の在庫移動実績ボディ.入庫No.マージフラグ＝マージするの場合
		if(recordBody.isStoreNoMergeFlg$1()){
			// [#231] 入庫Noマージ区分の区分値CDの綴り間違いを修正 2016.11.22 kawana End

			// 在庫移動実績ボディの更新実行
			tMoveRecordBBhv.update(recordBody);
		}
	}

	// [#2194] 最大格納数、最大格納荷姿が変更先ロケに設定されない不具合を修正 2017.07.28 kawana Start
	// [C-CWMS-0050] 補充管理件対応 2016.2.19 nayzaw add Start

	/**
	 * <h2>補充データのロケーションを変更する。</h2>
	 * <pre>
	 * 移動先がピックロケーションの場合、移動元の補充ロケ情報を移動先に更新する。
	 * 最後に、移動元の補充ロケ情報をクリアする。
	 * </pre>
	 * @param sourceLocId   移動元ロケーションID
	 * @param destLocId     移動先ロケーションID
	 */
	public void updateLocationReplenishData(long sourceLocId, long destLocId) {

		// ===== 移動元ロケ取得 (補充設定を取得) =====

		MLocationCB sourceLocCB = mLocationBhv.newMyConditionBean();
		sourceLocCB.query().setLocationId_Equal(sourceLocId);
		sourceLocCB.query().setReplenishProductId_IsNotNull();

		MLocation sourceLoc = mLocationBhv.selectEntity(sourceLocCB);

		if (sourceLoc == null) {
			// 移動元ロケに補充設定なし

			return;
		}

		// ===== 移動先ロケ取得 (ピックロケ) =====

		MLocationCB destLocCB = mLocationBhv.newMyConditionBean();
		destLocCB.query().setLocationId_Equal(destLocId);
		destLocCB.query().setPickingLocationFlg_Equal_$1();

		MLocation destLoc = mLocationBhv.selectEntity(destLocCB);

		if (destLoc == null) {
			// 移動先ロケがピックロケ以外(バックロケ)

			return;
		}

		long srcReplenishProductId = sourceLoc.getReplenishProductId();
		Long destReplenishProductId = destLoc.getReplenishProductId();

		if (destReplenishProductId == null || srcReplenishProductId != destReplenishProductId.longValue()) {
			// 移動先ロケの補充設定なし または 補充商品が異なる場合は上書更新

			// ===== 移動先ロケの補充情報を更新 =====

			destLoc.setReplenishProductId(sourceLoc.getReplenishProductId());
			destLoc.setReplenishStockTypeId(sourceLoc.getReplenishStockTypeId());
			destLoc.setReplenishDepositId(sourceLoc.getReplenishDepositId());
			destLoc.setReplenishPNum(sourceLoc.getReplenishPNum());
			destLoc.setReplenishPProductShapeId(sourceLoc.getReplenishPProductShapeId());
			destLoc.setMaxStoreNum(sourceLoc.getMaxStoreNum());
			destLoc.setMaxStoreProductShapeId(sourceLoc.getMaxStoreProductShapeId());

			mLocationBhv.update(destLoc);
		}

		// ===== 移動元の補充情報を削除 =====

		sourceLoc.setReplenishProductId(null);
		sourceLoc.setReplenishStockTypeId(null);
		sourceLoc.setReplenishDepositId(null);
		sourceLoc.setReplenishPNum(null);
		sourceLoc.setReplenishPProductShapeId(null);
		sourceLoc.setMaxStoreNum(null);
		sourceLoc.setMaxStoreProductShapeId(null);

		//移動元ロケーション情報更新
		mLocationBhv.update(sourceLoc);
	}

	// [C-CWMS-0050] 補充管理件対応 2016.2.19 nayzaw add End
	// [#2194] 最大格納数、最大格納荷姿が変更先ロケに設定されない不具合を修正 2017.07.28 kawana End
}
