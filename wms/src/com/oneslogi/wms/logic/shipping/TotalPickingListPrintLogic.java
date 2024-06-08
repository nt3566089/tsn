package com.oneslogi.wms.logic.shipping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.dbflute.bhv.referrer.ConditionBeanSetupper;

import com.oneslogi.base.dbflute.cbean.MProductShapeCB;
import com.oneslogi.base.dbflute.exbhv.MProductBhv;
import com.oneslogi.base.dbflute.exbhv.pmbean.SqlTotalPickingListPrintPmb;
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.base.dbflute.exentity.TPickingR;
import com.oneslogi.base.dbflute.exentity.customize.SqlTotalPickingListPrint;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.util.WmsMultipleShapeUtil;

/**
 * トータルピッキングリスト発行ロジッククラス
 */
public class TotalPickingListPrintLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	// [Ver3.0] unit of measure対応 2017.11.24 REN Del

	// [Ver3.0] unit of measure対応 2017.11.24 REN Start
	@Inject
	private MProductBhv mProductBhv;
	// [Ver3.0] unit of measure対応 2017.11.24 REN End

	/**
	 * <h2>トータルピッキングリストデータを取得する。</h2>
	 * <pre>
	 * 引数を条件に外出しSQLを使用し、トータルピッキングリストのデータを取得する。
	 *
	 * 検索対象が見つからない場合、
	 * ０件エラーをエラーステータスに設定する。
	 * </pre>
	 *
	 * @param tPickingR 出庫帳票：コントロールNo.・削除フラグ
	 * @param errSts エラー時に設定するエラーステータス
	 * @return List<SqlTotalPickingListPrint> トータルピッキングリスト発行データリスト
	 */
	public List<SqlTotalPickingListPrint> selectProgressData(TPickingR tPickingR, ErrorStatus errSts) {

		List<SqlTotalPickingListPrint> result = null;

		// ===== トータルピッキングリスト発行データ取得 =====

		// 外出しSQLの定義
		// [Ver3.0] unit of measure対応 2017.11.24 REN Start
		String path = MProductBhv.PATH_selectSqlTotalPickingListPrint;
		// [Ver3.0] unit of measure対応 2017.11.24 REN End

		// 検索条件の設定
		SqlTotalPickingListPrintPmb pmb = setCondition(tPickingR);
		//[検査-131] ピッキンググループNo採番ルール変更 2014.12.05 KI Start
		if (tPickingR.getDelFlg() != null){
			pmb.setDelFlg(tPickingR.getDelFlg());
		}
		//[検査-131] ピッキンググループNo採番ルール変更 2014.12.05 KI End
		// 検索実行
		Class<SqlTotalPickingListPrint> entityType = SqlTotalPickingListPrint.class;
		// [ON推-品向-601] 帳票用の検索を共通メソッドを使用するように変更 2015.04.17 kawana Start
		// [Ver3.0] unit of measure対応 2017.11.24 REN Start
		result = selectListToReport(mProductBhv, path, pmb, entityType);
		// [Ver3.0] unit of measure対応 2017.11.24 REN End
		// [ON推-品向-601] 帳票用の検索を共通メソッドを使用するように変更 2015.04.17 kawana End

		// ===== ０件チェック =====

		if (result.size() == 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return result;
		}
		// [Ver3.0] unit of measure対応 2017.11.23 REN Start
		List<MProduct> pickingProductList = new ArrayList<>();

		for (SqlTotalPickingListPrint pickingProduct : result) {
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

		for (SqlTotalPickingListPrint SqlListA : result) {
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
	 * @return SqlTotalPickingListPrintPmb 検索条件pmb
	 */
	private SqlTotalPickingListPrintPmb setCondition(TPickingR tPickingR) {
		// 検索条件の設定
		SqlTotalPickingListPrintPmb pmb = new SqlTotalPickingListPrintPmb();
		pmb.setControlNo(tPickingR.getControlNo());
		// [ON推-品向-850] カルチャIDの条件抜けを修正 2015.07.06 kawana Start
		pmb.setCultureId(getCultureId());
		// [ON推-品向-850] カルチャIDの条件抜けを修正 2015.07.06 kawana End

		return pmb;
	}

}
