package com.oneslogi.ht.wms.logic;

import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.List;

import javax.inject.Inject;

import org.dbflute.bhv.referrer.ConditionBeanSetupper;

import com.oneslogi.base.AbstractBase;
import com.oneslogi.base.dbflute.cbean.MProductCB;
import com.oneslogi.base.dbflute.cbean.MProductShapeCB;
import com.oneslogi.base.dbflute.exbhv.MProductBhv;
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.base.dbflute.exentity.MProductShape;
import com.oneslogi.base.dbflute.exentity.MShapeGrp;
import com.oneslogi.base.util.CU;
import com.oneslogi.ht.base.util.HandyScreenUtil;
import com.oneslogi.ht.wms.dto.HandyInputAuxiliaryDto;
import com.oneslogi.ht.wms.dto.HandyInputAuxiliaryProductShapeDto;
import com.oneslogi.wms.core.WCC;

/**
 * ハンディ用入力補助関連データ取得ロジッククラス
 */
public class HandyInputAuxiliarySelectLogic extends AbstractBase {

	@Inject
	private MProductBhv mProductBhv;
	@Inject
	private HandyScreenUtil screenUtil;

	/**
	 * <h2>商品マスタを取得する。</h2>
	 * <pre>
	 * ユニークキーを条件に商品マスタと商品荷姿マスタと荷姿マスタデータを取得する。
	 * 検索条件がNULLの場合はNULLを返す。
	 * </pre>
	 * @param entity 商品マスタ：荷主ID・商品CD
	 * @return MProduct 商品マスタ
	 */
	public MProduct getUkEntityWithProductShapeWithShapeWithDeletedCheck(MProduct entity) {
		MProduct result = new MProduct();

		if (entity.getClientId() == null) {
			return null;
		}
		if (CU.isNullOrEmpty(entity.getProductCd())) {
			return null;
		}

		MProductCB cb = mProductBhv.newMyConditionBean();
		cb.setupSelect_MShapeGrp();
		cb.query().setClientId_Equal(entity.getClientId());
		cb.query().setProductCd_Equal(entity.getProductCd());

		result = mProductBhv.selectEntityWithDeletedCheck(cb);

		// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Add Start
		if (getErrorManager().size() > 0) {
			return null;
		}
		// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Add End

		// 商品荷姿マスタ
		mProductBhv.loadMProductShapeList(result, new ConditionBeanSetupper<MProductShapeCB>() {
			@Override
			public void setup(MProductShapeCB subCB) {
				subCB.setupSelect_MShapeGrpDtl().withMShapeGrp();
				subCB.setupSelect_MShapeGrpDtl().withMShape().withVDictByShapeDictId(getCultureId());
				subCB.setupSelect_MShapeGrpDtl().withMShape().withVDictByShapeUnitDictId(getCultureId());
				subCB.query().queryMShapeGrpDtl().addOrderBy_ShapeSort_Asc();
				subCB.query().setDelFlg_Equal_$0();
			}
		});

		return result;
	}

