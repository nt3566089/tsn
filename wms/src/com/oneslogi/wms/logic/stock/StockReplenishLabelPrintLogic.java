package com.oneslogi.wms.logic.stock;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.dbflute.bhv.referrer.ConditionBeanSetupper;
import org.dbflute.bhv.referrer.ReferrerLoaderHandler;

import com.oneslogi.base.dbflute.bsbhv.loader.LoaderOfTMoveInstB;
import com.oneslogi.base.dbflute.cbean.MLocationCB;
import com.oneslogi.base.dbflute.cbean.MProductShapeCB;
import com.oneslogi.base.dbflute.cbean.TMoveInstBCB;
import com.oneslogi.base.dbflute.cbean.TMoveInstRCB;
import com.oneslogi.base.dbflute.exbhv.MProductBhv;
import com.oneslogi.base.dbflute.exbhv.TMoveInstBBhv;
import com.oneslogi.base.dbflute.exbhv.TMoveInstRBhv;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.base.dbflute.exentity.TMoveInstB;
import com.oneslogi.base.dbflute.exentity.TMoveInstH;
import com.oneslogi.base.dbflute.exentity.TMoveInstR;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.util.WmsMultipleShapeUtil;

/**
 * 補充ラベルデータ取得ロジッククラス
 */
public class StockReplenishLabelPrintLogic extends AbstractWmsLogic {

	// [Ver3.0] unit of measure対応 2017.11.29 REN Del

	// ===== 使用テーブル =====
	@Inject
	private TMoveInstBBhv tMoveInstBBhv;
	@Inject
	private TMoveInstRBhv tMoveInstRBhv;
	@Inject
	private MProductBhv mProductBhv;

