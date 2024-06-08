package com.oneslogi.wms.logic.receive;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.dbflute.bhv.referrer.ConditionBeanSetupper;
import org.dbflute.bhv.referrer.ReferrerLoaderHandler;
import org.dbflute.cbean.scoping.SubQuery;

import com.oneslogi.base.dbflute.bsbhv.loader.LoaderOfTReceivePlanB;
import com.oneslogi.base.dbflute.cbean.MProductShapeCB;
import com.oneslogi.base.dbflute.cbean.TReceivePlanBCB;
import com.oneslogi.base.dbflute.cbean.TReceivePlanRCB;
import com.oneslogi.base.dbflute.exbhv.TReceivePlanBBhv;
import com.oneslogi.base.dbflute.exbhv.TReceivePlanRBhv;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.TReceivePlanB;
import com.oneslogi.base.dbflute.exentity.TReceivePlanH;
import com.oneslogi.base.dbflute.exentity.TReceivePlanR;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.logic.common.RecommendLocationLogic;
import com.oneslogi.wms.util.WmsMultipleShapeUtil;

/**
 * 入荷予定リスト発行ロジッククラス
 */
public class ReceivePlanListPrintLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private TReceivePlanBBhv tReceivePlanBBhv;

	// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Delete

	@Inject
	private TReceivePlanRBhv tReceivePlanRBhv;
	// [#3702][Ver3.0] 推奨ロケ出力異常 2018.02.20 honma Mod Start
	@Inject
	private RecommendLocationLogic recommendLocationLogic;
	// [#3702][Ver3.0] 推奨ロケ出力異常 2018.02.20 honma Mod End

	/**
	 * <h2>入荷予定リストデータを取得する。</h2>
	 * <pre>
	 * 引数をキーにデータベースから入荷予定リストデータを取得する。
	 *
	 * 検索対象が見つからない場合はNULLを返すと共に、
	 * ０件エラーをエラーステータスに設定する。
	 * 検索対象が見つかった場合、入数を取得し、推奨ロケーションを設定する。
	 * </pre>
	 * @param report 入荷予定帳票：コントロールNo.
	 * @param errSts エラー時に設定するエラーステータス
	 * @return List<TReceivePlanB> 入荷予定ボディリスト
	 */
	public List<TReceivePlanB> select(TReceivePlanR report, MCenter mcenetr, ErrorStatus errSts) {

		List<TReceivePlanB> result = null;

		// ===== 入荷予定リスト発行データ取得 =====
		TReceivePlanBCB tReceivePlanBCB = tReceivePlanBBhv.newMyConditionBean();
		tReceivePlanBCB.setupSelect_TReceivePlanH();
		tReceivePlanBCB.setupSelect_TReceivePlanH().withTReceivePlanRAsOne();
		tReceivePlanBCB.setupSelect_TReceivePlanH().withMClient();
		tReceivePlanBCB.setupSelect_TReceivePlanH().withMCenter();
		tReceivePlanBCB.setupSelect_MWarehouse();
		tReceivePlanBCB.setupSelect_MProduct();

		// [Ver3.0] unit of measure対応 2017.11.21 REN Del

		// [SK2-009] 予定ロケーションのみ表示するように修正します。 2014.12.09 衛 Start
		tReceivePlanBCB.setupSelect_MLocation();
		// [SK2-009] 予定ロケーションのみ表示するように修正します。 2014.12.09 衛 End
		tReceivePlanBCB.setupSelect_TReceivePlanH().withMCustomerByPlanSupplierId();
		tReceivePlanBCB.setupSelect_TReceivePlanH().withMCustomerByPlanDepositId();
		tReceivePlanBCB.setupSelect_TReceivePlanH().withMProcessType();
		tReceivePlanBCB.setupSelect_TReceivePlanH().withMProcessType().withVDict(getCultureId());
		// [ON推-品向-955] 在庫区分を追加 2015.10.01 kawana Start
		tReceivePlanBCB.setupSelect_TReceivePlanH().withMStockType().withVDict(getCultureId());
		// [ON推-品向-955] 在庫区分を追加 2015.10.01 kawana End

		// 検索条件の設定
		tReceivePlanBCB.query().queryTReceivePlanH().queryTReceivePlanRAsOne().setControlNo_Equal(report.getControlNo());
		tReceivePlanBCB.query().queryTReceivePlanH().queryMProcessType().setReceiveFlg_Equal_$1();
		tReceivePlanBCB.query().queryTReceivePlanH().queryMProcessType().setShippingFlg_Equal_$0();
		tReceivePlanBCB.query().queryTReceivePlanH().queryMProcessType().setStockAdjustFlg_Equal_$0();


		//ソート条件
		// [EC-CT1-002] ソート順 - 発行済フラグの降順から昇順に変更 2015.02.09 kawana Start
		tReceivePlanBCB.query().queryTReceivePlanH().queryTReceivePlanRAsOne().addOrderBy_RplOutFlg_Asc();
		// [EC-CT1-002] ソート順 - 発行済フラグの降順から昇順に変更 2015.02.09 kawana End
		tReceivePlanBCB.query().queryTReceivePlanH().addOrderBy_PlanClientReceiveNo_Asc();
		tReceivePlanBCB.query().queryTReceivePlanH().addOrderBy_ReceiveSlipNo_Asc();
		tReceivePlanBCB.query().queryTReceivePlanH().addOrderBy_ReceivePlanDt_Asc();
		tReceivePlanBCB.query().queryTReceivePlanH().queryMCustomerByPlanSupplierId().addOrderBy_CustomerCd_Asc();
		tReceivePlanBCB.query().queryTReceivePlanH().queryMProcessType().addOrderBy_ProcessTypeCd_Asc();
		tReceivePlanBCB.query().addOrderBy_LineNo_Asc();

		// [ON推-品向-601] 帳票用の検索を共通メソッドを使用するように変更 2015.04.17 kawana Start
		// 検索実行
		result = selectListToReport(tReceivePlanBBhv, tReceivePlanBCB);

		// [ON推-品向-601] 帳票用の検索を共通メソッドを使用するように変更 2015.04.17 kawana End

		// ===== ０件チェック =====

		if (result.size() == 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}
		// [エンハンス PH2.0] 入数取得 2015.12.3 sja Start
		//		List<MProductShape> mShapeList = new ArrayList<MProductShape>();
		// [エンハンス PH2.0] 入数取得 2015.12.3 sja End
		// [Ver3.0] unit of measure対応 2017.11.21 REN Start
		// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod Start
		tReceivePlanBBhv.load(result, new ReferrerLoaderHandler<LoaderOfTReceivePlanB>() {
			public void handle(LoaderOfTReceivePlanB loader) {
				loader.pulloutMProduct().loadMProductShapeList(new ConditionBeanSetupper<MProductShapeCB>() {
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

		for(TReceivePlanB tReceivePlanB : result){
			// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod Start
			WmsMultipleShapeUtil.getParentMap(decimalExistFlgMap, minimumUnitMap, parentUnitNumMap, parentUnitMap, tReceivePlanB.getMProduct());
			// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod End
			// [Ver3.0] unit of measure対応 2017.11.21 REN Del

			// [1.1.4-CT-112] 推奨ロケを最終入庫「時間」まで意識して設定する 2016.06.17 kawana Start
			// [#3702][Ver3.0] 推奨ロケ出力異常 2018.02.20 honma Mod Start
			// 推奨ロケの設定
			RecommendLocationLogic.RecommendLocationCondition recommendLocationCondition = RecommendLocationLogic.RecommendLocationCondition.builder()
					.centerId(tReceivePlanB.chaseTReceivePlanH().getCenterId())
					.productId(tReceivePlanB.getProductId())
					.stockTypeId(tReceivePlanB.chaseTReceivePlanH().getStockTypeId())
					.depositId(tReceivePlanB.chaseTReceivePlanH().getPlanDepositId())
					.warehouseId(tReceivePlanB.getPlanWarehouseId())
					.planLocation(tReceivePlanB.getMLocation()).build();

			tReceivePlanB.setMLocation(recommendLocationLogic.getRecommendLocation(recommendLocationCondition, RecommendLocationLogic.PrintReportCls.RECEIVE_PLAN_LIST));
			// [#3702][Ver3.0] 推奨ロケ出力異常 2018.02.20 honma Mod Start
			// [1.1.4-CT-112] 推奨ロケを最終入庫「時間」まで意識して設定する 2016.06.17 kawana End
			// [Ver3.0] unit of measure対応 2017.11.21 REN Start
			// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod Start
			//入数
			tReceivePlanB.setStringUnitNum(WmsMultipleShapeUtil.getUnitNumBreakdown(decimalExistFlgMap, minimumUnitMap, parentUnitNumMap, parentUnitMap, tReceivePlanB.getMProduct()));
			//内訳
			tReceivePlanB.setBreakdown(WmsMultipleShapeUtil.getPlanBreakdown(decimalExistFlgMap, tReceivePlanB.getPlanNum(), minimumUnitMap, parentUnitNumMap
					, parentUnitMap, tReceivePlanB.getMProduct(), WmsMultipleShapeUtil.DisplayMode.SHAPE_ONLY));
			//最小梱包単位
			tReceivePlanB.setMinimumPackingUnit(WmsMultipleShapeUtil.getProductMinimumUnit(minimumUnitMap, tReceivePlanB.getMProduct()));
			// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod End
			// [Ver3.0] unit of measure対応 2017.11.21 REN End
		}
		return result;
	}

	/**
	 * <h2>入荷予定帳票を更新する。</h2>
	 * <pre>
	 * 引数を絞り込み条件に設定し、入荷予定帳票データを更新する。
	 * </pre>
	 * @param update 入荷予定帳票(更新用)：全項目
	 * @param header 入荷予定ヘッダ：荷主ID・センタID・入荷予定日(From)・入荷予定日(To)・WMS入荷伝票No.・
	 *                               予定顧客入荷指示No.・予定預託CD
	 * @param body 入荷予定ボディ：予定倉庫ID
	 * @param report 入荷予定帳票(検索用)：入荷予定リスト出力フラグ
	 * @param errStatus エラー時に設定するエラーステータス
	 */
	public void updateControlNo(TReceivePlanR update, TReceivePlanH header, final TReceivePlanB body, TReceivePlanR report, ErrorStatus errStatus) {

		// ===== 入荷予定帳票データ更新 =====
		// 更新条件作成
		TReceivePlanRCB cb = tReceivePlanRBhv.newMyConditionBean();
		cb.setupSelect_TReceivePlanH();
		cb.setupSelect_TReceivePlanH().withMCustomerByPlanDepositId();
		cb.query().queryTReceivePlanH().existsTReceivePlanBList(new SubQuery<TReceivePlanBCB>() {
			@Override
			public void query(TReceivePlanBCB subCB) {
				subCB.query().setPlanWarehouseId_Equal(body.getPlanWarehouseId());
			}
		});

		//検索条件
		cb.query().queryTReceivePlanH().setClientId_Equal(header.getClientId());
		cb.query().queryTReceivePlanH().setCenterId_Equal(header.getCenterId());
		cb.query().queryTReceivePlanH().setReceivePlanDt_GreaterEqual(header.getReceivePlanDtFrom());
		cb.query().queryTReceivePlanH().setReceivePlanDt_LessEqual(header.getReceivePlanDtTo());
		cb.query().queryTReceivePlanH().setReceiveSlipNo_PrefixSearch(header.getReceiveSlipNo());
		cb.query().queryTReceivePlanH().setPlanClientReceiveNo_PrefixSearch(header.getPlanClientReceiveNo());
		cb.query().queryTReceivePlanH().queryMCustomerByPlanDepositId().setCustomerCd_Equal(header.getPlanDepositCd());
		cb.query().setRplOutFlg_Equal(report.getRplOutFlg());

		// ===== 入荷予定帳票の更新 =====
		tReceivePlanRBhv.queryUpdate(update, cb);
	}

	/**
	 * <h2>入荷予定帳票データを更新する。</h2>
	 * <pre>
	 * 引数をキーに入荷予定帳票データを更新する。
	 * </pre>
	 * @param update 入荷予定帳票(更新用)：全項目
	 * @param report 入荷予定帳票(検索用)：コントロールNo.
	 * @param errStatus エラー時に設定するエラーステータス
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

	// [1.1.4-CT-112] 推奨ロケを最終入庫「時間」まで意識して設定する 2016.06.17 kawana Start
	// [#3702][Ver3.0] 推奨ロケ出力異常 推奨ロケロジック共通化のため削除 2018.02.20 honma Delete
	// [1.1.4-CT-112] 推奨ロケを最終入庫「時間」まで意識して設定する 2016.06.17 kawana End

}
