package com.oneslogi.wms.jasperreports.shipping;

import java.nio.charset.Charset;

import com.oneslogi.base.util.CU;

import net.sf.jasperreports.engine.JRDefaultScriptlet;
import net.sf.jasperreports.engine.JRScriptletException;

/**
 * 仕分明細書 JasperReports Scriptlet クラス
 */
public class SortingDtlList extends JRDefaultScriptlet {

	/** ページ内で1行目かどうか */
	private Boolean firstDetail = true;
	/** ページ毎の明細数 */
	int reportCountOfPage = 0;

	/**
	 * <h2>ページ初期化前処理。</h2>
	 * <pre>各ページが初期化される前に呼び出されるメソッド。</pre>
	 */
	@Override
	public void beforePageInit() throws JRScriptletException {

		firstDetail = true;

		Charset charset = Charset.forName("Shift_JIS");
		String customerNm = (String) this.fieldsMap.get("customerNm").getValue();

		// お得意様名に指定されている文字列のバイト数を取得
		int customerNmBytesLength = customerNm.getBytes(charset).length;
		if (customerNmBytesLength < 21) {
			this.parametersMap.get("customerNm1").setValue(customerNm);
			// 文字列が20バイトより大きい場合、枠内の1段目2段目表示用に文字列を20バイトずつ分割する。
			// かつ文字列が40バイト以下の場合は不足分をスペースで埋める
		} else if (customerNmBytesLength > 20 && customerNmBytesLength < 40) {
			String customerNmTemp = String.format("%-40s", customerNm);
			setCustomerNm1To2(customerNmTemp);

		} else if (customerNmBytesLength >= 40) {
			setCustomerNm1To2(customerNm);
		}

		super.beforePageInit();
	}

	/**
	 * <h2>引数に指定した文字列の分割処理。</h2>
	 * <pre>引数に指定した文字列を、帳票表示用に20バイトずつ分割する。</pre>
	 * 	@param str 文字列
	 */
	public void setCustomerNm1To2(String str) {
		Charset charset = Charset.forName("Shift_JIS");
		String customerNm1 = new String(str.getBytes(charset), 0, 20, charset);
		this.parametersMap.get("customerNm1").setValue(customerNm1);

		String customerNm2 = new String(str.getBytes(charset), 20, 20, charset);
		this.parametersMap.get("customerNm2").setValue(customerNm2);
	}

	/**
	 * <h2>レコード評価前処理。</h2>
	 * <pre>レポートの詳細セクションの各レコードが評価される前に呼び出されるメソッド。</pre>
	 */
	@Override
	public void beforeDetailEval() throws JRScriptletException {

		// 明細にあたるグループヘッダの評価時に、項目の表示/非表示を更新

		String location1Old = (String) this.fieldsMap.get("location1").getOldValue();
		String location1 = (String) this.fieldsMap.get("location1").getValue();

		// ページ毎の明細数をカウント
		if (firstDetail) {
			reportCountOfPage = 0;
		} else {
			reportCountOfPage++;
		}

		// ロケーション1が"DB"の場合、常にロケーション1を表示する。
		// ロケーション1が"DB"以外の場合、かつロケーション1が1つ前のレコードと同じ場合、ロケーション1を表示しない。
		// ※1行目の場合は常にロケーション1を表示する。
		if (firstDetail) {
			this.parametersMap.get("REPORT_VISIBLED_LOCATION1").setValue(true);
		} else if (CU.equals(location1, "DB")) {
			this.parametersMap.get("REPORT_VISIBLED_LOCATION1").setValue(true);
		} else if (!CU.equals(location1, location1Old)) {
			this.parametersMap.get("REPORT_VISIBLED_LOCATION1").setValue(true);
		} else {
			this.parametersMap.get("REPORT_VISIBLED_LOCATION1").setValue(false);
		}

		//  ロケーション1が"DB"以外の場合、かつロケーション1が1つ前のレコードと同じ場合、罫線を表示しない。
		//　ロケーション1が"DB"の場合、かつロケーション1が1つ前のレコードと同じ場合、罫線を表示する。
		// ※1行目の場合は常に罫線を表示しない。
		if (firstDetail) {
			this.parametersMap.get("REPORT_VISIBLED_LINE").setValue(false);
		} else if ((reportCountOfPage) % 5 == 0) {
			this.parametersMap.get("REPORT_VISIBLED_LINE").setValue(false);
		} else if (CU.equals(location1, "DB")) {
			this.parametersMap.get("REPORT_VISIBLED_LINE").setValue(true);
		} else if (CU.equals(location1, location1Old)) {
			this.parametersMap.get("REPORT_VISIBLED_LINE").setValue(false);
		} else {
			this.parametersMap.get("REPORT_VISIBLED_LINE").setValue(true);
		}

		firstDetail = false;

		super.beforeDetailEval();

	}

}
