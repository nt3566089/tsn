package com.oneslogi.wms.logic.master;

import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.exbhv.MCarrierSlipYupkBhv;
import com.oneslogi.base.dbflute.exentity.MCarrierSlipYupk;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * ゆうパック送り状マスタメンテナンス登録ロジッククラス
 */
public class CarrierSlipYupkMasterInsertLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private MCarrierSlipYupkBhv mCarrierSlipYupkBhv;

	/**
	 * <h2>ゆうパック送り状マスタデータを登録する。</h2>
	 * <pre>
	 *
	 * ゆうパック送り状マスタのデータを登録する。
	 * </pre>
	 * @param mCarrierSlipYupk ゆうパック送り状マスタ：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void insert(MCarrierSlipYupk mCarrierSlipYupk, ErrorStatus errSts) {
		// ===== ゆうパック送り状マスタ登録実行 =====
		mCarrierSlipYupkBhv.insert(mCarrierSlipYupk);
	}

	/**
	 * <h2>ゆうパック送り状マスタリストデータを一括登録する。</h2>
	 * <pre>
	 *
	 * ゆうパック送り状マスタリストのデータを一括登録する。
	 * </pre>
	 * @param mCarrierSlipYupk ゆうパック送り状マスタリスト：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void batchInsert(List<MCarrierSlipYupk> mCarrierSlipYupk, ErrorStatus errSts) {
		// ===== ゆうパック送り状マスタ登録実行 =====
		mCarrierSlipYupkBhv.batchInsert(mCarrierSlipYupk);
	}

}