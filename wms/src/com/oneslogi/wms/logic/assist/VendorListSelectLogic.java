package com.oneslogi.wms.logic.assist;

import javax.inject.Inject;

import org.dbflute.cbean.result.PagingResultBean;
import org.dbflute.cbean.coption.LikeSearchOption;

import com.oneslogi.base.dbflute.cbean.MCustomerCB;
import com.oneslogi.base.dbflute.exbhv.MCustomerBhv;
import com.oneslogi.base.dbflute.exentity.MCustomer;
import com.oneslogi.base.dto.PagingDto.PagingData;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 仕入先マスタデータ取得ロジッククラス
 */
public class VendorListSelectLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private MCustomerBhv mCustomerBhv;

	/**
	 * <h2>仕入先マスタデータを取得する。</h2>
	 * <pre>
	 * 引数を条件にデータベースから取引先マスタデータを取得する。
	 * 検索対象が見つからない場合、０件エラーをエラーステータスに設定する。
	 * </pre>
	 * @param header 取引先マスタ：荷主ID・取引先CD・取引先名称
	 * @param paging ページ検索の設定
	 * @param errSts エラー時に設定するエラーステータス
	 * @return PagingResultBean<MCustomer> 取引先マスタリスト
	 */
	public PagingResultBean<MCustomer> select(MCustomer header, PagingData paging, ErrorStatus errSts) {

		PagingResultBean<MCustomer> result = null;

		// ===== 仕入先データ取得 =====

		// 検索条件の設定
		MCustomerCB cb = mCustomerBhv.newMyConditionBean();

		//荷主センタ変更対応 201７.02.09 sja Start
		cb.setupSelect_MClient();
		//荷主センタ変更対応 201７.02.09 sja 	End
		
		// 荷主IDの設定
		cb.query().setClientId_Equal(header.getClientId());

		// 取引先CDの設定
		cb.query().setCustomerCd_PrefixSearch(header.getCustomerCd());

		// 取引先名称の設定
		cb.query().setCustomerNm_LikeSearch(header.getCustomerNm(),new LikeSearchOption().likeContain());

		// 仕入先フラグの設定
		cb.query().setVendorFlg_Equal_$1();

		// ソート順の設定
		cb.query().addOrderBy_CustomerCd_Asc();

		// 検索処理
		result = selectPage(mCustomerBhv, cb, paging);

		// ===== ０件チェック =====
		if (result.size() == 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
		}

		return result;
	}
}