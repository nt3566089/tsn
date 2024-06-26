package com.oneslogi.wms.logic.stock;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.dbflute.bhv.referrer.ConditionBeanSetupper;
import org.dbflute.bhv.referrer.ReferrerLoaderHandler;
import org.dbflute.cbean.result.ListResultBean;
import org.dbflute.cbean.scoping.OrQuery;

import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.allcommon.CDef.StockNum0Display;
import com.oneslogi.base.dbflute.allcommon.CDef.TransitDisplay;
import com.oneslogi.base.dbflute.bsbhv.loader.LoaderOfTStockReport;
import com.oneslogi.base.dbflute.cbean.HStockReportCB;
import com.oneslogi.base.dbflute.cbean.MProductShapeCB;
import com.oneslogi.base.dbflute.cbean.TStockReportCB;
import com.oneslogi.base.dbflute.exbhv.HStockReportBhv;
import com.oneslogi.base.dbflute.exbhv.MProductBhv;
import com.oneslogi.base.dbflute.exbhv.TStockReportBhv;
import com.oneslogi.base.dbflute.exentity.HStockReport;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MClientCenter;
import com.oneslogi.base.dbflute.exentity.MLocation;
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.base.dbflute.exentity.MZone;
import com.oneslogi.base.dbflute.exentity.TLot;
import com.oneslogi.base.dbflute.exentity.TStock;
import com.oneslogi.base.dbflute.exentity.TStockReport;
import com.oneslogi.base.dto.PagingDto.PagingData;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.logic.common.ClientCenterLogic;
import com.oneslogi.wms.logic.common.LocationLogic;
import com.oneslogi.wms.util.WmsMultipleShapeUtil;

/**
 * 在庫問合せデータ取得ロジッククラス
 */
