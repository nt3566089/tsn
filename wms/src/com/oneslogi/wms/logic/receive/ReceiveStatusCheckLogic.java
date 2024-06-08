package com.oneslogi.wms.logic.receive;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.exentity.TReceivePlanB;
import com.oneslogi.base.dbflute.exentity.TReceivePlanH;
import com.oneslogi.base.dbflute.exentity.TStoreRecordB;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 入荷状態チェックロジッククラス
 */
public class ReceiveStatusCheckLogic extends AbstractWmsLogic {

	/**
	 * <h2>入荷予定変更起動時処理を行う。</h2>
	 * <pre>
	 * 入荷予定ヘッダリストがNullの場合は、致命的例外をスローする。
	 * 入荷予定ヘッダリスト.入荷ステータスのチェックを行う。
	 * ・入荷ステータスが未入荷 または エラー以外の場合は、入荷予定修正不可エラーをエラー管理クラスに登録する。
	 * </pre>
	 * @param rPlanHeaderList 入荷予定ヘッダリスト：入荷ステータス
	 * @param rPlanBodyList 入荷予定ボディリスト：（現在使用しない）
	 * @param sRecordBodyList 入庫実績ボディリスト：（現在使用しない）
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void receivePlanUpdate(List<TReceivePlanH> rPlanHeaderList, List<TReceivePlanB> rPlanBodyList,
			List<TStoreRecordB> sRecordBodyList, ErrorStatus errSts) {

		// ===== 引数チェック =====
		// 入荷予定ヘッダリストの件数が0件の場合は 致命的例外をスローする
		if (rPlanHeaderList == null) {
			this.getErrorManager().throwException(new IllegalArgumentException());
		}

		// 入荷予定変更起動時処理
		// 入荷予定ヘッダリストの件数分繰返
		for (TReceivePlanH head : rPlanHeaderList) {

			// 入荷予定ヘッダリスト - 入荷ステータスが未入荷 または エラー以外の場合は エラー
			if (!(head.isReceiveStatus$01() || head.isReceiveStatus$99())) {
				// エラーメッセージをエラー管理クラスに登録
				this.getErrorManager().add(errSts, WmsMessageConst.RECEIVE_PLAN_CHANGE_START_ERROR);
				// 処理終了
				return;
			}
		}
	}

	/**
	 * <h2>入荷実績登録起動時処理を行う。</h2>
	 * <pre>
	 * 引数の入荷予定ヘッダリスト、入荷予定ボディリストがNullの場合は、致命的例外をスローする。
	 * 入荷予定ヘッダリスト.入荷ステータスのチェックを行う。
	 * ・入荷ステータスがエラー以外の場合は、入荷実績登録不可エラーをエラー管理クラスに登録する。
	 * 入荷予定ボディリスト.入荷ステータス(最大値)のチェックを行う。
	 * ・入荷ステータス(最大値)がエラー以外の場合は、入荷実績登録不可エラーをエラー管理クラスに登録する。
	 * </pre>
	 * @param rPlanHeaderList 入荷予定ヘッダリスト：入荷予定ヘッダID・入荷ステータス
	 * @param rPlanBodyList 入荷予定ボディリスト：入荷予定ヘッダID・入荷ステータス
	 * @param sRecordBodyList 入庫実績ボディリスト：（現在使用しない）
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void receiveResultEntry(List<TReceivePlanH> rPlanHeaderList, List<TReceivePlanB> rPlanBodyList,
			List<TStoreRecordB> sRecordBodyList, ErrorStatus errSts) {

		// ===== 引数チェック =====
		// 入荷予定ヘッダリストの件数が0件の場合は 致命的例外をスローする
		if (rPlanHeaderList == null) {
			this.getErrorManager().throwException(new IllegalArgumentException());
		}

		// 入荷予定ボディリストの件数が0件の場合は 致命的例外をスローする
		if (rPlanBodyList == null) {
			this.getErrorManager().throwException(new IllegalArgumentException());
		}

		// 入荷実績登録起動時処理
		// 入荷予定ヘッダリストの件数分繰返
		for (TReceivePlanH head : rPlanHeaderList) {

			// 入荷予定ヘッダリスト - 入荷ステータスがエラーの場合は エラー
			if (head.isReceiveStatus$99()) {
				// エラーメッセージをエラー管理クラスに登録
				this.getErrorManager().add(errSts, WmsMessageConst.RECEIVE_RESULT_INSERT_START_ERROR);
				// 処理終了
				return;

			// 入荷予定ヘッダリスト - 入荷ステータスがエラー以外の場合
			} else {
				// 入荷ステータスの集約用リストの初期化
				List<String> receiveStatusList = new ArrayList<String>();

				// 入荷予定ボディリストの件数分繰返
				for (TReceivePlanB body : rPlanBodyList) {

					// 入荷予定ヘッダリスト - 入荷予定ヘッダIDが入荷予定ボディリスト - 入荷予定ヘッダIDと一致する場合
					if(head.getReceivePlanHId().equals(body.getReceivePlanHId())) {
						// 入荷ステータスの集約用リストに入荷予定ボディリスト - 入荷ステータスを追加する
						receiveStatusList.add(body.getReceiveStatus());
					}
				}

				// 入荷ステータスの集約用リストが何も存在しない場合
				if (receiveStatusList.isEmpty()) {
					// 次の処理
					continue;
				}

				// 入荷ステータスの集約用リスト - 入荷ステータス(最大値)がエラーの場合は エラー
				if (Collections.max(receiveStatusList).equals("99")) {
					// エラーメッセージをエラー管理クラスに登録
					this.getErrorManager().add(errSts, WmsMessageConst.RECEIVE_RESULT_INSERT_START_ERROR);
					// 処理終了
					return;
				}
			}
		}
	}

	/**
	 * <h2>ＨＴ検品中時処理を行う。</h2>
	 * <pre>
	 * 引数の入荷予定ヘッダリスト、入荷予定ボディリスト、入庫実績ボディリストがNullの場合は、致命的例外をスローする。
	 * 入荷予定ヘッダID毎にまとめた入荷予定ボディリストのマップを作成する。
	 * 入荷予定ボディID毎にまとめた入庫実績ボディリストのマップを作成する。
	 * 入荷ステータスが入荷中の場合、HT検品中か判定する。
	 * 入荷ヘッダ毎に更新日時が最新の入庫実績ボディの入力区分を確認し、HTの場合はHT検品中とし「true」を返す。
	 * </pre>
	 * @param rPlanHeaderList 入荷予定ヘッダリスト：入荷ステータス・入荷予定ヘッダID
	 * @param rPlanBodyList 入荷予定ボディリスト：入荷予定ヘッダID・入荷予定ボディID
	 * @param sRecordBodyList 入庫実績ボディリスト：入荷予定ヘッダID・更新日時・入力区分
	 * @return boolean true : HT検品中  false : HT検品中ではない
	 */
	public boolean htReceive(List<TReceivePlanH> rPlanHeaderList, List<TReceivePlanB> rPlanBodyList, List<TStoreRecordB> sRecordBodyList) {

		// ===== 引数チェック =====
		// 入荷予定ヘッダリストの件数が0件の場合は 致命的例外をスローする
		if (rPlanHeaderList == null) {
			this.getErrorManager().throwException(new IllegalArgumentException());
		}

		// 入荷予定ボディリストの件数が0件の場合は 致命的例外をスローする
		if (rPlanBodyList == null) {
			this.getErrorManager().throwException(new IllegalArgumentException());
		}

		// 入庫実績ボディリストの件数が0件の場合は 致命的例外をスローする
		if (sRecordBodyList == null) {
			this.getErrorManager().throwException(new IllegalArgumentException());
		}

		// [ON推-品向-824] HT検品中の判断を変更 2015.06.18 kawana Start

		// 入荷予定ヘッダID毎にまとめた入荷予定ボディリストのマップを作成
		Map<Long, List<TReceivePlanB>> planBodyListMap = new HashMap<Long, List<TReceivePlanB>>();
		for (TReceivePlanB planBody : rPlanBodyList) {

			long headId = planBody.getReceivePlanHId();

			if (planBodyListMap.containsKey(headId)) {
				planBodyListMap.get(headId).add(planBody);
			} else {
				List<TReceivePlanB> planBodyList = new ArrayList<TReceivePlanB>();
				planBodyList.add(planBody);
				planBodyListMap.put(headId, planBodyList);
			}
		}

		// 入荷予定ボディID毎にまとめた入庫実績ボディリストのマップを作成
		Map<Long, List<TStoreRecordB>> recordBodyListMap = new HashMap<Long, List<TStoreRecordB>>();
		for (TStoreRecordB recordBody : sRecordBodyList) {

			long planBodyId = recordBody.getReceivePlanBId();

			if (recordBodyListMap.containsKey(planBodyId)) {
				recordBodyListMap.get(planBodyId).add(recordBody);
			} else {
				List<TStoreRecordB> recordBodyList = new ArrayList<TStoreRecordB>();
				recordBodyList.add(recordBody);
				recordBodyListMap.put(planBodyId, recordBodyList);
			}
		}

		// ＨＴ検品中時処理
		// 入荷予定ヘッダリストの件数分繰返
		for (TReceivePlanH head : rPlanHeaderList) {

			// 入荷ステータスが「入荷中」以外の場合は次のヘッダへ
			if (!head.isReceiveStatus$02()) {
				continue;
			}

			// 対応する入荷予定ボディを取得
			List<TReceivePlanB> planBodyList = planBodyListMap.get(head.getReceivePlanHId());
			if (planBodyList == null) {
				continue;
			}

			Timestamp lastUpdDt = null;
			String lastInputType = null;

			// 入荷予定ボディの件数分繰返
			for (TReceivePlanB planBody : planBodyList) {

				// 対応する入庫実績ボディを取得
				List<TStoreRecordB> recordBodyList = recordBodyListMap.get(planBody.getReceivePlanBId());
				if (recordBodyList == null) {
					continue;
				}

				// 入庫実績ボディの件数分繰返
				for (TStoreRecordB recordBody : recordBodyList) {

					// 最新更新日と比較
					Timestamp updDt = recordBody.getUpdDt();
					String inputType = recordBody.getInputType();

					if(updDt == null || CU.isNullOrEmpty(inputType)) {

						continue;
					}

					if (lastUpdDt == null
							|| (lastUpdDt.compareTo(updDt) < 0)) {

						// 最新更新日、最新更新日の入力区分を変更
						lastUpdDt = updDt;
						lastInputType = inputType;
					}
				}

			}

			if (lastInputType == null) {
				continue;
			}

			// 最新更新日の入力区分が「HT」の場合はtrueを返す
			// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
			if (CDef.InputType.codeOf(lastInputType) == CDef.InputType.$30) {
			// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe End

				// [ON推-品向-826] 入荷取消時にHT・他端末検品中チェックを追加 2015.06.22 kawana Start
				return true;
				// [ON推-品向-826] 入荷取消時にHT・他端末検品中チェックを追加 2015.06.22 kawana End
			}
		}

		// [ON推-品向-824] HT検品中の判断を変更 2015.06.18 kawana End

		// [ON推-品向-826] 入荷取消時にHT・他端末検品中チェックを追加 2015.06.22 kawana Start
		return false;
		// [ON推-品向-826] 入荷取消時にHT・他端末検品中チェックを追加 2015.06.22 kawana End
	}

