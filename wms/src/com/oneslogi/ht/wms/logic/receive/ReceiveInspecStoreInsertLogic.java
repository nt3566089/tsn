package com.oneslogi.ht.wms.logic.receive;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.cbean.MLocationCB;
import com.oneslogi.base.dbflute.cbean.TReceivePlanBCB;
import com.oneslogi.base.dbflute.cbean.TReceivePlanHCB;
import com.oneslogi.base.dbflute.cbean.TStoreRecordHCB;
import com.oneslogi.base.dbflute.exbhv.MLocationBhv;
import com.oneslogi.base.dbflute.exbhv.TReceivePlanBBhv;
import com.oneslogi.base.dbflute.exbhv.TReceivePlanHBhv;
import com.oneslogi.base.dbflute.exbhv.TStoreRecordBBhv;
import com.oneslogi.base.dbflute.exbhv.TStoreRecordHBhv;
import com.oneslogi.base.dbflute.exbhv.TStoreRecordRBhv;
import com.oneslogi.base.dbflute.exbhv.WHtReceiveInspectionBhv;
import com.oneslogi.base.dbflute.exentity.BUser;
import com.oneslogi.base.dbflute.exentity.MLocation;
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.base.dbflute.exentity.TReceivePlanB;
import com.oneslogi.base.dbflute.exentity.TReceivePlanH;
import com.oneslogi.base.dbflute.exentity.TStoreRecordB;
import com.oneslogi.base.dbflute.exentity.TStoreRecordH;
import com.oneslogi.base.dbflute.exentity.TStoreRecordR;
import com.oneslogi.base.dbflute.exentity.WHtReceiveInspection;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.WmsNumberingConst;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.core.logic.NumberingCenterLogic;
import com.oneslogi.wms.core.logic.stockupdate.StockUpdateLogic;
import com.oneslogi.wms.core.logic.stockupdate.StockUpdateLogic.ResultReceive;
import com.oneslogi.wms.core.logic.stockupdate.StoreLabelNoNumberingLogic;


/**
 * 入荷検品・格納ワーク登録ロジッククラス
 */
public class ReceiveInspecStoreInsertLogic extends AbstractWmsLogic {

	@Inject
	private WHtReceiveInspectionBhv wHtReceiveInspectionBhv;
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
	private ReceiveInspecStoreSelectLogic selectLogic;
	// [セット品対応] 入庫Noの検索、登録をクラス化 2015.11.18 kawana Start
	@Inject
	private StoreLabelNoNumberingLogic storeLabelNoNumberingLogic;
	// [セット品対応] 入庫Noの検索、登録をクラス化 2015.11.18 kawana End

	/**
	 * <h2>入荷検品ワークを登録する。</h2>
	 * <pre>
	 * 引数のデータを入荷検品ワークに登録する。
	 * </pre>
	 * @param wHtReceiveInspection 入荷検品ワーク：全項目
	 */
	public void insertWHtReceiveInspection(WHtReceiveInspection wHtReceiveInspection) {

		//入荷検品テーブル登録
		wHtReceiveInspectionBhv.insert(wHtReceiveInspection);

	}

