package com.oneslogi.wms.logic.master;

import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.exbhv.MCarrierSlipSgwBhv;
import com.oneslogi.base.dbflute.exentity.MCarrierSlipSgw;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 佐川送り状マスタメンテナンス登録ロジッククラス
 */
public class CarrierSlipSgwMasterInsertLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private MCarrierSlipSgwBhv mCarrierSlipSgwBhv;

	/**
	 * <h2>佐川送り状マスタデータを登録する。</h2>
	 * <pre>
	 *
	 * 佐川送り状マスタのデータを登録する。
	 * </pre>
	 * @param mCarrierSlipSgw 佐川送り状マスタ：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void insert(MCarrierSlipSgw mCarrierSlipSgw, ErrorStatus errSts) {
		// ===== 佐川送り状マスタ登録実行 =====
		mCarrierSlipSgwBhv.insert(mCarrierSlipSgw);
	}
	/**
	 * <h2>佐川送り状マスタリストデータを一括登録する。</h2>
	 * <pre>
	 *
	 * 佐川送り状マスタリストのデータを一括登録する。
	 *</pre>
	 * @param mCarrierSlipSgw 佐川送り状マスタリスト：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void batchInsert(List<MCarrierSlipSgw> mCarrierSlipSgw, ErrorStatus errSts) {
		// ===== 佐川送り状マスタ登録実行 =====
		mCarrierSlipSgwBhv.batchInsert(mCarrierSlipSgw);
	}

}