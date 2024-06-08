package com.oneslogi.ht.wms.logic.inventory;

import java.util.List;

import javax.inject.Inject;

import org.dbflute.cbean.scoping.OrQuery;

import com.oneslogi.base.dbflute.cbean.MProductCB;
import com.oneslogi.base.dbflute.exbhv.MProductBhv;
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 商品棚卸入力JAN/商品コードチェックロジッククラス
 */
public class InventoryInputProductJanCdChkLogic extends AbstractWmsLogic {


	// ===== 使用テーブル =====
	@Inject
	private MProductBhv mProductBhv;

	/**
	 * <h2>JAN/商品CDのチェックを行う。</h2>
	 * <pre>
	 * 引数を条件に商品マスタからデータを検索し、
	 * 検索結果がある場合、商品マスタのデータを返却する。
	 * ※商品CD或いはJANCDが、引数のJANCDと等しいデータを検索する。
	 *
	 * 検索対象が見つからない場合、商品未存在エラーをエラーステータスに設定する。
	 * </pre>
	 * @param mProduct 商品マスタ：荷主ID・JANCD/商品CD
	 * @return List<MProduct> 商品マスタリスト
	 */
	public List<MProduct> checkJanProdCd(MProduct mProduct) {
		//商品マスタのデータ取得
		MProductCB mProductCB = mProductBhv.newMyConditionBean();
		final String janCd = mProduct.getJanCd();
		mProductCB.query().setClientId_Equal(mProduct.getClientId());
		mProductCB.orScopeQuery(new OrQuery<MProductCB>() {
			public void query(MProductCB orCB) {
				orCB.query().setJanCd_Equal(janCd);
				orCB.query().setProductCd_Equal(janCd);
			}
		});

		List<MProduct> lstmProduct = mProductBhv.selectList(mProductCB);

		if (lstmProduct.size() == 0) {
			//該当データが存在しません。
			//getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_DATA_NOT_FOUND_ERROR);
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.PRODUCT_NOT_FOUND_ERROR);
			return lstmProduct;
		}

		return lstmProduct;

	}
}