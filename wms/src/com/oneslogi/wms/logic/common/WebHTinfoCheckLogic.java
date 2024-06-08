package com.oneslogi.wms.logic.common;

import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.exentity.MWebHtInfo;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * WEBHT管理マスタチェック共通ロジッククラス
 */
public class WebHTinfoCheckLogic extends AbstractWmsLogic {
	/**
	 * ステータスコード定義
	 */
	protected static class StatusCode {
		/**
		 * 正常終了
		 */
		protected static final int SUCCESS = 0;
		/**
		 * ユーザによる確認
		 */
		protected static final int CONFIRMATION = 1;
		/**
		 * MACアドレスで重複エラー
		 */
		protected static final int MACADDRESS_CODE_DUPLICATE = 2;
	}

	// ===== 使用ロジッククラス =====
	@Inject
	private WebHTinfoLogic webhtinfoLogic;

	/**
	 * <h2>WEBHT管理マスタチェック処理を行う。</h2>
	 * <pre>
	 * MACアドレス重複チェックを行う。
	 * 既に存在するとき、ステータスコードにMACアドレスで重複エラーを設定する。
	 * </pre>
	 * @param mWebhtinfotList WEBHT管理マスタリスト：MACアドレス・管理情報ID
	 *
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void checkwebhtinfoMaster(List<MWebHtInfo> mWebhtinfoList, ErrorStatus errSts) {
		int rowIndex = -1;

		// チェック処理
		for (MWebHtInfo mWebhtinfo : mWebhtinfoList) {
			rowIndex++;

			// MACアドレス重複チェック
			if (mWebhtinfo.getWebHtInfoId() == null) {
				// 登録の場合
				webhtinfoLogic.checkMacAddressInsert(mWebhtinfo, errRetSts(errSts, StatusCode.MACADDRESS_CODE_DUPLICATE, rowIndex));
			} else {
				// 修正の場合
				webhtinfoLogic.checkMacAddressUpdate(mWebhtinfo, errRetSts(errSts, StatusCode.MACADDRESS_CODE_DUPLICATE, rowIndex));

			}
		}
	}
}
