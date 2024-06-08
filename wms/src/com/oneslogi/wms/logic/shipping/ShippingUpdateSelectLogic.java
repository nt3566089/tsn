package com.oneslogi.wms.logic.shipping;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.dbflute.bhv.referrer.ConditionBeanSetupper;
import org.dbflute.bhv.referrer.ReferrerLoaderHandler;
import org.dbflute.cbean.scoping.OrQuery;
import org.dbflute.cbean.scoping.SubQuery;

import com.oneslogi.base.dbflute.bsbhv.loader.LoaderOfTShippingInstB;
import com.oneslogi.base.dbflute.cbean.MProductShapeCB;
import com.oneslogi.base.dbflute.cbean.TPickingBCB;
import com.oneslogi.base.dbflute.cbean.TShippingInstBCB;
import com.oneslogi.base.dbflute.cbean.TStockCB;
import com.oneslogi.base.dbflute.exbhv.TAllocInstBBhv;
import com.oneslogi.base.dbflute.exbhv.TShippingInstBBhv;
import com.oneslogi.base.dbflute.exbhv.TStockBhv;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MClientCenter;
import com.oneslogi.base.dbflute.exentity.MParam;
import com.oneslogi.base.dbflute.exentity.TAllocInstB;
import com.oneslogi.base.dbflute.exentity.TLot;
import com.oneslogi.base.dbflute.exentity.TPickingB;
import com.oneslogi.base.dbflute.exentity.TShippingInstB;
import com.oneslogi.base.dbflute.exentity.TStock;
import com.oneslogi.base.dbflute.exentity.TStockInout;
import com.oneslogi.base.dbflute.exentity.TStoreNo;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.logic.common.ParamLogic;
import com.oneslogi.wms.util.WmsMultipleShapeUtil;

/**
 * 出荷実績訂正データ取得ロジッククラス
 */
