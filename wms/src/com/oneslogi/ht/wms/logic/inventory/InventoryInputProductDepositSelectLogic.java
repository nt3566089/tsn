package com.oneslogi.ht.wms.logic.inventory;

import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.cbean.MCustomerCB;
import com.oneslogi.base.dbflute.dto.MClientDto;
import com.oneslogi.base.dbflute.exbhv.MCustomerBhv;
import com.oneslogi.base.dbflute.exentity.MCustomer;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 商品棚卸入力預託データ取得ロジッククラス
 */
public class InventoryInputProductDepositSelectLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	/* 取引先マスタ     */
	@Inject
	private MCustomerBhv mCustomerBhv;

	/**
	 * <h2>取引先マスタのデータを取得する。</h2>
	 * <pre>
	 * 引数を条件に取引先マスタから預託データを検索し、
	 * 検索結果がある場合、預託データを返却する。
	 *
	 * 検索対象が見つからない場合、０件エラーをエラーステータスに設定する。
	 * </pre>
	 * @param mClientDto 荷主マスタ：荷主ID
	 * @return List<MCustomer> 取引先マスタリスト
	 */
	public List<MCustomer> selectList(MClientDto mClientDto) {

		//取引先マスタテーブルのデータ取得
		MCustomerCB mCustomerCB = mCustomerBhv.newMyConditionBean();
		mCustomerCB.query().setDepositFlg_Equal_$1();
		mCustomerCB.query().setClientId_Equal(mClientDto.getClientId());

		mCustomerCB.query().addOrderBy_CustomerCd_Asc();

		List<MCustomer> lstMCustomer = mCustomerBhv.selectList(mCustomerCB);

		if (lstMCustomer.size() == 0) {
			//該当データが存在しません。
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_DATA_NOT_FOUND_ERROR);
			return lstMCustomer;
		}

		return lstMCustomer;
	}
}