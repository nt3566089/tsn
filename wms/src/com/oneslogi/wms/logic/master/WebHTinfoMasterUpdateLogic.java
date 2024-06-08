package com.oneslogi.wms.logic.master;

import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.exbhv.MWebHtInfoBhv;
import com.oneslogi.base.dbflute.exentity.MWebHtInfo;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * WEBHT管理マスタメンテナンス更新ロジッククラス
 */
public class WebHTinfoMasterUpdateLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private MWebHtInfoBhv mWebHtInfoBhv;

	/**
	 * <h2>WEBHT管理マスタを更新する。</h2>
	 * <pre>
	 *
	 * 引数のWEBHT管理マスタを更新する。
	 *
	 * </pre>
	 * @param mWebHtInfo WEBHT管理マスタ：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */

	public void update(MWebHtInfo mWebHtInfo, ErrorStatus errSts) {

		// ===== WEBHT管理マスタ更新実行 =====
		mWebHtInfoBhv.update(mWebHtInfo);

	}

	/**
	 * <h2>WEBHT管理マスタを一括更新する。</h2>
	 * <pre>
	 *
	 * 引数のWEBHT管理マスタを一括更新する。
	 *
	 * </pre>
	 * @param mWebHtInfoList WEBHT管理マスタリスト：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */

	public void batchUpdate(List<MWebHtInfo> mWebHtInfoList, ErrorStatus errSts) {

		// ===== WEBHT管理マスタ更新実行 =====
		mWebHtInfoBhv.batchUpdateNonstrict(mWebHtInfoList);

	}
}
