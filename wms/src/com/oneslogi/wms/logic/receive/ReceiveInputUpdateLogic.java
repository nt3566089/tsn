package com.oneslogi.wms.logic.receive;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.exbhv.TStoreRecordBBhv;
import com.oneslogi.base.dbflute.exbhv.TStoreRecordHBhv;
import com.oneslogi.base.dbflute.exentity.TReceivePlanB;
import com.oneslogi.base.dbflute.exentity.TReceivePlanH;
import com.oneslogi.base.dbflute.exentity.TStoreRecordB;
import com.oneslogi.base.dbflute.exentity.TStoreRecordH;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.core.logic.stockupdate.StockUpdateLogic;

/**
 * 入庫実績更新ロジッククラス
 */
public class ReceiveInputUpdateLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private TStoreRecordHBhv tStoreRecordHBhv;
	@Inject
	private TStoreRecordBBhv tStoreRecordBBhv;

	// ===== 使用ロジック =====
	@Inject
	private StockUpdateLogic stockUpdateLogic;

	/**
	 * <h2>入庫実績ヘッダを更新する。</h2>
	 * <pre>
	 * 引数で受け取ったデータを更新する。
	 * </pre>
	 * @param header 入庫実績ヘッダ：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void updateHeader(TStoreRecordH header, ErrorStatus errSts) {

		tStoreRecordHBhv.update(header);
	}

	/**
	 * <h2>入庫実績ボディを更新する。</h2>
	 * <pre>
	 * 引数で受け取ったデータリストを更新する。
	 * </pre>
	 * @param bodyList 入庫実績ボディのリスト：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void updateBody(List<TStoreRecordB> bodyList, ErrorStatus errSts) {

		tStoreRecordBBhv.batchUpdate(bodyList);
	}

	/**
	 * <h2>入庫数をプラスする。</h2>
	 * <pre>
	 * 引数で受け取ったデータで【在庫更新.入庫［黒］(入庫数のプラス)】を実行する。
	 *
	 * 【在庫更新.入庫［黒］(入庫数のプラス)】
	 * ・{@link StockUpdateLogic#receivePlusBody(TReceivePlanH, TReceivePlanB, TStoreRecordH, List, com.oneslogi.base.exception.ErrorManager.ErrorStatus) 入庫［黒］(入庫数のプラス)メソッド}を呼び出す。
	 * </pre>
	 *
	 * @param header 入庫実績ヘッダ：全項目
	 * @param bodyList 入庫実績ボディのリスト：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void updateStoreNumPlus(TStoreRecordH header, List<TStoreRecordB> bodyList, ErrorStatus errSts) {

		for (TStoreRecordB body : bodyList) {

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

				// [ON推-品向-1154] マージしない商品の入庫数追加が出来ない問題を修正 2016.05.12 kawana Start
				// 在庫更新.入庫[黒](入庫数のプラス) を呼出し
				stockUpdateLogic.receivePlusBody(planH, planB, header, storeRecordBList, errSts);
				// [ON推-品向-1154] マージしない商品の入庫数追加が出来ない問題を修正 2016.05.12 kawana End
				if (0 < getErrorManager().size()) {
					return;
				}
			}
		}
	}

	/**
	 * <h2>入庫数をマイナスする。</h2>
	 * <pre>
	 * 引数で受け取ったデータで【在庫更新.入庫[赤](入庫数のマイナス)】を実行する。
	 *
	 * 【在庫更新.入庫［赤］(入庫数のマイナス)】
	 * ・{@link StockUpdateLogic#receiveMinusBody(TStoreRecordH, List, com.oneslogi.base.exception.ErrorManager.ErrorStatus) 入庫［赤］(入庫数のマイナス)メソッド}を呼び出す。
	 * </pre>
	 * @param header 入庫実績ヘッダ：全項目
	 * @param bodyList 入庫実績ボディのリスト：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void updateStoreNumMinus(TStoreRecordH header, List<TStoreRecordB> bodyList, ErrorStatus errSts) {

		List<TStoreRecordB> storeRecordBList = new ArrayList<TStoreRecordB>();
		for (TStoreRecordB body : bodyList) {
			// [#3029][Ver3.0] Java側のBigDecimal共通関数化 2018.03.02 honma Mod Start
			if (!WCC.isEqual(body.getStoreNum(), WCC.ZERO)) {
			// [#3029][Ver3.0] Java側のBigDecimal共通関数化 2018.03.02 honma Mod End
				storeRecordBList.add(body);
			}
		}

		if (storeRecordBList.size() > 0) {

			// 在庫更新.入庫［赤］(入庫数のマイナス) を呼出し
			stockUpdateLogic.receiveMinusBody(header, storeRecordBList, errSts);
			if (0 < getErrorManager().size()) {
				return;
			}
		}
	}

}
