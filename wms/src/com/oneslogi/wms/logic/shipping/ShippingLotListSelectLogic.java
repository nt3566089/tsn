package com.oneslogi.wms.logic.shipping;

import java.util.List;

import javax.inject.Inject;

import org.dbflute.cbean.scoping.SubQuery;

import com.oneslogi.base.dbflute.cbean.TAllocLotCB;
import com.oneslogi.base.dbflute.cbean.TLastLotCB;
import com.oneslogi.base.dbflute.exbhv.TLastLotBhv;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MCustomer;
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.base.dbflute.exentity.TLastLot;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 最終ロット管理データ取得ロジッククラス
 */
public class ShippingLotListSelectLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private TLastLotBhv tLastLotBhv;

	/**
	 * <h2>最終ロット管理データを取得する。</h2>
	 * <pre>
	 * 引数を条件にデータベースから最終ロット管理データを取得する。
	 *
	 * 検索対象が見つからない場合、
	 * ０件エラーをエラーステータスに設定する。
	 * </pre>
	 * @param mClient 荷主マスタ：荷主ID
	 * @param mProduct 商品マスタ：商品CD
	 * @param mCustomer 取引先マスタ：取引先CD
	 * @param errSts エラー時に設定するエラーステータス
	 * @return List<TLastLot>  最終ロット管理リスト
	 */
	public List<TLastLot> select(MClient mClient, MProduct mProduct, MCustomer mCustomer, ErrorStatus errSts) {

		List<TLastLot> result = null;
		// ===== 最終ロット管理データ取得  =====

		// 検索条件の設定
		TLastLotCB cb = tLastLotBhv.newMyConditionBean();

		cb.setupSelect_MProduct();
		cb.setupSelect_MProduct().withMClient();
		cb.setupSelect_MCustomer();
		cb.setupSelect_TLot();
		// 荷主IDの設定
		cb.query().queryMProduct().queryMClient().setClientId_Equal(mClient.getClientId());

		// [#1517] 出荷期限日一覧の不要な項目 (センタCDでの絞込みを削除) 2017.04.18 kawana

		// 出荷日の最大値を抽出
		cb.specify().specifyTLot().derivedTAllocLotList().max(new SubQuery<TAllocLotCB>() {
			@Override
			public void query(TAllocLotCB subCB) {
				subCB.specify().specifyTAllocInstB().specifyTAllocInstH().columnShippingDt();
				setDelFlg(subCB);

			}
		}, TLastLot.TAIH_shippingDt);

		// 商品CDの設定
		cb.query().queryMProduct().setProductCd_PrefixSearch(mProduct.getProductCd());
		//取引先CD
		cb.query().queryMCustomer().setCustomerCd_PrefixSearch(mCustomer.getCustomerCd());
		cb.query().queryMCustomer().setDeliveryFlg_Equal_$1();
		// ソート順の設定
		cb.query().queryMProduct().addOrderBy_ProductCd_Asc();
		cb.query().queryMCustomer().addOrderBy_CustomerCd_Asc();


		// ===== 最終ロット管理検索実行 =====
		result = tLastLotBhv.selectList(cb);

		// ===== ０件チェック =====
		if (result.size() == 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
		}

		return result;
	}
}