	/**
	 * <h2>入荷エラーチェック起動時処理を行う。</h2>
	 * <pre>
	 * 入荷予定ヘッダリストがNullの場合は、致命的例外をスローする。
	 * 入荷予定ヘッダリスト.入荷ステータスのチェックを行う。
	 * ・入荷ステータスが未入荷 または エラー以外の場合は、入荷エラーチェック不可エラーをエラー管理クラスに登録する。
	 * </pre>
	 * @param rPlanHeaderList 入荷予定ヘッダリスト：入荷ステータス
	 * @param rPlanBodyList 入荷予定ボディリスト：（現在使用しない）
	 * @param sRecordBodyList 入庫実績ボディリスト：（現在使用しない）
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void receiveErrorCheck(List<TReceivePlanH> rPlanHeaderList, List<TReceivePlanB> rPlanBodyList,
			List<TStoreRecordB> sRecordBodyList, ErrorStatus errSts) {

		// ===== 引数チェック =====
		// 入荷予定ヘッダリストの件数が0件の場合は 致命的例外をスローする
		if (rPlanHeaderList == null) {
			this.getErrorManager().throwException(new IllegalArgumentException());
		}

		// 入荷エラーチェック起動時処理
		// 入荷予定ヘッダリストの件数分繰返
		for (TReceivePlanH head : rPlanHeaderList) {

			// 入荷予定ヘッダリスト - 入荷ステータスが未入荷 または エラー以外の場合は エラー
			if (!(head.isReceiveStatus$01() || head.isReceiveStatus$99())) {
				// エラーメッセージをエラー管理クラスに登録
				this.getErrorManager().add(errSts, WmsMessageConst.RECEIVE_ERROR_CHECK_START_ERROR);
				// 処理終了
				return;
			}
		}
	}

	/**
	 * <h2>入荷予定削除起動時処理を行う。</h2>
	 * <pre>
	 * 入荷予定ヘッダリストがNullの場合は、致命的例外をスローする。
	 * 入荷予定ヘッダリスト.入荷ステータスのチェックを行う。
	 * ・入荷ステータスが未入荷 または エラー以外の場合は、入荷予定削除起動不可エラーをエラー管理クラスに登録する。
	 * </pre>
	 * @param rPlanHeaderList 入荷予定ヘッダリスト：入荷ステータス
	 * @param rPlanBodyList 入荷予定ボディリスト：（現在使用しない）
	 * @param sRecordBodyList 入庫実績ボディリスト：（現在使用しない）
	 * @param errSts エラー時に設定するエラーステータス
	 * @return boolean true : 入荷予定削除可 、 false : 入荷予定削除不可
	 */
	public boolean receivePlanDelete(List<TReceivePlanH> rPlanHeaderList, List<TReceivePlanB> rPlanBodyList,
			List<TStoreRecordB> sRecordBodyList, ErrorStatus errSts) {

		// ===== 引数チェック =====
		// 入荷予定ヘッダリストの件数が0件の場合は 致命的例外をスローする
		if (rPlanHeaderList == null) {
			this.getErrorManager().throwException(new IllegalArgumentException());
		}

		// 入荷予定削除起動時処理
		// 入荷予定ヘッダリストの件数分繰返
		for (TReceivePlanH head : rPlanHeaderList) {

			// 入荷予定ヘッダリスト - 入荷ステータスが未入荷 または エラー以外の場合は エラー
			if (!(head.isReceiveStatus$01() || head.isReceiveStatus$99())) {
				// エラーメッセージをエラー管理クラスに登録
				this.getErrorManager().add(errSts, WmsMessageConst.RECEIVE_PLAN_DELETE_START_ERROR);
				// [C-CWMS-0039] センタ間移動機能を追加 2015.09.08 kawana Start
				// 処理終了
				return false;
				// [C-CWMS-0039] センタ間移動機能を追加 2015.09.08 kawana End
			}
		}

		// [C-CWMS-0039] センタ間移動機能を追加 2015.09.08 kawana Start
		return true;
		// [C-CWMS-0039] センタ間移動機能を追加 2015.09.08 kawana End
	}

