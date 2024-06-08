package com.oneslogi.wms.logic.master;

import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.exbhv.MCarrierSlipYmtBhv;
import com.oneslogi.base.dbflute.exentity.MCarrierSlipYmt;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * ヤマト送り状マスタメンテナンス登録ロジッククラス
 */
public class CarrierSlipYmtMasterInsertLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private MCarrierSlipYmtBhv mCarrierSlipYmtBhv;

	/**
	 * <h2>ヤマト送り状マスタデータを登録する。</h2>
	 * <pre>
	 *
	 * ヤマト送り状マスタのデータを登録する。
	 *</pre>
	 * @param mCarrierSlipYmt ヤマト送り状マスタ：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void insert(MCarrierSlipYmt mCarrierSlipYmt, ErrorStatus errSts) {
		// ===== ヤマト送り状マスタ登録実行 =====
		mCarrierSlipYmtBhv.insert(mCarrierSlipYmt);
	}

	/**
	 * <h2>ヤマト送り状マスタリストデータを一括登録する。</h2>
	 * <pre>
	 *
	 * ヤマト送り状マスタリストのデータを一括登録する。
	 *  </pre>
	 * @param mCarrierSlipYmt ヤマト送り状マスタリスト：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void batchInsert(List<MCarrierSlipYmt> mCarrierSlipYmt, ErrorStatus errSts) {
		// ===== ヤマト送り状マスタ登録実行 =====
		mCarrierSlipYmtBhv.batchInsert(mCarrierSlipYmt);
	}

}