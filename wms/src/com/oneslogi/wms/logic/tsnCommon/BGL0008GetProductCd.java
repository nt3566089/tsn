package com.oneslogi.wms.logic.tsnCommon;

import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.cbean.MProductCB;
import com.oneslogi.base.dbflute.exbhv.MProductBhv;
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

public class BGL0008GetProductCd extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private MProductBhv mProductBhv;

	public String getProductCd(String inputData, String brandNameCd, ErrorStatus errSts) {

		String searchBrandNameCd = null;

		if (inputData.length() == 8 || inputData.length() == 13 || inputData.length() == 7
				|| inputData.length() == 12) {
			//入力情報がJAN(8桁または13桁)もしくはUPC(7桁または12桁)の場合

			if (inputData.length() == 8) {
				//入力情報がJAN(8桁)の場合
				searchBrandNameCd = inputData + "00000";

			} else if (inputData.length() == 7) {
				//入力情報がUPC(7桁)の場合
				searchBrandNameCd = "1" + inputData + "00000";

			} else if (inputData.length() == 12) {
				//入力情報がUPC(12桁)の場合
				searchBrandNameCd = inputData + "0";

			} else {
				//上記以外
				searchBrandNameCd = inputData;

			}

			// ===== 銘柄マスタを検索する =====
			MProductCB cb = mProductBhv.newMyConditionBean();
			// 検索条件
			cb.query().setJanCd_Equal(searchBrandNameCd);
			cb.query().setDelFlg_Equal("0");
			// 検索実行
			List<MProduct> tStockList = mProductBhv.selectList(cb);

			//該当データなしの場合
			if (tStockList.size() == 0) {

				this.getErrorManager().add(errSts, WmsMessageConst.PRODUCT_NOT_FOUND_ERROR);
				return null;

			} else {

				for (MProduct mProduct : tStockList) {

					if (mProduct.getProductCd() == null) {

						this.getErrorManager().add(errSts, WmsMessageConst.PRODUCT_NOT_FOUND_ERROR);
						return null;

					}

					brandNameCd = mProduct.getProductCd();
					//変数に値を設定する

				}

			}

		} else if (inputData.length() == 14 || inputData.length() == 16) {
			//入力情報がITF(14桁または16桁)の場合

			if (inputData.length() == 14) {
				//入力情報がITF(14桁)の場合

				searchBrandNameCd = inputData + "00";

			} else {
				//上記以外

				searchBrandNameCd = inputData;

			}

			// ===== 銘柄マスタを検索する =====
			MProductCB cb = mProductBhv.newMyConditionBean();
			// 検索条件
			cb.query().setItfcd_Equal(searchBrandNameCd);
			cb.query().setDelFlg_Equal("0");
			// 検索実行
			List<MProduct> tStockList = mProductBhv.selectList(cb);

			//該当データなしの場合
			if (tStockList.size() == 0) {

				this.getErrorManager().add(errSts, WmsMessageConst.PRODUCT_NOT_FOUND_ERROR);
				return null;

			} else {

				for (MProduct mProduct : tStockList) {

					if (mProduct.getProductCd() == null) {

						this.getErrorManager().add(errSts, WmsMessageConst.PRODUCT_NOT_FOUND_ERROR);
						return null;

					}

					brandNameCd = mProduct.getProductCd();
					//変数に値を設定する

				}
			}

		} else if (inputData.length() == 4 || inputData.length() == 68 || inputData.length() == 36) {
			//入力情報が商品CD(4桁)もしくはシンボル(国産)(68桁)、シンボル(輸入)(36桁)の場合

			if (inputData.length() == 68) {

				searchBrandNameCd = "00" + inputData.substring(5, 9);

			} else if (inputData.length() == 36) {

				searchBrandNameCd = "00" + inputData.substring(6, 10);

			} else {

				searchBrandNameCd = "00" + inputData;

			}

			// ===== 銘柄マスタを検索する =====
			MProductCB cb = mProductBhv.newMyConditionBean();

			// 検索条件
			cb.query().setProductCd_Equal(searchBrandNameCd);
			cb.query().setDelFlg_Equal("0");
			// 検索実行
			List<MProduct> tStockList = mProductBhv.selectList(cb);

			//該当データなしの場合
			if (tStockList.size() == 0) {

				this.getErrorManager().add(errSts, WmsMessageConst.PRODUCT_NOT_FOUND_ERROR);
				return null;

			} else {

				for (MProduct mProduct : tStockList) {

					if (mProduct.getProductCd() == null) {

						this.getErrorManager().add(errSts, WmsMessageConst.PRODUCT_NOT_FOUND_ERROR);
						return null;

					}

					brandNameCd = mProduct.getProductCd();
					//変数に値を設定する

				}

			}

		} else {
			//上記以外
			this.getErrorManager().add(errSts, WmsMessageConst.BARCODE_INPUT_ERROR);
			return null;
		}

		return brandNameCd;
	}

}