	/**
	 * 呼び出し元画面.数量と取得した商品荷姿リストから各荷姿画面表示情報を取得する。<br>
	 * 各荷姿.項目名称, 各荷姿.計算後入数, 各荷姿.内訳
	 * @param inputAuxiliaryDto 入力補助情報
	 * @param defaultQty 呼び出し元画面.数量
	 * @param shapeGrp 荷姿グループ
	 * @param shapeGrpDtlList 荷姿グループ明細リスト(荷姿ソート昇順)
	 * @return 商品荷姿情報を設定した入力補助情報
	 */
	public HandyInputAuxiliaryDto getProductShapeInfo(HandyInputAuxiliaryDto inputAuxiliaryDto, String defaultQty, MShapeGrp shapeGrp, List<MProductShape> productShapeList) {

		// 荷姿.テキスト項目表示初期位置
		int defaultShapeTextY;
		// 荷姿.インプット項目表示初期位置
		int defaultShapeInputY;
		// 荷姿.インプット項目パラメータ初期名称
		final String defaultParam = "productShapeInputQty";

		// [Ver3.0][#3762] 荷姿グループ明細リストのサイズで縦位置を変更 2018.02.16 shimizu Start
		// 荷姿グループ明細のサイズが4未満の場合
		if(productShapeList.size() < 4) {
			defaultShapeTextY = 11;
			defaultShapeInputY = 14;
		} else {
			defaultShapeTextY = 7;
			defaultShapeInputY = 10;
		}
		// [Ver3.0][#3762] 荷姿グループ明細リストのサイズで縦位置を変更 2018.02.16 shimizu End

		// 少数有の場合、入力項目を1つのみ設定する
		if (shapeGrp.isDecimalExistFlg$1()) {
			HandyInputAuxiliaryProductShapeDto inputAuxiliaryProductShapeDto = new HandyInputAuxiliaryProductShapeDto();
			inputAuxiliaryProductShapeDto.setDecimalExistFlg(shapeGrp.getDecimalExistFlg());
			inputAuxiliaryProductShapeDto.setShapeNm(productShapeList.get(0).getMShapeGrpDtl().getMShape().getVDictByShapeDictId().getDictNm());
			inputAuxiliaryProductShapeDto.setShapeUnitNm(productShapeList.get(0).getMShapeGrpDtl().getMShape().getVDictByShapeUnitDictId().getDictNm());
			inputAuxiliaryProductShapeDto.setShapeInputItemNm(productShapeList.get(0).getMShapeGrpDtl().getMShape().getVDictByShapeDictId().getDictNm());
			inputAuxiliaryProductShapeDto.setCalcShapeUnitNum(null);
			// 入力param名設定
			String queryParamNm = new StringBuilder().append(defaultParam).append("1").toString();
			inputAuxiliaryProductShapeDto.setQueryParamNm(queryParamNm);
			// 荷姿.項目表示位置設定
			inputAuxiliaryProductShapeDto.setPositionTextY(String.valueOf(defaultShapeTextY));
			inputAuxiliaryProductShapeDto.setPositionInputY(String.valueOf(defaultShapeInputY));
			// 呼び出し元の値を内訳数として設定
			inputAuxiliaryProductShapeDto.setProductShapeInputQty(defaultQty);
			inputAuxiliaryDto.getInputAuxiliaryProductShapeDtoList().add(inputAuxiliaryProductShapeDto);
			return inputAuxiliaryDto;
		}

		// 子荷姿.単位名称
		String childShapeUnitNm = null;
		// 子荷姿.入数
		Long childShapeUnitNum = null;

		int count = 0;
		for (MProductShape productShape : productShapeList) {
			HandyInputAuxiliaryProductShapeDto inputAuxiliaryProductShapeDto = new HandyInputAuxiliaryProductShapeDto();

			inputAuxiliaryProductShapeDto.setDecimalExistFlg(shapeGrp.getDecimalExistFlg());
			inputAuxiliaryProductShapeDto.setShapeNm(productShape.getMShapeGrpDtl().getMShape().getVDictByShapeDictId().getDictNm());
			inputAuxiliaryProductShapeDto.setShapeUnitNm(productShape.getMShapeGrpDtl().getMShape().getVDictByShapeUnitDictId().getDictNm());

			// 荷姿入力項目名称
			if (count == 0) {
				// 1荷姿グループ.商品荷姿が最小の場合
				inputAuxiliaryProductShapeDto.setShapeInputItemNm(productShape.getMShapeGrpDtl().getMShape().getVDictByShapeDictId().getDictNm());
				Long pieceQty = CU.nullToZero(productShape.getUnitNum()) == 0L ? 1L : productShape.getUnitNum();
				inputAuxiliaryProductShapeDto.setCalcShapeUnitNum(pieceQty);
				inputAuxiliaryDto.getInputAuxiliaryProductShapeDtoList().add(inputAuxiliaryProductShapeDto);
				if (productShapeList.size() == 1) {
					// 1荷姿グループ.1商品荷姿の場合
					break;
				}
				childShapeUnitNum = pieceQty;
			} else {
				// 1荷姿グループ.商品荷姿が最小以外の場合
				// [#3548][Ver3.0] [HT]予定無し入荷 - 数量入力補助算出値不正 2018.01.23 honma Mod Start
				// 入数ピース換算
				Long calcShapeUnitNum = (CU.nullToZero(productShape.getUnitNum()) * childShapeUnitNum);
				inputAuxiliaryProductShapeDto.setCalcShapeUnitNum(calcShapeUnitNum);
				// [#3548][Ver3.0] [HT]予定無し入荷 - 数量入力補助算出値不正 2018.01.23 honma Mod end
				// 商品荷姿項目名の取得と引数置き換え
				String shapeUnitNumNm = new StringBuilder().append(CU.nullToZero(productShape.getUnitNum()).toString()).append(childShapeUnitNm).toString();
				String replaceInputItemNm = screenUtil.itemNm("HandyInputAuxiliaryHT", "productShapeInput");
				replaceInputItemNm = replaceInputItemNm.replaceAll("\\[0\\]", productShape.getMShapeGrpDtl().getMShape().getVDictByShapeDictId().getDictNm()).replaceAll("\\[1\\]", shapeUnitNumNm);
				inputAuxiliaryProductShapeDto.setShapeInputItemNm(replaceInputItemNm);
				inputAuxiliaryDto.getInputAuxiliaryProductShapeDtoList().add(inputAuxiliaryProductShapeDto);
				// [#3548][Ver3.0] [HT]予定無し入荷 - 数量入力補助算出値不正 2018.01.23 honma Mod Start
				childShapeUnitNum = CU.nullToZero(calcShapeUnitNum);
				// [#3548][Ver3.0] [HT]予定無し入荷 - 数量入力補助算出値不正 2018.01.23 honma Mod end
			}

			childShapeUnitNm = productShape.getMShapeGrpDtl().getMShape().getVDictByShapeUnitDictId().getDictNm();
			count++;
		}

		// 画面表示用商品荷姿データを逆ソート
		Collections.reverse(inputAuxiliaryDto.getInputAuxiliaryProductShapeDtoList());

		// 荷姿.テキスト項目表示位置
		int shapeTextY = defaultShapeTextY;
		// 荷姿.インプット項目表示位置
		int shapeInputY = defaultShapeInputY;
		int loopCount = 1;
		String qty = new String(defaultQty);
		// 逆ソート後の画面表示用商品荷姿データから入力param名と内訳数を作成
		for (HandyInputAuxiliaryProductShapeDto auxiliaryProductShapeDto : inputAuxiliaryDto.getInputAuxiliaryProductShapeDtoList()) {
			String queryParamNm = new StringBuilder().append(defaultParam).append(String.valueOf(loopCount)).toString();
			auxiliaryProductShapeDto.setQueryParamNm(queryParamNm);

			// 各荷姿表示位置設定
			if (loopCount == 1) {
				auxiliaryProductShapeDto.setPositionTextY(String.valueOf(shapeTextY));
				auxiliaryProductShapeDto.setPositionInputY(String.valueOf(shapeInputY));
			} else {
				// [Ver3.0][#3762] 縦位置修正 2018.02.16 shimizu Start
				shapeTextY = shapeTextY + 7;
				shapeInputY = shapeInputY + 7;
				// [Ver3.0][#3762] 縦位置修正 2018.02.16 shimizu End
				auxiliaryProductShapeDto.setPositionTextY(String.valueOf(shapeTextY));
				auxiliaryProductShapeDto.setPositionInputY(String.valueOf(shapeInputY));
			}

			// 数量入力がある場合、各荷姿内訳数計算を行う
			if (!CU.isNullOrEmpty(defaultQty)) {
				BigDecimal longQty = WCC.toBigDecimal(qty);
				Long calcShapeUnitNum = auxiliaryProductShapeDto.getCalcShapeUnitNum();
				BigDecimal divisorQty = null;
				BigDecimal remainderQty = null;
				// 除数, 余り数を取得
				if (calcShapeUnitNum == 0) {
					divisorQty = WCC.ZERO;
					remainderQty = longQty;
				} else {
					divisorQty = WCC.divide(longQty, calcShapeUnitNum);
					remainderQty = WCC.remainder(longQty, calcShapeUnitNum);
				}
				// [#3029][Ver3.0] Java側のBigDecimal共通関数化 2018.03.02 honma Mod Start
				if (divisorQty == null) {
					auxiliaryProductShapeDto.setProductShapeInputQty(WCC.stripTrailingZeros(WCC.ZERO));
				} else {
					auxiliaryProductShapeDto.setProductShapeInputQty(WCC.stripTrailingZeros(divisorQty));
				}

				if (qty == null) {
					qty = WCC.stripTrailingZeros(WCC.ZERO);
				} else {
					qty = WCC.stripTrailingZeros(remainderQty);
				}
				// [#3029][Ver3.0] Java側のBigDecimal共通関数化 2018.03.02 honma Mod End
			}

			loopCount++;
		}

		return inputAuxiliaryDto;
	}

