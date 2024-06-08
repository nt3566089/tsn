package com.oneslogi.wms.logic.common;

import com.oneslogi.wms.dto.common.DataInputDto;

/**
 * データ取り込みログ共通ロジッククラス
 */
public class DataInputCommonLogic extends DataInputLogic {

	/**
	 * <h2>開始ログの出力処理を行う。</h2>
	 * <pre>
	 * 開始ログを出力する。
	 * </pre>
	 * @param pgmCd プログラムCD
	 */
	public void startLog(String pgmCd) {
		super.startLog(pgmCd);
	}

	/**
	 * <h2>終了ログの出力処理を行う。</h2>
	 * <pre>
	 * 終了ログを出力する。
	 * </pre>
	 * @param dataInputDto データ入力DTO
	 */
	public void endLog(DataInputDto dataInputDto) {
		super.endLog(dataInputDto);
	}
}
