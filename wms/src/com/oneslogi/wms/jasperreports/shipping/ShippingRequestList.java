package com.oneslogi.wms.jasperreports.shipping;

import com.oneslogi.base.util.CU;

import net.sf.jasperreports.engine.JRDefaultScriptlet;
import net.sf.jasperreports.engine.JRScriptletException;

/**
 * 出庫依頼書 JasperReports Scriptlet クラス
 */
public class ShippingRequestList extends JRDefaultScriptlet {

	/** ページ内で1行目かどうか */
	private Boolean firstDetail = true;

	/**
	 * <h2>ページ初期化前処理。</h2>
	 * <pre>各ページが初期化される前に呼び出されるメソッド。</pre>
	 */
	@Override
	public void beforePageInit() throws JRScriptletException {
		firstDetail = true;

		super.beforePageInit();
	}

	/**
	 * <h2>レコード評価前処理。</h2>
	 * <pre>レポートの詳細セクションの各レコードが評価される前に呼び出されるメソッド。</pre>
	 */
	@Override
	public void beforeDetailEval() throws JRScriptletException {

		String planItemName = (String) this.fieldsMap.get("planItemName").getValue();
		String planItemNameOld = (String) this.fieldsMap.get("planItemName").getOldValue();

		// 銘柄CDが1つ前のレコードと同じ場合、銘柄名称を表示しない。
		if (firstDetail || !CU.equals(planItemName, planItemNameOld)) {
			this.parametersMap.get("REPORT_VISIBLED_DETAIL_ITEM_NAME").setValue(true);
		} else {
			this.parametersMap.get("REPORT_VISIBLED_DETAIL_ITEM_NAME").setValue(false);
		}

		firstDetail = false;

		super.beforeDetailEval();
	}

}
