package com.oneslogi.wms.util;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.base.dbflute.exentity.MProductShape;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.core.WCC;

public class WmsMultipleShapeUtil {

	// ===== enum =====

	/** 項目表示区分 */
	public enum DisplayMode {
		/** 全て */
		ALL,
		/** ピース荷姿のみ */
		PIECE_ONLY,
		/** 荷姿のみ */
		SHAPE_ONLY
	}

	/** ケースピッキングピック数項目表示区分 */
	public enum CasePickingDisplayMode {
		/** ケース */
		CASE,
		/** バラ */
		BARA
	}

	// ===== 定数 =====

	/** 入数用区切値 */
	private static final String UNIT_NUM_SPLIT_VALUE = ",";
	/** 内訳用区切値 */
	private static final String BREAKDOWN_SPLIT_VALUE = ", ";

	// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod Start
	/**
	 * <H2>各種親荷姿Map取得。</H2>
	 * <pre>
	 * 商品荷姿リストから少数有無フラグMap、最小荷姿単位Map、親荷姿単位Map、親荷姿入数Mapを取得する。
	 * 商品マスタ未存在の場合は各種親荷姿Map取得を行わない。
	 * </pre>
	 * @param decimalExistFlgMap 少数有無フラグMap
	 * @param minimumUnitMap 最小荷姿単位Map
	 * @param parentUnitNumMap 親荷姿入数Map
	 * @param parentUnitMap 親荷姿単位Map
	 * @param mProduct 商品マスタ
	 * @return
	 */
	public static void getParentMap(Map<Long, String> decimalExistFlgMap, Map<Long, String> minimumUnitMap, Map<Long, List<Long>> parentUnitNumMap, Map<Long, List<String>> parentUnitMap
			, MProduct mProduct) {
		if (mProduct == null) {
			return;
		}
		// 親荷姿入数リスト
		List<Long> parentUnitNumList = new ArrayList<>();
		// 親荷姿単位リスト
		List<String> parentUnitList = new ArrayList<>();

		int count = 0;
		for (MProductShape mProductShape : mProduct.getMProductShapeList()) {
			// 最小荷姿の場合、処理しない
			if (count == 0) {
				count++;
				continue;
			}

			parentUnitNumList.add(mProductShape.getUnitNum());
			parentUnitList.add(mProductShape.getMShapeGrpDtl().getMShape().getVDictByShapeUnitDictId().getDictNm());

			count++;
		}

		setMap(decimalExistFlgMap, minimumUnitMap, parentUnitNumMap, parentUnitMap, mProduct.getMProductShapeList(), parentUnitNumList, parentUnitList);

		return;
	}


	/**
	 * <H2>各種ケースピッキング用親荷姿Map取得。</H2>
	 * <pre>
	 * 商品荷姿リストからケースピッキング用の少数有無フラグMap、最小荷姿単位Map、親荷姿単位Map、親荷姿入数Mapを取得する。
	 * 商品マスタ未存在の場合は各種ケースピッキング用親荷姿Map取得を行わない。
	 * </pre>
	 * @param decimalExistFlgMap 少数有無フラグMap
	 * @param minimumUnitMap 最小荷姿単位Map
	 * @param parentUnitNumMap 親荷姿入数Map
	 * @param parentUnitMap 親荷姿単位Map
	 * @param mProduct 商品マスタ
	 * @return
	 */
	public static void getCaseParentMap(Map<Long, String> decimalExistFlgMap, Map<Long, String> minimumUnitMap, Map<Long, List<Long>> parentUnitNumMap, Map<Long, List<String>> parentUnitMap,
			MProduct mProduct) {
		if (mProduct == null) {
			return;
		}
		// 親荷姿入数リスト
		List<Long> parentUnitNumList = new ArrayList<>();
		// 親荷姿単位リスト
		List<String> parentUnitList = new ArrayList<>();

		int count = 0;
		for (MProductShape mProductShape : mProduct.getMProductShapeList()) {
			// 最小荷姿の場合、処理しない
			if (count == 0) {
				count++;
				continue;
			}

			parentUnitNumList.add(mProductShape.getUnitNum());
			parentUnitList.add(mProductShape.getMShapeGrpDtl().getMShape().getVDictByShapeUnitDictId().getDictNm());

			// [#3115][Ver3.0] ＳＤケースピッキング - UoM対応 2017.12.25 honma Add Start
			if (CDef.CasePickFlg.codeOf(mProductShape.getMShapeGrpDtl().getCasePickFlg()) == CDef.CasePickFlg.$1) {
				break;
			}
			// [#3115][Ver3.0] ＳＤケースピッキング - UoM対応 2017.12.25 honma Add End
			count++;
		}

		// 各種荷姿Mapを設定
		setMap(decimalExistFlgMap, minimumUnitMap, parentUnitNumMap, parentUnitMap, mProduct.getMProductShapeList(), parentUnitNumList, parentUnitList);

		return;
	}

