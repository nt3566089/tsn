package com.oneslogi.wms.logic.common;

import java.math.BigDecimal;
import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.allcommon.CDef.ProductLabelOutUnit;
import com.oneslogi.base.dbflute.dto.MParamDto;
import com.oneslogi.base.dbflute.dto.MProductDto;
import com.oneslogi.base.dbflute.exentity.MProductShape;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.core.logic.common.ProductShapeCalcLogic;
import com.oneslogi.wms.dto.report.ProductLabelDto;

public class ProductLabelLogic extends AbstractWmsLogic {

	// ※※※ package com.oneslogi.wms.util.WmsProductLabelUtilを削除して代替の本クラス(ProductLabelLogic)を作成

	// ===== 使用ロジック =====

	@Inject
	private ProductShapeCalcLogic productShapeCalcLogic;

	// [#2830] 商品ラベルの枚数計算のロジックをUoM対応 2017.12.21 kawana Start

	/**
	 * <h2>商品ラベルの出力枚数を計算する。</h2>
	 * <pre>
	 * 商品数と商品ラベル出力単位(パラメータマスタ)の設定により
	 * 商品ラベル出力枚数を計算する。
	 *
	 * </pre>
	 *
	 * @param productId 商品ID
	 * @param storeNum 数量
	 * @return 商品ラベル出力枚数
	 */
	public long getOutNum(long productId, BigDecimal storeNum, MParamDto mParamDto) {

		if (storeNum == null || WCC.isLessEqual(storeNum, WCC.ZERO)) {
			// 商品数 0
			return 0;
		}

		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.14 miyabe Start
		CDef.ProductLabelOutUnit outUnit = CDef.ProductLabelOutUnit.$2;
		if (mParamDto.getProductLabelOutUnit() != null) {
			outUnit = CDef.ProductLabelOutUnit.codeOf(mParamDto.getProductLabelOutUnit());
			// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.14 miyabe End
		}

		if (outUnit == ProductLabelOutUnit.$0) {

			// 1明細1枚
			return 1;
		}

		List<MProductShape> shapeList = productShapeCalcLogic.getAllShapeNum(productId, storeNum);
		if (shapeList.isEmpty()) {
			// 小数あり

			return 1;
		}

		if (outUnit == ProductLabelOutUnit.$2) {
			// 1ピース1枚
			return WCC.longValue(storeNum);
		}

		// 1ケース1枚 1ボール1枚 端数(ピース)はいくつでも1枚

		long outNum = 0;
		for (MProductShape shape : shapeList) {

			if (shape.getNum() == 0) {
				continue;
			}

			if (CU.nullToStr(shape.getPieceFlg()).equals("1")) {
				// ピースの場合はまとめて1枚

				outNum = outNum + 1;
			} else {
				// ピース以外は数量分印刷する

				outNum = outNum + shape.getNum();
			}
		}

		return outNum;
	}

	// [#2830] 商品ラベルの枚数計算のロジックをUoM対応 2017.12.21 kawana End

	/**
	 * 数量、入数からピース数を取得する。
	 * 入数が0の場合は、ピース数は数量と同じ数となる。
	 *
	 * @param num 数量
	 * @param unitNum 入数
	 * @return ピース数
	 */
	public ProductLabelDto getProductLabelDto(MProductDto mProductDto, MParamDto mParamDto) {

		// 帳票出力データ取得処理
		ProductLabelDto productLabelDto = new ProductLabelDto();
		String productLabelStartbit = "";
		String productLabelEndbit = "";
		String strSourceCd = "";

		// 商品マスタのJANCDがないの場合、商品CDを表示する
		if (mProductDto.getJanCd() == null) {
			productLabelStartbit = CU.nullToStr(mParamDto.getProductLabelProdStartbit());
			productLabelEndbit = CU.nullToStr(mParamDto.getProductLabelProdEndbit());
			strSourceCd = CU.nullToStr(mProductDto.getProductCd());

			// [#1002] 商品ラベルバーコード不正 対応修正 2017.2.9 nayzaw start
			//商品ラベル商品CDバーコード種別
			if (mParamDto.getProductLabelProdBarcode().equals("JAN")) {
				if (strSourceCd.trim().length() <= 8) {
					productLabelDto.productLabelBarcode = mParamDto.getProductLabelProdBarcode() + "8";
				} else {
					productLabelDto.productLabelBarcode = mParamDto.getProductLabelProdBarcode() + "13";
				}
			} else {
				productLabelDto.productLabelBarcode = mParamDto.getProductLabelProdBarcode();
			}
			// [#1002] 商品ラベルバーコード不正 対応修正 2017.2.9 nayzaw end

			// 商品マスタのJANCDがあるの場合、JANCDを表示する
		} else {
			productLabelStartbit = CU.nullToStr(mParamDto.getProductLabelJanStartbit());
			productLabelEndbit = CU.nullToStr(mParamDto.getProductLabelJanEndbit());
			strSourceCd = CU.nullToStr(mProductDto.getJanCd());

			// [#1002] 商品ラベルバーコード不正 対応修正 2017.2.9 nayzaw start
			//商品ラベルJANCDバーコード種別
			if (mParamDto.getProductLabelJanBarcode().equals("JAN")) {
				if (strSourceCd.trim().length() <= 8) {
					productLabelDto.productLabelBarcode = mParamDto.getProductLabelJanBarcode() + "8";
				} else {
					productLabelDto.productLabelBarcode = mParamDto.getProductLabelJanBarcode() + "13";
				}
			} else {
				productLabelDto.productLabelBarcode = mParamDto.getProductLabelJanBarcode();
			}
			// [#1002] 商品ラベルバーコード不正 対応修正 2017.2.9 nayzaw end
		}

		//JANCD or 商品CD
		productLabelDto.setProductCd(strSourceCd);
		//JANCD or 商品CDバーコード
		productLabelDto.setProductCdBar(productLabelStartbit + strSourceCd + productLabelEndbit);

		//商品名称
		productLabelDto.productNm = mProductDto.getProductNm();

		return productLabelDto;
	}
}
