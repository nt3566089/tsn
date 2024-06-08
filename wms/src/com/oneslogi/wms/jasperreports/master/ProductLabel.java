package com.oneslogi.wms.jasperreports.master;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import net.sf.jasperreports.engine.JRDefaultScriptlet;
import net.sf.jasperreports.engine.JRScriptletException;

import com.oneslogi.base.util.CU;

public class ProductLabel extends JRDefaultScriptlet {

	private boolean isBarcodePrint;

	@Override
	public void beforeDetailEval() throws JRScriptletException {

		String strProductCdBar = (String)this.fieldsMap.get("productCdBar").getValue();
		String strProductLabelBarcode = (String) this.fieldsMap.get("productLabelBarcode").getValue();

		//各バーコード種別毎にExceptionを起こす要因をチェックし、不適当な値の場合バーコードを表示しない。
		isBarcodePrint = true;

		//バーコードデータがNullの場合はバーコード非表示
		if( CU.isNullOrEmpty(strProductCdBar) ){
			isBarcodePrint = false;
		}

		//JAN8,JAN13
		if( strProductLabelBarcode.equals("JAN8") || strProductLabelBarcode.equals("JAN13") ){
			//数字のみ
			Pattern p = Pattern.compile("^[0-9]+$");
			Matcher m = p.matcher(strProductCdBar);
			if( !m.find() ){
				isBarcodePrint = false;
			}

			//8or13桁
			if( !(strProductCdBar.length() == 8) && !(strProductCdBar.length() == 13) ){
				isBarcodePrint = false;
			}
		}

		//ITF
		if( strProductLabelBarcode.equals("ITF") ){
			//数字のみ
			Pattern p = Pattern.compile("^[0-9]+$");
			Matcher m = p.matcher(strProductCdBar);
			if( !m.find() ){
				isBarcodePrint = false;
			}

			//偶数桁のみ
			if( strProductCdBar.length() % 2 == 1 ){
				isBarcodePrint = false;
			}
		}

		//CODE39
		if( strProductLabelBarcode.equals("CODE39") ){
			//数字、アルファベット大文字、記号( ,$,/,+,%,-)
			Pattern p = Pattern.compile("^[0-9A-Z $/\\+%-]+$");
			Matcher m = p.matcher(strProductCdBar);
			if( !m.find() ){
				isBarcodePrint = false;
			}
		}

		//CODE128
		if( strProductLabelBarcode.equals("CODE128") ){
			//半角英数字記号
			Pattern p = Pattern.compile("^[!-~]+$");
			Matcher m = p.matcher(strProductCdBar);
			if( !m.find() ){
				isBarcodePrint = false;
			}
		}

		//NW7
		if( strProductLabelBarcode.equals("CODABAR") ){
			//数字、記号(-,$,/,.,+)、スタートストップキャラクタ(a～d)
			Pattern p = Pattern.compile("^[0-9a-dA-D$/\\+\\.-]+$");
			Matcher m = p.matcher(strProductCdBar);
			if( !m.find() ){
				isBarcodePrint = false;
			}
		}

		this.parametersMap.get("REPORT_BARCODE_PRINT").setValue(isBarcodePrint);
		super.beforeDetailEval();
	}

}