	/**
	 * 各種荷姿Mapを設定。<br>
	 * @param decimalExistFlgMap 少数有無フラグMap
	 * @param minimumUnitMap 最小荷姿単位Map
	 * @param parentUnitNumMap 親荷姿入数Map
	 * @param parentUnitMap 親荷姿単位Map
	 * @param productShapeList 商品荷姿リスト
	 * @param parentUnitNumList 親荷姿入数リスト
	 * @param parentUnitList 親荷姿単位リスト
	 */
	private static void setMap(Map<Long, String> decimalExistFlgMap, Map<Long, String> minimumUnitMap, Map<Long, List<Long>> parentUnitNumMap, Map<Long, List<String>> parentUnitMap,
			List<MProductShape> productShapeList, List<Long> parentUnitNumList, List<String> parentUnitList) {
		Long productId = productShapeList.get(0).getProductId();
		// 少数有無フラグ
		String decimalExistFlg = productShapeList.get(0).getMShapeGrpDtl().getMShapeGrp().getDecimalExistFlg();
		decimalExistFlgMap.put(productId, decimalExistFlg);
		// 最小荷姿単位
		String minimumUnit = productShapeList.get(0).getMShapeGrpDtl().getMShape().getVDictByShapeUnitDictId().getDictNm();
		minimumUnitMap.put(productId, minimumUnit);
		parentUnitNumMap.put(productId, parentUnitNumList);
		parentUnitMap.put(productId, parentUnitList);
	}