	// [C-CWMS-0039] センタ間移動機能を追加 2015.09.10 kawana Start
	/**
	 * <h2>入荷予定削除起動時処理を行う。</h2>
	 * <pre>
	 * 引数をキーに入荷予定削除が可能か判定する。
	 * </pre>
	 * @param receivePlanHList 入荷予定ヘッダリスト：入荷ステータス
	 * @return boolean true : 入荷予定削除可、false : 入荷予定削除不可
	 */
	public boolean receivePlanDelete(List<TReceivePlanH> receivePlanHList) {
		return receivePlanDelete(receivePlanHList, null, null, null);
	}
	// [C-CWMS-0039] センタ間移動機能を追加 2015.09.10 kawana End

	/**
	 * <h2>入荷分納登録起動時処理を行う。</h2>
	 * <pre>
	 * 入荷予定ヘッダリストがNullの場合は、致命的例外をスローする。
	 * 入荷予定ヘッダリスト.入荷ステータスと入荷納品ステータスのチェックを行う。
	 * ・入荷ステータスが入荷済 かつ 入荷納品ステータスが未完以外の場合は、入荷分納登録起動不可をエラー管理クラスに登録する。
	 * </pre>
	 * @param rPlanHeaderList 入荷予定ヘッダリスト：入荷ステータス・入荷納品ステータス
	 * @param rPlanBodyList 入荷予定ボディリスト：（現在使用しない）
	 * @param sRecordBodyList 入庫実績ボディリスト：（現在使用しない）
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void receiveInstallment(List<TReceivePlanH> rPlanHeaderList, List<TReceivePlanB> rPlanBodyList,
			List<TStoreRecordB> sRecordBodyList, ErrorStatus errSts) {

		// ===== 引数チェック =====
		// 入荷予定ヘッダリストの件数が0件の場合は 致命的例外をスローする
		if (rPlanHeaderList == null) {
			this.getErrorManager().throwException(new IllegalArgumentException());
		}

		// 入荷分納登録起動時処理
		// 入荷予定ヘッダリストの件数分繰返
		for (TReceivePlanH head : rPlanHeaderList) {

			// 入荷予定ヘッダリスト - 入荷ステータスが入荷済 かつ 入荷納品ステータスが 未完以外の場合は エラー
			if (!(head.isReceiveStatus$03() && head.isReceiveDeliveryStatus$00())) {
				// エラーメッセージをエラー管理クラスに登録
				this.getErrorManager().add(errSts, WmsMessageConst.RECEIVE_PART_INSERT_START_ERROR);
				// 処理終了
				return;
			}
		}
	}

}
