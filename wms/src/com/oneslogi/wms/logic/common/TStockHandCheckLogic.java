package com.oneslogi.wms.logic.common;

import java.util.List;

import javax.inject.Inject;

import org.dbflute.cbean.result.ListResultBean;
import org.dbflute.cbean.scoping.OrQuery;

import com.oneslogi.base.dbflute.cbean.TStockCB;
import com.oneslogi.base.dbflute.exbhv.TStockBhv;
import com.oneslogi.base.dbflute.exentity.MWarehouse;
import com.oneslogi.base.dbflute.exentity.TStock;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 在庫共通ロジッククラス
 */
public class TStockHandCheckLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private TStockBhv tStockBhv;

	/**
	 * <h2>在庫マスタデータのチェック処理を行う。</h2>
	 * <pre>
	 *
	 * 引数の各項目を条件にデータベースから在庫データ件数を取得し、
	 * 在庫存在チェックを行う。
	 *
	 * </pre>
	 * @param tStock 在庫マスタ：荷主ID・商品ID・ロケーションID
	 * @param mWarehouse 倉庫マスタ：センタID・倉庫ID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return boolean true：在庫あり、 false：在庫なし
	 */
	public boolean checkData(TStock tStock, MWarehouse mWarehouse, ErrorStatus errSts) {

		Boolean result = false;

		// 検索条件の設定
		TStockCB cb = tStockBhv.newMyConditionBean();
		cb.setupSelect_MClient();
		cb.setupSelect_MProduct();
		cb.setupSelect_MLocation();
		cb.setupSelect_MWarehouse();

		// 荷主IDの設定
		cb.query().queryMClient().setClientId_Equal(tStock.getClientId());
		// 商品IDの設定
		cb.query().queryMProduct().setProductId_Equal(tStock.getProductId());
		// ロケーションIDの設定
		cb.query().queryMLocation().setLocationId_Equal(tStock.getLocationId());
		// センタIDの設定
		cb.query().queryMWarehouse().setCenterId_Equal(mWarehouse.getCenterId());
		// 倉庫IDの設定
		cb.query().queryMWarehouse().setWarehouseId_Equal(mWarehouse.getWarehouseId());
		//[SK2-088] 引当済数＞０（引当可能数＝０）のロケーションを削除できる、問題ないですか？ 2014.12.22 KI Start
		// cb.query().setChargeNum_GreaterThan(0L);
		// cb.query().setMoveNum_GreaterThan(0L);
		// cb.query().setAllocNum_GreaterThan(0L);
		int count = 0;
		ListResultBean<TStock> TCB = tStockBhv.selectList(cb);
		if (TCB != null){
		for (TStock ts : TCB) {
			if (WCC.isPositive(ts.getChargeNum()) || WCC.isPositive(ts.getAllocNum()) || WCC.isPositive(ts.getMoveNum())){
				count += 1;
				break;
			}
		  }
		}
		//[SK2-088] 引当済数＞０（引当可能数＝０）のロケーションを削除できる、問題ないですか？ 2014.12.22 KI End

		if (count > 0) {
			result = true;
		} else {
			result = false;
		}

		return result;

	}
	// [ON推-品向-248] 在庫数＝０の場合は、修正可能にする。 2014.11.28 KI Start
	/**
	 * <h2>在庫数＝０のチェック処理を行う。</h2>
	 * <pre>
	 *
	 * 引数の各項目を条件にデータベースから在庫数＝０のデータ件数を取得し、
	 * 在庫存在チェックを行う。
	 *
	 * </pre>
	 * @param tStock 在庫マスタ：荷主ID・商品ID・ロケーションID
	 * @param mWarehouse 倉庫マスタ：センタID・倉庫ID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return boolean true：在庫あり、 false：在庫なし
	 */
	public boolean checkDataZeroChargeNum(TStock tStock, MWarehouse mWarehouse, ErrorStatus errSts) {

		Boolean result = false;

		// 検索条件の設定
		TStockCB cb = tStockBhv.newMyConditionBean();
		cb.setupSelect_MClient();
		cb.setupSelect_MProduct();
		cb.setupSelect_MLocation();
		cb.setupSelect_MWarehouse();

		// 荷主IDの設定
		cb.query().queryMClient().setClientId_Equal(tStock.getClientId());
		// 商品IDの設定
		cb.query().queryMProduct().setProductId_Equal(tStock.getProductId());
		// ロケーションIDの設定
		cb.query().queryMLocation().setLocationId_Equal(tStock.getLocationId());
		// センタIDの設定
		cb.query().queryMWarehouse().setCenterId_Equal(mWarehouse.getCenterId());
		// 倉庫IDの設定
		cb.query().queryMWarehouse().setWarehouseId_Equal(mWarehouse.getWarehouseId());
		// [ON推-品向-537] 引当済数、移動中数のチェックを追加 2015.01.14 kawana Start
		// 在庫数
		cb.orScopeQuery(new OrQuery<TStockCB>() {
			public void query(TStockCB orCB) {
				//引当可能数
				orCB.query().setChargeNum_GreaterThan(WCC.ZERO);
				//引当済数
				orCB.query().setAllocNum_GreaterThan(WCC.ZERO);
				//移動中数
				orCB.query().setMoveNum_GreaterThan(WCC.ZERO);
			}
		});
		// [ON推-品向-537] 引当済数、移動中数のチェックを追加 2015.01.14 kawana End

		int count = tStockBhv.selectCount(cb);

		if (count > 0) {
			result = true;
		} else {
			result = false;
		}

		return result;

	}
	// [ON推-品向-248] 在庫数＝０の場合は、修正可能にする。 2014.11.28 KI End

	// [Ver3.0] unit of measure対応 2017.12.04 NING Start
	/**
	 * <h2>在庫数＝０のチェック処理を行う。</h2>
	 * <pre>
	 *
	 * 引数の各項目を条件にデータベースから在庫数＝０のデータ件数を取得し、
	 * 在庫存在チェックを行う。
	 *
	 * </pre>
	 * @param tStock 在庫マスタ：荷主ID・商品ID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return boolean true：在庫あり、 false：在庫なし
	 */
	public boolean checkDataExist(TStock tStock, ErrorStatus errSts) {

		Boolean result = false;

		// 検索条件の設定
		TStockCB cb = tStockBhv.newMyConditionBean();
		cb.setupSelect_MClient();
		cb.setupSelect_MProduct();
		cb.setupSelect_MProduct().withMShapeGrp();

		// 荷主IDの設定
		cb.query().queryMClient().setClientId_Equal(tStock.getClientId());
		// 商品IDの設定
		cb.query().queryMProduct().setProductId_Equal(tStock.getProductId());

		// 在庫数
		cb.orScopeQuery(new OrQuery<TStockCB>() {
			public void query(TStockCB orCB) {
				//引当可能数
				orCB.query().setChargeNum_GreaterThan(WCC.ZERO);
				//引当済数
				orCB.query().setAllocNum_GreaterThan(WCC.ZERO);
				//移動中数
				orCB.query().setMoveNum_GreaterThan(WCC.ZERO);
				//積送中数
				orCB.query().setTransitNum_GreaterThan(WCC.ZERO);
			}
		});

		int count = tStockBhv.selectCount(cb);

		if (count > 0) {
			result = true;
		} else {
			result = false;
		}
		return result;
	}
	// [Ver3.0] unit of measure対応 2017.12.04 NING End
	// [Ver3.0] unit of measure対応 2017.12.15 NING Start
	/**
	 * <h2>在庫マスタのデータを選択する。</h2>
	 * <pre>
	 *
	 * 引数の各項目を条件にデータベースから在庫数＝０のデータを取得する。
	 *
	 * </pre>
	 * @param tStock 在庫マスタ：荷主ID・商品ID
	 * @return TStock 在庫マスタ
	 */
	public List<TStock> selectStock(TStock tStock) {

		// 検索条件の設定
		TStockCB cb = tStockBhv.newMyConditionBean();
		cb.setupSelect_MClient();
		cb.setupSelect_MProduct();
		cb.setupSelect_MProduct().withMShapeGrp();

		// 荷主IDの設定
		cb.query().queryMClient().setClientId_Equal(tStock.getClientId());
		// 商品IDの設定
		cb.query().queryMProduct().setProductId_Equal(tStock.getProductId());

		// 在庫数
		cb.orScopeQuery(new OrQuery<TStockCB>() {
			public void query(TStockCB orCB) {
				//引当可能数
				orCB.query().setChargeNum_GreaterThan(WCC.ZERO);
				//引当済数
				orCB.query().setAllocNum_GreaterThan(WCC.ZERO);
				//移動中数
				orCB.query().setMoveNum_GreaterThan(WCC.ZERO);
				//積送中数
				orCB.query().setTransitNum_GreaterThan(WCC.ZERO);
			}
		});

		List<TStock> stockList = tStockBhv.selectList(cb);

		return stockList;
	}
	// [Ver3.0] unit of measure対応 2017.12.15 NING End
}