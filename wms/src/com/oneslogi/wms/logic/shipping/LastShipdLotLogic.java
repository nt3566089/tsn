package com.oneslogi.wms.logic.shipping;

import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.cbean.TAllocLotCB;
import com.oneslogi.base.dbflute.cbean.TKeepingLotCB;
import com.oneslogi.base.dbflute.cbean.TLastLotCB;
import com.oneslogi.base.dbflute.exbhv.TAllocLotBhv;
import com.oneslogi.base.dbflute.exbhv.TKeepingLotBhv;
import com.oneslogi.base.dbflute.exbhv.TLastLotBhv;
import com.oneslogi.base.dbflute.exentity.TAllocInstB;
import com.oneslogi.base.dbflute.exentity.TAllocInstH;
import com.oneslogi.base.dbflute.exentity.TAllocLot;
import com.oneslogi.base.dbflute.exentity.TKeepingLot;
import com.oneslogi.base.dbflute.exentity.TLastLot;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 最終ロット管理処理ロジッククラス
 */
public class LastShipdLotLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private TAllocLotBhv tAllocLotBhv;
	@Inject
	private TLastLotBhv tLastLotBhv;
	@Inject
	private TKeepingLotBhv tKeepingLotBhv;

	/**
	 * <h2>出荷限界期限日を設定する。</h2>
	 * <pre>
	 *
	 * 引当指示ボディの期限日管理フラグと期限日逆転防止フラグが「管理する」の場合、
	 * 商品IDと納品先IDで最終ロット管理を検索し件数０件以上の時、
	 * ロットの期限日と引当指示ボディの出荷限界期限日を比較して、
	 * ロットの期限日の方が大きい場合、引当指示ボディの出荷限界期限日にロットの期限日を設定する。
	 *
	 * 引当指示ボディの期限日管理フラグが「管理しない」の場合、
	 * 出荷限界期限日をクリアする。
	 * </pre>
	 * @param allocInstHeader 引当指示ヘッダ：納品先ID
	 * @param allocInstBody 引当指示ボディ：商品ID・期限日管理フラグ・期限日逆転防止フラグ・出荷限界期限日
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void GetLastShipLot(TAllocInstH allocInstHeader, TAllocInstB allocInstBody, ErrorStatus errSts) {
		List<TLastLot> result = null;
		// ===== 最終ロット取得処理 =====

		//期限日管理フラグ管理するの場合
		if (allocInstBody.isLimitDtManagFlg$1()) {
			//期限日逆転防止フラグ管理するの場合
			if (allocInstBody.isLimitDtReverseFlg$1()) {
				TLastLotCB cb = tLastLotBhv.newMyConditionBean();
				//処理対象テーブルの設定
				cb.setupSelect_TLot();
				//検索条件の設定
				cb.query().setCustomerId_Equal(allocInstHeader.getSupplyCustomerId());
				cb.query().setProductId_Equal(allocInstBody.getProductId());
				// ===== 最終ロット検索実行 =====
				result = tLastLotBhv.selectList(cb);
				//ロットデータの件数大于 0の場合
				if (result.size() > 0) {
					for (TLastLot tLastLot : result) {
						//ロットの期限日大于引当指示ボディの出荷限界期限日の場合
						if (tLastLot.chaseTLot().getLimitDt().compareTo(allocInstBody.getShippingLimitDt()) > 0) {
							allocInstBody.setShippingLimitDt(tLastLot.chaseTLot().getLimitDt());
						}
					}
				}
			}
		}
		//期限日管理フラグ管理しないの場合
		if (allocInstBody.isLimitDtManagFlg$0()) {
			allocInstBody.setShippingLimitDt(null);
		}
	}

	/**
	 * <h2>最終ロットを更新する。</h2>
	 * <pre>
	 * 最終ロットを更新する。
	 * 引当指示ボディの期限日逆転防止フラグが「管理する」の場合、
	 * 引当指示ボディIDで引当ロット管理データを検索する。
	 * 引当ロット管理データの件数が1件以上の場合、商品IDと納品先IDで最終ロット管理データを検索する。
	 *
	 * 最終ロット管理データの件数が1件以上の場合、
	 * 引当ロット管理の期限日と最終ロット管理の期限日を比較して、
	 * 最終ロット管理の期限日の方が小さい場合、引当ロット管理のロットIDで最終ロット管理のロットIDを更新する。
	 *
	 * 最終ロット管理データの件数が０件の場合、
	 * 対象の商品ID、納品先ID及びロットIDを最終ロットとして、最終ロット管理に登録する。
	 * </pre>
	 * @param allocInstHeader 引当指示ヘッダ：納品先ID
	 * @param allocInstBody 引当指示ボディ：引当指示ボディID・商品ID・期限日逆転防止フラグ
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void LastShipLotUpdate(TAllocInstH allocInstHeader, TAllocInstB allocInstBody, ErrorStatus errSts) {
		List<TAllocLot> resultTAllocLot = null;
		List<TLastLot> resultTLastLot = null;

		// ===== 最終ロット更新処理 =====

		//期限日逆転防止フラグ管理するの場合
		if (allocInstBody.isLimitDtReverseFlg$1()) {
			// 引当ロット管理データを取得する
			TAllocLotCB cb = tAllocLotBhv.newMyConditionBean();
			//処理対象テーブル
			cb.setupSelect_TLot();
			//検索条件
			cb.query().setAllocInstBId_Equal(allocInstBody.getAllocInstBId());
			//検索実行
			resultTAllocLot = tAllocLotBhv.selectList(cb);

			//引当ロット管理データ件数大于 0の場合
			if (resultTAllocLot.size() > 0) {
				// 最終ロット管理データ取得
				TLastLotCB cb1 = tLastLotBhv.newMyConditionBean();
				//処理対象テーブルの設定
				cb1.setupSelect_TLot();

				//検索条件
				cb1.query().setCustomerId_Equal(allocInstHeader.getSupplyCustomerId());
				cb1.query().setProductId_Equal(allocInstBody.getProductId());
				//検索実行
				resultTLastLot = tLastLotBhv.selectList(cb1);

				//TLastLot tLastLot1 = new TLastLot();
				//最終ロット管理データ件数大于 0の場合
				if (resultTLastLot.size() > 0) {
					if ((resultTAllocLot.get(0).chaseTLot().getLimitDt()).compareTo
							(resultTLastLot.get(0).chaseTLot().getLimitDt()) > 0) {
						//最終ロット管理更新データ編集
						resultTLastLot.get(0).setLotId(resultTAllocLot.get(0).chaseTLot().getLotId());
						//最終ロット管理を更新する
						tLastLotBhv.update(resultTLastLot.get(0));
					}
				}

				if (resultTLastLot.size() == 0) {
					//最終ロット管理データを追加する
					for (TAllocLot tAllocLot : resultTAllocLot) {
						TLastLot tLastLot = new TLastLot();
						tLastLot.setCustomerId(allocInstHeader.getSupplyCustomerId());
						tLastLot.setProductId(allocInstBody.getProductId());
						tLastLot.setLotId(tAllocLot.chaseTLot().getLotId());

						//最終ロット管理を登録する
						tLastLotBhv.insert(tLastLot);
					}
				}
			}
		}
	}

	/**
	 * <h2>最終ロットを取消する。</h2>
	 * <pre>
	 * 引当指示ボディの期限日逆転防止フラグが「管理する」の場合、
	 * 商品IDと納品先IDで引当ロット管理の期限日最大値を取得する。
	 *
	 * ・対象の引当ロット管理データが１件以上の場合、最終ロット管理を検索し、
	 *   最終ロット管理データが１件以上あれば
	 *   引当ロット管理の最大期限日と最終ロット管理の期限日を比較する。
	 *   最終ロット管理の期限日の方が大きい場合、最終ロット管理を更新する。
	 *
	 * ・対象の引当ロット管理データが０件の場合、最終ロット管理を検索し、
	 *   最終ロット管理データが１件以上あれば、保管ロット管理を検索する。
	 *   保管ロット管理の最大期限日と最終ロット管理の期限日を比較して、
	 *   最終ロット管理の期限日の方が大きい場合、最終ロット管理を更新する。
	 *   保管ロット管理データが０件の場合、最終ロット管理を削除する。
	 * </pre>
	 * @param allocInstHeader 引当指示ヘッダ：納品先ID
	 * @param allocInstBody 引当指示ボディ：商品ID・期限日逆転防止フラグ
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void LastShipLotCancel(TAllocInstH allocInstHeader, TAllocInstB allocInstBody, ErrorStatus errSts) {
		List<TAllocLot> resultTAllocLot = null;
		List<TLastLot> resultTLastLot = null;
		List<TLastLot> resultTLastLot2 = null;
		List<TKeepingLot> resultTKeepingLot = null;
		String MaxLimitDt = null;

		// ===== 最終ロット取消処理 =====

		//期限日逆転防止フラグ管理するの場合
		if (allocInstBody.isLimitDtReverseFlg$1()) {

			TAllocLotCB cb = tAllocLotBhv.newMyConditionBean();

			//処理対象テーブル
			cb.setupSelect_TLot();
			// [SK2-014] 期限日最大値を取得する時、引当指示ボディの指定期限日が空の条件を追加 2014.12.09 許 Start
			cb.setupSelect_TAllocInstB();
			// [SK2-014] 期限日最大値を取得する時、引当指示ボディの指定期限日が空の条件を追加 2014.12.09 許 End

			//検索条件
			cb.query().setCustomerId_Equal(allocInstHeader.getSupplyCustomerId());
			cb.query().setProductId_Equal(allocInstBody.getProductId());
			// [SK2-014] 期限日最大値を取得する時、引当指示ボディの指定期限日が空、指定ロットが空、指定ロケーションCDが空の条件を追加 2014.12.09 許 Start
			cb.query().queryTAllocInstB().setLimitDt_IsNull();
			cb.query().queryTAllocInstB().setLocationCd_IsNull();
			cb.query().queryTAllocInstB().setLot_IsNull();
			// [SK2-014] 期限日最大値を取得する時、引当指示ボディの指定期限日が空、指定ロットが空、指定ロケーションCDが空の条件を追加 2014.12.09 許 End

			//ソート条件
			cb.query().queryTLot().addOrderBy_LimitDt_Desc();
			//検索実行
			resultTAllocLot = tAllocLotBhv.selectList(cb);

			if (resultTAllocLot.size() > 0) {
				//期限日最大値と期限日最大値のロットを取得
				MaxLimitDt = resultTAllocLot.get(0).chaseTLot().getLimitDt();

				//最終ロット管理データ取得

				// 処理対象テーブル
				TLastLotCB cb1 = tLastLotBhv.newMyConditionBean();
				//処理対象テーブルの設定
				cb1.setupSelect_TLot();

				//検索条件
				cb1.query().setCustomerId_Equal(allocInstHeader.getSupplyCustomerId());
				cb1.query().setProductId_Equal(allocInstBody.getProductId());
				//検索実行
				resultTLastLot = tLastLotBhv.selectList(cb1);

				//最終ロット管理データ件数大于 0の場合、
				if (resultTLastLot.size() > 0) {
					for (TLastLot tLastLot : resultTLastLot) {
						//引当ロット管理の最大期限日と最終ロット管理の期限日を比較して
						if ((tLastLot.chaseTLot().getLimitDt()).compareTo(MaxLimitDt) > 0) {
							//最終ロット管理更新
							tLastLot.setLotId(resultTAllocLot.get(0).chaseTLot().getLotId());
							tLastLotBhv.update(tLastLot);
						}
					}
				}
			}
			//最終ロット管理データ件数0の場合
			if (resultTAllocLot.size() == 0) {
				// 処理対象テーブル
				TLastLotCB cb2 = tLastLotBhv.newMyConditionBean();
				//処理対象テーブルの設定
				cb2.setupSelect_TLot();

				//検索条件
				cb2.query().setCustomerId_Equal(allocInstHeader.getSupplyCustomerId());
				cb2.query().setProductId_Equal(allocInstBody.getProductId());

				//検索実行
				resultTLastLot2 = tLastLotBhv.selectList(cb2);

				if (resultTLastLot2.size() > 0) {
					TKeepingLotCB cb3 = tKeepingLotBhv.newMyConditionBean();
					//処理対象テーブルの設定
					cb3.setupSelect_TLot();
					//検索条件
					cb3.query().setCustomerId_Equal(allocInstHeader.getSupplyCustomerId());
					cb3.query().setProductId_Equal(allocInstBody.getProductId());
					//ソート条件
					cb3.query().queryTLot().addOrderBy_LimitDt_Desc();
					//検索実行
					resultTKeepingLot = tKeepingLotBhv.selectList(cb3);

					if (resultTKeepingLot.size() > 0) {
						for (TLastLot tLastLot : resultTLastLot2) {
							if ((tLastLot.chaseTLot().getLimitDt()).compareTo(resultTKeepingLot.get(0).chaseTLot().getLimitDt()) > 0) {
								//最終ロット管理を更新する
								tLastLot.setLotId(resultTKeepingLot.get(0).chaseTLot().getLotId());
								tLastLotBhv.update(tLastLot);
							}
						}
					}
					//0の場合
					if (resultTKeepingLot.size() == 0) {
						for (TLastLot tLastLot : resultTLastLot2) {
							//最終ロット管理を更新する
							tLastLotBhv.delete(tLastLot);
						}
					}
				}
			}
		}
	}
}