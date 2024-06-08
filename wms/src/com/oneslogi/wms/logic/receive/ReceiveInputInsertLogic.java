package com.oneslogi.wms.logic.receive;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.cbean.MLocationCB;
import com.oneslogi.base.dbflute.cbean.TReceivePlanBCB;
import com.oneslogi.base.dbflute.exbhv.MLocationBhv;
import com.oneslogi.base.dbflute.exbhv.TReceivePlanBBhv;
import com.oneslogi.base.dbflute.exbhv.TReceivePlanHBhv;
import com.oneslogi.base.dbflute.exbhv.TStoreRecordBBhv;
import com.oneslogi.base.dbflute.exbhv.TStoreRecordHBhv;
import com.oneslogi.base.dbflute.exbhv.TStoreRecordRBhv;
import com.oneslogi.base.dbflute.exentity.MLocation;
import com.oneslogi.base.dbflute.exentity.TReceivePlanB;
import com.oneslogi.base.dbflute.exentity.TReceivePlanH;
import com.oneslogi.base.dbflute.exentity.TStoreRecordB;
import com.oneslogi.base.dbflute.exentity.TStoreRecordH;
import com.oneslogi.base.dbflute.exentity.TStoreRecordR;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.WmsNumberingConst;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.core.logic.NumberingCenterLogic;
import com.oneslogi.wms.core.logic.stockupdate.StockUpdateLogic;
import com.oneslogi.wms.core.logic.stockupdate.StockUpdateLogic.ResultReceive;

/**
 * 入庫実績登録ロジッククラス
 */
