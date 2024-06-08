package com.oneslogi.wms.jasperreports.shipping;

import com.oneslogi.base.util.CU;

import net.sf.jasperreports.engine.JRDefaultScriptlet;
import net.sf.jasperreports.engine.JRScriptletException;

/**
 * 積込リスト JasperReports Scriptlet クラス
 */
public class ShippingLoadingList extends JRDefaultScriptlet {

	/** 1ページあたりの明細行数 */
	private static final Integer MAX_DETAI_ONE_PAGE = 18;

	/** グループ内での行番号 */
	private Integer groupDetailNo = 0;

	/**
	 * <h2>グループ評価前処理。</h2>
	 * <pre>パラメータで指定されたグループが初期化される前に呼び出されるメソッド 。</pre>
	 */
	@Override
	public void beforeGroupInit(String groupName) throws JRScriptletException {
		switch (groupName) {
		case "trsoListKeyAndEtc":
			// ページヘッダにあたるグループヘッダの評価時に、グループ内での行番号を初期化

			groupDetailNo = 0;
			break;

		case "plNoAndLofInfo":
			// 明細にあたるグループヘッダの評価時に、項目の表示/非表示を更新

			String plNo = (String) this.fieldsMap.get("plNo").getValue();
			String plNoOld = (String) this.fieldsMap.get("plNo").getOldValue();

			// グループ内での行番号+1
			groupDetailNo++;

			// 1ページあたりの明細行数を超えた場合、グループ内での行番号を初期化
			if (groupDetailNo > MAX_DETAI_ONE_PAGE)
				groupDetailNo = 0;

			// P/LNoが1つ前のレコードと同じ場合、P/LNoを表示しない。
			// ※1行目の場合は常にP/LNoを表示する。
			if (groupDetailNo == 0 || !CU.equals(plNo, plNoOld)) {
				this.parametersMap.get("REPORT_VISIBLED_PL_NO").setValue(true);
			} else {
				this.parametersMap.get("REPORT_VISIBLED_PL_NO").setValue(false);
			}

			// P/LNoが1つ前のレコードと異なる場合、罫線を表示しない。
			// ※1行目の場合は常に罫線を表示しない。
			if (groupDetailNo == 0 || CU.equals(plNo, plNoOld)) {
				this.parametersMap.get("REPORT_VISIBLED_LINE").setValue(false);
			} else {
				this.parametersMap.get("REPORT_VISIBLED_LINE").setValue(true);
			}

			break;
		}

		super.beforeGroupInit(groupName);
	}

}
