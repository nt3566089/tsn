package com.oneslogi.wms.logic.common;

import java.lang.reflect.Method;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.cbean.BMessageCB;
import com.oneslogi.base.dbflute.exbhv.BMessageBhv;
import com.oneslogi.base.exception.CommonException;
import com.oneslogi.base.exception.ErrorManager;
import com.oneslogi.base.util.CommonUtil;
import com.oneslogi.wms.WmsConst;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.dto.common.DataInputDto;

/**
 * 初期データ取込共通ロジッククラス
 */
public class DataInputLogic extends AbstractWmsLogic {

	private final static String FIELD_ERROR_FLG = "ErrorFlg";
	private final static String FIELD_ERROR_MSG = "ErrorMsg";

	// ===== 使用テーブル =====
	@Inject
	protected BMessageBhv bMessageBhv;

	// [#5120][v3.1] 業務エラーの運用ログ追加処理を共通化 2018.07.25 kawana Start

	// ===== 使用ロジック =====
	@Inject
	private LogLogic logLogic;

	// [#5120][v3.1] 業務エラーの運用ログ追加処理を共通化 2018.07.25 kawana End

	/**
	 * <h2>メッセージを取得する。</h2>
 	 * <pre>
 	 * 引数をキーにメッセージ置換あとを取得する。
	 * </pre>
	 * @param messageCd メッセージCD
	 * @param replaceValue 置換の値
	 * @return String 文字列
	 */
	protected String getMessage(String messageCd, String... replaceValue) {
		BMessageCB cb = bMessageBhv.newMyConditionBean();
		cb.query().setMessageCd_Equal(messageCd);
		// [ON推-品向-913] エラーデータの時に致命的エラーとなってしまう問題を修正 2015.07.24 kawana Start
		cb.query().setCultureId_Equal(getCultureId());
		// [ON推-品向-913] エラーデータの時に致命的エラーとなってしまう問題を修正 2015.07.24 kawana End

		String message = bMessageBhv.selectEntity(cb).getMessageNm();

		message = message.replaceAll("\\[/\\]", " ");
		for (int i = 0; i < replaceValue.length; i++) {
			message = message.replaceAll("\\[" + i + "\\]", replaceValue[i]);
		}
		return message;
	}

	/**
	 * <h2>エラーメッセージの設定を行う。</h2>
	 * <pre>
	 * 引数をキーにエラーメッセージをセットする。
	 * </pre>
	 * @param entity オブジェクト
	 * @param messageCd メッセージCD
	 * @param replaceValue 置換の値
	 * @throws Exception 例外処理
	 */
	public void setErrorMessage(Object entity, String messageCd, String[] replaceValue) throws Exception {
		setErrorMessage(entity, FIELD_ERROR_FLG, FIELD_ERROR_MSG, messageCd, replaceValue);
	}

	/**
	 * <h2>エラーメッセージの設定を行う。</h2>
	 * <pre>
	 * 引数により、エラーメッセージをセットする。
	 * </pre>
	 * @param entity オブジェクト
	 * @param errorFlg エラーフラグ
	 * @param errorMsg エラーメッセージ
	 * @param messageCd メッセージCD
	 * @param replaceValue 置換の値
	 * @throws Exception 例外処理
	 */
	public void setErrorMessage(Object entity, String errorFlg, String errorMsg, String messageCd, String[] replaceValue) throws Exception {
		Method setErrorFlgMethod = entity.getClass().getMethod("set" + errorFlg, String.class);
		setErrorFlgMethod.invoke(entity, CDef.ErrorFlg.$1.code());

		Method getErrorMsgMethod = entity.getClass().getMethod("get" + errorMsg);
		String oldErrorMsg = (String) getErrorMsgMethod.invoke(entity);

		String message = getMessage(messageCd, replaceValue);
		Method setErrorMsgMethod = entity.getClass().getMethod("set" + errorMsg, String.class);
		setErrorMsgMethod.invoke(entity, CommonUtil.nullToStr(oldErrorMsg) + message);
	}

	/**
	 * <h2>エラーメッセージを設定する。</h2>
 	 * <pre>
 	 * 引数をキーにエラーメッセージを設定する。
	 * </pre>
	 * @param entity オブジェクト
	 * @param errorManager エラー管理クラス
	 * @throws Exception 例外処理
	 */
	protected void setErrorMessage(Object entity, ErrorManager errorManager) throws Exception {
		setErrorMessage(entity, FIELD_ERROR_FLG, FIELD_ERROR_MSG, errorManager, true);
	}

	/**
	 * <h2>エラーメッセージを設定する。</h2>
 	 * <pre>
 	 * 引数をキーにエラーメッセージを設定する。
	 * </pre>
	 * @param entity オブジェクト
	 * @param errorFlg エラーフラグ
	 * @param errorMsg エラーメッセージ
	 * @param errorManager エラー管理クラス
	 * @throws Exception 例外処理
	 */
	protected void setErrorMessage(Object entity, String errorFlg, String errorMsg, ErrorManager errorManager) throws Exception {
		setErrorMessage(entity, errorFlg, errorMsg, errorManager, true);
	}

