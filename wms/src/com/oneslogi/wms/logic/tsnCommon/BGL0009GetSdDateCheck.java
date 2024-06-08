package com.oneslogi.wms.logic.tsnCommon;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

public class BGL0009GetSdDateCheck extends AbstractWmsLogic {

	public String getSdDateCheck(String inputData, String editDate, ErrorStatus errSts) {

		//変数に値を設定する。
		editDate = null;

		if (inputData.length() == 6) {
			//入力情報が6桁の場合

			editDate = "20" + inputData.substring(0, 2) + "/" + inputData.substring(2, 4) + "/"
					+ inputData.substring(4, 6);

			try {
				SimpleDateFormat sdFormat = new SimpleDateFormat("yyyy/MM/dd");
				java.util.Date date = sdFormat.parse(editDate);
				System.out.println("Date型 = " + date);

			} catch (ParseException e) {
				this.getErrorManager().add(errSts, WmsMessageConst.DATE_INPUT_ERROR);
				e.printStackTrace();

				return null;
			}


		} else if (inputData.length() != 6) {
			//入力情報が6桁以外の場合

			this.getErrorManager().add(errSts, WmsMessageConst.DATE_INPUT_ERROR);
			return null;
		}


		return editDate;
	}

}