public class ShippingUpdateSelectLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private TShippingInstBBhv tShippingInstBBhv;
	@Inject
	private TAllocInstBBhv tAllocInstBBhv;
	@Inject
	private ParamLogic paramLogic;
	// レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更(在庫受払操作クラスのDIを削除) 2016.02.15 kawana
	@Inject
	private TStockBhv tStockBhv;

	// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Delete

	/**
	 * <h2>出荷指示データを取得する。</h2>
	 * <pre>
	 * 引数をキーにデータベースから出荷指示データを取得する。
	 * 出庫ボディのデータが存在する場合、絞り込み在庫データを出力リストに設定する。
	 *
	 * 検索対象が見つからない場合、
	 * ０件エラーをエラーステータスに設定する。
	 * </pre>
	 * @param body 出荷指示ボディ：出荷指示ボディID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return List<TShippingInstB> 出荷指示ボディリスト
	 */
	public List<TShippingInstB> select(final TShippingInstB body, ErrorStatus errSts) {

		List<TShippingInstB> result = new ArrayList<TShippingInstB>();
		List<TShippingInstB> resultList = null;

		// ===== 出荷実績訂正データ取得 =====

		// 検索条件の設定
		TShippingInstBCB cb = tShippingInstBBhv.newMyConditionBean();

		//出荷指示ヘッダ
		cb.setupSelect_TShippingInstH();
		cb.setupSelect_TShippingInstH().withMCenter();
		cb.setupSelect_TShippingInstH().withMClient();
		//出荷指示ヘッダ->取引先マスタ
		cb.setupSelect_TShippingInstH().withMCustomerBySupplyCustomerId();
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
		cb.setupSelect_TShippingInstH().withMCustomerBySupplyCustomerId().withBClassDtlByShippingStopFlg().withVDict(getCultureId());
		//引当指示ボディ
		cb.setupSelect_TAllocInstB();
		cb.setupSelect_TAllocInstB().withTAllocInstH();
		cb.setupSelect_TAllocInstB().withTAllocInstH().withTPickingH();
		//商品マスタ
		cb.setupSelect_MProduct();
		cb.setupSelect_MProduct().withBClassDtlByShippingStopFlg().withVDict(getCultureId());
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe End
		// [#4198] 名寄せされた複数伝票で全欠品データの出荷実績訂正が致命的エラー 2018.03.29 yamamoto Start
		//紐付く出庫ボディが存在する事（全欠品していない事）
		cb.query().existsTPickingBList(new SubQuery<TPickingBCB>() {
			@Override
			public void query(TPickingBCB arg0) {

			}
		});
		// [#4198] 名寄せされた複数伝票で全欠品データの出荷実績訂正が致命的エラー 2018.03.29 yamamoto End

		//出荷指示ボディ.出荷指示ボディID = パラメータ.出荷指示ボディID
		cb.query().setShippingInstBId_Equal(body.getShippingInstBId());

		// ソート条件：行No
		cb.query().addOrderBy_LocationCd_Asc();
		cb.query().addOrderBy_Lot_Asc();
		cb.query().addOrderBy_LimitDt_Asc();
		cb.query().addOrderBy_StoreLabelNo_Asc();

		// 検索実行
		resultList = tShippingInstBBhv.selectList(cb);

		// ===== ０件チェック =====

		if (resultList.size() == 0) {
			// 全欠品の場合（出庫ボディなし）

			// 検索条件の設定
			cb = tShippingInstBBhv.newMyConditionBean();

			//出荷指示ヘッダ
			cb.setupSelect_TShippingInstH();
			cb.setupSelect_TShippingInstH().withMCenter();
			cb.setupSelect_TShippingInstH().withMClient();
			//出荷指示ヘッダ->取引先マスタ
			cb.setupSelect_TShippingInstH().withMCustomerBySupplyCustomerId();
			// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
			cb.setupSelect_TShippingInstH().withMCustomerBySupplyCustomerId().withBClassDtlByShippingStopFlg().withVDict(getCultureId());
			//商品マスタ
			cb.setupSelect_MProduct();
			cb.setupSelect_MProduct().withBClassDtlByShippingStopFlg().withVDict(getCultureId());
			// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe End
			//引当指示ボディ
			cb.setupSelect_TAllocInstB();
			cb.setupSelect_TAllocInstB().withTAllocInstH();
			cb.setupSelect_TAllocInstB().withTAllocInstH().withTPickingH();

			//出荷指示ボディ.出荷指示ボディID = パラメータ.出荷指示ボディID
			cb.query().setShippingInstBId_Equal(body.getShippingInstBId());

			// ソート条件：行No
			cb.query().addOrderBy_LocationCd_Asc();
			cb.query().addOrderBy_Lot_Asc();
			cb.query().addOrderBy_LimitDt_Asc();
			cb.query().addOrderBy_StoreLabelNo_Asc();

			// 検索実行
			result = tShippingInstBBhv.selectList(cb);

			// ===== ０件チェック =====

			if (result.size() == 0) {
				this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
				return result;
			}
		}
		else
		{List<TAllocInstB> tAllocInstBList = new ArrayList<TAllocInstB>();
			// 欠品なし、一部欠品の場合（出庫ボディあり）

			for (TShippingInstB tShippingInstB : resultList) {
				tAllocInstBList.add(tShippingInstB.getTAllocInstB());
			}

			// [Ver3.0] unit of measure対応 2017.11.24 駱 Del

			if (tAllocInstBList.size() > 0) {
				tAllocInstBBhv.loadTPickingBList(tAllocInstBList, new ConditionBeanSetupper<TPickingBCB>() {
					public void setup(TPickingBCB subCB) {
						// レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana Start
						subCB.setupSelect_TStock();

						subCB.setupSelect_TStock().withMCustomer();

						subCB.setupSelect_TStock().withMStockType();

						subCB.setupSelect_TStock().withMLocation();
						// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
						subCB.setupSelect_TStock().withMLocation().withBClassDtlByAllocNgFlg().withVDict(getCultureId());
						// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe End

						subCB.setupSelect_TStock().withTLot();

						subCB.setupSelect_TStock().withTStoreNo();

						//subCB.setupSelect_TStock().withMProduct();
						//subCB.setupSelect_TStock().withMProduct().withBClassDtlByShippingStopFlg().withVDict(getCultureId());

						// [Ver3.0] unit of measure対応 2017.11.24 駱 Del

						subCB.setupSelect_TPickingH();

						subCB.query().setShippingInstBId_Equal(body.getShippingInstBId());

						subCB.query().queryTStock().queryMLocation().addOrderBy_LocationCd_Asc();
						subCB.query().queryTStock().queryTLot().addOrderBy_Lot_Asc();
						subCB.query().queryTStock().queryTLot().addOrderBy_LimitDt_Asc();
						subCB.query().queryTStock().queryTStoreNo().addOrderBy_StoreLabelNo_Asc();
						// [#3018] 出荷実績訂正の表示順が異なる場合がある問題を修正 2018.02.16 kawana Start
						subCB.query().addOrderBy_ShapeId_Asc().withNullsLast();
						subCB.query().addOrderBy_PickingBId_Asc();
						// [#3018] 出荷実績訂正の表示順が異なる場合がある問題を修正 2018.02.16 kawana End
					}
				});

				int i = -1;

				for (TShippingInstB tShippingInstB : resultList) {
					i++;
					tShippingInstB.setTAllocInstB(tAllocInstBList.get(i));
				}

			}

			for (int j = 0; j < resultList.size(); j++)
			{

				for (int i = 0; i < resultList.get(j).getTAllocInstB().getTPickingBList().size(); i++)
				{
					TShippingInstB tb = new TShippingInstB();
					tb = resultList.get(j).clone();
					tb.setTShippingInstH(resultList.get(j).getTShippingInstH().clone());
					if(resultList.get(j).getTShippingInstH().getMCustomerBySupplyCustomerId() !=null)
					{
						tb.getTShippingInstH().setMCustomerBySupplyCustomerId(resultList.get(j).getTShippingInstH().getMCustomerBySupplyCustomerId().clone());
					}

					tb.setTAllocInstB(resultList.get(j).getTAllocInstB().clone());

					List<TPickingB> tPickingBList = new ArrayList<TPickingB>();
					TPickingB tPickingB = new TPickingB();
					tPickingB = resultList.get(j).getTAllocInstB().getTPickingBList().get(i).clone();
					tPickingB.setTPickingH(resultList.get(j).getTAllocInstB().getTPickingBList().get(i).getTPickingH().clone());
					// レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana Start
					tPickingB.setTStock(resultList.get(j).getTAllocInstB().getTPickingBList().get(i).getTStock().clone());
					tPickingB.getTStock().setMCustomer(resultList.get(j).getTAllocInstB().getTPickingBList().get(i).getTStock().getMCustomer().clone());
					tPickingB.getTStock().setMStockType(resultList.get(j).getTAllocInstB().getTPickingBList().get(i).getTStock().getMStockType().clone());
					tPickingB.getTStock().setMLocation(resultList.get(j).getTAllocInstB().getTPickingBList().get(i).getTStock().getMLocation().clone());
					tPickingB.getTStock().getMLocation()
					// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
							.setBClassDtlByAllocNgFlg(resultList.get(j).getTAllocInstB().getTPickingBList().get(i).getTStock().getMLocation().getBClassDtlByAllocNgFlg().clone());
					tPickingB.getTStock().getMLocation().getBClassDtlByAllocNgFlg()
							.setVDict(resultList.get(j).getTAllocInstB().getTPickingBList().get(i).getTStock().getMLocation().getBClassDtlByAllocNgFlg().getVDict().clone());
					// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe End
					tPickingB.getTStock().setTLot(resultList.get(j).getTAllocInstB().getTPickingBList().get(i).getTStock().getTLot().clone());
					tPickingB.getTStock().setTStoreNo(resultList.get(j).getTAllocInstB().getTPickingBList().get(i).getTStock().getTStoreNo().clone());

					// [Ver3.0] unit of measure対応 2017.11.24 駱 Del
					// レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana End

					tPickingBList.add(tPickingB);

					tb.getTAllocInstB().setTPickingBList(tPickingBList);

					if (i > 0)
					{
						//指示数
						tb.setInstNum(WCC.ZERO);
						//引当済数
						tb.setAllocNum(WCC.ZERO);
					}

					MClientCenter mClientCenter = new MClientCenter();
					mClientCenter.setCenterId(tb.getTShippingInstH().getCenterId());
					mClientCenter.setClientId(tb.getTShippingInstH().getClientId());

					MParam mParam = new MParam();
					mParam = paramLogic.getUkEntityWithDeletedCheck(mClientCenter);

					//入庫No.管理フラグ
					tb.setStoreNoFlg(mParam.getStoreNoFlg());

					result.add(tb);
				}
			}
		}
		// [Ver3.0] unit of measure対応 2017.11.24 駱 Start
		// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod Start
		// 商品に紐付く商品荷姿マスタ(荷姿グループマスタ関連含む)を抽出
		tShippingInstBBhv.load(result, new ReferrerLoaderHandler<LoaderOfTShippingInstB>() {
			@Override
			public void handle(LoaderOfTShippingInstB loader) {
				loader.pulloutMProduct().loadMProductShapeList(new ConditionBeanSetupper<MProductShapeCB>() {
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

		for (TShippingInstB instB : result) {
			// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod Start
			// 商品荷姿リストから最小荷姿単位、親荷姿単位、親荷姿入数を設定するためのMapを作成
			WmsMultipleShapeUtil.getParentMap(decimalExistFlgMap, minimumUnitMap, parentUnitNumMap, parentUnitMap, instB.getMProduct());
			// 商品最小荷姿単位名称
			instB.setProductUnit(WmsMultipleShapeUtil.getProductMinimumUnit(minimumUnitMap, instB.getMProduct()));
			// 入数内訳
			instB.setUnitNumBreakdown(WmsMultipleShapeUtil.getUnitNumBreakdown(decimalExistFlgMap, minimumUnitMap, parentUnitNumMap, parentUnitMap, instB.getMProduct()));
			// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod End
			// [#3132][Ver3.0] 小数有無フラグを加味した小数点チェック処理について 列型複数荷姿対応のため小数点チェック処理削除 2018.02.19 honma Delete
		}
		// [Ver3.0] unit of measure対応 2017.11.24 駱 End
		return result;
	}

	/**
	 * <h2>出荷実績訂正の在庫データを取得する。</h2>
	 * <pre>
	 * 出荷実績訂正時、引数をキーに在庫データを取得し、以下のチェックを行う。
	 *・在庫データ存在チェック
	 *・在庫数チェック
	 * チェックNGの場合、エラーをエラーステータスに設定する。
	 *
	 * </pre>
	 * @param tStock 在庫：荷主ID・商品ID・在庫区分ID・ロケーションID・預託ID
	 * @param mCenter センタマスタ：センタID
	 * @param tStoreNo 入庫No.：入庫日・入庫ラベルNo.
	 * @param tLot ロット：ロット・期限日
	 * @param tStockInout 在庫受払：受払数
	 * @param errSts エラー時に設定するエラーステータス
	 * @return List<TStock> 在庫リスト
	 */
	public List<TStock> selectStock(TStock tStock, MCenter mCenter, TStoreNo tStoreNo, TLot tLot, final TStockInout tStockInout, ErrorStatus errSts) {

		List<TStock> result1 = null;

		TStockCB cb1 = tStockBhv.newMyConditionBean();

		cb1.setupSelect_TStoreNo();
		cb1.setupSelect_TLot();
		cb1.setupSelect_MWarehouse();
		cb1.setupSelect_MWarehouse().withMCenter();

		//在庫.荷主ID = tStock.荷主ID
		cb1.query().setClientId_Equal(tStock.getClientId());
		//センタマスタ.センタID = mCenter.センタID
		cb1.query().queryMWarehouse().queryMCenter().setCenterId_Equal(mCenter.getCenterId());
		//在庫.商品ID = tStock.商品ID
		cb1.query().setProductId_Equal(tStock.getProductId());
		//在庫.在庫区分ID = tStock.在庫区分ID
		cb1.query().setStockTypeId_Equal(tStock.getStockTypeId());
		//在庫.ロケーションID = tStock.ロケーションID
		cb1.query().setLocationId_Equal(tStock.getLocationId());
		//在庫.預託ID = tStock.預託ID
		cb1.query().setDepositId_Equal(tStock.getDepositId());
		//入庫No..入庫ラベルNo. = tStoreNo.入庫ラベルNo.
		cb1.query().queryTStoreNo().setStoreLabelNo_Equal(tStoreNo.getStoreLabelNo());
		//ロット.ロット = tLot.ロット
		cb1.query().queryTLot().setLot_Equal(tLot.getLot());
		//ロット.期限日 = tLot.期限日
		cb1.query().queryTLot().setLimitDt_Equal(tLot.getLimitDt());
		// [1.1.4-CT-043] 入庫日を指定できるように変更 2016.05.20 kawana Start
		cb1.query().queryTStoreNo().setStoreDt_Equal(tStoreNo.getStoreDt());
		// [1.1.4-CT-043] 入庫日を指定できるように変更 2016.05.20 kawana End

		// [EC-CT1-190] 入庫ラベルNo未入力のときに入庫ラベルNo重複エラー発生 2015.04.10 kawana Start
		if (CU.isNullOrEmpty(tStoreNo.getStoreLabelNo())) {
			// 入庫ラベルNo.の指定がない場合

			cb1.orScopeQuery(new OrQuery<TStockCB>() {
				public void query(TStockCB orCb) {
					// 引当可能数 > 0
					orCb.query().setChargeNum_GreaterThan(WCC.ZERO);
					// 引当済数 > 0
					orCb.query().setAllocNum_GreaterThan(WCC.ZERO);
					// 移動中数 > 0
					orCb.query().setMoveNum_GreaterThan(WCC.ZERO);
				}
			});
		}
		// [EC-CT1-190] 入庫ラベルNo未入力のときに入庫ラベルNo重複エラー発生 2015.04.10 kawana End

		result1 = tStockBhv.selectList(cb1);

		if (result1.size() == 0) {
			// [新ｿﾘV2-046] メッセージ変更 2016.08.04 kawana Start
			// 在庫なし
			getErrorManager().add(errSts, WmsMessageConst.STOCK_CAN_BE_ALLOCATE_NOT_FOUND_INFORMATION);
			// [新ｿﾘV2-046] メッセージ変更 2016.08.04 kawana End
			return result1;
		}

		// [SK2-080] 在庫数は合計値で確認する(その後、入庫ラベルが複数でエラー) 2014.12.18 yokosuka Start
		//在庫数が不足
		BigDecimal sumChargeNum = WCC.ZERO;
		for(int i = 0 ; i < result1.size(); i++ ){
			sumChargeNum = WCC.add(sumChargeNum, result1.get(i).getChargeNum());
		}
		if( WCC.isLessThan(sumChargeNum, tStockInout.getStockInoutNum()) ){
			this.getErrorManager().add(errSts, WmsMessageConst.SHIP_INSTRUCTED_CANNOT_REGISTER_STOCK_SHORTAGE_ERROR);
			return result1;
		}
		// [SK2-080] 在庫数は合計値で確認する(その後、入庫ラベルが複数でエラー) 2014.12.18 yokosuka End

		// レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更(在庫受払のloadを削除) 2016.02.15 kawana

		return result1;

	}
}
