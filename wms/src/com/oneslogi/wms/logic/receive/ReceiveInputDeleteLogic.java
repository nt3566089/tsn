package com.oneslogi.wms.logic.receive;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.cbean.TStockInoutCB;
import com.oneslogi.base.dbflute.cbean.TStoreRecordBCB;
import com.oneslogi.base.dbflute.cbean.TStoreRecordRCB;
import com.oneslogi.base.dbflute.exbhv.TStockInoutBhv;
import com.oneslogi.base.dbflute.exbhv.TStoreRecordBBhv;
import com.oneslogi.base.dbflute.exbhv.TStoreRecordHBhv;
import com.oneslogi.base.dbflute.exbhv.TStoreRecordRBhv;
import com.oneslogi.base.dbflute.exentity.TReceivePlanB;
import com.oneslogi.base.dbflute.exentity.TReceivePlanH;
import com.oneslogi.base.dbflute.exentity.TStockInout;
import com.oneslogi.base.dbflute.exentity.TStoreRecordB;
import com.oneslogi.base.dbflute.exentity.TStoreRecordH;
import com.oneslogi.base.dbflute.exentity.TStoreRecordR;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.core.logic.stockupdate.StockUpdateLogic;

/**
 *入庫実績削除ロジッククラス
 */
public class ReceiveInputDeleteLogic extends AbstractWmsLogic {
	// ===== 使用テーブル =====
	@Inject
	private TStoreRecordHBhv tStoreRecordHBhv;
	@Inject
	private TStoreRecordBBhv tStoreRecordBBhv;
	@Inject
	private TStockInoutBhv tStockInoutBhv;
	// [C-CWMS-0060] 入荷実績出力バッチ作成 2016.10.19 shimizu Start
	@Inject
	private TStoreRecordRBhv tStoreRecordRBhv;
	// [C-CWMS-0060] 入荷実績出力バッチ作成 2016.10.19 shimizu End
	@Inject
	private StockUpdateLogic stockUpdateLogic;
	@Inject
	private ReceiveStatusUpdateLogic receiveStatusUpdateLogic;