	/**
	 * <H2>1荷姿グループの最小荷姿単位、親荷姿(入数、単位)から入数内訳を取得する。</H2>
	 * <pre>
	 * 小数有無フラグが小数を含む場合は、入数内訳は空白となる。
	 * 1荷姿グループ1荷姿の場合は、入数内訳は空白となる。
	 * 親荷姿は最小荷姿から順番に取得出来ることを前提。
	 * 商品マスタ未存在の場合は入数内訳取得を行わない。
	 * </pre>
	 * @param decimalExistFlgMap 少数有無フラグMap
	 * @param minimumUnitMap 最小荷姿単位Map
	 * @param parentUnitNumMap 親荷姿入数Map
	 * @param parentUnitMap 親荷姿単位Map
	 * @param mProduct 商品マスタ
	 * @return 入数内訳
	 */
	public static String getUnitNumBreakdown(Map<Long, String> decimalExistFlgMap, Map<Long, String> minimumUnitMap, Map<Long, List<Long>> parentUnitNumMap, Map<Long, List<String>> parentUnitMap, MProduct mProduct) {

		if (mProduct == null) {
			return null;
		}

		String decimalExistFlg = decimalExistFlgMap.get(mProduct.getProductId());
		String unit = minimumUnitMap.get(mProduct.getProductId());
		List<Long> parentUnitNumList = parentUnitNumMap.get(mProduct.getProductId());
		List<String> parentUnitList = parentUnitMap.get(mProduct.getProductId());

		// 小数有無フラグが小数を含む場合は空白を返却
		if (CU.equals(decimalExistFlg, "1")) {
			return null;
		}
		// 親荷姿入数が無い場合は空白を返却
		if (parentUnitNumList == null || parentUnitNumList.size() < 1) {
			return null;
		}
		// 親荷姿単位が無い場合は空白を返却
		if (parentUnitList == null || parentUnitList.size() < 1) {
			return null;
		}

		StringBuilder sb = new StringBuilder();
		// 子荷姿単位
		String childUnit = null;
		// 各荷姿用入数内訳
		List<String> unitNumBreakdownList = new ArrayList<String>();
		for (int i = 0; i < parentUnitNumList.size(); i++) {
			Long parentUnitNum = parentUnitNumList.get(i);
			String parentUnit = parentUnitList.get(i);
			if (i == 0) {
				sb.append("1").append(parentUnit).append("=").append(parentUnitNum.toString()).append(unit);
			} else {
				sb.append("1").append(parentUnit).append("=").append(parentUnitNum.toString()).append(childUnit);
			}
			childUnit = parentUnit;
			unitNumBreakdownList.add(sb.toString());
			// 初期化
			sb = new StringBuilder();
		}

		// 降順ソート
		Collections.reverse(unitNumBreakdownList);
		int count = 0;
		// 全荷姿の入数内訳連結
		for (String unitNumBreakdown : unitNumBreakdownList) {
			if (count == 0) {
				sb.append(unitNumBreakdown);
			} else {
				sb.append(BREAKDOWN_SPLIT_VALUE).append(unitNumBreakdown);
			}
			count++;
		}

		return sb.toString();
	}