	/**
	 * <h2>在庫移動指示ボディデータを取得する。</h2>
	 * <pre>
	 * 引数をキーに補充ラベルデータを取得する。
	 * 対象が見つからない場合、０件エラーをエラーステータス情報に設定する。
	 * </pre>
	 * @param tMoveInstR 在庫移動指示帳票：コントロールNo.
	 * @param mClient 荷主マスタ：荷主CD
	 * @param mCenter センタマスタ：センタCD
	 * @param errSts エラー時に設定するエラーステータス
	 * @return List<TMoveInstB> 補充ラベル発行データ取得のリスト
	 */
	public List<TMoveInstB> select(TMoveInstR tMoveInstR, final MClient mClient, final MCenter mCenter, ErrorStatus errSts) {

		// [Ver3.0] unit of measure対応 2017.11.29 REN Del
		if (getErrorManager().size() > 0) {
			// 処理中止
			return null;
		}

		List<TMoveInstB> tMoveInstBList = null;
		// ===== 補充ラベルデータ取得 =====
		TMoveInstBCB tMoveInstBCb = tMoveInstBBhv.newMyConditionBean();
		tMoveInstBCb.setupSelect_TMoveInstH();
		tMoveInstBCb.setupSelect_TMoveInstH().withTMoveInstRAsOne();
		tMoveInstBCb.setupSelect_TMoveInstH().withMClient();
		tMoveInstBCb.setupSelect_TMoveInstH().withMCenter();
		tMoveInstBCb.setupSelect_MWarehouse();
		tMoveInstBCb.setupSelect_MProduct();
		tMoveInstBCb.setupSelect_MCustomerByDepositId();
		tMoveInstBCb.setupSelect_MStockType();
		tMoveInstBCb.setupSelect_MStockType().withVDict(getCultureId());
		tMoveInstBCb.setupSelect_MLocation();
		tMoveInstBCb.setupSelect_MLocation().withMZone();
		tMoveInstBCb.setupSelect_MLocation().withMZone().withMWarehouse();
		tMoveInstBCb.setupSelect_TLot();
		tMoveInstBCb.setupSelect_TStoreNo();

		// 検索条件の設定
		tMoveInstBCb.query().queryTMoveInstH().queryTMoveInstRAsOne().setControlNo_Equal(tMoveInstR.getControlNo());

		// ソート条件
		tMoveInstBCb.query().queryTMoveInstH().queryTMoveInstRAsOne().addOrderBy_InstOutFlg_Asc();
		tMoveInstBCb.query().queryTMoveInstH().queryMClient().addOrderBy_ClientCd_Asc();
		tMoveInstBCb.query().queryTMoveInstH().queryMCenter().addOrderBy_CenterCd_Asc();
		tMoveInstBCb.query().queryTMoveInstH().addOrderBy_MoveSlipNo_Asc();
		tMoveInstBCb.query().addOrderBy_InoutType_Asc();

		// 検索実行
		tMoveInstBList = selectListToReport(tMoveInstBBhv, tMoveInstBCb);

		List<MProduct> mProductList = tMoveInstBBhv.pulloutMProduct(tMoveInstBList);

		// ロケーション取得(検索条件：商品ID)
		mProductBhv.loadMLocationList(mProductList, new ConditionBeanSetupper<MLocationCB>() {
			@Override
			public void setup(MLocationCB cb) {
				// [#3813] 緊急補充のピックロケに別センタのロケーションが表示される問題を修正 2018.02.27 kawana Start
				cb.query().queryMCenter().setCenterCd_Equal(mCenter.getCenterCd());
				// [#3813] 緊急補充のピックロケに別センタのロケーションが表示される問題を修正 2018.02.27 kawana End
				cb.query().setDelFlg_Equal_$0();
				cb.query().addOrderBy_AllocOrder_Asc();
				cb.query().addOrderBy_LocationCd_Asc();
			}
		});

		// [Ver3.0] unit of measure対応 2017.11.29 REN Del

		// ===== ０件チェック =====
		if (mProductList.size() == 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}
		// [Ver3.0] unit of measure対応 2017.11.29 REN Start
		// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod Start
		tMoveInstBBhv.load(tMoveInstBList, new ReferrerLoaderHandler<LoaderOfTMoveInstB>() {
			@Override
			public void handle(LoaderOfTMoveInstB loader) {
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

		for (TMoveInstB tMoveInstB : tMoveInstBList) {
			// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod Start
			WmsMultipleShapeUtil.getParentMap(decimalExistFlgMap, minimumUnitMap, parentUnitNumMap, parentUnitMap, tMoveInstB.getMProduct());
			//入数
			tMoveInstB.setStringUnitNum(WmsMultipleShapeUtil.getUnitNumBreakdown(decimalExistFlgMap, minimumUnitMap, parentUnitNumMap, parentUnitMap, tMoveInstB.getMProduct()));
			//内訳
			tMoveInstB.setBreakdown(WmsMultipleShapeUtil.getPlanBreakdown(decimalExistFlgMap, tMoveInstB.getInstNum(), minimumUnitMap, parentUnitNumMap
					, parentUnitMap, tMoveInstB.getMProduct(), WmsMultipleShapeUtil.DisplayMode.SHAPE_ONLY));
			//最小梱包単位
			tMoveInstB.setMinimumPackingUnit(WmsMultipleShapeUtil.getProductMinimumUnit(minimumUnitMap, tMoveInstB.getMProduct()));
			// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod End
		}
		// [Ver3.0] unit of measure対応 2017.11.29 REN End
		return tMoveInstBList;
	}

	// [Ver3.0] unit of measure対応 2017.11.29 REN Del
	/**
	 * <h2>在庫移動指示帳票を更新する(在庫移動指示ヘッダID)。</h2>
	 * <pre>
	 * 引数を絞り込み条件に設定し在庫移動指示帳票の対象データを更新する。
	 * 対象が０件の場合、未存在エラーをエラー情報として管理する。
	 * </pre>
	 * @param update 在庫移動指示帳票(更新用)：全項目
	 * @param tMoveInstHList 在庫移動指示ヘッダリスト：全項目
	 * @param errStatus エラー時に設定するエラーステータス
	 */
	public void updateControlNoById(TMoveInstR update, List<TMoveInstH> tMoveInstHList, ErrorStatus errStatus) {

		// 在庫移動指示ヘッダIDのlist作成
		List<Long> tMoveInstHIdList = new ArrayList<Long>();
		for (TMoveInstH tMoveInstH : tMoveInstHList) {
			tMoveInstHIdList.add(tMoveInstH.getMoveInstHId());
		}

		List<TMoveInstR> result = null;
		// ===== 補充ラベルデータ取得 =====
		TMoveInstRCB cb = tMoveInstRBhv.newMyConditionBean();
		cb.setupSelect_TMoveInstH();

		// 検索条件
		cb.query().setMoveInstHId_InScope(tMoveInstHIdList);

		// ===== 在庫移動指示帳票の更新 =====
		tMoveInstRBhv.queryUpdate(update, cb);

		// ===== データ存在チェック =====
		result = tMoveInstRBhv.selectList(cb);

		if (result.size() == 0) {
			this.getErrorManager().add(errStatus, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return;
		}
	}

	/**
	 * <h2>在庫移動指示帳票を更新する。</h2>
	 * <pre>
	 * 引数をキーに在庫移動指示帳票のデータを更新する。
	 * </pre>
	 * @param update 在庫移動指示帳票(更新用)：全項目
	 * @param report 在庫移動指示帳票(検索用)：コントロールNo.
	 * @param errStatus エラー時に設定するエラーステータス
	 */
	public void updateOutFlg(TMoveInstR update, TMoveInstR report, ErrorStatus errStatus) {

		// ===== 在庫移動指示帳票データ更新 =====
		// 更新条件
		TMoveInstRCB cb = tMoveInstRBhv.newMyConditionBean();
		cb.checkInvalidQuery();
		cb.query().setControlNo_Equal(report.getControlNo());

		// ===== 在庫移動指示帳票の更新実行 =====
		tMoveInstRBhv.queryUpdate(update, cb);
	}
}