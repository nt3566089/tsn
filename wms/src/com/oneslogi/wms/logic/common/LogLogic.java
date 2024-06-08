package com.oneslogi.wms.logic.common;

import java.util.List;
import java.util.Map;

import com.oneslogi.base.exception.BaseException;
import com.oneslogi.base.exception.CommonException;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 運用ログ共通ロジッククラス
 */
public class LogLogic extends AbstractWmsLogic {

	/**
	 * <h2>業務エラーのログ追加.</h2>
	 * <pre>
	 * エラー管理クラスに登録されているエラーを運用ログに追加する。
	 * </pre>
	 */
	public void addErrorManagerLog() {

		Map<Integer, BaseException> errMap = getErrorManager().get();
		for (BaseException err : errMap.values()) {
			if (err instanceof CommonException) {
				String messageCd = ((CommonException) err).getMessageCd();
				List<String> replaceValue = ((CommonException) err).getReplaceValue();

				getDatabaseLogger().addErrorLogDtl(messageCd, replaceValue.toArray(new String[replaceValue.size()]));
			}
		}
	}

	/**
	 * <h2>業務エラーによりログ終了.</h2>
	 * <pre>
	 * エラー管理クラスに登録されているエラーを運用ログに追加して
	 * 運用ログを終了する。
	 * </pre>
	 */
	public void endLogAddErrorManagerLog() {
		addErrorManagerLog();
		getDatabaseLogger().endFailureLog();
	}
}
