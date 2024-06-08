package com.oneslogi.wms.logic.master;

import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.exbhv.MWebHtInfoBhv;
import com.oneslogi.base.dbflute.exentity.MWebHtInfo;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 *WEBHT管理マスタメンテナンス登録ロジッククラス
 */
public class WebHTinfoMasterInsertLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private MWebHtInfoBhv mWebHtInfoBhv;

	/**
	 * <h2>WEBHT管理マスタを登録する。</h2>
	 * <pre>
	 * 引数のWEBHT管理マスタを登録する。
	 *
	 * </pre>
	 * @param mWebHtInfo WEBHT管理マスタ
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void insert(MWebHtInfo mWebHtInfo, ErrorStatus errSts) {

		// =====WEBHT管理マスタ登録実行 =====
		mWebHtInfoBhv.insert(mWebHtInfo);
	}

	/**
	 * <h2>WEBHT管理マスタを一括登録する。</h2>
	 * <pre>
	 * 引数のWEBHT管理マスタを一括登録する。
	 * </pre>
	 * @param mWebHtInfoList WEBHT管理マスタリスト
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void batchInsert(List<MWebHtInfo> mWebHtInfoList, ErrorStatus errSts) {
		// =====WEBHT管理マスタ登録実行 =====
		mWebHtInfoBhv.batchInsert(mWebHtInfoList);
	}

}