package com.oneslogi.wms.logic.daily;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.cbean.BMessageCB;
import com.oneslogi.base.dbflute.exbhv.BMessageBhv;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 引当制御マスタ更新のロジッククラス
 */
public class AllocateControlMasterUpdateLogic extends AbstractWmsLogic {
	
	// ===== 使用テーブル =====
	@Inject
	private BMessageBhv bMessageBhv;
	
	/**
	 * <h2>ログを開始する。</h2>
	 * <pre>
	 * 運用ログの開始処理を行う。
	 * ログ出力を開始する。
	 * </pre>
	 * @param programCd プログラムCD
	 * @param centerCd 拠点CD
	 * @param clientCd 荷主CD
	 */
	public void startLog(String programCd, String centerCd, String clientCd) {

		// プログラムCD設定
		getDatabaseLogger().setPgmCd(programCd);

		// 属性１設定(拠点CD)
		if (centerCd != null) {
			getDatabaseLogger().setAttribute1(centerCd);
		}

		// 属性２設定(荷主CD)
		if (clientCd != null) {
			getDatabaseLogger().setAttribute2(clientCd);
		}

		// ログ開始
		getDatabaseLogger().startLog();
	}

	/**
	 * <h2>ログを終了（正常）する。</h2>
	 * <pre>
	 * 運用ログの終了処理を行う。
	 * 運用ログを終了する。
	 * </pre>
	 */
	public void endSuccessLog() {

		// ログ終了（正常終了）
		getDatabaseLogger().endSuccessLog();
	}

	/**
	 * <h2>ログを終了（異常）する。</h2>
	 * <pre>
	 * 運用ログの終了処理を行う。
	 * 運用ログを終了する。
	 * </pre>
	 */
	public void endFailureLog() {

		// ログ終了（異常終了）
		getDatabaseLogger().endFailureLog();
	}

	/**
	 * <h2>ログセクションを開始する。</h2>
	 * <pre>
	 * 運用ログのセクション開始処理を行う。
	 * セクションを新しく開始する。
	 * ログセクション終了メソッドが実行されるまでは、開始したセクションにログが追加される。
	 * </pre>
	 * @param sectionCd セクションCD
	 */
	public void startLogSection(String sectionCd) {

		// セクションログ開始
		getDatabaseLogger().startLogDtl(sectionCd);
	}

	/**
	 * <h2>ログセクション終了を行う。</h2>
	 * <pre>
	 * 運用ログのセクション終了処理を行う。
	 * ログセクションを終了する。
	 * </pre>
	 */
	public void endLogSection() {

		// セクションログ終了
		getDatabaseLogger().endLogDtl();
	}

	/**
	 * <h2>ログ追加（情報）を行う。</h2>
	 * <pre>
	 * 運用ログを追加する。
	 * </pre>
	 * @param messageCd メッセージCD
	 * @param replaceValue 置換文字
	 */
	public void addInfoLog(String messageCd, String... replaceValue) {

		// ログ追加（情報）
		getDatabaseLogger().addInfoLogDtl(messageCd, replaceValue);
	}

	/**
	 * <h2>ログ追加（エラー）を行う。</h2>
	 * <pre>
	 * 運用ログを追加する。
	 * </pre>
	 * @param messageCd メッセージCD
	 * @param replaceValue 置換文字
	 */
	public void addErrorLog(String messageCd, String... replaceValue) {

		// ログ追加（エラー）
		getDatabaseLogger().addErrorLogDtl(messageCd, replaceValue);
	}

	/**
	 * <h2>メッセージを取得する。</h2>
 	 * <pre>
 	 * メッセージCDをキーにメッセージを取得する。
	 * </pre>
	 * @param messageCd メッセージCD
	 * @return String メッセージ
	 */
	public String getMessage(String messageCd) {
		BMessageCB cb = bMessageBhv.newMyConditionBean();
		cb.query().setMessageCd_Equal(messageCd);
		cb.query().setCultureId_Equal(getCultureId());

		String message = bMessageBhv.selectEntity(cb).getMessageNm();

		return message;
	}

}

