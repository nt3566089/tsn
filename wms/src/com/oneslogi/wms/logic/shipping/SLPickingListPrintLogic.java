package com.oneslogi.wms.logic.shipping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.dbflute.bhv.referrer.ConditionBeanSetupper;

import com.oneslogi.base.dbflute.cbean.MProductShapeCB;
import com.oneslogi.base.dbflute.exbhv.MProductBhv;
import com.oneslogi.base.dbflute.exbhv.pmbean.SqlSLPickingListPrintPmb;
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.base.dbflute.exentity.TPickingR;
import com.oneslogi.base.dbflute.exentity.customize.SqlSLPickingListPrint;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.util.WmsMultipleShapeUtil;

/**
 * 種蒔きピッキングリスト発行ロジッククラス
 */
public class SLPickingListPrintLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====

	// [Ver3.0] unit of measure対応 2017.11.23 REN Del
	// [Ver3.0] unit of measure対応 2017.11.23 REN Start
	@Inject
	private MProductBhv mProductBhv;
	// [Ver3.0] unit of measure対応 2017.11.23 REN End
	// [ON推-品向-1127] 梱包計算無のときに届先ごとに分かれず1行になってしまう問題を修正(不要な定義を削除) 2016.04.25 kawana

	/**
	 * <h2>種蒔きピッキングリストデータを取得する。</h2>
	 * <pre>
	 *
	 * 引数を条件にデータベースからデータを検索し、
	 * データがある場合、種蒔きピッキングリストのデータを取得する。
	 *
	 * 検索対象が見つからない場合、
	 * ０件エラーをエラーステータスに設定する。
	 * </pre>
	 *
	 * @param tPickingR 出庫帳票：センタ・荷主・コントロールNo.
	 * @param tPickingH 出庫ヘッダ
	 * @param errSts エラー時に設定するエラーステータス
	 * @return List<SqlSLPickingListPrint> 種蒔きピッキングリスト発行データリスト
	 */
	// [エンハンス PH2.0] 梱包計算有り時、出庫作業Noを出荷梱包Noに変更 2015.12.11 sja Start
	//public List<SqlSLPickingListPrint> select(TPickingR tPickingR, ErrorStatus errSts) {
	public List<SqlSLPickingListPrint> select(TPickingR tPickingR, ErrorStatus errSts) {
	// [エンハンス PH2.0] 梱包計算有り時、出庫作業Noを出荷梱包Noに変更 2015.12.11 sja End

		List<SqlSLPickingListPrint> result = null;

		// ===== 種蒔きピッキングリスト発行データ取得 =====
		// 外出しSQLの定義
		// [Ver3.0] unit of measure対応 2017.11.23 REN Start
		String path = MProductBhv.PATH_selectSqlSLPickingListPrint;
		// [Ver3.0] unit of measure対応 2017.11.23 REN End

		// 検索条件の設定
		// [v3.1] 不要な処理(tPickingR.setTPickingH(tPickingH))を削除 2018.10.17 kawana Delete
		SqlSLPickingListPrintPmb pmb = setCondition(tPickingR);

		// 検索実行
		Class<SqlSLPickingListPrint> entityType = SqlSLPickingListPrint.class;
		// [ON推-品向-601] 帳票用の検索を共通メソッドを使用するように変更 2015.04.17 kawana Start
		// [Ver3.0] unit of measure対応 2017.11.23 REN Start
		result = selectListToReport(mProductBhv, path, pmb, entityType);
		// [Ver3.0] unit of measure対応 2017.11.23 REN End
		// [ON推-品向-601] 帳票用の検索を共通メソッドを使用するように変更 2015.04.17 kawana End

		// ===== ０件チェック =====

		if (result.size() == 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return result;
		}
		// [Ver3.0] unit of measure対応 2017.11.23 REN Start
		List<MProduct> pickingProductList = new ArrayList<>();

		for (SqlSLPickingListPrint pickingProduct : result) {
			// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod Start
			if (pickingProduct.prepareDomain() != null) {
				pickingProductList.add(pickingProduct.prepareDomain());
			}
			// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod End
		}

		mProductBhv.loadMProductShapeList(pickingProductList, new ConditionBeanSetupper<MProductShapeCB>() {
			public void setup(MProductShapeCB cb) {
				cb.setupSelect_MShapeGrpDtl().withMShapeGrp();
				cb.setupSelect_MShapeGrpDtl().withMShape().withVDictByShapeDictId(getCultureId());
				cb.setupSelect_MShapeGrpDtl().withMShape().withVDictByShapeUnitDictId(getCultureId());
				cb.query().setDelFlg_Equal_$0();
				cb.query().queryMShapeGrpDtl().addOrderBy_ShapeSort_Asc();
			}
		});

		Map<Long, String> decimalExistFlgMap = new HashMap<>();
		Map<Long, String> minimumUnitMap = new HashMap<>();
		Map<Long, List<Long>> parentUnitNumMap = new HashMap<>();
		Map<Long, List<String>> parentUnitMap = new HashMap<>();

		for (SqlSLPickingListPrint SqlListA : result) {
			// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod Start
			WmsMultipleShapeUtil.getParentMap(decimalExistFlgMap, minimumUnitMap, parentUnitNumMap, parentUnitMap, SqlListA.prepareDomain());
			//入数
			SqlListA.setStringUnitNum(WmsMultipleShapeUtil.getUnitNumBreakdown(decimalExistFlgMap, minimumUnitMap, parentUnitNumMap, parentUnitMap, SqlListA.prepareDomain()));
			//内訳
			SqlListA.setBreakdown(WmsMultipleShapeUtil.getPlanBreakdown(decimalExistFlgMap, SqlListA.getSumPickingNum(), minimumUnitMap, parentUnitNumMap
					, parentUnitMap, SqlListA.prepareDomain(), WmsMultipleShapeUtil.DisplayMode.SHAPE_ONLY));
			//最小梱包単位
			SqlListA.setMinimumPackingUnit(WmsMultipleShapeUtil.getProductMinimumUnit(minimumUnitMap, SqlListA.prepareDomain()));
			// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod End
			// [Ver3.0] unit of measure対応 2017.11.23 REN End
		}
		return result;
	}

	/**
	 * 検索条件の設定
	 * @param tPickingH 出庫ヘッダ
	 * @return List<TReceivePlanB> 検索条件pmb
	 */
	private SqlSLPickingListPrintPmb setCondition(TPickingR tPickingR) {
		// 検索条件の設定
		SqlSLPickingListPrintPmb pmb = new SqlSLPickingListPrintPmb();
		pmb.setControlNo(tPickingR.getControlNo());
		// [ON推-品向-850] カルチャIDの条件抜けを修正 2015.07.06 kawana Start
		pmb.setCultureId(getCultureId());
		// [ON推-品向-850] カルチャIDの条件抜けを修正 2015.07.06 kawana End

		// [v3.1] 不要な処理(未使用変数「mClientCenter」のnew)を削除 2018.10.17 kawana Delete

		return pmb;
	}

}
