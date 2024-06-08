package com.oneslogi.wms.jasperreports.inventory;

import net.sf.jasperreports.engine.JRDefaultScriptlet;
import net.sf.jasperreports.engine.JRScriptletException;

import com.oneslogi.base.util.CU;

public class InventoryDiffList extends JRDefaultScriptlet {

	private boolean isJanCdGroupFirstLine;
	private boolean isPageFirstLine;

	@Override
	public void beforePageInit() throws JRScriptletException {
		isJanCdGroupFirstLine = true;
		isPageFirstLine = true;
		super.beforePageInit();
	}

	@Override
	public void beforeGroupInit(String groupName) throws JRScriptletException {
		if (CU.equals(groupName, "productCd")) {
			isJanCdGroupFirstLine = true;
		}
		super.beforeGroupInit(groupName);
	}
	@Override
	public void beforeDetailEval() throws JRScriptletException {
		if (isPageFirstLine) {
			if (CU.isNullOrEmpty((String) this.fieldsMap.get("janCd").getValue())) {
				this.parametersMap.get("REPORT_SUPPRESS_BARCODE").setValue(false);
			} else {
				this.parametersMap.get("REPORT_SUPPRESS_BARCODE").setValue(true);
			}
			this.parametersMap.get("REPORT_SUPPRESS_STOCK_TYPE").setValue(true);
			this.parametersMap.get("REPORT_SUPPRESS_DEPOSIT").setValue(true);
			isPageFirstLine = false;
		}else{
			if (isJanCdGroupFirstLine) {
				if (CU.isNullOrEmpty((String) this.fieldsMap.get("janCd").getValue())) {
					this.parametersMap.get("REPORT_SUPPRESS_BARCODE").setValue(false);
				}else{
					this.parametersMap.get("REPORT_SUPPRESS_BARCODE").setValue(true);
				}
				this.parametersMap.get("REPORT_SUPPRESS_STOCK_TYPE").setValue(true);
				this.parametersMap.get("REPORT_SUPPRESS_DEPOSIT").setValue(true);
			}else{
				this.parametersMap.get("REPORT_SUPPRESS_BARCODE").setValue(false);
				if (CU.equals((String) this.fieldsMap.get("stockTypeCd").getOldValue(), (String) this.fieldsMap.get("stockTypeCd").getValue())) {
					this.parametersMap.get("REPORT_SUPPRESS_STOCK_TYPE").setValue(false);
				} else {
					this.parametersMap.get("REPORT_SUPPRESS_STOCK_TYPE").setValue(true);
				}
				if (CU.equals((String) this.fieldsMap.get("depositCd").getOldValue(), (String) this.fieldsMap.get("depositCd").getValue())) {
					this.parametersMap.get("REPORT_SUPPRESS_DEPOSIT").setValue(false);
				} else {
					this.parametersMap.get("REPORT_SUPPRESS_DEPOSIT").setValue(true);
				}
			}
		}

		isJanCdGroupFirstLine = false;
		super.beforeDetailEval();
	}

}