	/**
	 * <h2>エラーメッセージを設定する。</h2>
 	 * <pre>
 	 * 引数をキーにエラーメッセージを設定する。
	 * </pre>
	 * @param entity オブジェクト
	 * @param errorManager エラー管理クラス
	 * @param clearErrorManager クリアエラー管理クラス
	 * @throws Exception 例外処理
	 */
	protected void setErrorMessage(Object entity, ErrorManager errorManager, boolean clearErrorManager) throws Exception {
		setErrorMessage(entity, FIELD_ERROR_FLG, FIELD_ERROR_MSG, errorManager, clearErrorManager);
	}

	/**
	 * <h2>エラーメッセージを設定する。</h2>
 	 * <pre>
 	 * 引数をキーにエラーメッセージを設定する。
 	 * clearErrorManagerがtrueの場合、ErrorManagerをクリアする。
	 * </pre>
	 * @param entity オブジェクト
	 * @param errorFlg エラーフラグ
	 * @param errorMsg エラーメッセージ
	 * @param errorManager エラー管理クラス
	 * @param clearErrorManager クリアエラー管理クラス
	 * @throws Exception 例外処理
	 */
	protected void setErrorMessage(Object entity, String errorFlg, String errorMsg, ErrorManager errorManager, boolean clearErrorManager) throws Exception {
		CommonException[] ce = errorManager.get().values().toArray(new CommonException[errorManager.size()]);
		for (int i = 0; i < errorManager.size(); i++) {
			setErrorMessage(entity, errorFlg, errorMsg, ce[i].getMessageCd(), ce[i].getReplaceValue().toArray(new String[ce[i].getReplaceValue().size()]));
		}
		if (clearErrorManager) {
			errorManager.clear();
		}
	}

	/**
	 * <h2>開始のログを設定する。</h2>
 	 * <pre>
 	 * 開始のログを設定する。
	 * </pre>
	 * @param pgmCd プログラムCD
	 */
	protected void startLog(String pgmCd) {
		getDatabaseLogger().setPgmCd(pgmCd);
		getDatabaseLogger().setAttribute1(getUserData().get(WmsConst.ONESLOGI_WMS_CENTER_CD_KEY_NAME));
		getDatabaseLogger().setAttribute2(getUserData().get(WmsConst.ONESLOGI_WMS_CLIENT_CD_KEY_NAME));
		getDatabaseLogger().startLog();
	}

	/**
	 * <h2>終了のログを設定する。</h2>
 	 * <pre>
 	 * 下記終了のログを設定する。
 	 * ・総件数
 	 * ・正常取り込み件数
 	 * ・エラー取り込み件数
	 * </pre>
	 * @param dataInputDto 入力データDTO
	 */
	protected void endLog(DataInputDto dataInputDto) {
		// ログ追加:総件数、正常取り込み件数、エラー取り込み件数
		if (dataInputDto.hasError()) {
			endWarningLog(WmsMessageConst.DATA_INPUT_REGISTER_INFORMATION,
					String.valueOf(dataInputDto.data.cntAll),
					String.valueOf(dataInputDto.data.cntSuccess),
					String.valueOf(dataInputDto.data.cntError));
		} else {
			endSuccessLog(WmsMessageConst.DATA_INPUT_REGISTER_INFORMATION,
					String.valueOf(dataInputDto.data.cntAll),
					String.valueOf(dataInputDto.data.cntSuccess),
					String.valueOf(dataInputDto.data.cntError));
		}
	}

	/**
	 * <h2>終了のワーニングのログを設定する。</h2>
 	 * <pre>
 	 * 終了のワーニングのログを設定する。
	 * </pre>
	 * @param messageCd メッセージCD
	 * @param replaceValue 置換の値
	 */
	protected void endWarningLog(String messageCd, String... replaceValue) {
		getDatabaseLogger().addWarnLogDtl(messageCd, replaceValue);
		getDatabaseLogger().endSuccessLog();
	}

	/**
	 * <h2>終了の成功のログを設定する。</h2>
 	 * <pre>
 	 * 終了の成功のログを設定する。
	 * </pre>
	 * @param messageCd メッセージCD
	 * @param replaceValue 置換の値
	 */
	protected void endSuccessLog(String messageCd, String... replaceValue) {
		getDatabaseLogger().addInfoLogDtl(messageCd, replaceValue);
		getDatabaseLogger().endSuccessLog();
	}

	// [ON推-品向-905] エラー時にログ明細が出力されない問題を修正 2015.07.22 kawana Start

	/**
	 * <h2>エラー終了のログを出力する。</h2>
	 * <pre>
	 * エラー管理クラスからエラーを取得しログ明細に出力した後、ログの終了(異常)処理を行う。
	 * </pre>
	 */
	protected void endErrorLog() {

		// [#5120][v3.1] 業務エラーの運用ログ追加処理を共通化 2018.07.25 kawana Start
		logLogic.endLogAddErrorManagerLog();
		// [#5120][v3.1] 業務エラーの運用ログ追加処理を共通化 2018.07.25 kawana End
	}

	// [ON推-品向-905] エラー時にログ明細が出力されない問題を修正 2015.07.22 kawana End
}
