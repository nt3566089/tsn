package com.oneslogi.wms.batch;

import org.slf4j.Logger;

import com.oneslogi.base.batch.AbstractBatch;
import com.oneslogi.base.logger.CommonLogger;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.BaseContextInitializer;

/**
 * WMS共通のバッチ基底クラス
 * ・[バグ #14][バッチ処理でログインユーザの情報が参照できない] 2016.10.3 inoue
 * @author at.inoue.hx
 *
 */
abstract public class AbstractWmsBatch extends AbstractBatch {
	private Logger logger = CommonLogger.getLogger(this.getClass());

	/**
	 * 開始準備
	 */
	@Override
	protected Integer startup() {
		// BaseContextの初期化を行う。
		BaseContextInitializer.initialize();

		// バッチ実行ユーザCDの取得
		String userCd = initializeExecuteUserCd();

		logger.debug("userCd={}", userCd);

		// バッチ実行ユーザCDの設定
		if (!CU.isNullOrEmpty(userCd)) {
			setUserCd(userCd);
		}

		return super.startup();
	}

	/**
	 * バッチ実行ユーザの返却
	 * ・このメソッドが返却するユーザCDがバッチの実行ユーザになります。
	 * @return ユーザCD
	 */
	protected String initializeExecuteUserCd() {
		return super.getKeyValueArgs().get("userCd");
	}

}