public class StockListLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private TStockReportBhv tStockReportBhv;

	@Inject
	private HStockReportBhv hStockReportBhv;

	@Inject
	private ClientCenterLogic clientCenterLogic;

	// [Ver3.0] unit of measure対応 2017.11.28 駱 Start
	@Inject
	private MProductBhv mProductBhv;
	// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Delete

	// [Ver3.0] unit of measure対応 2017.11.28 駱 End

	/**
	 * <h2>在庫データを取得する。</h2>
	 * <pre>
	 * 引数をキーに在庫データを取得する。
	 * ・日付がシステム管理日付の場合、在庫から検索する。
	 * ・・日付がシステム管理日付以外の場合、在庫履歴から検索する。
	 * 対象が見つからない場合、０件エラーをエラーステータス情報に設定する。
	 * </pre>
	 * @param tStock 在庫：荷主ID・日付・倉庫ID・預託ID・在庫区分ID・在庫数0非表示・引当可能数0非表示・0非表示
	 *                     積送中在庫表示・在庫表示順
	 * @param mCenter センタマスタ：センタID
	 * @param mProduct 商品マスタ：商品CD・JANCD
	 * @param mLocation ロケーションマスタ：ロケーションCD(From)・ロケーションCD(To)
	 * @param mZone ゾーンマスタ：ゾーンCD
	 * @param tLot ロット：期限日(From)・期限日(To)・ロット
	 * @param paging ページ検索の設定
	 * @param errSts エラー時に設定するエラーステータス
	 * @return ListResultBean<?> 戻り値リスト
	 */
	public ListResultBean<?> select(TStock tStock,
			MCenter mCenter,
			// [ON推-品向-263] 未使用の区分値を引数から削除 2014.11.21 kawana
			MProduct mProduct,
			MLocation mLocation,
			// [C-CWMS-0029] 検索条件にゾーンを追加 2015.06.05 kawana Start
			MZone mZone,
			// [C-CWMS-0029] 検索条件にゾーンを追加 2015.06.05 kawana End
			TLot tLot,
			PagingData paging,
			ErrorStatus errSts) {

		ListResultBean<TStockReport> resultTStockReport = null;
		ListResultBean<HStockReport> resultHStockReport = null;

		MLocation mLocationExentity = new MLocation();
		mLocationExentity.setLocationCdFrom(mLocation.getLocationCdFrom());
		mLocationExentity.setLocationCdTo(mLocation.getLocationCdTo());
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

		// ===== 在庫問合せデータ取得 =====

		// システム管理日付取得
		MClientCenter mClientCenter = new MClientCenter();
		//荷主ID
		mClientCenter.setClientId(tStock.getClientId());
		//センタID
		mClientCenter.setCenterId(mCenter.getCenterId());
		mClientCenter = clientCenterLogic.getUkEntity(mClientCenter);

		TStockReportCB cb = tStockReportBhv.newMyConditionBean();
		HStockReportCB cb2 = hStockReportBhv.newMyConditionBean();

		// ===== 処理対象テーブル =====
		// 日付はシステム管理日付の場合
		if (tStock.getDataTime().equals(mClientCenter.getSystemDt())) {
			//商品マスタ
			cb.setupSelect_TStock().withMProduct();
			//ロケーションマスタ
			cb.setupSelect_TStock().withMLocation();
			// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.19 miyabe Start
			cb.setupSelect_TStock().withMLocation().withBClassDtlByAllocNgFlg().withVDict(getCultureId());
			// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.19 miyabe End
			// [C-CWMS-0043] 入庫ラベル発行機能追加 2015.08.25 kawana Start
			// ゾーン
			cb.setupSelect_TStock().withMLocation().withMZone();
			// [C-CWMS-0043] 入庫ラベル発行機能追加 2015.08.25 kawana End
			//取引先マスタ
			cb.setupSelect_TStock().withMCustomer();
			//在庫区分マスタ
			cb.setupSelect_TStock().withMStockType();
			//辞書マスタビュー
			cb.setupSelect_TStock().withMStockType().withVDict(getCultureId());
			//ロット
			cb.setupSelect_TStock().withTLot();
			//入庫No.
			cb.setupSelect_TStock().withTStoreNo();
			//入庫No.(元入庫No.ID)
			cb.setupSelect_TStock().withTStoreNo().withTStoreNoSelf();
			//仕入先
			cb.setupSelect_TStock().withTStoreNo().withMCustomer();
			// [ON推-品向-986] 入庫ラベル出力フラグの更新処理を追加 2015.11.02 kawana Start
			//入庫No.帳票
			cb.setupSelect_TStock().withTStoreNo().withTStoreNoRAsOne();
			// [ON推-品向-986] 入庫ラベル出力フラグの更新処理を追加 2015.11.02 kawana End
			//荷主マスタ
			cb.setupSelect_TStock().withMClient();
			//倉庫マスタ
			cb.setupSelect_TStock().withMWarehouse();
			//センタマスタ
			cb.setupSelect_TStock().withMWarehouse().withMCenter();
		} else {
			//在庫履歴
			//商品マスタ
			cb2.setupSelect_HStock();
			cb2.setupSelect_HStock().withMStockType();
			cb2.setupSelect_HStock().withMStockType().withVDict(getCultureId());
		}
		// ===== 検索条件 =====
		// 日付はシステム管理日付の場合
		if (tStock.getDataTime().equals(mClientCenter.getSystemDt())) {
			//荷主ID
			cb.query().queryTStock().setClientId_Equal(tStock.getClientId());
			//センタID
			cb.query().queryTStock().queryMWarehouse().queryMCenter().setCenterId_Equal(mCenter.getCenterId());
			//倉庫ID
			cb.query().queryTStock().setWarehouseId_Equal(tStock.getWarehouseId());
			// [C-CWMS-0029] 検索条件にゾーンを追加 2015.06.05 kawana Start
			//ゾーンCD
			cb.query().queryTStock().queryMLocation().queryMZone().setZoneCd_Equal(mZone.getZoneCd());
			// [C-CWMS-0029] 検索条件にゾーンを追加 2015.06.05 kawana End
			//商品CD
			cb.query().queryTStock().queryMProduct().setProductCd_PrefixSearch(mProduct.getProductCd());
			//最小ロケーション
			cb.query().queryTStock().queryMLocation().setLocationCd_GreaterEqual(minLocationCd.getLocationCdFrom());
			//最大ロケーション
			cb.query().queryTStock().queryMLocation().setLocationCd_LessEqual(maxLocationCd.getLocationCdTo());
			//JANCD
			cb.query().queryTStock().queryMProduct().setJanCd_PrefixSearch(mProduct.getJanCd());
			//預託ID
			cb.query().queryTStock().setDepositId_Equal(tStock.getDepositId());
			//在庫区分ID
			cb.query().queryTStock().setStockTypeId_Equal(tStock.getStockTypeId());
			//期限日(From)
			cb.query().queryTStock().queryTLot().setLimitDt_GreaterEqual(tLot.getLimitDtFrom());
			//期限日(To)
			cb.query().queryTStock().queryTLot().setLimitDt_LessEqual(tLot.getLimitDtTo());
			//ロット
			cb.query().queryTStock().queryTLot().setLot_PrefixSearch(tLot.getLot());

			// [ON推-品向-960] 在庫数を追加 2015.10.06 kawana Start
			// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.19 miyabe Start

			// 在庫数 0非表示
			CDef.StockNum0Display stockNumDisplay = CDef.StockNum0Display.codeOf(tStock.getStockNumDisplay());
			if (stockNumDisplay == StockNum0Display.$1) {
				// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.19 miyabe End
				// 0非表示の場合は引当可能数、引当済数、移動中数のいずれかが1以上(0以外)のものを表示

				cb.orScopeQuery(new OrQuery<TStockReportCB>() {
					public void query(TStockReportCB orCB) {
						//引当可能数
						orCB.query().queryTStock().setChargeNum_NotEqual(WCC.ZERO);
						//引当済数
						orCB.query().queryTStock().setAllocNum_NotEqual(WCC.ZERO);
						//移動中数
						orCB.query().queryTStock().setMoveNum_NotEqual(WCC.ZERO);
					}
				});
			}

			// [ON推-品向-960] 在庫数を追加 2015.10.06 kawana End

			//引当可能数 0非表示は'1'のとき
			if (tStock.getChargeNumDisplay().equals(1l)) {
				//引当可能数
				cb.query().queryTStock().setChargeNum_NotEqual(WCC.ZERO);
			}
			//0非表示は'1'のとき
			if (tStock.getDisplay().equals(1l)) {
				cb.orScopeQuery(new OrQuery<TStockReportCB>() {
					public void query(TStockReportCB orCB) {
						//引当可能数
						orCB.query().queryTStock().setChargeNum_NotEqual(WCC.ZERO);
						//引当済数
						orCB.query().queryTStock().setAllocNum_NotEqual(WCC.ZERO);
						//移動中数
						orCB.query().queryTStock().setMoveNum_NotEqual(WCC.ZERO);
						//当日入庫数
						orCB.query().setStoreNumDay_NotEqual(WCC.ZERO);
						//当日出庫数
						orCB.query().setPickingNumDay_NotEqual(WCC.ZERO);
						//当日移動数＋
						orCB.query().setMovePlsNumDay_NotEqual(WCC.ZERO);
						//当日移動数－
						orCB.query().setMoveMnsNumDay_NotEqual(WCC.ZERO);
						//当日調整数＋
						orCB.query().setAdjPlsNumDay_NotEqual(WCC.ZERO);
						//当日調整数－
						orCB.query().setAdjMnsNumDay_NotEqual(WCC.ZERO);
						//当月入庫数
						orCB.query().setStoreNumMonth_NotEqual(WCC.ZERO);
						//当月出庫数
						orCB.query().setPickingNumMonth_NotEqual(WCC.ZERO);
						//当月移動数＋
						orCB.query().setMovePlsNumMonth_NotEqual(WCC.ZERO);
						//当月移動数－
						orCB.query().setMoveMnsNumMonth_NotEqual(WCC.ZERO);
						//当月調整数＋
						orCB.query().setAdjPlsNumMonth_NotEqual(WCC.ZERO);
						//当月調整数－
						orCB.query().setAdjMnsNumMonth_NotEqual(WCC.ZERO);
					}
				});
			}
			// [C-CWMS-0039] センタ間移動機能を追加 2015.09.15 kawana Start
			// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.19 miyabe Start
			// 積送中在庫のみ表示
			CDef.TransitDisplay transitDisplay = CDef.TransitDisplay.codeOf(tStock.getTransitDisplay());
			if (transitDisplay == TransitDisplay.$1) {
				// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.19 miyabe End
				cb.query().queryTStock().setTransitNum_NotEqual(WCC.ZERO);
			}
			// [C-CWMS-0039] センタ間移動機能を追加 2015.09.15 kawana End

		} else {
			//荷主ID
			cb2.query().queryHStock().setClientId_Equal(tStock.getClientId());
			//センタID
			cb2.query().queryHStock().setCenterId_Equal(mCenter.getCenterId());
			//倉庫ID
			cb2.query().queryHStock().setWarehouseId_Equal(tStock.getWarehouseId());
			//履歴日
			cb2.query().setHistDt_Equal(tStock.getDataTime());
			// [C-CWMS-0029] 検索条件にゾーンを追加 2015.06.05 kawana Start
			//ゾーンCD
			cb2.query().queryHStock().setZoneCd_Equal(mZone.getZoneCd());
			// [C-CWMS-0029] 検索条件にゾーンを追加 2015.06.05 kawana End
			//商品CD
			cb2.query().queryHStock().setProductCd_PrefixSearch(mProduct.getProductCd());
			//最小ロケーション
			cb2.query().queryHStock().setLocationCd_GreaterEqual(minLocationCd.getLocationCdFrom());
			//最大ロケーション
			cb2.query().queryHStock().setLocationCd_LessEqual(maxLocationCd.getLocationCdTo());
			//JANCD
			cb2.query().queryHStock().setJanCd_PrefixSearch(mProduct.getJanCd());
			//預託ID
			cb2.query().queryHStock().setDepositId_Equal(tStock.getDepositId());
			//在庫区分ID
			cb2.query().queryHStock().setStockTypeId_Equal(tStock.getStockTypeId());
			//期限日(From)
			cb2.query().queryHStock().setLimitDt_GreaterEqual(tLot.getLimitDtFrom());
			//期限日(To)
			cb2.query().queryHStock().setLimitDt_LessEqual(tLot.getLimitDtTo());
			//ロット
			cb2.query().queryHStock().setLot_PrefixSearch(tLot.getLot());

			// [ON推-品向-960] 在庫数を追加 2015.10.06 kawana Start

			// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.19 miyabe Start
			// 在庫数 0非表示
			CDef.StockNum0Display stockNumDisplay = CDef.StockNum0Display.codeOf(tStock.getStockNumDisplay());
			if (stockNumDisplay == StockNum0Display.$1) {
				// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.19 miyabe End
				// 0非表示の場合は引当可能数、引当済数、移動中数のいずれかが1以上(0以外)のものを表示

				cb2.orScopeQuery(new OrQuery<HStockReportCB>() {
					public void query(HStockReportCB orCB2) {
						//引当可能数
						orCB2.query().setChargeNum_NotEqual(WCC.ZERO);
						//引当済数
						orCB2.query().setAllocNum_NotEqual(WCC.ZERO);
						//移動中数
						orCB2.query().setMoveNum_NotEqual(WCC.ZERO);
					}
				});
			}

			// [ON推-品向-960] 在庫数を追加 2015.10.06 kawana End

			//引当可能数 0非表示は'1'のとき
			if (tStock.getChargeNumDisplay().equals(1l)) {
				//引当可能数
				cb2.query().setChargeNum_NotEqual(WCC.ZERO);
			}
			//0非表示は'1'のとき
			if (tStock.getDisplay().equals(1l)) {
				cb2.orScopeQuery(new OrQuery<HStockReportCB>() {
					public void query(HStockReportCB orCB2) {
						//引当可能数
						orCB2.query().setChargeNum_NotEqual(WCC.ZERO);
						//引当済数
						orCB2.query().setAllocNum_NotEqual(WCC.ZERO);
						//移動中数
						orCB2.query().setMoveNum_NotEqual(WCC.ZERO);
						//当日入庫数
						orCB2.query().setStoreNumDay_NotEqual(WCC.ZERO);
						//当日出庫数
						orCB2.query().setPickingNumDay_NotEqual(WCC.ZERO);
						//当日移動数＋
						orCB2.query().setMovePlsNumDay_NotEqual(WCC.ZERO);
						//当日移動数－
						orCB2.query().setMoveMnsNumDay_NotEqual(WCC.ZERO);
						//当日調整数＋
						orCB2.query().setAdjPlsNumDay_NotEqual(WCC.ZERO);
						//当日調整数－
						orCB2.query().setAdjMnsNumDay_NotEqual(WCC.ZERO);
						//当月入庫数
						orCB2.query().setStoreNumMonth_NotEqual(WCC.ZERO);
						//当月出庫数
						orCB2.query().setPickingNumMonth_NotEqual(WCC.ZERO);
						//当月移動数＋
						orCB2.query().setMovePlsNumMonth_NotEqual(WCC.ZERO);
						//当月移動数－
						orCB2.query().setMoveMnsNumMonth_NotEqual(WCC.ZERO);
						//当月調整数＋
						orCB2.query().setAdjPlsNumMonth_NotEqual(WCC.ZERO);
						//当月調整数－
						orCB2.query().setAdjMnsNumMonth_NotEqual(WCC.ZERO);
					}
				});
			}
			// [C-CWMS-0039] センタ間移動機能を追加 2015.09.15 kawana Start
			// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.19 miyabe Start
			// 積送中在庫のみ表示
			CDef.TransitDisplay transitDisplay = CDef.TransitDisplay.codeOf(tStock.getTransitDisplay());
			if (transitDisplay == TransitDisplay.$1) {
				// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.19 miyabe End
				cb2.query().setTransitNum_NotEqual(WCC.ZERO);
			}
			// [C-CWMS-0039] センタ間移動機能を追加 2015.09.15 kawana End
		}

		// ===== ソート条件 =====
		//日付はシステム管理日付の場合
		if (tStock.getDataTime().equals(mClientCenter.getSystemDt())) {
			// [Ver3.0][#3065] 4つのパターンに(商品順, ロケーション順それぞれ日報なし/ありの合計4つ)分けてソートする 2018.02.26 shimizu Start
			//在庫表示順は0(商品順)を選択した場合
			if (tStock.getStockdisplayfld().equals(0l) || tStock.getStockdisplayfld().equals(1l)) {
				//荷主CD
				cb.query().queryTStock().queryMClient().addOrderBy_ClientCd_Asc();
				//センタCD
				cb.query().queryTStock().queryMWarehouse().queryMCenter().addOrderBy_CenterCd_Asc();
				//商品CD
				cb.query().queryTStock().queryMProduct().addOrderBy_ProductCd_Asc();
				//取引先CD
				cb.query().queryTStock().queryMCustomer().addOrderBy_CustomerCd_Asc();
				//在庫区分CD
				cb.query().queryTStock().queryMStockType().addOrderBy_StockTypeCd_Asc();
				//倉庫CD
				cb.query().queryTStock().queryMWarehouse().addOrderBy_WarehouseCd_Asc();
				//ロケーションCD
				cb.query().queryTStock().queryMLocation().addOrderBy_LocationCd_Asc();
				//ロット
				cb.query().queryTStock().queryTLot().addOrderBy_Lot_Asc();
				//期限日
				cb.query().queryTStock().queryTLot().addOrderBy_LimitDt_Asc();
				//入庫ラベルNo.
				cb.query().queryTStock().queryTStoreNo().addOrderBy_StoreLabelNo_Asc();
			}
			//在庫表示順は1(ロケーション順)を選択した場合
			else if (tStock.getStockdisplayfld().equals(2l) || tStock.getStockdisplayfld().equals(3l)) {
				//荷主CD
				cb.query().queryTStock().queryMClient().addOrderBy_ClientCd_Asc();
				//センタCD
				cb.query().queryTStock().queryMWarehouse().queryMCenter().addOrderBy_CenterCd_Asc();
				//倉庫CD
				cb.query().queryTStock().queryMWarehouse().addOrderBy_WarehouseCd_Asc();
				//ロケーションCD
				cb.query().queryTStock().queryMLocation().addOrderBy_LocationCd_Asc();
				//取引先CD
				cb.query().queryTStock().queryMCustomer().addOrderBy_CustomerCd_Asc();
				//在庫区分CD
				cb.query().queryTStock().queryMStockType().addOrderBy_StockTypeCd_Asc();
				//商品CD
				cb.query().queryTStock().queryMProduct().addOrderBy_ProductCd_Asc();
				//ロット
				cb.query().queryTStock().queryTLot().addOrderBy_Lot_Asc();
				//期限日
				cb.query().queryTStock().queryTLot().addOrderBy_LimitDt_Asc();
				//入庫ラベルNo.
				cb.query().queryTStock().queryTStoreNo().addOrderBy_StoreLabelNo_Asc();
			}
		} else {
			//在庫表示順は0(商品順)を選択した場合
			if (tStock.getStockdisplayfld().equals(0l) || tStock.getStockdisplayfld().equals(1l)) {
				//荷主CD
				cb2.query().queryHStock().addOrderBy_ClientCd_Asc();
				//センタCD
				cb2.query().queryHStock().addOrderBy_CenterCd_Asc();
				//商品CD
				cb2.query().queryHStock().addOrderBy_ProductCd_Asc();
				//預託CD
				cb2.query().queryHStock().addOrderBy_DepositCd_Asc();
				//在庫区分CD
				cb2.query().queryHStock().queryMStockType().addOrderBy_StockTypeCd_Asc();
				//倉庫CD
				cb2.query().queryHStock().addOrderBy_WarehouseCd_Asc();
				//ロケーションCD
				cb2.query().queryHStock().addOrderBy_LocationCd_Asc();
				//ロット
				cb2.query().queryHStock().addOrderBy_Lot_Asc();
				//期限日
				cb2.query().queryHStock().addOrderBy_LimitDt_Asc();
				//入庫ラベルNo.
				cb2.query().queryHStock().addOrderBy_StoreLabelNo_Asc();

			}
			//在庫表示順は1(ロケーション順)を選択した場合
			else if (tStock.getStockdisplayfld().equals(2l) || tStock.getStockdisplayfld().equals(3l)) {
				//荷主CD
				cb2.query().queryHStock().addOrderBy_ClientCd_Asc();
				//センタCD
				cb2.query().queryHStock().addOrderBy_CenterCd_Asc();
				//倉庫CD
				cb2.query().queryHStock().addOrderBy_WarehouseCd_Asc();
				//ロケーションCD
				cb2.query().queryHStock().addOrderBy_LocationCd_Asc();
				//預託CD
				cb2.query().queryHStock().addOrderBy_DepositCd_Asc();
				//在庫区分CD
				cb2.query().queryHStock().queryMStockType().addOrderBy_StockTypeCd_Asc();
				//商品CD
				cb2.query().queryHStock().addOrderBy_ProductCd_Asc();
				//ロット
				cb2.query().queryHStock().addOrderBy_Lot_Asc();
				//期限日
				cb2.query().queryHStock().addOrderBy_LimitDt_Asc();
				//入庫ラベルNo.
				cb2.query().queryHStock().addOrderBy_StoreLabelNo_Asc();
			}
			// [Ver3.0][#3065] 4つのパターンに(商品順, ロケーション順それぞれ日報なし/ありの合計4つ)分けてソートする 2018.02.26 shimizu End
		}

		//[ON推-品向-1185] 修正対応 2016.08.25 chou Add Start
		// 削除フラグ
		cb.query().queryTStock().queryMProduct().setDelFlg_Equal_$0();
		//[ON推-品向-1185] 修正対応 2016.08.25 chou Add End

		// ===== 在庫検索実行 =====

		if (tStock.getDataTime().equals(mClientCenter.getSystemDt())) {

			resultTStockReport = selectPage(tStockReportBhv, cb, paging);

			if (resultTStockReport.size() > 0) {
				for (int i = 0; i < resultTStockReport.size(); i++) {
					if (tStock.getDtAddLdn() != null) {
						resultTStockReport.get(i).setDtAddLdn(tStock.getDtAddLdn());
					}
				}
			}

			//データ存在チェック
			// ===== ０件チェック =====
			if (resultTStockReport.size() == 0) {
				this.getErrorManager().add(new ErrorStatus(errSts.getStatusCd()), WmsMessageConst.DATA_NOT_FOUND_ERROR);
			} else {
				// [Ver3.0] unit of measure対応 2017.11.28 駱 Start
				// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod Start
				// 商品に紐づく商品荷姿マスタ(荷姿グループマスタ関連含む)を抽出
				tStockReportBhv.load(resultTStockReport, new ReferrerLoaderHandler<LoaderOfTStockReport>() {
					@Override
					public void handle(LoaderOfTStockReport loader) {
						loader.pulloutTStock().pulloutMProduct().loadMProductShapeList(new ConditionBeanSetupper<MProductShapeCB>() {
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

				for (TStockReport reportT : resultTStockReport) {
					// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod Start
					// 商品荷姿リストから最小荷姿単位、親荷姿単位、親荷姿入数を設定するためのMapを作成
					WmsMultipleShapeUtil.getParentMap(decimalExistFlgMap, minimumUnitMap, parentUnitNumMap, parentUnitMap, reportT.getTStock().getMProduct());
					// 商品最小荷姿単位名称
					reportT.setProductUnit(WmsMultipleShapeUtil.getProductMinimumUnit(minimumUnitMap, reportT.getTStock().getMProduct()));
					// 入数内訳
					reportT.setUnitNumBreakdown(WmsMultipleShapeUtil.getUnitNumBreakdown(decimalExistFlgMap, minimumUnitMap, parentUnitNumMap, parentUnitMap, reportT.getTStock().getMProduct()));

					// 在庫内訳
					reportT.setStockBreakdown(WmsMultipleShapeUtil.getPlanBreakdown(decimalExistFlgMap, CU.nullToZero(WCC.add(reportT.getTStock().getChargeNum(), reportT.getTStock().getAllocNum(), reportT.getTStock().getMoveNum()))
							, minimumUnitMap, parentUnitNumMap, parentUnitMap, reportT.getTStock().getMProduct(), WmsMultipleShapeUtil.DisplayMode.SHAPE_ONLY));
					// 引当可能内訳
					reportT.setChargeBreakdown(WmsMultipleShapeUtil.getPlanBreakdown(decimalExistFlgMap, CU.nullToZero(reportT.getTStock().getChargeNum()), minimumUnitMap, parentUnitNumMap
							, parentUnitMap, reportT.getTStock().getMProduct(), WmsMultipleShapeUtil.DisplayMode.SHAPE_ONLY));
					// 引当済内訳
					reportT.setAllocBreakdown(WmsMultipleShapeUtil.getPlanBreakdown(decimalExistFlgMap, CU.nullToZero(reportT.getTStock().getAllocNum()),minimumUnitMap, parentUnitNumMap
							,parentUnitMap, reportT.getTStock().getMProduct(), WmsMultipleShapeUtil.DisplayMode.SHAPE_ONLY));
					// 作業中内訳
					reportT.setMoveBreakdown(WmsMultipleShapeUtil.getPlanBreakdown(decimalExistFlgMap, CU.nullToZero(reportT.getTStock().getMoveNum()), minimumUnitMap, parentUnitNumMap
							,parentUnitMap, reportT.getTStock().getMProduct(), WmsMultipleShapeUtil.DisplayMode.SHAPE_ONLY));
					// 積送中内訳
					reportT.setTransitBreakdown(WmsMultipleShapeUtil.getPlanBreakdown(decimalExistFlgMap, CU.nullToZero(reportT.getTStock().getTransitNum()), minimumUnitMap, parentUnitNumMap
							, parentUnitMap, reportT.getTStock().getMProduct(), WmsMultipleShapeUtil.DisplayMode.SHAPE_ONLY));
					// 内訳
					reportT.setStringUnitNum(WmsMultipleShapeUtil.getUnitNumBreakdown(decimalExistFlgMap, minimumUnitMap, parentUnitNumMap, parentUnitMap, reportT.getTStock().getMProduct()));
					// 入数
					reportT.setBreakdown(WmsMultipleShapeUtil.getPlanBreakdown(decimalExistFlgMap, CU.nullToZero(reportT.getTStock().getChargeNum()), minimumUnitMap, parentUnitNumMap
							, parentUnitMap, reportT.getTStock().getMProduct(), WmsMultipleShapeUtil.DisplayMode.SHAPE_ONLY));
					//最小梱包単位
					reportT.setMinimumPackingUnit(WmsMultipleShapeUtil.getProductMinimumUnit(minimumUnitMap, reportT.getTStock().getMProduct()));
					// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod End
				}
				// [Ver3.0] unit of measure対応 2017.11.28 駱 End
			}

		} else {

			resultHStockReport = selectPage(hStockReportBhv, cb2, paging);

			//データ存在チェック
			// ===== ０件チェック =====
			if (resultHStockReport.size() == 0) {
				this.getErrorManager().add(new ErrorStatus(errSts.getStatusCd()), WmsMessageConst.DATA_NOT_FOUND_ERROR);
			} else {
				// [Ver3.0] unit of measure対応 2017.11.28 駱 Start
				// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod Start
				List<MProduct> mProductList = new ArrayList<MProduct>();
				Map<Long,MProduct> mProductMap = new HashMap<>();
				for (HStockReport hStockReport : resultHStockReport) {
					MProduct product = new MProduct();
					if (hStockReport.getHStock().getProductId() == null) {
						product = null;
					} else {
						product.setProductId(hStockReport.getHStock().getProductId());
						mProductList.add(product);
					}
					mProductMap.put(hStockReport.getHStock().getProductId(), product);
				}
				// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod End

				// 商品に紐付く商品荷姿マスタ(荷姿グループマスタ関連含む)を抽出
				mProductBhv.loadMProductShapeList(mProductList, new ConditionBeanSetupper<MProductShapeCB>() {
					public void setup(MProductShapeCB subCB) {
						subCB.setupSelect_MShapeGrpDtl().withMShapeGrp();
						subCB.setupSelect_MShapeGrpDtl().withMShape().withVDictByShapeDictId(getCultureId());
						subCB.setupSelect_MShapeGrpDtl().withMShape().withVDictByShapeUnitDictId(getCultureId());
						subCB.query().queryMShapeGrpDtl().addOrderBy_ShapeSort_Asc();
						subCB.query().setDelFlg_Equal_$0();
					}
				});

				// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod Start
				Map<Long, String> decimalExistFlgMap = new HashMap<>();
				Map<Long, String> minimumUnitMap = new HashMap<>();
				Map<Long, List<Long>> parentUnitNumMap = new HashMap<>();
				Map<Long, List<String>> parentUnitMap = new HashMap<>();
				for (HStockReport reportT : resultHStockReport) {
					// 商品荷姿リストから最小荷姿単位、親荷姿単位、親荷姿入数を設定するためのMapを作成
					WmsMultipleShapeUtil.getParentMap(decimalExistFlgMap, minimumUnitMap, parentUnitNumMap, parentUnitMap, mProductMap.get(reportT.getHStock().getProductId()));

					// 商品最小荷姿単位名称
					reportT.setProductUnit(WmsMultipleShapeUtil.getProductMinimumUnit(minimumUnitMap, mProductMap.get(reportT.getHStock().getProductId())));
					// 入数内訳
					reportT.setUnitNumBreakdown(WmsMultipleShapeUtil.getUnitNumBreakdown(decimalExistFlgMap, minimumUnitMap, parentUnitNumMap, parentUnitMap, mProductMap.get(reportT.getHStock().getProductId())));

					// 在庫内訳
					reportT.setStockBreakdown(WmsMultipleShapeUtil.getPlanBreakdown(decimalExistFlgMap, CU.nullToZero(WCC.add(reportT.getChargeNum(), reportT.getAllocNum(), reportT.getMoveNum()))
							, minimumUnitMap, parentUnitNumMap, parentUnitMap, mProductMap.get(reportT.getHStock().getProductId()), WmsMultipleShapeUtil.DisplayMode.SHAPE_ONLY));
					// 引当可能内訳
					reportT.setChargeBreakdown(WmsMultipleShapeUtil.getPlanBreakdown(decimalExistFlgMap, CU.nullToZero(reportT.getChargeNum()), minimumUnitMap, parentUnitNumMap
							, parentUnitMap, mProductMap.get(reportT.getHStock().getProductId()), WmsMultipleShapeUtil.DisplayMode.SHAPE_ONLY));
					// 引当済内訳
					reportT.setAllocBreakdown(WmsMultipleShapeUtil.getPlanBreakdown(decimalExistFlgMap, CU.nullToZero(reportT.getAllocNum()), minimumUnitMap, parentUnitNumMap
							, parentUnitMap, mProductMap.get(reportT.getHStock().getProductId()), WmsMultipleShapeUtil.DisplayMode.SHAPE_ONLY));
					// 作業中内訳
					reportT.setMoveBreakdown(WmsMultipleShapeUtil.getPlanBreakdown(decimalExistFlgMap, CU.nullToZero(reportT.getMoveNum()), minimumUnitMap, parentUnitNumMap
							, parentUnitMap, mProductMap.get(reportT.getHStock().getProductId()), WmsMultipleShapeUtil.DisplayMode.SHAPE_ONLY));
					// 積送中内訳
					reportT.setTransitBreakdown(WmsMultipleShapeUtil.getPlanBreakdown(decimalExistFlgMap, CU.nullToZero(reportT.getTransitNum()), minimumUnitMap, parentUnitNumMap
							, parentUnitMap, mProductMap.get(reportT.getHStock().getProductId()), WmsMultipleShapeUtil.DisplayMode.SHAPE_ONLY));
					// 内訳
					reportT.setStringUnitNum(WmsMultipleShapeUtil.getUnitNumBreakdown(decimalExistFlgMap, minimumUnitMap, parentUnitNumMap, parentUnitMap, mProductMap.get(reportT.getHStock().getProductId())));
					// 入数
					reportT.setBreakdown(WmsMultipleShapeUtil.getPlanBreakdown(decimalExistFlgMap, CU.nullToZero(reportT.getChargeNum()), minimumUnitMap, parentUnitNumMap
							, parentUnitMap, mProductMap.get(reportT.getHStock().getProductId()),  WmsMultipleShapeUtil.DisplayMode.SHAPE_ONLY));
					//最小梱包単位
					reportT.setMinimumPackingUnit(WmsMultipleShapeUtil.getProductMinimumUnit(minimumUnitMap, mProductMap.get(reportT.getHStock().getProductId())));
				}
				// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod End
				// [Ver3.0] unit of measure対応 2017.11.28 駱 End
			}
		}

		if (tStock.getDataTime().equals(mClientCenter.getSystemDt())) {
			return resultTStockReport;
		} else {
			return resultHStockReport;
		}

	}
}