	/**
	 * <h2>入庫実績を登録する。</h2>
	 * <pre>
	 * 引数(header)をキーに入荷予定ヘッダを検索する。
	 * データが取得できなった場合は、排他エラーをエラーステータスに設定する。
	 * 引数(header)をキーに入庫実績ヘッダを検索する。
	 * データが取得できなった場合は、入庫実績ヘッダを登録する。
	 *
	 * 処理Noを採番後、引数の入庫実績ボディを登録する。
	 * 入庫実績ボディデータに紐づく入荷予定ボディデータを取得し、
	 * 取得したデータの予定入庫ラベルNo.に入庫ラベルNo.を設定する。
	 * 入庫ラベルNo.が設定されていない場合は、【入庫No管理.入庫ラベルNo. の採番】で入庫ラベルNo.を取得する。
	 * 【在庫更新.入荷[黒]】を実行する。
	 *
	 * 入荷予定ボディの入荷ステータスを"03"(入荷済)に更新し、
	 * 入荷予定ヘッダのステータス更新を行う。
	 *
	 * 【入庫No管理.入庫ラベルNo. の採番】
	 * ・{@link StoreNoManageLogic#numberingStoreLabelNo() 入庫ラベルNo. の採番メソッド}を呼び出す。
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

			// [2.1.0-CT-013]バグ対応修正  2016.10.28 nayzaw Start

			// [C-CWMS-0060] 入荷実績出力バッチ作成 2016.10.19 shimizu Start
			// 入庫実績帳票登録
			TStoreRecordR tStoreRecordR = new TStoreRecordR();
			tStoreRecordR.setStoreRecordHId(header.getStoreRecordHId());
			tStoreRecordR.setReceiveRecordOutFlg_$0();
			tStoreRecordRBhv.insert(tStoreRecordR);
			// [C-CWMS-0060] 入荷実績出力バッチ作成 2016.10.19 shimizu End

			// [2.1.0-CT-013]バグ対応修正 2016.10.28 nayzaw End
		}

		// 別明細で同一商品を同じ場所に入荷した際に同一入庫ラベルNoをつける
		// 同じ属性の商品は同一入庫ラベルNoを設定する。
		// 属性と入庫ラベルNoを格納するHashMapを定義
		HashMap<String,String> mapStoreLabelNo = new HashMap<String,String>();

		// キーが無ければ入庫ラベルNo採番し、キーと一緒にput
		// このくらいでできるはずらしい

		// ===== 入庫実績ボディ登録 =====
		// bodyListのデータ件数分繰返
		for (TStoreRecordB body : bodyList) {
			// ロケーションマスタのヘッダ取得
			MLocationCB mLocationCB = mLocationBhv.newMyConditionBean();
			mLocationCB.query().setLocationId_Equal(body.getStoreLocationId());
			MLocation mLocation = mLocationBhv.selectEntityWithDeletedCheck(mLocationCB);
			body.setMLocation(mLocation);
			// 入庫格納フラグ
			body.setStoreFlg_$1();
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
				} else {
					// 別明細で同一商品を同じ場所に入荷した際に同一入庫ラベルNoをつける
					// 在庫キーを作成(荷姿は管理するようになったら追加)
					String strStockKey = new String();
					strStockKey = strStockKey.concat(tReceivePlanB.getProductId().toString());
					strStockKey = strStockKey.concat("@@@");
					strStockKey = strStockKey.concat(tStoreRecordBList.get(0).getMLocation().getLocationId().toString());
					strStockKey = strStockKey.concat("@@@");
					strStockKey = strStockKey.concat(header.getDepositId().toString());
					strStockKey = strStockKey.concat("@@@");
					if( tStoreRecordBList.get(0).getLot() != null ){
						strStockKey = strStockKey.concat(tStoreRecordBList.get(0).getLot());
						strStockKey = strStockKey.concat("@@@");
					}
					if( tStoreRecordBList.get(0).getLimitDt() != null ){
						strStockKey = strStockKey.concat(tStoreRecordBList.get(0).getLimitDt());
					}

					// 在庫キーが存在しなければ、マップに在庫キーと採番した入庫ラベルNoを追加
					if( mapStoreLabelNo.containsKey(strStockKey) == false ){
						// [セット品対応] 入庫Noの検索、登録をクラス化 2015.11.18 kawana Start
						mapStoreLabelNo.put(strStockKey, storeLabelNoNumberingLogic.numbering());
						// [セット品対応] 入庫Noの検索、登録をクラス化 2015.11.18 kawana End
					}
					// 在庫キーに紐付く入庫ラベルNoを設定
					tReceivePlanB.setPlanStoreLabelNo(mapStoreLabelNo.get(strStockKey));
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
	 * 引数を条件に【入荷検品.格納関連データ取得.入荷予定情報取得】で入荷予定ボディのデータを取得し、
	 * 入庫数合計と予定数を比較する。
	 * 取得した全データで入庫数合計が予定数以上の場合、
	 * 入荷予定ヘッダの入荷ステータスを"03"(入荷済)、入荷納品ステータスを"01"(完納)で更新する。
	 * 上記以外の場合、入荷予定ヘッダの入荷ステータスを"02"(入荷中)で更新する。
	 *
	 * 【入荷検品.格納関連データ取得.入荷予定情報取得】
	 * ・{@link ReceiveInspecStoreSelectLogic#selectReceivePlanListData(TReceivePlanH, MProduct, BUser) 入荷予定情報取得 メソッド}を呼び出す。
	 * </pre>
	 * @param planH 入荷予定ヘッダ：センタID・荷主ID・入荷予定ヘッダID・WMS入荷伝票No.・センタ間移動フラグ
	 */
	public void received(TReceivePlanH planH) {

		//入荷予定ボディ単位の入庫実績データの取得
		List<TReceivePlanB> planBodyList = selectLogic.selectReceivePlanListData(planH, null, null);

		if (planBodyList.size() ==0) {
			// ===== 致命的例外をスローする(状態不正) =====
			getErrorManager().throwException(new IllegalStateException());
			return ;
		}

		//完納判断処理
		boolean finishFlg = true;
		for (TReceivePlanB planB : planBodyList) {
			if (WCC.isGreaterThan(planB.getPlanNum(), planB.getSumStoreNum())) {
				finishFlg = false;
				break;
			}
		}

		TReceivePlanH receiveH = planBodyList.get(0).getTReceivePlanH();
		//未入荷か入荷済なら入荷中に更新
		if (finishFlg) {
			// [ONEsLOGI Cloud/WMS バグ・品質向上対策 バグ #44 ]入荷予定ヘッダ.入荷ステータスを入荷済に更新しているソースを外す 2016.10.28 nayzaw
			receiveH.setReceiveDeliveryStatus_$01();
		}else{
			receiveH.setReceiveStatus_$02();
		}

		tReceivePlanHBhv.update(receiveH);
	}

	/**
	 * <h2>入庫実績ヘッダの存在チェックを行う。</h2>
	 * <pre>
	 * 引数を条件に入庫実績ヘッダデータを取得し、
	 * 取得した１件目のデータの入庫実績ヘッダIDを返す。
	 * データが取得できなかった場合はNULLを返す。
	 *
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
	 * <h2>入荷予定ヘッダデータを取得する。</h2>
	 * <pre>
	 * 引数をキーに入荷予定ヘッダデータを取得する。
	 * </pre>
	 * @param entity 入荷予定ヘッダ：入荷予定ヘッダID
	 * @return TReceivePlanH 入荷予定ヘッダ
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
