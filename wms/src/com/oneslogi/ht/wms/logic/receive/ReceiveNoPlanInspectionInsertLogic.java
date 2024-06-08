package com.oneslogi.ht.wms.logic.receive;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.cbean.MLocationCB;
import com.oneslogi.base.dbflute.cbean.TReceivePlanBCB;
import com.oneslogi.base.dbflute.cbean.TReceivePlanHCB;
import com.oneslogi.base.dbflute.cbean.TStoreRecordHCB;
import com.oneslogi.base.dbflute.exbhv.MLocationBhv;
import com.oneslogi.base.dbflute.exbhv.TReceivePlanBBhv;
import com.oneslogi.base.dbflute.exbhv.TReceivePlanHBhv;
import com.oneslogi.base.dbflute.exbhv.TReceivePlanRBhv;
import com.oneslogi.base.dbflute.exbhv.TStoreRecordBBhv;
import com.oneslogi.base.dbflute.exbhv.TStoreRecordHBhv;
import com.oneslogi.base.dbflute.exbhv.TStoreRecordRBhv;
import com.oneslogi.base.dbflute.exbhv.WHtReceiveNoPlanInspBhv;
import com.oneslogi.base.dbflute.exentity.MLocation;
import com.oneslogi.base.dbflute.exentity.TReceivePlanB;
import com.oneslogi.base.dbflute.exentity.TReceivePlanH;
import com.oneslogi.base.dbflute.exentity.TReceivePlanR;
import com.oneslogi.base.dbflute.exentity.TStoreRecordB;
import com.oneslogi.base.dbflute.exentity.TStoreRecordH;
import com.oneslogi.base.dbflute.exentity.TStoreRecordR;
import com.oneslogi.base.dbflute.exentity.WHtReceiveNoPlanInsp;
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
 * 予定無し入荷ワーク登録ロジッククラス
 */
public class ReceiveNoPlanInspectionInsertLogic extends AbstractWmsLogic {

	@Inject
	private WHtReceiveNoPlanInspBhv wHtReceiveNoPlanInspecBhv;
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
	@Inject
	private TReceivePlanRBhv tReceivePlanRBhv;
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
	private ReceiveNoPlanInspectionSelectLogic selectLogic;

	/**
	 * <h2>予定無し入荷ワークを登録する。</h2>
	 * <pre>
	 * 引数で受取った予定無し入荷ワークを登録する。
	 * </pre>
	 * @param wHtReceiveNoPlanInspec 予定無し入荷ワーク：全項目
	 */
	public void insertWHtReceiveNoPlanInsp(WHtReceiveNoPlanInsp wHtReceiveNoPlanInspec) {

		//予定無し入荷テーブル登録
		wHtReceiveNoPlanInspecBhv.insert(wHtReceiveNoPlanInspec);

	}

