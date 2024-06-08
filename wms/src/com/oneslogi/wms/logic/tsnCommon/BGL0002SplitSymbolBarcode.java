package com.oneslogi.wms.logic.tsnCommon;

import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.dto.tsnCommon.TSplitData;

public class BGL0002SplitSymbolBarcode extends AbstractWmsLogic {

	public TSplitData splitSymbolBarcode(String inputData, TSplitData tSplitData, ErrorStatus errSts) {

		//nullチェック
		if (inputData == null) {
			inputData = "";
		}
		// 入力チェック
		if (inputData.length() == 68) {
			// 入力情報が国産(68桁)の場合

			// 分割データ.工場コード
			tSplitData.setFactoryCd(inputData.substring(0, 4));
			// 分割データ.銘柄コード
			tSplitData.setItemCd(inputData.substring(5, 9));
			// 分割データ.SKUコード
			tSplitData.setSkuCd(inputData.substring(10, 18));
			// 分割データ.仕向地コード
			tSplitData.setDestinationCd(inputData.substring(19, 23));
			// 分割データ.製造記号
			tSplitData.setManufactureCd(inputData.substring(24, 28));
			// 分割データ.発注番号
			tSplitData.setorderNumber(inputData.substring(29, 35));
			// 分割データ.号機
			tSplitData.setmachineNumber(inputData.substring(36, 38));
			// 分割データ.生出番号
			tSplitData.setCreateNo(inputData.substring(39, 43));
			// 分割データ.製造年月日
			tSplitData.setManufactureDate(inputData.substring(44, 52));
			// 分割データ.日付時刻
			tSplitData.setDateTime(inputData.substring(53, 65));
			// 分割データ.流通識別
			tSplitData.setDistributionCd(inputData.substring(66, 67));
			// 分割データ.入庫キー
			tSplitData.setRcvKey(null);
			// 分割データ.デザイン区分
			tSplitData.setDesignCd(null);

		} else if (inputData.length() == 36) {
			// 入力情報が輸入(36桁)の場合

			// 分割データ.工場コード
			tSplitData.setFactoryCd(inputData.substring(0, 4));
			// 分割データ.銘柄コード
			tSplitData.setItemCd(inputData.substring(4,10));
			// 分割データ.SKUコード
			tSplitData.setSkuCd(null);
			// 分割データ.仕向地コード
			tSplitData.setDestinationCd(null);
			// 分割データ.製造記号
			tSplitData.setManufactureCd(null);
			// 分割データ.発注番号
			tSplitData.setorderNumber(null);
			// 分割データ.号機
			tSplitData.setmachineNumber(inputData.substring(10,12));
			// 分割データ.生出番号
			tSplitData.setCreateNo(inputData.substring(12,16));
			// 分割データ.製造年月日
			tSplitData.setManufactureDate(inputData.substring(16,24));
			// 分割データ.日付時刻
			tSplitData.setDateTime(null);
			// 分割データ.流通識別
			tSplitData.setDistributionCd(null);
			// 分割データ.入庫キー
			tSplitData.setRcvKey(inputData.substring(24,34));
			// 分割データ.デザイン区分
			tSplitData.setDesignCd(inputData.substring(34,36));

		} else {

			this.getErrorManager().add(new ErrorStatus(errSts.getStatusCd()),
					WmsMessageConst.SYMBOL_BARCODE_INPUT_ERROR);
			return null;

		}

		return tSplitData;

	}
}
