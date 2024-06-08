package com.oneslogi.wms.dto.ecorder;
/*
 *
 */
public class EcShinppingTagDataOutPutInvoceDataCountDto {

	// ヤマト送り状データ件数
	private int yamatoInvoceDataCount;
	// 佐川送り状データ件数
	private int sagawaInvoceDataCount;
    // ゆうパック送り状データ件数
	private int yupkInvoceDataCount;
	// ヤマト送り状CSVファイル名称
	private String yamatoCsvFileName;
	// 佐川送り状CSVファイル名称
	private String sagawaCsvFileName;
	//  ゆうパックCSVファイル名称
	private String yupkCsvFileName;
    // 配送コースに紐付く送り状のデータ定義が存在するか
	private boolean allCarrierSlipIdIsOK;
	
	// [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/07/29  Start
	// 送り状データ種別件数
	private int tagDataTypeCount;

	/**
	 * @return the tagDataTypeCount
	 */
	public int getTagDataTypeCount() {
		return tagDataTypeCount;
	}
	/**
	 * @param tagDataTypeCount the tagDataTypeCount to set
	 */
	public void setTagDataTypeCount(int tagDataTypeCount) {
		this.tagDataTypeCount = tagDataTypeCount;
	}
	// [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/07/29  End

	public int getYamatoInvoceDataCount() {
		return yamatoInvoceDataCount;
	}
	public void setYamatoInvoceDataCount(int yamatoInvoceDataCount) {
		this.yamatoInvoceDataCount = yamatoInvoceDataCount;
	}
	public int getSagawaInvoceDataCount() {
		return sagawaInvoceDataCount;
	}
	public void setSagawaInvoceDataCount(int sagawaInvoceDataCount) {
		this.sagawaInvoceDataCount = sagawaInvoceDataCount;
	}
	public int getYupkInvoceDataCount() {
		return yupkInvoceDataCount;
	}
	public void setYupkInvoceDataCount(int yupkInvoceDataCount) {
		this.yupkInvoceDataCount = yupkInvoceDataCount;
	}
	public String getYamatoCsvFileName() {
		return yamatoCsvFileName;
	}
	public void setYamatoCsvFileName(String yamatoCsvFileName) {
		this.yamatoCsvFileName = yamatoCsvFileName;
	}
	public String getSagawaCsvFileName() {
		return sagawaCsvFileName;
	}
	public void setSagawaCsvFileName(String sagawaCsvFileName) {
		this.sagawaCsvFileName = sagawaCsvFileName;
	}
	public String getYupkCsvFileName() {
		return yupkCsvFileName;
	}
	public void setYupkCsvFileName(String yupkCsvFileName) {
		this.yupkCsvFileName = yupkCsvFileName;
	}
	public boolean isAllCarrierSlipIdIsOK() {
		return allCarrierSlipIdIsOK;
	}
	public void setAllCarrierSlipIdIsOK(boolean allCarrierSlipIdIsOK) {
		this.allCarrierSlipIdIsOK = allCarrierSlipIdIsOK;
	}
}
