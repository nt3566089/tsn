package com.oneslogi.wms.jasperreports.inventory;

import net.sf.jasperreports.engine.JRDefaultScriptlet;
import net.sf.jasperreports.engine.JRScriptletException;

import com.oneslogi.base.util.CU;

public class InventoryWorkList extends JRDefaultScriptlet {

	private boolean isLocationCdGroupFirstLine;
	// [ON推-品向-503] 罫線の調整 2014.12.26 Yokosuka Start
	private boolean isPageFirstLine;
	// [ON推-品向-503] 罫線の調整 2014.12.26 Yokosuka End

	@Override
	public void beforePageInit() throws JRScriptletException {
		isLocationCdGroupFirstLine = true;
		// [ON推-品向-503] 罫線の調整 2014.12.26 Yokosuka Start
		isPageFirstLine = true;
		// [ON推-品向-503] 罫線の調整 2014.12.26 Yokosuka End
		super.beforePageInit();
	}

	@Override
	public void beforeGroupInit(String groupName) throws JRScriptletException {
		if (CU.equals(groupName, "zoneCd")) {
			isLocationCdGroupFirstLine = true;
		}
		super.beforeGroupInit(groupName);
	}

	@Override
	public void beforeDetailEval() throws JRScriptletException {
		// [ON推-品向-503] 罫線の調整 2014.12.26 Yokosuka Start
		if (isPageFirstLine) {
			// [ON推-品向-503] 罫線の調整 2015.01.05 Yokosuka Start
			//this.parametersMap.get("REPORT_SUPPRESS_BARCODE").setValue(false);
			this.parametersMap.get("REPORT_SUPPRESS_BARCODE").setValue(true);
			// [ON推-品向-503] 罫線の調整 2015.01.05 Yokosuka End
			this.parametersMap.get("REPORT_SUPPRESS_FIRST").setValue(false);
			this.parametersMap.get("REPORT_SUPPRESS_LINE").setValue(false);
			// [ON推-品向-503] 罫線の調整 2015.01.05 Yokosuka Start
			this.parametersMap.get("REPORT_SUPPRESS_BARCODE_LINE").setValue(false);
			// [ON推-品向-503] 罫線の調整 2015.01.05 Yokosuka End
			this.parametersMap.get("REPORT_SUPPRESS_PROD").setValue(true);
			if (CU.isNullOrEmpty((String) this.fieldsMap.get("janCd").getValue())) {
				this.parametersMap.get("REPORT_SUPPRESS_BAR_JAN").setValue(false);
			} else {
				this.parametersMap.get("REPORT_SUPPRESS_BAR_JAN").setValue(true);
			}
			this.parametersMap.get("REPORT_SUPPRESS_STOCK_TYPE").setValue(true);
			this.parametersMap.get("REPORT_SUPPRESS_DEPOSIT").setValue(true);

			isPageFirstLine = false;
		}else{
			this.parametersMap.get("REPORT_SUPPRESS_FIRST").setValue(true);
		// [ON推-品向-503] 罫線の調整 2014.12.26 Yokosuka End
			if (isLocationCdGroupFirstLine) {
				this.parametersMap.get("REPORT_SUPPRESS_BARCODE").setValue(true);
				this.parametersMap.get("REPORT_SUPPRESS_LINE").setValue(false);
				// [ON推-品向-503] 罫線の調整 2015.01.05 Yokosuka Start
				this.parametersMap.get("REPORT_SUPPRESS_BARCODE_LINE").setValue(false);
				// [ON推-品向-503] 罫線の調整 2015.01.05 Yokosuka End
				this.parametersMap.get("REPORT_SUPPRESS_PROD").setValue(true);
				if (CU.isNullOrEmpty((String) this.fieldsMap.get("janCd").getValue())) {
					this.parametersMap.get("REPORT_SUPPRESS_BAR_JAN").setValue(false);
				} else {
					this.parametersMap.get("REPORT_SUPPRESS_BAR_JAN").setValue(true);
				}
				this.parametersMap.get("REPORT_SUPPRESS_STOCK_TYPE").setValue(true);
				this.parametersMap.get("REPORT_SUPPRESS_DEPOSIT").setValue(true);
			} else {
				if (CU.equals((String) this.fieldsMap.get("locationCd").getOldValue(), (String) this.fieldsMap.get("locationCd").getValue())) {
					this.parametersMap.get("REPORT_SUPPRESS_BARCODE").setValue(false);
					this.parametersMap.get("REPORT_SUPPRESS_LINE").setValue(true);
					// [ON推-品向-503] 罫線の調整 2015.01.05 Yokosuka Start
					this.parametersMap.get("REPORT_SUPPRESS_BARCODE_LINE").setValue(false);
					// [ON推-品向-503] 罫線の調整 2015.01.05 Yokosuka End
					if (CU.equals((String) this.fieldsMap.get("productCd").getOldValue(), (String) this.fieldsMap.get("productCd").getValue())) {
						this.parametersMap.get("REPORT_SUPPRESS_PROD").setValue(false);
					} else {
						this.parametersMap.get("REPORT_SUPPRESS_PROD").setValue(true);
					}

					if (CU.isNullOrEmpty((String) this.fieldsMap.get("janCd").getValue())) {
						this.parametersMap.get("REPORT_SUPPRESS_BAR_JAN").setValue(false);
					} else {
						if (CU.equals((String) this.fieldsMap.get("janCd").getOldValue(), (String) this.fieldsMap.get("janCd").getValue())) {
							this.parametersMap.get("REPORT_SUPPRESS_BAR_JAN").setValue(false);
						} else {
							if (CU.isNullOrEmpty((String) this.fieldsMap.get("janCd").getValue())) {
								this.parametersMap.get("REPORT_SUPPRESS_BAR_JAN").setValue(false);
							} else {
								this.parametersMap.get("REPORT_SUPPRESS_BAR_JAN").setValue(true);
							}
						}
					}

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

				} else {
					this.parametersMap.get("REPORT_SUPPRESS_BARCODE").setValue(true);
					this.parametersMap.get("REPORT_SUPPRESS_LINE").setValue(false);
					// [ON推-品向-503] 罫線の調整 2015.01.05 Yokosuka Start
					this.parametersMap.get("REPORT_SUPPRESS_BARCODE_LINE").setValue(true);
					// [ON推-品向-503] 罫線の調整 2015.01.05 Yokosuka End
					this.parametersMap.get("REPORT_SUPPRESS_PROD").setValue(true);
					if (CU.isNullOrEmpty((String) this.fieldsMap.get("janCd").getValue())) {
						this.parametersMap.get("REPORT_SUPPRESS_BAR_JAN").setValue(false);
					} else {
						this.parametersMap.get("REPORT_SUPPRESS_BAR_JAN").setValue(true);
					}
					this.parametersMap.get("REPORT_SUPPRESS_STOCK_TYPE").setValue(true);
					this.parametersMap.get("REPORT_SUPPRESS_DEPOSIT").setValue(true);
				}
			}
		// [ON推-品向-503] 罫線の調整 2014.12.26 Yokosuka Start
		}
		// [ON推-品向-503] 罫線の調整 2014.12.26 Yokosuka End
		isLocationCdGroupFirstLine = false;
		super.beforeDetailEval();
	}

}
