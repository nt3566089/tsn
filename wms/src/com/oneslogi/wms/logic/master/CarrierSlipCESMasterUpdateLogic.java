package com.oneslogi.wms.logic.master;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.exbhv.MCarrierSlipCesBhv;
import com.oneslogi.base.dbflute.exentity.MCarrierSlipCes;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * キャリアEDIシステム送り状マスタメンテナンス更新ロジッククラス
 */
public class CarrierSlipCESMasterUpdateLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private MCarrierSlipCesBhv mCarrierSlipCesBhv;
	/**
	 * <h2>キャリアEDIシステム送り状マスタを更新する。</h2>
	 * <pre>
	 *
	 * 引数のキャリアEDIシステム送り状マスタを更新する。
	 *
	 * </pre>
	 * @param mCarrierSlipCes キャリアEDIシステム送り状マスタ：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */

	public void update(MCarrierSlipCes mCarrierSlipCes, ErrorStatus errSts) {

		// ===== キャリアEDIシステム送り状マスタ更新実行 =====
		mCarrierSlipCesBhv.update(mCarrierSlipCes);

	}
}