	/**
	 * <H2>1荷姿グループの予定数、最小荷姿単位、親荷姿(入数、単位)から予定内訳を取得する。</H2>
	 * <pre>
	 * 小数有無フラグが小数を含む場合は、予定内訳は空白となる。
	 * 1荷姿グループ1荷姿の場合は、予定内訳は空白となる。
	 * 親荷姿は最小荷姿から順番に取得出来ることを前提。
	 * 商品マスタ未存在の場合は予定内訳取得を行わない。
	 * </pre>
	 * @param decimalExistFlgMap 少数有無フラグMap
	 * @param planNum 予定数
	 * @param minimumUnitMap 最小荷姿単位Map
	 * @param parentUnitNumMap 親荷姿入数Map
	 * @param parentUnitMap 親荷姿単位Map
	 * @param mProduct 商品マスタ
	 * @param mode 項目表示区分
	 * @return 予定内訳
	 */
	public static String getPlanBreakdown(Map<Long, String> decimalExistFlgMap, BigDecimal planNum, Map<Long, String> minimumUnitMap, Map<Long, List<Long>> parentUnitNumMap, Map<Long, List<String>> parentUnitMap, MProduct mProduct, DisplayMode mode) {

		if (mProduct == null) {
			return null;
		}

		String decimalExistFlg = decimalExistFlgMap.get(mProduct.getProductId());
		String unit = minimumUnitMap.get(mProduct.getProductId());
		List<Long> parentUnitNumList = parentUnitNumMap.get(mProduct.getProductId());
		List<String> parentUnitList = parentUnitMap.get(mProduct.getProductId());

		// 小数有無フラグが小数を含む場合は空白を返却
		if (CU.equals(decimalExistFlg, "1")) {
			return null;
		}

		// 予定数が0の場合は空白を返却
		if (WCC.isZero(planNum)) {
			return null;
		}
		// 親荷姿入数が無い場合は空白を返却
		if (parentUnitNumList == null || parentUnitNumList.size() < 1) {
			return null;
		}
		// 親荷姿単位が無い場合は空白を返却
		if (parentUnitList == null || parentUnitList.size() < 1) {
			return null;
		}
		// 項目表示区分がピース荷姿のみの場合は予定数を返却
		if (mode == DisplayMode.PIECE_ONLY) {
			// [#3029][Ver3.0] Java側のBigDecimal共通関数化 2018.03.02 honma Mod Start
			return WCC.stripTrailingZeros(planNum) + unit;
			// [#3029][Ver3.0] Java側のBigDecimal共通関数化 2018.03.02 honma Mod End
		}

		StringBuilder sb = new StringBuilder();
		// 子荷姿入数
		Long childUnitNum = 1L;
		// 計算用子荷姿入数
		Long calcUnitNum = 1L;
		// 各荷姿用入数計算
		List<String> shapeUnitNumList = new ArrayList<String>();
		sb.append("1,").append(unit);
		shapeUnitNumList.add(sb.toString());
		// 初期化
		sb = new StringBuilder();
		for (int i = 0; i < parentUnitNumList.size(); i++) {
			Long parentUnitNum = parentUnitNumList.get(i);
			String parentUnit = parentUnitList.get(i);
			if (i == 0) {
				sb.append(parentUnitNum.toString()).append(UNIT_NUM_SPLIT_VALUE).append(parentUnit);
				calcUnitNum = parentUnitNum;
			} else {
				calcUnitNum = parentUnitNum * childUnitNum;
				sb.append(calcUnitNum.toString()).append(UNIT_NUM_SPLIT_VALUE).append(parentUnit);
			}
			childUnitNum = calcUnitNum;
			shapeUnitNumList.add(sb.toString());
			// 初期化
			sb = new StringBuilder();
		}

		// 降順ソート
		Collections.reverse(shapeUnitNumList);
		int count = 1;
		// 計算用の荷姿入数
		Long calcShapeUnitNum = 0L;
		// 計算用の余りの数値
		BigDecimal originalRemainderNum = WCC.ZERO;
		// 余りの数値
		BigDecimal remainderNum = planNum;
		// 除算の数値
		BigDecimal quotientNum = WCC.ZERO;

		// 項目表示区分が全ての場合はピース数と(を追加
		if (mode == DisplayMode.ALL) {
			// [#3029][Ver3.0] Java側のBigDecimal共通関数化 2018.03.02 honma Mod Start
			sb.append(WCC.stripTrailingZeros(planNum)).append(unit).append(" (");
			// [#3029][Ver3.0] Java側のBigDecimal共通関数化 2018.03.02 honma Mod End
		}

		// 全荷姿の予定内訳計算・連結
		for (String unitNumBreakdown : shapeUnitNumList) {
			String[] splitUnitNumBreakdown = unitNumBreakdown.split(UNIT_NUM_SPLIT_VALUE, 0);
			if (count == shapeUnitNumList.size()) {
				sb.append(WCC.stripTrailingZeros(remainderNum)).append(splitUnitNumBreakdown[1]);
			} else {
				calcShapeUnitNum = Long.parseLong(splitUnitNumBreakdown[0]);
				originalRemainderNum = remainderNum;
				if (!CU.isNotNullAndEquals(0L, calcShapeUnitNum)) {
					quotientNum = WCC.divide(originalRemainderNum, calcShapeUnitNum);
					remainderNum = WCC.remainder(originalRemainderNum, calcShapeUnitNum);
				}
				//[#3038][Ver3.0] 不要なroundDownを削除 2018.02.20 miyabe Upd Start
				// [#3029][Ver3.0] Java側のBigDecimal共通関数化 2018.03.02 honma Mod Start
				sb.append(WCC.stripTrailingZeros(quotientNum)).append(splitUnitNumBreakdown[1]).append(BREAKDOWN_SPLIT_VALUE);
				// [#3029][Ver3.0] Java側のBigDecimal共通関数化 2018.03.02 honma Mod End
				//[#3038][Ver3.0] 不要なroundDownを削除 2018.02.20 miyabe Upd End
			}
			count++;
		}

		// 項目表示区分が全ての場合は)を追加
		if (mode == DisplayMode.ALL) {
			sb.append(")");
		}

		return sb.toString();
	}

