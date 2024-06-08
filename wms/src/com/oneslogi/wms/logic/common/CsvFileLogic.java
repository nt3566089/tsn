package com.oneslogi.wms.logic.common;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.ServletContext;

import org.supercsv.io.CsvListWriter;
import org.supercsv.io.ICsvListWriter;
import org.supercsv.prefs.CsvPreference;

import com.oneslogi.base.util.FileUtil;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * CSVファイル入出力ロジック
 */
public class CsvFileLogic extends AbstractWmsLogic {

	/** ファイル拡張子 */
	public static final String EXT = ".csv";

	/**
	 * <h2>一時ファイルに書込.</h2>
	 * <pre>
	 * サーバの一時フォルダにファイルを作成し書き込む。
	 * </pre>
	 * @param writeData ファイル出力データ
	 * @param charsets ファイル出力時の文字コード
	 * @return 一時ファイルのファイル名
	 * @throws IOException ファイル出力例外
	 */
	public String writeTempFileFromListMap(ArrayList<LinkedHashMap<String, String>> writeData, String charsets) throws IOException {

		// 1行目のデータから最大の列番号を設定

		int lastColumnNo = 0;
		if (!writeData.isEmpty()) {
			for (String key : writeData.get(0).keySet()) {

				int columnNo = 0;
				try {
					columnNo = Integer.valueOf(key);
				} catch (Exception e) {
					// 不正な値は無視
				}

				if (lastColumnNo < columnNo) {
					lastColumnNo = columnNo;
				}
			}
		}

		// Mapをリストに変換

		List<List<String>> convertWriteData = new ArrayList<List<String>>();

		for (Map<String, String> map : writeData) {

			List<String> rowData = new ArrayList<String>();

			for (int i = 1; i <= lastColumnNo; i++) {
				rowData.add(map.get(String.valueOf(i)));
			}

			convertWriteData.add(rowData);
		}

		File writeFile = writeTempFile(convertWriteData, charsets);

		return writeFile.getName();
	}

	// [ON推-品向-792] 文字コードをマスタから設定 2015.04.22 kawana Start
	/**
	 * <h2>一時ファイルに書込.</h2>
	 * <pre>
	 * サーバの一時フォルダにファイルを作成し書き込む。
	 * </pre>
	 * @param writeData ファイル出力データ
	 * @param charsets ファイル出力時の文字コード
	 * @return File 一時ファイル
	 * @throws IOException ファイル出力例外
	 */
	public File writeTempFile(List<List<String>> writeData, String charsets) throws IOException {
		// [ON推-品向-792] 文字コードをマスタから設定 2015.04.22 kawana End

		//プロパティファイルの内容取得
		ServletContext context = this.getServletContext();

		// [ON推-品向-470] ファイル出力の処理を共通処理の流れに踏襲(Linuxで動作しない問題を改修) 2014.12.24 kawana Start

		String tempFileNm = null;
		// [#5107][v3.1] バッチ起動対応 2018.11.09 kawana Start
		File tempDir = null;
		if (context == null) {
			tempDir = FileUtil.getTempDir();
		} else {
			tempDir = FileUtil.getTempDir(FileUtil.getContextPathToRelativePath(context.getContextPath()));
		}
		// [#5107][v3.1] バッチ起動対応 2018.11.09 kawana End
		File tempFile = null;

		while (tempFileNm == null) {
			tempFileNm = UUID.randomUUID().toString();
			tempFile = new File(tempDir, tempFileNm + EXT);
			if (tempFile.exists()) {
				tempFileNm = null;
			}
		}

		ICsvListWriter listWriter = null;
		try {

			// 出力ファイルを作成
			String tempFileName = tempFile.getPath();
			FileOutputStream fos = new FileOutputStream(tempFileName, false);

			// [ON推-品向-792] 文字コードをマスタから設定 2015.04.22 kawana Start
			if (StandardCharsets.UTF_8.name().toLowerCase().equals(charsets.toLowerCase())) {
				// BOM付与
				fos.write(0xef);
				fos.write(0xbb);
				fos.write(0xbf);
				fos.flush();
			}

			OutputStreamWriter fileWriter = new OutputStreamWriter(fos, charsets);
			// [ON推-品向-792] 文字コードをマスタから設定 2015.04.22 kawana End
			listWriter = new CsvListWriter(fileWriter, CsvPreference.STANDARD_PREFERENCE);

			for (List<String> rowData : writeData) {

				List<Object> csvData = new ArrayList<Object>();

				for (String value : rowData) {

					if (value == null) {
						csvData.add("");
					} else {
						csvData.add(value);
					}
				}
				listWriter.write(csvData);
			}

			// [ON推-品向-792] 例外のcatchを削除 2015.04.22 kawana
		} finally {
			if (listWriter != null) {
				try {
					listWriter.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		return tempFile;
		// [ON推-品向-470] ファイル出力の処理を共通処理の流れに踏襲(Linuxで動作しない問題を改修) 2014.12.24 kawana End

		// [ON推-品向-792] 例外のcatchを削除 2015.04.22 kawana
	}
	// [ON推-品向-033] プロパティファイルの内容取得を修正 2014.11.20 xiangy End
}
