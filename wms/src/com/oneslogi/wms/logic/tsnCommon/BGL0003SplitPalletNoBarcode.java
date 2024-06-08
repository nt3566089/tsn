package com.oneslogi.wms.logic.tsnCommon;

import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

public class BGL0003SplitPalletNoBarcode extends AbstractWmsLogic {

	public String splitPalletNoBarcode(String inputData, ErrorStatus errSts) {

		//nullチェック
		if (inputData == null) {
			inputData = "";
		}

		String palletNo;
		
		//入力情報が保税(12桁かつ先頭２桁が”PL”)の場合
		if (inputData.length() == 12 && (inputData.substring(0, 2).equals("PL"))) {

			palletNo = inputData.substring(2, 12);

			//入力情報が国産(10桁)の場合
		} else if (inputData.length() == 10) {

			palletNo = inputData;

			//上記以外
		} else {

			this.getErrorManager().add(errSts, WmsMessageConst.PALLET_NO_INPUT_ERROR);
			return null;

		}

		return palletNo;

	}

}