	/**
	 * <h2>入庫実績を削除する。</h2>
	 * <pre>
	 *  引数をキーに処理テーブルからデータを検索し、
	 *  検索結果を元に【在庫更新.入庫[赤]】処理を行う。
	 *  該当データを参照しているデータを更新後、
	 *  該当データを削除し、【入荷予定ステータス更新.未完】を行う。
	 *
	 *【在庫更新.入庫[赤]】
	 * ・{@link StockUpdateLogic#receiveCancel(TReceivePlanB, TStoreRecordH, List, com.oneslogi.base.exception.ErrorManager.ErrorStatus) 入庫［赤］メソッド}を呼び出す。
	 *
	 *【入荷予定ステータス更新.未完】
	 * ・{@link ReceiveStatusUpdateLogic#receiveNotComplete(List, com.oneslogi.base.exception.ErrorManager.ErrorStatus) 未完メソッド}を呼び出す。
	 *
	 *</pre>
	 * @param header 入庫実績ヘッダ：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void delete(TStoreRecordH header, ErrorStatus errSts) {

		//入庫実績データ取得
		TStoreRecordBCB tStoreRecordBCb = tStoreRecordBBhv.newMyConditionBean();
		tStoreRecordBCb.query().setStoreRecordHId_Equal(header.getStoreRecordHId());
		List<TStoreRecordB> tStoreRecordBodyList = new ArrayList<TStoreRecordB>();
		tStoreRecordBodyList = tStoreRecordBBhv.selectList(tStoreRecordBCb);

		//在庫更新
		List<TStoreRecordB> tStoreRecordBList = new ArrayList<TStoreRecordB>();
		for (TStoreRecordB body : tStoreRecordBodyList) {
			// [#3029][Ver3.0] Java側のBigDecimal共通関数化 2018.03.02 honma Mod Start
			if (!WCC.isEqual(body.getStoreNum(), WCC.ZERO)) {
			// [#3029][Ver3.0] Java側のBigDecimal共通関数化 2018.03.02 honma Mod End
				tStoreRecordBList.add(body);
			}
		}

		if (tStoreRecordBList.size() > 0) {
			stockUpdateLogic.receiveCancel(null, header, tStoreRecordBList, errSts);
			if (0 < getErrorManager().size()) {
				return;
			}
		}

		//入庫実績ボディ削除
		for (TStoreRecordB tStoreRecordB : tStoreRecordBodyList) {

			//在庫受払の入庫実績ボディを重置
			TStockInoutCB tStockInoutCb = tStockInoutBhv.newMyConditionBean();
			tStockInoutCb.query().setStoreRecordBId_Equal(tStoreRecordB.getStoreRecordBId());

			List<TStockInout> result = null;
			result = tStockInoutBhv.selectList(tStockInoutCb);
			for (TStockInout tStockInout : result) {
				tStockInout.setStoreRecordBId(null);
				tStockInoutBhv.update(tStockInout);
			}

			//削除実行
			tStoreRecordBBhv.delete(tStoreRecordB);
		}

		// [C-CWMS-0060] 入荷実績出力バッチ作成 2016.10.19 shimizu Start
		// 入庫実績帳票削除
		TStoreRecordR tStoreRecordR = new TStoreRecordR();
		TStoreRecordRCB cb = tStoreRecordRBhv.newMyConditionBean();
		cb.query().setStoreRecordHId_Equal(header.getStoreRecordHId());
		tStoreRecordR = tStoreRecordRBhv.selectEntity(cb);
		tStoreRecordRBhv.delete(tStoreRecordR);
		// [C-CWMS-0060] 入荷実績出力バッチ作成 2016.10.19 shimizu End

		//入庫実績ヘッダ削除
		tStoreRecordHBhv.delete(header);

		// 入荷予定ステータス更新.未完メソッドを呼出し
		TReceivePlanH planHead = header.getTReceivePlanH();
		List<TReceivePlanH> tPlanHeaderList = new ArrayList<TReceivePlanH>();
		tPlanHeaderList.add(planHead);
		receiveStatusUpdateLogic.receiveNotComplete(tPlanHeaderList, errSts);

	}

	// [ON推-品向-1024] 入荷中の商品が出荷された後に別商品の実績を登録した時にエラーとならないように変更 2015.12.18 kawana Start

	/**
	 * <h2>入庫実績ボディを削除する。</h2>
	 * <pre>
	 *  引数をキーに【在庫更新.入庫[赤]】処理を行う。
	 *  該当データを参照している在庫受払データを更新後、
	 *  該当データを削除し、【入荷予定ステータス更新.未完】処理を行う。
	 *
	 *【在庫更新.入庫[赤]】
	 * ・{@link StockUpdateLogic#receiveCancel(TReceivePlanB, TStoreRecordH, List, com.oneslogi.base.exception.ErrorManager.ErrorStatus) 入庫［赤］メソッド}を呼び出す。
	 *
	 *【入荷予定ステータス更新.未完】
	 * ・{@link ReceiveStatusUpdateLogic#receiveNotComplete(List, com.oneslogi.base.exception.ErrorManager.ErrorStatus) 未完メソッド}を呼び出す。
	 *
	 *</pre>
	 * @param header 入庫実績ヘッダ：全項目
	 * @param bodyList 入庫実績ボディリスト：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void deleteBody(TStoreRecordH header, List<TStoreRecordB> bodyList, ErrorStatus errSts) {

		// ===== 在庫更新 =====
		// 在庫更新.入庫［赤］(入庫実績ボディ単位) 呼出し
		stockUpdateLogic.receiveCancelBody(header, bodyList, errSts);
		if (0 < getErrorManager().size()) {
			return;
		}

		// ===== 入庫実績ボディ削除 =====

		for (TStoreRecordB tStoreRecordB : bodyList) {

			//在庫受払の入庫実績ボディを重置
			TStockInoutCB tStockInoutCb = tStockInoutBhv.newMyConditionBean();
			tStockInoutCb.query().setStoreRecordBId_Equal(tStoreRecordB.getStoreRecordBId());

			List<TStockInout> result = null;
			result = tStockInoutBhv.selectList(tStockInoutCb);
			for (TStockInout tStockInout : result) {
				tStockInout.setStoreRecordBId(null);
				tStockInoutBhv.update(tStockInout);
			}

			//削除実行
			tStoreRecordBBhv.delete(tStoreRecordB);
		}

		// ===== 入荷ステータス更新 =====

		TReceivePlanH planHead = header.getTReceivePlanH();
		List<TReceivePlanH> tPlanHeaderList = new ArrayList<TReceivePlanH>();
		tPlanHeaderList.add(planHead);
		// 入荷予定ステータス更新.未完 呼出し
		receiveStatusUpdateLogic.receiveNotComplete(tPlanHeaderList, errSts);
	}

	// [ON推-品向-1024] 入荷中の商品が出荷された後に別商品の実績を登録した時にエラーとならないように変更 2015.12.18 kawana End
}