	/**
	 * <h2>入荷予定を登録する。</h2>
	 * <pre>
	 * 入荷伝票No.を採番後、入荷予定ヘッダと入荷予定帳票を登録する。
	 * 引数(header)をキーに排他チェックを行う。
	 * 入荷予定ボディの登録を行う。
	 * </pre>
	 * @param header 入荷予定ヘッダ：全項目
	 * @param bodyList 入荷予定ボディリスト：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void planInsert(TReceivePlanH header, List<TReceivePlanB> bodyList, ErrorStatus errSts) {

		// ===== 入荷予定ヘッダ登録 =====
		if (header.getReceivePlanHId() == null) {
			// WMS入荷伝票Noを登録する直前に採番
			header.setReceiveSlipNo(numberingLogic.getNumbering(header.getCenterId(), WmsNumberingConst.RECEIVE_SPLIT_NO));

			// 登録
			tReceivePlanHBhv.insert(header);

			// ===== 入荷予定帳票登録 =====
			TReceivePlanR report = new TReceivePlanR();
			report.setReceivePlanHId(header.getReceivePlanHId());
			report.setRplOutFlg_$0();

			tReceivePlanRBhv.insert(report);
		}

		// ===== 入荷予定ヘッダデータ取得 ロック=====
		try {
			getPkEntityWithDeletedCheck(header);
		} catch (Exception ex) {
			// ===== 他のユーザに変更されています。内容を確認して下さい =====
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.ENTITY_ALREADY_UPDATED_ERROR);
			return;
		}

		// ===== 入荷予定ボディ登録 =====
		for (TReceivePlanB body : bodyList) {

			// 入荷予定ヘッダIDの設定
			body.setReceivePlanHId(header.getReceivePlanHId());

			// ボディ登録実行
			tReceivePlanBBhv.insert(body);
		}
	}

	/**
	 * <h2>入庫実績を登録する。</h2>
	 * <pre>
	 * 引数(header)をキーに排他チェックを行う。
	 *
	 * 処理Noを採番後、引数の入庫実績ヘッダデータ及び入庫実績ボディデータを登録する。
	 * 【在庫更新.入荷[黒]】を呼出し、入荷予定ボディの入荷ステータスを"03"(入荷済)で更新する。
	 * 下記の設定で入荷予定ヘッダを更新する。
	 * ・入荷予定ヘッダの入荷ステータスが"0"(未入荷)または"1"(入荷済)の場合は、入荷ステータスを"2"(入荷中)に設定
	 * ・入荷納品ステータスを"1"(完納)に設定
	 *
	 * 【在庫更新.入荷[黒]】
	 * ・{@link StockUpdateLogic#receive(TReceivePlanH, TReceivePlanB, TStoreRecordH, List, com.oneslogi.base.exception.ErrorManager.ErrorStatus) 入庫［黒］メソッド}を呼び出す。
	 *
	 * </pre>
	 * @param header 入庫実績ヘッダ：全項目
	 * @param bodyList 入庫実績ボディリスト：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void insert(TStoreRecordH header, List<TStoreRecordB> bodyList, ErrorStatus errSts) {

		// ===== 入荷予定ヘッダデータ取得 ロック=====
		try {
			getPkEntityWithDeletedCheck(header.getTReceivePlanH());
		} catch (Exception ex) {
			// ===== 他のユーザに変更されています。内容を確認して下さい =====
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.ENTITY_ALREADY_UPDATED_ERROR);
			return;
		}

		Long storeRecordHId = checkTStoreRecordH(header);
		header.setStoreRecordHId(storeRecordHId);

		if (header.getStoreRecordHId() == null) {
			// ===== 入庫実績ヘッダ登録 =====
			tStoreRecordHBhv.insert(header);
			// [C-CWMS-0060] 入荷実績出力バッチ作成 2016.10.19 shimizu Start
			// 入庫実績帳票登録
			TStoreRecordR tStoreRecordR = new TStoreRecordR();
			tStoreRecordR.setStoreRecordHId(header.getStoreRecordHId());
			tStoreRecordR.setReceiveRecordOutFlg_$0();
			tStoreRecordRBhv.insert(tStoreRecordR);
			// [C-CWMS-0060] 入荷実績出力バッチ作成 2016.10.19 shimizu End
		}

		// ===== 入庫実績ボディ登録 =====
		// bodyListのデータ件数分繰返
		for (TStoreRecordB body : bodyList) {
			// ロケーションマスタのヘッダ取得
			MLocationCB mLocationCB = mLocationBhv.newMyConditionBean();
			mLocationCB.query().setLocationId_Equal(body.getStoreLocationId());
			MLocation mLocation = mLocationBhv.selectEntityWithDeletedCheck(mLocationCB);
			body.setMLocation(mLocation);
			// 入庫格納フラグ
			if (mLocation.isLocationType$01()) {
				body.setStoreFlg_$0();
			} else {
				body.setStoreFlg_$1();
			}

			// 入力区分
			body.setInputType_$30();

			// ===== 入庫実績ボディの登録データ編集 =====
			// 入庫実績ボディの入庫実績ヘッダID設定
			body.setStoreRecordHId(header.getStoreRecordHId());

			// 入庫実績ボディの入荷予定ボディID設定
			body.setReceivePlanBId(body.getTReceivePlanB().getReceivePlanBId());

			// 処理Noの設定
			body.setProcessNo(numberingLogic.getNumbering(header.getCenterId(), WmsNumberingConst.PROCESS_NO));

			// ===== 入庫実績ボディの登録実行 =====
			tStoreRecordBBhv.insert(body);

			// ===== 入荷予定ボディの取得 =====
			TReceivePlanBCB tReceivePlanBCB = tReceivePlanBBhv.newMyConditionBean();
			// [C-CWMS-0039] センタ間移動機能を追加 2015.10.28 kawana Start
			tReceivePlanBCB.setupSelect_TReceivePlanH();
			// [C-CWMS-0039] センタ間移動機能を追加 2015.10.28 kawana End
			tReceivePlanBCB.query().setReceivePlanBId_Equal(body.getReceivePlanBId());
			TReceivePlanB tReceivePlanB = tReceivePlanBBhv.selectEntityWithDeletedCheck(tReceivePlanBCB);

			// ===== 在庫更新（入荷（黒））=====
			// 下記パラメータを設定して在庫更新（入荷（黒））クラスを呼出し
			List<TStoreRecordB> tStoreRecordBList = new ArrayList<TStoreRecordB>();
			tStoreRecordBList.add(body);

			String planStoreLabelNo = tReceivePlanB.getPlanStoreLabelNo();
			// [#3029][Ver3.0] Java側のBigDecimal共通関数化 2018.03.02 honma Mod Start
			if (!WCC.isEqual(tStoreRecordBList.get(0).getStoreNum(), WCC.ZERO)) {
			// [#3029][Ver3.0] Java側のBigDecimal共通関数化 2018.03.02 honma Mod End
				if (!CU.isNullOrEmpty(body.getStoreLabelNo())) {
					tReceivePlanB.setPlanStoreLabelNo(body.getStoreLabelNo());
				}
				// [#4194][Ver3.0] 入庫ラベル発行処理を共通化 2018.04.27 kawana Start
				// [C-CWMS-0039] センタ間移動機能を追加 2015.10.28 kawana Start
				List<ResultReceive> resultList = stockUpdateLogic.receive(tReceivePlanB.getTReceivePlanH(), tReceivePlanB, header, tStoreRecordBList, errSts);
				if (0 < getErrorManager().size()) {
					return;
				}
				body.setStoreLabelNo(resultList.get(0).storeLabelNo);
				// [C-CWMS-0039] センタ間移動機能を追加 2015.10.28 kawana End
				// [#4194][Ver3.0] 入庫ラベル発行処理を共通化 2018.04.27 kawana End
				tReceivePlanB.setPlanStoreLabelNo(planStoreLabelNo);

				// 入荷予定ボディの入荷ステータス更新
				if (tReceivePlanB.isReceiveStatus$01() || tReceivePlanB.isReceiveStatus$02()) {
					tReceivePlanB.setReceiveStatus_$03();
					tReceivePlanBBhv.update(tReceivePlanB);
				}
			}
		}

		// ===== 入荷予定ヘッダステータス更新 =====
		received(header.getTReceivePlanH());

		return;
	}

	/**
	 * <h2>入荷予定ヘッダの入荷ステータスを更新する。</h2>
	 * <pre>
	 * 引数を条件に【予定無し入荷関連データ取得.入荷予定ボディ取得】で入荷予定ボディ及び入荷予定ヘッダのデータを取得する。
	 * 下記の設定で入荷予定ヘッダを更新する。
	 * ・入荷予定ヘッダの入荷ステータスが"0"(未入荷)または"1"(入荷済)の場合は、入荷ステータスを"2"(入荷中)に設定
	 * ・入荷納品ステータスを"1"(完納)に設定
	 *
	 * 【予定無し入荷関連データ取得.入荷予定ボディ取得】
	 * ・{@link ReceiveNoPlanInspectionSelectLogic#selectReceivePlanB(TReceivePlanH) 入荷予定ボディ取得 メソッド}を呼び出す。
	 * </pre>
	 * @param planH 入荷予定ヘッダ：入荷予定ヘッダID
	 */
	public void received(TReceivePlanH planH) {

		//入荷予定ボディ単位の入庫実績データの取得
		List<TReceivePlanB> planBodyList = selectLogic.selectReceivePlanB(planH);

		if (planBodyList.size() ==0) {
			// ===== 致命的例外をスローする(状態不正) =====
			getErrorManager().throwException(new IllegalStateException());
			return ;
		} else {
			TReceivePlanH receiveH = planBodyList.get(0).getTReceivePlanH();
			if (receiveH.isReceiveStatus$01() || receiveH.isReceiveStatus$03()){
     			//未入荷か入荷済なら入荷中に更新に変更
				receiveH.setReceiveStatus_$02();
			}
			receiveH.setReceiveDeliveryStatus_$01();

			// 入荷予定ヘッダの更新
			tReceivePlanHBhv.update(receiveH);
		}
	}

