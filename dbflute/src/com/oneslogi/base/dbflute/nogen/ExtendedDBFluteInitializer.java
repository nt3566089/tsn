package com.oneslogi.base.dbflute.nogen;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.dbflute.dbway.DBDef;
import org.dbflute.jdbc.StatementConfig;

import com.oneslogi.base.dbflute.allcommon.DBFluteConfig;
import com.oneslogi.base.dbflute.allcommon.DBFluteInitializer;

public class ExtendedDBFluteInitializer extends DBFluteInitializer {

	// [#2181] 検索時のフェッチサイズを設定 2017.08.02 kawana Start

	/** Entity制御時のフェッチサイズ */
	private static Integer entitySelectFetchSize = null;
	/** 外出SQLによるAutoPaging制御時のフェッチサイズ */
	private static Integer autoPagingSelectFetchSize = null;
	/** カーソル制御時のフェッチサイズ */
	private static Integer cursorSelectFetchSize = null;
	/** 既定のフェッチサイズ */
	private static Integer defaultFetchSize = null;
	/** Oracleワイルドカード問題回避判定 */
	private static boolean oracleWildcardMultibyteChar = false;

	/**
	 * 初期化処理
	 * ・[dbcp.properties]ファイルより、データベース接続情報を取得
	 * @throws Exception
	 */
	static {
		Properties prop = new Properties();
		InputStream is = ExtendedDBFluteInitializer.class.getClassLoader().getResourceAsStream("dbcp.properties");
		try {
			prop.load(is);

			String entitySelectFetchSizeStr = prop.getProperty("entitySelectFetchSize");
			if (entitySelectFetchSizeStr != null) {
				entitySelectFetchSize = Integer.valueOf(entitySelectFetchSizeStr);
			}

			String autoPagingSelectFetchSizeStr = prop.getProperty("autoPagingSelectFetchSize");
			if (autoPagingSelectFetchSizeStr != null) {
				autoPagingSelectFetchSize = Integer.valueOf(autoPagingSelectFetchSizeStr);
			}

			String cursorSelectFetchSizeStr = prop.getProperty("cursorSelectFetchSize");
			if (cursorSelectFetchSizeStr != null) {
				cursorSelectFetchSize = Integer.valueOf(cursorSelectFetchSizeStr);
			}

			String defaultFetchSizeStr = prop.getProperty("defaultFetchSize");
			if (defaultFetchSizeStr != null) {
				defaultFetchSize = Integer.valueOf(defaultFetchSizeStr);
			}

			String oracleWildcardMultibyteCharStr = prop.getProperty("oracleWildcardMultibyteChar");
			if (oracleWildcardMultibyteCharStr != null) {
				oracleWildcardMultibyteChar = Boolean.valueOf(oracleWildcardMultibyteCharStr);
			}

			is.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// [#2181] 検索時のフェッチサイズを設定 2017.08.02 kawana End

	/**
	 * DBFlute初期化メソッドのオーバーライド
	 */
	@Override
	protected void prologue() {
		super.prologue();

		DBFluteConfig config = DBFluteConfig.getInstance();
		config.unlock();

		// [#2181] 検索時のフェッチサイズを設定 2017.08.02 kawana Start

		// ===== フェッチサイズの設定 =====

		// Entity制御時のフェッチサイズ
		if (entitySelectFetchSize != null) {
			if (entitySelectFetchSize.intValue() == -1) {
				config.setEntitySelectFetchSize(Integer.MIN_VALUE);
			} else {
				config.setEntitySelectFetchSize(entitySelectFetchSize);
			}
		}

		// 外出SQLによるAutoPaging制御時のフェッチサイズ
		if (autoPagingSelectFetchSize != null) {
			if (autoPagingSelectFetchSize.intValue() == -1) {
				config.setFixedPagingByCursorSkipSynchronizedFetchSize(Integer.MIN_VALUE);
			} else {
				config.setFixedPagingByCursorSkipSynchronizedFetchSize(autoPagingSelectFetchSize);
			}
		}

		// カーソル制御時のフェッチサイズ
		if (cursorSelectFetchSize != null) {
			if (cursorSelectFetchSize.intValue() == -1) {
				config.setCursorSelectFetchSize(Integer.MIN_VALUE);
			} else {
				config.setCursorSelectFetchSize(cursorSelectFetchSize);
			}
		}

		// 既定のフェッチサイズ
		if (defaultFetchSize != null) {
			StatementConfig sc = new StatementConfig();
			if (defaultFetchSize.intValue() == -1) {
				sc.fetchSize(Integer.MIN_VALUE);
			} else {
				sc.fetchSize(defaultFetchSize);
			}
			config.setDefaultStatementConfig(sc);
		}

		// [#2181] 検索時のフェッチサイズを設定 2017.08.02 kawana End

		// ===== 暗号化・復号化クラスの適用 =====

		config.setGearedCipherManager(WmsGearedCipherManagerMaker.getGearedCipherManager());

		config.lock();

		// 【全角％、全角＿】旧ワイルドカード文字向けエスケープ処理による致命的エラー対応
		// Oracle Database 11gR2 11.2.0.4以上から当問題が発生する為、エラー回避処理として実装
		if (!oracleWildcardMultibyteChar) {
			DBDef.Oracle.unlock();
			DBDef.Oracle.switchDBWay(new WayOfOracleExt());
			DBDef.Oracle.lock();
		}

	}
}
