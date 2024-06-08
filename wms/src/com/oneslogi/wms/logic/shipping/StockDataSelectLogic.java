package com.oneslogi.wms.logic.shipping;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.dbflute.cbean.scoping.SubQuery;

import com.oneslogi.base.dbflute.cbean.TStockCB;
import com.oneslogi.base.dbflute.exbhv.TStockBhv;
import com.oneslogi.base.dbflute.exentity.TShippingInstB;
import com.oneslogi.base.dbflute.exentity.TShippingInstH;
import com.oneslogi.base.dbflute.exentity.TStock;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 在庫数データ取得ロジッククラス
 */
public class StockDataSelectLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private TStockBhv tStockBhv;

	/**
	 * <h2>在庫数データを取得する。</h2>
	 * <pre>
	 * 引数を条件に在庫の引当可能数の合計値を取得する。
	 * データ存在しない場合、引当可能数が0を設定する。
	 * </pre>
	 * @param header 出荷指示ヘッダ：荷主ID・センタID
	 * @param body 出荷指示ボディ：倉庫ID・商品ID・預託ID・ロットID・期限日・在庫区分ID・ロケーションID
	 * @param blnAllocNgFlg 引当禁止フラグ
	 * @param errSts エラー時に設定するエラーステータス
	 * @return List<TStock> 在庫リスト
	 */
	public List<TStock> select(final TShippingInstH header, final TShippingInstB body,Boolean blnAllocNgFlg, ErrorStatus errSts) {

		List<TStock> result = new ArrayList<TStock>();
		// ===== 在庫数データ取得 =====

		// 検索条件の設定
		TStockCB cb = tStockBhv.newMyConditionBean();
		cb.setupSelect_MWarehouse();
		cb.setupSelect_MLocation();
		cb.setupSelect_TLot();

		// 荷主IDの設定
		cb.query().setClientId_Equal(header.getClientId());

		// 倉庫IDの設定
		cb.query().setWarehouseId_Equal(body.getWarehouseId());

		// 商品IDの設定
		cb.query().setProductId_Equal(body.getProductId());

		// 預託IDの設定
		cb.query().setDepositId_Equal(body.getDepositId());

		// ロットIDの設定
		cb.query().setLotId_Equal(body.getLotId());
		cb.query().queryTLot().setProductId_Equal(body.getProductId());
		cb.query().queryTLot().setLot_Equal(body.getLot());
		cb.query().queryTLot().setLimitDt_Equal(body.getLimitDt());

		// 在庫区分IDの設定
		cb.query().setStockTypeId_Equal(body.getStockTypeId());

		// ロケーションIDの設定
		cb.query().setLocationId_Equal(body.getLocationId());

		// センタIDの設定
		cb.query().queryMWarehouse().setCenterId_Equal(header.getCenterId());

		// [品質】問題点指摘票(新ソリューション)-033] ロケーションマスタの引当禁止フラグ設定を修正 2014.11.24 kei Start
		// 引当可能の設定
		if(blnAllocNgFlg == true){
			cb.query().queryMLocation().setAllocNgFlg_Equal_$0();
		}
		// [品質】問題点指摘票(新ソリューション)-033] ロケーションマスタの引当禁止フラグ設定を修正 2014.11.24 kei End

		// 在庫の引当可能数の合計値を抽出
		cb.specify().myselfDerived().sum(new SubQuery<TStockCB>() {
			@Override
			public void query(TStockCB subCB) {
				subCB.specify().columnChargeNum();

				// 荷主IDの設定
				subCB.query().setClientId_Equal(header.getClientId());

				// 倉庫IDの設定
				subCB.query().setWarehouseId_Equal(body.getWarehouseId());

				// [EC-CT1-039] 商品マスタが存在しない行の引当可能数にトータル在庫数が表示されている時、初期表示のタイミングの数量がおかしいことを解消するため、追加 2015.02.18 許 Start
				if(body.getProductId() != null){
					// [EC-CT1-039] 商品マスタが存在しない行の引当可能数にトータル在庫数が表示されている時、初期表示のタイミングの数量がおかしいことを解消するため、追加 2015.02.18 許 End
					// 商品IDの設定
					subCB.query().setProductId_Equal(body.getProductId());
					// [EC-CT1-039] 商品マスタが存在しない行の引当可能数にトータル在庫数が表示されている時、初期表示のタイミングの数量がおかしいことを解消するため、追加 2015.02.18 許 Start
				} else {
					// 商品IDの設定
					subCB.query().setProductId_Equal(-1L);
				}
				// [EC-CT1-039] 商品マスタが存在しない行の引当可能数にトータル在庫数が表示されている時、初期表示のタイミングの数量がおかしいことを解消するため、追加 2015.02.18 許 End

				// 預託IDの設定
				subCB.query().setDepositId_Equal(body.getDepositId());

				// ロットIDの設定
				subCB.query().setLotId_Equal(body.getLotId());
				subCB.query().queryTLot().setProductId_Equal(body.getProductId());
				subCB.query().queryTLot().setLot_Equal(body.getLot());
				subCB.query().queryTLot().setLimitDt_Equal(body.getLimitDt());

				// 在庫区分IDの設定
				subCB.query().setStockTypeId_Equal(body.getStockTypeId());

				// ロケーションIDの設定
				subCB.query().setLocationId_Equal(body.getLocationId());

				// センタIDの設定
				subCB.query().queryMWarehouse().setCenterId_Equal(header.getCenterId());

				// 引当可能の設定
				subCB.query().queryMLocation().setAllocNgFlg_Equal_$0();
				setDelFlg(subCB);
			}

		}, TStock.ALIAS_sum_Charge_Num, op -> op.coalesce(0));

		// ===== 在庫マスタ検索実行 =====
		result = tStockBhv.selectList(cb);

		if (result.size() == 0) {
			TStock tStock = new TStock();
			tStock.setSumChargeNum(WCC.ZERO);
			result.add(tStock);
		}

		return result;
	}
}