	/**
	 * <h2>入庫実績ヘッダの存在チェックを行う。</h2>
	 * <pre>
	 * 引数を条件に入庫実績ヘッダのデータ検索し、
	 * 検索対象が見つからない場合、NULLを返す。
	 * 検索結果が複数件の場合、１件目の入庫実績ヘッダIDを返却する。
	 * </pre>
	 * @param header 入庫実績ヘッダ：荷主ID・センタID・処理区分ID・入荷予定ヘッダID
	 * @return Long 入庫実績ヘッダID
	 */
	public Long checkTStoreRecordH(TStoreRecordH header) {

		Long id = null;
		if (header.getStoreRecordHId() != null) {
			return header.getStoreRecordHId();
		}

		//入庫実績ヘッダのデータ取得
		TStoreRecordHCB CB = tStoreRecordHBhv.newMyConditionBean();
		CB.setupSelect_TReceivePlanH();
		CB.query().setClientId_Equal(header.getClientId());
		CB.query().setCenterId_Equal(header.getCenterId());
		CB.query().setProcessTypeId_Equal(header.getProcessTypeId());
		CB.query().setReceivePlanHId_Equal(header.getReceivePlanHId());

		List<TStoreRecordH> lst = tStoreRecordHBhv.selectList(CB);

		if (lst.size() == 0) {
			//該当データが存在しません。
			return null;
		} else {
			id = lst.get(0).getStoreRecordHId();
		}

		return id;
	}

	/**
	 * <h2>入荷予定ヘッダの存在チェックを行う。</h2>
	 * <pre>
	 * 引数を条件に入荷予定ヘッダのデータ検索して返却する。
	 * </pre>
	 * @param entity 入荷予定ヘッダ：入荷予定ヘッダID
	 * @return 入荷予定ヘッダ
	 */

	public TReceivePlanH getPkEntityWithDeletedCheck(TReceivePlanH entity) {
		if (entity.getReceivePlanHId() == null) {
			return null;
		}

		TReceivePlanHCB cb = tReceivePlanHBhv.newMyConditionBean();
		cb.query().setReceivePlanHId_Equal(entity.getReceivePlanHId());
		cb.lockForUpdate();
		return tReceivePlanHBhv.selectEntityWithDeletedCheck(cb);
	}
}