	/**
	 * 入力補助画面で入力された各荷姿内訳を取得する。
	 * @param bean 入力補助画面.各荷姿内訳
	 * @param inputAuxiliaryDto 入力補助情報
	 * @return 入力された各荷姿内訳を格納した入力補助情報
	 * @throws Exception
	 */
	public HandyInputAuxiliaryDto getProductShapeInputQtyAll(HandyInputAuxiliaryDto bean, HandyInputAuxiliaryDto inputAuxiliaryDto) throws Exception {

		int count = 1;
		for (HandyInputAuxiliaryProductShapeDto dto : inputAuxiliaryDto.getInputAuxiliaryProductShapeDtoList()) {
			Object ret = getProductShapeInputQty(bean, count);

			// 取得した入力値を型変換
			String strInputQty = (String) ret;
			dto.setProductShapeInputQty(strInputQty);

			count++;
		}

		return inputAuxiliaryDto;
	}

	/**
	 * 入力補助画面で入力された各荷姿内訳から数量を取得する。
	 * @param bean 入力補助画面.各荷姿内訳
	 * @param inputAuxiliaryDto 入力補助情報
	 * @return 全荷姿加算数量
	 * @throws Exception
	 */
	public String getCalcQty(HandyInputAuxiliaryDto bean, HandyInputAuxiliaryDto inputAuxiliaryDto) throws Exception {
		String strSumQty = "";

		// 商品有無フラグにより処理変更
		if (inputAuxiliaryDto.getInputAuxiliaryProductShapeDtoList().get(0).getDecimalExistFlg().equals("1")) {
			// 商品有無フラグが有りの場合
			strSumQty = bean.getProductShapeInputQty1();
		} else {
			// 商品有無フラグが無しの場合
			BigDecimal sumQty = WCC.ZERO;
			boolean allEmptyFlg = true;

			int count = 1;
			for (HandyInputAuxiliaryProductShapeDto dto : inputAuxiliaryDto.getInputAuxiliaryProductShapeDtoList()) {
				Object ret = getProductShapeInputQty(bean, count);

				// 取得した入力値を型変換
				String strInputQty = (String) ret;
				if (!CU.nullToStr(strInputQty).equals("")) {
					allEmptyFlg = false;
				}

				BigDecimal inputQty = WCC.toBigDecimal(CU.nullOrEmptyToZero(strInputQty));
				// 該当荷姿から計算後入数を取得
				Long calcShapeUnitNum = dto.getCalcShapeUnitNum();
				// 計算結果を数量に加算
				sumQty = WCC.add(sumQty, WCC.multiply(inputQty, calcShapeUnitNum));
				count++;
			}

			// 各荷姿の入力値が全て空白以外の場合、計算結果を返す
			if (!allEmptyFlg) {
				// [#3029][Ver3.0] Java側のBigDecimal共通関数化 2018.03.02 honma Mod Start
				strSumQty = WCC.stripTrailingZeros(sumQty);
				// [#3029][Ver3.0] Java側のBigDecimal共通関数化 2018.03.02 honma Mod End
			}
		}
		return strSumQty;
	}

	/**
	 * 入力補助画面で入力された荷姿内訳を取得する。
	 * @param bean 入力補助画面.各荷姿内訳
	 * @param count 項目番号
	 * @return 入力された荷姿内訳
	 * @throws Exception
	 */
	private Object getProductShapeInputQty(HandyInputAuxiliaryDto bean, int count) throws Exception {
		String defaultParam = "getProductShapeInputQty";
		String paramKey = new StringBuilder().append(defaultParam).append(String.valueOf(count)).toString();

		Object ret;
		// インスタンスを作成
		Object obj = bean;
		// メソッドを取得
		Method getMethod = obj.getClass().getMethod(paramKey);
		// メソッド実行
		ret = getMethod.invoke(obj);
		return ret;
	}


}
