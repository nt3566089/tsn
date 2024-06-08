package com.oneslogi.wms.logic.tsnCommon;

import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.dto.tsnCommon.TSplitData;

public class BGL0004SplitMakerBarcode extends AbstractWmsLogic {

	public TSplitData splitMakerBarcode(String inputData, TSplitData tSplitData, ErrorStatus errSts) {

		//入力情報が40桁の場合
		if(inputData.length()== 40) {

			//分割データ.ITFコード
			tSplitData.setItfCd(inputData.substring(2, 16));
			//分割データ.barcode_valiant
			tSplitData.setBarcodeValiant(inputData.substring(18, 20));
			//分割データ.製造年月日
			tSplitData.setManufactureDate("20" + inputData.substring(22, 28));
			//分割データ.製造センターNo
			tSplitData.setManufactureCenterNo(inputData.substring(30, 32));
			//分割データ.ケースパッカーNo
			tSplitData.setCasePackNo(inputData.substring(32, 34));
			//分割データ.ケースパッキング時間
			tSplitData.setCasePackTime(inputData.substring(34, 40));
			//分割データ.工場コード
			tSplitData.setFactoryCd(null);
			//分割データ.機械コード
			tSplitData.setMachineCd(null);
			//分割データ.製造時間
			tSplitData.setMakeTime(null);


		//入力情報が32桁の場合
		} else if (inputData.length() == 32) {

			//分割データ.ITFバーコード
			tSplitData.setItfCd(inputData.substring(0, 14));
			//分割データ.工場コード
			tSplitData.setFactoryCd(inputData.substring(14, 16));
			//分割データ.機械コード
			tSplitData.setMachineCd(inputData.substring(16, 18));
			//分割データ.製造年月日
			tSplitData.setManufactureDate("20" + inputData.substring(18, 24));
			//分割データ.製造時間
			tSplitData.setMakeTime(inputData.substring(24, 30));
			//分割データ.barcode_valiant
			tSplitData.setBarcodeValiant(inputData.substring(30, 32));
			//分割データ.製造センターNo
			tSplitData.setManufactureCenterNo(null);
			//分割データ.ケースパッカーNo
			tSplitData.setCasePackNo(null);
			//分割データ.ケースパッキング時間
			tSplitData.setCasePackTime(null);

			//上記以外
		} else {

			this.getErrorManager().add(new ErrorStatus(errSts.getStatusCd()),
					WmsMessageConst.MAKER_BARCODE_INPUT_ERROR);
			return null;

		}

		return tSplitData;

	}

}