	/**
	 * <H2>ケースピッキングのピック数を取得する。</H2>
	 * <pre>
	 * ケースピッキングピック数項目表示区分により表示する内容を編集する。
	 * ケースピッキングピック数項目表示区分=CASEの場合、ピック数(ケース)の値を返却。
	 * ケースピッキングピック数項目表示区分=BARAの場合、ピック数(バラ)の値を返却。
	 * 商品荷姿リストは最小荷姿から順番に取得出来ることを前提。
	 * 予定内訳未存在の場合はケースピッキングのピック数取得を行わない。
	 * </pre>>
	 * @param planBreakdown 予定内訳
	 * @param caseMode ケースピッキングピック数項目表示区分
	 * @return ピック数
	 */
	public static String getCasePickingBreakdown(String planBreakdown, CasePickingDisplayMode caseMode) {

		if (planBreakdown == null) {
			return null;
		}

		// 予定内訳に区切り値が無い場合、編集せずに予定内訳を返却
		if (planBreakdown.indexOf(BREAKDOWN_SPLIT_VALUE) < 0) {
			return planBreakdown;
		}

		// ピック数
		String casePickingBreakdown = null;
		// ケースピッキングピック数項目表示区分
		switch (caseMode) {
		case CASE:
			casePickingBreakdown = planBreakdown.substring(0, planBreakdown.indexOf(BREAKDOWN_SPLIT_VALUE));
			break;
		case BARA:
			casePickingBreakdown = planBreakdown.substring(planBreakdown.indexOf(BREAKDOWN_SPLIT_VALUE), planBreakdown.length()).replaceFirst(BREAKDOWN_SPLIT_VALUE, "");
			break;
		default:
			casePickingBreakdown = planBreakdown;
			break;
		}

		return casePickingBreakdown;
	}

	// [Ver3.0] unit of measure対応 2017.12.5 潘 Start
	/**
	 * <H2>各種荷姿名称Map取得。</H2>
	 * <pre>
	 * 商品マスタ未存在の場合は各種荷姿名称Map取得を行わない。
	 * </pre>
	 * @param unitNmMap 荷姿名称Map
	 * @param mProduct 商品マスタ
	 * @return
	 */
	public static void getUnitNmMap(Map<Long, String> unitNmMap, MProduct mProduct) {

		if (mProduct == null) {
			return;
		}

		// 親荷姿入数リスト
		List<Long> parentUnitNumList = new ArrayList<>();
		// 親荷姿単位リスト
		List<String> parentUnitList = new ArrayList<>();

		int count = 0;
		for (MProductShape mProductShape : mProduct.getMProductShapeList()) {
			// 最小荷姿の場合、処理しない
			if (count == 0) {
				count++;
				continue;
			}

			parentUnitNumList.add(mProductShape.getUnitNum());
			parentUnitList.add(mProductShape.getMShapeGrpDtl().getMShape().getVDictByShapeDictId().getDictNm());
			count++;
		}

		Long productId = mProduct.getMProductShapeList().get(0).getProductId();
		// 最小荷姿名称
		String minimumUnitNm = mProduct.getMProductShapeList().get(0).getMShapeGrpDtl().getMShape().getVDictByShapeDictId().getDictNm();
		unitNmMap.put(productId, minimumUnitNm);

		return;
	}

	/**
	 * <H2>最小荷姿単位取得</H2>
	 * <pre>
	 * 最小荷姿単位Mapから商品情報に紐づく最小荷姿単位を取得する。
	 * 商品情報が存在しない場合、nullを返却する。
	 * </pre>
	 * @param minimumUnitMap 最小荷姿単位Map
	 * @param mProduct 商品情報
	 * @return 最小荷姿単位
	 */
	public static String getProductMinimumUnit(Map<Long, String> minimumUnitMap, MProduct mProduct) {

		if (mProduct == null) {
			return null;
		}

		return minimumUnitMap.get(mProduct.getProductId());
	}

	// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod End
	// [Ver3.0] unit of measure対応 2017.12.5 潘 End
}
