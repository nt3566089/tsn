package com.oneslogi.wms.util;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.oneslogi.base.util.CU;
import com.oneslogi.wms.core.WCC;

public class WmsCommonUtil {

	/**
	 * 数量、入数からケース数を取得する。
	 * 入数が0の場合は、ケース数は0となる。
	 *
	 * @param num 数量
	 * @param unitNum 入数
	 * @return ケース数
	 */
	public static BigDecimal getCaseNum(BigDecimal num, long unitNum) {

		if (unitNum < 1) {
			return WCC.ZERO;
		}

		return (WCC.divide(num, unitNum));
	}

	/**
	 * 数量、入数からピース数を取得する。
	 * 入数が0の場合は、ピース数は数量と同じ数となる。
	 *
	 * @param num 数量
	 * @param unitNum 入数
	 * @return ピース数
	 */
	public static BigDecimal getPieceNum(BigDecimal num, long unitNum) {

		if (unitNum < 1) {
			return num;
		}

		return (WCC.remainder(num, unitNum));
	}

	// [C-CWMS-0058] 荷札出力対応 2016.08.12 kawana Start

	/**
	 * 右から指定された文字数を取り出す
	 *
	 * @param str 文字列
	 * @param length 文字数
	 * @return 指定文字数の文字列
	 */
	public static String subStringRight(String str, int length) {

		if (str == null || length < 1) {
			return str;
		}

		if (str.length() <= length) {
			return str;
		}

		return str.substring(str.length() - length);
	}

	/**
	 * 文字長で分割(byte数ではないので注意)
	 * @param str 分割文字列
	 * @param length 分割文字長
	 * @return 分割した文字列リスト
	 */
	public static String[] splitLen(String str, int length) {

		if (CU.isNullOrEmpty(str) || length < 1) {
			return new String[] { str };
		}

		List<String> strs = new ArrayList<String>();

		int s = 0;
		int e = length;

		while (e < str.length()) {
			strs.add(str.substring(s, e));
			s = s + length;
			e = e + length;
		}

		strs.add(str.substring(s));

		return (String[]) strs.toArray(new String[strs.size()]);
	}

	// [C-CWMS-0058] 荷札出力対応 2016.08.12 kawana End

	// [#3272] センタ別ロケール対応(帳票用Util使用をWCUに変更) 2018.01.17 kawana Start

	/**
	 * <h2>日付文字列８桁を「yyyy/MM/dd」に整形■ヤマトcsv用■.</h2>
	 * @param value 日付文字列８桁
	 * @return 「yyyy/MM/dd」に整形した日付文字列
	 */
	public static String stringToDateString(String value) {

		if (value == null || value.length() != 8) {
			return value;
		}

		if (value == null || value.length() < 8) {
			return value;
		}
		// 年
		String year = value.substring(0, 4);
		// 月
		String month = value.substring(4, 6);
		// 日
		String day = value.substring(6, 8);
		// YYYY/MM/DD形式
		String dateString = year + "/" + month + "/" + day;

		return dateString;
	}

	// [#3272] センタ別ロケール対応(帳票用Util使用をWCUに変更) 2018.01.17 kawana End

	// [#3558][Ver3.0] 小数有無チェック処理不正 2018.03.07 honma Add Start
	/**
	 * <h2>正規表現チェック。</h2>
	 * @param patternStr 正規表現のコンテンツ
	 * @param inputStr ジャッジのコンテンツ
	 * @return boolean チェック結果
	 * */
	public static boolean checkPatternInput(String patternStr, String inputStr) {
		Pattern pattern = Pattern.compile(patternStr);
		Matcher matcher = pattern.matcher(inputStr);
		return matcher.matches();
	}
	// [#3558][Ver3.0] 小数有無チェック処理不正 2018.03.07 honma Add End

	// [#6743][v3.1] 一括取込時に「20191131」(日付不正)がエラーにならずに「20191201」で登録される問題を修正 2019.10.29 kawana Start

	/**
	 * <h2>日付文字列(8桁)の文字チェック.</h2>
	 * @param dateStr 日付文字列(8桁)
	 * @return true:日付8桁が正常 、false:日付不正
	 */
	public static boolean checkDateStr(String dateStr) {

		try {
			// 日付変換してみる

			Date checkDate = CU.stringToDate(dateStr);
			String checkDateStr = CU.dateToString(checkDate);

			// ※ stringToDateのみのチェックだと適当な数字8桁でもdateクラスに変換されてしまう。
			// ※ 逆変換して正しい日付が取得できているかを確認している。
			if (!dateStr.equals(checkDateStr)) {
				return false;
			}
		} catch (Exception e) {
			// エラー
			return false;
		}

		return true;
	}

	// [#6743][v3.1] 一括取込時に「20191131」(日付不正)がエラーにならずに「20191201」で登録される問題を修正 2019.10.29 kawana End

	// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana Start
	/**
	 * <h2>String → Long 型変換.</h2>
	 * <pre>
	 * nullの場合はnullを返す
	 * </pre>
	 * @param str 文字列
	 * @return null または Longオブジェクト
	 */
	public static Long stringToLong(String str) {

		if (CU.isNullOrEmpty(str)) {
			return null;
		}

		return Long.valueOf(str);
	}

	/**
	 * <h2>String → BigDecimal 型変換.</h2>
	 * <pre>
	 * nullの場合はnullを返す
	 * </pre>
	 * @param str 文字列
	 * @return null または BigDecimalオブジェクト
	 */
	public static BigDecimal stringToBigDecimal(String str) {

		if (CU.isNullOrEmpty(str)) {
			return null;
		}

		return WCC.toBigDecimal(str);
	}
	// [#6745][v3.1] 初期データ取込で使用する一時テーブルの項目を全て長い文字列に変更 2019.10.31 kawana End

	// [#6756][労務管理] ＷＭＳ出退勤・休憩入力機能修正 2019.11.07 tanaka Start
	/**
	 * 指定された文字列が時刻型かどうかを返します。
	 *
	 * @param value 文字列
	 * @return true:正常, false:異常
	 */
	public static boolean isTimeType(String value) {
	  if ( value == null || "".equals(value) ) {
		  return false;
	  }
	  Pattern p = Pattern.compile("^([0-1][0-9]|[2][0-3])[0-5][0-9]$");
	  Matcher m = p.matcher(value);
	  if ( !m.find() ) {
		  return false;
	  }
	  return true;
	}

	/**
	 * <h2>時刻文字列４桁を「HH:mm」(24時間表記)に整形■HT出退勤出力用■</h2>
	 * @param value 時刻文字列４桁
	 * @return 「HH:mm」に整形した時刻文字列
	 */
	public static String stringToTimeString(String value) {

		if (value == null || value.length() != 4) {
			return value;
		}

		if (value == null || value.length() < 4) {
			return value;
		}
		// 時
		String hour_of_day = value.substring(0, 2);
		// 分
		String minute = value.substring(2);
		// HH:mm形式
		String timeString = hour_of_day + ":" + minute;

		return timeString;
	}
	// [#6756][労務管理] ＷＭＳ出退勤・休憩入力機能修正 2019.11.07 tanaka End
}
