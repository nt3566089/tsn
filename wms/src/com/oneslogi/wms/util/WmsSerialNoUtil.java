package com.oneslogi.wms.util;

import java.util.ArrayList;
import java.util.List;

import com.oneslogi.wms.WmsMessageConst;

public class WmsSerialNoUtil {

	// [#4255] シリアルNo.に30桁の数値を入れると致命的エラー発生 2018.04.27 kawana Start
	/** ナンバリングする時の最大桁数 */
	public static final int MAX_INCREMENT_LENGTH = 8;
	// [#4255] シリアルNo.に30桁の数値を入れると致命的エラー発生 2018.04.27 kawana End

	/**
	 * <h2>シリアルNoリスト作成(数量指定).</h2>
	 * <pre>
	 * 開始シリアルNo.から数量分のシリアルNo.を作成して返却する。
	 * </pre>
	 * @param startSerialNo 開始シリアルNo.
	 * @param serialCount シリアルNo.数量
	 * @return シリアルNoリスト作成の戻り値クラス
	 */
	public static CreateSerialNoListResult createSerialNoList(final String startSerialNo, final int serialCount) {

		return createSerialNoList(startSerialNo, null, serialCount, SerialNoRangeType.COUNT);
	}

	/**
	 * <h2>シリアルNoリスト作成(終了シリアルNo指定).</h2>
	 * <pre>
	 * 開始シリアルNo.から数量分のシリアルNo.を作成して返却する。
	 * </pre>
	 * @param startSerialNo 開始シリアルNo.
	 * @param endSerialNo 終了シリアルNo.
	 * @return シリアルNoリスト作成の戻り値クラス
	 */
	public static CreateSerialNoListResult createSerialNoList(final String startSerialNo, final String endSerialNo) {

		return createSerialNoList(startSerialNo, endSerialNo, 0, SerialNoRangeType.END_NO);
	}

	/**
	 * <h2>シリアルNoリスト作成.</h2>
	 * @return シリアルNoリスト作成の戻り値クラス
	 */
	private static CreateSerialNoListResult createSerialNoList(final String startSerialNo, final String endSerialNo, final int serialCount, SerialNoRangeType type) {

		CreateSerialNoListResult result = new CreateSerialNoListResult();

		int numIndex = getSerialNumberIndex(startSerialNo);
		if (numIndex < 0) {

			result.setError(true);
			result.setErrorMessageCd(WmsMessageConst.SERIAL_NO_RANGE_FORMAT_ERROR);

			return result;
		}

		int numLength = startSerialNo.length() - numIndex;

		// [#4255] シリアルNo.に30桁の数値を入れると致命的エラー発生 2018.04.27 kawana Start

		// intの範囲を超えてしまうため最大桁数を制御
		if (MAX_INCREMENT_LENGTH < numLength) {
			numIndex = startSerialNo.length() - MAX_INCREMENT_LENGTH;
			numLength = MAX_INCREMENT_LENGTH;
		}

		// [#4255] シリアルNo.に30桁の数値を入れると致命的エラー発生 2018.04.27 kawana End

		// 頭文字
		String frontStr = "";
		if (numIndex != 0) {
			frontStr = startSerialNo.substring(0, numIndex);
		}

		// 頭文字有 もしくは 0パディング有 の場合はシリアルNo.を整形する
		boolean doFormat = (0 < frontStr.length()) || startSerialNo.substring(numIndex, 1).equals("0");

		String numFormatStr = null;
		if (doFormat) {
			numFormatStr = new StringBuilder("%0").append(numLength).append("d").toString();
		}

		// 現在値
		int nowValue = Integer.parseInt(startSerialNo.substring(numIndex));
		// 追加数
		int loopCount = 0;

		switch (type) {
		case COUNT:
			// シリアルNo.追加数 ※ 最初の1個は追加済なので1減らす
			loopCount = serialCount - 1;
			break;
		case END_NO:
			// 終了シリアルNo.の数値桁数や頭文字を取得
			int endNumIndex = getSerialNumberIndex(endSerialNo);
			if (endNumIndex < 0) {

				result.setError(true);
				result.setErrorMessageCd(WmsMessageConst.SERIAL_NO_RANGE_FORMAT_ERROR);

				return result;
			}
			int endNumLength = endSerialNo.length() - endNumIndex;
			String endFrontStr = "";
			if (endNumIndex != 0) {
				endFrontStr = endSerialNo.substring(0, endNumIndex);
			}

			if (!frontStr.equals(endFrontStr)) {
				// 頭文字の相違

				result.setError(true);
				result.setErrorMessageCd(WmsMessageConst.SERIAL_NO_RANGE_FORMAT_ERROR);

				return result;
			}

			if (doFormat) {
				// 整形あり

				if (numLength != endNumLength) {
					// 数値桁数の相違

					result.setError(true);
					result.setErrorMessageCd(WmsMessageConst.SERIAL_NO_RANGE_FORMAT_ERROR);

					return result;
				}
			}

			// 終了値
			int endValue = Integer.parseInt(endSerialNo.substring(endNumIndex));

			loopCount = endValue - nowValue;

			if (loopCount < 0) {
				// 開始、終了値の逆転

				result.setError(true);
				result.setErrorMessageCd(WmsMessageConst.SERIAL_NO_RANGE_FORMAT_ERROR);

				return result;
			}

			break;
		}

		List<String> serialNoList = new ArrayList<String>();
		// 開始シリアルNo.を追加
		serialNoList.add(startSerialNo);

		for (int count = 1; count <= loopCount; count++) {

			// 現在値 + 1
			nowValue++;

			String serialNo;
			if (doFormat) {
				// 整形あり

				String nowValueStr = String.valueOf(nowValue);
				if (numLength < nowValueStr.length()) {
					// 数値桁数が収まらない

					result.setError(true);
					result.setErrorMessageCd(WmsMessageConst.SERIAL_NO_RANGE_FORMAT_ERROR);

					return result;
				}

				// 頭文字 + シリアルNo. (0パディング)
				serialNo = new StringBuilder().append(frontStr).append(String.format(numFormatStr, nowValue)).toString();
			} else {
				// 整形なし

				serialNo = String.valueOf(nowValue);
			}

			// 作成したシリアルNo.を追加
			serialNoList.add(serialNo);
		}

		result.setSerialNoList(serialNoList);
		return result;
	}

	/**
	 * <h2>シリアルNoリスト作成の戻り値クラス.</h2>
	 */
	public static class CreateSerialNoListResult {
		private List<String> serialNoList;
		private boolean isError = false;
		private String errorMessageCd;

		private CreateSerialNoListResult() {
		};

		public List<String> getSerialNoList() {
			return serialNoList;
		}

		public boolean isError() {
			return isError;
		}

		public String getErrorMessageCd() {
			return errorMessageCd;
		}

		private void setSerialNoList(List<String> serialNoList) {
			this.serialNoList = serialNoList;
		}

		private void setError(boolean isError) {
			this.isError = isError;
		}

		private void setErrorMessageCd(String errMessageCd) {
			this.errorMessageCd = errMessageCd;
		}
	}

	private enum SerialNoRangeType {
		COUNT,
		END_NO
	}

	/**
	 * <h2>SerialNoの数値部分の開始インデックスを取得。</h2>
	 */
	private static int getSerialNumberIndex(String serialNo) {

		int j = -1;
		for (int i = serialNo.length() - 1; i >= 0; i--) {
			if (Character.isDigit(serialNo.charAt(i))) {
				j = i;
				continue;
			}
			else {
				break;
			}
		}
		return j;
	}
}
