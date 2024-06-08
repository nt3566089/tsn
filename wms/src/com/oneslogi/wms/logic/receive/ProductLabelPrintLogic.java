package com.oneslogi.wms.logic.receive;

import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.cbean.TReceivePlanRCB;
import com.oneslogi.base.dbflute.cbean.TStoreRecordBCB;
import com.oneslogi.base.dbflute.exbhv.TReceivePlanRBhv;
import com.oneslogi.base.dbflute.exbhv.TStoreRecordBBhv;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.TReceivePlanB;
import com.oneslogi.base.dbflute.exentity.TReceivePlanH;
import com.oneslogi.base.dbflute.exentity.TReceivePlanR;
import com.oneslogi.base.dbflute.exentity.TStoreRecordB;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 商品ラベル発行ロジッククラス
 */
public class ProductLabelPrintLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private TReceivePlanRBhv tReceivePlanRBhv;
	@Inject
	private TStoreRecordBBhv tStoreRecordBBhv;


	/**
	 * <h2>商品ラベル発行データを取得する。</h2>
	 * <pre>
	 * 引数をキーに商品ラベル発行データを取得する。
	 * 検索対象が見つからない場合はNULLを返すと共に、
	 * ０件エラーをエラーステータスに設定する。
	 * </pre>
	 * @param report 入荷予定帳票：コントロールNo.
	 * @param errSts チェックがエラー時に設定するエラーステータス
	 * @return List<TStoreRecordB> 入庫実績ボディリスト
	 */
	//荷主センタ変更対応 201７.02.24 sja Start
//	public List<TStoreRecordB> select(TReceivePlanR report, ErrorStatus errSts) {
	public List<TStoreRecordB> select(TReceivePlanR report,MCenter mcenter, ErrorStatus errSts) {
	//荷主センタ変更対応 201７.02.24 sja End
		List<TStoreRecordB> result = null;

		// ===== 商品ラベル発行データ取得 =====
		TStoreRecordBCB tStoreRecordBCB = tStoreRecordBBhv.newMyConditionBean();
		tStoreRecordBCB.setupSelect_TStoreRecordH();
		tStoreRecordBCB.setupSelect_TStoreRecordH().withTReceivePlanH().withTReceivePlanRAsOne();
		tStoreRecordBCB.setupSelect_TStoreRecordH().withMClient();
		tStoreRecordBCB.setupSelect_TStoreRecordH().withMCenter();
		tStoreRecordBCB.setupSelect_TReceivePlanB().withMWarehouse();
		tStoreRecordBCB.setupSelect_TReceivePlanB().withMProduct();

		//入数取得
		// [#3347][Ver3.0] TODO残対応(UoM) - ケース、ピース関連処理削除 2018.01.15 honma Delete

		// 検索条件の設定
		tStoreRecordBCB.query().queryTStoreRecordH().queryTReceivePlanH().queryTReceivePlanRAsOne().setControlNo_Equal(report.getControlNo());
		tStoreRecordBCB.query().setStoreNum_GreaterThan(WCC.ZERO);

		//ソート条件
		tStoreRecordBCB.query().queryTReceivePlanB().queryMProduct().addOrderBy_ProductCd_Asc();

		// 検索実行
		result = selectListToReport(tStoreRecordBBhv, tStoreRecordBCB);

		// ===== ０件チェック =====
		if (result.size() == 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}

		//入数取得
		// [#3347][Ver3.0] TODO残対応(UoM) - ケース、ピース関連処理削除 2018.01.15 honma Delete
		return result;
	}

	/**
	 * <h2>入荷予定を更新する。</h2>
	 * <pre>
	 * 引数をキーに入荷予定ヘッダからデータを検索し、入荷予定帳票データを更新する。
	 * </pre>
	 * @param update 入荷予定帳票(更新用)：全項目
	 * @param header 入荷予定ヘッダ：商品ラベルID
	 * @param report 入荷予定帳票(検索用)：商品ラベル出力フラグ
	 * @param errStatus エラー時に登録するエラーステータス
	 */
	public void updateControlNo(TReceivePlanR update, TReceivePlanH header, final TReceivePlanB body, TReceivePlanR report, ErrorStatus errStatus) {

		// ===== 入荷予定帳票データ更新 =====
		// 更新条件作成
		TReceivePlanRCB cb = tReceivePlanRBhv.newMyConditionBean();
		cb.setupSelect_TReceivePlanH();

		//検索条件
		cb.query().queryTReceivePlanH().setClientId_Equal(header.getClientId());
		cb.query().queryTReceivePlanH().setCenterId_Equal(header.getCenterId());
		cb.query().queryTReceivePlanH().setReceivePlanHId_Equal(header.getReceivePlanHId());

		// ===== 入荷予定帳票の更新 =====
		tReceivePlanRBhv.queryUpdate(update, cb);
	}

	/**
	 * <h2>予定リストフラグを更新する。</h2>
	 * <pre>
	 * 引数をキーに入荷予定帳票データを更新する。
	 * </pre>
	 * @param update 入荷予定帳票(更新用)：全項目
	 * @param report 入荷予定帳票(検索用)：コントロールNo.
	 * @param errStatus エラー時に登録するエラーステータス
	 */
	public void updateRplOutFlg(TReceivePlanR update, TReceivePlanR report, ErrorStatus errStatus) {

		// ===== 入荷予定帳票データ更新 =====

		// 更新条件作成
		TReceivePlanRCB cb = tReceivePlanRBhv.newMyConditionBean();
		cb.checkInvalidQuery();
		cb.query().setControlNo_Equal(report.getControlNo());
		// ===== 入荷予定帳票の更新 =====

		tReceivePlanRBhv.queryUpdate(update, cb);
	}


}
