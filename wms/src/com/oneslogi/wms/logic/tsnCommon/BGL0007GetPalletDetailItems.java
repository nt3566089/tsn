package com.oneslogi.wms.logic.tsnCommon;

import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.dto.tsnCommon.TSplitData;

public class BGL0007GetPalletDetailItems extends AbstractWmsLogic {

	public TSplitData getPalletDetailItems(String inputData, TSplitData tSplitData, ErrorStatus errSts) {

		//nullチェック
		if (inputData == null) {
			inputData = "";
		}

		if (inputData.length() == 14) {
			//入力情報が保税(14桁)の場合

			tSplitData.setFactoryCd(inputData.substring(0, 4)); //工場コード				
			tSplitData.setPalletLoadingKey(inputData.substring(4, 14)); //パレット積み付けキー	
			tSplitData.setManufactureDate(null); //製造年月日	
			tSplitData.setSerialNumber(null); //通番	

		} else if (inputData.length() == 16) {
			//入力情報が倉庫(16桁)の場合

			tSplitData.setFactoryCd(inputData.substring(0, 4)); //工場コード
			tSplitData.setManufactureDate(inputData.substring(4, 12)); //パレット積み付けキー	
			tSplitData.setSerialNumber(inputData.substring(12, 16)); //製造年月日	
			tSplitData.setPalletLoadingKey(null); //通番	

		} else {
			//上記以外
			this.getErrorManager().add(new ErrorStatus(errSts.getStatusCd()),
					WmsMessageConst.SYMBOL_BARCODE_INPUT_ERROR);
			return null;

		}

		return tSplitData;

	}

}
