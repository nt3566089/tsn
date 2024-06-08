package com.oneslogi.ht.wms.logic.stock;

import java.util.List;

import javax.inject.Inject;

import org.dbflute.cbean.scoping.OrQuery;

import com.oneslogi.base.dbflute.cbean.TStockCB;
import com.oneslogi.base.dbflute.exbhv.TStockBhv;
import com.oneslogi.base.dbflute.exentity.BUser;
import com.oneslogi.base.dbflute.exentity.TStock;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CommonUtil;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 在庫検索取得ロジッククラス
 */
public class StockSearchSelectLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private TStockBhv tStockBhv;

	/**
	 * <h2>在庫データを取得する。</h2>
	 * <pre>
	 * 引数を条件に引当可能数＞0の在庫データを検索して返却する。
	 *
	 * 検索対象が見つからない場合、０件エラーをエラーステータスに設定する。
	 * </pre>
	 * @param tStock 在庫：センタID・ロケーションCD・JANCD・入庫ラベルNo.
	 * @param bUser ユーザマスタ：カルチャID
	 * @param clientId 荷主ID
	 * @param warehouseId 倉庫ID
	 * @return List<TStock> 在庫リスト
	 */
	//2015/05/14 [ON推-品向-811] WEBHT情報はIDに変更する YOKOSUKA [S]
	//public List<TStock> selectList(TStock tStock, BUser bUser, MClient mClient, MWarehouse mWarehouse) {
	public List<TStock> selectList(TStock tStock, BUser bUser, Long clientId, Long warehouseId) {
	//2015/05/14 [ON推-品向-811] WEBHT情報はIDに変更する YOKOSUKA [E]
		//在庫テーブルのデータ取得
		TStockCB tStockCB = tStockBhv.newMyConditionBean();
		tStockCB.setupSelect_MProduct();
		tStockCB.setupSelect_TStoreNo();
		tStockCB.setupSelect_TLot();
		tStockCB.setupSelect_MLocation();
		tStockCB.setupSelect_MStockType();
		tStockCB.setupSelect_MStockType().withVDict(bUser.getCultureId());
		tStockCB.setupSelect_MCustomer();
		tStockCB.setupSelect_MLocation();
		//2015/05/14 [ON推-品向-811] WEBHT情報はIDに変更する YOKOSUKA [S]
		//tStockCB.query().setClientId_Equal(mClient.getClientId());
		tStockCB.query().setClientId_Equal(clientId);
		tStockCB.query().queryMLocation().setCenterId_Equal(tStock.getMWarehouse().getCenterId());
		//2015/05/14 [ON推-品向-811] WEBHT情報はIDに変更する YOKOSUKA [E]
		//2015/05/12 [ON推-品向-797] 倉庫情報は取得しない YOKOSUKA [S]
		//tStockCB.query().setWarehouseId_Equal(mWarehouse.getWarehouseId());
		//2015/05/12 [ON推-品向-797] 倉庫情報は取得しない YOKOSUKA [E]

		// 引当可能数＞0
		tStockCB.query().setChargeNum_GreaterThan(WCC.ZERO);

		if (!CommonUtil.isNullOrEmpty(tStock.chaseMLocation().getLocationCd())) {
			tStockCB.query().queryMLocation().setLocationCd_Equal(tStock.chaseMLocation().getLocationCd());
		}
		if (!CommonUtil.isNullOrEmpty(tStock.chaseMProduct().getJanCd())) {
			final String janCd = tStock.chaseMProduct().getJanCd();
			tStockCB.orScopeQuery(new OrQuery<TStockCB>() {
				public void query(TStockCB orCB) {
					orCB.query().queryMProduct().setJanCd_Equal(janCd);
					orCB.query().queryMProduct().setProductCd_Equal(janCd);
				}
			});
		}
		if (!CommonUtil.isNullOrEmpty(tStock.chaseTStoreNo().getStoreLabelNo())) {
			tStockCB.query().queryTStoreNo().setStoreLabelNo_Equal(tStock.chaseTStoreNo().getStoreLabelNo());
		}

		// ソート順
		tStockCB.query().queryMProduct().addOrderBy_ProductCd_Asc();
		tStockCB.query().queryMStockType().addOrderBy_StockTypeCd_Asc();
		tStockCB.query().queryMLocation().addOrderBy_LocationCd_Asc();
		tStockCB.query().queryTLot().addOrderBy_Lot_Asc();
		tStockCB.query().queryTLot().addOrderBy_LimitDt_Asc();

		List<TStock> lsttStock = tStockBhv.selectList(tStockCB);

		if (lsttStock.size() == 0) {
			//該当データが存在しません。
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_DATA_NOT_FOUND_ERROR);
			return lsttStock;
		}

		return lsttStock;
	}
}