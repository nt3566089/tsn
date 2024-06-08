package com.oneslogi.wms.logic.inventory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.dbflute.bhv.referrer.ConditionBeanSetupper;
import org.dbflute.bhv.referrer.ReferrerLoaderHandler;

import com.oneslogi.base.dbflute.bsbhv.loader.LoaderOfTInventoryR;
import com.oneslogi.base.dbflute.cbean.MProductShapeCB;
import com.oneslogi.base.dbflute.cbean.TInventoryRCB;
import com.oneslogi.base.dbflute.exbhv.TInventoryRBhv;
import com.oneslogi.base.dbflute.exentity.MLocation;
import com.oneslogi.base.dbflute.exentity.TInventoryB;
import com.oneslogi.base.dbflute.exentity.TInventoryH;
import com.oneslogi.base.dbflute.exentity.TInventoryInst;
import com.oneslogi.base.dbflute.exentity.TInventoryR;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.logic.common.LocationLogic;
import com.oneslogi.wms.util.WmsMultipleShapeUtil;

/**
 * 棚卸作業リスト発行ロジッククラス
 */
public class InventoryWorkListPrintLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private TInventoryRBhv tInventoryRBhv;
	// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Delete

	/**
	 * <h2>棚卸帳票データを更新する。</h2>
	 * <pre>
	 * 受取ったデータを条件に、棚卸帳票のコントロールNo.を更新する。
	 * 検索対象が見つからない場合、
	 * ０件エラーをエラーステータスに設定する。
	 * </pre>
	 * @param tInventoryH 棚卸ヘッダ：棚卸日・荷主ID・センタID
	 * @param tInventoryB 棚卸ボディ：預託ID・倉庫ID・在庫区分ID・商品ID
	 * @param tInventoryInst 棚卸指示：ロケーションCD(From)・ロケーションCD(To)
	 * @param tInventoryR 棚卸帳票：全項目
	 * @param zoneIdList ゾーンIDリスト：ゾーンID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return int 棚卸帳票の更新件数
	 */
	// [横並-177] ゾーンIDリストを修正 2014.11.24 SJA-ZHENG Start
	public int updateControlNo(TInventoryH tInventoryH, TInventoryB tInventoryB, TInventoryInst tInventoryInst, TInventoryR tInventoryR,List<Long> zoneIdList, ErrorStatus errSts) {
		// [横並-177] ゾーンIDリストを修正 2014.11.24 SJA-ZHENG End
		// ===== 初期処理 =====
		int result = 0;

		MLocation mLocationExentity = new MLocation();
		mLocationExentity.setLocationCdFrom(tInventoryInst.getFromLocationCd());
		mLocationExentity.setLocationCdTo(tInventoryInst.getToLocationCd());
		LocationLogic LocationLogic = new LocationLogic();
		// 最小、最大ロケーションを取得する
		MLocation maxLocationCd = LocationLogic.getMaxLocationCd(mLocationExentity);
		if (maxLocationCd == null) {
			maxLocationCd = new MLocation();
		}
		MLocation minLocationCd = LocationLogic.getMinLocationCd(mLocationExentity);
		if (minLocationCd == null) {
			minLocationCd = new MLocation();
		}

		// ===== 棚卸作業データ取得 =====
		// 検索条件の設定
		TInventoryRCB cb = tInventoryRBhv.newMyConditionBean();
		cb.setupSelect_TInventoryB();
		cb.setupSelect_TInventoryB().withTInventoryH();
		cb.setupSelect_TInventoryB().withTInventoryH().withMClient();
		cb.setupSelect_TInventoryB().withMWarehouse();
		cb.setupSelect_TInventoryB().withMLocation();
		cb.setupSelect_TInventoryB().withMLocation().withMZone();
		cb.setupSelect_TInventoryB().withMProduct();
		cb.setupSelect_TInventoryB().withTStoreNo();
		cb.setupSelect_TInventoryB().withTLot();
		cb.setupSelect_TInventoryB().withMStockType();
		cb.setupSelect_TInventoryB().withMCustomerByDepositId();
		// 棚卸日の設定
		cb.query().queryTInventoryB().queryTInventoryH().setInventoryDt_Equal(tInventoryH.getInventoryDt());
		// 荷主IDの設定
		cb.query().queryTInventoryB().queryTInventoryH().setClientId_Equal(tInventoryH.getClientId());
		// センタIDの設定
		cb.query().queryTInventoryB().queryTInventoryH().setCenterId_Equal(tInventoryH.getCenterId());
		// 倉庫IDの設定
		cb.query().queryTInventoryB().setWarehouseId_Equal(tInventoryB.getWarehouseId());
		// 預託IDの設定
		cb.query().queryTInventoryB().setDepositId_Equal(tInventoryB.getDepositId());
		// 在庫区分IDの設定
		cb.query().queryTInventoryB().setStockTypeId_Equal(tInventoryB.getStockTypeId());
		// 商品IDの設定
		cb.query().queryTInventoryB().setProductId_Equal(tInventoryB.getProductId());
		// ロケーションCD
		cb.query().queryTInventoryB().queryMLocation().setLocationCd_GreaterEqual(minLocationCd.getLocationCdFrom());
		// ロケーションCD
		cb.query().queryTInventoryB().queryMLocation().setLocationCd_LessEqual(maxLocationCd.getLocationCdTo());
		// ゾーンIDの設定
		// [横並-177] ゾーンIDリストを修正 2014.11.24 SJA-ZHENG Start
		cb.query().queryTInventoryB().queryMLocation().setZoneId_InScope(zoneIdList);
		// [横並-177] ゾーンIDリストを修正 2014.11.24 SJA-ZHENG End

		// [ON推-品向-502] 在庫表示が「1:表示する」の場合、引当可能数と引当済み数０以上 ← 条件を削除 2014.12.26 許

		// 棚卸帳票の検索更新実行
		result = tInventoryRBhv.queryUpdate(tInventoryR, cb);

		// ===== ０件チェック =====
		if (result == 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return result;
		}

		return result;
	}

	/**
	 * <h2>棚卸データを取得する。</h2>
	 * <pre>
	 * 受取ったデータを条件に棚卸入力データの取得処理を行う。
	 * 検索対象が見つからない場合、
	 * ０件エラーをエラーステータスに設定する。
	 * </pre>
	 * @param tInventoryR 棚卸帳票：コントロールNo.
	 * @param errSts エラー時に設定するエラーステータス
	 * @return List<TInventoryB> 棚卸ボディリスト
	 */
	public List<TInventoryB> select(TInventoryR tInventoryR, ErrorStatus errSts) {
		// ===== 初期処理 =====
		List<TInventoryB> result = null;
		List<TInventoryB> tIB = new ArrayList<TInventoryB>();

		// ===== 棚卸作業データ取得 =====
		// 検索条件の設定
		TInventoryRCB cb = tInventoryRBhv.newMyConditionBean();
		cb.setupSelect_TInventoryB();
		cb.setupSelect_TInventoryB().withTInventoryH();
		cb.setupSelect_TInventoryB().withTInventoryH().withMClient();
		cb.setupSelect_TInventoryB().withTInventoryH().withMCenter();
		cb.setupSelect_TInventoryB().withMWarehouse();
		cb.setupSelect_TInventoryB().withMLocation();
		cb.setupSelect_TInventoryB().withMLocation().withMZone();
		cb.setupSelect_TInventoryB().withMProduct();
		cb.setupSelect_TInventoryB().withTStoreNo();
		cb.setupSelect_TInventoryB().withTLot();
		cb.setupSelect_TInventoryB().withMStockType();
		cb.setupSelect_TInventoryB().withMStockType().withVDict(getCultureId());
		cb.setupSelect_TInventoryB().withMCustomerByDepositId();
		// コントロールNo.の設定
		cb.query().setControlNo_Equal(tInventoryR.getControlNo());
		// ソート条件
		cb.query().queryTInventoryB().queryTInventoryH().queryMClient().addOrderBy_ClientCd_Asc();
		cb.query().queryTInventoryB().queryTInventoryH().queryMCenter().addOrderBy_CenterCd_Asc();
		cb.query().queryTInventoryB().queryMWarehouse().addOrderBy_WarehouseCd_Asc();
		/*cb.query().queryTInventoryB().queryTInventoryH().addOrderBy_InventoryDt_Asc();*/
		cb.query().queryTInventoryB().queryMLocation().queryMZone().addOrderBy_PickingOrder_Asc();
		cb.query().queryTInventoryB().queryMLocation().addOrderBy_PickingOrder_Asc();
		cb.query().queryTInventoryB().queryMLocation().queryMZone().addOrderBy_ZoneCd_Asc();
		cb.query().queryTInventoryB().queryMLocation().addOrderBy_LocationCd_Asc();
		cb.query().queryTInventoryB().queryMProduct().addOrderBy_ProductCd_Asc();
		cb.query().queryTInventoryB().queryMStockType().addOrderBy_StockTypeCd_Asc();
		cb.query().queryTInventoryB().queryMCustomerByDepositId().addOrderBy_CustomerCd_Asc();
		cb.query().queryTInventoryB().queryTLot().addOrderBy_Lot_Asc();
		cb.query().queryTInventoryB().queryTLot().addOrderBy_LimitDt_Asc();
		cb.query().queryTInventoryB().queryTStoreNo().addOrderBy_StoreLabelNo_Asc();

		// [ON推-品向-601] 帳票用の検索を共通メソッドを使用するように変更 2015.04.17 kawana Start
		List<TInventoryR> tInventoryRList = selectListToReport(tInventoryRBhv, cb);
		// [ON推-品向-601] 帳票用の検索を共通メソッドを使用するように変更 2015.04.17 kawana End

		// ===== ０件チェック =====
		if (tInventoryRList.size() == 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return result;
		}

		// [Ver3.0] unit of measure対応 2017.11.27 HDIS王 Start
		// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod Start
		tInventoryRBhv.load(tInventoryRList, new ReferrerLoaderHandler<LoaderOfTInventoryR>() {
			@Override
			public void handle(LoaderOfTInventoryR loader) {
				loader.pulloutTInventoryB().pulloutMProduct().loadMProductShapeList(new ConditionBeanSetupper<MProductShapeCB>() {
					@Override
					public void setup(MProductShapeCB subCB) {
						subCB.setupSelect_MShapeGrpDtl().withMShapeGrp();
						subCB.setupSelect_MShapeGrpDtl().withMShape().withVDictByShapeDictId(getCultureId());
						subCB.setupSelect_MShapeGrpDtl().withMShape().withVDictByShapeUnitDictId(getCultureId());
						subCB.query().setDelFlg_Equal_$0();
						subCB.query().queryMShapeGrpDtl().addOrderBy_ShapeSort_Asc();
					}
				});
			}
		});
		// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod End
		Map<Long, String> decimalExistFlgMap = new HashMap<>();
		Map<Long, String> minimumUnitMap = new HashMap<>();
		Map<Long, List<Long>> parentUnitNumMap = new HashMap<>();
		Map<Long, List<String>> parentUnitMap = new HashMap<>();

		// 検索結果をリターンの棚卸ボディリストにセット
		for(TInventoryR t : tInventoryRList){
			// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod End
			WmsMultipleShapeUtil.getParentMap(decimalExistFlgMap, minimumUnitMap, parentUnitNumMap, parentUnitMap, t.getTInventoryB().getMProduct());
			TInventoryB tIBtmp = new TInventoryB();
			tIBtmp = t.getTInventoryB();

			tIBtmp.setStringUnitNum(WmsMultipleShapeUtil.getUnitNumBreakdown(decimalExistFlgMap, minimumUnitMap, parentUnitNumMap, parentUnitMap, t.getTInventoryB().getMProduct()));
			tIBtmp.setBreakdown(WmsMultipleShapeUtil.getPlanBreakdown(decimalExistFlgMap, tIBtmp.getChargeNum(), minimumUnitMap, parentUnitNumMap
					, parentUnitMap, t.getTInventoryB().getMProduct(), WmsMultipleShapeUtil.DisplayMode.SHAPE_ONLY));
			tIBtmp.setMinimumPackingUnit(WmsMultipleShapeUtil.getProductMinimumUnit(minimumUnitMap, tIBtmp.getMProduct()));

			tIB.add(tIBtmp);
			// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod End
//			tIB.add(tIR.getTInventoryB());
			// [Ver3.0] unit of measure対応 2017.11.27 HDIS王 End
		}

		result = tIB;
		return result;
	}

	/**
	 * <h2>棚卸帳票のリスト出力情報を更新する。</h2>
	 * <pre>
	 * 棚卸帳票の棚卸作業リスト情報を更新する。
	 *
	 * </pre>
	 * @param tInventoryRCond 棚卸帳票：コントロールNo.
	 * @param tInventoryR 棚卸帳票：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void updateOutFlg(TInventoryR tInventoryRCond, TInventoryR tInventoryR, ErrorStatus errSts) {

		// ===== 棚卸帳票の出力情報取得 =====
		// 検索条件の設定
		TInventoryRCB cb = tInventoryRBhv.newMyConditionBean();
		// コントロールNo.の設定
		cb.query().setControlNo_Equal(tInventoryRCond.getControlNo());

		// 棚卸帳票の更新実行
		tInventoryRBhv.queryUpdate(tInventoryR, cb);
	}
}
