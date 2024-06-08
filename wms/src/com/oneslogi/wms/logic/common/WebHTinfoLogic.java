package com.oneslogi.wms.logic.common;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.cbean.MWebHtInfoCB;
import com.oneslogi.base.dbflute.exbhv.MWebHtInfoBhv;
import com.oneslogi.base.dbflute.exentity.MWebHtInfo;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * WEBHT管理マスタ共通ロジッククラス
 */
public class WebHTinfoLogic extends AbstractWmsLogic {

	@Inject
	private MWebHtInfoBhv mWebHtInfoBhv;

	/**
	 * <h2>登録時MACアドレス重複チェック処理を行う。</h2>
	 * <pre>
	 * 引数を条件にWEBHT管理マスタのデータを検索し、
	 * 検索件数が1件以上の場合、重複エラーをエラー情報として管理する。
	 * </pre>
	 * @param mWebHtInfo WEBHT管理マスタ：MACアドレス
	 * @param errSts エラー時に設定するエラーステータス
	 * @return boolean (true:WEBHT管理マスタ重複)
	 */
	public boolean checkMacAddressInsert(MWebHtInfo mWebHtInfo, ErrorStatus errSts) {
		MWebHtInfoCB cb = mWebHtInfoBhv.newMyConditionBean();
		// 削除フラグ自動検索無効化
		this.setBehaviorAutoDelFlg(false);
		cb.checkInvalidQuery();
		if (mWebHtInfo.getMacAddress() != null) {
			cb.query().setMacAddress_Equal(mWebHtInfo.getMacAddress());
		} else {
			cb.query().setMacAddress_IsNull();
		}
		int count = mWebHtInfoBhv.selectCount(cb);
		// 削除フラグ自動検索有効化
		this.setBehaviorAutoDelFlg(true);

		if (count > 0) {
			this.getErrorManager().add(errSts, "alreadyRegisteredCannotRegisterError");
			return true;
		}
		return false;
	}

	/**
	 * <h2>更新時MACアドレス重複チェック処理を行う。</h2>
	 * <pre>
	 * 引数を条件にWEBHT管理マスタのデータを検索し、
	 *
	 * </pre>
	 * @param mWebHtInfo WEBHT管理マスタ：MACアドレス
	 * @param errSts エラー時に設定するエラーステータス
	 * @return boolean (true:WEBHT管理マスタ重複)
	 */
	public boolean checkMacAddressUpdate(MWebHtInfo mWebHtInfo, ErrorStatus errSts) {
		MWebHtInfoCB cb = mWebHtInfoBhv.newMyConditionBean();

		// 削除フラグ自動検索無効化
		this.setBehaviorAutoDelFlg(false);
		cb.checkInvalidQuery();
		if (mWebHtInfo.getMacAddress() != null) {
			cb.query().setMacAddress_Equal(mWebHtInfo.getMacAddress());
		} else {
			cb.query().setMacAddress_IsNull();
		}
		MWebHtInfo webHtInfo = mWebHtInfoBhv.selectEntity(cb);

		// 削除フラグ自動検索有効化
		this.setBehaviorAutoDelFlg(true);

		if (webHtInfo != null &&
				!CU.isNotNullAndEquals(webHtInfo.getWebHtInfoId(), mWebHtInfo.getWebHtInfoId())) {
			this.getErrorManager().add(errSts, "alreadyRegisteredCannotRegisterError");
			return true;
		}
		return false;
	}

}
