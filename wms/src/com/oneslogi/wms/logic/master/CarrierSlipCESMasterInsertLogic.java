package com.oneslogi.wms.logic.master;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.cbean.MCustomerCB;
import com.oneslogi.base.dbflute.exbhv.MCarrierSlipCesBhv;
import com.oneslogi.base.dbflute.exbhv.MCustomerBhv;
import com.oneslogi.base.dbflute.exentity.MCarrierSlipCes;
import com.oneslogi.base.dbflute.exentity.MCustomer;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 *キャリアEDIシステム送り状マスタ登録ロジッククラス
 */
public class CarrierSlipCESMasterInsertLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private MCarrierSlipCesBhv mCarrierSlipCesBhv;
	@Inject
	private MCustomerBhv mCustomerBhv;

	/**
	 * <h2>キャリアEDIシステム送り状マスタを登録する。</h2>
	 * <pre>
	 * 引数のキャリアEDIシステム送り状マスタを登録する。
	 *
	 * </pre>
	 * @param mCarrierSlipCes キャリアEDIシステム送り状マスタ
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void insert(MCarrierSlipCes mCarrierSlipCes, ErrorStatus errSts) {

		// =====キャリアEDIシステム送り状マスタ登録実行 =====
		mCarrierSlipCesBhv.insert(mCarrierSlipCes);
	}

	/**
	 * <h2>キャリアEDIシステム送り状マスタデータを取得する。</h2>
	 * <pre>
	 * 引数を検索条件にデータベースからキャリアEDIシステム送り状マスタデータを取得する。
	 * 対象が見つからない場合はNULLを返すと共に、
     * ０件エラーをエラーステータスに設定する。
	 * </pre>
	 * @param header 取引先CD・荷主CD
	 * @param errSts エラー時に設定するエラーステータス
	 * @return MCarrierSlipCes キャリアEDIシステム送り状マスタリスト
	 */
	public MCustomer selectByCd(MCarrierSlipCes mCarrierSlipCes) {

		// ===== キャリアEDIシステム送り状マスタデータ取得 =====

		// 削除フラグ自動検索無効化
		this.setBehaviorAutoDelFlg(false);

		// 検索条件の設定
		MCustomerCB cb = mCustomerBhv.newMyConditionBean();
		cb.setupSelect_MClient();
		// 取引先IDの設定
		cb.query().setCustomerCd_Equal(mCarrierSlipCes.getCustomerCd());
		//
		cb.query().queryMClient().setClientCd_Equal(mCarrierSlipCes.getClientCd());

		// ===== キャリアEDIシステム送り状マスタ検索実行 =====
		MCustomer result = mCustomerBhv.selectEntity(cb);

		// 削除フラグ自動検索有効化
		this.setBehaviorAutoDelFlg(true);

		// ===== ０件チェック =====
		if (result== null) {
			// 削除フラグ自動検索有効化
			this.setBehaviorAutoDelFlg(true);
			return null;
		}

		return result;
	}

}