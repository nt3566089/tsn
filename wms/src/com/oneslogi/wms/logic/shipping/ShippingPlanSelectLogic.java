package com.oneslogi.wms.logic.shipping;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.dbflute.bhv.referrer.ConditionBeanSetupper;
import org.dbflute.bhv.referrer.ReferrerLoaderHandler;

import com.oneslogi.base.dbflute.bsbhv.loader.LoaderOfTShippingInstB;
import com.oneslogi.base.dbflute.cbean.MProductShapeCB;
import com.oneslogi.base.dbflute.cbean.TShippingInstBCB;
import com.oneslogi.base.dbflute.exbhv.TShippingInstBBhv;
import com.oneslogi.base.dbflute.exentity.TShippingInstB;
import com.oneslogi.base.dbflute.exentity.TShippingInstH;
import com.oneslogi.base.dbflute.exentity.TStock;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.util.WmsMultipleShapeUtil;

/**
 * 出荷指示データ取得ロジッククラス
 */
public class ShippingPlanSelectLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private TShippingInstBBhv tShippingInstBBhv;
	// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Delete

	// ===== 使用ロジック =====
	@Inject
	private StockDataSelectLogic stockDataSelectLogic;

	/**
	 * <h2>出荷指示データを取得する。</h2>
	 * <pre>
	 * 引数を条件にデータベースから出荷指示データを取得し、
	 * 【在庫数データ取得】を行って戻り値に設定する。
	 * 検索対象が見つからない場合、
	 * ０件エラーをエラーステータスに設定する。
	 *
	 * 【在庫数データ取得】
	 * ・{@link StockDataSelectLogic#select(TShippingInstH, TShippingInstB, Boolean, com.oneslogi.base.exception.ErrorManager.ErrorStatus) 在庫数データ取得メソッド}を呼び出す。
	 *
	 * </pre>
	 * @param header 出荷指示ヘッダ：出荷指示ヘッダID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return List<TShippingInstB>  出荷指示ボディリスト
	 */
	public List<TShippingInstB> select(TShippingInstH header, ErrorStatus errSts) {

		List<TShippingInstB> result = null;
		// ===== 出荷指示入力データ取得  =====

		// 検索条件の設定
		TShippingInstBCB cb = tShippingInstBBhv.newMyConditionBean();
		cb.setupSelect_TShippingInstH();
		cb.setupSelect_MProduct();
		cb.setupSelect_TShippingInstH().withMCenter();
		cb.setupSelect_TShippingInstH().withMClient();
		cb.setupSelect_TShippingInstH().withMProcessType();
		// [#2253]予備項目対応 2017.08.18 sampei Start
		cb.setupSelect_TShippingInstSpareAsOne();
		// [#2253]予備項目対応 2017.08.18 sampei End

		// 出荷指示ヘッダID
		cb.query().queryTShippingInstH().setShippingInstHId_Equal(header.getShippingInstHId());

		// ソート順の設定
		cb.query().addOrderBy_LineNo_Asc();
		cb.query().addOrderBy_ProductCd_Asc();

		// ===== 出荷指示入力データ取得検索実行 =====
		result = tShippingInstBBhv.selectList(cb);

		// ===== ０件チェック =====
		if (result.size() == 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}
		// [Ver3.0] unit of measure対応 2017.11.29 潘 Start
		// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod Start
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
		for (TShippingInstB shippingInstB : result) {
			// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod Start
			// 商品荷姿リストから最小荷姿単位、親荷姿単位、親荷姿入数を設定するためのMapを作成
			WmsMultipleShapeUtil.getParentMap(decimalExistFlgMap, minimumUnitMap, parentUnitNumMap, parentUnitMap, shippingInstB.getMProduct());
			// 入数内訳
			shippingInstB.setUnitNumBreakdown(WmsMultipleShapeUtil.getUnitNumBreakdown(decimalExistFlgMap, minimumUnitMap, parentUnitNumMap, parentUnitMap, shippingInstB.getMProduct()));
			// 商品最小荷姿単位名称
			shippingInstB.setProductUnit(WmsMultipleShapeUtil.getProductMinimumUnit(minimumUnitMap, shippingInstB.getMProduct()));
			// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod End
		}
		// [Ver3.0] unit of measure対応 2017.11.29 潘 End

		// [新WMS-110-030] 別センタの在庫数が加算されてしまう問題を修正 2015.07.24 kawana Start
		header.setCenterId(result.get(0).chaseTShippingInstH().getCenterId());
		header.setClientId(result.get(0).chaseTShippingInstH().getClientId());
		// [新WMS-110-030] 別センタの在庫数が加算されてしまう問題を修正 2015.07.24 kawana End

		// 引当可能数の設定
		for (TShippingInstB tShippingInstB : result) {
			// [品質】問題点指摘票(新ソリューション)-033] ロケーションマスタの引当禁止フラグ設定を修正 2014.11.24 kei Start
			List<TStock> list = stockDataSelectLogic.select(header, tShippingInstB,true, errSts);
			// [品質】問題点指摘票(新ソリューション)-033] ロケーションマスタの引当禁止フラグ設定を修正 2014.11.24 kei End
			TStock tStock = list.get(0);
			tShippingInstB.setChargeNum(tStock.getSumChargeNum());
		}

		return result;
	}
}