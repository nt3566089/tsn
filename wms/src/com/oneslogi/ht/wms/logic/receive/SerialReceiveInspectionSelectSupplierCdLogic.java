package com.oneslogi.ht.wms.logic.receive;

import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.cbean.MCustomerCB;
import com.oneslogi.base.dbflute.exbhv.MCustomerBhv;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MCustomer;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
//import com.oneslogi.wms.;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

//[Ver3.0][#3752] シリアル系の検品という言葉を無くす 2018.03.02 shimizu Start
/**
 * シリアル登録(入荷) 仕入先検索ロジッククラス
 */
public class SerialReceiveInspectionSelectSupplierCdLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private MCustomerBhv mCustomerBhv;

	/**
	 * <h2>仕入先CD検索データ取得</h2>
	 * <pre>
	 * 引数を条件に仕入先CD検索データ取得
	 * </pre>
	 * @param mCustomerBhv 仕入先CD検索：仕入先CD
	 */
	public List<MCustomer> select(MClient mClient) {

		//取引先マスタテーブルのデータ取得
		MCustomerCB mCustomerCB = mCustomerBhv.newMyConditionBean();
		mCustomerCB.query().setVendorFlg_Equal_$1();
		mCustomerCB.query().setClientId_Equal(mClient.getClientId());

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
//[Ver3.0][#3752] シリアル系の検品という言葉を無くす 2018.03.02 shimizu End