public class ReceiveInputInsertLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private TStoreRecordBBhv tStoreRecordBBhv;
	@Inject
	private TStoreRecordHBhv tStoreRecordHBhv;
	@Inject
	private MLocationBhv mLocationBhv;
	@Inject
	private TReceivePlanBBhv tReceivePlanBBhv;
	@Inject
	private TReceivePlanHBhv tReceivePlanHBhv;
	// [C-CWMS-0060] 入荷実績出力バッチ作成 2016.10.19 shimizu Start
	@Inject
	private TStoreRecordRBhv tStoreRecordRBhv;
	// [C-CWMS-0060] 入荷実績出力バッチ作成 2016.10.19 shimizu End

	// ===== 使用ロジッククラス =====
	@Inject
	private NumberingCenterLogic numberingLogic;
	@Inject
	private StockUpdateLogic stockUpdateLogic;
	@Inject
	private ReceiveStatusUpdateLogic receiveStatusUpdateLogic;
	@Inject
	private ReceiveInputSelectLogic receiveInputSelectLogic;

	// [#52] マージされた全在庫の期限日が変わってしまう問題を解消(戻り値を変更) 2016.10.18 kawana Start

	/**
	 * <h2>入庫実績を登録する。</h2>
	 * <pre>
	 * パラメータ(header)をキーに排他チェックを行う。
	 * 処理Noを採番後、
	 * 引数で受け取ったデータを登録し、
	 * 【在庫更新.入庫[黒]】を実行する。
	 * 【入荷予定ステータス更新.完納判定】後、【入荷予定ステータス更新.完納】を行う。
	 *
	 * 【在庫更新.入庫[黒]】
	 * ・{@link StockUpdateLogic#receive(TReceivePlanH, TReceivePlanB, TStoreRecordH, List, com.oneslogi.base.exception.ErrorManager.ErrorStatus) 入庫［黒］メソッド}を呼び出す。
	 *
	 * 【入荷予定ステータス更新.完納判定】
	 * ・{@link ReceiveStatusUpdateLogic#checkReceiveComplete(long) 完納判定メソッド}を呼び出す。
	 *
	 * 【入荷予定ステータス更新.完納】
	 * ・{@link ReceiveStatusUpdateLogic#receiveComplete(List, com.oneslogi.base.exception.ErrorManager.ErrorStatus) 完納メソッド}を呼び出す。
	 *
	 * </pre>
	 * @param header 入庫実績ヘッダ：全項目
	 * @param bodyList 入庫実績ボディリスト：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 *
	* @return List<ResultReceive> 登録在庫の種別と入庫ラベルNoのリスト
	 */
	public List<ResultReceive> insert(TStoreRecordH header, List<TStoreRecordB> bodyList, ErrorStatus errSts) {

		if (header.getStoreRecordHId() != null) {
			// 排他処理を追加
			long versionNo = header.getTReceivePlanH().getVersionNo();
			// ===== 入荷予定ヘッダデータ取得 =====
			TReceivePlanH tReceivePlanHEntity = receiveInputSelectLogic.getPkEntityWithDeletedCheck(header.getTReceivePlanH());
			if ((versionNo + 1) != tReceivePlanHEntity.getVersionNo()) {
				getErrorManager().add(errSts, WmsMessageConst.ENTITY_ALREADY_DELETED_ERROR);
				return null;
			}
		} else {
			// 排他処理を追加
			long versionNo = header.getTReceivePlanH().getVersionNo();
			// ===== 入荷予定ヘッダデータ取得 =====
			TReceivePlanH tReceivePlanHEntity = receiveInputSelectLogic.getPkEntityWithDeletedCheck(header.getTReceivePlanH());
			if (versionNo != tReceivePlanHEntity.getVersionNo()) {
				getErrorManager().add(errSts, WmsMessageConst.ENTITY_ALREADY_DELETED_ERROR);
				return null;
			}

		}

		// [ON推-品向-1024] 完納判定処理を抜出し(該当処理を削除) 2015.12.18 kawana

		// ===== 入庫実績ヘッダ登録 =====
		tStoreRecordHBhv.insert(header);

		// [C-CWMS-0060] 入荷実績出力バッチ作成 2016.10.19 shimizu Start
		// 入庫実績帳票登録
		TStoreRecordR tStoreRecordR = new TStoreRecordR();
		tStoreRecordR.setStoreRecordHId(header.getStoreRecordHId());
		tStoreRecordR.setReceiveRecordOutFlg_$0();
		tStoreRecordRBhv.insert(tStoreRecordR);
		// [C-CWMS-0060] 入荷実績出力バッチ作成 2016.10.19 shimizu End

		// [ON推-品向-1024] 完納判定処理を抜出し(該当処理を削除) 2015.12.18 kawana

		List<ResultReceive> resultList = new ArrayList<ResultReceive>();

		// ===== 入庫実績ボディ登録 =====
		// bodyListのデータ件数分繰返
		for (TStoreRecordB body : bodyList) {

			// [#3584][Ver3.0] 入荷実績入力（予定あり） - 入庫数空値登録で内部エラー 2018.02.14 honma Mod Start
			if (WCC.isNotZero(body.getStoreNum())) {
				// 入庫数ゼロ以外の場合、ロケーションマスタのヘッダ取得
				MLocationCB mLocationCB = mLocationBhv.newMyConditionBean();
				mLocationCB.query().setLocationId_Equal(body.getStoreLocationId());
				MLocation mLocation = mLocationBhv.selectEntityWithDeletedCheck(mLocationCB);
				body.setMLocation(mLocation);

				// ===== 入庫格納フラグの取得 =====
				if (body.getMLocation().isLocationType$01()) {
					// 入庫格納フラグ
					body.setStoreFlg_$0();
				} else {
					// 入庫格納フラグ
					body.setStoreFlg_$1();
				}
			} else {

				// 入庫数ゼロの場合、ロケーションはNULL固定
				body.setStoreLocationId(null);
				body.setMLocation(null);

				// ===== 入庫格納フラグの設定 =====
				// 入庫数ゼロ以外の場合、入庫格納フラグ[0:未格納]固定
				body.setStoreFlg_$0();
			}
			// [#3584][Ver3.0] 入荷実績入力（予定あり） - 入庫数空値登録で内部エラー 2018.02.14 honma Mod End

			// ===== 入庫実績ボディの登録データ編集 =====
			// 入庫実績ボデの入庫実績ヘッダID設定
			body.setStoreRecordHId(header.getStoreRecordHId());

			// 入庫実績ボデの入荷予定ボディID設定
			body.setReceivePlanBId(body.getTReceivePlanB().getReceivePlanBId());

			// 処理Noの設定
			body.setProcessNo(numberingLogic.getNumbering(header.getCenterId(), WmsNumberingConst.PROCESS_NO));

			// ===== 入庫実績ボディの登録実行 =====
			tStoreRecordBBhv.insert(body);

			// ===== 入荷予定ボディの取得 =====
			TReceivePlanBCB tReceivePlanBCB = tReceivePlanBBhv.newMyConditionBean();
			// [C-CWMS-0039] センタ間移動機能を追加 2015.09.11 kawana Start
			tReceivePlanBCB.setupSelect_TReceivePlanH();
			// [C-CWMS-0039] センタ間移動機能を追加 2015.09.11 kawana End
			tReceivePlanBCB.query().setReceivePlanBId_Equal(body.getReceivePlanBId());
			TReceivePlanB tReceivePlanB = tReceivePlanBBhv.selectEntityWithDeletedCheck(tReceivePlanBCB);

			// [ON推-CT4-248] 入庫ラベルNO編集可能に変更後、ソースを修正、追加行の入庫ラベルNoの設定を削除 2014.11.21 fengc

			// ===== 在庫更新（入荷（黒））=====
			// 下記パラメータを設定して在庫更新（入荷（黒））クラスを呼出し
			List<TStoreRecordB> tStoreRecordBList = new ArrayList<TStoreRecordB>();
			tStoreRecordBList.add(body);

			// [ON推-CT4-248] 入庫ラベルNO編集可能に変更後、ソースを修正、予定入庫ラベルNoを設定 2014.11.21 fengc Start
			String planStoreLabelNo = tReceivePlanB.getPlanStoreLabelNo();
			// [#3584][Ver3.0] 入荷実績入力（予定あり） - 入庫数空値登録で内部エラー 2018.02.14 honma Mod Start
			// 入庫数=0の場合、在庫関連登録処理は行わない
			if (WCC.isNotZero(tStoreRecordBList.get(0).getStoreNum())) {
			// [#3584][Ver3.0] 入荷実績入力（予定あり） - 入庫数空値登録で内部エラー 2018.02.14 honma Mod End
				if (!CU.isNullOrEmpty(body.getStoreLabelNo())) {
					tReceivePlanB.setPlanStoreLabelNo(body.getStoreLabelNo());
					// [SK2-089] 明細分割で追加された明細の入庫ラベル№は未入力明細に対して、入庫ラベル№を設定しない修正 2014.12.22 許 Start
				} else {
					tReceivePlanB.setPlanStoreLabelNo(null);
				}
				// [SK2-089] 明細分割で追加された明細の入庫ラベル№は未入力明細に対して、入庫ラベル№を設定しない修正 2014.12.22 許 End
				// [C-CWMS-0039] センタ間移動機能を追加 2015.09.11 kawana Start
				List<ResultReceive> result = stockUpdateLogic.receive(tReceivePlanB.getTReceivePlanH(), tReceivePlanB, header, tStoreRecordBList, errSts);
				if (0 < getErrorManager().size()) {
					return null;
				}
				resultList.addAll(result);
				// [C-CWMS-0039] センタ間移動機能を追加 2015.09.11 kawana End
				tReceivePlanB.setPlanStoreLabelNo(planStoreLabelNo);
			}
			// [ON推-CT4-248] 入庫ラベルNO編集可能に変更後、ソースを修正、予定入庫ラベルNoを設定 2014.11.21 fengc End

			// [ON推-品向-1024] 完納判定処理を抜出し(該当処理を削除) 2015.12.18 kawana
		}

		// ===== 入荷予定ステータス更新 =====
		// [ON推-品向-1024] 完納判定処理を抜出し 2015.12.18 kawana Start
		if (receiveStatusUpdateLogic.checkReceiveComplete(header.getReceivePlanHId())) {
			// [ON推-品向-1024] 完納判定処理を抜出し 2015.12.18 kawana End

			// 入荷予定ヘッダの取得
			TReceivePlanH tReceivePlanH = tReceivePlanHBhv.selectByPKValue(header.getTReceivePlanH().getReceivePlanHId());
			// 入荷予定ステータス更新.完納メソッドを呼出し
			List<TReceivePlanH> result = new ArrayList<TReceivePlanH>();
			result.add(tReceivePlanH);
			receiveStatusUpdateLogic.receiveComplete(result, errSts);
		}

		return resultList;
	}

	// [ON推-品向-1024] 入荷中の商品が出荷された後に別商品の実績を登録した時にエラーとならないように変更 2015.12.18 kawana Start

	/**
	 * <h2>入庫実績ボディを登録する。</h2>
	 * <pre>
	 * 処理Noを採番後、
	 * 引数で受け取ったデータを登録し、
	 * 【在庫更新.入庫[黒]】を実行する。
	 *
	 * 【在庫更新.入庫[黒]】
	 *  ・{@link StockUpdateLogic#receive(TReceivePlanH, TReceivePlanB, TStoreRecordH, List, com.oneslogi.base.exception.ErrorManager.ErrorStatus) 入庫［黒］メソッド}を呼び出す。
	 *
	 * </pre>
	 * @param header 入庫実績ヘッダ：全項目
	 * @param bodyList 入庫実績ボディリスト：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 *
	 * @return List<ResultReceive> 登録在庫の種別と入庫ラベルNoのリスト
	 */
	public List<ResultReceive> insertBody(TStoreRecordH header, List<TStoreRecordB> bodyList, ErrorStatus errSts) {

		List<ResultReceive> resultList = new ArrayList<ResultReceive>();

		for (TStoreRecordB body : bodyList) {

			// ===== 入庫格納フラグ設定 =====

			// [#3584][Ver3.0] 入荷実績入力（予定あり） - 入庫数空値登録で内部エラー 2018.02.14 honma Mod Start
			if (WCC.isNotZero(body.getStoreNum())) {
				// 入庫数ゼロ以外の場合、ロケーションマスタ取得
				MLocationCB mLocationCB = mLocationBhv.newMyConditionBean();
				mLocationCB.query().setLocationId_Equal(body.getStoreLocationId());
				MLocation mLocation = mLocationBhv.selectEntityWithDeletedCheck(mLocationCB);
				body.setMLocation(mLocation);

				// ロケーション種別により格納フラグを設定
				if (body.getMLocation().isLocationType$01()) {

					// 未格納
					body.setStoreFlg_$0();
				} else {

					// 格納
					body.setStoreFlg_$1();
				}
			} else {

				// 入庫数ゼロの場合、ロケーションはNULL固定
				body.setStoreLocationId(null);
				body.setMLocation(null);
				// ===== 入庫格納フラグの設定 =====
				// 入庫数ゼロ以外の場合、入庫格納フラグ[0:未格納]固定
				body.setStoreFlg_$0();
			}
			// [#3584][Ver3.0] 入荷実績入力（予定あり） - 入庫数空値登録で内部エラー 2018.02.14 honma Mod End

			// ===== 登録データ編集 =====

			body.setStoreRecordHId(header.getStoreRecordHId());
			body.setReceivePlanBId(body.getTReceivePlanB().getReceivePlanBId());
			body.setProcessNo(numberingLogic.getNumbering(header.getCenterId(), WmsNumberingConst.PROCESS_NO));

			// ===== 登録実行 =====

			tStoreRecordBBhv.insert(body);

			// ===== 在庫更新 入庫[黒] =====

			if (body.getStoreNum() != null && WCC.isPositive(body.getStoreNum())) {

				List<TStoreRecordB> storeRecordBList = new ArrayList<TStoreRecordB>();
				storeRecordBList.add(body);

				TReceivePlanH planH = body.getTReceivePlanB().getTReceivePlanH();
				TReceivePlanB planB = body.getTReceivePlanB();

				// 指定入庫ラベルNoを設定
				if (!CU.isNullOrEmpty(body.getStoreLabelNo())) {
					planB.setPlanStoreLabelNo(body.getStoreLabelNo());
				} else {
					planB.setPlanStoreLabelNo(null);
				}

				// 在庫更新.入庫[黒] を呼出し
				List<ResultReceive> result = stockUpdateLogic.receive(planH, planB, header, storeRecordBList, errSts);
				if (0 < getErrorManager().size()) {
					return null;
				}
				resultList.addAll(result);
			}
		}
		return resultList;
	}

	// [ON推-品向-1024] 入荷中の商品が出荷された後に別商品の実績を登録した時にエラーとならないように変更 2015.12.18 kawana End
	// [#52] マージされた全在庫の期限日が変わってしまう問題を解消(戻り値を変更) 2016.10.18 kawana End
}
