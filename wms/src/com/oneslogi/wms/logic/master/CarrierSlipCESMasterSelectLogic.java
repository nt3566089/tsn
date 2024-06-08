////////////////////////////////////////////////////////////////////////////////
// Date:
//     Wed Nov 18 13:27:58 CST 2015
// changed by:coverage tool (Language:Java, Version :08-02)
////////////////////////////////////////////////////////////////////////////////
package com.oneslogi.wms.logic.master;
import javax.inject.Inject;

import org.dbflute.cbean.result.PagingResultBean;

import com.oneslogi.base.dbflute.cbean.MCarrierSlipCesCB;
import com.oneslogi.base.dbflute.exbhv.MCarrierSlipCesBhv;
import com.oneslogi.base.dbflute.exentity.MCarrierSlipCes;
import com.oneslogi.base.dto.PagingDto.PagingData;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * キャリアEDIシステム送り状マスタ取得ロジッククラス
 */
public class CarrierSlipCESMasterSelectLogic extends AbstractWmsLogic {

	//===== 使用テーブル =====
	@Inject
	private MCarrierSlipCesBhv mCarrierSlipCesBhv;

	/**
	 * <h2>キャリアEDIシステム送り状マスタメンテナンスデータを取得する。</h2>
	 * <pre>
	 * 引数をキーにデータベースからキャリアEDIシステム送り状マスタメンテナンス情報を取得する。
	 * 検索対象が見つからない場合はNULLを返すと共に、
     * ０件エラーをエラーステータスに設定する。
	 * </pre>
	 * @param mCarrierSlipCes キャリアEDIシステム送り状マスタ：削除フラグ・荷主CD・取引先CD
	 * @param paging ページ検索の設定
	 * @param errSts エラー時に設定するエラーステータス
	 * @return PagingResultBean<MCarrierSlipCes> キャリアEDIシステム送り状マスタリスト
	 */
	public PagingResultBean<MCarrierSlipCes> select(MCarrierSlipCes mCarrierSlipCes, PagingData paging, ErrorStatus errSts) {

		PagingResultBean<MCarrierSlipCes> result = null;
		//==== キャリアEDIシステム送り状マスタデータ取得 =====
		// 削除フラグ自動検索無効化
		this.setBehaviorAutoDelFlg(false);
		// 検索条件の設定
		MCarrierSlipCesCB cb = mCarrierSlipCesBhv.newMyConditionBean();
		cb.setupSelect_MCustomer().withMClient();
		//削除フラグ
		cb.setupSelect_BClassDtlByDelFlg();
		cb.setupSelect_BClassDtlByDelFlg().withVDict(getCultureId());
		// 荷主CDの設定
		cb.query().queryMCustomer().queryMClient().setClientCd_Equal(mCarrierSlipCes.getClientCd());
		// 取引先CDの設定
		cb.query().queryMCustomer().setCustomerCd_PrefixSearch(mCarrierSlipCes.getCustomerCd());
		//削除フラグの設定
		cb.query().setDelFlg_Equal(mCarrierSlipCes.getDelFlg());

		// ソート順の設定
		cb.query().queryMCustomer().addOrderBy_CustomerCd_Asc();

		// ===== キャリアEDIシステム送り状マスタ検索実行 =====
		result = selectPage(mCarrierSlipCesBhv, cb, paging);

		// 削除フラグ自動検索有効化
		this.setBehaviorAutoDelFlg(true);

		//===== ０件チェック =====
		if (result.size() == 0) {
			this.getErrorManager().add(new ErrorStatus(errSts.getStatusCd()), WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}else{
			return result;
		}
  	}

	/**
	 * <h2>キャリアEDIシステム送り状マスタデータを取得する。</h2>
	 * <pre>
	 * 引数を検索条件にデータベースからキャリアEDIシステム送り状マスタデータを取得する。
	 * 対象が見つからない場合はNULLを返すと共に、
     * ０件エラーをエラーステータスに設定する。
	 * </pre>
	 * @param header 取引先ID・センタID・荷主ID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return MCarrierSlipCes キャリアEDIシステム送り状マスタリスト
	 */
	public MCarrierSlipCes selectById(MCarrierSlipCes header, ErrorStatus errSts) {

		// ===== キャリアEDIシステム送り状マスタデータ取得 =====

		// 削除フラグ自動検索無効化
		this.setBehaviorAutoDelFlg(false);

		// 検索条件の設定
		MCarrierSlipCesCB cb = mCarrierSlipCesBhv.newMyConditionBean();
		cb.setupSelect_MCustomer().withMClient();
		// 取引先IDの設定
		cb.query().queryMCustomer().setCustomerId_Equal(header.getCustomerId());
		// ソート順の設定
		cb.query().addOrderBy_CustomerId_Asc();

		// ===== キャリアEDIシステム送り状マスタ検索実行 =====
		MCarrierSlipCes result = mCarrierSlipCesBhv.selectEntity(cb);
		// 削除フラグ自動検索有効化
		this.setBehaviorAutoDelFlg(true);

		// ===== ０件チェック =====
		if (result== null) {
			// 削除フラグ自動検索有効化
			this.setBehaviorAutoDelFlg(true);

			this.getErrorManager().add(new ErrorStatus(errSts.getStatusCd()), WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}
		// 取引先CD取得
		result.setCustomerCd(result.getMCustomer().getCustomerCd());

		return result;
	}
}
